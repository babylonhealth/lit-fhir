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
import com.babylonhealth.lit.hl7.{ AUDIT_EVENT_ACTION, AUDIT_EVENT_OUTCOME }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, ukcore }
import com.babylonhealth.lit.macros.POJOBoilerplate

object UKCore_AuditEvent extends CompanionFor[UKCore_AuditEvent] {
  implicit def summonObjectAndCompanionUKCore_AuditEvent_1027970450(
      o: UKCore_AuditEvent): ObjectAndCompanion[UKCore_AuditEvent, UKCore_AuditEvent.type] = ObjectAndCompanion(o, this)
  override type ResourceType = AuditEvent
  override type ParentType   = AuditEvent
  override val baseType: CompanionFor[ResourceType] = AuditEvent
  override val parentType: CompanionFor[ParentType] = AuditEvent
  override val profileUrl: Option[String]           = Some("https://fhir.hl7.org.uk/StructureDefinition/UKCore-AuditEvent")
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-AuditEvent"))),
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
      entity: LitSeq[AuditEvent.Entity] = LitSeq.empty,
      agent: NonEmptyLitSeq[AuditEvent.Agent],
      source: AuditEvent.Source,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): UKCore_AuditEvent = new UKCore_AuditEvent(
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
    entity,
    agent,
    source,
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
  val entity: FHIRComponentFieldMeta[LitSeq[AuditEvent.Entity]] =
    FHIRComponentFieldMeta("entity", lTagOf[LitSeq[AuditEvent.Entity]], false, lTagOf[AuditEvent.Entity])
  val agent: FHIRComponentFieldMeta[NonEmptyLitSeq[AuditEvent.Agent]] =
    FHIRComponentFieldMeta("agent", lTagOf[NonEmptyLitSeq[AuditEvent.Agent]], false, lTagOf[AuditEvent.Agent])
  val source: FHIRComponentFieldMeta[AuditEvent.Source] =
    FHIRComponentFieldMeta("source", lTagOf[AuditEvent.Source], false, lTagOf[AuditEvent.Source])
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
    entity,
    agent,
    source
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
      FHIRComponentField[LitSeq[AuditEvent.Entity]](entity, t.entity),
      FHIRComponentField[NonEmptyLitSeq[AuditEvent.Agent]](agent, t.agent),
      FHIRComponentField[AuditEvent.Source](source, t.source)
    ))
  override def fields(t: UKCore_AuditEvent): Seq[FHIRComponentField[_]]    = fieldsFromParent(t).get
  def extractId(t: UKCore_AuditEvent): Option[String]                      = t.id
  def extractMeta(t: UKCore_AuditEvent): Option[Meta]                      = t.meta
  def extractText(t: UKCore_AuditEvent): Option[Narrative]                 = t.text
  def extractType(t: UKCore_AuditEvent): Coding                            = t.`type`
  def extractAction(t: UKCore_AuditEvent): Option[AUDIT_EVENT_ACTION]      = t.action
  def extractPeriod(t: UKCore_AuditEvent): Option[Period]                  = t.period
  def extractSubtype(t: UKCore_AuditEvent): LitSeq[Coding]                 = t.subtype
  def extractOutcome(t: UKCore_AuditEvent): Option[AUDIT_EVENT_OUTCOME]    = t.outcome
  def extractLanguage(t: UKCore_AuditEvent): Option[LANGUAGES]             = t.language
  def extractRecorded(t: UKCore_AuditEvent): ZonedDateTime                 = t.recorded
  def extractContained(t: UKCore_AuditEvent): LitSeq[Resource]             = t.contained
  def extractExtension(t: UKCore_AuditEvent): LitSeq[Extension]            = t.extension
  def extractOutcomeDesc(t: UKCore_AuditEvent): Option[String]             = t.outcomeDesc
  def extractImplicitRules(t: UKCore_AuditEvent): Option[UriStr]           = t.implicitRules
  def extractPurposeOfEvent(t: UKCore_AuditEvent): LitSeq[CodeableConcept] = t.purposeOfEvent
  def extractModifierExtension(t: UKCore_AuditEvent): LitSeq[Extension]    = t.modifierExtension
  def extractEntity(t: UKCore_AuditEvent): LitSeq[AuditEvent.Entity]       = t.entity
  def extractAgent(t: UKCore_AuditEvent): NonEmptyLitSeq[AuditEvent.Agent] = t.agent
  def extractSource(t: UKCore_AuditEvent): AuditEvent.Source               = t.source
  override val thisName: String                                            = "UKCore_AuditEvent"
  override val searchParams: Map[String, UKCore_AuditEvent => Seq[Any]]    = AuditEvent.searchParams
  def unapply(
      o: UKCore_AuditEvent): Option[(Option[String], Option[Meta], Option[Narrative], Coding, Option[AUDIT_EVENT_ACTION], Option[Period], LitSeq[Coding], Option[AUDIT_EVENT_OUTCOME], Option[LANGUAGES], ZonedDateTime, LitSeq[Resource], LitSeq[Extension], Option[String], Option[UriStr], LitSeq[CodeableConcept], LitSeq[Extension], LitSeq[AuditEvent.Entity], NonEmptyLitSeq[AuditEvent.Agent], AuditEvent.Source)] =
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
        o.entity,
        o.agent,
        o.source))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[UKCore_AuditEvent] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new UKCore_AuditEvent(
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
          cursor.decodeAs[LitSeq[AuditEvent.Entity]]("entity", Some(LitSeq.empty)),
          cursor.decodeAs[NonEmptyLitSeq[AuditEvent.Agent]]("agent", None),
          cursor.decodeAs[AuditEvent.Source]("source", None),
          decodeAttributes(cursor)
        )
      ))
}

