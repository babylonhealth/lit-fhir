package com.babylonhealth.lit.hl7

import java.time.ZonedDateTime

import com.babylonhealth.lit.core.ChoiceImplicits._
import com.babylonhealth.lit.core.{ Choice, FHIRDateTime, \/ }
import com.babylonhealth.lit.core.model.{ Period, Quantity, Timing }

object SharedVals {
  val zdt1 = FHIRDateTime(ZonedDateTime.parse("2019-11-07T17:25:29Z"))
  val zdt2 = FHIRDateTime(ZonedDateTime.parse("2019-11-07T17:27:00Z"))
  val zdt1Ref: Option[Choice[FHIRDateTime \/ Period \/ Timing \/ ZonedDateTime]] = Some(choice(zdt1))
  val zdt2Ref: Option[Choice[FHIRDateTime \/ Period \/ Timing \/ ZonedDateTime]] = Some(choice(zdt2))
}

object SharedTypes {
  type QuantStrBool = Quantity \/ String \/ Boolean
  type StrInt       = String \/ Int
}
