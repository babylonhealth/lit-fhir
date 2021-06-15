package com.babylonhealth.lit.uscore

import java.time.ZonedDateTime

import scala.util.{ Success, Try }

import io.circe.Decoder
import io.circe.parser.decode
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

import com.babylonhealth.lit.common.FileUtils
import com.babylonhealth.lit.core.ChoiceImplicits._
import com.babylonhealth.lit.core.model.{ CodeableConcept, Coding, HumanName, Meta, Quantity, Reference, Resource }
import com.babylonhealth.lit.core.serdes.objectDecoder
import com.babylonhealth.lit.core.{ Config, DecoderParams, FHIRDateTime, LitSeq }
import com.babylonhealth.lit.hl7.model.Observation.ReferenceRange
import com.babylonhealth.lit.hl7.{ BUNDLE_TYPE, OBSERVATION_STATUS }
import com.babylonhealth.lit.hl7.model._
import com.babylonhealth.lit.usbase.model.{ Bodyheight, Triglyceride }

class SerdeParameterisationTest extends AnyFreeSpec with Matchers with FileUtils {
  def tryDecode[T: Decoder](filename: String): Try[T] = decode[T](slurpRsc(filename)).toTry

  val bodyheight = Bodyheight(
    status = OBSERVATION_STATUS.FINAL,
    issued = Some(ZonedDateTime.parse("2020-03-09T18:40:27.971Z")),
    effective = choice(FHIRDateTime(ZonedDateTime.parse("2020-03-09T18:40:27.972Z"))),
    subject = Reference(reference = Some("patient-123")),
    code = CodeableConcept(
      coding = LitSeq( // TODO: constants should be accessible from library for common use case construction
        Coding(system = Some("http://codingsystem.lo.wut"), code = Some("....IDK")))),
    value = Some(Quantity()),
    category =
      LitSeq(CodeableConcept(coding = LitSeq(Coding(system = Some("http://category.system"), code = Some("foo")))))
  )

  "decoder params" - {
    "defaults to the config parameter" in {
      val decodedBadBundle = tryDecode[Bundle]("badBundle.json")
      if (Config.tolerantBundleDecoding && Config.tolerateProfileErrors) decodedBadBundle should matchPattern {
        case Success(b: Bundle) if b.entry.size == 2 =>
      }
      else if (Config.tolerantBundleDecoding && !Config.tolerateProfileErrors) decodedBadBundle should matchPattern {
        case Success(b: Bundle) if b.entry.size == 1 =>
      }
      else if (!Config.tolerantBundleDecoding && Config.tolerateProfileErrors) decodedBadBundle should matchPattern {
        case Success(b: Bundle) if b.entry.size == 2 =>
      }
      else decodedBadBundle.isFailure shouldEqual true
    }
  }
  "tolerantBundleDecoding" - {
    val oneElementBundle: Bundle = Bundle(
      `type` = BUNDLE_TYPE.COLLECTION,
      entry = LitSeq(Bundle.Entry(resource = Some(bodyheight)))
    )
    def badBundleSucceeds(decodedBadBundle: Try[Bundle]) =
      decodedBadBundle should matchPattern { case Success(`oneElementBundle`) =>
      }
    "fails if implicit param tolerantBundleDecoding=false" in {
      implicit val params: DecoderParams = DecoderParams(tolerantBundleDecoding = false)
      val decodedBadBundle               = tryDecode[Bundle]("badBundle.json")
      decodedBadBundle.isFailure shouldEqual true
    }
    "succeeds if implicit param tolerantBundleDecoding=true" in {
      implicit val params: DecoderParams = DecoderParams(tolerantBundleDecoding = true, tolerateProfileErrors = false)
      val decodedBadBundle               = tryDecode[Bundle]("badBundle.json")
      badBundleSucceeds(decodedBadBundle)
    }
  }

  "ignoreUnknownFields" - {
    val resource: Triglyceride = Triglyceride(
      status = OBSERVATION_STATUS.AMENDED,
      effective = Some(choice(FHIRDateTime(ZonedDateTime.parse("2020-03-09T18:40:27.972Z")))),
      subject = Some(Reference(reference = Some("patient-123"))),
      code =
        CodeableConcept(coding = LitSeq(Coding(system = Some("http://codingsystem.lo.wut"), code = Some("....IDK")))),
      referenceRange = ReferenceRange()
    )
    def isSuccessful(decodedBadBundle: Try[Resource]) =
      decodedBadBundle should matchPattern { case Success(`resource`) =>
      }

    def mk(middle: String = "") =
      s"""{
         |  "resourceType" : "Observation",
         |  "meta" : {
         |    "profile" : [
         |      "http://hl7.org/fhir/StructureDefinition/triglyceride"
         |    ]
         |  },
         |  "status" : "amended",
         |  "effectiveDateTime": "2020-03-09T18:40:27.972Z",
         |  "code": {
         |    "coding": [
         |      {
         |        "system": "http://codingsystem.lo.wut",
         |        "code": "....IDK"
         |      }
         |    ]
         |  },
         |  "subject" : {
         |    "reference" : "patient-123"
         |  },
         |  "referenceRange": [{}]$middle
         |}""".stripMargin
    // The Triglyceride profile disallows derivedFrom, so it should be either ignored, or throw an error, depending on the setting
    val containsDisallowedField = mk(""",
                                       |  "derivedFrom": [
                                       |    {
                                       |      "reference": "foo"
                                       |    }
                                       |  ]""".stripMargin)
    "fails if implicit param ignoreUnknownFields=false" in {
      implicit val params: DecoderParams = DecoderParams(ignoreUnknownFields = false)
      val decodedBadResource             = decode[Triglyceride](containsDisallowedField).toTry
      decodedBadResource.isFailure shouldEqual true
    }
    "succeeds if implicit param ignoreUnknownFields=true" in {
      implicit val params: DecoderParams = DecoderParams(ignoreUnknownFields = true)
      val decodedBadResource             = decode[Triglyceride](containsDisallowedField).toTry
      isSuccessful(decodedBadResource)
    }
    "succeeds on legal resource if implicit param ignoreUnknownFields=false" in {
      implicit val params: DecoderParams = DecoderParams(ignoreUnknownFields = false)
      isSuccessful(decode[Triglyceride](mk()).toTry)
    }
  }

