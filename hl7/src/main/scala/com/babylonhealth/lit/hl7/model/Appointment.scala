package com.babylonhealth.lit.hl7.model

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
import com.babylonhealth.lit.hl7.{ PARTICIPATIONSTATUS, APPOINTMENTSTATUS, PARTICIPANTREQUIRED }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Appointment extends CompanionFor[Appointment] {
  implicit def summonObjectAndCompanionAppointment613298086(o: Appointment): ObjectAndCompanion[Appointment, Appointment.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Appointment
  override type ParentType   = Appointment
  override val baseType: CompanionFor[ResourceType] = Appointment
  override val parentType: CompanionFor[ParentType] = Appointment
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Appointment")
  object Participant extends CompanionFor[Participant] {
    implicit def summonObjectAndCompanionParticipant1517870994(
        o: Participant): ObjectAndCompanion[Participant, Participant.type] = ObjectAndCompanion(o, this)
    override type ResourceType = Participant
    override type ParentType   = Participant
    override val parentType: CompanionFor[ResourceType] = Participant
    def apply(
        id: Option[String] = None,
        `type`: LitSeq[CodeableConcept] = LitSeq.empty,
        actor: Option[Reference] = None,
        status: PARTICIPATIONSTATUS,
        period: Option[Period] = None,
        required: Option[PARTICIPANTREQUIRED] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Participant = new Participant(
      id,
      `type`,
      actor,
      status,
      period,
      required,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Participant): Option[(Option[String], LitSeq[CodeableConcept], Option[Reference], PARTICIPATIONSTATUS, Option[Period], Option[PARTICIPANTREQUIRED], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.`type`, o.actor, o.status, o.period, o.required, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val actor: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("actor", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val status: FHIRComponentFieldMeta[PARTICIPATIONSTATUS] =
      FHIRComponentFieldMeta("status", lTagOf[PARTICIPATIONSTATUS], false, lTagOf[PARTICIPATIONSTATUS])
    val period: FHIRComponentFieldMeta[Option[Period]] =
      FHIRComponentFieldMeta("period", lTagOf[Option[Period]], false, lTagOf[Period])
    val required: FHIRComponentFieldMeta[Option[PARTICIPANTREQUIRED]] =
      FHIRComponentFieldMeta("required", lTagOf[Option[PARTICIPANTREQUIRED]], false, lTagOf[PARTICIPANTREQUIRED])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, `type`, actor, status, period, required, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Participant): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[Option[Reference]](actor, t.actor),
      FHIRComponentField[PARTICIPATIONSTATUS](status, t.status),
      FHIRComponentField[Option[Period]](period, t.period),
      FHIRComponentField[Option[PARTICIPANTREQUIRED]](required, t.required),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Participant] = this
    val thisName: String                    = "Participant"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Participant] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Participant(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("type", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Reference]]("actor", Some(None)),
            cursor.decodeAs[PARTICIPATIONSTATUS]("status", None),
            cursor.decodeAs[Option[Period]]("period", Some(None)),
            cursor.decodeAs[Option[PARTICIPANTREQUIRED]]("required", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Participant(
      override val id: Option[String] = None,
      val `type`: LitSeq[CodeableConcept] = LitSeq.empty,
      val actor: Option[Reference] = None,
      val status: PARTICIPATIONSTATUS,
      val period: Option[Period] = None,
      val required: Option[PARTICIPANTREQUIRED] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      end: Option[ZonedDateTime] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      slot: LitSeq[Reference] = LitSeq.empty,
      start: Option[ZonedDateTime] = None,
      status: APPOINTMENTSTATUS,
      created: Option[FHIRDateTime] = None,
      comment: Option[String] = None,
      basedOn: LitSeq[Reference] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      priority: Option[UnsignedInt] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      specialty: LitSeq[CodeableConcept] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
      serviceType: LitSeq[CodeableConcept] = LitSeq.empty,
      description: Option[String] = None,
      implicitRules: Option[UriStr] = None,
      serviceCategory: LitSeq[CodeableConcept] = LitSeq.empty,
      appointmentType: Option[CodeableConcept] = None,
      reasonReference: LitSeq[Reference] = LitSeq.empty,
      minutesDuration: Option[PositiveInt] = None,
      requestedPeriod: LitSeq[Period] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      cancelationReason: Option[CodeableConcept] = None,
      patientInstruction: Option[String] = None,
      supportingInformation: LitSeq[Reference] = LitSeq.empty,
      participant: NonEmptyLitSeq[Appointment.Participant],
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Appointment = new Appointment(
    id,
    end,
    meta,
    text,
    slot,
    start,
    status,
    created,
    comment,
    basedOn,
    language,
    priority,
    contained,
    extension,
    specialty,
    identifier,
    reasonCode,
    serviceType,
    description,
    implicitRules,
    serviceCategory,
    appointmentType,
    reasonReference,
    minutesDuration,
    requestedPeriod,
    modifierExtension,
    cancelationReason,
    patientInstruction,
    supportingInformation,
    participant,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val end: FHIRComponentFieldMeta[Option[ZonedDateTime]] =
    FHIRComponentFieldMeta("end", lTagOf[Option[ZonedDateTime]], false, lTagOf[ZonedDateTime])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val slot: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("slot", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val start: FHIRComponentFieldMeta[Option[ZonedDateTime]] =
    FHIRComponentFieldMeta("start", lTagOf[Option[ZonedDateTime]], false, lTagOf[ZonedDateTime])
  val status: FHIRComponentFieldMeta[APPOINTMENTSTATUS] =
    FHIRComponentFieldMeta("status", lTagOf[APPOINTMENTSTATUS], false, lTagOf[APPOINTMENTSTATUS])
  val created: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("created", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val comment: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("comment", lTagOf[Option[String]], false, lTagOf[String])
  val basedOn: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("basedOn", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val priority: FHIRComponentFieldMeta[Option[UnsignedInt]] =
    FHIRComponentFieldMeta("priority", lTagOf[Option[UnsignedInt]], false, lTagOf[UnsignedInt])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val specialty: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("specialty", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val reasonCode: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("reasonCode", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val serviceType: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("serviceType", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val description: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val serviceCategory: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("serviceCategory", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val appointmentType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("appointmentType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val reasonReference: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("reasonReference", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val minutesDuration: FHIRComponentFieldMeta[Option[PositiveInt]] =
    FHIRComponentFieldMeta("minutesDuration", lTagOf[Option[PositiveInt]], false, lTagOf[PositiveInt])
  val requestedPeriod: FHIRComponentFieldMeta[LitSeq[Period]] =
    FHIRComponentFieldMeta("requestedPeriod", lTagOf[LitSeq[Period]], false, lTagOf[Period])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val cancelationReason: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("cancelationReason", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val patientInstruction: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("patientInstruction", lTagOf[Option[String]], false, lTagOf[String])
  val supportingInformation: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("supportingInformation", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val participant: FHIRComponentFieldMeta[NonEmptyLitSeq[Appointment.Participant]] =
    FHIRComponentFieldMeta("participant", lTagOf[NonEmptyLitSeq[Appointment.Participant]], false, lTagOf[Appointment.Participant])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    end,
    meta,
    text,
    slot,
    start,
    status,
    created,
    comment,
    basedOn,
    language,
    priority,
    contained,
    extension,
    specialty,
    identifier,
    reasonCode,
    serviceType,
    description,
    implicitRules,
    serviceCategory,
    appointmentType,
    reasonReference,
    minutesDuration,
    requestedPeriod,
    modifierExtension,
    cancelationReason,
    patientInstruction,
    supportingInformation,
    participant
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Appointment): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[ZonedDateTime]](end, t.end),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[LitSeq[Reference]](slot, t.slot),
    FHIRComponentField[Option[ZonedDateTime]](start, t.start),
    FHIRComponentField[APPOINTMENTSTATUS](status, t.status),
    FHIRComponentField[Option[FHIRDateTime]](created, t.created),
    FHIRComponentField[Option[String]](comment, t.comment),
    FHIRComponentField[LitSeq[Reference]](basedOn, t.basedOn),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Option[UnsignedInt]](priority, t.priority),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[CodeableConcept]](specialty, t.specialty),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[LitSeq[CodeableConcept]](reasonCode, t.reasonCode),
    FHIRComponentField[LitSeq[CodeableConcept]](serviceType, t.serviceType),
    FHIRComponentField[Option[String]](description, t.description),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[CodeableConcept]](serviceCategory, t.serviceCategory),
    FHIRComponentField[Option[CodeableConcept]](appointmentType, t.appointmentType),
    FHIRComponentField[LitSeq[Reference]](reasonReference, t.reasonReference),
    FHIRComponentField[Option[PositiveInt]](minutesDuration, t.minutesDuration),
    FHIRComponentField[LitSeq[Period]](requestedPeriod, t.requestedPeriod),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Option[CodeableConcept]](cancelationReason, t.cancelationReason),
    FHIRComponentField[Option[String]](patientInstruction, t.patientInstruction),
    FHIRComponentField[LitSeq[Reference]](supportingInformation, t.supportingInformation),
    FHIRComponentField[NonEmptyLitSeq[Appointment.Participant]](participant, t.participant)
  )
  def extractId(t: Appointment): Option[String]                                   = t.id
  def extractEnd(t: Appointment): Option[ZonedDateTime]                           = t.end
  def extractMeta(t: Appointment): Option[Meta]                                   = t.meta
  def extractText(t: Appointment): Option[Narrative]                              = t.text
  def extractSlot(t: Appointment): LitSeq[Reference]                              = t.slot
  def extractStart(t: Appointment): Option[ZonedDateTime]                         = t.start
  def extractStatus(t: Appointment): APPOINTMENTSTATUS                            = t.status
  def extractCreated(t: Appointment): Option[FHIRDateTime]                        = t.created
  def extractComment(t: Appointment): Option[String]                              = t.comment
  def extractBasedOn(t: Appointment): LitSeq[Reference]                           = t.basedOn
  def extractLanguage(t: Appointment): Option[LANGUAGES]                          = t.language
  def extractPriority(t: Appointment): Option[UnsignedInt]                        = t.priority
  def extractContained(t: Appointment): LitSeq[Resource]                          = t.contained
  def extractExtension(t: Appointment): LitSeq[Extension]                         = t.extension
  def extractSpecialty(t: Appointment): LitSeq[CodeableConcept]                   = t.specialty
  def extractIdentifier(t: Appointment): LitSeq[Identifier]                       = t.identifier
  def extractReasonCode(t: Appointment): LitSeq[CodeableConcept]                  = t.reasonCode
  def extractServiceType(t: Appointment): LitSeq[CodeableConcept]                 = t.serviceType
  def extractDescription(t: Appointment): Option[String]                          = t.description
  def extractImplicitRules(t: Appointment): Option[UriStr]                        = t.implicitRules
  def extractServiceCategory(t: Appointment): LitSeq[CodeableConcept]             = t.serviceCategory
  def extractAppointmentType(t: Appointment): Option[CodeableConcept]             = t.appointmentType
  def extractReasonReference(t: Appointment): LitSeq[Reference]                   = t.reasonReference
  def extractMinutesDuration(t: Appointment): Option[PositiveInt]                 = t.minutesDuration
  def extractRequestedPeriod(t: Appointment): LitSeq[Period]                      = t.requestedPeriod
  def extractModifierExtension(t: Appointment): LitSeq[Extension]                 = t.modifierExtension
  def extractCancelationReason(t: Appointment): Option[CodeableConcept]           = t.cancelationReason
  def extractPatientInstruction(t: Appointment): Option[String]                   = t.patientInstruction
  def extractSupportingInformation(t: Appointment): LitSeq[Reference]             = t.supportingInformation
  def extractParticipant(t: Appointment): NonEmptyLitSeq[Appointment.Participant] = t.participant
  override val thisName: String                                                   = "Appointment"
  override val searchParams: Map[String, Appointment => Seq[Any]] = Map(
    "appointment-type" -> (obj => obj.appointmentType.toSeq),
    "location"         -> (obj => obj.participant.flatMap(_.actor).filter(_.reference.exists(_.contains("Location/"))).toSeq),
    "identifier"       -> (obj => obj.identifier.toSeq),
    "specialty"        -> (obj => obj.specialty.toSeq),
    "part-status"      -> (obj => obj.participant.map(_.status).toSeq),
    "date"             -> (obj => obj.start.toSeq),
    "status"           -> (obj => Seq(obj.status)),
    "service-category" -> (obj => obj.serviceCategory.toSeq),
    "supporting-info"  -> (obj => obj.supportingInformation.toSeq),
    "slot"             -> (obj => obj.slot.toSeq),
    "based-on"         -> (obj => obj.basedOn.toSeq),
    "reason-reference" -> (obj => obj.reasonReference.toSeq),
    "patient"          -> (obj => obj.participant.flatMap(_.actor).filter(_.reference.exists(_.contains("Patient/"))).toSeq),
    "practitioner"     -> (obj => obj.participant.flatMap(_.actor).filter(_.reference.exists(_.contains("Practitioner/"))).toSeq),
    "actor"            -> (obj => obj.participant.flatMap(_.actor).toSeq),
    "service-type"     -> (obj => obj.serviceType.toSeq),
    "reason-code"      -> (obj => obj.reasonCode.toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Appointment] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Appointment(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[ZonedDateTime]]("end", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("slot", Some(LitSeq.empty)),
          cursor.decodeAs[Option[ZonedDateTime]]("start", Some(None)),
          cursor.decodeAs[APPOINTMENTSTATUS]("status", None),
          cursor.decodeAs[Option[FHIRDateTime]]("created", Some(None)),
          cursor.decodeAs[Option[String]]("comment", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("basedOn", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[UnsignedInt]]("priority", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("specialty", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("reasonCode", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("serviceType", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("description", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("serviceCategory", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("appointmentType", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("reasonReference", Some(LitSeq.empty)),
          cursor.decodeAs[Option[PositiveInt]]("minutesDuration", Some(None)),
          cursor.decodeAs[LitSeq[Period]]("requestedPeriod", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("cancelationReason", Some(None)),
          cursor.decodeAs[Option[String]]("patientInstruction", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("supportingInformation", Some(LitSeq.empty)),
          cursor.decodeAs[NonEmptyLitSeq[Appointment.Participant]]("participant", None),
          decodeAttributes(cursor)
        )
      ))
}

/** A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific
  * date/time. This may result in one or more Encounter(s).
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields end, slot, start, status, created, comment, basedOn, priority, specialty, identifier, reasonCode,
  *   serviceType, description, serviceCategory, appointmentType, reasonReference, minutesDuration, requestedPeriod,
  *   cancelationReason, patientInstruction, supportingInformation, participant.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param end
  *   - Date/Time that the appointment is to conclude.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *   not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *   resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to
  *   make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be
  *   represented in the narrative to ensure clinical safety.
  * @param slot
  *   - The slots from the participants' schedules that will be filled by the appointment.
  * @param start
  *   - Date/Time that the appointment is to take place.
  * @param status
  *   - The overall status of the Appointment. Each of the participants has their own participation status which indicates their
  *   involvement in the process, however this status indicates the shared status.
  * @param created
  *   - The date that this appointment was initially created. This could be different to the meta.lastModified value on the
  *   initial entry, as this could have been before the resource was created on the FHIR server, and should remain unchanged over
  *   the lifespan of the appointment.
  * @param comment
  *   - Additional comments about the appointment.
  * @param basedOn
  *   - The service request this appointment is allocated to assess (e.g. incoming referral or procedure request).
  * @param language
  *   - The base language in which the resource is written.
  * @param priority
  *   - The priority of the appointment. Can be used to make informed decisions if needing to re-prioritize appointments. (The
  *   iCal Standard specifies 0 as undefined, 1 as highest, 9 as lowest priority).
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param specialty
  *   - The specialty of a practitioner that would be required to perform the service requested in this appointment.
  * @param identifier
  *   - This records identifiers associated with this appointment concern that are defined by business processes and/or used to
  *   refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written /
  *   printed documentation).
  * @param reasonCode
  *   - The coded reason that this appointment is being scheduled. This is more clinical than administrative.
  * @param serviceType
  *   - The specific service that is to be performed during this appointment.
  * @param description
  *   - The brief description of the appointment as would be shown on a subject line in a meeting request, or appointment list.
  *   Detailed or expanded information should be put in the comment field.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param serviceCategory
  *   - A broad categorization of the service that is to be performed during this appointment.
  * @param appointmentType
  *   - The style of appointment or patient that has been booked in the slot (not service type).
  * @param reasonReference
  *   - Reason the appointment has been scheduled to take place, as specified using information from another resource. When the
  *   patient arrives and the encounter begins it may be used as the admission diagnosis. The indication will typically be a
  *   Condition (with other resources referenced in the evidence.detail), or a Procedure.
  * @param minutesDuration
  *   - Number of minutes that the appointment is to take. This can be less than the duration between the start and end times. For
  *   example, where the actual time of appointment is only an estimate or if a 30 minute appointment is being requested, but any
  *   time would work. Also, if there is, for example, a planned 15 minute break in the middle of a long appointment, the duration
  *   may be 15 minutes less than the difference between the start and end.
  * @param requestedPeriod
  *   - A set of date ranges (potentially including times) that the appointment is preferred to be scheduled within. The duration
  *   (usually in minutes) could also be provided to indicate the length of the appointment to fill and populate the start/end
  *   times for the actual allocated time. However, in other situations the duration may be calculated by the scheduling system.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *   the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually
  *   modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict
  *   set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param cancelationReason
  *   - The coded reason for the appointment being cancelled. This is often used in reporting/billing/futher processing to
  *   determine if further actions are required, or specific fees apply.
  * @param patientInstruction
  *   - While Appointment.comment contains information for internal use, Appointment.patientInstructions is used to capture
  *   patient facing information about the Appointment (e.g. please bring your referral or fast from 8pm night before).
  * @param supportingInformation
  *   - Additional information to support the appointment provided when making the appointment.
  * @param participant
  *   - List of participants involved in the appointment.
  */
@POJOBoilerplate
class Appointment(
    override val id: Option[String] = None,
    val end: Option[ZonedDateTime] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val slot: LitSeq[Reference] = LitSeq.empty,
    val start: Option[ZonedDateTime] = None,
    val status: APPOINTMENTSTATUS,
    val created: Option[FHIRDateTime] = None,
    val comment: Option[String] = None,
    val basedOn: LitSeq[Reference] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    val priority: Option[UnsignedInt] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val specialty: LitSeq[CodeableConcept] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
    val serviceType: LitSeq[CodeableConcept] = LitSeq.empty,
    val description: Option[String] = None,
    override val implicitRules: Option[UriStr] = None,
    val serviceCategory: LitSeq[CodeableConcept] = LitSeq.empty,
    val appointmentType: Option[CodeableConcept] = None,
    val reasonReference: LitSeq[Reference] = LitSeq.empty,
    val minutesDuration: Option[PositiveInt] = None,
    val requestedPeriod: LitSeq[Period] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val cancelationReason: Option[CodeableConcept] = None,
    val patientInstruction: Option[String] = None,
    val supportingInformation: LitSeq[Reference] = LitSeq.empty,
    val participant: NonEmptyLitSeq[Appointment.Participant],
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends DomainResource(
      id = id,
      meta = meta,
      text = text,
      language = language,
      contained = contained,
      extension = extension,
      implicitRules = implicitRules,
      modifierExtension = modifierExtension,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Appointment"
}
