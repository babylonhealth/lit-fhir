package com.babylonhealth.lit.hl7

import java.time.{ LocalDate, LocalTime, ZonedDateTime }
import java.util.UUID

import izumi.reflect.macrortti.LTag

import com.babylonhealth.lit.core._
import com.babylonhealth.lit.core.model._
import com.babylonhealth.lit.hl7.model._

object UnionAliases {
  type UnionAction_Timing                       = Age \/ Duration \/ FHIRDateTime \/ Period \/ Range \/ Timing
  type UnionAddressOrCodeableConceptOrReference = Address \/ CodeableConcept \/ Reference
  type UnionAddressOrReference                  = Address \/ Reference
  type UnionAgeOrRangeOrString                  = Age \/ Range \/ String
  type UnionAllergyIntolerance_Onset            = Age \/ FHIRDateTime \/ Period \/ Range \/ String
  type UnionAnswerOption_Value                  = Coding \/ FHIRDate \/ Int \/ LocalTime \/ Reference \/ String
  type UnionAnswer_Value =
    Attachment \/ BigDecimal \/ Boolean \/ Coding \/ FHIRDate \/ FHIRDateTime \/ Int \/ LocalTime \/ Quantity \/ Reference \/ String \/ UriStr
  type UnionAttachmentOrReference              = Attachment \/ Reference
  type UnionAttachmentOrReferenceOrString      = Attachment \/ Reference \/ String
  type UnionBase64BinaryOrString               = Base64Binary \/ String
  type UnionBigDecimalOrRange                  = BigDecimal \/ Range
  type UnionBooleanOrCanonical                 = Boolean \/ Canonical
  type UnionBooleanOrFHIRDateTime              = Boolean \/ FHIRDateTime
  type UnionBooleanOrInt                       = Boolean \/ Int
  type UnionBooleanOrReference                 = Boolean \/ Reference
  type UnionCanonicalOrCodeableConceptOrUriStr = Canonical \/ CodeableConcept \/ UriStr
  type UnionCanonicalOrUriStr                  = Canonical \/ UriStr
  type UnionCharacteristic_Definition =
    Canonical \/ CodeableConcept \/ DataRequirement \/ Expression \/ Reference \/ TriggerDefinition
  type UnionCharacteristic_ParticipantEffective = Duration \/ FHIRDateTime \/ Period \/ Timing
  type UnionCharacteristic_Value                = Boolean \/ CodeableConcept \/ Quantity \/ Range \/ Reference
  type UnionCodeableConceptOrDuration           = CodeableConcept \/ Duration
  type UnionCodeableConceptOrFHIRDate           = CodeableConcept \/ FHIRDate
  type UnionCodeableConceptOrQuantity           = CodeableConcept \/ Quantity
  type UnionCodeableConceptOrQuantityOrRange    = CodeableConcept \/ Quantity \/ Range
  type UnionCodingOrUriStr                      = Coding \/ UriStr
  type UnionCondition_Onset                     = Age \/ Period \/ Range \/ String
  type UnionDrugCharacteristic_Value            = Base64Binary \/ CodeableConcept \/ Quantity \/ String
  type UnionDurationOrFHIRDate                  = Duration \/ FHIRDate
  type UnionDurationOrRange                     = Duration \/ Range
  type UnionElementDefinition_MinValue =
    BigDecimal \/ FHIRDate \/ FHIRDateTime \/ Int \/ LocalTime \/ PositiveInt \/ Quantity \/ UnsignedInt \/ ZonedDateTime
  type UnionEnableWhen_Answer =
    BigDecimal \/ Boolean \/ Coding \/ FHIRDate \/ FHIRDateTime \/ Int \/ LocalTime \/ Quantity \/ Reference \/ String
  type UnionFHIRDateOrPeriod             = FHIRDate \/ Period
  type UnionFHIRDateOrPeriodOrString     = FHIRDate \/ Period \/ String
  type UnionFHIRDateTimeOrPeriod         = FHIRDateTime \/ Period
  type UnionFHIRDateTimeOrPeriodOrTiming = FHIRDateTime \/ Period \/ Timing
  type UnionFHIRDateTimeOrString         = FHIRDateTime \/ String
  type UnionFamilyMemberHistory_Deceased = Age \/ Boolean \/ FHIRDate \/ Range \/ String
  type UnionIdentifierOrReference        = Identifier \/ Reference
  type UnionMoneyOrQuantity              = Money \/ Quantity
  type UnionMoneyOrStringOrUnsignedInt   = Money \/ String \/ UnsignedInt
  type UnionMoneyOrUnsignedInt           = Money \/ UnsignedInt
  type UnionObservation_Effective        = FHIRDateTime \/ Period \/ Timing \/ ZonedDateTime
  type UnionObservation_Value =
    Boolean \/ CodeableConcept \/ FHIRDateTime \/ Int \/ LocalTime \/ Period \/ Quantity \/ Range \/ Ratio \/ SampledData \/ String
  type UnionParameter_Value         = BigDecimal \/ Boolean \/ Id \/ Int \/ String
  type UnionPeriodOrRange           = Period \/ Range
  type UnionPeriodOrStringOrTiming  = Period \/ String \/ Timing
  type UnionPositiveIntOrString     = PositiveInt \/ String
  type UnionProperty_Value          = BigDecimal \/ Boolean \/ Code \/ Coding \/ FHIRDateTime \/ Int \/ String
  type UnionQuantityOrRangeOrString = Quantity \/ Range \/ String
  type UnionQuantityOrRatio         = Quantity \/ Ratio
  type UnionQuantityOrString        = Quantity \/ String
  type UnionReferenceOrUrlStr       = Reference \/ UrlStr
  type UnionRelationship_Amount     = Quantity \/ Range \/ Ratio \/ String
  type UnionSupportingInfo_Value    = Attachment \/ Boolean \/ Quantity \/ Reference \/ String
  type UnionTarget_Detail           = Boolean \/ CodeableConcept \/ Int \/ Quantity \/ Range \/ Ratio \/ String