  "tolerateProfileErrors" - {
    val twoElementBundle: Bundle = Bundle(
      `type` = BUNDLE_TYPE.COLLECTION,
      entry = LitSeq(
        Bundle.Entry(resource = Some(bodyheight)),
        Bundle.Entry(
          resource = Some(Observation(
            meta = Some(Meta(profile = LitSeq("http://hl7.org/fhir/StructureDefinition/bodyheight"))),
            status = OBSERVATION_STATUS.FINAL,
            issued = Some(ZonedDateTime.parse("2020-03-09T10:40:27.971Z")),
            effective = Some(choice(FHIRDateTime(ZonedDateTime.parse("2020-03-09T10:40:27.972Z")))),
            code = CodeableConcept(
              coding = LitSeq( // TODO: constants should be accessible from library for common use case construction
                Coding(system = Some("http://codingsystem.lo.wut"), code = Some("....Yes?")))),
            value = Some(choice("String value"))
          )))
      )
    )
    def badBundleSucceeds(decodedBadBundle: Try[Bundle]) =
      decodedBadBundle should matchPattern { case Success(`twoElementBundle`) =>
      }
    "fails if implicit param tolerateProfileErrors=false" in {
      implicit val params: DecoderParams = DecoderParams(tolerantBundleDecoding = false)
      val decodedBadBundle               = tryDecode[Bundle]("badBundle.json")
      decodedBadBundle.isFailure shouldEqual true
    }
    "succeeds if implicit param tolerateProfileErrors=true" in {
      implicit val params: DecoderParams = DecoderParams(tolerantBundleDecoding = false, tolerateProfileErrors = true)
      val decodedBadBundle               = tryDecode[Bundle]("badBundle.json")
      badBundleSucceeds(decodedBadBundle)
    }
  }

  "flexibleCardinality" - {
    val bad =
      """{
        |    "family": "Sanchez",
        |    "given": "Rick"
        |}""".stripMargin
    "fails if array field is given as object if flexibleCardinality=false" in {
      implicit val params: DecoderParams = DecoderParams(flexibleCardinality = false)
      val decoded                        = decode[HumanName](bad)
      decoded.isLeft shouldEqual true
    }
    "succeeds if array field is given as object if flexibleCardinality=true" in {
      implicit val params: DecoderParams = DecoderParams(flexibleCardinality = true)
      val decoded                        = decode[HumanName](bad)
      decoded.isRight shouldEqual true
      decoded.right.get shouldEqual HumanName(family = Some("Sanchez"), `given` = LitSeq("Rick"))
    }
    "succeeds if array field is given as object if flexibleCardinality=true, even if it gets decoded via the decodeFromListAs path" in {
      val x1 = Triglyceride(
        status = OBSERVATION_STATUS.AMENDED,
        effective = Some(choice(FHIRDateTime(ZonedDateTime.parse("2020-03-09T18:40:27.972Z")))),
        subject = Some(Reference(reference = Some("patient-123"))),
        code =
          CodeableConcept(coding = LitSeq(Coding(system = Some("http://codingsystem.lo.wut"), code = Some("....IDK")))),
        referenceRange = ReferenceRange()
      )
      val x2 = x1.withInterpretation(Some(CodeableConcept(text = Some("hi"))))
      def bad(rr: String, interpretation: String) =
        s"""{
           |  "resourceType" : "Observation",
           |  "meta" : {
           |    "profile" : [
           |      "http://hl7.org/fhir/StructureDefinition/triglyceride"
           |    ]
           |  },
           |  "code" : {
           |    "coding": [
           |      {
           |        "system": "http://codingsystem.lo.wut",
           |        "code": "....IDK"
           |      }
           |    ]
           |  },
           |  "status" : "amended",
           |  "effectiveDateTime": "2020-03-09T18:40:27.972Z",
           |  "subject" : {
           |    "reference" : "patient-123"
           |  },
           |  "referenceRange": $rr$interpretation
           |}""".stripMargin
      implicit val params: DecoderParams = DecoderParams(flexibleCardinality = true)
      decode[Triglyceride](bad("[{}]", "")).right.get shouldEqual x1
      decode[Triglyceride](bad("{}", "")).right.get shouldEqual x1
      decode[Triglyceride](bad("{}", ""","interpretation":[{"text":"hi"}] """)).right.get shouldEqual x2
      decode[Triglyceride](bad("{}", ""","interpretation":{"text":"hi"} """)).right.get shouldEqual x2
    }

  }
}
