package com.babylonhealth.lit.core

import scala.reflect.ClassTag
import scala.util.{ Success, Try }

import io.circe.{ Decoder, DecodingFailure, Encoder, HCursor, Json }

import com.babylonhealth.lit.core.{ EnumBase, EType, ToCodingAble, ETypeWithFallback }
import com.babylonhealth.lit.core.model.Coding
enum ADDRESS_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case BOTH extends ADDRESS_TYPE("both", Some("Postal & Physical"), Some("http://hl7.org/fhir/address-type"))
  case PHYSICAL extends ADDRESS_TYPE("physical", Some("Physical"), Some("http://hl7.org/fhir/address-type"))
  case POSTAL extends ADDRESS_TYPE("postal", Some("Postal"), Some("http://hl7.org/fhir/address-type"))
}
object ADDRESS_TYPE extends EType[ADDRESS_TYPE]("http://hl7.org/fhir/ValueSet/address-type")

enum ADDRESS_USE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case BILLING extends ADDRESS_USE("billing", Some("Billing"), Some("http://hl7.org/fhir/address-use"))
  case HOME extends ADDRESS_USE("home", Some("Home"), Some("http://hl7.org/fhir/address-use"))
  case OLD extends ADDRESS_USE("old", Some("Old / Incorrect"), Some("http://hl7.org/fhir/address-use"))
  case TEMP extends ADDRESS_USE("temp", Some("Temporary"), Some("http://hl7.org/fhir/address-use"))
  case WORK extends ADDRESS_USE("work", Some("Work"), Some("http://hl7.org/fhir/address-use"))
}
object ADDRESS_USE extends EType[ADDRESS_USE]("http://hl7.org/fhir/ValueSet/address-use")

