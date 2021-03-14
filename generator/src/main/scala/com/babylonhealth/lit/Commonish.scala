package com.babylonhealth.lit

import scala.annotation.tailrec

trait Commonish {

  def isPrimitiveSuffix(s: String): Boolean = s.toLowerCase() match {
    case "boolean" | "positiveint" | "unsignedint" | "base64binary" | "canonical" | "code" | "id" | "markdown" |
        "string" | "integer" | "decimal" | "uuid" | "oid" | "xhtml" | "url" | "uri" | "instant" | "datetime" | "date" |
        "time" =>
      true
    case _ => false
  }
  val fhirSystemType    = """http://hl7.org/fhirpath/System.(.+)""".r
  val experimentalModel = """Choice\["(.+)"\]""".r
  def typeLookup(s: String): String = s match {
    case fhirSystemType(x) => x
    case "boolean" | "positiveInt" | "unsignedInt" | "base64Binary" | "canonical" | "code" | "id" | "markdown" |
        "string" =>
      s.capitalize
    case "integer"                => "Int"
    case "decimal"                => "BigDecimal"
    case "uuid" | "oid" | "xhtml" => s.map(_.toUpper)
    case "url"                    => "UrlStr"
    case "uri"                    => "UriStr"
    case "instant"                => "ZonedDateTime"
    case "dateTime"               => "FHIRDateTime"
    case "date"                   => "FHIRDate"
    case "time"                   => "LocalTime"
    // TODO: Where are the resources for these?
    case "ProductShelfLife" | "ProdCharacteristic" | "MarketingStatus" | "Population" | "SubstanceAmount" =>
      s"""Choice["$s"]"""
    case "List" => "FHIRList"
    case x      => x
  }
  def inverseTypeLookup(s: String): String = s match {
    case "Boolean" | "PositiveInt" | "UnsignedInt" | "Base64Binary" | "Canonical" | "Code" | "Id" | "Markdown" |
        "String" =>
      s.head.toLower +: s.tail
    case "Int"                    => "integer"
    case "BigDecimal"             => "decimal"
    case "UUID" | "OID" | "XHTML" => s.map(_.toLower)
    case "UrlStr"                 => "url"
    case "UriStr"                 => "uri"
    case "ZonedDateTime"          => "instant"
    case "FHIRDateTime"           => "dateTime"
    case "FHIRDate"               => "date"
    case "LocalTime"              => "time"
    case experimentalModel(mod)   => mod
    case "FHIRList"               => "List"
    case x                        => x
  }
  def typeLookdown(s: String) = s match {
    case "UrlStr"        => "Url"
    case "UriStr"        => "Uri"
    case "UUID"          => "Uuid"
    case "OID"           => "Oid"
    case "XHTML"         => "Xhtml"
    case "BigDecimal"    => "Decimal"
    case "Int"           => "Integer"
    case "ZonedDateTime" => "Instant"
    case "FHIRDateTime"  => "DateTime"
    case "FHIRDate"      => "Date"
    case "LocalTime"     => "Time"
    case x               => x
  }

  def sortIsh[T1](coll: Seq[(T1, String, Option[String])], indexer: T1 => Int): Seq[(T1, String, Option[String])] = {
    assert(coll.exists(_._3.isEmpty), "no root elements ")
    @tailrec
    def recurse(
        coll: Seq[(T1, String, Option[String])],
        out: Seq[(T1, String, Option[String])]): Seq[(T1, String, Option[String])] = {
      if (coll.isEmpty) out
      else {
        val (next, rest) = coll.partition(t => out.exists(o => t._3.contains(o._2)))
        if (next.isEmpty) {
          println(
            s"Unable to find parent profile for any of: ${rest.map(t => s"${t._2} (parent ${t._3 getOrElse "<none>"})").mkString(", ")}")
          sys.exit(1)
        }
        val refinedNext +: leftNext = next.groupBy(n => indexer(n._1)).toSeq.sortBy(_._1).map(_._2)
        if (refinedNext.isEmpty) new RuntimeException("Oh. Oh no.")
        if (rest.map(r => indexer(r._1)).exists(_ < indexer(refinedNext.head._1)))
          println(s"Yikes. putting ${refinedNext.head._2} in before finished parent modules")
        recurse(rest ++ leftNext.flatten, out ++ refinedNext)
      }
    }
    val (initHead, initTail) = coll.partition(_._3.isEmpty)
    recurse(initTail, initHead)
  }
}
