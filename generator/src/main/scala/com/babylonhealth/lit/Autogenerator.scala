package com.babylonhealth.lit

import java.io.File

import scala.util.control.NonFatal

import cats.implicits._
import io.circe.generic.auto._
import io.circe.parser.decode

import com.babylonhealth.lit.ElementTreee._
import com.babylonhealth.lit.core.serdes.objectDecoder
import com.babylonhealth.lit.core.BINDING_STRENGTH
import com.babylonhealth.lit.hl7.model.{ElementDefinition, StructureDefinition}
import com.babylonhealth.lit.languages.{JavaGenerator, ScalaCodegen, TypescriptCodegen}

trait FHIRFetcher {}

case class FHIRSearchParam(name: String, expression: Option[String], base: Option[Seq[String]]) {
  def getBase: Set[String]  = base.toSet.flatten
  def getExpression: String = expression.get
}

object Autogenerator extends Commonish with Logging with FileUtils with JavaGenerator {

  val searchParams: Seq[FHIRSearchParam] =
    decode[Seq[FHIRSearchParam]](slurpRsc("searchParams.json")).fold(throw _, identity)

  def foldElements(seq: Vector[ElementDefinition], permitRecurse: Boolean = true): DAG[ElementWithSlices] = {
    if (seq.exists(_.id.isEmpty)) {
      throw new RuntimeException(
        s"IDK what this el without an id is, but I don't like it :: ${seq.filter(_.id.isEmpty).map(_.path).mkString(" + ")}")
    }
    if (seq.exists(_.id.get.isEmpty)) {
      throw new RuntimeException(
        s"IDK what this el with an empty id is, but I don't like it :: ${seq.filter(_.id.get.isEmpty).map(_.path).mkString(" + ")}")
    }
    if (seq.isEmpty) throw new RuntimeException("snapshot should contain at least one element, probably")
    val sortedElems =
      if (permitRecurse)
        // Zipping with index to retain ordering for zero diff
        seq.zipWithIndex
          .groupBy(_._1.id.get.split(':')(0))
          .map { case (id, els) =>
            val (Vector((master, idx)), rest) = els.partition(_._1.id.get == id)
            val restWithTrimmedIds            = rest.map(_._1.updateIdIfExists(_.split(':')(1)))
            val partitionedRest               = restWithTrimmedIds.groupBy(_.id.get.split("\\.").head).values.toVector
            val foldedSliceChildren           = partitionedRest.map(part => foldElements(part, permitRecurse = false))
            ElementWithSlices(master, foldedSliceChildren) -> idx
          }
          .toVector
          .sortBy(_._2)
          .map(_._1)
          .sortBy(_.el.id.get.length)
      else seq.map(e => ElementWithSlices(e, Nil))
    DAG.fromList(sortedElems.tail, (p, c) => c.el.id.get startsWith p.el.id.get.+("."), Some(sortedElems.head))
  }

  def genFieldsForClass(
      resourceModel: SourceFile,
      basefields: Map[String, Map[String, TopLevelClass]],
      fetchValueSet: (String, BINDING_STRENGTH) => Option[CodeValueSet]): TopLevelClass = {
    val structureDef      = getFileAsJson(resourceModel.file).as[StructureDefinition].fold(throw _, identity)
    val className: String = structureDef.id.get
    val typeName: String  = structureDef.`type`
    val url: String       = structureDef.url
    // establish base class
    // This should be defined for everything except 'resource' and 'element'
    val baseDefinitionURL: Option[String]           = structureDef.baseDefinition
    val baseDefinition                              = baseDefinitionURL.map(_.split("/").last)
    val snapshotElements: Vector[ElementDefinition] = structureDef.snapshot.toVector.flatMap(_.element.toVector)

    val foldedElements: DAG[ElementWithSlices] = foldElements(snapshotElements)
    def getLocallestClass(className: String) = basefields.get(className).flatMap { m =>
      m.get(resourceModel.targetModule) orElse (m.values match {
        case Nil                  => None
        case one if one.size == 1 => one.headOption
        case seq =>
          println(
            s"ARBITRARY CHOICE MADE, NEED TO TAKE THE FULL DEP TREE INTO ACCOUNT OR SOMETHING IDK. " +
              s"$className from ${resourceModel.targetModule} in ${m.keys.mkString(" & ")}")
          seq.headOption
      })
    }
    val parentClass: Option[TopLevelClass] = baseDefinition flatMap getLocallestClass
    val fieldMap: Map[String, BaseField] = parentClass match {
      case None     => Map.empty
      case Some(bd) => bd.fields.map(f => f.name -> f).toMap
    }
    val fields = foldedElements.children.map(
      _.deriveFieldInformation(resourceModel.targetModule, className, fieldMap, Seq(className), fetchValueSet))
    val enumerations = fields.flatMap(_.getAllEnumerations).toMap
    TopLevelClass(fields, url, parentClass, className, typeName, structureDef, enumerations, resourceModel.targetModule)
  }

