package com.babylonhealth.lit.uscore.model

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
import com.babylonhealth.lit.usbase.model._
import com.babylonhealth.lit.core.UnionAliases._
import com.babylonhealth.lit.hl7.UnionAliases._
import com.babylonhealth.lit.usbase.UnionAliases._
import com.babylonhealth.lit.hl7.GOAL_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, usbase, uscore }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Us_core_goal extends CompanionFor[Us_core_goal] {
  override val baseType: CompanionFor[Goal] = Goal
  override val profileUrl: Option[String]   = Some("http://hl7.org/fhir/us/core/StructureDefinition/us-core-goal")
  type StartChoice = Choice[Union00078348305]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(
        new Meta(profile = LitSeq("http://hl7.org/fhir/us/core/StructureDefinition/us-core-goal"))),
      text: Option[Narrative] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      subject: Reference,
      language: Option[LANGUAGES] = None,
      category: LitSeq[CodeableConcept] = LitSeq.empty,
      priority: Option[CodeableConcept] = None,
      start: Option[Us_core_goal.StartChoice] = None,
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
  ): Us_core_goal = new Us_core_goal(
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
  val start: FHIRComponentFieldMeta[Option[Us_core_goal.StartChoice]] =
    FHIRComponentFieldMeta("start", lTagOf[Option[Us_core_goal.StartChoice]], true, lTagOf[Union00078348305])
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
  override def fields(t: Us_core_goal): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[LitSeq[Annotation]](note, t.note),
    FHIRComponentField[Reference](subject, t.subject),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[CodeableConcept]](category, t.category),
    FHIRComponentField[Option[CodeableConcept]](priority, t.priority),
    FHIRComponentField[Option[Us_core_goal.StartChoice]](start, t.start),
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
  def extractId(t: Us_core_goal): Option[String]                         = t.id
  def extractMeta(t: Us_core_goal): Option[Meta]                         = t.meta
  def extractText(t: Us_core_goal): Option[Narrative]                    = t.text
  def extractNote(t: Us_core_goal): LitSeq[Annotation]                   = t.note
  def extractSubject(t: Us_core_goal): Reference                         = t.subject
  def extractLanguage(t: Us_core_goal): Option[LANGUAGES]                = t.language
  def extractCategory(t: Us_core_goal): LitSeq[CodeableConcept]          = t.category
  def extractPriority(t: Us_core_goal): Option[CodeableConcept]          = t.priority
  def extractStart(t: Us_core_goal): Option[Us_core_goal.StartChoice]    = t.start
  def extractContained(t: Us_core_goal): LitSeq[Resource]                = t.contained
  def extractExtension(t: Us_core_goal): LitSeq[Extension]               = t.extension
  def extractAddresses(t: Us_core_goal): LitSeq[Reference]               = t.addresses
  def extractIdentifier(t: Us_core_goal): LitSeq[Identifier]             = t.identifier
  def extractStatusDate(t: Us_core_goal): Option[FHIRDate]               = t.statusDate
  def extractDescription(t: Us_core_goal): CodeableConcept               = t.description
  def extractExpressedBy(t: Us_core_goal): Option[Reference]             = t.expressedBy
  def extractOutcomeCode(t: Us_core_goal): LitSeq[CodeableConcept]       = t.outcomeCode
  def extractStatusReason(t: Us_core_goal): Option[String]               = t.statusReason
  def extractImplicitRules(t: Us_core_goal): Option[UriStr]              = t.implicitRules
  def extractLifecycleStatus(t: Us_core_goal): GOAL_STATUS               = t.lifecycleStatus
  def extractOutcomeReference(t: Us_core_goal): LitSeq[Reference]        = t.outcomeReference
  def extractModifierExtension(t: Us_core_goal): LitSeq[Extension]       = t.modifierExtension
  def extractAchievementStatus(t: Us_core_goal): Option[CodeableConcept] = t.achievementStatus
  def extractTarget(t: Us_core_goal): LitSeq[Goal.Target]                = t.target
  override val thisName: String                                          = "Us_core_goal"
  override val searchParams: Map[String, Us_core_goal => Seq[Any]]       = Goal.searchParams
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Us_core_goal] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Us_core_goal(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[Reference]("subject", None),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("category", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("priority", Some(None)),
          cursor.decodeOptRef[Union00078348305]("start"),
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

/** Defines constraints and extensions on the Goal resource for the minimal set of data to query and retrieve a patient's goal(s).
  *
  *  Subclass of [[hl7.model.Goal]] (Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.)
  *
  * @constructor Inherits all params from parent.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param note - Any comments related to the goal.
  * @param subject - Who care plan is for.
  * @param language - The base language in which the resource is written.
  * @param category - Indicates a category the goal falls within.
  * @param priority - Identifies the mutually agreed level of importance associated with reaching/sustaining the goal.
  * @param start - The date or event after which the goal should begin being pursued.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param addresses - The identified conditions and other health record elements that are intended to be addressed by the goal.
  * @param identifier - Business identifiers assigned to this goal by the performer or other systems which remain constant as the resource is updated and propagates from server to server.
  * @param statusDate - Identifies when the current status.  I.e. When initially created, when achieved, when cancelled, etc.
  * @param description - proposed | draft | active | completed | cancelled.
  * @param expressedBy - Indicates whose goal this is - patient goal, practitioner goal, etc.
  * @param outcomeCode - Identifies the change (or lack of change) at the point when the status of the goal is assessed.
  * @param statusReason - Captures the reason for the current status.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param lifecycleStatus - Type of plan.
  * @param outcomeReference - Details of what's changed (or not changed).
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param achievementStatus - Describes the progression, or lack thereof, towards the goal against the target.
  * @param target - Indicates what should be done by when.
  */
@POJOBoilerplate
class Us_core_goal(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("http://hl7.org/fhir/us/core/StructureDefinition/us-core-goal"))),
    override val text: Option[Narrative] = None,
    override val note: LitSeq[Annotation] = LitSeq.empty,
    override val subject: Reference,
    override val language: Option[LANGUAGES] = None,
    override val category: LitSeq[CodeableConcept] = LitSeq.empty,
    override val priority: Option[CodeableConcept] = None,
    override val start: Option[Us_core_goal.StartChoice] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val addresses: LitSeq[Reference] = LitSeq.empty,
    override val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val statusDate: Option[FHIRDate] = None,
    override val description: CodeableConcept,
    override val expressedBy: Option[Reference] = None,
    override val outcomeCode: LitSeq[CodeableConcept] = LitSeq.empty,
    override val statusReason: Option[String] = None,
    override val implicitRules: Option[UriStr] = None,
    override val lifecycleStatus: GOAL_STATUS,
    override val outcomeReference: LitSeq[Reference] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val achievementStatus: Option[CodeableConcept] = None,
    override val target: LitSeq[Goal.Target] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Goal(
      id = id,
      meta = meta,
      text = text,
      note = note,
      subject = subject,
      language = language,
      category = category,
      priority = priority,
      start = start,
      contained = contained,
      extension = extension,
      addresses = addresses,
      identifier = identifier,
      statusDate = statusDate,
      description = description,
      expressedBy = expressedBy,
      outcomeCode = outcomeCode,
      statusReason = statusReason,
      implicitRules = implicitRules,
      lifecycleStatus = lifecycleStatus,
      outcomeReference = outcomeReference,
      modifierExtension = modifierExtension,
      achievementStatus = achievementStatus,
      target = target,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Goal"
}
