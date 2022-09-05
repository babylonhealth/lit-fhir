package com.babylonhealth.lit.languages

import com.babylonhealth.lit.Cardinality.{ AtLeastOne, Many, One, Optional, Zero }
import com.babylonhealth.lit.ElementTreee.{ isPrimitiveSuffix, unionDeclaringPackages }
import com.babylonhealth.lit.{ BaseField, Cardinality, ClassGenInfo, ElementTreee, ModuleDependencies, TopLevelClass }

case class Import(pkg: String, name: String, `enum`: Boolean) {
  val parentName: String = name.split('_').head
  def toImport: String =
    if (`enum`) s"use crate::$pkg::model::UnionAliases::$name;" else s"use crate::$pkg::model::$parentName::$name;"
}

object Rust {
  def commonImports(pkgs: Seq[String]): String =
    s"""use bigdecimal::BigDecimal;
       |use bytes::Bytes;
       |use chrono::{DateTime, FixedOffset};
       |use datetime::{LocalDate, LocalTime};
       |use im::vector::Vector;
       |use uuid::Uuid;
       |
       |use crate::core::model::FHIRObject::FHIRObject;""".stripMargin
  def Q(f: BaseField) = f.cardinality match {
    case One | AtLeastOne => ""
    case _                => "?"
  }
  def toRustName(s: String): String = s match {
    case x @ ("abstract" | "for" | "ref" | "type" | "use") => s"_$x"
    case x                                                 => x
  }
  def toRustClassName(s: String): String = s match {
    case "Element"    => "FHIRElement"
    case "Parameters" => "FHIRParameters"
    case x            => x
  }
  def tpe(f: BaseField): String = {
    val isDyn  = !f.isGenerated && f.isBuildableFHIRType
    val str    = rawType(f)
    def rawTpe = if (str.contains('_')) s"Box<$str>" else if (isDyn) s"Box<dyn $str>" else str
    f.cardinality match {
      case One               => rawTpe
      case AtLeastOne | Many => s"Vector<$rawTpe>"
      case Optional          => s"Option<$rawTpe>"
    }
  }
  def rawType(f: BaseField): String = {
    def toRustType(s: String): String =
      (s match {
        case "PositiveInt" | "UnsignedInt" => "u32"
        case "Int"                         => "i32"
        case "Integer64"                   => "i64"
        case "BigDecimal"                  => "BigDecimal"
        case "Boolean"                     => "bool"
        case "UUID"                        => "Uuid"
        case "Base64Binary" | "Canonical" | "Code" | "Id" | "Markdown" | "OID" | "UriStr" | "UrlStr" | "XHTML" | "String" =>
          "String"
        case "ZonedDateTime" | "FHIRDateTime" => "DateTime<FixedOffset>" // TODO: specificity-aware wrapper for FHIRDateTime
        // TODO: this one
        case "FHIRDate"  => "LocalDate"
        case "LocalTime" => "LocalTime"
//        case "Element"                        => "FHIRElement"
//        case "Parameters"                     => "FHIRParameters"
        // TODO: Use a json type
        case x if x.startsWith("Choice[\"") => "String"
        case x if f.isGenerated && f.declaringClasses.nonEmpty =>
          val h +: t = f.declaringClasses
          s"${(toRustClassName(h) +: t).mkString("_")}_$x"
        case x =>
          val h +: t = x.split("\\.").toSeq
          (toRustClassName(h) +: t).mkString("_")
      })

    if (f.types.size > 1) ElementTreee.getUnionAlias(pkg = f.pkg, s = f.types, field = f) else toRustType(f.types.head)
  }
  def asStructParam(f: BaseField): String = tpe(f) match {
    case "Reference"         => s"pub(crate) ${toRustName(f.noParensName)}: Box<Reference>,"
    case "Option<Reference>" => s"pub(crate) ${toRustName(f.noParensName)}: Option<Box<Reference>>,"
    case rn                  => s"pub(crate) ${toRustName(f.noParensName)}: $rn,"
  }
  def asTraitFn(f: BaseField): String = tpe(f) match {
    case "Reference"         => s"fn ${toRustName(f.noParensName)}(&self) -> &Box<Reference>;"
    case "Option<Reference>" => s"fn ${toRustName(f.noParensName)}(&self) -> &Option<Box<Reference>>;"
    case rn                  => s"fn ${toRustName(f.noParensName)}(&self) -> &$rn;"
  }
  def asImpl(f: BaseField, constValue: Option[String] = None): String = {
    val value = constValue getOrElse s"self.${toRustName(f.noParensName)}"
    tpe(f) match {
      case "Reference"         => s"fn ${toRustName(f.noParensName)}(&self) -> &Box<Reference> { &$value }"
      case "Option<Reference>" => s"fn ${toRustName(f.noParensName)}(&self) -> &Option<Box<Reference>> { &$value }"
      case rn                  => s"fn ${toRustName(f.noParensName)}(&self) -> &$rn { &$value }"
    }
  }
  def genStructuralClass(field: BaseField, prefix: String): String =
    if (!field.isGenerated) ""
    else {
      val className = toRustClassName(prefix + field.capitalName)
//      val implement = field.types.flatMap {
//        case "BackboneElement" => Some(" extends BackboneElement")
//        case "Element"         => Some(" extends FHIRElement")
//        case _                 => None
//      }.headOption getOrElse ""
//      val parentFields  = field.parent.toSeq.flatMap(_.childFields)
      val refinedFields = field.childFields // .filter(f => parentFields.find(_.name == f.name).forall(_.types != f.types))
      val fieldDecls    = refinedFields.map(asStructParam).mkString("\n  ")
      val recursive =
        field.childFields.filter(_.isGenerated).map(genStructuralClass(_, className + "_")).mkString("\n\n")
      s"""$recursive
         |
         |#[derive(Clone, Debug)]
         |pub struct $className {
         |  $fieldDecls
         |}""".stripMargin
    }
  def getAllFHIRTypesUsed(getDeclaringPkgForType: Map[String, String])(baseField: BaseField): Seq[Import] =
    baseField.types match {
      // Should use a json type here
      case Seq(x) if x.startsWith("Choice[\"") => Nil
      // Currently ignore, but only because we 'universally' import all primitive types. We could be smarter!
      case Seq(tpe) if isPrimitiveSuffix(ElementTreee.inverseTypeLookup(tpe)) => Nil
      // declared in this file. No need to 'use' it, but may need to 'use' the types it, in turn, depends on.
      case Seq(_) if baseField.isGenerated && baseField.firstBase.isEmpty =>
        baseField.childFields.flatMap(getAllFHIRTypesUsed(getDeclaringPkgForType))
      // declared in a parent. Need to 'use' it for it to be explicitly available
      case Seq(_) if baseField.isGenerated => Seq(Import(baseField.firstBase.get.pkg, rawType(baseField), false))
      // is a 'top level' Element or Resource type. Need to 'use' it.
      // TODO getOrElse "core" is a horrible hack
      case Seq(tpe) => Seq(Import(getDeclaringPkgForType.getOrElse(tpe, "core"), rawType(baseField), false))
      // is a union type
      case _ =>
        val uname = rawType(baseField)
        Seq(Import(unionDeclaringPackages(uname), uname, true))
    }

