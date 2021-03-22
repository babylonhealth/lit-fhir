package com.babylonhealth.lit.uscore.examples

import java.time.{ ZoneOffset, ZonedDateTime }
import java.time.temporal.ChronoUnit

import io.circe.parser.decode
import io.circe.syntax._
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers
import org.skyscreamer.jsonassert.JSONAssert

import com.babylonhealth.lit.core.FHIRDateTimeSpecificity.Time
import com.babylonhealth.lit.core.LitSeq
import com.babylonhealth.lit.core.model.{ CodeableConcept, Coding, Reference, Resource }
import com.babylonhealth.lit.core.serdes.{ objectDecoder, objectEncoder }
import com.babylonhealth.lit.hl7.OBSERVATION_STATUS
import com.babylonhealth.lit.uscore.model.Us_core_smokingstatus

class SmokingstatusExampleTest extends AnyFreeSpec with Matchers {
  private val time: ZonedDateTime = ZonedDateTime.now(ZoneOffset.ofHours(5)).truncatedTo(ChronoUnit.MILLIS)

  // TODO: To what degree can code and value[x] fields be constrained (and auto-populated) by the bound valueSets?
  val example: Us_core_smokingstatus = Us_core_smokingstatus(
    code = CodeableConcept(coding = LitSeq(Coding(system = Some("http://loinc.org"), code = Some("72166-2")))),
    status = OBSERVATION_STATUS.FINAL,
    issued = time,
    subject = Reference(reference = Some("Patient/1234567890")),
    value = CodeableConcept(coding = LitSeq(Coding(system = Some("http://snomed.info/sct"), code = Some("266927001"))))
  )

  val jsonStr: String =
    s"""{"resourceType":"Observation",
       |"meta":{"profile":["${Us_core_smokingstatus.profileUrl.get}"]},
       |"code":{"coding":[{"system":"http://loinc.org","code":"72166-2"}]},
       |"status":"final",
       |"issued":"${Time.dtFormatter.format(time)}",
       |"subject":{"reference":"Patient/1234567890"},
       |"valueCodeableConcept":{"coding":[{"system":"http://snomed.info/sct","code":"266927001"}]}}""".stripMargin

  "encodes" in {
    val exampleAsJson = example.asJson.noSpaces
    JSONAssert.assertEquals(jsonStr, exampleAsJson, true)
  }

  "decodes" in {
    val jsonAsResource = decode[Resource](jsonStr).fold(throw _, identity)
    jsonAsResource shouldEqual example
  }
}
