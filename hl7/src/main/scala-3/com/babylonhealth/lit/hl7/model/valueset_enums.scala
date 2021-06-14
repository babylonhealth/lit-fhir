package com.babylonhealth.lit.hl7

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
enum ACCOUNT_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ACTIVE extends ACTIVE("active", Some("Active"), Some("http://hl7.org/fhir/account-status"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("Entered in error"), Some("http://hl7.org/fhir/account-status"))
  case INACTIVE extends INACTIVE("inactive", Some("Inactive"), Some("http://hl7.org/fhir/account-status"))
  case ON_HOLD extends ON_HOLD("on-hold", Some("On Hold"), Some("http://hl7.org/fhir/account-status"))
  case UNKNOWN extends UNKNOWN("unknown", Some("Unknown"), Some("http://hl7.org/fhir/account-status"))
}
object ACCOUNT_STATUS extends EType[ACCOUNT_STATUS]("http://hl7.org/fhir/ValueSet/account-status") 


enum ACTION_CARDINALITY_BEHAVIOR(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case MULTIPLE extends MULTIPLE("multiple", Some("Multiple"), Some("http://hl7.org/fhir/action-cardinality-behavior"))
  case SINGLE extends SINGLE("single", Some("Single"), Some("http://hl7.org/fhir/action-cardinality-behavior"))
}
object ACTION_CARDINALITY_BEHAVIOR extends EType[ACTION_CARDINALITY_BEHAVIOR]("http://hl7.org/fhir/ValueSet/action-cardinality-behavior") 


enum ACTION_CONDITION_KIND(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case APPLICABILITY extends APPLICABILITY("applicability", Some("Applicability"), Some("http://hl7.org/fhir/action-condition-kind"))
  case START extends START("start", Some("Start"), Some("http://hl7.org/fhir/action-condition-kind"))
  case STOP extends STOP("stop", Some("Stop"), Some("http://hl7.org/fhir/action-condition-kind"))
}
object ACTION_CONDITION_KIND extends EType[ACTION_CONDITION_KIND]("http://hl7.org/fhir/ValueSet/action-condition-kind") 


enum ACTION_GROUPING_BEHAVIOR(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case LOGICAL_GROUP extends LOGICAL_GROUP("logical-group", Some("Logical Group"), Some("http://hl7.org/fhir/action-grouping-behavior"))
  case SENTENCE_GROUP extends SENTENCE_GROUP("sentence-group", Some("Sentence Group"), Some("http://hl7.org/fhir/action-grouping-behavior"))
  case VISUAL_GROUP extends VISUAL_GROUP("visual-group", Some("Visual Group"), Some("http://hl7.org/fhir/action-grouping-behavior"))
}
object ACTION_GROUPING_BEHAVIOR extends EType[ACTION_GROUPING_BEHAVIOR]("http://hl7.org/fhir/ValueSet/action-grouping-behavior") 


enum ACTION_PARTICIPANT_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case DEVICE extends DEVICE("device", Some("Device"), Some("http://hl7.org/fhir/action-participant-type"))
  case PATIENT extends PATIENT("patient", Some("Patient"), Some("http://hl7.org/fhir/action-participant-type"))
  case PRACTITIONER extends PRACTITIONER("practitioner", Some("Practitioner"), Some("http://hl7.org/fhir/action-participant-type"))
  case RELATED_PERSON extends RELATED_PERSON("related-person", Some("Related Person"), Some("http://hl7.org/fhir/action-participant-type"))
}
object ACTION_PARTICIPANT_TYPE extends EType[ACTION_PARTICIPANT_TYPE]("http://hl7.org/fhir/ValueSet/action-participant-type") 


enum ACTION_PRECHECK_BEHAVIOR(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case NO extends NO("no", Some("No"), Some("http://hl7.org/fhir/action-precheck-behavior"))
  case YES extends YES("yes", Some("Yes"), Some("http://hl7.org/fhir/action-precheck-behavior"))
}
object ACTION_PRECHECK_BEHAVIOR extends EType[ACTION_PRECHECK_BEHAVIOR]("http://hl7.org/fhir/ValueSet/action-precheck-behavior") 


enum ACTION_RELATIONSHIP_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case AFTER extends AFTER("after", Some("After"), Some("http://hl7.org/fhir/action-relationship-type"))
  case AFTER_END extends AFTER_END("after-end", Some("After End"), Some("http://hl7.org/fhir/action-relationship-type"))
  case AFTER_START extends AFTER_START("after-start", Some("After Start"), Some("http://hl7.org/fhir/action-relationship-type"))
  case BEFORE extends BEFORE("before", Some("Before"), Some("http://hl7.org/fhir/action-relationship-type"))
  case BEFORE_END extends BEFORE_END("before-end", Some("Before End"), Some("http://hl7.org/fhir/action-relationship-type"))
  case BEFORE_START extends BEFORE_START("before-start", Some("Before Start"), Some("http://hl7.org/fhir/action-relationship-type"))
  case CONCURRENT extends CONCURRENT("concurrent", Some("Concurrent"), Some("http://hl7.org/fhir/action-relationship-type"))
  case CONCURRENT_WITH_END extends CONCURRENT_WITH_END("concurrent-with-end", Some("Concurrent With End"), Some("http://hl7.org/fhir/action-relationship-type"))
  case CONCURRENT_WITH_START extends CONCURRENT_WITH_START("concurrent-with-start", Some("Concurrent With Start"), Some("http://hl7.org/fhir/action-relationship-type"))
}
object ACTION_RELATIONSHIP_TYPE extends EType[ACTION_RELATIONSHIP_TYPE]("http://hl7.org/fhir/ValueSet/action-relationship-type") 


enum ACTION_REQUIRED_BEHAVIOR(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case COULD extends COULD("could", Some("Could"), Some("http://hl7.org/fhir/action-required-behavior"))
  case MUST extends MUST("must", Some("Must"), Some("http://hl7.org/fhir/action-required-behavior"))
  case MUST_UNLESS_DOCUMENTED extends MUST_UNLESS_DOCUMENTED("must-unless-documented", Some("Must Unless Documented"), Some("http://hl7.org/fhir/action-required-behavior"))
}
object ACTION_REQUIRED_BEHAVIOR extends EType[ACTION_REQUIRED_BEHAVIOR]("http://hl7.org/fhir/ValueSet/action-required-behavior") 


enum ACTION_SELECTION_BEHAVIOR(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ALL extends ALL("all", Some("All"), Some("http://hl7.org/fhir/action-selection-behavior"))
  case ALL_OR_NONE extends ALL_OR_NONE("all-or-none", Some("All Or None"), Some("http://hl7.org/fhir/action-selection-behavior"))
  case ANY extends ANY("any", Some("Any"), Some("http://hl7.org/fhir/action-selection-behavior"))
  case AT_MOST_ONE extends AT_MOST_ONE("at-most-one", Some("At Most One"), Some("http://hl7.org/fhir/action-selection-behavior"))
  case EXACTLY_ONE extends EXACTLY_ONE("exactly-one", Some("Exactly One"), Some("http://hl7.org/fhir/action-selection-behavior"))
  case ONE_OR_MORE extends ONE_OR_MORE("one-or-more", Some("One Or More"), Some("http://hl7.org/fhir/action-selection-behavior"))
}
object ACTION_SELECTION_BEHAVIOR extends EType[ACTION_SELECTION_BEHAVIOR]("http://hl7.org/fhir/ValueSet/action-selection-behavior") 


enum ADMINISTRATIVE_GENDER(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case FEMALE extends FEMALE("female", Some("Female"), Some("http://hl7.org/fhir/administrative-gender"))
  case MALE extends MALE("male", Some("Male"), Some("http://hl7.org/fhir/administrative-gender"))
  case OTHER extends OTHER("other", Some("Other"), Some("http://hl7.org/fhir/administrative-gender"))
  case UNKNOWN extends UNKNOWN("unknown", Some("Unknown"), Some("http://hl7.org/fhir/administrative-gender"))
}
object ADMINISTRATIVE_GENDER extends EType[ADMINISTRATIVE_GENDER]("http://hl7.org/fhir/ValueSet/administrative-gender") 


enum ADVERSE_EVENT_ACTUALITY(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ACTUAL extends ACTUAL("actual", Some("Adverse Event"), Some("http://hl7.org/fhir/adverse-event-actuality"))
  case POTENTIAL extends POTENTIAL("potential", Some("Potential Adverse Event"), Some("http://hl7.org/fhir/adverse-event-actuality"))
}
object ADVERSE_EVENT_ACTUALITY extends EType[ADVERSE_EVENT_ACTUALITY]("http://hl7.org/fhir/ValueSet/adverse-event-actuality") 


enum ALLERGY_INTOLERANCE_CATEGORY(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case BIOLOGIC extends BIOLOGIC("biologic", Some("Biologic"), Some("http://hl7.org/fhir/allergy-intolerance-category"))
  case ENVIRONMENT extends ENVIRONMENT("environment", Some("Environment"), Some("http://hl7.org/fhir/allergy-intolerance-category"))
  case FOOD extends FOOD("food", Some("Food"), Some("http://hl7.org/fhir/allergy-intolerance-category"))
  case MEDICATION extends MEDICATION("medication", Some("Medication"), Some("http://hl7.org/fhir/allergy-intolerance-category"))
}
object ALLERGY_INTOLERANCE_CATEGORY extends EType[ALLERGY_INTOLERANCE_CATEGORY]("http://hl7.org/fhir/ValueSet/allergy-intolerance-category") 


enum ALLERGY_INTOLERANCE_CRITICALITY(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case HIGH extends HIGH("high", Some("High Risk"), Some("http://hl7.org/fhir/allergy-intolerance-criticality"))
  case LOW extends LOW("low", Some("Low Risk"), Some("http://hl7.org/fhir/allergy-intolerance-criticality"))
  case UNABLE_TO_ASSESS_RISK extends UNABLE_TO_ASSESS_RISK("unable-to-assess", Some("Unable to Assess Risk"), Some("http://hl7.org/fhir/allergy-intolerance-criticality"))
}
object ALLERGY_INTOLERANCE_CRITICALITY extends EType[ALLERGY_INTOLERANCE_CRITICALITY]("http://hl7.org/fhir/ValueSet/allergy-intolerance-criticality") 


enum ALLERGY_INTOLERANCE_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ALLERGY extends ALLERGY("allergy", Some("Allergy"), Some("http://hl7.org/fhir/allergy-intolerance-type"))
  case INTOLERANCE extends INTOLERANCE("intolerance", Some("Intolerance"), Some("http://hl7.org/fhir/allergy-intolerance-type"))
}
object ALLERGY_INTOLERANCE_TYPE extends EType[ALLERGY_INTOLERANCE_TYPE]("http://hl7.org/fhir/ValueSet/allergy-intolerance-type") 


enum APPOINTMENTSTATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ARRIVED extends ARRIVED("arrived", Some("Arrived"), Some("http://hl7.org/fhir/appointmentstatus"))
  case BOOKED extends BOOKED("booked", Some("Booked"), Some("http://hl7.org/fhir/appointmentstatus"))
  case CANCELLED extends CANCELLED("cancelled", Some("Cancelled"), Some("http://hl7.org/fhir/appointmentstatus"))
  case CHECKED_IN extends CHECKED_IN("checked-in", Some("Checked In"), Some("http://hl7.org/fhir/appointmentstatus"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("Entered in error"), Some("http://hl7.org/fhir/appointmentstatus"))
  case FULFILLED extends FULFILLED("fulfilled", Some("Fulfilled"), Some("http://hl7.org/fhir/appointmentstatus"))
  case NOSHOW extends NOSHOW("noshow", Some("No Show"), Some("http://hl7.org/fhir/appointmentstatus"))
  case PENDING extends PENDING("pending", Some("Pending"), Some("http://hl7.org/fhir/appointmentstatus"))
  case PROPOSED extends PROPOSED("proposed", Some("Proposed"), Some("http://hl7.org/fhir/appointmentstatus"))
  case WAITLIST extends WAITLIST("waitlist", Some("Waitlisted"), Some("http://hl7.org/fhir/appointmentstatus"))
}
object APPOINTMENTSTATUS extends EType[APPOINTMENTSTATUS]("http://hl7.org/fhir/ValueSet/appointmentstatus") 


enum ASSERT_DIRECTION_CODES(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case REQUEST extends REQUEST("request", Some("request"), Some("http://hl7.org/fhir/assert-direction-codes"))
  case RESPONSE extends RESPONSE("response", Some("response"), Some("http://hl7.org/fhir/assert-direction-codes"))
}
object ASSERT_DIRECTION_CODES extends EType[ASSERT_DIRECTION_CODES]("http://hl7.org/fhir/ValueSet/assert-direction-codes") 


enum ASSERT_OPERATOR_CODES(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case CONTAINS extends CONTAINS("contains", Some("contains"), Some("http://hl7.org/fhir/assert-operator-codes"))
  case EMPTY extends EMPTY("empty", Some("empty"), Some("http://hl7.org/fhir/assert-operator-codes"))
  case EQUALS extends EQUALS("equals", Some("equals"), Some("http://hl7.org/fhir/assert-operator-codes"))
  case EVAL extends EVAL("eval", Some("evaluate"), Some("http://hl7.org/fhir/assert-operator-codes"))
  case GREATERTHAN extends GREATERTHAN("greaterThan", Some("greaterThan"), Some("http://hl7.org/fhir/assert-operator-codes"))
  case IN extends IN("in", Some("in"), Some("http://hl7.org/fhir/assert-operator-codes"))
  case LESSTHAN extends LESSTHAN("lessThan", Some("lessThan"), Some("http://hl7.org/fhir/assert-operator-codes"))
  case NOTCONTAINS extends NOTCONTAINS("notContains", Some("notContains"), Some("http://hl7.org/fhir/assert-operator-codes"))
  case NOTEMPTY extends NOTEMPTY("notEmpty", Some("notEmpty"), Some("http://hl7.org/fhir/assert-operator-codes"))
  case NOTEQUALS extends NOTEQUALS("notEquals", Some("notEquals"), Some("http://hl7.org/fhir/assert-operator-codes"))
  case NOTIN extends NOTIN("notIn", Some("notIn"), Some("http://hl7.org/fhir/assert-operator-codes"))
}
object ASSERT_OPERATOR_CODES extends EType[ASSERT_OPERATOR_CODES]("http://hl7.org/fhir/ValueSet/assert-operator-codes") 


enum ASSERT_RESPONSE_CODE_TYPES(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case BAD extends BAD("bad", Some("bad"), Some("http://hl7.org/fhir/assert-response-code-types"))
  case CONFLICT extends CONFLICT("conflict", Some("conflict"), Some("http://hl7.org/fhir/assert-response-code-types"))
  case CREATED extends CREATED("created", Some("created"), Some("http://hl7.org/fhir/assert-response-code-types"))
  case FORBIDDEN extends FORBIDDEN("forbidden", Some("forbidden"), Some("http://hl7.org/fhir/assert-response-code-types"))
  case GONE extends GONE("gone", Some("gone"), Some("http://hl7.org/fhir/assert-response-code-types"))
  case METHODNOTALLOWED extends METHODNOTALLOWED("methodNotAllowed", Some("methodNotAllowed"), Some("http://hl7.org/fhir/assert-response-code-types"))
  case NOCONTENT extends NOCONTENT("noContent", Some("noContent"), Some("http://hl7.org/fhir/assert-response-code-types"))
  case NOTFOUND extends NOTFOUND("notFound", Some("notFound"), Some("http://hl7.org/fhir/assert-response-code-types"))
  case NOTMODIFIED extends NOTMODIFIED("notModified", Some("notModified"), Some("http://hl7.org/fhir/assert-response-code-types"))
  case OKAY extends OKAY("okay", Some("okay"), Some("http://hl7.org/fhir/assert-response-code-types"))
  case PRECONDITIONFAILED extends PRECONDITIONFAILED("preconditionFailed", Some("preconditionFailed"), Some("http://hl7.org/fhir/assert-response-code-types"))
  case UNPROCESSABLE extends UNPROCESSABLE("unprocessable", Some("unprocessable"), Some("http://hl7.org/fhir/assert-response-code-types"))
}
object ASSERT_RESPONSE_CODE_TYPES extends EType[ASSERT_RESPONSE_CODE_TYPES]("http://hl7.org/fhir/ValueSet/assert-response-code-types") 


enum AUDIT_EVENT_ACTION(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case C extends C("C", Some("Create"), Some("http://hl7.org/fhir/audit-event-action"))
  case D extends D("D", Some("Delete"), Some("http://hl7.org/fhir/audit-event-action"))
  case E extends E("E", Some("Execute"), Some("http://hl7.org/fhir/audit-event-action"))
  case R extends R("R", Some("Read/View/Print"), Some("http://hl7.org/fhir/audit-event-action"))
  case U extends U("U", Some("Update"), Some("http://hl7.org/fhir/audit-event-action"))
}
object AUDIT_EVENT_ACTION extends EType[AUDIT_EVENT_ACTION]("http://hl7.org/fhir/ValueSet/audit-event-action") 


enum AUDIT_EVENT_OUTCOME(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case MAJOR_FAILURE extends MAJOR_FAILURE("12", Some("Major failure"), Some("http://hl7.org/fhir/audit-event-outcome"))
  case MINOR_FAILURE extends MINOR_FAILURE("4", Some("Minor failure"), Some("http://hl7.org/fhir/audit-event-outcome"))
  case SERIOUS_FAILURE extends SERIOUS_FAILURE("8", Some("Serious failure"), Some("http://hl7.org/fhir/audit-event-outcome"))
  case SUCCESS extends SUCCESS("0", Some("Success"), Some("http://hl7.org/fhir/audit-event-outcome"))
}
object AUDIT_EVENT_OUTCOME extends EType[AUDIT_EVENT_OUTCOME]("http://hl7.org/fhir/ValueSet/audit-event-outcome") 


enum BINDING_STRENGTH(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case EXAMPLE extends EXAMPLE("example", Some("Example"), Some("http://hl7.org/fhir/binding-strength"))
  case EXTENSIBLE extends EXTENSIBLE("extensible", Some("Extensible"), Some("http://hl7.org/fhir/binding-strength"))
  case PREFERRED extends PREFERRED("preferred", Some("Preferred"), Some("http://hl7.org/fhir/binding-strength"))
  case REQUIRED extends REQUIRED("required", Some("Required"), Some("http://hl7.org/fhir/binding-strength"))
}
object BINDING_STRENGTH extends EType[BINDING_STRENGTH]("http://hl7.org/fhir/ValueSet/binding-strength") 


enum BUNDLE_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case BATCH extends BATCH("batch", Some("Batch"), Some("http://hl7.org/fhir/bundle-type"))
  case BATCH_RESPONSE extends BATCH_RESPONSE("batch-response", Some("Batch Response"), Some("http://hl7.org/fhir/bundle-type"))
  case COLLECTION extends COLLECTION("collection", Some("Collection"), Some("http://hl7.org/fhir/bundle-type"))
  case DOCUMENT extends DOCUMENT("document", Some("Document"), Some("http://hl7.org/fhir/bundle-type"))
  case HISTORY extends HISTORY("history", Some("History List"), Some("http://hl7.org/fhir/bundle-type"))
  case MESSAGE extends MESSAGE("message", Some("Message"), Some("http://hl7.org/fhir/bundle-type"))
  case SEARCHSET extends SEARCHSET("searchset", Some("Search Results"), Some("http://hl7.org/fhir/bundle-type"))
  case TRANSACTION extends TRANSACTION("transaction", Some("Transaction"), Some("http://hl7.org/fhir/bundle-type"))
  case TRANSACTION_RESPONSE extends TRANSACTION_RESPONSE("transaction-response", Some("Transaction Response"), Some("http://hl7.org/fhir/bundle-type"))
}
object BUNDLE_TYPE extends EType[BUNDLE_TYPE]("http://hl7.org/fhir/ValueSet/bundle-type") 


enum CAPABILITY_STATEMENT_KIND(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case CAPABILITY extends CAPABILITY("capability", Some("Capability"), Some("http://hl7.org/fhir/capability-statement-kind"))
  case INSTANCE extends INSTANCE("instance", Some("Instance"), Some("http://hl7.org/fhir/capability-statement-kind"))
  case REQUIREMENTS extends REQUIREMENTS("requirements", Some("Requirements"), Some("http://hl7.org/fhir/capability-statement-kind"))
}
object CAPABILITY_STATEMENT_KIND extends EType[CAPABILITY_STATEMENT_KIND]("http://hl7.org/fhir/ValueSet/capability-statement-kind") 


enum CARE_PLAN_ACTIVITY_KIND(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case APPOINTMENT extends APPOINTMENT("Appointment", Some("Appointment"), Some("http://hl7.org/fhir/resource-types"))
  case COMMUNICATIONREQUEST extends COMMUNICATIONREQUEST("CommunicationRequest", Some("CommunicationRequest"), Some("http://hl7.org/fhir/resource-types"))
  case DEVICEREQUEST extends DEVICEREQUEST("DeviceRequest", Some("DeviceRequest"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICATIONREQUEST extends MEDICATIONREQUEST("MedicationRequest", Some("MedicationRequest"), Some("http://hl7.org/fhir/resource-types"))
  case NUTRITIONORDER extends NUTRITIONORDER("NutritionOrder", Some("NutritionOrder"), Some("http://hl7.org/fhir/resource-types"))
  case SERVICEREQUEST extends SERVICEREQUEST("ServiceRequest", Some("ServiceRequest"), Some("http://hl7.org/fhir/resource-types"))
  case TASK extends TASK("Task", Some("Task"), Some("http://hl7.org/fhir/resource-types"))
  case VISIONPRESCRIPTION extends VISIONPRESCRIPTION("VisionPrescription", Some("VisionPrescription"), Some("http://hl7.org/fhir/resource-types"))
}
object CARE_PLAN_ACTIVITY_KIND extends EType[CARE_PLAN_ACTIVITY_KIND]("http://hl7.org/fhir/ValueSet/care-plan-activity-kind") 


enum CARE_PLAN_ACTIVITY_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case CANCELLED extends CANCELLED("cancelled", Some("Cancelled"), Some("http://hl7.org/fhir/care-plan-activity-status"))
  case COMPLETED extends COMPLETED("completed", Some("Completed"), Some("http://hl7.org/fhir/care-plan-activity-status"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/care-plan-activity-status"))
  case IN_PROGRESS extends IN_PROGRESS("in-progress", Some("In Progress"), Some("http://hl7.org/fhir/care-plan-activity-status"))
  case NOT_STARTED extends NOT_STARTED("not-started", Some("Not Started"), Some("http://hl7.org/fhir/care-plan-activity-status"))
  case ON_HOLD extends ON_HOLD("on-hold", Some("On Hold"), Some("http://hl7.org/fhir/care-plan-activity-status"))
  case SCHEDULED extends SCHEDULED("scheduled", Some("Scheduled"), Some("http://hl7.org/fhir/care-plan-activity-status"))
  case STOPPED extends STOPPED("stopped", Some("Stopped"), Some("http://hl7.org/fhir/care-plan-activity-status"))
  case UNKNOWN extends UNKNOWN("unknown", Some("Unknown"), Some("http://hl7.org/fhir/care-plan-activity-status"))
}
object CARE_PLAN_ACTIVITY_STATUS extends EType[CARE_PLAN_ACTIVITY_STATUS]("http://hl7.org/fhir/ValueSet/care-plan-activity-status") 


enum CARE_PLAN_INTENT(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case OPTION extends OPTION("option", Some("option"), Some("http://hl7.org/fhir/request-intent"))
  case ORDER extends ORDER("order", Some("order"), Some("http://hl7.org/fhir/request-intent"))
  case PLAN extends PLAN("plan", Some("plan"), Some("http://hl7.org/fhir/request-intent"))
  case PROPOSAL extends PROPOSAL("proposal", Some("proposal"), Some("http://hl7.org/fhir/request-intent"))
}
object CARE_PLAN_INTENT extends EType[CARE_PLAN_INTENT]("http://hl7.org/fhir/ValueSet/care-plan-intent") 


enum CARE_TEAM_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ACTIVE extends ACTIVE("active", Some("Active"), Some("http://hl7.org/fhir/care-team-status"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/care-team-status"))
  case INACTIVE extends INACTIVE("inactive", Some("Inactive"), Some("http://hl7.org/fhir/care-team-status"))
  case PROPOSED extends PROPOSED("proposed", Some("Proposed"), Some("http://hl7.org/fhir/care-team-status"))
  case SUSPENDED extends SUSPENDED("suspended", Some("Suspended"), Some("http://hl7.org/fhir/care-team-status"))
}
object CARE_TEAM_STATUS extends EType[CARE_TEAM_STATUS]("http://hl7.org/fhir/ValueSet/care-team-status") 


enum CHARGEITEM_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ABORTED extends ABORTED("aborted", Some("Aborted"), Some("http://hl7.org/fhir/chargeitem-status"))
  case BILLABLE extends BILLABLE("billable", Some("Billable"), Some("http://hl7.org/fhir/chargeitem-status"))
  case BILLED extends BILLED("billed", Some("Billed"), Some("http://hl7.org/fhir/chargeitem-status"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/chargeitem-status"))
  case NOT_BILLABLE extends NOT_BILLABLE("not-billable", Some("Not billable"), Some("http://hl7.org/fhir/chargeitem-status"))
  case PLANNED extends PLANNED("planned", Some("Planned"), Some("http://hl7.org/fhir/chargeitem-status"))
  case UNKNOWN extends UNKNOWN("unknown", Some("Unknown"), Some("http://hl7.org/fhir/chargeitem-status"))
}
object CHARGEITEM_STATUS extends EType[CHARGEITEM_STATUS]("http://hl7.org/fhir/ValueSet/chargeitem-status") 


enum CLAIM_USE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case CLAIM extends CLAIM("claim", Some("Claim"), Some("http://hl7.org/fhir/claim-use"))
  case PREAUTHORIZATION extends PREAUTHORIZATION("preauthorization", Some("Preauthorization"), Some("http://hl7.org/fhir/claim-use"))
  case PREDETERMINATION extends PREDETERMINATION("predetermination", Some("Predetermination"), Some("http://hl7.org/fhir/claim-use"))
}
object CLAIM_USE extends EType[CLAIM_USE]("http://hl7.org/fhir/ValueSet/claim-use") 


enum CLINICALIMPRESSION_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case COMPLETED extends COMPLETED("completed", Some("completed"), Some("http://hl7.org/fhir/event-status"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("entered-in-error"), Some("http://hl7.org/fhir/event-status"))
  case IN_PROGRESS extends IN_PROGRESS("in-progress", Some("in-progress"), Some("http://hl7.org/fhir/event-status"))
}
object CLINICALIMPRESSION_STATUS extends EType[CLINICALIMPRESSION_STATUS]("http://hl7.org/fhir/ValueSet/clinicalimpression-status") 


enum CODESYSTEM_CONTENT_MODE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case COMPLETE extends COMPLETE("complete", Some("Complete"), Some("http://hl7.org/fhir/codesystem-content-mode"))
  case EXAMPLE extends EXAMPLE("example", Some("Example"), Some("http://hl7.org/fhir/codesystem-content-mode"))
  case FRAGMENT extends FRAGMENT("fragment", Some("Fragment"), Some("http://hl7.org/fhir/codesystem-content-mode"))
  case NOT_PRESENT extends NOT_PRESENT("not-present", Some("Not Present"), Some("http://hl7.org/fhir/codesystem-content-mode"))
  case SUPPLEMENT extends SUPPLEMENT("supplement", Some("Supplement"), Some("http://hl7.org/fhir/codesystem-content-mode"))
}
object CODESYSTEM_CONTENT_MODE extends EType[CODESYSTEM_CONTENT_MODE]("http://hl7.org/fhir/ValueSet/codesystem-content-mode") 


enum CODESYSTEM_HIERARCHY_MEANING(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case CLASSIFIED_WITH extends CLASSIFIED_WITH("classified-with", Some("Classified With"), Some("http://hl7.org/fhir/codesystem-hierarchy-meaning"))
  case GROUPED_BY extends GROUPED_BY("grouped-by", Some("Grouped By"), Some("http://hl7.org/fhir/codesystem-hierarchy-meaning"))
  case IS_A extends IS_A("is-a", Some("Is-A"), Some("http://hl7.org/fhir/codesystem-hierarchy-meaning"))
  case PART_OF extends PART_OF("part-of", Some("Part Of"), Some("http://hl7.org/fhir/codesystem-hierarchy-meaning"))
}
object CODESYSTEM_HIERARCHY_MEANING extends EType[CODESYSTEM_HIERARCHY_MEANING]("http://hl7.org/fhir/ValueSet/codesystem-hierarchy-meaning") 


enum CODE_SEARCH_SUPPORT(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ALL extends ALL("all", Some("Implicit Codes"), Some("http://hl7.org/fhir/code-search-support"))
  case EXPLICIT extends EXPLICIT("explicit", Some("Explicit Codes"), Some("http://hl7.org/fhir/code-search-support"))
}
object CODE_SEARCH_SUPPORT extends EType[CODE_SEARCH_SUPPORT]("http://hl7.org/fhir/ValueSet/code-search-support") 


enum COMPARTMENT_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case DEVICE extends DEVICE("Device", Some("Device"), Some("http://hl7.org/fhir/compartment-type"))
  case ENCOUNTER extends ENCOUNTER("Encounter", Some("Encounter"), Some("http://hl7.org/fhir/compartment-type"))
  case PATIENT extends PATIENT("Patient", Some("Patient"), Some("http://hl7.org/fhir/compartment-type"))
  case PRACTITIONER extends PRACTITIONER("Practitioner", Some("Practitioner"), Some("http://hl7.org/fhir/compartment-type"))
  case RELATEDPERSON extends RELATEDPERSON("RelatedPerson", Some("RelatedPerson"), Some("http://hl7.org/fhir/compartment-type"))
}
object COMPARTMENT_TYPE extends EType[COMPARTMENT_TYPE]("http://hl7.org/fhir/ValueSet/compartment-type") 


enum COMPOSITION_ATTESTATION_MODE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case LEGAL extends LEGAL("legal", Some("Legal"), Some("http://hl7.org/fhir/composition-attestation-mode"))
  case OFFICIAL extends OFFICIAL("official", Some("Official"), Some("http://hl7.org/fhir/composition-attestation-mode"))
  case PERSONAL extends PERSONAL("personal", Some("Personal"), Some("http://hl7.org/fhir/composition-attestation-mode"))
  case PROFESSIONAL extends PROFESSIONAL("professional", Some("Professional"), Some("http://hl7.org/fhir/composition-attestation-mode"))
}
object COMPOSITION_ATTESTATION_MODE extends EType[COMPOSITION_ATTESTATION_MODE]("http://hl7.org/fhir/ValueSet/composition-attestation-mode") 


enum COMPOSITION_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case AMENDED extends AMENDED("amended", Some("Amended"), Some("http://hl7.org/fhir/composition-status"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/composition-status"))
  case FINAL extends FINAL("final", Some("Final"), Some("http://hl7.org/fhir/composition-status"))
  case PRELIMINARY extends PRELIMINARY("preliminary", Some("Preliminary"), Some("http://hl7.org/fhir/composition-status"))
}
object COMPOSITION_STATUS extends EType[COMPOSITION_STATUS]("http://hl7.org/fhir/ValueSet/composition-status") 


enum CONCEPTMAP_UNMAPPED_MODE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case FIXED extends FIXED("fixed", Some("Fixed Code"), Some("http://hl7.org/fhir/conceptmap-unmapped-mode"))
  case OTHER_MAP extends OTHER_MAP("other-map", Some("Other Map"), Some("http://hl7.org/fhir/conceptmap-unmapped-mode"))
  case PROVIDED extends PROVIDED("provided", Some("Provided Code"), Some("http://hl7.org/fhir/conceptmap-unmapped-mode"))
}
object CONCEPTMAP_UNMAPPED_MODE extends EType[CONCEPTMAP_UNMAPPED_MODE]("http://hl7.org/fhir/ValueSet/conceptmap-unmapped-mode") 


enum CONCEPT_MAP_EQUIVALENCE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case DISJOINT extends DISJOINT("disjoint", Some("Disjoint"), Some("http://hl7.org/fhir/concept-map-equivalence"))
  case EQUAL extends EQUAL("equal", Some("Equal"), Some("http://hl7.org/fhir/concept-map-equivalence"))
  case EQUIVALENT extends EQUIVALENT("equivalent", Some("Equivalent"), Some("http://hl7.org/fhir/concept-map-equivalence"))
  case INEXACT extends INEXACT("inexact", Some("Inexact"), Some("http://hl7.org/fhir/concept-map-equivalence"))
  case NARROWER extends NARROWER("narrower", Some("Narrower"), Some("http://hl7.org/fhir/concept-map-equivalence"))
  case RELATEDTO extends RELATEDTO("relatedto", Some("Related To"), Some("http://hl7.org/fhir/concept-map-equivalence"))
  case SPECIALIZES extends SPECIALIZES("specializes", Some("Specializes"), Some("http://hl7.org/fhir/concept-map-equivalence"))
  case SUBSUMES extends SUBSUMES("subsumes", Some("Subsumes"), Some("http://hl7.org/fhir/concept-map-equivalence"))
  case UNMATCHED extends UNMATCHED("unmatched", Some("Unmatched"), Some("http://hl7.org/fhir/concept-map-equivalence"))
  case WIDER extends WIDER("wider", Some("Wider"), Some("http://hl7.org/fhir/concept-map-equivalence"))
}
object CONCEPT_MAP_EQUIVALENCE extends EType[CONCEPT_MAP_EQUIVALENCE]("http://hl7.org/fhir/ValueSet/concept-map-equivalence") 


