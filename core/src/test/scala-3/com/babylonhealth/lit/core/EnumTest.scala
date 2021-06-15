package com.babylonhealth.lit.core

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

import com.babylonhealth.lit.core.model.Coding

enum DATA_ABSENT_REASON(val name: String, val display: Option[String], val system: Option[String])
    extends ToCodingAble {
  case ASKED_BUT_DECLINED
      extends DATA_ABSENT_REASON(
        "asked-declined",
        Some("Asked But Declined"),
        Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
  case ASKED_BUT_UNKNOWN
      extends DATA_ABSENT_REASON(
        "asked-unknown",
        Some("Asked But Unknown"),
        Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
  case AS_TEXT
      extends DATA_ABSENT_REASON(
        "as-text",
        Some("As Text"),
        Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
  case ERROR
      extends DATA_ABSENT_REASON(
        "error",
        Some("Error"),
        Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
  case MASKED
      extends DATA_ABSENT_REASON(
        "masked",
        Some("Masked"),
        Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
  case NEGATIVE_INFINITY
      extends DATA_ABSENT_REASON(
        "negative-infinity",
        Some("Negative Infinity (NINF)"),
        Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
  case NOT_APPLICABLE
      extends DATA_ABSENT_REASON(
        "not-applicable",
        Some("Not Applicable"),
        Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
  case NOT_ASKED
      extends DATA_ABSENT_REASON(
        "not-asked",
        Some("Not Asked"),
        Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
  case NOT_A_NUMBER
      extends DATA_ABSENT_REASON(
        "not-a-number",
        Some("Not a Number (NaN)"),
        Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
  case NOT_PERFORMED
      extends DATA_ABSENT_REASON(
        "not-performed",
        Some("Not Performed"),
        Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
  case NOT_PERMITTED
      extends DATA_ABSENT_REASON(
        "not-permitted",
        Some("Not Permitted"),
        Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
  case POSITIVE_INFINITY
      extends DATA_ABSENT_REASON(
        "positive-infinity",
        Some("Positive Infinity (PINF)"),
        Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
  case TEMPORARILY_UNKNOWN
      extends DATA_ABSENT_REASON(
        "temp-unknown",
        Some("Temporarily Unknown"),
        Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
  case UNKNOWN
      extends DATA_ABSENT_REASON(
        "unknown",
        Some("Unknown"),
        Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
  case UNSUPPORTED
      extends DATA_ABSENT_REASON(
        "unsupported",
        Some("Unsupported"),
        Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
}
object DATA_ABSENT_REASON extends EType[DATA_ABSENT_REASON]("http://hl7.org/fhir/ValueSet/data-absent-reason")

class EnumTest extends AnyFreeSpec with Matchers {
  "enums can be created without throwing weird errors" in {
    val value = DATA_ABSENT_REASON.ASKED_BUT_DECLINED
  }
}
