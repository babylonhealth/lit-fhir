package com.babylonhealth.lit.common

object CodegenUtils {

  def fieldScalaNameFromJavaName(javaName: String): String = javaName match {
    case n if n.startsWith("_") => s"${n.tail}$$()"
    case n                      => s"$n()"
  }

  def fieldJavaName(noParensName: String): String = noParensName match {
    case n @ ("class" | "type" | "abstract" | "for" | "import" | "extends" | "short" | "assert") => s"_$n"
    case n                                                                                       => n
  }

  def fieldScalaName(noParensName: String): String =
    noParensName match {
      case x @ ("class" | "type" | "abstract" | "for" | "import" | "extends" | "given") => s"`$x`"
      case x                                                                            => x
    }

  def profileScalaName(name: String): String = name match {
    case "List"              => "FHIRList"   // TODO: Do we _really_ need to rename List to FHIRList now?
    case "Option"            => "FHIROption" // TODO: Do we _really_ need to rename List to FHIRList now?
    case x if x.head.isDigit => s"_${x.replaceAll("-", "_")}"
    case x                   => x.capitalize.replaceAll("-", "_")
  }
}
