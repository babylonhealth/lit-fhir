package com.babylonhealth.lit.protoshim

import com.google.fhir.r4.core.{
  Canonical,
  CodeableConcept,
  Identifier,
  Meta,
  Observation,
  ObservationStatusCode,
  Period,
  Quantity,
  Reference,
  Uri,
  String => GPBString
}
import io.circe
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

import com.babylonhealth.lit.core.ChoiceImplicits._
import com.babylonhealth.lit.core.LitSeq
import com.babylonhealth.lit.core.model.{
  CodeableConcept => LitCodeableConcept,
  Identifier => LitIdentifier,
  Period => LitPeriod,
  Quantity => LitQuantity,
  Reference => LitReference,
  Resource => LitResource
}
import com.babylonhealth.lit.hl7.OBSERVATION_STATUS
import com.babylonhealth.lit.usbase.model.Bmi

class POCTest extends AnyFreeSpec with Matchers {
  "proto" - {
    val bmi =
      Bmi(
        identifier = LitSeq(LitIdentifier(system = Some("http://system.foo/bar"), value = Some("123"))),
        status = OBSERVATION_STATUS.FINAL,
        subject = LitReference(),
        category = LitSeq(LitCodeableConcept()),
        value = LitQuantity(),
        effective = choice(LitPeriod()),
        code = LitCodeableConcept()
      )
    val protoBMI: Observation = Observation
      .newBuilder()
      .setMeta(Meta
        .newBuilder()
        .addProfile(Canonical.newBuilder().setValue("https://fhir.bbl.health/StructureDefinition/bmi").build()))
      .addIdentifier(
        Identifier
          .newBuilder()
          .setSystem(Uri.newBuilder().setValue("http://system.foo/bar").build())
          .setValue(GPBString.newBuilder.setValue("123").build())
          .build
      )
      .setStatus(Observation.StatusCode.newBuilder().setValue(ObservationStatusCode.Value.FINAL).build())
      .setSubject(Reference.newBuilder().build())
      .addCategory(CodeableConcept.newBuilder().build())
      .setValue(Observation.ValueX.newBuilder().setQuantity(Quantity.newBuilder().build()).build())
      .setEffective(Observation.EffectiveX.newBuilder().setPeriod(Period.newBuilder().build()).build())
      .setCode(CodeableConcept.newBuilder().build())
      .build()
    "json from protopatient" in {
      Translator.printer.print(protoBMI)
    }
    "encodes to proto Message" in {
      val msg = Translator.resourceToMessage(bmi)
    }
    "decodes from proto Message" in {
      val msg     = Translator.resourceToMessage(bmi)
      val decoded = Translator.resourceFromMessage(msg)
      decoded.isRight shouldEqual true
      decoded.right.get shouldEqual bmi
    }
    "encodes to Array[Byte]" in {
      val ser = Translator.resourceToBytes(bmi)
      ser.isEmpty shouldEqual false
    }
    "decodes from Array[Byte]" in {
      val ser: Array[Byte]                          = Translator.resourceToBytes(bmi)
      val decoded: Either[circe.Error, LitResource] = Translator.resourceFromBytes(ser)
      decoded.isRight shouldEqual true
      decoded.right.get shouldEqual bmi
    }
  }
}
