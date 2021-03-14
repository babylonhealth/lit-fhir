package com.babylonhealth.lit.uscore

import java.time.ZonedDateTime

import io.circe.Error.showError
import io.circe.parser.decode
import io.circe.syntax._
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

import com.babylonhealth.lit.core.ChoiceImplicits._
import com.babylonhealth.lit.core.serdes.{ objectDecoder, objectEncoder }
import com.babylonhealth.lit.core.model.{ Attachment, CodeableConcept, Coding, Identifier, Reference }
import com.babylonhealth.lit.core.{ Choice, FHIRDateTime, LitSeq }
import com.babylonhealth.lit.hl7.model.Observation.ReferenceRange
import com.babylonhealth.lit.hl7.{ DIAGNOSTIC_REPORT_STATUS, OBSERVATION_STATUS }
import com.babylonhealth.lit.usbase.model.Triglyceride
import com.babylonhealth.lit.uscore.model.Us_core_observation_lab

class FromListAsTest extends AnyFreeSpec with Matchers {
  val triglyc: Triglyceride = Triglyceride(
    status = OBSERVATION_STATUS.AMENDED,
    effective = Some(choice(FHIRDateTime(ZonedDateTime.parse("2020-03-09T18:40:27.972Z")))),
    subject = Some(Reference(reference = Some("patient-123"))),
    code =
      CodeableConcept(coding = LitSeq(Coding(system = Some("http://codingsystem.lo.wut"), code = Some("....IDK")))),
    referenceRange = ReferenceRange(text = Some("Some text"))
  )
  val triglycWInt: Triglyceride = triglyc.withInterpretation(Some(CodeableConcept(text = Some("hi"))))

  val refRange =
    """,
      |  "referenceRange" : [
      |    {
      |      "text" : "Some text"
      |    }
      |  ]""".stripMargin
  val refRanges =
    """,
      |  "referenceRange" : [
      |    {
      |      "text" : "Some text"
      |    },
      |    {
      |      "text" : "Some text 2"
      |    }
      |  ]""".stripMargin
  val interpretation =
    """,
      |  "interpretation" : [
      |    {
      |      "text" : "hi"
      |    }
      |  ]""".stripMargin
  val interpretations =
    """,
      |  "interpretation" : [
      |    {
      |      "text" : "hi"
      |    }, {
      |      "text" : "ho"
      |    }
      |  ]""".stripMargin
  def triglyceride(rr: String = refRange, interpretation: String = "") =
    s"""{
       |  "code" : {
       |    "coding" : [
       |      {
       |        "code" : "....IDK",
       |        "system" : "http://codingsystem.lo.wut"
       |      }
       |    ]
       |  },
       |  "effectiveDateTime" : "2020-03-09T18:40:27.972Z"$interpretation,
       |  "meta" : {
       |    "profile" : [
       |      "http://hl7.org/fhir/StructureDefinition/triglyceride"
       |    ]
       |  }$rr,
       |  "resourceType" : "Observation",
       |  "status" : "amended",
       |  "subject" : {
       |    "reference" : "patient-123"
       |  }
       |}""".stripMargin
  "sanity check" in {
    val encoded = triglyc.asJson.spaces2SortKeys
    val decoded = decode[Triglyceride](encoded).fold(throw _, identity)
    decoded shouldEqual triglyc
    encoded shouldEqual triglyceride()
  }

  "decodes an optional decodeFromListAs field correctly when present" in {
    val full      = triglyceride(interpretation = interpretation)
    val x         = triglycWInt
    val encoded   = x.asJson.spaces2SortKeys
    val decoded   = decode[Triglyceride](full).fold(throw _, identity)
    val redecoded = decode[Triglyceride](encoded).fold(throw _, identity)
    decoded shouldEqual x
    redecoded shouldEqual x
  }
  "gives a good error message when missing an exactly-once field that inherits from a listy field" in {
    val full    = triglyceride(rr = "")
    val decoded = decode[Triglyceride](full)
    decoded.isLeft shouldEqual true
    val err = decoded.left.get
    err.getMessage should include("Could not find required field referenceRange")
  }
  "gives a good error message when there are too many elements for a listy field that's inherited by a non-listy optional child" in {
    val full    = triglyceride(interpretation = interpretations)
    val decoded = decode[Triglyceride](full)
    decoded.isLeft shouldEqual true
    val err = decoded.left.get
    err.getMessage should include(
      "Too many elements provided for field interpretation - a maximum of one element is permitted")
  }
  "gives a good error message when there are too many elements for a listy field that's inherited by a non-listy non-optional child" in {
    val full    = triglyceride(rr = refRanges)
    val decoded = decode[Triglyceride](full)
    decoded.isLeft shouldEqual true
    val err = decoded.left.get
    err.getMessage should include(
      "Too many elements provided for field referenceRange - a maximum of one element is permitted")
  }
  "gives a good error message when decoding an empty array to a NonEmptyLitSeq" in {
    val full =
      s"""{
         |  "category": [],
         |  "code": { "text" : "foo" },
         |  "status" : "final",
         |  "subject" : {
         |    "reference" : "patient-123"
         |  },
         |  "value" : {}
         |}""".stripMargin
    val decoded = decode[Us_core_observation_lab](full)
    decoded.isLeft shouldEqual true
    val err = decoded.left.get
    err.getMessage should include("Non-empty seq can't be empty")
    err.getMessage should include("DownField(category)")
  }
  "gives a good error message when we see an object where we should see an array" in {

    val full =
      s"""{
         |  "category": { "text" : "foo" },
         |  "code": { "text" : "foo" },
         |  "status" : "final",
         |  "subject" : {
         |    "reference" : "patient-123"
         |  },
         |  "effectiveDateTime" : "2020-03-09T18:40:27.972Z",
         |  "value" : {},
         |  "result" : {}
         |}""".stripMargin
    val decoded = decode[Us_core_observation_lab](full)
    decoded.isLeft shouldEqual true
    val err = decoded.left.get
    // This should be good enough to infer that the expected field should be an array
    err.getMessage should include("Expected an array: DownField(category)")
    showError.show(err) shouldEqual "DecodingFailure at .category: Expected an array"
  }
}
