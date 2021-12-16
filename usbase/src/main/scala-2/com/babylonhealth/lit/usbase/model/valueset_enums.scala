package com.babylonhealth.lit.usbase

import enumeratum.{ CirceEnum, Enum, EnumEntry }

import com.babylonhealth.lit.core.model.Coding
import com.babylonhealth.lit.core.{ EnumeratumBase, FhirEnum, FhirCirceEnum, EnumWithFallback }

sealed abstract class CHOICE_LIST_ORIENTATION(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object CHOICE_LIST_ORIENTATION extends FhirEnum[CHOICE_LIST_ORIENTATION] with FhirCirceEnum[CHOICE_LIST_ORIENTATION] {
  val reference = "http://hl7.org/fhir/ValueSet/choice-list-orientation"
  val values    = findValues
  case object HORIZONTAL extends CHOICE_LIST_ORIENTATION("horizontal") {
    def display: Option[String] = Some("Horizontal")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/choice-list-orientation")
  }
  case object VERTICAL extends CHOICE_LIST_ORIENTATION("vertical") {
    def display: Option[String] = Some("Vertical")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/choice-list-orientation")
  }
}

sealed abstract class CONFORMANCE_EXPECTATION(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object CONFORMANCE_EXPECTATION extends FhirEnum[CONFORMANCE_EXPECTATION] with FhirCirceEnum[CONFORMANCE_EXPECTATION] {
  val reference = "http://hl7.org/fhir/ValueSet/conformance-expectation"
  val values    = findValues
  case object MAY extends CONFORMANCE_EXPECTATION("MAY") {
    def display: Option[String] = Some("MAY")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/conformance-expectation")
  }
  case object SHALL extends CONFORMANCE_EXPECTATION("SHALL") {
    def display: Option[String] = Some("SHALL")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/conformance-expectation")
  }
  case object SHOULD extends CONFORMANCE_EXPECTATION("SHOULD") {
    def display: Option[String] = Some("SHOULD")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/conformance-expectation")
  }
  case object SHOULD_NOT extends CONFORMANCE_EXPECTATION("SHOULD-NOT") {
    def display: Option[String] = Some("SHOULD-NOT")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/conformance-expectation")
  }
}

sealed abstract class DATA_ABSENT_REASON(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object DATA_ABSENT_REASON extends FhirEnum[DATA_ABSENT_REASON] with FhirCirceEnum[DATA_ABSENT_REASON] {
  val reference = "http://hl7.org/fhir/ValueSet/data-absent-reason"
  val values    = findValues
  case object ASKED_BUT_DECLINED extends DATA_ABSENT_REASON("asked-declined") {
    def display: Option[String] = Some("Asked But Declined")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/data-absent-reason")
  }
  case object ASKED_BUT_UNKNOWN extends DATA_ABSENT_REASON("asked-unknown") {
    def display: Option[String] = Some("Asked But Unknown")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/data-absent-reason")
  }
  case object AS_TEXT extends DATA_ABSENT_REASON("as-text") {
    def display: Option[String] = Some("As Text")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/data-absent-reason")
  }
  case object ERROR extends DATA_ABSENT_REASON("error") {
    def display: Option[String] = Some("Error")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/data-absent-reason")
  }
  case object MASKED extends DATA_ABSENT_REASON("masked") {
    def display: Option[String] = Some("Masked")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/data-absent-reason")
  }
  case object NEGATIVE_INFINITY extends DATA_ABSENT_REASON("negative-infinity") {
    def display: Option[String] = Some("Negative Infinity (NINF)")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/data-absent-reason")
  }
  case object NOT_APPLICABLE extends DATA_ABSENT_REASON("not-applicable") {
    def display: Option[String] = Some("Not Applicable")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/data-absent-reason")
  }
  case object NOT_ASKED extends DATA_ABSENT_REASON("not-asked") {
    def display: Option[String] = Some("Not Asked")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/data-absent-reason")
  }
  case object NOT_A_NUMBER extends DATA_ABSENT_REASON("not-a-number") {
    def display: Option[String] = Some("Not a Number (NaN)")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/data-absent-reason")
  }
  case object NOT_PERFORMED extends DATA_ABSENT_REASON("not-performed") {
    def display: Option[String] = Some("Not Performed")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/data-absent-reason")
  }
  case object NOT_PERMITTED extends DATA_ABSENT_REASON("not-permitted") {
    def display: Option[String] = Some("Not Permitted")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/data-absent-reason")
  }
  case object POSITIVE_INFINITY extends DATA_ABSENT_REASON("positive-infinity") {
    def display: Option[String] = Some("Positive Infinity (PINF)")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/data-absent-reason")
  }
  case object TEMPORARILY_UNKNOWN extends DATA_ABSENT_REASON("temp-unknown") {
    def display: Option[String] = Some("Temporarily Unknown")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/data-absent-reason")
  }
  case object UNKNOWN extends DATA_ABSENT_REASON("unknown") {
    def display: Option[String] = Some("Unknown")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/data-absent-reason")
  }
  case object UNSUPPORTED extends DATA_ABSENT_REASON("unsupported") {
    def display: Option[String] = Some("Unsupported")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/data-absent-reason")
  }
}

sealed abstract class DATA_TYPES(override val entryName: String) extends EnumeratumBase with Product with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object DATA_TYPES extends FhirEnum[DATA_TYPES] with FhirCirceEnum[DATA_TYPES] {
  val reference = "http://hl7.org/fhir/ValueSet/data-types"
  val values    = findValues
  case object ADDRESS extends DATA_TYPES("Address") {
    def display: Option[String] = Some("Address")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object AGE extends DATA_TYPES("Age") {
    def display: Option[String] = Some("Age")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object ANNOTATION extends DATA_TYPES("Annotation") {
    def display: Option[String] = Some("Annotation")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object ATTACHMENT extends DATA_TYPES("Attachment") {
    def display: Option[String] = Some("Attachment")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object BACKBONEELEMENT extends DATA_TYPES("BackboneElement") {
    def display: Option[String] = Some("BackboneElement")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object BASE64BINARY extends DATA_TYPES("base64Binary") {
    def display: Option[String] = Some("base64Binary")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object BOOLEAN extends DATA_TYPES("boolean") {
    def display: Option[String] = Some("boolean")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object CANONICAL extends DATA_TYPES("canonical") {
    def display: Option[String] = Some("canonical")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object CODE extends DATA_TYPES("code") {
    def display: Option[String] = Some("code")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object CODEABLECONCEPT extends DATA_TYPES("CodeableConcept") {
    def display: Option[String] = Some("CodeableConcept")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object CODING extends DATA_TYPES("Coding") {
    def display: Option[String] = Some("Coding")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object CONTACTDETAIL extends DATA_TYPES("ContactDetail") {
    def display: Option[String] = Some("ContactDetail")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object CONTACTPOINT extends DATA_TYPES("ContactPoint") {
    def display: Option[String] = Some("ContactPoint")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object CONTRIBUTOR extends DATA_TYPES("Contributor") {
    def display: Option[String] = Some("Contributor")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object COUNT extends DATA_TYPES("Count") {
    def display: Option[String] = Some("Count")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object DATAREQUIREMENT extends DATA_TYPES("DataRequirement") {
    def display: Option[String] = Some("DataRequirement")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object DATE extends DATA_TYPES("date") {
    def display: Option[String] = Some("date")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object DATETIME extends DATA_TYPES("dateTime") {
    def display: Option[String] = Some("dateTime")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object DECIMAL extends DATA_TYPES("decimal") {
    def display: Option[String] = Some("decimal")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object DISTANCE extends DATA_TYPES("Distance") {
    def display: Option[String] = Some("Distance")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object DOSAGE extends DATA_TYPES("Dosage") {
    def display: Option[String] = Some("Dosage")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object DURATION extends DATA_TYPES("Duration") {
    def display: Option[String] = Some("Duration")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object ELEMENT extends DATA_TYPES("Element") {
    def display: Option[String] = Some("Element")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object ELEMENTDEFINITION extends DATA_TYPES("ElementDefinition") {
    def display: Option[String] = Some("ElementDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object EXPRESSION extends DATA_TYPES("Expression") {
    def display: Option[String] = Some("Expression")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object EXTENSION extends DATA_TYPES("Extension") {
    def display: Option[String] = Some("Extension")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object HUMANNAME extends DATA_TYPES("HumanName") {
    def display: Option[String] = Some("HumanName")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object ID extends DATA_TYPES("id") {
    def display: Option[String] = Some("id")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object IDENTIFIER extends DATA_TYPES("Identifier") {
    def display: Option[String] = Some("Identifier")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object INSTANT extends DATA_TYPES("instant") {
    def display: Option[String] = Some("instant")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object INTEGER extends DATA_TYPES("integer") {
    def display: Option[String] = Some("integer")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object MARKDOWN extends DATA_TYPES("markdown") {
    def display: Option[String] = Some("markdown")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object MARKETINGSTATUS extends DATA_TYPES("MarketingStatus") {
    def display: Option[String] = Some("MarketingStatus")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object META extends DATA_TYPES("Meta") {
    def display: Option[String] = Some("Meta")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object MONEY extends DATA_TYPES("Money") {
    def display: Option[String] = Some("Money")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object MONEYQUANTITY extends DATA_TYPES("MoneyQuantity") {
    def display: Option[String] = Some("MoneyQuantity")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object NARRATIVE extends DATA_TYPES("Narrative") {
    def display: Option[String] = Some("Narrative")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object OID extends DATA_TYPES("oid") {
    def display: Option[String] = Some("oid")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object PARAMETERDEFINITION extends DATA_TYPES("ParameterDefinition") {
    def display: Option[String] = Some("ParameterDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object PERIOD extends DATA_TYPES("Period") {
    def display: Option[String] = Some("Period")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object POPULATION extends DATA_TYPES("Population") {
    def display: Option[String] = Some("Population")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object POSITIVEINT extends DATA_TYPES("positiveInt") {
    def display: Option[String] = Some("positiveInt")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object PRODCHARACTERISTIC extends DATA_TYPES("ProdCharacteristic") {
    def display: Option[String] = Some("ProdCharacteristic")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object PRODUCTSHELFLIFE extends DATA_TYPES("ProductShelfLife") {
    def display: Option[String] = Some("ProductShelfLife")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object QUANTITY extends DATA_TYPES("Quantity") {
    def display: Option[String] = Some("Quantity")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object RANGE extends DATA_TYPES("Range") {
    def display: Option[String] = Some("Range")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object RATIO extends DATA_TYPES("Ratio") {
    def display: Option[String] = Some("Ratio")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object REFERENCE extends DATA_TYPES("Reference") {
    def display: Option[String] = Some("Reference")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object RELATEDARTIFACT extends DATA_TYPES("RelatedArtifact") {
    def display: Option[String] = Some("RelatedArtifact")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object SAMPLEDDATA extends DATA_TYPES("SampledData") {
    def display: Option[String] = Some("SampledData")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object SIGNATURE extends DATA_TYPES("Signature") {
    def display: Option[String] = Some("Signature")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object SIMPLEQUANTITY extends DATA_TYPES("SimpleQuantity") {
    def display: Option[String] = Some("SimpleQuantity")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object STRING extends DATA_TYPES("string") {
    def display: Option[String] = Some("string")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object SUBSTANCEAMOUNT extends DATA_TYPES("SubstanceAmount") {
    def display: Option[String] = Some("SubstanceAmount")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object TIME extends DATA_TYPES("time") {
    def display: Option[String] = Some("time")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object TIMING extends DATA_TYPES("Timing") {
    def display: Option[String] = Some("Timing")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object TRIGGERDEFINITION extends DATA_TYPES("TriggerDefinition") {
    def display: Option[String] = Some("TriggerDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object UNSIGNEDINT extends DATA_TYPES("unsignedInt") {
    def display: Option[String] = Some("unsignedInt")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object URI extends DATA_TYPES("uri") {
    def display: Option[String] = Some("uri")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object URL extends DATA_TYPES("url") {
    def display: Option[String] = Some("url")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object USAGECONTEXT extends DATA_TYPES("UsageContext") {
    def display: Option[String] = Some("UsageContext")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object UUID extends DATA_TYPES("uuid") {
    def display: Option[String] = Some("uuid")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object XHTML extends DATA_TYPES("xhtml") {
    def display: Option[String] = Some("XHTML")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
}

sealed abstract class EXPANSION_PARAMETER_SOURCE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object EXPANSION_PARAMETER_SOURCE extends FhirEnum[EXPANSION_PARAMETER_SOURCE] with FhirCirceEnum[EXPANSION_PARAMETER_SOURCE] {
  val reference = "http://hl7.org/fhir/ValueSet/expansion-parameter-source"
  val values    = findValues
  case object CODESYSTEM extends EXPANSION_PARAMETER_SOURCE("codesystem") {
    def display: Option[String] = Some("Code System")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/expansion-parameter-source")
  }
  case object INPUT extends EXPANSION_PARAMETER_SOURCE("input") {
    def display: Option[String] = Some("Client Input")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/expansion-parameter-source")
  }
  case object SERVER extends EXPANSION_PARAMETER_SOURCE("server") {
    def display: Option[String] = Some("Server Engine")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/expansion-parameter-source")
  }
}

sealed abstract class EXPANSION_PROCESSING_RULE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object EXPANSION_PROCESSING_RULE extends FhirEnum[EXPANSION_PROCESSING_RULE] with FhirCirceEnum[EXPANSION_PROCESSING_RULE] {
  val reference = "http://hl7.org/fhir/ValueSet/expansion-processing-rule"
  val values    = findValues
  case object ALL_CODES extends EXPANSION_PROCESSING_RULE("all-codes") {
    def display: Option[String] = Some("All Codes")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/expansion-processing-rule")
  }
  case object GROUPS_ONLY extends EXPANSION_PROCESSING_RULE("groups-only") {
    def display: Option[String] = Some("Groups Only")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/expansion-processing-rule")
  }
  case object UNGROUPED extends EXPANSION_PROCESSING_RULE("ungrouped") {
    def display: Option[String] = Some("Groups + Ungrouped codes")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/expansion-processing-rule")
  }
}

sealed abstract class HL7_WORK_GROUP(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object HL7_WORK_GROUP extends FhirEnum[HL7_WORK_GROUP] with FhirCirceEnum[HL7_WORK_GROUP] {
  val reference = "http://hl7.org/fhir/ValueSet/hl7-work-group"
  val values    = findValues
  case object AID extends HL7_WORK_GROUP("aid") {
    def display: Option[String] = Some("Application Implementation and Design")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/hl7-work-group")
  }
  case object BRR extends HL7_WORK_GROUP("brr") {
    def display: Option[String] = Some("Biomedical Research and Regulation")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/hl7-work-group")
  }
  case object CBCC extends HL7_WORK_GROUP("cbcc") {
    def display: Option[String] = Some("Community Based Collaborative Care")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/hl7-work-group")
  }
  case object CDS extends HL7_WORK_GROUP("cds") {
    def display: Option[String] = Some("Clinical Decision Support")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/hl7-work-group")
  }
  case object CG extends HL7_WORK_GROUP("cg") {
    def display: Option[String] = Some("Clinical Genomics")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/hl7-work-group")
  }
  case object CQI extends HL7_WORK_GROUP("cqi") {
    def display: Option[String] = Some("Clinical Quality Information")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/hl7-work-group")
  }
  case object DEV extends HL7_WORK_GROUP("dev") {
    def display: Option[String] = Some("Health Care Devices")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/hl7-work-group")
  }
  case object EHR extends HL7_WORK_GROUP("ehr") {
    def display: Option[String] = Some("Electronic Health Records")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/hl7-work-group")
  }
  case object FHIR extends HL7_WORK_GROUP("fhir") {
    def display: Option[String] = Some("FHIR Infrastructure")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/hl7-work-group")
  }
  case object FM extends HL7_WORK_GROUP("fm") {
    def display: Option[String] = Some("Financial Management")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/hl7-work-group")
  }
  case object HSI extends HL7_WORK_GROUP("hsi") {
    def display: Option[String] = Some("Health Standards Integration")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/hl7-work-group")
  }
  case object II extends HL7_WORK_GROUP("ii") {
    def display: Option[String] = Some("Imaging Integration")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/hl7-work-group")
  }
  case object INM extends HL7_WORK_GROUP("inm") {
    def display: Option[String] = Some("Infrastructure And Messaging")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/hl7-work-group")
  }
  case object ITS extends HL7_WORK_GROUP("its") {
    def display: Option[String] = Some("Implementable Technology Specifications")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/hl7-work-group")
  }
  case object MNM extends HL7_WORK_GROUP("mnm") {
    def display: Option[String] = Some("Modeling and Methodology")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/hl7-work-group")
  }
  case object OO extends HL7_WORK_GROUP("oo") {
    def display: Option[String] = Some("Orders and Observations")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/hl7-work-group")
  }
  case object PA extends HL7_WORK_GROUP("pa") {
    def display: Option[String] = Some("Patient Administration")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/hl7-work-group")
  }
  case object PC extends HL7_WORK_GROUP("pc") {
    def display: Option[String] = Some("Patient Care")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/hl7-work-group")
  }
  case object PHER extends HL7_WORK_GROUP("pher") {
    def display: Option[String] = Some("Public Health and Emergency Response")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/hl7-work-group")
  }
  case object PHX extends HL7_WORK_GROUP("phx") {
    def display: Option[String] = Some("Pharmacy")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/hl7-work-group")
  }
  case object SD extends HL7_WORK_GROUP("sd") {
    def display: Option[String] = Some("Structured Documents")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/hl7-work-group")
  }
  case object SEC extends HL7_WORK_GROUP("sec") {
    def display: Option[String] = Some("Security")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/hl7-work-group")
  }
  case object US extends HL7_WORK_GROUP("us") {
    def display: Option[String] = Some("US Realm Taskforce")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/hl7-work-group")
  }
  case object VOCAB extends HL7_WORK_GROUP("vocab") {
    def display: Option[String] = Some("Vocabulary")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/hl7-work-group")
  }
}

sealed abstract class IMPLANTSTATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object IMPLANTSTATUS extends FhirEnum[IMPLANTSTATUS] with FhirCirceEnum[IMPLANTSTATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/implantStatus"
  val values    = findValues
  case object DISABLED extends IMPLANTSTATUS("disabled") {
    def display: Option[String] = Some("Disabled")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/implantStatus")
  }
  case object FUNCTIONAL extends IMPLANTSTATUS("functional") {
    def display: Option[String] = Some("Functional")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/implantStatus")
  }
  case object NON_FUNCTIONAL extends IMPLANTSTATUS("non-functional") {
    def display: Option[String] = Some("Non-Functional")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/implantStatus")
  }
  case object UNKNOWN extends IMPLANTSTATUS("unknown") {
    def display: Option[String] = Some("Unknown")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/implantStatus")
  }
}

sealed abstract class MATCH_GRADE(override val entryName: String) extends EnumeratumBase with Product with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object MATCH_GRADE extends FhirEnum[MATCH_GRADE] with FhirCirceEnum[MATCH_GRADE] {
  val reference = "http://hl7.org/fhir/ValueSet/match-grade"
  val values    = findValues
  case object CERTAIN extends MATCH_GRADE("certain") {
    def display: Option[String] = Some("Certain Match")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/match-grade")
  }
  case object CERTAINLY_NOT_A_MATCH extends MATCH_GRADE("certainly-not") {
    def display: Option[String] = Some("Certainly Not a Match")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/match-grade")
  }
  case object POSSIBLE extends MATCH_GRADE("possible") {
    def display: Option[String] = Some("Possible Match")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/match-grade")
  }
  case object PROBABLE extends MATCH_GRADE("probable") {
    def display: Option[String] = Some("Probable Match")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/match-grade")
  }
}

sealed abstract class NAME_ASSEMBLY_ORDER(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object NAME_ASSEMBLY_ORDER extends FhirEnum[NAME_ASSEMBLY_ORDER] with FhirCirceEnum[NAME_ASSEMBLY_ORDER] {
  val reference = "http://hl7.org/fhir/ValueSet/name-assembly-order"
  val values    = findValues
  case object F extends NAME_ASSEMBLY_ORDER("F") {
    def display: Option[String] = Some("Prefix Family Given Suffix")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v2-0444")
  }
  case object G extends NAME_ASSEMBLY_ORDER("G") {
    def display: Option[String] = Some("Prefix Given Family Suffix")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v2-0444")
  }
  case object NL1 extends NAME_ASSEMBLY_ORDER("NL1") {
    def display: Option[String] = Some("Own Name")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/name-assembly-order")
  }
  case object NL2 extends NAME_ASSEMBLY_ORDER("NL2") {
    def display: Option[String] = Some("Partner Name")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/name-assembly-order")
  }
  case object NL3 extends NAME_ASSEMBLY_ORDER("NL3") {
    def display: Option[String] = Some("Partner Name followed by Maiden Name")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/name-assembly-order")
  }
  case object NL4 extends NAME_ASSEMBLY_ORDER("NL4") {
    def display: Option[String] = Some("Own Name followed by Partner Name")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/name-assembly-order")
  }
  case object UNK extends NAME_ASSEMBLY_ORDER("UNK") {
    def display: Option[String] = Some("Unknown")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor")
  }
}

sealed abstract class NAME_PART_QUALIFIER(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object NAME_PART_QUALIFIER extends FhirEnum[NAME_PART_QUALIFIER] with FhirCirceEnum[NAME_PART_QUALIFIER] {
  val reference = "http://hl7.org/fhir/ValueSet/name-part-qualifier"
  val values    = findValues
  case object AC extends NAME_PART_QUALIFIER("AC") {
    def display: Option[String] = Some("Academic")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-EntityNamePartQualifierR2")
  }
  case object AD extends NAME_PART_QUALIFIER("AD") {
    def display: Option[String] = Some("Acquired")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-EntityNamePartQualifierR2")
  }
  case object BR extends NAME_PART_QUALIFIER("BR") {
    def display: Option[String] = Some("Birth")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-EntityNamePartQualifierR2")
  }
  case object CL extends NAME_PART_QUALIFIER("CL") {
    def display: Option[String] = Some("Call me")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-EntityNamePartQualifierR2")
  }
  case object HON extends NAME_PART_QUALIFIER("HON") {
    def display: Option[String] = Some("Honorific")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-EntityNamePartQualifierR2")
  }
  case object IN extends NAME_PART_QUALIFIER("IN") {
    def display: Option[String] = Some("Initial")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-EntityNamePartQualifierR2")
  }
  case object LS extends NAME_PART_QUALIFIER("LS") {
    def display: Option[String] = Some("Legal status")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-EntityNamePartQualifierR2")
  }
  case object MID extends NAME_PART_QUALIFIER("MID") {
    def display: Option[String] = Some("Middle Name")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-EntityNamePartQualifierR2")
  }
  case object NB extends NAME_PART_QUALIFIER("NB") {
    def display: Option[String] = Some("Nobility")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-EntityNamePartQualifierR2")
  }
  case object PR extends NAME_PART_QUALIFIER("PR") {
    def display: Option[String] = Some("Professional")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-EntityNamePartQualifierR2")
  }
  case object SP extends NAME_PART_QUALIFIER("SP") {
    def display: Option[String] = Some("Spouse")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-EntityNamePartQualifierR2")
  }
  case object VV extends NAME_PART_QUALIFIER("VV") {
    def display: Option[String] = Some("Voorvoegsel")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-EntityNamePartQualifier")
  }
}

sealed abstract class NAME_V3_REPRESENTATION(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object NAME_V3_REPRESENTATION extends FhirEnum[NAME_V3_REPRESENTATION] with FhirCirceEnum[NAME_V3_REPRESENTATION] {
  val reference = "http://hl7.org/fhir/ValueSet/name-v3-representation"
  val values    = findValues
  case object ABC extends NAME_V3_REPRESENTATION("ABC") {
    def display: Option[String] = Some("ABC")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUse")
  }
  case object IDE extends NAME_V3_REPRESENTATION("IDE") {
    def display: Option[String] = Some("IDE")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUse")
  }
  case object SYL extends NAME_V3_REPRESENTATION("SYL") {
    def display: Option[String] = Some("SYL")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUse")
  }
}

sealed abstract class POSTAL_ADDRESS_USE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object POSTAL_ADDRESS_USE extends FhirEnum[POSTAL_ADDRESS_USE] with FhirCirceEnum[POSTAL_ADDRESS_USE] {
  val reference = "http://hl7.org/fhir/ValueSet/postal-address-use"
  val values    = findValues
  case object BAD extends POSTAL_ADDRESS_USE("BAD") {
    def display: Option[String] = Some("bad address")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-AddressUse")
  }
  case object CONF extends POSTAL_ADDRESS_USE("CONF") {
    def display: Option[String] = Some("confidential address")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-AddressUse")
  }
  case object DIR extends POSTAL_ADDRESS_USE("DIR") {
    def display: Option[String] = Some("direct")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-AddressUse")
  }
  case object HP extends POSTAL_ADDRESS_USE("HP") {
    def display: Option[String] = Some("primary home")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-AddressUse")
  }
  case object HV extends POSTAL_ADDRESS_USE("HV") {
    def display: Option[String] = Some("vacation home")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-AddressUse")
  }
  case object PHYS extends POSTAL_ADDRESS_USE("PHYS") {
    def display: Option[String] = Some("physical visit address")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-AddressUse")
  }
  case object PST extends POSTAL_ADDRESS_USE("PST") {
    def display: Option[String] = Some("postal address")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-AddressUse")
  }
  case object PUB extends POSTAL_ADDRESS_USE("PUB") {
    def display: Option[String] = Some("public")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-AddressUse")
  }
}

sealed abstract class PROBABILITY_DISTRIBUTION_TYPE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object PROBABILITY_DISTRIBUTION_TYPE
    extends FhirEnum[PROBABILITY_DISTRIBUTION_TYPE]
    with FhirCirceEnum[PROBABILITY_DISTRIBUTION_TYPE] {
  val reference = "http://hl7.org/fhir/ValueSet/probability-distribution-type"
  val values    = findValues
  case object B extends PROBABILITY_DISTRIBUTION_TYPE("B") {
    def display: Option[String] = Some("beta")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-ProbabilityDistributionType")
  }
  case object E extends PROBABILITY_DISTRIBUTION_TYPE("E") {
    def display: Option[String] = Some("exponential")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-ProbabilityDistributionType")
  }
  case object F extends PROBABILITY_DISTRIBUTION_TYPE("F") {
    def display: Option[String] = Some("F")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-ProbabilityDistributionType")
  }
  case object G extends PROBABILITY_DISTRIBUTION_TYPE("G") {
    def display: Option[String] = Some("(gamma)")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-ProbabilityDistributionType")
  }
  case object LN extends PROBABILITY_DISTRIBUTION_TYPE("LN") {
    def display: Option[String] = Some("log-normal")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-ProbabilityDistributionType")
  }
  case object N extends PROBABILITY_DISTRIBUTION_TYPE("N") {
    def display: Option[String] = Some("normal (Gaussian)")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-ProbabilityDistributionType")
  }
  case object T extends PROBABILITY_DISTRIBUTION_TYPE("T") {
    def display: Option[String] = Some("T")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-ProbabilityDistributionType")
  }
  case object U extends PROBABILITY_DISTRIBUTION_TYPE("U") {
    def display: Option[String] = Some("uniform")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-ProbabilityDistributionType")
  }
  case object X2 extends PROBABILITY_DISTRIBUTION_TYPE("X2") {
    def display: Option[String] = Some("chi square")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-ProbabilityDistributionType")
  }
}

sealed abstract class QUESTIONNAIRE_USAGE_MODE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object QUESTIONNAIRE_USAGE_MODE extends FhirEnum[QUESTIONNAIRE_USAGE_MODE] with FhirCirceEnum[QUESTIONNAIRE_USAGE_MODE] {
  val reference = "http://hl7.org/fhir/ValueSet/questionnaire-usage-mode"
  val values    = findValues
  case object CAPTURE extends QUESTIONNAIRE_USAGE_MODE("capture") {
    def display: Option[String] = Some("Capture Only")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/questionnaire-usage-mode")
  }
  case object CAPTURE_DISPLAY extends QUESTIONNAIRE_USAGE_MODE("capture-display") {
    def display: Option[String] = Some("Capture & Display")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/questionnaire-usage-mode")
  }
  case object CAPTURE_DISPLAY_NON_EMPTY extends QUESTIONNAIRE_USAGE_MODE("capture-display-non-empty") {
    def display: Option[String] = Some("Capture or, if answered, Display")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/questionnaire-usage-mode")
  }
  case object DISPLAY extends QUESTIONNAIRE_USAGE_MODE("display") {
    def display: Option[String] = Some("Display Only")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/questionnaire-usage-mode")
  }
  case object DISPLAY_WHEN_ANSWERED extends QUESTIONNAIRE_USAGE_MODE("display-non-empty") {
    def display: Option[String] = Some("Display when Answered")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/questionnaire-usage-mode")
  }
}

sealed abstract class RESOURCE_SECURITY_CATEGORY(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object RESOURCE_SECURITY_CATEGORY extends FhirEnum[RESOURCE_SECURITY_CATEGORY] with FhirCirceEnum[RESOURCE_SECURITY_CATEGORY] {
  val reference = "http://hl7.org/fhir/ValueSet/resource-security-category"
  val values    = findValues
  case object ANONYMOUS extends RESOURCE_SECURITY_CATEGORY("anonymous") {
    def display: Option[String] = Some("Anonymous READ Access Resource")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/resource-security-category")
  }
  case object BUSINESS extends RESOURCE_SECURITY_CATEGORY("business") {
    def display: Option[String] = Some("Business Sensitive Resource")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/resource-security-category")
  }
  case object INDIVIDUAL extends RESOURCE_SECURITY_CATEGORY("individual") {
    def display: Option[String] = Some("Individual Sensitive Resource")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/resource-security-category")
  }
  case object NOT_CLASSIFIED extends RESOURCE_SECURITY_CATEGORY("not-classified") {
    def display: Option[String] = Some("Not classified")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/resource-security-category")
  }
  case object PATIENT extends RESOURCE_SECURITY_CATEGORY("patient") {
    def display: Option[String] = Some("Patient Sensitive")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/resource-security-category")
  }
}

sealed abstract class SMART_CAPABILITIES(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object SMART_CAPABILITIES extends FhirEnum[SMART_CAPABILITIES] with FhirCirceEnum[SMART_CAPABILITIES] {
  val reference = "http://hl7.org/fhir/ValueSet/smart-capabilities"
  val values    = findValues
  case object CONFIDENTIAL_CLIENT_PROFILE extends SMART_CAPABILITIES("client-confidential-symmetric") {
    def display: Option[String] = Some("Confidential Client Profile")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/smart-capabilities")
  }
  case object CONTEXT_EHR_ENCOUNTER extends SMART_CAPABILITIES("context-ehr-encounter") {
    def display: Option[String] = Some("Allows \"Encounter Level Launch Context (EHR)\"")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/smart-capabilities")
  }
  case object CONTEXT_EHR_PATIENT extends SMART_CAPABILITIES("context-ehr-patient") {
    def display: Option[String] = Some("Allows \"Patient Level Launch Context (EHR)\"")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/smart-capabilities")
  }
  case object CONTEXT_PASSTHROUGH_BANNER extends SMART_CAPABILITIES("context-passthrough-banner") {
    def display: Option[String] = Some("Allows \"Need Patient Banner\"")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/smart-capabilities")
  }
  case object CONTEXT_PASSTHROUGH_STYLE extends SMART_CAPABILITIES("context-passthrough-style") {
    def display: Option[String] = Some("Allows \"Smart Style Style\"")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/smart-capabilities")
  }
  case object CONTEXT_STANDALONE_ENCOUNTER extends SMART_CAPABILITIES("context-standalone-encounter") {
    def display: Option[String] = Some("Allows \"Encounter Level Launch Context (STANDALONE)\"")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/smart-capabilities")
  }
  case object CONTEXT_STANDALONE_PATIENT extends SMART_CAPABILITIES("context-standalone-patient") {
    def display: Option[String] = Some("Allows \"Patient Level Launch Context (STANDALONE)\"")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/smart-capabilities")
  }
  case object EHR_LAUNCH_MODE extends SMART_CAPABILITIES("launch-ehr") {
    def display: Option[String] = Some("EHR Launch Mode")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/smart-capabilities")
  }
  case object PUBLIC_CLIENT_PROFILE extends SMART_CAPABILITIES("client-public") {
    def display: Option[String] = Some("Public Client Profile")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/smart-capabilities")
  }
  case object STANDALONE_LAUNCH_MODE extends SMART_CAPABILITIES("launch-standalone") {
    def display: Option[String] = Some("Standalone Launch Mode")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/smart-capabilities")
  }
  case object SUPPORTS_OPENID_CONNECT extends SMART_CAPABILITIES("sso-openid-connect") {
    def display: Option[String] = Some("Supports OpenID Connect")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/smart-capabilities")
  }
  case object SUPPORTS_PATIENT_LEVEL_SCOPES extends SMART_CAPABILITIES("permission-patient") {
    def display: Option[String] = Some("Supports Patient Level Scopes")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/smart-capabilities")
  }
  case object SUPPORTS_REFRESH_TOKEN extends SMART_CAPABILITIES("permission-offline") {
    def display: Option[String] = Some("Supports Refresh Token")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/smart-capabilities")
  }
  case object SUPPORTS_USER_LEVEL_SCOPES extends SMART_CAPABILITIES("permission-user") {
    def display: Option[String] = Some("Supports User Level Scopes")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/smart-capabilities")
  }
}

sealed abstract class STANDARDS_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object STANDARDS_STATUS extends FhirEnum[STANDARDS_STATUS] with FhirCirceEnum[STANDARDS_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/standards-status"
  val values    = findValues
  case object DEPRECATED extends STANDARDS_STATUS("deprecated") {
    def display: Option[String] = Some("Deprecated")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/standards-status")
  }
  case object DRAFT extends STANDARDS_STATUS("draft") {
    def display: Option[String] = Some("Draft")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/standards-status")
  }
  case object EXTERNAL extends STANDARDS_STATUS("external") {
    def display: Option[String] = Some("External")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/standards-status")
  }
  case object INFORMATIVE extends STANDARDS_STATUS("informative") {
    def display: Option[String] = Some("Informative")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/standards-status")
  }
  case object NORMATIVE extends STANDARDS_STATUS("normative") {
    def display: Option[String] = Some("Normative")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/standards-status")
  }
  case object TRIAL_USE extends STANDARDS_STATUS("trial-use") {
    def display: Option[String] = Some("Trial-Use")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/standards-status")
  }
}

sealed abstract class TEMPLATE_STATUS_CODE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object TEMPLATE_STATUS_CODE extends FhirEnum[TEMPLATE_STATUS_CODE] with FhirCirceEnum[TEMPLATE_STATUS_CODE] {
  val reference = "http://hl7.org/fhir/ValueSet/template-status-code"
  val values    = findValues
  case object ACTIVE extends TEMPLATE_STATUS_CODE("active") {
    def display: Option[String] = Some("Active")
    def system: Option[String]  = Some("urn:oid:2.16.840.1.113883.3.1937.98.5.8")
  }
  case object CANCELLED extends TEMPLATE_STATUS_CODE("cancelled") {
    def display: Option[String] = Some("Cancelled")
    def system: Option[String]  = Some("urn:oid:2.16.840.1.113883.3.1937.98.5.8")
  }
  case object DRAFT extends TEMPLATE_STATUS_CODE("draft") {
    def display: Option[String] = Some("Draft")
    def system: Option[String]  = Some("urn:oid:2.16.840.1.113883.3.1937.98.5.8")
  }
  case object PENDING extends TEMPLATE_STATUS_CODE("pending") {
    def display: Option[String] = Some("Under pre-publication review")
    def system: Option[String]  = Some("urn:oid:2.16.840.1.113883.3.1937.98.5.8")
  }
  case object REJECTED extends TEMPLATE_STATUS_CODE("rejected") {
    def display: Option[String] = Some("Rejected")
    def system: Option[String]  = Some("urn:oid:2.16.840.1.113883.3.1937.98.5.8")
  }
  case object RETIRED extends TEMPLATE_STATUS_CODE("retired") {
    def display: Option[String] = Some("Retired")
    def system: Option[String]  = Some("urn:oid:2.16.840.1.113883.3.1937.98.5.8")
  }
  case object REVIEW extends TEMPLATE_STATUS_CODE("review") {
    def display: Option[String] = Some("In Review")
    def system: Option[String]  = Some("urn:oid:2.16.840.1.113883.3.1937.98.5.8")
  }
  case object TERMINATED extends TEMPLATE_STATUS_CODE("terminated") {
    def display: Option[String] = Some("Terminated")
    def system: Option[String]  = Some("urn:oid:2.16.840.1.113883.3.1937.98.5.8")
  }
}

sealed abstract class V3_ENTITYNAMEUSER2(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object V3_ENTITYNAMEUSER2 extends FhirEnum[V3_ENTITYNAMEUSER2] with FhirCirceEnum[V3_ENTITYNAMEUSER2] {
  val reference = "http://terminology.hl7.org/ValueSet/v3-EntityNameUseR2"
  val values    = findValues
  case object A extends V3_ENTITYNAMEUSER2("A") {
    def display: Option[String] = Some("business name")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2")
  }
  case object ABC extends V3_ENTITYNAMEUSER2("ABC") {
    def display: Option[String] = Some("alphabetic")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2")
  }
  case object ANON extends V3_ENTITYNAMEUSER2("ANON") {
    def display: Option[String] = Some("Anonymous")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2")
  }
  case object ASSUMED extends V3_ENTITYNAMEUSER2("Assumed") {
    def display: Option[String] = Some("Assumed")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2")
  }
  case object C extends V3_ENTITYNAMEUSER2("C") {
    def display: Option[String] = Some("customary")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2")
  }
  case object DN extends V3_ENTITYNAMEUSER2("DN") {
    def display: Option[String] = Some("do not use")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2")
  }
  case object I extends V3_ENTITYNAMEUSER2("I") {
    def display: Option[String] = Some("Indigenous/Tribal")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2")
  }
  case object IDE extends V3_ENTITYNAMEUSER2("IDE") {
    def display: Option[String] = Some("ideographic")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2")
  }
  case object M extends V3_ENTITYNAMEUSER2("M") {
    def display: Option[String] = Some("maiden name")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2")
  }
  case object NAMEREPRESENTATIONUSE extends V3_ENTITYNAMEUSER2("NameRepresentationUse") {
    def display: Option[String] = Some("NameRepresentationUse")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2")
  }
  case object OLD extends V3_ENTITYNAMEUSER2("OLD") {
    def display: Option[String] = Some("no longer in use")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2")
  }
  case object OR extends V3_ENTITYNAMEUSER2("OR") {
    def display: Option[String] = Some("official registry name")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2")
  }
  case object P extends V3_ENTITYNAMEUSER2("P") {
    def display: Option[String] = Some("Other/Pseudonym/Alias")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2")
  }
  case object PHON extends V3_ENTITYNAMEUSER2("PHON") {
    def display: Option[String] = Some("phonetic")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2")
  }
  case object R extends V3_ENTITYNAMEUSER2("R") {
    def display: Option[String] = Some("religious")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2")
  }
  case object SRCH extends V3_ENTITYNAMEUSER2("SRCH") {
    def display: Option[String] = Some("search")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2")
  }
  case object SYL extends V3_ENTITYNAMEUSER2("SYL") {
    def display: Option[String] = Some("syllabic")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2")
  }
  case object T extends V3_ENTITYNAMEUSER2("T") {
    def display: Option[String] = Some("temporary")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2")
  }
}

sealed abstract class V3_NULLFLAVOR(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object V3_NULLFLAVOR extends FhirEnum[V3_NULLFLAVOR] with FhirCirceEnum[V3_NULLFLAVOR] {
  val reference = "http://terminology.hl7.org/ValueSet/v3-NullFlavor"
  val values    = findValues
  case object ASKU extends V3_NULLFLAVOR("ASKU") {
    def display: Option[String] = Some("asked but unknown")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor")
  }
  case object DER extends V3_NULLFLAVOR("DER") {
    def display: Option[String] = Some("derived")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor")
  }
  case object INV extends V3_NULLFLAVOR("INV") {
    def display: Option[String] = Some("invalid")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor")
  }
  case object MSK extends V3_NULLFLAVOR("MSK") {
    def display: Option[String] = Some("masked")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor")
  }
  case object NA extends V3_NULLFLAVOR("NA") {
    def display: Option[String] = Some("not applicable")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor")
  }
  case object NASK extends V3_NULLFLAVOR("NASK") {
    def display: Option[String] = Some("not asked")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor")
  }
  case object NAV extends V3_NULLFLAVOR("NAV") {
    def display: Option[String] = Some("temporarily unavailable")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor")
  }
  case object NAVU extends V3_NULLFLAVOR("NAVU") {
    def display: Option[String] = Some("Not available")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor")
  }
  case object NI extends V3_NULLFLAVOR("NI") {
    def display: Option[String] = Some("NoInformation")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor")
  }
  case object NINF extends V3_NULLFLAVOR("NINF") {
    def display: Option[String] = Some("negative infinity")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor")
  }
  case object NP extends V3_NULLFLAVOR("NP") {
    def display: Option[String] = Some("not present")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor")
  }
  case object OTH extends V3_NULLFLAVOR("OTH") {
    def display: Option[String] = Some("other")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor")
  }
  case object PINF extends V3_NULLFLAVOR("PINF") {
    def display: Option[String] = Some("positive infinity")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor")
  }
  case object QS extends V3_NULLFLAVOR("QS") {
    def display: Option[String] = Some("Sufficient Quantity")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor")
  }
  case object TRC extends V3_NULLFLAVOR("TRC") {
    def display: Option[String] = Some("trace")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor")
  }
  case object UNC extends V3_NULLFLAVOR("UNC") {
    def display: Option[String] = Some("un-encoded")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor")
  }
  case object UNK extends V3_NULLFLAVOR("UNK") {
    def display: Option[String] = Some("unknown")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor")
  }
}
