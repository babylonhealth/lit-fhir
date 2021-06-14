package com.babylonhealth.lit.core

import scala.reflect.ClassTag
import scala.util.{ Success, Try }

import io.circe.{ Decoder, DecodingFailure, Encoder, HCursor, Json }

import com.babylonhealth.lit.core.EnumBase
import com.babylonhealth.lit.core.model.Coding

trait ToCodingAble extends EnumBase {
  def name: String
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(name), display = display))
}

trait EType[A <: ToCodingAble](val reference: String) {
  def values: Array[A]
  lazy val withName: String => A = values.map(x => x.name -> x).toMap
  implicit val encoder: Encoder[A] = Encoder.instance[A](Json fromString _.name)
  implicit val decoder: Decoder[A] =
    Decoder.instance[A](c => c.as[String].flatMap(s => Try(withName(s)).toEither.left.map { _ =>
      val options =
        if (values.size <= 10) s" Valid values are: '${values.map(_.name).mkString(", ")}'."
        else ""
      DecodingFailure(s"'$s' is not in $reference.$options", c.history)
    }))
}

trait ETypeWithFallback[A <: ToCodingAble: ClassTag](override val reference: String) extends EType[A] {
  def fromOrdinal(i: Int): A
  // This is so, so stupid.. but there isn't any way to override the name of an enum, or to list the unparameterised
  // values if a single parameterised one exists. Anyway, this works as long as 'Other' is the last case.
  override lazy val values: Array[A] =
    (0 to Int.MaxValue-1).view.map(i => Try(fromOrdinal(i))).takeWhile(_.isSuccess).collect{ case Success(v) => v }.toArray
  def fallback(s: String): A
  override lazy val withName: String => A = values.map(x => x.name -> x).toMap.withDefault(fallback)
}
enum ADDRESS_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case BOTH extends BOTH("both", Some("Postal & Physical"), Some("http://hl7.org/fhir/address-type"))
  case PHYSICAL extends PHYSICAL("physical", Some("Physical"), Some("http://hl7.org/fhir/address-type"))
  case POSTAL extends POSTAL("postal", Some("Postal"), Some("http://hl7.org/fhir/address-type"))
}
object ADDRESS_TYPE extends EType[ADDRESS_TYPE]("http://hl7.org/fhir/ValueSet/address-type") 


enum ADDRESS_USE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case BILLING extends BILLING("billing", Some("Billing"), Some("http://hl7.org/fhir/address-use"))
  case HOME extends HOME("home", Some("Home"), Some("http://hl7.org/fhir/address-use"))
  case OLD extends OLD("old", Some("Old / Incorrect"), Some("http://hl7.org/fhir/address-use"))
  case TEMP extends TEMP("temp", Some("Temporary"), Some("http://hl7.org/fhir/address-use"))
  case WORK extends WORK("work", Some("Work"), Some("http://hl7.org/fhir/address-use"))
}
object ADDRESS_USE extends EType[ADDRESS_USE]("http://hl7.org/fhir/ValueSet/address-use") 