  val UnionAction_TimingTag: LTag[UnionAction_Timing] = LTag[UnionAction_Timing]
  val UnionAddressOrCodeableConceptOrReferenceTag: LTag[UnionAddressOrCodeableConceptOrReference] =
    LTag[UnionAddressOrCodeableConceptOrReference]
  val UnionAddressOrReferenceTag: LTag[UnionAddressOrReference]                       = LTag[UnionAddressOrReference]
  val UnionAgeOrRangeOrStringTag: LTag[UnionAgeOrRangeOrString]                       = LTag[UnionAgeOrRangeOrString]
  val UnionAllergyIntolerance_OnsetTag: LTag[UnionAllergyIntolerance_Onset]           = LTag[UnionAllergyIntolerance_Onset]
  val UnionAnswerOption_ValueTag: LTag[UnionAnswerOption_Value]                       = LTag[UnionAnswerOption_Value]
  val UnionAnswer_ValueTag: LTag[UnionAnswer_Value]                                   = LTag[UnionAnswer_Value]
  val UnionAttachmentOrReferenceOrStringTag: LTag[UnionAttachmentOrReferenceOrString] = LTag[UnionAttachmentOrReferenceOrString]
  val UnionAttachmentOrReferenceTag: LTag[UnionAttachmentOrReference]                 = LTag[UnionAttachmentOrReference]
  val UnionBase64BinaryOrStringTag: LTag[UnionBase64BinaryOrString]                   = LTag[UnionBase64BinaryOrString]
  val UnionBigDecimalOrRangeTag: LTag[UnionBigDecimalOrRange]                         = LTag[UnionBigDecimalOrRange]
  val UnionBooleanOrCanonicalTag: LTag[UnionBooleanOrCanonical]                       = LTag[UnionBooleanOrCanonical]
  val UnionBooleanOrFHIRDateTimeTag: LTag[UnionBooleanOrFHIRDateTime]                 = LTag[UnionBooleanOrFHIRDateTime]
  val UnionBooleanOrIntTag: LTag[UnionBooleanOrInt]                                   = LTag[UnionBooleanOrInt]
  val UnionBooleanOrReferenceTag: LTag[UnionBooleanOrReference]                       = LTag[UnionBooleanOrReference]
  val UnionCanonicalOrCodeableConceptOrUriStrTag: LTag[UnionCanonicalOrCodeableConceptOrUriStr] =
    LTag[UnionCanonicalOrCodeableConceptOrUriStr]
  val UnionCanonicalOrUriStrTag: LTag[UnionCanonicalOrUriStr]                 = LTag[UnionCanonicalOrUriStr]
  val UnionCharacteristic_DefinitionTag: LTag[UnionCharacteristic_Definition] = LTag[UnionCharacteristic_Definition]
  val UnionCharacteristic_ParticipantEffectiveTag: LTag[UnionCharacteristic_ParticipantEffective] =
    LTag[UnionCharacteristic_ParticipantEffective]
  val UnionCharacteristic_ValueTag: LTag[UnionCharacteristic_Value]           = LTag[UnionCharacteristic_Value]
  val UnionCodeableConceptOrDurationTag: LTag[UnionCodeableConceptOrDuration] = LTag[UnionCodeableConceptOrDuration]
  val UnionCodeableConceptOrFHIRDateTag: LTag[UnionCodeableConceptOrFHIRDate] = LTag[UnionCodeableConceptOrFHIRDate]
  val UnionCodeableConceptOrQuantityOrRangeTag: LTag[UnionCodeableConceptOrQuantityOrRange] =
    LTag[UnionCodeableConceptOrQuantityOrRange]
  val UnionCodeableConceptOrQuantityTag: LTag[UnionCodeableConceptOrQuantity]       = LTag[UnionCodeableConceptOrQuantity]
  val UnionCodingOrUriStrTag: LTag[UnionCodingOrUriStr]                             = LTag[UnionCodingOrUriStr]
  val UnionCondition_OnsetTag: LTag[UnionCondition_Onset]                           = LTag[UnionCondition_Onset]
  val UnionDrugCharacteristic_ValueTag: LTag[UnionDrugCharacteristic_Value]         = LTag[UnionDrugCharacteristic_Value]
  val UnionDurationOrFHIRDateTag: LTag[UnionDurationOrFHIRDate]                     = LTag[UnionDurationOrFHIRDate]
  val UnionDurationOrRangeTag: LTag[UnionDurationOrRange]                           = LTag[UnionDurationOrRange]
  val UnionElementDefinition_MinValueTag: LTag[UnionElementDefinition_MinValue]     = LTag[UnionElementDefinition_MinValue]
  val UnionEnableWhen_AnswerTag: LTag[UnionEnableWhen_Answer]                       = LTag[UnionEnableWhen_Answer]
  val UnionFHIRDateOrPeriodOrStringTag: LTag[UnionFHIRDateOrPeriodOrString]         = LTag[UnionFHIRDateOrPeriodOrString]
  val UnionFHIRDateOrPeriodTag: LTag[UnionFHIRDateOrPeriod]                         = LTag[UnionFHIRDateOrPeriod]
  val UnionFHIRDateTimeOrPeriodOrTimingTag: LTag[UnionFHIRDateTimeOrPeriodOrTiming] = LTag[UnionFHIRDateTimeOrPeriodOrTiming]
  val UnionFHIRDateTimeOrPeriodTag: LTag[UnionFHIRDateTimeOrPeriod]                 = LTag[UnionFHIRDateTimeOrPeriod]
  val UnionFHIRDateTimeOrStringTag: LTag[UnionFHIRDateTimeOrString]                 = LTag[UnionFHIRDateTimeOrString]
  val UnionFamilyMemberHistory_DeceasedTag: LTag[UnionFamilyMemberHistory_Deceased] = LTag[UnionFamilyMemberHistory_Deceased]
  val UnionIdentifierOrReferenceTag: LTag[UnionIdentifierOrReference]               = LTag[UnionIdentifierOrReference]
  val UnionMoneyOrQuantityTag: LTag[UnionMoneyOrQuantity]                           = LTag[UnionMoneyOrQuantity]
  val UnionMoneyOrStringOrUnsignedIntTag: LTag[UnionMoneyOrStringOrUnsignedInt]     = LTag[UnionMoneyOrStringOrUnsignedInt]
  val UnionMoneyOrUnsignedIntTag: LTag[UnionMoneyOrUnsignedInt]                     = LTag[UnionMoneyOrUnsignedInt]
  val UnionObservation_EffectiveTag: LTag[UnionObservation_Effective]               = LTag[UnionObservation_Effective]
  val UnionObservation_ValueTag: LTag[UnionObservation_Value]                       = LTag[UnionObservation_Value]
  val UnionParameter_ValueTag: LTag[UnionParameter_Value]                           = LTag[UnionParameter_Value]
  val UnionPeriodOrRangeTag: LTag[UnionPeriodOrRange]                               = LTag[UnionPeriodOrRange]
  val UnionPeriodOrStringOrTimingTag: LTag[UnionPeriodOrStringOrTiming]             = LTag[UnionPeriodOrStringOrTiming]
  val UnionPositiveIntOrStringTag: LTag[UnionPositiveIntOrString]                   = LTag[UnionPositiveIntOrString]
  val UnionProperty_ValueTag: LTag[UnionProperty_Value]                             = LTag[UnionProperty_Value]
  val UnionQuantityOrRangeOrStringTag: LTag[UnionQuantityOrRangeOrString]           = LTag[UnionQuantityOrRangeOrString]
  val UnionQuantityOrRatioTag: LTag[UnionQuantityOrRatio]                           = LTag[UnionQuantityOrRatio]
  val UnionQuantityOrStringTag: LTag[UnionQuantityOrString]                         = LTag[UnionQuantityOrString]
  val UnionReferenceOrUrlStrTag: LTag[UnionReferenceOrUrlStr]                       = LTag[UnionReferenceOrUrlStr]
  val UnionRelationship_AmountTag: LTag[UnionRelationship_Amount]                   = LTag[UnionRelationship_Amount]
  val UnionSupportingInfo_ValueTag: LTag[UnionSupportingInfo_Value]                 = LTag[UnionSupportingInfo_Value]
  val UnionTarget_DetailTag: LTag[UnionTarget_Detail]                               = LTag[UnionTarget_Detail]
}

