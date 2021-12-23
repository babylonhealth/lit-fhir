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

object Shareablelibrary extends CompanionFor[Shareablelibrary] {
  implicit def summonObjectAndCompanionShareablelibrary1123862199(
      o: Shareablelibrary): ObjectAndCompanion[Shareablelibrary, Shareablelibrary.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Library
  override type ParentType   = Library
  override val baseType: CompanionFor[ResourceType] = Library
  override val parentType: CompanionFor[ParentType] = Library
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/shareablelibrary")
  type SubjectChoice = Choice[UnionCodeableConceptOrReference]
  def apply(
      id: Option[String] = None,
      url: UriStr,
      meta: Option[Meta] = Some(new Meta(profile = LitSeq("http://hl7.org/fhir/StructureDefinition/shareablelibrary"))),
      text: Option[Narrative] = None,
      name: String,
      `type`: CodeableConcept,
      date: Option[FHIRDateTime] = None,
      title: Option[String] = None,
      usage: Option[String] = None,
      topic: LitSeq[CodeableConcept] = LitSeq.empty,
      status: PUBLICATION_STATUS,
      author: LitSeq[ContactDetail] = LitSeq.empty,
      editor: LitSeq[ContactDetail] = LitSeq.empty,
      version: String,
      contact: LitSeq[ContactDetail] = LitSeq.empty,
      purpose: Option[Markdown] = None,
      content: LitSeq[Attachment] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      subtitle: Option[String] = None,
      reviewer: LitSeq[ContactDetail] = LitSeq.empty,
      endorser: LitSeq[ContactDetail] = LitSeq.empty,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      publisher: String,
      copyright: Option[Markdown] = None,
      parameter: LitSeq[ParameterDefinition] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      subject: Option[Shareablelibrary.SubjectChoice] = None,
      useContext: LitSeq[UsageContext] = LitSeq.empty,
      description: Markdown,
      experimental: Boolean,
      jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
      approvalDate: Option[FHIRDate] = None,
      implicitRules: Option[UriStr] = None,
      lastReviewDate: Option[FHIRDate] = None,
      effectivePeriod: Option[Period] = None,
      relatedArtifact: LitSeq[RelatedArtifact] = LitSeq.empty,
      dataRequirement: LitSeq[DataRequirement] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Shareablelibrary = new Shareablelibrary(
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
    content,
    language,
    subtitle,
    reviewer,
    endorser,
    contained,
    extension,
    publisher,
    copyright,
    parameter,
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
    dataRequirement,
    modifierExtension,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val url: FHIRComponentFieldMeta[UriStr] =
    FHIRComponentFieldMeta("url", lTagOf[UriStr], false, lTagOf[UriStr])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val name: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("name", lTagOf[String], false, lTagOf[String])
  val `type`: FHIRComponentFieldMeta[CodeableConcept] =
    FHIRComponentFieldMeta("type", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
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
  val version: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("version", lTagOf[String], false, lTagOf[String])
  val contact: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("contact", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val purpose: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("purpose", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val content: FHIRComponentFieldMeta[LitSeq[Attachment]] =
    FHIRComponentFieldMeta("content", lTagOf[LitSeq[Attachment]], false, lTagOf[Attachment])
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
  val publisher: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("publisher", lTagOf[String], false, lTagOf[String])
  val copyright: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("copyright", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val parameter: FHIRComponentFieldMeta[LitSeq[ParameterDefinition]] =
    FHIRComponentFieldMeta("parameter", lTagOf[LitSeq[ParameterDefinition]], false, lTagOf[ParameterDefinition])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val subject: FHIRComponentFieldMeta[Option[Shareablelibrary.SubjectChoice]] =
    FHIRComponentFieldMeta(
      "subject",
      lTagOf[Option[Shareablelibrary.SubjectChoice]],
      true,
      lTagOf[UnionCodeableConceptOrReference])
  val useContext: FHIRComponentFieldMeta[LitSeq[UsageContext]] =
    FHIRComponentFieldMeta("useContext", lTagOf[LitSeq[UsageContext]], false, lTagOf[UsageContext])
  val description: FHIRComponentFieldMeta[Markdown] =
    FHIRComponentFieldMeta("description", lTagOf[Markdown], false, lTagOf[Markdown])
  val experimental: FHIRComponentFieldMeta[Boolean] =
    FHIRComponentFieldMeta("experimental", lTagOf[Boolean], false, lTagOf[Boolean])
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
  val dataRequirement: FHIRComponentFieldMeta[LitSeq[DataRequirement]] =
    FHIRComponentFieldMeta("dataRequirement", lTagOf[LitSeq[DataRequirement]], false, lTagOf[DataRequirement])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
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
    content,
    language,
    subtitle,
    reviewer,
    endorser,
    contained,
    extension,
    publisher,
    copyright,
    parameter,
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
    dataRequirement,
    modifierExtension
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[UriStr](url, t.url.get),
      FHIRComponentField[Option[Meta]](meta, t.meta),
      FHIRComponentField[Option[Narrative]](text, t.text),
      FHIRComponentField[String](name, t.name.get),
      FHIRComponentField[CodeableConcept](`type`, t.`type`),
      FHIRComponentField[Option[FHIRDateTime]](date, t.date),
      FHIRComponentField[Option[String]](title, t.title),
      FHIRComponentField[Option[String]](usage, t.usage),
      FHIRComponentField[LitSeq[CodeableConcept]](topic, t.topic),
      FHIRComponentField[PUBLICATION_STATUS](status, t.status),
      FHIRComponentField[LitSeq[ContactDetail]](author, t.author),
      FHIRComponentField[LitSeq[ContactDetail]](editor, t.editor),
      FHIRComponentField[String](version, t.version.get),
      FHIRComponentField[LitSeq[ContactDetail]](contact, t.contact),
      FHIRComponentField[Option[Markdown]](purpose, t.purpose),
      FHIRComponentField[LitSeq[Attachment]](content, t.content),
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[Option[String]](subtitle, t.subtitle),
      FHIRComponentField[LitSeq[ContactDetail]](reviewer, t.reviewer),
      FHIRComponentField[LitSeq[ContactDetail]](endorser, t.endorser),
      FHIRComponentField[LitSeq[Resource]](contained, t.contained),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[String](publisher, t.publisher.get),
      FHIRComponentField[Option[Markdown]](copyright, t.copyright),
      FHIRComponentField[LitSeq[ParameterDefinition]](parameter, t.parameter),
      FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
      FHIRComponentField[Option[Shareablelibrary.SubjectChoice]](subject, t.subject),
      FHIRComponentField[LitSeq[UsageContext]](useContext, t.useContext),
      FHIRComponentField[Markdown](description, t.description.get),
      FHIRComponentField[Boolean](experimental, t.experimental.get),
      FHIRComponentField[LitSeq[CodeableConcept]](jurisdiction, t.jurisdiction),
      FHIRComponentField[Option[FHIRDate]](approvalDate, t.approvalDate),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[Option[FHIRDate]](lastReviewDate, t.lastReviewDate),
      FHIRComponentField[Option[Period]](effectivePeriod, t.effectivePeriod),
      FHIRComponentField[LitSeq[RelatedArtifact]](relatedArtifact, t.relatedArtifact),
      FHIRComponentField[LitSeq[DataRequirement]](dataRequirement, t.dataRequirement),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    ))
  override def fields(t: Shareablelibrary): Seq[FHIRComponentField[_]]            = fieldsFromParent(t).get
  def extractId(t: Shareablelibrary): Option[String]                              = t.id
  def extractUrl(t: Shareablelibrary): UriStr                                     = t.url.get
  def extractMeta(t: Shareablelibrary): Option[Meta]                              = t.meta
  def extractText(t: Shareablelibrary): Option[Narrative]                         = t.text
  def extractName(t: Shareablelibrary): String                                    = t.name.get
  def extractType(t: Shareablelibrary): CodeableConcept                           = t.`type`
  def extractDate(t: Shareablelibrary): Option[FHIRDateTime]                      = t.date
  def extractTitle(t: Shareablelibrary): Option[String]                           = t.title
  def extractUsage(t: Shareablelibrary): Option[String]                           = t.usage
  def extractTopic(t: Shareablelibrary): LitSeq[CodeableConcept]                  = t.topic
  def extractStatus(t: Shareablelibrary): PUBLICATION_STATUS                      = t.status
  def extractAuthor(t: Shareablelibrary): LitSeq[ContactDetail]                   = t.author
  def extractEditor(t: Shareablelibrary): LitSeq[ContactDetail]                   = t.editor
  def extractVersion(t: Shareablelibrary): String                                 = t.version.get
  def extractContact(t: Shareablelibrary): LitSeq[ContactDetail]                  = t.contact
  def extractPurpose(t: Shareablelibrary): Option[Markdown]                       = t.purpose
  def extractContent(t: Shareablelibrary): LitSeq[Attachment]                     = t.content
  def extractLanguage(t: Shareablelibrary): Option[LANGUAGES]                     = t.language
  def extractSubtitle(t: Shareablelibrary): Option[String]                        = t.subtitle
  def extractReviewer(t: Shareablelibrary): LitSeq[ContactDetail]                 = t.reviewer
  def extractEndorser(t: Shareablelibrary): LitSeq[ContactDetail]                 = t.endorser
  def extractContained(t: Shareablelibrary): LitSeq[Resource]                     = t.contained
  def extractExtension(t: Shareablelibrary): LitSeq[Extension]                    = t.extension
  def extractPublisher(t: Shareablelibrary): String                               = t.publisher.get
  def extractCopyright(t: Shareablelibrary): Option[Markdown]                     = t.copyright
  def extractParameter(t: Shareablelibrary): LitSeq[ParameterDefinition]          = t.parameter
  def extractIdentifier(t: Shareablelibrary): LitSeq[Identifier]                  = t.identifier
  def extractSubject(t: Shareablelibrary): Option[Shareablelibrary.SubjectChoice] = t.subject
  def extractUseContext(t: Shareablelibrary): LitSeq[UsageContext]                = t.useContext
  def extractDescription(t: Shareablelibrary): Markdown                           = t.description.get
  def extractExperimental(t: Shareablelibrary): Boolean                           = t.experimental.get
  def extractJurisdiction(t: Shareablelibrary): LitSeq[CodeableConcept]           = t.jurisdiction
  def extractApprovalDate(t: Shareablelibrary): Option[FHIRDate]                  = t.approvalDate
  def extractImplicitRules(t: Shareablelibrary): Option[UriStr]                   = t.implicitRules
  def extractLastReviewDate(t: Shareablelibrary): Option[FHIRDate]                = t.lastReviewDate
  def extractEffectivePeriod(t: Shareablelibrary): Option[Period]                 = t.effectivePeriod
  def extractRelatedArtifact(t: Shareablelibrary): LitSeq[RelatedArtifact]        = t.relatedArtifact
  def extractDataRequirement(t: Shareablelibrary): LitSeq[DataRequirement]        = t.dataRequirement
  def extractModifierExtension(t: Shareablelibrary): LitSeq[Extension]            = t.modifierExtension
  override val thisName: String                                                   = "Shareablelibrary"
  override val searchParams: Map[String, Shareablelibrary => Seq[Any]]            = Library.searchParams
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Shareablelibrary] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Shareablelibrary(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[UriStr]("url", None),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[String]("name", None),
          cursor.decodeAs[CodeableConcept]("type", None),
          cursor.decodeAs[Option[FHIRDateTime]]("date", Some(None)),
          cursor.decodeAs[Option[String]]("title", Some(None)),
          cursor.decodeAs[Option[String]]("usage", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("topic", Some(LitSeq.empty)),
          cursor.decodeAs[PUBLICATION_STATUS]("status", None),
          cursor.decodeAs[LitSeq[ContactDetail]]("author", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[ContactDetail]]("editor", Some(LitSeq.empty)),
          cursor.decodeAs[String]("version", None),
          cursor.decodeAs[LitSeq[ContactDetail]]("contact", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Markdown]]("purpose", Some(None)),
          cursor.decodeAs[LitSeq[Attachment]]("content", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[String]]("subtitle", Some(None)),
          cursor.decodeAs[LitSeq[ContactDetail]]("reviewer", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[ContactDetail]]("endorser", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[String]("publisher", None),
          cursor.decodeAs[Option[Markdown]]("copyright", Some(None)),
          cursor.decodeAs[LitSeq[ParameterDefinition]]("parameter", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeOptRef[UnionCodeableConceptOrReference]("subject"),
          cursor.decodeAs[LitSeq[UsageContext]]("useContext", Some(LitSeq.empty)),
          cursor.decodeAs[Markdown]("description", None),
          cursor.decodeAs[Boolean]("experimental", None),
          cursor.decodeAs[LitSeq[CodeableConcept]]("jurisdiction", Some(LitSeq.empty)),
          cursor.decodeAs[Option[FHIRDate]]("approvalDate", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[FHIRDate]]("lastReviewDate", Some(None)),
          cursor.decodeAs[Option[Period]]("effectivePeriod", Some(None)),
          cursor.decodeAs[LitSeq[RelatedArtifact]]("relatedArtifact", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[DataRequirement]]("dataRequirement", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Enforces the minimum information set for the library metadata required by HL7 and other organizations that share and publish
  * libraries
  *
  * Subclass of [[hl7.model.Library]] (The Library resource is a general-purpose container for knowledge asset definitions. It can
  * be used to describe and expose existing knowledge assets such as logic libraries and information model descriptions, as well
  * as to describe a collection of knowledge assets.)
  *
  * @constructor
  *   Inherits all params from parent. Requires the following fields which were optional in the parent: url, name, version,
  *   publisher, description, experimental.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param url
  *   - An absolute URI that is used to identify this library when it is referenced in a specification, model, design or an
  *     instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at
  *     which an authoritative instance of this library is (or will be) published. This URL can be the target of a canonical
  *     reference. It SHALL remain the same when the library is stored on different servers.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *     not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *     resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail
  *     to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should
  *     be represented in the narrative to ensure clinical safety.
  * @param name
  *   - A natural language name identifying the library. This name should be usable as an identifier for the module by machine
  *     processing applications such as code generation.
  * @param `type`
  *   - Identifies the type of library such as a Logic Library, Model Definition, Asset Collection, or Module Definition.
  * @param date
  *   - The date (and optionally time) when the library was published. The date must change when the business version changes and
  *     it must change if the status code changes. In addition, it should change when the substantive content of the library
  *     changes.
  * @param title
  *   - A short, descriptive, user-friendly title for the library.
  * @param usage
  *   - A detailed description of how the library is used from a clinical perspective.
  * @param topic
  *   - Descriptive topics related to the content of the library. Topics provide a high-level categorization of the library that
  *     can be useful for filtering and searching.
  * @param status
  *   - The status of this library. Enables tracking the life-cycle of the content.
  * @param author
  *   - An individiual or organization primarily involved in the creation and maintenance of the content.
  * @param editor
  *   - An individual or organization primarily responsible for internal coherence of the content.
  * @param version
  *   - The identifier that is used to identify this version of the library when it is referenced in a specification, model,
  *     design or instance. This is an arbitrary value managed by the library author and is not expected to be globally unique.
  *     For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation
  *     that versions can be placed in a lexicographical sequence. To provide a version consistent with the Decision Support
  *     Service specification, use the format Major.Minor.Revision (e.g. 1.0.0). For more information on versioning knowledge
  *     assets, refer to the Decision Support Service specification. Note that a version is required for non-experimental active
  *     artifacts.
  * @param contact
  *   - Contact details to assist a user in finding and communicating with the publisher.
  * @param purpose
  *   - Explanation of why this library is needed and why it has been designed as it has.
  * @param content
  *   - The content of the library as an Attachment. The content may be a reference to a url, or may be directly embedded as a
  *     base-64 string. Either way, the contentType of the attachment determines how to interpret the content.
  * @param language
  *   - The base language in which the resource is written.
  * @param subtitle
  *   - An explanatory or alternate title for the library giving additional information about its content.
  * @param reviewer
  *   - An individual or organization primarily responsible for review of some aspect of the content.
  * @param endorser
  *   - An individual or organization responsible for officially endorsing the content for use in some setting.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *     identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *     of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *     Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *     of the extension.
  * @param publisher
  *   - The name of the organization or individual that published the library.
  * @param copyright
  *   - A copyright statement relating to the library and/or its contents. Copyright statements are generally legal restrictions
  *     on the use and publishing of the library.
  * @param parameter
  *   - The parameter element defines parameters used by the library.
  * @param identifier
  *   - A formal identifier that is used to identify this library when it is represented in other formats, or referenced in a
  *     specification, model, design or an instance. e.g. CMS or NQF identifiers for a measure artifact. Note that at least one
  *     identifier is required for non-experimental active artifacts.
  * @param subject
  *   - A code or group definition that describes the intended subject of the contents of the library.
  * @param useContext
  *   - The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be
  *     general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be
  *     used to assist with indexing and searching for appropriate library instances.
  * @param description
  *   - A free text natural language description of the library from a consumer's perspective.
  * @param experimental
  *   - A Boolean value to indicate that this library is authored for testing purposes (or education/evaluation/marketing) and is
  *     not intended to be used for genuine usage.
  * @param jurisdiction
  *   - A legal or geographic region in which the library is intended to be used.
  * @param approvalDate
  *   - The date on which the resource content was approved by the publisher. Approval happens once when the content is officially
  *     approved for usage.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *     processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *     other profiles etc.
  * @param lastReviewDate
  *   - The date on which the resource content was last reviewed. Review happens periodically after approval but does not change
  *     the original approval date.
  * @param effectivePeriod
  *   - The period during which the library content was or is planned to be in active use.
  * @param relatedArtifact
  *   - Related artifacts such as additional documentation, justification, or bibliographic references.
  * @param dataRequirement
  *   - Describes a set of data that must be provided in order to be able to successfully perform the computations defined by the
  *     library.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *     the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *     Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *     strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *     extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *     processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of
  *     any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  */
@POJOBoilerplate
class Shareablelibrary(
    override val id: Option[String] = None,
    url: UriStr,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("http://hl7.org/fhir/StructureDefinition/shareablelibrary"))),
    override val text: Option[Narrative] = None,
    name: String,
    override val `type`: CodeableConcept,
    override val date: Option[FHIRDateTime] = None,
    override val title: Option[String] = None,
    override val usage: Option[String] = None,
    override val topic: LitSeq[CodeableConcept] = LitSeq.empty,
    override val status: PUBLICATION_STATUS,
    override val author: LitSeq[ContactDetail] = LitSeq.empty,
    override val editor: LitSeq[ContactDetail] = LitSeq.empty,
    version: String,
    override val contact: LitSeq[ContactDetail] = LitSeq.empty,
    override val purpose: Option[Markdown] = None,
    override val content: LitSeq[Attachment] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    override val subtitle: Option[String] = None,
    override val reviewer: LitSeq[ContactDetail] = LitSeq.empty,
    override val endorser: LitSeq[ContactDetail] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    publisher: String,
    override val copyright: Option[Markdown] = None,
    override val parameter: LitSeq[ParameterDefinition] = LitSeq.empty,
    override val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val subject: Option[Shareablelibrary.SubjectChoice] = None,
    override val useContext: LitSeq[UsageContext] = LitSeq.empty,
    description: Markdown,
    experimental: Boolean,
    override val jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
    override val approvalDate: Option[FHIRDate] = None,
    override val implicitRules: Option[UriStr] = None,
    override val lastReviewDate: Option[FHIRDate] = None,
    override val effectivePeriod: Option[Period] = None,
    override val relatedArtifact: LitSeq[RelatedArtifact] = LitSeq.empty,
    override val dataRequirement: LitSeq[DataRequirement] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Library(
      id = id,
      url = Some(url),
      meta = meta,
      text = text,
      name = Some(name),
      `type` = `type`,
      date = date,
      title = title,
      usage = usage,
      topic = topic,
      status = status,
      author = author,
      editor = editor,
      version = Some(version),
      contact = contact,
      purpose = purpose,
      content = content,
      language = language,
      subtitle = subtitle,
      reviewer = reviewer,
      endorser = endorser,
      contained = contained,
      extension = extension,
      publisher = Some(publisher),
      copyright = copyright,
      parameter = parameter,
      identifier = identifier,
      subject = subject,
      useContext = useContext,
      description = Some(description),
      experimental = Some(experimental),
      jurisdiction = jurisdiction,
      approvalDate = approvalDate,
      implicitRules = implicitRules,
      lastReviewDate = lastReviewDate,
      effectivePeriod = effectivePeriod,
      relatedArtifact = relatedArtifact,
      dataRequirement = dataRequirement,
      modifierExtension = modifierExtension,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Library"
}
