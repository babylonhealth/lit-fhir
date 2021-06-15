package com.babylonhealth.lit.usbase

import scala.reflect.ClassTag
import scala.util.{ Success, Try }

import io.circe.{ Decoder, DecodingFailure, Encoder, HCursor, Json }

import com.babylonhealth.lit.core.{ EnumBase, EType, ToCodingAble, ETypeWithFallback }
import com.babylonhealth.lit.core.model.Coding
enum CHOICE_LIST_ORIENTATION(val name: String, val display: Option[String], val system: Option[String])
    extends ToCodingAble {
  case HORIZONTAL
      extends CHOICE_LIST_ORIENTATION(
        "horizontal",
        Some("Horizontal"),
        Some("http://terminology.hl7.org/CodeSystem/choice-list-orientation"))
  case VERTICAL
      extends CHOICE_LIST_ORIENTATION(
        "vertical",
        Some("Vertical"),
        Some("http://terminology.hl7.org/CodeSystem/choice-list-orientation"))
}
object CHOICE_LIST_ORIENTATION
    extends EType[CHOICE_LIST_ORIENTATION]("http://hl7.org/fhir/ValueSet/choice-list-orientation")

enum CONFORMANCE_EXPECTATION(val name: String, val display: Option[String], val system: Option[String])
    extends ToCodingAble {
  case MAY
      extends CONFORMANCE_EXPECTATION(
        "MAY",
        Some("MAY"),
        Some("http://terminology.hl7.org/CodeSystem/conformance-expectation"))
  case SHALL
      extends CONFORMANCE_EXPECTATION(
        "SHALL",
        Some("SHALL"),
        Some("http://terminology.hl7.org/CodeSystem/conformance-expectation"))
  case SHOULD
      extends CONFORMANCE_EXPECTATION(
        "SHOULD",
        Some("SHOULD"),
        Some("http://terminology.hl7.org/CodeSystem/conformance-expectation"))
  case SHOULD_NOT
      extends CONFORMANCE_EXPECTATION(
        "SHOULD-NOT",
        Some("SHOULD-NOT"),
        Some("http://terminology.hl7.org/CodeSystem/conformance-expectation"))
}
object CONFORMANCE_EXPECTATION
    extends EType[CONFORMANCE_EXPECTATION]("http://hl7.org/fhir/ValueSet/conformance-expectation")

