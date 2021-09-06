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
import com.babylonhealth.lit.hl7.PUBLICATION_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Computableplandefinition extends CompanionFor[Computableplandefinition] {
  implicit def summonObjectAndCompanionComputableplandefinition_400640935(
      o: Computableplandefinition): ObjectAndCompanion[Computableplandefinition, Computableplandefinition.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = PlanDefinition
  override type ParentType   = PlanDefinition
  override val baseType: CompanionFor[ResourceType] = PlanDefinition
  override val parentType: CompanionFor[ParentType] = PlanDefinition
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/computableplandefinition")
  type SubjectChoice = Choice[UnionCodeableConceptOrReference]
  def apply(
      id: Option[String] = None,
      url: Option[UriStr] = None,
      meta: Option[Meta] = Some(new Meta(profile = LitSeq("http://hl7.org/fhir/StructureDefinition/computableplandefinition"))),
      text: Option[Narrative] = None,
      name: Option[String] = None,
      `type`: Option[CodeableConcept] = None,
      date: Option[FHIRDateTime] = None,
      title: Option[String] = None,
      usage: Option[String] = None,
      topic: LitSeq[CodeableConcept] = LitSeq.empty,
      status: PUBLICATION_STATUS,
      author: LitSeq[ContactDetail] = LitSeq.empty,
      editor: LitSeq[ContactDetail] = LitSeq.empty,
      version: Option[String] = None,
      contact: LitSeq[ContactDetail] = LitSeq.empty,
      purpose: Option[Markdown] = None,
      library: Canonical,
      language: Option[LANGUAGES] = None,
      subtitle: Option[String] = None,
      reviewer: LitSeq[ContactDetail] = LitSeq.empty,
      endorser: LitSeq[ContactDetail] = LitSeq.empty,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      publisher: Option[String] = None,
      copyright: Option[Markdown] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      subject: Option[Computableplandefinition.SubjectChoice] = None,
      useContext: LitSeq[UsageContext] = LitSeq.empty,
      description: Option[Markdown] = None,
      experimental: Option[Boolean] = None,
      jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
      approvalDate: Option[FHIRDate] = None,
      implicitRules: Option[UriStr] = None,
      lastReviewDate: Option[FHIRDate] = None,
      effectivePeriod: Option[Period] = None,
      relatedArtifact: LitSeq[RelatedArtifact] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      goal: LitSeq[PlanDefinition.Goal] = LitSeq.empty,
      action: LitSeq[PlanDefinition.Action] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Computableplandefinition = new Computableplandefinition(
    id,
    url,
    meta,
    text,
    name,
    `type`,
    date,
    title,
    usage,
    topic,
    status,
    author,
    editor,
    version,
    contact,
    purpose,
    library,
    language,
    subtitle,
    reviewer,
    endorser,
    contained,
    extension,
    publisher,
    copyright,
    identifier,
    subject,
    useContext,
    description,
    experimental,
    jurisdiction,
    approvalDate,
    implicitRules,
    lastReviewDate,
    effectivePeriod,
    relatedArtifact,
    modifierExtension,
    goal,
    action,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val url: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("url", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val name: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("name", lTagOf[Option[String]], false, lTagOf[String])
  val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val date: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("date", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val title: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("title", lTagOf[Option[String]], false, lTagOf[String])
  val usage: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("usage", lTagOf[Option[String]], false, lTagOf[String])
  val topic: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("topic", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val status: FHIRComponentFieldMeta[PUBLICATION_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[PUBLICATION_STATUS], false, lTagOf[PUBLICATION_STATUS])
  val author: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("author", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val editor: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("editor", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val version: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("version", lTagOf[Option[String]], false, lTagOf[String])
  val contact: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("contact", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val purpose: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("purpose", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val library: FHIRComponentFieldMeta[Canonical] =
    FHIRComponentFieldMeta("library", lTagOf[Canonical], false, lTagOf[Canonical])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val subtitle: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("subtitle", lTagOf[Option[String]], false, lTagOf[String])
  val reviewer: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("reviewer", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val endorser: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("endorser", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val publisher: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("publisher", lTagOf[Option[String]], false, lTagOf[String])
  val copyright: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("copyright", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val subject: FHIRComponentFieldMeta[Option[Computableplandefinition.SubjectChoice]] =
    FHIRComponentFieldMeta(
      "subject",
      lTagOf[Option[Computableplandefinition.SubjectChoice]],
      true,
      lTagOf[UnionCodeableConceptOrReference])
  val useContext: FHIRComponentFieldMeta[LitSeq[UsageContext]] =
    FHIRComponentFieldMeta("useContext", lTagOf[LitSeq[UsageContext]], false, lTagOf[UsageContext])
  val description: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("description", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val experimental: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("experimental", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val jurisdiction: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("jurisdiction", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val approvalDate: FHIRComponentFieldMeta[Option[FHIRDate]] =
    FHIRComponentFieldMeta("approvalDate", lTagOf[Option[FHIRDate]], false, lTagOf[FHIRDate])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val lastReviewDate: FHIRComponentFieldMeta[Option[FHIRDate]] =
    FHIRComponentFieldMeta("lastReviewDate", lTagOf[Option[FHIRDate]], false, lTagOf[FHIRDate])
  val effectivePeriod: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("effectivePeriod", lTagOf[Option[Period]], false, lTagOf[Period])
  val relatedArtifact: FHIRComponentFieldMeta[LitSeq[RelatedArtifact]] =
    FHIRComponentFieldMeta("relatedArtifact", lTagOf[LitSeq[RelatedArtifact]], false, lTagOf[RelatedArtifact])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val goal: FHIRComponentFieldMeta[LitSeq[PlanDefinition.Goal]] =
    FHIRComponentFieldMeta("goal", lTagOf[LitSeq[PlanDefinition.Goal]], false, lTagOf[PlanDefinition.Goal])
  val action: FHIRComponentFieldMeta[LitSeq[PlanDefinition.Action]] =
    FHIRComponentFieldMeta("action", lTagOf[LitSeq[PlanDefinition.Action]], false, lTagOf[PlanDefinition.Action])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    url,
    meta,
    text,
    name,
    `type`,
    date,
    title,
    usage,
    topic,
    status,
    author,
    editor,
    version,
    contact,
    purpose,
    library,
    language,
    subtitle,
    reviewer,
    endorser,
    contained,
    extension,
    publisher,
    copyright,
    identifier,
    subject,
    useContext,
    description,
    experimental,
    jurisdiction,
    approvalDate,
    implicitRules,
    lastReviewDate,
    effectivePeriod,
    relatedArtifact,
    modifierExtension,
    goal,
    action
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[UriStr]](url, t.url),
      FHIRComponentField[Option[Meta]](meta, t.meta),
      FHIRComponentField[Option[Narrative]](text, t.text),
      FHIRComponentField[Option[String]](name, t.name),
      FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[Option[FHIRDateTime]](date, t.date),
      FHIRComponentField[Option[String]](title, t.title),
      FHIRComponentField[Option[String]](usage, t.usage),
      FHIRComponentField[LitSeq[CodeableConcept]](topic, t.topic),
      FHIRComponentField[PUBLICATION_STATUS](status, t.status),
      FHIRComponentField[LitSeq[ContactDetail]](author, t.author),
      FHIRComponentField[LitSeq[ContactDetail]](editor, t.editor),
      FHIRComponentField[Option[String]](version, t.version),
      FHIRComponentField[LitSeq[ContactDetail]](contact, t.contact),
      FHIRComponentField[Option[Markdown]](purpose, t.purpose),
      FHIRComponentField[Canonical](library, t.library.head),
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[Option[String]](subtitle, t.subtitle),
      FHIRComponentField[LitSeq[ContactDetail]](reviewer, t.reviewer),
      FHIRComponentField[LitSeq[ContactDetail]](endorser, t.endorser),
      FHIRComponentField[LitSeq[Resource]](contained, t.contained),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[String]](publisher, t.publisher),
      FHIRComponentField[Option[Markdown]](copyright, t.copyright),
      FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
      FHIRComponentField[Option[Computableplandefinition.SubjectChoice]](subject, t.subject),
      FHIRComponentField[LitSeq[UsageContext]](useContext, t.useContext),
      FHIRComponentField[Option[Markdown]](description, t.description),
      FHIRComponentField[Option[Boolean]](experimental, t.experimental),
      FHIRComponentField[LitSeq[CodeableConcept]](jurisdiction, t.jurisdiction),
      FHIRComponentField[Option[FHIRDate]](approvalDate, t.approvalDate),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[Option[FHIRDate]](lastReviewDate, t.lastReviewDate),
      FHIRComponentField[Option[Period]](effectivePeriod, t.effectivePeriod),
      FHIRComponentField[LitSeq[RelatedArtifact]](relatedArtifact, t.relatedArtifact),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[PlanDefinition.Goal]](goal, t.goal),
      FHIRComponentField[LitSeq[PlanDefinition.Action]](action, t.action)
    ))
  override def fields(t: Computableplandefinition): Seq[FHIRComponentField[_]]                    = fieldsFromParent(t).get
  def extractId(t: Computableplandefinition): Option[String]                                      = t.id
  def extractUrl(t: Computableplandefinition): Option[UriStr]                                     = t.url
  def extractMeta(t: Computableplandefinition): Option[Meta]                                      = t.meta
  def extractText(t: Computableplandefinition): Option[Narrative]                                 = t.text
  def extractName(t: Computableplandefinition): Option[String]                                    = t.name
  def extractType(t: Computableplandefinition): Option[CodeableConcept]                           = t.`type`
  def extractDate(t: Computableplandefinition): Option[FHIRDateTime]                              = t.date
  def extractTitle(t: Computableplandefinition): Option[String]                                   = t.title
  def extractUsage(t: Computableplandefinition): Option[String]                                   = t.usage
  def extractTopic(t: Computableplandefinition): LitSeq[CodeableConcept]                          = t.topic
  def extractStatus(t: Computableplandefinition): PUBLICATION_STATUS                              = t.status
  def extractAuthor(t: Computableplandefinition): LitSeq[ContactDetail]                           = t.author
  def extractEditor(t: Computableplandefinition): LitSeq[ContactDetail]                           = t.editor
  def extractVersion(t: Computableplandefinition): Option[String]                                 = t.version
  def extractContact(t: Computableplandefinition): LitSeq[ContactDetail]                          = t.contact
  def extractPurpose(t: Computableplandefinition): Option[Markdown]                               = t.purpose
  def extractLibrary(t: Computableplandefinition): Canonical                                      = t.library.head
  def extractLanguage(t: Computableplandefinition): Option[LANGUAGES]                             = t.language
  def extractSubtitle(t: Computableplandefinition): Option[String]                                = t.subtitle
  def extractReviewer(t: Computableplandefinition): LitSeq[ContactDetail]                         = t.reviewer
  def extractEndorser(t: Computableplandefinition): LitSeq[ContactDetail]                         = t.endorser
  def extractContained(t: Computableplandefinition): LitSeq[Resource]                             = t.contained
  def extractExtension(t: Computableplandefinition): LitSeq[Extension]                            = t.extension
  def extractPublisher(t: Computableplandefinition): Option[String]                               = t.publisher
  def extractCopyright(t: Computableplandefinition): Option[Markdown]                             = t.copyright
  def extractIdentifier(t: Computableplandefinition): LitSeq[Identifier]                          = t.identifier
  def extractSubject(t: Computableplandefinition): Option[Computableplandefinition.SubjectChoice] = t.subject
  def extractUseContext(t: Computableplandefinition): LitSeq[UsageContext]                        = t.useContext
  def extractDescription(t: Computableplandefinition): Option[Markdown]                           = t.description
  def extractExperimental(t: Computableplandefinition): Option[Boolean]                           = t.experimental
  def extractJurisdiction(t: Computableplandefinition): LitSeq[CodeableConcept]                   = t.jurisdiction
  def extractApprovalDate(t: Computableplandefinition): Option[FHIRDate]                          = t.approvalDate
  def extractImplicitRules(t: Computableplandefinition): Option[UriStr]                           = t.implicitRules
  def extractLastReviewDate(t: Computableplandefinition): Option[FHIRDate]                        = t.lastReviewDate
  def extractEffectivePeriod(t: Computableplandefinition): Option[Period]                         = t.effectivePeriod
  def extractRelatedArtifact(t: Computableplandefinition): LitSeq[RelatedArtifact]                = t.relatedArtifact
  def extractModifierExtension(t: Computableplandefinition): LitSeq[Extension]                    = t.modifierExtension
  def extractGoal(t: Computableplandefinition): LitSeq[PlanDefinition.Goal]                       = t.goal
  def extractAction(t: Computableplandefinition): LitSeq[PlanDefinition.Action]                   = t.action
  override val thisName: String                                                                   = "Computableplandefinition"
  override val searchParams: Map[String, Computableplandefinition => Seq[Any]]                    = PlanDefinition.searchParams
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Computableplandefinition] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Computableplandefinition(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[UriStr]]("url", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[String]]("name", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("date", Some(None)),
          cursor.decodeAs[Option[String]]("title", Some(None)),
          cursor.decodeAs[Option[String]]("usage", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("topic", Some(LitSeq.empty)),
          cursor.decodeAs[PUBLICATION_STATUS]("status", None),
          cursor.decodeAs[LitSeq[ContactDetail]]("author", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[ContactDetail]]("editor", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("version", Some(None)),
          cursor.decodeAs[LitSeq[ContactDetail]]("contact", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Markdown]]("purpose", Some(None)),
          cursor.decodeFromListAs[Canonical]("library", None),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[String]]("subtitle", Some(None)),
          cursor.decodeAs[LitSeq[ContactDetail]]("reviewer", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[ContactDetail]]("endorser", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("publisher", Some(None)),
          cursor.decodeAs[Option[Markdown]]("copyright", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeOptRef[UnionCodeableConceptOrReference]("subject"),
          cursor.decodeAs[LitSeq[UsageContext]]("useContext", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Markdown]]("description", Some(None)),
          cursor.decodeAs[Option[Boolean]]("experimental", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("jurisdiction", Some(LitSeq.empty)),
          cursor.decodeAs[Option[FHIRDate]]("approvalDate", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[FHIRDate]]("lastReviewDate", Some(None)),
          cursor.decodeAs[Option[Period]]("effectivePeriod", Some(None)),
          cursor.decodeAs[LitSeq[RelatedArtifact]]("relatedArtifact", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[PlanDefinition.Goal]]("goal", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[PlanDefinition.Action]]("action", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Defines a computable PlanDefinition that specifies a single library and requires all expressions referenced from the
  * PlanDefinition to be definitions in that single library
  *
  * Subclass of [[hl7.model.PlanDefinition]] (This resource allows for the definition of various types of plans as a sharable,
  * consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical
  * artifacts such as clinical decision support rules, order sets and protocols.)
  *
  * @constructor
  *   Inherits all params from parent. Requires the following fields which were optional in the parent: library.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param url
  *   - An absolute URI that is used to identify this plan definition when it is referenced in a specification, model, design or
  *   an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which
  *   at which an authoritative instance of this plan definition is (or will be) published. This URL can be the target of a
  *   canonical reference. It SHALL remain the same when the plan definition is stored on different servers.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *   not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *   resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to
  *   make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be
  *   represented in the narrative to ensure clinical safety.
  * @param name
  *   - A natural language name identifying the plan definition. This name should be usable as an identifier for the module by
  *   machine processing applications such as code generation.
  * @param `type`
  *   - A high-level category for the plan definition that distinguishes the kinds of systems that would be interested in the plan
  *   definition.
  * @param date
  *   - The date (and optionally time) when the plan definition was published. The date must change when the business version
  *   changes and it must change if the status code changes. In addition, it should change when the substantive content of the
  *   plan definition changes.
  * @param title
  *   - A short, descriptive, user-friendly title for the plan definition.
  * @param usage
  *   - A detailed description of how the plan definition is used from a clinical perspective.
  * @param topic
  *   - Descriptive topics related to the content of the plan definition. Topics provide a high-level categorization of the
  *   definition that can be useful for filtering and searching.
  * @param status
  *   - The status of this plan definition. Enables tracking the life-cycle of the content.
  * @param author
  *   - An individiual or organization primarily involved in the creation and maintenance of the content.
  * @param editor
  *   - An individual or organization primarily responsible for internal coherence of the content.
  * @param version
  *   - The identifier that is used to identify this version of the plan definition when it is referenced in a specification,
  *   model, design or instance. This is an arbitrary value managed by the plan definition author and is not expected to be
  *   globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also
  *   no expectation that versions can be placed in a lexicographical sequence. To provide a version consistent with the Decision
  *   Support Service specification, use the format Major.Minor.Revision (e.g. 1.0.0). For more information on versioning
  *   knowledge assets, refer to the Decision Support Service specification. Note that a version is required for non-experimental
  *   active artifacts.
  * @param contact
  *   - Contact details to assist a user in finding and communicating with the publisher.
  * @param purpose
  *   - Explanation of why this plan definition is needed and why it has been designed as it has.
  * @param library
  *   - A reference to a Library resource containing any formal logic used by the plan definition.
  * @param language
  *   - The base language in which the resource is written.
  * @param subtitle
  *   - An explanatory or alternate title for the plan definition giving additional information about its content.
  * @param reviewer
  *   - An individual or organization primarily responsible for review of some aspect of the content.
  * @param endorser
  *   - An individual or organization responsible for officially endorsing the content for use in some setting.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param publisher
  *   - The name of the organization or individual that published the plan definition.
  * @param copyright
  *   - A copyright statement relating to the plan definition and/or its contents. Copyright statements are generally legal
  *   restrictions on the use and publishing of the plan definition.
  * @param identifier
  *   - A formal identifier that is used to identify this plan definition when it is represented in other formats, or referenced
  *   in a specification, model, design or an instance.
  * @param subject
  *   - A code or group definition that describes the intended subject of the plan definition.
  * @param useContext
  *   - The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be
  *   general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be
  *   used to assist with indexing and searching for appropriate plan definition instances.
  * @param description
  *   - A free text natural language description of the plan definition from a consumer's perspective.
  * @param experimental
  *   - A Boolean value to indicate that this plan definition is authored for testing purposes (or education/evaluation/marketing)
  *   and is not intended to be used for genuine usage.
  * @param jurisdiction
  *   - A legal or geographic region in which the plan definition is intended to be used.
  * @param approvalDate
  *   - The date on which the resource content was approved by the publisher. Approval happens once when the content is officially
  *   approved for usage.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param lastReviewDate
  *   - The date on which the resource content was last reviewed. Review happens periodically after approval but does not change
  *   the original approval date.
  * @param effectivePeriod
  *   - The period during which the plan definition content was or is planned to be in active use.
  * @param relatedArtifact
  *   - Related artifacts such as additional documentation, justification, or bibliographic references.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *   the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually
  *   modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict
  *   set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param goal
  *   - Goals that describe what the activities within the plan are intended to achieve. For example, weight loss, restoring an
  *   activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.
  * @param action
  *   - An action or group of actions to be taken as part of the plan.
  */
@POJOBoilerplate
class Computableplandefinition(
    override val id: Option[String] = None,
    override val url: Option[UriStr] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("http://hl7.org/fhir/StructureDefinition/computableplandefinition"))),
    override val text: Option[Narrative] = None,
    override val name: Option[String] = None,
    override val `type`: Option[CodeableConcept] = None,
    override val date: Option[FHIRDateTime] = None,
    override val title: Option[String] = None,
    override val usage: Option[String] = None,
    override val topic: LitSeq[CodeableConcept] = LitSeq.empty,
    override val status: PUBLICATION_STATUS,
    override val author: LitSeq[ContactDetail] = LitSeq.empty,
    override val editor: LitSeq[ContactDetail] = LitSeq.empty,
    override val version: Option[String] = None,
    override val contact: LitSeq[ContactDetail] = LitSeq.empty,
    override val purpose: Option[Markdown] = None,
    library: Canonical,
    override val language: Option[LANGUAGES] = None,
    override val subtitle: Option[String] = None,
    override val reviewer: LitSeq[ContactDetail] = LitSeq.empty,
    override val endorser: LitSeq[ContactDetail] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val publisher: Option[String] = None,
    override val copyright: Option[Markdown] = None,
    override val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val subject: Option[Computableplandefinition.SubjectChoice] = None,
    override val useContext: LitSeq[UsageContext] = LitSeq.empty,
    override val description: Option[Markdown] = None,
    override val experimental: Option[Boolean] = None,
    override val jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
    override val approvalDate: Option[FHIRDate] = None,
    override val implicitRules: Option[UriStr] = None,
    override val lastReviewDate: Option[FHIRDate] = None,
    override val effectivePeriod: Option[Period] = None,
    override val relatedArtifact: LitSeq[RelatedArtifact] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val goal: LitSeq[PlanDefinition.Goal] = LitSeq.empty,
    override val action: LitSeq[PlanDefinition.Action] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends PlanDefinition(
      id = id,
      url = url,
      meta = meta,
      text = text,
      name = name,
      `type` = `type`,
      date = date,
      title = title,
      usage = usage,
      topic = topic,
      status = status,
      author = author,
      editor = editor,
      version = version,
      contact = contact,
      purpose = purpose,
      library = LitSeq(library),
      language = language,
      subtitle = subtitle,
      reviewer = reviewer,
      endorser = endorser,
      contained = contained,
      extension = extension,
      publisher = publisher,
      copyright = copyright,
      identifier = identifier,
      subject = subject,
      useContext = useContext,
      description = description,
      experimental = experimental,
      jurisdiction = jurisdiction,
      approvalDate = approvalDate,
      implicitRules = implicitRules,
      lastReviewDate = lastReviewDate,
      effectivePeriod = effectivePeriod,
      relatedArtifact = relatedArtifact,
      modifierExtension = modifierExtension,
      goal = goal,
      action = action,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "PlanDefinition"
}
