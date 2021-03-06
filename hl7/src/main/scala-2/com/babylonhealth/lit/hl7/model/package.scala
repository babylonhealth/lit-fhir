package com.babylonhealth.lit.hl7

import java.time.{ LocalDate, LocalTime, ZonedDateTime }
import java.util.UUID

import izumi.reflect.macrortti.LTag

import com.babylonhealth.lit.core._
import com.babylonhealth.lit.core.model._
import com.babylonhealth.lit.hl7.model._

object UnionAliases {
  type Union00107722725 = FHIRDateTime \/ Period \/ Timing \/ ZonedDateTime
  type Union00133982841 = Quantity \/ Range \/ Ratio \/ String
  type Union00193937709 = Canonical \/ CodeableConcept \/ DataRequirement \/ Expression \/ Reference \/ TriggerDefinition
  type Union00551919141 = BigDecimal \/ Boolean \/ Id \/ Int \/ String
  type Union00659500323 = Age \/ Boolean \/ FHIRDate \/ Range \/ String
  type Union00857130015 = Coding \/ FHIRDate \/ Int \/ LocalTime \/ Reference \/ String
  type Union01113166363 =
    Attachment \/ BigDecimal \/ Boolean \/ Coding \/ FHIRDate \/ FHIRDateTime \/ Int \/ LocalTime \/ Quantity \/ Reference \/ String \/ UriStr
  type Union01405873694 = Age \/ Duration \/ FHIRDateTime \/ Period \/ Range \/ Timing
  type Union01474038381 = Age \/ FHIRDateTime \/ Period \/ Range \/ String
  type Union01475253842 = BigDecimal \/ Boolean \/ Code \/ FHIRDateTime \/ Int \/ String \/ UriStr
  type Union01480857620 =
    BigDecimal \/ FHIRDate \/ FHIRDateTime \/ Int \/ LocalTime \/ PositiveInt \/ Quantity \/ UnsignedInt \/ ZonedDateTime
  type Union01763000476 = Duration \/ FHIRDateTime \/ Period \/ Timing
  type Union01850316684 = Boolean \/ CodeableConcept \/ Quantity \/ Range
  type Union02118820890 =
    Boolean \/ CodeableConcept \/ FHIRDateTime \/ Int \/ LocalTime \/ Period \/ Quantity \/ Range \/ Ratio \/ SampledData \/ String
  type UnionAddressOrCodeableConceptOrReference = Address \/ CodeableConcept \/ Reference
  type UnionAddressOrReference                  = Address \/ Reference
  type UnionAgeOrRangeOrString                  = Age \/ Range \/ String
  type UnionAttachmentOrReference               = Attachment \/ Reference
  type UnionAttachmentOrReferenceOrString       = Attachment \/ Reference \/ String
  type UnionBase64BinaryOrString                = Base64Binary \/ String
  type UnionBooleanOrCanonical                  = Boolean \/ Canonical
  type UnionBooleanOrDateTime                   = Boolean \/ FHIRDateTime
  type UnionBooleanOrInteger                    = Boolean \/ Int
  type UnionBooleanOrReference                  = Boolean \/ Reference
  type UnionCanonicalOrCodeableConceptOrUri     = Canonical \/ CodeableConcept \/ UriStr
  type UnionCanonicalOrUri                      = Canonical \/ UriStr
  type UnionCodeableConceptOrDate               = CodeableConcept \/ FHIRDate
  type UnionCodeableConceptOrDuration           = CodeableConcept \/ Duration
  type UnionCodeableConceptOrQuantity           = CodeableConcept \/ Quantity
  type UnionCodeableConceptOrQuantityOrRange    = CodeableConcept \/ Quantity \/ Range
  type UnionCodingOrUri                         = Coding \/ UriStr
  type UnionDateOrPeriod                        = FHIRDate \/ Period
  type UnionDateOrPeriodOrString                = FHIRDate \/ Period \/ String
  type UnionDateTimeOrPeriod                    = FHIRDateTime \/ Period
  type UnionDateTimeOrPeriodOrTiming            = FHIRDateTime \/ Period \/ Timing
  type UnionDateTimeOrString                    = FHIRDateTime \/ String
  type UnionDecimalOrRange                      = BigDecimal \/ Range
  type UnionDurationOrDate                      = Duration \/ FHIRDate
  type UnionDurationOrRange                     = Duration \/ Range
  type UnionIdentifierOrReference               = Identifier \/ Reference
  type UnionMoneyOrQuantity                     = Money \/ Quantity
  type UnionMoneyOrStringOrUnsignedInt          = Money \/ String \/ UnsignedInt
  type UnionMoneyOrUnsignedInt                  = Money \/ UnsignedInt
  type UnionPeriodOrRange                       = Period \/ Range
  type UnionPeriodOrStringOrTiming              = Period \/ String \/ Timing
  type UnionPositiveIntOrString                 = PositiveInt \/ String
  type UnionQuantityOrRangeOrString             = Quantity \/ Range \/ String
  type UnionQuantityOrRatio                     = Quantity \/ Ratio
  type UnionQuantityOrString                    = Quantity \/ String
  type UnionReferenceOrUrl                      = Reference \/ UrlStr
  type Union_0044338899                         = Canonical \/ CodeableConcept \/ DataRequirement \/ Expression
  type Union_0059314669                         = BigDecimal \/ Boolean \/ Code \/ Coding \/ FHIRDateTime \/ Int \/ String
  type Union_0600299688                         = Base64Binary \/ CodeableConcept \/ Quantity \/ String
  type Union_1061953715                         = Boolean \/ CodeableConcept \/ Int \/ Quantity \/ Range \/ Ratio \/ String
  type Union_1204024681                         = Age \/ Period \/ Range \/ String
  type Union_1280102327 =
    BigDecimal \/ Boolean \/ Coding \/ FHIRDate \/ FHIRDateTime \/ Int \/ LocalTime \/ Quantity \/ Reference \/ String
  type Union_1690912481 = Boolean \/ CodeableConcept \/ Quantity \/ Range \/ Reference
  type Union_2028408917 = Attachment \/ Boolean \/ Quantity \/ Reference \/ String

