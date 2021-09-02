package com.babylonhealth.lit.hl7

import java.time.{ LocalDate, LocalTime, ZonedDateTime }
import java.util.UUID

import izumi.reflect.macrortti.LTag

import com.babylonhealth.lit.core._
import com.babylonhealth.lit.core.model._
import com.babylonhealth.lit.hl7.model._

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
  type Union_0358050020 = Canonical \/ CodeableConcept \/ DataRequirement \/ Expression \/ Reference \/ TriggerDefinition
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

  val Union00078348305Tag: LTag[Union00078348305] = LTag[Union00078348305]
  val Union00434638053Tag: LTag[Union00434638053] = LTag[Union00434638053]
  val Union00483057553Tag: LTag[Union00483057553] = LTag[Union00483057553]
  val Union00545979821Tag: LTag[Union00545979821] = LTag[Union00545979821]
  val Union00600764285Tag: LTag[Union00600764285] = LTag[Union00600764285]
  val Union00607514014Tag: LTag[Union00607514014] = LTag[Union00607514014]
  val Union00609373412Tag: LTag[Union00609373412] = LTag[Union00609373412]
  val Union00683246261Tag: LTag[Union00683246261] = LTag[Union00683246261]
  val Union00801828838Tag: LTag[Union00801828838] = LTag[Union00801828838]
  val Union00910671146Tag: LTag[Union00910671146] = LTag[Union00910671146]
  val Union01056080496Tag: LTag[Union01056080496] = LTag[Union01056080496]
  val Union01200936722Tag: LTag[Union01200936722] = LTag[Union01200936722]
  val Union01219602913Tag: LTag[Union01219602913] = LTag[Union01219602913]
  val Union01243416269Tag: LTag[Union01243416269] = LTag[Union01243416269]
  val Union01352864625Tag: LTag[Union01352864625] = LTag[Union01352864625]
  val Union01473702374Tag: LTag[Union01473702374] = LTag[Union01473702374]
  val Union01486281057Tag: LTag[Union01486281057] = LTag[Union01486281057]
  val Union01560785079Tag: LTag[Union01560785079] = LTag[Union01560785079]
  val Union01583485927Tag: LTag[Union01583485927] = LTag[Union01583485927]
  val Union01646729908Tag: LTag[Union01646729908] = LTag[Union01646729908]
  val Union01726112534Tag: LTag[Union01726112534] = LTag[Union01726112534]
  val Union01727798874Tag: LTag[Union01727798874] = LTag[Union01727798874]
  val Union01831019594Tag: LTag[Union01831019594] = LTag[Union01831019594]
  val Union02065782851Tag: LTag[Union02065782851] = LTag[Union02065782851]
  val Union_0040864668Tag: LTag[Union_0040864668] = LTag[Union_0040864668]
  val Union_0181779868Tag: LTag[Union_0181779868] = LTag[Union_0181779868]
  val Union_0221283134Tag: LTag[Union_0221283134] = LTag[Union_0221283134]
  val Union_0316522316Tag: LTag[Union_0316522316] = LTag[Union_0316522316]
  val Union_0340660840Tag: LTag[Union_0340660840] = LTag[Union_0340660840]
  val Union_0358050020Tag: LTag[Union_0358050020] = LTag[Union_0358050020]
  val Union_0388264667Tag: LTag[Union_0388264667] = LTag[Union_0388264667]
  val Union_0503196159Tag: LTag[Union_0503196159] = LTag[Union_0503196159]
  val Union_0543144563Tag: LTag[Union_0543144563] = LTag[Union_0543144563]
  val Union_0637176084Tag: LTag[Union_0637176084] = LTag[Union_0637176084]
  val Union_0687680458Tag: LTag[Union_0687680458] = LTag[Union_0687680458]
  val Union_0802685816Tag: LTag[Union_0802685816] = LTag[Union_0802685816]
  val Union_0831630297Tag: LTag[Union_0831630297] = LTag[Union_0831630297]
  val Union_0839638734Tag: LTag[Union_0839638734] = LTag[Union_0839638734]
  val Union_0934386166Tag: LTag[Union_0934386166] = LTag[Union_0934386166]
  val Union_0964108894Tag: LTag[Union_0964108894] = LTag[Union_0964108894]
  val Union_0966801288Tag: LTag[Union_0966801288] = LTag[Union_0966801288]
  val Union_0970951552Tag: LTag[Union_0970951552] = LTag[Union_0970951552]
  val Union_0983418289Tag: LTag[Union_0983418289] = LTag[Union_0983418289]
  val Union_1132894602Tag: LTag[Union_1132894602] = LTag[Union_1132894602]
  val Union_1289000811Tag: LTag[Union_1289000811] = LTag[Union_1289000811]
  val Union_1309404550Tag: LTag[Union_1309404550] = LTag[Union_1309404550]
  val Union_1427970408Tag: LTag[Union_1427970408] = LTag[Union_1427970408]
  val Union_1489367071Tag: LTag[Union_1489367071] = LTag[Union_1489367071]
  val Union_1507098327Tag: LTag[Union_1507098327] = LTag[Union_1507098327]
  val Union_1516277229Tag: LTag[Union_1516277229] = LTag[Union_1516277229]
  val Union_1524702593Tag: LTag[Union_1524702593] = LTag[Union_1524702593]
  val Union_1527751898Tag: LTag[Union_1527751898] = LTag[Union_1527751898]
  val Union_1715923163Tag: LTag[Union_1715923163] = LTag[Union_1715923163]
  val Union_1750128470Tag: LTag[Union_1750128470] = LTag[Union_1750128470]
  val Union_1750183386Tag: LTag[Union_1750183386] = LTag[Union_1750183386]
  val Union_2072987899Tag: LTag[Union_2072987899] = LTag[Union_2072987899]
  val Union_2101127777Tag: LTag[Union_2101127777] = LTag[Union_2101127777]
  val Union_2131715935Tag: LTag[Union_2131715935] = LTag[Union_2131715935]
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
