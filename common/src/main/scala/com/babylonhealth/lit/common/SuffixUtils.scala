package com.babylonhealth.lit.common

object SuffixUtils {

  def typeLookdown(s: String): String = s match {
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

}
