package com.babylonhealth.lit.uscore

import java.time.ZonedDateTime

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

import com.babylonhealth.lit.core.ChoiceImplicits._
import com.babylonhealth.lit.core.model.{ CodeableConcept, Quantity, Reference }
import com.babylonhealth.lit.core.{ FHIRDateTime, LitSeq }
import com.babylonhealth.lit.hl7.OBSERVATION_STATUS
import com.babylonhealth.lit.hl7.model.Observation
import com.babylonhealth.lit.hl7.model.Observation.ReferenceRange
import com.babylonhealth.lit.usbase.model.Cholesterol

class SubclassEqualityTest extends AnyFreeSpec with Matchers {

  implicit class RichAny[T](o: T) {
    def ====(that: Any): Boolean =
      o == that || {
        println(s"$o != $that")
        false
      }
  }
  object CompType extends Enumeration {
    val Ident, Eq, Neq = Value
    type CompType = Value
  }
  import CompType._
  implicit class InspectEquals(f: Observation) {
    def eqs(obj: Any): CompType =
      obj match {
        case x: Observation if f eq x => Ident
        case that: Observation =>
          if (f.thisTypeName ==== that.thisTypeName && f.id ==== that.id && f.meta ==== that.meta && f.text ==== that.text && f.note ==== that.note && f.partOf ==== that.partOf && f.status ==== that.status && f.issued ==== that.issued && f.device ==== that.device && f.basedOn ==== that.basedOn && f.language ==== that.language && f.category ==== that.category && f.value ==== that.value && f.bodySite ==== that.bodySite && f.specimen ==== that.specimen && f.contained ==== that.contained && f.extension ==== that.extension && f.hasMember ==== that.hasMember && f.identifier ==== that.identifier && f.derivedFrom ==== that.derivedFrom && f.effective ==== that.effective && f.implicitRules ==== that.implicitRules && f.focus ==== that.focus && f.modifierExtension ==== that.modifierExtension && f.subject ==== that.subject && f.encounter ==== that.encounter && f.performer ==== that.performer && f.code ==== that.code && f.method ==== that.method && f.interpretation ==== that.interpretation && f.component ==== that.component && f.dataAbsentReason ==== that.dataAbsentReason && f.referenceRange ==== that.referenceRange)
            Eq
          else Neq
        case _ =>
          println("pattern match failed")
          Neq
      }
  }
  val issuedInstant: ZonedDateTime = ZonedDateTime.now()
  val obs = Observation(
    meta = None,
    value = Some(choice(Quantity(value = Some(29.5), system = Some("http://unitsofmeasure.org"), code = Some("pg")))),
    id = Some("8dd13009ce04161e4971a42f95813016"),
    status = OBSERVATION_STATUS.UNKNOWN,
    code = CodeableConcept(text = Some("Cholesterol level")),
    effective = Some(choice(FHIRDateTime(ZonedDateTime.parse("2019-11-07T17:27:00Z")))),
    subject = Some(Reference(reference = Some("foooooo"))),
    issued = Some(issuedInstant),
    performer = LitSeq(Reference(reference = Some("lolwutno"))),
    referenceRange = LitSeq(ReferenceRange(text = Some("a reference range...")))
  )
  val blood = Cholesterol(
    meta = None,
    value = Some(Quantity(value = Some(29.5), system = Some("http://unitsofmeasure.org"), code = Some("pg"))),
    id = Some("8dd13009ce04161e4971a42f95813016"),
    status = OBSERVATION_STATUS.UNKNOWN,
    code = CodeableConcept(text = Some("Cholesterol level")),
    effective = Some(choice(FHIRDateTime(ZonedDateTime.parse("2019-11-07T17:27:00Z")))),
    subject = Some(Reference(reference = Some("foooooo"))),
    issued = Some(issuedInstant),
    performer = LitSeq(Reference(reference = Some("lolwutno"))),
    referenceRange = ReferenceRange(text = Some("a reference range..."))
  )
  "subclasses which are identical compare equally with parent with same resourceType" in {
    obs.eqs(obs) shouldEqual Ident
    blood.eqs(blood) shouldEqual Ident
    obs.eqs(blood) shouldEqual Eq
    blood.eqs(obs) shouldEqual Eq
    blood shouldEqual obs
    obs shouldEqual blood
  }
}
