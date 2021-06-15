package com.babylonhealth.lit.uscore.examples

import java.time.{ ZoneOffset, ZonedDateTime }
import java.time.temporal.ChronoUnit

import io.circe.parser.decode
import io.circe.syntax._
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers
import org.skyscreamer.jsonassert.JSONAssert

import com.babylonhealth.lit.core.ChoiceImplicits._
import com.babylonhealth.lit.core._
import com.babylonhealth.lit.core.model.{ CodeableConcept, Coding, Quantity, Reference, Resource }
import com.babylonhealth.lit.core.serdes.{ objectDecoder, objectEncoder }
import com.babylonhealth.lit.hl7.OBSERVATION_STATUS
import com.babylonhealth.lit.uscore.model.Us_core_pulse_oximetry

class Pulse_oximetryExampleTest extends AnyFreeSpec with Matchers {
  private val time: FHIRDateTime = FHIRDateTime(ZonedDateTime.now(ZoneOffset.ofHours(5)).truncatedTo(ChronoUnit.MILLIS))

  val example: Us_core_pulse_oximetry = Us_core_pulse_oximetry(
    code = CodeableConcept(coding = LitSeq(
      Coding(system = Some("http://loinc.org"), code = Some("2708-6")),
      Coding(system = Some("http://loinc.org"), code = Some("59408-5")))),
    status = OBSERVATION_STATUS.FINAL,
    subject = Reference(reference = Some("Patient/1234567890")),
    category = LitSeq(
      CodeableConcept(coding = LitSeq(
        Coding(
          system = Some("http://terminology.hl7.org/CodeSystem/observation-category"),
          code = Some("vital-signs"))))),
    effective = choice(time),
    value =
      Some(Quantity(system = Some("http://unitsofmeasure.org"), value = Some(94.3), code = Some("%"), unit = Some("%")))
  )

  val jsonStr: String =
    s"""{"resourceType":"Observation",
       |"meta":{"profile":["${Us_core_pulse_oximetry.profileUrl.get}"]},
       |"code":{"coding":[{"system":"http://loinc.org","code":"2708-6"},{"system":"http://loinc.org","code":"59408-5"}]},
       |"status":"final",
       |"subject":{"reference":"Patient/1234567890"},
       |"category":[{"coding":[{"system":"http://terminology.hl7.org/CodeSystem/observation-category","code":"vital-signs"}]}],
       |"effectiveDateTime":"${time.fmt}",
       |"valueQuantity":{"system":"http://unitsofmeasure.org","code":"%","unit":"%","value":94.3}}""".stripMargin

  "encodes" in {
    val exampleAsJson = example.asJson.noSpaces
    JSONAssert.assertEquals(jsonStr, exampleAsJson, true)
  }

  "decodes" in {
    val jsonAsResource = decode[Resource](jsonStr).fold(throw _, identity)
    jsonAsResource shouldEqual example
  }
}
