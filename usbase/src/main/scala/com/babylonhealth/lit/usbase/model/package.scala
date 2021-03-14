package com.babylonhealth.lit.usbase

import java.time.{ LocalDate, LocalTime, ZonedDateTime }
import java.util.UUID

import com.babylonhealth.lit.core._
import com.babylonhealth.lit.core.model._

object UnionAliases {
  type Union00284192631 = Duration \/ Period
  type Union00315627715 = BigDecimal \/ FHIRDate \/ FHIRDateTime \/ Int \/ LocalTime \/ ZonedDateTime
  type Union00813350082 = Age \/ Boolean \/ FHIRDate
  type Union01054268719 = Canonical \/ CodeableConcept
  type Union01613806391 = BigDecimal \/ FHIRDate \/ FHIRDateTime \/ Int \/ LocalTime
  type Union_1915626029 =
    CodeableConcept \/ FHIRDateTime \/ LocalTime \/ Period \/ Quantity \/ Range \/ Ratio \/ SampledData \/ String
  type Union_1946587936 = CodeableConcept \/ Range
}
