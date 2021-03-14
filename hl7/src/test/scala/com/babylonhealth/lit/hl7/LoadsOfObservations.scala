package com.babylonhealth.lit.hl7

import java.time.ZonedDateTime

import com.babylonhealth.lit.core.ChoiceImplicits._
import com.babylonhealth.lit.core._
import com.babylonhealth.lit.core.model.{ CodeableConcept, Coding, Period, Quantity, Timing }
import com.babylonhealth.lit.hl7.model.Observation

object SharedVals {
  val zdt1                                                                       = FHIRDateTime(ZonedDateTime.parse("2019-11-07T17:25:29Z"))
  val zdt2                                                                       = FHIRDateTime(ZonedDateTime.parse("2019-11-07T17:27:00Z"))
  val zdt1Ref: Option[Choice[FHIRDateTime \/ Period \/ Timing \/ ZonedDateTime]] = Some(choice(zdt1))
  val zdt2Ref: Option[Choice[FHIRDateTime \/ Period \/ Timing \/ ZonedDateTime]] = Some(choice(zdt2))
}
import SharedVals._

object LoadsOfObservationsPt1 {
  // The original list is _just slightly_ too long for scala to manage its compilation, producing the following error:
  //  [error] Error while emitting com/babylonhealth/lit/generated/ParseTest
  //  [error] Method too large: com/babylonhealth/lit/generated/ParseTest.<init> ()V
  // -- the solution is to exclude the final four observations from the initial construction and append them in another object.
  // Which makes no sense to me, but there you are