  val Union00107722725Tag: LTag[Union00107722725] = LTag[Union00107722725]
  val Union00133982841Tag: LTag[Union00133982841] = LTag[Union00133982841]
  val Union00193937709Tag: LTag[Union00193937709] = LTag[Union00193937709]
  val Union00551919141Tag: LTag[Union00551919141] = LTag[Union00551919141]
  val Union00659500323Tag: LTag[Union00659500323] = LTag[Union00659500323]
  val Union00857130015Tag: LTag[Union00857130015] = LTag[Union00857130015]
  val Union01113166363Tag: LTag[Union01113166363] = LTag[Union01113166363]
  val Union01405873694Tag: LTag[Union01405873694] = LTag[Union01405873694]
  val Union01474038381Tag: LTag[Union01474038381] = LTag[Union01474038381]
  val Union01475253842Tag: LTag[Union01475253842] = LTag[Union01475253842]
  val Union01480857620Tag: LTag[Union01480857620] = LTag[Union01480857620]
  val Union01763000476Tag: LTag[Union01763000476] = LTag[Union01763000476]
  val Union01850316684Tag: LTag[Union01850316684] = LTag[Union01850316684]
  val Union02118820890Tag: LTag[Union02118820890] = LTag[Union02118820890]
  val UnionAddressOrCodeableConceptOrReferenceTag: LTag[UnionAddressOrCodeableConceptOrReference] =
    LTag[UnionAddressOrCodeableConceptOrReference]
  val UnionAddressOrReferenceTag: LTag[UnionAddressOrReference]                       = LTag[UnionAddressOrReference]
  val UnionAgeOrRangeOrStringTag: LTag[UnionAgeOrRangeOrString]                       = LTag[UnionAgeOrRangeOrString]
  val UnionAttachmentOrReferenceOrStringTag: LTag[UnionAttachmentOrReferenceOrString] = LTag[UnionAttachmentOrReferenceOrString]
  val UnionAttachmentOrReferenceTag: LTag[UnionAttachmentOrReference]                 = LTag[UnionAttachmentOrReference]
  val UnionBase64BinaryOrStringTag: LTag[UnionBase64BinaryOrString]                   = LTag[UnionBase64BinaryOrString]
  val UnionBooleanOrCanonicalTag: LTag[UnionBooleanOrCanonical]                       = LTag[UnionBooleanOrCanonical]
  val UnionBooleanOrDateTimeTag: LTag[UnionBooleanOrDateTime]                         = LTag[UnionBooleanOrDateTime]
  val UnionBooleanOrIntegerTag: LTag[UnionBooleanOrInteger]                           = LTag[UnionBooleanOrInteger]
  val UnionBooleanOrReferenceTag: LTag[UnionBooleanOrReference]                       = LTag[UnionBooleanOrReference]
  val UnionCanonicalOrCodeableConceptOrUriTag: LTag[UnionCanonicalOrCodeableConceptOrUri] =
    LTag[UnionCanonicalOrCodeableConceptOrUri]
  val UnionCanonicalOrUriTag: LTag[UnionCanonicalOrUri]                       = LTag[UnionCanonicalOrUri]
  val UnionCodeableConceptOrDateTag: LTag[UnionCodeableConceptOrDate]         = LTag[UnionCodeableConceptOrDate]
  val UnionCodeableConceptOrDurationTag: LTag[UnionCodeableConceptOrDuration] = LTag[UnionCodeableConceptOrDuration]
  val UnionCodeableConceptOrQuantityOrRangeTag: LTag[UnionCodeableConceptOrQuantityOrRange] =
    LTag[UnionCodeableConceptOrQuantityOrRange]
  val UnionCodeableConceptOrQuantityTag: LTag[UnionCodeableConceptOrQuantity]   = LTag[UnionCodeableConceptOrQuantity]
  val UnionCodingOrUriTag: LTag[UnionCodingOrUri]                               = LTag[UnionCodingOrUri]
  val UnionDateOrPeriodOrStringTag: LTag[UnionDateOrPeriodOrString]             = LTag[UnionDateOrPeriodOrString]
  val UnionDateOrPeriodTag: LTag[UnionDateOrPeriod]                             = LTag[UnionDateOrPeriod]
  val UnionDateTimeOrPeriodOrTimingTag: LTag[UnionDateTimeOrPeriodOrTiming]     = LTag[UnionDateTimeOrPeriodOrTiming]
  val UnionDateTimeOrPeriodTag: LTag[UnionDateTimeOrPeriod]                     = LTag[UnionDateTimeOrPeriod]
  val UnionDateTimeOrStringTag: LTag[UnionDateTimeOrString]                     = LTag[UnionDateTimeOrString]
  val UnionDecimalOrRangeTag: LTag[UnionDecimalOrRange]                         = LTag[UnionDecimalOrRange]
  val UnionDurationOrDateTag: LTag[UnionDurationOrDate]                         = LTag[UnionDurationOrDate]
  val UnionDurationOrRangeTag: LTag[UnionDurationOrRange]                       = LTag[UnionDurationOrRange]
  val UnionIdentifierOrReferenceTag: LTag[UnionIdentifierOrReference]           = LTag[UnionIdentifierOrReference]
  val UnionMoneyOrQuantityTag: LTag[UnionMoneyOrQuantity]                       = LTag[UnionMoneyOrQuantity]
  val UnionMoneyOrStringOrUnsignedIntTag: LTag[UnionMoneyOrStringOrUnsignedInt] = LTag[UnionMoneyOrStringOrUnsignedInt]
  val UnionMoneyOrUnsignedIntTag: LTag[UnionMoneyOrUnsignedInt]                 = LTag[UnionMoneyOrUnsignedInt]
  val UnionPeriodOrRangeTag: LTag[UnionPeriodOrRange]                           = LTag[UnionPeriodOrRange]
  val UnionPeriodOrStringOrTimingTag: LTag[UnionPeriodOrStringOrTiming]         = LTag[UnionPeriodOrStringOrTiming]
  val UnionPositiveIntOrStringTag: LTag[UnionPositiveIntOrString]               = LTag[UnionPositiveIntOrString]
  val UnionQuantityOrRangeOrStringTag: LTag[UnionQuantityOrRangeOrString]       = LTag[UnionQuantityOrRangeOrString]
  val UnionQuantityOrRatioTag: LTag[UnionQuantityOrRatio]                       = LTag[UnionQuantityOrRatio]
  val UnionQuantityOrStringTag: LTag[UnionQuantityOrString]                     = LTag[UnionQuantityOrString]
  val UnionReferenceOrUrlTag: LTag[UnionReferenceOrUrl]                         = LTag[UnionReferenceOrUrl]
  val Union_0044338899Tag: LTag[Union_0044338899]                               = LTag[Union_0044338899]
  val Union_0059314669Tag: LTag[Union_0059314669]                               = LTag[Union_0059314669]
  val Union_0600299688Tag: LTag[Union_0600299688]                               = LTag[Union_0600299688]
  val Union_1061953715Tag: LTag[Union_1061953715]                               = LTag[Union_1061953715]
  val Union_1204024681Tag: LTag[Union_1204024681]                               = LTag[Union_1204024681]
  val Union_1280102327Tag: LTag[Union_1280102327]                               = LTag[Union_1280102327]
  val Union_1690912481Tag: LTag[Union_1690912481]                               = LTag[Union_1690912481]
  val Union_2028408917Tag: LTag[Union_2028408917]                               = LTag[Union_2028408917]
}

