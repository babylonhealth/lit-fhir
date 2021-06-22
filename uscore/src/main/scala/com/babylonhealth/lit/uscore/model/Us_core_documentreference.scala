package com.babylonhealth.lit.uscore.model

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
import com.babylonhealth.lit.usbase.model._
import com.babylonhealth.lit.core.UnionAliases._
import com.babylonhealth.lit.hl7.UnionAliases._
import com.babylonhealth.lit.usbase.UnionAliases._
import com.babylonhealth.lit.hl7.{ COMPOSITION_STATUS, DOCUMENT_REFERENCE_STATUS }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, usbase, uscore }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Us_core_documentreference extends CompanionFor[Us_core_documentreference] {
  implicit def summonObjectAndCompanionUs_core_documentreference414028103(
      o: Us_core_documentreference): ObjectAndCompanion[Us_core_documentreference, Us_core_documentreference.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = DocumentReference
  override type ParentType   = DocumentReference
  override val baseType: CompanionFor[ResourceType] = DocumentReference
  override val parentType: CompanionFor[ParentType] = DocumentReference
  override val profileUrl: Option[String] = Some("http://hl7.org/fhir/us/core/StructureDefinition/us-core-documentreference")
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(
        new Meta(profile = LitSeq("http://hl7.org/fhir/us/core/StructureDefinition/us-core-documentreference"))),
      text: Option[Narrative] = None,
      `type`: CodeableConcept,
      date: Option[ZonedDateTime] = None,
      status: DOCUMENT_REFERENCE_STATUS,
      author: LitSeq[Reference] = LitSeq.empty,
      subject: Reference,
      language: Option[LANGUAGES] = None,
      category: NonEmptyLitSeq[CodeableConcept],
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      docStatus: Option[COMPOSITION_STATUS] = None,
      custodian: Option[Reference] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      description: Option[String] = None,
      implicitRules: Option[UriStr] = None,
      authenticator: Option[Reference] = None,
      securityLabel: LitSeq[CodeableConcept] = LitSeq.empty,
      masterIdentifier: Option[Identifier] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      context: Option[DocumentReference.Context] = None,
      relatesTo: LitSeq[DocumentReference.RelatesTo] = LitSeq.empty,
      content: DocumentReference.Content,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Us_core_documentreference = new Us_core_documentreference(
    id,
    meta,
    text,
    `type`,
    date,
    status,
    author,
    subject,
    language,
    category,
    contained,
    extension,
    docStatus,
    custodian,
    identifier,
    description,
    implicitRules,
    authenticator,
    securityLabel,
    masterIdentifier,
    modifierExtension,
    context,
    relatesTo,
    content,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val `type`: FHIRComponentFieldMeta[CodeableConcept] =
    FHIRComponentFieldMeta("type", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
  val date: FHIRComponentFieldMeta[Option[ZonedDateTime]] =
    FHIRComponentFieldMeta("date", lTagOf[Option[ZonedDateTime]], false, lTagOf[ZonedDateTime])
  val status: FHIRComponentFieldMeta[DOCUMENT_REFERENCE_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[DOCUMENT_REFERENCE_STATUS], false, lTagOf[DOCUMENT_REFERENCE_STATUS])
  val author: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("author", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val subject: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("subject", lTagOf[Reference], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val category: FHIRComponentFieldMeta[NonEmptyLitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("category", lTagOf[NonEmptyLitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val docStatus: FHIRComponentFieldMeta[Option[COMPOSITION_STATUS]] =
    FHIRComponentFieldMeta("docStatus", lTagOf[Option[COMPOSITION_STATUS]], false, lTagOf[COMPOSITION_STATUS])
  val custodian: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("custodian", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val description: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val authenticator: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("authenticator", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val securityLabel: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("securityLabel", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val masterIdentifier: FHIRComponentFieldMeta[Option[Identifier]] =
    FHIRComponentFieldMeta("masterIdentifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val context: FHIRComponentFieldMeta[Option[DocumentReference.Context]] =
    FHIRComponentFieldMeta("context", lTagOf[Option[DocumentReference.Context]], false, lTagOf[DocumentReference.Context])
  val relatesTo: FHIRComponentFieldMeta[LitSeq[DocumentReference.RelatesTo]] =
    FHIRComponentFieldMeta("relatesTo", lTagOf[LitSeq[DocumentReference.RelatesTo]], false, lTagOf[DocumentReference.RelatesTo])
  val content: FHIRComponentFieldMeta[DocumentReference.Content] =
    FHIRComponentFieldMeta("content", lTagOf[DocumentReference.Content], false, lTagOf[DocumentReference.Content])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    `type`,
    date,
    status,
    author,
    subject,
    language,
    category,
    contained,
    extension,
    docStatus,
    custodian,
    identifier,
    description,
    implicitRules,
    authenticator,
    securityLabel,
    masterIdentifier,
    modifierExtension,
    context,
    relatesTo,
    content
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Meta]](meta, t.meta),
      FHIRComponentField[Option[Narrative]](text, t.text),
      FHIRComponentField[CodeableConcept](`type`, t.`type`.get),
      FHIRComponentField[Option[ZonedDateTime]](date, t.date),
      FHIRComponentField[DOCUMENT_REFERENCE_STATUS](status, t.status),
      FHIRComponentField[LitSeq[Reference]](author, t.author),
      FHIRComponentField[Reference](subject, t.subject.get),
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[NonEmptyLitSeq[CodeableConcept]](category, t.category.asNonEmpty),
      FHIRComponentField[LitSeq[Resource]](contained, t.contained),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[COMPOSITION_STATUS]](docStatus, t.docStatus),
      FHIRComponentField[Option[Reference]](custodian, t.custodian),
      FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
      FHIRComponentField[Option[String]](description, t.description),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[Option[Reference]](authenticator, t.authenticator),
      FHIRComponentField[LitSeq[CodeableConcept]](securityLabel, t.securityLabel),
      FHIRComponentField[Option[Identifier]](masterIdentifier, t.masterIdentifier),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[DocumentReference.Context]](context, t.context),
      FHIRComponentField[LitSeq[DocumentReference.RelatesTo]](relatesTo, t.relatesTo),
      FHIRComponentField[DocumentReference.Content](content, t.content.head)
    ))
  override def fields(t: Us_core_documentreference): Seq[FHIRComponentField[_]]           = fieldsFromParent(t).get
  def extractId(t: Us_core_documentreference): Option[String]                             = t.id
  def extractMeta(t: Us_core_documentreference): Option[Meta]                             = t.meta
  def extractText(t: Us_core_documentreference): Option[Narrative]                        = t.text
  def extractType(t: Us_core_documentreference): CodeableConcept                          = t.`type`.get
  def extractDate(t: Us_core_documentreference): Option[ZonedDateTime]                    = t.date
  def extractStatus(t: Us_core_documentreference): DOCUMENT_REFERENCE_STATUS              = t.status
  def extractAuthor(t: Us_core_documentreference): LitSeq[Reference]                      = t.author
  def extractSubject(t: Us_core_documentreference): Reference                             = t.subject.get
  def extractLanguage(t: Us_core_documentreference): Option[LANGUAGES]                    = t.language
  def extractCategory(t: Us_core_documentreference): NonEmptyLitSeq[CodeableConcept]      = t.category.asNonEmpty
  def extractContained(t: Us_core_documentreference): LitSeq[Resource]                    = t.contained
  def extractExtension(t: Us_core_documentreference): LitSeq[Extension]                   = t.extension
  def extractDocStatus(t: Us_core_documentreference): Option[COMPOSITION_STATUS]          = t.docStatus
  def extractCustodian(t: Us_core_documentreference): Option[Reference]                   = t.custodian
  def extractIdentifier(t: Us_core_documentreference): LitSeq[Identifier]                 = t.identifier
  def extractDescription(t: Us_core_documentreference): Option[String]                    = t.description
  def extractImplicitRules(t: Us_core_documentreference): Option[UriStr]                  = t.implicitRules
  def extractAuthenticator(t: Us_core_documentreference): Option[Reference]               = t.authenticator
  def extractSecurityLabel(t: Us_core_documentreference): LitSeq[CodeableConcept]         = t.securityLabel
  def extractMasterIdentifier(t: Us_core_documentreference): Option[Identifier]           = t.masterIdentifier
  def extractModifierExtension(t: Us_core_documentreference): LitSeq[Extension]           = t.modifierExtension
  def extractContext(t: Us_core_documentreference): Option[DocumentReference.Context]     = t.context
  def extractRelatesTo(t: Us_core_documentreference): LitSeq[DocumentReference.RelatesTo] = t.relatesTo
  def extractContent(t: Us_core_documentreference): DocumentReference.Content             = t.content.head
  override val thisName: String                                                           = "Us_core_documentreference"
  override val searchParams: Map[String, Us_core_documentreference => Seq[Any]]           = DocumentReference.searchParams
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Us_core_documentreference] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Us_core_documentreference(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[CodeableConcept]("type", None),
          cursor.decodeAs[Option[ZonedDateTime]]("date", Some(None)),
          cursor.decodeAs[DOCUMENT_REFERENCE_STATUS]("status", None),
          cursor.decodeAs[LitSeq[Reference]]("author", Some(LitSeq.empty)),
          cursor.decodeAs[Reference]("subject", None),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[NonEmptyLitSeq[CodeableConcept]]("category", None),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[COMPOSITION_STATUS]]("docStatus", Some(None)),
          cursor.decodeAs[Option[Reference]]("custodian", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("description", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[Reference]]("authenticator", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("securityLabel", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Identifier]]("masterIdentifier", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[DocumentReference.Context]]("context", Some(None)),
          cursor.decodeAs[LitSeq[DocumentReference.RelatesTo]]("relatesTo", Some(LitSeq.empty)),
          cursor.decodeFromListAs[DocumentReference.Content]("content", None),
          decodeAttributes(cursor)
        )
      ))
}

/** The document reference profile used in US Core.
  *
  * Subclass of [[hl7.model.DocumentReference]] (A reference to a document of any kind for any purpose. Provides metadata about
  * the document so that the document can be discovered and managed. The scope of a document is any seralized object with a
  * mime-type, so includes formal patient centric documents (CDA), cliical notes, scanned paper, and non-patient specific
  * documents like policy text.)
  *
  * @constructor
  *   Inherits all params from parent. Requires the following fields which were optional in the parent: `type`, subject, category.
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
  * @param status
  *   - The status of this document reference.
  * @param author
  *   - Identifies who is responsible for adding the information to the document.
  * @param subject
  *   - Who or what the document is about. The document can be about a person, (patient or healthcare practitioner), a device
  *   (e.g. a machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that
  *   share a common exposure).
  * @param language
  *   - The base language in which the resource is written.
  * @param category
  *   - A categorization for the type of document referenced - helps for indexing and searching. This may be implied by or derived
  *   from the code specified in the DocumentReference.type.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param docStatus
  *   - The status of the underlying document.
  * @param custodian
  *   - Identifies the organization or group who is responsible for ongoing maintenance of and access to the document.
  * @param identifier
  *   - Other identifiers associated with the document, including version independent identifiers.
  * @param description
  *   - Human-readable description of the source document.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param authenticator
  *   - Which person or organization authenticates that this document is valid.
  * @param securityLabel
  *   - A set of Security-Tag codes specifying the level of privacy/security of the Document. Note that
  *   DocumentReference.meta.security contains the security labels of the "reference" to the document, while
  *   DocumentReference.securityLabel contains a snapshot of the security labels on the document the reference refers to.
  * @param masterIdentifier
  *   - Document identifier as assigned by the source of the document. This identifier is specific to this version of the
  *   document. This unique identifier may be used elsewhere to identify this version of the document.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *   the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually
  *   modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict
  *   set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param context
  *   - The clinical context in which the document was prepared.
  * @param relatesTo
  *   - Relationships that this document has with other document references that already exist.
  * @param content
  *   - The document and format referenced. There may be multiple content element repetitions, each with a different format.
  */
@POJOBoilerplate
class Us_core_documentreference(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("http://hl7.org/fhir/us/core/StructureDefinition/us-core-documentreference"))),
    override val text: Option[Narrative] = None,
    `type`: CodeableConcept,
    override val date: Option[ZonedDateTime] = None,
    override val status: DOCUMENT_REFERENCE_STATUS,
    override val author: LitSeq[Reference] = LitSeq.empty,
    subject: Reference,
    override val language: Option[LANGUAGES] = None,
    category: NonEmptyLitSeq[CodeableConcept],
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val docStatus: Option[COMPOSITION_STATUS] = None,
    override val custodian: Option[Reference] = None,
    override val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val description: Option[String] = None,
    override val implicitRules: Option[UriStr] = None,
    override val authenticator: Option[Reference] = None,
    override val securityLabel: LitSeq[CodeableConcept] = LitSeq.empty,
    override val masterIdentifier: Option[Identifier] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val context: Option[DocumentReference.Context] = None,
    override val relatesTo: LitSeq[DocumentReference.RelatesTo] = LitSeq.empty,
    content: DocumentReference.Content,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends DocumentReference(
      id = id,
      meta = meta,
      text = text,
      `type` = Some(`type`),
      date = date,
      status = status,
      author = author,
      subject = Some(subject),
      language = language,
      category = category.refine,
      contained = contained,
      extension = extension,
      docStatus = docStatus,
      custodian = custodian,
      identifier = identifier,
      description = description,
      implicitRules = implicitRules,
      authenticator = authenticator,
      securityLabel = securityLabel,
      masterIdentifier = masterIdentifier,
      modifierExtension = modifierExtension,
      content = LitSeq(content),
      context = context,
      relatesTo = relatesTo,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "DocumentReference"
}