enum DATA_ABSENT_REASON(val name: String, val display: Option[String], val system: Option[String])
    extends ToCodingAble {
  case ASKED_BUT_DECLINED
      extends DATA_ABSENT_REASON(
        "asked-declined",
        Some("Asked But Declined"),
        Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
  case ASKED_BUT_UNKNOWN
      extends DATA_ABSENT_REASON(
        "asked-unknown",
        Some("Asked But Unknown"),
        Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
  case AS_TEXT
      extends DATA_ABSENT_REASON(
        "as-text",
        Some("As Text"),
        Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
  case ERROR
      extends DATA_ABSENT_REASON(
        "error",
        Some("Error"),
        Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
  case MASKED
      extends DATA_ABSENT_REASON(
        "masked",
        Some("Masked"),
        Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
  case NEGATIVE_INFINITY
      extends DATA_ABSENT_REASON(
        "negative-infinity",
        Some("Negative Infinity (NINF)"),
        Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
  case NOT_APPLICABLE
      extends DATA_ABSENT_REASON(
        "not-applicable",
        Some("Not Applicable"),
        Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
  case NOT_ASKED
      extends DATA_ABSENT_REASON(
        "not-asked",
        Some("Not Asked"),
        Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
  case NOT_A_NUMBER
      extends DATA_ABSENT_REASON(
        "not-a-number",
        Some("Not a Number (NaN)"),
        Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
  case NOT_PERFORMED
      extends DATA_ABSENT_REASON(
        "not-performed",
        Some("Not Performed"),
        Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
  case NOT_PERMITTED
      extends DATA_ABSENT_REASON(
        "not-permitted",
        Some("Not Permitted"),
        Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
  case POSITIVE_INFINITY
      extends DATA_ABSENT_REASON(
        "positive-infinity",
        Some("Positive Infinity (PINF)"),
        Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
  case TEMPORARILY_UNKNOWN
      extends DATA_ABSENT_REASON(
        "temp-unknown",
        Some("Temporarily Unknown"),
        Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
  case UNKNOWN
      extends DATA_ABSENT_REASON(
        "unknown",
        Some("Unknown"),
        Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
  case UNSUPPORTED
      extends DATA_ABSENT_REASON(
        "unsupported",
        Some("Unsupported"),
        Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
}
object DATA_ABSENT_REASON extends EType[DATA_ABSENT_REASON]("http://hl7.org/fhir/ValueSet/data-absent-reason")

enum DATA_TYPES(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ADDRESS extends DATA_TYPES("Address", Some("Address"), Some("http://hl7.org/fhir/data-types"))
  case AGE extends DATA_TYPES("Age", Some("Age"), Some("http://hl7.org/fhir/data-types"))
  case ANNOTATION extends DATA_TYPES("Annotation", Some("Annotation"), Some("http://hl7.org/fhir/data-types"))
  case ATTACHMENT extends DATA_TYPES("Attachment", Some("Attachment"), Some("http://hl7.org/fhir/data-types"))
  case BACKBONEELEMENT
      extends DATA_TYPES("BackboneElement", Some("BackboneElement"), Some("http://hl7.org/fhir/data-types"))
  case BASE64BINARY extends DATA_TYPES("base64Binary", Some("base64Binary"), Some("http://hl7.org/fhir/data-types"))
  case BOOLEAN extends DATA_TYPES("boolean", Some("boolean"), Some("http://hl7.org/fhir/data-types"))
  case CANONICAL extends DATA_TYPES("canonical", Some("canonical"), Some("http://hl7.org/fhir/data-types"))
  case CODE extends DATA_TYPES("code", Some("code"), Some("http://hl7.org/fhir/data-types"))
  case CODEABLECONCEPT
      extends DATA_TYPES("CodeableConcept", Some("CodeableConcept"), Some("http://hl7.org/fhir/data-types"))
  case CODING extends DATA_TYPES("Coding", Some("Coding"), Some("http://hl7.org/fhir/data-types"))
  case CONTACTDETAIL extends DATA_TYPES("ContactDetail", Some("ContactDetail"), Some("http://hl7.org/fhir/data-types"))
  case CONTACTPOINT extends DATA_TYPES("ContactPoint", Some("ContactPoint"), Some("http://hl7.org/fhir/data-types"))
  case CONTRIBUTOR extends DATA_TYPES("Contributor", Some("Contributor"), Some("http://hl7.org/fhir/data-types"))
  case COUNT extends DATA_TYPES("Count", Some("Count"), Some("http://hl7.org/fhir/data-types"))
  case DATAREQUIREMENT
      extends DATA_TYPES("DataRequirement", Some("DataRequirement"), Some("http://hl7.org/fhir/data-types"))
  case DATE extends DATA_TYPES("date", Some("date"), Some("http://hl7.org/fhir/data-types"))
  case DATETIME extends DATA_TYPES("dateTime", Some("dateTime"), Some("http://hl7.org/fhir/data-types"))
  case DECIMAL extends DATA_TYPES("decimal", Some("decimal"), Some("http://hl7.org/fhir/data-types"))
  case DISTANCE extends DATA_TYPES("Distance", Some("Distance"), Some("http://hl7.org/fhir/data-types"))
  case DOSAGE extends DATA_TYPES("Dosage", Some("Dosage"), Some("http://hl7.org/fhir/data-types"))
  case DURATION extends DATA_TYPES("Duration", Some("Duration"), Some("http://hl7.org/fhir/data-types"))
  case ELEMENT extends DATA_TYPES("Element", Some("Element"), Some("http://hl7.org/fhir/data-types"))
  case ELEMENTDEFINITION
      extends DATA_TYPES("ElementDefinition", Some("ElementDefinition"), Some("http://hl7.org/fhir/data-types"))
  case EXPRESSION extends DATA_TYPES("Expression", Some("Expression"), Some("http://hl7.org/fhir/data-types"))
  case EXTENSION extends DATA_TYPES("Extension", Some("Extension"), Some("http://hl7.org/fhir/data-types"))
  case HUMANNAME extends DATA_TYPES("HumanName", Some("HumanName"), Some("http://hl7.org/fhir/data-types"))
  case ID extends DATA_TYPES("id", Some("id"), Some("http://hl7.org/fhir/data-types"))
  case IDENTIFIER extends DATA_TYPES("Identifier", Some("Identifier"), Some("http://hl7.org/fhir/data-types"))
  case INSTANT extends DATA_TYPES("instant", Some("instant"), Some("http://hl7.org/fhir/data-types"))
  case INTEGER extends DATA_TYPES("integer", Some("integer"), Some("http://hl7.org/fhir/data-types"))
  case MARKDOWN extends DATA_TYPES("markdown", Some("markdown"), Some("http://hl7.org/fhir/data-types"))
  case MARKETINGSTATUS
      extends DATA_TYPES("MarketingStatus", Some("MarketingStatus"), Some("http://hl7.org/fhir/data-types"))
  case META extends DATA_TYPES("Meta", Some("Meta"), Some("http://hl7.org/fhir/data-types"))
  case MONEY extends DATA_TYPES("Money", Some("Money"), Some("http://hl7.org/fhir/data-types"))
  case MONEYQUANTITY extends DATA_TYPES("MoneyQuantity", Some("MoneyQuantity"), Some("http://hl7.org/fhir/data-types"))
  case NARRATIVE extends DATA_TYPES("Narrative", Some("Narrative"), Some("http://hl7.org/fhir/data-types"))
  case OID extends DATA_TYPES("oid", Some("oid"), Some("http://hl7.org/fhir/data-types"))
  case PARAMETERDEFINITION
      extends DATA_TYPES("ParameterDefinition", Some("ParameterDefinition"), Some("http://hl7.org/fhir/data-types"))
  case PERIOD extends DATA_TYPES("Period", Some("Period"), Some("http://hl7.org/fhir/data-types"))
  case POPULATION extends DATA_TYPES("Population", Some("Population"), Some("http://hl7.org/fhir/data-types"))
  case POSITIVEINT extends DATA_TYPES("positiveInt", Some("positiveInt"), Some("http://hl7.org/fhir/data-types"))
  case PRODCHARACTERISTIC
      extends DATA_TYPES("ProdCharacteristic", Some("ProdCharacteristic"), Some("http://hl7.org/fhir/data-types"))
  case PRODUCTSHELFLIFE
      extends DATA_TYPES("ProductShelfLife", Some("ProductShelfLife"), Some("http://hl7.org/fhir/data-types"))
  case QUANTITY extends DATA_TYPES("Quantity", Some("Quantity"), Some("http://hl7.org/fhir/data-types"))
  case RANGE extends DATA_TYPES("Range", Some("Range"), Some("http://hl7.org/fhir/data-types"))
  case RATIO extends DATA_TYPES("Ratio", Some("Ratio"), Some("http://hl7.org/fhir/data-types"))
  case REFERENCE extends DATA_TYPES("Reference", Some("Reference"), Some("http://hl7.org/fhir/data-types"))
  case RELATEDARTIFACT
      extends DATA_TYPES("RelatedArtifact", Some("RelatedArtifact"), Some("http://hl7.org/fhir/data-types"))
  case SAMPLEDDATA extends DATA_TYPES("SampledData", Some("SampledData"), Some("http://hl7.org/fhir/data-types"))
  case SIGNATURE extends DATA_TYPES("Signature", Some("Signature"), Some("http://hl7.org/fhir/data-types"))
  case SIMPLEQUANTITY
      extends DATA_TYPES("SimpleQuantity", Some("SimpleQuantity"), Some("http://hl7.org/fhir/data-types"))
  case STRING extends DATA_TYPES("string", Some("string"), Some("http://hl7.org/fhir/data-types"))
  case SUBSTANCEAMOUNT
      extends DATA_TYPES("SubstanceAmount", Some("SubstanceAmount"), Some("http://hl7.org/fhir/data-types"))
  case TIME extends DATA_TYPES("time", Some("time"), Some("http://hl7.org/fhir/data-types"))
  case TIMING extends DATA_TYPES("Timing", Some("Timing"), Some("http://hl7.org/fhir/data-types"))
  case TRIGGERDEFINITION
      extends DATA_TYPES("TriggerDefinition", Some("TriggerDefinition"), Some("http://hl7.org/fhir/data-types"))
  case UNSIGNEDINT extends DATA_TYPES("unsignedInt", Some("unsignedInt"), Some("http://hl7.org/fhir/data-types"))
  case URI extends DATA_TYPES("uri", Some("uri"), Some("http://hl7.org/fhir/data-types"))
  case URL extends DATA_TYPES("url", Some("url"), Some("http://hl7.org/fhir/data-types"))
  case USAGECONTEXT extends DATA_TYPES("UsageContext", Some("UsageContext"), Some("http://hl7.org/fhir/data-types"))
  case UUID extends DATA_TYPES("uuid", Some("uuid"), Some("http://hl7.org/fhir/data-types"))
  case XHTML extends DATA_TYPES("xhtml", Some("XHTML"), Some("http://hl7.org/fhir/data-types"))
}
object DATA_TYPES extends EType[DATA_TYPES]("http://hl7.org/fhir/ValueSet/data-types")

enum EXPANSION_PARAMETER_SOURCE(val name: String, val display: Option[String], val system: Option[String])
    extends ToCodingAble {
  case CODESYSTEM
      extends EXPANSION_PARAMETER_SOURCE(
        "codesystem",
        Some("Code System"),
        Some("http://terminology.hl7.org/CodeSystem/expansion-parameter-source"))
  case INPUT
      extends EXPANSION_PARAMETER_SOURCE(
        "input",
        Some("Client Input"),
        Some("http://terminology.hl7.org/CodeSystem/expansion-parameter-source"))
  case SERVER
      extends EXPANSION_PARAMETER_SOURCE(
        "server",
        Some("Server Engine"),
        Some("http://terminology.hl7.org/CodeSystem/expansion-parameter-source"))
}
object EXPANSION_PARAMETER_SOURCE
    extends EType[EXPANSION_PARAMETER_SOURCE]("http://hl7.org/fhir/ValueSet/expansion-parameter-source")

enum EXPANSION_PROCESSING_RULE(val name: String, val display: Option[String], val system: Option[String])
    extends ToCodingAble {
  case ALL_CODES
      extends EXPANSION_PROCESSING_RULE(
        "all-codes",
        Some("All Codes"),
        Some("http://terminology.hl7.org/CodeSystem/expansion-processing-rule"))
  case GROUPS_ONLY
      extends EXPANSION_PROCESSING_RULE(
        "groups-only",
        Some("Groups Only"),
        Some("http://terminology.hl7.org/CodeSystem/expansion-processing-rule"))
  case UNGROUPED
      extends EXPANSION_PROCESSING_RULE(
        "ungrouped",
        Some("Groups + Ungrouped codes"),
        Some("http://terminology.hl7.org/CodeSystem/expansion-processing-rule"))
}
object EXPANSION_PROCESSING_RULE
    extends EType[EXPANSION_PROCESSING_RULE]("http://hl7.org/fhir/ValueSet/expansion-processing-rule")

enum HL7_WORK_GROUP(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case AID
      extends HL7_WORK_GROUP(
        "aid",
        Some("Application Implementation and Design"),
        Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case BRR
      extends HL7_WORK_GROUP(
        "brr",
        Some("Biomedical Research and Regulation"),
        Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case CBCC
      extends HL7_WORK_GROUP(
        "cbcc",
        Some("Community Based Collaborative Care"),
        Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case CDS
      extends HL7_WORK_GROUP(
        "cds",
        Some("Clinical Decision Support"),
        Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case CG
      extends HL7_WORK_GROUP(
        "cg",
        Some("Clinical Genomics"),
        Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case CQI
      extends HL7_WORK_GROUP(
        "cqi",
        Some("Clinical Quality Information"),
        Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case DEV
      extends HL7_WORK_GROUP(
        "dev",
        Some("Health Care Devices"),
        Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case EHR
      extends HL7_WORK_GROUP(
        "ehr",
        Some("Electronic Health Records"),
        Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case FHIR
      extends HL7_WORK_GROUP(
        "fhir",
        Some("FHIR Infrastructure"),
        Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case FM
      extends HL7_WORK_GROUP(
        "fm",
        Some("Financial Management"),
        Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case HSI
      extends HL7_WORK_GROUP(
        "hsi",
        Some("Health Standards Integration"),
        Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case II
      extends HL7_WORK_GROUP(
        "ii",
        Some("Imaging Integration"),
        Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case INM
      extends HL7_WORK_GROUP(
        "inm",
        Some("Infrastructure And Messaging"),
        Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case ITS
      extends HL7_WORK_GROUP(
        "its",
        Some("Implementable Technology Specifications"),
        Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case MNM
      extends HL7_WORK_GROUP(
        "mnm",
        Some("Modeling and Methodology"),
        Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case OO
      extends HL7_WORK_GROUP(
        "oo",
        Some("Orders and Observations"),
        Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case PA
      extends HL7_WORK_GROUP(
        "pa",
        Some("Patient Administration"),
        Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case PC
      extends HL7_WORK_GROUP("pc", Some("Patient Care"), Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case PHER
      extends HL7_WORK_GROUP(
        "pher",
        Some("Public Health and Emergency Response"),
        Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case PHX extends HL7_WORK_GROUP("phx", Some("Pharmacy"), Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case SD
      extends HL7_WORK_GROUP(
        "sd",
        Some("Structured Documents"),
        Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case SEC extends HL7_WORK_GROUP("sec", Some("Security"), Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case US
      extends HL7_WORK_GROUP(
        "us",
        Some("US Realm Taskforce"),
        Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case VOCAB
      extends HL7_WORK_GROUP("vocab", Some("Vocabulary"), Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
}
object HL7_WORK_GROUP extends EType[HL7_WORK_GROUP]("http://hl7.org/fhir/ValueSet/hl7-work-group")

enum IMPLANTSTATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case DISABLED
      extends IMPLANTSTATUS("disabled", Some("Disabled"), Some("http://terminology.hl7.org/CodeSystem/implantStatus"))
  case FUNCTIONAL
      extends IMPLANTSTATUS(
        "functional",
        Some("Functional"),
        Some("http://terminology.hl7.org/CodeSystem/implantStatus"))
  case NON_FUNCTIONAL
      extends IMPLANTSTATUS(
        "non-functional",
        Some("Non-Functional"),
        Some("http://terminology.hl7.org/CodeSystem/implantStatus"))
  case UNKNOWN
      extends IMPLANTSTATUS("unknown", Some("Unknown"), Some("http://terminology.hl7.org/CodeSystem/implantStatus"))
}
object IMPLANTSTATUS extends EType[IMPLANTSTATUS]("http://hl7.org/fhir/ValueSet/implantStatus")

enum MATCH_GRADE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case CERTAIN
      extends MATCH_GRADE("certain", Some("Certain Match"), Some("http://terminology.hl7.org/CodeSystem/match-grade"))
  case CERTAINLY_NOT_A_MATCH
      extends MATCH_GRADE(
        "certainly-not",
        Some("Certainly Not a Match"),
        Some("http://terminology.hl7.org/CodeSystem/match-grade"))
  case POSSIBLE
      extends MATCH_GRADE("possible", Some("Possible Match"), Some("http://terminology.hl7.org/CodeSystem/match-grade"))
  case PROBABLE
      extends MATCH_GRADE("probable", Some("Probable Match"), Some("http://terminology.hl7.org/CodeSystem/match-grade"))
}
object MATCH_GRADE extends EType[MATCH_GRADE]("http://hl7.org/fhir/ValueSet/match-grade")

enum NAME_ASSEMBLY_ORDER(val name: String, val display: Option[String], val system: Option[String])
    extends ToCodingAble {
  case F
      extends NAME_ASSEMBLY_ORDER(
        "F",
        Some("Prefix Family Given Suffix"),
        Some("http://terminology.hl7.org/CodeSystem/v2-0444"))
  case G
      extends NAME_ASSEMBLY_ORDER(
        "G",
        Some("Prefix Given Family Suffix"),
        Some("http://terminology.hl7.org/CodeSystem/v2-0444"))
  case NL1
      extends NAME_ASSEMBLY_ORDER(
        "NL1",
        Some("Own Name"),
        Some("http://terminology.hl7.org/CodeSystem/name-assembly-order"))
  case NL2
      extends NAME_ASSEMBLY_ORDER(
        "NL2",
        Some("Partner Name"),
        Some("http://terminology.hl7.org/CodeSystem/name-assembly-order"))
  case NL3
      extends NAME_ASSEMBLY_ORDER(
        "NL3",
        Some("Partner Name followed by Maiden Name"),
        Some("http://terminology.hl7.org/CodeSystem/name-assembly-order"))
  case NL4
      extends NAME_ASSEMBLY_ORDER(
        "NL4",
        Some("Own Name followed by Partner Name"),
        Some("http://terminology.hl7.org/CodeSystem/name-assembly-order"))
  case UNK
      extends NAME_ASSEMBLY_ORDER("UNK", Some("Unknown"), Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor"))
}
object NAME_ASSEMBLY_ORDER extends EType[NAME_ASSEMBLY_ORDER]("http://hl7.org/fhir/ValueSet/name-assembly-order")

enum NAME_PART_QUALIFIER(val name: String, val display: Option[String], val system: Option[String])
    extends ToCodingAble {
  case AC
      extends NAME_PART_QUALIFIER(
        "AC",
        Some("Academic"),
        Some("http://terminology.hl7.org/CodeSystem/v3-EntityNamePartQualifierR2"))
  case AD
      extends NAME_PART_QUALIFIER(
        "AD",
        Some("Acquired"),
        Some("http://terminology.hl7.org/CodeSystem/v3-EntityNamePartQualifierR2"))
  case BR
      extends NAME_PART_QUALIFIER(
        "BR",
        Some("Birth"),
        Some("http://terminology.hl7.org/CodeSystem/v3-EntityNamePartQualifierR2"))
  case CL
      extends NAME_PART_QUALIFIER(
        "CL",
        Some("Call me"),
        Some("http://terminology.hl7.org/CodeSystem/v3-EntityNamePartQualifierR2"))
  case HON
      extends NAME_PART_QUALIFIER(
        "HON",
        Some("Honorific"),
        Some("http://terminology.hl7.org/CodeSystem/v3-EntityNamePartQualifierR2"))
  case IN
      extends NAME_PART_QUALIFIER(
        "IN",
        Some("Initial"),
        Some("http://terminology.hl7.org/CodeSystem/v3-EntityNamePartQualifierR2"))
  case LS
      extends NAME_PART_QUALIFIER(
        "LS",
        Some("Legal status"),
        Some("http://terminology.hl7.org/CodeSystem/v3-EntityNamePartQualifierR2"))
  case MID
      extends NAME_PART_QUALIFIER(
        "MID",
        Some("Middle Name"),
        Some("http://terminology.hl7.org/CodeSystem/v3-EntityNamePartQualifierR2"))
  case NB
      extends NAME_PART_QUALIFIER(
        "NB",
        Some("Nobility"),
        Some("http://terminology.hl7.org/CodeSystem/v3-EntityNamePartQualifierR2"))
  case PR
      extends NAME_PART_QUALIFIER(
        "PR",
        Some("Professional"),
        Some("http://terminology.hl7.org/CodeSystem/v3-EntityNamePartQualifierR2"))
  case SP
      extends NAME_PART_QUALIFIER(
        "SP",
        Some("Spouse"),
        Some("http://terminology.hl7.org/CodeSystem/v3-EntityNamePartQualifierR2"))
  case VV
      extends NAME_PART_QUALIFIER(
        "VV",
        Some("Voorvoegsel"),
        Some("http://terminology.hl7.org/CodeSystem/v3-EntityNamePartQualifier"))
}
object NAME_PART_QUALIFIER extends EType[NAME_PART_QUALIFIER]("http://hl7.org/fhir/ValueSet/name-part-qualifier")

enum NAME_V3_REPRESENTATION(val name: String, val display: Option[String], val system: Option[String])
    extends ToCodingAble {
  case ABC
      extends NAME_V3_REPRESENTATION("ABC", Some("ABC"), Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUse"))
  case IDE
      extends NAME_V3_REPRESENTATION("IDE", Some("IDE"), Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUse"))
  case SYL
      extends NAME_V3_REPRESENTATION("SYL", Some("SYL"), Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUse"))
}
object NAME_V3_REPRESENTATION
    extends EType[NAME_V3_REPRESENTATION]("http://hl7.org/fhir/ValueSet/name-v3-representation")

enum POSTAL_ADDRESS_USE(val name: String, val display: Option[String], val system: Option[String])
    extends ToCodingAble {
  case BAD
      extends POSTAL_ADDRESS_USE(
        "BAD",
        Some("bad address"),
        Some("http://terminology.hl7.org/CodeSystem/v3-AddressUse"))
  case CONF
      extends POSTAL_ADDRESS_USE(
        "CONF",
        Some("confidential address"),
        Some("http://terminology.hl7.org/CodeSystem/v3-AddressUse"))
  case DIR
      extends POSTAL_ADDRESS_USE("DIR", Some("direct"), Some("http://terminology.hl7.org/CodeSystem/v3-AddressUse"))
  case HP
      extends POSTAL_ADDRESS_USE(
        "HP",
        Some("primary home"),
        Some("http://terminology.hl7.org/CodeSystem/v3-AddressUse"))
  case HV
      extends POSTAL_ADDRESS_USE(
        "HV",
        Some("vacation home"),
        Some("http://terminology.hl7.org/CodeSystem/v3-AddressUse"))
  case PHYS
      extends POSTAL_ADDRESS_USE(
        "PHYS",
        Some("physical visit address"),
        Some("http://terminology.hl7.org/CodeSystem/v3-AddressUse"))
  case PST
      extends POSTAL_ADDRESS_USE(
        "PST",
        Some("postal address"),
        Some("http://terminology.hl7.org/CodeSystem/v3-AddressUse"))
  case PUB
      extends POSTAL_ADDRESS_USE("PUB", Some("public"), Some("http://terminology.hl7.org/CodeSystem/v3-AddressUse"))
}
object POSTAL_ADDRESS_USE extends EType[POSTAL_ADDRESS_USE]("http://hl7.org/fhir/ValueSet/postal-address-use")

enum PROBABILITY_DISTRIBUTION_TYPE(val name: String, val display: Option[String], val system: Option[String])
    extends ToCodingAble {
  case B
      extends PROBABILITY_DISTRIBUTION_TYPE(
        "B",
        Some("beta"),
        Some("http://terminology.hl7.org/CodeSystem/v3-ProbabilityDistributionType"))
  case E
      extends PROBABILITY_DISTRIBUTION_TYPE(
        "E",
        Some("exponential"),
        Some("http://terminology.hl7.org/CodeSystem/v3-ProbabilityDistributionType"))
  case F
      extends PROBABILITY_DISTRIBUTION_TYPE(
        "F",
        Some("F"),
        Some("http://terminology.hl7.org/CodeSystem/v3-ProbabilityDistributionType"))
  case G
      extends PROBABILITY_DISTRIBUTION_TYPE(
        "G",
        Some("(gamma)"),
        Some("http://terminology.hl7.org/CodeSystem/v3-ProbabilityDistributionType"))
  case LN
      extends PROBABILITY_DISTRIBUTION_TYPE(
        "LN",
        Some("log-normal"),
        Some("http://terminology.hl7.org/CodeSystem/v3-ProbabilityDistributionType"))
  case N
      extends PROBABILITY_DISTRIBUTION_TYPE(
        "N",
        Some("normal (Gaussian)"),
        Some("http://terminology.hl7.org/CodeSystem/v3-ProbabilityDistributionType"))
  case T
      extends PROBABILITY_DISTRIBUTION_TYPE(
        "T",
        Some("T"),
        Some("http://terminology.hl7.org/CodeSystem/v3-ProbabilityDistributionType"))
  case U
      extends PROBABILITY_DISTRIBUTION_TYPE(
        "U",
        Some("uniform"),
        Some("http://terminology.hl7.org/CodeSystem/v3-ProbabilityDistributionType"))
  case X2
      extends PROBABILITY_DISTRIBUTION_TYPE(
        "X2",
        Some("chi square"),
        Some("http://terminology.hl7.org/CodeSystem/v3-ProbabilityDistributionType"))
}
object PROBABILITY_DISTRIBUTION_TYPE
    extends EType[PROBABILITY_DISTRIBUTION_TYPE]("http://hl7.org/fhir/ValueSet/probability-distribution-type")

enum QUESTIONNAIRE_USAGE_MODE(val name: String, val display: Option[String], val system: Option[String])
    extends ToCodingAble {
  case CAPTURE
      extends QUESTIONNAIRE_USAGE_MODE(
        "capture",
        Some("Capture Only"),
        Some("http://terminology.hl7.org/CodeSystem/questionnaire-usage-mode"))
  case CAPTURE_DISPLAY
      extends QUESTIONNAIRE_USAGE_MODE(
        "capture-display",
        Some("Capture & Display"),
        Some("http://terminology.hl7.org/CodeSystem/questionnaire-usage-mode"))
  case CAPTURE_DISPLAY_NON_EMPTY
      extends QUESTIONNAIRE_USAGE_MODE(
        "capture-display-non-empty",
        Some("Capture or, if answered, Display"),
        Some("http://terminology.hl7.org/CodeSystem/questionnaire-usage-mode"))
  case DISPLAY
      extends QUESTIONNAIRE_USAGE_MODE(
        "display",
        Some("Display Only"),
        Some("http://terminology.hl7.org/CodeSystem/questionnaire-usage-mode"))
  case DISPLAY_WHEN_ANSWERED
      extends QUESTIONNAIRE_USAGE_MODE(
        "display-non-empty",
        Some("Display when Answered"),
        Some("http://terminology.hl7.org/CodeSystem/questionnaire-usage-mode"))
}
object QUESTIONNAIRE_USAGE_MODE
    extends EType[QUESTIONNAIRE_USAGE_MODE]("http://hl7.org/fhir/ValueSet/questionnaire-usage-mode")

enum RESOURCE_SECURITY_CATEGORY(val name: String, val display: Option[String], val system: Option[String])
    extends ToCodingAble {
  case ANONYMOUS
      extends RESOURCE_SECURITY_CATEGORY(
        "anonymous",
        Some("Anonymous READ Access Resource"),
        Some("http://terminology.hl7.org/CodeSystem/resource-security-category"))
  case BUSINESS
      extends RESOURCE_SECURITY_CATEGORY(
        "business",
        Some("Business Sensitive Resource"),
        Some("http://terminology.hl7.org/CodeSystem/resource-security-category"))
  case INDIVIDUAL
      extends RESOURCE_SECURITY_CATEGORY(
        "individual",
        Some("Individual Sensitive Resource"),
        Some("http://terminology.hl7.org/CodeSystem/resource-security-category"))
  case NOT_CLASSIFIED
      extends RESOURCE_SECURITY_CATEGORY(
        "not-classified",
        Some("Not classified"),
        Some("http://terminology.hl7.org/CodeSystem/resource-security-category"))
  case PATIENT
      extends RESOURCE_SECURITY_CATEGORY(
        "patient",
        Some("Patient Sensitive"),
        Some("http://terminology.hl7.org/CodeSystem/resource-security-category"))
}
object RESOURCE_SECURITY_CATEGORY
    extends EType[RESOURCE_SECURITY_CATEGORY]("http://hl7.org/fhir/ValueSet/resource-security-category")

enum SMART_CAPABILITIES(val name: String, val display: Option[String], val system: Option[String])
    extends ToCodingAble {
  case CONFIDENTIAL_CLIENT_PROFILE
      extends SMART_CAPABILITIES(
        "client-confidential-symmetric",
        Some("Confidential Client Profile"),
        Some("http://terminology.hl7.org/CodeSystem/smart-capabilities"))
  case CONTEXT_EHR_ENCOUNTER
      extends SMART_CAPABILITIES(
        "context-ehr-encounter",
        Some("Allows \"Encounter Level Launch Context (EHR)\""),
        Some("http://terminology.hl7.org/CodeSystem/smart-capabilities"))
  case CONTEXT_EHR_PATIENT
      extends SMART_CAPABILITIES(
        "context-ehr-patient",
        Some("Allows \"Patient Level Launch Context (EHR)\""),
        Some("http://terminology.hl7.org/CodeSystem/smart-capabilities"))
  case CONTEXT_PASSTHROUGH_BANNER
      extends SMART_CAPABILITIES(
        "context-passthrough-banner",
        Some("Allows \"Need Patient Banner\""),
        Some("http://terminology.hl7.org/CodeSystem/smart-capabilities"))
  case CONTEXT_PASSTHROUGH_STYLE
      extends SMART_CAPABILITIES(
        "context-passthrough-style",
        Some("Allows \"Smart Style Style\""),
        Some("http://terminology.hl7.org/CodeSystem/smart-capabilities"))
  case CONTEXT_STANDALONE_ENCOUNTER
      extends SMART_CAPABILITIES(
        "context-standalone-encounter",
        Some("Allows \"Encounter Level Launch Context (STANDALONE)\""),
        Some("http://terminology.hl7.org/CodeSystem/smart-capabilities"))
  case CONTEXT_STANDALONE_PATIENT
      extends SMART_CAPABILITIES(
        "context-standalone-patient",
        Some("Allows \"Patient Level Launch Context (STANDALONE)\""),
        Some("http://terminology.hl7.org/CodeSystem/smart-capabilities"))
  case EHR_LAUNCH_MODE
      extends SMART_CAPABILITIES(
        "launch-ehr",
        Some("EHR Launch Mode"),
        Some("http://terminology.hl7.org/CodeSystem/smart-capabilities"))
  case PUBLIC_CLIENT_PROFILE
      extends SMART_CAPABILITIES(
        "client-public",
        Some("Public Client Profile"),
        Some("http://terminology.hl7.org/CodeSystem/smart-capabilities"))
  case STANDALONE_LAUNCH_MODE
      extends SMART_CAPABILITIES(
        "launch-standalone",
        Some("Standalone Launch Mode"),
        Some("http://terminology.hl7.org/CodeSystem/smart-capabilities"))
  case SUPPORTS_OPENID_CONNECT
      extends SMART_CAPABILITIES(
        "sso-openid-connect",
        Some("Supports OpenID Connect"),
        Some("http://terminology.hl7.org/CodeSystem/smart-capabilities"))
  case SUPPORTS_PATIENT_LEVEL_SCOPES
      extends SMART_CAPABILITIES(
        "permission-patient",
        Some("Supports Patient Level Scopes"),
        Some("http://terminology.hl7.org/CodeSystem/smart-capabilities"))
  case SUPPORTS_REFRESH_TOKEN
      extends SMART_CAPABILITIES(
        "permission-offline",
        Some("Supports Refresh Token"),
        Some("http://terminology.hl7.org/CodeSystem/smart-capabilities"))
  case SUPPORTS_USER_LEVEL_SCOPES
      extends SMART_CAPABILITIES(
        "permission-user",
        Some("Supports User Level Scopes"),
        Some("http://terminology.hl7.org/CodeSystem/smart-capabilities"))
}
object SMART_CAPABILITIES extends EType[SMART_CAPABILITIES]("http://hl7.org/fhir/ValueSet/smart-capabilities")

enum STANDARDS_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case DEPRECATED
      extends STANDARDS_STATUS(
        "deprecated",
        Some("Deprecated"),
        Some("http://terminology.hl7.org/CodeSystem/standards-status"))
  case DRAFT
      extends STANDARDS_STATUS("draft", Some("Draft"), Some("http://terminology.hl7.org/CodeSystem/standards-status"))
  case EXTERNAL
      extends STANDARDS_STATUS(
        "external",
        Some("External"),
        Some("http://terminology.hl7.org/CodeSystem/standards-status"))
  case INFORMATIVE
      extends STANDARDS_STATUS(
        "informative",
        Some("Informative"),
        Some("http://terminology.hl7.org/CodeSystem/standards-status"))
  case NORMATIVE
      extends STANDARDS_STATUS(
        "normative",
        Some("Normative"),
        Some("http://terminology.hl7.org/CodeSystem/standards-status"))
  case TRIAL_USE
      extends STANDARDS_STATUS(
        "trial-use",
        Some("Trial-Use"),
        Some("http://terminology.hl7.org/CodeSystem/standards-status"))
}
object STANDARDS_STATUS extends EType[STANDARDS_STATUS]("http://hl7.org/fhir/ValueSet/standards-status")

enum TEMPLATE_STATUS_CODE(val name: String, val display: Option[String], val system: Option[String])
    extends ToCodingAble {
  case ACTIVE extends TEMPLATE_STATUS_CODE("active", Some("Active"), Some("urn:oid:2.16.840.1.113883.3.1937.98.5.8"))
  case CANCELLED
      extends TEMPLATE_STATUS_CODE("cancelled", Some("Cancelled"), Some("urn:oid:2.16.840.1.113883.3.1937.98.5.8"))
  case DRAFT extends TEMPLATE_STATUS_CODE("draft", Some("Draft"), Some("urn:oid:2.16.840.1.113883.3.1937.98.5.8"))
  case PENDING
      extends TEMPLATE_STATUS_CODE(
        "pending",
        Some("Under pre-publication review"),
        Some("urn:oid:2.16.840.1.113883.3.1937.98.5.8"))
  case REJECTED
      extends TEMPLATE_STATUS_CODE("rejected", Some("Rejected"), Some("urn:oid:2.16.840.1.113883.3.1937.98.5.8"))
  case RETIRED extends TEMPLATE_STATUS_CODE("retired", Some("Retired"), Some("urn:oid:2.16.840.1.113883.3.1937.98.5.8"))
  case REVIEW extends TEMPLATE_STATUS_CODE("review", Some("In Review"), Some("urn:oid:2.16.840.1.113883.3.1937.98.5.8"))
  case TERMINATED
      extends TEMPLATE_STATUS_CODE("terminated", Some("Terminated"), Some("urn:oid:2.16.840.1.113883.3.1937.98.5.8"))
}
object TEMPLATE_STATUS_CODE extends EType[TEMPLATE_STATUS_CODE]("http://hl7.org/fhir/ValueSet/template-status-code")

enum V3_ENTITYNAMEUSER2(val name: String, val display: Option[String], val system: Option[String])
    extends ToCodingAble {
  case A
      extends V3_ENTITYNAMEUSER2(
        "A",
        Some("business name"),
        Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2"))
  case ABC
      extends V3_ENTITYNAMEUSER2(
        "ABC",
        Some("alphabetic"),
        Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2"))
  case ANON
      extends V3_ENTITYNAMEUSER2(
        "ANON",
        Some("Anonymous"),
        Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2"))
  case ASSUMED
      extends V3_ENTITYNAMEUSER2(
        "Assumed",
        Some("Assumed"),
        Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2"))
  case C
      extends V3_ENTITYNAMEUSER2(
        "C",
        Some("customary"),
        Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2"))
  case DN
      extends V3_ENTITYNAMEUSER2(
        "DN",
        Some("do not use"),
        Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2"))
  case I
      extends V3_ENTITYNAMEUSER2(
        "I",
        Some("Indigenous/Tribal"),
        Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2"))
  case IDE
      extends V3_ENTITYNAMEUSER2(
        "IDE",
        Some("ideographic"),
        Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2"))
  case M
      extends V3_ENTITYNAMEUSER2(
        "M",
        Some("maiden name"),
        Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2"))
  case NAMEREPRESENTATIONUSE
      extends V3_ENTITYNAMEUSER2(
        "NameRepresentationUse",
        Some("NameRepresentationUse"),
        Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2"))
  case OLD
      extends V3_ENTITYNAMEUSER2(
        "OLD",
        Some("no longer in use"),
        Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2"))
  case OR
      extends V3_ENTITYNAMEUSER2(
        "OR",
        Some("official registry name"),
        Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2"))
  case P
      extends V3_ENTITYNAMEUSER2(
        "P",
        Some("Other/Pseudonym/Alias"),
        Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2"))
  case PHON
      extends V3_ENTITYNAMEUSER2(
        "PHON",
        Some("phonetic"),
        Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2"))
  case R
      extends V3_ENTITYNAMEUSER2(
        "R",
        Some("religious"),
        Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2"))
  case SRCH
      extends V3_ENTITYNAMEUSER2(
        "SRCH",
        Some("search"),
        Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2"))
  case SYL
      extends V3_ENTITYNAMEUSER2(
        "SYL",
        Some("syllabic"),
        Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2"))
  case T
      extends V3_ENTITYNAMEUSER2(
        "T",
        Some("temporary"),
        Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2"))
}
object V3_ENTITYNAMEUSER2 extends EType[V3_ENTITYNAMEUSER2]("http://terminology.hl7.org/ValueSet/v3-EntityNameUseR2")

enum V3_NULLFLAVOR(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ASKU
      extends V3_NULLFLAVOR(
        "ASKU",
        Some("asked but unknown"),
        Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor"))
  case DER extends V3_NULLFLAVOR("DER", Some("derived"), Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor"))
  case INV extends V3_NULLFLAVOR("INV", Some("invalid"), Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor"))
  case MSK extends V3_NULLFLAVOR("MSK", Some("masked"), Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor"))
  case NA
      extends V3_NULLFLAVOR("NA", Some("not applicable"), Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor"))
  case NASK
      extends V3_NULLFLAVOR("NASK", Some("not asked"), Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor"))
  case NAV
      extends V3_NULLFLAVOR(
        "NAV",
        Some("temporarily unavailable"),
        Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor"))
  case NAVU
      extends V3_NULLFLAVOR("NAVU", Some("Not available"), Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor"))
  case NI
      extends V3_NULLFLAVOR("NI", Some("NoInformation"), Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor"))
  case NINF
      extends V3_NULLFLAVOR(
        "NINF",
        Some("negative infinity"),
        Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor"))
  case NP extends V3_NULLFLAVOR("NP", Some("not present"), Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor"))
  case OTH extends V3_NULLFLAVOR("OTH", Some("other"), Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor"))
  case PINF
      extends V3_NULLFLAVOR(
        "PINF",
        Some("positive infinity"),
        Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor"))
  case QS
      extends V3_NULLFLAVOR(
        "QS",
        Some("Sufficient Quantity"),
        Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor"))
  case TRC extends V3_NULLFLAVOR("TRC", Some("trace"), Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor"))
  case UNC extends V3_NULLFLAVOR("UNC", Some("un-encoded"), Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor"))
  case UNK extends V3_NULLFLAVOR("UNK", Some("unknown"), Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor"))
}
object V3_NULLFLAVOR extends EType[V3_NULLFLAVOR]("http://terminology.hl7.org/ValueSet/v3-NullFlavor")
