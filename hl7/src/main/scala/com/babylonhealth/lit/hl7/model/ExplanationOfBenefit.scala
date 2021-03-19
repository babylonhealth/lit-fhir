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
import com.babylonhealth.lit.hl7.{ EXPLANATIONOFBENEFIT_STATUS, CLAIM_USE, NOTE_TYPE, REMITTANCE_OUTCOME }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object ExplanationOfBenefit extends CompanionFor[ExplanationOfBenefit] {
  override type ResourceType = ExplanationOfBenefit
  override val baseType: CompanionFor[ResourceType] = ExplanationOfBenefit
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit")
  object BenefitBalance extends CompanionFor[BenefitBalance] {
    override type ResourceType = BenefitBalance
    object Financial extends CompanionFor[Financial] {
      override type ResourceType = Financial
      type UsedChoice            = Choice[Union_1289000811]
      type AllowedChoice         = Choice[Union_0040864668]
      def apply(
          id: Option[String] = None,
          `type`: CodeableConcept,
          used: Option[Financial.UsedChoice] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          allowed: Option[Financial.AllowedChoice] = None,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Financial = new Financial(
        id,
        `type`,
        used,
        extension,
        allowed,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Financial): Option[(Option[String], CodeableConcept, Option[Financial.UsedChoice], LitSeq[Extension], Option[Financial.AllowedChoice], LitSeq[Extension])] =
        Some((o.id, o.`type`, o.used, o.extension, o.allowed, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val `type`: FHIRComponentFieldMeta[CodeableConcept] =
        FHIRComponentFieldMeta("type", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
      val used: FHIRComponentFieldMeta[Option[Financial.UsedChoice]] =
        FHIRComponentFieldMeta("used", lTagOf[Option[Financial.UsedChoice]], true, lTagOf[Union_1289000811])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val allowed: FHIRComponentFieldMeta[Option[Financial.AllowedChoice]] =
        FHIRComponentFieldMeta("allowed", lTagOf[Option[Financial.AllowedChoice]], true, lTagOf[Union_0040864668])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, `type`, used, extension, allowed, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Financial): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[CodeableConcept](`type`, t.`type`),
        FHIRComponentField[Option[Financial.UsedChoice]](used, t.used),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[Financial.AllowedChoice]](allowed, t.allowed),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Financial] = this
      val thisName: String                  = "Financial"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Financial] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Financial(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[CodeableConcept]("type", None),
              cursor.decodeOptRef[Union_1289000811]("used"),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeOptRef[Union_0040864668]("allowed"),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Financial(
        override val id: Option[String] = None,
        val `type`: CodeableConcept,
        val used: Option[Financial.UsedChoice] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val allowed: Option[Financial.AllowedChoice] = None,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        name: Option[String] = None,
        unit: Option[CodeableConcept] = None,
        term: Option[CodeableConcept] = None,
        network: Option[CodeableConcept] = None,
        category: CodeableConcept,
        excluded: Option[Boolean] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        description: Option[String] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        financial: LitSeq[BenefitBalance.Financial] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): BenefitBalance = new BenefitBalance(
      id,
      name,
      unit,
      term,
      network,
      category,
      excluded,
      extension,
      description,
      modifierExtension,
      financial,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: BenefitBalance): Option[(Option[String], Option[String], Option[CodeableConcept], Option[CodeableConcept], Option[CodeableConcept], CodeableConcept, Option[Boolean], LitSeq[Extension], Option[String], LitSeq[Extension], LitSeq[BenefitBalance.Financial])] =
      Some(
        (
          o.id,
          o.name,
          o.unit,
          o.term,
          o.network,
          o.category,
          o.excluded,
          o.extension,
          o.description,
          o.modifierExtension,
          o.financial))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val name: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("name", lTagOf[Option[String]], false, lTagOf[String])
    val unit: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("unit", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val term: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("term", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val network: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("network", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val category: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("category", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val excluded: FHIRComponentFieldMeta[Option[Boolean]] =
      FHIRComponentFieldMeta("excluded", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val description: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val financial: FHIRComponentFieldMeta[LitSeq[BenefitBalance.Financial]] =
      FHIRComponentFieldMeta(
        "financial",
        lTagOf[LitSeq[BenefitBalance.Financial]],
        false,
        lTagOf[BenefitBalance.Financial])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, name, unit, term, network, category, excluded, extension, description, modifierExtension, financial)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: BenefitBalance): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[String]](name, t.name),
      FHIRComponentField[Option[CodeableConcept]](unit, t.unit),
      FHIRComponentField[Option[CodeableConcept]](term, t.term),
      FHIRComponentField[Option[CodeableConcept]](network, t.network),
      FHIRComponentField[CodeableConcept](category, t.category),
      FHIRComponentField[Option[Boolean]](excluded, t.excluded),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[String]](description, t.description),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[BenefitBalance.Financial]](financial, t.financial)
    )
    val baseType: CompanionFor[BenefitBalance] = this
    val thisName: String                       = "BenefitBalance"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[BenefitBalance] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new BenefitBalance(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[String]]("name", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("unit", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("term", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("network", Some(None)),
            cursor.decodeAs[CodeableConcept]("category", None),
            cursor.decodeAs[Option[Boolean]]("excluded", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("description", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[BenefitBalance.Financial]]("financial", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class BenefitBalance(
      override val id: Option[String] = None,
      val name: Option[String] = None,
      val unit: Option[CodeableConcept] = None,
      val term: Option[CodeableConcept] = None,
      val network: Option[CodeableConcept] = None,
      val category: CodeableConcept,
      val excluded: Option[Boolean] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val description: Option[String] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val financial: LitSeq[BenefitBalance.Financial] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object AddItem extends CompanionFor[AddItem] {
    override type ResourceType = AddItem
    object Detail extends CompanionFor[Detail] {
      override type ResourceType = Detail
      object SubDetail extends CompanionFor[SubDetail] {
        override type ResourceType = SubDetail
        def apply(
            id: Option[String] = None,
            net: Option[Money] = None,
            factor: Option[BigDecimal] = None,
            modifier: LitSeq[CodeableConcept] = LitSeq.empty,
            quantity: Option[Quantity] = None,
            extension: LitSeq[Extension] = LitSeq.empty,
            unitPrice: Option[Money] = None,
            noteNumber: LitSeq[PositiveInt] = LitSeq.empty,
            adjudication: LitSeq[ExplanationOfBenefit.Item.Adjudication] = LitSeq.empty,
            productOrService: CodeableConcept,
            modifierExtension: LitSeq[Extension] = LitSeq.empty,
            primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
        ): SubDetail = new SubDetail(
          id,
          net,
          factor,
          modifier,
          quantity,
          extension,
          unitPrice,
          noteNumber,
          adjudication,
          productOrService,
          modifierExtension,
          primitiveAttributes = primitiveAttributes
        )
        def unapply(
            o: SubDetail): Option[(Option[String], Option[Money], Option[BigDecimal], LitSeq[CodeableConcept], Option[Quantity], LitSeq[Extension], Option[Money], LitSeq[PositiveInt], LitSeq[ExplanationOfBenefit.Item.Adjudication], CodeableConcept, LitSeq[Extension])] =
          Some(
            (
              o.id,
              o.net,
              o.factor,
              o.modifier,
              o.quantity,
              o.extension,
              o.unitPrice,
              o.noteNumber,
              o.adjudication,
              o.productOrService,
              o.modifierExtension))
        val id: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
        val net: FHIRComponentFieldMeta[Option[Money]] =
          FHIRComponentFieldMeta("net", lTagOf[Option[Money]], false, lTagOf[Money])
        val factor: FHIRComponentFieldMeta[Option[BigDecimal]] =
          FHIRComponentFieldMeta("factor", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
        val modifier: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
          FHIRComponentFieldMeta("modifier", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
        val quantity: FHIRComponentFieldMeta[Option[Quantity]] =
          FHIRComponentFieldMeta("quantity", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
        val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val unitPrice: FHIRComponentFieldMeta[Option[Money]] =
          FHIRComponentFieldMeta("unitPrice", lTagOf[Option[Money]], false, lTagOf[Money])
        val noteNumber: FHIRComponentFieldMeta[LitSeq[PositiveInt]] =
          FHIRComponentFieldMeta("noteNumber", lTagOf[LitSeq[PositiveInt]], false, lTagOf[PositiveInt])
        val adjudication: FHIRComponentFieldMeta[LitSeq[ExplanationOfBenefit.Item.Adjudication]] =
          FHIRComponentFieldMeta(
            "adjudication",
            lTagOf[LitSeq[ExplanationOfBenefit.Item.Adjudication]],
            false,
            lTagOf[ExplanationOfBenefit.Item.Adjudication])
        val productOrService: FHIRComponentFieldMeta[CodeableConcept] =
          FHIRComponentFieldMeta("productOrService", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
        val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
          id,
          net,
          factor,
          modifier,
          quantity,
          extension,
          unitPrice,
          noteNumber,
          adjudication,
          productOrService,
          modifierExtension)
        override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
        override def fields(t: SubDetail): Seq[FHIRComponentField[_]] = Seq(
          FHIRComponentField[Option[String]](id, t.id),
          FHIRComponentField[Option[Money]](net, t.net),
          FHIRComponentField[Option[BigDecimal]](factor, t.factor),
          FHIRComponentField[LitSeq[CodeableConcept]](modifier, t.modifier),
          FHIRComponentField[Option[Quantity]](quantity, t.quantity),
          FHIRComponentField[LitSeq[Extension]](extension, t.extension),
          FHIRComponentField[Option[Money]](unitPrice, t.unitPrice),
          FHIRComponentField[LitSeq[PositiveInt]](noteNumber, t.noteNumber),
          FHIRComponentField[LitSeq[ExplanationOfBenefit.Item.Adjudication]](adjudication, t.adjudication),
          FHIRComponentField[CodeableConcept](productOrService, t.productOrService),
          FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
        )
        val baseType: CompanionFor[SubDetail] = this
        val thisName: String                  = "SubDetail"
        def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[SubDetail] =
          checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
            Try(
              new SubDetail(
                cursor.decodeAs[Option[String]]("id", Some(None)),
                cursor.decodeAs[Option[Money]]("net", Some(None)),
                cursor.decodeAs[Option[BigDecimal]]("factor", Some(None)),
                cursor.decodeAs[LitSeq[CodeableConcept]]("modifier", Some(LitSeq.empty)),
                cursor.decodeAs[Option[Quantity]]("quantity", Some(None)),
                cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
                cursor.decodeAs[Option[Money]]("unitPrice", Some(None)),
                cursor.decodeAs[LitSeq[PositiveInt]]("noteNumber", Some(LitSeq.empty)),
                cursor.decodeAs[LitSeq[ExplanationOfBenefit.Item.Adjudication]]("adjudication", Some(LitSeq.empty)),
                cursor.decodeAs[CodeableConcept]("productOrService", None),
                cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
                decodeAttributes(cursor)
              )
            ))
      }
      @POJOBoilerplate
      class SubDetail(
          override val id: Option[String] = None,
          val net: Option[Money] = None,
          val factor: Option[BigDecimal] = None,
          val modifier: LitSeq[CodeableConcept] = LitSeq.empty,
          val quantity: Option[Quantity] = None,
          override val extension: LitSeq[Extension] = LitSeq.empty,
          val unitPrice: Option[Money] = None,
          val noteNumber: LitSeq[PositiveInt] = LitSeq.empty,
          val adjudication: LitSeq[ExplanationOfBenefit.Item.Adjudication] = LitSeq.empty,
          val productOrService: CodeableConcept,
          override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
          override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
            FHIRObject.emptyAtts)
          extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
      def apply(
          id: Option[String] = None,
          net: Option[Money] = None,
          factor: Option[BigDecimal] = None,
          modifier: LitSeq[CodeableConcept] = LitSeq.empty,
          quantity: Option[Quantity] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          unitPrice: Option[Money] = None,
          noteNumber: LitSeq[PositiveInt] = LitSeq.empty,
          adjudication: LitSeq[ExplanationOfBenefit.Item.Adjudication] = LitSeq.empty,
          productOrService: CodeableConcept,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          subDetail: LitSeq[Detail.SubDetail] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Detail = new Detail(
        id,
        net,
        factor,
        modifier,
        quantity,
        extension,
        unitPrice,
        noteNumber,
        adjudication,
        productOrService,
        modifierExtension,
        subDetail,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Detail): Option[(Option[String], Option[Money], Option[BigDecimal], LitSeq[CodeableConcept], Option[Quantity], LitSeq[Extension], Option[Money], LitSeq[PositiveInt], LitSeq[ExplanationOfBenefit.Item.Adjudication], CodeableConcept, LitSeq[Extension], LitSeq[Detail.SubDetail])] =
        Some(
          (
            o.id,
            o.net,
            o.factor,
            o.modifier,
            o.quantity,
            o.extension,
            o.unitPrice,
            o.noteNumber,
            o.adjudication,
            o.productOrService,
            o.modifierExtension,
            o.subDetail))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val net: FHIRComponentFieldMeta[Option[Money]] =
        FHIRComponentFieldMeta("net", lTagOf[Option[Money]], false, lTagOf[Money])
      val factor: FHIRComponentFieldMeta[Option[BigDecimal]] =
        FHIRComponentFieldMeta("factor", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
      val modifier: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
        FHIRComponentFieldMeta("modifier", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
      val quantity: FHIRComponentFieldMeta[Option[Quantity]] =
        FHIRComponentFieldMeta("quantity", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val unitPrice: FHIRComponentFieldMeta[Option[Money]] =
        FHIRComponentFieldMeta("unitPrice", lTagOf[Option[Money]], false, lTagOf[Money])
      val noteNumber: FHIRComponentFieldMeta[LitSeq[PositiveInt]] =
        FHIRComponentFieldMeta("noteNumber", lTagOf[LitSeq[PositiveInt]], false, lTagOf[PositiveInt])
      val adjudication: FHIRComponentFieldMeta[LitSeq[ExplanationOfBenefit.Item.Adjudication]] =
        FHIRComponentFieldMeta(
          "adjudication",
          lTagOf[LitSeq[ExplanationOfBenefit.Item.Adjudication]],
          false,
          lTagOf[ExplanationOfBenefit.Item.Adjudication])
      val productOrService: FHIRComponentFieldMeta[CodeableConcept] =
        FHIRComponentFieldMeta("productOrService", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val subDetail: FHIRComponentFieldMeta[LitSeq[Detail.SubDetail]] =
        FHIRComponentFieldMeta("subDetail", lTagOf[LitSeq[Detail.SubDetail]], false, lTagOf[Detail.SubDetail])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
        id,
        net,
        factor,
        modifier,
        quantity,
        extension,
        unitPrice,
        noteNumber,
        adjudication,
        productOrService,
        modifierExtension,
        subDetail)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Detail): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[Money]](net, t.net),
        FHIRComponentField[Option[BigDecimal]](factor, t.factor),
        FHIRComponentField[LitSeq[CodeableConcept]](modifier, t.modifier),
        FHIRComponentField[Option[Quantity]](quantity, t.quantity),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[Money]](unitPrice, t.unitPrice),
        FHIRComponentField[LitSeq[PositiveInt]](noteNumber, t.noteNumber),
        FHIRComponentField[LitSeq[ExplanationOfBenefit.Item.Adjudication]](adjudication, t.adjudication),
        FHIRComponentField[CodeableConcept](productOrService, t.productOrService),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
        FHIRComponentField[LitSeq[Detail.SubDetail]](subDetail, t.subDetail)
      )
      val baseType: CompanionFor[Detail] = this
      val thisName: String               = "Detail"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Detail] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Detail(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[Money]]("net", Some(None)),
              cursor.decodeAs[Option[BigDecimal]]("factor", Some(None)),
              cursor.decodeAs[LitSeq[CodeableConcept]]("modifier", Some(LitSeq.empty)),
              cursor.decodeAs[Option[Quantity]]("quantity", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[Money]]("unitPrice", Some(None)),
              cursor.decodeAs[LitSeq[PositiveInt]]("noteNumber", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[ExplanationOfBenefit.Item.Adjudication]]("adjudication", Some(LitSeq.empty)),
              cursor.decodeAs[CodeableConcept]("productOrService", None),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Detail.SubDetail]]("subDetail", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Detail(
        override val id: Option[String] = None,
        val net: Option[Money] = None,
        val factor: Option[BigDecimal] = None,
        val modifier: LitSeq[CodeableConcept] = LitSeq.empty,
        val quantity: Option[Quantity] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val unitPrice: Option[Money] = None,
        val noteNumber: LitSeq[PositiveInt] = LitSeq.empty,
        val adjudication: LitSeq[ExplanationOfBenefit.Item.Adjudication] = LitSeq.empty,
        val productOrService: CodeableConcept,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        val subDetail: LitSeq[Detail.SubDetail] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    type ServicedChoice = Choice[Union_0503196159]
    type LocationChoice = Choice[Union_0316522316]
    def apply(
        id: Option[String] = None,
        net: Option[Money] = None,
        factor: Option[BigDecimal] = None,
        subSite: LitSeq[CodeableConcept] = LitSeq.empty,
        provider: LitSeq[Reference] = LitSeq.empty,
        modifier: LitSeq[CodeableConcept] = LitSeq.empty,
        quantity: Option[Quantity] = None,
        bodySite: Option[CodeableConcept] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        unitPrice: Option[Money] = None,
        noteNumber: LitSeq[PositiveInt] = LitSeq.empty,
        programCode: LitSeq[CodeableConcept] = LitSeq.empty,
        serviced: Option[AddItem.ServicedChoice] = None,
        location: Option[AddItem.LocationChoice] = None,
        itemSequence: LitSeq[PositiveInt] = LitSeq.empty,
        adjudication: LitSeq[ExplanationOfBenefit.Item.Adjudication] = LitSeq.empty,
        detailSequence: LitSeq[PositiveInt] = LitSeq.empty,
        productOrService: CodeableConcept,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        subDetailSequence: LitSeq[PositiveInt] = LitSeq.empty,
        detail: LitSeq[AddItem.Detail] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): AddItem = new AddItem(
      id,
      net,
      factor,
      subSite,
      provider,
      modifier,
      quantity,
      bodySite,
      extension,
      unitPrice,
      noteNumber,
      programCode,
      serviced,
      location,
      itemSequence,
      adjudication,
      detailSequence,
      productOrService,
      modifierExtension,
      subDetailSequence,
      detail,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: AddItem): Option[(Option[String], Option[Money], Option[BigDecimal], LitSeq[CodeableConcept], LitSeq[Reference], LitSeq[CodeableConcept], Option[Quantity], Option[CodeableConcept], LitSeq[Extension], Option[Money], LitSeq[PositiveInt], LitSeq[CodeableConcept], Option[AddItem.ServicedChoice], Option[AddItem.LocationChoice], LitSeq[PositiveInt], LitSeq[ExplanationOfBenefit.Item.Adjudication], LitSeq[PositiveInt], CodeableConcept, LitSeq[Extension], LitSeq[PositiveInt], LitSeq[AddItem.Detail])] =
      Some(
        (
          o.id,
          o.net,
          o.factor,
          o.subSite,
          o.provider,
          o.modifier,
          o.quantity,
          o.bodySite,
          o.extension,
          o.unitPrice,
          o.noteNumber,
          o.programCode,
          o.serviced,
          o.location,
          o.itemSequence,
          o.adjudication,
          o.detailSequence,
          o.productOrService,
          o.modifierExtension,
          o.subDetailSequence,
          o.detail))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val net: FHIRComponentFieldMeta[Option[Money]] =
      FHIRComponentFieldMeta("net", lTagOf[Option[Money]], false, lTagOf[Money])
    val factor: FHIRComponentFieldMeta[Option[BigDecimal]] =
      FHIRComponentFieldMeta("factor", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
    val subSite: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("subSite", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val provider: FHIRComponentFieldMeta[LitSeq[Reference]] =
      FHIRComponentFieldMeta("provider", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
    val modifier: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("modifier", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val quantity: FHIRComponentFieldMeta[Option[Quantity]] =
      FHIRComponentFieldMeta("quantity", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
    val bodySite: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("bodySite", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val unitPrice: FHIRComponentFieldMeta[Option[Money]] =
      FHIRComponentFieldMeta("unitPrice", lTagOf[Option[Money]], false, lTagOf[Money])
    val noteNumber: FHIRComponentFieldMeta[LitSeq[PositiveInt]] =
      FHIRComponentFieldMeta("noteNumber", lTagOf[LitSeq[PositiveInt]], false, lTagOf[PositiveInt])
    val programCode: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("programCode", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val serviced: FHIRComponentFieldMeta[Option[AddItem.ServicedChoice]] =
      FHIRComponentFieldMeta("serviced", lTagOf[Option[AddItem.ServicedChoice]], true, lTagOf[Union_0503196159])
    val location: FHIRComponentFieldMeta[Option[AddItem.LocationChoice]] =
      FHIRComponentFieldMeta("location", lTagOf[Option[AddItem.LocationChoice]], true, lTagOf[Union_0316522316])
    val itemSequence: FHIRComponentFieldMeta[LitSeq[PositiveInt]] =
      FHIRComponentFieldMeta("itemSequence", lTagOf[LitSeq[PositiveInt]], false, lTagOf[PositiveInt])
    val adjudication: FHIRComponentFieldMeta[LitSeq[ExplanationOfBenefit.Item.Adjudication]] =
      FHIRComponentFieldMeta(
        "adjudication",
        lTagOf[LitSeq[ExplanationOfBenefit.Item.Adjudication]],
        false,
        lTagOf[ExplanationOfBenefit.Item.Adjudication])
    val detailSequence: FHIRComponentFieldMeta[LitSeq[PositiveInt]] =
      FHIRComponentFieldMeta("detailSequence", lTagOf[LitSeq[PositiveInt]], false, lTagOf[PositiveInt])
    val productOrService: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("productOrService", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val subDetailSequence: FHIRComponentFieldMeta[LitSeq[PositiveInt]] =
      FHIRComponentFieldMeta("subDetailSequence", lTagOf[LitSeq[PositiveInt]], false, lTagOf[PositiveInt])
    val detail: FHIRComponentFieldMeta[LitSeq[AddItem.Detail]] =
      FHIRComponentFieldMeta("detail", lTagOf[LitSeq[AddItem.Detail]], false, lTagOf[AddItem.Detail])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
      id,
      net,
      factor,
      subSite,
      provider,
      modifier,
      quantity,
      bodySite,
      extension,
      unitPrice,
      noteNumber,
      programCode,
      serviced,
      location,
      itemSequence,
      adjudication,
      detailSequence,
      productOrService,
      modifierExtension,
      subDetailSequence,
      detail
    )
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: AddItem): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Money]](net, t.net),
      FHIRComponentField[Option[BigDecimal]](factor, t.factor),
      FHIRComponentField[LitSeq[CodeableConcept]](subSite, t.subSite),
      FHIRComponentField[LitSeq[Reference]](provider, t.provider),
      FHIRComponentField[LitSeq[CodeableConcept]](modifier, t.modifier),
      FHIRComponentField[Option[Quantity]](quantity, t.quantity),
      FHIRComponentField[Option[CodeableConcept]](bodySite, t.bodySite),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Money]](unitPrice, t.unitPrice),
      FHIRComponentField[LitSeq[PositiveInt]](noteNumber, t.noteNumber),
      FHIRComponentField[LitSeq[CodeableConcept]](programCode, t.programCode),
      FHIRComponentField[Option[AddItem.ServicedChoice]](serviced, t.serviced),
      FHIRComponentField[Option[AddItem.LocationChoice]](location, t.location),
      FHIRComponentField[LitSeq[PositiveInt]](itemSequence, t.itemSequence),
      FHIRComponentField[LitSeq[ExplanationOfBenefit.Item.Adjudication]](adjudication, t.adjudication),
      FHIRComponentField[LitSeq[PositiveInt]](detailSequence, t.detailSequence),
      FHIRComponentField[CodeableConcept](productOrService, t.productOrService),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[PositiveInt]](subDetailSequence, t.subDetailSequence),
      FHIRComponentField[LitSeq[AddItem.Detail]](detail, t.detail)
    )
    val baseType: CompanionFor[AddItem] = this
    val thisName: String                = "AddItem"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[AddItem] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new AddItem(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[Money]]("net", Some(None)),
            cursor.decodeAs[Option[BigDecimal]]("factor", Some(None)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("subSite", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Reference]]("provider", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("modifier", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Quantity]]("quantity", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("bodySite", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Money]]("unitPrice", Some(None)),
            cursor.decodeAs[LitSeq[PositiveInt]]("noteNumber", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("programCode", Some(LitSeq.empty)),
            cursor.decodeOptRef[Union_0503196159]("serviced"),
            cursor.decodeOptRef[Union_0316522316]("location"),
            cursor.decodeAs[LitSeq[PositiveInt]]("itemSequence", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[ExplanationOfBenefit.Item.Adjudication]]("adjudication", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[PositiveInt]]("detailSequence", Some(LitSeq.empty)),
            cursor.decodeAs[CodeableConcept]("productOrService", None),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[PositiveInt]]("subDetailSequence", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[AddItem.Detail]]("detail", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class AddItem(
      override val id: Option[String] = None,
      val net: Option[Money] = None,
      val factor: Option[BigDecimal] = None,
      val subSite: LitSeq[CodeableConcept] = LitSeq.empty,
      val provider: LitSeq[Reference] = LitSeq.empty,
      val modifier: LitSeq[CodeableConcept] = LitSeq.empty,
      val quantity: Option[Quantity] = None,
      val bodySite: Option[CodeableConcept] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val unitPrice: Option[Money] = None,
      val noteNumber: LitSeq[PositiveInt] = LitSeq.empty,
      val programCode: LitSeq[CodeableConcept] = LitSeq.empty,
      val serviced: Option[AddItem.ServicedChoice] = None,
      val location: Option[AddItem.LocationChoice] = None,
      val itemSequence: LitSeq[PositiveInt] = LitSeq.empty,
      val adjudication: LitSeq[ExplanationOfBenefit.Item.Adjudication] = LitSeq.empty,
      val detailSequence: LitSeq[PositiveInt] = LitSeq.empty,
      val productOrService: CodeableConcept,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val subDetailSequence: LitSeq[PositiveInt] = LitSeq.empty,
      val detail: LitSeq[AddItem.Detail] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Item extends CompanionFor[Item] {
    override type ResourceType = Item
    object Adjudication extends CompanionFor[Adjudication] {
      override type ResourceType = Adjudication
      def apply(
          id: Option[String] = None,
          value: Option[BigDecimal] = None,
          reason: Option[CodeableConcept] = None,
          amount: Option[Money] = None,
          category: CodeableConcept,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Adjudication = new Adjudication(
        id,
        value,
        reason,
        amount,
        category,
        extension,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Adjudication): Option[(Option[String], Option[BigDecimal], Option[CodeableConcept], Option[Money], CodeableConcept, LitSeq[Extension], LitSeq[Extension])] =
        Some((o.id, o.value, o.reason, o.amount, o.category, o.extension, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val value: FHIRComponentFieldMeta[Option[BigDecimal]] =
        FHIRComponentFieldMeta("value", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
      val reason: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("reason", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val amount: FHIRComponentFieldMeta[Option[Money]] =
        FHIRComponentFieldMeta("amount", lTagOf[Option[Money]], false, lTagOf[Money])
      val category: FHIRComponentFieldMeta[CodeableConcept] =
        FHIRComponentFieldMeta("category", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
        Seq(id, value, reason, amount, category, extension, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Adjudication): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[BigDecimal]](value, t.value),
        FHIRComponentField[Option[CodeableConcept]](reason, t.reason),
        FHIRComponentField[Option[Money]](amount, t.amount),
        FHIRComponentField[CodeableConcept](category, t.category),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Adjudication] = this
      val thisName: String                     = "Adjudication"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Adjudication] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Adjudication(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[BigDecimal]]("value", Some(None)),
              cursor.decodeAs[Option[CodeableConcept]]("reason", Some(None)),
              cursor.decodeAs[Option[Money]]("amount", Some(None)),
              cursor.decodeAs[CodeableConcept]("category", None),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Adjudication(
        override val id: Option[String] = None,
        val value: Option[BigDecimal] = None,
        val reason: Option[CodeableConcept] = None,
        val amount: Option[Money] = None,
        val category: CodeableConcept,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object Detail extends CompanionFor[Detail] {
      override type ResourceType = Detail
      object SubDetail extends CompanionFor[SubDetail] {
        override type ResourceType = SubDetail
        def apply(
            id: Option[String] = None,
            net: Option[Money] = None,
            udi: LitSeq[Reference] = LitSeq.empty,
            factor: Option[BigDecimal] = None,
            revenue: Option[CodeableConcept] = None,
            sequence: PositiveInt,
            category: Option[CodeableConcept] = None,
            modifier: LitSeq[CodeableConcept] = LitSeq.empty,
            quantity: Option[Quantity] = None,
            extension: LitSeq[Extension] = LitSeq.empty,
            unitPrice: Option[Money] = None,
            noteNumber: LitSeq[PositiveInt] = LitSeq.empty,
            programCode: LitSeq[CodeableConcept] = LitSeq.empty,
            adjudication: LitSeq[ExplanationOfBenefit.Item.Adjudication] = LitSeq.empty,
            productOrService: CodeableConcept,
            modifierExtension: LitSeq[Extension] = LitSeq.empty,
            primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
        ): SubDetail = new SubDetail(
          id,
          net,
          udi,
          factor,
          revenue,
          sequence,
          category,
          modifier,
          quantity,
          extension,
          unitPrice,
          noteNumber,
          programCode,
          adjudication,
          productOrService,
          modifierExtension,
          primitiveAttributes = primitiveAttributes
        )
        def unapply(
            o: SubDetail): Option[(Option[String], Option[Money], LitSeq[Reference], Option[BigDecimal], Option[CodeableConcept], PositiveInt, Option[CodeableConcept], LitSeq[CodeableConcept], Option[Quantity], LitSeq[Extension], Option[Money], LitSeq[PositiveInt], LitSeq[CodeableConcept], LitSeq[ExplanationOfBenefit.Item.Adjudication], CodeableConcept, LitSeq[Extension])] =
          Some(
            (
              o.id,
              o.net,
              o.udi,
              o.factor,
              o.revenue,
              o.sequence,
              o.category,
              o.modifier,
              o.quantity,
              o.extension,
              o.unitPrice,
              o.noteNumber,
              o.programCode,
              o.adjudication,
              o.productOrService,
              o.modifierExtension))
        val id: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
        val net: FHIRComponentFieldMeta[Option[Money]] =
          FHIRComponentFieldMeta("net", lTagOf[Option[Money]], false, lTagOf[Money])
        val udi: FHIRComponentFieldMeta[LitSeq[Reference]] =
          FHIRComponentFieldMeta("udi", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
        val factor: FHIRComponentFieldMeta[Option[BigDecimal]] =
          FHIRComponentFieldMeta("factor", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
        val revenue: FHIRComponentFieldMeta[Option[CodeableConcept]] =
          FHIRComponentFieldMeta("revenue", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
        val sequence: FHIRComponentFieldMeta[PositiveInt] =
          FHIRComponentFieldMeta("sequence", lTagOf[PositiveInt], false, lTagOf[PositiveInt])
        val category: FHIRComponentFieldMeta[Option[CodeableConcept]] =
          FHIRComponentFieldMeta("category", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
        val modifier: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
          FHIRComponentFieldMeta("modifier", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
        val quantity: FHIRComponentFieldMeta[Option[Quantity]] =
          FHIRComponentFieldMeta("quantity", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
        val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val unitPrice: FHIRComponentFieldMeta[Option[Money]] =
          FHIRComponentFieldMeta("unitPrice", lTagOf[Option[Money]], false, lTagOf[Money])
        val noteNumber: FHIRComponentFieldMeta[LitSeq[PositiveInt]] =
          FHIRComponentFieldMeta("noteNumber", lTagOf[LitSeq[PositiveInt]], false, lTagOf[PositiveInt])
        val programCode: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
          FHIRComponentFieldMeta("programCode", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
        val adjudication: FHIRComponentFieldMeta[LitSeq[ExplanationOfBenefit.Item.Adjudication]] =
          FHIRComponentFieldMeta(
            "adjudication",
            lTagOf[LitSeq[ExplanationOfBenefit.Item.Adjudication]],
            false,
            lTagOf[ExplanationOfBenefit.Item.Adjudication])
        val productOrService: FHIRComponentFieldMeta[CodeableConcept] =
          FHIRComponentFieldMeta("productOrService", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
        val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
          id,
          net,
          udi,
          factor,
          revenue,
          sequence,
          category,
          modifier,
          quantity,
          extension,
          unitPrice,
          noteNumber,
          programCode,
          adjudication,
          productOrService,
          modifierExtension
        )
        override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
        override def fields(t: SubDetail): Seq[FHIRComponentField[_]] = Seq(
          FHIRComponentField[Option[String]](id, t.id),
          FHIRComponentField[Option[Money]](net, t.net),
          FHIRComponentField[LitSeq[Reference]](udi, t.udi),
          FHIRComponentField[Option[BigDecimal]](factor, t.factor),
          FHIRComponentField[Option[CodeableConcept]](revenue, t.revenue),
          FHIRComponentField[PositiveInt](sequence, t.sequence),
          FHIRComponentField[Option[CodeableConcept]](category, t.category),
          FHIRComponentField[LitSeq[CodeableConcept]](modifier, t.modifier),
          FHIRComponentField[Option[Quantity]](quantity, t.quantity),
          FHIRComponentField[LitSeq[Extension]](extension, t.extension),
          FHIRComponentField[Option[Money]](unitPrice, t.unitPrice),
          FHIRComponentField[LitSeq[PositiveInt]](noteNumber, t.noteNumber),
          FHIRComponentField[LitSeq[CodeableConcept]](programCode, t.programCode),
          FHIRComponentField[LitSeq[ExplanationOfBenefit.Item.Adjudication]](adjudication, t.adjudication),
          FHIRComponentField[CodeableConcept](productOrService, t.productOrService),
          FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
        )
        val baseType: CompanionFor[SubDetail] = this
        val thisName: String                  = "SubDetail"
        def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[SubDetail] =
          checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
            Try(
              new SubDetail(
                cursor.decodeAs[Option[String]]("id", Some(None)),
                cursor.decodeAs[Option[Money]]("net", Some(None)),
                cursor.decodeAs[LitSeq[Reference]]("udi", Some(LitSeq.empty)),
                cursor.decodeAs[Option[BigDecimal]]("factor", Some(None)),
                cursor.decodeAs[Option[CodeableConcept]]("revenue", Some(None)),
                cursor.decodeAs[PositiveInt]("sequence", None),
                cursor.decodeAs[Option[CodeableConcept]]("category", Some(None)),
                cursor.decodeAs[LitSeq[CodeableConcept]]("modifier", Some(LitSeq.empty)),
                cursor.decodeAs[Option[Quantity]]("quantity", Some(None)),
                cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
                cursor.decodeAs[Option[Money]]("unitPrice", Some(None)),
                cursor.decodeAs[LitSeq[PositiveInt]]("noteNumber", Some(LitSeq.empty)),
                cursor.decodeAs[LitSeq[CodeableConcept]]("programCode", Some(LitSeq.empty)),
                cursor.decodeAs[LitSeq[ExplanationOfBenefit.Item.Adjudication]]("adjudication", Some(LitSeq.empty)),
                cursor.decodeAs[CodeableConcept]("productOrService", None),
                cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
                decodeAttributes(cursor)
              )
            ))
      }
      @POJOBoilerplate
      class SubDetail(
          override val id: Option[String] = None,
          val net: Option[Money] = None,
          val udi: LitSeq[Reference] = LitSeq.empty,
          val factor: Option[BigDecimal] = None,
          val revenue: Option[CodeableConcept] = None,
          val sequence: PositiveInt,
          val category: Option[CodeableConcept] = None,
          val modifier: LitSeq[CodeableConcept] = LitSeq.empty,
          val quantity: Option[Quantity] = None,
          override val extension: LitSeq[Extension] = LitSeq.empty,
          val unitPrice: Option[Money] = None,
          val noteNumber: LitSeq[PositiveInt] = LitSeq.empty,
          val programCode: LitSeq[CodeableConcept] = LitSeq.empty,
          val adjudication: LitSeq[ExplanationOfBenefit.Item.Adjudication] = LitSeq.empty,
          val productOrService: CodeableConcept,
          override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
          override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
            FHIRObject.emptyAtts)
          extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
      def apply(
          id: Option[String] = None,
          net: Option[Money] = None,
          udi: LitSeq[Reference] = LitSeq.empty,
          factor: Option[BigDecimal] = None,
          revenue: Option[CodeableConcept] = None,
          sequence: PositiveInt,
          category: Option[CodeableConcept] = None,
          modifier: LitSeq[CodeableConcept] = LitSeq.empty,
          quantity: Option[Quantity] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          unitPrice: Option[Money] = None,
          noteNumber: LitSeq[PositiveInt] = LitSeq.empty,
          programCode: LitSeq[CodeableConcept] = LitSeq.empty,
          adjudication: LitSeq[ExplanationOfBenefit.Item.Adjudication] = LitSeq.empty,
          productOrService: CodeableConcept,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          subDetail: LitSeq[Detail.SubDetail] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Detail = new Detail(
        id,
        net,
        udi,
        factor,
        revenue,
        sequence,
        category,
        modifier,
        quantity,
        extension,
        unitPrice,
        noteNumber,
        programCode,
        adjudication,
        productOrService,
        modifierExtension,
        subDetail,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Detail): Option[(Option[String], Option[Money], LitSeq[Reference], Option[BigDecimal], Option[CodeableConcept], PositiveInt, Option[CodeableConcept], LitSeq[CodeableConcept], Option[Quantity], LitSeq[Extension], Option[Money], LitSeq[PositiveInt], LitSeq[CodeableConcept], LitSeq[ExplanationOfBenefit.Item.Adjudication], CodeableConcept, LitSeq[Extension], LitSeq[Detail.SubDetail])] =
        Some(
          (
            o.id,
            o.net,
            o.udi,
            o.factor,
            o.revenue,
            o.sequence,
            o.category,
            o.modifier,
            o.quantity,
            o.extension,
            o.unitPrice,
            o.noteNumber,
            o.programCode,
            o.adjudication,
            o.productOrService,
            o.modifierExtension,
            o.subDetail))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val net: FHIRComponentFieldMeta[Option[Money]] =
        FHIRComponentFieldMeta("net", lTagOf[Option[Money]], false, lTagOf[Money])
      val udi: FHIRComponentFieldMeta[LitSeq[Reference]] =
        FHIRComponentFieldMeta("udi", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
      val factor: FHIRComponentFieldMeta[Option[BigDecimal]] =
        FHIRComponentFieldMeta("factor", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
      val revenue: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("revenue", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val sequence: FHIRComponentFieldMeta[PositiveInt] =
        FHIRComponentFieldMeta("sequence", lTagOf[PositiveInt], false, lTagOf[PositiveInt])
      val category: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("category", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val modifier: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
        FHIRComponentFieldMeta("modifier", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
      val quantity: FHIRComponentFieldMeta[Option[Quantity]] =
        FHIRComponentFieldMeta("quantity", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val unitPrice: FHIRComponentFieldMeta[Option[Money]] =
        FHIRComponentFieldMeta("unitPrice", lTagOf[Option[Money]], false, lTagOf[Money])
      val noteNumber: FHIRComponentFieldMeta[LitSeq[PositiveInt]] =
        FHIRComponentFieldMeta("noteNumber", lTagOf[LitSeq[PositiveInt]], false, lTagOf[PositiveInt])
      val programCode: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
        FHIRComponentFieldMeta("programCode", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
      val adjudication: FHIRComponentFieldMeta[LitSeq[ExplanationOfBenefit.Item.Adjudication]] =
        FHIRComponentFieldMeta(
          "adjudication",
          lTagOf[LitSeq[ExplanationOfBenefit.Item.Adjudication]],
          false,
          lTagOf[ExplanationOfBenefit.Item.Adjudication])
      val productOrService: FHIRComponentFieldMeta[CodeableConcept] =
        FHIRComponentFieldMeta("productOrService", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val subDetail: FHIRComponentFieldMeta[LitSeq[Detail.SubDetail]] =
        FHIRComponentFieldMeta("subDetail", lTagOf[LitSeq[Detail.SubDetail]], false, lTagOf[Detail.SubDetail])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
        id,
        net,
        udi,
        factor,
        revenue,
        sequence,
        category,
        modifier,
        quantity,
        extension,
        unitPrice,
        noteNumber,
        programCode,
        adjudication,
        productOrService,
        modifierExtension,
        subDetail
      )
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Detail): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[Money]](net, t.net),
        FHIRComponentField[LitSeq[Reference]](udi, t.udi),
        FHIRComponentField[Option[BigDecimal]](factor, t.factor),
        FHIRComponentField[Option[CodeableConcept]](revenue, t.revenue),
        FHIRComponentField[PositiveInt](sequence, t.sequence),
        FHIRComponentField[Option[CodeableConcept]](category, t.category),
        FHIRComponentField[LitSeq[CodeableConcept]](modifier, t.modifier),
        FHIRComponentField[Option[Quantity]](quantity, t.quantity),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[Money]](unitPrice, t.unitPrice),
        FHIRComponentField[LitSeq[PositiveInt]](noteNumber, t.noteNumber),
        FHIRComponentField[LitSeq[CodeableConcept]](programCode, t.programCode),
        FHIRComponentField[LitSeq[ExplanationOfBenefit.Item.Adjudication]](adjudication, t.adjudication),
        FHIRComponentField[CodeableConcept](productOrService, t.productOrService),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
        FHIRComponentField[LitSeq[Detail.SubDetail]](subDetail, t.subDetail)
      )
      val baseType: CompanionFor[Detail] = this
      val thisName: String               = "Detail"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Detail] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Detail(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[Money]]("net", Some(None)),
              cursor.decodeAs[LitSeq[Reference]]("udi", Some(LitSeq.empty)),
              cursor.decodeAs[Option[BigDecimal]]("factor", Some(None)),
              cursor.decodeAs[Option[CodeableConcept]]("revenue", Some(None)),
              cursor.decodeAs[PositiveInt]("sequence", None),
              cursor.decodeAs[Option[CodeableConcept]]("category", Some(None)),
              cursor.decodeAs[LitSeq[CodeableConcept]]("modifier", Some(LitSeq.empty)),
              cursor.decodeAs[Option[Quantity]]("quantity", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[Money]]("unitPrice", Some(None)),
              cursor.decodeAs[LitSeq[PositiveInt]]("noteNumber", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[CodeableConcept]]("programCode", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[ExplanationOfBenefit.Item.Adjudication]]("adjudication", Some(LitSeq.empty)),
              cursor.decodeAs[CodeableConcept]("productOrService", None),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Detail.SubDetail]]("subDetail", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Detail(
        override val id: Option[String] = None,
        val net: Option[Money] = None,
        val udi: LitSeq[Reference] = LitSeq.empty,
        val factor: Option[BigDecimal] = None,
        val revenue: Option[CodeableConcept] = None,
        val sequence: PositiveInt,
        val category: Option[CodeableConcept] = None,
        val modifier: LitSeq[CodeableConcept] = LitSeq.empty,
        val quantity: Option[Quantity] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val unitPrice: Option[Money] = None,
        val noteNumber: LitSeq[PositiveInt] = LitSeq.empty,
        val programCode: LitSeq[CodeableConcept] = LitSeq.empty,
        val adjudication: LitSeq[ExplanationOfBenefit.Item.Adjudication] = LitSeq.empty,
        val productOrService: CodeableConcept,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        val subDetail: LitSeq[Detail.SubDetail] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    type ServicedChoice = Choice[Union_0503196159]
    type LocationChoice = Choice[Union_0316522316]
    def apply(
        id: Option[String] = None,
        net: Option[Money] = None,
        udi: LitSeq[Reference] = LitSeq.empty,
        factor: Option[BigDecimal] = None,
        revenue: Option[CodeableConcept] = None,
        subSite: LitSeq[CodeableConcept] = LitSeq.empty,
        sequence: PositiveInt,
        category: Option[CodeableConcept] = None,
        modifier: LitSeq[CodeableConcept] = LitSeq.empty,
        quantity: Option[Quantity] = None,
        bodySite: Option[CodeableConcept] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        unitPrice: Option[Money] = None,
        encounter: LitSeq[Reference] = LitSeq.empty,
        noteNumber: LitSeq[PositiveInt] = LitSeq.empty,
        programCode: LitSeq[CodeableConcept] = LitSeq.empty,
        serviced: Option[Item.ServicedChoice] = None,
        location: Option[Item.LocationChoice] = None,
        careTeamSequence: LitSeq[PositiveInt] = LitSeq.empty,
        productOrService: CodeableConcept,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        diagnosisSequence: LitSeq[PositiveInt] = LitSeq.empty,
        procedureSequence: LitSeq[PositiveInt] = LitSeq.empty,
        informationSequence: LitSeq[PositiveInt] = LitSeq.empty,
        adjudication: LitSeq[Item.Adjudication] = LitSeq.empty,
        detail: LitSeq[Item.Detail] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Item = new Item(
      id,
      net,
      udi,
      factor,
      revenue,
      subSite,
      sequence,
      category,
      modifier,
      quantity,
      bodySite,
      extension,
      unitPrice,
      encounter,
      noteNumber,
      programCode,
      serviced,
      location,
      careTeamSequence,
      productOrService,
      modifierExtension,
      diagnosisSequence,
      procedureSequence,
      informationSequence,
      adjudication,
      detail,
      primitiveAttributes = primitiveAttributes
    )
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val net: FHIRComponentFieldMeta[Option[Money]] =
      FHIRComponentFieldMeta("net", lTagOf[Option[Money]], false, lTagOf[Money])
    val udi: FHIRComponentFieldMeta[LitSeq[Reference]] =
      FHIRComponentFieldMeta("udi", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
    val factor: FHIRComponentFieldMeta[Option[BigDecimal]] =
      FHIRComponentFieldMeta("factor", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
    val revenue: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("revenue", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val subSite: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("subSite", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val sequence: FHIRComponentFieldMeta[PositiveInt] =
      FHIRComponentFieldMeta("sequence", lTagOf[PositiveInt], false, lTagOf[PositiveInt])
    val category: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("category", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val modifier: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("modifier", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val quantity: FHIRComponentFieldMeta[Option[Quantity]] =
      FHIRComponentFieldMeta("quantity", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
    val bodySite: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("bodySite", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val unitPrice: FHIRComponentFieldMeta[Option[Money]] =
      FHIRComponentFieldMeta("unitPrice", lTagOf[Option[Money]], false, lTagOf[Money])
    val encounter: FHIRComponentFieldMeta[LitSeq[Reference]] =
      FHIRComponentFieldMeta("encounter", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
    val noteNumber: FHIRComponentFieldMeta[LitSeq[PositiveInt]] =
      FHIRComponentFieldMeta("noteNumber", lTagOf[LitSeq[PositiveInt]], false, lTagOf[PositiveInt])
    val programCode: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("programCode", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val serviced: FHIRComponentFieldMeta[Option[Item.ServicedChoice]] =
      FHIRComponentFieldMeta("serviced", lTagOf[Option[Item.ServicedChoice]], true, lTagOf[Union_0503196159])
    val location: FHIRComponentFieldMeta[Option[Item.LocationChoice]] =
      FHIRComponentFieldMeta("location", lTagOf[Option[Item.LocationChoice]], true, lTagOf[Union_0316522316])
    val careTeamSequence: FHIRComponentFieldMeta[LitSeq[PositiveInt]] =
      FHIRComponentFieldMeta("careTeamSequence", lTagOf[LitSeq[PositiveInt]], false, lTagOf[PositiveInt])
    val productOrService: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("productOrService", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val diagnosisSequence: FHIRComponentFieldMeta[LitSeq[PositiveInt]] =
      FHIRComponentFieldMeta("diagnosisSequence", lTagOf[LitSeq[PositiveInt]], false, lTagOf[PositiveInt])
    val procedureSequence: FHIRComponentFieldMeta[LitSeq[PositiveInt]] =
      FHIRComponentFieldMeta("procedureSequence", lTagOf[LitSeq[PositiveInt]], false, lTagOf[PositiveInt])
    val informationSequence: FHIRComponentFieldMeta[LitSeq[PositiveInt]] =
      FHIRComponentFieldMeta("informationSequence", lTagOf[LitSeq[PositiveInt]], false, lTagOf[PositiveInt])
    val adjudication: FHIRComponentFieldMeta[LitSeq[Item.Adjudication]] =
      FHIRComponentFieldMeta("adjudication", lTagOf[LitSeq[Item.Adjudication]], false, lTagOf[Item.Adjudication])
    val detail: FHIRComponentFieldMeta[LitSeq[Item.Detail]] =
      FHIRComponentFieldMeta("detail", lTagOf[LitSeq[Item.Detail]], false, lTagOf[Item.Detail])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
      id,
      net,
      udi,
      factor,
      revenue,
      subSite,
      sequence,
      category,
      modifier,
      quantity,
      bodySite,
      extension,
      unitPrice,
      encounter,
      noteNumber,
      programCode,
      serviced,
      location,
      careTeamSequence,
      productOrService,
      modifierExtension,
      diagnosisSequence,
      procedureSequence,
      informationSequence,
      adjudication,
      detail
    )
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Item): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Money]](net, t.net),
      FHIRComponentField[LitSeq[Reference]](udi, t.udi),
      FHIRComponentField[Option[BigDecimal]](factor, t.factor),
      FHIRComponentField[Option[CodeableConcept]](revenue, t.revenue),
      FHIRComponentField[LitSeq[CodeableConcept]](subSite, t.subSite),
      FHIRComponentField[PositiveInt](sequence, t.sequence),
      FHIRComponentField[Option[CodeableConcept]](category, t.category),
      FHIRComponentField[LitSeq[CodeableConcept]](modifier, t.modifier),
      FHIRComponentField[Option[Quantity]](quantity, t.quantity),
      FHIRComponentField[Option[CodeableConcept]](bodySite, t.bodySite),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Money]](unitPrice, t.unitPrice),
      FHIRComponentField[LitSeq[Reference]](encounter, t.encounter),
      FHIRComponentField[LitSeq[PositiveInt]](noteNumber, t.noteNumber),
      FHIRComponentField[LitSeq[CodeableConcept]](programCode, t.programCode),
      FHIRComponentField[Option[Item.ServicedChoice]](serviced, t.serviced),
      FHIRComponentField[Option[Item.LocationChoice]](location, t.location),
      FHIRComponentField[LitSeq[PositiveInt]](careTeamSequence, t.careTeamSequence),
      FHIRComponentField[CodeableConcept](productOrService, t.productOrService),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[PositiveInt]](diagnosisSequence, t.diagnosisSequence),
      FHIRComponentField[LitSeq[PositiveInt]](procedureSequence, t.procedureSequence),
      FHIRComponentField[LitSeq[PositiveInt]](informationSequence, t.informationSequence),
      FHIRComponentField[LitSeq[Item.Adjudication]](adjudication, t.adjudication),
      FHIRComponentField[LitSeq[Item.Detail]](detail, t.detail)
    )
    val baseType: CompanionFor[Item] = this
    val thisName: String             = "Item"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Item] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Item(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[Money]]("net", Some(None)),
            cursor.decodeAs[LitSeq[Reference]]("udi", Some(LitSeq.empty)),
            cursor.decodeAs[Option[BigDecimal]]("factor", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("revenue", Some(None)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("subSite", Some(LitSeq.empty)),
            cursor.decodeAs[PositiveInt]("sequence", None),
            cursor.decodeAs[Option[CodeableConcept]]("category", Some(None)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("modifier", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Quantity]]("quantity", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("bodySite", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Money]]("unitPrice", Some(None)),
            cursor.decodeAs[LitSeq[Reference]]("encounter", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[PositiveInt]]("noteNumber", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("programCode", Some(LitSeq.empty)),
            cursor.decodeOptRef[Union_0503196159]("serviced"),
            cursor.decodeOptRef[Union_0316522316]("location"),
            cursor.decodeAs[LitSeq[PositiveInt]]("careTeamSequence", Some(LitSeq.empty)),
            cursor.decodeAs[CodeableConcept]("productOrService", None),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[PositiveInt]]("diagnosisSequence", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[PositiveInt]]("procedureSequence", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[PositiveInt]]("informationSequence", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Item.Adjudication]]("adjudication", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Item.Detail]]("detail", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Item(
      override val id: Option[String] = None,
      val net: Option[Money] = None,
      val udi: LitSeq[Reference] = LitSeq.empty,
      val factor: Option[BigDecimal] = None,
      val revenue: Option[CodeableConcept] = None,
      val subSite: LitSeq[CodeableConcept] = LitSeq.empty,
      val sequence: PositiveInt,
      val category: Option[CodeableConcept] = None,
      val modifier: LitSeq[CodeableConcept] = LitSeq.empty,
      val quantity: Option[Quantity] = None,
      val bodySite: Option[CodeableConcept] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val unitPrice: Option[Money] = None,
      val encounter: LitSeq[Reference] = LitSeq.empty,
      val noteNumber: LitSeq[PositiveInt] = LitSeq.empty,
      val programCode: LitSeq[CodeableConcept] = LitSeq.empty,
      val serviced: Option[Item.ServicedChoice] = None,
      val location: Option[Item.LocationChoice] = None,
      val careTeamSequence: LitSeq[PositiveInt] = LitSeq.empty,
      val productOrService: CodeableConcept,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val diagnosisSequence: LitSeq[PositiveInt] = LitSeq.empty,
      val procedureSequence: LitSeq[PositiveInt] = LitSeq.empty,
      val informationSequence: LitSeq[PositiveInt] = LitSeq.empty,
      val adjudication: LitSeq[Item.Adjudication] = LitSeq.empty,
      val detail: LitSeq[Item.Detail] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object SupportingInfo extends CompanionFor[SupportingInfo] {
    override type ResourceType = SupportingInfo
    type ValueChoice           = Choice[Union_0543144563]
    type TimingChoice          = Choice[Union_0503196159]
    def apply(
        id: Option[String] = None,
        code: Option[CodeableConcept] = None,
        reason: Option[Coding] = None,
        sequence: PositiveInt,
        category: CodeableConcept,
        value: Option[SupportingInfo.ValueChoice] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        timing: Option[SupportingInfo.TimingChoice] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): SupportingInfo = new SupportingInfo(
      id,
      code,
      reason,
      sequence,
      category,
      value,
      extension,
      timing,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: SupportingInfo): Option[(Option[String], Option[CodeableConcept], Option[Coding], PositiveInt, CodeableConcept, Option[SupportingInfo.ValueChoice], LitSeq[Extension], Option[SupportingInfo.TimingChoice], LitSeq[Extension])] =
      Some((o.id, o.code, o.reason, o.sequence, o.category, o.value, o.extension, o.timing, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val code: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("code", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val reason: FHIRComponentFieldMeta[Option[Coding]] =
      FHIRComponentFieldMeta("reason", lTagOf[Option[Coding]], false, lTagOf[Coding])
    val sequence: FHIRComponentFieldMeta[PositiveInt] =
      FHIRComponentFieldMeta("sequence", lTagOf[PositiveInt], false, lTagOf[PositiveInt])
    val category: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("category", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val value: FHIRComponentFieldMeta[Option[SupportingInfo.ValueChoice]] =
      FHIRComponentFieldMeta("value", lTagOf[Option[SupportingInfo.ValueChoice]], true, lTagOf[Union_0543144563])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val timing: FHIRComponentFieldMeta[Option[SupportingInfo.TimingChoice]] =
      FHIRComponentFieldMeta("timing", lTagOf[Option[SupportingInfo.TimingChoice]], true, lTagOf[Union_0503196159])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, code, reason, sequence, category, value, extension, timing, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: SupportingInfo): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](code, t.code),
      FHIRComponentField[Option[Coding]](reason, t.reason),
      FHIRComponentField[PositiveInt](sequence, t.sequence),
      FHIRComponentField[CodeableConcept](category, t.category),
      FHIRComponentField[Option[SupportingInfo.ValueChoice]](value, t.value),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[SupportingInfo.TimingChoice]](timing, t.timing),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[SupportingInfo] = this
    val thisName: String                       = "SupportingInfo"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[SupportingInfo] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new SupportingInfo(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("code", Some(None)),
            cursor.decodeAs[Option[Coding]]("reason", Some(None)),
            cursor.decodeAs[PositiveInt]("sequence", None),
            cursor.decodeAs[CodeableConcept]("category", None),
            cursor.decodeOptRef[Union_0543144563]("value"),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeOptRef[Union_0503196159]("timing"),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class SupportingInfo(
      override val id: Option[String] = None,
      val code: Option[CodeableConcept] = None,
      val reason: Option[Coding] = None,
      val sequence: PositiveInt,
      val category: CodeableConcept,
      val value: Option[SupportingInfo.ValueChoice] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val timing: Option[SupportingInfo.TimingChoice] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object ProcessNote extends CompanionFor[ProcessNote] {
    override type ResourceType = ProcessNote
    def apply(
        id: Option[String] = None,
        `type`: Option[NOTE_TYPE] = None,
        text: Option[String] = None,
        number: Option[PositiveInt] = None,
        language: Option[CodeableConcept] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): ProcessNote = new ProcessNote(
      id,
      `type`,
      text,
      number,
      language,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: ProcessNote): Option[(Option[String], Option[NOTE_TYPE], Option[String], Option[PositiveInt], Option[CodeableConcept], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.`type`, o.text, o.number, o.language, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[Option[NOTE_TYPE]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[NOTE_TYPE]], false, lTagOf[NOTE_TYPE])
    val text: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("text", lTagOf[Option[String]], false, lTagOf[String])
    val number: FHIRComponentFieldMeta[Option[PositiveInt]] =
      FHIRComponentFieldMeta("number", lTagOf[Option[PositiveInt]], false, lTagOf[PositiveInt])
    val language: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("language", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, `type`, text, number, language, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: ProcessNote): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[NOTE_TYPE]](`type`, t.`type`),
      FHIRComponentField[Option[String]](text, t.text),
      FHIRComponentField[Option[PositiveInt]](number, t.number),
      FHIRComponentField[Option[CodeableConcept]](language, t.language),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[ProcessNote] = this
    val thisName: String                    = "ProcessNote"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ProcessNote] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new ProcessNote(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[NOTE_TYPE]]("type", Some(None)),
            cursor.decodeAs[Option[String]]("text", Some(None)),
            cursor.decodeAs[Option[PositiveInt]]("number", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("language", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class ProcessNote(
      override val id: Option[String] = None,
      val `type`: Option[NOTE_TYPE] = None,
      val text: Option[String] = None,
      val number: Option[PositiveInt] = None,
      val language: Option[CodeableConcept] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Insurance extends CompanionFor[Insurance] {
    override type ResourceType = Insurance
    def apply(
        id: Option[String] = None,
        focal: Boolean,
        coverage: Reference,
        extension: LitSeq[Extension] = LitSeq.empty,
        preAuthRef: LitSeq[String] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Insurance = new Insurance(
      id,
      focal,
      coverage,
      extension,
      preAuthRef,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Insurance): Option[(Option[String], Boolean, Reference, LitSeq[Extension], LitSeq[String], LitSeq[Extension])] =
      Some((o.id, o.focal, o.coverage, o.extension, o.preAuthRef, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val focal: FHIRComponentFieldMeta[Boolean] =
      FHIRComponentFieldMeta("focal", lTagOf[Boolean], false, lTagOf[Boolean])
    val coverage: FHIRComponentFieldMeta[Reference] =
      FHIRComponentFieldMeta("coverage", lTagOf[Reference], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val preAuthRef: FHIRComponentFieldMeta[LitSeq[String]] =
      FHIRComponentFieldMeta("preAuthRef", lTagOf[LitSeq[String]], false, lTagOf[String])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, focal, coverage, extension, preAuthRef, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Insurance): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Boolean](focal, t.focal),
      FHIRComponentField[Reference](coverage, t.coverage),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[String]](preAuthRef, t.preAuthRef),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Insurance] = this
    val thisName: String                  = "Insurance"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Insurance] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Insurance(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Boolean]("focal", None),
            cursor.decodeAs[Reference]("coverage", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[String]]("preAuthRef", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Insurance(
      override val id: Option[String] = None,
      val focal: Boolean,
      val coverage: Reference,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val preAuthRef: LitSeq[String] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Procedure extends CompanionFor[Procedure] {
    override type ResourceType = Procedure
    type ProcedureChoice       = Choice[Union01025009075]
    def apply(
        id: Option[String] = None,
        udi: LitSeq[Reference] = LitSeq.empty,
        `type`: LitSeq[CodeableConcept] = LitSeq.empty,
        date: Option[FHIRDateTime] = None,
        sequence: PositiveInt,
        extension: LitSeq[Extension] = LitSeq.empty,
        procedure: Procedure.ProcedureChoice,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Procedure = new Procedure(
      id,
      udi,
      `type`,
      date,
      sequence,
      extension,
      procedure,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Procedure): Option[(Option[String], LitSeq[Reference], LitSeq[CodeableConcept], Option[FHIRDateTime], PositiveInt, LitSeq[Extension], Procedure.ProcedureChoice, LitSeq[Extension])] =
      Some((o.id, o.udi, o.`type`, o.date, o.sequence, o.extension, o.procedure, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val udi: FHIRComponentFieldMeta[LitSeq[Reference]] =
      FHIRComponentFieldMeta("udi", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
    val `type`: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val date: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
      FHIRComponentFieldMeta("date", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
    val sequence: FHIRComponentFieldMeta[PositiveInt] =
      FHIRComponentFieldMeta("sequence", lTagOf[PositiveInt], false, lTagOf[PositiveInt])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val procedure: FHIRComponentFieldMeta[Procedure.ProcedureChoice] =
      FHIRComponentFieldMeta("procedure", lTagOf[Procedure.ProcedureChoice], true, lTagOf[Union01025009075])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, udi, `type`, date, sequence, extension, procedure, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Procedure): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Reference]](udi, t.udi),
      FHIRComponentField[LitSeq[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[Option[FHIRDateTime]](date, t.date),
      FHIRComponentField[PositiveInt](sequence, t.sequence),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Procedure.ProcedureChoice](procedure, t.procedure),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Procedure] = this
    val thisName: String                  = "Procedure"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Procedure] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Procedure(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Reference]]("udi", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("type", Some(LitSeq.empty)),
            cursor.decodeAs[Option[FHIRDateTime]]("date", Some(None)),
            cursor.decodeAs[PositiveInt]("sequence", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeRef[Union01025009075]("procedure"),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Procedure(
      override val id: Option[String] = None,
      val udi: LitSeq[Reference] = LitSeq.empty,
      val `type`: LitSeq[CodeableConcept] = LitSeq.empty,
      val date: Option[FHIRDateTime] = None,
      val sequence: PositiveInt,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val procedure: Procedure.ProcedureChoice,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Diagnosis extends CompanionFor[Diagnosis] {
    override type ResourceType = Diagnosis
    type DiagnosisChoice       = Choice[Union01025009075]
    def apply(
        id: Option[String] = None,
        `type`: LitSeq[CodeableConcept] = LitSeq.empty,
        sequence: PositiveInt,
        extension: LitSeq[Extension] = LitSeq.empty,
        onAdmission: Option[CodeableConcept] = None,
        packageCode: Option[CodeableConcept] = None,
        diagnosis: Diagnosis.DiagnosisChoice,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Diagnosis = new Diagnosis(
      id,
      `type`,
      sequence,
      extension,
      onAdmission,
      packageCode,
      diagnosis,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Diagnosis): Option[(Option[String], LitSeq[CodeableConcept], PositiveInt, LitSeq[Extension], Option[CodeableConcept], Option[CodeableConcept], Diagnosis.DiagnosisChoice, LitSeq[Extension])] =
      Some((o.id, o.`type`, o.sequence, o.extension, o.onAdmission, o.packageCode, o.diagnosis, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val sequence: FHIRComponentFieldMeta[PositiveInt] =
      FHIRComponentFieldMeta("sequence", lTagOf[PositiveInt], false, lTagOf[PositiveInt])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val onAdmission: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("onAdmission", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val packageCode: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("packageCode", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val diagnosis: FHIRComponentFieldMeta[Diagnosis.DiagnosisChoice] =
      FHIRComponentFieldMeta("diagnosis", lTagOf[Diagnosis.DiagnosisChoice], true, lTagOf[Union01025009075])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, `type`, sequence, extension, onAdmission, packageCode, diagnosis, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Diagnosis): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[PositiveInt](sequence, t.sequence),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[CodeableConcept]](onAdmission, t.onAdmission),
      FHIRComponentField[Option[CodeableConcept]](packageCode, t.packageCode),
      FHIRComponentField[Diagnosis.DiagnosisChoice](diagnosis, t.diagnosis),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Diagnosis] = this
    val thisName: String                  = "Diagnosis"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Diagnosis] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Diagnosis(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("type", Some(LitSeq.empty)),
            cursor.decodeAs[PositiveInt]("sequence", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[CodeableConcept]]("onAdmission", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("packageCode", Some(None)),
            cursor.decodeRef[Union01025009075]("diagnosis"),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Diagnosis(
      override val id: Option[String] = None,
      val `type`: LitSeq[CodeableConcept] = LitSeq.empty,
      val sequence: PositiveInt,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val onAdmission: Option[CodeableConcept] = None,
      val packageCode: Option[CodeableConcept] = None,
      val diagnosis: Diagnosis.DiagnosisChoice,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Accident extends CompanionFor[Accident] {
    override type ResourceType = Accident
    type LocationChoice        = Choice[Union00434638053]
    def apply(
        id: Option[String] = None,
        date: Option[FHIRDate] = None,
        `type`: Option[CodeableConcept] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        location: Option[Accident.LocationChoice] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Accident = new Accident(
      id,
      date,
      `type`,
      extension,
      location,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Accident): Option[(Option[String], Option[FHIRDate], Option[CodeableConcept], LitSeq[Extension], Option[Accident.LocationChoice], LitSeq[Extension])] =
      Some((o.id, o.date, o.`type`, o.extension, o.location, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val date: FHIRComponentFieldMeta[Option[FHIRDate]] =
      FHIRComponentFieldMeta("date", lTagOf[Option[FHIRDate]], false, lTagOf[FHIRDate])
    val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val location: FHIRComponentFieldMeta[Option[Accident.LocationChoice]] =
      FHIRComponentFieldMeta("location", lTagOf[Option[Accident.LocationChoice]], true, lTagOf[Union00434638053])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, date, `type`, extension, location, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Accident): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[FHIRDate]](date, t.date),
      FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Accident.LocationChoice]](location, t.location),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Accident] = this
    val thisName: String                 = "Accident"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Accident] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Accident(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[FHIRDate]]("date", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeOptRef[Union00434638053]("location"),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Accident(
      override val id: Option[String] = None,
      val date: Option[FHIRDate] = None,
      val `type`: Option[CodeableConcept] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val location: Option[Accident.LocationChoice] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object CareTeam extends CompanionFor[CareTeam] {
    override type ResourceType = CareTeam
    def apply(
        id: Option[String] = None,
        role: Option[CodeableConcept] = None,
        sequence: PositiveInt,
        provider: Reference,
        extension: LitSeq[Extension] = LitSeq.empty,
        responsible: Option[Boolean] = None,
        qualification: Option[CodeableConcept] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): CareTeam = new CareTeam(
      id,
      role,
      sequence,
      provider,
      extension,
      responsible,
      qualification,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: CareTeam): Option[(Option[String], Option[CodeableConcept], PositiveInt, Reference, LitSeq[Extension], Option[Boolean], Option[CodeableConcept], LitSeq[Extension])] =
      Some((o.id, o.role, o.sequence, o.provider, o.extension, o.responsible, o.qualification, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val role: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("role", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val sequence: FHIRComponentFieldMeta[PositiveInt] =
      FHIRComponentFieldMeta("sequence", lTagOf[PositiveInt], false, lTagOf[PositiveInt])
    val provider: FHIRComponentFieldMeta[Reference] =
      FHIRComponentFieldMeta("provider", lTagOf[Reference], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val responsible: FHIRComponentFieldMeta[Option[Boolean]] =
      FHIRComponentFieldMeta("responsible", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
    val qualification: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("qualification", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, role, sequence, provider, extension, responsible, qualification, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: CareTeam): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](role, t.role),
      FHIRComponentField[PositiveInt](sequence, t.sequence),
      FHIRComponentField[Reference](provider, t.provider),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Boolean]](responsible, t.responsible),
      FHIRComponentField[Option[CodeableConcept]](qualification, t.qualification),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[CareTeam] = this
    val thisName: String                 = "CareTeam"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[CareTeam] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new CareTeam(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("role", Some(None)),
            cursor.decodeAs[PositiveInt]("sequence", None),
            cursor.decodeAs[Reference]("provider", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Boolean]]("responsible", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("qualification", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class CareTeam(
      override val id: Option[String] = None,
      val role: Option[CodeableConcept] = None,
      val sequence: PositiveInt,
      val provider: Reference,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val responsible: Option[Boolean] = None,
      val qualification: Option[CodeableConcept] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Payment extends CompanionFor[Payment] {
    override type ResourceType = Payment
    def apply(
        id: Option[String] = None,
        `type`: Option[CodeableConcept] = None,
        date: Option[FHIRDate] = None,
        amount: Option[Money] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        adjustment: Option[Money] = None,
        identifier: Option[Identifier] = None,
        adjustmentReason: Option[CodeableConcept] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Payment = new Payment(
      id,
      `type`,
      date,
      amount,
      extension,
      adjustment,
      identifier,
      adjustmentReason,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Payment): Option[(Option[String], Option[CodeableConcept], Option[FHIRDate], Option[Money], LitSeq[Extension], Option[Money], Option[Identifier], Option[CodeableConcept], LitSeq[Extension])] =
      Some(
        (
          o.id,
          o.`type`,
          o.date,
          o.amount,
          o.extension,
          o.adjustment,
          o.identifier,
          o.adjustmentReason,
          o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val date: FHIRComponentFieldMeta[Option[FHIRDate]] =
      FHIRComponentFieldMeta("date", lTagOf[Option[FHIRDate]], false, lTagOf[FHIRDate])
    val amount: FHIRComponentFieldMeta[Option[Money]] =
      FHIRComponentFieldMeta("amount", lTagOf[Option[Money]], false, lTagOf[Money])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val adjustment: FHIRComponentFieldMeta[Option[Money]] =
      FHIRComponentFieldMeta("adjustment", lTagOf[Option[Money]], false, lTagOf[Money])
    val identifier: FHIRComponentFieldMeta[Option[Identifier]] =
      FHIRComponentFieldMeta("identifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
    val adjustmentReason: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("adjustmentReason", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, `type`, date, amount, extension, adjustment, identifier, adjustmentReason, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Payment): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[Option[FHIRDate]](date, t.date),
      FHIRComponentField[Option[Money]](amount, t.amount),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Money]](adjustment, t.adjustment),
      FHIRComponentField[Option[Identifier]](identifier, t.identifier),
      FHIRComponentField[Option[CodeableConcept]](adjustmentReason, t.adjustmentReason),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Payment] = this
    val thisName: String                = "Payment"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Payment] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Payment(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
            cursor.decodeAs[Option[FHIRDate]]("date", Some(None)),
            cursor.decodeAs[Option[Money]]("amount", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Money]]("adjustment", Some(None)),
            cursor.decodeAs[Option[Identifier]]("identifier", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("adjustmentReason", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Payment(
      override val id: Option[String] = None,
      val `type`: Option[CodeableConcept] = None,
      val date: Option[FHIRDate] = None,
      val amount: Option[Money] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val adjustment: Option[Money] = None,
      val identifier: Option[Identifier] = None,
      val adjustmentReason: Option[CodeableConcept] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Related extends CompanionFor[Related] {
    override type ResourceType = Related
    def apply(
        id: Option[String] = None,
        claim: Option[Reference] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        reference: Option[Identifier] = None,
        relationship: Option[CodeableConcept] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Related = new Related(
      id,
      claim,
      extension,
      reference,
      relationship,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Related): Option[(Option[String], Option[Reference], LitSeq[Extension], Option[Identifier], Option[CodeableConcept], LitSeq[Extension])] =
      Some((o.id, o.claim, o.extension, o.reference, o.relationship, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val claim: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("claim", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val reference: FHIRComponentFieldMeta[Option[Identifier]] =
      FHIRComponentFieldMeta("reference", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
    val relationship: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("relationship", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, claim, extension, reference, relationship, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Related): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Reference]](claim, t.claim),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Identifier]](reference, t.reference),
      FHIRComponentField[Option[CodeableConcept]](relationship, t.relationship),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Related] = this
    val thisName: String                = "Related"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Related] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Related(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[Reference]]("claim", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Identifier]]("reference", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("relationship", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Related(
      override val id: Option[String] = None,
      val claim: Option[Reference] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val reference: Option[Identifier] = None,
      val relationship: Option[CodeableConcept] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Total extends CompanionFor[Total] {
    override type ResourceType = Total
    def apply(
        id: Option[String] = None,
        amount: Money,
        category: CodeableConcept,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Total = new Total(
      id,
      amount,
      category,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(o: Total): Option[(Option[String], Money, CodeableConcept, LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.amount, o.category, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val amount: FHIRComponentFieldMeta[Money] =
      FHIRComponentFieldMeta("amount", lTagOf[Money], false, lTagOf[Money])
    val category: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("category", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, amount, category, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Total): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Money](amount, t.amount),
      FHIRComponentField[CodeableConcept](category, t.category),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Total] = this
    val thisName: String              = "Total"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Total] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Total(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Money]("amount", None),
            cursor.decodeAs[CodeableConcept]("category", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Total(
      override val id: Option[String] = None,
      val amount: Money,
      val category: CodeableConcept,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Payee extends CompanionFor[Payee] {
    override type ResourceType = Payee
    def apply(
        id: Option[String] = None,
        `type`: Option[CodeableConcept] = None,
        party: Option[Reference] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Payee = new Payee(
      id,
      `type`,
      party,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Payee): Option[(Option[String], Option[CodeableConcept], Option[Reference], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.`type`, o.party, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val party: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("party", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, `type`, party, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Payee): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[Option[Reference]](party, t.party),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Payee] = this
    val thisName: String              = "Payee"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Payee] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Payee(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
            cursor.decodeAs[Option[Reference]]("party", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Payee(
      override val id: Option[String] = None,
      val `type`: Option[CodeableConcept] = None,
      val party: Option[Reference] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      use: CLAIM_USE,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      `type`: CodeableConcept,
      form: Option[Attachment] = None,
      claim: Option[Reference] = None,
      status: EXPLANATIONOFBENEFIT_STATUS,
      subType: Option[CodeableConcept] = None,
      patient: Reference,
      created: FHIRDateTime,
      enterer: Option[Reference] = None,
      insurer: Reference,
      outcome: REMITTANCE_OUTCOME,
      language: Option[LANGUAGES] = None,
      provider: Reference,
      priority: Option[CodeableConcept] = None,
      referral: Option[Reference] = None,
      facility: Option[Reference] = None,
      formCode: Option[CodeableConcept] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      preAuthRef: LitSeq[String] = LitSeq.empty,
      precedence: Option[PositiveInt] = None,
      disposition: Option[String] = None,
      fundsReserve: Option[CodeableConcept] = None,
      prescription: Option[Reference] = None,
      adjudication: LitSeq[ExplanationOfBenefit.Item.Adjudication] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      claimResponse: Option[Reference] = None,
      benefitPeriod: Option[Period] = None,
      billablePeriod: Option[Period] = None,
      preAuthRefPeriod: LitSeq[Period] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      originalPrescription: Option[Reference] = None,
      fundsReserveRequested: Option[CodeableConcept] = None,
      payee: Option[ExplanationOfBenefit.Payee] = None,
      total: LitSeq[ExplanationOfBenefit.Total] = LitSeq.empty,
      related: LitSeq[ExplanationOfBenefit.Related] = LitSeq.empty,
      payment: Option[ExplanationOfBenefit.Payment] = None,
      careTeam: LitSeq[ExplanationOfBenefit.CareTeam] = LitSeq.empty,
      accident: Option[ExplanationOfBenefit.Accident] = None,
      diagnosis: LitSeq[ExplanationOfBenefit.Diagnosis] = LitSeq.empty,
      procedure: LitSeq[ExplanationOfBenefit.Procedure] = LitSeq.empty,
      insurance: NonEmptyLitSeq[ExplanationOfBenefit.Insurance],
      processNote: LitSeq[ExplanationOfBenefit.ProcessNote] = LitSeq.empty,
      supportingInfo: LitSeq[ExplanationOfBenefit.SupportingInfo] = LitSeq.empty,
      item: LitSeq[ExplanationOfBenefit.Item] = LitSeq.empty,
      addItem: LitSeq[ExplanationOfBenefit.AddItem] = LitSeq.empty,
      benefitBalance: LitSeq[ExplanationOfBenefit.BenefitBalance] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): ExplanationOfBenefit = new ExplanationOfBenefit(
    id,
    use,
    meta,
    text,
    `type`,
    form,
    claim,
    status,
    subType,
    patient,
    created,
    enterer,
    insurer,
    outcome,
    language,
    provider,
    priority,
    referral,
    facility,
    formCode,
    contained,
    extension,
    identifier,
    preAuthRef,
    precedence,
    disposition,
    fundsReserve,
    prescription,
    adjudication,
    implicitRules,
    claimResponse,
    benefitPeriod,
    billablePeriod,
    preAuthRefPeriod,
    modifierExtension,
    originalPrescription,
    fundsReserveRequested,
    payee,
    total,
    related,
    payment,
    careTeam,
    accident,
    diagnosis,
    procedure,
    insurance,
    processNote,
    supportingInfo,
    item,
    addItem,
    benefitBalance,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val use: FHIRComponentFieldMeta[CLAIM_USE] =
    FHIRComponentFieldMeta("use", lTagOf[CLAIM_USE], false, lTagOf[CLAIM_USE])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val `type`: FHIRComponentFieldMeta[CodeableConcept] =
    FHIRComponentFieldMeta("type", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
  val form: FHIRComponentFieldMeta[Option[Attachment]] =
    FHIRComponentFieldMeta("form", lTagOf[Option[Attachment]], false, lTagOf[Attachment])
  val claim: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("claim", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val status: FHIRComponentFieldMeta[EXPLANATIONOFBENEFIT_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[EXPLANATIONOFBENEFIT_STATUS], false, lTagOf[EXPLANATIONOFBENEFIT_STATUS])
  val subType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("subType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val patient: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("patient", lTagOf[Reference], false, lTagOf[Reference])
  val created: FHIRComponentFieldMeta[FHIRDateTime] =
    FHIRComponentFieldMeta("created", lTagOf[FHIRDateTime], false, lTagOf[FHIRDateTime])
  val enterer: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("enterer", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val insurer: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("insurer", lTagOf[Reference], false, lTagOf[Reference])
  val outcome: FHIRComponentFieldMeta[REMITTANCE_OUTCOME] =
    FHIRComponentFieldMeta("outcome", lTagOf[REMITTANCE_OUTCOME], false, lTagOf[REMITTANCE_OUTCOME])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val provider: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("provider", lTagOf[Reference], false, lTagOf[Reference])
  val priority: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("priority", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val referral: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("referral", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val facility: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("facility", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val formCode: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("formCode", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val preAuthRef: FHIRComponentFieldMeta[LitSeq[String]] =
    FHIRComponentFieldMeta("preAuthRef", lTagOf[LitSeq[String]], false, lTagOf[String])
  val precedence: FHIRComponentFieldMeta[Option[PositiveInt]] =
    FHIRComponentFieldMeta("precedence", lTagOf[Option[PositiveInt]], false, lTagOf[PositiveInt])
  val disposition: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("disposition", lTagOf[Option[String]], false, lTagOf[String])
  val fundsReserve: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("fundsReserve", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val prescription: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("prescription", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val adjudication: FHIRComponentFieldMeta[LitSeq[ExplanationOfBenefit.Item.Adjudication]] =
    FHIRComponentFieldMeta(
      "adjudication",
      lTagOf[LitSeq[ExplanationOfBenefit.Item.Adjudication]],
      false,
      lTagOf[ExplanationOfBenefit.Item.Adjudication])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val claimResponse: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("claimResponse", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val benefitPeriod: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("benefitPeriod", lTagOf[Option[Period]], false, lTagOf[Period])
  val billablePeriod: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("billablePeriod", lTagOf[Option[Period]], false, lTagOf[Period])
  val preAuthRefPeriod: FHIRComponentFieldMeta[LitSeq[Period]] =
    FHIRComponentFieldMeta("preAuthRefPeriod", lTagOf[LitSeq[Period]], false, lTagOf[Period])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val originalPrescription: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("originalPrescription", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val fundsReserveRequested: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("fundsReserveRequested", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val payee: FHIRComponentFieldMeta[Option[ExplanationOfBenefit.Payee]] =
    FHIRComponentFieldMeta(
      "payee",
      lTagOf[Option[ExplanationOfBenefit.Payee]],
      false,
      lTagOf[ExplanationOfBenefit.Payee])
  val total: FHIRComponentFieldMeta[LitSeq[ExplanationOfBenefit.Total]] =
    FHIRComponentFieldMeta(
      "total",
      lTagOf[LitSeq[ExplanationOfBenefit.Total]],
      false,
      lTagOf[ExplanationOfBenefit.Total])
  val related: FHIRComponentFieldMeta[LitSeq[ExplanationOfBenefit.Related]] =
    FHIRComponentFieldMeta(
      "related",
      lTagOf[LitSeq[ExplanationOfBenefit.Related]],
      false,
      lTagOf[ExplanationOfBenefit.Related])
  val payment: FHIRComponentFieldMeta[Option[ExplanationOfBenefit.Payment]] =
    FHIRComponentFieldMeta(
      "payment",
      lTagOf[Option[ExplanationOfBenefit.Payment]],
      false,
      lTagOf[ExplanationOfBenefit.Payment])
  val careTeam: FHIRComponentFieldMeta[LitSeq[ExplanationOfBenefit.CareTeam]] =
    FHIRComponentFieldMeta(
      "careTeam",
      lTagOf[LitSeq[ExplanationOfBenefit.CareTeam]],
      false,
      lTagOf[ExplanationOfBenefit.CareTeam])
  val accident: FHIRComponentFieldMeta[Option[ExplanationOfBenefit.Accident]] =
    FHIRComponentFieldMeta(
      "accident",
      lTagOf[Option[ExplanationOfBenefit.Accident]],
      false,
      lTagOf[ExplanationOfBenefit.Accident])
  val diagnosis: FHIRComponentFieldMeta[LitSeq[ExplanationOfBenefit.Diagnosis]] =
    FHIRComponentFieldMeta(
      "diagnosis",
      lTagOf[LitSeq[ExplanationOfBenefit.Diagnosis]],
      false,
      lTagOf[ExplanationOfBenefit.Diagnosis])
  val procedure: FHIRComponentFieldMeta[LitSeq[ExplanationOfBenefit.Procedure]] =
    FHIRComponentFieldMeta(
      "procedure",
      lTagOf[LitSeq[ExplanationOfBenefit.Procedure]],
      false,
      lTagOf[ExplanationOfBenefit.Procedure])
  val insurance: FHIRComponentFieldMeta[NonEmptyLitSeq[ExplanationOfBenefit.Insurance]] =
    FHIRComponentFieldMeta(
      "insurance",
      lTagOf[NonEmptyLitSeq[ExplanationOfBenefit.Insurance]],
      false,
      lTagOf[ExplanationOfBenefit.Insurance])
  val processNote: FHIRComponentFieldMeta[LitSeq[ExplanationOfBenefit.ProcessNote]] =
    FHIRComponentFieldMeta(
      "processNote",
      lTagOf[LitSeq[ExplanationOfBenefit.ProcessNote]],
      false,
      lTagOf[ExplanationOfBenefit.ProcessNote])
  val supportingInfo: FHIRComponentFieldMeta[LitSeq[ExplanationOfBenefit.SupportingInfo]] =
    FHIRComponentFieldMeta(
      "supportingInfo",
      lTagOf[LitSeq[ExplanationOfBenefit.SupportingInfo]],
      false,
      lTagOf[ExplanationOfBenefit.SupportingInfo])
  val item: FHIRComponentFieldMeta[LitSeq[ExplanationOfBenefit.Item]] =
    FHIRComponentFieldMeta("item", lTagOf[LitSeq[ExplanationOfBenefit.Item]], false, lTagOf[ExplanationOfBenefit.Item])
  val addItem: FHIRComponentFieldMeta[LitSeq[ExplanationOfBenefit.AddItem]] =
    FHIRComponentFieldMeta(
      "addItem",
      lTagOf[LitSeq[ExplanationOfBenefit.AddItem]],
      false,
      lTagOf[ExplanationOfBenefit.AddItem])
  val benefitBalance: FHIRComponentFieldMeta[LitSeq[ExplanationOfBenefit.BenefitBalance]] =
    FHIRComponentFieldMeta(
      "benefitBalance",
      lTagOf[LitSeq[ExplanationOfBenefit.BenefitBalance]],
      false,
      lTagOf[ExplanationOfBenefit.BenefitBalance])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    use,
    meta,
    text,
    `type`,
    form,
    claim,
    status,
    subType,
    patient,
    created,
    enterer,
    insurer,
    outcome,
    language,
    provider,
    priority,
    referral,
    facility,
    formCode,
    contained,
    extension,
    identifier,
    preAuthRef,
    precedence,
    disposition,
    fundsReserve,
    prescription,
    adjudication,
    implicitRules,
    claimResponse,
    benefitPeriod,
    billablePeriod,
    preAuthRefPeriod,
    modifierExtension,
    originalPrescription,
    fundsReserveRequested,
    payee,
    total,
    related,
    payment,
    careTeam,
    accident,
    diagnosis,
    procedure,
    insurance,
    processNote,
    supportingInfo,
    item,
    addItem,
    benefitBalance
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: ExplanationOfBenefit): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[CLAIM_USE](use, t.use),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[CodeableConcept](`type`, t.`type`),
    FHIRComponentField[Option[Attachment]](form, t.form),
    FHIRComponentField[Option[Reference]](claim, t.claim),
    FHIRComponentField[EXPLANATIONOFBENEFIT_STATUS](status, t.status),
    FHIRComponentField[Option[CodeableConcept]](subType, t.subType),
    FHIRComponentField[Reference](patient, t.patient),
    FHIRComponentField[FHIRDateTime](created, t.created),
    FHIRComponentField[Option[Reference]](enterer, t.enterer),
    FHIRComponentField[Reference](insurer, t.insurer),
    FHIRComponentField[REMITTANCE_OUTCOME](outcome, t.outcome),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Reference](provider, t.provider),
    FHIRComponentField[Option[CodeableConcept]](priority, t.priority),
    FHIRComponentField[Option[Reference]](referral, t.referral),
    FHIRComponentField[Option[Reference]](facility, t.facility),
    FHIRComponentField[Option[CodeableConcept]](formCode, t.formCode),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[LitSeq[String]](preAuthRef, t.preAuthRef),
    FHIRComponentField[Option[PositiveInt]](precedence, t.precedence),
    FHIRComponentField[Option[String]](disposition, t.disposition),
    FHIRComponentField[Option[CodeableConcept]](fundsReserve, t.fundsReserve),
    FHIRComponentField[Option[Reference]](prescription, t.prescription),
    FHIRComponentField[LitSeq[ExplanationOfBenefit.Item.Adjudication]](adjudication, t.adjudication),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[Reference]](claimResponse, t.claimResponse),
    FHIRComponentField[Option[Period]](benefitPeriod, t.benefitPeriod),
    FHIRComponentField[Option[Period]](billablePeriod, t.billablePeriod),
    FHIRComponentField[LitSeq[Period]](preAuthRefPeriod, t.preAuthRefPeriod),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Option[Reference]](originalPrescription, t.originalPrescription),
    FHIRComponentField[Option[CodeableConcept]](fundsReserveRequested, t.fundsReserveRequested),
    FHIRComponentField[Option[ExplanationOfBenefit.Payee]](payee, t.payee),
    FHIRComponentField[LitSeq[ExplanationOfBenefit.Total]](total, t.total),
    FHIRComponentField[LitSeq[ExplanationOfBenefit.Related]](related, t.related),
    FHIRComponentField[Option[ExplanationOfBenefit.Payment]](payment, t.payment),
    FHIRComponentField[LitSeq[ExplanationOfBenefit.CareTeam]](careTeam, t.careTeam),
    FHIRComponentField[Option[ExplanationOfBenefit.Accident]](accident, t.accident),
    FHIRComponentField[LitSeq[ExplanationOfBenefit.Diagnosis]](diagnosis, t.diagnosis),
    FHIRComponentField[LitSeq[ExplanationOfBenefit.Procedure]](procedure, t.procedure),
    FHIRComponentField[NonEmptyLitSeq[ExplanationOfBenefit.Insurance]](insurance, t.insurance),
    FHIRComponentField[LitSeq[ExplanationOfBenefit.ProcessNote]](processNote, t.processNote),
    FHIRComponentField[LitSeq[ExplanationOfBenefit.SupportingInfo]](supportingInfo, t.supportingInfo),
    FHIRComponentField[LitSeq[ExplanationOfBenefit.Item]](item, t.item),
    FHIRComponentField[LitSeq[ExplanationOfBenefit.AddItem]](addItem, t.addItem),
    FHIRComponentField[LitSeq[ExplanationOfBenefit.BenefitBalance]](benefitBalance, t.benefitBalance)
  )
  def extractId(t: ExplanationOfBenefit): Option[String]                                           = t.id
  def extractUse(t: ExplanationOfBenefit): CLAIM_USE                                               = t.use
  def extractMeta(t: ExplanationOfBenefit): Option[Meta]                                           = t.meta
  def extractText(t: ExplanationOfBenefit): Option[Narrative]                                      = t.text
  def extractType(t: ExplanationOfBenefit): CodeableConcept                                        = t.`type`
  def extractForm(t: ExplanationOfBenefit): Option[Attachment]                                     = t.form
  def extractClaim(t: ExplanationOfBenefit): Option[Reference]                                     = t.claim
  def extractStatus(t: ExplanationOfBenefit): EXPLANATIONOFBENEFIT_STATUS                          = t.status
  def extractSubType(t: ExplanationOfBenefit): Option[CodeableConcept]                             = t.subType
  def extractPatient(t: ExplanationOfBenefit): Reference                                           = t.patient
  def extractCreated(t: ExplanationOfBenefit): FHIRDateTime                                        = t.created
  def extractEnterer(t: ExplanationOfBenefit): Option[Reference]                                   = t.enterer
  def extractInsurer(t: ExplanationOfBenefit): Reference                                           = t.insurer
  def extractOutcome(t: ExplanationOfBenefit): REMITTANCE_OUTCOME                                  = t.outcome
  def extractLanguage(t: ExplanationOfBenefit): Option[LANGUAGES]                                  = t.language
  def extractProvider(t: ExplanationOfBenefit): Reference                                          = t.provider
  def extractPriority(t: ExplanationOfBenefit): Option[CodeableConcept]                            = t.priority
  def extractReferral(t: ExplanationOfBenefit): Option[Reference]                                  = t.referral
  def extractFacility(t: ExplanationOfBenefit): Option[Reference]                                  = t.facility
  def extractFormCode(t: ExplanationOfBenefit): Option[CodeableConcept]                            = t.formCode
  def extractContained(t: ExplanationOfBenefit): LitSeq[Resource]                                  = t.contained
  def extractExtension(t: ExplanationOfBenefit): LitSeq[Extension]                                 = t.extension
  def extractIdentifier(t: ExplanationOfBenefit): LitSeq[Identifier]                               = t.identifier
  def extractPreAuthRef(t: ExplanationOfBenefit): LitSeq[String]                                   = t.preAuthRef
  def extractPrecedence(t: ExplanationOfBenefit): Option[PositiveInt]                              = t.precedence
  def extractDisposition(t: ExplanationOfBenefit): Option[String]                                  = t.disposition
  def extractFundsReserve(t: ExplanationOfBenefit): Option[CodeableConcept]                        = t.fundsReserve
  def extractPrescription(t: ExplanationOfBenefit): Option[Reference]                              = t.prescription
  def extractAdjudication(t: ExplanationOfBenefit): LitSeq[ExplanationOfBenefit.Item.Adjudication] = t.adjudication
  def extractImplicitRules(t: ExplanationOfBenefit): Option[UriStr]                                = t.implicitRules
  def extractClaimResponse(t: ExplanationOfBenefit): Option[Reference]                             = t.claimResponse
  def extractBenefitPeriod(t: ExplanationOfBenefit): Option[Period]                                = t.benefitPeriod
  def extractBillablePeriod(t: ExplanationOfBenefit): Option[Period]                               = t.billablePeriod
  def extractPreAuthRefPeriod(t: ExplanationOfBenefit): LitSeq[Period]                             = t.preAuthRefPeriod
  def extractModifierExtension(t: ExplanationOfBenefit): LitSeq[Extension]                         = t.modifierExtension
  def extractOriginalPrescription(t: ExplanationOfBenefit): Option[Reference]                      = t.originalPrescription
  def extractFundsReserveRequested(t: ExplanationOfBenefit): Option[CodeableConcept]               = t.fundsReserveRequested
  def extractPayee(t: ExplanationOfBenefit): Option[ExplanationOfBenefit.Payee]                    = t.payee
  def extractTotal(t: ExplanationOfBenefit): LitSeq[ExplanationOfBenefit.Total]                    = t.total
  def extractRelated(t: ExplanationOfBenefit): LitSeq[ExplanationOfBenefit.Related]                = t.related
  def extractPayment(t: ExplanationOfBenefit): Option[ExplanationOfBenefit.Payment]                = t.payment
  def extractCareTeam(t: ExplanationOfBenefit): LitSeq[ExplanationOfBenefit.CareTeam]              = t.careTeam
  def extractAccident(t: ExplanationOfBenefit): Option[ExplanationOfBenefit.Accident]              = t.accident
  def extractDiagnosis(t: ExplanationOfBenefit): LitSeq[ExplanationOfBenefit.Diagnosis]            = t.diagnosis
  def extractProcedure(t: ExplanationOfBenefit): LitSeq[ExplanationOfBenefit.Procedure]            = t.procedure
  def extractInsurance(t: ExplanationOfBenefit): NonEmptyLitSeq[ExplanationOfBenefit.Insurance]    = t.insurance
  def extractProcessNote(t: ExplanationOfBenefit): LitSeq[ExplanationOfBenefit.ProcessNote]        = t.processNote
  def extractSupportingInfo(t: ExplanationOfBenefit): LitSeq[ExplanationOfBenefit.SupportingInfo]  = t.supportingInfo
  def extractItem(t: ExplanationOfBenefit): LitSeq[ExplanationOfBenefit.Item]                      = t.item
  def extractAddItem(t: ExplanationOfBenefit): LitSeq[ExplanationOfBenefit.AddItem]                = t.addItem
  def extractBenefitBalance(t: ExplanationOfBenefit): LitSeq[ExplanationOfBenefit.BenefitBalance]  = t.benefitBalance
  override val thisName: String                                                                    = "ExplanationOfBenefit"
  override val searchParams: Map[String, ExplanationOfBenefit => Seq[Any]] = Map(
    "claim"         -> (obj => obj.claim.toSeq),
    "provider"      -> (obj => Seq(obj.provider)),
    "identifier"    -> (obj => obj.identifier.toSeq),
    "disposition"   -> (obj => obj.disposition.toSeq),
    "care-team"     -> (obj => obj.careTeam.map(_.provider).toSeq),
    "coverage"      -> (obj => obj.insurance.map(_.coverage).toSeq),
    "subdetail-udi" -> (obj => obj.item.flatMap(_.detail).flatMap(_.subDetail).flatMap(_.udi).toSeq),
    "status"        -> (obj => Seq(obj.status)),
    "payee"         -> (obj => obj.payee.flatMap(_.party).toSeq),
    "detail-udi"    -> (obj => obj.item.flatMap(_.detail).flatMap(_.udi).toSeq),
    "item-udi"      -> (obj => obj.item.flatMap(_.udi).toSeq),
    "procedure-udi" -> (obj => obj.procedure.flatMap(_.udi).toSeq),
    "facility"      -> (obj => obj.facility.toSeq),
    "enterer"       -> (obj => obj.enterer.toSeq),
    "encounter"     -> (obj => obj.item.flatMap(_.encounter).toSeq),
    "created"       -> (obj => Seq(obj.created)),
    "patient"       -> (obj => Seq(obj.patient))
  )
  // format: off
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ExplanationOfBenefit] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ => Try(
      new ExplanationOfBenefit(
        cursor.decodeAs[Option[String]]("id", Some(None)),
        cursor.decodeAs[CLAIM_USE]("use", None),
        cursor.decodeAs[Option[Meta]]("meta", Some(None)),
        cursor.decodeAs[Option[Narrative]]("text", Some(None)),
        cursor.decodeAs[CodeableConcept]("type", None),
        cursor.decodeAs[Option[Attachment]]("form", Some(None)),
        cursor.decodeAs[Option[Reference]]("claim", Some(None)),
        cursor.decodeAs[EXPLANATIONOFBENEFIT_STATUS]("status", None),
        cursor.decodeAs[Option[CodeableConcept]]("subType", Some(None)),
        cursor.decodeAs[Reference]("patient", None),
        cursor.decodeAs[FHIRDateTime]("created", None),
        cursor.decodeAs[Option[Reference]]("enterer", Some(None)),
        cursor.decodeAs[Reference]("insurer", None),
        cursor.decodeAs[REMITTANCE_OUTCOME]("outcome", None),
        cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
        cursor.decodeAs[Reference]("provider", None),
        cursor.decodeAs[Option[CodeableConcept]]("priority", Some(None)),
        cursor.decodeAs[Option[Reference]]("referral", Some(None)),
        cursor.decodeAs[Option[Reference]]("facility", Some(None)),
        cursor.decodeAs[Option[CodeableConcept]]("formCode", Some(None)),
        cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[String]]("preAuthRef", Some(LitSeq.empty)),
        cursor.decodeAs[Option[PositiveInt]]("precedence", Some(None)),
        cursor.decodeAs[Option[String]]("disposition", Some(None)),
        cursor.decodeAs[Option[CodeableConcept]]("fundsReserve", Some(None)),
        cursor.decodeAs[Option[Reference]]("prescription", Some(None)),
        cursor.decodeAs[LitSeq[ExplanationOfBenefit.Item.Adjudication]]("adjudication", Some(LitSeq.empty)),
        cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
        cursor.decodeAs[Option[Reference]]("claimResponse", Some(None)),
        cursor.decodeAs[Option[Period]]("benefitPeriod", Some(None)),
        cursor.decodeAs[Option[Period]]("billablePeriod", Some(None)),
        cursor.decodeAs[LitSeq[Period]]("preAuthRefPeriod", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
        cursor.decodeAs[Option[Reference]]("originalPrescription", Some(None)),
        cursor.decodeAs[Option[CodeableConcept]]("fundsReserveRequested", Some(None)),
        cursor.decodeAs[Option[ExplanationOfBenefit.Payee]]("payee", Some(None)),
        cursor.decodeAs[LitSeq[ExplanationOfBenefit.Total]]("total", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[ExplanationOfBenefit.Related]]("related", Some(LitSeq.empty)),
        cursor.decodeAs[Option[ExplanationOfBenefit.Payment]]("payment", Some(None)),
        cursor.decodeAs[LitSeq[ExplanationOfBenefit.CareTeam]]("careTeam", Some(LitSeq.empty)),
        cursor.decodeAs[Option[ExplanationOfBenefit.Accident]]("accident", Some(None)),
        cursor.decodeAs[LitSeq[ExplanationOfBenefit.Diagnosis]]("diagnosis", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[ExplanationOfBenefit.Procedure]]("procedure", Some(LitSeq.empty)),
        cursor.decodeAs[NonEmptyLitSeq[ExplanationOfBenefit.Insurance]]("insurance", None),
        cursor.decodeAs[LitSeq[ExplanationOfBenefit.ProcessNote]]("processNote", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[ExplanationOfBenefit.SupportingInfo]]("supportingInfo", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[ExplanationOfBenefit.Item]]("item", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[ExplanationOfBenefit.AddItem]]("addItem", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[ExplanationOfBenefit.BenefitBalance]]("benefitBalance", Some(LitSeq.empty)),
        decodeAttributes(cursor)
      )
    ))
  // format: on
}

/** This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields use, `type`, form, claim, status, subType, patient, created, enterer, insurer, outcome, provider, priority, referral, facility, formCode, identifier, preAuthRef, precedence, disposition, fundsReserve, prescription, adjudication, claimResponse, benefitPeriod, billablePeriod, preAuthRefPeriod, originalPrescription, fundsReserveRequested, payee, total, related, payment, careTeam, accident, diagnosis, procedure, insurance, processNote, supportingInfo, item, addItem, benefitBalance.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param use - A code to indicate whether the nature of the request is: to request adjudication of products and services previously rendered; or requesting authorization and adjudication for provision in the future; or requesting the non-binding adjudication of the listed products and services which could be provided in the future.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param `type` - The category of claim, e.g. oral, pharmacy, vision, institutional, professional.
  * @param form - The actual form, by reference or inclusion, for printing the content or an EOB.
  * @param claim - The business identifier for the instance of the adjudication request: claim predetermination or preauthorization.
  * @param status - The status of the resource instance.
  * @param subType - A finer grained suite of claim type codes which may convey additional information such as Inpatient vs Outpatient and/or a specialty service.
  * @param patient - The party to whom the professional services and/or products have been supplied or are being considered and for whom actual for forecast reimbursement is sought.
  * @param created - The date this resource was created.
  * @param enterer - Individual who created the claim, predetermination or preauthorization.
  * @param insurer - The party responsible for authorization, adjudication and reimbursement.
  * @param outcome - The outcome of the claim, predetermination, or preauthorization processing.
  * @param language - The base language in which the resource is written.
  * @param provider - The provider which is responsible for the claim, predetermination or preauthorization.
  * @param priority - The provider-required urgency of processing the request. Typical values include: stat, routine deferred.
  * @param referral - A reference to a referral resource.
  * @param facility - Facility where the services were provided.
  * @param formCode - A code for the form to be used for printing the content.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param identifier - A unique identifier assigned to this explanation of benefit.
  * @param preAuthRef - Reference from the Insurer which is used in later communications which refers to this adjudication.
  * @param precedence - This indicates the relative order of a series of EOBs related to different coverages for the same suite of services.
  * @param disposition - A human readable description of the status of the adjudication.
  * @param fundsReserve - A code, used only on a response to a preauthorization, to indicate whether the benefits payable have been reserved and for whom.
  * @param prescription - Prescription to support the dispensing of pharmacy, device or vision products.
  * @param adjudication - The adjudication results which are presented at the header level rather than at the line-item or add-item levels.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param claimResponse - The business identifier for the instance of the adjudication response: claim, predetermination or preauthorization response.
  * @param benefitPeriod - The term of the benefits documented in this response.
  * @param billablePeriod - The period for which charges are being submitted.
  * @param preAuthRefPeriod - The timeframe during which the supplied preauthorization reference may be quoted on claims to obtain the adjudication as provided.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param originalPrescription - Original prescription which has been superseded by this prescription to support the dispensing of pharmacy services, medications or products.
  * @param fundsReserveRequested - A code to indicate whether and for whom funds are to be reserved for future claims.
  * @param payee - The party to be reimbursed for cost of the products and services according to the terms of the policy.
  * @param total - Categorized monetary totals for the adjudication.
  * @param related - Other claims which are related to this claim such as prior submissions or claims for related services or for the same event.
  * @param payment - Payment details for the adjudication of the claim.
  * @param careTeam - The members of the team who provided the products and services.
  * @param accident - Details of a accident which resulted in injuries which required the products and services listed in the claim.
  * @param diagnosis - Information about diagnoses relevant to the claim items.
  * @param procedure - Procedures performed on the patient relevant to the billing items with the claim.
  * @param insurance - Financial instruments for reimbursement for the health care products and services specified on the claim.
  * @param processNote - A note that describes or explains adjudication results in a human readable form.
  * @param supportingInfo - Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent issues.
  * @param item - A claim line. Either a simple (a product or service) or a 'group' of details which can also be a simple items or groups of sub-details.
  * @param addItem - The first-tier service adjudications for payor added product or service lines.
  * @param benefitBalance - Balance by Benefit Category.
  */
@POJOBoilerplate
class ExplanationOfBenefit(
    override val id: Option[String] = None,
    val use: CLAIM_USE,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val `type`: CodeableConcept,
    val form: Option[Attachment] = None,
    val claim: Option[Reference] = None,
    val status: EXPLANATIONOFBENEFIT_STATUS,
    val subType: Option[CodeableConcept] = None,
    val patient: Reference,
    val created: FHIRDateTime,
    val enterer: Option[Reference] = None,
    val insurer: Reference,
    val outcome: REMITTANCE_OUTCOME,
    override val language: Option[LANGUAGES] = None,
    val provider: Reference,
    val priority: Option[CodeableConcept] = None,
    val referral: Option[Reference] = None,
    val facility: Option[Reference] = None,
    val formCode: Option[CodeableConcept] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val preAuthRef: LitSeq[String] = LitSeq.empty,
    val precedence: Option[PositiveInt] = None,
    val disposition: Option[String] = None,
    val fundsReserve: Option[CodeableConcept] = None,
    val prescription: Option[Reference] = None,
    val adjudication: LitSeq[ExplanationOfBenefit.Item.Adjudication] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    val claimResponse: Option[Reference] = None,
    val benefitPeriod: Option[Period] = None,
    val billablePeriod: Option[Period] = None,
    val preAuthRefPeriod: LitSeq[Period] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val originalPrescription: Option[Reference] = None,
    val fundsReserveRequested: Option[CodeableConcept] = None,
    val payee: Option[ExplanationOfBenefit.Payee] = None,
    val total: LitSeq[ExplanationOfBenefit.Total] = LitSeq.empty,
    val related: LitSeq[ExplanationOfBenefit.Related] = LitSeq.empty,
    val payment: Option[ExplanationOfBenefit.Payment] = None,
    val careTeam: LitSeq[ExplanationOfBenefit.CareTeam] = LitSeq.empty,
    val accident: Option[ExplanationOfBenefit.Accident] = None,
    val diagnosis: LitSeq[ExplanationOfBenefit.Diagnosis] = LitSeq.empty,
    val procedure: LitSeq[ExplanationOfBenefit.Procedure] = LitSeq.empty,
    val insurance: NonEmptyLitSeq[ExplanationOfBenefit.Insurance],
    val processNote: LitSeq[ExplanationOfBenefit.ProcessNote] = LitSeq.empty,
    val supportingInfo: LitSeq[ExplanationOfBenefit.SupportingInfo] = LitSeq.empty,
    val item: LitSeq[ExplanationOfBenefit.Item] = LitSeq.empty,
    val addItem: LitSeq[ExplanationOfBenefit.AddItem] = LitSeq.empty,
    val benefitBalance: LitSeq[ExplanationOfBenefit.BenefitBalance] = LitSeq.empty,
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
  override val thisTypeName: String = "ExplanationOfBenefit"
}
