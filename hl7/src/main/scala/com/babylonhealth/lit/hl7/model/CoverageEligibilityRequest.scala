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
import com.babylonhealth.lit.hl7.{ ELIGIBILITYREQUEST_PURPOSE, FM_STATUS }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object CoverageEligibilityRequest extends CompanionFor[CoverageEligibilityRequest] {
  implicit def summonObjectAndCompanionCoverageEligibilityRequest1748094463(
      o: CoverageEligibilityRequest): ObjectAndCompanion[CoverageEligibilityRequest, CoverageEligibilityRequest.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = CoverageEligibilityRequest
  override type ParentType   = CoverageEligibilityRequest
  override val baseType: CompanionFor[ResourceType] = CoverageEligibilityRequest
  override val parentType: CompanionFor[ParentType] = CoverageEligibilityRequest
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/CoverageEligibilityRequest")
  object Item extends CompanionFor[Item] {
    implicit def summonObjectAndCompanionItem_281721644(o: Item): ObjectAndCompanion[Item, Item.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Item
    override type ParentType   = Item
    override val parentType: CompanionFor[ResourceType] = Item
    object Diagnosis extends CompanionFor[Diagnosis] {
      implicit def summonObjectAndCompanionDiagnosis_136281904(o: Diagnosis): ObjectAndCompanion[Diagnosis, Diagnosis.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Diagnosis
      override type ParentType   = Diagnosis
      override val parentType: CompanionFor[ResourceType] = Diagnosis
      type DiagnosisChoice = Choice[UnionCodeableConceptOrReference]
      def apply(
          id: Option[String] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          diagnosis: Option[Diagnosis.DiagnosisChoice] = None,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Diagnosis = new Diagnosis(
        id,
        extension,
        diagnosis,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Diagnosis): Option[(Option[String], LitSeq[Extension], Option[Diagnosis.DiagnosisChoice], LitSeq[Extension])] = Some(
        (o.id, o.extension, o.diagnosis, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val diagnosis: FHIRComponentFieldMeta[Option[Diagnosis.DiagnosisChoice]] =
        FHIRComponentFieldMeta(
          "diagnosis",
          lTagOf[Option[Diagnosis.DiagnosisChoice]],
          true,
          lTagOf[UnionCodeableConceptOrReference])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, extension, diagnosis, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Diagnosis): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[Diagnosis.DiagnosisChoice]](diagnosis, t.diagnosis),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Diagnosis] = this
      val thisName: String                  = "Diagnosis"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Diagnosis] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Diagnosis(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeOptRef[UnionCodeableConceptOrReference]("diagnosis"),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Diagnosis(
        override val id: Option[String] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val diagnosis: Option[Diagnosis.DiagnosisChoice] = None,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        detail: LitSeq[Reference] = LitSeq.empty,
        category: Option[CodeableConcept] = None,
        modifier: LitSeq[CodeableConcept] = LitSeq.empty,
        provider: Option[Reference] = None,
        quantity: Option[Quantity] = None,
        facility: Option[Reference] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        unitPrice: Option[Money] = None,
        productOrService: Option[CodeableConcept] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        supportingInfoSequence: LitSeq[PositiveInt] = LitSeq.empty,
        diagnosis: LitSeq[Item.Diagnosis] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Item = new Item(
      id,
      detail,
      category,
      modifier,
      provider,
      quantity,
      facility,
      extension,
      unitPrice,
      productOrService,
      modifierExtension,
      supportingInfoSequence,
      diagnosis,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Item): Option[(Option[String], LitSeq[Reference], Option[CodeableConcept], LitSeq[CodeableConcept], Option[Reference], Option[Quantity], Option[Reference], LitSeq[Extension], Option[Money], Option[CodeableConcept], LitSeq[Extension], LitSeq[PositiveInt], LitSeq[Item.Diagnosis])] =
      Some(
        (
          o.id,
          o.detail,
          o.category,
          o.modifier,
          o.provider,
          o.quantity,
          o.facility,
          o.extension,
          o.unitPrice,
          o.productOrService,
          o.modifierExtension,
          o.supportingInfoSequence,
          o.diagnosis))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val detail: FHIRComponentFieldMeta[LitSeq[Reference]] =
      FHIRComponentFieldMeta("detail", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
    val category: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("category", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val modifier: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("modifier", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val provider: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("provider", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val quantity: FHIRComponentFieldMeta[Option[Quantity]] =
      FHIRComponentFieldMeta("quantity", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
    val facility: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("facility", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val unitPrice: FHIRComponentFieldMeta[Option[Money]] =
      FHIRComponentFieldMeta("unitPrice", lTagOf[Option[Money]], false, lTagOf[Money])
    val productOrService: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("productOrService", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val supportingInfoSequence: FHIRComponentFieldMeta[LitSeq[PositiveInt]] =
      FHIRComponentFieldMeta("supportingInfoSequence", lTagOf[LitSeq[PositiveInt]], false, lTagOf[PositiveInt])
    val diagnosis: FHIRComponentFieldMeta[LitSeq[Item.Diagnosis]] =
      FHIRComponentFieldMeta("diagnosis", lTagOf[LitSeq[Item.Diagnosis]], false, lTagOf[Item.Diagnosis])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
      id,
      detail,
      category,
      modifier,
      provider,
      quantity,
      facility,
      extension,
      unitPrice,
      productOrService,
      modifierExtension,
      supportingInfoSequence,
      diagnosis)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Item): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Reference]](detail, t.detail),
      FHIRComponentField[Option[CodeableConcept]](category, t.category),
      FHIRComponentField[LitSeq[CodeableConcept]](modifier, t.modifier),
      FHIRComponentField[Option[Reference]](provider, t.provider),
      FHIRComponentField[Option[Quantity]](quantity, t.quantity),
      FHIRComponentField[Option[Reference]](facility, t.facility),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Money]](unitPrice, t.unitPrice),
      FHIRComponentField[Option[CodeableConcept]](productOrService, t.productOrService),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[PositiveInt]](supportingInfoSequence, t.supportingInfoSequence),
      FHIRComponentField[LitSeq[Item.Diagnosis]](diagnosis, t.diagnosis)
    )
    val baseType: CompanionFor[Item] = this
    val thisName: String             = "Item"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Item] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Item(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Reference]]("detail", Some(LitSeq.empty)),
            cursor.decodeAs[Option[CodeableConcept]]("category", Some(None)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("modifier", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Reference]]("provider", Some(None)),
            cursor.decodeAs[Option[Quantity]]("quantity", Some(None)),
            cursor.decodeAs[Option[Reference]]("facility", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Money]]("unitPrice", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("productOrService", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[PositiveInt]]("supportingInfoSequence", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Item.Diagnosis]]("diagnosis", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Item(
      override val id: Option[String] = None,
      val detail: LitSeq[Reference] = LitSeq.empty,
      val category: Option[CodeableConcept] = None,
      val modifier: LitSeq[CodeableConcept] = LitSeq.empty,
      val provider: Option[Reference] = None,
      val quantity: Option[Quantity] = None,
      val facility: Option[Reference] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val unitPrice: Option[Money] = None,
      val productOrService: Option[CodeableConcept] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val supportingInfoSequence: LitSeq[PositiveInt] = LitSeq.empty,
      val diagnosis: LitSeq[Item.Diagnosis] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object SupportingInfo extends CompanionFor[SupportingInfo] {
    implicit def summonObjectAndCompanionSupportingInfo_281721644(
        o: SupportingInfo): ObjectAndCompanion[SupportingInfo, SupportingInfo.type] = ObjectAndCompanion(o, this)
    override type ResourceType = SupportingInfo
    override type ParentType   = SupportingInfo
    override val parentType: CompanionFor[ResourceType] = SupportingInfo
    def apply(
        id: Option[String] = None,
        sequence: PositiveInt,
        extension: LitSeq[Extension] = LitSeq.empty,
        information: Reference,
        appliesToAll: Option[Boolean] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): SupportingInfo = new SupportingInfo(
      id,
      sequence,
      extension,
      information,
      appliesToAll,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: SupportingInfo): Option[(Option[String], PositiveInt, LitSeq[Extension], Reference, Option[Boolean], LitSeq[Extension])] =
      Some((o.id, o.sequence, o.extension, o.information, o.appliesToAll, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val sequence: FHIRComponentFieldMeta[PositiveInt] =
      FHIRComponentFieldMeta("sequence", lTagOf[PositiveInt], false, lTagOf[PositiveInt])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val information: FHIRComponentFieldMeta[Reference] =
      FHIRComponentFieldMeta("information", lTagOf[Reference], false, lTagOf[Reference])
    val appliesToAll: FHIRComponentFieldMeta[Option[Boolean]] =
      FHIRComponentFieldMeta("appliesToAll", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, sequence, extension, information, appliesToAll, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: SupportingInfo): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[PositiveInt](sequence, t.sequence),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Reference](information, t.information),
      FHIRComponentField[Option[Boolean]](appliesToAll, t.appliesToAll),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[SupportingInfo] = this
    val thisName: String                       = "SupportingInfo"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[SupportingInfo] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new SupportingInfo(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[PositiveInt]("sequence", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Reference]("information", None),
            cursor.decodeAs[Option[Boolean]]("appliesToAll", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class SupportingInfo(
      override val id: Option[String] = None,
      val sequence: PositiveInt,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val information: Reference,
      val appliesToAll: Option[Boolean] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Insurance extends CompanionFor[Insurance] {
    implicit def summonObjectAndCompanionInsurance_281721644(o: Insurance): ObjectAndCompanion[Insurance, Insurance.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Insurance
    override type ParentType   = Insurance
    override val parentType: CompanionFor[ResourceType] = Insurance
    def apply(
        id: Option[String] = None,
        focal: Option[Boolean] = None,
        coverage: Reference,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        businessArrangement: Option[String] = None,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Insurance = new Insurance(
      id,
      focal,
      coverage,
      extension,
      modifierExtension,
      businessArrangement,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Insurance): Option[(Option[String], Option[Boolean], Reference, LitSeq[Extension], LitSeq[Extension], Option[String])] =
      Some((o.id, o.focal, o.coverage, o.extension, o.modifierExtension, o.businessArrangement))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val focal: FHIRComponentFieldMeta[Option[Boolean]] =
      FHIRComponentFieldMeta("focal", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
    val coverage: FHIRComponentFieldMeta[Reference] =
      FHIRComponentFieldMeta("coverage", lTagOf[Reference], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val businessArrangement: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("businessArrangement", lTagOf[Option[String]], false, lTagOf[String])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, focal, coverage, extension, modifierExtension, businessArrangement)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Insurance): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Boolean]](focal, t.focal),
      FHIRComponentField[Reference](coverage, t.coverage),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
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
            cursor.decodeAs[Option[Boolean]]("focal", Some(None)),
            cursor.decodeAs[Reference]("coverage", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("businessArrangement", Some(None)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Insurance(
      override val id: Option[String] = None,
      val focal: Option[Boolean] = None,
      val coverage: Reference,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val businessArrangement: Option[String] = None,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  type ServicedChoice = Choice[UnionDateOrPeriod]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      status: FM_STATUS,
      purpose: NonEmptyLitSeq[ELIGIBILITYREQUEST_PURPOSE],
      patient: Reference,
      created: FHIRDateTime,
      enterer: Option[Reference] = None,
      insurer: Reference,
      language: Option[LANGUAGES] = None,
      priority: Option[CodeableConcept] = None,
      provider: Option[Reference] = None,
      facility: Option[Reference] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      serviced: Option[CoverageEligibilityRequest.ServicedChoice] = None,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      insurance: LitSeq[CoverageEligibilityRequest.Insurance] = LitSeq.empty,
      supportingInfo: LitSeq[CoverageEligibilityRequest.SupportingInfo] = LitSeq.empty,
      item: LitSeq[CoverageEligibilityRequest.Item] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): CoverageEligibilityRequest = new CoverageEligibilityRequest(
    id,
    meta,
    text,
    status,
    purpose,
    patient,
    created,
    enterer,
    insurer,
    language,
    priority,
    provider,
    facility,
    contained,
    extension,
    identifier,
    serviced,
    implicitRules,
    modifierExtension,
    insurance,
    supportingInfo,
    item,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val status: FHIRComponentFieldMeta[FM_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[FM_STATUS], false, lTagOf[FM_STATUS])
  val purpose: FHIRComponentFieldMeta[NonEmptyLitSeq[ELIGIBILITYREQUEST_PURPOSE]] =
    FHIRComponentFieldMeta(
      "purpose",
      lTagOf[NonEmptyLitSeq[ELIGIBILITYREQUEST_PURPOSE]],
      false,
      lTagOf[ELIGIBILITYREQUEST_PURPOSE])
  val patient: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("patient", lTagOf[Reference], false, lTagOf[Reference])
  val created: FHIRComponentFieldMeta[FHIRDateTime] =
    FHIRComponentFieldMeta("created", lTagOf[FHIRDateTime], false, lTagOf[FHIRDateTime])
  val enterer: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("enterer", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val insurer: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("insurer", lTagOf[Reference], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val priority: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("priority", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val provider: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("provider", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val facility: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("facility", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val serviced: FHIRComponentFieldMeta[Option[CoverageEligibilityRequest.ServicedChoice]] =
    FHIRComponentFieldMeta("serviced", lTagOf[Option[CoverageEligibilityRequest.ServicedChoice]], true, lTagOf[UnionDateOrPeriod])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val insurance: FHIRComponentFieldMeta[LitSeq[CoverageEligibilityRequest.Insurance]] =
    FHIRComponentFieldMeta(
      "insurance",
      lTagOf[LitSeq[CoverageEligibilityRequest.Insurance]],
      false,
      lTagOf[CoverageEligibilityRequest.Insurance])
  val supportingInfo: FHIRComponentFieldMeta[LitSeq[CoverageEligibilityRequest.SupportingInfo]] =
    FHIRComponentFieldMeta(
      "supportingInfo",
      lTagOf[LitSeq[CoverageEligibilityRequest.SupportingInfo]],
      false,
      lTagOf[CoverageEligibilityRequest.SupportingInfo])
  val item: FHIRComponentFieldMeta[LitSeq[CoverageEligibilityRequest.Item]] =
    FHIRComponentFieldMeta(
      "item",
      lTagOf[LitSeq[CoverageEligibilityRequest.Item]],
      false,
      lTagOf[CoverageEligibilityRequest.Item])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    status,
    purpose,
    patient,
    created,
    enterer,
    insurer,
    language,
    priority,
    provider,
    facility,
    contained,
    extension,
    identifier,
    serviced,
    implicitRules,
    modifierExtension,
    insurance,
    supportingInfo,
    item
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: CoverageEligibilityRequest): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[FM_STATUS](status, t.status),
    FHIRComponentField[NonEmptyLitSeq[ELIGIBILITYREQUEST_PURPOSE]](purpose, t.purpose),
    FHIRComponentField[Reference](patient, t.patient),
    FHIRComponentField[FHIRDateTime](created, t.created),
    FHIRComponentField[Option[Reference]](enterer, t.enterer),
    FHIRComponentField[Reference](insurer, t.insurer),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Option[CodeableConcept]](priority, t.priority),
    FHIRComponentField[Option[Reference]](provider, t.provider),
    FHIRComponentField[Option[Reference]](facility, t.facility),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[CoverageEligibilityRequest.ServicedChoice]](serviced, t.serviced),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[CoverageEligibilityRequest.Insurance]](insurance, t.insurance),
    FHIRComponentField[LitSeq[CoverageEligibilityRequest.SupportingInfo]](supportingInfo, t.supportingInfo),
    FHIRComponentField[LitSeq[CoverageEligibilityRequest.Item]](item, t.item)
  )
  def extractId(t: CoverageEligibilityRequest): Option[String]                                          = t.id
  def extractMeta(t: CoverageEligibilityRequest): Option[Meta]                                          = t.meta
  def extractText(t: CoverageEligibilityRequest): Option[Narrative]                                     = t.text
  def extractStatus(t: CoverageEligibilityRequest): FM_STATUS                                           = t.status
  def extractPurpose(t: CoverageEligibilityRequest): NonEmptyLitSeq[ELIGIBILITYREQUEST_PURPOSE]         = t.purpose
  def extractPatient(t: CoverageEligibilityRequest): Reference                                          = t.patient
  def extractCreated(t: CoverageEligibilityRequest): FHIRDateTime                                       = t.created
  def extractEnterer(t: CoverageEligibilityRequest): Option[Reference]                                  = t.enterer
  def extractInsurer(t: CoverageEligibilityRequest): Reference                                          = t.insurer
  def extractLanguage(t: CoverageEligibilityRequest): Option[LANGUAGES]                                 = t.language
  def extractPriority(t: CoverageEligibilityRequest): Option[CodeableConcept]                           = t.priority
  def extractProvider(t: CoverageEligibilityRequest): Option[Reference]                                 = t.provider
  def extractFacility(t: CoverageEligibilityRequest): Option[Reference]                                 = t.facility
  def extractContained(t: CoverageEligibilityRequest): LitSeq[Resource]                                 = t.contained
  def extractExtension(t: CoverageEligibilityRequest): LitSeq[Extension]                                = t.extension
  def extractIdentifier(t: CoverageEligibilityRequest): LitSeq[Identifier]                              = t.identifier
  def extractServiced(t: CoverageEligibilityRequest): Option[CoverageEligibilityRequest.ServicedChoice] = t.serviced
  def extractImplicitRules(t: CoverageEligibilityRequest): Option[UriStr]                               = t.implicitRules
  def extractModifierExtension(t: CoverageEligibilityRequest): LitSeq[Extension]                        = t.modifierExtension
  def extractInsurance(t: CoverageEligibilityRequest): LitSeq[CoverageEligibilityRequest.Insurance]     = t.insurance
  def extractSupportingInfo(t: CoverageEligibilityRequest): LitSeq[CoverageEligibilityRequest.SupportingInfo] = t.supportingInfo
  def extractItem(t: CoverageEligibilityRequest): LitSeq[CoverageEligibilityRequest.Item]                     = t.item
  override val thisName: String = "CoverageEligibilityRequest"
  override val searchParams: Map[String, CoverageEligibilityRequest => Seq[Any]] = Map(
    "provider"   -> (obj => obj.provider.toSeq),
    "identifier" -> (obj => obj.identifier.toSeq),
    "status"     -> (obj => Seq(obj.status)),
    "facility"   -> (obj => obj.facility.toSeq),
    "enterer"    -> (obj => obj.enterer.toSeq),
    "created"    -> (obj => Seq(obj.created)),
    "patient"    -> (obj => Seq(obj.patient))
  )
  def unapply(
      o: CoverageEligibilityRequest): Option[(Option[String], Option[Meta], Option[Narrative], FM_STATUS, NonEmptyLitSeq[ELIGIBILITYREQUEST_PURPOSE], Reference, FHIRDateTime, Option[Reference], Reference, Option[LANGUAGES], Option[CodeableConcept], Option[Reference], Option[Reference], LitSeq[Resource], LitSeq[Extension], LitSeq[Identifier], Option[CoverageEligibilityRequest.ServicedChoice], Option[UriStr], LitSeq[Extension], LitSeq[CoverageEligibilityRequest.Insurance], LitSeq[CoverageEligibilityRequest.SupportingInfo], LitSeq[CoverageEligibilityRequest.Item])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.status,
        o.purpose,
        o.patient,
        o.created,
        o.enterer,
        o.insurer,
        o.language,
        o.priority,
        o.provider,
        o.facility,
        o.contained,
        o.extension,
        o.identifier,
        o.serviced,
        o.implicitRules,
        o.modifierExtension,
        o.insurance,
        o.supportingInfo,
        o.item))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[CoverageEligibilityRequest] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new CoverageEligibilityRequest(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[FM_STATUS]("status", None),
          cursor.decodeAs[NonEmptyLitSeq[ELIGIBILITYREQUEST_PURPOSE]]("purpose", None),
          cursor.decodeAs[Reference]("patient", None),
          cursor.decodeAs[FHIRDateTime]("created", None),
          cursor.decodeAs[Option[Reference]]("enterer", Some(None)),
          cursor.decodeAs[Reference]("insurer", None),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("priority", Some(None)),
          cursor.decodeAs[Option[Reference]]("provider", Some(None)),
          cursor.decodeAs[Option[Reference]]("facility", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeOptRef[UnionDateOrPeriod]("serviced"),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CoverageEligibilityRequest.Insurance]]("insurance", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CoverageEligibilityRequest.SupportingInfo]]("supportingInfo", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CoverageEligibilityRequest.Item]]("item", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** The CoverageEligibilityRequest provides patient and insurance coverage information to an insurer for them to respond, in the
  * form of an CoverageEligibilityResponse, with information regarding whether the stated coverage is valid and in-force and
  * optionally to provide the insurance details of the policy.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields status, purpose, patient, created, enterer, insurer, priority, provider, facility, identifier,
  *   serviced, insurance, supportingInfo, item.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *     not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *     resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail
  *     to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should
  *     be represented in the narrative to ensure clinical safety.
  * @param status
  *   - The status of the resource instance.
  * @param purpose
  *   - Code to specify whether requesting: prior authorization requirements for some service categories or billing codes;
  *     benefits for coverages specified or discovered; discovery and return of coverages for the patient; and/or validation that
  *     the specified coverage is in-force at the date/period specified or 'now' if not specified.
  * @param patient
  *   - The party who is the beneficiary of the supplied coverage and for whom eligibility is sought.
  * @param created
  *   - The date when this resource was created.
  * @param enterer
  *   - Person who created the request.
  * @param insurer
  *   - The Insurer who issued the coverage in question and is the recipient of the request.
  * @param language
  *   - The base language in which the resource is written.
  * @param priority
  *   - When the requestor expects the processor to complete processing.
  * @param provider
  *   - The provider which is responsible for the request.
  * @param facility
  *   - Facility where the services are intended to be provided.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *     identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *     of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *     Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *     of the extension.
  * @param identifier
  *   - A unique identifier assigned to this coverage eligiblity request.
  * @param serviced
  *   - The date or dates when the enclosed suite of services were performed or completed.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *     processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *     other profiles etc.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *     the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *     Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *     strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *     extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *     processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of
  *     any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param insurance
  *   - Financial instruments for reimbursement for the health care products and services.
  * @param supportingInfo
  *   - Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent
  *     issues.
  * @param item
  *   - Service categories or billable services for which benefit details and/or an authorization prior to service delivery may be
  *     required by the payor.
  */
@POJOBoilerplate
class CoverageEligibilityRequest(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val status: FM_STATUS,
    val purpose: NonEmptyLitSeq[ELIGIBILITYREQUEST_PURPOSE],
    val patient: Reference,
    val created: FHIRDateTime,
    val enterer: Option[Reference] = None,
    val insurer: Reference,
    override val language: Option[LANGUAGES] = None,
    val priority: Option[CodeableConcept] = None,
    val provider: Option[Reference] = None,
    val facility: Option[Reference] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val serviced: Option[CoverageEligibilityRequest.ServicedChoice] = None,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val insurance: LitSeq[CoverageEligibilityRequest.Insurance] = LitSeq.empty,
    val supportingInfo: LitSeq[CoverageEligibilityRequest.SupportingInfo] = LitSeq.empty,
    val item: LitSeq[CoverageEligibilityRequest.Item] = LitSeq.empty,
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
  override val thisTypeName: String = "CoverageEligibilityRequest"
}
