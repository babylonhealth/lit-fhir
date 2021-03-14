package com.babylonhealth.lit

import cats.effect.{ ConcurrentEffect, ExitCode, IO, IOApp, Timer }

import com.babylonhealth.lit.core.{ BINDING_STRENGTH, LitSeq, UriStr }
import com.babylonhealth.lit.core.serdes._
import com.babylonhealth.lit.hl7.model.{ CodeSystem, ValueSet }

trait RawGenerator extends Logging with FileUtils {
  def expandPaths(target: String, s: String): Seq[SourceFile] = s
    .split(',')
    .flatMap(expandGlob)
    .map(SourceFile(target, _))
    .flatMap {
      case x if x.file.isDirectory => x.file.listFiles().filter(!_.isDirectory).map(SourceFile(x.targetModule, _))
      case x                       => Array(x)
    }
    .filter(_.file.getName.endsWith(".json"))
  def doRawGen(
      coreFiles: String,
      hl7Files: String,
      modelLocations: String,
      javaDirSuffix: Option[String],
      typescriptOutputLocation: Option[String],
      moduleDependencies: ModuleDependencies,
      writeCode: Boolean,
      extensions: Map[String, Seq[ClassGenInfo]],
      fetchValueSet: (String, BINDING_STRENGTH) => Option[CodeValueSet]): Unit = {
//    println(s"|-> modelLocations = $modelLocations")
    val coreModels: Seq[SourceFile] = expandPaths("core", coreFiles)
    val hl7Models: Seq[SourceFile]  = expandPaths("hl7", hl7Files)
    val allModels: Seq[SourceFile] = modelLocations
      .split(";")
      .flatMap { targetNPath =>
        val Array(target, pathstr) = targetNPath.split("=", 2)
        expandPaths(target, pathstr)
      }
    val overridingModels = coreModels ++ hl7Models
    println(s"${overridingModels size} core models (including ${overridingModels.take(2).mkString(" & ")})")
    println(s"${allModels.size} domain models (including ${allModels.take(2).mkString(" & ")})")
    Thread.sleep(5000L)
    Autogenerator.generateAndWriteOutput(
      overridingModels,
      allModels,
      javaDirSuffix.getOrElse("_java"),
      typescriptOutputLocation,
      moduleDependencies,
      writeCode = writeCode,
      extensions,
      fetchValueSet)
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
      CodeEnum(concept.code, concept.display, Some(system)) +: concept.concept.toSeq.flatMap(genFrom(system, _))
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
      .map{ if (Config.useLabelAsDisplayNameForEnums) c => c.copy(name = c.name.orElse(Some(c.stringValue))) else identity }
      .distinctBy(_.stringValue)
      .filterNot(c => c.system.exists(excludedSystems) || excludedCodes(c.stringValue))
    if (allConcepts.isEmpty) {
      println(s"empty enums for ${vs.url.get}")
      None
    } else {
      Some(
        CodeValueSet(
          vs.url.get,
          vs.url,
          vs.version,
          BINDING_STRENGTH.EXAMPLE,
          allConcepts.to(LitSeq).asNonEmpty,
          Nil,
          Nil))
    }
  }
  private lazy val defaultValueSets: Map[String, CodeValueSet] =
    expandGlob("./fhir/spec/hl7.fhir.core/4.0.1/package/ValueSet-*")
      .map(getFileAsJson)
      .map(_.as[ValueSet].fold(throw _, identity))
      .flatMap(toCodeValueSet)
      .map(vs => vs.valueSet -> vs)
      .toMap

  def genPlugins(implicit
      ce: ConcurrentEffect[IO],
      T: Timer[IO]
  ): (Map[String, Seq[ClassGenInfo]], (String, BINDING_STRENGTH) => Option[CodeValueSet]) = {
    val fetchValueSets: (String, BINDING_STRENGTH) => Option[CodeValueSet] = (key, strength) =>
      defaultValueSets.get(key).orElse(defaultValueSets.get(key.split('|').head)).map(_.copy(binding = strength))
    println(s"Have instantiated ${defaultValueSets.size} value sets to inspect")
    (extensions, fetchValueSets)
  }
}

object Main extends IOApp with IOGenerator with DefaultPlugins

trait IOGenerator extends RawGenerator { this: IOApp =>
  def genPlugins(implicit
      ce: ConcurrentEffect[IO],
      T: Timer[IO]
  ): (Map[String, Seq[ClassGenInfo]], (String, BINDING_STRENGTH) => Option[CodeValueSet])
  val defaultModelLocations: String = "generated=./generator/src/main/resources/resourceModel"
  val defaultOutputLocation: String =
    "./generated/src/main/scala/com/babylonhealth/lit/generated/autogen"
  override def run(args: List[String]): IO[ExitCode] = {
    val (extensions, fetchValueSets) = genPlugins
    args match {
      case List("generate", modelLocation) => // todo: named args
        doRawGen("", "", modelLocation, None, None, ModuleDependencies(Nil), true, extensions, fetchValueSets)
      case List("generate", modelLocation, javaOutputLocation) =>
        doRawGen(
          "",
          "",
          modelLocation,
          Some(javaOutputLocation),
          None,
          ModuleDependencies(Nil),
          true,
          extensions,
          fetchValueSets)
      case List("generate", modelLocation, javaOutputLocation, typescriptOutputLocation) =>
        doRawGen(
          "",
          "",
          modelLocation,
          Some(javaOutputLocation),
          Some(typescriptOutputLocation),
          ModuleDependencies(Nil),
          true,
          extensions,
          fetchValueSets)
      case List(
            "generate",
            coreFiles,
            hl7Files,
            modelLocation,
            javaOutputLocation,
            typescriptOutputLocation,
            moduleDependencies,
            writeCode) =>
        doRawGen(
          coreFiles,
          hl7Files,
          modelLocation,
          Some(javaOutputLocation),
          Some(typescriptOutputLocation),
          ModuleDependencies(
            moduleDependencies.split(";").filter(_.contains('<')).map { _.split("<", 2) }.map { case Array(l, r) =>
              l.trim -> r.trim
            }),
          writeCode.toBoolean,
          extensions,
          fetchValueSets
        )
      case _ =>
        doRawGen("", "", defaultModelLocations, None, None, ModuleDependencies(Nil), true, extensions, fetchValueSets)
    }
    IO(ExitCode.Success)
  }
}
