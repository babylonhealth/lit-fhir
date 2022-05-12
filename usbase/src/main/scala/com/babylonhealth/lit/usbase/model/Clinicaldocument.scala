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
import com.babylonhealth.lit.hl7.{ COMPOSITION_STATUS, V3_CONFIDENTIALITYCLASSIFICATION }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Clinicaldocument extends CompanionFor[Clinicaldocument] {
  implicit def summonObjectAndCompanionClinicaldocument1746093827(
      o: Clinicaldocument): ObjectAndCompanion[Clinicaldocument, Clinicaldocument.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Composition
  override type ParentType   = Composition
  override val baseType: CompanionFor[ResourceType] = Composition
  override val parentType: CompanionFor[ParentType] = Composition
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/clinicaldocument")
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(new Meta(profile = LitSeq("http://hl7.org/fhir/StructureDefinition/clinicaldocument"))),
      text: Option[Narrative] = None,
      `type`: CodeableConcept,
      date: FHIRDateTime,
      title: String,
      status: COMPOSITION_STATUS,
      author: NonEmptyLitSeq[Reference],
      subject: Option[Reference] = None,
      language: Option[LANGUAGES] = None,
      category: LitSeq[CodeableConcept] = LitSeq.empty,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      encounter: Option[Reference] = None,
      custodian: Option[Reference] = None,
      identifier: Option[Identifier] = None,
      implicitRules: Option[UriStr] = None,
      confidentiality: Option[V3_CONFIDENTIALITYCLASSIFICATION] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      event: LitSeq[Composition.Event] = LitSeq.empty,
      section: LitSeq[Composition.Section] = LitSeq.empty,
      attester: LitSeq[Composition.Attester] = LitSeq.empty,
      relatesTo: LitSeq[Composition.RelatesTo] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Clinicaldocument = new Clinicaldocument(
    id,
    meta,
    text,
    `type`,
    date,
    title,
    status,
    author,
    subject,
    language,
    category,
    contained,
    extension,
    encounter,
    custodian,
    identifier,
    implicitRules,
    confidentiality,
    modifierExtension,
    event,
    section,
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
  val `type`: FHIRComponentFieldMeta[CodeableConcept] =
    FHIRComponentFieldMeta("type", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
  val date: FHIRComponentFieldMeta[FHIRDateTime] =
    FHIRComponentFieldMeta("date", lTagOf[FHIRDateTime], false, lTagOf[FHIRDateTime])
  val title: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("title", lTagOf[String], false, lTagOf[String])
  val status: FHIRComponentFieldMeta[COMPOSITION_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[COMPOSITION_STATUS], false, lTagOf[COMPOSITION_STATUS])
  val author: FHIRComponentFieldMeta[NonEmptyLitSeq[Reference]] =
    FHIRComponentFieldMeta("author", lTagOf[NonEmptyLitSeq[Reference]], false, lTagOf[Reference])
  val subject: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("subject", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val category: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("category", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val encounter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("encounter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val custodian: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("custodian", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[Option[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val confidentiality: FHIRComponentFieldMeta[Option[V3_CONFIDENTIALITYCLASSIFICATION]] =
    FHIRComponentFieldMeta(
      "confidentiality",
      lTagOf[Option[V3_CONFIDENTIALITYCLASSIFICATION]],
      false,
      lTagOf[V3_CONFIDENTIALITYCLASSIFICATION])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val event: FHIRComponentFieldMeta[LitSeq[Composition.Event]] =
    FHIRComponentFieldMeta("event", lTagOf[LitSeq[Composition.Event]], false, lTagOf[Composition.Event])
  val section: FHIRComponentFieldMeta[LitSeq[Composition.Section]] =
    FHIRComponentFieldMeta("section", lTagOf[LitSeq[Composition.Section]], false, lTagOf[Composition.Section])
  val attester: FHIRComponentFieldMeta[LitSeq[Composition.Attester]] =
    FHIRComponentFieldMeta("attester", lTagOf[LitSeq[Composition.Attester]], false, lTagOf[Composition.Attester])
  val relatesTo: FHIRComponentFieldMeta[LitSeq[Composition.RelatesTo]] =
    FHIRComponentFieldMeta("relatesTo", lTagOf[LitSeq[Composition.RelatesTo]], false, lTagOf[Composition.RelatesTo])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    `type`,
    date,
    title,
    status,
    author,
    subject,
    language,
    category,
    contained,
    extension,
    encounter,
    custodian,
    identifier,
    implicitRules,
    confidentiality,
    modifierExtension,
    event,
    section,
    attester,
    relatesTo
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Meta]](meta, t.meta),
      FHIRComponentField[Option[Narrative]](text, t.text),
      FHIRComponentField[CodeableConcept](`type`, t.`type`),
      FHIRComponentField[FHIRDateTime](date, t.date),
      FHIRComponentField[String](title, t.title),
      FHIRComponentField[COMPOSITION_STATUS](status, t.status),
      FHIRComponentField[NonEmptyLitSeq[Reference]](author, t.author),
      FHIRComponentField[Option[Reference]](subject, t.subject),
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[LitSeq[CodeableConcept]](category, t.category),
      FHIRComponentField[LitSeq[Resource]](contained, t.contained),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Reference]](encounter, t.encounter),
      FHIRComponentField[Option[Reference]](custodian, t.custodian),
      FHIRComponentField[Option[Identifier]](identifier, t.identifier),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[Option[V3_CONFIDENTIALITYCLASSIFICATION]](confidentiality, t.confidentiality),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[Composition.Event]](event, t.event),
      FHIRComponentField[LitSeq[Composition.Section]](section, t.section),
      FHIRComponentField[LitSeq[Composition.Attester]](attester, t.attester),
      FHIRComponentField[LitSeq[Composition.RelatesTo]](relatesTo, t.relatesTo)
    ))
  override def fields(t: Clinicaldocument): Seq[FHIRComponentField[_]]                      = fieldsFromParent(t).get
  def extractId(t: Clinicaldocument): Option[String]                                        = t.id
  def extractMeta(t: Clinicaldocument): Option[Meta]                                        = t.meta
  def extractText(t: Clinicaldocument): Option[Narrative]                                   = t.text
  def extractType(t: Clinicaldocument): CodeableConcept                                     = t.`type`
  def extractDate(t: Clinicaldocument): FHIRDateTime                                        = t.date
  def extractTitle(t: Clinicaldocument): String                                             = t.title
  def extractStatus(t: Clinicaldocument): COMPOSITION_STATUS                                = t.status
  def extractAuthor(t: Clinicaldocument): NonEmptyLitSeq[Reference]                         = t.author
  def extractSubject(t: Clinicaldocument): Option[Reference]                                = t.subject
  def extractLanguage(t: Clinicaldocument): Option[LANGUAGES]                               = t.language
  def extractCategory(t: Clinicaldocument): LitSeq[CodeableConcept]                         = t.category
  def extractContained(t: Clinicaldocument): LitSeq[Resource]                               = t.contained
  def extractExtension(t: Clinicaldocument): LitSeq[Extension]                              = t.extension
  def extractEncounter(t: Clinicaldocument): Option[Reference]                              = t.encounter
  def extractCustodian(t: Clinicaldocument): Option[Reference]                              = t.custodian
  def extractIdentifier(t: Clinicaldocument): Option[Identifier]                            = t.identifier
  def extractImplicitRules(t: Clinicaldocument): Option[UriStr]                             = t.implicitRules
  def extractConfidentiality(t: Clinicaldocument): Option[V3_CONFIDENTIALITYCLASSIFICATION] = t.confidentiality
  def extractModifierExtension(t: Clinicaldocument): LitSeq[Extension]                      = t.modifierExtension
  def extractEvent(t: Clinicaldocument): LitSeq[Composition.Event]                          = t.event
  def extractSection(t: Clinicaldocument): LitSeq[Composition.Section]                      = t.section
  def extractAttester(t: Clinicaldocument): LitSeq[Composition.Attester]                    = t.attester
  def extractRelatesTo(t: Clinicaldocument): LitSeq[Composition.RelatesTo]                  = t.relatesTo
  override val thisName: String                                                             = "Clinicaldocument"
  override val searchParams: Map[String, Clinicaldocument => Seq[Any]]                      = Composition.searchParams
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Clinicaldocument] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Clinicaldocument(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[CodeableConcept]("type", None),
          cursor.decodeAs[FHIRDateTime]("date", None),
          cursor.decodeAs[String]("title", None),
          cursor.decodeAs[COMPOSITION_STATUS]("status", None),
          cursor.decodeAs[NonEmptyLitSeq[Reference]]("author", None),
          cursor.decodeAs[Option[Reference]]("subject", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("category", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          cursor.decodeAs[Option[Reference]]("custodian", Some(None)),
          cursor.decodeAs[Option[Identifier]]("identifier", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[V3_CONFIDENTIALITYCLASSIFICATION]]("confidentiality", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Composition.Event]]("event", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Composition.Section]]("section", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Composition.Attester]]("attester", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Composition.RelatesTo]]("relatesTo", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** The Clinical Document profile constrains Composition to specify a clinical document (matching CDA). The base Composition is a
  * general resource for compositions or documents about any kind of subject that might be encountered in healthcare including
  * such things as guidelines, medicines, etc. A clinical document is focused on documents related to the provision of care
  * process, where the subject is a patient, a group of patients, or a closely related concept. A clinical document has additional
  * requirements around confidentiality that do not apply in the same way to other kinds of documents.
  *
  * Subclass of [[hl7.model.Composition]] (A set of healthcare-related information that is assembled together into a single
  * logical package that provides a single coherent statement of meaning, establishes its own context and that has clinical
  * attestation with regard to who is making the statement. A Composition defines the structure and narrative content necessary
  * for a document. However, a Composition alone does not constitute a document. Rather, the Composition must be the first entry
  * in a Bundle where Bundle.type=document, and any other resources referenced from Composition must be included as subsequent
  * entries in the Bundle (for example Patient, Practitioner, Encounter, etc.).)
  *
  * @constructor
  *   Inherits all params from parent.
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
  *   - Specifies the particular kind of composition (e.g. History and Physical, Discharge Summary, Progress Note). This usually
  *   equates to the purpose of making the composition.
  * @param date
  *   - The composition editing time, when the composition was last logically changed by the author.
  * @param title
  *   - Official human-readable label for the composition.
  * @param status
  *   - The workflow/clinical status of this composition. The status is a marker for the clinical standing of the document.
  * @param author
  *   - Identifies who is responsible for the information in the composition, not necessarily who typed it in.
  * @param subject
  *   - Who or what the composition is about. The composition can be about a person, (patient or healthcare practitioner), a
  *   device (e.g. a machine) or even a group of subjects (such as a document about a herd of livestock, or a set of patients that
  *   share a common exposure).
  * @param language
  *   - The base language in which the resource is written.
  * @param category
  *   - A categorization for the type of the composition - helps for indexing and searching. This may be implied by or derived
  *   from the code specified in the Composition Type.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - An Extension
  * @param encounter
  *   - Describes the clinical encounter or type of care this documentation is associated with.
  * @param custodian
  *   - Identifies the organization or group who is responsible for ongoing maintenance of and access to the composition/document
  *   information.
  * @param identifier
  *   - A version-independent identifier for the Composition. This identifier stays constant as the composition is changed over
  *   time.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param confidentiality
  *   - The code specifying the level of confidentiality of the Composition.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that
  *   modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *   Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *   strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *   extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *   processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any
  *   elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param event
  *   - The clinical service, such as a colonoscopy or an appendectomy, being documented.
  * @param section
  *   - The root of the sections that make up the composition.
  * @param attester
  *   - A participant who has attested to the accuracy of the composition/document.
  * @param relatesTo
  *   - Relationships that this composition has with other compositions or documents that already exist.
  */
@POJOBoilerplate
class Clinicaldocument(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("http://hl7.org/fhir/StructureDefinition/clinicaldocument"))),
    override val text: Option[Narrative] = None,
    override val `type`: CodeableConcept,
    override val date: FHIRDateTime,
    override val title: String,
    override val status: COMPOSITION_STATUS,
    override val author: NonEmptyLitSeq[Reference],
    override val subject: Option[Reference] = None,
    override val language: Option[LANGUAGES] = None,
    override val category: LitSeq[CodeableConcept] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val encounter: Option[Reference] = None,
    override val custodian: Option[Reference] = None,
    override val identifier: Option[Identifier] = None,
    override val implicitRules: Option[UriStr] = None,
    override val confidentiality: Option[V3_CONFIDENTIALITYCLASSIFICATION] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val event: LitSeq[Composition.Event] = LitSeq.empty,
    override val section: LitSeq[Composition.Section] = LitSeq.empty,
    override val attester: LitSeq[Composition.Attester] = LitSeq.empty,
    override val relatesTo: LitSeq[Composition.RelatesTo] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Composition(
      id = id,
      meta = meta,
      text = text,
      `type` = `type`,
      date = date,
      title = title,
      status = status,
      author = author,
      subject = subject,
      language = language,
      category = category,
      contained = contained,
      extension = extension,
      encounter = encounter,
      custodian = custodian,
      identifier = identifier,
      implicitRules = implicitRules,
      confidentiality = confidentiality,
      modifierExtension = modifierExtension,
      event = event,
      section = section,
      attester = attester,
      relatesTo = relatesTo,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Composition"
}