/** Defines the UK Core constraints and extensions on the AuditEvent resource for the minimal set of data to query and retrieve
  * information about an event created to maintain a security log.
  *
  * Subclass of [[hl7.model.AuditEvent]] (A record of an event made for purposes of maintaining a security log. Typical uses
  * include detection of intrusion attempts and monitoring for inappropriate usage.)
  *
  * @constructor
  *   Inherits all params from parent.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *     not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *     resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail
  *     to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should
  *     be represented in the narrative to ensure clinical safety.
  * @param `type`
  *   - Identifier for a family of the event. For example, a menu item, program, rule, policy, function code, application name or
  *     URL. It identifies the performed function.
  * @param action
  *   - Indicator for type of action performed during the event that generated the audit.
  * @param period
  *   - The period during which the activity occurred.
  * @param subtype
  *   - Identifier for the category of event.
  * @param outcome
  *   - Indicates whether the event succeeded or failed.
  * @param language
  *   - The base language in which the resource is written.
  * @param recorded
  *   - The time when the event was recorded.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *     identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *     of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *     Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *     of the extension.
  * @param outcomeDesc
  *   - A free text description of the outcome of the event.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *     processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *     other profiles etc.
  * @param purposeOfEvent
  *   - The purposeOfUse (reason) that was used during the event being recorded.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *     the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *     Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *     strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *     extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *     processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of
  *     any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param entity
  *   - Specific instances of data or objects that have been accessed.
  * @param agent
  *   - An actor taking an active role in the event or activity that is logged.
  * @param source
  *   - The system that is reporting the event.
  */
@POJOBoilerplate
class UKCore_AuditEvent(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-AuditEvent"))),
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
    override val entity: LitSeq[AuditEvent.Entity] = LitSeq.empty,
    override val agent: NonEmptyLitSeq[AuditEvent.Agent],
    override val source: AuditEvent.Source,
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
      primitiveAttributes = primitiveAttributes
    ) {
  override val thisTypeName: String = "AuditEvent"
}
