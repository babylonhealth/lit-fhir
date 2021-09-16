package com.babylonhealth.lit

import cats.effect.unsafe.implicits.global
import cats.effect.{ ExitCode, IO, IOApp }
import cats.syntax.traverse._

import com.babylonhealth.lit.core.{ LitSeq, toUri }
import com.babylonhealth.lit.core.serdes._
import com.babylonhealth.lit.hl7.BINDING_STRENGTH
import com.babylonhealth.lit.hl7.model.{ CodeSystem, ValueSet }

trait RawGenerator extends Logging with FileUtils {
  def doRawGen(
      args: MainArgs,
      extensions: Map[String, Seq[ClassGenInfo]],
      fetchValueSet: (String, BINDING_STRENGTH) => Option[CodeValueSet]): Unit = {
    println(s"${args.modelOverrides.size} core models (including ${args.modelOverrides.take(2).mkString(" & ")})")
    println(s"${args.models.size} domain models (including ${args.models.take(2).mkString(" & ")})")
    Thread.sleep(5000L)
    Autogenerator.generateAndWriteOutput(args, extensions, fetchValueSet)
  }
}

trait DefaultPlugins extends FileUtils {
  private lazy val extensions: Map[String, Seq[ClassGenInfo]] = Map.empty.withDefaultValue(Nil)
  private def toCodeyThing(cont: ValueSet.Expansion.Contains): Seq[CodeEnum] =
    cont.contains.toSeq.flatMap(toCodeyThing) ++ (cont.code match {
      case Some(code) => Seq(CodeEnum(code, cont.display, cont.system))
      case None       => Nil
    })
  private lazy val defaultCodeSystems: Map[String, CodeSystem] =
    expandGlob("./fhir/spec/hl7.fhir.core/4.0.1/package/CodeSystem-*")
      .handleErrorWith { _ =>
        println("Could not find code systems"); sys.exit(1)
      }
      .unsafeRunSync()
      .map(getFileAsJson)
      .map(_.as[CodeSystem].fold(throw _, identity))
      .map(vs => vs.url.get -> vs)
      .toMap
  private def toCodeValueSet(vs: ValueSet): Option[CodeValueSet] = {
    val excludedSystems: Set[String] =
      vs.compose.toSeq.flatMap(_.exclude.filter(_.concept.isEmpty).flatMap(_.system)).toSet
    val excludedCodes: Set[String] = vs.compose.toSeq.flatMap(_.exclude.flatMap(_.concept.map(_.code))).toSet
    val composeIncludes            = vs.compose.toSeq.flatMap(_.include)
    def genFrom(system: String, concept: CodeSystem.Concept): Seq[CodeEnum] =
      CodeEnum(concept.code, concept.display, Some(toUri(system))) +: concept.concept.toSeq.flatMap(genFrom(system, _))
    val concepts: Seq[CodeEnum] = composeIncludes
      .collect { case s if s.system.isDefined && s.concept.isEmpty => s.system.get }
      .flatMap(s => defaultCodeSystems.get(s).toSeq.flatMap(_.concept).flatMap(genFrom(s, _)))
    val enums: Seq[CodeEnum] = vs.expansion.toSeq.flatMap(e => e.contains.flatMap(toCodeyThing))
    val enums2: Seq[CodeEnum] = composeIncludes.flatMap { i =>
      i.concept.map(c => CodeEnum(c.code, c.display, i.system))
    }
    val allConcepts = (enums ++ concepts ++ enums2)
      /// not all references will contain all the same information if, for example, one is from the codesystem and one from the valueset.
      // prefer ones with more information
      .sortBy { x => (if (x.system.isDefined) -2 else 0) + (if (x.name.isDefined) -1 else 0) }
      .map {
        if (Config.useLabelAsDisplayNameForEnums) c => c.copy(name = c.name.orElse(Some(c.stringValue))) else identity
      }
      .distinctBy(_.stringValue)
      .filterNot(c => c.system.exists(excludedSystems) || excludedCodes(c.stringValue))
    if (allConcepts.isEmpty) {
      println(s"empty enums for ${vs.url.get}")
      None
    } else {
      Some(CodeValueSet(vs.url.get, vs.url, vs.version, BINDING_STRENGTH.EXAMPLE, allConcepts.to(LitSeq).asNonEmpty, Nil, Nil))
    }
  }
  private lazy val defaultValueSets: Map[String, CodeValueSet] =
    expandGlob("./fhir/spec/hl7.fhir.core/4.0.1/package/ValueSet-*")
      .handleErrorWith { _ =>
        println("Could not find value sets"); sys.exit(1)
      }
      .unsafeRunSync()
      .map(getFileAsJson)
      .map(_.as[ValueSet]).filter(_.isRight).map(_.fold(throw _, identity))
      .flatMap(toCodeValueSet)
      .map(vs => vs.valueSet -> vs)
      .toMap

