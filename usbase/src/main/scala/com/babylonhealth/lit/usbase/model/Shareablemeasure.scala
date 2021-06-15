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

object Shareablemeasure extends CompanionFor[Shareablemeasure] {
  implicit def summonObjectAndCompanionShareablemeasure_722106430(
      o: Shareablemeasure): ObjectAndCompanion[Shareablemeasure, Shareablemeasure.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Measure
  override type ParentType   = Measure
  override val baseType: CompanionFor[ResourceType] = Measure
  override val parentType: CompanionFor[ParentType] = Measure
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/shareablemeasure")
  type SubjectChoice = Choice[Union01025009075]
  def apply(
      id: Option[String] = None,
      url: UriStr,
      meta: Option[Meta] = Some(new Meta(profile = LitSeq("http://hl7.org/fhir/StructureDefinition/shareablemeasure"))),
      text: Option[Narrative] = None,
      name: String,
      date: Option[FHIRDateTime] = None,
      `type`: LitSeq[CodeableConcept] = LitSeq.empty,
      title: Option[String] = None,
      usage: Option[String] = None,
      topic: LitSeq[CodeableConcept] = LitSeq.empty,
      status: PUBLICATION_STATUS,
      author: LitSeq[ContactDetail] = LitSeq.empty,
      editor: LitSeq[ContactDetail] = LitSeq.empty,
      version: String,
      contact: LitSeq[ContactDetail] = LitSeq.empty,
      purpose: Option[Markdown] = None,
      library: LitSeq[Canonical] = LitSeq.empty,
      scoring: Option[CodeableConcept] = None,
      language: Option[LANGUAGES] = None,
      subtitle: Option[String] = None,
      reviewer: LitSeq[ContactDetail] = LitSeq.empty,
      endorser: LitSeq[ContactDetail] = LitSeq.empty,
      guidance: Option[Markdown] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      publisher: String,
      copyright: Option[Markdown] = None,
      rationale: Option[Markdown] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      subject: Option[Shareablemeasure.SubjectChoice] = None,
      useContext: LitSeq[UsageContext] = LitSeq.empty,
      disclaimer: Option[Markdown] = None,
      definition: LitSeq[Markdown] = LitSeq.empty,
      description: Markdown,
      experimental: Boolean,
      jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
      approvalDate: Option[FHIRDate] = None,
      implicitRules: Option[UriStr] = None,
      lastReviewDate: Option[FHIRDate] = None,
      riskAdjustment: Option[String] = None,
      effectivePeriod: Option[Period] = None,
      relatedArtifact: LitSeq[RelatedArtifact] = LitSeq.empty,
      rateAggregation: Option[String] = None,
      compositeScoring: Option[CodeableConcept] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      improvementNotation: Option[CodeableConcept] = None,
      clinicalRecommendationStatement: Option[Markdown] = None,
      supplementalData: LitSeq[Measure.SupplementalData] = LitSeq.empty,
      group: LitSeq[Measure.Group] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Shareablemeasure = new Shareablemeasure(
    id,
    url,
    meta,
    text,
    name,
    date,
    `type`,
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
    scoring,
    language,
    subtitle,
    reviewer,
    endorser,
    guidance,
    contained,
    extension,
    publisher,
    copyright,
    rationale,
    identifier,
    subject,
    useContext,
    disclaimer,
    definition,
    description,
    experimental,
    jurisdiction,
    approvalDate,
    implicitRules,
    lastReviewDate,
    riskAdjustment,
    effectivePeriod,
    relatedArtifact,
    rateAggregation,
    compositeScoring,
    modifierExtension,
    improvementNotation,
    clinicalRecommendationStatement,
    supplementalData,
    group,
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
  val `type`: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("type", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
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
  val library: FHIRComponentFieldMeta[LitSeq[Canonical]] =
    FHIRComponentFieldMeta("library", lTagOf[LitSeq[Canonical]], false, lTagOf[Canonical])
  val scoring: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("scoring", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val subtitle: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("subtitle", lTagOf[Option[String]], false, lTagOf[String])
  val reviewer: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("reviewer", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val endorser: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("endorser", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val guidance: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("guidance", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val publisher: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("publisher", lTagOf[String], false, lTagOf[String])
  val copyright: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("copyright", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val rationale: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("rationale", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val subject: FHIRComponentFieldMeta[Option[Shareablemeasure.SubjectChoice]] =
    FHIRComponentFieldMeta("subject", lTagOf[Option[Shareablemeasure.SubjectChoice]], true, lTagOf[Union01025009075])
  val useContext: FHIRComponentFieldMeta[LitSeq[UsageContext]] =
    FHIRComponentFieldMeta("useContext", lTagOf[LitSeq[UsageContext]], false, lTagOf[UsageContext])
  val disclaimer: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("disclaimer", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val definition: FHIRComponentFieldMeta[LitSeq[Markdown]] =
    FHIRComponentFieldMeta("definition", lTagOf[LitSeq[Markdown]], false, lTagOf[Markdown])
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
  val riskAdjustment: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("riskAdjustment", lTagOf[Option[String]], false, lTagOf[String])
  val effectivePeriod: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("effectivePeriod", lTagOf[Option[Period]], false, lTagOf[Period])
  val relatedArtifact: FHIRComponentFieldMeta[LitSeq[RelatedArtifact]] =
    FHIRComponentFieldMeta("relatedArtifact", lTagOf[LitSeq[RelatedArtifact]], false, lTagOf[RelatedArtifact])
  val rateAggregation: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("rateAggregation", lTagOf[Option[String]], false, lTagOf[String])
  val compositeScoring: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("compositeScoring", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val improvementNotation: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("improvementNotation", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val clinicalRecommendationStatement: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("clinicalRecommendationStatement", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val supplementalData: FHIRComponentFieldMeta[LitSeq[Measure.SupplementalData]] =
    FHIRComponentFieldMeta(
      "supplementalData",
      lTagOf[LitSeq[Measure.SupplementalData]],
      false,
      lTagOf[Measure.SupplementalData])
  val group: FHIRComponentFieldMeta[LitSeq[Measure.Group]] =
    FHIRComponentFieldMeta("group", lTagOf[LitSeq[Measure.Group]], false, lTagOf[Measure.Group])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    url,
    meta,
    text,
    name,
    date,
    `type`,
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
    scoring,
    language,
    subtitle,
    reviewer,
    endorser,
    guidance,
    contained,
    extension,
    publisher,
    copyright,
    rationale,
    identifier,
    subject,
    useContext,
    disclaimer,
    definition,
    description,
    experimental,
    jurisdiction,
    approvalDate,
    implicitRules,
    lastReviewDate,
    riskAdjustment,
    effectivePeriod,
    relatedArtifact,
    rateAggregation,
    compositeScoring,
    modifierExtension,
    improvementNotation,
    clinicalRecommendationStatement,
    supplementalData,
    group
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[UriStr](url, t.url.get),
      FHIRComponentField[Option[Meta]](meta, t.meta),
      FHIRComponentField[Option[Narrative]](text, t.text),
      FHIRComponentField[String](name, t.name.get),
      FHIRComponentField[Option[FHIRDateTime]](date, t.date),
      FHIRComponentField[LitSeq[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[Option[String]](title, t.title),
      FHIRComponentField[Option[String]](usage, t.usage),
      FHIRComponentField[LitSeq[CodeableConcept]](topic, t.topic),
      FHIRComponentField[PUBLICATION_STATUS](status, t.status),
      FHIRComponentField[LitSeq[ContactDetail]](author, t.author),
      FHIRComponentField[LitSeq[ContactDetail]](editor, t.editor),
      FHIRComponentField[String](version, t.version.get),
      FHIRComponentField[LitSeq[ContactDetail]](contact, t.contact),
      FHIRComponentField[Option[Markdown]](purpose, t.purpose),
      FHIRComponentField[LitSeq[Canonical]](library, t.library),
      FHIRComponentField[Option[CodeableConcept]](scoring, t.scoring),
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[Option[String]](subtitle, t.subtitle),
      FHIRComponentField[LitSeq[ContactDetail]](reviewer, t.reviewer),
      FHIRComponentField[LitSeq[ContactDetail]](endorser, t.endorser),
      FHIRComponentField[Option[Markdown]](guidance, t.guidance),
      FHIRComponentField[LitSeq[Resource]](contained, t.contained),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[String](publisher, t.publisher.get),
      FHIRComponentField[Option[Markdown]](copyright, t.copyright),
      FHIRComponentField[Option[Markdown]](rationale, t.rationale),
      FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
      FHIRComponentField[Option[Shareablemeasure.SubjectChoice]](subject, t.subject),
      FHIRComponentField[LitSeq[UsageContext]](useContext, t.useContext),
      FHIRComponentField[Option[Markdown]](disclaimer, t.disclaimer),
      FHIRComponentField[LitSeq[Markdown]](definition, t.definition),
      FHIRComponentField[Markdown](description, t.description.get),
      FHIRComponentField[Boolean](experimental, t.experimental.get),
      FHIRComponentField[LitSeq[CodeableConcept]](jurisdiction, t.jurisdiction),
      FHIRComponentField[Option[FHIRDate]](approvalDate, t.approvalDate),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[Option[FHIRDate]](lastReviewDate, t.lastReviewDate),
      FHIRComponentField[Option[String]](riskAdjustment, t.riskAdjustment),
      FHIRComponentField[Option[Period]](effectivePeriod, t.effectivePeriod),
      FHIRComponentField[LitSeq[RelatedArtifact]](relatedArtifact, t.relatedArtifact),
      FHIRComponentField[Option[String]](rateAggregation, t.rateAggregation),
      FHIRComponentField[Option[CodeableConcept]](compositeScoring, t.compositeScoring),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[CodeableConcept]](improvementNotation, t.improvementNotation),
      FHIRComponentField[Option[Markdown]](clinicalRecommendationStatement, t.clinicalRecommendationStatement),
      FHIRComponentField[LitSeq[Measure.SupplementalData]](supplementalData, t.supplementalData),
      FHIRComponentField[LitSeq[Measure.Group]](group, t.group)
    ))
  override def fields(t: Shareablemeasure): Seq[FHIRComponentField[_]]               = fieldsFromParent(t).get
  def extractId(t: Shareablemeasure): Option[String]                                 = t.id
  def extractUrl(t: Shareablemeasure): UriStr                                        = t.url.get
  def extractMeta(t: Shareablemeasure): Option[Meta]                                 = t.meta
  def extractText(t: Shareablemeasure): Option[Narrative]                            = t.text
  def extractName(t: Shareablemeasure): String                                       = t.name.get
  def extractDate(t: Shareablemeasure): Option[FHIRDateTime]                         = t.date
  def extractType(t: Shareablemeasure): LitSeq[CodeableConcept]                      = t.`type`
  def extractTitle(t: Shareablemeasure): Option[String]                              = t.title
  def extractUsage(t: Shareablemeasure): Option[String]                              = t.usage
  def extractTopic(t: Shareablemeasure): LitSeq[CodeableConcept]                     = t.topic
  def extractStatus(t: Shareablemeasure): PUBLICATION_STATUS                         = t.status
  def extractAuthor(t: Shareablemeasure): LitSeq[ContactDetail]                      = t.author
  def extractEditor(t: Shareablemeasure): LitSeq[ContactDetail]                      = t.editor
  def extractVersion(t: Shareablemeasure): String                                    = t.version.get
  def extractContact(t: Shareablemeasure): LitSeq[ContactDetail]                     = t.contact
  def extractPurpose(t: Shareablemeasure): Option[Markdown]                          = t.purpose
  def extractLibrary(t: Shareablemeasure): LitSeq[Canonical]                         = t.library
  def extractScoring(t: Shareablemeasure): Option[CodeableConcept]                   = t.scoring
  def extractLanguage(t: Shareablemeasure): Option[LANGUAGES]                        = t.language
  def extractSubtitle(t: Shareablemeasure): Option[String]                           = t.subtitle
  def extractReviewer(t: Shareablemeasure): LitSeq[ContactDetail]                    = t.reviewer
  def extractEndorser(t: Shareablemeasure): LitSeq[ContactDetail]                    = t.endorser
  def extractGuidance(t: Shareablemeasure): Option[Markdown]                         = t.guidance
  def extractContained(t: Shareablemeasure): LitSeq[Resource]                        = t.contained
  def extractExtension(t: Shareablemeasure): LitSeq[Extension]                       = t.extension
  def extractPublisher(t: Shareablemeasure): String                                  = t.publisher.get
  def extractCopyright(t: Shareablemeasure): Option[Markdown]                        = t.copyright
  def extractRationale(t: Shareablemeasure): Option[Markdown]                        = t.rationale
  def extractIdentifier(t: Shareablemeasure): LitSeq[Identifier]                     = t.identifier
  def extractSubject(t: Shareablemeasure): Option[Shareablemeasure.SubjectChoice]    = t.subject
  def extractUseContext(t: Shareablemeasure): LitSeq[UsageContext]                   = t.useContext
  def extractDisclaimer(t: Shareablemeasure): Option[Markdown]                       = t.disclaimer
  def extractDefinition(t: Shareablemeasure): LitSeq[Markdown]                       = t.definition
  def extractDescription(t: Shareablemeasure): Markdown                              = t.description.get
  def extractExperimental(t: Shareablemeasure): Boolean                              = t.experimental.get
  def extractJurisdiction(t: Shareablemeasure): LitSeq[CodeableConcept]              = t.jurisdiction
  def extractApprovalDate(t: Shareablemeasure): Option[FHIRDate]                     = t.approvalDate
  def extractImplicitRules(t: Shareablemeasure): Option[UriStr]                      = t.implicitRules
  def extractLastReviewDate(t: Shareablemeasure): Option[FHIRDate]                   = t.lastReviewDate
  def extractRiskAdjustment(t: Shareablemeasure): Option[String]                     = t.riskAdjustment
  def extractEffectivePeriod(t: Shareablemeasure): Option[Period]                    = t.effectivePeriod
  def extractRelatedArtifact(t: Shareablemeasure): LitSeq[RelatedArtifact]           = t.relatedArtifact
  def extractRateAggregation(t: Shareablemeasure): Option[String]                    = t.rateAggregation
  def extractCompositeScoring(t: Shareablemeasure): Option[CodeableConcept]          = t.compositeScoring
  def extractModifierExtension(t: Shareablemeasure): LitSeq[Extension]               = t.modifierExtension
  def extractImprovementNotation(t: Shareablemeasure): Option[CodeableConcept]       = t.improvementNotation
  def extractClinicalRecommendationStatement(t: Shareablemeasure): Option[Markdown]  = t.clinicalRecommendationStatement
  def extractSupplementalData(t: Shareablemeasure): LitSeq[Measure.SupplementalData] = t.supplementalData
  def extractGroup(t: Shareablemeasure): LitSeq[Measure.Group]                       = t.group
  override val thisName: String                                                      = "Shareablemeasure"
  override val searchParams: Map[String, Shareablemeasure => Seq[Any]]               = Measure.searchParams
  // format: off
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Shareablemeasure] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ => Try(
      new Shareablemeasure(
        cursor.decodeAs[Option[String]]("id", Some(None)),
        cursor.decodeAs[UriStr]("url", None),
        cursor.decodeAs[Option[Meta]]("meta", Some(None)),
        cursor.decodeAs[Option[Narrative]]("text", Some(None)),
        cursor.decodeAs[String]("name", None),
        cursor.decodeAs[Option[FHIRDateTime]]("date", Some(None)),
        cursor.decodeAs[LitSeq[CodeableConcept]]("type", Some(LitSeq.empty)),
        cursor.decodeAs[Option[String]]("title", Some(None)),
        cursor.decodeAs[Option[String]]("usage", Some(None)),
        cursor.decodeAs[LitSeq[CodeableConcept]]("topic", Some(LitSeq.empty)),
        cursor.decodeAs[PUBLICATION_STATUS]("status", None),
        cursor.decodeAs[LitSeq[ContactDetail]]("author", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[ContactDetail]]("editor", Some(LitSeq.empty)),
        cursor.decodeAs[String]("version", None),
        cursor.decodeAs[LitSeq[ContactDetail]]("contact", Some(LitSeq.empty)),
        cursor.decodeAs[Option[Markdown]]("purpose", Some(None)),
        cursor.decodeAs[LitSeq[Canonical]]("library", Some(LitSeq.empty)),
        cursor.decodeAs[Option[CodeableConcept]]("scoring", Some(None)),
        cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
        cursor.decodeAs[Option[String]]("subtitle", Some(None)),
        cursor.decodeAs[LitSeq[ContactDetail]]("reviewer", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[ContactDetail]]("endorser", Some(LitSeq.empty)),
        cursor.decodeAs[Option[Markdown]]("guidance", Some(None)),
        cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
        cursor.decodeAs[String]("publisher", None),
        cursor.decodeAs[Option[Markdown]]("copyright", Some(None)),
        cursor.decodeAs[Option[Markdown]]("rationale", Some(None)),
        cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
        cursor.decodeOptRef[Union01025009075]("subject"),
        cursor.decodeAs[LitSeq[UsageContext]]("useContext", Some(LitSeq.empty)),
        cursor.decodeAs[Option[Markdown]]("disclaimer", Some(None)),
        cursor.decodeAs[LitSeq[Markdown]]("definition", Some(LitSeq.empty)),
        cursor.decodeAs[Markdown]("description", None),
        cursor.decodeAs[Boolean]("experimental", None),
        cursor.decodeAs[LitSeq[CodeableConcept]]("jurisdiction", Some(LitSeq.empty)),
        cursor.decodeAs[Option[FHIRDate]]("approvalDate", Some(None)),
        cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
        cursor.decodeAs[Option[FHIRDate]]("lastReviewDate", Some(None)),
        cursor.decodeAs[Option[String]]("riskAdjustment", Some(None)),
        cursor.decodeAs[Option[Period]]("effectivePeriod", Some(None)),
        cursor.decodeAs[LitSeq[RelatedArtifact]]("relatedArtifact", Some(LitSeq.empty)),
        cursor.decodeAs[Option[String]]("rateAggregation", Some(None)),
        cursor.decodeAs[Option[CodeableConcept]]("compositeScoring", Some(None)),
        cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
        cursor.decodeAs[Option[CodeableConcept]]("improvementNotation", Some(None)),
        cursor.decodeAs[Option[Markdown]]("clinicalRecommendationStatement", Some(None)),
        cursor.decodeAs[LitSeq[Measure.SupplementalData]]("supplementalData", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[Measure.Group]]("group", Some(LitSeq.empty)),
        decodeAttributes(cursor)
      )
    ))
  // format: on
}

/** Enforces the minimum information set for the measure metadata required by HL7 and other organizations that share and
  * publish measures
  *
  * Subclass of [[hl7.model.Measure]] (The Measure resource provides the definition of a quality measure.)
  *
  * @constructor
  *   Inherits all params from parent. Requires the following fields which were optional in the parent: url, name,
  *   version, publisher, description, experimental.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param url
  *   - An absolute URI that is used to identify this measure when it is referenced in a specification, model, design or
  *   an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address
  *   at which at which an authoritative instance of this measure is (or will be) published. This URL can be the target
  *   of a canonical reference. It SHALL remain the same when the measure is stored on different servers.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the
  *   content might not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of
  *   the resource to a human. The narrative need not encode all the structured data, but is required to contain
  *   sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may
  *   define what content should be represented in the narrative to ensure clinical safety.
  * @param name
  *   - A natural language name identifying the measure. This name should be usable as an identifier for the module by
  *   machine processing applications such as code generation.
  * @param date
  *   - The date (and optionally time) when the measure was published. The date must change when the business version
  *   changes and it must change if the status code changes. In addition, it should change when the substantive content
  *   of the measure changes.
  * @param `type`
  *   - Indicates whether the measure is used to examine a process, an outcome over time, a patient-reported outcome, or
  *   a structure measure such as utilization.
  * @param title
  *   - A short, descriptive, user-friendly title for the measure.
  * @param usage
  *   - A detailed description, from a clinical perspective, of how the measure is used.
  * @param topic
  *   - Descriptive topics related to the content of the measure. Topics provide a high-level categorization grouping
  *   types of measures that can be useful for filtering and searching.
  * @param status
  *   - The status of this measure. Enables tracking the life-cycle of the content.
  * @param author
  *   - An individiual or organization primarily involved in the creation and maintenance of the content.
  * @param editor
  *   - An individual or organization primarily responsible for internal coherence of the content.
  * @param version
  *   - The identifier that is used to identify this version of the measure when it is referenced in a specification,
  *   model, design or instance. This is an arbitrary value managed by the measure author and is not expected to be
  *   globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There
  *   is also no expectation that versions can be placed in a lexicographical sequence. To provide a version consistent
  *   with the Decision Support Service specification, use the format Major.Minor.Revision (e.g. 1.0.0). For more
  *   information on versioning knowledge assets, refer to the Decision Support Service specification. Note that a
  *   version is required for non-experimental active artifacts.
  * @param contact
  *   - Contact details to assist a user in finding and communicating with the publisher.
  * @param purpose
  *   - Explanation of why this measure is needed and why it has been designed as it has.
  * @param library
  *   - A reference to a Library resource containing the formal logic used by the measure.
  * @param scoring
  *   - Indicates how the calculation is performed for the measure, including proportion, ratio, continuous-variable,
  *   and cohort. The value set is extensible, allowing additional measure scoring types to be represented.
  * @param language
  *   - The base language in which the resource is written.
  * @param subtitle
  *   - An explanatory or alternate title for the measure giving additional information about its content.
  * @param reviewer
  *   - An individual or organization primarily responsible for review of some aspect of the content.
  * @param endorser
  *   - An individual or organization responsible for officially endorsing the content for use in some setting.
  * @param guidance
  *   - Additional guidance for the measure including how it can be used in a clinical context, and the intent of the
  *   measure.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To
  *   make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and
  *   use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be
  *   met as part of the definition of the extension.
  * @param publisher
  *   - The name of the organization or individual that published the measure.
  * @param copyright
  *   - A copyright statement relating to the measure and/or its contents. Copyright statements are generally legal
  *   restrictions on the use and publishing of the measure.
  * @param rationale
  *   - Provides a succinct statement of the need for the measure. Usually includes statements pertaining to importance
  *   criterion: impact, gap in care, and evidence.
  * @param identifier
  *   - A formal identifier that is used to identify this measure when it is represented in other formats, or referenced
  *   in a specification, model, design or an instance.
  * @param subject
  *   - The intended subjects for the measure. If this element is not provided, a Patient subject is assumed, but the
  *   subject of the measure can be anything.
  * @param useContext
  *   - The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may
  *   be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...)
  *   and may be used to assist with indexing and searching for appropriate measure instances.
  * @param disclaimer
  *   - Notices and disclaimers regarding the use of the measure or related to intellectual property (such as code
  *   systems) referenced by the measure.
  * @param definition
  *   - Provides a description of an individual term used within the measure.
  * @param description
  *   - A free text natural language description of the measure from a consumer's perspective.
  * @param experimental
  *   - A Boolean value to indicate that this measure is authored for testing purposes (or
  *   education/evaluation/marketing) and is not intended to be used for genuine usage.
  * @param jurisdiction
  *   - A legal or geographic region in which the measure is intended to be used.
  * @param approvalDate
  *   - The date on which the resource content was approved by the publisher. Approval happens once when the content is
  *   officially approved for usage.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood
  *   when processing the content. Often, this is a reference to an implementation guide that defines the special rules
  *   along with other profiles etc.
  * @param lastReviewDate
  *   - The date on which the resource content was last reviewed. Review happens periodically after approval but does
  *   not change the original approval date.
  * @param riskAdjustment
  *   - A description of the risk adjustment factors that may impact the resulting score for the measure and how they
  *   may be accounted for when computing and reporting measure results.
  * @param effectivePeriod
  *   - The period during which the measure content was or is planned to be in active use.
  * @param relatedArtifact
  *   - Related artifacts such as additional documentation, justification, or bibliographic references.
  * @param rateAggregation
  *   - Describes how to combine the information calculated, based on logic in each of several populations, into one
  *   summarized result.
  * @param compositeScoring
  *   - If this is a composite measure, the scoring method used to combine the component measures to determine the
  *   composite score.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and
  *   that modifies the understanding of the element that contains it and/or the understanding of the containing
  *   element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions
  *   safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though
  *   any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the
  *   definition of the extension. Applications processing a resource are required to check for modifier extensions.
  *   Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot
  *   change the meaning of modifierExtension itself).
  * @param improvementNotation
  *   - Information on whether an increase or decrease in score is the preferred result (e.g., a higher score indicates
  *   better quality OR a lower score indicates better quality OR quality is within a range).
  * @param clinicalRecommendationStatement
  *   - Provides a summary of relevant clinical guidelines or other clinical recommendations supporting the measure.
  * @param supplementalData
  *   - The supplemental data criteria for the measure report, specified as either the name of a valid CQL expression
  *   within a referenced library, or a valid FHIR Resource Path.
  * @param group
  *   - A group of population criteria for the measure.
  */
@POJOBoilerplate
class Shareablemeasure(
    override val id: Option[String] = None,
    url: UriStr,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("http://hl7.org/fhir/StructureDefinition/shareablemeasure"))),
    override val text: Option[Narrative] = None,
    name: String,
    override val date: Option[FHIRDateTime] = None,
    override val `type`: LitSeq[CodeableConcept] = LitSeq.empty,
    override val title: Option[String] = None,
    override val usage: Option[String] = None,
    override val topic: LitSeq[CodeableConcept] = LitSeq.empty,
    override val status: PUBLICATION_STATUS,
    override val author: LitSeq[ContactDetail] = LitSeq.empty,
    override val editor: LitSeq[ContactDetail] = LitSeq.empty,
    version: String,
    override val contact: LitSeq[ContactDetail] = LitSeq.empty,
    override val purpose: Option[Markdown] = None,
    override val library: LitSeq[Canonical] = LitSeq.empty,
    override val scoring: Option[CodeableConcept] = None,
    override val language: Option[LANGUAGES] = None,
    override val subtitle: Option[String] = None,
    override val reviewer: LitSeq[ContactDetail] = LitSeq.empty,
    override val endorser: LitSeq[ContactDetail] = LitSeq.empty,
    override val guidance: Option[Markdown] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    publisher: String,
    override val copyright: Option[Markdown] = None,
    override val rationale: Option[Markdown] = None,
    override val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val subject: Option[Shareablemeasure.SubjectChoice] = None,
    override val useContext: LitSeq[UsageContext] = LitSeq.empty,
    override val disclaimer: Option[Markdown] = None,
    override val definition: LitSeq[Markdown] = LitSeq.empty,
    description: Markdown,
    experimental: Boolean,
    override val jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
    override val approvalDate: Option[FHIRDate] = None,
    override val implicitRules: Option[UriStr] = None,
    override val lastReviewDate: Option[FHIRDate] = None,
    override val riskAdjustment: Option[String] = None,
    override val effectivePeriod: Option[Period] = None,
    override val relatedArtifact: LitSeq[RelatedArtifact] = LitSeq.empty,
    override val rateAggregation: Option[String] = None,
    override val compositeScoring: Option[CodeableConcept] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val improvementNotation: Option[CodeableConcept] = None,
    override val clinicalRecommendationStatement: Option[Markdown] = None,
    override val supplementalData: LitSeq[Measure.SupplementalData] = LitSeq.empty,
    override val group: LitSeq[Measure.Group] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Measure(
      id = id,
      url = Some(url),
      meta = meta,
      text = text,
      name = Some(name),
      date = date,
      `type` = `type`,
      title = title,
      usage = usage,
      topic = topic,
      status = status,
      author = author,
      editor = editor,
      version = Some(version),
      contact = contact,
      purpose = purpose,
      library = library,
      scoring = scoring,
      language = language,
      subtitle = subtitle,
      reviewer = reviewer,
      endorser = endorser,
      guidance = guidance,
      contained = contained,
      extension = extension,
      publisher = Some(publisher),
      copyright = copyright,
      rationale = rationale,
      identifier = identifier,
      subject = subject,
      useContext = useContext,
      disclaimer = disclaimer,
      definition = definition,
      description = Some(description),
      experimental = Some(experimental),
      jurisdiction = jurisdiction,
      approvalDate = approvalDate,
      implicitRules = implicitRules,
      lastReviewDate = lastReviewDate,
      riskAdjustment = riskAdjustment,
      effectivePeriod = effectivePeriod,
      relatedArtifact = relatedArtifact,
      rateAggregation = rateAggregation,
      compositeScoring = compositeScoring,
      modifierExtension = modifierExtension,
      improvementNotation = improvementNotation,
      clinicalRecommendationStatement = clinicalRecommendationStatement,
      supplementalData = supplementalData,
      group = group,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Measure"
}
