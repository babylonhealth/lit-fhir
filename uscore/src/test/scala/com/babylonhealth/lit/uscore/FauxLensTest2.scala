package com.babylonhealth.lit.uscore

import com.babylonhealth.lit.core._
import com.babylonhealth.lit.core.model._
import com.babylonhealth.lit.hl7.model._
import com.babylonhealth.lit.hl7.{ CARE_PLAN_INTENT, NARRATIVE_STATUS, REQUEST_STATUS }
import com.babylonhealth.lit.uscore.model.Us_core_careplan
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

class FauxLensTest2 extends AnyFreeSpec with Matchers {
  "basic" - {
    val e = ElementDefinition(path = "Observation.value[x]")
    "Can set a field with a keyword name (setting)" in {
      val x: ElementDefinition = e.set(_.`type`)(LitSeq(ElementDefinition.Type(code = "Quantity")))
      x.`type` shouldEqual LitSeq(ElementDefinition.Type(code = "Quantity"))
    }
    "Can modify a field with a keyword name (updating)" in {
      val x: ElementDefinition = e.update(_.`type`)(_ => LitSeq(ElementDefinition.Type(code = "Quantity")))
      x.`type` shouldEqual LitSeq(ElementDefinition.Type(code = "Quantity"))
    }
    "Can modify a field with a keyword name (updateAll)" in {
      val x: ElementDefinition = e.updateAll(_.`type`)(_.set(_.code)("Quantity"))
      x.`type` shouldEqual LitSeq.empty
      val e2 =
        ElementDefinition(path = "Observation.value[x]", `type` = LitSeq(ElementDefinition.Type(code = "Quantity")))
      val x2: ElementDefinition = e2.updateAll(_.`type`)(_.set(_.code)("Quality"))
      x2.`type` shouldEqual LitSeq(ElementDefinition.Type(code = "Quality"))
    }
  }
  "subtyping (set)" - {
    val o = Us_core_careplan(
      status = REQUEST_STATUS.REVOKED,
      intent = CARE_PLAN_INTENT.PROPOSAL,
      subject = Reference(),
      category = LitSeq(CodeableConcept()),
      text = Narrative(div = "<>", status = NARRATIVE_STATUS.EMPTY)
    )
    "Retain specific type when setting a field with same type as parent" in {
      val x = o.set(_.status)(REQUEST_STATUS.DRAFT)
      x.getClass shouldEqual classOf[Us_core_careplan]
    }
    "Retain specific type when setting a field with different type as parent" in {
      val x = o.set(_.text)(Narrative(div = "<div/>", status = NARRATIVE_STATUS.EMPTY))
      x.getClass shouldEqual classOf[Us_core_careplan]
    }
    "Lose specific type when setting a field 'as parent' to a different type to the existing" in {
      val x = o.asInstanceOf[CarePlan].set(_.text)(None)
      x.getClass shouldEqual classOf[CarePlan]
    }
    "Retain specific type when setting a field 'as parent' to the same type as the existing" in {
      val x = o.asInstanceOf[CarePlan].set(_.status)(REQUEST_STATUS.DRAFT)
      x.getClass shouldEqual classOf[Us_core_careplan]
    }
    "Retain specific type when setting a field 'as parent' to Some(...) when required in existing" in {
      val x = o.asInstanceOf[CarePlan].set(_.text)(Some(Narrative(div = "<div/>", status = NARRATIVE_STATUS.EMPTY)))
      x.getClass shouldEqual classOf[Us_core_careplan]
    }
  }
  "subtyping (update)" - {
    val o = Us_core_careplan(
      status = REQUEST_STATUS.REVOKED,
      intent = CARE_PLAN_INTENT.PROPOSAL,
      subject = Reference(),
      category = LitSeq(CodeableConcept()),
      text = Narrative(div = "<>", status = NARRATIVE_STATUS.EMPTY)
    )
    "Retain specific type when updating a field with same type as parent" in {
      val x = o.update(_.status)(_ => REQUEST_STATUS.DRAFT)
      x.getClass shouldEqual classOf[Us_core_careplan]
    }
    "Retain specific type when setting a field with different type as parent" in {
      val x = o.update(_.text)(_ => Narrative(div = "<div/>", status = NARRATIVE_STATUS.EMPTY))
      x.getClass shouldEqual classOf[Us_core_careplan]
    }
    "Lose specific type when setting a field 'as parent' to a different type to the existing" in {
      val x = o.asInstanceOf[CarePlan].update(_.text)(_ => None)
      x.getClass shouldEqual classOf[CarePlan]
    }
    "Retain specific type when setting a field 'as parent' to the same type as the existing" in {
      val x = o.asInstanceOf[CarePlan].update(_.status)(_ => REQUEST_STATUS.DRAFT)
      x.getClass shouldEqual classOf[Us_core_careplan]
    }
    "Retain specific type when setting a field 'as parent' to Some(...) when required in existing" in {
      val x = o.asInstanceOf[CarePlan].set(_.text)(Some(Narrative(div = "<div/>", status = NARRATIVE_STATUS.EMPTY)))
      x.getClass shouldEqual classOf[Us_core_careplan]
    }
  }
}
