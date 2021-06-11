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
import com.babylonhealth.lit.hl7.{ QUALITY_TYPE, SEQUENCE_TYPE, ORIENTATION_TYPE, STRAND_TYPE, REPOSITORY_TYPE }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object MolecularSequence extends CompanionFor[MolecularSequence] {
  implicit def summonObjectAndCompanionMolecularSequence1402502961(
      o: MolecularSequence): ObjectAndCompanion[MolecularSequence, MolecularSequence.type] = ObjectAndCompanion(o, this)
  override type ResourceType = MolecularSequence
  override type ParentType   = MolecularSequence
  override val baseType: CompanionFor[ResourceType] = MolecularSequence
  override val parentType: CompanionFor[ParentType] = MolecularSequence
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/MolecularSequence")
  object StructureVariant extends CompanionFor[StructureVariant] {
    implicit def summonObjectAndCompanionStructureVariant_407752872(
        o: StructureVariant): ObjectAndCompanion[StructureVariant, StructureVariant.type] = ObjectAndCompanion(o, this)
    override type ResourceType = StructureVariant
    override type ParentType   = StructureVariant
    override val parentType: CompanionFor[ResourceType] = StructureVariant
    object Outer extends CompanionFor[Outer] {
      implicit def summonObjectAndCompanionOuter_718518432(o: Outer): ObjectAndCompanion[Outer, Outer.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Outer
      override type ParentType   = Outer
      override val parentType: CompanionFor[ResourceType] = Outer
      def apply(
          id: Option[String] = None,
          end: Option[Int] = None,
          start: Option[Int] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Outer = new Outer(
        id,
        end,
        start,
        extension,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(o: Outer): Option[(Option[String], Option[Int], Option[Int], LitSeq[Extension], LitSeq[Extension])] =
        Some((o.id, o.end, o.start, o.extension, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val end: FHIRComponentFieldMeta[Option[Int]] =
        FHIRComponentFieldMeta("end", lTagOf[Option[Int]], false, lTagOf[Int])
      val start: FHIRComponentFieldMeta[Option[Int]] =
        FHIRComponentFieldMeta("start", lTagOf[Option[Int]], false, lTagOf[Int])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, end, start, extension, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Outer): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[Int]](end, t.end),
        FHIRComponentField[Option[Int]](start, t.start),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Outer] = this
      val thisName: String              = "Outer"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Outer] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Outer(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[Int]]("end", Some(None)),
              cursor.decodeAs[Option[Int]]("start", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Outer(
        override val id: Option[String] = None,
        val end: Option[Int] = None,
        val start: Option[Int] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object Inner extends CompanionFor[Inner] {
      implicit def summonObjectAndCompanionInner_650628805(o: Inner): ObjectAndCompanion[Inner, Inner.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Inner
      override type ParentType   = Inner
      override val parentType: CompanionFor[ResourceType] = Inner
      def apply(
          id: Option[String] = None,
          end: Option[Int] = None,
          start: Option[Int] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Inner = new Inner(
        id,
        end,
        start,
        extension,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(o: Inner): Option[(Option[String], Option[Int], Option[Int], LitSeq[Extension], LitSeq[Extension])] =
        Some((o.id, o.end, o.start, o.extension, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val end: FHIRComponentFieldMeta[Option[Int]] =
        FHIRComponentFieldMeta("end", lTagOf[Option[Int]], false, lTagOf[Int])
      val start: FHIRComponentFieldMeta[Option[Int]] =
        FHIRComponentFieldMeta("start", lTagOf[Option[Int]], false, lTagOf[Int])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, end, start, extension, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Inner): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[Int]](end, t.end),
        FHIRComponentField[Option[Int]](start, t.start),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Inner] = this
      val thisName: String              = "Inner"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Inner] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Inner(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[Int]]("end", Some(None)),
              cursor.decodeAs[Option[Int]]("start", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Inner(
        override val id: Option[String] = None,
        val end: Option[Int] = None,
        val start: Option[Int] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        exact: Option[Boolean] = None,
        length: Option[Int] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        variantType: Option[CodeableConcept] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        outer: Option[StructureVariant.Outer] = None,
        inner: Option[StructureVariant.Inner] = None,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): StructureVariant = new StructureVariant(
      id,
      exact,
      length,
      extension,
      variantType,
      modifierExtension,
      outer,
      inner,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: StructureVariant): Option[(Option[String], Option[Boolean], Option[Int], LitSeq[Extension], Option[CodeableConcept], LitSeq[Extension], Option[StructureVariant.Outer], Option[StructureVariant.Inner])] =
      Some((o.id, o.exact, o.length, o.extension, o.variantType, o.modifierExtension, o.outer, o.inner))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val exact: FHIRComponentFieldMeta[Option[Boolean]] =
      FHIRComponentFieldMeta("exact", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
    val length: FHIRComponentFieldMeta[Option[Int]] =
      FHIRComponentFieldMeta("length", lTagOf[Option[Int]], false, lTagOf[Int])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val variantType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("variantType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val outer: FHIRComponentFieldMeta[Option[StructureVariant.Outer]] =
      FHIRComponentFieldMeta("outer", lTagOf[Option[StructureVariant.Outer]], false, lTagOf[StructureVariant.Outer])
    val inner: FHIRComponentFieldMeta[Option[StructureVariant.Inner]] =
      FHIRComponentFieldMeta("inner", lTagOf[Option[StructureVariant.Inner]], false, lTagOf[StructureVariant.Inner])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, exact, length, extension, variantType, modifierExtension, outer, inner)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: StructureVariant): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Boolean]](exact, t.exact),
      FHIRComponentField[Option[Int]](length, t.length),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[CodeableConcept]](variantType, t.variantType),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[StructureVariant.Outer]](outer, t.outer),
      FHIRComponentField[Option[StructureVariant.Inner]](inner, t.inner)
    )
    val baseType: CompanionFor[StructureVariant] = this
    val thisName: String                         = "StructureVariant"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[StructureVariant] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new StructureVariant(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[Boolean]]("exact", Some(None)),
            cursor.decodeAs[Option[Int]]("length", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[CodeableConcept]]("variantType", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[StructureVariant.Outer]]("outer", Some(None)),
            cursor.decodeAs[Option[StructureVariant.Inner]]("inner", Some(None)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class StructureVariant(
      override val id: Option[String] = None,
      val exact: Option[Boolean] = None,
      val length: Option[Int] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val variantType: Option[CodeableConcept] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val outer: Option[StructureVariant.Outer] = None,
      val inner: Option[StructureVariant.Inner] = None,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object ReferenceSeq extends CompanionFor[ReferenceSeq] {
    implicit def summonObjectAndCompanionReferenceSeq_1318259111(
        o: ReferenceSeq): ObjectAndCompanion[ReferenceSeq, ReferenceSeq.type] = ObjectAndCompanion(o, this)
    override type ResourceType = ReferenceSeq
    override type ParentType   = ReferenceSeq
    override val parentType: CompanionFor[ResourceType] = ReferenceSeq
    def apply(
        id: Option[String] = None,
        strand: Option[STRAND_TYPE] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        windowEnd: Option[Int] = None,
        chromosome: Option[CodeableConcept] = None,
        genomeBuild: Option[String] = None,
        orientation: Option[ORIENTATION_TYPE] = None,
        windowStart: Option[Int] = None,
        referenceSeqId: Option[CodeableConcept] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        referenceSeqString: Option[String] = None,
        referenceSeqPointer: Option[Reference] = None,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): ReferenceSeq = new ReferenceSeq(
      id,
      strand,
      extension,
      windowEnd,
      chromosome,
      genomeBuild,
      orientation,
      windowStart,
      referenceSeqId,
      modifierExtension,
      referenceSeqString,
      referenceSeqPointer,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: ReferenceSeq): Option[(Option[String], Option[STRAND_TYPE], LitSeq[Extension], Option[Int], Option[CodeableConcept], Option[String], Option[ORIENTATION_TYPE], Option[Int], Option[CodeableConcept], LitSeq[Extension], Option[String], Option[Reference])] =
      Some(
        (
          o.id,
          o.strand,
          o.extension,
          o.windowEnd,
          o.chromosome,
          o.genomeBuild,
          o.orientation,
          o.windowStart,
          o.referenceSeqId,
          o.modifierExtension,
          o.referenceSeqString,
          o.referenceSeqPointer))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val strand: FHIRComponentFieldMeta[Option[STRAND_TYPE]] =
      FHIRComponentFieldMeta("strand", lTagOf[Option[STRAND_TYPE]], false, lTagOf[STRAND_TYPE])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val windowEnd: FHIRComponentFieldMeta[Option[Int]] =
      FHIRComponentFieldMeta("windowEnd", lTagOf[Option[Int]], false, lTagOf[Int])
    val chromosome: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("chromosome", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val genomeBuild: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("genomeBuild", lTagOf[Option[String]], false, lTagOf[String])
    val orientation: FHIRComponentFieldMeta[Option[ORIENTATION_TYPE]] =
      FHIRComponentFieldMeta("orientation", lTagOf[Option[ORIENTATION_TYPE]], false, lTagOf[ORIENTATION_TYPE])
    val windowStart: FHIRComponentFieldMeta[Option[Int]] =
      FHIRComponentFieldMeta("windowStart", lTagOf[Option[Int]], false, lTagOf[Int])
    val referenceSeqId: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("referenceSeqId", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val referenceSeqString: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("referenceSeqString", lTagOf[Option[String]], false, lTagOf[String])
    val referenceSeqPointer: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("referenceSeqPointer", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
      id,
      strand,
      extension,
      windowEnd,
      chromosome,
      genomeBuild,
      orientation,
      windowStart,
      referenceSeqId,
      modifierExtension,
      referenceSeqString,
      referenceSeqPointer)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: ReferenceSeq): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[STRAND_TYPE]](strand, t.strand),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Int]](windowEnd, t.windowEnd),
      FHIRComponentField[Option[CodeableConcept]](chromosome, t.chromosome),
      FHIRComponentField[Option[String]](genomeBuild, t.genomeBuild),
      FHIRComponentField[Option[ORIENTATION_TYPE]](orientation, t.orientation),
      FHIRComponentField[Option[Int]](windowStart, t.windowStart),
      FHIRComponentField[Option[CodeableConcept]](referenceSeqId, t.referenceSeqId),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[String]](referenceSeqString, t.referenceSeqString),
      FHIRComponentField[Option[Reference]](referenceSeqPointer, t.referenceSeqPointer)
    )
    val baseType: CompanionFor[ReferenceSeq] = this
    val thisName: String                     = "ReferenceSeq"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ReferenceSeq] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new ReferenceSeq(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[STRAND_TYPE]]("strand", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Int]]("windowEnd", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("chromosome", Some(None)),
            cursor.decodeAs[Option[String]]("genomeBuild", Some(None)),
            cursor.decodeAs[Option[ORIENTATION_TYPE]]("orientation", Some(None)),
            cursor.decodeAs[Option[Int]]("windowStart", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("referenceSeqId", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("referenceSeqString", Some(None)),
            cursor.decodeAs[Option[Reference]]("referenceSeqPointer", Some(None)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class ReferenceSeq(
      override val id: Option[String] = None,
      val strand: Option[STRAND_TYPE] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val windowEnd: Option[Int] = None,
      val chromosome: Option[CodeableConcept] = None,
      val genomeBuild: Option[String] = None,
      val orientation: Option[ORIENTATION_TYPE] = None,
      val windowStart: Option[Int] = None,
      val referenceSeqId: Option[CodeableConcept] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val referenceSeqString: Option[String] = None,
      val referenceSeqPointer: Option[Reference] = None,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Quality extends CompanionFor[Quality] {
    implicit def summonObjectAndCompanionQuality_1402654486(o: Quality): ObjectAndCompanion[Quality, Quality.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Quality
    override type ParentType   = Quality
    override val parentType: CompanionFor[ResourceType] = Quality
    object Roc extends CompanionFor[Roc] {
      implicit def summonObjectAndCompanionRoc_1195414897(o: Roc): ObjectAndCompanion[Roc, Roc.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Roc
      override type ParentType   = Roc
      override val parentType: CompanionFor[ResourceType] = Roc
      def apply(
          id: Option[String] = None,
          score: LitSeq[Int] = LitSeq.empty,
          numTP: LitSeq[Int] = LitSeq.empty,
          numFP: LitSeq[Int] = LitSeq.empty,
          numFN: LitSeq[Int] = LitSeq.empty,
          fMeasure: LitSeq[BigDecimal] = LitSeq.empty,
          extension: LitSeq[Extension] = LitSeq.empty,
          precision: LitSeq[BigDecimal] = LitSeq.empty,
          sensitivity: LitSeq[BigDecimal] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Roc = new Roc(
        id,
        score,
        numTP,
        numFP,
        numFN,
        fMeasure,
        extension,
        precision,
        sensitivity,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Roc): Option[(Option[String], LitSeq[Int], LitSeq[Int], LitSeq[Int], LitSeq[Int], LitSeq[BigDecimal], LitSeq[Extension], LitSeq[BigDecimal], LitSeq[BigDecimal], LitSeq[Extension])] =
        Some(
          (
            o.id,
            o.score,
            o.numTP,
            o.numFP,
            o.numFN,
            o.fMeasure,
            o.extension,
            o.precision,
            o.sensitivity,
            o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val score: FHIRComponentFieldMeta[LitSeq[Int]] =
        FHIRComponentFieldMeta("score", lTagOf[LitSeq[Int]], false, lTagOf[Int])
      val numTP: FHIRComponentFieldMeta[LitSeq[Int]] =
        FHIRComponentFieldMeta("numTP", lTagOf[LitSeq[Int]], false, lTagOf[Int])
      val numFP: FHIRComponentFieldMeta[LitSeq[Int]] =
        FHIRComponentFieldMeta("numFP", lTagOf[LitSeq[Int]], false, lTagOf[Int])
      val numFN: FHIRComponentFieldMeta[LitSeq[Int]] =
        FHIRComponentFieldMeta("numFN", lTagOf[LitSeq[Int]], false, lTagOf[Int])
      val fMeasure: FHIRComponentFieldMeta[LitSeq[BigDecimal]] =
        FHIRComponentFieldMeta("fMeasure", lTagOf[LitSeq[BigDecimal]], false, lTagOf[BigDecimal])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val precision: FHIRComponentFieldMeta[LitSeq[BigDecimal]] =
        FHIRComponentFieldMeta("precision", lTagOf[LitSeq[BigDecimal]], false, lTagOf[BigDecimal])
      val sensitivity: FHIRComponentFieldMeta[LitSeq[BigDecimal]] =
        FHIRComponentFieldMeta("sensitivity", lTagOf[LitSeq[BigDecimal]], false, lTagOf[BigDecimal])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
        Seq(id, score, numTP, numFP, numFN, fMeasure, extension, precision, sensitivity, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Roc): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[LitSeq[Int]](score, t.score),
        FHIRComponentField[LitSeq[Int]](numTP, t.numTP),
        FHIRComponentField[LitSeq[Int]](numFP, t.numFP),
        FHIRComponentField[LitSeq[Int]](numFN, t.numFN),
        FHIRComponentField[LitSeq[BigDecimal]](fMeasure, t.fMeasure),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[BigDecimal]](precision, t.precision),
        FHIRComponentField[LitSeq[BigDecimal]](sensitivity, t.sensitivity),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Roc] = this
      val thisName: String            = "Roc"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Roc] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Roc(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[LitSeq[Int]]("score", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Int]]("numTP", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Int]]("numFP", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Int]]("numFN", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[BigDecimal]]("fMeasure", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[BigDecimal]]("precision", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[BigDecimal]]("sensitivity", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Roc(
        override val id: Option[String] = None,
        val score: LitSeq[Int] = LitSeq.empty,
        val numTP: LitSeq[Int] = LitSeq.empty,
        val numFP: LitSeq[Int] = LitSeq.empty,
        val numFN: LitSeq[Int] = LitSeq.empty,
        val fMeasure: LitSeq[BigDecimal] = LitSeq.empty,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val precision: LitSeq[BigDecimal] = LitSeq.empty,
        val sensitivity: LitSeq[BigDecimal] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        end: Option[Int] = None,
        `type`: QUALITY_TYPE,
        gtFP: Option[BigDecimal] = None,
        start: Option[Int] = None,
        score: Option[Quantity] = None,
        method: Option[CodeableConcept] = None,
        recall: Option[BigDecimal] = None,
        fScore: Option[BigDecimal] = None,
        truthTP: Option[BigDecimal] = None,
        queryTP: Option[BigDecimal] = None,
        truthFN: Option[BigDecimal] = None,
        queryFP: Option[BigDecimal] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        precision: Option[BigDecimal] = None,
        standardSequence: Option[CodeableConcept] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        roc: Option[Quality.Roc] = None,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Quality = new Quality(
      id,
      end,
      `type`,
      gtFP,
      start,
      score,
      method,
      recall,
      fScore,
      truthTP,
      queryTP,
      truthFN,
      queryFP,
      extension,
      precision,
      standardSequence,
      modifierExtension,
      roc,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Quality): Option[(Option[String], Option[Int], QUALITY_TYPE, Option[BigDecimal], Option[Int], Option[Quantity], Option[CodeableConcept], Option[BigDecimal], Option[BigDecimal], Option[BigDecimal], Option[BigDecimal], Option[BigDecimal], Option[BigDecimal], LitSeq[Extension], Option[BigDecimal], Option[CodeableConcept], LitSeq[Extension], Option[Quality.Roc])] =
      Some(
        (
          o.id,
          o.end,
          o.`type`,
          o.gtFP,
          o.start,
          o.score,
          o.method,
          o.recall,
          o.fScore,
          o.truthTP,
          o.queryTP,
          o.truthFN,
          o.queryFP,
          o.extension,
          o.precision,
          o.standardSequence,
          o.modifierExtension,
          o.roc))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val end: FHIRComponentFieldMeta[Option[Int]] =
      FHIRComponentFieldMeta("end", lTagOf[Option[Int]], false, lTagOf[Int])
    val `type`: FHIRComponentFieldMeta[QUALITY_TYPE] =
      FHIRComponentFieldMeta("type", lTagOf[QUALITY_TYPE], false, lTagOf[QUALITY_TYPE])
    val gtFP: FHIRComponentFieldMeta[Option[BigDecimal]] =
      FHIRComponentFieldMeta("gtFP", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
    val start: FHIRComponentFieldMeta[Option[Int]] =
      FHIRComponentFieldMeta("start", lTagOf[Option[Int]], false, lTagOf[Int])
    val score: FHIRComponentFieldMeta[Option[Quantity]] =
      FHIRComponentFieldMeta("score", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
    val method: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("method", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val recall: FHIRComponentFieldMeta[Option[BigDecimal]] =
      FHIRComponentFieldMeta("recall", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
    val fScore: FHIRComponentFieldMeta[Option[BigDecimal]] =
      FHIRComponentFieldMeta("fScore", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
    val truthTP: FHIRComponentFieldMeta[Option[BigDecimal]] =
      FHIRComponentFieldMeta("truthTP", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
    val queryTP: FHIRComponentFieldMeta[Option[BigDecimal]] =
      FHIRComponentFieldMeta("queryTP", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
    val truthFN: FHIRComponentFieldMeta[Option[BigDecimal]] =
      FHIRComponentFieldMeta("truthFN", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
    val queryFP: FHIRComponentFieldMeta[Option[BigDecimal]] =
      FHIRComponentFieldMeta("queryFP", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val precision: FHIRComponentFieldMeta[Option[BigDecimal]] =
      FHIRComponentFieldMeta("precision", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
    val standardSequence: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("standardSequence", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val roc: FHIRComponentFieldMeta[Option[Quality.Roc]] =
      FHIRComponentFieldMeta("roc", lTagOf[Option[Quality.Roc]], false, lTagOf[Quality.Roc])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
      id,
      end,
      `type`,
      gtFP,
      start,
      score,
      method,
      recall,
      fScore,
      truthTP,
      queryTP,
      truthFN,
      queryFP,
      extension,
      precision,
      standardSequence,
      modifierExtension,
      roc)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Quality): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Int]](end, t.end),
      FHIRComponentField[QUALITY_TYPE](`type`, t.`type`),
      FHIRComponentField[Option[BigDecimal]](gtFP, t.gtFP),
      FHIRComponentField[Option[Int]](start, t.start),
      FHIRComponentField[Option[Quantity]](score, t.score),
      FHIRComponentField[Option[CodeableConcept]](method, t.method),
      FHIRComponentField[Option[BigDecimal]](recall, t.recall),
      FHIRComponentField[Option[BigDecimal]](fScore, t.fScore),
      FHIRComponentField[Option[BigDecimal]](truthTP, t.truthTP),
      FHIRComponentField[Option[BigDecimal]](queryTP, t.queryTP),
      FHIRComponentField[Option[BigDecimal]](truthFN, t.truthFN),
      FHIRComponentField[Option[BigDecimal]](queryFP, t.queryFP),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[BigDecimal]](precision, t.precision),
      FHIRComponentField[Option[CodeableConcept]](standardSequence, t.standardSequence),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[Quality.Roc]](roc, t.roc)
    )
    val baseType: CompanionFor[Quality] = this
    val thisName: String                = "Quality"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Quality] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Quality(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[Int]]("end", Some(None)),
            cursor.decodeAs[QUALITY_TYPE]("type", None),
            cursor.decodeAs[Option[BigDecimal]]("gtFP", Some(None)),
            cursor.decodeAs[Option[Int]]("start", Some(None)),
            cursor.decodeAs[Option[Quantity]]("score", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("method", Some(None)),
            cursor.decodeAs[Option[BigDecimal]]("recall", Some(None)),
            cursor.decodeAs[Option[BigDecimal]]("fScore", Some(None)),
            cursor.decodeAs[Option[BigDecimal]]("truthTP", Some(None)),
            cursor.decodeAs[Option[BigDecimal]]("queryTP", Some(None)),
            cursor.decodeAs[Option[BigDecimal]]("truthFN", Some(None)),
            cursor.decodeAs[Option[BigDecimal]]("queryFP", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[BigDecimal]]("precision", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("standardSequence", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Quality.Roc]]("roc", Some(None)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Quality(
      override val id: Option[String] = None,
      val end: Option[Int] = None,
      val `type`: QUALITY_TYPE,
      val gtFP: Option[BigDecimal] = None,
      val start: Option[Int] = None,
      val score: Option[Quantity] = None,
      val method: Option[CodeableConcept] = None,
      val recall: Option[BigDecimal] = None,
      val fScore: Option[BigDecimal] = None,
      val truthTP: Option[BigDecimal] = None,
      val queryTP: Option[BigDecimal] = None,
      val truthFN: Option[BigDecimal] = None,
      val queryFP: Option[BigDecimal] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val precision: Option[BigDecimal] = None,
      val standardSequence: Option[CodeableConcept] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val roc: Option[Quality.Roc] = None,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Repository extends CompanionFor[Repository] {
    implicit def summonObjectAndCompanionRepository958228062(
        o: Repository): ObjectAndCompanion[Repository, Repository.type] = ObjectAndCompanion(o, this)
    override type ResourceType = Repository
    override type ParentType   = Repository
    override val parentType: CompanionFor[ResourceType] = Repository
    def apply(
        id: Option[String] = None,
        url: Option[UriStr] = None,
        `type`: REPOSITORY_TYPE,
        name: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        datasetId: Option[String] = None,
        readsetId: Option[String] = None,
        variantsetId: Option[String] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Repository = new Repository(
      id,
      url,
      `type`,
      name,
      extension,
      datasetId,
      readsetId,
      variantsetId,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Repository): Option[(Option[String], Option[UriStr], REPOSITORY_TYPE, Option[String], LitSeq[Extension], Option[String], Option[String], Option[String], LitSeq[Extension])] =
      Some((o.id, o.url, o.`type`, o.name, o.extension, o.datasetId, o.readsetId, o.variantsetId, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val url: FHIRComponentFieldMeta[Option[UriStr]] =
      FHIRComponentFieldMeta("url", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
    val `type`: FHIRComponentFieldMeta[REPOSITORY_TYPE] =
      FHIRComponentFieldMeta("type", lTagOf[REPOSITORY_TYPE], false, lTagOf[REPOSITORY_TYPE])
    val name: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("name", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val datasetId: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("datasetId", lTagOf[Option[String]], false, lTagOf[String])
    val readsetId: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("readsetId", lTagOf[Option[String]], false, lTagOf[String])
    val variantsetId: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("variantsetId", lTagOf[Option[String]], false, lTagOf[String])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, url, `type`, name, extension, datasetId, readsetId, variantsetId, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Repository): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[UriStr]](url, t.url),
      FHIRComponentField[REPOSITORY_TYPE](`type`, t.`type`),
      FHIRComponentField[Option[String]](name, t.name),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[String]](datasetId, t.datasetId),
      FHIRComponentField[Option[String]](readsetId, t.readsetId),
      FHIRComponentField[Option[String]](variantsetId, t.variantsetId),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Repository] = this
    val thisName: String                   = "Repository"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Repository] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Repository(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[UriStr]]("url", Some(None)),
            cursor.decodeAs[REPOSITORY_TYPE]("type", None),
            cursor.decodeAs[Option[String]]("name", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("datasetId", Some(None)),
            cursor.decodeAs[Option[String]]("readsetId", Some(None)),
            cursor.decodeAs[Option[String]]("variantsetId", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Repository(
      override val id: Option[String] = None,
      val url: Option[UriStr] = None,
      val `type`: REPOSITORY_TYPE,
      val name: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val datasetId: Option[String] = None,
      val readsetId: Option[String] = None,
      val variantsetId: Option[String] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Variant extends CompanionFor[Variant] {
    implicit def summonObjectAndCompanionVariant_1953348921(o: Variant): ObjectAndCompanion[Variant, Variant.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Variant
    override type ParentType   = Variant
    override val parentType: CompanionFor[ResourceType] = Variant
    def apply(
        id: Option[String] = None,
        end: Option[Int] = None,
        start: Option[Int] = None,
        cigar: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        observedAllele: Option[String] = None,
        variantPointer: Option[Reference] = None,
        referenceAllele: Option[String] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Variant = new Variant(
      id,
      end,
      start,
      cigar,
      extension,
      observedAllele,
      variantPointer,
      referenceAllele,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Variant): Option[(Option[String], Option[Int], Option[Int], Option[String], LitSeq[Extension], Option[String], Option[Reference], Option[String], LitSeq[Extension])] =
      Some(
        (
          o.id,
          o.end,
          o.start,
          o.cigar,
          o.extension,
          o.observedAllele,
          o.variantPointer,
          o.referenceAllele,
          o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val end: FHIRComponentFieldMeta[Option[Int]] =
      FHIRComponentFieldMeta("end", lTagOf[Option[Int]], false, lTagOf[Int])
    val start: FHIRComponentFieldMeta[Option[Int]] =
      FHIRComponentFieldMeta("start", lTagOf[Option[Int]], false, lTagOf[Int])
    val cigar: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("cigar", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val observedAllele: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("observedAllele", lTagOf[Option[String]], false, lTagOf[String])
    val variantPointer: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("variantPointer", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val referenceAllele: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("referenceAllele", lTagOf[Option[String]], false, lTagOf[String])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, end, start, cigar, extension, observedAllele, variantPointer, referenceAllele, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Variant): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Int]](end, t.end),
      FHIRComponentField[Option[Int]](start, t.start),
      FHIRComponentField[Option[String]](cigar, t.cigar),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[String]](observedAllele, t.observedAllele),
      FHIRComponentField[Option[Reference]](variantPointer, t.variantPointer),
      FHIRComponentField[Option[String]](referenceAllele, t.referenceAllele),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Variant] = this
    val thisName: String                = "Variant"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Variant] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Variant(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[Int]]("end", Some(None)),
            cursor.decodeAs[Option[Int]]("start", Some(None)),
            cursor.decodeAs[Option[String]]("cigar", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("observedAllele", Some(None)),
            cursor.decodeAs[Option[Reference]]("variantPointer", Some(None)),
            cursor.decodeAs[Option[String]]("referenceAllele", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Variant(
      override val id: Option[String] = None,
      val end: Option[Int] = None,
      val start: Option[Int] = None,
      val cigar: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val observedAllele: Option[String] = None,
      val variantPointer: Option[Reference] = None,
      val referenceAllele: Option[String] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      `type`: Option[SEQUENCE_TYPE] = None,
      device: Option[Reference] = None,
      patient: Option[Reference] = None,
      pointer: LitSeq[Reference] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      specimen: Option[Reference] = None,
      quantity: Option[Quantity] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      performer: Option[Reference] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      observedSeq: Option[String] = None,
      readCoverage: Option[Int] = None,
      implicitRules: Option[UriStr] = None,
      coordinateSystem: Int,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      variant: LitSeq[MolecularSequence.Variant] = LitSeq.empty,
      repository: LitSeq[MolecularSequence.Repository] = LitSeq.empty,
      quality: LitSeq[MolecularSequence.Quality] = LitSeq.empty,
      referenceSeq: Option[MolecularSequence.ReferenceSeq] = None,
      structureVariant: LitSeq[MolecularSequence.StructureVariant] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): MolecularSequence = new MolecularSequence(
    id,
    meta,
    text,
    `type`,
    device,
    patient,
    pointer,
    language,
    specimen,
    quantity,
    contained,
    extension,
    performer,
    identifier,
    observedSeq,
    readCoverage,
    implicitRules,
    coordinateSystem,
    modifierExtension,
    variant,
    repository,
    quality,
    referenceSeq,
    structureVariant,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val `type`: FHIRComponentFieldMeta[Option[SEQUENCE_TYPE]] =
    FHIRComponentFieldMeta("type", lTagOf[Option[SEQUENCE_TYPE]], false, lTagOf[SEQUENCE_TYPE])
  val device: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("device", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val patient: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("patient", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val pointer: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("pointer", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val specimen: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("specimen", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val quantity: FHIRComponentFieldMeta[Option[Quantity]] =
    FHIRComponentFieldMeta("quantity", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val performer: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("performer", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val observedSeq: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("observedSeq", lTagOf[Option[String]], false, lTagOf[String])
  val readCoverage: FHIRComponentFieldMeta[Option[Int]] =
    FHIRComponentFieldMeta("readCoverage", lTagOf[Option[Int]], false, lTagOf[Int])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val coordinateSystem: FHIRComponentFieldMeta[Int] =
    FHIRComponentFieldMeta("coordinateSystem", lTagOf[Int], false, lTagOf[Int])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val variant: FHIRComponentFieldMeta[LitSeq[MolecularSequence.Variant]] =
    FHIRComponentFieldMeta(
      "variant",
      lTagOf[LitSeq[MolecularSequence.Variant]],
      false,
      lTagOf[MolecularSequence.Variant])
  val repository: FHIRComponentFieldMeta[LitSeq[MolecularSequence.Repository]] =
    FHIRComponentFieldMeta(
      "repository",
      lTagOf[LitSeq[MolecularSequence.Repository]],
      false,
      lTagOf[MolecularSequence.Repository])
  val quality: FHIRComponentFieldMeta[LitSeq[MolecularSequence.Quality]] =
    FHIRComponentFieldMeta(
      "quality",
      lTagOf[LitSeq[MolecularSequence.Quality]],
      false,
      lTagOf[MolecularSequence.Quality])
  val referenceSeq: FHIRComponentFieldMeta[Option[MolecularSequence.ReferenceSeq]] =
    FHIRComponentFieldMeta(
      "referenceSeq",
      lTagOf[Option[MolecularSequence.ReferenceSeq]],
      false,
      lTagOf[MolecularSequence.ReferenceSeq])
  val structureVariant: FHIRComponentFieldMeta[LitSeq[MolecularSequence.StructureVariant]] =
    FHIRComponentFieldMeta(
      "structureVariant",
      lTagOf[LitSeq[MolecularSequence.StructureVariant]],
      false,
      lTagOf[MolecularSequence.StructureVariant])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    `type`,
    device,
    patient,
    pointer,
    language,
    specimen,
    quantity,
    contained,
    extension,
    performer,
    identifier,
    observedSeq,
    readCoverage,
    implicitRules,
    coordinateSystem,
    modifierExtension,
    variant,
    repository,
    quality,
    referenceSeq,
    structureVariant
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: MolecularSequence): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[SEQUENCE_TYPE]](`type`, t.`type`),
    FHIRComponentField[Option[Reference]](device, t.device),
    FHIRComponentField[Option[Reference]](patient, t.patient),
    FHIRComponentField[LitSeq[Reference]](pointer, t.pointer),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Option[Reference]](specimen, t.specimen),
    FHIRComponentField[Option[Quantity]](quantity, t.quantity),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Reference]](performer, t.performer),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[String]](observedSeq, t.observedSeq),
    FHIRComponentField[Option[Int]](readCoverage, t.readCoverage),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Int](coordinateSystem, t.coordinateSystem),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[MolecularSequence.Variant]](variant, t.variant),
    FHIRComponentField[LitSeq[MolecularSequence.Repository]](repository, t.repository),
    FHIRComponentField[LitSeq[MolecularSequence.Quality]](quality, t.quality),
    FHIRComponentField[Option[MolecularSequence.ReferenceSeq]](referenceSeq, t.referenceSeq),
    FHIRComponentField[LitSeq[MolecularSequence.StructureVariant]](structureVariant, t.structureVariant)
  )
  def extractId(t: MolecularSequence): Option[String]                                           = t.id
  def extractMeta(t: MolecularSequence): Option[Meta]                                           = t.meta
  def extractText(t: MolecularSequence): Option[Narrative]                                      = t.text
  def extractType(t: MolecularSequence): Option[SEQUENCE_TYPE]                                  = t.`type`
  def extractDevice(t: MolecularSequence): Option[Reference]                                    = t.device
  def extractPatient(t: MolecularSequence): Option[Reference]                                   = t.patient
  def extractPointer(t: MolecularSequence): LitSeq[Reference]                                   = t.pointer
  def extractLanguage(t: MolecularSequence): Option[LANGUAGES]                                  = t.language
  def extractSpecimen(t: MolecularSequence): Option[Reference]                                  = t.specimen
  def extractQuantity(t: MolecularSequence): Option[Quantity]                                   = t.quantity
  def extractContained(t: MolecularSequence): LitSeq[Resource]                                  = t.contained
  def extractExtension(t: MolecularSequence): LitSeq[Extension]                                 = t.extension
  def extractPerformer(t: MolecularSequence): Option[Reference]                                 = t.performer
  def extractIdentifier(t: MolecularSequence): LitSeq[Identifier]                               = t.identifier
  def extractObservedSeq(t: MolecularSequence): Option[String]                                  = t.observedSeq
  def extractReadCoverage(t: MolecularSequence): Option[Int]                                    = t.readCoverage
  def extractImplicitRules(t: MolecularSequence): Option[UriStr]                                = t.implicitRules
  def extractCoordinateSystem(t: MolecularSequence): Int                                        = t.coordinateSystem
  def extractModifierExtension(t: MolecularSequence): LitSeq[Extension]                         = t.modifierExtension
  def extractVariant(t: MolecularSequence): LitSeq[MolecularSequence.Variant]                   = t.variant
  def extractRepository(t: MolecularSequence): LitSeq[MolecularSequence.Repository]             = t.repository
  def extractQuality(t: MolecularSequence): LitSeq[MolecularSequence.Quality]                   = t.quality
  def extractReferenceSeq(t: MolecularSequence): Option[MolecularSequence.ReferenceSeq]         = t.referenceSeq
  def extractStructureVariant(t: MolecularSequence): LitSeq[MolecularSequence.StructureVariant] = t.structureVariant
  override val thisName: String                                                                 = "MolecularSequence"
  override val searchParams: Map[String, MolecularSequence => Seq[Any]] = Map(
    "variant-end"                       -> (obj => obj.variant.flatMap(_.end).toSeq),
    "referenceseqid-window-coordinate"  -> (obj => obj.referenceSeq.toSeq),
    "chromosome-variant-coordinate"     -> (obj => obj.variant.toSeq),
    "window-end"                        -> (obj => obj.referenceSeq.flatMap(_.windowEnd).toSeq),
    "referenceseqid-variant-coordinate" -> (obj => obj.variant.toSeq),
    "window-start"                      -> (obj => obj.referenceSeq.flatMap(_.windowStart).toSeq),
    "chromosome"                        -> (obj => obj.referenceSeq.flatMap(_.chromosome).toSeq),
    "referenceseqid"                    -> (obj => obj.referenceSeq.flatMap(_.referenceSeqId).toSeq),
    "chromosome-window-coordinate"      -> (obj => obj.referenceSeq.toSeq),
    "type"                              -> (obj => obj.`type`.toSeq),
    "patient"                           -> (obj => obj.patient.toSeq),
    "variant-start"                     -> (obj => obj.variant.flatMap(_.start).toSeq),
    "identifier"                        -> (obj => obj.identifier.toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[MolecularSequence] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new MolecularSequence(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[SEQUENCE_TYPE]]("type", Some(None)),
          cursor.decodeAs[Option[Reference]]("device", Some(None)),
          cursor.decodeAs[Option[Reference]]("patient", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("pointer", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[Reference]]("specimen", Some(None)),
          cursor.decodeAs[Option[Quantity]]("quantity", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("performer", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("observedSeq", Some(None)),
          cursor.decodeAs[Option[Int]]("readCoverage", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Int]("coordinateSystem", None),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[MolecularSequence.Variant]]("variant", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[MolecularSequence.Repository]]("repository", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[MolecularSequence.Quality]]("quality", Some(LitSeq.empty)),
          cursor.decodeAs[Option[MolecularSequence.ReferenceSeq]]("referenceSeq", Some(None)),
          cursor.decodeAs[LitSeq[MolecularSequence.StructureVariant]]("structureVariant", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Raw data describing a biological sequence.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields `type`, device, patient, pointer, specimen, quantity, performer, identifier, observedSeq, readCoverage, coordinateSystem, variant, repository, quality, referenceSeq, structureVariant.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param `type` - Amino Acid Sequence/ DNA Sequence / RNA Sequence.
  * @param device - The method for sequencing, for example, chip information.
  * @param patient - The patient whose sequencing results are described by this resource.
  * @param pointer - Pointer to next atomic sequence which at most contains one variant.
  * @param language - The base language in which the resource is written.
  * @param specimen - Specimen used for sequencing.
  * @param quantity - The number of copies of the sequence of interest. (RNASeq).
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param performer - The organization or lab that should be responsible for this result.
  * @param identifier - A unique identifier for this particular sequence instance. This is a FHIR-defined id.
  * @param observedSeq - Sequence that was observed. It is the result marked by referenceSeq along with variant records on referenceSeq. This shall start from referenceSeq.windowStart and end by referenceSeq.windowEnd.
  * @param readCoverage - Coverage (read depth or depth) is the average number of reads representing a given nucleotide in the reconstructed sequence.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param coordinateSystem - Whether the sequence is numbered starting at 0 (0-based numbering or coordinates, inclusive start, exclusive end) or starting at 1 (1-based numbering, inclusive start and inclusive end).
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param variant - The definition of variant here originates from Sequence ontology ([variant_of](http://www.sequenceontology.org/browser/current_svn/term/variant_of)). This element can represent amino acid or nucleic sequence change(including insertion,deletion,SNP,etc.)  It can represent some complex mutation or segment variation with the assist of CIGAR string.
  * @param repository - Configurations of the external repository. The repository shall store target's observedSeq or records related with target's observedSeq.
  * @param quality - An experimental feature attribute that defines the quality of the feature in a quantitative way, such as a phred quality score ([SO:0001686](http://www.sequenceontology.org/browser/current_svn/term/SO:0001686)).
  * @param referenceSeq - A sequence that is used as a reference to describe variants that are present in a sequence analyzed.
  * @param structureVariant - Information about chromosome structure variation.
  */
@POJOBoilerplate
class MolecularSequence(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val `type`: Option[SEQUENCE_TYPE] = None,
    val device: Option[Reference] = None,
    val patient: Option[Reference] = None,
    val pointer: LitSeq[Reference] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    val specimen: Option[Reference] = None,
    val quantity: Option[Quantity] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val performer: Option[Reference] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val observedSeq: Option[String] = None,
    val readCoverage: Option[Int] = None,
    override val implicitRules: Option[UriStr] = None,
    val coordinateSystem: Int,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val variant: LitSeq[MolecularSequence.Variant] = LitSeq.empty,
    val repository: LitSeq[MolecularSequence.Repository] = LitSeq.empty,
    val quality: LitSeq[MolecularSequence.Quality] = LitSeq.empty,
    val referenceSeq: Option[MolecularSequence.ReferenceSeq] = None,
    val structureVariant: LitSeq[MolecularSequence.StructureVariant] = LitSeq.empty,
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
  override val thisTypeName: String = "MolecularSequence"
}
