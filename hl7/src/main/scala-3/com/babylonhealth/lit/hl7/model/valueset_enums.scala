package com.babylonhealth.lit.hl7

import scala.reflect.ClassTag
import scala.util.{ Success, Try }

import io.circe.{ Decoder, DecodingFailure, Encoder, HCursor, Json }

import com.babylonhealth.lit.core.{ EnumBase, EType, ToCodingAble, ETypeWithFallback }
import com.babylonhealth.lit.core.model.Coding
enum ACCOUNT_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ACTIVE extends ACCOUNT_STATUS("active", Some("Active"), Some("http://hl7.org/fhir/account-status"))
  case ENTERED_IN_ERROR extends ACCOUNT_STATUS("entered-in-error", Some("Entered in error"), Some("http://hl7.org/fhir/account-status"))
  case INACTIVE extends ACCOUNT_STATUS("inactive", Some("Inactive"), Some("http://hl7.org/fhir/account-status"))
  case ON_HOLD extends ACCOUNT_STATUS("on-hold", Some("On Hold"), Some("http://hl7.org/fhir/account-status"))
  case UNKNOWN extends ACCOUNT_STATUS("unknown", Some("Unknown"), Some("http://hl7.org/fhir/account-status"))
}
object ACCOUNT_STATUS extends EType[ACCOUNT_STATUS]("http://hl7.org/fhir/ValueSet/account-status") 


enum ACTION_CARDINALITY_BEHAVIOR(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case MULTIPLE extends ACTION_CARDINALITY_BEHAVIOR("multiple", Some("Multiple"), Some("http://hl7.org/fhir/action-cardinality-behavior"))
  case SINGLE extends ACTION_CARDINALITY_BEHAVIOR("single", Some("Single"), Some("http://hl7.org/fhir/action-cardinality-behavior"))
}
object ACTION_CARDINALITY_BEHAVIOR extends EType[ACTION_CARDINALITY_BEHAVIOR]("http://hl7.org/fhir/ValueSet/action-cardinality-behavior") 


enum ACTION_CONDITION_KIND(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case APPLICABILITY extends ACTION_CONDITION_KIND("applicability", Some("Applicability"), Some("http://hl7.org/fhir/action-condition-kind"))
  case START extends ACTION_CONDITION_KIND("start", Some("Start"), Some("http://hl7.org/fhir/action-condition-kind"))
  case STOP extends ACTION_CONDITION_KIND("stop", Some("Stop"), Some("http://hl7.org/fhir/action-condition-kind"))
}
object ACTION_CONDITION_KIND extends EType[ACTION_CONDITION_KIND]("http://hl7.org/fhir/ValueSet/action-condition-kind") 


enum ACTION_GROUPING_BEHAVIOR(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case LOGICAL_GROUP extends ACTION_GROUPING_BEHAVIOR("logical-group", Some("Logical Group"), Some("http://hl7.org/fhir/action-grouping-behavior"))
  case SENTENCE_GROUP extends ACTION_GROUPING_BEHAVIOR("sentence-group", Some("Sentence Group"), Some("http://hl7.org/fhir/action-grouping-behavior"))
  case VISUAL_GROUP extends ACTION_GROUPING_BEHAVIOR("visual-group", Some("Visual Group"), Some("http://hl7.org/fhir/action-grouping-behavior"))
}
object ACTION_GROUPING_BEHAVIOR extends EType[ACTION_GROUPING_BEHAVIOR]("http://hl7.org/fhir/ValueSet/action-grouping-behavior") 


enum ACTION_PARTICIPANT_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case DEVICE extends ACTION_PARTICIPANT_TYPE("device", Some("Device"), Some("http://hl7.org/fhir/action-participant-type"))
  case PATIENT extends ACTION_PARTICIPANT_TYPE("patient", Some("Patient"), Some("http://hl7.org/fhir/action-participant-type"))
  case PRACTITIONER extends ACTION_PARTICIPANT_TYPE("practitioner", Some("Practitioner"), Some("http://hl7.org/fhir/action-participant-type"))
  case RELATED_PERSON extends ACTION_PARTICIPANT_TYPE("related-person", Some("Related Person"), Some("http://hl7.org/fhir/action-participant-type"))
}
object ACTION_PARTICIPANT_TYPE extends EType[ACTION_PARTICIPANT_TYPE]("http://hl7.org/fhir/ValueSet/action-participant-type") 


enum ACTION_PRECHECK_BEHAVIOR(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case NO extends ACTION_PRECHECK_BEHAVIOR("no", Some("No"), Some("http://hl7.org/fhir/action-precheck-behavior"))
  case YES extends ACTION_PRECHECK_BEHAVIOR("yes", Some("Yes"), Some("http://hl7.org/fhir/action-precheck-behavior"))
}
object ACTION_PRECHECK_BEHAVIOR extends EType[ACTION_PRECHECK_BEHAVIOR]("http://hl7.org/fhir/ValueSet/action-precheck-behavior") 


enum ACTION_RELATIONSHIP_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case AFTER extends ACTION_RELATIONSHIP_TYPE("after", Some("After"), Some("http://hl7.org/fhir/action-relationship-type"))
  case AFTER_END extends ACTION_RELATIONSHIP_TYPE("after-end", Some("After End"), Some("http://hl7.org/fhir/action-relationship-type"))
  case AFTER_START extends ACTION_RELATIONSHIP_TYPE("after-start", Some("After Start"), Some("http://hl7.org/fhir/action-relationship-type"))
  case BEFORE extends ACTION_RELATIONSHIP_TYPE("before", Some("Before"), Some("http://hl7.org/fhir/action-relationship-type"))
  case BEFORE_END extends ACTION_RELATIONSHIP_TYPE("before-end", Some("Before End"), Some("http://hl7.org/fhir/action-relationship-type"))
  case BEFORE_START extends ACTION_RELATIONSHIP_TYPE("before-start", Some("Before Start"), Some("http://hl7.org/fhir/action-relationship-type"))
  case CONCURRENT extends ACTION_RELATIONSHIP_TYPE("concurrent", Some("Concurrent"), Some("http://hl7.org/fhir/action-relationship-type"))
  case CONCURRENT_WITH_END extends ACTION_RELATIONSHIP_TYPE("concurrent-with-end", Some("Concurrent With End"), Some("http://hl7.org/fhir/action-relationship-type"))
  case CONCURRENT_WITH_START extends ACTION_RELATIONSHIP_TYPE("concurrent-with-start", Some("Concurrent With Start"), Some("http://hl7.org/fhir/action-relationship-type"))
}
object ACTION_RELATIONSHIP_TYPE extends EType[ACTION_RELATIONSHIP_TYPE]("http://hl7.org/fhir/ValueSet/action-relationship-type") 


enum ACTION_REQUIRED_BEHAVIOR(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case COULD extends ACTION_REQUIRED_BEHAVIOR("could", Some("Could"), Some("http://hl7.org/fhir/action-required-behavior"))
  case MUST extends ACTION_REQUIRED_BEHAVIOR("must", Some("Must"), Some("http://hl7.org/fhir/action-required-behavior"))
  case MUST_UNLESS_DOCUMENTED extends ACTION_REQUIRED_BEHAVIOR("must-unless-documented", Some("Must Unless Documented"), Some("http://hl7.org/fhir/action-required-behavior"))
}
object ACTION_REQUIRED_BEHAVIOR extends EType[ACTION_REQUIRED_BEHAVIOR]("http://hl7.org/fhir/ValueSet/action-required-behavior") 


enum ACTION_SELECTION_BEHAVIOR(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ALL extends ACTION_SELECTION_BEHAVIOR("all", Some("All"), Some("http://hl7.org/fhir/action-selection-behavior"))
  case ALL_OR_NONE extends ACTION_SELECTION_BEHAVIOR("all-or-none", Some("All Or None"), Some("http://hl7.org/fhir/action-selection-behavior"))
  case ANY extends ACTION_SELECTION_BEHAVIOR("any", Some("Any"), Some("http://hl7.org/fhir/action-selection-behavior"))
  case AT_MOST_ONE extends ACTION_SELECTION_BEHAVIOR("at-most-one", Some("At Most One"), Some("http://hl7.org/fhir/action-selection-behavior"))
  case EXACTLY_ONE extends ACTION_SELECTION_BEHAVIOR("exactly-one", Some("Exactly One"), Some("http://hl7.org/fhir/action-selection-behavior"))
  case ONE_OR_MORE extends ACTION_SELECTION_BEHAVIOR("one-or-more", Some("One Or More"), Some("http://hl7.org/fhir/action-selection-behavior"))
}
object ACTION_SELECTION_BEHAVIOR extends EType[ACTION_SELECTION_BEHAVIOR]("http://hl7.org/fhir/ValueSet/action-selection-behavior") 


enum ADMINISTRATIVE_GENDER(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case FEMALE extends ADMINISTRATIVE_GENDER("female", Some("Female"), Some("http://hl7.org/fhir/administrative-gender"))
  case MALE extends ADMINISTRATIVE_GENDER("male", Some("Male"), Some("http://hl7.org/fhir/administrative-gender"))
  case OTHER extends ADMINISTRATIVE_GENDER("other", Some("Other"), Some("http://hl7.org/fhir/administrative-gender"))
  case UNKNOWN extends ADMINISTRATIVE_GENDER("unknown", Some("Unknown"), Some("http://hl7.org/fhir/administrative-gender"))
}
object ADMINISTRATIVE_GENDER extends EType[ADMINISTRATIVE_GENDER]("http://hl7.org/fhir/ValueSet/administrative-gender") 


enum ADVERSE_EVENT_ACTUALITY(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ACTUAL extends ADVERSE_EVENT_ACTUALITY("actual", Some("Adverse Event"), Some("http://hl7.org/fhir/adverse-event-actuality"))
  case POTENTIAL extends ADVERSE_EVENT_ACTUALITY("potential", Some("Potential Adverse Event"), Some("http://hl7.org/fhir/adverse-event-actuality"))
}
object ADVERSE_EVENT_ACTUALITY extends EType[ADVERSE_EVENT_ACTUALITY]("http://hl7.org/fhir/ValueSet/adverse-event-actuality") 


enum ALLERGY_INTOLERANCE_CATEGORY(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case BIOLOGIC extends ALLERGY_INTOLERANCE_CATEGORY("biologic", Some("Biologic"), Some("http://hl7.org/fhir/allergy-intolerance-category"))
  case ENVIRONMENT extends ALLERGY_INTOLERANCE_CATEGORY("environment", Some("Environment"), Some("http://hl7.org/fhir/allergy-intolerance-category"))
  case FOOD extends ALLERGY_INTOLERANCE_CATEGORY("food", Some("Food"), Some("http://hl7.org/fhir/allergy-intolerance-category"))
  case MEDICATION extends ALLERGY_INTOLERANCE_CATEGORY("medication", Some("Medication"), Some("http://hl7.org/fhir/allergy-intolerance-category"))
}
object ALLERGY_INTOLERANCE_CATEGORY extends EType[ALLERGY_INTOLERANCE_CATEGORY]("http://hl7.org/fhir/ValueSet/allergy-intolerance-category") 


enum ALLERGY_INTOLERANCE_CRITICALITY(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case HIGH extends ALLERGY_INTOLERANCE_CRITICALITY("high", Some("High Risk"), Some("http://hl7.org/fhir/allergy-intolerance-criticality"))
  case LOW extends ALLERGY_INTOLERANCE_CRITICALITY("low", Some("Low Risk"), Some("http://hl7.org/fhir/allergy-intolerance-criticality"))
  case UNABLE_TO_ASSESS_RISK extends ALLERGY_INTOLERANCE_CRITICALITY("unable-to-assess", Some("Unable to Assess Risk"), Some("http://hl7.org/fhir/allergy-intolerance-criticality"))
}
object ALLERGY_INTOLERANCE_CRITICALITY extends EType[ALLERGY_INTOLERANCE_CRITICALITY]("http://hl7.org/fhir/ValueSet/allergy-intolerance-criticality") 


enum ALLERGY_INTOLERANCE_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ALLERGY extends ALLERGY_INTOLERANCE_TYPE("allergy", Some("Allergy"), Some("http://hl7.org/fhir/allergy-intolerance-type"))
  case INTOLERANCE extends ALLERGY_INTOLERANCE_TYPE("intolerance", Some("Intolerance"), Some("http://hl7.org/fhir/allergy-intolerance-type"))
}
object ALLERGY_INTOLERANCE_TYPE extends EType[ALLERGY_INTOLERANCE_TYPE]("http://hl7.org/fhir/ValueSet/allergy-intolerance-type") 


enum APPOINTMENTSTATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ARRIVED extends APPOINTMENTSTATUS("arrived", Some("Arrived"), Some("http://hl7.org/fhir/appointmentstatus"))
  case BOOKED extends APPOINTMENTSTATUS("booked", Some("Booked"), Some("http://hl7.org/fhir/appointmentstatus"))
  case CANCELLED extends APPOINTMENTSTATUS("cancelled", Some("Cancelled"), Some("http://hl7.org/fhir/appointmentstatus"))
  case CHECKED_IN extends APPOINTMENTSTATUS("checked-in", Some("Checked In"), Some("http://hl7.org/fhir/appointmentstatus"))
  case ENTERED_IN_ERROR extends APPOINTMENTSTATUS("entered-in-error", Some("Entered in error"), Some("http://hl7.org/fhir/appointmentstatus"))
  case FULFILLED extends APPOINTMENTSTATUS("fulfilled", Some("Fulfilled"), Some("http://hl7.org/fhir/appointmentstatus"))
  case NOSHOW extends APPOINTMENTSTATUS("noshow", Some("No Show"), Some("http://hl7.org/fhir/appointmentstatus"))
  case PENDING extends APPOINTMENTSTATUS("pending", Some("Pending"), Some("http://hl7.org/fhir/appointmentstatus"))
  case PROPOSED extends APPOINTMENTSTATUS("proposed", Some("Proposed"), Some("http://hl7.org/fhir/appointmentstatus"))
  case WAITLIST extends APPOINTMENTSTATUS("waitlist", Some("Waitlisted"), Some("http://hl7.org/fhir/appointmentstatus"))
}
object APPOINTMENTSTATUS extends EType[APPOINTMENTSTATUS]("http://hl7.org/fhir/ValueSet/appointmentstatus") 


enum ASSERT_DIRECTION_CODES(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case REQUEST extends ASSERT_DIRECTION_CODES("request", Some("request"), Some("http://hl7.org/fhir/assert-direction-codes"))
  case RESPONSE extends ASSERT_DIRECTION_CODES("response", Some("response"), Some("http://hl7.org/fhir/assert-direction-codes"))
}
object ASSERT_DIRECTION_CODES extends EType[ASSERT_DIRECTION_CODES]("http://hl7.org/fhir/ValueSet/assert-direction-codes") 


enum ASSERT_OPERATOR_CODES(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case CONTAINS extends ASSERT_OPERATOR_CODES("contains", Some("contains"), Some("http://hl7.org/fhir/assert-operator-codes"))
  case EMPTY extends ASSERT_OPERATOR_CODES("empty", Some("empty"), Some("http://hl7.org/fhir/assert-operator-codes"))
  case EQUALS extends ASSERT_OPERATOR_CODES("equals", Some("equals"), Some("http://hl7.org/fhir/assert-operator-codes"))
  case EVAL extends ASSERT_OPERATOR_CODES("eval", Some("evaluate"), Some("http://hl7.org/fhir/assert-operator-codes"))
  case GREATERTHAN extends ASSERT_OPERATOR_CODES("greaterThan", Some("greaterThan"), Some("http://hl7.org/fhir/assert-operator-codes"))
  case IN extends ASSERT_OPERATOR_CODES("in", Some("in"), Some("http://hl7.org/fhir/assert-operator-codes"))
  case LESSTHAN extends ASSERT_OPERATOR_CODES("lessThan", Some("lessThan"), Some("http://hl7.org/fhir/assert-operator-codes"))
  case NOTCONTAINS extends ASSERT_OPERATOR_CODES("notContains", Some("notContains"), Some("http://hl7.org/fhir/assert-operator-codes"))
  case NOTEMPTY extends ASSERT_OPERATOR_CODES("notEmpty", Some("notEmpty"), Some("http://hl7.org/fhir/assert-operator-codes"))
  case NOTEQUALS extends ASSERT_OPERATOR_CODES("notEquals", Some("notEquals"), Some("http://hl7.org/fhir/assert-operator-codes"))
  case NOTIN extends ASSERT_OPERATOR_CODES("notIn", Some("notIn"), Some("http://hl7.org/fhir/assert-operator-codes"))
}
object ASSERT_OPERATOR_CODES extends EType[ASSERT_OPERATOR_CODES]("http://hl7.org/fhir/ValueSet/assert-operator-codes") 


enum ASSERT_RESPONSE_CODE_TYPES(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case BAD extends ASSERT_RESPONSE_CODE_TYPES("bad", Some("bad"), Some("http://hl7.org/fhir/assert-response-code-types"))
  case CONFLICT extends ASSERT_RESPONSE_CODE_TYPES("conflict", Some("conflict"), Some("http://hl7.org/fhir/assert-response-code-types"))
  case CREATED extends ASSERT_RESPONSE_CODE_TYPES("created", Some("created"), Some("http://hl7.org/fhir/assert-response-code-types"))
  case FORBIDDEN extends ASSERT_RESPONSE_CODE_TYPES("forbidden", Some("forbidden"), Some("http://hl7.org/fhir/assert-response-code-types"))
  case GONE extends ASSERT_RESPONSE_CODE_TYPES("gone", Some("gone"), Some("http://hl7.org/fhir/assert-response-code-types"))
  case METHODNOTALLOWED extends ASSERT_RESPONSE_CODE_TYPES("methodNotAllowed", Some("methodNotAllowed"), Some("http://hl7.org/fhir/assert-response-code-types"))
  case NOCONTENT extends ASSERT_RESPONSE_CODE_TYPES("noContent", Some("noContent"), Some("http://hl7.org/fhir/assert-response-code-types"))
  case NOTFOUND extends ASSERT_RESPONSE_CODE_TYPES("notFound", Some("notFound"), Some("http://hl7.org/fhir/assert-response-code-types"))
  case NOTMODIFIED extends ASSERT_RESPONSE_CODE_TYPES("notModified", Some("notModified"), Some("http://hl7.org/fhir/assert-response-code-types"))
  case OKAY extends ASSERT_RESPONSE_CODE_TYPES("okay", Some("okay"), Some("http://hl7.org/fhir/assert-response-code-types"))
  case PRECONDITIONFAILED extends ASSERT_RESPONSE_CODE_TYPES("preconditionFailed", Some("preconditionFailed"), Some("http://hl7.org/fhir/assert-response-code-types"))
  case UNPROCESSABLE extends ASSERT_RESPONSE_CODE_TYPES("unprocessable", Some("unprocessable"), Some("http://hl7.org/fhir/assert-response-code-types"))
}
object ASSERT_RESPONSE_CODE_TYPES extends EType[ASSERT_RESPONSE_CODE_TYPES]("http://hl7.org/fhir/ValueSet/assert-response-code-types") 


enum AUDIT_EVENT_ACTION(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case C extends AUDIT_EVENT_ACTION("C", Some("Create"), Some("http://hl7.org/fhir/audit-event-action"))
  case D extends AUDIT_EVENT_ACTION("D", Some("Delete"), Some("http://hl7.org/fhir/audit-event-action"))
  case E extends AUDIT_EVENT_ACTION("E", Some("Execute"), Some("http://hl7.org/fhir/audit-event-action"))
  case R extends AUDIT_EVENT_ACTION("R", Some("Read/View/Print"), Some("http://hl7.org/fhir/audit-event-action"))
  case U extends AUDIT_EVENT_ACTION("U", Some("Update"), Some("http://hl7.org/fhir/audit-event-action"))
}
object AUDIT_EVENT_ACTION extends EType[AUDIT_EVENT_ACTION]("http://hl7.org/fhir/ValueSet/audit-event-action") 


enum AUDIT_EVENT_OUTCOME(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case MAJOR_FAILURE extends AUDIT_EVENT_OUTCOME("12", Some("Major failure"), Some("http://hl7.org/fhir/audit-event-outcome"))
  case MINOR_FAILURE extends AUDIT_EVENT_OUTCOME("4", Some("Minor failure"), Some("http://hl7.org/fhir/audit-event-outcome"))
  case SERIOUS_FAILURE extends AUDIT_EVENT_OUTCOME("8", Some("Serious failure"), Some("http://hl7.org/fhir/audit-event-outcome"))
  case SUCCESS extends AUDIT_EVENT_OUTCOME("0", Some("Success"), Some("http://hl7.org/fhir/audit-event-outcome"))
}
object AUDIT_EVENT_OUTCOME extends EType[AUDIT_EVENT_OUTCOME]("http://hl7.org/fhir/ValueSet/audit-event-outcome") 


enum BINDING_STRENGTH(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case EXAMPLE extends BINDING_STRENGTH("example", Some("Example"), Some("http://hl7.org/fhir/binding-strength"))
  case EXTENSIBLE extends BINDING_STRENGTH("extensible", Some("Extensible"), Some("http://hl7.org/fhir/binding-strength"))
  case PREFERRED extends BINDING_STRENGTH("preferred", Some("Preferred"), Some("http://hl7.org/fhir/binding-strength"))
  case REQUIRED extends BINDING_STRENGTH("required", Some("Required"), Some("http://hl7.org/fhir/binding-strength"))
}
object BINDING_STRENGTH extends EType[BINDING_STRENGTH]("http://hl7.org/fhir/ValueSet/binding-strength") 


enum BUNDLE_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case BATCH extends BUNDLE_TYPE("batch", Some("Batch"), Some("http://hl7.org/fhir/bundle-type"))
  case BATCH_RESPONSE extends BUNDLE_TYPE("batch-response", Some("Batch Response"), Some("http://hl7.org/fhir/bundle-type"))
  case COLLECTION extends BUNDLE_TYPE("collection", Some("Collection"), Some("http://hl7.org/fhir/bundle-type"))
  case DOCUMENT extends BUNDLE_TYPE("document", Some("Document"), Some("http://hl7.org/fhir/bundle-type"))
  case HISTORY extends BUNDLE_TYPE("history", Some("History List"), Some("http://hl7.org/fhir/bundle-type"))
  case MESSAGE extends BUNDLE_TYPE("message", Some("Message"), Some("http://hl7.org/fhir/bundle-type"))
  case SEARCHSET extends BUNDLE_TYPE("searchset", Some("Search Results"), Some("http://hl7.org/fhir/bundle-type"))
  case TRANSACTION extends BUNDLE_TYPE("transaction", Some("Transaction"), Some("http://hl7.org/fhir/bundle-type"))
  case TRANSACTION_RESPONSE extends BUNDLE_TYPE("transaction-response", Some("Transaction Response"), Some("http://hl7.org/fhir/bundle-type"))
}
object BUNDLE_TYPE extends EType[BUNDLE_TYPE]("http://hl7.org/fhir/ValueSet/bundle-type") 


enum CAPABILITY_STATEMENT_KIND(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case CAPABILITY extends CAPABILITY_STATEMENT_KIND("capability", Some("Capability"), Some("http://hl7.org/fhir/capability-statement-kind"))
  case INSTANCE extends CAPABILITY_STATEMENT_KIND("instance", Some("Instance"), Some("http://hl7.org/fhir/capability-statement-kind"))
  case REQUIREMENTS extends CAPABILITY_STATEMENT_KIND("requirements", Some("Requirements"), Some("http://hl7.org/fhir/capability-statement-kind"))
}
object CAPABILITY_STATEMENT_KIND extends EType[CAPABILITY_STATEMENT_KIND]("http://hl7.org/fhir/ValueSet/capability-statement-kind") 


enum CARE_PLAN_ACTIVITY_KIND(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case APPOINTMENT extends CARE_PLAN_ACTIVITY_KIND("Appointment", Some("Appointment"), Some("http://hl7.org/fhir/resource-types"))
  case COMMUNICATIONREQUEST extends CARE_PLAN_ACTIVITY_KIND("CommunicationRequest", Some("CommunicationRequest"), Some("http://hl7.org/fhir/resource-types"))
  case DEVICEREQUEST extends CARE_PLAN_ACTIVITY_KIND("DeviceRequest", Some("DeviceRequest"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICATIONREQUEST extends CARE_PLAN_ACTIVITY_KIND("MedicationRequest", Some("MedicationRequest"), Some("http://hl7.org/fhir/resource-types"))
  case NUTRITIONORDER extends CARE_PLAN_ACTIVITY_KIND("NutritionOrder", Some("NutritionOrder"), Some("http://hl7.org/fhir/resource-types"))
  case SERVICEREQUEST extends CARE_PLAN_ACTIVITY_KIND("ServiceRequest", Some("ServiceRequest"), Some("http://hl7.org/fhir/resource-types"))
  case TASK extends CARE_PLAN_ACTIVITY_KIND("Task", Some("Task"), Some("http://hl7.org/fhir/resource-types"))
  case VISIONPRESCRIPTION extends CARE_PLAN_ACTIVITY_KIND("VisionPrescription", Some("VisionPrescription"), Some("http://hl7.org/fhir/resource-types"))
}
object CARE_PLAN_ACTIVITY_KIND extends EType[CARE_PLAN_ACTIVITY_KIND]("http://hl7.org/fhir/ValueSet/care-plan-activity-kind") 


enum CARE_PLAN_ACTIVITY_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case CANCELLED extends CARE_PLAN_ACTIVITY_STATUS("cancelled", Some("Cancelled"), Some("http://hl7.org/fhir/care-plan-activity-status"))
  case COMPLETED extends CARE_PLAN_ACTIVITY_STATUS("completed", Some("Completed"), Some("http://hl7.org/fhir/care-plan-activity-status"))
  case ENTERED_IN_ERROR extends CARE_PLAN_ACTIVITY_STATUS("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/care-plan-activity-status"))
  case IN_PROGRESS extends CARE_PLAN_ACTIVITY_STATUS("in-progress", Some("In Progress"), Some("http://hl7.org/fhir/care-plan-activity-status"))
  case NOT_STARTED extends CARE_PLAN_ACTIVITY_STATUS("not-started", Some("Not Started"), Some("http://hl7.org/fhir/care-plan-activity-status"))
  case ON_HOLD extends CARE_PLAN_ACTIVITY_STATUS("on-hold", Some("On Hold"), Some("http://hl7.org/fhir/care-plan-activity-status"))
  case SCHEDULED extends CARE_PLAN_ACTIVITY_STATUS("scheduled", Some("Scheduled"), Some("http://hl7.org/fhir/care-plan-activity-status"))
  case STOPPED extends CARE_PLAN_ACTIVITY_STATUS("stopped", Some("Stopped"), Some("http://hl7.org/fhir/care-plan-activity-status"))
  case UNKNOWN extends CARE_PLAN_ACTIVITY_STATUS("unknown", Some("Unknown"), Some("http://hl7.org/fhir/care-plan-activity-status"))
}
object CARE_PLAN_ACTIVITY_STATUS extends EType[CARE_PLAN_ACTIVITY_STATUS]("http://hl7.org/fhir/ValueSet/care-plan-activity-status") 


enum CARE_PLAN_INTENT(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case OPTION extends CARE_PLAN_INTENT("option", Some("option"), Some("http://hl7.org/fhir/request-intent"))
  case ORDER extends CARE_PLAN_INTENT("order", Some("order"), Some("http://hl7.org/fhir/request-intent"))
  case PLAN extends CARE_PLAN_INTENT("plan", Some("plan"), Some("http://hl7.org/fhir/request-intent"))
  case PROPOSAL extends CARE_PLAN_INTENT("proposal", Some("proposal"), Some("http://hl7.org/fhir/request-intent"))
}
object CARE_PLAN_INTENT extends EType[CARE_PLAN_INTENT]("http://hl7.org/fhir/ValueSet/care-plan-intent") 


enum CARE_TEAM_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ACTIVE extends CARE_TEAM_STATUS("active", Some("Active"), Some("http://hl7.org/fhir/care-team-status"))
  case ENTERED_IN_ERROR extends CARE_TEAM_STATUS("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/care-team-status"))
  case INACTIVE extends CARE_TEAM_STATUS("inactive", Some("Inactive"), Some("http://hl7.org/fhir/care-team-status"))
  case PROPOSED extends CARE_TEAM_STATUS("proposed", Some("Proposed"), Some("http://hl7.org/fhir/care-team-status"))
  case SUSPENDED extends CARE_TEAM_STATUS("suspended", Some("Suspended"), Some("http://hl7.org/fhir/care-team-status"))
}
object CARE_TEAM_STATUS extends EType[CARE_TEAM_STATUS]("http://hl7.org/fhir/ValueSet/care-team-status") 


enum CHARGEITEM_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ABORTED extends CHARGEITEM_STATUS("aborted", Some("Aborted"), Some("http://hl7.org/fhir/chargeitem-status"))
  case BILLABLE extends CHARGEITEM_STATUS("billable", Some("Billable"), Some("http://hl7.org/fhir/chargeitem-status"))
  case BILLED extends CHARGEITEM_STATUS("billed", Some("Billed"), Some("http://hl7.org/fhir/chargeitem-status"))
  case ENTERED_IN_ERROR extends CHARGEITEM_STATUS("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/chargeitem-status"))
  case NOT_BILLABLE extends CHARGEITEM_STATUS("not-billable", Some("Not billable"), Some("http://hl7.org/fhir/chargeitem-status"))
  case PLANNED extends CHARGEITEM_STATUS("planned", Some("Planned"), Some("http://hl7.org/fhir/chargeitem-status"))
  case UNKNOWN extends CHARGEITEM_STATUS("unknown", Some("Unknown"), Some("http://hl7.org/fhir/chargeitem-status"))
}
object CHARGEITEM_STATUS extends EType[CHARGEITEM_STATUS]("http://hl7.org/fhir/ValueSet/chargeitem-status") 


enum CLAIM_USE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case CLAIM extends CLAIM_USE("claim", Some("Claim"), Some("http://hl7.org/fhir/claim-use"))
  case PREAUTHORIZATION extends CLAIM_USE("preauthorization", Some("Preauthorization"), Some("http://hl7.org/fhir/claim-use"))
  case PREDETERMINATION extends CLAIM_USE("predetermination", Some("Predetermination"), Some("http://hl7.org/fhir/claim-use"))
}
object CLAIM_USE extends EType[CLAIM_USE]("http://hl7.org/fhir/ValueSet/claim-use") 


enum CLINICALIMPRESSION_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case COMPLETED extends CLINICALIMPRESSION_STATUS("completed", Some("completed"), Some("http://hl7.org/fhir/event-status"))
  case ENTERED_IN_ERROR extends CLINICALIMPRESSION_STATUS("entered-in-error", Some("entered-in-error"), Some("http://hl7.org/fhir/event-status"))
  case IN_PROGRESS extends CLINICALIMPRESSION_STATUS("in-progress", Some("in-progress"), Some("http://hl7.org/fhir/event-status"))
}
object CLINICALIMPRESSION_STATUS extends EType[CLINICALIMPRESSION_STATUS]("http://hl7.org/fhir/ValueSet/clinicalimpression-status") 


enum CODESYSTEM_CONTENT_MODE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case COMPLETE extends CODESYSTEM_CONTENT_MODE("complete", Some("Complete"), Some("http://hl7.org/fhir/codesystem-content-mode"))
  case EXAMPLE extends CODESYSTEM_CONTENT_MODE("example", Some("Example"), Some("http://hl7.org/fhir/codesystem-content-mode"))
  case FRAGMENT extends CODESYSTEM_CONTENT_MODE("fragment", Some("Fragment"), Some("http://hl7.org/fhir/codesystem-content-mode"))
  case NOT_PRESENT extends CODESYSTEM_CONTENT_MODE("not-present", Some("Not Present"), Some("http://hl7.org/fhir/codesystem-content-mode"))
  case SUPPLEMENT extends CODESYSTEM_CONTENT_MODE("supplement", Some("Supplement"), Some("http://hl7.org/fhir/codesystem-content-mode"))
}
object CODESYSTEM_CONTENT_MODE extends EType[CODESYSTEM_CONTENT_MODE]("http://hl7.org/fhir/ValueSet/codesystem-content-mode") 


enum CODESYSTEM_HIERARCHY_MEANING(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case CLASSIFIED_WITH extends CODESYSTEM_HIERARCHY_MEANING("classified-with", Some("Classified With"), Some("http://hl7.org/fhir/codesystem-hierarchy-meaning"))
  case GROUPED_BY extends CODESYSTEM_HIERARCHY_MEANING("grouped-by", Some("Grouped By"), Some("http://hl7.org/fhir/codesystem-hierarchy-meaning"))
  case IS_A extends CODESYSTEM_HIERARCHY_MEANING("is-a", Some("Is-A"), Some("http://hl7.org/fhir/codesystem-hierarchy-meaning"))
  case PART_OF extends CODESYSTEM_HIERARCHY_MEANING("part-of", Some("Part Of"), Some("http://hl7.org/fhir/codesystem-hierarchy-meaning"))
}
object CODESYSTEM_HIERARCHY_MEANING extends EType[CODESYSTEM_HIERARCHY_MEANING]("http://hl7.org/fhir/ValueSet/codesystem-hierarchy-meaning") 


enum CODE_SEARCH_SUPPORT(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ALL extends CODE_SEARCH_SUPPORT("all", Some("Implicit Codes"), Some("http://hl7.org/fhir/code-search-support"))
  case EXPLICIT extends CODE_SEARCH_SUPPORT("explicit", Some("Explicit Codes"), Some("http://hl7.org/fhir/code-search-support"))
}
object CODE_SEARCH_SUPPORT extends EType[CODE_SEARCH_SUPPORT]("http://hl7.org/fhir/ValueSet/code-search-support") 


enum COMPARTMENT_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case DEVICE extends COMPARTMENT_TYPE("Device", Some("Device"), Some("http://hl7.org/fhir/compartment-type"))
  case ENCOUNTER extends COMPARTMENT_TYPE("Encounter", Some("Encounter"), Some("http://hl7.org/fhir/compartment-type"))
  case PATIENT extends COMPARTMENT_TYPE("Patient", Some("Patient"), Some("http://hl7.org/fhir/compartment-type"))
  case PRACTITIONER extends COMPARTMENT_TYPE("Practitioner", Some("Practitioner"), Some("http://hl7.org/fhir/compartment-type"))
  case RELATEDPERSON extends COMPARTMENT_TYPE("RelatedPerson", Some("RelatedPerson"), Some("http://hl7.org/fhir/compartment-type"))
}
object COMPARTMENT_TYPE extends EType[COMPARTMENT_TYPE]("http://hl7.org/fhir/ValueSet/compartment-type") 


enum COMPOSITION_ATTESTATION_MODE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case LEGAL extends COMPOSITION_ATTESTATION_MODE("legal", Some("Legal"), Some("http://hl7.org/fhir/composition-attestation-mode"))
  case OFFICIAL extends COMPOSITION_ATTESTATION_MODE("official", Some("Official"), Some("http://hl7.org/fhir/composition-attestation-mode"))
  case PERSONAL extends COMPOSITION_ATTESTATION_MODE("personal", Some("Personal"), Some("http://hl7.org/fhir/composition-attestation-mode"))
  case PROFESSIONAL extends COMPOSITION_ATTESTATION_MODE("professional", Some("Professional"), Some("http://hl7.org/fhir/composition-attestation-mode"))
}
object COMPOSITION_ATTESTATION_MODE extends EType[COMPOSITION_ATTESTATION_MODE]("http://hl7.org/fhir/ValueSet/composition-attestation-mode") 


enum COMPOSITION_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case AMENDED extends COMPOSITION_STATUS("amended", Some("Amended"), Some("http://hl7.org/fhir/composition-status"))
  case ENTERED_IN_ERROR extends COMPOSITION_STATUS("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/composition-status"))
  case FINAL extends COMPOSITION_STATUS("final", Some("Final"), Some("http://hl7.org/fhir/composition-status"))
  case PRELIMINARY extends COMPOSITION_STATUS("preliminary", Some("Preliminary"), Some("http://hl7.org/fhir/composition-status"))
}
object COMPOSITION_STATUS extends EType[COMPOSITION_STATUS]("http://hl7.org/fhir/ValueSet/composition-status") 


enum CONCEPTMAP_UNMAPPED_MODE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case FIXED extends CONCEPTMAP_UNMAPPED_MODE("fixed", Some("Fixed Code"), Some("http://hl7.org/fhir/conceptmap-unmapped-mode"))
  case OTHER_MAP extends CONCEPTMAP_UNMAPPED_MODE("other-map", Some("Other Map"), Some("http://hl7.org/fhir/conceptmap-unmapped-mode"))
  case PROVIDED extends CONCEPTMAP_UNMAPPED_MODE("provided", Some("Provided Code"), Some("http://hl7.org/fhir/conceptmap-unmapped-mode"))
}
object CONCEPTMAP_UNMAPPED_MODE extends EType[CONCEPTMAP_UNMAPPED_MODE]("http://hl7.org/fhir/ValueSet/conceptmap-unmapped-mode") 


enum CONCEPT_MAP_EQUIVALENCE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case DISJOINT extends CONCEPT_MAP_EQUIVALENCE("disjoint", Some("Disjoint"), Some("http://hl7.org/fhir/concept-map-equivalence"))
  case EQUAL extends CONCEPT_MAP_EQUIVALENCE("equal", Some("Equal"), Some("http://hl7.org/fhir/concept-map-equivalence"))
  case EQUIVALENT extends CONCEPT_MAP_EQUIVALENCE("equivalent", Some("Equivalent"), Some("http://hl7.org/fhir/concept-map-equivalence"))
  case INEXACT extends CONCEPT_MAP_EQUIVALENCE("inexact", Some("Inexact"), Some("http://hl7.org/fhir/concept-map-equivalence"))
  case NARROWER extends CONCEPT_MAP_EQUIVALENCE("narrower", Some("Narrower"), Some("http://hl7.org/fhir/concept-map-equivalence"))
  case RELATEDTO extends CONCEPT_MAP_EQUIVALENCE("relatedto", Some("Related To"), Some("http://hl7.org/fhir/concept-map-equivalence"))
  case SPECIALIZES extends CONCEPT_MAP_EQUIVALENCE("specializes", Some("Specializes"), Some("http://hl7.org/fhir/concept-map-equivalence"))
  case SUBSUMES extends CONCEPT_MAP_EQUIVALENCE("subsumes", Some("Subsumes"), Some("http://hl7.org/fhir/concept-map-equivalence"))
  case UNMATCHED extends CONCEPT_MAP_EQUIVALENCE("unmatched", Some("Unmatched"), Some("http://hl7.org/fhir/concept-map-equivalence"))
  case WIDER extends CONCEPT_MAP_EQUIVALENCE("wider", Some("Wider"), Some("http://hl7.org/fhir/concept-map-equivalence"))
}
object CONCEPT_MAP_EQUIVALENCE extends EType[CONCEPT_MAP_EQUIVALENCE]("http://hl7.org/fhir/ValueSet/concept-map-equivalence") 


