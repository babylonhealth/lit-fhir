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
  ITEM_TYPE,
  PUBLICATION_STATUS,
  QUESTIONNAIRE_ENABLE_BEHAVIOR,
  QUESTIONNAIRE_ENABLE_OPERATOR
}
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Questionnaire extends CompanionFor[Questionnaire] {
  implicit def summonObjectAndCompanionQuestionnaire_1289690162(
      o: Questionnaire): ObjectAndCompanion[Questionnaire, Questionnaire.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Questionnaire
  override type ParentType   = Questionnaire
  override val baseType: CompanionFor[ResourceType] = Questionnaire
  override val parentType: CompanionFor[ParentType] = Questionnaire
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Questionnaire")
  object Item extends CompanionFor[Item] {
    implicit def summonObjectAndCompanionItem_436176122(o: Item): ObjectAndCompanion[Item, Item.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Item
    override type ParentType   = Item
    override val parentType: CompanionFor[ResourceType] = Item
    object Initial extends CompanionFor[Initial] {
      implicit def summonObjectAndCompanionInitial_213509143(o: Initial): ObjectAndCompanion[Initial, Initial.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Initial
      override type ParentType   = Initial
      override val parentType: CompanionFor[ResourceType] = Initial
      type ValueChoice = Choice[Union01113166363]
      def apply(
          id: Option[String] = None,
          value: Initial.ValueChoice,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Initial = new Initial(
        id,
        value,
        extension,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(o: Initial): Option[(Option[String], Initial.ValueChoice, LitSeq[Extension], LitSeq[Extension])] = Some(
        (o.id, o.value, o.extension, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val value: FHIRComponentFieldMeta[Initial.ValueChoice] =
        FHIRComponentFieldMeta("value", lTagOf[Initial.ValueChoice], true, lTagOf[Union01113166363])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value, extension, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Initial): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Initial.ValueChoice](value, t.value),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Initial] = this
      val thisName: String                = "Initial"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Initial] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Initial(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeRef[Union01113166363]("value"),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Initial(
        override val id: Option[String] = None,
        val value: Initial.ValueChoice,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object EnableWhen extends CompanionFor[EnableWhen] {
      implicit def summonObjectAndCompanionEnableWhen_213509143(o: EnableWhen): ObjectAndCompanion[EnableWhen, EnableWhen.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = EnableWhen
      override type ParentType   = EnableWhen
      override val parentType: CompanionFor[ResourceType] = EnableWhen
      type AnswerChoice = Choice[Union_1280102327]
      def apply(
          id: Option[String] = None,
          question: String,
          operator: QUESTIONNAIRE_ENABLE_OPERATOR,
          extension: LitSeq[Extension] = LitSeq.empty,
          answer: EnableWhen.AnswerChoice,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): EnableWhen = new EnableWhen(
        id,
        question,
        operator,
        extension,
        answer,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: EnableWhen): Option[(Option[String], String, QUESTIONNAIRE_ENABLE_OPERATOR, LitSeq[Extension], EnableWhen.AnswerChoice, LitSeq[Extension])] =
        Some((o.id, o.question, o.operator, o.extension, o.answer, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val question: FHIRComponentFieldMeta[String] =
        FHIRComponentFieldMeta("question", lTagOf[String], false, lTagOf[String])
      val operator: FHIRComponentFieldMeta[QUESTIONNAIRE_ENABLE_OPERATOR] =
        FHIRComponentFieldMeta("operator", lTagOf[QUESTIONNAIRE_ENABLE_OPERATOR], false, lTagOf[QUESTIONNAIRE_ENABLE_OPERATOR])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val answer: FHIRComponentFieldMeta[EnableWhen.AnswerChoice] =
        FHIRComponentFieldMeta("answer", lTagOf[EnableWhen.AnswerChoice], true, lTagOf[Union_1280102327])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, question, operator, extension, answer, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: EnableWhen): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[String](question, t.question),
        FHIRComponentField[QUESTIONNAIRE_ENABLE_OPERATOR](operator, t.operator),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[EnableWhen.AnswerChoice](answer, t.answer),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[EnableWhen] = this
      val thisName: String                   = "EnableWhen"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[EnableWhen] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new EnableWhen(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[String]("question", None),
              cursor.decodeAs[QUESTIONNAIRE_ENABLE_OPERATOR]("operator", None),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeRef[Union_1280102327]("answer"),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class EnableWhen(
        override val id: Option[String] = None,
        val question: String,
        val operator: QUESTIONNAIRE_ENABLE_OPERATOR,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val answer: EnableWhen.AnswerChoice,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object AnswerOption extends CompanionFor[AnswerOption] {
      implicit def summonObjectAndCompanionAnswerOption_213509143(
          o: AnswerOption): ObjectAndCompanion[AnswerOption, AnswerOption.type] = ObjectAndCompanion(o, this)
      override type ResourceType = AnswerOption
      override type ParentType   = AnswerOption
      override val parentType: CompanionFor[ResourceType] = AnswerOption
      type ValueChoice = Choice[Union00857130015]
      def apply(
          id: Option[String] = None,
          value: AnswerOption.ValueChoice,
          extension: LitSeq[Extension] = LitSeq.empty,
          initialSelected: Option[Boolean] = None,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): AnswerOption = new AnswerOption(
        id,
        value,
        extension,
        initialSelected,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: AnswerOption): Option[(Option[String], AnswerOption.ValueChoice, LitSeq[Extension], Option[Boolean], LitSeq[Extension])] =
        Some((o.id, o.value, o.extension, o.initialSelected, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val value: FHIRComponentFieldMeta[AnswerOption.ValueChoice] =
        FHIRComponentFieldMeta("value", lTagOf[AnswerOption.ValueChoice], true, lTagOf[Union00857130015])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val initialSelected: FHIRComponentFieldMeta[Option[Boolean]] =
        FHIRComponentFieldMeta("initialSelected", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value, extension, initialSelected, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: AnswerOption): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[AnswerOption.ValueChoice](value, t.value),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[Boolean]](initialSelected, t.initialSelected),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[AnswerOption] = this
      val thisName: String                     = "AnswerOption"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[AnswerOption] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new AnswerOption(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeRef[Union00857130015]("value"),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[Boolean]]("initialSelected", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class AnswerOption(
        override val id: Option[String] = None,
        val value: AnswerOption.ValueChoice,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val initialSelected: Option[Boolean] = None,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        code: LitSeq[Coding] = LitSeq.empty,
        text: Option[String] = None,
        `type`: ITEM_TYPE,
        item: LitSeq[Questionnaire.Item] = LitSeq.empty,
        linkId: String,
        prefix: Option[String] = None,
        repeats: Option[Boolean] = None,
        required: Option[Boolean] = None,
        readOnly: Option[Boolean] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        maxLength: Option[Int] = None,
        definition: Option[UriStr] = None,
        enableBehavior: Option[QUESTIONNAIRE_ENABLE_BEHAVIOR] = None,
        answerValueSet: Option[Canonical] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        initial: LitSeq[Item.Initial] = LitSeq.empty,
        enableWhen: LitSeq[Item.EnableWhen] = LitSeq.empty,
        answerOption: LitSeq[Item.AnswerOption] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Item = new Item(
      id,
      code,
      text,
      `type`,
      item,
      linkId,
      prefix,
      repeats,
      required,
      readOnly,
      extension,
      maxLength,
      definition,
      enableBehavior,
      answerValueSet,
      modifierExtension,
      initial,
      enableWhen,
      answerOption,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Item): Option[(Option[String], LitSeq[Coding], Option[String], ITEM_TYPE, LitSeq[Questionnaire.Item], String, Option[String], Option[Boolean], Option[Boolean], Option[Boolean], LitSeq[Extension], Option[Int], Option[UriStr], Option[QUESTIONNAIRE_ENABLE_BEHAVIOR], Option[Canonical], LitSeq[Extension], LitSeq[Item.Initial], LitSeq[Item.EnableWhen], LitSeq[Item.AnswerOption])] =
      Some(
        (
          o.id,
          o.code,
          o.text,
          o.`type`,
          o.item,
          o.linkId,
          o.prefix,
          o.repeats,
          o.required,
          o.readOnly,
          o.extension,
          o.maxLength,
          o.definition,
          o.enableBehavior,
          o.answerValueSet,
          o.modifierExtension,
          o.initial,
          o.enableWhen,
          o.answerOption))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val code: FHIRComponentFieldMeta[LitSeq[Coding]] =
      FHIRComponentFieldMeta("code", lTagOf[LitSeq[Coding]], false, lTagOf[Coding])
    val text: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("text", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[ITEM_TYPE] =
      FHIRComponentFieldMeta("type", lTagOf[ITEM_TYPE], false, lTagOf[ITEM_TYPE])
    val item: FHIRComponentFieldMeta[LitSeq[Questionnaire.Item]] =
      FHIRComponentFieldMeta("item", lTagOf[LitSeq[Questionnaire.Item]], false, lTagOf[Questionnaire.Item])
    val linkId: FHIRComponentFieldMeta[String] =
      FHIRComponentFieldMeta("linkId", lTagOf[String], false, lTagOf[String])
    val prefix: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("prefix", lTagOf[Option[String]], false, lTagOf[String])
    val repeats: FHIRComponentFieldMeta[Option[Boolean]] =
      FHIRComponentFieldMeta("repeats", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
    val required: FHIRComponentFieldMeta[Option[Boolean]] =
      FHIRComponentFieldMeta("required", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
    val readOnly: FHIRComponentFieldMeta[Option[Boolean]] =
      FHIRComponentFieldMeta("readOnly", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val maxLength: FHIRComponentFieldMeta[Option[Int]] =
      FHIRComponentFieldMeta("maxLength", lTagOf[Option[Int]], false, lTagOf[Int])
    val definition: FHIRComponentFieldMeta[Option[UriStr]] =
      FHIRComponentFieldMeta("definition", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
    val enableBehavior: FHIRComponentFieldMeta[Option[QUESTIONNAIRE_ENABLE_BEHAVIOR]] =
      FHIRComponentFieldMeta(
        "enableBehavior",
        lTagOf[Option[QUESTIONNAIRE_ENABLE_BEHAVIOR]],
        false,
        lTagOf[QUESTIONNAIRE_ENABLE_BEHAVIOR])
    val answerValueSet: FHIRComponentFieldMeta[Option[Canonical]] =
      FHIRComponentFieldMeta("answerValueSet", lTagOf[Option[Canonical]], false, lTagOf[Canonical])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val initial: FHIRComponentFieldMeta[LitSeq[Item.Initial]] =
      FHIRComponentFieldMeta("initial", lTagOf[LitSeq[Item.Initial]], false, lTagOf[Item.Initial])
    val enableWhen: FHIRComponentFieldMeta[LitSeq[Item.EnableWhen]] =
      FHIRComponentFieldMeta("enableWhen", lTagOf[LitSeq[Item.EnableWhen]], false, lTagOf[Item.EnableWhen])
    val answerOption: FHIRComponentFieldMeta[LitSeq[Item.AnswerOption]] =
      FHIRComponentFieldMeta("answerOption", lTagOf[LitSeq[Item.AnswerOption]], false, lTagOf[Item.AnswerOption])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
      id,
      code,
      text,
      `type`,
      item,
      linkId,
      prefix,
      repeats,
      required,
      readOnly,
      extension,
      maxLength,
      definition,
      enableBehavior,
      answerValueSet,
      modifierExtension,
      initial,
      enableWhen,
      answerOption
    )
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Item): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Coding]](code, t.code),
      FHIRComponentField[Option[String]](text, t.text),
      FHIRComponentField[ITEM_TYPE](`type`, t.`type`),
      FHIRComponentField[LitSeq[Questionnaire.Item]](item, t.item),
      FHIRComponentField[String](linkId, t.linkId),
      FHIRComponentField[Option[String]](prefix, t.prefix),
      FHIRComponentField[Option[Boolean]](repeats, t.repeats),
      FHIRComponentField[Option[Boolean]](required, t.required),
      FHIRComponentField[Option[Boolean]](readOnly, t.readOnly),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Int]](maxLength, t.maxLength),
      FHIRComponentField[Option[UriStr]](definition, t.definition),
      FHIRComponentField[Option[QUESTIONNAIRE_ENABLE_BEHAVIOR]](enableBehavior, t.enableBehavior),
      FHIRComponentField[Option[Canonical]](answerValueSet, t.answerValueSet),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[Item.Initial]](initial, t.initial),
      FHIRComponentField[LitSeq[Item.EnableWhen]](enableWhen, t.enableWhen),
      FHIRComponentField[LitSeq[Item.AnswerOption]](answerOption, t.answerOption)
    )
    val baseType: CompanionFor[Item] = this
    val thisName: String             = "Item"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Item] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Item(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Coding]]("code", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("text", Some(None)),
            cursor.decodeAs[ITEM_TYPE]("type", None),
            cursor.decodeAs[LitSeq[Questionnaire.Item]]("item", Some(LitSeq.empty)),
            cursor.decodeAs[String]("linkId", None),
            cursor.decodeAs[Option[String]]("prefix", Some(None)),
            cursor.decodeAs[Option[Boolean]]("repeats", Some(None)),
            cursor.decodeAs[Option[Boolean]]("required", Some(None)),
            cursor.decodeAs[Option[Boolean]]("readOnly", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Int]]("maxLength", Some(None)),
            cursor.decodeAs[Option[UriStr]]("definition", Some(None)),
            cursor.decodeAs[Option[QUESTIONNAIRE_ENABLE_BEHAVIOR]]("enableBehavior", Some(None)),
            cursor.decodeAs[Option[Canonical]]("answerValueSet", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Item.Initial]]("initial", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Item.EnableWhen]]("enableWhen", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Item.AnswerOption]]("answerOption", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Item(
      override val id: Option[String] = None,
      val code: LitSeq[Coding] = LitSeq.empty,
      val text: Option[String] = None,
      val `type`: ITEM_TYPE,
      val item: LitSeq[Questionnaire.Item] = LitSeq.empty,
      val linkId: String,
      val prefix: Option[String] = None,
      val repeats: Option[Boolean] = None,
      val required: Option[Boolean] = None,
      val readOnly: Option[Boolean] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val maxLength: Option[Int] = None,
      val definition: Option[UriStr] = None,
      val enableBehavior: Option[QUESTIONNAIRE_ENABLE_BEHAVIOR] = None,
      val answerValueSet: Option[Canonical] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val initial: LitSeq[Item.Initial] = LitSeq.empty,
      val enableWhen: LitSeq[Item.EnableWhen] = LitSeq.empty,
      val answerOption: LitSeq[Item.AnswerOption] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      url: Option[UriStr] = None,
      meta: Option[Meta] = None,
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
  ): Questionnaire = new Questionnaire(
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
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Questionnaire): Seq[FHIRComponentField[_]] = Seq(
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
  def extractId(t: Questionnaire): Option[String]                    = t.id
  def extractUrl(t: Questionnaire): Option[UriStr]                   = t.url
  def extractMeta(t: Questionnaire): Option[Meta]                    = t.meta
  def extractText(t: Questionnaire): Option[Narrative]               = t.text
  def extractName(t: Questionnaire): Option[String]                  = t.name
  def extractDate(t: Questionnaire): Option[FHIRDateTime]            = t.date
  def extractCode(t: Questionnaire): LitSeq[Coding]                  = t.code
  def extractTitle(t: Questionnaire): Option[String]                 = t.title
  def extractStatus(t: Questionnaire): PUBLICATION_STATUS            = t.status
  def extractVersion(t: Questionnaire): Option[String]               = t.version
  def extractContact(t: Questionnaire): LitSeq[ContactDetail]        = t.contact
  def extractPurpose(t: Questionnaire): Option[Markdown]             = t.purpose
  def extractLanguage(t: Questionnaire): Option[LANGUAGES]           = t.language
  def extractContained(t: Questionnaire): LitSeq[Resource]           = t.contained
  def extractExtension(t: Questionnaire): LitSeq[Extension]          = t.extension
  def extractPublisher(t: Questionnaire): Option[String]             = t.publisher
  def extractCopyright(t: Questionnaire): Option[Markdown]           = t.copyright
  def extractIdentifier(t: Questionnaire): LitSeq[Identifier]        = t.identifier
  def extractUseContext(t: Questionnaire): LitSeq[UsageContext]      = t.useContext
  def extractDerivedFrom(t: Questionnaire): LitSeq[Canonical]        = t.derivedFrom
  def extractSubjectType(t: Questionnaire): LitSeq[RESOURCE_TYPES]   = t.subjectType
  def extractDescription(t: Questionnaire): Option[Markdown]         = t.description
  def extractExperimental(t: Questionnaire): Option[Boolean]         = t.experimental
  def extractJurisdiction(t: Questionnaire): LitSeq[CodeableConcept] = t.jurisdiction
  def extractApprovalDate(t: Questionnaire): Option[FHIRDate]        = t.approvalDate
  def extractImplicitRules(t: Questionnaire): Option[UriStr]         = t.implicitRules
  def extractLastReviewDate(t: Questionnaire): Option[FHIRDate]      = t.lastReviewDate
  def extractEffectivePeriod(t: Questionnaire): Option[Period]       = t.effectivePeriod
  def extractModifierExtension(t: Questionnaire): LitSeq[Extension]  = t.modifierExtension
  def extractItem(t: Questionnaire): LitSeq[Questionnaire.Item]      = t.item
  override val thisName: String                                      = "Questionnaire"
  override val searchParams: Map[String, Questionnaire => Seq[Any]] = Map(
    "jurisdiction"          -> (obj => obj.jurisdiction.toSeq),
    "name"                  -> (obj => obj.name.toSeq),
    "context-type-quantity" -> (obj => obj.useContext.toSeq),
    "description"           -> (obj => obj.description.toSeq),
    "context"               -> (obj => obj.useContext.map(_.value).flatMap(_.as[CodeableConcept]).toSeq),
    "effective"             -> (obj => obj.effectivePeriod.toSeq),
    "code"                  -> (obj => obj.item.flatMap(_.code).toSeq),
    "date"                  -> (obj => obj.date.toSeq),
    "definition"            -> (obj => obj.item.flatMap(_.definition).toSeq),
    "subject-type"          -> (obj => obj.subjectType.toSeq),
    "context-type"          -> (obj => obj.useContext.map(_.code).toSeq),
    "identifier"            -> (obj => obj.identifier.toSeq),
    "url"                   -> (obj => obj.url.toSeq),
    "context-type-value"    -> (obj => obj.useContext.toSeq),
    "version"               -> (obj => obj.version.toSeq),
    "status"                -> (obj => Seq(obj.status)),
    "publisher"             -> (obj => obj.publisher.toSeq),
    "title"                 -> (obj => obj.title.toSeq),
    "context-quantity" -> (obj =>
      obj.useContext.map(_.value).flatMap(_.as[Quantity]).toSeq ++
        obj.useContext.map(_.value).flatMap(_.as[Range]).toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Questionnaire] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Questionnaire(
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

/** A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed
  * control over order, presentation, phraseology and grouping to allow coherent, consistent data collection.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields url, name, date, code, title, status, version, contact, purpose, publisher, copyright, identifier,
  *   useContext, derivedFrom, subjectType, description, experimental, jurisdiction, approvalDate, lastReviewDate,
  *   effectivePeriod, item.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param url
  *   - An absolute URI that is used to identify this questionnaire when it is referenced in a specification, model, design or an
  *   instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at
  *   which an authoritative instance of this questionnaire is (or will be) published. This URL can be the target of a canonical
  *   reference. It SHALL remain the same when the questionnaire is stored on different servers.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *   not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *   resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to
  *   make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be
  *   represented in the narrative to ensure clinical safety.
  * @param name
  *   - A natural language name identifying the questionnaire. This name should be usable as an identifier for the module by
  *   machine processing applications such as code generation.
  * @param date
  *   - The date (and optionally time) when the questionnaire was published. The date must change when the business version
  *   changes and it must change if the status code changes. In addition, it should change when the substantive content of the
  *   questionnaire changes.
  * @param code
  *   - An identifier for this question or group of questions in a particular terminology such as LOINC.
  * @param title
  *   - A short, descriptive, user-friendly title for the questionnaire.
  * @param status
  *   - The status of this questionnaire. Enables tracking the life-cycle of the content.
  * @param version
  *   - The identifier that is used to identify this version of the questionnaire when it is referenced in a specification,
  *   model, design or instance. This is an arbitrary value managed by the questionnaire author and is not expected to be globally
  *   unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no
  *   expectation that versions can be placed in a lexicographical sequence.
  * @param contact
  *   - Contact details to assist a user in finding and communicating with the publisher.
  * @param purpose
  *   - Explanation of why this questionnaire is needed and why it has been designed as it has.
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
  * @param publisher
  *   - The name of the organization or individual that published the questionnaire.
  * @param copyright
  *   - A copyright statement relating to the questionnaire and/or its contents. Copyright statements are generally legal
  *   restrictions on the use and publishing of the questionnaire.
  * @param identifier
  *   - A formal identifier that is used to identify this questionnaire when it is represented in other formats, or referenced in
  *   a specification, model, design or an instance.
  * @param useContext
  *   - The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be
  *   general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be
  *   used to assist with indexing and searching for appropriate questionnaire instances.
  * @param derivedFrom
  *   - The URL of a Questionnaire that this Questionnaire is based on.
  * @param subjectType
  *   - The types of subjects that can be the subject of responses created for the questionnaire.
  * @param description
  *   - A free text natural language description of the questionnaire from a consumer's perspective.
  * @param experimental
  *   - A Boolean value to indicate that this questionnaire is authored for testing purposes (or education/evaluation/marketing)
  *   and is not intended to be used for genuine usage.
  * @param jurisdiction
  *   - A legal or geographic region in which the questionnaire is intended to be used.
  * @param approvalDate
  *   - The date on which the resource content was approved by the publisher. Approval happens once when the content is
  *   officially approved for usage.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param lastReviewDate
  *   - The date on which the resource content was last reviewed. Review happens periodically after approval but does not change
  *   the original approval date.
  * @param effectivePeriod
  *   - The period during which the questionnaire content was or is planned to be in active use.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that
  *   modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *   Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *   strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *   extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *   processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any
  *   elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param item
  *   - A particular question, question grouping or display text that is part of the questionnaire.
  */
@POJOBoilerplate
class Questionnaire(
    override val id: Option[String] = None,
    val url: Option[UriStr] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val name: Option[String] = None,
    val date: Option[FHIRDateTime] = None,
    val code: LitSeq[Coding] = LitSeq.empty,
    val title: Option[String] = None,
    val status: PUBLICATION_STATUS,
    val version: Option[String] = None,
    val contact: LitSeq[ContactDetail] = LitSeq.empty,
    val purpose: Option[Markdown] = None,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val publisher: Option[String] = None,
    val copyright: Option[Markdown] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val useContext: LitSeq[UsageContext] = LitSeq.empty,
    val derivedFrom: LitSeq[Canonical] = LitSeq.empty,
    val subjectType: LitSeq[RESOURCE_TYPES] = LitSeq.empty,
    val description: Option[Markdown] = None,
    val experimental: Option[Boolean] = None,
    val jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
    val approvalDate: Option[FHIRDate] = None,
    override val implicitRules: Option[UriStr] = None,
    val lastReviewDate: Option[FHIRDate] = None,
    val effectivePeriod: Option[Period] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val item: LitSeq[Questionnaire.Item] = LitSeq.empty,
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
  override val thisTypeName: String = "Questionnaire"
}
