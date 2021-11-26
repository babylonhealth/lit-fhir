package com.babylonhealth.lit.languages

import com.babylonhealth.lit.Cardinality.{ AtLeastOne, Many, One, Optional }
import com.babylonhealth.lit.ElementTreee.{ isPrimitiveSuffix, unionDeclaringPackages }
import com.babylonhealth.lit.{ BaseField, ClassGenInfo, ElementTreee, TopLevelClass }

case class Import(pkg: String, name: String, `enum`: Boolean) {
  def toImport: String = if (`enum`) s"use crate::$pkg::$name;" else s"use crate::$pkg::model::$name::$name;"
}

object Rust {
  def commonImports(pkgs: Seq[String]): String =
    s"""use bigdecimal::BigDecimal;
       |use chrono::{DateTime, FixedOffset};
       |use im::vector::Vector;
       |
       |${pkgs.map(s => s"use crate::$s::model::*;\nuse crate::$s::*;").mkString("\n")}
       |""".stripMargin
  def Q(f: BaseField) = f.cardinality match {
    case One | AtLeastOne => ""
    case _                => "?"
  }
  def toRustName(s: String): String = s match {
    case x @ ("type" | "use") => s"_$x"
    case x                    => x
  }
  def toRustClassName(s: String): String = s match {
    case "Element"    => "FHIRElement"
    case "Parameters" => "FHIRParameters"
    case x            => x
  }
  def tpe(f: BaseField): String = f.cardinality match {
    case One               => rawType(f)
    case AtLeastOne | Many => s"Vector<${rawType(f)}>"
    case Optional          => s"Option<${rawType(f)}>"
  }
  def rawType(f: BaseField): String = {
    def toRustType(s: String): String =
      (s match {
        case "PositiveInt" | "UnsignedInt" => "u32"
        case "Int"                         => "i32"
        case "Integer64"                   => "i64"
        case "BigDecimal"                  => "BigDecimal"
        case "Boolean"                     => "bool"
        case "Base64Binary" | "Canonical" | "Code" | "Id" | "Markdown" | "OID" | "UriStr" | "UrlStr" | "XHTML" | "String" |
            "UUID" =>
          "String"
        case "ZonedDateTime" | "FHIRDateTime" => "DateTime<FixedOffset>" // TODO: specificity-aware wrapper for FHIRDateTime
        // TODO: these two
        case "LocalDate" => "Date"
        case "LocalTime" => "Date"
//        case "Element"                        => "FHIRElement"
//        case "Parameters"                     => "FHIRParameters"
        // TODO: Use a json type
        case x if x.startsWith("Choice[\"") => "any"
        case x if f.isGenerated && f.declaringClasses.nonEmpty =>
          val h +: t = f.declaringClasses
          s"${(toRustClassName(h) +: t).mkString("_")}_${toRustClassName(x)}"
        case x =>
          val h +: t = x.split("\\.").toSeq
          (toRustClassName(h) +: t).mkString("_")
      })

    if (f.types.size > 1) ElementTreee.getUnionAlias(pkg = f.pkg, s = f.types, field = f) else toRustType(f.types.head)
  }
  def asParam(f: BaseField): String = tpe(f) match {
    case "Reference" => s"pub(crate) ${toRustName(f.noParensName)}: Box<Reference>,"
    case "Option<Reference>" => s"pub(crate) ${toRustName(f.noParensName)}: Option<Box<Reference>>,"
    case rn          => s"pub(crate) ${toRustName(f.noParensName)}: $rn,"
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
      val refinedFields = field.childFields //.filter(f => parentFields.find(_.name == f.name).forall(_.types != f.types))
      val fieldDecls    = refinedFields.map(asParam).mkString("\n  ")
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

  def genRustForClass(topLevelClass: TopLevelClass, getDeclaringPkgForType: Map[String, String]): Seq[ClassGenInfo] = {
    def definedHere(i: Import): Boolean = i.pkg == topLevelClass.fields.head.pkg && {
      i.name == toRustClassName(topLevelClass.className) ||
      i.name.startsWith(toRustClassName(topLevelClass.className) + "_")
    }
    val allFHIRTypesUsed =
      topLevelClass.fields.flatMap(getAllFHIRTypesUsed(getDeclaringPkgForType)).distinct.filterNot(definedHere)
    val requiredImports = allFHIRTypesUsed.map(_.toImport).mkString("\n")
    val className       = toRustClassName(topLevelClass.className)
//    val implement     = topLevelClass.parentClass.map(c => " extends " + toRustClassName(c.className)) getOrElse ""
    val parentFields  = topLevelClass.parentClass.toSeq.flatMap(_.fields)
    val refinedFields = topLevelClass.fields.filter(f => parentFields.find(_.name == f.name).forall(_.types != f.types))
    val fieldDecls    = refinedFields.map(asParam).mkString("\n  ")
    val structuralClasses =
      if (topLevelClass.isProfile) ""
      else topLevelClass.fields.map(genStructuralClass(_, s"${className}_")).filter(_.nonEmpty).mkString("\n")
    val classBody =
      s"""${commonImports(Seq(topLevelClass.targetDir))}
         |
         |$requiredImports
         |
         |$structuralClasses
         |
         |#[derive(Clone, Debug)]
         |pub struct $className {
         |  $fieldDecls
         |}""".stripMargin
    Seq(ClassGenInfo(classBody, className, topLevelClass.targetDir))
  }

}
