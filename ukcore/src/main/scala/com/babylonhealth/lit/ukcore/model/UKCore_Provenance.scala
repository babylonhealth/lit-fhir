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
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, ukcore }
import com.babylonhealth.lit.macros.POJOBoilerplate

object UKCore_Provenance extends CompanionFor[UKCore_Provenance] {
  implicit def summonObjectAndCompanionUKCore_Provenance1698190608(
      o: UKCore_Provenance): ObjectAndCompanion[UKCore_Provenance, UKCore_Provenance.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Provenance
  override type ParentType   = Provenance
  override val baseType: CompanionFor[ResourceType] = Provenance
  override val parentType: CompanionFor[ParentType] = Provenance
  override val profileUrl: Option[String]           = Some("https://fhir.hl7.org.uk/StructureDefinition/UKCore-Provenance")
  type OccurredChoice = Choice[UnionDateTimeOrPeriod]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-Provenance"))),
      text: Option[Narrative] = None,
      policy: LitSeq[UriStr] = LitSeq.empty,
      reason: LitSeq[CodeableConcept] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      recorded: ZonedDateTime,
      activity: Option[CodeableConcept] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      occurred: Option[UKCore_Provenance.OccurredChoice] = None,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      target: NonEmptyLitSeq[Reference],
      location: Option[Reference] = None,
      agent: NonEmptyLitSeq[Provenance.Agent],
      signature: LitSeq[Signature] = LitSeq.empty,
      entity: LitSeq[Provenance.Entity] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): UKCore_Provenance = new UKCore_Provenance(
    id,
    meta,
    text,
    policy,
    reason,
    language,
    recorded,
    activity,
    contained,
    extension,
    occurred,
    implicitRules,
    modifierExtension,
    target,
    location,
    agent,
    signature,
    entity,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val policy: FHIRComponentFieldMeta[LitSeq[UriStr]] =
    FHIRComponentFieldMeta("policy", lTagOf[LitSeq[UriStr]], false, lTagOf[UriStr])
  val reason: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("reason", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val recorded: FHIRComponentFieldMeta[ZonedDateTime] =
    FHIRComponentFieldMeta("recorded", lTagOf[ZonedDateTime], false, lTagOf[ZonedDateTime])
  val activity: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("activity", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val occurred: FHIRComponentFieldMeta[Option[UKCore_Provenance.OccurredChoice]] =
    FHIRComponentFieldMeta("occurred", lTagOf[Option[UKCore_Provenance.OccurredChoice]], true, lTagOf[UnionDateTimeOrPeriod])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val target: FHIRComponentFieldMeta[NonEmptyLitSeq[Reference]] =
    FHIRComponentFieldMeta("target", lTagOf[NonEmptyLitSeq[Reference]], false, lTagOf[Reference])
  val location: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("location", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val agent: FHIRComponentFieldMeta[NonEmptyLitSeq[Provenance.Agent]] =
    FHIRComponentFieldMeta("agent", lTagOf[NonEmptyLitSeq[Provenance.Agent]], false, lTagOf[Provenance.Agent])
  val signature: FHIRComponentFieldMeta[LitSeq[Signature]] =
    FHIRComponentFieldMeta("signature", lTagOf[LitSeq[Signature]], false, lTagOf[Signature])
  val entity: FHIRComponentFieldMeta[LitSeq[Provenance.Entity]] =
    FHIRComponentFieldMeta("entity", lTagOf[LitSeq[Provenance.Entity]], false, lTagOf[Provenance.Entity])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    policy,
    reason,
    language,
    recorded,
    activity,
    contained,
    extension,
    occurred,
    implicitRules,
    modifierExtension,
    target,
    location,
    agent,
    signature,
    entity
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Meta]](meta, t.meta),
      FHIRComponentField[Option[Narrative]](text, t.text),
      FHIRComponentField[LitSeq[UriStr]](policy, t.policy),
      FHIRComponentField[LitSeq[CodeableConcept]](reason, t.reason),
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[ZonedDateTime](recorded, t.recorded),
      FHIRComponentField[Option[CodeableConcept]](activity, t.activity),
      FHIRComponentField[LitSeq[Resource]](contained, t.contained),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[UKCore_Provenance.OccurredChoice]](occurred, t.occurred),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[NonEmptyLitSeq[Reference]](target, t.target),
      FHIRComponentField[Option[Reference]](location, t.location),
      FHIRComponentField[NonEmptyLitSeq[Provenance.Agent]](agent, t.agent),
      FHIRComponentField[LitSeq[Signature]](signature, t.signature),
      FHIRComponentField[LitSeq[Provenance.Entity]](entity, t.entity)
    ))
  override def fields(t: UKCore_Provenance): Seq[FHIRComponentField[_]]               = fieldsFromParent(t).get
  def extractId(t: UKCore_Provenance): Option[String]                                 = t.id
  def extractMeta(t: UKCore_Provenance): Option[Meta]                                 = t.meta
  def extractText(t: UKCore_Provenance): Option[Narrative]                            = t.text
  def extractPolicy(t: UKCore_Provenance): LitSeq[UriStr]                             = t.policy
  def extractReason(t: UKCore_Provenance): LitSeq[CodeableConcept]                    = t.reason
  def extractLanguage(t: UKCore_Provenance): Option[LANGUAGES]                        = t.language
  def extractRecorded(t: UKCore_Provenance): ZonedDateTime                            = t.recorded
  def extractActivity(t: UKCore_Provenance): Option[CodeableConcept]                  = t.activity
  def extractContained(t: UKCore_Provenance): LitSeq[Resource]                        = t.contained
  def extractExtension(t: UKCore_Provenance): LitSeq[Extension]                       = t.extension
  def extractOccurred(t: UKCore_Provenance): Option[UKCore_Provenance.OccurredChoice] = t.occurred
  def extractImplicitRules(t: UKCore_Provenance): Option[UriStr]                      = t.implicitRules
  def extractModifierExtension(t: UKCore_Provenance): LitSeq[Extension]               = t.modifierExtension
  def extractTarget(t: UKCore_Provenance): NonEmptyLitSeq[Reference]                  = t.target
  def extractLocation(t: UKCore_Provenance): Option[Reference]                        = t.location
  def extractAgent(t: UKCore_Provenance): NonEmptyLitSeq[Provenance.Agent]            = t.agent
  def extractSignature(t: UKCore_Provenance): LitSeq[Signature]                       = t.signature
  def extractEntity(t: UKCore_Provenance): LitSeq[Provenance.Entity]                  = t.entity
  override val thisName: String                                                       = "UKCore_Provenance"
  override val searchParams: Map[String, UKCore_Provenance => Seq[Any]]               = Provenance.searchParams
  def unapply(
      o: UKCore_Provenance): Option[(Option[String], Option[Meta], Option[Narrative], LitSeq[UriStr], LitSeq[CodeableConcept], Option[LANGUAGES], ZonedDateTime, Option[CodeableConcept], LitSeq[Resource], LitSeq[Extension], Option[UKCore_Provenance.OccurredChoice], Option[UriStr], LitSeq[Extension], NonEmptyLitSeq[Reference], Option[Reference], NonEmptyLitSeq[Provenance.Agent], LitSeq[Signature], LitSeq[Provenance.Entity])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.policy,
        o.reason,
        o.language,
        o.recorded,
        o.activity,
        o.contained,
        o.extension,
        o.occurred,
        o.implicitRules,
        o.modifierExtension,
        o.target,
        o.location,
        o.agent,
        o.signature,
        o.entity))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[UKCore_Provenance] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new UKCore_Provenance(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[LitSeq[UriStr]]("policy", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("reason", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[ZonedDateTime]("recorded", None),
          cursor.decodeAs[Option[CodeableConcept]]("activity", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeOptRef[UnionDateTimeOrPeriod]("occurred"),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[NonEmptyLitSeq[Reference]]("target", None),
          cursor.decodeAs[Option[Reference]]("location", Some(None)),
          cursor.decodeAs[NonEmptyLitSeq[Provenance.Agent]]("agent", None),
          cursor.decodeAs[LitSeq[Signature]]("signature", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Provenance.Entity]]("entity", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Defines the UK Core constraints and extensions on the provenance resource for the minimal set of data to query and retrieve
  * generic provenance information.
  *
  * Subclass of [[hl7.model.Provenance]] (Provenance of a resource is a record that describes entities and processes involved in
  * producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing
  * authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can
  * themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms
  * of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion -
  * has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies.)
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
  * @param policy
  *   \- Policy or plan the activity was defined by. Typically, a single activity may have multiple applicable policy documents,
  *   such as patient consent, guarantor funding, etc.
  * @param reason
  *   \- The reason that the activity was taking place.
  * @param language
  *   \- The base language in which the resource is written.
  * @param recorded
  *   \- The instant of time at which the activity was recorded.
  * @param activity
  *   \- An activity is something that occurs over a period of time and acts upon or with entities; it may include consuming,
  *   processing, transforming, modifying, relocating, using, or generating entities.
  * @param contained
  *   \- These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   \- May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param occurred
  *   \- The period during which the activity occurred.
  * @param implicitRules
  *   \- A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param modifierExtension
  *   \- May be used to represent additional information that is not part of the basic definition of the resource and that
  *   modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *   Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *   strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *   extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *   processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any
  *   elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param target
  *   \- The Reference(s) that were generated or updated by the activity described in this resource. A provenance can point to
  *   more than one target if multiple resources were created/updated by the same activity.
  * @param location
  *   \- Where the activity occurred, if relevant.
  * @param agent
  *   \- An actor taking a role in an activity for which it can be assigned some degree of responsibility for the activity taking
  *   place.
  * @param signature
  *   \- A digital signature on the target Reference(s). The signer should match a Provenance.agent. The purpose of the signature
  *   is indicated.
  * @param entity
  *   \- An entity used in this activity.
  */
@POJOBoilerplate
class UKCore_Provenance(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-Provenance"))),
    override val text: Option[Narrative] = None,
    override val policy: LitSeq[UriStr] = LitSeq.empty,
    override val reason: LitSeq[CodeableConcept] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    override val recorded: ZonedDateTime,
    override val activity: Option[CodeableConcept] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val occurred: Option[UKCore_Provenance.OccurredChoice] = None,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val target: NonEmptyLitSeq[Reference],
    override val location: Option[Reference] = None,
    override val agent: NonEmptyLitSeq[Provenance.Agent],
    override val signature: LitSeq[Signature] = LitSeq.empty,
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
      activity = activity,
      contained = contained,
      extension = extension,
      signature = signature,
      occurred = occurred,
      implicitRules = implicitRules,
      modifierExtension = modifierExtension,
      agent = agent,
      entity = entity,
      primitiveAttributes = primitiveAttributes
    ) {
  override val thisTypeName: String = "Provenance"
}
