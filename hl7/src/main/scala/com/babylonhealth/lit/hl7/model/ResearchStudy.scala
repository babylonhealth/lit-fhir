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
import com.babylonhealth.lit.hl7.RESEARCH_STUDY_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object ResearchStudy extends CompanionFor[ResearchStudy] {
  implicit def summonObjectAndCompanionResearchStudy241302297(
      o: ResearchStudy): ObjectAndCompanion[ResearchStudy, ResearchStudy.type] = ObjectAndCompanion(o, this)
  override type ResourceType = ResearchStudy
  override type ParentType   = ResearchStudy
  override val baseType: CompanionFor[ResourceType] = ResearchStudy
  override val parentType: CompanionFor[ParentType] = ResearchStudy
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/ResearchStudy")
  object Objective extends CompanionFor[Objective] {
    implicit def summonObjectAndCompanionObjective_1669158500(o: Objective): ObjectAndCompanion[Objective, Objective.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Objective
    override type ParentType   = Objective
    override val parentType: CompanionFor[ResourceType] = Objective
    def apply(
        id: Option[String] = None,
        name: Option[String] = None,
        `type`: Option[CodeableConcept] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Objective = new Objective(
      id,
      name,
      `type`,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Objective): Option[(Option[String], Option[String], Option[CodeableConcept], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.name, o.`type`, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val name: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("name", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, name, `type`, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Objective): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[String]](name, t.name),
      FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Objective] = this
    val thisName: String                  = "Objective"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Objective] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Objective(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[String]]("name", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Objective(
      override val id: Option[String] = None,
      val name: Option[String] = None,
      val `type`: Option[CodeableConcept] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Arm extends CompanionFor[Arm] {
    implicit def summonObjectAndCompanionArm_1669158500(o: Arm): ObjectAndCompanion[Arm, Arm.type] = ObjectAndCompanion(o, this)
    override type ResourceType = Arm
    override type ParentType   = Arm
    override val parentType: CompanionFor[ResourceType] = Arm
    def apply(
        id: Option[String] = None,
        name: String,
        `type`: Option[CodeableConcept] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        description: Option[String] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Arm = new Arm(
      id,
      name,
      `type`,
      extension,
      description,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Arm): Option[(Option[String], String, Option[CodeableConcept], LitSeq[Extension], Option[String], LitSeq[Extension])] =
      Some((o.id, o.name, o.`type`, o.extension, o.description, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val name: FHIRComponentFieldMeta[String] =
      FHIRComponentFieldMeta("name", lTagOf[String], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val description: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, name, `type`, extension, description, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Arm): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[String](name, t.name),
      FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[String]](description, t.description),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Arm] = this
    val thisName: String            = "Arm"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Arm] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Arm(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[String]("name", None),
            cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("description", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Arm(
      override val id: Option[String] = None,
      val name: String,
      val `type`: Option[CodeableConcept] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val description: Option[String] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      site: LitSeq[Reference] = LitSeq.empty,
      note: LitSeq[Annotation] = LitSeq.empty,
      title: Option[String] = None,
      phase: Option[CodeableConcept] = None,
      focus: LitSeq[CodeableConcept] = LitSeq.empty,
      partOf: LitSeq[Reference] = LitSeq.empty,
      status: RESEARCH_STUDY_STATUS,
      period: Option[Period] = None,
      contact: LitSeq[ContactDetail] = LitSeq.empty,
      keyword: LitSeq[CodeableConcept] = LitSeq.empty,
      sponsor: Option[Reference] = None,
      language: Option[LANGUAGES] = None,
      protocol: LitSeq[Reference] = LitSeq.empty,
      category: LitSeq[CodeableConcept] = LitSeq.empty,
      location: LitSeq[CodeableConcept] = LitSeq.empty,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      condition: LitSeq[CodeableConcept] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      enrollment: LitSeq[Reference] = LitSeq.empty,
      description: Option[Markdown] = None,
      implicitRules: Option[UriStr] = None,
      reasonStopped: Option[CodeableConcept] = None,
      relatedArtifact: LitSeq[RelatedArtifact] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      primaryPurposeType: Option[CodeableConcept] = None,
      principalInvestigator: Option[Reference] = None,
      arm: LitSeq[ResearchStudy.Arm] = LitSeq.empty,
      objective: LitSeq[ResearchStudy.Objective] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): ResearchStudy = new ResearchStudy(
    id,
    meta,
    text,
    site,
    note,
    title,
    phase,
    focus,
    partOf,
    status,
    period,
    contact,
    keyword,
    sponsor,
    language,
    protocol,
    category,
    location,
    contained,
    extension,
    condition,
    identifier,
    enrollment,
    description,
    implicitRules,
    reasonStopped,
    relatedArtifact,
    modifierExtension,
    primaryPurposeType,
    principalInvestigator,
    arm,
    objective,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val site: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("site", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val title: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("title", lTagOf[Option[String]], false, lTagOf[String])
  val phase: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("phase", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val focus: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("focus", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val partOf: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("partOf", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val status: FHIRComponentFieldMeta[RESEARCH_STUDY_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[RESEARCH_STUDY_STATUS], false, lTagOf[RESEARCH_STUDY_STATUS])
  val period: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("period", lTagOf[Option[Period]], false, lTagOf[Period])
  val contact: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("contact", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val keyword: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("keyword", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val sponsor: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("sponsor", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val protocol: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("protocol", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val category: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("category", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val location: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("location", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val condition: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("condition", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val enrollment: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("enrollment", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val description: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("description", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val reasonStopped: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("reasonStopped", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val relatedArtifact: FHIRComponentFieldMeta[LitSeq[RelatedArtifact]] =
    FHIRComponentFieldMeta("relatedArtifact", lTagOf[LitSeq[RelatedArtifact]], false, lTagOf[RelatedArtifact])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val primaryPurposeType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("primaryPurposeType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val principalInvestigator: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("principalInvestigator", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val arm: FHIRComponentFieldMeta[LitSeq[ResearchStudy.Arm]] =
    FHIRComponentFieldMeta("arm", lTagOf[LitSeq[ResearchStudy.Arm]], false, lTagOf[ResearchStudy.Arm])
  val objective: FHIRComponentFieldMeta[LitSeq[ResearchStudy.Objective]] =
    FHIRComponentFieldMeta("objective", lTagOf[LitSeq[ResearchStudy.Objective]], false, lTagOf[ResearchStudy.Objective])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    site,
    note,
    title,
    phase,
    focus,
    partOf,
    status,
    period,
    contact,
    keyword,
    sponsor,
    language,
    protocol,
    category,
    location,
    contained,
    extension,
    condition,
    identifier,
    enrollment,
    description,
    implicitRules,
    reasonStopped,
    relatedArtifact,
    modifierExtension,
    primaryPurposeType,
    principalInvestigator,
    arm,
    objective
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: ResearchStudy): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[LitSeq[Reference]](site, t.site),
    FHIRComponentField[LitSeq[Annotation]](note, t.note),
    FHIRComponentField[Option[String]](title, t.title),
    FHIRComponentField[Option[CodeableConcept]](phase, t.phase),
    FHIRComponentField[LitSeq[CodeableConcept]](focus, t.focus),
    FHIRComponentField[LitSeq[Reference]](partOf, t.partOf),
    FHIRComponentField[RESEARCH_STUDY_STATUS](status, t.status),
    FHIRComponentField[Option[Period]](period, t.period),
    FHIRComponentField[LitSeq[ContactDetail]](contact, t.contact),
    FHIRComponentField[LitSeq[CodeableConcept]](keyword, t.keyword),
    FHIRComponentField[Option[Reference]](sponsor, t.sponsor),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Reference]](protocol, t.protocol),
    FHIRComponentField[LitSeq[CodeableConcept]](category, t.category),
    FHIRComponentField[LitSeq[CodeableConcept]](location, t.location),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[CodeableConcept]](condition, t.condition),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[LitSeq[Reference]](enrollment, t.enrollment),
    FHIRComponentField[Option[Markdown]](description, t.description),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[CodeableConcept]](reasonStopped, t.reasonStopped),
    FHIRComponentField[LitSeq[RelatedArtifact]](relatedArtifact, t.relatedArtifact),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Option[CodeableConcept]](primaryPurposeType, t.primaryPurposeType),
    FHIRComponentField[Option[Reference]](principalInvestigator, t.principalInvestigator),
    FHIRComponentField[LitSeq[ResearchStudy.Arm]](arm, t.arm),
    FHIRComponentField[LitSeq[ResearchStudy.Objective]](objective, t.objective)
  )
  def extractId(t: ResearchStudy): Option[String]                          = t.id
  def extractMeta(t: ResearchStudy): Option[Meta]                          = t.meta
  def extractText(t: ResearchStudy): Option[Narrative]                     = t.text
  def extractSite(t: ResearchStudy): LitSeq[Reference]                     = t.site
  def extractNote(t: ResearchStudy): LitSeq[Annotation]                    = t.note
  def extractTitle(t: ResearchStudy): Option[String]                       = t.title
  def extractPhase(t: ResearchStudy): Option[CodeableConcept]              = t.phase
  def extractFocus(t: ResearchStudy): LitSeq[CodeableConcept]              = t.focus
  def extractPartOf(t: ResearchStudy): LitSeq[Reference]                   = t.partOf
  def extractStatus(t: ResearchStudy): RESEARCH_STUDY_STATUS               = t.status
  def extractPeriod(t: ResearchStudy): Option[Period]                      = t.period
  def extractContact(t: ResearchStudy): LitSeq[ContactDetail]              = t.contact
  def extractKeyword(t: ResearchStudy): LitSeq[CodeableConcept]            = t.keyword
  def extractSponsor(t: ResearchStudy): Option[Reference]                  = t.sponsor
  def extractLanguage(t: ResearchStudy): Option[LANGUAGES]                 = t.language
  def extractProtocol(t: ResearchStudy): LitSeq[Reference]                 = t.protocol
  def extractCategory(t: ResearchStudy): LitSeq[CodeableConcept]           = t.category
  def extractLocation(t: ResearchStudy): LitSeq[CodeableConcept]           = t.location
  def extractContained(t: ResearchStudy): LitSeq[Resource]                 = t.contained
  def extractExtension(t: ResearchStudy): LitSeq[Extension]                = t.extension
  def extractCondition(t: ResearchStudy): LitSeq[CodeableConcept]          = t.condition
  def extractIdentifier(t: ResearchStudy): LitSeq[Identifier]              = t.identifier
  def extractEnrollment(t: ResearchStudy): LitSeq[Reference]               = t.enrollment
  def extractDescription(t: ResearchStudy): Option[Markdown]               = t.description
  def extractImplicitRules(t: ResearchStudy): Option[UriStr]               = t.implicitRules
  def extractReasonStopped(t: ResearchStudy): Option[CodeableConcept]      = t.reasonStopped
  def extractRelatedArtifact(t: ResearchStudy): LitSeq[RelatedArtifact]    = t.relatedArtifact
  def extractModifierExtension(t: ResearchStudy): LitSeq[Extension]        = t.modifierExtension
  def extractPrimaryPurposeType(t: ResearchStudy): Option[CodeableConcept] = t.primaryPurposeType
  def extractPrincipalInvestigator(t: ResearchStudy): Option[Reference]    = t.principalInvestigator
  def extractArm(t: ResearchStudy): LitSeq[ResearchStudy.Arm]              = t.arm
  def extractObjective(t: ResearchStudy): LitSeq[ResearchStudy.Objective]  = t.objective
  override val thisName: String                                            = "ResearchStudy"
  override val searchParams: Map[String, ResearchStudy => Seq[Any]] = Map(
    "partof"                -> (obj => obj.partOf.toSeq),
    "location"              -> (obj => obj.location.toSeq),
    "principalinvestigator" -> (obj => obj.principalInvestigator.toSeq),
    "identifier"            -> (obj => obj.identifier.toSeq),
    "sponsor"               -> (obj => obj.sponsor.toSeq),
    "site"                  -> (obj => obj.site.toSeq),
    "keyword"               -> (obj => obj.keyword.toSeq),
    "focus"                 -> (obj => obj.focus.toSeq),
    "date"                  -> (obj => obj.period.toSeq),
    "status"                -> (obj => Seq(obj.status)),
    "category"              -> (obj => obj.category.toSeq),
    "title"                 -> (obj => obj.title.toSeq),
    "protocol"              -> (obj => obj.protocol.toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ResearchStudy] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new ResearchStudy(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("site", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("title", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("phase", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("focus", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("partOf", Some(LitSeq.empty)),
          cursor.decodeAs[RESEARCH_STUDY_STATUS]("status", None),
          cursor.decodeAs[Option[Period]]("period", Some(None)),
          cursor.decodeAs[LitSeq[ContactDetail]]("contact", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("keyword", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("sponsor", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("protocol", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("category", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("location", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("condition", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("enrollment", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Markdown]]("description", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("reasonStopped", Some(None)),
          cursor.decodeAs[LitSeq[RelatedArtifact]]("relatedArtifact", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("primaryPurposeType", Some(None)),
          cursor.decodeAs[Option[Reference]]("principalInvestigator", Some(None)),
          cursor.decodeAs[LitSeq[ResearchStudy.Arm]]("arm", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[ResearchStudy.Objective]]("objective", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** A process where a researcher or organization plans and then executes a series of steps intended to increase the field of
  * healthcare-related knowledge. This includes studies of safety, efficacy, comparative effectiveness and other information about
  * medications, devices, therapies and other interventional and investigative techniques. A ResearchStudy involves the gathering
  * of information about human or animal subjects.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields site, note, title, phase, focus, partOf, status, period, contact, keyword, sponsor, protocol,
  *   category, location, condition, identifier, enrollment, description, reasonStopped, relatedArtifact, primaryPurposeType,
  *   principalInvestigator, arm, objective.
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
  * @param site
  *   - A facility in which study activities are conducted.
  * @param note
  *   - Comments made about the study by the performer, subject or other participants.
  * @param title
  *   - A short, descriptive user-friendly label for the study.
  * @param phase
  *   - The stage in the progression of a therapy from initial experimental use in humans in clinical trials to post-market
  *     evaluation.
  * @param focus
  *   - The medication(s), food(s), therapy(ies), device(s) or other concerns or interventions that the study is seeking to gain
  *     more information about.
  * @param partOf
  *   - A larger research study of which this particular study is a component or step.
  * @param status
  *   - The current state of the study.
  * @param period
  *   - Identifies the start date and the expected (or actual, depending on status) end date for the study.
  * @param contact
  *   - Contact details to assist a user in learning more about or engaging with the study.
  * @param keyword
  *   - Key terms to aid in searching for or filtering the study.
  * @param sponsor
  *   - An organization that initiates the investigation and is legally responsible for the study.
  * @param language
  *   - The base language in which the resource is written.
  * @param protocol
  *   - The set of steps expected to be performed as part of the execution of the study.
  * @param category
  *   - Codes categorizing the type of study such as investigational vs. observational, type of blinding, type of randomization,
  *     safety vs. efficacy, etc.
  * @param location
  *   - Indicates a country, state or other region where the study is taking place.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *     identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *     of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *     Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *     of the extension.
  * @param condition
  *   - The condition that is the focus of the study. For example, In a study to examine risk factors for Lupus, might have as an
  *     inclusion criterion "healthy volunteer", but the target condition code would be a Lupus SNOMED code.
  * @param identifier
  *   - Identifiers assigned to this research study by the sponsor or other systems.
  * @param enrollment
  *   - Reference to a Group that defines the criteria for and quantity of subjects participating in the study. E.g. " 200 female
  *     Europeans between the ages of 20 and 45 with early onset diabetes".
  * @param description
  *   - A full description of how the study is being conducted.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *     processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *     other profiles etc.
  * @param reasonStopped
  *   - A description and/or code explaining the premature termination of the study.
  * @param relatedArtifact
  *   - Citations, references and other related documents.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *     the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *     Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *     strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *     extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *     processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of
  *     any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param primaryPurposeType
  *   - The type of study based upon the intent of the study's activities. A classification of the intent of the study.
  * @param principalInvestigator
  *   - A researcher in a study who oversees multiple aspects of the study, such as concept development, protocol writing,
  *     protocol submission for IRB approval, participant recruitment, informed consent, data collection, analysis, interpretation
  *     and presentation.
  * @param arm
  *   - Describes an expected sequence of events for one of the participants of a study. E.g. Exposure to drug A, wash-out,
  *     exposure to drug B, wash-out, follow-up.
  * @param objective
  *   - A goal that the study is aiming to achieve in terms of a scientific question to be answered by the analysis of data
  *     collected during the study.
  */
@POJOBoilerplate
class ResearchStudy(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val site: LitSeq[Reference] = LitSeq.empty,
    val note: LitSeq[Annotation] = LitSeq.empty,
    val title: Option[String] = None,
    val phase: Option[CodeableConcept] = None,
    val focus: LitSeq[CodeableConcept] = LitSeq.empty,
    val partOf: LitSeq[Reference] = LitSeq.empty,
    val status: RESEARCH_STUDY_STATUS,
    val period: Option[Period] = None,
    val contact: LitSeq[ContactDetail] = LitSeq.empty,
    val keyword: LitSeq[CodeableConcept] = LitSeq.empty,
    val sponsor: Option[Reference] = None,
    override val language: Option[LANGUAGES] = None,
    val protocol: LitSeq[Reference] = LitSeq.empty,
    val category: LitSeq[CodeableConcept] = LitSeq.empty,
    val location: LitSeq[CodeableConcept] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val condition: LitSeq[CodeableConcept] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val enrollment: LitSeq[Reference] = LitSeq.empty,
    val description: Option[Markdown] = None,
    override val implicitRules: Option[UriStr] = None,
    val reasonStopped: Option[CodeableConcept] = None,
    val relatedArtifact: LitSeq[RelatedArtifact] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val primaryPurposeType: Option[CodeableConcept] = None,
    val principalInvestigator: Option[Reference] = None,
    val arm: LitSeq[ResearchStudy.Arm] = LitSeq.empty,
    val objective: LitSeq[ResearchStudy.Objective] = LitSeq.empty,
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
  override val thisTypeName: String = "ResearchStudy"
}
