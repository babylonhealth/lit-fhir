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
import com.babylonhealth.lit.hl7.{ CLAIM_USE, FM_STATUS }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Claim extends CompanionFor[Claim] {
  override val baseType: CompanionFor[Claim] = Claim
  override val profileUrl: Option[String]    = Some("http://hl7.org/fhir/StructureDefinition/Claim")
  object Item extends CompanionFor[Item] {
    object Detail extends CompanionFor[Detail] {
      object SubDetail extends CompanionFor[SubDetail] {
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
            programCode: LitSeq[CodeableConcept] = LitSeq.empty,
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
          programCode,
          productOrService,
          modifierExtension,
          primitiveAttributes = primitiveAttributes
        )
        def unapply(
            o: SubDetail): Option[(Option[String], Option[Money], LitSeq[Reference], Option[BigDecimal], Option[CodeableConcept], PositiveInt, Option[CodeableConcept], LitSeq[CodeableConcept], Option[Quantity], LitSeq[Extension], Option[Money], LitSeq[CodeableConcept], CodeableConcept, LitSeq[Extension])] =
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
              o.programCode,
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
        val programCode: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
          FHIRComponentFieldMeta("programCode", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
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
          programCode,
          productOrService,
          modifierExtension)
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
          FHIRComponentField[LitSeq[CodeableConcept]](programCode, t.programCode),
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
                cursor.decodeAs[LitSeq[CodeableConcept]]("programCode", Some(LitSeq.empty)),
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
          val programCode: LitSeq[CodeableConcept] = LitSeq.empty,
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
          programCode: LitSeq[CodeableConcept] = LitSeq.empty,
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
        programCode,
        productOrService,
        modifierExtension,
        subDetail,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Detail): Option[(Option[String], Option[Money], LitSeq[Reference], Option[BigDecimal], Option[CodeableConcept], PositiveInt, Option[CodeableConcept], LitSeq[CodeableConcept], Option[Quantity], LitSeq[Extension], Option[Money], LitSeq[CodeableConcept], CodeableConcept, LitSeq[Extension], LitSeq[Detail.SubDetail])] =
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
            o.programCode,
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
      val programCode: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
        FHIRComponentFieldMeta("programCode", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
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
        programCode,
        productOrService,
        modifierExtension,
        subDetail)
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
        FHIRComponentField[LitSeq[CodeableConcept]](programCode, t.programCode),
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
              cursor.decodeAs[LitSeq[CodeableConcept]]("programCode", Some(LitSeq.empty)),
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
        val programCode: LitSeq[CodeableConcept] = LitSeq.empty,
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
        programCode: LitSeq[CodeableConcept] = LitSeq.empty,
        serviced: Option[Item.ServicedChoice] = None,
        location: Option[Item.LocationChoice] = None,
        careTeamSequence: LitSeq[PositiveInt] = LitSeq.empty,
        productOrService: CodeableConcept,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        diagnosisSequence: LitSeq[PositiveInt] = LitSeq.empty,
        procedureSequence: LitSeq[PositiveInt] = LitSeq.empty,
        informationSequence: LitSeq[PositiveInt] = LitSeq.empty,
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
      programCode,
      serviced,
      location,
      careTeamSequence,
      productOrService,
      modifierExtension,
      diagnosisSequence,
      procedureSequence,
      informationSequence,
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
      programCode,
      serviced,
      location,
      careTeamSequence,
      productOrService,
      modifierExtension,
      diagnosisSequence,
      procedureSequence,
      informationSequence,
      detail
    )
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
      FHIRComponentField[LitSeq[CodeableConcept]](programCode, t.programCode),
      FHIRComponentField[Option[Item.ServicedChoice]](serviced, t.serviced),
      FHIRComponentField[Option[Item.LocationChoice]](location, t.location),
      FHIRComponentField[LitSeq[PositiveInt]](careTeamSequence, t.careTeamSequence),
      FHIRComponentField[CodeableConcept](productOrService, t.productOrService),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[PositiveInt]](diagnosisSequence, t.diagnosisSequence),
      FHIRComponentField[LitSeq[PositiveInt]](procedureSequence, t.procedureSequence),
      FHIRComponentField[LitSeq[PositiveInt]](informationSequence, t.informationSequence),
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
            cursor.decodeAs[LitSeq[CodeableConcept]]("programCode", Some(LitSeq.empty)),
            cursor.decodeOptRef[Union_0503196159]("serviced"),
            cursor.decodeOptRef[Union_0316522316]("location"),
            cursor.decodeAs[LitSeq[PositiveInt]]("careTeamSequence", Some(LitSeq.empty)),
            cursor.decodeAs[CodeableConcept]("productOrService", None),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[PositiveInt]]("diagnosisSequence", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[PositiveInt]]("procedureSequence", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[PositiveInt]]("informationSequence", Some(LitSeq.empty)),
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
      val programCode: LitSeq[CodeableConcept] = LitSeq.empty,
      val serviced: Option[Item.ServicedChoice] = None,
      val location: Option[Item.LocationChoice] = None,
      val careTeamSequence: LitSeq[PositiveInt] = LitSeq.empty,
      val productOrService: CodeableConcept,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val diagnosisSequence: LitSeq[PositiveInt] = LitSeq.empty,
      val procedureSequence: LitSeq[PositiveInt] = LitSeq.empty,
      val informationSequence: LitSeq[PositiveInt] = LitSeq.empty,
      val detail: LitSeq[Item.Detail] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object SupportingInfo extends CompanionFor[SupportingInfo] {
    type ValueChoice  = Choice[Union_0543144563]
    type TimingChoice = Choice[Union_0503196159]
    def apply(
        id: Option[String] = None,
        code: Option[CodeableConcept] = None,
        reason: Option[CodeableConcept] = None,
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
        o: SupportingInfo): Option[(Option[String], Option[CodeableConcept], Option[CodeableConcept], PositiveInt, CodeableConcept, Option[SupportingInfo.ValueChoice], LitSeq[Extension], Option[SupportingInfo.TimingChoice], LitSeq[Extension])] =
      Some((o.id, o.code, o.reason, o.sequence, o.category, o.value, o.extension, o.timing, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val code: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("code", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val reason: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("reason", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
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
    override def fields(t: SupportingInfo): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](code, t.code),
      FHIRComponentField[Option[CodeableConcept]](reason, t.reason),
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
            cursor.decodeAs[Option[CodeableConcept]]("reason", Some(None)),
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
      val reason: Option[CodeableConcept] = None,
      val sequence: PositiveInt,
      val category: CodeableConcept,
      val value: Option[SupportingInfo.ValueChoice] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val timing: Option[SupportingInfo.TimingChoice] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Insurance extends CompanionFor[Insurance] {
    def apply(
        id: Option[String] = None,
        focal: Boolean,
        sequence: PositiveInt,
        coverage: Reference,
        extension: LitSeq[Extension] = LitSeq.empty,
        identifier: Option[Identifier] = None,
        preAuthRef: LitSeq[String] = LitSeq.empty,
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
      identifier,
      preAuthRef,
      claimResponse,
      modifierExtension,
      businessArrangement,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Insurance): Option[(Option[String], Boolean, PositiveInt, Reference, LitSeq[Extension], Option[Identifier], LitSeq[String], Option[Reference], LitSeq[Extension], Option[String])] =
      Some(
        (
          o.id,
          o.focal,
          o.sequence,
          o.coverage,
          o.extension,
          o.identifier,
          o.preAuthRef,
          o.claimResponse,
          o.modifierExtension,
          o.businessArrangement))
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
    val identifier: FHIRComponentFieldMeta[Option[Identifier]] =
      FHIRComponentFieldMeta("identifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
    val preAuthRef: FHIRComponentFieldMeta[LitSeq[String]] =
      FHIRComponentFieldMeta("preAuthRef", lTagOf[LitSeq[String]], false, lTagOf[String])
    val claimResponse: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("claimResponse", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val businessArrangement: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("businessArrangement", lTagOf[Option[String]], false, lTagOf[String])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
      id,
      focal,
      sequence,
      coverage,
      extension,
      identifier,
      preAuthRef,
      claimResponse,
      modifierExtension,
      businessArrangement)
    override def fields(t: Insurance): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Boolean](focal, t.focal),
      FHIRComponentField[PositiveInt](sequence, t.sequence),
      FHIRComponentField[Reference](coverage, t.coverage),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Identifier]](identifier, t.identifier),
      FHIRComponentField[LitSeq[String]](preAuthRef, t.preAuthRef),
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
            cursor.decodeAs[Option[Identifier]]("identifier", Some(None)),
            cursor.decodeAs[LitSeq[String]]("preAuthRef", Some(LitSeq.empty)),
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
      val identifier: Option[Identifier] = None,
      val preAuthRef: LitSeq[String] = LitSeq.empty,
      val claimResponse: Option[Reference] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val businessArrangement: Option[String] = None,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Procedure extends CompanionFor[Procedure] {
    type ProcedureChoice = Choice[Union01025009075]
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
    type DiagnosisChoice = Choice[Union01025009075]
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
    type LocationChoice = Choice[Union00434638053]
    def apply(
        id: Option[String] = None,
        date: FHIRDate,
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
        o: Accident): Option[(Option[String], FHIRDate, Option[CodeableConcept], LitSeq[Extension], Option[Accident.LocationChoice], LitSeq[Extension])] =
      Some((o.id, o.date, o.`type`, o.extension, o.location, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val date: FHIRComponentFieldMeta[FHIRDate] =
      FHIRComponentFieldMeta("date", lTagOf[FHIRDate], false, lTagOf[FHIRDate])
    val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val location: FHIRComponentFieldMeta[Option[Accident.LocationChoice]] =
      FHIRComponentFieldMeta("location", lTagOf[Option[Accident.LocationChoice]], true, lTagOf[Union00434638053])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, date, `type`, extension, location, modifierExtension)
    override def fields(t: Accident): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[FHIRDate](date, t.date),
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
            cursor.decodeAs[FHIRDate]("date", None),
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
      val date: FHIRDate,
      val `type`: Option[CodeableConcept] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val location: Option[Accident.LocationChoice] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object CareTeam extends CompanionFor[CareTeam] {
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
  object Related extends CompanionFor[Related] {
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
  object Payee extends CompanionFor[Payee] {
    def apply(
        id: Option[String] = None,
        `type`: CodeableConcept,
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
        o: Payee): Option[(Option[String], CodeableConcept, Option[Reference], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.`type`, o.party, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("type", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val party: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("party", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, `type`, party, extension, modifierExtension)
    override def fields(t: Payee): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[CodeableConcept](`type`, t.`type`),
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
            cursor.decodeAs[CodeableConcept]("type", None),
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
      val `type`: CodeableConcept,
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
      total: Option[Money] = None,
      status: FM_STATUS,
      subType: Option[CodeableConcept] = None,
      patient: Reference,
      created: FHIRDateTime,
      enterer: Option[Reference] = None,
      insurer: Option[Reference] = None,
      language: Option[LANGUAGES] = None,
      provider: Reference,
      priority: CodeableConcept,
      referral: Option[Reference] = None,
      facility: Option[Reference] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      fundsReserve: Option[CodeableConcept] = None,
      prescription: Option[Reference] = None,
      implicitRules: Option[UriStr] = None,
      billablePeriod: Option[Period] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      originalPrescription: Option[Reference] = None,
      payee: Option[Claim.Payee] = None,
      related: LitSeq[Claim.Related] = LitSeq.empty,
      careTeam: LitSeq[Claim.CareTeam] = LitSeq.empty,
      accident: Option[Claim.Accident] = None,
      diagnosis: LitSeq[Claim.Diagnosis] = LitSeq.empty,
      procedure: LitSeq[Claim.Procedure] = LitSeq.empty,
      insurance: NonEmptyLitSeq[Claim.Insurance],
      supportingInfo: LitSeq[Claim.SupportingInfo] = LitSeq.empty,
      item: LitSeq[Claim.Item] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Claim = new Claim(
    id,
    use,
    meta,
    text,
    `type`,
    total,
    status,
    subType,
    patient,
    created,
    enterer,
    insurer,
    language,
    provider,
    priority,
    referral,
    facility,
    contained,
    extension,
    identifier,
    fundsReserve,
    prescription,
    implicitRules,
    billablePeriod,
    modifierExtension,
    originalPrescription,
    payee,
    related,
    careTeam,
    accident,
    diagnosis,
    procedure,
    insurance,
    supportingInfo,
    item,
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
  val total: FHIRComponentFieldMeta[Option[Money]] =
    FHIRComponentFieldMeta("total", lTagOf[Option[Money]], false, lTagOf[Money])
  val status: FHIRComponentFieldMeta[FM_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[FM_STATUS], false, lTagOf[FM_STATUS])
  val subType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("subType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val patient: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("patient", lTagOf[Reference], false, lTagOf[Reference])
  val created: FHIRComponentFieldMeta[FHIRDateTime] =
    FHIRComponentFieldMeta("created", lTagOf[FHIRDateTime], false, lTagOf[FHIRDateTime])
  val enterer: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("enterer", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val insurer: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("insurer", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val provider: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("provider", lTagOf[Reference], false, lTagOf[Reference])
  val priority: FHIRComponentFieldMeta[CodeableConcept] =
    FHIRComponentFieldMeta("priority", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
  val referral: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("referral", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val facility: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("facility", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val fundsReserve: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("fundsReserve", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val prescription: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("prescription", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val billablePeriod: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("billablePeriod", lTagOf[Option[Period]], false, lTagOf[Period])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val originalPrescription: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("originalPrescription", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val payee: FHIRComponentFieldMeta[Option[Claim.Payee]] =
    FHIRComponentFieldMeta("payee", lTagOf[Option[Claim.Payee]], false, lTagOf[Claim.Payee])
  val related: FHIRComponentFieldMeta[LitSeq[Claim.Related]] =
    FHIRComponentFieldMeta("related", lTagOf[LitSeq[Claim.Related]], false, lTagOf[Claim.Related])
  val careTeam: FHIRComponentFieldMeta[LitSeq[Claim.CareTeam]] =
    FHIRComponentFieldMeta("careTeam", lTagOf[LitSeq[Claim.CareTeam]], false, lTagOf[Claim.CareTeam])
  val accident: FHIRComponentFieldMeta[Option[Claim.Accident]] =
    FHIRComponentFieldMeta("accident", lTagOf[Option[Claim.Accident]], false, lTagOf[Claim.Accident])
  val diagnosis: FHIRComponentFieldMeta[LitSeq[Claim.Diagnosis]] =
    FHIRComponentFieldMeta("diagnosis", lTagOf[LitSeq[Claim.Diagnosis]], false, lTagOf[Claim.Diagnosis])
  val procedure: FHIRComponentFieldMeta[LitSeq[Claim.Procedure]] =
    FHIRComponentFieldMeta("procedure", lTagOf[LitSeq[Claim.Procedure]], false, lTagOf[Claim.Procedure])
  val insurance: FHIRComponentFieldMeta[NonEmptyLitSeq[Claim.Insurance]] =
    FHIRComponentFieldMeta("insurance", lTagOf[NonEmptyLitSeq[Claim.Insurance]], false, lTagOf[Claim.Insurance])
  val supportingInfo: FHIRComponentFieldMeta[LitSeq[Claim.SupportingInfo]] =
    FHIRComponentFieldMeta("supportingInfo", lTagOf[LitSeq[Claim.SupportingInfo]], false, lTagOf[Claim.SupportingInfo])
  val item: FHIRComponentFieldMeta[LitSeq[Claim.Item]] =
    FHIRComponentFieldMeta("item", lTagOf[LitSeq[Claim.Item]], false, lTagOf[Claim.Item])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    use,
    meta,
    text,
    `type`,
    total,
    status,
    subType,
    patient,
    created,
    enterer,
    insurer,
    language,
    provider,
    priority,
    referral,
    facility,
    contained,
    extension,
    identifier,
    fundsReserve,
    prescription,
    implicitRules,
    billablePeriod,
    modifierExtension,
    originalPrescription,
    payee,
    related,
    careTeam,
    accident,
    diagnosis,
    procedure,
    insurance,
    supportingInfo,
    item
  )
  override def fields(t: Claim): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[CLAIM_USE](use, t.use),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[CodeableConcept](`type`, t.`type`),
    FHIRComponentField[Option[Money]](total, t.total),
    FHIRComponentField[FM_STATUS](status, t.status),
    FHIRComponentField[Option[CodeableConcept]](subType, t.subType),
    FHIRComponentField[Reference](patient, t.patient),
    FHIRComponentField[FHIRDateTime](created, t.created),
    FHIRComponentField[Option[Reference]](enterer, t.enterer),
    FHIRComponentField[Option[Reference]](insurer, t.insurer),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Reference](provider, t.provider),
    FHIRComponentField[CodeableConcept](priority, t.priority),
    FHIRComponentField[Option[Reference]](referral, t.referral),
    FHIRComponentField[Option[Reference]](facility, t.facility),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[CodeableConcept]](fundsReserve, t.fundsReserve),
    FHIRComponentField[Option[Reference]](prescription, t.prescription),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[Period]](billablePeriod, t.billablePeriod),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Option[Reference]](originalPrescription, t.originalPrescription),
    FHIRComponentField[Option[Claim.Payee]](payee, t.payee),
    FHIRComponentField[LitSeq[Claim.Related]](related, t.related),
    FHIRComponentField[LitSeq[Claim.CareTeam]](careTeam, t.careTeam),
    FHIRComponentField[Option[Claim.Accident]](accident, t.accident),
    FHIRComponentField[LitSeq[Claim.Diagnosis]](diagnosis, t.diagnosis),
    FHIRComponentField[LitSeq[Claim.Procedure]](procedure, t.procedure),
    FHIRComponentField[NonEmptyLitSeq[Claim.Insurance]](insurance, t.insurance),
    FHIRComponentField[LitSeq[Claim.SupportingInfo]](supportingInfo, t.supportingInfo),
    FHIRComponentField[LitSeq[Claim.Item]](item, t.item)
  )
  def extractId(t: Claim): Option[String]                           = t.id
  def extractUse(t: Claim): CLAIM_USE                               = t.use
  def extractMeta(t: Claim): Option[Meta]                           = t.meta
  def extractText(t: Claim): Option[Narrative]                      = t.text
  def extractType(t: Claim): CodeableConcept                        = t.`type`
  def extractTotal(t: Claim): Option[Money]                         = t.total
  def extractStatus(t: Claim): FM_STATUS                            = t.status
  def extractSubType(t: Claim): Option[CodeableConcept]             = t.subType
  def extractPatient(t: Claim): Reference                           = t.patient
  def extractCreated(t: Claim): FHIRDateTime                        = t.created
  def extractEnterer(t: Claim): Option[Reference]                   = t.enterer
  def extractInsurer(t: Claim): Option[Reference]                   = t.insurer
  def extractLanguage(t: Claim): Option[LANGUAGES]                  = t.language
  def extractProvider(t: Claim): Reference                          = t.provider
  def extractPriority(t: Claim): CodeableConcept                    = t.priority
  def extractReferral(t: Claim): Option[Reference]                  = t.referral
  def extractFacility(t: Claim): Option[Reference]                  = t.facility
  def extractContained(t: Claim): LitSeq[Resource]                  = t.contained
  def extractExtension(t: Claim): LitSeq[Extension]                 = t.extension
  def extractIdentifier(t: Claim): LitSeq[Identifier]               = t.identifier
  def extractFundsReserve(t: Claim): Option[CodeableConcept]        = t.fundsReserve
  def extractPrescription(t: Claim): Option[Reference]              = t.prescription
  def extractImplicitRules(t: Claim): Option[UriStr]                = t.implicitRules
  def extractBillablePeriod(t: Claim): Option[Period]               = t.billablePeriod
  def extractModifierExtension(t: Claim): LitSeq[Extension]         = t.modifierExtension
  def extractOriginalPrescription(t: Claim): Option[Reference]      = t.originalPrescription
  def extractPayee(t: Claim): Option[Claim.Payee]                   = t.payee
  def extractRelated(t: Claim): LitSeq[Claim.Related]               = t.related
  def extractCareTeam(t: Claim): LitSeq[Claim.CareTeam]             = t.careTeam
  def extractAccident(t: Claim): Option[Claim.Accident]             = t.accident
  def extractDiagnosis(t: Claim): LitSeq[Claim.Diagnosis]           = t.diagnosis
  def extractProcedure(t: Claim): LitSeq[Claim.Procedure]           = t.procedure
  def extractInsurance(t: Claim): NonEmptyLitSeq[Claim.Insurance]   = t.insurance
  def extractSupportingInfo(t: Claim): LitSeq[Claim.SupportingInfo] = t.supportingInfo
  def extractItem(t: Claim): LitSeq[Claim.Item]                     = t.item
  override val thisName: String                                     = "Claim"
  override val searchParams: Map[String, Claim => Seq[Any]] = Map(
    "provider"      -> (obj => Seq(obj.provider)),
    "identifier"    -> (obj => obj.identifier.toSeq),
    "care-team"     -> (obj => obj.careTeam.map(_.provider).toSeq),
    "subdetail-udi" -> (obj => obj.item.flatMap(_.detail).flatMap(_.subDetail).flatMap(_.udi).toSeq),
    "status"        -> (obj => Seq(obj.status)),
    "use"           -> (obj => Seq(obj.use)),
    "insurer"       -> (obj => obj.insurer.toSeq),
    "payee"         -> (obj => obj.payee.flatMap(_.party).toSeq),
    "detail-udi"    -> (obj => obj.item.flatMap(_.detail).flatMap(_.udi).toSeq),
    "priority"      -> (obj => Seq(obj.priority)),
    "item-udi"      -> (obj => obj.item.flatMap(_.udi).toSeq),
    "procedure-udi" -> (obj => obj.procedure.flatMap(_.udi).toSeq),
    "facility"      -> (obj => obj.facility.toSeq),
    "enterer"       -> (obj => obj.enterer.toSeq),
    "encounter"     -> (obj => obj.item.flatMap(_.encounter).toSeq),
    "created"       -> (obj => Seq(obj.created)),
    "patient"       -> (obj => Seq(obj.patient))
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Claim] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Claim(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[CLAIM_USE]("use", None),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[CodeableConcept]("type", None),
          cursor.decodeAs[Option[Money]]("total", Some(None)),
          cursor.decodeAs[FM_STATUS]("status", None),
          cursor.decodeAs[Option[CodeableConcept]]("subType", Some(None)),
          cursor.decodeAs[Reference]("patient", None),
          cursor.decodeAs[FHIRDateTime]("created", None),
          cursor.decodeAs[Option[Reference]]("enterer", Some(None)),
          cursor.decodeAs[Option[Reference]]("insurer", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Reference]("provider", None),
          cursor.decodeAs[CodeableConcept]("priority", None),
          cursor.decodeAs[Option[Reference]]("referral", Some(None)),
          cursor.decodeAs[Option[Reference]]("facility", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("fundsReserve", Some(None)),
          cursor.decodeAs[Option[Reference]]("prescription", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[Period]]("billablePeriod", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("originalPrescription", Some(None)),
          cursor.decodeAs[Option[Claim.Payee]]("payee", Some(None)),
          cursor.decodeAs[LitSeq[Claim.Related]]("related", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Claim.CareTeam]]("careTeam", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Claim.Accident]]("accident", Some(None)),
          cursor.decodeAs[LitSeq[Claim.Diagnosis]]("diagnosis", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Claim.Procedure]]("procedure", Some(LitSeq.empty)),
          cursor.decodeAs[NonEmptyLitSeq[Claim.Insurance]]("insurance", None),
          cursor.decodeAs[LitSeq[Claim.SupportingInfo]]("supportingInfo", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Claim.Item]]("item", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields use, `type`, total, status, subType, patient, created, enterer, insurer, provider, priority, referral, facility, identifier, fundsReserve, prescription, billablePeriod, originalPrescription, payee, related, careTeam, accident, diagnosis, procedure, insurance, supportingInfo, item.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param use - A code to indicate whether the nature of the request is: to request adjudication of products and services previously rendered; or requesting authorization and adjudication for provision in the future; or requesting the non-binding adjudication of the listed products and services which could be provided in the future.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param `type` - The category of claim, e.g. oral, pharmacy, vision, institutional, professional.
  * @param total - The total value of the all the items in the claim.
  * @param status - The status of the resource instance.
  * @param subType - A finer grained suite of claim type codes which may convey additional information such as Inpatient vs Outpatient and/or a specialty service.
  * @param patient - The party to whom the professional services and/or products have been supplied or are being considered and for whom actual or forecast reimbursement is sought.
  * @param created - The date this resource was created.
  * @param enterer - Individual who created the claim, predetermination or preauthorization.
  * @param insurer - The Insurer who is target of the request.
  * @param language - The base language in which the resource is written.
  * @param provider - The provider which is responsible for the claim, predetermination or preauthorization.
  * @param priority - The provider-required urgency of processing the request. Typical values include: stat, routine deferred.
  * @param referral - A reference to a referral resource.
  * @param facility - Facility where the services were provided.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param identifier - A unique identifier assigned to this claim.
  * @param fundsReserve - A code to indicate whether and for whom funds are to be reserved for future claims.
  * @param prescription - Prescription to support the dispensing of pharmacy, device or vision products.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param billablePeriod - The period for which charges are being submitted.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param originalPrescription - Original prescription which has been superseded by this prescription to support the dispensing of pharmacy services, medications or products.
  * @param payee - The party to be reimbursed for cost of the products and services according to the terms of the policy.
  * @param related - Other claims which are related to this claim such as prior submissions or claims for related services or for the same event.
  * @param careTeam - The members of the team who provided the products and services.
  * @param accident - Details of an accident which resulted in injuries which required the products and services listed in the claim.
  * @param diagnosis - Information about diagnoses relevant to the claim items.
  * @param procedure - Procedures performed on the patient relevant to the billing items with the claim.
  * @param insurance - Financial instruments for reimbursement for the health care products and services specified on the claim.
  * @param supportingInfo - Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent issues.
  * @param item - A claim line. Either a simple  product or service or a 'group' of details which can each be a simple items or groups of sub-details.
  */
@POJOBoilerplate
class Claim(
    override val id: Option[String] = None,
    val use: CLAIM_USE,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val `type`: CodeableConcept,
    val total: Option[Money] = None,
    val status: FM_STATUS,
    val subType: Option[CodeableConcept] = None,
    val patient: Reference,
    val created: FHIRDateTime,
    val enterer: Option[Reference] = None,
    val insurer: Option[Reference] = None,
    override val language: Option[LANGUAGES] = None,
    val provider: Reference,
    val priority: CodeableConcept,
    val referral: Option[Reference] = None,
    val facility: Option[Reference] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val fundsReserve: Option[CodeableConcept] = None,
    val prescription: Option[Reference] = None,
    override val implicitRules: Option[UriStr] = None,
    val billablePeriod: Option[Period] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val originalPrescription: Option[Reference] = None,
    val payee: Option[Claim.Payee] = None,
    val related: LitSeq[Claim.Related] = LitSeq.empty,
    val careTeam: LitSeq[Claim.CareTeam] = LitSeq.empty,
    val accident: Option[Claim.Accident] = None,
    val diagnosis: LitSeq[Claim.Diagnosis] = LitSeq.empty,
    val procedure: LitSeq[Claim.Procedure] = LitSeq.empty,
    val insurance: NonEmptyLitSeq[Claim.Insurance],
    val supportingInfo: LitSeq[Claim.SupportingInfo] = LitSeq.empty,
    val item: LitSeq[Claim.Item] = LitSeq.empty,
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
  override val thisTypeName: String = "Claim"
}