enum CONCEPT_PROPERTY_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case BOOLEAN extends CONCEPT_PROPERTY_TYPE("boolean", Some("boolean"), Some("http://hl7.org/fhir/concept-property-type"))
  case CODE extends CONCEPT_PROPERTY_TYPE("code", Some("code (internal reference)"), Some("http://hl7.org/fhir/concept-property-type"))
  case CODING extends CONCEPT_PROPERTY_TYPE("Coding", Some("Coding (external reference)"), Some("http://hl7.org/fhir/concept-property-type"))
  case DATETIME extends CONCEPT_PROPERTY_TYPE("dateTime", Some("dateTime"), Some("http://hl7.org/fhir/concept-property-type"))
  case DECIMAL extends CONCEPT_PROPERTY_TYPE("decimal", Some("decimal"), Some("http://hl7.org/fhir/concept-property-type"))
  case INTEGER extends CONCEPT_PROPERTY_TYPE("integer", Some("integer"), Some("http://hl7.org/fhir/concept-property-type"))
  case STRING extends CONCEPT_PROPERTY_TYPE("string", Some("string"), Some("http://hl7.org/fhir/concept-property-type"))
}
object CONCEPT_PROPERTY_TYPE extends EType[CONCEPT_PROPERTY_TYPE]("http://hl7.org/fhir/ValueSet/concept-property-type") 


enum CONDITIONAL_DELETE_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case MULTIPLE extends CONDITIONAL_DELETE_STATUS("multiple", Some("Multiple Deletes Supported"), Some("http://hl7.org/fhir/conditional-delete-status"))
  case NOT_SUPPORTED extends CONDITIONAL_DELETE_STATUS("not-supported", Some("Not Supported"), Some("http://hl7.org/fhir/conditional-delete-status"))
  case SINGLE extends CONDITIONAL_DELETE_STATUS("single", Some("Single Deletes Supported"), Some("http://hl7.org/fhir/conditional-delete-status"))
}
object CONDITIONAL_DELETE_STATUS extends EType[CONDITIONAL_DELETE_STATUS]("http://hl7.org/fhir/ValueSet/conditional-delete-status") 


enum CONDITIONAL_READ_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case FULL_SUPPORT extends CONDITIONAL_READ_STATUS("full-support", Some("Full Support"), Some("http://hl7.org/fhir/conditional-read-status"))
  case IF_MODIFIED_SINCE extends CONDITIONAL_READ_STATUS("modified-since", Some("If-Modified-Since"), Some("http://hl7.org/fhir/conditional-read-status"))
  case IF_NONE_MATCH extends CONDITIONAL_READ_STATUS("not-match", Some("If-None-Match"), Some("http://hl7.org/fhir/conditional-read-status"))
  case NOT_SUPPORTED extends CONDITIONAL_READ_STATUS("not-supported", Some("Not Supported"), Some("http://hl7.org/fhir/conditional-read-status"))
}
object CONDITIONAL_READ_STATUS extends EType[CONDITIONAL_READ_STATUS]("http://hl7.org/fhir/ValueSet/conditional-read-status") 


enum CONSENT_DATA_MEANING(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case AUTHOREDBY extends CONSENT_DATA_MEANING("authoredby", Some("AuthoredBy"), Some("http://hl7.org/fhir/consent-data-meaning"))
  case DEPENDENTS extends CONSENT_DATA_MEANING("dependents", Some("Dependents"), Some("http://hl7.org/fhir/consent-data-meaning"))
  case INSTANCE extends CONSENT_DATA_MEANING("instance", Some("Instance"), Some("http://hl7.org/fhir/consent-data-meaning"))
  case RELATED extends CONSENT_DATA_MEANING("related", Some("Related"), Some("http://hl7.org/fhir/consent-data-meaning"))
}
object CONSENT_DATA_MEANING extends EType[CONSENT_DATA_MEANING]("http://hl7.org/fhir/ValueSet/consent-data-meaning") 


enum CONSENT_PROVISION_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case DENY extends CONSENT_PROVISION_TYPE("deny", Some("Opt Out"), Some("http://hl7.org/fhir/consent-provision-type"))
  case PERMIT extends CONSENT_PROVISION_TYPE("permit", Some("Opt In"), Some("http://hl7.org/fhir/consent-provision-type"))
}
object CONSENT_PROVISION_TYPE extends EType[CONSENT_PROVISION_TYPE]("http://hl7.org/fhir/ValueSet/consent-provision-type") 


enum CONSENT_STATE_CODES(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ACTIVE extends CONSENT_STATE_CODES("active", Some("Active"), Some("http://hl7.org/fhir/consent-state-codes"))
  case DRAFT extends CONSENT_STATE_CODES("draft", Some("Pending"), Some("http://hl7.org/fhir/consent-state-codes"))
  case ENTERED_IN_ERROR extends CONSENT_STATE_CODES("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/consent-state-codes"))
  case INACTIVE extends CONSENT_STATE_CODES("inactive", Some("Inactive"), Some("http://hl7.org/fhir/consent-state-codes"))
  case PROPOSED extends CONSENT_STATE_CODES("proposed", Some("Proposed"), Some("http://hl7.org/fhir/consent-state-codes"))
  case REJECTED extends CONSENT_STATE_CODES("rejected", Some("Rejected"), Some("http://hl7.org/fhir/consent-state-codes"))
}
object CONSENT_STATE_CODES extends EType[CONSENT_STATE_CODES]("http://hl7.org/fhir/ValueSet/consent-state-codes") 


enum CONSTRAINT_SEVERITY(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ERROR extends CONSTRAINT_SEVERITY("error", Some("Error"), Some("http://hl7.org/fhir/constraint-severity"))
  case WARNING extends CONSTRAINT_SEVERITY("warning", Some("Warning"), Some("http://hl7.org/fhir/constraint-severity"))
}
object CONSTRAINT_SEVERITY extends EType[CONSTRAINT_SEVERITY]("http://hl7.org/fhir/ValueSet/constraint-severity") 


enum CONTRACT_PUBLICATIONSTATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case AMENDED extends CONTRACT_PUBLICATIONSTATUS("amended", Some("Amended"), Some("http://hl7.org/fhir/contract-publicationstatus"))
  case APPENDED extends CONTRACT_PUBLICATIONSTATUS("appended", Some("Appended"), Some("http://hl7.org/fhir/contract-publicationstatus"))
  case CANCELLED extends CONTRACT_PUBLICATIONSTATUS("cancelled", Some("Cancelled"), Some("http://hl7.org/fhir/contract-publicationstatus"))
  case DISPUTED extends CONTRACT_PUBLICATIONSTATUS("disputed", Some("Disputed"), Some("http://hl7.org/fhir/contract-publicationstatus"))
  case ENTERED_IN_ERROR extends CONTRACT_PUBLICATIONSTATUS("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/contract-publicationstatus"))
  case EXECUTABLE extends CONTRACT_PUBLICATIONSTATUS("executable", Some("Executable"), Some("http://hl7.org/fhir/contract-publicationstatus"))
  case EXECUTED extends CONTRACT_PUBLICATIONSTATUS("executed", Some("Executed"), Some("http://hl7.org/fhir/contract-publicationstatus"))
  case NEGOTIABLE extends CONTRACT_PUBLICATIONSTATUS("negotiable", Some("Negotiable"), Some("http://hl7.org/fhir/contract-publicationstatus"))
  case OFFERED extends CONTRACT_PUBLICATIONSTATUS("offered", Some("Offered"), Some("http://hl7.org/fhir/contract-publicationstatus"))
  case POLICY extends CONTRACT_PUBLICATIONSTATUS("policy", Some("Policy"), Some("http://hl7.org/fhir/contract-publicationstatus"))
  case REJECTED extends CONTRACT_PUBLICATIONSTATUS("rejected", Some("Rejected"), Some("http://hl7.org/fhir/contract-publicationstatus"))
  case RENEWED extends CONTRACT_PUBLICATIONSTATUS("renewed", Some("Renewed"), Some("http://hl7.org/fhir/contract-publicationstatus"))
  case RESOLVED extends CONTRACT_PUBLICATIONSTATUS("resolved", Some("Resolved"), Some("http://hl7.org/fhir/contract-publicationstatus"))
  case REVOKED extends CONTRACT_PUBLICATIONSTATUS("revoked", Some("Revoked"), Some("http://hl7.org/fhir/contract-publicationstatus"))
  case TERMINATED extends CONTRACT_PUBLICATIONSTATUS("terminated", Some("Terminated"), Some("http://hl7.org/fhir/contract-publicationstatus"))
}
object CONTRACT_PUBLICATIONSTATUS extends EType[CONTRACT_PUBLICATIONSTATUS]("http://hl7.org/fhir/ValueSet/contract-publicationstatus") 


enum CONTRACT_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case AMENDED extends CONTRACT_STATUS("amended", Some("Amended"), Some("http://hl7.org/fhir/contract-status"))
  case APPENDED extends CONTRACT_STATUS("appended", Some("Appended"), Some("http://hl7.org/fhir/contract-status"))
  case CANCELLED extends CONTRACT_STATUS("cancelled", Some("Cancelled"), Some("http://hl7.org/fhir/contract-status"))
  case DISPUTED extends CONTRACT_STATUS("disputed", Some("Disputed"), Some("http://hl7.org/fhir/contract-status"))
  case ENTERED_IN_ERROR extends CONTRACT_STATUS("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/contract-status"))
  case EXECUTABLE extends CONTRACT_STATUS("executable", Some("Executable"), Some("http://hl7.org/fhir/contract-status"))
  case EXECUTED extends CONTRACT_STATUS("executed", Some("Executed"), Some("http://hl7.org/fhir/contract-status"))
  case NEGOTIABLE extends CONTRACT_STATUS("negotiable", Some("Negotiable"), Some("http://hl7.org/fhir/contract-status"))
  case OFFERED extends CONTRACT_STATUS("offered", Some("Offered"), Some("http://hl7.org/fhir/contract-status"))
  case POLICY extends CONTRACT_STATUS("policy", Some("Policy"), Some("http://hl7.org/fhir/contract-status"))
  case REJECTED extends CONTRACT_STATUS("rejected", Some("Rejected"), Some("http://hl7.org/fhir/contract-status"))
  case RENEWED extends CONTRACT_STATUS("renewed", Some("Renewed"), Some("http://hl7.org/fhir/contract-status"))
  case RESOLVED extends CONTRACT_STATUS("resolved", Some("Resolved"), Some("http://hl7.org/fhir/contract-status"))
  case REVOKED extends CONTRACT_STATUS("revoked", Some("Revoked"), Some("http://hl7.org/fhir/contract-status"))
  case TERMINATED extends CONTRACT_STATUS("terminated", Some("Terminated"), Some("http://hl7.org/fhir/contract-status"))
}
object CONTRACT_STATUS extends EType[CONTRACT_STATUS]("http://hl7.org/fhir/ValueSet/contract-status") 


