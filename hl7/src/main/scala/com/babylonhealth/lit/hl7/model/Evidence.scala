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

object Evidence extends CompanionFor[Evidence] {
  implicit def summonObjectAndCompanionEvidence1693145420(o: Evidence): ObjectAndCompanion[Evidence, Evidence.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Evidence
  override type ParentType   = Evidence
  override val baseType: CompanionFor[ResourceType] = Evidence
  override val parentType: CompanionFor[ParentType] = Evidence
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Evidence")
  object VariableDefinition extends CompanionFor[VariableDefinition] {
    implicit def summonObjectAndCompanionVariableDefinition895223022(
        o: VariableDefinition): ObjectAndCompanion[VariableDefinition, VariableDefinition.type] = ObjectAndCompanion(o, this)
    override type ResourceType = VariableDefinition
    override type ParentType   = VariableDefinition
    override val parentType: CompanionFor[ResourceType] = VariableDefinition
    def apply(
        id: Option[String] = None,
        note: LitSeq[Annotation] = LitSeq.empty,
        observed: Option[Reference] = None,
        intended: Option[Reference] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        description: Option[Markdown] = None,
        variableRole: CodeableConcept,
        directnessMatch: Option[CodeableConcept] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): VariableDefinition = new VariableDefinition(
      id,
      note,
      observed,
      intended,
      extension,
      description,
      variableRole,
      directnessMatch,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: VariableDefinition): Option[(Option[String], LitSeq[Annotation], Option[Reference], Option[Reference], LitSeq[Extension], Option[Markdown], CodeableConcept, Option[CodeableConcept], LitSeq[Extension])] =
      Some(
        (
          o.id,
          o.note,
          o.observed,
          o.intended,
          o.extension,
          o.description,
          o.variableRole,
          o.directnessMatch,
          o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
      FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
    val observed: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("observed", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val intended: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("intended", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val description: FHIRComponentFieldMeta[Option[Markdown]] =
      FHIRComponentFieldMeta("description", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
    val variableRole: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("variableRole", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val directnessMatch: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("directnessMatch", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, note, observed, intended, extension, description, variableRole, directnessMatch, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: VariableDefinition): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Annotation]](note, t.note),
      FHIRComponentField[Option[Reference]](observed, t.observed),
      FHIRComponentField[Option[Reference]](intended, t.intended),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Markdown]](description, t.description),
      FHIRComponentField[CodeableConcept](variableRole, t.variableRole),
      FHIRComponentField[Option[CodeableConcept]](directnessMatch, t.directnessMatch),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[VariableDefinition] = this
    val thisName: String                           = "VariableDefinition"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[VariableDefinition] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new VariableDefinition(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Reference]]("observed", Some(None)),
            cursor.decodeAs[Option[Reference]]("intended", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Markdown]]("description", Some(None)),
            cursor.decodeAs[CodeableConcept]("variableRole", None),
            cursor.decodeAs[Option[CodeableConcept]]("directnessMatch", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class VariableDefinition(
      override val id: Option[String] = None,
      val note: LitSeq[Annotation] = LitSeq.empty,
      val observed: Option[Reference] = None,
      val intended: Option[Reference] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val description: Option[Markdown] = None,
      val variableRole: CodeableConcept,
      val directnessMatch: Option[CodeableConcept] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Certainty extends CompanionFor[Certainty] {
    implicit def summonObjectAndCompanionCertainty895223022(o: Certainty): ObjectAndCompanion[Certainty, Certainty.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Certainty
    override type ParentType   = Certainty
    override val parentType: CompanionFor[ResourceType] = Certainty
    def apply(
        id: Option[String] = None,
        note: LitSeq[Annotation] = LitSeq.empty,
        `type`: Option[CodeableConcept] = None,
        rater: Option[String] = None,
        rating: Option[CodeableConcept] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        description: Option[String] = None,
        subcomponent: LitSeq[Evidence.Certainty] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Certainty = new Certainty(
      id,
      note,
      `type`,
      rater,
      rating,
      extension,
      description,
      subcomponent,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Certainty): Option[(Option[String], LitSeq[Annotation], Option[CodeableConcept], Option[String], Option[CodeableConcept], LitSeq[Extension], Option[String], LitSeq[Evidence.Certainty], LitSeq[Extension])] =
      Some((o.id, o.note, o.`type`, o.rater, o.rating, o.extension, o.description, o.subcomponent, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
      FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
    val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val rater: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("rater", lTagOf[Option[String]], false, lTagOf[String])
    val rating: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("rating", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val description: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
    val subcomponent: FHIRComponentFieldMeta[LitSeq[Evidence.Certainty]] =
      FHIRComponentFieldMeta("subcomponent", lTagOf[LitSeq[Evidence.Certainty]], false, lTagOf[Evidence.Certainty])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, note, `type`, rater, rating, extension, description, subcomponent, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Certainty): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Annotation]](note, t.note),
      FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[Option[String]](rater, t.rater),
      FHIRComponentField[Option[CodeableConcept]](rating, t.rating),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[String]](description, t.description),
      FHIRComponentField[LitSeq[Evidence.Certainty]](subcomponent, t.subcomponent),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Certainty] = this
    val thisName: String                  = "Certainty"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Certainty] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Certainty(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
            cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
            cursor.decodeAs[Option[String]]("rater", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("rating", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("description", Some(None)),
            cursor.decodeAs[LitSeq[Evidence.Certainty]]("subcomponent", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Certainty(
      override val id: Option[String] = None,
      val note: LitSeq[Annotation] = LitSeq.empty,
      val `type`: Option[CodeableConcept] = None,
      val rater: Option[String] = None,
      val rating: Option[CodeableConcept] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val description: Option[String] = None,
      val subcomponent: LitSeq[Evidence.Certainty] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  type CiteAsChoice = Choice[UnionMarkdownOrReference]
  def apply(
      id: Option[String] = None,
      url: Option[UriStr] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      date: Option[FHIRDateTime] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      title: Option[String] = None,
      status: PUBLICATION_STATUS,
      author: LitSeq[ContactDetail] = LitSeq.empty,
      editor: LitSeq[ContactDetail] = LitSeq.empty,
      version: Option[String] = None,
      contact: LitSeq[ContactDetail] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      reviewer: LitSeq[ContactDetail] = LitSeq.empty,
      endorser: LitSeq[ContactDetail] = LitSeq.empty,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      citeAs: Option[Evidence.CiteAsChoice] = None,
      publisher: Option[String] = None,
      assertion: Option[Markdown] = None,
      studyType: Option[CodeableConcept] = None,
      statistic: LitSeq[Statistic] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      useContext: LitSeq[UsageContext] = LitSeq.empty,
      description: Option[Markdown] = None,
      approvalDate: Option[FHIRDate] = None,
      distribution: LitSeq[OrderedDistribution] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      synthesisType: Option[CodeableConcept] = None,
      lastReviewDate: Option[FHIRDate] = None,
      relatedArtifact: LitSeq[RelatedArtifact] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      certainty: LitSeq[Evidence.Certainty] = LitSeq.empty,
      variableDefinition: NonEmptyLitSeq[Evidence.VariableDefinition],
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Evidence = new Evidence(
    id,
    url,
    meta,
    text,
    date,
    note,
    title,
    status,
    author,
    editor,
    version,
    contact,
    language,
    reviewer,
    endorser,
    contained,
    extension,
    citeAs,
    publisher,
    assertion,
    studyType,
    statistic,
    identifier,
    useContext,
    description,
    approvalDate,
    distribution,
    implicitRules,
    synthesisType,
    lastReviewDate,
    relatedArtifact,
    modifierExtension,
    certainty,
    variableDefinition,
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
  val date: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("date", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val title: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("title", lTagOf[Option[String]], false, lTagOf[String])
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
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val reviewer: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("reviewer", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val endorser: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("endorser", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val citeAs: FHIRComponentFieldMeta[Option[Evidence.CiteAsChoice]] =
    FHIRComponentFieldMeta("citeAs", lTagOf[Option[Evidence.CiteAsChoice]], true, lTagOf[UnionMarkdownOrReference])
  val publisher: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("publisher", lTagOf[Option[String]], false, lTagOf[String])
  val assertion: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("assertion", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val studyType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("studyType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val statistic: FHIRComponentFieldMeta[LitSeq[Statistic]] =
    FHIRComponentFieldMeta("statistic", lTagOf[LitSeq[Statistic]], false, lTagOf[Statistic])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val useContext: FHIRComponentFieldMeta[LitSeq[UsageContext]] =
    FHIRComponentFieldMeta("useContext", lTagOf[LitSeq[UsageContext]], false, lTagOf[UsageContext])
  val description: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("description", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val approvalDate: FHIRComponentFieldMeta[Option[FHIRDate]] =
    FHIRComponentFieldMeta("approvalDate", lTagOf[Option[FHIRDate]], false, lTagOf[FHIRDate])
  val distribution: FHIRComponentFieldMeta[LitSeq[OrderedDistribution]] =
    FHIRComponentFieldMeta("distribution", lTagOf[LitSeq[OrderedDistribution]], false, lTagOf[OrderedDistribution])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val synthesisType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("synthesisType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val lastReviewDate: FHIRComponentFieldMeta[Option[FHIRDate]] =
    FHIRComponentFieldMeta("lastReviewDate", lTagOf[Option[FHIRDate]], false, lTagOf[FHIRDate])
  val relatedArtifact: FHIRComponentFieldMeta[LitSeq[RelatedArtifact]] =
    FHIRComponentFieldMeta("relatedArtifact", lTagOf[LitSeq[RelatedArtifact]], false, lTagOf[RelatedArtifact])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val certainty: FHIRComponentFieldMeta[LitSeq[Evidence.Certainty]] =
    FHIRComponentFieldMeta("certainty", lTagOf[LitSeq[Evidence.Certainty]], false, lTagOf[Evidence.Certainty])
  val variableDefinition: FHIRComponentFieldMeta[NonEmptyLitSeq[Evidence.VariableDefinition]] =
    FHIRComponentFieldMeta(
      "variableDefinition",
      lTagOf[NonEmptyLitSeq[Evidence.VariableDefinition]],
      false,
      lTagOf[Evidence.VariableDefinition])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    url,
    meta,
    text,
    date,
    note,
    title,
    status,
    author,
    editor,
    version,
    contact,
    language,
    reviewer,
    endorser,
    contained,
    extension,
    citeAs,
    publisher,
    assertion,
    studyType,
    statistic,
    identifier,
    useContext,
    description,
    approvalDate,
    distribution,
    implicitRules,
    synthesisType,
    lastReviewDate,
    relatedArtifact,
    modifierExtension,
    certainty,
    variableDefinition
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Evidence): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[UriStr]](url, t.url),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[FHIRDateTime]](date, t.date),
    FHIRComponentField[LitSeq[Annotation]](note, t.note),
    FHIRComponentField[Option[String]](title, t.title),
    FHIRComponentField[PUBLICATION_STATUS](status, t.status),
    FHIRComponentField[LitSeq[ContactDetail]](author, t.author),
    FHIRComponentField[LitSeq[ContactDetail]](editor, t.editor),
    FHIRComponentField[Option[String]](version, t.version),
    FHIRComponentField[LitSeq[ContactDetail]](contact, t.contact),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[ContactDetail]](reviewer, t.reviewer),
    FHIRComponentField[LitSeq[ContactDetail]](endorser, t.endorser),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Evidence.CiteAsChoice]](citeAs, t.citeAs),
    FHIRComponentField[Option[String]](publisher, t.publisher),
    FHIRComponentField[Option[Markdown]](assertion, t.assertion),
    FHIRComponentField[Option[CodeableConcept]](studyType, t.studyType),
    FHIRComponentField[LitSeq[Statistic]](statistic, t.statistic),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[LitSeq[UsageContext]](useContext, t.useContext),
    FHIRComponentField[Option[Markdown]](description, t.description),
    FHIRComponentField[Option[FHIRDate]](approvalDate, t.approvalDate),
    FHIRComponentField[LitSeq[OrderedDistribution]](distribution, t.distribution),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[CodeableConcept]](synthesisType, t.synthesisType),
    FHIRComponentField[Option[FHIRDate]](lastReviewDate, t.lastReviewDate),
    FHIRComponentField[LitSeq[RelatedArtifact]](relatedArtifact, t.relatedArtifact),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[Evidence.Certainty]](certainty, t.certainty),
    FHIRComponentField[NonEmptyLitSeq[Evidence.VariableDefinition]](variableDefinition, t.variableDefinition)
  )
  def extractId(t: Evidence): Option[String]                                              = t.id
  def extractUrl(t: Evidence): Option[UriStr]                                             = t.url
  def extractMeta(t: Evidence): Option[Meta]                                              = t.meta
  def extractText(t: Evidence): Option[Narrative]                                         = t.text
  def extractDate(t: Evidence): Option[FHIRDateTime]                                      = t.date
  def extractNote(t: Evidence): LitSeq[Annotation]                                        = t.note
  def extractTitle(t: Evidence): Option[String]                                           = t.title
  def extractStatus(t: Evidence): PUBLICATION_STATUS                                      = t.status
  def extractAuthor(t: Evidence): LitSeq[ContactDetail]                                   = t.author
  def extractEditor(t: Evidence): LitSeq[ContactDetail]                                   = t.editor
  def extractVersion(t: Evidence): Option[String]                                         = t.version
  def extractContact(t: Evidence): LitSeq[ContactDetail]                                  = t.contact
  def extractLanguage(t: Evidence): Option[LANGUAGES]                                     = t.language
  def extractReviewer(t: Evidence): LitSeq[ContactDetail]                                 = t.reviewer
  def extractEndorser(t: Evidence): LitSeq[ContactDetail]                                 = t.endorser
  def extractContained(t: Evidence): LitSeq[Resource]                                     = t.contained
  def extractExtension(t: Evidence): LitSeq[Extension]                                    = t.extension
  def extractCiteAs(t: Evidence): Option[Evidence.CiteAsChoice]                           = t.citeAs
  def extractPublisher(t: Evidence): Option[String]                                       = t.publisher
  def extractAssertion(t: Evidence): Option[Markdown]                                     = t.assertion
  def extractStudyType(t: Evidence): Option[CodeableConcept]                              = t.studyType
  def extractStatistic(t: Evidence): LitSeq[Statistic]                                    = t.statistic
  def extractIdentifier(t: Evidence): LitSeq[Identifier]                                  = t.identifier
  def extractUseContext(t: Evidence): LitSeq[UsageContext]                                = t.useContext
  def extractDescription(t: Evidence): Option[Markdown]                                   = t.description
  def extractApprovalDate(t: Evidence): Option[FHIRDate]                                  = t.approvalDate
  def extractDistribution(t: Evidence): LitSeq[OrderedDistribution]                       = t.distribution
  def extractImplicitRules(t: Evidence): Option[UriStr]                                   = t.implicitRules
  def extractSynthesisType(t: Evidence): Option[CodeableConcept]                          = t.synthesisType
  def extractLastReviewDate(t: Evidence): Option[FHIRDate]                                = t.lastReviewDate
  def extractRelatedArtifact(t: Evidence): LitSeq[RelatedArtifact]                        = t.relatedArtifact
  def extractModifierExtension(t: Evidence): LitSeq[Extension]                            = t.modifierExtension
  def extractCertainty(t: Evidence): LitSeq[Evidence.Certainty]                           = t.certainty
  def extractVariableDefinition(t: Evidence): NonEmptyLitSeq[Evidence.VariableDefinition] = t.variableDefinition
  override val thisName: String                                                           = "Evidence"
  override val searchParams: Map[String, Evidence => Seq[Any]] = Map(
    "context-type-quantity" -> (obj => obj.useContext.toSeq),
    "description"           -> (obj => obj.description.toSeq),
    "context"               -> (obj => obj.useContext.map(_.value).flatMap(_.as[CodeableConcept]).toSeq),
    "date"                  -> (obj => obj.date.toSeq),
    "context-type"          -> (obj => obj.useContext.map(_.code).toSeq),
    "identifier"            -> (obj => obj.identifier.toSeq),
    "url"                   -> (obj => obj.url.toSeq),
    "context-type-value"    -> (obj => obj.useContext.toSeq),
    "version"               -> (obj => obj.version.toSeq),
    "status"                -> (obj => Seq(obj.status)),
    "publisher"             -> (obj => obj.publisher.toSeq),
    "title"                 -> (obj => obj.title.toSeq),
    "context-quantity" -> (obj =>
      obj.useContext.map(_.value).flatMap(_.as[Quantity]).toSeq ++
        obj.useContext.map(_.value).flatMap(_.as[Range]).toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Evidence] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Evidence(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[UriStr]]("url", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("date", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("title", Some(None)),
          cursor.decodeAs[PUBLICATION_STATUS]("status", None),
          cursor.decodeAs[LitSeq[ContactDetail]]("author", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[ContactDetail]]("editor", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("version", Some(None)),
          cursor.decodeAs[LitSeq[ContactDetail]]("contact", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[ContactDetail]]("reviewer", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[ContactDetail]]("endorser", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeOptRef[UnionMarkdownOrReference]("citeAs"),
          cursor.decodeAs[Option[String]]("publisher", Some(None)),
          cursor.decodeAs[Option[Markdown]]("assertion", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("studyType", Some(None)),
          cursor.decodeAs[LitSeq[Statistic]]("statistic", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[UsageContext]]("useContext", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Markdown]]("description", Some(None)),
          cursor.decodeAs[Option[FHIRDate]]("approvalDate", Some(None)),
          cursor.decodeAs[LitSeq[OrderedDistribution]]("distribution", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("synthesisType", Some(None)),
          cursor.decodeAs[Option[FHIRDate]]("lastReviewDate", Some(None)),
          cursor.decodeAs[LitSeq[RelatedArtifact]]("relatedArtifact", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Evidence.Certainty]]("certainty", Some(LitSeq.empty)),
          cursor.decodeAs[NonEmptyLitSeq[Evidence.VariableDefinition]]("variableDefinition", None),
          decodeAttributes(cursor)
        )
      ))
}

/** The Evidence Resource provides a machine-interpretable expression of an evidence concept including the evidence variables (eg
  * population, exposures/interventions, comparators, outcomes, measured variables, confounding variables), the statistics, and
  * the certainty of this evidence.
  *
  * Subclass of [[hl7.model.MetadataResource]] (Common Ancestor declaration for conformance and knowledge artifact resources.)
  *
  * @constructor
  *   Introduces the fields note, citeAs, assertion, studyType, statistic, distribution, synthesisType, certainty,
  *   variableDefinition.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param url
  *   - An absolute URI that is used to identify this evidence when it is referenced in a specification, model, design or an
  *   instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at
  *   which an authoritative instance of this summary is (or will be) published. This URL can be the target of a canonical
  *   reference. It SHALL remain the same when the summary is stored on different servers.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *   not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *   resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to
  *   make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be
  *   represented in the narrative to ensure clinical safety.
  * @param date
  *   - The date (and optionally time) when the summary was published. The date must change when the business version changes and
  *   it must change if the status code changes. In addition, it should change when the substantive content of the summary
  *   changes.
  * @param note
  *   - Footnotes and/or explanatory notes.
  * @param title
  *   - A short, descriptive, user-friendly title for the summary.
  * @param status
  *   - The status of this summary. Enables tracking the life-cycle of the content.
  * @param author
  *   - An individiual, organization, or device primarily involved in the creation and maintenance of the content.
  * @param editor
  *   - An individiual, organization, or device primarily responsible for internal coherence of the content.
  * @param version
  *   - The identifier that is used to identify this version of the summary when it is referenced in a specification, model,
  *   design or instance. This is an arbitrary value managed by the summary author and is not expected to be globally unique. For
  *   example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that
  *   versions can be placed in a lexicographical sequence.
  * @param contact
  *   - Contact details to assist a user in finding and communicating with the publisher.
  * @param language
  *   - The base language in which the resource is written.
  * @param reviewer
  *   - An individiual, organization, or device primarily responsible for review of some aspect of the content.
  * @param endorser
  *   - An individiual, organization, or device responsible for officially endorsing the content for use in some setting.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param citeAs
  *   - Citation Resource or display of suggested citation for this evidence.
  * @param publisher
  *   - The name of the organization or individual that published the evidence.
  * @param assertion
  *   - Declarative description of the Evidence.
  * @param studyType
  *   - The type of study that produced this evidence.
  * @param statistic
  *   - Values and parameters for a single statistic.
  * @param identifier
  *   - A formal identifier that is used to identify this summary when it is represented in other formats, or referenced in a
  *   specification, model, design or an instance.
  * @param useContext
  *   - The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be
  *   general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be
  *   used to assist with indexing and searching for appropriate evidence instances.
  * @param description
  *   - A free text natural language description of the evidence from a consumer's perspective.
  * @param approvalDate
  *   - The date on which the resource content was approved by the publisher. Approval happens once when the content is officially
  *   approved for usage.
  * @param distribution
  *   - An ordered group of statistics.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param synthesisType
  *   - The method to combine studies.
  * @param lastReviewDate
  *   - The date on which the resource content was last reviewed. Review happens periodically after approval but does not change
  *   the original approval date.
  * @param relatedArtifact
  *   - Link or citation to artifact associated with the summary.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *   the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually
  *   modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict
  *   set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param certainty
  *   - Assessment of certainty, confidence in the estimates, or quality of the evidence.
  * @param variableDefinition
  *   - Evidence variable such as population, exposure, or outcome.
  */
@POJOBoilerplate
class Evidence(
    override val id: Option[String] = None,
    override val url: Option[UriStr] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    override val date: Option[FHIRDateTime] = None,
    val note: LitSeq[Annotation] = LitSeq.empty,
    override val title: Option[String] = None,
    override val status: PUBLICATION_STATUS,
    override val author: LitSeq[ContactDetail] = LitSeq.empty,
    override val editor: LitSeq[ContactDetail] = LitSeq.empty,
    override val version: Option[String] = None,
    override val contact: LitSeq[ContactDetail] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    override val reviewer: LitSeq[ContactDetail] = LitSeq.empty,
    override val endorser: LitSeq[ContactDetail] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val citeAs: Option[Evidence.CiteAsChoice] = None,
    override val publisher: Option[String] = None,
    val assertion: Option[Markdown] = None,
    val studyType: Option[CodeableConcept] = None,
    val statistic: LitSeq[Statistic] = LitSeq.empty,
    override val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val useContext: LitSeq[UsageContext] = LitSeq.empty,
    override val description: Option[Markdown] = None,
    override val approvalDate: Option[FHIRDate] = None,
    val distribution: LitSeq[OrderedDistribution] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    val synthesisType: Option[CodeableConcept] = None,
    override val lastReviewDate: Option[FHIRDate] = None,
    override val relatedArtifact: LitSeq[RelatedArtifact] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val certainty: LitSeq[Evidence.Certainty] = LitSeq.empty,
    val variableDefinition: NonEmptyLitSeq[Evidence.VariableDefinition],
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends MetadataResource(
      id = id,
      url = url,
      meta = meta,
      text = text,
      date = date,
      title = title,
      status = status,
      author = author,
      editor = editor,
      version = version,
      contact = contact,
      language = language,
      reviewer = reviewer,
      endorser = endorser,
      contained = contained,
      publisher = publisher,
      extension = extension,
      identifier = identifier,
      useContext = useContext,
      description = description,
      approvalDate = approvalDate,
      implicitRules = implicitRules,
      lastReviewDate = lastReviewDate,
      relatedArtifact = relatedArtifact,
      modifierExtension = modifierExtension,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Evidence"
}
