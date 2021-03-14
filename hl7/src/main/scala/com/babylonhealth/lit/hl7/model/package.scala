package com.babylonhealth.lit.hl7

import java.time.{ LocalDate, LocalTime, ZonedDateTime }
import java.util.UUID

import com.babylonhealth.lit.core._
import com.babylonhealth.lit.core.model._

object UnionAliases {
  type Union00078348305 = CodeableConcept \/ FHIRDate
  type Union00434638053 = Address \/ Reference
  type Union00483057553 = Base64Binary \/ String
  type Union00545979821 = Canonical \/ UriStr
  type Union00600764285 = BigDecimal \/ Boolean \/ Id \/ Int \/ String
  type Union00607514014 = Duration \/ FHIRDateTime \/ Period \/ Timing
  type Union00609373412 = FHIRDateTime \/ Period \/ Timing
  type Union00683246261 = Boolean \/ Canonical
  type Union00801828838 = Duration \/ Range
  type Union00910671146 = Quantity \/ Range \/ Ratio \/ String
  type Union01056080496 = Boolean \/ CodeableConcept \/ Int \/ Quantity \/ Range \/ Ratio \/ String
  type Union01200936722 = Period \/ Range
  type Union01219602913 = Duration \/ FHIRDate
  type Union01243416269 = CodeableConcept \/ Duration
  type Union01352864625 = Age \/ FHIRDateTime \/ Period \/ Range \/ String
  type Union01473702374 = FHIRDateTime \/ Period \/ Timing \/ ZonedDateTime
  type Union01486281057 = FHIRDate \/ Period \/ String
  type Union01560785079 = CodeableConcept \/ Quantity \/ Range
  type Union01583485927 = Coding \/ UriStr
  type Union01646729908 = Boolean \/ CodeableConcept \/ Quantity \/ Range \/ Reference
  type Union01726112534 = Period \/ String \/ Timing
  type Union01727798874 = Age \/ Period \/ Range \/ String
  type Union01831019594 = Reference \/ UrlStr
  type Union02065782851 = Boolean \/ Int
  type Union_0040864668 = Money \/ String \/ UnsignedInt
  type Union_0181779868 = Age \/ Duration \/ FHIRDateTime \/ Period \/ Range \/ Timing
  type Union_0221283134 = Money \/ Quantity
  type Union_0316522316 = Address \/ CodeableConcept \/ Reference
  type Union_0340660840 = Attachment \/ Reference
  type Union_0358050020 =
    Canonical \/ CodeableConcept \/ DataRequirement \/ Expression \/ Reference \/ TriggerDefinition
  type Union_0388264667 =
    BigDecimal \/ Boolean \/ Coding \/ FHIRDate \/ FHIRDateTime \/ Int \/ LocalTime \/ Quantity \/ Reference \/ String
  type Union_0503196159 = FHIRDate \/ Period
  type Union_0543144563 = Attachment \/ Boolean \/ Quantity \/ Reference \/ String
  type Union_0637176084 =
    BigDecimal \/ FHIRDate \/ FHIRDateTime \/ Int \/ LocalTime \/ PositiveInt \/ Quantity \/ UnsignedInt \/ ZonedDateTime
  type Union_0687680458 = Canonical \/ CodeableConcept \/ UriStr
  type Union_0802685816 =
    Boolean \/ CodeableConcept \/ FHIRDateTime \/ Int \/ LocalTime \/ Period \/ Quantity \/ Range \/ Ratio \/ SampledData \/ String
  type Union_0831630297 = BigDecimal \/ Range
  type Union_0839638734 = PositiveInt \/ String
  type Union_0934386166 = FHIRDateTime \/ Period
  type Union_0964108894 = Quantity \/ Ratio
  type Union_0966801288 = Age \/ Boolean \/ FHIRDate \/ Range \/ String
  type Union_0970951552 = CodeableConcept \/ Quantity
  type Union_0983418289 = Identifier \/ Reference
  type Union_1132894602 = Coding \/ FHIRDate \/ Int \/ LocalTime \/ Reference \/ String
  type Union_1289000811 = Money \/ UnsignedInt
  type Union_1309404550 = Base64Binary \/ CodeableConcept \/ Quantity \/ String
  type Union_1427970408 = BigDecimal \/ Boolean \/ Code \/ FHIRDateTime \/ Int \/ String \/ UriStr
  type Union_1489367071 = BigDecimal \/ Boolean \/ Code \/ Coding \/ FHIRDateTime \/ Int \/ String
  type Union_1507098327 = Age \/ Range \/ String
  type Union_1516277229 = Boolean \/ CodeableConcept \/ Quantity \/ Range
  type Union_1524702593 = Boolean \/ Reference
  type Union_1527751898 = Quantity \/ Range \/ String
  type Union_1715923163 = FHIRDateTime \/ String
  type Union_1750128470 = Canonical \/ CodeableConcept \/ DataRequirement \/ Expression
  type Union_1750183386 = Attachment \/ Reference \/ String
  type Union_2072987899 = Quantity \/ String
  type Union_2101127777 =
    Attachment \/ BigDecimal \/ Boolean \/ Coding \/ FHIRDate \/ FHIRDateTime \/ Int \/ LocalTime \/ Quantity \/ Reference \/ String \/ UriStr
  type Union_2131715935 = Boolean \/ FHIRDateTime
}