enum DEFINED_TYPES(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ACCOUNT extends DEFINED_TYPES("Account", Some("Account"), Some("http://hl7.org/fhir/resource-types"))
  case ACTIVITYDEFINITION extends DEFINED_TYPES("ActivityDefinition", Some("ActivityDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case ADDRESS extends DEFINED_TYPES("Address", Some("Address"), Some("http://hl7.org/fhir/data-types"))
  case ADVERSEEVENT extends DEFINED_TYPES("AdverseEvent", Some("AdverseEvent"), Some("http://hl7.org/fhir/resource-types"))
  case AGE extends DEFINED_TYPES("Age", Some("Age"), Some("http://hl7.org/fhir/data-types"))
  case ALLERGYINTOLERANCE extends DEFINED_TYPES("AllergyIntolerance", Some("AllergyIntolerance"), Some("http://hl7.org/fhir/resource-types"))
  case ANNOTATION extends DEFINED_TYPES("Annotation", Some("Annotation"), Some("http://hl7.org/fhir/data-types"))
  case APPOINTMENT extends DEFINED_TYPES("Appointment", Some("Appointment"), Some("http://hl7.org/fhir/resource-types"))
  case APPOINTMENTRESPONSE extends DEFINED_TYPES("AppointmentResponse", Some("AppointmentResponse"), Some("http://hl7.org/fhir/resource-types"))
  case ATTACHMENT extends DEFINED_TYPES("Attachment", Some("Attachment"), Some("http://hl7.org/fhir/data-types"))
  case AUDITEVENT extends DEFINED_TYPES("AuditEvent", Some("AuditEvent"), Some("http://hl7.org/fhir/resource-types"))
  case BACKBONEELEMENT extends DEFINED_TYPES("BackboneElement", Some("BackboneElement"), Some("http://hl7.org/fhir/data-types"))
  case BASE64BINARY extends DEFINED_TYPES("base64Binary", Some("base64Binary"), Some("http://hl7.org/fhir/data-types"))
  case BASIC extends DEFINED_TYPES("Basic", Some("Basic"), Some("http://hl7.org/fhir/resource-types"))
  case BINARY extends DEFINED_TYPES("Binary", Some("Binary"), Some("http://hl7.org/fhir/resource-types"))
  case BIOLOGICALLYDERIVEDPRODUCT extends DEFINED_TYPES("BiologicallyDerivedProduct", Some("BiologicallyDerivedProduct"), Some("http://hl7.org/fhir/resource-types"))
  case BODYSTRUCTURE extends DEFINED_TYPES("BodyStructure", Some("BodyStructure"), Some("http://hl7.org/fhir/resource-types"))
  case BOOLEAN extends DEFINED_TYPES("boolean", Some("boolean"), Some("http://hl7.org/fhir/data-types"))
  case BUNDLE extends DEFINED_TYPES("Bundle", Some("Bundle"), Some("http://hl7.org/fhir/resource-types"))
  case CANONICAL extends DEFINED_TYPES("canonical", Some("canonical"), Some("http://hl7.org/fhir/data-types"))
  case CAPABILITYSTATEMENT extends DEFINED_TYPES("CapabilityStatement", Some("CapabilityStatement"), Some("http://hl7.org/fhir/resource-types"))
  case CAREPLAN extends DEFINED_TYPES("CarePlan", Some("CarePlan"), Some("http://hl7.org/fhir/resource-types"))
  case CARETEAM extends DEFINED_TYPES("CareTeam", Some("CareTeam"), Some("http://hl7.org/fhir/resource-types"))
  case CATALOGENTRY extends DEFINED_TYPES("CatalogEntry", Some("CatalogEntry"), Some("http://hl7.org/fhir/resource-types"))
  case CHARGEITEM extends DEFINED_TYPES("ChargeItem", Some("ChargeItem"), Some("http://hl7.org/fhir/resource-types"))
  case CHARGEITEMDEFINITION extends DEFINED_TYPES("ChargeItemDefinition", Some("ChargeItemDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case CLAIM extends DEFINED_TYPES("Claim", Some("Claim"), Some("http://hl7.org/fhir/resource-types"))
  case CLAIMRESPONSE extends DEFINED_TYPES("ClaimResponse", Some("ClaimResponse"), Some("http://hl7.org/fhir/resource-types"))
  case CLINICALIMPRESSION extends DEFINED_TYPES("ClinicalImpression", Some("ClinicalImpression"), Some("http://hl7.org/fhir/resource-types"))
  case CODE extends DEFINED_TYPES("code", Some("code"), Some("http://hl7.org/fhir/data-types"))
  case CODEABLECONCEPT extends DEFINED_TYPES("CodeableConcept", Some("CodeableConcept"), Some("http://hl7.org/fhir/data-types"))
  case CODESYSTEM extends DEFINED_TYPES("CodeSystem", Some("CodeSystem"), Some("http://hl7.org/fhir/resource-types"))
  case CODING extends DEFINED_TYPES("Coding", Some("Coding"), Some("http://hl7.org/fhir/data-types"))
  case COMMUNICATION extends DEFINED_TYPES("Communication", Some("Communication"), Some("http://hl7.org/fhir/resource-types"))
  case COMMUNICATIONREQUEST extends DEFINED_TYPES("CommunicationRequest", Some("CommunicationRequest"), Some("http://hl7.org/fhir/resource-types"))
  case COMPARTMENTDEFINITION extends DEFINED_TYPES("CompartmentDefinition", Some("CompartmentDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case COMPOSITION extends DEFINED_TYPES("Composition", Some("Composition"), Some("http://hl7.org/fhir/resource-types"))
  case CONCEPTMAP extends DEFINED_TYPES("ConceptMap", Some("ConceptMap"), Some("http://hl7.org/fhir/resource-types"))
  case CONDITION extends DEFINED_TYPES("Condition", Some("Condition"), Some("http://hl7.org/fhir/resource-types"))
  case CONSENT extends DEFINED_TYPES("Consent", Some("Consent"), Some("http://hl7.org/fhir/resource-types"))
  case CONTACTDETAIL extends DEFINED_TYPES("ContactDetail", Some("ContactDetail"), Some("http://hl7.org/fhir/data-types"))
  case CONTACTPOINT extends DEFINED_TYPES("ContactPoint", Some("ContactPoint"), Some("http://hl7.org/fhir/data-types"))
  case CONTRACT extends DEFINED_TYPES("Contract", Some("Contract"), Some("http://hl7.org/fhir/resource-types"))
  case CONTRIBUTOR extends DEFINED_TYPES("Contributor", Some("Contributor"), Some("http://hl7.org/fhir/data-types"))
  case COUNT extends DEFINED_TYPES("Count", Some("Count"), Some("http://hl7.org/fhir/data-types"))
  case COVERAGE extends DEFINED_TYPES("Coverage", Some("Coverage"), Some("http://hl7.org/fhir/resource-types"))
  case COVERAGEELIGIBILITYREQUEST extends DEFINED_TYPES("CoverageEligibilityRequest", Some("CoverageEligibilityRequest"), Some("http://hl7.org/fhir/resource-types"))
  case COVERAGEELIGIBILITYRESPONSE extends DEFINED_TYPES("CoverageEligibilityResponse", Some("CoverageEligibilityResponse"), Some("http://hl7.org/fhir/resource-types"))
  case DATAREQUIREMENT extends DEFINED_TYPES("DataRequirement", Some("DataRequirement"), Some("http://hl7.org/fhir/data-types"))
  case DATE extends DEFINED_TYPES("date", Some("date"), Some("http://hl7.org/fhir/data-types"))
  case DATETIME extends DEFINED_TYPES("dateTime", Some("dateTime"), Some("http://hl7.org/fhir/data-types"))
  case DECIMAL extends DEFINED_TYPES("decimal", Some("decimal"), Some("http://hl7.org/fhir/data-types"))
  case DETECTEDISSUE extends DEFINED_TYPES("DetectedIssue", Some("DetectedIssue"), Some("http://hl7.org/fhir/resource-types"))
  case DEVICE extends DEFINED_TYPES("Device", Some("Device"), Some("http://hl7.org/fhir/resource-types"))
  case DEVICEDEFINITION extends DEFINED_TYPES("DeviceDefinition", Some("DeviceDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case DEVICEMETRIC extends DEFINED_TYPES("DeviceMetric", Some("DeviceMetric"), Some("http://hl7.org/fhir/resource-types"))
  case DEVICEREQUEST extends DEFINED_TYPES("DeviceRequest", Some("DeviceRequest"), Some("http://hl7.org/fhir/resource-types"))
  case DEVICEUSESTATEMENT extends DEFINED_TYPES("DeviceUseStatement", Some("DeviceUseStatement"), Some("http://hl7.org/fhir/resource-types"))
  case DIAGNOSTICREPORT extends DEFINED_TYPES("DiagnosticReport", Some("DiagnosticReport"), Some("http://hl7.org/fhir/resource-types"))
  case DISTANCE extends DEFINED_TYPES("Distance", Some("Distance"), Some("http://hl7.org/fhir/data-types"))
  case DOCUMENTMANIFEST extends DEFINED_TYPES("DocumentManifest", Some("DocumentManifest"), Some("http://hl7.org/fhir/resource-types"))
  case DOCUMENTREFERENCE extends DEFINED_TYPES("DocumentReference", Some("DocumentReference"), Some("http://hl7.org/fhir/resource-types"))
  case DOMAINRESOURCE extends DEFINED_TYPES("DomainResource", Some("DomainResource"), Some("http://hl7.org/fhir/resource-types"))
  case DOSAGE extends DEFINED_TYPES("Dosage", Some("Dosage"), Some("http://hl7.org/fhir/data-types"))
  case DURATION extends DEFINED_TYPES("Duration", Some("Duration"), Some("http://hl7.org/fhir/data-types"))
  case EFFECTEVIDENCESYNTHESIS extends DEFINED_TYPES("EffectEvidenceSynthesis", Some("EffectEvidenceSynthesis"), Some("http://hl7.org/fhir/resource-types"))
  case ELEMENT extends DEFINED_TYPES("Element", Some("Element"), Some("http://hl7.org/fhir/data-types"))
  case ELEMENTDEFINITION extends DEFINED_TYPES("ElementDefinition", Some("ElementDefinition"), Some("http://hl7.org/fhir/data-types"))
  case ENCOUNTER extends DEFINED_TYPES("Encounter", Some("Encounter"), Some("http://hl7.org/fhir/resource-types"))
  case ENDPOINT extends DEFINED_TYPES("Endpoint", Some("Endpoint"), Some("http://hl7.org/fhir/resource-types"))
  case ENROLLMENTREQUEST extends DEFINED_TYPES("EnrollmentRequest", Some("EnrollmentRequest"), Some("http://hl7.org/fhir/resource-types"))
  case ENROLLMENTRESPONSE extends DEFINED_TYPES("EnrollmentResponse", Some("EnrollmentResponse"), Some("http://hl7.org/fhir/resource-types"))
  case EPISODEOFCARE extends DEFINED_TYPES("EpisodeOfCare", Some("EpisodeOfCare"), Some("http://hl7.org/fhir/resource-types"))
  case EVENTDEFINITION extends DEFINED_TYPES("EventDefinition", Some("EventDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case EVIDENCE extends DEFINED_TYPES("Evidence", Some("Evidence"), Some("http://hl7.org/fhir/resource-types"))
  case EVIDENCEVARIABLE extends DEFINED_TYPES("EvidenceVariable", Some("EvidenceVariable"), Some("http://hl7.org/fhir/resource-types"))
  case EXAMPLESCENARIO extends DEFINED_TYPES("ExampleScenario", Some("ExampleScenario"), Some("http://hl7.org/fhir/resource-types"))
  case EXPLANATIONOFBENEFIT extends DEFINED_TYPES("ExplanationOfBenefit", Some("ExplanationOfBenefit"), Some("http://hl7.org/fhir/resource-types"))
  case EXPRESSION extends DEFINED_TYPES("Expression", Some("Expression"), Some("http://hl7.org/fhir/data-types"))
  case EXTENSION extends DEFINED_TYPES("Extension", Some("Extension"), Some("http://hl7.org/fhir/data-types"))
  case FAMILYMEMBERHISTORY extends DEFINED_TYPES("FamilyMemberHistory", Some("FamilyMemberHistory"), Some("http://hl7.org/fhir/resource-types"))
  case FLAG extends DEFINED_TYPES("Flag", Some("Flag"), Some("http://hl7.org/fhir/resource-types"))
  case GOAL extends DEFINED_TYPES("Goal", Some("Goal"), Some("http://hl7.org/fhir/resource-types"))
  case GRAPHDEFINITION extends DEFINED_TYPES("GraphDefinition", Some("GraphDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case GROUP extends DEFINED_TYPES("Group", Some("Group"), Some("http://hl7.org/fhir/resource-types"))
  case GUIDANCERESPONSE extends DEFINED_TYPES("GuidanceResponse", Some("GuidanceResponse"), Some("http://hl7.org/fhir/resource-types"))
  case HEALTHCARESERVICE extends DEFINED_TYPES("HealthcareService", Some("HealthcareService"), Some("http://hl7.org/fhir/resource-types"))
  case HUMANNAME extends DEFINED_TYPES("HumanName", Some("HumanName"), Some("http://hl7.org/fhir/data-types"))
  case ID extends DEFINED_TYPES("id", Some("id"), Some("http://hl7.org/fhir/data-types"))
  case IDENTIFIER extends DEFINED_TYPES("Identifier", Some("Identifier"), Some("http://hl7.org/fhir/data-types"))
  case IMAGINGSTUDY extends DEFINED_TYPES("ImagingStudy", Some("ImagingStudy"), Some("http://hl7.org/fhir/resource-types"))
  case IMMUNIZATION extends DEFINED_TYPES("Immunization", Some("Immunization"), Some("http://hl7.org/fhir/resource-types"))
  case IMMUNIZATIONEVALUATION extends DEFINED_TYPES("ImmunizationEvaluation", Some("ImmunizationEvaluation"), Some("http://hl7.org/fhir/resource-types"))
  case IMMUNIZATIONRECOMMENDATION extends DEFINED_TYPES("ImmunizationRecommendation", Some("ImmunizationRecommendation"), Some("http://hl7.org/fhir/resource-types"))
  case IMPLEMENTATIONGUIDE extends DEFINED_TYPES("ImplementationGuide", Some("ImplementationGuide"), Some("http://hl7.org/fhir/resource-types"))
  case INSTANT extends DEFINED_TYPES("instant", Some("instant"), Some("http://hl7.org/fhir/data-types"))
  case INSURANCEPLAN extends DEFINED_TYPES("InsurancePlan", Some("InsurancePlan"), Some("http://hl7.org/fhir/resource-types"))
  case INTEGER extends DEFINED_TYPES("integer", Some("integer"), Some("http://hl7.org/fhir/data-types"))
  case INVOICE extends DEFINED_TYPES("Invoice", Some("Invoice"), Some("http://hl7.org/fhir/resource-types"))
  case LIBRARY extends DEFINED_TYPES("Library", Some("Library"), Some("http://hl7.org/fhir/resource-types"))
  case LINKAGE extends DEFINED_TYPES("Linkage", Some("Linkage"), Some("http://hl7.org/fhir/resource-types"))
  case LIST extends DEFINED_TYPES("List", Some("List"), Some("http://hl7.org/fhir/resource-types"))
  case LOCATION extends DEFINED_TYPES("Location", Some("Location"), Some("http://hl7.org/fhir/resource-types"))
  case MARKDOWN extends DEFINED_TYPES("markdown", Some("markdown"), Some("http://hl7.org/fhir/data-types"))
  case MARKETINGSTATUS extends DEFINED_TYPES("MarketingStatus", Some("MarketingStatus"), Some("http://hl7.org/fhir/data-types"))
  case MEASURE extends DEFINED_TYPES("Measure", Some("Measure"), Some("http://hl7.org/fhir/resource-types"))
  case MEASUREREPORT extends DEFINED_TYPES("MeasureReport", Some("MeasureReport"), Some("http://hl7.org/fhir/resource-types"))
  case MEDIA extends DEFINED_TYPES("Media", Some("Media"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICATION extends DEFINED_TYPES("Medication", Some("Medication"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICATIONADMINISTRATION extends DEFINED_TYPES("MedicationAdministration", Some("MedicationAdministration"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICATIONDISPENSE extends DEFINED_TYPES("MedicationDispense", Some("MedicationDispense"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICATIONKNOWLEDGE extends DEFINED_TYPES("MedicationKnowledge", Some("MedicationKnowledge"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICATIONREQUEST extends DEFINED_TYPES("MedicationRequest", Some("MedicationRequest"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICATIONSTATEMENT extends DEFINED_TYPES("MedicationStatement", Some("MedicationStatement"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICINALPRODUCT extends DEFINED_TYPES("MedicinalProduct", Some("MedicinalProduct"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICINALPRODUCTAUTHORIZATION extends DEFINED_TYPES("MedicinalProductAuthorization", Some("MedicinalProductAuthorization"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICINALPRODUCTCONTRAINDICATION extends DEFINED_TYPES("MedicinalProductContraindication", Some("MedicinalProductContraindication"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICINALPRODUCTINDICATION extends DEFINED_TYPES("MedicinalProductIndication", Some("MedicinalProductIndication"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICINALPRODUCTINGREDIENT extends DEFINED_TYPES("MedicinalProductIngredient", Some("MedicinalProductIngredient"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICINALPRODUCTINTERACTION extends DEFINED_TYPES("MedicinalProductInteraction", Some("MedicinalProductInteraction"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICINALPRODUCTMANUFACTURED extends DEFINED_TYPES("MedicinalProductManufactured", Some("MedicinalProductManufactured"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICINALPRODUCTPACKAGED extends DEFINED_TYPES("MedicinalProductPackaged", Some("MedicinalProductPackaged"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICINALPRODUCTPHARMACEUTICAL extends DEFINED_TYPES("MedicinalProductPharmaceutical", Some("MedicinalProductPharmaceutical"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICINALPRODUCTUNDESIRABLEEFFECT extends DEFINED_TYPES("MedicinalProductUndesirableEffect", Some("MedicinalProductUndesirableEffect"), Some("http://hl7.org/fhir/resource-types"))
  case MESSAGEDEFINITION extends DEFINED_TYPES("MessageDefinition", Some("MessageDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case MESSAGEHEADER extends DEFINED_TYPES("MessageHeader", Some("MessageHeader"), Some("http://hl7.org/fhir/resource-types"))
  case META extends DEFINED_TYPES("Meta", Some("Meta"), Some("http://hl7.org/fhir/data-types"))
  case MOLECULARSEQUENCE extends DEFINED_TYPES("MolecularSequence", Some("MolecularSequence"), Some("http://hl7.org/fhir/resource-types"))
  case MONEY extends DEFINED_TYPES("Money", Some("Money"), Some("http://hl7.org/fhir/data-types"))
  case MONEYQUANTITY extends DEFINED_TYPES("MoneyQuantity", Some("MoneyQuantity"), Some("http://hl7.org/fhir/data-types"))
  case NAMINGSYSTEM extends DEFINED_TYPES("NamingSystem", Some("NamingSystem"), Some("http://hl7.org/fhir/resource-types"))
  case NARRATIVE extends DEFINED_TYPES("Narrative", Some("Narrative"), Some("http://hl7.org/fhir/data-types"))
  case NUTRITIONORDER extends DEFINED_TYPES("NutritionOrder", Some("NutritionOrder"), Some("http://hl7.org/fhir/resource-types"))
  case OBSERVATION extends DEFINED_TYPES("Observation", Some("Observation"), Some("http://hl7.org/fhir/resource-types"))
  case OBSERVATIONDEFINITION extends DEFINED_TYPES("ObservationDefinition", Some("ObservationDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case OID extends DEFINED_TYPES("oid", Some("oid"), Some("http://hl7.org/fhir/data-types"))
  case OPERATIONDEFINITION extends DEFINED_TYPES("OperationDefinition", Some("OperationDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case OPERATIONOUTCOME extends DEFINED_TYPES("OperationOutcome", Some("OperationOutcome"), Some("http://hl7.org/fhir/resource-types"))
  case ORGANIZATION extends DEFINED_TYPES("Organization", Some("Organization"), Some("http://hl7.org/fhir/resource-types"))
  case ORGANIZATIONAFFILIATION extends DEFINED_TYPES("OrganizationAffiliation", Some("OrganizationAffiliation"), Some("http://hl7.org/fhir/resource-types"))
  case PARAMETERDEFINITION extends DEFINED_TYPES("ParameterDefinition", Some("ParameterDefinition"), Some("http://hl7.org/fhir/data-types"))
  case PARAMETERS extends DEFINED_TYPES("Parameters", Some("Parameters"), Some("http://hl7.org/fhir/resource-types"))
  case PATIENT extends DEFINED_TYPES("Patient", Some("Patient"), Some("http://hl7.org/fhir/resource-types"))
  case PAYMENTNOTICE extends DEFINED_TYPES("PaymentNotice", Some("PaymentNotice"), Some("http://hl7.org/fhir/resource-types"))
  case PAYMENTRECONCILIATION extends DEFINED_TYPES("PaymentReconciliation", Some("PaymentReconciliation"), Some("http://hl7.org/fhir/resource-types"))
  case PERIOD extends DEFINED_TYPES("Period", Some("Period"), Some("http://hl7.org/fhir/data-types"))
  case PERSON extends DEFINED_TYPES("Person", Some("Person"), Some("http://hl7.org/fhir/resource-types"))
  case PLANDEFINITION extends DEFINED_TYPES("PlanDefinition", Some("PlanDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case POPULATION extends DEFINED_TYPES("Population", Some("Population"), Some("http://hl7.org/fhir/data-types"))
  case POSITIVEINT extends DEFINED_TYPES("positiveInt", Some("positiveInt"), Some("http://hl7.org/fhir/data-types"))
  case PRACTITIONER extends DEFINED_TYPES("Practitioner", Some("Practitioner"), Some("http://hl7.org/fhir/resource-types"))
  case PRACTITIONERROLE extends DEFINED_TYPES("PractitionerRole", Some("PractitionerRole"), Some("http://hl7.org/fhir/resource-types"))
  case PROCEDURE extends DEFINED_TYPES("Procedure", Some("Procedure"), Some("http://hl7.org/fhir/resource-types"))
  case PRODCHARACTERISTIC extends DEFINED_TYPES("ProdCharacteristic", Some("ProdCharacteristic"), Some("http://hl7.org/fhir/data-types"))
  case PRODUCTSHELFLIFE extends DEFINED_TYPES("ProductShelfLife", Some("ProductShelfLife"), Some("http://hl7.org/fhir/data-types"))
  case PROVENANCE extends DEFINED_TYPES("Provenance", Some("Provenance"), Some("http://hl7.org/fhir/resource-types"))
  case QUANTITY extends DEFINED_TYPES("Quantity", Some("Quantity"), Some("http://hl7.org/fhir/data-types"))
  case QUESTIONNAIRE extends DEFINED_TYPES("Questionnaire", Some("Questionnaire"), Some("http://hl7.org/fhir/resource-types"))
  case QUESTIONNAIRERESPONSE extends DEFINED_TYPES("QuestionnaireResponse", Some("QuestionnaireResponse"), Some("http://hl7.org/fhir/resource-types"))
  case RANGE extends DEFINED_TYPES("Range", Some("Range"), Some("http://hl7.org/fhir/data-types"))
  case RATIO extends DEFINED_TYPES("Ratio", Some("Ratio"), Some("http://hl7.org/fhir/data-types"))
  case REFERENCE extends DEFINED_TYPES("Reference", Some("Reference"), Some("http://hl7.org/fhir/data-types"))
  case RELATEDARTIFACT extends DEFINED_TYPES("RelatedArtifact", Some("RelatedArtifact"), Some("http://hl7.org/fhir/data-types"))
  case RELATEDPERSON extends DEFINED_TYPES("RelatedPerson", Some("RelatedPerson"), Some("http://hl7.org/fhir/resource-types"))
  case REQUESTGROUP extends DEFINED_TYPES("RequestGroup", Some("RequestGroup"), Some("http://hl7.org/fhir/resource-types"))
  case RESEARCHDEFINITION extends DEFINED_TYPES("ResearchDefinition", Some("ResearchDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case RESEARCHELEMENTDEFINITION extends DEFINED_TYPES("ResearchElementDefinition", Some("ResearchElementDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case RESEARCHSTUDY extends DEFINED_TYPES("ResearchStudy", Some("ResearchStudy"), Some("http://hl7.org/fhir/resource-types"))
  case RESEARCHSUBJECT extends DEFINED_TYPES("ResearchSubject", Some("ResearchSubject"), Some("http://hl7.org/fhir/resource-types"))
  case RESOURCE extends DEFINED_TYPES("Resource", Some("Resource"), Some("http://hl7.org/fhir/resource-types"))
  case RISKASSESSMENT extends DEFINED_TYPES("RiskAssessment", Some("RiskAssessment"), Some("http://hl7.org/fhir/resource-types"))
  case RISKEVIDENCESYNTHESIS extends DEFINED_TYPES("RiskEvidenceSynthesis", Some("RiskEvidenceSynthesis"), Some("http://hl7.org/fhir/resource-types"))
  case SAMPLEDDATA extends DEFINED_TYPES("SampledData", Some("SampledData"), Some("http://hl7.org/fhir/data-types"))
  case SCHEDULE extends DEFINED_TYPES("Schedule", Some("Schedule"), Some("http://hl7.org/fhir/resource-types"))
  case SEARCHPARAMETER extends DEFINED_TYPES("SearchParameter", Some("SearchParameter"), Some("http://hl7.org/fhir/resource-types"))
  case SERVICEREQUEST extends DEFINED_TYPES("ServiceRequest", Some("ServiceRequest"), Some("http://hl7.org/fhir/resource-types"))
  case SIGNATURE extends DEFINED_TYPES("Signature", Some("Signature"), Some("http://hl7.org/fhir/data-types"))
  case SIMPLEQUANTITY extends DEFINED_TYPES("SimpleQuantity", Some("SimpleQuantity"), Some("http://hl7.org/fhir/data-types"))
  case SLOT extends DEFINED_TYPES("Slot", Some("Slot"), Some("http://hl7.org/fhir/resource-types"))
  case SPECIMEN extends DEFINED_TYPES("Specimen", Some("Specimen"), Some("http://hl7.org/fhir/resource-types"))
  case SPECIMENDEFINITION extends DEFINED_TYPES("SpecimenDefinition", Some("SpecimenDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case STRING extends DEFINED_TYPES("string", Some("string"), Some("http://hl7.org/fhir/data-types"))
  case STRUCTUREDEFINITION extends DEFINED_TYPES("StructureDefinition", Some("StructureDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case STRUCTUREMAP extends DEFINED_TYPES("StructureMap", Some("StructureMap"), Some("http://hl7.org/fhir/resource-types"))
  case SUBSCRIPTION extends DEFINED_TYPES("Subscription", Some("Subscription"), Some("http://hl7.org/fhir/resource-types"))
  case SUBSTANCE extends DEFINED_TYPES("Substance", Some("Substance"), Some("http://hl7.org/fhir/resource-types"))
  case SUBSTANCEAMOUNT extends DEFINED_TYPES("SubstanceAmount", Some("SubstanceAmount"), Some("http://hl7.org/fhir/data-types"))
  case SUBSTANCENUCLEICACID extends DEFINED_TYPES("SubstanceNucleicAcid", Some("SubstanceNucleicAcid"), Some("http://hl7.org/fhir/resource-types"))
  case SUBSTANCEPOLYMER extends DEFINED_TYPES("SubstancePolymer", Some("SubstancePolymer"), Some("http://hl7.org/fhir/resource-types"))
  case SUBSTANCEPROTEIN extends DEFINED_TYPES("SubstanceProtein", Some("SubstanceProtein"), Some("http://hl7.org/fhir/resource-types"))
  case SUBSTANCEREFERENCEINFORMATION extends DEFINED_TYPES("SubstanceReferenceInformation", Some("SubstanceReferenceInformation"), Some("http://hl7.org/fhir/resource-types"))
  case SUBSTANCESOURCEMATERIAL extends DEFINED_TYPES("SubstanceSourceMaterial", Some("SubstanceSourceMaterial"), Some("http://hl7.org/fhir/resource-types"))
  case SUBSTANCESPECIFICATION extends DEFINED_TYPES("SubstanceSpecification", Some("SubstanceSpecification"), Some("http://hl7.org/fhir/resource-types"))
  case SUPPLYDELIVERY extends DEFINED_TYPES("SupplyDelivery", Some("SupplyDelivery"), Some("http://hl7.org/fhir/resource-types"))
  case SUPPLYREQUEST extends DEFINED_TYPES("SupplyRequest", Some("SupplyRequest"), Some("http://hl7.org/fhir/resource-types"))
  case TASK extends DEFINED_TYPES("Task", Some("Task"), Some("http://hl7.org/fhir/resource-types"))
  case TERMINOLOGYCAPABILITIES extends DEFINED_TYPES("TerminologyCapabilities", Some("TerminologyCapabilities"), Some("http://hl7.org/fhir/resource-types"))
  case TESTREPORT extends DEFINED_TYPES("TestReport", Some("TestReport"), Some("http://hl7.org/fhir/resource-types"))
  case TESTSCRIPT extends DEFINED_TYPES("TestScript", Some("TestScript"), Some("http://hl7.org/fhir/resource-types"))
  case TIME extends DEFINED_TYPES("time", Some("time"), Some("http://hl7.org/fhir/data-types"))
  case TIMING extends DEFINED_TYPES("Timing", Some("Timing"), Some("http://hl7.org/fhir/data-types"))
  case TRIGGERDEFINITION extends DEFINED_TYPES("TriggerDefinition", Some("TriggerDefinition"), Some("http://hl7.org/fhir/data-types"))
  case UNSIGNEDINT extends DEFINED_TYPES("unsignedInt", Some("unsignedInt"), Some("http://hl7.org/fhir/data-types"))
  case URI extends DEFINED_TYPES("uri", Some("uri"), Some("http://hl7.org/fhir/data-types"))
  case URL extends DEFINED_TYPES("url", Some("url"), Some("http://hl7.org/fhir/data-types"))
  case USAGECONTEXT extends DEFINED_TYPES("UsageContext", Some("UsageContext"), Some("http://hl7.org/fhir/data-types"))
  case UUID extends DEFINED_TYPES("uuid", Some("uuid"), Some("http://hl7.org/fhir/data-types"))
  case VALUESET extends DEFINED_TYPES("ValueSet", Some("ValueSet"), Some("http://hl7.org/fhir/resource-types"))
  case VERIFICATIONRESULT extends DEFINED_TYPES("VerificationResult", Some("VerificationResult"), Some("http://hl7.org/fhir/resource-types"))
  case VISIONPRESCRIPTION extends DEFINED_TYPES("VisionPrescription", Some("VisionPrescription"), Some("http://hl7.org/fhir/resource-types"))
  case XHTML extends DEFINED_TYPES("xhtml", Some("XHTML"), Some("http://hl7.org/fhir/data-types"))
}
object DEFINED_TYPES extends EType[DEFINED_TYPES]("http://hl7.org/fhir/ValueSet/defined-types") 


enum DETECTEDISSUE_SEVERITY(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case HIGH extends DETECTEDISSUE_SEVERITY("high", Some("High"), Some("http://hl7.org/fhir/detectedissue-severity"))
  case LOW extends DETECTEDISSUE_SEVERITY("low", Some("Low"), Some("http://hl7.org/fhir/detectedissue-severity"))
  case MODERATE extends DETECTEDISSUE_SEVERITY("moderate", Some("Moderate"), Some("http://hl7.org/fhir/detectedissue-severity"))
}
object DETECTEDISSUE_SEVERITY extends EType[DETECTEDISSUE_SEVERITY]("http://hl7.org/fhir/ValueSet/detectedissue-severity") 


enum DEVICE_NAMETYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case MANUFACTURER_NAME extends DEVICE_NAMETYPE("manufacturer-name", Some("Manufacturer name"), Some("http://hl7.org/fhir/device-nametype"))
  case MODEL_NAME extends DEVICE_NAMETYPE("model-name", Some("Model name"), Some("http://hl7.org/fhir/device-nametype"))
  case OTHER extends DEVICE_NAMETYPE("other", Some("other"), Some("http://hl7.org/fhir/device-nametype"))
  case PATIENT_REPORTED_NAME extends DEVICE_NAMETYPE("patient-reported-name", Some("Patient Reported name"), Some("http://hl7.org/fhir/device-nametype"))
  case UDI_LABEL_NAME extends DEVICE_NAMETYPE("udi-label-name", Some("UDI Label name"), Some("http://hl7.org/fhir/device-nametype"))
  case USER_FRIENDLY_NAME extends DEVICE_NAMETYPE("user-friendly-name", Some("User Friendly name"), Some("http://hl7.org/fhir/device-nametype"))
}
object DEVICE_NAMETYPE extends EType[DEVICE_NAMETYPE]("http://hl7.org/fhir/ValueSet/device-nametype") 


enum DEVICE_STATEMENT_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ACTIVE extends DEVICE_STATEMENT_STATUS("active", Some("Active"), Some("http://hl7.org/fhir/device-statement-status"))
  case COMPLETED extends DEVICE_STATEMENT_STATUS("completed", Some("Completed"), Some("http://hl7.org/fhir/device-statement-status"))
  case ENTERED_IN_ERROR extends DEVICE_STATEMENT_STATUS("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/device-statement-status"))
  case INTENDED extends DEVICE_STATEMENT_STATUS("intended", Some("Intended"), Some("http://hl7.org/fhir/device-statement-status"))
  case ON_HOLD extends DEVICE_STATEMENT_STATUS("on-hold", Some("On Hold"), Some("http://hl7.org/fhir/device-statement-status"))
  case STOPPED extends DEVICE_STATEMENT_STATUS("stopped", Some("Stopped"), Some("http://hl7.org/fhir/device-statement-status"))
}
object DEVICE_STATEMENT_STATUS extends EType[DEVICE_STATEMENT_STATUS]("http://hl7.org/fhir/ValueSet/device-statement-status") 


enum DEVICE_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ACTIVE extends DEVICE_STATUS("active", Some("Active"), Some("http://hl7.org/fhir/device-status"))
  case ENTERED_IN_ERROR extends DEVICE_STATUS("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/device-status"))
  case INACTIVE extends DEVICE_STATUS("inactive", Some("Inactive"), Some("http://hl7.org/fhir/device-status"))
  case UNKNOWN extends DEVICE_STATUS("unknown", Some("Unknown"), Some("http://hl7.org/fhir/device-status"))
}
object DEVICE_STATUS extends EType[DEVICE_STATUS]("http://hl7.org/fhir/ValueSet/device-status") 


enum DIAGNOSTIC_REPORT_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case AMENDED extends DIAGNOSTIC_REPORT_STATUS("amended", Some("Amended"), Some("http://hl7.org/fhir/diagnostic-report-status"))
  case APPENDED extends DIAGNOSTIC_REPORT_STATUS("appended", Some("Appended"), Some("http://hl7.org/fhir/diagnostic-report-status"))
  case CANCELLED extends DIAGNOSTIC_REPORT_STATUS("cancelled", Some("Cancelled"), Some("http://hl7.org/fhir/diagnostic-report-status"))
  case CORRECTED extends DIAGNOSTIC_REPORT_STATUS("corrected", Some("Corrected"), Some("http://hl7.org/fhir/diagnostic-report-status"))
  case ENTERED_IN_ERROR extends DIAGNOSTIC_REPORT_STATUS("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/diagnostic-report-status"))
  case FINAL extends DIAGNOSTIC_REPORT_STATUS("final", Some("Final"), Some("http://hl7.org/fhir/diagnostic-report-status"))
  case PARTIAL extends DIAGNOSTIC_REPORT_STATUS("partial", Some("Partial"), Some("http://hl7.org/fhir/diagnostic-report-status"))
  case PRELIMINARY extends DIAGNOSTIC_REPORT_STATUS("preliminary", Some("Preliminary"), Some("http://hl7.org/fhir/diagnostic-report-status"))
  case REGISTERED extends DIAGNOSTIC_REPORT_STATUS("registered", Some("Registered"), Some("http://hl7.org/fhir/diagnostic-report-status"))
  case UNKNOWN extends DIAGNOSTIC_REPORT_STATUS("unknown", Some("Unknown"), Some("http://hl7.org/fhir/diagnostic-report-status"))
}
object DIAGNOSTIC_REPORT_STATUS extends EType[DIAGNOSTIC_REPORT_STATUS]("http://hl7.org/fhir/ValueSet/diagnostic-report-status") 


enum DISCRIMINATOR_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case EXISTS extends DISCRIMINATOR_TYPE("exists", Some("Exists"), Some("http://hl7.org/fhir/discriminator-type"))
  case PATTERN extends DISCRIMINATOR_TYPE("pattern", Some("Pattern"), Some("http://hl7.org/fhir/discriminator-type"))
  case PROFILE extends DISCRIMINATOR_TYPE("profile", Some("Profile"), Some("http://hl7.org/fhir/discriminator-type"))
  case TYPE extends DISCRIMINATOR_TYPE("type", Some("Type"), Some("http://hl7.org/fhir/discriminator-type"))
  case VALUE extends DISCRIMINATOR_TYPE("value", Some("Value"), Some("http://hl7.org/fhir/discriminator-type"))
}
object DISCRIMINATOR_TYPE extends EType[DISCRIMINATOR_TYPE]("http://hl7.org/fhir/ValueSet/discriminator-type") 


enum DOCUMENT_MODE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case CONSUMER extends DOCUMENT_MODE("consumer", Some("Consumer"), Some("http://hl7.org/fhir/document-mode"))
  case PRODUCER extends DOCUMENT_MODE("producer", Some("Producer"), Some("http://hl7.org/fhir/document-mode"))
}
object DOCUMENT_MODE extends EType[DOCUMENT_MODE]("http://hl7.org/fhir/ValueSet/document-mode") 


enum DOCUMENT_REFERENCE_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case CURRENT extends DOCUMENT_REFERENCE_STATUS("current", Some("Current"), Some("http://hl7.org/fhir/document-reference-status"))
  case ENTERED_IN_ERROR extends DOCUMENT_REFERENCE_STATUS("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/document-reference-status"))
  case SUPERSEDED extends DOCUMENT_REFERENCE_STATUS("superseded", Some("Superseded"), Some("http://hl7.org/fhir/document-reference-status"))
}
object DOCUMENT_REFERENCE_STATUS extends EType[DOCUMENT_REFERENCE_STATUS]("http://hl7.org/fhir/ValueSet/document-reference-status") 


enum DOCUMENT_RELATIONSHIP_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case APPENDS extends DOCUMENT_RELATIONSHIP_TYPE("appends", Some("Appends"), Some("http://hl7.org/fhir/document-relationship-type"))
  case REPLACES extends DOCUMENT_RELATIONSHIP_TYPE("replaces", Some("Replaces"), Some("http://hl7.org/fhir/document-relationship-type"))
  case SIGNS extends DOCUMENT_RELATIONSHIP_TYPE("signs", Some("Signs"), Some("http://hl7.org/fhir/document-relationship-type"))
  case TRANSFORMS extends DOCUMENT_RELATIONSHIP_TYPE("transforms", Some("Transforms"), Some("http://hl7.org/fhir/document-relationship-type"))
}
object DOCUMENT_RELATIONSHIP_TYPE extends EType[DOCUMENT_RELATIONSHIP_TYPE]("http://hl7.org/fhir/ValueSet/document-relationship-type") 


enum ELIGIBILITYREQUEST_PURPOSE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case BENEFITS extends ELIGIBILITYREQUEST_PURPOSE("benefits", Some("Coverage benefits"), Some("http://hl7.org/fhir/eligibilityrequest-purpose"))
  case COVERAGE_AUTH_REQUIREMENTS extends ELIGIBILITYREQUEST_PURPOSE("auth-requirements", Some("Coverage auth-requirements"), Some("http://hl7.org/fhir/eligibilityrequest-purpose"))
  case DISCOVERY extends ELIGIBILITYREQUEST_PURPOSE("discovery", Some("Coverage Discovery"), Some("http://hl7.org/fhir/eligibilityrequest-purpose"))
  case VALIDATION extends ELIGIBILITYREQUEST_PURPOSE("validation", Some("Coverage Validation"), Some("http://hl7.org/fhir/eligibilityrequest-purpose"))
}
object ELIGIBILITYREQUEST_PURPOSE extends EType[ELIGIBILITYREQUEST_PURPOSE]("http://hl7.org/fhir/ValueSet/eligibilityrequest-purpose") 


enum ELIGIBILITYRESPONSE_PURPOSE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case BENEFITS extends ELIGIBILITYRESPONSE_PURPOSE("benefits", Some("Coverage benefits"), Some("http://hl7.org/fhir/eligibilityresponse-purpose"))
  case COVERAGE_AUTH_REQUIREMENTS extends ELIGIBILITYRESPONSE_PURPOSE("auth-requirements", Some("Coverage auth-requirements"), Some("http://hl7.org/fhir/eligibilityresponse-purpose"))
  case DISCOVERY extends ELIGIBILITYRESPONSE_PURPOSE("discovery", Some("Coverage Discovery"), Some("http://hl7.org/fhir/eligibilityresponse-purpose"))
  case VALIDATION extends ELIGIBILITYRESPONSE_PURPOSE("validation", Some("Coverage Validation"), Some("http://hl7.org/fhir/eligibilityresponse-purpose"))
}
object ELIGIBILITYRESPONSE_PURPOSE extends EType[ELIGIBILITYRESPONSE_PURPOSE]("http://hl7.org/fhir/ValueSet/eligibilityresponse-purpose") 


enum ENCOUNTER_LOCATION_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ACTIVE extends ENCOUNTER_LOCATION_STATUS("active", Some("Active"), Some("http://hl7.org/fhir/encounter-location-status"))
  case COMPLETED extends ENCOUNTER_LOCATION_STATUS("completed", Some("Completed"), Some("http://hl7.org/fhir/encounter-location-status"))
  case PLANNED extends ENCOUNTER_LOCATION_STATUS("planned", Some("Planned"), Some("http://hl7.org/fhir/encounter-location-status"))
  case RESERVED extends ENCOUNTER_LOCATION_STATUS("reserved", Some("Reserved"), Some("http://hl7.org/fhir/encounter-location-status"))
}
object ENCOUNTER_LOCATION_STATUS extends EType[ENCOUNTER_LOCATION_STATUS]("http://hl7.org/fhir/ValueSet/encounter-location-status") 


enum ENCOUNTER_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ARRIVED extends ENCOUNTER_STATUS("arrived", Some("Arrived"), Some("http://hl7.org/fhir/encounter-status"))
  case CANCELLED extends ENCOUNTER_STATUS("cancelled", Some("Cancelled"), Some("http://hl7.org/fhir/encounter-status"))
  case ENTERED_IN_ERROR extends ENCOUNTER_STATUS("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/encounter-status"))
  case FINISHED extends ENCOUNTER_STATUS("finished", Some("Finished"), Some("http://hl7.org/fhir/encounter-status"))
  case IN_PROGRESS extends ENCOUNTER_STATUS("in-progress", Some("In Progress"), Some("http://hl7.org/fhir/encounter-status"))
  case ONLEAVE extends ENCOUNTER_STATUS("onleave", Some("On Leave"), Some("http://hl7.org/fhir/encounter-status"))
  case PLANNED extends ENCOUNTER_STATUS("planned", Some("Planned"), Some("http://hl7.org/fhir/encounter-status"))
  case TRIAGED extends ENCOUNTER_STATUS("triaged", Some("Triaged"), Some("http://hl7.org/fhir/encounter-status"))
  case UNKNOWN extends ENCOUNTER_STATUS("unknown", Some("Unknown"), Some("http://hl7.org/fhir/encounter-status"))
}
object ENCOUNTER_STATUS extends EType[ENCOUNTER_STATUS]("http://hl7.org/fhir/ValueSet/encounter-status") 


enum ENDPOINT_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ACTIVE extends ENDPOINT_STATUS("active", Some("Active"), Some("http://hl7.org/fhir/endpoint-status"))
  case ENTERED_IN_ERROR extends ENDPOINT_STATUS("entered-in-error", Some("Entered in error"), Some("http://hl7.org/fhir/endpoint-status"))
  case ERROR extends ENDPOINT_STATUS("error", Some("Error"), Some("http://hl7.org/fhir/endpoint-status"))
  case OFF extends ENDPOINT_STATUS("off", Some("Off"), Some("http://hl7.org/fhir/endpoint-status"))
  case SUSPENDED extends ENDPOINT_STATUS("suspended", Some("Suspended"), Some("http://hl7.org/fhir/endpoint-status"))
  case TEST extends ENDPOINT_STATUS("test", Some("Test"), Some("http://hl7.org/fhir/endpoint-status"))
}
object ENDPOINT_STATUS extends EType[ENDPOINT_STATUS]("http://hl7.org/fhir/ValueSet/endpoint-status") 


enum EPISODE_OF_CARE_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ACTIVE extends EPISODE_OF_CARE_STATUS("active", Some("Active"), Some("http://hl7.org/fhir/episode-of-care-status"))
  case CANCELLED extends EPISODE_OF_CARE_STATUS("cancelled", Some("Cancelled"), Some("http://hl7.org/fhir/episode-of-care-status"))
  case ENTERED_IN_ERROR extends EPISODE_OF_CARE_STATUS("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/episode-of-care-status"))
  case FINISHED extends EPISODE_OF_CARE_STATUS("finished", Some("Finished"), Some("http://hl7.org/fhir/episode-of-care-status"))
  case ONHOLD extends EPISODE_OF_CARE_STATUS("onhold", Some("On Hold"), Some("http://hl7.org/fhir/episode-of-care-status"))
  case PLANNED extends EPISODE_OF_CARE_STATUS("planned", Some("Planned"), Some("http://hl7.org/fhir/episode-of-care-status"))
  case WAITLIST extends EPISODE_OF_CARE_STATUS("waitlist", Some("Waitlist"), Some("http://hl7.org/fhir/episode-of-care-status"))
}
object EPISODE_OF_CARE_STATUS extends EType[EPISODE_OF_CARE_STATUS]("http://hl7.org/fhir/ValueSet/episode-of-care-status") 


enum EVENT_CAPABILITY_MODE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case RECEIVER extends EVENT_CAPABILITY_MODE("receiver", Some("Receiver"), Some("http://hl7.org/fhir/event-capability-mode"))
  case SENDER extends EVENT_CAPABILITY_MODE("sender", Some("Sender"), Some("http://hl7.org/fhir/event-capability-mode"))
}
object EVENT_CAPABILITY_MODE extends EType[EVENT_CAPABILITY_MODE]("http://hl7.org/fhir/ValueSet/event-capability-mode") 


enum EVENT_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case COMPLETED extends EVENT_STATUS("completed", Some("Completed"), Some("http://hl7.org/fhir/event-status"))
  case ENTERED_IN_ERROR extends EVENT_STATUS("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/event-status"))
  case IN_PROGRESS extends EVENT_STATUS("in-progress", Some("In Progress"), Some("http://hl7.org/fhir/event-status"))
  case NOT_DONE extends EVENT_STATUS("not-done", Some("Not Done"), Some("http://hl7.org/fhir/event-status"))
  case ON_HOLD extends EVENT_STATUS("on-hold", Some("On Hold"), Some("http://hl7.org/fhir/event-status"))
  case PREPARATION extends EVENT_STATUS("preparation", Some("Preparation"), Some("http://hl7.org/fhir/event-status"))
  case STOPPED extends EVENT_STATUS("stopped", Some("Stopped"), Some("http://hl7.org/fhir/event-status"))
  case UNKNOWN extends EVENT_STATUS("unknown", Some("Unknown"), Some("http://hl7.org/fhir/event-status"))
}
object EVENT_STATUS extends EType[EVENT_STATUS]("http://hl7.org/fhir/ValueSet/event-status") 


enum EXAMPLESCENARIO_ACTOR_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ENTITY extends EXAMPLESCENARIO_ACTOR_TYPE("entity", Some("System"), Some("http://hl7.org/fhir/examplescenario-actor-type"))
  case PERSON extends EXAMPLESCENARIO_ACTOR_TYPE("person", Some("Person"), Some("http://hl7.org/fhir/examplescenario-actor-type"))
}
object EXAMPLESCENARIO_ACTOR_TYPE extends EType[EXAMPLESCENARIO_ACTOR_TYPE]("http://hl7.org/fhir/ValueSet/examplescenario-actor-type") 


enum EXPLANATIONOFBENEFIT_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ACTIVE extends EXPLANATIONOFBENEFIT_STATUS("active", Some("Active"), Some("http://hl7.org/fhir/explanationofbenefit-status"))
  case CANCELLED extends EXPLANATIONOFBENEFIT_STATUS("cancelled", Some("Cancelled"), Some("http://hl7.org/fhir/explanationofbenefit-status"))
  case DRAFT extends EXPLANATIONOFBENEFIT_STATUS("draft", Some("Draft"), Some("http://hl7.org/fhir/explanationofbenefit-status"))
  case ENTERED_IN_ERROR extends EXPLANATIONOFBENEFIT_STATUS("entered-in-error", Some("Entered In Error"), Some("http://hl7.org/fhir/explanationofbenefit-status"))
}
object EXPLANATIONOFBENEFIT_STATUS extends EType[EXPLANATIONOFBENEFIT_STATUS]("http://hl7.org/fhir/ValueSet/explanationofbenefit-status") 


enum EXPOSURE_STATE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case EXPOSURE extends EXPOSURE_STATE("exposure", Some("Exposure"), Some("http://hl7.org/fhir/exposure-state"))
  case EXPOSURE_ALTERNATIVE extends EXPOSURE_STATE("exposure-alternative", Some("Exposure Alternative"), Some("http://hl7.org/fhir/exposure-state"))
}
object EXPOSURE_STATE extends EType[EXPOSURE_STATE]("http://hl7.org/fhir/ValueSet/exposure-state") 


enum EXTENSION_CONTEXT_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ELEMENT extends EXTENSION_CONTEXT_TYPE("element", Some("Element ID"), Some("http://hl7.org/fhir/extension-context-type"))
  case EXTENSION extends EXTENSION_CONTEXT_TYPE("extension", Some("Extension URL"), Some("http://hl7.org/fhir/extension-context-type"))
  case FHIRPATH extends EXTENSION_CONTEXT_TYPE("fhirpath", Some("FHIRPath"), Some("http://hl7.org/fhir/extension-context-type"))
}
object EXTENSION_CONTEXT_TYPE extends EType[EXTENSION_CONTEXT_TYPE]("http://hl7.org/fhir/ValueSet/extension-context-type") 


enum FHIR_VERSION(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case `0.0.80` extends FHIR_VERSION("0.0.80", Some("0.0.80"), Some("http://hl7.org/fhir/FHIR-version"))
  case `0.0.81` extends FHIR_VERSION("0.0.81", Some("0.0.81"), Some("http://hl7.org/fhir/FHIR-version"))
  case `0.0.82` extends FHIR_VERSION("0.0.82", Some("0.0.82"), Some("http://hl7.org/fhir/FHIR-version"))
  case `0.01` extends FHIR_VERSION("0.01", Some("0.01"), Some("http://hl7.org/fhir/FHIR-version"))
  case `0.05` extends FHIR_VERSION("0.05", Some("0.05"), Some("http://hl7.org/fhir/FHIR-version"))
  case `0.06` extends FHIR_VERSION("0.06", Some("0.06"), Some("http://hl7.org/fhir/FHIR-version"))
  case `0.11` extends FHIR_VERSION("0.11", Some("0.11"), Some("http://hl7.org/fhir/FHIR-version"))
  case `0.4.0` extends FHIR_VERSION("0.4.0", Some("0.4.0"), Some("http://hl7.org/fhir/FHIR-version"))
  case `0.5.0` extends FHIR_VERSION("0.5.0", Some("0.5.0"), Some("http://hl7.org/fhir/FHIR-version"))
  case `1.0.0` extends FHIR_VERSION("1.0.0", Some("1.0.0"), Some("http://hl7.org/fhir/FHIR-version"))
  case `1.0.1` extends FHIR_VERSION("1.0.1", Some("1.0.1"), Some("http://hl7.org/fhir/FHIR-version"))
  case `1.0.2` extends FHIR_VERSION("1.0.2", Some("1.0.2"), Some("http://hl7.org/fhir/FHIR-version"))
  case `1.1.0` extends FHIR_VERSION("1.1.0", Some("1.1.0"), Some("http://hl7.org/fhir/FHIR-version"))
  case `1.4.0` extends FHIR_VERSION("1.4.0", Some("1.4.0"), Some("http://hl7.org/fhir/FHIR-version"))
  case `1.6.0` extends FHIR_VERSION("1.6.0", Some("1.6.0"), Some("http://hl7.org/fhir/FHIR-version"))
  case `1.8.0` extends FHIR_VERSION("1.8.0", Some("1.8.0"), Some("http://hl7.org/fhir/FHIR-version"))
  case `3.0.0` extends FHIR_VERSION("3.0.0", Some("3.0.0"), Some("http://hl7.org/fhir/FHIR-version"))
  case `3.0.1` extends FHIR_VERSION("3.0.1", Some("3.0.1"), Some("http://hl7.org/fhir/FHIR-version"))
  case `3.3.0` extends FHIR_VERSION("3.3.0", Some("3.3.0"), Some("http://hl7.org/fhir/FHIR-version"))
  case `3.5.0` extends FHIR_VERSION("3.5.0", Some("3.5.0"), Some("http://hl7.org/fhir/FHIR-version"))
  case `4.0.0` extends FHIR_VERSION("4.0.0", Some("4.0.0"), Some("http://hl7.org/fhir/FHIR-version"))
  case `4.0.1` extends FHIR_VERSION("4.0.1", Some("4.0.1"), Some("http://hl7.org/fhir/FHIR-version"))
}
object FHIR_VERSION extends EType[FHIR_VERSION]("http://hl7.org/fhir/ValueSet/FHIR-version") 


enum FILTER_OPERATOR(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case DESCENDENT_OF extends FILTER_OPERATOR("descendent-of", Some("Descendent Of (by subsumption)"), Some("http://hl7.org/fhir/filter-operator"))
  case EQUALS extends FILTER_OPERATOR("=", Some("Equals"), Some("http://hl7.org/fhir/filter-operator"))
  case EXISTS extends FILTER_OPERATOR("exists", Some("Exists"), Some("http://hl7.org/fhir/filter-operator"))
  case GENERALIZES extends FILTER_OPERATOR("generalizes", Some("Generalizes (by Subsumption)"), Some("http://hl7.org/fhir/filter-operator"))
  case IN extends FILTER_OPERATOR("in", Some("In Set"), Some("http://hl7.org/fhir/filter-operator"))
  case IS_A extends FILTER_OPERATOR("is-a", Some("Is A (by subsumption)"), Some("http://hl7.org/fhir/filter-operator"))
  case IS_NOT_A extends FILTER_OPERATOR("is-not-a", Some("Not (Is A) (by subsumption)"), Some("http://hl7.org/fhir/filter-operator"))
  case NOT_IN_SET extends FILTER_OPERATOR("not-in", Some("Not in Set"), Some("http://hl7.org/fhir/filter-operator"))
  case REGEX extends FILTER_OPERATOR("regex", Some("Regular Expression"), Some("http://hl7.org/fhir/filter-operator"))
}
object FILTER_OPERATOR extends EType[FILTER_OPERATOR]("http://hl7.org/fhir/ValueSet/filter-operator") 


enum FLAG_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ACTIVE extends FLAG_STATUS("active", Some("Active"), Some("http://hl7.org/fhir/flag-status"))
  case ENTERED_IN_ERROR extends FLAG_STATUS("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/flag-status"))
  case INACTIVE extends FLAG_STATUS("inactive", Some("Inactive"), Some("http://hl7.org/fhir/flag-status"))
}
object FLAG_STATUS extends EType[FLAG_STATUS]("http://hl7.org/fhir/ValueSet/flag-status") 


enum FM_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ACTIVE extends FM_STATUS("active", Some("Active"), Some("http://hl7.org/fhir/fm-status"))
  case CANCELLED extends FM_STATUS("cancelled", Some("Cancelled"), Some("http://hl7.org/fhir/fm-status"))
  case DRAFT extends FM_STATUS("draft", Some("Draft"), Some("http://hl7.org/fhir/fm-status"))
  case ENTERED_IN_ERROR extends FM_STATUS("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/fm-status"))
}
object FM_STATUS extends EType[FM_STATUS]("http://hl7.org/fhir/ValueSet/fm-status") 


enum GOAL_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ACCEPTED extends GOAL_STATUS("accepted", Some("Accepted"), Some("http://hl7.org/fhir/goal-status"))
  case ACTIVE extends GOAL_STATUS("active", Some("Active"), Some("http://hl7.org/fhir/goal-status"))
  case CANCELLED extends GOAL_STATUS("cancelled", Some("Cancelled"), Some("http://hl7.org/fhir/goal-status"))
  case COMPLETED extends GOAL_STATUS("completed", Some("Completed"), Some("http://hl7.org/fhir/goal-status"))
  case ENTERED_IN_ERROR extends GOAL_STATUS("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/goal-status"))
  case ON_HOLD extends GOAL_STATUS("on-hold", Some("On Hold"), Some("http://hl7.org/fhir/goal-status"))
  case PLANNED extends GOAL_STATUS("planned", Some("Planned"), Some("http://hl7.org/fhir/goal-status"))
  case PROPOSED extends GOAL_STATUS("proposed", Some("Proposed"), Some("http://hl7.org/fhir/goal-status"))
  case REJECTED extends GOAL_STATUS("rejected", Some("Rejected"), Some("http://hl7.org/fhir/goal-status"))
}
object GOAL_STATUS extends EType[GOAL_STATUS]("http://hl7.org/fhir/ValueSet/goal-status") 


enum GRAPH_COMPARTMENT_RULE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case CUSTOM extends GRAPH_COMPARTMENT_RULE("custom", Some("Custom"), Some("http://hl7.org/fhir/graph-compartment-rule"))
  case DIFFERENT extends GRAPH_COMPARTMENT_RULE("different", Some("Different"), Some("http://hl7.org/fhir/graph-compartment-rule"))
  case IDENTICAL extends GRAPH_COMPARTMENT_RULE("identical", Some("Identical"), Some("http://hl7.org/fhir/graph-compartment-rule"))
  case MATCHING extends GRAPH_COMPARTMENT_RULE("matching", Some("Matching"), Some("http://hl7.org/fhir/graph-compartment-rule"))
}
object GRAPH_COMPARTMENT_RULE extends EType[GRAPH_COMPARTMENT_RULE]("http://hl7.org/fhir/ValueSet/graph-compartment-rule") 


enum GRAPH_COMPARTMENT_USE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case CONDITION extends GRAPH_COMPARTMENT_USE("condition", Some("Condition"), Some("http://hl7.org/fhir/graph-compartment-use"))
  case REQUIREMENT extends GRAPH_COMPARTMENT_USE("requirement", Some("Requirement"), Some("http://hl7.org/fhir/graph-compartment-use"))
}
object GRAPH_COMPARTMENT_USE extends EType[GRAPH_COMPARTMENT_USE]("http://hl7.org/fhir/ValueSet/graph-compartment-use") 


enum GROUP_MEASURE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case MEAN extends GROUP_MEASURE("mean", Some("Mean"), Some("http://hl7.org/fhir/group-measure"))
  case MEAN_OF_STUDY_MEANS extends GROUP_MEASURE("mean-of-mean", Some("Mean of Study Means"), Some("http://hl7.org/fhir/group-measure"))
  case MEAN_OF_STUDY_MEDINS extends GROUP_MEASURE("mean-of-median", Some("Mean of Study Medins"), Some("http://hl7.org/fhir/group-measure"))
  case MEDIAN extends GROUP_MEASURE("median", Some("Median"), Some("http://hl7.org/fhir/group-measure"))
  case MEDIAN_OF_STUDY_MEANS extends GROUP_MEASURE("median-of-mean", Some("Median of Study Means"), Some("http://hl7.org/fhir/group-measure"))
  case MEDIAN_OF_STUDY_MEDIANS extends GROUP_MEASURE("median-of-median", Some("Median of Study Medians"), Some("http://hl7.org/fhir/group-measure"))
}
object GROUP_MEASURE extends EType[GROUP_MEASURE]("http://hl7.org/fhir/ValueSet/group-measure") 


enum GROUP_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ANIMAL extends GROUP_TYPE("animal", Some("Animal"), Some("http://hl7.org/fhir/group-type"))
  case DEVICE extends GROUP_TYPE("device", Some("Device"), Some("http://hl7.org/fhir/group-type"))
  case MEDICATION extends GROUP_TYPE("medication", Some("Medication"), Some("http://hl7.org/fhir/group-type"))
  case PERSON extends GROUP_TYPE("person", Some("Person"), Some("http://hl7.org/fhir/group-type"))
  case PRACTITIONER extends GROUP_TYPE("practitioner", Some("Practitioner"), Some("http://hl7.org/fhir/group-type"))
  case SUBSTANCE extends GROUP_TYPE("substance", Some("Substance"), Some("http://hl7.org/fhir/group-type"))
}
object GROUP_TYPE extends EType[GROUP_TYPE]("http://hl7.org/fhir/ValueSet/group-type") 


enum GUIDANCE_RESPONSE_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case DATA_REQUESTED extends GUIDANCE_RESPONSE_STATUS("data-requested", Some("Data Requested"), Some("http://hl7.org/fhir/guidance-response-status"))
  case DATA_REQUIRED extends GUIDANCE_RESPONSE_STATUS("data-required", Some("Data Required"), Some("http://hl7.org/fhir/guidance-response-status"))
  case ENTERED_IN_ERROR extends GUIDANCE_RESPONSE_STATUS("entered-in-error", Some("Entered In Error"), Some("http://hl7.org/fhir/guidance-response-status"))
  case FAILURE extends GUIDANCE_RESPONSE_STATUS("failure", Some("Failure"), Some("http://hl7.org/fhir/guidance-response-status"))
  case IN_PROGRESS extends GUIDANCE_RESPONSE_STATUS("in-progress", Some("In Progress"), Some("http://hl7.org/fhir/guidance-response-status"))
  case SUCCESS extends GUIDANCE_RESPONSE_STATUS("success", Some("Success"), Some("http://hl7.org/fhir/guidance-response-status"))
}
object GUIDANCE_RESPONSE_STATUS extends EType[GUIDANCE_RESPONSE_STATUS]("http://hl7.org/fhir/ValueSet/guidance-response-status") 


enum GUIDE_PAGE_GENERATION(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case GENERATED extends GUIDE_PAGE_GENERATION("generated", Some("Generated"), Some("http://hl7.org/fhir/guide-page-generation"))
  case HTML extends GUIDE_PAGE_GENERATION("html", Some("HTML"), Some("http://hl7.org/fhir/guide-page-generation"))
  case MARKDOWN extends GUIDE_PAGE_GENERATION("markdown", Some("Markdown"), Some("http://hl7.org/fhir/guide-page-generation"))
  case XML extends GUIDE_PAGE_GENERATION("xml", Some("XML"), Some("http://hl7.org/fhir/guide-page-generation"))
}
object GUIDE_PAGE_GENERATION extends EType[GUIDE_PAGE_GENERATION]("http://hl7.org/fhir/ValueSet/guide-page-generation") 


enum GUIDE_PARAMETER_CODE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case APPLY extends GUIDE_PARAMETER_CODE("apply", Some("Apply Metadata Value"), Some("http://hl7.org/fhir/guide-parameter-code"))
  case BROKEN_LINKS_RULE extends GUIDE_PARAMETER_CODE("rule-broken-links", Some("Broken Links Rule"), Some("http://hl7.org/fhir/guide-parameter-code"))
  case EXPANSION_PROFILE extends GUIDE_PARAMETER_CODE("expansion-parameter", Some("Expansion Profile"), Some("http://hl7.org/fhir/guide-parameter-code"))
  case GENERATE_JSON extends GUIDE_PARAMETER_CODE("generate-json", Some("Generate JSON"), Some("http://hl7.org/fhir/guide-parameter-code"))
  case GENERATE_TURTLE extends GUIDE_PARAMETER_CODE("generate-turtle", Some("Generate Turtle"), Some("http://hl7.org/fhir/guide-parameter-code"))
  case GENERATE_XML extends GUIDE_PARAMETER_CODE("generate-xml", Some("Generate XML"), Some("http://hl7.org/fhir/guide-parameter-code"))
  case HTML_TEMPLATE extends GUIDE_PARAMETER_CODE("html-template", Some("HTML Template"), Some("http://hl7.org/fhir/guide-parameter-code"))
  case PAGES_PATH extends GUIDE_PARAMETER_CODE("path-pages", Some("Pages Path"), Some("http://hl7.org/fhir/guide-parameter-code"))
  case RESOURCE_PATH extends GUIDE_PARAMETER_CODE("path-resource", Some("Resource Path"), Some("http://hl7.org/fhir/guide-parameter-code"))
  case TERMINOLOGY_CACHE_PATH extends GUIDE_PARAMETER_CODE("path-tx-cache", Some("Terminology Cache Path"), Some("http://hl7.org/fhir/guide-parameter-code"))
}
object GUIDE_PARAMETER_CODE extends EType[GUIDE_PARAMETER_CODE]("http://hl7.org/fhir/ValueSet/guide-parameter-code") 


enum HISTORY_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case COMPLETED extends HISTORY_STATUS("completed", Some("Completed"), Some("http://hl7.org/fhir/history-status"))
  case ENTERED_IN_ERROR extends HISTORY_STATUS("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/history-status"))
  case HEALTH_UNKNOWN extends HISTORY_STATUS("health-unknown", Some("Health Unknown"), Some("http://hl7.org/fhir/history-status"))
  case PARTIAL extends HISTORY_STATUS("partial", Some("Partial"), Some("http://hl7.org/fhir/history-status"))
}
object HISTORY_STATUS extends EType[HISTORY_STATUS]("http://hl7.org/fhir/ValueSet/history-status") 


enum HTTP_OPERATIONS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case DELETE extends HTTP_OPERATIONS("delete", Some("DELETE"), Some("http://hl7.org/fhir/http-operations"))
  case GET extends HTTP_OPERATIONS("get", Some("GET"), Some("http://hl7.org/fhir/http-operations"))
  case HEAD extends HTTP_OPERATIONS("head", Some("HEAD"), Some("http://hl7.org/fhir/http-operations"))
  case OPTIONS extends HTTP_OPERATIONS("options", Some("OPTIONS"), Some("http://hl7.org/fhir/http-operations"))
  case PATCH extends HTTP_OPERATIONS("patch", Some("PATCH"), Some("http://hl7.org/fhir/http-operations"))
  case POST extends HTTP_OPERATIONS("post", Some("POST"), Some("http://hl7.org/fhir/http-operations"))
  case PUT extends HTTP_OPERATIONS("put", Some("PUT"), Some("http://hl7.org/fhir/http-operations"))
}
object HTTP_OPERATIONS extends EType[HTTP_OPERATIONS]("http://hl7.org/fhir/ValueSet/http-operations") 


enum HTTP_VERB(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case DELETE extends HTTP_VERB("DELETE", Some("DELETE"), Some("http://hl7.org/fhir/http-verb"))
  case GET extends HTTP_VERB("GET", Some("GET"), Some("http://hl7.org/fhir/http-verb"))
  case HEAD extends HTTP_VERB("HEAD", Some("HEAD"), Some("http://hl7.org/fhir/http-verb"))
  case PATCH extends HTTP_VERB("PATCH", Some("PATCH"), Some("http://hl7.org/fhir/http-verb"))
  case POST extends HTTP_VERB("POST", Some("POST"), Some("http://hl7.org/fhir/http-verb"))
  case PUT extends HTTP_VERB("PUT", Some("PUT"), Some("http://hl7.org/fhir/http-verb"))
}
object HTTP_VERB extends EType[HTTP_VERB]("http://hl7.org/fhir/ValueSet/http-verb") 


enum IDENTITY_ASSURANCELEVEL(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case LEVEL1 extends IDENTITY_ASSURANCELEVEL("level1", Some("Level 1"), Some("http://hl7.org/fhir/identity-assuranceLevel"))
  case LEVEL2 extends IDENTITY_ASSURANCELEVEL("level2", Some("Level 2"), Some("http://hl7.org/fhir/identity-assuranceLevel"))
  case LEVEL3 extends IDENTITY_ASSURANCELEVEL("level3", Some("Level 3"), Some("http://hl7.org/fhir/identity-assuranceLevel"))
  case LEVEL4 extends IDENTITY_ASSURANCELEVEL("level4", Some("Level 4"), Some("http://hl7.org/fhir/identity-assuranceLevel"))
}
object IDENTITY_ASSURANCELEVEL extends EType[IDENTITY_ASSURANCELEVEL]("http://hl7.org/fhir/ValueSet/identity-assuranceLevel") 


enum IMAGINGSTUDY_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case AVAILABLE extends IMAGINGSTUDY_STATUS("available", Some("Available"), Some("http://hl7.org/fhir/imagingstudy-status"))
  case CANCELLED extends IMAGINGSTUDY_STATUS("cancelled", Some("Cancelled"), Some("http://hl7.org/fhir/imagingstudy-status"))
  case ENTERED_IN_ERROR extends IMAGINGSTUDY_STATUS("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/imagingstudy-status"))
  case REGISTERED extends IMAGINGSTUDY_STATUS("registered", Some("Registered"), Some("http://hl7.org/fhir/imagingstudy-status"))
  case UNKNOWN extends IMAGINGSTUDY_STATUS("unknown", Some("Unknown"), Some("http://hl7.org/fhir/imagingstudy-status"))
}
object IMAGINGSTUDY_STATUS extends EType[IMAGINGSTUDY_STATUS]("http://hl7.org/fhir/ValueSet/imagingstudy-status") 


enum IMMUNIZATION_EVALUATION_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case COMPLETED extends IMMUNIZATION_EVALUATION_STATUS("completed", Some("completed"), Some("http://terminology.hl7.org/CodeSystem/medication-admin-status"))
  case ENTERED_IN_ERROR extends IMMUNIZATION_EVALUATION_STATUS("entered-in-error", Some("entered-in-error"), Some("http://terminology.hl7.org/CodeSystem/medication-admin-status"))
}
object IMMUNIZATION_EVALUATION_STATUS extends EType[IMMUNIZATION_EVALUATION_STATUS]("http://hl7.org/fhir/ValueSet/immunization-evaluation-status") 


enum IMMUNIZATION_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case COMPLETED extends IMMUNIZATION_STATUS("completed", Some("completed"), Some("http://hl7.org/fhir/event-status"))
  case ENTERED_IN_ERROR extends IMMUNIZATION_STATUS("entered-in-error", Some("entered-in-error"), Some("http://hl7.org/fhir/event-status"))
  case NOT_DONE extends IMMUNIZATION_STATUS("not-done", Some("not-done"), Some("http://hl7.org/fhir/event-status"))
}
object IMMUNIZATION_STATUS extends EType[IMMUNIZATION_STATUS]("http://hl7.org/fhir/ValueSet/immunization-status") 


enum INVOICE_PRICECOMPONENTTYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case BASE extends INVOICE_PRICECOMPONENTTYPE("base", Some("base price"), Some("http://hl7.org/fhir/invoice-priceComponentType"))
  case DEDUCTION extends INVOICE_PRICECOMPONENTTYPE("deduction", Some("deduction"), Some("http://hl7.org/fhir/invoice-priceComponentType"))
  case DISCOUNT extends INVOICE_PRICECOMPONENTTYPE("discount", Some("discount"), Some("http://hl7.org/fhir/invoice-priceComponentType"))
  case INFORMATIONAL extends INVOICE_PRICECOMPONENTTYPE("informational", Some("informational"), Some("http://hl7.org/fhir/invoice-priceComponentType"))
  case SURCHARGE extends INVOICE_PRICECOMPONENTTYPE("surcharge", Some("surcharge"), Some("http://hl7.org/fhir/invoice-priceComponentType"))
  case TAX extends INVOICE_PRICECOMPONENTTYPE("tax", Some("tax"), Some("http://hl7.org/fhir/invoice-priceComponentType"))
}
object INVOICE_PRICECOMPONENTTYPE extends EType[INVOICE_PRICECOMPONENTTYPE]("http://hl7.org/fhir/ValueSet/invoice-priceComponentType") 


enum INVOICE_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case BALANCED extends INVOICE_STATUS("balanced", Some("balanced"), Some("http://hl7.org/fhir/invoice-status"))
  case CANCELLED extends INVOICE_STATUS("cancelled", Some("cancelled"), Some("http://hl7.org/fhir/invoice-status"))
  case DRAFT extends INVOICE_STATUS("draft", Some("draft"), Some("http://hl7.org/fhir/invoice-status"))
  case ENTERED_IN_ERROR extends INVOICE_STATUS("entered-in-error", Some("entered in error"), Some("http://hl7.org/fhir/invoice-status"))
  case ISSUED extends INVOICE_STATUS("issued", Some("issued"), Some("http://hl7.org/fhir/invoice-status"))
}
object INVOICE_STATUS extends EType[INVOICE_STATUS]("http://hl7.org/fhir/ValueSet/invoice-status") 


enum ISSUE_SEVERITY(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ERROR extends ISSUE_SEVERITY("error", Some("Error"), Some("http://hl7.org/fhir/issue-severity"))
  case FATAL extends ISSUE_SEVERITY("fatal", Some("Fatal"), Some("http://hl7.org/fhir/issue-severity"))
  case INFORMATION extends ISSUE_SEVERITY("information", Some("Information"), Some("http://hl7.org/fhir/issue-severity"))
  case WARNING extends ISSUE_SEVERITY("warning", Some("Warning"), Some("http://hl7.org/fhir/issue-severity"))
}
object ISSUE_SEVERITY extends EType[ISSUE_SEVERITY]("http://hl7.org/fhir/ValueSet/issue-severity") 


enum ISSUE_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case BUSINESS_RULE_VIOLATION extends ISSUE_TYPE("business-rule", Some("Business Rule Violation"), Some("http://hl7.org/fhir/issue-type"))
  case CONFLICT extends ISSUE_TYPE("conflict", Some("Edit Version Conflict"), Some("http://hl7.org/fhir/issue-type"))
  case CONTENT_NOT_SUPPORTED extends ISSUE_TYPE("not-supported", Some("Content not supported"), Some("http://hl7.org/fhir/issue-type"))
  case CONTENT_TOO_LONG extends ISSUE_TYPE("too-long", Some("Content Too Long"), Some("http://hl7.org/fhir/issue-type"))
  case DELETED extends ISSUE_TYPE("deleted", Some("Deleted"), Some("http://hl7.org/fhir/issue-type"))
  case DUPLICATE extends ISSUE_TYPE("duplicate", Some("Duplicate"), Some("http://hl7.org/fhir/issue-type"))
  case EXCEPTION extends ISSUE_TYPE("exception", Some("Exception"), Some("http://hl7.org/fhir/issue-type"))
  case EXPIRED extends ISSUE_TYPE("expired", Some("Session Expired"), Some("http://hl7.org/fhir/issue-type"))
  case EXTENSION extends ISSUE_TYPE("extension", Some("Unacceptable Extension"), Some("http://hl7.org/fhir/issue-type"))
  case FORBIDDEN extends ISSUE_TYPE("forbidden", Some("Forbidden"), Some("http://hl7.org/fhir/issue-type"))
  case INCOMPLETE extends ISSUE_TYPE("incomplete", Some("Incomplete Results"), Some("http://hl7.org/fhir/issue-type"))
  case INFORMATIONAL extends ISSUE_TYPE("informational", Some("Informational Note"), Some("http://hl7.org/fhir/issue-type"))
  case INVALID extends ISSUE_TYPE("invalid", Some("Invalid Content"), Some("http://hl7.org/fhir/issue-type"))
  case INVALID_CODE extends ISSUE_TYPE("code-invalid", Some("Invalid Code"), Some("http://hl7.org/fhir/issue-type"))
  case INVARIANT extends ISSUE_TYPE("invariant", Some("Validation rule failed"), Some("http://hl7.org/fhir/issue-type"))
  case LOCK_ERROR extends ISSUE_TYPE("lock-error", Some("Lock Error"), Some("http://hl7.org/fhir/issue-type"))
  case LOGIN extends ISSUE_TYPE("login", Some("Login Required"), Some("http://hl7.org/fhir/issue-type"))
  case MULTIPLE_MATCHES extends ISSUE_TYPE("multiple-matches", Some("Multiple Matches"), Some("http://hl7.org/fhir/issue-type"))
  case NOT_FOUND extends ISSUE_TYPE("not-found", Some("Not Found"), Some("http://hl7.org/fhir/issue-type"))
  case NO_STORE_AVAILABLE extends ISSUE_TYPE("no-store", Some("No Store Available"), Some("http://hl7.org/fhir/issue-type"))
  case OPERATION_TOO_COSTLY extends ISSUE_TYPE("too-costly", Some("Operation Too Costly"), Some("http://hl7.org/fhir/issue-type"))
  case PROCESSING extends ISSUE_TYPE("processing", Some("Processing Failure"), Some("http://hl7.org/fhir/issue-type"))
  case REQUIRED extends ISSUE_TYPE("required", Some("Required element missing"), Some("http://hl7.org/fhir/issue-type"))
  case SECURITY extends ISSUE_TYPE("security", Some("Security Problem"), Some("http://hl7.org/fhir/issue-type"))
  case STRUCTURE extends ISSUE_TYPE("structure", Some("Structural Issue"), Some("http://hl7.org/fhir/issue-type"))
  case SUPPRESSED extends ISSUE_TYPE("suppressed", Some("Information  Suppressed"), Some("http://hl7.org/fhir/issue-type"))
  case THROTTLED extends ISSUE_TYPE("throttled", Some("Throttled"), Some("http://hl7.org/fhir/issue-type"))
  case TIMEOUT extends ISSUE_TYPE("timeout", Some("Timeout"), Some("http://hl7.org/fhir/issue-type"))
  case TRANSIENT extends ISSUE_TYPE("transient", Some("Transient Issue"), Some("http://hl7.org/fhir/issue-type"))
  case UNKNOWN extends ISSUE_TYPE("unknown", Some("Unknown User"), Some("http://hl7.org/fhir/issue-type"))
  case VALUE extends ISSUE_TYPE("value", Some("Element value invalid"), Some("http://hl7.org/fhir/issue-type"))
}
object ISSUE_TYPE extends EType[ISSUE_TYPE]("http://hl7.org/fhir/ValueSet/issue-type") 


enum ITEM_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ATTACHMENT extends ITEM_TYPE("attachment", Some("Attachment"), Some("http://hl7.org/fhir/item-type"))
  case BOOLEAN extends ITEM_TYPE("boolean", Some("Boolean"), Some("http://hl7.org/fhir/item-type"))
  case CHOICE extends ITEM_TYPE("choice", Some("Choice"), Some("http://hl7.org/fhir/item-type"))
  case DATE extends ITEM_TYPE("date", Some("Date"), Some("http://hl7.org/fhir/item-type"))
  case DATETIME extends ITEM_TYPE("dateTime", Some("Date Time"), Some("http://hl7.org/fhir/item-type"))
  case DECIMAL extends ITEM_TYPE("decimal", Some("Decimal"), Some("http://hl7.org/fhir/item-type"))
  case DISPLAY extends ITEM_TYPE("display", Some("Display"), Some("http://hl7.org/fhir/item-type"))
  case GROUP extends ITEM_TYPE("group", Some("Group"), Some("http://hl7.org/fhir/item-type"))
  case INTEGER extends ITEM_TYPE("integer", Some("Integer"), Some("http://hl7.org/fhir/item-type"))
  case OPEN_CHOICE extends ITEM_TYPE("open-choice", Some("Open Choice"), Some("http://hl7.org/fhir/item-type"))
  case QUANTITY extends ITEM_TYPE("quantity", Some("Quantity"), Some("http://hl7.org/fhir/item-type"))
  case QUESTION extends ITEM_TYPE("question", Some("Question"), Some("http://hl7.org/fhir/item-type"))
  case REFERENCE extends ITEM_TYPE("reference", Some("Reference"), Some("http://hl7.org/fhir/item-type"))
  case STRING extends ITEM_TYPE("string", Some("String"), Some("http://hl7.org/fhir/item-type"))
  case TEXT extends ITEM_TYPE("text", Some("Text"), Some("http://hl7.org/fhir/item-type"))
  case TIME extends ITEM_TYPE("time", Some("Time"), Some("http://hl7.org/fhir/item-type"))
  case URL extends ITEM_TYPE("url", Some("Url"), Some("http://hl7.org/fhir/item-type"))
}
object ITEM_TYPE extends EType[ITEM_TYPE]("http://hl7.org/fhir/ValueSet/item-type") 


enum LINKAGE_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ALTERNATE extends LINKAGE_TYPE("alternate", Some("Alternate Record"), Some("http://hl7.org/fhir/linkage-type"))
  case HISTORICAL extends LINKAGE_TYPE("historical", Some("Historical/Obsolete Record"), Some("http://hl7.org/fhir/linkage-type"))
  case SOURCE extends LINKAGE_TYPE("source", Some("Source of Truth"), Some("http://hl7.org/fhir/linkage-type"))
}
object LINKAGE_TYPE extends EType[LINKAGE_TYPE]("http://hl7.org/fhir/ValueSet/linkage-type") 


enum LINK_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case REFER extends LINK_TYPE("refer", Some("Refer"), Some("http://hl7.org/fhir/link-type"))
  case REPLACED_BY extends LINK_TYPE("replaced-by", Some("Replaced-by"), Some("http://hl7.org/fhir/link-type"))
  case REPLACES extends LINK_TYPE("replaces", Some("Replaces"), Some("http://hl7.org/fhir/link-type"))
  case SEEALSO extends LINK_TYPE("seealso", Some("See also"), Some("http://hl7.org/fhir/link-type"))
}
object LINK_TYPE extends EType[LINK_TYPE]("http://hl7.org/fhir/ValueSet/link-type") 


enum LIST_MODE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case CHANGES extends LIST_MODE("changes", Some("Change List"), Some("http://hl7.org/fhir/list-mode"))
  case SNAPSHOT extends LIST_MODE("snapshot", Some("Snapshot List"), Some("http://hl7.org/fhir/list-mode"))
  case WORKING extends LIST_MODE("working", Some("Working List"), Some("http://hl7.org/fhir/list-mode"))
}
object LIST_MODE extends EType[LIST_MODE]("http://hl7.org/fhir/ValueSet/list-mode") 


enum LIST_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case CURRENT extends LIST_STATUS("current", Some("Current"), Some("http://hl7.org/fhir/list-status"))
  case ENTERED_IN_ERROR extends LIST_STATUS("entered-in-error", Some("Entered In Error"), Some("http://hl7.org/fhir/list-status"))
  case RETIRED extends LIST_STATUS("retired", Some("Retired"), Some("http://hl7.org/fhir/list-status"))
}
object LIST_STATUS extends EType[LIST_STATUS]("http://hl7.org/fhir/ValueSet/list-status") 


enum LOCATION_MODE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case INSTANCE extends LOCATION_MODE("instance", Some("Instance"), Some("http://hl7.org/fhir/location-mode"))
  case KIND extends LOCATION_MODE("kind", Some("Kind"), Some("http://hl7.org/fhir/location-mode"))
}
object LOCATION_MODE extends EType[LOCATION_MODE]("http://hl7.org/fhir/ValueSet/location-mode") 


enum LOCATION_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ACTIVE extends LOCATION_STATUS("active", Some("Active"), Some("http://hl7.org/fhir/location-status"))
  case INACTIVE extends LOCATION_STATUS("inactive", Some("Inactive"), Some("http://hl7.org/fhir/location-status"))
  case SUSPENDED extends LOCATION_STATUS("suspended", Some("Suspended"), Some("http://hl7.org/fhir/location-status"))
}
object LOCATION_STATUS extends EType[LOCATION_STATUS]("http://hl7.org/fhir/ValueSet/location-status") 


enum MAP_CONTEXT_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case TYPE extends MAP_CONTEXT_TYPE("type", Some("Type"), Some("http://hl7.org/fhir/map-context-type"))
  case VARIABLE extends MAP_CONTEXT_TYPE("variable", Some("Variable"), Some("http://hl7.org/fhir/map-context-type"))
}
object MAP_CONTEXT_TYPE extends EType[MAP_CONTEXT_TYPE]("http://hl7.org/fhir/ValueSet/map-context-type") 


enum MAP_GROUP_TYPE_MODE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case NONE extends MAP_GROUP_TYPE_MODE("none", Some("Not a Default"), Some("http://hl7.org/fhir/map-group-type-mode"))
  case TYPES extends MAP_GROUP_TYPE_MODE("types", Some("Default for Type Combination"), Some("http://hl7.org/fhir/map-group-type-mode"))
  case TYPE_AND_TYPES extends MAP_GROUP_TYPE_MODE("type-and-types", Some("Default for type + combination"), Some("http://hl7.org/fhir/map-group-type-mode"))
}
object MAP_GROUP_TYPE_MODE extends EType[MAP_GROUP_TYPE_MODE]("http://hl7.org/fhir/ValueSet/map-group-type-mode") 