enum CONCEPT_PROPERTY_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case BOOLEAN extends BOOLEAN("boolean", Some("boolean"), Some("http://hl7.org/fhir/concept-property-type"))
  case CODE extends CODE("code", Some("code (internal reference)"), Some("http://hl7.org/fhir/concept-property-type"))
  case CODING extends CODING("Coding", Some("Coding (external reference)"), Some("http://hl7.org/fhir/concept-property-type"))
  case DATETIME extends DATETIME("dateTime", Some("dateTime"), Some("http://hl7.org/fhir/concept-property-type"))
  case DECIMAL extends DECIMAL("decimal", Some("decimal"), Some("http://hl7.org/fhir/concept-property-type"))
  case INTEGER extends INTEGER("integer", Some("integer"), Some("http://hl7.org/fhir/concept-property-type"))
  case STRING extends STRING("string", Some("string"), Some("http://hl7.org/fhir/concept-property-type"))
}
object CONCEPT_PROPERTY_TYPE extends EType[CONCEPT_PROPERTY_TYPE]("http://hl7.org/fhir/ValueSet/concept-property-type") 


enum CONDITIONAL_DELETE_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case MULTIPLE extends MULTIPLE("multiple", Some("Multiple Deletes Supported"), Some("http://hl7.org/fhir/conditional-delete-status"))
  case NOT_SUPPORTED extends NOT_SUPPORTED("not-supported", Some("Not Supported"), Some("http://hl7.org/fhir/conditional-delete-status"))
  case SINGLE extends SINGLE("single", Some("Single Deletes Supported"), Some("http://hl7.org/fhir/conditional-delete-status"))
}
object CONDITIONAL_DELETE_STATUS extends EType[CONDITIONAL_DELETE_STATUS]("http://hl7.org/fhir/ValueSet/conditional-delete-status") 


enum CONDITIONAL_READ_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case FULL_SUPPORT extends FULL_SUPPORT("full-support", Some("Full Support"), Some("http://hl7.org/fhir/conditional-read-status"))
  case IF_MODIFIED_SINCE extends IF_MODIFIED_SINCE("modified-since", Some("If-Modified-Since"), Some("http://hl7.org/fhir/conditional-read-status"))
  case IF_NONE_MATCH extends IF_NONE_MATCH("not-match", Some("If-None-Match"), Some("http://hl7.org/fhir/conditional-read-status"))
  case NOT_SUPPORTED extends NOT_SUPPORTED("not-supported", Some("Not Supported"), Some("http://hl7.org/fhir/conditional-read-status"))
}
object CONDITIONAL_READ_STATUS extends EType[CONDITIONAL_READ_STATUS]("http://hl7.org/fhir/ValueSet/conditional-read-status") 


enum CONSENT_DATA_MEANING(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case AUTHOREDBY extends AUTHOREDBY("authoredby", Some("AuthoredBy"), Some("http://hl7.org/fhir/consent-data-meaning"))
  case DEPENDENTS extends DEPENDENTS("dependents", Some("Dependents"), Some("http://hl7.org/fhir/consent-data-meaning"))
  case INSTANCE extends INSTANCE("instance", Some("Instance"), Some("http://hl7.org/fhir/consent-data-meaning"))
  case RELATED extends RELATED("related", Some("Related"), Some("http://hl7.org/fhir/consent-data-meaning"))
}
object CONSENT_DATA_MEANING extends EType[CONSENT_DATA_MEANING]("http://hl7.org/fhir/ValueSet/consent-data-meaning") 


enum CONSENT_PROVISION_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case DENY extends DENY("deny", Some("Opt Out"), Some("http://hl7.org/fhir/consent-provision-type"))
  case PERMIT extends PERMIT("permit", Some("Opt In"), Some("http://hl7.org/fhir/consent-provision-type"))
}
object CONSENT_PROVISION_TYPE extends EType[CONSENT_PROVISION_TYPE]("http://hl7.org/fhir/ValueSet/consent-provision-type") 


enum CONSENT_STATE_CODES(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ACTIVE extends ACTIVE("active", Some("Active"), Some("http://hl7.org/fhir/consent-state-codes"))
  case DRAFT extends DRAFT("draft", Some("Pending"), Some("http://hl7.org/fhir/consent-state-codes"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/consent-state-codes"))
  case INACTIVE extends INACTIVE("inactive", Some("Inactive"), Some("http://hl7.org/fhir/consent-state-codes"))
  case PROPOSED extends PROPOSED("proposed", Some("Proposed"), Some("http://hl7.org/fhir/consent-state-codes"))
  case REJECTED extends REJECTED("rejected", Some("Rejected"), Some("http://hl7.org/fhir/consent-state-codes"))
}
object CONSENT_STATE_CODES extends EType[CONSENT_STATE_CODES]("http://hl7.org/fhir/ValueSet/consent-state-codes") 


enum CONSTRAINT_SEVERITY(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ERROR extends ERROR("error", Some("Error"), Some("http://hl7.org/fhir/constraint-severity"))
  case WARNING extends WARNING("warning", Some("Warning"), Some("http://hl7.org/fhir/constraint-severity"))
}
object CONSTRAINT_SEVERITY extends EType[CONSTRAINT_SEVERITY]("http://hl7.org/fhir/ValueSet/constraint-severity") 


enum CONTRACT_PUBLICATIONSTATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case AMENDED extends AMENDED("amended", Some("Amended"), Some("http://hl7.org/fhir/contract-publicationstatus"))
  case APPENDED extends APPENDED("appended", Some("Appended"), Some("http://hl7.org/fhir/contract-publicationstatus"))
  case CANCELLED extends CANCELLED("cancelled", Some("Cancelled"), Some("http://hl7.org/fhir/contract-publicationstatus"))
  case DISPUTED extends DISPUTED("disputed", Some("Disputed"), Some("http://hl7.org/fhir/contract-publicationstatus"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/contract-publicationstatus"))
  case EXECUTABLE extends EXECUTABLE("executable", Some("Executable"), Some("http://hl7.org/fhir/contract-publicationstatus"))
  case EXECUTED extends EXECUTED("executed", Some("Executed"), Some("http://hl7.org/fhir/contract-publicationstatus"))
  case NEGOTIABLE extends NEGOTIABLE("negotiable", Some("Negotiable"), Some("http://hl7.org/fhir/contract-publicationstatus"))
  case OFFERED extends OFFERED("offered", Some("Offered"), Some("http://hl7.org/fhir/contract-publicationstatus"))
  case POLICY extends POLICY("policy", Some("Policy"), Some("http://hl7.org/fhir/contract-publicationstatus"))
  case REJECTED extends REJECTED("rejected", Some("Rejected"), Some("http://hl7.org/fhir/contract-publicationstatus"))
  case RENEWED extends RENEWED("renewed", Some("Renewed"), Some("http://hl7.org/fhir/contract-publicationstatus"))
  case RESOLVED extends RESOLVED("resolved", Some("Resolved"), Some("http://hl7.org/fhir/contract-publicationstatus"))
  case REVOKED extends REVOKED("revoked", Some("Revoked"), Some("http://hl7.org/fhir/contract-publicationstatus"))
  case TERMINATED extends TERMINATED("terminated", Some("Terminated"), Some("http://hl7.org/fhir/contract-publicationstatus"))
}
object CONTRACT_PUBLICATIONSTATUS extends EType[CONTRACT_PUBLICATIONSTATUS]("http://hl7.org/fhir/ValueSet/contract-publicationstatus") 


enum CONTRACT_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case AMENDED extends AMENDED("amended", Some("Amended"), Some("http://hl7.org/fhir/contract-status"))
  case APPENDED extends APPENDED("appended", Some("Appended"), Some("http://hl7.org/fhir/contract-status"))
  case CANCELLED extends CANCELLED("cancelled", Some("Cancelled"), Some("http://hl7.org/fhir/contract-status"))
  case DISPUTED extends DISPUTED("disputed", Some("Disputed"), Some("http://hl7.org/fhir/contract-status"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/contract-status"))
  case EXECUTABLE extends EXECUTABLE("executable", Some("Executable"), Some("http://hl7.org/fhir/contract-status"))
  case EXECUTED extends EXECUTED("executed", Some("Executed"), Some("http://hl7.org/fhir/contract-status"))
  case NEGOTIABLE extends NEGOTIABLE("negotiable", Some("Negotiable"), Some("http://hl7.org/fhir/contract-status"))
  case OFFERED extends OFFERED("offered", Some("Offered"), Some("http://hl7.org/fhir/contract-status"))
  case POLICY extends POLICY("policy", Some("Policy"), Some("http://hl7.org/fhir/contract-status"))
  case REJECTED extends REJECTED("rejected", Some("Rejected"), Some("http://hl7.org/fhir/contract-status"))
  case RENEWED extends RENEWED("renewed", Some("Renewed"), Some("http://hl7.org/fhir/contract-status"))
  case RESOLVED extends RESOLVED("resolved", Some("Resolved"), Some("http://hl7.org/fhir/contract-status"))
  case REVOKED extends REVOKED("revoked", Some("Revoked"), Some("http://hl7.org/fhir/contract-status"))
  case TERMINATED extends TERMINATED("terminated", Some("Terminated"), Some("http://hl7.org/fhir/contract-status"))
}
object CONTRACT_STATUS extends EType[CONTRACT_STATUS]("http://hl7.org/fhir/ValueSet/contract-status") 


enum DEFINED_TYPES(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ACCOUNT extends ACCOUNT("Account", Some("Account"), Some("http://hl7.org/fhir/resource-types"))
  case ACTIVITYDEFINITION extends ACTIVITYDEFINITION("ActivityDefinition", Some("ActivityDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case ADDRESS extends ADDRESS("Address", Some("Address"), Some("http://hl7.org/fhir/data-types"))
  case ADVERSEEVENT extends ADVERSEEVENT("AdverseEvent", Some("AdverseEvent"), Some("http://hl7.org/fhir/resource-types"))
  case AGE extends AGE("Age", Some("Age"), Some("http://hl7.org/fhir/data-types"))
  case ALLERGYINTOLERANCE extends ALLERGYINTOLERANCE("AllergyIntolerance", Some("AllergyIntolerance"), Some("http://hl7.org/fhir/resource-types"))
  case ANNOTATION extends ANNOTATION("Annotation", Some("Annotation"), Some("http://hl7.org/fhir/data-types"))
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
object DEFINED_TYPES extends EType[DEFINED_TYPES]("http://hl7.org/fhir/ValueSet/defined-types") 


enum DETECTEDISSUE_SEVERITY(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case HIGH extends HIGH("high", Some("High"), Some("http://hl7.org/fhir/detectedissue-severity"))
  case LOW extends LOW("low", Some("Low"), Some("http://hl7.org/fhir/detectedissue-severity"))
  case MODERATE extends MODERATE("moderate", Some("Moderate"), Some("http://hl7.org/fhir/detectedissue-severity"))
}
object DETECTEDISSUE_SEVERITY extends EType[DETECTEDISSUE_SEVERITY]("http://hl7.org/fhir/ValueSet/detectedissue-severity") 


enum DEVICE_NAMETYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case MANUFACTURER_NAME extends MANUFACTURER_NAME("manufacturer-name", Some("Manufacturer name"), Some("http://hl7.org/fhir/device-nametype"))
  case MODEL_NAME extends MODEL_NAME("model-name", Some("Model name"), Some("http://hl7.org/fhir/device-nametype"))
  case OTHER extends OTHER("other", Some("other"), Some("http://hl7.org/fhir/device-nametype"))
  case PATIENT_REPORTED_NAME extends PATIENT_REPORTED_NAME("patient-reported-name", Some("Patient Reported name"), Some("http://hl7.org/fhir/device-nametype"))
  case UDI_LABEL_NAME extends UDI_LABEL_NAME("udi-label-name", Some("UDI Label name"), Some("http://hl7.org/fhir/device-nametype"))
  case USER_FRIENDLY_NAME extends USER_FRIENDLY_NAME("user-friendly-name", Some("User Friendly name"), Some("http://hl7.org/fhir/device-nametype"))
}
object DEVICE_NAMETYPE extends EType[DEVICE_NAMETYPE]("http://hl7.org/fhir/ValueSet/device-nametype") 


enum DEVICE_STATEMENT_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ACTIVE extends ACTIVE("active", Some("Active"), Some("http://hl7.org/fhir/device-statement-status"))
  case COMPLETED extends COMPLETED("completed", Some("Completed"), Some("http://hl7.org/fhir/device-statement-status"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/device-statement-status"))
  case INTENDED extends INTENDED("intended", Some("Intended"), Some("http://hl7.org/fhir/device-statement-status"))
  case ON_HOLD extends ON_HOLD("on-hold", Some("On Hold"), Some("http://hl7.org/fhir/device-statement-status"))
  case STOPPED extends STOPPED("stopped", Some("Stopped"), Some("http://hl7.org/fhir/device-statement-status"))
}
object DEVICE_STATEMENT_STATUS extends EType[DEVICE_STATEMENT_STATUS]("http://hl7.org/fhir/ValueSet/device-statement-status") 


enum DEVICE_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ACTIVE extends ACTIVE("active", Some("Active"), Some("http://hl7.org/fhir/device-status"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/device-status"))
  case INACTIVE extends INACTIVE("inactive", Some("Inactive"), Some("http://hl7.org/fhir/device-status"))
  case UNKNOWN extends UNKNOWN("unknown", Some("Unknown"), Some("http://hl7.org/fhir/device-status"))
}
object DEVICE_STATUS extends EType[DEVICE_STATUS]("http://hl7.org/fhir/ValueSet/device-status") 


enum DIAGNOSTIC_REPORT_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case AMENDED extends AMENDED("amended", Some("Amended"), Some("http://hl7.org/fhir/diagnostic-report-status"))
  case APPENDED extends APPENDED("appended", Some("Appended"), Some("http://hl7.org/fhir/diagnostic-report-status"))
  case CANCELLED extends CANCELLED("cancelled", Some("Cancelled"), Some("http://hl7.org/fhir/diagnostic-report-status"))
  case CORRECTED extends CORRECTED("corrected", Some("Corrected"), Some("http://hl7.org/fhir/diagnostic-report-status"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/diagnostic-report-status"))
  case FINAL extends FINAL("final", Some("Final"), Some("http://hl7.org/fhir/diagnostic-report-status"))
  case PARTIAL extends PARTIAL("partial", Some("Partial"), Some("http://hl7.org/fhir/diagnostic-report-status"))
  case PRELIMINARY extends PRELIMINARY("preliminary", Some("Preliminary"), Some("http://hl7.org/fhir/diagnostic-report-status"))
  case REGISTERED extends REGISTERED("registered", Some("Registered"), Some("http://hl7.org/fhir/diagnostic-report-status"))
  case UNKNOWN extends UNKNOWN("unknown", Some("Unknown"), Some("http://hl7.org/fhir/diagnostic-report-status"))
}
object DIAGNOSTIC_REPORT_STATUS extends EType[DIAGNOSTIC_REPORT_STATUS]("http://hl7.org/fhir/ValueSet/diagnostic-report-status") 


enum DISCRIMINATOR_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case EXISTS extends EXISTS("exists", Some("Exists"), Some("http://hl7.org/fhir/discriminator-type"))
  case PATTERN extends PATTERN("pattern", Some("Pattern"), Some("http://hl7.org/fhir/discriminator-type"))
  case PROFILE extends PROFILE("profile", Some("Profile"), Some("http://hl7.org/fhir/discriminator-type"))
  case TYPE extends TYPE("type", Some("Type"), Some("http://hl7.org/fhir/discriminator-type"))
  case VALUE extends VALUE("value", Some("Value"), Some("http://hl7.org/fhir/discriminator-type"))
}
object DISCRIMINATOR_TYPE extends EType[DISCRIMINATOR_TYPE]("http://hl7.org/fhir/ValueSet/discriminator-type") 


enum DOCUMENT_MODE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case CONSUMER extends CONSUMER("consumer", Some("Consumer"), Some("http://hl7.org/fhir/document-mode"))
  case PRODUCER extends PRODUCER("producer", Some("Producer"), Some("http://hl7.org/fhir/document-mode"))
}
object DOCUMENT_MODE extends EType[DOCUMENT_MODE]("http://hl7.org/fhir/ValueSet/document-mode") 


enum DOCUMENT_REFERENCE_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case CURRENT extends CURRENT("current", Some("Current"), Some("http://hl7.org/fhir/document-reference-status"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/document-reference-status"))
  case SUPERSEDED extends SUPERSEDED("superseded", Some("Superseded"), Some("http://hl7.org/fhir/document-reference-status"))
}
object DOCUMENT_REFERENCE_STATUS extends EType[DOCUMENT_REFERENCE_STATUS]("http://hl7.org/fhir/ValueSet/document-reference-status") 


enum DOCUMENT_RELATIONSHIP_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case APPENDS extends APPENDS("appends", Some("Appends"), Some("http://hl7.org/fhir/document-relationship-type"))
  case REPLACES extends REPLACES("replaces", Some("Replaces"), Some("http://hl7.org/fhir/document-relationship-type"))
  case SIGNS extends SIGNS("signs", Some("Signs"), Some("http://hl7.org/fhir/document-relationship-type"))
  case TRANSFORMS extends TRANSFORMS("transforms", Some("Transforms"), Some("http://hl7.org/fhir/document-relationship-type"))
}
object DOCUMENT_RELATIONSHIP_TYPE extends EType[DOCUMENT_RELATIONSHIP_TYPE]("http://hl7.org/fhir/ValueSet/document-relationship-type") 


enum ELIGIBILITYREQUEST_PURPOSE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case BENEFITS extends BENEFITS("benefits", Some("Coverage benefits"), Some("http://hl7.org/fhir/eligibilityrequest-purpose"))
  case COVERAGE_AUTH_REQUIREMENTS extends COVERAGE_AUTH_REQUIREMENTS("auth-requirements", Some("Coverage auth-requirements"), Some("http://hl7.org/fhir/eligibilityrequest-purpose"))
  case DISCOVERY extends DISCOVERY("discovery", Some("Coverage Discovery"), Some("http://hl7.org/fhir/eligibilityrequest-purpose"))
  case VALIDATION extends VALIDATION("validation", Some("Coverage Validation"), Some("http://hl7.org/fhir/eligibilityrequest-purpose"))
}
object ELIGIBILITYREQUEST_PURPOSE extends EType[ELIGIBILITYREQUEST_PURPOSE]("http://hl7.org/fhir/ValueSet/eligibilityrequest-purpose") 


enum ELIGIBILITYRESPONSE_PURPOSE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case BENEFITS extends BENEFITS("benefits", Some("Coverage benefits"), Some("http://hl7.org/fhir/eligibilityresponse-purpose"))
  case COVERAGE_AUTH_REQUIREMENTS extends COVERAGE_AUTH_REQUIREMENTS("auth-requirements", Some("Coverage auth-requirements"), Some("http://hl7.org/fhir/eligibilityresponse-purpose"))
  case DISCOVERY extends DISCOVERY("discovery", Some("Coverage Discovery"), Some("http://hl7.org/fhir/eligibilityresponse-purpose"))
  case VALIDATION extends VALIDATION("validation", Some("Coverage Validation"), Some("http://hl7.org/fhir/eligibilityresponse-purpose"))
}
object ELIGIBILITYRESPONSE_PURPOSE extends EType[ELIGIBILITYRESPONSE_PURPOSE]("http://hl7.org/fhir/ValueSet/eligibilityresponse-purpose") 


enum ENCOUNTER_LOCATION_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ACTIVE extends ACTIVE("active", Some("Active"), Some("http://hl7.org/fhir/encounter-location-status"))
  case COMPLETED extends COMPLETED("completed", Some("Completed"), Some("http://hl7.org/fhir/encounter-location-status"))
  case PLANNED extends PLANNED("planned", Some("Planned"), Some("http://hl7.org/fhir/encounter-location-status"))
  case RESERVED extends RESERVED("reserved", Some("Reserved"), Some("http://hl7.org/fhir/encounter-location-status"))
}
object ENCOUNTER_LOCATION_STATUS extends EType[ENCOUNTER_LOCATION_STATUS]("http://hl7.org/fhir/ValueSet/encounter-location-status") 


enum ENCOUNTER_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ARRIVED extends ARRIVED("arrived", Some("Arrived"), Some("http://hl7.org/fhir/encounter-status"))
  case CANCELLED extends CANCELLED("cancelled", Some("Cancelled"), Some("http://hl7.org/fhir/encounter-status"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/encounter-status"))
  case FINISHED extends FINISHED("finished", Some("Finished"), Some("http://hl7.org/fhir/encounter-status"))
  case IN_PROGRESS extends IN_PROGRESS("in-progress", Some("In Progress"), Some("http://hl7.org/fhir/encounter-status"))
  case ONLEAVE extends ONLEAVE("onleave", Some("On Leave"), Some("http://hl7.org/fhir/encounter-status"))
  case PLANNED extends PLANNED("planned", Some("Planned"), Some("http://hl7.org/fhir/encounter-status"))
  case TRIAGED extends TRIAGED("triaged", Some("Triaged"), Some("http://hl7.org/fhir/encounter-status"))
  case UNKNOWN extends UNKNOWN("unknown", Some("Unknown"), Some("http://hl7.org/fhir/encounter-status"))
}
object ENCOUNTER_STATUS extends EType[ENCOUNTER_STATUS]("http://hl7.org/fhir/ValueSet/encounter-status") 


enum ENDPOINT_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ACTIVE extends ACTIVE("active", Some("Active"), Some("http://hl7.org/fhir/endpoint-status"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("Entered in error"), Some("http://hl7.org/fhir/endpoint-status"))
  case ERROR extends ERROR("error", Some("Error"), Some("http://hl7.org/fhir/endpoint-status"))
  case OFF extends OFF("off", Some("Off"), Some("http://hl7.org/fhir/endpoint-status"))
  case SUSPENDED extends SUSPENDED("suspended", Some("Suspended"), Some("http://hl7.org/fhir/endpoint-status"))
  case TEST extends TEST("test", Some("Test"), Some("http://hl7.org/fhir/endpoint-status"))
}
object ENDPOINT_STATUS extends EType[ENDPOINT_STATUS]("http://hl7.org/fhir/ValueSet/endpoint-status") 


enum EPISODE_OF_CARE_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ACTIVE extends ACTIVE("active", Some("Active"), Some("http://hl7.org/fhir/episode-of-care-status"))
  case CANCELLED extends CANCELLED("cancelled", Some("Cancelled"), Some("http://hl7.org/fhir/episode-of-care-status"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/episode-of-care-status"))
  case FINISHED extends FINISHED("finished", Some("Finished"), Some("http://hl7.org/fhir/episode-of-care-status"))
  case ONHOLD extends ONHOLD("onhold", Some("On Hold"), Some("http://hl7.org/fhir/episode-of-care-status"))
  case PLANNED extends PLANNED("planned", Some("Planned"), Some("http://hl7.org/fhir/episode-of-care-status"))
  case WAITLIST extends WAITLIST("waitlist", Some("Waitlist"), Some("http://hl7.org/fhir/episode-of-care-status"))
}
object EPISODE_OF_CARE_STATUS extends EType[EPISODE_OF_CARE_STATUS]("http://hl7.org/fhir/ValueSet/episode-of-care-status") 


enum EVENT_CAPABILITY_MODE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case RECEIVER extends RECEIVER("receiver", Some("Receiver"), Some("http://hl7.org/fhir/event-capability-mode"))
  case SENDER extends SENDER("sender", Some("Sender"), Some("http://hl7.org/fhir/event-capability-mode"))
}
object EVENT_CAPABILITY_MODE extends EType[EVENT_CAPABILITY_MODE]("http://hl7.org/fhir/ValueSet/event-capability-mode") 


enum EVENT_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case COMPLETED extends COMPLETED("completed", Some("Completed"), Some("http://hl7.org/fhir/event-status"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/event-status"))
  case IN_PROGRESS extends IN_PROGRESS("in-progress", Some("In Progress"), Some("http://hl7.org/fhir/event-status"))
  case NOT_DONE extends NOT_DONE("not-done", Some("Not Done"), Some("http://hl7.org/fhir/event-status"))
  case ON_HOLD extends ON_HOLD("on-hold", Some("On Hold"), Some("http://hl7.org/fhir/event-status"))
  case PREPARATION extends PREPARATION("preparation", Some("Preparation"), Some("http://hl7.org/fhir/event-status"))
  case STOPPED extends STOPPED("stopped", Some("Stopped"), Some("http://hl7.org/fhir/event-status"))
  case UNKNOWN extends UNKNOWN("unknown", Some("Unknown"), Some("http://hl7.org/fhir/event-status"))
}
object EVENT_STATUS extends EType[EVENT_STATUS]("http://hl7.org/fhir/ValueSet/event-status") 


enum EXAMPLESCENARIO_ACTOR_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ENTITY extends ENTITY("entity", Some("System"), Some("http://hl7.org/fhir/examplescenario-actor-type"))
  case PERSON extends PERSON("person", Some("Person"), Some("http://hl7.org/fhir/examplescenario-actor-type"))
}
object EXAMPLESCENARIO_ACTOR_TYPE extends EType[EXAMPLESCENARIO_ACTOR_TYPE]("http://hl7.org/fhir/ValueSet/examplescenario-actor-type") 


enum EXPLANATIONOFBENEFIT_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ACTIVE extends ACTIVE("active", Some("Active"), Some("http://hl7.org/fhir/explanationofbenefit-status"))
  case CANCELLED extends CANCELLED("cancelled", Some("Cancelled"), Some("http://hl7.org/fhir/explanationofbenefit-status"))
  case DRAFT extends DRAFT("draft", Some("Draft"), Some("http://hl7.org/fhir/explanationofbenefit-status"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("Entered In Error"), Some("http://hl7.org/fhir/explanationofbenefit-status"))
}
object EXPLANATIONOFBENEFIT_STATUS extends EType[EXPLANATIONOFBENEFIT_STATUS]("http://hl7.org/fhir/ValueSet/explanationofbenefit-status") 


enum EXPOSURE_STATE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case EXPOSURE extends EXPOSURE("exposure", Some("Exposure"), Some("http://hl7.org/fhir/exposure-state"))
  case EXPOSURE_ALTERNATIVE extends EXPOSURE_ALTERNATIVE("exposure-alternative", Some("Exposure Alternative"), Some("http://hl7.org/fhir/exposure-state"))
}
object EXPOSURE_STATE extends EType[EXPOSURE_STATE]("http://hl7.org/fhir/ValueSet/exposure-state") 


enum EXTENSION_CONTEXT_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ELEMENT extends ELEMENT("element", Some("Element ID"), Some("http://hl7.org/fhir/extension-context-type"))
  case EXTENSION extends EXTENSION("extension", Some("Extension URL"), Some("http://hl7.org/fhir/extension-context-type"))
  case FHIRPATH extends FHIRPATH("fhirpath", Some("FHIRPath"), Some("http://hl7.org/fhir/extension-context-type"))
}
object EXTENSION_CONTEXT_TYPE extends EType[EXTENSION_CONTEXT_TYPE]("http://hl7.org/fhir/ValueSet/extension-context-type") 


enum FHIR_VERSION(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case `0.0.80` extends `0.0.80`("0.0.80", Some("0.0.80"), Some("http://hl7.org/fhir/FHIR-version"))
  case `0.0.81` extends `0.0.81`("0.0.81", Some("0.0.81"), Some("http://hl7.org/fhir/FHIR-version"))
  case `0.0.82` extends `0.0.82`("0.0.82", Some("0.0.82"), Some("http://hl7.org/fhir/FHIR-version"))
  case `0.01` extends `0.01`("0.01", Some("0.01"), Some("http://hl7.org/fhir/FHIR-version"))
  case `0.05` extends `0.05`("0.05", Some("0.05"), Some("http://hl7.org/fhir/FHIR-version"))
  case `0.06` extends `0.06`("0.06", Some("0.06"), Some("http://hl7.org/fhir/FHIR-version"))
  case `0.11` extends `0.11`("0.11", Some("0.11"), Some("http://hl7.org/fhir/FHIR-version"))
  case `0.4.0` extends `0.4.0`("0.4.0", Some("0.4.0"), Some("http://hl7.org/fhir/FHIR-version"))
  case `0.5.0` extends `0.5.0`("0.5.0", Some("0.5.0"), Some("http://hl7.org/fhir/FHIR-version"))
  case `1.0.0` extends `1.0.0`("1.0.0", Some("1.0.0"), Some("http://hl7.org/fhir/FHIR-version"))
  case `1.0.1` extends `1.0.1`("1.0.1", Some("1.0.1"), Some("http://hl7.org/fhir/FHIR-version"))
  case `1.0.2` extends `1.0.2`("1.0.2", Some("1.0.2"), Some("http://hl7.org/fhir/FHIR-version"))
  case `1.1.0` extends `1.1.0`("1.1.0", Some("1.1.0"), Some("http://hl7.org/fhir/FHIR-version"))
  case `1.4.0` extends `1.4.0`("1.4.0", Some("1.4.0"), Some("http://hl7.org/fhir/FHIR-version"))
  case `1.6.0` extends `1.6.0`("1.6.0", Some("1.6.0"), Some("http://hl7.org/fhir/FHIR-version"))
  case `1.8.0` extends `1.8.0`("1.8.0", Some("1.8.0"), Some("http://hl7.org/fhir/FHIR-version"))
  case `3.0.0` extends `3.0.0`("3.0.0", Some("3.0.0"), Some("http://hl7.org/fhir/FHIR-version"))
  case `3.0.1` extends `3.0.1`("3.0.1", Some("3.0.1"), Some("http://hl7.org/fhir/FHIR-version"))
  case `3.3.0` extends `3.3.0`("3.3.0", Some("3.3.0"), Some("http://hl7.org/fhir/FHIR-version"))
  case `3.5.0` extends `3.5.0`("3.5.0", Some("3.5.0"), Some("http://hl7.org/fhir/FHIR-version"))
  case `4.0.0` extends `4.0.0`("4.0.0", Some("4.0.0"), Some("http://hl7.org/fhir/FHIR-version"))
  case `4.0.1` extends `4.0.1`("4.0.1", Some("4.0.1"), Some("http://hl7.org/fhir/FHIR-version"))
}
object FHIR_VERSION extends EType[FHIR_VERSION]("http://hl7.org/fhir/ValueSet/FHIR-version") 


enum FILTER_OPERATOR(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case DESCENDENT_OF extends DESCENDENT_OF("descendent-of", Some("Descendent Of (by subsumption)"), Some("http://hl7.org/fhir/filter-operator"))
  case EQUALS extends EQUALS("=", Some("Equals"), Some("http://hl7.org/fhir/filter-operator"))
  case EXISTS extends EXISTS("exists", Some("Exists"), Some("http://hl7.org/fhir/filter-operator"))
  case GENERALIZES extends GENERALIZES("generalizes", Some("Generalizes (by Subsumption)"), Some("http://hl7.org/fhir/filter-operator"))
  case IN extends IN("in", Some("In Set"), Some("http://hl7.org/fhir/filter-operator"))
  case IS_A extends IS_A("is-a", Some("Is A (by subsumption)"), Some("http://hl7.org/fhir/filter-operator"))
  case IS_NOT_A extends IS_NOT_A("is-not-a", Some("Not (Is A) (by subsumption)"), Some("http://hl7.org/fhir/filter-operator"))
  case NOT_IN_SET extends NOT_IN_SET("not-in", Some("Not in Set"), Some("http://hl7.org/fhir/filter-operator"))
  case REGEX extends REGEX("regex", Some("Regular Expression"), Some("http://hl7.org/fhir/filter-operator"))
}
object FILTER_OPERATOR extends EType[FILTER_OPERATOR]("http://hl7.org/fhir/ValueSet/filter-operator") 


enum FLAG_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ACTIVE extends ACTIVE("active", Some("Active"), Some("http://hl7.org/fhir/flag-status"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/flag-status"))
  case INACTIVE extends INACTIVE("inactive", Some("Inactive"), Some("http://hl7.org/fhir/flag-status"))
}
object FLAG_STATUS extends EType[FLAG_STATUS]("http://hl7.org/fhir/ValueSet/flag-status") 


enum FM_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ACTIVE extends ACTIVE("active", Some("Active"), Some("http://hl7.org/fhir/fm-status"))
  case CANCELLED extends CANCELLED("cancelled", Some("Cancelled"), Some("http://hl7.org/fhir/fm-status"))
  case DRAFT extends DRAFT("draft", Some("Draft"), Some("http://hl7.org/fhir/fm-status"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/fm-status"))
}
object FM_STATUS extends EType[FM_STATUS]("http://hl7.org/fhir/ValueSet/fm-status") 


enum GOAL_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ACCEPTED extends ACCEPTED("accepted", Some("Accepted"), Some("http://hl7.org/fhir/goal-status"))
  case ACTIVE extends ACTIVE("active", Some("Active"), Some("http://hl7.org/fhir/goal-status"))
  case CANCELLED extends CANCELLED("cancelled", Some("Cancelled"), Some("http://hl7.org/fhir/goal-status"))
  case COMPLETED extends COMPLETED("completed", Some("Completed"), Some("http://hl7.org/fhir/goal-status"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/goal-status"))
  case ON_HOLD extends ON_HOLD("on-hold", Some("On Hold"), Some("http://hl7.org/fhir/goal-status"))
  case PLANNED extends PLANNED("planned", Some("Planned"), Some("http://hl7.org/fhir/goal-status"))
  case PROPOSED extends PROPOSED("proposed", Some("Proposed"), Some("http://hl7.org/fhir/goal-status"))
  case REJECTED extends REJECTED("rejected", Some("Rejected"), Some("http://hl7.org/fhir/goal-status"))
}
object GOAL_STATUS extends EType[GOAL_STATUS]("http://hl7.org/fhir/ValueSet/goal-status") 


enum GRAPH_COMPARTMENT_RULE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case CUSTOM extends CUSTOM("custom", Some("Custom"), Some("http://hl7.org/fhir/graph-compartment-rule"))
  case DIFFERENT extends DIFFERENT("different", Some("Different"), Some("http://hl7.org/fhir/graph-compartment-rule"))
  case IDENTICAL extends IDENTICAL("identical", Some("Identical"), Some("http://hl7.org/fhir/graph-compartment-rule"))
  case MATCHING extends MATCHING("matching", Some("Matching"), Some("http://hl7.org/fhir/graph-compartment-rule"))
}
object GRAPH_COMPARTMENT_RULE extends EType[GRAPH_COMPARTMENT_RULE]("http://hl7.org/fhir/ValueSet/graph-compartment-rule") 


enum GRAPH_COMPARTMENT_USE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case CONDITION extends CONDITION("condition", Some("Condition"), Some("http://hl7.org/fhir/graph-compartment-use"))
  case REQUIREMENT extends REQUIREMENT("requirement", Some("Requirement"), Some("http://hl7.org/fhir/graph-compartment-use"))
}
object GRAPH_COMPARTMENT_USE extends EType[GRAPH_COMPARTMENT_USE]("http://hl7.org/fhir/ValueSet/graph-compartment-use") 


enum GROUP_MEASURE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case MEAN extends MEAN("mean", Some("Mean"), Some("http://hl7.org/fhir/group-measure"))
  case MEAN_OF_STUDY_MEANS extends MEAN_OF_STUDY_MEANS("mean-of-mean", Some("Mean of Study Means"), Some("http://hl7.org/fhir/group-measure"))
  case MEAN_OF_STUDY_MEDINS extends MEAN_OF_STUDY_MEDINS("mean-of-median", Some("Mean of Study Medins"), Some("http://hl7.org/fhir/group-measure"))
  case MEDIAN extends MEDIAN("median", Some("Median"), Some("http://hl7.org/fhir/group-measure"))
  case MEDIAN_OF_STUDY_MEANS extends MEDIAN_OF_STUDY_MEANS("median-of-mean", Some("Median of Study Means"), Some("http://hl7.org/fhir/group-measure"))
  case MEDIAN_OF_STUDY_MEDIANS extends MEDIAN_OF_STUDY_MEDIANS("median-of-median", Some("Median of Study Medians"), Some("http://hl7.org/fhir/group-measure"))
}
object GROUP_MEASURE extends EType[GROUP_MEASURE]("http://hl7.org/fhir/ValueSet/group-measure") 


enum GROUP_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ANIMAL extends ANIMAL("animal", Some("Animal"), Some("http://hl7.org/fhir/group-type"))
  case DEVICE extends DEVICE("device", Some("Device"), Some("http://hl7.org/fhir/group-type"))
  case MEDICATION extends MEDICATION("medication", Some("Medication"), Some("http://hl7.org/fhir/group-type"))
  case PERSON extends PERSON("person", Some("Person"), Some("http://hl7.org/fhir/group-type"))
  case PRACTITIONER extends PRACTITIONER("practitioner", Some("Practitioner"), Some("http://hl7.org/fhir/group-type"))
  case SUBSTANCE extends SUBSTANCE("substance", Some("Substance"), Some("http://hl7.org/fhir/group-type"))
}
object GROUP_TYPE extends EType[GROUP_TYPE]("http://hl7.org/fhir/ValueSet/group-type") 


enum GUIDANCE_RESPONSE_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case DATA_REQUESTED extends DATA_REQUESTED("data-requested", Some("Data Requested"), Some("http://hl7.org/fhir/guidance-response-status"))
  case DATA_REQUIRED extends DATA_REQUIRED("data-required", Some("Data Required"), Some("http://hl7.org/fhir/guidance-response-status"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("Entered In Error"), Some("http://hl7.org/fhir/guidance-response-status"))
  case FAILURE extends FAILURE("failure", Some("Failure"), Some("http://hl7.org/fhir/guidance-response-status"))
  case IN_PROGRESS extends IN_PROGRESS("in-progress", Some("In Progress"), Some("http://hl7.org/fhir/guidance-response-status"))
  case SUCCESS extends SUCCESS("success", Some("Success"), Some("http://hl7.org/fhir/guidance-response-status"))
}
object GUIDANCE_RESPONSE_STATUS extends EType[GUIDANCE_RESPONSE_STATUS]("http://hl7.org/fhir/ValueSet/guidance-response-status") 


enum GUIDE_PAGE_GENERATION(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case GENERATED extends GENERATED("generated", Some("Generated"), Some("http://hl7.org/fhir/guide-page-generation"))
  case HTML extends HTML("html", Some("HTML"), Some("http://hl7.org/fhir/guide-page-generation"))
  case MARKDOWN extends MARKDOWN("markdown", Some("Markdown"), Some("http://hl7.org/fhir/guide-page-generation"))
  case XML extends XML("xml", Some("XML"), Some("http://hl7.org/fhir/guide-page-generation"))
}
object GUIDE_PAGE_GENERATION extends EType[GUIDE_PAGE_GENERATION]("http://hl7.org/fhir/ValueSet/guide-page-generation") 


enum GUIDE_PARAMETER_CODE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case APPLY extends APPLY("apply", Some("Apply Metadata Value"), Some("http://hl7.org/fhir/guide-parameter-code"))
  case BROKEN_LINKS_RULE extends BROKEN_LINKS_RULE("rule-broken-links", Some("Broken Links Rule"), Some("http://hl7.org/fhir/guide-parameter-code"))
  case EXPANSION_PROFILE extends EXPANSION_PROFILE("expansion-parameter", Some("Expansion Profile"), Some("http://hl7.org/fhir/guide-parameter-code"))
  case GENERATE_JSON extends GENERATE_JSON("generate-json", Some("Generate JSON"), Some("http://hl7.org/fhir/guide-parameter-code"))
  case GENERATE_TURTLE extends GENERATE_TURTLE("generate-turtle", Some("Generate Turtle"), Some("http://hl7.org/fhir/guide-parameter-code"))
  case GENERATE_XML extends GENERATE_XML("generate-xml", Some("Generate XML"), Some("http://hl7.org/fhir/guide-parameter-code"))
  case HTML_TEMPLATE extends HTML_TEMPLATE("html-template", Some("HTML Template"), Some("http://hl7.org/fhir/guide-parameter-code"))
  case PAGES_PATH extends PAGES_PATH("path-pages", Some("Pages Path"), Some("http://hl7.org/fhir/guide-parameter-code"))
  case RESOURCE_PATH extends RESOURCE_PATH("path-resource", Some("Resource Path"), Some("http://hl7.org/fhir/guide-parameter-code"))
  case TERMINOLOGY_CACHE_PATH extends TERMINOLOGY_CACHE_PATH("path-tx-cache", Some("Terminology Cache Path"), Some("http://hl7.org/fhir/guide-parameter-code"))
}
object GUIDE_PARAMETER_CODE extends EType[GUIDE_PARAMETER_CODE]("http://hl7.org/fhir/ValueSet/guide-parameter-code") 


enum HISTORY_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case COMPLETED extends COMPLETED("completed", Some("Completed"), Some("http://hl7.org/fhir/history-status"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/history-status"))
  case HEALTH_UNKNOWN extends HEALTH_UNKNOWN("health-unknown", Some("Health Unknown"), Some("http://hl7.org/fhir/history-status"))
  case PARTIAL extends PARTIAL("partial", Some("Partial"), Some("http://hl7.org/fhir/history-status"))
}
object HISTORY_STATUS extends EType[HISTORY_STATUS]("http://hl7.org/fhir/ValueSet/history-status") 


enum HTTP_OPERATIONS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case DELETE extends DELETE("delete", Some("DELETE"), Some("http://hl7.org/fhir/http-operations"))
  case GET extends GET("get", Some("GET"), Some("http://hl7.org/fhir/http-operations"))
  case HEAD extends HEAD("head", Some("HEAD"), Some("http://hl7.org/fhir/http-operations"))
  case OPTIONS extends OPTIONS("options", Some("OPTIONS"), Some("http://hl7.org/fhir/http-operations"))
  case PATCH extends PATCH("patch", Some("PATCH"), Some("http://hl7.org/fhir/http-operations"))
  case POST extends POST("post", Some("POST"), Some("http://hl7.org/fhir/http-operations"))
  case PUT extends PUT("put", Some("PUT"), Some("http://hl7.org/fhir/http-operations"))
}
object HTTP_OPERATIONS extends EType[HTTP_OPERATIONS]("http://hl7.org/fhir/ValueSet/http-operations") 


enum HTTP_VERB(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case DELETE extends DELETE("DELETE", Some("DELETE"), Some("http://hl7.org/fhir/http-verb"))
  case GET extends GET("GET", Some("GET"), Some("http://hl7.org/fhir/http-verb"))
  case HEAD extends HEAD("HEAD", Some("HEAD"), Some("http://hl7.org/fhir/http-verb"))
  case PATCH extends PATCH("PATCH", Some("PATCH"), Some("http://hl7.org/fhir/http-verb"))
  case POST extends POST("POST", Some("POST"), Some("http://hl7.org/fhir/http-verb"))
  case PUT extends PUT("PUT", Some("PUT"), Some("http://hl7.org/fhir/http-verb"))
}
object HTTP_VERB extends EType[HTTP_VERB]("http://hl7.org/fhir/ValueSet/http-verb") 


enum IDENTITY_ASSURANCELEVEL(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case LEVEL1 extends LEVEL1("level1", Some("Level 1"), Some("http://hl7.org/fhir/identity-assuranceLevel"))
  case LEVEL2 extends LEVEL2("level2", Some("Level 2"), Some("http://hl7.org/fhir/identity-assuranceLevel"))
  case LEVEL3 extends LEVEL3("level3", Some("Level 3"), Some("http://hl7.org/fhir/identity-assuranceLevel"))
  case LEVEL4 extends LEVEL4("level4", Some("Level 4"), Some("http://hl7.org/fhir/identity-assuranceLevel"))
}
object IDENTITY_ASSURANCELEVEL extends EType[IDENTITY_ASSURANCELEVEL]("http://hl7.org/fhir/ValueSet/identity-assuranceLevel") 


enum IMAGINGSTUDY_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case AVAILABLE extends AVAILABLE("available", Some("Available"), Some("http://hl7.org/fhir/imagingstudy-status"))
  case CANCELLED extends CANCELLED("cancelled", Some("Cancelled"), Some("http://hl7.org/fhir/imagingstudy-status"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/imagingstudy-status"))
  case REGISTERED extends REGISTERED("registered", Some("Registered"), Some("http://hl7.org/fhir/imagingstudy-status"))
  case UNKNOWN extends UNKNOWN("unknown", Some("Unknown"), Some("http://hl7.org/fhir/imagingstudy-status"))
}
object IMAGINGSTUDY_STATUS extends EType[IMAGINGSTUDY_STATUS]("http://hl7.org/fhir/ValueSet/imagingstudy-status") 


enum IMMUNIZATION_EVALUATION_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case COMPLETED extends COMPLETED("completed", Some("completed"), Some("http://terminology.hl7.org/CodeSystem/medication-admin-status"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("entered-in-error"), Some("http://terminology.hl7.org/CodeSystem/medication-admin-status"))
}
object IMMUNIZATION_EVALUATION_STATUS extends EType[IMMUNIZATION_EVALUATION_STATUS]("http://hl7.org/fhir/ValueSet/immunization-evaluation-status") 


enum IMMUNIZATION_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case COMPLETED extends COMPLETED("completed", Some("completed"), Some("http://hl7.org/fhir/event-status"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("entered-in-error"), Some("http://hl7.org/fhir/event-status"))
  case NOT_DONE extends NOT_DONE("not-done", Some("not-done"), Some("http://hl7.org/fhir/event-status"))
}
object IMMUNIZATION_STATUS extends EType[IMMUNIZATION_STATUS]("http://hl7.org/fhir/ValueSet/immunization-status") 


enum INVOICE_PRICECOMPONENTTYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case BASE extends BASE("base", Some("base price"), Some("http://hl7.org/fhir/invoice-priceComponentType"))
  case DEDUCTION extends DEDUCTION("deduction", Some("deduction"), Some("http://hl7.org/fhir/invoice-priceComponentType"))
  case DISCOUNT extends DISCOUNT("discount", Some("discount"), Some("http://hl7.org/fhir/invoice-priceComponentType"))
  case INFORMATIONAL extends INFORMATIONAL("informational", Some("informational"), Some("http://hl7.org/fhir/invoice-priceComponentType"))
  case SURCHARGE extends SURCHARGE("surcharge", Some("surcharge"), Some("http://hl7.org/fhir/invoice-priceComponentType"))
  case TAX extends TAX("tax", Some("tax"), Some("http://hl7.org/fhir/invoice-priceComponentType"))
}
object INVOICE_PRICECOMPONENTTYPE extends EType[INVOICE_PRICECOMPONENTTYPE]("http://hl7.org/fhir/ValueSet/invoice-priceComponentType") 


enum INVOICE_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case BALANCED extends BALANCED("balanced", Some("balanced"), Some("http://hl7.org/fhir/invoice-status"))
  case CANCELLED extends CANCELLED("cancelled", Some("cancelled"), Some("http://hl7.org/fhir/invoice-status"))
  case DRAFT extends DRAFT("draft", Some("draft"), Some("http://hl7.org/fhir/invoice-status"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("entered in error"), Some("http://hl7.org/fhir/invoice-status"))
  case ISSUED extends ISSUED("issued", Some("issued"), Some("http://hl7.org/fhir/invoice-status"))
}
object INVOICE_STATUS extends EType[INVOICE_STATUS]("http://hl7.org/fhir/ValueSet/invoice-status") 


enum ISSUE_SEVERITY(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ERROR extends ERROR("error", Some("Error"), Some("http://hl7.org/fhir/issue-severity"))
  case FATAL extends FATAL("fatal", Some("Fatal"), Some("http://hl7.org/fhir/issue-severity"))
  case INFORMATION extends INFORMATION("information", Some("Information"), Some("http://hl7.org/fhir/issue-severity"))
  case WARNING extends WARNING("warning", Some("Warning"), Some("http://hl7.org/fhir/issue-severity"))
}
object ISSUE_SEVERITY extends EType[ISSUE_SEVERITY]("http://hl7.org/fhir/ValueSet/issue-severity") 


enum ISSUE_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case BUSINESS_RULE_VIOLATION extends BUSINESS_RULE_VIOLATION("business-rule", Some("Business Rule Violation"), Some("http://hl7.org/fhir/issue-type"))
  case CONFLICT extends CONFLICT("conflict", Some("Edit Version Conflict"), Some("http://hl7.org/fhir/issue-type"))
  case CONTENT_NOT_SUPPORTED extends CONTENT_NOT_SUPPORTED("not-supported", Some("Content not supported"), Some("http://hl7.org/fhir/issue-type"))
  case CONTENT_TOO_LONG extends CONTENT_TOO_LONG("too-long", Some("Content Too Long"), Some("http://hl7.org/fhir/issue-type"))
  case DELETED extends DELETED("deleted", Some("Deleted"), Some("http://hl7.org/fhir/issue-type"))
  case DUPLICATE extends DUPLICATE("duplicate", Some("Duplicate"), Some("http://hl7.org/fhir/issue-type"))
  case EXCEPTION extends EXCEPTION("exception", Some("Exception"), Some("http://hl7.org/fhir/issue-type"))
  case EXPIRED extends EXPIRED("expired", Some("Session Expired"), Some("http://hl7.org/fhir/issue-type"))
  case EXTENSION extends EXTENSION("extension", Some("Unacceptable Extension"), Some("http://hl7.org/fhir/issue-type"))
  case FORBIDDEN extends FORBIDDEN("forbidden", Some("Forbidden"), Some("http://hl7.org/fhir/issue-type"))
  case INCOMPLETE extends INCOMPLETE("incomplete", Some("Incomplete Results"), Some("http://hl7.org/fhir/issue-type"))
  case INFORMATIONAL extends INFORMATIONAL("informational", Some("Informational Note"), Some("http://hl7.org/fhir/issue-type"))
  case INVALID extends INVALID("invalid", Some("Invalid Content"), Some("http://hl7.org/fhir/issue-type"))
  case INVALID_CODE extends INVALID_CODE("code-invalid", Some("Invalid Code"), Some("http://hl7.org/fhir/issue-type"))
  case INVARIANT extends INVARIANT("invariant", Some("Validation rule failed"), Some("http://hl7.org/fhir/issue-type"))
  case LOCK_ERROR extends LOCK_ERROR("lock-error", Some("Lock Error"), Some("http://hl7.org/fhir/issue-type"))
  case LOGIN extends LOGIN("login", Some("Login Required"), Some("http://hl7.org/fhir/issue-type"))
  case MULTIPLE_MATCHES extends MULTIPLE_MATCHES("multiple-matches", Some("Multiple Matches"), Some("http://hl7.org/fhir/issue-type"))
  case NOT_FOUND extends NOT_FOUND("not-found", Some("Not Found"), Some("http://hl7.org/fhir/issue-type"))
  case NO_STORE_AVAILABLE extends NO_STORE_AVAILABLE("no-store", Some("No Store Available"), Some("http://hl7.org/fhir/issue-type"))
  case OPERATION_TOO_COSTLY extends OPERATION_TOO_COSTLY("too-costly", Some("Operation Too Costly"), Some("http://hl7.org/fhir/issue-type"))
  case PROCESSING extends PROCESSING("processing", Some("Processing Failure"), Some("http://hl7.org/fhir/issue-type"))
  case REQUIRED extends REQUIRED("required", Some("Required element missing"), Some("http://hl7.org/fhir/issue-type"))
  case SECURITY extends SECURITY("security", Some("Security Problem"), Some("http://hl7.org/fhir/issue-type"))
  case STRUCTURE extends STRUCTURE("structure", Some("Structural Issue"), Some("http://hl7.org/fhir/issue-type"))
  case SUPPRESSED extends SUPPRESSED("suppressed", Some("Information  Suppressed"), Some("http://hl7.org/fhir/issue-type"))
  case THROTTLED extends THROTTLED("throttled", Some("Throttled"), Some("http://hl7.org/fhir/issue-type"))
  case TIMEOUT extends TIMEOUT("timeout", Some("Timeout"), Some("http://hl7.org/fhir/issue-type"))
  case TRANSIENT extends TRANSIENT("transient", Some("Transient Issue"), Some("http://hl7.org/fhir/issue-type"))
  case UNKNOWN extends UNKNOWN("unknown", Some("Unknown User"), Some("http://hl7.org/fhir/issue-type"))
  case VALUE extends VALUE("value", Some("Element value invalid"), Some("http://hl7.org/fhir/issue-type"))
}
object ISSUE_TYPE extends EType[ISSUE_TYPE]("http://hl7.org/fhir/ValueSet/issue-type") 