  // Edit: Since updating to use choice rather than Ref.fromVal, the list has now had to be split into 4 chunks.
  // C'est la vie.
  def observations_pt1: Seq[Observation] =
    Seq(
      new Observation(
        meta = None,
        id = Some("9ba5a48a6d146ce712324ee8964f6e98"),
        status = OBSERVATION_STATUS.UNKNOWN,
        code = CodeableConcept(
          coding = LitSeq(
            Coding(
              display = Some("Blood sample taken"),
              system = Some("CTV3"),
              code = Some("XaEJK")
            ),
            Coding(system = Some("SNOMED"), code = Some("313334002"))),
          text = Some("Blood sample taken")
        ),
        effective = zdt1Ref),
      new Observation(
        meta = None,
        id = Some("0d13737d919177443588b9e03ac5782f"),
        status = OBSERVATION_STATUS.UNKNOWN,
        code = CodeableConcept(
          coding = LitSeq(
            Coding(
              display = Some("Venous blood sampling"),
              system = Some("CTV3"),
              code = Some("X74UW")
            ),
            Coding(system = Some("SNOMED"), code = Some("28520004"))),
          text = Some("Venous blood sampling")
        ),
        effective = zdt1Ref),
      new Observation(
        meta = None,
        id = Some("d5644877a93d67718934595d67f6eb98"),
        status = OBSERVATION_STATUS.UNKNOWN,
        code = CodeableConcept(
          coding = LitSeq(
            Coding(
              display = Some("Consent obtained"),
              system = Some("CTV3"),
              code = Some("Y001d")
            )),
          text = Some("Consent obtained")
        ),
        effective = zdt1Ref),
      new Observation(
        meta = None,
        value = Some(choice(Quantity(unit = Some("ng/L"), value = Some(584.0)))),
        id = Some("17fb8ef8fa5f50d0e96ea12797509d09"),
        status = OBSERVATION_STATUS.UNKNOWN,
        code = CodeableConcept(
          coding = LitSeq(
            Coding(
              display = Some("Serum vitamin B12 level"),
              system = Some("CTV3"),
              code = Some("XE2pf")
            ),
            Coding(
              system = Some("SNOMED"),
              code = Some("993391000000108")
            )
          ),
          text = Some("Serum vitamin B12 level")
        ),
        effective = zdt2Ref),
      new Observation(
        meta = None,
        value = Some(choice(Quantity(unit = Some("10^9/L"), value = Some(0.2)))),
        id = Some("9c4ba3d2f99d610439372f27fb2e6004"),
        status = OBSERVATION_STATUS.UNKNOWN,
        code = CodeableConcept(
          coding = LitSeq(
            Coding(
              display = Some("Eosinophil count - observation"),
              system = Some("CTV3"),
              code = Some("42K..")
            ),
            Coding(
              system = Some("SNOMED"),
              code = Some("1022561000000101")
            )
          ),
          text = Some("Eosinophil count - observation")
        ),
        effective = zdt2Ref),
      new Observation(
        meta = None,
        value = Some(choice(Quantity(unit = Some("10^9/L"), value = Some(0.0)))),
        id = Some("ec1e238ceaa0f0e21342e5993d9bc1f5"),
        status = OBSERVATION_STATUS.UNKNOWN,
        code = CodeableConcept(
          coding = LitSeq(
            Coding(
              display = Some("Basophil count"),
              system = Some("CTV3"),
              code = Some("42L..")
            ),
            Coding(
              system = Some("SNOMED"),
              code = Some("1022571000000108")
            )),
          text = Some("Basophil count")
        ),
        effective = zdt2Ref),
      new Observation(
        meta = None,
        value = Some(choice(Quantity(unit = Some("10^9/L"), value = Some(4.9)))),
        id = Some("39c6032df81b3ad7db7c8f105b2a694e"),
        status = OBSERVATION_STATUS.UNKNOWN,
        code = CodeableConcept(
          coding = LitSeq(
            Coding(
              display = Some("Neutrophil count"),
              system = Some("CTV3"),
              code = Some("42J..")
            ),
            Coding(
              system = Some("SNOMED"),
              code = Some("1022551000000104")
            )),
          text = Some("Neutrophil count")
        ),
        effective = zdt2Ref),
      new Observation(
        meta = None,
        value = Some(choice(Quantity(unit = Some("10^9/L"), value = Some(2.2)))),
        id = Some("81a418f698896f8b60c8620c06eb7eb6"),
        status = OBSERVATION_STATUS.UNKNOWN,
        code = CodeableConcept(
          coding = LitSeq(
            Coding(
              display = Some("Lymphocyte count"),
              system = Some("CTV3"),
              code = Some("42M..")
            ),
            Coding(
              system = Some("SNOMED"),
              code = Some("1022581000000105")
            )),
          text = Some("Lymphocyte count")
        ),
        effective = zdt2Ref),
      new Observation(
        meta = None,
        value = Some(choice(Quantity(unit = Some("10^9/L"), value = Some(0.6)))),
        id = Some("4e627e26b74b633389563cac1b80fdcd"),
        status = OBSERVATION_STATUS.UNKNOWN,
        code = CodeableConcept(
          coding = LitSeq(
            Coding(
              display = Some("Monocyte count - observation"),
              system = Some("CTV3"),
              code = Some("42N..")
            ),
            Coding(
              system = Some("SNOMED"),
              code = Some("1022591000000107")
            )
          ),
          text = Some("Monocyte count - observation")
        ),
        effective = zdt2Ref),
      new Observation(
        meta = None,
        value = Some(choice(Quantity(unit = Some("10^9/L"), value = Some(0.0)))),
        id = Some("d69171386938b63d05f31d30f0a2600e"),
        status = OBSERVATION_STATUS.UNKNOWN,
        code = CodeableConcept(
          coding = LitSeq(
            Coding(
              display = Some("Nucleated red blood cell count"),
              system = Some("CTV3"),
              code = Some("4266.")
            ),
            Coding(
              system = Some("SNOMED"),
              code = Some("1022461000000100")
            )
          ),
          text = Some("Nucleated red blood cell count")
        ),
        effective = zdt2Ref),
      new Observation(
        meta = None,
        value = Some(choice(Quantity(unit = Some("10^12/L"), value = Some(4.24)))),
        id = Some("f91cd505b5acf7f05393986d58c27b70"),
        status = OBSERVATION_STATUS.UNKNOWN,
        code = CodeableConcept(
          coding = LitSeq(
            Coding(
              display = Some("Red blood cell count"),
              system = Some("CTV3"),
              code = Some("426..")
            ),
            Coding(
              system = Some("SNOMED"),
              code = Some("1022451000000103")
            )
          ),
          text = Some("Red blood cell count")
        ),
        effective = zdt2Ref),
      new Observation(
        meta = None,
        value = Some(choice(Quantity(unit = Some("g/L"), value = Some(125.0)))),
        id = Some("9dc4aef8f262f6bbb833bd145d8e1710"),
        status = OBSERVATION_STATUS.UNKNOWN,
        code = CodeableConcept(
          coding = LitSeq(
            Coding(
              display = Some("Haemoglobin concentration"),
              system = Some("CTV3"),
              code = Some("Xa96v")
            ),
            Coding(
              system = Some("SNOMED"),
              code = Some("1022431000000105")
            )
          ),
          text = Some("Haemoglobin concentration")
        ),
        effective = zdt2Ref),
      new Observation(
        meta = None,
        id = Some("1b9f1277acba247e12cb30d9017c6414"),
        status = OBSERVATION_STATUS.UNKNOWN,
        code = CodeableConcept(
          coding = LitSeq(
            Coding(
              display = Some("Haematocrit"),
              system = Some("CTV3"),
              code = Some("X76tb")
            ),
            Coding(
              system = Some("SNOMED"),
              code = Some("1022291000000105")
            )),
          text = Some("Haematocrit")
        ),
        effective = zdt2Ref),
      new Observation(
        meta = None,
        id = Some("0f58a36be6efa98fb21ddb20634d629a"),
        status = OBSERVATION_STATUS.UNKNOWN,
        code = CodeableConcept(
          coding = LitSeq(
            Coding(
              display = Some("Full blood count"),
              system = Some("CTV3"),
              code = Some("424..")
            ),
            Coding(
              system = Some("SNOMED"),
              code = Some("1022441000000101")
            )),
          text = Some("Full blood count")
        ),
        effective = zdt2Ref),
      new Observation(
        meta = None,
        value = Some(choice(Quantity(unit = Some("10^9/L"), value = Some(7.9)))),
        id = Some("514bfd186a37bb87994abc38399e40a9"),
        status = OBSERVATION_STATUS.UNKNOWN,
        code = CodeableConcept(
          coding = LitSeq(
            Coding(
              display = Some("Total white blood count"),
              system = Some("CTV3"),
              code = Some("XaIdY")
            ),
            Coding(
              system = Some("SNOMED"),
              code = Some("1022541000000102")
            )
          ),
          text = Some("Total white blood count")
        ),
        effective = zdt2Ref),
      new Observation(
        meta = None,
        value = Some(choice(Quantity(unit = Some("%"), value = Some(10.0)))),
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
        effective = zdt2Ref),
      new Observation(
        meta = None,
        value = Some(choice(Quantity(unit = Some("10^9/L"), value = Some(283.0)))),
        id = Some("030cfd1231eb76c279236ebcc419341c"),
        status = OBSERVATION_STATUS.UNKNOWN,
        code = CodeableConcept(
          coding = LitSeq(
            Coding(
              display = Some("Platelet count - observation"),
              system = Some("CTV3"),
              code = Some("42P..")
            ),
            Coding(
              system = Some("SNOMED"),
              code = Some("1022651000000100")
            )
          ),
          text = Some("Platelet count - observation")
        ),
        effective = zdt2Ref),
      new Observation(
        meta = None,
        value = Some(choice(Quantity(unit = Some("fL"), value = Some(7.2)))),
        id = Some("b6a1f9863743ea2388ced325963c34fc"),
        status = OBSERVATION_STATUS.UNKNOWN,
        code = CodeableConcept(
          coding = LitSeq(
            Coding(
              display = Some("Mean platelet volume"),
              system = Some("CTV3"),
              code = Some("42Z5.")
            ),
            Coding(
              system = Some("SNOMED"),
              code = Some("993481000000101")
            )
          ),
          text = Some("Mean platelet volume")
        ),
        effective = zdt2Ref)
    )
}