enum MAP_INPUT_MODE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case SOURCE extends MAP_INPUT_MODE("source", Some("Source Instance"), Some("http://hl7.org/fhir/map-input-mode"))
  case TARGET extends MAP_INPUT_MODE("target", Some("Target Instance"), Some("http://hl7.org/fhir/map-input-mode"))
}
object MAP_INPUT_MODE extends EType[MAP_INPUT_MODE]("http://hl7.org/fhir/ValueSet/map-input-mode") 


enum MAP_MODEL_MODE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case PRODUCED extends MAP_MODEL_MODE("produced", Some("Produced Structure Definition"), Some("http://hl7.org/fhir/map-model-mode"))
  case QUERIED extends MAP_MODEL_MODE("queried", Some("Queried Structure Definition"), Some("http://hl7.org/fhir/map-model-mode"))
  case SOURCE extends MAP_MODEL_MODE("source", Some("Source Structure Definition"), Some("http://hl7.org/fhir/map-model-mode"))
  case TARGET extends MAP_MODEL_MODE("target", Some("Target Structure Definition"), Some("http://hl7.org/fhir/map-model-mode"))
}
object MAP_MODEL_MODE extends EType[MAP_MODEL_MODE]("http://hl7.org/fhir/ValueSet/map-model-mode") 


enum MAP_SOURCE_LIST_MODE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case FIRST extends MAP_SOURCE_LIST_MODE("first", Some("First"), Some("http://hl7.org/fhir/map-source-list-mode"))
  case LAST extends MAP_SOURCE_LIST_MODE("last", Some("Last"), Some("http://hl7.org/fhir/map-source-list-mode"))
  case NOT_FIRST extends MAP_SOURCE_LIST_MODE("not_first", Some("All but the first"), Some("http://hl7.org/fhir/map-source-list-mode"))
  case NOT_LAST extends MAP_SOURCE_LIST_MODE("not_last", Some("All but the last"), Some("http://hl7.org/fhir/map-source-list-mode"))
  case ONLY_ONE extends MAP_SOURCE_LIST_MODE("only_one", Some("Enforce only one"), Some("http://hl7.org/fhir/map-source-list-mode"))
}
object MAP_SOURCE_LIST_MODE extends EType[MAP_SOURCE_LIST_MODE]("http://hl7.org/fhir/ValueSet/map-source-list-mode") 


enum MAP_TARGET_LIST_MODE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case COLLATE extends MAP_TARGET_LIST_MODE("collate", Some("Collate"), Some("http://hl7.org/fhir/map-target-list-mode"))
  case FIRST extends MAP_TARGET_LIST_MODE("first", Some("First"), Some("http://hl7.org/fhir/map-target-list-mode"))
  case LAST extends MAP_TARGET_LIST_MODE("last", Some("Last"), Some("http://hl7.org/fhir/map-target-list-mode"))
  case SHARE extends MAP_TARGET_LIST_MODE("share", Some("Share"), Some("http://hl7.org/fhir/map-target-list-mode"))
}
object MAP_TARGET_LIST_MODE extends EType[MAP_TARGET_LIST_MODE]("http://hl7.org/fhir/ValueSet/map-target-list-mode") 


enum MAP_TRANSFORM(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case APPEND extends MAP_TRANSFORM("append", Some("append"), Some("http://hl7.org/fhir/map-transform"))
  case C extends MAP_TRANSFORM("c", Some("c"), Some("http://hl7.org/fhir/map-transform"))
  case CAST extends MAP_TRANSFORM("cast", Some("cast"), Some("http://hl7.org/fhir/map-transform"))
  case CC extends MAP_TRANSFORM("cc", Some("cc"), Some("http://hl7.org/fhir/map-transform"))
  case COPY extends MAP_TRANSFORM("copy", Some("copy"), Some("http://hl7.org/fhir/map-transform"))
  case CP extends MAP_TRANSFORM("cp", Some("cp"), Some("http://hl7.org/fhir/map-transform"))
  case CREATE extends MAP_TRANSFORM("create", Some("create"), Some("http://hl7.org/fhir/map-transform"))
  case DATEOP extends MAP_TRANSFORM("dateOp", Some("dateOp"), Some("http://hl7.org/fhir/map-transform"))
  case ESCAPE extends MAP_TRANSFORM("escape", Some("escape"), Some("http://hl7.org/fhir/map-transform"))
  case EVALUATE extends MAP_TRANSFORM("evaluate", Some("evaluate"), Some("http://hl7.org/fhir/map-transform"))
  case ID extends MAP_TRANSFORM("id", Some("id"), Some("http://hl7.org/fhir/map-transform"))
  case POINTER extends MAP_TRANSFORM("pointer", Some("pointer"), Some("http://hl7.org/fhir/map-transform"))
  case QTY extends MAP_TRANSFORM("qty", Some("qty"), Some("http://hl7.org/fhir/map-transform"))
  case REFERENCE extends MAP_TRANSFORM("reference", Some("reference"), Some("http://hl7.org/fhir/map-transform"))
  case TRANSLATE extends MAP_TRANSFORM("translate", Some("translate"), Some("http://hl7.org/fhir/map-transform"))
  case TRUNCATE extends MAP_TRANSFORM("truncate", Some("truncate"), Some("http://hl7.org/fhir/map-transform"))
  case UUID extends MAP_TRANSFORM("uuid", Some("uuid"), Some("http://hl7.org/fhir/map-transform"))
}
object MAP_TRANSFORM extends EType[MAP_TRANSFORM]("http://hl7.org/fhir/ValueSet/map-transform") 


enum MEASURE_REPORT_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case COMPLETE extends MEASURE_REPORT_STATUS("complete", Some("Complete"), Some("http://hl7.org/fhir/measure-report-status"))
  case ERROR extends MEASURE_REPORT_STATUS("error", Some("Error"), Some("http://hl7.org/fhir/measure-report-status"))
  case PENDING extends MEASURE_REPORT_STATUS("pending", Some("Pending"), Some("http://hl7.org/fhir/measure-report-status"))
}
object MEASURE_REPORT_STATUS extends EType[MEASURE_REPORT_STATUS]("http://hl7.org/fhir/ValueSet/measure-report-status") 


enum MEASURE_REPORT_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case DATA_COLLECTION extends MEASURE_REPORT_TYPE("data-collection", Some("Data Collection"), Some("http://hl7.org/fhir/measure-report-type"))
  case INDIVIDUAL extends MEASURE_REPORT_TYPE("individual", Some("Individual"), Some("http://hl7.org/fhir/measure-report-type"))
  case SUBJECT_LIST extends MEASURE_REPORT_TYPE("subject-list", Some("Subject List"), Some("http://hl7.org/fhir/measure-report-type"))
  case SUMMARY extends MEASURE_REPORT_TYPE("summary", Some("Summary"), Some("http://hl7.org/fhir/measure-report-type"))
}
object MEASURE_REPORT_TYPE extends EType[MEASURE_REPORT_TYPE]("http://hl7.org/fhir/ValueSet/measure-report-type") 


enum MEDICATIONDISPENSE_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case CANCELLED extends MEDICATIONDISPENSE_STATUS("cancelled", Some("Cancelled"), Some("http://terminology.hl7.org/CodeSystem/medicationdispense-status"))
  case COMPLETED extends MEDICATIONDISPENSE_STATUS("completed", Some("Completed"), Some("http://terminology.hl7.org/CodeSystem/medicationdispense-status"))
  case DECLINED extends MEDICATIONDISPENSE_STATUS("declined", Some("Declined"), Some("http://terminology.hl7.org/CodeSystem/medicationdispense-status"))
  case ENTERED_IN_ERROR extends MEDICATIONDISPENSE_STATUS("entered-in-error", Some("Entered in Error"), Some("http://terminology.hl7.org/CodeSystem/medicationdispense-status"))
  case IN_PROGRESS extends MEDICATIONDISPENSE_STATUS("in-progress", Some("In Progress"), Some("http://terminology.hl7.org/CodeSystem/medicationdispense-status"))
  case ON_HOLD extends MEDICATIONDISPENSE_STATUS("on-hold", Some("On Hold"), Some("http://terminology.hl7.org/CodeSystem/medicationdispense-status"))
  case PREPARATION extends MEDICATIONDISPENSE_STATUS("preparation", Some("Preparation"), Some("http://terminology.hl7.org/CodeSystem/medicationdispense-status"))
  case STOPPED extends MEDICATIONDISPENSE_STATUS("stopped", Some("Stopped"), Some("http://terminology.hl7.org/CodeSystem/medicationdispense-status"))
  case UNKNOWN extends MEDICATIONDISPENSE_STATUS("unknown", Some("Unknown"), Some("http://terminology.hl7.org/CodeSystem/medicationdispense-status"))
}
object MEDICATIONDISPENSE_STATUS extends EType[MEDICATIONDISPENSE_STATUS]("http://hl7.org/fhir/ValueSet/medicationdispense-status") 


enum MEDICATIONKNOWLEDGE_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ACTIVE extends MEDICATIONKNOWLEDGE_STATUS("active", Some("Active"), Some("http://terminology.hl7.org/CodeSystem/medicationknowledge-status"))
  case ENTERED_IN_ERROR extends MEDICATIONKNOWLEDGE_STATUS("entered-in-error", Some("Entered in Error"), Some("http://terminology.hl7.org/CodeSystem/medicationknowledge-status"))
  case INACTIVE extends MEDICATIONKNOWLEDGE_STATUS("inactive", Some("Inactive"), Some("http://terminology.hl7.org/CodeSystem/medicationknowledge-status"))
}
object MEDICATIONKNOWLEDGE_STATUS extends EType[MEDICATIONKNOWLEDGE_STATUS]("http://hl7.org/fhir/ValueSet/medicationknowledge-status") 


enum MEDICATIONREQUEST_INTENT(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case FILLER_ORDER extends MEDICATIONREQUEST_INTENT("filler-order", Some("Filler Order"), Some("http://hl7.org/fhir/CodeSystem/medicationrequest-intent"))
  case INSTANCE_ORDER extends MEDICATIONREQUEST_INTENT("instance-order", Some("Instance Order"), Some("http://hl7.org/fhir/CodeSystem/medicationrequest-intent"))
  case OPTION extends MEDICATIONREQUEST_INTENT("option", Some("Option"), Some("http://hl7.org/fhir/CodeSystem/medicationrequest-intent"))
  case ORDER extends MEDICATIONREQUEST_INTENT("order", Some("Order"), Some("http://hl7.org/fhir/CodeSystem/medicationrequest-intent"))
  case ORIGINAL_ORDER extends MEDICATIONREQUEST_INTENT("original-order", Some("Original Order"), Some("http://hl7.org/fhir/CodeSystem/medicationrequest-intent"))
  case PLAN extends MEDICATIONREQUEST_INTENT("plan", Some("Plan"), Some("http://hl7.org/fhir/CodeSystem/medicationrequest-intent"))
  case PROPOSAL extends MEDICATIONREQUEST_INTENT("proposal", Some("Proposal"), Some("http://hl7.org/fhir/CodeSystem/medicationrequest-intent"))
  case REFLEX_ORDER extends MEDICATIONREQUEST_INTENT("reflex-order", Some("Reflex Order"), Some("http://hl7.org/fhir/CodeSystem/medicationrequest-intent"))
}
object MEDICATIONREQUEST_INTENT extends EType[MEDICATIONREQUEST_INTENT]("http://hl7.org/fhir/ValueSet/medicationrequest-intent") 


enum MEDICATIONREQUEST_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ACTIVE extends MEDICATIONREQUEST_STATUS("active", Some("Active"), Some("http://hl7.org/fhir/CodeSystem/medicationrequest-status"))
  case CANCELLED extends MEDICATIONREQUEST_STATUS("cancelled", Some("Cancelled"), Some("http://hl7.org/fhir/CodeSystem/medicationrequest-status"))
  case COMPLETED extends MEDICATIONREQUEST_STATUS("completed", Some("Completed"), Some("http://hl7.org/fhir/CodeSystem/medicationrequest-status"))
  case DRAFT extends MEDICATIONREQUEST_STATUS("draft", Some("Draft"), Some("http://hl7.org/fhir/CodeSystem/medicationrequest-status"))
  case ENTERED_IN_ERROR extends MEDICATIONREQUEST_STATUS("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/CodeSystem/medicationrequest-status"))
  case ON_HOLD extends MEDICATIONREQUEST_STATUS("on-hold", Some("On Hold"), Some("http://hl7.org/fhir/CodeSystem/medicationrequest-status"))
  case STOPPED extends MEDICATIONREQUEST_STATUS("stopped", Some("Stopped"), Some("http://hl7.org/fhir/CodeSystem/medicationrequest-status"))
  case UNKNOWN extends MEDICATIONREQUEST_STATUS("unknown", Some("Unknown"), Some("http://hl7.org/fhir/CodeSystem/medicationrequest-status"))
}
object MEDICATIONREQUEST_STATUS extends EType[MEDICATIONREQUEST_STATUS]("http://hl7.org/fhir/ValueSet/medicationrequest-status") 


enum MEDICATION_ADMIN_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case COMPLETED extends MEDICATION_ADMIN_STATUS("completed", Some("Completed"), Some("http://terminology.hl7.org/CodeSystem/medication-admin-status"))
  case ENTERED_IN_ERROR extends MEDICATION_ADMIN_STATUS("entered-in-error", Some("Entered in Error"), Some("http://terminology.hl7.org/CodeSystem/medication-admin-status"))
  case IN_PROGRESS extends MEDICATION_ADMIN_STATUS("in-progress", Some("In Progress"), Some("http://terminology.hl7.org/CodeSystem/medication-admin-status"))
  case NOT_DONE extends MEDICATION_ADMIN_STATUS("not-done", Some("Not Done"), Some("http://terminology.hl7.org/CodeSystem/medication-admin-status"))
  case ON_HOLD extends MEDICATION_ADMIN_STATUS("on-hold", Some("On Hold"), Some("http://terminology.hl7.org/CodeSystem/medication-admin-status"))
  case STOPPED extends MEDICATION_ADMIN_STATUS("stopped", Some("Stopped"), Some("http://terminology.hl7.org/CodeSystem/medication-admin-status"))
  case UNKNOWN extends MEDICATION_ADMIN_STATUS("unknown", Some("Unknown"), Some("http://terminology.hl7.org/CodeSystem/medication-admin-status"))
}
object MEDICATION_ADMIN_STATUS extends EType[MEDICATION_ADMIN_STATUS]("http://hl7.org/fhir/ValueSet/medication-admin-status") 


enum MEDICATION_STATEMENT_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ACTIVE extends MEDICATION_STATEMENT_STATUS("active", Some("Active"), Some("http://hl7.org/fhir/CodeSystem/medication-statement-status"))
  case COMPLETED extends MEDICATION_STATEMENT_STATUS("completed", Some("Completed"), Some("http://hl7.org/fhir/CodeSystem/medication-statement-status"))
  case ENTERED_IN_ERROR extends MEDICATION_STATEMENT_STATUS("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/CodeSystem/medication-statement-status"))
  case INTENDED extends MEDICATION_STATEMENT_STATUS("intended", Some("Intended"), Some("http://hl7.org/fhir/CodeSystem/medication-statement-status"))
  case NOT_TAKEN extends MEDICATION_STATEMENT_STATUS("not-taken", Some("Not Taken"), Some("http://hl7.org/fhir/CodeSystem/medication-statement-status"))
  case ON_HOLD extends MEDICATION_STATEMENT_STATUS("on-hold", Some("On Hold"), Some("http://hl7.org/fhir/CodeSystem/medication-statement-status"))
  case STOPPED extends MEDICATION_STATEMENT_STATUS("stopped", Some("Stopped"), Some("http://hl7.org/fhir/CodeSystem/medication-statement-status"))
  case UNKNOWN extends MEDICATION_STATEMENT_STATUS("unknown", Some("Unknown"), Some("http://hl7.org/fhir/CodeSystem/medication-statement-status"))
}
object MEDICATION_STATEMENT_STATUS extends EType[MEDICATION_STATEMENT_STATUS]("http://hl7.org/fhir/ValueSet/medication-statement-status") 


enum MEDICATION_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ACTIVE extends MEDICATION_STATUS("active", Some("Active"), Some("http://hl7.org/fhir/CodeSystem/medication-status"))
  case ENTERED_IN_ERROR extends MEDICATION_STATUS("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/CodeSystem/medication-status"))
  case INACTIVE extends MEDICATION_STATUS("inactive", Some("Inactive"), Some("http://hl7.org/fhir/CodeSystem/medication-status"))
}
object MEDICATION_STATUS extends EType[MEDICATION_STATUS]("http://hl7.org/fhir/ValueSet/medication-status") 


enum MESSAGEHEADER_RESPONSE_REQUEST(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ALWAYS extends MESSAGEHEADER_RESPONSE_REQUEST("always", Some("Always"), Some("http://hl7.org/fhir/messageheader-response-request"))
  case NEVER extends MESSAGEHEADER_RESPONSE_REQUEST("never", Some("Never"), Some("http://hl7.org/fhir/messageheader-response-request"))
  case ON_ERROR extends MESSAGEHEADER_RESPONSE_REQUEST("on-error", Some("Error/reject conditions only"), Some("http://hl7.org/fhir/messageheader-response-request"))
  case SUCCESSFUL_COMPLETION_ONLY extends MESSAGEHEADER_RESPONSE_REQUEST("on-success", Some("Successful completion only"), Some("http://hl7.org/fhir/messageheader-response-request"))
}
object MESSAGEHEADER_RESPONSE_REQUEST extends EType[MESSAGEHEADER_RESPONSE_REQUEST]("http://hl7.org/fhir/ValueSet/messageheader-response-request") 


enum MESSAGE_SIGNIFICANCE_CATEGORY(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case CONSEQUENCE extends MESSAGE_SIGNIFICANCE_CATEGORY("consequence", Some("Consequence"), Some("http://hl7.org/fhir/message-significance-category"))
  case CURRENCY extends MESSAGE_SIGNIFICANCE_CATEGORY("currency", Some("Currency"), Some("http://hl7.org/fhir/message-significance-category"))
  case NOTIFICATION extends MESSAGE_SIGNIFICANCE_CATEGORY("notification", Some("Notification"), Some("http://hl7.org/fhir/message-significance-category"))
}
object MESSAGE_SIGNIFICANCE_CATEGORY extends EType[MESSAGE_SIGNIFICANCE_CATEGORY]("http://hl7.org/fhir/ValueSet/message-significance-category") 


enum METRIC_CALIBRATION_STATE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case CALIBRATED extends METRIC_CALIBRATION_STATE("calibrated", Some("Calibrated"), Some("http://hl7.org/fhir/metric-calibration-state"))
  case CALIBRATION_REQUIRED extends METRIC_CALIBRATION_STATE("calibration-required", Some("Calibration Required"), Some("http://hl7.org/fhir/metric-calibration-state"))
  case NOT_CALIBRATED extends METRIC_CALIBRATION_STATE("not-calibrated", Some("Not Calibrated"), Some("http://hl7.org/fhir/metric-calibration-state"))
  case UNSPECIFIED extends METRIC_CALIBRATION_STATE("unspecified", Some("Unspecified"), Some("http://hl7.org/fhir/metric-calibration-state"))
}
object METRIC_CALIBRATION_STATE extends EType[METRIC_CALIBRATION_STATE]("http://hl7.org/fhir/ValueSet/metric-calibration-state") 


enum METRIC_CALIBRATION_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case GAIN extends METRIC_CALIBRATION_TYPE("gain", Some("Gain"), Some("http://hl7.org/fhir/metric-calibration-type"))
  case OFFSET extends METRIC_CALIBRATION_TYPE("offset", Some("Offset"), Some("http://hl7.org/fhir/metric-calibration-type"))
  case TWO_POINT extends METRIC_CALIBRATION_TYPE("two-point", Some("Two Point"), Some("http://hl7.org/fhir/metric-calibration-type"))
  case UNSPECIFIED extends METRIC_CALIBRATION_TYPE("unspecified", Some("Unspecified"), Some("http://hl7.org/fhir/metric-calibration-type"))
}
object METRIC_CALIBRATION_TYPE extends EType[METRIC_CALIBRATION_TYPE]("http://hl7.org/fhir/ValueSet/metric-calibration-type") 


