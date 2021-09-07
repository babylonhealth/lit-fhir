package com.babylonhealth.lit.bench

import java.time.temporal.ChronoUnit
import java.time.{ZoneId, ZonedDateTime}
import java.util.{Date, List => JList}

import ca.uhn.fhir.context.FhirContext
import ca.uhn.fhir.model.api.TemporalPrecisionEnum
import com.google.fhir.r4.core.DateTime.Precision
import com.google.fhir.r4.core.Observation.{EffectiveX, ValueX}
import com.google.fhir.r4.core.{Canonical => GPBCanonical, Code => GPBCode, CodeableConcept => GPBCodeableConcept, Coding => GPBCoding, DateTime => GPBDateTime, Decimal => GPBDecimal, Identifier => GPBIdentifier, Meta => GPBMeta, Observation => GPBObservation, ObservationStatusCode => GPBObservationStatusCode, Quantity => GPBQuantity, Reference => GPBReference, ReferenceId => GPBReferenceId, String => GPBString, Uri => GPBUri}
import com.google.fhir.stu3.proto.{Bmi => STU3Bmi, Code => STU3Code, CodeableConcept => STU3CodeableConcept, Coding => STU3Coding, DateTime => STU3DateTime, Decimal => STU3Decimal, Identifier => STU3Identifier, Meta => STU3Meta, ObservationStatusCode => STU3ObservationStatusCode, Quantity => STU3Quantity, Reference => STU3Reference, ReferenceId => STU3ReferenceId, String => STU3String, Uri => STU3Uri}
import io.circe.syntax._
import org.hl7.fhir.r4.model.Observation.ObservationStatus
import org.hl7.fhir.r4.model.{CodeableConcept => HAPICodeableConcept, Coding => HAPICoding, DateTimeType => HAPIDateTimeType, Identifier => HAPIIdentifier, Meta => HAPIMeta, Observation => HAPIObservation, Quantity => HAPIQuantity, Reference => HAPIReference}
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers
import org.skyscreamer.jsonassert.JSONAssert

import com.babylonhealth.lit.core.ChoiceImplicits._
import com.babylonhealth.lit.core.model.{CodeableConcept, Coding, Identifier, Quantity, Reference}
import com.babylonhealth.lit.core.serdes.objectEncoder
import com.babylonhealth.lit.core.{FHIRDateTime, LitSeq, NonEmptyLitSeq}
import com.babylonhealth.lit.hl7.OBSERVATION_STATUS
import com.babylonhealth.lit.protoshim.Translator
import com.babylonhealth.lit.usbase.model.Bmi

trait ExampleConstructors {

  def mkCategoriesHapi: JList[HAPICodeableConcept] = JList.of(
    new HAPICodeableConcept(
      new HAPICoding()
        .setSystem("http://terminology.hl7.org/CodeSystem/observation-category")
        .setCode("vital-signs")))
  def mkEffectiveQuantityHapi(value: Double): HAPIQuantity =
    new HAPIQuantity().setSystem("http://unitsofmeasure.org").setCode("kg/m2").setUnit("bmi").setValue(value)
  def mkEffectiveChoiceHapi(ts: ZonedDateTime): HAPIDateTimeType =
    new HAPIDateTimeType(Date.from(ts.toInstant), TemporalPrecisionEnum.MILLI)
  def mkBmiHapi(ts: ZonedDateTime, value: Double, patientId: String): HAPIObservation = {
    val obs = new HAPIObservation()
      .addIdentifier(new HAPIIdentifier().setSystem("http://system.foo/bar").setValue("123"))
      .setStatus(ObservationStatus.FINAL)
      .setSubject(new HAPIReference(s"Patient/$patientId"))
      .addCategory(new HAPICodeableConcept(new HAPICoding()
        .setSystem("http://terminology.hl7.org/CodeSystem/observation-category")
        .setCode("vital-signs")))
      .setValue(new HAPIQuantity().setSystem("http://unitsofmeasure.org").setCode("kg/m2").setUnit("bmi").setValue(value))
      .setEffective(new HAPIDateTimeType(Date.from(ts.toInstant), TemporalPrecisionEnum.MILLI))
      .setCode(new HAPICodeableConcept(new HAPICoding().setSystem("http://loinc.org").setCode("39156-5")))
    obs.setMeta(new HAPIMeta().addProfile("http://hl7.org/fhir/StructureDefinition/bmi"))
    obs
  }