object Module
    extends ModuleDict(
      Map(
        "http://hl7.org/fhir/StructureDefinition/Person"                            -> Person,
        "http://hl7.org/fhir/StructureDefinition/Media"                             -> Media,
        "http://hl7.org/fhir/StructureDefinition/DocumentReference"                 -> DocumentReference,
        "http://hl7.org/fhir/StructureDefinition/CommunicationRequest"              -> CommunicationRequest,
        "http://hl7.org/fhir/StructureDefinition/DeviceDefinition"                  -> DeviceDefinition,
        "http://hl7.org/fhir/StructureDefinition/MessageHeader"                     -> MessageHeader,
        "http://hl7.org/fhir/StructureDefinition/OrganizationAffiliation"           -> OrganizationAffiliation,
        "http://hl7.org/fhir/StructureDefinition/CodeSystem"                        -> CodeSystem,
        "http://hl7.org/fhir/StructureDefinition/Coverage"                          -> Coverage,
        "http://hl7.org/fhir/StructureDefinition/ClinicalImpression"                -> ClinicalImpression,
        "http://hl7.org/fhir/StructureDefinition/Task"                              -> Task,
        "http://hl7.org/fhir/StructureDefinition/SupplyDelivery"                    -> SupplyDelivery,
        "http://hl7.org/fhir/StructureDefinition/Encounter"                         -> Encounter,
        "http://hl7.org/fhir/StructureDefinition/Slot"                              -> Slot,
        "http://hl7.org/fhir/StructureDefinition/Bundle"                            -> Bundle,
        "http://hl7.org/fhir/StructureDefinition/DocumentManifest"                  -> DocumentManifest,
        "http://hl7.org/fhir/StructureDefinition/EvidenceVariable"                  -> EvidenceVariable,
        "http://hl7.org/fhir/StructureDefinition/BodyStructure"                     -> BodyStructure,
        "http://hl7.org/fhir/StructureDefinition/Questionnaire"                     -> Questionnaire,
        "http://hl7.org/fhir/StructureDefinition/VisionPrescription"                -> VisionPrescription,
        "http://hl7.org/fhir/StructureDefinition/ServiceRequest"                    -> ServiceRequest,
        "http://hl7.org/fhir/StructureDefinition/ImagingStudy"                      -> ImagingStudy,
        "http://hl7.org/fhir/StructureDefinition/RelatedPerson"                     -> RelatedPerson,
        "http://hl7.org/fhir/StructureDefinition/Endpoint"                          -> Endpoint,
        "http://hl7.org/fhir/StructureDefinition/Goal"                              -> Goal,
        "http://hl7.org/fhir/StructureDefinition/Invoice"                           -> Invoice,
        "http://hl7.org/fhir/StructureDefinition/SimpleQuantity"                    -> SimpleQuantity,
        "http://hl7.org/fhir/StructureDefinition/Narrative"                         -> Narrative,
        "http://hl7.org/fhir/StructureDefinition/AllergyIntolerance"                -> AllergyIntolerance,
        "http://hl7.org/fhir/StructureDefinition/PaymentNotice"                     -> PaymentNotice,
        "http://hl7.org/fhir/StructureDefinition/Contract"                          -> Contract,
        "http://hl7.org/fhir/StructureDefinition/VerificationResult"                -> VerificationResult,
        "http://hl7.org/fhir/StructureDefinition/MedicinalProductAuthorization"     -> MedicinalProductAuthorization,
        "http://hl7.org/fhir/StructureDefinition/Practitioner"                      -> Practitioner,
        "http://hl7.org/fhir/StructureDefinition/GuidanceResponse"                  -> GuidanceResponse,
        "http://hl7.org/fhir/StructureDefinition/GraphDefinition"                   -> GraphDefinition,
        "http://hl7.org/fhir/StructureDefinition/MoneyQuantity"                     -> MoneyQuantity,
        "http://hl7.org/fhir/StructureDefinition/Parameters"                        -> Parameters,
        "http://hl7.org/fhir/StructureDefinition/ImmunizationRecommendation"        -> ImmunizationRecommendation,
        "http://hl7.org/fhir/StructureDefinition/DeviceUseStatement"                -> DeviceUseStatement,
        "http://hl7.org/fhir/StructureDefinition/AppointmentResponse"               -> AppointmentResponse,
        "http://hl7.org/fhir/StructureDefinition/Schedule"                          -> Schedule,
        "http://hl7.org/fhir/StructureDefinition/AdverseEvent"                      -> AdverseEvent,
        "http://hl7.org/fhir/StructureDefinition/ResearchDefinition"                -> ResearchDefinition,
        "http://hl7.org/fhir/StructureDefinition/Procedure"                         -> Procedure,
        "http://hl7.org/fhir/StructureDefinition/NamingSystem"                      -> NamingSystem,
        "http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities"           -> TerminologyCapabilities,
        "http://hl7.org/fhir/StructureDefinition/PaymentReconciliation"             -> PaymentReconciliation,
        "http://hl7.org/fhir/StructureDefinition/Appointment"                       -> Appointment,
        "http://hl7.org/fhir/StructureDefinition/MedicationKnowledge"               -> MedicationKnowledge,
        "http://hl7.org/fhir/StructureDefinition/Binary"                            -> Binary,
        "http://hl7.org/fhir/StructureDefinition/MedicinalProductIngredient"        -> MedicinalProductIngredient,
        "http://hl7.org/fhir/StructureDefinition/shareablecodesystem"               -> Shareablecodesystem,
        "http://hl7.org/fhir/StructureDefinition/DomainResource"                    -> DomainResource,
        "http://hl7.org/fhir/StructureDefinition/ObservationDefinition"             -> ObservationDefinition,
        "http://hl7.org/fhir/StructureDefinition/EffectEvidenceSynthesis"           -> EffectEvidenceSynthesis,
        "http://hl7.org/fhir/StructureDefinition/CompartmentDefinition"             -> CompartmentDefinition,
        "http://hl7.org/fhir/StructureDefinition/MedicinalProductContraindication"  -> MedicinalProductContraindication,
        "http://hl7.org/fhir/StructureDefinition/MedicinalProduct"                  -> MedicinalProduct,
        "http://hl7.org/fhir/StructureDefinition/CapabilityStatement"               -> CapabilityStatement,
        "http://hl7.org/fhir/StructureDefinition/EnrollmentResponse"                -> EnrollmentResponse,
        "http://hl7.org/fhir/StructureDefinition/Account"                           -> Account,
        "http://hl7.org/fhir/StructureDefinition/ChargeItem"                        -> ChargeItem,
        "http://hl7.org/fhir/StructureDefinition/Group"                             -> Group,
        "http://hl7.org/fhir/StructureDefinition/Communication"                     -> Communication,
        "http://hl7.org/fhir/StructureDefinition/Library"                           -> Library,
        "http://hl7.org/fhir/StructureDefinition/TestScript"                        -> TestScript,
        "http://hl7.org/fhir/StructureDefinition/ClaimResponse"                     -> ClaimResponse,
        "http://hl7.org/fhir/StructureDefinition/ImmunizationEvaluation"            -> ImmunizationEvaluation,
        "http://hl7.org/fhir/StructureDefinition/TestReport"                        -> TestReport,
        "http://hl7.org/fhir/StructureDefinition/SubstancePolymer"                  -> SubstancePolymer,
        "http://hl7.org/fhir/StructureDefinition/List"                              -> FHIRList,
        "http://hl7.org/fhir/StructureDefinition/Measure"                           -> Measure,
        "http://hl7.org/fhir/StructureDefinition/StructureMap"                      -> StructureMap,
        "http://hl7.org/fhir/StructureDefinition/RiskEvidenceSynthesis"             -> RiskEvidenceSynthesis,
        "http://hl7.org/fhir/StructureDefinition/NutritionOrder"                    -> NutritionOrder,
        "http://hl7.org/fhir/StructureDefinition/MedicinalProductPharmaceutical"    -> MedicinalProductPharmaceutical,
        "http://hl7.org/fhir/StructureDefinition/MedicinalProductUndesirableEffect" -> MedicinalProductUndesirableEffect,
        "http://hl7.org/fhir/StructureDefinition/PractitionerRole"                  -> PractitionerRole,
        "http://hl7.org/fhir/StructureDefinition/Evidence"                          -> Evidence,
        "http://hl7.org/fhir/StructureDefinition/MedicationRequest"                 -> MedicationRequest,
        "http://hl7.org/fhir/StructureDefinition/Specimen"                          -> Specimen,
        "http://hl7.org/fhir/StructureDefinition/MedicationStatement"               -> MedicationStatement,
        "http://hl7.org/fhir/StructureDefinition/ResearchSubject"                   -> ResearchSubject,
        "http://hl7.org/fhir/StructureDefinition/CareTeam"                          -> CareTeam,
        "http://hl7.org/fhir/StructureDefinition/RiskAssessment"                    -> RiskAssessment,
        "http://hl7.org/fhir/StructureDefinition/SearchParameter"                   -> SearchParameter,
        "http://hl7.org/fhir/StructureDefinition/CarePlan"                          -> CarePlan,
        "http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit"              -> ExplanationOfBenefit,
        "http://hl7.org/fhir/StructureDefinition/Composition"                       -> Composition,
        "http://hl7.org/fhir/StructureDefinition/ElementDefinition"                 -> ElementDefinition,
        "http://hl7.org/fhir/StructureDefinition/MolecularSequence"                 -> MolecularSequence,
        "http://hl7.org/fhir/StructureDefinition/SubstanceSpecification"            -> SubstanceSpecification,
        "http://hl7.org/fhir/StructureDefinition/EpisodeOfCare"                     -> EpisodeOfCare,
        "http://hl7.org/fhir/StructureDefinition/AuditEvent"                        -> AuditEvent,
        "http://hl7.org/fhir/StructureDefinition/ChargeItemDefinition"              -> ChargeItemDefinition,
        "http://hl7.org/fhir/StructureDefinition/Subscription"                      -> Subscription,
        "http://hl7.org/fhir/StructureDefinition/Consent"                           -> Consent,
        "http://hl7.org/fhir/StructureDefinition/Substance"                         -> Substance,
        "http://hl7.org/fhir/StructureDefinition/Location"                          -> Location,
        "http://hl7.org/fhir/StructureDefinition/MedicinalProductManufactured"      -> MedicinalProductManufactured,
        "http://hl7.org/fhir/StructureDefinition/SpecimenDefinition"                -> SpecimenDefinition,
        "http://hl7.org/fhir/StructureDefinition/Flag"                              -> Flag,
        "http://hl7.org/fhir/StructureDefinition/ImplementationGuide"               -> ImplementationGuide,
        "http://hl7.org/fhir/StructureDefinition/MessageDefinition"                 -> MessageDefinition,
        "http://hl7.org/fhir/StructureDefinition/Observation"                       -> Observation,
        "http://hl7.org/fhir/StructureDefinition/Device"                            -> Device,
        "http://hl7.org/fhir/StructureDefinition/Claim"                             -> Claim,
        "http://hl7.org/fhir/StructureDefinition/MedicinalProductPackaged"          -> MedicinalProductPackaged,
        "http://hl7.org/fhir/StructureDefinition/CoverageEligibilityResponse"       -> CoverageEligibilityResponse,
        "http://hl7.org/fhir/StructureDefinition/ActivityDefinition"                -> ActivityDefinition,
        "http://hl7.org/fhir/StructureDefinition/Immunization"                      -> Immunization,
        "http://hl7.org/fhir/StructureDefinition/MedicationDispense"                -> MedicationDispense,
        "http://hl7.org/fhir/StructureDefinition/CatalogEntry"                      -> CatalogEntry,
        "http://hl7.org/fhir/StructureDefinition/CoverageEligibilityRequest"        -> CoverageEligibilityRequest,
        "http://hl7.org/fhir/StructureDefinition/PlanDefinition"                    -> PlanDefinition,
        "http://hl7.org/fhir/StructureDefinition/QuestionnaireResponse"             -> QuestionnaireResponse,
        "http://hl7.org/fhir/StructureDefinition/Provenance"                        -> Provenance,
        "http://hl7.org/fhir/StructureDefinition/HealthcareService"                 -> HealthcareService,
        "http://hl7.org/fhir/StructureDefinition/StructureDefinition"               -> StructureDefinition,
        "http://hl7.org/fhir/StructureDefinition/MedicationAdministration"          -> MedicationAdministration,
        "http://hl7.org/fhir/StructureDefinition/Condition"                         -> Condition,
        "http://hl7.org/fhir/StructureDefinition/InsurancePlan"                     -> InsurancePlan,
        "http://hl7.org/fhir/StructureDefinition/EnrollmentRequest"                 -> EnrollmentRequest,
        "http://hl7.org/fhir/StructureDefinition/ExampleScenario"                   -> ExampleScenario,
        "http://hl7.org/fhir/StructureDefinition/OperationOutcome"                  -> OperationOutcome,
        "http://hl7.org/fhir/StructureDefinition/Linkage"                           -> Linkage,
        "http://hl7.org/fhir/StructureDefinition/DetectedIssue"                     -> DetectedIssue,
        "http://hl7.org/fhir/StructureDefinition/DiagnosticReport"                  -> DiagnosticReport,
        "http://hl7.org/fhir/StructureDefinition/ConceptMap"                        -> ConceptMap,
        "http://hl7.org/fhir/StructureDefinition/Medication"                        -> Medication,
        "http://hl7.org/fhir/StructureDefinition/MedicinalProductIndication"        -> MedicinalProductIndication,
        "http://hl7.org/fhir/StructureDefinition/OperationDefinition"               -> OperationDefinition,
        "http://hl7.org/fhir/StructureDefinition/DeviceMetric"                      -> DeviceMetric,
        "http://hl7.org/fhir/StructureDefinition/FamilyMemberHistory"               -> FamilyMemberHistory,
        "http://hl7.org/fhir/StructureDefinition/ResearchStudy"                     -> ResearchStudy,
        "http://hl7.org/fhir/StructureDefinition/RequestGroup"                      -> RequestGroup,
        "http://hl7.org/fhir/StructureDefinition/MeasureReport"                     -> MeasureReport,
        "http://hl7.org/fhir/StructureDefinition/Organization"                      -> Organization,
        "http://hl7.org/fhir/StructureDefinition/BiologicallyDerivedProduct"        -> BiologicallyDerivedProduct,
        "http://hl7.org/fhir/StructureDefinition/Patient"                           -> Patient,
        "http://hl7.org/fhir/StructureDefinition/MedicinalProductInteraction"       -> MedicinalProductInteraction,
        "http://hl7.org/fhir/StructureDefinition/Basic"                             -> Basic,
        "http://hl7.org/fhir/StructureDefinition/SubstanceReferenceInformation"     -> SubstanceReferenceInformation,
        "http://hl7.org/fhir/StructureDefinition/EventDefinition"                   -> EventDefinition
      ))
