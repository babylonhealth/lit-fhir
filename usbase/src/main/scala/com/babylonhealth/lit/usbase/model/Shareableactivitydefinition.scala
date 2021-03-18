package com.babylonhealth.lit.usbase.model

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
import com.babylonhealth.lit.core.UnionAliases._
import com.babylonhealth.lit.hl7.UnionAliases._
import com.babylonhealth.lit.usbase.UnionAliases._
import com.babylonhealth.lit.hl7.{
  RESOURCE_TYPES,
  PUBLICATION_STATUS,
  REQUEST_PRIORITY,
  REQUEST_INTENT,
  REQUEST_RESOURCE_TYPES
}
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Shareableactivitydefinition extends CompanionFor[Shareableactivitydefinition] {
  override val baseType: CompanionFor[ActivityDefinition] = ActivityDefinition
  override val profileUrl: Option[String]                 = Some("http://hl7.org/fhir/StructureDefinition/shareableactivitydefinition")
  type TimingChoice  = Choice[Union_0181779868]
  type SubjectChoice = Choice[Union01025009075]
  type ProductChoice = Choice[Union01025009075]
  def apply(
      id: Option[String] = None,
      url: UriStr,
      meta: Option[Meta] = Some(
        new Meta(profile = LitSeq("http://hl7.org/fhir/StructureDefinition/shareableactivitydefinition"))),
      text: Option[Narrative] = None,
      name: String,
      date: Option[FHIRDateTime] = None,
      kind: Option[REQUEST_RESOURCE_TYPES] = None,
      code: Option[CodeableConcept] = None,
      title: Option[String] = None,
      usage: Option[String] = None,
      topic: LitSeq[CodeableConcept] = LitSeq.empty,
      status: PUBLICATION_STATUS,
      author: LitSeq[ContactDetail] = LitSeq.empty,
      editor: LitSeq[ContactDetail] = LitSeq.empty,
      intent: Option[REQUEST_INTENT] = None,
      dosage: LitSeq[Dosage] = LitSeq.empty,
      version: String,
      contact: LitSeq[ContactDetail] = LitSeq.empty,
      purpose: Option[Markdown] = None,
      library: LitSeq[Canonical] = LitSeq.empty,
      profile: Option[Canonical] = None,
      language: Option[LANGUAGES] = None,
      subtitle: Option[String] = None,
      reviewer: LitSeq[ContactDetail] = LitSeq.empty,
      endorser: LitSeq[ContactDetail] = LitSeq.empty,
      priority: Option[REQUEST_PRIORITY] = None,
      location: Option[Reference] = None,
      quantity: Option[Quantity] = None,
      bodySite: LitSeq[CodeableConcept] = LitSeq.empty,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      publisher: String,
      copyright: Option[Markdown] = None,
      timing: Option[Shareableactivitydefinition.TimingChoice] = None,
      transform: Option[Canonical] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      subject: Option[Shareableactivitydefinition.SubjectChoice] = None,
      useContext: LitSeq[UsageContext] = LitSeq.empty,
      product: Option[Shareableactivitydefinition.ProductChoice] = None,
      description: Markdown,
      experimental: Boolean,
      jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
      approvalDate: Option[FHIRDate] = None,
      doNotPerform: Option[Boolean] = None,
      implicitRules: Option[UriStr] = None,
      lastReviewDate: Option[FHIRDate] = None,
      effectivePeriod: Option[Period] = None,
      relatedArtifact: LitSeq[RelatedArtifact] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      specimenRequirement: LitSeq[Reference] = LitSeq.empty,
      observationRequirement: LitSeq[Reference] = LitSeq.empty,
      observationResultRequirement: LitSeq[Reference] = LitSeq.empty,
      participant: LitSeq[ActivityDefinition.Participant] = LitSeq.empty,
      dynamicValue: LitSeq[ActivityDefinition.DynamicValue] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Shareableactivitydefinition = new Shareableactivitydefinition(
    id,
    url,
    meta,
    text,
    name,
    date,
    kind,
    code,
    title,
    usage,
    topic,
    status,
    author,
    editor,
    intent,
    dosage,
    version,
    contact,
    purpose,
    library,
    profile,
    language,
    subtitle,
    reviewer,
    endorser,
    priority,
    location,
    quantity,
    bodySite,
    contained,
    extension,
    publisher,
    copyright,
    timing,
    transform,
    identifier,
    subject,
    useContext,
    product,
    description,
    experimental,
    jurisdiction,
    approvalDate,
    doNotPerform,
    implicitRules,
    lastReviewDate,
    effectivePeriod,
    relatedArtifact,
    modifierExtension,
    specimenRequirement,
    observationRequirement,
    observationResultRequirement,
    participant,
    dynamicValue,
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
  val date: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("date", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val kind: FHIRComponentFieldMeta[Option[REQUEST_RESOURCE_TYPES]] =
    FHIRComponentFieldMeta("kind", lTagOf[Option[REQUEST_RESOURCE_TYPES]], false, lTagOf[REQUEST_RESOURCE_TYPES])
  val code: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("code", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
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
  val intent: FHIRComponentFieldMeta[Option[REQUEST_INTENT]] =
    FHIRComponentFieldMeta("intent", lTagOf[Option[REQUEST_INTENT]], false, lTagOf[REQUEST_INTENT])
  val dosage: FHIRComponentFieldMeta[LitSeq[Dosage]] =
    FHIRComponentFieldMeta("dosage", lTagOf[LitSeq[Dosage]], false, lTagOf[Dosage])
  val version: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("version", lTagOf[String], false, lTagOf[String])
  val contact: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("contact", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val purpose: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("purpose", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val library: FHIRComponentFieldMeta[LitSeq[Canonical]] =
    FHIRComponentFieldMeta("library", lTagOf[LitSeq[Canonical]], false, lTagOf[Canonical])
  val profile: FHIRComponentFieldMeta[Option[Canonical]] =
    FHIRComponentFieldMeta("profile", lTagOf[Option[Canonical]], false, lTagOf[Canonical])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val subtitle: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("subtitle", lTagOf[Option[String]], false, lTagOf[String])
  val reviewer: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("reviewer", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val endorser: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("endorser", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val priority: FHIRComponentFieldMeta[Option[REQUEST_PRIORITY]] =
    FHIRComponentFieldMeta("priority", lTagOf[Option[REQUEST_PRIORITY]], false, lTagOf[REQUEST_PRIORITY])
  val location: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("location", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val quantity: FHIRComponentFieldMeta[Option[Quantity]] =
    FHIRComponentFieldMeta("quantity", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
  val bodySite: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("bodySite", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val publisher: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("publisher", lTagOf[String], false, lTagOf[String])
  val copyright: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("copyright", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val timing: FHIRComponentFieldMeta[Option[Shareableactivitydefinition.TimingChoice]] =
    FHIRComponentFieldMeta(
      "timing",
      lTagOf[Option[Shareableactivitydefinition.TimingChoice]],
      true,
      lTagOf[Union_0181779868])
  val transform: FHIRComponentFieldMeta[Option[Canonical]] =
    FHIRComponentFieldMeta("transform", lTagOf[Option[Canonical]], false, lTagOf[Canonical])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val subject: FHIRComponentFieldMeta[Option[Shareableactivitydefinition.SubjectChoice]] =
    FHIRComponentFieldMeta(
      "subject",
      lTagOf[Option[Shareableactivitydefinition.SubjectChoice]],
      true,
      lTagOf[Union01025009075])
  val useContext: FHIRComponentFieldMeta[LitSeq[UsageContext]] =
    FHIRComponentFieldMeta("useContext", lTagOf[LitSeq[UsageContext]], false, lTagOf[UsageContext])
  val product: FHIRComponentFieldMeta[Option[Shareableactivitydefinition.ProductChoice]] =
    FHIRComponentFieldMeta(
      "product",
      lTagOf[Option[Shareableactivitydefinition.ProductChoice]],
      true,
      lTagOf[Union01025009075])
  val description: FHIRComponentFieldMeta[Markdown] =
    FHIRComponentFieldMeta("description", lTagOf[Markdown], false, lTagOf[Markdown])
  val experimental: FHIRComponentFieldMeta[Boolean] =
    FHIRComponentFieldMeta("experimental", lTagOf[Boolean], false, lTagOf[Boolean])
  val jurisdiction: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("jurisdiction", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val approvalDate: FHIRComponentFieldMeta[Option[FHIRDate]] =
    FHIRComponentFieldMeta("approvalDate", lTagOf[Option[FHIRDate]], false, lTagOf[FHIRDate])
  val doNotPerform: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("doNotPerform", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
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
  val specimenRequirement: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("specimenRequirement", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val observationRequirement: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("observationRequirement", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val observationResultRequirement: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("observationResultRequirement", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val participant: FHIRComponentFieldMeta[LitSeq[ActivityDefinition.Participant]] =
    FHIRComponentFieldMeta(
      "participant",
      lTagOf[LitSeq[ActivityDefinition.Participant]],
      false,
      lTagOf[ActivityDefinition.Participant])
  val dynamicValue: FHIRComponentFieldMeta[LitSeq[ActivityDefinition.DynamicValue]] =
    FHIRComponentFieldMeta(
      "dynamicValue",
      lTagOf[LitSeq[ActivityDefinition.DynamicValue]],
      false,
      lTagOf[ActivityDefinition.DynamicValue])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    url,
    meta,
    text,
    name,
    date,
    kind,
    code,
    title,
    usage,
    topic,
    status,
    author,
    editor,
    intent,
    dosage,
    version,
    contact,
    purpose,
    library,
    profile,
    language,
    subtitle,
    reviewer,
    endorser,
    priority,
    location,
    quantity,
    bodySite,
    contained,
    extension,
    publisher,
    copyright,
    timing,
    transform,
    identifier,
    subject,
    useContext,
    product,
    description,
    experimental,
    jurisdiction,
    approvalDate,
    doNotPerform,
    implicitRules,
    lastReviewDate,
    effectivePeriod,
    relatedArtifact,
    modifierExtension,
    specimenRequirement,
    observationRequirement,
    observationResultRequirement,
    participant,
    dynamicValue
  )
  override def fields(t: Shareableactivitydefinition): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[UriStr](url, t.url.get),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[String](name, t.name.get),
    FHIRComponentField[Option[FHIRDateTime]](date, t.date),
    FHIRComponentField[Option[REQUEST_RESOURCE_TYPES]](kind, t.kind),
    FHIRComponentField[Option[CodeableConcept]](code, t.code),
    FHIRComponentField[Option[String]](title, t.title),
    FHIRComponentField[Option[String]](usage, t.usage),
    FHIRComponentField[LitSeq[CodeableConcept]](topic, t.topic),
    FHIRComponentField[PUBLICATION_STATUS](status, t.status),
    FHIRComponentField[LitSeq[ContactDetail]](author, t.author),
    FHIRComponentField[LitSeq[ContactDetail]](editor, t.editor),
    FHIRComponentField[Option[REQUEST_INTENT]](intent, t.intent),
    FHIRComponentField[LitSeq[Dosage]](dosage, t.dosage),
    FHIRComponentField[String](version, t.version.get),
    FHIRComponentField[LitSeq[ContactDetail]](contact, t.contact),
    FHIRComponentField[Option[Markdown]](purpose, t.purpose),
    FHIRComponentField[LitSeq[Canonical]](library, t.library),
    FHIRComponentField[Option[Canonical]](profile, t.profile),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Option[String]](subtitle, t.subtitle),
    FHIRComponentField[LitSeq[ContactDetail]](reviewer, t.reviewer),
    FHIRComponentField[LitSeq[ContactDetail]](endorser, t.endorser),
    FHIRComponentField[Option[REQUEST_PRIORITY]](priority, t.priority),
    FHIRComponentField[Option[Reference]](location, t.location),
    FHIRComponentField[Option[Quantity]](quantity, t.quantity),
    FHIRComponentField[LitSeq[CodeableConcept]](bodySite, t.bodySite),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[String](publisher, t.publisher.get),
    FHIRComponentField[Option[Markdown]](copyright, t.copyright),
    FHIRComponentField[Option[Shareableactivitydefinition.TimingChoice]](timing, t.timing),
    FHIRComponentField[Option[Canonical]](transform, t.transform),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[Shareableactivitydefinition.SubjectChoice]](subject, t.subject),
    FHIRComponentField[LitSeq[UsageContext]](useContext, t.useContext),
    FHIRComponentField[Option[Shareableactivitydefinition.ProductChoice]](product, t.product),
    FHIRComponentField[Markdown](description, t.description.get),
    FHIRComponentField[Boolean](experimental, t.experimental.get),
    FHIRComponentField[LitSeq[CodeableConcept]](jurisdiction, t.jurisdiction),
    FHIRComponentField[Option[FHIRDate]](approvalDate, t.approvalDate),
    FHIRComponentField[Option[Boolean]](doNotPerform, t.doNotPerform),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[FHIRDate]](lastReviewDate, t.lastReviewDate),
    FHIRComponentField[Option[Period]](effectivePeriod, t.effectivePeriod),
    FHIRComponentField[LitSeq[RelatedArtifact]](relatedArtifact, t.relatedArtifact),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[Reference]](specimenRequirement, t.specimenRequirement),
    FHIRComponentField[LitSeq[Reference]](observationRequirement, t.observationRequirement),
    FHIRComponentField[LitSeq[Reference]](observationResultRequirement, t.observationResultRequirement),
    FHIRComponentField[LitSeq[ActivityDefinition.Participant]](participant, t.participant),
    FHIRComponentField[LitSeq[ActivityDefinition.DynamicValue]](dynamicValue, t.dynamicValue)
  )
  def extractId(t: Shareableactivitydefinition): Option[String]                                         = t.id
  def extractUrl(t: Shareableactivitydefinition): UriStr                                                = t.url.get
  def extractMeta(t: Shareableactivitydefinition): Option[Meta]                                         = t.meta
  def extractText(t: Shareableactivitydefinition): Option[Narrative]                                    = t.text
  def extractName(t: Shareableactivitydefinition): String                                               = t.name.get
  def extractDate(t: Shareableactivitydefinition): Option[FHIRDateTime]                                 = t.date
  def extractKind(t: Shareableactivitydefinition): Option[REQUEST_RESOURCE_TYPES]                       = t.kind
  def extractCode(t: Shareableactivitydefinition): Option[CodeableConcept]                              = t.code
  def extractTitle(t: Shareableactivitydefinition): Option[String]                                      = t.title
  def extractUsage(t: Shareableactivitydefinition): Option[String]                                      = t.usage
  def extractTopic(t: Shareableactivitydefinition): LitSeq[CodeableConcept]                             = t.topic
  def extractStatus(t: Shareableactivitydefinition): PUBLICATION_STATUS                                 = t.status
  def extractAuthor(t: Shareableactivitydefinition): LitSeq[ContactDetail]                              = t.author
  def extractEditor(t: Shareableactivitydefinition): LitSeq[ContactDetail]                              = t.editor
  def extractIntent(t: Shareableactivitydefinition): Option[REQUEST_INTENT]                             = t.intent
  def extractDosage(t: Shareableactivitydefinition): LitSeq[Dosage]                                     = t.dosage
  def extractVersion(t: Shareableactivitydefinition): String                                            = t.version.get
  def extractContact(t: Shareableactivitydefinition): LitSeq[ContactDetail]                             = t.contact
  def extractPurpose(t: Shareableactivitydefinition): Option[Markdown]                                  = t.purpose
  def extractLibrary(t: Shareableactivitydefinition): LitSeq[Canonical]                                 = t.library
  def extractProfile(t: Shareableactivitydefinition): Option[Canonical]                                 = t.profile
  def extractLanguage(t: Shareableactivitydefinition): Option[LANGUAGES]                                = t.language
  def extractSubtitle(t: Shareableactivitydefinition): Option[String]                                   = t.subtitle
  def extractReviewer(t: Shareableactivitydefinition): LitSeq[ContactDetail]                            = t.reviewer
  def extractEndorser(t: Shareableactivitydefinition): LitSeq[ContactDetail]                            = t.endorser
  def extractPriority(t: Shareableactivitydefinition): Option[REQUEST_PRIORITY]                         = t.priority
  def extractLocation(t: Shareableactivitydefinition): Option[Reference]                                = t.location
  def extractQuantity(t: Shareableactivitydefinition): Option[Quantity]                                 = t.quantity
  def extractBodySite(t: Shareableactivitydefinition): LitSeq[CodeableConcept]                          = t.bodySite
  def extractContained(t: Shareableactivitydefinition): LitSeq[Resource]                                = t.contained
  def extractExtension(t: Shareableactivitydefinition): LitSeq[Extension]                               = t.extension
  def extractPublisher(t: Shareableactivitydefinition): String                                          = t.publisher.get
  def extractCopyright(t: Shareableactivitydefinition): Option[Markdown]                                = t.copyright
  def extractTiming(t: Shareableactivitydefinition): Option[Shareableactivitydefinition.TimingChoice]   = t.timing
  def extractTransform(t: Shareableactivitydefinition): Option[Canonical]                               = t.transform
  def extractIdentifier(t: Shareableactivitydefinition): LitSeq[Identifier]                             = t.identifier
  def extractSubject(t: Shareableactivitydefinition): Option[Shareableactivitydefinition.SubjectChoice] = t.subject
  def extractUseContext(t: Shareableactivitydefinition): LitSeq[UsageContext]                           = t.useContext
  def extractProduct(t: Shareableactivitydefinition): Option[Shareableactivitydefinition.ProductChoice] = t.product
  def extractDescription(t: Shareableactivitydefinition): Markdown                                      = t.description.get
  def extractExperimental(t: Shareableactivitydefinition): Boolean                                      = t.experimental.get
  def extractJurisdiction(t: Shareableactivitydefinition): LitSeq[CodeableConcept]                      = t.jurisdiction
  def extractApprovalDate(t: Shareableactivitydefinition): Option[FHIRDate]                             = t.approvalDate
  def extractDoNotPerform(t: Shareableactivitydefinition): Option[Boolean]                              = t.doNotPerform
  def extractImplicitRules(t: Shareableactivitydefinition): Option[UriStr]                              = t.implicitRules
  def extractLastReviewDate(t: Shareableactivitydefinition): Option[FHIRDate]                           = t.lastReviewDate
  def extractEffectivePeriod(t: Shareableactivitydefinition): Option[Period]                            = t.effectivePeriod
  def extractRelatedArtifact(t: Shareableactivitydefinition): LitSeq[RelatedArtifact]                   = t.relatedArtifact
  def extractModifierExtension(t: Shareableactivitydefinition): LitSeq[Extension]                       = t.modifierExtension
  def extractSpecimenRequirement(t: Shareableactivitydefinition): LitSeq[Reference]                     = t.specimenRequirement
  def extractObservationRequirement(t: Shareableactivitydefinition): LitSeq[Reference]                  = t.observationRequirement
  def extractObservationResultRequirement(t: Shareableactivitydefinition): LitSeq[Reference] =
    t.observationResultRequirement
  def extractParticipant(t: Shareableactivitydefinition): LitSeq[ActivityDefinition.Participant]   = t.participant
  def extractDynamicValue(t: Shareableactivitydefinition): LitSeq[ActivityDefinition.DynamicValue] = t.dynamicValue
  override val thisName: String                                                                    = "Shareableactivitydefinition"
  override val searchParams: Map[String, Shareableactivitydefinition => Seq[Any]]                  = ActivityDefinition.searchParams
  // format: off
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Shareableactivitydefinition] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ => Try(
      new Shareableactivitydefinition(
        cursor.decodeAs[Option[String]]("id", Some(None)),
        cursor.decodeAs[UriStr]("url", None),
        cursor.decodeAs[Option[Meta]]("meta", Some(None)),
        cursor.decodeAs[Option[Narrative]]("text", Some(None)),
        cursor.decodeAs[String]("name", None),
        cursor.decodeAs[Option[FHIRDateTime]]("date", Some(None)),
        cursor.decodeAs[Option[REQUEST_RESOURCE_TYPES]]("kind", Some(None)),
        cursor.decodeAs[Option[CodeableConcept]]("code", Some(None)),
        cursor.decodeAs[Option[String]]("title", Some(None)),
        cursor.decodeAs[Option[String]]("usage", Some(None)),
        cursor.decodeAs[LitSeq[CodeableConcept]]("topic", Some(LitSeq.empty)),
        cursor.decodeAs[PUBLICATION_STATUS]("status", None),
        cursor.decodeAs[LitSeq[ContactDetail]]("author", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[ContactDetail]]("editor", Some(LitSeq.empty)),
        cursor.decodeAs[Option[REQUEST_INTENT]]("intent", Some(None)),
        cursor.decodeAs[LitSeq[Dosage]]("dosage", Some(LitSeq.empty)),
        cursor.decodeAs[String]("version", None),
        cursor.decodeAs[LitSeq[ContactDetail]]("contact", Some(LitSeq.empty)),
        cursor.decodeAs[Option[Markdown]]("purpose", Some(None)),
        cursor.decodeAs[LitSeq[Canonical]]("library", Some(LitSeq.empty)),
        cursor.decodeAs[Option[Canonical]]("profile", Some(None)),
        cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
        cursor.decodeAs[Option[String]]("subtitle", Some(None)),
        cursor.decodeAs[LitSeq[ContactDetail]]("reviewer", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[ContactDetail]]("endorser", Some(LitSeq.empty)),
        cursor.decodeAs[Option[REQUEST_PRIORITY]]("priority", Some(None)),
        cursor.decodeAs[Option[Reference]]("location", Some(None)),
        cursor.decodeAs[Option[Quantity]]("quantity", Some(None)),
        cursor.decodeAs[LitSeq[CodeableConcept]]("bodySite", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
        cursor.decodeAs[String]("publisher", None),
        cursor.decodeAs[Option[Markdown]]("copyright", Some(None)),
        cursor.decodeOptRef[Union_0181779868]("timing"),
        cursor.decodeAs[Option[Canonical]]("transform", Some(None)),
        cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
        cursor.decodeOptRef[Union01025009075]("subject"),
        cursor.decodeAs[LitSeq[UsageContext]]("useContext", Some(LitSeq.empty)),
        cursor.decodeOptRef[Union01025009075]("product"),
        cursor.decodeAs[Markdown]("description", None),
        cursor.decodeAs[Boolean]("experimental", None),
        cursor.decodeAs[LitSeq[CodeableConcept]]("jurisdiction", Some(LitSeq.empty)),
        cursor.decodeAs[Option[FHIRDate]]("approvalDate", Some(None)),
        cursor.decodeAs[Option[Boolean]]("doNotPerform", Some(None)),
        cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
        cursor.decodeAs[Option[FHIRDate]]("lastReviewDate", Some(None)),
        cursor.decodeAs[Option[Period]]("effectivePeriod", Some(None)),
        cursor.decodeAs[LitSeq[RelatedArtifact]]("relatedArtifact", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[Reference]]("specimenRequirement", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[Reference]]("observationRequirement", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[Reference]]("observationResultRequirement", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[ActivityDefinition.Participant]]("participant", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[ActivityDefinition.DynamicValue]]("dynamicValue", Some(LitSeq.empty)),
        decodeAttributes(cursor)
      )
    ))
  // format: on
}

/** Enforces the minimum information set for the activity definition metadata required by HL7 and other organizations that share and publish activity definitions
  *
  *  Subclass of [[hl7.model.ActivityDefinition]] (This resource allows for the definition of some activity to be performed, independent of a particular patient, practitioner, or other performance context.)
  *
  * @constructor Inherits all params from parent.
  *              Requires the following fields which were optional in the parent: url, name, version, publisher, description, experimental.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param url - An absolute URI that is used to identify this activity definition when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative instance of this activity definition is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the activity definition is stored on different servers.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param name - A natural language name identifying the activity definition. This name should be usable as an identifier for the module by machine processing applications such as code generation.
  * @param date - The date  (and optionally time) when the activity definition was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the activity definition changes.
  * @param kind - A description of the kind of resource the activity definition is representing. For example, a MedicationRequest, a ServiceRequest, or a CommunicationRequest. Typically, but not always, this is a Request resource.
  * @param code - Detailed description of the type of activity; e.g. What lab test, what procedure, what kind of encounter.
  * @param title - A short, descriptive, user-friendly title for the activity definition.
  * @param usage - A detailed description of how the activity definition is used from a clinical perspective.
  * @param topic - Descriptive topics related to the content of the activity. Topics provide a high-level categorization of the activity that can be useful for filtering and searching.
  * @param status - The status of this activity definition. Enables tracking the life-cycle of the content.
  * @param author - An individiual or organization primarily involved in the creation and maintenance of the content.
  * @param editor - An individual or organization primarily responsible for internal coherence of the content.
  * @param intent - Indicates the level of authority/intentionality associated with the activity and where the request should fit into the workflow chain.
  * @param dosage - Provides detailed dosage instructions in the same way that they are described for MedicationRequest resources.
  * @param version - The identifier that is used to identify this version of the activity definition when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the activity definition author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence. To provide a version consistent with the Decision Support Service specification, use the format Major.Minor.Revision (e.g. 1.0.0). For more information on versioning knowledge assets, refer to the Decision Support Service specification. Note that a version is required for non-experimental active assets.
  * @param contact - Contact details to assist a user in finding and communicating with the publisher.
  * @param purpose - Explanation of why this activity definition is needed and why it has been designed as it has.
  * @param library - A reference to a Library resource containing any formal logic used by the activity definition.
  * @param profile - A profile to which the target of the activity definition is expected to conform.
  * @param language - The base language in which the resource is written.
  * @param subtitle - An explanatory or alternate title for the activity definition giving additional information about its content.
  * @param reviewer - An individual or organization primarily responsible for review of some aspect of the content.
  * @param endorser - An individual or organization responsible for officially endorsing the content for use in some setting.
  * @param priority - Indicates how quickly the activity  should be addressed with respect to other requests.
  * @param location - Identifies the facility where the activity will occur; e.g. home, hospital, specific clinic, etc.
  * @param quantity - Identifies the quantity expected to be consumed at once (per dose, per meal, etc.).
  * @param bodySite - Indicates the sites on the subject's body where the procedure should be performed (I.e. the target sites).
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param publisher - The name of the organization or individual that published the activity definition.
  * @param copyright - A copyright statement relating to the activity definition and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the activity definition.
  * @param timing - The period, timing or frequency upon which the described activity is to occur.
  * @param transform - A reference to a StructureMap resource that defines a transform that can be executed to produce the intent resource using the ActivityDefinition instance as the input.
  * @param identifier - A formal identifier that is used to identify this activity definition when it is represented in other formats, or referenced in a specification, model, design or an instance.
  * @param subject - A code or group definition that describes the intended subject of the activity being defined.
  * @param useContext - The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate activity definition instances.
  * @param product - Identifies the food, drug or other product being consumed or supplied in the activity.
  * @param description - A free text natural language description of the activity definition from a consumer's perspective.
  * @param experimental - A Boolean value to indicate that this activity definition is authored for testing purposes (or education/evaluation/marketing) and is not intended to be used for genuine usage.
  * @param jurisdiction - A legal or geographic region in which the activity definition is intended to be used.
  * @param approvalDate - The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage.
  * @param doNotPerform - Set this to true if the definition is to indicate that a particular activity should NOT be performed. If true, this element should be interpreted to reinforce a negative coding. For example NPO as a code with a doNotPerform of true would still indicate to NOT perform the action.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param lastReviewDate - The date on which the resource content was last reviewed. Review happens periodically after approval but does not change the original approval date.
  * @param effectivePeriod - The period during which the activity definition content was or is planned to be in active use.
  * @param relatedArtifact - Related artifacts such as additional documentation, justification, or bibliographic references.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param specimenRequirement - Defines specimen requirements for the action to be performed, such as required specimens for a lab test.
  * @param observationRequirement - Defines observation requirements for the action to be performed, such as body weight or surface area.
  * @param observationResultRequirement - Defines the observations that are expected to be produced by the action.
  * @param participant - Indicates who should participate in performing the action described.
  * @param dynamicValue - Dynamic values that will be evaluated to produce values for elements of the resulting resource. For example, if the dosage of a medication must be computed based on the patient's weight, a dynamic value would be used to specify an expression that calculated the weight, and the path on the request resource that would contain the result.
  */
@POJOBoilerplate
class Shareableactivitydefinition(
    override val id: Option[String] = None,
    url: UriStr,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("http://hl7.org/fhir/StructureDefinition/shareableactivitydefinition"))),
    override val text: Option[Narrative] = None,
    name: String,
    override val date: Option[FHIRDateTime] = None,
    override val kind: Option[REQUEST_RESOURCE_TYPES] = None,
    override val code: Option[CodeableConcept] = None,
    override val title: Option[String] = None,
    override val usage: Option[String] = None,
    override val topic: LitSeq[CodeableConcept] = LitSeq.empty,
    override val status: PUBLICATION_STATUS,
    override val author: LitSeq[ContactDetail] = LitSeq.empty,
    override val editor: LitSeq[ContactDetail] = LitSeq.empty,
    override val intent: Option[REQUEST_INTENT] = None,
    override val dosage: LitSeq[Dosage] = LitSeq.empty,
    version: String,
    override val contact: LitSeq[ContactDetail] = LitSeq.empty,
    override val purpose: Option[Markdown] = None,
    override val library: LitSeq[Canonical] = LitSeq.empty,
    override val profile: Option[Canonical] = None,
    override val language: Option[LANGUAGES] = None,
    override val subtitle: Option[String] = None,
    override val reviewer: LitSeq[ContactDetail] = LitSeq.empty,
    override val endorser: LitSeq[ContactDetail] = LitSeq.empty,
    override val priority: Option[REQUEST_PRIORITY] = None,
    override val location: Option[Reference] = None,
    override val quantity: Option[Quantity] = None,
    override val bodySite: LitSeq[CodeableConcept] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    publisher: String,
    override val copyright: Option[Markdown] = None,
    override val timing: Option[Shareableactivitydefinition.TimingChoice] = None,
    override val transform: Option[Canonical] = None,
    override val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val subject: Option[Shareableactivitydefinition.SubjectChoice] = None,
    override val useContext: LitSeq[UsageContext] = LitSeq.empty,
    override val product: Option[Shareableactivitydefinition.ProductChoice] = None,
    description: Markdown,
    experimental: Boolean,
    override val jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
    override val approvalDate: Option[FHIRDate] = None,
    override val doNotPerform: Option[Boolean] = None,
    override val implicitRules: Option[UriStr] = None,
    override val lastReviewDate: Option[FHIRDate] = None,
    override val effectivePeriod: Option[Period] = None,
    override val relatedArtifact: LitSeq[RelatedArtifact] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val specimenRequirement: LitSeq[Reference] = LitSeq.empty,
    override val observationRequirement: LitSeq[Reference] = LitSeq.empty,
    override val observationResultRequirement: LitSeq[Reference] = LitSeq.empty,
    override val participant: LitSeq[ActivityDefinition.Participant] = LitSeq.empty,
    override val dynamicValue: LitSeq[ActivityDefinition.DynamicValue] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends ActivityDefinition(
      id = id,
      url = Some(url),
      meta = meta,
      text = text,
      name = Some(name),
      date = date,
      kind = kind,
      code = code,
      title = title,
      usage = usage,
      topic = topic,
      status = status,
      author = author,
      editor = editor,
      intent = intent,
      dosage = dosage,
      version = Some(version),
      contact = contact,
      purpose = purpose,
      library = library,
      profile = profile,
      language = language,
      subtitle = subtitle,
      reviewer = reviewer,
      endorser = endorser,
      priority = priority,
      location = location,
      quantity = quantity,
      bodySite = bodySite,
      contained = contained,
      extension = extension,
      publisher = Some(publisher),
      copyright = copyright,
      timing = timing,
      transform = transform,
      identifier = identifier,
      subject = subject,
      useContext = useContext,
      product = product,
      description = Some(description),
      experimental = Some(experimental),
      jurisdiction = jurisdiction,
      approvalDate = approvalDate,
      doNotPerform = doNotPerform,
      implicitRules = implicitRules,
      lastReviewDate = lastReviewDate,
      effectivePeriod = effectivePeriod,
      relatedArtifact = relatedArtifact,
      modifierExtension = modifierExtension,
      specimenRequirement = specimenRequirement,
      observationRequirement = observationRequirement,
      observationResultRequirement = observationResultRequirement,
      participant = participant,
      dynamicValue = dynamicValue,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "ActivityDefinition"
}
