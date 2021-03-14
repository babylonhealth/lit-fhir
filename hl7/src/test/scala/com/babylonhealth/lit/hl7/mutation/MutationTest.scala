package com.babylonhealth.lit.hl7.mutation

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

import com.babylonhealth.lit.core.ChoiceImplicits._
import com.babylonhealth.lit.core.TagSummoners.lTagOf
import com.babylonhealth.lit.core.model.{ CodeableConcept, Coding, Quantity }
import com.babylonhealth.lit.core.{ LitSeq, UriStr }
import com.babylonhealth.lit.hl7.OBSERVATION_STATUS
import com.babylonhealth.lit.hl7.LoadsOfObservations
import com.babylonhealth.lit.hl7.SharedVals.zdt2Ref
import com.babylonhealth.lit.hl7.model.Observation

class MutationTest extends AnyFreeSpec with Matchers {
  "do some horrible transformations nodally, based on types" - {
    val x = LoadsOfObservations.observations
    "simply" in {
      val y = x.map(_ >> ((_: UriStr).reverse: UriStr))
      val z = y(15)
      z shouldEqual Observation(
        meta = None,
        value = Some(choice(Quantity(unit = Some("%"), value = Some(10.0)))),
        id = Some("67beef80b20c52d396640b99e3ed46b9"),
        status = OBSERVATION_STATUS.UNKNOWN,
        code = CodeableConcept(
          coding = LitSeq(
            Coding(
              display = Some("Red blood cell distribution width"),
              system = Some("3VTC"),
              code = Some("XE2mO")
            ),
            Coding(
              system = Some("DEMONS"),
              code = Some("993501000000105")
            )
          ),
          text = Some("Red blood cell distribution width")
        ),
        effective = zdt2Ref
      )
    }
    "getting the Choice types involved" in {
      val t1 = Quantity(unit = Some("%"), value = Some(10.0)) >> ((_: BigDecimal) * 4.2)
      t1 shouldEqual Quantity(unit = Some("%"), value = Some(42.0))
      val y = x.map(_ >> ((_: BigDecimal) * 4.2))
      val z = y(15)
      z shouldEqual Observation(
        meta = None,
        value = Some(choice(Quantity(unit = Some("%"), value = Some(42.0)))),
        id = Some("67beef80b20c52d396640b99e3ed46b9"),
        status = OBSERVATION_STATUS.UNKNOWN,
        code = CodeableConcept(
          coding = LitSeq(
            Coding(
              display = Some("Red blood cell distribution width"),
              system = Some("CTV3"),
              code = Some("XE2mO")
            ),
            Coding(
              system = Some("SNOMED"),
              code = Some("993501000000105")
            )
          ),
          text = Some("Red blood cell distribution width")
        ),
        effective = zdt2Ref
      )
    }
  }
  "do some horrible transformations nodally, based on a class" - {
    val x = LoadsOfObservations.observations
    "normal class map thing" in {
      val t1 = Quantity(unit = Some("%"), value = Some(10.0)) >> ((_: BigDecimal) * 4.2)
      t1 shouldEqual Quantity(unit = Some("%"), value = Some(42.0))
      val y = x.map(_.nodalMap[BigDecimal](classOf, _ * 4.2))
      val z = y(15)
      z shouldEqual Observation(
        meta = None,
        value = Some(choice(Quantity(unit = Some("%"), value = Some(42.0)))),
        id = Some("67beef80b20c52d396640b99e3ed46b9"),
        status = OBSERVATION_STATUS.UNKNOWN,
        code = CodeableConcept(
          coding = LitSeq(
            Coding(
              display = Some("Red blood cell distribution width"),
              system = Some("CTV3"),
              code = Some("XE2mO")
            ),
            Coding(
              system = Some("SNOMED"),
              code = Some("993501000000105")
            )
          ),
          text = Some("Red blood cell distribution width")
        ),
        effective = zdt2Ref
      )
    }
    "doin' it to all types T st T <: String" in {
      val y = x.map(_.nodalMap[String](classOf, _ + "_tmp"))
      val z = y(15)
      z shouldEqual Observation(
        meta = None,
        value = Some(choice(Quantity(unit = Some("%_tmp"), value = Some(10.0)))),
        id = Some("67beef80b20c52d396640b99e3ed46b9_tmp"),
        status = OBSERVATION_STATUS.UNKNOWN,
        code = CodeableConcept(
          coding = LitSeq(
            Coding(
              display = Some("Red blood cell distribution width_tmp"),
              system = Some("CTV3_tmp"),
              code = Some("XE2mO_tmp")
            ),
            Coding(
              system = Some("SNOMED_tmp"),
              code = Some("993501000000105_tmp")
            )
          ),
          text = Some("Red blood cell distribution width_tmp")
        ),
        effective = zdt2Ref
      )
    }
  }
  "do some horrible extractions nodally, based on types" - {
    val x = LoadsOfObservations.observations
    "with a normal class type" in {
      val y = x.map(_ ^^ ((_: BigDecimal) * 4.2))
      val z = y(15)
      z shouldEqual LitSeq(42.0)
    }
    "with a T <: String type" in {
      val y = x.map(_ ^^^ lTagOf[UriStr])
      val z = y(15)
      z shouldEqual LitSeq("CTV3", "SNOMED")
    }
    "with a T <: String type without explicit lTagOf instantiation" in {
      val y = x.map(_.^^^[UriStr])
      val z = y(15)
      z shouldEqual LitSeq("CTV3", "SNOMED")
    }
    "with a T <: String type and mutation" in {
      val y = x.map(_ ^^ ((_: UriStr).reverse: UriStr))
      val z = y(15)
      z shouldEqual LitSeq("3VTC", "DEMONS")
    }
  }
  "do some horrible extractions nodally, based on class" - {
    val x = LoadsOfObservations.observations
    "with a normal class type" in {
      val y = x.map(_.nodalExtract[Quantity, Option[BigDecimal]](classOf, _.value map (_ * 4.2)))
      val z = y(15).flatten
      z shouldEqual LitSeq(42.0)
    }
    "with a T <: String type" in {
      val y = x.map(_.nodalExtract[String, String](classOf, _ + "_tmp"))
      val z = y(15)
      z.toSet shouldEqual Set(
        "%_tmp",
        "67beef80b20c52d396640b99e3ed46b9_tmp",
        "Red blood cell distribution width_tmp",
        "CTV3_tmp",
        "XE2mO_tmp",
        "SNOMED_tmp",
        "993501000000105_tmp",
        "Red blood cell distribution width_tmp"
      )
    }
  }

}
