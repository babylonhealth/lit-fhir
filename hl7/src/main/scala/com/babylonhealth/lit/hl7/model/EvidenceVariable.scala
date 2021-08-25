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
import com.babylonhealth.lit.hl7.{ PUBLICATION_STATUS, GROUP_MEASURE }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object EvidenceVariable extends CompanionFor[EvidenceVariable] {
  implicit def summonObjectAndCompanionEvidenceVariable_768441368(
      o: EvidenceVariable): ObjectAndCompanion[EvidenceVariable, EvidenceVariable.type] = ObjectAndCompanion(o, this)
  override type ResourceType = EvidenceVariable
  override type ParentType   = EvidenceVariable
  override val baseType: CompanionFor[ResourceType] = EvidenceVariable
  override val parentType: CompanionFor[ParentType] = EvidenceVariable
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/EvidenceVariable")
  object Characteristic extends CompanionFor[Characteristic] {
    implicit def summonObjectAndCompanionCharacteristic1970644006(
        o: Characteristic): ObjectAndCompanion[Characteristic, Characteristic.type] = ObjectAndCompanion(o, this)
    override type ResourceType = Characteristic
    override type ParentType   = Characteristic
    override val parentType: CompanionFor[ResourceType] = Characteristic
    object TimeFromStart extends CompanionFor[TimeFromStart] {
      implicit def summonObjectAndCompanionTimeFromStart1861447049(
          o: TimeFromStart): ObjectAndCompanion[TimeFromStart, TimeFromStart.type] = ObjectAndCompanion(o, this)
      override type ResourceType = TimeFromStart
      override type ParentType   = TimeFromStart
      override val parentType: CompanionFor[ResourceType] = TimeFromStart
      def apply(
          id: Option[String] = None,
          note: LitSeq[Annotation] = LitSeq.empty,
          range: Option[Range] = None,
          quantity: Option[Quantity] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          description: Option[String] = None,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): TimeFromStart = new TimeFromStart(
        id,
        note,
        range,
        quantity,
        extension,
        description,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: TimeFromStart): Option[(Option[String], LitSeq[Annotation], Option[Range], Option[Quantity], LitSeq[Extension], Option[String], LitSeq[Extension])] =
        Some((o.id, o.note, o.range, o.quantity, o.extension, o.description, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
        FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
      val range: FHIRComponentFieldMeta[Option[Range]] =
        FHIRComponentFieldMeta("range", lTagOf[Option[Range]], false, lTagOf[Range])
      val quantity: FHIRComponentFieldMeta[Option[Quantity]] =
        FHIRComponentFieldMeta("quantity", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val description: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, note, range, quantity, extension, description, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: TimeFromStart): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[LitSeq[Annotation]](note, t.note),
        FHIRComponentField[Option[Range]](range, t.range),
        FHIRComponentField[Option[Quantity]](quantity, t.quantity),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[String]](description, t.description),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[TimeFromStart] = this
      val thisName: String                      = "TimeFromStart"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[TimeFromStart] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new TimeFromStart(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
              cursor.decodeAs[Option[Range]]("range", Some(None)),
              cursor.decodeAs[Option[Quantity]]("quantity", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[String]]("description", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class TimeFromStart(
        override val id: Option[String] = None,
        val note: LitSeq[Annotation] = LitSeq.empty,
        val range: Option[Range] = None,
        val quantity: Option[Quantity] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val description: Option[String] = None,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    type DefinitionChoice = Choice[Union01198965985]
    def apply(
        id: Option[String] = None,
        method: Option[CodeableConcept] = None,
        device: Option[Reference] = None,
        exclude: Option[Boolean] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        description: Option[String] = None,
        groupMeasure: Option[GROUP_MEASURE] = None,
        definition: Characteristic.DefinitionChoice,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        timeFromStart: Option[Characteristic.TimeFromStart] = None,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Characteristic = new Characteristic(
      id,
      method,
      device,
      exclude,
      extension,
      description,
      groupMeasure,
      definition,
      modifierExtension,
      timeFromStart,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Characteristic): Option[(Option[String], Option[CodeableConcept], Option[Reference], Option[Boolean], LitSeq[Extension], Option[String], Option[GROUP_MEASURE], Characteristic.DefinitionChoice, LitSeq[Extension], Option[Characteristic.TimeFromStart])] =
      Some(
        (
          o.id,
          o.method,
          o.device,
          o.exclude,
          o.extension,
          o.description,
          o.groupMeasure,
          o.definition,
          o.modifierExtension,
          o.timeFromStart))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val method: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("method", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val device: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("device", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val exclude: FHIRComponentFieldMeta[Option[Boolean]] =
      FHIRComponentFieldMeta("exclude", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val description: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
    val groupMeasure: FHIRComponentFieldMeta[Option[GROUP_MEASURE]] =
      FHIRComponentFieldMeta("groupMeasure", lTagOf[Option[GROUP_MEASURE]], false, lTagOf[GROUP_MEASURE])
    val definition: FHIRComponentFieldMeta[Characteristic.DefinitionChoice] =
      FHIRComponentFieldMeta("definition", lTagOf[Characteristic.DefinitionChoice], true, lTagOf[Union01198965985])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val timeFromStart: FHIRComponentFieldMeta[Option[Characteristic.TimeFromStart]] =
      FHIRComponentFieldMeta(
        "timeFromStart",
        lTagOf[Option[Characteristic.TimeFromStart]],
        false,
        lTagOf[Characteristic.TimeFromStart])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, method, device, exclude, extension, description, groupMeasure, definition, modifierExtension, timeFromStart)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Characteristic): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](method, t.method),
      FHIRComponentField[Option[Reference]](device, t.device),
      FHIRComponentField[Option[Boolean]](exclude, t.exclude),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[String]](description, t.description),
      FHIRComponentField[Option[GROUP_MEASURE]](groupMeasure, t.groupMeasure),
      FHIRComponentField[Characteristic.DefinitionChoice](definition, t.definition),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[Characteristic.TimeFromStart]](timeFromStart, t.timeFromStart)
    )
    val baseType: CompanionFor[Characteristic] = this
    val thisName: String                       = "Characteristic"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Characteristic] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Characteristic(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("method", Some(None)),
            cursor.decodeAs[Option[Reference]]("device", Some(None)),
            cursor.decodeAs[Option[Boolean]]("exclude", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("description", Some(None)),
            cursor.decodeAs[Option[GROUP_MEASURE]]("groupMeasure", Some(None)),
            cursor.decodeRef[Union01198965985]("definition"),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Characteristic.TimeFromStart]]("timeFromStart", Some(None)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Characteristic(
      override val id: Option[String] = None,
      val method: Option[CodeableConcept] = None,
      val device: Option[Reference] = None,
      val exclude: Option[Boolean] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val description: Option[String] = None,
      val groupMeasure: Option[GROUP_MEASURE] = None,
      val definition: Characteristic.DefinitionChoice,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val timeFromStart: Option[Characteristic.TimeFromStart] = None,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Category extends CompanionFor[Category] {
    implicit def summonObjectAndCompanionCategory1970644006(o: Category): ObjectAndCompanion[Category, Category.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Category
    override type ParentType   = Category
    override val parentType: CompanionFor[ResourceType] = Category
    type ValueChoice = Choice[UnionCodeableConceptOrQuantityOrRange]
    def apply(
        id: Option[String] = None,
        name: Option[String] = None,
        value: Option[Category.ValueChoice] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Category = new Category(
      id,
      name,
      value,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Category): Option[(Option[String], Option[String], Option[Category.ValueChoice], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.name, o.value, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val name: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("name", lTagOf[Option[String]], false, lTagOf[String])
    val value: FHIRComponentFieldMeta[Option[Category.ValueChoice]] =
      FHIRComponentFieldMeta("value", lTagOf[Option[Category.ValueChoice]], true, lTagOf[UnionCodeableConceptOrQuantityOrRange])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, name, value, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Category): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[String]](name, t.name),
      FHIRComponentField[Option[Category.ValueChoice]](value, t.value),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Category] = this
    val thisName: String                 = "Category"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Category] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Category(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[String]]("name", Some(None)),
            cursor.decodeOptRef[UnionCodeableConceptOrQuantityOrRange]("value"),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Category(
      override val id: Option[String] = None,
      val name: Option[String] = None,
      val value: Option[Category.ValueChoice] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      url: Option[UriStr] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      name: Option[String] = None,
      date: Option[FHIRDateTime] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      title: Option[String] = None,
      status: PUBLICATION_STATUS,
      author: LitSeq[ContactDetail] = LitSeq.empty,
      editor: LitSeq[ContactDetail] = LitSeq.empty,
      actual: Option[Boolean] = None,
      version: Option[String] = None,
      contact: LitSeq[ContactDetail] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      subtitle: Option[String] = None,
      reviewer: LitSeq[ContactDetail] = LitSeq.empty,
      endorser: LitSeq[ContactDetail] = LitSeq.empty,
      handling: Option[Code] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      publisher: Option[String] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      shortTitle: Option[String] = None,
      useContext: LitSeq[UsageContext] = LitSeq.empty,
      description: Option[Markdown] = None,
      implicitRules: Option[UriStr] = None,
      relatedArtifact: LitSeq[RelatedArtifact] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      characteristicCombination: Option[Code] = None,
      category: LitSeq[EvidenceVariable.Category] = LitSeq.empty,
      characteristic: LitSeq[EvidenceVariable.Characteristic] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): EvidenceVariable = new EvidenceVariable(
    id,
    url,
    meta,
    text,
    name,
    date,
    note,
    title,
    status,
    author,
    editor,
    actual,
    version,
    contact,
    language,
    subtitle,
    reviewer,
    endorser,
    handling,
    contained,
    extension,
    publisher,
    identifier,
    shortTitle,
    useContext,
    description,
    implicitRules,
    relatedArtifact,
    modifierExtension,
    characteristicCombination,
    category,
    characteristic,
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
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val title: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("title", lTagOf[Option[String]], false, lTagOf[String])
  val status: FHIRComponentFieldMeta[PUBLICATION_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[PUBLICATION_STATUS], false, lTagOf[PUBLICATION_STATUS])
  val author: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("author", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val editor: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("editor", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val actual: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("actual", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val version: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("version", lTagOf[Option[String]], false, lTagOf[String])
  val contact: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("contact", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val subtitle: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("subtitle", lTagOf[Option[String]], false, lTagOf[String])
  val reviewer: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("reviewer", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val endorser: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("endorser", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val handling: FHIRComponentFieldMeta[Option[Code]] =
    FHIRComponentFieldMeta("handling", lTagOf[Option[Code]], false, lTagOf[Code])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val publisher: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("publisher", lTagOf[Option[String]], false, lTagOf[String])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val shortTitle: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("shortTitle", lTagOf[Option[String]], false, lTagOf[String])
  val useContext: FHIRComponentFieldMeta[LitSeq[UsageContext]] =
    FHIRComponentFieldMeta("useContext", lTagOf[LitSeq[UsageContext]], false, lTagOf[UsageContext])
  val description: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("description", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val relatedArtifact: FHIRComponentFieldMeta[LitSeq[RelatedArtifact]] =
    FHIRComponentFieldMeta("relatedArtifact", lTagOf[LitSeq[RelatedArtifact]], false, lTagOf[RelatedArtifact])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val characteristicCombination: FHIRComponentFieldMeta[Option[Code]] =
    FHIRComponentFieldMeta("characteristicCombination", lTagOf[Option[Code]], false, lTagOf[Code])
  val category: FHIRComponentFieldMeta[LitSeq[EvidenceVariable.Category]] =
    FHIRComponentFieldMeta("category", lTagOf[LitSeq[EvidenceVariable.Category]], false, lTagOf[EvidenceVariable.Category])
  val characteristic: FHIRComponentFieldMeta[LitSeq[EvidenceVariable.Characteristic]] =
    FHIRComponentFieldMeta(
      "characteristic",
      lTagOf[LitSeq[EvidenceVariable.Characteristic]],
      false,
      lTagOf[EvidenceVariable.Characteristic])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    url,
    meta,
    text,
    name,
    date,
    note,
    title,
    status,
    author,
    editor,
    actual,
    version,
    contact,
    language,
    subtitle,
    reviewer,
    endorser,
    handling,
    contained,
    extension,
    publisher,
    identifier,
    shortTitle,
    useContext,
    description,
    implicitRules,
    relatedArtifact,
    modifierExtension,
    characteristicCombination,
    category,
    characteristic
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: EvidenceVariable): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[UriStr]](url, t.url),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[String]](name, t.name),
    FHIRComponentField[Option[FHIRDateTime]](date, t.date),
    FHIRComponentField[LitSeq[Annotation]](note, t.note),
    FHIRComponentField[Option[String]](title, t.title),
    FHIRComponentField[PUBLICATION_STATUS](status, t.status),
    FHIRComponentField[LitSeq[ContactDetail]](author, t.author),
    FHIRComponentField[LitSeq[ContactDetail]](editor, t.editor),
    FHIRComponentField[Option[Boolean]](actual, t.actual),
    FHIRComponentField[Option[String]](version, t.version),
    FHIRComponentField[LitSeq[ContactDetail]](contact, t.contact),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Option[String]](subtitle, t.subtitle),
    FHIRComponentField[LitSeq[ContactDetail]](reviewer, t.reviewer),
    FHIRComponentField[LitSeq[ContactDetail]](endorser, t.endorser),
    FHIRComponentField[Option[Code]](handling, t.handling),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[String]](publisher, t.publisher),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[String]](shortTitle, t.shortTitle),
    FHIRComponentField[LitSeq[UsageContext]](useContext, t.useContext),
    FHIRComponentField[Option[Markdown]](description, t.description),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[RelatedArtifact]](relatedArtifact, t.relatedArtifact),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Option[Code]](characteristicCombination, t.characteristicCombination),
    FHIRComponentField[LitSeq[EvidenceVariable.Category]](category, t.category),
    FHIRComponentField[LitSeq[EvidenceVariable.Characteristic]](characteristic, t.characteristic)
  )
  def extractId(t: EvidenceVariable): Option[String]                                      = t.id
  def extractUrl(t: EvidenceVariable): Option[UriStr]                                     = t.url
  def extractMeta(t: EvidenceVariable): Option[Meta]                                      = t.meta
  def extractText(t: EvidenceVariable): Option[Narrative]                                 = t.text
  def extractName(t: EvidenceVariable): Option[String]                                    = t.name
  def extractDate(t: EvidenceVariable): Option[FHIRDateTime]                              = t.date
  def extractNote(t: EvidenceVariable): LitSeq[Annotation]                                = t.note
  def extractTitle(t: EvidenceVariable): Option[String]                                   = t.title
  def extractStatus(t: EvidenceVariable): PUBLICATION_STATUS                              = t.status
  def extractAuthor(t: EvidenceVariable): LitSeq[ContactDetail]                           = t.author
  def extractEditor(t: EvidenceVariable): LitSeq[ContactDetail]                           = t.editor
  def extractActual(t: EvidenceVariable): Option[Boolean]                                 = t.actual
  def extractVersion(t: EvidenceVariable): Option[String]                                 = t.version
  def extractContact(t: EvidenceVariable): LitSeq[ContactDetail]                          = t.contact
  def extractLanguage(t: EvidenceVariable): Option[LANGUAGES]                             = t.language
  def extractSubtitle(t: EvidenceVariable): Option[String]                                = t.subtitle
  def extractReviewer(t: EvidenceVariable): LitSeq[ContactDetail]                         = t.reviewer
  def extractEndorser(t: EvidenceVariable): LitSeq[ContactDetail]                         = t.endorser
  def extractHandling(t: EvidenceVariable): Option[Code]                                  = t.handling
  def extractContained(t: EvidenceVariable): LitSeq[Resource]                             = t.contained
  def extractExtension(t: EvidenceVariable): LitSeq[Extension]                            = t.extension
  def extractPublisher(t: EvidenceVariable): Option[String]                               = t.publisher
  def extractIdentifier(t: EvidenceVariable): LitSeq[Identifier]                          = t.identifier
  def extractShortTitle(t: EvidenceVariable): Option[String]                              = t.shortTitle
  def extractUseContext(t: EvidenceVariable): LitSeq[UsageContext]                        = t.useContext
  def extractDescription(t: EvidenceVariable): Option[Markdown]                           = t.description
  def extractImplicitRules(t: EvidenceVariable): Option[UriStr]                           = t.implicitRules
  def extractRelatedArtifact(t: EvidenceVariable): LitSeq[RelatedArtifact]                = t.relatedArtifact
  def extractModifierExtension(t: EvidenceVariable): LitSeq[Extension]                    = t.modifierExtension
  def extractCharacteristicCombination(t: EvidenceVariable): Option[Code]                 = t.characteristicCombination
  def extractCategory(t: EvidenceVariable): LitSeq[EvidenceVariable.Category]             = t.category
  def extractCharacteristic(t: EvidenceVariable): LitSeq[EvidenceVariable.Characteristic] = t.characteristic
  override val thisName: String                                                           = "EvidenceVariable"
  override val searchParams: Map[String, EvidenceVariable => Seq[Any]] = Map(
    "name"                  -> (obj => obj.name.toSeq),
    "context-type-quantity" -> (obj => obj.useContext.toSeq),
    "context"               -> (obj => obj.useContext.map(_.value).flatMap(_.as[CodeableConcept]).toSeq),
    "depends-on"            -> (obj => obj.relatedArtifact.filter(_.`type`.name == "depends-on").flatMap(_.resource).toSeq),
    "date"                  -> (obj => obj.date.toSeq),
    "identifier"            -> (obj => obj.identifier.toSeq),
    "url"                   -> (obj => obj.url.toSeq),
    "description"           -> (obj => obj.description.toSeq),
    "successor"             -> (obj => obj.relatedArtifact.filter(_.`type`.name == "successor").flatMap(_.resource).toSeq),
    "context-type-value"    -> (obj => obj.useContext.toSeq),
    "version"               -> (obj => obj.version.toSeq),
    "composed-of"           -> (obj => obj.relatedArtifact.filter(_.`type`.name == "composed-of").flatMap(_.resource).toSeq),
    "status"                -> (obj => Seq(obj.status)),
    "publisher"             -> (obj => obj.publisher.toSeq),
    "title"                 -> (obj => obj.title.toSeq),
    "context-quantity" -> (obj =>
      obj.useContext.map(_.value).flatMap(_.as[Quantity]).toSeq ++
        obj.useContext.map(_.value).flatMap(_.as[Range]).toSeq),
    "predecessor"  -> (obj => obj.relatedArtifact.filter(_.`type`.name == "predecessor").flatMap(_.resource).toSeq),
    "context-type" -> (obj => obj.useContext.map(_.code).toSeq),
    "derived-from" -> (obj => obj.relatedArtifact.filter(_.`type`.name == "derived-from").flatMap(_.resource).toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[EvidenceVariable] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new EvidenceVariable(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[UriStr]]("url", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[String]]("name", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("date", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("title", Some(None)),
          cursor.decodeAs[PUBLICATION_STATUS]("status", None),
          cursor.decodeAs[LitSeq[ContactDetail]]("author", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[ContactDetail]]("editor", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Boolean]]("actual", Some(None)),
          cursor.decodeAs[Option[String]]("version", Some(None)),
          cursor.decodeAs[LitSeq[ContactDetail]]("contact", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[String]]("subtitle", Some(None)),
          cursor.decodeAs[LitSeq[ContactDetail]]("reviewer", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[ContactDetail]]("endorser", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Code]]("handling", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("publisher", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("shortTitle", Some(None)),
          cursor.decodeAs[LitSeq[UsageContext]]("useContext", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Markdown]]("description", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[RelatedArtifact]]("relatedArtifact", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Code]]("characteristicCombination", Some(None)),
          cursor.decodeAs[LitSeq[EvidenceVariable.Category]]("category", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[EvidenceVariable.Characteristic]]("characteristic", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** The EvidenceVariable resource describes an element that knowledge (Evidence) is about.
  *
  * Subclass of [[hl7.model.MetadataResource]] (Common Ancestor declaration for conformance and knowledge artifact resources.)
  *
  * @constructor
  *   Introduces the fields note, actual, subtitle, handling, shortTitle, characteristicCombination, category, characteristic.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param url
  *   - An absolute URI that is used to identify this evidence variable when it is referenced in a specification, model, design or
  *   an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which
  *   at which an authoritative instance of this evidence variable is (or will be) published. This URL can be the target of a
  *   canonical reference. It SHALL remain the same when the evidence variable is stored on different servers.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *   not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *   resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to
  *   make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be
  *   represented in the narrative to ensure clinical safety.
  * @param name
  *   - A natural language name identifying the evidence variable. This name should be usable as an identifier for the module by
  *   machine processing applications such as code generation.
  * @param date
  *   - The date (and optionally time) when the evidence variable was published. The date must change when the business version
  *   changes and it must change if the status code changes. In addition, it should change when the substantive content of the
  *   evidence variable changes.
  * @param note
  *   - A human-readable string to clarify or explain concepts about the resource.
  * @param title
  *   - A short, descriptive, user-friendly title for the evidence variable.
  * @param status
  *   - The status of this evidence variable. Enables tracking the life-cycle of the content.
  * @param author
  *   - An individiual or organization primarily involved in the creation and maintenance of the content.
  * @param editor
  *   - An individual or organization primarily responsible for internal coherence of the content.
  * @param actual
  *   - True if the actual variable measured, false if a conceptual representation of the intended variable.
  * @param version
  *   - The identifier that is used to identify this version of the evidence variable when it is referenced in a specification,
  *   model, design or instance. This is an arbitrary value managed by the evidence variable author and is not expected to be
  *   globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also
  *   no expectation that versions can be placed in a lexicographical sequence. To provide a version consistent with the Decision
  *   Support Service specification, use the format Major.Minor.Revision (e.g. 1.0.0). For more information on versioning
  *   knowledge assets, refer to the Decision Support Service specification. Note that a version is required for non-experimental
  *   active artifacts.
  * @param contact
  *   - Contact details to assist a user in finding and communicating with the publisher.
  * @param language
  *   - The base language in which the resource is written.
  * @param subtitle
  *   - An explanatory or alternate title for the EvidenceVariable giving additional information about its content.
  * @param reviewer
  *   - An individual or organization primarily responsible for review of some aspect of the content.
  * @param endorser
  *   - An individual or organization responsible for officially endorsing the content for use in some setting.
  * @param handling
  *   - Used for an outcome to classify.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param publisher
  *   - The name of the organization or individual that published the evidence variable.
  * @param identifier
  *   - A formal identifier that is used to identify this evidence variable when it is represented in other formats, or referenced
  *   in a specification, model, design or an instance.
  * @param shortTitle
  *   - The short title provides an alternate title for use in informal descriptive contexts where the full, formal title is not
  *   necessary.
  * @param useContext
  *   - The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be
  *   general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be
  *   used to assist with indexing and searching for appropriate evidence variable instances.
  * @param description
  *   - A free text natural language description of the evidence variable from a consumer's perspective.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param relatedArtifact
  *   - Related artifacts such as additional documentation, justification, or bibliographic references.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *   the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually
  *   modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict
  *   set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param characteristicCombination
  *   - Used to specify if two or more characteristics are combined with OR or AND.
  * @param category
  *   - A grouping (or set of values) described along with other groupings to specify the set of groupings allowed for the
  *   variable.
  * @param characteristic
  *   - A characteristic that defines the members of the evidence element. Multiple characteristics are applied with "and"
  *   semantics.
  */
@POJOBoilerplate
class EvidenceVariable(
    override val id: Option[String] = None,
    override val url: Option[UriStr] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    override val name: Option[String] = None,
    override val date: Option[FHIRDateTime] = None,
    val note: LitSeq[Annotation] = LitSeq.empty,
    override val title: Option[String] = None,
    override val status: PUBLICATION_STATUS,
    override val author: LitSeq[ContactDetail] = LitSeq.empty,
    override val editor: LitSeq[ContactDetail] = LitSeq.empty,
    val actual: Option[Boolean] = None,
    override val version: Option[String] = None,
    override val contact: LitSeq[ContactDetail] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    val subtitle: Option[String] = None,
    override val reviewer: LitSeq[ContactDetail] = LitSeq.empty,
    override val endorser: LitSeq[ContactDetail] = LitSeq.empty,
    val handling: Option[Code] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val publisher: Option[String] = None,
    override val identifier: LitSeq[Identifier] = LitSeq.empty,
    val shortTitle: Option[String] = None,
    override val useContext: LitSeq[UsageContext] = LitSeq.empty,
    override val description: Option[Markdown] = None,
    override val implicitRules: Option[UriStr] = None,
    override val relatedArtifact: LitSeq[RelatedArtifact] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val characteristicCombination: Option[Code] = None,
    val category: LitSeq[EvidenceVariable.Category] = LitSeq.empty,
    val characteristic: LitSeq[EvidenceVariable.Characteristic] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends MetadataResource(
      id = id,
      url = url,
      meta = meta,
      text = text,
      name = name,
      date = date,
      title = title,
      status = status,
      author = author,
      editor = editor,
      version = version,
      contact = contact,
      language = language,
      reviewer = reviewer,
      endorser = endorser,
      contained = contained,
      publisher = publisher,
      extension = extension,
      identifier = identifier,
      useContext = useContext,
      description = description,
      implicitRules = implicitRules,
      relatedArtifact = relatedArtifact,
      modifierExtension = modifierExtension,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "EvidenceVariable"
}
