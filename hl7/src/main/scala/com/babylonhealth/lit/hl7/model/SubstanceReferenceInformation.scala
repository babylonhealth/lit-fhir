package com.babylonhealth.lit.hl7.model

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
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object SubstanceReferenceInformation extends CompanionFor[SubstanceReferenceInformation] {
  override val baseType: CompanionFor[SubstanceReferenceInformation] = SubstanceReferenceInformation
  object Classification extends CompanionFor[Classification] {
    def apply(
        id: Option[String] = None,
        domain: Option[CodeableConcept] = None,
        source: LitSeq[Reference] = LitSeq.empty,
        subtype: LitSeq[CodeableConcept] = LitSeq.empty,
        extension: LitSeq[Extension] = LitSeq.empty,
        classification: Option[CodeableConcept] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Classification = new Classification(
      id,
      domain,
      source,
      subtype,
      extension,
      classification,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Classification): Option[(Option[String], Option[CodeableConcept], LitSeq[Reference], LitSeq[CodeableConcept], LitSeq[Extension], Option[CodeableConcept], LitSeq[Extension])] =
      Some((o.id, o.domain, o.source, o.subtype, o.extension, o.classification, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val domain: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("domain", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val source: FHIRComponentFieldMeta[LitSeq[Reference]] =
      FHIRComponentFieldMeta("source", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
    val subtype: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("subtype", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val classification: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("classification", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, domain, source, subtype, extension, classification, modifierExtension)
    override def fields(t: Classification): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](domain, t.domain),
      FHIRComponentField[LitSeq[Reference]](source, t.source),
      FHIRComponentField[LitSeq[CodeableConcept]](subtype, t.subtype),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[CodeableConcept]](classification, t.classification),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Classification] = this
    val thisName: String                       = "Classification"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Classification] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Classification(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("domain", Some(None)),
            cursor.decodeAs[LitSeq[Reference]]("source", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("subtype", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[CodeableConcept]]("classification", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Classification(
      override val id: Option[String] = None,
      val domain: Option[CodeableConcept] = None,
      val source: LitSeq[Reference] = LitSeq.empty,
      val subtype: LitSeq[CodeableConcept] = LitSeq.empty,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val classification: Option[CodeableConcept] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object GeneElement extends CompanionFor[GeneElement] {
    def apply(
        id: Option[String] = None,
        `type`: Option[CodeableConcept] = None,
        source: LitSeq[Reference] = LitSeq.empty,
        element: Option[Identifier] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): GeneElement = new GeneElement(
      id,
      `type`,
      source,
      element,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: GeneElement): Option[(Option[String], Option[CodeableConcept], LitSeq[Reference], Option[Identifier], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.`type`, o.source, o.element, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val source: FHIRComponentFieldMeta[LitSeq[Reference]] =
      FHIRComponentFieldMeta("source", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
    val element: FHIRComponentFieldMeta[Option[Identifier]] =
      FHIRComponentFieldMeta("element", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, `type`, source, element, extension, modifierExtension)
    override def fields(t: GeneElement): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[LitSeq[Reference]](source, t.source),
      FHIRComponentField[Option[Identifier]](element, t.element),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[GeneElement] = this
    val thisName: String                    = "GeneElement"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[GeneElement] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new GeneElement(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
            cursor.decodeAs[LitSeq[Reference]]("source", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Identifier]]("element", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class GeneElement(
      override val id: Option[String] = None,
      val `type`: Option[CodeableConcept] = None,
      val source: LitSeq[Reference] = LitSeq.empty,
      val element: Option[Identifier] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Target extends CompanionFor[Target] {
    type AmountChoice = Choice[Union_1527751898]
    def apply(
        id: Option[String] = None,
        `type`: Option[CodeableConcept] = None,
        target: Option[Identifier] = None,
        source: LitSeq[Reference] = LitSeq.empty,
        organism: Option[CodeableConcept] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        amount: Option[Target.AmountChoice] = None,
        amountType: Option[CodeableConcept] = None,
        interaction: Option[CodeableConcept] = None,
        organismType: Option[CodeableConcept] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Target = new Target(
      id,
      `type`,
      target,
      source,
      organism,
      extension,
      amount,
      amountType,
      interaction,
      organismType,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Target): Option[(Option[String], Option[CodeableConcept], Option[Identifier], LitSeq[Reference], Option[CodeableConcept], LitSeq[Extension], Option[Target.AmountChoice], Option[CodeableConcept], Option[CodeableConcept], Option[CodeableConcept], LitSeq[Extension])] =
      Some(
        (
          o.id,
          o.`type`,
          o.target,
          o.source,
          o.organism,
          o.extension,
          o.amount,
          o.amountType,
          o.interaction,
          o.organismType,
          o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val target: FHIRComponentFieldMeta[Option[Identifier]] =
      FHIRComponentFieldMeta("target", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
    val source: FHIRComponentFieldMeta[LitSeq[Reference]] =
      FHIRComponentFieldMeta("source", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
    val organism: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("organism", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val amount: FHIRComponentFieldMeta[Option[Target.AmountChoice]] =
      FHIRComponentFieldMeta("amount", lTagOf[Option[Target.AmountChoice]], true, lTagOf[Union_1527751898])
    val amountType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("amountType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val interaction: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("interaction", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val organismType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("organismType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
      id,
      `type`,
      target,
      source,
      organism,
      extension,
      amount,
      amountType,
      interaction,
      organismType,
      modifierExtension)
    override def fields(t: Target): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[Option[Identifier]](target, t.target),
      FHIRComponentField[LitSeq[Reference]](source, t.source),
      FHIRComponentField[Option[CodeableConcept]](organism, t.organism),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Target.AmountChoice]](amount, t.amount),
      FHIRComponentField[Option[CodeableConcept]](amountType, t.amountType),
      FHIRComponentField[Option[CodeableConcept]](interaction, t.interaction),
      FHIRComponentField[Option[CodeableConcept]](organismType, t.organismType),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Target] = this
    val thisName: String               = "Target"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Target] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Target(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
            cursor.decodeAs[Option[Identifier]]("target", Some(None)),
            cursor.decodeAs[LitSeq[Reference]]("source", Some(LitSeq.empty)),
            cursor.decodeAs[Option[CodeableConcept]]("organism", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeOptRef[Union_1527751898]("amount"),
            cursor.decodeAs[Option[CodeableConcept]]("amountType", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("interaction", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("organismType", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Target(
      override val id: Option[String] = None,
      val `type`: Option[CodeableConcept] = None,
      val target: Option[Identifier] = None,
      val source: LitSeq[Reference] = LitSeq.empty,
      val organism: Option[CodeableConcept] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val amount: Option[Target.AmountChoice] = None,
      val amountType: Option[CodeableConcept] = None,
      val interaction: Option[CodeableConcept] = None,
      val organismType: Option[CodeableConcept] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Gene extends CompanionFor[Gene] {
    def apply(
        id: Option[String] = None,
        gene: Option[CodeableConcept] = None,
        source: LitSeq[Reference] = LitSeq.empty,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        geneSequenceOrigin: Option[CodeableConcept] = None,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Gene = new Gene(
      id,
      gene,
      source,
      extension,
      modifierExtension,
      geneSequenceOrigin,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Gene): Option[(Option[String], Option[CodeableConcept], LitSeq[Reference], LitSeq[Extension], LitSeq[Extension], Option[CodeableConcept])] =
      Some((o.id, o.gene, o.source, o.extension, o.modifierExtension, o.geneSequenceOrigin))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val gene: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("gene", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val source: FHIRComponentFieldMeta[LitSeq[Reference]] =
      FHIRComponentFieldMeta("source", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val geneSequenceOrigin: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("geneSequenceOrigin", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, gene, source, extension, modifierExtension, geneSequenceOrigin)
    override def fields(t: Gene): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](gene, t.gene),
      FHIRComponentField[LitSeq[Reference]](source, t.source),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[CodeableConcept]](geneSequenceOrigin, t.geneSequenceOrigin)
    )
    val baseType: CompanionFor[Gene] = this
    val thisName: String             = "Gene"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Gene] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Gene(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("gene", Some(None)),
            cursor.decodeAs[LitSeq[Reference]]("source", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[CodeableConcept]]("geneSequenceOrigin", Some(None)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Gene(
      override val id: Option[String] = None,
      val gene: Option[CodeableConcept] = None,
      val source: LitSeq[Reference] = LitSeq.empty,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val geneSequenceOrigin: Option[CodeableConcept] = None,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      comment: Option[String] = None,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      gene: LitSeq[SubstanceReferenceInformation.Gene] = LitSeq.empty,
      target: LitSeq[SubstanceReferenceInformation.Target] = LitSeq.empty,
      geneElement: LitSeq[SubstanceReferenceInformation.GeneElement] = LitSeq.empty,
      classification: LitSeq[SubstanceReferenceInformation.Classification] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): SubstanceReferenceInformation = new SubstanceReferenceInformation(
    id,
    meta,
    text,
    comment,
    language,
    contained,
    extension,
    implicitRules,
    modifierExtension,
    gene,
    target,
    geneElement,
    classification,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val comment: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("comment", lTagOf[Option[String]], false, lTagOf[String])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val gene: FHIRComponentFieldMeta[LitSeq[SubstanceReferenceInformation.Gene]] =
    FHIRComponentFieldMeta(
      "gene",
      lTagOf[LitSeq[SubstanceReferenceInformation.Gene]],
      false,
      lTagOf[SubstanceReferenceInformation.Gene])
  val target: FHIRComponentFieldMeta[LitSeq[SubstanceReferenceInformation.Target]] =
    FHIRComponentFieldMeta(
      "target",
      lTagOf[LitSeq[SubstanceReferenceInformation.Target]],
      false,
      lTagOf[SubstanceReferenceInformation.Target])
  val geneElement: FHIRComponentFieldMeta[LitSeq[SubstanceReferenceInformation.GeneElement]] =
    FHIRComponentFieldMeta(
      "geneElement",
      lTagOf[LitSeq[SubstanceReferenceInformation.GeneElement]],
      false,
      lTagOf[SubstanceReferenceInformation.GeneElement])
  val classification: FHIRComponentFieldMeta[LitSeq[SubstanceReferenceInformation.Classification]] =
    FHIRComponentFieldMeta(
      "classification",
      lTagOf[LitSeq[SubstanceReferenceInformation.Classification]],
      false,
      lTagOf[SubstanceReferenceInformation.Classification])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    comment,
    language,
    contained,
    extension,
    implicitRules,
    modifierExtension,
    gene,
    target,
    geneElement,
    classification)
  override def fields(t: SubstanceReferenceInformation): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[String]](comment, t.comment),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[SubstanceReferenceInformation.Gene]](gene, t.gene),
    FHIRComponentField[LitSeq[SubstanceReferenceInformation.Target]](target, t.target),
    FHIRComponentField[LitSeq[SubstanceReferenceInformation.GeneElement]](geneElement, t.geneElement),
    FHIRComponentField[LitSeq[SubstanceReferenceInformation.Classification]](classification, t.classification)
  )
  def extractId(t: SubstanceReferenceInformation): Option[String]                                   = t.id
  def extractMeta(t: SubstanceReferenceInformation): Option[Meta]                                   = t.meta
  def extractText(t: SubstanceReferenceInformation): Option[Narrative]                              = t.text
  def extractComment(t: SubstanceReferenceInformation): Option[String]                              = t.comment
  def extractLanguage(t: SubstanceReferenceInformation): Option[LANGUAGES]                          = t.language
  def extractContained(t: SubstanceReferenceInformation): LitSeq[Resource]                          = t.contained
  def extractExtension(t: SubstanceReferenceInformation): LitSeq[Extension]                         = t.extension
  def extractImplicitRules(t: SubstanceReferenceInformation): Option[UriStr]                        = t.implicitRules
  def extractModifierExtension(t: SubstanceReferenceInformation): LitSeq[Extension]                 = t.modifierExtension
  def extractGene(t: SubstanceReferenceInformation): LitSeq[SubstanceReferenceInformation.Gene]     = t.gene
  def extractTarget(t: SubstanceReferenceInformation): LitSeq[SubstanceReferenceInformation.Target] = t.target
  def extractGeneElement(t: SubstanceReferenceInformation): LitSeq[SubstanceReferenceInformation.GeneElement] =
    t.geneElement
  def extractClassification(t: SubstanceReferenceInformation): LitSeq[SubstanceReferenceInformation.Classification] =
    t.classification
  override val thisName: String = "SubstanceReferenceInformation"
  def unapply(
      o: SubstanceReferenceInformation): Option[(Option[String], Option[Meta], Option[Narrative], Option[String], Option[LANGUAGES], LitSeq[Resource], LitSeq[Extension], Option[UriStr], LitSeq[Extension], LitSeq[SubstanceReferenceInformation.Gene], LitSeq[SubstanceReferenceInformation.Target], LitSeq[SubstanceReferenceInformation.GeneElement], LitSeq[SubstanceReferenceInformation.Classification])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.comment,
        o.language,
        o.contained,
        o.extension,
        o.implicitRules,
        o.modifierExtension,
        o.gene,
        o.target,
        o.geneElement,
        o.classification))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[SubstanceReferenceInformation] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new SubstanceReferenceInformation(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[String]]("comment", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[SubstanceReferenceInformation.Gene]]("gene", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[SubstanceReferenceInformation.Target]]("target", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[SubstanceReferenceInformation.GeneElement]]("geneElement", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[SubstanceReferenceInformation.Classification]]("classification", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Todo.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields comment, gene, target, geneElement, classification.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param comment - Todo.
  * @param language - The base language in which the resource is written.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param gene - Todo.
  * @param target - Todo.
  * @param geneElement - Todo.
  * @param classification - Todo.
  */
@POJOBoilerplate
class SubstanceReferenceInformation(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val comment: Option[String] = None,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val gene: LitSeq[SubstanceReferenceInformation.Gene] = LitSeq.empty,
    val target: LitSeq[SubstanceReferenceInformation.Target] = LitSeq.empty,
    val geneElement: LitSeq[SubstanceReferenceInformation.GeneElement] = LitSeq.empty,
    val classification: LitSeq[SubstanceReferenceInformation.Classification] = LitSeq.empty,
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
  override val thisTypeName: String = "SubstanceReferenceInformation"
}