enum ITEM_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ATTACHMENT extends ATTACHMENT("attachment", Some("Attachment"), Some("http://hl7.org/fhir/item-type"))
  case BOOLEAN extends BOOLEAN("boolean", Some("Boolean"), Some("http://hl7.org/fhir/item-type"))
  case CHOICE extends CHOICE("choice", Some("Choice"), Some("http://hl7.org/fhir/item-type"))
  case DATE extends DATE("date", Some("Date"), Some("http://hl7.org/fhir/item-type"))
  case DATETIME extends DATETIME("dateTime", Some("Date Time"), Some("http://hl7.org/fhir/item-type"))
  case DECIMAL extends DECIMAL("decimal", Some("Decimal"), Some("http://hl7.org/fhir/item-type"))
  case DISPLAY extends DISPLAY("display", Some("Display"), Some("http://hl7.org/fhir/item-type"))
  case GROUP extends GROUP("group", Some("Group"), Some("http://hl7.org/fhir/item-type"))
  case INTEGER extends INTEGER("integer", Some("Integer"), Some("http://hl7.org/fhir/item-type"))
  case OPEN_CHOICE extends OPEN_CHOICE("open-choice", Some("Open Choice"), Some("http://hl7.org/fhir/item-type"))
  case QUANTITY extends QUANTITY("quantity", Some("Quantity"), Some("http://hl7.org/fhir/item-type"))
  case QUESTION extends QUESTION("question", Some("Question"), Some("http://hl7.org/fhir/item-type"))
  case REFERENCE extends REFERENCE("reference", Some("Reference"), Some("http://hl7.org/fhir/item-type"))
  case STRING extends STRING("string", Some("String"), Some("http://hl7.org/fhir/item-type"))
  case TEXT extends TEXT("text", Some("Text"), Some("http://hl7.org/fhir/item-type"))
  case TIME extends TIME("time", Some("Time"), Some("http://hl7.org/fhir/item-type"))
  case URL extends URL("url", Some("Url"), Some("http://hl7.org/fhir/item-type"))
}
object ITEM_TYPE extends EType[ITEM_TYPE]("http://hl7.org/fhir/ValueSet/item-type") 


enum LINKAGE_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ALTERNATE extends ALTERNATE("alternate", Some("Alternate Record"), Some("http://hl7.org/fhir/linkage-type"))
  case HISTORICAL extends HISTORICAL("historical", Some("Historical/Obsolete Record"), Some("http://hl7.org/fhir/linkage-type"))
  case SOURCE extends SOURCE("source", Some("Source of Truth"), Some("http://hl7.org/fhir/linkage-type"))
}
object LINKAGE_TYPE extends EType[LINKAGE_TYPE]("http://hl7.org/fhir/ValueSet/linkage-type") 


enum LINK_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case REFER extends REFER("refer", Some("Refer"), Some("http://hl7.org/fhir/link-type"))
  case REPLACED_BY extends REPLACED_BY("replaced-by", Some("Replaced-by"), Some("http://hl7.org/fhir/link-type"))
  case REPLACES extends REPLACES("replaces", Some("Replaces"), Some("http://hl7.org/fhir/link-type"))
  case SEEALSO extends SEEALSO("seealso", Some("See also"), Some("http://hl7.org/fhir/link-type"))
}
object LINK_TYPE extends EType[LINK_TYPE]("http://hl7.org/fhir/ValueSet/link-type") 


enum LIST_MODE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case CHANGES extends CHANGES("changes", Some("Change List"), Some("http://hl7.org/fhir/list-mode"))
  case SNAPSHOT extends SNAPSHOT("snapshot", Some("Snapshot List"), Some("http://hl7.org/fhir/list-mode"))
  case WORKING extends WORKING("working", Some("Working List"), Some("http://hl7.org/fhir/list-mode"))
}
object LIST_MODE extends EType[LIST_MODE]("http://hl7.org/fhir/ValueSet/list-mode") 


enum LIST_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case CURRENT extends CURRENT("current", Some("Current"), Some("http://hl7.org/fhir/list-status"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("Entered In Error"), Some("http://hl7.org/fhir/list-status"))
  case RETIRED extends RETIRED("retired", Some("Retired"), Some("http://hl7.org/fhir/list-status"))
}
object LIST_STATUS extends EType[LIST_STATUS]("http://hl7.org/fhir/ValueSet/list-status") 


enum LOCATION_MODE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case INSTANCE extends INSTANCE("instance", Some("Instance"), Some("http://hl7.org/fhir/location-mode"))
  case KIND extends KIND("kind", Some("Kind"), Some("http://hl7.org/fhir/location-mode"))
}
object LOCATION_MODE extends EType[LOCATION_MODE]("http://hl7.org/fhir/ValueSet/location-mode") 


enum LOCATION_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ACTIVE extends ACTIVE("active", Some("Active"), Some("http://hl7.org/fhir/location-status"))
  case INACTIVE extends INACTIVE("inactive", Some("Inactive"), Some("http://hl7.org/fhir/location-status"))
  case SUSPENDED extends SUSPENDED("suspended", Some("Suspended"), Some("http://hl7.org/fhir/location-status"))
}
object LOCATION_STATUS extends EType[LOCATION_STATUS]("http://hl7.org/fhir/ValueSet/location-status") 


enum MAP_CONTEXT_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case TYPE extends TYPE("type", Some("Type"), Some("http://hl7.org/fhir/map-context-type"))
  case VARIABLE extends VARIABLE("variable", Some("Variable"), Some("http://hl7.org/fhir/map-context-type"))
}
object MAP_CONTEXT_TYPE extends EType[MAP_CONTEXT_TYPE]("http://hl7.org/fhir/ValueSet/map-context-type") 


enum MAP_GROUP_TYPE_MODE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case NONE extends NONE("none", Some("Not a Default"), Some("http://hl7.org/fhir/map-group-type-mode"))
  case TYPES extends TYPES("types", Some("Default for Type Combination"), Some("http://hl7.org/fhir/map-group-type-mode"))
  case TYPE_AND_TYPES extends TYPE_AND_TYPES("type-and-types", Some("Default for type + combination"), Some("http://hl7.org/fhir/map-group-type-mode"))
}
object MAP_GROUP_TYPE_MODE extends EType[MAP_GROUP_TYPE_MODE]("http://hl7.org/fhir/ValueSet/map-group-type-mode") 


enum MAP_INPUT_MODE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case SOURCE extends SOURCE("source", Some("Source Instance"), Some("http://hl7.org/fhir/map-input-mode"))
  case TARGET extends TARGET("target", Some("Target Instance"), Some("http://hl7.org/fhir/map-input-mode"))
}
object MAP_INPUT_MODE extends EType[MAP_INPUT_MODE]("http://hl7.org/fhir/ValueSet/map-input-mode") 


enum MAP_MODEL_MODE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case PRODUCED extends PRODUCED("produced", Some("Produced Structure Definition"), Some("http://hl7.org/fhir/map-model-mode"))
  case QUERIED extends QUERIED("queried", Some("Queried Structure Definition"), Some("http://hl7.org/fhir/map-model-mode"))
  case SOURCE extends SOURCE("source", Some("Source Structure Definition"), Some("http://hl7.org/fhir/map-model-mode"))
  case TARGET extends TARGET("target", Some("Target Structure Definition"), Some("http://hl7.org/fhir/map-model-mode"))
}
object MAP_MODEL_MODE extends EType[MAP_MODEL_MODE]("http://hl7.org/fhir/ValueSet/map-model-mode") 


enum MAP_SOURCE_LIST_MODE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case FIRST extends FIRST("first", Some("First"), Some("http://hl7.org/fhir/map-source-list-mode"))
  case LAST extends LAST("last", Some("Last"), Some("http://hl7.org/fhir/map-source-list-mode"))
  case NOT_FIRST extends NOT_FIRST("not_first", Some("All but the first"), Some("http://hl7.org/fhir/map-source-list-mode"))
  case NOT_LAST extends NOT_LAST("not_last", Some("All but the last"), Some("http://hl7.org/fhir/map-source-list-mode"))
  case ONLY_ONE extends ONLY_ONE("only_one", Some("Enforce only one"), Some("http://hl7.org/fhir/map-source-list-mode"))
}
object MAP_SOURCE_LIST_MODE extends EType[MAP_SOURCE_LIST_MODE]("http://hl7.org/fhir/ValueSet/map-source-list-mode") 


enum MAP_TARGET_LIST_MODE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case COLLATE extends COLLATE("collate", Some("Collate"), Some("http://hl7.org/fhir/map-target-list-mode"))
  case FIRST extends FIRST("first", Some("First"), Some("http://hl7.org/fhir/map-target-list-mode"))
  case LAST extends LAST("last", Some("Last"), Some("http://hl7.org/fhir/map-target-list-mode"))
  case SHARE extends SHARE("share", Some("Share"), Some("http://hl7.org/fhir/map-target-list-mode"))
}
object MAP_TARGET_LIST_MODE extends EType[MAP_TARGET_LIST_MODE]("http://hl7.org/fhir/ValueSet/map-target-list-mode") 


enum MAP_TRANSFORM(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case APPEND extends APPEND("append", Some("append"), Some("http://hl7.org/fhir/map-transform"))
  case C extends C("c", Some("c"), Some("http://hl7.org/fhir/map-transform"))
  case CAST extends CAST("cast", Some("cast"), Some("http://hl7.org/fhir/map-transform"))
  case CC extends CC("cc", Some("cc"), Some("http://hl7.org/fhir/map-transform"))
  case COPY extends COPY("copy", Some("copy"), Some("http://hl7.org/fhir/map-transform"))
  case CP extends CP("cp", Some("cp"), Some("http://hl7.org/fhir/map-transform"))
  case CREATE extends CREATE("create", Some("create"), Some("http://hl7.org/fhir/map-transform"))
  case DATEOP extends DATEOP("dateOp", Some("dateOp"), Some("http://hl7.org/fhir/map-transform"))
  case ESCAPE extends ESCAPE("escape", Some("escape"), Some("http://hl7.org/fhir/map-transform"))
  case EVALUATE extends EVALUATE("evaluate", Some("evaluate"), Some("http://hl7.org/fhir/map-transform"))
  case ID extends ID("id", Some("id"), Some("http://hl7.org/fhir/map-transform"))
  case POINTER extends POINTER("pointer", Some("pointer"), Some("http://hl7.org/fhir/map-transform"))
  case QTY extends QTY("qty", Some("qty"), Some("http://hl7.org/fhir/map-transform"))
  case REFERENCE extends REFERENCE("reference", Some("reference"), Some("http://hl7.org/fhir/map-transform"))
  case TRANSLATE extends TRANSLATE("translate", Some("translate"), Some("http://hl7.org/fhir/map-transform"))
  case TRUNCATE extends TRUNCATE("truncate", Some("truncate"), Some("http://hl7.org/fhir/map-transform"))
  case UUID extends UUID("uuid", Some("uuid"), Some("http://hl7.org/fhir/map-transform"))
}
object MAP_TRANSFORM extends EType[MAP_TRANSFORM]("http://hl7.org/fhir/ValueSet/map-transform") 