object Module
    extends ModuleDict(
      Map(
        "http://hl7.org/fhir/StructureDefinition/Account"                           -> Account,
        "http://hl7.org/fhir/StructureDefinition/ActivityDefinition"                -> ActivityDefinition,
        "http://hl7.org/fhir/StructureDefinition/AdverseEvent"                      -> AdverseEvent,
        "http://hl7.org/fhir/StructureDefinition/AllergyIntolerance"                -> AllergyIntolerance,
        "http://hl7.org/fhir/StructureDefinition/Appointment"                       -> Appointment,
        "http://hl7.org/fhir/StructureDefinition/AppointmentResponse"               -> AppointmentResponse,
        "http://hl7.org/fhir/StructureDefinition/AuditEvent"                        -> AuditEvent,
        "http://hl7.org/fhir/StructureDefinition/Basic"                             -> Basic,
        "http://hl7.org/fhir/StructureDefinition/Binary"                            -> Binary,
        "http://hl7.org/fhir/StructureDefinition/BiologicallyDerivedProduct"        -> BiologicallyDerivedProduct,
        "http://hl7.org/fhir/StructureDefinition/BodyStructure"                     -> BodyStructure,
        "http://hl7.org/fhir/StructureDefinition/Bundle"                            -> Bundle,
        "http://hl7.org/fhir/StructureDefinition/CapabilityStatement"               -> CapabilityStatement,
        "http://hl7.org/fhir/StructureDefinition/CarePlan"                          -> CarePlan,
        "http://hl7.org/fhir/StructureDefinition/CareTeam"                          -> CareTeam,
        "http://hl7.org/fhir/StructureDefinition/CatalogEntry"                      -> CatalogEntry,
        "http://hl7.org/fhir/StructureDefinition/ChargeItem"                        -> ChargeItem,
        "http://hl7.org/fhir/StructureDefinition/ChargeItemDefinition"              -> ChargeItemDefinition,
        "http://hl7.org/fhir/StructureDefinition/Claim"                             -> Claim,
        "http://hl7.org/fhir/StructureDefinition/ClaimResponse"                     -> ClaimResponse,
        "http://hl7.org/fhir/StructureDefinition/ClinicalImpression"                -> ClinicalImpression,
        "http://hl7.org/fhir/StructureDefinition/CodeSystem"                        -> CodeSystem,
        "http://hl7.org/fhir/StructureDefinition/Communication"                     -> Communication,
        "http://hl7.org/fhir/StructureDefinition/CommunicationRequest"              -> CommunicationRequest,
        "http://hl7.org/fhir/StructureDefinition/CompartmentDefinition"             -> CompartmentDefinition,
        "http://hl7.org/fhir/StructureDefinition/Composition"                       -> Composition,
        "http://hl7.org/fhir/StructureDefinition/ConceptMap"                        -> ConceptMap,
        "http://hl7.org/fhir/StructureDefinition/Condition"                         -> Condition,
        "http://hl7.org/fhir/StructureDefinition/Consent"                           -> Consent,
        "http://hl7.org/fhir/StructureDefinition/Contract"                          -> Contract,
        "http://hl7.org/fhir/StructureDefinition/Coverage"                          -> Coverage,
        "http://hl7.org/fhir/StructureDefinition/CoverageEligibilityRequest"        -> CoverageEligibilityRequest,
        "http://hl7.org/fhir/StructureDefinition/CoverageEligibilityResponse"       -> CoverageEligibilityResponse,
        "http://hl7.org/fhir/StructureDefinition/DetectedIssue"                     -> DetectedIssue,
        "http://hl7.org/fhir/StructureDefinition/Device"                            -> Device,
        "http://hl7.org/fhir/StructureDefinition/DeviceDefinition"                  -> DeviceDefinition,
        "http://hl7.org/fhir/StructureDefinition/DeviceMetric"                      -> DeviceMetric,
        "http://hl7.org/fhir/StructureDefinition/DeviceRequest"                     -> DeviceRequest,
        "http://hl7.org/fhir/StructureDefinition/DeviceUseStatement"                -> DeviceUseStatement,
        "http://hl7.org/fhir/StructureDefinition/DiagnosticReport"                  -> DiagnosticReport,
        "http://hl7.org/fhir/StructureDefinition/DocumentManifest"                  -> DocumentManifest,
        "http://hl7.org/fhir/StructureDefinition/DocumentReference"                 -> DocumentReference,
        "http://hl7.org/fhir/StructureDefinition/DomainResource"                    -> DomainResource,
        "http://hl7.org/fhir/StructureDefinition/EffectEvidenceSynthesis"           -> EffectEvidenceSynthesis,
        "http://hl7.org/fhir/StructureDefinition/ElementDefinition"                 -> ElementDefinition,
        "http://hl7.org/fhir/StructureDefinition/Encounter"                         -> Encounter,
        "http://hl7.org/fhir/StructureDefinition/Endpoint"                          -> Endpoint,
        "http://hl7.org/fhir/StructureDefinition/EnrollmentRequest"                 -> EnrollmentRequest,
        "http://hl7.org/fhir/StructureDefinition/EnrollmentResponse"                -> EnrollmentResponse,
        "http://hl7.org/fhir/StructureDefinition/EpisodeOfCare"                     -> EpisodeOfCare,
        "http://hl7.org/fhir/StructureDefinition/EventDefinition"                   -> EventDefinition,
        "http://hl7.org/fhir/StructureDefinition/Evidence"                          -> Evidence,
        "http://hl7.org/fhir/StructureDefinition/EvidenceVariable"                  -> EvidenceVariable,
        "http://hl7.org/fhir/StructureDefinition/ExampleScenario"                   -> ExampleScenario,
        "http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit"              -> ExplanationOfBenefit,
        "http://hl7.org/fhir/StructureDefinition/FamilyMemberHistory"               -> FamilyMemberHistory,
        "http://hl7.org/fhir/StructureDefinition/Flag"                              -> Flag,
        "http://hl7.org/fhir/StructureDefinition/Goal"                              -> Goal,
        "http://hl7.org/fhir/StructureDefinition/GraphDefinition"                   -> GraphDefinition,
        "http://hl7.org/fhir/StructureDefinition/Group"                             -> Group,
        "http://hl7.org/fhir/StructureDefinition/GuidanceResponse"                  -> GuidanceResponse,
        "http://hl7.org/fhir/StructureDefinition/HealthcareService"                 -> HealthcareService,
        "http://hl7.org/fhir/StructureDefinition/ImagingStudy"                      -> ImagingStudy,
        "http://hl7.org/fhir/StructureDefinition/Immunization"                      -> Immunization,
        "http://hl7.org/fhir/StructureDefinition/ImmunizationEvaluation"            -> ImmunizationEvaluation,
        "http://hl7.org/fhir/StructureDefinition/ImmunizationRecommendation"        -> ImmunizationRecommendation,
        "http://hl7.org/fhir/StructureDefinition/ImplementationGuide"               -> ImplementationGuide,
        "http://hl7.org/fhir/StructureDefinition/InsurancePlan"                     -> InsurancePlan,
        "http://hl7.org/fhir/StructureDefinition/Invoice"                           -> Invoice,
        "http://hl7.org/fhir/StructureDefinition/Library"                           -> Library,
        "http://hl7.org/fhir/StructureDefinition/Linkage"                           -> Linkage,
        "http://hl7.org/fhir/StructureDefinition/List"                              -> FHIRList,
        "http://hl7.org/fhir/StructureDefinition/Location"                          -> Location,
        "http://hl7.org/fhir/StructureDefinition/Measure"                           -> Measure,
        "http://hl7.org/fhir/StructureDefinition/MeasureReport"                     -> MeasureReport,
        "http://hl7.org/fhir/StructureDefinition/Media"                             -> Media,
        "http://hl7.org/fhir/StructureDefinition/Medication"                        -> Medication,
        "http://hl7.org/fhir/StructureDefinition/MedicationAdministration"          -> MedicationAdministration,
        "http://hl7.org/fhir/StructureDefinition/MedicationDispense"                -> MedicationDispense,
        "http://hl7.org/fhir/StructureDefinition/MedicationKnowledge"               -> MedicationKnowledge,
        "http://hl7.org/fhir/StructureDefinition/MedicationRequest"                 -> MedicationRequest,
        "http://hl7.org/fhir/StructureDefinition/MedicationStatement"               -> MedicationStatement,
        "http://hl7.org/fhir/StructureDefinition/MedicinalProduct"                  -> MedicinalProduct,
        "http://hl7.org/fhir/StructureDefinition/MedicinalProductAuthorization"     -> MedicinalProductAuthorization,
        "http://hl7.org/fhir/StructureDefinition/MedicinalProductContraindication"  -> MedicinalProductContraindication,
        "http://hl7.org/fhir/StructureDefinition/MedicinalProductIndication"        -> MedicinalProductIndication,
        "http://hl7.org/fhir/StructureDefinition/MedicinalProductIngredient"        -> MedicinalProductIngredient,
        "http://hl7.org/fhir/StructureDefinition/MedicinalProductInteraction"       -> MedicinalProductInteraction,
        "http://hl7.org/fhir/StructureDefinition/MedicinalProductManufactured"      -> MedicinalProductManufactured,
        "http://hl7.org/fhir/StructureDefinition/MedicinalProductPackaged"          -> MedicinalProductPackaged,
        "http://hl7.org/fhir/StructureDefinition/MedicinalProductPharmaceutical"    -> MedicinalProductPharmaceutical,
        "http://hl7.org/fhir/StructureDefinition/MedicinalProductUndesirableEffect" -> MedicinalProductUndesirableEffect,
        "http://hl7.org/fhir/StructureDefinition/MessageDefinition"                 -> MessageDefinition,
        "http://hl7.org/fhir/StructureDefinition/MessageHeader"                     -> MessageHeader,
        "http://hl7.org/fhir/StructureDefinition/MolecularSequence"                 -> MolecularSequence,
        "http://hl7.org/fhir/StructureDefinition/MoneyQuantity"                     -> MoneyQuantity,
        "http://hl7.org/fhir/StructureDefinition/NamingSystem"                      -> NamingSystem,
        "http://hl7.org/fhir/StructureDefinition/Narrative"                         -> Narrative,
        "http://hl7.org/fhir/StructureDefinition/NutritionOrder"                    -> NutritionOrder,
        "http://hl7.org/fhir/StructureDefinition/Observation"                       -> Observation,
        "http://hl7.org/fhir/StructureDefinition/ObservationDefinition"             -> ObservationDefinition,
        "http://hl7.org/fhir/StructureDefinition/OperationDefinition"               -> OperationDefinition,
        "http://hl7.org/fhir/StructureDefinition/OperationOutcome"                  -> OperationOutcome,
        "http://hl7.org/fhir/StructureDefinition/Organization"                      -> Organization,
        "http://hl7.org/fhir/StructureDefinition/OrganizationAffiliation"           -> OrganizationAffiliation,
        "http://hl7.org/fhir/StructureDefinition/Parameters"                        -> Parameters,
        "http://hl7.org/fhir/StructureDefinition/Patient"                           -> Patient,
        "http://hl7.org/fhir/StructureDefinition/PaymentNotice"                     -> PaymentNotice,
        "http://hl7.org/fhir/StructureDefinition/PaymentReconciliation"             -> PaymentReconciliation,
        "http://hl7.org/fhir/StructureDefinition/Person"                            -> Person,
        "http://hl7.org/fhir/StructureDefinition/PlanDefinition"                    -> PlanDefinition,
        "http://hl7.org/fhir/StructureDefinition/Practitioner"                      -> Practitioner,
        "http://hl7.org/fhir/StructureDefinition/PractitionerRole"                  -> PractitionerRole,
        "http://hl7.org/fhir/StructureDefinition/Procedure"                         -> Procedure,
        "http://hl7.org/fhir/StructureDefinition/Provenance"                        -> Provenance,
        "http://hl7.org/fhir/StructureDefinition/Questionnaire"                     -> Questionnaire,
        "http://hl7.org/fhir/StructureDefinition/QuestionnaireResponse"             -> QuestionnaireResponse,
        "http://hl7.org/fhir/StructureDefinition/RelatedPerson"                     -> RelatedPerson,
        "http://hl7.org/fhir/StructureDefinition/RequestGroup"                      -> RequestGroup,
        "http://hl7.org/fhir/StructureDefinition/ResearchDefinition"                -> ResearchDefinition,
        "http://hl7.org/fhir/StructureDefinition/ResearchElementDefinition"         -> ResearchElementDefinition,
        "http://hl7.org/fhir/StructureDefinition/ResearchStudy"                     -> ResearchStudy,
        "http://hl7.org/fhir/StructureDefinition/ResearchSubject"                   -> ResearchSubject,
        "http://hl7.org/fhir/StructureDefinition/RiskAssessment"                    -> RiskAssessment,
        "http://hl7.org/fhir/StructureDefinition/RiskEvidenceSynthesis"             -> RiskEvidenceSynthesis,
        "http://hl7.org/fhir/StructureDefinition/Schedule"                          -> Schedule,
        "http://hl7.org/fhir/StructureDefinition/SearchParameter"                   -> SearchParameter,
        "http://hl7.org/fhir/StructureDefinition/ServiceRequest"                    -> ServiceRequest,
        "http://hl7.org/fhir/StructureDefinition/SimpleQuantity"                    -> SimpleQuantity,
        "http://hl7.org/fhir/StructureDefinition/Slot"                              -> Slot,
        "http://hl7.org/fhir/StructureDefinition/Specimen"                          -> Specimen,
        "http://hl7.org/fhir/StructureDefinition/SpecimenDefinition"                -> SpecimenDefinition,
        "http://hl7.org/fhir/StructureDefinition/StructureDefinition"               -> StructureDefinition,
        "http://hl7.org/fhir/StructureDefinition/StructureMap"                      -> StructureMap,
        "http://hl7.org/fhir/StructureDefinition/Subscription"                      -> Subscription,
        "http://hl7.org/fhir/StructureDefinition/Substance"                         -> Substance,
        "http://hl7.org/fhir/StructureDefinition/SubstancePolymer"                  -> SubstancePolymer,
        "http://hl7.org/fhir/StructureDefinition/SubstanceReferenceInformation"     -> SubstanceReferenceInformation,
        "http://hl7.org/fhir/StructureDefinition/SubstanceSpecification"            -> SubstanceSpecification,
        "http://hl7.org/fhir/StructureDefinition/SupplyDelivery"                    -> SupplyDelivery,
        "http://hl7.org/fhir/StructureDefinition/SupplyRequest"                     -> SupplyRequest,
        "http://hl7.org/fhir/StructureDefinition/Task"                              -> Task,
        "http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities"           -> TerminologyCapabilities,
        "http://hl7.org/fhir/StructureDefinition/TestReport"                        -> TestReport,
        "http://hl7.org/fhir/StructureDefinition/TestScript"                        -> TestScript,
        "http://hl7.org/fhir/StructureDefinition/ValueSet"                          -> ValueSet,
        "http://hl7.org/fhir/StructureDefinition/VerificationResult"                -> VerificationResult,
        "http://hl7.org/fhir/StructureDefinition/VisionPrescription"                -> VisionPrescription,
        "http://hl7.org/fhir/StructureDefinition/shareablecodesystem"               -> Shareablecodesystem,
        "http://hl7.org/fhir/StructureDefinition/shareablevalueset"                 -> Shareablevalueset
      ))
