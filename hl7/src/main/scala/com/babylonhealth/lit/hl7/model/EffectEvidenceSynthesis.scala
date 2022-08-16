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
import com.babylonhealth.lit.hl7.{ PUBLICATION_STATUS, EXPOSURE_STATE }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object EffectEvidenceSynthesis extends CompanionFor[EffectEvidenceSynthesis] {
  implicit def summonObjectAndCompanionEffectEvidenceSynthesis2063117783(
      o: EffectEvidenceSynthesis): ObjectAndCompanion[EffectEvidenceSynthesis, EffectEvidenceSynthesis.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = EffectEvidenceSynthesis
  override type ParentType   = EffectEvidenceSynthesis
  override val baseType: CompanionFor[ResourceType] = EffectEvidenceSynthesis
  override val parentType: CompanionFor[ParentType] = EffectEvidenceSynthesis
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/EffectEvidenceSynthesis")
  object EffectEstimate extends CompanionFor[EffectEstimate] {
    implicit def summonObjectAndCompanionEffectEstimate_270642536(
        o: EffectEstimate): ObjectAndCompanion[EffectEstimate, EffectEstimate.type] = ObjectAndCompanion(o, this)
    override type ResourceType = EffectEstimate
    override type ParentType   = EffectEstimate
    override val parentType: CompanionFor[ResourceType] = EffectEstimate
    object PrecisionEstimate extends CompanionFor[PrecisionEstimate] {
      implicit def summonObjectAndCompanionPrecisionEstimate1423115582(
          o: PrecisionEstimate): ObjectAndCompanion[PrecisionEstimate, PrecisionEstimate.type] = ObjectAndCompanion(o, this)
      override type ResourceType = PrecisionEstimate
      override type ParentType   = PrecisionEstimate
      override val parentType: CompanionFor[ResourceType] = PrecisionEstimate
      def apply(
          id: Option[String] = None,
          to: Option[BigDecimal] = None,
          `type`: Option[CodeableConcept] = None,
          from: Option[BigDecimal] = None,
          level: Option[BigDecimal] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): PrecisionEstimate = new PrecisionEstimate(
        id,
        to,
        `type`,
        from,
        level,
        extension,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: PrecisionEstimate): Option[(Option[String], Option[BigDecimal], Option[CodeableConcept], Option[BigDecimal], Option[BigDecimal], LitSeq[Extension], LitSeq[Extension])] =
        Some((o.id, o.to, o.`type`, o.from, o.level, o.extension, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val to: FHIRComponentFieldMeta[Option[BigDecimal]] =
        FHIRComponentFieldMeta("to", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
      val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val from: FHIRComponentFieldMeta[Option[BigDecimal]] =
        FHIRComponentFieldMeta("from", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
      val level: FHIRComponentFieldMeta[Option[BigDecimal]] =
        FHIRComponentFieldMeta("level", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, to, `type`, from, level, extension, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: PrecisionEstimate): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[BigDecimal]](to, t.to),
        FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
        FHIRComponentField[Option[BigDecimal]](from, t.from),
        FHIRComponentField[Option[BigDecimal]](level, t.level),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[PrecisionEstimate] = this
      val thisName: String                          = "PrecisionEstimate"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[PrecisionEstimate] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new PrecisionEstimate(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[BigDecimal]]("to", Some(None)),
              cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
              cursor.decodeAs[Option[BigDecimal]]("from", Some(None)),
              cursor.decodeAs[Option[BigDecimal]]("level", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class PrecisionEstimate(
        override val id: Option[String] = None,
        val to: Option[BigDecimal] = None,
        val `type`: Option[CodeableConcept] = None,
        val from: Option[BigDecimal] = None,
        val level: Option[BigDecimal] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        `type`: Option[CodeableConcept] = None,
        value: Option[BigDecimal] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        description: Option[String] = None,
        variantState: Option[CodeableConcept] = None,
        unitOfMeasure: Option[CodeableConcept] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        precisionEstimate: LitSeq[EffectEstimate.PrecisionEstimate] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): EffectEstimate = new EffectEstimate(
      id,
      `type`,
      value,
      extension,
      description,
      variantState,
      unitOfMeasure,
      modifierExtension,
      precisionEstimate,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: EffectEstimate): Option[(Option[String], Option[CodeableConcept], Option[BigDecimal], LitSeq[Extension], Option[String], Option[CodeableConcept], Option[CodeableConcept], LitSeq[Extension], LitSeq[EffectEstimate.PrecisionEstimate])] =
      Some(
        (
          o.id,
          o.`type`,
          o.value,
          o.extension,
          o.description,
          o.variantState,
          o.unitOfMeasure,
          o.modifierExtension,
          o.precisionEstimate))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val value: FHIRComponentFieldMeta[Option[BigDecimal]] =
      FHIRComponentFieldMeta("value", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val description: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
    val variantState: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("variantState", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val unitOfMeasure: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("unitOfMeasure", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val precisionEstimate: FHIRComponentFieldMeta[LitSeq[EffectEstimate.PrecisionEstimate]] =
      FHIRComponentFieldMeta(
        "precisionEstimate",
        lTagOf[LitSeq[EffectEstimate.PrecisionEstimate]],
        false,
        lTagOf[EffectEstimate.PrecisionEstimate])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, `type`, value, extension, description, variantState, unitOfMeasure, modifierExtension, precisionEstimate)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: EffectEstimate): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[Option[BigDecimal]](value, t.value),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[String]](description, t.description),
      FHIRComponentField[Option[CodeableConcept]](variantState, t.variantState),
      FHIRComponentField[Option[CodeableConcept]](unitOfMeasure, t.unitOfMeasure),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[EffectEstimate.PrecisionEstimate]](precisionEstimate, t.precisionEstimate)
    )
    val baseType: CompanionFor[EffectEstimate] = this
    val thisName: String                       = "EffectEstimate"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[EffectEstimate] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new EffectEstimate(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
            cursor.decodeAs[Option[BigDecimal]]("value", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("description", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("variantState", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("unitOfMeasure", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[EffectEstimate.PrecisionEstimate]]("precisionEstimate", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class EffectEstimate(
      override val id: Option[String] = None,
      val `type`: Option[CodeableConcept] = None,
      val value: Option[BigDecimal] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val description: Option[String] = None,
      val variantState: Option[CodeableConcept] = None,
      val unitOfMeasure: Option[CodeableConcept] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val precisionEstimate: LitSeq[EffectEstimate.PrecisionEstimate] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Certainty extends CompanionFor[Certainty] {
    implicit def summonObjectAndCompanionCertainty_270642536(o: Certainty): ObjectAndCompanion[Certainty, Certainty.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Certainty
    override type ParentType   = Certainty
    override val parentType: CompanionFor[ResourceType] = Certainty
    object CertaintySubcomponent extends CompanionFor[CertaintySubcomponent] {
      implicit def summonObjectAndCompanionCertaintySubcomponent_1083154854(
          o: CertaintySubcomponent): ObjectAndCompanion[CertaintySubcomponent, CertaintySubcomponent.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = CertaintySubcomponent
      override type ParentType   = CertaintySubcomponent
      override val parentType: CompanionFor[ResourceType] = CertaintySubcomponent
      def apply(
          id: Option[String] = None,
          `type`: Option[CodeableConcept] = None,
          note: LitSeq[Annotation] = LitSeq.empty,
          rating: LitSeq[CodeableConcept] = LitSeq.empty,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): CertaintySubcomponent = new CertaintySubcomponent(
        id,
        `type`,
        note,
        rating,
        extension,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: CertaintySubcomponent): Option[(Option[String], Option[CodeableConcept], LitSeq[Annotation], LitSeq[CodeableConcept], LitSeq[Extension], LitSeq[Extension])] =
        Some((o.id, o.`type`, o.note, o.rating, o.extension, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
        FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
      val rating: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
        FHIRComponentFieldMeta("rating", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, `type`, note, rating, extension, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: CertaintySubcomponent): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
        FHIRComponentField[LitSeq[Annotation]](note, t.note),
        FHIRComponentField[LitSeq[CodeableConcept]](rating, t.rating),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[CertaintySubcomponent] = this
      val thisName: String                              = "CertaintySubcomponent"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[CertaintySubcomponent] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new CertaintySubcomponent(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
              cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[CodeableConcept]]("rating", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class CertaintySubcomponent(
        override val id: Option[String] = None,
        val `type`: Option[CodeableConcept] = None,
        val note: LitSeq[Annotation] = LitSeq.empty,
        val rating: LitSeq[CodeableConcept] = LitSeq.empty,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        note: LitSeq[Annotation] = LitSeq.empty,
        rating: LitSeq[CodeableConcept] = LitSeq.empty,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        certaintySubcomponent: LitSeq[Certainty.CertaintySubcomponent] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Certainty = new Certainty(
      id,
      note,
      rating,
      extension,
      modifierExtension,
      certaintySubcomponent,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Certainty): Option[(Option[String], LitSeq[Annotation], LitSeq[CodeableConcept], LitSeq[Extension], LitSeq[Extension], LitSeq[Certainty.CertaintySubcomponent])] =
      Some((o.id, o.note, o.rating, o.extension, o.modifierExtension, o.certaintySubcomponent))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
      FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
    val rating: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("rating", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val certaintySubcomponent: FHIRComponentFieldMeta[LitSeq[Certainty.CertaintySubcomponent]] =
      FHIRComponentFieldMeta(
        "certaintySubcomponent",
        lTagOf[LitSeq[Certainty.CertaintySubcomponent]],
        false,
        lTagOf[Certainty.CertaintySubcomponent])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, note, rating, extension, modifierExtension, certaintySubcomponent)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Certainty): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Annotation]](note, t.note),
      FHIRComponentField[LitSeq[CodeableConcept]](rating, t.rating),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[Certainty.CertaintySubcomponent]](certaintySubcomponent, t.certaintySubcomponent)
    )
    val baseType: CompanionFor[Certainty] = this
    val thisName: String                  = "Certainty"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Certainty] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Certainty(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("rating", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Certainty.CertaintySubcomponent]]("certaintySubcomponent", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Certainty(
      override val id: Option[String] = None,
      val note: LitSeq[Annotation] = LitSeq.empty,
      val rating: LitSeq[CodeableConcept] = LitSeq.empty,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val certaintySubcomponent: LitSeq[Certainty.CertaintySubcomponent] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object ResultsByExposure extends CompanionFor[ResultsByExposure] {
    implicit def summonObjectAndCompanionResultsByExposure_270642536(
        o: ResultsByExposure): ObjectAndCompanion[ResultsByExposure, ResultsByExposure.type] = ObjectAndCompanion(o, this)
    override type ResourceType = ResultsByExposure
    override type ParentType   = ResultsByExposure
    override val parentType: CompanionFor[ResourceType] = ResultsByExposure
    def apply(
        id: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        description: Option[String] = None,
        variantState: Option[CodeableConcept] = None,
        exposureState: Option[EXPOSURE_STATE] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        riskEvidenceSynthesis: Reference,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): ResultsByExposure = new ResultsByExposure(
      id,
      extension,
      description,
      variantState,
      exposureState,
      modifierExtension,
      riskEvidenceSynthesis,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: ResultsByExposure): Option[(Option[String], LitSeq[Extension], Option[String], Option[CodeableConcept], Option[EXPOSURE_STATE], LitSeq[Extension], Reference)] =
      Some((o.id, o.extension, o.description, o.variantState, o.exposureState, o.modifierExtension, o.riskEvidenceSynthesis))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val description: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
    val variantState: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("variantState", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val exposureState: FHIRComponentFieldMeta[Option[EXPOSURE_STATE]] =
      FHIRComponentFieldMeta("exposureState", lTagOf[Option[EXPOSURE_STATE]], false, lTagOf[EXPOSURE_STATE])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val riskEvidenceSynthesis: FHIRComponentFieldMeta[Reference] =
      FHIRComponentFieldMeta("riskEvidenceSynthesis", lTagOf[Reference], false, lTagOf[Reference])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, extension, description, variantState, exposureState, modifierExtension, riskEvidenceSynthesis)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: ResultsByExposure): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[String]](description, t.description),
      FHIRComponentField[Option[CodeableConcept]](variantState, t.variantState),
      FHIRComponentField[Option[EXPOSURE_STATE]](exposureState, t.exposureState),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Reference](riskEvidenceSynthesis, t.riskEvidenceSynthesis)
    )
    val baseType: CompanionFor[ResultsByExposure] = this
    val thisName: String                          = "ResultsByExposure"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ResultsByExposure] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new ResultsByExposure(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("description", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("variantState", Some(None)),
            cursor.decodeAs[Option[EXPOSURE_STATE]]("exposureState", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[Reference]("riskEvidenceSynthesis", None),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class ResultsByExposure(
      override val id: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val description: Option[String] = None,
      val variantState: Option[CodeableConcept] = None,
      val exposureState: Option[EXPOSURE_STATE] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val riskEvidenceSynthesis: Reference,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object SampleSize extends CompanionFor[SampleSize] {
    implicit def summonObjectAndCompanionSampleSize_270642536(o: SampleSize): ObjectAndCompanion[SampleSize, SampleSize.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = SampleSize
    override type ParentType   = SampleSize
    override val parentType: CompanionFor[ResourceType] = SampleSize
    def apply(
        id: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        description: Option[String] = None,
        numberOfStudies: Option[Int] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        numberOfParticipants: Option[Int] = None,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): SampleSize = new SampleSize(
      id,
      extension,
      description,
      numberOfStudies,
      modifierExtension,
      numberOfParticipants,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: SampleSize): Option[(Option[String], LitSeq[Extension], Option[String], Option[Int], LitSeq[Extension], Option[Int])] =
      Some((o.id, o.extension, o.description, o.numberOfStudies, o.modifierExtension, o.numberOfParticipants))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val description: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
    val numberOfStudies: FHIRComponentFieldMeta[Option[Int]] =
      FHIRComponentFieldMeta("numberOfStudies", lTagOf[Option[Int]], false, lTagOf[Int])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val numberOfParticipants: FHIRComponentFieldMeta[Option[Int]] =
      FHIRComponentFieldMeta("numberOfParticipants", lTagOf[Option[Int]], false, lTagOf[Int])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, extension, description, numberOfStudies, modifierExtension, numberOfParticipants)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: SampleSize): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[String]](description, t.description),
      FHIRComponentField[Option[Int]](numberOfStudies, t.numberOfStudies),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[Int]](numberOfParticipants, t.numberOfParticipants)
    )
    val baseType: CompanionFor[SampleSize] = this
    val thisName: String                   = "SampleSize"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[SampleSize] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new SampleSize(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("description", Some(None)),
            cursor.decodeAs[Option[Int]]("numberOfStudies", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Int]]("numberOfParticipants", Some(None)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class SampleSize(
      override val id: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val description: Option[String] = None,
      val numberOfStudies: Option[Int] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val numberOfParticipants: Option[Int] = None,
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
      topic: LitSeq[CodeableConcept] = LitSeq.empty,
      status: PUBLICATION_STATUS,
      author: LitSeq[ContactDetail] = LitSeq.empty,
      editor: LitSeq[ContactDetail] = LitSeq.empty,
      version: Option[String] = None,
      contact: LitSeq[ContactDetail] = LitSeq.empty,
      outcome: Reference,
      language: Option[LANGUAGES] = None,
      reviewer: LitSeq[ContactDetail] = LitSeq.empty,
      endorser: LitSeq[ContactDetail] = LitSeq.empty,
      exposure: Reference,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      publisher: Option[String] = None,
      copyright: Option[Markdown] = None,
      studyType: Option[CodeableConcept] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      useContext: LitSeq[UsageContext] = LitSeq.empty,
      population: Reference,
      description: Option[Markdown] = None,
      jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
      approvalDate: Option[FHIRDate] = None,
      implicitRules: Option[UriStr] = None,
      synthesisType: Option[CodeableConcept] = None,
      lastReviewDate: Option[FHIRDate] = None,
      effectivePeriod: Option[Period] = None,
      relatedArtifact: LitSeq[RelatedArtifact] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      exposureAlternative: Reference,
      sampleSize: Option[EffectEvidenceSynthesis.SampleSize] = None,
      resultsByExposure: LitSeq[EffectEvidenceSynthesis.ResultsByExposure] = LitSeq.empty,
      certainty: LitSeq[EffectEvidenceSynthesis.Certainty] = LitSeq.empty,
      effectEstimate: LitSeq[EffectEvidenceSynthesis.EffectEstimate] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): EffectEvidenceSynthesis = new EffectEvidenceSynthesis(
    id,
    url,
    meta,
    text,
    name,
    date,
    note,
    title,
    topic,
    status,
    author,
    editor,
    version,
    contact,
    outcome,
    language,
    reviewer,
    endorser,
    exposure,
    contained,
    extension,
    publisher,
    copyright,
    studyType,
    identifier,
    useContext,
    population,
    description,
    jurisdiction,
    approvalDate,
    implicitRules,
    synthesisType,
    lastReviewDate,
    effectivePeriod,
    relatedArtifact,
    modifierExtension,
    exposureAlternative,
    sampleSize,
    resultsByExposure,
    certainty,
    effectEstimate,
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
  val topic: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("topic", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val status: FHIRComponentFieldMeta[PUBLICATION_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[PUBLICATION_STATUS], false, lTagOf[PUBLICATION_STATUS])
  val author: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("author", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val editor: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("editor", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val version: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("version", lTagOf[Option[String]], false, lTagOf[String])
  val contact: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("contact", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val outcome: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("outcome", lTagOf[Reference], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val reviewer: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("reviewer", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val endorser: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("endorser", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val exposure: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("exposure", lTagOf[Reference], false, lTagOf[Reference])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val publisher: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("publisher", lTagOf[Option[String]], false, lTagOf[String])
  val copyright: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("copyright", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val studyType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("studyType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val useContext: FHIRComponentFieldMeta[LitSeq[UsageContext]] =
    FHIRComponentFieldMeta("useContext", lTagOf[LitSeq[UsageContext]], false, lTagOf[UsageContext])
  val population: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("population", lTagOf[Reference], false, lTagOf[Reference])
  val description: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("description", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val jurisdiction: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("jurisdiction", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val approvalDate: FHIRComponentFieldMeta[Option[FHIRDate]] =
    FHIRComponentFieldMeta("approvalDate", lTagOf[Option[FHIRDate]], false, lTagOf[FHIRDate])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val synthesisType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("synthesisType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val lastReviewDate: FHIRComponentFieldMeta[Option[FHIRDate]] =
    FHIRComponentFieldMeta("lastReviewDate", lTagOf[Option[FHIRDate]], false, lTagOf[FHIRDate])
  val effectivePeriod: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("effectivePeriod", lTagOf[Option[Period]], false, lTagOf[Period])
  val relatedArtifact: FHIRComponentFieldMeta[LitSeq[RelatedArtifact]] =
    FHIRComponentFieldMeta("relatedArtifact", lTagOf[LitSeq[RelatedArtifact]], false, lTagOf[RelatedArtifact])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val exposureAlternative: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("exposureAlternative", lTagOf[Reference], false, lTagOf[Reference])
  val sampleSize: FHIRComponentFieldMeta[Option[EffectEvidenceSynthesis.SampleSize]] =
    FHIRComponentFieldMeta(
      "sampleSize",
      lTagOf[Option[EffectEvidenceSynthesis.SampleSize]],
      false,
      lTagOf[EffectEvidenceSynthesis.SampleSize])
  val resultsByExposure: FHIRComponentFieldMeta[LitSeq[EffectEvidenceSynthesis.ResultsByExposure]] =
    FHIRComponentFieldMeta(
      "resultsByExposure",
      lTagOf[LitSeq[EffectEvidenceSynthesis.ResultsByExposure]],
      false,
      lTagOf[EffectEvidenceSynthesis.ResultsByExposure])
  val certainty: FHIRComponentFieldMeta[LitSeq[EffectEvidenceSynthesis.Certainty]] =
    FHIRComponentFieldMeta(
      "certainty",
      lTagOf[LitSeq[EffectEvidenceSynthesis.Certainty]],
      false,
      lTagOf[EffectEvidenceSynthesis.Certainty])
  val effectEstimate: FHIRComponentFieldMeta[LitSeq[EffectEvidenceSynthesis.EffectEstimate]] =
    FHIRComponentFieldMeta(
      "effectEstimate",
      lTagOf[LitSeq[EffectEvidenceSynthesis.EffectEstimate]],
      false,
      lTagOf[EffectEvidenceSynthesis.EffectEstimate])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    url,
    meta,
    text,
    name,
    date,
    note,
    title,
    topic,
    status,
    author,
    editor,
    version,
    contact,
    outcome,
    language,
    reviewer,
    endorser,
    exposure,
    contained,
    extension,
    publisher,
    copyright,
    studyType,
    identifier,
    useContext,
    population,
    description,
    jurisdiction,
    approvalDate,
    implicitRules,
    synthesisType,
    lastReviewDate,
    effectivePeriod,
    relatedArtifact,
    modifierExtension,
    exposureAlternative,
    sampleSize,
    resultsByExposure,
    certainty,
    effectEstimate
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: EffectEvidenceSynthesis): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[UriStr]](url, t.url),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[String]](name, t.name),
    FHIRComponentField[Option[FHIRDateTime]](date, t.date),
    FHIRComponentField[LitSeq[Annotation]](note, t.note),
    FHIRComponentField[Option[String]](title, t.title),
    FHIRComponentField[LitSeq[CodeableConcept]](topic, t.topic),
    FHIRComponentField[PUBLICATION_STATUS](status, t.status),
    FHIRComponentField[LitSeq[ContactDetail]](author, t.author),
    FHIRComponentField[LitSeq[ContactDetail]](editor, t.editor),
    FHIRComponentField[Option[String]](version, t.version),
    FHIRComponentField[LitSeq[ContactDetail]](contact, t.contact),
    FHIRComponentField[Reference](outcome, t.outcome),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[ContactDetail]](reviewer, t.reviewer),
    FHIRComponentField[LitSeq[ContactDetail]](endorser, t.endorser),
    FHIRComponentField[Reference](exposure, t.exposure),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[String]](publisher, t.publisher),
    FHIRComponentField[Option[Markdown]](copyright, t.copyright),
    FHIRComponentField[Option[CodeableConcept]](studyType, t.studyType),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[LitSeq[UsageContext]](useContext, t.useContext),
    FHIRComponentField[Reference](population, t.population),
    FHIRComponentField[Option[Markdown]](description, t.description),
    FHIRComponentField[LitSeq[CodeableConcept]](jurisdiction, t.jurisdiction),
    FHIRComponentField[Option[FHIRDate]](approvalDate, t.approvalDate),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[CodeableConcept]](synthesisType, t.synthesisType),
    FHIRComponentField[Option[FHIRDate]](lastReviewDate, t.lastReviewDate),
    FHIRComponentField[Option[Period]](effectivePeriod, t.effectivePeriod),
    FHIRComponentField[LitSeq[RelatedArtifact]](relatedArtifact, t.relatedArtifact),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Reference](exposureAlternative, t.exposureAlternative),
    FHIRComponentField[Option[EffectEvidenceSynthesis.SampleSize]](sampleSize, t.sampleSize),
    FHIRComponentField[LitSeq[EffectEvidenceSynthesis.ResultsByExposure]](resultsByExposure, t.resultsByExposure),
    FHIRComponentField[LitSeq[EffectEvidenceSynthesis.Certainty]](certainty, t.certainty),
    FHIRComponentField[LitSeq[EffectEvidenceSynthesis.EffectEstimate]](effectEstimate, t.effectEstimate)
  )
  def extractId(t: EffectEvidenceSynthesis): Option[String]                                     = t.id
  def extractUrl(t: EffectEvidenceSynthesis): Option[UriStr]                                    = t.url
  def extractMeta(t: EffectEvidenceSynthesis): Option[Meta]                                     = t.meta
  def extractText(t: EffectEvidenceSynthesis): Option[Narrative]                                = t.text
  def extractName(t: EffectEvidenceSynthesis): Option[String]                                   = t.name
  def extractDate(t: EffectEvidenceSynthesis): Option[FHIRDateTime]                             = t.date
  def extractNote(t: EffectEvidenceSynthesis): LitSeq[Annotation]                               = t.note
  def extractTitle(t: EffectEvidenceSynthesis): Option[String]                                  = t.title
  def extractTopic(t: EffectEvidenceSynthesis): LitSeq[CodeableConcept]                         = t.topic
  def extractStatus(t: EffectEvidenceSynthesis): PUBLICATION_STATUS                             = t.status
  def extractAuthor(t: EffectEvidenceSynthesis): LitSeq[ContactDetail]                          = t.author
  def extractEditor(t: EffectEvidenceSynthesis): LitSeq[ContactDetail]                          = t.editor
  def extractVersion(t: EffectEvidenceSynthesis): Option[String]                                = t.version
  def extractContact(t: EffectEvidenceSynthesis): LitSeq[ContactDetail]                         = t.contact
  def extractOutcome(t: EffectEvidenceSynthesis): Reference                                     = t.outcome
  def extractLanguage(t: EffectEvidenceSynthesis): Option[LANGUAGES]                            = t.language
  def extractReviewer(t: EffectEvidenceSynthesis): LitSeq[ContactDetail]                        = t.reviewer
  def extractEndorser(t: EffectEvidenceSynthesis): LitSeq[ContactDetail]                        = t.endorser
  def extractExposure(t: EffectEvidenceSynthesis): Reference                                    = t.exposure
  def extractContained(t: EffectEvidenceSynthesis): LitSeq[Resource]                            = t.contained
  def extractExtension(t: EffectEvidenceSynthesis): LitSeq[Extension]                           = t.extension
  def extractPublisher(t: EffectEvidenceSynthesis): Option[String]                              = t.publisher
  def extractCopyright(t: EffectEvidenceSynthesis): Option[Markdown]                            = t.copyright
  def extractStudyType(t: EffectEvidenceSynthesis): Option[CodeableConcept]                     = t.studyType
  def extractIdentifier(t: EffectEvidenceSynthesis): LitSeq[Identifier]                         = t.identifier
  def extractUseContext(t: EffectEvidenceSynthesis): LitSeq[UsageContext]                       = t.useContext
  def extractPopulation(t: EffectEvidenceSynthesis): Reference                                  = t.population
  def extractDescription(t: EffectEvidenceSynthesis): Option[Markdown]                          = t.description
  def extractJurisdiction(t: EffectEvidenceSynthesis): LitSeq[CodeableConcept]                  = t.jurisdiction
  def extractApprovalDate(t: EffectEvidenceSynthesis): Option[FHIRDate]                         = t.approvalDate
  def extractImplicitRules(t: EffectEvidenceSynthesis): Option[UriStr]                          = t.implicitRules
  def extractSynthesisType(t: EffectEvidenceSynthesis): Option[CodeableConcept]                 = t.synthesisType
  def extractLastReviewDate(t: EffectEvidenceSynthesis): Option[FHIRDate]                       = t.lastReviewDate
  def extractEffectivePeriod(t: EffectEvidenceSynthesis): Option[Period]                        = t.effectivePeriod
  def extractRelatedArtifact(t: EffectEvidenceSynthesis): LitSeq[RelatedArtifact]               = t.relatedArtifact
  def extractModifierExtension(t: EffectEvidenceSynthesis): LitSeq[Extension]                   = t.modifierExtension
  def extractExposureAlternative(t: EffectEvidenceSynthesis): Reference                         = t.exposureAlternative
  def extractSampleSize(t: EffectEvidenceSynthesis): Option[EffectEvidenceSynthesis.SampleSize] = t.sampleSize
  def extractResultsByExposure(t: EffectEvidenceSynthesis): LitSeq[EffectEvidenceSynthesis.ResultsByExposure] =
    t.resultsByExposure
  def extractCertainty(t: EffectEvidenceSynthesis): LitSeq[EffectEvidenceSynthesis.Certainty]           = t.certainty
  def extractEffectEstimate(t: EffectEvidenceSynthesis): LitSeq[EffectEvidenceSynthesis.EffectEstimate] = t.effectEstimate
  override val thisName: String = "EffectEvidenceSynthesis"
  override val searchParams: Map[String, EffectEvidenceSynthesis => Seq[Any]] = Map(
    "jurisdiction"          -> (obj => obj.jurisdiction.toSeq),
    "name"                  -> (obj => obj.name.toSeq),
    "context-type-quantity" -> (obj => obj.useContext.toSeq),
    "description"           -> (obj => obj.description.toSeq),
    "context"               -> (obj => obj.useContext.map(_.value).flatMap(_.as[CodeableConcept]).toSeq),
    "effective"             -> (obj => obj.effectivePeriod.toSeq),
    "date"                  -> (obj => obj.date.toSeq),
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
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[EffectEvidenceSynthesis] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new EffectEvidenceSynthesis(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[UriStr]]("url", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[String]]("name", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("date", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("title", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("topic", Some(LitSeq.empty)),
          cursor.decodeAs[PUBLICATION_STATUS]("status", None),
          cursor.decodeAs[LitSeq[ContactDetail]]("author", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[ContactDetail]]("editor", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("version", Some(None)),
          cursor.decodeAs[LitSeq[ContactDetail]]("contact", Some(LitSeq.empty)),
          cursor.decodeAs[Reference]("outcome", None),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[ContactDetail]]("reviewer", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[ContactDetail]]("endorser", Some(LitSeq.empty)),
          cursor.decodeAs[Reference]("exposure", None),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("publisher", Some(None)),
          cursor.decodeAs[Option[Markdown]]("copyright", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("studyType", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[UsageContext]]("useContext", Some(LitSeq.empty)),
          cursor.decodeAs[Reference]("population", None),
          cursor.decodeAs[Option[Markdown]]("description", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("jurisdiction", Some(LitSeq.empty)),
          cursor.decodeAs[Option[FHIRDate]]("approvalDate", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("synthesisType", Some(None)),
          cursor.decodeAs[Option[FHIRDate]]("lastReviewDate", Some(None)),
          cursor.decodeAs[Option[Period]]("effectivePeriod", Some(None)),
          cursor.decodeAs[LitSeq[RelatedArtifact]]("relatedArtifact", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Reference]("exposureAlternative", None),
          cursor.decodeAs[Option[EffectEvidenceSynthesis.SampleSize]]("sampleSize", Some(None)),
          cursor.decodeAs[LitSeq[EffectEvidenceSynthesis.ResultsByExposure]]("resultsByExposure", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[EffectEvidenceSynthesis.Certainty]]("certainty", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[EffectEvidenceSynthesis.EffectEstimate]]("effectEstimate", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** The EffectEvidenceSynthesis resource describes the difference in an outcome between exposures states in a population where the
  * effect estimate is derived from a combination of research studies.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields url, name, date, note, title, topic, status, author, editor, version, contact, outcome, reviewer,
  *   endorser, exposure, publisher, copyright, studyType, identifier, useContext, population, description, jurisdiction,
  *   approvalDate, synthesisType, lastReviewDate, effectivePeriod, relatedArtifact, exposureAlternative, sampleSize,
  *   resultsByExposure, certainty, effectEstimate.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param url
  *   - An absolute URI that is used to identify this effect evidence synthesis when it is referenced in a specification, model,
  *     design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal
  *     address at which at which an authoritative instance of this effect evidence synthesis is (or will be) published. This URL
  *     can be the target of a canonical reference. It SHALL remain the same when the effect evidence synthesis is stored on
  *     different servers.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *     not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *     resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail
  *     to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should
  *     be represented in the narrative to ensure clinical safety.
  * @param name
  *   - A natural language name identifying the effect evidence synthesis. This name should be usable as an identifier for the
  *     module by machine processing applications such as code generation.
  * @param date
  *   - The date (and optionally time) when the effect evidence synthesis was published. The date must change when the business
  *     version changes and it must change if the status code changes. In addition, it should change when the substantive content
  *     of the effect evidence synthesis changes.
  * @param note
  *   - A human-readable string to clarify or explain concepts about the resource.
  * @param title
  *   - A short, descriptive, user-friendly title for the effect evidence synthesis.
  * @param topic
  *   - Descriptive topics related to the content of the EffectEvidenceSynthesis. Topics provide a high-level categorization
  *     grouping types of EffectEvidenceSynthesiss that can be useful for filtering and searching.
  * @param status
  *   - The status of this effect evidence synthesis. Enables tracking the life-cycle of the content.
  * @param author
  *   - An individiual or organization primarily involved in the creation and maintenance of the content.
  * @param editor
  *   - An individual or organization primarily responsible for internal coherence of the content.
  * @param version
  *   - The identifier that is used to identify this version of the effect evidence synthesis when it is referenced in a
  *     specification, model, design or instance. This is an arbitrary value managed by the effect evidence synthesis author and
  *     is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not
  *     available. There is also no expectation that versions can be placed in a lexicographical sequence.
  * @param contact
  *   - Contact details to assist a user in finding and communicating with the publisher.
  * @param outcome
  *   - A reference to a EvidenceVariable resomece that defines the outcome for the research.
  * @param language
  *   - The base language in which the resource is written.
  * @param reviewer
  *   - An individual or organization primarily responsible for review of some aspect of the content.
  * @param endorser
  *   - An individual or organization responsible for officially endorsing the content for use in some setting.
  * @param exposure
  *   - A reference to a EvidenceVariable resource that defines the exposure for the research.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *     identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *     of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *     Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *     of the extension.
  * @param publisher
  *   - The name of the organization or individual that published the effect evidence synthesis.
  * @param copyright
  *   - A copyright statement relating to the effect evidence synthesis and/or its contents. Copyright statements are generally
  *     legal restrictions on the use and publishing of the effect evidence synthesis.
  * @param studyType
  *   - Type of study eg randomized trial.
  * @param identifier
  *   - A formal identifier that is used to identify this effect evidence synthesis when it is represented in other formats, or
  *     referenced in a specification, model, design or an instance.
  * @param useContext
  *   - The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be
  *     general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be
  *     used to assist with indexing and searching for appropriate effect evidence synthesis instances.
  * @param population
  *   - A reference to a EvidenceVariable resource that defines the population for the research.
  * @param description
  *   - A free text natural language description of the effect evidence synthesis from a consumer's perspective.
  * @param jurisdiction
  *   - A legal or geographic region in which the effect evidence synthesis is intended to be used.
  * @param approvalDate
  *   - The date on which the resource content was approved by the publisher. Approval happens once when the content is officially
  *     approved for usage.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *     processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *     other profiles etc.
  * @param synthesisType
  *   - Type of synthesis eg meta-analysis.
  * @param lastReviewDate
  *   - The date on which the resource content was last reviewed. Review happens periodically after approval but does not change
  *     the original approval date.
  * @param effectivePeriod
  *   - The period during which the effect evidence synthesis content was or is planned to be in active use.
  * @param relatedArtifact
  *   - Related artifacts such as additional documentation, justification, or bibliographic references.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *     the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *     Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *     strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *     extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *     processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of
  *     any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param exposureAlternative
  *   - A reference to a EvidenceVariable resource that defines the comparison exposure for the research.
  * @param sampleSize
  *   - A description of the size of the sample involved in the synthesis.
  * @param resultsByExposure
  *   - A description of the results for each exposure considered in the effect estimate.
  * @param certainty
  *   - A description of the certainty of the effect estimate.
  * @param effectEstimate
  *   - The estimated effect of the exposure variant.
  */
@POJOBoilerplate
class EffectEvidenceSynthesis(
    override val id: Option[String] = None,
    val url: Option[UriStr] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val name: Option[String] = None,
    val date: Option[FHIRDateTime] = None,
    val note: LitSeq[Annotation] = LitSeq.empty,
    val title: Option[String] = None,
    val topic: LitSeq[CodeableConcept] = LitSeq.empty,
    val status: PUBLICATION_STATUS,
    val author: LitSeq[ContactDetail] = LitSeq.empty,
    val editor: LitSeq[ContactDetail] = LitSeq.empty,
    val version: Option[String] = None,
    val contact: LitSeq[ContactDetail] = LitSeq.empty,
    val outcome: Reference,
    override val language: Option[LANGUAGES] = None,
    val reviewer: LitSeq[ContactDetail] = LitSeq.empty,
    val endorser: LitSeq[ContactDetail] = LitSeq.empty,
    val exposure: Reference,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val publisher: Option[String] = None,
    val copyright: Option[Markdown] = None,
    val studyType: Option[CodeableConcept] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val useContext: LitSeq[UsageContext] = LitSeq.empty,
    val population: Reference,
    val description: Option[Markdown] = None,
    val jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
    val approvalDate: Option[FHIRDate] = None,
    override val implicitRules: Option[UriStr] = None,
    val synthesisType: Option[CodeableConcept] = None,
    val lastReviewDate: Option[FHIRDate] = None,
    val effectivePeriod: Option[Period] = None,
    val relatedArtifact: LitSeq[RelatedArtifact] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val exposureAlternative: Reference,
    val sampleSize: Option[EffectEvidenceSynthesis.SampleSize] = None,
    val resultsByExposure: LitSeq[EffectEvidenceSynthesis.ResultsByExposure] = LitSeq.empty,
    val certainty: LitSeq[EffectEvidenceSynthesis.Certainty] = LitSeq.empty,
    val effectEstimate: LitSeq[EffectEvidenceSynthesis.EffectEstimate] = LitSeq.empty,
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
      primitiveAttributes = primitiveAttributes
    ) {
  override val thisTypeName: String = "EffectEvidenceSynthesis"
}
