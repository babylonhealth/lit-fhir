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
import com.babylonhealth.lit.hl7.{ CLAIM_USE, NOTE_TYPE, REMITTANCE_OUTCOME, FM_STATUS }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object ClaimResponse extends CompanionFor[ClaimResponse] {
  implicit def summonObjectAndCompanionClaimResponse754234214(
      o: ClaimResponse): ObjectAndCompanion[ClaimResponse, ClaimResponse.type] = ObjectAndCompanion(o, this)
  override type ResourceType = ClaimResponse
  override type ParentType   = ClaimResponse
  override val baseType: CompanionFor[ResourceType] = ClaimResponse
  override val parentType: CompanionFor[ParentType] = ClaimResponse
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/ClaimResponse")
  object AddItem extends CompanionFor[AddItem] {
    implicit def summonObjectAndCompanionAddItem770992455(o: AddItem): ObjectAndCompanion[AddItem, AddItem.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = AddItem
    override type ParentType   = AddItem
    override val parentType: CompanionFor[ResourceType] = AddItem
    object Detail extends CompanionFor[Detail] {
      implicit def summonObjectAndCompanionDetail1315817624(o: Detail): ObjectAndCompanion[Detail, Detail.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Detail
      override type ParentType   = Detail
      override val parentType: CompanionFor[ResourceType] = Detail
      object SubDetail extends CompanionFor[SubDetail] {
        implicit def summonObjectAndCompanionSubDetail_1063947171(o: SubDetail): ObjectAndCompanion[SubDetail, SubDetail.type] =
          ObjectAndCompanion(o, this)
        override type ResourceType = SubDetail
        override type ParentType   = SubDetail
        override val parentType: CompanionFor[ResourceType] = SubDetail
        def apply(
            id: Option[String] = None,
            net: Option[Money] = None,
            factor: Option[BigDecimal] = None,
            modifier: LitSeq[CodeableConcept] = LitSeq.empty,
            quantity: Option[Quantity] = None,
            extension: LitSeq[Extension] = LitSeq.empty,
            unitPrice: Option[Money] = None,
            noteNumber: LitSeq[PositiveInt] = LitSeq.empty,
            adjudication: NonEmptyLitSeq[ClaimResponse.Item.Adjudication],
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
            o: SubDetail): Option[(Option[String], Option[Money], Option[BigDecimal], LitSeq[CodeableConcept], Option[Quantity], LitSeq[Extension], Option[Money], LitSeq[PositiveInt], NonEmptyLitSeq[ClaimResponse.Item.Adjudication], CodeableConcept, LitSeq[Extension])] =
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
        val adjudication: FHIRComponentFieldMeta[NonEmptyLitSeq[ClaimResponse.Item.Adjudication]] =
          FHIRComponentFieldMeta(
            "adjudication",
            lTagOf[NonEmptyLitSeq[ClaimResponse.Item.Adjudication]],
            false,
            lTagOf[ClaimResponse.Item.Adjudication])
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
          FHIRComponentField[NonEmptyLitSeq[ClaimResponse.Item.Adjudication]](adjudication, t.adjudication),
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
                cursor.decodeAs[NonEmptyLitSeq[ClaimResponse.Item.Adjudication]]("adjudication", None),
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
          val adjudication: NonEmptyLitSeq[ClaimResponse.Item.Adjudication],
          val productOrService: CodeableConcept,
          override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
          override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
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
          adjudication: NonEmptyLitSeq[ClaimResponse.Item.Adjudication],
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
          o: Detail): Option[(Option[String], Option[Money], Option[BigDecimal], LitSeq[CodeableConcept], Option[Quantity], LitSeq[Extension], Option[Money], LitSeq[PositiveInt], NonEmptyLitSeq[ClaimResponse.Item.Adjudication], CodeableConcept, LitSeq[Extension], LitSeq[Detail.SubDetail])] =
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
      val adjudication: FHIRComponentFieldMeta[NonEmptyLitSeq[ClaimResponse.Item.Adjudication]] =
        FHIRComponentFieldMeta(
          "adjudication",
          lTagOf[NonEmptyLitSeq[ClaimResponse.Item.Adjudication]],
          false,
          lTagOf[ClaimResponse.Item.Adjudication])
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
        FHIRComponentField[NonEmptyLitSeq[ClaimResponse.Item.Adjudication]](adjudication, t.adjudication),
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
              cursor.decodeAs[NonEmptyLitSeq[ClaimResponse.Item.Adjudication]]("adjudication", None),
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
        val adjudication: NonEmptyLitSeq[ClaimResponse.Item.Adjudication],
        val productOrService: CodeableConcept,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        val subDetail: LitSeq[Detail.SubDetail] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
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
        adjudication: NonEmptyLitSeq[ClaimResponse.Item.Adjudication],
        detailSequence: LitSeq[PositiveInt] = LitSeq.empty,
        productOrService: CodeableConcept,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        subdetailSequence: LitSeq[PositiveInt] = LitSeq.empty,
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
      subdetailSequence,
      detail,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: AddItem): Option[(Option[String], Option[Money], Option[BigDecimal], LitSeq[CodeableConcept], LitSeq[Reference], LitSeq[CodeableConcept], Option[Quantity], Option[CodeableConcept], LitSeq[Extension], Option[Money], LitSeq[PositiveInt], LitSeq[CodeableConcept], Option[AddItem.ServicedChoice], Option[AddItem.LocationChoice], LitSeq[PositiveInt], NonEmptyLitSeq[ClaimResponse.Item.Adjudication], LitSeq[PositiveInt], CodeableConcept, LitSeq[Extension], LitSeq[PositiveInt], LitSeq[AddItem.Detail])] =
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
          o.subdetailSequence,
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
    val adjudication: FHIRComponentFieldMeta[NonEmptyLitSeq[ClaimResponse.Item.Adjudication]] =
      FHIRComponentFieldMeta(
        "adjudication",
        lTagOf[NonEmptyLitSeq[ClaimResponse.Item.Adjudication]],
        false,
        lTagOf[ClaimResponse.Item.Adjudication])
    val detailSequence: FHIRComponentFieldMeta[LitSeq[PositiveInt]] =
      FHIRComponentFieldMeta("detailSequence", lTagOf[LitSeq[PositiveInt]], false, lTagOf[PositiveInt])
    val productOrService: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("productOrService", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val subdetailSequence: FHIRComponentFieldMeta[LitSeq[PositiveInt]] =
      FHIRComponentFieldMeta("subdetailSequence", lTagOf[LitSeq[PositiveInt]], false, lTagOf[PositiveInt])
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
      subdetailSequence,
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
      FHIRComponentField[NonEmptyLitSeq[ClaimResponse.Item.Adjudication]](adjudication, t.adjudication),
      FHIRComponentField[LitSeq[PositiveInt]](detailSequence, t.detailSequence),
      FHIRComponentField[CodeableConcept](productOrService, t.productOrService),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[PositiveInt]](subdetailSequence, t.subdetailSequence),
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
            cursor.decodeAs[NonEmptyLitSeq[ClaimResponse.Item.Adjudication]]("adjudication", None),
            cursor.decodeAs[LitSeq[PositiveInt]]("detailSequence", Some(LitSeq.empty)),
            cursor.decodeAs[CodeableConcept]("productOrService", None),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[PositiveInt]]("subdetailSequence", Some(LitSeq.empty)),
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
      val adjudication: NonEmptyLitSeq[ClaimResponse.Item.Adjudication],
      val detailSequence: LitSeq[PositiveInt] = LitSeq.empty,
      val productOrService: CodeableConcept,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val subdetailSequence: LitSeq[PositiveInt] = LitSeq.empty,
      val detail: LitSeq[AddItem.Detail] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Item extends CompanionFor[Item] {
    implicit def summonObjectAndCompanionItem_950445981(o: Item): ObjectAndCompanion[Item, Item.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Item
    override type ParentType   = Item
    override val parentType: CompanionFor[ResourceType] = Item
    object Adjudication extends CompanionFor[Adjudication] {
      implicit def summonObjectAndCompanionAdjudication_996415765(
          o: Adjudication): ObjectAndCompanion[Adjudication, Adjudication.type] = ObjectAndCompanion(o, this)
      override type ResourceType = Adjudication
      override type ParentType   = Adjudication
      override val parentType: CompanionFor[ResourceType] = Adjudication
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
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value, reason, amount, category, extension, modifierExtension)
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
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object Detail extends CompanionFor[Detail] {
      implicit def summonObjectAndCompanionDetail_722948934(o: Detail): ObjectAndCompanion[Detail, Detail.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Detail
      override type ParentType   = Detail
      override val parentType: CompanionFor[ResourceType] = Detail
      object SubDetail extends CompanionFor[SubDetail] {
        implicit def summonObjectAndCompanionSubDetail_33173921(o: SubDetail): ObjectAndCompanion[SubDetail, SubDetail.type] =
          ObjectAndCompanion(o, this)
        override type ResourceType = SubDetail
        override type ParentType   = SubDetail
        override val parentType: CompanionFor[ResourceType] = SubDetail
        def apply(
            id: Option[String] = None,
            extension: LitSeq[Extension] = LitSeq.empty,
            noteNumber: LitSeq[PositiveInt] = LitSeq.empty,
            adjudication: LitSeq[ClaimResponse.Item.Adjudication] = LitSeq.empty,
            modifierExtension: LitSeq[Extension] = LitSeq.empty,
            subDetailSequence: PositiveInt,
            primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
        ): SubDetail = new SubDetail(
          id,
          extension,
          noteNumber,
          adjudication,
          modifierExtension,
          subDetailSequence,
          primitiveAttributes = primitiveAttributes
        )
        def unapply(
            o: SubDetail): Option[(Option[String], LitSeq[Extension], LitSeq[PositiveInt], LitSeq[ClaimResponse.Item.Adjudication], LitSeq[Extension], PositiveInt)] =
          Some((o.id, o.extension, o.noteNumber, o.adjudication, o.modifierExtension, o.subDetailSequence))
        val id: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
        val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val noteNumber: FHIRComponentFieldMeta[LitSeq[PositiveInt]] =
          FHIRComponentFieldMeta("noteNumber", lTagOf[LitSeq[PositiveInt]], false, lTagOf[PositiveInt])
        val adjudication: FHIRComponentFieldMeta[LitSeq[ClaimResponse.Item.Adjudication]] =
          FHIRComponentFieldMeta(
            "adjudication",
            lTagOf[LitSeq[ClaimResponse.Item.Adjudication]],
            false,
            lTagOf[ClaimResponse.Item.Adjudication])
        val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val subDetailSequence: FHIRComponentFieldMeta[PositiveInt] =
          FHIRComponentFieldMeta("subDetailSequence", lTagOf[PositiveInt], false, lTagOf[PositiveInt])
        val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
          Seq(id, extension, noteNumber, adjudication, modifierExtension, subDetailSequence)
        override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
        override def fields(t: SubDetail): Seq[FHIRComponentField[_]] = Seq(
          FHIRComponentField[Option[String]](id, t.id),
          FHIRComponentField[LitSeq[Extension]](extension, t.extension),
          FHIRComponentField[LitSeq[PositiveInt]](noteNumber, t.noteNumber),
          FHIRComponentField[LitSeq[ClaimResponse.Item.Adjudication]](adjudication, t.adjudication),
          FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
          FHIRComponentField[PositiveInt](subDetailSequence, t.subDetailSequence)
        )
        val baseType: CompanionFor[SubDetail] = this
        val thisName: String                  = "SubDetail"
        def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[SubDetail] =
          checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
            Try(
              new SubDetail(
                cursor.decodeAs[Option[String]]("id", Some(None)),
                cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
                cursor.decodeAs[LitSeq[PositiveInt]]("noteNumber", Some(LitSeq.empty)),
                cursor.decodeAs[LitSeq[ClaimResponse.Item.Adjudication]]("adjudication", Some(LitSeq.empty)),
                cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
                cursor.decodeAs[PositiveInt]("subDetailSequence", None),
                decodeAttributes(cursor)
              )
            ))
      }
      @POJOBoilerplate
      class SubDetail(
          override val id: Option[String] = None,
          override val extension: LitSeq[Extension] = LitSeq.empty,
          val noteNumber: LitSeq[PositiveInt] = LitSeq.empty,
          val adjudication: LitSeq[ClaimResponse.Item.Adjudication] = LitSeq.empty,
          override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
          val subDetailSequence: PositiveInt,
          override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
          extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
      def apply(
          id: Option[String] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          noteNumber: LitSeq[PositiveInt] = LitSeq.empty,
          adjudication: NonEmptyLitSeq[ClaimResponse.Item.Adjudication],
          detailSequence: PositiveInt,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          subDetail: LitSeq[Detail.SubDetail] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Detail = new Detail(
        id,
        extension,
        noteNumber,
        adjudication,
        detailSequence,
        modifierExtension,
        subDetail,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Detail): Option[(Option[String], LitSeq[Extension], LitSeq[PositiveInt], NonEmptyLitSeq[ClaimResponse.Item.Adjudication], PositiveInt, LitSeq[Extension], LitSeq[Detail.SubDetail])] =
        Some((o.id, o.extension, o.noteNumber, o.adjudication, o.detailSequence, o.modifierExtension, o.subDetail))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val noteNumber: FHIRComponentFieldMeta[LitSeq[PositiveInt]] =
        FHIRComponentFieldMeta("noteNumber", lTagOf[LitSeq[PositiveInt]], false, lTagOf[PositiveInt])
      val adjudication: FHIRComponentFieldMeta[NonEmptyLitSeq[ClaimResponse.Item.Adjudication]] =
        FHIRComponentFieldMeta(
          "adjudication",
          lTagOf[NonEmptyLitSeq[ClaimResponse.Item.Adjudication]],
          false,
          lTagOf[ClaimResponse.Item.Adjudication])
      val detailSequence: FHIRComponentFieldMeta[PositiveInt] =
        FHIRComponentFieldMeta("detailSequence", lTagOf[PositiveInt], false, lTagOf[PositiveInt])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val subDetail: FHIRComponentFieldMeta[LitSeq[Detail.SubDetail]] =
        FHIRComponentFieldMeta("subDetail", lTagOf[LitSeq[Detail.SubDetail]], false, lTagOf[Detail.SubDetail])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
        Seq(id, extension, noteNumber, adjudication, detailSequence, modifierExtension, subDetail)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Detail): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[PositiveInt]](noteNumber, t.noteNumber),
        FHIRComponentField[NonEmptyLitSeq[ClaimResponse.Item.Adjudication]](adjudication, t.adjudication),
        FHIRComponentField[PositiveInt](detailSequence, t.detailSequence),
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
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[PositiveInt]]("noteNumber", Some(LitSeq.empty)),
              cursor.decodeAs[NonEmptyLitSeq[ClaimResponse.Item.Adjudication]]("adjudication", None),
              cursor.decodeAs[PositiveInt]("detailSequence", None),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Detail.SubDetail]]("subDetail", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Detail(
        override val id: Option[String] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val noteNumber: LitSeq[PositiveInt] = LitSeq.empty,
        val adjudication: NonEmptyLitSeq[ClaimResponse.Item.Adjudication],
        val detailSequence: PositiveInt,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        val subDetail: LitSeq[Detail.SubDetail] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        noteNumber: LitSeq[PositiveInt] = LitSeq.empty,
        itemSequence: PositiveInt,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        adjudication: NonEmptyLitSeq[Item.Adjudication],
        detail: LitSeq[Item.Detail] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Item = new Item(
      id,
      extension,
      noteNumber,
      itemSequence,
      modifierExtension,
      adjudication,
      detail,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Item): Option[(Option[String], LitSeq[Extension], LitSeq[PositiveInt], PositiveInt, LitSeq[Extension], NonEmptyLitSeq[Item.Adjudication], LitSeq[Item.Detail])] =
      Some((o.id, o.extension, o.noteNumber, o.itemSequence, o.modifierExtension, o.adjudication, o.detail))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val noteNumber: FHIRComponentFieldMeta[LitSeq[PositiveInt]] =
      FHIRComponentFieldMeta("noteNumber", lTagOf[LitSeq[PositiveInt]], false, lTagOf[PositiveInt])
    val itemSequence: FHIRComponentFieldMeta[PositiveInt] =
      FHIRComponentFieldMeta("itemSequence", lTagOf[PositiveInt], false, lTagOf[PositiveInt])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val adjudication: FHIRComponentFieldMeta[NonEmptyLitSeq[Item.Adjudication]] =
      FHIRComponentFieldMeta("adjudication", lTagOf[NonEmptyLitSeq[Item.Adjudication]], false, lTagOf[Item.Adjudication])
    val detail: FHIRComponentFieldMeta[LitSeq[Item.Detail]] =
      FHIRComponentFieldMeta("detail", lTagOf[LitSeq[Item.Detail]], false, lTagOf[Item.Detail])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, extension, noteNumber, itemSequence, modifierExtension, adjudication, detail)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Item): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[PositiveInt]](noteNumber, t.noteNumber),
      FHIRComponentField[PositiveInt](itemSequence, t.itemSequence),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[NonEmptyLitSeq[Item.Adjudication]](adjudication, t.adjudication),
      FHIRComponentField[LitSeq[Item.Detail]](detail, t.detail)
    )
    val baseType: CompanionFor[Item] = this
    val thisName: String             = "Item"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Item] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Item(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[PositiveInt]]("noteNumber", Some(LitSeq.empty)),
            cursor.decodeAs[PositiveInt]("itemSequence", None),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[NonEmptyLitSeq[Item.Adjudication]]("adjudication", None),
            cursor.decodeAs[LitSeq[Item.Detail]]("detail", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Item(
      override val id: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val noteNumber: LitSeq[PositiveInt] = LitSeq.empty,
      val itemSequence: PositiveInt,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val adjudication: NonEmptyLitSeq[Item.Adjudication],
      val detail: LitSeq[Item.Detail] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Insurance extends CompanionFor[Insurance] {
    implicit def summonObjectAndCompanionInsurance_1132913284(o: Insurance): ObjectAndCompanion[Insurance, Insurance.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Insurance
    override type ParentType   = Insurance
    override val parentType: CompanionFor[ResourceType] = Insurance
    def apply(
        id: Option[String] = None,
        focal: Boolean,
        sequence: PositiveInt,
        coverage: Reference,
        extension: LitSeq[Extension] = LitSeq.empty,
        claimResponse: Option[Reference] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        businessArrangement: Option[String] = None,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Insurance = new Insurance(
      id,
      focal,
      sequence,
      coverage,
      extension,
      claimResponse,
      modifierExtension,
      businessArrangement,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Insurance): Option[(Option[String], Boolean, PositiveInt, Reference, LitSeq[Extension], Option[Reference], LitSeq[Extension], Option[String])] =
      Some((o.id, o.focal, o.sequence, o.coverage, o.extension, o.claimResponse, o.modifierExtension, o.businessArrangement))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val focal: FHIRComponentFieldMeta[Boolean] =
      FHIRComponentFieldMeta("focal", lTagOf[Boolean], false, lTagOf[Boolean])
    val sequence: FHIRComponentFieldMeta[PositiveInt] =
      FHIRComponentFieldMeta("sequence", lTagOf[PositiveInt], false, lTagOf[PositiveInt])
    val coverage: FHIRComponentFieldMeta[Reference] =
      FHIRComponentFieldMeta("coverage", lTagOf[Reference], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val claimResponse: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("claimResponse", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val businessArrangement: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("businessArrangement", lTagOf[Option[String]], false, lTagOf[String])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, focal, sequence, coverage, extension, claimResponse, modifierExtension, businessArrangement)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Insurance): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Boolean](focal, t.focal),
      FHIRComponentField[PositiveInt](sequence, t.sequence),
      FHIRComponentField[Reference](coverage, t.coverage),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Reference]](claimResponse, t.claimResponse),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[String]](businessArrangement, t.businessArrangement)
    )
    val baseType: CompanionFor[Insurance] = this
    val thisName: String                  = "Insurance"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Insurance] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Insurance(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Boolean]("focal", None),
            cursor.decodeAs[PositiveInt]("sequence", None),
            cursor.decodeAs[Reference]("coverage", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Reference]]("claimResponse", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("businessArrangement", Some(None)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Insurance(
      override val id: Option[String] = None,
      val focal: Boolean,
      val sequence: PositiveInt,
      val coverage: Reference,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val claimResponse: Option[Reference] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val businessArrangement: Option[String] = None,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object ProcessNote extends CompanionFor[ProcessNote] {
    implicit def summonObjectAndCompanionProcessNote385381832(o: ProcessNote): ObjectAndCompanion[ProcessNote, ProcessNote.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = ProcessNote
    override type ParentType   = ProcessNote
    override val parentType: CompanionFor[ResourceType] = ProcessNote
    def apply(
        id: Option[String] = None,
        `type`: Option[NOTE_TYPE] = None,
        text: String,
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
        o: ProcessNote): Option[(Option[String], Option[NOTE_TYPE], String, Option[PositiveInt], Option[CodeableConcept], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.`type`, o.text, o.number, o.language, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[Option[NOTE_TYPE]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[NOTE_TYPE]], false, lTagOf[NOTE_TYPE])
    val text: FHIRComponentFieldMeta[String] =
      FHIRComponentFieldMeta("text", lTagOf[String], false, lTagOf[String])
    val number: FHIRComponentFieldMeta[Option[PositiveInt]] =
      FHIRComponentFieldMeta("number", lTagOf[Option[PositiveInt]], false, lTagOf[PositiveInt])
    val language: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("language", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, `type`, text, number, language, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: ProcessNote): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[NOTE_TYPE]](`type`, t.`type`),
      FHIRComponentField[String](text, t.text),
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
            cursor.decodeAs[String]("text", None),
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
      val text: String,
      val number: Option[PositiveInt] = None,
      val language: Option[CodeableConcept] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Payment extends CompanionFor[Payment] {
    implicit def summonObjectAndCompanionPayment_1284679032(o: Payment): ObjectAndCompanion[Payment, Payment.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Payment
    override type ParentType   = Payment
    override val parentType: CompanionFor[ResourceType] = Payment
    def apply(
        id: Option[String] = None,
        `type`: CodeableConcept,
        date: Option[FHIRDate] = None,
        amount: Money,
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
        o: Payment): Option[(Option[String], CodeableConcept, Option[FHIRDate], Money, LitSeq[Extension], Option[Money], Option[Identifier], Option[CodeableConcept], LitSeq[Extension])] =
      Some((o.id, o.`type`, o.date, o.amount, o.extension, o.adjustment, o.identifier, o.adjustmentReason, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("type", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val date: FHIRComponentFieldMeta[Option[FHIRDate]] =
      FHIRComponentFieldMeta("date", lTagOf[Option[FHIRDate]], false, lTagOf[FHIRDate])
    val amount: FHIRComponentFieldMeta[Money] =
      FHIRComponentFieldMeta("amount", lTagOf[Money], false, lTagOf[Money])
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
      FHIRComponentField[CodeableConcept](`type`, t.`type`),
      FHIRComponentField[Option[FHIRDate]](date, t.date),
      FHIRComponentField[Money](amount, t.amount),
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
            cursor.decodeAs[CodeableConcept]("type", None),
            cursor.decodeAs[Option[FHIRDate]]("date", Some(None)),
            cursor.decodeAs[Money]("amount", None),
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
      val `type`: CodeableConcept,
      val date: Option[FHIRDate] = None,
      val amount: Money,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val adjustment: Option[Money] = None,
      val identifier: Option[Identifier] = None,
      val adjustmentReason: Option[CodeableConcept] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Error extends CompanionFor[Error] {
    implicit def summonObjectAndCompanionError342772155(o: Error): ObjectAndCompanion[Error, Error.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Error
    override type ParentType   = Error
    override val parentType: CompanionFor[ResourceType] = Error
    def apply(
        id: Option[String] = None,
        code: CodeableConcept,
        extension: LitSeq[Extension] = LitSeq.empty,
        itemSequence: Option[PositiveInt] = None,
        detailSequence: Option[PositiveInt] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        subDetailSequence: Option[PositiveInt] = None,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Error = new Error(
      id,
      code,
      extension,
      itemSequence,
      detailSequence,
      modifierExtension,
      subDetailSequence,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Error): Option[(Option[String], CodeableConcept, LitSeq[Extension], Option[PositiveInt], Option[PositiveInt], LitSeq[Extension], Option[PositiveInt])] =
      Some((o.id, o.code, o.extension, o.itemSequence, o.detailSequence, o.modifierExtension, o.subDetailSequence))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val code: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("code", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val itemSequence: FHIRComponentFieldMeta[Option[PositiveInt]] =
      FHIRComponentFieldMeta("itemSequence", lTagOf[Option[PositiveInt]], false, lTagOf[PositiveInt])
    val detailSequence: FHIRComponentFieldMeta[Option[PositiveInt]] =
      FHIRComponentFieldMeta("detailSequence", lTagOf[Option[PositiveInt]], false, lTagOf[PositiveInt])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val subDetailSequence: FHIRComponentFieldMeta[Option[PositiveInt]] =
      FHIRComponentFieldMeta("subDetailSequence", lTagOf[Option[PositiveInt]], false, lTagOf[PositiveInt])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, code, extension, itemSequence, detailSequence, modifierExtension, subDetailSequence)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Error): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[CodeableConcept](code, t.code),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[PositiveInt]](itemSequence, t.itemSequence),
      FHIRComponentField[Option[PositiveInt]](detailSequence, t.detailSequence),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[PositiveInt]](subDetailSequence, t.subDetailSequence)
    )
    val baseType: CompanionFor[Error] = this
    val thisName: String              = "Error"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Error] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Error(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[CodeableConcept]("code", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[PositiveInt]]("itemSequence", Some(None)),
            cursor.decodeAs[Option[PositiveInt]]("detailSequence", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[PositiveInt]]("subDetailSequence", Some(None)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Error(
      override val id: Option[String] = None,
      val code: CodeableConcept,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val itemSequence: Option[PositiveInt] = None,
      val detailSequence: Option[PositiveInt] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val subDetailSequence: Option[PositiveInt] = None,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Total extends CompanionFor[Total] {
    implicit def summonObjectAndCompanionTotal_1144768223(o: Total): ObjectAndCompanion[Total, Total.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Total
    override type ParentType   = Total
    override val parentType: CompanionFor[ResourceType] = Total
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
    def unapply(o: Total): Option[(Option[String], Money, CodeableConcept, LitSeq[Extension], LitSeq[Extension])] = Some(
      (o.id, o.amount, o.category, o.extension, o.modifierExtension))
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
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, amount, category, extension, modifierExtension)
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
  def apply(
      id: Option[String] = None,
      use: CLAIM_USE,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      `type`: CodeableConcept,
      form: Option[Attachment] = None,
      status: FM_STATUS,
      subType: Option[CodeableConcept] = None,
      patient: Reference,
      created: FHIRDateTime,
      insurer: Reference,
      request: Option[Reference] = None,
      outcome: REMITTANCE_OUTCOME,
      language: Option[LANGUAGES] = None,
      formCode: Option[CodeableConcept] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      requestor: Option[Reference] = None,
      payeeType: Option[CodeableConcept] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      preAuthRef: Option[String] = None,
      disposition: Option[String] = None,
      adjudication: LitSeq[ClaimResponse.Item.Adjudication] = LitSeq.empty,
      fundsReserve: Option[CodeableConcept] = None,
      implicitRules: Option[UriStr] = None,
      preAuthPeriod: Option[Period] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      communicationRequest: LitSeq[Reference] = LitSeq.empty,
      total: LitSeq[ClaimResponse.Total] = LitSeq.empty,
      error: LitSeq[ClaimResponse.Error] = LitSeq.empty,
      payment: Option[ClaimResponse.Payment] = None,
      processNote: LitSeq[ClaimResponse.ProcessNote] = LitSeq.empty,
      insurance: LitSeq[ClaimResponse.Insurance] = LitSeq.empty,
      item: LitSeq[ClaimResponse.Item] = LitSeq.empty,
      addItem: LitSeq[ClaimResponse.AddItem] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): ClaimResponse = new ClaimResponse(
    id,
    use,
    meta,
    text,
    `type`,
    form,
    status,
    subType,
    patient,
    created,
    insurer,
    request,
    outcome,
    language,
    formCode,
    contained,
    extension,
    requestor,
    payeeType,
    identifier,
    preAuthRef,
    disposition,
    adjudication,
    fundsReserve,
    implicitRules,
    preAuthPeriod,
    modifierExtension,
    communicationRequest,
    total,
    error,
    payment,
    processNote,
    insurance,
    item,
    addItem,
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
  val status: FHIRComponentFieldMeta[FM_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[FM_STATUS], false, lTagOf[FM_STATUS])
  val subType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("subType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val patient: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("patient", lTagOf[Reference], false, lTagOf[Reference])
  val created: FHIRComponentFieldMeta[FHIRDateTime] =
    FHIRComponentFieldMeta("created", lTagOf[FHIRDateTime], false, lTagOf[FHIRDateTime])
  val insurer: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("insurer", lTagOf[Reference], false, lTagOf[Reference])
  val request: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("request", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val outcome: FHIRComponentFieldMeta[REMITTANCE_OUTCOME] =
    FHIRComponentFieldMeta("outcome", lTagOf[REMITTANCE_OUTCOME], false, lTagOf[REMITTANCE_OUTCOME])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val formCode: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("formCode", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val requestor: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("requestor", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val payeeType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("payeeType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val preAuthRef: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("preAuthRef", lTagOf[Option[String]], false, lTagOf[String])
  val disposition: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("disposition", lTagOf[Option[String]], false, lTagOf[String])
  val adjudication: FHIRComponentFieldMeta[LitSeq[ClaimResponse.Item.Adjudication]] =
    FHIRComponentFieldMeta(
      "adjudication",
      lTagOf[LitSeq[ClaimResponse.Item.Adjudication]],
      false,
      lTagOf[ClaimResponse.Item.Adjudication])
  val fundsReserve: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("fundsReserve", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val preAuthPeriod: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("preAuthPeriod", lTagOf[Option[Period]], false, lTagOf[Period])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val communicationRequest: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("communicationRequest", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val total: FHIRComponentFieldMeta[LitSeq[ClaimResponse.Total]] =
    FHIRComponentFieldMeta("total", lTagOf[LitSeq[ClaimResponse.Total]], false, lTagOf[ClaimResponse.Total])
  val error: FHIRComponentFieldMeta[LitSeq[ClaimResponse.Error]] =
    FHIRComponentFieldMeta("error", lTagOf[LitSeq[ClaimResponse.Error]], false, lTagOf[ClaimResponse.Error])
  val payment: FHIRComponentFieldMeta[Option[ClaimResponse.Payment]] =
    FHIRComponentFieldMeta("payment", lTagOf[Option[ClaimResponse.Payment]], false, lTagOf[ClaimResponse.Payment])
  val processNote: FHIRComponentFieldMeta[LitSeq[ClaimResponse.ProcessNote]] =
    FHIRComponentFieldMeta("processNote", lTagOf[LitSeq[ClaimResponse.ProcessNote]], false, lTagOf[ClaimResponse.ProcessNote])
  val insurance: FHIRComponentFieldMeta[LitSeq[ClaimResponse.Insurance]] =
    FHIRComponentFieldMeta("insurance", lTagOf[LitSeq[ClaimResponse.Insurance]], false, lTagOf[ClaimResponse.Insurance])
  val item: FHIRComponentFieldMeta[LitSeq[ClaimResponse.Item]] =
    FHIRComponentFieldMeta("item", lTagOf[LitSeq[ClaimResponse.Item]], false, lTagOf[ClaimResponse.Item])
  val addItem: FHIRComponentFieldMeta[LitSeq[ClaimResponse.AddItem]] =
    FHIRComponentFieldMeta("addItem", lTagOf[LitSeq[ClaimResponse.AddItem]], false, lTagOf[ClaimResponse.AddItem])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    use,
    meta,
    text,
    `type`,
    form,
    status,
    subType,
    patient,
    created,
    insurer,
    request,
    outcome,
    language,
    formCode,
    contained,
    extension,
    requestor,
    payeeType,
    identifier,
    preAuthRef,
    disposition,
    adjudication,
    fundsReserve,
    implicitRules,
    preAuthPeriod,
    modifierExtension,
    communicationRequest,
    total,
    error,
    payment,
    processNote,
    insurance,
    item,
    addItem
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: ClaimResponse): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[CLAIM_USE](use, t.use),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[CodeableConcept](`type`, t.`type`),
    FHIRComponentField[Option[Attachment]](form, t.form),
    FHIRComponentField[FM_STATUS](status, t.status),
    FHIRComponentField[Option[CodeableConcept]](subType, t.subType),
    FHIRComponentField[Reference](patient, t.patient),
    FHIRComponentField[FHIRDateTime](created, t.created),
    FHIRComponentField[Reference](insurer, t.insurer),
    FHIRComponentField[Option[Reference]](request, t.request),
    FHIRComponentField[REMITTANCE_OUTCOME](outcome, t.outcome),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Option[CodeableConcept]](formCode, t.formCode),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Reference]](requestor, t.requestor),
    FHIRComponentField[Option[CodeableConcept]](payeeType, t.payeeType),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[String]](preAuthRef, t.preAuthRef),
    FHIRComponentField[Option[String]](disposition, t.disposition),
    FHIRComponentField[LitSeq[ClaimResponse.Item.Adjudication]](adjudication, t.adjudication),
    FHIRComponentField[Option[CodeableConcept]](fundsReserve, t.fundsReserve),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[Period]](preAuthPeriod, t.preAuthPeriod),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[Reference]](communicationRequest, t.communicationRequest),
    FHIRComponentField[LitSeq[ClaimResponse.Total]](total, t.total),
    FHIRComponentField[LitSeq[ClaimResponse.Error]](error, t.error),
    FHIRComponentField[Option[ClaimResponse.Payment]](payment, t.payment),
    FHIRComponentField[LitSeq[ClaimResponse.ProcessNote]](processNote, t.processNote),
    FHIRComponentField[LitSeq[ClaimResponse.Insurance]](insurance, t.insurance),
    FHIRComponentField[LitSeq[ClaimResponse.Item]](item, t.item),
    FHIRComponentField[LitSeq[ClaimResponse.AddItem]](addItem, t.addItem)
  )
  def extractId(t: ClaimResponse): Option[String]                                    = t.id
  def extractUse(t: ClaimResponse): CLAIM_USE                                        = t.use
  def extractMeta(t: ClaimResponse): Option[Meta]                                    = t.meta
  def extractText(t: ClaimResponse): Option[Narrative]                               = t.text
  def extractType(t: ClaimResponse): CodeableConcept                                 = t.`type`
  def extractForm(t: ClaimResponse): Option[Attachment]                              = t.form
  def extractStatus(t: ClaimResponse): FM_STATUS                                     = t.status
  def extractSubType(t: ClaimResponse): Option[CodeableConcept]                      = t.subType
  def extractPatient(t: ClaimResponse): Reference                                    = t.patient
  def extractCreated(t: ClaimResponse): FHIRDateTime                                 = t.created
  def extractInsurer(t: ClaimResponse): Reference                                    = t.insurer
  def extractRequest(t: ClaimResponse): Option[Reference]                            = t.request
  def extractOutcome(t: ClaimResponse): REMITTANCE_OUTCOME                           = t.outcome
  def extractLanguage(t: ClaimResponse): Option[LANGUAGES]                           = t.language
  def extractFormCode(t: ClaimResponse): Option[CodeableConcept]                     = t.formCode
  def extractContained(t: ClaimResponse): LitSeq[Resource]                           = t.contained
  def extractExtension(t: ClaimResponse): LitSeq[Extension]                          = t.extension
  def extractRequestor(t: ClaimResponse): Option[Reference]                          = t.requestor
  def extractPayeeType(t: ClaimResponse): Option[CodeableConcept]                    = t.payeeType
  def extractIdentifier(t: ClaimResponse): LitSeq[Identifier]                        = t.identifier
  def extractPreAuthRef(t: ClaimResponse): Option[String]                            = t.preAuthRef
  def extractDisposition(t: ClaimResponse): Option[String]                           = t.disposition
  def extractAdjudication(t: ClaimResponse): LitSeq[ClaimResponse.Item.Adjudication] = t.adjudication
  def extractFundsReserve(t: ClaimResponse): Option[CodeableConcept]                 = t.fundsReserve
  def extractImplicitRules(t: ClaimResponse): Option[UriStr]                         = t.implicitRules
  def extractPreAuthPeriod(t: ClaimResponse): Option[Period]                         = t.preAuthPeriod
  def extractModifierExtension(t: ClaimResponse): LitSeq[Extension]                  = t.modifierExtension
  def extractCommunicationRequest(t: ClaimResponse): LitSeq[Reference]               = t.communicationRequest
  def extractTotal(t: ClaimResponse): LitSeq[ClaimResponse.Total]                    = t.total
  def extractError(t: ClaimResponse): LitSeq[ClaimResponse.Error]                    = t.error
  def extractPayment(t: ClaimResponse): Option[ClaimResponse.Payment]                = t.payment
  def extractProcessNote(t: ClaimResponse): LitSeq[ClaimResponse.ProcessNote]        = t.processNote
  def extractInsurance(t: ClaimResponse): LitSeq[ClaimResponse.Insurance]            = t.insurance
  def extractItem(t: ClaimResponse): LitSeq[ClaimResponse.Item]                      = t.item
  def extractAddItem(t: ClaimResponse): LitSeq[ClaimResponse.AddItem]                = t.addItem
  override val thisName: String                                                      = "ClaimResponse"
  override val searchParams: Map[String, ClaimResponse => Seq[Any]] = Map(
    "requestor"    -> (obj => obj.requestor.toSeq),
    "request"      -> (obj => obj.request.toSeq),
    "identifier"   -> (obj => obj.identifier.toSeq),
    "disposition"  -> (obj => obj.disposition.toSeq),
    "outcome"      -> (obj => Seq(obj.outcome)),
    "status"       -> (obj => Seq(obj.status)),
    "use"          -> (obj => Seq(obj.use)),
    "insurer"      -> (obj => Seq(obj.insurer)),
    "payment-date" -> (obj => obj.payment.flatMap(_.date).toSeq),
    "created"      -> (obj => Seq(obj.created)),
    "patient"      -> (obj => Seq(obj.patient))
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ClaimResponse] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new ClaimResponse(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[CLAIM_USE]("use", None),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[CodeableConcept]("type", None),
          cursor.decodeAs[Option[Attachment]]("form", Some(None)),
          cursor.decodeAs[FM_STATUS]("status", None),
          cursor.decodeAs[Option[CodeableConcept]]("subType", Some(None)),
          cursor.decodeAs[Reference]("patient", None),
          cursor.decodeAs[FHIRDateTime]("created", None),
          cursor.decodeAs[Reference]("insurer", None),
          cursor.decodeAs[Option[Reference]]("request", Some(None)),
          cursor.decodeAs[REMITTANCE_OUTCOME]("outcome", None),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("formCode", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("requestor", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("payeeType", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("preAuthRef", Some(None)),
          cursor.decodeAs[Option[String]]("disposition", Some(None)),
          cursor.decodeAs[LitSeq[ClaimResponse.Item.Adjudication]]("adjudication", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("fundsReserve", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[Period]]("preAuthPeriod", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("communicationRequest", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[ClaimResponse.Total]]("total", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[ClaimResponse.Error]]("error", Some(LitSeq.empty)),
          cursor.decodeAs[Option[ClaimResponse.Payment]]("payment", Some(None)),
          cursor.decodeAs[LitSeq[ClaimResponse.ProcessNote]]("processNote", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[ClaimResponse.Insurance]]("insurance", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[ClaimResponse.Item]]("item", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[ClaimResponse.AddItem]]("addItem", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** This resource provides the adjudication details from the processing of a Claim resource.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields use, `type`, form, status, subType, patient, created, insurer, request, outcome, formCode, requestor,
  *   payeeType, identifier, preAuthRef, disposition, adjudication, fundsReserve, preAuthPeriod, communicationRequest, total,
  *   error, payment, processNote, insurance, item, addItem.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param use
  *   - A code to indicate whether the nature of the request is: to request adjudication of products and services previously
  *   rendered; or requesting authorization and adjudication for provision in the future; or requesting the non-binding
  *   adjudication of the listed products and services which could be provided in the future.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *   not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *   resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to
  *   make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be
  *   represented in the narrative to ensure clinical safety.
  * @param `type`
  *   - A finer grained suite of claim type codes which may convey additional information such as Inpatient vs Outpatient and/or a
  *   specialty service.
  * @param form
  *   - The actual form, by reference or inclusion, for printing the content or an EOB.
  * @param status
  *   - The status of the resource instance.
  * @param subType
  *   - A finer grained suite of claim type codes which may convey additional information such as Inpatient vs Outpatient and/or a
  *   specialty service.
  * @param patient
  *   - The party to whom the professional services and/or products have been supplied or are being considered and for whom actual
  *   for facast reimbursement is sought.
  * @param created
  *   - The date this resource was created.
  * @param insurer
  *   - The party responsible for authorization, adjudication and reimbursement.
  * @param request
  *   - Original request resource reference.
  * @param outcome
  *   - The outcome of the claim, predetermination, or preauthorization processing.
  * @param language
  *   - The base language in which the resource is written.
  * @param formCode
  *   - A code for the form to be used for printing the content.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param requestor
  *   - The provider which is responsible for the claim, predetermination or preauthorization.
  * @param payeeType
  *   - Type of Party to be reimbursed: subscriber, provider, other.
  * @param identifier
  *   - A unique identifier assigned to this claim response.
  * @param preAuthRef
  *   - Reference from the Insurer which is used in later communications which refers to this adjudication.
  * @param disposition
  *   - A human readable description of the status of the adjudication.
  * @param adjudication
  *   - The adjudication results which are presented at the header level rather than at the line-item or add-item levels.
  * @param fundsReserve
  *   - A code, used only on a response to a preauthorization, to indicate whether the benefits payable have been reserved and for
  *   whom.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param preAuthPeriod
  *   - The time frame during which this authorization is effective.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *   the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually
  *   modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict
  *   set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param communicationRequest
  *   - Request for additional supporting or authorizing information.
  * @param total
  *   - Categorized monetary totals for the adjudication.
  * @param error
  *   - Errors encountered during the processing of the adjudication.
  * @param payment
  *   - Payment details for the adjudication of the claim.
  * @param processNote
  *   - A note that describes or explains adjudication results in a human readable form.
  * @param insurance
  *   - Financial instruments for reimbursement for the health care products and services specified on the claim.
  * @param item
  *   - A claim line. Either a simple (a product or service) or a 'group' of details which can also be a simple items or groups of
  *   sub-details.
  * @param addItem
  *   - The first-tier service adjudications for payor added product or service lines.
  */
@POJOBoilerplate
class ClaimResponse(
    override val id: Option[String] = None,
    val use: CLAIM_USE,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val `type`: CodeableConcept,
    val form: Option[Attachment] = None,
    val status: FM_STATUS,
    val subType: Option[CodeableConcept] = None,
    val patient: Reference,
    val created: FHIRDateTime,
    val insurer: Reference,
    val request: Option[Reference] = None,
    val outcome: REMITTANCE_OUTCOME,
    override val language: Option[LANGUAGES] = None,
    val formCode: Option[CodeableConcept] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val requestor: Option[Reference] = None,
    val payeeType: Option[CodeableConcept] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val preAuthRef: Option[String] = None,
    val disposition: Option[String] = None,
    val adjudication: LitSeq[ClaimResponse.Item.Adjudication] = LitSeq.empty,
    val fundsReserve: Option[CodeableConcept] = None,
    override val implicitRules: Option[UriStr] = None,
    val preAuthPeriod: Option[Period] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val communicationRequest: LitSeq[Reference] = LitSeq.empty,
    val total: LitSeq[ClaimResponse.Total] = LitSeq.empty,
    val error: LitSeq[ClaimResponse.Error] = LitSeq.empty,
    val payment: Option[ClaimResponse.Payment] = None,
    val processNote: LitSeq[ClaimResponse.ProcessNote] = LitSeq.empty,
    val insurance: LitSeq[ClaimResponse.Insurance] = LitSeq.empty,
    val item: LitSeq[ClaimResponse.Item] = LitSeq.empty,
    val addItem: LitSeq[ClaimResponse.AddItem] = LitSeq.empty,
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
  override val thisTypeName: String = "ClaimResponse"
}
