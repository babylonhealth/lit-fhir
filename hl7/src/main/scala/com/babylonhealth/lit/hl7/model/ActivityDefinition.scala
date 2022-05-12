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
import com.babylonhealth.lit.hl7.{
  RESOURCE_TYPES,
  PUBLICATION_STATUS,
  REQUEST_PRIORITY,
  ACTION_PARTICIPANT_TYPE,
  REQUEST_INTENT,
  REQUEST_RESOURCE_TYPES
}
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object ActivityDefinition extends CompanionFor[ActivityDefinition] {
  implicit def summonObjectAndCompanionActivityDefinition1259342455(
      o: ActivityDefinition): ObjectAndCompanion[ActivityDefinition, ActivityDefinition.type] = ObjectAndCompanion(o, this)
  override type ResourceType = ActivityDefinition
  override type ParentType   = ActivityDefinition
  override val baseType: CompanionFor[ResourceType] = ActivityDefinition
  override val parentType: CompanionFor[ParentType] = ActivityDefinition
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/ActivityDefinition")
  object DynamicValue extends CompanionFor[DynamicValue] {
    implicit def summonObjectAndCompanionDynamicValue1702556612(
        o: DynamicValue): ObjectAndCompanion[DynamicValue, DynamicValue.type] = ObjectAndCompanion(o, this)
    override type ResourceType = DynamicValue
    override type ParentType   = DynamicValue
    override val parentType: CompanionFor[ResourceType] = DynamicValue
    def apply(
        id: Option[String] = None,
        path: String,
        extension: LitSeq[Extension] = LitSeq.empty,
        expression: Expression,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): DynamicValue = new DynamicValue(
      id,
      path,
      extension,
      expression,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(o: DynamicValue): Option[(Option[String], String, LitSeq[Extension], Expression, LitSeq[Extension])] = Some(
      (o.id, o.path, o.extension, o.expression, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val path: FHIRComponentFieldMeta[String] =
      FHIRComponentFieldMeta("path", lTagOf[String], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val expression: FHIRComponentFieldMeta[Expression] =
      FHIRComponentFieldMeta("expression", lTagOf[Expression], false, lTagOf[Expression])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, path, extension, expression, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: DynamicValue): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[String](path, t.path),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Expression](expression, t.expression),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[DynamicValue] = this
    val thisName: String                     = "DynamicValue"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[DynamicValue] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new DynamicValue(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[String]("path", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Expression]("expression", None),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class DynamicValue(
      override val id: Option[String] = None,
      val path: String,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val expression: Expression,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Participant extends CompanionFor[Participant] {
    implicit def summonObjectAndCompanionParticipant1702556612(
        o: Participant): ObjectAndCompanion[Participant, Participant.type] = ObjectAndCompanion(o, this)
    override type ResourceType = Participant
    override type ParentType   = Participant
    override val parentType: CompanionFor[ResourceType] = Participant
    def apply(
        id: Option[String] = None,
        `type`: ACTION_PARTICIPANT_TYPE,
        role: Option[CodeableConcept] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Participant = new Participant(
      id,
      `type`,
      role,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Participant): Option[(Option[String], ACTION_PARTICIPANT_TYPE, Option[CodeableConcept], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.`type`, o.role, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[ACTION_PARTICIPANT_TYPE] =
      FHIRComponentFieldMeta("type", lTagOf[ACTION_PARTICIPANT_TYPE], false, lTagOf[ACTION_PARTICIPANT_TYPE])
    val role: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("role", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, `type`, role, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Participant): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[ACTION_PARTICIPANT_TYPE](`type`, t.`type`),
      FHIRComponentField[Option[CodeableConcept]](role, t.role),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Participant] = this
    val thisName: String                    = "Participant"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Participant] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Participant(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[ACTION_PARTICIPANT_TYPE]("type", None),
            cursor.decodeAs[Option[CodeableConcept]]("role", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Participant(
      override val id: Option[String] = None,
      val `type`: ACTION_PARTICIPANT_TYPE,
      val role: Option[CodeableConcept] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  type TimingChoice  = Choice[Union01405873694]
  type SubjectChoice = Choice[UnionCodeableConceptOrReference]
  type ProductChoice = Choice[UnionCodeableConceptOrReference]
  def apply(
      id: Option[String] = None,
      url: Option[UriStr] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      name: Option[String] = None,
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
      version: Option[String] = None,
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
      publisher: Option[String] = None,
      copyright: Option[Markdown] = None,
      timing: Option[ActivityDefinition.TimingChoice] = None,
      transform: Option[Canonical] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      subject: Option[ActivityDefinition.SubjectChoice] = None,
      useContext: LitSeq[UsageContext] = LitSeq.empty,
      product: Option[ActivityDefinition.ProductChoice] = None,
      description: Option[Markdown] = None,
      experimental: Option[Boolean] = None,
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
  ): ActivityDefinition = new ActivityDefinition(
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
  val version: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("version", lTagOf[Option[String]], false, lTagOf[String])
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
  val publisher: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("publisher", lTagOf[Option[String]], false, lTagOf[String])
  val copyright: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("copyright", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val timing: FHIRComponentFieldMeta[Option[ActivityDefinition.TimingChoice]] =
    FHIRComponentFieldMeta("timing", lTagOf[Option[ActivityDefinition.TimingChoice]], true, lTagOf[Union01405873694])
  val transform: FHIRComponentFieldMeta[Option[Canonical]] =
    FHIRComponentFieldMeta("transform", lTagOf[Option[Canonical]], false, lTagOf[Canonical])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val subject: FHIRComponentFieldMeta[Option[ActivityDefinition.SubjectChoice]] =
    FHIRComponentFieldMeta(
      "subject",
      lTagOf[Option[ActivityDefinition.SubjectChoice]],
      true,
      lTagOf[UnionCodeableConceptOrReference])
  val useContext: FHIRComponentFieldMeta[LitSeq[UsageContext]] =
    FHIRComponentFieldMeta("useContext", lTagOf[LitSeq[UsageContext]], false, lTagOf[UsageContext])
  val product: FHIRComponentFieldMeta[Option[ActivityDefinition.ProductChoice]] =
    FHIRComponentFieldMeta(
      "product",
      lTagOf[Option[ActivityDefinition.ProductChoice]],
      true,
      lTagOf[UnionCodeableConceptOrReference])
  val description: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("description", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val experimental: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("experimental", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
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
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: ActivityDefinition): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[UriStr]](url, t.url),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[String]](name, t.name),
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
    FHIRComponentField[Option[String]](version, t.version),
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
    FHIRComponentField[Option[String]](publisher, t.publisher),
    FHIRComponentField[Option[Markdown]](copyright, t.copyright),
    FHIRComponentField[Option[ActivityDefinition.TimingChoice]](timing, t.timing),
    FHIRComponentField[Option[Canonical]](transform, t.transform),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[ActivityDefinition.SubjectChoice]](subject, t.subject),
    FHIRComponentField[LitSeq[UsageContext]](useContext, t.useContext),
    FHIRComponentField[Option[ActivityDefinition.ProductChoice]](product, t.product),
    FHIRComponentField[Option[Markdown]](description, t.description),
    FHIRComponentField[Option[Boolean]](experimental, t.experimental),
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
  def extractId(t: ActivityDefinition): Option[String]                                    = t.id
  def extractUrl(t: ActivityDefinition): Option[UriStr]                                   = t.url
  def extractMeta(t: ActivityDefinition): Option[Meta]                                    = t.meta
  def extractText(t: ActivityDefinition): Option[Narrative]                               = t.text
  def extractName(t: ActivityDefinition): Option[String]                                  = t.name
  def extractDate(t: ActivityDefinition): Option[FHIRDateTime]                            = t.date
  def extractKind(t: ActivityDefinition): Option[REQUEST_RESOURCE_TYPES]                  = t.kind
  def extractCode(t: ActivityDefinition): Option[CodeableConcept]                         = t.code
  def extractTitle(t: ActivityDefinition): Option[String]                                 = t.title
  def extractUsage(t: ActivityDefinition): Option[String]                                 = t.usage
  def extractTopic(t: ActivityDefinition): LitSeq[CodeableConcept]                        = t.topic
  def extractStatus(t: ActivityDefinition): PUBLICATION_STATUS                            = t.status
  def extractAuthor(t: ActivityDefinition): LitSeq[ContactDetail]                         = t.author
  def extractEditor(t: ActivityDefinition): LitSeq[ContactDetail]                         = t.editor
  def extractIntent(t: ActivityDefinition): Option[REQUEST_INTENT]                        = t.intent
  def extractDosage(t: ActivityDefinition): LitSeq[Dosage]                                = t.dosage
  def extractVersion(t: ActivityDefinition): Option[String]                               = t.version
  def extractContact(t: ActivityDefinition): LitSeq[ContactDetail]                        = t.contact
  def extractPurpose(t: ActivityDefinition): Option[Markdown]                             = t.purpose
  def extractLibrary(t: ActivityDefinition): LitSeq[Canonical]                            = t.library
  def extractProfile(t: ActivityDefinition): Option[Canonical]                            = t.profile
  def extractLanguage(t: ActivityDefinition): Option[LANGUAGES]                           = t.language
  def extractSubtitle(t: ActivityDefinition): Option[String]                              = t.subtitle
  def extractReviewer(t: ActivityDefinition): LitSeq[ContactDetail]                       = t.reviewer
  def extractEndorser(t: ActivityDefinition): LitSeq[ContactDetail]                       = t.endorser
  def extractPriority(t: ActivityDefinition): Option[REQUEST_PRIORITY]                    = t.priority
  def extractLocation(t: ActivityDefinition): Option[Reference]                           = t.location
  def extractQuantity(t: ActivityDefinition): Option[Quantity]                            = t.quantity
  def extractBodySite(t: ActivityDefinition): LitSeq[CodeableConcept]                     = t.bodySite
  def extractContained(t: ActivityDefinition): LitSeq[Resource]                           = t.contained
  def extractExtension(t: ActivityDefinition): LitSeq[Extension]                          = t.extension
  def extractPublisher(t: ActivityDefinition): Option[String]                             = t.publisher
  def extractCopyright(t: ActivityDefinition): Option[Markdown]                           = t.copyright
  def extractTiming(t: ActivityDefinition): Option[ActivityDefinition.TimingChoice]       = t.timing
  def extractTransform(t: ActivityDefinition): Option[Canonical]                          = t.transform
  def extractIdentifier(t: ActivityDefinition): LitSeq[Identifier]                        = t.identifier
  def extractSubject(t: ActivityDefinition): Option[ActivityDefinition.SubjectChoice]     = t.subject
  def extractUseContext(t: ActivityDefinition): LitSeq[UsageContext]                      = t.useContext
  def extractProduct(t: ActivityDefinition): Option[ActivityDefinition.ProductChoice]     = t.product
  def extractDescription(t: ActivityDefinition): Option[Markdown]                         = t.description
  def extractExperimental(t: ActivityDefinition): Option[Boolean]                         = t.experimental
  def extractJurisdiction(t: ActivityDefinition): LitSeq[CodeableConcept]                 = t.jurisdiction
  def extractApprovalDate(t: ActivityDefinition): Option[FHIRDate]                        = t.approvalDate
  def extractDoNotPerform(t: ActivityDefinition): Option[Boolean]                         = t.doNotPerform
  def extractImplicitRules(t: ActivityDefinition): Option[UriStr]                         = t.implicitRules
  def extractLastReviewDate(t: ActivityDefinition): Option[FHIRDate]                      = t.lastReviewDate
  def extractEffectivePeriod(t: ActivityDefinition): Option[Period]                       = t.effectivePeriod
  def extractRelatedArtifact(t: ActivityDefinition): LitSeq[RelatedArtifact]              = t.relatedArtifact
  def extractModifierExtension(t: ActivityDefinition): LitSeq[Extension]                  = t.modifierExtension
  def extractSpecimenRequirement(t: ActivityDefinition): LitSeq[Reference]                = t.specimenRequirement
  def extractObservationRequirement(t: ActivityDefinition): LitSeq[Reference]             = t.observationRequirement
  def extractObservationResultRequirement(t: ActivityDefinition): LitSeq[Reference]       = t.observationResultRequirement
  def extractParticipant(t: ActivityDefinition): LitSeq[ActivityDefinition.Participant]   = t.participant
  def extractDynamicValue(t: ActivityDefinition): LitSeq[ActivityDefinition.DynamicValue] = t.dynamicValue
  override val thisName: String                                                           = "ActivityDefinition"
  override val searchParams: Map[String, ActivityDefinition => Seq[Any]] = Map(
    "jurisdiction"          -> (obj => obj.jurisdiction.toSeq),
    "name"                  -> (obj => obj.name.toSeq),
    "context-type-quantity" -> (obj => obj.useContext.toSeq),
    "context"               -> (obj => obj.useContext.map(_.value).flatMap(_.as[CodeableConcept]).toSeq),
    "effective"             -> (obj => obj.effectivePeriod.toSeq),
    "depends-on" -> (obj =>
      obj.relatedArtifact.filter(_.`type`.name == "depends-on").flatMap(_.resource).toSeq ++
        obj.library.toSeq),
    "date"               -> (obj => obj.date.toSeq),
    "topic"              -> (obj => obj.topic.toSeq),
    "identifier"         -> (obj => obj.identifier.toSeq),
    "url"                -> (obj => obj.url.toSeq),
    "description"        -> (obj => obj.description.toSeq),
    "successor"          -> (obj => obj.relatedArtifact.filter(_.`type`.name == "successor").flatMap(_.resource).toSeq),
    "context-type-value" -> (obj => obj.useContext.toSeq),
    "version"            -> (obj => obj.version.toSeq),
    "composed-of"        -> (obj => obj.relatedArtifact.filter(_.`type`.name == "composed-of").flatMap(_.resource).toSeq),
    "status"             -> (obj => Seq(obj.status)),
    "publisher"          -> (obj => obj.publisher.toSeq),
    "title"              -> (obj => obj.title.toSeq),
    "context-quantity" -> (obj =>
      obj.useContext.map(_.value).flatMap(_.as[Quantity]).toSeq ++
        obj.useContext.map(_.value).flatMap(_.as[Range]).toSeq),
    "predecessor"  -> (obj => obj.relatedArtifact.filter(_.`type`.name == "predecessor").flatMap(_.resource).toSeq),
    "context-type" -> (obj => obj.useContext.map(_.code).toSeq),
    "derived-from" -> (obj => obj.relatedArtifact.filter(_.`type`.name == "derived-from").flatMap(_.resource).toSeq)
  )
  // format: off
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ActivityDefinition] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ => Try(
      new ActivityDefinition(
        cursor.decodeAs[Option[String]]("id", Some(None)),
        cursor.decodeAs[Option[UriStr]]("url", Some(None)),
        cursor.decodeAs[Option[Meta]]("meta", Some(None)),
        cursor.decodeAs[Option[Narrative]]("text", Some(None)),
        cursor.decodeAs[Option[String]]("name", Some(None)),
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
        cursor.decodeAs[Option[String]]("version", Some(None)),
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
        cursor.decodeAs[Option[String]]("publisher", Some(None)),
        cursor.decodeAs[Option[Markdown]]("copyright", Some(None)),
        cursor.decodeOptRef[Union01405873694]("timing"),
        cursor.decodeAs[Option[Canonical]]("transform", Some(None)),
        cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
        cursor.decodeOptRef[UnionCodeableConceptOrReference]("subject"),
        cursor.decodeAs[LitSeq[UsageContext]]("useContext", Some(LitSeq.empty)),
        cursor.decodeOptRef[UnionCodeableConceptOrReference]("product"),
        cursor.decodeAs[Option[Markdown]]("description", Some(None)),
        cursor.decodeAs[Option[Boolean]]("experimental", Some(None)),
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

/** This resource allows for the definition of some activity to be performed, independent of a particular patient, practitioner,
  * or other performance context.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields url, name, date, kind, code, title, usage, topic, status, author, editor, intent, dosage, version,
  *   contact, purpose, library, profile, subtitle, reviewer, endorser, priority, location, quantity, bodySite, publisher,
  *   copyright, timing, transform, identifier, subject, useContext, product, description, experimental, jurisdiction,
  *   approvalDate, doNotPerform, lastReviewDate, effectivePeriod, relatedArtifact, specimenRequirement, observationRequirement,
  *   observationResultRequirement, participant, dynamicValue.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param url
  *   - An absolute URI that is used to identify this activity definition when it is referenced in a specification, model, design
  *     or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at
  *     which at which an authoritative instance of this activity definition is (or will be) published. This URL can be the target
  *     of a canonical reference. It SHALL remain the same when the activity definition is stored on different servers.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *     not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *     resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail
  *     to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should
  *     be represented in the narrative to ensure clinical safety.
  * @param name
  *   - A natural language name identifying the activity definition. This name should be usable as an identifier for the module by
  *     machine processing applications such as code generation.
  * @param date
  *   - The date (and optionally time) when the activity definition was published. The date must change when the business version
  *     changes and it must change if the status code changes. In addition, it should change when the substantive content of the
  *     activity definition changes.
  * @param kind
  *   - A description of the kind of resource the activity definition is representing. For example, a MedicationRequest, a
  *     ServiceRequest, or a CommunicationRequest. Typically, but not always, this is a Request resource.
  * @param code
  *   - Detailed description of the type of activity; e.g. What lab test, what procedure, what kind of encounter.
  * @param title
  *   - A short, descriptive, user-friendly title for the activity definition.
  * @param usage
  *   - A detailed description of how the activity definition is used from a clinical perspective.
  * @param topic
  *   - Descriptive topics related to the content of the activity. Topics provide a high-level categorization of the activity that
  *     can be useful for filtering and searching.
  * @param status
  *   - The status of this activity definition. Enables tracking the life-cycle of the content.
  * @param author
  *   - An individiual or organization primarily involved in the creation and maintenance of the content.
  * @param editor
  *   - An individual or organization primarily responsible for internal coherence of the content.
  * @param intent
  *   - Indicates the level of authority/intentionality associated with the activity and where the request should fit into the
  *     workflow chain.
  * @param dosage
  *   - Provides detailed dosage instructions in the same way that they are described for MedicationRequest resources.
  * @param version
  *   - The identifier that is used to identify this version of the activity definition when it is referenced in a specification,
  *     model, design or instance. This is an arbitrary value managed by the activity definition author and is not expected to be
  *     globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also
  *     no expectation that versions can be placed in a lexicographical sequence. To provide a version consistent with the
  *     Decision Support Service specification, use the format Major.Minor.Revision (e.g. 1.0.0). For more information on
  *     versioning knowledge assets, refer to the Decision Support Service specification. Note that a version is required for
  *     non-experimental active assets.
  * @param contact
  *   - Contact details to assist a user in finding and communicating with the publisher.
  * @param purpose
  *   - Explanation of why this activity definition is needed and why it has been designed as it has.
  * @param library
  *   - A reference to a Library resource containing any formal logic used by the activity definition.
  * @param profile
  *   - A profile to which the target of the activity definition is expected to conform.
  * @param language
  *   - The base language in which the resource is written.
  * @param subtitle
  *   - An explanatory or alternate title for the activity definition giving additional information about its content.
  * @param reviewer
  *   - An individual or organization primarily responsible for review of some aspect of the content.
  * @param endorser
  *   - An individual or organization responsible for officially endorsing the content for use in some setting.
  * @param priority
  *   - Indicates how quickly the activity should be addressed with respect to other requests.
  * @param location
  *   - Identifies the facility where the activity will occur; e.g. home, hospital, specific clinic, etc.
  * @param quantity
  *   - Identifies the quantity expected to be consumed at once (per dose, per meal, etc.).
  * @param bodySite
  *   - Indicates the sites on the subject's body where the procedure should be performed (I.e. the target sites).
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *     identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *     of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *     Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *     of the extension.
  * @param publisher
  *   - The name of the organization or individual that published the activity definition.
  * @param copyright
  *   - A copyright statement relating to the activity definition and/or its contents. Copyright statements are generally legal
  *     restrictions on the use and publishing of the activity definition.
  * @param timing
  *   - The period, timing or frequency upon which the described activity is to occur.
  * @param transform
  *   - A reference to a StructureMap resource that defines a transform that can be executed to produce the intent resource using
  *     the ActivityDefinition instance as the input.
  * @param identifier
  *   - A formal identifier that is used to identify this activity definition when it is represented in other formats, or
  *     referenced in a specification, model, design or an instance.
  * @param subject
  *   - A code or group definition that describes the intended subject of the activity being defined.
  * @param useContext
  *   - The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be
  *     general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be
  *     used to assist with indexing and searching for appropriate activity definition instances.
  * @param product
  *   - Identifies the food, drug or other product being consumed or supplied in the activity.
  * @param description
  *   - A free text natural language description of the activity definition from a consumer's perspective.
  * @param experimental
  *   - A Boolean value to indicate that this activity definition is authored for testing purposes (or
  *     education/evaluation/marketing) and is not intended to be used for genuine usage.
  * @param jurisdiction
  *   - A legal or geographic region in which the activity definition is intended to be used.
  * @param approvalDate
  *   - The date on which the resource content was approved by the publisher. Approval happens once when the content is officially
  *     approved for usage.
  * @param doNotPerform
  *   - Set this to true if the definition is to indicate that a particular activity should NOT be performed. If true, this
  *     element should be interpreted to reinforce a negative coding. For example NPO as a code with a doNotPerform of true would
  *     still indicate to NOT perform the action.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *     processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *     other profiles etc.
  * @param lastReviewDate
  *   - The date on which the resource content was last reviewed. Review happens periodically after approval but does not change
  *     the original approval date.
  * @param effectivePeriod
  *   - The period during which the activity definition content was or is planned to be in active use.
  * @param relatedArtifact
  *   - Related artifacts such as additional documentation, justification, or bibliographic references.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *     the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *     Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *     strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *     extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *     processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of
  *     any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param specimenRequirement
  *   - Defines specimen requirements for the action to be performed, such as required specimens for a lab test.
  * @param observationRequirement
  *   - Defines observation requirements for the action to be performed, such as body weight or surface area.
  * @param observationResultRequirement
  *   - Defines the observations that are expected to be produced by the action.
  * @param participant
  *   - Indicates who should participate in performing the action described.
  * @param dynamicValue
  *   - Dynamic values that will be evaluated to produce values for elements of the resulting resource. For example, if the dosage
  *     of a medication must be computed based on the patient's weight, a dynamic value would be used to specify an expression
  *     that calculated the weight, and the path on the request resource that would contain the result.
  */
@POJOBoilerplate
class ActivityDefinition(
    override val id: Option[String] = None,
    val url: Option[UriStr] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val name: Option[String] = None,
    val date: Option[FHIRDateTime] = None,
    val kind: Option[REQUEST_RESOURCE_TYPES] = None,
    val code: Option[CodeableConcept] = None,
    val title: Option[String] = None,
    val usage: Option[String] = None,
    val topic: LitSeq[CodeableConcept] = LitSeq.empty,
    val status: PUBLICATION_STATUS,
    val author: LitSeq[ContactDetail] = LitSeq.empty,
    val editor: LitSeq[ContactDetail] = LitSeq.empty,
    val intent: Option[REQUEST_INTENT] = None,
    val dosage: LitSeq[Dosage] = LitSeq.empty,
    val version: Option[String] = None,
    val contact: LitSeq[ContactDetail] = LitSeq.empty,
    val purpose: Option[Markdown] = None,
    val library: LitSeq[Canonical] = LitSeq.empty,
    val profile: Option[Canonical] = None,
    override val language: Option[LANGUAGES] = None,
    val subtitle: Option[String] = None,
    val reviewer: LitSeq[ContactDetail] = LitSeq.empty,
    val endorser: LitSeq[ContactDetail] = LitSeq.empty,
    val priority: Option[REQUEST_PRIORITY] = None,
    val location: Option[Reference] = None,
    val quantity: Option[Quantity] = None,
    val bodySite: LitSeq[CodeableConcept] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val publisher: Option[String] = None,
    val copyright: Option[Markdown] = None,
    val timing: Option[ActivityDefinition.TimingChoice] = None,
    val transform: Option[Canonical] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val subject: Option[ActivityDefinition.SubjectChoice] = None,
    val useContext: LitSeq[UsageContext] = LitSeq.empty,
    val product: Option[ActivityDefinition.ProductChoice] = None,
    val description: Option[Markdown] = None,
    val experimental: Option[Boolean] = None,
    val jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
    val approvalDate: Option[FHIRDate] = None,
    val doNotPerform: Option[Boolean] = None,
    override val implicitRules: Option[UriStr] = None,
    val lastReviewDate: Option[FHIRDate] = None,
    val effectivePeriod: Option[Period] = None,
    val relatedArtifact: LitSeq[RelatedArtifact] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val specimenRequirement: LitSeq[Reference] = LitSeq.empty,
    val observationRequirement: LitSeq[Reference] = LitSeq.empty,
    val observationResultRequirement: LitSeq[Reference] = LitSeq.empty,
    val participant: LitSeq[ActivityDefinition.Participant] = LitSeq.empty,
    val dynamicValue: LitSeq[ActivityDefinition.DynamicValue] = LitSeq.empty,
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
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "ActivityDefinition"
}