enum METRIC_CATEGORY(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case CALCULATION extends METRIC_CATEGORY("calculation", Some("Calculation"), Some("http://hl7.org/fhir/metric-category"))
  case MEASUREMENT extends METRIC_CATEGORY("measurement", Some("Measurement"), Some("http://hl7.org/fhir/metric-category"))
  case SETTING extends METRIC_CATEGORY("setting", Some("Setting"), Some("http://hl7.org/fhir/metric-category"))
  case UNSPECIFIED extends METRIC_CATEGORY("unspecified", Some("Unspecified"), Some("http://hl7.org/fhir/metric-category"))
}
object METRIC_CATEGORY extends EType[METRIC_CATEGORY]("http://hl7.org/fhir/ValueSet/metric-category") 


enum METRIC_COLOR(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case BLACK extends METRIC_COLOR("black", Some("Color Black"), Some("http://hl7.org/fhir/metric-color"))
  case BLUE extends METRIC_COLOR("blue", Some("Color Blue"), Some("http://hl7.org/fhir/metric-color"))
  case CYAN extends METRIC_COLOR("cyan", Some("Color Cyan"), Some("http://hl7.org/fhir/metric-color"))
  case GREEN extends METRIC_COLOR("green", Some("Color Green"), Some("http://hl7.org/fhir/metric-color"))
  case MAGENTA extends METRIC_COLOR("magenta", Some("Color Magenta"), Some("http://hl7.org/fhir/metric-color"))
  case RED extends METRIC_COLOR("red", Some("Color Red"), Some("http://hl7.org/fhir/metric-color"))
  case WHITE extends METRIC_COLOR("white", Some("Color White"), Some("http://hl7.org/fhir/metric-color"))
  case YELLOW extends METRIC_COLOR("yellow", Some("Color Yellow"), Some("http://hl7.org/fhir/metric-color"))
}
object METRIC_COLOR extends EType[METRIC_COLOR]("http://hl7.org/fhir/ValueSet/metric-color") 


enum METRIC_OPERATIONAL_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ENTERED_IN_ERROR extends METRIC_OPERATIONAL_STATUS("entered-in-error", Some("Entered In Error"), Some("http://hl7.org/fhir/metric-operational-status"))
  case OFF extends METRIC_OPERATIONAL_STATUS("off", Some("Off"), Some("http://hl7.org/fhir/metric-operational-status"))
  case ON extends METRIC_OPERATIONAL_STATUS("on", Some("On"), Some("http://hl7.org/fhir/metric-operational-status"))
  case STANDBY extends METRIC_OPERATIONAL_STATUS("standby", Some("Standby"), Some("http://hl7.org/fhir/metric-operational-status"))
}
object METRIC_OPERATIONAL_STATUS extends EType[METRIC_OPERATIONAL_STATUS]("http://hl7.org/fhir/ValueSet/metric-operational-status") 


enum NAMINGSYSTEM_IDENTIFIER_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case OID extends NAMINGSYSTEM_IDENTIFIER_TYPE("oid", Some("OID"), Some("http://hl7.org/fhir/namingsystem-identifier-type"))
  case OTHER extends NAMINGSYSTEM_IDENTIFIER_TYPE("other", Some("Other"), Some("http://hl7.org/fhir/namingsystem-identifier-type"))
  case URI extends NAMINGSYSTEM_IDENTIFIER_TYPE("uri", Some("URI"), Some("http://hl7.org/fhir/namingsystem-identifier-type"))
  case UUID extends NAMINGSYSTEM_IDENTIFIER_TYPE("uuid", Some("UUID"), Some("http://hl7.org/fhir/namingsystem-identifier-type"))
}
object NAMINGSYSTEM_IDENTIFIER_TYPE extends EType[NAMINGSYSTEM_IDENTIFIER_TYPE]("http://hl7.org/fhir/ValueSet/namingsystem-identifier-type") 


enum NAMINGSYSTEM_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case CODESYSTEM extends NAMINGSYSTEM_TYPE("codesystem", Some("Code System"), Some("http://hl7.org/fhir/namingsystem-type"))
  case IDENTIFIER extends NAMINGSYSTEM_TYPE("identifier", Some("Identifier"), Some("http://hl7.org/fhir/namingsystem-type"))
  case ROOT extends NAMINGSYSTEM_TYPE("root", Some("Root"), Some("http://hl7.org/fhir/namingsystem-type"))
}
object NAMINGSYSTEM_TYPE extends EType[NAMINGSYSTEM_TYPE]("http://hl7.org/fhir/ValueSet/namingsystem-type") 


enum NARRATIVE_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ADDITIONAL extends NARRATIVE_STATUS("additional", Some("Additional"), Some("http://hl7.org/fhir/narrative-status"))
  case EMPTY extends NARRATIVE_STATUS("empty", Some("Empty"), Some("http://hl7.org/fhir/narrative-status"))
  case EXTENSIONS extends NARRATIVE_STATUS("extensions", Some("Extensions"), Some("http://hl7.org/fhir/narrative-status"))
  case GENERATED extends NARRATIVE_STATUS("generated", Some("Generated"), Some("http://hl7.org/fhir/narrative-status"))
}
object NARRATIVE_STATUS extends EType[NARRATIVE_STATUS]("http://hl7.org/fhir/ValueSet/narrative-status") 


enum NETWORK_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case EMAIL_ADDRESS extends NETWORK_TYPE("4", Some("Email address"), Some("http://hl7.org/fhir/network-type"))
  case IP_ADDRESS extends NETWORK_TYPE("2", Some("IP Address"), Some("http://hl7.org/fhir/network-type"))
  case MACHINE_NAME extends NETWORK_TYPE("1", Some("Machine Name"), Some("http://hl7.org/fhir/network-type"))
  case TELEPHONE_NUMBER extends NETWORK_TYPE("3", Some("Telephone Number"), Some("http://hl7.org/fhir/network-type"))
  case URI extends NETWORK_TYPE("5", Some("URI"), Some("http://hl7.org/fhir/network-type"))
}
object NETWORK_TYPE extends EType[NETWORK_TYPE]("http://hl7.org/fhir/ValueSet/network-type") 


enum NOTE_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case DISPLAY extends NOTE_TYPE("display", Some("Display"), Some("http://hl7.org/fhir/note-type"))
  case PRINT extends NOTE_TYPE("print", Some("Print (Form)"), Some("http://hl7.org/fhir/note-type"))
  case PRINTOPER extends NOTE_TYPE("printoper", Some("Print (Operator)"), Some("http://hl7.org/fhir/note-type"))
}
object NOTE_TYPE extends EType[NOTE_TYPE]("http://hl7.org/fhir/ValueSet/note-type") 


enum OBSERVATION_RANGE_CATEGORY(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ABSOLUTE extends OBSERVATION_RANGE_CATEGORY("absolute", Some("absolute range"), Some("http://hl7.org/fhir/observation-range-category"))
  case CRITICAL extends OBSERVATION_RANGE_CATEGORY("critical", Some("critical range"), Some("http://hl7.org/fhir/observation-range-category"))
  case REFERENCE extends OBSERVATION_RANGE_CATEGORY("reference", Some("reference range"), Some("http://hl7.org/fhir/observation-range-category"))
}
object OBSERVATION_RANGE_CATEGORY extends EType[OBSERVATION_RANGE_CATEGORY]("http://hl7.org/fhir/ValueSet/observation-range-category") 


enum OBSERVATION_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case AMENDED extends OBSERVATION_STATUS("amended", Some("Amended"), Some("http://hl7.org/fhir/observation-status"))
  case CANCELLED extends OBSERVATION_STATUS("cancelled", Some("Cancelled"), Some("http://hl7.org/fhir/observation-status"))
  case CORRECTED extends OBSERVATION_STATUS("corrected", Some("Corrected"), Some("http://hl7.org/fhir/observation-status"))
  case ENTERED_IN_ERROR extends OBSERVATION_STATUS("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/observation-status"))
  case FINAL extends OBSERVATION_STATUS("final", Some("Final"), Some("http://hl7.org/fhir/observation-status"))
  case PRELIMINARY extends OBSERVATION_STATUS("preliminary", Some("Preliminary"), Some("http://hl7.org/fhir/observation-status"))
  case REGISTERED extends OBSERVATION_STATUS("registered", Some("Registered"), Some("http://hl7.org/fhir/observation-status"))
  case UNKNOWN extends OBSERVATION_STATUS("unknown", Some("Unknown"), Some("http://hl7.org/fhir/observation-status"))
}
object OBSERVATION_STATUS extends EType[OBSERVATION_STATUS]("http://hl7.org/fhir/ValueSet/observation-status") 


enum OPERATION_KIND(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case OPERATION extends OPERATION_KIND("operation", Some("Operation"), Some("http://hl7.org/fhir/operation-kind"))
  case QUERY extends OPERATION_KIND("query", Some("Query"), Some("http://hl7.org/fhir/operation-kind"))
}
object OPERATION_KIND extends EType[OPERATION_KIND]("http://hl7.org/fhir/ValueSet/operation-kind") 


enum ORIENTATION_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ANTISENSE extends ORIENTATION_TYPE("antisense", Some("Antisense orientation of referenceSeq"), Some("http://hl7.org/fhir/orientation-type"))
  case SENSE extends ORIENTATION_TYPE("sense", Some("Sense orientation of referenceSeq"), Some("http://hl7.org/fhir/orientation-type"))
}
object ORIENTATION_TYPE extends EType[ORIENTATION_TYPE]("http://hl7.org/fhir/ValueSet/orientation-type") 


enum PARTICIPANTREQUIRED(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case INFORMATION_ONLY extends PARTICIPANTREQUIRED("information-only", Some("Information Only"), Some("http://hl7.org/fhir/participantrequired"))
  case OPTIONAL extends PARTICIPANTREQUIRED("optional", Some("Optional"), Some("http://hl7.org/fhir/participantrequired"))
  case REQUIRED extends PARTICIPANTREQUIRED("required", Some("Required"), Some("http://hl7.org/fhir/participantrequired"))
}
object PARTICIPANTREQUIRED extends EType[PARTICIPANTREQUIRED]("http://hl7.org/fhir/ValueSet/participantrequired") 


enum PARTICIPATIONSTATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ACCEPTED extends PARTICIPATIONSTATUS("accepted", Some("Accepted"), Some("http://hl7.org/fhir/participationstatus"))
  case DECLINED extends PARTICIPATIONSTATUS("declined", Some("Declined"), Some("http://hl7.org/fhir/participationstatus"))
  case NEEDS_ACTION extends PARTICIPATIONSTATUS("needs-action", Some("Needs Action"), Some("http://hl7.org/fhir/participationstatus"))
  case TENTATIVE extends PARTICIPATIONSTATUS("tentative", Some("Tentative"), Some("http://hl7.org/fhir/participationstatus"))
}
object PARTICIPATIONSTATUS extends EType[PARTICIPATIONSTATUS]("http://hl7.org/fhir/ValueSet/participationstatus") 


enum PERMITTED_DATA_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case BOOLEAN extends PERMITTED_DATA_TYPE("boolean", Some("boolean"), Some("http://hl7.org/fhir/permitted-data-type"))
  case CODEABLECONCEPT extends PERMITTED_DATA_TYPE("CodeableConcept", Some("CodeableConcept"), Some("http://hl7.org/fhir/permitted-data-type"))
  case DATETIME extends PERMITTED_DATA_TYPE("dateTime", Some("dateTime"), Some("http://hl7.org/fhir/permitted-data-type"))
  case INTEGER extends PERMITTED_DATA_TYPE("integer", Some("integer"), Some("http://hl7.org/fhir/permitted-data-type"))
  case PERIOD extends PERMITTED_DATA_TYPE("Period", Some("Period"), Some("http://hl7.org/fhir/permitted-data-type"))
  case QUANTITY extends PERMITTED_DATA_TYPE("Quantity", Some("Quantity"), Some("http://hl7.org/fhir/permitted-data-type"))
  case RANGE extends PERMITTED_DATA_TYPE("Range", Some("Range"), Some("http://hl7.org/fhir/permitted-data-type"))
  case RATIO extends PERMITTED_DATA_TYPE("Ratio", Some("Ratio"), Some("http://hl7.org/fhir/permitted-data-type"))
  case SAMPLEDDATA extends PERMITTED_DATA_TYPE("SampledData", Some("SampledData"), Some("http://hl7.org/fhir/permitted-data-type"))
  case STRING extends PERMITTED_DATA_TYPE("string", Some("string"), Some("http://hl7.org/fhir/permitted-data-type"))
  case TIME extends PERMITTED_DATA_TYPE("time", Some("time"), Some("http://hl7.org/fhir/permitted-data-type"))
}
object PERMITTED_DATA_TYPE extends EType[PERMITTED_DATA_TYPE]("http://hl7.org/fhir/ValueSet/permitted-data-type") 


enum PRODUCT_CATEGORY(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case BIOLOGICALAGENT extends PRODUCT_CATEGORY("biologicalAgent", Some("BiologicalAgent"), Some("http://hl7.org/fhir/product-category"))
  case CELLS extends PRODUCT_CATEGORY("cells", Some("Cells"), Some("http://hl7.org/fhir/product-category"))
  case FLUID extends PRODUCT_CATEGORY("fluid", Some("Fluid"), Some("http://hl7.org/fhir/product-category"))
  case ORGAN extends PRODUCT_CATEGORY("organ", Some("Organ"), Some("http://hl7.org/fhir/product-category"))
  case TISSUE extends PRODUCT_CATEGORY("tissue", Some("Tissue"), Some("http://hl7.org/fhir/product-category"))
}
object PRODUCT_CATEGORY extends EType[PRODUCT_CATEGORY]("http://hl7.org/fhir/ValueSet/product-category") 


enum PRODUCT_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case AVAILABLE extends PRODUCT_STATUS("available", Some("Available"), Some("http://hl7.org/fhir/product-status"))
  case UNAVAILABLE extends PRODUCT_STATUS("unavailable", Some("Unavailable"), Some("http://hl7.org/fhir/product-status"))
}
object PRODUCT_STATUS extends EType[PRODUCT_STATUS]("http://hl7.org/fhir/ValueSet/product-status") 


enum PRODUCT_STORAGE_SCALE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case CELSIUS extends PRODUCT_STORAGE_SCALE("celsius", Some("Celsius"), Some("http://hl7.org/fhir/product-storage-scale"))
  case FARENHEIT extends PRODUCT_STORAGE_SCALE("farenheit", Some("Fahrenheit"), Some("http://hl7.org/fhir/product-storage-scale"))
  case KELVIN extends PRODUCT_STORAGE_SCALE("kelvin", Some("Kelvin"), Some("http://hl7.org/fhir/product-storage-scale"))
}
object PRODUCT_STORAGE_SCALE extends EType[PRODUCT_STORAGE_SCALE]("http://hl7.org/fhir/ValueSet/product-storage-scale") 


enum PROPERTY_REPRESENTATION(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case CDATEXT extends PROPERTY_REPRESENTATION("cdaText", Some("CDA Text Format"), Some("http://hl7.org/fhir/property-representation"))
  case TYPEATTR extends PROPERTY_REPRESENTATION("typeAttr", Some("Type Attribute"), Some("http://hl7.org/fhir/property-representation"))
  case XHTML extends PROPERTY_REPRESENTATION("xhtml", Some("XHTML"), Some("http://hl7.org/fhir/property-representation"))
  case XMLATTR extends PROPERTY_REPRESENTATION("xmlAttr", Some("XML Attribute"), Some("http://hl7.org/fhir/property-representation"))
  case XMLTEXT extends PROPERTY_REPRESENTATION("xmlText", Some("XML Text"), Some("http://hl7.org/fhir/property-representation"))
}
object PROPERTY_REPRESENTATION extends EType[PROPERTY_REPRESENTATION]("http://hl7.org/fhir/ValueSet/property-representation") 


enum PROVENANCE_ENTITY_ROLE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case DERIVATION extends PROVENANCE_ENTITY_ROLE("derivation", Some("Derivation"), Some("http://hl7.org/fhir/provenance-entity-role"))
  case QUOTATION extends PROVENANCE_ENTITY_ROLE("quotation", Some("Quotation"), Some("http://hl7.org/fhir/provenance-entity-role"))
  case REMOVAL extends PROVENANCE_ENTITY_ROLE("removal", Some("Removal"), Some("http://hl7.org/fhir/provenance-entity-role"))
  case REVISION extends PROVENANCE_ENTITY_ROLE("revision", Some("Revision"), Some("http://hl7.org/fhir/provenance-entity-role"))
  case SOURCE extends PROVENANCE_ENTITY_ROLE("source", Some("Source"), Some("http://hl7.org/fhir/provenance-entity-role"))
}
object PROVENANCE_ENTITY_ROLE extends EType[PROVENANCE_ENTITY_ROLE]("http://hl7.org/fhir/ValueSet/provenance-entity-role") 


enum PUBLICATION_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ACTIVE extends PUBLICATION_STATUS("active", Some("Active"), Some("http://hl7.org/fhir/publication-status"))
  case DRAFT extends PUBLICATION_STATUS("draft", Some("Draft"), Some("http://hl7.org/fhir/publication-status"))
  case RETIRED extends PUBLICATION_STATUS("retired", Some("Retired"), Some("http://hl7.org/fhir/publication-status"))
  case UNKNOWN extends PUBLICATION_STATUS("unknown", Some("Unknown"), Some("http://hl7.org/fhir/publication-status"))
}
object PUBLICATION_STATUS extends EType[PUBLICATION_STATUS]("http://hl7.org/fhir/ValueSet/publication-status") 


enum QUALITY_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case INDEL extends QUALITY_TYPE("indel", Some("INDEL Comparison"), Some("http://hl7.org/fhir/quality-type"))
  case SNP extends QUALITY_TYPE("snp", Some("SNP Comparison"), Some("http://hl7.org/fhir/quality-type"))
  case UNKNOWN extends QUALITY_TYPE("unknown", Some("UNKNOWN Comparison"), Some("http://hl7.org/fhir/quality-type"))
}
object QUALITY_TYPE extends EType[QUALITY_TYPE]("http://hl7.org/fhir/ValueSet/quality-type") 


enum QUESTIONNAIRE_ANSWERS_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case AMENDED extends QUESTIONNAIRE_ANSWERS_STATUS("amended", Some("Amended"), Some("http://hl7.org/fhir/questionnaire-answers-status"))
  case COMPLETED extends QUESTIONNAIRE_ANSWERS_STATUS("completed", Some("Completed"), Some("http://hl7.org/fhir/questionnaire-answers-status"))
  case ENTERED_IN_ERROR extends QUESTIONNAIRE_ANSWERS_STATUS("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/questionnaire-answers-status"))
  case IN_PROGRESS extends QUESTIONNAIRE_ANSWERS_STATUS("in-progress", Some("In Progress"), Some("http://hl7.org/fhir/questionnaire-answers-status"))
  case STOPPED extends QUESTIONNAIRE_ANSWERS_STATUS("stopped", Some("Stopped"), Some("http://hl7.org/fhir/questionnaire-answers-status"))
}
object QUESTIONNAIRE_ANSWERS_STATUS extends EType[QUESTIONNAIRE_ANSWERS_STATUS]("http://hl7.org/fhir/ValueSet/questionnaire-answers-status") 


enum QUESTIONNAIRE_ENABLE_BEHAVIOR(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ALL extends QUESTIONNAIRE_ENABLE_BEHAVIOR("all", Some("All"), Some("http://hl7.org/fhir/questionnaire-enable-behavior"))
  case ANY extends QUESTIONNAIRE_ENABLE_BEHAVIOR("any", Some("Any"), Some("http://hl7.org/fhir/questionnaire-enable-behavior"))
}
object QUESTIONNAIRE_ENABLE_BEHAVIOR extends EType[QUESTIONNAIRE_ENABLE_BEHAVIOR]("http://hl7.org/fhir/ValueSet/questionnaire-enable-behavior") 


enum QUESTIONNAIRE_ENABLE_OPERATOR(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case EQUALS extends QUESTIONNAIRE_ENABLE_OPERATOR("=", Some("Equals"), Some("http://hl7.org/fhir/questionnaire-enable-operator"))
  case EXISTS extends QUESTIONNAIRE_ENABLE_OPERATOR("exists", Some("Exists"), Some("http://hl7.org/fhir/questionnaire-enable-operator"))
  case GREATER_OR_EQUALS extends QUESTIONNAIRE_ENABLE_OPERATOR(">=", Some("Greater or Equals"), Some("http://hl7.org/fhir/questionnaire-enable-operator"))
  case GREATER_THAN extends QUESTIONNAIRE_ENABLE_OPERATOR(">", Some("Greater Than"), Some("http://hl7.org/fhir/questionnaire-enable-operator"))
  case LESS_OR_EQUALS extends QUESTIONNAIRE_ENABLE_OPERATOR("<=", Some("Less or Equals"), Some("http://hl7.org/fhir/questionnaire-enable-operator"))
  case LESS_THAN extends QUESTIONNAIRE_ENABLE_OPERATOR("<", Some("Less Than"), Some("http://hl7.org/fhir/questionnaire-enable-operator"))
  case NOT_EQUALS extends QUESTIONNAIRE_ENABLE_OPERATOR("!=", Some("Not Equals"), Some("http://hl7.org/fhir/questionnaire-enable-operator"))
}
object QUESTIONNAIRE_ENABLE_OPERATOR extends EType[QUESTIONNAIRE_ENABLE_OPERATOR]("http://hl7.org/fhir/ValueSet/questionnaire-enable-operator") 


enum REACTION_EVENT_SEVERITY(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case MILD extends REACTION_EVENT_SEVERITY("mild", Some("Mild"), Some("http://hl7.org/fhir/reaction-event-severity"))
  case MODERATE extends REACTION_EVENT_SEVERITY("moderate", Some("Moderate"), Some("http://hl7.org/fhir/reaction-event-severity"))
  case SEVERE extends REACTION_EVENT_SEVERITY("severe", Some("Severe"), Some("http://hl7.org/fhir/reaction-event-severity"))
}
object REACTION_EVENT_SEVERITY extends EType[REACTION_EVENT_SEVERITY]("http://hl7.org/fhir/ValueSet/reaction-event-severity") 


enum REFERENCE_HANDLING_POLICY(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ENFORCED extends REFERENCE_HANDLING_POLICY("enforced", Some("Reference Integrity Enforced"), Some("http://hl7.org/fhir/reference-handling-policy"))
  case LITERAL extends REFERENCE_HANDLING_POLICY("literal", Some("Literal References"), Some("http://hl7.org/fhir/reference-handling-policy"))
  case LOCAL extends REFERENCE_HANDLING_POLICY("local", Some("Local References Only"), Some("http://hl7.org/fhir/reference-handling-policy"))
  case LOGICAL extends REFERENCE_HANDLING_POLICY("logical", Some("Logical References"), Some("http://hl7.org/fhir/reference-handling-policy"))
  case RESOLVES extends REFERENCE_HANDLING_POLICY("resolves", Some("Resolves References"), Some("http://hl7.org/fhir/reference-handling-policy"))
}
object REFERENCE_HANDLING_POLICY extends EType[REFERENCE_HANDLING_POLICY]("http://hl7.org/fhir/ValueSet/reference-handling-policy") 


enum REFERENCE_VERSION_RULES(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case EITHER extends REFERENCE_VERSION_RULES("either", Some("Either Specific or independent"), Some("http://hl7.org/fhir/reference-version-rules"))
  case INDEPENDENT extends REFERENCE_VERSION_RULES("independent", Some("Version independent"), Some("http://hl7.org/fhir/reference-version-rules"))
  case SPECIFIC extends REFERENCE_VERSION_RULES("specific", Some("Version Specific"), Some("http://hl7.org/fhir/reference-version-rules"))
}
object REFERENCE_VERSION_RULES extends EType[REFERENCE_VERSION_RULES]("http://hl7.org/fhir/ValueSet/reference-version-rules") 


enum RELATION_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case REPLACED_BY extends RELATION_TYPE("is-replaced-by", Some("Replaced By"), Some("http://hl7.org/fhir/relation-type"))
  case TRIGGERS extends RELATION_TYPE("triggers", Some("Triggers"), Some("http://hl7.org/fhir/relation-type"))
}
object RELATION_TYPE extends EType[RELATION_TYPE]("http://hl7.org/fhir/ValueSet/relation-type") 


enum REMITTANCE_OUTCOME(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case COMPLETE extends REMITTANCE_OUTCOME("complete", Some("Processing Complete"), Some("http://hl7.org/fhir/remittance-outcome"))
  case ERROR extends REMITTANCE_OUTCOME("error", Some("Error"), Some("http://hl7.org/fhir/remittance-outcome"))
  case PARTIAL extends REMITTANCE_OUTCOME("partial", Some("Partial Processing"), Some("http://hl7.org/fhir/remittance-outcome"))
  case QUEUED extends REMITTANCE_OUTCOME("queued", Some("Queued"), Some("http://hl7.org/fhir/remittance-outcome"))
}
object REMITTANCE_OUTCOME extends EType[REMITTANCE_OUTCOME]("http://hl7.org/fhir/ValueSet/remittance-outcome") 


enum REPORT_ACTION_RESULT_CODES(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ERROR extends REPORT_ACTION_RESULT_CODES("error", Some("Error"), Some("http://hl7.org/fhir/report-action-result-codes"))
  case FAIL extends REPORT_ACTION_RESULT_CODES("fail", Some("Fail"), Some("http://hl7.org/fhir/report-action-result-codes"))
  case PASS extends REPORT_ACTION_RESULT_CODES("pass", Some("Pass"), Some("http://hl7.org/fhir/report-action-result-codes"))
  case SKIP extends REPORT_ACTION_RESULT_CODES("skip", Some("Skip"), Some("http://hl7.org/fhir/report-action-result-codes"))
  case WARNING extends REPORT_ACTION_RESULT_CODES("warning", Some("Warning"), Some("http://hl7.org/fhir/report-action-result-codes"))
}
object REPORT_ACTION_RESULT_CODES extends EType[REPORT_ACTION_RESULT_CODES]("http://hl7.org/fhir/ValueSet/report-action-result-codes") 


enum REPORT_PARTICIPANT_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case CLIENT extends REPORT_PARTICIPANT_TYPE("client", Some("Client"), Some("http://hl7.org/fhir/report-participant-type"))
  case SERVER extends REPORT_PARTICIPANT_TYPE("server", Some("Server"), Some("http://hl7.org/fhir/report-participant-type"))
  case TEST_ENGINE extends REPORT_PARTICIPANT_TYPE("test-engine", Some("Test Engine"), Some("http://hl7.org/fhir/report-participant-type"))
}
object REPORT_PARTICIPANT_TYPE extends EType[REPORT_PARTICIPANT_TYPE]("http://hl7.org/fhir/ValueSet/report-participant-type") 


enum REPORT_RESULT_CODES(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case FAIL extends REPORT_RESULT_CODES("fail", Some("Fail"), Some("http://hl7.org/fhir/report-result-codes"))
  case PASS extends REPORT_RESULT_CODES("pass", Some("Pass"), Some("http://hl7.org/fhir/report-result-codes"))
  case PENDING extends REPORT_RESULT_CODES("pending", Some("Pending"), Some("http://hl7.org/fhir/report-result-codes"))
}
object REPORT_RESULT_CODES extends EType[REPORT_RESULT_CODES]("http://hl7.org/fhir/ValueSet/report-result-codes") 


enum REPORT_STATUS_CODES(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case COMPLETED extends REPORT_STATUS_CODES("completed", Some("Completed"), Some("http://hl7.org/fhir/report-status-codes"))
  case ENTERED_IN_ERROR extends REPORT_STATUS_CODES("entered-in-error", Some("Entered In Error"), Some("http://hl7.org/fhir/report-status-codes"))
  case IN_PROGRESS extends REPORT_STATUS_CODES("in-progress", Some("In Progress"), Some("http://hl7.org/fhir/report-status-codes"))
  case STOPPED extends REPORT_STATUS_CODES("stopped", Some("Stopped"), Some("http://hl7.org/fhir/report-status-codes"))
  case WAITING extends REPORT_STATUS_CODES("waiting", Some("Waiting"), Some("http://hl7.org/fhir/report-status-codes"))
}
object REPORT_STATUS_CODES extends EType[REPORT_STATUS_CODES]("http://hl7.org/fhir/ValueSet/report-status-codes") 


enum REPOSITORY_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case DIRECTLINK extends REPOSITORY_TYPE("directlink", Some("Click and see"), Some("http://hl7.org/fhir/repository-type"))
  case LOGIN extends REPOSITORY_TYPE("login", Some("Result cannot be access unless an account is logged in"), Some("http://hl7.org/fhir/repository-type"))
  case OAUTH extends REPOSITORY_TYPE("oauth", Some("Result need to be fetched with API and need LOGIN( or cookies are required when visiting the link of resource)"), Some("http://hl7.org/fhir/repository-type"))
  case OPENAPI extends REPOSITORY_TYPE("openapi", Some("The URL is the RESTful or other kind of API that can access to the result."), Some("http://hl7.org/fhir/repository-type"))
  case OTHER extends REPOSITORY_TYPE("other", Some("Some other complicated or particular way to get resource from URL."), Some("http://hl7.org/fhir/repository-type"))
}
object REPOSITORY_TYPE extends EType[REPOSITORY_TYPE]("http://hl7.org/fhir/ValueSet/repository-type") 


enum REQUEST_INTENT(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case DIRECTIVE extends REQUEST_INTENT("directive", Some("Directive"), Some("http://hl7.org/fhir/request-intent"))
  case FILLER_ORDER extends REQUEST_INTENT("filler-order", Some("Filler Order"), Some("http://hl7.org/fhir/request-intent"))
  case INSTANCE_ORDER extends REQUEST_INTENT("instance-order", Some("Instance Order"), Some("http://hl7.org/fhir/request-intent"))
  case OPTION extends REQUEST_INTENT("option", Some("Option"), Some("http://hl7.org/fhir/request-intent"))
  case ORDER extends REQUEST_INTENT("order", Some("Order"), Some("http://hl7.org/fhir/request-intent"))
  case ORIGINAL_ORDER extends REQUEST_INTENT("original-order", Some("Original Order"), Some("http://hl7.org/fhir/request-intent"))
  case PLAN extends REQUEST_INTENT("plan", Some("Plan"), Some("http://hl7.org/fhir/request-intent"))
  case PROPOSAL extends REQUEST_INTENT("proposal", Some("Proposal"), Some("http://hl7.org/fhir/request-intent"))
  case REFLEX_ORDER extends REQUEST_INTENT("reflex-order", Some("Reflex Order"), Some("http://hl7.org/fhir/request-intent"))
}
object REQUEST_INTENT extends EType[REQUEST_INTENT]("http://hl7.org/fhir/ValueSet/request-intent") 


enum REQUEST_PRIORITY(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ASAP extends REQUEST_PRIORITY("asap", Some("ASAP"), Some("http://hl7.org/fhir/request-priority"))
  case ROUTINE extends REQUEST_PRIORITY("routine", Some("Routine"), Some("http://hl7.org/fhir/request-priority"))
  case STAT extends REQUEST_PRIORITY("stat", Some("STAT"), Some("http://hl7.org/fhir/request-priority"))
  case URGENT extends REQUEST_PRIORITY("urgent", Some("Urgent"), Some("http://hl7.org/fhir/request-priority"))
}
object REQUEST_PRIORITY extends EType[REQUEST_PRIORITY]("http://hl7.org/fhir/ValueSet/request-priority") 


enum REQUEST_RESOURCE_TYPES(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case APPOINTMENT extends REQUEST_RESOURCE_TYPES("Appointment", Some("Appointment"), Some("http://hl7.org/fhir/request-resource-types"))
  case APPOINTMENTRESPONSE extends REQUEST_RESOURCE_TYPES("AppointmentResponse", Some("AppointmentResponse"), Some("http://hl7.org/fhir/request-resource-types"))
  case CAREPLAN extends REQUEST_RESOURCE_TYPES("CarePlan", Some("CarePlan"), Some("http://hl7.org/fhir/request-resource-types"))
  case CLAIM extends REQUEST_RESOURCE_TYPES("Claim", Some("Claim"), Some("http://hl7.org/fhir/request-resource-types"))
  case COMMUNICATIONREQUEST extends REQUEST_RESOURCE_TYPES("CommunicationRequest", Some("CommunicationRequest"), Some("http://hl7.org/fhir/request-resource-types"))
  case CONTRACT extends REQUEST_RESOURCE_TYPES("Contract", Some("Contract"), Some("http://hl7.org/fhir/request-resource-types"))
  case DEVICEREQUEST extends REQUEST_RESOURCE_TYPES("DeviceRequest", Some("DeviceRequest"), Some("http://hl7.org/fhir/request-resource-types"))
  case ENROLLMENTREQUEST extends REQUEST_RESOURCE_TYPES("EnrollmentRequest", Some("EnrollmentRequest"), Some("http://hl7.org/fhir/request-resource-types"))
  case IMMUNIZATIONRECOMMENDATION extends REQUEST_RESOURCE_TYPES("ImmunizationRecommendation", Some("ImmunizationRecommendation"), Some("http://hl7.org/fhir/request-resource-types"))
  case MEDICATIONREQUEST extends REQUEST_RESOURCE_TYPES("MedicationRequest", Some("MedicationRequest"), Some("http://hl7.org/fhir/request-resource-types"))
  case NUTRITIONORDER extends REQUEST_RESOURCE_TYPES("NutritionOrder", Some("NutritionOrder"), Some("http://hl7.org/fhir/request-resource-types"))
  case SERVICEREQUEST extends REQUEST_RESOURCE_TYPES("ServiceRequest", Some("ServiceRequest"), Some("http://hl7.org/fhir/request-resource-types"))
  case SUPPLYREQUEST extends REQUEST_RESOURCE_TYPES("SupplyRequest", Some("SupplyRequest"), Some("http://hl7.org/fhir/request-resource-types"))
  case TASK extends REQUEST_RESOURCE_TYPES("Task", Some("Task"), Some("http://hl7.org/fhir/request-resource-types"))
  case VISIONPRESCRIPTION extends REQUEST_RESOURCE_TYPES("VisionPrescription", Some("VisionPrescription"), Some("http://hl7.org/fhir/request-resource-types"))
}
object REQUEST_RESOURCE_TYPES extends EType[REQUEST_RESOURCE_TYPES]("http://hl7.org/fhir/ValueSet/request-resource-types") 


enum REQUEST_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ACTIVE extends REQUEST_STATUS("active", Some("Active"), Some("http://hl7.org/fhir/request-status"))
  case COMPLETED extends REQUEST_STATUS("completed", Some("Completed"), Some("http://hl7.org/fhir/request-status"))
  case DRAFT extends REQUEST_STATUS("draft", Some("Draft"), Some("http://hl7.org/fhir/request-status"))
  case ENTERED_IN_ERROR extends REQUEST_STATUS("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/request-status"))
  case ON_HOLD extends REQUEST_STATUS("on-hold", Some("On Hold"), Some("http://hl7.org/fhir/request-status"))
  case REVOKED extends REQUEST_STATUS("revoked", Some("Revoked"), Some("http://hl7.org/fhir/request-status"))
  case UNKNOWN extends REQUEST_STATUS("unknown", Some("Unknown"), Some("http://hl7.org/fhir/request-status"))
}
object REQUEST_STATUS extends EType[REQUEST_STATUS]("http://hl7.org/fhir/ValueSet/request-status") 


enum RESEARCH_ELEMENT_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case EXPOSURE extends RESEARCH_ELEMENT_TYPE("exposure", Some("Exposure"), Some("http://hl7.org/fhir/research-element-type"))
  case OUTCOME extends RESEARCH_ELEMENT_TYPE("outcome", Some("Outcome"), Some("http://hl7.org/fhir/research-element-type"))
  case POPULATION extends RESEARCH_ELEMENT_TYPE("population", Some("Population"), Some("http://hl7.org/fhir/research-element-type"))
}
object RESEARCH_ELEMENT_TYPE extends EType[RESEARCH_ELEMENT_TYPE]("http://hl7.org/fhir/ValueSet/research-element-type") 


enum RESEARCH_STUDY_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ACTIVE extends RESEARCH_STUDY_STATUS("active", Some("Active"), Some("http://hl7.org/fhir/research-study-status"))
  case ADMINISTRATIVELY_COMPLETED extends RESEARCH_STUDY_STATUS("administratively-completed", Some("Administratively Completed"), Some("http://hl7.org/fhir/research-study-status"))
  case APPROVED extends RESEARCH_STUDY_STATUS("approved", Some("Approved"), Some("http://hl7.org/fhir/research-study-status"))
  case CLOSED_TO_ACCRUAL extends RESEARCH_STUDY_STATUS("closed-to-accrual", Some("Closed to Accrual"), Some("http://hl7.org/fhir/research-study-status"))
  case CLOSED_TO_ACCRUAL_AND_INTERVENTION extends RESEARCH_STUDY_STATUS("closed-to-accrual-and-intervention", Some("Closed to Accrual and Intervention"), Some("http://hl7.org/fhir/research-study-status"))
  case COMPLETED extends RESEARCH_STUDY_STATUS("completed", Some("Completed"), Some("http://hl7.org/fhir/research-study-status"))
  case DISAPPROVED extends RESEARCH_STUDY_STATUS("disapproved", Some("Disapproved"), Some("http://hl7.org/fhir/research-study-status"))
  case IN_REVIEW extends RESEARCH_STUDY_STATUS("in-review", Some("In Review"), Some("http://hl7.org/fhir/research-study-status"))
  case TEMPORARILY_CLOSED_TO_ACCRUAL extends RESEARCH_STUDY_STATUS("temporarily-closed-to-accrual", Some("Temporarily Closed to Accrual"), Some("http://hl7.org/fhir/research-study-status"))
  case TEMPORARILY_CLOSED_TO_ACCRUAL_AND_INTERVENTION extends RESEARCH_STUDY_STATUS("temporarily-closed-to-accrual-and-intervention", Some("Temporarily Closed to Accrual and Intervention"), Some("http://hl7.org/fhir/research-study-status"))
  case WITHDRAWN extends RESEARCH_STUDY_STATUS("withdrawn", Some("Withdrawn"), Some("http://hl7.org/fhir/research-study-status"))
}
object RESEARCH_STUDY_STATUS extends EType[RESEARCH_STUDY_STATUS]("http://hl7.org/fhir/ValueSet/research-study-status") 


