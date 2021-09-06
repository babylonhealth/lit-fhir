package com.babylonhealth.lit.hl7

import java.time.{ LocalDate, LocalTime, ZonedDateTime }
import java.util.UUID

import izumi.reflect.macrortti.LTag

import com.babylonhealth.lit.core._
import com.babylonhealth.lit.core.model._
import com.babylonhealth.lit.hl7.model._

object UnionAliases {
  type Union00228735254 = Age | Period | Range | String
  type Union00304335386 = BigDecimal | Boolean | Coding | FHIRDate | FHIRDateTime | Int | LocalTime | Quantity | Reference |
    String
  type Union00515330545 = Age | Boolean | FHIRDate | Range | String
  type Union00566743606 = BigDecimal | Boolean | Code | Coding | FHIRDateTime | Int | String
  type Union00836574492 = Canonical | CodeableConcept | DataRequirement | Expression
  type Union01138203188 = Quantity | Range | Ratio | String
  type Union01239641171 = Boolean | CodeableConcept | FHIRDateTime | Int | LocalTime | Period | Quantity | Range | Ratio |
    SampledData | String
  type Union01434501542 = Canonical | CodeableConcept | DataRequirement | Expression | Reference | TriggerDefinition
  type Union01491947217 = BigDecimal | Boolean | Id | Int | String
  type Union01554328235 = Coding | FHIRDate | Int | LocalTime | Reference | String
  type Union01946981731 = Age | FHIRDateTime | Period | Range | String
  type Union02135982830 = Attachment | BigDecimal | Boolean | Coding | FHIRDate | FHIRDateTime | Int | LocalTime | Quantity |
    Reference | String | UriStr
  type UnionAddressOrCodeableConceptOrReference = Address | CodeableConcept | Reference
  type UnionAddressOrReference                  = Address | Reference
  type UnionAgeOrRangeOrString                  = Age | Range | String
  type UnionAttachmentOrReference               = Attachment | Reference
  type UnionAttachmentOrReferenceOrString       = Attachment | Reference | String
  type UnionBase64BinaryOrString                = Base64Binary | String
  type UnionBooleanOrCanonical                  = Boolean | Canonical
  type UnionBooleanOrDateTime                   = Boolean | FHIRDateTime
  type UnionBooleanOrInteger                    = Boolean | Int
  type UnionBooleanOrReference                  = Boolean | Reference
  type UnionCanonicalOrCodeableConceptOrUri     = Canonical | CodeableConcept | UriStr
  type UnionCanonicalOrUri                      = Canonical | UriStr
  type UnionCodeableConceptOrDate               = CodeableConcept | FHIRDate
  type UnionCodeableConceptOrDuration           = CodeableConcept | Duration
  type UnionCodeableConceptOrQuantity           = CodeableConcept | Quantity
  type UnionCodeableConceptOrQuantityOrRange    = CodeableConcept | Quantity | Range
  type UnionCodingOrUri                         = Coding | UriStr
  type UnionDateOrPeriod                        = FHIRDate | Period
  type UnionDateOrPeriodOrString                = FHIRDate | Period | String
  type UnionDateTimeOrPeriod                    = FHIRDateTime | Period
  type UnionDateTimeOrPeriodOrTiming            = FHIRDateTime | Period | Timing
  type UnionDateTimeOrString                    = FHIRDateTime | String
  type UnionDecimalOrRange                      = BigDecimal | Range
  type UnionDurationOrDate                      = Duration | FHIRDate
  type UnionDurationOrRange                     = Duration | Range
  type UnionIdentifierOrReference               = Identifier | Reference
  type UnionMoneyOrQuantity                     = Money | Quantity
  type UnionMoneyOrStringOrUnsignedInt          = Money | String | UnsignedInt
  type UnionMoneyOrUnsignedInt                  = Money | UnsignedInt
  type UnionPeriodOrRange                       = Period | Range
  type UnionPeriodOrStringOrTiming              = Period | String | Timing
  type UnionPositiveIntOrString                 = PositiveInt | String
  type UnionQuantityOrRangeOrString             = Quantity | Range | String
  type UnionQuantityOrRatio                     = Quantity | Ratio
  type UnionQuantityOrString                    = Quantity | String
  type UnionReferenceOrUrl                      = Reference | UrlStr
  type Union_0075792257                         = Age | Duration | FHIRDateTime | Period | Range | Timing
  type Union_0536852827                         = Boolean | CodeableConcept | Quantity | Range
  type Union_0603252906 = BigDecimal | FHIRDate | FHIRDateTime | Int | LocalTime | PositiveInt | Quantity | UnsignedInt |
    ZonedDateTime
  type Union_0861648458 = Attachment | Boolean | Quantity | Reference | String
  type Union_0865080338 = BigDecimal | Boolean | Code | FHIRDateTime | Int | String | UriStr
  type Union_1011524451 = Boolean | CodeableConcept | Int | Quantity | Range | Ratio | String
  type Union_1213298663 = Boolean | CodeableConcept | Quantity | Range | Reference
  type Union_1534826566 = Base64Binary | CodeableConcept | Quantity | String
  type Union_1926447453 = FHIRDateTime | Period | Timing | ZonedDateTime
  type Union_1938137622 = Duration | FHIRDateTime | Period | Timing

