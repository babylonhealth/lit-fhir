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
import com.babylonhealth.lit.hl7.SLOTSTATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Slot extends CompanionFor[Slot] {
  implicit def summonObjectAndCompanionSlot_873118674(o: Slot): ObjectAndCompanion[Slot, Slot.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Slot
  override type ParentType   = Slot
  override val baseType: CompanionFor[ResourceType] = Slot
  override val parentType: CompanionFor[ParentType] = Slot
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Slot")
  def apply(
      id: Option[String] = None,
      end: ZonedDateTime,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      start: ZonedDateTime,
      status: SLOTSTATUS,
      comment: Option[String] = None,
      language: Option[LANGUAGES] = None,
      schedule: Reference,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      specialty: LitSeq[CodeableConcept] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      overbooked: Option[Boolean] = None,
      serviceType: LitSeq[CodeableConcept] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      serviceCategory: LitSeq[CodeableConcept] = LitSeq.empty,
      appointmentType: Option[CodeableConcept] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Slot = new Slot(
    id,
    end,
    meta,
    text,
    start,
    status,
    comment,
    language,
    schedule,
    contained,
    extension,
    specialty,
    identifier,
    overbooked,
    serviceType,
    implicitRules,
    serviceCategory,
    appointmentType,
    modifierExtension,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val end: FHIRComponentFieldMeta[ZonedDateTime] =
    FHIRComponentFieldMeta("end", lTagOf[ZonedDateTime], false, lTagOf[ZonedDateTime])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val start: FHIRComponentFieldMeta[ZonedDateTime] =
    FHIRComponentFieldMeta("start", lTagOf[ZonedDateTime], false, lTagOf[ZonedDateTime])
  val status: FHIRComponentFieldMeta[SLOTSTATUS] =
    FHIRComponentFieldMeta("status", lTagOf[SLOTSTATUS], false, lTagOf[SLOTSTATUS])
  val comment: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("comment", lTagOf[Option[String]], false, lTagOf[String])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val schedule: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("schedule", lTagOf[Reference], false, lTagOf[Reference])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val specialty: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("specialty", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val overbooked: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("overbooked", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val serviceType: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("serviceType", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val serviceCategory: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("serviceCategory", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val appointmentType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("appointmentType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    end,
    meta,
    text,
    start,
    status,
    comment,
    language,
    schedule,
    contained,
    extension,
    specialty,
    identifier,
    overbooked,
    serviceType,
    implicitRules,
    serviceCategory,
    appointmentType,
    modifierExtension
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Slot): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[ZonedDateTime](end, t.end),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[ZonedDateTime](start, t.start),
    FHIRComponentField[SLOTSTATUS](status, t.status),
    FHIRComponentField[Option[String]](comment, t.comment),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Reference](schedule, t.schedule),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[CodeableConcept]](specialty, t.specialty),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[Boolean]](overbooked, t.overbooked),
    FHIRComponentField[LitSeq[CodeableConcept]](serviceType, t.serviceType),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[CodeableConcept]](serviceCategory, t.serviceCategory),
    FHIRComponentField[Option[CodeableConcept]](appointmentType, t.appointmentType),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
  )
  def extractId(t: Slot): Option[String]                       = t.id
  def extractEnd(t: Slot): ZonedDateTime                       = t.end
  def extractMeta(t: Slot): Option[Meta]                       = t.meta
  def extractText(t: Slot): Option[Narrative]                  = t.text
  def extractStart(t: Slot): ZonedDateTime                     = t.start
  def extractStatus(t: Slot): SLOTSTATUS                       = t.status
  def extractComment(t: Slot): Option[String]                  = t.comment
  def extractLanguage(t: Slot): Option[LANGUAGES]              = t.language
  def extractSchedule(t: Slot): Reference                      = t.schedule
  def extractContained(t: Slot): LitSeq[Resource]              = t.contained
  def extractExtension(t: Slot): LitSeq[Extension]             = t.extension
  def extractSpecialty(t: Slot): LitSeq[CodeableConcept]       = t.specialty
  def extractIdentifier(t: Slot): LitSeq[Identifier]           = t.identifier
  def extractOverbooked(t: Slot): Option[Boolean]              = t.overbooked
  def extractServiceType(t: Slot): LitSeq[CodeableConcept]     = t.serviceType
  def extractImplicitRules(t: Slot): Option[UriStr]            = t.implicitRules
  def extractServiceCategory(t: Slot): LitSeq[CodeableConcept] = t.serviceCategory
  def extractAppointmentType(t: Slot): Option[CodeableConcept] = t.appointmentType
  def extractModifierExtension(t: Slot): LitSeq[Extension]     = t.modifierExtension
  override val thisName: String                                = "Slot"
  override val searchParams: Map[String, Slot => Seq[Any]] = Map(
    "appointment-type" -> (obj => obj.appointmentType.toSeq),
    "identifier"       -> (obj => obj.identifier.toSeq),
    "service-type"     -> (obj => obj.serviceType.toSeq),
    "specialty"        -> (obj => obj.specialty.toSeq),
    "status"           -> (obj => Seq(obj.status)),
    "schedule"         -> (obj => Seq(obj.schedule)),
    "service-category" -> (obj => obj.serviceCategory.toSeq),
    "start"            -> (obj => Seq(obj.start))
  )
  def unapply(
      o: Slot): Option[(Option[String], ZonedDateTime, Option[Meta], Option[Narrative], ZonedDateTime, SLOTSTATUS, Option[String], Option[LANGUAGES], Reference, LitSeq[Resource], LitSeq[Extension], LitSeq[CodeableConcept], LitSeq[Identifier], Option[Boolean], LitSeq[CodeableConcept], Option[UriStr], LitSeq[CodeableConcept], Option[CodeableConcept], LitSeq[Extension])] =
    Some(
      (
        o.id,
        o.end,
        o.meta,
        o.text,
        o.start,
        o.status,
        o.comment,
        o.language,
        o.schedule,
        o.contained,
        o.extension,
        o.specialty,
        o.identifier,
        o.overbooked,
        o.serviceType,
        o.implicitRules,
        o.serviceCategory,
        o.appointmentType,
        o.modifierExtension))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Slot] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Slot(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[ZonedDateTime]("end", None),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[ZonedDateTime]("start", None),
          cursor.decodeAs[SLOTSTATUS]("status", None),
          cursor.decodeAs[Option[String]]("comment", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Reference]("schedule", None),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("specialty", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Boolean]]("overbooked", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("serviceType", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("serviceCategory", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("appointmentType", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** A slot of time on a schedule that may be available for booking appointments.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields end, start, status, comment, schedule, specialty, identifier, overbooked, serviceType,
  *   serviceCategory, appointmentType.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param end
  *   - Date/Time that the slot is to conclude.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the
  *   content might not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of
  *   the resource to a human. The narrative need not encode all the structured data, but is required to contain
  *   sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may
  *   define what content should be represented in the narrative to ensure clinical safety.
  * @param start
  *   - Date/Time that the slot is to begin.
  * @param status
  *   - busy | free | busy-unavailable | busy-tentative | entered-in-error.
  * @param comment
  *   - Comments on the slot to describe any extended information. Such as custom constraints on the slot.
  * @param language
  *   - The base language in which the resource is written.
  * @param schedule
  *   - The schedule resource that this slot defines an interval of status information.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To
  *   make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and
  *   use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be
  *   met as part of the definition of the extension.
  * @param specialty
  *   - The specialty of a practitioner that would be required to perform the service requested in this appointment.
  * @param identifier
  *   - External Ids for this item.
  * @param overbooked
  *   - This slot has already been overbooked, appointments are unlikely to be accepted for this time.
  * @param serviceType
  *   - The type of appointments that can be booked into this slot (ideally this would be an identifiable service -
  *   which is at a location, rather than the location itself). If provided then this overrides the value provided on
  *   the availability resource.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood
  *   when processing the content. Often, this is a reference to an implementation guide that defines the special rules
  *   along with other profiles etc.
  * @param serviceCategory
  *   - A broad categorization of the service that is to be performed during this appointment.
  * @param appointmentType
  *   - The style of appointment or patient that may be booked in the slot (not service type).
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and
  *   that modifies the understanding of the element that contains it and/or the understanding of the containing
  *   element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions
  *   safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though
  *   any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the
  *   definition of the extension. Applications processing a resource are required to check for modifier extensions.
  *   Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot
  *   change the meaning of modifierExtension itself).
  */
@POJOBoilerplate
class Slot(
    override val id: Option[String] = None,
    val end: ZonedDateTime,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val start: ZonedDateTime,
    val status: SLOTSTATUS,
    val comment: Option[String] = None,
    override val language: Option[LANGUAGES] = None,
    val schedule: Reference,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val specialty: LitSeq[CodeableConcept] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val overbooked: Option[Boolean] = None,
    val serviceType: LitSeq[CodeableConcept] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    val serviceCategory: LitSeq[CodeableConcept] = LitSeq.empty,
    val appointmentType: Option[CodeableConcept] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
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
  override val thisTypeName: String = "Slot"
}