  def zeroValue(c: Cardinality): String = c match {
    case Optional => "Option::None"
    case _        => "Vector::new()"
  }
  def genRustForClass(topLevelClass: TopLevelClass, getDeclaringPkgForType: Map[String, String]): Seq[ClassGenInfo] = {
    def definedHere(i: Import): Boolean = i.parentName == toRustClassName(topLevelClass.className)

    val allFHIRTypesUsed =
      topLevelClass.fields.flatMap(getAllFHIRTypesUsed(getDeclaringPkgForType)).distinct.filterNot(definedHere)
    def getAllParentTypes(tlc: TopLevelClass): Seq[(String, String)] = {
      val pkg  = tlc.targetDir
      val name = toRustClassName(tlc.className)
      tlc.parentClass match {
        case None       => Seq(pkg -> name)
        case Some(next) => getAllParentTypes(next) :+ (pkg -> name)
      }
    }
    val allParentTypes: Seq[String] =
      topLevelClass.parentClass.toSeq
        .flatMap(getAllParentTypes)
        .map { case (pkg, name) => s"use crate::$pkg::model::$name::$name;" }
    val requiredImports = allFHIRTypesUsed.map(_.toImport).sorted
    val allFHIRImports  = (allParentTypes ++ requiredImports).distinct.sorted.mkString("\n")
    val traitName       = toRustClassName(topLevelClass.className)
    val parentFields    = topLevelClass.parentClass.toSeq.flatMap(_.fields)
    val refinedFields   = topLevelClass.fields.filter(f => parentFields.find(_.name == f.name).forall(_.types != f.types))
    val structFields    = topLevelClass.fields.filter(_.cardinality != Zero).map(asStructParam).mkString("\n  ")
    val traitFns        = refinedFields.map(asTraitFn).mkString("\n  ")
    val structuralClasses =
      if (topLevelClass.isProfile) ""
      else topLevelClass.fields.map(genStructuralClass(_, s"${traitName}_")).filter(_.nonEmpty).mkString("\n")
    def impls(implFor: TopLevelClass, removedFields: Seq[BaseField] = Nil): Seq[String] = {
      val implTraitName = toRustClassName(implFor.className)
      val (refinedFields, rest) = implFor.parentClass match {
        case None => implFor.fields.map(_ -> None) -> Nil
        case Some(nextParent: TopLevelClass) =>
          val parentFields = nextParent.fields
          val newFields = implFor.fields.filter(f =>
            !removedFields.exists(_.name == f.name) && parentFields.find(_.name == f.name).forall(_.types != f.types))
          val (usedRemoved, unusedRemoved) = removedFields.partition(rf => implFor.fields.exists(_.name == rf.name))
          val removedFieldsWithDefaults    = usedRemoved.map(pf => pf -> Option(zeroValue(pf.cardinality)))
          val nextRemovedFields = nextParent.fields.filter(pf =>
            !implFor.fields.exists(_.name == pf.name) || implFor.fields
              .find(_.name == pf.name)
              .exists(_.cardinality == Zero && pf.cardinality != Zero))
          (newFields.map(_ -> None) ++ removedFieldsWithDefaults) -> impls(nextParent, unusedRemoved ++ nextRemovedFields)
      }
      val fnImpls = refinedFields.map((asImpl _).tupled).mkString("\n  ")
      rest :+
      s"""impl $implTraitName for ${traitName}Raw {
         |  $fnImpls
         |}
         |""".stripMargin
    }
    val parentTrait = topLevelClass.parentClass match {
      case Some(parent) => toRustClassName(parent.className)
      case None         => "FHIRObject"
    }
    val classBody =
      s"""${commonImports(Seq(topLevelClass.targetDir))}
         |
         |$allFHIRImports
         |
         |$structuralClasses
         |
         |#[derive(Clone, Debug)]
         |pub struct ${traitName}Raw {
         |  $structFields
         |}
         |
         |pub trait $traitName : $parentTrait {
         |  $traitFns
         |}
         |
         |dyn_clone::clone_trait_object!($traitName);
         |
         |impl FHIRObject for ${traitName}Raw {
         |}
         |
         |${impls(topLevelClass).mkString("\n\n")}
         |""".stripMargin
    Seq(ClassGenInfo(classBody, traitName, topLevelClass.targetDir))
  }