enum ALL_TYPES(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ACCOUNT extends ALL_TYPES("Account", Some("Account"), Some("http://hl7.org/fhir/resource-types"))
  case ACTIVITYDEFINITION
      extends ALL_TYPES("ActivityDefinition", Some("ActivityDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case ADDRESS extends ALL_TYPES("Address", Some("Address"), Some("http://hl7.org/fhir/data-types"))
  case ADVERSEEVENT extends ALL_TYPES("AdverseEvent", Some("AdverseEvent"), Some("http://hl7.org/fhir/resource-types"))
  case AGE extends ALL_TYPES("Age", Some("Age"), Some("http://hl7.org/fhir/data-types"))
  case ALLERGYINTOLERANCE
      extends ALL_TYPES("AllergyIntolerance", Some("AllergyIntolerance"), Some("http://hl7.org/fhir/resource-types"))
  case ANNOTATION extends ALL_TYPES("Annotation", Some("Annotation"), Some("http://hl7.org/fhir/data-types"))
  case ANY extends ALL_TYPES("Any", Some("Any"), Some("http://hl7.org/fhir/abstract-types"))
  case APPOINTMENT extends ALL_TYPES("Appointment", Some("Appointment"), Some("http://hl7.org/fhir/resource-types"))
  case APPOINTMENTRESPONSE
      extends ALL_TYPES("AppointmentResponse", Some("AppointmentResponse"), Some("http://hl7.org/fhir/resource-types"))
  case ATTACHMENT extends ALL_TYPES("Attachment", Some("Attachment"), Some("http://hl7.org/fhir/data-types"))
  case AUDITEVENT extends ALL_TYPES("AuditEvent", Some("AuditEvent"), Some("http://hl7.org/fhir/resource-types"))
  case BACKBONEELEMENT extends ALL_TYPES("BackboneElement", Some("BackboneElement"), Some("http://hl7.org/fhir/data-types"))
  case BASE64BINARY extends ALL_TYPES("base64Binary", Some("base64Binary"), Some("http://hl7.org/fhir/data-types"))
  case BASIC extends ALL_TYPES("Basic", Some("Basic"), Some("http://hl7.org/fhir/resource-types"))
  case BINARY extends ALL_TYPES("Binary", Some("Binary"), Some("http://hl7.org/fhir/resource-types"))
  case BIOLOGICALLYDERIVEDPRODUCT
      extends ALL_TYPES(
        "BiologicallyDerivedProduct",
        Some("BiologicallyDerivedProduct"),
        Some("http://hl7.org/fhir/resource-types"))
  case BODYSTRUCTURE extends ALL_TYPES("BodyStructure", Some("BodyStructure"), Some("http://hl7.org/fhir/resource-types"))
  case BOOLEAN extends ALL_TYPES("boolean", Some("boolean"), Some("http://hl7.org/fhir/data-types"))
  case BUNDLE extends ALL_TYPES("Bundle", Some("Bundle"), Some("http://hl7.org/fhir/resource-types"))
  case CANONICAL extends ALL_TYPES("canonical", Some("canonical"), Some("http://hl7.org/fhir/data-types"))
  case CAPABILITYSTATEMENT
      extends ALL_TYPES("CapabilityStatement", Some("CapabilityStatement"), Some("http://hl7.org/fhir/resource-types"))
  case CAREPLAN extends ALL_TYPES("CarePlan", Some("CarePlan"), Some("http://hl7.org/fhir/resource-types"))
  case CARETEAM extends ALL_TYPES("CareTeam", Some("CareTeam"), Some("http://hl7.org/fhir/resource-types"))
  case CATALOGENTRY extends ALL_TYPES("CatalogEntry", Some("CatalogEntry"), Some("http://hl7.org/fhir/resource-types"))
  case CHARGEITEM extends ALL_TYPES("ChargeItem", Some("ChargeItem"), Some("http://hl7.org/fhir/resource-types"))
  case CHARGEITEMDEFINITION
      extends ALL_TYPES("ChargeItemDefinition", Some("ChargeItemDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case CLAIM extends ALL_TYPES("Claim", Some("Claim"), Some("http://hl7.org/fhir/resource-types"))
  case CLAIMRESPONSE extends ALL_TYPES("ClaimResponse", Some("ClaimResponse"), Some("http://hl7.org/fhir/resource-types"))
  case CLINICALIMPRESSION
      extends ALL_TYPES("ClinicalImpression", Some("ClinicalImpression"), Some("http://hl7.org/fhir/resource-types"))
  case CODE extends ALL_TYPES("code", Some("code"), Some("http://hl7.org/fhir/data-types"))
  case CODEABLECONCEPT extends ALL_TYPES("CodeableConcept", Some("CodeableConcept"), Some("http://hl7.org/fhir/data-types"))
  case CODESYSTEM extends ALL_TYPES("CodeSystem", Some("CodeSystem"), Some("http://hl7.org/fhir/resource-types"))
  case CODING extends ALL_TYPES("Coding", Some("Coding"), Some("http://hl7.org/fhir/data-types"))
  case COMMUNICATION extends ALL_TYPES("Communication", Some("Communication"), Some("http://hl7.org/fhir/resource-types"))
  case COMMUNICATIONREQUEST
      extends ALL_TYPES("CommunicationRequest", Some("CommunicationRequest"), Some("http://hl7.org/fhir/resource-types"))
  case COMPARTMENTDEFINITION
      extends ALL_TYPES("CompartmentDefinition", Some("CompartmentDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case COMPOSITION extends ALL_TYPES("Composition", Some("Composition"), Some("http://hl7.org/fhir/resource-types"))
  case CONCEPTMAP extends ALL_TYPES("ConceptMap", Some("ConceptMap"), Some("http://hl7.org/fhir/resource-types"))
  case CONDITION extends ALL_TYPES("Condition", Some("Condition"), Some("http://hl7.org/fhir/resource-types"))
  case CONSENT extends ALL_TYPES("Consent", Some("Consent"), Some("http://hl7.org/fhir/resource-types"))
  case CONTACTDETAIL extends ALL_TYPES("ContactDetail", Some("ContactDetail"), Some("http://hl7.org/fhir/data-types"))
  case CONTACTPOINT extends ALL_TYPES("ContactPoint", Some("ContactPoint"), Some("http://hl7.org/fhir/data-types"))
  case CONTRACT extends ALL_TYPES("Contract", Some("Contract"), Some("http://hl7.org/fhir/resource-types"))
  case CONTRIBUTOR extends ALL_TYPES("Contributor", Some("Contributor"), Some("http://hl7.org/fhir/data-types"))
  case COUNT extends ALL_TYPES("Count", Some("Count"), Some("http://hl7.org/fhir/data-types"))
  case COVERAGE extends ALL_TYPES("Coverage", Some("Coverage"), Some("http://hl7.org/fhir/resource-types"))
  case COVERAGEELIGIBILITYREQUEST
      extends ALL_TYPES(
        "CoverageEligibilityRequest",
        Some("CoverageEligibilityRequest"),
        Some("http://hl7.org/fhir/resource-types"))
  case COVERAGEELIGIBILITYRESPONSE
      extends ALL_TYPES(
        "CoverageEligibilityResponse",
        Some("CoverageEligibilityResponse"),
        Some("http://hl7.org/fhir/resource-types"))
  case DATAREQUIREMENT extends ALL_TYPES("DataRequirement", Some("DataRequirement"), Some("http://hl7.org/fhir/data-types"))
  case DATE extends ALL_TYPES("date", Some("date"), Some("http://hl7.org/fhir/data-types"))
  case DATETIME extends ALL_TYPES("dateTime", Some("dateTime"), Some("http://hl7.org/fhir/data-types"))
  case DECIMAL extends ALL_TYPES("decimal", Some("decimal"), Some("http://hl7.org/fhir/data-types"))
  case DETECTEDISSUE extends ALL_TYPES("DetectedIssue", Some("DetectedIssue"), Some("http://hl7.org/fhir/resource-types"))
  case DEVICE extends ALL_TYPES("Device", Some("Device"), Some("http://hl7.org/fhir/resource-types"))
  case DEVICEDEFINITION
      extends ALL_TYPES("DeviceDefinition", Some("DeviceDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case DEVICEMETRIC extends ALL_TYPES("DeviceMetric", Some("DeviceMetric"), Some("http://hl7.org/fhir/resource-types"))
  case DEVICEREQUEST extends ALL_TYPES("DeviceRequest", Some("DeviceRequest"), Some("http://hl7.org/fhir/resource-types"))
  case DEVICEUSESTATEMENT
      extends ALL_TYPES("DeviceUseStatement", Some("DeviceUseStatement"), Some("http://hl7.org/fhir/resource-types"))
  case DIAGNOSTICREPORT
      extends ALL_TYPES("DiagnosticReport", Some("DiagnosticReport"), Some("http://hl7.org/fhir/resource-types"))
  case DISTANCE extends ALL_TYPES("Distance", Some("Distance"), Some("http://hl7.org/fhir/data-types"))
  case DOCUMENTMANIFEST
      extends ALL_TYPES("DocumentManifest", Some("DocumentManifest"), Some("http://hl7.org/fhir/resource-types"))
  case DOCUMENTREFERENCE
      extends ALL_TYPES("DocumentReference", Some("DocumentReference"), Some("http://hl7.org/fhir/resource-types"))
  case DOMAINRESOURCE extends ALL_TYPES("DomainResource", Some("DomainResource"), Some("http://hl7.org/fhir/resource-types"))
  case DOSAGE extends ALL_TYPES("Dosage", Some("Dosage"), Some("http://hl7.org/fhir/data-types"))
  case DURATION extends ALL_TYPES("Duration", Some("Duration"), Some("http://hl7.org/fhir/data-types"))
  case EFFECTEVIDENCESYNTHESIS
      extends ALL_TYPES("EffectEvidenceSynthesis", Some("EffectEvidenceSynthesis"), Some("http://hl7.org/fhir/resource-types"))
  case ELEMENT extends ALL_TYPES("Element", Some("Element"), Some("http://hl7.org/fhir/data-types"))
  case ELEMENTDEFINITION extends ALL_TYPES("ElementDefinition", Some("ElementDefinition"), Some("http://hl7.org/fhir/data-types"))
  case ENCOUNTER extends ALL_TYPES("Encounter", Some("Encounter"), Some("http://hl7.org/fhir/resource-types"))
  case ENDPOINT extends ALL_TYPES("Endpoint", Some("Endpoint"), Some("http://hl7.org/fhir/resource-types"))
  case ENROLLMENTREQUEST
      extends ALL_TYPES("EnrollmentRequest", Some("EnrollmentRequest"), Some("http://hl7.org/fhir/resource-types"))
  case ENROLLMENTRESPONSE
      extends ALL_TYPES("EnrollmentResponse", Some("EnrollmentResponse"), Some("http://hl7.org/fhir/resource-types"))
  case EPISODEOFCARE extends ALL_TYPES("EpisodeOfCare", Some("EpisodeOfCare"), Some("http://hl7.org/fhir/resource-types"))
  case EVENTDEFINITION extends ALL_TYPES("EventDefinition", Some("EventDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case EVIDENCE extends ALL_TYPES("Evidence", Some("Evidence"), Some("http://hl7.org/fhir/resource-types"))
  case EVIDENCEVARIABLE
      extends ALL_TYPES("EvidenceVariable", Some("EvidenceVariable"), Some("http://hl7.org/fhir/resource-types"))
  case EXAMPLESCENARIO extends ALL_TYPES("ExampleScenario", Some("ExampleScenario"), Some("http://hl7.org/fhir/resource-types"))
  case EXPLANATIONOFBENEFIT
      extends ALL_TYPES("ExplanationOfBenefit", Some("ExplanationOfBenefit"), Some("http://hl7.org/fhir/resource-types"))
  case EXPRESSION extends ALL_TYPES("Expression", Some("Expression"), Some("http://hl7.org/fhir/data-types"))
  case EXTENSION extends ALL_TYPES("Extension", Some("Extension"), Some("http://hl7.org/fhir/data-types"))
  case FAMILYMEMBERHISTORY
      extends ALL_TYPES("FamilyMemberHistory", Some("FamilyMemberHistory"), Some("http://hl7.org/fhir/resource-types"))
  case FLAG extends ALL_TYPES("Flag", Some("Flag"), Some("http://hl7.org/fhir/resource-types"))
  case GOAL extends ALL_TYPES("Goal", Some("Goal"), Some("http://hl7.org/fhir/resource-types"))
  case GRAPHDEFINITION extends ALL_TYPES("GraphDefinition", Some("GraphDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case GROUP extends ALL_TYPES("Group", Some("Group"), Some("http://hl7.org/fhir/resource-types"))
  case GUIDANCERESPONSE
      extends ALL_TYPES("GuidanceResponse", Some("GuidanceResponse"), Some("http://hl7.org/fhir/resource-types"))
  case HEALTHCARESERVICE
      extends ALL_TYPES("HealthcareService", Some("HealthcareService"), Some("http://hl7.org/fhir/resource-types"))
  case HUMANNAME extends ALL_TYPES("HumanName", Some("HumanName"), Some("http://hl7.org/fhir/data-types"))
  case ID extends ALL_TYPES("id", Some("id"), Some("http://hl7.org/fhir/data-types"))
  case IDENTIFIER extends ALL_TYPES("Identifier", Some("Identifier"), Some("http://hl7.org/fhir/data-types"))
  case IMAGINGSTUDY extends ALL_TYPES("ImagingStudy", Some("ImagingStudy"), Some("http://hl7.org/fhir/resource-types"))
  case IMMUNIZATION extends ALL_TYPES("Immunization", Some("Immunization"), Some("http://hl7.org/fhir/resource-types"))
  case IMMUNIZATIONEVALUATION
      extends ALL_TYPES("ImmunizationEvaluation", Some("ImmunizationEvaluation"), Some("http://hl7.org/fhir/resource-types"))
  case IMMUNIZATIONRECOMMENDATION
      extends ALL_TYPES(
        "ImmunizationRecommendation",
        Some("ImmunizationRecommendation"),
        Some("http://hl7.org/fhir/resource-types"))
  case IMPLEMENTATIONGUIDE
      extends ALL_TYPES("ImplementationGuide", Some("ImplementationGuide"), Some("http://hl7.org/fhir/resource-types"))
  case INSTANT extends ALL_TYPES("instant", Some("instant"), Some("http://hl7.org/fhir/data-types"))
  case INSURANCEPLAN extends ALL_TYPES("InsurancePlan", Some("InsurancePlan"), Some("http://hl7.org/fhir/resource-types"))
  case INTEGER extends ALL_TYPES("integer", Some("integer"), Some("http://hl7.org/fhir/data-types"))
  case INVOICE extends ALL_TYPES("Invoice", Some("Invoice"), Some("http://hl7.org/fhir/resource-types"))
  case LIBRARY extends ALL_TYPES("Library", Some("Library"), Some("http://hl7.org/fhir/resource-types"))
  case LINKAGE extends ALL_TYPES("Linkage", Some("Linkage"), Some("http://hl7.org/fhir/resource-types"))
  case LIST extends ALL_TYPES("List", Some("List"), Some("http://hl7.org/fhir/resource-types"))
  case LOCATION extends ALL_TYPES("Location", Some("Location"), Some("http://hl7.org/fhir/resource-types"))
  case MARKDOWN extends ALL_TYPES("markdown", Some("markdown"), Some("http://hl7.org/fhir/data-types"))
  case MARKETINGSTATUS extends ALL_TYPES("MarketingStatus", Some("MarketingStatus"), Some("http://hl7.org/fhir/data-types"))
  case MEASURE extends ALL_TYPES("Measure", Some("Measure"), Some("http://hl7.org/fhir/resource-types"))
  case MEASUREREPORT extends ALL_TYPES("MeasureReport", Some("MeasureReport"), Some("http://hl7.org/fhir/resource-types"))
  case MEDIA extends ALL_TYPES("Media", Some("Media"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICATION extends ALL_TYPES("Medication", Some("Medication"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICATIONADMINISTRATION
      extends ALL_TYPES("MedicationAdministration", Some("MedicationAdministration"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICATIONDISPENSE
      extends ALL_TYPES("MedicationDispense", Some("MedicationDispense"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICATIONKNOWLEDGE
      extends ALL_TYPES("MedicationKnowledge", Some("MedicationKnowledge"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICATIONREQUEST
      extends ALL_TYPES("MedicationRequest", Some("MedicationRequest"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICATIONSTATEMENT
      extends ALL_TYPES("MedicationStatement", Some("MedicationStatement"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICINALPRODUCT
      extends ALL_TYPES("MedicinalProduct", Some("MedicinalProduct"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICINALPRODUCTAUTHORIZATION
      extends ALL_TYPES(
        "MedicinalProductAuthorization",
        Some("MedicinalProductAuthorization"),
        Some("http://hl7.org/fhir/resource-types"))
  case MEDICINALPRODUCTCONTRAINDICATION
      extends ALL_TYPES(
        "MedicinalProductContraindication",
        Some("MedicinalProductContraindication"),
        Some("http://hl7.org/fhir/resource-types"))
  case MEDICINALPRODUCTINDICATION
      extends ALL_TYPES(
        "MedicinalProductIndication",
        Some("MedicinalProductIndication"),
        Some("http://hl7.org/fhir/resource-types"))
  case MEDICINALPRODUCTINGREDIENT
      extends ALL_TYPES(
        "MedicinalProductIngredient",
        Some("MedicinalProductIngredient"),
        Some("http://hl7.org/fhir/resource-types"))
  case MEDICINALPRODUCTINTERACTION
      extends ALL_TYPES(
        "MedicinalProductInteraction",
        Some("MedicinalProductInteraction"),
        Some("http://hl7.org/fhir/resource-types"))
  case MEDICINALPRODUCTMANUFACTURED
      extends ALL_TYPES(
        "MedicinalProductManufactured",
        Some("MedicinalProductManufactured"),
        Some("http://hl7.org/fhir/resource-types"))
  case MEDICINALPRODUCTPACKAGED
      extends ALL_TYPES("MedicinalProductPackaged", Some("MedicinalProductPackaged"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICINALPRODUCTPHARMACEUTICAL
      extends ALL_TYPES(
        "MedicinalProductPharmaceutical",
        Some("MedicinalProductPharmaceutical"),
        Some("http://hl7.org/fhir/resource-types"))
  case MEDICINALPRODUCTUNDESIRABLEEFFECT
      extends ALL_TYPES(
        "MedicinalProductUndesirableEffect",
        Some("MedicinalProductUndesirableEffect"),
        Some("http://hl7.org/fhir/resource-types"))
  case MESSAGEDEFINITION
      extends ALL_TYPES("MessageDefinition", Some("MessageDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case MESSAGEHEADER extends ALL_TYPES("MessageHeader", Some("MessageHeader"), Some("http://hl7.org/fhir/resource-types"))
  case META extends ALL_TYPES("Meta", Some("Meta"), Some("http://hl7.org/fhir/data-types"))
  case MOLECULARSEQUENCE
      extends ALL_TYPES("MolecularSequence", Some("MolecularSequence"), Some("http://hl7.org/fhir/resource-types"))
  case MONEY extends ALL_TYPES("Money", Some("Money"), Some("http://hl7.org/fhir/data-types"))
  case MONEYQUANTITY extends ALL_TYPES("MoneyQuantity", Some("MoneyQuantity"), Some("http://hl7.org/fhir/data-types"))
  case NAMINGSYSTEM extends ALL_TYPES("NamingSystem", Some("NamingSystem"), Some("http://hl7.org/fhir/resource-types"))
  case NARRATIVE extends ALL_TYPES("Narrative", Some("Narrative"), Some("http://hl7.org/fhir/data-types"))
  case NUTRITIONORDER extends ALL_TYPES("NutritionOrder", Some("NutritionOrder"), Some("http://hl7.org/fhir/resource-types"))
  case OBSERVATION extends ALL_TYPES("Observation", Some("Observation"), Some("http://hl7.org/fhir/resource-types"))
  case OBSERVATIONDEFINITION
      extends ALL_TYPES("ObservationDefinition", Some("ObservationDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case OID extends ALL_TYPES("oid", Some("oid"), Some("http://hl7.org/fhir/data-types"))
  case OPERATIONDEFINITION
      extends ALL_TYPES("OperationDefinition", Some("OperationDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case OPERATIONOUTCOME
      extends ALL_TYPES("OperationOutcome", Some("OperationOutcome"), Some("http://hl7.org/fhir/resource-types"))
  case ORGANIZATION extends ALL_TYPES("Organization", Some("Organization"), Some("http://hl7.org/fhir/resource-types"))
  case ORGANIZATIONAFFILIATION
      extends ALL_TYPES("OrganizationAffiliation", Some("OrganizationAffiliation"), Some("http://hl7.org/fhir/resource-types"))
  case PARAMETERDEFINITION
      extends ALL_TYPES("ParameterDefinition", Some("ParameterDefinition"), Some("http://hl7.org/fhir/data-types"))
  case PARAMETERS extends ALL_TYPES("Parameters", Some("Parameters"), Some("http://hl7.org/fhir/resource-types"))
  case PATIENT extends ALL_TYPES("Patient", Some("Patient"), Some("http://hl7.org/fhir/resource-types"))
  case PAYMENTNOTICE extends ALL_TYPES("PaymentNotice", Some("PaymentNotice"), Some("http://hl7.org/fhir/resource-types"))
  case PAYMENTRECONCILIATION
      extends ALL_TYPES("PaymentReconciliation", Some("PaymentReconciliation"), Some("http://hl7.org/fhir/resource-types"))
  case PERIOD extends ALL_TYPES("Period", Some("Period"), Some("http://hl7.org/fhir/data-types"))
  case PERSON extends ALL_TYPES("Person", Some("Person"), Some("http://hl7.org/fhir/resource-types"))
  case PLANDEFINITION extends ALL_TYPES("PlanDefinition", Some("PlanDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case POPULATION extends ALL_TYPES("Population", Some("Population"), Some("http://hl7.org/fhir/data-types"))
  case POSITIVEINT extends ALL_TYPES("positiveInt", Some("positiveInt"), Some("http://hl7.org/fhir/data-types"))
  case PRACTITIONER extends ALL_TYPES("Practitioner", Some("Practitioner"), Some("http://hl7.org/fhir/resource-types"))
  case PRACTITIONERROLE
      extends ALL_TYPES("PractitionerRole", Some("PractitionerRole"), Some("http://hl7.org/fhir/resource-types"))
  case PROCEDURE extends ALL_TYPES("Procedure", Some("Procedure"), Some("http://hl7.org/fhir/resource-types"))
  case PRODCHARACTERISTIC
      extends ALL_TYPES("ProdCharacteristic", Some("ProdCharacteristic"), Some("http://hl7.org/fhir/data-types"))
  case PRODUCTSHELFLIFE extends ALL_TYPES("ProductShelfLife", Some("ProductShelfLife"), Some("http://hl7.org/fhir/data-types"))
  case PROVENANCE extends ALL_TYPES("Provenance", Some("Provenance"), Some("http://hl7.org/fhir/resource-types"))
  case QUANTITY extends ALL_TYPES("Quantity", Some("Quantity"), Some("http://hl7.org/fhir/data-types"))
  case QUESTIONNAIRE extends ALL_TYPES("Questionnaire", Some("Questionnaire"), Some("http://hl7.org/fhir/resource-types"))
  case QUESTIONNAIRERESPONSE
      extends ALL_TYPES("QuestionnaireResponse", Some("QuestionnaireResponse"), Some("http://hl7.org/fhir/resource-types"))
  case RANGE extends ALL_TYPES("Range", Some("Range"), Some("http://hl7.org/fhir/data-types"))
  case RATIO extends ALL_TYPES("Ratio", Some("Ratio"), Some("http://hl7.org/fhir/data-types"))
  case REFERENCE extends ALL_TYPES("Reference", Some("Reference"), Some("http://hl7.org/fhir/data-types"))
  case RELATEDARTIFACT extends ALL_TYPES("RelatedArtifact", Some("RelatedArtifact"), Some("http://hl7.org/fhir/data-types"))
  case RELATEDPERSON extends ALL_TYPES("RelatedPerson", Some("RelatedPerson"), Some("http://hl7.org/fhir/resource-types"))
  case REQUESTGROUP extends ALL_TYPES("RequestGroup", Some("RequestGroup"), Some("http://hl7.org/fhir/resource-types"))
  case RESEARCHDEFINITION
      extends ALL_TYPES("ResearchDefinition", Some("ResearchDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case RESEARCHELEMENTDEFINITION
      extends ALL_TYPES(
        "ResearchElementDefinition",
        Some("ResearchElementDefinition"),
        Some("http://hl7.org/fhir/resource-types"))
  case RESEARCHSTUDY extends ALL_TYPES("ResearchStudy", Some("ResearchStudy"), Some("http://hl7.org/fhir/resource-types"))
  case RESEARCHSUBJECT extends ALL_TYPES("ResearchSubject", Some("ResearchSubject"), Some("http://hl7.org/fhir/resource-types"))
  case RESOURCE extends ALL_TYPES("Resource", Some("Resource"), Some("http://hl7.org/fhir/resource-types"))
  case RISKASSESSMENT extends ALL_TYPES("RiskAssessment", Some("RiskAssessment"), Some("http://hl7.org/fhir/resource-types"))
  case RISKEVIDENCESYNTHESIS
      extends ALL_TYPES("RiskEvidenceSynthesis", Some("RiskEvidenceSynthesis"), Some("http://hl7.org/fhir/resource-types"))
  case SAMPLEDDATA extends ALL_TYPES("SampledData", Some("SampledData"), Some("http://hl7.org/fhir/data-types"))
  case SCHEDULE extends ALL_TYPES("Schedule", Some("Schedule"), Some("http://hl7.org/fhir/resource-types"))
  case SEARCHPARAMETER extends ALL_TYPES("SearchParameter", Some("SearchParameter"), Some("http://hl7.org/fhir/resource-types"))
  case SERVICEREQUEST extends ALL_TYPES("ServiceRequest", Some("ServiceRequest"), Some("http://hl7.org/fhir/resource-types"))
  case SIGNATURE extends ALL_TYPES("Signature", Some("Signature"), Some("http://hl7.org/fhir/data-types"))
  case SIMPLEQUANTITY extends ALL_TYPES("SimpleQuantity", Some("SimpleQuantity"), Some("http://hl7.org/fhir/data-types"))
  case SLOT extends ALL_TYPES("Slot", Some("Slot"), Some("http://hl7.org/fhir/resource-types"))
  case SPECIMEN extends ALL_TYPES("Specimen", Some("Specimen"), Some("http://hl7.org/fhir/resource-types"))
  case SPECIMENDEFINITION
      extends ALL_TYPES("SpecimenDefinition", Some("SpecimenDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case STRING extends ALL_TYPES("string", Some("string"), Some("http://hl7.org/fhir/data-types"))
  case STRUCTUREDEFINITION
      extends ALL_TYPES("StructureDefinition", Some("StructureDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case STRUCTUREMAP extends ALL_TYPES("StructureMap", Some("StructureMap"), Some("http://hl7.org/fhir/resource-types"))
  case SUBSCRIPTION extends ALL_TYPES("Subscription", Some("Subscription"), Some("http://hl7.org/fhir/resource-types"))
  case SUBSTANCE extends ALL_TYPES("Substance", Some("Substance"), Some("http://hl7.org/fhir/resource-types"))
  case SUBSTANCEAMOUNT extends ALL_TYPES("SubstanceAmount", Some("SubstanceAmount"), Some("http://hl7.org/fhir/data-types"))
  case SUBSTANCENUCLEICACID
      extends ALL_TYPES("SubstanceNucleicAcid", Some("SubstanceNucleicAcid"), Some("http://hl7.org/fhir/resource-types"))
  case SUBSTANCEPOLYMER
      extends ALL_TYPES("SubstancePolymer", Some("SubstancePolymer"), Some("http://hl7.org/fhir/resource-types"))
  case SUBSTANCEPROTEIN
      extends ALL_TYPES("SubstanceProtein", Some("SubstanceProtein"), Some("http://hl7.org/fhir/resource-types"))
  case SUBSTANCEREFERENCEINFORMATION
      extends ALL_TYPES(
        "SubstanceReferenceInformation",
        Some("SubstanceReferenceInformation"),
        Some("http://hl7.org/fhir/resource-types"))
  case SUBSTANCESOURCEMATERIAL
      extends ALL_TYPES("SubstanceSourceMaterial", Some("SubstanceSourceMaterial"), Some("http://hl7.org/fhir/resource-types"))
  case SUBSTANCESPECIFICATION
      extends ALL_TYPES("SubstanceSpecification", Some("SubstanceSpecification"), Some("http://hl7.org/fhir/resource-types"))
  case SUPPLYDELIVERY extends ALL_TYPES("SupplyDelivery", Some("SupplyDelivery"), Some("http://hl7.org/fhir/resource-types"))
  case SUPPLYREQUEST extends ALL_TYPES("SupplyRequest", Some("SupplyRequest"), Some("http://hl7.org/fhir/resource-types"))
  case TASK extends ALL_TYPES("Task", Some("Task"), Some("http://hl7.org/fhir/resource-types"))
  case TERMINOLOGYCAPABILITIES
      extends ALL_TYPES("TerminologyCapabilities", Some("TerminologyCapabilities"), Some("http://hl7.org/fhir/resource-types"))
  case TESTREPORT extends ALL_TYPES("TestReport", Some("TestReport"), Some("http://hl7.org/fhir/resource-types"))
  case TESTSCRIPT extends ALL_TYPES("TestScript", Some("TestScript"), Some("http://hl7.org/fhir/resource-types"))
  case TIME extends ALL_TYPES("time", Some("time"), Some("http://hl7.org/fhir/data-types"))
  case TIMING extends ALL_TYPES("Timing", Some("Timing"), Some("http://hl7.org/fhir/data-types"))
  case TRIGGERDEFINITION extends ALL_TYPES("TriggerDefinition", Some("TriggerDefinition"), Some("http://hl7.org/fhir/data-types"))
  case TYPE extends ALL_TYPES("Type", Some("Type"), Some("http://hl7.org/fhir/abstract-types"))
  case UNSIGNEDINT extends ALL_TYPES("unsignedInt", Some("unsignedInt"), Some("http://hl7.org/fhir/data-types"))
  case URI extends ALL_TYPES("uri", Some("uri"), Some("http://hl7.org/fhir/data-types"))
  case URL extends ALL_TYPES("url", Some("url"), Some("http://hl7.org/fhir/data-types"))
  case USAGECONTEXT extends ALL_TYPES("UsageContext", Some("UsageContext"), Some("http://hl7.org/fhir/data-types"))
  case UUID extends ALL_TYPES("uuid", Some("uuid"), Some("http://hl7.org/fhir/data-types"))
  case VALUESET extends ALL_TYPES("ValueSet", Some("ValueSet"), Some("http://hl7.org/fhir/resource-types"))
  case VERIFICATIONRESULT
      extends ALL_TYPES("VerificationResult", Some("VerificationResult"), Some("http://hl7.org/fhir/resource-types"))
  case VISIONPRESCRIPTION
      extends ALL_TYPES("VisionPrescription", Some("VisionPrescription"), Some("http://hl7.org/fhir/resource-types"))
  case XHTML extends ALL_TYPES("xhtml", Some("XHTML"), Some("http://hl7.org/fhir/data-types"))
}
object ALL_TYPES extends EType[ALL_TYPES]("http://hl7.org/fhir/ValueSet/all-types")

enum CONTACT_POINT_SYSTEM(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case EMAIL extends CONTACT_POINT_SYSTEM("email", Some("Email"), Some("http://hl7.org/fhir/contact-point-system"))
  case FAX extends CONTACT_POINT_SYSTEM("fax", Some("Fax"), Some("http://hl7.org/fhir/contact-point-system"))
  case OTHER extends CONTACT_POINT_SYSTEM("other", Some("Other"), Some("http://hl7.org/fhir/contact-point-system"))
  case PAGER extends CONTACT_POINT_SYSTEM("pager", Some("Pager"), Some("http://hl7.org/fhir/contact-point-system"))
  case PHONE extends CONTACT_POINT_SYSTEM("phone", Some("Phone"), Some("http://hl7.org/fhir/contact-point-system"))
  case SMS extends CONTACT_POINT_SYSTEM("sms", Some("SMS"), Some("http://hl7.org/fhir/contact-point-system"))
  case URL extends CONTACT_POINT_SYSTEM("url", Some("URL"), Some("http://hl7.org/fhir/contact-point-system"))
}
object CONTACT_POINT_SYSTEM extends EType[CONTACT_POINT_SYSTEM]("http://hl7.org/fhir/ValueSet/contact-point-system")

enum CONTACT_POINT_USE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case HOME extends CONTACT_POINT_USE("home", Some("Home"), Some("http://hl7.org/fhir/contact-point-use"))
  case MOBILE extends CONTACT_POINT_USE("mobile", Some("Mobile"), Some("http://hl7.org/fhir/contact-point-use"))
  case OLD extends CONTACT_POINT_USE("old", Some("Old"), Some("http://hl7.org/fhir/contact-point-use"))
  case TEMP extends CONTACT_POINT_USE("temp", Some("Temp"), Some("http://hl7.org/fhir/contact-point-use"))
  case WORK extends CONTACT_POINT_USE("work", Some("Work"), Some("http://hl7.org/fhir/contact-point-use"))
}
object CONTACT_POINT_USE extends EType[CONTACT_POINT_USE]("http://hl7.org/fhir/ValueSet/contact-point-use")

enum CONTRIBUTOR_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case AUTHOR extends CONTRIBUTOR_TYPE("author", Some("Author"), Some("http://hl7.org/fhir/contributor-type"))
  case EDITOR extends CONTRIBUTOR_TYPE("editor", Some("Editor"), Some("http://hl7.org/fhir/contributor-type"))
  case ENDORSER extends CONTRIBUTOR_TYPE("endorser", Some("Endorser"), Some("http://hl7.org/fhir/contributor-type"))
  case REVIEWER extends CONTRIBUTOR_TYPE("reviewer", Some("Reviewer"), Some("http://hl7.org/fhir/contributor-type"))
}
object CONTRIBUTOR_TYPE extends EType[CONTRIBUTOR_TYPE]("http://hl7.org/fhir/ValueSet/contributor-type")

enum DAYS_OF_WEEK(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case FRI extends DAYS_OF_WEEK("fri", Some("Friday"), Some("http://hl7.org/fhir/days-of-week"))
  case MON extends DAYS_OF_WEEK("mon", Some("Monday"), Some("http://hl7.org/fhir/days-of-week"))
  case SAT extends DAYS_OF_WEEK("sat", Some("Saturday"), Some("http://hl7.org/fhir/days-of-week"))
  case SUN extends DAYS_OF_WEEK("sun", Some("Sunday"), Some("http://hl7.org/fhir/days-of-week"))
  case THU extends DAYS_OF_WEEK("thu", Some("Thursday"), Some("http://hl7.org/fhir/days-of-week"))
  case TUE extends DAYS_OF_WEEK("tue", Some("Tuesday"), Some("http://hl7.org/fhir/days-of-week"))
  case WED extends DAYS_OF_WEEK("wed", Some("Wednesday"), Some("http://hl7.org/fhir/days-of-week"))
}
object DAYS_OF_WEEK extends EType[DAYS_OF_WEEK]("http://hl7.org/fhir/ValueSet/days-of-week")

enum EVENT_TIMING(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case AC extends EVENT_TIMING("AC", Some("AC"), Some("http://terminology.hl7.org/CodeSystem/v3-TimingEvent"))
  case ACD extends EVENT_TIMING("ACD", Some("ACD"), Some("http://terminology.hl7.org/CodeSystem/v3-TimingEvent"))
  case ACM extends EVENT_TIMING("ACM", Some("ACM"), Some("http://terminology.hl7.org/CodeSystem/v3-TimingEvent"))
  case ACV extends EVENT_TIMING("ACV", Some("ACV"), Some("http://terminology.hl7.org/CodeSystem/v3-TimingEvent"))
  case AFT extends EVENT_TIMING("AFT", Some("Afternoon"), Some("http://hl7.org/fhir/event-timing"))
  case C extends EVENT_TIMING("C", Some("C"), Some("http://terminology.hl7.org/CodeSystem/v3-TimingEvent"))
  case CD extends EVENT_TIMING("CD", Some("CD"), Some("http://terminology.hl7.org/CodeSystem/v3-TimingEvent"))
  case CM extends EVENT_TIMING("CM", Some("CM"), Some("http://terminology.hl7.org/CodeSystem/v3-TimingEvent"))
  case CV extends EVENT_TIMING("CV", Some("CV"), Some("http://terminology.hl7.org/CodeSystem/v3-TimingEvent"))
  case EARLY_AFTERNOON extends EVENT_TIMING("AFT.early", Some("Early Afternoon"), Some("http://hl7.org/fhir/event-timing"))
  case EARLY_EVENING extends EVENT_TIMING("EVE.early", Some("Early Evening"), Some("http://hl7.org/fhir/event-timing"))
  case EARLY_MORNING extends EVENT_TIMING("MORN.early", Some("Early Morning"), Some("http://hl7.org/fhir/event-timing"))
  case EVE extends EVENT_TIMING("EVE", Some("Evening"), Some("http://hl7.org/fhir/event-timing"))
  case HS extends EVENT_TIMING("HS", Some("HS"), Some("http://terminology.hl7.org/CodeSystem/v3-TimingEvent"))
  case LATE_AFTERNOON extends EVENT_TIMING("AFT.late", Some("Late Afternoon"), Some("http://hl7.org/fhir/event-timing"))
  case LATE_EVENING extends EVENT_TIMING("EVE.late", Some("Late Evening"), Some("http://hl7.org/fhir/event-timing"))
  case LATE_MORNING extends EVENT_TIMING("MORN.late", Some("Late Morning"), Some("http://hl7.org/fhir/event-timing"))
  case MORN extends EVENT_TIMING("MORN", Some("Morning"), Some("http://hl7.org/fhir/event-timing"))
  case NIGHT extends EVENT_TIMING("NIGHT", Some("Night"), Some("http://hl7.org/fhir/event-timing"))
  case NOON extends EVENT_TIMING("NOON", Some("Noon"), Some("http://hl7.org/fhir/event-timing"))
  case PC extends EVENT_TIMING("PC", Some("PC"), Some("http://terminology.hl7.org/CodeSystem/v3-TimingEvent"))
  case PCD extends EVENT_TIMING("PCD", Some("PCD"), Some("http://terminology.hl7.org/CodeSystem/v3-TimingEvent"))
  case PCM extends EVENT_TIMING("PCM", Some("PCM"), Some("http://terminology.hl7.org/CodeSystem/v3-TimingEvent"))
  case PCV extends EVENT_TIMING("PCV", Some("PCV"), Some("http://terminology.hl7.org/CodeSystem/v3-TimingEvent"))
  case PHS extends EVENT_TIMING("PHS", Some("After Sleep"), Some("http://hl7.org/fhir/event-timing"))
  case WAKE extends EVENT_TIMING("WAKE", Some("WAKE"), Some("http://terminology.hl7.org/CodeSystem/v3-TimingEvent"))
}
object EVENT_TIMING extends EType[EVENT_TIMING]("http://hl7.org/fhir/ValueSet/event-timing")

enum EXPRESSION_LANGUAGE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case CQL extends EXPRESSION_LANGUAGE("text/cql", Some("CQL"), Some("http://hl7.org/fhir/expression-language"))
  case FHIRPATH extends EXPRESSION_LANGUAGE("text/fhirpath", Some("FHIRPath"), Some("http://hl7.org/fhir/expression-language"))
  case FHIR_QUERY
      extends EXPRESSION_LANGUAGE("application/x-fhir-query", Some("FHIR Query"), Some("http://hl7.org/fhir/expression-language"))
  case Other_(s: String) extends EXPRESSION_LANGUAGE(s, Some(s"Runtime value set extension ($s)"), None)
}
object EXPRESSION_LANGUAGE
    extends ETypeWithFallback[EXPRESSION_LANGUAGE]
    with EType[EXPRESSION_LANGUAGE]("http://hl7.org/fhir/ValueSet/expression-language") {
  def fallback(s: String): EXPRESSION_LANGUAGE = EXPRESSION_LANGUAGE.Other_(s)
}

enum IDENTIFIER_USE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case OFFICIAL extends IDENTIFIER_USE("official", Some("Official"), Some("http://hl7.org/fhir/identifier-use"))
  case OLD extends IDENTIFIER_USE("old", Some("Old"), Some("http://hl7.org/fhir/identifier-use"))
  case SECONDARY extends IDENTIFIER_USE("secondary", Some("Secondary"), Some("http://hl7.org/fhir/identifier-use"))
  case TEMP extends IDENTIFIER_USE("temp", Some("Temp"), Some("http://hl7.org/fhir/identifier-use"))
  case USUAL extends IDENTIFIER_USE("usual", Some("Usual"), Some("http://hl7.org/fhir/identifier-use"))
}
object IDENTIFIER_USE extends EType[IDENTIFIER_USE]("http://hl7.org/fhir/ValueSet/identifier-use")

enum LANGUAGES(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case AR extends LANGUAGES("ar", Some("Arabic"), Some("urn:ietf:bcp:47"))
  case BN extends LANGUAGES("bn", Some("Bengali"), Some("urn:ietf:bcp:47"))
  case CS extends LANGUAGES("cs", Some("Czech"), Some("urn:ietf:bcp:47"))
  case DA extends LANGUAGES("da", Some("Danish"), Some("urn:ietf:bcp:47"))
  case DE extends LANGUAGES("de", Some("German"), Some("urn:ietf:bcp:47"))
  case DE_AT extends LANGUAGES("de-AT", Some("German (Austria)"), Some("urn:ietf:bcp:47"))
  case DE_CH extends LANGUAGES("de-CH", Some("German (Switzerland)"), Some("urn:ietf:bcp:47"))
  case DE_DE extends LANGUAGES("de-DE", Some("German (Germany)"), Some("urn:ietf:bcp:47"))
  case EL extends LANGUAGES("el", Some("Greek"), Some("urn:ietf:bcp:47"))
  case EN extends LANGUAGES("en", Some("English"), Some("urn:ietf:bcp:47"))
  case EN_AU extends LANGUAGES("en-AU", Some("English (Australia)"), Some("urn:ietf:bcp:47"))
  case EN_CA extends LANGUAGES("en-CA", Some("English (Canada)"), Some("urn:ietf:bcp:47"))
  case EN_GB extends LANGUAGES("en-GB", Some("English (Great Britain)"), Some("urn:ietf:bcp:47"))
  case EN_IN extends LANGUAGES("en-IN", Some("English (India)"), Some("urn:ietf:bcp:47"))
  case EN_NZ extends LANGUAGES("en-NZ", Some("English (New Zeland)"), Some("urn:ietf:bcp:47"))
  case EN_SG extends LANGUAGES("en-SG", Some("English (Singapore)"), Some("urn:ietf:bcp:47"))
  case EN_US extends LANGUAGES("en-US", Some("English (United States)"), Some("urn:ietf:bcp:47"))
  case ES extends LANGUAGES("es", Some("Spanish"), Some("urn:ietf:bcp:47"))
  case ES_AR extends LANGUAGES("es-AR", Some("Spanish (Argentina)"), Some("urn:ietf:bcp:47"))
  case ES_ES extends LANGUAGES("es-ES", Some("Spanish (Spain)"), Some("urn:ietf:bcp:47"))
  case ES_UY extends LANGUAGES("es-UY", Some("Spanish (Uruguay)"), Some("urn:ietf:bcp:47"))
  case FI extends LANGUAGES("fi", Some("Finnish"), Some("urn:ietf:bcp:47"))
  case FR extends LANGUAGES("fr", Some("French"), Some("urn:ietf:bcp:47"))
  case FR_BE extends LANGUAGES("fr-BE", Some("French (Belgium)"), Some("urn:ietf:bcp:47"))
  case FR_CH extends LANGUAGES("fr-CH", Some("French (Switzerland)"), Some("urn:ietf:bcp:47"))
  case FR_FR extends LANGUAGES("fr-FR", Some("French (France)"), Some("urn:ietf:bcp:47"))
  case FY extends LANGUAGES("fy", Some("Frysian"), Some("urn:ietf:bcp:47"))
  case FY_NL extends LANGUAGES("fy-NL", Some("Frysian (Netherlands)"), Some("urn:ietf:bcp:47"))
  case HI extends LANGUAGES("hi", Some("Hindi"), Some("urn:ietf:bcp:47"))
  case HR extends LANGUAGES("hr", Some("Croatian"), Some("urn:ietf:bcp:47"))
  case IT extends LANGUAGES("it", Some("Italian"), Some("urn:ietf:bcp:47"))
  case IT_CH extends LANGUAGES("it-CH", Some("Italian (Switzerland)"), Some("urn:ietf:bcp:47"))
  case IT_IT extends LANGUAGES("it-IT", Some("Italian (Italy)"), Some("urn:ietf:bcp:47"))
  case JA extends LANGUAGES("ja", Some("Japanese"), Some("urn:ietf:bcp:47"))
  case KO extends LANGUAGES("ko", Some("Korean"), Some("urn:ietf:bcp:47"))
  case NL extends LANGUAGES("nl", Some("Dutch"), Some("urn:ietf:bcp:47"))
  case NL_BE extends LANGUAGES("nl-BE", Some("Dutch (Belgium)"), Some("urn:ietf:bcp:47"))
  case NL_NL extends LANGUAGES("nl-NL", Some("Dutch (Netherlands)"), Some("urn:ietf:bcp:47"))
  case NO extends LANGUAGES("no", Some("Norwegian"), Some("urn:ietf:bcp:47"))
  case NO_NO extends LANGUAGES("no-NO", Some("Norwegian (Norway)"), Some("urn:ietf:bcp:47"))
  case PA extends LANGUAGES("pa", Some("Punjabi"), Some("urn:ietf:bcp:47"))
  case PL extends LANGUAGES("pl", Some("Polish"), Some("urn:ietf:bcp:47"))
  case PT extends LANGUAGES("pt", Some("Portuguese"), Some("urn:ietf:bcp:47"))
  case PT_BR extends LANGUAGES("pt-BR", Some("Portuguese (Brazil)"), Some("urn:ietf:bcp:47"))
  case RU extends LANGUAGES("ru", Some("Russian"), Some("urn:ietf:bcp:47"))
  case RU_RU extends LANGUAGES("ru-RU", Some("Russian (Russia)"), Some("urn:ietf:bcp:47"))
  case SR extends LANGUAGES("sr", Some("Serbian"), Some("urn:ietf:bcp:47"))
  case SR_RS extends LANGUAGES("sr-RS", Some("Serbian (Serbia)"), Some("urn:ietf:bcp:47"))
  case SV extends LANGUAGES("sv", Some("Swedish"), Some("urn:ietf:bcp:47"))
  case SV_SE extends LANGUAGES("sv-SE", Some("Swedish (Sweden)"), Some("urn:ietf:bcp:47"))
  case TE extends LANGUAGES("te", Some("Telegu"), Some("urn:ietf:bcp:47"))
  case ZH extends LANGUAGES("zh", Some("Chinese"), Some("urn:ietf:bcp:47"))
  case ZH_CN extends LANGUAGES("zh-CN", Some("Chinese (China)"), Some("urn:ietf:bcp:47"))
  case ZH_HK extends LANGUAGES("zh-HK", Some("Chinese (Hong Kong)"), Some("urn:ietf:bcp:47"))
  case ZH_SG extends LANGUAGES("zh-SG", Some("Chinese (Singapore)"), Some("urn:ietf:bcp:47"))
  case ZH_TW extends LANGUAGES("zh-TW", Some("Chinese (Taiwan)"), Some("urn:ietf:bcp:47"))
  case Other_(s: String) extends LANGUAGES(s, Some(s"Runtime value set extension ($s)"), None)
}
object LANGUAGES extends ETypeWithFallback[LANGUAGES] with EType[LANGUAGES]("http://hl7.org/fhir/ValueSet/languages") {
  def fallback(s: String): LANGUAGES = LANGUAGES.Other_(s)
}

enum NAME_USE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ANONYMOUS extends NAME_USE("anonymous", Some("Anonymous"), Some("http://hl7.org/fhir/name-use"))
  case MAIDEN extends NAME_USE("maiden", Some("Name changed for Marriage"), Some("http://hl7.org/fhir/name-use"))
  case NICKNAME extends NAME_USE("nickname", Some("Nickname"), Some("http://hl7.org/fhir/name-use"))
  case OFFICIAL extends NAME_USE("official", Some("Official"), Some("http://hl7.org/fhir/name-use"))
  case OLD extends NAME_USE("old", Some("Old"), Some("http://hl7.org/fhir/name-use"))
  case TEMP extends NAME_USE("temp", Some("Temp"), Some("http://hl7.org/fhir/name-use"))
  case USUAL extends NAME_USE("usual", Some("Usual"), Some("http://hl7.org/fhir/name-use"))
}
object NAME_USE extends EType[NAME_USE]("http://hl7.org/fhir/ValueSet/name-use")

enum OPERATION_PARAMETER_USE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case IN extends OPERATION_PARAMETER_USE("in", Some("In"), Some("http://hl7.org/fhir/operation-parameter-use"))
  case OUT extends OPERATION_PARAMETER_USE("out", Some("Out"), Some("http://hl7.org/fhir/operation-parameter-use"))
}
object OPERATION_PARAMETER_USE extends EType[OPERATION_PARAMETER_USE]("http://hl7.org/fhir/ValueSet/operation-parameter-use")

enum QUANTITY_COMPARATOR(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case GREATER_OR_EQUAL_TO
      extends QUANTITY_COMPARATOR(">=", Some("Greater or Equal to"), Some("http://hl7.org/fhir/quantity-comparator"))
  case GREATER_THAN extends QUANTITY_COMPARATOR(">", Some("Greater than"), Some("http://hl7.org/fhir/quantity-comparator"))
  case LESS_OR_EQUAL_TO
      extends QUANTITY_COMPARATOR("<=", Some("Less or Equal to"), Some("http://hl7.org/fhir/quantity-comparator"))
  case LESS_THAN extends QUANTITY_COMPARATOR("<", Some("Less than"), Some("http://hl7.org/fhir/quantity-comparator"))
}
object QUANTITY_COMPARATOR extends EType[QUANTITY_COMPARATOR]("http://hl7.org/fhir/ValueSet/quantity-comparator")

enum RELATED_ARTIFACT_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case CITATION extends RELATED_ARTIFACT_TYPE("citation", Some("Citation"), Some("http://hl7.org/fhir/related-artifact-type"))
  case COMPOSED_OF
      extends RELATED_ARTIFACT_TYPE("composed-of", Some("Composed Of"), Some("http://hl7.org/fhir/related-artifact-type"))
  case DEPENDS_ON
      extends RELATED_ARTIFACT_TYPE("depends-on", Some("Depends On"), Some("http://hl7.org/fhir/related-artifact-type"))
  case DERIVED_FROM
      extends RELATED_ARTIFACT_TYPE("derived-from", Some("Derived From"), Some("http://hl7.org/fhir/related-artifact-type"))
  case DOCUMENTATION
      extends RELATED_ARTIFACT_TYPE("documentation", Some("Documentation"), Some("http://hl7.org/fhir/related-artifact-type"))
  case JUSTIFICATION
      extends RELATED_ARTIFACT_TYPE("justification", Some("Justification"), Some("http://hl7.org/fhir/related-artifact-type"))
  case PREDECESSOR
      extends RELATED_ARTIFACT_TYPE("predecessor", Some("Predecessor"), Some("http://hl7.org/fhir/related-artifact-type"))
  case SUCCESSOR extends RELATED_ARTIFACT_TYPE("successor", Some("Successor"), Some("http://hl7.org/fhir/related-artifact-type"))
}
object RELATED_ARTIFACT_TYPE extends EType[RELATED_ARTIFACT_TYPE]("http://hl7.org/fhir/ValueSet/related-artifact-type")

enum SORT_DIRECTION(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ASCENDING extends SORT_DIRECTION("ascending", Some("Ascending"), Some("http://hl7.org/fhir/sort-direction"))
  case DESCENDING extends SORT_DIRECTION("descending", Some("Descending"), Some("http://hl7.org/fhir/sort-direction"))
}
object SORT_DIRECTION extends EType[SORT_DIRECTION]("http://hl7.org/fhir/ValueSet/sort-direction")

enum TRIGGER_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case DATA_ACCESSED extends TRIGGER_TYPE("data-accessed", Some("Data Accessed"), Some("http://hl7.org/fhir/trigger-type"))
  case DATA_ACCESS_ENDED
      extends TRIGGER_TYPE("data-access-ended", Some("Data Access Ended"), Some("http://hl7.org/fhir/trigger-type"))
  case DATA_ADDED extends TRIGGER_TYPE("data-added", Some("Data Added"), Some("http://hl7.org/fhir/trigger-type"))
  case DATA_CHANGED extends TRIGGER_TYPE("data-changed", Some("Data Changed"), Some("http://hl7.org/fhir/trigger-type"))
  case DATA_REMOVED extends TRIGGER_TYPE("data-removed", Some("Data Removed"), Some("http://hl7.org/fhir/trigger-type"))
  case DATA_UPDATED extends TRIGGER_TYPE("data-modified", Some("Data Updated"), Some("http://hl7.org/fhir/trigger-type"))
  case NAMED_EVENT extends TRIGGER_TYPE("named-event", Some("Named Event"), Some("http://hl7.org/fhir/trigger-type"))
  case PERIODIC extends TRIGGER_TYPE("periodic", Some("Periodic"), Some("http://hl7.org/fhir/trigger-type"))
}
object TRIGGER_TYPE extends EType[TRIGGER_TYPE]("http://hl7.org/fhir/ValueSet/trigger-type")

enum UNITS_OF_TIME(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case A extends UNITS_OF_TIME("a", Some("year"), Some("http://unitsofmeasure.org"))
  case D extends UNITS_OF_TIME("d", Some("day"), Some("http://unitsofmeasure.org"))
  case H extends UNITS_OF_TIME("h", Some("hour"), Some("http://unitsofmeasure.org"))
  case MIN extends UNITS_OF_TIME("min", Some("minute"), Some("http://unitsofmeasure.org"))
  case MO extends UNITS_OF_TIME("mo", Some("month"), Some("http://unitsofmeasure.org"))
  case S extends UNITS_OF_TIME("s", Some("second"), Some("http://unitsofmeasure.org"))
  case WK extends UNITS_OF_TIME("wk", Some("week"), Some("http://unitsofmeasure.org"))
}
object UNITS_OF_TIME extends EType[UNITS_OF_TIME]("http://hl7.org/fhir/ValueSet/units-of-time")