enum MEASURE_REPORT_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case COMPLETE extends COMPLETE("complete", Some("Complete"), Some("http://hl7.org/fhir/measure-report-status"))
  case ERROR extends ERROR("error", Some("Error"), Some("http://hl7.org/fhir/measure-report-status"))
  case PENDING extends PENDING("pending", Some("Pending"), Some("http://hl7.org/fhir/measure-report-status"))
}
object MEASURE_REPORT_STATUS extends EType[MEASURE_REPORT_STATUS]("http://hl7.org/fhir/ValueSet/measure-report-status") 


enum MEASURE_REPORT_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case DATA_COLLECTION extends DATA_COLLECTION("data-collection", Some("Data Collection"), Some("http://hl7.org/fhir/measure-report-type"))
  case INDIVIDUAL extends INDIVIDUAL("individual", Some("Individual"), Some("http://hl7.org/fhir/measure-report-type"))
  case SUBJECT_LIST extends SUBJECT_LIST("subject-list", Some("Subject List"), Some("http://hl7.org/fhir/measure-report-type"))
  case SUMMARY extends SUMMARY("summary", Some("Summary"), Some("http://hl7.org/fhir/measure-report-type"))
}
object MEASURE_REPORT_TYPE extends EType[MEASURE_REPORT_TYPE]("http://hl7.org/fhir/ValueSet/measure-report-type") 


enum MEDICATIONDISPENSE_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case CANCELLED extends CANCELLED("cancelled", Some("Cancelled"), Some("http://terminology.hl7.org/CodeSystem/medicationdispense-status"))
  case COMPLETED extends COMPLETED("completed", Some("Completed"), Some("http://terminology.hl7.org/CodeSystem/medicationdispense-status"))
  case DECLINED extends DECLINED("declined", Some("Declined"), Some("http://terminology.hl7.org/CodeSystem/medicationdispense-status"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("Entered in Error"), Some("http://terminology.hl7.org/CodeSystem/medicationdispense-status"))
  case IN_PROGRESS extends IN_PROGRESS("in-progress", Some("In Progress"), Some("http://terminology.hl7.org/CodeSystem/medicationdispense-status"))
  case ON_HOLD extends ON_HOLD("on-hold", Some("On Hold"), Some("http://terminology.hl7.org/CodeSystem/medicationdispense-status"))
  case PREPARATION extends PREPARATION("preparation", Some("Preparation"), Some("http://terminology.hl7.org/CodeSystem/medicationdispense-status"))
  case STOPPED extends STOPPED("stopped", Some("Stopped"), Some("http://terminology.hl7.org/CodeSystem/medicationdispense-status"))
  case UNKNOWN extends UNKNOWN("unknown", Some("Unknown"), Some("http://terminology.hl7.org/CodeSystem/medicationdispense-status"))
}
object MEDICATIONDISPENSE_STATUS extends EType[MEDICATIONDISPENSE_STATUS]("http://hl7.org/fhir/ValueSet/medicationdispense-status") 


enum MEDICATIONKNOWLEDGE_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ACTIVE extends ACTIVE("active", Some("Active"), Some("http://terminology.hl7.org/CodeSystem/medicationknowledge-status"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("Entered in Error"), Some("http://terminology.hl7.org/CodeSystem/medicationknowledge-status"))
  case INACTIVE extends INACTIVE("inactive", Some("Inactive"), Some("http://terminology.hl7.org/CodeSystem/medicationknowledge-status"))
}
object MEDICATIONKNOWLEDGE_STATUS extends EType[MEDICATIONKNOWLEDGE_STATUS]("http://hl7.org/fhir/ValueSet/medicationknowledge-status") 


enum MEDICATIONREQUEST_INTENT(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case FILLER_ORDER extends FILLER_ORDER("filler-order", Some("Filler Order"), Some("http://hl7.org/fhir/CodeSystem/medicationrequest-intent"))
  case INSTANCE_ORDER extends INSTANCE_ORDER("instance-order", Some("Instance Order"), Some("http://hl7.org/fhir/CodeSystem/medicationrequest-intent"))
  case OPTION extends OPTION("option", Some("Option"), Some("http://hl7.org/fhir/CodeSystem/medicationrequest-intent"))
  case ORDER extends ORDER("order", Some("Order"), Some("http://hl7.org/fhir/CodeSystem/medicationrequest-intent"))
  case ORIGINAL_ORDER extends ORIGINAL_ORDER("original-order", Some("Original Order"), Some("http://hl7.org/fhir/CodeSystem/medicationrequest-intent"))
  case PLAN extends PLAN("plan", Some("Plan"), Some("http://hl7.org/fhir/CodeSystem/medicationrequest-intent"))
  case PROPOSAL extends PROPOSAL("proposal", Some("Proposal"), Some("http://hl7.org/fhir/CodeSystem/medicationrequest-intent"))
  case REFLEX_ORDER extends REFLEX_ORDER("reflex-order", Some("Reflex Order"), Some("http://hl7.org/fhir/CodeSystem/medicationrequest-intent"))
}
object MEDICATIONREQUEST_INTENT extends EType[MEDICATIONREQUEST_INTENT]("http://hl7.org/fhir/ValueSet/medicationrequest-intent") 


enum MEDICATIONREQUEST_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ACTIVE extends ACTIVE("active", Some("Active"), Some("http://hl7.org/fhir/CodeSystem/medicationrequest-status"))
  case CANCELLED extends CANCELLED("cancelled", Some("Cancelled"), Some("http://hl7.org/fhir/CodeSystem/medicationrequest-status"))
  case COMPLETED extends COMPLETED("completed", Some("Completed"), Some("http://hl7.org/fhir/CodeSystem/medicationrequest-status"))
  case DRAFT extends DRAFT("draft", Some("Draft"), Some("http://hl7.org/fhir/CodeSystem/medicationrequest-status"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/CodeSystem/medicationrequest-status"))
  case ON_HOLD extends ON_HOLD("on-hold", Some("On Hold"), Some("http://hl7.org/fhir/CodeSystem/medicationrequest-status"))
  case STOPPED extends STOPPED("stopped", Some("Stopped"), Some("http://hl7.org/fhir/CodeSystem/medicationrequest-status"))
  case UNKNOWN extends UNKNOWN("unknown", Some("Unknown"), Some("http://hl7.org/fhir/CodeSystem/medicationrequest-status"))
}
object MEDICATIONREQUEST_STATUS extends EType[MEDICATIONREQUEST_STATUS]("http://hl7.org/fhir/ValueSet/medicationrequest-status") 


enum MEDICATION_ADMIN_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case COMPLETED extends COMPLETED("completed", Some("Completed"), Some("http://terminology.hl7.org/CodeSystem/medication-admin-status"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("Entered in Error"), Some("http://terminology.hl7.org/CodeSystem/medication-admin-status"))
  case IN_PROGRESS extends IN_PROGRESS("in-progress", Some("In Progress"), Some("http://terminology.hl7.org/CodeSystem/medication-admin-status"))
  case NOT_DONE extends NOT_DONE("not-done", Some("Not Done"), Some("http://terminology.hl7.org/CodeSystem/medication-admin-status"))
  case ON_HOLD extends ON_HOLD("on-hold", Some("On Hold"), Some("http://terminology.hl7.org/CodeSystem/medication-admin-status"))
  case STOPPED extends STOPPED("stopped", Some("Stopped"), Some("http://terminology.hl7.org/CodeSystem/medication-admin-status"))
  case UNKNOWN extends UNKNOWN("unknown", Some("Unknown"), Some("http://terminology.hl7.org/CodeSystem/medication-admin-status"))
}
object MEDICATION_ADMIN_STATUS extends EType[MEDICATION_ADMIN_STATUS]("http://hl7.org/fhir/ValueSet/medication-admin-status") 


enum MEDICATION_STATEMENT_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ACTIVE extends ACTIVE("active", Some("Active"), Some("http://hl7.org/fhir/CodeSystem/medication-statement-status"))
  case COMPLETED extends COMPLETED("completed", Some("Completed"), Some("http://hl7.org/fhir/CodeSystem/medication-statement-status"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/CodeSystem/medication-statement-status"))
  case INTENDED extends INTENDED("intended", Some("Intended"), Some("http://hl7.org/fhir/CodeSystem/medication-statement-status"))
  case NOT_TAKEN extends NOT_TAKEN("not-taken", Some("Not Taken"), Some("http://hl7.org/fhir/CodeSystem/medication-statement-status"))
  case ON_HOLD extends ON_HOLD("on-hold", Some("On Hold"), Some("http://hl7.org/fhir/CodeSystem/medication-statement-status"))
  case STOPPED extends STOPPED("stopped", Some("Stopped"), Some("http://hl7.org/fhir/CodeSystem/medication-statement-status"))
  case UNKNOWN extends UNKNOWN("unknown", Some("Unknown"), Some("http://hl7.org/fhir/CodeSystem/medication-statement-status"))
}
object MEDICATION_STATEMENT_STATUS extends EType[MEDICATION_STATEMENT_STATUS]("http://hl7.org/fhir/ValueSet/medication-statement-status") 


enum MEDICATION_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ACTIVE extends ACTIVE("active", Some("Active"), Some("http://hl7.org/fhir/CodeSystem/medication-status"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/CodeSystem/medication-status"))
  case INACTIVE extends INACTIVE("inactive", Some("Inactive"), Some("http://hl7.org/fhir/CodeSystem/medication-status"))
}
object MEDICATION_STATUS extends EType[MEDICATION_STATUS]("http://hl7.org/fhir/ValueSet/medication-status") 


enum MESSAGEHEADER_RESPONSE_REQUEST(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ALWAYS extends ALWAYS("always", Some("Always"), Some("http://hl7.org/fhir/messageheader-response-request"))
  case NEVER extends NEVER("never", Some("Never"), Some("http://hl7.org/fhir/messageheader-response-request"))
  case ON_ERROR extends ON_ERROR("on-error", Some("Error/reject conditions only"), Some("http://hl7.org/fhir/messageheader-response-request"))
  case SUCCESSFUL_COMPLETION_ONLY extends SUCCESSFUL_COMPLETION_ONLY("on-success", Some("Successful completion only"), Some("http://hl7.org/fhir/messageheader-response-request"))
}
object MESSAGEHEADER_RESPONSE_REQUEST extends EType[MESSAGEHEADER_RESPONSE_REQUEST]("http://hl7.org/fhir/ValueSet/messageheader-response-request") 


enum MESSAGE_SIGNIFICANCE_CATEGORY(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case CONSEQUENCE extends CONSEQUENCE("consequence", Some("Consequence"), Some("http://hl7.org/fhir/message-significance-category"))
  case CURRENCY extends CURRENCY("currency", Some("Currency"), Some("http://hl7.org/fhir/message-significance-category"))
  case NOTIFICATION extends NOTIFICATION("notification", Some("Notification"), Some("http://hl7.org/fhir/message-significance-category"))
}
object MESSAGE_SIGNIFICANCE_CATEGORY extends EType[MESSAGE_SIGNIFICANCE_CATEGORY]("http://hl7.org/fhir/ValueSet/message-significance-category") 


enum METRIC_CALIBRATION_STATE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case CALIBRATED extends CALIBRATED("calibrated", Some("Calibrated"), Some("http://hl7.org/fhir/metric-calibration-state"))
  case CALIBRATION_REQUIRED extends CALIBRATION_REQUIRED("calibration-required", Some("Calibration Required"), Some("http://hl7.org/fhir/metric-calibration-state"))
  case NOT_CALIBRATED extends NOT_CALIBRATED("not-calibrated", Some("Not Calibrated"), Some("http://hl7.org/fhir/metric-calibration-state"))
  case UNSPECIFIED extends UNSPECIFIED("unspecified", Some("Unspecified"), Some("http://hl7.org/fhir/metric-calibration-state"))
}
object METRIC_CALIBRATION_STATE extends EType[METRIC_CALIBRATION_STATE]("http://hl7.org/fhir/ValueSet/metric-calibration-state") 


enum METRIC_CALIBRATION_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case GAIN extends GAIN("gain", Some("Gain"), Some("http://hl7.org/fhir/metric-calibration-type"))
  case OFFSET extends OFFSET("offset", Some("Offset"), Some("http://hl7.org/fhir/metric-calibration-type"))
  case TWO_POINT extends TWO_POINT("two-point", Some("Two Point"), Some("http://hl7.org/fhir/metric-calibration-type"))
  case UNSPECIFIED extends UNSPECIFIED("unspecified", Some("Unspecified"), Some("http://hl7.org/fhir/metric-calibration-type"))
}
object METRIC_CALIBRATION_TYPE extends EType[METRIC_CALIBRATION_TYPE]("http://hl7.org/fhir/ValueSet/metric-calibration-type") 


enum METRIC_CATEGORY(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case CALCULATION extends CALCULATION("calculation", Some("Calculation"), Some("http://hl7.org/fhir/metric-category"))
  case MEASUREMENT extends MEASUREMENT("measurement", Some("Measurement"), Some("http://hl7.org/fhir/metric-category"))
  case SETTING extends SETTING("setting", Some("Setting"), Some("http://hl7.org/fhir/metric-category"))
  case UNSPECIFIED extends UNSPECIFIED("unspecified", Some("Unspecified"), Some("http://hl7.org/fhir/metric-category"))
}
object METRIC_CATEGORY extends EType[METRIC_CATEGORY]("http://hl7.org/fhir/ValueSet/metric-category") 


enum METRIC_COLOR(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case BLACK extends BLACK("black", Some("Color Black"), Some("http://hl7.org/fhir/metric-color"))
  case BLUE extends BLUE("blue", Some("Color Blue"), Some("http://hl7.org/fhir/metric-color"))
  case CYAN extends CYAN("cyan", Some("Color Cyan"), Some("http://hl7.org/fhir/metric-color"))
  case GREEN extends GREEN("green", Some("Color Green"), Some("http://hl7.org/fhir/metric-color"))
  case MAGENTA extends MAGENTA("magenta", Some("Color Magenta"), Some("http://hl7.org/fhir/metric-color"))
  case RED extends RED("red", Some("Color Red"), Some("http://hl7.org/fhir/metric-color"))
  case WHITE extends WHITE("white", Some("Color White"), Some("http://hl7.org/fhir/metric-color"))
  case YELLOW extends YELLOW("yellow", Some("Color Yellow"), Some("http://hl7.org/fhir/metric-color"))
}
object METRIC_COLOR extends EType[METRIC_COLOR]("http://hl7.org/fhir/ValueSet/metric-color") 


enum METRIC_OPERATIONAL_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("Entered In Error"), Some("http://hl7.org/fhir/metric-operational-status"))
  case OFF extends OFF("off", Some("Off"), Some("http://hl7.org/fhir/metric-operational-status"))
  case ON extends ON("on", Some("On"), Some("http://hl7.org/fhir/metric-operational-status"))
  case STANDBY extends STANDBY("standby", Some("Standby"), Some("http://hl7.org/fhir/metric-operational-status"))
}
object METRIC_OPERATIONAL_STATUS extends EType[METRIC_OPERATIONAL_STATUS]("http://hl7.org/fhir/ValueSet/metric-operational-status") 


enum NAMINGSYSTEM_IDENTIFIER_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case OID extends OID("oid", Some("OID"), Some("http://hl7.org/fhir/namingsystem-identifier-type"))
  case OTHER extends OTHER("other", Some("Other"), Some("http://hl7.org/fhir/namingsystem-identifier-type"))
  case URI extends URI("uri", Some("URI"), Some("http://hl7.org/fhir/namingsystem-identifier-type"))
  case UUID extends UUID("uuid", Some("UUID"), Some("http://hl7.org/fhir/namingsystem-identifier-type"))
}
object NAMINGSYSTEM_IDENTIFIER_TYPE extends EType[NAMINGSYSTEM_IDENTIFIER_TYPE]("http://hl7.org/fhir/ValueSet/namingsystem-identifier-type") 


enum NAMINGSYSTEM_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case CODESYSTEM extends CODESYSTEM("codesystem", Some("Code System"), Some("http://hl7.org/fhir/namingsystem-type"))
  case IDENTIFIER extends IDENTIFIER("identifier", Some("Identifier"), Some("http://hl7.org/fhir/namingsystem-type"))
  case ROOT extends ROOT("root", Some("Root"), Some("http://hl7.org/fhir/namingsystem-type"))
}
object NAMINGSYSTEM_TYPE extends EType[NAMINGSYSTEM_TYPE]("http://hl7.org/fhir/ValueSet/namingsystem-type") 


enum NARRATIVE_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ADDITIONAL extends ADDITIONAL("additional", Some("Additional"), Some("http://hl7.org/fhir/narrative-status"))
  case EMPTY extends EMPTY("empty", Some("Empty"), Some("http://hl7.org/fhir/narrative-status"))
  case EXTENSIONS extends EXTENSIONS("extensions", Some("Extensions"), Some("http://hl7.org/fhir/narrative-status"))
  case GENERATED extends GENERATED("generated", Some("Generated"), Some("http://hl7.org/fhir/narrative-status"))
}
object NARRATIVE_STATUS extends EType[NARRATIVE_STATUS]("http://hl7.org/fhir/ValueSet/narrative-status") 


enum NETWORK_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case EMAIL_ADDRESS extends EMAIL_ADDRESS("4", Some("Email address"), Some("http://hl7.org/fhir/network-type"))
  case IP_ADDRESS extends IP_ADDRESS("2", Some("IP Address"), Some("http://hl7.org/fhir/network-type"))
  case MACHINE_NAME extends MACHINE_NAME("1", Some("Machine Name"), Some("http://hl7.org/fhir/network-type"))
  case TELEPHONE_NUMBER extends TELEPHONE_NUMBER("3", Some("Telephone Number"), Some("http://hl7.org/fhir/network-type"))
  case URI extends URI("5", Some("URI"), Some("http://hl7.org/fhir/network-type"))
}
object NETWORK_TYPE extends EType[NETWORK_TYPE]("http://hl7.org/fhir/ValueSet/network-type") 


enum NOTE_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case DISPLAY extends DISPLAY("display", Some("Display"), Some("http://hl7.org/fhir/note-type"))
  case PRINT extends PRINT("print", Some("Print (Form)"), Some("http://hl7.org/fhir/note-type"))
  case PRINTOPER extends PRINTOPER("printoper", Some("Print (Operator)"), Some("http://hl7.org/fhir/note-type"))
}
object NOTE_TYPE extends EType[NOTE_TYPE]("http://hl7.org/fhir/ValueSet/note-type") 


enum OBSERVATION_RANGE_CATEGORY(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ABSOLUTE extends ABSOLUTE("absolute", Some("absolute range"), Some("http://hl7.org/fhir/observation-range-category"))
  case CRITICAL extends CRITICAL("critical", Some("critical range"), Some("http://hl7.org/fhir/observation-range-category"))
  case REFERENCE extends REFERENCE("reference", Some("reference range"), Some("http://hl7.org/fhir/observation-range-category"))
}
object OBSERVATION_RANGE_CATEGORY extends EType[OBSERVATION_RANGE_CATEGORY]("http://hl7.org/fhir/ValueSet/observation-range-category") 


enum OBSERVATION_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case AMENDED extends AMENDED("amended", Some("Amended"), Some("http://hl7.org/fhir/observation-status"))
  case CANCELLED extends CANCELLED("cancelled", Some("Cancelled"), Some("http://hl7.org/fhir/observation-status"))
  case CORRECTED extends CORRECTED("corrected", Some("Corrected"), Some("http://hl7.org/fhir/observation-status"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/observation-status"))
  case FINAL extends FINAL("final", Some("Final"), Some("http://hl7.org/fhir/observation-status"))
  case PRELIMINARY extends PRELIMINARY("preliminary", Some("Preliminary"), Some("http://hl7.org/fhir/observation-status"))
  case REGISTERED extends REGISTERED("registered", Some("Registered"), Some("http://hl7.org/fhir/observation-status"))
  case UNKNOWN extends UNKNOWN("unknown", Some("Unknown"), Some("http://hl7.org/fhir/observation-status"))
}
object OBSERVATION_STATUS extends EType[OBSERVATION_STATUS]("http://hl7.org/fhir/ValueSet/observation-status") 


enum OPERATION_KIND(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case OPERATION extends OPERATION("operation", Some("Operation"), Some("http://hl7.org/fhir/operation-kind"))
  case QUERY extends QUERY("query", Some("Query"), Some("http://hl7.org/fhir/operation-kind"))
}
object OPERATION_KIND extends EType[OPERATION_KIND]("http://hl7.org/fhir/ValueSet/operation-kind") 


enum ORIENTATION_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ANTISENSE extends ANTISENSE("antisense", Some("Antisense orientation of referenceSeq"), Some("http://hl7.org/fhir/orientation-type"))
  case SENSE extends SENSE("sense", Some("Sense orientation of referenceSeq"), Some("http://hl7.org/fhir/orientation-type"))
}
object ORIENTATION_TYPE extends EType[ORIENTATION_TYPE]("http://hl7.org/fhir/ValueSet/orientation-type") 


enum PARTICIPANTREQUIRED(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case INFORMATION_ONLY extends INFORMATION_ONLY("information-only", Some("Information Only"), Some("http://hl7.org/fhir/participantrequired"))
  case OPTIONAL extends OPTIONAL("optional", Some("Optional"), Some("http://hl7.org/fhir/participantrequired"))
  case REQUIRED extends REQUIRED("required", Some("Required"), Some("http://hl7.org/fhir/participantrequired"))
}
object PARTICIPANTREQUIRED extends EType[PARTICIPANTREQUIRED]("http://hl7.org/fhir/ValueSet/participantrequired") 


enum PARTICIPATIONSTATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ACCEPTED extends ACCEPTED("accepted", Some("Accepted"), Some("http://hl7.org/fhir/participationstatus"))
  case DECLINED extends DECLINED("declined", Some("Declined"), Some("http://hl7.org/fhir/participationstatus"))
  case NEEDS_ACTION extends NEEDS_ACTION("needs-action", Some("Needs Action"), Some("http://hl7.org/fhir/participationstatus"))
  case TENTATIVE extends TENTATIVE("tentative", Some("Tentative"), Some("http://hl7.org/fhir/participationstatus"))
}
object PARTICIPATIONSTATUS extends EType[PARTICIPATIONSTATUS]("http://hl7.org/fhir/ValueSet/participationstatus") 


enum PERMITTED_DATA_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case BOOLEAN extends BOOLEAN("boolean", Some("boolean"), Some("http://hl7.org/fhir/permitted-data-type"))
  case CODEABLECONCEPT extends CODEABLECONCEPT("CodeableConcept", Some("CodeableConcept"), Some("http://hl7.org/fhir/permitted-data-type"))
  case DATETIME extends DATETIME("dateTime", Some("dateTime"), Some("http://hl7.org/fhir/permitted-data-type"))
  case INTEGER extends INTEGER("integer", Some("integer"), Some("http://hl7.org/fhir/permitted-data-type"))
  case PERIOD extends PERIOD("Period", Some("Period"), Some("http://hl7.org/fhir/permitted-data-type"))
  case QUANTITY extends QUANTITY("Quantity", Some("Quantity"), Some("http://hl7.org/fhir/permitted-data-type"))
  case RANGE extends RANGE("Range", Some("Range"), Some("http://hl7.org/fhir/permitted-data-type"))
  case RATIO extends RATIO("Ratio", Some("Ratio"), Some("http://hl7.org/fhir/permitted-data-type"))
  case SAMPLEDDATA extends SAMPLEDDATA("SampledData", Some("SampledData"), Some("http://hl7.org/fhir/permitted-data-type"))
  case STRING extends STRING("string", Some("string"), Some("http://hl7.org/fhir/permitted-data-type"))
  case TIME extends TIME("time", Some("time"), Some("http://hl7.org/fhir/permitted-data-type"))
}
object PERMITTED_DATA_TYPE extends EType[PERMITTED_DATA_TYPE]("http://hl7.org/fhir/ValueSet/permitted-data-type") 


enum PRODUCT_CATEGORY(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case BIOLOGICALAGENT extends BIOLOGICALAGENT("biologicalAgent", Some("BiologicalAgent"), Some("http://hl7.org/fhir/product-category"))
  case CELLS extends CELLS("cells", Some("Cells"), Some("http://hl7.org/fhir/product-category"))
  case FLUID extends FLUID("fluid", Some("Fluid"), Some("http://hl7.org/fhir/product-category"))
  case ORGAN extends ORGAN("organ", Some("Organ"), Some("http://hl7.org/fhir/product-category"))
  case TISSUE extends TISSUE("tissue", Some("Tissue"), Some("http://hl7.org/fhir/product-category"))
}
object PRODUCT_CATEGORY extends EType[PRODUCT_CATEGORY]("http://hl7.org/fhir/ValueSet/product-category") 


enum PRODUCT_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case AVAILABLE extends AVAILABLE("available", Some("Available"), Some("http://hl7.org/fhir/product-status"))
  case UNAVAILABLE extends UNAVAILABLE("unavailable", Some("Unavailable"), Some("http://hl7.org/fhir/product-status"))
}
object PRODUCT_STATUS extends EType[PRODUCT_STATUS]("http://hl7.org/fhir/ValueSet/product-status") 


enum PRODUCT_STORAGE_SCALE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case CELSIUS extends CELSIUS("celsius", Some("Celsius"), Some("http://hl7.org/fhir/product-storage-scale"))
  case FARENHEIT extends FARENHEIT("farenheit", Some("Fahrenheit"), Some("http://hl7.org/fhir/product-storage-scale"))
  case KELVIN extends KELVIN("kelvin", Some("Kelvin"), Some("http://hl7.org/fhir/product-storage-scale"))
}
object PRODUCT_STORAGE_SCALE extends EType[PRODUCT_STORAGE_SCALE]("http://hl7.org/fhir/ValueSet/product-storage-scale") 


enum PROPERTY_REPRESENTATION(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case CDATEXT extends CDATEXT("cdaText", Some("CDA Text Format"), Some("http://hl7.org/fhir/property-representation"))
  case TYPEATTR extends TYPEATTR("typeAttr", Some("Type Attribute"), Some("http://hl7.org/fhir/property-representation"))
  case XHTML extends XHTML("xhtml", Some("XHTML"), Some("http://hl7.org/fhir/property-representation"))
  case XMLATTR extends XMLATTR("xmlAttr", Some("XML Attribute"), Some("http://hl7.org/fhir/property-representation"))
  case XMLTEXT extends XMLTEXT("xmlText", Some("XML Text"), Some("http://hl7.org/fhir/property-representation"))
}
object PROPERTY_REPRESENTATION extends EType[PROPERTY_REPRESENTATION]("http://hl7.org/fhir/ValueSet/property-representation") 


enum PROVENANCE_ENTITY_ROLE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case DERIVATION extends DERIVATION("derivation", Some("Derivation"), Some("http://hl7.org/fhir/provenance-entity-role"))
  case QUOTATION extends QUOTATION("quotation", Some("Quotation"), Some("http://hl7.org/fhir/provenance-entity-role"))
  case REMOVAL extends REMOVAL("removal", Some("Removal"), Some("http://hl7.org/fhir/provenance-entity-role"))
  case REVISION extends REVISION("revision", Some("Revision"), Some("http://hl7.org/fhir/provenance-entity-role"))
  case SOURCE extends SOURCE("source", Some("Source"), Some("http://hl7.org/fhir/provenance-entity-role"))
}
object PROVENANCE_ENTITY_ROLE extends EType[PROVENANCE_ENTITY_ROLE]("http://hl7.org/fhir/ValueSet/provenance-entity-role") 


enum PUBLICATION_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ACTIVE extends ACTIVE("active", Some("Active"), Some("http://hl7.org/fhir/publication-status"))
  case DRAFT extends DRAFT("draft", Some("Draft"), Some("http://hl7.org/fhir/publication-status"))
  case RETIRED extends RETIRED("retired", Some("Retired"), Some("http://hl7.org/fhir/publication-status"))
  case UNKNOWN extends UNKNOWN("unknown", Some("Unknown"), Some("http://hl7.org/fhir/publication-status"))
}
object PUBLICATION_STATUS extends EType[PUBLICATION_STATUS]("http://hl7.org/fhir/ValueSet/publication-status") 


enum QUALITY_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case INDEL extends INDEL("indel", Some("INDEL Comparison"), Some("http://hl7.org/fhir/quality-type"))
  case SNP extends SNP("snp", Some("SNP Comparison"), Some("http://hl7.org/fhir/quality-type"))
  case UNKNOWN extends UNKNOWN("unknown", Some("UNKNOWN Comparison"), Some("http://hl7.org/fhir/quality-type"))
}
object QUALITY_TYPE extends EType[QUALITY_TYPE]("http://hl7.org/fhir/ValueSet/quality-type") 


enum QUESTIONNAIRE_ANSWERS_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case AMENDED extends AMENDED("amended", Some("Amended"), Some("http://hl7.org/fhir/questionnaire-answers-status"))
  case COMPLETED extends COMPLETED("completed", Some("Completed"), Some("http://hl7.org/fhir/questionnaire-answers-status"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/questionnaire-answers-status"))
  case IN_PROGRESS extends IN_PROGRESS("in-progress", Some("In Progress"), Some("http://hl7.org/fhir/questionnaire-answers-status"))
  case STOPPED extends STOPPED("stopped", Some("Stopped"), Some("http://hl7.org/fhir/questionnaire-answers-status"))
}
object QUESTIONNAIRE_ANSWERS_STATUS extends EType[QUESTIONNAIRE_ANSWERS_STATUS]("http://hl7.org/fhir/ValueSet/questionnaire-answers-status") 


enum QUESTIONNAIRE_ENABLE_BEHAVIOR(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ALL extends ALL("all", Some("All"), Some("http://hl7.org/fhir/questionnaire-enable-behavior"))
  case ANY extends ANY("any", Some("Any"), Some("http://hl7.org/fhir/questionnaire-enable-behavior"))
}
object QUESTIONNAIRE_ENABLE_BEHAVIOR extends EType[QUESTIONNAIRE_ENABLE_BEHAVIOR]("http://hl7.org/fhir/ValueSet/questionnaire-enable-behavior") 


enum QUESTIONNAIRE_ENABLE_OPERATOR(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case EQUALS extends EQUALS("=", Some("Equals"), Some("http://hl7.org/fhir/questionnaire-enable-operator"))
  case EXISTS extends EXISTS("exists", Some("Exists"), Some("http://hl7.org/fhir/questionnaire-enable-operator"))
  case GREATER_OR_EQUALS extends GREATER_OR_EQUALS(">=", Some("Greater or Equals"), Some("http://hl7.org/fhir/questionnaire-enable-operator"))
  case GREATER_THAN extends GREATER_THAN(">", Some("Greater Than"), Some("http://hl7.org/fhir/questionnaire-enable-operator"))
  case LESS_OR_EQUALS extends LESS_OR_EQUALS("<=", Some("Less or Equals"), Some("http://hl7.org/fhir/questionnaire-enable-operator"))
  case LESS_THAN extends LESS_THAN("<", Some("Less Than"), Some("http://hl7.org/fhir/questionnaire-enable-operator"))
  case NOT_EQUALS extends NOT_EQUALS("!=", Some("Not Equals"), Some("http://hl7.org/fhir/questionnaire-enable-operator"))
}
object QUESTIONNAIRE_ENABLE_OPERATOR extends EType[QUESTIONNAIRE_ENABLE_OPERATOR]("http://hl7.org/fhir/ValueSet/questionnaire-enable-operator") 


enum REACTION_EVENT_SEVERITY(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case MILD extends MILD("mild", Some("Mild"), Some("http://hl7.org/fhir/reaction-event-severity"))
  case MODERATE extends MODERATE("moderate", Some("Moderate"), Some("http://hl7.org/fhir/reaction-event-severity"))
  case SEVERE extends SEVERE("severe", Some("Severe"), Some("http://hl7.org/fhir/reaction-event-severity"))
}
object REACTION_EVENT_SEVERITY extends EType[REACTION_EVENT_SEVERITY]("http://hl7.org/fhir/ValueSet/reaction-event-severity") 


enum REFERENCE_HANDLING_POLICY(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ENFORCED extends ENFORCED("enforced", Some("Reference Integrity Enforced"), Some("http://hl7.org/fhir/reference-handling-policy"))
  case LITERAL extends LITERAL("literal", Some("Literal References"), Some("http://hl7.org/fhir/reference-handling-policy"))
  case LOCAL extends LOCAL("local", Some("Local References Only"), Some("http://hl7.org/fhir/reference-handling-policy"))
  case LOGICAL extends LOGICAL("logical", Some("Logical References"), Some("http://hl7.org/fhir/reference-handling-policy"))
  case RESOLVES extends RESOLVES("resolves", Some("Resolves References"), Some("http://hl7.org/fhir/reference-handling-policy"))
}
object REFERENCE_HANDLING_POLICY extends EType[REFERENCE_HANDLING_POLICY]("http://hl7.org/fhir/ValueSet/reference-handling-policy") 


enum REFERENCE_VERSION_RULES(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case EITHER extends EITHER("either", Some("Either Specific or independent"), Some("http://hl7.org/fhir/reference-version-rules"))
  case INDEPENDENT extends INDEPENDENT("independent", Some("Version independent"), Some("http://hl7.org/fhir/reference-version-rules"))
  case SPECIFIC extends SPECIFIC("specific", Some("Version Specific"), Some("http://hl7.org/fhir/reference-version-rules"))
}
object REFERENCE_VERSION_RULES extends EType[REFERENCE_VERSION_RULES]("http://hl7.org/fhir/ValueSet/reference-version-rules") 


enum RELATION_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case REPLACED_BY extends REPLACED_BY("is-replaced-by", Some("Replaced By"), Some("http://hl7.org/fhir/relation-type"))
  case TRIGGERS extends TRIGGERS("triggers", Some("Triggers"), Some("http://hl7.org/fhir/relation-type"))
}
object RELATION_TYPE extends EType[RELATION_TYPE]("http://hl7.org/fhir/ValueSet/relation-type") 