enum ALL_TYPES(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ACCOUNT extends ACCOUNT("Account", Some("Account"), Some("http://hl7.org/fhir/resource-types"))
  case ACTIVITYDEFINITION extends ACTIVITYDEFINITION("ActivityDefinition", Some("ActivityDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case ADDRESS extends ADDRESS("Address", Some("Address"), Some("http://hl7.org/fhir/data-types"))
  case ADVERSEEVENT extends ADVERSEEVENT("AdverseEvent", Some("AdverseEvent"), Some("http://hl7.org/fhir/resource-types"))
  case AGE extends AGE("Age", Some("Age"), Some("http://hl7.org/fhir/data-types"))
  case ALLERGYINTOLERANCE extends ALLERGYINTOLERANCE("AllergyIntolerance", Some("AllergyIntolerance"), Some("http://hl7.org/fhir/resource-types"))
  case ANNOTATION extends ANNOTATION("Annotation", Some("Annotation"), Some("http://hl7.org/fhir/data-types"))
  case ANY extends ANY("Any", Some("Any"), Some("http://hl7.org/fhir/abstract-types"))
  case APPOINTMENT extends APPOINTMENT("Appointment", Some("Appointment"), Some("http://hl7.org/fhir/resource-types"))
  case APPOINTMENTRESPONSE extends APPOINTMENTRESPONSE("AppointmentResponse", Some("AppointmentResponse"), Some("http://hl7.org/fhir/resource-types"))
  case ATTACHMENT extends ATTACHMENT("Attachment", Some("Attachment"), Some("http://hl7.org/fhir/data-types"))
  case AUDITEVENT extends AUDITEVENT("AuditEvent", Some("AuditEvent"), Some("http://hl7.org/fhir/resource-types"))
  case BACKBONEELEMENT extends BACKBONEELEMENT("BackboneElement", Some("BackboneElement"), Some("http://hl7.org/fhir/data-types"))
  case BASE64BINARY extends BASE64BINARY("base64Binary", Some("base64Binary"), Some("http://hl7.org/fhir/data-types"))
  case BASIC extends BASIC("Basic", Some("Basic"), Some("http://hl7.org/fhir/resource-types"))
  case BINARY extends BINARY("Binary", Some("Binary"), Some("http://hl7.org/fhir/resource-types"))
  case BIOLOGICALLYDERIVEDPRODUCT extends BIOLOGICALLYDERIVEDPRODUCT("BiologicallyDerivedProduct", Some("BiologicallyDerivedProduct"), Some("http://hl7.org/fhir/resource-types"))
  case BODYSTRUCTURE extends BODYSTRUCTURE("BodyStructure", Some("BodyStructure"), Some("http://hl7.org/fhir/resource-types"))
  case BOOLEAN extends BOOLEAN("boolean", Some("boolean"), Some("http://hl7.org/fhir/data-types"))
  case BUNDLE extends BUNDLE("Bundle", Some("Bundle"), Some("http://hl7.org/fhir/resource-types"))
  case CANONICAL extends CANONICAL("canonical", Some("canonical"), Some("http://hl7.org/fhir/data-types"))
  case CAPABILITYSTATEMENT extends CAPABILITYSTATEMENT("CapabilityStatement", Some("CapabilityStatement"), Some("http://hl7.org/fhir/resource-types"))
  case CAREPLAN extends CAREPLAN("CarePlan", Some("CarePlan"), Some("http://hl7.org/fhir/resource-types"))
  case CARETEAM extends CARETEAM("CareTeam", Some("CareTeam"), Some("http://hl7.org/fhir/resource-types"))
  case CATALOGENTRY extends CATALOGENTRY("CatalogEntry", Some("CatalogEntry"), Some("http://hl7.org/fhir/resource-types"))
  case CHARGEITEM extends CHARGEITEM("ChargeItem", Some("ChargeItem"), Some("http://hl7.org/fhir/resource-types"))
  case CHARGEITEMDEFINITION extends CHARGEITEMDEFINITION("ChargeItemDefinition", Some("ChargeItemDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case CLAIM extends CLAIM("Claim", Some("Claim"), Some("http://hl7.org/fhir/resource-types"))
  case CLAIMRESPONSE extends CLAIMRESPONSE("ClaimResponse", Some("ClaimResponse"), Some("http://hl7.org/fhir/resource-types"))
  case CLINICALIMPRESSION extends CLINICALIMPRESSION("ClinicalImpression", Some("ClinicalImpression"), Some("http://hl7.org/fhir/resource-types"))
  case CODE extends CODE("code", Some("code"), Some("http://hl7.org/fhir/data-types"))
  case CODEABLECONCEPT extends CODEABLECONCEPT("CodeableConcept", Some("CodeableConcept"), Some("http://hl7.org/fhir/data-types"))
  case CODESYSTEM extends CODESYSTEM("CodeSystem", Some("CodeSystem"), Some("http://hl7.org/fhir/resource-types"))
  case CODING extends CODING("Coding", Some("Coding"), Some("http://hl7.org/fhir/data-types"))
  case COMMUNICATION extends COMMUNICATION("Communication", Some("Communication"), Some("http://hl7.org/fhir/resource-types"))
  case COMMUNICATIONREQUEST extends COMMUNICATIONREQUEST("CommunicationRequest", Some("CommunicationRequest"), Some("http://hl7.org/fhir/resource-types"))
  case COMPARTMENTDEFINITION extends COMPARTMENTDEFINITION("CompartmentDefinition", Some("CompartmentDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case COMPOSITION extends COMPOSITION("Composition", Some("Composition"), Some("http://hl7.org/fhir/resource-types"))
  case CONCEPTMAP extends CONCEPTMAP("ConceptMap", Some("ConceptMap"), Some("http://hl7.org/fhir/resource-types"))
  case CONDITION extends CONDITION("Condition", Some("Condition"), Some("http://hl7.org/fhir/resource-types"))
  case CONSENT extends CONSENT("Consent", Some("Consent"), Some("http://hl7.org/fhir/resource-types"))
  case CONTACTDETAIL extends CONTACTDETAIL("ContactDetail", Some("ContactDetail"), Some("http://hl7.org/fhir/data-types"))
  case CONTACTPOINT extends CONTACTPOINT("ContactPoint", Some("ContactPoint"), Some("http://hl7.org/fhir/data-types"))
  case CONTRACT extends CONTRACT("Contract", Some("Contract"), Some("http://hl7.org/fhir/resource-types"))
  case CONTRIBUTOR extends CONTRIBUTOR("Contributor", Some("Contributor"), Some("http://hl7.org/fhir/data-types"))
  case COUNT extends COUNT("Count", Some("Count"), Some("http://hl7.org/fhir/data-types"))
  case COVERAGE extends COVERAGE("Coverage", Some("Coverage"), Some("http://hl7.org/fhir/resource-types"))
  case COVERAGEELIGIBILITYREQUEST extends COVERAGEELIGIBILITYREQUEST("CoverageEligibilityRequest", Some("CoverageEligibilityRequest"), Some("http://hl7.org/fhir/resource-types"))
  case COVERAGEELIGIBILITYRESPONSE extends COVERAGEELIGIBILITYRESPONSE("CoverageEligibilityResponse", Some("CoverageEligibilityResponse"), Some("http://hl7.org/fhir/resource-types"))
  case DATAREQUIREMENT extends DATAREQUIREMENT("DataRequirement", Some("DataRequirement"), Some("http://hl7.org/fhir/data-types"))
  case DATE extends DATE("date", Some("date"), Some("http://hl7.org/fhir/data-types"))
  case DATETIME extends DATETIME("dateTime", Some("dateTime"), Some("http://hl7.org/fhir/data-types"))
  case DECIMAL extends DECIMAL("decimal", Some("decimal"), Some("http://hl7.org/fhir/data-types"))
  case DETECTEDISSUE extends DETECTEDISSUE("DetectedIssue", Some("DetectedIssue"), Some("http://hl7.org/fhir/resource-types"))
  case DEVICE extends DEVICE("Device", Some("Device"), Some("http://hl7.org/fhir/resource-types"))
  case DEVICEDEFINITION extends DEVICEDEFINITION("DeviceDefinition", Some("DeviceDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case DEVICEMETRIC extends DEVICEMETRIC("DeviceMetric", Some("DeviceMetric"), Some("http://hl7.org/fhir/resource-types"))
  case DEVICEREQUEST extends DEVICEREQUEST("DeviceRequest", Some("DeviceRequest"), Some("http://hl7.org/fhir/resource-types"))
  case DEVICEUSESTATEMENT extends DEVICEUSESTATEMENT("DeviceUseStatement", Some("DeviceUseStatement"), Some("http://hl7.org/fhir/resource-types"))
  case DIAGNOSTICREPORT extends DIAGNOSTICREPORT("DiagnosticReport", Some("DiagnosticReport"), Some("http://hl7.org/fhir/resource-types"))
  case DISTANCE extends DISTANCE("Distance", Some("Distance"), Some("http://hl7.org/fhir/data-types"))
  case DOCUMENTMANIFEST extends DOCUMENTMANIFEST("DocumentManifest", Some("DocumentManifest"), Some("http://hl7.org/fhir/resource-types"))
  case DOCUMENTREFERENCE extends DOCUMENTREFERENCE("DocumentReference", Some("DocumentReference"), Some("http://hl7.org/fhir/resource-types"))
  case DOMAINRESOURCE extends DOMAINRESOURCE("DomainResource", Some("DomainResource"), Some("http://hl7.org/fhir/resource-types"))
  case DOSAGE extends DOSAGE("Dosage", Some("Dosage"), Some("http://hl7.org/fhir/data-types"))
  case DURATION extends DURATION("Duration", Some("Duration"), Some("http://hl7.org/fhir/data-types"))
  case EFFECTEVIDENCESYNTHESIS extends EFFECTEVIDENCESYNTHESIS("EffectEvidenceSynthesis", Some("EffectEvidenceSynthesis"), Some("http://hl7.org/fhir/resource-types"))
  case ELEMENT extends ELEMENT("Element", Some("Element"), Some("http://hl7.org/fhir/data-types"))
  case ELEMENTDEFINITION extends ELEMENTDEFINITION("ElementDefinition", Some("ElementDefinition"), Some("http://hl7.org/fhir/data-types"))
  case ENCOUNTER extends ENCOUNTER("Encounter", Some("Encounter"), Some("http://hl7.org/fhir/resource-types"))
  case ENDPOINT extends ENDPOINT("Endpoint", Some("Endpoint"), Some("http://hl7.org/fhir/resource-types"))
  case ENROLLMENTREQUEST extends ENROLLMENTREQUEST("EnrollmentRequest", Some("EnrollmentRequest"), Some("http://hl7.org/fhir/resource-types"))
  case ENROLLMENTRESPONSE extends ENROLLMENTRESPONSE("EnrollmentResponse", Some("EnrollmentResponse"), Some("http://hl7.org/fhir/resource-types"))
  case EPISODEOFCARE extends EPISODEOFCARE("EpisodeOfCare", Some("EpisodeOfCare"), Some("http://hl7.org/fhir/resource-types"))
  case EVENTDEFINITION extends EVENTDEFINITION("EventDefinition", Some("EventDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case EVIDENCE extends EVIDENCE("Evidence", Some("Evidence"), Some("http://hl7.org/fhir/resource-types"))
  case EVIDENCEVARIABLE extends EVIDENCEVARIABLE("EvidenceVariable", Some("EvidenceVariable"), Some("http://hl7.org/fhir/resource-types"))
  case EXAMPLESCENARIO extends EXAMPLESCENARIO("ExampleScenario", Some("ExampleScenario"), Some("http://hl7.org/fhir/resource-types"))
  case EXPLANATIONOFBENEFIT extends EXPLANATIONOFBENEFIT("ExplanationOfBenefit", Some("ExplanationOfBenefit"), Some("http://hl7.org/fhir/resource-types"))
  case EXPRESSION extends EXPRESSION("Expression", Some("Expression"), Some("http://hl7.org/fhir/data-types"))
  case EXTENSION extends EXTENSION("Extension", Some("Extension"), Some("http://hl7.org/fhir/data-types"))
  case FAMILYMEMBERHISTORY extends FAMILYMEMBERHISTORY("FamilyMemberHistory", Some("FamilyMemberHistory"), Some("http://hl7.org/fhir/resource-types"))
  case FLAG extends FLAG("Flag", Some("Flag"), Some("http://hl7.org/fhir/resource-types"))
  case GOAL extends GOAL("Goal", Some("Goal"), Some("http://hl7.org/fhir/resource-types"))
  case GRAPHDEFINITION extends GRAPHDEFINITION("GraphDefinition", Some("GraphDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case GROUP extends GROUP("Group", Some("Group"), Some("http://hl7.org/fhir/resource-types"))
  case GUIDANCERESPONSE extends GUIDANCERESPONSE("GuidanceResponse", Some("GuidanceResponse"), Some("http://hl7.org/fhir/resource-types"))
  case HEALTHCARESERVICE extends HEALTHCARESERVICE("HealthcareService", Some("HealthcareService"), Some("http://hl7.org/fhir/resource-types"))
  case HUMANNAME extends HUMANNAME("HumanName", Some("HumanName"), Some("http://hl7.org/fhir/data-types"))
  case ID extends ID("id", Some("id"), Some("http://hl7.org/fhir/data-types"))
  case IDENTIFIER extends IDENTIFIER("Identifier", Some("Identifier"), Some("http://hl7.org/fhir/data-types"))
  case IMAGINGSTUDY extends IMAGINGSTUDY("ImagingStudy", Some("ImagingStudy"), Some("http://hl7.org/fhir/resource-types"))
  case IMMUNIZATION extends IMMUNIZATION("Immunization", Some("Immunization"), Some("http://hl7.org/fhir/resource-types"))
  case IMMUNIZATIONEVALUATION extends IMMUNIZATIONEVALUATION("ImmunizationEvaluation", Some("ImmunizationEvaluation"), Some("http://hl7.org/fhir/resource-types"))
  case IMMUNIZATIONRECOMMENDATION extends IMMUNIZATIONRECOMMENDATION("ImmunizationRecommendation", Some("ImmunizationRecommendation"), Some("http://hl7.org/fhir/resource-types"))
  case IMPLEMENTATIONGUIDE extends IMPLEMENTATIONGUIDE("ImplementationGuide", Some("ImplementationGuide"), Some("http://hl7.org/fhir/resource-types"))
  case INSTANT extends INSTANT("instant", Some("instant"), Some("http://hl7.org/fhir/data-types"))
  case INSURANCEPLAN extends INSURANCEPLAN("InsurancePlan", Some("InsurancePlan"), Some("http://hl7.org/fhir/resource-types"))
  case INTEGER extends INTEGER("integer", Some("integer"), Some("http://hl7.org/fhir/data-types"))
  case INVOICE extends INVOICE("Invoice", Some("Invoice"), Some("http://hl7.org/fhir/resource-types"))
  case LIBRARY extends LIBRARY("Library", Some("Library"), Some("http://hl7.org/fhir/resource-types"))
  case LINKAGE extends LINKAGE("Linkage", Some("Linkage"), Some("http://hl7.org/fhir/resource-types"))
  case LIST extends LIST("List", Some("List"), Some("http://hl7.org/fhir/resource-types"))
  case LOCATION extends LOCATION("Location", Some("Location"), Some("http://hl7.org/fhir/resource-types"))
  case MARKDOWN extends MARKDOWN("markdown", Some("markdown"), Some("http://hl7.org/fhir/data-types"))
  case MARKETINGSTATUS extends MARKETINGSTATUS("MarketingStatus", Some("MarketingStatus"), Some("http://hl7.org/fhir/data-types"))
  case MEASURE extends MEASURE("Measure", Some("Measure"), Some("http://hl7.org/fhir/resource-types"))
  case MEASUREREPORT extends MEASUREREPORT("MeasureReport", Some("MeasureReport"), Some("http://hl7.org/fhir/resource-types"))
  case MEDIA extends MEDIA("Media", Some("Media"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICATION extends MEDICATION("Medication", Some("Medication"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICATIONADMINISTRATION extends MEDICATIONADMINISTRATION("MedicationAdministration", Some("MedicationAdministration"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICATIONDISPENSE extends MEDICATIONDISPENSE("MedicationDispense", Some("MedicationDispense"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICATIONKNOWLEDGE extends MEDICATIONKNOWLEDGE("MedicationKnowledge", Some("MedicationKnowledge"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICATIONREQUEST extends MEDICATIONREQUEST("MedicationRequest", Some("MedicationRequest"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICATIONSTATEMENT extends MEDICATIONSTATEMENT("MedicationStatement", Some("MedicationStatement"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICINALPRODUCT extends MEDICINALPRODUCT("MedicinalProduct", Some("MedicinalProduct"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICINALPRODUCTAUTHORIZATION extends MEDICINALPRODUCTAUTHORIZATION("MedicinalProductAuthorization", Some("MedicinalProductAuthorization"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICINALPRODUCTCONTRAINDICATION extends MEDICINALPRODUCTCONTRAINDICATION("MedicinalProductContraindication", Some("MedicinalProductContraindication"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICINALPRODUCTINDICATION extends MEDICINALPRODUCTINDICATION("MedicinalProductIndication", Some("MedicinalProductIndication"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICINALPRODUCTINGREDIENT extends MEDICINALPRODUCTINGREDIENT("MedicinalProductIngredient", Some("MedicinalProductIngredient"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICINALPRODUCTINTERACTION extends MEDICINALPRODUCTINTERACTION("MedicinalProductInteraction", Some("MedicinalProductInteraction"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICINALPRODUCTMANUFACTURED extends MEDICINALPRODUCTMANUFACTURED("MedicinalProductManufactured", Some("MedicinalProductManufactured"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICINALPRODUCTPACKAGED extends MEDICINALPRODUCTPACKAGED("MedicinalProductPackaged", Some("MedicinalProductPackaged"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICINALPRODUCTPHARMACEUTICAL extends MEDICINALPRODUCTPHARMACEUTICAL("MedicinalProductPharmaceutical", Some("MedicinalProductPharmaceutical"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICINALPRODUCTUNDESIRABLEEFFECT extends MEDICINALPRODUCTUNDESIRABLEEFFECT("MedicinalProductUndesirableEffect", Some("MedicinalProductUndesirableEffect"), Some("http://hl7.org/fhir/resource-types"))
  case MESSAGEDEFINITION extends MESSAGEDEFINITION("MessageDefinition", Some("MessageDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case MESSAGEHEADER extends MESSAGEHEADER("MessageHeader", Some("MessageHeader"), Some("http://hl7.org/fhir/resource-types"))
  case META extends META("Meta", Some("Meta"), Some("http://hl7.org/fhir/data-types"))
  case MOLECULARSEQUENCE extends MOLECULARSEQUENCE("MolecularSequence", Some("MolecularSequence"), Some("http://hl7.org/fhir/resource-types"))
  case MONEY extends MONEY("Money", Some("Money"), Some("http://hl7.org/fhir/data-types"))
  case MONEYQUANTITY extends MONEYQUANTITY("MoneyQuantity", Some("MoneyQuantity"), Some("http://hl7.org/fhir/data-types"))
  case NAMINGSYSTEM extends NAMINGSYSTEM("NamingSystem", Some("NamingSystem"), Some("http://hl7.org/fhir/resource-types"))
  case NARRATIVE extends NARRATIVE("Narrative", Some("Narrative"), Some("http://hl7.org/fhir/data-types"))
  case NUTRITIONORDER extends NUTRITIONORDER("NutritionOrder", Some("NutritionOrder"), Some("http://hl7.org/fhir/resource-types"))
  case OBSERVATION extends OBSERVATION("Observation", Some("Observation"), Some("http://hl7.org/fhir/resource-types"))
  case OBSERVATIONDEFINITION extends OBSERVATIONDEFINITION("ObservationDefinition", Some("ObservationDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case OID extends OID("oid", Some("oid"), Some("http://hl7.org/fhir/data-types"))
  case OPERATIONDEFINITION extends OPERATIONDEFINITION("OperationDefinition", Some("OperationDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case OPERATIONOUTCOME extends OPERATIONOUTCOME("OperationOutcome", Some("OperationOutcome"), Some("http://hl7.org/fhir/resource-types"))
  case ORGANIZATION extends ORGANIZATION("Organization", Some("Organization"), Some("http://hl7.org/fhir/resource-types"))
  case ORGANIZATIONAFFILIATION extends ORGANIZATIONAFFILIATION("OrganizationAffiliation", Some("OrganizationAffiliation"), Some("http://hl7.org/fhir/resource-types"))
  case PARAMETERDEFINITION extends PARAMETERDEFINITION("ParameterDefinition", Some("ParameterDefinition"), Some("http://hl7.org/fhir/data-types"))
  case PARAMETERS extends PARAMETERS("Parameters", Some("Parameters"), Some("http://hl7.org/fhir/resource-types"))
  case PATIENT extends PATIENT("Patient", Some("Patient"), Some("http://hl7.org/fhir/resource-types"))
  case PAYMENTNOTICE extends PAYMENTNOTICE("PaymentNotice", Some("PaymentNotice"), Some("http://hl7.org/fhir/resource-types"))
  case PAYMENTRECONCILIATION extends PAYMENTRECONCILIATION("PaymentReconciliation", Some("PaymentReconciliation"), Some("http://hl7.org/fhir/resource-types"))
  case PERIOD extends PERIOD("Period", Some("Period"), Some("http://hl7.org/fhir/data-types"))
  case PERSON extends PERSON("Person", Some("Person"), Some("http://hl7.org/fhir/resource-types"))
  case PLANDEFINITION extends PLANDEFINITION("PlanDefinition", Some("PlanDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case POPULATION extends POPULATION("Population", Some("Population"), Some("http://hl7.org/fhir/data-types"))
  case POSITIVEINT extends POSITIVEINT("positiveInt", Some("positiveInt"), Some("http://hl7.org/fhir/data-types"))
  case PRACTITIONER extends PRACTITIONER("Practitioner", Some("Practitioner"), Some("http://hl7.org/fhir/resource-types"))
  case PRACTITIONERROLE extends PRACTITIONERROLE("PractitionerRole", Some("PractitionerRole"), Some("http://hl7.org/fhir/resource-types"))
  case PROCEDURE extends PROCEDURE("Procedure", Some("Procedure"), Some("http://hl7.org/fhir/resource-types"))
  case PRODCHARACTERISTIC extends PRODCHARACTERISTIC("ProdCharacteristic", Some("ProdCharacteristic"), Some("http://hl7.org/fhir/data-types"))
  case PRODUCTSHELFLIFE extends PRODUCTSHELFLIFE("ProductShelfLife", Some("ProductShelfLife"), Some("http://hl7.org/fhir/data-types"))
  case PROVENANCE extends PROVENANCE("Provenance", Some("Provenance"), Some("http://hl7.org/fhir/resource-types"))
  case QUANTITY extends QUANTITY("Quantity", Some("Quantity"), Some("http://hl7.org/fhir/data-types"))
  case QUESTIONNAIRE extends QUESTIONNAIRE("Questionnaire", Some("Questionnaire"), Some("http://hl7.org/fhir/resource-types"))
  case QUESTIONNAIRERESPONSE extends QUESTIONNAIRERESPONSE("QuestionnaireResponse", Some("QuestionnaireResponse"), Some("http://hl7.org/fhir/resource-types"))
  case RANGE extends RANGE("Range", Some("Range"), Some("http://hl7.org/fhir/data-types"))
  case RATIO extends RATIO("Ratio", Some("Ratio"), Some("http://hl7.org/fhir/data-types"))
  case REFERENCE extends REFERENCE("Reference", Some("Reference"), Some("http://hl7.org/fhir/data-types"))
  case RELATEDARTIFACT extends RELATEDARTIFACT("RelatedArtifact", Some("RelatedArtifact"), Some("http://hl7.org/fhir/data-types"))
  case RELATEDPERSON extends RELATEDPERSON("RelatedPerson", Some("RelatedPerson"), Some("http://hl7.org/fhir/resource-types"))
  case REQUESTGROUP extends REQUESTGROUP("RequestGroup", Some("RequestGroup"), Some("http://hl7.org/fhir/resource-types"))
  case RESEARCHDEFINITION extends RESEARCHDEFINITION("ResearchDefinition", Some("ResearchDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case RESEARCHELEMENTDEFINITION extends RESEARCHELEMENTDEFINITION("ResearchElementDefinition", Some("ResearchElementDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case RESEARCHSTUDY extends RESEARCHSTUDY("ResearchStudy", Some("ResearchStudy"), Some("http://hl7.org/fhir/resource-types"))
  case RESEARCHSUBJECT extends RESEARCHSUBJECT("ResearchSubject", Some("ResearchSubject"), Some("http://hl7.org/fhir/resource-types"))
  case RESOURCE extends RESOURCE("Resource", Some("Resource"), Some("http://hl7.org/fhir/resource-types"))
  case RISKASSESSMENT extends RISKASSESSMENT("RiskAssessment", Some("RiskAssessment"), Some("http://hl7.org/fhir/resource-types"))
  case RISKEVIDENCESYNTHESIS extends RISKEVIDENCESYNTHESIS("RiskEvidenceSynthesis", Some("RiskEvidenceSynthesis"), Some("http://hl7.org/fhir/resource-types"))
  case SAMPLEDDATA extends SAMPLEDDATA("SampledData", Some("SampledData"), Some("http://hl7.org/fhir/data-types"))
  case SCHEDULE extends SCHEDULE("Schedule", Some("Schedule"), Some("http://hl7.org/fhir/resource-types"))
  case SEARCHPARAMETER extends SEARCHPARAMETER("SearchParameter", Some("SearchParameter"), Some("http://hl7.org/fhir/resource-types"))
  case SERVICEREQUEST extends SERVICEREQUEST("ServiceRequest", Some("ServiceRequest"), Some("http://hl7.org/fhir/resource-types"))
  case SIGNATURE extends SIGNATURE("Signature", Some("Signature"), Some("http://hl7.org/fhir/data-types"))
  case SIMPLEQUANTITY extends SIMPLEQUANTITY("SimpleQuantity", Some("SimpleQuantity"), Some("http://hl7.org/fhir/data-types"))
  case SLOT extends SLOT("Slot", Some("Slot"), Some("http://hl7.org/fhir/resource-types"))
  case SPECIMEN extends SPECIMEN("Specimen", Some("Specimen"), Some("http://hl7.org/fhir/resource-types"))
  case SPECIMENDEFINITION extends SPECIMENDEFINITION("SpecimenDefinition", Some("SpecimenDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case STRING extends STRING("string", Some("string"), Some("http://hl7.org/fhir/data-types"))
  case STRUCTUREDEFINITION extends STRUCTUREDEFINITION("StructureDefinition", Some("StructureDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case STRUCTUREMAP extends STRUCTUREMAP("StructureMap", Some("StructureMap"), Some("http://hl7.org/fhir/resource-types"))
  case SUBSCRIPTION extends SUBSCRIPTION("Subscription", Some("Subscription"), Some("http://hl7.org/fhir/resource-types"))
  case SUBSTANCE extends SUBSTANCE("Substance", Some("Substance"), Some("http://hl7.org/fhir/resource-types"))
  case SUBSTANCEAMOUNT extends SUBSTANCEAMOUNT("SubstanceAmount", Some("SubstanceAmount"), Some("http://hl7.org/fhir/data-types"))
  case SUBSTANCENUCLEICACID extends SUBSTANCENUCLEICACID("SubstanceNucleicAcid", Some("SubstanceNucleicAcid"), Some("http://hl7.org/fhir/resource-types"))
  case SUBSTANCEPOLYMER extends SUBSTANCEPOLYMER("SubstancePolymer", Some("SubstancePolymer"), Some("http://hl7.org/fhir/resource-types"))
  case SUBSTANCEPROTEIN extends SUBSTANCEPROTEIN("SubstanceProtein", Some("SubstanceProtein"), Some("http://hl7.org/fhir/resource-types"))
  case SUBSTANCEREFERENCEINFORMATION extends SUBSTANCEREFERENCEINFORMATION("SubstanceReferenceInformation", Some("SubstanceReferenceInformation"), Some("http://hl7.org/fhir/resource-types"))
  case SUBSTANCESOURCEMATERIAL extends SUBSTANCESOURCEMATERIAL("SubstanceSourceMaterial", Some("SubstanceSourceMaterial"), Some("http://hl7.org/fhir/resource-types"))
  case SUBSTANCESPECIFICATION extends SUBSTANCESPECIFICATION("SubstanceSpecification", Some("SubstanceSpecification"), Some("http://hl7.org/fhir/resource-types"))
  case SUPPLYDELIVERY extends SUPPLYDELIVERY("SupplyDelivery", Some("SupplyDelivery"), Some("http://hl7.org/fhir/resource-types"))
  case SUPPLYREQUEST extends SUPPLYREQUEST("SupplyRequest", Some("SupplyRequest"), Some("http://hl7.org/fhir/resource-types"))
  case TASK extends TASK("Task", Some("Task"), Some("http://hl7.org/fhir/resource-types"))
  case TERMINOLOGYCAPABILITIES extends TERMINOLOGYCAPABILITIES("TerminologyCapabilities", Some("TerminologyCapabilities"), Some("http://hl7.org/fhir/resource-types"))
  case TESTREPORT extends TESTREPORT("TestReport", Some("TestReport"), Some("http://hl7.org/fhir/resource-types"))
  case TESTSCRIPT extends TESTSCRIPT("TestScript", Some("TestScript"), Some("http://hl7.org/fhir/resource-types"))
  case TIME extends TIME("time", Some("time"), Some("http://hl7.org/fhir/data-types"))
  case TIMING extends TIMING("Timing", Some("Timing"), Some("http://hl7.org/fhir/data-types"))
  case TRIGGERDEFINITION extends TRIGGERDEFINITION("TriggerDefinition", Some("TriggerDefinition"), Some("http://hl7.org/fhir/data-types"))
  case TYPE extends TYPE("Type", Some("Type"), Some("http://hl7.org/fhir/abstract-types"))
  case UNSIGNEDINT extends UNSIGNEDINT("unsignedInt", Some("unsignedInt"), Some("http://hl7.org/fhir/data-types"))
  case URI extends URI("uri", Some("uri"), Some("http://hl7.org/fhir/data-types"))
  case URL extends URL("url", Some("url"), Some("http://hl7.org/fhir/data-types"))
  case USAGECONTEXT extends USAGECONTEXT("UsageContext", Some("UsageContext"), Some("http://hl7.org/fhir/data-types"))
  case UUID extends UUID("uuid", Some("uuid"), Some("http://hl7.org/fhir/data-types"))
  case VALUESET extends VALUESET("ValueSet", Some("ValueSet"), Some("http://hl7.org/fhir/resource-types"))
  case VERIFICATIONRESULT extends VERIFICATIONRESULT("VerificationResult", Some("VerificationResult"), Some("http://hl7.org/fhir/resource-types"))
  case VISIONPRESCRIPTION extends VISIONPRESCRIPTION("VisionPrescription", Some("VisionPrescription"), Some("http://hl7.org/fhir/resource-types"))
  case XHTML extends XHTML("xhtml", Some("XHTML"), Some("http://hl7.org/fhir/data-types"))
}
object ALL_TYPES extends EType[ALL_TYPES]("http://hl7.org/fhir/ValueSet/all-types") 


enum CONTACT_POINT_SYSTEM(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case EMAIL extends EMAIL("email", Some("Email"), Some("http://hl7.org/fhir/contact-point-system"))
  case FAX extends FAX("fax", Some("Fax"), Some("http://hl7.org/fhir/contact-point-system"))
  case OTHER extends OTHER("other", Some("Other"), Some("http://hl7.org/fhir/contact-point-system"))
  case PAGER extends PAGER("pager", Some("Pager"), Some("http://hl7.org/fhir/contact-point-system"))
  case PHONE extends PHONE("phone", Some("Phone"), Some("http://hl7.org/fhir/contact-point-system"))
  case SMS extends SMS("sms", Some("SMS"), Some("http://hl7.org/fhir/contact-point-system"))
  case URL extends URL("url", Some("URL"), Some("http://hl7.org/fhir/contact-point-system"))
}
object CONTACT_POINT_SYSTEM extends EType[CONTACT_POINT_SYSTEM]("http://hl7.org/fhir/ValueSet/contact-point-system") 


enum CONTACT_POINT_USE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case HOME extends HOME("home", Some("Home"), Some("http://hl7.org/fhir/contact-point-use"))
  case MOBILE extends MOBILE("mobile", Some("Mobile"), Some("http://hl7.org/fhir/contact-point-use"))
  case OLD extends OLD("old", Some("Old"), Some("http://hl7.org/fhir/contact-point-use"))
  case TEMP extends TEMP("temp", Some("Temp"), Some("http://hl7.org/fhir/contact-point-use"))
  case WORK extends WORK("work", Some("Work"), Some("http://hl7.org/fhir/contact-point-use"))
}
object CONTACT_POINT_USE extends EType[CONTACT_POINT_USE]("http://hl7.org/fhir/ValueSet/contact-point-use") 


enum CONTRIBUTOR_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case AUTHOR extends AUTHOR("author", Some("Author"), Some("http://hl7.org/fhir/contributor-type"))
  case EDITOR extends EDITOR("editor", Some("Editor"), Some("http://hl7.org/fhir/contributor-type"))
  case ENDORSER extends ENDORSER("endorser", Some("Endorser"), Some("http://hl7.org/fhir/contributor-type"))
  case REVIEWER extends REVIEWER("reviewer", Some("Reviewer"), Some("http://hl7.org/fhir/contributor-type"))
}
object CONTRIBUTOR_TYPE extends EType[CONTRIBUTOR_TYPE]("http://hl7.org/fhir/ValueSet/contributor-type") 


enum DAYS_OF_WEEK(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case FRI extends FRI("fri", Some("Friday"), Some("http://hl7.org/fhir/days-of-week"))
  case MON extends MON("mon", Some("Monday"), Some("http://hl7.org/fhir/days-of-week"))
  case SAT extends SAT("sat", Some("Saturday"), Some("http://hl7.org/fhir/days-of-week"))
  case SUN extends SUN("sun", Some("Sunday"), Some("http://hl7.org/fhir/days-of-week"))
  case THU extends THU("thu", Some("Thursday"), Some("http://hl7.org/fhir/days-of-week"))
  case TUE extends TUE("tue", Some("Tuesday"), Some("http://hl7.org/fhir/days-of-week"))
  case WED extends WED("wed", Some("Wednesday"), Some("http://hl7.org/fhir/days-of-week"))
}
object DAYS_OF_WEEK extends EType[DAYS_OF_WEEK]("http://hl7.org/fhir/ValueSet/days-of-week") 


enum EVENT_TIMING(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case AC extends AC("AC", Some("AC"), Some("http://terminology.hl7.org/CodeSystem/v3-TimingEvent"))
  case ACD extends ACD("ACD", Some("ACD"), Some("http://terminology.hl7.org/CodeSystem/v3-TimingEvent"))
  case ACM extends ACM("ACM", Some("ACM"), Some("http://terminology.hl7.org/CodeSystem/v3-TimingEvent"))
  case ACV extends ACV("ACV", Some("ACV"), Some("http://terminology.hl7.org/CodeSystem/v3-TimingEvent"))
  case AFT extends AFT("AFT", Some("Afternoon"), Some("http://hl7.org/fhir/event-timing"))
  case C extends C("C", Some("C"), Some("http://terminology.hl7.org/CodeSystem/v3-TimingEvent"))
  case CD extends CD("CD", Some("CD"), Some("http://terminology.hl7.org/CodeSystem/v3-TimingEvent"))
  case CM extends CM("CM", Some("CM"), Some("http://terminology.hl7.org/CodeSystem/v3-TimingEvent"))
  case CV extends CV("CV", Some("CV"), Some("http://terminology.hl7.org/CodeSystem/v3-TimingEvent"))
  case EARLY_AFTERNOON extends EARLY_AFTERNOON("AFT.early", Some("Early Afternoon"), Some("http://hl7.org/fhir/event-timing"))
  case EARLY_EVENING extends EARLY_EVENING("EVE.early", Some("Early Evening"), Some("http://hl7.org/fhir/event-timing"))
  case EARLY_MORNING extends EARLY_MORNING("MORN.early", Some("Early Morning"), Some("http://hl7.org/fhir/event-timing"))
  case EVE extends EVE("EVE", Some("Evening"), Some("http://hl7.org/fhir/event-timing"))
  case HS extends HS("HS", Some("HS"), Some("http://terminology.hl7.org/CodeSystem/v3-TimingEvent"))
  case LATE_AFTERNOON extends LATE_AFTERNOON("AFT.late", Some("Late Afternoon"), Some("http://hl7.org/fhir/event-timing"))
  case LATE_EVENING extends LATE_EVENING("EVE.late", Some("Late Evening"), Some("http://hl7.org/fhir/event-timing"))
  case LATE_MORNING extends LATE_MORNING("MORN.late", Some("Late Morning"), Some("http://hl7.org/fhir/event-timing"))
  case MORN extends MORN("MORN", Some("Morning"), Some("http://hl7.org/fhir/event-timing"))
  case NIGHT extends NIGHT("NIGHT", Some("Night"), Some("http://hl7.org/fhir/event-timing"))
  case NOON extends NOON("NOON", Some("Noon"), Some("http://hl7.org/fhir/event-timing"))
  case PC extends PC("PC", Some("PC"), Some("http://terminology.hl7.org/CodeSystem/v3-TimingEvent"))
  case PCD extends PCD("PCD", Some("PCD"), Some("http://terminology.hl7.org/CodeSystem/v3-TimingEvent"))
  case PCM extends PCM("PCM", Some("PCM"), Some("http://terminology.hl7.org/CodeSystem/v3-TimingEvent"))
  case PCV extends PCV("PCV", Some("PCV"), Some("http://terminology.hl7.org/CodeSystem/v3-TimingEvent"))
  case PHS extends PHS("PHS", Some("After Sleep"), Some("http://hl7.org/fhir/event-timing"))
  case WAKE extends WAKE("WAKE", Some("WAKE"), Some("http://terminology.hl7.org/CodeSystem/v3-TimingEvent"))
}
object EVENT_TIMING extends EType[EVENT_TIMING]("http://hl7.org/fhir/ValueSet/event-timing") 


enum EXPRESSION_LANGUAGE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case CQL extends CQL("text/cql", Some("CQL"), Some("http://hl7.org/fhir/expression-language"))
  case FHIRPATH extends FHIRPATH("text/fhirpath", Some("FHIRPath"), Some("http://hl7.org/fhir/expression-language"))
  case FHIR_QUERY extends FHIR_QUERY("application/x-fhir-query", Some("FHIR Query"), Some("http://hl7.org/fhir/expression-language"))
case Other_(s: String) extends EXPRESSION_LANGUAGE(s, Some(s"Runtime value set extension ($s)"), None)
}
object EXPRESSION_LANGUAGE extends ETypeWithFallback[EXPRESSION_LANGUAGE]("http://hl7.org/fhir/ValueSet/expression-language")  {
  def fallback(s: String): EXPRESSION_LANGUAGE = EXPRESSION_LANGUAGE.Other_(s)
}


enum IDENTIFIER_USE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case OFFICIAL extends OFFICIAL("official", Some("Official"), Some("http://hl7.org/fhir/identifier-use"))
  case OLD extends OLD("old", Some("Old"), Some("http://hl7.org/fhir/identifier-use"))
  case SECONDARY extends SECONDARY("secondary", Some("Secondary"), Some("http://hl7.org/fhir/identifier-use"))
  case TEMP extends TEMP("temp", Some("Temp"), Some("http://hl7.org/fhir/identifier-use"))
  case USUAL extends USUAL("usual", Some("Usual"), Some("http://hl7.org/fhir/identifier-use"))
}
object IDENTIFIER_USE extends EType[IDENTIFIER_USE]("http://hl7.org/fhir/ValueSet/identifier-use") 


enum LANGUAGES(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case AR extends AR("ar", Some("Arabic"), Some("urn:ietf:bcp:47"))
  case BN extends BN("bn", Some("Bengali"), Some("urn:ietf:bcp:47"))
  case CS extends CS("cs", Some("Czech"), Some("urn:ietf:bcp:47"))
  case DA extends DA("da", Some("Danish"), Some("urn:ietf:bcp:47"))
  case DE extends DE("de", Some("German"), Some("urn:ietf:bcp:47"))
  case DE_AT extends DE_AT("de-AT", Some("German (Austria)"), Some("urn:ietf:bcp:47"))
  case DE_CH extends DE_CH("de-CH", Some("German (Switzerland)"), Some("urn:ietf:bcp:47"))
  case DE_DE extends DE_DE("de-DE", Some("German (Germany)"), Some("urn:ietf:bcp:47"))
  case EL extends EL("el", Some("Greek"), Some("urn:ietf:bcp:47"))
  case EN extends EN("en", Some("English"), Some("urn:ietf:bcp:47"))
  case EN_AU extends EN_AU("en-AU", Some("English (Australia)"), Some("urn:ietf:bcp:47"))
  case EN_CA extends EN_CA("en-CA", Some("English (Canada)"), Some("urn:ietf:bcp:47"))
  case EN_GB extends EN_GB("en-GB", Some("English (Great Britain)"), Some("urn:ietf:bcp:47"))
  case EN_IN extends EN_IN("en-IN", Some("English (India)"), Some("urn:ietf:bcp:47"))
  case EN_NZ extends EN_NZ("en-NZ", Some("English (New Zeland)"), Some("urn:ietf:bcp:47"))
  case EN_SG extends EN_SG("en-SG", Some("English (Singapore)"), Some("urn:ietf:bcp:47"))
  case EN_US extends EN_US("en-US", Some("English (United States)"), Some("urn:ietf:bcp:47"))
  case ES extends ES("es", Some("Spanish"), Some("urn:ietf:bcp:47"))
  case ES_AR extends ES_AR("es-AR", Some("Spanish (Argentina)"), Some("urn:ietf:bcp:47"))
  case ES_ES extends ES_ES("es-ES", Some("Spanish (Spain)"), Some("urn:ietf:bcp:47"))
  case ES_UY extends ES_UY("es-UY", Some("Spanish (Uruguay)"), Some("urn:ietf:bcp:47"))
  case FI extends FI("fi", Some("Finnish"), Some("urn:ietf:bcp:47"))
  case FR extends FR("fr", Some("French"), Some("urn:ietf:bcp:47"))
  case FR_BE extends FR_BE("fr-BE", Some("French (Belgium)"), Some("urn:ietf:bcp:47"))
  case FR_CH extends FR_CH("fr-CH", Some("French (Switzerland)"), Some("urn:ietf:bcp:47"))
  case FR_FR extends FR_FR("fr-FR", Some("French (France)"), Some("urn:ietf:bcp:47"))
  case FY extends FY("fy", Some("Frysian"), Some("urn:ietf:bcp:47"))
  case FY_NL extends FY_NL("fy-NL", Some("Frysian (Netherlands)"), Some("urn:ietf:bcp:47"))
  case HI extends HI("hi", Some("Hindi"), Some("urn:ietf:bcp:47"))
  case HR extends HR("hr", Some("Croatian"), Some("urn:ietf:bcp:47"))
  case IT extends IT("it", Some("Italian"), Some("urn:ietf:bcp:47"))
  case IT_CH extends IT_CH("it-CH", Some("Italian (Switzerland)"), Some("urn:ietf:bcp:47"))
  case IT_IT extends IT_IT("it-IT", Some("Italian (Italy)"), Some("urn:ietf:bcp:47"))
  case JA extends JA("ja", Some("Japanese"), Some("urn:ietf:bcp:47"))
  case KO extends KO("ko", Some("Korean"), Some("urn:ietf:bcp:47"))
  case NL extends NL("nl", Some("Dutch"), Some("urn:ietf:bcp:47"))
  case NL_BE extends NL_BE("nl-BE", Some("Dutch (Belgium)"), Some("urn:ietf:bcp:47"))
  case NL_NL extends NL_NL("nl-NL", Some("Dutch (Netherlands)"), Some("urn:ietf:bcp:47"))
  case NO extends NO("no", Some("Norwegian"), Some("urn:ietf:bcp:47"))
  case NO_NO extends NO_NO("no-NO", Some("Norwegian (Norway)"), Some("urn:ietf:bcp:47"))
  case PA extends PA("pa", Some("Punjabi"), Some("urn:ietf:bcp:47"))
  case PL extends PL("pl", Some("Polish"), Some("urn:ietf:bcp:47"))
  case PT extends PT("pt", Some("Portuguese"), Some("urn:ietf:bcp:47"))
  case PT_BR extends PT_BR("pt-BR", Some("Portuguese (Brazil)"), Some("urn:ietf:bcp:47"))
  case RU extends RU("ru", Some("Russian"), Some("urn:ietf:bcp:47"))
  case RU_RU extends RU_RU("ru-RU", Some("Russian (Russia)"), Some("urn:ietf:bcp:47"))
  case SR extends SR("sr", Some("Serbian"), Some("urn:ietf:bcp:47"))
  case SR_RS extends SR_RS("sr-RS", Some("Serbian (Serbia)"), Some("urn:ietf:bcp:47"))
  case SV extends SV("sv", Some("Swedish"), Some("urn:ietf:bcp:47"))
  case SV_SE extends SV_SE("sv-SE", Some("Swedish (Sweden)"), Some("urn:ietf:bcp:47"))
  case TE extends TE("te", Some("Telegu"), Some("urn:ietf:bcp:47"))
  case ZH extends ZH("zh", Some("Chinese"), Some("urn:ietf:bcp:47"))
  case ZH_CN extends ZH_CN("zh-CN", Some("Chinese (China)"), Some("urn:ietf:bcp:47"))
  case ZH_HK extends ZH_HK("zh-HK", Some("Chinese (Hong Kong)"), Some("urn:ietf:bcp:47"))
  case ZH_SG extends ZH_SG("zh-SG", Some("Chinese (Singapore)"), Some("urn:ietf:bcp:47"))
  case ZH_TW extends ZH_TW("zh-TW", Some("Chinese (Taiwan)"), Some("urn:ietf:bcp:47"))
case Other_(s: String) extends LANGUAGES(s, Some(s"Runtime value set extension ($s)"), None)
}
object LANGUAGES extends ETypeWithFallback[LANGUAGES]("http://hl7.org/fhir/ValueSet/languages")  {
  def fallback(s: String): LANGUAGES = LANGUAGES.Other_(s)
}


enum NAME_USE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ANONYMOUS extends ANONYMOUS("anonymous", Some("Anonymous"), Some("http://hl7.org/fhir/name-use"))
  case MAIDEN extends MAIDEN("maiden", Some("Name changed for Marriage"), Some("http://hl7.org/fhir/name-use"))
  case NICKNAME extends NICKNAME("nickname", Some("Nickname"), Some("http://hl7.org/fhir/name-use"))
  case OFFICIAL extends OFFICIAL("official", Some("Official"), Some("http://hl7.org/fhir/name-use"))
  case OLD extends OLD("old", Some("Old"), Some("http://hl7.org/fhir/name-use"))
  case TEMP extends TEMP("temp", Some("Temp"), Some("http://hl7.org/fhir/name-use"))
  case USUAL extends USUAL("usual", Some("Usual"), Some("http://hl7.org/fhir/name-use"))
}
object NAME_USE extends EType[NAME_USE]("http://hl7.org/fhir/ValueSet/name-use") 


enum OPERATION_PARAMETER_USE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case IN extends IN("in", Some("In"), Some("http://hl7.org/fhir/operation-parameter-use"))
  case OUT extends OUT("out", Some("Out"), Some("http://hl7.org/fhir/operation-parameter-use"))
}
object OPERATION_PARAMETER_USE extends EType[OPERATION_PARAMETER_USE]("http://hl7.org/fhir/ValueSet/operation-parameter-use") 


enum QUANTITY_COMPARATOR(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case GREATER_OR_EQUAL_TO extends GREATER_OR_EQUAL_TO(">=", Some("Greater or Equal to"), Some("http://hl7.org/fhir/quantity-comparator"))
  case GREATER_THAN extends GREATER_THAN(">", Some("Greater than"), Some("http://hl7.org/fhir/quantity-comparator"))
  case LESS_OR_EQUAL_TO extends LESS_OR_EQUAL_TO("<=", Some("Less or Equal to"), Some("http://hl7.org/fhir/quantity-comparator"))
  case LESS_THAN extends LESS_THAN("<", Some("Less than"), Some("http://hl7.org/fhir/quantity-comparator"))
}
object QUANTITY_COMPARATOR extends EType[QUANTITY_COMPARATOR]("http://hl7.org/fhir/ValueSet/quantity-comparator") 


enum RELATED_ARTIFACT_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case CITATION extends CITATION("citation", Some("Citation"), Some("http://hl7.org/fhir/related-artifact-type"))
  case COMPOSED_OF extends COMPOSED_OF("composed-of", Some("Composed Of"), Some("http://hl7.org/fhir/related-artifact-type"))
  case DEPENDS_ON extends DEPENDS_ON("depends-on", Some("Depends On"), Some("http://hl7.org/fhir/related-artifact-type"))
  case DERIVED_FROM extends DERIVED_FROM("derived-from", Some("Derived From"), Some("http://hl7.org/fhir/related-artifact-type"))
  case DOCUMENTATION extends DOCUMENTATION("documentation", Some("Documentation"), Some("http://hl7.org/fhir/related-artifact-type"))
  case JUSTIFICATION extends JUSTIFICATION("justification", Some("Justification"), Some("http://hl7.org/fhir/related-artifact-type"))
  case PREDECESSOR extends PREDECESSOR("predecessor", Some("Predecessor"), Some("http://hl7.org/fhir/related-artifact-type"))
  case SUCCESSOR extends SUCCESSOR("successor", Some("Successor"), Some("http://hl7.org/fhir/related-artifact-type"))
}
object RELATED_ARTIFACT_TYPE extends EType[RELATED_ARTIFACT_TYPE]("http://hl7.org/fhir/ValueSet/related-artifact-type") 


enum SORT_DIRECTION(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ASCENDING extends ASCENDING("ascending", Some("Ascending"), Some("http://hl7.org/fhir/sort-direction"))
  case DESCENDING extends DESCENDING("descending", Some("Descending"), Some("http://hl7.org/fhir/sort-direction"))
}
object SORT_DIRECTION extends EType[SORT_DIRECTION]("http://hl7.org/fhir/ValueSet/sort-direction") 


enum TRIGGER_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case DATA_ACCESSED extends DATA_ACCESSED("data-accessed", Some("Data Accessed"), Some("http://hl7.org/fhir/trigger-type"))
  case DATA_ACCESS_ENDED extends DATA_ACCESS_ENDED("data-access-ended", Some("Data Access Ended"), Some("http://hl7.org/fhir/trigger-type"))
  case DATA_ADDED extends DATA_ADDED("data-added", Some("Data Added"), Some("http://hl7.org/fhir/trigger-type"))
  case DATA_CHANGED extends DATA_CHANGED("data-changed", Some("Data Changed"), Some("http://hl7.org/fhir/trigger-type"))
  case DATA_REMOVED extends DATA_REMOVED("data-removed", Some("Data Removed"), Some("http://hl7.org/fhir/trigger-type"))
  case DATA_UPDATED extends DATA_UPDATED("data-modified", Some("Data Updated"), Some("http://hl7.org/fhir/trigger-type"))
  case NAMED_EVENT extends NAMED_EVENT("named-event", Some("Named Event"), Some("http://hl7.org/fhir/trigger-type"))
  case PERIODIC extends PERIODIC("periodic", Some("Periodic"), Some("http://hl7.org/fhir/trigger-type"))
}
object TRIGGER_TYPE extends EType[TRIGGER_TYPE]("http://hl7.org/fhir/ValueSet/trigger-type") 


enum UNITS_OF_TIME(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case A extends A("a", Some("year"), Some("http://unitsofmeasure.org"))
  case D extends D("d", Some("day"), Some("http://unitsofmeasure.org"))
  case H extends H("h", Some("hour"), Some("http://unitsofmeasure.org"))
  case MIN extends MIN("min", Some("minute"), Some("http://unitsofmeasure.org"))
  case MO extends MO("mo", Some("month"), Some("http://unitsofmeasure.org"))
  case S extends S("s", Some("second"), Some("http://unitsofmeasure.org"))
  case WK extends WK("wk", Some("week"), Some("http://unitsofmeasure.org"))
}
object UNITS_OF_TIME extends EType[UNITS_OF_TIME]("http://hl7.org/fhir/ValueSet/units-of-time") 

