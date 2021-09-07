//package com.babylonhealth.lit.bench
//
//import java.time.ZonedDateTime
//
//import com.babylonhealth.lit.core.{ FHIRDateTime, FHIRDateTimeSpecificity, LitSeq }
//import com.babylonhealth.lit.core.model.Quantity
//import com.babylonhealth.lit.core_java.LitUtils.DateTimeSpecificity
//import com.babylonhealth.lit.core_java.builders
//import com.babylonhealth.lit.core_java.builders.{
//  CodeableConceptBuilder,
//  CodingBuilder,
//  IdentifierBuilder,
//  QuantityBuilder,
//  ReferenceBuilder
//}
//import com.babylonhealth.lit.hl7_java.codes.ObservationStatus
//import com.babylonhealth.lit.hl7_java.model.Unions
//import com.babylonhealth.lit.usbase.model.Bmi
//import com.babylonhealth.lit.usbase_java.builders.BmiBuilder
//
//trait JavaApiCalls {
//  /*
//      identifier = LitSeq(Identifier(system = Some("http://system.foo/bar"), value = Some("123"))),
//      status = OBSERVATION_STATUS.FINAL,
//      subject = Reference(reference = Some(s"Patient/$patientId")),
//      category = LitSeq(
//        CodeableConcept(coding = LitSeq(
//          Coding(system = Some("http://terminology.hl7.org/CodeSystem/observation-category"), code = Some("vital-signs"))))),
//      value = Quantity(system = Some("http://unitsofmeasure.org"), code = Some("kg/m2"), unit = Some("bmi"), value = Some(value)),
//      effective = choose(FHIRDateTime(dateTime = ts)),
//      code = CodeableConcept(coding = LitSeq(Coding(system = Some("http://loinc.org"), code = Some("39156-5"))))*/
//  def mkCategoriesLitJ = Some(
//    java.util.List.of(
//      CodeableConceptBuilder
//        .init()
//        .withCoding(
//          CodingBuilder
//            .init()
//            .withSystem("http://terminology.hl7.org/CodeSystem/observation-category")
//            .withCode("vital-signs"))))
//  def mkEffectiveQuantityLitJ(value: Double)                                          = Some(mkEffectiveQuantityLit(value))
//  def mkEffectiveChoiceLitJ(ts: ZonedDateTime): Option[Unions.ChoiceDateTimeOrPeriod] = Some(mkEffectiveChoiceLit(ts))
//  def mkBmiLitJ(ts: ZonedDateTime, value: Double, patientId: String): Option[Bmi]     = Some(mkBmiLit(ts, value, patientId))
//  private def mkEffectiveQuantityLit(value: Double) =
//    QuantityBuilder.init().withSystem("http://unitsofmeasure.org").withCode("kg/m2").withUnit("bmi").withValue(value)
//  private def mkEffectiveChoiceLit(ts: ZonedDateTime): Unions.ChoiceDateTimeOrPeriod =
//    BmiBuilder.effective(new FHIRDateTime(ts, DateTimeSpecificity.Time))
//  private def mkBmiLit(ts: ZonedDateTime, value: Double, patientId: String): Bmi =
//    BmiBuilder
//      .builder(
//        ObservationStatus.FINAL,
//        ReferenceBuilder.init().withReference(s"Patient/$patientId"),
//        java.util.List.of(
//          CodeableConceptBuilder
//            .init()
//            .withCoding(
//              CodingBuilder
//                .init()
//                .withSystem("http://terminology.hl7.org/CodeSystem/observation-category")
//                .withCode("vital-signs"))),
//        QuantityBuilder.init().withSystem("http://unitsofmeasure.org").withCode("kg/m2").withUnit("bmi").withValue(value),
//        BmiBuilder.effective(new FHIRDateTime(ts, DateTimeSpecificity.Time)),
//        CodeableConceptBuilder.init().withCoding(CodingBuilder.init().withSystem("http://loinc.org").withCode("39156-5"))
//      )
//      .withIdentifier(IdentifierBuilder.init().withSystem("http://system.foo/bar").withValue("123"))
//      .build()
//
//}