enum REMITTANCE_OUTCOME(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case COMPLETE extends COMPLETE("complete", Some("Processing Complete"), Some("http://hl7.org/fhir/remittance-outcome"))
  case ERROR extends ERROR("error", Some("Error"), Some("http://hl7.org/fhir/remittance-outcome"))
  case PARTIAL extends PARTIAL("partial", Some("Partial Processing"), Some("http://hl7.org/fhir/remittance-outcome"))
  case QUEUED extends QUEUED("queued", Some("Queued"), Some("http://hl7.org/fhir/remittance-outcome"))
}
object REMITTANCE_OUTCOME extends EType[REMITTANCE_OUTCOME]("http://hl7.org/fhir/ValueSet/remittance-outcome") 


enum REPORT_ACTION_RESULT_CODES(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ERROR extends ERROR("error", Some("Error"), Some("http://hl7.org/fhir/report-action-result-codes"))
  case FAIL extends FAIL("fail", Some("Fail"), Some("http://hl7.org/fhir/report-action-result-codes"))
  case PASS extends PASS("pass", Some("Pass"), Some("http://hl7.org/fhir/report-action-result-codes"))
  case SKIP extends SKIP("skip", Some("Skip"), Some("http://hl7.org/fhir/report-action-result-codes"))
  case WARNING extends WARNING("warning", Some("Warning"), Some("http://hl7.org/fhir/report-action-result-codes"))
}
object REPORT_ACTION_RESULT_CODES extends EType[REPORT_ACTION_RESULT_CODES]("http://hl7.org/fhir/ValueSet/report-action-result-codes") 


enum REPORT_PARTICIPANT_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case CLIENT extends CLIENT("client", Some("Client"), Some("http://hl7.org/fhir/report-participant-type"))
  case SERVER extends SERVER("server", Some("Server"), Some("http://hl7.org/fhir/report-participant-type"))
  case TEST_ENGINE extends TEST_ENGINE("test-engine", Some("Test Engine"), Some("http://hl7.org/fhir/report-participant-type"))
}
object REPORT_PARTICIPANT_TYPE extends EType[REPORT_PARTICIPANT_TYPE]("http://hl7.org/fhir/ValueSet/report-participant-type") 


enum REPORT_RESULT_CODES(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case FAIL extends FAIL("fail", Some("Fail"), Some("http://hl7.org/fhir/report-result-codes"))
  case PASS extends PASS("pass", Some("Pass"), Some("http://hl7.org/fhir/report-result-codes"))
  case PENDING extends PENDING("pending", Some("Pending"), Some("http://hl7.org/fhir/report-result-codes"))
}
object REPORT_RESULT_CODES extends EType[REPORT_RESULT_CODES]("http://hl7.org/fhir/ValueSet/report-result-codes") 


enum REPORT_STATUS_CODES(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case COMPLETED extends COMPLETED("completed", Some("Completed"), Some("http://hl7.org/fhir/report-status-codes"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("Entered In Error"), Some("http://hl7.org/fhir/report-status-codes"))
  case IN_PROGRESS extends IN_PROGRESS("in-progress", Some("In Progress"), Some("http://hl7.org/fhir/report-status-codes"))
  case STOPPED extends STOPPED("stopped", Some("Stopped"), Some("http://hl7.org/fhir/report-status-codes"))
  case WAITING extends WAITING("waiting", Some("Waiting"), Some("http://hl7.org/fhir/report-status-codes"))
}
object REPORT_STATUS_CODES extends EType[REPORT_STATUS_CODES]("http://hl7.org/fhir/ValueSet/report-status-codes") 


enum REPOSITORY_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case DIRECTLINK extends DIRECTLINK("directlink", Some("Click and see"), Some("http://hl7.org/fhir/repository-type"))
  case LOGIN extends LOGIN("login", Some("Result cannot be access unless an account is logged in"), Some("http://hl7.org/fhir/repository-type"))
  case OAUTH extends OAUTH("oauth", Some("Result need to be fetched with API and need LOGIN( or cookies are required when visiting the link of resource)"), Some("http://hl7.org/fhir/repository-type"))
  case OPENAPI extends OPENAPI("openapi", Some("The URL is the RESTful or other kind of API that can access to the result."), Some("http://hl7.org/fhir/repository-type"))
  case OTHER extends OTHER("other", Some("Some other complicated or particular way to get resource from URL."), Some("http://hl7.org/fhir/repository-type"))
}
object REPOSITORY_TYPE extends EType[REPOSITORY_TYPE]("http://hl7.org/fhir/ValueSet/repository-type") 


enum REQUEST_INTENT(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case DIRECTIVE extends DIRECTIVE("directive", Some("Directive"), Some("http://hl7.org/fhir/request-intent"))
  case FILLER_ORDER extends FILLER_ORDER("filler-order", Some("Filler Order"), Some("http://hl7.org/fhir/request-intent"))
  case INSTANCE_ORDER extends INSTANCE_ORDER("instance-order", Some("Instance Order"), Some("http://hl7.org/fhir/request-intent"))
  case OPTION extends OPTION("option", Some("Option"), Some("http://hl7.org/fhir/request-intent"))
  case ORDER extends ORDER("order", Some("Order"), Some("http://hl7.org/fhir/request-intent"))
  case ORIGINAL_ORDER extends ORIGINAL_ORDER("original-order", Some("Original Order"), Some("http://hl7.org/fhir/request-intent"))
  case PLAN extends PLAN("plan", Some("Plan"), Some("http://hl7.org/fhir/request-intent"))
  case PROPOSAL extends PROPOSAL("proposal", Some("Proposal"), Some("http://hl7.org/fhir/request-intent"))
  case REFLEX_ORDER extends REFLEX_ORDER("reflex-order", Some("Reflex Order"), Some("http://hl7.org/fhir/request-intent"))
}
object REQUEST_INTENT extends EType[REQUEST_INTENT]("http://hl7.org/fhir/ValueSet/request-intent") 


enum REQUEST_PRIORITY(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ASAP extends ASAP("asap", Some("ASAP"), Some("http://hl7.org/fhir/request-priority"))
  case ROUTINE extends ROUTINE("routine", Some("Routine"), Some("http://hl7.org/fhir/request-priority"))
  case STAT extends STAT("stat", Some("STAT"), Some("http://hl7.org/fhir/request-priority"))
  case URGENT extends URGENT("urgent", Some("Urgent"), Some("http://hl7.org/fhir/request-priority"))
}
object REQUEST_PRIORITY extends EType[REQUEST_PRIORITY]("http://hl7.org/fhir/ValueSet/request-priority") 


enum REQUEST_RESOURCE_TYPES(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case APPOINTMENT extends APPOINTMENT("Appointment", Some("Appointment"), Some("http://hl7.org/fhir/request-resource-types"))
  case APPOINTMENTRESPONSE extends APPOINTMENTRESPONSE("AppointmentResponse", Some("AppointmentResponse"), Some("http://hl7.org/fhir/request-resource-types"))
  case CAREPLAN extends CAREPLAN("CarePlan", Some("CarePlan"), Some("http://hl7.org/fhir/request-resource-types"))
  case CLAIM extends CLAIM("Claim", Some("Claim"), Some("http://hl7.org/fhir/request-resource-types"))
  case COMMUNICATIONREQUEST extends COMMUNICATIONREQUEST("CommunicationRequest", Some("CommunicationRequest"), Some("http://hl7.org/fhir/request-resource-types"))
  case CONTRACT extends CONTRACT("Contract", Some("Contract"), Some("http://hl7.org/fhir/request-resource-types"))
  case DEVICEREQUEST extends DEVICEREQUEST("DeviceRequest", Some("DeviceRequest"), Some("http://hl7.org/fhir/request-resource-types"))
  case ENROLLMENTREQUEST extends ENROLLMENTREQUEST("EnrollmentRequest", Some("EnrollmentRequest"), Some("http://hl7.org/fhir/request-resource-types"))
  case IMMUNIZATIONRECOMMENDATION extends IMMUNIZATIONRECOMMENDATION("ImmunizationRecommendation", Some("ImmunizationRecommendation"), Some("http://hl7.org/fhir/request-resource-types"))
  case MEDICATIONREQUEST extends MEDICATIONREQUEST("MedicationRequest", Some("MedicationRequest"), Some("http://hl7.org/fhir/request-resource-types"))
  case NUTRITIONORDER extends NUTRITIONORDER("NutritionOrder", Some("NutritionOrder"), Some("http://hl7.org/fhir/request-resource-types"))
  case SERVICEREQUEST extends SERVICEREQUEST("ServiceRequest", Some("ServiceRequest"), Some("http://hl7.org/fhir/request-resource-types"))
  case SUPPLYREQUEST extends SUPPLYREQUEST("SupplyRequest", Some("SupplyRequest"), Some("http://hl7.org/fhir/request-resource-types"))
  case TASK extends TASK("Task", Some("Task"), Some("http://hl7.org/fhir/request-resource-types"))
  case VISIONPRESCRIPTION extends VISIONPRESCRIPTION("VisionPrescription", Some("VisionPrescription"), Some("http://hl7.org/fhir/request-resource-types"))
}
object REQUEST_RESOURCE_TYPES extends EType[REQUEST_RESOURCE_TYPES]("http://hl7.org/fhir/ValueSet/request-resource-types") 


enum REQUEST_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ACTIVE extends ACTIVE("active", Some("Active"), Some("http://hl7.org/fhir/request-status"))
  case COMPLETED extends COMPLETED("completed", Some("Completed"), Some("http://hl7.org/fhir/request-status"))
  case DRAFT extends DRAFT("draft", Some("Draft"), Some("http://hl7.org/fhir/request-status"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/request-status"))
  case ON_HOLD extends ON_HOLD("on-hold", Some("On Hold"), Some("http://hl7.org/fhir/request-status"))
  case REVOKED extends REVOKED("revoked", Some("Revoked"), Some("http://hl7.org/fhir/request-status"))
  case UNKNOWN extends UNKNOWN("unknown", Some("Unknown"), Some("http://hl7.org/fhir/request-status"))
}
object REQUEST_STATUS extends EType[REQUEST_STATUS]("http://hl7.org/fhir/ValueSet/request-status") 


enum RESEARCH_ELEMENT_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case EXPOSURE extends EXPOSURE("exposure", Some("Exposure"), Some("http://hl7.org/fhir/research-element-type"))
  case OUTCOME extends OUTCOME("outcome", Some("Outcome"), Some("http://hl7.org/fhir/research-element-type"))
  case POPULATION extends POPULATION("population", Some("Population"), Some("http://hl7.org/fhir/research-element-type"))
}
object RESEARCH_ELEMENT_TYPE extends EType[RESEARCH_ELEMENT_TYPE]("http://hl7.org/fhir/ValueSet/research-element-type") 


enum RESEARCH_STUDY_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ACTIVE extends ACTIVE("active", Some("Active"), Some("http://hl7.org/fhir/research-study-status"))
  case ADMINISTRATIVELY_COMPLETED extends ADMINISTRATIVELY_COMPLETED("administratively-completed", Some("Administratively Completed"), Some("http://hl7.org/fhir/research-study-status"))
  case APPROVED extends APPROVED("approved", Some("Approved"), Some("http://hl7.org/fhir/research-study-status"))
  case CLOSED_TO_ACCRUAL extends CLOSED_TO_ACCRUAL("closed-to-accrual", Some("Closed to Accrual"), Some("http://hl7.org/fhir/research-study-status"))
  case CLOSED_TO_ACCRUAL_AND_INTERVENTION extends CLOSED_TO_ACCRUAL_AND_INTERVENTION("closed-to-accrual-and-intervention", Some("Closed to Accrual and Intervention"), Some("http://hl7.org/fhir/research-study-status"))
  case COMPLETED extends COMPLETED("completed", Some("Completed"), Some("http://hl7.org/fhir/research-study-status"))
  case DISAPPROVED extends DISAPPROVED("disapproved", Some("Disapproved"), Some("http://hl7.org/fhir/research-study-status"))
  case IN_REVIEW extends IN_REVIEW("in-review", Some("In Review"), Some("http://hl7.org/fhir/research-study-status"))
  case TEMPORARILY_CLOSED_TO_ACCRUAL extends TEMPORARILY_CLOSED_TO_ACCRUAL("temporarily-closed-to-accrual", Some("Temporarily Closed to Accrual"), Some("http://hl7.org/fhir/research-study-status"))
  case TEMPORARILY_CLOSED_TO_ACCRUAL_AND_INTERVENTION extends TEMPORARILY_CLOSED_TO_ACCRUAL_AND_INTERVENTION("temporarily-closed-to-accrual-and-intervention", Some("Temporarily Closed to Accrual and Intervention"), Some("http://hl7.org/fhir/research-study-status"))
  case WITHDRAWN extends WITHDRAWN("withdrawn", Some("Withdrawn"), Some("http://hl7.org/fhir/research-study-status"))
}
object RESEARCH_STUDY_STATUS extends EType[RESEARCH_STUDY_STATUS]("http://hl7.org/fhir/ValueSet/research-study-status") 


enum RESEARCH_SUBJECT_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case CANDIDATE extends CANDIDATE("candidate", Some("Candidate"), Some("http://hl7.org/fhir/research-subject-status"))
  case ELIGIBLE extends ELIGIBLE("eligible", Some("Eligible"), Some("http://hl7.org/fhir/research-subject-status"))
  case FOLLOW_UP extends FOLLOW_UP("follow-up", Some("Follow-up"), Some("http://hl7.org/fhir/research-subject-status"))
  case INELIGIBLE extends INELIGIBLE("ineligible", Some("Ineligible"), Some("http://hl7.org/fhir/research-subject-status"))
  case NOT_REGISTERED extends NOT_REGISTERED("not-registered", Some("Not Registered"), Some("http://hl7.org/fhir/research-subject-status"))
  case OFF_STUDY extends OFF_STUDY("off-study", Some("Off-study"), Some("http://hl7.org/fhir/research-subject-status"))
  case ON_STUDY extends ON_STUDY("on-study", Some("On-study"), Some("http://hl7.org/fhir/research-subject-status"))
  case ON_STUDY_INTERVENTION extends ON_STUDY_INTERVENTION("on-study-intervention", Some("On-study-intervention"), Some("http://hl7.org/fhir/research-subject-status"))
  case ON_STUDY_OBSERVATION extends ON_STUDY_OBSERVATION("on-study-observation", Some("On-study-observation"), Some("http://hl7.org/fhir/research-subject-status"))
  case PENDING_ON_STUDY extends PENDING_ON_STUDY("pending-on-study", Some("Pending on-study"), Some("http://hl7.org/fhir/research-subject-status"))
  case POTENTIAL_CANDIDATE extends POTENTIAL_CANDIDATE("potential-candidate", Some("Potential Candidate"), Some("http://hl7.org/fhir/research-subject-status"))
  case SCREENING extends SCREENING("screening", Some("Screening"), Some("http://hl7.org/fhir/research-subject-status"))
  case WITHDRAWN extends WITHDRAWN("withdrawn", Some("Withdrawn"), Some("http://hl7.org/fhir/research-subject-status"))
}
object RESEARCH_SUBJECT_STATUS extends EType[RESEARCH_SUBJECT_STATUS]("http://hl7.org/fhir/ValueSet/research-subject-status") 


enum RESOURCE_AGGREGATION_MODE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case BUNDLED extends BUNDLED("bundled", Some("Bundled"), Some("http://hl7.org/fhir/resource-aggregation-mode"))
  case CONTAINED extends CONTAINED("contained", Some("Contained"), Some("http://hl7.org/fhir/resource-aggregation-mode"))
  case REFERENCED extends REFERENCED("referenced", Some("Referenced"), Some("http://hl7.org/fhir/resource-aggregation-mode"))
}
object RESOURCE_AGGREGATION_MODE extends EType[RESOURCE_AGGREGATION_MODE]("http://hl7.org/fhir/ValueSet/resource-aggregation-mode") 


enum RESOURCE_SLICING_RULES(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case CLOSED extends CLOSED("closed", Some("Closed"), Some("http://hl7.org/fhir/resource-slicing-rules"))
  case OPEN extends OPEN("open", Some("Open"), Some("http://hl7.org/fhir/resource-slicing-rules"))
  case OPENATEND extends OPENATEND("openAtEnd", Some("Open at End"), Some("http://hl7.org/fhir/resource-slicing-rules"))
}
object RESOURCE_SLICING_RULES extends EType[RESOURCE_SLICING_RULES]("http://hl7.org/fhir/ValueSet/resource-slicing-rules") 


