package com.babylonhealth.lit.hl7.model

import java.time.{ LocalDate, LocalTime, ZonedDateTime }
import java.util.UUID

import scala.collection.immutable.TreeMap
import scala.util.Try

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
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Schedule extends CompanionFor[Schedule] {
  override val baseType: CompanionFor[Schedule] = Schedule
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      actor: NonEmptyLitSeq[Reference],
      active: Option[Boolean] = None,
      comment: Option[String] = None,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      specialty: LitSeq[CodeableConcept] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      serviceType: LitSeq[CodeableConcept] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      serviceCategory: LitSeq[CodeableConcept] = LitSeq.empty,
      planningHorizon: Option[Period] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Schedule = new Schedule(
    id,
    meta,
    text,
    actor,
    active,
    comment,
    language,
    contained,
    extension,
    specialty,
    identifier,
    serviceType,
    implicitRules,
    serviceCategory,
    planningHorizon,
    modifierExtension,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val actor: FHIRComponentFieldMeta[NonEmptyLitSeq[Reference]] =
    FHIRComponentFieldMeta("actor", lTagOf[NonEmptyLitSeq[Reference]], false, lTagOf[Reference])
  val active: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("active", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val comment: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("comment", lTagOf[Option[String]], false, lTagOf[String])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val specialty: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("specialty", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val serviceType: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("serviceType", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val serviceCategory: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("serviceCategory", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val planningHorizon: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("planningHorizon", lTagOf[Option[Period]], false, lTagOf[Period])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    actor,
    active,
    comment,
    language,
    contained,
    extension,
    specialty,
    identifier,
    serviceType,
    implicitRules,
    serviceCategory,
    planningHorizon,
    modifierExtension
  )
  override def fields(t: Schedule): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[NonEmptyLitSeq[Reference]](actor, t.actor),
    FHIRComponentField[Option[Boolean]](active, t.active),
    FHIRComponentField[Option[String]](comment, t.comment),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[CodeableConcept]](specialty, t.specialty),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[LitSeq[CodeableConcept]](serviceType, t.serviceType),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[CodeableConcept]](serviceCategory, t.serviceCategory),
    FHIRComponentField[Option[Period]](planningHorizon, t.planningHorizon),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
  )
  def extractId(t: Schedule): Option[String]                       = t.id
  def extractMeta(t: Schedule): Option[Meta]                       = t.meta
  def extractText(t: Schedule): Option[Narrative]                  = t.text
  def extractActor(t: Schedule): NonEmptyLitSeq[Reference]         = t.actor
  def extractActive(t: Schedule): Option[Boolean]                  = t.active
  def extractComment(t: Schedule): Option[String]                  = t.comment
  def extractLanguage(t: Schedule): Option[LANGUAGES]              = t.language
  def extractContained(t: Schedule): LitSeq[Resource]              = t.contained
  def extractExtension(t: Schedule): LitSeq[Extension]             = t.extension
  def extractSpecialty(t: Schedule): LitSeq[CodeableConcept]       = t.specialty
  def extractIdentifier(t: Schedule): LitSeq[Identifier]           = t.identifier
  def extractServiceType(t: Schedule): LitSeq[CodeableConcept]     = t.serviceType
  def extractImplicitRules(t: Schedule): Option[UriStr]            = t.implicitRules
  def extractServiceCategory(t: Schedule): LitSeq[CodeableConcept] = t.serviceCategory
  def extractPlanningHorizon(t: Schedule): Option[Period]          = t.planningHorizon
  def extractModifierExtension(t: Schedule): LitSeq[Extension]     = t.modifierExtension
  override val thisName: String                                    = "Schedule"
  override val searchParams: Map[String, Schedule => Seq[Any]] = Map(
    "actor"            -> (obj => obj.actor.toSeq),
    "identifier"       -> (obj => obj.identifier.toSeq),
    "service-type"     -> (obj => obj.serviceType.toSeq),
    "specialty"        -> (obj => obj.specialty.toSeq),
    "date"             -> (obj => obj.planningHorizon.toSeq),
    "service-category" -> (obj => obj.serviceCategory.toSeq),
    "active"           -> (obj => obj.active.toSeq)
  )
  def unapply(
      o: Schedule): Option[(Option[String], Option[Meta], Option[Narrative], NonEmptyLitSeq[Reference], Option[Boolean], Option[String], Option[LANGUAGES], LitSeq[Resource], LitSeq[Extension], LitSeq[CodeableConcept], LitSeq[Identifier], LitSeq[CodeableConcept], Option[UriStr], LitSeq[CodeableConcept], Option[Period], LitSeq[Extension])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.actor,
        o.active,
        o.comment,
        o.language,
        o.contained,
        o.extension,
        o.specialty,
        o.identifier,
        o.serviceType,
        o.implicitRules,
        o.serviceCategory,
        o.planningHorizon,
        o.modifierExtension))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Schedule] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Schedule(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[NonEmptyLitSeq[Reference]]("actor", None),
          cursor.decodeAs[Option[Boolean]]("active", Some(None)),
          cursor.decodeAs[Option[String]]("comment", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("specialty", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("serviceType", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("serviceCategory", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Period]]("planningHorizon", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** A container for slots of time that may be available for booking appointments.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields actor, active, comment, specialty, identifier, serviceType, serviceCategory, planningHorizon.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param actor - Slots that reference this schedule resource provide the availability details to these referenced resource(s).
  * @param active - Whether this schedule record is in active use or should not be used (such as was entered in error).
  * @param comment - Comments on the availability to describe any extended information. Such as custom constraints on the slots that may be associated.
  * @param language - The base language in which the resource is written.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param specialty - The specialty of a practitioner that would be required to perform the service requested in this appointment.
  * @param identifier - External Ids for this item.
  * @param serviceType - The specific service that is to be performed during this appointment.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param serviceCategory - A broad categorization of the service that is to be performed during this appointment.
  * @param planningHorizon - The period of time that the slots that reference this Schedule resource cover (even if none exist). These  cover the amount of time that an organization's planning horizon; the interval for which they are currently accepting appointments. This does not define a "template" for planning outside these dates.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  */
@POJOBoilerplate
class Schedule(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val actor: NonEmptyLitSeq[Reference],
    val active: Option[Boolean] = None,
    val comment: Option[String] = None,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val specialty: LitSeq[CodeableConcept] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val serviceType: LitSeq[CodeableConcept] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    val serviceCategory: LitSeq[CodeableConcept] = LitSeq.empty,
    val planningHorizon: Option[Period] = None,
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
  override val thisTypeName: String = "Schedule"
}
