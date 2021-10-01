package com.babylonhealth.lit.languages

import com.babylonhealth.lit.Cardinality.{ AtLeastOne, One }
import com.babylonhealth.lit.{ BaseField, ClassGenInfo, TopLevelClass }

object Rust {
  def commonImports(pkgs: Seq[String]): String =
    s"""use bigdecimal::BigDecimal;
       |use im::vector::Vector;
       |
       |${pkgs.map(s => s"use crate::$s::model::*;\nuse crate::$s::*;").mkString("\n")}
       |""".stripMargin
  def Q(f: BaseField) = f.cardinality match {
    case One | AtLeastOne => ""
    case _                => "?"
  }
  def toRustName(s: String): String = s match {
    case "type" => "_type"
    case x      => x
  }
  def toRustClassName(s: String): String = s match {
    case "Element"    => "FHIRElement"
    case "Parameters" => "FHIRParameters"
    case x            => x
  }
  def tpe(f: BaseField): String = {
    def toRustType(s: String): String =
      (s match {
        case "PositiveInt" | "UnsignedInt" => "u32"
        case "Int"                         => "i32"
        case "Integer64"                   => "i64"
        case "BigDecimal"                  => "BigDecimal"
        case "Base64Binary" | "Canonical" | "Code" | "Id" | "Markdown" | "OID" | "UriStr" | "UrlStr" | "XHTML" | "String" |
            "UUID" =>
          "String"
        case "ZonedDateTime" | "FHIRDateTime" | "LocalDate" | "LocalTime" => "Date"
        case "Element"                                                    => "FHIRElement"
        case "Parameters"                                                 => "FHIRParameters"
        case x if x.startsWith("Choice[\"")                               => "any"
        case x if f.isGenerated && f.declaringClasses.nonEmpty =>
          val h +: t = f.declaringClasses
          s"${(toRustClassName(h) +: t).mkString("_")}_${toRustClassName(x)}"
        case x =>
          val h +: t = x.split("\\.").toSeq
          (toRustClassName(h) +: t).mkString("_")
      })
    f.types.map(toRustType).mkString(" | ")
  }
  def asParam(f: BaseField) = s"pub(crate) ${toRustName(f.noParensName)}${Q(f)}: ${tpe(f)},"
  def genStructuralClass(field: BaseField, prefix: String): String =
    if (!field.isGenerated) ""
    else {
      val className = toRustClassName(prefix + field.capitalName)
//      val implement = field.types.flatMap {
//        case "BackboneElement" => Some(" extends BackboneElement")
//        case "Element"         => Some(" extends FHIRElement")
//        case _                 => None
//      }.headOption getOrElse ""
      val parentFields  = field.parent.toSeq.flatMap(_.childFields)
      val refinedFields = field.childFields.filter(f => parentFields.find(_.name == f.name).forall(_.types != f.types))
      val fieldDecls    = refinedFields.map(asParam).mkString("\n  ")
      val recursive =
        field.childFields.filter(_.isGenerated).map(genStructuralClass(_, className + "_")).mkString("\n\n")
      s"""$recursive
         |
         |pub struct $className {
         |  $fieldDecls
         |}""".stripMargin
    }
  def genRustForClass(topLevelClass: TopLevelClass): Seq[ClassGenInfo] = {
    val className = toRustClassName(topLevelClass.className)
//    val implement     = topLevelClass.parentClass.map(c => " extends " + toRustClassName(c.className)) getOrElse ""
    val parentFields  = topLevelClass.parentClass.toSeq.flatMap(_.fields)
    val refinedFields = topLevelClass.fields.filter(f => parentFields.find(_.name == f.name).forall(_.types != f.types))
    val fieldDecls    = refinedFields.map(asParam).mkString("\n  ")
    val structuralClasses =
      if (topLevelClass.isProfile) ""
      else topLevelClass.fields.map(genStructuralClass(_, s"${className}_")).filter(_.nonEmpty).mkString("\n")
    val classBody =
      s"""$structuralClasses
         |
         |pub struct $className {
         |  $fieldDecls
         |}""".stripMargin
    Seq(ClassGenInfo(classBody, "", null))
  }

}
