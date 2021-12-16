package com.babylonhealth.lit.uscore.model

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
import com.babylonhealth.lit.usbase.model._
import com.babylonhealth.lit.core.UnionAliases._
import com.babylonhealth.lit.hl7.UnionAliases._
import com.babylonhealth.lit.usbase.UnionAliases._
import com.babylonhealth.lit.hl7.{ CARE_PLAN_INTENT, REQUEST_STATUS }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, usbase, uscore }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Us_core_careplan extends CompanionFor[Us_core_careplan] {
  implicit def summonObjectAndCompanionUs_core_careplan1804606285(
      o: Us_core_careplan): ObjectAndCompanion[Us_core_careplan, Us_core_careplan.type] = ObjectAndCompanion(o, this)
  override type ResourceType = CarePlan
  override type ParentType   = CarePlan
  override val baseType: CompanionFor[ResourceType] = CarePlan
  override val parentType: CompanionFor[ParentType] = CarePlan
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/us/core/StructureDefinition/us-core-careplan")
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(new Meta(profile = LitSeq("http://hl7.org/fhir/us/core/StructureDefinition/us-core-careplan"))),
      goal: LitSeq[Reference] = LitSeq.empty,
      note: LitSeq[Annotation] = LitSeq.empty,
      title: Option[String] = None,
      partOf: LitSeq[Reference] = LitSeq.empty,
      status: REQUEST_STATUS,
      intent: CARE_PLAN_INTENT,
      period: Option[Period] = None,
      author: Option[Reference] = None,
      basedOn: LitSeq[Reference] = LitSeq.empty,
      subject: Reference,
      created: Option[FHIRDateTime] = None,
      language: Option[LANGUAGES] = None,
      replaces: LitSeq[Reference] = LitSeq.empty,
      category: NonEmptyLitSeq[CodeableConcept],
      careTeam: LitSeq[Reference] = LitSeq.empty,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      encounter: Option[Reference] = None,
      addresses: LitSeq[Reference] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      description: Option[String] = None,
      contributor: LitSeq[Reference] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      text: Narrative,
      supportingInfo: LitSeq[Reference] = LitSeq.empty,
      instantiatesUri: LitSeq[UriStr] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      instantiatesCanonical: LitSeq[Canonical] = LitSeq.empty,
      activity: LitSeq[CarePlan.Activity] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Us_core_careplan = new Us_core_careplan(
    id,
    meta,
    goal,
    note,
    title,
    partOf,
    status,
    intent,
    period,
    author,
    basedOn,
    subject,
    created,
    language,
    replaces,
    category,
    careTeam,
    contained,
    extension,
    encounter,
    addresses,
    identifier,
    description,
    contributor,
    implicitRules,
    text,
    supportingInfo,
    instantiatesUri,
    modifierExtension,
    instantiatesCanonical,
    activity,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val goal: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("goal", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val title: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("title", lTagOf[Option[String]], false, lTagOf[String])
  val partOf: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("partOf", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val status: FHIRComponentFieldMeta[REQUEST_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[REQUEST_STATUS], false, lTagOf[REQUEST_STATUS])
  val intent: FHIRComponentFieldMeta[CARE_PLAN_INTENT] =
    FHIRComponentFieldMeta("intent", lTagOf[CARE_PLAN_INTENT], false, lTagOf[CARE_PLAN_INTENT])
  val period: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("period", lTagOf[Option[Period]], false, lTagOf[Period])
  val author: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("author", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val basedOn: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("basedOn", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val subject: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("subject", lTagOf[Reference], false, lTagOf[Reference])
  val created: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("created", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val replaces: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("replaces", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val category: FHIRComponentFieldMeta[NonEmptyLitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("category", lTagOf[NonEmptyLitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val careTeam: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("careTeam", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val encounter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("encounter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val addresses: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("addresses", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val description: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
  val contributor: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("contributor", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val text: FHIRComponentFieldMeta[Narrative] =
    FHIRComponentFieldMeta("text", lTagOf[Narrative], false, lTagOf[Narrative])
  val supportingInfo: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("supportingInfo", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val instantiatesUri: FHIRComponentFieldMeta[LitSeq[UriStr]] =
    FHIRComponentFieldMeta("instantiatesUri", lTagOf[LitSeq[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val instantiatesCanonical: FHIRComponentFieldMeta[LitSeq[Canonical]] =
    FHIRComponentFieldMeta("instantiatesCanonical", lTagOf[LitSeq[Canonical]], false, lTagOf[Canonical])
  val activity: FHIRComponentFieldMeta[LitSeq[CarePlan.Activity]] =
    FHIRComponentFieldMeta("activity", lTagOf[LitSeq[CarePlan.Activity]], false, lTagOf[CarePlan.Activity])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    goal,
    note,
    title,
    partOf,
    status,
    intent,
    period,
    author,
    basedOn,
    subject,
    created,
    language,
    replaces,
    category,
    careTeam,
    contained,
    extension,
    encounter,
    addresses,
    identifier,
    description,
    contributor,
    implicitRules,
    text,
    supportingInfo,
    instantiatesUri,
    modifierExtension,
    instantiatesCanonical,
    activity
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Meta]](meta, t.meta),
      FHIRComponentField[LitSeq[Reference]](goal, t.goal),
      FHIRComponentField[LitSeq[Annotation]](note, t.note),
      FHIRComponentField[Option[String]](title, t.title),
      FHIRComponentField[LitSeq[Reference]](partOf, t.partOf),
      FHIRComponentField[REQUEST_STATUS](status, t.status),
      FHIRComponentField[CARE_PLAN_INTENT](intent, t.intent),
      FHIRComponentField[Option[Period]](period, t.period),
      FHIRComponentField[Option[Reference]](author, t.author),
      FHIRComponentField[LitSeq[Reference]](basedOn, t.basedOn),
      FHIRComponentField[Reference](subject, t.subject),
      FHIRComponentField[Option[FHIRDateTime]](created, t.created),
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[LitSeq[Reference]](replaces, t.replaces),
      FHIRComponentField[NonEmptyLitSeq[CodeableConcept]](category, t.category.asNonEmpty),
      FHIRComponentField[LitSeq[Reference]](careTeam, t.careTeam),
      FHIRComponentField[LitSeq[Resource]](contained, t.contained),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Reference]](encounter, t.encounter),
      FHIRComponentField[LitSeq[Reference]](addresses, t.addresses),
      FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
      FHIRComponentField[Option[String]](description, t.description),
      FHIRComponentField[LitSeq[Reference]](contributor, t.contributor),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[Narrative](text, t.text.get),
      FHIRComponentField[LitSeq[Reference]](supportingInfo, t.supportingInfo),
      FHIRComponentField[LitSeq[UriStr]](instantiatesUri, t.instantiatesUri),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[Canonical]](instantiatesCanonical, t.instantiatesCanonical),
      FHIRComponentField[LitSeq[CarePlan.Activity]](activity, t.activity)
    ))
  override def fields(t: Us_core_careplan): Seq[FHIRComponentField[_]]      = fieldsFromParent(t).get
  def extractId(t: Us_core_careplan): Option[String]                        = t.id
  def extractMeta(t: Us_core_careplan): Option[Meta]                        = t.meta
  def extractGoal(t: Us_core_careplan): LitSeq[Reference]                   = t.goal
  def extractNote(t: Us_core_careplan): LitSeq[Annotation]                  = t.note
  def extractTitle(t: Us_core_careplan): Option[String]                     = t.title
  def extractPartOf(t: Us_core_careplan): LitSeq[Reference]                 = t.partOf
  def extractStatus(t: Us_core_careplan): REQUEST_STATUS                    = t.status
  def extractIntent(t: Us_core_careplan): CARE_PLAN_INTENT                  = t.intent
  def extractPeriod(t: Us_core_careplan): Option[Period]                    = t.period
  def extractAuthor(t: Us_core_careplan): Option[Reference]                 = t.author
  def extractBasedOn(t: Us_core_careplan): LitSeq[Reference]                = t.basedOn
  def extractSubject(t: Us_core_careplan): Reference                        = t.subject
  def extractCreated(t: Us_core_careplan): Option[FHIRDateTime]             = t.created
  def extractLanguage(t: Us_core_careplan): Option[LANGUAGES]               = t.language
  def extractReplaces(t: Us_core_careplan): LitSeq[Reference]               = t.replaces
  def extractCategory(t: Us_core_careplan): NonEmptyLitSeq[CodeableConcept] = t.category.asNonEmpty
  def extractCareTeam(t: Us_core_careplan): LitSeq[Reference]               = t.careTeam
  def extractContained(t: Us_core_careplan): LitSeq[Resource]               = t.contained
  def extractExtension(t: Us_core_careplan): LitSeq[Extension]              = t.extension
  def extractEncounter(t: Us_core_careplan): Option[Reference]              = t.encounter
  def extractAddresses(t: Us_core_careplan): LitSeq[Reference]              = t.addresses
  def extractIdentifier(t: Us_core_careplan): LitSeq[Identifier]            = t.identifier
  def extractDescription(t: Us_core_careplan): Option[String]               = t.description
  def extractContributor(t: Us_core_careplan): LitSeq[Reference]            = t.contributor
  def extractImplicitRules(t: Us_core_careplan): Option[UriStr]             = t.implicitRules
  def extractText(t: Us_core_careplan): Narrative                           = t.text.get
  def extractSupportingInfo(t: Us_core_careplan): LitSeq[Reference]         = t.supportingInfo
  def extractInstantiatesUri(t: Us_core_careplan): LitSeq[UriStr]           = t.instantiatesUri
  def extractModifierExtension(t: Us_core_careplan): LitSeq[Extension]      = t.modifierExtension
  def extractInstantiatesCanonical(t: Us_core_careplan): LitSeq[Canonical]  = t.instantiatesCanonical
  def extractActivity(t: Us_core_careplan): LitSeq[CarePlan.Activity]       = t.activity
  override val thisName: String                                             = "Us_core_careplan"
  override val searchParams: Map[String, Us_core_careplan => Seq[Any]]      = CarePlan.searchParams
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Us_core_careplan] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Us_core_careplan(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("goal", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("title", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("partOf", Some(LitSeq.empty)),
          cursor.decodeAs[REQUEST_STATUS]("status", None),
          cursor.decodeAs[CARE_PLAN_INTENT]("intent", None),
          cursor.decodeAs[Option[Period]]("period", Some(None)),
          cursor.decodeAs[Option[Reference]]("author", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("basedOn", Some(LitSeq.empty)),
          cursor.decodeAs[Reference]("subject", None),
          cursor.decodeAs[Option[FHIRDateTime]]("created", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("replaces", Some(LitSeq.empty)),
          cursor.decodeAs[NonEmptyLitSeq[CodeableConcept]]("category", None),
          cursor.decodeAs[LitSeq[Reference]]("careTeam", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("addresses", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("description", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("contributor", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Narrative]("text", None),
          cursor.decodeAs[LitSeq[Reference]]("supportingInfo", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[UriStr]]("instantiatesUri", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Canonical]]("instantiatesCanonical", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CarePlan.Activity]]("activity", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Defines constraints and extensions on the CarePlan resource for the minimal set of data to query and retrieve a patient's Care
  * Plan.
  *
  * Subclass of [[hl7.model.CarePlan]] (Describes the intention of how one or more practitioners intend to deliver care for a
  * particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of
  * conditions.)
  *
  * @constructor
  *   Inherits all params from parent. Requires the following fields which were optional in the parent: category, text.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *     not always be associated with version changes to the resource.
  * @param goal
  *   - Describes the intended objective(s) of carrying out the care plan.
  * @param note
  *   - General notes about the care plan not covered elsewhere.
  * @param title
  *   - Human-friendly name for the care plan.
  * @param partOf
  *   - A larger care plan of which this particular care plan is a component or step.
  * @param status
  *   - Indicates whether the plan is currently being acted upon, represents future intentions or is now a historical record.
  * @param intent
  *   - Indicates the level of authority/intentionality associated with the care plan and where the care plan fits into the
  *     workflow chain.
  * @param period
  *   - Indicates when the plan did (or is intended to) come into effect and end.
  * @param author
  *   - When populated, the author is responsible for the care plan. The care plan is attributed to the author.
  * @param basedOn
  *   - A care plan that is fulfilled in whole or in part by this care plan.
  * @param subject
  *   - Who care plan is for.
  * @param created
  *   - Represents when this particular CarePlan record was created in the system, which is often a system-generated date.
  * @param language
  *   - The base language in which the resource is written.
  * @param replaces
  *   - Completed or terminated care plan whose function is taken by this new care plan.
  * @param category
  *   - Type of plan.
  * @param careTeam
  *   - Identifies all people and organizations who are expected to be involved in the care envisioned by this plan.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *     identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *     of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *     Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *     of the extension.
  * @param encounter
  *   - The Encounter during which this CarePlan was created or to which the creation of this record is tightly associated.
  * @param addresses
  *   - Identifies the conditions/problems/concerns/diagnoses/etc. whose management and/or mitigation are handled by this plan.
  * @param identifier
  *   - Business identifiers assigned to this care plan by the performer or other systems which remain constant as the resource is
  *     updated and propagates from server to server.
  * @param description
  *   - A description of the scope and nature of the plan.
  * @param contributor
  *   - Identifies the individual(s) or organization who provided the contents of the care plan.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *     processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *     other profiles etc.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *     resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail
  *     to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should
  *     be represented in the narrative to ensure clinical safety.
  * @param supportingInfo
  *   - Identifies portions of the patient's record that specifically influenced the formation of the plan. These might include
  *     comorbidities, recent procedures, limitations, recent assessments, etc.
  * @param instantiatesUri
  *   - The URL pointing to an externally maintained protocol, guideline, questionnaire or other definition that is adhered to in
  *     whole or in part by this CarePlan.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *     the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *     Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *     strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *     extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *     processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of
  *     any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param instantiatesCanonical
  *   - The URL pointing to a FHIR-defined protocol, guideline, questionnaire or other definition that is adhered to in whole or
  *     in part by this CarePlan.
  * @param activity
  *   - Identifies a planned action to occur as part of the plan. For example, a medication to be used, lab tests to perform,
  *     self-monitoring, education, etc.
  */
@POJOBoilerplate
class Us_core_careplan(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("http://hl7.org/fhir/us/core/StructureDefinition/us-core-careplan"))),
    override val goal: LitSeq[Reference] = LitSeq.empty,
    override val note: LitSeq[Annotation] = LitSeq.empty,
    override val title: Option[String] = None,
    override val partOf: LitSeq[Reference] = LitSeq.empty,
    override val status: REQUEST_STATUS,
    override val intent: CARE_PLAN_INTENT,
    override val period: Option[Period] = None,
    override val author: Option[Reference] = None,
    override val basedOn: LitSeq[Reference] = LitSeq.empty,
    override val subject: Reference,
    override val created: Option[FHIRDateTime] = None,
    override val language: Option[LANGUAGES] = None,
    override val replaces: LitSeq[Reference] = LitSeq.empty,
    category: NonEmptyLitSeq[CodeableConcept],
    override val careTeam: LitSeq[Reference] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val encounter: Option[Reference] = None,
    override val addresses: LitSeq[Reference] = LitSeq.empty,
    override val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val description: Option[String] = None,
    override val contributor: LitSeq[Reference] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    text: Narrative,
    override val supportingInfo: LitSeq[Reference] = LitSeq.empty,
    override val instantiatesUri: LitSeq[UriStr] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val instantiatesCanonical: LitSeq[Canonical] = LitSeq.empty,
    override val activity: LitSeq[CarePlan.Activity] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends CarePlan(
      id = id,
      meta = meta,
      text = Some(text),
      goal = goal,
      note = note,
      title = title,
      partOf = partOf,
      status = status,
      intent = intent,
      period = period,
      author = author,
      basedOn = basedOn,
      subject = subject,
      created = created,
      language = language,
      replaces = replaces,
      category = category.refine,
      careTeam = careTeam,
      contained = contained,
      extension = extension,
      encounter = encounter,
      addresses = addresses,
      identifier = identifier,
      description = description,
      contributor = contributor,
      implicitRules = implicitRules,
      supportingInfo = supportingInfo,
      instantiatesUri = instantiatesUri,
      modifierExtension = modifierExtension,
      instantiatesCanonical = instantiatesCanonical,
      activity = activity,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "CarePlan"
}