object LoadsOfObservationsPt2 {
  def observations_pt2 =
    Seq(
      new Observation(
        meta = None,
        value = Some(choice(Quantity(unit = Some("fL"), value = Some(89.4)))),
        id = Some("e9e732ff59e5220a245efb610b42026a"),
        status = OBSERVATION_STATUS.UNKNOWN,
        code = CodeableConcept(
          coding = LitSeq(
            Coding(
              display = Some("Mean cell volume"),
              system = Some("CTV3"),
              code = Some("42A..")
            ),
            Coding(
              system = Some("SNOMED"),
              code = Some("1022491000000106")
            )),
          text = Some("Mean cell volume")
        ),
        effective = zdt2Ref),
      new Observation(
        meta = None,
        value = Some(choice(Quantity(unit = Some("pg"), value = Some(29.5)))),
        id = Some("8dd13009ce04161e4971a42f95813016"),
        status = OBSERVATION_STATUS.UNKNOWN,
        code = CodeableConcept(
          coding = LitSeq(
            Coding(
              display = Some("Mean cell haemoglobin level"),
              system = Some("CTV3"),
              code = Some("XE2pb")
            ),
            Coding(
              system = Some("SNOMED"),
              code = Some("1022471000000107")
            )
          ),
          text = Some("Mean cell haemoglobin level")
        ),
        effective = zdt2Ref),
      new Observation(
        meta = None,
        value = Some(choice(Quantity(unit = Some("g/dL"), value = Some(33.0)))),
        id = Some("270e5bbd68b0363d3915af95d44011c8"),
        status = OBSERVATION_STATUS.UNKNOWN,
        code = CodeableConcept(
          coding = LitSeq(
            Coding(
              display = Some("Mean cell haemoglobin concentration"),
              system = Some("CTV3"),
              code = Some("429..")
            ),
            Coding(
              system = Some("SNOMED"),
              code = Some("1022481000000109")
            )
          ),
          text = Some("Mean cell haemoglobin concentration")
        ),
        effective = zdt2Ref),
      new Observation(
        meta = None,
        value = Some(choice(Quantity(unit = Some("mg/L"), value = Some(7.5)))),
        id = Some("05529a158137d69a812c3d1cb27e1637"),
        status = OBSERVATION_STATUS.UNKNOWN,
        code = CodeableConcept(
          coding = LitSeq(
            Coding(
              display = Some("Plasma C-reactive protein level"),
              system = Some("CTV3"),
              code = Some("XE2dy")
            ),
            Coding(
              system = Some("SNOMED"),
              code = Some("999651000000107")
            )
          ),
          text = Some("Plasma C-reactive protein level")
        ),
        effective = zdt2Ref),
      new Observation(
        meta = None,
        value = Some(choice(Quantity(unit = Some("mmol/L"), value = Some(4.2)))),
        id = Some("55e907404e9ee3883752055639966bc8"),
        status = OBSERVATION_STATUS.UNKNOWN,
        code = CodeableConcept(
          coding = LitSeq(
            Coding(
              display = Some("Serum potassium level"),
              system = Some("CTV3"),
              code = Some("XE2pz")
            ),
            Coding(
              system = Some("SNOMED"),
              code = Some("1000651000000109")
            )
          ),
          text = Some("Serum potassium level")
        ),
        effective = zdt2Ref),
      new Observation(
        meta = None,
        value = Some(choice(Quantity(unit = Some("umol/L"), value = Some(49.0)))),
        id = Some("3a3f18460a90252e8c9e1bea69a1d6c2"),
        status = OBSERVATION_STATUS.UNKNOWN,
        code = CodeableConcept(
          coding = LitSeq(
            Coding(
              display = Some("Serum creatinine level"),
              system = Some("CTV3"),
              code = Some("XE2q5")
            ),
            Coding(
              system = Some("SNOMED"),
              code = Some("1000731000000107")
            )
          ),
          text = Some("Serum creatinine level")
        ),
        effective = zdt2Ref),
      new Observation(
        meta = None,
        value = Some(choice(Quantity(unit = Some("mL/min"), value = Some(90.0)))),
        id = Some("2dca5218e3a79b70a1dcf55fecf35109"),
        status = OBSERVATION_STATUS.UNKNOWN,
        code = CodeableConcept(
          coding = LitSeq(
            Coding(
              display = Some("eGFR using creatinine (CKD-EPI) per 1.73 square metres"),
              system = Some("CTV3"),
              code = Some("XacUK")
            ),
            Coding(
              system = Some("SNOMED"),
              code = Some("1011481000000105")
            )
          ),
          text = Some("eGFR using creatinine (CKD-EPI) per 1.73 square metres")
        ),
        effective = zdt2Ref)
    )
}

