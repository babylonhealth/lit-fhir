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

import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Statistic extends CompanionFor[Statistic] {
  implicit def summonObjectAndCompanionStatistic_120447749(o: Statistic): ObjectAndCompanion[Statistic, Statistic.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Statistic
  override type ParentType   = Statistic
  override val baseType: CompanionFor[ResourceType] = Statistic
  override val parentType: CompanionFor[ParentType] = Statistic
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Statistic")
  object ModelCharacteristic extends CompanionFor[ModelCharacteristic] {
    implicit def summonObjectAndCompanionModelCharacteristic_154586528(
        o: ModelCharacteristic): ObjectAndCompanion[ModelCharacteristic, ModelCharacteristic.type] = ObjectAndCompanion(o, this)
    override type ResourceType = ModelCharacteristic
    override type ParentType   = ModelCharacteristic
    override val parentType: CompanionFor[ResourceType] = ModelCharacteristic
    object Variable extends CompanionFor[Variable] {
      implicit def summonObjectAndCompanionVariable_1316076744(o: Variable): ObjectAndCompanion[Variable, Variable.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Variable
      override type ParentType   = Variable
      override val parentType: CompanionFor[ResourceType] = Variable
      def apply(
          id: Option[String] = None,
          handling: Option[Code] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          valueRange: LitSeq[Range] = LitSeq.empty,
          valueCategory: LitSeq[CodeableConcept] = LitSeq.empty,
          valueQuantity: LitSeq[Quantity] = LitSeq.empty,
          variableDefinition: Reference,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Variable = new Variable(
        id,
        handling,
        extension,
        valueRange,
        valueCategory,
        valueQuantity,
        variableDefinition,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Variable): Option[(Option[String], Option[Code], LitSeq[Extension], LitSeq[Range], LitSeq[CodeableConcept], LitSeq[Quantity], Reference)] =
        Some((o.id, o.handling, o.extension, o.valueRange, o.valueCategory, o.valueQuantity, o.variableDefinition))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val handling: FHIRComponentFieldMeta[Option[Code]] =
        FHIRComponentFieldMeta("handling", lTagOf[Option[Code]], false, lTagOf[Code])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val valueRange: FHIRComponentFieldMeta[LitSeq[Range]] =
        FHIRComponentFieldMeta("valueRange", lTagOf[LitSeq[Range]], false, lTagOf[Range])
      val valueCategory: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
        FHIRComponentFieldMeta("valueCategory", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
      val valueQuantity: FHIRComponentFieldMeta[LitSeq[Quantity]] =
        FHIRComponentFieldMeta("valueQuantity", lTagOf[LitSeq[Quantity]], false, lTagOf[Quantity])
      val variableDefinition: FHIRComponentFieldMeta[Reference] =
        FHIRComponentFieldMeta("variableDefinition", lTagOf[Reference], false, lTagOf[Reference])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
        Seq(id, handling, extension, valueRange, valueCategory, valueQuantity, variableDefinition)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Variable): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[Code]](handling, t.handling),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Range]](valueRange, t.valueRange),
        FHIRComponentField[LitSeq[CodeableConcept]](valueCategory, t.valueCategory),
        FHIRComponentField[LitSeq[Quantity]](valueQuantity, t.valueQuantity),
        FHIRComponentField[Reference](variableDefinition, t.variableDefinition)
      )
      val baseType: CompanionFor[Variable] = this
      val thisName: String                 = "Variable"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Variable] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Variable(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[Code]]("handling", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Range]]("valueRange", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[CodeableConcept]]("valueCategory", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Quantity]]("valueQuantity", Some(LitSeq.empty)),
              cursor.decodeAs[Reference]("variableDefinition", None),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Variable(
        override val id: Option[String] = None,
        val handling: Option[Code] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val valueRange: LitSeq[Range] = LitSeq.empty,
        val valueCategory: LitSeq[CodeableConcept] = LitSeq.empty,
        val valueQuantity: LitSeq[Quantity] = LitSeq.empty,
        val variableDefinition: Reference,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends Element(id = id, extension = extension)
    def apply(
        id: Option[String] = None,
        code: CodeableConcept,
        value: Option[Quantity] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        variable: LitSeq[ModelCharacteristic.Variable] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): ModelCharacteristic = new ModelCharacteristic(
      id,
      code,
      value,
      extension,
      variable,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: ModelCharacteristic): Option[(Option[String], CodeableConcept, Option[Quantity], LitSeq[Extension], LitSeq[ModelCharacteristic.Variable])] =
      Some((o.id, o.code, o.value, o.extension, o.variable))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val code: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("code", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val value: FHIRComponentFieldMeta[Option[Quantity]] =
      FHIRComponentFieldMeta("value", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val variable: FHIRComponentFieldMeta[LitSeq[ModelCharacteristic.Variable]] =
      FHIRComponentFieldMeta(
        "variable",
        lTagOf[LitSeq[ModelCharacteristic.Variable]],
        false,
        lTagOf[ModelCharacteristic.Variable])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, code, value, extension, variable)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: ModelCharacteristic): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[CodeableConcept](code, t.code),
      FHIRComponentField[Option[Quantity]](value, t.value),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[ModelCharacteristic.Variable]](variable, t.variable)
    )
    val baseType: CompanionFor[ModelCharacteristic] = this
    val thisName: String                            = "ModelCharacteristic"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ModelCharacteristic] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new ModelCharacteristic(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[CodeableConcept]("code", None),
            cursor.decodeAs[Option[Quantity]]("value", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[ModelCharacteristic.Variable]]("variable", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class ModelCharacteristic(
      override val id: Option[String] = None,
      val code: CodeableConcept,
      val value: Option[Quantity] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val variable: LitSeq[ModelCharacteristic.Variable] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends Element(id = id, extension = extension)
  object AttributeEstimate extends CompanionFor[AttributeEstimate] {
    implicit def summonObjectAndCompanionAttributeEstimate_154586528(
        o: AttributeEstimate): ObjectAndCompanion[AttributeEstimate, AttributeEstimate.type] = ObjectAndCompanion(o, this)
    override type ResourceType = AttributeEstimate
    override type ParentType   = AttributeEstimate
    override val parentType: CompanionFor[ResourceType] = AttributeEstimate
    object AttributeEstimate extends CompanionFor[AttributeEstimate] {
      implicit def summonObjectAndCompanionAttributeEstimate426035384(
          o: AttributeEstimate): ObjectAndCompanion[AttributeEstimate, AttributeEstimate.type] = ObjectAndCompanion(o, this)
      override type ResourceType = AttributeEstimate
      override type ParentType   = AttributeEstimate
      override val parentType: CompanionFor[ResourceType] = AttributeEstimate
      def apply(
          id: Option[String] = None,
          note: LitSeq[Annotation] = LitSeq.empty,
          `type`: Option[CodeableConcept] = None,
          level: Option[BigDecimal] = None,
          range: Option[Range] = None,
          quantity: Option[Quantity] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          description: Option[String] = None,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): AttributeEstimate = new AttributeEstimate(
        id,
        note,
        `type`,
        level,
        range,
        quantity,
        extension,
        description,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: AttributeEstimate): Option[(Option[String], LitSeq[Annotation], Option[CodeableConcept], Option[BigDecimal], Option[Range], Option[Quantity], LitSeq[Extension], Option[String])] =
        Some((o.id, o.note, o.`type`, o.level, o.range, o.quantity, o.extension, o.description))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
        FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
      val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val level: FHIRComponentFieldMeta[Option[BigDecimal]] =
        FHIRComponentFieldMeta("level", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
      val range: FHIRComponentFieldMeta[Option[Range]] =
        FHIRComponentFieldMeta("range", lTagOf[Option[Range]], false, lTagOf[Range])
      val quantity: FHIRComponentFieldMeta[Option[Quantity]] =
        FHIRComponentFieldMeta("quantity", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val description: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, note, `type`, level, range, quantity, extension, description)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: AttributeEstimate): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[LitSeq[Annotation]](note, t.note),
        FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
        FHIRComponentField[Option[BigDecimal]](level, t.level),
        FHIRComponentField[Option[Range]](range, t.range),
        FHIRComponentField[Option[Quantity]](quantity, t.quantity),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[String]](description, t.description)
      )
      val baseType: CompanionFor[AttributeEstimate] = this
      val thisName: String                          = "AttributeEstimate"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[AttributeEstimate] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new AttributeEstimate(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
              cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
              cursor.decodeAs[Option[BigDecimal]]("level", Some(None)),
              cursor.decodeAs[Option[Range]]("range", Some(None)),
              cursor.decodeAs[Option[Quantity]]("quantity", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[String]]("description", Some(None)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class AttributeEstimate(
        override val id: Option[String] = None,
        val note: LitSeq[Annotation] = LitSeq.empty,
        val `type`: Option[CodeableConcept] = None,
        val level: Option[BigDecimal] = None,
        val range: Option[Range] = None,
        val quantity: Option[Quantity] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val description: Option[String] = None,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends Element(id = id, extension = extension)
    def apply(
        id: Option[String] = None,
        note: LitSeq[Annotation] = LitSeq.empty,
        `type`: Option[CodeableConcept] = None,
        level: Option[BigDecimal] = None,
        range: Option[Range] = None,
        quantity: Option[Quantity] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        description: Option[String] = None,
        attributeEstimate: LitSeq[AttributeEstimate.AttributeEstimate] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): AttributeEstimate = new AttributeEstimate(
      id,
      note,
      `type`,
      level,
      range,
      quantity,
      extension,
      description,
      attributeEstimate,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: AttributeEstimate): Option[(Option[String], LitSeq[Annotation], Option[CodeableConcept], Option[BigDecimal], Option[Range], Option[Quantity], LitSeq[Extension], Option[String], LitSeq[AttributeEstimate.AttributeEstimate])] =
      Some((o.id, o.note, o.`type`, o.level, o.range, o.quantity, o.extension, o.description, o.attributeEstimate))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
      FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
    val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val level: FHIRComponentFieldMeta[Option[BigDecimal]] =
      FHIRComponentFieldMeta("level", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
    val range: FHIRComponentFieldMeta[Option[Range]] =
      FHIRComponentFieldMeta("range", lTagOf[Option[Range]], false, lTagOf[Range])
    val quantity: FHIRComponentFieldMeta[Option[Quantity]] =
      FHIRComponentFieldMeta("quantity", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val description: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
    val attributeEstimate: FHIRComponentFieldMeta[LitSeq[AttributeEstimate.AttributeEstimate]] =
      FHIRComponentFieldMeta(
        "attributeEstimate",
        lTagOf[LitSeq[AttributeEstimate.AttributeEstimate]],
        false,
        lTagOf[AttributeEstimate.AttributeEstimate])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, note, `type`, level, range, quantity, extension, description, attributeEstimate)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: AttributeEstimate): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Annotation]](note, t.note),
      FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[Option[BigDecimal]](level, t.level),
      FHIRComponentField[Option[Range]](range, t.range),
      FHIRComponentField[Option[Quantity]](quantity, t.quantity),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[String]](description, t.description),
      FHIRComponentField[LitSeq[AttributeEstimate.AttributeEstimate]](attributeEstimate, t.attributeEstimate)
    )
    val baseType: CompanionFor[AttributeEstimate] = this
    val thisName: String                          = "AttributeEstimate"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[AttributeEstimate] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new AttributeEstimate(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
            cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
            cursor.decodeAs[Option[BigDecimal]]("level", Some(None)),
            cursor.decodeAs[Option[Range]]("range", Some(None)),
            cursor.decodeAs[Option[Quantity]]("quantity", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("description", Some(None)),
            cursor.decodeAs[LitSeq[AttributeEstimate.AttributeEstimate]]("attributeEstimate", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class AttributeEstimate(
      override val id: Option[String] = None,
      val note: LitSeq[Annotation] = LitSeq.empty,
      val `type`: Option[CodeableConcept] = None,
      val level: Option[BigDecimal] = None,
      val range: Option[Range] = None,
      val quantity: Option[Quantity] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val description: Option[String] = None,
      val attributeEstimate: LitSeq[AttributeEstimate.AttributeEstimate] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends Element(id = id, extension = extension)
  object SampleSize extends CompanionFor[SampleSize] {
    implicit def summonObjectAndCompanionSampleSize_154586528(o: SampleSize): ObjectAndCompanion[SampleSize, SampleSize.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = SampleSize
    override type ParentType   = SampleSize
    override val parentType: CompanionFor[ResourceType] = SampleSize
    def apply(
        id: Option[String] = None,
        note: LitSeq[Annotation] = LitSeq.empty,
        extension: LitSeq[Extension] = LitSeq.empty,
        description: Option[String] = None,
        knownDataCount: Option[UnsignedInt] = None,
        numberOfStudies: Option[UnsignedInt] = None,
        numberOfParticipants: Option[UnsignedInt] = None,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): SampleSize = new SampleSize(
      id,
      note,
      extension,
      description,
      knownDataCount,
      numberOfStudies,
      numberOfParticipants,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: SampleSize): Option[(Option[String], LitSeq[Annotation], LitSeq[Extension], Option[String], Option[UnsignedInt], Option[UnsignedInt], Option[UnsignedInt])] =
      Some((o.id, o.note, o.extension, o.description, o.knownDataCount, o.numberOfStudies, o.numberOfParticipants))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
      FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val description: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
    val knownDataCount: FHIRComponentFieldMeta[Option[UnsignedInt]] =
      FHIRComponentFieldMeta("knownDataCount", lTagOf[Option[UnsignedInt]], false, lTagOf[UnsignedInt])
    val numberOfStudies: FHIRComponentFieldMeta[Option[UnsignedInt]] =
      FHIRComponentFieldMeta("numberOfStudies", lTagOf[Option[UnsignedInt]], false, lTagOf[UnsignedInt])
    val numberOfParticipants: FHIRComponentFieldMeta[Option[UnsignedInt]] =
      FHIRComponentFieldMeta("numberOfParticipants", lTagOf[Option[UnsignedInt]], false, lTagOf[UnsignedInt])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, note, extension, description, knownDataCount, numberOfStudies, numberOfParticipants)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: SampleSize): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Annotation]](note, t.note),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[String]](description, t.description),
      FHIRComponentField[Option[UnsignedInt]](knownDataCount, t.knownDataCount),
      FHIRComponentField[Option[UnsignedInt]](numberOfStudies, t.numberOfStudies),
      FHIRComponentField[Option[UnsignedInt]](numberOfParticipants, t.numberOfParticipants)
    )
    val baseType: CompanionFor[SampleSize] = this
    val thisName: String                   = "SampleSize"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[SampleSize] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new SampleSize(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("description", Some(None)),
            cursor.decodeAs[Option[UnsignedInt]]("knownDataCount", Some(None)),
            cursor.decodeAs[Option[UnsignedInt]]("numberOfStudies", Some(None)),
            cursor.decodeAs[Option[UnsignedInt]]("numberOfParticipants", Some(None)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class SampleSize(
      override val id: Option[String] = None,
      val note: LitSeq[Annotation] = LitSeq.empty,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val description: Option[String] = None,
      val knownDataCount: Option[UnsignedInt] = None,
      val numberOfStudies: Option[UnsignedInt] = None,
      val numberOfParticipants: Option[UnsignedInt] = None,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends Element(id = id, extension = extension)
  def apply(
      id: Option[String] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      category: Option[CodeableConcept] = None,
      quantity: Option[Quantity] = None,
      extension: LitSeq[Extension] = LitSeq.empty,
      description: Option[String] = None,
      statisticType: Option[CodeableConcept] = None,
      numberOfEvents: Option[UnsignedInt] = None,
      numberAffected: Option[UnsignedInt] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      sampleSize: Option[Statistic.SampleSize] = None,
      attributeEstimate: LitSeq[Statistic.AttributeEstimate] = LitSeq.empty,
      modelCharacteristic: LitSeq[Statistic.ModelCharacteristic] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Statistic = new Statistic(
    id,
    note,
    category,
    quantity,
    extension,
    description,
    statisticType,
    numberOfEvents,
    numberAffected,
    modifierExtension,
    sampleSize,
    attributeEstimate,
    modelCharacteristic,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val category: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("category", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val quantity: FHIRComponentFieldMeta[Option[Quantity]] =
    FHIRComponentFieldMeta("quantity", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val description: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
  val statisticType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("statisticType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val numberOfEvents: FHIRComponentFieldMeta[Option[UnsignedInt]] =
    FHIRComponentFieldMeta("numberOfEvents", lTagOf[Option[UnsignedInt]], false, lTagOf[UnsignedInt])
  val numberAffected: FHIRComponentFieldMeta[Option[UnsignedInt]] =
    FHIRComponentFieldMeta("numberAffected", lTagOf[Option[UnsignedInt]], false, lTagOf[UnsignedInt])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val sampleSize: FHIRComponentFieldMeta[Option[Statistic.SampleSize]] =
    FHIRComponentFieldMeta("sampleSize", lTagOf[Option[Statistic.SampleSize]], false, lTagOf[Statistic.SampleSize])
  val attributeEstimate: FHIRComponentFieldMeta[LitSeq[Statistic.AttributeEstimate]] =
    FHIRComponentFieldMeta(
      "attributeEstimate",
      lTagOf[LitSeq[Statistic.AttributeEstimate]],
      false,
      lTagOf[Statistic.AttributeEstimate])
  val modelCharacteristic: FHIRComponentFieldMeta[LitSeq[Statistic.ModelCharacteristic]] =
    FHIRComponentFieldMeta(
      "modelCharacteristic",
      lTagOf[LitSeq[Statistic.ModelCharacteristic]],
      false,
      lTagOf[Statistic.ModelCharacteristic])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    note,
    category,
    quantity,
    extension,
    description,
    statisticType,
    numberOfEvents,
    numberAffected,
    modifierExtension,
    sampleSize,
    attributeEstimate,
    modelCharacteristic
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Statistic): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[LitSeq[Annotation]](note, t.note),
    FHIRComponentField[Option[CodeableConcept]](category, t.category),
    FHIRComponentField[Option[Quantity]](quantity, t.quantity),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[String]](description, t.description),
    FHIRComponentField[Option[CodeableConcept]](statisticType, t.statisticType),
    FHIRComponentField[Option[UnsignedInt]](numberOfEvents, t.numberOfEvents),
    FHIRComponentField[Option[UnsignedInt]](numberAffected, t.numberAffected),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Option[Statistic.SampleSize]](sampleSize, t.sampleSize),
    FHIRComponentField[LitSeq[Statistic.AttributeEstimate]](attributeEstimate, t.attributeEstimate),
    FHIRComponentField[LitSeq[Statistic.ModelCharacteristic]](modelCharacteristic, t.modelCharacteristic)
  )
  def extractId(t: Statistic): Option[String]                                         = t.id
  def extractNote(t: Statistic): LitSeq[Annotation]                                   = t.note
  def extractCategory(t: Statistic): Option[CodeableConcept]                          = t.category
  def extractQuantity(t: Statistic): Option[Quantity]                                 = t.quantity
  def extractExtension(t: Statistic): LitSeq[Extension]                               = t.extension
  def extractDescription(t: Statistic): Option[String]                                = t.description
  def extractStatisticType(t: Statistic): Option[CodeableConcept]                     = t.statisticType
  def extractNumberOfEvents(t: Statistic): Option[UnsignedInt]                        = t.numberOfEvents
  def extractNumberAffected(t: Statistic): Option[UnsignedInt]                        = t.numberAffected
  def extractModifierExtension(t: Statistic): LitSeq[Extension]                       = t.modifierExtension
  def extractSampleSize(t: Statistic): Option[Statistic.SampleSize]                   = t.sampleSize
  def extractAttributeEstimate(t: Statistic): LitSeq[Statistic.AttributeEstimate]     = t.attributeEstimate
  def extractModelCharacteristic(t: Statistic): LitSeq[Statistic.ModelCharacteristic] = t.modelCharacteristic
  override val thisName: String                                                       = "Statistic"
  def unapply(
      o: Statistic): Option[(Option[String], LitSeq[Annotation], Option[CodeableConcept], Option[Quantity], LitSeq[Extension], Option[String], Option[CodeableConcept], Option[UnsignedInt], Option[UnsignedInt], LitSeq[Extension], Option[Statistic.SampleSize], LitSeq[Statistic.AttributeEstimate], LitSeq[Statistic.ModelCharacteristic])] =
    Some(
      (
        o.id,
        o.note,
        o.category,
        o.quantity,
        o.extension,
        o.description,
        o.statisticType,
        o.numberOfEvents,
        o.numberAffected,
        o.modifierExtension,
        o.sampleSize,
        o.attributeEstimate,
        o.modelCharacteristic))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Statistic] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Statistic(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("category", Some(None)),
          cursor.decodeAs[Option[Quantity]]("quantity", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("description", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("statisticType", Some(None)),
          cursor.decodeAs[Option[UnsignedInt]]("numberOfEvents", Some(None)),
          cursor.decodeAs[Option[UnsignedInt]]("numberAffected", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Statistic.SampleSize]]("sampleSize", Some(None)),
          cursor.decodeAs[LitSeq[Statistic.AttributeEstimate]]("attributeEstimate", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Statistic.ModelCharacteristic]]("modelCharacteristic", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for Statistic Type: A fact or piece of data from a study of a large quantity of numerical data. A
  * mathematical or quantified characteristic of a group of observations.
  *
  * Subclass of [[core.model.BackboneType]] (Base StructureDefinition for BackboneType Type: Base definition for the few data
  * types that are allowed to carry modifier extensions.)
  *
  * @constructor
  *   Introduces the fields note, category, quantity, description, statisticType, numberOfEvents, numberAffected, sampleSize,
  *   attributeEstimate, modelCharacteristic.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *   spaces.
  * @param note
  *   - Footnotes and/or explanatory notes.
  * @param category
  *   - When the measured variable is handled categorically, the category element is used to define which category the statistic
  *   is reporting.
  * @param quantity
  *   - Statistic value.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the element. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param description
  *   - A description of the content value of the statistic.
  * @param statisticType
  *   - Type of statistic, eg relative risk.
  * @param numberOfEvents
  *   - The number of events associated with the statistic, where the unit of analysis is different from numberAffected,
  *   sampleSize.knownDataCount and sampleSize.numberOfParticipants.
  * @param numberAffected
  *   - The number of participants affected where the unit of analysis is the same as sampleSize.knownDataCount and
  *   sampleSize.numberOfParticipants.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the element and that modifies
  *   the understanding of the element in which it is contained and/or the understanding of the containing element's descendants.
  *   Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *   strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param sampleSize
  *   - Number of samples in the statistic.
  * @param attributeEstimate
  *   - A statistical attribute of the statistic such as a measure of heterogeneity.
  * @param modelCharacteristic
  *   - A component of the method to generate the statistic.
  */
@POJOBoilerplate
class Statistic(
    override val id: Option[String] = None,
    val note: LitSeq[Annotation] = LitSeq.empty,
    val category: Option[CodeableConcept] = None,
    val quantity: Option[Quantity] = None,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val description: Option[String] = None,
    val statisticType: Option[CodeableConcept] = None,
    val numberOfEvents: Option[UnsignedInt] = None,
    val numberAffected: Option[UnsignedInt] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val sampleSize: Option[Statistic.SampleSize] = None,
    val attributeEstimate: LitSeq[Statistic.AttributeEstimate] = LitSeq.empty,
    val modelCharacteristic: LitSeq[Statistic.ModelCharacteristic] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends BackboneType(
      id = id,
      extension = extension,
      modifierExtension = modifierExtension,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Statistic"
}
