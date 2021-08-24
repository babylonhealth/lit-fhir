package com.babylonhealth.lit.uscore

import java.time.{ LocalDate, LocalTime, ZonedDateTime }
import java.util.UUID

import izumi.reflect.macrortti.LTag

import com.babylonhealth.lit.core._
import com.babylonhealth.lit.core.model._
import com.babylonhealth.lit.uscore.model._

object UnionAliases {
  type UnionPositiveIntOrString = PositiveInt | String

  val UnionPositiveIntOrStringTag: LTag[UnionPositiveIntOrString] = LTag[UnionPositiveIntOrString]
}

object Module
    extends ModuleDict(
      Map(
        "http://hl7.org/fhir/us/core/StructureDefinition/us-core-birthsex"              -> Us_core_birthsex,
        "http://hl7.org/fhir/us/core/StructureDefinition/us-core-patient"               -> Us_core_patient,
        "http://hl7.org/fhir/us/core/StructureDefinition/us-core-condition"             -> Us_core_condition,
        "http://hl7.org/fhir/us/core/StructureDefinition/us-core-direct"                -> Us_core_direct,
        "http://hl7.org/fhir/us/core/StructureDefinition/us-core-implantable-device"    -> Us_core_implantable_device,
        "http://hl7.org/fhir/us/core/StructureDefinition/us-core-location"              -> Us_core_location,
        "http://hl7.org/fhir/us/core/StructureDefinition/us-core-encounter"             -> Us_core_encounter,
        "http://hl7.org/fhir/us/core/StructureDefinition/us-core-practitioner"          -> Us_core_practitioner,
        "http://hl7.org/fhir/us/core/StructureDefinition/us-core-diagnosticreport-lab"  -> Us_core_diagnosticreport_lab,
        "http://hl7.org/fhir/us/core/StructureDefinition/us-core-goal"                  -> Us_core_goal,
        "http://hl7.org/fhir/us/core/StructureDefinition/us-core-procedure"             -> Us_core_procedure,
        "http://hl7.org/fhir/us/core/StructureDefinition/us-core-ethnicity"             -> Us_core_ethnicity,
        "http://hl7.org/fhir/us/core/StructureDefinition/us-core-immunization"          -> Us_core_immunization,
        "http://hl7.org/fhir/us/core/StructureDefinition/us-core-observation-lab"       -> Us_core_observation_lab,
        "http://hl7.org/fhir/us/core/StructureDefinition/us-core-documentreference"     -> Us_core_documentreference,
        "http://hl7.org/fhir/us/core/StructureDefinition/us-core-race"                  -> Us_core_race,
        "http://hl7.org/fhir/us/core/StructureDefinition/pediatric-bmi-for-age"         -> Pediatric_bmi_for_age,
        "http://hl7.org/fhir/us/core/StructureDefinition/us-core-pulse-oximetry"        -> Us_core_pulse_oximetry,
        "http://hl7.org/fhir/us/core/StructureDefinition/us-core-provenance"            -> Us_core_provenance,
        "http://hl7.org/fhir/us/core/StructureDefinition/us-core-allergyintolerance"    -> Us_core_allergyintolerance,
        "http://hl7.org/fhir/us/core/StructureDefinition/us-core-practitionerrole"      -> Us_core_practitionerrole,
        "http://hl7.org/fhir/us/core/StructureDefinition/us-core-careplan"              -> Us_core_careplan,
        "http://hl7.org/fhir/us/core/StructureDefinition/pediatric-weight-for-height"   -> Pediatric_weight_for_height,
        "http://hl7.org/fhir/us/core/StructureDefinition/us-core-careteam"              -> Us_core_careteam,
        "http://hl7.org/fhir/us/core/StructureDefinition/us-core-diagnosticreport-note" -> Us_core_diagnosticreport_note,
        "http://hl7.org/fhir/us/core/StructureDefinition/us-core-medication"            -> Us_core_medication,
        "http://hl7.org/fhir/us/core/StructureDefinition/us-core-organization"          -> Us_core_organization,
        "http://hl7.org/fhir/us/core/StructureDefinition/us-core-smokingstatus"         -> Us_core_smokingstatus,
        "http://hl7.org/fhir/us/core/StructureDefinition/us-core-medicationrequest"     -> Us_core_medicationrequest
      ))