object LoadsOfObservationsPt3 {
  def observations_pt3 =
    Seq(
      new Observation(
        meta = None,
        value = Some(choice(Quantity(unit = Some("mmol/L"), value = Some(138.0)))),
        id = Some("6e4ed9dcecd0d80aeada0142d2f02f9c"),
        status = OBSERVATION_STATUS.UNKNOWN,
        code = CodeableConcept(
          coding = LitSeq(
            Coding(
              display = Some("Serum sodium level"),
              system = Some("CTV3"),
              code = Some("XE2q0")
            ),
            Coding(
              system = Some("SNOMED"),
              code = Some("1000661000000107")
            )),
          text = Some("Serum sodium level")
        ),
        effective = zdt2Ref),
      new Observation(
        meta = None,
        id = Some("ca42d14f02f262435cb7b95f5723f222"),
        status = OBSERVATION_STATUS.UNKNOWN,
        code = CodeableConcept(
          coding = LitSeq(
            Coding(
              display = Some("Renal function tests"),
              system = Some("CTV3"),
              code = Some("451..")
            ),
            Coding(
              system = Some("SNOMED"),
              code = Some("1015971000000100")
            )
          ),
          text = Some("Renal function tests")
        ),
        effective = zdt2Ref),
      new Observation(
        meta = None,
        value = Some(choice(Quantity(unit = Some("pg"), value = Some(29.5)))),
        id = Some("8dd13009ce04161e4971a42f95813016"),
        status = OBSERVATION_STATUS.UNKNOWN,
        code = CodeableConcept(
          coding = LitSeq(
            Coding(
              display = Some("Mean cell haemoglobin level"),
              system = Some("CTV3"),
              code = Some("XE2pb")
            ),
            Coding(
              system = Some("SNOMED"),
              code = Some("1022471000000107")
            )
          ),
          text = Some("Mean cell haemoglobin level")
        ),
        effective = zdt2Ref),
      new Observation(
        meta = None,
        value = Some(choice(Quantity(unit = Some("fL"), value = Some(7.2)))),
        id = Some("b6a1f9863743ea2388ced325963c34fc"),
        status = OBSERVATION_STATUS.UNKNOWN,
        code = CodeableConcept(
          coding = LitSeq(
            Coding(
              display = Some("Mean platelet volume"),
              system = Some("CTV3"),
              code = Some("42Z5.")
            ),
            Coding(
              system = Some("SNOMED"),
              code = Some("993481000000101")
            )
          ),
          text = Some("Mean platelet volume")
        ),
        effective = zdt2Ref),
      new Observation(
        meta = None,
        value = Some(choice(Quantity(unit = Some("10^9/L"), value = Some(0.0)))),
        id = Some("d69171386938b63d05f31d30f0a2600e"),
        status = OBSERVATION_STATUS.UNKNOWN,
        code = CodeableConcept(
          coding = LitSeq(
            Coding(
              display = Some("Nucleated red blood cell count"),
              system = Some("CTV3"),
              code = Some("4266.")
            ),
            Coding(
              system = Some("SNOMED"),
              code = Some("1022461000000100")
            )
          ),
          text = Some("Nucleated red blood cell count")
        ),
        effective = zdt2Ref),
      new Observation(
        meta = None,
        value = Some(choice(Quantity(unit = Some("10^9/L"), value = Some(4.9)))),
        id = Some("39c6032df81b3ad7db7c8f105b2a694e"),
        status = OBSERVATION_STATUS.UNKNOWN,
        code = CodeableConcept(
          coding = LitSeq(
            Coding(
              display = Some("Neutrophil count"),
              system = Some("CTV3"),
              code = Some("42J..")
            ),
            Coding(
              system = Some("SNOMED"),
              code = Some("1022551000000104")
            )),
          text = Some("Neutrophil count")
        ),
        effective = zdt2Ref),
      new Observation(
        meta = None,
        value = Some(choice(Quantity(unit = Some("g/dL"), value = Some(33.0)))),
        id = Some("270e5bbd68b0363d3915af95d44011c8"),
        status = OBSERVATION_STATUS.UNKNOWN,
        code = CodeableConcept(
          coding = LitSeq(
            Coding(
              display = Some("Mean cell haemoglobin concentration"),
              system = Some("CTV3"),
              code = Some("429..")
            ),
            Coding(
              system = Some("SNOMED"),
              code = Some("1022481000000109")
            )
          ),
          text = Some("Mean cell haemoglobin concentration")
        ),
        effective = zdt2Ref),
      new Observation(
        meta = None,
        value = Some(choice(Quantity(unit = Some("%"), value = Some(10.0)))),
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
        effective = zdt2Ref),
      new Observation(
        meta = None,
        value = Some(choice(Quantity(unit = Some("10^9/L"), value = Some(283.0)))),
        id = Some("030cfd1231eb76c279236ebcc419341c"),
        status = OBSERVATION_STATUS.UNKNOWN,
        code = CodeableConcept(
          coding = LitSeq(
            Coding(
              display = Some("Platelet count - observation"),
              system = Some("CTV3"),
              code = Some("42P..")
            ),
            Coding(
              system = Some("SNOMED"),
              code = Some("1022651000000100")
            )
          ),
          text = Some("Platelet count - observation")
        ),
        effective = zdt2Ref),
      new Observation(
        meta = None,
        value = Some(choice(Quantity(unit = Some("10^9/L"), value = Some(0.0)))),
        id = Some("ec1e238ceaa0f0e21342e5993d9bc1f5"),
        status = OBSERVATION_STATUS.UNKNOWN,
        code = CodeableConcept(
          coding = LitSeq(
            Coding(
              display = Some("Basophil count"),
              system = Some("CTV3"),
              code = Some("42L..")
            ),
            Coding(
              system = Some("SNOMED"),
              code = Some("1022571000000108")
            )),
          text = Some("Basophil count")
        ),
        effective = zdt2Ref),
      new Observation(
        meta = None,
        id = Some("0f58a36be6efa98fb21ddb20634d629a"),
        status = OBSERVATION_STATUS.UNKNOWN,
        code = CodeableConcept(
          coding = LitSeq(
            Coding(
              display = Some("Full blood count"),
              system = Some("CTV3"),
              code = Some("424..")
            ),
            Coding(
              system = Some("SNOMED"),
              code = Some("1022441000000101")
            )),
          text = Some("Full blood count")
        ),
        effective = zdt2Ref),
      new Observation(
        meta = None,
        value = Some(choice(Quantity(unit = Some("10^9/L"), value = Some(7.9)))),
        id = Some("514bfd186a37bb87994abc38399e40a9"),
        status = OBSERVATION_STATUS.UNKNOWN,
        code = CodeableConcept(
          coding = LitSeq(
            Coding(
              display = Some("Total white blood count"),
              system = Some("CTV3"),
              code = Some("XaIdY")
            ),
            Coding(
              system = Some("SNOMED"),
              code = Some("1022541000000102")
            )
          ),
          text = Some("Total white blood count")
        ),
        effective = zdt2Ref),
      new Observation(
        meta = None,
        value = Some(choice(Quantity(unit = Some("10^9/L"), value = Some(2.2)))),
        id = Some("81a418f698896f8b60c8620c06eb7eb6"),
        status = OBSERVATION_STATUS.UNKNOWN,
        code = CodeableConcept(
          coding = LitSeq(
            Coding(
              display = Some("Lymphocyte count"),
              system = Some("CTV3"),
              code = Some("42M..")
            ),
            Coding(
              system = Some("SNOMED"),
              code = Some("1022581000000105")
            )),
          text = Some("Lymphocyte count")
        ),
        effective = zdt2Ref),
      new Observation(
        meta = None,
        value = Some(choice(Quantity(unit = Some("10^9/L"), value = Some(0.6)))),
        id = Some("4e627e26b74b633389563cac1b80fdcd"),
        status = OBSERVATION_STATUS.UNKNOWN,
        code = CodeableConcept(
          coding = LitSeq(
            Coding(
              display = Some("Monocyte count - observation"),
              system = Some("CTV3"),
              code = Some("42N..")
            ),
            Coding(
              system = Some("SNOMED"),
              code = Some("1022591000000107")
            )
          ),
          text = Some("Monocyte count - observation")
        ),
        effective = zdt2Ref)
    )
}
object LoadsOfObservationsPt4 {
  val observations_pt4 = Seq(
    new Observation(
      meta = None,
      value = Some(choice(Quantity(unit = Some("10^9/L"), value = Some(0.2)))),
      id = Some("9c4ba3d2f99d610439372f27fb2e6004"),
      status = OBSERVATION_STATUS.UNKNOWN,
      code = CodeableConcept(
        coding = LitSeq(
          Coding(
            display = Some("Eosinophil count - observation"),
            system = Some("CTV3"),
            code = Some("42K..")
          ),
          Coding(
            system = Some("SNOMED"),
            code = Some("1022561000000101")
          )
        ),
        text = Some("Eosinophil count - observation")
      ),
      effective = zdt2Ref),
    new Observation(
      meta = None,
      value = Some(choice(Quantity(unit = Some("fL"), value = Some(89.4)))),
      id = Some("e9e732ff59e5220a245efb610b42026a"),
      status = OBSERVATION_STATUS.UNKNOWN,
      code = CodeableConcept(
        coding = LitSeq(
          Coding(
            display = Some("Mean cell volume"),
            system = Some("CTV3"),
            code = Some("42A..")
          ),
          Coding(
            system = Some("SNOMED"),
            code = Some("1022491000000106")
          )),
        text = Some("Mean cell volume")
      ),
      effective = zdt2Ref),
    new Observation(
      meta = None,
      value = Some(choice(Quantity(unit = Some("10^12/L"), value = Some(4.24)))),
      id = Some("f91cd505b5acf7f05393986d58c27b70"),
      status = OBSERVATION_STATUS.UNKNOWN,
      code = CodeableConcept(
        coding = LitSeq(
          Coding(
            display = Some("Red blood cell count"),
            system = Some("CTV3"),
            code = Some("426..")
          ),
          Coding(
            system = Some("SNOMED"),
            code = Some("1022451000000103")
          )
        ),
        text = Some("Red blood cell count")
      ),
      effective = zdt2Ref),
    new Observation(
      meta = None,
      value = Some(choice(Quantity(unit = Some("g/L"), value = Some(125.0)))),
      id = Some("9dc4aef8f262f6bbb833bd145d8e1710"),
      status = OBSERVATION_STATUS.UNKNOWN,
      code = CodeableConcept(
        coding = LitSeq(
          Coding(
            display = Some("Haemoglobin concentration"),
            system = Some("CTV3"),
            code = Some("Xa96v")
          ),
          Coding(
            system = Some("SNOMED"),
            code = Some("1022431000000105")
          )
        ),
        text = Some("Haemoglobin concentration")
      ),
      effective = zdt2Ref),
    new Observation(
      meta = None,
      id = Some("1b9f1277acba247e12cb30d9017c6414"),
      status = OBSERVATION_STATUS.UNKNOWN,
      code = CodeableConcept(
        coding = LitSeq(
          Coding(
            display = Some("Haematocrit"),
            system = Some("CTV3"),
            code = Some("X76tb")
          ),
          Coding(
            system = Some("SNOMED"),
            code = Some("1022291000000105")
          )),
        text = Some("Haematocrit")
      ),
      effective = zdt2Ref),
    new Observation(
      meta = None,
      value = Some(choice(Quantity(unit = Some("miu/L"), value = Some(1.99)))),
      id = Some("d15b93628cff6754cf5a0a04d52dd1b6"),
      status = OBSERVATION_STATUS.UNKNOWN,
      code = CodeableConcept(
        coding = LitSeq(
          Coding(
            display = Some("Serum TSH level"),
            system = Some("CTV3"),
            code = Some("XaELV")
          ),
          Coding(
            system = Some("SNOMED"),
            code = Some("1022791000000101")
          )),
        text = Some("Serum TSH level")
      ),
      effective = zdt2Ref),
    new Observation(
      meta = None,
      value = Some(choice(Quantity(unit = Some("iu/L"), value = Some(50.0)))),
      id = Some("fb198dad03a1eec0fb780473cf4da05f"),
      status = OBSERVATION_STATUS.UNKNOWN,
      code = CodeableConcept(
        coding = LitSeq(
          Coding(
            display = Some("Serum alkaline phosphatase level"),
            system = Some("CTV3"),
            code = Some("XE2px")
          ),
          Coding(
            system = Some("SNOMED"),
            code = Some("1000621000000104")
          )
        ),
        text = Some("Serum alkaline phosphatase level")
      ),
      effective = zdt2Ref),
    new Observation(
      meta = None,
      value = Some(choice(Quantity(unit = Some("g/L"), value = Some(42.0)))),
      id = Some("87a25dc309584fcbb76c0a411492e6b9"),
      status = OBSERVATION_STATUS.UNKNOWN,
      code = CodeableConcept(
        coding = LitSeq(
          Coding(
            display = Some("Serum albumin level"),
            system = Some("CTV3"),
            code = Some("XE2eA")
          ),
          Coding(
            system = Some("SNOMED"),
            code = Some("1000821000000103")
          )
        ),
        text = Some("Serum albumin level")
      ),
      effective = zdt2Ref),
    new Observation(
      meta = None,
      id = Some("f3c72d5f8df7f2d435abe19442735611"),
      status = OBSERVATION_STATUS.UNKNOWN,
      code = CodeableConcept(
        coding = LitSeq(
          Coding(
            display = Some("Liver function tests"),
            system = Some("CTV3"),
            code = Some("X77WP")
          ),
          Coding(
            system = Some("SNOMED"),
            code = Some("997531000000108")
          )
        ),
        text = Some("Liver function tests")
      ),
      effective = zdt2Ref),
    new Observation(
      meta = None,
      value = Some(choice(Quantity(unit = Some("iu/L"), value = Some(18.0)))),
      id = Some("cde5b91396f0e3fc66ac9adaa7e34189"),
      status = OBSERVATION_STATUS.UNKNOWN,
      code = CodeableConcept(
        coding = LitSeq(
          Coding(
            display = Some("Serum alanine aminotransferase level"),
            system = Some("CTV3"),
            code = Some("XaLJx")
          ),
          Coding(
            system = Some("SNOMED"),
            code = Some("1018251000000107")
          )
        ),
        text = Some("Serum alanine aminotransferase level")
      ),
      effective = zdt2Ref)
  )
}

