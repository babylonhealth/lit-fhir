package com.babylonhealth.lit.ukcore.model

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
import com.babylonhealth.lit.hl7.{ COMPOSITION_STATUS, DOCUMENT_REFERENCE_STATUS }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, ukcore }
import com.babylonhealth.lit.macros.POJOBoilerplate

object UKCore_DocumentReference extends CompanionFor[UKCore_DocumentReference] {
  implicit def summonObjectAndCompanionUKCore_DocumentReference_283316575(
      o: UKCore_DocumentReference): ObjectAndCompanion[UKCore_DocumentReference, UKCore_DocumentReference.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = DocumentReference
  override type ParentType   = DocumentReference
  override val baseType: CompanionFor[ResourceType] = DocumentReference
  override val parentType: CompanionFor[ParentType] = DocumentReference
  override val profileUrl: Option[String]           = Some("https://fhir.hl7.org.uk/StructureDefinition/UKCore-DocumentReference")
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(
        new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-DocumentReference"))),
      text: Option[Narrative] = None,
      `type`: Option[CodeableConcept] = None,
      date: Option[ZonedDateTime] = None,
      status: DOCUMENT_REFERENCE_STATUS,
      language: Option[LANGUAGES] = None,
      category: LitSeq[CodeableConcept] = LitSeq.empty,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      docStatus: Option[COMPOSITION_STATUS] = None,
      description: Option[String] = None,
      implicitRules: Option[UriStr] = None,
      securityLabel: LitSeq[CodeableConcept] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      content: NonEmptyLitSeq[DocumentReference.Content],
      masterIdentifier: Option[Identifier] = None,
      author: LitSeq[Reference] = LitSeq.empty,
      subject: Option[Reference] = None,
      custodian: Option[Reference] = None,
      authenticator: Option[Reference] = None,
      relatesTo: LitSeq[DocumentReference.RelatesTo] = LitSeq.empty,
      context: Option[DocumentReference.Context] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): UKCore_DocumentReference = new UKCore_DocumentReference(
    id,
    meta,
    text,
    `type`,
    date,
    status,
    language,
    category,
    contained,
    extension,
    docStatus,
    description,
    implicitRules,
    securityLabel,
    modifierExtension,
    identifier,
    content,
    masterIdentifier,
    author,
    subject,
    custodian,
    authenticator,
    relatesTo,
    context,
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
  val status: FHIRComponentFieldMeta[DOCUMENT_REFERENCE_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[DOCUMENT_REFERENCE_STATUS], false, lTagOf[DOCUMENT_REFERENCE_STATUS])
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
  val description: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val securityLabel: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("securityLabel", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val content: FHIRComponentFieldMeta[NonEmptyLitSeq[DocumentReference.Content]] =
    FHIRComponentFieldMeta("content", lTagOf[NonEmptyLitSeq[DocumentReference.Content]], false, lTagOf[DocumentReference.Content])
  val masterIdentifier: FHIRComponentFieldMeta[Option[Identifier]] =
    FHIRComponentFieldMeta("masterIdentifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
  val author: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("author", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val subject: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("subject", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val custodian: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("custodian", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val authenticator: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("authenticator", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val relatesTo: FHIRComponentFieldMeta[LitSeq[DocumentReference.RelatesTo]] =
    FHIRComponentFieldMeta("relatesTo", lTagOf[LitSeq[DocumentReference.RelatesTo]], false, lTagOf[DocumentReference.RelatesTo])
  val context: FHIRComponentFieldMeta[Option[DocumentReference.Context]] =
    FHIRComponentFieldMeta("context", lTagOf[Option[DocumentReference.Context]], false, lTagOf[DocumentReference.Context])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    `type`,
    date,
    status,
    language,
    category,
    contained,
    extension,
    docStatus,
    description,
    implicitRules,
    securityLabel,
    modifierExtension,
    identifier,
    content,
    masterIdentifier,
    author,
    subject,
    custodian,
    authenticator,
    relatesTo,
    context
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Meta]](meta, t.meta),
      FHIRComponentField[Option[Narrative]](text, t.text),
      FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[Option[ZonedDateTime]](date, t.date),
      FHIRComponentField[DOCUMENT_REFERENCE_STATUS](status, t.status),
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[LitSeq[CodeableConcept]](category, t.category),
      FHIRComponentField[LitSeq[Resource]](contained, t.contained),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[COMPOSITION_STATUS]](docStatus, t.docStatus),
      FHIRComponentField[Option[String]](description, t.description),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[LitSeq[CodeableConcept]](securityLabel, t.securityLabel),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
      FHIRComponentField[NonEmptyLitSeq[DocumentReference.Content]](content, t.content),
      FHIRComponentField[Option[Identifier]](masterIdentifier, t.masterIdentifier),
      FHIRComponentField[LitSeq[Reference]](author, t.author),
      FHIRComponentField[Option[Reference]](subject, t.subject),
      FHIRComponentField[Option[Reference]](custodian, t.custodian),
      FHIRComponentField[Option[Reference]](authenticator, t.authenticator),
      FHIRComponentField[LitSeq[DocumentReference.RelatesTo]](relatesTo, t.relatesTo),
      FHIRComponentField[Option[DocumentReference.Context]](context, t.context)
    ))
  override def fields(t: UKCore_DocumentReference): Seq[FHIRComponentField[_]]               = fieldsFromParent(t).get
  def extractId(t: UKCore_DocumentReference): Option[String]                                 = t.id
  def extractMeta(t: UKCore_DocumentReference): Option[Meta]                                 = t.meta
  def extractText(t: UKCore_DocumentReference): Option[Narrative]                            = t.text
  def extractType(t: UKCore_DocumentReference): Option[CodeableConcept]                      = t.`type`
  def extractDate(t: UKCore_DocumentReference): Option[ZonedDateTime]                        = t.date
  def extractStatus(t: UKCore_DocumentReference): DOCUMENT_REFERENCE_STATUS                  = t.status
  def extractLanguage(t: UKCore_DocumentReference): Option[LANGUAGES]                        = t.language
  def extractCategory(t: UKCore_DocumentReference): LitSeq[CodeableConcept]                  = t.category
  def extractContained(t: UKCore_DocumentReference): LitSeq[Resource]                        = t.contained
  def extractExtension(t: UKCore_DocumentReference): LitSeq[Extension]                       = t.extension
  def extractDocStatus(t: UKCore_DocumentReference): Option[COMPOSITION_STATUS]              = t.docStatus
  def extractDescription(t: UKCore_DocumentReference): Option[String]                        = t.description
  def extractImplicitRules(t: UKCore_DocumentReference): Option[UriStr]                      = t.implicitRules
  def extractSecurityLabel(t: UKCore_DocumentReference): LitSeq[CodeableConcept]             = t.securityLabel
  def extractModifierExtension(t: UKCore_DocumentReference): LitSeq[Extension]               = t.modifierExtension
  def extractIdentifier(t: UKCore_DocumentReference): LitSeq[Identifier]                     = t.identifier
  def extractContent(t: UKCore_DocumentReference): NonEmptyLitSeq[DocumentReference.Content] = t.content
  def extractMasterIdentifier(t: UKCore_DocumentReference): Option[Identifier]               = t.masterIdentifier
  def extractAuthor(t: UKCore_DocumentReference): LitSeq[Reference]                          = t.author
  def extractSubject(t: UKCore_DocumentReference): Option[Reference]                         = t.subject
  def extractCustodian(t: UKCore_DocumentReference): Option[Reference]                       = t.custodian
  def extractAuthenticator(t: UKCore_DocumentReference): Option[Reference]                   = t.authenticator
  def extractRelatesTo(t: UKCore_DocumentReference): LitSeq[DocumentReference.RelatesTo]     = t.relatesTo
  def extractContext(t: UKCore_DocumentReference): Option[DocumentReference.Context]         = t.context
  override val thisName: String                                                              = "UKCore_DocumentReference"
  override val searchParams: Map[String, UKCore_DocumentReference => Seq[Any]]               = DocumentReference.searchParams
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[UKCore_DocumentReference] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new UKCore_DocumentReference(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
          cursor.decodeAs[Option[ZonedDateTime]]("date", Some(None)),
          cursor.decodeAs[DOCUMENT_REFERENCE_STATUS]("status", None),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("category", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[COMPOSITION_STATUS]]("docStatus", Some(None)),
          cursor.decodeAs[Option[String]]("description", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("securityLabel", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[NonEmptyLitSeq[DocumentReference.Content]]("content", None),
          cursor.decodeAs[Option[Identifier]]("masterIdentifier", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("author", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("subject", Some(None)),
          cursor.decodeAs[Option[Reference]]("custodian", Some(None)),
          cursor.decodeAs[Option[Reference]]("authenticator", Some(None)),
          cursor.decodeAs[LitSeq[DocumentReference.RelatesTo]]("relatesTo", Some(LitSeq.empty)),
          cursor.decodeAs[Option[DocumentReference.Context]]("context", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** Defines the UK Core constraints and extensions on the DocumentReference resource.
  *
  * Subclass of [[hl7.model.DocumentReference]] (A reference to a document of any kind for any purpose. Provides metadata about
  * the document so that the document can be discovered and managed. The scope of a document is any seralized object with a
  * mime-type, so includes formal patient centric documents (CDA), cliical notes, scanned paper, and non-patient specific
  * documents like policy text.)
  *
  * @constructor
  *   Inherits all params from parent.
  * @param id
  *   \- The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta
  *   \- The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *   not always be associated with version changes to the resource.
  * @param text
  *   \- A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *   resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to
  *   make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be
  *   represented in the narrative to ensure clinical safety.
  * @param `type`
  *   \- Specifies the particular kind of document referenced (e.g. History and Physical, Discharge Summary, Progress Note). This
  *   usually equates to the purpose of making the document referenced.
  * @param date
  *   \- When the document reference was created.
  * @param status
  *   \- The status of this document reference.
  * @param language
  *   \- The base language in which the resource is written.
  * @param category
  *   \- A categorization for the type of document referenced - helps for indexing and searching. This may be implied by or
  *   derived from the code specified in the DocumentReference.type.
  * @param contained
  *   \- These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   \- May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param docStatus
  *   \- The status of the underlying document.
  * @param description
  *   \- Human-readable description of the source document.
  * @param implicitRules
  *   \- A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param securityLabel
  *   \- A set of Security-Tag codes specifying the level of privacy/security of the Document. Note that
  *   DocumentReference.meta.security contains the security labels of the "reference" to the document, while
  *   DocumentReference.securityLabel contains a snapshot of the security labels on the document the reference refers to.
  * @param modifierExtension
  *   \- May be used to represent additional information that is not part of the basic definition of the resource and that
  *   modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *   Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *   strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *   extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *   processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any
  *   elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param identifier
  *   \- Other identifiers associated with the document, including version independent identifiers.
  * @param content
  *   \- The document and format referenced. There may be multiple content element repetitions, each with a different format.
  * @param masterIdentifier
  *   \- Document identifier as assigned by the source of the document. This identifier is specific to this version of the
  *   document. This unique identifier may be used elsewhere to identify this version of the document.
  * @param author
  *   \- Identifies who is responsible for adding the information to the document.
  * @param subject
  *   \- Who or what the document is about. The document can be about a person, (patient or healthcare practitioner), a device
  *   (e.g. a machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that
  *   share a common exposure).
  * @param custodian
  *   \- Identifies the organization or group who is responsible for ongoing maintenance of and access to the document.
  * @param authenticator
  *   \- Which person or organization authenticates that this document is valid.
  * @param relatesTo
  *   \- Relationships that this document has with other document references that already exist.
  * @param context
  *   \- The clinical context in which the document was prepared.
  */
@POJOBoilerplate
class UKCore_DocumentReference(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-DocumentReference"))),
    override val text: Option[Narrative] = None,
    override val `type`: Option[CodeableConcept] = None,
    override val date: Option[ZonedDateTime] = None,
    override val status: DOCUMENT_REFERENCE_STATUS,
    override val language: Option[LANGUAGES] = None,
    override val category: LitSeq[CodeableConcept] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val docStatus: Option[COMPOSITION_STATUS] = None,
    override val description: Option[String] = None,
    override val implicitRules: Option[UriStr] = None,
    override val securityLabel: LitSeq[CodeableConcept] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val content: NonEmptyLitSeq[DocumentReference.Content],
    override val masterIdentifier: Option[Identifier] = None,
    override val author: LitSeq[Reference] = LitSeq.empty,
    override val subject: Option[Reference] = None,
    override val custodian: Option[Reference] = None,
    override val authenticator: Option[Reference] = None,
    override val relatesTo: LitSeq[DocumentReference.RelatesTo] = LitSeq.empty,
    override val context: Option[DocumentReference.Context] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends DocumentReference(
      id = id,
      meta = meta,
      text = text,
      `type` = `type`,
      date = date,
      status = status,
      author = author,
      subject = subject,
      language = language,
      category = category,
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
      content = content,
      context = context,
      relatesTo = relatesTo,
      primitiveAttributes = primitiveAttributes
    ) {
  override val thisTypeName: String = "DocumentReference"
}
