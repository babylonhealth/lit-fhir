package com.babylonhealth.lit.ukcore

import java.time.{ LocalDate, LocalTime, ZonedDateTime }
import java.util.UUID

import izumi.reflect.macrortti.LTag

import com.babylonhealth.lit.core._
import com.babylonhealth.lit.core.model._
import com.babylonhealth.lit.ukcore.model._

object Module
    extends ModuleDict(
      Map(
        "https://fhir.hl7.org.uk/StructureDefinition/UKCore-AllergyIntolerance"       -> UKCore_AllergyIntolerance,
        "https://fhir.hl7.org.uk/StructureDefinition/UKCore-AuditEvent"               -> UKCore_AuditEvent,
        "https://fhir.hl7.org.uk/StructureDefinition/UKCore-Bundle"                   -> UKCore_Bundle,
        "https://fhir.hl7.org.uk/StructureDefinition/UKCore-CarePlan"                 -> UKCore_CarePlan,
        "https://fhir.hl7.org.uk/StructureDefinition/UKCore-CareTeam"                 -> UKCore_CareTeam,
        "https://fhir.hl7.org.uk/StructureDefinition/UKCore-Communication"            -> UKCore_Communication,
        "https://fhir.hl7.org.uk/StructureDefinition/UKCore-Composition"              -> UKCore_Composition,
        "https://fhir.hl7.org.uk/StructureDefinition/UKCore-Condition"                -> UKCore_Condition,
        "https://fhir.hl7.org.uk/StructureDefinition/UKCore-Consent"                  -> UKCore_Consent,
        "https://fhir.hl7.org.uk/StructureDefinition/UKCore-Device"                   -> UKCore_Device,
        "https://fhir.hl7.org.uk/StructureDefinition/UKCore-DiagnosticReport"         -> UKCore_DiagnosticReport,
        "https://fhir.hl7.org.uk/StructureDefinition/UKCore-DocumentReference"        -> UKCore_DocumentReference,
        "https://fhir.hl7.org.uk/StructureDefinition/UKCore-Encounter"                -> UKCore_Encounter,
        "https://fhir.hl7.org.uk/StructureDefinition/UKCore-EpisodeOfCare"            -> UKCore_EpisodeOfCare,
        "https://fhir.hl7.org.uk/StructureDefinition/UKCore-Immunization"             -> UKCore_Immunization,
        "https://fhir.hl7.org.uk/StructureDefinition/UKCore-List"                     -> UKCore_List,
        "https://fhir.hl7.org.uk/StructureDefinition/UKCore-Location"                 -> UKCore_Location,
        "https://fhir.hl7.org.uk/StructureDefinition/UKCore-Medication"               -> UKCore_Medication,
        "https://fhir.hl7.org.uk/StructureDefinition/UKCore-MedicationAdministration" -> UKCore_MedicationAdministration,
        "https://fhir.hl7.org.uk/StructureDefinition/UKCore-MedicationDispense"       -> UKCore_MedicationDispense,
        "https://fhir.hl7.org.uk/StructureDefinition/UKCore-MedicationRequest"        -> UKCore_MedicationRequest,
        "https://fhir.hl7.org.uk/StructureDefinition/UKCore-MedicationStatement"      -> UKCore_MedicationStatement,
        "https://fhir.hl7.org.uk/StructureDefinition/UKCore-MessageHeader"            -> UKCore_MessageHeader,
        "https://fhir.hl7.org.uk/StructureDefinition/UKCore-Observation"              -> UKCore_Observation,
        "https://fhir.hl7.org.uk/StructureDefinition/UKCore-OperationOutcome"         -> UKCore_OperationOutcome,
        "https://fhir.hl7.org.uk/StructureDefinition/UKCore-Organization"             -> UKCore_Organization,
        "https://fhir.hl7.org.uk/StructureDefinition/UKCore-Patient"                  -> UKCore_Patient,
        "https://fhir.hl7.org.uk/StructureDefinition/UKCore-Practitioner"             -> UKCore_Practitioner,
        "https://fhir.hl7.org.uk/StructureDefinition/UKCore-PractitionerRole"         -> UKCore_PractitionerRole,
        "https://fhir.hl7.org.uk/StructureDefinition/UKCore-Procedure"                -> UKCore_Procedure,
        "https://fhir.hl7.org.uk/StructureDefinition/UKCore-Provenance"               -> UKCore_Provenance,
        "https://fhir.hl7.org.uk/StructureDefinition/UKCore-Questionnaire"            -> UKCore_Questionnaire,
        "https://fhir.hl7.org.uk/StructureDefinition/UKCore-QuestionnaireResponse"    -> UKCore_QuestionnaireResponse,
        "https://fhir.hl7.org.uk/StructureDefinition/UKCore-RelatedPerson"            -> UKCore_RelatedPerson,
        "https://fhir.hl7.org.uk/StructureDefinition/UKCore-ServiceRequest"           -> UKCore_ServiceRequest,
        "https://fhir.hl7.org.uk/StructureDefinition/UKCore-Specimen"                 -> UKCore_Specimen,
        "https://fhir.hl7.org.uk/StructureDefinition/UKCore-VitalSigns-Observation"   -> UKCore_VitalSigns_Observation
      ))
