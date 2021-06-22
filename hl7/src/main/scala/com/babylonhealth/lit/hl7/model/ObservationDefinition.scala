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
import com.babylonhealth.lit.hl7.{ OBSERVATION_RANGE_CATEGORY, PERMITTED_DATA_TYPE, ADMINISTRATIVE_GENDER }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object ObservationDefinition extends CompanionFor[ObservationDefinition] {
  implicit def summonObjectAndCompanionObservationDefinition_670710272(
      o: ObservationDefinition): ObjectAndCompanion[ObservationDefinition, ObservationDefinition.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = ObservationDefinition
  override type ParentType   = ObservationDefinition
  override val baseType: CompanionFor[ResourceType] = ObservationDefinition
  override val parentType: CompanionFor[ParentType] = ObservationDefinition
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/ObservationDefinition")
  object QuantitativeDetails extends CompanionFor[QuantitativeDetails] {
    implicit def summonObjectAndCompanionQuantitativeDetails1005316963(
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
  object QualifiedInterval extends CompanionFor[QualifiedInterval] {
    implicit def summonObjectAndCompanionQualifiedInterval1621044709(
        o: QualifiedInterval): ObjectAndCompanion[QualifiedInterval, QualifiedInterval.type] = ObjectAndCompanion(o, this)
    override type ResourceType = QualifiedInterval
    override type ParentType   = QualifiedInterval
    override val parentType: CompanionFor[ResourceType] = QualifiedInterval
    def apply(
        id: Option[String] = None,
        age: Option[Range] = None,
        range: Option[Range] = None,
        gender: Option[ADMINISTRATIVE_GENDER] = None,
        context: Option[CodeableConcept] = None,
        category: Option[OBSERVATION_RANGE_CATEGORY] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        appliesTo: LitSeq[CodeableConcept] = LitSeq.empty,
        condition: Option[String] = None,
        gestationalAge: Option[Range] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): QualifiedInterval = new QualifiedInterval(
      id,
      age,
      range,
      gender,
      context,
      category,
      extension,
      appliesTo,
      condition,
      gestationalAge,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: QualifiedInterval): Option[(Option[String], Option[Range], Option[Range], Option[ADMINISTRATIVE_GENDER], Option[CodeableConcept], Option[OBSERVATION_RANGE_CATEGORY], LitSeq[Extension], LitSeq[CodeableConcept], Option[String], Option[Range], LitSeq[Extension])] =
      Some(
        (
          o.id,
          o.age,
          o.range,
          o.gender,
          o.context,
          o.category,
          o.extension,
          o.appliesTo,
          o.condition,
          o.gestationalAge,
          o.modifierExtension))
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
    val category: FHIRComponentFieldMeta[Option[OBSERVATION_RANGE_CATEGORY]] =
      FHIRComponentFieldMeta("category", lTagOf[Option[OBSERVATION_RANGE_CATEGORY]], false, lTagOf[OBSERVATION_RANGE_CATEGORY])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val appliesTo: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("appliesTo", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val condition: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("condition", lTagOf[Option[String]], false, lTagOf[String])
    val gestationalAge: FHIRComponentFieldMeta[Option[Range]] =
      FHIRComponentFieldMeta("gestationalAge", lTagOf[Option[Range]], false, lTagOf[Range])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, age, range, gender, context, category, extension, appliesTo, condition, gestationalAge, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: QualifiedInterval): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Range]](age, t.age),
      FHIRComponentField[Option[Range]](range, t.range),
      FHIRComponentField[Option[ADMINISTRATIVE_GENDER]](gender, t.gender),
      FHIRComponentField[Option[CodeableConcept]](context, t.context),
      FHIRComponentField[Option[OBSERVATION_RANGE_CATEGORY]](category, t.category),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[CodeableConcept]](appliesTo, t.appliesTo),
      FHIRComponentField[Option[String]](condition, t.condition),
      FHIRComponentField[Option[Range]](gestationalAge, t.gestationalAge),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[QualifiedInterval] = this
    val thisName: String                          = "QualifiedInterval"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[QualifiedInterval] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new QualifiedInterval(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[Range]]("age", Some(None)),
            cursor.decodeAs[Option[Range]]("range", Some(None)),
            cursor.decodeAs[Option[ADMINISTRATIVE_GENDER]]("gender", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("context", Some(None)),
            cursor.decodeAs[Option[OBSERVATION_RANGE_CATEGORY]]("category", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("appliesTo", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("condition", Some(None)),
            cursor.decodeAs[Option[Range]]("gestationalAge", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class QualifiedInterval(
      override val id: Option[String] = None,
      val age: Option[Range] = None,
      val range: Option[Range] = None,
      val gender: Option[ADMINISTRATIVE_GENDER] = None,
      val context: Option[CodeableConcept] = None,
      val category: Option[OBSERVATION_RANGE_CATEGORY] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val appliesTo: LitSeq[CodeableConcept] = LitSeq.empty,
      val condition: Option[String] = None,
      val gestationalAge: Option[Range] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      code: CodeableConcept,
      method: Option[CodeableConcept] = None,
      language: Option[LANGUAGES] = None,
      category: LitSeq[CodeableConcept] = LitSeq.empty,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      permittedDataType: LitSeq[PERMITTED_DATA_TYPE] = LitSeq.empty,
      validCodedValueSet: Option[Reference] = None,
      preferredReportName: Option[String] = None,
      normalCodedValueSet: Option[Reference] = None,
      abnormalCodedValueSet: Option[Reference] = None,
      criticalCodedValueSet: Option[Reference] = None,
      multipleResultsAllowed: Option[Boolean] = None,
      qualifiedInterval: LitSeq[ObservationDefinition.QualifiedInterval] = LitSeq.empty,
      quantitativeDetails: Option[ObservationDefinition.QuantitativeDetails] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): ObservationDefinition = new ObservationDefinition(
    id,
    meta,
    text,
    code,
    method,
    language,
    category,
    contained,
    extension,
    identifier,
    implicitRules,
    modifierExtension,
    permittedDataType,
    validCodedValueSet,
    preferredReportName,
    normalCodedValueSet,
    abnormalCodedValueSet,
    criticalCodedValueSet,
    multipleResultsAllowed,
    qualifiedInterval,
    quantitativeDetails,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val code: FHIRComponentFieldMeta[CodeableConcept] =
    FHIRComponentFieldMeta("code", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
  val method: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("method", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val category: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("category", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val permittedDataType: FHIRComponentFieldMeta[LitSeq[PERMITTED_DATA_TYPE]] =
    FHIRComponentFieldMeta("permittedDataType", lTagOf[LitSeq[PERMITTED_DATA_TYPE]], false, lTagOf[PERMITTED_DATA_TYPE])
  val validCodedValueSet: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("validCodedValueSet", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val preferredReportName: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("preferredReportName", lTagOf[Option[String]], false, lTagOf[String])
  val normalCodedValueSet: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("normalCodedValueSet", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val abnormalCodedValueSet: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("abnormalCodedValueSet", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val criticalCodedValueSet: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("criticalCodedValueSet", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val multipleResultsAllowed: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("multipleResultsAllowed", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val qualifiedInterval: FHIRComponentFieldMeta[LitSeq[ObservationDefinition.QualifiedInterval]] =
    FHIRComponentFieldMeta(
      "qualifiedInterval",
      lTagOf[LitSeq[ObservationDefinition.QualifiedInterval]],
      false,
      lTagOf[ObservationDefinition.QualifiedInterval])
  val quantitativeDetails: FHIRComponentFieldMeta[Option[ObservationDefinition.QuantitativeDetails]] =
    FHIRComponentFieldMeta(
      "quantitativeDetails",
      lTagOf[Option[ObservationDefinition.QuantitativeDetails]],
      false,
      lTagOf[ObservationDefinition.QuantitativeDetails])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    code,
    method,
    language,
    category,
    contained,
    extension,
    identifier,
    implicitRules,
    modifierExtension,
    permittedDataType,
    validCodedValueSet,
    preferredReportName,
    normalCodedValueSet,
    abnormalCodedValueSet,
    criticalCodedValueSet,
    multipleResultsAllowed,
    qualifiedInterval,
    quantitativeDetails
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: ObservationDefinition): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[CodeableConcept](code, t.code),
    FHIRComponentField[Option[CodeableConcept]](method, t.method),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[CodeableConcept]](category, t.category),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[PERMITTED_DATA_TYPE]](permittedDataType, t.permittedDataType),
    FHIRComponentField[Option[Reference]](validCodedValueSet, t.validCodedValueSet),
    FHIRComponentField[Option[String]](preferredReportName, t.preferredReportName),
    FHIRComponentField[Option[Reference]](normalCodedValueSet, t.normalCodedValueSet),
    FHIRComponentField[Option[Reference]](abnormalCodedValueSet, t.abnormalCodedValueSet),
    FHIRComponentField[Option[Reference]](criticalCodedValueSet, t.criticalCodedValueSet),
    FHIRComponentField[Option[Boolean]](multipleResultsAllowed, t.multipleResultsAllowed),
    FHIRComponentField[LitSeq[ObservationDefinition.QualifiedInterval]](qualifiedInterval, t.qualifiedInterval),
    FHIRComponentField[Option[ObservationDefinition.QuantitativeDetails]](quantitativeDetails, t.quantitativeDetails)
  )
  def extractId(t: ObservationDefinition): Option[String]                             = t.id
  def extractMeta(t: ObservationDefinition): Option[Meta]                             = t.meta
  def extractText(t: ObservationDefinition): Option[Narrative]                        = t.text
  def extractCode(t: ObservationDefinition): CodeableConcept                          = t.code
  def extractMethod(t: ObservationDefinition): Option[CodeableConcept]                = t.method
  def extractLanguage(t: ObservationDefinition): Option[LANGUAGES]                    = t.language
  def extractCategory(t: ObservationDefinition): LitSeq[CodeableConcept]              = t.category
  def extractContained(t: ObservationDefinition): LitSeq[Resource]                    = t.contained
  def extractExtension(t: ObservationDefinition): LitSeq[Extension]                   = t.extension
  def extractIdentifier(t: ObservationDefinition): LitSeq[Identifier]                 = t.identifier
  def extractImplicitRules(t: ObservationDefinition): Option[UriStr]                  = t.implicitRules
  def extractModifierExtension(t: ObservationDefinition): LitSeq[Extension]           = t.modifierExtension
  def extractPermittedDataType(t: ObservationDefinition): LitSeq[PERMITTED_DATA_TYPE] = t.permittedDataType
  def extractValidCodedValueSet(t: ObservationDefinition): Option[Reference]          = t.validCodedValueSet
  def extractPreferredReportName(t: ObservationDefinition): Option[String]            = t.preferredReportName
  def extractNormalCodedValueSet(t: ObservationDefinition): Option[Reference]         = t.normalCodedValueSet
  def extractAbnormalCodedValueSet(t: ObservationDefinition): Option[Reference]       = t.abnormalCodedValueSet
  def extractCriticalCodedValueSet(t: ObservationDefinition): Option[Reference]       = t.criticalCodedValueSet
  def extractMultipleResultsAllowed(t: ObservationDefinition): Option[Boolean]        = t.multipleResultsAllowed
  def extractQualifiedInterval(t: ObservationDefinition): LitSeq[ObservationDefinition.QualifiedInterval] = t.qualifiedInterval
  def extractQuantitativeDetails(t: ObservationDefinition): Option[ObservationDefinition.QuantitativeDetails] =
    t.quantitativeDetails
  override val thisName: String = "ObservationDefinition"
  def unapply(
      o: ObservationDefinition): Option[(Option[String], Option[Meta], Option[Narrative], CodeableConcept, Option[CodeableConcept], Option[LANGUAGES], LitSeq[CodeableConcept], LitSeq[Resource], LitSeq[Extension], LitSeq[Identifier], Option[UriStr], LitSeq[Extension], LitSeq[PERMITTED_DATA_TYPE], Option[Reference], Option[String], Option[Reference], Option[Reference], Option[Reference], Option[Boolean], LitSeq[ObservationDefinition.QualifiedInterval], Option[ObservationDefinition.QuantitativeDetails])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.code,
        o.method,
        o.language,
        o.category,
        o.contained,
        o.extension,
        o.identifier,
        o.implicitRules,
        o.modifierExtension,
        o.permittedDataType,
        o.validCodedValueSet,
        o.preferredReportName,
        o.normalCodedValueSet,
        o.abnormalCodedValueSet,
        o.criticalCodedValueSet,
        o.multipleResultsAllowed,
        o.qualifiedInterval,
        o.quantitativeDetails))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ObservationDefinition] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new ObservationDefinition(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[CodeableConcept]("code", None),
          cursor.decodeAs[Option[CodeableConcept]]("method", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("category", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[PERMITTED_DATA_TYPE]]("permittedDataType", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("validCodedValueSet", Some(None)),
          cursor.decodeAs[Option[String]]("preferredReportName", Some(None)),
          cursor.decodeAs[Option[Reference]]("normalCodedValueSet", Some(None)),
          cursor.decodeAs[Option[Reference]]("abnormalCodedValueSet", Some(None)),
          cursor.decodeAs[Option[Reference]]("criticalCodedValueSet", Some(None)),
          cursor.decodeAs[Option[Boolean]]("multipleResultsAllowed", Some(None)),
          cursor.decodeAs[LitSeq[ObservationDefinition.QualifiedInterval]]("qualifiedInterval", Some(LitSeq.empty)),
          cursor.decodeAs[Option[ObservationDefinition.QuantitativeDetails]]("quantitativeDetails", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** Set of definitional characteristics for a kind of observation or measurement produced or consumed by an orderable health care
  * service.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields code, method, category, identifier, permittedDataType, validCodedValueSet, preferredReportName,
  *   normalCodedValueSet, abnormalCodedValueSet, criticalCodedValueSet, multipleResultsAllowed, qualifiedInterval,
  *   quantitativeDetails.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *   not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *   resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to
  *   make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be
  *   represented in the narrative to ensure clinical safety.
  * @param code
  *   - Describes what will be observed. Sometimes this is called the observation "name".
  * @param method
  *   - The method or technique used to perform the observation.
  * @param language
  *   - The base language in which the resource is written.
  * @param category
  *   - A code that classifies the general type of observation.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param identifier
  *   - A unique identifier assigned to this ObservationDefinition artifact.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
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
  * @param validCodedValueSet
  *   - The set of valid coded results for the observations conforming to this ObservationDefinition.
  * @param preferredReportName
  *   - The preferred name to be used when reporting the results of observations conforming to this ObservationDefinition.
  * @param normalCodedValueSet
  *   - The set of normal coded results for the observations conforming to this ObservationDefinition.
  * @param abnormalCodedValueSet
  *   - The set of abnormal coded results for the observation conforming to this ObservationDefinition.
  * @param criticalCodedValueSet
  *   - The set of critical coded results for the observation conforming to this ObservationDefinition.
  * @param multipleResultsAllowed
  *   - Multiple results allowed for observations conforming to this ObservationDefinition.
  * @param qualifiedInterval
  *   - Multiple ranges of results qualified by different contexts for ordinal or continuous observations conforming to this
  *   ObservationDefinition.
  * @param quantitativeDetails
  *   - Characteristics for quantitative results of this observation.
  */
@POJOBoilerplate
class ObservationDefinition(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val code: CodeableConcept,
    val method: Option[CodeableConcept] = None,
    override val language: Option[LANGUAGES] = None,
    val category: LitSeq[CodeableConcept] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val permittedDataType: LitSeq[PERMITTED_DATA_TYPE] = LitSeq.empty,
    val validCodedValueSet: Option[Reference] = None,
    val preferredReportName: Option[String] = None,
    val normalCodedValueSet: Option[Reference] = None,
    val abnormalCodedValueSet: Option[Reference] = None,
    val criticalCodedValueSet: Option[Reference] = None,
    val multipleResultsAllowed: Option[Boolean] = None,
    val qualifiedInterval: LitSeq[ObservationDefinition.QualifiedInterval] = LitSeq.empty,
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
