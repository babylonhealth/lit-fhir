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
import com.babylonhealth.lit.hl7.{ PUBLICATION_STATUS, OBSERVATION_RANGE_CATEGORY, PERMITTED_DATA_TYPE, ADMINISTRATIVE_GENDER }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object ObservationDefinition extends CompanionFor[ObservationDefinition] {
  implicit def summonObjectAndCompanionObservationDefinition_1739645494(
      o: ObservationDefinition): ObjectAndCompanion[ObservationDefinition, ObservationDefinition.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = ObservationDefinition
  override type ParentType   = ObservationDefinition
  override val baseType: CompanionFor[ResourceType] = ObservationDefinition
  override val parentType: CompanionFor[ParentType] = ObservationDefinition
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/ObservationDefinition")
  object QuantitativeDetails extends CompanionFor[QuantitativeDetails] {
    implicit def summonObjectAndCompanionQuantitativeDetails1347413246(
        o: QuantitativeDetails): ObjectAndCompanion[QuantitativeDetails, QuantitativeDetails.type] = ObjectAndCompanion(o, this)
    override type ResourceType = QuantitativeDetails
    override type ParentType   = QuantitativeDetails
    override val parentType: CompanionFor[ResourceType] = QuantitativeDetails
    def apply(
        id: Option[String] = None,
        unit: Option[CodeableConcept] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        customaryUnit: Option[CodeableConcept] = None,
        conversionFactor: Option[BigDecimal] = None,
        decimalPrecision: Option[Int] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): QuantitativeDetails = new QuantitativeDetails(
      id,
      unit,
      extension,
      customaryUnit,
      conversionFactor,
      decimalPrecision,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: QuantitativeDetails): Option[(Option[String], Option[CodeableConcept], LitSeq[Extension], Option[CodeableConcept], Option[BigDecimal], Option[Int], LitSeq[Extension])] =
      Some((o.id, o.unit, o.extension, o.customaryUnit, o.conversionFactor, o.decimalPrecision, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val unit: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("unit", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val customaryUnit: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("customaryUnit", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val conversionFactor: FHIRComponentFieldMeta[Option[BigDecimal]] =
      FHIRComponentFieldMeta("conversionFactor", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
    val decimalPrecision: FHIRComponentFieldMeta[Option[Int]] =
      FHIRComponentFieldMeta("decimalPrecision", lTagOf[Option[Int]], false, lTagOf[Int])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, unit, extension, customaryUnit, conversionFactor, decimalPrecision, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: QuantitativeDetails): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](unit, t.unit),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[CodeableConcept]](customaryUnit, t.customaryUnit),
      FHIRComponentField[Option[BigDecimal]](conversionFactor, t.conversionFactor),
      FHIRComponentField[Option[Int]](decimalPrecision, t.decimalPrecision),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[QuantitativeDetails] = this
    val thisName: String                            = "QuantitativeDetails"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[QuantitativeDetails] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new QuantitativeDetails(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("unit", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[CodeableConcept]]("customaryUnit", Some(None)),
            cursor.decodeAs[Option[BigDecimal]]("conversionFactor", Some(None)),
            cursor.decodeAs[Option[Int]]("decimalPrecision", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class QuantitativeDetails(
      override val id: Option[String] = None,
      val unit: Option[CodeableConcept] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val customaryUnit: Option[CodeableConcept] = None,
      val conversionFactor: Option[BigDecimal] = None,
      val decimalPrecision: Option[Int] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object QualifiedValue extends CompanionFor[QualifiedValue] {
    implicit def summonObjectAndCompanionQualifiedValue1347413246(
        o: QualifiedValue): ObjectAndCompanion[QualifiedValue, QualifiedValue.type] = ObjectAndCompanion(o, this)
    override type ResourceType = QualifiedValue
    override type ParentType   = QualifiedValue
    override val parentType: CompanionFor[ResourceType] = QualifiedValue
    def apply(
        id: Option[String] = None,
        age: Option[Range] = None,
        range: Option[Range] = None,
        gender: Option[ADMINISTRATIVE_GENDER] = None,
        context: Option[CodeableConcept] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        appliesTo: LitSeq[CodeableConcept] = LitSeq.empty,
        condition: Option[String] = None,
        rangeCategory: Option[OBSERVATION_RANGE_CATEGORY] = None,
        gestationalAge: Option[Range] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        validCodedValueSet: Option[Canonical] = None,
        normalCodedValueSet: Option[Canonical] = None,
        abnormalCodedValueSet: Option[Canonical] = None,
        criticalCodedValueSet: Option[Canonical] = None,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): QualifiedValue = new QualifiedValue(
      id,
      age,
      range,
      gender,
      context,
      extension,
      appliesTo,
      condition,
      rangeCategory,
      gestationalAge,
      modifierExtension,
      validCodedValueSet,
      normalCodedValueSet,
      abnormalCodedValueSet,
      criticalCodedValueSet,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: QualifiedValue): Option[(Option[String], Option[Range], Option[Range], Option[ADMINISTRATIVE_GENDER], Option[CodeableConcept], LitSeq[Extension], LitSeq[CodeableConcept], Option[String], Option[OBSERVATION_RANGE_CATEGORY], Option[Range], LitSeq[Extension], Option[Canonical], Option[Canonical], Option[Canonical], Option[Canonical])] =
      Some(
        (
          o.id,
          o.age,
          o.range,
          o.gender,
          o.context,
          o.extension,
          o.appliesTo,
          o.condition,
          o.rangeCategory,
          o.gestationalAge,
          o.modifierExtension,
          o.validCodedValueSet,
          o.normalCodedValueSet,
          o.abnormalCodedValueSet,
          o.criticalCodedValueSet))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val age: FHIRComponentFieldMeta[Option[Range]] =
      FHIRComponentFieldMeta("age", lTagOf[Option[Range]], false, lTagOf[Range])
    val range: FHIRComponentFieldMeta[Option[Range]] =
      FHIRComponentFieldMeta("range", lTagOf[Option[Range]], false, lTagOf[Range])
    val gender: FHIRComponentFieldMeta[Option[ADMINISTRATIVE_GENDER]] =
      FHIRComponentFieldMeta("gender", lTagOf[Option[ADMINISTRATIVE_GENDER]], false, lTagOf[ADMINISTRATIVE_GENDER])
    val context: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("context", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val appliesTo: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("appliesTo", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val condition: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("condition", lTagOf[Option[String]], false, lTagOf[String])
    val rangeCategory: FHIRComponentFieldMeta[Option[OBSERVATION_RANGE_CATEGORY]] =
      FHIRComponentFieldMeta(
        "rangeCategory",
        lTagOf[Option[OBSERVATION_RANGE_CATEGORY]],
        false,
        lTagOf[OBSERVATION_RANGE_CATEGORY])
    val gestationalAge: FHIRComponentFieldMeta[Option[Range]] =
      FHIRComponentFieldMeta("gestationalAge", lTagOf[Option[Range]], false, lTagOf[Range])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val validCodedValueSet: FHIRComponentFieldMeta[Option[Canonical]] =
      FHIRComponentFieldMeta("validCodedValueSet", lTagOf[Option[Canonical]], false, lTagOf[Canonical])
    val normalCodedValueSet: FHIRComponentFieldMeta[Option[Canonical]] =
      FHIRComponentFieldMeta("normalCodedValueSet", lTagOf[Option[Canonical]], false, lTagOf[Canonical])
    val abnormalCodedValueSet: FHIRComponentFieldMeta[Option[Canonical]] =
      FHIRComponentFieldMeta("abnormalCodedValueSet", lTagOf[Option[Canonical]], false, lTagOf[Canonical])
    val criticalCodedValueSet: FHIRComponentFieldMeta[Option[Canonical]] =
      FHIRComponentFieldMeta("criticalCodedValueSet", lTagOf[Option[Canonical]], false, lTagOf[Canonical])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
      id,
      age,
      range,
      gender,
      context,
      extension,
      appliesTo,
      condition,
      rangeCategory,
      gestationalAge,
      modifierExtension,
      validCodedValueSet,
      normalCodedValueSet,
      abnormalCodedValueSet,
      criticalCodedValueSet
    )
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: QualifiedValue): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Range]](age, t.age),
      FHIRComponentField[Option[Range]](range, t.range),
      FHIRComponentField[Option[ADMINISTRATIVE_GENDER]](gender, t.gender),
      FHIRComponentField[Option[CodeableConcept]](context, t.context),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[CodeableConcept]](appliesTo, t.appliesTo),
      FHIRComponentField[Option[String]](condition, t.condition),
      FHIRComponentField[Option[OBSERVATION_RANGE_CATEGORY]](rangeCategory, t.rangeCategory),
      FHIRComponentField[Option[Range]](gestationalAge, t.gestationalAge),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[Canonical]](validCodedValueSet, t.validCodedValueSet),
      FHIRComponentField[Option[Canonical]](normalCodedValueSet, t.normalCodedValueSet),
      FHIRComponentField[Option[Canonical]](abnormalCodedValueSet, t.abnormalCodedValueSet),
      FHIRComponentField[Option[Canonical]](criticalCodedValueSet, t.criticalCodedValueSet)
    )
    val baseType: CompanionFor[QualifiedValue] = this
    val thisName: String                       = "QualifiedValue"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[QualifiedValue] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new QualifiedValue(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[Range]]("age", Some(None)),
            cursor.decodeAs[Option[Range]]("range", Some(None)),
            cursor.decodeAs[Option[ADMINISTRATIVE_GENDER]]("gender", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("context", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("appliesTo", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("condition", Some(None)),
            cursor.decodeAs[Option[OBSERVATION_RANGE_CATEGORY]]("rangeCategory", Some(None)),
            cursor.decodeAs[Option[Range]]("gestationalAge", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Canonical]]("validCodedValueSet", Some(None)),
            cursor.decodeAs[Option[Canonical]]("normalCodedValueSet", Some(None)),
            cursor.decodeAs[Option[Canonical]]("abnormalCodedValueSet", Some(None)),
            cursor.decodeAs[Option[Canonical]]("criticalCodedValueSet", Some(None)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class QualifiedValue(
      override val id: Option[String] = None,
      val age: Option[Range] = None,
      val range: Option[Range] = None,
      val gender: Option[ADMINISTRATIVE_GENDER] = None,
      val context: Option[CodeableConcept] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val appliesTo: LitSeq[CodeableConcept] = LitSeq.empty,
      val condition: Option[String] = None,
      val rangeCategory: Option[OBSERVATION_RANGE_CATEGORY] = None,
      val gestationalAge: Option[Range] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val validCodedValueSet: Option[Canonical] = None,
      val normalCodedValueSet: Option[Canonical] = None,
      val abnormalCodedValueSet: Option[Canonical] = None,
      val criticalCodedValueSet: Option[Canonical] = None,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Component extends CompanionFor[Component] {
    implicit def summonObjectAndCompanionComponent1347413246(o: Component): ObjectAndCompanion[Component, Component.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Component
    override type ParentType   = Component
    override val parentType: CompanionFor[ResourceType] = Component
    def apply(
        id: Option[String] = None,
        code: CodeableConcept,
        extension: LitSeq[Extension] = LitSeq.empty,
        qualifiedValue: LitSeq[ObservationDefinition.QualifiedValue] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        permittedDataType: LitSeq[PERMITTED_DATA_TYPE] = LitSeq.empty,
        quantitativeDetails: Option[ObservationDefinition.QuantitativeDetails] = None,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Component = new Component(
      id,
      code,
      extension,
      qualifiedValue,
      modifierExtension,
      permittedDataType,
      quantitativeDetails,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Component): Option[(Option[String], CodeableConcept, LitSeq[Extension], LitSeq[ObservationDefinition.QualifiedValue], LitSeq[Extension], LitSeq[PERMITTED_DATA_TYPE], Option[ObservationDefinition.QuantitativeDetails])] =
      Some((o.id, o.code, o.extension, o.qualifiedValue, o.modifierExtension, o.permittedDataType, o.quantitativeDetails))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val code: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("code", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val qualifiedValue: FHIRComponentFieldMeta[LitSeq[ObservationDefinition.QualifiedValue]] =
      FHIRComponentFieldMeta(
        "qualifiedValue",
        lTagOf[LitSeq[ObservationDefinition.QualifiedValue]],
        false,
        lTagOf[ObservationDefinition.QualifiedValue])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val permittedDataType: FHIRComponentFieldMeta[LitSeq[PERMITTED_DATA_TYPE]] =
      FHIRComponentFieldMeta("permittedDataType", lTagOf[LitSeq[PERMITTED_DATA_TYPE]], false, lTagOf[PERMITTED_DATA_TYPE])
    val quantitativeDetails: FHIRComponentFieldMeta[Option[ObservationDefinition.QuantitativeDetails]] =
      FHIRComponentFieldMeta(
        "quantitativeDetails",
        lTagOf[Option[ObservationDefinition.QuantitativeDetails]],
        false,
        lTagOf[ObservationDefinition.QuantitativeDetails])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, code, extension, qualifiedValue, modifierExtension, permittedDataType, quantitativeDetails)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Component): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[CodeableConcept](code, t.code),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[ObservationDefinition.QualifiedValue]](qualifiedValue, t.qualifiedValue),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[PERMITTED_DATA_TYPE]](permittedDataType, t.permittedDataType),
      FHIRComponentField[Option[ObservationDefinition.QuantitativeDetails]](quantitativeDetails, t.quantitativeDetails)
    )
    val baseType: CompanionFor[Component] = this
    val thisName: String                  = "Component"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Component] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Component(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[CodeableConcept]("code", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[ObservationDefinition.QualifiedValue]]("qualifiedValue", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[PERMITTED_DATA_TYPE]]("permittedDataType", Some(LitSeq.empty)),
            cursor.decodeAs[Option[ObservationDefinition.QuantitativeDetails]]("quantitativeDetails", Some(None)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Component(
      override val id: Option[String] = None,
      val code: CodeableConcept,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val qualifiedValue: LitSeq[ObservationDefinition.QualifiedValue] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val permittedDataType: LitSeq[PERMITTED_DATA_TYPE] = LitSeq.empty,
      val quantitativeDetails: Option[ObservationDefinition.QuantitativeDetails] = None,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      url: Option[UriStr] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      name: Option[String] = None,
      date: Option[FHIRDateTime] = None,
      code: CodeableConcept,
      title: Option[String] = None,
      status: PUBLICATION_STATUS,
      method: Option[CodeableConcept] = None,
      device: LitSeq[Reference] = LitSeq.empty,
      version: Option[String] = None,
      contact: LitSeq[ContactDetail] = LitSeq.empty,
      purpose: Option[Markdown] = None,
      subject: Option[CodeableConcept] = None,
      language: Option[LANGUAGES] = None,
      category: LitSeq[CodeableConcept] = LitSeq.empty,
      bodySite: Option[CodeableConcept] = None,
      specimen: LitSeq[Reference] = LitSeq.empty,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      publisher: Option[Reference] = None,
      copyright: Option[Markdown] = None,
      hasMember: LitSeq[Reference] = LitSeq.empty,
      identifier: Option[Identifier] = None,
      useContext: LitSeq[UsageContext] = LitSeq.empty,
      description: Option[Markdown] = None,
      experimental: Option[Boolean] = None,
      jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
      approvalDate: Option[FHIRDate] = None,
      implicitRules: Option[UriStr] = None,
      performerType: Option[CodeableConcept] = None,
      lastReviewDate: Option[FHIRDate] = None,
      derivedFromUri: LitSeq[UriStr] = LitSeq.empty,
      effectivePeriod: Option[Period] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      permittedDataType: LitSeq[PERMITTED_DATA_TYPE] = LitSeq.empty,
      preferredReportName: Option[String] = None,
      derivedFromCanonical: LitSeq[Canonical] = LitSeq.empty,
      multipleResultsAllowed: Option[Boolean] = None,
      component: LitSeq[ObservationDefinition.Component] = LitSeq.empty,
      qualifiedValue: LitSeq[ObservationDefinition.QualifiedValue] = LitSeq.empty,
      quantitativeDetails: Option[ObservationDefinition.QuantitativeDetails] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): ObservationDefinition = new ObservationDefinition(
    id,
    url,
    meta,
    text,
    name,
    date,
    code,
    title,
    status,
    method,
    device,
    version,
    contact,
    purpose,
    subject,
    language,
    category,
    bodySite,
    specimen,
    contained,
    extension,
    publisher,
    copyright,
    hasMember,
    identifier,
    useContext,
    description,
    experimental,
    jurisdiction,
    approvalDate,
    implicitRules,
    performerType,
    lastReviewDate,
    derivedFromUri,
    effectivePeriod,
    modifierExtension,
    permittedDataType,
    preferredReportName,
    derivedFromCanonical,
    multipleResultsAllowed,
    component,
    qualifiedValue,
    quantitativeDetails,
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
  val code: FHIRComponentFieldMeta[CodeableConcept] =
    FHIRComponentFieldMeta("code", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
  val title: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("title", lTagOf[Option[String]], false, lTagOf[String])
  val status: FHIRComponentFieldMeta[PUBLICATION_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[PUBLICATION_STATUS], false, lTagOf[PUBLICATION_STATUS])
  val method: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("method", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val device: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("device", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val version: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("version", lTagOf[Option[String]], false, lTagOf[String])
  val contact: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("contact", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val purpose: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("purpose", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val subject: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("subject", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val category: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("category", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val bodySite: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("bodySite", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val specimen: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("specimen", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val publisher: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("publisher", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val copyright: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("copyright", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val hasMember: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("hasMember", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[Option[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
  val useContext: FHIRComponentFieldMeta[LitSeq[UsageContext]] =
    FHIRComponentFieldMeta("useContext", lTagOf[LitSeq[UsageContext]], false, lTagOf[UsageContext])
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
  val performerType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("performerType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val lastReviewDate: FHIRComponentFieldMeta[Option[FHIRDate]] =
    FHIRComponentFieldMeta("lastReviewDate", lTagOf[Option[FHIRDate]], false, lTagOf[FHIRDate])
  val derivedFromUri: FHIRComponentFieldMeta[LitSeq[UriStr]] =
    FHIRComponentFieldMeta("derivedFromUri", lTagOf[LitSeq[UriStr]], false, lTagOf[UriStr])
  val effectivePeriod: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("effectivePeriod", lTagOf[Option[Period]], false, lTagOf[Period])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val permittedDataType: FHIRComponentFieldMeta[LitSeq[PERMITTED_DATA_TYPE]] =
    FHIRComponentFieldMeta("permittedDataType", lTagOf[LitSeq[PERMITTED_DATA_TYPE]], false, lTagOf[PERMITTED_DATA_TYPE])
  val preferredReportName: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("preferredReportName", lTagOf[Option[String]], false, lTagOf[String])
  val derivedFromCanonical: FHIRComponentFieldMeta[LitSeq[Canonical]] =
    FHIRComponentFieldMeta("derivedFromCanonical", lTagOf[LitSeq[Canonical]], false, lTagOf[Canonical])
  val multipleResultsAllowed: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("multipleResultsAllowed", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val component: FHIRComponentFieldMeta[LitSeq[ObservationDefinition.Component]] =
    FHIRComponentFieldMeta(
      "component",
      lTagOf[LitSeq[ObservationDefinition.Component]],
      false,
      lTagOf[ObservationDefinition.Component])
  val qualifiedValue: FHIRComponentFieldMeta[LitSeq[ObservationDefinition.QualifiedValue]] =
    FHIRComponentFieldMeta(
      "qualifiedValue",
      lTagOf[LitSeq[ObservationDefinition.QualifiedValue]],
      false,
      lTagOf[ObservationDefinition.QualifiedValue])
  val quantitativeDetails: FHIRComponentFieldMeta[Option[ObservationDefinition.QuantitativeDetails]] =
    FHIRComponentFieldMeta(
      "quantitativeDetails",
      lTagOf[Option[ObservationDefinition.QuantitativeDetails]],
      false,
      lTagOf[ObservationDefinition.QuantitativeDetails])
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
    method,
    device,
    version,
    contact,
    purpose,
    subject,
    language,
    category,
    bodySite,
    specimen,
    contained,
    extension,
    publisher,
    copyright,
    hasMember,
    identifier,
    useContext,
    description,
    experimental,
    jurisdiction,
    approvalDate,
    implicitRules,
    performerType,
    lastReviewDate,
    derivedFromUri,
    effectivePeriod,
    modifierExtension,
    permittedDataType,
    preferredReportName,
    derivedFromCanonical,
    multipleResultsAllowed,
    component,
    qualifiedValue,
    quantitativeDetails
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: ObservationDefinition): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[UriStr]](url, t.url),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[String]](name, t.name),
    FHIRComponentField[Option[FHIRDateTime]](date, t.date),
    FHIRComponentField[CodeableConcept](code, t.code),
    FHIRComponentField[Option[String]](title, t.title),
    FHIRComponentField[PUBLICATION_STATUS](status, t.status),
    FHIRComponentField[Option[CodeableConcept]](method, t.method),
    FHIRComponentField[LitSeq[Reference]](device, t.device),
    FHIRComponentField[Option[String]](version, t.version),
    FHIRComponentField[LitSeq[ContactDetail]](contact, t.contact),
    FHIRComponentField[Option[Markdown]](purpose, t.purpose),
    FHIRComponentField[Option[CodeableConcept]](subject, t.subject),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[CodeableConcept]](category, t.category),
    FHIRComponentField[Option[CodeableConcept]](bodySite, t.bodySite),
    FHIRComponentField[LitSeq[Reference]](specimen, t.specimen),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Reference]](publisher, t.publisher),
    FHIRComponentField[Option[Markdown]](copyright, t.copyright),
    FHIRComponentField[LitSeq[Reference]](hasMember, t.hasMember),
    FHIRComponentField[Option[Identifier]](identifier, t.identifier),
    FHIRComponentField[LitSeq[UsageContext]](useContext, t.useContext),
    FHIRComponentField[Option[Markdown]](description, t.description),
    FHIRComponentField[Option[Boolean]](experimental, t.experimental),
    FHIRComponentField[LitSeq[CodeableConcept]](jurisdiction, t.jurisdiction),
    FHIRComponentField[Option[FHIRDate]](approvalDate, t.approvalDate),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[CodeableConcept]](performerType, t.performerType),
    FHIRComponentField[Option[FHIRDate]](lastReviewDate, t.lastReviewDate),
    FHIRComponentField[LitSeq[UriStr]](derivedFromUri, t.derivedFromUri),
    FHIRComponentField[Option[Period]](effectivePeriod, t.effectivePeriod),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[PERMITTED_DATA_TYPE]](permittedDataType, t.permittedDataType),
    FHIRComponentField[Option[String]](preferredReportName, t.preferredReportName),
    FHIRComponentField[LitSeq[Canonical]](derivedFromCanonical, t.derivedFromCanonical),
    FHIRComponentField[Option[Boolean]](multipleResultsAllowed, t.multipleResultsAllowed),
    FHIRComponentField[LitSeq[ObservationDefinition.Component]](component, t.component),
    FHIRComponentField[LitSeq[ObservationDefinition.QualifiedValue]](qualifiedValue, t.qualifiedValue),
    FHIRComponentField[Option[ObservationDefinition.QuantitativeDetails]](quantitativeDetails, t.quantitativeDetails)
  )
  def extractId(t: ObservationDefinition): Option[String]                                           = t.id
  def extractUrl(t: ObservationDefinition): Option[UriStr]                                          = t.url
  def extractMeta(t: ObservationDefinition): Option[Meta]                                           = t.meta
  def extractText(t: ObservationDefinition): Option[Narrative]                                      = t.text
  def extractName(t: ObservationDefinition): Option[String]                                         = t.name
  def extractDate(t: ObservationDefinition): Option[FHIRDateTime]                                   = t.date
  def extractCode(t: ObservationDefinition): CodeableConcept                                        = t.code
  def extractTitle(t: ObservationDefinition): Option[String]                                        = t.title
  def extractStatus(t: ObservationDefinition): PUBLICATION_STATUS                                   = t.status
  def extractMethod(t: ObservationDefinition): Option[CodeableConcept]                              = t.method
  def extractDevice(t: ObservationDefinition): LitSeq[Reference]                                    = t.device
  def extractVersion(t: ObservationDefinition): Option[String]                                      = t.version
  def extractContact(t: ObservationDefinition): LitSeq[ContactDetail]                               = t.contact
  def extractPurpose(t: ObservationDefinition): Option[Markdown]                                    = t.purpose
  def extractSubject(t: ObservationDefinition): Option[CodeableConcept]                             = t.subject
  def extractLanguage(t: ObservationDefinition): Option[LANGUAGES]                                  = t.language
  def extractCategory(t: ObservationDefinition): LitSeq[CodeableConcept]                            = t.category
  def extractBodySite(t: ObservationDefinition): Option[CodeableConcept]                            = t.bodySite
  def extractSpecimen(t: ObservationDefinition): LitSeq[Reference]                                  = t.specimen
  def extractContained(t: ObservationDefinition): LitSeq[Resource]                                  = t.contained
  def extractExtension(t: ObservationDefinition): LitSeq[Extension]                                 = t.extension
  def extractPublisher(t: ObservationDefinition): Option[Reference]                                 = t.publisher
  def extractCopyright(t: ObservationDefinition): Option[Markdown]                                  = t.copyright
  def extractHasMember(t: ObservationDefinition): LitSeq[Reference]                                 = t.hasMember
  def extractIdentifier(t: ObservationDefinition): Option[Identifier]                               = t.identifier
  def extractUseContext(t: ObservationDefinition): LitSeq[UsageContext]                             = t.useContext
  def extractDescription(t: ObservationDefinition): Option[Markdown]                                = t.description
  def extractExperimental(t: ObservationDefinition): Option[Boolean]                                = t.experimental
  def extractJurisdiction(t: ObservationDefinition): LitSeq[CodeableConcept]                        = t.jurisdiction
  def extractApprovalDate(t: ObservationDefinition): Option[FHIRDate]                               = t.approvalDate
  def extractImplicitRules(t: ObservationDefinition): Option[UriStr]                                = t.implicitRules
  def extractPerformerType(t: ObservationDefinition): Option[CodeableConcept]                       = t.performerType
  def extractLastReviewDate(t: ObservationDefinition): Option[FHIRDate]                             = t.lastReviewDate
  def extractDerivedFromUri(t: ObservationDefinition): LitSeq[UriStr]                               = t.derivedFromUri
  def extractEffectivePeriod(t: ObservationDefinition): Option[Period]                              = t.effectivePeriod
  def extractModifierExtension(t: ObservationDefinition): LitSeq[Extension]                         = t.modifierExtension
  def extractPermittedDataType(t: ObservationDefinition): LitSeq[PERMITTED_DATA_TYPE]               = t.permittedDataType
  def extractPreferredReportName(t: ObservationDefinition): Option[String]                          = t.preferredReportName
  def extractDerivedFromCanonical(t: ObservationDefinition): LitSeq[Canonical]                      = t.derivedFromCanonical
  def extractMultipleResultsAllowed(t: ObservationDefinition): Option[Boolean]                      = t.multipleResultsAllowed
  def extractComponent(t: ObservationDefinition): LitSeq[ObservationDefinition.Component]           = t.component
  def extractQualifiedValue(t: ObservationDefinition): LitSeq[ObservationDefinition.QualifiedValue] = t.qualifiedValue
  def extractQuantitativeDetails(t: ObservationDefinition): Option[ObservationDefinition.QuantitativeDetails] =
    t.quantitativeDetails
  override val thisName: String = "ObservationDefinition"
  override val searchParams: Map[String, ObservationDefinition => Seq[Any]] = Map(
    "code"         -> (obj => Seq(obj.code)),
    "status"       -> (obj => Seq(obj.status)),
    "category"     -> (obj => obj.category.toSeq),
    "title"        -> (obj => obj.title.toSeq),
    "experimental" -> (obj => obj.experimental.toSeq),
    "method"       -> (obj => obj.method.toSeq),
    "identifier"   -> (obj => obj.identifier.toSeq),
    "url"          -> (obj => obj.url.toSeq)
  )
  // format: off
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ObservationDefinition] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ => Try(
      new ObservationDefinition(
        cursor.decodeAs[Option[String]]("id", Some(None)),
        cursor.decodeAs[Option[UriStr]]("url", Some(None)),
        cursor.decodeAs[Option[Meta]]("meta", Some(None)),
        cursor.decodeAs[Option[Narrative]]("text", Some(None)),
        cursor.decodeAs[Option[String]]("name", Some(None)),
        cursor.decodeAs[Option[FHIRDateTime]]("date", Some(None)),
        cursor.decodeAs[CodeableConcept]("code", None),
        cursor.decodeAs[Option[String]]("title", Some(None)),
        cursor.decodeAs[PUBLICATION_STATUS]("status", None),
        cursor.decodeAs[Option[CodeableConcept]]("method", Some(None)),
        cursor.decodeAs[LitSeq[Reference]]("device", Some(LitSeq.empty)),
        cursor.decodeAs[Option[String]]("version", Some(None)),
        cursor.decodeAs[LitSeq[ContactDetail]]("contact", Some(LitSeq.empty)),
        cursor.decodeAs[Option[Markdown]]("purpose", Some(None)),
        cursor.decodeAs[Option[CodeableConcept]]("subject", Some(None)),
        cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
        cursor.decodeAs[LitSeq[CodeableConcept]]("category", Some(LitSeq.empty)),
        cursor.decodeAs[Option[CodeableConcept]]("bodySite", Some(None)),
        cursor.decodeAs[LitSeq[Reference]]("specimen", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
        cursor.decodeAs[Option[Reference]]("publisher", Some(None)),
        cursor.decodeAs[Option[Markdown]]("copyright", Some(None)),
        cursor.decodeAs[LitSeq[Reference]]("hasMember", Some(LitSeq.empty)),
        cursor.decodeAs[Option[Identifier]]("identifier", Some(None)),
        cursor.decodeAs[LitSeq[UsageContext]]("useContext", Some(LitSeq.empty)),
        cursor.decodeAs[Option[Markdown]]("description", Some(None)),
        cursor.decodeAs[Option[Boolean]]("experimental", Some(None)),
        cursor.decodeAs[LitSeq[CodeableConcept]]("jurisdiction", Some(LitSeq.empty)),
        cursor.decodeAs[Option[FHIRDate]]("approvalDate", Some(None)),
        cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
        cursor.decodeAs[Option[CodeableConcept]]("performerType", Some(None)),
        cursor.decodeAs[Option[FHIRDate]]("lastReviewDate", Some(None)),
        cursor.decodeAs[LitSeq[UriStr]]("derivedFromUri", Some(LitSeq.empty)),
        cursor.decodeAs[Option[Period]]("effectivePeriod", Some(None)),
        cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[PERMITTED_DATA_TYPE]]("permittedDataType", Some(LitSeq.empty)),
        cursor.decodeAs[Option[String]]("preferredReportName", Some(None)),
        cursor.decodeAs[LitSeq[Canonical]]("derivedFromCanonical", Some(LitSeq.empty)),
        cursor.decodeAs[Option[Boolean]]("multipleResultsAllowed", Some(None)),
        cursor.decodeAs[LitSeq[ObservationDefinition.Component]]("component", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[ObservationDefinition.QualifiedValue]]("qualifiedValue", Some(LitSeq.empty)),
        cursor.decodeAs[Option[ObservationDefinition.QuantitativeDetails]]("quantitativeDetails", Some(None)),
        decodeAttributes(cursor)
      )
    ))
  // format: on
}

/** Set of definitional characteristics for a kind of observation or measurement produced or consumed by an orderable health care
  * service.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields url, name, date, code, title, status, method, device, version, contact, purpose, subject, category,
  *   bodySite, specimen, publisher, copyright, hasMember, identifier, useContext, description, experimental, jurisdiction,
  *   approvalDate, performerType, lastReviewDate, derivedFromUri, effectivePeriod, permittedDataType, preferredReportName,
  *   derivedFromCanonical, multipleResultsAllowed, component, qualifiedValue, quantitativeDetails.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param url
  *   - An absolute URL that is used to identify this ObservationDefinition when it is referenced in a specification, model,
  *   design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this
  *   ObservationDefinition is (or will be) published. The URL SHOULD include the major version of the ObservationDefinition. For
  *   more information see Technical and Business Versions.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *   not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *   resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to
  *   make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be
  *   represented in the narrative to ensure clinical safety.
  * @param name
  *   - A natural language name identifying the ObservationDefinition. This name should be usable as an identifier for the module
  *   by machine processing applications such as code generation.
  * @param date
  *   - The date (and optionally time) when the ObservationDefinition was published. The date must change when the business
  *   version changes and it must change if the status code changes. In addition, it should change when the substantive content of
  *   the ObservationDefinition changes.
  * @param code
  *   - Describes what will be observed. Sometimes this is called the observation "name".
  * @param title
  *   - A short, descriptive, user-friendly title for the ObservationDefinition.
  * @param status
  *   - The current state of the ObservationDefinition.
  * @param method
  *   - The method or technique used to perform the observation.
  * @param device
  *   - The measurement model of device or actual device used to produce observations of this type.
  * @param version
  *   - The identifier that is used to identify this version of the ObservationDefinition when it is referenced in a
  *   specification, model, design or instance. This is an arbitrary value managed by the ObservationDefinition author and is not
  *   expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available.
  *   There is also no expectation that versions are orderable.
  * @param contact
  *   - Contact details to assist a user in finding and communicating with the publisher.
  * @param purpose
  *   - Explains why this ObservationDefinition is needed and why it has been designed as it has.
  * @param subject
  *   - A code that describes the intended kind of subject of Observation instances conforming to this ObservationDefinition.
  * @param language
  *   - The base language in which the resource is written.
  * @param category
  *   - A code that classifies the general type of observation.
  * @param bodySite
  *   - The site on the subject's body where the observation is to be made.
  * @param specimen
  *   - The kind of specimen that this type of observation is produced on.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param publisher
  *   - Helps establish the "authority/credibility" of the ObservationDefinition. May also allow for contact.
  * @param copyright
  *   - Copyright statement relating to the ObservationDefinition and/or its contents. Copyright statements are generally legal
  *   restrictions on the use and publishing of the ObservationDefinition.
  * @param hasMember
  *   - This ObservationDefinition defines a group observation (e.g. a battery, a panel of tests, a set of vital sign
  *   measurements) that includes the target as a member of the group.
  * @param identifier
  *   - Business identifiers assigned to this ObservationDefinition. by the performer and/or other systems. These identifiers
  *   remain constant as the resource is updated and propagates from server to server.
  * @param useContext
  *   - The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be
  *   general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be
  *   used to assist with indexing and searching for appropriate ObservationDefinition instances.
  * @param description
  *   - A free text natural language description of the ObservationDefinition from the consumer's perspective.
  * @param experimental
  *   - A flag to indicate that this ObservationDefinition is authored for testing purposes (or education/evaluation/marketing),
  *   and is not intended to be used for genuine usage.
  * @param jurisdiction
  *   - A jurisdiction in which the ObservationDefinition is intended to be used.
  * @param approvalDate
  *   - The date on which the asset content was approved by the publisher. Approval happens once when the content is officially
  *   approved for usage.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param performerType
  *   - The type of individual/organization/device that is expected to act upon instances of this definition.
  * @param lastReviewDate
  *   - The date on which the asset content was last reviewed. Review happens periodically after that, but doesn't change the
  *   original approval date.
  * @param derivedFromUri
  *   - The URL pointing to an externally-defined observation definition, guideline or other definition that is adhered to in
  *   whole or in part by this definition.
  * @param effectivePeriod
  *   - The period during which the ObservationDefinition content was or is planned to be effective.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *   the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually
  *   modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict
  *   set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param permittedDataType
  *   - The data types allowed for the value element of the instance observations conforming to this ObservationDefinition.
  * @param preferredReportName
  *   - The preferred name to be used when reporting the results of observations conforming to this ObservationDefinition.
  * @param derivedFromCanonical
  *   - The canonical URL pointing to another FHIR-defined ObservationDefinition that is adhered to in whole or in part by this
  *   definition.
  * @param multipleResultsAllowed
  *   - Multiple results allowed for observations conforming to this ObservationDefinition.
  * @param component
  *   - Some observations have multiple component observations, expressed as separate code value pairs.
  * @param qualifiedValue
  *   - A set of qualified values associated with a context and a set of conditions - provides a range for quantitative and
  *   ordinal observations and a collection of value sets for qualitative observations.
  * @param quantitativeDetails
  *   - Characteristics for quantitative results of observations conforming to this ObservationDefinition.
  */
@POJOBoilerplate
class ObservationDefinition(
    override val id: Option[String] = None,
    val url: Option[UriStr] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val name: Option[String] = None,
    val date: Option[FHIRDateTime] = None,
    val code: CodeableConcept,
    val title: Option[String] = None,
    val status: PUBLICATION_STATUS,
    val method: Option[CodeableConcept] = None,
    val device: LitSeq[Reference] = LitSeq.empty,
    val version: Option[String] = None,
    val contact: LitSeq[ContactDetail] = LitSeq.empty,
    val purpose: Option[Markdown] = None,
    val subject: Option[CodeableConcept] = None,
    override val language: Option[LANGUAGES] = None,
    val category: LitSeq[CodeableConcept] = LitSeq.empty,
    val bodySite: Option[CodeableConcept] = None,
    val specimen: LitSeq[Reference] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val publisher: Option[Reference] = None,
    val copyright: Option[Markdown] = None,
    val hasMember: LitSeq[Reference] = LitSeq.empty,
    val identifier: Option[Identifier] = None,
    val useContext: LitSeq[UsageContext] = LitSeq.empty,
    val description: Option[Markdown] = None,
    val experimental: Option[Boolean] = None,
    val jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
    val approvalDate: Option[FHIRDate] = None,
    override val implicitRules: Option[UriStr] = None,
    val performerType: Option[CodeableConcept] = None,
    val lastReviewDate: Option[FHIRDate] = None,
    val derivedFromUri: LitSeq[UriStr] = LitSeq.empty,
    val effectivePeriod: Option[Period] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val permittedDataType: LitSeq[PERMITTED_DATA_TYPE] = LitSeq.empty,
    val preferredReportName: Option[String] = None,
    val derivedFromCanonical: LitSeq[Canonical] = LitSeq.empty,
    val multipleResultsAllowed: Option[Boolean] = None,
    val component: LitSeq[ObservationDefinition.Component] = LitSeq.empty,
    val qualifiedValue: LitSeq[ObservationDefinition.QualifiedValue] = LitSeq.empty,
    val quantitativeDetails: Option[ObservationDefinition.QuantitativeDetails] = None,
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
  override val thisTypeName: String = "ObservationDefinition"
}