  def mkCategoriesLit: NonEmptyLitSeq[CodeableConcept] = LitSeq(
    CodeableConcept(coding =
      LitSeq(Coding(system = Some("http://terminology.hl7.org/CodeSystem/observation-category"), code = Some("vital-signs")))))
  def mkEffectiveQuantityLit(value: Double): Quantity =
    Quantity(system = Some("http://unitsofmeasure.org"), code = Some("kg/m2"), unit = Some("bmi"), value = Some(value))
  def mkEffectiveChoiceLit(ts: ZonedDateTime): Bmi.EffectiveChoice = choose(FHIRDateTime(dateTime = ts))
  def mkBmiLit(ts: ZonedDateTime, value: Double, patientId: String): Bmi =
    Bmi(
      identifier = LitSeq(Identifier(system = Some("http://system.foo/bar"), value = Some("123"))),
      status = OBSERVATION_STATUS.FINAL,
      subject = Reference(reference = Some(s"Patient/$patientId")),
      category = LitSeq(
        CodeableConcept(coding = LitSeq(
          Coding(system = Some("http://terminology.hl7.org/CodeSystem/observation-category"), code = Some("vital-signs"))))),
      value = Quantity(system = Some("http://unitsofmeasure.org"), code = Some("kg/m2"), unit = Some("bmi"), value = Some(value)),
      effective = choose(FHIRDateTime(dateTime = ts)),
      code = CodeableConcept(coding = LitSeq(Coding(system = Some("http://loinc.org"), code = Some("39156-5"))))
    )

  def mkCategoriesProto: JList[GPBCodeableConcept.Builder] = JList.of(
    GPBCodeableConcept
      .newBuilder()
      .addCoding(
        GPBCoding
          .newBuilder()
          .setSystem(GPBUri.newBuilder().setValue("http://terminology.hl7.org/CodeSystem/observation-category"))
          .setCode(GPBCode.newBuilder().setValue("vital-signs"))))
  def mkEffectiveQuantityProto(value: Double): ValueX.Builder =
    GPBObservation.ValueX
      .newBuilder()
      .setQuantity(
        GPBQuantity
          .newBuilder()
          .setSystem(GPBUri.newBuilder().setValue("http://unitsofmeasure.org"))
          .setCode(GPBCode.newBuilder().setValue("kg/m2"))
          .setUnit(GPBString.newBuilder().setValue("bmi"))
          .setValue(GPBDecimal.newBuilder().setValue(value.toString)))
  def mkEffectiveChoiceProto(ts: ZonedDateTime): EffectiveX.Builder = GPBObservation.EffectiveX
    .newBuilder()
    .setDateTime(
      GPBDateTime
        .newBuilder()
        .setValueUs(ts.toInstant.toEpochMilli * 1000)
        .setTimezone(ts.getZone.toString)
        .setPrecision(Precision.MILLISECOND))
  def mkProtoBMI(ts: ZonedDateTime, value: Double, patientId: String): GPBObservation = GPBObservation
    .newBuilder()
    .setMeta(GPBMeta
      .newBuilder()
      .addProfile(GPBCanonical.newBuilder().setValue("http://hl7.org/fhir/StructureDefinition/bmi")))
    .addIdentifier(
      GPBIdentifier
        .newBuilder()
        .setSystem(GPBUri.newBuilder().setValue("http://system.foo/bar"))
        .setValue(GPBString.newBuilder.setValue("123"))
    )
    .setStatus(GPBObservation.StatusCode.newBuilder().setValue(GPBObservationStatusCode.Value.FINAL))
    .setSubject(GPBReference.newBuilder().setPatientId(GPBReferenceId.newBuilder().setValue(patientId)))
    .addCategory(
      GPBCodeableConcept
        .newBuilder()
        .addCoding(
          GPBCoding
            .newBuilder()
            .setSystem(GPBUri.newBuilder().setValue("http://terminology.hl7.org/CodeSystem/observation-category"))
            .setCode(GPBCode.newBuilder().setValue("vital-signs"))))
    .setValue(
      GPBObservation.ValueX
        .newBuilder()
        .setQuantity(
          GPBQuantity
            .newBuilder()
            .setSystem(GPBUri.newBuilder().setValue("http://unitsofmeasure.org"))
            .setCode(GPBCode.newBuilder().setValue("kg/m2"))
            .setUnit(GPBString.newBuilder().setValue("bmi"))
            .setValue(GPBDecimal.newBuilder().setValue(value.toString))))
    .setEffective(
      GPBObservation.EffectiveX
        .newBuilder()
        .setDateTime(
          GPBDateTime
            .newBuilder()
            .setValueUs(ts.toInstant.toEpochMilli * 1000)
            .setTimezone(ts.getZone.toString)
            .setPrecision(Precision.MILLISECOND)))
    .setCode(
      GPBCodeableConcept
        .newBuilder()
        .addCoding(
          GPBCoding
            .newBuilder()
            .setSystem(GPBUri.newBuilder().setValue("http://loinc.org"))
            .setCode(GPBCode.newBuilder().setValue("39156-5"))))
    .build()