  def genPlugins: (Map[String, Seq[ClassGenInfo]], (String, BINDING_STRENGTH) => Option[CodeValueSet]) = {
    val fetchValueSets: (String, BINDING_STRENGTH) => Option[CodeValueSet] = (key, strength) =>
      defaultValueSets.get(key).orElse(defaultValueSets.get(key.split('|').head)).map(_.copy(binding = strength))
    println(s"Have instantiated ${defaultValueSets.size} value sets to inspect")
    (extensions, fetchValueSets)
  }
}

object Main extends IOApp with IOGenerator with DefaultPlugins

case class MainArgs(
    modelOverrides: Seq[SourceFile] = ArgParser
      .modelsFromString(
        "core=generator/src/main/resources/resourceModel/core/*.json;hl7=generator/src/main/resources/resourceModel/hl7/*.json")
      .handleErrorWith(t => IO(println(s"Could not find default model overrides $t")).as(Nil))
      .unsafeRunSync(),
    models: Seq[SourceFile] = Nil,
    javaPackageSuffix: Option[String] = None,
    typescriptDir: Option[String] = None,
    moduleDependencies: ModuleDependencies = ModuleDependencies(Nil),
    dryRun: Boolean = false)

object ArgParser extends ArgParser
trait ArgParser {
  def expandPaths(target: String, s: String): IO[Vector[SourceFile]] = s
    .split(',')
    .toVector
    .flatTraverse(FileUtils.expandGlob(_).map(_.toVector))
    .map(
      _.map(SourceFile(target, _))
        .flatMap {
          case x if x.file.isDirectory => x.file.listFiles().filter(!_.isDirectory).map(SourceFile(x.targetModule, _))
          case x                       => Array(x)
        }
        .filter(_.file.getName.endsWith(".json")))
  private def moduleDependenciesFromString(s: String): ModuleDependencies =
    ModuleDependencies(s.split(";").filter(_.contains('<')).map { _.split("<", 2) }.map { case Array(l, r) =>
      l.trim -> r.trim
    })
  def modelsFromString(s: String): IO[Seq[SourceFile]] = s
    .split(";")
    .toVector
    .flatTraverse { targetNPath =>
      val Array(target, pathstr) = targetNPath.split("=", 2)
      expandPaths(target, pathstr)
    }
  def modelsFromStringUnsafe(s: String): Seq[SourceFile] =
    modelsFromString(s)
      .handleErrorWith { t =>
        println(s"Cannot locate models $t"); sys.exit(1)
      }
      .unsafeRunSync()

  private val argRegex   = """^--(\w+)=["']?([^"']+)["']?$""".r
  private val noArgRegex = """^--(\w+)$""".r
  def parseArgs(args: Seq[String]): MainArgs = args.foldLeft(MainArgs()) { (args, next) =>
    next match {
      case argRegex("modelOverrides", s)     => args.copy(modelOverrides = modelsFromStringUnsafe(s))
      case argRegex("models", s)             => args.copy(models = modelsFromStringUnsafe(s))
      case argRegex("javaPackageSuffix", s)  => args.copy(javaPackageSuffix = Some(s))
      case argRegex("typescriptDir", s)      => args.copy(typescriptDir = Some(s))
      case argRegex("moduleDependencies", s) => args.copy(moduleDependencies = moduleDependenciesFromString(s))
      case argRegex("dryRun", b)             => args.copy(dryRun = b.toBoolean)
      case noArgRegex("dryRun")              => args.copy(dryRun = true)
      case x                                 => println(s"Could not parse arg $x"); sys.exit(1)
    }
  }
}

trait IOGenerator extends RawGenerator with ArgParser { this: IOApp =>
  def genPlugins: (Map[String, Seq[ClassGenInfo]], (String, BINDING_STRENGTH) => Option[CodeValueSet])
  override def run(args: List[String]): IO[ExitCode] = {
    val (extensions, fetchValueSets) = genPlugins
    args match {
      case "generate" +: args =>
        doRawGen(parseArgs(args), extensions, fetchValueSets)
      case other => println(s"cannot parse args $other")
    }
    IO(ExitCode.Success)
  }
}