  def expandModel(s: SourceFile): (Boolean, (SourceFile, Option[String], Option[String])) = {
    val json                              = getFileAsJson(s.file)
    val className: Option[String]         = json.asObject.flatMap(_("id")).flatMap(_.asString)
    val baseDefinitionURL: Option[String] = json.asObject.flatMap(_("baseDefinition")).flatMap(_.asString)
    val isPrimitive                       = json.asObject.flatMap(_("kind")).flatMap(_.asString).contains("primitive-type")
    val isLogical                         = json.asObject.flatMap(_("kind")).flatMap(_.asString).contains("logical")
    if (isPrimitive) log.error(s"Not sure what to do with primitives yet. Found a primitive: ${className.get}")
    if (isLogical)
      log.error(
        s"Not sure what (if anything) to do with logical definitions yet. Found a logical structure definition: ${className.get}")
    val baseDefinition = baseDefinitionURL.map(_.split("/").last)
    (isPrimitive || isLogical) -> (s, className, baseDefinition)
  }
  def sortLocationsByBase(modelOverrides: Seq[SourceFile], resourceModels: Seq[SourceFile]): Seq[SourceFile] = {
    println("trying to sort")
    val expandedOverrides            = modelOverrides.map(expandModel).collect { case (false, (s, Some(c), b)) => (s, c, b) }
    val overrideClasses: Set[String] = expandedOverrides.map(_._2).toSet
    val expandedDomainModels =
      resourceModels.map(expandModel).collect { case (false, (s, Some(c), b)) => (s, c, b) }
    val (excludedDomainModels, includedDomainModels) =
      expandedDomainModels.partition(overrideClasses contains _._2)
    println(
      s"Excluding the following ${excludedDomainModels.size} domain models, as they clash with hl7 core model: ${excludedDomainModels.map(_._2).mkString(", ")}")
    val consideredModels = expandedOverrides ++ includedDomainModels
    val ordering         = consideredModels.map(_._1.targetModule).distinct
    println(s"expected to order modules as: ${ordering.mkString(", ")}")
    sortIsh(
      consideredModels, // todo: something with primitives
      (t: SourceFile) => ordering.indexOf(t.targetModule)
    ).map(_._1)
  }