  def mkProtoBMISTU3(ts: ZonedDateTime, value: Double, patientId: String): STU3Bmi = STU3Bmi
    .newBuilder()
    .setMeta(STU3Meta
      .newBuilder()
      .addProfile(STU3Uri.newBuilder().setValue("http://hl7.org/fhir/StructureDefinition/bmi")))
    .addIdentifier(
      STU3Identifier
        .newBuilder()
        .setSystem(STU3Uri.newBuilder().setValue("http://system.foo/bar"))
        .setValue(STU3String.newBuilder.setValue("123"))
    )
    .setStatus(STU3ObservationStatusCode.newBuilder().setValue(STU3ObservationStatusCode.Value.FINAL))
    .setSubject(STU3Reference.newBuilder().setPatientId(STU3ReferenceId.newBuilder().setValue(patientId)))
    .addCategory(
      STU3CodeableConcept
        .newBuilder()
        .addCoding(
          STU3Coding
            .newBuilder()
            .setSystem(STU3Uri.newBuilder().setValue("http://terminology.hl7.org/CodeSystem/observation-category"))
            .setCode(STU3Code.newBuilder().setValue("vital-signs"))))
    .setValue(
      STU3Bmi.Value
        .newBuilder()
        .setQuantity(
          STU3Quantity
            .newBuilder()
            .setSystem(STU3Uri.newBuilder().setValue("http://unitsofmeasure.org"))
            .setCode(STU3Code.newBuilder().setValue("kg/m2"))
            .setUnit(STU3String.newBuilder().setValue("bmi"))
            .setValue(STU3Decimal.newBuilder().setValue(value.toString))))
    .setEffective(
      STU3Bmi.Effective
        .newBuilder()
        .setDateTime(
          STU3DateTime
            .newBuilder()
            .setValueUs(ts.toInstant.toEpochMilli * 1000)
            .setTimezone(ts.getZone.toString)
            .setPrecision(STU3DateTime.Precision.MILLISECOND)
        ))
    .setCode(
      STU3Bmi.CodeableConceptForCode
        .newBuilder()
        .addCoding(
          STU3Coding
            .newBuilder()
            .setSystem(STU3Uri.newBuilder().setValue("http://loinc.org"))
            .setCode(STU3Code.newBuilder().setValue("39156-5"))))
    .build()
}

class ExampleTest extends AnyFreeSpec with Matchers with ExampleConstructors {
  val ts: ZonedDateTime        = ZonedDateTime.now(ZoneId.of("+01:00")).truncatedTo(ChronoUnit.MILLIS)
  val hapiBMI: HAPIObservation = mkBmiHapi(ts, 20.5, "dummy-patient-123")
  val protoBMI: GPBObservation = mkProtoBMI(ts, 20.5, "dummy-patient-123")
  val protoBMISTU3: STU3Bmi    = mkProtoBMISTU3(ts, 20.5, "dummy-patient-123")
  val bmi: Bmi                 = mkBmiLit(ts, 20.5, "dummy-patient-123")
//  val bmiJ: Option[Bmi]        = mkBmiLitJ(ts, 20.5, "dummy-patient-123")

  "all equal" in {
    val from: String              = bmi.asJson.spaces2SortKeys
    val fromFHIRProto: String     = Translator.printer.print(protoBMI)
    val fromFHIRProtoSTU3: String = Translator.printer.print(protoBMISTU3)
    val fromHapi: String          = FhirContext.forR4.newJsonParser().encodeResourceToString(hapiBMI)
//    val fromJava: Option[String]  = bmiJ.map(_.asJson.spaces2SortKeys)

    JSONAssert.assertEquals(from, fromFHIRProto, true)
    JSONAssert.assertEquals(from, fromHapi, true)
//    JSONAssert.assertEquals(from, fromFHIRProtoSTU3, true)
//    fromJava foreach (JSONAssert.assertEquals(from, _, true))
  }
}
