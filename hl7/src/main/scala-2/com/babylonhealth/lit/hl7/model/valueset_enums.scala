package com.babylonhealth.lit.hl7

import enumeratum.{ CirceEnum, Enum, EnumEntry }

import com.babylonhealth.lit.core.model.Coding
import com.babylonhealth.lit.core.{ EnumeratumBase, FhirEnum, FhirCirceEnum, EnumWithFallback }

sealed abstract class ACCOUNT_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object ACCOUNT_STATUS extends FhirEnum[ACCOUNT_STATUS] with FhirCirceEnum[ACCOUNT_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/account-status"
  val values    = findValues
  case object ACTIVE extends ACCOUNT_STATUS("active") {
    def display: Option[String] = Some("Active")
    def system: Option[String]  = Some("http://hl7.org/fhir/account-status")
  }
  case object ENTERED_IN_ERROR extends ACCOUNT_STATUS("entered-in-error") {
    def display: Option[String] = Some("Entered in error")
    def system: Option[String]  = Some("http://hl7.org/fhir/account-status")
  }
  case object INACTIVE extends ACCOUNT_STATUS("inactive") {
    def display: Option[String] = Some("Inactive")
    def system: Option[String]  = Some("http://hl7.org/fhir/account-status")
  }
  case object ON_HOLD extends ACCOUNT_STATUS("on-hold") {
    def display: Option[String] = Some("On Hold")
    def system: Option[String]  = Some("http://hl7.org/fhir/account-status")
  }
  case object UNKNOWN extends ACCOUNT_STATUS("unknown") {
    def display: Option[String] = Some("Unknown")
    def system: Option[String]  = Some("http://hl7.org/fhir/account-status")
  }
}

sealed abstract class ACTION_CARDINALITY_BEHAVIOR(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object ACTION_CARDINALITY_BEHAVIOR
    extends FhirEnum[ACTION_CARDINALITY_BEHAVIOR]
    with FhirCirceEnum[ACTION_CARDINALITY_BEHAVIOR] {
  val reference = "http://hl7.org/fhir/ValueSet/action-cardinality-behavior"
  val values    = findValues
  case object MULTIPLE extends ACTION_CARDINALITY_BEHAVIOR("multiple") {
    def display: Option[String] = Some("Multiple")
    def system: Option[String]  = Some("http://hl7.org/fhir/action-cardinality-behavior")
  }
  case object SINGLE extends ACTION_CARDINALITY_BEHAVIOR("single") {
    def display: Option[String] = Some("Single")
    def system: Option[String]  = Some("http://hl7.org/fhir/action-cardinality-behavior")
  }
}

sealed abstract class ACTION_CONDITION_KIND(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object ACTION_CONDITION_KIND extends FhirEnum[ACTION_CONDITION_KIND] with FhirCirceEnum[ACTION_CONDITION_KIND] {
  val reference = "http://hl7.org/fhir/ValueSet/action-condition-kind"
  val values    = findValues
  case object APPLICABILITY extends ACTION_CONDITION_KIND("applicability") {
    def display: Option[String] = Some("Applicability")
    def system: Option[String]  = Some("http://hl7.org/fhir/action-condition-kind")
  }
  case object START extends ACTION_CONDITION_KIND("start") {
    def display: Option[String] = Some("Start")
    def system: Option[String]  = Some("http://hl7.org/fhir/action-condition-kind")
  }
  case object STOP extends ACTION_CONDITION_KIND("stop") {
    def display: Option[String] = Some("Stop")
    def system: Option[String]  = Some("http://hl7.org/fhir/action-condition-kind")
  }
}

sealed abstract class ACTION_GROUPING_BEHAVIOR(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object ACTION_GROUPING_BEHAVIOR
    extends FhirEnum[ACTION_GROUPING_BEHAVIOR]
    with FhirCirceEnum[ACTION_GROUPING_BEHAVIOR] {
  val reference = "http://hl7.org/fhir/ValueSet/action-grouping-behavior"
  val values    = findValues
  case object LOGICAL_GROUP extends ACTION_GROUPING_BEHAVIOR("logical-group") {
    def display: Option[String] = Some("Logical Group")
    def system: Option[String]  = Some("http://hl7.org/fhir/action-grouping-behavior")
  }
  case object SENTENCE_GROUP extends ACTION_GROUPING_BEHAVIOR("sentence-group") {
    def display: Option[String] = Some("Sentence Group")
    def system: Option[String]  = Some("http://hl7.org/fhir/action-grouping-behavior")
  }
  case object VISUAL_GROUP extends ACTION_GROUPING_BEHAVIOR("visual-group") {
    def display: Option[String] = Some("Visual Group")
    def system: Option[String]  = Some("http://hl7.org/fhir/action-grouping-behavior")
  }
}

sealed abstract class ACTION_PARTICIPANT_TYPE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object ACTION_PARTICIPANT_TYPE extends FhirEnum[ACTION_PARTICIPANT_TYPE] with FhirCirceEnum[ACTION_PARTICIPANT_TYPE] {
  val reference = "http://hl7.org/fhir/ValueSet/action-participant-type"
  val values    = findValues
  case object DEVICE extends ACTION_PARTICIPANT_TYPE("device") {
    def display: Option[String] = Some("Device")
    def system: Option[String]  = Some("http://hl7.org/fhir/action-participant-type")
  }
  case object PATIENT extends ACTION_PARTICIPANT_TYPE("patient") {
    def display: Option[String] = Some("Patient")
    def system: Option[String]  = Some("http://hl7.org/fhir/action-participant-type")
  }
  case object PRACTITIONER extends ACTION_PARTICIPANT_TYPE("practitioner") {
    def display: Option[String] = Some("Practitioner")
    def system: Option[String]  = Some("http://hl7.org/fhir/action-participant-type")
  }
  case object RELATED_PERSON extends ACTION_PARTICIPANT_TYPE("related-person") {
    def display: Option[String] = Some("Related Person")
    def system: Option[String]  = Some("http://hl7.org/fhir/action-participant-type")
  }
}

sealed abstract class ACTION_PRECHECK_BEHAVIOR(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object ACTION_PRECHECK_BEHAVIOR
    extends FhirEnum[ACTION_PRECHECK_BEHAVIOR]
    with FhirCirceEnum[ACTION_PRECHECK_BEHAVIOR] {
  val reference = "http://hl7.org/fhir/ValueSet/action-precheck-behavior"
  val values    = findValues
  case object NO extends ACTION_PRECHECK_BEHAVIOR("no") {
    def display: Option[String] = Some("No")
    def system: Option[String]  = Some("http://hl7.org/fhir/action-precheck-behavior")
  }
  case object YES extends ACTION_PRECHECK_BEHAVIOR("yes") {
    def display: Option[String] = Some("Yes")
    def system: Option[String]  = Some("http://hl7.org/fhir/action-precheck-behavior")
  }
}

sealed abstract class ACTION_RELATIONSHIP_TYPE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object ACTION_RELATIONSHIP_TYPE
    extends FhirEnum[ACTION_RELATIONSHIP_TYPE]
    with FhirCirceEnum[ACTION_RELATIONSHIP_TYPE] {
  val reference = "http://hl7.org/fhir/ValueSet/action-relationship-type"
  val values    = findValues
  case object AFTER extends ACTION_RELATIONSHIP_TYPE("after") {
    def display: Option[String] = Some("After")
    def system: Option[String]  = Some("http://hl7.org/fhir/action-relationship-type")
  }
  case object AFTER_END extends ACTION_RELATIONSHIP_TYPE("after-end") {
    def display: Option[String] = Some("After End")
    def system: Option[String]  = Some("http://hl7.org/fhir/action-relationship-type")
  }
  case object AFTER_START extends ACTION_RELATIONSHIP_TYPE("after-start") {
    def display: Option[String] = Some("After Start")
    def system: Option[String]  = Some("http://hl7.org/fhir/action-relationship-type")
  }
  case object BEFORE extends ACTION_RELATIONSHIP_TYPE("before") {
    def display: Option[String] = Some("Before")
    def system: Option[String]  = Some("http://hl7.org/fhir/action-relationship-type")
  }
  case object BEFORE_END extends ACTION_RELATIONSHIP_TYPE("before-end") {
    def display: Option[String] = Some("Before End")
    def system: Option[String]  = Some("http://hl7.org/fhir/action-relationship-type")
  }
  case object BEFORE_START extends ACTION_RELATIONSHIP_TYPE("before-start") {
    def display: Option[String] = Some("Before Start")
    def system: Option[String]  = Some("http://hl7.org/fhir/action-relationship-type")
  }
  case object CONCURRENT extends ACTION_RELATIONSHIP_TYPE("concurrent") {
    def display: Option[String] = Some("Concurrent")
    def system: Option[String]  = Some("http://hl7.org/fhir/action-relationship-type")
  }
  case object CONCURRENT_WITH_END extends ACTION_RELATIONSHIP_TYPE("concurrent-with-end") {
    def display: Option[String] = Some("Concurrent With End")
    def system: Option[String]  = Some("http://hl7.org/fhir/action-relationship-type")
  }
  case object CONCURRENT_WITH_START extends ACTION_RELATIONSHIP_TYPE("concurrent-with-start") {
    def display: Option[String] = Some("Concurrent With Start")
    def system: Option[String]  = Some("http://hl7.org/fhir/action-relationship-type")
  }
}

sealed abstract class ACTION_REQUIRED_BEHAVIOR(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object ACTION_REQUIRED_BEHAVIOR
    extends FhirEnum[ACTION_REQUIRED_BEHAVIOR]
    with FhirCirceEnum[ACTION_REQUIRED_BEHAVIOR] {
  val reference = "http://hl7.org/fhir/ValueSet/action-required-behavior"
  val values    = findValues
  case object COULD extends ACTION_REQUIRED_BEHAVIOR("could") {
    def display: Option[String] = Some("Could")
    def system: Option[String]  = Some("http://hl7.org/fhir/action-required-behavior")
  }
  case object MUST extends ACTION_REQUIRED_BEHAVIOR("must") {
    def display: Option[String] = Some("Must")
    def system: Option[String]  = Some("http://hl7.org/fhir/action-required-behavior")
  }
  case object MUST_UNLESS_DOCUMENTED extends ACTION_REQUIRED_BEHAVIOR("must-unless-documented") {
    def display: Option[String] = Some("Must Unless Documented")
    def system: Option[String]  = Some("http://hl7.org/fhir/action-required-behavior")
  }
}

sealed abstract class ACTION_SELECTION_BEHAVIOR(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object ACTION_SELECTION_BEHAVIOR
    extends FhirEnum[ACTION_SELECTION_BEHAVIOR]
    with FhirCirceEnum[ACTION_SELECTION_BEHAVIOR] {
  val reference = "http://hl7.org/fhir/ValueSet/action-selection-behavior"
  val values    = findValues
  case object ALL extends ACTION_SELECTION_BEHAVIOR("all") {
    def display: Option[String] = Some("All")
    def system: Option[String]  = Some("http://hl7.org/fhir/action-selection-behavior")
  }
  case object ALL_OR_NONE extends ACTION_SELECTION_BEHAVIOR("all-or-none") {
    def display: Option[String] = Some("All Or None")
    def system: Option[String]  = Some("http://hl7.org/fhir/action-selection-behavior")
  }
  case object ANY extends ACTION_SELECTION_BEHAVIOR("any") {
    def display: Option[String] = Some("Any")
    def system: Option[String]  = Some("http://hl7.org/fhir/action-selection-behavior")
  }
  case object AT_MOST_ONE extends ACTION_SELECTION_BEHAVIOR("at-most-one") {
    def display: Option[String] = Some("At Most One")
    def system: Option[String]  = Some("http://hl7.org/fhir/action-selection-behavior")
  }
  case object EXACTLY_ONE extends ACTION_SELECTION_BEHAVIOR("exactly-one") {
    def display: Option[String] = Some("Exactly One")
    def system: Option[String]  = Some("http://hl7.org/fhir/action-selection-behavior")
  }
  case object ONE_OR_MORE extends ACTION_SELECTION_BEHAVIOR("one-or-more") {
    def display: Option[String] = Some("One Or More")
    def system: Option[String]  = Some("http://hl7.org/fhir/action-selection-behavior")
  }
}

sealed abstract class ADMINISTRATIVE_GENDER(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object ADMINISTRATIVE_GENDER extends FhirEnum[ADMINISTRATIVE_GENDER] with FhirCirceEnum[ADMINISTRATIVE_GENDER] {
  val reference = "http://hl7.org/fhir/ValueSet/administrative-gender"
  val values    = findValues
  case object FEMALE extends ADMINISTRATIVE_GENDER("female") {
    def display: Option[String] = Some("Female")
    def system: Option[String]  = Some("http://hl7.org/fhir/administrative-gender")
  }
  case object MALE extends ADMINISTRATIVE_GENDER("male") {
    def display: Option[String] = Some("Male")
    def system: Option[String]  = Some("http://hl7.org/fhir/administrative-gender")
  }
  case object OTHER extends ADMINISTRATIVE_GENDER("other") {
    def display: Option[String] = Some("Other")
    def system: Option[String]  = Some("http://hl7.org/fhir/administrative-gender")
  }
  case object UNKNOWN extends ADMINISTRATIVE_GENDER("unknown") {
    def display: Option[String] = Some("Unknown")
    def system: Option[String]  = Some("http://hl7.org/fhir/administrative-gender")
  }
}

sealed abstract class ADVERSE_EVENT_ACTUALITY(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object ADVERSE_EVENT_ACTUALITY extends FhirEnum[ADVERSE_EVENT_ACTUALITY] with FhirCirceEnum[ADVERSE_EVENT_ACTUALITY] {
  val reference = "http://hl7.org/fhir/ValueSet/adverse-event-actuality"
  val values    = findValues
  case object ACTUAL extends ADVERSE_EVENT_ACTUALITY("actual") {
    def display: Option[String] = Some("Adverse Event")
    def system: Option[String]  = Some("http://hl7.org/fhir/adverse-event-actuality")
  }
  case object POTENTIAL extends ADVERSE_EVENT_ACTUALITY("potential") {
    def display: Option[String] = Some("Potential Adverse Event")
    def system: Option[String]  = Some("http://hl7.org/fhir/adverse-event-actuality")
  }
}

sealed abstract class ALLERGY_INTOLERANCE_CATEGORY(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object ALLERGY_INTOLERANCE_CATEGORY
    extends FhirEnum[ALLERGY_INTOLERANCE_CATEGORY]
    with FhirCirceEnum[ALLERGY_INTOLERANCE_CATEGORY] {
  val reference = "http://hl7.org/fhir/ValueSet/allergy-intolerance-category"
  val values    = findValues
  case object BIOLOGIC extends ALLERGY_INTOLERANCE_CATEGORY("biologic") {
    def display: Option[String] = Some("Biologic")
    def system: Option[String]  = Some("http://hl7.org/fhir/allergy-intolerance-category")
  }
  case object ENVIRONMENT extends ALLERGY_INTOLERANCE_CATEGORY("environment") {
    def display: Option[String] = Some("Environment")
    def system: Option[String]  = Some("http://hl7.org/fhir/allergy-intolerance-category")
  }
  case object FOOD extends ALLERGY_INTOLERANCE_CATEGORY("food") {
    def display: Option[String] = Some("Food")
    def system: Option[String]  = Some("http://hl7.org/fhir/allergy-intolerance-category")
  }
  case object MEDICATION extends ALLERGY_INTOLERANCE_CATEGORY("medication") {
    def display: Option[String] = Some("Medication")
    def system: Option[String]  = Some("http://hl7.org/fhir/allergy-intolerance-category")
  }
}

sealed abstract class ALLERGY_INTOLERANCE_CRITICALITY(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object ALLERGY_INTOLERANCE_CRITICALITY
    extends FhirEnum[ALLERGY_INTOLERANCE_CRITICALITY]
    with FhirCirceEnum[ALLERGY_INTOLERANCE_CRITICALITY] {
  val reference = "http://hl7.org/fhir/ValueSet/allergy-intolerance-criticality"
  val values    = findValues
  case object HIGH extends ALLERGY_INTOLERANCE_CRITICALITY("high") {
    def display: Option[String] = Some("High Risk")
    def system: Option[String]  = Some("http://hl7.org/fhir/allergy-intolerance-criticality")
  }
  case object LOW extends ALLERGY_INTOLERANCE_CRITICALITY("low") {
    def display: Option[String] = Some("Low Risk")
    def system: Option[String]  = Some("http://hl7.org/fhir/allergy-intolerance-criticality")
  }
  case object UNABLE_TO_ASSESS_RISK extends ALLERGY_INTOLERANCE_CRITICALITY("unable-to-assess") {
    def display: Option[String] = Some("Unable to Assess Risk")
    def system: Option[String]  = Some("http://hl7.org/fhir/allergy-intolerance-criticality")
  }
}

sealed abstract class ALLERGY_INTOLERANCE_TYPE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object ALLERGY_INTOLERANCE_TYPE
    extends FhirEnum[ALLERGY_INTOLERANCE_TYPE]
    with FhirCirceEnum[ALLERGY_INTOLERANCE_TYPE] {
  val reference = "http://hl7.org/fhir/ValueSet/allergy-intolerance-type"
  val values    = findValues
  case object ALLERGY extends ALLERGY_INTOLERANCE_TYPE("allergy") {
    def display: Option[String] = Some("Allergy")
    def system: Option[String]  = Some("http://hl7.org/fhir/allergy-intolerance-type")
  }
  case object INTOLERANCE extends ALLERGY_INTOLERANCE_TYPE("intolerance") {
    def display: Option[String] = Some("Intolerance")
    def system: Option[String]  = Some("http://hl7.org/fhir/allergy-intolerance-type")
  }
}

sealed abstract class APPOINTMENTSTATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object APPOINTMENTSTATUS extends FhirEnum[APPOINTMENTSTATUS] with FhirCirceEnum[APPOINTMENTSTATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/appointmentstatus"
  val values    = findValues
  case object ARRIVED extends APPOINTMENTSTATUS("arrived") {
    def display: Option[String] = Some("Arrived")
    def system: Option[String]  = Some("http://hl7.org/fhir/appointmentstatus")
  }
  case object BOOKED extends APPOINTMENTSTATUS("booked") {
    def display: Option[String] = Some("Booked")
    def system: Option[String]  = Some("http://hl7.org/fhir/appointmentstatus")
  }
  case object CANCELLED extends APPOINTMENTSTATUS("cancelled") {
    def display: Option[String] = Some("Cancelled")
    def system: Option[String]  = Some("http://hl7.org/fhir/appointmentstatus")
  }
  case object CHECKED_IN extends APPOINTMENTSTATUS("checked-in") {
    def display: Option[String] = Some("Checked In")
    def system: Option[String]  = Some("http://hl7.org/fhir/appointmentstatus")
  }
  case object ENTERED_IN_ERROR extends APPOINTMENTSTATUS("entered-in-error") {
    def display: Option[String] = Some("Entered in error")
    def system: Option[String]  = Some("http://hl7.org/fhir/appointmentstatus")
  }
  case object FULFILLED extends APPOINTMENTSTATUS("fulfilled") {
    def display: Option[String] = Some("Fulfilled")
    def system: Option[String]  = Some("http://hl7.org/fhir/appointmentstatus")
  }
  case object NOSHOW extends APPOINTMENTSTATUS("noshow") {
    def display: Option[String] = Some("No Show")
    def system: Option[String]  = Some("http://hl7.org/fhir/appointmentstatus")
  }
  case object PENDING extends APPOINTMENTSTATUS("pending") {
    def display: Option[String] = Some("Pending")
    def system: Option[String]  = Some("http://hl7.org/fhir/appointmentstatus")
  }
  case object PROPOSED extends APPOINTMENTSTATUS("proposed") {
    def display: Option[String] = Some("Proposed")
    def system: Option[String]  = Some("http://hl7.org/fhir/appointmentstatus")
  }
  case object WAITLIST extends APPOINTMENTSTATUS("waitlist") {
    def display: Option[String] = Some("Waitlisted")
    def system: Option[String]  = Some("http://hl7.org/fhir/appointmentstatus")
  }
}

sealed abstract class ASSERT_DIRECTION_CODES(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object ASSERT_DIRECTION_CODES extends FhirEnum[ASSERT_DIRECTION_CODES] with FhirCirceEnum[ASSERT_DIRECTION_CODES] {
  val reference = "http://hl7.org/fhir/ValueSet/assert-direction-codes"
  val values    = findValues
  case object REQUEST extends ASSERT_DIRECTION_CODES("request") {
    def display: Option[String] = Some("request")
    def system: Option[String]  = Some("http://hl7.org/fhir/assert-direction-codes")
  }
  case object RESPONSE extends ASSERT_DIRECTION_CODES("response") {
    def display: Option[String] = Some("response")
    def system: Option[String]  = Some("http://hl7.org/fhir/assert-direction-codes")
  }
}

sealed abstract class ASSERT_OPERATOR_CODES(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object ASSERT_OPERATOR_CODES extends FhirEnum[ASSERT_OPERATOR_CODES] with FhirCirceEnum[ASSERT_OPERATOR_CODES] {
  val reference = "http://hl7.org/fhir/ValueSet/assert-operator-codes"
  val values    = findValues
  case object CONTAINS extends ASSERT_OPERATOR_CODES("contains") {
    def display: Option[String] = Some("contains")
    def system: Option[String]  = Some("http://hl7.org/fhir/assert-operator-codes")
  }
  case object EMPTY extends ASSERT_OPERATOR_CODES("empty") {
    def display: Option[String] = Some("empty")
    def system: Option[String]  = Some("http://hl7.org/fhir/assert-operator-codes")
  }
  case object EQUALS extends ASSERT_OPERATOR_CODES("equals") {
    def display: Option[String] = Some("equals")
    def system: Option[String]  = Some("http://hl7.org/fhir/assert-operator-codes")
  }
  case object EVAL extends ASSERT_OPERATOR_CODES("eval") {
    def display: Option[String] = Some("evaluate")
    def system: Option[String]  = Some("http://hl7.org/fhir/assert-operator-codes")
  }
  case object GREATERTHAN extends ASSERT_OPERATOR_CODES("greaterThan") {
    def display: Option[String] = Some("greaterThan")
    def system: Option[String]  = Some("http://hl7.org/fhir/assert-operator-codes")
  }
  case object IN extends ASSERT_OPERATOR_CODES("in") {
    def display: Option[String] = Some("in")
    def system: Option[String]  = Some("http://hl7.org/fhir/assert-operator-codes")
  }
  case object LESSTHAN extends ASSERT_OPERATOR_CODES("lessThan") {
    def display: Option[String] = Some("lessThan")
    def system: Option[String]  = Some("http://hl7.org/fhir/assert-operator-codes")
  }
  case object NOTCONTAINS extends ASSERT_OPERATOR_CODES("notContains") {
    def display: Option[String] = Some("notContains")
    def system: Option[String]  = Some("http://hl7.org/fhir/assert-operator-codes")
  }
  case object NOTEMPTY extends ASSERT_OPERATOR_CODES("notEmpty") {
    def display: Option[String] = Some("notEmpty")
    def system: Option[String]  = Some("http://hl7.org/fhir/assert-operator-codes")
  }
  case object NOTEQUALS extends ASSERT_OPERATOR_CODES("notEquals") {
    def display: Option[String] = Some("notEquals")
    def system: Option[String]  = Some("http://hl7.org/fhir/assert-operator-codes")
  }
  case object NOTIN extends ASSERT_OPERATOR_CODES("notIn") {
    def display: Option[String] = Some("notIn")
    def system: Option[String]  = Some("http://hl7.org/fhir/assert-operator-codes")
  }
}

sealed abstract class ASSERT_RESPONSE_CODE_TYPES(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object ASSERT_RESPONSE_CODE_TYPES
    extends FhirEnum[ASSERT_RESPONSE_CODE_TYPES]
    with FhirCirceEnum[ASSERT_RESPONSE_CODE_TYPES] {
  val reference = "http://hl7.org/fhir/ValueSet/assert-response-code-types"
  val values    = findValues
  case object BAD extends ASSERT_RESPONSE_CODE_TYPES("bad") {
    def display: Option[String] = Some("bad")
    def system: Option[String]  = Some("http://hl7.org/fhir/assert-response-code-types")
  }
  case object CONFLICT extends ASSERT_RESPONSE_CODE_TYPES("conflict") {
    def display: Option[String] = Some("conflict")
    def system: Option[String]  = Some("http://hl7.org/fhir/assert-response-code-types")
  }
  case object CREATED extends ASSERT_RESPONSE_CODE_TYPES("created") {
    def display: Option[String] = Some("created")
    def system: Option[String]  = Some("http://hl7.org/fhir/assert-response-code-types")
  }
  case object FORBIDDEN extends ASSERT_RESPONSE_CODE_TYPES("forbidden") {
    def display: Option[String] = Some("forbidden")
    def system: Option[String]  = Some("http://hl7.org/fhir/assert-response-code-types")
  }
  case object GONE extends ASSERT_RESPONSE_CODE_TYPES("gone") {
    def display: Option[String] = Some("gone")
    def system: Option[String]  = Some("http://hl7.org/fhir/assert-response-code-types")
  }
  case object METHODNOTALLOWED extends ASSERT_RESPONSE_CODE_TYPES("methodNotAllowed") {
    def display: Option[String] = Some("methodNotAllowed")
    def system: Option[String]  = Some("http://hl7.org/fhir/assert-response-code-types")
  }
  case object NOCONTENT extends ASSERT_RESPONSE_CODE_TYPES("noContent") {
    def display: Option[String] = Some("noContent")
    def system: Option[String]  = Some("http://hl7.org/fhir/assert-response-code-types")
  }
  case object NOTFOUND extends ASSERT_RESPONSE_CODE_TYPES("notFound") {
    def display: Option[String] = Some("notFound")
    def system: Option[String]  = Some("http://hl7.org/fhir/assert-response-code-types")
  }
  case object NOTMODIFIED extends ASSERT_RESPONSE_CODE_TYPES("notModified") {
    def display: Option[String] = Some("notModified")
    def system: Option[String]  = Some("http://hl7.org/fhir/assert-response-code-types")
  }
  case object OKAY extends ASSERT_RESPONSE_CODE_TYPES("okay") {
    def display: Option[String] = Some("okay")
    def system: Option[String]  = Some("http://hl7.org/fhir/assert-response-code-types")
  }
  case object PRECONDITIONFAILED extends ASSERT_RESPONSE_CODE_TYPES("preconditionFailed") {
    def display: Option[String] = Some("preconditionFailed")
    def system: Option[String]  = Some("http://hl7.org/fhir/assert-response-code-types")
  }
  case object UNPROCESSABLE extends ASSERT_RESPONSE_CODE_TYPES("unprocessable") {
    def display: Option[String] = Some("unprocessable")
    def system: Option[String]  = Some("http://hl7.org/fhir/assert-response-code-types")
  }
}

sealed abstract class AUDIT_EVENT_ACTION(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object AUDIT_EVENT_ACTION extends FhirEnum[AUDIT_EVENT_ACTION] with FhirCirceEnum[AUDIT_EVENT_ACTION] {
  val reference = "http://hl7.org/fhir/ValueSet/audit-event-action"
  val values    = findValues
  case object C extends AUDIT_EVENT_ACTION("C") {
    def display: Option[String] = Some("Create")
    def system: Option[String]  = Some("http://hl7.org/fhir/audit-event-action")
  }
  case object D extends AUDIT_EVENT_ACTION("D") {
    def display: Option[String] = Some("Delete")
    def system: Option[String]  = Some("http://hl7.org/fhir/audit-event-action")
  }
  case object E extends AUDIT_EVENT_ACTION("E") {
    def display: Option[String] = Some("Execute")
    def system: Option[String]  = Some("http://hl7.org/fhir/audit-event-action")
  }
  case object R extends AUDIT_EVENT_ACTION("R") {
    def display: Option[String] = Some("Read/View/Print")
    def system: Option[String]  = Some("http://hl7.org/fhir/audit-event-action")
  }
  case object U extends AUDIT_EVENT_ACTION("U") {
    def display: Option[String] = Some("Update")
    def system: Option[String]  = Some("http://hl7.org/fhir/audit-event-action")
  }
}

sealed abstract class AUDIT_EVENT_OUTCOME(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object AUDIT_EVENT_OUTCOME extends FhirEnum[AUDIT_EVENT_OUTCOME] with FhirCirceEnum[AUDIT_EVENT_OUTCOME] {
  val reference = "http://hl7.org/fhir/ValueSet/audit-event-outcome"
  val values    = findValues
  case object MAJOR_FAILURE extends AUDIT_EVENT_OUTCOME("12") {
    def display: Option[String] = Some("Major failure")
    def system: Option[String]  = Some("http://hl7.org/fhir/audit-event-outcome")
  }
  case object MINOR_FAILURE extends AUDIT_EVENT_OUTCOME("4") {
    def display: Option[String] = Some("Minor failure")
    def system: Option[String]  = Some("http://hl7.org/fhir/audit-event-outcome")
  }
  case object SERIOUS_FAILURE extends AUDIT_EVENT_OUTCOME("8") {
    def display: Option[String] = Some("Serious failure")
    def system: Option[String]  = Some("http://hl7.org/fhir/audit-event-outcome")
  }
  case object SUCCESS extends AUDIT_EVENT_OUTCOME("0") {
    def display: Option[String] = Some("Success")
    def system: Option[String]  = Some("http://hl7.org/fhir/audit-event-outcome")
  }
}

sealed abstract class BINDING_STRENGTH(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object BINDING_STRENGTH extends FhirEnum[BINDING_STRENGTH] with FhirCirceEnum[BINDING_STRENGTH] {
  val reference = "http://hl7.org/fhir/ValueSet/binding-strength"
  val values    = findValues
  case object EXAMPLE extends BINDING_STRENGTH("example") {
    def display: Option[String] = Some("Example")
    def system: Option[String]  = Some("http://hl7.org/fhir/binding-strength")
  }
  case object EXTENSIBLE extends BINDING_STRENGTH("extensible") {
    def display: Option[String] = Some("Extensible")
    def system: Option[String]  = Some("http://hl7.org/fhir/binding-strength")
  }
  case object PREFERRED extends BINDING_STRENGTH("preferred") {
    def display: Option[String] = Some("Preferred")
    def system: Option[String]  = Some("http://hl7.org/fhir/binding-strength")
  }
  case object REQUIRED extends BINDING_STRENGTH("required") {
    def display: Option[String] = Some("Required")
    def system: Option[String]  = Some("http://hl7.org/fhir/binding-strength")
  }
}

sealed abstract class BUNDLE_TYPE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object BUNDLE_TYPE extends FhirEnum[BUNDLE_TYPE] with FhirCirceEnum[BUNDLE_TYPE] {
  val reference = "http://hl7.org/fhir/ValueSet/bundle-type"
  val values    = findValues
  case object BATCH extends BUNDLE_TYPE("batch") {
    def display: Option[String] = Some("Batch")
    def system: Option[String]  = Some("http://hl7.org/fhir/bundle-type")
  }
  case object BATCH_RESPONSE extends BUNDLE_TYPE("batch-response") {
    def display: Option[String] = Some("Batch Response")
    def system: Option[String]  = Some("http://hl7.org/fhir/bundle-type")
  }
  case object COLLECTION extends BUNDLE_TYPE("collection") {
    def display: Option[String] = Some("Collection")
    def system: Option[String]  = Some("http://hl7.org/fhir/bundle-type")
  }
  case object DOCUMENT extends BUNDLE_TYPE("document") {
    def display: Option[String] = Some("Document")
    def system: Option[String]  = Some("http://hl7.org/fhir/bundle-type")
  }
  case object HISTORY extends BUNDLE_TYPE("history") {
    def display: Option[String] = Some("History List")
    def system: Option[String]  = Some("http://hl7.org/fhir/bundle-type")
  }
  case object MESSAGE extends BUNDLE_TYPE("message") {
    def display: Option[String] = Some("Message")
    def system: Option[String]  = Some("http://hl7.org/fhir/bundle-type")
  }
  case object SEARCHSET extends BUNDLE_TYPE("searchset") {
    def display: Option[String] = Some("Search Results")
    def system: Option[String]  = Some("http://hl7.org/fhir/bundle-type")
  }
  case object TRANSACTION extends BUNDLE_TYPE("transaction") {
    def display: Option[String] = Some("Transaction")
    def system: Option[String]  = Some("http://hl7.org/fhir/bundle-type")
  }
  case object TRANSACTION_RESPONSE extends BUNDLE_TYPE("transaction-response") {
    def display: Option[String] = Some("Transaction Response")
    def system: Option[String]  = Some("http://hl7.org/fhir/bundle-type")
  }
}

sealed abstract class CAPABILITY_STATEMENT_KIND(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object CAPABILITY_STATEMENT_KIND
    extends FhirEnum[CAPABILITY_STATEMENT_KIND]
    with FhirCirceEnum[CAPABILITY_STATEMENT_KIND] {
  val reference = "http://hl7.org/fhir/ValueSet/capability-statement-kind"
  val values    = findValues
  case object CAPABILITY extends CAPABILITY_STATEMENT_KIND("capability") {
    def display: Option[String] = Some("Capability")
    def system: Option[String]  = Some("http://hl7.org/fhir/capability-statement-kind")
  }
  case object INSTANCE extends CAPABILITY_STATEMENT_KIND("instance") {
    def display: Option[String] = Some("Instance")
    def system: Option[String]  = Some("http://hl7.org/fhir/capability-statement-kind")
  }
  case object REQUIREMENTS extends CAPABILITY_STATEMENT_KIND("requirements") {
    def display: Option[String] = Some("Requirements")
    def system: Option[String]  = Some("http://hl7.org/fhir/capability-statement-kind")
  }
}

sealed abstract class CARE_PLAN_ACTIVITY_KIND(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object CARE_PLAN_ACTIVITY_KIND extends FhirEnum[CARE_PLAN_ACTIVITY_KIND] with FhirCirceEnum[CARE_PLAN_ACTIVITY_KIND] {
  val reference = "http://hl7.org/fhir/ValueSet/care-plan-activity-kind"
  val values    = findValues
  case object APPOINTMENT extends CARE_PLAN_ACTIVITY_KIND("Appointment") {
    def display: Option[String] = Some("Appointment")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object COMMUNICATIONREQUEST extends CARE_PLAN_ACTIVITY_KIND("CommunicationRequest") {
    def display: Option[String] = Some("CommunicationRequest")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object DEVICEREQUEST extends CARE_PLAN_ACTIVITY_KIND("DeviceRequest") {
    def display: Option[String] = Some("DeviceRequest")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICATIONREQUEST extends CARE_PLAN_ACTIVITY_KIND("MedicationRequest") {
    def display: Option[String] = Some("MedicationRequest")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object NUTRITIONORDER extends CARE_PLAN_ACTIVITY_KIND("NutritionOrder") {
    def display: Option[String] = Some("NutritionOrder")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SERVICEREQUEST extends CARE_PLAN_ACTIVITY_KIND("ServiceRequest") {
    def display: Option[String] = Some("ServiceRequest")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object TASK extends CARE_PLAN_ACTIVITY_KIND("Task") {
    def display: Option[String] = Some("Task")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object VISIONPRESCRIPTION extends CARE_PLAN_ACTIVITY_KIND("VisionPrescription") {
    def display: Option[String] = Some("VisionPrescription")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
}

sealed abstract class CARE_PLAN_ACTIVITY_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object CARE_PLAN_ACTIVITY_STATUS
    extends FhirEnum[CARE_PLAN_ACTIVITY_STATUS]
    with FhirCirceEnum[CARE_PLAN_ACTIVITY_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/care-plan-activity-status"
  val values    = findValues
  case object CANCELLED extends CARE_PLAN_ACTIVITY_STATUS("cancelled") {
    def display: Option[String] = Some("Cancelled")
    def system: Option[String]  = Some("http://hl7.org/fhir/care-plan-activity-status")
  }
  case object COMPLETED extends CARE_PLAN_ACTIVITY_STATUS("completed") {
    def display: Option[String] = Some("Completed")
    def system: Option[String]  = Some("http://hl7.org/fhir/care-plan-activity-status")
  }
  case object ENTERED_IN_ERROR extends CARE_PLAN_ACTIVITY_STATUS("entered-in-error") {
    def display: Option[String] = Some("Entered in Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/care-plan-activity-status")
  }
  case object IN_PROGRESS extends CARE_PLAN_ACTIVITY_STATUS("in-progress") {
    def display: Option[String] = Some("In Progress")
    def system: Option[String]  = Some("http://hl7.org/fhir/care-plan-activity-status")
  }
  case object NOT_STARTED extends CARE_PLAN_ACTIVITY_STATUS("not-started") {
    def display: Option[String] = Some("Not Started")
    def system: Option[String]  = Some("http://hl7.org/fhir/care-plan-activity-status")
  }
  case object ON_HOLD extends CARE_PLAN_ACTIVITY_STATUS("on-hold") {
    def display: Option[String] = Some("On Hold")
    def system: Option[String]  = Some("http://hl7.org/fhir/care-plan-activity-status")
  }
  case object SCHEDULED extends CARE_PLAN_ACTIVITY_STATUS("scheduled") {
    def display: Option[String] = Some("Scheduled")
    def system: Option[String]  = Some("http://hl7.org/fhir/care-plan-activity-status")
  }
  case object STOPPED extends CARE_PLAN_ACTIVITY_STATUS("stopped") {
    def display: Option[String] = Some("Stopped")
    def system: Option[String]  = Some("http://hl7.org/fhir/care-plan-activity-status")
  }
  case object UNKNOWN extends CARE_PLAN_ACTIVITY_STATUS("unknown") {
    def display: Option[String] = Some("Unknown")
    def system: Option[String]  = Some("http://hl7.org/fhir/care-plan-activity-status")
  }
}

sealed abstract class CARE_PLAN_INTENT(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object CARE_PLAN_INTENT extends FhirEnum[CARE_PLAN_INTENT] with FhirCirceEnum[CARE_PLAN_INTENT] {
  val reference = "http://hl7.org/fhir/ValueSet/care-plan-intent"
  val values    = findValues
  case object OPTION extends CARE_PLAN_INTENT("option") {
    def display: Option[String] = Some("option")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-intent")
  }
  case object ORDER extends CARE_PLAN_INTENT("order") {
    def display: Option[String] = Some("order")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-intent")
  }
  case object PLAN extends CARE_PLAN_INTENT("plan") {
    def display: Option[String] = Some("plan")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-intent")
  }
  case object PROPOSAL extends CARE_PLAN_INTENT("proposal") {
    def display: Option[String] = Some("proposal")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-intent")
  }
}

sealed abstract class CARE_TEAM_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object CARE_TEAM_STATUS extends FhirEnum[CARE_TEAM_STATUS] with FhirCirceEnum[CARE_TEAM_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/care-team-status"
  val values    = findValues
  case object ACTIVE extends CARE_TEAM_STATUS("active") {
    def display: Option[String] = Some("Active")
    def system: Option[String]  = Some("http://hl7.org/fhir/care-team-status")
  }
  case object ENTERED_IN_ERROR extends CARE_TEAM_STATUS("entered-in-error") {
    def display: Option[String] = Some("Entered in Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/care-team-status")
  }
  case object INACTIVE extends CARE_TEAM_STATUS("inactive") {
    def display: Option[String] = Some("Inactive")
    def system: Option[String]  = Some("http://hl7.org/fhir/care-team-status")
  }
  case object PROPOSED extends CARE_TEAM_STATUS("proposed") {
    def display: Option[String] = Some("Proposed")
    def system: Option[String]  = Some("http://hl7.org/fhir/care-team-status")
  }
  case object SUSPENDED extends CARE_TEAM_STATUS("suspended") {
    def display: Option[String] = Some("Suspended")
    def system: Option[String]  = Some("http://hl7.org/fhir/care-team-status")
  }
}

sealed abstract class CHARGEITEM_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object CHARGEITEM_STATUS extends FhirEnum[CHARGEITEM_STATUS] with FhirCirceEnum[CHARGEITEM_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/chargeitem-status"
  val values    = findValues
  case object ABORTED extends CHARGEITEM_STATUS("aborted") {
    def display: Option[String] = Some("Aborted")
    def system: Option[String]  = Some("http://hl7.org/fhir/chargeitem-status")
  }
  case object BILLABLE extends CHARGEITEM_STATUS("billable") {
    def display: Option[String] = Some("Billable")
    def system: Option[String]  = Some("http://hl7.org/fhir/chargeitem-status")
  }
  case object BILLED extends CHARGEITEM_STATUS("billed") {
    def display: Option[String] = Some("Billed")
    def system: Option[String]  = Some("http://hl7.org/fhir/chargeitem-status")
  }
  case object ENTERED_IN_ERROR extends CHARGEITEM_STATUS("entered-in-error") {
    def display: Option[String] = Some("Entered in Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/chargeitem-status")
  }
  case object NOT_BILLABLE extends CHARGEITEM_STATUS("not-billable") {
    def display: Option[String] = Some("Not billable")
    def system: Option[String]  = Some("http://hl7.org/fhir/chargeitem-status")
  }
  case object PLANNED extends CHARGEITEM_STATUS("planned") {
    def display: Option[String] = Some("Planned")
    def system: Option[String]  = Some("http://hl7.org/fhir/chargeitem-status")
  }
  case object UNKNOWN extends CHARGEITEM_STATUS("unknown") {
    def display: Option[String] = Some("Unknown")
    def system: Option[String]  = Some("http://hl7.org/fhir/chargeitem-status")
  }
}

sealed abstract class CLAIM_USE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object CLAIM_USE extends FhirEnum[CLAIM_USE] with FhirCirceEnum[CLAIM_USE] {
  val reference = "http://hl7.org/fhir/ValueSet/claim-use"
  val values    = findValues
  case object CLAIM extends CLAIM_USE("claim") {
    def display: Option[String] = Some("Claim")
    def system: Option[String]  = Some("http://hl7.org/fhir/claim-use")
  }
  case object PREAUTHORIZATION extends CLAIM_USE("preauthorization") {
    def display: Option[String] = Some("Preauthorization")
    def system: Option[String]  = Some("http://hl7.org/fhir/claim-use")
  }
  case object PREDETERMINATION extends CLAIM_USE("predetermination") {
    def display: Option[String] = Some("Predetermination")
    def system: Option[String]  = Some("http://hl7.org/fhir/claim-use")
  }
}

sealed abstract class CLINICALIMPRESSION_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object CLINICALIMPRESSION_STATUS
    extends FhirEnum[CLINICALIMPRESSION_STATUS]
    with FhirCirceEnum[CLINICALIMPRESSION_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/clinicalimpression-status"
  val values    = findValues
  case object COMPLETED extends CLINICALIMPRESSION_STATUS("completed") {
    def display: Option[String] = Some("completed")
    def system: Option[String]  = Some("http://hl7.org/fhir/event-status")
  }
  case object ENTERED_IN_ERROR extends CLINICALIMPRESSION_STATUS("entered-in-error") {
    def display: Option[String] = Some("entered-in-error")
    def system: Option[String]  = Some("http://hl7.org/fhir/event-status")
  }
  case object IN_PROGRESS extends CLINICALIMPRESSION_STATUS("in-progress") {
    def display: Option[String] = Some("in-progress")
    def system: Option[String]  = Some("http://hl7.org/fhir/event-status")
  }
}

sealed abstract class CODESYSTEM_CONTENT_MODE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object CODESYSTEM_CONTENT_MODE extends FhirEnum[CODESYSTEM_CONTENT_MODE] with FhirCirceEnum[CODESYSTEM_CONTENT_MODE] {
  val reference = "http://hl7.org/fhir/ValueSet/codesystem-content-mode"
  val values    = findValues
  case object COMPLETE extends CODESYSTEM_CONTENT_MODE("complete") {
    def display: Option[String] = Some("Complete")
    def system: Option[String]  = Some("http://hl7.org/fhir/codesystem-content-mode")
  }
  case object EXAMPLE extends CODESYSTEM_CONTENT_MODE("example") {
    def display: Option[String] = Some("Example")
    def system: Option[String]  = Some("http://hl7.org/fhir/codesystem-content-mode")
  }
  case object FRAGMENT extends CODESYSTEM_CONTENT_MODE("fragment") {
    def display: Option[String] = Some("Fragment")
    def system: Option[String]  = Some("http://hl7.org/fhir/codesystem-content-mode")
  }
  case object NOT_PRESENT extends CODESYSTEM_CONTENT_MODE("not-present") {
    def display: Option[String] = Some("Not Present")
    def system: Option[String]  = Some("http://hl7.org/fhir/codesystem-content-mode")
  }
  case object SUPPLEMENT extends CODESYSTEM_CONTENT_MODE("supplement") {
    def display: Option[String] = Some("Supplement")
    def system: Option[String]  = Some("http://hl7.org/fhir/codesystem-content-mode")
  }
}

sealed abstract class CODESYSTEM_HIERARCHY_MEANING(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object CODESYSTEM_HIERARCHY_MEANING
    extends FhirEnum[CODESYSTEM_HIERARCHY_MEANING]
    with FhirCirceEnum[CODESYSTEM_HIERARCHY_MEANING] {
  val reference = "http://hl7.org/fhir/ValueSet/codesystem-hierarchy-meaning"
  val values    = findValues
  case object CLASSIFIED_WITH extends CODESYSTEM_HIERARCHY_MEANING("classified-with") {
    def display: Option[String] = Some("Classified With")
    def system: Option[String]  = Some("http://hl7.org/fhir/codesystem-hierarchy-meaning")
  }
  case object GROUPED_BY extends CODESYSTEM_HIERARCHY_MEANING("grouped-by") {
    def display: Option[String] = Some("Grouped By")
    def system: Option[String]  = Some("http://hl7.org/fhir/codesystem-hierarchy-meaning")
  }
  case object IS_A extends CODESYSTEM_HIERARCHY_MEANING("is-a") {
    def display: Option[String] = Some("Is-A")
    def system: Option[String]  = Some("http://hl7.org/fhir/codesystem-hierarchy-meaning")
  }
  case object PART_OF extends CODESYSTEM_HIERARCHY_MEANING("part-of") {
    def display: Option[String] = Some("Part Of")
    def system: Option[String]  = Some("http://hl7.org/fhir/codesystem-hierarchy-meaning")
  }
}

sealed abstract class CODE_SEARCH_SUPPORT(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object CODE_SEARCH_SUPPORT extends FhirEnum[CODE_SEARCH_SUPPORT] with FhirCirceEnum[CODE_SEARCH_SUPPORT] {
  val reference = "http://hl7.org/fhir/ValueSet/code-search-support"
  val values    = findValues
  case object ALL extends CODE_SEARCH_SUPPORT("all") {
    def display: Option[String] = Some("Implicit Codes")
    def system: Option[String]  = Some("http://hl7.org/fhir/code-search-support")
  }
  case object EXPLICIT extends CODE_SEARCH_SUPPORT("explicit") {
    def display: Option[String] = Some("Explicit Codes")
    def system: Option[String]  = Some("http://hl7.org/fhir/code-search-support")
  }
}

sealed abstract class COMPARTMENT_TYPE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object COMPARTMENT_TYPE extends FhirEnum[COMPARTMENT_TYPE] with FhirCirceEnum[COMPARTMENT_TYPE] {
  val reference = "http://hl7.org/fhir/ValueSet/compartment-type"
  val values    = findValues
  case object DEVICE extends COMPARTMENT_TYPE("Device") {
    def display: Option[String] = Some("Device")
    def system: Option[String]  = Some("http://hl7.org/fhir/compartment-type")
  }
  case object ENCOUNTER extends COMPARTMENT_TYPE("Encounter") {
    def display: Option[String] = Some("Encounter")
    def system: Option[String]  = Some("http://hl7.org/fhir/compartment-type")
  }
  case object PATIENT extends COMPARTMENT_TYPE("Patient") {
    def display: Option[String] = Some("Patient")
    def system: Option[String]  = Some("http://hl7.org/fhir/compartment-type")
  }
  case object PRACTITIONER extends COMPARTMENT_TYPE("Practitioner") {
    def display: Option[String] = Some("Practitioner")
    def system: Option[String]  = Some("http://hl7.org/fhir/compartment-type")
  }
  case object RELATEDPERSON extends COMPARTMENT_TYPE("RelatedPerson") {
    def display: Option[String] = Some("RelatedPerson")
    def system: Option[String]  = Some("http://hl7.org/fhir/compartment-type")
  }
}

sealed abstract class COMPOSITION_ATTESTATION_MODE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object COMPOSITION_ATTESTATION_MODE
    extends FhirEnum[COMPOSITION_ATTESTATION_MODE]
    with FhirCirceEnum[COMPOSITION_ATTESTATION_MODE] {
  val reference = "http://hl7.org/fhir/ValueSet/composition-attestation-mode"
  val values    = findValues
  case object LEGAL extends COMPOSITION_ATTESTATION_MODE("legal") {
    def display: Option[String] = Some("Legal")
    def system: Option[String]  = Some("http://hl7.org/fhir/composition-attestation-mode")
  }
  case object OFFICIAL extends COMPOSITION_ATTESTATION_MODE("official") {
    def display: Option[String] = Some("Official")
    def system: Option[String]  = Some("http://hl7.org/fhir/composition-attestation-mode")
  }
  case object PERSONAL extends COMPOSITION_ATTESTATION_MODE("personal") {
    def display: Option[String] = Some("Personal")
    def system: Option[String]  = Some("http://hl7.org/fhir/composition-attestation-mode")
  }
  case object PROFESSIONAL extends COMPOSITION_ATTESTATION_MODE("professional") {
    def display: Option[String] = Some("Professional")
    def system: Option[String]  = Some("http://hl7.org/fhir/composition-attestation-mode")
  }
}

sealed abstract class COMPOSITION_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object COMPOSITION_STATUS extends FhirEnum[COMPOSITION_STATUS] with FhirCirceEnum[COMPOSITION_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/composition-status"
  val values    = findValues
  case object AMENDED extends COMPOSITION_STATUS("amended") {
    def display: Option[String] = Some("Amended")
    def system: Option[String]  = Some("http://hl7.org/fhir/composition-status")
  }
  case object ENTERED_IN_ERROR extends COMPOSITION_STATUS("entered-in-error") {
    def display: Option[String] = Some("Entered in Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/composition-status")
  }
  case object FINAL extends COMPOSITION_STATUS("final") {
    def display: Option[String] = Some("Final")
    def system: Option[String]  = Some("http://hl7.org/fhir/composition-status")
  }
  case object PRELIMINARY extends COMPOSITION_STATUS("preliminary") {
    def display: Option[String] = Some("Preliminary")
    def system: Option[String]  = Some("http://hl7.org/fhir/composition-status")
  }
}

sealed abstract class CONCEPTMAP_UNMAPPED_MODE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object CONCEPTMAP_UNMAPPED_MODE
    extends FhirEnum[CONCEPTMAP_UNMAPPED_MODE]
    with FhirCirceEnum[CONCEPTMAP_UNMAPPED_MODE] {
  val reference = "http://hl7.org/fhir/ValueSet/conceptmap-unmapped-mode"
  val values    = findValues
  case object FIXED extends CONCEPTMAP_UNMAPPED_MODE("fixed") {
    def display: Option[String] = Some("Fixed Code")
    def system: Option[String]  = Some("http://hl7.org/fhir/conceptmap-unmapped-mode")
  }
  case object OTHER_MAP extends CONCEPTMAP_UNMAPPED_MODE("other-map") {
    def display: Option[String] = Some("Other Map")
    def system: Option[String]  = Some("http://hl7.org/fhir/conceptmap-unmapped-mode")
  }
  case object PROVIDED extends CONCEPTMAP_UNMAPPED_MODE("provided") {
    def display: Option[String] = Some("Provided Code")
    def system: Option[String]  = Some("http://hl7.org/fhir/conceptmap-unmapped-mode")
  }
}

sealed abstract class CONCEPT_MAP_EQUIVALENCE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object CONCEPT_MAP_EQUIVALENCE extends FhirEnum[CONCEPT_MAP_EQUIVALENCE] with FhirCirceEnum[CONCEPT_MAP_EQUIVALENCE] {
  val reference = "http://hl7.org/fhir/ValueSet/concept-map-equivalence"
  val values    = findValues
  case object DISJOINT extends CONCEPT_MAP_EQUIVALENCE("disjoint") {
    def display: Option[String] = Some("Disjoint")
    def system: Option[String]  = Some("http://hl7.org/fhir/concept-map-equivalence")
  }
  case object EQUAL extends CONCEPT_MAP_EQUIVALENCE("equal") {
    def display: Option[String] = Some("Equal")
    def system: Option[String]  = Some("http://hl7.org/fhir/concept-map-equivalence")
  }
  case object EQUIVALENT extends CONCEPT_MAP_EQUIVALENCE("equivalent") {
    def display: Option[String] = Some("Equivalent")
    def system: Option[String]  = Some("http://hl7.org/fhir/concept-map-equivalence")
  }
  case object INEXACT extends CONCEPT_MAP_EQUIVALENCE("inexact") {
    def display: Option[String] = Some("Inexact")
    def system: Option[String]  = Some("http://hl7.org/fhir/concept-map-equivalence")
  }
  case object NARROWER extends CONCEPT_MAP_EQUIVALENCE("narrower") {
    def display: Option[String] = Some("Narrower")
    def system: Option[String]  = Some("http://hl7.org/fhir/concept-map-equivalence")
  }
  case object RELATEDTO extends CONCEPT_MAP_EQUIVALENCE("relatedto") {
    def display: Option[String] = Some("Related To")
    def system: Option[String]  = Some("http://hl7.org/fhir/concept-map-equivalence")
  }
  case object SPECIALIZES extends CONCEPT_MAP_EQUIVALENCE("specializes") {
    def display: Option[String] = Some("Specializes")
    def system: Option[String]  = Some("http://hl7.org/fhir/concept-map-equivalence")
  }
  case object SUBSUMES extends CONCEPT_MAP_EQUIVALENCE("subsumes") {
    def display: Option[String] = Some("Subsumes")
    def system: Option[String]  = Some("http://hl7.org/fhir/concept-map-equivalence")
  }
  case object UNMATCHED extends CONCEPT_MAP_EQUIVALENCE("unmatched") {
    def display: Option[String] = Some("Unmatched")
    def system: Option[String]  = Some("http://hl7.org/fhir/concept-map-equivalence")
  }
  case object WIDER extends CONCEPT_MAP_EQUIVALENCE("wider") {
    def display: Option[String] = Some("Wider")
    def system: Option[String]  = Some("http://hl7.org/fhir/concept-map-equivalence")
  }
}

sealed abstract class CONCEPT_PROPERTY_TYPE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object CONCEPT_PROPERTY_TYPE extends FhirEnum[CONCEPT_PROPERTY_TYPE] with FhirCirceEnum[CONCEPT_PROPERTY_TYPE] {
  val reference = "http://hl7.org/fhir/ValueSet/concept-property-type"
  val values    = findValues
  case object BOOLEAN extends CONCEPT_PROPERTY_TYPE("boolean") {
    def display: Option[String] = Some("boolean")
    def system: Option[String]  = Some("http://hl7.org/fhir/concept-property-type")
  }
  case object CODE extends CONCEPT_PROPERTY_TYPE("code") {
    def display: Option[String] = Some("code (internal reference)")
    def system: Option[String]  = Some("http://hl7.org/fhir/concept-property-type")
  }
  case object CODING extends CONCEPT_PROPERTY_TYPE("Coding") {
    def display: Option[String] = Some("Coding (external reference)")
    def system: Option[String]  = Some("http://hl7.org/fhir/concept-property-type")
  }
  case object DATETIME extends CONCEPT_PROPERTY_TYPE("dateTime") {
    def display: Option[String] = Some("dateTime")
    def system: Option[String]  = Some("http://hl7.org/fhir/concept-property-type")
  }
  case object DECIMAL extends CONCEPT_PROPERTY_TYPE("decimal") {
    def display: Option[String] = Some("decimal")
    def system: Option[String]  = Some("http://hl7.org/fhir/concept-property-type")
  }
  case object INTEGER extends CONCEPT_PROPERTY_TYPE("integer") {
    def display: Option[String] = Some("integer")
    def system: Option[String]  = Some("http://hl7.org/fhir/concept-property-type")
  }
  case object STRING extends CONCEPT_PROPERTY_TYPE("string") {
    def display: Option[String] = Some("string")
    def system: Option[String]  = Some("http://hl7.org/fhir/concept-property-type")
  }
}

sealed abstract class CONDITIONAL_DELETE_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object CONDITIONAL_DELETE_STATUS
    extends FhirEnum[CONDITIONAL_DELETE_STATUS]
    with FhirCirceEnum[CONDITIONAL_DELETE_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/conditional-delete-status"
  val values    = findValues
  case object MULTIPLE extends CONDITIONAL_DELETE_STATUS("multiple") {
    def display: Option[String] = Some("Multiple Deletes Supported")
    def system: Option[String]  = Some("http://hl7.org/fhir/conditional-delete-status")
  }
  case object NOT_SUPPORTED extends CONDITIONAL_DELETE_STATUS("not-supported") {
    def display: Option[String] = Some("Not Supported")
    def system: Option[String]  = Some("http://hl7.org/fhir/conditional-delete-status")
  }
  case object SINGLE extends CONDITIONAL_DELETE_STATUS("single") {
    def display: Option[String] = Some("Single Deletes Supported")
    def system: Option[String]  = Some("http://hl7.org/fhir/conditional-delete-status")
  }
}

sealed abstract class CONDITIONAL_READ_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object CONDITIONAL_READ_STATUS extends FhirEnum[CONDITIONAL_READ_STATUS] with FhirCirceEnum[CONDITIONAL_READ_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/conditional-read-status"
  val values    = findValues
  case object FULL_SUPPORT extends CONDITIONAL_READ_STATUS("full-support") {
    def display: Option[String] = Some("Full Support")
    def system: Option[String]  = Some("http://hl7.org/fhir/conditional-read-status")
  }
  case object IF_MODIFIED_SINCE extends CONDITIONAL_READ_STATUS("modified-since") {
    def display: Option[String] = Some("If-Modified-Since")
    def system: Option[String]  = Some("http://hl7.org/fhir/conditional-read-status")
  }
  case object IF_NONE_MATCH extends CONDITIONAL_READ_STATUS("not-match") {
    def display: Option[String] = Some("If-None-Match")
    def system: Option[String]  = Some("http://hl7.org/fhir/conditional-read-status")
  }
  case object NOT_SUPPORTED extends CONDITIONAL_READ_STATUS("not-supported") {
    def display: Option[String] = Some("Not Supported")
    def system: Option[String]  = Some("http://hl7.org/fhir/conditional-read-status")
  }
}

sealed abstract class CONSENT_DATA_MEANING(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object CONSENT_DATA_MEANING extends FhirEnum[CONSENT_DATA_MEANING] with FhirCirceEnum[CONSENT_DATA_MEANING] {
  val reference = "http://hl7.org/fhir/ValueSet/consent-data-meaning"
  val values    = findValues
  case object AUTHOREDBY extends CONSENT_DATA_MEANING("authoredby") {
    def display: Option[String] = Some("AuthoredBy")
    def system: Option[String]  = Some("http://hl7.org/fhir/consent-data-meaning")
  }
  case object DEPENDENTS extends CONSENT_DATA_MEANING("dependents") {
    def display: Option[String] = Some("Dependents")
    def system: Option[String]  = Some("http://hl7.org/fhir/consent-data-meaning")
  }
  case object INSTANCE extends CONSENT_DATA_MEANING("instance") {
    def display: Option[String] = Some("Instance")
    def system: Option[String]  = Some("http://hl7.org/fhir/consent-data-meaning")
  }
  case object RELATED extends CONSENT_DATA_MEANING("related") {
    def display: Option[String] = Some("Related")
    def system: Option[String]  = Some("http://hl7.org/fhir/consent-data-meaning")
  }
}

sealed abstract class CONSENT_PROVISION_TYPE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object CONSENT_PROVISION_TYPE extends FhirEnum[CONSENT_PROVISION_TYPE] with FhirCirceEnum[CONSENT_PROVISION_TYPE] {
  val reference = "http://hl7.org/fhir/ValueSet/consent-provision-type"
  val values    = findValues
  case object DENY extends CONSENT_PROVISION_TYPE("deny") {
    def display: Option[String] = Some("Opt Out")
    def system: Option[String]  = Some("http://hl7.org/fhir/consent-provision-type")
  }
  case object PERMIT extends CONSENT_PROVISION_TYPE("permit") {
    def display: Option[String] = Some("Opt In")
    def system: Option[String]  = Some("http://hl7.org/fhir/consent-provision-type")
  }
}

sealed abstract class CONSENT_STATE_CODES(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object CONSENT_STATE_CODES extends FhirEnum[CONSENT_STATE_CODES] with FhirCirceEnum[CONSENT_STATE_CODES] {
  val reference = "http://hl7.org/fhir/ValueSet/consent-state-codes"
  val values    = findValues
  case object ACTIVE extends CONSENT_STATE_CODES("active") {
    def display: Option[String] = Some("Active")
    def system: Option[String]  = Some("http://hl7.org/fhir/consent-state-codes")
  }
  case object DRAFT extends CONSENT_STATE_CODES("draft") {
    def display: Option[String] = Some("Pending")
    def system: Option[String]  = Some("http://hl7.org/fhir/consent-state-codes")
  }
  case object ENTERED_IN_ERROR extends CONSENT_STATE_CODES("entered-in-error") {
    def display: Option[String] = Some("Entered in Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/consent-state-codes")
  }
  case object INACTIVE extends CONSENT_STATE_CODES("inactive") {
    def display: Option[String] = Some("Inactive")
    def system: Option[String]  = Some("http://hl7.org/fhir/consent-state-codes")
  }
  case object PROPOSED extends CONSENT_STATE_CODES("proposed") {
    def display: Option[String] = Some("Proposed")
    def system: Option[String]  = Some("http://hl7.org/fhir/consent-state-codes")
  }
  case object REJECTED extends CONSENT_STATE_CODES("rejected") {
    def display: Option[String] = Some("Rejected")
    def system: Option[String]  = Some("http://hl7.org/fhir/consent-state-codes")
  }
}

sealed abstract class CONSTRAINT_SEVERITY(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object CONSTRAINT_SEVERITY extends FhirEnum[CONSTRAINT_SEVERITY] with FhirCirceEnum[CONSTRAINT_SEVERITY] {
  val reference = "http://hl7.org/fhir/ValueSet/constraint-severity"
  val values    = findValues
  case object ERROR extends CONSTRAINT_SEVERITY("error") {
    def display: Option[String] = Some("Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/constraint-severity")
  }
  case object WARNING extends CONSTRAINT_SEVERITY("warning") {
    def display: Option[String] = Some("Warning")
    def system: Option[String]  = Some("http://hl7.org/fhir/constraint-severity")
  }
}

sealed abstract class CONTRACT_PUBLICATIONSTATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object CONTRACT_PUBLICATIONSTATUS
    extends FhirEnum[CONTRACT_PUBLICATIONSTATUS]
    with FhirCirceEnum[CONTRACT_PUBLICATIONSTATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/contract-publicationstatus"
  val values    = findValues
  case object AMENDED extends CONTRACT_PUBLICATIONSTATUS("amended") {
    def display: Option[String] = Some("Amended")
    def system: Option[String]  = Some("http://hl7.org/fhir/contract-publicationstatus")
  }
  case object APPENDED extends CONTRACT_PUBLICATIONSTATUS("appended") {
    def display: Option[String] = Some("Appended")
    def system: Option[String]  = Some("http://hl7.org/fhir/contract-publicationstatus")
  }
  case object CANCELLED extends CONTRACT_PUBLICATIONSTATUS("cancelled") {
    def display: Option[String] = Some("Cancelled")
    def system: Option[String]  = Some("http://hl7.org/fhir/contract-publicationstatus")
  }
  case object DISPUTED extends CONTRACT_PUBLICATIONSTATUS("disputed") {
    def display: Option[String] = Some("Disputed")
    def system: Option[String]  = Some("http://hl7.org/fhir/contract-publicationstatus")
  }
  case object ENTERED_IN_ERROR extends CONTRACT_PUBLICATIONSTATUS("entered-in-error") {
    def display: Option[String] = Some("Entered in Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/contract-publicationstatus")
  }
  case object EXECUTABLE extends CONTRACT_PUBLICATIONSTATUS("executable") {
    def display: Option[String] = Some("Executable")
    def system: Option[String]  = Some("http://hl7.org/fhir/contract-publicationstatus")
  }
  case object EXECUTED extends CONTRACT_PUBLICATIONSTATUS("executed") {
    def display: Option[String] = Some("Executed")
    def system: Option[String]  = Some("http://hl7.org/fhir/contract-publicationstatus")
  }
  case object NEGOTIABLE extends CONTRACT_PUBLICATIONSTATUS("negotiable") {
    def display: Option[String] = Some("Negotiable")
    def system: Option[String]  = Some("http://hl7.org/fhir/contract-publicationstatus")
  }
  case object OFFERED extends CONTRACT_PUBLICATIONSTATUS("offered") {
    def display: Option[String] = Some("Offered")
    def system: Option[String]  = Some("http://hl7.org/fhir/contract-publicationstatus")
  }
  case object POLICY extends CONTRACT_PUBLICATIONSTATUS("policy") {
    def display: Option[String] = Some("Policy")
    def system: Option[String]  = Some("http://hl7.org/fhir/contract-publicationstatus")
  }
  case object REJECTED extends CONTRACT_PUBLICATIONSTATUS("rejected") {
    def display: Option[String] = Some("Rejected")
    def system: Option[String]  = Some("http://hl7.org/fhir/contract-publicationstatus")
  }
  case object RENEWED extends CONTRACT_PUBLICATIONSTATUS("renewed") {
    def display: Option[String] = Some("Renewed")
    def system: Option[String]  = Some("http://hl7.org/fhir/contract-publicationstatus")
  }
  case object RESOLVED extends CONTRACT_PUBLICATIONSTATUS("resolved") {
    def display: Option[String] = Some("Resolved")
    def system: Option[String]  = Some("http://hl7.org/fhir/contract-publicationstatus")
  }
  case object REVOKED extends CONTRACT_PUBLICATIONSTATUS("revoked") {
    def display: Option[String] = Some("Revoked")
    def system: Option[String]  = Some("http://hl7.org/fhir/contract-publicationstatus")
  }
  case object TERMINATED extends CONTRACT_PUBLICATIONSTATUS("terminated") {
    def display: Option[String] = Some("Terminated")
    def system: Option[String]  = Some("http://hl7.org/fhir/contract-publicationstatus")
  }
}

sealed abstract class CONTRACT_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object CONTRACT_STATUS extends FhirEnum[CONTRACT_STATUS] with FhirCirceEnum[CONTRACT_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/contract-status"
  val values    = findValues
  case object AMENDED extends CONTRACT_STATUS("amended") {
    def display: Option[String] = Some("Amended")
    def system: Option[String]  = Some("http://hl7.org/fhir/contract-status")
  }
  case object APPENDED extends CONTRACT_STATUS("appended") {
    def display: Option[String] = Some("Appended")
    def system: Option[String]  = Some("http://hl7.org/fhir/contract-status")
  }
  case object CANCELLED extends CONTRACT_STATUS("cancelled") {
    def display: Option[String] = Some("Cancelled")
    def system: Option[String]  = Some("http://hl7.org/fhir/contract-status")
  }
  case object DISPUTED extends CONTRACT_STATUS("disputed") {
    def display: Option[String] = Some("Disputed")
    def system: Option[String]  = Some("http://hl7.org/fhir/contract-status")
  }
  case object ENTERED_IN_ERROR extends CONTRACT_STATUS("entered-in-error") {
    def display: Option[String] = Some("Entered in Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/contract-status")
  }
  case object EXECUTABLE extends CONTRACT_STATUS("executable") {
    def display: Option[String] = Some("Executable")
    def system: Option[String]  = Some("http://hl7.org/fhir/contract-status")
  }
  case object EXECUTED extends CONTRACT_STATUS("executed") {
    def display: Option[String] = Some("Executed")
    def system: Option[String]  = Some("http://hl7.org/fhir/contract-status")
  }
  case object NEGOTIABLE extends CONTRACT_STATUS("negotiable") {
    def display: Option[String] = Some("Negotiable")
    def system: Option[String]  = Some("http://hl7.org/fhir/contract-status")
  }
  case object OFFERED extends CONTRACT_STATUS("offered") {
    def display: Option[String] = Some("Offered")
    def system: Option[String]  = Some("http://hl7.org/fhir/contract-status")
  }
  case object POLICY extends CONTRACT_STATUS("policy") {
    def display: Option[String] = Some("Policy")
    def system: Option[String]  = Some("http://hl7.org/fhir/contract-status")
  }
  case object REJECTED extends CONTRACT_STATUS("rejected") {
    def display: Option[String] = Some("Rejected")
    def system: Option[String]  = Some("http://hl7.org/fhir/contract-status")
  }
  case object RENEWED extends CONTRACT_STATUS("renewed") {
    def display: Option[String] = Some("Renewed")
    def system: Option[String]  = Some("http://hl7.org/fhir/contract-status")
  }
  case object RESOLVED extends CONTRACT_STATUS("resolved") {
    def display: Option[String] = Some("Resolved")
    def system: Option[String]  = Some("http://hl7.org/fhir/contract-status")
  }
  case object REVOKED extends CONTRACT_STATUS("revoked") {
    def display: Option[String] = Some("Revoked")
    def system: Option[String]  = Some("http://hl7.org/fhir/contract-status")
  }
  case object TERMINATED extends CONTRACT_STATUS("terminated") {
    def display: Option[String] = Some("Terminated")
    def system: Option[String]  = Some("http://hl7.org/fhir/contract-status")
  }
}

sealed abstract class DEFINED_TYPES(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object DEFINED_TYPES extends FhirEnum[DEFINED_TYPES] with FhirCirceEnum[DEFINED_TYPES] {
  val reference = "http://hl7.org/fhir/ValueSet/defined-types"
  val values    = findValues
  case object ACCOUNT extends DEFINED_TYPES("Account") {
    def display: Option[String] = Some("Account")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object ACTIVITYDEFINITION extends DEFINED_TYPES("ActivityDefinition") {
    def display: Option[String] = Some("ActivityDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object ADDRESS extends DEFINED_TYPES("Address") {
    def display: Option[String] = Some("Address")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object ADVERSEEVENT extends DEFINED_TYPES("AdverseEvent") {
    def display: Option[String] = Some("AdverseEvent")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object AGE extends DEFINED_TYPES("Age") {
    def display: Option[String] = Some("Age")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object ALLERGYINTOLERANCE extends DEFINED_TYPES("AllergyIntolerance") {
    def display: Option[String] = Some("AllergyIntolerance")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object ANNOTATION extends DEFINED_TYPES("Annotation") {
    def display: Option[String] = Some("Annotation")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object APPOINTMENT extends DEFINED_TYPES("Appointment") {
    def display: Option[String] = Some("Appointment")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object APPOINTMENTRESPONSE extends DEFINED_TYPES("AppointmentResponse") {
    def display: Option[String] = Some("AppointmentResponse")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object ATTACHMENT extends DEFINED_TYPES("Attachment") {
    def display: Option[String] = Some("Attachment")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object AUDITEVENT extends DEFINED_TYPES("AuditEvent") {
    def display: Option[String] = Some("AuditEvent")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object BACKBONEELEMENT extends DEFINED_TYPES("BackboneElement") {
    def display: Option[String] = Some("BackboneElement")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object BASE64BINARY extends DEFINED_TYPES("base64Binary") {
    def display: Option[String] = Some("base64Binary")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object BASIC extends DEFINED_TYPES("Basic") {
    def display: Option[String] = Some("Basic")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object BINARY extends DEFINED_TYPES("Binary") {
    def display: Option[String] = Some("Binary")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object BIOLOGICALLYDERIVEDPRODUCT extends DEFINED_TYPES("BiologicallyDerivedProduct") {
    def display: Option[String] = Some("BiologicallyDerivedProduct")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object BODYSTRUCTURE extends DEFINED_TYPES("BodyStructure") {
    def display: Option[String] = Some("BodyStructure")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object BOOLEAN extends DEFINED_TYPES("boolean") {
    def display: Option[String] = Some("boolean")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object BUNDLE extends DEFINED_TYPES("Bundle") {
    def display: Option[String] = Some("Bundle")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CANONICAL extends DEFINED_TYPES("canonical") {
    def display: Option[String] = Some("canonical")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object CAPABILITYSTATEMENT extends DEFINED_TYPES("CapabilityStatement") {
    def display: Option[String] = Some("CapabilityStatement")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CAREPLAN extends DEFINED_TYPES("CarePlan") {
    def display: Option[String] = Some("CarePlan")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CARETEAM extends DEFINED_TYPES("CareTeam") {
    def display: Option[String] = Some("CareTeam")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CATALOGENTRY extends DEFINED_TYPES("CatalogEntry") {
    def display: Option[String] = Some("CatalogEntry")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CHARGEITEM extends DEFINED_TYPES("ChargeItem") {
    def display: Option[String] = Some("ChargeItem")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CHARGEITEMDEFINITION extends DEFINED_TYPES("ChargeItemDefinition") {
    def display: Option[String] = Some("ChargeItemDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CLAIM extends DEFINED_TYPES("Claim") {
    def display: Option[String] = Some("Claim")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CLAIMRESPONSE extends DEFINED_TYPES("ClaimResponse") {
    def display: Option[String] = Some("ClaimResponse")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CLINICALIMPRESSION extends DEFINED_TYPES("ClinicalImpression") {
    def display: Option[String] = Some("ClinicalImpression")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CODE extends DEFINED_TYPES("code") {
    def display: Option[String] = Some("code")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object CODEABLECONCEPT extends DEFINED_TYPES("CodeableConcept") {
    def display: Option[String] = Some("CodeableConcept")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object CODESYSTEM extends DEFINED_TYPES("CodeSystem") {
    def display: Option[String] = Some("CodeSystem")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CODING extends DEFINED_TYPES("Coding") {
    def display: Option[String] = Some("Coding")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object COMMUNICATION extends DEFINED_TYPES("Communication") {
    def display: Option[String] = Some("Communication")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object COMMUNICATIONREQUEST extends DEFINED_TYPES("CommunicationRequest") {
    def display: Option[String] = Some("CommunicationRequest")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object COMPARTMENTDEFINITION extends DEFINED_TYPES("CompartmentDefinition") {
    def display: Option[String] = Some("CompartmentDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object COMPOSITION extends DEFINED_TYPES("Composition") {
    def display: Option[String] = Some("Composition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CONCEPTMAP extends DEFINED_TYPES("ConceptMap") {
    def display: Option[String] = Some("ConceptMap")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CONDITION extends DEFINED_TYPES("Condition") {
    def display: Option[String] = Some("Condition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CONSENT extends DEFINED_TYPES("Consent") {
    def display: Option[String] = Some("Consent")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CONTACTDETAIL extends DEFINED_TYPES("ContactDetail") {
    def display: Option[String] = Some("ContactDetail")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object CONTACTPOINT extends DEFINED_TYPES("ContactPoint") {
    def display: Option[String] = Some("ContactPoint")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object CONTRACT extends DEFINED_TYPES("Contract") {
    def display: Option[String] = Some("Contract")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CONTRIBUTOR extends DEFINED_TYPES("Contributor") {
    def display: Option[String] = Some("Contributor")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object COUNT extends DEFINED_TYPES("Count") {
    def display: Option[String] = Some("Count")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object COVERAGE extends DEFINED_TYPES("Coverage") {
    def display: Option[String] = Some("Coverage")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object COVERAGEELIGIBILITYREQUEST extends DEFINED_TYPES("CoverageEligibilityRequest") {
    def display: Option[String] = Some("CoverageEligibilityRequest")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object COVERAGEELIGIBILITYRESPONSE extends DEFINED_TYPES("CoverageEligibilityResponse") {
    def display: Option[String] = Some("CoverageEligibilityResponse")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object DATAREQUIREMENT extends DEFINED_TYPES("DataRequirement") {
    def display: Option[String] = Some("DataRequirement")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object DATE extends DEFINED_TYPES("date") {
    def display: Option[String] = Some("date")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object DATETIME extends DEFINED_TYPES("dateTime") {
    def display: Option[String] = Some("dateTime")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object DECIMAL extends DEFINED_TYPES("decimal") {
    def display: Option[String] = Some("decimal")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object DETECTEDISSUE extends DEFINED_TYPES("DetectedIssue") {
    def display: Option[String] = Some("DetectedIssue")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object DEVICE extends DEFINED_TYPES("Device") {
    def display: Option[String] = Some("Device")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object DEVICEDEFINITION extends DEFINED_TYPES("DeviceDefinition") {
    def display: Option[String] = Some("DeviceDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object DEVICEMETRIC extends DEFINED_TYPES("DeviceMetric") {
    def display: Option[String] = Some("DeviceMetric")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object DEVICEREQUEST extends DEFINED_TYPES("DeviceRequest") {
    def display: Option[String] = Some("DeviceRequest")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object DEVICEUSESTATEMENT extends DEFINED_TYPES("DeviceUseStatement") {
    def display: Option[String] = Some("DeviceUseStatement")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object DIAGNOSTICREPORT extends DEFINED_TYPES("DiagnosticReport") {
    def display: Option[String] = Some("DiagnosticReport")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object DISTANCE extends DEFINED_TYPES("Distance") {
    def display: Option[String] = Some("Distance")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object DOCUMENTMANIFEST extends DEFINED_TYPES("DocumentManifest") {
    def display: Option[String] = Some("DocumentManifest")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object DOCUMENTREFERENCE extends DEFINED_TYPES("DocumentReference") {
    def display: Option[String] = Some("DocumentReference")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object DOMAINRESOURCE extends DEFINED_TYPES("DomainResource") {
    def display: Option[String] = Some("DomainResource")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object DOSAGE extends DEFINED_TYPES("Dosage") {
    def display: Option[String] = Some("Dosage")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object DURATION extends DEFINED_TYPES("Duration") {
    def display: Option[String] = Some("Duration")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object EFFECTEVIDENCESYNTHESIS extends DEFINED_TYPES("EffectEvidenceSynthesis") {
    def display: Option[String] = Some("EffectEvidenceSynthesis")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object ELEMENT extends DEFINED_TYPES("Element") {
    def display: Option[String] = Some("Element")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object ELEMENTDEFINITION extends DEFINED_TYPES("ElementDefinition") {
    def display: Option[String] = Some("ElementDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object ENCOUNTER extends DEFINED_TYPES("Encounter") {
    def display: Option[String] = Some("Encounter")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object ENDPOINT extends DEFINED_TYPES("Endpoint") {
    def display: Option[String] = Some("Endpoint")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object ENROLLMENTREQUEST extends DEFINED_TYPES("EnrollmentRequest") {
    def display: Option[String] = Some("EnrollmentRequest")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object ENROLLMENTRESPONSE extends DEFINED_TYPES("EnrollmentResponse") {
    def display: Option[String] = Some("EnrollmentResponse")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object EPISODEOFCARE extends DEFINED_TYPES("EpisodeOfCare") {
    def display: Option[String] = Some("EpisodeOfCare")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object EVENTDEFINITION extends DEFINED_TYPES("EventDefinition") {
    def display: Option[String] = Some("EventDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object EVIDENCE extends DEFINED_TYPES("Evidence") {
    def display: Option[String] = Some("Evidence")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object EVIDENCEVARIABLE extends DEFINED_TYPES("EvidenceVariable") {
    def display: Option[String] = Some("EvidenceVariable")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object EXAMPLESCENARIO extends DEFINED_TYPES("ExampleScenario") {
    def display: Option[String] = Some("ExampleScenario")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object EXPLANATIONOFBENEFIT extends DEFINED_TYPES("ExplanationOfBenefit") {
    def display: Option[String] = Some("ExplanationOfBenefit")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object EXPRESSION extends DEFINED_TYPES("Expression") {
    def display: Option[String] = Some("Expression")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object EXTENSION extends DEFINED_TYPES("Extension") {
    def display: Option[String] = Some("Extension")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object FAMILYMEMBERHISTORY extends DEFINED_TYPES("FamilyMemberHistory") {
    def display: Option[String] = Some("FamilyMemberHistory")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object FLAG extends DEFINED_TYPES("Flag") {
    def display: Option[String] = Some("Flag")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object GOAL extends DEFINED_TYPES("Goal") {
    def display: Option[String] = Some("Goal")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object GRAPHDEFINITION extends DEFINED_TYPES("GraphDefinition") {
    def display: Option[String] = Some("GraphDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object GROUP extends DEFINED_TYPES("Group") {
    def display: Option[String] = Some("Group")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object GUIDANCERESPONSE extends DEFINED_TYPES("GuidanceResponse") {
    def display: Option[String] = Some("GuidanceResponse")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object HEALTHCARESERVICE extends DEFINED_TYPES("HealthcareService") {
    def display: Option[String] = Some("HealthcareService")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object HUMANNAME extends DEFINED_TYPES("HumanName") {
    def display: Option[String] = Some("HumanName")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object ID extends DEFINED_TYPES("id") {
    def display: Option[String] = Some("id")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object IDENTIFIER extends DEFINED_TYPES("Identifier") {
    def display: Option[String] = Some("Identifier")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object IMAGINGSTUDY extends DEFINED_TYPES("ImagingStudy") {
    def display: Option[String] = Some("ImagingStudy")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object IMMUNIZATION extends DEFINED_TYPES("Immunization") {
    def display: Option[String] = Some("Immunization")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object IMMUNIZATIONEVALUATION extends DEFINED_TYPES("ImmunizationEvaluation") {
    def display: Option[String] = Some("ImmunizationEvaluation")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object IMMUNIZATIONRECOMMENDATION extends DEFINED_TYPES("ImmunizationRecommendation") {
    def display: Option[String] = Some("ImmunizationRecommendation")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object IMPLEMENTATIONGUIDE extends DEFINED_TYPES("ImplementationGuide") {
    def display: Option[String] = Some("ImplementationGuide")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object INSTANT extends DEFINED_TYPES("instant") {
    def display: Option[String] = Some("instant")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object INSURANCEPLAN extends DEFINED_TYPES("InsurancePlan") {
    def display: Option[String] = Some("InsurancePlan")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object INTEGER extends DEFINED_TYPES("integer") {
    def display: Option[String] = Some("integer")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object INVOICE extends DEFINED_TYPES("Invoice") {
    def display: Option[String] = Some("Invoice")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object LIBRARY extends DEFINED_TYPES("Library") {
    def display: Option[String] = Some("Library")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object LINKAGE extends DEFINED_TYPES("Linkage") {
    def display: Option[String] = Some("Linkage")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object LIST extends DEFINED_TYPES("List") {
    def display: Option[String] = Some("List")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object LOCATION extends DEFINED_TYPES("Location") {
    def display: Option[String] = Some("Location")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MARKDOWN extends DEFINED_TYPES("markdown") {
    def display: Option[String] = Some("markdown")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object MARKETINGSTATUS extends DEFINED_TYPES("MarketingStatus") {
    def display: Option[String] = Some("MarketingStatus")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object MEASURE extends DEFINED_TYPES("Measure") {
    def display: Option[String] = Some("Measure")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEASUREREPORT extends DEFINED_TYPES("MeasureReport") {
    def display: Option[String] = Some("MeasureReport")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDIA extends DEFINED_TYPES("Media") {
    def display: Option[String] = Some("Media")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICATION extends DEFINED_TYPES("Medication") {
    def display: Option[String] = Some("Medication")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICATIONADMINISTRATION extends DEFINED_TYPES("MedicationAdministration") {
    def display: Option[String] = Some("MedicationAdministration")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICATIONDISPENSE extends DEFINED_TYPES("MedicationDispense") {
    def display: Option[String] = Some("MedicationDispense")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICATIONKNOWLEDGE extends DEFINED_TYPES("MedicationKnowledge") {
    def display: Option[String] = Some("MedicationKnowledge")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICATIONREQUEST extends DEFINED_TYPES("MedicationRequest") {
    def display: Option[String] = Some("MedicationRequest")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICATIONSTATEMENT extends DEFINED_TYPES("MedicationStatement") {
    def display: Option[String] = Some("MedicationStatement")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICINALPRODUCT extends DEFINED_TYPES("MedicinalProduct") {
    def display: Option[String] = Some("MedicinalProduct")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICINALPRODUCTAUTHORIZATION extends DEFINED_TYPES("MedicinalProductAuthorization") {
    def display: Option[String] = Some("MedicinalProductAuthorization")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICINALPRODUCTCONTRAINDICATION extends DEFINED_TYPES("MedicinalProductContraindication") {
    def display: Option[String] = Some("MedicinalProductContraindication")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICINALPRODUCTINDICATION extends DEFINED_TYPES("MedicinalProductIndication") {
    def display: Option[String] = Some("MedicinalProductIndication")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICINALPRODUCTINGREDIENT extends DEFINED_TYPES("MedicinalProductIngredient") {
    def display: Option[String] = Some("MedicinalProductIngredient")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICINALPRODUCTINTERACTION extends DEFINED_TYPES("MedicinalProductInteraction") {
    def display: Option[String] = Some("MedicinalProductInteraction")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICINALPRODUCTMANUFACTURED extends DEFINED_TYPES("MedicinalProductManufactured") {
    def display: Option[String] = Some("MedicinalProductManufactured")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICINALPRODUCTPACKAGED extends DEFINED_TYPES("MedicinalProductPackaged") {
    def display: Option[String] = Some("MedicinalProductPackaged")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICINALPRODUCTPHARMACEUTICAL extends DEFINED_TYPES("MedicinalProductPharmaceutical") {
    def display: Option[String] = Some("MedicinalProductPharmaceutical")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICINALPRODUCTUNDESIRABLEEFFECT extends DEFINED_TYPES("MedicinalProductUndesirableEffect") {
    def display: Option[String] = Some("MedicinalProductUndesirableEffect")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MESSAGEDEFINITION extends DEFINED_TYPES("MessageDefinition") {
    def display: Option[String] = Some("MessageDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MESSAGEHEADER extends DEFINED_TYPES("MessageHeader") {
    def display: Option[String] = Some("MessageHeader")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object META extends DEFINED_TYPES("Meta") {
    def display: Option[String] = Some("Meta")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object MOLECULARSEQUENCE extends DEFINED_TYPES("MolecularSequence") {
    def display: Option[String] = Some("MolecularSequence")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MONEY extends DEFINED_TYPES("Money") {
    def display: Option[String] = Some("Money")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object MONEYQUANTITY extends DEFINED_TYPES("MoneyQuantity") {
    def display: Option[String] = Some("MoneyQuantity")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object NAMINGSYSTEM extends DEFINED_TYPES("NamingSystem") {
    def display: Option[String] = Some("NamingSystem")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object NARRATIVE extends DEFINED_TYPES("Narrative") {
    def display: Option[String] = Some("Narrative")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object NUTRITIONORDER extends DEFINED_TYPES("NutritionOrder") {
    def display: Option[String] = Some("NutritionOrder")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object OBSERVATION extends DEFINED_TYPES("Observation") {
    def display: Option[String] = Some("Observation")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object OBSERVATIONDEFINITION extends DEFINED_TYPES("ObservationDefinition") {
    def display: Option[String] = Some("ObservationDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object OID extends DEFINED_TYPES("oid") {
    def display: Option[String] = Some("oid")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object OPERATIONDEFINITION extends DEFINED_TYPES("OperationDefinition") {
    def display: Option[String] = Some("OperationDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object OPERATIONOUTCOME extends DEFINED_TYPES("OperationOutcome") {
    def display: Option[String] = Some("OperationOutcome")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object ORGANIZATION extends DEFINED_TYPES("Organization") {
    def display: Option[String] = Some("Organization")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object ORGANIZATIONAFFILIATION extends DEFINED_TYPES("OrganizationAffiliation") {
    def display: Option[String] = Some("OrganizationAffiliation")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object PARAMETERDEFINITION extends DEFINED_TYPES("ParameterDefinition") {
    def display: Option[String] = Some("ParameterDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object PARAMETERS extends DEFINED_TYPES("Parameters") {
    def display: Option[String] = Some("Parameters")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object PATIENT extends DEFINED_TYPES("Patient") {
    def display: Option[String] = Some("Patient")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object PAYMENTNOTICE extends DEFINED_TYPES("PaymentNotice") {
    def display: Option[String] = Some("PaymentNotice")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object PAYMENTRECONCILIATION extends DEFINED_TYPES("PaymentReconciliation") {
    def display: Option[String] = Some("PaymentReconciliation")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object PERIOD extends DEFINED_TYPES("Period") {
    def display: Option[String] = Some("Period")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object PERSON extends DEFINED_TYPES("Person") {
    def display: Option[String] = Some("Person")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object PLANDEFINITION extends DEFINED_TYPES("PlanDefinition") {
    def display: Option[String] = Some("PlanDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object POPULATION extends DEFINED_TYPES("Population") {
    def display: Option[String] = Some("Population")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object POSITIVEINT extends DEFINED_TYPES("positiveInt") {
    def display: Option[String] = Some("positiveInt")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object PRACTITIONER extends DEFINED_TYPES("Practitioner") {
    def display: Option[String] = Some("Practitioner")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object PRACTITIONERROLE extends DEFINED_TYPES("PractitionerRole") {
    def display: Option[String] = Some("PractitionerRole")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object PROCEDURE extends DEFINED_TYPES("Procedure") {
    def display: Option[String] = Some("Procedure")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object PRODCHARACTERISTIC extends DEFINED_TYPES("ProdCharacteristic") {
    def display: Option[String] = Some("ProdCharacteristic")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object PRODUCTSHELFLIFE extends DEFINED_TYPES("ProductShelfLife") {
    def display: Option[String] = Some("ProductShelfLife")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object PROVENANCE extends DEFINED_TYPES("Provenance") {
    def display: Option[String] = Some("Provenance")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object QUANTITY extends DEFINED_TYPES("Quantity") {
    def display: Option[String] = Some("Quantity")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object QUESTIONNAIRE extends DEFINED_TYPES("Questionnaire") {
    def display: Option[String] = Some("Questionnaire")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object QUESTIONNAIRERESPONSE extends DEFINED_TYPES("QuestionnaireResponse") {
    def display: Option[String] = Some("QuestionnaireResponse")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object RANGE extends DEFINED_TYPES("Range") {
    def display: Option[String] = Some("Range")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object RATIO extends DEFINED_TYPES("Ratio") {
    def display: Option[String] = Some("Ratio")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object REFERENCE extends DEFINED_TYPES("Reference") {
    def display: Option[String] = Some("Reference")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object RELATEDARTIFACT extends DEFINED_TYPES("RelatedArtifact") {
    def display: Option[String] = Some("RelatedArtifact")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object RELATEDPERSON extends DEFINED_TYPES("RelatedPerson") {
    def display: Option[String] = Some("RelatedPerson")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object REQUESTGROUP extends DEFINED_TYPES("RequestGroup") {
    def display: Option[String] = Some("RequestGroup")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object RESEARCHDEFINITION extends DEFINED_TYPES("ResearchDefinition") {
    def display: Option[String] = Some("ResearchDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object RESEARCHELEMENTDEFINITION extends DEFINED_TYPES("ResearchElementDefinition") {
    def display: Option[String] = Some("ResearchElementDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object RESEARCHSTUDY extends DEFINED_TYPES("ResearchStudy") {
    def display: Option[String] = Some("ResearchStudy")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object RESEARCHSUBJECT extends DEFINED_TYPES("ResearchSubject") {
    def display: Option[String] = Some("ResearchSubject")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object RESOURCE extends DEFINED_TYPES("Resource") {
    def display: Option[String] = Some("Resource")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object RISKASSESSMENT extends DEFINED_TYPES("RiskAssessment") {
    def display: Option[String] = Some("RiskAssessment")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object RISKEVIDENCESYNTHESIS extends DEFINED_TYPES("RiskEvidenceSynthesis") {
    def display: Option[String] = Some("RiskEvidenceSynthesis")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SAMPLEDDATA extends DEFINED_TYPES("SampledData") {
    def display: Option[String] = Some("SampledData")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object SCHEDULE extends DEFINED_TYPES("Schedule") {
    def display: Option[String] = Some("Schedule")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SEARCHPARAMETER extends DEFINED_TYPES("SearchParameter") {
    def display: Option[String] = Some("SearchParameter")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SERVICEREQUEST extends DEFINED_TYPES("ServiceRequest") {
    def display: Option[String] = Some("ServiceRequest")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SIGNATURE extends DEFINED_TYPES("Signature") {
    def display: Option[String] = Some("Signature")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object SIMPLEQUANTITY extends DEFINED_TYPES("SimpleQuantity") {
    def display: Option[String] = Some("SimpleQuantity")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object SLOT extends DEFINED_TYPES("Slot") {
    def display: Option[String] = Some("Slot")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SPECIMEN extends DEFINED_TYPES("Specimen") {
    def display: Option[String] = Some("Specimen")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SPECIMENDEFINITION extends DEFINED_TYPES("SpecimenDefinition") {
    def display: Option[String] = Some("SpecimenDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object STRING extends DEFINED_TYPES("string") {
    def display: Option[String] = Some("string")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object STRUCTUREDEFINITION extends DEFINED_TYPES("StructureDefinition") {
    def display: Option[String] = Some("StructureDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object STRUCTUREMAP extends DEFINED_TYPES("StructureMap") {
    def display: Option[String] = Some("StructureMap")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SUBSCRIPTION extends DEFINED_TYPES("Subscription") {
    def display: Option[String] = Some("Subscription")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SUBSTANCE extends DEFINED_TYPES("Substance") {
    def display: Option[String] = Some("Substance")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SUBSTANCEAMOUNT extends DEFINED_TYPES("SubstanceAmount") {
    def display: Option[String] = Some("SubstanceAmount")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object SUBSTANCENUCLEICACID extends DEFINED_TYPES("SubstanceNucleicAcid") {
    def display: Option[String] = Some("SubstanceNucleicAcid")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SUBSTANCEPOLYMER extends DEFINED_TYPES("SubstancePolymer") {
    def display: Option[String] = Some("SubstancePolymer")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SUBSTANCEPROTEIN extends DEFINED_TYPES("SubstanceProtein") {
    def display: Option[String] = Some("SubstanceProtein")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SUBSTANCEREFERENCEINFORMATION extends DEFINED_TYPES("SubstanceReferenceInformation") {
    def display: Option[String] = Some("SubstanceReferenceInformation")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SUBSTANCESOURCEMATERIAL extends DEFINED_TYPES("SubstanceSourceMaterial") {
    def display: Option[String] = Some("SubstanceSourceMaterial")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SUBSTANCESPECIFICATION extends DEFINED_TYPES("SubstanceSpecification") {
    def display: Option[String] = Some("SubstanceSpecification")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SUPPLYDELIVERY extends DEFINED_TYPES("SupplyDelivery") {
    def display: Option[String] = Some("SupplyDelivery")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SUPPLYREQUEST extends DEFINED_TYPES("SupplyRequest") {
    def display: Option[String] = Some("SupplyRequest")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object TASK extends DEFINED_TYPES("Task") {
    def display: Option[String] = Some("Task")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object TERMINOLOGYCAPABILITIES extends DEFINED_TYPES("TerminologyCapabilities") {
    def display: Option[String] = Some("TerminologyCapabilities")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object TESTREPORT extends DEFINED_TYPES("TestReport") {
    def display: Option[String] = Some("TestReport")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object TESTSCRIPT extends DEFINED_TYPES("TestScript") {
    def display: Option[String] = Some("TestScript")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object TIME extends DEFINED_TYPES("time") {
    def display: Option[String] = Some("time")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object TIMING extends DEFINED_TYPES("Timing") {
    def display: Option[String] = Some("Timing")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object TRIGGERDEFINITION extends DEFINED_TYPES("TriggerDefinition") {
    def display: Option[String] = Some("TriggerDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object UNSIGNEDINT extends DEFINED_TYPES("unsignedInt") {
    def display: Option[String] = Some("unsignedInt")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object URI extends DEFINED_TYPES("uri") {
    def display: Option[String] = Some("uri")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object URL extends DEFINED_TYPES("url") {
    def display: Option[String] = Some("url")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object USAGECONTEXT extends DEFINED_TYPES("UsageContext") {
    def display: Option[String] = Some("UsageContext")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object UUID extends DEFINED_TYPES("uuid") {
    def display: Option[String] = Some("uuid")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
  case object VALUESET extends DEFINED_TYPES("ValueSet") {
    def display: Option[String] = Some("ValueSet")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object VERIFICATIONRESULT extends DEFINED_TYPES("VerificationResult") {
    def display: Option[String] = Some("VerificationResult")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object VISIONPRESCRIPTION extends DEFINED_TYPES("VisionPrescription") {
    def display: Option[String] = Some("VisionPrescription")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object XHTML extends DEFINED_TYPES("xhtml") {
    def display: Option[String] = Some("XHTML")
    def system: Option[String]  = Some("http://hl7.org/fhir/data-types")
  }
}

sealed abstract class DETECTEDISSUE_SEVERITY(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object DETECTEDISSUE_SEVERITY extends FhirEnum[DETECTEDISSUE_SEVERITY] with FhirCirceEnum[DETECTEDISSUE_SEVERITY] {
  val reference = "http://hl7.org/fhir/ValueSet/detectedissue-severity"
  val values    = findValues
  case object HIGH extends DETECTEDISSUE_SEVERITY("high") {
    def display: Option[String] = Some("High")
    def system: Option[String]  = Some("http://hl7.org/fhir/detectedissue-severity")
  }
  case object LOW extends DETECTEDISSUE_SEVERITY("low") {
    def display: Option[String] = Some("Low")
    def system: Option[String]  = Some("http://hl7.org/fhir/detectedissue-severity")
  }
  case object MODERATE extends DETECTEDISSUE_SEVERITY("moderate") {
    def display: Option[String] = Some("Moderate")
    def system: Option[String]  = Some("http://hl7.org/fhir/detectedissue-severity")
  }
}

sealed abstract class DEVICE_NAMETYPE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object DEVICE_NAMETYPE extends FhirEnum[DEVICE_NAMETYPE] with FhirCirceEnum[DEVICE_NAMETYPE] {
  val reference = "http://hl7.org/fhir/ValueSet/device-nametype"
  val values    = findValues
  case object MANUFACTURER_NAME extends DEVICE_NAMETYPE("manufacturer-name") {
    def display: Option[String] = Some("Manufacturer name")
    def system: Option[String]  = Some("http://hl7.org/fhir/device-nametype")
  }
  case object MODEL_NAME extends DEVICE_NAMETYPE("model-name") {
    def display: Option[String] = Some("Model name")
    def system: Option[String]  = Some("http://hl7.org/fhir/device-nametype")
  }
  case object OTHER extends DEVICE_NAMETYPE("other") {
    def display: Option[String] = Some("other")
    def system: Option[String]  = Some("http://hl7.org/fhir/device-nametype")
  }
  case object PATIENT_REPORTED_NAME extends DEVICE_NAMETYPE("patient-reported-name") {
    def display: Option[String] = Some("Patient Reported name")
    def system: Option[String]  = Some("http://hl7.org/fhir/device-nametype")
  }
  case object UDI_LABEL_NAME extends DEVICE_NAMETYPE("udi-label-name") {
    def display: Option[String] = Some("UDI Label name")
    def system: Option[String]  = Some("http://hl7.org/fhir/device-nametype")
  }
  case object USER_FRIENDLY_NAME extends DEVICE_NAMETYPE("user-friendly-name") {
    def display: Option[String] = Some("User Friendly name")
    def system: Option[String]  = Some("http://hl7.org/fhir/device-nametype")
  }
}

sealed abstract class DEVICE_STATEMENT_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object DEVICE_STATEMENT_STATUS extends FhirEnum[DEVICE_STATEMENT_STATUS] with FhirCirceEnum[DEVICE_STATEMENT_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/device-statement-status"
  val values    = findValues
  case object ACTIVE extends DEVICE_STATEMENT_STATUS("active") {
    def display: Option[String] = Some("Active")
    def system: Option[String]  = Some("http://hl7.org/fhir/device-statement-status")
  }
  case object COMPLETED extends DEVICE_STATEMENT_STATUS("completed") {
    def display: Option[String] = Some("Completed")
    def system: Option[String]  = Some("http://hl7.org/fhir/device-statement-status")
  }
  case object ENTERED_IN_ERROR extends DEVICE_STATEMENT_STATUS("entered-in-error") {
    def display: Option[String] = Some("Entered in Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/device-statement-status")
  }
  case object INTENDED extends DEVICE_STATEMENT_STATUS("intended") {
    def display: Option[String] = Some("Intended")
    def system: Option[String]  = Some("http://hl7.org/fhir/device-statement-status")
  }
  case object ON_HOLD extends DEVICE_STATEMENT_STATUS("on-hold") {
    def display: Option[String] = Some("On Hold")
    def system: Option[String]  = Some("http://hl7.org/fhir/device-statement-status")
  }
  case object STOPPED extends DEVICE_STATEMENT_STATUS("stopped") {
    def display: Option[String] = Some("Stopped")
    def system: Option[String]  = Some("http://hl7.org/fhir/device-statement-status")
  }
}

sealed abstract class DEVICE_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object DEVICE_STATUS extends FhirEnum[DEVICE_STATUS] with FhirCirceEnum[DEVICE_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/device-status"
  val values    = findValues
  case object ACTIVE extends DEVICE_STATUS("active") {
    def display: Option[String] = Some("Active")
    def system: Option[String]  = Some("http://hl7.org/fhir/device-status")
  }
  case object ENTERED_IN_ERROR extends DEVICE_STATUS("entered-in-error") {
    def display: Option[String] = Some("Entered in Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/device-status")
  }
  case object INACTIVE extends DEVICE_STATUS("inactive") {
    def display: Option[String] = Some("Inactive")
    def system: Option[String]  = Some("http://hl7.org/fhir/device-status")
  }
  case object UNKNOWN extends DEVICE_STATUS("unknown") {
    def display: Option[String] = Some("Unknown")
    def system: Option[String]  = Some("http://hl7.org/fhir/device-status")
  }
}

sealed abstract class DIAGNOSTIC_REPORT_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object DIAGNOSTIC_REPORT_STATUS
    extends FhirEnum[DIAGNOSTIC_REPORT_STATUS]
    with FhirCirceEnum[DIAGNOSTIC_REPORT_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/diagnostic-report-status"
  val values    = findValues
  case object AMENDED extends DIAGNOSTIC_REPORT_STATUS("amended") {
    def display: Option[String] = Some("Amended")
    def system: Option[String]  = Some("http://hl7.org/fhir/diagnostic-report-status")
  }
  case object APPENDED extends DIAGNOSTIC_REPORT_STATUS("appended") {
    def display: Option[String] = Some("Appended")
    def system: Option[String]  = Some("http://hl7.org/fhir/diagnostic-report-status")
  }
  case object CANCELLED extends DIAGNOSTIC_REPORT_STATUS("cancelled") {
    def display: Option[String] = Some("Cancelled")
    def system: Option[String]  = Some("http://hl7.org/fhir/diagnostic-report-status")
  }
  case object CORRECTED extends DIAGNOSTIC_REPORT_STATUS("corrected") {
    def display: Option[String] = Some("Corrected")
    def system: Option[String]  = Some("http://hl7.org/fhir/diagnostic-report-status")
  }
  case object ENTERED_IN_ERROR extends DIAGNOSTIC_REPORT_STATUS("entered-in-error") {
    def display: Option[String] = Some("Entered in Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/diagnostic-report-status")
  }
  case object FINAL extends DIAGNOSTIC_REPORT_STATUS("final") {
    def display: Option[String] = Some("Final")
    def system: Option[String]  = Some("http://hl7.org/fhir/diagnostic-report-status")
  }
  case object PARTIAL extends DIAGNOSTIC_REPORT_STATUS("partial") {
    def display: Option[String] = Some("Partial")
    def system: Option[String]  = Some("http://hl7.org/fhir/diagnostic-report-status")
  }
  case object PRELIMINARY extends DIAGNOSTIC_REPORT_STATUS("preliminary") {
    def display: Option[String] = Some("Preliminary")
    def system: Option[String]  = Some("http://hl7.org/fhir/diagnostic-report-status")
  }
  case object REGISTERED extends DIAGNOSTIC_REPORT_STATUS("registered") {
    def display: Option[String] = Some("Registered")
    def system: Option[String]  = Some("http://hl7.org/fhir/diagnostic-report-status")
  }
  case object UNKNOWN extends DIAGNOSTIC_REPORT_STATUS("unknown") {
    def display: Option[String] = Some("Unknown")
    def system: Option[String]  = Some("http://hl7.org/fhir/diagnostic-report-status")
  }
}

sealed abstract class DISCRIMINATOR_TYPE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object DISCRIMINATOR_TYPE extends FhirEnum[DISCRIMINATOR_TYPE] with FhirCirceEnum[DISCRIMINATOR_TYPE] {
  val reference = "http://hl7.org/fhir/ValueSet/discriminator-type"
  val values    = findValues
  case object EXISTS extends DISCRIMINATOR_TYPE("exists") {
    def display: Option[String] = Some("Exists")
    def system: Option[String]  = Some("http://hl7.org/fhir/discriminator-type")
  }
  case object PATTERN extends DISCRIMINATOR_TYPE("pattern") {
    def display: Option[String] = Some("Pattern")
    def system: Option[String]  = Some("http://hl7.org/fhir/discriminator-type")
  }
  case object PROFILE extends DISCRIMINATOR_TYPE("profile") {
    def display: Option[String] = Some("Profile")
    def system: Option[String]  = Some("http://hl7.org/fhir/discriminator-type")
  }
  case object TYPE extends DISCRIMINATOR_TYPE("type") {
    def display: Option[String] = Some("Type")
    def system: Option[String]  = Some("http://hl7.org/fhir/discriminator-type")
  }
  case object VALUE extends DISCRIMINATOR_TYPE("value") {
    def display: Option[String] = Some("Value")
    def system: Option[String]  = Some("http://hl7.org/fhir/discriminator-type")
  }
}

sealed abstract class DOCUMENT_MODE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object DOCUMENT_MODE extends FhirEnum[DOCUMENT_MODE] with FhirCirceEnum[DOCUMENT_MODE] {
  val reference = "http://hl7.org/fhir/ValueSet/document-mode"
  val values    = findValues
  case object CONSUMER extends DOCUMENT_MODE("consumer") {
    def display: Option[String] = Some("Consumer")
    def system: Option[String]  = Some("http://hl7.org/fhir/document-mode")
  }
  case object PRODUCER extends DOCUMENT_MODE("producer") {
    def display: Option[String] = Some("Producer")
    def system: Option[String]  = Some("http://hl7.org/fhir/document-mode")
  }
}

sealed abstract class DOCUMENT_REFERENCE_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object DOCUMENT_REFERENCE_STATUS
    extends FhirEnum[DOCUMENT_REFERENCE_STATUS]
    with FhirCirceEnum[DOCUMENT_REFERENCE_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/document-reference-status"
  val values    = findValues
  case object CURRENT extends DOCUMENT_REFERENCE_STATUS("current") {
    def display: Option[String] = Some("Current")
    def system: Option[String]  = Some("http://hl7.org/fhir/document-reference-status")
  }
  case object ENTERED_IN_ERROR extends DOCUMENT_REFERENCE_STATUS("entered-in-error") {
    def display: Option[String] = Some("Entered in Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/document-reference-status")
  }
  case object SUPERSEDED extends DOCUMENT_REFERENCE_STATUS("superseded") {
    def display: Option[String] = Some("Superseded")
    def system: Option[String]  = Some("http://hl7.org/fhir/document-reference-status")
  }
}

sealed abstract class DOCUMENT_RELATIONSHIP_TYPE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object DOCUMENT_RELATIONSHIP_TYPE
    extends FhirEnum[DOCUMENT_RELATIONSHIP_TYPE]
    with FhirCirceEnum[DOCUMENT_RELATIONSHIP_TYPE] {
  val reference = "http://hl7.org/fhir/ValueSet/document-relationship-type"
  val values    = findValues
  case object APPENDS extends DOCUMENT_RELATIONSHIP_TYPE("appends") {
    def display: Option[String] = Some("Appends")
    def system: Option[String]  = Some("http://hl7.org/fhir/document-relationship-type")
  }
  case object REPLACES extends DOCUMENT_RELATIONSHIP_TYPE("replaces") {
    def display: Option[String] = Some("Replaces")
    def system: Option[String]  = Some("http://hl7.org/fhir/document-relationship-type")
  }
  case object SIGNS extends DOCUMENT_RELATIONSHIP_TYPE("signs") {
    def display: Option[String] = Some("Signs")
    def system: Option[String]  = Some("http://hl7.org/fhir/document-relationship-type")
  }
  case object TRANSFORMS extends DOCUMENT_RELATIONSHIP_TYPE("transforms") {
    def display: Option[String] = Some("Transforms")
    def system: Option[String]  = Some("http://hl7.org/fhir/document-relationship-type")
  }
}

sealed abstract class ELIGIBILITYREQUEST_PURPOSE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object ELIGIBILITYREQUEST_PURPOSE
    extends FhirEnum[ELIGIBILITYREQUEST_PURPOSE]
    with FhirCirceEnum[ELIGIBILITYREQUEST_PURPOSE] {
  val reference = "http://hl7.org/fhir/ValueSet/eligibilityrequest-purpose"
  val values    = findValues
  case object BENEFITS extends ELIGIBILITYREQUEST_PURPOSE("benefits") {
    def display: Option[String] = Some("Coverage benefits")
    def system: Option[String]  = Some("http://hl7.org/fhir/eligibilityrequest-purpose")
  }
  case object COVERAGE_AUTH_REQUIREMENTS extends ELIGIBILITYREQUEST_PURPOSE("auth-requirements") {
    def display: Option[String] = Some("Coverage auth-requirements")
    def system: Option[String]  = Some("http://hl7.org/fhir/eligibilityrequest-purpose")
  }
  case object DISCOVERY extends ELIGIBILITYREQUEST_PURPOSE("discovery") {
    def display: Option[String] = Some("Coverage Discovery")
    def system: Option[String]  = Some("http://hl7.org/fhir/eligibilityrequest-purpose")
  }
  case object VALIDATION extends ELIGIBILITYREQUEST_PURPOSE("validation") {
    def display: Option[String] = Some("Coverage Validation")
    def system: Option[String]  = Some("http://hl7.org/fhir/eligibilityrequest-purpose")
  }
}

sealed abstract class ELIGIBILITYRESPONSE_PURPOSE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object ELIGIBILITYRESPONSE_PURPOSE
    extends FhirEnum[ELIGIBILITYRESPONSE_PURPOSE]
    with FhirCirceEnum[ELIGIBILITYRESPONSE_PURPOSE] {
  val reference = "http://hl7.org/fhir/ValueSet/eligibilityresponse-purpose"
  val values    = findValues
  case object BENEFITS extends ELIGIBILITYRESPONSE_PURPOSE("benefits") {
    def display: Option[String] = Some("Coverage benefits")
    def system: Option[String]  = Some("http://hl7.org/fhir/eligibilityresponse-purpose")
  }
  case object COVERAGE_AUTH_REQUIREMENTS extends ELIGIBILITYRESPONSE_PURPOSE("auth-requirements") {
    def display: Option[String] = Some("Coverage auth-requirements")
    def system: Option[String]  = Some("http://hl7.org/fhir/eligibilityresponse-purpose")
  }
  case object DISCOVERY extends ELIGIBILITYRESPONSE_PURPOSE("discovery") {
    def display: Option[String] = Some("Coverage Discovery")
    def system: Option[String]  = Some("http://hl7.org/fhir/eligibilityresponse-purpose")
  }
  case object VALIDATION extends ELIGIBILITYRESPONSE_PURPOSE("validation") {
    def display: Option[String] = Some("Coverage Validation")
    def system: Option[String]  = Some("http://hl7.org/fhir/eligibilityresponse-purpose")
  }
}

sealed abstract class ENCOUNTER_LOCATION_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object ENCOUNTER_LOCATION_STATUS
    extends FhirEnum[ENCOUNTER_LOCATION_STATUS]
    with FhirCirceEnum[ENCOUNTER_LOCATION_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/encounter-location-status"
  val values    = findValues
  case object ACTIVE extends ENCOUNTER_LOCATION_STATUS("active") {
    def display: Option[String] = Some("Active")
    def system: Option[String]  = Some("http://hl7.org/fhir/encounter-location-status")
  }
  case object COMPLETED extends ENCOUNTER_LOCATION_STATUS("completed") {
    def display: Option[String] = Some("Completed")
    def system: Option[String]  = Some("http://hl7.org/fhir/encounter-location-status")
  }
  case object PLANNED extends ENCOUNTER_LOCATION_STATUS("planned") {
    def display: Option[String] = Some("Planned")
    def system: Option[String]  = Some("http://hl7.org/fhir/encounter-location-status")
  }
  case object RESERVED extends ENCOUNTER_LOCATION_STATUS("reserved") {
    def display: Option[String] = Some("Reserved")
    def system: Option[String]  = Some("http://hl7.org/fhir/encounter-location-status")
  }
}

sealed abstract class ENCOUNTER_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object ENCOUNTER_STATUS extends FhirEnum[ENCOUNTER_STATUS] with FhirCirceEnum[ENCOUNTER_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/encounter-status"
  val values    = findValues
  case object ARRIVED extends ENCOUNTER_STATUS("arrived") {
    def display: Option[String] = Some("Arrived")
    def system: Option[String]  = Some("http://hl7.org/fhir/encounter-status")
  }
  case object CANCELLED extends ENCOUNTER_STATUS("cancelled") {
    def display: Option[String] = Some("Cancelled")
    def system: Option[String]  = Some("http://hl7.org/fhir/encounter-status")
  }
  case object ENTERED_IN_ERROR extends ENCOUNTER_STATUS("entered-in-error") {
    def display: Option[String] = Some("Entered in Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/encounter-status")
  }
  case object FINISHED extends ENCOUNTER_STATUS("finished") {
    def display: Option[String] = Some("Finished")
    def system: Option[String]  = Some("http://hl7.org/fhir/encounter-status")
  }
  case object IN_PROGRESS extends ENCOUNTER_STATUS("in-progress") {
    def display: Option[String] = Some("In Progress")
    def system: Option[String]  = Some("http://hl7.org/fhir/encounter-status")
  }
  case object ONLEAVE extends ENCOUNTER_STATUS("onleave") {
    def display: Option[String] = Some("On Leave")
    def system: Option[String]  = Some("http://hl7.org/fhir/encounter-status")
  }
  case object PLANNED extends ENCOUNTER_STATUS("planned") {
    def display: Option[String] = Some("Planned")
    def system: Option[String]  = Some("http://hl7.org/fhir/encounter-status")
  }
  case object TRIAGED extends ENCOUNTER_STATUS("triaged") {
    def display: Option[String] = Some("Triaged")
    def system: Option[String]  = Some("http://hl7.org/fhir/encounter-status")
  }
  case object UNKNOWN extends ENCOUNTER_STATUS("unknown") {
    def display: Option[String] = Some("Unknown")
    def system: Option[String]  = Some("http://hl7.org/fhir/encounter-status")
  }
}

sealed abstract class ENDPOINT_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object ENDPOINT_STATUS extends FhirEnum[ENDPOINT_STATUS] with FhirCirceEnum[ENDPOINT_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/endpoint-status"
  val values    = findValues
  case object ACTIVE extends ENDPOINT_STATUS("active") {
    def display: Option[String] = Some("Active")
    def system: Option[String]  = Some("http://hl7.org/fhir/endpoint-status")
  }
  case object ENTERED_IN_ERROR extends ENDPOINT_STATUS("entered-in-error") {
    def display: Option[String] = Some("Entered in error")
    def system: Option[String]  = Some("http://hl7.org/fhir/endpoint-status")
  }
  case object ERROR extends ENDPOINT_STATUS("error") {
    def display: Option[String] = Some("Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/endpoint-status")
  }
  case object OFF extends ENDPOINT_STATUS("off") {
    def display: Option[String] = Some("Off")
    def system: Option[String]  = Some("http://hl7.org/fhir/endpoint-status")
  }
  case object SUSPENDED extends ENDPOINT_STATUS("suspended") {
    def display: Option[String] = Some("Suspended")
    def system: Option[String]  = Some("http://hl7.org/fhir/endpoint-status")
  }
  case object TEST extends ENDPOINT_STATUS("test") {
    def display: Option[String] = Some("Test")
    def system: Option[String]  = Some("http://hl7.org/fhir/endpoint-status")
  }
}

sealed abstract class EPISODE_OF_CARE_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object EPISODE_OF_CARE_STATUS extends FhirEnum[EPISODE_OF_CARE_STATUS] with FhirCirceEnum[EPISODE_OF_CARE_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/episode-of-care-status"
  val values    = findValues
  case object ACTIVE extends EPISODE_OF_CARE_STATUS("active") {
    def display: Option[String] = Some("Active")
    def system: Option[String]  = Some("http://hl7.org/fhir/episode-of-care-status")
  }
  case object CANCELLED extends EPISODE_OF_CARE_STATUS("cancelled") {
    def display: Option[String] = Some("Cancelled")
    def system: Option[String]  = Some("http://hl7.org/fhir/episode-of-care-status")
  }
  case object ENTERED_IN_ERROR extends EPISODE_OF_CARE_STATUS("entered-in-error") {
    def display: Option[String] = Some("Entered in Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/episode-of-care-status")
  }
  case object FINISHED extends EPISODE_OF_CARE_STATUS("finished") {
    def display: Option[String] = Some("Finished")
    def system: Option[String]  = Some("http://hl7.org/fhir/episode-of-care-status")
  }
  case object ONHOLD extends EPISODE_OF_CARE_STATUS("onhold") {
    def display: Option[String] = Some("On Hold")
    def system: Option[String]  = Some("http://hl7.org/fhir/episode-of-care-status")
  }
  case object PLANNED extends EPISODE_OF_CARE_STATUS("planned") {
    def display: Option[String] = Some("Planned")
    def system: Option[String]  = Some("http://hl7.org/fhir/episode-of-care-status")
  }
  case object WAITLIST extends EPISODE_OF_CARE_STATUS("waitlist") {
    def display: Option[String] = Some("Waitlist")
    def system: Option[String]  = Some("http://hl7.org/fhir/episode-of-care-status")
  }
}

sealed abstract class EVENT_CAPABILITY_MODE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object EVENT_CAPABILITY_MODE extends FhirEnum[EVENT_CAPABILITY_MODE] with FhirCirceEnum[EVENT_CAPABILITY_MODE] {
  val reference = "http://hl7.org/fhir/ValueSet/event-capability-mode"
  val values    = findValues
  case object RECEIVER extends EVENT_CAPABILITY_MODE("receiver") {
    def display: Option[String] = Some("Receiver")
    def system: Option[String]  = Some("http://hl7.org/fhir/event-capability-mode")
  }
  case object SENDER extends EVENT_CAPABILITY_MODE("sender") {
    def display: Option[String] = Some("Sender")
    def system: Option[String]  = Some("http://hl7.org/fhir/event-capability-mode")
  }
}

sealed abstract class EVENT_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object EVENT_STATUS extends FhirEnum[EVENT_STATUS] with FhirCirceEnum[EVENT_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/event-status"
  val values    = findValues
  case object COMPLETED extends EVENT_STATUS("completed") {
    def display: Option[String] = Some("Completed")
    def system: Option[String]  = Some("http://hl7.org/fhir/event-status")
  }
  case object ENTERED_IN_ERROR extends EVENT_STATUS("entered-in-error") {
    def display: Option[String] = Some("Entered in Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/event-status")
  }
  case object IN_PROGRESS extends EVENT_STATUS("in-progress") {
    def display: Option[String] = Some("In Progress")
    def system: Option[String]  = Some("http://hl7.org/fhir/event-status")
  }
  case object NOT_DONE extends EVENT_STATUS("not-done") {
    def display: Option[String] = Some("Not Done")
    def system: Option[String]  = Some("http://hl7.org/fhir/event-status")
  }
  case object ON_HOLD extends EVENT_STATUS("on-hold") {
    def display: Option[String] = Some("On Hold")
    def system: Option[String]  = Some("http://hl7.org/fhir/event-status")
  }
  case object PREPARATION extends EVENT_STATUS("preparation") {
    def display: Option[String] = Some("Preparation")
    def system: Option[String]  = Some("http://hl7.org/fhir/event-status")
  }
  case object STOPPED extends EVENT_STATUS("stopped") {
    def display: Option[String] = Some("Stopped")
    def system: Option[String]  = Some("http://hl7.org/fhir/event-status")
  }
  case object UNKNOWN extends EVENT_STATUS("unknown") {
    def display: Option[String] = Some("Unknown")
    def system: Option[String]  = Some("http://hl7.org/fhir/event-status")
  }
}

sealed abstract class EXAMPLESCENARIO_ACTOR_TYPE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object EXAMPLESCENARIO_ACTOR_TYPE
    extends FhirEnum[EXAMPLESCENARIO_ACTOR_TYPE]
    with FhirCirceEnum[EXAMPLESCENARIO_ACTOR_TYPE] {
  val reference = "http://hl7.org/fhir/ValueSet/examplescenario-actor-type"
  val values    = findValues
  case object ENTITY extends EXAMPLESCENARIO_ACTOR_TYPE("entity") {
    def display: Option[String] = Some("System")
    def system: Option[String]  = Some("http://hl7.org/fhir/examplescenario-actor-type")
  }
  case object PERSON extends EXAMPLESCENARIO_ACTOR_TYPE("person") {
    def display: Option[String] = Some("Person")
    def system: Option[String]  = Some("http://hl7.org/fhir/examplescenario-actor-type")
  }
}

sealed abstract class EXPLANATIONOFBENEFIT_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object EXPLANATIONOFBENEFIT_STATUS
    extends FhirEnum[EXPLANATIONOFBENEFIT_STATUS]
    with FhirCirceEnum[EXPLANATIONOFBENEFIT_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/explanationofbenefit-status"
  val values    = findValues
  case object ACTIVE extends EXPLANATIONOFBENEFIT_STATUS("active") {
    def display: Option[String] = Some("Active")
    def system: Option[String]  = Some("http://hl7.org/fhir/explanationofbenefit-status")
  }
  case object CANCELLED extends EXPLANATIONOFBENEFIT_STATUS("cancelled") {
    def display: Option[String] = Some("Cancelled")
    def system: Option[String]  = Some("http://hl7.org/fhir/explanationofbenefit-status")
  }
  case object DRAFT extends EXPLANATIONOFBENEFIT_STATUS("draft") {
    def display: Option[String] = Some("Draft")
    def system: Option[String]  = Some("http://hl7.org/fhir/explanationofbenefit-status")
  }
  case object ENTERED_IN_ERROR extends EXPLANATIONOFBENEFIT_STATUS("entered-in-error") {
    def display: Option[String] = Some("Entered In Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/explanationofbenefit-status")
  }
}

sealed abstract class EXPOSURE_STATE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object EXPOSURE_STATE extends FhirEnum[EXPOSURE_STATE] with FhirCirceEnum[EXPOSURE_STATE] {
  val reference = "http://hl7.org/fhir/ValueSet/exposure-state"
  val values    = findValues
  case object EXPOSURE extends EXPOSURE_STATE("exposure") {
    def display: Option[String] = Some("Exposure")
    def system: Option[String]  = Some("http://hl7.org/fhir/exposure-state")
  }
  case object EXPOSURE_ALTERNATIVE extends EXPOSURE_STATE("exposure-alternative") {
    def display: Option[String] = Some("Exposure Alternative")
    def system: Option[String]  = Some("http://hl7.org/fhir/exposure-state")
  }
}

sealed abstract class EXTENSION_CONTEXT_TYPE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object EXTENSION_CONTEXT_TYPE extends FhirEnum[EXTENSION_CONTEXT_TYPE] with FhirCirceEnum[EXTENSION_CONTEXT_TYPE] {
  val reference = "http://hl7.org/fhir/ValueSet/extension-context-type"
  val values    = findValues
  case object ELEMENT extends EXTENSION_CONTEXT_TYPE("element") {
    def display: Option[String] = Some("Element ID")
    def system: Option[String]  = Some("http://hl7.org/fhir/extension-context-type")
  }
  case object EXTENSION extends EXTENSION_CONTEXT_TYPE("extension") {
    def display: Option[String] = Some("Extension URL")
    def system: Option[String]  = Some("http://hl7.org/fhir/extension-context-type")
  }
  case object FHIRPATH extends EXTENSION_CONTEXT_TYPE("fhirpath") {
    def display: Option[String] = Some("FHIRPath")
    def system: Option[String]  = Some("http://hl7.org/fhir/extension-context-type")
  }
}

sealed abstract class FHIR_VERSION(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object FHIR_VERSION extends FhirEnum[FHIR_VERSION] with FhirCirceEnum[FHIR_VERSION] {
  val reference = "http://hl7.org/fhir/ValueSet/FHIR-version"
  val values    = findValues
  case object `0.0.80` extends FHIR_VERSION("0.0.80") {
    def display: Option[String] = Some("0.0.80")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
  case object `0.0.81` extends FHIR_VERSION("0.0.81") {
    def display: Option[String] = Some("0.0.81")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
  case object `0.0.82` extends FHIR_VERSION("0.0.82") {
    def display: Option[String] = Some("0.0.82")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
  case object `0.01` extends FHIR_VERSION("0.01") {
    def display: Option[String] = Some("0.01")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
  case object `0.05` extends FHIR_VERSION("0.05") {
    def display: Option[String] = Some("0.05")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
  case object `0.06` extends FHIR_VERSION("0.06") {
    def display: Option[String] = Some("0.06")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
  case object `0.11` extends FHIR_VERSION("0.11") {
    def display: Option[String] = Some("0.11")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
  case object `0.4.0` extends FHIR_VERSION("0.4.0") {
    def display: Option[String] = Some("0.4.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
  case object `0.5.0` extends FHIR_VERSION("0.5.0") {
    def display: Option[String] = Some("0.5.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
  case object `1.0.0` extends FHIR_VERSION("1.0.0") {
    def display: Option[String] = Some("1.0.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
  case object `1.0.1` extends FHIR_VERSION("1.0.1") {
    def display: Option[String] = Some("1.0.1")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
  case object `1.0.2` extends FHIR_VERSION("1.0.2") {
    def display: Option[String] = Some("1.0.2")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
  case object `1.1.0` extends FHIR_VERSION("1.1.0") {
    def display: Option[String] = Some("1.1.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
  case object `1.4.0` extends FHIR_VERSION("1.4.0") {
    def display: Option[String] = Some("1.4.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
  case object `1.6.0` extends FHIR_VERSION("1.6.0") {
    def display: Option[String] = Some("1.6.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
  case object `1.8.0` extends FHIR_VERSION("1.8.0") {
    def display: Option[String] = Some("1.8.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
  case object `3.0.0` extends FHIR_VERSION("3.0.0") {
    def display: Option[String] = Some("3.0.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
  case object `3.0.1` extends FHIR_VERSION("3.0.1") {
    def display: Option[String] = Some("3.0.1")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
  case object `3.3.0` extends FHIR_VERSION("3.3.0") {
    def display: Option[String] = Some("3.3.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
  case object `3.5.0` extends FHIR_VERSION("3.5.0") {
    def display: Option[String] = Some("3.5.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
  case object `4.0.0` extends FHIR_VERSION("4.0.0") {
    def display: Option[String] = Some("4.0.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
  case object `4.0.1` extends FHIR_VERSION("4.0.1") {
    def display: Option[String] = Some("4.0.1")
    def system: Option[String]  = Some("http://hl7.org/fhir/FHIR-version")
  }
}

sealed abstract class FILTER_OPERATOR(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object FILTER_OPERATOR extends FhirEnum[FILTER_OPERATOR] with FhirCirceEnum[FILTER_OPERATOR] {
  val reference = "http://hl7.org/fhir/ValueSet/filter-operator"
  val values    = findValues
  case object DESCENDENT_OF extends FILTER_OPERATOR("descendent-of") {
    def display: Option[String] = Some("Descendent Of (by subsumption)")
    def system: Option[String]  = Some("http://hl7.org/fhir/filter-operator")
  }
  case object EQUALS extends FILTER_OPERATOR("=") {
    def display: Option[String] = Some("Equals")
    def system: Option[String]  = Some("http://hl7.org/fhir/filter-operator")
  }
  case object EXISTS extends FILTER_OPERATOR("exists") {
    def display: Option[String] = Some("Exists")
    def system: Option[String]  = Some("http://hl7.org/fhir/filter-operator")
  }
  case object GENERALIZES extends FILTER_OPERATOR("generalizes") {
    def display: Option[String] = Some("Generalizes (by Subsumption)")
    def system: Option[String]  = Some("http://hl7.org/fhir/filter-operator")
  }
  case object IN extends FILTER_OPERATOR("in") {
    def display: Option[String] = Some("In Set")
    def system: Option[String]  = Some("http://hl7.org/fhir/filter-operator")
  }
  case object IS_A extends FILTER_OPERATOR("is-a") {
    def display: Option[String] = Some("Is A (by subsumption)")
    def system: Option[String]  = Some("http://hl7.org/fhir/filter-operator")
  }
  case object IS_NOT_A extends FILTER_OPERATOR("is-not-a") {
    def display: Option[String] = Some("Not (Is A) (by subsumption)")
    def system: Option[String]  = Some("http://hl7.org/fhir/filter-operator")
  }
  case object NOT_IN_SET extends FILTER_OPERATOR("not-in") {
    def display: Option[String] = Some("Not in Set")
    def system: Option[String]  = Some("http://hl7.org/fhir/filter-operator")
  }
  case object REGEX extends FILTER_OPERATOR("regex") {
    def display: Option[String] = Some("Regular Expression")
    def system: Option[String]  = Some("http://hl7.org/fhir/filter-operator")
  }
}

sealed abstract class FLAG_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object FLAG_STATUS extends FhirEnum[FLAG_STATUS] with FhirCirceEnum[FLAG_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/flag-status"
  val values    = findValues
  case object ACTIVE extends FLAG_STATUS("active") {
    def display: Option[String] = Some("Active")
    def system: Option[String]  = Some("http://hl7.org/fhir/flag-status")
  }
  case object ENTERED_IN_ERROR extends FLAG_STATUS("entered-in-error") {
    def display: Option[String] = Some("Entered in Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/flag-status")
  }
  case object INACTIVE extends FLAG_STATUS("inactive") {
    def display: Option[String] = Some("Inactive")
    def system: Option[String]  = Some("http://hl7.org/fhir/flag-status")
  }
}

sealed abstract class FM_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object FM_STATUS extends FhirEnum[FM_STATUS] with FhirCirceEnum[FM_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/fm-status"
  val values    = findValues
  case object ACTIVE extends FM_STATUS("active") {
    def display: Option[String] = Some("Active")
    def system: Option[String]  = Some("http://hl7.org/fhir/fm-status")
  }
  case object CANCELLED extends FM_STATUS("cancelled") {
    def display: Option[String] = Some("Cancelled")
    def system: Option[String]  = Some("http://hl7.org/fhir/fm-status")
  }
  case object DRAFT extends FM_STATUS("draft") {
    def display: Option[String] = Some("Draft")
    def system: Option[String]  = Some("http://hl7.org/fhir/fm-status")
  }
  case object ENTERED_IN_ERROR extends FM_STATUS("entered-in-error") {
    def display: Option[String] = Some("Entered in Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/fm-status")
  }
}

sealed abstract class GOAL_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object GOAL_STATUS extends FhirEnum[GOAL_STATUS] with FhirCirceEnum[GOAL_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/goal-status"
  val values    = findValues
  case object ACCEPTED extends GOAL_STATUS("accepted") {
    def display: Option[String] = Some("Accepted")
    def system: Option[String]  = Some("http://hl7.org/fhir/goal-status")
  }
  case object ACTIVE extends GOAL_STATUS("active") {
    def display: Option[String] = Some("Active")
    def system: Option[String]  = Some("http://hl7.org/fhir/goal-status")
  }
  case object CANCELLED extends GOAL_STATUS("cancelled") {
    def display: Option[String] = Some("Cancelled")
    def system: Option[String]  = Some("http://hl7.org/fhir/goal-status")
  }
  case object COMPLETED extends GOAL_STATUS("completed") {
    def display: Option[String] = Some("Completed")
    def system: Option[String]  = Some("http://hl7.org/fhir/goal-status")
  }
  case object ENTERED_IN_ERROR extends GOAL_STATUS("entered-in-error") {
    def display: Option[String] = Some("Entered in Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/goal-status")
  }
  case object ON_HOLD extends GOAL_STATUS("on-hold") {
    def display: Option[String] = Some("On Hold")
    def system: Option[String]  = Some("http://hl7.org/fhir/goal-status")
  }
  case object PLANNED extends GOAL_STATUS("planned") {
    def display: Option[String] = Some("Planned")
    def system: Option[String]  = Some("http://hl7.org/fhir/goal-status")
  }
  case object PROPOSED extends GOAL_STATUS("proposed") {
    def display: Option[String] = Some("Proposed")
    def system: Option[String]  = Some("http://hl7.org/fhir/goal-status")
  }
  case object REJECTED extends GOAL_STATUS("rejected") {
    def display: Option[String] = Some("Rejected")
    def system: Option[String]  = Some("http://hl7.org/fhir/goal-status")
  }
}

sealed abstract class GRAPH_COMPARTMENT_RULE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object GRAPH_COMPARTMENT_RULE extends FhirEnum[GRAPH_COMPARTMENT_RULE] with FhirCirceEnum[GRAPH_COMPARTMENT_RULE] {
  val reference = "http://hl7.org/fhir/ValueSet/graph-compartment-rule"
  val values    = findValues
  case object CUSTOM extends GRAPH_COMPARTMENT_RULE("custom") {
    def display: Option[String] = Some("Custom")
    def system: Option[String]  = Some("http://hl7.org/fhir/graph-compartment-rule")
  }
  case object DIFFERENT extends GRAPH_COMPARTMENT_RULE("different") {
    def display: Option[String] = Some("Different")
    def system: Option[String]  = Some("http://hl7.org/fhir/graph-compartment-rule")
  }
  case object IDENTICAL extends GRAPH_COMPARTMENT_RULE("identical") {
    def display: Option[String] = Some("Identical")
    def system: Option[String]  = Some("http://hl7.org/fhir/graph-compartment-rule")
  }
  case object MATCHING extends GRAPH_COMPARTMENT_RULE("matching") {
    def display: Option[String] = Some("Matching")
    def system: Option[String]  = Some("http://hl7.org/fhir/graph-compartment-rule")
  }
}

sealed abstract class GRAPH_COMPARTMENT_USE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object GRAPH_COMPARTMENT_USE extends FhirEnum[GRAPH_COMPARTMENT_USE] with FhirCirceEnum[GRAPH_COMPARTMENT_USE] {
  val reference = "http://hl7.org/fhir/ValueSet/graph-compartment-use"
  val values    = findValues
  case object CONDITION extends GRAPH_COMPARTMENT_USE("condition") {
    def display: Option[String] = Some("Condition")
    def system: Option[String]  = Some("http://hl7.org/fhir/graph-compartment-use")
  }
  case object REQUIREMENT extends GRAPH_COMPARTMENT_USE("requirement") {
    def display: Option[String] = Some("Requirement")
    def system: Option[String]  = Some("http://hl7.org/fhir/graph-compartment-use")
  }
}

sealed abstract class GROUP_MEASURE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object GROUP_MEASURE extends FhirEnum[GROUP_MEASURE] with FhirCirceEnum[GROUP_MEASURE] {
  val reference = "http://hl7.org/fhir/ValueSet/group-measure"
  val values    = findValues
  case object MEAN extends GROUP_MEASURE("mean") {
    def display: Option[String] = Some("Mean")
    def system: Option[String]  = Some("http://hl7.org/fhir/group-measure")
  }
  case object MEAN_OF_STUDY_MEANS extends GROUP_MEASURE("mean-of-mean") {
    def display: Option[String] = Some("Mean of Study Means")
    def system: Option[String]  = Some("http://hl7.org/fhir/group-measure")
  }
  case object MEAN_OF_STUDY_MEDINS extends GROUP_MEASURE("mean-of-median") {
    def display: Option[String] = Some("Mean of Study Medins")
    def system: Option[String]  = Some("http://hl7.org/fhir/group-measure")
  }
  case object MEDIAN extends GROUP_MEASURE("median") {
    def display: Option[String] = Some("Median")
    def system: Option[String]  = Some("http://hl7.org/fhir/group-measure")
  }
  case object MEDIAN_OF_STUDY_MEANS extends GROUP_MEASURE("median-of-mean") {
    def display: Option[String] = Some("Median of Study Means")
    def system: Option[String]  = Some("http://hl7.org/fhir/group-measure")
  }
  case object MEDIAN_OF_STUDY_MEDIANS extends GROUP_MEASURE("median-of-median") {
    def display: Option[String] = Some("Median of Study Medians")
    def system: Option[String]  = Some("http://hl7.org/fhir/group-measure")
  }
}

sealed abstract class GROUP_TYPE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object GROUP_TYPE extends FhirEnum[GROUP_TYPE] with FhirCirceEnum[GROUP_TYPE] {
  val reference = "http://hl7.org/fhir/ValueSet/group-type"
  val values    = findValues
  case object ANIMAL extends GROUP_TYPE("animal") {
    def display: Option[String] = Some("Animal")
    def system: Option[String]  = Some("http://hl7.org/fhir/group-type")
  }
  case object DEVICE extends GROUP_TYPE("device") {
    def display: Option[String] = Some("Device")
    def system: Option[String]  = Some("http://hl7.org/fhir/group-type")
  }
  case object MEDICATION extends GROUP_TYPE("medication") {
    def display: Option[String] = Some("Medication")
    def system: Option[String]  = Some("http://hl7.org/fhir/group-type")
  }
  case object PERSON extends GROUP_TYPE("person") {
    def display: Option[String] = Some("Person")
    def system: Option[String]  = Some("http://hl7.org/fhir/group-type")
  }
  case object PRACTITIONER extends GROUP_TYPE("practitioner") {
    def display: Option[String] = Some("Practitioner")
    def system: Option[String]  = Some("http://hl7.org/fhir/group-type")
  }
  case object SUBSTANCE extends GROUP_TYPE("substance") {
    def display: Option[String] = Some("Substance")
    def system: Option[String]  = Some("http://hl7.org/fhir/group-type")
  }
}

sealed abstract class GUIDANCE_RESPONSE_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object GUIDANCE_RESPONSE_STATUS
    extends FhirEnum[GUIDANCE_RESPONSE_STATUS]
    with FhirCirceEnum[GUIDANCE_RESPONSE_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/guidance-response-status"
  val values    = findValues
  case object DATA_REQUESTED extends GUIDANCE_RESPONSE_STATUS("data-requested") {
    def display: Option[String] = Some("Data Requested")
    def system: Option[String]  = Some("http://hl7.org/fhir/guidance-response-status")
  }
  case object DATA_REQUIRED extends GUIDANCE_RESPONSE_STATUS("data-required") {
    def display: Option[String] = Some("Data Required")
    def system: Option[String]  = Some("http://hl7.org/fhir/guidance-response-status")
  }
  case object ENTERED_IN_ERROR extends GUIDANCE_RESPONSE_STATUS("entered-in-error") {
    def display: Option[String] = Some("Entered In Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/guidance-response-status")
  }
  case object FAILURE extends GUIDANCE_RESPONSE_STATUS("failure") {
    def display: Option[String] = Some("Failure")
    def system: Option[String]  = Some("http://hl7.org/fhir/guidance-response-status")
  }
  case object IN_PROGRESS extends GUIDANCE_RESPONSE_STATUS("in-progress") {
    def display: Option[String] = Some("In Progress")
    def system: Option[String]  = Some("http://hl7.org/fhir/guidance-response-status")
  }
  case object SUCCESS extends GUIDANCE_RESPONSE_STATUS("success") {
    def display: Option[String] = Some("Success")
    def system: Option[String]  = Some("http://hl7.org/fhir/guidance-response-status")
  }
}

sealed abstract class GUIDE_PAGE_GENERATION(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object GUIDE_PAGE_GENERATION extends FhirEnum[GUIDE_PAGE_GENERATION] with FhirCirceEnum[GUIDE_PAGE_GENERATION] {
  val reference = "http://hl7.org/fhir/ValueSet/guide-page-generation"
  val values    = findValues
  case object GENERATED extends GUIDE_PAGE_GENERATION("generated") {
    def display: Option[String] = Some("Generated")
    def system: Option[String]  = Some("http://hl7.org/fhir/guide-page-generation")
  }
  case object HTML extends GUIDE_PAGE_GENERATION("html") {
    def display: Option[String] = Some("HTML")
    def system: Option[String]  = Some("http://hl7.org/fhir/guide-page-generation")
  }
  case object MARKDOWN extends GUIDE_PAGE_GENERATION("markdown") {
    def display: Option[String] = Some("Markdown")
    def system: Option[String]  = Some("http://hl7.org/fhir/guide-page-generation")
  }
  case object XML extends GUIDE_PAGE_GENERATION("xml") {
    def display: Option[String] = Some("XML")
    def system: Option[String]  = Some("http://hl7.org/fhir/guide-page-generation")
  }
}

sealed abstract class GUIDE_PARAMETER_CODE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object GUIDE_PARAMETER_CODE extends FhirEnum[GUIDE_PARAMETER_CODE] with FhirCirceEnum[GUIDE_PARAMETER_CODE] {
  val reference = "http://hl7.org/fhir/ValueSet/guide-parameter-code"
  val values    = findValues
  case object APPLY extends GUIDE_PARAMETER_CODE("apply") {
    def display: Option[String] = Some("Apply Metadata Value")
    def system: Option[String]  = Some("http://hl7.org/fhir/guide-parameter-code")
  }
  case object BROKEN_LINKS_RULE extends GUIDE_PARAMETER_CODE("rule-broken-links") {
    def display: Option[String] = Some("Broken Links Rule")
    def system: Option[String]  = Some("http://hl7.org/fhir/guide-parameter-code")
  }
  case object EXPANSION_PROFILE extends GUIDE_PARAMETER_CODE("expansion-parameter") {
    def display: Option[String] = Some("Expansion Profile")
    def system: Option[String]  = Some("http://hl7.org/fhir/guide-parameter-code")
  }
  case object GENERATE_JSON extends GUIDE_PARAMETER_CODE("generate-json") {
    def display: Option[String] = Some("Generate JSON")
    def system: Option[String]  = Some("http://hl7.org/fhir/guide-parameter-code")
  }
  case object GENERATE_TURTLE extends GUIDE_PARAMETER_CODE("generate-turtle") {
    def display: Option[String] = Some("Generate Turtle")
    def system: Option[String]  = Some("http://hl7.org/fhir/guide-parameter-code")
  }
  case object GENERATE_XML extends GUIDE_PARAMETER_CODE("generate-xml") {
    def display: Option[String] = Some("Generate XML")
    def system: Option[String]  = Some("http://hl7.org/fhir/guide-parameter-code")
  }
  case object HTML_TEMPLATE extends GUIDE_PARAMETER_CODE("html-template") {
    def display: Option[String] = Some("HTML Template")
    def system: Option[String]  = Some("http://hl7.org/fhir/guide-parameter-code")
  }
  case object PAGES_PATH extends GUIDE_PARAMETER_CODE("path-pages") {
    def display: Option[String] = Some("Pages Path")
    def system: Option[String]  = Some("http://hl7.org/fhir/guide-parameter-code")
  }
  case object RESOURCE_PATH extends GUIDE_PARAMETER_CODE("path-resource") {
    def display: Option[String] = Some("Resource Path")
    def system: Option[String]  = Some("http://hl7.org/fhir/guide-parameter-code")
  }
  case object TERMINOLOGY_CACHE_PATH extends GUIDE_PARAMETER_CODE("path-tx-cache") {
    def display: Option[String] = Some("Terminology Cache Path")
    def system: Option[String]  = Some("http://hl7.org/fhir/guide-parameter-code")
  }
}

sealed abstract class HISTORY_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object HISTORY_STATUS extends FhirEnum[HISTORY_STATUS] with FhirCirceEnum[HISTORY_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/history-status"
  val values    = findValues
  case object COMPLETED extends HISTORY_STATUS("completed") {
    def display: Option[String] = Some("Completed")
    def system: Option[String]  = Some("http://hl7.org/fhir/history-status")
  }
  case object ENTERED_IN_ERROR extends HISTORY_STATUS("entered-in-error") {
    def display: Option[String] = Some("Entered in Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/history-status")
  }
  case object HEALTH_UNKNOWN extends HISTORY_STATUS("health-unknown") {
    def display: Option[String] = Some("Health Unknown")
    def system: Option[String]  = Some("http://hl7.org/fhir/history-status")
  }
  case object PARTIAL extends HISTORY_STATUS("partial") {
    def display: Option[String] = Some("Partial")
    def system: Option[String]  = Some("http://hl7.org/fhir/history-status")
  }
}

sealed abstract class HTTP_OPERATIONS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object HTTP_OPERATIONS extends FhirEnum[HTTP_OPERATIONS] with FhirCirceEnum[HTTP_OPERATIONS] {
  val reference = "http://hl7.org/fhir/ValueSet/http-operations"
  val values    = findValues
  case object DELETE extends HTTP_OPERATIONS("delete") {
    def display: Option[String] = Some("DELETE")
    def system: Option[String]  = Some("http://hl7.org/fhir/http-operations")
  }
  case object GET extends HTTP_OPERATIONS("get") {
    def display: Option[String] = Some("GET")
    def system: Option[String]  = Some("http://hl7.org/fhir/http-operations")
  }
  case object HEAD extends HTTP_OPERATIONS("head") {
    def display: Option[String] = Some("HEAD")
    def system: Option[String]  = Some("http://hl7.org/fhir/http-operations")
  }
  case object OPTIONS extends HTTP_OPERATIONS("options") {
    def display: Option[String] = Some("OPTIONS")
    def system: Option[String]  = Some("http://hl7.org/fhir/http-operations")
  }
  case object PATCH extends HTTP_OPERATIONS("patch") {
    def display: Option[String] = Some("PATCH")
    def system: Option[String]  = Some("http://hl7.org/fhir/http-operations")
  }
  case object POST extends HTTP_OPERATIONS("post") {
    def display: Option[String] = Some("POST")
    def system: Option[String]  = Some("http://hl7.org/fhir/http-operations")
  }
  case object PUT extends HTTP_OPERATIONS("put") {
    def display: Option[String] = Some("PUT")
    def system: Option[String]  = Some("http://hl7.org/fhir/http-operations")
  }
}

sealed abstract class HTTP_VERB(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object HTTP_VERB extends FhirEnum[HTTP_VERB] with FhirCirceEnum[HTTP_VERB] {
  val reference = "http://hl7.org/fhir/ValueSet/http-verb"
  val values    = findValues
  case object DELETE extends HTTP_VERB("DELETE") {
    def display: Option[String] = Some("DELETE")
    def system: Option[String]  = Some("http://hl7.org/fhir/http-verb")
  }
  case object GET extends HTTP_VERB("GET") {
    def display: Option[String] = Some("GET")
    def system: Option[String]  = Some("http://hl7.org/fhir/http-verb")
  }
  case object HEAD extends HTTP_VERB("HEAD") {
    def display: Option[String] = Some("HEAD")
    def system: Option[String]  = Some("http://hl7.org/fhir/http-verb")
  }
  case object PATCH extends HTTP_VERB("PATCH") {
    def display: Option[String] = Some("PATCH")
    def system: Option[String]  = Some("http://hl7.org/fhir/http-verb")
  }
  case object POST extends HTTP_VERB("POST") {
    def display: Option[String] = Some("POST")
    def system: Option[String]  = Some("http://hl7.org/fhir/http-verb")
  }
  case object PUT extends HTTP_VERB("PUT") {
    def display: Option[String] = Some("PUT")
    def system: Option[String]  = Some("http://hl7.org/fhir/http-verb")
  }
}

sealed abstract class IDENTITY_ASSURANCELEVEL(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object IDENTITY_ASSURANCELEVEL extends FhirEnum[IDENTITY_ASSURANCELEVEL] with FhirCirceEnum[IDENTITY_ASSURANCELEVEL] {
  val reference = "http://hl7.org/fhir/ValueSet/identity-assuranceLevel"
  val values    = findValues
  case object LEVEL1 extends IDENTITY_ASSURANCELEVEL("level1") {
    def display: Option[String] = Some("Level 1")
    def system: Option[String]  = Some("http://hl7.org/fhir/identity-assuranceLevel")
  }
  case object LEVEL2 extends IDENTITY_ASSURANCELEVEL("level2") {
    def display: Option[String] = Some("Level 2")
    def system: Option[String]  = Some("http://hl7.org/fhir/identity-assuranceLevel")
  }
  case object LEVEL3 extends IDENTITY_ASSURANCELEVEL("level3") {
    def display: Option[String] = Some("Level 3")
    def system: Option[String]  = Some("http://hl7.org/fhir/identity-assuranceLevel")
  }
  case object LEVEL4 extends IDENTITY_ASSURANCELEVEL("level4") {
    def display: Option[String] = Some("Level 4")
    def system: Option[String]  = Some("http://hl7.org/fhir/identity-assuranceLevel")
  }
}

sealed abstract class IMAGINGSTUDY_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object IMAGINGSTUDY_STATUS extends FhirEnum[IMAGINGSTUDY_STATUS] with FhirCirceEnum[IMAGINGSTUDY_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/imagingstudy-status"
  val values    = findValues
  case object AVAILABLE extends IMAGINGSTUDY_STATUS("available") {
    def display: Option[String] = Some("Available")
    def system: Option[String]  = Some("http://hl7.org/fhir/imagingstudy-status")
  }
  case object CANCELLED extends IMAGINGSTUDY_STATUS("cancelled") {
    def display: Option[String] = Some("Cancelled")
    def system: Option[String]  = Some("http://hl7.org/fhir/imagingstudy-status")
  }
  case object ENTERED_IN_ERROR extends IMAGINGSTUDY_STATUS("entered-in-error") {
    def display: Option[String] = Some("Entered in Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/imagingstudy-status")
  }
  case object REGISTERED extends IMAGINGSTUDY_STATUS("registered") {
    def display: Option[String] = Some("Registered")
    def system: Option[String]  = Some("http://hl7.org/fhir/imagingstudy-status")
  }
  case object UNKNOWN extends IMAGINGSTUDY_STATUS("unknown") {
    def display: Option[String] = Some("Unknown")
    def system: Option[String]  = Some("http://hl7.org/fhir/imagingstudy-status")
  }
}

sealed abstract class IMMUNIZATION_EVALUATION_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object IMMUNIZATION_EVALUATION_STATUS
    extends FhirEnum[IMMUNIZATION_EVALUATION_STATUS]
    with FhirCirceEnum[IMMUNIZATION_EVALUATION_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/immunization-evaluation-status"
  val values    = findValues
  case object COMPLETED extends IMMUNIZATION_EVALUATION_STATUS("completed") {
    def display: Option[String] = Some("completed")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/medication-admin-status")
  }
  case object ENTERED_IN_ERROR extends IMMUNIZATION_EVALUATION_STATUS("entered-in-error") {
    def display: Option[String] = Some("entered-in-error")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/medication-admin-status")
  }
}

sealed abstract class IMMUNIZATION_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object IMMUNIZATION_STATUS extends FhirEnum[IMMUNIZATION_STATUS] with FhirCirceEnum[IMMUNIZATION_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/immunization-status"
  val values    = findValues
  case object COMPLETED extends IMMUNIZATION_STATUS("completed") {
    def display: Option[String] = Some("completed")
    def system: Option[String]  = Some("http://hl7.org/fhir/event-status")
  }
  case object ENTERED_IN_ERROR extends IMMUNIZATION_STATUS("entered-in-error") {
    def display: Option[String] = Some("entered-in-error")
    def system: Option[String]  = Some("http://hl7.org/fhir/event-status")
  }
  case object NOT_DONE extends IMMUNIZATION_STATUS("not-done") {
    def display: Option[String] = Some("not-done")
    def system: Option[String]  = Some("http://hl7.org/fhir/event-status")
  }
}

sealed abstract class INVOICE_PRICECOMPONENTTYPE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object INVOICE_PRICECOMPONENTTYPE
    extends FhirEnum[INVOICE_PRICECOMPONENTTYPE]
    with FhirCirceEnum[INVOICE_PRICECOMPONENTTYPE] {
  val reference = "http://hl7.org/fhir/ValueSet/invoice-priceComponentType"
  val values    = findValues
  case object BASE extends INVOICE_PRICECOMPONENTTYPE("base") {
    def display: Option[String] = Some("base price")
    def system: Option[String]  = Some("http://hl7.org/fhir/invoice-priceComponentType")
  }
  case object DEDUCTION extends INVOICE_PRICECOMPONENTTYPE("deduction") {
    def display: Option[String] = Some("deduction")
    def system: Option[String]  = Some("http://hl7.org/fhir/invoice-priceComponentType")
  }
  case object DISCOUNT extends INVOICE_PRICECOMPONENTTYPE("discount") {
    def display: Option[String] = Some("discount")
    def system: Option[String]  = Some("http://hl7.org/fhir/invoice-priceComponentType")
  }
  case object INFORMATIONAL extends INVOICE_PRICECOMPONENTTYPE("informational") {
    def display: Option[String] = Some("informational")
    def system: Option[String]  = Some("http://hl7.org/fhir/invoice-priceComponentType")
  }
  case object SURCHARGE extends INVOICE_PRICECOMPONENTTYPE("surcharge") {
    def display: Option[String] = Some("surcharge")
    def system: Option[String]  = Some("http://hl7.org/fhir/invoice-priceComponentType")
  }
  case object TAX extends INVOICE_PRICECOMPONENTTYPE("tax") {
    def display: Option[String] = Some("tax")
    def system: Option[String]  = Some("http://hl7.org/fhir/invoice-priceComponentType")
  }
}

sealed abstract class INVOICE_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object INVOICE_STATUS extends FhirEnum[INVOICE_STATUS] with FhirCirceEnum[INVOICE_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/invoice-status"
  val values    = findValues
  case object BALANCED extends INVOICE_STATUS("balanced") {
    def display: Option[String] = Some("balanced")
    def system: Option[String]  = Some("http://hl7.org/fhir/invoice-status")
  }
  case object CANCELLED extends INVOICE_STATUS("cancelled") {
    def display: Option[String] = Some("cancelled")
    def system: Option[String]  = Some("http://hl7.org/fhir/invoice-status")
  }
  case object DRAFT extends INVOICE_STATUS("draft") {
    def display: Option[String] = Some("draft")
    def system: Option[String]  = Some("http://hl7.org/fhir/invoice-status")
  }
  case object ENTERED_IN_ERROR extends INVOICE_STATUS("entered-in-error") {
    def display: Option[String] = Some("entered in error")
    def system: Option[String]  = Some("http://hl7.org/fhir/invoice-status")
  }
  case object ISSUED extends INVOICE_STATUS("issued") {
    def display: Option[String] = Some("issued")
    def system: Option[String]  = Some("http://hl7.org/fhir/invoice-status")
  }
}

sealed abstract class ISSUE_SEVERITY(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object ISSUE_SEVERITY extends FhirEnum[ISSUE_SEVERITY] with FhirCirceEnum[ISSUE_SEVERITY] {
  val reference = "http://hl7.org/fhir/ValueSet/issue-severity"
  val values    = findValues
  case object ERROR extends ISSUE_SEVERITY("error") {
    def display: Option[String] = Some("Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/issue-severity")
  }
  case object FATAL extends ISSUE_SEVERITY("fatal") {
    def display: Option[String] = Some("Fatal")
    def system: Option[String]  = Some("http://hl7.org/fhir/issue-severity")
  }
  case object INFORMATION extends ISSUE_SEVERITY("information") {
    def display: Option[String] = Some("Information")
    def system: Option[String]  = Some("http://hl7.org/fhir/issue-severity")
  }
  case object WARNING extends ISSUE_SEVERITY("warning") {
    def display: Option[String] = Some("Warning")
    def system: Option[String]  = Some("http://hl7.org/fhir/issue-severity")
  }
}

sealed abstract class ISSUE_TYPE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object ISSUE_TYPE extends FhirEnum[ISSUE_TYPE] with FhirCirceEnum[ISSUE_TYPE] {
  val reference = "http://hl7.org/fhir/ValueSet/issue-type"
  val values    = findValues
  case object BUSINESS_RULE_VIOLATION extends ISSUE_TYPE("business-rule") {
    def display: Option[String] = Some("Business Rule Violation")
    def system: Option[String]  = Some("http://hl7.org/fhir/issue-type")
  }
  case object CONFLICT extends ISSUE_TYPE("conflict") {
    def display: Option[String] = Some("Edit Version Conflict")
    def system: Option[String]  = Some("http://hl7.org/fhir/issue-type")
  }
  case object CONTENT_NOT_SUPPORTED extends ISSUE_TYPE("not-supported") {
    def display: Option[String] = Some("Content not supported")
    def system: Option[String]  = Some("http://hl7.org/fhir/issue-type")
  }
  case object CONTENT_TOO_LONG extends ISSUE_TYPE("too-long") {
    def display: Option[String] = Some("Content Too Long")
    def system: Option[String]  = Some("http://hl7.org/fhir/issue-type")
  }
  case object DELETED extends ISSUE_TYPE("deleted") {
    def display: Option[String] = Some("Deleted")
    def system: Option[String]  = Some("http://hl7.org/fhir/issue-type")
  }
  case object DUPLICATE extends ISSUE_TYPE("duplicate") {
    def display: Option[String] = Some("Duplicate")
    def system: Option[String]  = Some("http://hl7.org/fhir/issue-type")
  }
  case object EXCEPTION extends ISSUE_TYPE("exception") {
    def display: Option[String] = Some("Exception")
    def system: Option[String]  = Some("http://hl7.org/fhir/issue-type")
  }
  case object EXPIRED extends ISSUE_TYPE("expired") {
    def display: Option[String] = Some("Session Expired")
    def system: Option[String]  = Some("http://hl7.org/fhir/issue-type")
  }
  case object EXTENSION extends ISSUE_TYPE("extension") {
    def display: Option[String] = Some("Unacceptable Extension")
    def system: Option[String]  = Some("http://hl7.org/fhir/issue-type")
  }
  case object FORBIDDEN extends ISSUE_TYPE("forbidden") {
    def display: Option[String] = Some("Forbidden")
    def system: Option[String]  = Some("http://hl7.org/fhir/issue-type")
  }
  case object INCOMPLETE extends ISSUE_TYPE("incomplete") {
    def display: Option[String] = Some("Incomplete Results")
    def system: Option[String]  = Some("http://hl7.org/fhir/issue-type")
  }
  case object INFORMATIONAL extends ISSUE_TYPE("informational") {
    def display: Option[String] = Some("Informational Note")
    def system: Option[String]  = Some("http://hl7.org/fhir/issue-type")
  }
  case object INVALID extends ISSUE_TYPE("invalid") {
    def display: Option[String] = Some("Invalid Content")
    def system: Option[String]  = Some("http://hl7.org/fhir/issue-type")
  }
  case object INVALID_CODE extends ISSUE_TYPE("code-invalid") {
    def display: Option[String] = Some("Invalid Code")
    def system: Option[String]  = Some("http://hl7.org/fhir/issue-type")
  }
  case object INVARIANT extends ISSUE_TYPE("invariant") {
    def display: Option[String] = Some("Validation rule failed")
    def system: Option[String]  = Some("http://hl7.org/fhir/issue-type")
  }
  case object LOCK_ERROR extends ISSUE_TYPE("lock-error") {
    def display: Option[String] = Some("Lock Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/issue-type")
  }
  case object LOGIN extends ISSUE_TYPE("login") {
    def display: Option[String] = Some("Login Required")
    def system: Option[String]  = Some("http://hl7.org/fhir/issue-type")
  }
  case object MULTIPLE_MATCHES extends ISSUE_TYPE("multiple-matches") {
    def display: Option[String] = Some("Multiple Matches")
    def system: Option[String]  = Some("http://hl7.org/fhir/issue-type")
  }
  case object NOT_FOUND extends ISSUE_TYPE("not-found") {
    def display: Option[String] = Some("Not Found")
    def system: Option[String]  = Some("http://hl7.org/fhir/issue-type")
  }
  case object NO_STORE_AVAILABLE extends ISSUE_TYPE("no-store") {
    def display: Option[String] = Some("No Store Available")
    def system: Option[String]  = Some("http://hl7.org/fhir/issue-type")
  }
  case object OPERATION_TOO_COSTLY extends ISSUE_TYPE("too-costly") {
    def display: Option[String] = Some("Operation Too Costly")
    def system: Option[String]  = Some("http://hl7.org/fhir/issue-type")
  }
  case object PROCESSING extends ISSUE_TYPE("processing") {
    def display: Option[String] = Some("Processing Failure")
    def system: Option[String]  = Some("http://hl7.org/fhir/issue-type")
  }
  case object REQUIRED extends ISSUE_TYPE("required") {
    def display: Option[String] = Some("Required element missing")
    def system: Option[String]  = Some("http://hl7.org/fhir/issue-type")
  }
  case object SECURITY extends ISSUE_TYPE("security") {
    def display: Option[String] = Some("Security Problem")
    def system: Option[String]  = Some("http://hl7.org/fhir/issue-type")
  }
  case object STRUCTURE extends ISSUE_TYPE("structure") {
    def display: Option[String] = Some("Structural Issue")
    def system: Option[String]  = Some("http://hl7.org/fhir/issue-type")
  }
  case object SUPPRESSED extends ISSUE_TYPE("suppressed") {
    def display: Option[String] = Some("Information  Suppressed")
    def system: Option[String]  = Some("http://hl7.org/fhir/issue-type")
  }
  case object THROTTLED extends ISSUE_TYPE("throttled") {
    def display: Option[String] = Some("Throttled")
    def system: Option[String]  = Some("http://hl7.org/fhir/issue-type")
  }
  case object TIMEOUT extends ISSUE_TYPE("timeout") {
    def display: Option[String] = Some("Timeout")
    def system: Option[String]  = Some("http://hl7.org/fhir/issue-type")
  }
  case object TRANSIENT extends ISSUE_TYPE("transient") {
    def display: Option[String] = Some("Transient Issue")
    def system: Option[String]  = Some("http://hl7.org/fhir/issue-type")
  }
  case object UNKNOWN extends ISSUE_TYPE("unknown") {
    def display: Option[String] = Some("Unknown User")
    def system: Option[String]  = Some("http://hl7.org/fhir/issue-type")
  }
  case object VALUE extends ISSUE_TYPE("value") {
    def display: Option[String] = Some("Element value invalid")
    def system: Option[String]  = Some("http://hl7.org/fhir/issue-type")
  }
}

sealed abstract class ITEM_TYPE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object ITEM_TYPE extends FhirEnum[ITEM_TYPE] with FhirCirceEnum[ITEM_TYPE] {
  val reference = "http://hl7.org/fhir/ValueSet/item-type"
  val values    = findValues
  case object ATTACHMENT extends ITEM_TYPE("attachment") {
    def display: Option[String] = Some("Attachment")
    def system: Option[String]  = Some("http://hl7.org/fhir/item-type")
  }
  case object BOOLEAN extends ITEM_TYPE("boolean") {
    def display: Option[String] = Some("Boolean")
    def system: Option[String]  = Some("http://hl7.org/fhir/item-type")
  }
  case object CHOICE extends ITEM_TYPE("choice") {
    def display: Option[String] = Some("Choice")
    def system: Option[String]  = Some("http://hl7.org/fhir/item-type")
  }
  case object DATE extends ITEM_TYPE("date") {
    def display: Option[String] = Some("Date")
    def system: Option[String]  = Some("http://hl7.org/fhir/item-type")
  }
  case object DATETIME extends ITEM_TYPE("dateTime") {
    def display: Option[String] = Some("Date Time")
    def system: Option[String]  = Some("http://hl7.org/fhir/item-type")
  }
  case object DECIMAL extends ITEM_TYPE("decimal") {
    def display: Option[String] = Some("Decimal")
    def system: Option[String]  = Some("http://hl7.org/fhir/item-type")
  }
  case object DISPLAY extends ITEM_TYPE("display") {
    def display: Option[String] = Some("Display")
    def system: Option[String]  = Some("http://hl7.org/fhir/item-type")
  }
  case object GROUP extends ITEM_TYPE("group") {
    def display: Option[String] = Some("Group")
    def system: Option[String]  = Some("http://hl7.org/fhir/item-type")
  }
  case object INTEGER extends ITEM_TYPE("integer") {
    def display: Option[String] = Some("Integer")
    def system: Option[String]  = Some("http://hl7.org/fhir/item-type")
  }
  case object OPEN_CHOICE extends ITEM_TYPE("open-choice") {
    def display: Option[String] = Some("Open Choice")
    def system: Option[String]  = Some("http://hl7.org/fhir/item-type")
  }
  case object QUANTITY extends ITEM_TYPE("quantity") {
    def display: Option[String] = Some("Quantity")
    def system: Option[String]  = Some("http://hl7.org/fhir/item-type")
  }
  case object QUESTION extends ITEM_TYPE("question") {
    def display: Option[String] = Some("Question")
    def system: Option[String]  = Some("http://hl7.org/fhir/item-type")
  }
  case object REFERENCE extends ITEM_TYPE("reference") {
    def display: Option[String] = Some("Reference")
    def system: Option[String]  = Some("http://hl7.org/fhir/item-type")
  }
  case object STRING extends ITEM_TYPE("string") {
    def display: Option[String] = Some("String")
    def system: Option[String]  = Some("http://hl7.org/fhir/item-type")
  }
  case object TEXT extends ITEM_TYPE("text") {
    def display: Option[String] = Some("Text")
    def system: Option[String]  = Some("http://hl7.org/fhir/item-type")
  }
  case object TIME extends ITEM_TYPE("time") {
    def display: Option[String] = Some("Time")
    def system: Option[String]  = Some("http://hl7.org/fhir/item-type")
  }
  case object URL extends ITEM_TYPE("url") {
    def display: Option[String] = Some("Url")
    def system: Option[String]  = Some("http://hl7.org/fhir/item-type")
  }
}

sealed abstract class LINKAGE_TYPE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object LINKAGE_TYPE extends FhirEnum[LINKAGE_TYPE] with FhirCirceEnum[LINKAGE_TYPE] {
  val reference = "http://hl7.org/fhir/ValueSet/linkage-type"
  val values    = findValues
  case object ALTERNATE extends LINKAGE_TYPE("alternate") {
    def display: Option[String] = Some("Alternate Record")
    def system: Option[String]  = Some("http://hl7.org/fhir/linkage-type")
  }
  case object HISTORICAL extends LINKAGE_TYPE("historical") {
    def display: Option[String] = Some("Historical/Obsolete Record")
    def system: Option[String]  = Some("http://hl7.org/fhir/linkage-type")
  }
  case object SOURCE extends LINKAGE_TYPE("source") {
    def display: Option[String] = Some("Source of Truth")
    def system: Option[String]  = Some("http://hl7.org/fhir/linkage-type")
  }
}

sealed abstract class LINK_TYPE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object LINK_TYPE extends FhirEnum[LINK_TYPE] with FhirCirceEnum[LINK_TYPE] {
  val reference = "http://hl7.org/fhir/ValueSet/link-type"
  val values    = findValues
  case object REFER extends LINK_TYPE("refer") {
    def display: Option[String] = Some("Refer")
    def system: Option[String]  = Some("http://hl7.org/fhir/link-type")
  }
  case object REPLACED_BY extends LINK_TYPE("replaced-by") {
    def display: Option[String] = Some("Replaced-by")
    def system: Option[String]  = Some("http://hl7.org/fhir/link-type")
  }
  case object REPLACES extends LINK_TYPE("replaces") {
    def display: Option[String] = Some("Replaces")
    def system: Option[String]  = Some("http://hl7.org/fhir/link-type")
  }
  case object SEEALSO extends LINK_TYPE("seealso") {
    def display: Option[String] = Some("See also")
    def system: Option[String]  = Some("http://hl7.org/fhir/link-type")
  }
}

sealed abstract class LIST_MODE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object LIST_MODE extends FhirEnum[LIST_MODE] with FhirCirceEnum[LIST_MODE] {
  val reference = "http://hl7.org/fhir/ValueSet/list-mode"
  val values    = findValues
  case object CHANGES extends LIST_MODE("changes") {
    def display: Option[String] = Some("Change List")
    def system: Option[String]  = Some("http://hl7.org/fhir/list-mode")
  }
  case object SNAPSHOT extends LIST_MODE("snapshot") {
    def display: Option[String] = Some("Snapshot List")
    def system: Option[String]  = Some("http://hl7.org/fhir/list-mode")
  }
  case object WORKING extends LIST_MODE("working") {
    def display: Option[String] = Some("Working List")
    def system: Option[String]  = Some("http://hl7.org/fhir/list-mode")
  }
}

sealed abstract class LIST_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object LIST_STATUS extends FhirEnum[LIST_STATUS] with FhirCirceEnum[LIST_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/list-status"
  val values    = findValues
  case object CURRENT extends LIST_STATUS("current") {
    def display: Option[String] = Some("Current")
    def system: Option[String]  = Some("http://hl7.org/fhir/list-status")
  }
  case object ENTERED_IN_ERROR extends LIST_STATUS("entered-in-error") {
    def display: Option[String] = Some("Entered In Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/list-status")
  }
  case object RETIRED extends LIST_STATUS("retired") {
    def display: Option[String] = Some("Retired")
    def system: Option[String]  = Some("http://hl7.org/fhir/list-status")
  }
}

sealed abstract class LOCATION_MODE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object LOCATION_MODE extends FhirEnum[LOCATION_MODE] with FhirCirceEnum[LOCATION_MODE] {
  val reference = "http://hl7.org/fhir/ValueSet/location-mode"
  val values    = findValues
  case object INSTANCE extends LOCATION_MODE("instance") {
    def display: Option[String] = Some("Instance")
    def system: Option[String]  = Some("http://hl7.org/fhir/location-mode")
  }
  case object KIND extends LOCATION_MODE("kind") {
    def display: Option[String] = Some("Kind")
    def system: Option[String]  = Some("http://hl7.org/fhir/location-mode")
  }
}

sealed abstract class LOCATION_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object LOCATION_STATUS extends FhirEnum[LOCATION_STATUS] with FhirCirceEnum[LOCATION_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/location-status"
  val values    = findValues
  case object ACTIVE extends LOCATION_STATUS("active") {
    def display: Option[String] = Some("Active")
    def system: Option[String]  = Some("http://hl7.org/fhir/location-status")
  }
  case object INACTIVE extends LOCATION_STATUS("inactive") {
    def display: Option[String] = Some("Inactive")
    def system: Option[String]  = Some("http://hl7.org/fhir/location-status")
  }
  case object SUSPENDED extends LOCATION_STATUS("suspended") {
    def display: Option[String] = Some("Suspended")
    def system: Option[String]  = Some("http://hl7.org/fhir/location-status")
  }
}

sealed abstract class MAP_CONTEXT_TYPE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object MAP_CONTEXT_TYPE extends FhirEnum[MAP_CONTEXT_TYPE] with FhirCirceEnum[MAP_CONTEXT_TYPE] {
  val reference = "http://hl7.org/fhir/ValueSet/map-context-type"
  val values    = findValues
  case object TYPE extends MAP_CONTEXT_TYPE("type") {
    def display: Option[String] = Some("Type")
    def system: Option[String]  = Some("http://hl7.org/fhir/map-context-type")
  }
  case object VARIABLE extends MAP_CONTEXT_TYPE("variable") {
    def display: Option[String] = Some("Variable")
    def system: Option[String]  = Some("http://hl7.org/fhir/map-context-type")
  }
}

sealed abstract class MAP_GROUP_TYPE_MODE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object MAP_GROUP_TYPE_MODE extends FhirEnum[MAP_GROUP_TYPE_MODE] with FhirCirceEnum[MAP_GROUP_TYPE_MODE] {
  val reference = "http://hl7.org/fhir/ValueSet/map-group-type-mode"
  val values    = findValues
  case object NONE extends MAP_GROUP_TYPE_MODE("none") {
    def display: Option[String] = Some("Not a Default")
    def system: Option[String]  = Some("http://hl7.org/fhir/map-group-type-mode")
  }
  case object TYPES extends MAP_GROUP_TYPE_MODE("types") {
    def display: Option[String] = Some("Default for Type Combination")
    def system: Option[String]  = Some("http://hl7.org/fhir/map-group-type-mode")
  }
  case object TYPE_AND_TYPES extends MAP_GROUP_TYPE_MODE("type-and-types") {
    def display: Option[String] = Some("Default for type + combination")
    def system: Option[String]  = Some("http://hl7.org/fhir/map-group-type-mode")
  }
}

sealed abstract class MAP_INPUT_MODE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object MAP_INPUT_MODE extends FhirEnum[MAP_INPUT_MODE] with FhirCirceEnum[MAP_INPUT_MODE] {
  val reference = "http://hl7.org/fhir/ValueSet/map-input-mode"
  val values    = findValues
  case object SOURCE extends MAP_INPUT_MODE("source") {
    def display: Option[String] = Some("Source Instance")
    def system: Option[String]  = Some("http://hl7.org/fhir/map-input-mode")
  }
  case object TARGET extends MAP_INPUT_MODE("target") {
    def display: Option[String] = Some("Target Instance")
    def system: Option[String]  = Some("http://hl7.org/fhir/map-input-mode")
  }
}

sealed abstract class MAP_MODEL_MODE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object MAP_MODEL_MODE extends FhirEnum[MAP_MODEL_MODE] with FhirCirceEnum[MAP_MODEL_MODE] {
  val reference = "http://hl7.org/fhir/ValueSet/map-model-mode"
  val values    = findValues
  case object PRODUCED extends MAP_MODEL_MODE("produced") {
    def display: Option[String] = Some("Produced Structure Definition")
    def system: Option[String]  = Some("http://hl7.org/fhir/map-model-mode")
  }
  case object QUERIED extends MAP_MODEL_MODE("queried") {
    def display: Option[String] = Some("Queried Structure Definition")
    def system: Option[String]  = Some("http://hl7.org/fhir/map-model-mode")
  }
  case object SOURCE extends MAP_MODEL_MODE("source") {
    def display: Option[String] = Some("Source Structure Definition")
    def system: Option[String]  = Some("http://hl7.org/fhir/map-model-mode")
  }
  case object TARGET extends MAP_MODEL_MODE("target") {
    def display: Option[String] = Some("Target Structure Definition")
    def system: Option[String]  = Some("http://hl7.org/fhir/map-model-mode")
  }
}

sealed abstract class MAP_SOURCE_LIST_MODE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object MAP_SOURCE_LIST_MODE extends FhirEnum[MAP_SOURCE_LIST_MODE] with FhirCirceEnum[MAP_SOURCE_LIST_MODE] {
  val reference = "http://hl7.org/fhir/ValueSet/map-source-list-mode"
  val values    = findValues
  case object FIRST extends MAP_SOURCE_LIST_MODE("first") {
    def display: Option[String] = Some("First")
    def system: Option[String]  = Some("http://hl7.org/fhir/map-source-list-mode")
  }
  case object LAST extends MAP_SOURCE_LIST_MODE("last") {
    def display: Option[String] = Some("Last")
    def system: Option[String]  = Some("http://hl7.org/fhir/map-source-list-mode")
  }
  case object NOT_FIRST extends MAP_SOURCE_LIST_MODE("not_first") {
    def display: Option[String] = Some("All but the first")
    def system: Option[String]  = Some("http://hl7.org/fhir/map-source-list-mode")
  }
  case object NOT_LAST extends MAP_SOURCE_LIST_MODE("not_last") {
    def display: Option[String] = Some("All but the last")
    def system: Option[String]  = Some("http://hl7.org/fhir/map-source-list-mode")
  }
  case object ONLY_ONE extends MAP_SOURCE_LIST_MODE("only_one") {
    def display: Option[String] = Some("Enforce only one")
    def system: Option[String]  = Some("http://hl7.org/fhir/map-source-list-mode")
  }
}

sealed abstract class MAP_TARGET_LIST_MODE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object MAP_TARGET_LIST_MODE extends FhirEnum[MAP_TARGET_LIST_MODE] with FhirCirceEnum[MAP_TARGET_LIST_MODE] {
  val reference = "http://hl7.org/fhir/ValueSet/map-target-list-mode"
  val values    = findValues
  case object COLLATE extends MAP_TARGET_LIST_MODE("collate") {
    def display: Option[String] = Some("Collate")
    def system: Option[String]  = Some("http://hl7.org/fhir/map-target-list-mode")
  }
  case object FIRST extends MAP_TARGET_LIST_MODE("first") {
    def display: Option[String] = Some("First")
    def system: Option[String]  = Some("http://hl7.org/fhir/map-target-list-mode")
  }
  case object LAST extends MAP_TARGET_LIST_MODE("last") {
    def display: Option[String] = Some("Last")
    def system: Option[String]  = Some("http://hl7.org/fhir/map-target-list-mode")
  }
  case object SHARE extends MAP_TARGET_LIST_MODE("share") {
    def display: Option[String] = Some("Share")
    def system: Option[String]  = Some("http://hl7.org/fhir/map-target-list-mode")
  }
}

sealed abstract class MAP_TRANSFORM(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object MAP_TRANSFORM extends FhirEnum[MAP_TRANSFORM] with FhirCirceEnum[MAP_TRANSFORM] {
  val reference = "http://hl7.org/fhir/ValueSet/map-transform"
  val values    = findValues
  case object APPEND extends MAP_TRANSFORM("append") {
    def display: Option[String] = Some("append")
    def system: Option[String]  = Some("http://hl7.org/fhir/map-transform")
  }
  case object C extends MAP_TRANSFORM("c") {
    def display: Option[String] = Some("c")
    def system: Option[String]  = Some("http://hl7.org/fhir/map-transform")
  }
  case object CAST extends MAP_TRANSFORM("cast") {
    def display: Option[String] = Some("cast")
    def system: Option[String]  = Some("http://hl7.org/fhir/map-transform")
  }
  case object CC extends MAP_TRANSFORM("cc") {
    def display: Option[String] = Some("cc")
    def system: Option[String]  = Some("http://hl7.org/fhir/map-transform")
  }
  case object COPY extends MAP_TRANSFORM("copy") {
    def display: Option[String] = Some("copy")
    def system: Option[String]  = Some("http://hl7.org/fhir/map-transform")
  }
  case object CP extends MAP_TRANSFORM("cp") {
    def display: Option[String] = Some("cp")
    def system: Option[String]  = Some("http://hl7.org/fhir/map-transform")
  }
  case object CREATE extends MAP_TRANSFORM("create") {
    def display: Option[String] = Some("create")
    def system: Option[String]  = Some("http://hl7.org/fhir/map-transform")
  }
  case object DATEOP extends MAP_TRANSFORM("dateOp") {
    def display: Option[String] = Some("dateOp")
    def system: Option[String]  = Some("http://hl7.org/fhir/map-transform")
  }
  case object ESCAPE extends MAP_TRANSFORM("escape") {
    def display: Option[String] = Some("escape")
    def system: Option[String]  = Some("http://hl7.org/fhir/map-transform")
  }
  case object EVALUATE extends MAP_TRANSFORM("evaluate") {
    def display: Option[String] = Some("evaluate")
    def system: Option[String]  = Some("http://hl7.org/fhir/map-transform")
  }
  case object ID extends MAP_TRANSFORM("id") {
    def display: Option[String] = Some("id")
    def system: Option[String]  = Some("http://hl7.org/fhir/map-transform")
  }
  case object POINTER extends MAP_TRANSFORM("pointer") {
    def display: Option[String] = Some("pointer")
    def system: Option[String]  = Some("http://hl7.org/fhir/map-transform")
  }
  case object QTY extends MAP_TRANSFORM("qty") {
    def display: Option[String] = Some("qty")
    def system: Option[String]  = Some("http://hl7.org/fhir/map-transform")
  }
  case object REFERENCE extends MAP_TRANSFORM("reference") {
    def display: Option[String] = Some("reference")
    def system: Option[String]  = Some("http://hl7.org/fhir/map-transform")
  }
  case object TRANSLATE extends MAP_TRANSFORM("translate") {
    def display: Option[String] = Some("translate")
    def system: Option[String]  = Some("http://hl7.org/fhir/map-transform")
  }
  case object TRUNCATE extends MAP_TRANSFORM("truncate") {
    def display: Option[String] = Some("truncate")
    def system: Option[String]  = Some("http://hl7.org/fhir/map-transform")
  }
  case object UUID extends MAP_TRANSFORM("uuid") {
    def display: Option[String] = Some("uuid")
    def system: Option[String]  = Some("http://hl7.org/fhir/map-transform")
  }
}

sealed abstract class MEASURE_REPORT_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object MEASURE_REPORT_STATUS extends FhirEnum[MEASURE_REPORT_STATUS] with FhirCirceEnum[MEASURE_REPORT_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/measure-report-status"
  val values    = findValues
  case object COMPLETE extends MEASURE_REPORT_STATUS("complete") {
    def display: Option[String] = Some("Complete")
    def system: Option[String]  = Some("http://hl7.org/fhir/measure-report-status")
  }
  case object ERROR extends MEASURE_REPORT_STATUS("error") {
    def display: Option[String] = Some("Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/measure-report-status")
  }
  case object PENDING extends MEASURE_REPORT_STATUS("pending") {
    def display: Option[String] = Some("Pending")
    def system: Option[String]  = Some("http://hl7.org/fhir/measure-report-status")
  }
}

sealed abstract class MEASURE_REPORT_TYPE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object MEASURE_REPORT_TYPE extends FhirEnum[MEASURE_REPORT_TYPE] with FhirCirceEnum[MEASURE_REPORT_TYPE] {
  val reference = "http://hl7.org/fhir/ValueSet/measure-report-type"
  val values    = findValues
  case object DATA_COLLECTION extends MEASURE_REPORT_TYPE("data-collection") {
    def display: Option[String] = Some("Data Collection")
    def system: Option[String]  = Some("http://hl7.org/fhir/measure-report-type")
  }
  case object INDIVIDUAL extends MEASURE_REPORT_TYPE("individual") {
    def display: Option[String] = Some("Individual")
    def system: Option[String]  = Some("http://hl7.org/fhir/measure-report-type")
  }
  case object SUBJECT_LIST extends MEASURE_REPORT_TYPE("subject-list") {
    def display: Option[String] = Some("Subject List")
    def system: Option[String]  = Some("http://hl7.org/fhir/measure-report-type")
  }
  case object SUMMARY extends MEASURE_REPORT_TYPE("summary") {
    def display: Option[String] = Some("Summary")
    def system: Option[String]  = Some("http://hl7.org/fhir/measure-report-type")
  }
}

sealed abstract class MEDICATIONDISPENSE_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object MEDICATIONDISPENSE_STATUS
    extends FhirEnum[MEDICATIONDISPENSE_STATUS]
    with FhirCirceEnum[MEDICATIONDISPENSE_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/medicationdispense-status"
  val values    = findValues
  case object CANCELLED extends MEDICATIONDISPENSE_STATUS("cancelled") {
    def display: Option[String] = Some("Cancelled")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/medicationdispense-status")
  }
  case object COMPLETED extends MEDICATIONDISPENSE_STATUS("completed") {
    def display: Option[String] = Some("Completed")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/medicationdispense-status")
  }
  case object DECLINED extends MEDICATIONDISPENSE_STATUS("declined") {
    def display: Option[String] = Some("Declined")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/medicationdispense-status")
  }
  case object ENTERED_IN_ERROR extends MEDICATIONDISPENSE_STATUS("entered-in-error") {
    def display: Option[String] = Some("Entered in Error")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/medicationdispense-status")
  }
  case object IN_PROGRESS extends MEDICATIONDISPENSE_STATUS("in-progress") {
    def display: Option[String] = Some("In Progress")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/medicationdispense-status")
  }
  case object ON_HOLD extends MEDICATIONDISPENSE_STATUS("on-hold") {
    def display: Option[String] = Some("On Hold")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/medicationdispense-status")
  }
  case object PREPARATION extends MEDICATIONDISPENSE_STATUS("preparation") {
    def display: Option[String] = Some("Preparation")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/medicationdispense-status")
  }
  case object STOPPED extends MEDICATIONDISPENSE_STATUS("stopped") {
    def display: Option[String] = Some("Stopped")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/medicationdispense-status")
  }
  case object UNKNOWN extends MEDICATIONDISPENSE_STATUS("unknown") {
    def display: Option[String] = Some("Unknown")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/medicationdispense-status")
  }
}

sealed abstract class MEDICATIONKNOWLEDGE_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object MEDICATIONKNOWLEDGE_STATUS
    extends FhirEnum[MEDICATIONKNOWLEDGE_STATUS]
    with FhirCirceEnum[MEDICATIONKNOWLEDGE_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/medicationknowledge-status"
  val values    = findValues
  case object ACTIVE extends MEDICATIONKNOWLEDGE_STATUS("active") {
    def display: Option[String] = Some("Active")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/medicationknowledge-status")
  }
  case object ENTERED_IN_ERROR extends MEDICATIONKNOWLEDGE_STATUS("entered-in-error") {
    def display: Option[String] = Some("Entered in Error")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/medicationknowledge-status")
  }
  case object INACTIVE extends MEDICATIONKNOWLEDGE_STATUS("inactive") {
    def display: Option[String] = Some("Inactive")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/medicationknowledge-status")
  }
}

sealed abstract class MEDICATIONREQUEST_INTENT(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object MEDICATIONREQUEST_INTENT
    extends FhirEnum[MEDICATIONREQUEST_INTENT]
    with FhirCirceEnum[MEDICATIONREQUEST_INTENT] {
  val reference = "http://hl7.org/fhir/ValueSet/medicationrequest-intent"
  val values    = findValues
  case object FILLER_ORDER extends MEDICATIONREQUEST_INTENT("filler-order") {
    def display: Option[String] = Some("Filler Order")
    def system: Option[String]  = Some("http://hl7.org/fhir/CodeSystem/medicationrequest-intent")
  }
  case object INSTANCE_ORDER extends MEDICATIONREQUEST_INTENT("instance-order") {
    def display: Option[String] = Some("Instance Order")
    def system: Option[String]  = Some("http://hl7.org/fhir/CodeSystem/medicationrequest-intent")
  }
  case object OPTION extends MEDICATIONREQUEST_INTENT("option") {
    def display: Option[String] = Some("Option")
    def system: Option[String]  = Some("http://hl7.org/fhir/CodeSystem/medicationrequest-intent")
  }
  case object ORDER extends MEDICATIONREQUEST_INTENT("order") {
    def display: Option[String] = Some("Order")
    def system: Option[String]  = Some("http://hl7.org/fhir/CodeSystem/medicationrequest-intent")
  }
  case object ORIGINAL_ORDER extends MEDICATIONREQUEST_INTENT("original-order") {
    def display: Option[String] = Some("Original Order")
    def system: Option[String]  = Some("http://hl7.org/fhir/CodeSystem/medicationrequest-intent")
  }
  case object PLAN extends MEDICATIONREQUEST_INTENT("plan") {
    def display: Option[String] = Some("Plan")
    def system: Option[String]  = Some("http://hl7.org/fhir/CodeSystem/medicationrequest-intent")
  }
  case object PROPOSAL extends MEDICATIONREQUEST_INTENT("proposal") {
    def display: Option[String] = Some("Proposal")
    def system: Option[String]  = Some("http://hl7.org/fhir/CodeSystem/medicationrequest-intent")
  }
  case object REFLEX_ORDER extends MEDICATIONREQUEST_INTENT("reflex-order") {
    def display: Option[String] = Some("Reflex Order")
    def system: Option[String]  = Some("http://hl7.org/fhir/CodeSystem/medicationrequest-intent")
  }
}

sealed abstract class MEDICATIONREQUEST_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object MEDICATIONREQUEST_STATUS
    extends FhirEnum[MEDICATIONREQUEST_STATUS]
    with FhirCirceEnum[MEDICATIONREQUEST_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/medicationrequest-status"
  val values    = findValues
  case object ACTIVE extends MEDICATIONREQUEST_STATUS("active") {
    def display: Option[String] = Some("Active")
    def system: Option[String]  = Some("http://hl7.org/fhir/CodeSystem/medicationrequest-status")
  }
  case object CANCELLED extends MEDICATIONREQUEST_STATUS("cancelled") {
    def display: Option[String] = Some("Cancelled")
    def system: Option[String]  = Some("http://hl7.org/fhir/CodeSystem/medicationrequest-status")
  }
  case object COMPLETED extends MEDICATIONREQUEST_STATUS("completed") {
    def display: Option[String] = Some("Completed")
    def system: Option[String]  = Some("http://hl7.org/fhir/CodeSystem/medicationrequest-status")
  }
  case object DRAFT extends MEDICATIONREQUEST_STATUS("draft") {
    def display: Option[String] = Some("Draft")
    def system: Option[String]  = Some("http://hl7.org/fhir/CodeSystem/medicationrequest-status")
  }
  case object ENTERED_IN_ERROR extends MEDICATIONREQUEST_STATUS("entered-in-error") {
    def display: Option[String] = Some("Entered in Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/CodeSystem/medicationrequest-status")
  }
  case object ON_HOLD extends MEDICATIONREQUEST_STATUS("on-hold") {
    def display: Option[String] = Some("On Hold")
    def system: Option[String]  = Some("http://hl7.org/fhir/CodeSystem/medicationrequest-status")
  }
  case object STOPPED extends MEDICATIONREQUEST_STATUS("stopped") {
    def display: Option[String] = Some("Stopped")
    def system: Option[String]  = Some("http://hl7.org/fhir/CodeSystem/medicationrequest-status")
  }
  case object UNKNOWN extends MEDICATIONREQUEST_STATUS("unknown") {
    def display: Option[String] = Some("Unknown")
    def system: Option[String]  = Some("http://hl7.org/fhir/CodeSystem/medicationrequest-status")
  }
}

sealed abstract class MEDICATION_ADMIN_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object MEDICATION_ADMIN_STATUS extends FhirEnum[MEDICATION_ADMIN_STATUS] with FhirCirceEnum[MEDICATION_ADMIN_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/medication-admin-status"
  val values    = findValues
  case object COMPLETED extends MEDICATION_ADMIN_STATUS("completed") {
    def display: Option[String] = Some("Completed")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/medication-admin-status")
  }
  case object ENTERED_IN_ERROR extends MEDICATION_ADMIN_STATUS("entered-in-error") {
    def display: Option[String] = Some("Entered in Error")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/medication-admin-status")
  }
  case object IN_PROGRESS extends MEDICATION_ADMIN_STATUS("in-progress") {
    def display: Option[String] = Some("In Progress")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/medication-admin-status")
  }
  case object NOT_DONE extends MEDICATION_ADMIN_STATUS("not-done") {
    def display: Option[String] = Some("Not Done")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/medication-admin-status")
  }
  case object ON_HOLD extends MEDICATION_ADMIN_STATUS("on-hold") {
    def display: Option[String] = Some("On Hold")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/medication-admin-status")
  }
  case object STOPPED extends MEDICATION_ADMIN_STATUS("stopped") {
    def display: Option[String] = Some("Stopped")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/medication-admin-status")
  }
  case object UNKNOWN extends MEDICATION_ADMIN_STATUS("unknown") {
    def display: Option[String] = Some("Unknown")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/medication-admin-status")
  }
}

sealed abstract class MEDICATION_STATEMENT_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object MEDICATION_STATEMENT_STATUS
    extends FhirEnum[MEDICATION_STATEMENT_STATUS]
    with FhirCirceEnum[MEDICATION_STATEMENT_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/medication-statement-status"
  val values    = findValues
  case object ACTIVE extends MEDICATION_STATEMENT_STATUS("active") {
    def display: Option[String] = Some("Active")
    def system: Option[String]  = Some("http://hl7.org/fhir/CodeSystem/medication-statement-status")
  }
  case object COMPLETED extends MEDICATION_STATEMENT_STATUS("completed") {
    def display: Option[String] = Some("Completed")
    def system: Option[String]  = Some("http://hl7.org/fhir/CodeSystem/medication-statement-status")
  }
  case object ENTERED_IN_ERROR extends MEDICATION_STATEMENT_STATUS("entered-in-error") {
    def display: Option[String] = Some("Entered in Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/CodeSystem/medication-statement-status")
  }
  case object INTENDED extends MEDICATION_STATEMENT_STATUS("intended") {
    def display: Option[String] = Some("Intended")
    def system: Option[String]  = Some("http://hl7.org/fhir/CodeSystem/medication-statement-status")
  }
  case object NOT_TAKEN extends MEDICATION_STATEMENT_STATUS("not-taken") {
    def display: Option[String] = Some("Not Taken")
    def system: Option[String]  = Some("http://hl7.org/fhir/CodeSystem/medication-statement-status")
  }
  case object ON_HOLD extends MEDICATION_STATEMENT_STATUS("on-hold") {
    def display: Option[String] = Some("On Hold")
    def system: Option[String]  = Some("http://hl7.org/fhir/CodeSystem/medication-statement-status")
  }
  case object STOPPED extends MEDICATION_STATEMENT_STATUS("stopped") {
    def display: Option[String] = Some("Stopped")
    def system: Option[String]  = Some("http://hl7.org/fhir/CodeSystem/medication-statement-status")
  }
  case object UNKNOWN extends MEDICATION_STATEMENT_STATUS("unknown") {
    def display: Option[String] = Some("Unknown")
    def system: Option[String]  = Some("http://hl7.org/fhir/CodeSystem/medication-statement-status")
  }
}

sealed abstract class MEDICATION_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object MEDICATION_STATUS extends FhirEnum[MEDICATION_STATUS] with FhirCirceEnum[MEDICATION_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/medication-status"
  val values    = findValues
  case object ACTIVE extends MEDICATION_STATUS("active") {
    def display: Option[String] = Some("Active")
    def system: Option[String]  = Some("http://hl7.org/fhir/CodeSystem/medication-status")
  }
  case object ENTERED_IN_ERROR extends MEDICATION_STATUS("entered-in-error") {
    def display: Option[String] = Some("Entered in Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/CodeSystem/medication-status")
  }
  case object INACTIVE extends MEDICATION_STATUS("inactive") {
    def display: Option[String] = Some("Inactive")
    def system: Option[String]  = Some("http://hl7.org/fhir/CodeSystem/medication-status")
  }
}

sealed abstract class MESSAGEHEADER_RESPONSE_REQUEST(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object MESSAGEHEADER_RESPONSE_REQUEST
    extends FhirEnum[MESSAGEHEADER_RESPONSE_REQUEST]
    with FhirCirceEnum[MESSAGEHEADER_RESPONSE_REQUEST] {
  val reference = "http://hl7.org/fhir/ValueSet/messageheader-response-request"
  val values    = findValues
  case object ALWAYS extends MESSAGEHEADER_RESPONSE_REQUEST("always") {
    def display: Option[String] = Some("Always")
    def system: Option[String]  = Some("http://hl7.org/fhir/messageheader-response-request")
  }
  case object NEVER extends MESSAGEHEADER_RESPONSE_REQUEST("never") {
    def display: Option[String] = Some("Never")
    def system: Option[String]  = Some("http://hl7.org/fhir/messageheader-response-request")
  }
  case object ON_ERROR extends MESSAGEHEADER_RESPONSE_REQUEST("on-error") {
    def display: Option[String] = Some("Error/reject conditions only")
    def system: Option[String]  = Some("http://hl7.org/fhir/messageheader-response-request")
  }
  case object SUCCESSFUL_COMPLETION_ONLY extends MESSAGEHEADER_RESPONSE_REQUEST("on-success") {
    def display: Option[String] = Some("Successful completion only")
    def system: Option[String]  = Some("http://hl7.org/fhir/messageheader-response-request")
  }
}

sealed abstract class MESSAGE_SIGNIFICANCE_CATEGORY(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object MESSAGE_SIGNIFICANCE_CATEGORY
    extends FhirEnum[MESSAGE_SIGNIFICANCE_CATEGORY]
    with FhirCirceEnum[MESSAGE_SIGNIFICANCE_CATEGORY] {
  val reference = "http://hl7.org/fhir/ValueSet/message-significance-category"
  val values    = findValues
  case object CONSEQUENCE extends MESSAGE_SIGNIFICANCE_CATEGORY("consequence") {
    def display: Option[String] = Some("Consequence")
    def system: Option[String]  = Some("http://hl7.org/fhir/message-significance-category")
  }
  case object CURRENCY extends MESSAGE_SIGNIFICANCE_CATEGORY("currency") {
    def display: Option[String] = Some("Currency")
    def system: Option[String]  = Some("http://hl7.org/fhir/message-significance-category")
  }
  case object NOTIFICATION extends MESSAGE_SIGNIFICANCE_CATEGORY("notification") {
    def display: Option[String] = Some("Notification")
    def system: Option[String]  = Some("http://hl7.org/fhir/message-significance-category")
  }
}

sealed abstract class METRIC_CALIBRATION_STATE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object METRIC_CALIBRATION_STATE
    extends FhirEnum[METRIC_CALIBRATION_STATE]
    with FhirCirceEnum[METRIC_CALIBRATION_STATE] {
  val reference = "http://hl7.org/fhir/ValueSet/metric-calibration-state"
  val values    = findValues
  case object CALIBRATED extends METRIC_CALIBRATION_STATE("calibrated") {
    def display: Option[String] = Some("Calibrated")
    def system: Option[String]  = Some("http://hl7.org/fhir/metric-calibration-state")
  }
  case object CALIBRATION_REQUIRED extends METRIC_CALIBRATION_STATE("calibration-required") {
    def display: Option[String] = Some("Calibration Required")
    def system: Option[String]  = Some("http://hl7.org/fhir/metric-calibration-state")
  }
  case object NOT_CALIBRATED extends METRIC_CALIBRATION_STATE("not-calibrated") {
    def display: Option[String] = Some("Not Calibrated")
    def system: Option[String]  = Some("http://hl7.org/fhir/metric-calibration-state")
  }
  case object UNSPECIFIED extends METRIC_CALIBRATION_STATE("unspecified") {
    def display: Option[String] = Some("Unspecified")
    def system: Option[String]  = Some("http://hl7.org/fhir/metric-calibration-state")
  }
}

sealed abstract class METRIC_CALIBRATION_TYPE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object METRIC_CALIBRATION_TYPE extends FhirEnum[METRIC_CALIBRATION_TYPE] with FhirCirceEnum[METRIC_CALIBRATION_TYPE] {
  val reference = "http://hl7.org/fhir/ValueSet/metric-calibration-type"
  val values    = findValues
  case object GAIN extends METRIC_CALIBRATION_TYPE("gain") {
    def display: Option[String] = Some("Gain")
    def system: Option[String]  = Some("http://hl7.org/fhir/metric-calibration-type")
  }
  case object OFFSET extends METRIC_CALIBRATION_TYPE("offset") {
    def display: Option[String] = Some("Offset")
    def system: Option[String]  = Some("http://hl7.org/fhir/metric-calibration-type")
  }
  case object TWO_POINT extends METRIC_CALIBRATION_TYPE("two-point") {
    def display: Option[String] = Some("Two Point")
    def system: Option[String]  = Some("http://hl7.org/fhir/metric-calibration-type")
  }
  case object UNSPECIFIED extends METRIC_CALIBRATION_TYPE("unspecified") {
    def display: Option[String] = Some("Unspecified")
    def system: Option[String]  = Some("http://hl7.org/fhir/metric-calibration-type")
  }
}

sealed abstract class METRIC_CATEGORY(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object METRIC_CATEGORY extends FhirEnum[METRIC_CATEGORY] with FhirCirceEnum[METRIC_CATEGORY] {
  val reference = "http://hl7.org/fhir/ValueSet/metric-category"
  val values    = findValues
  case object CALCULATION extends METRIC_CATEGORY("calculation") {
    def display: Option[String] = Some("Calculation")
    def system: Option[String]  = Some("http://hl7.org/fhir/metric-category")
  }
  case object MEASUREMENT extends METRIC_CATEGORY("measurement") {
    def display: Option[String] = Some("Measurement")
    def system: Option[String]  = Some("http://hl7.org/fhir/metric-category")
  }
  case object SETTING extends METRIC_CATEGORY("setting") {
    def display: Option[String] = Some("Setting")
    def system: Option[String]  = Some("http://hl7.org/fhir/metric-category")
  }
  case object UNSPECIFIED extends METRIC_CATEGORY("unspecified") {
    def display: Option[String] = Some("Unspecified")
    def system: Option[String]  = Some("http://hl7.org/fhir/metric-category")
  }
}

sealed abstract class METRIC_COLOR(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object METRIC_COLOR extends FhirEnum[METRIC_COLOR] with FhirCirceEnum[METRIC_COLOR] {
  val reference = "http://hl7.org/fhir/ValueSet/metric-color"
  val values    = findValues
  case object BLACK extends METRIC_COLOR("black") {
    def display: Option[String] = Some("Color Black")
    def system: Option[String]  = Some("http://hl7.org/fhir/metric-color")
  }
  case object BLUE extends METRIC_COLOR("blue") {
    def display: Option[String] = Some("Color Blue")
    def system: Option[String]  = Some("http://hl7.org/fhir/metric-color")
  }
  case object CYAN extends METRIC_COLOR("cyan") {
    def display: Option[String] = Some("Color Cyan")
    def system: Option[String]  = Some("http://hl7.org/fhir/metric-color")
  }
  case object GREEN extends METRIC_COLOR("green") {
    def display: Option[String] = Some("Color Green")
    def system: Option[String]  = Some("http://hl7.org/fhir/metric-color")
  }
  case object MAGENTA extends METRIC_COLOR("magenta") {
    def display: Option[String] = Some("Color Magenta")
    def system: Option[String]  = Some("http://hl7.org/fhir/metric-color")
  }
  case object RED extends METRIC_COLOR("red") {
    def display: Option[String] = Some("Color Red")
    def system: Option[String]  = Some("http://hl7.org/fhir/metric-color")
  }
  case object WHITE extends METRIC_COLOR("white") {
    def display: Option[String] = Some("Color White")
    def system: Option[String]  = Some("http://hl7.org/fhir/metric-color")
  }
  case object YELLOW extends METRIC_COLOR("yellow") {
    def display: Option[String] = Some("Color Yellow")
    def system: Option[String]  = Some("http://hl7.org/fhir/metric-color")
  }
}

sealed abstract class METRIC_OPERATIONAL_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object METRIC_OPERATIONAL_STATUS
    extends FhirEnum[METRIC_OPERATIONAL_STATUS]
    with FhirCirceEnum[METRIC_OPERATIONAL_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/metric-operational-status"
  val values    = findValues
  case object ENTERED_IN_ERROR extends METRIC_OPERATIONAL_STATUS("entered-in-error") {
    def display: Option[String] = Some("Entered In Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/metric-operational-status")
  }
  case object OFF extends METRIC_OPERATIONAL_STATUS("off") {
    def display: Option[String] = Some("Off")
    def system: Option[String]  = Some("http://hl7.org/fhir/metric-operational-status")
  }
  case object ON extends METRIC_OPERATIONAL_STATUS("on") {
    def display: Option[String] = Some("On")
    def system: Option[String]  = Some("http://hl7.org/fhir/metric-operational-status")
  }
  case object STANDBY extends METRIC_OPERATIONAL_STATUS("standby") {
    def display: Option[String] = Some("Standby")
    def system: Option[String]  = Some("http://hl7.org/fhir/metric-operational-status")
  }
}

sealed abstract class NAMINGSYSTEM_IDENTIFIER_TYPE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object NAMINGSYSTEM_IDENTIFIER_TYPE
    extends FhirEnum[NAMINGSYSTEM_IDENTIFIER_TYPE]
    with FhirCirceEnum[NAMINGSYSTEM_IDENTIFIER_TYPE] {
  val reference = "http://hl7.org/fhir/ValueSet/namingsystem-identifier-type"
  val values    = findValues
  case object OID extends NAMINGSYSTEM_IDENTIFIER_TYPE("oid") {
    def display: Option[String] = Some("OID")
    def system: Option[String]  = Some("http://hl7.org/fhir/namingsystem-identifier-type")
  }
  case object OTHER extends NAMINGSYSTEM_IDENTIFIER_TYPE("other") {
    def display: Option[String] = Some("Other")
    def system: Option[String]  = Some("http://hl7.org/fhir/namingsystem-identifier-type")
  }
  case object URI extends NAMINGSYSTEM_IDENTIFIER_TYPE("uri") {
    def display: Option[String] = Some("URI")
    def system: Option[String]  = Some("http://hl7.org/fhir/namingsystem-identifier-type")
  }
  case object UUID extends NAMINGSYSTEM_IDENTIFIER_TYPE("uuid") {
    def display: Option[String] = Some("UUID")
    def system: Option[String]  = Some("http://hl7.org/fhir/namingsystem-identifier-type")
  }
}

sealed abstract class NAMINGSYSTEM_TYPE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object NAMINGSYSTEM_TYPE extends FhirEnum[NAMINGSYSTEM_TYPE] with FhirCirceEnum[NAMINGSYSTEM_TYPE] {
  val reference = "http://hl7.org/fhir/ValueSet/namingsystem-type"
  val values    = findValues
  case object CODESYSTEM extends NAMINGSYSTEM_TYPE("codesystem") {
    def display: Option[String] = Some("Code System")
    def system: Option[String]  = Some("http://hl7.org/fhir/namingsystem-type")
  }
  case object IDENTIFIER extends NAMINGSYSTEM_TYPE("identifier") {
    def display: Option[String] = Some("Identifier")
    def system: Option[String]  = Some("http://hl7.org/fhir/namingsystem-type")
  }
  case object ROOT extends NAMINGSYSTEM_TYPE("root") {
    def display: Option[String] = Some("Root")
    def system: Option[String]  = Some("http://hl7.org/fhir/namingsystem-type")
  }
}

sealed abstract class NARRATIVE_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object NARRATIVE_STATUS extends FhirEnum[NARRATIVE_STATUS] with FhirCirceEnum[NARRATIVE_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/narrative-status"
  val values    = findValues
  case object ADDITIONAL extends NARRATIVE_STATUS("additional") {
    def display: Option[String] = Some("Additional")
    def system: Option[String]  = Some("http://hl7.org/fhir/narrative-status")
  }
  case object EMPTY extends NARRATIVE_STATUS("empty") {
    def display: Option[String] = Some("Empty")
    def system: Option[String]  = Some("http://hl7.org/fhir/narrative-status")
  }
  case object EXTENSIONS extends NARRATIVE_STATUS("extensions") {
    def display: Option[String] = Some("Extensions")
    def system: Option[String]  = Some("http://hl7.org/fhir/narrative-status")
  }
  case object GENERATED extends NARRATIVE_STATUS("generated") {
    def display: Option[String] = Some("Generated")
    def system: Option[String]  = Some("http://hl7.org/fhir/narrative-status")
  }
}

sealed abstract class NETWORK_TYPE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object NETWORK_TYPE extends FhirEnum[NETWORK_TYPE] with FhirCirceEnum[NETWORK_TYPE] {
  val reference = "http://hl7.org/fhir/ValueSet/network-type"
  val values    = findValues
  case object EMAIL_ADDRESS extends NETWORK_TYPE("4") {
    def display: Option[String] = Some("Email address")
    def system: Option[String]  = Some("http://hl7.org/fhir/network-type")
  }
  case object IP_ADDRESS extends NETWORK_TYPE("2") {
    def display: Option[String] = Some("IP Address")
    def system: Option[String]  = Some("http://hl7.org/fhir/network-type")
  }
  case object MACHINE_NAME extends NETWORK_TYPE("1") {
    def display: Option[String] = Some("Machine Name")
    def system: Option[String]  = Some("http://hl7.org/fhir/network-type")
  }
  case object TELEPHONE_NUMBER extends NETWORK_TYPE("3") {
    def display: Option[String] = Some("Telephone Number")
    def system: Option[String]  = Some("http://hl7.org/fhir/network-type")
  }
  case object URI extends NETWORK_TYPE("5") {
    def display: Option[String] = Some("URI")
    def system: Option[String]  = Some("http://hl7.org/fhir/network-type")
  }
}

sealed abstract class NOTE_TYPE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object NOTE_TYPE extends FhirEnum[NOTE_TYPE] with FhirCirceEnum[NOTE_TYPE] {
  val reference = "http://hl7.org/fhir/ValueSet/note-type"
  val values    = findValues
  case object DISPLAY extends NOTE_TYPE("display") {
    def display: Option[String] = Some("Display")
    def system: Option[String]  = Some("http://hl7.org/fhir/note-type")
  }
  case object PRINT extends NOTE_TYPE("print") {
    def display: Option[String] = Some("Print (Form)")
    def system: Option[String]  = Some("http://hl7.org/fhir/note-type")
  }
  case object PRINTOPER extends NOTE_TYPE("printoper") {
    def display: Option[String] = Some("Print (Operator)")
    def system: Option[String]  = Some("http://hl7.org/fhir/note-type")
  }
}

sealed abstract class OBSERVATION_RANGE_CATEGORY(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object OBSERVATION_RANGE_CATEGORY
    extends FhirEnum[OBSERVATION_RANGE_CATEGORY]
    with FhirCirceEnum[OBSERVATION_RANGE_CATEGORY] {
  val reference = "http://hl7.org/fhir/ValueSet/observation-range-category"
  val values    = findValues
  case object ABSOLUTE extends OBSERVATION_RANGE_CATEGORY("absolute") {
    def display: Option[String] = Some("absolute range")
    def system: Option[String]  = Some("http://hl7.org/fhir/observation-range-category")
  }
  case object CRITICAL extends OBSERVATION_RANGE_CATEGORY("critical") {
    def display: Option[String] = Some("critical range")
    def system: Option[String]  = Some("http://hl7.org/fhir/observation-range-category")
  }
  case object REFERENCE extends OBSERVATION_RANGE_CATEGORY("reference") {
    def display: Option[String] = Some("reference range")
    def system: Option[String]  = Some("http://hl7.org/fhir/observation-range-category")
  }
}

sealed abstract class OBSERVATION_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object OBSERVATION_STATUS extends FhirEnum[OBSERVATION_STATUS] with FhirCirceEnum[OBSERVATION_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/observation-status"
  val values    = findValues
  case object AMENDED extends OBSERVATION_STATUS("amended") {
    def display: Option[String] = Some("Amended")
    def system: Option[String]  = Some("http://hl7.org/fhir/observation-status")
  }
  case object CANCELLED extends OBSERVATION_STATUS("cancelled") {
    def display: Option[String] = Some("Cancelled")
    def system: Option[String]  = Some("http://hl7.org/fhir/observation-status")
  }
  case object CORRECTED extends OBSERVATION_STATUS("corrected") {
    def display: Option[String] = Some("Corrected")
    def system: Option[String]  = Some("http://hl7.org/fhir/observation-status")
  }
  case object ENTERED_IN_ERROR extends OBSERVATION_STATUS("entered-in-error") {
    def display: Option[String] = Some("Entered in Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/observation-status")
  }
  case object FINAL extends OBSERVATION_STATUS("final") {
    def display: Option[String] = Some("Final")
    def system: Option[String]  = Some("http://hl7.org/fhir/observation-status")
  }
  case object PRELIMINARY extends OBSERVATION_STATUS("preliminary") {
    def display: Option[String] = Some("Preliminary")
    def system: Option[String]  = Some("http://hl7.org/fhir/observation-status")
  }
  case object REGISTERED extends OBSERVATION_STATUS("registered") {
    def display: Option[String] = Some("Registered")
    def system: Option[String]  = Some("http://hl7.org/fhir/observation-status")
  }
  case object UNKNOWN extends OBSERVATION_STATUS("unknown") {
    def display: Option[String] = Some("Unknown")
    def system: Option[String]  = Some("http://hl7.org/fhir/observation-status")
  }
}

sealed abstract class OPERATION_KIND(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object OPERATION_KIND extends FhirEnum[OPERATION_KIND] with FhirCirceEnum[OPERATION_KIND] {
  val reference = "http://hl7.org/fhir/ValueSet/operation-kind"
  val values    = findValues
  case object OPERATION extends OPERATION_KIND("operation") {
    def display: Option[String] = Some("Operation")
    def system: Option[String]  = Some("http://hl7.org/fhir/operation-kind")
  }
  case object QUERY extends OPERATION_KIND("query") {
    def display: Option[String] = Some("Query")
    def system: Option[String]  = Some("http://hl7.org/fhir/operation-kind")
  }
}

sealed abstract class ORIENTATION_TYPE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object ORIENTATION_TYPE extends FhirEnum[ORIENTATION_TYPE] with FhirCirceEnum[ORIENTATION_TYPE] {
  val reference = "http://hl7.org/fhir/ValueSet/orientation-type"
  val values    = findValues
  case object ANTISENSE extends ORIENTATION_TYPE("antisense") {
    def display: Option[String] = Some("Antisense orientation of referenceSeq")
    def system: Option[String]  = Some("http://hl7.org/fhir/orientation-type")
  }
  case object SENSE extends ORIENTATION_TYPE("sense") {
    def display: Option[String] = Some("Sense orientation of referenceSeq")
    def system: Option[String]  = Some("http://hl7.org/fhir/orientation-type")
  }
}

sealed abstract class PARTICIPANTREQUIRED(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object PARTICIPANTREQUIRED extends FhirEnum[PARTICIPANTREQUIRED] with FhirCirceEnum[PARTICIPANTREQUIRED] {
  val reference = "http://hl7.org/fhir/ValueSet/participantrequired"
  val values    = findValues
  case object INFORMATION_ONLY extends PARTICIPANTREQUIRED("information-only") {
    def display: Option[String] = Some("Information Only")
    def system: Option[String]  = Some("http://hl7.org/fhir/participantrequired")
  }
  case object OPTIONAL extends PARTICIPANTREQUIRED("optional") {
    def display: Option[String] = Some("Optional")
    def system: Option[String]  = Some("http://hl7.org/fhir/participantrequired")
  }
  case object REQUIRED extends PARTICIPANTREQUIRED("required") {
    def display: Option[String] = Some("Required")
    def system: Option[String]  = Some("http://hl7.org/fhir/participantrequired")
  }
}

sealed abstract class PARTICIPATIONSTATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object PARTICIPATIONSTATUS extends FhirEnum[PARTICIPATIONSTATUS] with FhirCirceEnum[PARTICIPATIONSTATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/participationstatus"
  val values    = findValues
  case object ACCEPTED extends PARTICIPATIONSTATUS("accepted") {
    def display: Option[String] = Some("Accepted")
    def system: Option[String]  = Some("http://hl7.org/fhir/participationstatus")
  }
  case object DECLINED extends PARTICIPATIONSTATUS("declined") {
    def display: Option[String] = Some("Declined")
    def system: Option[String]  = Some("http://hl7.org/fhir/participationstatus")
  }
  case object NEEDS_ACTION extends PARTICIPATIONSTATUS("needs-action") {
    def display: Option[String] = Some("Needs Action")
    def system: Option[String]  = Some("http://hl7.org/fhir/participationstatus")
  }
  case object TENTATIVE extends PARTICIPATIONSTATUS("tentative") {
    def display: Option[String] = Some("Tentative")
    def system: Option[String]  = Some("http://hl7.org/fhir/participationstatus")
  }
}

sealed abstract class PERMITTED_DATA_TYPE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object PERMITTED_DATA_TYPE extends FhirEnum[PERMITTED_DATA_TYPE] with FhirCirceEnum[PERMITTED_DATA_TYPE] {
  val reference = "http://hl7.org/fhir/ValueSet/permitted-data-type"
  val values    = findValues
  case object BOOLEAN extends PERMITTED_DATA_TYPE("boolean") {
    def display: Option[String] = Some("boolean")
    def system: Option[String]  = Some("http://hl7.org/fhir/permitted-data-type")
  }
  case object CODEABLECONCEPT extends PERMITTED_DATA_TYPE("CodeableConcept") {
    def display: Option[String] = Some("CodeableConcept")
    def system: Option[String]  = Some("http://hl7.org/fhir/permitted-data-type")
  }
  case object DATETIME extends PERMITTED_DATA_TYPE("dateTime") {
    def display: Option[String] = Some("dateTime")
    def system: Option[String]  = Some("http://hl7.org/fhir/permitted-data-type")
  }
  case object INTEGER extends PERMITTED_DATA_TYPE("integer") {
    def display: Option[String] = Some("integer")
    def system: Option[String]  = Some("http://hl7.org/fhir/permitted-data-type")
  }
  case object PERIOD extends PERMITTED_DATA_TYPE("Period") {
    def display: Option[String] = Some("Period")
    def system: Option[String]  = Some("http://hl7.org/fhir/permitted-data-type")
  }
  case object QUANTITY extends PERMITTED_DATA_TYPE("Quantity") {
    def display: Option[String] = Some("Quantity")
    def system: Option[String]  = Some("http://hl7.org/fhir/permitted-data-type")
  }
  case object RANGE extends PERMITTED_DATA_TYPE("Range") {
    def display: Option[String] = Some("Range")
    def system: Option[String]  = Some("http://hl7.org/fhir/permitted-data-type")
  }
  case object RATIO extends PERMITTED_DATA_TYPE("Ratio") {
    def display: Option[String] = Some("Ratio")
    def system: Option[String]  = Some("http://hl7.org/fhir/permitted-data-type")
  }
  case object SAMPLEDDATA extends PERMITTED_DATA_TYPE("SampledData") {
    def display: Option[String] = Some("SampledData")
    def system: Option[String]  = Some("http://hl7.org/fhir/permitted-data-type")
  }
  case object STRING extends PERMITTED_DATA_TYPE("string") {
    def display: Option[String] = Some("string")
    def system: Option[String]  = Some("http://hl7.org/fhir/permitted-data-type")
  }
  case object TIME extends PERMITTED_DATA_TYPE("time") {
    def display: Option[String] = Some("time")
    def system: Option[String]  = Some("http://hl7.org/fhir/permitted-data-type")
  }
}

sealed abstract class PRODUCT_CATEGORY(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object PRODUCT_CATEGORY extends FhirEnum[PRODUCT_CATEGORY] with FhirCirceEnum[PRODUCT_CATEGORY] {
  val reference = "http://hl7.org/fhir/ValueSet/product-category"
  val values    = findValues
  case object BIOLOGICALAGENT extends PRODUCT_CATEGORY("biologicalAgent") {
    def display: Option[String] = Some("BiologicalAgent")
    def system: Option[String]  = Some("http://hl7.org/fhir/product-category")
  }
  case object CELLS extends PRODUCT_CATEGORY("cells") {
    def display: Option[String] = Some("Cells")
    def system: Option[String]  = Some("http://hl7.org/fhir/product-category")
  }
  case object FLUID extends PRODUCT_CATEGORY("fluid") {
    def display: Option[String] = Some("Fluid")
    def system: Option[String]  = Some("http://hl7.org/fhir/product-category")
  }
  case object ORGAN extends PRODUCT_CATEGORY("organ") {
    def display: Option[String] = Some("Organ")
    def system: Option[String]  = Some("http://hl7.org/fhir/product-category")
  }
  case object TISSUE extends PRODUCT_CATEGORY("tissue") {
    def display: Option[String] = Some("Tissue")
    def system: Option[String]  = Some("http://hl7.org/fhir/product-category")
  }
}

sealed abstract class PRODUCT_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object PRODUCT_STATUS extends FhirEnum[PRODUCT_STATUS] with FhirCirceEnum[PRODUCT_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/product-status"
  val values    = findValues
  case object AVAILABLE extends PRODUCT_STATUS("available") {
    def display: Option[String] = Some("Available")
    def system: Option[String]  = Some("http://hl7.org/fhir/product-status")
  }
  case object UNAVAILABLE extends PRODUCT_STATUS("unavailable") {
    def display: Option[String] = Some("Unavailable")
    def system: Option[String]  = Some("http://hl7.org/fhir/product-status")
  }
}

sealed abstract class PRODUCT_STORAGE_SCALE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object PRODUCT_STORAGE_SCALE extends FhirEnum[PRODUCT_STORAGE_SCALE] with FhirCirceEnum[PRODUCT_STORAGE_SCALE] {
  val reference = "http://hl7.org/fhir/ValueSet/product-storage-scale"
  val values    = findValues
  case object CELSIUS extends PRODUCT_STORAGE_SCALE("celsius") {
    def display: Option[String] = Some("Celsius")
    def system: Option[String]  = Some("http://hl7.org/fhir/product-storage-scale")
  }
  case object FARENHEIT extends PRODUCT_STORAGE_SCALE("farenheit") {
    def display: Option[String] = Some("Fahrenheit")
    def system: Option[String]  = Some("http://hl7.org/fhir/product-storage-scale")
  }
  case object KELVIN extends PRODUCT_STORAGE_SCALE("kelvin") {
    def display: Option[String] = Some("Kelvin")
    def system: Option[String]  = Some("http://hl7.org/fhir/product-storage-scale")
  }
}

sealed abstract class PROPERTY_REPRESENTATION(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object PROPERTY_REPRESENTATION extends FhirEnum[PROPERTY_REPRESENTATION] with FhirCirceEnum[PROPERTY_REPRESENTATION] {
  val reference = "http://hl7.org/fhir/ValueSet/property-representation"
  val values    = findValues
  case object CDATEXT extends PROPERTY_REPRESENTATION("cdaText") {
    def display: Option[String] = Some("CDA Text Format")
    def system: Option[String]  = Some("http://hl7.org/fhir/property-representation")
  }
  case object TYPEATTR extends PROPERTY_REPRESENTATION("typeAttr") {
    def display: Option[String] = Some("Type Attribute")
    def system: Option[String]  = Some("http://hl7.org/fhir/property-representation")
  }
  case object XHTML extends PROPERTY_REPRESENTATION("xhtml") {
    def display: Option[String] = Some("XHTML")
    def system: Option[String]  = Some("http://hl7.org/fhir/property-representation")
  }
  case object XMLATTR extends PROPERTY_REPRESENTATION("xmlAttr") {
    def display: Option[String] = Some("XML Attribute")
    def system: Option[String]  = Some("http://hl7.org/fhir/property-representation")
  }
  case object XMLTEXT extends PROPERTY_REPRESENTATION("xmlText") {
    def display: Option[String] = Some("XML Text")
    def system: Option[String]  = Some("http://hl7.org/fhir/property-representation")
  }
}

sealed abstract class PROVENANCE_ENTITY_ROLE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object PROVENANCE_ENTITY_ROLE extends FhirEnum[PROVENANCE_ENTITY_ROLE] with FhirCirceEnum[PROVENANCE_ENTITY_ROLE] {
  val reference = "http://hl7.org/fhir/ValueSet/provenance-entity-role"
  val values    = findValues
  case object DERIVATION extends PROVENANCE_ENTITY_ROLE("derivation") {
    def display: Option[String] = Some("Derivation")
    def system: Option[String]  = Some("http://hl7.org/fhir/provenance-entity-role")
  }
  case object QUOTATION extends PROVENANCE_ENTITY_ROLE("quotation") {
    def display: Option[String] = Some("Quotation")
    def system: Option[String]  = Some("http://hl7.org/fhir/provenance-entity-role")
  }
  case object REMOVAL extends PROVENANCE_ENTITY_ROLE("removal") {
    def display: Option[String] = Some("Removal")
    def system: Option[String]  = Some("http://hl7.org/fhir/provenance-entity-role")
  }
  case object REVISION extends PROVENANCE_ENTITY_ROLE("revision") {
    def display: Option[String] = Some("Revision")
    def system: Option[String]  = Some("http://hl7.org/fhir/provenance-entity-role")
  }
  case object SOURCE extends PROVENANCE_ENTITY_ROLE("source") {
    def display: Option[String] = Some("Source")
    def system: Option[String]  = Some("http://hl7.org/fhir/provenance-entity-role")
  }
}

sealed abstract class PUBLICATION_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object PUBLICATION_STATUS extends FhirEnum[PUBLICATION_STATUS] with FhirCirceEnum[PUBLICATION_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/publication-status"
  val values    = findValues
  case object ACTIVE extends PUBLICATION_STATUS("active") {
    def display: Option[String] = Some("Active")
    def system: Option[String]  = Some("http://hl7.org/fhir/publication-status")
  }
  case object DRAFT extends PUBLICATION_STATUS("draft") {
    def display: Option[String] = Some("Draft")
    def system: Option[String]  = Some("http://hl7.org/fhir/publication-status")
  }
  case object RETIRED extends PUBLICATION_STATUS("retired") {
    def display: Option[String] = Some("Retired")
    def system: Option[String]  = Some("http://hl7.org/fhir/publication-status")
  }
  case object UNKNOWN extends PUBLICATION_STATUS("unknown") {
    def display: Option[String] = Some("Unknown")
    def system: Option[String]  = Some("http://hl7.org/fhir/publication-status")
  }
}

sealed abstract class QUALITY_TYPE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object QUALITY_TYPE extends FhirEnum[QUALITY_TYPE] with FhirCirceEnum[QUALITY_TYPE] {
  val reference = "http://hl7.org/fhir/ValueSet/quality-type"
  val values    = findValues
  case object INDEL extends QUALITY_TYPE("indel") {
    def display: Option[String] = Some("INDEL Comparison")
    def system: Option[String]  = Some("http://hl7.org/fhir/quality-type")
  }
  case object SNP extends QUALITY_TYPE("snp") {
    def display: Option[String] = Some("SNP Comparison")
    def system: Option[String]  = Some("http://hl7.org/fhir/quality-type")
  }
  case object UNKNOWN extends QUALITY_TYPE("unknown") {
    def display: Option[String] = Some("UNKNOWN Comparison")
    def system: Option[String]  = Some("http://hl7.org/fhir/quality-type")
  }
}

sealed abstract class QUESTIONNAIRE_ANSWERS_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object QUESTIONNAIRE_ANSWERS_STATUS
    extends FhirEnum[QUESTIONNAIRE_ANSWERS_STATUS]
    with FhirCirceEnum[QUESTIONNAIRE_ANSWERS_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/questionnaire-answers-status"
  val values    = findValues
  case object AMENDED extends QUESTIONNAIRE_ANSWERS_STATUS("amended") {
    def display: Option[String] = Some("Amended")
    def system: Option[String]  = Some("http://hl7.org/fhir/questionnaire-answers-status")
  }
  case object COMPLETED extends QUESTIONNAIRE_ANSWERS_STATUS("completed") {
    def display: Option[String] = Some("Completed")
    def system: Option[String]  = Some("http://hl7.org/fhir/questionnaire-answers-status")
  }
  case object ENTERED_IN_ERROR extends QUESTIONNAIRE_ANSWERS_STATUS("entered-in-error") {
    def display: Option[String] = Some("Entered in Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/questionnaire-answers-status")
  }
  case object IN_PROGRESS extends QUESTIONNAIRE_ANSWERS_STATUS("in-progress") {
    def display: Option[String] = Some("In Progress")
    def system: Option[String]  = Some("http://hl7.org/fhir/questionnaire-answers-status")
  }
  case object STOPPED extends QUESTIONNAIRE_ANSWERS_STATUS("stopped") {
    def display: Option[String] = Some("Stopped")
    def system: Option[String]  = Some("http://hl7.org/fhir/questionnaire-answers-status")
  }
}

sealed abstract class QUESTIONNAIRE_ENABLE_BEHAVIOR(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object QUESTIONNAIRE_ENABLE_BEHAVIOR
    extends FhirEnum[QUESTIONNAIRE_ENABLE_BEHAVIOR]
    with FhirCirceEnum[QUESTIONNAIRE_ENABLE_BEHAVIOR] {
  val reference = "http://hl7.org/fhir/ValueSet/questionnaire-enable-behavior"
  val values    = findValues
  case object ALL extends QUESTIONNAIRE_ENABLE_BEHAVIOR("all") {
    def display: Option[String] = Some("All")
    def system: Option[String]  = Some("http://hl7.org/fhir/questionnaire-enable-behavior")
  }
  case object ANY extends QUESTIONNAIRE_ENABLE_BEHAVIOR("any") {
    def display: Option[String] = Some("Any")
    def system: Option[String]  = Some("http://hl7.org/fhir/questionnaire-enable-behavior")
  }
}

sealed abstract class QUESTIONNAIRE_ENABLE_OPERATOR(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object QUESTIONNAIRE_ENABLE_OPERATOR
    extends FhirEnum[QUESTIONNAIRE_ENABLE_OPERATOR]
    with FhirCirceEnum[QUESTIONNAIRE_ENABLE_OPERATOR] {
  val reference = "http://hl7.org/fhir/ValueSet/questionnaire-enable-operator"
  val values    = findValues
  case object EQUALS extends QUESTIONNAIRE_ENABLE_OPERATOR("=") {
    def display: Option[String] = Some("Equals")
    def system: Option[String]  = Some("http://hl7.org/fhir/questionnaire-enable-operator")
  }
  case object EXISTS extends QUESTIONNAIRE_ENABLE_OPERATOR("exists") {
    def display: Option[String] = Some("Exists")
    def system: Option[String]  = Some("http://hl7.org/fhir/questionnaire-enable-operator")
  }
  case object GREATER_OR_EQUALS extends QUESTIONNAIRE_ENABLE_OPERATOR(">=") {
    def display: Option[String] = Some("Greater or Equals")
    def system: Option[String]  = Some("http://hl7.org/fhir/questionnaire-enable-operator")
  }
  case object GREATER_THAN extends QUESTIONNAIRE_ENABLE_OPERATOR(">") {
    def display: Option[String] = Some("Greater Than")
    def system: Option[String]  = Some("http://hl7.org/fhir/questionnaire-enable-operator")
  }
  case object LESS_OR_EQUALS extends QUESTIONNAIRE_ENABLE_OPERATOR("<=") {
    def display: Option[String] = Some("Less or Equals")
    def system: Option[String]  = Some("http://hl7.org/fhir/questionnaire-enable-operator")
  }
  case object LESS_THAN extends QUESTIONNAIRE_ENABLE_OPERATOR("<") {
    def display: Option[String] = Some("Less Than")
    def system: Option[String]  = Some("http://hl7.org/fhir/questionnaire-enable-operator")
  }
  case object NOT_EQUALS extends QUESTIONNAIRE_ENABLE_OPERATOR("!=") {
    def display: Option[String] = Some("Not Equals")
    def system: Option[String]  = Some("http://hl7.org/fhir/questionnaire-enable-operator")
  }
}

sealed abstract class REACTION_EVENT_SEVERITY(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object REACTION_EVENT_SEVERITY extends FhirEnum[REACTION_EVENT_SEVERITY] with FhirCirceEnum[REACTION_EVENT_SEVERITY] {
  val reference = "http://hl7.org/fhir/ValueSet/reaction-event-severity"
  val values    = findValues
  case object MILD extends REACTION_EVENT_SEVERITY("mild") {
    def display: Option[String] = Some("Mild")
    def system: Option[String]  = Some("http://hl7.org/fhir/reaction-event-severity")
  }
  case object MODERATE extends REACTION_EVENT_SEVERITY("moderate") {
    def display: Option[String] = Some("Moderate")
    def system: Option[String]  = Some("http://hl7.org/fhir/reaction-event-severity")
  }
  case object SEVERE extends REACTION_EVENT_SEVERITY("severe") {
    def display: Option[String] = Some("Severe")
    def system: Option[String]  = Some("http://hl7.org/fhir/reaction-event-severity")
  }
}

sealed abstract class REFERENCE_HANDLING_POLICY(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object REFERENCE_HANDLING_POLICY
    extends FhirEnum[REFERENCE_HANDLING_POLICY]
    with FhirCirceEnum[REFERENCE_HANDLING_POLICY] {
  val reference = "http://hl7.org/fhir/ValueSet/reference-handling-policy"
  val values    = findValues
  case object ENFORCED extends REFERENCE_HANDLING_POLICY("enforced") {
    def display: Option[String] = Some("Reference Integrity Enforced")
    def system: Option[String]  = Some("http://hl7.org/fhir/reference-handling-policy")
  }
  case object LITERAL extends REFERENCE_HANDLING_POLICY("literal") {
    def display: Option[String] = Some("Literal References")
    def system: Option[String]  = Some("http://hl7.org/fhir/reference-handling-policy")
  }
  case object LOCAL extends REFERENCE_HANDLING_POLICY("local") {
    def display: Option[String] = Some("Local References Only")
    def system: Option[String]  = Some("http://hl7.org/fhir/reference-handling-policy")
  }
  case object LOGICAL extends REFERENCE_HANDLING_POLICY("logical") {
    def display: Option[String] = Some("Logical References")
    def system: Option[String]  = Some("http://hl7.org/fhir/reference-handling-policy")
  }
  case object RESOLVES extends REFERENCE_HANDLING_POLICY("resolves") {
    def display: Option[String] = Some("Resolves References")
    def system: Option[String]  = Some("http://hl7.org/fhir/reference-handling-policy")
  }
}

sealed abstract class REFERENCE_VERSION_RULES(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object REFERENCE_VERSION_RULES extends FhirEnum[REFERENCE_VERSION_RULES] with FhirCirceEnum[REFERENCE_VERSION_RULES] {
  val reference = "http://hl7.org/fhir/ValueSet/reference-version-rules"
  val values    = findValues
  case object EITHER extends REFERENCE_VERSION_RULES("either") {
    def display: Option[String] = Some("Either Specific or independent")
    def system: Option[String]  = Some("http://hl7.org/fhir/reference-version-rules")
  }
  case object INDEPENDENT extends REFERENCE_VERSION_RULES("independent") {
    def display: Option[String] = Some("Version independent")
    def system: Option[String]  = Some("http://hl7.org/fhir/reference-version-rules")
  }
  case object SPECIFIC extends REFERENCE_VERSION_RULES("specific") {
    def display: Option[String] = Some("Version Specific")
    def system: Option[String]  = Some("http://hl7.org/fhir/reference-version-rules")
  }
}

sealed abstract class RELATION_TYPE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object RELATION_TYPE extends FhirEnum[RELATION_TYPE] with FhirCirceEnum[RELATION_TYPE] {
  val reference = "http://hl7.org/fhir/ValueSet/relation-type"
  val values    = findValues
  case object REPLACED_BY extends RELATION_TYPE("is-replaced-by") {
    def display: Option[String] = Some("Replaced By")
    def system: Option[String]  = Some("http://hl7.org/fhir/relation-type")
  }
  case object TRIGGERS extends RELATION_TYPE("triggers") {
    def display: Option[String] = Some("Triggers")
    def system: Option[String]  = Some("http://hl7.org/fhir/relation-type")
  }
}

sealed abstract class REMITTANCE_OUTCOME(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object REMITTANCE_OUTCOME extends FhirEnum[REMITTANCE_OUTCOME] with FhirCirceEnum[REMITTANCE_OUTCOME] {
  val reference = "http://hl7.org/fhir/ValueSet/remittance-outcome"
  val values    = findValues
  case object COMPLETE extends REMITTANCE_OUTCOME("complete") {
    def display: Option[String] = Some("Processing Complete")
    def system: Option[String]  = Some("http://hl7.org/fhir/remittance-outcome")
  }
  case object ERROR extends REMITTANCE_OUTCOME("error") {
    def display: Option[String] = Some("Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/remittance-outcome")
  }
  case object PARTIAL extends REMITTANCE_OUTCOME("partial") {
    def display: Option[String] = Some("Partial Processing")
    def system: Option[String]  = Some("http://hl7.org/fhir/remittance-outcome")
  }
  case object QUEUED extends REMITTANCE_OUTCOME("queued") {
    def display: Option[String] = Some("Queued")
    def system: Option[String]  = Some("http://hl7.org/fhir/remittance-outcome")
  }
}

sealed abstract class REPORT_ACTION_RESULT_CODES(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object REPORT_ACTION_RESULT_CODES
    extends FhirEnum[REPORT_ACTION_RESULT_CODES]
    with FhirCirceEnum[REPORT_ACTION_RESULT_CODES] {
  val reference = "http://hl7.org/fhir/ValueSet/report-action-result-codes"
  val values    = findValues
  case object ERROR extends REPORT_ACTION_RESULT_CODES("error") {
    def display: Option[String] = Some("Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/report-action-result-codes")
  }
  case object FAIL extends REPORT_ACTION_RESULT_CODES("fail") {
    def display: Option[String] = Some("Fail")
    def system: Option[String]  = Some("http://hl7.org/fhir/report-action-result-codes")
  }
  case object PASS extends REPORT_ACTION_RESULT_CODES("pass") {
    def display: Option[String] = Some("Pass")
    def system: Option[String]  = Some("http://hl7.org/fhir/report-action-result-codes")
  }
  case object SKIP extends REPORT_ACTION_RESULT_CODES("skip") {
    def display: Option[String] = Some("Skip")
    def system: Option[String]  = Some("http://hl7.org/fhir/report-action-result-codes")
  }
  case object WARNING extends REPORT_ACTION_RESULT_CODES("warning") {
    def display: Option[String] = Some("Warning")
    def system: Option[String]  = Some("http://hl7.org/fhir/report-action-result-codes")
  }
}

sealed abstract class REPORT_PARTICIPANT_TYPE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object REPORT_PARTICIPANT_TYPE extends FhirEnum[REPORT_PARTICIPANT_TYPE] with FhirCirceEnum[REPORT_PARTICIPANT_TYPE] {
  val reference = "http://hl7.org/fhir/ValueSet/report-participant-type"
  val values    = findValues
  case object CLIENT extends REPORT_PARTICIPANT_TYPE("client") {
    def display: Option[String] = Some("Client")
    def system: Option[String]  = Some("http://hl7.org/fhir/report-participant-type")
  }
  case object SERVER extends REPORT_PARTICIPANT_TYPE("server") {
    def display: Option[String] = Some("Server")
    def system: Option[String]  = Some("http://hl7.org/fhir/report-participant-type")
  }
  case object TEST_ENGINE extends REPORT_PARTICIPANT_TYPE("test-engine") {
    def display: Option[String] = Some("Test Engine")
    def system: Option[String]  = Some("http://hl7.org/fhir/report-participant-type")
  }
}

sealed abstract class REPORT_RESULT_CODES(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object REPORT_RESULT_CODES extends FhirEnum[REPORT_RESULT_CODES] with FhirCirceEnum[REPORT_RESULT_CODES] {
  val reference = "http://hl7.org/fhir/ValueSet/report-result-codes"
  val values    = findValues
  case object FAIL extends REPORT_RESULT_CODES("fail") {
    def display: Option[String] = Some("Fail")
    def system: Option[String]  = Some("http://hl7.org/fhir/report-result-codes")
  }
  case object PASS extends REPORT_RESULT_CODES("pass") {
    def display: Option[String] = Some("Pass")
    def system: Option[String]  = Some("http://hl7.org/fhir/report-result-codes")
  }
  case object PENDING extends REPORT_RESULT_CODES("pending") {
    def display: Option[String] = Some("Pending")
    def system: Option[String]  = Some("http://hl7.org/fhir/report-result-codes")
  }
}

sealed abstract class REPORT_STATUS_CODES(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object REPORT_STATUS_CODES extends FhirEnum[REPORT_STATUS_CODES] with FhirCirceEnum[REPORT_STATUS_CODES] {
  val reference = "http://hl7.org/fhir/ValueSet/report-status-codes"
  val values    = findValues
  case object COMPLETED extends REPORT_STATUS_CODES("completed") {
    def display: Option[String] = Some("Completed")
    def system: Option[String]  = Some("http://hl7.org/fhir/report-status-codes")
  }
  case object ENTERED_IN_ERROR extends REPORT_STATUS_CODES("entered-in-error") {
    def display: Option[String] = Some("Entered In Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/report-status-codes")
  }
  case object IN_PROGRESS extends REPORT_STATUS_CODES("in-progress") {
    def display: Option[String] = Some("In Progress")
    def system: Option[String]  = Some("http://hl7.org/fhir/report-status-codes")
  }
  case object STOPPED extends REPORT_STATUS_CODES("stopped") {
    def display: Option[String] = Some("Stopped")
    def system: Option[String]  = Some("http://hl7.org/fhir/report-status-codes")
  }
  case object WAITING extends REPORT_STATUS_CODES("waiting") {
    def display: Option[String] = Some("Waiting")
    def system: Option[String]  = Some("http://hl7.org/fhir/report-status-codes")
  }
}

sealed abstract class REPOSITORY_TYPE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object REPOSITORY_TYPE extends FhirEnum[REPOSITORY_TYPE] with FhirCirceEnum[REPOSITORY_TYPE] {
  val reference = "http://hl7.org/fhir/ValueSet/repository-type"
  val values    = findValues
  case object DIRECTLINK extends REPOSITORY_TYPE("directlink") {
    def display: Option[String] = Some("Click and see")
    def system: Option[String]  = Some("http://hl7.org/fhir/repository-type")
  }
  case object LOGIN extends REPOSITORY_TYPE("login") {
    def display: Option[String] = Some("Result cannot be access unless an account is logged in")
    def system: Option[String]  = Some("http://hl7.org/fhir/repository-type")
  }
  case object OAUTH extends REPOSITORY_TYPE("oauth") {
    def display: Option[String] = Some(
      "Result need to be fetched with API and need LOGIN( or cookies are required when visiting the link of resource)")
    def system: Option[String] = Some("http://hl7.org/fhir/repository-type")
  }
  case object OPENAPI extends REPOSITORY_TYPE("openapi") {
    def display: Option[String] = Some("The URL is the RESTful or other kind of API that can access to the result.")
    def system: Option[String]  = Some("http://hl7.org/fhir/repository-type")
  }
  case object OTHER extends REPOSITORY_TYPE("other") {
    def display: Option[String] = Some("Some other complicated or particular way to get resource from URL.")
    def system: Option[String]  = Some("http://hl7.org/fhir/repository-type")
  }
}

sealed abstract class REQUEST_INTENT(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object REQUEST_INTENT extends FhirEnum[REQUEST_INTENT] with FhirCirceEnum[REQUEST_INTENT] {
  val reference = "http://hl7.org/fhir/ValueSet/request-intent"
  val values    = findValues
  case object DIRECTIVE extends REQUEST_INTENT("directive") {
    def display: Option[String] = Some("Directive")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-intent")
  }
  case object FILLER_ORDER extends REQUEST_INTENT("filler-order") {
    def display: Option[String] = Some("Filler Order")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-intent")
  }
  case object INSTANCE_ORDER extends REQUEST_INTENT("instance-order") {
    def display: Option[String] = Some("Instance Order")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-intent")
  }
  case object OPTION extends REQUEST_INTENT("option") {
    def display: Option[String] = Some("Option")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-intent")
  }
  case object ORDER extends REQUEST_INTENT("order") {
    def display: Option[String] = Some("Order")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-intent")
  }
  case object ORIGINAL_ORDER extends REQUEST_INTENT("original-order") {
    def display: Option[String] = Some("Original Order")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-intent")
  }
  case object PLAN extends REQUEST_INTENT("plan") {
    def display: Option[String] = Some("Plan")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-intent")
  }
  case object PROPOSAL extends REQUEST_INTENT("proposal") {
    def display: Option[String] = Some("Proposal")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-intent")
  }
  case object REFLEX_ORDER extends REQUEST_INTENT("reflex-order") {
    def display: Option[String] = Some("Reflex Order")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-intent")
  }
}

sealed abstract class REQUEST_PRIORITY(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object REQUEST_PRIORITY extends FhirEnum[REQUEST_PRIORITY] with FhirCirceEnum[REQUEST_PRIORITY] {
  val reference = "http://hl7.org/fhir/ValueSet/request-priority"
  val values    = findValues
  case object ASAP extends REQUEST_PRIORITY("asap") {
    def display: Option[String] = Some("ASAP")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-priority")
  }
  case object ROUTINE extends REQUEST_PRIORITY("routine") {
    def display: Option[String] = Some("Routine")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-priority")
  }
  case object STAT extends REQUEST_PRIORITY("stat") {
    def display: Option[String] = Some("STAT")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-priority")
  }
  case object URGENT extends REQUEST_PRIORITY("urgent") {
    def display: Option[String] = Some("Urgent")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-priority")
  }
}

sealed abstract class REQUEST_RESOURCE_TYPES(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object REQUEST_RESOURCE_TYPES extends FhirEnum[REQUEST_RESOURCE_TYPES] with FhirCirceEnum[REQUEST_RESOURCE_TYPES] {
  val reference = "http://hl7.org/fhir/ValueSet/request-resource-types"
  val values    = findValues
  case object APPOINTMENT extends REQUEST_RESOURCE_TYPES("Appointment") {
    def display: Option[String] = Some("Appointment")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-resource-types")
  }
  case object APPOINTMENTRESPONSE extends REQUEST_RESOURCE_TYPES("AppointmentResponse") {
    def display: Option[String] = Some("AppointmentResponse")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-resource-types")
  }
  case object CAREPLAN extends REQUEST_RESOURCE_TYPES("CarePlan") {
    def display: Option[String] = Some("CarePlan")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-resource-types")
  }
  case object CLAIM extends REQUEST_RESOURCE_TYPES("Claim") {
    def display: Option[String] = Some("Claim")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-resource-types")
  }
  case object COMMUNICATIONREQUEST extends REQUEST_RESOURCE_TYPES("CommunicationRequest") {
    def display: Option[String] = Some("CommunicationRequest")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-resource-types")
  }
  case object CONTRACT extends REQUEST_RESOURCE_TYPES("Contract") {
    def display: Option[String] = Some("Contract")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-resource-types")
  }
  case object DEVICEREQUEST extends REQUEST_RESOURCE_TYPES("DeviceRequest") {
    def display: Option[String] = Some("DeviceRequest")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-resource-types")
  }
  case object ENROLLMENTREQUEST extends REQUEST_RESOURCE_TYPES("EnrollmentRequest") {
    def display: Option[String] = Some("EnrollmentRequest")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-resource-types")
  }
  case object IMMUNIZATIONRECOMMENDATION extends REQUEST_RESOURCE_TYPES("ImmunizationRecommendation") {
    def display: Option[String] = Some("ImmunizationRecommendation")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-resource-types")
  }
  case object MEDICATIONREQUEST extends REQUEST_RESOURCE_TYPES("MedicationRequest") {
    def display: Option[String] = Some("MedicationRequest")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-resource-types")
  }
  case object NUTRITIONORDER extends REQUEST_RESOURCE_TYPES("NutritionOrder") {
    def display: Option[String] = Some("NutritionOrder")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-resource-types")
  }
  case object SERVICEREQUEST extends REQUEST_RESOURCE_TYPES("ServiceRequest") {
    def display: Option[String] = Some("ServiceRequest")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-resource-types")
  }
  case object SUPPLYREQUEST extends REQUEST_RESOURCE_TYPES("SupplyRequest") {
    def display: Option[String] = Some("SupplyRequest")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-resource-types")
  }
  case object TASK extends REQUEST_RESOURCE_TYPES("Task") {
    def display: Option[String] = Some("Task")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-resource-types")
  }
  case object VISIONPRESCRIPTION extends REQUEST_RESOURCE_TYPES("VisionPrescription") {
    def display: Option[String] = Some("VisionPrescription")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-resource-types")
  }
}

sealed abstract class REQUEST_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object REQUEST_STATUS extends FhirEnum[REQUEST_STATUS] with FhirCirceEnum[REQUEST_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/request-status"
  val values    = findValues
  case object ACTIVE extends REQUEST_STATUS("active") {
    def display: Option[String] = Some("Active")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-status")
  }
  case object COMPLETED extends REQUEST_STATUS("completed") {
    def display: Option[String] = Some("Completed")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-status")
  }
  case object DRAFT extends REQUEST_STATUS("draft") {
    def display: Option[String] = Some("Draft")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-status")
  }
  case object ENTERED_IN_ERROR extends REQUEST_STATUS("entered-in-error") {
    def display: Option[String] = Some("Entered in Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-status")
  }
  case object ON_HOLD extends REQUEST_STATUS("on-hold") {
    def display: Option[String] = Some("On Hold")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-status")
  }
  case object REVOKED extends REQUEST_STATUS("revoked") {
    def display: Option[String] = Some("Revoked")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-status")
  }
  case object UNKNOWN extends REQUEST_STATUS("unknown") {
    def display: Option[String] = Some("Unknown")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-status")
  }
}

sealed abstract class RESEARCH_ELEMENT_TYPE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object RESEARCH_ELEMENT_TYPE extends FhirEnum[RESEARCH_ELEMENT_TYPE] with FhirCirceEnum[RESEARCH_ELEMENT_TYPE] {
  val reference = "http://hl7.org/fhir/ValueSet/research-element-type"
  val values    = findValues
  case object EXPOSURE extends RESEARCH_ELEMENT_TYPE("exposure") {
    def display: Option[String] = Some("Exposure")
    def system: Option[String]  = Some("http://hl7.org/fhir/research-element-type")
  }
  case object OUTCOME extends RESEARCH_ELEMENT_TYPE("outcome") {
    def display: Option[String] = Some("Outcome")
    def system: Option[String]  = Some("http://hl7.org/fhir/research-element-type")
  }
  case object POPULATION extends RESEARCH_ELEMENT_TYPE("population") {
    def display: Option[String] = Some("Population")
    def system: Option[String]  = Some("http://hl7.org/fhir/research-element-type")
  }
}

sealed abstract class RESEARCH_STUDY_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object RESEARCH_STUDY_STATUS extends FhirEnum[RESEARCH_STUDY_STATUS] with FhirCirceEnum[RESEARCH_STUDY_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/research-study-status"
  val values    = findValues
  case object ACTIVE extends RESEARCH_STUDY_STATUS("active") {
    def display: Option[String] = Some("Active")
    def system: Option[String]  = Some("http://hl7.org/fhir/research-study-status")
  }
  case object ADMINISTRATIVELY_COMPLETED extends RESEARCH_STUDY_STATUS("administratively-completed") {
    def display: Option[String] = Some("Administratively Completed")
    def system: Option[String]  = Some("http://hl7.org/fhir/research-study-status")
  }
  case object APPROVED extends RESEARCH_STUDY_STATUS("approved") {
    def display: Option[String] = Some("Approved")
    def system: Option[String]  = Some("http://hl7.org/fhir/research-study-status")
  }
  case object CLOSED_TO_ACCRUAL extends RESEARCH_STUDY_STATUS("closed-to-accrual") {
    def display: Option[String] = Some("Closed to Accrual")
    def system: Option[String]  = Some("http://hl7.org/fhir/research-study-status")
  }
  case object CLOSED_TO_ACCRUAL_AND_INTERVENTION extends RESEARCH_STUDY_STATUS("closed-to-accrual-and-intervention") {
    def display: Option[String] = Some("Closed to Accrual and Intervention")
    def system: Option[String]  = Some("http://hl7.org/fhir/research-study-status")
  }
  case object COMPLETED extends RESEARCH_STUDY_STATUS("completed") {
    def display: Option[String] = Some("Completed")
    def system: Option[String]  = Some("http://hl7.org/fhir/research-study-status")
  }
  case object DISAPPROVED extends RESEARCH_STUDY_STATUS("disapproved") {
    def display: Option[String] = Some("Disapproved")
    def system: Option[String]  = Some("http://hl7.org/fhir/research-study-status")
  }
  case object IN_REVIEW extends RESEARCH_STUDY_STATUS("in-review") {
    def display: Option[String] = Some("In Review")
    def system: Option[String]  = Some("http://hl7.org/fhir/research-study-status")
  }
  case object TEMPORARILY_CLOSED_TO_ACCRUAL extends RESEARCH_STUDY_STATUS("temporarily-closed-to-accrual") {
    def display: Option[String] = Some("Temporarily Closed to Accrual")
    def system: Option[String]  = Some("http://hl7.org/fhir/research-study-status")
  }
  case object TEMPORARILY_CLOSED_TO_ACCRUAL_AND_INTERVENTION
      extends RESEARCH_STUDY_STATUS("temporarily-closed-to-accrual-and-intervention") {
    def display: Option[String] = Some("Temporarily Closed to Accrual and Intervention")
    def system: Option[String]  = Some("http://hl7.org/fhir/research-study-status")
  }
  case object WITHDRAWN extends RESEARCH_STUDY_STATUS("withdrawn") {
    def display: Option[String] = Some("Withdrawn")
    def system: Option[String]  = Some("http://hl7.org/fhir/research-study-status")
  }
}

sealed abstract class RESEARCH_SUBJECT_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object RESEARCH_SUBJECT_STATUS extends FhirEnum[RESEARCH_SUBJECT_STATUS] with FhirCirceEnum[RESEARCH_SUBJECT_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/research-subject-status"
  val values    = findValues
  case object CANDIDATE extends RESEARCH_SUBJECT_STATUS("candidate") {
    def display: Option[String] = Some("Candidate")
    def system: Option[String]  = Some("http://hl7.org/fhir/research-subject-status")
  }
  case object ELIGIBLE extends RESEARCH_SUBJECT_STATUS("eligible") {
    def display: Option[String] = Some("Eligible")
    def system: Option[String]  = Some("http://hl7.org/fhir/research-subject-status")
  }
  case object FOLLOW_UP extends RESEARCH_SUBJECT_STATUS("follow-up") {
    def display: Option[String] = Some("Follow-up")
    def system: Option[String]  = Some("http://hl7.org/fhir/research-subject-status")
  }
  case object INELIGIBLE extends RESEARCH_SUBJECT_STATUS("ineligible") {
    def display: Option[String] = Some("Ineligible")
    def system: Option[String]  = Some("http://hl7.org/fhir/research-subject-status")
  }
  case object NOT_REGISTERED extends RESEARCH_SUBJECT_STATUS("not-registered") {
    def display: Option[String] = Some("Not Registered")
    def system: Option[String]  = Some("http://hl7.org/fhir/research-subject-status")
  }
  case object OFF_STUDY extends RESEARCH_SUBJECT_STATUS("off-study") {
    def display: Option[String] = Some("Off-study")
    def system: Option[String]  = Some("http://hl7.org/fhir/research-subject-status")
  }
  case object ON_STUDY extends RESEARCH_SUBJECT_STATUS("on-study") {
    def display: Option[String] = Some("On-study")
    def system: Option[String]  = Some("http://hl7.org/fhir/research-subject-status")
  }
  case object ON_STUDY_INTERVENTION extends RESEARCH_SUBJECT_STATUS("on-study-intervention") {
    def display: Option[String] = Some("On-study-intervention")
    def system: Option[String]  = Some("http://hl7.org/fhir/research-subject-status")
  }
  case object ON_STUDY_OBSERVATION extends RESEARCH_SUBJECT_STATUS("on-study-observation") {
    def display: Option[String] = Some("On-study-observation")
    def system: Option[String]  = Some("http://hl7.org/fhir/research-subject-status")
  }
  case object PENDING_ON_STUDY extends RESEARCH_SUBJECT_STATUS("pending-on-study") {
    def display: Option[String] = Some("Pending on-study")
    def system: Option[String]  = Some("http://hl7.org/fhir/research-subject-status")
  }
  case object POTENTIAL_CANDIDATE extends RESEARCH_SUBJECT_STATUS("potential-candidate") {
    def display: Option[String] = Some("Potential Candidate")
    def system: Option[String]  = Some("http://hl7.org/fhir/research-subject-status")
  }
  case object SCREENING extends RESEARCH_SUBJECT_STATUS("screening") {
    def display: Option[String] = Some("Screening")
    def system: Option[String]  = Some("http://hl7.org/fhir/research-subject-status")
  }
  case object WITHDRAWN extends RESEARCH_SUBJECT_STATUS("withdrawn") {
    def display: Option[String] = Some("Withdrawn")
    def system: Option[String]  = Some("http://hl7.org/fhir/research-subject-status")
  }
}

sealed abstract class RESOURCE_AGGREGATION_MODE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object RESOURCE_AGGREGATION_MODE
    extends FhirEnum[RESOURCE_AGGREGATION_MODE]
    with FhirCirceEnum[RESOURCE_AGGREGATION_MODE] {
  val reference = "http://hl7.org/fhir/ValueSet/resource-aggregation-mode"
  val values    = findValues
  case object BUNDLED extends RESOURCE_AGGREGATION_MODE("bundled") {
    def display: Option[String] = Some("Bundled")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-aggregation-mode")
  }
  case object CONTAINED extends RESOURCE_AGGREGATION_MODE("contained") {
    def display: Option[String] = Some("Contained")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-aggregation-mode")
  }
  case object REFERENCED extends RESOURCE_AGGREGATION_MODE("referenced") {
    def display: Option[String] = Some("Referenced")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-aggregation-mode")
  }
}

sealed abstract class RESOURCE_SLICING_RULES(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object RESOURCE_SLICING_RULES extends FhirEnum[RESOURCE_SLICING_RULES] with FhirCirceEnum[RESOURCE_SLICING_RULES] {
  val reference = "http://hl7.org/fhir/ValueSet/resource-slicing-rules"
  val values    = findValues
  case object CLOSED extends RESOURCE_SLICING_RULES("closed") {
    def display: Option[String] = Some("Closed")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-slicing-rules")
  }
  case object OPEN extends RESOURCE_SLICING_RULES("open") {
    def display: Option[String] = Some("Open")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-slicing-rules")
  }
  case object OPENATEND extends RESOURCE_SLICING_RULES("openAtEnd") {
    def display: Option[String] = Some("Open at End")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-slicing-rules")
  }
}

sealed abstract class RESOURCE_TYPES(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object RESOURCE_TYPES extends FhirEnum[RESOURCE_TYPES] with FhirCirceEnum[RESOURCE_TYPES] {
  val reference = "http://hl7.org/fhir/ValueSet/resource-types"
  val values    = findValues
  case object ACCOUNT extends RESOURCE_TYPES("Account") {
    def display: Option[String] = Some("Account")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object ACTIVITYDEFINITION extends RESOURCE_TYPES("ActivityDefinition") {
    def display: Option[String] = Some("ActivityDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object ADVERSEEVENT extends RESOURCE_TYPES("AdverseEvent") {
    def display: Option[String] = Some("AdverseEvent")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object ALLERGYINTOLERANCE extends RESOURCE_TYPES("AllergyIntolerance") {
    def display: Option[String] = Some("AllergyIntolerance")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object APPOINTMENT extends RESOURCE_TYPES("Appointment") {
    def display: Option[String] = Some("Appointment")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object APPOINTMENTRESPONSE extends RESOURCE_TYPES("AppointmentResponse") {
    def display: Option[String] = Some("AppointmentResponse")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object AUDITEVENT extends RESOURCE_TYPES("AuditEvent") {
    def display: Option[String] = Some("AuditEvent")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object BASIC extends RESOURCE_TYPES("Basic") {
    def display: Option[String] = Some("Basic")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object BINARY extends RESOURCE_TYPES("Binary") {
    def display: Option[String] = Some("Binary")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object BIOLOGICALLYDERIVEDPRODUCT extends RESOURCE_TYPES("BiologicallyDerivedProduct") {
    def display: Option[String] = Some("BiologicallyDerivedProduct")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object BODYSTRUCTURE extends RESOURCE_TYPES("BodyStructure") {
    def display: Option[String] = Some("BodyStructure")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object BUNDLE extends RESOURCE_TYPES("Bundle") {
    def display: Option[String] = Some("Bundle")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CAPABILITYSTATEMENT extends RESOURCE_TYPES("CapabilityStatement") {
    def display: Option[String] = Some("CapabilityStatement")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CAREPLAN extends RESOURCE_TYPES("CarePlan") {
    def display: Option[String] = Some("CarePlan")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CARETEAM extends RESOURCE_TYPES("CareTeam") {
    def display: Option[String] = Some("CareTeam")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CATALOGENTRY extends RESOURCE_TYPES("CatalogEntry") {
    def display: Option[String] = Some("CatalogEntry")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CHARGEITEM extends RESOURCE_TYPES("ChargeItem") {
    def display: Option[String] = Some("ChargeItem")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CHARGEITEMDEFINITION extends RESOURCE_TYPES("ChargeItemDefinition") {
    def display: Option[String] = Some("ChargeItemDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CLAIM extends RESOURCE_TYPES("Claim") {
    def display: Option[String] = Some("Claim")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CLAIMRESPONSE extends RESOURCE_TYPES("ClaimResponse") {
    def display: Option[String] = Some("ClaimResponse")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CLINICALIMPRESSION extends RESOURCE_TYPES("ClinicalImpression") {
    def display: Option[String] = Some("ClinicalImpression")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CODESYSTEM extends RESOURCE_TYPES("CodeSystem") {
    def display: Option[String] = Some("CodeSystem")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object COMMUNICATION extends RESOURCE_TYPES("Communication") {
    def display: Option[String] = Some("Communication")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object COMMUNICATIONREQUEST extends RESOURCE_TYPES("CommunicationRequest") {
    def display: Option[String] = Some("CommunicationRequest")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object COMPARTMENTDEFINITION extends RESOURCE_TYPES("CompartmentDefinition") {
    def display: Option[String] = Some("CompartmentDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object COMPOSITION extends RESOURCE_TYPES("Composition") {
    def display: Option[String] = Some("Composition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CONCEPTMAP extends RESOURCE_TYPES("ConceptMap") {
    def display: Option[String] = Some("ConceptMap")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CONDITION extends RESOURCE_TYPES("Condition") {
    def display: Option[String] = Some("Condition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CONSENT extends RESOURCE_TYPES("Consent") {
    def display: Option[String] = Some("Consent")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object CONTRACT extends RESOURCE_TYPES("Contract") {
    def display: Option[String] = Some("Contract")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object COVERAGE extends RESOURCE_TYPES("Coverage") {
    def display: Option[String] = Some("Coverage")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object COVERAGEELIGIBILITYREQUEST extends RESOURCE_TYPES("CoverageEligibilityRequest") {
    def display: Option[String] = Some("CoverageEligibilityRequest")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object COVERAGEELIGIBILITYRESPONSE extends RESOURCE_TYPES("CoverageEligibilityResponse") {
    def display: Option[String] = Some("CoverageEligibilityResponse")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object DETECTEDISSUE extends RESOURCE_TYPES("DetectedIssue") {
    def display: Option[String] = Some("DetectedIssue")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object DEVICE extends RESOURCE_TYPES("Device") {
    def display: Option[String] = Some("Device")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object DEVICEDEFINITION extends RESOURCE_TYPES("DeviceDefinition") {
    def display: Option[String] = Some("DeviceDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object DEVICEMETRIC extends RESOURCE_TYPES("DeviceMetric") {
    def display: Option[String] = Some("DeviceMetric")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object DEVICEREQUEST extends RESOURCE_TYPES("DeviceRequest") {
    def display: Option[String] = Some("DeviceRequest")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object DEVICEUSESTATEMENT extends RESOURCE_TYPES("DeviceUseStatement") {
    def display: Option[String] = Some("DeviceUseStatement")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object DIAGNOSTICREPORT extends RESOURCE_TYPES("DiagnosticReport") {
    def display: Option[String] = Some("DiagnosticReport")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object DOCUMENTMANIFEST extends RESOURCE_TYPES("DocumentManifest") {
    def display: Option[String] = Some("DocumentManifest")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object DOCUMENTREFERENCE extends RESOURCE_TYPES("DocumentReference") {
    def display: Option[String] = Some("DocumentReference")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object DOMAINRESOURCE extends RESOURCE_TYPES("DomainResource") {
    def display: Option[String] = Some("DomainResource")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object EFFECTEVIDENCESYNTHESIS extends RESOURCE_TYPES("EffectEvidenceSynthesis") {
    def display: Option[String] = Some("EffectEvidenceSynthesis")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object ENCOUNTER extends RESOURCE_TYPES("Encounter") {
    def display: Option[String] = Some("Encounter")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object ENDPOINT extends RESOURCE_TYPES("Endpoint") {
    def display: Option[String] = Some("Endpoint")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object ENROLLMENTREQUEST extends RESOURCE_TYPES("EnrollmentRequest") {
    def display: Option[String] = Some("EnrollmentRequest")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object ENROLLMENTRESPONSE extends RESOURCE_TYPES("EnrollmentResponse") {
    def display: Option[String] = Some("EnrollmentResponse")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object EPISODEOFCARE extends RESOURCE_TYPES("EpisodeOfCare") {
    def display: Option[String] = Some("EpisodeOfCare")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object EVENTDEFINITION extends RESOURCE_TYPES("EventDefinition") {
    def display: Option[String] = Some("EventDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object EVIDENCE extends RESOURCE_TYPES("Evidence") {
    def display: Option[String] = Some("Evidence")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object EVIDENCEVARIABLE extends RESOURCE_TYPES("EvidenceVariable") {
    def display: Option[String] = Some("EvidenceVariable")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object EXAMPLESCENARIO extends RESOURCE_TYPES("ExampleScenario") {
    def display: Option[String] = Some("ExampleScenario")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object EXPLANATIONOFBENEFIT extends RESOURCE_TYPES("ExplanationOfBenefit") {
    def display: Option[String] = Some("ExplanationOfBenefit")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object FAMILYMEMBERHISTORY extends RESOURCE_TYPES("FamilyMemberHistory") {
    def display: Option[String] = Some("FamilyMemberHistory")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object FLAG extends RESOURCE_TYPES("Flag") {
    def display: Option[String] = Some("Flag")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object GOAL extends RESOURCE_TYPES("Goal") {
    def display: Option[String] = Some("Goal")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object GRAPHDEFINITION extends RESOURCE_TYPES("GraphDefinition") {
    def display: Option[String] = Some("GraphDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object GROUP extends RESOURCE_TYPES("Group") {
    def display: Option[String] = Some("Group")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object GUIDANCERESPONSE extends RESOURCE_TYPES("GuidanceResponse") {
    def display: Option[String] = Some("GuidanceResponse")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object HEALTHCARESERVICE extends RESOURCE_TYPES("HealthcareService") {
    def display: Option[String] = Some("HealthcareService")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object IMAGINGSTUDY extends RESOURCE_TYPES("ImagingStudy") {
    def display: Option[String] = Some("ImagingStudy")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object IMMUNIZATION extends RESOURCE_TYPES("Immunization") {
    def display: Option[String] = Some("Immunization")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object IMMUNIZATIONEVALUATION extends RESOURCE_TYPES("ImmunizationEvaluation") {
    def display: Option[String] = Some("ImmunizationEvaluation")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object IMMUNIZATIONRECOMMENDATION extends RESOURCE_TYPES("ImmunizationRecommendation") {
    def display: Option[String] = Some("ImmunizationRecommendation")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object IMPLEMENTATIONGUIDE extends RESOURCE_TYPES("ImplementationGuide") {
    def display: Option[String] = Some("ImplementationGuide")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object INSURANCEPLAN extends RESOURCE_TYPES("InsurancePlan") {
    def display: Option[String] = Some("InsurancePlan")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object INVOICE extends RESOURCE_TYPES("Invoice") {
    def display: Option[String] = Some("Invoice")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object LIBRARY extends RESOURCE_TYPES("Library") {
    def display: Option[String] = Some("Library")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object LINKAGE extends RESOURCE_TYPES("Linkage") {
    def display: Option[String] = Some("Linkage")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object LIST extends RESOURCE_TYPES("List") {
    def display: Option[String] = Some("List")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object LOCATION extends RESOURCE_TYPES("Location") {
    def display: Option[String] = Some("Location")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEASURE extends RESOURCE_TYPES("Measure") {
    def display: Option[String] = Some("Measure")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEASUREREPORT extends RESOURCE_TYPES("MeasureReport") {
    def display: Option[String] = Some("MeasureReport")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDIA extends RESOURCE_TYPES("Media") {
    def display: Option[String] = Some("Media")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICATION extends RESOURCE_TYPES("Medication") {
    def display: Option[String] = Some("Medication")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICATIONADMINISTRATION extends RESOURCE_TYPES("MedicationAdministration") {
    def display: Option[String] = Some("MedicationAdministration")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICATIONDISPENSE extends RESOURCE_TYPES("MedicationDispense") {
    def display: Option[String] = Some("MedicationDispense")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICATIONKNOWLEDGE extends RESOURCE_TYPES("MedicationKnowledge") {
    def display: Option[String] = Some("MedicationKnowledge")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICATIONREQUEST extends RESOURCE_TYPES("MedicationRequest") {
    def display: Option[String] = Some("MedicationRequest")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICATIONSTATEMENT extends RESOURCE_TYPES("MedicationStatement") {
    def display: Option[String] = Some("MedicationStatement")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICINALPRODUCT extends RESOURCE_TYPES("MedicinalProduct") {
    def display: Option[String] = Some("MedicinalProduct")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICINALPRODUCTAUTHORIZATION extends RESOURCE_TYPES("MedicinalProductAuthorization") {
    def display: Option[String] = Some("MedicinalProductAuthorization")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICINALPRODUCTCONTRAINDICATION extends RESOURCE_TYPES("MedicinalProductContraindication") {
    def display: Option[String] = Some("MedicinalProductContraindication")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICINALPRODUCTINDICATION extends RESOURCE_TYPES("MedicinalProductIndication") {
    def display: Option[String] = Some("MedicinalProductIndication")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICINALPRODUCTINGREDIENT extends RESOURCE_TYPES("MedicinalProductIngredient") {
    def display: Option[String] = Some("MedicinalProductIngredient")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICINALPRODUCTINTERACTION extends RESOURCE_TYPES("MedicinalProductInteraction") {
    def display: Option[String] = Some("MedicinalProductInteraction")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICINALPRODUCTMANUFACTURED extends RESOURCE_TYPES("MedicinalProductManufactured") {
    def display: Option[String] = Some("MedicinalProductManufactured")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICINALPRODUCTPACKAGED extends RESOURCE_TYPES("MedicinalProductPackaged") {
    def display: Option[String] = Some("MedicinalProductPackaged")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICINALPRODUCTPHARMACEUTICAL extends RESOURCE_TYPES("MedicinalProductPharmaceutical") {
    def display: Option[String] = Some("MedicinalProductPharmaceutical")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MEDICINALPRODUCTUNDESIRABLEEFFECT extends RESOURCE_TYPES("MedicinalProductUndesirableEffect") {
    def display: Option[String] = Some("MedicinalProductUndesirableEffect")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MESSAGEDEFINITION extends RESOURCE_TYPES("MessageDefinition") {
    def display: Option[String] = Some("MessageDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MESSAGEHEADER extends RESOURCE_TYPES("MessageHeader") {
    def display: Option[String] = Some("MessageHeader")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object MOLECULARSEQUENCE extends RESOURCE_TYPES("MolecularSequence") {
    def display: Option[String] = Some("MolecularSequence")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object NAMINGSYSTEM extends RESOURCE_TYPES("NamingSystem") {
    def display: Option[String] = Some("NamingSystem")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object NUTRITIONORDER extends RESOURCE_TYPES("NutritionOrder") {
    def display: Option[String] = Some("NutritionOrder")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object OBSERVATION extends RESOURCE_TYPES("Observation") {
    def display: Option[String] = Some("Observation")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object OBSERVATIONDEFINITION extends RESOURCE_TYPES("ObservationDefinition") {
    def display: Option[String] = Some("ObservationDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object OPERATIONDEFINITION extends RESOURCE_TYPES("OperationDefinition") {
    def display: Option[String] = Some("OperationDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object OPERATIONOUTCOME extends RESOURCE_TYPES("OperationOutcome") {
    def display: Option[String] = Some("OperationOutcome")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object ORGANIZATION extends RESOURCE_TYPES("Organization") {
    def display: Option[String] = Some("Organization")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object ORGANIZATIONAFFILIATION extends RESOURCE_TYPES("OrganizationAffiliation") {
    def display: Option[String] = Some("OrganizationAffiliation")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object PARAMETERS extends RESOURCE_TYPES("Parameters") {
    def display: Option[String] = Some("Parameters")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object PATIENT extends RESOURCE_TYPES("Patient") {
    def display: Option[String] = Some("Patient")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object PAYMENTNOTICE extends RESOURCE_TYPES("PaymentNotice") {
    def display: Option[String] = Some("PaymentNotice")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object PAYMENTRECONCILIATION extends RESOURCE_TYPES("PaymentReconciliation") {
    def display: Option[String] = Some("PaymentReconciliation")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object PERSON extends RESOURCE_TYPES("Person") {
    def display: Option[String] = Some("Person")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object PLANDEFINITION extends RESOURCE_TYPES("PlanDefinition") {
    def display: Option[String] = Some("PlanDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object PRACTITIONER extends RESOURCE_TYPES("Practitioner") {
    def display: Option[String] = Some("Practitioner")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object PRACTITIONERROLE extends RESOURCE_TYPES("PractitionerRole") {
    def display: Option[String] = Some("PractitionerRole")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object PROCEDURE extends RESOURCE_TYPES("Procedure") {
    def display: Option[String] = Some("Procedure")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object PROVENANCE extends RESOURCE_TYPES("Provenance") {
    def display: Option[String] = Some("Provenance")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object QUESTIONNAIRE extends RESOURCE_TYPES("Questionnaire") {
    def display: Option[String] = Some("Questionnaire")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object QUESTIONNAIRERESPONSE extends RESOURCE_TYPES("QuestionnaireResponse") {
    def display: Option[String] = Some("QuestionnaireResponse")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object RELATEDPERSON extends RESOURCE_TYPES("RelatedPerson") {
    def display: Option[String] = Some("RelatedPerson")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object REQUESTGROUP extends RESOURCE_TYPES("RequestGroup") {
    def display: Option[String] = Some("RequestGroup")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object RESEARCHDEFINITION extends RESOURCE_TYPES("ResearchDefinition") {
    def display: Option[String] = Some("ResearchDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object RESEARCHELEMENTDEFINITION extends RESOURCE_TYPES("ResearchElementDefinition") {
    def display: Option[String] = Some("ResearchElementDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object RESEARCHSTUDY extends RESOURCE_TYPES("ResearchStudy") {
    def display: Option[String] = Some("ResearchStudy")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object RESEARCHSUBJECT extends RESOURCE_TYPES("ResearchSubject") {
    def display: Option[String] = Some("ResearchSubject")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object RESOURCE extends RESOURCE_TYPES("Resource") {
    def display: Option[String] = Some("Resource")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object RISKASSESSMENT extends RESOURCE_TYPES("RiskAssessment") {
    def display: Option[String] = Some("RiskAssessment")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object RISKEVIDENCESYNTHESIS extends RESOURCE_TYPES("RiskEvidenceSynthesis") {
    def display: Option[String] = Some("RiskEvidenceSynthesis")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SCHEDULE extends RESOURCE_TYPES("Schedule") {
    def display: Option[String] = Some("Schedule")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SEARCHPARAMETER extends RESOURCE_TYPES("SearchParameter") {
    def display: Option[String] = Some("SearchParameter")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SERVICEREQUEST extends RESOURCE_TYPES("ServiceRequest") {
    def display: Option[String] = Some("ServiceRequest")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SLOT extends RESOURCE_TYPES("Slot") {
    def display: Option[String] = Some("Slot")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SPECIMEN extends RESOURCE_TYPES("Specimen") {
    def display: Option[String] = Some("Specimen")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SPECIMENDEFINITION extends RESOURCE_TYPES("SpecimenDefinition") {
    def display: Option[String] = Some("SpecimenDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object STRUCTUREDEFINITION extends RESOURCE_TYPES("StructureDefinition") {
    def display: Option[String] = Some("StructureDefinition")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object STRUCTUREMAP extends RESOURCE_TYPES("StructureMap") {
    def display: Option[String] = Some("StructureMap")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SUBSCRIPTION extends RESOURCE_TYPES("Subscription") {
    def display: Option[String] = Some("Subscription")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SUBSTANCE extends RESOURCE_TYPES("Substance") {
    def display: Option[String] = Some("Substance")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SUBSTANCENUCLEICACID extends RESOURCE_TYPES("SubstanceNucleicAcid") {
    def display: Option[String] = Some("SubstanceNucleicAcid")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SUBSTANCEPOLYMER extends RESOURCE_TYPES("SubstancePolymer") {
    def display: Option[String] = Some("SubstancePolymer")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SUBSTANCEPROTEIN extends RESOURCE_TYPES("SubstanceProtein") {
    def display: Option[String] = Some("SubstanceProtein")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SUBSTANCEREFERENCEINFORMATION extends RESOURCE_TYPES("SubstanceReferenceInformation") {
    def display: Option[String] = Some("SubstanceReferenceInformation")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SUBSTANCESOURCEMATERIAL extends RESOURCE_TYPES("SubstanceSourceMaterial") {
    def display: Option[String] = Some("SubstanceSourceMaterial")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SUBSTANCESPECIFICATION extends RESOURCE_TYPES("SubstanceSpecification") {
    def display: Option[String] = Some("SubstanceSpecification")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SUPPLYDELIVERY extends RESOURCE_TYPES("SupplyDelivery") {
    def display: Option[String] = Some("SupplyDelivery")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object SUPPLYREQUEST extends RESOURCE_TYPES("SupplyRequest") {
    def display: Option[String] = Some("SupplyRequest")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object TASK extends RESOURCE_TYPES("Task") {
    def display: Option[String] = Some("Task")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object TERMINOLOGYCAPABILITIES extends RESOURCE_TYPES("TerminologyCapabilities") {
    def display: Option[String] = Some("TerminologyCapabilities")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object TESTREPORT extends RESOURCE_TYPES("TestReport") {
    def display: Option[String] = Some("TestReport")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object TESTSCRIPT extends RESOURCE_TYPES("TestScript") {
    def display: Option[String] = Some("TestScript")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object VALUESET extends RESOURCE_TYPES("ValueSet") {
    def display: Option[String] = Some("ValueSet")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object VERIFICATIONRESULT extends RESOURCE_TYPES("VerificationResult") {
    def display: Option[String] = Some("VerificationResult")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
  case object VISIONPRESCRIPTION extends RESOURCE_TYPES("VisionPrescription") {
    def display: Option[String] = Some("VisionPrescription")
    def system: Option[String]  = Some("http://hl7.org/fhir/resource-types")
  }
}

sealed abstract class RESPONSE_CODE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object RESPONSE_CODE extends FhirEnum[RESPONSE_CODE] with FhirCirceEnum[RESPONSE_CODE] {
  val reference = "http://hl7.org/fhir/ValueSet/response-code"
  val values    = findValues
  case object FATAL_ERROR extends RESPONSE_CODE("fatal-error") {
    def display: Option[String] = Some("Fatal Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/response-code")
  }
  case object OK extends RESPONSE_CODE("ok") {
    def display: Option[String] = Some("OK")
    def system: Option[String]  = Some("http://hl7.org/fhir/response-code")
  }
  case object TRANSIENT_ERROR extends RESPONSE_CODE("transient-error") {
    def display: Option[String] = Some("Transient Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/response-code")
  }
}

sealed abstract class RESTFUL_CAPABILITY_MODE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object RESTFUL_CAPABILITY_MODE extends FhirEnum[RESTFUL_CAPABILITY_MODE] with FhirCirceEnum[RESTFUL_CAPABILITY_MODE] {
  val reference = "http://hl7.org/fhir/ValueSet/restful-capability-mode"
  val values    = findValues
  case object CLIENT extends RESTFUL_CAPABILITY_MODE("client") {
    def display: Option[String] = Some("Client")
    def system: Option[String]  = Some("http://hl7.org/fhir/restful-capability-mode")
  }
  case object SERVER extends RESTFUL_CAPABILITY_MODE("server") {
    def display: Option[String] = Some("Server")
    def system: Option[String]  = Some("http://hl7.org/fhir/restful-capability-mode")
  }
}

sealed abstract class SEARCH_COMPARATOR(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object SEARCH_COMPARATOR extends FhirEnum[SEARCH_COMPARATOR] with FhirCirceEnum[SEARCH_COMPARATOR] {
  val reference = "http://hl7.org/fhir/ValueSet/search-comparator"
  val values    = findValues
  case object AP extends SEARCH_COMPARATOR("ap") {
    def display: Option[String] = Some("Approximately")
    def system: Option[String]  = Some("http://hl7.org/fhir/search-comparator")
  }
  case object EB extends SEARCH_COMPARATOR("eb") {
    def display: Option[String] = Some("Ends Before")
    def system: Option[String]  = Some("http://hl7.org/fhir/search-comparator")
  }
  case object EQ extends SEARCH_COMPARATOR("eq") {
    def display: Option[String] = Some("Equals")
    def system: Option[String]  = Some("http://hl7.org/fhir/search-comparator")
  }
  case object GE extends SEARCH_COMPARATOR("ge") {
    def display: Option[String] = Some("Greater or Equals")
    def system: Option[String]  = Some("http://hl7.org/fhir/search-comparator")
  }
  case object GT extends SEARCH_COMPARATOR("gt") {
    def display: Option[String] = Some("Greater Than")
    def system: Option[String]  = Some("http://hl7.org/fhir/search-comparator")
  }
  case object LE extends SEARCH_COMPARATOR("le") {
    def display: Option[String] = Some("Less of Equal")
    def system: Option[String]  = Some("http://hl7.org/fhir/search-comparator")
  }
  case object LT extends SEARCH_COMPARATOR("lt") {
    def display: Option[String] = Some("Less Than")
    def system: Option[String]  = Some("http://hl7.org/fhir/search-comparator")
  }
  case object NE extends SEARCH_COMPARATOR("ne") {
    def display: Option[String] = Some("Not Equals")
    def system: Option[String]  = Some("http://hl7.org/fhir/search-comparator")
  }
  case object SA extends SEARCH_COMPARATOR("sa") {
    def display: Option[String] = Some("Starts After")
    def system: Option[String]  = Some("http://hl7.org/fhir/search-comparator")
  }
}

sealed abstract class SEARCH_ENTRY_MODE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object SEARCH_ENTRY_MODE extends FhirEnum[SEARCH_ENTRY_MODE] with FhirCirceEnum[SEARCH_ENTRY_MODE] {
  val reference = "http://hl7.org/fhir/ValueSet/search-entry-mode"
  val values    = findValues
  case object INCLUDE extends SEARCH_ENTRY_MODE("include") {
    def display: Option[String] = Some("Include")
    def system: Option[String]  = Some("http://hl7.org/fhir/search-entry-mode")
  }
  case object MATCH extends SEARCH_ENTRY_MODE("match") {
    def display: Option[String] = Some("Match")
    def system: Option[String]  = Some("http://hl7.org/fhir/search-entry-mode")
  }
  case object OUTCOME extends SEARCH_ENTRY_MODE("outcome") {
    def display: Option[String] = Some("Outcome")
    def system: Option[String]  = Some("http://hl7.org/fhir/search-entry-mode")
  }
}

sealed abstract class SEARCH_MODIFIER_CODE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object SEARCH_MODIFIER_CODE extends FhirEnum[SEARCH_MODIFIER_CODE] with FhirCirceEnum[SEARCH_MODIFIER_CODE] {
  val reference = "http://hl7.org/fhir/ValueSet/search-modifier-code"
  val values    = findValues
  case object ABOVE extends SEARCH_MODIFIER_CODE("above") {
    def display: Option[String] = Some("Above")
    def system: Option[String]  = Some("http://hl7.org/fhir/search-modifier-code")
  }
  case object BELOW extends SEARCH_MODIFIER_CODE("below") {
    def display: Option[String] = Some("Below")
    def system: Option[String]  = Some("http://hl7.org/fhir/search-modifier-code")
  }
  case object CONTAINS extends SEARCH_MODIFIER_CODE("contains") {
    def display: Option[String] = Some("Contains")
    def system: Option[String]  = Some("http://hl7.org/fhir/search-modifier-code")
  }
  case object EXACT extends SEARCH_MODIFIER_CODE("exact") {
    def display: Option[String] = Some("Exact")
    def system: Option[String]  = Some("http://hl7.org/fhir/search-modifier-code")
  }
  case object IDENTIFIER extends SEARCH_MODIFIER_CODE("identifier") {
    def display: Option[String] = Some("Identifier")
    def system: Option[String]  = Some("http://hl7.org/fhir/search-modifier-code")
  }
  case object IN extends SEARCH_MODIFIER_CODE("in") {
    def display: Option[String] = Some("In")
    def system: Option[String]  = Some("http://hl7.org/fhir/search-modifier-code")
  }
  case object MISSING extends SEARCH_MODIFIER_CODE("missing") {
    def display: Option[String] = Some("Missing")
    def system: Option[String]  = Some("http://hl7.org/fhir/search-modifier-code")
  }
  case object NOT extends SEARCH_MODIFIER_CODE("not") {
    def display: Option[String] = Some("Not")
    def system: Option[String]  = Some("http://hl7.org/fhir/search-modifier-code")
  }
  case object NOT_IN extends SEARCH_MODIFIER_CODE("not-in") {
    def display: Option[String] = Some("Not In")
    def system: Option[String]  = Some("http://hl7.org/fhir/search-modifier-code")
  }
  case object OFTYPE extends SEARCH_MODIFIER_CODE("ofType") {
    def display: Option[String] = Some("Of Type")
    def system: Option[String]  = Some("http://hl7.org/fhir/search-modifier-code")
  }
  case object TEXT extends SEARCH_MODIFIER_CODE("text") {
    def display: Option[String] = Some("Text")
    def system: Option[String]  = Some("http://hl7.org/fhir/search-modifier-code")
  }
  case object TYPE extends SEARCH_MODIFIER_CODE("type") {
    def display: Option[String] = Some("Type")
    def system: Option[String]  = Some("http://hl7.org/fhir/search-modifier-code")
  }
}

sealed abstract class SEARCH_PARAM_TYPE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object SEARCH_PARAM_TYPE extends FhirEnum[SEARCH_PARAM_TYPE] with FhirCirceEnum[SEARCH_PARAM_TYPE] {
  val reference = "http://hl7.org/fhir/ValueSet/search-param-type"
  val values    = findValues
  case object COMPOSITE extends SEARCH_PARAM_TYPE("composite") {
    def display: Option[String] = Some("Composite")
    def system: Option[String]  = Some("http://hl7.org/fhir/search-param-type")
  }
  case object DATE extends SEARCH_PARAM_TYPE("date") {
    def display: Option[String] = Some("Date/DateTime")
    def system: Option[String]  = Some("http://hl7.org/fhir/search-param-type")
  }
  case object NUMBER extends SEARCH_PARAM_TYPE("number") {
    def display: Option[String] = Some("Number")
    def system: Option[String]  = Some("http://hl7.org/fhir/search-param-type")
  }
  case object QUANTITY extends SEARCH_PARAM_TYPE("quantity") {
    def display: Option[String] = Some("Quantity")
    def system: Option[String]  = Some("http://hl7.org/fhir/search-param-type")
  }
  case object REFERENCE extends SEARCH_PARAM_TYPE("reference") {
    def display: Option[String] = Some("Reference")
    def system: Option[String]  = Some("http://hl7.org/fhir/search-param-type")
  }
  case object SPECIAL extends SEARCH_PARAM_TYPE("special") {
    def display: Option[String] = Some("Special")
    def system: Option[String]  = Some("http://hl7.org/fhir/search-param-type")
  }
  case object STRING extends SEARCH_PARAM_TYPE("string") {
    def display: Option[String] = Some("String")
    def system: Option[String]  = Some("http://hl7.org/fhir/search-param-type")
  }
  case object TOKEN extends SEARCH_PARAM_TYPE("token") {
    def display: Option[String] = Some("Token")
    def system: Option[String]  = Some("http://hl7.org/fhir/search-param-type")
  }
  case object URI extends SEARCH_PARAM_TYPE("uri") {
    def display: Option[String] = Some("URI")
    def system: Option[String]  = Some("http://hl7.org/fhir/search-param-type")
  }
}

sealed abstract class SEARCH_XPATH_USAGE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object SEARCH_XPATH_USAGE extends FhirEnum[SEARCH_XPATH_USAGE] with FhirCirceEnum[SEARCH_XPATH_USAGE] {
  val reference = "http://hl7.org/fhir/ValueSet/search-xpath-usage"
  val values    = findValues
  case object DISTANCE extends SEARCH_XPATH_USAGE("distance") {
    def display: Option[String] = Some("Distance")
    def system: Option[String]  = Some("http://hl7.org/fhir/search-xpath-usage")
  }
  case object NEARBY extends SEARCH_XPATH_USAGE("nearby") {
    def display: Option[String] = Some("Nearby")
    def system: Option[String]  = Some("http://hl7.org/fhir/search-xpath-usage")
  }
  case object NORMAL extends SEARCH_XPATH_USAGE("normal") {
    def display: Option[String] = Some("Normal")
    def system: Option[String]  = Some("http://hl7.org/fhir/search-xpath-usage")
  }
  case object OTHER extends SEARCH_XPATH_USAGE("other") {
    def display: Option[String] = Some("Other")
    def system: Option[String]  = Some("http://hl7.org/fhir/search-xpath-usage")
  }
  case object PHONETIC extends SEARCH_XPATH_USAGE("phonetic") {
    def display: Option[String] = Some("Phonetic")
    def system: Option[String]  = Some("http://hl7.org/fhir/search-xpath-usage")
  }
}

sealed abstract class SEQUENCE_TYPE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object SEQUENCE_TYPE extends FhirEnum[SEQUENCE_TYPE] with FhirCirceEnum[SEQUENCE_TYPE] {
  val reference = "http://hl7.org/fhir/ValueSet/sequence-type"
  val values    = findValues
  case object AA extends SEQUENCE_TYPE("aa") {
    def display: Option[String] = Some("AA Sequence")
    def system: Option[String]  = Some("http://hl7.org/fhir/sequence-type")
  }
  case object DNA extends SEQUENCE_TYPE("dna") {
    def display: Option[String] = Some("DNA Sequence")
    def system: Option[String]  = Some("http://hl7.org/fhir/sequence-type")
  }
  case object RNA extends SEQUENCE_TYPE("rna") {
    def display: Option[String] = Some("RNA Sequence")
    def system: Option[String]  = Some("http://hl7.org/fhir/sequence-type")
  }
}

sealed abstract class SLOTSTATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object SLOTSTATUS extends FhirEnum[SLOTSTATUS] with FhirCirceEnum[SLOTSTATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/slotstatus"
  val values    = findValues
  case object BUSY extends SLOTSTATUS("busy") {
    def display: Option[String] = Some("Busy")
    def system: Option[String]  = Some("http://hl7.org/fhir/slotstatus")
  }
  case object BUSY_TENTATIVE extends SLOTSTATUS("busy-tentative") {
    def display: Option[String] = Some("Busy (Tentative)")
    def system: Option[String]  = Some("http://hl7.org/fhir/slotstatus")
  }
  case object BUSY_UNAVAILABLE extends SLOTSTATUS("busy-unavailable") {
    def display: Option[String] = Some("Busy (Unavailable)")
    def system: Option[String]  = Some("http://hl7.org/fhir/slotstatus")
  }
  case object ENTERED_IN_ERROR extends SLOTSTATUS("entered-in-error") {
    def display: Option[String] = Some("Entered in error")
    def system: Option[String]  = Some("http://hl7.org/fhir/slotstatus")
  }
  case object FREE extends SLOTSTATUS("free") {
    def display: Option[String] = Some("Free")
    def system: Option[String]  = Some("http://hl7.org/fhir/slotstatus")
  }
}

sealed abstract class SPDX_LICENSE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object SPDX_LICENSE extends FhirEnum[SPDX_LICENSE] with FhirCirceEnum[SPDX_LICENSE] {
  val reference = "http://hl7.org/fhir/ValueSet/spdx-license"
  val values    = findValues
  case object AAL extends SPDX_LICENSE("AAL") {
    def display: Option[String] = Some("Attribution Assurance License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object ABSTYLES extends SPDX_LICENSE("Abstyles") {
    def display: Option[String] = Some("Abstyles License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object ACADEMIC_FREE_LICENSE_V1_1 extends SPDX_LICENSE("AFL-1.1") {
    def display: Option[String] = Some("Academic Free License v1.1")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object ACADEMIC_FREE_LICENSE_V1_2 extends SPDX_LICENSE("AFL-1.2") {
    def display: Option[String] = Some("Academic Free License v1.2")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object ACADEMIC_FREE_LICENSE_V2_0 extends SPDX_LICENSE("AFL-2.0") {
    def display: Option[String] = Some("Academic Free License v2.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object ACADEMIC_FREE_LICENSE_V2_1 extends SPDX_LICENSE("AFL-2.1") {
    def display: Option[String] = Some("Academic Free License v2.1")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object ACADEMIC_FREE_LICENSE_V3_0 extends SPDX_LICENSE("AFL-3.0") {
    def display: Option[String] = Some("Academic Free License v3.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object ADAPTIVE_PUBLIC_LICENSE_1_0 extends SPDX_LICENSE("APL-1.0") {
    def display: Option[String] = Some("Adaptive Public License 1.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object ADOBE_GLYPH_LIST_LICENSE extends SPDX_LICENSE("Adobe-Glyph") {
    def display: Option[String] = Some("Adobe Glyph List License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object ADOBE_SYSTEMS_INCORPORATED_SOURCE_CODE_LICENSE_AGREEMENT extends SPDX_LICENSE("Adobe-2006") {
    def display: Option[String] = Some("Adobe Systems Incorporated Source Code License Agreement")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object ADSL extends SPDX_LICENSE("ADSL") {
    def display: Option[String] = Some("Amazon Digital Services License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object AFFERO_GENERAL_PUBLIC_LICENSE_V1_0_ONLY extends SPDX_LICENSE("AGPL-1.0-only") {
    def display: Option[String] = Some("Affero General Public License v1.0 only")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object AFFERO_GENERAL_PUBLIC_LICENSE_V1_0_OR_LATER extends SPDX_LICENSE("AGPL-1.0-or-later") {
    def display: Option[String] = Some("Affero General Public License v1.0 or later")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object AFMPARSE extends SPDX_LICENSE("Afmparse") {
    def display: Option[String] = Some("Afmparse License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object ALADDIN extends SPDX_LICENSE("Aladdin") {
    def display: Option[String] = Some("Aladdin Free Public License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object AMDPLPA extends SPDX_LICENSE("AMDPLPA") {
    def display: Option[String] = Some("AMD's plpa_map.c License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object AML extends SPDX_LICENSE("AML") {
    def display: Option[String] = Some("Apple MIT License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object AMPAS extends SPDX_LICENSE("AMPAS") {
    def display: Option[String] = Some("Academy of Motion Picture Arts and Sciences BSD")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object ANTLR_SOFTWARE_RIGHTS_NOTICE extends SPDX_LICENSE("ANTLR-PD") {
    def display: Option[String] = Some("ANTLR Software Rights Notice")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object APACHE_LICENSE_1_0 extends SPDX_LICENSE("Apache-1.0") {
    def display: Option[String] = Some("Apache License 1.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object APACHE_LICENSE_1_1 extends SPDX_LICENSE("Apache-1.1") {
    def display: Option[String] = Some("Apache License 1.1")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object APACHE_LICENSE_2_0 extends SPDX_LICENSE("Apache-2.0") {
    def display: Option[String] = Some("Apache License 2.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object APAFML extends SPDX_LICENSE("APAFML") {
    def display: Option[String] = Some("Adobe Postscript AFM License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object APPLE_PUBLIC_SOURCE_LICENSE_1_0 extends SPDX_LICENSE("APSL-1.0") {
    def display: Option[String] = Some("Apple Public Source License 1.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object APPLE_PUBLIC_SOURCE_LICENSE_1_1 extends SPDX_LICENSE("APSL-1.1") {
    def display: Option[String] = Some("Apple Public Source License 1.1")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object APPLE_PUBLIC_SOURCE_LICENSE_1_2 extends SPDX_LICENSE("APSL-1.2") {
    def display: Option[String] = Some("Apple Public Source License 1.2")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object APPLE_PUBLIC_SOURCE_LICENSE_2_0 extends SPDX_LICENSE("APSL-2.0") {
    def display: Option[String] = Some("Apple Public Source License 2.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object ARTISTIC_10_CL8 extends SPDX_LICENSE("Artistic-1.0-cl8") {
    def display: Option[String] = Some("Artistic License 1.0 w/clause 8")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object ARTISTIC_10_PERL extends SPDX_LICENSE("Artistic-1.0-Perl") {
    def display: Option[String] = Some("Artistic License 1.0 (Perl)")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object ARTISTIC_LICENSE_1_0 extends SPDX_LICENSE("Artistic-1.0") {
    def display: Option[String] = Some("Artistic License 1.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object ARTISTIC_LICENSE_2_0 extends SPDX_LICENSE("Artistic-2.0") {
    def display: Option[String] = Some("Artistic License 2.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object BAHYPH extends SPDX_LICENSE("Bahyph") {
    def display: Option[String] = Some("Bahyph License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object BARR extends SPDX_LICENSE("Barr") {
    def display: Option[String] = Some("Barr License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object BEERWARE extends SPDX_LICENSE("Beerware") {
    def display: Option[String] = Some("Beerware License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object BITTORRENT_OPEN_SOURCE_LICENSE_V1_0 extends SPDX_LICENSE("BitTorrent-1.0") {
    def display: Option[String] = Some("BitTorrent Open Source License v1.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object BITTORRENT_OPEN_SOURCE_LICENSE_V1_1 extends SPDX_LICENSE("BitTorrent-1.1") {
    def display: Option[String] = Some("BitTorrent Open Source License v1.1")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object BOOST_SOFTWARE_LICENSE_1_0 extends SPDX_LICENSE("BSL-1.0") {
    def display: Option[String] = Some("Boost Software License 1.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object BORCEUX extends SPDX_LICENSE("Borceux") {
    def display: Option[String] = Some("Borceux license")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object BSD_1_CLAUSE_LICENSE extends SPDX_LICENSE("BSD-1-Clause") {
    def display: Option[String] = Some("BSD 1-Clause License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object BSD_2_CLAUSE extends SPDX_LICENSE("BSD-2-Clause") {
    def display: Option[String] = Some("BSD 2-Clause \"Simplified\" License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object BSD_2_CLAUSE_FREEBSD_LICENSE extends SPDX_LICENSE("BSD-2-Clause-FreeBSD") {
    def display: Option[String] = Some("BSD 2-Clause FreeBSD License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object BSD_2_CLAUSE_NETBSD_LICENSE extends SPDX_LICENSE("BSD-2-Clause-NetBSD") {
    def display: Option[String] = Some("BSD 2-Clause NetBSD License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object BSD_2_CLAUSE_PLUS_PATENT_LICENSE extends SPDX_LICENSE("BSD-2-Clause-Patent") {
    def display: Option[String] = Some("BSD-2-Clause Plus Patent License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object BSD_3_CLAUSE extends SPDX_LICENSE("BSD-3-Clause") {
    def display: Option[String] = Some("BSD 3-Clause \"New\" or \"Revised\" License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object BSD_3_CLAUSE_CLEAR_LICENSE extends SPDX_LICENSE("BSD-3-Clause-Clear") {
    def display: Option[String] = Some("BSD 3-Clause Clear License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object BSD_3_CLAUSE_NO_NUCLEAR_LICENSE extends SPDX_LICENSE("BSD-3-Clause-No-Nuclear-License") {
    def display: Option[String] = Some("BSD 3-Clause No Nuclear License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object BSD_3_CLAUSE_NO_NUCLEAR_LICENSE_2014 extends SPDX_LICENSE("BSD-3-Clause-No-Nuclear-License-2014") {
    def display: Option[String] = Some("BSD 3-Clause No Nuclear License 2014")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object BSD_3_CLAUSE_NO_NUCLEAR_WARRANTY extends SPDX_LICENSE("BSD-3-Clause-No-Nuclear-Warranty") {
    def display: Option[String] = Some("BSD 3-Clause No Nuclear Warranty")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object BSD_4_CLAUSE extends SPDX_LICENSE("BSD-4-Clause") {
    def display: Option[String] = Some("BSD 4-Clause \"Original\" or \"Old\" License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object BSD_4_CLAUSE_UC extends SPDX_LICENSE("BSD-4-Clause-UC") {
    def display: Option[String] = Some("BSD-4-Clause (University of California-Specific)")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object BSD_PROTECTION_LICENSE extends SPDX_LICENSE("BSD-Protection") {
    def display: Option[String] = Some("BSD Protection License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object BSD_SOURCE_CODE_ATTRIBUTION extends SPDX_LICENSE("BSD-Source-Code") {
    def display: Option[String] = Some("BSD Source Code Attribution")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object BSD_WITH_ATTRIBUTION extends SPDX_LICENSE("BSD-3-Clause-Attribution") {
    def display: Option[String] = Some("BSD with attribution")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object BSD_ZERO_CLAUSE_LICENSE extends SPDX_LICENSE("0BSD") {
    def display: Option[String] = Some("BSD Zero Clause License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object BZIP2_AND_LIBBZIP2_LICENSE_V1_0_5 extends SPDX_LICENSE("bzip2-1.0.5") {
    def display: Option[String] = Some("bzip2 and libbzip2 License v1.0.5")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object BZIP2_AND_LIBBZIP2_LICENSE_V1_0_6 extends SPDX_LICENSE("bzip2-1.0.6") {
    def display: Option[String] = Some("bzip2 and libbzip2 License v1.0.6")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CALDERA extends SPDX_LICENSE("Caldera") {
    def display: Option[String] = Some("Caldera License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CECILL_B_FREE_SOFTWARE_LICENSE_AGREEMENT extends SPDX_LICENSE("CECILL-B") {
    def display: Option[String] = Some("CeCILL-B Free Software License Agreement")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CECILL_C_FREE_SOFTWARE_LICENSE_AGREEMENT extends SPDX_LICENSE("CECILL-C") {
    def display: Option[String] = Some("CeCILL-C Free Software License Agreement")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CECILL_FREE_SOFTWARE_LICENSE_AGREEMENT_V1_0 extends SPDX_LICENSE("CECILL-1.0") {
    def display: Option[String] = Some("CeCILL Free Software License Agreement v1.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CECILL_FREE_SOFTWARE_LICENSE_AGREEMENT_V1_1 extends SPDX_LICENSE("CECILL-1.1") {
    def display: Option[String] = Some("CeCILL Free Software License Agreement v1.1")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CECILL_FREE_SOFTWARE_LICENSE_AGREEMENT_V2_0 extends SPDX_LICENSE("CECILL-2.0") {
    def display: Option[String] = Some("CeCILL Free Software License Agreement v2.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CECILL_FREE_SOFTWARE_LICENSE_AGREEMENT_V2_1 extends SPDX_LICENSE("CECILL-2.1") {
    def display: Option[String] = Some("CeCILL Free Software License Agreement v2.1")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CLARTISTIC extends SPDX_LICENSE("ClArtistic") {
    def display: Option[String] = Some("Clarified Artistic License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CMU_LICENSE extends SPDX_LICENSE("MIT-CMU") {
    def display: Option[String] = Some("CMU License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CNRI_JYTHON_LICENSE extends SPDX_LICENSE("CNRI-Jython") {
    def display: Option[String] = Some("CNRI Jython License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CNRI_PYTHON_LICENSE extends SPDX_LICENSE("CNRI-Python") {
    def display: Option[String] = Some("CNRI Python License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CNRI_PYTHON_OPEN_SOURCE_GPL_COMPATIBLE_LICENSE_AGREEMENT
      extends SPDX_LICENSE("CNRI-Python-GPL-Compatible") {
    def display: Option[String] = Some("CNRI Python Open Source GPL Compatible License Agreement")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CODE_PROJECT_OPEN_LICENSE_1_02 extends SPDX_LICENSE("CPOL-1.02") {
    def display: Option[String] = Some("Code Project Open License 1.02")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object COMMON_DEVELOPMENT_AND_DISTRIBUTION_LICENSE_1_0 extends SPDX_LICENSE("CDDL-1.0") {
    def display: Option[String] = Some("Common Development and Distribution License 1.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object COMMON_DEVELOPMENT_AND_DISTRIBUTION_LICENSE_1_1 extends SPDX_LICENSE("CDDL-1.1") {
    def display: Option[String] = Some("Common Development and Distribution License 1.1")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object COMMON_PUBLIC_ATTRIBUTION_LICENSE_1_0 extends SPDX_LICENSE("CPAL-1.0") {
    def display: Option[String] = Some("Common Public Attribution License 1.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object COMMON_PUBLIC_LICENSE_1_0 extends SPDX_LICENSE("CPL-1.0") {
    def display: Option[String] = Some("Common Public License 1.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object COMMUNITY_DATA_LICENSE_AGREEMENT_PERMISSIVE_1_0 extends SPDX_LICENSE("CDLA-Permissive-1.0") {
    def display: Option[String] = Some("Community Data License Agreement Permissive 1.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object COMMUNITY_DATA_LICENSE_AGREEMENT_SHARING_1_0 extends SPDX_LICENSE("CDLA-Sharing-1.0") {
    def display: Option[String] = Some("Community Data License Agreement Sharing 1.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object COMPUTER_ASSOCIATES_TRUSTED_OPEN_SOURCE_LICENSE_1_1 extends SPDX_LICENSE("CATOSL-1.1") {
    def display: Option[String] = Some("Computer Associates Trusted Open Source License 1.1")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CONDOR_PUBLIC_LICENSE_V1_1 extends SPDX_LICENSE("Condor-1.1") {
    def display: Option[String] = Some("Condor Public License v1.1")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CREATIVE_COMMONS_ATTRIBUTION_1_0_GENERIC extends SPDX_LICENSE("CC-BY-1.0") {
    def display: Option[String] = Some("Creative Commons Attribution 1.0 Generic")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CREATIVE_COMMONS_ATTRIBUTION_2_0_GENERIC extends SPDX_LICENSE("CC-BY-2.0") {
    def display: Option[String] = Some("Creative Commons Attribution 2.0 Generic")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CREATIVE_COMMONS_ATTRIBUTION_2_5_GENERIC extends SPDX_LICENSE("CC-BY-2.5") {
    def display: Option[String] = Some("Creative Commons Attribution 2.5 Generic")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CREATIVE_COMMONS_ATTRIBUTION_3_0_UNPORTED extends SPDX_LICENSE("CC-BY-3.0") {
    def display: Option[String] = Some("Creative Commons Attribution 3.0 Unported")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CREATIVE_COMMONS_ATTRIBUTION_4_0_INTERNATIONAL extends SPDX_LICENSE("CC-BY-4.0") {
    def display: Option[String] = Some("Creative Commons Attribution 4.0 International")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_1_0_GENERIC extends SPDX_LICENSE("CC-BY-NC-1.0") {
    def display: Option[String] = Some("Creative Commons Attribution Non Commercial 1.0 Generic")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_2_0_GENERIC extends SPDX_LICENSE("CC-BY-NC-2.0") {
    def display: Option[String] = Some("Creative Commons Attribution Non Commercial 2.0 Generic")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_2_5_GENERIC extends SPDX_LICENSE("CC-BY-NC-2.5") {
    def display: Option[String] = Some("Creative Commons Attribution Non Commercial 2.5 Generic")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_3_0_UNPORTED extends SPDX_LICENSE("CC-BY-NC-3.0") {
    def display: Option[String] = Some("Creative Commons Attribution Non Commercial 3.0 Unported")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_4_0_INTERNATIONAL extends SPDX_LICENSE("CC-BY-NC-4.0") {
    def display: Option[String] = Some("Creative Commons Attribution Non Commercial 4.0 International")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_NO_DERIVATIVES_1_0_GENERIC
      extends SPDX_LICENSE("CC-BY-NC-ND-1.0") {
    def display: Option[String] = Some("Creative Commons Attribution Non Commercial No Derivatives 1.0 Generic")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_NO_DERIVATIVES_2_0_GENERIC
      extends SPDX_LICENSE("CC-BY-NC-ND-2.0") {
    def display: Option[String] = Some("Creative Commons Attribution Non Commercial No Derivatives 2.0 Generic")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_NO_DERIVATIVES_2_5_GENERIC
      extends SPDX_LICENSE("CC-BY-NC-ND-2.5") {
    def display: Option[String] = Some("Creative Commons Attribution Non Commercial No Derivatives 2.5 Generic")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_NO_DERIVATIVES_3_0_UNPORTED
      extends SPDX_LICENSE("CC-BY-NC-ND-3.0") {
    def display: Option[String] = Some("Creative Commons Attribution Non Commercial No Derivatives 3.0 Unported")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_NO_DERIVATIVES_4_0_INTERNATIONAL
      extends SPDX_LICENSE("CC-BY-NC-ND-4.0") {
    def display: Option[String] = Some("Creative Commons Attribution Non Commercial No Derivatives 4.0 International")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_SHARE_ALIKE_1_0_GENERIC
      extends SPDX_LICENSE("CC-BY-NC-SA-1.0") {
    def display: Option[String] = Some("Creative Commons Attribution Non Commercial Share Alike 1.0 Generic")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_SHARE_ALIKE_2_0_GENERIC
      extends SPDX_LICENSE("CC-BY-NC-SA-2.0") {
    def display: Option[String] = Some("Creative Commons Attribution Non Commercial Share Alike 2.0 Generic")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_SHARE_ALIKE_2_5_GENERIC
      extends SPDX_LICENSE("CC-BY-NC-SA-2.5") {
    def display: Option[String] = Some("Creative Commons Attribution Non Commercial Share Alike 2.5 Generic")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_SHARE_ALIKE_3_0_UNPORTED
      extends SPDX_LICENSE("CC-BY-NC-SA-3.0") {
    def display: Option[String] = Some("Creative Commons Attribution Non Commercial Share Alike 3.0 Unported")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CREATIVE_COMMONS_ATTRIBUTION_NON_COMMERCIAL_SHARE_ALIKE_4_0_INTERNATIONAL
      extends SPDX_LICENSE("CC-BY-NC-SA-4.0") {
    def display: Option[String] = Some("Creative Commons Attribution Non Commercial Share Alike 4.0 International")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CREATIVE_COMMONS_ATTRIBUTION_NO_DERIVATIVES_1_0_GENERIC extends SPDX_LICENSE("CC-BY-ND-1.0") {
    def display: Option[String] = Some("Creative Commons Attribution No Derivatives 1.0 Generic")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CREATIVE_COMMONS_ATTRIBUTION_NO_DERIVATIVES_2_0_GENERIC extends SPDX_LICENSE("CC-BY-ND-2.0") {
    def display: Option[String] = Some("Creative Commons Attribution No Derivatives 2.0 Generic")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CREATIVE_COMMONS_ATTRIBUTION_NO_DERIVATIVES_2_5_GENERIC extends SPDX_LICENSE("CC-BY-ND-2.5") {
    def display: Option[String] = Some("Creative Commons Attribution No Derivatives 2.5 Generic")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CREATIVE_COMMONS_ATTRIBUTION_NO_DERIVATIVES_3_0_UNPORTED extends SPDX_LICENSE("CC-BY-ND-3.0") {
    def display: Option[String] = Some("Creative Commons Attribution No Derivatives 3.0 Unported")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CREATIVE_COMMONS_ATTRIBUTION_NO_DERIVATIVES_4_0_INTERNATIONAL extends SPDX_LICENSE("CC-BY-ND-4.0") {
    def display: Option[String] = Some("Creative Commons Attribution No Derivatives 4.0 International")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CREATIVE_COMMONS_ATTRIBUTION_SHARE_ALIKE_1_0_GENERIC extends SPDX_LICENSE("CC-BY-SA-1.0") {
    def display: Option[String] = Some("Creative Commons Attribution Share Alike 1.0 Generic")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CREATIVE_COMMONS_ATTRIBUTION_SHARE_ALIKE_2_0_GENERIC extends SPDX_LICENSE("CC-BY-SA-2.0") {
    def display: Option[String] = Some("Creative Commons Attribution Share Alike 2.0 Generic")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CREATIVE_COMMONS_ATTRIBUTION_SHARE_ALIKE_2_5_GENERIC extends SPDX_LICENSE("CC-BY-SA-2.5") {
    def display: Option[String] = Some("Creative Commons Attribution Share Alike 2.5 Generic")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CREATIVE_COMMONS_ATTRIBUTION_SHARE_ALIKE_3_0_UNPORTED extends SPDX_LICENSE("CC-BY-SA-3.0") {
    def display: Option[String] = Some("Creative Commons Attribution Share Alike 3.0 Unported")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CREATIVE_COMMONS_ATTRIBUTION_SHARE_ALIKE_4_0_INTERNATIONAL extends SPDX_LICENSE("CC-BY-SA-4.0") {
    def display: Option[String] = Some("Creative Commons Attribution Share Alike 4.0 International")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CREATIVE_COMMONS_ZERO_V1_0_UNIVERSAL extends SPDX_LICENSE("CC0-1.0") {
    def display: Option[String] = Some("Creative Commons Zero v1.0 Universal")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CROSSWORD extends SPDX_LICENSE("Crossword") {
    def display: Option[String] = Some("Crossword License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CRYSTALSTACKER extends SPDX_LICENSE("CrystalStacker") {
    def display: Option[String] = Some("CrystalStacker License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CUA_OFFICE_PUBLIC_LICENSE_V1_0 extends SPDX_LICENSE("CUA-OPL-1.0") {
    def display: Option[String] = Some("CUA Office Public License v1.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CUBE extends SPDX_LICENSE("Cube") {
    def display: Option[String] = Some("Cube License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object CURL extends SPDX_LICENSE("curl") {
    def display: Option[String] = Some("curl License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object DEUTSCHE_FREIE_SOFTWARE_LIZENZ extends SPDX_LICENSE("D-FSL-1.0") {
    def display: Option[String] = Some("Deutsche Freie Software Lizenz")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object DIFFMARK extends SPDX_LICENSE("diffmark") {
    def display: Option[String] = Some("diffmark license")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object DOC extends SPDX_LICENSE("DOC") {
    def display: Option[String] = Some("DOC License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object DOTSEQN extends SPDX_LICENSE("Dotseqn") {
    def display: Option[String] = Some("Dotseqn License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object DSDP extends SPDX_LICENSE("DSDP") {
    def display: Option[String] = Some("DSDP License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object DVIPDFM extends SPDX_LICENSE("dvipdfm") {
    def display: Option[String] = Some("dvipdfm License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object ECLIPSE_PUBLIC_LICENSE_1_0 extends SPDX_LICENSE("EPL-1.0") {
    def display: Option[String] = Some("Eclipse Public License 1.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object ECLIPSE_PUBLIC_LICENSE_2_0 extends SPDX_LICENSE("EPL-2.0") {
    def display: Option[String] = Some("Eclipse Public License 2.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object EDUCATIONAL_COMMUNITY_LICENSE_V1_0 extends SPDX_LICENSE("ECL-1.0") {
    def display: Option[String] = Some("Educational Community License v1.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object EDUCATIONAL_COMMUNITY_LICENSE_V2_0 extends SPDX_LICENSE("ECL-2.0") {
    def display: Option[String] = Some("Educational Community License v2.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object EGENIX extends SPDX_LICENSE("eGenix") {
    def display: Option[String] = Some("eGenix.com Public License 1.1.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object EIFFEL_FORUM_LICENSE_V1_0 extends SPDX_LICENSE("EFL-1.0") {
    def display: Option[String] = Some("Eiffel Forum License v1.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object EIFFEL_FORUM_LICENSE_V2_0 extends SPDX_LICENSE("EFL-2.0") {
    def display: Option[String] = Some("Eiffel Forum License v2.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object ENNA_LICENSE extends SPDX_LICENSE("MIT-enna") {
    def display: Option[String] = Some("enna License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object ENTESSA extends SPDX_LICENSE("Entessa") {
    def display: Option[String] = Some("Entessa Public License v1.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object ERLANG_PUBLIC_LICENSE_V1_1 extends SPDX_LICENSE("ErlPL-1.1") {
    def display: Option[String] = Some("Erlang Public License v1.1")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object EUDATAGRID extends SPDX_LICENSE("EUDatagrid") {
    def display: Option[String] = Some("EU DataGrid Software License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object EUROPEAN_UNION_PUBLIC_LICENSE_1_0 extends SPDX_LICENSE("EUPL-1.0") {
    def display: Option[String] = Some("European Union Public License 1.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object EUROPEAN_UNION_PUBLIC_LICENSE_1_1 extends SPDX_LICENSE("EUPL-1.1") {
    def display: Option[String] = Some("European Union Public License 1.1")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object EUROPEAN_UNION_PUBLIC_LICENSE_1_2 extends SPDX_LICENSE("EUPL-1.2") {
    def display: Option[String] = Some("European Union Public License 1.2")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object EUROSYM extends SPDX_LICENSE("Eurosym") {
    def display: Option[String] = Some("Eurosym License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object FAIR extends SPDX_LICENSE("Fair") {
    def display: Option[String] = Some("Fair License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object FEH_LICENSE extends SPDX_LICENSE("MIT-feh") {
    def display: Option[String] = Some("feh License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object FRAMEWORX_OPEN_LICENSE_1_0 extends SPDX_LICENSE("Frameworx-1.0") {
    def display: Option[String] = Some("Frameworx Open License 1.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object FREEIMAGE extends SPDX_LICENSE("FreeImage") {
    def display: Option[String] = Some("FreeImage Public License v1.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object FSFAP extends SPDX_LICENSE("FSFAP") {
    def display: Option[String] = Some("FSF All Permissive License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object FSFUL extends SPDX_LICENSE("FSFUL") {
    def display: Option[String] = Some("FSF Unlimited License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object FSFULLR extends SPDX_LICENSE("FSFULLR") {
    def display: Option[String] = Some("FSF Unlimited License (with License Retention)")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object FTL extends SPDX_LICENSE("FTL") {
    def display: Option[String] = Some("Freetype Project License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object GIFTWARE extends SPDX_LICENSE("Giftware") {
    def display: Option[String] = Some("Giftware License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object GL2PS extends SPDX_LICENSE("GL2PS") {
    def display: Option[String] = Some("GL2PS License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object GLIDE extends SPDX_LICENSE("Glide") {
    def display: Option[String] = Some("3dfx Glide License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object GLULXE extends SPDX_LICENSE("Glulxe") {
    def display: Option[String] = Some("Glulxe License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object GNUPLOT extends SPDX_LICENSE("gnuplot") {
    def display: Option[String] = Some("gnuplot License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object GNU_AFFERO_GENERAL_PUBLIC_LICENSE_V3_0_ONLY extends SPDX_LICENSE("AGPL-3.0-only") {
    def display: Option[String] = Some("GNU Affero General Public License v3.0 only")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object GNU_AFFERO_GENERAL_PUBLIC_LICENSE_V3_0_OR_LATER extends SPDX_LICENSE("AGPL-3.0-or-later") {
    def display: Option[String] = Some("GNU Affero General Public License v3.0 or later")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object GNU_FREE_DOCUMENTATION_LICENSE_V1_1_ONLY extends SPDX_LICENSE("GFDL-1.1-only") {
    def display: Option[String] = Some("GNU Free Documentation License v1.1 only")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object GNU_FREE_DOCUMENTATION_LICENSE_V1_1_OR_LATER extends SPDX_LICENSE("GFDL-1.1-or-later") {
    def display: Option[String] = Some("GNU Free Documentation License v1.1 or later")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object GNU_FREE_DOCUMENTATION_LICENSE_V1_2_ONLY extends SPDX_LICENSE("GFDL-1.2-only") {
    def display: Option[String] = Some("GNU Free Documentation License v1.2 only")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object GNU_FREE_DOCUMENTATION_LICENSE_V1_2_OR_LATER extends SPDX_LICENSE("GFDL-1.2-or-later") {
    def display: Option[String] = Some("GNU Free Documentation License v1.2 or later")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object GNU_FREE_DOCUMENTATION_LICENSE_V1_3_ONLY extends SPDX_LICENSE("GFDL-1.3-only") {
    def display: Option[String] = Some("GNU Free Documentation License v1.3 only")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object GNU_FREE_DOCUMENTATION_LICENSE_V1_3_OR_LATER extends SPDX_LICENSE("GFDL-1.3-or-later") {
    def display: Option[String] = Some("GNU Free Documentation License v1.3 or later")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object GNU_GENERAL_PUBLIC_LICENSE_V1_0_ONLY extends SPDX_LICENSE("GPL-1.0-only") {
    def display: Option[String] = Some("GNU General Public License v1.0 only")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object GNU_GENERAL_PUBLIC_LICENSE_V1_0_OR_LATER extends SPDX_LICENSE("GPL-1.0-or-later") {
    def display: Option[String] = Some("GNU General Public License v1.0 or later")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object GNU_GENERAL_PUBLIC_LICENSE_V2_0_ONLY extends SPDX_LICENSE("GPL-2.0-only") {
    def display: Option[String] = Some("GNU General Public License v2.0 only")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object GNU_GENERAL_PUBLIC_LICENSE_V2_0_OR_LATER extends SPDX_LICENSE("GPL-2.0-or-later") {
    def display: Option[String] = Some("GNU General Public License v2.0 or later")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object GNU_GENERAL_PUBLIC_LICENSE_V3_0_ONLY extends SPDX_LICENSE("GPL-3.0-only") {
    def display: Option[String] = Some("GNU General Public License v3.0 only")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object GNU_GENERAL_PUBLIC_LICENSE_V3_0_OR_LATER extends SPDX_LICENSE("GPL-3.0-or-later") {
    def display: Option[String] = Some("GNU General Public License v3.0 or later")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object GNU_LESSER_GENERAL_PUBLIC_LICENSE_V2_1_ONLY extends SPDX_LICENSE("LGPL-2.1-only") {
    def display: Option[String] = Some("GNU Lesser General Public License v2.1 only")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object GNU_LESSER_GENERAL_PUBLIC_LICENSE_V2_1_OR_LATER extends SPDX_LICENSE("LGPL-2.1-or-later") {
    def display: Option[String] = Some("GNU Lesser General Public License v2.1 or later")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object GNU_LESSER_GENERAL_PUBLIC_LICENSE_V3_0_ONLY extends SPDX_LICENSE("LGPL-3.0-only") {
    def display: Option[String] = Some("GNU Lesser General Public License v3.0 only")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object GNU_LESSER_GENERAL_PUBLIC_LICENSE_V3_0_OR_LATER extends SPDX_LICENSE("LGPL-3.0-or-later") {
    def display: Option[String] = Some("GNU Lesser General Public License v3.0 or later")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object GNU_LIBRARY_GENERAL_PUBLIC_LICENSE_V2_ONLY extends SPDX_LICENSE("LGPL-2.0-only") {
    def display: Option[String] = Some("GNU Library General Public License v2 only")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object GNU_LIBRARY_GENERAL_PUBLIC_LICENSE_V2_OR_LATER extends SPDX_LICENSE("LGPL-2.0-or-later") {
    def display: Option[String] = Some("GNU Library General Public License v2 or later")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object GSOAP_PUBLIC_LICENSE_V1_3B extends SPDX_LICENSE("gSOAP-1.3b") {
    def display: Option[String] = Some("gSOAP Public License v1.3b")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object HASKELLREPORT extends SPDX_LICENSE("HaskellReport") {
    def display: Option[String] = Some("Haskell Language Report License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object HPND extends SPDX_LICENSE("HPND") {
    def display: Option[String] = Some("Historical Permission Notice and Disclaimer")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object IBM_POWERPC_INITIALIZATION_AND_BOOT_SOFTWARE extends SPDX_LICENSE("IBM-pibs") {
    def display: Option[String] = Some("IBM PowerPC Initialization and Boot Software")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object IBM_PUBLIC_LICENSE_V1_0 extends SPDX_LICENSE("IPL-1.0") {
    def display: Option[String] = Some("IBM Public License v1.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object ICU extends SPDX_LICENSE("ICU") {
    def display: Option[String] = Some("ICU License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object IJG extends SPDX_LICENSE("IJG") {
    def display: Option[String] = Some("Independent JPEG Group License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object IMAGEMAGICK extends SPDX_LICENSE("ImageMagick") {
    def display: Option[String] = Some("ImageMagick License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object IMATIX extends SPDX_LICENSE("iMatix") {
    def display: Option[String] = Some("iMatix Standard Function Library Agreement")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object IMLIB2 extends SPDX_LICENSE("Imlib2") {
    def display: Option[String] = Some("Imlib2 License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object INFO_ZIP_LICENSE extends SPDX_LICENSE("Info-ZIP") {
    def display: Option[String] = Some("Info-ZIP License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object INTEL extends SPDX_LICENSE("Intel") {
    def display: Option[String] = Some("Intel Open Source License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object INTEL_ACPI_SOFTWARE_LICENSE_AGREEMENT extends SPDX_LICENSE("Intel-ACPI") {
    def display: Option[String] = Some("Intel ACPI Software License Agreement")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object INTERBASE_PUBLIC_LICENSE_V1_0 extends SPDX_LICENSE("Interbase-1.0") {
    def display: Option[String] = Some("Interbase Public License v1.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object IPA extends SPDX_LICENSE("IPA") {
    def display: Option[String] = Some("IPA Font License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object ISC extends SPDX_LICENSE("ISC") {
    def display: Option[String] = Some("ISC License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object JASPER_LICENSE extends SPDX_LICENSE("JasPer-2.0") {
    def display: Option[String] = Some("JasPer License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object JSON extends SPDX_LICENSE("JSON") {
    def display: Option[String] = Some("JSON License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object LATEX2E extends SPDX_LICENSE("Latex2e") {
    def display: Option[String] = Some("Latex2e License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object LATEX_PROJECT_PUBLIC_LICENSE_V1_0 extends SPDX_LICENSE("LPPL-1.0") {
    def display: Option[String] = Some("LaTeX Project Public License v1.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object LATEX_PROJECT_PUBLIC_LICENSE_V1_1 extends SPDX_LICENSE("LPPL-1.1") {
    def display: Option[String] = Some("LaTeX Project Public License v1.1")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object LATEX_PROJECT_PUBLIC_LICENSE_V1_2 extends SPDX_LICENSE("LPPL-1.2") {
    def display: Option[String] = Some("LaTeX Project Public License v1.2")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object LATEX_PROJECT_PUBLIC_LICENSE_V1_3A extends SPDX_LICENSE("LPPL-1.3a") {
    def display: Option[String] = Some("LaTeX Project Public License v1.3a")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object LATEX_PROJECT_PUBLIC_LICENSE_V1_3C extends SPDX_LICENSE("LPPL-1.3c") {
    def display: Option[String] = Some("LaTeX Project Public License v1.3c")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object LAWRENCE_BERKELEY_NATIONAL_LABS_BSD_VARIANT_LICENSE extends SPDX_LICENSE("BSD-3-Clause-LBNL") {
    def display: Option[String] = Some("Lawrence Berkeley National Labs BSD variant license")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object LEPTONICA extends SPDX_LICENSE("Leptonica") {
    def display: Option[String] = Some("Leptonica License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object LGPLLR extends SPDX_LICENSE("LGPLLR") {
    def display: Option[String] = Some("Lesser General Public License For Linguistic Resources")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object LIBPNG extends SPDX_LICENSE("Libpng") {
    def display: Option[String] = Some("libpng License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object LIBTIFF extends SPDX_LICENSE("libtiff") {
    def display: Option[String] = Some("libtiff License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object LICENCE_ART_LIBRE_1_2 extends SPDX_LICENSE("LAL-1.2") {
    def display: Option[String] = Some("Licence Art Libre 1.2")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object LICENCE_ART_LIBRE_1_3 extends SPDX_LICENSE("LAL-1.3") {
    def display: Option[String] = Some("Licence Art Libre 1.3")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object LILIQ_P_11 extends SPDX_LICENSE("LiLiQ-P-1.1") {
    def display: Option[String] = Some("Licence Libre du Québec – Permissive version 1.1")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object LILIQ_RPLUS_11 extends SPDX_LICENSE("LiLiQ-Rplus-1.1") {
    def display: Option[String] = Some("Licence Libre du Québec – Réciprocité forte version 1.1")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object LILIQ_R_11 extends SPDX_LICENSE("LiLiQ-R-1.1") {
    def display: Option[String] = Some("Licence Libre du Québec – Réciprocité version 1.1")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object LINUX_KERNEL_VARIANT_OF_OPENIB_ORG_LICENSE extends SPDX_LICENSE("Linux-OpenIB") {
    def display: Option[String] = Some("Linux Kernel Variant of OpenIB.org license")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object LUCENT_PUBLIC_LICENSE_V1_02 extends SPDX_LICENSE("LPL-1.02") {
    def display: Option[String] = Some("Lucent Public License v1.02")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object LUCENT_PUBLIC_LICENSE_VERSION_1_0 extends SPDX_LICENSE("LPL-1.0") {
    def display: Option[String] = Some("Lucent Public License Version 1.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object MAKEINDEX extends SPDX_LICENSE("MakeIndex") {
    def display: Option[String] = Some("MakeIndex License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object MICROSOFT_PUBLIC_LICENSE extends SPDX_LICENSE("MS-PL") {
    def display: Option[String] = Some("Microsoft Public License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object MICROSOFT_RECIPROCAL_LICENSE extends SPDX_LICENSE("MS-RL") {
    def display: Option[String] = Some("Microsoft Reciprocal License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object MIROS extends SPDX_LICENSE("MirOS") {
    def display: Option[String] = Some("MirOS License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object MIT extends SPDX_LICENSE("MIT") {
    def display: Option[String] = Some("MIT License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object MITNFA extends SPDX_LICENSE("MITNFA") {
    def display: Option[String] = Some("MIT +no-false-attribs license")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object MIT_ADVERTISING extends SPDX_LICENSE("MIT-advertising") {
    def display: Option[String] = Some("Enlightenment License (e16)")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object MIT_NO_ATTRIBUTION extends SPDX_LICENSE("MIT-0") {
    def display: Option[String] = Some("MIT No Attribution")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object MOTOSOTO extends SPDX_LICENSE("Motosoto") {
    def display: Option[String] = Some("Motosoto License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object MOZILLA_PUBLIC_LICENSE_1_0 extends SPDX_LICENSE("MPL-1.0") {
    def display: Option[String] = Some("Mozilla Public License 1.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object MOZILLA_PUBLIC_LICENSE_1_1 extends SPDX_LICENSE("MPL-1.1") {
    def display: Option[String] = Some("Mozilla Public License 1.1")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object MOZILLA_PUBLIC_LICENSE_2_0 extends SPDX_LICENSE("MPL-2.0") {
    def display: Option[String] = Some("Mozilla Public License 2.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object MPICH2 extends SPDX_LICENSE("mpich2") {
    def display: Option[String] = Some("mpich2 License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object MPL_20_NO_COPYLEFT_EXCEPTION extends SPDX_LICENSE("MPL-2.0-no-copyleft-exception") {
    def display: Option[String] = Some("Mozilla Public License 2.0 (no copyleft exception)")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object MTLL extends SPDX_LICENSE("MTLL") {
    def display: Option[String] = Some("Matrix Template Library License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object MULTICS extends SPDX_LICENSE("Multics") {
    def display: Option[String] = Some("Multics License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object MUP extends SPDX_LICENSE("Mup") {
    def display: Option[String] = Some("Mup License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object NASA_OPEN_SOURCE_AGREEMENT_1_3 extends SPDX_LICENSE("NASA-1.3") {
    def display: Option[String] = Some("NASA Open Source Agreement 1.3")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object NAUMEN extends SPDX_LICENSE("Naumen") {
    def display: Option[String] = Some("Naumen Public License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object NCSA extends SPDX_LICENSE("NCSA") {
    def display: Option[String] = Some("University of Illinois/NCSA Open Source License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object NETCDF extends SPDX_LICENSE("NetCDF") {
    def display: Option[String] = Some("NetCDF license")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object NETSCAPE_PUBLIC_LICENSE_V1_0 extends SPDX_LICENSE("NPL-1.0") {
    def display: Option[String] = Some("Netscape Public License v1.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object NETSCAPE_PUBLIC_LICENSE_V1_1 extends SPDX_LICENSE("NPL-1.1") {
    def display: Option[String] = Some("Netscape Public License v1.1")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object NET_BOOLEAN_PUBLIC_LICENSE_V1 extends SPDX_LICENSE("NBPL-1.0") {
    def display: Option[String] = Some("Net Boolean Public License v1")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object NET_SNMP_LICENSE extends SPDX_LICENSE("Net-SNMP") {
    def display: Option[String] = Some("Net-SNMP License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object NEWSLETR extends SPDX_LICENSE("Newsletr") {
    def display: Option[String] = Some("Newsletr License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object NGPL extends SPDX_LICENSE("NGPL") {
    def display: Option[String] = Some("Nethack General Public License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object NLPL extends SPDX_LICENSE("NLPL") {
    def display: Option[String] = Some("No Limit Public License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object NOKIA extends SPDX_LICENSE("Nokia") {
    def display: Option[String] = Some("Nokia Open Source License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object NON_PROFIT_OPEN_SOFTWARE_LICENSE_3_0 extends SPDX_LICENSE("NPOSL-3.0") {
    def display: Option[String] = Some("Non-Profit Open Software License 3.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object NORWEGIAN_LICENCE_FOR_OPEN_GOVERNMENT_DATA extends SPDX_LICENSE("NLOD-1.0") {
    def display: Option[String] = Some("Norwegian Licence for Open Government Data")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object NOSL extends SPDX_LICENSE("NOSL") {
    def display: Option[String] = Some("Netizen Open Source License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object NOT_OPEN_SOURCE extends SPDX_LICENSE("not-open-source") {
    def display: Option[String] = Some("Not open source")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object NOWEB extends SPDX_LICENSE("Noweb") {
    def display: Option[String] = Some("Noweb License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object NRL extends SPDX_LICENSE("NRL") {
    def display: Option[String] = Some("NRL License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object NTP extends SPDX_LICENSE("NTP") {
    def display: Option[String] = Some("NTP License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object OCLC_RESEARCH_PUBLIC_LICENSE_2_0 extends SPDX_LICENSE("OCLC-2.0") {
    def display: Option[String] = Some("OCLC Research Public License 2.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object ODC_OPEN_DATABASE_LICENSE_V1_0 extends SPDX_LICENSE("ODbL-1.0") {
    def display: Option[String] = Some("ODC Open Database License v1.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object OGTSL extends SPDX_LICENSE("OGTSL") {
    def display: Option[String] = Some("Open Group Test Suite License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object OLDAP_20 extends SPDX_LICENSE("OLDAP-2.0") {
    def display: Option[String] = Some("Open LDAP Public License v2.0 (or possibly 2.0A and 2.0B)")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object OML extends SPDX_LICENSE("OML") {
    def display: Option[String] = Some("Open Market License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object OPENSSL extends SPDX_LICENSE("OpenSSL") {
    def display: Option[String] = Some("OpenSSL License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object OPEN_CASCADE_TECHNOLOGY_PUBLIC_LICENSE extends SPDX_LICENSE("OCCT-PL") {
    def display: Option[String] = Some("Open CASCADE Technology Public License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object OPEN_LDAP_PUBLIC_LICENSE_2_2_2 extends SPDX_LICENSE("OLDAP-2.2.2") {
    def display: Option[String] = Some("Open LDAP Public License 2.2.2")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object OPEN_LDAP_PUBLIC_LICENSE_V1_1 extends SPDX_LICENSE("OLDAP-1.1") {
    def display: Option[String] = Some("Open LDAP Public License v1.1")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object OPEN_LDAP_PUBLIC_LICENSE_V1_2 extends SPDX_LICENSE("OLDAP-1.2") {
    def display: Option[String] = Some("Open LDAP Public License v1.2")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object OPEN_LDAP_PUBLIC_LICENSE_V1_3 extends SPDX_LICENSE("OLDAP-1.3") {
    def display: Option[String] = Some("Open LDAP Public License v1.3")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object OPEN_LDAP_PUBLIC_LICENSE_V1_4 extends SPDX_LICENSE("OLDAP-1.4") {
    def display: Option[String] = Some("Open LDAP Public License v1.4")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object OPEN_LDAP_PUBLIC_LICENSE_V2_0_1 extends SPDX_LICENSE("OLDAP-2.0.1") {
    def display: Option[String] = Some("Open LDAP Public License v2.0.1")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object OPEN_LDAP_PUBLIC_LICENSE_V2_1 extends SPDX_LICENSE("OLDAP-2.1") {
    def display: Option[String] = Some("Open LDAP Public License v2.1")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object OPEN_LDAP_PUBLIC_LICENSE_V2_2 extends SPDX_LICENSE("OLDAP-2.2") {
    def display: Option[String] = Some("Open LDAP Public License v2.2")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object OPEN_LDAP_PUBLIC_LICENSE_V2_2_1 extends SPDX_LICENSE("OLDAP-2.2.1") {
    def display: Option[String] = Some("Open LDAP Public License v2.2.1")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object OPEN_LDAP_PUBLIC_LICENSE_V2_3 extends SPDX_LICENSE("OLDAP-2.3") {
    def display: Option[String] = Some("Open LDAP Public License v2.3")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object OPEN_LDAP_PUBLIC_LICENSE_V2_4 extends SPDX_LICENSE("OLDAP-2.4") {
    def display: Option[String] = Some("Open LDAP Public License v2.4")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object OPEN_LDAP_PUBLIC_LICENSE_V2_5 extends SPDX_LICENSE("OLDAP-2.5") {
    def display: Option[String] = Some("Open LDAP Public License v2.5")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object OPEN_LDAP_PUBLIC_LICENSE_V2_6 extends SPDX_LICENSE("OLDAP-2.6") {
    def display: Option[String] = Some("Open LDAP Public License v2.6")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object OPEN_LDAP_PUBLIC_LICENSE_V2_7 extends SPDX_LICENSE("OLDAP-2.7") {
    def display: Option[String] = Some("Open LDAP Public License v2.7")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object OPEN_LDAP_PUBLIC_LICENSE_V2_8 extends SPDX_LICENSE("OLDAP-2.8") {
    def display: Option[String] = Some("Open LDAP Public License v2.8")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object OPEN_PUBLIC_LICENSE_V1_0 extends SPDX_LICENSE("OPL-1.0") {
    def display: Option[String] = Some("Open Public License v1.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object OPEN_SOFTWARE_LICENSE_1_0 extends SPDX_LICENSE("OSL-1.0") {
    def display: Option[String] = Some("Open Software License 1.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object OPEN_SOFTWARE_LICENSE_1_1 extends SPDX_LICENSE("OSL-1.1") {
    def display: Option[String] = Some("Open Software License 1.1")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object OPEN_SOFTWARE_LICENSE_2_0 extends SPDX_LICENSE("OSL-2.0") {
    def display: Option[String] = Some("Open Software License 2.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object OPEN_SOFTWARE_LICENSE_2_1 extends SPDX_LICENSE("OSL-2.1") {
    def display: Option[String] = Some("Open Software License 2.1")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object OPEN_SOFTWARE_LICENSE_3_0 extends SPDX_LICENSE("OSL-3.0") {
    def display: Option[String] = Some("Open Software License 3.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object OSET_PUBLIC_LICENSE_VERSION_2_1 extends SPDX_LICENSE("OSET-PL-2.1") {
    def display: Option[String] = Some("OSET Public License version 2.1")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object PDDL_10 extends SPDX_LICENSE("PDDL-1.0") {
    def display: Option[String] = Some("ODC Public Domain Dedication & License 1.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object PHP_LICENSE_V3_0 extends SPDX_LICENSE("PHP-3.0") {
    def display: Option[String] = Some("PHP License v3.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object PHP_LICENSE_V3_01 extends SPDX_LICENSE("PHP-3.01") {
    def display: Option[String] = Some("PHP License v3.01")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object PLEXUS extends SPDX_LICENSE("Plexus") {
    def display: Option[String] = Some("Plexus Classworlds License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object POSTGRESQL extends SPDX_LICENSE("PostgreSQL") {
    def display: Option[String] = Some("PostgreSQL License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object PSFRAG extends SPDX_LICENSE("psfrag") {
    def display: Option[String] = Some("psfrag License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object PSUTILS extends SPDX_LICENSE("psutils") {
    def display: Option[String] = Some("psutils License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object PYTHON_LICENSE_2_0 extends SPDX_LICENSE("Python-2.0") {
    def display: Option[String] = Some("Python License 2.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object QHULL extends SPDX_LICENSE("Qhull") {
    def display: Option[String] = Some("Qhull License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object Q_PUBLIC_LICENSE_1_0 extends SPDX_LICENSE("QPL-1.0") {
    def display: Option[String] = Some("Q Public License 1.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object RDISC extends SPDX_LICENSE("Rdisc") {
    def display: Option[String] = Some("Rdisc License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object REALNETWORKS_PUBLIC_SOURCE_LICENSE_V1_0 extends SPDX_LICENSE("RPSL-1.0") {
    def display: Option[String] = Some("RealNetworks Public Source License v1.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object RECIPROCAL_PUBLIC_LICENSE_1_1 extends SPDX_LICENSE("RPL-1.1") {
    def display: Option[String] = Some("Reciprocal Public License 1.1")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object RECIPROCAL_PUBLIC_LICENSE_1_5 extends SPDX_LICENSE("RPL-1.5") {
    def display: Option[String] = Some("Reciprocal Public License 1.5")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object RED_HAT_ECOS_PUBLIC_LICENSE_V1_1 extends SPDX_LICENSE("RHeCos-1.1") {
    def display: Option[String] = Some("Red Hat eCos Public License v1.1")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object RSA_MESSAGE_DIGEST_LICENSE extends SPDX_LICENSE("RSA-MD") {
    def display: Option[String] = Some("RSA Message-Digest License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object RSCPL extends SPDX_LICENSE("RSCPL") {
    def display: Option[String] = Some("Ricoh Source Code Public License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object RUBY extends SPDX_LICENSE("Ruby") {
    def display: Option[String] = Some("Ruby License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object SAXPATH extends SPDX_LICENSE("Saxpath") {
    def display: Option[String] = Some("Saxpath License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object SAX_PUBLIC_DOMAIN_NOTICE extends SPDX_LICENSE("SAX-PD") {
    def display: Option[String] = Some("Sax Public Domain Notice")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object SCEA extends SPDX_LICENSE("SCEA") {
    def display: Option[String] = Some("SCEA Shared Source License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object SENDMAIL extends SPDX_LICENSE("Sendmail") {
    def display: Option[String] = Some("Sendmail License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object SGI_FREE_SOFTWARE_LICENSE_B_V1_0 extends SPDX_LICENSE("SGI-B-1.0") {
    def display: Option[String] = Some("SGI Free Software License B v1.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object SGI_FREE_SOFTWARE_LICENSE_B_V1_1 extends SPDX_LICENSE("SGI-B-1.1") {
    def display: Option[String] = Some("SGI Free Software License B v1.1")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object SGI_FREE_SOFTWARE_LICENSE_B_V2_0 extends SPDX_LICENSE("SGI-B-2.0") {
    def display: Option[String] = Some("SGI Free Software License B v2.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object SIL_OPEN_FONT_LICENSE_1_0 extends SPDX_LICENSE("OFL-1.0") {
    def display: Option[String] = Some("SIL Open Font License 1.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object SIL_OPEN_FONT_LICENSE_1_1 extends SPDX_LICENSE("OFL-1.1") {
    def display: Option[String] = Some("SIL Open Font License 1.1")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object SIMPLE_PUBLIC_LICENSE_2_0 extends SPDX_LICENSE("SimPL-2.0") {
    def display: Option[String] = Some("Simple Public License 2.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object SISSL extends SPDX_LICENSE("SISSL") {
    def display: Option[String] = Some("Sun Industry Standards Source License v1.1")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object SLEEPYCAT extends SPDX_LICENSE("Sleepycat") {
    def display: Option[String] = Some("Sleepycat License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object SMLNJ extends SPDX_LICENSE("SMLNJ") {
    def display: Option[String] = Some("Standard ML of New Jersey License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object SMPPL extends SPDX_LICENSE("SMPPL") {
    def display: Option[String] = Some("Secure Messaging Protocol Public License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object SNIA extends SPDX_LICENSE("SNIA") {
    def display: Option[String] = Some("SNIA Public License 1.1")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object SPENCER_LICENSE_86 extends SPDX_LICENSE("Spencer-86") {
    def display: Option[String] = Some("Spencer License 86")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object SPENCER_LICENSE_94 extends SPDX_LICENSE("Spencer-94") {
    def display: Option[String] = Some("Spencer License 94")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object SPENCER_LICENSE_99 extends SPDX_LICENSE("Spencer-99") {
    def display: Option[String] = Some("Spencer License 99")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object SUGARCRM_PUBLIC_LICENSE_V1_1_3 extends SPDX_LICENSE("SugarCRM-1.1.3") {
    def display: Option[String] = Some("SugarCRM Public License v1.1.3")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object SUN_INDUSTRY_STANDARDS_SOURCE_LICENSE_V1_2 extends SPDX_LICENSE("SISSL-1.2") {
    def display: Option[String] = Some("Sun Industry Standards Source License v1.2")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object SUN_PUBLIC_LICENSE_V1_0 extends SPDX_LICENSE("SPL-1.0") {
    def display: Option[String] = Some("Sun Public License v1.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object SWL extends SPDX_LICENSE("SWL") {
    def display: Option[String] = Some("Scheme Widget Library (SWL) Software License Agreement")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object SYBASE_OPEN_WATCOM_PUBLIC_LICENSE_1_0 extends SPDX_LICENSE("Watcom-1.0") {
    def display: Option[String] = Some("Sybase Open Watcom Public License 1.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object TCL extends SPDX_LICENSE("TCL") {
    def display: Option[String] = Some("TCL/TK License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object TCP_WRAPPERS_LICENSE extends SPDX_LICENSE("TCP-wrappers") {
    def display: Option[String] = Some("TCP Wrappers License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object TMATE extends SPDX_LICENSE("TMate") {
    def display: Option[String] = Some("TMate Open Source License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object TORQUE_11 extends SPDX_LICENSE("TORQUE-1.1") {
    def display: Option[String] = Some("TORQUE v2.5+ Software License v1.1")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object TOSL extends SPDX_LICENSE("TOSL") {
    def display: Option[String] = Some("Trusster Open Source License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object UNICODE_DFS_2015 extends SPDX_LICENSE("Unicode-DFS-2015") {
    def display: Option[String] = Some("Unicode License Agreement - Data Files and Software (2015)")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object UNICODE_DFS_2016 extends SPDX_LICENSE("Unicode-DFS-2016") {
    def display: Option[String] = Some("Unicode License Agreement - Data Files and Software (2016)")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object UNICODE_TERMS_OF_USE extends SPDX_LICENSE("Unicode-TOU") {
    def display: Option[String] = Some("Unicode Terms of Use")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object UNIVERSAL_PERMISSIVE_LICENSE_V1_0 extends SPDX_LICENSE("UPL-1.0") {
    def display: Option[String] = Some("Universal Permissive License v1.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object UNLICENSE extends SPDX_LICENSE("Unlicense") {
    def display: Option[String] = Some("The Unlicense")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object VIM extends SPDX_LICENSE("Vim") {
    def display: Option[String] = Some("Vim License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object VOSTROM extends SPDX_LICENSE("VOSTROM") {
    def display: Option[String] = Some("VOSTROM Public License for Open Source")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object VOVIDA_SOFTWARE_LICENSE_V1_0 extends SPDX_LICENSE("VSL-1.0") {
    def display: Option[String] = Some("Vovida Software License v1.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object W3C extends SPDX_LICENSE("W3C") {
    def display: Option[String] = Some("W3C Software Notice and License (2002-12-31)")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object W3C_19980720 extends SPDX_LICENSE("W3C-19980720") {
    def display: Option[String] = Some("W3C Software Notice and License (1998-07-20)")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object W3C_20150513 extends SPDX_LICENSE("W3C-20150513") {
    def display: Option[String] = Some("W3C Software Notice and Document License (2015-05-13)")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object WSUIPA extends SPDX_LICENSE("Wsuipa") {
    def display: Option[String] = Some("Wsuipa License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object WTFPL extends SPDX_LICENSE("WTFPL") {
    def display: Option[String] = Some("Do What The F*ck You Want To Public License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object X11 extends SPDX_LICENSE("X11") {
    def display: Option[String] = Some("X11 License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object XEROX extends SPDX_LICENSE("Xerox") {
    def display: Option[String] = Some("Xerox License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object XFREE86_LICENSE_1_1 extends SPDX_LICENSE("XFree86-1.1") {
    def display: Option[String] = Some("XFree86 License 1.1")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object XINETD extends SPDX_LICENSE("xinetd") {
    def display: Option[String] = Some("xinetd License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object XNET extends SPDX_LICENSE("Xnet") {
    def display: Option[String] = Some("X.Net License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object XPP extends SPDX_LICENSE("xpp") {
    def display: Option[String] = Some("XPP License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object XSKAT extends SPDX_LICENSE("XSkat") {
    def display: Option[String] = Some("XSkat License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object YPL_10 extends SPDX_LICENSE("YPL-1.0") {
    def display: Option[String] = Some("Yahoo! Public License v1.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object YPL_11 extends SPDX_LICENSE("YPL-1.1") {
    def display: Option[String] = Some("Yahoo! Public License v1.1")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object ZED extends SPDX_LICENSE("Zed") {
    def display: Option[String] = Some("Zed License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object ZEND_LICENSE_V2_0 extends SPDX_LICENSE("Zend-2.0") {
    def display: Option[String] = Some("Zend License v2.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object ZIMBRA_PUBLIC_LICENSE_V1_3 extends SPDX_LICENSE("Zimbra-1.3") {
    def display: Option[String] = Some("Zimbra Public License v1.3")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object ZIMBRA_PUBLIC_LICENSE_V1_4 extends SPDX_LICENSE("Zimbra-1.4") {
    def display: Option[String] = Some("Zimbra Public License v1.4")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object ZLIB extends SPDX_LICENSE("Zlib") {
    def display: Option[String] = Some("zlib License")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object ZLIB_ACKNOWLEDGEMENT extends SPDX_LICENSE("zlib-acknowledgement") {
    def display: Option[String] = Some("zlib/libpng License with Acknowledgement")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object ZOPE_PUBLIC_LICENSE_1_1 extends SPDX_LICENSE("ZPL-1.1") {
    def display: Option[String] = Some("Zope Public License 1.1")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object ZOPE_PUBLIC_LICENSE_2_0 extends SPDX_LICENSE("ZPL-2.0") {
    def display: Option[String] = Some("Zope Public License 2.0")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
  case object ZOPE_PUBLIC_LICENSE_2_1 extends SPDX_LICENSE("ZPL-2.1") {
    def display: Option[String] = Some("Zope Public License 2.1")
    def system: Option[String]  = Some("http://hl7.org/fhir/spdx-license")
  }
}

sealed abstract class SPECIMEN_CONTAINED_PREFERENCE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object SPECIMEN_CONTAINED_PREFERENCE
    extends FhirEnum[SPECIMEN_CONTAINED_PREFERENCE]
    with FhirCirceEnum[SPECIMEN_CONTAINED_PREFERENCE] {
  val reference = "http://hl7.org/fhir/ValueSet/specimen-contained-preference"
  val values    = findValues
  case object ALTERNATE extends SPECIMEN_CONTAINED_PREFERENCE("alternate") {
    def display: Option[String] = Some("Alternate")
    def system: Option[String]  = Some("http://hl7.org/fhir/specimen-contained-preference")
  }
  case object PREFERRED extends SPECIMEN_CONTAINED_PREFERENCE("preferred") {
    def display: Option[String] = Some("Preferred")
    def system: Option[String]  = Some("http://hl7.org/fhir/specimen-contained-preference")
  }
}

sealed abstract class SPECIMEN_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object SPECIMEN_STATUS extends FhirEnum[SPECIMEN_STATUS] with FhirCirceEnum[SPECIMEN_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/specimen-status"
  val values    = findValues
  case object AVAILABLE extends SPECIMEN_STATUS("available") {
    def display: Option[String] = Some("Available")
    def system: Option[String]  = Some("http://hl7.org/fhir/specimen-status")
  }
  case object ENTERED_IN_ERROR extends SPECIMEN_STATUS("entered-in-error") {
    def display: Option[String] = Some("Entered in Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/specimen-status")
  }
  case object UNAVAILABLE extends SPECIMEN_STATUS("unavailable") {
    def display: Option[String] = Some("Unavailable")
    def system: Option[String]  = Some("http://hl7.org/fhir/specimen-status")
  }
  case object UNSATISFACTORY extends SPECIMEN_STATUS("unsatisfactory") {
    def display: Option[String] = Some("Unsatisfactory")
    def system: Option[String]  = Some("http://hl7.org/fhir/specimen-status")
  }
}

sealed abstract class STRAND_TYPE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object STRAND_TYPE extends FhirEnum[STRAND_TYPE] with FhirCirceEnum[STRAND_TYPE] {
  val reference = "http://hl7.org/fhir/ValueSet/strand-type"
  val values    = findValues
  case object CRICK extends STRAND_TYPE("crick") {
    def display: Option[String] = Some("Crick strand of referenceSeq")
    def system: Option[String]  = Some("http://hl7.org/fhir/strand-type")
  }
  case object WATSON extends STRAND_TYPE("watson") {
    def display: Option[String] = Some("Watson strand of referenceSeq")
    def system: Option[String]  = Some("http://hl7.org/fhir/strand-type")
  }
}

sealed abstract class STRUCTURE_DEFINITION_KIND(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object STRUCTURE_DEFINITION_KIND
    extends FhirEnum[STRUCTURE_DEFINITION_KIND]
    with FhirCirceEnum[STRUCTURE_DEFINITION_KIND] {
  val reference = "http://hl7.org/fhir/ValueSet/structure-definition-kind"
  val values    = findValues
  case object COMPLEX_DATA_TYPE extends STRUCTURE_DEFINITION_KIND("complex-type") {
    def display: Option[String] = Some("Complex Data Type")
    def system: Option[String]  = Some("http://hl7.org/fhir/structure-definition-kind")
  }
  case object LOGICAL extends STRUCTURE_DEFINITION_KIND("logical") {
    def display: Option[String] = Some("Logical")
    def system: Option[String]  = Some("http://hl7.org/fhir/structure-definition-kind")
  }
  case object PRIMITIVE_DATA_TYPE extends STRUCTURE_DEFINITION_KIND("primitive-type") {
    def display: Option[String] = Some("Primitive Data Type")
    def system: Option[String]  = Some("http://hl7.org/fhir/structure-definition-kind")
  }
  case object RESOURCE extends STRUCTURE_DEFINITION_KIND("resource") {
    def display: Option[String] = Some("Resource")
    def system: Option[String]  = Some("http://hl7.org/fhir/structure-definition-kind")
  }
}

sealed abstract class SUBSCRIPTION_CHANNEL_TYPE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object SUBSCRIPTION_CHANNEL_TYPE
    extends FhirEnum[SUBSCRIPTION_CHANNEL_TYPE]
    with FhirCirceEnum[SUBSCRIPTION_CHANNEL_TYPE] {
  val reference = "http://hl7.org/fhir/ValueSet/subscription-channel-type"
  val values    = findValues
  case object EMAIL extends SUBSCRIPTION_CHANNEL_TYPE("email") {
    def display: Option[String] = Some("Email")
    def system: Option[String]  = Some("http://hl7.org/fhir/subscription-channel-type")
  }
  case object MESSAGE extends SUBSCRIPTION_CHANNEL_TYPE("message") {
    def display: Option[String] = Some("Message")
    def system: Option[String]  = Some("http://hl7.org/fhir/subscription-channel-type")
  }
  case object REST_HOOK extends SUBSCRIPTION_CHANNEL_TYPE("rest-hook") {
    def display: Option[String] = Some("Rest Hook")
    def system: Option[String]  = Some("http://hl7.org/fhir/subscription-channel-type")
  }
  case object SMS extends SUBSCRIPTION_CHANNEL_TYPE("sms") {
    def display: Option[String] = Some("SMS")
    def system: Option[String]  = Some("http://hl7.org/fhir/subscription-channel-type")
  }
  case object WEBSOCKET extends SUBSCRIPTION_CHANNEL_TYPE("websocket") {
    def display: Option[String] = Some("Websocket")
    def system: Option[String]  = Some("http://hl7.org/fhir/subscription-channel-type")
  }
}

sealed abstract class SUBSCRIPTION_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object SUBSCRIPTION_STATUS extends FhirEnum[SUBSCRIPTION_STATUS] with FhirCirceEnum[SUBSCRIPTION_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/subscription-status"
  val values    = findValues
  case object ACTIVE extends SUBSCRIPTION_STATUS("active") {
    def display: Option[String] = Some("Active")
    def system: Option[String]  = Some("http://hl7.org/fhir/subscription-status")
  }
  case object ERROR extends SUBSCRIPTION_STATUS("error") {
    def display: Option[String] = Some("Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/subscription-status")
  }
  case object OFF extends SUBSCRIPTION_STATUS("off") {
    def display: Option[String] = Some("Off")
    def system: Option[String]  = Some("http://hl7.org/fhir/subscription-status")
  }
  case object REQUESTED extends SUBSCRIPTION_STATUS("requested") {
    def display: Option[String] = Some("Requested")
    def system: Option[String]  = Some("http://hl7.org/fhir/subscription-status")
  }
}

sealed abstract class SUBSTANCE_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object SUBSTANCE_STATUS extends FhirEnum[SUBSTANCE_STATUS] with FhirCirceEnum[SUBSTANCE_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/substance-status"
  val values    = findValues
  case object ACTIVE extends SUBSTANCE_STATUS("active") {
    def display: Option[String] = Some("Active")
    def system: Option[String]  = Some("http://hl7.org/fhir/substance-status")
  }
  case object ENTERED_IN_ERROR extends SUBSTANCE_STATUS("entered-in-error") {
    def display: Option[String] = Some("Entered in Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/substance-status")
  }
  case object INACTIVE extends SUBSTANCE_STATUS("inactive") {
    def display: Option[String] = Some("Inactive")
    def system: Option[String]  = Some("http://hl7.org/fhir/substance-status")
  }
}

sealed abstract class SUPPLYDELIVERY_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object SUPPLYDELIVERY_STATUS extends FhirEnum[SUPPLYDELIVERY_STATUS] with FhirCirceEnum[SUPPLYDELIVERY_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/supplydelivery-status"
  val values    = findValues
  case object ABANDONED extends SUPPLYDELIVERY_STATUS("abandoned") {
    def display: Option[String] = Some("Abandoned")
    def system: Option[String]  = Some("http://hl7.org/fhir/supplydelivery-status")
  }
  case object COMPLETED extends SUPPLYDELIVERY_STATUS("completed") {
    def display: Option[String] = Some("Delivered")
    def system: Option[String]  = Some("http://hl7.org/fhir/supplydelivery-status")
  }
  case object ENTERED_IN_ERROR extends SUPPLYDELIVERY_STATUS("entered-in-error") {
    def display: Option[String] = Some("Entered In Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/supplydelivery-status")
  }
  case object IN_PROGRESS extends SUPPLYDELIVERY_STATUS("in-progress") {
    def display: Option[String] = Some("In Progress")
    def system: Option[String]  = Some("http://hl7.org/fhir/supplydelivery-status")
  }
}

sealed abstract class SUPPLYREQUEST_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object SUPPLYREQUEST_STATUS extends FhirEnum[SUPPLYREQUEST_STATUS] with FhirCirceEnum[SUPPLYREQUEST_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/supplyrequest-status"
  val values    = findValues
  case object ACTIVE extends SUPPLYREQUEST_STATUS("active") {
    def display: Option[String] = Some("Active")
    def system: Option[String]  = Some("http://hl7.org/fhir/supplyrequest-status")
  }
  case object CANCELLED extends SUPPLYREQUEST_STATUS("cancelled") {
    def display: Option[String] = Some("Cancelled")
    def system: Option[String]  = Some("http://hl7.org/fhir/supplyrequest-status")
  }
  case object COMPLETED extends SUPPLYREQUEST_STATUS("completed") {
    def display: Option[String] = Some("Completed")
    def system: Option[String]  = Some("http://hl7.org/fhir/supplyrequest-status")
  }
  case object DRAFT extends SUPPLYREQUEST_STATUS("draft") {
    def display: Option[String] = Some("Draft")
    def system: Option[String]  = Some("http://hl7.org/fhir/supplyrequest-status")
  }
  case object ENTERED_IN_ERROR extends SUPPLYREQUEST_STATUS("entered-in-error") {
    def display: Option[String] = Some("Entered in Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/supplyrequest-status")
  }
  case object SUSPENDED extends SUPPLYREQUEST_STATUS("suspended") {
    def display: Option[String] = Some("Suspended")
    def system: Option[String]  = Some("http://hl7.org/fhir/supplyrequest-status")
  }
  case object UNKNOWN extends SUPPLYREQUEST_STATUS("unknown") {
    def display: Option[String] = Some("Unknown")
    def system: Option[String]  = Some("http://hl7.org/fhir/supplyrequest-status")
  }
}

sealed abstract class SYSTEM_RESTFUL_INTERACTION(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object SYSTEM_RESTFUL_INTERACTION
    extends FhirEnum[SYSTEM_RESTFUL_INTERACTION]
    with FhirCirceEnum[SYSTEM_RESTFUL_INTERACTION] {
  val reference = "http://hl7.org/fhir/ValueSet/system-restful-interaction"
  val values    = findValues
  case object BATCH extends SYSTEM_RESTFUL_INTERACTION("batch") {
    def display: Option[String] = Some("batch")
    def system: Option[String]  = Some("http://hl7.org/fhir/restful-interaction")
  }
  case object HISTORY_SYSTEM extends SYSTEM_RESTFUL_INTERACTION("history-system") {
    def display: Option[String] = Some("history-system")
    def system: Option[String]  = Some("http://hl7.org/fhir/restful-interaction")
  }
  case object SEARCH_SYSTEM extends SYSTEM_RESTFUL_INTERACTION("search-system") {
    def display: Option[String] = Some("search-system")
    def system: Option[String]  = Some("http://hl7.org/fhir/restful-interaction")
  }
  case object TRANSACTION extends SYSTEM_RESTFUL_INTERACTION("transaction") {
    def display: Option[String] = Some("transaction")
    def system: Option[String]  = Some("http://hl7.org/fhir/restful-interaction")
  }
}

sealed abstract class TASK_INTENT(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object TASK_INTENT extends FhirEnum[TASK_INTENT] with FhirCirceEnum[TASK_INTENT] {
  val reference = "http://hl7.org/fhir/ValueSet/task-intent"
  val values    = findValues
  case object FILLER_ORDER extends TASK_INTENT("filler-order") {
    def display: Option[String] = Some("filler-order")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-intent")
  }
  case object INSTANCE_ORDER extends TASK_INTENT("instance-order") {
    def display: Option[String] = Some("instance-order")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-intent")
  }
  case object OPTION extends TASK_INTENT("option") {
    def display: Option[String] = Some("option")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-intent")
  }
  case object ORDER extends TASK_INTENT("order") {
    def display: Option[String] = Some("order")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-intent")
  }
  case object ORIGINAL_ORDER extends TASK_INTENT("original-order") {
    def display: Option[String] = Some("original-order")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-intent")
  }
  case object PLAN extends TASK_INTENT("plan") {
    def display: Option[String] = Some("plan")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-intent")
  }
  case object PROPOSAL extends TASK_INTENT("proposal") {
    def display: Option[String] = Some("proposal")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-intent")
  }
  case object REFLEX_ORDER extends TASK_INTENT("reflex-order") {
    def display: Option[String] = Some("reflex-order")
    def system: Option[String]  = Some("http://hl7.org/fhir/request-intent")
  }
  case object UNKNOWN extends TASK_INTENT("unknown") {
    def display: Option[String] = Some("Unknown")
    def system: Option[String]  = Some("http://hl7.org/fhir/task-intent")
  }
}

sealed abstract class TASK_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object TASK_STATUS extends FhirEnum[TASK_STATUS] with FhirCirceEnum[TASK_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/task-status"
  val values    = findValues
  case object ACCEPTED extends TASK_STATUS("accepted") {
    def display: Option[String] = Some("Accepted")
    def system: Option[String]  = Some("http://hl7.org/fhir/task-status")
  }
  case object CANCELLED extends TASK_STATUS("cancelled") {
    def display: Option[String] = Some("Cancelled")
    def system: Option[String]  = Some("http://hl7.org/fhir/task-status")
  }
  case object COMPLETED extends TASK_STATUS("completed") {
    def display: Option[String] = Some("Completed")
    def system: Option[String]  = Some("http://hl7.org/fhir/task-status")
  }
  case object DRAFT extends TASK_STATUS("draft") {
    def display: Option[String] = Some("Draft")
    def system: Option[String]  = Some("http://hl7.org/fhir/task-status")
  }
  case object ENTERED_IN_ERROR extends TASK_STATUS("entered-in-error") {
    def display: Option[String] = Some("Entered in Error")
    def system: Option[String]  = Some("http://hl7.org/fhir/task-status")
  }
  case object FAILED extends TASK_STATUS("failed") {
    def display: Option[String] = Some("Failed")
    def system: Option[String]  = Some("http://hl7.org/fhir/task-status")
  }
  case object IN_PROGRESS extends TASK_STATUS("in-progress") {
    def display: Option[String] = Some("In Progress")
    def system: Option[String]  = Some("http://hl7.org/fhir/task-status")
  }
  case object ON_HOLD extends TASK_STATUS("on-hold") {
    def display: Option[String] = Some("On Hold")
    def system: Option[String]  = Some("http://hl7.org/fhir/task-status")
  }
  case object READY extends TASK_STATUS("ready") {
    def display: Option[String] = Some("Ready")
    def system: Option[String]  = Some("http://hl7.org/fhir/task-status")
  }
  case object RECEIVED extends TASK_STATUS("received") {
    def display: Option[String] = Some("Received")
    def system: Option[String]  = Some("http://hl7.org/fhir/task-status")
  }
  case object REJECTED extends TASK_STATUS("rejected") {
    def display: Option[String] = Some("Rejected")
    def system: Option[String]  = Some("http://hl7.org/fhir/task-status")
  }
  case object REQUESTED extends TASK_STATUS("requested") {
    def display: Option[String] = Some("Requested")
    def system: Option[String]  = Some("http://hl7.org/fhir/task-status")
  }
}

sealed abstract class TYPE_DERIVATION_RULE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object TYPE_DERIVATION_RULE extends FhirEnum[TYPE_DERIVATION_RULE] with FhirCirceEnum[TYPE_DERIVATION_RULE] {
  val reference = "http://hl7.org/fhir/ValueSet/type-derivation-rule"
  val values    = findValues
  case object CONSTRAINT extends TYPE_DERIVATION_RULE("constraint") {
    def display: Option[String] = Some("Constraint")
    def system: Option[String]  = Some("http://hl7.org/fhir/type-derivation-rule")
  }
  case object SPECIALIZATION extends TYPE_DERIVATION_RULE("specialization") {
    def display: Option[String] = Some("Specialization")
    def system: Option[String]  = Some("http://hl7.org/fhir/type-derivation-rule")
  }
}

sealed abstract class TYPE_RESTFUL_INTERACTION(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object TYPE_RESTFUL_INTERACTION
    extends FhirEnum[TYPE_RESTFUL_INTERACTION]
    with FhirCirceEnum[TYPE_RESTFUL_INTERACTION] {
  val reference = "http://hl7.org/fhir/ValueSet/type-restful-interaction"
  val values    = findValues
  case object CREATE extends TYPE_RESTFUL_INTERACTION("create") {
    def display: Option[String] = Some("create")
    def system: Option[String]  = Some("http://hl7.org/fhir/restful-interaction")
  }
  case object DELETE extends TYPE_RESTFUL_INTERACTION("delete") {
    def display: Option[String] = Some("delete")
    def system: Option[String]  = Some("http://hl7.org/fhir/restful-interaction")
  }
  case object HISTORY_INSTANCE extends TYPE_RESTFUL_INTERACTION("history-instance") {
    def display: Option[String] = Some("history-instance")
    def system: Option[String]  = Some("http://hl7.org/fhir/restful-interaction")
  }
  case object HISTORY_TYPE extends TYPE_RESTFUL_INTERACTION("history-type") {
    def display: Option[String] = Some("history-type")
    def system: Option[String]  = Some("http://hl7.org/fhir/restful-interaction")
  }
  case object PATCH extends TYPE_RESTFUL_INTERACTION("patch") {
    def display: Option[String] = Some("patch")
    def system: Option[String]  = Some("http://hl7.org/fhir/restful-interaction")
  }
  case object READ extends TYPE_RESTFUL_INTERACTION("read") {
    def display: Option[String] = Some("read")
    def system: Option[String]  = Some("http://hl7.org/fhir/restful-interaction")
  }
  case object SEARCH_TYPE extends TYPE_RESTFUL_INTERACTION("search-type") {
    def display: Option[String] = Some("search-type")
    def system: Option[String]  = Some("http://hl7.org/fhir/restful-interaction")
  }
  case object UPDATE extends TYPE_RESTFUL_INTERACTION("update") {
    def display: Option[String] = Some("update")
    def system: Option[String]  = Some("http://hl7.org/fhir/restful-interaction")
  }
  case object VREAD extends TYPE_RESTFUL_INTERACTION("vread") {
    def display: Option[String] = Some("vread")
    def system: Option[String]  = Some("http://hl7.org/fhir/restful-interaction")
  }
}

sealed abstract class UDI_ENTRY_TYPE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object UDI_ENTRY_TYPE extends FhirEnum[UDI_ENTRY_TYPE] with FhirCirceEnum[UDI_ENTRY_TYPE] {
  val reference = "http://hl7.org/fhir/ValueSet/udi-entry-type"
  val values    = findValues
  case object BARCODE extends UDI_ENTRY_TYPE("barcode") {
    def display: Option[String] = Some("Barcode")
    def system: Option[String]  = Some("http://hl7.org/fhir/udi-entry-type")
  }
  case object CARD extends UDI_ENTRY_TYPE("card") {
    def display: Option[String] = Some("Card")
    def system: Option[String]  = Some("http://hl7.org/fhir/udi-entry-type")
  }
  case object MANUAL extends UDI_ENTRY_TYPE("manual") {
    def display: Option[String] = Some("Manual")
    def system: Option[String]  = Some("http://hl7.org/fhir/udi-entry-type")
  }
  case object RFID extends UDI_ENTRY_TYPE("rfid") {
    def display: Option[String] = Some("RFID")
    def system: Option[String]  = Some("http://hl7.org/fhir/udi-entry-type")
  }
  case object SELF_REPORTED extends UDI_ENTRY_TYPE("self-reported") {
    def display: Option[String] = Some("Self Reported")
    def system: Option[String]  = Some("http://hl7.org/fhir/udi-entry-type")
  }
  case object UNKNOWN extends UDI_ENTRY_TYPE("unknown") {
    def display: Option[String] = Some("Unknown")
    def system: Option[String]  = Some("http://hl7.org/fhir/udi-entry-type")
  }
}

sealed abstract class V3_CONFIDENTIALITYCLASSIFICATION(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object V3_CONFIDENTIALITYCLASSIFICATION
    extends FhirEnum[V3_CONFIDENTIALITYCLASSIFICATION]
    with FhirCirceEnum[V3_CONFIDENTIALITYCLASSIFICATION] {
  val reference = "http://terminology.hl7.org/ValueSet/v3-ConfidentialityClassification"
  val values    = findValues
  case object L extends V3_CONFIDENTIALITYCLASSIFICATION("L") {
    def display: Option[String] = Some("L")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-Confidentiality")
  }
  case object M extends V3_CONFIDENTIALITYCLASSIFICATION("M") {
    def display: Option[String] = Some("M")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-Confidentiality")
  }
  case object N extends V3_CONFIDENTIALITYCLASSIFICATION("N") {
    def display: Option[String] = Some("N")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-Confidentiality")
  }
  case object R extends V3_CONFIDENTIALITYCLASSIFICATION("R") {
    def display: Option[String] = Some("R")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-Confidentiality")
  }
  case object U extends V3_CONFIDENTIALITYCLASSIFICATION("U") {
    def display: Option[String] = Some("U")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-Confidentiality")
  }
  case object V extends V3_CONFIDENTIALITYCLASSIFICATION("V") {
    def display: Option[String] = Some("V")
    def system: Option[String]  = Some("http://terminology.hl7.org/CodeSystem/v3-Confidentiality")
  }
}

sealed abstract class VARIABLE_TYPE(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object VARIABLE_TYPE extends FhirEnum[VARIABLE_TYPE] with FhirCirceEnum[VARIABLE_TYPE] {
  val reference = "http://hl7.org/fhir/ValueSet/variable-type"
  val values    = findValues
  case object CONTINUOUS extends VARIABLE_TYPE("continuous") {
    def display: Option[String] = Some("Continuous")
    def system: Option[String]  = Some("http://hl7.org/fhir/variable-type")
  }
  case object DESCRIPTIVE extends VARIABLE_TYPE("descriptive") {
    def display: Option[String] = Some("Descriptive")
    def system: Option[String]  = Some("http://hl7.org/fhir/variable-type")
  }
  case object DICHOTOMOUS extends VARIABLE_TYPE("dichotomous") {
    def display: Option[String] = Some("Dichotomous")
    def system: Option[String]  = Some("http://hl7.org/fhir/variable-type")
  }
}

sealed abstract class VERIFICATIONRESULT_STATUS(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object VERIFICATIONRESULT_STATUS
    extends FhirEnum[VERIFICATIONRESULT_STATUS]
    with FhirCirceEnum[VERIFICATIONRESULT_STATUS] {
  val reference = "http://hl7.org/fhir/ValueSet/verificationresult-status"
  val values    = findValues
  case object ATTESTED extends VERIFICATIONRESULT_STATUS("attested") {
    def display: Option[String] = Some("Attested")
    def system: Option[String]  = Some("http://hl7.org/fhir/CodeSystem/status")
  }
  case object IN_PROCESS extends VERIFICATIONRESULT_STATUS("in-process") {
    def display: Option[String] = Some("In process")
    def system: Option[String]  = Some("http://hl7.org/fhir/CodeSystem/status")
  }
  case object REQUIRES_REVALIDATION extends VERIFICATIONRESULT_STATUS("req-revalid") {
    def display: Option[String] = Some("Requires revalidation")
    def system: Option[String]  = Some("http://hl7.org/fhir/CodeSystem/status")
  }
  case object RE_VALIDATION_FAILED extends VERIFICATIONRESULT_STATUS("reval-fail") {
    def display: Option[String] = Some("Re-Validation failed")
    def system: Option[String]  = Some("http://hl7.org/fhir/CodeSystem/status")
  }
  case object VALIDATED extends VERIFICATIONRESULT_STATUS("validated") {
    def display: Option[String] = Some("Validated")
    def system: Option[String]  = Some("http://hl7.org/fhir/CodeSystem/status")
  }
  case object VALIDATION_FAILED extends VERIFICATIONRESULT_STATUS("val-fail") {
    def display: Option[String] = Some("Validation failed")
    def system: Option[String]  = Some("http://hl7.org/fhir/CodeSystem/status")
  }
}

sealed abstract class VERSIONING_POLICY(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object VERSIONING_POLICY extends FhirEnum[VERSIONING_POLICY] with FhirCirceEnum[VERSIONING_POLICY] {
  val reference = "http://hl7.org/fhir/ValueSet/versioning-policy"
  val values    = findValues
  case object NO_VERSIONID_SUPPORT extends VERSIONING_POLICY("no-version") {
    def display: Option[String] = Some("No VersionId Support")
    def system: Option[String]  = Some("http://hl7.org/fhir/versioning-policy")
  }
  case object VERSIONED extends VERSIONING_POLICY("versioned") {
    def display: Option[String] = Some("Versioned")
    def system: Option[String]  = Some("http://hl7.org/fhir/versioning-policy")
  }
  case object VERSIONID_TRACKED_FULLY extends VERSIONING_POLICY("versioned-update") {
    def display: Option[String] = Some("VersionId tracked fully")
    def system: Option[String]  = Some("http://hl7.org/fhir/versioning-policy")
  }
}

sealed abstract class VISION_BASE_CODES(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object VISION_BASE_CODES extends FhirEnum[VISION_BASE_CODES] with FhirCirceEnum[VISION_BASE_CODES] {
  val reference = "http://hl7.org/fhir/ValueSet/vision-base-codes"
  val values    = findValues
  case object DOWN extends VISION_BASE_CODES("down") {
    def display: Option[String] = Some("Down")
    def system: Option[String]  = Some("http://hl7.org/fhir/vision-base-codes")
  }
  case object IN extends VISION_BASE_CODES("in") {
    def display: Option[String] = Some("In")
    def system: Option[String]  = Some("http://hl7.org/fhir/vision-base-codes")
  }
  case object OUT extends VISION_BASE_CODES("out") {
    def display: Option[String] = Some("Out")
    def system: Option[String]  = Some("http://hl7.org/fhir/vision-base-codes")
  }
  case object UP extends VISION_BASE_CODES("up") {
    def display: Option[String] = Some("Up")
    def system: Option[String]  = Some("http://hl7.org/fhir/vision-base-codes")
  }
}

sealed abstract class VISION_EYE_CODES(override val entryName: String)
    extends EnumeratumBase
    with Product
    with java.io.Serializable {
  def display: Option[String]
  def system: Option[String]
  def toCoding: Option[Coding] = system.map(s => Coding(system = Some(s), code = Some(entryName), display = display))
}
object VISION_EYE_CODES extends FhirEnum[VISION_EYE_CODES] with FhirCirceEnum[VISION_EYE_CODES] {
  val reference = "http://hl7.org/fhir/ValueSet/vision-eye-codes"
  val values    = findValues
  case object LEFT extends VISION_EYE_CODES("left") {
    def display: Option[String] = Some("Left Eye")
    def system: Option[String]  = Some("http://hl7.org/fhir/vision-eye-codes")
  }
  case object RIGHT extends VISION_EYE_CODES("right") {
    def display: Option[String] = Some("Right Eye")
    def system: Option[String]  = Some("http://hl7.org/fhir/vision-eye-codes")
  }
}