  def genModRS(pkg: String, classes: Iterable[String]): Seq[ClassGenInfo] = {
    val allClasses =
      (classes.map(toRustClassName) ++ (if (pkg == "core") Seq("FHIRObject") else Nil) ++ Seq("UnionAliases")).toSeq.sorted
    val body =
      s"""#![allow(non_snake_case)]
         |
         |${allClasses.map(c => s"pub mod $c;").mkString("\n")}""".stripMargin
    Seq(ClassGenInfo(body, "mod", pkg))
  }

  private def enumTypeLookup(s: String): String = s match {
    case "Canonical" | "Code" | "Id" | "Markdown" | "OID" | "String" | "UriStr" | "UrlStr" => "String"
    case "Base64Binary"                                                                    => "Bytes"
    case "BigDecimal"                                                                      => "BigDecimal"
    case "Boolean"                                                                         => "bool"
    case "Int"                                                                             => "i32"
    case "FHIRDate"                                                                        => "LocalDate"
    case "FHIRDateTime"                                                                    => "DateTime<FixedOffset>"
    case "LocalTime"                                                                       => "LocalTime"
    case "ZonedDateTime"                                                                   => "DateTime<FixedOffset>"
    case "PositiveInt" | "UnsignedInt"                                                     => "u32"
    case "UUID"                                                                            => "Uuid"
    case _                                                                                 => s"Box<dyn $s>"
  }
  private def getUnion(name: String, types: Seq[String]): String = {
    val variants = types.map(t => s"   FHIR${t.stripPrefix("FHIR")}(${enumTypeLookup(t)}),").mkString("\n")
    s"""
       |#[derive(Clone, Debug)]
       |pub enum $name {
       |$variants
       |}""".stripMargin
  }

  val primitiveTypes = Set(
    "Canonical",
    "Code",
    "Id",
    "Markdown",
    "OID",
    "String",
    "UriStr",
    "UrlStr",
    "Base64Binary",
    "BigDecimal",
    "Boolean",
    "Int",
    "FHIRDate",
    "FHIRDateTime",
    "LocalTime",
    "ZonedDateTime",
    "PositiveInt",
    "UnsignedInt",
    "UUID"
  )
  def getUnions(pkg: String, _unionAliases: Map[String, Seq[String]]): String = {
    val allCoreClasses = _unionAliases.flatMap(_._2).toSeq.distinct.sorted.filterNot(primitiveTypes)
    s"""use bigdecimal::BigDecimal;
       |use bytes::Bytes;
       |use chrono::{DateTime, FixedOffset};
       |use datetime::{LocalDate, LocalTime};
       |use uuid::Uuid;
       |
       |${allCoreClasses.map(c => s"use crate::core::model::$c::$c;").mkString("\n")}
       |""".stripMargin +
    _unionAliases.toSeq
      .map((getUnion _).tupled)
      .sorted
      .mkString("\n")
  }

  def genUnionFiles(
      moduleDependencies: ModuleDependencies,
      _unionAliases: Map[String, (Seq[String], Seq[String])]
//      classes: Seq[(String, TopLevelClass)]
  ): Seq[ClassGenInfo] = {
//    val lookups = classes.groupMap(_._1) { case (_, c) => c.url -> c.scalaClassName }
    val unions: Map[String, Map[String, Seq[String]]] =
      _unionAliases
        .map { case (unionName, (pkgs, unionTypes)) =>
          (moduleDependencies.leastCommon(pkgs.toSet), unionName, unionTypes)
        }
        .groupBy(_._1)
        .map { case (pkg, unions) => pkg -> unions.map { case (_, b, c) => b -> c }.toMap }

    unions.map { case (pkg, unions) => ClassGenInfo(getUnions(pkg, unions), "UnionAliases", pkg) }.toSeq
  }
}