object LoadsOfObservations {
  val final_4_observations: Seq[Observation] = Seq(
    new Observation(
      meta = None,
      value = Some(choice(Quantity(unit = Some("umol/L"), value = Some(5.0)))),
      id = Some("9f6ba48aa7ed06534520c16546df36fa"),
      status = OBSERVATION_STATUS.UNKNOWN,
      code = CodeableConcept(
        coding = LitSeq(
          Coding(
            display = Some("Serum bilirubin level"),
            system = Some("CTV3"),
            code = Some("44E..")
          ),
          Coding(
            system = Some("SNOMED"),
            code = Some("999691000000104")
          )
        ),
        text = Some("Serum bilirubin level")
      ),
      effective = zdt2Ref),
    new Observation(
      meta = None,
      value = Some(choice(Quantity(unit = Some("ng/ml"), value = Some(47.0)))),
      id = Some("1e25e7a96a48b57e401ed66222fe9f5d"),
      status = OBSERVATION_STATUS.UNKNOWN,
      code = CodeableConcept(
        coding = LitSeq(
          Coding(
            display = Some("Serum ferritin level"),
            system = Some("CTV3"),
            code = Some("XE24r")
          ),
          Coding(
            system = Some("SNOMED"),
            code = Some("993381000000106")
          )
        ),
        text = Some("Serum ferritin level")
      ),
      effective = zdt2Ref),
    new Observation(
      meta = None,
      value = Some(choice(Quantity(unit = Some("mmol/mol"), value = Some(33.0)))),
      id = Some("a536357aaa69fd61a564ee562d01d584"),
      status = OBSERVATION_STATUS.UNKNOWN,
      code = CodeableConcept(
        coding = LitSeq(
          Coding(
            display = Some("Haemoglobin A1c level - IFCC standardised"),
            system = Some("CTV3"),
            code = Some("XaPbt")
          ),
          Coding(
            system = Some("SNOMED"),
            code = Some("999791000000106")
          )
        ),
        text = Some("Haemoglobin A1c level - IFCC standardised")
      ),
      effective = zdt2Ref),
    new Observation(
      meta = None,
      value = Some(choice(Quantity(unit = Some("mmol/L"), value = Some(4.6)))),
      id = Some("db4614ce1be93ff3239fb35334a81b49"),
      status = OBSERVATION_STATUS.UNKNOWN,
      code = CodeableConcept(
        coding = LitSeq(
          Coding(
            display = Some("Plasma glucose level"),
            system = Some("CTV3"),
            code = Some("XM0ly")
          ),
          Coding(
            system = Some("SNOMED"),
            code = Some("1010671000000102")
          )
        ),
        text = Some("Plasma glucose level")
      ),
      effective = zdt2Ref)
  )

  val observations: LitSeq[Observation] =
    LoadsOfObservationsPt1.observations_pt1 ++
      LoadsOfObservationsPt2.observations_pt2 ++
      LoadsOfObservationsPt3.observations_pt3 ++
      LoadsOfObservationsPt4.observations_pt4 ++
      final_4_observations to LitSeq
}
