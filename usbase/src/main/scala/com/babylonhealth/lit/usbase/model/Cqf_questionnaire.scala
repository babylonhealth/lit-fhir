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
import com.babylonhealth.lit.hl7.{ RESOURCE_TYPES, PUBLICATION_STATUS }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Cqf_questionnaire extends CompanionFor[Cqf_questionnaire] {
  override val baseType: CompanionFor[Questionnaire] = Questionnaire
  override val profileUrl: Option[String]            = Some("http://hl7.org/fhir/StructureDefinition/cqf-questionnaire")
  def apply(
      id: Option[String] = None,
      url: Option[UriStr] = None,
      meta: Option[Meta] = Some(
        new Meta(profile = LitSeq("http://hl7.org/fhir/StructureDefinition/cqf-questionnaire"))),
      text: Option[Narrative] = None,
      name: Option[String] = None,
      date: Option[FHIRDateTime] = None,
      code: LitSeq[Coding] = LitSeq.empty,
      title: Option[String] = None,
      status: PUBLICATION_STATUS,
      version: Option[String] = None,
      contact: LitSeq[ContactDetail] = LitSeq.empty,
      purpose: Option[Markdown] = None,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      publisher: Option[String] = None,
      copyright: Option[Markdown] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      useContext: LitSeq[UsageContext] = LitSeq.empty,
      derivedFrom: LitSeq[Canonical] = LitSeq.empty,
      subjectType: LitSeq[RESOURCE_TYPES] = LitSeq.empty,
      description: Option[Markdown] = None,
      experimental: Option[Boolean] = None,
      jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
      approvalDate: Option[FHIRDate] = None,
      implicitRules: Option[UriStr] = None,
      lastReviewDate: Option[FHIRDate] = None,
      effectivePeriod: Option[Period] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      item: LitSeq[Questionnaire.Item] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Cqf_questionnaire = new Cqf_questionnaire(
    id,
    url,
    meta,
    text,
    name,
    date,
    code,
    title,
    status,
    version,
    contact,
    purpose,
    language,
    contained,
    extension,
    publisher,
    copyright,
    identifier,
    useContext,
    derivedFrom,
    subjectType,
    description,
    experimental,
    jurisdiction,
    approvalDate,
    implicitRules,
    lastReviewDate,
    effectivePeriod,
    modifierExtension,
    item,
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
  val code: FHIRComponentFieldMeta[LitSeq[Coding]] =
    FHIRComponentFieldMeta("code", lTagOf[LitSeq[Coding]], false, lTagOf[Coding])
  val title: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("title", lTagOf[Option[String]], false, lTagOf[String])
  val status: FHIRComponentFieldMeta[PUBLICATION_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[PUBLICATION_STATUS], false, lTagOf[PUBLICATION_STATUS])
  val version: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("version", lTagOf[Option[String]], false, lTagOf[String])
  val contact: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("contact", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val purpose: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("purpose", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val publisher: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("publisher", lTagOf[Option[String]], false, lTagOf[String])
  val copyright: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("copyright", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val useContext: FHIRComponentFieldMeta[LitSeq[UsageContext]] =
    FHIRComponentFieldMeta("useContext", lTagOf[LitSeq[UsageContext]], false, lTagOf[UsageContext])
  val derivedFrom: FHIRComponentFieldMeta[LitSeq[Canonical]] =
    FHIRComponentFieldMeta("derivedFrom", lTagOf[LitSeq[Canonical]], false, lTagOf[Canonical])
  val subjectType: FHIRComponentFieldMeta[LitSeq[RESOURCE_TYPES]] =
    FHIRComponentFieldMeta("subjectType", lTagOf[LitSeq[RESOURCE_TYPES]], false, lTagOf[RESOURCE_TYPES])
  val description: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("description", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val experimental: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("experimental", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val jurisdiction: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("jurisdiction", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val approvalDate: FHIRComponentFieldMeta[Option[FHIRDate]] =
    FHIRComponentFieldMeta("approvalDate", lTagOf[Option[FHIRDate]], false, lTagOf[FHIRDate])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val lastReviewDate: FHIRComponentFieldMeta[Option[FHIRDate]] =
    FHIRComponentFieldMeta("lastReviewDate", lTagOf[Option[FHIRDate]], false, lTagOf[FHIRDate])
  val effectivePeriod: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("effectivePeriod", lTagOf[Option[Period]], false, lTagOf[Period])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val item: FHIRComponentFieldMeta[LitSeq[Questionnaire.Item]] =
    FHIRComponentFieldMeta("item", lTagOf[LitSeq[Questionnaire.Item]], false, lTagOf[Questionnaire.Item])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    url,
    meta,
    text,
    name,
    date,
    code,
    title,
    status,
    version,
    contact,
    purpose,
    language,
    contained,
    extension,
    publisher,
    copyright,
    identifier,
    useContext,
    derivedFrom,
    subjectType,
    description,
    experimental,
    jurisdiction,
    approvalDate,
    implicitRules,
    lastReviewDate,
    effectivePeriod,
    modifierExtension,
    item
  )
  override def fields(t: Cqf_questionnaire): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[UriStr]](url, t.url),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[String]](name, t.name),
    FHIRComponentField[Option[FHIRDateTime]](date, t.date),
    FHIRComponentField[LitSeq[Coding]](code, t.code),
    FHIRComponentField[Option[String]](title, t.title),
    FHIRComponentField[PUBLICATION_STATUS](status, t.status),
    FHIRComponentField[Option[String]](version, t.version),
    FHIRComponentField[LitSeq[ContactDetail]](contact, t.contact),
    FHIRComponentField[Option[Markdown]](purpose, t.purpose),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[String]](publisher, t.publisher),
    FHIRComponentField[Option[Markdown]](copyright, t.copyright),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[LitSeq[UsageContext]](useContext, t.useContext),
    FHIRComponentField[LitSeq[Canonical]](derivedFrom, t.derivedFrom),
    FHIRComponentField[LitSeq[RESOURCE_TYPES]](subjectType, t.subjectType),
    FHIRComponentField[Option[Markdown]](description, t.description),
    FHIRComponentField[Option[Boolean]](experimental, t.experimental),
    FHIRComponentField[LitSeq[CodeableConcept]](jurisdiction, t.jurisdiction),
    FHIRComponentField[Option[FHIRDate]](approvalDate, t.approvalDate),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[FHIRDate]](lastReviewDate, t.lastReviewDate),
    FHIRComponentField[Option[Period]](effectivePeriod, t.effectivePeriod),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[Questionnaire.Item]](item, t.item)
  )
  def extractId(t: Cqf_questionnaire): Option[String]                    = t.id
  def extractUrl(t: Cqf_questionnaire): Option[UriStr]                   = t.url
  def extractMeta(t: Cqf_questionnaire): Option[Meta]                    = t.meta
  def extractText(t: Cqf_questionnaire): Option[Narrative]               = t.text
  def extractName(t: Cqf_questionnaire): Option[String]                  = t.name
  def extractDate(t: Cqf_questionnaire): Option[FHIRDateTime]            = t.date
  def extractCode(t: Cqf_questionnaire): LitSeq[Coding]                  = t.code
  def extractTitle(t: Cqf_questionnaire): Option[String]                 = t.title
  def extractStatus(t: Cqf_questionnaire): PUBLICATION_STATUS            = t.status
  def extractVersion(t: Cqf_questionnaire): Option[String]               = t.version
  def extractContact(t: Cqf_questionnaire): LitSeq[ContactDetail]        = t.contact
  def extractPurpose(t: Cqf_questionnaire): Option[Markdown]             = t.purpose
  def extractLanguage(t: Cqf_questionnaire): Option[LANGUAGES]           = t.language
  def extractContained(t: Cqf_questionnaire): LitSeq[Resource]           = t.contained
  def extractExtension(t: Cqf_questionnaire): LitSeq[Extension]          = t.extension
  def extractPublisher(t: Cqf_questionnaire): Option[String]             = t.publisher
  def extractCopyright(t: Cqf_questionnaire): Option[Markdown]           = t.copyright
  def extractIdentifier(t: Cqf_questionnaire): LitSeq[Identifier]        = t.identifier
  def extractUseContext(t: Cqf_questionnaire): LitSeq[UsageContext]      = t.useContext
  def extractDerivedFrom(t: Cqf_questionnaire): LitSeq[Canonical]        = t.derivedFrom
  def extractSubjectType(t: Cqf_questionnaire): LitSeq[RESOURCE_TYPES]   = t.subjectType
  def extractDescription(t: Cqf_questionnaire): Option[Markdown]         = t.description
  def extractExperimental(t: Cqf_questionnaire): Option[Boolean]         = t.experimental
  def extractJurisdiction(t: Cqf_questionnaire): LitSeq[CodeableConcept] = t.jurisdiction
  def extractApprovalDate(t: Cqf_questionnaire): Option[FHIRDate]        = t.approvalDate
  def extractImplicitRules(t: Cqf_questionnaire): Option[UriStr]         = t.implicitRules
  def extractLastReviewDate(t: Cqf_questionnaire): Option[FHIRDate]      = t.lastReviewDate
  def extractEffectivePeriod(t: Cqf_questionnaire): Option[Period]       = t.effectivePeriod
  def extractModifierExtension(t: Cqf_questionnaire): LitSeq[Extension]  = t.modifierExtension
  def extractItem(t: Cqf_questionnaire): LitSeq[Questionnaire.Item]      = t.item
  override val thisName: String                                          = "Cqf_questionnaire"
  override val searchParams: Map[String, Cqf_questionnaire => Seq[Any]]  = Questionnaire.searchParams
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Cqf_questionnaire] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Cqf_questionnaire(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[UriStr]]("url", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[String]]("name", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("date", Some(None)),
          cursor.decodeAs[LitSeq[Coding]]("code", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("title", Some(None)),
          cursor.decodeAs[PUBLICATION_STATUS]("status", None),
          cursor.decodeAs[Option[String]]("version", Some(None)),
          cursor.decodeAs[LitSeq[ContactDetail]]("contact", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Markdown]]("purpose", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("publisher", Some(None)),
          cursor.decodeAs[Option[Markdown]]("copyright", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[UsageContext]]("useContext", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Canonical]]("derivedFrom", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[RESOURCE_TYPES]]("subjectType", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Markdown]]("description", Some(None)),
          cursor.decodeAs[Option[Boolean]]("experimental", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("jurisdiction", Some(LitSeq.empty)),
          cursor.decodeAs[Option[FHIRDate]]("approvalDate", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[FHIRDate]]("lastReviewDate", Some(None)),
          cursor.decodeAs[Option[Period]]("effectivePeriod", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Questionnaire.Item]]("item", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** A questionnaire with the ability to specify behavior associated with questions or groups of questions
  *
  *  Subclass of [[hl7.model.Questionnaire]] (A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection.)
  *
  * @constructor Inherits all params from parent.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param url - An absolute URI that is used to identify this questionnaire when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative instance of this questionnaire is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the questionnaire is stored on different servers.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param name - A natural language name identifying the questionnaire. This name should be usable as an identifier for the module by machine processing applications such as code generation.
  * @param date - The date  (and optionally time) when the questionnaire was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the questionnaire changes.
  * @param code - An identifier for this question or group of questions in a particular terminology such as LOINC.
  * @param title - A short, descriptive, user-friendly title for the questionnaire.
  * @param status - The status of this questionnaire. Enables tracking the life-cycle of the content.
  * @param version - The identifier that is used to identify this version of the questionnaire when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the questionnaire author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.
  * @param contact - Contact details to assist a user in finding and communicating with the publisher.
  * @param purpose - Explanation of why this questionnaire is needed and why it has been designed as it has.
  * @param language - The base language in which the resource is written.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - An Extension
  * @param publisher - The name of the organization or individual that published the questionnaire.
  * @param copyright - A copyright statement relating to the questionnaire and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the questionnaire.
  * @param identifier - A formal identifier that is used to identify this questionnaire when it is represented in other formats, or referenced in a specification, model, design or an instance.
  * @param useContext - The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate questionnaire instances.
  * @param derivedFrom - The URL of a Questionnaire that this Questionnaire is based on.
  * @param subjectType - The types of subjects that can be the subject of responses created for the questionnaire.
  * @param description - A free text natural language description of the questionnaire from a consumer's perspective.
  * @param experimental - A Boolean value to indicate that this questionnaire is authored for testing purposes (or education/evaluation/marketing) and is not intended to be used for genuine usage.
  * @param jurisdiction - A legal or geographic region in which the questionnaire is intended to be used.
  * @param approvalDate - The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param lastReviewDate - The date on which the resource content was last reviewed. Review happens periodically after approval but does not change the original approval date.
  * @param effectivePeriod - The period during which the questionnaire content was or is planned to be in active use.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param item - A particular question, question grouping or display text that is part of the questionnaire.
  */
@POJOBoilerplate
class Cqf_questionnaire(
    override val id: Option[String] = None,
    override val url: Option[UriStr] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("http://hl7.org/fhir/StructureDefinition/cqf-questionnaire"))),
    override val text: Option[Narrative] = None,
    override val name: Option[String] = None,
    override val date: Option[FHIRDateTime] = None,
    override val code: LitSeq[Coding] = LitSeq.empty,
    override val title: Option[String] = None,
    override val status: PUBLICATION_STATUS,
    override val version: Option[String] = None,
    override val contact: LitSeq[ContactDetail] = LitSeq.empty,
    override val purpose: Option[Markdown] = None,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val publisher: Option[String] = None,
    override val copyright: Option[Markdown] = None,
    override val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val useContext: LitSeq[UsageContext] = LitSeq.empty,
    override val derivedFrom: LitSeq[Canonical] = LitSeq.empty,
    override val subjectType: LitSeq[RESOURCE_TYPES] = LitSeq.empty,
    override val description: Option[Markdown] = None,
    override val experimental: Option[Boolean] = None,
    override val jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
    override val approvalDate: Option[FHIRDate] = None,
    override val implicitRules: Option[UriStr] = None,
    override val lastReviewDate: Option[FHIRDate] = None,
    override val effectivePeriod: Option[Period] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val item: LitSeq[Questionnaire.Item] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Questionnaire(
      id = id,
      url = url,
      meta = meta,
      text = text,
      name = name,
      date = date,
      code = code,
      title = title,
      status = status,
      version = version,
      contact = contact,
      purpose = purpose,
      language = language,
      contained = contained,
      extension = extension,
      publisher = publisher,
      copyright = copyright,
      identifier = identifier,
      useContext = useContext,
      derivedFrom = derivedFrom,
      subjectType = subjectType,
      description = description,
      experimental = experimental,
      jurisdiction = jurisdiction,
      approvalDate = approvalDate,
      implicitRules = implicitRules,
      lastReviewDate = lastReviewDate,
      effectivePeriod = effectivePeriod,
      modifierExtension = modifierExtension,
      item = item,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Questionnaire"
}
