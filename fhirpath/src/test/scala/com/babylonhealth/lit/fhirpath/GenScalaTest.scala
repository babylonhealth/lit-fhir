package com.babylonhealth.lit.fhirpath

import org.scalactic.source
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

import com.babylonhealth.lit.fhirpath.genScala._
import com.babylonhealth.lit.core.{ CompanionFor, FHIRObject }
import com.babylonhealth.lit.hl7.model.{
  Account,
  Bundle,
  CommunicationRequest,
  Device,
  FHIRList,
  Observation,
  Patient,
  QuestionnaireResponse
}

class GenScalaTest extends AnyFreeSpec with Matchers {

  expect(Patient, "Patient.birthDate") {
    "obj.birthDate.toSeq"
  }
  expect(Patient, "Patient.name.given") {
    "obj.name.flatMap(_.`given`).toSeq"
  }
  expect(Patient, "(Patient.deceased as dateTime)") {
    "obj.deceased.flatMap(_.as[FHIRDateTime]).toSeq"
  }
  expect(Patient, "Patient.telecom.where(system='email')") {
    "obj.telecom.filter(_.system.map(_.name) contains \"email\").toSeq"
  }
  expect(Patient, "Patient.deceased.exists() and Patient.deceased != false") {
    "Seq(obj.deceased.nonEmpty && !obj.deceased.contains(false))"
  }
  expect(Patient, "Patient.extension('foo')") {
    "obj.extension.filter(_.url == \"foo\").toSeq"
  }
  expect(Observation, "(Observation.value as string)") {
    "obj.value.flatMap(_.as[String]).toSeq"
  }
  expect(Observation, "(Observation.value as CodeableConcept).text") {
    "obj.value.flatMap(_.as[CodeableConcept]).flatMap(_.text).toSeq"
  }
  expect(Account, "Account.subject.where(resolve() is Patient)") {
    "obj.subject.filter(_.reference.exists(_.contains(\"Patient/\"))).toSeq"
  }
  expect(Bundle, "Bundle.entry[0].resource") {
    "obj.entry.flatMap(_.resource).toSeq" // TODO: this seems wrong, but just trying to replicate current behaviour
  }
  expect(
    QuestionnaireResponse,
    "QuestionnaireResponse.item.where(hasExtension('foo')).answer.value.ofType(Reference)") {
    "obj.item.filter(_.extension.exists(_.url == \"foo\")).flatMap(_.answer).flatMap(_.value).flatMap(_.as[Reference]).toSeq"
  }
  expect(CommunicationRequest, "(CommunicationRequest.occurrence as dateTime)") {
    "obj.occurrence.flatMap(_.as[FHIRDateTime]).toSeq"
  }
  expect(Device, "Device.extension('foo')") {
    "obj.extension.filter(_.url == \"foo\").toSeq"
  }
  expect(FHIRList, "List.source") {
    "obj.source.toSeq"
  }

  def expect(companion: CompanionFor[_ <: FHIRObject], fhirPath: String)(expected: String)(implicit
      pos: source.Position): Unit = {
    fhirPath in {
      val expr   = Parser.parseToEither(fhirPath).toOption.get
      val params = GenScalaParams(Left(companion), ExactlyOne, "obj")
      val result = genScala.gen(expr, params)
      val str = result.baseCardinality match {
        case ExactlyOne => s"Seq(${result.rootStr})"
        case _          => s"${result.rootStr}.toSeq"
      }
      str shouldBe expected
    }
  }
}
