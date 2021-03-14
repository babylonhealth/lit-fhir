package com.babylonhealth.lit.core

import enumeratum.{ CirceEnum, Enum, EnumEntry }

import com.babylonhealth.lit.core.model.Coding
import com.babylonhealth.lit.core.{ FhirEnum, FhirCirceEnum, EnumWithFallback }

sealed abstract class ADDRESS_TYPE(override val entryName: String)
    extends EnumEntry
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object ADDRESS_TYPE extends FhirEnum[ADDRESS_TYPE] with FhirCirceEnum[ADDRESS_TYPE] {
  val reference = "http://hl7.org/fhir/ValueSet/address-type"
  val values    = findValues
  case object BOTH extends ADDRESS_TYPE("both") {
    def display: Option[String] = Some("Postal & Physical")
    def system: Option[String]  = Some("http://hl7.org/fhir/address-type")
  }
  case object PHYSICAL extends ADDRESS_TYPE("physical") {
    def display: Option[String] = Some("Physical")
    def system: Option[String]  = Some("http://hl7.org/fhir/address-type")
  }
  case object POSTAL extends ADDRESS_TYPE("postal") {
    def display: Option[String] = Some("Postal")
    def system: Option[String]  = Some("http://hl7.org/fhir/address-type")
  }
}

sealed abstract class ADDRESS_USE(override val entryName: String)
    extends EnumEntry
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object ADDRESS_USE extends FhirEnum[ADDRESS_USE] with FhirCirceEnum[ADDRESS_USE] {
  val reference = "http://hl7.org/fhir/ValueSet/address-use"
  val values    = findValues
  case object BILLING extends ADDRESS_USE("billing") {
    def display: Option[String] = Some("Billing")
    def system: Option[String]  = Some("http://hl7.org/fhir/address-use")
  }
  case object HOME extends ADDRESS_USE("home") {
    def display: Option[String] = Some("Home")
    def system: Option[String]  = Some("http://hl7.org/fhir/address-use")
  }
  case object OLD extends ADDRESS_USE("old") {
    def display: Option[String] = Some("Old / Incorrect")
    def system: Option[String]  = Some("http://hl7.org/fhir/address-use")
  }
  case object TEMP extends ADDRESS_USE("temp") {
    def display: Option[String] = Some("Temporary")
    def system: Option[String]  = Some("http://hl7.org/fhir/address-use")
  }
  case object WORK extends ADDRESS_USE("work") {
    def display: Option[String] = Some("Work")
    def system: Option[String]  = Some("http://hl7.org/fhir/address-use")
  }
}

