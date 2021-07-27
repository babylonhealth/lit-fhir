package com.babylonhealth.lit.languages

import com.babylonhealth.lit.Cardinality.{ AtLeastOne, One }
import com.babylonhealth.lit.{ BaseField, ClassGenInfo, TopLevelClass }

object TypescriptCodegen {
  def Q(f: BaseField) = f.cardinality match {
    case One | AtLeastOne => ""
    case _                => "?"
  }
  def toTSName(s: String): String = s match {
    case x => x
  }
  def toTSClassName(s: String): String = s match {
    case "Element"    => "FHIRElement"
    case "Parameters" => "FHIRParameters"
    case x            => x
  }
  def tpe(f: BaseField): String = {
    def toTSType(s: String): String =
      (s match {
        case "PositiveInt" | "UnsignedInt" | "Int" | "BigDecimal" => "number"
        case "Base64Binary" | "Canonical" | "Code" | "Id" | "Markdown" | "OID" | "UriStr" | "UrlStr" | "XHTML" | "String" |
            "UUID" =>
          "string"
        case "ZonedDateTime" | "FHIRDateTime" | "LocalDate" | "LocalTime" => "Date"
        case "Element"                                                    => "FHIRElement"
        case "Parameters"                                                 => "FHIRParameters"
        case x if x.startsWith("Choice[\"")                               => "any"
        case x if f.isGenerated && f.declaringClasses.nonEmpty =>
          val h +: t = f.declaringClasses
          s"${(toTSClassName(h) +: t).mkString("_")}_${toTSClassName(x)}"
        case x =>
          val h +: t = x.split("\\.").toSeq
          (toTSClassName(h) +: t).mkString("_")
      })
    f.types.map(toTSType).mkString(" | ")
  }
  def asParam(f: BaseField) = s"${toTSName(f.noParensName)}${Q(f)}: ${tpe(f)}"
  def genStructuralClass(field: BaseField, prefix: String): String =
    if (!field.isGenerated) ""
    else {
      val className = toTSClassName(prefix + field.capitalName)
      val implement = field.types.flatMap {
        case "BackboneElement" => Some(" extends BackboneElement")
        case "Element"         => Some(" extends FHIRElement")
        case _                 => None
      }.headOption getOrElse ""
      val parentFields  = field.parent.toSeq.flatMap(_.childFields)
      val refinedFields = field.childFields.filter(f => parentFields.find(_.name == f.name).forall(_.types != f.types))
      val fieldDecls    = refinedFields.map(asParam).mkString("\n  ")
      val recursive =
        field.childFields.filter(_.isGenerated).map(genStructuralClass(_, className + "_")).mkString("\n\n")
      s"""$recursive
         |
         |interface $className $implement {
         |  $fieldDecls
         |}""".stripMargin
    }
  def genTypescriptForClass(topLevelClass: TopLevelClass): Seq[ClassGenInfo] = {
    val className     = toTSClassName(topLevelClass.className)
    val implement     = topLevelClass.parentClass.map(c => " extends " + toTSClassName(c.className)) getOrElse ""
    val parentFields  = topLevelClass.parentClass.toSeq.flatMap(_.fields)
    val refinedFields = topLevelClass.fields.filter(f => parentFields.find(_.name == f.name).forall(_.types != f.types))
    val fieldDecls    = refinedFields.map(asParam).mkString("\n  ")
    val structuralClasses =
      if (topLevelClass.isProfile) ""
      else topLevelClass.fields.map(genStructuralClass(_, s"${className}_")).filter(_.nonEmpty).mkString("\n")
    val classBody =
      s"""$structuralClasses
         |
         |interface $className $implement{
         |  $fieldDecls
         |}""".stripMargin
    Seq(ClassGenInfo(classBody, "", null))
  }
}