enum RESOURCE_TYPES(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ACCOUNT extends ACCOUNT("Account", Some("Account"), Some("http://hl7.org/fhir/resource-types"))
  case ACTIVITYDEFINITION extends ACTIVITYDEFINITION("ActivityDefinition", Some("ActivityDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case ADVERSEEVENT extends ADVERSEEVENT("AdverseEvent", Some("AdverseEvent"), Some("http://hl7.org/fhir/resource-types"))
  case ALLERGYINTOLERANCE extends ALLERGYINTOLERANCE("AllergyIntolerance", Some("AllergyIntolerance"), Some("http://hl7.org/fhir/resource-types"))
  case APPOINTMENT extends APPOINTMENT("Appointment", Some("Appointment"), Some("http://hl7.org/fhir/resource-types"))
  case APPOINTMENTRESPONSE extends APPOINTMENTRESPONSE("AppointmentResponse", Some("AppointmentResponse"), Some("http://hl7.org/fhir/resource-types"))
  case AUDITEVENT extends AUDITEVENT("AuditEvent", Some("AuditEvent"), Some("http://hl7.org/fhir/resource-types"))
  case BASIC extends BASIC("Basic", Some("Basic"), Some("http://hl7.org/fhir/resource-types"))
  case BINARY extends BINARY("Binary", Some("Binary"), Some("http://hl7.org/fhir/resource-types"))
  case BIOLOGICALLYDERIVEDPRODUCT extends BIOLOGICALLYDERIVEDPRODUCT("BiologicallyDerivedProduct", Some("BiologicallyDerivedProduct"), Some("http://hl7.org/fhir/resource-types"))
  case BODYSTRUCTURE extends BODYSTRUCTURE("BodyStructure", Some("BodyStructure"), Some("http://hl7.org/fhir/resource-types"))
  case BUNDLE extends BUNDLE("Bundle", Some("Bundle"), Some("http://hl7.org/fhir/resource-types"))
  case CAPABILITYSTATEMENT extends CAPABILITYSTATEMENT("CapabilityStatement", Some("CapabilityStatement"), Some("http://hl7.org/fhir/resource-types"))
  case CAREPLAN extends CAREPLAN("CarePlan", Some("CarePlan"), Some("http://hl7.org/fhir/resource-types"))
  case CARETEAM extends CARETEAM("CareTeam", Some("CareTeam"), Some("http://hl7.org/fhir/resource-types"))
  case CATALOGENTRY extends CATALOGENTRY("CatalogEntry", Some("CatalogEntry"), Some("http://hl7.org/fhir/resource-types"))
  case CHARGEITEM extends CHARGEITEM("ChargeItem", Some("ChargeItem"), Some("http://hl7.org/fhir/resource-types"))
  case CHARGEITEMDEFINITION extends CHARGEITEMDEFINITION("ChargeItemDefinition", Some("ChargeItemDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case CLAIM extends CLAIM("Claim", Some("Claim"), Some("http://hl7.org/fhir/resource-types"))
  case CLAIMRESPONSE extends CLAIMRESPONSE("ClaimResponse", Some("ClaimResponse"), Some("http://hl7.org/fhir/resource-types"))
  case CLINICALIMPRESSION extends CLINICALIMPRESSION("ClinicalImpression", Some("ClinicalImpression"), Some("http://hl7.org/fhir/resource-types"))
  case CODESYSTEM extends CODESYSTEM("CodeSystem", Some("CodeSystem"), Some("http://hl7.org/fhir/resource-types"))
  case COMMUNICATION extends COMMUNICATION("Communication", Some("Communication"), Some("http://hl7.org/fhir/resource-types"))
  case COMMUNICATIONREQUEST extends COMMUNICATIONREQUEST("CommunicationRequest", Some("CommunicationRequest"), Some("http://hl7.org/fhir/resource-types"))
  case COMPARTMENTDEFINITION extends COMPARTMENTDEFINITION("CompartmentDefinition", Some("CompartmentDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case COMPOSITION extends COMPOSITION("Composition", Some("Composition"), Some("http://hl7.org/fhir/resource-types"))
  case CONCEPTMAP extends CONCEPTMAP("ConceptMap", Some("ConceptMap"), Some("http://hl7.org/fhir/resource-types"))
  case CONDITION extends CONDITION("Condition", Some("Condition"), Some("http://hl7.org/fhir/resource-types"))
  case CONSENT extends CONSENT("Consent", Some("Consent"), Some("http://hl7.org/fhir/resource-types"))
  case CONTRACT extends CONTRACT("Contract", Some("Contract"), Some("http://hl7.org/fhir/resource-types"))
  case COVERAGE extends COVERAGE("Coverage", Some("Coverage"), Some("http://hl7.org/fhir/resource-types"))
  case COVERAGEELIGIBILITYREQUEST extends COVERAGEELIGIBILITYREQUEST("CoverageEligibilityRequest", Some("CoverageEligibilityRequest"), Some("http://hl7.org/fhir/resource-types"))
  case COVERAGEELIGIBILITYRESPONSE extends COVERAGEELIGIBILITYRESPONSE("CoverageEligibilityResponse", Some("CoverageEligibilityResponse"), Some("http://hl7.org/fhir/resource-types"))
  case DETECTEDISSUE extends DETECTEDISSUE("DetectedIssue", Some("DetectedIssue"), Some("http://hl7.org/fhir/resource-types"))
  case DEVICE extends DEVICE("Device", Some("Device"), Some("http://hl7.org/fhir/resource-types"))
  case DEVICEDEFINITION extends DEVICEDEFINITION("DeviceDefinition", Some("DeviceDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case DEVICEMETRIC extends DEVICEMETRIC("DeviceMetric", Some("DeviceMetric"), Some("http://hl7.org/fhir/resource-types"))
  case DEVICEREQUEST extends DEVICEREQUEST("DeviceRequest", Some("DeviceRequest"), Some("http://hl7.org/fhir/resource-types"))
  case DEVICEUSESTATEMENT extends DEVICEUSESTATEMENT("DeviceUseStatement", Some("DeviceUseStatement"), Some("http://hl7.org/fhir/resource-types"))
  case DIAGNOSTICREPORT extends DIAGNOSTICREPORT("DiagnosticReport", Some("DiagnosticReport"), Some("http://hl7.org/fhir/resource-types"))
  case DOCUMENTMANIFEST extends DOCUMENTMANIFEST("DocumentManifest", Some("DocumentManifest"), Some("http://hl7.org/fhir/resource-types"))
  case DOCUMENTREFERENCE extends DOCUMENTREFERENCE("DocumentReference", Some("DocumentReference"), Some("http://hl7.org/fhir/resource-types"))
  case DOMAINRESOURCE extends DOMAINRESOURCE("DomainResource", Some("DomainResource"), Some("http://hl7.org/fhir/resource-types"))
  case EFFECTEVIDENCESYNTHESIS extends EFFECTEVIDENCESYNTHESIS("EffectEvidenceSynthesis", Some("EffectEvidenceSynthesis"), Some("http://hl7.org/fhir/resource-types"))
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
  case FAMILYMEMBERHISTORY extends FAMILYMEMBERHISTORY("FamilyMemberHistory", Some("FamilyMemberHistory"), Some("http://hl7.org/fhir/resource-types"))
  case FLAG extends FLAG("Flag", Some("Flag"), Some("http://hl7.org/fhir/resource-types"))
  case GOAL extends GOAL("Goal", Some("Goal"), Some("http://hl7.org/fhir/resource-types"))
  case GRAPHDEFINITION extends GRAPHDEFINITION("GraphDefinition", Some("GraphDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case GROUP extends GROUP("Group", Some("Group"), Some("http://hl7.org/fhir/resource-types"))
  case GUIDANCERESPONSE extends GUIDANCERESPONSE("GuidanceResponse", Some("GuidanceResponse"), Some("http://hl7.org/fhir/resource-types"))
  case HEALTHCARESERVICE extends HEALTHCARESERVICE("HealthcareService", Some("HealthcareService"), Some("http://hl7.org/fhir/resource-types"))
  case IMAGINGSTUDY extends IMAGINGSTUDY("ImagingStudy", Some("ImagingStudy"), Some("http://hl7.org/fhir/resource-types"))
  case IMMUNIZATION extends IMMUNIZATION("Immunization", Some("Immunization"), Some("http://hl7.org/fhir/resource-types"))
  case IMMUNIZATIONEVALUATION extends IMMUNIZATIONEVALUATION("ImmunizationEvaluation", Some("ImmunizationEvaluation"), Some("http://hl7.org/fhir/resource-types"))
  case IMMUNIZATIONRECOMMENDATION extends IMMUNIZATIONRECOMMENDATION("ImmunizationRecommendation", Some("ImmunizationRecommendation"), Some("http://hl7.org/fhir/resource-types"))
  case IMPLEMENTATIONGUIDE extends IMPLEMENTATIONGUIDE("ImplementationGuide", Some("ImplementationGuide"), Some("http://hl7.org/fhir/resource-types"))
  case INSURANCEPLAN extends INSURANCEPLAN("InsurancePlan", Some("InsurancePlan"), Some("http://hl7.org/fhir/resource-types"))
  case INVOICE extends INVOICE("Invoice", Some("Invoice"), Some("http://hl7.org/fhir/resource-types"))
  case LIBRARY extends LIBRARY("Library", Some("Library"), Some("http://hl7.org/fhir/resource-types"))
  case LINKAGE extends LINKAGE("Linkage", Some("Linkage"), Some("http://hl7.org/fhir/resource-types"))
  case LIST extends LIST("List", Some("List"), Some("http://hl7.org/fhir/resource-types"))
  case LOCATION extends LOCATION("Location", Some("Location"), Some("http://hl7.org/fhir/resource-types"))
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
  case MOLECULARSEQUENCE extends MOLECULARSEQUENCE("MolecularSequence", Some("MolecularSequence"), Some("http://hl7.org/fhir/resource-types"))
  case NAMINGSYSTEM extends NAMINGSYSTEM("NamingSystem", Some("NamingSystem"), Some("http://hl7.org/fhir/resource-types"))
  case NUTRITIONORDER extends NUTRITIONORDER("NutritionOrder", Some("NutritionOrder"), Some("http://hl7.org/fhir/resource-types"))
  case OBSERVATION extends OBSERVATION("Observation", Some("Observation"), Some("http://hl7.org/fhir/resource-types"))
  case OBSERVATIONDEFINITION extends OBSERVATIONDEFINITION("ObservationDefinition", Some("ObservationDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case OPERATIONDEFINITION extends OPERATIONDEFINITION("OperationDefinition", Some("OperationDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case OPERATIONOUTCOME extends OPERATIONOUTCOME("OperationOutcome", Some("OperationOutcome"), Some("http://hl7.org/fhir/resource-types"))
  case ORGANIZATION extends ORGANIZATION("Organization", Some("Organization"), Some("http://hl7.org/fhir/resource-types"))
  case ORGANIZATIONAFFILIATION extends ORGANIZATIONAFFILIATION("OrganizationAffiliation", Some("OrganizationAffiliation"), Some("http://hl7.org/fhir/resource-types"))
  case PARAMETERS extends PARAMETERS("Parameters", Some("Parameters"), Some("http://hl7.org/fhir/resource-types"))
  case PATIENT extends PATIENT("Patient", Some("Patient"), Some("http://hl7.org/fhir/resource-types"))
  case PAYMENTNOTICE extends PAYMENTNOTICE("PaymentNotice", Some("PaymentNotice"), Some("http://hl7.org/fhir/resource-types"))
  case PAYMENTRECONCILIATION extends PAYMENTRECONCILIATION("PaymentReconciliation", Some("PaymentReconciliation"), Some("http://hl7.org/fhir/resource-types"))
  case PERSON extends PERSON("Person", Some("Person"), Some("http://hl7.org/fhir/resource-types"))
  case PLANDEFINITION extends PLANDEFINITION("PlanDefinition", Some("PlanDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case PRACTITIONER extends PRACTITIONER("Practitioner", Some("Practitioner"), Some("http://hl7.org/fhir/resource-types"))
  case PRACTITIONERROLE extends PRACTITIONERROLE("PractitionerRole", Some("PractitionerRole"), Some("http://hl7.org/fhir/resource-types"))
  case PROCEDURE extends PROCEDURE("Procedure", Some("Procedure"), Some("http://hl7.org/fhir/resource-types"))
  case PROVENANCE extends PROVENANCE("Provenance", Some("Provenance"), Some("http://hl7.org/fhir/resource-types"))
  case QUESTIONNAIRE extends QUESTIONNAIRE("Questionnaire", Some("Questionnaire"), Some("http://hl7.org/fhir/resource-types"))
  case QUESTIONNAIRERESPONSE extends QUESTIONNAIRERESPONSE("QuestionnaireResponse", Some("QuestionnaireResponse"), Some("http://hl7.org/fhir/resource-types"))
  case RELATEDPERSON extends RELATEDPERSON("RelatedPerson", Some("RelatedPerson"), Some("http://hl7.org/fhir/resource-types"))
  case REQUESTGROUP extends REQUESTGROUP("RequestGroup", Some("RequestGroup"), Some("http://hl7.org/fhir/resource-types"))
  case RESEARCHDEFINITION extends RESEARCHDEFINITION("ResearchDefinition", Some("ResearchDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case RESEARCHELEMENTDEFINITION extends RESEARCHELEMENTDEFINITION("ResearchElementDefinition", Some("ResearchElementDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case RESEARCHSTUDY extends RESEARCHSTUDY("ResearchStudy", Some("ResearchStudy"), Some("http://hl7.org/fhir/resource-types"))
  case RESEARCHSUBJECT extends RESEARCHSUBJECT("ResearchSubject", Some("ResearchSubject"), Some("http://hl7.org/fhir/resource-types"))
  case RESOURCE extends RESOURCE("Resource", Some("Resource"), Some("http://hl7.org/fhir/resource-types"))
  case RISKASSESSMENT extends RISKASSESSMENT("RiskAssessment", Some("RiskAssessment"), Some("http://hl7.org/fhir/resource-types"))
  case RISKEVIDENCESYNTHESIS extends RISKEVIDENCESYNTHESIS("RiskEvidenceSynthesis", Some("RiskEvidenceSynthesis"), Some("http://hl7.org/fhir/resource-types"))
  case SCHEDULE extends SCHEDULE("Schedule", Some("Schedule"), Some("http://hl7.org/fhir/resource-types"))
  case SEARCHPARAMETER extends SEARCHPARAMETER("SearchParameter", Some("SearchParameter"), Some("http://hl7.org/fhir/resource-types"))
  case SERVICEREQUEST extends SERVICEREQUEST("ServiceRequest", Some("ServiceRequest"), Some("http://hl7.org/fhir/resource-types"))
  case SLOT extends SLOT("Slot", Some("Slot"), Some("http://hl7.org/fhir/resource-types"))
  case SPECIMEN extends SPECIMEN("Specimen", Some("Specimen"), Some("http://hl7.org/fhir/resource-types"))
  case SPECIMENDEFINITION extends SPECIMENDEFINITION("SpecimenDefinition", Some("SpecimenDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case STRUCTUREDEFINITION extends STRUCTUREDEFINITION("StructureDefinition", Some("StructureDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case STRUCTUREMAP extends STRUCTUREMAP("StructureMap", Some("StructureMap"), Some("http://hl7.org/fhir/resource-types"))
  case SUBSCRIPTION extends SUBSCRIPTION("Subscription", Some("Subscription"), Some("http://hl7.org/fhir/resource-types"))
  case SUBSTANCE extends SUBSTANCE("Substance", Some("Substance"), Some("http://hl7.org/fhir/resource-types"))
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
  case VALUESET extends VALUESET("ValueSet", Some("ValueSet"), Some("http://hl7.org/fhir/resource-types"))
  case VERIFICATIONRESULT extends VERIFICATIONRESULT("VerificationResult", Some("VerificationResult"), Some("http://hl7.org/fhir/resource-types"))
  case VISIONPRESCRIPTION extends VISIONPRESCRIPTION("VisionPrescription", Some("VisionPrescription"), Some("http://hl7.org/fhir/resource-types"))
}
object RESOURCE_TYPES extends EType[RESOURCE_TYPES]("http://hl7.org/fhir/ValueSet/resource-types") 


enum RESPONSE_CODE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case FATAL_ERROR extends FATAL_ERROR("fatal-error", Some("Fatal Error"), Some("http://hl7.org/fhir/response-code"))
  case OK extends OK("ok", Some("OK"), Some("http://hl7.org/fhir/response-code"))
  case TRANSIENT_ERROR extends TRANSIENT_ERROR("transient-error", Some("Transient Error"), Some("http://hl7.org/fhir/response-code"))
}
object RESPONSE_CODE extends EType[RESPONSE_CODE]("http://hl7.org/fhir/ValueSet/response-code") 


enum RESTFUL_CAPABILITY_MODE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case CLIENT extends CLIENT("client", Some("Client"), Some("http://hl7.org/fhir/restful-capability-mode"))
  case SERVER extends SERVER("server", Some("Server"), Some("http://hl7.org/fhir/restful-capability-mode"))
}
object RESTFUL_CAPABILITY_MODE extends EType[RESTFUL_CAPABILITY_MODE]("http://hl7.org/fhir/ValueSet/restful-capability-mode") 


enum SEARCH_COMPARATOR(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case AP extends AP("ap", Some("Approximately"), Some("http://hl7.org/fhir/search-comparator"))
  case EB extends EB("eb", Some("Ends Before"), Some("http://hl7.org/fhir/search-comparator"))
  case EQ extends EQ("eq", Some("Equals"), Some("http://hl7.org/fhir/search-comparator"))
  case GE extends GE("ge", Some("Greater or Equals"), Some("http://hl7.org/fhir/search-comparator"))
  case GT extends GT("gt", Some("Greater Than"), Some("http://hl7.org/fhir/search-comparator"))
  case LE extends LE("le", Some("Less of Equal"), Some("http://hl7.org/fhir/search-comparator"))
  case LT extends LT("lt", Some("Less Than"), Some("http://hl7.org/fhir/search-comparator"))
  case NE extends NE("ne", Some("Not Equals"), Some("http://hl7.org/fhir/search-comparator"))
  case SA extends SA("sa", Some("Starts After"), Some("http://hl7.org/fhir/search-comparator"))
}
object SEARCH_COMPARATOR extends EType[SEARCH_COMPARATOR]("http://hl7.org/fhir/ValueSet/search-comparator") 


enum SEARCH_ENTRY_MODE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case INCLUDE extends INCLUDE("include", Some("Include"), Some("http://hl7.org/fhir/search-entry-mode"))
  case MATCH extends MATCH("match", Some("Match"), Some("http://hl7.org/fhir/search-entry-mode"))
  case OUTCOME extends OUTCOME("outcome", Some("Outcome"), Some("http://hl7.org/fhir/search-entry-mode"))
}
object SEARCH_ENTRY_MODE extends EType[SEARCH_ENTRY_MODE]("http://hl7.org/fhir/ValueSet/search-entry-mode") 


enum SEARCH_MODIFIER_CODE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ABOVE extends ABOVE("above", Some("Above"), Some("http://hl7.org/fhir/search-modifier-code"))
  case BELOW extends BELOW("below", Some("Below"), Some("http://hl7.org/fhir/search-modifier-code"))
  case CONTAINS extends CONTAINS("contains", Some("Contains"), Some("http://hl7.org/fhir/search-modifier-code"))
  case EXACT extends EXACT("exact", Some("Exact"), Some("http://hl7.org/fhir/search-modifier-code"))
  case IDENTIFIER extends IDENTIFIER("identifier", Some("Identifier"), Some("http://hl7.org/fhir/search-modifier-code"))
  case IN extends IN("in", Some("In"), Some("http://hl7.org/fhir/search-modifier-code"))
  case MISSING extends MISSING("missing", Some("Missing"), Some("http://hl7.org/fhir/search-modifier-code"))
  case NOT extends NOT("not", Some("Not"), Some("http://hl7.org/fhir/search-modifier-code"))
  case NOT_IN extends NOT_IN("not-in", Some("Not In"), Some("http://hl7.org/fhir/search-modifier-code"))
  case OFTYPE extends OFTYPE("ofType", Some("Of Type"), Some("http://hl7.org/fhir/search-modifier-code"))
  case TEXT extends TEXT("text", Some("Text"), Some("http://hl7.org/fhir/search-modifier-code"))
  case TYPE extends TYPE("type", Some("Type"), Some("http://hl7.org/fhir/search-modifier-code"))
}
object SEARCH_MODIFIER_CODE extends EType[SEARCH_MODIFIER_CODE]("http://hl7.org/fhir/ValueSet/search-modifier-code") 


enum SEARCH_PARAM_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case COMPOSITE extends COMPOSITE("composite", Some("Composite"), Some("http://hl7.org/fhir/search-param-type"))
  case DATE extends DATE("date", Some("Date/DateTime"), Some("http://hl7.org/fhir/search-param-type"))
  case NUMBER extends NUMBER("number", Some("Number"), Some("http://hl7.org/fhir/search-param-type"))
  case QUANTITY extends QUANTITY("quantity", Some("Quantity"), Some("http://hl7.org/fhir/search-param-type"))
  case REFERENCE extends REFERENCE("reference", Some("Reference"), Some("http://hl7.org/fhir/search-param-type"))
  case SPECIAL extends SPECIAL("special", Some("Special"), Some("http://hl7.org/fhir/search-param-type"))
  case STRING extends STRING("string", Some("String"), Some("http://hl7.org/fhir/search-param-type"))
  case TOKEN extends TOKEN("token", Some("Token"), Some("http://hl7.org/fhir/search-param-type"))
  case URI extends URI("uri", Some("URI"), Some("http://hl7.org/fhir/search-param-type"))
}
object SEARCH_PARAM_TYPE extends EType[SEARCH_PARAM_TYPE]("http://hl7.org/fhir/ValueSet/search-param-type") 


enum SEARCH_XPATH_USAGE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case DISTANCE extends DISTANCE("distance", Some("Distance"), Some("http://hl7.org/fhir/search-xpath-usage"))
  case NEARBY extends NEARBY("nearby", Some("Nearby"), Some("http://hl7.org/fhir/search-xpath-usage"))
  case NORMAL extends NORMAL("normal", Some("Normal"), Some("http://hl7.org/fhir/search-xpath-usage"))
  case OTHER extends OTHER("other", Some("Other"), Some("http://hl7.org/fhir/search-xpath-usage"))
  case PHONETIC extends PHONETIC("phonetic", Some("Phonetic"), Some("http://hl7.org/fhir/search-xpath-usage"))
}
object SEARCH_XPATH_USAGE extends EType[SEARCH_XPATH_USAGE]("http://hl7.org/fhir/ValueSet/search-xpath-usage") 


enum SEQUENCE_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case AA extends AA("aa", Some("AA Sequence"), Some("http://hl7.org/fhir/sequence-type"))
  case DNA extends DNA("dna", Some("DNA Sequence"), Some("http://hl7.org/fhir/sequence-type"))
  case RNA extends RNA("rna", Some("RNA Sequence"), Some("http://hl7.org/fhir/sequence-type"))
}
object SEQUENCE_TYPE extends EType[SEQUENCE_TYPE]("http://hl7.org/fhir/ValueSet/sequence-type") 


enum SLOTSTATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case BUSY extends BUSY("busy", Some("Busy"), Some("http://hl7.org/fhir/slotstatus"))
  case BUSY_TENTATIVE extends BUSY_TENTATIVE("busy-tentative", Some("Busy (Tentative)"), Some("http://hl7.org/fhir/slotstatus"))
  case BUSY_UNAVAILABLE extends BUSY_UNAVAILABLE("busy-unavailable", Some("Busy (Unavailable)"), Some("http://hl7.org/fhir/slotstatus"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("Entered in error"), Some("http://hl7.org/fhir/slotstatus"))
  case FREE extends FREE("free", Some("Free"), Some("http://hl7.org/fhir/slotstatus"))
}
object SLOTSTATUS extends EType[SLOTSTATUS]("http://hl7.org/fhir/ValueSet/slotstatus") 


enum SPDX_LICENSE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case AAL extends AAL("AAL", Some("Attribution Assurance License"), Some("http://hl7.org/fhir/spdx-license"))
  case ABSTYLES extends ABSTYLES("Abstyles", Some("Abstyles License"), Some("http://hl7.org/fhir/spdx-license"))
  case ACADEMIC_FREE_LICENSE_V1_1 extends ACADEMIC_FREE_LICENSE_V1_1("AFL-1.1", Some("Academic Free License v1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case ACADEMIC_FREE_LICENSE_V1_2 extends ACADEMIC_FREE_LICENSE_V1_2("AFL-1.2", Some("Academic Free License v1.2"), Some("http://hl7.org/fhir/spdx-license"))
  case ACADEMIC_FREE_LICENSE_V2_0 extends ACADEMIC_FREE_LICENSE_V2_0("AFL-2.0", Some("Academic Free License v2.0"), Some("http://hl7.org/fhir/spdx-license"))
  case ACADEMIC_FREE_LICENSE_V2_1 extends ACADEMIC_FREE_LICENSE_V2_1("AFL-2.1", Some("Academic Free License v2.1"), Some("http://hl7.org/fhir/spdx-license"))
  case ACADEMIC_FREE_LICENSE_V3_0 extends ACADEMIC_FREE_LICENSE_V3_0("AFL-3.0", Some("Academic Free License v3.0"), Some("http://hl7.org/fhir/spdx-license"))
  case ADAPTIVE_PUBLIC_LICENSE_1_0 extends ADAPTIVE_PUBLIC_LICENSE_1_0("APL-1.0", Some("Adaptive Public License 1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case ADOBE_GLYPH_LIST_LICENSE extends ADOBE_GLYPH_LIST_LICENSE("Adobe-Glyph", Some("Adobe Glyph List License"), Some("http://hl7.org/fhir/spdx-license"))
  case ADOBE_SYSTEMS_INCORPORATED_SOURCE_CODE_LICENSE_AGREEMENT extends ADOBE_SYSTEMS_INCORPORATED_SOURCE_CODE_LICENSE_AGREEMENT("Adobe-2006", Some("Adobe Systems Incorporated Source Code License Agreement"), Some("http://hl7.org/fhir/spdx-license"))
  case ADSL extends ADSL("ADSL", Some("Amazon Digital Services License"), Some("http://hl7.org/fhir/spdx-license"))
  case AFFERO_GENERAL_PUBLIC_LICENSE_V1_0_ONLY extends AFFERO_GENERAL_PUBLIC_LICENSE_V1_0_ONLY("AGPL-1.0-only", Some("Affero General Public License v1.0 only"), Some("http://hl7.org/fhir/spdx-license"))
  case AFFERO_GENERAL_PUBLIC_LICENSE_V1_0_OR_LATER extends AFFERO_GENERAL_PUBLIC_LICENSE_V1_0_OR_LATER("AGPL-1.0-or-later", Some("Affero General Public License v1.0 or later"), Some("http://hl7.org/fhir/spdx-license"))
  case AFMPARSE extends AFMPARSE("Afmparse", Some("Afmparse License"), Some("http://hl7.org/fhir/spdx-license"))
  case ALADDIN extends ALADDIN("Aladdin", Some("Aladdin Free Public License"), Some("http://hl7.org/fhir/spdx-license"))
  case AMDPLPA extends AMDPLPA("AMDPLPA", Some("AMD's plpa_map.c License"), Some("http://hl7.org/fhir/spdx-license"))
  case AML extends AML("AML", Some("Apple MIT License"), Some("http://hl7.org/fhir/spdx-license"))
  case AMPAS extends AMPAS("AMPAS", Some("Academy of Motion Picture Arts and Sciences BSD"), Some("http://hl7.org/fhir/spdx-license"))
  case ANTLR_SOFTWARE_RIGHTS_NOTICE extends ANTLR_SOFTWARE_RIGHTS_NOTICE("ANTLR-PD", Some("ANTLR Software Rights Notice"), Some("http://hl7.org/fhir/spdx-license"))
  case APACHE_LICENSE_1_0 extends APACHE_LICENSE_1_0("Apache-1.0", Some("Apache License 1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case APACHE_LICENSE_1_1 extends APACHE_LICENSE_1_1("Apache-1.1", Some("Apache License 1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case APACHE_LICENSE_2_0 extends APACHE_LICENSE_2_0("Apache-2.0", Some("Apache License 2.0"), Some("http://hl7.org/fhir/spdx-license"))
  case APAFML extends APAFML("APAFML", Some("Adobe Postscript AFM License"), Some("http://hl7.org/fhir/spdx-license"))
  case APPLE_PUBLIC_SOURCE_LICENSE_1_0 extends APPLE_PUBLIC_SOURCE_LICENSE_1_0("APSL-1.0", Some("Apple Public Source License 1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case APPLE_PUBLIC_SOURCE_LICENSE_1_1 extends APPLE_PUBLIC_SOURCE_LICENSE_1_1("APSL-1.1", Some("Apple Public Source License 1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case APPLE_PUBLIC_SOURCE_LICENSE_1_2 extends APPLE_PUBLIC_SOURCE_LICENSE_1_2("APSL-1.2", Some("Apple Public Source License 1.2"), Some("http://hl7.org/fhir/spdx-license"))
  case APPLE_PUBLIC_SOURCE_LICENSE_2_0 extends APPLE_PUBLIC_SOURCE_LICENSE_2_0("APSL-2.0", Some("Apple Public Source License 2.0"), Some("http://hl7.org/fhir/spdx-license"))
  case ARTISTIC_10_CL8 extends ARTISTIC_10_CL8("Artistic-1.0-cl8", Some("Artistic License 1.0 w/clause 8"), Some("http://hl7.org/fhir/spdx-license"))
  case ARTISTIC_10_PERL extends ARTISTIC_10_PERL("Artistic-1.0-Perl", Some("Artistic License 1.0 (Perl)"), Some("http://hl7.org/fhir/spdx-license"))
  case ARTISTIC_LICENSE_1_0 extends ARTISTIC_LICENSE_1_0("Artistic-1.0", Some("Artistic License 1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case ARTISTIC_LICENSE_2_0 extends ARTISTIC_LICENSE_2_0("Artistic-2.0", Some("Artistic License 2.0"), Some("http://hl7.org/fhir/spdx-license"))
  case BAHYPH extends BAHYPH("Bahyph", Some("Bahyph License"), Some("http://hl7.org/fhir/spdx-license"))
  case BARR extends BARR("Barr", Some("Barr License"), Some("http://hl7.org/fhir/spdx-license"))
  case BEERWARE extends BEERWARE("Beerware", Some("Beerware License"), Some("http://hl7.org/fhir/spdx-license"))
  case BITTORRENT_OPEN_SOURCE_LICENSE_V1_0 extends BITTORRENT_OPEN_SOURCE_LICENSE_V1_0("BitTorrent-1.0", Some("BitTorrent Open Source License v1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case BITTORRENT_OPEN_SOURCE_LICENSE_V1_1 extends BITTORRENT_OPEN_SOURCE_LICENSE_V1_1("BitTorrent-1.1", Some("BitTorrent Open Source License v1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case BOOST_SOFTWARE_LICENSE_1_0 extends BOOST_SOFTWARE_LICENSE_1_0("BSL-1.0", Some("Boost Software License 1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case BORCEUX extends BORCEUX("Borceux", Some("Borceux license"), Some("http://hl7.org/fhir/spdx-license"))
  case BSD_1_CLAUSE_LICENSE extends BSD_1_CLAUSE_LICENSE("BSD-1-Clause", Some("BSD 1-Clause License"), Some("http://hl7.org/fhir/spdx-license"))
  case BSD_2_CLAUSE extends BSD_2_CLAUSE("BSD-2-Clause", Some("BSD 2-Clause \"Simplified\" License"), Some("http://hl7.org/fhir/spdx-license"))
  case BSD_2_CLAUSE_FREEBSD_LICENSE extends BSD_2_CLAUSE_FREEBSD_LICENSE("BSD-2-Clause-FreeBSD", Some("BSD 2-Clause FreeBSD License"), Some("http://hl7.org/fhir/spdx-license"))
  case BSD_2_CLAUSE_NETBSD_LICENSE extends BSD_2_CLAUSE_NETBSD_LICENSE("BSD-2-Clause-NetBSD", Some("BSD 2-Clause NetBSD License"), Some("http://hl7.org/fhir/spdx-license"))
  case BSD_2_CLAUSE_PLUS_PATENT_LICENSE extends BSD_2_CLAUSE_PLUS_PATENT_LICENSE("BSD-2-Clause-Patent", Some("BSD-2-Clause Plus Patent License"), Some("http://hl7.org/fhir/spdx-license"))
  case BSD_3_CLAUSE extends BSD_3_CLAUSE("BSD-3-Clause", Some("BSD 3-Clause \"New\" or \"Revised\" License"), Some("http://hl7.org/fhir/spdx-license"))
  case BSD_3_CLAUSE_CLEAR_LICENSE extends BSD_3_CLAUSE_CLEAR_LICENSE("BSD-3-Clause-Clear", Some("BSD 3-Clause Clear License"), Some("http://hl7.org/fhir/spdx-license"))
  case BSD_3_CLAUSE_NO_NUCLEAR_LICENSE extends BSD_3_CLAUSE_NO_NUCLEAR_LICENSE("BSD-3-Clause-No-Nuclear-License", Some("BSD 3-Clause No Nuclear License"), Some("http://hl7.org/fhir/spdx-license"))
  case BSD_3_CLAUSE_NO_NUCLEAR_LICENSE_2014 extends BSD_3_CLAUSE_NO_NUCLEAR_LICENSE_2014("BSD-3-Clause-No-Nuclear-License-2014", Some("BSD 3-Clause No Nuclear License 2014"), Some("http://hl7.org/fhir/spdx-license"))
  case BSD_3_CLAUSE_NO_NUCLEAR_WARRANTY extends BSD_3_CLAUSE_NO_NUCLEAR_WARRANTY("BSD-3-Clause-No-Nuclear-Warranty", Some("BSD 3-Clause No Nuclear Warranty"), Some("http://hl7.org/fhir/spdx-license"))
  case BSD_4_CLAUSE extends BSD_4_CLAUSE("BSD-4-Clause", Some("BSD 4-Clause \"Original\" or \"Old\" License"), Some("http://hl7.org/fhir/spdx-license"))
  case BSD_4_CLAUSE_UC extends BSD_4_CLAUSE_UC("BSD-4-Clause-UC", Some("BSD-4-Clause (University of California-Specific)"), Some("http://hl7.org/fhir/spdx-license"))
  case BSD_PROTECTION_LICENSE extends BSD_PROTECTION_LICENSE("BSD-Protection", Some("BSD Protection License"), Some("http://hl7.org/fhir/spdx-license"))
  case BSD_SOURCE_CODE_ATTRIBUTION extends BSD_SOURCE_CODE_ATTRIBUTION("BSD-Source-Code", Some("BSD Source Code Attribution"), Some("http://hl7.org/fhir/spdx-license"))
  case BSD_WITH_ATTRIBUTION extends BSD_WITH_ATTRIBUTION("BSD-3-Clause-Attribution", Some("BSD with attribution"), Some("http://hl7.org/fhir/spdx-license"))
  case BSD_ZERO_CLAUSE_LICENSE extends BSD_ZERO_CLAUSE_LICENSE("0BSD", Some("BSD Zero Clause License"), Some("http://hl7.org/fhir/spdx-license"))
  case BZIP2_AND_LIBBZIP2_LICENSE_V1_0_5 extends BZIP2_AND_LIBBZIP2_LICENSE_V1_0_5("bzip2-1.0.5", Some("bzip2 and libbzip2 License v1.0.5"), Some("http://hl7.org/fhir/spdx-license"))
  case BZIP2_AND_LIBBZIP2_LICENSE_V1_0_6 extends BZIP2_AND_LIBBZIP2_LICENSE_V1_0_6("bzip2-1.0.6", Some("bzip2 and libbzip2 License v1.0.6"), Some("http://hl7.org/fhir/spdx-license"))
  case CALDERA extends CALDERA("Caldera", Some("Caldera License"), Some("http://hl7.org/fhir/spdx-license"))
  case CECILL_B_FREE_SOFTWARE_LICENSE_AGREEMENT extends CECILL_B_FREE_SOFTWARE_LICENSE_AGREEMENT("CECILL-B", Some("CeCILL-B Free Software License Agreement"), Some("http://hl7.org/fhir/spdx-license"))
  case CECILL_C_FREE_SOFTWARE_LICENSE_AGREEMENT extends CECILL_C_FREE_SOFTWARE_LICENSE_AGREEMENT("CECILL-C", Some("CeCILL-C Free Software License Agreement"), Some("http://hl7.org/fhir/spdx-license"))
  case CECILL_FREE_SOFTWARE_LICENSE_AGREEMENT_V1_0 extends CECILL_FREE_SOFTWARE_LICENSE_AGREEMENT_V1_0("CECILL-1.0", Some("CeCILL Free Software License Agreement v1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case CECILL_FREE_SOFTWARE_LICENSE_AGREEMENT_V1_1 extends CECILL_FREE_SOFTWARE_LICENSE_AGREEMENT_V1_1("CECILL-1.1", Some("CeCILL Free Software License Agreement v1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case CECILL_FREE_SOFTWARE_LICENSE_AGREEMENT_V2_0 extends CECILL_FREE_SOFTWARE_LICENSE_AGREEMENT_V2_0("CECILL-2.0", Some("CeCILL Free Software License Agreement v2.0"), Some("http://hl7.org/fhir/spdx-license"))
  case CECILL_FREE_SOFTWARE_LICENSE_AGREEMENT_V2_1 extends CECILL_FREE_SOFTWARE_LICENSE_AGREEMENT_V2_1("CECILL-2.1", Some("CeCILL Free Software License Agreement v2.1"), Some("http://hl7.org/fhir/spdx-license"))
  case CLARTISTIC extends CLARTISTIC("ClArtistic", Some("Clarified Artistic License"), Some("http://hl7.org/fhir/spdx-license"))
  case CMU_LICENSE extends CMU_LICENSE("MIT-CMU", Some("CMU License"), Some("http://hl7.org/fhir/spdx-license"))
  case CNRI_JYTHON_LICENSE extends CNRI_JYTHON_LICENSE("CNRI-Jython", Some("CNRI Jython License"), Some("http://hl7.org/fhir/spdx-license"))
  case CNRI_PYTHON_LICENSE extends CNRI_PYTHON_LICENSE("CNRI-Python", Some("CNRI Python License"), Some("http://hl7.org/fhir/spdx-license"))
  case CNRI_PYTHON_OPEN_SOURCE_GPL_COMPATIBLE_LICENSE_AGREEMENT extends CNRI_PYTHON_OPEN_SOURCE_GPL_COMPATIBLE_LICENSE_AGREEMENT("CNRI-Python-GPL-Compatible", Some("CNRI Python Open Source GPL Compatible License Agreement"), Some("http://hl7.org/fhir/spdx-license"))
  case CODE_PROJECT_OPEN_LICENSE_1_02 extends CODE_PROJECT_OPEN_LICENSE_1_02("CPOL-1.02", Some("Code Project Open License 1.02"), Some("http://hl7.org/fhir/spdx-license"))
  case COMMON_DEVELOPMENT_AND_DISTRIBUTION_LICENSE_1_0 extends COMMON_DEVELOPMENT_AND_DISTRIBUTION_LICENSE_1_0("CDDL-1.0", Some("Common Development and Distribution License 1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case COMMON_DEVELOPMENT_AND_DISTRIBUTION_LICENSE_1_1 extends COMMON_DEVELOPMENT_AND_DISTRIBUTION_LICENSE_1_1("CDDL-1.1", Some("Common Development and Distribution License 1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case COMMON_PUBLIC_ATTRIBUTION_LICENSE_1_0 extends COMMON_PUBLIC_ATTRIBUTION_LICENSE_1_0("CPAL-1.0", Some("Common Public Attribution License 1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case COMMON_PUBLIC_LICENSE_1_0 extends COMMON_PUBLIC_LICENSE_1_0("CPL-1.0", Some("Common Public License 1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case COMMUNITY_DATA_LICENSE_AGREEMENT_PERMISSIVE_1_0 extends COMMUNITY_DATA_LICENSE_AGREEMENT_PERMISSIVE_1_0("CDLA-Permissive-1.0", Some("Community Data License Agreement Permissive 1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case COMMUNITY_DATA_LICENSE_AGREEMENT_SHARING_1_0 extends COMMUNITY_DATA_LICENSE_AGREEMENT_SHARING_1_0("CDLA-Sharing-1.0", Some("Community Data License Agreement Sharing 1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case COMPUTER_ASSOCIATES_TRUSTED_OPEN_SOURCE_LICENSE_1_1 extends COMPUTER_ASSOCIATES_TRUSTED_OPEN_SOURCE_LICENSE_1_1("CATOSL-1.1", Some("Computer Associates Trusted Open Source License 1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case CONDOR_PUBLIC_LICENSE_V1_1 extends CONDOR_PUBLIC_LICENSE_V1_1("Condor-1.1", Some("Condor Public License v1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_1_0_GENERIC extends CREATIVE_COMMONS_ATTRIBUTION_1_0_GENERIC("CC-BY-1.0", Some("Creative Commons Attribution 1.0 Generic"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_2_0_GENERIC extends CREATIVE_COMMONS_ATTRIBUTION_2_0_GENERIC("CC-BY-2.0", Some("Creative Commons Attribution 2.0 Generic"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_2_5_GENERIC extends CREATIVE_COMMONS_ATTRIBUTION_2_5_GENERIC("CC-BY-2.5", Some("Creative Commons Attribution 2.5 Generic"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_3_0_UNPORTED extends CREATIVE_COMMONS_ATTRIBUTION_3_0_UNPORTED("CC-BY-3.0", Some("Creative Commons Attribution 3.0 Unported"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_4_0_INTERNATIONAL extends CREATIVE_COMMONS_ATTRIBUTION_4_0_INTERNATIONAL("CC-BY-4.0", Some("Creative Commons Attribution 4.0 International"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_1_0_GENERIC extends CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_1_0_GENERIC("CC-BY-NC-1.0", Some("Creative Commons Attribution Non Commercial 1.0 Generic"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_2_0_GENERIC extends CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_2_0_GENERIC("CC-BY-NC-2.0", Some("Creative Commons Attribution Non Commercial 2.0 Generic"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_2_5_GENERIC extends CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_2_5_GENERIC("CC-BY-NC-2.5", Some("Creative Commons Attribution Non Commercial 2.5 Generic"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_3_0_UNPORTED extends CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_3_0_UNPORTED("CC-BY-NC-3.0", Some("Creative Commons Attribution Non Commercial 3.0 Unported"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_4_0_INTERNATIONAL extends CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_4_0_INTERNATIONAL("CC-BY-NC-4.0", Some("Creative Commons Attribution Non Commercial 4.0 International"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_NO_DERIVATIVES_1_0_GENERIC extends CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_NO_DERIVATIVES_1_0_GENERIC("CC-BY-NC-ND-1.0", Some("Creative Commons Attribution Non Commercial No Derivatives 1.0 Generic"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_NO_DERIVATIVES_2_0_GENERIC extends CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_NO_DERIVATIVES_2_0_GENERIC("CC-BY-NC-ND-2.0", Some("Creative Commons Attribution Non Commercial No Derivatives 2.0 Generic"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_NO_DERIVATIVES_2_5_GENERIC extends CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_NO_DERIVATIVES_2_5_GENERIC("CC-BY-NC-ND-2.5", Some("Creative Commons Attribution Non Commercial No Derivatives 2.5 Generic"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_NO_DERIVATIVES_3_0_UNPORTED extends CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_NO_DERIVATIVES_3_0_UNPORTED("CC-BY-NC-ND-3.0", Some("Creative Commons Attribution Non Commercial No Derivatives 3.0 Unported"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_NO_DERIVATIVES_4_0_INTERNATIONAL extends CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_NO_DERIVATIVES_4_0_INTERNATIONAL("CC-BY-NC-ND-4.0", Some("Creative Commons Attribution Non Commercial No Derivatives 4.0 International"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_SHARE_ALIKE_1_0_GENERIC extends CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_SHARE_ALIKE_1_0_GENERIC("CC-BY-NC-SA-1.0", Some("Creative Commons Attribution Non Commercial Share Alike 1.0 Generic"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_SHARE_ALIKE_2_0_GENERIC extends CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_SHARE_ALIKE_2_0_GENERIC("CC-BY-NC-SA-2.0", Some("Creative Commons Attribution Non Commercial Share Alike 2.0 Generic"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_SHARE_ALIKE_2_5_GENERIC extends CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_SHARE_ALIKE_2_5_GENERIC("CC-BY-NC-SA-2.5", Some("Creative Commons Attribution Non Commercial Share Alike 2.5 Generic"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_SHARE_ALIKE_3_0_UNPORTED extends CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_SHARE_ALIKE_3_0_UNPORTED("CC-BY-NC-SA-3.0", Some("Creative Commons Attribution Non Commercial Share Alike 3.0 Unported"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_SHARE_ALIKE_4_0_INTERNATIONAL extends CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_SHARE_ALIKE_4_0_INTERNATIONAL("CC-BY-NC-SA-4.0", Some("Creative Commons Attribution Non Commercial Share Alike 4.0 International"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_NO_DERIVATIVES_1_0_GENERIC extends CREATIVE_COMMONS_ATTRIBUTION_NO_DERIVATIVES_1_0_GENERIC("CC-BY-ND-1.0", Some("Creative Commons Attribution No Derivatives 1.0 Generic"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_NO_DERIVATIVES_2_0_GENERIC extends CREATIVE_COMMONS_ATTRIBUTION_NO_DERIVATIVES_2_0_GENERIC("CC-BY-ND-2.0", Some("Creative Commons Attribution No Derivatives 2.0 Generic"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_NO_DERIVATIVES_2_5_GENERIC extends CREATIVE_COMMONS_ATTRIBUTION_NO_DERIVATIVES_2_5_GENERIC("CC-BY-ND-2.5", Some("Creative Commons Attribution No Derivatives 2.5 Generic"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_NO_DERIVATIVES_3_0_UNPORTED extends CREATIVE_COMMONS_ATTRIBUTION_NO_DERIVATIVES_3_0_UNPORTED("CC-BY-ND-3.0", Some("Creative Commons Attribution No Derivatives 3.0 Unported"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_NO_DERIVATIVES_4_0_INTERNATIONAL extends CREATIVE_COMMONS_ATTRIBUTION_NO_DERIVATIVES_4_0_INTERNATIONAL("CC-BY-ND-4.0", Some("Creative Commons Attribution No Derivatives 4.0 International"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_SHARE_ALIKE_1_0_GENERIC extends CREATIVE_COMMONS_ATTRIBUTION_SHARE_ALIKE_1_0_GENERIC("CC-BY-SA-1.0", Some("Creative Commons Attribution Share Alike 1.0 Generic"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_SHARE_ALIKE_2_0_GENERIC extends CREATIVE_COMMONS_ATTRIBUTION_SHARE_ALIKE_2_0_GENERIC("CC-BY-SA-2.0", Some("Creative Commons Attribution Share Alike 2.0 Generic"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_SHARE_ALIKE_2_5_GENERIC extends CREATIVE_COMMONS_ATTRIBUTION_SHARE_ALIKE_2_5_GENERIC("CC-BY-SA-2.5", Some("Creative Commons Attribution Share Alike 2.5 Generic"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_SHARE_ALIKE_3_0_UNPORTED extends CREATIVE_COMMONS_ATTRIBUTION_SHARE_ALIKE_3_0_UNPORTED("CC-BY-SA-3.0", Some("Creative Commons Attribution Share Alike 3.0 Unported"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_SHARE_ALIKE_4_0_INTERNATIONAL extends CREATIVE_COMMONS_ATTRIBUTION_SHARE_ALIKE_4_0_INTERNATIONAL("CC-BY-SA-4.0", Some("Creative Commons Attribution Share Alike 4.0 International"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ZERO_V1_0_UNIVERSAL extends CREATIVE_COMMONS_ZERO_V1_0_UNIVERSAL("CC0-1.0", Some("Creative Commons Zero v1.0 Universal"), Some("http://hl7.org/fhir/spdx-license"))
  case CROSSWORD extends CROSSWORD("Crossword", Some("Crossword License"), Some("http://hl7.org/fhir/spdx-license"))
  case CRYSTALSTACKER extends CRYSTALSTACKER("CrystalStacker", Some("CrystalStacker License"), Some("http://hl7.org/fhir/spdx-license"))
  case CUA_OFFICE_PUBLIC_LICENSE_V1_0 extends CUA_OFFICE_PUBLIC_LICENSE_V1_0("CUA-OPL-1.0", Some("CUA Office Public License v1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case CUBE extends CUBE("Cube", Some("Cube License"), Some("http://hl7.org/fhir/spdx-license"))
  case CURL extends CURL("curl", Some("curl License"), Some("http://hl7.org/fhir/spdx-license"))
  case DEUTSCHE_FREIE_SOFTWARE_LIZENZ extends DEUTSCHE_FREIE_SOFTWARE_LIZENZ("D-FSL-1.0", Some("Deutsche Freie Software Lizenz"), Some("http://hl7.org/fhir/spdx-license"))
  case DIFFMARK extends DIFFMARK("diffmark", Some("diffmark license"), Some("http://hl7.org/fhir/spdx-license"))
  case DOC extends DOC("DOC", Some("DOC License"), Some("http://hl7.org/fhir/spdx-license"))
  case DOTSEQN extends DOTSEQN("Dotseqn", Some("Dotseqn License"), Some("http://hl7.org/fhir/spdx-license"))
  case DSDP extends DSDP("DSDP", Some("DSDP License"), Some("http://hl7.org/fhir/spdx-license"))
  case DVIPDFM extends DVIPDFM("dvipdfm", Some("dvipdfm License"), Some("http://hl7.org/fhir/spdx-license"))
  case ECLIPSE_PUBLIC_LICENSE_1_0 extends ECLIPSE_PUBLIC_LICENSE_1_0("EPL-1.0", Some("Eclipse Public License 1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case ECLIPSE_PUBLIC_LICENSE_2_0 extends ECLIPSE_PUBLIC_LICENSE_2_0("EPL-2.0", Some("Eclipse Public License 2.0"), Some("http://hl7.org/fhir/spdx-license"))
  case EDUCATIONAL_COMMUNITY_LICENSE_V1_0 extends EDUCATIONAL_COMMUNITY_LICENSE_V1_0("ECL-1.0", Some("Educational Community License v1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case EDUCATIONAL_COMMUNITY_LICENSE_V2_0 extends EDUCATIONAL_COMMUNITY_LICENSE_V2_0("ECL-2.0", Some("Educational Community License v2.0"), Some("http://hl7.org/fhir/spdx-license"))
  case EGENIX extends EGENIX("eGenix", Some("eGenix.com Public License 1.1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case EIFFEL_FORUM_LICENSE_V1_0 extends EIFFEL_FORUM_LICENSE_V1_0("EFL-1.0", Some("Eiffel Forum License v1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case EIFFEL_FORUM_LICENSE_V2_0 extends EIFFEL_FORUM_LICENSE_V2_0("EFL-2.0", Some("Eiffel Forum License v2.0"), Some("http://hl7.org/fhir/spdx-license"))
  case ENNA_LICENSE extends ENNA_LICENSE("MIT-enna", Some("enna License"), Some("http://hl7.org/fhir/spdx-license"))
  case ENTESSA extends ENTESSA("Entessa", Some("Entessa Public License v1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case ERLANG_PUBLIC_LICENSE_V1_1 extends ERLANG_PUBLIC_LICENSE_V1_1("ErlPL-1.1", Some("Erlang Public License v1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case EUDATAGRID extends EUDATAGRID("EUDatagrid", Some("EU DataGrid Software License"), Some("http://hl7.org/fhir/spdx-license"))
  case EUROPEAN_UNION_PUBLIC_LICENSE_1_0 extends EUROPEAN_UNION_PUBLIC_LICENSE_1_0("EUPL-1.0", Some("European Union Public License 1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case EUROPEAN_UNION_PUBLIC_LICENSE_1_1 extends EUROPEAN_UNION_PUBLIC_LICENSE_1_1("EUPL-1.1", Some("European Union Public License 1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case EUROPEAN_UNION_PUBLIC_LICENSE_1_2 extends EUROPEAN_UNION_PUBLIC_LICENSE_1_2("EUPL-1.2", Some("European Union Public License 1.2"), Some("http://hl7.org/fhir/spdx-license"))
  case EUROSYM extends EUROSYM("Eurosym", Some("Eurosym License"), Some("http://hl7.org/fhir/spdx-license"))
  case FAIR extends FAIR("Fair", Some("Fair License"), Some("http://hl7.org/fhir/spdx-license"))
  case FEH_LICENSE extends FEH_LICENSE("MIT-feh", Some("feh License"), Some("http://hl7.org/fhir/spdx-license"))
  case FRAMEWORX_OPEN_LICENSE_1_0 extends FRAMEWORX_OPEN_LICENSE_1_0("Frameworx-1.0", Some("Frameworx Open License 1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case FREEIMAGE extends FREEIMAGE("FreeImage", Some("FreeImage Public License v1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case FSFAP extends FSFAP("FSFAP", Some("FSF All Permissive License"), Some("http://hl7.org/fhir/spdx-license"))
  case FSFUL extends FSFUL("FSFUL", Some("FSF Unlimited License"), Some("http://hl7.org/fhir/spdx-license"))
  case FSFULLR extends FSFULLR("FSFULLR", Some("FSF Unlimited License (with License Retention)"), Some("http://hl7.org/fhir/spdx-license"))
  case FTL extends FTL("FTL", Some("Freetype Project License"), Some("http://hl7.org/fhir/spdx-license"))
  case GIFTWARE extends GIFTWARE("Giftware", Some("Giftware License"), Some("http://hl7.org/fhir/spdx-license"))
  case GL2PS extends GL2PS("GL2PS", Some("GL2PS License"), Some("http://hl7.org/fhir/spdx-license"))
  case GLIDE extends GLIDE("Glide", Some("3dfx Glide License"), Some("http://hl7.org/fhir/spdx-license"))
  case GLULXE extends GLULXE("Glulxe", Some("Glulxe License"), Some("http://hl7.org/fhir/spdx-license"))
  case GNUPLOT extends GNUPLOT("gnuplot", Some("gnuplot License"), Some("http://hl7.org/fhir/spdx-license"))
  case GNU_AFFERO_GENERAL_PUBLIC_LICENSE_V3_0_ONLY extends GNU_AFFERO_GENERAL_PUBLIC_LICENSE_V3_0_ONLY("AGPL-3.0-only", Some("GNU Affero General Public License v3.0 only"), Some("http://hl7.org/fhir/spdx-license"))
  case GNU_AFFERO_GENERAL_PUBLIC_LICENSE_V3_0_OR_LATER extends GNU_AFFERO_GENERAL_PUBLIC_LICENSE_V3_0_OR_LATER("AGPL-3.0-or-later", Some("GNU Affero General Public License v3.0 or later"), Some("http://hl7.org/fhir/spdx-license"))
  case GNU_FREE_DOCUMENTATION_LICENSE_V1_1_ONLY extends GNU_FREE_DOCUMENTATION_LICENSE_V1_1_ONLY("GFDL-1.1-only", Some("GNU Free Documentation License v1.1 only"), Some("http://hl7.org/fhir/spdx-license"))
  case GNU_FREE_DOCUMENTATION_LICENSE_V1_1_OR_LATER extends GNU_FREE_DOCUMENTATION_LICENSE_V1_1_OR_LATER("GFDL-1.1-or-later", Some("GNU Free Documentation License v1.1 or later"), Some("http://hl7.org/fhir/spdx-license"))
  case GNU_FREE_DOCUMENTATION_LICENSE_V1_2_ONLY extends GNU_FREE_DOCUMENTATION_LICENSE_V1_2_ONLY("GFDL-1.2-only", Some("GNU Free Documentation License v1.2 only"), Some("http://hl7.org/fhir/spdx-license"))
  case GNU_FREE_DOCUMENTATION_LICENSE_V1_2_OR_LATER extends GNU_FREE_DOCUMENTATION_LICENSE_V1_2_OR_LATER("GFDL-1.2-or-later", Some("GNU Free Documentation License v1.2 or later"), Some("http://hl7.org/fhir/spdx-license"))
  case GNU_FREE_DOCUMENTATION_LICENSE_V1_3_ONLY extends GNU_FREE_DOCUMENTATION_LICENSE_V1_3_ONLY("GFDL-1.3-only", Some("GNU Free Documentation License v1.3 only"), Some("http://hl7.org/fhir/spdx-license"))
  case GNU_FREE_DOCUMENTATION_LICENSE_V1_3_OR_LATER extends GNU_FREE_DOCUMENTATION_LICENSE_V1_3_OR_LATER("GFDL-1.3-or-later", Some("GNU Free Documentation License v1.3 or later"), Some("http://hl7.org/fhir/spdx-license"))
  case GNU_GENERAL_PUBLIC_LICENSE_V1_0_ONLY extends GNU_GENERAL_PUBLIC_LICENSE_V1_0_ONLY("GPL-1.0-only", Some("GNU General Public License v1.0 only"), Some("http://hl7.org/fhir/spdx-license"))
  case GNU_GENERAL_PUBLIC_LICENSE_V1_0_OR_LATER extends GNU_GENERAL_PUBLIC_LICENSE_V1_0_OR_LATER("GPL-1.0-or-later", Some("GNU General Public License v1.0 or later"), Some("http://hl7.org/fhir/spdx-license"))
  case GNU_GENERAL_PUBLIC_LICENSE_V2_0_ONLY extends GNU_GENERAL_PUBLIC_LICENSE_V2_0_ONLY("GPL-2.0-only", Some("GNU General Public License v2.0 only"), Some("http://hl7.org/fhir/spdx-license"))
  case GNU_GENERAL_PUBLIC_LICENSE_V2_0_OR_LATER extends GNU_GENERAL_PUBLIC_LICENSE_V2_0_OR_LATER("GPL-2.0-or-later", Some("GNU General Public License v2.0 or later"), Some("http://hl7.org/fhir/spdx-license"))
  case GNU_GENERAL_PUBLIC_LICENSE_V3_0_ONLY extends GNU_GENERAL_PUBLIC_LICENSE_V3_0_ONLY("GPL-3.0-only", Some("GNU General Public License v3.0 only"), Some("http://hl7.org/fhir/spdx-license"))
  case GNU_GENERAL_PUBLIC_LICENSE_V3_0_OR_LATER extends GNU_GENERAL_PUBLIC_LICENSE_V3_0_OR_LATER("GPL-3.0-or-later", Some("GNU General Public License v3.0 or later"), Some("http://hl7.org/fhir/spdx-license"))
  case GNU_LESSER_GENERAL_PUBLIC_LICENSE_V2_1_ONLY extends GNU_LESSER_GENERAL_PUBLIC_LICENSE_V2_1_ONLY("LGPL-2.1-only", Some("GNU Lesser General Public License v2.1 only"), Some("http://hl7.org/fhir/spdx-license"))
  case GNU_LESSER_GENERAL_PUBLIC_LICENSE_V2_1_OR_LATER extends GNU_LESSER_GENERAL_PUBLIC_LICENSE_V2_1_OR_LATER("LGPL-2.1-or-later", Some("GNU Lesser General Public License v2.1 or later"), Some("http://hl7.org/fhir/spdx-license"))
  case GNU_LESSER_GENERAL_PUBLIC_LICENSE_V3_0_ONLY extends GNU_LESSER_GENERAL_PUBLIC_LICENSE_V3_0_ONLY("LGPL-3.0-only", Some("GNU Lesser General Public License v3.0 only"), Some("http://hl7.org/fhir/spdx-license"))
  case GNU_LESSER_GENERAL_PUBLIC_LICENSE_V3_0_OR_LATER extends GNU_LESSER_GENERAL_PUBLIC_LICENSE_V3_0_OR_LATER("LGPL-3.0-or-later", Some("GNU Lesser General Public License v3.0 or later"), Some("http://hl7.org/fhir/spdx-license"))
  case GNU_LIBRARY_GENERAL_PUBLIC_LICENSE_V2_ONLY extends GNU_LIBRARY_GENERAL_PUBLIC_LICENSE_V2_ONLY("LGPL-2.0-only", Some("GNU Library General Public License v2 only"), Some("http://hl7.org/fhir/spdx-license"))
  case GNU_LIBRARY_GENERAL_PUBLIC_LICENSE_V2_OR_LATER extends GNU_LIBRARY_GENERAL_PUBLIC_LICENSE_V2_OR_LATER("LGPL-2.0-or-later", Some("GNU Library General Public License v2 or later"), Some("http://hl7.org/fhir/spdx-license"))
  case GSOAP_PUBLIC_LICENSE_V1_3B extends GSOAP_PUBLIC_LICENSE_V1_3B("gSOAP-1.3b", Some("gSOAP Public License v1.3b"), Some("http://hl7.org/fhir/spdx-license"))
  case HASKELLREPORT extends HASKELLREPORT("HaskellReport", Some("Haskell Language Report License"), Some("http://hl7.org/fhir/spdx-license"))
  case HPND extends HPND("HPND", Some("Historical Permission Notice and Disclaimer"), Some("http://hl7.org/fhir/spdx-license"))
  case IBM_POWERPC_INITIALIZATION_AND_BOOT_SOFTWARE extends IBM_POWERPC_INITIALIZATION_AND_BOOT_SOFTWARE("IBM-pibs", Some("IBM PowerPC Initialization and Boot Software"), Some("http://hl7.org/fhir/spdx-license"))
  case IBM_PUBLIC_LICENSE_V1_0 extends IBM_PUBLIC_LICENSE_V1_0("IPL-1.0", Some("IBM Public License v1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case ICU extends ICU("ICU", Some("ICU License"), Some("http://hl7.org/fhir/spdx-license"))
  case IJG extends IJG("IJG", Some("Independent JPEG Group License"), Some("http://hl7.org/fhir/spdx-license"))
  case IMAGEMAGICK extends IMAGEMAGICK("ImageMagick", Some("ImageMagick License"), Some("http://hl7.org/fhir/spdx-license"))
  case IMATIX extends IMATIX("iMatix", Some("iMatix Standard Function Library Agreement"), Some("http://hl7.org/fhir/spdx-license"))
  case IMLIB2 extends IMLIB2("Imlib2", Some("Imlib2 License"), Some("http://hl7.org/fhir/spdx-license"))
  case INFO_ZIP_LICENSE extends INFO_ZIP_LICENSE("Info-ZIP", Some("Info-ZIP License"), Some("http://hl7.org/fhir/spdx-license"))
  case INTEL extends INTEL("Intel", Some("Intel Open Source License"), Some("http://hl7.org/fhir/spdx-license"))
  case INTEL_ACPI_SOFTWARE_LICENSE_AGREEMENT extends INTEL_ACPI_SOFTWARE_LICENSE_AGREEMENT("Intel-ACPI", Some("Intel ACPI Software License Agreement"), Some("http://hl7.org/fhir/spdx-license"))
  case INTERBASE_PUBLIC_LICENSE_V1_0 extends INTERBASE_PUBLIC_LICENSE_V1_0("Interbase-1.0", Some("Interbase Public License v1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case IPA extends IPA("IPA", Some("IPA Font License"), Some("http://hl7.org/fhir/spdx-license"))
  case ISC extends ISC("ISC", Some("ISC License"), Some("http://hl7.org/fhir/spdx-license"))
  case JASPER_LICENSE extends JASPER_LICENSE("JasPer-2.0", Some("JasPer License"), Some("http://hl7.org/fhir/spdx-license"))
  case JSON extends JSON("JSON", Some("JSON License"), Some("http://hl7.org/fhir/spdx-license"))
  case LATEX2E extends LATEX2E("Latex2e", Some("Latex2e License"), Some("http://hl7.org/fhir/spdx-license"))
  case LATEX_PROJECT_PUBLIC_LICENSE_V1_0 extends LATEX_PROJECT_PUBLIC_LICENSE_V1_0("LPPL-1.0", Some("LaTeX Project Public License v1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case LATEX_PROJECT_PUBLIC_LICENSE_V1_1 extends LATEX_PROJECT_PUBLIC_LICENSE_V1_1("LPPL-1.1", Some("LaTeX Project Public License v1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case LATEX_PROJECT_PUBLIC_LICENSE_V1_2 extends LATEX_PROJECT_PUBLIC_LICENSE_V1_2("LPPL-1.2", Some("LaTeX Project Public License v1.2"), Some("http://hl7.org/fhir/spdx-license"))
  case LATEX_PROJECT_PUBLIC_LICENSE_V1_3A extends LATEX_PROJECT_PUBLIC_LICENSE_V1_3A("LPPL-1.3a", Some("LaTeX Project Public License v1.3a"), Some("http://hl7.org/fhir/spdx-license"))
  case LATEX_PROJECT_PUBLIC_LICENSE_V1_3C extends LATEX_PROJECT_PUBLIC_LICENSE_V1_3C("LPPL-1.3c", Some("LaTeX Project Public License v1.3c"), Some("http://hl7.org/fhir/spdx-license"))
  case LAWRENCE_BERKELEY_NATIONAL_LABS_BSD_VARIANT_LICENSE extends LAWRENCE_BERKELEY_NATIONAL_LABS_BSD_VARIANT_LICENSE("BSD-3-Clause-LBNL", Some("Lawrence Berkeley National Labs BSD variant license"), Some("http://hl7.org/fhir/spdx-license"))
  case LEPTONICA extends LEPTONICA("Leptonica", Some("Leptonica License"), Some("http://hl7.org/fhir/spdx-license"))
  case LGPLLR extends LGPLLR("LGPLLR", Some("Lesser General Public License For Linguistic Resources"), Some("http://hl7.org/fhir/spdx-license"))
  case LIBPNG extends LIBPNG("Libpng", Some("libpng License"), Some("http://hl7.org/fhir/spdx-license"))
  case LIBTIFF extends LIBTIFF("libtiff", Some("libtiff License"), Some("http://hl7.org/fhir/spdx-license"))
  case LICENCE_ART_LIBRE_1_2 extends LICENCE_ART_LIBRE_1_2("LAL-1.2", Some("Licence Art Libre 1.2"), Some("http://hl7.org/fhir/spdx-license"))
  case LICENCE_ART_LIBRE_1_3 extends LICENCE_ART_LIBRE_1_3("LAL-1.3", Some("Licence Art Libre 1.3"), Some("http://hl7.org/fhir/spdx-license"))
  case LILIQ_P_11 extends LILIQ_P_11("LiLiQ-P-1.1", Some("Licence Libre du Québec – Permissive version 1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case LILIQ_RPLUS_11 extends LILIQ_RPLUS_11("LiLiQ-Rplus-1.1", Some("Licence Libre du Québec – Réciprocité forte version 1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case LILIQ_R_11 extends LILIQ_R_11("LiLiQ-R-1.1", Some("Licence Libre du Québec – Réciprocité version 1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case LINUX_KERNEL_VARIANT_OF_OPENIB_ORG_LICENSE extends LINUX_KERNEL_VARIANT_OF_OPENIB_ORG_LICENSE("Linux-OpenIB", Some("Linux Kernel Variant of OpenIB.org license"), Some("http://hl7.org/fhir/spdx-license"))
  case LUCENT_PUBLIC_LICENSE_V1_02 extends LUCENT_PUBLIC_LICENSE_V1_02("LPL-1.02", Some("Lucent Public License v1.02"), Some("http://hl7.org/fhir/spdx-license"))
  case LUCENT_PUBLIC_LICENSE_VERSION_1_0 extends LUCENT_PUBLIC_LICENSE_VERSION_1_0("LPL-1.0", Some("Lucent Public License Version 1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case MAKEINDEX extends MAKEINDEX("MakeIndex", Some("MakeIndex License"), Some("http://hl7.org/fhir/spdx-license"))
  case MICROSOFT_PUBLIC_LICENSE extends MICROSOFT_PUBLIC_LICENSE("MS-PL", Some("Microsoft Public License"), Some("http://hl7.org/fhir/spdx-license"))
  case MICROSOFT_RECIPROCAL_LICENSE extends MICROSOFT_RECIPROCAL_LICENSE("MS-RL", Some("Microsoft Reciprocal License"), Some("http://hl7.org/fhir/spdx-license"))
  case MIROS extends MIROS("MirOS", Some("MirOS License"), Some("http://hl7.org/fhir/spdx-license"))
  case MIT extends MIT("MIT", Some("MIT License"), Some("http://hl7.org/fhir/spdx-license"))
  case MITNFA extends MITNFA("MITNFA", Some("MIT +no-false-attribs license"), Some("http://hl7.org/fhir/spdx-license"))
  case MIT_ADVERTISING extends MIT_ADVERTISING("MIT-advertising", Some("Enlightenment License (e16)"), Some("http://hl7.org/fhir/spdx-license"))
  case MIT_NO_ATTRIBUTION extends MIT_NO_ATTRIBUTION("MIT-0", Some("MIT No Attribution"), Some("http://hl7.org/fhir/spdx-license"))
  case MOTOSOTO extends MOTOSOTO("Motosoto", Some("Motosoto License"), Some("http://hl7.org/fhir/spdx-license"))
  case MOZILLA_PUBLIC_LICENSE_1_0 extends MOZILLA_PUBLIC_LICENSE_1_0("MPL-1.0", Some("Mozilla Public License 1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case MOZILLA_PUBLIC_LICENSE_1_1 extends MOZILLA_PUBLIC_LICENSE_1_1("MPL-1.1", Some("Mozilla Public License 1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case MOZILLA_PUBLIC_LICENSE_2_0 extends MOZILLA_PUBLIC_LICENSE_2_0("MPL-2.0", Some("Mozilla Public License 2.0"), Some("http://hl7.org/fhir/spdx-license"))
  case MPICH2 extends MPICH2("mpich2", Some("mpich2 License"), Some("http://hl7.org/fhir/spdx-license"))
  case MPL_20_NO_COPYLEFT_EXCEPTION extends MPL_20_NO_COPYLEFT_EXCEPTION("MPL-2.0-no-copyleft-exception", Some("Mozilla Public License 2.0 (no copyleft exception)"), Some("http://hl7.org/fhir/spdx-license"))
  case MTLL extends MTLL("MTLL", Some("Matrix Template Library License"), Some("http://hl7.org/fhir/spdx-license"))
  case MULTICS extends MULTICS("Multics", Some("Multics License"), Some("http://hl7.org/fhir/spdx-license"))
  case MUP extends MUP("Mup", Some("Mup License"), Some("http://hl7.org/fhir/spdx-license"))
  case NASA_OPEN_SOURCE_AGREEMENT_1_3 extends NASA_OPEN_SOURCE_AGREEMENT_1_3("NASA-1.3", Some("NASA Open Source Agreement 1.3"), Some("http://hl7.org/fhir/spdx-license"))
  case NAUMEN extends NAUMEN("Naumen", Some("Naumen Public License"), Some("http://hl7.org/fhir/spdx-license"))
  case NCSA extends NCSA("NCSA", Some("University of Illinois/NCSA Open Source License"), Some("http://hl7.org/fhir/spdx-license"))
  case NETCDF extends NETCDF("NetCDF", Some("NetCDF license"), Some("http://hl7.org/fhir/spdx-license"))
  case NETSCAPE_PUBLIC_LICENSE_V1_0 extends NETSCAPE_PUBLIC_LICENSE_V1_0("NPL-1.0", Some("Netscape Public License v1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case NETSCAPE_PUBLIC_LICENSE_V1_1 extends NETSCAPE_PUBLIC_LICENSE_V1_1("NPL-1.1", Some("Netscape Public License v1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case NET_BOOLEAN_PUBLIC_LICENSE_V1 extends NET_BOOLEAN_PUBLIC_LICENSE_V1("NBPL-1.0", Some("Net Boolean Public License v1"), Some("http://hl7.org/fhir/spdx-license"))
  case NET_SNMP_LICENSE extends NET_SNMP_LICENSE("Net-SNMP", Some("Net-SNMP License"), Some("http://hl7.org/fhir/spdx-license"))
  case NEWSLETR extends NEWSLETR("Newsletr", Some("Newsletr License"), Some("http://hl7.org/fhir/spdx-license"))
  case NGPL extends NGPL("NGPL", Some("Nethack General Public License"), Some("http://hl7.org/fhir/spdx-license"))
  case NLPL extends NLPL("NLPL", Some("No Limit Public License"), Some("http://hl7.org/fhir/spdx-license"))
  case NOKIA extends NOKIA("Nokia", Some("Nokia Open Source License"), Some("http://hl7.org/fhir/spdx-license"))
  case NON_PROFIT_OPEN_SOFTWARE_LICENSE_3_0 extends NON_PROFIT_OPEN_SOFTWARE_LICENSE_3_0("NPOSL-3.0", Some("Non-Profit Open Software License 3.0"), Some("http://hl7.org/fhir/spdx-license"))
  case NORWEGIAN_LICENCE_FOR_OPEN_GOVERNMENT_DATA extends NORWEGIAN_LICENCE_FOR_OPEN_GOVERNMENT_DATA("NLOD-1.0", Some("Norwegian Licence for Open Government Data"), Some("http://hl7.org/fhir/spdx-license"))
  case NOSL extends NOSL("NOSL", Some("Netizen Open Source License"), Some("http://hl7.org/fhir/spdx-license"))
  case NOT_OPEN_SOURCE extends NOT_OPEN_SOURCE("not-open-source", Some("Not open source"), Some("http://hl7.org/fhir/spdx-license"))
  case NOWEB extends NOWEB("Noweb", Some("Noweb License"), Some("http://hl7.org/fhir/spdx-license"))
  case NRL extends NRL("NRL", Some("NRL License"), Some("http://hl7.org/fhir/spdx-license"))
  case NTP extends NTP("NTP", Some("NTP License"), Some("http://hl7.org/fhir/spdx-license"))
  case OCLC_RESEARCH_PUBLIC_LICENSE_2_0 extends OCLC_RESEARCH_PUBLIC_LICENSE_2_0("OCLC-2.0", Some("OCLC Research Public License 2.0"), Some("http://hl7.org/fhir/spdx-license"))
  case ODC_OPEN_DATABASE_LICENSE_V1_0 extends ODC_OPEN_DATABASE_LICENSE_V1_0("ODbL-1.0", Some("ODC Open Database License v1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case OGTSL extends OGTSL("OGTSL", Some("Open Group Test Suite License"), Some("http://hl7.org/fhir/spdx-license"))
  case OLDAP_20 extends OLDAP_20("OLDAP-2.0", Some("Open LDAP Public License v2.0 (or possibly 2.0A and 2.0B)"), Some("http://hl7.org/fhir/spdx-license"))
  case OML extends OML("OML", Some("Open Market License"), Some("http://hl7.org/fhir/spdx-license"))
  case OPENSSL extends OPENSSL("OpenSSL", Some("OpenSSL License"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_CASCADE_TECHNOLOGY_PUBLIC_LICENSE extends OPEN_CASCADE_TECHNOLOGY_PUBLIC_LICENSE("OCCT-PL", Some("Open CASCADE Technology Public License"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_LDAP_PUBLIC_LICENSE_2_2_2 extends OPEN_LDAP_PUBLIC_LICENSE_2_2_2("OLDAP-2.2.2", Some("Open LDAP Public License 2.2.2"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_LDAP_PUBLIC_LICENSE_V1_1 extends OPEN_LDAP_PUBLIC_LICENSE_V1_1("OLDAP-1.1", Some("Open LDAP Public License v1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_LDAP_PUBLIC_LICENSE_V1_2 extends OPEN_LDAP_PUBLIC_LICENSE_V1_2("OLDAP-1.2", Some("Open LDAP Public License v1.2"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_LDAP_PUBLIC_LICENSE_V1_3 extends OPEN_LDAP_PUBLIC_LICENSE_V1_3("OLDAP-1.3", Some("Open LDAP Public License v1.3"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_LDAP_PUBLIC_LICENSE_V1_4 extends OPEN_LDAP_PUBLIC_LICENSE_V1_4("OLDAP-1.4", Some("Open LDAP Public License v1.4"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_LDAP_PUBLIC_LICENSE_V2_0_1 extends OPEN_LDAP_PUBLIC_LICENSE_V2_0_1("OLDAP-2.0.1", Some("Open LDAP Public License v2.0.1"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_LDAP_PUBLIC_LICENSE_V2_1 extends OPEN_LDAP_PUBLIC_LICENSE_V2_1("OLDAP-2.1", Some("Open LDAP Public License v2.1"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_LDAP_PUBLIC_LICENSE_V2_2 extends OPEN_LDAP_PUBLIC_LICENSE_V2_2("OLDAP-2.2", Some("Open LDAP Public License v2.2"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_LDAP_PUBLIC_LICENSE_V2_2_1 extends OPEN_LDAP_PUBLIC_LICENSE_V2_2_1("OLDAP-2.2.1", Some("Open LDAP Public License v2.2.1"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_LDAP_PUBLIC_LICENSE_V2_3 extends OPEN_LDAP_PUBLIC_LICENSE_V2_3("OLDAP-2.3", Some("Open LDAP Public License v2.3"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_LDAP_PUBLIC_LICENSE_V2_4 extends OPEN_LDAP_PUBLIC_LICENSE_V2_4("OLDAP-2.4", Some("Open LDAP Public License v2.4"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_LDAP_PUBLIC_LICENSE_V2_5 extends OPEN_LDAP_PUBLIC_LICENSE_V2_5("OLDAP-2.5", Some("Open LDAP Public License v2.5"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_LDAP_PUBLIC_LICENSE_V2_6 extends OPEN_LDAP_PUBLIC_LICENSE_V2_6("OLDAP-2.6", Some("Open LDAP Public License v2.6"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_LDAP_PUBLIC_LICENSE_V2_7 extends OPEN_LDAP_PUBLIC_LICENSE_V2_7("OLDAP-2.7", Some("Open LDAP Public License v2.7"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_LDAP_PUBLIC_LICENSE_V2_8 extends OPEN_LDAP_PUBLIC_LICENSE_V2_8("OLDAP-2.8", Some("Open LDAP Public License v2.8"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_PUBLIC_LICENSE_V1_0 extends OPEN_PUBLIC_LICENSE_V1_0("OPL-1.0", Some("Open Public License v1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_SOFTWARE_LICENSE_1_0 extends OPEN_SOFTWARE_LICENSE_1_0("OSL-1.0", Some("Open Software License 1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_SOFTWARE_LICENSE_1_1 extends OPEN_SOFTWARE_LICENSE_1_1("OSL-1.1", Some("Open Software License 1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_SOFTWARE_LICENSE_2_0 extends OPEN_SOFTWARE_LICENSE_2_0("OSL-2.0", Some("Open Software License 2.0"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_SOFTWARE_LICENSE_2_1 extends OPEN_SOFTWARE_LICENSE_2_1("OSL-2.1", Some("Open Software License 2.1"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_SOFTWARE_LICENSE_3_0 extends OPEN_SOFTWARE_LICENSE_3_0("OSL-3.0", Some("Open Software License 3.0"), Some("http://hl7.org/fhir/spdx-license"))
  case OSET_PUBLIC_LICENSE_VERSION_2_1 extends OSET_PUBLIC_LICENSE_VERSION_2_1("OSET-PL-2.1", Some("OSET Public License version 2.1"), Some("http://hl7.org/fhir/spdx-license"))
  case PDDL_10 extends PDDL_10("PDDL-1.0", Some("ODC Public Domain Dedication & License 1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case PHP_LICENSE_V3_0 extends PHP_LICENSE_V3_0("PHP-3.0", Some("PHP License v3.0"), Some("http://hl7.org/fhir/spdx-license"))
  case PHP_LICENSE_V3_01 extends PHP_LICENSE_V3_01("PHP-3.01", Some("PHP License v3.01"), Some("http://hl7.org/fhir/spdx-license"))
  case PLEXUS extends PLEXUS("Plexus", Some("Plexus Classworlds License"), Some("http://hl7.org/fhir/spdx-license"))
  case POSTGRESQL extends POSTGRESQL("PostgreSQL", Some("PostgreSQL License"), Some("http://hl7.org/fhir/spdx-license"))
  case PSFRAG extends PSFRAG("psfrag", Some("psfrag License"), Some("http://hl7.org/fhir/spdx-license"))
  case PSUTILS extends PSUTILS("psutils", Some("psutils License"), Some("http://hl7.org/fhir/spdx-license"))
  case PYTHON_LICENSE_2_0 extends PYTHON_LICENSE_2_0("Python-2.0", Some("Python License 2.0"), Some("http://hl7.org/fhir/spdx-license"))
  case QHULL extends QHULL("Qhull", Some("Qhull License"), Some("http://hl7.org/fhir/spdx-license"))
  case Q_PUBLIC_LICENSE_1_0 extends Q_PUBLIC_LICENSE_1_0("QPL-1.0", Some("Q Public License 1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case RDISC extends RDISC("Rdisc", Some("Rdisc License"), Some("http://hl7.org/fhir/spdx-license"))
  case REALNETWORKS_PUBLIC_SOURCE_LICENSE_V1_0 extends REALNETWORKS_PUBLIC_SOURCE_LICENSE_V1_0("RPSL-1.0", Some("RealNetworks Public Source License v1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case RECIPROCAL_PUBLIC_LICENSE_1_1 extends RECIPROCAL_PUBLIC_LICENSE_1_1("RPL-1.1", Some("Reciprocal Public License 1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case RECIPROCAL_PUBLIC_LICENSE_1_5 extends RECIPROCAL_PUBLIC_LICENSE_1_5("RPL-1.5", Some("Reciprocal Public License 1.5"), Some("http://hl7.org/fhir/spdx-license"))
  case RED_HAT_ECOS_PUBLIC_LICENSE_V1_1 extends RED_HAT_ECOS_PUBLIC_LICENSE_V1_1("RHeCos-1.1", Some("Red Hat eCos Public License v1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case RSA_MESSAGE_DIGEST_LICENSE extends RSA_MESSAGE_DIGEST_LICENSE("RSA-MD", Some("RSA Message-Digest License"), Some("http://hl7.org/fhir/spdx-license"))
  case RSCPL extends RSCPL("RSCPL", Some("Ricoh Source Code Public License"), Some("http://hl7.org/fhir/spdx-license"))
  case RUBY extends RUBY("Ruby", Some("Ruby License"), Some("http://hl7.org/fhir/spdx-license"))
  case SAXPATH extends SAXPATH("Saxpath", Some("Saxpath License"), Some("http://hl7.org/fhir/spdx-license"))
  case SAX_PUBLIC_DOMAIN_NOTICE extends SAX_PUBLIC_DOMAIN_NOTICE("SAX-PD", Some("Sax Public Domain Notice"), Some("http://hl7.org/fhir/spdx-license"))
  case SCEA extends SCEA("SCEA", Some("SCEA Shared Source License"), Some("http://hl7.org/fhir/spdx-license"))
  case SENDMAIL extends SENDMAIL("Sendmail", Some("Sendmail License"), Some("http://hl7.org/fhir/spdx-license"))
  case SGI_FREE_SOFTWARE_LICENSE_B_V1_0 extends SGI_FREE_SOFTWARE_LICENSE_B_V1_0("SGI-B-1.0", Some("SGI Free Software License B v1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case SGI_FREE_SOFTWARE_LICENSE_B_V1_1 extends SGI_FREE_SOFTWARE_LICENSE_B_V1_1("SGI-B-1.1", Some("SGI Free Software License B v1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case SGI_FREE_SOFTWARE_LICENSE_B_V2_0 extends SGI_FREE_SOFTWARE_LICENSE_B_V2_0("SGI-B-2.0", Some("SGI Free Software License B v2.0"), Some("http://hl7.org/fhir/spdx-license"))
  case SIL_OPEN_FONT_LICENSE_1_0 extends SIL_OPEN_FONT_LICENSE_1_0("OFL-1.0", Some("SIL Open Font License 1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case SIL_OPEN_FONT_LICENSE_1_1 extends SIL_OPEN_FONT_LICENSE_1_1("OFL-1.1", Some("SIL Open Font License 1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case SIMPLE_PUBLIC_LICENSE_2_0 extends SIMPLE_PUBLIC_LICENSE_2_0("SimPL-2.0", Some("Simple Public License 2.0"), Some("http://hl7.org/fhir/spdx-license"))
  case SISSL extends SISSL("SISSL", Some("Sun Industry Standards Source License v1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case SLEEPYCAT extends SLEEPYCAT("Sleepycat", Some("Sleepycat License"), Some("http://hl7.org/fhir/spdx-license"))
  case SMLNJ extends SMLNJ("SMLNJ", Some("Standard ML of New Jersey License"), Some("http://hl7.org/fhir/spdx-license"))
  case SMPPL extends SMPPL("SMPPL", Some("Secure Messaging Protocol Public License"), Some("http://hl7.org/fhir/spdx-license"))
  case SNIA extends SNIA("SNIA", Some("SNIA Public License 1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case SPENCER_LICENSE_86 extends SPENCER_LICENSE_86("Spencer-86", Some("Spencer License 86"), Some("http://hl7.org/fhir/spdx-license"))
  case SPENCER_LICENSE_94 extends SPENCER_LICENSE_94("Spencer-94", Some("Spencer License 94"), Some("http://hl7.org/fhir/spdx-license"))
  case SPENCER_LICENSE_99 extends SPENCER_LICENSE_99("Spencer-99", Some("Spencer License 99"), Some("http://hl7.org/fhir/spdx-license"))
  case SUGARCRM_PUBLIC_LICENSE_V1_1_3 extends SUGARCRM_PUBLIC_LICENSE_V1_1_3("SugarCRM-1.1.3", Some("SugarCRM Public License v1.1.3"), Some("http://hl7.org/fhir/spdx-license"))
  case SUN_INDUSTRY_STANDARDS_SOURCE_LICENSE_V1_2 extends SUN_INDUSTRY_STANDARDS_SOURCE_LICENSE_V1_2("SISSL-1.2", Some("Sun Industry Standards Source License v1.2"), Some("http://hl7.org/fhir/spdx-license"))
  case SUN_PUBLIC_LICENSE_V1_0 extends SUN_PUBLIC_LICENSE_V1_0("SPL-1.0", Some("Sun Public License v1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case SWL extends SWL("SWL", Some("Scheme Widget Library (SWL) Software License Agreement"), Some("http://hl7.org/fhir/spdx-license"))
  case SYBASE_OPEN_WATCOM_PUBLIC_LICENSE_1_0 extends SYBASE_OPEN_WATCOM_PUBLIC_LICENSE_1_0("Watcom-1.0", Some("Sybase Open Watcom Public License 1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case TCL extends TCL("TCL", Some("TCL/TK License"), Some("http://hl7.org/fhir/spdx-license"))
  case TCP_WRAPPERS_LICENSE extends TCP_WRAPPERS_LICENSE("TCP-wrappers", Some("TCP Wrappers License"), Some("http://hl7.org/fhir/spdx-license"))
  case TMATE extends TMATE("TMate", Some("TMate Open Source License"), Some("http://hl7.org/fhir/spdx-license"))
  case TORQUE_11 extends TORQUE_11("TORQUE-1.1", Some("TORQUE v2.5+ Software License v1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case TOSL extends TOSL("TOSL", Some("Trusster Open Source License"), Some("http://hl7.org/fhir/spdx-license"))
  case UNICODE_DFS_2015 extends UNICODE_DFS_2015("Unicode-DFS-2015", Some("Unicode License Agreement - Data Files and Software (2015)"), Some("http://hl7.org/fhir/spdx-license"))
  case UNICODE_DFS_2016 extends UNICODE_DFS_2016("Unicode-DFS-2016", Some("Unicode License Agreement - Data Files and Software (2016)"), Some("http://hl7.org/fhir/spdx-license"))
  case UNICODE_TERMS_OF_USE extends UNICODE_TERMS_OF_USE("Unicode-TOU", Some("Unicode Terms of Use"), Some("http://hl7.org/fhir/spdx-license"))
  case UNIVERSAL_PERMISSIVE_LICENSE_V1_0 extends UNIVERSAL_PERMISSIVE_LICENSE_V1_0("UPL-1.0", Some("Universal Permissive License v1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case UNLICENSE extends UNLICENSE("Unlicense", Some("The Unlicense"), Some("http://hl7.org/fhir/spdx-license"))
  case VIM extends VIM("Vim", Some("Vim License"), Some("http://hl7.org/fhir/spdx-license"))
  case VOSTROM extends VOSTROM("VOSTROM", Some("VOSTROM Public License for Open Source"), Some("http://hl7.org/fhir/spdx-license"))
  case VOVIDA_SOFTWARE_LICENSE_V1_0 extends VOVIDA_SOFTWARE_LICENSE_V1_0("VSL-1.0", Some("Vovida Software License v1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case W3C extends W3C("W3C", Some("W3C Software Notice and License (2002-12-31)"), Some("http://hl7.org/fhir/spdx-license"))
  case W3C_19980720 extends W3C_19980720("W3C-19980720", Some("W3C Software Notice and License (1998-07-20)"), Some("http://hl7.org/fhir/spdx-license"))
  case W3C_20150513 extends W3C_20150513("W3C-20150513", Some("W3C Software Notice and Document License (2015-05-13)"), Some("http://hl7.org/fhir/spdx-license"))
  case WSUIPA extends WSUIPA("Wsuipa", Some("Wsuipa License"), Some("http://hl7.org/fhir/spdx-license"))
  case WTFPL extends WTFPL("WTFPL", Some("Do What The F*ck You Want To Public License"), Some("http://hl7.org/fhir/spdx-license"))
  case X11 extends X11("X11", Some("X11 License"), Some("http://hl7.org/fhir/spdx-license"))
  case XEROX extends XEROX("Xerox", Some("Xerox License"), Some("http://hl7.org/fhir/spdx-license"))
  case XFREE86_LICENSE_1_1 extends XFREE86_LICENSE_1_1("XFree86-1.1", Some("XFree86 License 1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case XINETD extends XINETD("xinetd", Some("xinetd License"), Some("http://hl7.org/fhir/spdx-license"))
  case XNET extends XNET("Xnet", Some("X.Net License"), Some("http://hl7.org/fhir/spdx-license"))
  case XPP extends XPP("xpp", Some("XPP License"), Some("http://hl7.org/fhir/spdx-license"))
  case XSKAT extends XSKAT("XSkat", Some("XSkat License"), Some("http://hl7.org/fhir/spdx-license"))
  case YPL_10 extends YPL_10("YPL-1.0", Some("Yahoo! Public License v1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case YPL_11 extends YPL_11("YPL-1.1", Some("Yahoo! Public License v1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case ZED extends ZED("Zed", Some("Zed License"), Some("http://hl7.org/fhir/spdx-license"))
  case ZEND_LICENSE_V2_0 extends ZEND_LICENSE_V2_0("Zend-2.0", Some("Zend License v2.0"), Some("http://hl7.org/fhir/spdx-license"))
  case ZIMBRA_PUBLIC_LICENSE_V1_3 extends ZIMBRA_PUBLIC_LICENSE_V1_3("Zimbra-1.3", Some("Zimbra Public License v1.3"), Some("http://hl7.org/fhir/spdx-license"))
  case ZIMBRA_PUBLIC_LICENSE_V1_4 extends ZIMBRA_PUBLIC_LICENSE_V1_4("Zimbra-1.4", Some("Zimbra Public License v1.4"), Some("http://hl7.org/fhir/spdx-license"))
  case ZLIB extends ZLIB("Zlib", Some("zlib License"), Some("http://hl7.org/fhir/spdx-license"))
  case ZLIB_ACKNOWLEDGEMENT extends ZLIB_ACKNOWLEDGEMENT("zlib-acknowledgement", Some("zlib/libpng License with Acknowledgement"), Some("http://hl7.org/fhir/spdx-license"))
  case ZOPE_PUBLIC_LICENSE_1_1 extends ZOPE_PUBLIC_LICENSE_1_1("ZPL-1.1", Some("Zope Public License 1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case ZOPE_PUBLIC_LICENSE_2_0 extends ZOPE_PUBLIC_LICENSE_2_0("ZPL-2.0", Some("Zope Public License 2.0"), Some("http://hl7.org/fhir/spdx-license"))
  case ZOPE_PUBLIC_LICENSE_2_1 extends ZOPE_PUBLIC_LICENSE_2_1("ZPL-2.1", Some("Zope Public License 2.1"), Some("http://hl7.org/fhir/spdx-license"))
}
object SPDX_LICENSE extends EType[SPDX_LICENSE]("http://hl7.org/fhir/ValueSet/spdx-license") 


enum SPECIMEN_CONTAINED_PREFERENCE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ALTERNATE extends ALTERNATE("alternate", Some("Alternate"), Some("http://hl7.org/fhir/specimen-contained-preference"))
  case PREFERRED extends PREFERRED("preferred", Some("Preferred"), Some("http://hl7.org/fhir/specimen-contained-preference"))
}
object SPECIMEN_CONTAINED_PREFERENCE extends EType[SPECIMEN_CONTAINED_PREFERENCE]("http://hl7.org/fhir/ValueSet/specimen-contained-preference") 


enum SPECIMEN_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case AVAILABLE extends AVAILABLE("available", Some("Available"), Some("http://hl7.org/fhir/specimen-status"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/specimen-status"))
  case UNAVAILABLE extends UNAVAILABLE("unavailable", Some("Unavailable"), Some("http://hl7.org/fhir/specimen-status"))
  case UNSATISFACTORY extends UNSATISFACTORY("unsatisfactory", Some("Unsatisfactory"), Some("http://hl7.org/fhir/specimen-status"))
}
object SPECIMEN_STATUS extends EType[SPECIMEN_STATUS]("http://hl7.org/fhir/ValueSet/specimen-status") 


enum STRAND_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case CRICK extends CRICK("crick", Some("Crick strand of referenceSeq"), Some("http://hl7.org/fhir/strand-type"))
  case WATSON extends WATSON("watson", Some("Watson strand of referenceSeq"), Some("http://hl7.org/fhir/strand-type"))
}
object STRAND_TYPE extends EType[STRAND_TYPE]("http://hl7.org/fhir/ValueSet/strand-type") 


enum STRUCTURE_DEFINITION_KIND(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case COMPLEX_DATA_TYPE extends COMPLEX_DATA_TYPE("complex-type", Some("Complex Data Type"), Some("http://hl7.org/fhir/structure-definition-kind"))
  case LOGICAL extends LOGICAL("logical", Some("Logical"), Some("http://hl7.org/fhir/structure-definition-kind"))
  case PRIMITIVE_DATA_TYPE extends PRIMITIVE_DATA_TYPE("primitive-type", Some("Primitive Data Type"), Some("http://hl7.org/fhir/structure-definition-kind"))
  case RESOURCE extends RESOURCE("resource", Some("Resource"), Some("http://hl7.org/fhir/structure-definition-kind"))
}
object STRUCTURE_DEFINITION_KIND extends EType[STRUCTURE_DEFINITION_KIND]("http://hl7.org/fhir/ValueSet/structure-definition-kind") 


enum SUBSCRIPTION_CHANNEL_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case EMAIL extends EMAIL("email", Some("Email"), Some("http://hl7.org/fhir/subscription-channel-type"))
  case MESSAGE extends MESSAGE("message", Some("Message"), Some("http://hl7.org/fhir/subscription-channel-type"))
  case REST_HOOK extends REST_HOOK("rest-hook", Some("Rest Hook"), Some("http://hl7.org/fhir/subscription-channel-type"))
  case SMS extends SMS("sms", Some("SMS"), Some("http://hl7.org/fhir/subscription-channel-type"))
  case WEBSOCKET extends WEBSOCKET("websocket", Some("Websocket"), Some("http://hl7.org/fhir/subscription-channel-type"))
}
object SUBSCRIPTION_CHANNEL_TYPE extends EType[SUBSCRIPTION_CHANNEL_TYPE]("http://hl7.org/fhir/ValueSet/subscription-channel-type") 


enum SUBSCRIPTION_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ACTIVE extends ACTIVE("active", Some("Active"), Some("http://hl7.org/fhir/subscription-status"))
  case ERROR extends ERROR("error", Some("Error"), Some("http://hl7.org/fhir/subscription-status"))
  case OFF extends OFF("off", Some("Off"), Some("http://hl7.org/fhir/subscription-status"))
  case REQUESTED extends REQUESTED("requested", Some("Requested"), Some("http://hl7.org/fhir/subscription-status"))
}
object SUBSCRIPTION_STATUS extends EType[SUBSCRIPTION_STATUS]("http://hl7.org/fhir/ValueSet/subscription-status") 


enum SUBSTANCE_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ACTIVE extends ACTIVE("active", Some("Active"), Some("http://hl7.org/fhir/substance-status"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/substance-status"))
  case INACTIVE extends INACTIVE("inactive", Some("Inactive"), Some("http://hl7.org/fhir/substance-status"))
}
object SUBSTANCE_STATUS extends EType[SUBSTANCE_STATUS]("http://hl7.org/fhir/ValueSet/substance-status") 


enum SUPPLYDELIVERY_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ABANDONED extends ABANDONED("abandoned", Some("Abandoned"), Some("http://hl7.org/fhir/supplydelivery-status"))
  case COMPLETED extends COMPLETED("completed", Some("Delivered"), Some("http://hl7.org/fhir/supplydelivery-status"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("Entered In Error"), Some("http://hl7.org/fhir/supplydelivery-status"))
  case IN_PROGRESS extends IN_PROGRESS("in-progress", Some("In Progress"), Some("http://hl7.org/fhir/supplydelivery-status"))
}
object SUPPLYDELIVERY_STATUS extends EType[SUPPLYDELIVERY_STATUS]("http://hl7.org/fhir/ValueSet/supplydelivery-status") 


enum SUPPLYREQUEST_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ACTIVE extends ACTIVE("active", Some("Active"), Some("http://hl7.org/fhir/supplyrequest-status"))
  case CANCELLED extends CANCELLED("cancelled", Some("Cancelled"), Some("http://hl7.org/fhir/supplyrequest-status"))
  case COMPLETED extends COMPLETED("completed", Some("Completed"), Some("http://hl7.org/fhir/supplyrequest-status"))
  case DRAFT extends DRAFT("draft", Some("Draft"), Some("http://hl7.org/fhir/supplyrequest-status"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/supplyrequest-status"))
  case SUSPENDED extends SUSPENDED("suspended", Some("Suspended"), Some("http://hl7.org/fhir/supplyrequest-status"))
  case UNKNOWN extends UNKNOWN("unknown", Some("Unknown"), Some("http://hl7.org/fhir/supplyrequest-status"))
}
object SUPPLYREQUEST_STATUS extends EType[SUPPLYREQUEST_STATUS]("http://hl7.org/fhir/ValueSet/supplyrequest-status") 


enum SYSTEM_RESTFUL_INTERACTION(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case BATCH extends BATCH("batch", Some("batch"), Some("http://hl7.org/fhir/restful-interaction"))
  case HISTORY_SYSTEM extends HISTORY_SYSTEM("history-system", Some("history-system"), Some("http://hl7.org/fhir/restful-interaction"))
  case SEARCH_SYSTEM extends SEARCH_SYSTEM("search-system", Some("search-system"), Some("http://hl7.org/fhir/restful-interaction"))
  case TRANSACTION extends TRANSACTION("transaction", Some("transaction"), Some("http://hl7.org/fhir/restful-interaction"))
}
object SYSTEM_RESTFUL_INTERACTION extends EType[SYSTEM_RESTFUL_INTERACTION]("http://hl7.org/fhir/ValueSet/system-restful-interaction") 


enum TASK_INTENT(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case FILLER_ORDER extends FILLER_ORDER("filler-order", Some("filler-order"), Some("http://hl7.org/fhir/request-intent"))
  case INSTANCE_ORDER extends INSTANCE_ORDER("instance-order", Some("instance-order"), Some("http://hl7.org/fhir/request-intent"))
  case OPTION extends OPTION("option", Some("option"), Some("http://hl7.org/fhir/request-intent"))
  case ORDER extends ORDER("order", Some("order"), Some("http://hl7.org/fhir/request-intent"))
  case ORIGINAL_ORDER extends ORIGINAL_ORDER("original-order", Some("original-order"), Some("http://hl7.org/fhir/request-intent"))
  case PLAN extends PLAN("plan", Some("plan"), Some("http://hl7.org/fhir/request-intent"))
  case PROPOSAL extends PROPOSAL("proposal", Some("proposal"), Some("http://hl7.org/fhir/request-intent"))
  case REFLEX_ORDER extends REFLEX_ORDER("reflex-order", Some("reflex-order"), Some("http://hl7.org/fhir/request-intent"))
  case UNKNOWN extends UNKNOWN("unknown", Some("Unknown"), Some("http://hl7.org/fhir/task-intent"))
}
object TASK_INTENT extends EType[TASK_INTENT]("http://hl7.org/fhir/ValueSet/task-intent") 


enum TASK_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ACCEPTED extends ACCEPTED("accepted", Some("Accepted"), Some("http://hl7.org/fhir/task-status"))
  case CANCELLED extends CANCELLED("cancelled", Some("Cancelled"), Some("http://hl7.org/fhir/task-status"))
  case COMPLETED extends COMPLETED("completed", Some("Completed"), Some("http://hl7.org/fhir/task-status"))
  case DRAFT extends DRAFT("draft", Some("Draft"), Some("http://hl7.org/fhir/task-status"))
  case ENTERED_IN_ERROR extends ENTERED_IN_ERROR("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/task-status"))
  case FAILED extends FAILED("failed", Some("Failed"), Some("http://hl7.org/fhir/task-status"))
  case IN_PROGRESS extends IN_PROGRESS("in-progress", Some("In Progress"), Some("http://hl7.org/fhir/task-status"))
  case ON_HOLD extends ON_HOLD("on-hold", Some("On Hold"), Some("http://hl7.org/fhir/task-status"))
  case READY extends READY("ready", Some("Ready"), Some("http://hl7.org/fhir/task-status"))
  case RECEIVED extends RECEIVED("received", Some("Received"), Some("http://hl7.org/fhir/task-status"))
  case REJECTED extends REJECTED("rejected", Some("Rejected"), Some("http://hl7.org/fhir/task-status"))
  case REQUESTED extends REQUESTED("requested", Some("Requested"), Some("http://hl7.org/fhir/task-status"))
}
object TASK_STATUS extends EType[TASK_STATUS]("http://hl7.org/fhir/ValueSet/task-status") 


enum TYPE_DERIVATION_RULE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case CONSTRAINT extends CONSTRAINT("constraint", Some("Constraint"), Some("http://hl7.org/fhir/type-derivation-rule"))
  case SPECIALIZATION extends SPECIALIZATION("specialization", Some("Specialization"), Some("http://hl7.org/fhir/type-derivation-rule"))
}
object TYPE_DERIVATION_RULE extends EType[TYPE_DERIVATION_RULE]("http://hl7.org/fhir/ValueSet/type-derivation-rule") 


enum TYPE_RESTFUL_INTERACTION(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case CREATE extends CREATE("create", Some("create"), Some("http://hl7.org/fhir/restful-interaction"))
  case DELETE extends DELETE("delete", Some("delete"), Some("http://hl7.org/fhir/restful-interaction"))
  case HISTORY_INSTANCE extends HISTORY_INSTANCE("history-instance", Some("history-instance"), Some("http://hl7.org/fhir/restful-interaction"))
  case HISTORY_TYPE extends HISTORY_TYPE("history-type", Some("history-type"), Some("http://hl7.org/fhir/restful-interaction"))
  case PATCH extends PATCH("patch", Some("patch"), Some("http://hl7.org/fhir/restful-interaction"))
  case READ extends READ("read", Some("read"), Some("http://hl7.org/fhir/restful-interaction"))
  case SEARCH_TYPE extends SEARCH_TYPE("search-type", Some("search-type"), Some("http://hl7.org/fhir/restful-interaction"))
  case UPDATE extends UPDATE("update", Some("update"), Some("http://hl7.org/fhir/restful-interaction"))
  case VREAD extends VREAD("vread", Some("vread"), Some("http://hl7.org/fhir/restful-interaction"))
}
object TYPE_RESTFUL_INTERACTION extends EType[TYPE_RESTFUL_INTERACTION]("http://hl7.org/fhir/ValueSet/type-restful-interaction") 


enum UDI_ENTRY_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case BARCODE extends BARCODE("barcode", Some("Barcode"), Some("http://hl7.org/fhir/udi-entry-type"))
  case CARD extends CARD("card", Some("Card"), Some("http://hl7.org/fhir/udi-entry-type"))
  case MANUAL extends MANUAL("manual", Some("Manual"), Some("http://hl7.org/fhir/udi-entry-type"))
  case RFID extends RFID("rfid", Some("RFID"), Some("http://hl7.org/fhir/udi-entry-type"))
  case SELF_REPORTED extends SELF_REPORTED("self-reported", Some("Self Reported"), Some("http://hl7.org/fhir/udi-entry-type"))
  case UNKNOWN extends UNKNOWN("unknown", Some("Unknown"), Some("http://hl7.org/fhir/udi-entry-type"))
}
object UDI_ENTRY_TYPE extends EType[UDI_ENTRY_TYPE]("http://hl7.org/fhir/ValueSet/udi-entry-type") 


enum V3_CONFIDENTIALITYCLASSIFICATION(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case L extends L("L", Some("L"), Some("http://terminology.hl7.org/CodeSystem/v3-Confidentiality"))
  case M extends M("M", Some("M"), Some("http://terminology.hl7.org/CodeSystem/v3-Confidentiality"))
  case N extends N("N", Some("N"), Some("http://terminology.hl7.org/CodeSystem/v3-Confidentiality"))
  case R extends R("R", Some("R"), Some("http://terminology.hl7.org/CodeSystem/v3-Confidentiality"))
  case U extends U("U", Some("U"), Some("http://terminology.hl7.org/CodeSystem/v3-Confidentiality"))
  case V extends V("V", Some("V"), Some("http://terminology.hl7.org/CodeSystem/v3-Confidentiality"))
}
object V3_CONFIDENTIALITYCLASSIFICATION extends EType[V3_CONFIDENTIALITYCLASSIFICATION]("http://terminology.hl7.org/ValueSet/v3-ConfidentialityClassification") 


enum VARIABLE_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case CONTINUOUS extends CONTINUOUS("continuous", Some("Continuous"), Some("http://hl7.org/fhir/variable-type"))
  case DESCRIPTIVE extends DESCRIPTIVE("descriptive", Some("Descriptive"), Some("http://hl7.org/fhir/variable-type"))
  case DICHOTOMOUS extends DICHOTOMOUS("dichotomous", Some("Dichotomous"), Some("http://hl7.org/fhir/variable-type"))
}
object VARIABLE_TYPE extends EType[VARIABLE_TYPE]("http://hl7.org/fhir/ValueSet/variable-type") 


enum VERIFICATIONRESULT_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case ATTESTED extends ATTESTED("attested", Some("Attested"), Some("http://hl7.org/fhir/CodeSystem/status"))
  case IN_PROCESS extends IN_PROCESS("in-process", Some("In process"), Some("http://hl7.org/fhir/CodeSystem/status"))
  case REQUIRES_REVALIDATION extends REQUIRES_REVALIDATION("req-revalid", Some("Requires revalidation"), Some("http://hl7.org/fhir/CodeSystem/status"))
  case RE_VALIDATION_FAILED extends RE_VALIDATION_FAILED("reval-fail", Some("Re-Validation failed"), Some("http://hl7.org/fhir/CodeSystem/status"))
  case VALIDATED extends VALIDATED("validated", Some("Validated"), Some("http://hl7.org/fhir/CodeSystem/status"))
  case VALIDATION_FAILED extends VALIDATION_FAILED("val-fail", Some("Validation failed"), Some("http://hl7.org/fhir/CodeSystem/status"))
}
object VERIFICATIONRESULT_STATUS extends EType[VERIFICATIONRESULT_STATUS]("http://hl7.org/fhir/ValueSet/verificationresult-status") 


enum VERSIONING_POLICY(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case NO_VERSIONID_SUPPORT extends NO_VERSIONID_SUPPORT("no-version", Some("No VersionId Support"), Some("http://hl7.org/fhir/versioning-policy"))
  case VERSIONED extends VERSIONED("versioned", Some("Versioned"), Some("http://hl7.org/fhir/versioning-policy"))
  case VERSIONID_TRACKED_FULLY extends VERSIONID_TRACKED_FULLY("versioned-update", Some("VersionId tracked fully"), Some("http://hl7.org/fhir/versioning-policy"))
}
object VERSIONING_POLICY extends EType[VERSIONING_POLICY]("http://hl7.org/fhir/ValueSet/versioning-policy") 


enum VISION_BASE_CODES(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case DOWN extends DOWN("down", Some("Down"), Some("http://hl7.org/fhir/vision-base-codes"))
  case IN extends IN("in", Some("In"), Some("http://hl7.org/fhir/vision-base-codes"))
  case OUT extends OUT("out", Some("Out"), Some("http://hl7.org/fhir/vision-base-codes"))
  case UP extends UP("up", Some("Up"), Some("http://hl7.org/fhir/vision-base-codes"))
}
object VISION_BASE_CODES extends EType[VISION_BASE_CODES]("http://hl7.org/fhir/ValueSet/vision-base-codes") 


enum VISION_EYE_CODES(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
    case LEFT extends LEFT("left", Some("Left Eye"), Some("http://hl7.org/fhir/vision-eye-codes"))
  case RIGHT extends RIGHT("right", Some("Right Eye"), Some("http://hl7.org/fhir/vision-eye-codes"))
}
object VISION_EYE_CODES extends EType[VISION_EYE_CODES]("http://hl7.org/fhir/ValueSet/vision-eye-codes") 

