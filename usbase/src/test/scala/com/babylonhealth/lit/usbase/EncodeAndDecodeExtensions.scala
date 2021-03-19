package com.babylonhealth.lit.usbase

import io.circe.parser.decode
import io.circe.syntax._
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

import com.babylonhealth.lit.core.{ Code, DecoderParams }
import com.babylonhealth.lit.core.ChoiceImplicits._
import com.babylonhealth.lit.core.model.{ CodeableConcept, Extension }
import com.babylonhealth.lit.core.serdes.{ objectDecoder, objectEncoder }
import com.babylonhealth.lit.usbase.model.{ Data_absent_reason, Workflow_reasonCode }

class EncodeAndDecodeExtensions extends AnyFreeSpec with Matchers {
  val ext1 = Workflow_reasonCode(value = CodeableConcept(text = Some("foo")))
  val ext2 = Data_absent_reason(value = DATA_ABSENT_REASON.ASKED_BUT_DECLINED)
  val ext1Json =
    """{
      |  "url" : "http://hl7.org/fhir/StructureDefinition/workflow-reasonCode",
      |  "valueCodeableConcept" : {
      |    "text" : "foo"
      |  }
      |}""".stripMargin
  val ext2Json =
    """{
      |  "url" : "http://hl7.org/fhir/StructureDefinition/data-absent-reason",
      |  "valueCode" : "asked-declined"
      |}""".stripMargin
  "encodes an extension with the right url" in {
    val output = ext1.asJson.spaces2SortKeys
    output shouldEqual ext1Json
  }
  "decodes an extension with the right url" in {
    val output = decode[Extension](ext1Json).fold(throw _, identity)
    output shouldEqual ext1
  }
  "decodes an extension with the right url to the right type" in {
    val output = decode[Extension](ext1Json).fold(throw _, identity)
    output.companion shouldEqual Workflow_reasonCode
  }
  "encodes an extension with the right url and an enum value" in {
    val output = ext2.asJson.spaces2SortKeys
    output shouldEqual ext2Json
  }
  "decodes an extension with the right url and an enum value" in {
    val output = decode[Extension](ext2Json).fold(throw _, identity)
    output shouldEqual ext2
  }
  "decodes an extension with the right url and an enum value to the right type" in {
    val output = decode[Extension](ext2Json).fold(throw _, identity)
    output.companion shouldEqual Data_absent_reason
  }
  "when extension errors are permitted" - {
    implicit val params = DecoderParams(tolerateExtensionErrors = true)
    "decodes to a generic extension if value is illegal in enum Code field" in {
      val extJson =
        """{
          |  "url" : "http://hl7.org/fhir/StructureDefinition/data-absent-reason",
          |  "valueCode" : "idksorry"
          |}""".stripMargin
      val output = decode[Extension](extJson).fold(throw _, identity)
      output shouldEqual Extension(
        url = "http://hl7.org/fhir/StructureDefinition/data-absent-reason",
        value = Some(choice("idksorry": Code)))
    }
    "decodes to a generic extension if value is wrong type" in {
      val extJson =
        """{
          |  "url" : "http://hl7.org/fhir/StructureDefinition/data-absent-reason",
          |  "valueString" : "asked-declined"
          |}""".stripMargin
      val output = decode[Extension](extJson).fold(throw _, identity)
      output shouldEqual Extension(
        url = "http://hl7.org/fhir/StructureDefinition/data-absent-reason",
        value = Some(choice("asked-declined")))
    }
    "decodes to a generic extension if url is unknown" in {
      val extJson =
        """{
          |  "url" : "http://hl7.org/fhir/StructureDefinition/idksorry",
          |  "valueString" : "Hi"
          |}""".stripMargin
      val output = decode[Extension](extJson).fold(throw _, identity)
      output shouldEqual Extension(url = "http://hl7.org/fhir/StructureDefinition/idksorry", value = Some(choice("Hi")))
    }
  }
  "when extension errors are forbidden" - {
    implicit val params = DecoderParams(tolerateExtensionErrors = false)
    "fails to decode an extension if value is illegal in enum Code field" in {
      val extJson =
        """{
          |  "url" : "http://hl7.org/fhir/StructureDefinition/data-absent-reason",
          |  "valueCode" : "idksorry"
          |}""".stripMargin
      val output = decode[Extension](extJson)
      output.isLeft shouldEqual true
      output.left.get.getMessage shouldEqual "'idksorry' is not in http://hl7.org/fhir/ValueSet/data-absent-reason.: DownField(valueCode)"
    }
    "fails to decode an extension if value is wrong type" in {
      val extJson =
        """{
          |  "url" : "http://hl7.org/fhir/StructureDefinition/data-absent-reason",
          |  "valueString" : "asked-declined"
          |}""".stripMargin
      val output = decode[Extension](extJson)
      output.isLeft shouldEqual true
      output.left.get.getMessage shouldEqual "No value found for required field 'valueCode'"
    }
    "still decodes to a generic extension if url is unknown" in {
      val extJson =
        """{
          |  "url" : "http://hl7.org/fhir/StructureDefinition/idksorry",
          |  "valueString" : "Hi"
          |}""".stripMargin
      val output = decode[Extension](extJson).fold(throw _, identity)
      output shouldEqual Extension(url = "http://hl7.org/fhir/StructureDefinition/idksorry", value = Some(choice("Hi")))
    }
  }
}
