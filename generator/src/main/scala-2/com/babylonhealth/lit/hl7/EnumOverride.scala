package com.babylonhealth.lit.hl7

import com.babylonhealth.lit.core.model.Coding
import com.babylonhealth.lit.core.{EnumeratumBase, FhirCirceEnum, FhirEnum}

sealed abstract class FHIR_VERSION(override val entryName: String) extends EnumeratumBase with Product with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object FHIR_VERSION extends FhirEnum[FHIR_VERSION] with FhirCirceEnum[FHIR_VERSION] {
  val reference = "http://hl7.org/fhir/ValueSet/FHIR-version"
  val values    = findValues
  case object `0.0.80` extends FHIR_VERSION("0.0.80") {
    def display: Option[String] = Some("0.0.80")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
  case object `0.0.81` extends FHIR_VERSION("0.0.81") {
    def display: Option[String] = Some("0.0.81")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
  case object `0.0.82` extends FHIR_VERSION("0.0.82") {
    def display: Option[String] = Some("0.0.82")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
  case object `0.01` extends FHIR_VERSION("0.01") {
    def display: Option[String] = Some("0.01")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
  case object `0.05` extends FHIR_VERSION("0.05") {
    def display: Option[String] = Some("0.05")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
  case object `0.06` extends FHIR_VERSION("0.06") {
    def display: Option[String] = Some("0.06")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
  case object `0.11` extends FHIR_VERSION("0.11") {
    def display: Option[String] = Some("0.11")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
  case object `0.4.0` extends FHIR_VERSION("0.4.0") {
    def display: Option[String] = Some("0.4.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
  case object `0.5.0` extends FHIR_VERSION("0.5.0") {
    def display: Option[String] = Some("0.5.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
  case object `1.0.0` extends FHIR_VERSION("1.0.0") {
    def display: Option[String] = Some("1.0.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
  case object `1.0.1` extends FHIR_VERSION("1.0.1") {
    def display: Option[String] = Some("1.0.1")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
  case object `1.0.2` extends FHIR_VERSION("1.0.2") {
    def display: Option[String] = Some("1.0.2")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
  case object `1.1.0` extends FHIR_VERSION("1.1.0") {
    def display: Option[String] = Some("1.1.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
  case object `1.4.0` extends FHIR_VERSION("1.4.0") {
    def display: Option[String] = Some("1.4.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
  case object `1.6.0` extends FHIR_VERSION("1.6.0") {
    def display: Option[String] = Some("1.6.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
  case object `1.8.0` extends FHIR_VERSION("1.8.0") {
    def display: Option[String] = Some("1.8.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
  case object `3.0.0` extends FHIR_VERSION("3.0.0") {
    def display: Option[String] = Some("3.0.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
  case object `3.0.1` extends FHIR_VERSION("3.0.1") {
    def display: Option[String] = Some("3.0.1")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
  case object `3.3.0` extends FHIR_VERSION("3.3.0") {
    def display: Option[String] = Some("3.3.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
  case object `3.5.0` extends FHIR_VERSION("3.5.0") {
    def display: Option[String] = Some("3.5.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
  case object `4.0.0` extends FHIR_VERSION("4.0.0") {
    def display: Option[String] = Some("4.0.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
  case object `4.0.1` extends FHIR_VERSION("4.0.1") {
    def display: Option[String] = Some("4.0.1")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
  case object `4.6.0` extends FHIR_VERSION("4.6.0") {
    def display: Option[String] = Some("4.6.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
}