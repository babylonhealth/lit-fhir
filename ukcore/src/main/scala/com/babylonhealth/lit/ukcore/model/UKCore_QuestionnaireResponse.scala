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
import com.babylonhealth.lit.hl7.QUESTIONNAIRE_ANSWERS_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, ukcore }
import com.babylonhealth.lit.macros.POJOBoilerplate

object UKCore_QuestionnaireResponse extends CompanionFor[UKCore_QuestionnaireResponse] {
  implicit def summonObjectAndCompanionUKCore_QuestionnaireResponse838075573(
      o: UKCore_QuestionnaireResponse): ObjectAndCompanion[UKCore_QuestionnaireResponse, UKCore_QuestionnaireResponse.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = QuestionnaireResponse
  override type ParentType   = QuestionnaireResponse
  override val baseType: CompanionFor[ResourceType] = QuestionnaireResponse
  override val parentType: CompanionFor[ParentType] = QuestionnaireResponse
  override val profileUrl: Option[String] = Some("https://fhir.hl7.org.uk/StructureDefinition/UKCore-QuestionnaireResponse")
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(
        new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-QuestionnaireResponse"))),
      text: Option[Narrative] = None,
      status: QUESTIONNAIRE_ANSWERS_STATUS,
      language: Option[LANGUAGES] = None,
      authored: Option[FHIRDateTime] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      questionnaire: Option[Canonical] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      identifier: Option[Identifier] = None,
      partOf: LitSeq[Reference] = LitSeq.empty,
      author: Option[Reference] = None,
      source: Option[Reference] = None,
      basedOn: LitSeq[Reference] = LitSeq.empty,
      subject: Option[Reference] = None,
      item: LitSeq[QuestionnaireResponse.Item] = LitSeq.empty,
      encounter: Option[Reference] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): UKCore_QuestionnaireResponse = new UKCore_QuestionnaireResponse(
    id,
    meta,
    text,
    status,
    language,
    authored,
    contained,
    extension,
    implicitRules,
    questionnaire,
    modifierExtension,
    identifier,
    partOf,
    author,
    source,
    basedOn,
    subject,
    item,
    encounter,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val status: FHIRComponentFieldMeta[QUESTIONNAIRE_ANSWERS_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[QUESTIONNAIRE_ANSWERS_STATUS], false, lTagOf[QUESTIONNAIRE_ANSWERS_STATUS])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val authored: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("authored", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val questionnaire: FHIRComponentFieldMeta[Option[Canonical]] =
    FHIRComponentFieldMeta("questionnaire", lTagOf[Option[Canonical]], false, lTagOf[Canonical])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[Option[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
  val partOf: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("partOf", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val author: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("author", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val source: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("source", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val basedOn: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("basedOn", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val subject: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("subject", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val item: FHIRComponentFieldMeta[LitSeq[QuestionnaireResponse.Item]] =
    FHIRComponentFieldMeta("item", lTagOf[LitSeq[QuestionnaireResponse.Item]], false, lTagOf[QuestionnaireResponse.Item])
  val encounter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("encounter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    status,
    language,
    authored,
    contained,
    extension,
    implicitRules,
    questionnaire,
    modifierExtension,
    identifier,
    partOf,
    author,
    source,
    basedOn,
    subject,
    item,
    encounter
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Meta]](meta, t.meta),
      FHIRComponentField[Option[Narrative]](text, t.text),
      FHIRComponentField[QUESTIONNAIRE_ANSWERS_STATUS](status, t.status),
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[Option[FHIRDateTime]](authored, t.authored),
      FHIRComponentField[LitSeq[Resource]](contained, t.contained),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[Option[Canonical]](questionnaire, t.questionnaire),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[Identifier]](identifier, t.identifier),
      FHIRComponentField[LitSeq[Reference]](partOf, t.partOf),
      FHIRComponentField[Option[Reference]](author, t.author),
      FHIRComponentField[Option[Reference]](source, t.source),
      FHIRComponentField[LitSeq[Reference]](basedOn, t.basedOn),
      FHIRComponentField[Option[Reference]](subject, t.subject),
      FHIRComponentField[LitSeq[QuestionnaireResponse.Item]](item, t.item),
      FHIRComponentField[Option[Reference]](encounter, t.encounter)
    ))
  override def fields(t: UKCore_QuestionnaireResponse): Seq[FHIRComponentField[_]]     = fieldsFromParent(t).get
  def extractId(t: UKCore_QuestionnaireResponse): Option[String]                       = t.id
  def extractMeta(t: UKCore_QuestionnaireResponse): Option[Meta]                       = t.meta
  def extractText(t: UKCore_QuestionnaireResponse): Option[Narrative]                  = t.text
  def extractStatus(t: UKCore_QuestionnaireResponse): QUESTIONNAIRE_ANSWERS_STATUS     = t.status
  def extractLanguage(t: UKCore_QuestionnaireResponse): Option[LANGUAGES]              = t.language
  def extractAuthored(t: UKCore_QuestionnaireResponse): Option[FHIRDateTime]           = t.authored
  def extractContained(t: UKCore_QuestionnaireResponse): LitSeq[Resource]              = t.contained
  def extractExtension(t: UKCore_QuestionnaireResponse): LitSeq[Extension]             = t.extension
  def extractImplicitRules(t: UKCore_QuestionnaireResponse): Option[UriStr]            = t.implicitRules
  def extractQuestionnaire(t: UKCore_QuestionnaireResponse): Option[Canonical]         = t.questionnaire
  def extractModifierExtension(t: UKCore_QuestionnaireResponse): LitSeq[Extension]     = t.modifierExtension
  def extractIdentifier(t: UKCore_QuestionnaireResponse): Option[Identifier]           = t.identifier
  def extractPartOf(t: UKCore_QuestionnaireResponse): LitSeq[Reference]                = t.partOf
  def extractAuthor(t: UKCore_QuestionnaireResponse): Option[Reference]                = t.author
  def extractSource(t: UKCore_QuestionnaireResponse): Option[Reference]                = t.source
  def extractBasedOn(t: UKCore_QuestionnaireResponse): LitSeq[Reference]               = t.basedOn
  def extractSubject(t: UKCore_QuestionnaireResponse): Option[Reference]               = t.subject
  def extractItem(t: UKCore_QuestionnaireResponse): LitSeq[QuestionnaireResponse.Item] = t.item
  def extractEncounter(t: UKCore_QuestionnaireResponse): Option[Reference]             = t.encounter
  override val thisName: String                                                        = "UKCore_QuestionnaireResponse"
  override val searchParams: Map[String, UKCore_QuestionnaireResponse => Seq[Any]]     = QuestionnaireResponse.searchParams
  def unapply(
      o: UKCore_QuestionnaireResponse): Option[(Option[String], Option[Meta], Option[Narrative], QUESTIONNAIRE_ANSWERS_STATUS, Option[LANGUAGES], Option[FHIRDateTime], LitSeq[Resource], LitSeq[Extension], Option[UriStr], Option[Canonical], LitSeq[Extension], Option[Identifier], LitSeq[Reference], Option[Reference], Option[Reference], LitSeq[Reference], Option[Reference], LitSeq[QuestionnaireResponse.Item], Option[Reference])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.status,
        o.language,
        o.authored,
        o.contained,
        o.extension,
        o.implicitRules,
        o.questionnaire,
        o.modifierExtension,
        o.identifier,
        o.partOf,
        o.author,
        o.source,
        o.basedOn,
        o.subject,
        o.item,
        o.encounter))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[UKCore_QuestionnaireResponse] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new UKCore_QuestionnaireResponse(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[QUESTIONNAIRE_ANSWERS_STATUS]("status", None),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("authored", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[Canonical]]("questionnaire", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Identifier]]("identifier", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("partOf", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("author", Some(None)),
          cursor.decodeAs[Option[Reference]]("source", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("basedOn", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("subject", Some(None)),
          cursor.decodeAs[LitSeq[QuestionnaireResponse.Item]]("item", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** Defines the UK Core constraints and extensions on the QuestionnaireResponse resource for the minimal set of data to query and
  * retrieve a complete or partial list of answers to a set of questions completed when responding to a questionnaire.
  *
  * Subclass of [[hl7.model.QuestionnaireResponse]] (A structured set of questions and their answers. The questions are ordered
  * and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to.)
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
  * @param status
  *   \- The position of the questionnaire response within its overall lifecycle.
  * @param language
  *   \- The base language in which the resource is written.
  * @param authored
  *   \- The date and/or time that this set of answers were last changed.
  * @param contained
  *   \- These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   \- May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param implicitRules
  *   \- A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param questionnaire
  *   \- The Questionnaire that defines and organizes the questions for which answers are being provided.
  * @param modifierExtension
  *   \- May be used to represent additional information that is not part of the basic definition of the resource and that
  *   modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *   Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *   strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *   extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *   processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any
  *   elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param identifier
  *   \- A business identifier assigned to a particular completed (or partially completed) questionnaire.
  * @param partOf
  *   \- A procedure or observation that this questionnaire was performed as part of the execution of. For example, the surgery a
  *   checklist was executed as part of.
  * @param author
  *   \- Person who received the answers to the questions in the QuestionnaireResponse and recorded them in the system.
  * @param source
  *   \- The person who answered the questions about the subject.
  * @param basedOn
  *   \- The order, proposal or plan that is fulfilled in whole or in part by this QuestionnaireResponse. For example, a
  *   ServiceRequest seeking an intake assessment or a decision support recommendation to assess for post-partum depression.
  * @param subject
  *   \- The subject of the questionnaire response. This could be a patient, organization, practitioner, device, etc. This is
  *   who/what the answers apply to, but is not necessarily the source of information.
  * @param item
  *   \- A group or question item from the original questionnaire for which answers are provided.
  * @param encounter
  *   \- The Encounter during which this questionnaire response was created or to which the creation of this record is tightly
  *   associated.
  */
@POJOBoilerplate
class UKCore_QuestionnaireResponse(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-QuestionnaireResponse"))),
    override val text: Option[Narrative] = None,
    override val status: QUESTIONNAIRE_ANSWERS_STATUS,
    override val language: Option[LANGUAGES] = None,
    override val authored: Option[FHIRDateTime] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    override val questionnaire: Option[Canonical] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val identifier: Option[Identifier] = None,
    override val partOf: LitSeq[Reference] = LitSeq.empty,
    override val author: Option[Reference] = None,
    override val source: Option[Reference] = None,
    override val basedOn: LitSeq[Reference] = LitSeq.empty,
    override val subject: Option[Reference] = None,
    override val item: LitSeq[QuestionnaireResponse.Item] = LitSeq.empty,
    override val encounter: Option[Reference] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends QuestionnaireResponse(
      id = id,
      meta = meta,
      text = text,
      partOf = partOf,
      status = status,
      author = author,
      source = source,
      basedOn = basedOn,
      subject = subject,
      language = language,
      authored = authored,
      contained = contained,
      extension = extension,
      encounter = encounter,
      identifier = identifier,
      implicitRules = implicitRules,
      questionnaire = questionnaire,
      modifierExtension = modifierExtension,
      item = item,
      primitiveAttributes = primitiveAttributes
    ) {
  override val thisTypeName: String = "QuestionnaireResponse"
}
