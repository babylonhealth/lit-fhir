package com.babylonhealth.lit.uscore

import java.time.{ LocalTime, ZonedDateTime }

import com.babylonhealth.lit.core.ChoiceImplicits._
import com.babylonhealth.lit.core.PseudoLenses._
import com.babylonhealth.lit.core.model._
import com.babylonhealth.lit.core.{ Choice, LitSeq, \/ }
import com.babylonhealth.lit.hl7.model._
import com.babylonhealth.lit.hl7.{ BUNDLE_TYPE, CARE_PLAN_INTENT, NARRATIVE_STATUS, OBSERVATION_STATUS, REQUEST_STATUS }
import com.babylonhealth.lit.uscore.model.Us_core_careplan
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

class FauxLensTest2 extends AnyFreeSpec with Matchers {
  "basic" - {
    val e = ElementDefinition(path = "Observation.value[x]")
    "Can set a field with a keyword name (setting)" in {
      val x: ElementDefinition = e.setting(_.`type`)(LitSeq(ElementDefinition.Type(code = "Quantity")))
      x.`type` shouldEqual LitSeq(ElementDefinition.Type(code = "Quantity"))
    }
    "Can modify a field with a keyword name (updating)" in {
      val x: ElementDefinition = e.updating(_.`type`)(_ => LitSeq(ElementDefinition.Type(code = "Quantity")))
      x.`type` shouldEqual LitSeq(ElementDefinition.Type(code = "Quantity"))
    }
    "Can modify a field with a keyword name (updateAll)" in {
      val x: ElementDefinition = e.updateAll(_.`type`)(_.setting(_.code)("Quantity"))
      x.`type` shouldEqual LitSeq.empty
      val e2 =
        ElementDefinition(path = "Observation.value[x]", `type` = LitSeq(ElementDefinition.Type(code = "Quantity")))
      val x2: ElementDefinition = e2.updateAll(_.`type`)(_.setting(_.code)("Quality"))
      x2.`type` shouldEqual LitSeq(ElementDefinition.Type(code = "Quality"))
    }
  }
  "subtyping" - {
    val o = Us_core_careplan(
      status = REQUEST_STATUS.REVOKED,
      intent = CARE_PLAN_INTENT.PROPOSAL,
      subject = Reference(),
      category = LitSeq(CodeableConcept()),
      text = Narrative(div = "<>", status = NARRATIVE_STATUS.EMPTY)
    )
    "Retain specific type when setting a field with same type as parent" in {
      val x = o.setting(_.status)(REQUEST_STATUS.DRAFT)
      x.getClass shouldEqual classOf[Us_core_careplan]
    }
    "Retain specific type when setting a field with different type as parent" in {
      val x = o.setting(_.text)(Narrative(div = "<div/>", status = NARRATIVE_STATUS.EMPTY))
      x.getClass shouldEqual classOf[Us_core_careplan]
    }
    "Lose specific type when setting a field 'as parent' to a different type to the existing" in {
      val x = o.asInstanceOf[CarePlan].setting(_.text)(None)
      x.getClass shouldEqual classOf[CarePlan]
    }
    "Retain specific type when setting a field 'as parent' to the same type as the existing" in {
      val x = o.asInstanceOf[CarePlan].setting(_.status)(REQUEST_STATUS.DRAFT)
      x.getClass shouldEqual classOf[Us_core_careplan]
    }
    "Retain specific type when setting a field 'as parent' to Some(...) when required in existing" ignore {
      val x = o.asInstanceOf[CarePlan].setting(_.text)(Some(Narrative(div = "<div/>", status = NARRATIVE_STATUS.EMPTY)))
      x.getClass shouldEqual classOf[Us_core_careplan]
    }
  }
}
