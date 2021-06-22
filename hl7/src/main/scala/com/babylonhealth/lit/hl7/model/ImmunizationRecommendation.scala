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
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object ImmunizationRecommendation extends CompanionFor[ImmunizationRecommendation] {
  implicit def summonObjectAndCompanionImmunizationRecommendation2143694014(
      o: ImmunizationRecommendation): ObjectAndCompanion[ImmunizationRecommendation, ImmunizationRecommendation.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = ImmunizationRecommendation
  override type ParentType   = ImmunizationRecommendation
  override val baseType: CompanionFor[ResourceType] = ImmunizationRecommendation
  override val parentType: CompanionFor[ParentType] = ImmunizationRecommendation
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/ImmunizationRecommendation")
  object Recommendation extends CompanionFor[Recommendation] {
    implicit def summonObjectAndCompanionRecommendation_1998039110(
        o: Recommendation): ObjectAndCompanion[Recommendation, Recommendation.type] = ObjectAndCompanion(o, this)
    override type ResourceType = Recommendation
    override type ParentType   = Recommendation
    override val parentType: CompanionFor[ResourceType] = Recommendation
    object DateCriterion extends CompanionFor[DateCriterion] {
      implicit def summonObjectAndCompanionDateCriterion_921913397(
          o: DateCriterion): ObjectAndCompanion[DateCriterion, DateCriterion.type] = ObjectAndCompanion(o, this)
      override type ResourceType = DateCriterion
      override type ParentType   = DateCriterion
      override val parentType: CompanionFor[ResourceType] = DateCriterion
      def apply(
          id: Option[String] = None,
          code: CodeableConcept,
          value: FHIRDateTime,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): DateCriterion = new DateCriterion(
        id,
        code,
        value,
        extension,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: DateCriterion): Option[(Option[String], CodeableConcept, FHIRDateTime, LitSeq[Extension], LitSeq[Extension])] = Some(
        (o.id, o.code, o.value, o.extension, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val code: FHIRComponentFieldMeta[CodeableConcept] =
        FHIRComponentFieldMeta("code", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
      val value: FHIRComponentFieldMeta[FHIRDateTime] =
        FHIRComponentFieldMeta("value", lTagOf[FHIRDateTime], false, lTagOf[FHIRDateTime])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, code, value, extension, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: DateCriterion): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[CodeableConcept](code, t.code),
        FHIRComponentField[FHIRDateTime](value, t.value),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[DateCriterion] = this
      val thisName: String                      = "DateCriterion"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[DateCriterion] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new DateCriterion(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[CodeableConcept]("code", None),
              cursor.decodeAs[FHIRDateTime]("value", None),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class DateCriterion(
        override val id: Option[String] = None,
        val code: CodeableConcept,
        val value: FHIRDateTime,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    type DoseNumberChoice  = Choice[Union_0839638734]
    type SeriesDosesChoice = Choice[Union_0839638734]
    def apply(
        id: Option[String] = None,
        series: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        vaccineCode: LitSeq[CodeableConcept] = LitSeq.empty,
        description: Option[String] = None,
        targetDisease: Option[CodeableConcept] = None,
        doseNumber: Option[Recommendation.DoseNumberChoice] = None,
        forecastStatus: CodeableConcept,
        forecastReason: LitSeq[CodeableConcept] = LitSeq.empty,
        seriesDoses: Option[Recommendation.SeriesDosesChoice] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        supportingImmunization: LitSeq[Reference] = LitSeq.empty,
        contraindicatedVaccineCode: LitSeq[CodeableConcept] = LitSeq.empty,
        supportingPatientInformation: LitSeq[Reference] = LitSeq.empty,
        dateCriterion: LitSeq[Recommendation.DateCriterion] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Recommendation = new Recommendation(
      id,
      series,
      extension,
      vaccineCode,
      description,
      targetDisease,
      doseNumber,
      forecastStatus,
      forecastReason,
      seriesDoses,
      modifierExtension,
      supportingImmunization,
      contraindicatedVaccineCode,
      supportingPatientInformation,
      dateCriterion,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Recommendation): Option[(Option[String], Option[String], LitSeq[Extension], LitSeq[CodeableConcept], Option[String], Option[CodeableConcept], Option[Recommendation.DoseNumberChoice], CodeableConcept, LitSeq[CodeableConcept], Option[Recommendation.SeriesDosesChoice], LitSeq[Extension], LitSeq[Reference], LitSeq[CodeableConcept], LitSeq[Reference], LitSeq[Recommendation.DateCriterion])] =
      Some(
        (
          o.id,
          o.series,
          o.extension,
          o.vaccineCode,
          o.description,
          o.targetDisease,
          o.doseNumber,
          o.forecastStatus,
          o.forecastReason,
          o.seriesDoses,
          o.modifierExtension,
          o.supportingImmunization,
          o.contraindicatedVaccineCode,
          o.supportingPatientInformation,
          o.dateCriterion))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val series: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("series", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val vaccineCode: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("vaccineCode", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val description: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
    val targetDisease: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("targetDisease", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val doseNumber: FHIRComponentFieldMeta[Option[Recommendation.DoseNumberChoice]] =
      FHIRComponentFieldMeta("doseNumber", lTagOf[Option[Recommendation.DoseNumberChoice]], true, lTagOf[Union_0839638734])
    val forecastStatus: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("forecastStatus", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val forecastReason: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("forecastReason", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val seriesDoses: FHIRComponentFieldMeta[Option[Recommendation.SeriesDosesChoice]] =
      FHIRComponentFieldMeta("seriesDoses", lTagOf[Option[Recommendation.SeriesDosesChoice]], true, lTagOf[Union_0839638734])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val supportingImmunization: FHIRComponentFieldMeta[LitSeq[Reference]] =
      FHIRComponentFieldMeta("supportingImmunization", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
    val contraindicatedVaccineCode: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("contraindicatedVaccineCode", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val supportingPatientInformation: FHIRComponentFieldMeta[LitSeq[Reference]] =
      FHIRComponentFieldMeta("supportingPatientInformation", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
    val dateCriterion: FHIRComponentFieldMeta[LitSeq[Recommendation.DateCriterion]] =
      FHIRComponentFieldMeta(
        "dateCriterion",
        lTagOf[LitSeq[Recommendation.DateCriterion]],
        false,
        lTagOf[Recommendation.DateCriterion])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
      id,
      series,
      extension,
      vaccineCode,
      description,
      targetDisease,
      doseNumber,
      forecastStatus,
      forecastReason,
      seriesDoses,
      modifierExtension,
      supportingImmunization,
      contraindicatedVaccineCode,
      supportingPatientInformation,
      dateCriterion
    )
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Recommendation): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[String]](series, t.series),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[CodeableConcept]](vaccineCode, t.vaccineCode),
      FHIRComponentField[Option[String]](description, t.description),
      FHIRComponentField[Option[CodeableConcept]](targetDisease, t.targetDisease),
      FHIRComponentField[Option[Recommendation.DoseNumberChoice]](doseNumber, t.doseNumber),
      FHIRComponentField[CodeableConcept](forecastStatus, t.forecastStatus),
      FHIRComponentField[LitSeq[CodeableConcept]](forecastReason, t.forecastReason),
      FHIRComponentField[Option[Recommendation.SeriesDosesChoice]](seriesDoses, t.seriesDoses),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[Reference]](supportingImmunization, t.supportingImmunization),
      FHIRComponentField[LitSeq[CodeableConcept]](contraindicatedVaccineCode, t.contraindicatedVaccineCode),
      FHIRComponentField[LitSeq[Reference]](supportingPatientInformation, t.supportingPatientInformation),
      FHIRComponentField[LitSeq[Recommendation.DateCriterion]](dateCriterion, t.dateCriterion)
    )
    val baseType: CompanionFor[Recommendation] = this
    val thisName: String                       = "Recommendation"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Recommendation] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Recommendation(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[String]]("series", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("vaccineCode", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("description", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("targetDisease", Some(None)),
            cursor.decodeOptRef[Union_0839638734]("doseNumber"),
            cursor.decodeAs[CodeableConcept]("forecastStatus", None),
            cursor.decodeAs[LitSeq[CodeableConcept]]("forecastReason", Some(LitSeq.empty)),
            cursor.decodeOptRef[Union_0839638734]("seriesDoses"),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Reference]]("supportingImmunization", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("contraindicatedVaccineCode", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Reference]]("supportingPatientInformation", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Recommendation.DateCriterion]]("dateCriterion", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Recommendation(
      override val id: Option[String] = None,
      val series: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val vaccineCode: LitSeq[CodeableConcept] = LitSeq.empty,
      val description: Option[String] = None,
      val targetDisease: Option[CodeableConcept] = None,
      val doseNumber: Option[Recommendation.DoseNumberChoice] = None,
      val forecastStatus: CodeableConcept,
      val forecastReason: LitSeq[CodeableConcept] = LitSeq.empty,
      val seriesDoses: Option[Recommendation.SeriesDosesChoice] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val supportingImmunization: LitSeq[Reference] = LitSeq.empty,
      val contraindicatedVaccineCode: LitSeq[CodeableConcept] = LitSeq.empty,
      val supportingPatientInformation: LitSeq[Reference] = LitSeq.empty,
      val dateCriterion: LitSeq[Recommendation.DateCriterion] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      date: FHIRDateTime,
      patient: Reference,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      authority: Option[Reference] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      recommendation: NonEmptyLitSeq[ImmunizationRecommendation.Recommendation],
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): ImmunizationRecommendation = new ImmunizationRecommendation(
    id,
    meta,
    text,
    date,
    patient,
    language,
    contained,
    extension,
    authority,
    identifier,
    implicitRules,
    modifierExtension,
    recommendation,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val date: FHIRComponentFieldMeta[FHIRDateTime] =
    FHIRComponentFieldMeta("date", lTagOf[FHIRDateTime], false, lTagOf[FHIRDateTime])
  val patient: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("patient", lTagOf[Reference], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val authority: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("authority", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val recommendation: FHIRComponentFieldMeta[NonEmptyLitSeq[ImmunizationRecommendation.Recommendation]] =
    FHIRComponentFieldMeta(
      "recommendation",
      lTagOf[NonEmptyLitSeq[ImmunizationRecommendation.Recommendation]],
      false,
      lTagOf[ImmunizationRecommendation.Recommendation])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    date,
    patient,
    language,
    contained,
    extension,
    authority,
    identifier,
    implicitRules,
    modifierExtension,
    recommendation)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: ImmunizationRecommendation): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[FHIRDateTime](date, t.date),
    FHIRComponentField[Reference](patient, t.patient),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Reference]](authority, t.authority),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[NonEmptyLitSeq[ImmunizationRecommendation.Recommendation]](recommendation, t.recommendation)
  )
  def extractId(t: ImmunizationRecommendation): Option[String]                   = t.id
  def extractMeta(t: ImmunizationRecommendation): Option[Meta]                   = t.meta
  def extractText(t: ImmunizationRecommendation): Option[Narrative]              = t.text
  def extractDate(t: ImmunizationRecommendation): FHIRDateTime                   = t.date
  def extractPatient(t: ImmunizationRecommendation): Reference                   = t.patient
  def extractLanguage(t: ImmunizationRecommendation): Option[LANGUAGES]          = t.language
  def extractContained(t: ImmunizationRecommendation): LitSeq[Resource]          = t.contained
  def extractExtension(t: ImmunizationRecommendation): LitSeq[Extension]         = t.extension
  def extractAuthority(t: ImmunizationRecommendation): Option[Reference]         = t.authority
  def extractIdentifier(t: ImmunizationRecommendation): LitSeq[Identifier]       = t.identifier
  def extractImplicitRules(t: ImmunizationRecommendation): Option[UriStr]        = t.implicitRules
  def extractModifierExtension(t: ImmunizationRecommendation): LitSeq[Extension] = t.modifierExtension
  def extractRecommendation(t: ImmunizationRecommendation): NonEmptyLitSeq[ImmunizationRecommendation.Recommendation] =
    t.recommendation
  override val thisName: String = "ImmunizationRecommendation"
  override val searchParams: Map[String, ImmunizationRecommendation => Seq[Any]] = Map(
    "support"        -> (obj => obj.recommendation.flatMap(_.supportingImmunization).toSeq),
    "identifier"     -> (obj => obj.identifier.toSeq),
    "information"    -> (obj => obj.recommendation.flatMap(_.supportingPatientInformation).toSeq),
    "vaccine-type"   -> (obj => obj.recommendation.flatMap(_.vaccineCode).toSeq),
    "status"         -> (obj => obj.recommendation.map(_.forecastStatus).toSeq),
    "patient"        -> (obj => Seq(obj.patient)),
    "date"           -> (obj => Seq(obj.date)),
    "target-disease" -> (obj => obj.recommendation.flatMap(_.targetDisease).toSeq)
  )
  def unapply(
      o: ImmunizationRecommendation): Option[(Option[String], Option[Meta], Option[Narrative], FHIRDateTime, Reference, Option[LANGUAGES], LitSeq[Resource], LitSeq[Extension], Option[Reference], LitSeq[Identifier], Option[UriStr], LitSeq[Extension], NonEmptyLitSeq[ImmunizationRecommendation.Recommendation])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.date,
        o.patient,
        o.language,
        o.contained,
        o.extension,
        o.authority,
        o.identifier,
        o.implicitRules,
        o.modifierExtension,
        o.recommendation))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ImmunizationRecommendation] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new ImmunizationRecommendation(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[FHIRDateTime]("date", None),
          cursor.decodeAs[Reference]("patient", None),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("authority", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[NonEmptyLitSeq[ImmunizationRecommendation.Recommendation]]("recommendation", None),
          decodeAttributes(cursor)
        )
      ))
}

/** A patient's point-in-time set of recommendations (i.e. forecasting) according to a published schedule with optional supporting
  * justification.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields date, patient, authority, identifier, recommendation.
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
  * @param date
  *   - The date the immunization recommendation(s) were created.
  * @param patient
  *   - The patient the recommendation(s) are for.
  * @param language
  *   - The base language in which the resource is written.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param authority
  *   - Indicates the authority who published the protocol (e.g. ACIP).
  * @param identifier
  *   - A unique identifier assigned to this particular recommendation record.
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
  * @param recommendation
  *   - Vaccine administration recommendations.
  */
@POJOBoilerplate
class ImmunizationRecommendation(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val date: FHIRDateTime,
    val patient: Reference,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val authority: Option[Reference] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val recommendation: NonEmptyLitSeq[ImmunizationRecommendation.Recommendation],
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
  override val thisTypeName: String = "ImmunizationRecommendation"
}
