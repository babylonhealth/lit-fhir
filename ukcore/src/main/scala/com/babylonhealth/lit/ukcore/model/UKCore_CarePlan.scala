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
import com.babylonhealth.lit.hl7.{ CARE_PLAN_INTENT, REQUEST_STATUS }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, ukcore }
import com.babylonhealth.lit.macros.POJOBoilerplate

object UKCore_CarePlan extends CompanionFor[UKCore_CarePlan] {
  implicit def summonObjectAndCompanionUKCore_CarePlan_2133144439(
      o: UKCore_CarePlan): ObjectAndCompanion[UKCore_CarePlan, UKCore_CarePlan.type] = ObjectAndCompanion(o, this)
  override type ResourceType = CarePlan
  override type ParentType   = CarePlan
  override val baseType: CompanionFor[ResourceType] = CarePlan
  override val parentType: CompanionFor[ParentType] = CarePlan
  override val profileUrl: Option[String]           = Some("https://fhir.hl7.org.uk/StructureDefinition/UKCore-CarePlan")
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-CarePlan"))),
      text: Option[Narrative] = None,
      title: Option[String] = None,
      status: REQUEST_STATUS,
      intent: CARE_PLAN_INTENT,
      period: Option[Period] = None,
      created: Option[FHIRDateTime] = None,
      language: Option[LANGUAGES] = None,
      category: LitSeq[CodeableConcept] = LitSeq.empty,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      description: Option[String] = None,
      implicitRules: Option[UriStr] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      instantiatesUri: LitSeq[UriStr] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      instantiatesCanonical: LitSeq[Canonical] = LitSeq.empty,
      goal: LitSeq[Reference] = LitSeq.empty,
      partOf: LitSeq[Reference] = LitSeq.empty,
      author: Option[Reference] = None,
      basedOn: LitSeq[Reference] = LitSeq.empty,
      subject: Reference,
      replaces: LitSeq[Reference] = LitSeq.empty,
      careTeam: LitSeq[Reference] = LitSeq.empty,
      encounter: Option[Reference] = None,
      addresses: LitSeq[Reference] = LitSeq.empty,
      contributor: LitSeq[Reference] = LitSeq.empty,
      supportingInfo: LitSeq[Reference] = LitSeq.empty,
      activity: LitSeq[CarePlan.Activity] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): UKCore_CarePlan = new UKCore_CarePlan(
    id,
    meta,
    text,
    title,
    status,
    intent,
    period,
    created,
    language,
    category,
    contained,
    extension,
    description,
    implicitRules,
    note,
    instantiatesUri,
    modifierExtension,
    identifier,
    instantiatesCanonical,
    goal,
    partOf,
    author,
    basedOn,
    subject,
    replaces,
    careTeam,
    encounter,
    addresses,
    contributor,
    supportingInfo,
    activity,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val title: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("title", lTagOf[Option[String]], false, lTagOf[String])
  val status: FHIRComponentFieldMeta[REQUEST_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[REQUEST_STATUS], false, lTagOf[REQUEST_STATUS])
  val intent: FHIRComponentFieldMeta[CARE_PLAN_INTENT] =
    FHIRComponentFieldMeta("intent", lTagOf[CARE_PLAN_INTENT], false, lTagOf[CARE_PLAN_INTENT])
  val period: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("period", lTagOf[Option[Period]], false, lTagOf[Period])
  val created: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("created", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val category: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("category", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val description: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val instantiatesUri: FHIRComponentFieldMeta[LitSeq[UriStr]] =
    FHIRComponentFieldMeta("instantiatesUri", lTagOf[LitSeq[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val instantiatesCanonical: FHIRComponentFieldMeta[LitSeq[Canonical]] =
    FHIRComponentFieldMeta("instantiatesCanonical", lTagOf[LitSeq[Canonical]], false, lTagOf[Canonical])
  val goal: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("goal", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val partOf: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("partOf", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val author: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("author", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val basedOn: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("basedOn", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val subject: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("subject", lTagOf[Reference], false, lTagOf[Reference])
  val replaces: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("replaces", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val careTeam: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("careTeam", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val encounter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("encounter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val addresses: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("addresses", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val contributor: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("contributor", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val supportingInfo: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("supportingInfo", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val activity: FHIRComponentFieldMeta[LitSeq[CarePlan.Activity]] =
    FHIRComponentFieldMeta("activity", lTagOf[LitSeq[CarePlan.Activity]], false, lTagOf[CarePlan.Activity])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    title,
    status,
    intent,
    period,
    created,
    language,
    category,
    contained,
    extension,
    description,
    implicitRules,
    note,
    instantiatesUri,
    modifierExtension,
    identifier,
    instantiatesCanonical,
    goal,
    partOf,
    author,
    basedOn,
    subject,
    replaces,
    careTeam,
    encounter,
    addresses,
    contributor,
    supportingInfo,
    activity
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Meta]](meta, t.meta),
      FHIRComponentField[Option[Narrative]](text, t.text),
      FHIRComponentField[Option[String]](title, t.title),
      FHIRComponentField[REQUEST_STATUS](status, t.status),
      FHIRComponentField[CARE_PLAN_INTENT](intent, t.intent),
      FHIRComponentField[Option[Period]](period, t.period),
      FHIRComponentField[Option[FHIRDateTime]](created, t.created),
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[LitSeq[CodeableConcept]](category, t.category),
      FHIRComponentField[LitSeq[Resource]](contained, t.contained),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[String]](description, t.description),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[LitSeq[Annotation]](note, t.note),
      FHIRComponentField[LitSeq[UriStr]](instantiatesUri, t.instantiatesUri),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
      FHIRComponentField[LitSeq[Canonical]](instantiatesCanonical, t.instantiatesCanonical),
      FHIRComponentField[LitSeq[Reference]](goal, t.goal),
      FHIRComponentField[LitSeq[Reference]](partOf, t.partOf),
      FHIRComponentField[Option[Reference]](author, t.author),
      FHIRComponentField[LitSeq[Reference]](basedOn, t.basedOn),
      FHIRComponentField[Reference](subject, t.subject),
      FHIRComponentField[LitSeq[Reference]](replaces, t.replaces),
      FHIRComponentField[LitSeq[Reference]](careTeam, t.careTeam),
      FHIRComponentField[Option[Reference]](encounter, t.encounter),
      FHIRComponentField[LitSeq[Reference]](addresses, t.addresses),
      FHIRComponentField[LitSeq[Reference]](contributor, t.contributor),
      FHIRComponentField[LitSeq[Reference]](supportingInfo, t.supportingInfo),
      FHIRComponentField[LitSeq[CarePlan.Activity]](activity, t.activity)
    ))
  override def fields(t: UKCore_CarePlan): Seq[FHIRComponentField[_]]     = fieldsFromParent(t).get
  def extractId(t: UKCore_CarePlan): Option[String]                       = t.id
  def extractMeta(t: UKCore_CarePlan): Option[Meta]                       = t.meta
  def extractText(t: UKCore_CarePlan): Option[Narrative]                  = t.text
  def extractTitle(t: UKCore_CarePlan): Option[String]                    = t.title
  def extractStatus(t: UKCore_CarePlan): REQUEST_STATUS                   = t.status
  def extractIntent(t: UKCore_CarePlan): CARE_PLAN_INTENT                 = t.intent
  def extractPeriod(t: UKCore_CarePlan): Option[Period]                   = t.period
  def extractCreated(t: UKCore_CarePlan): Option[FHIRDateTime]            = t.created
  def extractLanguage(t: UKCore_CarePlan): Option[LANGUAGES]              = t.language
  def extractCategory(t: UKCore_CarePlan): LitSeq[CodeableConcept]        = t.category
  def extractContained(t: UKCore_CarePlan): LitSeq[Resource]              = t.contained
  def extractExtension(t: UKCore_CarePlan): LitSeq[Extension]             = t.extension
  def extractDescription(t: UKCore_CarePlan): Option[String]              = t.description
  def extractImplicitRules(t: UKCore_CarePlan): Option[UriStr]            = t.implicitRules
  def extractNote(t: UKCore_CarePlan): LitSeq[Annotation]                 = t.note
  def extractInstantiatesUri(t: UKCore_CarePlan): LitSeq[UriStr]          = t.instantiatesUri
  def extractModifierExtension(t: UKCore_CarePlan): LitSeq[Extension]     = t.modifierExtension
  def extractIdentifier(t: UKCore_CarePlan): LitSeq[Identifier]           = t.identifier
  def extractInstantiatesCanonical(t: UKCore_CarePlan): LitSeq[Canonical] = t.instantiatesCanonical
  def extractGoal(t: UKCore_CarePlan): LitSeq[Reference]                  = t.goal
  def extractPartOf(t: UKCore_CarePlan): LitSeq[Reference]                = t.partOf
  def extractAuthor(t: UKCore_CarePlan): Option[Reference]                = t.author
  def extractBasedOn(t: UKCore_CarePlan): LitSeq[Reference]               = t.basedOn
  def extractSubject(t: UKCore_CarePlan): Reference                       = t.subject
  def extractReplaces(t: UKCore_CarePlan): LitSeq[Reference]              = t.replaces
  def extractCareTeam(t: UKCore_CarePlan): LitSeq[Reference]              = t.careTeam
  def extractEncounter(t: UKCore_CarePlan): Option[Reference]             = t.encounter
  def extractAddresses(t: UKCore_CarePlan): LitSeq[Reference]             = t.addresses
  def extractContributor(t: UKCore_CarePlan): LitSeq[Reference]           = t.contributor
  def extractSupportingInfo(t: UKCore_CarePlan): LitSeq[Reference]        = t.supportingInfo
  def extractActivity(t: UKCore_CarePlan): LitSeq[CarePlan.Activity]      = t.activity
  override val thisName: String                                           = "UKCore_CarePlan"
  override val searchParams: Map[String, UKCore_CarePlan => Seq[Any]]     = CarePlan.searchParams
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[UKCore_CarePlan] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new UKCore_CarePlan(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[String]]("title", Some(None)),
          cursor.decodeAs[REQUEST_STATUS]("status", None),
          cursor.decodeAs[CARE_PLAN_INTENT]("intent", None),
          cursor.decodeAs[Option[Period]]("period", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("created", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("category", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("description", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[UriStr]]("instantiatesUri", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Canonical]]("instantiatesCanonical", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("goal", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("partOf", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("author", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("basedOn", Some(LitSeq.empty)),
          cursor.decodeAs[Reference]("subject", None),
          cursor.decodeAs[LitSeq[Reference]]("replaces", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("careTeam", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("addresses", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("contributor", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("supportingInfo", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CarePlan.Activity]]("activity", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Defines the UK Core constraints and extensions on the CarePlan resource for the minimal set of data to query and retrieve a
  * patient’s Care Plan.
  *
  * Subclass of [[hl7.model.CarePlan]] (Describes the intention of how one or more practitioners intend to deliver care for a
  * particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of
  * conditions.)
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
  * @param title
  *   - Human-friendly name for the care plan.
  * @param status
  *   - Indicates whether the plan is currently being acted upon, represents future intentions or is now a historical record.
  * @param intent
  *   - Indicates the level of authority/intentionality associated with the care plan and where the care plan fits into the
  *     workflow chain.
  * @param period
  *   - Indicates when the plan did (or is intended to) come into effect and end.
  * @param created
  *   - Represents when this particular CarePlan record was created in the system, which is often a system-generated date.
  * @param language
  *   - The base language in which the resource is written.
  * @param category
  *   - Identifies what "kind" of plan this is to support differentiation between multiple co-existing plans; e.g. "Home health",
  *     "psychiatric", "asthma", "disease management", "wellness plan", etc.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *     identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *     of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *     Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *     of the extension.
  * @param description
  *   - A description of the scope and nature of the plan.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *     processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *     other profiles etc.
  * @param note
  *   - General notes about the care plan not covered elsewhere.
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
  * @param identifier
  *   - Business identifiers assigned to this care plan by the performer or other systems which remain constant as the resource is
  *     updated and propagates from server to server.
  * @param instantiatesCanonical
  *   - The URL pointing to a FHIR-defined protocol, guideline, questionnaire or other definition that is adhered to in whole or
  *     in part by this CarePlan.
  * @param goal
  *   - Describes the intended objective(s) of carrying out the care plan.
  * @param partOf
  *   - A larger care plan of which this particular care plan is a component or step.
  * @param author
  *   - When populated, the author is responsible for the care plan. The care plan is attributed to the author.
  * @param basedOn
  *   - A care plan that is fulfilled in whole or in part by this care plan.
  * @param subject
  *   - Identifies the patient or group whose intended care is described by the plan.
  * @param replaces
  *   - Completed or terminated care plan whose function is taken by this new care plan.
  * @param careTeam
  *   - Identifies all people and organizations who are expected to be involved in the care envisioned by this plan.
  * @param encounter
  *   - The Encounter during which this CarePlan was created or to which the creation of this record is tightly associated.
  * @param addresses
  *   - Identifies the conditions/problems/concerns/diagnoses/etc. whose management and/or mitigation are handled by this plan.
  * @param contributor
  *   - Identifies the individual(s) or organization who provided the contents of the care plan.
  * @param supportingInfo
  *   - Identifies portions of the patient's record that specifically influenced the formation of the plan. These might include
  *     comorbidities, recent procedures, limitations, recent assessments, etc.
  * @param activity
  *   - Identifies a planned action to occur as part of the plan. For example, a medication to be used, lab tests to perform,
  *     self-monitoring, education, etc.
  */
@POJOBoilerplate
class UKCore_CarePlan(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-CarePlan"))),
    override val text: Option[Narrative] = None,
    override val title: Option[String] = None,
    override val status: REQUEST_STATUS,
    override val intent: CARE_PLAN_INTENT,
    override val period: Option[Period] = None,
    override val created: Option[FHIRDateTime] = None,
    override val language: Option[LANGUAGES] = None,
    override val category: LitSeq[CodeableConcept] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val description: Option[String] = None,
    override val implicitRules: Option[UriStr] = None,
    override val note: LitSeq[Annotation] = LitSeq.empty,
    override val instantiatesUri: LitSeq[UriStr] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val instantiatesCanonical: LitSeq[Canonical] = LitSeq.empty,
    override val goal: LitSeq[Reference] = LitSeq.empty,
    override val partOf: LitSeq[Reference] = LitSeq.empty,
    override val author: Option[Reference] = None,
    override val basedOn: LitSeq[Reference] = LitSeq.empty,
    override val subject: Reference,
    override val replaces: LitSeq[Reference] = LitSeq.empty,
    override val careTeam: LitSeq[Reference] = LitSeq.empty,
    override val encounter: Option[Reference] = None,
    override val addresses: LitSeq[Reference] = LitSeq.empty,
    override val contributor: LitSeq[Reference] = LitSeq.empty,
    override val supportingInfo: LitSeq[Reference] = LitSeq.empty,
    override val activity: LitSeq[CarePlan.Activity] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends CarePlan(
      id = id,
      meta = meta,
      text = text,
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
      category = category,
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
      primitiveAttributes = primitiveAttributes
    ) {
  override val thisTypeName: String = "CarePlan"
}
