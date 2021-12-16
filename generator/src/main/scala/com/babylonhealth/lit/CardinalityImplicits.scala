package com.babylonhealth.lit

import com.babylonhealth.lit.Cardinality._

object CardinalityImplicits {

  implicit class RichCardinality(card: Cardinality) {

    def required: Boolean = card match {
      case One | AtLeastOne => true
      case _                => false
    }

    def wrapType(typeStr: String): String = card match {
      case One        => typeStr
      case Optional   => s"Option[$typeStr]"
      case AtLeastOne => s"NonEmptyLitSeq[$typeStr]"
      case _          => s"LitSeq[$typeStr]"
    }

    def wrapValue(value: String): String = card match {
      case Zero       => throw new IllegalArgumentException("No valid value for 0..0 cardinality")
      case One        => value
      case Optional   => s"Some($value)"
      case AtLeastOne => s"LitSeq($value)"
      case _          => s"LitSeq($value)"
    }

    def defaultValue: Option[String] = card match {
      case Optional    => Some("None")
      case Zero | Many => Some("LitSeq.empty")
      case _           => None
    }

    /** Performs a lossy conversion from one cardinality to another * */
    def convertTo(into: Cardinality)(value: String): String = into match {
      case Zero =>
        card match {
          case Zero => value
          case _    => "LitSeq.empty"
        }
      case Optional =>
        card match {
          case Zero     => "None"
          case Optional => value
          case One      => s"Some($value)"
          case _        => s"$value.headOption"
        }
      case One =>
        card match {
          case Zero     => throw new IllegalArgumentException("Attempting impossible conversion")
          case Optional => s"$value.get"
          case One      => value
          case _        => s"$value.head"
        }
      case AtLeastOne =>
        card match {
          case Zero       => throw new IllegalArgumentException("Attempting impossible conversion")
          case Optional   => s"LitSeq($value.get)"
          case One        => s"LitSeq($value)"
          case AtLeastOne => value
          case Many       => s"$value.asNonEmpty"
        }
      case Many =>
        card match {
          case Zero       => "LitSeq.empty"
          case Optional   => s"$value.to(LitSeq)"
          case One        => s"LitSeq($value)"
          case AtLeastOne => s"$value.refine"
          case _          => value
        }
    }

    /** function arg will look something like `x -> s"foo($x)"` * */
    def applyFunction(value: String)(function: String => String): String = card match {
      case One => s"${function(value)}"
      case _ =>
        val applied = function("_")
        // Avoid pointless maps of the identity function
        if (applied == "_") value else s"$value.map($applied)"
    }

    def cursorDecodeRef: String = card match {
      case One        => "cursor.decodeRef"
      case Optional   => "cursor.decodeOptRef"
      case AtLeastOne => "cursor.decodeSeqRef"
      case _          => "cursor.decodeSeqRef"
    }

    def wrapJavaType(typeStr: String): String = card match {
      case One      => typeStr
      case Optional => s"Optional<$typeStr>"
      case _        => s"Collection<$typeStr>"
    }

    def castUnchecked(typeStr: String): String = card match {
      case One        => s"($typeStr)"
      case Optional   => "(Option)"
      case AtLeastOne => "(NonEmptyLitSeq)"
      case _          => "(LitSeq)"
    }

    def defaultJavaValue: Option[String] = card match {
      case Optional    => Some("Optional.empty()")
      case Zero | Many => Some("Collections.emptyList()")
      case _           => None
    }

    def varArgJavaType(typeStr: String): String = card match {
      case Optional | One => typeStr
      case _              => s"$typeStr..."
    }

    def collectionJavaType(typeStr: String): String = card match {
      case Optional | One => typeStr
      case _              => s"Collection<$typeStr>"
    }

    def wrapJavaValue(value: String, build: Boolean = false): String = card match {
      case One        => value + (if (build) ".build()" else "")
      case Optional   => s"Optional.of($value${if (build) ".build()" else ""})"
      case _ if build => s"Arrays.stream($value).map(e -> e.build()).collect(toList())"
      case _          => s"Arrays.asList($value)"
    }

    def convertJavaToScala(value: String, tpe: String): String = card match {
      case One        => value
      case Optional   => s"OptionConverters.toScala($value)"
      case AtLeastOne => s"$value.stream().collect(new NonEmptyLitSeqJCollector<>())"
      case _          => s"$value.stream().collect(new LitSeqJCollector<>())"
    }

    /** function arg will look something like `x -> s"foo($x)"` * */
    def applyJavaFunction(value: String)(function: String => String): String = card match {
      case One => s"${function(value)}"
      case Optional =>
        val applied = function("x")
        // Avoid pointless maps of the identity function
        if (applied == "x") value else s"$value.map(x -> $applied)"
      case _ =>
        val applied = function("x")
        // Avoid pointless maps of the identity function
        if (applied == "x") value else s"$value.stream().map(x -> $applied).collect(Collectors.toList())"
    }
  }
}