sealed abstract class ALL_TYPES(override val entryName: String)
    extends EnumEntry
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object ALL_TYPES extends FhirEnum[ALL_TYPES] with FhirCirceEnum[ALL_TYPES] {
  val reference = "http://hl7.org/fhir/ValueSet/all-types"
  val values    = findValues
  case object ACCOUNT extends ALL_TYPES("Account") {
    def display: Option[String] = Some("Account")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object ACTIVITYDEFINITION extends ALL_TYPES("ActivityDefinition") {
    def display: Option[String] = Some("ActivityDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object ADDRESS extends ALL_TYPES("Address") {
    def display: Option[String] = Some("Address")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object ADVERSEEVENT extends ALL_TYPES("AdverseEvent") {
    def display: Option[String] = Some("AdverseEvent")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object AGE extends ALL_TYPES("Age") {
    def display: Option[String] = Some("Age")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object ALLERGYINTOLERANCE extends ALL_TYPES("AllergyIntolerance") {
    def display: Option[String] = Some("AllergyIntolerance")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object ANNOTATION extends ALL_TYPES("Annotation") {
    def display: Option[String] = Some("Annotation")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object ANY extends ALL_TYPES("Any") {
    def display: Option[String] = Some("Any")
    def system: Option[String]  = Some("http://hl7.org/fhir/abstract-types")
  }
  case object APPOINTMENT extends ALL_TYPES("Appointment") {
    def display: Option[String] = Some("Appointment")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object APPOINTMENTRESPONSE extends ALL_TYPES("AppointmentResponse") {
    def display: Option[String] = Some("AppointmentResponse")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object ATTACHMENT extends ALL_TYPES("Attachment") {
    def display: Option[String] = Some("Attachment")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object AUDITEVENT extends ALL_TYPES("AuditEvent") {
    def display: Option[String] = Some("AuditEvent")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object BACKBONEELEMENT extends ALL_TYPES("BackboneElement") {
    def display: Option[String] = Some("BackboneElement")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object BASE64BINARY extends ALL_TYPES("base64Binary") {
    def display: Option[String] = Some("base64Binary")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object BASIC extends ALL_TYPES("Basic") {
    def display: Option[String] = Some("Basic")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object BINARY extends ALL_TYPES("Binary") {
    def display: Option[String] = Some("Binary")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object BIOLOGICALLYDERIVEDPRODUCT extends ALL_TYPES("BiologicallyDerivedProduct") {
    def display: Option[String] = Some("BiologicallyDerivedProduct")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object BODYSTRUCTURE extends ALL_TYPES("BodyStructure") {
    def display: Option[String] = Some("BodyStructure")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object BOOLEAN extends ALL_TYPES("boolean") {
    def display: Option[String] = Some("boolean")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object BUNDLE extends ALL_TYPES("Bundle") {
    def display: Option[String] = Some("Bundle")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CANONICAL extends ALL_TYPES("canonical") {
    def display: Option[String] = Some("canonical")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object CAPABILITYSTATEMENT extends ALL_TYPES("CapabilityStatement") {
    def display: Option[String] = Some("CapabilityStatement")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CAREPLAN extends ALL_TYPES("CarePlan") {
    def display: Option[String] = Some("CarePlan")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CARETEAM extends ALL_TYPES("CareTeam") {
    def display: Option[String] = Some("CareTeam")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CATALOGENTRY extends ALL_TYPES("CatalogEntry") {
    def display: Option[String] = Some("CatalogEntry")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CHARGEITEM extends ALL_TYPES("ChargeItem") {
    def display: Option[String] = Some("ChargeItem")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CHARGEITEMDEFINITION extends ALL_TYPES("ChargeItemDefinition") {
    def display: Option[String] = Some("ChargeItemDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CLAIM extends ALL_TYPES("Claim") {
    def display: Option[String] = Some("Claim")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CLAIMRESPONSE extends ALL_TYPES("ClaimResponse") {
    def display: Option[String] = Some("ClaimResponse")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CLINICALIMPRESSION extends ALL_TYPES("ClinicalImpression") {
    def display: Option[String] = Some("ClinicalImpression")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CODE extends ALL_TYPES("code") {
    def display: Option[String] = Some("code")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object CODEABLECONCEPT extends ALL_TYPES("CodeableConcept") {
    def display: Option[String] = Some("CodeableConcept")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object CODESYSTEM extends ALL_TYPES("CodeSystem") {
    def display: Option[String] = Some("CodeSystem")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CODING extends ALL_TYPES("Coding") {
    def display: Option[String] = Some("Coding")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object COMMUNICATION extends ALL_TYPES("Communication") {
    def display: Option[String] = Some("Communication")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object COMMUNICATIONREQUEST extends ALL_TYPES("CommunicationRequest") {
    def display: Option[String] = Some("CommunicationRequest")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object COMPARTMENTDEFINITION extends ALL_TYPES("CompartmentDefinition") {
    def display: Option[String] = Some("CompartmentDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object COMPOSITION extends ALL_TYPES("Composition") {
    def display: Option[String] = Some("Composition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CONCEPTMAP extends ALL_TYPES("ConceptMap") {
    def display: Option[String] = Some("ConceptMap")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CONDITION extends ALL_TYPES("Condition") {
    def display: Option[String] = Some("Condition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CONSENT extends ALL_TYPES("Consent") {
    def display: Option[String] = Some("Consent")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CONTACTDETAIL extends ALL_TYPES("ContactDetail") {
    def display: Option[String] = Some("ContactDetail")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object CONTACTPOINT extends ALL_TYPES("ContactPoint") {
    def display: Option[String] = Some("ContactPoint")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object CONTRACT extends ALL_TYPES("Contract") {
    def display: Option[String] = Some("Contract")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CONTRIBUTOR extends ALL_TYPES("Contributor") {
    def display: Option[String] = Some("Contributor")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object COUNT extends ALL_TYPES("Count") {
    def display: Option[String] = Some("Count")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object COVERAGE extends ALL_TYPES("Coverage") {
    def display: Option[String] = Some("Coverage")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object COVERAGEELIGIBILITYREQUEST extends ALL_TYPES("CoverageEligibilityRequest") {
    def display: Option[String] = Some("CoverageEligibilityRequest")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object COVERAGEELIGIBILITYRESPONSE extends ALL_TYPES("CoverageEligibilityResponse") {
    def display: Option[String] = Some("CoverageEligibilityResponse")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object DATAREQUIREMENT extends ALL_TYPES("DataRequirement") {
    def display: Option[String] = Some("DataRequirement")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object DATE extends ALL_TYPES("date") {
    def display: Option[String] = Some("date")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object DATETIME extends ALL_TYPES("dateTime") {
    def display: Option[String] = Some("dateTime")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object DECIMAL extends ALL_TYPES("decimal") {
    def display: Option[String] = Some("decimal")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object DETECTEDISSUE extends ALL_TYPES("DetectedIssue") {
    def display: Option[String] = Some("DetectedIssue")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object DEVICE extends ALL_TYPES("Device") {
    def display: Option[String] = Some("Device")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object DEVICEDEFINITION extends ALL_TYPES("DeviceDefinition") {
    def display: Option[String] = Some("DeviceDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object DEVICEMETRIC extends ALL_TYPES("DeviceMetric") {
    def display: Option[String] = Some("DeviceMetric")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object DEVICEREQUEST extends ALL_TYPES("DeviceRequest") {
    def display: Option[String] = Some("DeviceRequest")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object DEVICEUSESTATEMENT extends ALL_TYPES("DeviceUseStatement") {
    def display: Option[String] = Some("DeviceUseStatement")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object DIAGNOSTICREPORT extends ALL_TYPES("DiagnosticReport") {
    def display: Option[String] = Some("DiagnosticReport")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object DISTANCE extends ALL_TYPES("Distance") {
    def display: Option[String] = Some("Distance")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object DOCUMENTMANIFEST extends ALL_TYPES("DocumentManifest") {
    def display: Option[String] = Some("DocumentManifest")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object DOCUMENTREFERENCE extends ALL_TYPES("DocumentReference") {
    def display: Option[String] = Some("DocumentReference")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object DOMAINRESOURCE extends ALL_TYPES("DomainResource") {
    def display: Option[String] = Some("DomainResource")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object DOSAGE extends ALL_TYPES("Dosage") {
    def display: Option[String] = Some("Dosage")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object DURATION extends ALL_TYPES("Duration") {
    def display: Option[String] = Some("Duration")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object EFFECTEVIDENCESYNTHESIS extends ALL_TYPES("EffectEvidenceSynthesis") {
    def display: Option[String] = Some("EffectEvidenceSynthesis")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object ELEMENT extends ALL_TYPES("Element") {
    def display: Option[String] = Some("Element")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object ELEMENTDEFINITION extends ALL_TYPES("ElementDefinition") {
    def display: Option[String] = Some("ElementDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object ENCOUNTER extends ALL_TYPES("Encounter") {
    def display: Option[String] = Some("Encounter")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object ENDPOINT extends ALL_TYPES("Endpoint") {
    def display: Option[String] = Some("Endpoint")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object ENROLLMENTREQUEST extends ALL_TYPES("EnrollmentRequest") {
    def display: Option[String] = Some("EnrollmentRequest")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object ENROLLMENTRESPONSE extends ALL_TYPES("EnrollmentResponse") {
    def display: Option[String] = Some("EnrollmentResponse")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object EPISODEOFCARE extends ALL_TYPES("EpisodeOfCare") {
    def display: Option[String] = Some("EpisodeOfCare")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object EVENTDEFINITION extends ALL_TYPES("EventDefinition") {
    def display: Option[String] = Some("EventDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object EVIDENCE extends ALL_TYPES("Evidence") {
    def display: Option[String] = Some("Evidence")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object EVIDENCEVARIABLE extends ALL_TYPES("EvidenceVariable") {
    def display: Option[String] = Some("EvidenceVariable")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object EXAMPLESCENARIO extends ALL_TYPES("ExampleScenario") {
    def display: Option[String] = Some("ExampleScenario")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object EXPLANATIONOFBENEFIT extends ALL_TYPES("ExplanationOfBenefit") {
    def display: Option[String] = Some("ExplanationOfBenefit")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object EXPRESSION extends ALL_TYPES("Expression") {
    def display: Option[String] = Some("Expression")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object EXTENSION extends ALL_TYPES("Extension") {
    def display: Option[String] = Some("Extension")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object FAMILYMEMBERHISTORY extends ALL_TYPES("FamilyMemberHistory") {
    def display: Option[String] = Some("FamilyMemberHistory")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object FLAG extends ALL_TYPES("Flag") {
    def display: Option[String] = Some("Flag")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object GOAL extends ALL_TYPES("Goal") {
    def display: Option[String] = Some("Goal")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object GRAPHDEFINITION extends ALL_TYPES("GraphDefinition") {
    def display: Option[String] = Some("GraphDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object GROUP extends ALL_TYPES("Group") {
    def display: Option[String] = Some("Group")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object GUIDANCERESPONSE extends ALL_TYPES("GuidanceResponse") {
    def display: Option[String] = Some("GuidanceResponse")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object HEALTHCARESERVICE extends ALL_TYPES("HealthcareService") {
    def display: Option[String] = Some("HealthcareService")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object HUMANNAME extends ALL_TYPES("HumanName") {
    def display: Option[String] = Some("HumanName")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object ID extends ALL_TYPES("id") {
    def display: Option[String] = Some("id")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object IDENTIFIER extends ALL_TYPES("Identifier") {
    def display: Option[String] = Some("Identifier")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object IMAGINGSTUDY extends ALL_TYPES("ImagingStudy") {
    def display: Option[String] = Some("ImagingStudy")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object IMMUNIZATION extends ALL_TYPES("Immunization") {
    def display: Option[String] = Some("Immunization")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object IMMUNIZATIONEVALUATION extends ALL_TYPES("ImmunizationEvaluation") {
    def display: Option[String] = Some("ImmunizationEvaluation")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object IMMUNIZATIONRECOMMENDATION extends ALL_TYPES("ImmunizationRecommendation") {
    def display: Option[String] = Some("ImmunizationRecommendation")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object IMPLEMENTATIONGUIDE extends ALL_TYPES("ImplementationGuide") {
    def display: Option[String] = Some("ImplementationGuide")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object INSTANT extends ALL_TYPES("instant") {
    def display: Option[String] = Some("instant")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object INSURANCEPLAN extends ALL_TYPES("InsurancePlan") {
    def display: Option[String] = Some("InsurancePlan")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object INTEGER extends ALL_TYPES("integer") {
    def display: Option[String] = Some("integer")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object INVOICE extends ALL_TYPES("Invoice") {
    def display: Option[String] = Some("Invoice")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object LIBRARY extends ALL_TYPES("Library") {
    def display: Option[String] = Some("Library")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object LINKAGE extends ALL_TYPES("Linkage") {
    def display: Option[String] = Some("Linkage")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object LIST extends ALL_TYPES("List") {
    def display: Option[String] = Some("List")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object LOCATION extends ALL_TYPES("Location") {
    def display: Option[String] = Some("Location")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MARKDOWN extends ALL_TYPES("markdown") {
    def display: Option[String] = Some("markdown")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object MARKETINGSTATUS extends ALL_TYPES("MarketingStatus") {
    def display: Option[String] = Some("MarketingStatus")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object MEASURE extends ALL_TYPES("Measure") {
    def display: Option[String] = Some("Measure")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEASUREREPORT extends ALL_TYPES("MeasureReport") {
    def display: Option[String] = Some("MeasureReport")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDIA extends ALL_TYPES("Media") {
    def display: Option[String] = Some("Media")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICATION extends ALL_TYPES("Medication") {
    def display: Option[String] = Some("Medication")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICATIONADMINISTRATION extends ALL_TYPES("MedicationAdministration") {
    def display: Option[String] = Some("MedicationAdministration")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICATIONDISPENSE extends ALL_TYPES("MedicationDispense") {
    def display: Option[String] = Some("MedicationDispense")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICATIONKNOWLEDGE extends ALL_TYPES("MedicationKnowledge") {
    def display: Option[String] = Some("MedicationKnowledge")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICATIONREQUEST extends ALL_TYPES("MedicationRequest") {
    def display: Option[String] = Some("MedicationRequest")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICATIONSTATEMENT extends ALL_TYPES("MedicationStatement") {
    def display: Option[String] = Some("MedicationStatement")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICINALPRODUCT extends ALL_TYPES("MedicinalProduct") {
    def display: Option[String] = Some("MedicinalProduct")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICINALPRODUCTAUTHORIZATION extends ALL_TYPES("MedicinalProductAuthorization") {
    def display: Option[String] = Some("MedicinalProductAuthorization")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICINALPRODUCTCONTRAINDICATION extends ALL_TYPES("MedicinalProductContraindication") {
    def display: Option[String] = Some("MedicinalProductContraindication")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICINALPRODUCTINDICATION extends ALL_TYPES("MedicinalProductIndication") {
    def display: Option[String] = Some("MedicinalProductIndication")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICINALPRODUCTINGREDIENT extends ALL_TYPES("MedicinalProductIngredient") {
    def display: Option[String] = Some("MedicinalProductIngredient")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICINALPRODUCTINTERACTION extends ALL_TYPES("MedicinalProductInteraction") {
    def display: Option[String] = Some("MedicinalProductInteraction")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICINALPRODUCTMANUFACTURED extends ALL_TYPES("MedicinalProductManufactured") {
    def display: Option[String] = Some("MedicinalProductManufactured")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICINALPRODUCTPACKAGED extends ALL_TYPES("MedicinalProductPackaged") {
    def display: Option[String] = Some("MedicinalProductPackaged")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICINALPRODUCTPHARMACEUTICAL extends ALL_TYPES("MedicinalProductPharmaceutical") {
    def display: Option[String] = Some("MedicinalProductPharmaceutical")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICINALPRODUCTUNDESIRABLEEFFECT extends ALL_TYPES("MedicinalProductUndesirableEffect") {
    def display: Option[String] = Some("MedicinalProductUndesirableEffect")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MESSAGEDEFINITION extends ALL_TYPES("MessageDefinition") {
    def display: Option[String] = Some("MessageDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MESSAGEHEADER extends ALL_TYPES("MessageHeader") {
    def display: Option[String] = Some("MessageHeader")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object META extends ALL_TYPES("Meta") {
    def display: Option[String] = Some("Meta")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object MOLECULARSEQUENCE extends ALL_TYPES("MolecularSequence") {
    def display: Option[String] = Some("MolecularSequence")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MONEY extends ALL_TYPES("Money") {
    def display: Option[String] = Some("Money")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object MONEYQUANTITY extends ALL_TYPES("MoneyQuantity") {
    def display: Option[String] = Some("MoneyQuantity")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object NAMINGSYSTEM extends ALL_TYPES("NamingSystem") {
    def display: Option[String] = Some("NamingSystem")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object NARRATIVE extends ALL_TYPES("Narrative") {
    def display: Option[String] = Some("Narrative")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object NUTRITIONORDER extends ALL_TYPES("NutritionOrder") {
    def display: Option[String] = Some("NutritionOrder")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object OBSERVATION extends ALL_TYPES("Observation") {
    def display: Option[String] = Some("Observation")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object OBSERVATIONDEFINITION extends ALL_TYPES("ObservationDefinition") {
    def display: Option[String] = Some("ObservationDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object OID extends ALL_TYPES("oid") {
    def display: Option[String] = Some("oid")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object OPERATIONDEFINITION extends ALL_TYPES("OperationDefinition") {
    def display: Option[String] = Some("OperationDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object OPERATIONOUTCOME extends ALL_TYPES("OperationOutcome") {
    def display: Option[String] = Some("OperationOutcome")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object ORGANIZATION extends ALL_TYPES("Organization") {
    def display: Option[String] = Some("Organization")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object ORGANIZATIONAFFILIATION extends ALL_TYPES("OrganizationAffiliation") {
    def display: Option[String] = Some("OrganizationAffiliation")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object PARAMETERDEFINITION extends ALL_TYPES("ParameterDefinition") {
    def display: Option[String] = Some("ParameterDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object PARAMETERS extends ALL_TYPES("Parameters") {
    def display: Option[String] = Some("Parameters")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object PATIENT extends ALL_TYPES("Patient") {
    def display: Option[String] = Some("Patient")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object PAYMENTNOTICE extends ALL_TYPES("PaymentNotice") {
    def display: Option[String] = Some("PaymentNotice")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object PAYMENTRECONCILIATION extends ALL_TYPES("PaymentReconciliation") {
    def display: Option[String] = Some("PaymentReconciliation")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object PERIOD extends ALL_TYPES("Period") {
    def display: Option[String] = Some("Period")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object PERSON extends ALL_TYPES("Person") {
    def display: Option[String] = Some("Person")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object PLANDEFINITION extends ALL_TYPES("PlanDefinition") {
    def display: Option[String] = Some("PlanDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object POPULATION extends ALL_TYPES("Population") {
    def display: Option[String] = Some("Population")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object POSITIVEINT extends ALL_TYPES("positiveInt") {
    def display: Option[String] = Some("positiveInt")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object PRACTITIONER extends ALL_TYPES("Practitioner") {
    def display: Option[String] = Some("Practitioner")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object PRACTITIONERROLE extends ALL_TYPES("PractitionerRole") {
    def display: Option[String] = Some("PractitionerRole")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object PROCEDURE extends ALL_TYPES("Procedure") {
    def display: Option[String] = Some("Procedure")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object PRODCHARACTERISTIC extends ALL_TYPES("ProdCharacteristic") {
    def display: Option[String] = Some("ProdCharacteristic")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object PRODUCTSHELFLIFE extends ALL_TYPES("ProductShelfLife") {
    def display: Option[String] = Some("ProductShelfLife")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object PROVENANCE extends ALL_TYPES("Provenance") {
    def display: Option[String] = Some("Provenance")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object QUANTITY extends ALL_TYPES("Quantity") {
    def display: Option[String] = Some("Quantity")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object QUESTIONNAIRE extends ALL_TYPES("Questionnaire") {
    def display: Option[String] = Some("Questionnaire")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object QUESTIONNAIRERESPONSE extends ALL_TYPES("QuestionnaireResponse") {
    def display: Option[String] = Some("QuestionnaireResponse")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object RANGE extends ALL_TYPES("Range") {
    def display: Option[String] = Some("Range")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object RATIO extends ALL_TYPES("Ratio") {
    def display: Option[String] = Some("Ratio")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object REFERENCE extends ALL_TYPES("Reference") {
    def display: Option[String] = Some("Reference")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object RELATEDARTIFACT extends ALL_TYPES("RelatedArtifact") {
    def display: Option[String] = Some("RelatedArtifact")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object RELATEDPERSON extends ALL_TYPES("RelatedPerson") {
    def display: Option[String] = Some("RelatedPerson")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object REQUESTGROUP extends ALL_TYPES("RequestGroup") {
    def display: Option[String] = Some("RequestGroup")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object RESEARCHDEFINITION extends ALL_TYPES("ResearchDefinition") {
    def display: Option[String] = Some("ResearchDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object RESEARCHELEMENTDEFINITION extends ALL_TYPES("ResearchElementDefinition") {
    def display: Option[String] = Some("ResearchElementDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object RESEARCHSTUDY extends ALL_TYPES("ResearchStudy") {
    def display: Option[String] = Some("ResearchStudy")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object RESEARCHSUBJECT extends ALL_TYPES("ResearchSubject") {
    def display: Option[String] = Some("ResearchSubject")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object RESOURCE extends ALL_TYPES("Resource") {
    def display: Option[String] = Some("Resource")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object RISKASSESSMENT extends ALL_TYPES("RiskAssessment") {
    def display: Option[String] = Some("RiskAssessment")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object RISKEVIDENCESYNTHESIS extends ALL_TYPES("RiskEvidenceSynthesis") {
    def display: Option[String] = Some("RiskEvidenceSynthesis")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SAMPLEDDATA extends ALL_TYPES("SampledData") {
    def display: Option[String] = Some("SampledData")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object SCHEDULE extends ALL_TYPES("Schedule") {
    def display: Option[String] = Some("Schedule")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SEARCHPARAMETER extends ALL_TYPES("SearchParameter") {
    def display: Option[String] = Some("SearchParameter")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SERVICEREQUEST extends ALL_TYPES("ServiceRequest") {
    def display: Option[String] = Some("ServiceRequest")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SIGNATURE extends ALL_TYPES("Signature") {
    def display: Option[String] = Some("Signature")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object SIMPLEQUANTITY extends ALL_TYPES("SimpleQuantity") {
    def display: Option[String] = Some("SimpleQuantity")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object SLOT extends ALL_TYPES("Slot") {
    def display: Option[String] = Some("Slot")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SPECIMEN extends ALL_TYPES("Specimen") {
    def display: Option[String] = Some("Specimen")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SPECIMENDEFINITION extends ALL_TYPES("SpecimenDefinition") {
    def display: Option[String] = Some("SpecimenDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object STRING extends ALL_TYPES("string") {
    def display: Option[String] = Some("string")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object STRUCTUREDEFINITION extends ALL_TYPES("StructureDefinition") {
    def display: Option[String] = Some("StructureDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object STRUCTUREMAP extends ALL_TYPES("StructureMap") {
    def display: Option[String] = Some("StructureMap")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SUBSCRIPTION extends ALL_TYPES("Subscription") {
    def display: Option[String] = Some("Subscription")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SUBSTANCE extends ALL_TYPES("Substance") {
    def display: Option[String] = Some("Substance")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SUBSTANCEAMOUNT extends ALL_TYPES("SubstanceAmount") {
    def display: Option[String] = Some("SubstanceAmount")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object SUBSTANCENUCLEICACID extends ALL_TYPES("SubstanceNucleicAcid") {
    def display: Option[String] = Some("SubstanceNucleicAcid")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SUBSTANCEPOLYMER extends ALL_TYPES("SubstancePolymer") {
    def display: Option[String] = Some("SubstancePolymer")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SUBSTANCEPROTEIN extends ALL_TYPES("SubstanceProtein") {
    def display: Option[String] = Some("SubstanceProtein")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SUBSTANCEREFERENCEINFORMATION extends ALL_TYPES("SubstanceReferenceInformation") {
    def display: Option[String] = Some("SubstanceReferenceInformation")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SUBSTANCESOURCEMATERIAL extends ALL_TYPES("SubstanceSourceMaterial") {
    def display: Option[String] = Some("SubstanceSourceMaterial")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SUBSTANCESPECIFICATION extends ALL_TYPES("SubstanceSpecification") {
    def display: Option[String] = Some("SubstanceSpecification")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SUPPLYDELIVERY extends ALL_TYPES("SupplyDelivery") {
    def display: Option[String] = Some("SupplyDelivery")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SUPPLYREQUEST extends ALL_TYPES("SupplyRequest") {
    def display: Option[String] = Some("SupplyRequest")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object TASK extends ALL_TYPES("Task") {
    def display: Option[String] = Some("Task")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object TERMINOLOGYCAPABILITIES extends ALL_TYPES("TerminologyCapabilities") {
    def display: Option[String] = Some("TerminologyCapabilities")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object TESTREPORT extends ALL_TYPES("TestReport") {
    def display: Option[String] = Some("TestReport")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object TESTSCRIPT extends ALL_TYPES("TestScript") {
    def display: Option[String] = Some("TestScript")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object TIME extends ALL_TYPES("time") {
    def display: Option[String] = Some("time")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object TIMING extends ALL_TYPES("Timing") {
    def display: Option[String] = Some("Timing")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object TRIGGERDEFINITION extends ALL_TYPES("TriggerDefinition") {
    def display: Option[String] = Some("TriggerDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object TYPE extends ALL_TYPES("Type") {
    def display: Option[String] = Some("Type")
    def system: Option[String]  = Some("http://hl7.org/fhir/abstract-types")
  }
  case object UNSIGNEDINT extends ALL_TYPES("unsignedInt") {
    def display: Option[String] = Some("unsignedInt")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object URI extends ALL_TYPES("uri") {
    def display: Option[String] = Some("uri")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object URL extends ALL_TYPES("url") {
    def display: Option[String] = Some("url")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object USAGECONTEXT extends ALL_TYPES("UsageContext") {
    def display: Option[String] = Some("UsageContext")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object UUID extends ALL_TYPES("uuid") {
    def display: Option[String] = Some("uuid")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object VALUESET extends ALL_TYPES("ValueSet") {
    def display: Option[String] = Some("ValueSet")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object VERIFICATIONRESULT extends ALL_TYPES("VerificationResult") {
    def display: Option[String] = Some("VerificationResult")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object VISIONPRESCRIPTION extends ALL_TYPES("VisionPrescription") {
    def display: Option[String] = Some("VisionPrescription")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object XHTML extends ALL_TYPES("xhtml") {
    def display: Option[String] = Some("XHTML")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
}

sealed abstract class CONTACT_POINT_SYSTEM(override val entryName: String)
    extends EnumEntry
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object CONTACT_POINT_SYSTEM extends FhirEnum[CONTACT_POINT_SYSTEM] with FhirCirceEnum[CONTACT_POINT_SYSTEM] {
  val reference = "http://hl7.org/fhir/ValueSet/contact-point-system"
  val values    = findValues
  case object EMAIL extends CONTACT_POINT_SYSTEM("email") {
    def display: Option[String] = Some("Email")
    def system: Option[String]  = Some("http://hl7.org/fhir/contact-point-system")
  }
  case object FAX extends CONTACT_POINT_SYSTEM("fax") {
    def display: Option[String] = Some("Fax")
    def system: Option[String]  = Some("http://hl7.org/fhir/contact-point-system")
  }
  case object OTHER extends CONTACT_POINT_SYSTEM("other") {
    def display: Option[String] = Some("Other")
    def system: Option[String]  = Some("http://hl7.org/fhir/contact-point-system")
  }
  case object PAGER extends CONTACT_POINT_SYSTEM("pager") {
    def display: Option[String] = Some("Pager")
    def system: Option[String]  = Some("http://hl7.org/fhir/contact-point-system")
  }
  case object PHONE extends CONTACT_POINT_SYSTEM("phone") {
    def display: Option[String] = Some("Phone")
    def system: Option[String]  = Some("http://hl7.org/fhir/contact-point-system")
  }
  case object SMS extends CONTACT_POINT_SYSTEM("sms") {
    def display: Option[String] = Some("SMS")
    def system: Option[String]  = Some("http://hl7.org/fhir/contact-point-system")
  }
  case object URL extends CONTACT_POINT_SYSTEM("url") {
    def display: Option[String] = Some("URL")
    def system: Option[String]  = Some("http://hl7.org/fhir/contact-point-system")
  }
}

sealed abstract class CONTACT_POINT_USE(override val entryName: String)
    extends EnumEntry
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object CONTACT_POINT_USE extends FhirEnum[CONTACT_POINT_USE] with FhirCirceEnum[CONTACT_POINT_USE] {
  val reference = "http://hl7.org/fhir/ValueSet/contact-point-use"
  val values    = findValues
  case object HOME extends CONTACT_POINT_USE("home") {
    def display: Option[String] = Some("Home")
    def system: Option[String]  = Some("http://hl7.org/fhir/contact-point-use")
  }
  case object MOBILE extends CONTACT_POINT_USE("mobile") {
    def display: Option[String] = Some("Mobile")
    def system: Option[String]  = Some("http://hl7.org/fhir/contact-point-use")
  }
  case object OLD extends CONTACT_POINT_USE("old") {
    def display: Option[String] = Some("Old")
    def system: Option[String]  = Some("http://hl7.org/fhir/contact-point-use")
  }
  case object TEMP extends CONTACT_POINT_USE("temp") {
    def display: Option[String] = Some("Temp")
    def system: Option[String]  = Some("http://hl7.org/fhir/contact-point-use")
  }
  case object WORK extends CONTACT_POINT_USE("work") {
    def display: Option[String] = Some("Work")
    def system: Option[String]  = Some("http://hl7.org/fhir/contact-point-use")
  }
}

sealed abstract class CONTRIBUTOR_TYPE(override val entryName: String)
    extends EnumEntry
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object CONTRIBUTOR_TYPE extends FhirEnum[CONTRIBUTOR_TYPE] with FhirCirceEnum[CONTRIBUTOR_TYPE] {
  val reference = "http://hl7.org/fhir/ValueSet/contributor-type"
  val values    = findValues
  case object AUTHOR extends CONTRIBUTOR_TYPE("author") {
    def display: Option[String] = Some("Author")
    def system: Option[String]  = Some("http://hl7.org/fhir/contributor-type")
  }
  case object EDITOR extends CONTRIBUTOR_TYPE("editor") {
    def display: Option[String] = Some("Editor")
    def system: Option[String]  = Some("http://hl7.org/fhir/contributor-type")
  }
  case object ENDORSER extends CONTRIBUTOR_TYPE("endorser") {
    def display: Option[String] = Some("Endorser")
    def system: Option[String]  = Some("http://hl7.org/fhir/contributor-type")
  }
  case object REVIEWER extends CONTRIBUTOR_TYPE("reviewer") {
    def display: Option[String] = Some("Reviewer")
    def system: Option[String]  = Some("http://hl7.org/fhir/contributor-type")
  }
}

sealed abstract class DAYS_OF_WEEK(override val entryName: String)
    extends EnumEntry
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object DAYS_OF_WEEK extends FhirEnum[DAYS_OF_WEEK] with FhirCirceEnum[DAYS_OF_WEEK] {
  val reference = "http://hl7.org/fhir/ValueSet/days-of-week"
  val values    = findValues
  case object FRI extends DAYS_OF_WEEK("fri") {
    def display: Option[String] = Some("Friday")
    def system: Option[String]  = Some("http://hl7.org/fhir/days-of-week")
  }
  case object MON extends DAYS_OF_WEEK("mon") {
    def display: Option[String] = Some("Monday")
    def system: Option[String]  = Some("http://hl7.org/fhir/days-of-week")
  }
  case object SAT extends DAYS_OF_WEEK("sat") {
    def display: Option[String] = Some("Saturday")
    def system: Option[String]  = Some("http://hl7.org/fhir/days-of-week")
  }
  case object SUN extends DAYS_OF_WEEK("sun") {
    def display: Option[String] = Some("Sunday")
    def system: Option[String]  = Some("http://hl7.org/fhir/days-of-week")
  }
  case object THU extends DAYS_OF_WEEK("thu") {
    def display: Option[String] = Some("Thursday")
    def system: Option[String]  = Some("http://hl7.org/fhir/days-of-week")
  }
  case object TUE extends DAYS_OF_WEEK("tue") {
    def display: Option[String] = Some("Tuesday")
    def system: Option[String]  = Some("http://hl7.org/fhir/days-of-week")
  }
  case object WED extends DAYS_OF_WEEK("wed") {
    def display: Option[String] = Some("Wednesday")
    def system: Option[String]  = Some("http://hl7.org/fhir/days-of-week")
  }
}

sealed abstract class EVENT_TIMING(override val entryName: String)
    extends EnumEntry
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object EVENT_TIMING extends FhirEnum[EVENT_TIMING] with FhirCirceEnum[EVENT_TIMING] {
  val reference = "http://hl7.org/fhir/ValueSet/event-timing"
  val values    = findValues
  case object AC extends EVENT_TIMING("AC") {
    def display: Option[String] = Some("AC")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-TimingEvent")
  }
  case object ACD extends EVENT_TIMING("ACD") {
    def display: Option[String] = Some("ACD")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-TimingEvent")
  }
  case object ACM extends EVENT_TIMING("ACM") {
    def display: Option[String] = Some("ACM")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-TimingEvent")
  }
  case object ACV extends EVENT_TIMING("ACV") {
    def display: Option[String] = Some("ACV")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-TimingEvent")
  }
  case object AFT extends EVENT_TIMING("AFT") {
    def display: Option[String] = Some("Afternoon")
    def system: Option[String]  = Some("http://hl7.org/fhir/event-timing")
  }
  case object C extends EVENT_TIMING("C") {
    def display: Option[String] = Some("C")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-TimingEvent")
  }
  case object CD extends EVENT_TIMING("CD") {
    def display: Option[String] = Some("CD")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-TimingEvent")
  }
  case object CM extends EVENT_TIMING("CM") {
    def display: Option[String] = Some("CM")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-TimingEvent")
  }
  case object CV extends EVENT_TIMING("CV") {
    def display: Option[String] = Some("CV")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-TimingEvent")
  }
  case object EARLY_AFTERNOON extends EVENT_TIMING("AFT.early") {
    def display: Option[String] = Some("Early Afternoon")
    def system: Option[String]  = Some("http://hl7.org/fhir/event-timing")
  }
  case object EARLY_EVENING extends EVENT_TIMING("EVE.early") {
    def display: Option[String] = Some("Early Evening")
    def system: Option[String]  = Some("http://hl7.org/fhir/event-timing")
  }
  case object EARLY_MORNING extends EVENT_TIMING("MORN.early") {
    def display: Option[String] = Some("Early Morning")
    def system: Option[String]  = Some("http://hl7.org/fhir/event-timing")
  }
  case object EVE extends EVENT_TIMING("EVE") {
    def display: Option[String] = Some("Evening")
    def system: Option[String]  = Some("http://hl7.org/fhir/event-timing")
  }
  case object HS extends EVENT_TIMING("HS") {
    def display: Option[String] = Some("HS")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-TimingEvent")
  }
  case object LATE_AFTERNOON extends EVENT_TIMING("AFT.late") {
    def display: Option[String] = Some("Late Afternoon")
    def system: Option[String]  = Some("http://hl7.org/fhir/event-timing")
  }
  case object LATE_EVENING extends EVENT_TIMING("EVE.late") {
    def display: Option[String] = Some("Late Evening")
    def system: Option[String]  = Some("http://hl7.org/fhir/event-timing")
  }
  case object LATE_MORNING extends EVENT_TIMING("MORN.late") {
    def display: Option[String] = Some("Late Morning")
    def system: Option[String]  = Some("http://hl7.org/fhir/event-timing")
  }
  case object MORN extends EVENT_TIMING("MORN") {
    def display: Option[String] = Some("Morning")
    def system: Option[String]  = Some("http://hl7.org/fhir/event-timing")
  }
  case object NIGHT extends EVENT_TIMING("NIGHT") {
    def display: Option[String] = Some("Night")
    def system: Option[String]  = Some("http://hl7.org/fhir/event-timing")
  }
  case object NOON extends EVENT_TIMING("NOON") {
    def display: Option[String] = Some("Noon")
    def system: Option[String]  = Some("http://hl7.org/fhir/event-timing")
  }
  case object PC extends EVENT_TIMING("PC") {
    def display: Option[String] = Some("PC")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-TimingEvent")
  }
  case object PCD extends EVENT_TIMING("PCD") {
    def display: Option[String] = Some("PCD")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-TimingEvent")
  }
  case object PCM extends EVENT_TIMING("PCM") {
    def display: Option[String] = Some("PCM")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-TimingEvent")
  }
  case object PCV extends EVENT_TIMING("PCV") {
    def display: Option[String] = Some("PCV")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-TimingEvent")
  }
  case object PHS extends EVENT_TIMING("PHS") {
    def display: Option[String] = Some("After Sleep")
    def system: Option[String]  = Some("http://hl7.org/fhir/event-timing")
  }
  case object WAKE extends EVENT_TIMING("WAKE") {
    def display: Option[String] = Some("WAKE")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-TimingEvent")
  }
}

sealed abstract class EXPRESSION_LANGUAGE(override val entryName: String)
    extends EnumEntry
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object EXPRESSION_LANGUAGE extends FhirEnum[EXPRESSION_LANGUAGE] with EnumWithFallback[EXPRESSION_LANGUAGE] {
  val reference = "http://hl7.org/fhir/ValueSet/expression-language"
  val values    = findValues
  case object CQL extends EXPRESSION_LANGUAGE("text/cql") {
    def display: Option[String] = Some("CQL")
    def system: Option[String]  = Some("http://hl7.org/fhir/expression-language")
  }
  case object FHIRPATH extends EXPRESSION_LANGUAGE("text/fhirpath") {
    def display: Option[String] = Some("FHIRPath")
    def system: Option[String]  = Some("http://hl7.org/fhir/expression-language")
  }
  case object FHIR_QUERY extends EXPRESSION_LANGUAGE("application/x-fhir-query") {
    def display: Option[String] = Some("FHIR Query")
    def system: Option[String]  = Some("http://hl7.org/fhir/expression-language")
  }
  case class Other_(s: String) extends EXPRESSION_LANGUAGE(s) {
    def display: Option[String] = Some(s"Runtime value set extension ($s)")
    def system: Option[String]  = None
  }
  override def fallback = Other_.apply
}

sealed abstract class IDENTIFIER_USE(override val entryName: String)
    extends EnumEntry
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object IDENTIFIER_USE extends FhirEnum[IDENTIFIER_USE] with FhirCirceEnum[IDENTIFIER_USE] {
  val reference = "http://hl7.org/fhir/ValueSet/identifier-use"
  val values    = findValues
  case object OFFICIAL extends IDENTIFIER_USE("official") {
    def display: Option[String] = Some("Official")
    def system: Option[String]  = Some("http://hl7.org/fhir/identifier-use")
  }
  case object OLD extends IDENTIFIER_USE("old") {
    def display: Option[String] = Some("Old")
    def system: Option[String]  = Some("http://hl7.org/fhir/identifier-use")
  }
  case object SECONDARY extends IDENTIFIER_USE("secondary") {
    def display: Option[String] = Some("Secondary")
    def system: Option[String]  = Some("http://hl7.org/fhir/identifier-use")
  }
  case object TEMP extends IDENTIFIER_USE("temp") {
    def display: Option[String] = Some("Temp")
    def system: Option[String]  = Some("http://hl7.org/fhir/identifier-use")
  }
  case object USUAL extends IDENTIFIER_USE("usual") {
    def display: Option[String] = Some("Usual")
    def system: Option[String]  = Some("http://hl7.org/fhir/identifier-use")
  }
}

sealed abstract class LANGUAGES(override val entryName: String)
    extends EnumEntry
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object LANGUAGES extends FhirEnum[LANGUAGES] with EnumWithFallback[LANGUAGES] {
  val reference = "http://hl7.org/fhir/ValueSet/languages"
  val values    = findValues
  case object AR extends LANGUAGES("ar") {
    def display: Option[String] = Some("Arabic")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object BN extends LANGUAGES("bn") {
    def display: Option[String] = Some("Bengali")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object CS extends LANGUAGES("cs") {
    def display: Option[String] = Some("Czech")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object DA extends LANGUAGES("da") {
    def display: Option[String] = Some("Danish")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object DE extends LANGUAGES("de") {
    def display: Option[String] = Some("German")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object DE_AT extends LANGUAGES("de-AT") {
    def display: Option[String] = Some("German (Austria)")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object DE_CH extends LANGUAGES("de-CH") {
    def display: Option[String] = Some("German (Switzerland)")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object DE_DE extends LANGUAGES("de-DE") {
    def display: Option[String] = Some("German (Germany)")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object EL extends LANGUAGES("el") {
    def display: Option[String] = Some("Greek")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object EN extends LANGUAGES("en") {
    def display: Option[String] = Some("English")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object EN_AU extends LANGUAGES("en-AU") {
    def display: Option[String] = Some("English (Australia)")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object EN_CA extends LANGUAGES("en-CA") {
    def display: Option[String] = Some("English (Canada)")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object EN_GB extends LANGUAGES("en-GB") {
    def display: Option[String] = Some("English (Great Britain)")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object EN_IN extends LANGUAGES("en-IN") {
    def display: Option[String] = Some("English (India)")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object EN_NZ extends LANGUAGES("en-NZ") {
    def display: Option[String] = Some("English (New Zeland)")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object EN_SG extends LANGUAGES("en-SG") {
    def display: Option[String] = Some("English (Singapore)")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object EN_US extends LANGUAGES("en-US") {
    def display: Option[String] = Some("English (United States)")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object ES extends LANGUAGES("es") {
    def display: Option[String] = Some("Spanish")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object ES_AR extends LANGUAGES("es-AR") {
    def display: Option[String] = Some("Spanish (Argentina)")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object ES_ES extends LANGUAGES("es-ES") {
    def display: Option[String] = Some("Spanish (Spain)")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object ES_UY extends LANGUAGES("es-UY") {
    def display: Option[String] = Some("Spanish (Uruguay)")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object FI extends LANGUAGES("fi") {
    def display: Option[String] = Some("Finnish")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object FR extends LANGUAGES("fr") {
    def display: Option[String] = Some("French")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object FR_BE extends LANGUAGES("fr-BE") {
    def display: Option[String] = Some("French (Belgium)")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object FR_CH extends LANGUAGES("fr-CH") {
    def display: Option[String] = Some("French (Switzerland)")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object FR_FR extends LANGUAGES("fr-FR") {
    def display: Option[String] = Some("French (France)")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object FY extends LANGUAGES("fy") {
    def display: Option[String] = Some("Frysian")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object FY_NL extends LANGUAGES("fy-NL") {
    def display: Option[String] = Some("Frysian (Netherlands)")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object HI extends LANGUAGES("hi") {
    def display: Option[String] = Some("Hindi")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object HR extends LANGUAGES("hr") {
    def display: Option[String] = Some("Croatian")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object IT extends LANGUAGES("it") {
    def display: Option[String] = Some("Italian")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object IT_CH extends LANGUAGES("it-CH") {
    def display: Option[String] = Some("Italian (Switzerland)")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object IT_IT extends LANGUAGES("it-IT") {
    def display: Option[String] = Some("Italian (Italy)")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object JA extends LANGUAGES("ja") {
    def display: Option[String] = Some("Japanese")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object KO extends LANGUAGES("ko") {
    def display: Option[String] = Some("Korean")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object NL extends LANGUAGES("nl") {
    def display: Option[String] = Some("Dutch")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object NL_BE extends LANGUAGES("nl-BE") {
    def display: Option[String] = Some("Dutch (Belgium)")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object NL_NL extends LANGUAGES("nl-NL") {
    def display: Option[String] = Some("Dutch (Netherlands)")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object NO extends LANGUAGES("no") {
    def display: Option[String] = Some("Norwegian")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object NO_NO extends LANGUAGES("no-NO") {
    def display: Option[String] = Some("Norwegian (Norway)")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object PA extends LANGUAGES("pa") {
    def display: Option[String] = Some("Punjabi")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object PL extends LANGUAGES("pl") {
    def display: Option[String] = Some("Polish")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object PT extends LANGUAGES("pt") {
    def display: Option[String] = Some("Portuguese")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object PT_BR extends LANGUAGES("pt-BR") {
    def display: Option[String] = Some("Portuguese (Brazil)")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object RU extends LANGUAGES("ru") {
    def display: Option[String] = Some("Russian")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object RU_RU extends LANGUAGES("ru-RU") {
    def display: Option[String] = Some("Russian (Russia)")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object SR extends LANGUAGES("sr") {
    def display: Option[String] = Some("Serbian")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object SR_RS extends LANGUAGES("sr-RS") {
    def display: Option[String] = Some("Serbian (Serbia)")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object SV extends LANGUAGES("sv") {
    def display: Option[String] = Some("Swedish")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object SV_SE extends LANGUAGES("sv-SE") {
    def display: Option[String] = Some("Swedish (Sweden)")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object TE extends LANGUAGES("te") {
    def display: Option[String] = Some("Telegu")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object ZH extends LANGUAGES("zh") {
    def display: Option[String] = Some("Chinese")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object ZH_CN extends LANGUAGES("zh-CN") {
    def display: Option[String] = Some("Chinese (China)")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object ZH_HK extends LANGUAGES("zh-HK") {
    def display: Option[String] = Some("Chinese (Hong Kong)")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object ZH_SG extends LANGUAGES("zh-SG") {
    def display: Option[String] = Some("Chinese (Singapore)")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case object ZH_TW extends LANGUAGES("zh-TW") {
    def display: Option[String] = Some("Chinese (Taiwan)")
    def system: Option[String]  = Some("urn:ietf:bcp:47")
  }
  case class Other_(s: String) extends LANGUAGES(s) {
    def display: Option[String] = Some(s"Runtime value set extension ($s)")
    def system: Option[String]  = None
  }
  override def fallback = Other_.apply
}

sealed abstract class NAME_USE(override val entryName: String)
    extends EnumEntry
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object NAME_USE extends FhirEnum[NAME_USE] with FhirCirceEnum[NAME_USE] {
  val reference = "http://hl7.org/fhir/ValueSet/name-use"
  val values    = findValues
  case object ANONYMOUS extends NAME_USE("anonymous") {
    def display: Option[String] = Some("Anonymous")
    def system: Option[String]  = Some("http://hl7.org/fhir/name-use")
  }
  case object MAIDEN extends NAME_USE("maiden") {
    def display: Option[String] = Some("Name changed for Marriage")
    def system: Option[String]  = Some("http://hl7.org/fhir/name-use")
  }
  case object NICKNAME extends NAME_USE("nickname") {
    def display: Option[String] = Some("Nickname")
    def system: Option[String]  = Some("http://hl7.org/fhir/name-use")
  }
  case object OFFICIAL extends NAME_USE("official") {
    def display: Option[String] = Some("Official")
    def system: Option[String]  = Some("http://hl7.org/fhir/name-use")
  }
  case object OLD extends NAME_USE("old") {
    def display: Option[String] = Some("Old")
    def system: Option[String]  = Some("http://hl7.org/fhir/name-use")
  }
  case object TEMP extends NAME_USE("temp") {
    def display: Option[String] = Some("Temp")
    def system: Option[String]  = Some("http://hl7.org/fhir/name-use")
  }
  case object USUAL extends NAME_USE("usual") {
    def display: Option[String] = Some("Usual")
    def system: Option[String]  = Some("http://hl7.org/fhir/name-use")
  }
}

sealed abstract class OPERATION_PARAMETER_USE(override val entryName: String)
    extends EnumEntry
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object OPERATION_PARAMETER_USE extends FhirEnum[OPERATION_PARAMETER_USE] with FhirCirceEnum[OPERATION_PARAMETER_USE] {
  val reference = "http://hl7.org/fhir/ValueSet/operation-parameter-use"
  val values    = findValues
  case object IN extends OPERATION_PARAMETER_USE("in") {
    def display: Option[String] = Some("In")
    def system: Option[String]  = Some("http://hl7.org/fhir/operation-parameter-use")
  }
  case object OUT extends OPERATION_PARAMETER_USE("out") {
    def display: Option[String] = Some("Out")
    def system: Option[String]  = Some("http://hl7.org/fhir/operation-parameter-use")
  }
}

sealed abstract class QUANTITY_COMPARATOR(override val entryName: String)
    extends EnumEntry
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object QUANTITY_COMPARATOR extends FhirEnum[QUANTITY_COMPARATOR] with FhirCirceEnum[QUANTITY_COMPARATOR] {
  val reference = "http://hl7.org/fhir/ValueSet/quantity-comparator"
  val values    = findValues
  case object GREATER_OR_EQUAL_TO extends QUANTITY_COMPARATOR(">=") {
    def display: Option[String] = Some("Greater or Equal to")
    def system: Option[String]  = Some("http://hl7.org/fhir/quantity-comparator")
  }
  case object GREATER_THAN extends QUANTITY_COMPARATOR(">") {
    def display: Option[String] = Some("Greater than")
    def system: Option[String]  = Some("http://hl7.org/fhir/quantity-comparator")
  }
  case object LESS_OR_EQUAL_TO extends QUANTITY_COMPARATOR("<=") {
    def display: Option[String] = Some("Less or Equal to")
    def system: Option[String]  = Some("http://hl7.org/fhir/quantity-comparator")
  }
  case object LESS_THAN extends QUANTITY_COMPARATOR("<") {
    def display: Option[String] = Some("Less than")
    def system: Option[String]  = Some("http://hl7.org/fhir/quantity-comparator")
  }
}

sealed abstract class RELATED_ARTIFACT_TYPE(override val entryName: String)
    extends EnumEntry
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object RELATED_ARTIFACT_TYPE extends FhirEnum[RELATED_ARTIFACT_TYPE] with FhirCirceEnum[RELATED_ARTIFACT_TYPE] {
  val reference = "http://hl7.org/fhir/ValueSet/related-artifact-type"
  val values    = findValues
  case object CITATION extends RELATED_ARTIFACT_TYPE("citation") {
    def display: Option[String] = Some("Citation")
    def system: Option[String]  = Some("http://hl7.org/fhir/related-artifact-type")
  }
  case object COMPOSED_OF extends RELATED_ARTIFACT_TYPE("composed-of") {
    def display: Option[String] = Some("Composed Of")
    def system: Option[String]  = Some("http://hl7.org/fhir/related-artifact-type")
  }
  case object DEPENDS_ON extends RELATED_ARTIFACT_TYPE("depends-on") {
    def display: Option[String] = Some("Depends On")
    def system: Option[String]  = Some("http://hl7.org/fhir/related-artifact-type")
  }
  case object DERIVED_FROM extends RELATED_ARTIFACT_TYPE("derived-from") {
    def display: Option[String] = Some("Derived From")
    def system: Option[String]  = Some("http://hl7.org/fhir/related-artifact-type")
  }
  case object DOCUMENTATION extends RELATED_ARTIFACT_TYPE("documentation") {
    def display: Option[String] = Some("Documentation")
    def system: Option[String]  = Some("http://hl7.org/fhir/related-artifact-type")
  }
  case object JUSTIFICATION extends RELATED_ARTIFACT_TYPE("justification") {
    def display: Option[String] = Some("Justification")
    def system: Option[String]  = Some("http://hl7.org/fhir/related-artifact-type")
  }
  case object PREDECESSOR extends RELATED_ARTIFACT_TYPE("predecessor") {
    def display: Option[String] = Some("Predecessor")
    def system: Option[String]  = Some("http://hl7.org/fhir/related-artifact-type")
  }
  case object SUCCESSOR extends RELATED_ARTIFACT_TYPE("successor") {
    def display: Option[String] = Some("Successor")
    def system: Option[String]  = Some("http://hl7.org/fhir/related-artifact-type")
  }
}

sealed abstract class SORT_DIRECTION(override val entryName: String)
    extends EnumEntry
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object SORT_DIRECTION extends FhirEnum[SORT_DIRECTION] with FhirCirceEnum[SORT_DIRECTION] {
  val reference = "http://hl7.org/fhir/ValueSet/sort-direction"
  val values    = findValues
  case object ASCENDING extends SORT_DIRECTION("ascending") {
    def display: Option[String] = Some("Ascending")
    def system: Option[String]  = Some("http://hl7.org/fhir/sort-direction")
  }
  case object DESCENDING extends SORT_DIRECTION("descending") {
    def display: Option[String] = Some("Descending")
    def system: Option[String]  = Some("http://hl7.org/fhir/sort-direction")
  }
}

sealed abstract class TRIGGER_TYPE(override val entryName: String)
    extends EnumEntry
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object TRIGGER_TYPE extends FhirEnum[TRIGGER_TYPE] with FhirCirceEnum[TRIGGER_TYPE] {
  val reference = "http://hl7.org/fhir/ValueSet/trigger-type"
  val values    = findValues
  case object DATA_ACCESSED extends TRIGGER_TYPE("data-accessed") {
    def display: Option[String] = Some("Data Accessed")
    def system: Option[String]  = Some("http://hl7.org/fhir/trigger-type")
  }
  case object DATA_ACCESS_ENDED extends TRIGGER_TYPE("data-access-ended") {
    def display: Option[String] = Some("Data Access Ended")
    def system: Option[String]  = Some("http://hl7.org/fhir/trigger-type")
  }
  case object DATA_ADDED extends TRIGGER_TYPE("data-added") {
    def display: Option[String] = Some("Data Added")
    def system: Option[String]  = Some("http://hl7.org/fhir/trigger-type")
  }
  case object DATA_CHANGED extends TRIGGER_TYPE("data-changed") {
    def display: Option[String] = Some("Data Changed")
    def system: Option[String]  = Some("http://hl7.org/fhir/trigger-type")
  }
  case object DATA_REMOVED extends TRIGGER_TYPE("data-removed") {
    def display: Option[String] = Some("Data Removed")
    def system: Option[String]  = Some("http://hl7.org/fhir/trigger-type")
  }
  case object DATA_UPDATED extends TRIGGER_TYPE("data-modified") {
    def display: Option[String] = Some("Data Updated")
    def system: Option[String]  = Some("http://hl7.org/fhir/trigger-type")
  }
  case object NAMED_EVENT extends TRIGGER_TYPE("named-event") {
    def display: Option[String] = Some("Named Event")
    def system: Option[String]  = Some("http://hl7.org/fhir/trigger-type")
  }
  case object PERIODIC extends TRIGGER_TYPE("periodic") {
    def display: Option[String] = Some("Periodic")
    def system: Option[String]  = Some("http://hl7.org/fhir/trigger-type")
  }
}

sealed abstract class UNITS_OF_TIME(override val entryName: String)
    extends EnumEntry
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object UNITS_OF_TIME extends FhirEnum[UNITS_OF_TIME] with FhirCirceEnum[UNITS_OF_TIME] {
  val reference = "http://hl7.org/fhir/ValueSet/units-of-time"
  val values    = findValues
  case object A extends UNITS_OF_TIME("a") {
    def display: Option[String] = Some("year")
    def system: Option[String]  = Some("http://unitsofmeasure.org")
  }
  case object D extends UNITS_OF_TIME("d") {
    def display: Option[String] = Some("day")
    def system: Option[String]  = Some("http://unitsofmeasure.org")
  }
  case object H extends UNITS_OF_TIME("h") {
    def display: Option[String] = Some("hour")
    def system: Option[String]  = Some("http://unitsofmeasure.org")
  }
  case object MIN extends UNITS_OF_TIME("min") {
    def display: Option[String] = Some("minute")
    def system: Option[String]  = Some("http://unitsofmeasure.org")
  }
  case object MO extends UNITS_OF_TIME("mo") {
    def display: Option[String] = Some("month")
    def system: Option[String]  = Some("http://unitsofmeasure.org")
  }
  case object S extends UNITS_OF_TIME("s") {
    def display: Option[String] = Some("second")
    def system: Option[String]  = Some("http://unitsofmeasure.org")
  }
  case object WK extends UNITS_OF_TIME("wk") {
    def display: Option[String] = Some("week")
    def system: Option[String]  = Some("http://unitsofmeasure.org")
  }
}
