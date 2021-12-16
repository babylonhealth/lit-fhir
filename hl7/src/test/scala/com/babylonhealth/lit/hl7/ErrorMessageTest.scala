package com.babylonhealth.lit.hl7

import io.circe
import io.circe.CursorOp.{ DownArray, DownField }
import io.circe.parser.decode
import io.circe.{ Decoder, DecodingFailure }
import org.scalatest.Inside
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

import com.babylonhealth.lit.core.model.Resource
import com.babylonhealth.lit.core.serdes.objectDecoder
import com.babylonhealth.lit.hl7.model.Observation

class ErrorMessageTest extends AnyFreeSpec with Matchers with Inside {
  "error message" - {

    "should clearly reference the bad field" in {
      val msg = errorMessageWhenDecoding[Resource]("""{"resourceType": "Communication"}""")
      msg should include.regex("'((Communication)?\\.)?status'")
    }

    // Debatable behaviour - maybe we need to separate different kinds of error messages: those that we want
    // devs using lit to see (e.g. chr-conformance) and those that we want CHR users to see (e.g. Pensieve users).
    "shouldn't reference Scala packages" in {
      val msg = errorMessageWhenDecoding[Resource]("""{"resourceType": "Communication"}""")
      msg should not include "com.babylonhealth."
    }

    "shouldn't mention phantom values when a field is missing" in {
      val msg = errorMessageWhenDecoding[Resource]("""{"resourceType": "Communication"}""")
      msg should not include "phantom"
    }

    "shouldn't mention boring target types like `Resource`" in {
      val msg = errorMessageWhenDecoding[Resource]("""{"resourceType": "Communication"}""")
      msg should (include("Communication") and (not include "Resource"))
    }

//    "should mention interesting target types like `Us_core_condition`" in {
//      val msg = errorMessageWhenDecoding[Us_core_condition]("""{"resourceType": "Observation"}""")
//      msg should include("Observation as Us_core_condition")
//    }

    "shouldn't mention target type when it's the same as the resource" in {
      val msg = errorMessageWhenDecoding[Observation]("""{"resourceType": "Observation"}""")
      msg should (include("Observation") and (not include "Observation as Observation"))
    }

    "should print URL of valuesets" in {
      val msg = errorMessageWhenDecoding[Resource]("""{"resourceType": "Communication", "status": "final"}""")
      msg should include("http://hl7.org/fhir/ValueSet/event-status")
    }

    "when valueset is small, list valid options" in {
      val msg = errorMessageWhenDecoding[Resource]("""{"resourceType": "Communication", "status": "final"}""")
      msg should (include("preparation") and include("in-progress") and include("not-done"))
    }

    "should not repeat the path" in {
      val error = errorWhenDecoding[Resource]("""
                                                |{
                                                |  "resourceType": "Bundle",
                                                |  "type": "SEARCHSET",
                                                |  "entry": [{
                                                |    "resource": {
                                                |      "resourceType": "Communication"
                                                |    }
                                                |  }]
                                                |}""".stripMargin)

      // We assume the path is already in d.history
      inside(error) { case d: DecodingFailure =>
        d.message should ((not include "DownField(resource)") and (not include "entry[0].resource"))
      }
    }
  }

  "path" - {
    "should reference parent of missing field" in {
      val error = errorWhenDecoding[Resource]("""{"resourceType": "Communication"}""")
      inside(error) { case d: DecodingFailure =>
        d.history shouldBe List()
      }
    }

    "should reference bad field" in {
      val error = errorWhenDecoding[Resource]("""{"resourceType": "Communication", "status": "final"}""")
      inside(error) { case d: DecodingFailure =>
        d.history shouldBe List(DownField("status"))
      }
    }

    "should navigate through bundles" in {
      val error = errorWhenDecoding[Resource]("""
                                                |{
                                                |  "resourceType": "Bundle",
                                                |  "type": "searchset",
                                                |  "entry": [{
                                                |    "resource": {
                                                |      "resourceType": "Communication"
                                                |    }
                                                |  }]
                                                |}""".stripMargin)

      inside(error) { case d: DecodingFailure =>
        d.history shouldBe List(DownField("resource"), DownArray, DownField("entry"))
      }
    }
  }

  def errorWhenDecoding[A: Decoder](str: String): circe.Error =
    decode[A](str).left.getOrElse(fail(s"Expected decoding '$str' to fail, but it succeeded"))

  def errorMessageWhenDecoding[A: Decoder](str: String): String = errorWhenDecoding[A](str).getMessage
}
