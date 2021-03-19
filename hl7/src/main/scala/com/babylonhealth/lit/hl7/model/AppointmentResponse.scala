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
import com.babylonhealth.lit.hl7.PARTICIPATIONSTATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object AppointmentResponse extends CompanionFor[AppointmentResponse] {
  override type ResourceType = AppointmentResponse
  override val baseType: CompanionFor[ResourceType] = AppointmentResponse
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/AppointmentResponse")
  def apply(
      id: Option[String] = None,
      end: Option[ZonedDateTime] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      start: Option[ZonedDateTime] = None,
      actor: Option[Reference] = None,
      comment: Option[String] = None,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      appointment: Reference,
      implicitRules: Option[UriStr] = None,
      participantType: LitSeq[CodeableConcept] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      participantStatus: PARTICIPATIONSTATUS,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): AppointmentResponse = new AppointmentResponse(
    id,
    end,
    meta,
    text,
    start,
    actor,
    comment,
    language,
    contained,
    extension,
    identifier,
    appointment,
    implicitRules,
    participantType,
    modifierExtension,
    participantStatus,
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
  val start: FHIRComponentFieldMeta[Option[ZonedDateTime]] =
    FHIRComponentFieldMeta("start", lTagOf[Option[ZonedDateTime]], false, lTagOf[ZonedDateTime])
  val actor: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("actor", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val comment: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("comment", lTagOf[Option[String]], false, lTagOf[String])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val appointment: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("appointment", lTagOf[Reference], false, lTagOf[Reference])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val participantType: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("participantType", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val participantStatus: FHIRComponentFieldMeta[PARTICIPATIONSTATUS] =
    FHIRComponentFieldMeta("participantStatus", lTagOf[PARTICIPATIONSTATUS], false, lTagOf[PARTICIPATIONSTATUS])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    end,
    meta,
    text,
    start,
    actor,
    comment,
    language,
    contained,
    extension,
    identifier,
    appointment,
    implicitRules,
    participantType,
    modifierExtension,
    participantStatus
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: AppointmentResponse): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[ZonedDateTime]](end, t.end),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[ZonedDateTime]](start, t.start),
    FHIRComponentField[Option[Reference]](actor, t.actor),
    FHIRComponentField[Option[String]](comment, t.comment),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Reference](appointment, t.appointment),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[CodeableConcept]](participantType, t.participantType),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[PARTICIPATIONSTATUS](participantStatus, t.participantStatus)
  )
  def extractId(t: AppointmentResponse): Option[String]                       = t.id
  def extractEnd(t: AppointmentResponse): Option[ZonedDateTime]               = t.end
  def extractMeta(t: AppointmentResponse): Option[Meta]                       = t.meta
  def extractText(t: AppointmentResponse): Option[Narrative]                  = t.text
  def extractStart(t: AppointmentResponse): Option[ZonedDateTime]             = t.start
  def extractActor(t: AppointmentResponse): Option[Reference]                 = t.actor
  def extractComment(t: AppointmentResponse): Option[String]                  = t.comment
  def extractLanguage(t: AppointmentResponse): Option[LANGUAGES]              = t.language
  def extractContained(t: AppointmentResponse): LitSeq[Resource]              = t.contained
  def extractExtension(t: AppointmentResponse): LitSeq[Extension]             = t.extension
  def extractIdentifier(t: AppointmentResponse): LitSeq[Identifier]           = t.identifier
  def extractAppointment(t: AppointmentResponse): Reference                   = t.appointment
  def extractImplicitRules(t: AppointmentResponse): Option[UriStr]            = t.implicitRules
  def extractParticipantType(t: AppointmentResponse): LitSeq[CodeableConcept] = t.participantType
  def extractModifierExtension(t: AppointmentResponse): LitSeq[Extension]     = t.modifierExtension
  def extractParticipantStatus(t: AppointmentResponse): PARTICIPATIONSTATUS   = t.participantStatus
  override val thisName: String                                               = "AppointmentResponse"
  override val searchParams: Map[String, AppointmentResponse => Seq[Any]] = Map(
    "location"     -> (obj => obj.actor.filter(_.reference.exists(_.contains("Location/"))).toSeq),
    "identifier"   -> (obj => obj.identifier.toSeq),
    "part-status"  -> (obj => Seq(obj.participantStatus)),
    "appointment"  -> (obj => Seq(obj.appointment)),
    "patient"      -> (obj => obj.actor.filter(_.reference.exists(_.contains("Patient/"))).toSeq),
    "practitioner" -> (obj => obj.actor.filter(_.reference.exists(_.contains("Practitioner/"))).toSeq),
    "actor"        -> (obj => obj.actor.toSeq)
  )
  def unapply(
      o: AppointmentResponse): Option[(Option[String], Option[ZonedDateTime], Option[Meta], Option[Narrative], Option[ZonedDateTime], Option[Reference], Option[String], Option[LANGUAGES], LitSeq[Resource], LitSeq[Extension], LitSeq[Identifier], Reference, Option[UriStr], LitSeq[CodeableConcept], LitSeq[Extension], PARTICIPATIONSTATUS)] =
    Some(
      (
        o.id,
        o.end,
        o.meta,
        o.text,
        o.start,
        o.actor,
        o.comment,
        o.language,
        o.contained,
        o.extension,
        o.identifier,
        o.appointment,
        o.implicitRules,
        o.participantType,
        o.modifierExtension,
        o.participantStatus))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[AppointmentResponse] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new AppointmentResponse(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[ZonedDateTime]]("end", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[ZonedDateTime]]("start", Some(None)),
          cursor.decodeAs[Option[Reference]]("actor", Some(None)),
          cursor.decodeAs[Option[String]]("comment", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Reference]("appointment", None),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("participantType", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[PARTICIPATIONSTATUS]("participantStatus", None),
          decodeAttributes(cursor)
        )
      ))
}

/** A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields end, start, actor, comment, identifier, appointment, participantType, participantStatus.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param end - This may be either the same as the appointment request to confirm the details of the appointment, or alternately a new time to request a re-negotiation of the end time.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param start - Date/Time that the appointment is to take place, or requested new start time.
  * @param actor - A Person, Location, HealthcareService, or Device that is participating in the appointment.
  * @param comment - Additional comments about the appointment.
  * @param language - The base language in which the resource is written.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param identifier - This records identifiers associated with this appointment response concern that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate.
  * @param appointment - Appointment that this response is replying to.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param participantType - Role of participant in the appointment.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param participantStatus - Participation status of the participant. When the status is declined or tentative if the start/end times are different to the appointment, then these times should be interpreted as a requested time change. When the status is accepted, the times can either be the time of the appointment (as a confirmation of the time) or can be empty.
  */
@POJOBoilerplate
class AppointmentResponse(
    override val id: Option[String] = None,
    val end: Option[ZonedDateTime] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val start: Option[ZonedDateTime] = None,
    val actor: Option[Reference] = None,
    val comment: Option[String] = None,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val appointment: Reference,
    override val implicitRules: Option[UriStr] = None,
    val participantType: LitSeq[CodeableConcept] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val participantStatus: PARTICIPATIONSTATUS,
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
  override val thisTypeName: String = "AppointmentResponse"
}
