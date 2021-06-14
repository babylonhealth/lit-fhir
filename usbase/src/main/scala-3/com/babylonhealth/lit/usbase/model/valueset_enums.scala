package com.babylonhealth.lit.usbase

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
enum CHOICE_LIST_ORIENTATION(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case HORIZONTAL extends HORIZONTAL("horizontal", Some("Horizontal"), Some("http://terminology.hl7.org/CodeSystem/choice-list-orientation"))
  case VERTICAL extends VERTICAL("vertical", Some("Vertical"), Some("http://terminology.hl7.org/CodeSystem/choice-list-orientation"))
}
object CHOICE_LIST_ORIENTATION extends EType[CHOICE_LIST_ORIENTATION]("http://hl7.org/fhir/ValueSet/choice-list-orientation") 


enum CONFORMANCE_EXPECTATION(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case MAY extends MAY("MAY", Some("MAY"), Some("http://terminology.hl7.org/CodeSystem/conformance-expectation"))
  case SHALL extends SHALL("SHALL", Some("SHALL"), Some("http://terminology.hl7.org/CodeSystem/conformance-expectation"))
  case SHOULD extends SHOULD("SHOULD", Some("SHOULD"), Some("http://terminology.hl7.org/CodeSystem/conformance-expectation"))
  case SHOULD_NOT extends SHOULD_NOT("SHOULD-NOT", Some("SHOULD-NOT"), Some("http://terminology.hl7.org/CodeSystem/conformance-expectation"))
}
object CONFORMANCE_EXPECTATION extends EType[CONFORMANCE_EXPECTATION]("http://hl7.org/fhir/ValueSet/conformance-expectation") 


