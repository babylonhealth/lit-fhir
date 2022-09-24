package com.babylonhealth.lit.hl7

import java.time.ZonedDateTime

import io.circe.{ DecodingFailure, Json }
import io.circe.parser.decode
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

import com.babylonhealth.lit.core.ChoiceImplicits._
import com.babylonhealth.lit.core.model.{ CodeableConcept, Coding, Extension, Quantity, Reference, Resource }
import com.babylonhealth.lit.core.serdes.objectDecoder
import com.babylonhealth.lit.core._
import com.babylonhealth.lit.hl7.OBSERVATION_STATUS
import com.babylonhealth.lit.hl7.model.Observation

class Regressions extends AnyFreeSpec with Matchers {
  "quantity with invalid extension should throw on decode" in {
    val res = decode[Quantity]("""{
                                 |    "extension": {
                                 |      "url":"http://extension.com/wat",
                                 |      "valueString":"wat"
                                 |    },
                                 |    "value": 283,
                                 |    "code": "10*9/L",
                                 |    "system": "http://unitsofmeasure.org"
                                 |  }
                                 |""".stripMargin)
    res.isLeft shouldEqual true
    res.left.get.getMessage should include("expecting array")
  }
  "resource with invalid extension in quantity should throw on decode" in {
    val res = decode[Resource]("""{
                                 |  "resourceType": "Observation",
                                 |  "id": "030cfd1231eb76c279236ebcc419341c",
                                 |  "status": "final",
                                 |  "code": {
                                 |    "coding": [
                                 |      {
                                 |        "system": "SNOMED",
                                 |        "code": "1022651000000100"
                                 |      }
                                 |    ]
                                 |  },
                                 |  "effectiveDateTime": "2019-11-07T17:27:00Z",
                                 |  "valueQuantity": {
                                 |    "extension": {
                                 |      "url":"http://extension.com/wat",
                                 |      "valueString":"wat"
                                 |    },
                                 |    "value": 283,
                                 |    "code": "10*9/L",
                                 |    "system": "http://unitsofmeasure.org"
                                 |  },
                                 |  "issued": "2017-01-01T00:00:00Z",
                                 |  "subject": {
                                 |    "reference": "Patient/420420"
                                 |  }
                                 |}
                                 |""".stripMargin)
    res.isLeft shouldEqual true
    res.left.get.getMessage should include("expecting array")
  }
  "resource with extension-as-an-object in quantity should decode if flexibleCardinality=true" in {
    implicit val params: DecoderParams = DecoderParams(flexibleCardinality = true)
    val res = decode[Resource]("""{
                                 |  "resourceType": "Observation",
                                 |  "id": "030cfd1231eb76c279236ebcc419341c",
                                 |  "status": "final",
                                 |  "code": {
                                 |    "coding": [
                                 |      {
                                 |        "system": "SNOMED",
                                 |        "code": "1022651000000100"
                                 |      }
                                 |    ]
                                 |  },
                                 |  "effectiveDateTime": "2019-11-07T17:27:00Z",
                                 |  "valueQuantity": {
                                 |    "extension": {
                                 |      "url":"http://extension.com/wat",
                                 |      "valueString":"wat"
                                 |    },
                                 |    "value": 283,
                                 |    "code": "10*9/L",
                                 |    "system": "http://unitsofmeasure.org"
                                 |  },
                                 |  "subject": {
                                 |    "reference": "Patient/420420"
                                 |  }
                                 |}
                                 |""".stripMargin)
    res.isRight shouldEqual true
    res.right.get shouldEqual Observation(
      id = Some("030cfd1231eb76c279236ebcc419341c"),
      status = OBSERVATION_STATUS.FINAL,
      code = CodeableConcept(coding = LitSeq(Coding(system = Some("SNOMED"), code = Some("1022651000000100")))),
      effective = Some(choice(FHIRDateTime(ZonedDateTime.parse("2019-11-07T17:27:00Z")))),
      value = Some(
        choice(Quantity(
          value = Some(283),
          code = Some("10*9/L"),
          system = Some("http://unitsofmeasure.org"),
          extension = LitSeq(Extension(url = "http://extension.com/wat", value = Some(choice("wat"))))
        ))),
      subject = Some(Reference(reference = Some("Patient/420420")))
    )
  }

  "FHIR object decoders should fail if attempting to decode a json type that isn't an object" in {
    implicit val decoderParams: DecoderParams = DecoderParams()
    val x                                     = CodeableConcept.decoder.decodeJson(Json.fromString("asd"))
    x should matchPattern { case Left(DecodingFailure("Cannot decode a json String as a FHIR object", _)) =>
    }
    val y = CodeableConcept.decoder.decodeJson(Json.arr())
    y should matchPattern { case Left(DecodingFailure("Cannot decode a json Array as a FHIR object", _)) =>
    }
  }

}