enum RESEARCH_SUBJECT_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case CANDIDATE extends RESEARCH_SUBJECT_STATUS("candidate", Some("Candidate"), Some("http://hl7.org/fhir/research-subject-status"))
  case ELIGIBLE extends RESEARCH_SUBJECT_STATUS("eligible", Some("Eligible"), Some("http://hl7.org/fhir/research-subject-status"))
  case FOLLOW_UP extends RESEARCH_SUBJECT_STATUS("follow-up", Some("Follow-up"), Some("http://hl7.org/fhir/research-subject-status"))
  case INELIGIBLE extends RESEARCH_SUBJECT_STATUS("ineligible", Some("Ineligible"), Some("http://hl7.org/fhir/research-subject-status"))
  case NOT_REGISTERED extends RESEARCH_SUBJECT_STATUS("not-registered", Some("Not Registered"), Some("http://hl7.org/fhir/research-subject-status"))
  case OFF_STUDY extends RESEARCH_SUBJECT_STATUS("off-study", Some("Off-study"), Some("http://hl7.org/fhir/research-subject-status"))
  case ON_STUDY extends RESEARCH_SUBJECT_STATUS("on-study", Some("On-study"), Some("http://hl7.org/fhir/research-subject-status"))
  case ON_STUDY_INTERVENTION extends RESEARCH_SUBJECT_STATUS("on-study-intervention", Some("On-study-intervention"), Some("http://hl7.org/fhir/research-subject-status"))
  case ON_STUDY_OBSERVATION extends RESEARCH_SUBJECT_STATUS("on-study-observation", Some("On-study-observation"), Some("http://hl7.org/fhir/research-subject-status"))
  case PENDING_ON_STUDY extends RESEARCH_SUBJECT_STATUS("pending-on-study", Some("Pending on-study"), Some("http://hl7.org/fhir/research-subject-status"))
  case POTENTIAL_CANDIDATE extends RESEARCH_SUBJECT_STATUS("potential-candidate", Some("Potential Candidate"), Some("http://hl7.org/fhir/research-subject-status"))
  case SCREENING extends RESEARCH_SUBJECT_STATUS("screening", Some("Screening"), Some("http://hl7.org/fhir/research-subject-status"))
  case WITHDRAWN extends RESEARCH_SUBJECT_STATUS("withdrawn", Some("Withdrawn"), Some("http://hl7.org/fhir/research-subject-status"))
}
object RESEARCH_SUBJECT_STATUS extends EType[RESEARCH_SUBJECT_STATUS]("http://hl7.org/fhir/ValueSet/research-subject-status") 


enum RESOURCE_AGGREGATION_MODE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case BUNDLED extends RESOURCE_AGGREGATION_MODE("bundled", Some("Bundled"), Some("http://hl7.org/fhir/resource-aggregation-mode"))
  case CONTAINED extends RESOURCE_AGGREGATION_MODE("contained", Some("Contained"), Some("http://hl7.org/fhir/resource-aggregation-mode"))
  case REFERENCED extends RESOURCE_AGGREGATION_MODE("referenced", Some("Referenced"), Some("http://hl7.org/fhir/resource-aggregation-mode"))
}
object RESOURCE_AGGREGATION_MODE extends EType[RESOURCE_AGGREGATION_MODE]("http://hl7.org/fhir/ValueSet/resource-aggregation-mode") 


enum RESOURCE_SLICING_RULES(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case CLOSED extends RESOURCE_SLICING_RULES("closed", Some("Closed"), Some("http://hl7.org/fhir/resource-slicing-rules"))
  case OPEN extends RESOURCE_SLICING_RULES("open", Some("Open"), Some("http://hl7.org/fhir/resource-slicing-rules"))
  case OPENATEND extends RESOURCE_SLICING_RULES("openAtEnd", Some("Open at End"), Some("http://hl7.org/fhir/resource-slicing-rules"))
}
object RESOURCE_SLICING_RULES extends EType[RESOURCE_SLICING_RULES]("http://hl7.org/fhir/ValueSet/resource-slicing-rules") 