  def getStrings(
      overridingModels: Seq[SourceFile],
      resourceModels: Seq[SourceFile],
      javaDirSuffix: String,
      typescriptOutputLocation: Option[String],
      moduleDependencies: ModuleDependencies,
      extensions: Map[String, Seq[ClassGenInfo]],
      fetchValueSet: (String, BINDING_STRENGTH) => Option[CodeValueSet]): AllGeneratedFiles = {

    val sortedLocations = sortLocationsByBase(overridingModels, resourceModels)
    println("Sorted models")
    val modules = sortedLocations.foldLeft(Seq.empty[String]) { (acc, n) =>
      val currModule = acc.lastOption contains n.targetModule
      val res        = if (currModule) acc else acc :+ n.targetModule
      if (!currModule && acc.contains(n.targetModule))
        println(
          s"ALAS: ${n.file.getName} is being inserted too late... ${sortedLocations(sortedLocations.indexOf(n) - 1).file.getName} went in first...")
      res
    }
    assert(
      modules.distinct == modules,
      s"Cannot have circular dependencies between generated modules (dependency chain is ${modules.mkString(" -> ")}")
    println("No circular dependencies in models")
    val topLevelClasses: TopLevelClasses =
      TopLevelClasses(
        sortedLocations.foldLeft(Map.empty[String, Map[String, TopLevelClass]]) { case (baseFields, loc) =>
          try {
            val topLevelClass = genFieldsForClass(loc, baseFields, fetchValueSet)
            baseFields.updatedWith(topLevelClass.className) {
              case None    => Some(Map(topLevelClass.targetDir -> topLevelClass))
              case Some(v) => Some(v + (topLevelClass.targetDir -> topLevelClass))
            }
          } catch {
            case NonFatal(ex) =>
              log.error(s"Unable to gen Base fields for $loc", ex)
              baseFields
          }
        })
    val valueSetDecls: ValueSetDecls = ValueSetDecls(topLevelClasses.classes.flatMap {
      _._2.flatMap { case (pkg, x) => x.valueSets.map { case (k, v) => (pkg, k, v) } }
    }.toSeq).stripVersions
    val valueSetEarliestDeclarations: ValueSetDecls = valueSetDecls.earliestDeclarations(moduleDependencies)

    val scalaClassGenInfo: Seq[ClassGenInfo] = {

      val valueSetFiles =
        valueSetEarliestDeclarations.byPackage.map { case (pkg, vs) => ScalaCodegen.genValueSetFile(pkg, vs.toMap) }

      val (element, backboneElement) = (topLevelClasses.get("Element"), topLevelClasses.get("BackboneElement"))
      val pkgAndValueSet = valueSetEarliestDeclarations.flat.map { case (a, b, _) =>
        a -> EnumerationUtils.valueSetToEnumName(b)
      }
      val allFHIRClasses: Seq[ClassGenInfo] = topLevelClasses.classes.toSeq.flatMap { case (o, m) =>
        m.flatMap { case (pkg, k: TopLevelClass) =>
          try Some(
            ScalaCodegen
              .genTheScalaForClass(
                k,
                k.targetDir,
                element,
                backboneElement,
                topLevelClasses,
                moduleDependencies,
                pkgAndValueSet,
                ElementTreee.getUnionTypes.values.map(moduleDependencies leastCommon _._1.toSet).toSet
              ))
          catch {
            case NonFatal(ex) =>
              println(s"Unable to gen Scala file for $pkg.$o", ex)
              ex.printStackTrace()
              None
          }
        }.toSeq
      }
      allFHIRClasses ++ valueSetFiles ++ extensions("scala") ++
      ScalaCodegen.genPackageObjectFiles(moduleDependencies, ElementTreee.getUnionTypes)
    }

    val javaClassGenInfo: JavaClassGenInfo = {
      val bar: Seq[ClassGenInfo] = valueSetEarliestDeclarations.byPackage.flatMap { case (pkg, ps) =>
        generateCodeAliases(pkg, javaDirSuffix, ps.toMap)
      }.toSeq
      JavaClassGenInfo(
        topLevelClasses.classes.toSeq.flatMap { case (o, m) =>
          m.flatMap { case (p, k) =>
            val javaPackageStr = (s"com.babylonhealth.lit.$p$javaDirSuffix")
            try genTheJavaForClass(
              k,
              javaPackageStr,
              p,
              valueSetEarliestDeclarations,
              moduleDependencies,
              javaDirSuffix)
            catch {
              case NonFatal(ex) =>
                log.error(s"Unable to gen Java file for $p.$o", ex)
                Nil
            }
          }
        },
        bar
      )
    }

    val typescriptClassGenInfo: Option[Seq[ClassGenInfo]] = typescriptOutputLocation.map { o =>
      topLevelClasses.classes.toSeq.flatMap { case (o, m) =>
        m.flatMap { case (p, k) =>
          try TypescriptCodegen.genTypescriptForClass(k)
          catch {
            case NonFatal(ex) =>
              log.error(s"Unable to gen Typescript file for $p.$o", ex)
              Nil
          }
        }.toSeq
      }
    }

    AllGeneratedFiles(scalaClassGenInfo, javaClassGenInfo, typescriptClassGenInfo)
  }
  def generateAndWriteOutput(
      overridingModels: Seq[SourceFile],
      resourceModels: Seq[SourceFile],
      javaDirSuffix: String,
      typescriptOutputLocation: Option[String],
      moduleDependencies: ModuleDependencies,
      writeCode: Boolean,
      extensions: Map[String, Seq[ClassGenInfo]],
      fetchValueSet: (String, BINDING_STRENGTH) => Option[CodeValueSet]): Unit = {
    println("Trying to generate files")
    val AllGeneratedFiles(scalaClassGenInfo, javaClassGenInfo, typescriptClassGenInfo) =
      getStrings(
        overridingModels,
        resourceModels,
        javaDirSuffix,
        typescriptOutputLocation,
        moduleDependencies,
        extensions,
        fetchValueSet)
    def javaOutputLocation(pkg: String): String =
      s"./$pkg$javaDirSuffix/src/main/java/com/babylonhealth/lit/$pkg$javaDirSuffix"
    def javaOutputLocations(pkg: String): Seq[String] = {
      val dir = javaOutputLocation(pkg)
      Seq(s"$dir/builders", s"$dir/codes")
    }
    println("Successfully generated files")
    if (writeCode) { // create the directories fresh
      scalaClassGenInfo
        .map(_.pkg)
        .distinct
        .foreach { p =>
          emptyCreate(s"$p/src/main/scala/com/babylonhealth/lit/$p/model")
          javaOutputLocations(p).foreach(emptyCreate)
        }
      scalaClassGenInfo foreach { case ClassGenInfo(fc, fileName, pkg) =>
        write(s"$pkg/src/main/scala/com/babylonhealth/lit/$pkg/model/$fileName.scala", fc)
      }
      javaClassGenInfo.builders foreach { case ClassGenInfo(fc, fileName, pkg) =>
        if (pkg == null) println(s"NULL WAT??? 111 ${fileName} :: ${pkg}")
        else
          write(s"${javaOutputLocation(pkg)}/builders/$fileName.java", fc)
      }
      javaClassGenInfo.codes foreach { case ClassGenInfo(fc, fileName, pkg) =>
        if (pkg == null) println(s"NULL WAT 222 ${fileName} :: ${pkg}??? ")
        else
          write(s"${javaOutputLocation(pkg)}/codes/$fileName.java", fc)
      }
      if (typescriptClassGenInfo.nonEmpty) new File(typescriptOutputLocation.get).mkdirs()
      typescriptClassGenInfo.foreach(c =>
        write(s"${typescriptOutputLocation.get}/DomainModel.ts", c.map(_.fileContents).mkString("\n\n")))
    }
  }
}