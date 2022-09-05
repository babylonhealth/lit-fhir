package com.babylonhealth.lit.ukcore.model

import java.time.{ LocalDate, LocalTime, ZonedDateTime }
import java.util.UUID

import scala.collection.immutable.TreeMap
import scala.util.{ Success, Try }

import io.circe.{ Decoder, HCursor }

import com.babylonhealth.lit.core._
import com.babylonhealth.lit.core.BaseFieldDecoders._
import com.babylonhealth.lit.core.UnionAliases._
import com.babylonhealth.lit.core.ChoiceImplicits._
import com.babylonhealth.lit.core.TagSummoners.lTagOf
import com.babylonhealth.lit.core.serdes.{ objectDecoder, objectEncoder }
import com.babylonhealth.lit.core.model._
import com.babylonhealth.lit.hl7.model._
import com.babylonhealth.lit.core.UnionAliases._
import com.babylonhealth.lit.hl7.UnionAliases._
import com.babylonhealth.lit.hl7.ENCOUNTER_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, ukcore }
import com.babylonhealth.lit.macros.POJOBoilerplate

object UKCore_Encounter extends CompanionFor[UKCore_Encounter] {
  implicit def summonObjectAndCompanionUKCore_Encounter51674212(
      o: UKCore_Encounter): ObjectAndCompanion[UKCore_Encounter, UKCore_Encounter.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Encounter
  override type ParentType   = Encounter
  override val baseType: CompanionFor[ResourceType] = Encounter
  override val parentType: CompanionFor[ParentType] = Encounter
  override val profileUrl: Option[String]           = Some("https://fhir.hl7.org.uk/StructureDefinition/UKCore-Encounter")
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-Encounter"))),
      text: Option[Narrative] = None,
      `class`: Coding,
      status: ENCOUNTER_STATUS,
      period: Option[Period] = None,
      length: Option[Duration] = None,
      language: Option[LANGUAGES] = None,
      priority: Option[CodeableConcept] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
      serviceType: Option[CodeableConcept] = None,
      implicitRules: Option[UriStr] = None,
      `type`: LitSeq[CodeableConcept] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      partOf: Option[Reference] = None,
      subject: Option[Reference] = None,
      basedOn: LitSeq[Reference] = LitSeq.empty,
      account: LitSeq[Reference] = LitSeq.empty,
      classHistory: LitSeq[Encounter.ClassHistory] = LitSeq.empty,
      statusHistory: LitSeq[Encounter.StatusHistory] = LitSeq.empty,
      appointment: LitSeq[Reference] = LitSeq.empty,
      episodeOfCare: LitSeq[Reference] = LitSeq.empty,
      reasonReference: LitSeq[Reference] = LitSeq.empty,
      serviceProvider: Option[Reference] = None,
      location: LitSeq[Encounter.Location] = LitSeq.empty,
      diagnosis: LitSeq[Encounter.Diagnosis] = LitSeq.empty,
      participant: LitSeq[Encounter.Participant] = LitSeq.empty,
      hospitalization: Option[Encounter.Hospitalization] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): UKCore_Encounter = new UKCore_Encounter(
    id,
    meta,
    text,
    `class`,
    status,
    period,
    length,
    language,
    priority,
    contained,
    extension,
    reasonCode,
    serviceType,
    implicitRules,
    `type`,
    modifierExtension,
    identifier,
    partOf,
    subject,
    basedOn,
    account,
    classHistory,
    statusHistory,
    appointment,
    episodeOfCare,
    reasonReference,
    serviceProvider,
    location,
    diagnosis,
    participant,
    hospitalization,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val `class`: FHIRComponentFieldMeta[Coding] =
    FHIRComponentFieldMeta("class", lTagOf[Coding], false, lTagOf[Coding])
  val status: FHIRComponentFieldMeta[ENCOUNTER_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[ENCOUNTER_STATUS], false, lTagOf[ENCOUNTER_STATUS])
  val period: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("period", lTagOf[Option[Period]], false, lTagOf[Period])
  val length: FHIRComponentFieldMeta[Option[Duration]] =
    FHIRComponentFieldMeta("length", lTagOf[Option[Duration]], false, lTagOf[Duration])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val priority: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("priority", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val reasonCode: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("reasonCode", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val serviceType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("serviceType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val `type`: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("type", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val partOf: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("partOf", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val subject: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("subject", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val basedOn: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("basedOn", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val account: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("account", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val classHistory: FHIRComponentFieldMeta[LitSeq[Encounter.ClassHistory]] =
    FHIRComponentFieldMeta("classHistory", lTagOf[LitSeq[Encounter.ClassHistory]], false, lTagOf[Encounter.ClassHistory])
  val statusHistory: FHIRComponentFieldMeta[LitSeq[Encounter.StatusHistory]] =
    FHIRComponentFieldMeta("statusHistory", lTagOf[LitSeq[Encounter.StatusHistory]], false, lTagOf[Encounter.StatusHistory])
  val appointment: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("appointment", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val episodeOfCare: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("episodeOfCare", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val reasonReference: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("reasonReference", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val serviceProvider: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("serviceProvider", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val location: FHIRComponentFieldMeta[LitSeq[Encounter.Location]] =
    FHIRComponentFieldMeta("location", lTagOf[LitSeq[Encounter.Location]], false, lTagOf[Encounter.Location])
  val diagnosis: FHIRComponentFieldMeta[LitSeq[Encounter.Diagnosis]] =
    FHIRComponentFieldMeta("diagnosis", lTagOf[LitSeq[Encounter.Diagnosis]], false, lTagOf[Encounter.Diagnosis])
  val participant: FHIRComponentFieldMeta[LitSeq[Encounter.Participant]] =
    FHIRComponentFieldMeta("participant", lTagOf[LitSeq[Encounter.Participant]], false, lTagOf[Encounter.Participant])
  val hospitalization: FHIRComponentFieldMeta[Option[Encounter.Hospitalization]] =
    FHIRComponentFieldMeta("hospitalization", lTagOf[Option[Encounter.Hospitalization]], false, lTagOf[Encounter.Hospitalization])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    `class`,
    status,
    period,
    length,
    language,
    priority,
    contained,
    extension,
    reasonCode,
    serviceType,
    implicitRules,
    `type`,
    modifierExtension,
    identifier,
    partOf,
    subject,
    basedOn,
    account,
    classHistory,
    statusHistory,
    appointment,
    episodeOfCare,
    reasonReference,
    serviceProvider,
    location,
    diagnosis,
    participant,
    hospitalization
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Meta]](meta, t.meta),
      FHIRComponentField[Option[Narrative]](text, t.text),
      FHIRComponentField[Coding](`class`, t.`class`),
      FHIRComponentField[ENCOUNTER_STATUS](status, t.status),
      FHIRComponentField[Option[Period]](period, t.period),
      FHIRComponentField[Option[Duration]](length, t.length),
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[Option[CodeableConcept]](priority, t.priority),
      FHIRComponentField[LitSeq[Resource]](contained, t.contained),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[CodeableConcept]](reasonCode, t.reasonCode),
      FHIRComponentField[Option[CodeableConcept]](serviceType, t.serviceType),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[LitSeq[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
      FHIRComponentField[Option[Reference]](partOf, t.partOf),
      FHIRComponentField[Option[Reference]](subject, t.subject),
      FHIRComponentField[LitSeq[Reference]](basedOn, t.basedOn),
      FHIRComponentField[LitSeq[Reference]](account, t.account),
      FHIRComponentField[LitSeq[Encounter.ClassHistory]](classHistory, t.classHistory),
      FHIRComponentField[LitSeq[Encounter.StatusHistory]](statusHistory, t.statusHistory),
      FHIRComponentField[LitSeq[Reference]](appointment, t.appointment),
      FHIRComponentField[LitSeq[Reference]](episodeOfCare, t.episodeOfCare),
      FHIRComponentField[LitSeq[Reference]](reasonReference, t.reasonReference),
      FHIRComponentField[Option[Reference]](serviceProvider, t.serviceProvider),
      FHIRComponentField[LitSeq[Encounter.Location]](location, t.location),
      FHIRComponentField[LitSeq[Encounter.Diagnosis]](diagnosis, t.diagnosis),
      FHIRComponentField[LitSeq[Encounter.Participant]](participant, t.participant),
      FHIRComponentField[Option[Encounter.Hospitalization]](hospitalization, t.hospitalization)
    ))
  override def fields(t: UKCore_Encounter): Seq[FHIRComponentField[_]]               = fieldsFromParent(t).get
  def extractId(t: UKCore_Encounter): Option[String]                                 = t.id
  def extractMeta(t: UKCore_Encounter): Option[Meta]                                 = t.meta
  def extractText(t: UKCore_Encounter): Option[Narrative]                            = t.text
  def extractClass(t: UKCore_Encounter): Coding                                      = t.`class`
  def extractStatus(t: UKCore_Encounter): ENCOUNTER_STATUS                           = t.status
  def extractPeriod(t: UKCore_Encounter): Option[Period]                             = t.period
  def extractLength(t: UKCore_Encounter): Option[Duration]                           = t.length
  def extractLanguage(t: UKCore_Encounter): Option[LANGUAGES]                        = t.language
  def extractPriority(t: UKCore_Encounter): Option[CodeableConcept]                  = t.priority
  def extractContained(t: UKCore_Encounter): LitSeq[Resource]                        = t.contained
  def extractExtension(t: UKCore_Encounter): LitSeq[Extension]                       = t.extension
  def extractReasonCode(t: UKCore_Encounter): LitSeq[CodeableConcept]                = t.reasonCode
  def extractServiceType(t: UKCore_Encounter): Option[CodeableConcept]               = t.serviceType
  def extractImplicitRules(t: UKCore_Encounter): Option[UriStr]                      = t.implicitRules
  def extractType(t: UKCore_Encounter): LitSeq[CodeableConcept]                      = t.`type`
  def extractModifierExtension(t: UKCore_Encounter): LitSeq[Extension]               = t.modifierExtension
  def extractIdentifier(t: UKCore_Encounter): LitSeq[Identifier]                     = t.identifier
  def extractPartOf(t: UKCore_Encounter): Option[Reference]                          = t.partOf
  def extractSubject(t: UKCore_Encounter): Option[Reference]                         = t.subject
  def extractBasedOn(t: UKCore_Encounter): LitSeq[Reference]                         = t.basedOn
  def extractAccount(t: UKCore_Encounter): LitSeq[Reference]                         = t.account
  def extractClassHistory(t: UKCore_Encounter): LitSeq[Encounter.ClassHistory]       = t.classHistory
  def extractStatusHistory(t: UKCore_Encounter): LitSeq[Encounter.StatusHistory]     = t.statusHistory
  def extractAppointment(t: UKCore_Encounter): LitSeq[Reference]                     = t.appointment
  def extractEpisodeOfCare(t: UKCore_Encounter): LitSeq[Reference]                   = t.episodeOfCare
  def extractReasonReference(t: UKCore_Encounter): LitSeq[Reference]                 = t.reasonReference
  def extractServiceProvider(t: UKCore_Encounter): Option[Reference]                 = t.serviceProvider
  def extractLocation(t: UKCore_Encounter): LitSeq[Encounter.Location]               = t.location
  def extractDiagnosis(t: UKCore_Encounter): LitSeq[Encounter.Diagnosis]             = t.diagnosis
  def extractParticipant(t: UKCore_Encounter): LitSeq[Encounter.Participant]         = t.participant
  def extractHospitalization(t: UKCore_Encounter): Option[Encounter.Hospitalization] = t.hospitalization
  override val thisName: String                                                      = "UKCore_Encounter"
  override val searchParams: Map[String, UKCore_Encounter => Seq[Any]]               = Encounter.searchParams
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[UKCore_Encounter] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new UKCore_Encounter(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Coding]("class", None),
          cursor.decodeAs[ENCOUNTER_STATUS]("status", None),
          cursor.decodeAs[Option[Period]]("period", Some(None)),
          cursor.decodeAs[Option[Duration]]("length", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("priority", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("reasonCode", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("serviceType", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("type", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("partOf", Some(None)),
          cursor.decodeAs[Option[Reference]]("subject", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("basedOn", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("account", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Encounter.ClassHistory]]("classHistory", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Encounter.StatusHistory]]("statusHistory", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("appointment", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("episodeOfCare", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("reasonReference", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("serviceProvider", Some(None)),
          cursor.decodeAs[LitSeq[Encounter.Location]]("location", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Encounter.Diagnosis]]("diagnosis", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Encounter.Participant]]("participant", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Encounter.Hospitalization]]("hospitalization", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** Defines the UK Core constraints and extensions on the Encounter resource for the minimal set of data to query and retrieve
  * encounter information.
  *
  * Subclass of [[hl7.model.Encounter]] (An interaction between a patient and healthcare provider(s) for the purpose of providing
  * healthcare service(s) or assessing the health status of a patient.)
  *
  * @constructor
  *   Inherits all params from parent.
  * @param id
  *   \- The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta
  *   \- The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *   not always be associated with version changes to the resource.
  * @param text
  *   \- A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *   resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to
  *   make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be
  *   represented in the narrative to ensure clinical safety.
  * @param `class`
  *   \- Concepts representing classification of patient encounter such as ambulatory (outpatient), inpatient, emergency, home
  *   health or others due to local variations.
  * @param status
  *   \- planned | arrived | triaged | in-progress | onleave | finished | cancelled +.
  * @param period
  *   \- The start and end time of the encounter.
  * @param length
  *   \- Quantity of time the encounter lasted. This excludes the time during leaves of absence.
  * @param language
  *   \- The base language in which the resource is written.
  * @param priority
  *   \- Indicates the urgency of the encounter.
  * @param contained
  *   \- These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   \- May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param reasonCode
  *   \- Reason the encounter takes place, expressed as a code. For admissions, this can be used for a coded admission diagnosis.
  * @param serviceType
  *   \- Broad categorization of the service that is to be provided (e.g. cardiology).
  * @param implicitRules
  *   \- A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param `type`
  *   \- Specific type of encounter (e.g. e-mail consultation, surgical day-care, skilled nursing, rehabilitation).
  * @param modifierExtension
  *   \- May be used to represent additional information that is not part of the basic definition of the resource and that
  *   modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *   Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *   strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *   extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *   processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any
  *   elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param identifier
  *   \- Identifier(s) by which this encounter is known.
  * @param partOf
  *   \- Another Encounter of which this encounter is a part of (administratively or in time).
  * @param subject
  *   \- The patient or group present at the encounter.
  * @param basedOn
  *   \- The request this encounter satisfies (e.g. incoming referral or procedure request).
  * @param account
  *   \- The set of accounts that may be used for billing for this Encounter.
  * @param classHistory
  *   \- The class history permits the tracking of the encounters transitions without needing to go through the resource history.
  *   This would be used for a case where an admission starts of as an emergency encounter, then transitions into an inpatient
  *   scenario. Doing this and not restarting a new encounter ensures that any lab/diagnostic results can more easily follow the
  *   patient and not require re-processing and not get lost or cancelled during a kind of discharge from emergency to inpatient.
  * @param statusHistory
  *   \- The status history permits the encounter resource to contain the status history without needing to read through the
  *   historical versions of the resource, or even have the server store them.
  * @param appointment
  *   \- The appointment that scheduled this encounter.
  * @param episodeOfCare
  *   \- Where a specific encounter should be classified as a part of a specific episode(s) of care this field should be used.
  *   This association can facilitate grouping of related encounters together for a specific purpose, such as government
  *   reporting, issue tracking, association via a common problem. The association is recorded on the encounter as these are
  *   typically created after the episode of care and grouped on entry rather than editing the episode of care to append another
  *   encounter to it (the episode of care could span years).
  * @param reasonReference
  *   \- Reason the encounter takes place, expressed as a code. For admissions, this can be used for a coded admission diagnosis.
  * @param serviceProvider
  *   \- The organization that is primarily responsible for this Encounter's services. This MAY be the same as the organization on
  *   the Patient record, however it could be different, such as if the actor performing the services was from an external
  *   organization (which may be billed seperately) for an external consultation. Refer to the example bundle showing an
  *   abbreviated set of Encounters for a colonoscopy.
  * @param location
  *   \- List of locations where the patient has been during this encounter.
  * @param diagnosis
  *   \- The list of diagnosis relevant to this encounter.
  * @param participant
  *   \- The list of people responsible for providing the service.
  * @param hospitalization
  *   \- Details about the admission to a healthcare service.
  */
@POJOBoilerplate
class UKCore_Encounter(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-Encounter"))),
    override val text: Option[Narrative] = None,
    override val `class`: Coding,
    override val status: ENCOUNTER_STATUS,
    override val period: Option[Period] = None,
    override val length: Option[Duration] = None,
    override val language: Option[LANGUAGES] = None,
    override val priority: Option[CodeableConcept] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
    override val serviceType: Option[CodeableConcept] = None,
    override val implicitRules: Option[UriStr] = None,
    override val `type`: LitSeq[CodeableConcept] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val partOf: Option[Reference] = None,
    override val subject: Option[Reference] = None,
    override val basedOn: LitSeq[Reference] = LitSeq.empty,
    override val account: LitSeq[Reference] = LitSeq.empty,
    override val classHistory: LitSeq[Encounter.ClassHistory] = LitSeq.empty,
    override val statusHistory: LitSeq[Encounter.StatusHistory] = LitSeq.empty,
    override val appointment: LitSeq[Reference] = LitSeq.empty,
    override val episodeOfCare: LitSeq[Reference] = LitSeq.empty,
    override val reasonReference: LitSeq[Reference] = LitSeq.empty,
    override val serviceProvider: Option[Reference] = None,
    override val location: LitSeq[Encounter.Location] = LitSeq.empty,
    override val diagnosis: LitSeq[Encounter.Diagnosis] = LitSeq.empty,
    override val participant: LitSeq[Encounter.Participant] = LitSeq.empty,
    override val hospitalization: Option[Encounter.Hospitalization] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Encounter(
      id = id,
      meta = meta,
      text = text,
      `type` = `type`,
      `class` = `class`,
      status = status,
      period = period,
      length = length,
      partOf = partOf,
      subject = subject,
      basedOn = basedOn,
      account = account,
      language = language,
      priority = priority,
      contained = contained,
      extension = extension,
      identifier = identifier,
      reasonCode = reasonCode,
      serviceType = serviceType,
      appointment = appointment,
      implicitRules = implicitRules,
      episodeOfCare = episodeOfCare,
      reasonReference = reasonReference,
      serviceProvider = serviceProvider,
      modifierExtension = modifierExtension,
      location = location,
      diagnosis = diagnosis,
      participant = participant,
      classHistory = classHistory,
      statusHistory = statusHistory,
      hospitalization = hospitalization,
      primitiveAttributes = primitiveAttributes
    ) {
  override val thisTypeName: String = "Encounter"
}
