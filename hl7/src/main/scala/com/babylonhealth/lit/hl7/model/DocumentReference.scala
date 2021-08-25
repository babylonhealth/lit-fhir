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
import com.babylonhealth.lit.hl7.{ COMPOSITION_STATUS, DOCUMENT_REFERENCE_STATUS, DOCUMENT_RELATIONSHIP_TYPE }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object DocumentReference extends CompanionFor[DocumentReference] {
  implicit def summonObjectAndCompanionDocumentReference_1882364645(
      o: DocumentReference): ObjectAndCompanion[DocumentReference, DocumentReference.type] = ObjectAndCompanion(o, this)
  override type ResourceType = DocumentReference
  override type ParentType   = DocumentReference
  override val baseType: CompanionFor[ResourceType] = DocumentReference
  override val parentType: CompanionFor[ParentType] = DocumentReference
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/DocumentReference")
  object RelatesTo extends CompanionFor[RelatesTo] {
    implicit def summonObjectAndCompanionRelatesTo1889384608(o: RelatesTo): ObjectAndCompanion[RelatesTo, RelatesTo.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = RelatesTo
    override type ParentType   = RelatesTo
    override val parentType: CompanionFor[ResourceType] = RelatesTo
    def apply(
        id: Option[String] = None,
        code: DOCUMENT_RELATIONSHIP_TYPE,
        target: Reference,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): RelatesTo = new RelatesTo(
      id,
      code,
      target,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: RelatesTo): Option[(Option[String], DOCUMENT_RELATIONSHIP_TYPE, Reference, LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.code, o.target, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val code: FHIRComponentFieldMeta[DOCUMENT_RELATIONSHIP_TYPE] =
      FHIRComponentFieldMeta("code", lTagOf[DOCUMENT_RELATIONSHIP_TYPE], false, lTagOf[DOCUMENT_RELATIONSHIP_TYPE])
    val target: FHIRComponentFieldMeta[Reference] =
      FHIRComponentFieldMeta("target", lTagOf[Reference], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, code, target, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: RelatesTo): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[DOCUMENT_RELATIONSHIP_TYPE](code, t.code),
      FHIRComponentField[Reference](target, t.target),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[RelatesTo] = this
    val thisName: String                  = "RelatesTo"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[RelatesTo] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new RelatesTo(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[DOCUMENT_RELATIONSHIP_TYPE]("code", None),
            cursor.decodeAs[Reference]("target", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class RelatesTo(
      override val id: Option[String] = None,
      val code: DOCUMENT_RELATIONSHIP_TYPE,
      val target: Reference,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Attester extends CompanionFor[Attester] {
    implicit def summonObjectAndCompanionAttester1889384608(o: Attester): ObjectAndCompanion[Attester, Attester.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Attester
    override type ParentType   = Attester
    override val parentType: CompanionFor[ResourceType] = Attester
    def apply(
        id: Option[String] = None,
        mode: Code,
        time: Option[FHIRDateTime] = None,
        party: Option[Reference] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Attester = new Attester(
      id,
      mode,
      time,
      party,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Attester): Option[(Option[String], Code, Option[FHIRDateTime], Option[Reference], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.mode, o.time, o.party, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val mode: FHIRComponentFieldMeta[Code] =
      FHIRComponentFieldMeta("mode", lTagOf[Code], false, lTagOf[Code])
    val time: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
      FHIRComponentFieldMeta("time", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
    val party: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("party", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, mode, time, party, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Attester): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Code](mode, t.mode),
      FHIRComponentField[Option[FHIRDateTime]](time, t.time),
      FHIRComponentField[Option[Reference]](party, t.party),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Attester] = this
    val thisName: String                 = "Attester"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Attester] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Attester(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Code]("mode", None),
            cursor.decodeAs[Option[FHIRDateTime]]("time", Some(None)),
            cursor.decodeAs[Option[Reference]]("party", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Attester(
      override val id: Option[String] = None,
      val mode: Code,
      val time: Option[FHIRDateTime] = None,
      val party: Option[Reference] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Content extends CompanionFor[Content] {
    implicit def summonObjectAndCompanionContent1889384608(o: Content): ObjectAndCompanion[Content, Content.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Content
    override type ParentType   = Content
    override val parentType: CompanionFor[ResourceType] = Content
    def apply(
        id: Option[String] = None,
        format: Option[Coding] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        attachment: Attachment,
        identifier: Option[Identifier] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Content = new Content(
      id,
      format,
      extension,
      attachment,
      identifier,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Content): Option[(Option[String], Option[Coding], LitSeq[Extension], Attachment, Option[Identifier], LitSeq[Extension])] =
      Some((o.id, o.format, o.extension, o.attachment, o.identifier, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val format: FHIRComponentFieldMeta[Option[Coding]] =
      FHIRComponentFieldMeta("format", lTagOf[Option[Coding]], false, lTagOf[Coding])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val attachment: FHIRComponentFieldMeta[Attachment] =
      FHIRComponentFieldMeta("attachment", lTagOf[Attachment], false, lTagOf[Attachment])
    val identifier: FHIRComponentFieldMeta[Option[Identifier]] =
      FHIRComponentFieldMeta("identifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, format, extension, attachment, identifier, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Content): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Coding]](format, t.format),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Attachment](attachment, t.attachment),
      FHIRComponentField[Option[Identifier]](identifier, t.identifier),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Content] = this
    val thisName: String                = "Content"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Content] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Content(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[Coding]]("format", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Attachment]("attachment", None),
            cursor.decodeAs[Option[Identifier]]("identifier", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Content(
      override val id: Option[String] = None,
      val format: Option[Coding] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val attachment: Attachment,
      val identifier: Option[Identifier] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      `type`: Option[CodeableConcept] = None,
      date: Option[ZonedDateTime] = None,
      event: LitSeq[CodeableConcept] = LitSeq.empty,
      status: DOCUMENT_REFERENCE_STATUS,
      period: Option[Period] = None,
      author: LitSeq[Reference] = LitSeq.empty,
      basedOn: LitSeq[Reference] = LitSeq.empty,
      subject: Option[Reference] = None,
      related: LitSeq[Reference] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      category: LitSeq[CodeableConcept] = LitSeq.empty,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      docStatus: Option[COMPOSITION_STATUS] = None,
      encounter: LitSeq[Reference] = LitSeq.empty,
      custodian: Option[Reference] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      description: Option[Markdown] = None,
      facilityType: Option[CodeableConcept] = None,
      implicitRules: Option[UriStr] = None,
      securityLabel: LitSeq[CodeableConcept] = LitSeq.empty,
      practiceSetting: Option[CodeableConcept] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      sourcePatientInfo: Option[Reference] = None,
      content: NonEmptyLitSeq[DocumentReference.Content],
      attester: LitSeq[DocumentReference.Attester] = LitSeq.empty,
      relatesTo: LitSeq[DocumentReference.RelatesTo] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): DocumentReference = new DocumentReference(
    id,
    meta,
    text,
    `type`,
    date,
    event,
    status,
    period,
    author,
    basedOn,
    subject,
    related,
    language,
    category,
    contained,
    extension,
    docStatus,
    encounter,
    custodian,
    identifier,
    description,
    facilityType,
    implicitRules,
    securityLabel,
    practiceSetting,
    modifierExtension,
    sourcePatientInfo,
    content,
    attester,
    relatesTo,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val date: FHIRComponentFieldMeta[Option[ZonedDateTime]] =
    FHIRComponentFieldMeta("date", lTagOf[Option[ZonedDateTime]], false, lTagOf[ZonedDateTime])
  val event: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("event", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val status: FHIRComponentFieldMeta[DOCUMENT_REFERENCE_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[DOCUMENT_REFERENCE_STATUS], false, lTagOf[DOCUMENT_REFERENCE_STATUS])
  val period: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("period", lTagOf[Option[Period]], false, lTagOf[Period])
  val author: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("author", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val basedOn: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("basedOn", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val subject: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("subject", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val related: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("related", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val category: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("category", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val docStatus: FHIRComponentFieldMeta[Option[COMPOSITION_STATUS]] =
    FHIRComponentFieldMeta("docStatus", lTagOf[Option[COMPOSITION_STATUS]], false, lTagOf[COMPOSITION_STATUS])
  val encounter: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("encounter", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val custodian: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("custodian", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val description: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("description", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val facilityType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("facilityType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val securityLabel: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("securityLabel", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val practiceSetting: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("practiceSetting", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val sourcePatientInfo: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("sourcePatientInfo", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val content: FHIRComponentFieldMeta[NonEmptyLitSeq[DocumentReference.Content]] =
    FHIRComponentFieldMeta("content", lTagOf[NonEmptyLitSeq[DocumentReference.Content]], false, lTagOf[DocumentReference.Content])
  val attester: FHIRComponentFieldMeta[LitSeq[DocumentReference.Attester]] =
    FHIRComponentFieldMeta("attester", lTagOf[LitSeq[DocumentReference.Attester]], false, lTagOf[DocumentReference.Attester])
  val relatesTo: FHIRComponentFieldMeta[LitSeq[DocumentReference.RelatesTo]] =
    FHIRComponentFieldMeta("relatesTo", lTagOf[LitSeq[DocumentReference.RelatesTo]], false, lTagOf[DocumentReference.RelatesTo])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    `type`,
    date,
    event,
    status,
    period,
    author,
    basedOn,
    subject,
    related,
    language,
    category,
    contained,
    extension,
    docStatus,
    encounter,
    custodian,
    identifier,
    description,
    facilityType,
    implicitRules,
    securityLabel,
    practiceSetting,
    modifierExtension,
    sourcePatientInfo,
    content,
    attester,
    relatesTo
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: DocumentReference): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
    FHIRComponentField[Option[ZonedDateTime]](date, t.date),
    FHIRComponentField[LitSeq[CodeableConcept]](event, t.event),
    FHIRComponentField[DOCUMENT_REFERENCE_STATUS](status, t.status),
    FHIRComponentField[Option[Period]](period, t.period),
    FHIRComponentField[LitSeq[Reference]](author, t.author),
    FHIRComponentField[LitSeq[Reference]](basedOn, t.basedOn),
    FHIRComponentField[Option[Reference]](subject, t.subject),
    FHIRComponentField[LitSeq[Reference]](related, t.related),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[CodeableConcept]](category, t.category),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[COMPOSITION_STATUS]](docStatus, t.docStatus),
    FHIRComponentField[LitSeq[Reference]](encounter, t.encounter),
    FHIRComponentField[Option[Reference]](custodian, t.custodian),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[Markdown]](description, t.description),
    FHIRComponentField[Option[CodeableConcept]](facilityType, t.facilityType),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[CodeableConcept]](securityLabel, t.securityLabel),
    FHIRComponentField[Option[CodeableConcept]](practiceSetting, t.practiceSetting),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Option[Reference]](sourcePatientInfo, t.sourcePatientInfo),
    FHIRComponentField[NonEmptyLitSeq[DocumentReference.Content]](content, t.content),
    FHIRComponentField[LitSeq[DocumentReference.Attester]](attester, t.attester),
    FHIRComponentField[LitSeq[DocumentReference.RelatesTo]](relatesTo, t.relatesTo)
  )
  def extractId(t: DocumentReference): Option[String]                                 = t.id
  def extractMeta(t: DocumentReference): Option[Meta]                                 = t.meta
  def extractText(t: DocumentReference): Option[Narrative]                            = t.text
  def extractType(t: DocumentReference): Option[CodeableConcept]                      = t.`type`
  def extractDate(t: DocumentReference): Option[ZonedDateTime]                        = t.date
  def extractEvent(t: DocumentReference): LitSeq[CodeableConcept]                     = t.event
  def extractStatus(t: DocumentReference): DOCUMENT_REFERENCE_STATUS                  = t.status
  def extractPeriod(t: DocumentReference): Option[Period]                             = t.period
  def extractAuthor(t: DocumentReference): LitSeq[Reference]                          = t.author
  def extractBasedOn(t: DocumentReference): LitSeq[Reference]                         = t.basedOn
  def extractSubject(t: DocumentReference): Option[Reference]                         = t.subject
  def extractRelated(t: DocumentReference): LitSeq[Reference]                         = t.related
  def extractLanguage(t: DocumentReference): Option[LANGUAGES]                        = t.language
  def extractCategory(t: DocumentReference): LitSeq[CodeableConcept]                  = t.category
  def extractContained(t: DocumentReference): LitSeq[Resource]                        = t.contained
  def extractExtension(t: DocumentReference): LitSeq[Extension]                       = t.extension
  def extractDocStatus(t: DocumentReference): Option[COMPOSITION_STATUS]              = t.docStatus
  def extractEncounter(t: DocumentReference): LitSeq[Reference]                       = t.encounter
  def extractCustodian(t: DocumentReference): Option[Reference]                       = t.custodian
  def extractIdentifier(t: DocumentReference): LitSeq[Identifier]                     = t.identifier
  def extractDescription(t: DocumentReference): Option[Markdown]                      = t.description
  def extractFacilityType(t: DocumentReference): Option[CodeableConcept]              = t.facilityType
  def extractImplicitRules(t: DocumentReference): Option[UriStr]                      = t.implicitRules
  def extractSecurityLabel(t: DocumentReference): LitSeq[CodeableConcept]             = t.securityLabel
  def extractPracticeSetting(t: DocumentReference): Option[CodeableConcept]           = t.practiceSetting
  def extractModifierExtension(t: DocumentReference): LitSeq[Extension]               = t.modifierExtension
  def extractSourcePatientInfo(t: DocumentReference): Option[Reference]               = t.sourcePatientInfo
  def extractContent(t: DocumentReference): NonEmptyLitSeq[DocumentReference.Content] = t.content
  def extractAttester(t: DocumentReference): LitSeq[DocumentReference.Attester]       = t.attester
  def extractRelatesTo(t: DocumentReference): LitSeq[DocumentReference.RelatesTo]     = t.relatesTo
  override val thisName: String                                                       = "DocumentReference"
  override val searchParams: Map[String, DocumentReference => Seq[Any]] = Map(
    "author"   -> (obj => obj.author.toSeq),
    "location" -> (obj => obj.content.map(_.attachment).flatMap(_.url).toSeq),
    "identifier" -> (obj =>
      obj.content.flatMap(_.identifier).toSeq ++
        obj.identifier.toSeq),
    "description"    -> (obj => obj.description.toSeq),
    "creation"       -> (obj => obj.content.map(_.attachment).flatMap(_.creation).toSeq),
    "relationship"   -> (obj => obj.relatesTo.toSeq),
    "status"         -> (obj => Seq(obj.status)),
    "category"       -> (obj => obj.category.toSeq),
    "facility"       -> (obj => obj.facilityType.toSeq),
    "based-on"       -> (obj => obj.basedOn.toSeq),
    "period"         -> (obj => obj.period.toSeq),
    "patient"        -> (obj => obj.subject.filter(_.reference.exists(_.contains("Patient/"))).toSeq),
    "doc-status"     -> (obj => obj.docStatus.toSeq),
    "format"         -> (obj => obj.content.flatMap(_.format).toSeq),
    "subject"        -> (obj => obj.subject.toSeq),
    "attester"       -> (obj => obj.attester.flatMap(_.party).toSeq),
    "relation"       -> (obj => obj.relatesTo.map(_.code).toSeq),
    "event"          -> (obj => obj.event.toSeq),
    "setting"        -> (obj => obj.practiceSetting.toSeq),
    "related"        -> (obj => obj.related.toSeq),
    "language"       -> (obj => obj.content.map(_.attachment).flatMap(_.language).toSeq),
    "custodian"      -> (obj => obj.custodian.toSeq),
    "date"           -> (obj => obj.date.toSeq),
    "relatesto"      -> (obj => obj.relatesTo.map(_.target).toSeq),
    "security-label" -> (obj => obj.securityLabel.toSeq),
    "type"           -> (obj => obj.`type`.toSeq),
    "encounter"      -> (obj => obj.encounter.toSeq),
    "contenttype"    -> (obj => obj.content.map(_.attachment).flatMap(_.contentType).toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[DocumentReference] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new DocumentReference(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
          cursor.decodeAs[Option[ZonedDateTime]]("date", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("event", Some(LitSeq.empty)),
          cursor.decodeAs[DOCUMENT_REFERENCE_STATUS]("status", None),
          cursor.decodeAs[Option[Period]]("period", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("author", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("basedOn", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("subject", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("related", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("category", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[COMPOSITION_STATUS]]("docStatus", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("encounter", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("custodian", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Markdown]]("description", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("facilityType", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("securityLabel", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("practiceSetting", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("sourcePatientInfo", Some(None)),
          cursor.decodeAs[NonEmptyLitSeq[DocumentReference.Content]]("content", None),
          cursor.decodeAs[LitSeq[DocumentReference.Attester]]("attester", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[DocumentReference.RelatesTo]]("relatesTo", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** A reference to a document of any kind for any purpose. While the term “document” implies a more narrow focus, for this
  * resource this "document" encompasses *any* serialized object with a mime-type, it includes formal patient-centric documents
  * (CDA), clinical notes, scanned paper, non-patient specific documents like policy text, as well as a photo, video, or audio
  * recording acquired or used in healthcare. The DocumentReference resource provides metadata about the document so that the
  * document can be discovered and managed. The actual content may be inline base64 encoded data or provided by direct reference.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields `type`, date, event, status, period, author, basedOn, subject, related, category, docStatus,
  *   encounter, custodian, identifier, description, facilityType, securityLabel, practiceSetting, sourcePatientInfo, content,
  *   attester, relatesTo.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *   not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *   resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to
  *   make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be
  *   represented in the narrative to ensure clinical safety.
  * @param `type`
  *   - Specifies the particular kind of document referenced (e.g. History and Physical, Discharge Summary, Progress Note). This
  *   usually equates to the purpose of making the document referenced.
  * @param date
  *   - When the document reference was created.
  * @param event
  *   - This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some
  *   cases, the event is inherent in the type Code, such as a "History and Physical Report" in which the procedure being
  *   documented is necessarily a "History and Physical" act.
  * @param status
  *   - The status of this document reference.
  * @param period
  *   - The time period over which the service that is described by the document was provided.
  * @param author
  *   - Identifies who is responsible for adding the information to the document.
  * @param basedOn
  *   - A procedure that is fulfilled in whole or in part by the creation of this media.
  * @param subject
  *   - Who or what the document is about. The document can be about a person, (patient or healthcare practitioner), a device
  *   (e.g. a machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that
  *   share a common exposure).
  * @param related
  *   - Related identifiers or resources associated with the DocumentReference.
  * @param language
  *   - The base language in which the resource is written.
  * @param category
  *   - A categorization for the type of document referenced - helps for indexing and searching. This may be implied by or derived
  *   from the code specified in the DocumentReference.type.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param docStatus
  *   - The status of the underlying document.
  * @param encounter
  *   - Describes the clinical encounter or type of care that the document content is associated with.
  * @param custodian
  *   - Identifies the organization or group who is responsible for ongoing maintenance of and access to the document.
  * @param identifier
  *   - Other identifiers associated with the document, including version independent identifiers.
  * @param description
  *   - Human-readable description of the source document.
  * @param facilityType
  *   - The kind of facility where the patient was seen.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param securityLabel
  *   - A set of Security-Tag codes specifying the level of privacy/security of the Document. Note that
  *   DocumentReference.meta.security contains the security labels of the "reference" to the document, while
  *   DocumentReference.securityLabel contains a snapshot of the security labels on the document the reference refers to.
  * @param practiceSetting
  *   - This property may convey specifics about the practice setting where the content was created, often reflecting the clinical
  *   specialty.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *   the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually
  *   modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict
  *   set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param sourcePatientInfo
  *   - The Patient Information as known when the document was published. May be a reference to a version specific, or contained.
  * @param content
  *   - The document and format referenced. If there are multiple content element repetitions, these must all represent the same
  *   document in different format, or attachment metadata.
  * @param attester
  *   - A participant who has attested to the accuracy of the composition/document.
  * @param relatesTo
  *   - Relationships that this document has with other document references that already exist.
  */
@POJOBoilerplate
class DocumentReference(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val `type`: Option[CodeableConcept] = None,
    val date: Option[ZonedDateTime] = None,
    val event: LitSeq[CodeableConcept] = LitSeq.empty,
    val status: DOCUMENT_REFERENCE_STATUS,
    val period: Option[Period] = None,
    val author: LitSeq[Reference] = LitSeq.empty,
    val basedOn: LitSeq[Reference] = LitSeq.empty,
    val subject: Option[Reference] = None,
    val related: LitSeq[Reference] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    val category: LitSeq[CodeableConcept] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val docStatus: Option[COMPOSITION_STATUS] = None,
    val encounter: LitSeq[Reference] = LitSeq.empty,
    val custodian: Option[Reference] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val description: Option[Markdown] = None,
    val facilityType: Option[CodeableConcept] = None,
    override val implicitRules: Option[UriStr] = None,
    val securityLabel: LitSeq[CodeableConcept] = LitSeq.empty,
    val practiceSetting: Option[CodeableConcept] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val sourcePatientInfo: Option[Reference] = None,
    val content: NonEmptyLitSeq[DocumentReference.Content],
    val attester: LitSeq[DocumentReference.Attester] = LitSeq.empty,
    val relatesTo: LitSeq[DocumentReference.RelatesTo] = LitSeq.empty,
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
  override val thisTypeName: String = "DocumentReference"
}
