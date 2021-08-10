package com.babylonhealth.lit.protoshim

import com.google.fhir.r4.core.{
  Canonical,
  CodeableConcept,
  Decimal,
  Identifier,
  Meta,
  Observation,
  ObservationStatusCode,
  Period,
  Quantity,
  Reference,
  ReferenceId,
  Uri,
  String => GPBString
}
import io.circe
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

import com.babylonhealth.lit.core.ChoiceImplicits._
import com.babylonhealth.lit.core._
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
        subject = LitReference(reference = Some("Dummy")),
        category = LitSeq(LitCodeableConcept(text = Some("Abstract concept"))),
        value = LitQuantity(value = Some(1.2)),
        effective = choice(LitPeriod(id = Some("period-id"))),
        code = LitCodeableConcept(text = Some("Concrete concept"))
      )
    val protoBMI: Observation = Observation
      .newBuilder()
      .setMeta(Meta
        .newBuilder()
        .addProfile(Canonical.newBuilder().setValue("https://fhir.bbl.health/StructureDefinition/bmi")))
      .addIdentifier(
        Identifier
          .newBuilder()
          .setSystem(Uri.newBuilder().setValue("http://system.foo/bar"))
          .setValue(GPBString.newBuilder.setValue("123"))
      )
      .setStatus(Observation.StatusCode.newBuilder().setValue(ObservationStatusCode.Value.FINAL))
      .setSubject(Reference.newBuilder().setDocumentReferenceId(ReferenceId.newBuilder().setValue("Dummy")))
      .addCategory(CodeableConcept.newBuilder().setText(GPBString.newBuilder().setValue("Abstract concept")))
      .setValue(Observation.ValueX
        .newBuilder()
        .setQuantity(Quantity.newBuilder().setValue(Decimal.newBuilder().setValue("1.2"))))
      .setEffective(Observation.EffectiveX
        .newBuilder()
        .setPeriod(Period.newBuilder().setId(GPBString.newBuilder().setValue("period-id"))))
      .setCode(CodeableConcept.newBuilder().setText(GPBString.newBuilder().setValue("Concrete concept")))
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
      decoded.left.foreach(l => println(s"FAILED THIS: ${l}"))
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
      decoded.left.foreach(l => println(s"FAILED THAT: ${l}"))
      decoded.isRight shouldEqual true
      decoded.right.get shouldEqual bmi
    }
  }
}