  val Union00228735254Tag: LTag[Union00228735254] = LTag[Union00228735254]
  val Union00304335386Tag: LTag[Union00304335386] = LTag[Union00304335386]
  val Union00515330545Tag: LTag[Union00515330545] = LTag[Union00515330545]
  val Union00566743606Tag: LTag[Union00566743606] = LTag[Union00566743606]
  val Union00836574492Tag: LTag[Union00836574492] = LTag[Union00836574492]
  val Union01138203188Tag: LTag[Union01138203188] = LTag[Union01138203188]
  val Union01239641171Tag: LTag[Union01239641171] = LTag[Union01239641171]
  val Union01434501542Tag: LTag[Union01434501542] = LTag[Union01434501542]
  val Union01491947217Tag: LTag[Union01491947217] = LTag[Union01491947217]
  val Union01554328235Tag: LTag[Union01554328235] = LTag[Union01554328235]
  val Union01946981731Tag: LTag[Union01946981731] = LTag[Union01946981731]
  val Union02135982830Tag: LTag[Union02135982830] = LTag[Union02135982830]
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
  val Union_0075792257Tag: LTag[Union_0075792257]                               = LTag[Union_0075792257]
  val Union_0536852827Tag: LTag[Union_0536852827]                               = LTag[Union_0536852827]
  val Union_0603252906Tag: LTag[Union_0603252906]                               = LTag[Union_0603252906]
  val Union_0861648458Tag: LTag[Union_0861648458]                               = LTag[Union_0861648458]
  val Union_0865080338Tag: LTag[Union_0865080338]                               = LTag[Union_0865080338]
  val Union_1011524451Tag: LTag[Union_1011524451]                               = LTag[Union_1011524451]
  val Union_1213298663Tag: LTag[Union_1213298663]                               = LTag[Union_1213298663]
  val Union_1534826566Tag: LTag[Union_1534826566]                               = LTag[Union_1534826566]
  val Union_1926447453Tag: LTag[Union_1926447453]                               = LTag[Union_1926447453]
  val Union_1938137622Tag: LTag[Union_1938137622]                               = LTag[Union_1938137622]
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
        "http://hl7.org/fhir/StructureDefinition/shareablevalueset"                 -> Shareablevalueset,
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
        "http://hl7.org/fhir/StructureDefinition/MedicinalProductPharmaceutical"    -> MedicinalProductPharmaceutical,
        "http://hl7.org/fhir/StructureDefinition/MedicinalProductUndesirableEffect" -> MedicinalProductUndesirableEffect,
        "http://hl7.org/fhir/StructureDefinition/PractitionerRole"                  -> PractitionerRole,
        "http://hl7.org/fhir/StructureDefinition/Evidence"                          -> Evidence,
        "http://hl7.org/fhir/StructureDefinition/MedicationRequest"                 -> MedicationRequest,
        "http://hl7.org/fhir/StructureDefinition/NutritionOrder"                    -> NutritionOrder,
        "http://hl7.org/fhir/StructureDefinition/ResearchElementDefinition"         -> ResearchElementDefinition,
        "http://hl7.org/fhir/StructureDefinition/Specimen"                          -> Specimen,
        "http://hl7.org/fhir/StructureDefinition/MedicationStatement"               -> MedicationStatement,
        "http://hl7.org/fhir/StructureDefinition/ResearchSubject"                   -> ResearchSubject,
        "http://hl7.org/fhir/StructureDefinition/CareTeam"                          -> CareTeam,
        "http://hl7.org/fhir/StructureDefinition/SupplyRequest"                     -> SupplyRequest,
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
        "http://hl7.org/fhir/StructureDefinition/DeviceRequest"                     -> DeviceRequest,
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
        "http://hl7.org/fhir/StructureDefinition/ValueSet"                          -> ValueSet,
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
