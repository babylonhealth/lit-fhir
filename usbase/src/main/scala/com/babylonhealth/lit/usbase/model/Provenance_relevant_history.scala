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
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Provenance_relevant_history extends CompanionFor[Provenance_relevant_history] {
  implicit def summonObjectAndCompanionProvenance_relevant_history_2017284453(
      o: Provenance_relevant_history): ObjectAndCompanion[Provenance_relevant_history, Provenance_relevant_history.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Provenance
  override type ParentType   = Provenance
  override val baseType: CompanionFor[ResourceType] = Provenance
  override val parentType: CompanionFor[ParentType] = Provenance
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/provenance-relevant-history")
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(
        new Meta(profile = LitSeq("http://hl7.org/fhir/StructureDefinition/provenance-relevant-history"))),
      text: Option[Narrative] = None,
      target: NonEmptyLitSeq[Reference],
      policy: LitSeq[UriStr] = LitSeq.empty,
      reason: LitSeq[CodeableConcept] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      recorded: ZonedDateTime,
      location: Option[Reference] = None,
      activity: CodeableConcept,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      signature: LitSeq[Signature] = LitSeq.empty,
      occurred: FHIRDateTime,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      agent: NonEmptyLitSeq[Provenance.Agent],
      entity: LitSeq[Provenance.Entity] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Provenance_relevant_history = new Provenance_relevant_history(
    id,
    meta,
    text,
    target,
    policy,
    reason,
    language,
    recorded,
    location,
    activity,
    contained,
    extension,
    signature,
    occurred,
    implicitRules,
    modifierExtension,
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
  val target: FHIRComponentFieldMeta[NonEmptyLitSeq[Reference]] =
    FHIRComponentFieldMeta("target", lTagOf[NonEmptyLitSeq[Reference]], false, lTagOf[Reference])
  val policy: FHIRComponentFieldMeta[LitSeq[UriStr]] =
    FHIRComponentFieldMeta("policy", lTagOf[LitSeq[UriStr]], false, lTagOf[UriStr])
  val reason: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("reason", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val recorded: FHIRComponentFieldMeta[ZonedDateTime] =
    FHIRComponentFieldMeta("recorded", lTagOf[ZonedDateTime], false, lTagOf[ZonedDateTime])
  val location: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("location", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val activity: FHIRComponentFieldMeta[CodeableConcept] =
    FHIRComponentFieldMeta("activity", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val signature: FHIRComponentFieldMeta[LitSeq[Signature]] =
    FHIRComponentFieldMeta("signature", lTagOf[LitSeq[Signature]], false, lTagOf[Signature])
  val occurred: FHIRComponentFieldMeta[FHIRDateTime] =
    FHIRComponentFieldMeta("occurred", lTagOf[FHIRDateTime], true, lTagOf[FHIRDateTime])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val agent: FHIRComponentFieldMeta[NonEmptyLitSeq[Provenance.Agent]] =
    FHIRComponentFieldMeta("agent", lTagOf[NonEmptyLitSeq[Provenance.Agent]], false, lTagOf[Provenance.Agent])
  val entity: FHIRComponentFieldMeta[LitSeq[Provenance.Entity]] =
    FHIRComponentFieldMeta("entity", lTagOf[LitSeq[Provenance.Entity]], false, lTagOf[Provenance.Entity])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    target,
    policy,
    reason,
    language,
    recorded,
    location,
    activity,
    contained,
    extension,
    signature,
    occurred,
    implicitRules,
    modifierExtension,
    agent,
    entity
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Meta]](meta, t.meta),
      FHIRComponentField[Option[Narrative]](text, t.text),
      FHIRComponentField[NonEmptyLitSeq[Reference]](target, t.target),
      FHIRComponentField[LitSeq[UriStr]](policy, t.policy),
      FHIRComponentField[LitSeq[CodeableConcept]](reason, t.reason),
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[ZonedDateTime](recorded, t.recorded),
      FHIRComponentField[Option[Reference]](location, t.location),
      FHIRComponentField[CodeableConcept](activity, t.activity.get),
      FHIRComponentField[LitSeq[Resource]](contained, t.contained),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Signature]](signature, t.signature),
      FHIRComponentField[FHIRDateTime](occurred, t.occurred.get.toSubRefNonUnion[FHIRDateTime]),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[NonEmptyLitSeq[Provenance.Agent]](agent, t.agent),
      FHIRComponentField[LitSeq[Provenance.Entity]](entity, t.entity)
    ))
  override def fields(t: Provenance_relevant_history): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Provenance_relevant_history): Option[String]                   = t.id
  def extractMeta(t: Provenance_relevant_history): Option[Meta]                   = t.meta
  def extractText(t: Provenance_relevant_history): Option[Narrative]              = t.text
  def extractTarget(t: Provenance_relevant_history): NonEmptyLitSeq[Reference]    = t.target
  def extractPolicy(t: Provenance_relevant_history): LitSeq[UriStr]               = t.policy
  def extractReason(t: Provenance_relevant_history): LitSeq[CodeableConcept]      = t.reason
  def extractLanguage(t: Provenance_relevant_history): Option[LANGUAGES]          = t.language
  def extractRecorded(t: Provenance_relevant_history): ZonedDateTime              = t.recorded
  def extractLocation(t: Provenance_relevant_history): Option[Reference]          = t.location
  def extractActivity(t: Provenance_relevant_history): CodeableConcept            = t.activity.get
  def extractContained(t: Provenance_relevant_history): LitSeq[Resource]          = t.contained
  def extractExtension(t: Provenance_relevant_history): LitSeq[Extension]         = t.extension
  def extractSignature(t: Provenance_relevant_history): LitSeq[Signature]         = t.signature
  def extractOccurred(t: Provenance_relevant_history): FHIRDateTime               = t.occurred.get.toSubRefNonUnion[FHIRDateTime]
  def extractImplicitRules(t: Provenance_relevant_history): Option[UriStr]        = t.implicitRules
  def extractModifierExtension(t: Provenance_relevant_history): LitSeq[Extension] = t.modifierExtension
  def extractAgent(t: Provenance_relevant_history): NonEmptyLitSeq[Provenance.Agent] = t.agent
  def extractEntity(t: Provenance_relevant_history): LitSeq[Provenance.Entity]       = t.entity
  override val thisName: String                                                      = "Provenance_relevant_history"
  override val searchParams: Map[String, Provenance_relevant_history => Seq[Any]]    = Provenance.searchParams
  def unapply(
      o: Provenance_relevant_history): Option[(Option[String], Option[Meta], Option[Narrative], NonEmptyLitSeq[Reference], LitSeq[UriStr], LitSeq[CodeableConcept], Option[LANGUAGES], ZonedDateTime, Option[Reference], CodeableConcept, LitSeq[Resource], LitSeq[Extension], LitSeq[Signature], FHIRDateTime, Option[UriStr], LitSeq[Extension], NonEmptyLitSeq[Provenance.Agent], LitSeq[Provenance.Entity])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.target,
        o.policy,
        o.reason,
        o.language,
        o.recorded,
        o.location,
        o.activity.get,
        o.contained,
        o.extension,
        o.signature,
        o.occurred.get.toSubRefNonUnion[FHIRDateTime],
        o.implicitRules,
        o.modifierExtension,
        o.agent,
        o.entity))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Provenance_relevant_history] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Provenance_relevant_history(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[NonEmptyLitSeq[Reference]]("target", None),
          cursor.decodeAs[LitSeq[UriStr]]("policy", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("reason", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[ZonedDateTime]("recorded", None),
          cursor.decodeAs[Option[Reference]]("location", Some(None)),
          cursor.decodeAs[CodeableConcept]("activity", None),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Signature]]("signature", Some(LitSeq.empty)),
          cursor.decodeAs[FHIRDateTime]("occurredDateTime", None),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[NonEmptyLitSeq[Provenance.Agent]]("agent", None),
          cursor.decodeAs[LitSeq[Provenance.Entity]]("entity", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Guidance on using Provenance for related history elements
  *
  * Subclass of [[hl7.model.Provenance]] (Provenance of a resource is a record that describes entities and processes involved in
  * producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing
  * authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can
  * themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms
  * of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion -
  * has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies.)
  *
  * @constructor
  *   Inherits all params from parent. Refines the types of: occurred. Requires the following fields which were optional in the
  *   parent: activity, occurred.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *   not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *   resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to
  *   make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be
  *   represented in the narrative to ensure clinical safety.
  * @param target
  *   - This points to the version of the resource that was created as a result of this historical record action. Typically only a
  *   single resource will be referenced, but if the same action is performed to multiple resources in the context of a
  *   transaction, some systems may link multiple resource instances.
  * @param policy
  *   - Policy or plan the activity was defined by. Typically, a single activity may have multiple applicable policy documents,
  *   such as patient consent, guarantor funding, etc.
  * @param reason
  *   - The reason that the activity was taking place.
  * @param language
  *   - The base language in which the resource is written.
  * @param recorded
  *   - The instant of time at which the activity was recorded.
  * @param location
  *   - Where the activity occurred, if relevant.
  * @param activity
  *   - Indicates what action occurred to the referenced resource.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param signature
  *   - A digital signature on the target Reference(s). The signer should match a Provenance.agent. The purpose of the signature
  *   is indicated.
  * @param occurred
  *   - This indicates the time the resource action (creation, revision, deletion, etc.) occurred.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *   the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually
  *   modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict
  *   set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param agent
  *   - Who was involved with change.
  * @param entity
  *   - An entity used in this activity.
  */
@POJOBoilerplate
class Provenance_relevant_history(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("http://hl7.org/fhir/StructureDefinition/provenance-relevant-history"))),
    override val text: Option[Narrative] = None,
    override val target: NonEmptyLitSeq[Reference],
    override val policy: LitSeq[UriStr] = LitSeq.empty,
    override val reason: LitSeq[CodeableConcept] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    override val recorded: ZonedDateTime,
    override val location: Option[Reference] = None,
    activity: CodeableConcept,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val signature: LitSeq[Signature] = LitSeq.empty,
    occurred: FHIRDateTime,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val agent: NonEmptyLitSeq[Provenance.Agent],
    override val entity: LitSeq[Provenance.Entity] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Provenance(
      id = id,
      meta = meta,
      text = text,
      target = target,
      policy = policy,
      reason = reason,
      language = language,
      recorded = recorded,
      location = location,
      activity = Some(activity),
      contained = contained,
      extension = extension,
      signature = signature,
      occurred = Some(new Choice("DateTime", occurred)(UnionDateTimeOrPeriodTag)),
      implicitRules = implicitRules,
      modifierExtension = modifierExtension,
      agent = agent,
      entity = entity,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Provenance"
}
