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
import com.babylonhealth.lit.hl7.DOCUMENT_REFERENCE_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object DocumentManifest extends CompanionFor[DocumentManifest] {
  implicit def summonObjectAndCompanionDocumentManifest_1978462625(
      o: DocumentManifest): ObjectAndCompanion[DocumentManifest, DocumentManifest.type] = ObjectAndCompanion(o, this)
  override type ResourceType = DocumentManifest
  override type ParentType   = DocumentManifest
  override val baseType: CompanionFor[ResourceType] = DocumentManifest
  override val parentType: CompanionFor[ParentType] = DocumentManifest
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/DocumentManifest")
  object Related extends CompanionFor[Related] {
    implicit def summonObjectAndCompanionRelated_449398508(o: Related): ObjectAndCompanion[Related, Related.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Related
    override type ParentType   = Related
    override val parentType: CompanionFor[ResourceType] = Related
    def apply(
        id: Option[String] = None,
        ref: Option[Reference] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        identifier: Option[Identifier] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Related = new Related(
      id,
      ref,
      extension,
      identifier,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Related): Option[(Option[String], Option[Reference], LitSeq[Extension], Option[Identifier], LitSeq[Extension])] = Some(
      (o.id, o.ref, o.extension, o.identifier, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val ref: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("ref", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val identifier: FHIRComponentFieldMeta[Option[Identifier]] =
      FHIRComponentFieldMeta("identifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, ref, extension, identifier, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Related): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Reference]](ref, t.ref),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Identifier]](identifier, t.identifier),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Related] = this
    val thisName: String                = "Related"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Related] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Related(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[Reference]]("ref", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Identifier]]("identifier", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Related(
      override val id: Option[String] = None,
      val ref: Option[Reference] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val identifier: Option[Identifier] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      `type`: Option[CodeableConcept] = None,
      status: DOCUMENT_REFERENCE_STATUS,
      author: LitSeq[Reference] = LitSeq.empty,
      source: Option[UriStr] = None,
      subject: Option[Reference] = None,
      created: Option[FHIRDateTime] = None,
      content: NonEmptyLitSeq[Reference],
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      recipient: LitSeq[Reference] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      description: Option[String] = None,
      implicitRules: Option[UriStr] = None,
      masterIdentifier: Option[Identifier] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      related: LitSeq[DocumentManifest.Related] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): DocumentManifest = new DocumentManifest(
    id,
    meta,
    text,
    `type`,
    status,
    author,
    source,
    subject,
    created,
    content,
    language,
    contained,
    extension,
    recipient,
    identifier,
    description,
    implicitRules,
    masterIdentifier,
    modifierExtension,
    related,
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
  val status: FHIRComponentFieldMeta[DOCUMENT_REFERENCE_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[DOCUMENT_REFERENCE_STATUS], false, lTagOf[DOCUMENT_REFERENCE_STATUS])
  val author: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("author", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val source: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("source", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val subject: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("subject", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val created: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("created", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val content: FHIRComponentFieldMeta[NonEmptyLitSeq[Reference]] =
    FHIRComponentFieldMeta("content", lTagOf[NonEmptyLitSeq[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val recipient: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("recipient", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val description: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val masterIdentifier: FHIRComponentFieldMeta[Option[Identifier]] =
    FHIRComponentFieldMeta("masterIdentifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val related: FHIRComponentFieldMeta[LitSeq[DocumentManifest.Related]] =
    FHIRComponentFieldMeta("related", lTagOf[LitSeq[DocumentManifest.Related]], false, lTagOf[DocumentManifest.Related])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    `type`,
    status,
    author,
    source,
    subject,
    created,
    content,
    language,
    contained,
    extension,
    recipient,
    identifier,
    description,
    implicitRules,
    masterIdentifier,
    modifierExtension,
    related
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: DocumentManifest): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
    FHIRComponentField[DOCUMENT_REFERENCE_STATUS](status, t.status),
    FHIRComponentField[LitSeq[Reference]](author, t.author),
    FHIRComponentField[Option[UriStr]](source, t.source),
    FHIRComponentField[Option[Reference]](subject, t.subject),
    FHIRComponentField[Option[FHIRDateTime]](created, t.created),
    FHIRComponentField[NonEmptyLitSeq[Reference]](content, t.content),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[Reference]](recipient, t.recipient),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[String]](description, t.description),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[Identifier]](masterIdentifier, t.masterIdentifier),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[DocumentManifest.Related]](related, t.related)
  )
  def extractId(t: DocumentManifest): Option[String]                        = t.id
  def extractMeta(t: DocumentManifest): Option[Meta]                        = t.meta
  def extractText(t: DocumentManifest): Option[Narrative]                   = t.text
  def extractType(t: DocumentManifest): Option[CodeableConcept]             = t.`type`
  def extractStatus(t: DocumentManifest): DOCUMENT_REFERENCE_STATUS         = t.status
  def extractAuthor(t: DocumentManifest): LitSeq[Reference]                 = t.author
  def extractSource(t: DocumentManifest): Option[UriStr]                    = t.source
  def extractSubject(t: DocumentManifest): Option[Reference]                = t.subject
  def extractCreated(t: DocumentManifest): Option[FHIRDateTime]             = t.created
  def extractContent(t: DocumentManifest): NonEmptyLitSeq[Reference]        = t.content
  def extractLanguage(t: DocumentManifest): Option[LANGUAGES]               = t.language
  def extractContained(t: DocumentManifest): LitSeq[Resource]               = t.contained
  def extractExtension(t: DocumentManifest): LitSeq[Extension]              = t.extension
  def extractRecipient(t: DocumentManifest): LitSeq[Reference]              = t.recipient
  def extractIdentifier(t: DocumentManifest): LitSeq[Identifier]            = t.identifier
  def extractDescription(t: DocumentManifest): Option[String]               = t.description
  def extractImplicitRules(t: DocumentManifest): Option[UriStr]             = t.implicitRules
  def extractMasterIdentifier(t: DocumentManifest): Option[Identifier]      = t.masterIdentifier
  def extractModifierExtension(t: DocumentManifest): LitSeq[Extension]      = t.modifierExtension
  def extractRelated(t: DocumentManifest): LitSeq[DocumentManifest.Related] = t.related
  override val thisName: String                                             = "DocumentManifest"
  override val searchParams: Map[String, DocumentManifest => Seq[Any]] = Map(
    "recipient" -> (obj => obj.recipient.toSeq),
    "author"    -> (obj => obj.author.toSeq),
    "source"    -> (obj => obj.source.toSeq),
    "identifier" -> (obj =>
      obj.masterIdentifier.toSeq ++
        obj.identifier.toSeq),
    "description" -> (obj => obj.description.toSeq),
    "status"      -> (obj => Seq(obj.status)),
    "type"        -> (obj => obj.`type`.toSeq),
    "related-ref" -> (obj => obj.related.flatMap(_.ref).toSeq),
    "subject"     -> (obj => obj.subject.toSeq),
    "related-id"  -> (obj => obj.related.flatMap(_.identifier).toSeq),
    "created"     -> (obj => obj.created.toSeq),
    "patient"     -> (obj => obj.subject.filter(_.reference.exists(_.contains("Patient/"))).toSeq),
    "item"        -> (obj => obj.content.toSeq)
  )
  def unapply(
      o: DocumentManifest): Option[(Option[String], Option[Meta], Option[Narrative], Option[CodeableConcept], DOCUMENT_REFERENCE_STATUS, LitSeq[Reference], Option[UriStr], Option[Reference], Option[FHIRDateTime], NonEmptyLitSeq[Reference], Option[LANGUAGES], LitSeq[Resource], LitSeq[Extension], LitSeq[Reference], LitSeq[Identifier], Option[String], Option[UriStr], Option[Identifier], LitSeq[Extension], LitSeq[DocumentManifest.Related])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.`type`,
        o.status,
        o.author,
        o.source,
        o.subject,
        o.created,
        o.content,
        o.language,
        o.contained,
        o.extension,
        o.recipient,
        o.identifier,
        o.description,
        o.implicitRules,
        o.masterIdentifier,
        o.modifierExtension,
        o.related))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[DocumentManifest] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new DocumentManifest(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
          cursor.decodeAs[DOCUMENT_REFERENCE_STATUS]("status", None),
          cursor.decodeAs[LitSeq[Reference]]("author", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("source", Some(None)),
          cursor.decodeAs[Option[Reference]]("subject", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("created", Some(None)),
          cursor.decodeAs[NonEmptyLitSeq[Reference]]("content", None),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("recipient", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("description", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[Identifier]]("masterIdentifier", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[DocumentManifest.Related]]("related", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** A collection of documents compiled for a purpose together with metadata that applies to the collection.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields `type`, status, author, source, subject, created, content, recipient, identifier, description,
  *   masterIdentifier, related.
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
  *   - The code specifying the type of clinical activity that resulted in placing the associated content into the
  *   DocumentManifest.
  * @param status
  *   - The status of this document manifest.
  * @param author
  *   - Identifies who is the author of the manifest. Manifest author is not necessarly the author of the references included.
  * @param source
  *   - Identifies the source system, application, or software that produced the document manifest.
  * @param subject
  *   - Who or what the set of documents is about. The documents can be about a person, (patient or healthcare practitioner), a
  *   device (i.e. machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients
  *   that share a common exposure). If the documents cross more than one subject, then more than one subject is allowed here
  *   (unusual use case).
  * @param created
  *   - When the document manifest was created for submission to the server (not necessarily the same thing as the actual
  *   resource last modified time, since it may be modified, replicated, etc.).
  * @param content
  *   - The list of Resources that consist of the parts of this manifest.
  * @param language
  *   - The base language in which the resource is written.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param recipient
  *   - A patient, practitioner, or organization for which this set of documents is intended.
  * @param identifier
  *   - Other identifiers associated with the document manifest, including version independent identifiers.
  * @param description
  *   - Human-readable description of the source document. This is sometimes known as the "title".
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param masterIdentifier
  *   - A single identifier that uniquely identifies this manifest. Principally used to refer to the manifest in non-FHIR
  *   contexts.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that
  *   modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *   Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *   strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *   extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *   processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any
  *   elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param related
  *   - Related identifiers or resources associated with the DocumentManifest.
  */
@POJOBoilerplate
class DocumentManifest(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val `type`: Option[CodeableConcept] = None,
    val status: DOCUMENT_REFERENCE_STATUS,
    val author: LitSeq[Reference] = LitSeq.empty,
    val source: Option[UriStr] = None,
    val subject: Option[Reference] = None,
    val created: Option[FHIRDateTime] = None,
    val content: NonEmptyLitSeq[Reference],
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val recipient: LitSeq[Reference] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val description: Option[String] = None,
    override val implicitRules: Option[UriStr] = None,
    val masterIdentifier: Option[Identifier] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val related: LitSeq[DocumentManifest.Related] = LitSeq.empty,
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
  override val thisTypeName: String = "DocumentManifest"
}
