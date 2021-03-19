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
import com.babylonhealth.lit.hl7.QUESTIONNAIRE_ANSWERS_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object QuestionnaireResponse extends CompanionFor[QuestionnaireResponse] {
  override type ResourceType = QuestionnaireResponse
  override val baseType: CompanionFor[ResourceType] = QuestionnaireResponse
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/QuestionnaireResponse")
  object Item extends CompanionFor[Item] {
    override type ResourceType = Item
    object Answer extends CompanionFor[Answer] {
      override type ResourceType = Answer
      type ValueChoice           = Choice[Union_2101127777]
      def apply(
          id: Option[String] = None,
          item: LitSeq[QuestionnaireResponse.Item] = LitSeq.empty,
          value: Option[Answer.ValueChoice] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Answer = new Answer(
        id,
        item,
        value,
        extension,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Answer): Option[(Option[String], LitSeq[QuestionnaireResponse.Item], Option[Answer.ValueChoice], LitSeq[Extension], LitSeq[Extension])] =
        Some((o.id, o.item, o.value, o.extension, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val item: FHIRComponentFieldMeta[LitSeq[QuestionnaireResponse.Item]] =
        FHIRComponentFieldMeta(
          "item",
          lTagOf[LitSeq[QuestionnaireResponse.Item]],
          false,
          lTagOf[QuestionnaireResponse.Item])
      val value: FHIRComponentFieldMeta[Option[Answer.ValueChoice]] =
        FHIRComponentFieldMeta("value", lTagOf[Option[Answer.ValueChoice]], true, lTagOf[Union_2101127777])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, item, value, extension, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Answer): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[LitSeq[QuestionnaireResponse.Item]](item, t.item),
        FHIRComponentField[Option[Answer.ValueChoice]](value, t.value),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Answer] = this
      val thisName: String               = "Answer"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Answer] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Answer(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[LitSeq[QuestionnaireResponse.Item]]("item", Some(LitSeq.empty)),
              cursor.decodeOptRef[Union_2101127777]("value"),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Answer(
        override val id: Option[String] = None,
        val item: LitSeq[QuestionnaireResponse.Item] = LitSeq.empty,
        val value: Option[Answer.ValueChoice] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        text: Option[String] = None,
        item: LitSeq[QuestionnaireResponse.Item] = LitSeq.empty,
        linkId: String,
        extension: LitSeq[Extension] = LitSeq.empty,
        definition: Option[UriStr] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        answer: LitSeq[Item.Answer] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Item = new Item(
      id,
      text,
      item,
      linkId,
      extension,
      definition,
      modifierExtension,
      answer,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Item): Option[(Option[String], Option[String], LitSeq[QuestionnaireResponse.Item], String, LitSeq[Extension], Option[UriStr], LitSeq[Extension], LitSeq[Item.Answer])] =
      Some((o.id, o.text, o.item, o.linkId, o.extension, o.definition, o.modifierExtension, o.answer))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val text: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("text", lTagOf[Option[String]], false, lTagOf[String])
    val item: FHIRComponentFieldMeta[LitSeq[QuestionnaireResponse.Item]] =
      FHIRComponentFieldMeta(
        "item",
        lTagOf[LitSeq[QuestionnaireResponse.Item]],
        false,
        lTagOf[QuestionnaireResponse.Item])
    val linkId: FHIRComponentFieldMeta[String] =
      FHIRComponentFieldMeta("linkId", lTagOf[String], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val definition: FHIRComponentFieldMeta[Option[UriStr]] =
      FHIRComponentFieldMeta("definition", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val answer: FHIRComponentFieldMeta[LitSeq[Item.Answer]] =
      FHIRComponentFieldMeta("answer", lTagOf[LitSeq[Item.Answer]], false, lTagOf[Item.Answer])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, text, item, linkId, extension, definition, modifierExtension, answer)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Item): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[String]](text, t.text),
      FHIRComponentField[LitSeq[QuestionnaireResponse.Item]](item, t.item),
      FHIRComponentField[String](linkId, t.linkId),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[UriStr]](definition, t.definition),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[Item.Answer]](answer, t.answer)
    )
    val baseType: CompanionFor[Item] = this
    val thisName: String             = "Item"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Item] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Item(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[String]]("text", Some(None)),
            cursor.decodeAs[LitSeq[QuestionnaireResponse.Item]]("item", Some(LitSeq.empty)),
            cursor.decodeAs[String]("linkId", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[UriStr]]("definition", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Item.Answer]]("answer", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Item(
      override val id: Option[String] = None,
      val text: Option[String] = None,
      val item: LitSeq[QuestionnaireResponse.Item] = LitSeq.empty,
      val linkId: String,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val definition: Option[UriStr] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val answer: LitSeq[Item.Answer] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      partOf: LitSeq[Reference] = LitSeq.empty,
      status: QUESTIONNAIRE_ANSWERS_STATUS,
      author: Option[Reference] = None,
      source: Option[Reference] = None,
      basedOn: LitSeq[Reference] = LitSeq.empty,
      subject: Option[Reference] = None,
      language: Option[LANGUAGES] = None,
      authored: Option[FHIRDateTime] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      encounter: Option[Reference] = None,
      identifier: Option[Identifier] = None,
      implicitRules: Option[UriStr] = None,
      questionnaire: Option[Canonical] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      item: LitSeq[QuestionnaireResponse.Item] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): QuestionnaireResponse = new QuestionnaireResponse(
    id,
    meta,
    text,
    partOf,
    status,
    author,
    source,
    basedOn,
    subject,
    language,
    authored,
    contained,
    extension,
    encounter,
    identifier,
    implicitRules,
    questionnaire,
    modifierExtension,
    item,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val partOf: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("partOf", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val status: FHIRComponentFieldMeta[QUESTIONNAIRE_ANSWERS_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[QUESTIONNAIRE_ANSWERS_STATUS], false, lTagOf[QUESTIONNAIRE_ANSWERS_STATUS])
  val author: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("author", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val source: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("source", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val basedOn: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("basedOn", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val subject: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("subject", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val authored: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("authored", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val encounter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("encounter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[Option[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val questionnaire: FHIRComponentFieldMeta[Option[Canonical]] =
    FHIRComponentFieldMeta("questionnaire", lTagOf[Option[Canonical]], false, lTagOf[Canonical])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val item: FHIRComponentFieldMeta[LitSeq[QuestionnaireResponse.Item]] =
    FHIRComponentFieldMeta(
      "item",
      lTagOf[LitSeq[QuestionnaireResponse.Item]],
      false,
      lTagOf[QuestionnaireResponse.Item])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    partOf,
    status,
    author,
    source,
    basedOn,
    subject,
    language,
    authored,
    contained,
    extension,
    encounter,
    identifier,
    implicitRules,
    questionnaire,
    modifierExtension,
    item
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: QuestionnaireResponse): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[LitSeq[Reference]](partOf, t.partOf),
    FHIRComponentField[QUESTIONNAIRE_ANSWERS_STATUS](status, t.status),
    FHIRComponentField[Option[Reference]](author, t.author),
    FHIRComponentField[Option[Reference]](source, t.source),
    FHIRComponentField[LitSeq[Reference]](basedOn, t.basedOn),
    FHIRComponentField[Option[Reference]](subject, t.subject),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Option[FHIRDateTime]](authored, t.authored),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Reference]](encounter, t.encounter),
    FHIRComponentField[Option[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[Canonical]](questionnaire, t.questionnaire),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[QuestionnaireResponse.Item]](item, t.item)
  )
  def extractId(t: QuestionnaireResponse): Option[String]                       = t.id
  def extractMeta(t: QuestionnaireResponse): Option[Meta]                       = t.meta
  def extractText(t: QuestionnaireResponse): Option[Narrative]                  = t.text
  def extractPartOf(t: QuestionnaireResponse): LitSeq[Reference]                = t.partOf
  def extractStatus(t: QuestionnaireResponse): QUESTIONNAIRE_ANSWERS_STATUS     = t.status
  def extractAuthor(t: QuestionnaireResponse): Option[Reference]                = t.author
  def extractSource(t: QuestionnaireResponse): Option[Reference]                = t.source
  def extractBasedOn(t: QuestionnaireResponse): LitSeq[Reference]               = t.basedOn
  def extractSubject(t: QuestionnaireResponse): Option[Reference]               = t.subject
  def extractLanguage(t: QuestionnaireResponse): Option[LANGUAGES]              = t.language
  def extractAuthored(t: QuestionnaireResponse): Option[FHIRDateTime]           = t.authored
  def extractContained(t: QuestionnaireResponse): LitSeq[Resource]              = t.contained
  def extractExtension(t: QuestionnaireResponse): LitSeq[Extension]             = t.extension
  def extractEncounter(t: QuestionnaireResponse): Option[Reference]             = t.encounter
  def extractIdentifier(t: QuestionnaireResponse): Option[Identifier]           = t.identifier
  def extractImplicitRules(t: QuestionnaireResponse): Option[UriStr]            = t.implicitRules
  def extractQuestionnaire(t: QuestionnaireResponse): Option[Canonical]         = t.questionnaire
  def extractModifierExtension(t: QuestionnaireResponse): LitSeq[Extension]     = t.modifierExtension
  def extractItem(t: QuestionnaireResponse): LitSeq[QuestionnaireResponse.Item] = t.item
  override val thisName: String                                                 = "QuestionnaireResponse"
  override val searchParams: Map[String, QuestionnaireResponse => Seq[Any]] = Map(
    "author"     -> (obj => obj.author.toSeq),
    "source"     -> (obj => obj.source.toSeq),
    "subject"    -> (obj => obj.subject.toSeq),
    "identifier" -> (obj => obj.identifier.toSeq),
    "item-subject" -> (obj =>
      obj.item
        .filter(_.extension.exists(_.url == "http://hl7.org/fhir/StructureDefinition/questionnaireresponse-isSubject"))
        .flatMap(_.answer)
        .flatMap(_.value)
        .flatMap(_.as[Reference])
        .toSeq),
    "status"        -> (obj => Seq(obj.status)),
    "part-of"       -> (obj => obj.partOf.toSeq),
    "authored"      -> (obj => obj.authored.toSeq),
    "based-on"      -> (obj => obj.basedOn.toSeq),
    "encounter"     -> (obj => obj.encounter.toSeq),
    "questionnaire" -> (obj => obj.questionnaire.toSeq),
    "patient"       -> (obj => obj.subject.filter(_.reference.exists(_.contains("Patient/"))).toSeq)
  )
  def unapply(
      o: QuestionnaireResponse): Option[(Option[String], Option[Meta], Option[Narrative], LitSeq[Reference], QUESTIONNAIRE_ANSWERS_STATUS, Option[Reference], Option[Reference], LitSeq[Reference], Option[Reference], Option[LANGUAGES], Option[FHIRDateTime], LitSeq[Resource], LitSeq[Extension], Option[Reference], Option[Identifier], Option[UriStr], Option[Canonical], LitSeq[Extension], LitSeq[QuestionnaireResponse.Item])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.partOf,
        o.status,
        o.author,
        o.source,
        o.basedOn,
        o.subject,
        o.language,
        o.authored,
        o.contained,
        o.extension,
        o.encounter,
        o.identifier,
        o.implicitRules,
        o.questionnaire,
        o.modifierExtension,
        o.item))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[QuestionnaireResponse] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new QuestionnaireResponse(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("partOf", Some(LitSeq.empty)),
          cursor.decodeAs[QUESTIONNAIRE_ANSWERS_STATUS]("status", None),
          cursor.decodeAs[Option[Reference]]("author", Some(None)),
          cursor.decodeAs[Option[Reference]]("source", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("basedOn", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("subject", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("authored", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          cursor.decodeAs[Option[Identifier]]("identifier", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[Canonical]]("questionnaire", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[QuestionnaireResponse.Item]]("item", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields partOf, status, author, source, basedOn, subject, authored, encounter, identifier, questionnaire, item.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param partOf - A procedure or observation that this questionnaire was performed as part of the execution of.  For example, the surgery a checklist was executed as part of.
  * @param status - The position of the questionnaire response within its overall lifecycle.
  * @param author - Person who received the answers to the questions in the QuestionnaireResponse and recorded them in the system.
  * @param source - The person who answered the questions about the subject.
  * @param basedOn - The order, proposal or plan that is fulfilled in whole or in part by this QuestionnaireResponse.  For example, a ServiceRequest seeking an intake assessment or a decision support recommendation to assess for post-partum depression.
  * @param subject - The subject of the questionnaire response.  This could be a patient, organization, practitioner, device, etc.  This is who/what the answers apply to, but is not necessarily the source of information.
  * @param language - The base language in which the resource is written.
  * @param authored - The date and/or time that this set of answers were last changed.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param encounter - The Encounter during which this questionnaire response was created or to which the creation of this record is tightly associated.
  * @param identifier - A business identifier assigned to a particular completed (or partially completed) questionnaire.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param questionnaire - The Questionnaire that defines and organizes the questions for which answers are being provided.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param item - A group or question item from the original questionnaire for which answers are provided.
  */
@POJOBoilerplate
class QuestionnaireResponse(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val partOf: LitSeq[Reference] = LitSeq.empty,
    val status: QUESTIONNAIRE_ANSWERS_STATUS,
    val author: Option[Reference] = None,
    val source: Option[Reference] = None,
    val basedOn: LitSeq[Reference] = LitSeq.empty,
    val subject: Option[Reference] = None,
    override val language: Option[LANGUAGES] = None,
    val authored: Option[FHIRDateTime] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val encounter: Option[Reference] = None,
    val identifier: Option[Identifier] = None,
    override val implicitRules: Option[UriStr] = None,
    val questionnaire: Option[Canonical] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val item: LitSeq[QuestionnaireResponse.Item] = LitSeq.empty,
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
  override val thisTypeName: String = "QuestionnaireResponse"
}
