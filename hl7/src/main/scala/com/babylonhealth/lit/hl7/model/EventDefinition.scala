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
import com.babylonhealth.lit.hl7.PUBLICATION_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object EventDefinition extends CompanionFor[EventDefinition] {
  implicit def summonObjectAndCompanionEventDefinition_1460567304(
      o: EventDefinition): ObjectAndCompanion[EventDefinition, EventDefinition.type] = ObjectAndCompanion(o, this)
  override type ResourceType = EventDefinition
  override type ParentType   = EventDefinition
  override val baseType: CompanionFor[ResourceType] = EventDefinition
  override val parentType: CompanionFor[ParentType] = EventDefinition
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/EventDefinition")
  type SubjectChoice = Choice[UnionCodeableConceptOrReference]
  def apply(
      id: Option[String] = None,
      url: Option[UriStr] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      name: Option[String] = None,
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
      trigger: NonEmptyLitSeq[TriggerDefinition],
      language: Option[LANGUAGES] = None,
      subtitle: Option[String] = None,
      reviewer: LitSeq[ContactDetail] = LitSeq.empty,
      endorser: LitSeq[ContactDetail] = LitSeq.empty,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      publisher: Option[String] = None,
      copyright: Option[Markdown] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      subject: Option[EventDefinition.SubjectChoice] = None,
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
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): EventDefinition = new EventDefinition(
    id,
    url,
    meta,
    text,
    name,
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
    trigger,
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
  val trigger: FHIRComponentFieldMeta[NonEmptyLitSeq[TriggerDefinition]] =
    FHIRComponentFieldMeta("trigger", lTagOf[NonEmptyLitSeq[TriggerDefinition]], false, lTagOf[TriggerDefinition])
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
  val subject: FHIRComponentFieldMeta[Option[EventDefinition.SubjectChoice]] =
    FHIRComponentFieldMeta(
      "subject",
      lTagOf[Option[EventDefinition.SubjectChoice]],
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
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    url,
    meta,
    text,
    name,
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
    trigger,
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
    modifierExtension
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: EventDefinition): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[UriStr]](url, t.url),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[String]](name, t.name),
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
    FHIRComponentField[NonEmptyLitSeq[TriggerDefinition]](trigger, t.trigger),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Option[String]](subtitle, t.subtitle),
    FHIRComponentField[LitSeq[ContactDetail]](reviewer, t.reviewer),
    FHIRComponentField[LitSeq[ContactDetail]](endorser, t.endorser),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[String]](publisher, t.publisher),
    FHIRComponentField[Option[Markdown]](copyright, t.copyright),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[EventDefinition.SubjectChoice]](subject, t.subject),
    FHIRComponentField[LitSeq[UsageContext]](useContext, t.useContext),
    FHIRComponentField[Option[Markdown]](description, t.description),
    FHIRComponentField[Option[Boolean]](experimental, t.experimental),
    FHIRComponentField[LitSeq[CodeableConcept]](jurisdiction, t.jurisdiction),
    FHIRComponentField[Option[FHIRDate]](approvalDate, t.approvalDate),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[FHIRDate]](lastReviewDate, t.lastReviewDate),
    FHIRComponentField[Option[Period]](effectivePeriod, t.effectivePeriod),
    FHIRComponentField[LitSeq[RelatedArtifact]](relatedArtifact, t.relatedArtifact),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
  )
  def extractId(t: EventDefinition): Option[String]                             = t.id
  def extractUrl(t: EventDefinition): Option[UriStr]                            = t.url
  def extractMeta(t: EventDefinition): Option[Meta]                             = t.meta
  def extractText(t: EventDefinition): Option[Narrative]                        = t.text
  def extractName(t: EventDefinition): Option[String]                           = t.name
  def extractDate(t: EventDefinition): Option[FHIRDateTime]                     = t.date
  def extractTitle(t: EventDefinition): Option[String]                          = t.title
  def extractUsage(t: EventDefinition): Option[String]                          = t.usage
  def extractTopic(t: EventDefinition): LitSeq[CodeableConcept]                 = t.topic
  def extractStatus(t: EventDefinition): PUBLICATION_STATUS                     = t.status
  def extractAuthor(t: EventDefinition): LitSeq[ContactDetail]                  = t.author
  def extractEditor(t: EventDefinition): LitSeq[ContactDetail]                  = t.editor
  def extractVersion(t: EventDefinition): Option[String]                        = t.version
  def extractContact(t: EventDefinition): LitSeq[ContactDetail]                 = t.contact
  def extractPurpose(t: EventDefinition): Option[Markdown]                      = t.purpose
  def extractTrigger(t: EventDefinition): NonEmptyLitSeq[TriggerDefinition]     = t.trigger
  def extractLanguage(t: EventDefinition): Option[LANGUAGES]                    = t.language
  def extractSubtitle(t: EventDefinition): Option[String]                       = t.subtitle
  def extractReviewer(t: EventDefinition): LitSeq[ContactDetail]                = t.reviewer
  def extractEndorser(t: EventDefinition): LitSeq[ContactDetail]                = t.endorser
  def extractContained(t: EventDefinition): LitSeq[Resource]                    = t.contained
  def extractExtension(t: EventDefinition): LitSeq[Extension]                   = t.extension
  def extractPublisher(t: EventDefinition): Option[String]                      = t.publisher
  def extractCopyright(t: EventDefinition): Option[Markdown]                    = t.copyright
  def extractIdentifier(t: EventDefinition): LitSeq[Identifier]                 = t.identifier
  def extractSubject(t: EventDefinition): Option[EventDefinition.SubjectChoice] = t.subject
  def extractUseContext(t: EventDefinition): LitSeq[UsageContext]               = t.useContext
  def extractDescription(t: EventDefinition): Option[Markdown]                  = t.description
  def extractExperimental(t: EventDefinition): Option[Boolean]                  = t.experimental
  def extractJurisdiction(t: EventDefinition): LitSeq[CodeableConcept]          = t.jurisdiction
  def extractApprovalDate(t: EventDefinition): Option[FHIRDate]                 = t.approvalDate
  def extractImplicitRules(t: EventDefinition): Option[UriStr]                  = t.implicitRules
  def extractLastReviewDate(t: EventDefinition): Option[FHIRDate]               = t.lastReviewDate
  def extractEffectivePeriod(t: EventDefinition): Option[Period]                = t.effectivePeriod
  def extractRelatedArtifact(t: EventDefinition): LitSeq[RelatedArtifact]       = t.relatedArtifact
  def extractModifierExtension(t: EventDefinition): LitSeq[Extension]           = t.modifierExtension
  override val thisName: String                                                 = "EventDefinition"
  override val searchParams: Map[String, EventDefinition => Seq[Any]] = Map(
    "jurisdiction"          -> (obj => obj.jurisdiction.toSeq),
    "name"                  -> (obj => obj.name.toSeq),
    "context-type-quantity" -> (obj => obj.useContext.toSeq),
    "context"               -> (obj => obj.useContext.map(_.value).flatMap(_.as[CodeableConcept]).toSeq),
    "effective"             -> (obj => obj.effectivePeriod.toSeq),
    "depends-on"            -> (obj => obj.relatedArtifact.filter(_.`type`.name == "depends-on").flatMap(_.resource).toSeq),
    "date"                  -> (obj => obj.date.toSeq),
    "topic"                 -> (obj => obj.topic.toSeq),
    "identifier"            -> (obj => obj.identifier.toSeq),
    "url"                   -> (obj => obj.url.toSeq),
    "description"           -> (obj => obj.description.toSeq),
    "successor"             -> (obj => obj.relatedArtifact.filter(_.`type`.name == "successor").flatMap(_.resource).toSeq),
    "context-type-value"    -> (obj => obj.useContext.toSeq),
    "version"               -> (obj => obj.version.toSeq),
    "composed-of"           -> (obj => obj.relatedArtifact.filter(_.`type`.name == "composed-of").flatMap(_.resource).toSeq),
    "status"                -> (obj => Seq(obj.status)),
    "publisher"             -> (obj => obj.publisher.toSeq),
    "title"                 -> (obj => obj.title.toSeq),
    "context-quantity" -> (obj =>
      obj.useContext.map(_.value).flatMap(_.as[Quantity]).toSeq ++
        obj.useContext.map(_.value).flatMap(_.as[Range]).toSeq),
    "predecessor"  -> (obj => obj.relatedArtifact.filter(_.`type`.name == "predecessor").flatMap(_.resource).toSeq),
    "context-type" -> (obj => obj.useContext.map(_.code).toSeq),
    "derived-from" -> (obj => obj.relatedArtifact.filter(_.`type`.name == "derived-from").flatMap(_.resource).toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[EventDefinition] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new EventDefinition(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[UriStr]]("url", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[String]]("name", Some(None)),
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
          cursor.decodeAs[NonEmptyLitSeq[TriggerDefinition]]("trigger", None),
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
          decodeAttributes(cursor)
        )
      ))
}

