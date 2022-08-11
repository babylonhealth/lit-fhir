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
import com.babylonhealth.lit.hl7.GOAL_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Goal extends CompanionFor[Goal] {
  implicit def summonObjectAndCompanionGoal_2065826680(o: Goal): ObjectAndCompanion[Goal, Goal.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Goal
  override type ParentType   = Goal
  override val baseType: CompanionFor[ResourceType] = Goal
  override val parentType: CompanionFor[ParentType] = Goal
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Goal")
  object Target extends CompanionFor[Target] {
    implicit def summonObjectAndCompanionTarget4449894(o: Target): ObjectAndCompanion[Target, Target.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Target
    override type ParentType   = Target
    override val parentType: CompanionFor[ResourceType] = Target
    type DueChoice    = Choice[UnionDurationOrDate]
    type DetailChoice = Choice[Union_1061953715]
    def apply(
        id: Option[String] = None,
        due: Option[Target.DueChoice] = None,
        measure: Option[CodeableConcept] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        detail: Option[Target.DetailChoice] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Target = new Target(
      id,
      due,
      measure,
      extension,
      detail,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Target): Option[(Option[String], Option[Target.DueChoice], Option[CodeableConcept], LitSeq[Extension], Option[Target.DetailChoice], LitSeq[Extension])] =
      Some((o.id, o.due, o.measure, o.extension, o.detail, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val due: FHIRComponentFieldMeta[Option[Target.DueChoice]] =
      FHIRComponentFieldMeta("due", lTagOf[Option[Target.DueChoice]], true, lTagOf[UnionDurationOrDate])
    val measure: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("measure", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val detail: FHIRComponentFieldMeta[Option[Target.DetailChoice]] =
      FHIRComponentFieldMeta("detail", lTagOf[Option[Target.DetailChoice]], true, lTagOf[Union_1061953715])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, due, measure, extension, detail, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Target): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Target.DueChoice]](due, t.due),
      FHIRComponentField[Option[CodeableConcept]](measure, t.measure),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Target.DetailChoice]](detail, t.detail),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Target] = this
    val thisName: String               = "Target"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Target] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Target(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeOptRef[UnionDurationOrDate]("due"),
            cursor.decodeAs[Option[CodeableConcept]]("measure", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeOptRef[Union_1061953715]("detail"),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Target(
      override val id: Option[String] = None,
      val due: Option[Target.DueChoice] = None,
      val measure: Option[CodeableConcept] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val detail: Option[Target.DetailChoice] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  type StartChoice = Choice[UnionCodeableConceptOrDate]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      subject: Reference,
      language: Option[LANGUAGES] = None,
      category: LitSeq[CodeableConcept] = LitSeq.empty,
      priority: Option[CodeableConcept] = None,
      start: Option[Goal.StartChoice] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      addresses: LitSeq[Reference] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      statusDate: Option[FHIRDate] = None,
      description: CodeableConcept,
      expressedBy: Option[Reference] = None,
      outcomeCode: LitSeq[CodeableConcept] = LitSeq.empty,
      statusReason: Option[String] = None,
      implicitRules: Option[UriStr] = None,
      lifecycleStatus: GOAL_STATUS,
      outcomeReference: LitSeq[Reference] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      achievementStatus: Option[CodeableConcept] = None,
      target: LitSeq[Goal.Target] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Goal = new Goal(
    id,
    meta,
    text,
    note,
    subject,
    language,
    category,
    priority,
    start,
    contained,
    extension,
    addresses,
    identifier,
    statusDate,
    description,
    expressedBy,
    outcomeCode,
    statusReason,
    implicitRules,
    lifecycleStatus,
    outcomeReference,
    modifierExtension,
    achievementStatus,
    target,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val subject: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("subject", lTagOf[Reference], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val category: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("category", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val priority: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("priority", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val start: FHIRComponentFieldMeta[Option[Goal.StartChoice]] =
    FHIRComponentFieldMeta("start", lTagOf[Option[Goal.StartChoice]], true, lTagOf[UnionCodeableConceptOrDate])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val addresses: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("addresses", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val statusDate: FHIRComponentFieldMeta[Option[FHIRDate]] =
    FHIRComponentFieldMeta("statusDate", lTagOf[Option[FHIRDate]], false, lTagOf[FHIRDate])
  val description: FHIRComponentFieldMeta[CodeableConcept] =
    FHIRComponentFieldMeta("description", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
  val expressedBy: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("expressedBy", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val outcomeCode: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("outcomeCode", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val statusReason: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("statusReason", lTagOf[Option[String]], false, lTagOf[String])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val lifecycleStatus: FHIRComponentFieldMeta[GOAL_STATUS] =
    FHIRComponentFieldMeta("lifecycleStatus", lTagOf[GOAL_STATUS], false, lTagOf[GOAL_STATUS])
  val outcomeReference: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("outcomeReference", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val achievementStatus: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("achievementStatus", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val target: FHIRComponentFieldMeta[LitSeq[Goal.Target]] =
    FHIRComponentFieldMeta("target", lTagOf[LitSeq[Goal.Target]], false, lTagOf[Goal.Target])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    note,
    subject,
    language,
    category,
    priority,
    start,
    contained,
    extension,
    addresses,
    identifier,
    statusDate,
    description,
    expressedBy,
    outcomeCode,
    statusReason,
    implicitRules,
    lifecycleStatus,
    outcomeReference,
    modifierExtension,
    achievementStatus,
    target
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Goal): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[LitSeq[Annotation]](note, t.note),
    FHIRComponentField[Reference](subject, t.subject),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[CodeableConcept]](category, t.category),
    FHIRComponentField[Option[CodeableConcept]](priority, t.priority),
    FHIRComponentField[Option[Goal.StartChoice]](start, t.start),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[Reference]](addresses, t.addresses),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[FHIRDate]](statusDate, t.statusDate),
    FHIRComponentField[CodeableConcept](description, t.description),
    FHIRComponentField[Option[Reference]](expressedBy, t.expressedBy),
    FHIRComponentField[LitSeq[CodeableConcept]](outcomeCode, t.outcomeCode),
    FHIRComponentField[Option[String]](statusReason, t.statusReason),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[GOAL_STATUS](lifecycleStatus, t.lifecycleStatus),
    FHIRComponentField[LitSeq[Reference]](outcomeReference, t.outcomeReference),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Option[CodeableConcept]](achievementStatus, t.achievementStatus),
    FHIRComponentField[LitSeq[Goal.Target]](target, t.target)
  )
  def extractId(t: Goal): Option[String]                         = t.id
  def extractMeta(t: Goal): Option[Meta]                         = t.meta
  def extractText(t: Goal): Option[Narrative]                    = t.text
  def extractNote(t: Goal): LitSeq[Annotation]                   = t.note
  def extractSubject(t: Goal): Reference                         = t.subject
  def extractLanguage(t: Goal): Option[LANGUAGES]                = t.language
  def extractCategory(t: Goal): LitSeq[CodeableConcept]          = t.category
  def extractPriority(t: Goal): Option[CodeableConcept]          = t.priority
  def extractStart(t: Goal): Option[Goal.StartChoice]            = t.start
  def extractContained(t: Goal): LitSeq[Resource]                = t.contained
  def extractExtension(t: Goal): LitSeq[Extension]               = t.extension
  def extractAddresses(t: Goal): LitSeq[Reference]               = t.addresses
  def extractIdentifier(t: Goal): LitSeq[Identifier]             = t.identifier
  def extractStatusDate(t: Goal): Option[FHIRDate]               = t.statusDate
  def extractDescription(t: Goal): CodeableConcept               = t.description
  def extractExpressedBy(t: Goal): Option[Reference]             = t.expressedBy
  def extractOutcomeCode(t: Goal): LitSeq[CodeableConcept]       = t.outcomeCode
  def extractStatusReason(t: Goal): Option[String]               = t.statusReason
  def extractImplicitRules(t: Goal): Option[UriStr]              = t.implicitRules
  def extractLifecycleStatus(t: Goal): GOAL_STATUS               = t.lifecycleStatus
  def extractOutcomeReference(t: Goal): LitSeq[Reference]        = t.outcomeReference
  def extractModifierExtension(t: Goal): LitSeq[Extension]       = t.modifierExtension
  def extractAchievementStatus(t: Goal): Option[CodeableConcept] = t.achievementStatus
  def extractTarget(t: Goal): LitSeq[Goal.Target]                = t.target
  override val thisName: String                                  = "Goal"
  override val searchParams: Map[String, Goal => Seq[Any]] = Map(
    "identifier"         -> (obj => obj.identifier.toSeq),
    "target-date"        -> (obj => obj.target.flatMap(_.due).flatMap(_.as[FHIRDate]).toSeq),
    "lifecycle-status"   -> (obj => Seq(obj.lifecycleStatus)),
    "start-date"         -> (obj => obj.start.flatMap(_.as[FHIRDate]).toSeq),
    "category"           -> (obj => obj.category.toSeq),
    "patient"            -> (obj => obj.subject.seqIf(_.reference.exists(_.contains("Patient/"))).toSeq),
    "subject"            -> (obj => Seq(obj.subject)),
    "achievement-status" -> (obj => obj.achievementStatus.toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Goal] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Goal(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[Reference]("subject", None),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("category", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("priority", Some(None)),
          cursor.decodeOptRef[UnionCodeableConceptOrDate]("start"),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("addresses", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[FHIRDate]]("statusDate", Some(None)),
          cursor.decodeAs[CodeableConcept]("description", None),
          cursor.decodeAs[Option[Reference]]("expressedBy", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("outcomeCode", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("statusReason", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[GOAL_STATUS]("lifecycleStatus", None),
          cursor.decodeAs[LitSeq[Reference]]("outcomeReference", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("achievementStatus", Some(None)),
          cursor.decodeAs[LitSeq[Goal.Target]]("target", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity
  * of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields note, subject, category, priority, start, addresses, identifier, statusDate, description, expressedBy,
  *   outcomeCode, statusReason, lifecycleStatus, outcomeReference, achievementStatus, target.
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
  * @param note
  *   - Any comments related to the goal.
  * @param subject
  *   - Identifies the patient, group or organization for whom the goal is being established.
  * @param language
  *   - The base language in which the resource is written.
  * @param category
  *   - Indicates a category the goal falls within.
  * @param priority
  *   - Identifies the mutually agreed level of importance associated with reaching/sustaining the goal.
  * @param start
  *   - The date or event after which the goal should begin being pursued.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *     identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *     of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *     Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *     of the extension.
  * @param addresses
  *   - The identified conditions and other health record elements that are intended to be addressed by the goal.
  * @param identifier
  *   - Business identifiers assigned to this goal by the performer or other systems which remain constant as the resource is
  *     updated and propagates from server to server.
  * @param statusDate
  *   - Identifies when the current status. I.e. When initially created, when achieved, when cancelled, etc.
  * @param description
  *   - Human-readable and/or coded description of a specific desired objective of care, such as "control blood pressure" or
  *     "negotiate an obstacle course" or "dance with child at wedding".
  * @param expressedBy
  *   - Indicates whose goal this is - patient goal, practitioner goal, etc.
  * @param outcomeCode
  *   - Identifies the change (or lack of change) at the point when the status of the goal is assessed.
  * @param statusReason
  *   - Captures the reason for the current status.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *     processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *     other profiles etc.
  * @param lifecycleStatus
  *   - The state of the goal throughout its lifecycle.
  * @param outcomeReference
  *   - Details of what's changed (or not changed).
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *     the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *     Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *     strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *     extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *     processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of
  *     any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param achievementStatus
  *   - Describes the progression, or lack thereof, towards the goal against the target.
  * @param target
  *   - Indicates what should be done by when.
  */
@POJOBoilerplate
class Goal(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val note: LitSeq[Annotation] = LitSeq.empty,
    val subject: Reference,
    override val language: Option[LANGUAGES] = None,
    val category: LitSeq[CodeableConcept] = LitSeq.empty,
    val priority: Option[CodeableConcept] = None,
    val start: Option[Goal.StartChoice] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val addresses: LitSeq[Reference] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val statusDate: Option[FHIRDate] = None,
    val description: CodeableConcept,
    val expressedBy: Option[Reference] = None,
    val outcomeCode: LitSeq[CodeableConcept] = LitSeq.empty,
    val statusReason: Option[String] = None,
    override val implicitRules: Option[UriStr] = None,
    val lifecycleStatus: GOAL_STATUS,
    val outcomeReference: LitSeq[Reference] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val achievementStatus: Option[CodeableConcept] = None,
    val target: LitSeq[Goal.Target] = LitSeq.empty,
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
      primitiveAttributes = primitiveAttributes
    ) {
  override val thisTypeName: String = "Goal"
}
