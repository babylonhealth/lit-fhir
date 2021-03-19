package com.babylonhealth.lit.usbase.model

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
import com.babylonhealth.lit.usbase.UnionAliases._
import com.babylonhealth.lit.hl7.{ AUDIT_EVENT_ACTION, AUDIT_EVENT_OUTCOME }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Ehrsrle_auditevent extends CompanionFor[Ehrsrle_auditevent] {
  override type ResourceType = AuditEvent
  override val baseType: CompanionFor[ResourceType] = AuditEvent
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/ehrsrle-auditevent")
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(
        new Meta(profile = LitSeq("http://hl7.org/fhir/StructureDefinition/ehrsrle-auditevent"))),
      text: Option[Narrative] = None,
      `type`: Coding,
      action: Option[AUDIT_EVENT_ACTION] = None,
      period: Option[Period] = None,
      subtype: LitSeq[Coding] = LitSeq.empty,
      outcome: Option[AUDIT_EVENT_OUTCOME] = None,
      language: Option[LANGUAGES] = None,
      recorded: ZonedDateTime,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      outcomeDesc: Option[String] = None,
      implicitRules: Option[UriStr] = None,
      purposeOfEvent: LitSeq[CodeableConcept] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      source: AuditEvent.Source,
      agent: NonEmptyLitSeq[AuditEvent.Agent],
      entity: LitSeq[AuditEvent.Entity] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Ehrsrle_auditevent = new Ehrsrle_auditevent(
    id,
    meta,
    text,
    `type`,
    action,
    period,
    subtype,
    outcome,
    language,
    recorded,
    contained,
    extension,
    outcomeDesc,
    implicitRules,
    purposeOfEvent,
    modifierExtension,
    source,
    agent,
    entity,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val `type`: FHIRComponentFieldMeta[Coding] =
    FHIRComponentFieldMeta("type", lTagOf[Coding], false, lTagOf[Coding])
  val action: FHIRComponentFieldMeta[Option[AUDIT_EVENT_ACTION]] =
    FHIRComponentFieldMeta("action", lTagOf[Option[AUDIT_EVENT_ACTION]], false, lTagOf[AUDIT_EVENT_ACTION])
  val period: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("period", lTagOf[Option[Period]], false, lTagOf[Period])
  val subtype: FHIRComponentFieldMeta[LitSeq[Coding]] =
    FHIRComponentFieldMeta("subtype", lTagOf[LitSeq[Coding]], false, lTagOf[Coding])
  val outcome: FHIRComponentFieldMeta[Option[AUDIT_EVENT_OUTCOME]] =
    FHIRComponentFieldMeta("outcome", lTagOf[Option[AUDIT_EVENT_OUTCOME]], false, lTagOf[AUDIT_EVENT_OUTCOME])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val recorded: FHIRComponentFieldMeta[ZonedDateTime] =
    FHIRComponentFieldMeta("recorded", lTagOf[ZonedDateTime], false, lTagOf[ZonedDateTime])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val outcomeDesc: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("outcomeDesc", lTagOf[Option[String]], false, lTagOf[String])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val purposeOfEvent: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("purposeOfEvent", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val source: FHIRComponentFieldMeta[AuditEvent.Source] =
    FHIRComponentFieldMeta("source", lTagOf[AuditEvent.Source], false, lTagOf[AuditEvent.Source])
  val agent: FHIRComponentFieldMeta[NonEmptyLitSeq[AuditEvent.Agent]] =
    FHIRComponentFieldMeta("agent", lTagOf[NonEmptyLitSeq[AuditEvent.Agent]], false, lTagOf[AuditEvent.Agent])
  val entity: FHIRComponentFieldMeta[LitSeq[AuditEvent.Entity]] =
    FHIRComponentFieldMeta("entity", lTagOf[LitSeq[AuditEvent.Entity]], false, lTagOf[AuditEvent.Entity])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    `type`,
    action,
    period,
    subtype,
    outcome,
    language,
    recorded,
    contained,
    extension,
    outcomeDesc,
    implicitRules,
    purposeOfEvent,
    modifierExtension,
    source,
    agent,
    entity
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Meta]](meta, t.meta),
      FHIRComponentField[Option[Narrative]](text, t.text),
      FHIRComponentField[Coding](`type`, t.`type`),
      FHIRComponentField[Option[AUDIT_EVENT_ACTION]](action, t.action),
      FHIRComponentField[Option[Period]](period, t.period),
      FHIRComponentField[LitSeq[Coding]](subtype, t.subtype),
      FHIRComponentField[Option[AUDIT_EVENT_OUTCOME]](outcome, t.outcome),
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[ZonedDateTime](recorded, t.recorded),
      FHIRComponentField[LitSeq[Resource]](contained, t.contained),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[String]](outcomeDesc, t.outcomeDesc),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[LitSeq[CodeableConcept]](purposeOfEvent, t.purposeOfEvent),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[AuditEvent.Source](source, t.source),
      FHIRComponentField[NonEmptyLitSeq[AuditEvent.Agent]](agent, t.agent),
      FHIRComponentField[LitSeq[AuditEvent.Entity]](entity, t.entity)
    ))
  override def fields(t: Ehrsrle_auditevent): Seq[FHIRComponentField[_]]    = fieldsFromParent(t).get
  def extractId(t: Ehrsrle_auditevent): Option[String]                      = t.id
  def extractMeta(t: Ehrsrle_auditevent): Option[Meta]                      = t.meta
  def extractText(t: Ehrsrle_auditevent): Option[Narrative]                 = t.text
  def extractType(t: Ehrsrle_auditevent): Coding                            = t.`type`
  def extractAction(t: Ehrsrle_auditevent): Option[AUDIT_EVENT_ACTION]      = t.action
  def extractPeriod(t: Ehrsrle_auditevent): Option[Period]                  = t.period
  def extractSubtype(t: Ehrsrle_auditevent): LitSeq[Coding]                 = t.subtype
  def extractOutcome(t: Ehrsrle_auditevent): Option[AUDIT_EVENT_OUTCOME]    = t.outcome
  def extractLanguage(t: Ehrsrle_auditevent): Option[LANGUAGES]             = t.language
  def extractRecorded(t: Ehrsrle_auditevent): ZonedDateTime                 = t.recorded
  def extractContained(t: Ehrsrle_auditevent): LitSeq[Resource]             = t.contained
  def extractExtension(t: Ehrsrle_auditevent): LitSeq[Extension]            = t.extension
  def extractOutcomeDesc(t: Ehrsrle_auditevent): Option[String]             = t.outcomeDesc
  def extractImplicitRules(t: Ehrsrle_auditevent): Option[UriStr]           = t.implicitRules
  def extractPurposeOfEvent(t: Ehrsrle_auditevent): LitSeq[CodeableConcept] = t.purposeOfEvent
  def extractModifierExtension(t: Ehrsrle_auditevent): LitSeq[Extension]    = t.modifierExtension
  def extractSource(t: Ehrsrle_auditevent): AuditEvent.Source               = t.source
  def extractAgent(t: Ehrsrle_auditevent): NonEmptyLitSeq[AuditEvent.Agent] = t.agent
  def extractEntity(t: Ehrsrle_auditevent): LitSeq[AuditEvent.Entity]       = t.entity
  override val thisName: String                                             = "Ehrsrle_auditevent"
  override val searchParams: Map[String, Ehrsrle_auditevent => Seq[Any]]    = AuditEvent.searchParams
  def unapply(
      o: Ehrsrle_auditevent): Option[(Option[String], Option[Meta], Option[Narrative], Coding, Option[AUDIT_EVENT_ACTION], Option[Period], LitSeq[Coding], Option[AUDIT_EVENT_OUTCOME], Option[LANGUAGES], ZonedDateTime, LitSeq[Resource], LitSeq[Extension], Option[String], Option[UriStr], LitSeq[CodeableConcept], LitSeq[Extension], AuditEvent.Source, NonEmptyLitSeq[AuditEvent.Agent], LitSeq[AuditEvent.Entity])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.`type`,
        o.action,
        o.period,
        o.subtype,
        o.outcome,
        o.language,
        o.recorded,
        o.contained,
        o.extension,
        o.outcomeDesc,
        o.implicitRules,
        o.purposeOfEvent,
        o.modifierExtension,
        o.source,
        o.agent,
        o.entity))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Ehrsrle_auditevent] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Ehrsrle_auditevent(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Coding]("type", None),
          cursor.decodeAs[Option[AUDIT_EVENT_ACTION]]("action", Some(None)),
          cursor.decodeAs[Option[Period]]("period", Some(None)),
          cursor.decodeAs[LitSeq[Coding]]("subtype", Some(LitSeq.empty)),
          cursor.decodeAs[Option[AUDIT_EVENT_OUTCOME]]("outcome", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[ZonedDateTime]("recorded", None),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("outcomeDesc", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("purposeOfEvent", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[AuditEvent.Source]("source", None),
          cursor.decodeAs[NonEmptyLitSeq[AuditEvent.Agent]]("agent", None),
          cursor.decodeAs[LitSeq[AuditEvent.Entity]]("entity", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Defines the elements to be supported within the AuditEvent resource in order to conform with the Electronic Health Record System Functional Model Record Lifecycle Event standard
  *
  *  Subclass of [[hl7.model.AuditEvent]] (A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.)
  *
  * @constructor Inherits all params from parent.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param `type` - Identifier for a family of the event.  For example, a menu item, program, rule, policy, function code, application name or URL. It identifies the performed function.
  * @param action - Indicator for type of action performed during the event that generated the audit.
  * @param period - The period during which the activity occurred.
  * @param subtype - Identifier for the category of event.
  * @param outcome - Indicates whether the event succeeded or failed.
  * @param language - The base language in which the resource is written.
  * @param recorded - The time when the event was recorded.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param outcomeDesc - A free text description of the outcome of the event.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param purposeOfEvent - The purposeOfUse (reason) that was used during the event being recorded.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param source - The system that is reporting the event.
  * @param agent - An actor taking an active role in the event or activity that is logged.
  * @param entity - Specific instances of data or objects that have been accessed.
  */
@POJOBoilerplate
class Ehrsrle_auditevent(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("http://hl7.org/fhir/StructureDefinition/ehrsrle-auditevent"))),
    override val text: Option[Narrative] = None,
    override val `type`: Coding,
    override val action: Option[AUDIT_EVENT_ACTION] = None,
    override val period: Option[Period] = None,
    override val subtype: LitSeq[Coding] = LitSeq.empty,
    override val outcome: Option[AUDIT_EVENT_OUTCOME] = None,
    override val language: Option[LANGUAGES] = None,
    override val recorded: ZonedDateTime,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val outcomeDesc: Option[String] = None,
    override val implicitRules: Option[UriStr] = None,
    override val purposeOfEvent: LitSeq[CodeableConcept] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val source: AuditEvent.Source,
    override val agent: NonEmptyLitSeq[AuditEvent.Agent],
    override val entity: LitSeq[AuditEvent.Entity] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends AuditEvent(
      id = id,
      meta = meta,
      text = text,
      `type` = `type`,
      action = action,
      period = period,
      subtype = subtype,
      outcome = outcome,
      language = language,
      recorded = recorded,
      contained = contained,
      extension = extension,
      outcomeDesc = outcomeDesc,
      implicitRules = implicitRules,
      purposeOfEvent = purposeOfEvent,
      modifierExtension = modifierExtension,
      source = source,
      agent = agent,
      entity = entity,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "AuditEvent"
}