/** The EventDefinition resource provides a reusable description of when a particular event can occur.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields url, name, date, title, usage, topic, status, author, editor, version, contact, purpose, trigger,
  *   subtitle, reviewer, endorser, publisher, copyright, identifier, subject, useContext, description, experimental,
  *   jurisdiction, approvalDate, lastReviewDate, effectivePeriod, relatedArtifact.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param url
  *   - An absolute URI that is used to identify this event definition when it is referenced in a specification, model, design or
  *     an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which
  *     at which an authoritative instance of this event definition is (or will be) published. This URL can be the target of a
  *     canonical reference. It SHALL remain the same when the event definition is stored on different servers.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *     not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *     resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail
  *     to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should
  *     be represented in the narrative to ensure clinical safety.
  * @param name
  *   - A natural language name identifying the event definition. This name should be usable as an identifier for the module by
  *     machine processing applications such as code generation.
  * @param date
  *   - The date (and optionally time) when the event definition was published. The date must change when the business version
  *     changes and it must change if the status code changes. In addition, it should change when the substantive content of the
  *     event definition changes.
  * @param title
  *   - A short, descriptive, user-friendly title for the event definition.
  * @param usage
  *   - A detailed description of how the event definition is used from a clinical perspective.
  * @param topic
  *   - Descriptive topics related to the module. Topics provide a high-level categorization of the module that can be useful for
  *     filtering and searching.
  * @param status
  *   - The status of this event definition. Enables tracking the life-cycle of the content.
  * @param author
  *   - An individiual or organization primarily involved in the creation and maintenance of the content.
  * @param editor
  *   - An individual or organization primarily responsible for internal coherence of the content.
  * @param version
  *   - The identifier that is used to identify this version of the event definition when it is referenced in a specification,
  *     model, design or instance. This is an arbitrary value managed by the event definition author and is not expected to be
  *     globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also
  *     no expectation that versions can be placed in a lexicographical sequence.
  * @param contact
  *   - Contact details to assist a user in finding and communicating with the publisher.
  * @param purpose
  *   - Explanation of why this event definition is needed and why it has been designed as it has.
  * @param trigger
  *   - The trigger element defines when the event occurs. If more than one trigger condition is specified, the event fires
  *     whenever any one of the trigger conditions is met.
  * @param language
  *   - The base language in which the resource is written.
  * @param subtitle
  *   - An explanatory or alternate title for the event definition giving additional information about its content.
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
  *   - The name of the organization or individual that published the event definition.
  * @param copyright
  *   - A copyright statement relating to the event definition and/or its contents. Copyright statements are generally legal
  *     restrictions on the use and publishing of the event definition.
  * @param identifier
  *   - A formal identifier that is used to identify this event definition when it is represented in other formats, or referenced
  *     in a specification, model, design or an instance.
  * @param subject
  *   - A code or group definition that describes the intended subject of the event definition.
  * @param useContext
  *   - The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be
  *     general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be
  *     used to assist with indexing and searching for appropriate event definition instances.
  * @param description
  *   - A free text natural language description of the event definition from a consumer's perspective.
  * @param experimental
  *   - A Boolean value to indicate that this event definition is authored for testing purposes (or
  *     education/evaluation/marketing) and is not intended to be used for genuine usage.
  * @param jurisdiction
  *   - A legal or geographic region in which the event definition is intended to be used.
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
  *   - The period during which the event definition content was or is planned to be in active use.
  * @param relatedArtifact
  *   - Related resources such as additional documentation, justification, or bibliographic references.
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
class EventDefinition(
    override val id: Option[String] = None,
    val url: Option[UriStr] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val name: Option[String] = None,
    val date: Option[FHIRDateTime] = None,
    val title: Option[String] = None,
    val usage: Option[String] = None,
    val topic: LitSeq[CodeableConcept] = LitSeq.empty,
    val status: PUBLICATION_STATUS,
    val author: LitSeq[ContactDetail] = LitSeq.empty,
    val editor: LitSeq[ContactDetail] = LitSeq.empty,
    val version: Option[String] = None,
    val contact: LitSeq[ContactDetail] = LitSeq.empty,
    val purpose: Option[Markdown] = None,
    val trigger: NonEmptyLitSeq[TriggerDefinition],
    override val language: Option[LANGUAGES] = None,
    val subtitle: Option[String] = None,
    val reviewer: LitSeq[ContactDetail] = LitSeq.empty,
    val endorser: LitSeq[ContactDetail] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val publisher: Option[String] = None,
    val copyright: Option[Markdown] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val subject: Option[EventDefinition.SubjectChoice] = None,
    val useContext: LitSeq[UsageContext] = LitSeq.empty,
    val description: Option[Markdown] = None,
    val experimental: Option[Boolean] = None,
    val jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
    val approvalDate: Option[FHIRDate] = None,
    override val implicitRules: Option[UriStr] = None,
    val lastReviewDate: Option[FHIRDate] = None,
    val effectivePeriod: Option[Period] = None,
    val relatedArtifact: LitSeq[RelatedArtifact] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
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
  override val thisTypeName: String = "EventDefinition"
}