enum RESOURCE_TYPES(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ACCOUNT extends RESOURCE_TYPES("Account", Some("Account"), Some("http://hl7.org/fhir/resource-types"))
  case ACTIVITYDEFINITION extends RESOURCE_TYPES("ActivityDefinition", Some("ActivityDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case ADVERSEEVENT extends RESOURCE_TYPES("AdverseEvent", Some("AdverseEvent"), Some("http://hl7.org/fhir/resource-types"))
  case ALLERGYINTOLERANCE extends RESOURCE_TYPES("AllergyIntolerance", Some("AllergyIntolerance"), Some("http://hl7.org/fhir/resource-types"))
  case APPOINTMENT extends RESOURCE_TYPES("Appointment", Some("Appointment"), Some("http://hl7.org/fhir/resource-types"))
  case APPOINTMENTRESPONSE extends RESOURCE_TYPES("AppointmentResponse", Some("AppointmentResponse"), Some("http://hl7.org/fhir/resource-types"))
  case AUDITEVENT extends RESOURCE_TYPES("AuditEvent", Some("AuditEvent"), Some("http://hl7.org/fhir/resource-types"))
  case BASIC extends RESOURCE_TYPES("Basic", Some("Basic"), Some("http://hl7.org/fhir/resource-types"))
  case BINARY extends RESOURCE_TYPES("Binary", Some("Binary"), Some("http://hl7.org/fhir/resource-types"))
  case BIOLOGICALLYDERIVEDPRODUCT extends RESOURCE_TYPES("BiologicallyDerivedProduct", Some("BiologicallyDerivedProduct"), Some("http://hl7.org/fhir/resource-types"))
  case BODYSTRUCTURE extends RESOURCE_TYPES("BodyStructure", Some("BodyStructure"), Some("http://hl7.org/fhir/resource-types"))
  case BUNDLE extends RESOURCE_TYPES("Bundle", Some("Bundle"), Some("http://hl7.org/fhir/resource-types"))
  case CAPABILITYSTATEMENT extends RESOURCE_TYPES("CapabilityStatement", Some("CapabilityStatement"), Some("http://hl7.org/fhir/resource-types"))
  case CAREPLAN extends RESOURCE_TYPES("CarePlan", Some("CarePlan"), Some("http://hl7.org/fhir/resource-types"))
  case CARETEAM extends RESOURCE_TYPES("CareTeam", Some("CareTeam"), Some("http://hl7.org/fhir/resource-types"))
  case CATALOGENTRY extends RESOURCE_TYPES("CatalogEntry", Some("CatalogEntry"), Some("http://hl7.org/fhir/resource-types"))
  case CHARGEITEM extends RESOURCE_TYPES("ChargeItem", Some("ChargeItem"), Some("http://hl7.org/fhir/resource-types"))
  case CHARGEITEMDEFINITION extends RESOURCE_TYPES("ChargeItemDefinition", Some("ChargeItemDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case CLAIM extends RESOURCE_TYPES("Claim", Some("Claim"), Some("http://hl7.org/fhir/resource-types"))
  case CLAIMRESPONSE extends RESOURCE_TYPES("ClaimResponse", Some("ClaimResponse"), Some("http://hl7.org/fhir/resource-types"))
  case CLINICALIMPRESSION extends RESOURCE_TYPES("ClinicalImpression", Some("ClinicalImpression"), Some("http://hl7.org/fhir/resource-types"))
  case CODESYSTEM extends RESOURCE_TYPES("CodeSystem", Some("CodeSystem"), Some("http://hl7.org/fhir/resource-types"))
  case COMMUNICATION extends RESOURCE_TYPES("Communication", Some("Communication"), Some("http://hl7.org/fhir/resource-types"))
  case COMMUNICATIONREQUEST extends RESOURCE_TYPES("CommunicationRequest", Some("CommunicationRequest"), Some("http://hl7.org/fhir/resource-types"))
  case COMPARTMENTDEFINITION extends RESOURCE_TYPES("CompartmentDefinition", Some("CompartmentDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case COMPOSITION extends RESOURCE_TYPES("Composition", Some("Composition"), Some("http://hl7.org/fhir/resource-types"))
  case CONCEPTMAP extends RESOURCE_TYPES("ConceptMap", Some("ConceptMap"), Some("http://hl7.org/fhir/resource-types"))
  case CONDITION extends RESOURCE_TYPES("Condition", Some("Condition"), Some("http://hl7.org/fhir/resource-types"))
  case CONSENT extends RESOURCE_TYPES("Consent", Some("Consent"), Some("http://hl7.org/fhir/resource-types"))
  case CONTRACT extends RESOURCE_TYPES("Contract", Some("Contract"), Some("http://hl7.org/fhir/resource-types"))
  case COVERAGE extends RESOURCE_TYPES("Coverage", Some("Coverage"), Some("http://hl7.org/fhir/resource-types"))
  case COVERAGEELIGIBILITYREQUEST extends RESOURCE_TYPES("CoverageEligibilityRequest", Some("CoverageEligibilityRequest"), Some("http://hl7.org/fhir/resource-types"))
  case COVERAGEELIGIBILITYRESPONSE extends RESOURCE_TYPES("CoverageEligibilityResponse", Some("CoverageEligibilityResponse"), Some("http://hl7.org/fhir/resource-types"))
  case DETECTEDISSUE extends RESOURCE_TYPES("DetectedIssue", Some("DetectedIssue"), Some("http://hl7.org/fhir/resource-types"))
  case DEVICE extends RESOURCE_TYPES("Device", Some("Device"), Some("http://hl7.org/fhir/resource-types"))
  case DEVICEDEFINITION extends RESOURCE_TYPES("DeviceDefinition", Some("DeviceDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case DEVICEMETRIC extends RESOURCE_TYPES("DeviceMetric", Some("DeviceMetric"), Some("http://hl7.org/fhir/resource-types"))
  case DEVICEREQUEST extends RESOURCE_TYPES("DeviceRequest", Some("DeviceRequest"), Some("http://hl7.org/fhir/resource-types"))
  case DEVICEUSESTATEMENT extends RESOURCE_TYPES("DeviceUseStatement", Some("DeviceUseStatement"), Some("http://hl7.org/fhir/resource-types"))
  case DIAGNOSTICREPORT extends RESOURCE_TYPES("DiagnosticReport", Some("DiagnosticReport"), Some("http://hl7.org/fhir/resource-types"))
  case DOCUMENTMANIFEST extends RESOURCE_TYPES("DocumentManifest", Some("DocumentManifest"), Some("http://hl7.org/fhir/resource-types"))
  case DOCUMENTREFERENCE extends RESOURCE_TYPES("DocumentReference", Some("DocumentReference"), Some("http://hl7.org/fhir/resource-types"))
  case DOMAINRESOURCE extends RESOURCE_TYPES("DomainResource", Some("DomainResource"), Some("http://hl7.org/fhir/resource-types"))
  case EFFECTEVIDENCESYNTHESIS extends RESOURCE_TYPES("EffectEvidenceSynthesis", Some("EffectEvidenceSynthesis"), Some("http://hl7.org/fhir/resource-types"))
  case ENCOUNTER extends RESOURCE_TYPES("Encounter", Some("Encounter"), Some("http://hl7.org/fhir/resource-types"))
  case ENDPOINT extends RESOURCE_TYPES("Endpoint", Some("Endpoint"), Some("http://hl7.org/fhir/resource-types"))
  case ENROLLMENTREQUEST extends RESOURCE_TYPES("EnrollmentRequest", Some("EnrollmentRequest"), Some("http://hl7.org/fhir/resource-types"))
  case ENROLLMENTRESPONSE extends RESOURCE_TYPES("EnrollmentResponse", Some("EnrollmentResponse"), Some("http://hl7.org/fhir/resource-types"))
  case EPISODEOFCARE extends RESOURCE_TYPES("EpisodeOfCare", Some("EpisodeOfCare"), Some("http://hl7.org/fhir/resource-types"))
  case EVENTDEFINITION extends RESOURCE_TYPES("EventDefinition", Some("EventDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case EVIDENCE extends RESOURCE_TYPES("Evidence", Some("Evidence"), Some("http://hl7.org/fhir/resource-types"))
  case EVIDENCEVARIABLE extends RESOURCE_TYPES("EvidenceVariable", Some("EvidenceVariable"), Some("http://hl7.org/fhir/resource-types"))
  case EXAMPLESCENARIO extends RESOURCE_TYPES("ExampleScenario", Some("ExampleScenario"), Some("http://hl7.org/fhir/resource-types"))
  case EXPLANATIONOFBENEFIT extends RESOURCE_TYPES("ExplanationOfBenefit", Some("ExplanationOfBenefit"), Some("http://hl7.org/fhir/resource-types"))
  case FAMILYMEMBERHISTORY extends RESOURCE_TYPES("FamilyMemberHistory", Some("FamilyMemberHistory"), Some("http://hl7.org/fhir/resource-types"))
  case FLAG extends RESOURCE_TYPES("Flag", Some("Flag"), Some("http://hl7.org/fhir/resource-types"))
  case GOAL extends RESOURCE_TYPES("Goal", Some("Goal"), Some("http://hl7.org/fhir/resource-types"))
  case GRAPHDEFINITION extends RESOURCE_TYPES("GraphDefinition", Some("GraphDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case GROUP extends RESOURCE_TYPES("Group", Some("Group"), Some("http://hl7.org/fhir/resource-types"))
  case GUIDANCERESPONSE extends RESOURCE_TYPES("GuidanceResponse", Some("GuidanceResponse"), Some("http://hl7.org/fhir/resource-types"))
  case HEALTHCARESERVICE extends RESOURCE_TYPES("HealthcareService", Some("HealthcareService"), Some("http://hl7.org/fhir/resource-types"))
  case IMAGINGSTUDY extends RESOURCE_TYPES("ImagingStudy", Some("ImagingStudy"), Some("http://hl7.org/fhir/resource-types"))
  case IMMUNIZATION extends RESOURCE_TYPES("Immunization", Some("Immunization"), Some("http://hl7.org/fhir/resource-types"))
  case IMMUNIZATIONEVALUATION extends RESOURCE_TYPES("ImmunizationEvaluation", Some("ImmunizationEvaluation"), Some("http://hl7.org/fhir/resource-types"))
  case IMMUNIZATIONRECOMMENDATION extends RESOURCE_TYPES("ImmunizationRecommendation", Some("ImmunizationRecommendation"), Some("http://hl7.org/fhir/resource-types"))
  case IMPLEMENTATIONGUIDE extends RESOURCE_TYPES("ImplementationGuide", Some("ImplementationGuide"), Some("http://hl7.org/fhir/resource-types"))
  case INSURANCEPLAN extends RESOURCE_TYPES("InsurancePlan", Some("InsurancePlan"), Some("http://hl7.org/fhir/resource-types"))
  case INVOICE extends RESOURCE_TYPES("Invoice", Some("Invoice"), Some("http://hl7.org/fhir/resource-types"))
  case LIBRARY extends RESOURCE_TYPES("Library", Some("Library"), Some("http://hl7.org/fhir/resource-types"))
  case LINKAGE extends RESOURCE_TYPES("Linkage", Some("Linkage"), Some("http://hl7.org/fhir/resource-types"))
  case LIST extends RESOURCE_TYPES("List", Some("List"), Some("http://hl7.org/fhir/resource-types"))
  case LOCATION extends RESOURCE_TYPES("Location", Some("Location"), Some("http://hl7.org/fhir/resource-types"))
  case MEASURE extends RESOURCE_TYPES("Measure", Some("Measure"), Some("http://hl7.org/fhir/resource-types"))
  case MEASUREREPORT extends RESOURCE_TYPES("MeasureReport", Some("MeasureReport"), Some("http://hl7.org/fhir/resource-types"))
  case MEDIA extends RESOURCE_TYPES("Media", Some("Media"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICATION extends RESOURCE_TYPES("Medication", Some("Medication"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICATIONADMINISTRATION extends RESOURCE_TYPES("MedicationAdministration", Some("MedicationAdministration"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICATIONDISPENSE extends RESOURCE_TYPES("MedicationDispense", Some("MedicationDispense"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICATIONKNOWLEDGE extends RESOURCE_TYPES("MedicationKnowledge", Some("MedicationKnowledge"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICATIONREQUEST extends RESOURCE_TYPES("MedicationRequest", Some("MedicationRequest"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICATIONSTATEMENT extends RESOURCE_TYPES("MedicationStatement", Some("MedicationStatement"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICINALPRODUCT extends RESOURCE_TYPES("MedicinalProduct", Some("MedicinalProduct"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICINALPRODUCTAUTHORIZATION extends RESOURCE_TYPES("MedicinalProductAuthorization", Some("MedicinalProductAuthorization"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICINALPRODUCTCONTRAINDICATION extends RESOURCE_TYPES("MedicinalProductContraindication", Some("MedicinalProductContraindication"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICINALPRODUCTINDICATION extends RESOURCE_TYPES("MedicinalProductIndication", Some("MedicinalProductIndication"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICINALPRODUCTINGREDIENT extends RESOURCE_TYPES("MedicinalProductIngredient", Some("MedicinalProductIngredient"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICINALPRODUCTINTERACTION extends RESOURCE_TYPES("MedicinalProductInteraction", Some("MedicinalProductInteraction"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICINALPRODUCTMANUFACTURED extends RESOURCE_TYPES("MedicinalProductManufactured", Some("MedicinalProductManufactured"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICINALPRODUCTPACKAGED extends RESOURCE_TYPES("MedicinalProductPackaged", Some("MedicinalProductPackaged"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICINALPRODUCTPHARMACEUTICAL extends RESOURCE_TYPES("MedicinalProductPharmaceutical", Some("MedicinalProductPharmaceutical"), Some("http://hl7.org/fhir/resource-types"))
  case MEDICINALPRODUCTUNDESIRABLEEFFECT extends RESOURCE_TYPES("MedicinalProductUndesirableEffect", Some("MedicinalProductUndesirableEffect"), Some("http://hl7.org/fhir/resource-types"))
  case MESSAGEDEFINITION extends RESOURCE_TYPES("MessageDefinition", Some("MessageDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case MESSAGEHEADER extends RESOURCE_TYPES("MessageHeader", Some("MessageHeader"), Some("http://hl7.org/fhir/resource-types"))
  case MOLECULARSEQUENCE extends RESOURCE_TYPES("MolecularSequence", Some("MolecularSequence"), Some("http://hl7.org/fhir/resource-types"))
  case NAMINGSYSTEM extends RESOURCE_TYPES("NamingSystem", Some("NamingSystem"), Some("http://hl7.org/fhir/resource-types"))
  case NUTRITIONORDER extends RESOURCE_TYPES("NutritionOrder", Some("NutritionOrder"), Some("http://hl7.org/fhir/resource-types"))
  case OBSERVATION extends RESOURCE_TYPES("Observation", Some("Observation"), Some("http://hl7.org/fhir/resource-types"))
  case OBSERVATIONDEFINITION extends RESOURCE_TYPES("ObservationDefinition", Some("ObservationDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case OPERATIONDEFINITION extends RESOURCE_TYPES("OperationDefinition", Some("OperationDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case OPERATIONOUTCOME extends RESOURCE_TYPES("OperationOutcome", Some("OperationOutcome"), Some("http://hl7.org/fhir/resource-types"))
  case ORGANIZATION extends RESOURCE_TYPES("Organization", Some("Organization"), Some("http://hl7.org/fhir/resource-types"))
  case ORGANIZATIONAFFILIATION extends RESOURCE_TYPES("OrganizationAffiliation", Some("OrganizationAffiliation"), Some("http://hl7.org/fhir/resource-types"))
  case PARAMETERS extends RESOURCE_TYPES("Parameters", Some("Parameters"), Some("http://hl7.org/fhir/resource-types"))
  case PATIENT extends RESOURCE_TYPES("Patient", Some("Patient"), Some("http://hl7.org/fhir/resource-types"))
  case PAYMENTNOTICE extends RESOURCE_TYPES("PaymentNotice", Some("PaymentNotice"), Some("http://hl7.org/fhir/resource-types"))
  case PAYMENTRECONCILIATION extends RESOURCE_TYPES("PaymentReconciliation", Some("PaymentReconciliation"), Some("http://hl7.org/fhir/resource-types"))
  case PERSON extends RESOURCE_TYPES("Person", Some("Person"), Some("http://hl7.org/fhir/resource-types"))
  case PLANDEFINITION extends RESOURCE_TYPES("PlanDefinition", Some("PlanDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case PRACTITIONER extends RESOURCE_TYPES("Practitioner", Some("Practitioner"), Some("http://hl7.org/fhir/resource-types"))
  case PRACTITIONERROLE extends RESOURCE_TYPES("PractitionerRole", Some("PractitionerRole"), Some("http://hl7.org/fhir/resource-types"))
  case PROCEDURE extends RESOURCE_TYPES("Procedure", Some("Procedure"), Some("http://hl7.org/fhir/resource-types"))
  case PROVENANCE extends RESOURCE_TYPES("Provenance", Some("Provenance"), Some("http://hl7.org/fhir/resource-types"))
  case QUESTIONNAIRE extends RESOURCE_TYPES("Questionnaire", Some("Questionnaire"), Some("http://hl7.org/fhir/resource-types"))
  case QUESTIONNAIRERESPONSE extends RESOURCE_TYPES("QuestionnaireResponse", Some("QuestionnaireResponse"), Some("http://hl7.org/fhir/resource-types"))
  case RELATEDPERSON extends RESOURCE_TYPES("RelatedPerson", Some("RelatedPerson"), Some("http://hl7.org/fhir/resource-types"))
  case REQUESTGROUP extends RESOURCE_TYPES("RequestGroup", Some("RequestGroup"), Some("http://hl7.org/fhir/resource-types"))
  case RESEARCHDEFINITION extends RESOURCE_TYPES("ResearchDefinition", Some("ResearchDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case RESEARCHELEMENTDEFINITION extends RESOURCE_TYPES("ResearchElementDefinition", Some("ResearchElementDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case RESEARCHSTUDY extends RESOURCE_TYPES("ResearchStudy", Some("ResearchStudy"), Some("http://hl7.org/fhir/resource-types"))
  case RESEARCHSUBJECT extends RESOURCE_TYPES("ResearchSubject", Some("ResearchSubject"), Some("http://hl7.org/fhir/resource-types"))
  case RESOURCE extends RESOURCE_TYPES("Resource", Some("Resource"), Some("http://hl7.org/fhir/resource-types"))
  case RISKASSESSMENT extends RESOURCE_TYPES("RiskAssessment", Some("RiskAssessment"), Some("http://hl7.org/fhir/resource-types"))
  case RISKEVIDENCESYNTHESIS extends RESOURCE_TYPES("RiskEvidenceSynthesis", Some("RiskEvidenceSynthesis"), Some("http://hl7.org/fhir/resource-types"))
  case SCHEDULE extends RESOURCE_TYPES("Schedule", Some("Schedule"), Some("http://hl7.org/fhir/resource-types"))
  case SEARCHPARAMETER extends RESOURCE_TYPES("SearchParameter", Some("SearchParameter"), Some("http://hl7.org/fhir/resource-types"))
  case SERVICEREQUEST extends RESOURCE_TYPES("ServiceRequest", Some("ServiceRequest"), Some("http://hl7.org/fhir/resource-types"))
  case SLOT extends RESOURCE_TYPES("Slot", Some("Slot"), Some("http://hl7.org/fhir/resource-types"))
  case SPECIMEN extends RESOURCE_TYPES("Specimen", Some("Specimen"), Some("http://hl7.org/fhir/resource-types"))
  case SPECIMENDEFINITION extends RESOURCE_TYPES("SpecimenDefinition", Some("SpecimenDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case STRUCTUREDEFINITION extends RESOURCE_TYPES("StructureDefinition", Some("StructureDefinition"), Some("http://hl7.org/fhir/resource-types"))
  case STRUCTUREMAP extends RESOURCE_TYPES("StructureMap", Some("StructureMap"), Some("http://hl7.org/fhir/resource-types"))
  case SUBSCRIPTION extends RESOURCE_TYPES("Subscription", Some("Subscription"), Some("http://hl7.org/fhir/resource-types"))
  case SUBSTANCE extends RESOURCE_TYPES("Substance", Some("Substance"), Some("http://hl7.org/fhir/resource-types"))
  case SUBSTANCENUCLEICACID extends RESOURCE_TYPES("SubstanceNucleicAcid", Some("SubstanceNucleicAcid"), Some("http://hl7.org/fhir/resource-types"))
  case SUBSTANCEPOLYMER extends RESOURCE_TYPES("SubstancePolymer", Some("SubstancePolymer"), Some("http://hl7.org/fhir/resource-types"))
  case SUBSTANCEPROTEIN extends RESOURCE_TYPES("SubstanceProtein", Some("SubstanceProtein"), Some("http://hl7.org/fhir/resource-types"))
  case SUBSTANCEREFERENCEINFORMATION extends RESOURCE_TYPES("SubstanceReferenceInformation", Some("SubstanceReferenceInformation"), Some("http://hl7.org/fhir/resource-types"))
  case SUBSTANCESOURCEMATERIAL extends RESOURCE_TYPES("SubstanceSourceMaterial", Some("SubstanceSourceMaterial"), Some("http://hl7.org/fhir/resource-types"))
  case SUBSTANCESPECIFICATION extends RESOURCE_TYPES("SubstanceSpecification", Some("SubstanceSpecification"), Some("http://hl7.org/fhir/resource-types"))
  case SUPPLYDELIVERY extends RESOURCE_TYPES("SupplyDelivery", Some("SupplyDelivery"), Some("http://hl7.org/fhir/resource-types"))
  case SUPPLYREQUEST extends RESOURCE_TYPES("SupplyRequest", Some("SupplyRequest"), Some("http://hl7.org/fhir/resource-types"))
  case TASK extends RESOURCE_TYPES("Task", Some("Task"), Some("http://hl7.org/fhir/resource-types"))
  case TERMINOLOGYCAPABILITIES extends RESOURCE_TYPES("TerminologyCapabilities", Some("TerminologyCapabilities"), Some("http://hl7.org/fhir/resource-types"))
  case TESTREPORT extends RESOURCE_TYPES("TestReport", Some("TestReport"), Some("http://hl7.org/fhir/resource-types"))
  case TESTSCRIPT extends RESOURCE_TYPES("TestScript", Some("TestScript"), Some("http://hl7.org/fhir/resource-types"))
  case VALUESET extends RESOURCE_TYPES("ValueSet", Some("ValueSet"), Some("http://hl7.org/fhir/resource-types"))
  case VERIFICATIONRESULT extends RESOURCE_TYPES("VerificationResult", Some("VerificationResult"), Some("http://hl7.org/fhir/resource-types"))
  case VISIONPRESCRIPTION extends RESOURCE_TYPES("VisionPrescription", Some("VisionPrescription"), Some("http://hl7.org/fhir/resource-types"))
}
object RESOURCE_TYPES extends EType[RESOURCE_TYPES]("http://hl7.org/fhir/ValueSet/resource-types") 


enum RESPONSE_CODE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case FATAL_ERROR extends RESPONSE_CODE("fatal-error", Some("Fatal Error"), Some("http://hl7.org/fhir/response-code"))
  case OK extends RESPONSE_CODE("ok", Some("OK"), Some("http://hl7.org/fhir/response-code"))
  case TRANSIENT_ERROR extends RESPONSE_CODE("transient-error", Some("Transient Error"), Some("http://hl7.org/fhir/response-code"))
}
object RESPONSE_CODE extends EType[RESPONSE_CODE]("http://hl7.org/fhir/ValueSet/response-code") 


enum RESTFUL_CAPABILITY_MODE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case CLIENT extends RESTFUL_CAPABILITY_MODE("client", Some("Client"), Some("http://hl7.org/fhir/restful-capability-mode"))
  case SERVER extends RESTFUL_CAPABILITY_MODE("server", Some("Server"), Some("http://hl7.org/fhir/restful-capability-mode"))
}
object RESTFUL_CAPABILITY_MODE extends EType[RESTFUL_CAPABILITY_MODE]("http://hl7.org/fhir/ValueSet/restful-capability-mode") 


enum SEARCH_COMPARATOR(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case AP extends SEARCH_COMPARATOR("ap", Some("Approximately"), Some("http://hl7.org/fhir/search-comparator"))
  case EB extends SEARCH_COMPARATOR("eb", Some("Ends Before"), Some("http://hl7.org/fhir/search-comparator"))
  case EQ extends SEARCH_COMPARATOR("eq", Some("Equals"), Some("http://hl7.org/fhir/search-comparator"))
  case GE extends SEARCH_COMPARATOR("ge", Some("Greater or Equals"), Some("http://hl7.org/fhir/search-comparator"))
  case GT extends SEARCH_COMPARATOR("gt", Some("Greater Than"), Some("http://hl7.org/fhir/search-comparator"))
  case LE extends SEARCH_COMPARATOR("le", Some("Less of Equal"), Some("http://hl7.org/fhir/search-comparator"))
  case LT extends SEARCH_COMPARATOR("lt", Some("Less Than"), Some("http://hl7.org/fhir/search-comparator"))
  case NE extends SEARCH_COMPARATOR("ne", Some("Not Equals"), Some("http://hl7.org/fhir/search-comparator"))
  case SA extends SEARCH_COMPARATOR("sa", Some("Starts After"), Some("http://hl7.org/fhir/search-comparator"))
}
object SEARCH_COMPARATOR extends EType[SEARCH_COMPARATOR]("http://hl7.org/fhir/ValueSet/search-comparator") 


enum SEARCH_ENTRY_MODE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case INCLUDE extends SEARCH_ENTRY_MODE("include", Some("Include"), Some("http://hl7.org/fhir/search-entry-mode"))
  case MATCH extends SEARCH_ENTRY_MODE("match", Some("Match"), Some("http://hl7.org/fhir/search-entry-mode"))
  case OUTCOME extends SEARCH_ENTRY_MODE("outcome", Some("Outcome"), Some("http://hl7.org/fhir/search-entry-mode"))
}
object SEARCH_ENTRY_MODE extends EType[SEARCH_ENTRY_MODE]("http://hl7.org/fhir/ValueSet/search-entry-mode") 


enum SEARCH_MODIFIER_CODE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ABOVE extends SEARCH_MODIFIER_CODE("above", Some("Above"), Some("http://hl7.org/fhir/search-modifier-code"))
  case BELOW extends SEARCH_MODIFIER_CODE("below", Some("Below"), Some("http://hl7.org/fhir/search-modifier-code"))
  case CONTAINS extends SEARCH_MODIFIER_CODE("contains", Some("Contains"), Some("http://hl7.org/fhir/search-modifier-code"))
  case EXACT extends SEARCH_MODIFIER_CODE("exact", Some("Exact"), Some("http://hl7.org/fhir/search-modifier-code"))
  case IDENTIFIER extends SEARCH_MODIFIER_CODE("identifier", Some("Identifier"), Some("http://hl7.org/fhir/search-modifier-code"))
  case IN extends SEARCH_MODIFIER_CODE("in", Some("In"), Some("http://hl7.org/fhir/search-modifier-code"))
  case MISSING extends SEARCH_MODIFIER_CODE("missing", Some("Missing"), Some("http://hl7.org/fhir/search-modifier-code"))
  case NOT extends SEARCH_MODIFIER_CODE("not", Some("Not"), Some("http://hl7.org/fhir/search-modifier-code"))
  case NOT_IN extends SEARCH_MODIFIER_CODE("not-in", Some("Not In"), Some("http://hl7.org/fhir/search-modifier-code"))
  case OFTYPE extends SEARCH_MODIFIER_CODE("ofType", Some("Of Type"), Some("http://hl7.org/fhir/search-modifier-code"))
  case TEXT extends SEARCH_MODIFIER_CODE("text", Some("Text"), Some("http://hl7.org/fhir/search-modifier-code"))
  case TYPE extends SEARCH_MODIFIER_CODE("type", Some("Type"), Some("http://hl7.org/fhir/search-modifier-code"))
}
object SEARCH_MODIFIER_CODE extends EType[SEARCH_MODIFIER_CODE]("http://hl7.org/fhir/ValueSet/search-modifier-code") 


enum SEARCH_PARAM_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case COMPOSITE extends SEARCH_PARAM_TYPE("composite", Some("Composite"), Some("http://hl7.org/fhir/search-param-type"))
  case DATE extends SEARCH_PARAM_TYPE("date", Some("Date/DateTime"), Some("http://hl7.org/fhir/search-param-type"))
  case NUMBER extends SEARCH_PARAM_TYPE("number", Some("Number"), Some("http://hl7.org/fhir/search-param-type"))
  case QUANTITY extends SEARCH_PARAM_TYPE("quantity", Some("Quantity"), Some("http://hl7.org/fhir/search-param-type"))
  case REFERENCE extends SEARCH_PARAM_TYPE("reference", Some("Reference"), Some("http://hl7.org/fhir/search-param-type"))
  case SPECIAL extends SEARCH_PARAM_TYPE("special", Some("Special"), Some("http://hl7.org/fhir/search-param-type"))
  case STRING extends SEARCH_PARAM_TYPE("string", Some("String"), Some("http://hl7.org/fhir/search-param-type"))
  case TOKEN extends SEARCH_PARAM_TYPE("token", Some("Token"), Some("http://hl7.org/fhir/search-param-type"))
  case URI extends SEARCH_PARAM_TYPE("uri", Some("URI"), Some("http://hl7.org/fhir/search-param-type"))
}
object SEARCH_PARAM_TYPE extends EType[SEARCH_PARAM_TYPE]("http://hl7.org/fhir/ValueSet/search-param-type") 


enum SEARCH_XPATH_USAGE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case DISTANCE extends SEARCH_XPATH_USAGE("distance", Some("Distance"), Some("http://hl7.org/fhir/search-xpath-usage"))
  case NEARBY extends SEARCH_XPATH_USAGE("nearby", Some("Nearby"), Some("http://hl7.org/fhir/search-xpath-usage"))
  case NORMAL extends SEARCH_XPATH_USAGE("normal", Some("Normal"), Some("http://hl7.org/fhir/search-xpath-usage"))
  case OTHER extends SEARCH_XPATH_USAGE("other", Some("Other"), Some("http://hl7.org/fhir/search-xpath-usage"))
  case PHONETIC extends SEARCH_XPATH_USAGE("phonetic", Some("Phonetic"), Some("http://hl7.org/fhir/search-xpath-usage"))
}
object SEARCH_XPATH_USAGE extends EType[SEARCH_XPATH_USAGE]("http://hl7.org/fhir/ValueSet/search-xpath-usage") 


enum SEQUENCE_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case AA extends SEQUENCE_TYPE("aa", Some("AA Sequence"), Some("http://hl7.org/fhir/sequence-type"))
  case DNA extends SEQUENCE_TYPE("dna", Some("DNA Sequence"), Some("http://hl7.org/fhir/sequence-type"))
  case RNA extends SEQUENCE_TYPE("rna", Some("RNA Sequence"), Some("http://hl7.org/fhir/sequence-type"))
}
object SEQUENCE_TYPE extends EType[SEQUENCE_TYPE]("http://hl7.org/fhir/ValueSet/sequence-type") 


enum SLOTSTATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case BUSY extends SLOTSTATUS("busy", Some("Busy"), Some("http://hl7.org/fhir/slotstatus"))
  case BUSY_TENTATIVE extends SLOTSTATUS("busy-tentative", Some("Busy (Tentative)"), Some("http://hl7.org/fhir/slotstatus"))
  case BUSY_UNAVAILABLE extends SLOTSTATUS("busy-unavailable", Some("Busy (Unavailable)"), Some("http://hl7.org/fhir/slotstatus"))
  case ENTERED_IN_ERROR extends SLOTSTATUS("entered-in-error", Some("Entered in error"), Some("http://hl7.org/fhir/slotstatus"))
  case FREE extends SLOTSTATUS("free", Some("Free"), Some("http://hl7.org/fhir/slotstatus"))
}
object SLOTSTATUS extends EType[SLOTSTATUS]("http://hl7.org/fhir/ValueSet/slotstatus") 


enum SPDX_LICENSE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case AAL extends SPDX_LICENSE("AAL", Some("Attribution Assurance License"), Some("http://hl7.org/fhir/spdx-license"))
  case ABSTYLES extends SPDX_LICENSE("Abstyles", Some("Abstyles License"), Some("http://hl7.org/fhir/spdx-license"))
  case ACADEMIC_FREE_LICENSE_V1_1 extends SPDX_LICENSE("AFL-1.1", Some("Academic Free License v1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case ACADEMIC_FREE_LICENSE_V1_2 extends SPDX_LICENSE("AFL-1.2", Some("Academic Free License v1.2"), Some("http://hl7.org/fhir/spdx-license"))
  case ACADEMIC_FREE_LICENSE_V2_0 extends SPDX_LICENSE("AFL-2.0", Some("Academic Free License v2.0"), Some("http://hl7.org/fhir/spdx-license"))
  case ACADEMIC_FREE_LICENSE_V2_1 extends SPDX_LICENSE("AFL-2.1", Some("Academic Free License v2.1"), Some("http://hl7.org/fhir/spdx-license"))
  case ACADEMIC_FREE_LICENSE_V3_0 extends SPDX_LICENSE("AFL-3.0", Some("Academic Free License v3.0"), Some("http://hl7.org/fhir/spdx-license"))
  case ADAPTIVE_PUBLIC_LICENSE_1_0 extends SPDX_LICENSE("APL-1.0", Some("Adaptive Public License 1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case ADOBE_GLYPH_LIST_LICENSE extends SPDX_LICENSE("Adobe-Glyph", Some("Adobe Glyph List License"), Some("http://hl7.org/fhir/spdx-license"))
  case ADOBE_SYSTEMS_INCORPORATED_SOURCE_CODE_LICENSE_AGREEMENT extends SPDX_LICENSE("Adobe-2006", Some("Adobe Systems Incorporated Source Code License Agreement"), Some("http://hl7.org/fhir/spdx-license"))
  case ADSL extends SPDX_LICENSE("ADSL", Some("Amazon Digital Services License"), Some("http://hl7.org/fhir/spdx-license"))
  case AFFERO_GENERAL_PUBLIC_LICENSE_V1_0_ONLY extends SPDX_LICENSE("AGPL-1.0-only", Some("Affero General Public License v1.0 only"), Some("http://hl7.org/fhir/spdx-license"))
  case AFFERO_GENERAL_PUBLIC_LICENSE_V1_0_OR_LATER extends SPDX_LICENSE("AGPL-1.0-or-later", Some("Affero General Public License v1.0 or later"), Some("http://hl7.org/fhir/spdx-license"))
  case AFMPARSE extends SPDX_LICENSE("Afmparse", Some("Afmparse License"), Some("http://hl7.org/fhir/spdx-license"))
  case ALADDIN extends SPDX_LICENSE("Aladdin", Some("Aladdin Free Public License"), Some("http://hl7.org/fhir/spdx-license"))
  case AMDPLPA extends SPDX_LICENSE("AMDPLPA", Some("AMD's plpa_map.c License"), Some("http://hl7.org/fhir/spdx-license"))
  case AML extends SPDX_LICENSE("AML", Some("Apple MIT License"), Some("http://hl7.org/fhir/spdx-license"))
  case AMPAS extends SPDX_LICENSE("AMPAS", Some("Academy of Motion Picture Arts and Sciences BSD"), Some("http://hl7.org/fhir/spdx-license"))
  case ANTLR_SOFTWARE_RIGHTS_NOTICE extends SPDX_LICENSE("ANTLR-PD", Some("ANTLR Software Rights Notice"), Some("http://hl7.org/fhir/spdx-license"))
  case APACHE_LICENSE_1_0 extends SPDX_LICENSE("Apache-1.0", Some("Apache License 1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case APACHE_LICENSE_1_1 extends SPDX_LICENSE("Apache-1.1", Some("Apache License 1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case APACHE_LICENSE_2_0 extends SPDX_LICENSE("Apache-2.0", Some("Apache License 2.0"), Some("http://hl7.org/fhir/spdx-license"))
  case APAFML extends SPDX_LICENSE("APAFML", Some("Adobe Postscript AFM License"), Some("http://hl7.org/fhir/spdx-license"))
  case APPLE_PUBLIC_SOURCE_LICENSE_1_0 extends SPDX_LICENSE("APSL-1.0", Some("Apple Public Source License 1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case APPLE_PUBLIC_SOURCE_LICENSE_1_1 extends SPDX_LICENSE("APSL-1.1", Some("Apple Public Source License 1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case APPLE_PUBLIC_SOURCE_LICENSE_1_2 extends SPDX_LICENSE("APSL-1.2", Some("Apple Public Source License 1.2"), Some("http://hl7.org/fhir/spdx-license"))
  case APPLE_PUBLIC_SOURCE_LICENSE_2_0 extends SPDX_LICENSE("APSL-2.0", Some("Apple Public Source License 2.0"), Some("http://hl7.org/fhir/spdx-license"))
  case ARTISTIC_10_CL8 extends SPDX_LICENSE("Artistic-1.0-cl8", Some("Artistic License 1.0 w/clause 8"), Some("http://hl7.org/fhir/spdx-license"))
  case ARTISTIC_10_PERL extends SPDX_LICENSE("Artistic-1.0-Perl", Some("Artistic License 1.0 (Perl)"), Some("http://hl7.org/fhir/spdx-license"))
  case ARTISTIC_LICENSE_1_0 extends SPDX_LICENSE("Artistic-1.0", Some("Artistic License 1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case ARTISTIC_LICENSE_2_0 extends SPDX_LICENSE("Artistic-2.0", Some("Artistic License 2.0"), Some("http://hl7.org/fhir/spdx-license"))
  case BAHYPH extends SPDX_LICENSE("Bahyph", Some("Bahyph License"), Some("http://hl7.org/fhir/spdx-license"))
  case BARR extends SPDX_LICENSE("Barr", Some("Barr License"), Some("http://hl7.org/fhir/spdx-license"))
  case BEERWARE extends SPDX_LICENSE("Beerware", Some("Beerware License"), Some("http://hl7.org/fhir/spdx-license"))
  case BITTORRENT_OPEN_SOURCE_LICENSE_V1_0 extends SPDX_LICENSE("BitTorrent-1.0", Some("BitTorrent Open Source License v1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case BITTORRENT_OPEN_SOURCE_LICENSE_V1_1 extends SPDX_LICENSE("BitTorrent-1.1", Some("BitTorrent Open Source License v1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case BOOST_SOFTWARE_LICENSE_1_0 extends SPDX_LICENSE("BSL-1.0", Some("Boost Software License 1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case BORCEUX extends SPDX_LICENSE("Borceux", Some("Borceux license"), Some("http://hl7.org/fhir/spdx-license"))
  case BSD_1_CLAUSE_LICENSE extends SPDX_LICENSE("BSD-1-Clause", Some("BSD 1-Clause License"), Some("http://hl7.org/fhir/spdx-license"))
  case BSD_2_CLAUSE extends SPDX_LICENSE("BSD-2-Clause", Some("BSD 2-Clause \"Simplified\" License"), Some("http://hl7.org/fhir/spdx-license"))
  case BSD_2_CLAUSE_FREEBSD_LICENSE extends SPDX_LICENSE("BSD-2-Clause-FreeBSD", Some("BSD 2-Clause FreeBSD License"), Some("http://hl7.org/fhir/spdx-license"))
  case BSD_2_CLAUSE_NETBSD_LICENSE extends SPDX_LICENSE("BSD-2-Clause-NetBSD", Some("BSD 2-Clause NetBSD License"), Some("http://hl7.org/fhir/spdx-license"))
  case BSD_2_CLAUSE_PLUS_PATENT_LICENSE extends SPDX_LICENSE("BSD-2-Clause-Patent", Some("BSD-2-Clause Plus Patent License"), Some("http://hl7.org/fhir/spdx-license"))
  case BSD_3_CLAUSE extends SPDX_LICENSE("BSD-3-Clause", Some("BSD 3-Clause \"New\" or \"Revised\" License"), Some("http://hl7.org/fhir/spdx-license"))
  case BSD_3_CLAUSE_CLEAR_LICENSE extends SPDX_LICENSE("BSD-3-Clause-Clear", Some("BSD 3-Clause Clear License"), Some("http://hl7.org/fhir/spdx-license"))
  case BSD_3_CLAUSE_NO_NUCLEAR_LICENSE extends SPDX_LICENSE("BSD-3-Clause-No-Nuclear-License", Some("BSD 3-Clause No Nuclear License"), Some("http://hl7.org/fhir/spdx-license"))
  case BSD_3_CLAUSE_NO_NUCLEAR_LICENSE_2014 extends SPDX_LICENSE("BSD-3-Clause-No-Nuclear-License-2014", Some("BSD 3-Clause No Nuclear License 2014"), Some("http://hl7.org/fhir/spdx-license"))
  case BSD_3_CLAUSE_NO_NUCLEAR_WARRANTY extends SPDX_LICENSE("BSD-3-Clause-No-Nuclear-Warranty", Some("BSD 3-Clause No Nuclear Warranty"), Some("http://hl7.org/fhir/spdx-license"))
  case BSD_4_CLAUSE extends SPDX_LICENSE("BSD-4-Clause", Some("BSD 4-Clause \"Original\" or \"Old\" License"), Some("http://hl7.org/fhir/spdx-license"))
  case BSD_4_CLAUSE_UC extends SPDX_LICENSE("BSD-4-Clause-UC", Some("BSD-4-Clause (University of California-Specific)"), Some("http://hl7.org/fhir/spdx-license"))
  case BSD_PROTECTION_LICENSE extends SPDX_LICENSE("BSD-Protection", Some("BSD Protection License"), Some("http://hl7.org/fhir/spdx-license"))
  case BSD_SOURCE_CODE_ATTRIBUTION extends SPDX_LICENSE("BSD-Source-Code", Some("BSD Source Code Attribution"), Some("http://hl7.org/fhir/spdx-license"))
  case BSD_WITH_ATTRIBUTION extends SPDX_LICENSE("BSD-3-Clause-Attribution", Some("BSD with attribution"), Some("http://hl7.org/fhir/spdx-license"))
  case BSD_ZERO_CLAUSE_LICENSE extends SPDX_LICENSE("0BSD", Some("BSD Zero Clause License"), Some("http://hl7.org/fhir/spdx-license"))
  case BZIP2_AND_LIBBZIP2_LICENSE_V1_0_5 extends SPDX_LICENSE("bzip2-1.0.5", Some("bzip2 and libbzip2 License v1.0.5"), Some("http://hl7.org/fhir/spdx-license"))
  case BZIP2_AND_LIBBZIP2_LICENSE_V1_0_6 extends SPDX_LICENSE("bzip2-1.0.6", Some("bzip2 and libbzip2 License v1.0.6"), Some("http://hl7.org/fhir/spdx-license"))
  case CALDERA extends SPDX_LICENSE("Caldera", Some("Caldera License"), Some("http://hl7.org/fhir/spdx-license"))
  case CECILL_B_FREE_SOFTWARE_LICENSE_AGREEMENT extends SPDX_LICENSE("CECILL-B", Some("CeCILL-B Free Software License Agreement"), Some("http://hl7.org/fhir/spdx-license"))
  case CECILL_C_FREE_SOFTWARE_LICENSE_AGREEMENT extends SPDX_LICENSE("CECILL-C", Some("CeCILL-C Free Software License Agreement"), Some("http://hl7.org/fhir/spdx-license"))
  case CECILL_FREE_SOFTWARE_LICENSE_AGREEMENT_V1_0 extends SPDX_LICENSE("CECILL-1.0", Some("CeCILL Free Software License Agreement v1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case CECILL_FREE_SOFTWARE_LICENSE_AGREEMENT_V1_1 extends SPDX_LICENSE("CECILL-1.1", Some("CeCILL Free Software License Agreement v1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case CECILL_FREE_SOFTWARE_LICENSE_AGREEMENT_V2_0 extends SPDX_LICENSE("CECILL-2.0", Some("CeCILL Free Software License Agreement v2.0"), Some("http://hl7.org/fhir/spdx-license"))
  case CECILL_FREE_SOFTWARE_LICENSE_AGREEMENT_V2_1 extends SPDX_LICENSE("CECILL-2.1", Some("CeCILL Free Software License Agreement v2.1"), Some("http://hl7.org/fhir/spdx-license"))
  case CLARTISTIC extends SPDX_LICENSE("ClArtistic", Some("Clarified Artistic License"), Some("http://hl7.org/fhir/spdx-license"))
  case CMU_LICENSE extends SPDX_LICENSE("MIT-CMU", Some("CMU License"), Some("http://hl7.org/fhir/spdx-license"))
  case CNRI_JYTHON_LICENSE extends SPDX_LICENSE("CNRI-Jython", Some("CNRI Jython License"), Some("http://hl7.org/fhir/spdx-license"))
  case CNRI_PYTHON_LICENSE extends SPDX_LICENSE("CNRI-Python", Some("CNRI Python License"), Some("http://hl7.org/fhir/spdx-license"))
  case CNRI_PYTHON_OPEN_SOURCE_GPL_COMPATIBLE_LICENSE_AGREEMENT extends SPDX_LICENSE("CNRI-Python-GPL-Compatible", Some("CNRI Python Open Source GPL Compatible License Agreement"), Some("http://hl7.org/fhir/spdx-license"))
  case CODE_PROJECT_OPEN_LICENSE_1_02 extends SPDX_LICENSE("CPOL-1.02", Some("Code Project Open License 1.02"), Some("http://hl7.org/fhir/spdx-license"))
  case COMMON_DEVELOPMENT_AND_DISTRIBUTION_LICENSE_1_0 extends SPDX_LICENSE("CDDL-1.0", Some("Common Development and Distribution License 1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case COMMON_DEVELOPMENT_AND_DISTRIBUTION_LICENSE_1_1 extends SPDX_LICENSE("CDDL-1.1", Some("Common Development and Distribution License 1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case COMMON_PUBLIC_ATTRIBUTION_LICENSE_1_0 extends SPDX_LICENSE("CPAL-1.0", Some("Common Public Attribution License 1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case COMMON_PUBLIC_LICENSE_1_0 extends SPDX_LICENSE("CPL-1.0", Some("Common Public License 1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case COMMUNITY_DATA_LICENSE_AGREEMENT_PERMISSIVE_1_0 extends SPDX_LICENSE("CDLA-Permissive-1.0", Some("Community Data License Agreement Permissive 1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case COMMUNITY_DATA_LICENSE_AGREEMENT_SHARING_1_0 extends SPDX_LICENSE("CDLA-Sharing-1.0", Some("Community Data License Agreement Sharing 1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case COMPUTER_ASSOCIATES_TRUSTED_OPEN_SOURCE_LICENSE_1_1 extends SPDX_LICENSE("CATOSL-1.1", Some("Computer Associates Trusted Open Source License 1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case CONDOR_PUBLIC_LICENSE_V1_1 extends SPDX_LICENSE("Condor-1.1", Some("Condor Public License v1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_1_0_GENERIC extends SPDX_LICENSE("CC-BY-1.0", Some("Creative Commons Attribution 1.0 Generic"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_2_0_GENERIC extends SPDX_LICENSE("CC-BY-2.0", Some("Creative Commons Attribution 2.0 Generic"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_2_5_GENERIC extends SPDX_LICENSE("CC-BY-2.5", Some("Creative Commons Attribution 2.5 Generic"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_3_0_UNPORTED extends SPDX_LICENSE("CC-BY-3.0", Some("Creative Commons Attribution 3.0 Unported"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_4_0_INTERNATIONAL extends SPDX_LICENSE("CC-BY-4.0", Some("Creative Commons Attribution 4.0 International"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_1_0_GENERIC extends SPDX_LICENSE("CC-BY-NC-1.0", Some("Creative Commons Attribution Non Commercial 1.0 Generic"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_2_0_GENERIC extends SPDX_LICENSE("CC-BY-NC-2.0", Some("Creative Commons Attribution Non Commercial 2.0 Generic"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_2_5_GENERIC extends SPDX_LICENSE("CC-BY-NC-2.5", Some("Creative Commons Attribution Non Commercial 2.5 Generic"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_3_0_UNPORTED extends SPDX_LICENSE("CC-BY-NC-3.0", Some("Creative Commons Attribution Non Commercial 3.0 Unported"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_4_0_INTERNATIONAL extends SPDX_LICENSE("CC-BY-NC-4.0", Some("Creative Commons Attribution Non Commercial 4.0 International"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_NO_DERIVATIVES_1_0_GENERIC extends SPDX_LICENSE("CC-BY-NC-ND-1.0", Some("Creative Commons Attribution Non Commercial No Derivatives 1.0 Generic"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_NO_DERIVATIVES_2_0_GENERIC extends SPDX_LICENSE("CC-BY-NC-ND-2.0", Some("Creative Commons Attribution Non Commercial No Derivatives 2.0 Generic"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_NO_DERIVATIVES_2_5_GENERIC extends SPDX_LICENSE("CC-BY-NC-ND-2.5", Some("Creative Commons Attribution Non Commercial No Derivatives 2.5 Generic"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_NO_DERIVATIVES_3_0_UNPORTED extends SPDX_LICENSE("CC-BY-NC-ND-3.0", Some("Creative Commons Attribution Non Commercial No Derivatives 3.0 Unported"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_NO_DERIVATIVES_4_0_INTERNATIONAL extends SPDX_LICENSE("CC-BY-NC-ND-4.0", Some("Creative Commons Attribution Non Commercial No Derivatives 4.0 International"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_SHARE_ALIKE_1_0_GENERIC extends SPDX_LICENSE("CC-BY-NC-SA-1.0", Some("Creative Commons Attribution Non Commercial Share Alike 1.0 Generic"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_SHARE_ALIKE_2_0_GENERIC extends SPDX_LICENSE("CC-BY-NC-SA-2.0", Some("Creative Commons Attribution Non Commercial Share Alike 2.0 Generic"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_SHARE_ALIKE_2_5_GENERIC extends SPDX_LICENSE("CC-BY-NC-SA-2.5", Some("Creative Commons Attribution Non Commercial Share Alike 2.5 Generic"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_SHARE_ALIKE_3_0_UNPORTED extends SPDX_LICENSE("CC-BY-NC-SA-3.0", Some("Creative Commons Attribution Non Commercial Share Alike 3.0 Unported"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_SHARE_ALIKE_4_0_INTERNATIONAL extends SPDX_LICENSE("CC-BY-NC-SA-4.0", Some("Creative Commons Attribution Non Commercial Share Alike 4.0 International"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_NO_DERIVATIVES_1_0_GENERIC extends SPDX_LICENSE("CC-BY-ND-1.0", Some("Creative Commons Attribution No Derivatives 1.0 Generic"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_NO_DERIVATIVES_2_0_GENERIC extends SPDX_LICENSE("CC-BY-ND-2.0", Some("Creative Commons Attribution No Derivatives 2.0 Generic"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_NO_DERIVATIVES_2_5_GENERIC extends SPDX_LICENSE("CC-BY-ND-2.5", Some("Creative Commons Attribution No Derivatives 2.5 Generic"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_NO_DERIVATIVES_3_0_UNPORTED extends SPDX_LICENSE("CC-BY-ND-3.0", Some("Creative Commons Attribution No Derivatives 3.0 Unported"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_NO_DERIVATIVES_4_0_INTERNATIONAL extends SPDX_LICENSE("CC-BY-ND-4.0", Some("Creative Commons Attribution No Derivatives 4.0 International"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_SHARE_ALIKE_1_0_GENERIC extends SPDX_LICENSE("CC-BY-SA-1.0", Some("Creative Commons Attribution Share Alike 1.0 Generic"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_SHARE_ALIKE_2_0_GENERIC extends SPDX_LICENSE("CC-BY-SA-2.0", Some("Creative Commons Attribution Share Alike 2.0 Generic"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_SHARE_ALIKE_2_5_GENERIC extends SPDX_LICENSE("CC-BY-SA-2.5", Some("Creative Commons Attribution Share Alike 2.5 Generic"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_SHARE_ALIKE_3_0_UNPORTED extends SPDX_LICENSE("CC-BY-SA-3.0", Some("Creative Commons Attribution Share Alike 3.0 Unported"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ATTRIBUTION_SHARE_ALIKE_4_0_INTERNATIONAL extends SPDX_LICENSE("CC-BY-SA-4.0", Some("Creative Commons Attribution Share Alike 4.0 International"), Some("http://hl7.org/fhir/spdx-license"))
  case CREATIVE_COMMONS_ZERO_V1_0_UNIVERSAL extends SPDX_LICENSE("CC0-1.0", Some("Creative Commons Zero v1.0 Universal"), Some("http://hl7.org/fhir/spdx-license"))
  case CROSSWORD extends SPDX_LICENSE("Crossword", Some("Crossword License"), Some("http://hl7.org/fhir/spdx-license"))
  case CRYSTALSTACKER extends SPDX_LICENSE("CrystalStacker", Some("CrystalStacker License"), Some("http://hl7.org/fhir/spdx-license"))
  case CUA_OFFICE_PUBLIC_LICENSE_V1_0 extends SPDX_LICENSE("CUA-OPL-1.0", Some("CUA Office Public License v1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case CUBE extends SPDX_LICENSE("Cube", Some("Cube License"), Some("http://hl7.org/fhir/spdx-license"))
  case CURL extends SPDX_LICENSE("curl", Some("curl License"), Some("http://hl7.org/fhir/spdx-license"))
  case DEUTSCHE_FREIE_SOFTWARE_LIZENZ extends SPDX_LICENSE("D-FSL-1.0", Some("Deutsche Freie Software Lizenz"), Some("http://hl7.org/fhir/spdx-license"))
  case DIFFMARK extends SPDX_LICENSE("diffmark", Some("diffmark license"), Some("http://hl7.org/fhir/spdx-license"))
  case DOC extends SPDX_LICENSE("DOC", Some("DOC License"), Some("http://hl7.org/fhir/spdx-license"))
  case DOTSEQN extends SPDX_LICENSE("Dotseqn", Some("Dotseqn License"), Some("http://hl7.org/fhir/spdx-license"))
  case DSDP extends SPDX_LICENSE("DSDP", Some("DSDP License"), Some("http://hl7.org/fhir/spdx-license"))
  case DVIPDFM extends SPDX_LICENSE("dvipdfm", Some("dvipdfm License"), Some("http://hl7.org/fhir/spdx-license"))
  case ECLIPSE_PUBLIC_LICENSE_1_0 extends SPDX_LICENSE("EPL-1.0", Some("Eclipse Public License 1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case ECLIPSE_PUBLIC_LICENSE_2_0 extends SPDX_LICENSE("EPL-2.0", Some("Eclipse Public License 2.0"), Some("http://hl7.org/fhir/spdx-license"))
  case EDUCATIONAL_COMMUNITY_LICENSE_V1_0 extends SPDX_LICENSE("ECL-1.0", Some("Educational Community License v1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case EDUCATIONAL_COMMUNITY_LICENSE_V2_0 extends SPDX_LICENSE("ECL-2.0", Some("Educational Community License v2.0"), Some("http://hl7.org/fhir/spdx-license"))
  case EGENIX extends SPDX_LICENSE("eGenix", Some("eGenix.com Public License 1.1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case EIFFEL_FORUM_LICENSE_V1_0 extends SPDX_LICENSE("EFL-1.0", Some("Eiffel Forum License v1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case EIFFEL_FORUM_LICENSE_V2_0 extends SPDX_LICENSE("EFL-2.0", Some("Eiffel Forum License v2.0"), Some("http://hl7.org/fhir/spdx-license"))
  case ENNA_LICENSE extends SPDX_LICENSE("MIT-enna", Some("enna License"), Some("http://hl7.org/fhir/spdx-license"))
  case ENTESSA extends SPDX_LICENSE("Entessa", Some("Entessa Public License v1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case ERLANG_PUBLIC_LICENSE_V1_1 extends SPDX_LICENSE("ErlPL-1.1", Some("Erlang Public License v1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case EUDATAGRID extends SPDX_LICENSE("EUDatagrid", Some("EU DataGrid Software License"), Some("http://hl7.org/fhir/spdx-license"))
  case EUROPEAN_UNION_PUBLIC_LICENSE_1_0 extends SPDX_LICENSE("EUPL-1.0", Some("European Union Public License 1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case EUROPEAN_UNION_PUBLIC_LICENSE_1_1 extends SPDX_LICENSE("EUPL-1.1", Some("European Union Public License 1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case EUROPEAN_UNION_PUBLIC_LICENSE_1_2 extends SPDX_LICENSE("EUPL-1.2", Some("European Union Public License 1.2"), Some("http://hl7.org/fhir/spdx-license"))
  case EUROSYM extends SPDX_LICENSE("Eurosym", Some("Eurosym License"), Some("http://hl7.org/fhir/spdx-license"))
  case FAIR extends SPDX_LICENSE("Fair", Some("Fair License"), Some("http://hl7.org/fhir/spdx-license"))
  case FEH_LICENSE extends SPDX_LICENSE("MIT-feh", Some("feh License"), Some("http://hl7.org/fhir/spdx-license"))
  case FRAMEWORX_OPEN_LICENSE_1_0 extends SPDX_LICENSE("Frameworx-1.0", Some("Frameworx Open License 1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case FREEIMAGE extends SPDX_LICENSE("FreeImage", Some("FreeImage Public License v1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case FSFAP extends SPDX_LICENSE("FSFAP", Some("FSF All Permissive License"), Some("http://hl7.org/fhir/spdx-license"))
  case FSFUL extends SPDX_LICENSE("FSFUL", Some("FSF Unlimited License"), Some("http://hl7.org/fhir/spdx-license"))
  case FSFULLR extends SPDX_LICENSE("FSFULLR", Some("FSF Unlimited License (with License Retention)"), Some("http://hl7.org/fhir/spdx-license"))
  case FTL extends SPDX_LICENSE("FTL", Some("Freetype Project License"), Some("http://hl7.org/fhir/spdx-license"))
  case GIFTWARE extends SPDX_LICENSE("Giftware", Some("Giftware License"), Some("http://hl7.org/fhir/spdx-license"))
  case GL2PS extends SPDX_LICENSE("GL2PS", Some("GL2PS License"), Some("http://hl7.org/fhir/spdx-license"))
  case GLIDE extends SPDX_LICENSE("Glide", Some("3dfx Glide License"), Some("http://hl7.org/fhir/spdx-license"))
  case GLULXE extends SPDX_LICENSE("Glulxe", Some("Glulxe License"), Some("http://hl7.org/fhir/spdx-license"))
  case GNUPLOT extends SPDX_LICENSE("gnuplot", Some("gnuplot License"), Some("http://hl7.org/fhir/spdx-license"))
  case GNU_AFFERO_GENERAL_PUBLIC_LICENSE_V3_0_ONLY extends SPDX_LICENSE("AGPL-3.0-only", Some("GNU Affero General Public License v3.0 only"), Some("http://hl7.org/fhir/spdx-license"))
  case GNU_AFFERO_GENERAL_PUBLIC_LICENSE_V3_0_OR_LATER extends SPDX_LICENSE("AGPL-3.0-or-later", Some("GNU Affero General Public License v3.0 or later"), Some("http://hl7.org/fhir/spdx-license"))
  case GNU_FREE_DOCUMENTATION_LICENSE_V1_1_ONLY extends SPDX_LICENSE("GFDL-1.1-only", Some("GNU Free Documentation License v1.1 only"), Some("http://hl7.org/fhir/spdx-license"))
  case GNU_FREE_DOCUMENTATION_LICENSE_V1_1_OR_LATER extends SPDX_LICENSE("GFDL-1.1-or-later", Some("GNU Free Documentation License v1.1 or later"), Some("http://hl7.org/fhir/spdx-license"))
  case GNU_FREE_DOCUMENTATION_LICENSE_V1_2_ONLY extends SPDX_LICENSE("GFDL-1.2-only", Some("GNU Free Documentation License v1.2 only"), Some("http://hl7.org/fhir/spdx-license"))
  case GNU_FREE_DOCUMENTATION_LICENSE_V1_2_OR_LATER extends SPDX_LICENSE("GFDL-1.2-or-later", Some("GNU Free Documentation License v1.2 or later"), Some("http://hl7.org/fhir/spdx-license"))
  case GNU_FREE_DOCUMENTATION_LICENSE_V1_3_ONLY extends SPDX_LICENSE("GFDL-1.3-only", Some("GNU Free Documentation License v1.3 only"), Some("http://hl7.org/fhir/spdx-license"))
  case GNU_FREE_DOCUMENTATION_LICENSE_V1_3_OR_LATER extends SPDX_LICENSE("GFDL-1.3-or-later", Some("GNU Free Documentation License v1.3 or later"), Some("http://hl7.org/fhir/spdx-license"))
  case GNU_GENERAL_PUBLIC_LICENSE_V1_0_ONLY extends SPDX_LICENSE("GPL-1.0-only", Some("GNU General Public License v1.0 only"), Some("http://hl7.org/fhir/spdx-license"))
  case GNU_GENERAL_PUBLIC_LICENSE_V1_0_OR_LATER extends SPDX_LICENSE("GPL-1.0-or-later", Some("GNU General Public License v1.0 or later"), Some("http://hl7.org/fhir/spdx-license"))
  case GNU_GENERAL_PUBLIC_LICENSE_V2_0_ONLY extends SPDX_LICENSE("GPL-2.0-only", Some("GNU General Public License v2.0 only"), Some("http://hl7.org/fhir/spdx-license"))
  case GNU_GENERAL_PUBLIC_LICENSE_V2_0_OR_LATER extends SPDX_LICENSE("GPL-2.0-or-later", Some("GNU General Public License v2.0 or later"), Some("http://hl7.org/fhir/spdx-license"))
  case GNU_GENERAL_PUBLIC_LICENSE_V3_0_ONLY extends SPDX_LICENSE("GPL-3.0-only", Some("GNU General Public License v3.0 only"), Some("http://hl7.org/fhir/spdx-license"))
  case GNU_GENERAL_PUBLIC_LICENSE_V3_0_OR_LATER extends SPDX_LICENSE("GPL-3.0-or-later", Some("GNU General Public License v3.0 or later"), Some("http://hl7.org/fhir/spdx-license"))
  case GNU_LESSER_GENERAL_PUBLIC_LICENSE_V2_1_ONLY extends SPDX_LICENSE("LGPL-2.1-only", Some("GNU Lesser General Public License v2.1 only"), Some("http://hl7.org/fhir/spdx-license"))
  case GNU_LESSER_GENERAL_PUBLIC_LICENSE_V2_1_OR_LATER extends SPDX_LICENSE("LGPL-2.1-or-later", Some("GNU Lesser General Public License v2.1 or later"), Some("http://hl7.org/fhir/spdx-license"))
  case GNU_LESSER_GENERAL_PUBLIC_LICENSE_V3_0_ONLY extends SPDX_LICENSE("LGPL-3.0-only", Some("GNU Lesser General Public License v3.0 only"), Some("http://hl7.org/fhir/spdx-license"))
  case GNU_LESSER_GENERAL_PUBLIC_LICENSE_V3_0_OR_LATER extends SPDX_LICENSE("LGPL-3.0-or-later", Some("GNU Lesser General Public License v3.0 or later"), Some("http://hl7.org/fhir/spdx-license"))
  case GNU_LIBRARY_GENERAL_PUBLIC_LICENSE_V2_ONLY extends SPDX_LICENSE("LGPL-2.0-only", Some("GNU Library General Public License v2 only"), Some("http://hl7.org/fhir/spdx-license"))
  case GNU_LIBRARY_GENERAL_PUBLIC_LICENSE_V2_OR_LATER extends SPDX_LICENSE("LGPL-2.0-or-later", Some("GNU Library General Public License v2 or later"), Some("http://hl7.org/fhir/spdx-license"))
  case GSOAP_PUBLIC_LICENSE_V1_3B extends SPDX_LICENSE("gSOAP-1.3b", Some("gSOAP Public License v1.3b"), Some("http://hl7.org/fhir/spdx-license"))
  case HASKELLREPORT extends SPDX_LICENSE("HaskellReport", Some("Haskell Language Report License"), Some("http://hl7.org/fhir/spdx-license"))
  case HPND extends SPDX_LICENSE("HPND", Some("Historical Permission Notice and Disclaimer"), Some("http://hl7.org/fhir/spdx-license"))
  case IBM_POWERPC_INITIALIZATION_AND_BOOT_SOFTWARE extends SPDX_LICENSE("IBM-pibs", Some("IBM PowerPC Initialization and Boot Software"), Some("http://hl7.org/fhir/spdx-license"))
  case IBM_PUBLIC_LICENSE_V1_0 extends SPDX_LICENSE("IPL-1.0", Some("IBM Public License v1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case ICU extends SPDX_LICENSE("ICU", Some("ICU License"), Some("http://hl7.org/fhir/spdx-license"))
  case IJG extends SPDX_LICENSE("IJG", Some("Independent JPEG Group License"), Some("http://hl7.org/fhir/spdx-license"))
  case IMAGEMAGICK extends SPDX_LICENSE("ImageMagick", Some("ImageMagick License"), Some("http://hl7.org/fhir/spdx-license"))
  case IMATIX extends SPDX_LICENSE("iMatix", Some("iMatix Standard Function Library Agreement"), Some("http://hl7.org/fhir/spdx-license"))
  case IMLIB2 extends SPDX_LICENSE("Imlib2", Some("Imlib2 License"), Some("http://hl7.org/fhir/spdx-license"))
  case INFO_ZIP_LICENSE extends SPDX_LICENSE("Info-ZIP", Some("Info-ZIP License"), Some("http://hl7.org/fhir/spdx-license"))
  case INTEL extends SPDX_LICENSE("Intel", Some("Intel Open Source License"), Some("http://hl7.org/fhir/spdx-license"))
  case INTEL_ACPI_SOFTWARE_LICENSE_AGREEMENT extends SPDX_LICENSE("Intel-ACPI", Some("Intel ACPI Software License Agreement"), Some("http://hl7.org/fhir/spdx-license"))
  case INTERBASE_PUBLIC_LICENSE_V1_0 extends SPDX_LICENSE("Interbase-1.0", Some("Interbase Public License v1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case IPA extends SPDX_LICENSE("IPA", Some("IPA Font License"), Some("http://hl7.org/fhir/spdx-license"))
  case ISC extends SPDX_LICENSE("ISC", Some("ISC License"), Some("http://hl7.org/fhir/spdx-license"))
  case JASPER_LICENSE extends SPDX_LICENSE("JasPer-2.0", Some("JasPer License"), Some("http://hl7.org/fhir/spdx-license"))
  case JSON extends SPDX_LICENSE("JSON", Some("JSON License"), Some("http://hl7.org/fhir/spdx-license"))
  case LATEX2E extends SPDX_LICENSE("Latex2e", Some("Latex2e License"), Some("http://hl7.org/fhir/spdx-license"))
  case LATEX_PROJECT_PUBLIC_LICENSE_V1_0 extends SPDX_LICENSE("LPPL-1.0", Some("LaTeX Project Public License v1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case LATEX_PROJECT_PUBLIC_LICENSE_V1_1 extends SPDX_LICENSE("LPPL-1.1", Some("LaTeX Project Public License v1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case LATEX_PROJECT_PUBLIC_LICENSE_V1_2 extends SPDX_LICENSE("LPPL-1.2", Some("LaTeX Project Public License v1.2"), Some("http://hl7.org/fhir/spdx-license"))
  case LATEX_PROJECT_PUBLIC_LICENSE_V1_3A extends SPDX_LICENSE("LPPL-1.3a", Some("LaTeX Project Public License v1.3a"), Some("http://hl7.org/fhir/spdx-license"))
  case LATEX_PROJECT_PUBLIC_LICENSE_V1_3C extends SPDX_LICENSE("LPPL-1.3c", Some("LaTeX Project Public License v1.3c"), Some("http://hl7.org/fhir/spdx-license"))
  case LAWRENCE_BERKELEY_NATIONAL_LABS_BSD_VARIANT_LICENSE extends SPDX_LICENSE("BSD-3-Clause-LBNL", Some("Lawrence Berkeley National Labs BSD variant license"), Some("http://hl7.org/fhir/spdx-license"))
  case LEPTONICA extends SPDX_LICENSE("Leptonica", Some("Leptonica License"), Some("http://hl7.org/fhir/spdx-license"))
  case LGPLLR extends SPDX_LICENSE("LGPLLR", Some("Lesser General Public License For Linguistic Resources"), Some("http://hl7.org/fhir/spdx-license"))
  case LIBPNG extends SPDX_LICENSE("Libpng", Some("libpng License"), Some("http://hl7.org/fhir/spdx-license"))
  case LIBTIFF extends SPDX_LICENSE("libtiff", Some("libtiff License"), Some("http://hl7.org/fhir/spdx-license"))
  case LICENCE_ART_LIBRE_1_2 extends SPDX_LICENSE("LAL-1.2", Some("Licence Art Libre 1.2"), Some("http://hl7.org/fhir/spdx-license"))
  case LICENCE_ART_LIBRE_1_3 extends SPDX_LICENSE("LAL-1.3", Some("Licence Art Libre 1.3"), Some("http://hl7.org/fhir/spdx-license"))
  case LILIQ_P_11 extends SPDX_LICENSE("LiLiQ-P-1.1", Some("Licence Libre du Québec – Permissive version 1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case LILIQ_RPLUS_11 extends SPDX_LICENSE("LiLiQ-Rplus-1.1", Some("Licence Libre du Québec – Réciprocité forte version 1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case LILIQ_R_11 extends SPDX_LICENSE("LiLiQ-R-1.1", Some("Licence Libre du Québec – Réciprocité version 1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case LINUX_KERNEL_VARIANT_OF_OPENIB_ORG_LICENSE extends SPDX_LICENSE("Linux-OpenIB", Some("Linux Kernel Variant of OpenIB.org license"), Some("http://hl7.org/fhir/spdx-license"))
  case LUCENT_PUBLIC_LICENSE_V1_02 extends SPDX_LICENSE("LPL-1.02", Some("Lucent Public License v1.02"), Some("http://hl7.org/fhir/spdx-license"))
  case LUCENT_PUBLIC_LICENSE_VERSION_1_0 extends SPDX_LICENSE("LPL-1.0", Some("Lucent Public License Version 1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case MAKEINDEX extends SPDX_LICENSE("MakeIndex", Some("MakeIndex License"), Some("http://hl7.org/fhir/spdx-license"))
  case MICROSOFT_PUBLIC_LICENSE extends SPDX_LICENSE("MS-PL", Some("Microsoft Public License"), Some("http://hl7.org/fhir/spdx-license"))
  case MICROSOFT_RECIPROCAL_LICENSE extends SPDX_LICENSE("MS-RL", Some("Microsoft Reciprocal License"), Some("http://hl7.org/fhir/spdx-license"))
  case MIROS extends SPDX_LICENSE("MirOS", Some("MirOS License"), Some("http://hl7.org/fhir/spdx-license"))
  case MIT extends SPDX_LICENSE("MIT", Some("MIT License"), Some("http://hl7.org/fhir/spdx-license"))
  case MITNFA extends SPDX_LICENSE("MITNFA", Some("MIT +no-false-attribs license"), Some("http://hl7.org/fhir/spdx-license"))
  case MIT_ADVERTISING extends SPDX_LICENSE("MIT-advertising", Some("Enlightenment License (e16)"), Some("http://hl7.org/fhir/spdx-license"))
  case MIT_NO_ATTRIBUTION extends SPDX_LICENSE("MIT-0", Some("MIT No Attribution"), Some("http://hl7.org/fhir/spdx-license"))
  case MOTOSOTO extends SPDX_LICENSE("Motosoto", Some("Motosoto License"), Some("http://hl7.org/fhir/spdx-license"))
  case MOZILLA_PUBLIC_LICENSE_1_0 extends SPDX_LICENSE("MPL-1.0", Some("Mozilla Public License 1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case MOZILLA_PUBLIC_LICENSE_1_1 extends SPDX_LICENSE("MPL-1.1", Some("Mozilla Public License 1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case MOZILLA_PUBLIC_LICENSE_2_0 extends SPDX_LICENSE("MPL-2.0", Some("Mozilla Public License 2.0"), Some("http://hl7.org/fhir/spdx-license"))
  case MPICH2 extends SPDX_LICENSE("mpich2", Some("mpich2 License"), Some("http://hl7.org/fhir/spdx-license"))
  case MPL_20_NO_COPYLEFT_EXCEPTION extends SPDX_LICENSE("MPL-2.0-no-copyleft-exception", Some("Mozilla Public License 2.0 (no copyleft exception)"), Some("http://hl7.org/fhir/spdx-license"))
  case MTLL extends SPDX_LICENSE("MTLL", Some("Matrix Template Library License"), Some("http://hl7.org/fhir/spdx-license"))
  case MULTICS extends SPDX_LICENSE("Multics", Some("Multics License"), Some("http://hl7.org/fhir/spdx-license"))
  case MUP extends SPDX_LICENSE("Mup", Some("Mup License"), Some("http://hl7.org/fhir/spdx-license"))
  case NASA_OPEN_SOURCE_AGREEMENT_1_3 extends SPDX_LICENSE("NASA-1.3", Some("NASA Open Source Agreement 1.3"), Some("http://hl7.org/fhir/spdx-license"))
  case NAUMEN extends SPDX_LICENSE("Naumen", Some("Naumen Public License"), Some("http://hl7.org/fhir/spdx-license"))
  case NCSA extends SPDX_LICENSE("NCSA", Some("University of Illinois/NCSA Open Source License"), Some("http://hl7.org/fhir/spdx-license"))
  case NETCDF extends SPDX_LICENSE("NetCDF", Some("NetCDF license"), Some("http://hl7.org/fhir/spdx-license"))
  case NETSCAPE_PUBLIC_LICENSE_V1_0 extends SPDX_LICENSE("NPL-1.0", Some("Netscape Public License v1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case NETSCAPE_PUBLIC_LICENSE_V1_1 extends SPDX_LICENSE("NPL-1.1", Some("Netscape Public License v1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case NET_BOOLEAN_PUBLIC_LICENSE_V1 extends SPDX_LICENSE("NBPL-1.0", Some("Net Boolean Public License v1"), Some("http://hl7.org/fhir/spdx-license"))
  case NET_SNMP_LICENSE extends SPDX_LICENSE("Net-SNMP", Some("Net-SNMP License"), Some("http://hl7.org/fhir/spdx-license"))
  case NEWSLETR extends SPDX_LICENSE("Newsletr", Some("Newsletr License"), Some("http://hl7.org/fhir/spdx-license"))
  case NGPL extends SPDX_LICENSE("NGPL", Some("Nethack General Public License"), Some("http://hl7.org/fhir/spdx-license"))
  case NLPL extends SPDX_LICENSE("NLPL", Some("No Limit Public License"), Some("http://hl7.org/fhir/spdx-license"))
  case NOKIA extends SPDX_LICENSE("Nokia", Some("Nokia Open Source License"), Some("http://hl7.org/fhir/spdx-license"))
  case NON_PROFIT_OPEN_SOFTWARE_LICENSE_3_0 extends SPDX_LICENSE("NPOSL-3.0", Some("Non-Profit Open Software License 3.0"), Some("http://hl7.org/fhir/spdx-license"))
  case NORWEGIAN_LICENCE_FOR_OPEN_GOVERNMENT_DATA extends SPDX_LICENSE("NLOD-1.0", Some("Norwegian Licence for Open Government Data"), Some("http://hl7.org/fhir/spdx-license"))
  case NOSL extends SPDX_LICENSE("NOSL", Some("Netizen Open Source License"), Some("http://hl7.org/fhir/spdx-license"))
  case NOT_OPEN_SOURCE extends SPDX_LICENSE("not-open-source", Some("Not open source"), Some("http://hl7.org/fhir/spdx-license"))
  case NOWEB extends SPDX_LICENSE("Noweb", Some("Noweb License"), Some("http://hl7.org/fhir/spdx-license"))
  case NRL extends SPDX_LICENSE("NRL", Some("NRL License"), Some("http://hl7.org/fhir/spdx-license"))
  case NTP extends SPDX_LICENSE("NTP", Some("NTP License"), Some("http://hl7.org/fhir/spdx-license"))
  case OCLC_RESEARCH_PUBLIC_LICENSE_2_0 extends SPDX_LICENSE("OCLC-2.0", Some("OCLC Research Public License 2.0"), Some("http://hl7.org/fhir/spdx-license"))
  case ODC_OPEN_DATABASE_LICENSE_V1_0 extends SPDX_LICENSE("ODbL-1.0", Some("ODC Open Database License v1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case OGTSL extends SPDX_LICENSE("OGTSL", Some("Open Group Test Suite License"), Some("http://hl7.org/fhir/spdx-license"))
  case OLDAP_20 extends SPDX_LICENSE("OLDAP-2.0", Some("Open LDAP Public License v2.0 (or possibly 2.0A and 2.0B)"), Some("http://hl7.org/fhir/spdx-license"))
  case OML extends SPDX_LICENSE("OML", Some("Open Market License"), Some("http://hl7.org/fhir/spdx-license"))
  case OPENSSL extends SPDX_LICENSE("OpenSSL", Some("OpenSSL License"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_CASCADE_TECHNOLOGY_PUBLIC_LICENSE extends SPDX_LICENSE("OCCT-PL", Some("Open CASCADE Technology Public License"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_LDAP_PUBLIC_LICENSE_2_2_2 extends SPDX_LICENSE("OLDAP-2.2.2", Some("Open LDAP Public License 2.2.2"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_LDAP_PUBLIC_LICENSE_V1_1 extends SPDX_LICENSE("OLDAP-1.1", Some("Open LDAP Public License v1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_LDAP_PUBLIC_LICENSE_V1_2 extends SPDX_LICENSE("OLDAP-1.2", Some("Open LDAP Public License v1.2"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_LDAP_PUBLIC_LICENSE_V1_3 extends SPDX_LICENSE("OLDAP-1.3", Some("Open LDAP Public License v1.3"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_LDAP_PUBLIC_LICENSE_V1_4 extends SPDX_LICENSE("OLDAP-1.4", Some("Open LDAP Public License v1.4"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_LDAP_PUBLIC_LICENSE_V2_0_1 extends SPDX_LICENSE("OLDAP-2.0.1", Some("Open LDAP Public License v2.0.1"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_LDAP_PUBLIC_LICENSE_V2_1 extends SPDX_LICENSE("OLDAP-2.1", Some("Open LDAP Public License v2.1"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_LDAP_PUBLIC_LICENSE_V2_2 extends SPDX_LICENSE("OLDAP-2.2", Some("Open LDAP Public License v2.2"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_LDAP_PUBLIC_LICENSE_V2_2_1 extends SPDX_LICENSE("OLDAP-2.2.1", Some("Open LDAP Public License v2.2.1"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_LDAP_PUBLIC_LICENSE_V2_3 extends SPDX_LICENSE("OLDAP-2.3", Some("Open LDAP Public License v2.3"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_LDAP_PUBLIC_LICENSE_V2_4 extends SPDX_LICENSE("OLDAP-2.4", Some("Open LDAP Public License v2.4"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_LDAP_PUBLIC_LICENSE_V2_5 extends SPDX_LICENSE("OLDAP-2.5", Some("Open LDAP Public License v2.5"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_LDAP_PUBLIC_LICENSE_V2_6 extends SPDX_LICENSE("OLDAP-2.6", Some("Open LDAP Public License v2.6"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_LDAP_PUBLIC_LICENSE_V2_7 extends SPDX_LICENSE("OLDAP-2.7", Some("Open LDAP Public License v2.7"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_LDAP_PUBLIC_LICENSE_V2_8 extends SPDX_LICENSE("OLDAP-2.8", Some("Open LDAP Public License v2.8"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_PUBLIC_LICENSE_V1_0 extends SPDX_LICENSE("OPL-1.0", Some("Open Public License v1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_SOFTWARE_LICENSE_1_0 extends SPDX_LICENSE("OSL-1.0", Some("Open Software License 1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_SOFTWARE_LICENSE_1_1 extends SPDX_LICENSE("OSL-1.1", Some("Open Software License 1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_SOFTWARE_LICENSE_2_0 extends SPDX_LICENSE("OSL-2.0", Some("Open Software License 2.0"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_SOFTWARE_LICENSE_2_1 extends SPDX_LICENSE("OSL-2.1", Some("Open Software License 2.1"), Some("http://hl7.org/fhir/spdx-license"))
  case OPEN_SOFTWARE_LICENSE_3_0 extends SPDX_LICENSE("OSL-3.0", Some("Open Software License 3.0"), Some("http://hl7.org/fhir/spdx-license"))
  case OSET_PUBLIC_LICENSE_VERSION_2_1 extends SPDX_LICENSE("OSET-PL-2.1", Some("OSET Public License version 2.1"), Some("http://hl7.org/fhir/spdx-license"))
  case PDDL_10 extends SPDX_LICENSE("PDDL-1.0", Some("ODC Public Domain Dedication & License 1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case PHP_LICENSE_V3_0 extends SPDX_LICENSE("PHP-3.0", Some("PHP License v3.0"), Some("http://hl7.org/fhir/spdx-license"))
  case PHP_LICENSE_V3_01 extends SPDX_LICENSE("PHP-3.01", Some("PHP License v3.01"), Some("http://hl7.org/fhir/spdx-license"))
  case PLEXUS extends SPDX_LICENSE("Plexus", Some("Plexus Classworlds License"), Some("http://hl7.org/fhir/spdx-license"))
  case POSTGRESQL extends SPDX_LICENSE("PostgreSQL", Some("PostgreSQL License"), Some("http://hl7.org/fhir/spdx-license"))
  case PSFRAG extends SPDX_LICENSE("psfrag", Some("psfrag License"), Some("http://hl7.org/fhir/spdx-license"))
  case PSUTILS extends SPDX_LICENSE("psutils", Some("psutils License"), Some("http://hl7.org/fhir/spdx-license"))
  case PYTHON_LICENSE_2_0 extends SPDX_LICENSE("Python-2.0", Some("Python License 2.0"), Some("http://hl7.org/fhir/spdx-license"))
  case QHULL extends SPDX_LICENSE("Qhull", Some("Qhull License"), Some("http://hl7.org/fhir/spdx-license"))
  case Q_PUBLIC_LICENSE_1_0 extends SPDX_LICENSE("QPL-1.0", Some("Q Public License 1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case RDISC extends SPDX_LICENSE("Rdisc", Some("Rdisc License"), Some("http://hl7.org/fhir/spdx-license"))
  case REALNETWORKS_PUBLIC_SOURCE_LICENSE_V1_0 extends SPDX_LICENSE("RPSL-1.0", Some("RealNetworks Public Source License v1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case RECIPROCAL_PUBLIC_LICENSE_1_1 extends SPDX_LICENSE("RPL-1.1", Some("Reciprocal Public License 1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case RECIPROCAL_PUBLIC_LICENSE_1_5 extends SPDX_LICENSE("RPL-1.5", Some("Reciprocal Public License 1.5"), Some("http://hl7.org/fhir/spdx-license"))
  case RED_HAT_ECOS_PUBLIC_LICENSE_V1_1 extends SPDX_LICENSE("RHeCos-1.1", Some("Red Hat eCos Public License v1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case RSA_MESSAGE_DIGEST_LICENSE extends SPDX_LICENSE("RSA-MD", Some("RSA Message-Digest License"), Some("http://hl7.org/fhir/spdx-license"))
  case RSCPL extends SPDX_LICENSE("RSCPL", Some("Ricoh Source Code Public License"), Some("http://hl7.org/fhir/spdx-license"))
  case RUBY extends SPDX_LICENSE("Ruby", Some("Ruby License"), Some("http://hl7.org/fhir/spdx-license"))
  case SAXPATH extends SPDX_LICENSE("Saxpath", Some("Saxpath License"), Some("http://hl7.org/fhir/spdx-license"))
  case SAX_PUBLIC_DOMAIN_NOTICE extends SPDX_LICENSE("SAX-PD", Some("Sax Public Domain Notice"), Some("http://hl7.org/fhir/spdx-license"))
  case SCEA extends SPDX_LICENSE("SCEA", Some("SCEA Shared Source License"), Some("http://hl7.org/fhir/spdx-license"))
  case SENDMAIL extends SPDX_LICENSE("Sendmail", Some("Sendmail License"), Some("http://hl7.org/fhir/spdx-license"))
  case SGI_FREE_SOFTWARE_LICENSE_B_V1_0 extends SPDX_LICENSE("SGI-B-1.0", Some("SGI Free Software License B v1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case SGI_FREE_SOFTWARE_LICENSE_B_V1_1 extends SPDX_LICENSE("SGI-B-1.1", Some("SGI Free Software License B v1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case SGI_FREE_SOFTWARE_LICENSE_B_V2_0 extends SPDX_LICENSE("SGI-B-2.0", Some("SGI Free Software License B v2.0"), Some("http://hl7.org/fhir/spdx-license"))
  case SIL_OPEN_FONT_LICENSE_1_0 extends SPDX_LICENSE("OFL-1.0", Some("SIL Open Font License 1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case SIL_OPEN_FONT_LICENSE_1_1 extends SPDX_LICENSE("OFL-1.1", Some("SIL Open Font License 1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case SIMPLE_PUBLIC_LICENSE_2_0 extends SPDX_LICENSE("SimPL-2.0", Some("Simple Public License 2.0"), Some("http://hl7.org/fhir/spdx-license"))
  case SISSL extends SPDX_LICENSE("SISSL", Some("Sun Industry Standards Source License v1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case SLEEPYCAT extends SPDX_LICENSE("Sleepycat", Some("Sleepycat License"), Some("http://hl7.org/fhir/spdx-license"))
  case SMLNJ extends SPDX_LICENSE("SMLNJ", Some("Standard ML of New Jersey License"), Some("http://hl7.org/fhir/spdx-license"))
  case SMPPL extends SPDX_LICENSE("SMPPL", Some("Secure Messaging Protocol Public License"), Some("http://hl7.org/fhir/spdx-license"))
  case SNIA extends SPDX_LICENSE("SNIA", Some("SNIA Public License 1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case SPENCER_LICENSE_86 extends SPDX_LICENSE("Spencer-86", Some("Spencer License 86"), Some("http://hl7.org/fhir/spdx-license"))
  case SPENCER_LICENSE_94 extends SPDX_LICENSE("Spencer-94", Some("Spencer License 94"), Some("http://hl7.org/fhir/spdx-license"))
  case SPENCER_LICENSE_99 extends SPDX_LICENSE("Spencer-99", Some("Spencer License 99"), Some("http://hl7.org/fhir/spdx-license"))
  case SUGARCRM_PUBLIC_LICENSE_V1_1_3 extends SPDX_LICENSE("SugarCRM-1.1.3", Some("SugarCRM Public License v1.1.3"), Some("http://hl7.org/fhir/spdx-license"))
  case SUN_INDUSTRY_STANDARDS_SOURCE_LICENSE_V1_2 extends SPDX_LICENSE("SISSL-1.2", Some("Sun Industry Standards Source License v1.2"), Some("http://hl7.org/fhir/spdx-license"))
  case SUN_PUBLIC_LICENSE_V1_0 extends SPDX_LICENSE("SPL-1.0", Some("Sun Public License v1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case SWL extends SPDX_LICENSE("SWL", Some("Scheme Widget Library (SWL) Software License Agreement"), Some("http://hl7.org/fhir/spdx-license"))
  case SYBASE_OPEN_WATCOM_PUBLIC_LICENSE_1_0 extends SPDX_LICENSE("Watcom-1.0", Some("Sybase Open Watcom Public License 1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case TCL extends SPDX_LICENSE("TCL", Some("TCL/TK License"), Some("http://hl7.org/fhir/spdx-license"))
  case TCP_WRAPPERS_LICENSE extends SPDX_LICENSE("TCP-wrappers", Some("TCP Wrappers License"), Some("http://hl7.org/fhir/spdx-license"))
  case TMATE extends SPDX_LICENSE("TMate", Some("TMate Open Source License"), Some("http://hl7.org/fhir/spdx-license"))
  case TORQUE_11 extends SPDX_LICENSE("TORQUE-1.1", Some("TORQUE v2.5+ Software License v1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case TOSL extends SPDX_LICENSE("TOSL", Some("Trusster Open Source License"), Some("http://hl7.org/fhir/spdx-license"))
  case UNICODE_DFS_2015 extends SPDX_LICENSE("Unicode-DFS-2015", Some("Unicode License Agreement - Data Files and Software (2015)"), Some("http://hl7.org/fhir/spdx-license"))
  case UNICODE_DFS_2016 extends SPDX_LICENSE("Unicode-DFS-2016", Some("Unicode License Agreement - Data Files and Software (2016)"), Some("http://hl7.org/fhir/spdx-license"))
  case UNICODE_TERMS_OF_USE extends SPDX_LICENSE("Unicode-TOU", Some("Unicode Terms of Use"), Some("http://hl7.org/fhir/spdx-license"))
  case UNIVERSAL_PERMISSIVE_LICENSE_V1_0 extends SPDX_LICENSE("UPL-1.0", Some("Universal Permissive License v1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case UNLICENSE extends SPDX_LICENSE("Unlicense", Some("The Unlicense"), Some("http://hl7.org/fhir/spdx-license"))
  case VIM extends SPDX_LICENSE("Vim", Some("Vim License"), Some("http://hl7.org/fhir/spdx-license"))
  case VOSTROM extends SPDX_LICENSE("VOSTROM", Some("VOSTROM Public License for Open Source"), Some("http://hl7.org/fhir/spdx-license"))
  case VOVIDA_SOFTWARE_LICENSE_V1_0 extends SPDX_LICENSE("VSL-1.0", Some("Vovida Software License v1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case W3C extends SPDX_LICENSE("W3C", Some("W3C Software Notice and License (2002-12-31)"), Some("http://hl7.org/fhir/spdx-license"))
  case W3C_19980720 extends SPDX_LICENSE("W3C-19980720", Some("W3C Software Notice and License (1998-07-20)"), Some("http://hl7.org/fhir/spdx-license"))
  case W3C_20150513 extends SPDX_LICENSE("W3C-20150513", Some("W3C Software Notice and Document License (2015-05-13)"), Some("http://hl7.org/fhir/spdx-license"))
  case WSUIPA extends SPDX_LICENSE("Wsuipa", Some("Wsuipa License"), Some("http://hl7.org/fhir/spdx-license"))
  case WTFPL extends SPDX_LICENSE("WTFPL", Some("Do What The F*ck You Want To Public License"), Some("http://hl7.org/fhir/spdx-license"))
  case X11 extends SPDX_LICENSE("X11", Some("X11 License"), Some("http://hl7.org/fhir/spdx-license"))
  case XEROX extends SPDX_LICENSE("Xerox", Some("Xerox License"), Some("http://hl7.org/fhir/spdx-license"))
  case XFREE86_LICENSE_1_1 extends SPDX_LICENSE("XFree86-1.1", Some("XFree86 License 1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case XINETD extends SPDX_LICENSE("xinetd", Some("xinetd License"), Some("http://hl7.org/fhir/spdx-license"))
  case XNET extends SPDX_LICENSE("Xnet", Some("X.Net License"), Some("http://hl7.org/fhir/spdx-license"))
  case XPP extends SPDX_LICENSE("xpp", Some("XPP License"), Some("http://hl7.org/fhir/spdx-license"))
  case XSKAT extends SPDX_LICENSE("XSkat", Some("XSkat License"), Some("http://hl7.org/fhir/spdx-license"))
  case YPL_10 extends SPDX_LICENSE("YPL-1.0", Some("Yahoo! Public License v1.0"), Some("http://hl7.org/fhir/spdx-license"))
  case YPL_11 extends SPDX_LICENSE("YPL-1.1", Some("Yahoo! Public License v1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case ZED extends SPDX_LICENSE("Zed", Some("Zed License"), Some("http://hl7.org/fhir/spdx-license"))
  case ZEND_LICENSE_V2_0 extends SPDX_LICENSE("Zend-2.0", Some("Zend License v2.0"), Some("http://hl7.org/fhir/spdx-license"))
  case ZIMBRA_PUBLIC_LICENSE_V1_3 extends SPDX_LICENSE("Zimbra-1.3", Some("Zimbra Public License v1.3"), Some("http://hl7.org/fhir/spdx-license"))
  case ZIMBRA_PUBLIC_LICENSE_V1_4 extends SPDX_LICENSE("Zimbra-1.4", Some("Zimbra Public License v1.4"), Some("http://hl7.org/fhir/spdx-license"))
  case ZLIB extends SPDX_LICENSE("Zlib", Some("zlib License"), Some("http://hl7.org/fhir/spdx-license"))
  case ZLIB_ACKNOWLEDGEMENT extends SPDX_LICENSE("zlib-acknowledgement", Some("zlib/libpng License with Acknowledgement"), Some("http://hl7.org/fhir/spdx-license"))
  case ZOPE_PUBLIC_LICENSE_1_1 extends SPDX_LICENSE("ZPL-1.1", Some("Zope Public License 1.1"), Some("http://hl7.org/fhir/spdx-license"))
  case ZOPE_PUBLIC_LICENSE_2_0 extends SPDX_LICENSE("ZPL-2.0", Some("Zope Public License 2.0"), Some("http://hl7.org/fhir/spdx-license"))
  case ZOPE_PUBLIC_LICENSE_2_1 extends SPDX_LICENSE("ZPL-2.1", Some("Zope Public License 2.1"), Some("http://hl7.org/fhir/spdx-license"))
}
object SPDX_LICENSE extends EType[SPDX_LICENSE]("http://hl7.org/fhir/ValueSet/spdx-license") 


enum SPECIMEN_CONTAINED_PREFERENCE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ALTERNATE extends SPECIMEN_CONTAINED_PREFERENCE("alternate", Some("Alternate"), Some("http://hl7.org/fhir/specimen-contained-preference"))
  case PREFERRED extends SPECIMEN_CONTAINED_PREFERENCE("preferred", Some("Preferred"), Some("http://hl7.org/fhir/specimen-contained-preference"))
}
object SPECIMEN_CONTAINED_PREFERENCE extends EType[SPECIMEN_CONTAINED_PREFERENCE]("http://hl7.org/fhir/ValueSet/specimen-contained-preference") 


enum SPECIMEN_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case AVAILABLE extends SPECIMEN_STATUS("available", Some("Available"), Some("http://hl7.org/fhir/specimen-status"))
  case ENTERED_IN_ERROR extends SPECIMEN_STATUS("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/specimen-status"))
  case UNAVAILABLE extends SPECIMEN_STATUS("unavailable", Some("Unavailable"), Some("http://hl7.org/fhir/specimen-status"))
  case UNSATISFACTORY extends SPECIMEN_STATUS("unsatisfactory", Some("Unsatisfactory"), Some("http://hl7.org/fhir/specimen-status"))
}
object SPECIMEN_STATUS extends EType[SPECIMEN_STATUS]("http://hl7.org/fhir/ValueSet/specimen-status") 


enum STRAND_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case CRICK extends STRAND_TYPE("crick", Some("Crick strand of referenceSeq"), Some("http://hl7.org/fhir/strand-type"))
  case WATSON extends STRAND_TYPE("watson", Some("Watson strand of referenceSeq"), Some("http://hl7.org/fhir/strand-type"))
}
object STRAND_TYPE extends EType[STRAND_TYPE]("http://hl7.org/fhir/ValueSet/strand-type") 


enum STRUCTURE_DEFINITION_KIND(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case COMPLEX_DATA_TYPE extends STRUCTURE_DEFINITION_KIND("complex-type", Some("Complex Data Type"), Some("http://hl7.org/fhir/structure-definition-kind"))
  case LOGICAL extends STRUCTURE_DEFINITION_KIND("logical", Some("Logical"), Some("http://hl7.org/fhir/structure-definition-kind"))
  case PRIMITIVE_DATA_TYPE extends STRUCTURE_DEFINITION_KIND("primitive-type", Some("Primitive Data Type"), Some("http://hl7.org/fhir/structure-definition-kind"))
  case RESOURCE extends STRUCTURE_DEFINITION_KIND("resource", Some("Resource"), Some("http://hl7.org/fhir/structure-definition-kind"))
}
object STRUCTURE_DEFINITION_KIND extends EType[STRUCTURE_DEFINITION_KIND]("http://hl7.org/fhir/ValueSet/structure-definition-kind") 


enum SUBSCRIPTION_CHANNEL_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case EMAIL extends SUBSCRIPTION_CHANNEL_TYPE("email", Some("Email"), Some("http://hl7.org/fhir/subscription-channel-type"))
  case MESSAGE extends SUBSCRIPTION_CHANNEL_TYPE("message", Some("Message"), Some("http://hl7.org/fhir/subscription-channel-type"))
  case REST_HOOK extends SUBSCRIPTION_CHANNEL_TYPE("rest-hook", Some("Rest Hook"), Some("http://hl7.org/fhir/subscription-channel-type"))
  case SMS extends SUBSCRIPTION_CHANNEL_TYPE("sms", Some("SMS"), Some("http://hl7.org/fhir/subscription-channel-type"))
  case WEBSOCKET extends SUBSCRIPTION_CHANNEL_TYPE("websocket", Some("Websocket"), Some("http://hl7.org/fhir/subscription-channel-type"))
}
object SUBSCRIPTION_CHANNEL_TYPE extends EType[SUBSCRIPTION_CHANNEL_TYPE]("http://hl7.org/fhir/ValueSet/subscription-channel-type") 


enum SUBSCRIPTION_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ACTIVE extends SUBSCRIPTION_STATUS("active", Some("Active"), Some("http://hl7.org/fhir/subscription-status"))
  case ERROR extends SUBSCRIPTION_STATUS("error", Some("Error"), Some("http://hl7.org/fhir/subscription-status"))
  case OFF extends SUBSCRIPTION_STATUS("off", Some("Off"), Some("http://hl7.org/fhir/subscription-status"))
  case REQUESTED extends SUBSCRIPTION_STATUS("requested", Some("Requested"), Some("http://hl7.org/fhir/subscription-status"))
}
object SUBSCRIPTION_STATUS extends EType[SUBSCRIPTION_STATUS]("http://hl7.org/fhir/ValueSet/subscription-status") 


enum SUBSTANCE_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ACTIVE extends SUBSTANCE_STATUS("active", Some("Active"), Some("http://hl7.org/fhir/substance-status"))
  case ENTERED_IN_ERROR extends SUBSTANCE_STATUS("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/substance-status"))
  case INACTIVE extends SUBSTANCE_STATUS("inactive", Some("Inactive"), Some("http://hl7.org/fhir/substance-status"))
}
object SUBSTANCE_STATUS extends EType[SUBSTANCE_STATUS]("http://hl7.org/fhir/ValueSet/substance-status") 


enum SUPPLYDELIVERY_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ABANDONED extends SUPPLYDELIVERY_STATUS("abandoned", Some("Abandoned"), Some("http://hl7.org/fhir/supplydelivery-status"))
  case COMPLETED extends SUPPLYDELIVERY_STATUS("completed", Some("Delivered"), Some("http://hl7.org/fhir/supplydelivery-status"))
  case ENTERED_IN_ERROR extends SUPPLYDELIVERY_STATUS("entered-in-error", Some("Entered In Error"), Some("http://hl7.org/fhir/supplydelivery-status"))
  case IN_PROGRESS extends SUPPLYDELIVERY_STATUS("in-progress", Some("In Progress"), Some("http://hl7.org/fhir/supplydelivery-status"))
}
object SUPPLYDELIVERY_STATUS extends EType[SUPPLYDELIVERY_STATUS]("http://hl7.org/fhir/ValueSet/supplydelivery-status") 


enum SUPPLYREQUEST_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ACTIVE extends SUPPLYREQUEST_STATUS("active", Some("Active"), Some("http://hl7.org/fhir/supplyrequest-status"))
  case CANCELLED extends SUPPLYREQUEST_STATUS("cancelled", Some("Cancelled"), Some("http://hl7.org/fhir/supplyrequest-status"))
  case COMPLETED extends SUPPLYREQUEST_STATUS("completed", Some("Completed"), Some("http://hl7.org/fhir/supplyrequest-status"))
  case DRAFT extends SUPPLYREQUEST_STATUS("draft", Some("Draft"), Some("http://hl7.org/fhir/supplyrequest-status"))
  case ENTERED_IN_ERROR extends SUPPLYREQUEST_STATUS("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/supplyrequest-status"))
  case SUSPENDED extends SUPPLYREQUEST_STATUS("suspended", Some("Suspended"), Some("http://hl7.org/fhir/supplyrequest-status"))
  case UNKNOWN extends SUPPLYREQUEST_STATUS("unknown", Some("Unknown"), Some("http://hl7.org/fhir/supplyrequest-status"))
}
object SUPPLYREQUEST_STATUS extends EType[SUPPLYREQUEST_STATUS]("http://hl7.org/fhir/ValueSet/supplyrequest-status") 


enum SYSTEM_RESTFUL_INTERACTION(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case BATCH extends SYSTEM_RESTFUL_INTERACTION("batch", Some("batch"), Some("http://hl7.org/fhir/restful-interaction"))
  case HISTORY_SYSTEM extends SYSTEM_RESTFUL_INTERACTION("history-system", Some("history-system"), Some("http://hl7.org/fhir/restful-interaction"))
  case SEARCH_SYSTEM extends SYSTEM_RESTFUL_INTERACTION("search-system", Some("search-system"), Some("http://hl7.org/fhir/restful-interaction"))
  case TRANSACTION extends SYSTEM_RESTFUL_INTERACTION("transaction", Some("transaction"), Some("http://hl7.org/fhir/restful-interaction"))
}
object SYSTEM_RESTFUL_INTERACTION extends EType[SYSTEM_RESTFUL_INTERACTION]("http://hl7.org/fhir/ValueSet/system-restful-interaction") 


enum TASK_INTENT(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case FILLER_ORDER extends TASK_INTENT("filler-order", Some("filler-order"), Some("http://hl7.org/fhir/request-intent"))
  case INSTANCE_ORDER extends TASK_INTENT("instance-order", Some("instance-order"), Some("http://hl7.org/fhir/request-intent"))
  case OPTION extends TASK_INTENT("option", Some("option"), Some("http://hl7.org/fhir/request-intent"))
  case ORDER extends TASK_INTENT("order", Some("order"), Some("http://hl7.org/fhir/request-intent"))
  case ORIGINAL_ORDER extends TASK_INTENT("original-order", Some("original-order"), Some("http://hl7.org/fhir/request-intent"))
  case PLAN extends TASK_INTENT("plan", Some("plan"), Some("http://hl7.org/fhir/request-intent"))
  case PROPOSAL extends TASK_INTENT("proposal", Some("proposal"), Some("http://hl7.org/fhir/request-intent"))
  case REFLEX_ORDER extends TASK_INTENT("reflex-order", Some("reflex-order"), Some("http://hl7.org/fhir/request-intent"))
  case UNKNOWN extends TASK_INTENT("unknown", Some("Unknown"), Some("http://hl7.org/fhir/task-intent"))
}
object TASK_INTENT extends EType[TASK_INTENT]("http://hl7.org/fhir/ValueSet/task-intent") 


enum TASK_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ACCEPTED extends TASK_STATUS("accepted", Some("Accepted"), Some("http://hl7.org/fhir/task-status"))
  case CANCELLED extends TASK_STATUS("cancelled", Some("Cancelled"), Some("http://hl7.org/fhir/task-status"))
  case COMPLETED extends TASK_STATUS("completed", Some("Completed"), Some("http://hl7.org/fhir/task-status"))
  case DRAFT extends TASK_STATUS("draft", Some("Draft"), Some("http://hl7.org/fhir/task-status"))
  case ENTERED_IN_ERROR extends TASK_STATUS("entered-in-error", Some("Entered in Error"), Some("http://hl7.org/fhir/task-status"))
  case FAILED extends TASK_STATUS("failed", Some("Failed"), Some("http://hl7.org/fhir/task-status"))
  case IN_PROGRESS extends TASK_STATUS("in-progress", Some("In Progress"), Some("http://hl7.org/fhir/task-status"))
  case ON_HOLD extends TASK_STATUS("on-hold", Some("On Hold"), Some("http://hl7.org/fhir/task-status"))
  case READY extends TASK_STATUS("ready", Some("Ready"), Some("http://hl7.org/fhir/task-status"))
  case RECEIVED extends TASK_STATUS("received", Some("Received"), Some("http://hl7.org/fhir/task-status"))
  case REJECTED extends TASK_STATUS("rejected", Some("Rejected"), Some("http://hl7.org/fhir/task-status"))
  case REQUESTED extends TASK_STATUS("requested", Some("Requested"), Some("http://hl7.org/fhir/task-status"))
}
object TASK_STATUS extends EType[TASK_STATUS]("http://hl7.org/fhir/ValueSet/task-status") 


enum TYPE_DERIVATION_RULE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case CONSTRAINT extends TYPE_DERIVATION_RULE("constraint", Some("Constraint"), Some("http://hl7.org/fhir/type-derivation-rule"))
  case SPECIALIZATION extends TYPE_DERIVATION_RULE("specialization", Some("Specialization"), Some("http://hl7.org/fhir/type-derivation-rule"))
}
object TYPE_DERIVATION_RULE extends EType[TYPE_DERIVATION_RULE]("http://hl7.org/fhir/ValueSet/type-derivation-rule") 


enum TYPE_RESTFUL_INTERACTION(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case CREATE extends TYPE_RESTFUL_INTERACTION("create", Some("create"), Some("http://hl7.org/fhir/restful-interaction"))
  case DELETE extends TYPE_RESTFUL_INTERACTION("delete", Some("delete"), Some("http://hl7.org/fhir/restful-interaction"))
  case HISTORY_INSTANCE extends TYPE_RESTFUL_INTERACTION("history-instance", Some("history-instance"), Some("http://hl7.org/fhir/restful-interaction"))
  case HISTORY_TYPE extends TYPE_RESTFUL_INTERACTION("history-type", Some("history-type"), Some("http://hl7.org/fhir/restful-interaction"))
  case PATCH extends TYPE_RESTFUL_INTERACTION("patch", Some("patch"), Some("http://hl7.org/fhir/restful-interaction"))
  case READ extends TYPE_RESTFUL_INTERACTION("read", Some("read"), Some("http://hl7.org/fhir/restful-interaction"))
  case SEARCH_TYPE extends TYPE_RESTFUL_INTERACTION("search-type", Some("search-type"), Some("http://hl7.org/fhir/restful-interaction"))
  case UPDATE extends TYPE_RESTFUL_INTERACTION("update", Some("update"), Some("http://hl7.org/fhir/restful-interaction"))
  case VREAD extends TYPE_RESTFUL_INTERACTION("vread", Some("vread"), Some("http://hl7.org/fhir/restful-interaction"))
}
object TYPE_RESTFUL_INTERACTION extends EType[TYPE_RESTFUL_INTERACTION]("http://hl7.org/fhir/ValueSet/type-restful-interaction") 


enum UDI_ENTRY_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case BARCODE extends UDI_ENTRY_TYPE("barcode", Some("Barcode"), Some("http://hl7.org/fhir/udi-entry-type"))
  case CARD extends UDI_ENTRY_TYPE("card", Some("Card"), Some("http://hl7.org/fhir/udi-entry-type"))
  case MANUAL extends UDI_ENTRY_TYPE("manual", Some("Manual"), Some("http://hl7.org/fhir/udi-entry-type"))
  case RFID extends UDI_ENTRY_TYPE("rfid", Some("RFID"), Some("http://hl7.org/fhir/udi-entry-type"))
  case SELF_REPORTED extends UDI_ENTRY_TYPE("self-reported", Some("Self Reported"), Some("http://hl7.org/fhir/udi-entry-type"))
  case UNKNOWN extends UDI_ENTRY_TYPE("unknown", Some("Unknown"), Some("http://hl7.org/fhir/udi-entry-type"))
}
object UDI_ENTRY_TYPE extends EType[UDI_ENTRY_TYPE]("http://hl7.org/fhir/ValueSet/udi-entry-type") 


enum V3_CONFIDENTIALITYCLASSIFICATION(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case L extends V3_CONFIDENTIALITYCLASSIFICATION("L", Some("L"), Some("http://terminology.hl7.org/CodeSystem/v3-Confidentiality"))
  case M extends V3_CONFIDENTIALITYCLASSIFICATION("M", Some("M"), Some("http://terminology.hl7.org/CodeSystem/v3-Confidentiality"))
  case N extends V3_CONFIDENTIALITYCLASSIFICATION("N", Some("N"), Some("http://terminology.hl7.org/CodeSystem/v3-Confidentiality"))
  case R extends V3_CONFIDENTIALITYCLASSIFICATION("R", Some("R"), Some("http://terminology.hl7.org/CodeSystem/v3-Confidentiality"))
  case U extends V3_CONFIDENTIALITYCLASSIFICATION("U", Some("U"), Some("http://terminology.hl7.org/CodeSystem/v3-Confidentiality"))
  case V extends V3_CONFIDENTIALITYCLASSIFICATION("V", Some("V"), Some("http://terminology.hl7.org/CodeSystem/v3-Confidentiality"))
}
object V3_CONFIDENTIALITYCLASSIFICATION extends EType[V3_CONFIDENTIALITYCLASSIFICATION]("http://terminology.hl7.org/ValueSet/v3-ConfidentialityClassification") 


enum VARIABLE_TYPE(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case CONTINUOUS extends VARIABLE_TYPE("continuous", Some("Continuous"), Some("http://hl7.org/fhir/variable-type"))
  case DESCRIPTIVE extends VARIABLE_TYPE("descriptive", Some("Descriptive"), Some("http://hl7.org/fhir/variable-type"))
  case DICHOTOMOUS extends VARIABLE_TYPE("dichotomous", Some("Dichotomous"), Some("http://hl7.org/fhir/variable-type"))
}
object VARIABLE_TYPE extends EType[VARIABLE_TYPE]("http://hl7.org/fhir/ValueSet/variable-type") 


enum VERIFICATIONRESULT_STATUS(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case ATTESTED extends VERIFICATIONRESULT_STATUS("attested", Some("Attested"), Some("http://hl7.org/fhir/CodeSystem/status"))
  case IN_PROCESS extends VERIFICATIONRESULT_STATUS("in-process", Some("In process"), Some("http://hl7.org/fhir/CodeSystem/status"))
  case REQUIRES_REVALIDATION extends VERIFICATIONRESULT_STATUS("req-revalid", Some("Requires revalidation"), Some("http://hl7.org/fhir/CodeSystem/status"))
  case RE_VALIDATION_FAILED extends VERIFICATIONRESULT_STATUS("reval-fail", Some("Re-Validation failed"), Some("http://hl7.org/fhir/CodeSystem/status"))
  case VALIDATED extends VERIFICATIONRESULT_STATUS("validated", Some("Validated"), Some("http://hl7.org/fhir/CodeSystem/status"))
  case VALIDATION_FAILED extends VERIFICATIONRESULT_STATUS("val-fail", Some("Validation failed"), Some("http://hl7.org/fhir/CodeSystem/status"))
}
object VERIFICATIONRESULT_STATUS extends EType[VERIFICATIONRESULT_STATUS]("http://hl7.org/fhir/ValueSet/verificationresult-status") 


enum VERSIONING_POLICY(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case NO_VERSIONID_SUPPORT extends VERSIONING_POLICY("no-version", Some("No VersionId Support"), Some("http://hl7.org/fhir/versioning-policy"))
  case VERSIONED extends VERSIONING_POLICY("versioned", Some("Versioned"), Some("http://hl7.org/fhir/versioning-policy"))
  case VERSIONID_TRACKED_FULLY extends VERSIONING_POLICY("versioned-update", Some("VersionId tracked fully"), Some("http://hl7.org/fhir/versioning-policy"))
}
object VERSIONING_POLICY extends EType[VERSIONING_POLICY]("http://hl7.org/fhir/ValueSet/versioning-policy") 


enum VISION_BASE_CODES(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case DOWN extends VISION_BASE_CODES("down", Some("Down"), Some("http://hl7.org/fhir/vision-base-codes"))
  case IN extends VISION_BASE_CODES("in", Some("In"), Some("http://hl7.org/fhir/vision-base-codes"))
  case OUT extends VISION_BASE_CODES("out", Some("Out"), Some("http://hl7.org/fhir/vision-base-codes"))
  case UP extends VISION_BASE_CODES("up", Some("Up"), Some("http://hl7.org/fhir/vision-base-codes"))
}
object VISION_BASE_CODES extends EType[VISION_BASE_CODES]("http://hl7.org/fhir/ValueSet/vision-base-codes") 


enum VISION_EYE_CODES(val name: String, val display: Option[String], val system: Option[String]) extends ToCodingAble {
  case LEFT extends VISION_EYE_CODES("left", Some("Left Eye"), Some("http://hl7.org/fhir/vision-eye-codes"))
  case RIGHT extends VISION_EYE_CODES("right", Some("Right Eye"), Some("http://hl7.org/fhir/vision-eye-codes"))
}
object VISION_EYE_CODES extends EType[VISION_EYE_CODES]("http://hl7.org/fhir/ValueSet/vision-eye-codes") 