enum DATA_ABSENT_REASON(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ASKED_BUT_DECLINED extends ASKED_BUT_DECLINED("asked-declined", Some("Asked But Declined"), Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
  case ASKED_BUT_UNKNOWN extends ASKED_BUT_UNKNOWN("asked-unknown", Some("Asked But Unknown"), Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
  case AS_TEXT extends AS_TEXT("as-text", Some("As Text"), Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
  case ERROR extends ERROR("error", Some("Error"), Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
  case MASKED extends MASKED("masked", Some("Masked"), Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
  case NEGATIVE_INFINITY extends NEGATIVE_INFINITY("negative-infinity", Some("Negative Infinity (NINF)"), Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
  case NOT_APPLICABLE extends NOT_APPLICABLE("not-applicable", Some("Not Applicable"), Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
  case NOT_ASKED extends NOT_ASKED("not-asked", Some("Not Asked"), Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
  case NOT_A_NUMBER extends NOT_A_NUMBER("not-a-number", Some("Not a Number (NaN)"), Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
  case NOT_PERFORMED extends NOT_PERFORMED("not-performed", Some("Not Performed"), Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
  case NOT_PERMITTED extends NOT_PERMITTED("not-permitted", Some("Not Permitted"), Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
  case POSITIVE_INFINITY extends POSITIVE_INFINITY("positive-infinity", Some("Positive Infinity (PINF)"), Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
  case TEMPORARILY_UNKNOWN extends TEMPORARILY_UNKNOWN("temp-unknown", Some("Temporarily Unknown"), Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
  case UNKNOWN extends UNKNOWN("unknown", Some("Unknown"), Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
  case UNSUPPORTED extends UNSUPPORTED("unsupported", Some("Unsupported"), Some("http://terminology.hl7.org/CodeSystem/data-absent-reason"))
}
object DATA_ABSENT_REASON extends EType[DATA_ABSENT_REASON]("http://hl7.org/fhir/ValueSet/data-absent-reason") 


enum DATA_TYPES(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ADDRESS extends ADDRESS("Address", Some("Address"), Some("http://hl7.org/fhir/data-types"))
  case AGE extends AGE("Age", Some("Age"), Some("http://hl7.org/fhir/data-types"))
  case ANNOTATION extends ANNOTATION("Annotation", Some("Annotation"), Some("http://hl7.org/fhir/data-types"))
  case ATTACHMENT extends ATTACHMENT("Attachment", Some("Attachment"), Some("http://hl7.org/fhir/data-types"))
  case BACKBONEELEMENT extends BACKBONEELEMENT("BackboneElement", Some("BackboneElement"), Some("http://hl7.org/fhir/data-types"))
  case BASE64BINARY extends BASE64BINARY("base64Binary", Some("base64Binary"), Some("http://hl7.org/fhir/data-types"))
  case BOOLEAN extends BOOLEAN("boolean", Some("boolean"), Some("http://hl7.org/fhir/data-types"))
  case CANONICAL extends CANONICAL("canonical", Some("canonical"), Some("http://hl7.org/fhir/data-types"))
  case CODE extends CODE("code", Some("code"), Some("http://hl7.org/fhir/data-types"))
  case CODEABLECONCEPT extends CODEABLECONCEPT("CodeableConcept", Some("CodeableConcept"), Some("http://hl7.org/fhir/data-types"))
  case CODING extends CODING("Coding", Some("Coding"), Some("http://hl7.org/fhir/data-types"))
  case CONTACTDETAIL extends CONTACTDETAIL("ContactDetail", Some("ContactDetail"), Some("http://hl7.org/fhir/data-types"))
  case CONTACTPOINT extends CONTACTPOINT("ContactPoint", Some("ContactPoint"), Some("http://hl7.org/fhir/data-types"))
  case CONTRIBUTOR extends CONTRIBUTOR("Contributor", Some("Contributor"), Some("http://hl7.org/fhir/data-types"))
  case COUNT extends COUNT("Count", Some("Count"), Some("http://hl7.org/fhir/data-types"))
  case DATAREQUIREMENT extends DATAREQUIREMENT("DataRequirement", Some("DataRequirement"), Some("http://hl7.org/fhir/data-types"))
  case DATE extends DATE("date", Some("date"), Some("http://hl7.org/fhir/data-types"))
  case DATETIME extends DATETIME("dateTime", Some("dateTime"), Some("http://hl7.org/fhir/data-types"))
  case DECIMAL extends DECIMAL("decimal", Some("decimal"), Some("http://hl7.org/fhir/data-types"))
  case DISTANCE extends DISTANCE("Distance", Some("Distance"), Some("http://hl7.org/fhir/data-types"))
  case DOSAGE extends DOSAGE("Dosage", Some("Dosage"), Some("http://hl7.org/fhir/data-types"))
  case DURATION extends DURATION("Duration", Some("Duration"), Some("http://hl7.org/fhir/data-types"))
  case ELEMENT extends ELEMENT("Element", Some("Element"), Some("http://hl7.org/fhir/data-types"))
  case ELEMENTDEFINITION extends ELEMENTDEFINITION("ElementDefinition", Some("ElementDefinition"), Some("http://hl7.org/fhir/data-types"))
  case EXPRESSION extends EXPRESSION("Expression", Some("Expression"), Some("http://hl7.org/fhir/data-types"))
  case EXTENSION extends EXTENSION("Extension", Some("Extension"), Some("http://hl7.org/fhir/data-types"))
  case HUMANNAME extends HUMANNAME("HumanName", Some("HumanName"), Some("http://hl7.org/fhir/data-types"))
  case ID extends ID("id", Some("id"), Some("http://hl7.org/fhir/data-types"))
  case IDENTIFIER extends IDENTIFIER("Identifier", Some("Identifier"), Some("http://hl7.org/fhir/data-types"))
  case INSTANT extends INSTANT("instant", Some("instant"), Some("http://hl7.org/fhir/data-types"))
  case INTEGER extends INTEGER("integer", Some("integer"), Some("http://hl7.org/fhir/data-types"))
  case MARKDOWN extends MARKDOWN("markdown", Some("markdown"), Some("http://hl7.org/fhir/data-types"))
  case MARKETINGSTATUS extends MARKETINGSTATUS("MarketingStatus", Some("MarketingStatus"), Some("http://hl7.org/fhir/data-types"))
  case META extends META("Meta", Some("Meta"), Some("http://hl7.org/fhir/data-types"))
  case MONEY extends MONEY("Money", Some("Money"), Some("http://hl7.org/fhir/data-types"))
  case MONEYQUANTITY extends MONEYQUANTITY("MoneyQuantity", Some("MoneyQuantity"), Some("http://hl7.org/fhir/data-types"))
  case NARRATIVE extends NARRATIVE("Narrative", Some("Narrative"), Some("http://hl7.org/fhir/data-types"))
  case OID extends OID("oid", Some("oid"), Some("http://hl7.org/fhir/data-types"))
  case PARAMETERDEFINITION extends PARAMETERDEFINITION("ParameterDefinition", Some("ParameterDefinition"), Some("http://hl7.org/fhir/data-types"))
  case PERIOD extends PERIOD("Period", Some("Period"), Some("http://hl7.org/fhir/data-types"))
  case POPULATION extends POPULATION("Population", Some("Population"), Some("http://hl7.org/fhir/data-types"))
  case POSITIVEINT extends POSITIVEINT("positiveInt", Some("positiveInt"), Some("http://hl7.org/fhir/data-types"))
  case PRODCHARACTERISTIC extends PRODCHARACTERISTIC("ProdCharacteristic", Some("ProdCharacteristic"), Some("http://hl7.org/fhir/data-types"))
  case PRODUCTSHELFLIFE extends PRODUCTSHELFLIFE("ProductShelfLife", Some("ProductShelfLife"), Some("http://hl7.org/fhir/data-types"))
  case QUANTITY extends QUANTITY("Quantity", Some("Quantity"), Some("http://hl7.org/fhir/data-types"))
  case RANGE extends RANGE("Range", Some("Range"), Some("http://hl7.org/fhir/data-types"))
  case RATIO extends RATIO("Ratio", Some("Ratio"), Some("http://hl7.org/fhir/data-types"))
  case REFERENCE extends REFERENCE("Reference", Some("Reference"), Some("http://hl7.org/fhir/data-types"))
  case RELATEDARTIFACT extends RELATEDARTIFACT("RelatedArtifact", Some("RelatedArtifact"), Some("http://hl7.org/fhir/data-types"))
  case SAMPLEDDATA extends SAMPLEDDATA("SampledData", Some("SampledData"), Some("http://hl7.org/fhir/data-types"))
  case SIGNATURE extends SIGNATURE("Signature", Some("Signature"), Some("http://hl7.org/fhir/data-types"))
  case SIMPLEQUANTITY extends SIMPLEQUANTITY("SimpleQuantity", Some("SimpleQuantity"), Some("http://hl7.org/fhir/data-types"))
  case STRING extends STRING("string", Some("string"), Some("http://hl7.org/fhir/data-types"))
  case SUBSTANCEAMOUNT extends SUBSTANCEAMOUNT("SubstanceAmount", Some("SubstanceAmount"), Some("http://hl7.org/fhir/data-types"))
  case TIME extends TIME("time", Some("time"), Some("http://hl7.org/fhir/data-types"))
  case TIMING extends TIMING("Timing", Some("Timing"), Some("http://hl7.org/fhir/data-types"))
  case TRIGGERDEFINITION extends TRIGGERDEFINITION("TriggerDefinition", Some("TriggerDefinition"), Some("http://hl7.org/fhir/data-types"))
  case UNSIGNEDINT extends UNSIGNEDINT("unsignedInt", Some("unsignedInt"), Some("http://hl7.org/fhir/data-types"))
  case URI extends URI("uri", Some("uri"), Some("http://hl7.org/fhir/data-types"))
  case URL extends URL("url", Some("url"), Some("http://hl7.org/fhir/data-types"))
  case USAGECONTEXT extends USAGECONTEXT("UsageContext", Some("UsageContext"), Some("http://hl7.org/fhir/data-types"))
  case UUID extends UUID("uuid", Some("uuid"), Some("http://hl7.org/fhir/data-types"))
  case XHTML extends XHTML("xhtml", Some("XHTML"), Some("http://hl7.org/fhir/data-types"))
}
object DATA_TYPES extends EType[DATA_TYPES]("http://hl7.org/fhir/ValueSet/data-types") 


enum EXPANSION_PARAMETER_SOURCE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case CODESYSTEM extends CODESYSTEM("codesystem", Some("Code System"), Some("http://terminology.hl7.org/CodeSystem/expansion-parameter-source"))
  case INPUT extends INPUT("input", Some("Client Input"), Some("http://terminology.hl7.org/CodeSystem/expansion-parameter-source"))
  case SERVER extends SERVER("server", Some("Server Engine"), Some("http://terminology.hl7.org/CodeSystem/expansion-parameter-source"))
}
object EXPANSION_PARAMETER_SOURCE extends EType[EXPANSION_PARAMETER_SOURCE]("http://hl7.org/fhir/ValueSet/expansion-parameter-source") 


enum EXPANSION_PROCESSING_RULE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ALL_CODES extends ALL_CODES("all-codes", Some("All Codes"), Some("http://terminology.hl7.org/CodeSystem/expansion-processing-rule"))
  case GROUPS_ONLY extends GROUPS_ONLY("groups-only", Some("Groups Only"), Some("http://terminology.hl7.org/CodeSystem/expansion-processing-rule"))
  case UNGROUPED extends UNGROUPED("ungrouped", Some("Groups + Ungrouped codes"), Some("http://terminology.hl7.org/CodeSystem/expansion-processing-rule"))
}
object EXPANSION_PROCESSING_RULE extends EType[EXPANSION_PROCESSING_RULE]("http://hl7.org/fhir/ValueSet/expansion-processing-rule") 


enum HL7_WORK_GROUP(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case AID extends AID("aid", Some("Application Implementation and Design"), Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case BRR extends BRR("brr", Some("Biomedical Research and Regulation"), Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case CBCC extends CBCC("cbcc", Some("Community Based Collaborative Care"), Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case CDS extends CDS("cds", Some("Clinical Decision Support"), Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case CG extends CG("cg", Some("Clinical Genomics"), Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case CQI extends CQI("cqi", Some("Clinical Quality Information"), Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case DEV extends DEV("dev", Some("Health Care Devices"), Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case EHR extends EHR("ehr", Some("Electronic Health Records"), Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case FHIR extends FHIR("fhir", Some("FHIR Infrastructure"), Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case FM extends FM("fm", Some("Financial Management"), Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case HSI extends HSI("hsi", Some("Health Standards Integration"), Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case II extends II("ii", Some("Imaging Integration"), Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case INM extends INM("inm", Some("Infrastructure And Messaging"), Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case ITS extends ITS("its", Some("Implementable Technology Specifications"), Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case MNM extends MNM("mnm", Some("Modeling and Methodology"), Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case OO extends OO("oo", Some("Orders and Observations"), Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case PA extends PA("pa", Some("Patient Administration"), Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case PC extends PC("pc", Some("Patient Care"), Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case PHER extends PHER("pher", Some("Public Health and Emergency Response"), Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case PHX extends PHX("phx", Some("Pharmacy"), Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case SD extends SD("sd", Some("Structured Documents"), Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case SEC extends SEC("sec", Some("Security"), Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case US extends US("us", Some("US Realm Taskforce"), Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
  case VOCAB extends VOCAB("vocab", Some("Vocabulary"), Some("http://terminology.hl7.org/CodeSystem/hl7-work-group"))
}
object HL7_WORK_GROUP extends EType[HL7_WORK_GROUP]("http://hl7.org/fhir/ValueSet/hl7-work-group") 


enum IMPLANTSTATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case DISABLED extends DISABLED("disabled", Some("Disabled"), Some("http://terminology.hl7.org/CodeSystem/implantStatus"))
  case FUNCTIONAL extends FUNCTIONAL("functional", Some("Functional"), Some("http://terminology.hl7.org/CodeSystem/implantStatus"))
  case NON_FUNCTIONAL extends NON_FUNCTIONAL("non-functional", Some("Non-Functional"), Some("http://terminology.hl7.org/CodeSystem/implantStatus"))
  case UNKNOWN extends UNKNOWN("unknown", Some("Unknown"), Some("http://terminology.hl7.org/CodeSystem/implantStatus"))
}
object IMPLANTSTATUS extends EType[IMPLANTSTATUS]("http://hl7.org/fhir/ValueSet/implantStatus") 


enum MATCH_GRADE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case CERTAIN extends CERTAIN("certain", Some("Certain Match"), Some("http://terminology.hl7.org/CodeSystem/match-grade"))
  case CERTAINLY_NOT_A_MATCH extends CERTAINLY_NOT_A_MATCH("certainly-not", Some("Certainly Not a Match"), Some("http://terminology.hl7.org/CodeSystem/match-grade"))
  case POSSIBLE extends POSSIBLE("possible", Some("Possible Match"), Some("http://terminology.hl7.org/CodeSystem/match-grade"))
  case PROBABLE extends PROBABLE("probable", Some("Probable Match"), Some("http://terminology.hl7.org/CodeSystem/match-grade"))
}
object MATCH_GRADE extends EType[MATCH_GRADE]("http://hl7.org/fhir/ValueSet/match-grade") 


enum NAME_ASSEMBLY_ORDER(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case F extends F("F", Some("Prefix Family Given Suffix"), Some("http://terminology.hl7.org/CodeSystem/v2-0444"))
  case G extends G("G", Some("Prefix Given Family Suffix"), Some("http://terminology.hl7.org/CodeSystem/v2-0444"))
  case NL1 extends NL1("NL1", Some("Own Name"), Some("http://terminology.hl7.org/CodeSystem/name-assembly-order"))
  case NL2 extends NL2("NL2", Some("Partner Name"), Some("http://terminology.hl7.org/CodeSystem/name-assembly-order"))
  case NL3 extends NL3("NL3", Some("Partner Name followed by Maiden Name"), Some("http://terminology.hl7.org/CodeSystem/name-assembly-order"))
  case NL4 extends NL4("NL4", Some("Own Name followed by Partner Name"), Some("http://terminology.hl7.org/CodeSystem/name-assembly-order"))
  case UNK extends UNK("UNK", Some("Unknown"), Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor"))
}
object NAME_ASSEMBLY_ORDER extends EType[NAME_ASSEMBLY_ORDER]("http://hl7.org/fhir/ValueSet/name-assembly-order") 


enum NAME_PART_QUALIFIER(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case AC extends AC("AC", Some("Academic"), Some("http://terminology.hl7.org/CodeSystem/v3-EntityNamePartQualifierR2"))
  case AD extends AD("AD", Some("Acquired"), Some("http://terminology.hl7.org/CodeSystem/v3-EntityNamePartQualifierR2"))
  case BR extends BR("BR", Some("Birth"), Some("http://terminology.hl7.org/CodeSystem/v3-EntityNamePartQualifierR2"))
  case CL extends CL("CL", Some("Call me"), Some("http://terminology.hl7.org/CodeSystem/v3-EntityNamePartQualifierR2"))
  case HON extends HON("HON", Some("Honorific"), Some("http://terminology.hl7.org/CodeSystem/v3-EntityNamePartQualifierR2"))
  case IN extends IN("IN", Some("Initial"), Some("http://terminology.hl7.org/CodeSystem/v3-EntityNamePartQualifierR2"))
  case LS extends LS("LS", Some("Legal status"), Some("http://terminology.hl7.org/CodeSystem/v3-EntityNamePartQualifierR2"))
  case MID extends MID("MID", Some("Middle Name"), Some("http://terminology.hl7.org/CodeSystem/v3-EntityNamePartQualifierR2"))
  case NB extends NB("NB", Some("Nobility"), Some("http://terminology.hl7.org/CodeSystem/v3-EntityNamePartQualifierR2"))
  case PR extends PR("PR", Some("Professional"), Some("http://terminology.hl7.org/CodeSystem/v3-EntityNamePartQualifierR2"))
  case SP extends SP("SP", Some("Spouse"), Some("http://terminology.hl7.org/CodeSystem/v3-EntityNamePartQualifierR2"))
  case VV extends VV("VV", Some("Voorvoegsel"), Some("http://terminology.hl7.org/CodeSystem/v3-EntityNamePartQualifier"))
}
object NAME_PART_QUALIFIER extends EType[NAME_PART_QUALIFIER]("http://hl7.org/fhir/ValueSet/name-part-qualifier") 


enum NAME_V3_REPRESENTATION(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ABC extends ABC("ABC", Some("ABC"), Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUse"))
  case IDE extends IDE("IDE", Some("IDE"), Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUse"))
  case SYL extends SYL("SYL", Some("SYL"), Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUse"))
}
object NAME_V3_REPRESENTATION extends EType[NAME_V3_REPRESENTATION]("http://hl7.org/fhir/ValueSet/name-v3-representation") 


enum POSTAL_ADDRESS_USE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case BAD extends BAD("BAD", Some("bad address"), Some("http://terminology.hl7.org/CodeSystem/v3-AddressUse"))
  case CONF extends CONF("CONF", Some("confidential address"), Some("http://terminology.hl7.org/CodeSystem/v3-AddressUse"))
  case DIR extends DIR("DIR", Some("direct"), Some("http://terminology.hl7.org/CodeSystem/v3-AddressUse"))
  case HP extends HP("HP", Some("primary home"), Some("http://terminology.hl7.org/CodeSystem/v3-AddressUse"))
  case HV extends HV("HV", Some("vacation home"), Some("http://terminology.hl7.org/CodeSystem/v3-AddressUse"))
  case PHYS extends PHYS("PHYS", Some("physical visit address"), Some("http://terminology.hl7.org/CodeSystem/v3-AddressUse"))
  case PST extends PST("PST", Some("postal address"), Some("http://terminology.hl7.org/CodeSystem/v3-AddressUse"))
  case PUB extends PUB("PUB", Some("public"), Some("http://terminology.hl7.org/CodeSystem/v3-AddressUse"))
}
object POSTAL_ADDRESS_USE extends EType[POSTAL_ADDRESS_USE]("http://hl7.org/fhir/ValueSet/postal-address-use") 


enum PROBABILITY_DISTRIBUTION_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case B extends B("B", Some("beta"), Some("http://terminology.hl7.org/CodeSystem/v3-ProbabilityDistributionType"))
  case E extends E("E", Some("exponential"), Some("http://terminology.hl7.org/CodeSystem/v3-ProbabilityDistributionType"))
  case F extends F("F", Some("F"), Some("http://terminology.hl7.org/CodeSystem/v3-ProbabilityDistributionType"))
  case G extends G("G", Some("(gamma)"), Some("http://terminology.hl7.org/CodeSystem/v3-ProbabilityDistributionType"))
  case LN extends LN("LN", Some("log-normal"), Some("http://terminology.hl7.org/CodeSystem/v3-ProbabilityDistributionType"))
  case N extends N("N", Some("normal (Gaussian)"), Some("http://terminology.hl7.org/CodeSystem/v3-ProbabilityDistributionType"))
  case T extends T("T", Some("T"), Some("http://terminology.hl7.org/CodeSystem/v3-ProbabilityDistributionType"))
  case U extends U("U", Some("uniform"), Some("http://terminology.hl7.org/CodeSystem/v3-ProbabilityDistributionType"))
  case X2 extends X2("X2", Some("chi square"), Some("http://terminology.hl7.org/CodeSystem/v3-ProbabilityDistributionType"))
}
object PROBABILITY_DISTRIBUTION_TYPE extends EType[PROBABILITY_DISTRIBUTION_TYPE]("http://hl7.org/fhir/ValueSet/probability-distribution-type") 


enum QUESTIONNAIRE_USAGE_MODE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case CAPTURE extends CAPTURE("capture", Some("Capture Only"), Some("http://terminology.hl7.org/CodeSystem/questionnaire-usage-mode"))
  case CAPTURE_DISPLAY extends CAPTURE_DISPLAY("capture-display", Some("Capture & Display"), Some("http://terminology.hl7.org/CodeSystem/questionnaire-usage-mode"))
  case CAPTURE_DISPLAY_NON_EMPTY extends CAPTURE_DISPLAY_NON_EMPTY("capture-display-non-empty", Some("Capture or, if answered, Display"), Some("http://terminology.hl7.org/CodeSystem/questionnaire-usage-mode"))
  case DISPLAY extends DISPLAY("display", Some("Display Only"), Some("http://terminology.hl7.org/CodeSystem/questionnaire-usage-mode"))
  case DISPLAY_WHEN_ANSWERED extends DISPLAY_WHEN_ANSWERED("display-non-empty", Some("Display when Answered"), Some("http://terminology.hl7.org/CodeSystem/questionnaire-usage-mode"))
}
object QUESTIONNAIRE_USAGE_MODE extends EType[QUESTIONNAIRE_USAGE_MODE]("http://hl7.org/fhir/ValueSet/questionnaire-usage-mode") 


enum RESOURCE_SECURITY_CATEGORY(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ANONYMOUS extends ANONYMOUS("anonymous", Some("Anonymous READ Access Resource"), Some("http://terminology.hl7.org/CodeSystem/resource-security-category"))
  case BUSINESS extends BUSINESS("business", Some("Business Sensitive Resource"), Some("http://terminology.hl7.org/CodeSystem/resource-security-category"))
  case INDIVIDUAL extends INDIVIDUAL("individual", Some("Individual Sensitive Resource"), Some("http://terminology.hl7.org/CodeSystem/resource-security-category"))
  case NOT_CLASSIFIED extends NOT_CLASSIFIED("not-classified", Some("Not classified"), Some("http://terminology.hl7.org/CodeSystem/resource-security-category"))
  case PATIENT extends PATIENT("patient", Some("Patient Sensitive"), Some("http://terminology.hl7.org/CodeSystem/resource-security-category"))
}
object RESOURCE_SECURITY_CATEGORY extends EType[RESOURCE_SECURITY_CATEGORY]("http://hl7.org/fhir/ValueSet/resource-security-category") 


enum SMART_CAPABILITIES(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case CONFIDENTIAL_CLIENT_PROFILE extends CONFIDENTIAL_CLIENT_PROFILE("client-confidential-symmetric", Some("Confidential Client Profile"), Some("http://terminology.hl7.org/CodeSystem/smart-capabilities"))
  case CONTEXT_EHR_ENCOUNTER extends CONTEXT_EHR_ENCOUNTER("context-ehr-encounter", Some("Allows \"Encounter Level Launch Context (EHR)\""), Some("http://terminology.hl7.org/CodeSystem/smart-capabilities"))
  case CONTEXT_EHR_PATIENT extends CONTEXT_EHR_PATIENT("context-ehr-patient", Some("Allows \"Patient Level Launch Context (EHR)\""), Some("http://terminology.hl7.org/CodeSystem/smart-capabilities"))
  case CONTEXT_PASSTHROUGH_BANNER extends CONTEXT_PASSTHROUGH_BANNER("context-passthrough-banner", Some("Allows \"Need Patient Banner\""), Some("http://terminology.hl7.org/CodeSystem/smart-capabilities"))
  case CONTEXT_PASSTHROUGH_STYLE extends CONTEXT_PASSTHROUGH_STYLE("context-passthrough-style", Some("Allows \"Smart Style Style\""), Some("http://terminology.hl7.org/CodeSystem/smart-capabilities"))
  case CONTEXT_STANDALONE_ENCOUNTER extends CONTEXT_STANDALONE_ENCOUNTER("context-standalone-encounter", Some("Allows \"Encounter Level Launch Context (STANDALONE)\""), Some("http://terminology.hl7.org/CodeSystem/smart-capabilities"))
  case CONTEXT_STANDALONE_PATIENT extends CONTEXT_STANDALONE_PATIENT("context-standalone-patient", Some("Allows \"Patient Level Launch Context (STANDALONE)\""), Some("http://terminology.hl7.org/CodeSystem/smart-capabilities"))
  case EHR_LAUNCH_MODE extends EHR_LAUNCH_MODE("launch-ehr", Some("EHR Launch Mode"), Some("http://terminology.hl7.org/CodeSystem/smart-capabilities"))
  case PUBLIC_CLIENT_PROFILE extends PUBLIC_CLIENT_PROFILE("client-public", Some("Public Client Profile"), Some("http://terminology.hl7.org/CodeSystem/smart-capabilities"))
  case STANDALONE_LAUNCH_MODE extends STANDALONE_LAUNCH_MODE("launch-standalone", Some("Standalone Launch Mode"), Some("http://terminology.hl7.org/CodeSystem/smart-capabilities"))
  case SUPPORTS_OPENID_CONNECT extends SUPPORTS_OPENID_CONNECT("sso-openid-connect", Some("Supports OpenID Connect"), Some("http://terminology.hl7.org/CodeSystem/smart-capabilities"))
  case SUPPORTS_PATIENT_LEVEL_SCOPES extends SUPPORTS_PATIENT_LEVEL_SCOPES("permission-patient", Some("Supports Patient Level Scopes"), Some("http://terminology.hl7.org/CodeSystem/smart-capabilities"))
  case SUPPORTS_REFRESH_TOKEN extends SUPPORTS_REFRESH_TOKEN("permission-offline", Some("Supports Refresh Token"), Some("http://terminology.hl7.org/CodeSystem/smart-capabilities"))
  case SUPPORTS_USER_LEVEL_SCOPES extends SUPPORTS_USER_LEVEL_SCOPES("permission-user", Some("Supports User Level Scopes"), Some("http://terminology.hl7.org/CodeSystem/smart-capabilities"))
}
object SMART_CAPABILITIES extends EType[SMART_CAPABILITIES]("http://hl7.org/fhir/ValueSet/smart-capabilities") 


enum STANDARDS_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case DEPRECATED extends DEPRECATED("deprecated", Some("Deprecated"), Some("http://terminology.hl7.org/CodeSystem/standards-status"))
  case DRAFT extends DRAFT("draft", Some("Draft"), Some("http://terminology.hl7.org/CodeSystem/standards-status"))
  case EXTERNAL extends EXTERNAL("external", Some("External"), Some("http://terminology.hl7.org/CodeSystem/standards-status"))
  case INFORMATIVE extends INFORMATIVE("informative", Some("Informative"), Some("http://terminology.hl7.org/CodeSystem/standards-status"))
  case NORMATIVE extends NORMATIVE("normative", Some("Normative"), Some("http://terminology.hl7.org/CodeSystem/standards-status"))
  case TRIAL_USE extends TRIAL_USE("trial-use", Some("Trial-Use"), Some("http://terminology.hl7.org/CodeSystem/standards-status"))
}
object STANDARDS_STATUS extends EType[STANDARDS_STATUS]("http://hl7.org/fhir/ValueSet/standards-status") 


enum TEMPLATE_STATUS_CODE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ACTIVE extends ACTIVE("active", Some("Active"), Some("urn:oid:2.16.840.1.113883.3.1937.98.5.8"))
  case CANCELLED extends CANCELLED("cancelled", Some("Cancelled"), Some("urn:oid:2.16.840.1.113883.3.1937.98.5.8"))
  case DRAFT extends DRAFT("draft", Some("Draft"), Some("urn:oid:2.16.840.1.113883.3.1937.98.5.8"))
  case PENDING extends PENDING("pending", Some("Under pre-publication review"), Some("urn:oid:2.16.840.1.113883.3.1937.98.5.8"))
  case REJECTED extends REJECTED("rejected", Some("Rejected"), Some("urn:oid:2.16.840.1.113883.3.1937.98.5.8"))
  case RETIRED extends RETIRED("retired", Some("Retired"), Some("urn:oid:2.16.840.1.113883.3.1937.98.5.8"))
  case REVIEW extends REVIEW("review", Some("In Review"), Some("urn:oid:2.16.840.1.113883.3.1937.98.5.8"))
  case TERMINATED extends TERMINATED("terminated", Some("Terminated"), Some("urn:oid:2.16.840.1.113883.3.1937.98.5.8"))
}
object TEMPLATE_STATUS_CODE extends EType[TEMPLATE_STATUS_CODE]("http://hl7.org/fhir/ValueSet/template-status-code") 


enum V3_ENTITYNAMEUSER2(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case A extends A("A", Some("business name"), Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2"))
  case ABC extends ABC("ABC", Some("alphabetic"), Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2"))
  case ANON extends ANON("ANON", Some("Anonymous"), Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2"))
  case ASSUMED extends ASSUMED("Assumed", Some("Assumed"), Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2"))
  case C extends C("C", Some("customary"), Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2"))
  case DN extends DN("DN", Some("do not use"), Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2"))
  case I extends I("I", Some("Indigenous/Tribal"), Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2"))
  case IDE extends IDE("IDE", Some("ideographic"), Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2"))
  case M extends M("M", Some("maiden name"), Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2"))
  case NAMEREPRESENTATIONUSE extends NAMEREPRESENTATIONUSE("NameRepresentationUse", Some("NameRepresentationUse"), Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2"))
  case OLD extends OLD("OLD", Some("no longer in use"), Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2"))
  case OR extends OR("OR", Some("official registry name"), Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2"))
  case P extends P("P", Some("Other/Pseudonym/Alias"), Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2"))
  case PHON extends PHON("PHON", Some("phonetic"), Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2"))
  case R extends R("R", Some("religious"), Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2"))
  case SRCH extends SRCH("SRCH", Some("search"), Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2"))
  case SYL extends SYL("SYL", Some("syllabic"), Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2"))
  case T extends T("T", Some("temporary"), Some("http://terminology.hl7.org/CodeSystem/v3-EntityNameUseR2"))
}
object V3_ENTITYNAMEUSER2 extends EType[V3_ENTITYNAMEUSER2]("http://terminology.hl7.org/ValueSet/v3-EntityNameUseR2") 


enum V3_NULLFLAVOR(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ASKU extends ASKU("ASKU", Some("asked but unknown"), Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor"))
  case DER extends DER("DER", Some("derived"), Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor"))
  case INV extends INV("INV", Some("invalid"), Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor"))
  case MSK extends MSK("MSK", Some("masked"), Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor"))
  case NA extends NA("NA", Some("not applicable"), Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor"))
  case NASK extends NASK("NASK", Some("not asked"), Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor"))
  case NAV extends NAV("NAV", Some("temporarily unavailable"), Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor"))
  case NAVU extends NAVU("NAVU", Some("Not available"), Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor"))
  case NI extends NI("NI", Some("NoInformation"), Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor"))
  case NINF extends NINF("NINF", Some("negative infinity"), Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor"))
  case NP extends NP("NP", Some("not present"), Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor"))
  case OTH extends OTH("OTH", Some("other"), Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor"))
  case PINF extends PINF("PINF", Some("positive infinity"), Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor"))
  case QS extends QS("QS", Some("Sufficient Quantity"), Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor"))
  case TRC extends TRC("TRC", Some("trace"), Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor"))
  case UNC extends UNC("UNC", Some("un-encoded"), Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor"))
  case UNK extends UNK("UNK", Some("unknown"), Some("http://terminology.hl7.org/CodeSystem/v3-NullFlavor"))
}
object V3_NULLFLAVOR extends EType[V3_NULLFLAVOR]("http://terminology.hl7.org/ValueSet/v3-NullFlavor") 

