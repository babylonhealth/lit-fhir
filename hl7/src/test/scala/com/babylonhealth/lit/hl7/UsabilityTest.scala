package com.babylonhealth.lit.hl7

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

class UsabilityTest extends AnyFreeSpec with Matchers {
  "can stringify FHIR without json serdes" in {
    val observationString = LoadsOfObservations.final_4_observations.head.toString()
    observationString shouldEqual
    """Observation(id = Some(9f6ba48aa7ed06534520c16546df36fa), code = CodeableConcept(text = Some(Serum bilirubin level), coding = LitSeq(Coding(code = Some(44E..), system = Some(CTV3), display = Some(Serum bilirubin level)), Coding(code = Some(999691000000104), system = Some(SNOMED)))), status = UNKNOWN, value[x]: Quantity = Choice[Quantity \/ SampledData \/ Boolean \/ LocalTime \/ FHIRDateTime \/ CodeableConcept \/ Ratio \/ Int \/ Period \/ Range \/ String](Quantity, Quantity(unit = Some(umol/L), value = Some(5.0))), effective[x]: DateTime = Choice[FHIRDateTime \/ Period \/ Timing \/ ZonedDateTime](DateTime, FHIRDateTime(2019-11-07T17:27Z,Time)))"""
//    """Observation(id = Some(9f6ba48aa7ed06534520c16546df36fa), code = CodeableConcept(text = Some(Serum bilirubin level), coding = LitSeq(Coding(code = Some(44E..), system = Some(CTV3), display = Some(Serum bilirubin level)), Coding(code = Some(999691000000104), system = Some(SNOMED)))), status = UNKNOWN, value[x]: Quantity = Quantity(unit = Some(umol/L), value = Some(5.0)), effective[x]: DateTime = FHIRDateTime(2019-11-07T17:27Z,Time))"""
  }
  "can do sets w/out explicit type param" in {
    val x = Set(DISCRIMINATOR_TYPE.VALUE, DISCRIMINATOR_TYPE.TYPE)
    def contains(y: DISCRIMINATOR_TYPE) = {
      x contains y
    }
  }
}
