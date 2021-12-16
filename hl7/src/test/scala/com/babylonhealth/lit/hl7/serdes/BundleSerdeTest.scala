package com.babylonhealth.lit.hl7.serdes

import io.circe.Printer
import io.circe.parser.decode
import io.circe.syntax._
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers
import org.skyscreamer.jsonassert.JSONAssert

import com.babylonhealth.lit.core.model.Resource
import com.babylonhealth.lit.core.serdes.{ objectDecoder, objectEncoder }
import com.babylonhealth.lit.core.LitSeq
import com.babylonhealth.lit.hl7.BUNDLE_TYPE
import com.babylonhealth.lit.hl7.model.{ Bundle, Patient }

class BundleSerdeTest extends AnyFreeSpec with Matchers {
  private lazy val printer: Printer = Printer.noSpaces.copy(dropNullValues = true)

  private val bundle = new Bundle(
    meta = None,
    `type` = BUNDLE_TYPE.SEARCHSET,
    entry = LitSeq(
      new Bundle.Entry(
        resource = Some(new Patient(meta = None, id = Some("123")))
      )))

  private val jsonBundle =
    """{"resourceType": "Bundle", "type": "searchset", "entry": [{"resource":{"resourceType": "Patient", "id": "123"}}]}"""

  "Can serialize a Bundle into correct JSON" in {
    JSONAssert.assertEquals(jsonBundle, printer.print(bundle.asJson), true)
  }

  "Can deserialize JSON into Bundle" in {
    decode[Bundle](jsonBundle) shouldEqual Right(bundle)
  }

  "Can deserialize JSON into a Bundle, even when deserializing as a supertype" in {
    decode[Resource](jsonBundle) shouldEqual Right(bundle)
  }
}
