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
import com.babylonhealth.lit.hl7.IMMUNIZATION_EVALUATION_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object ImmunizationEvaluation extends CompanionFor[ImmunizationEvaluation] {
  implicit def summonObjectAndCompanionImmunizationEvaluation726701331(
      o: ImmunizationEvaluation): ObjectAndCompanion[ImmunizationEvaluation, ImmunizationEvaluation.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = ImmunizationEvaluation
  override type ParentType   = ImmunizationEvaluation
  override val baseType: CompanionFor[ResourceType] = ImmunizationEvaluation
  override val parentType: CompanionFor[ParentType] = ImmunizationEvaluation
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/ImmunizationEvaluation")
  type DoseNumberChoice  = Choice[UnionPositiveIntOrString]
  type SeriesDosesChoice = Choice[UnionPositiveIntOrString]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      date: Option[FHIRDateTime] = None,
      status: IMMUNIZATION_EVALUATION_STATUS,
      series: Option[String] = None,
      patient: Reference,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      authority: Option[Reference] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      doseStatus: CodeableConcept,
      description: Option[String] = None,
      implicitRules: Option[UriStr] = None,
      targetDisease: CodeableConcept,
      doseNumber: Option[ImmunizationEvaluation.DoseNumberChoice] = None,
      seriesDoses: Option[ImmunizationEvaluation.SeriesDosesChoice] = None,
      doseStatusReason: LitSeq[CodeableConcept] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      immunizationEvent: Reference,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): ImmunizationEvaluation = new ImmunizationEvaluation(
    id,
    meta,
    text,
    date,
    status,
    series,
    patient,
    language,
    contained,
    extension,
    authority,
    identifier,
    doseStatus,
    description,
    implicitRules,
    targetDisease,
    doseNumber,
    seriesDoses,
    doseStatusReason,
    modifierExtension,
    immunizationEvent,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val date: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("date", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val status: FHIRComponentFieldMeta[IMMUNIZATION_EVALUATION_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[IMMUNIZATION_EVALUATION_STATUS], false, lTagOf[IMMUNIZATION_EVALUATION_STATUS])
  val series: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("series", lTagOf[Option[String]], false, lTagOf[String])
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
  val doseStatus: FHIRComponentFieldMeta[CodeableConcept] =
    FHIRComponentFieldMeta("doseStatus", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
  val description: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val targetDisease: FHIRComponentFieldMeta[CodeableConcept] =
    FHIRComponentFieldMeta("targetDisease", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
  val doseNumber: FHIRComponentFieldMeta[Option[ImmunizationEvaluation.DoseNumberChoice]] =
    FHIRComponentFieldMeta(
      "doseNumber",
      lTagOf[Option[ImmunizationEvaluation.DoseNumberChoice]],
      true,
      lTagOf[UnionPositiveIntOrString])
  val seriesDoses: FHIRComponentFieldMeta[Option[ImmunizationEvaluation.SeriesDosesChoice]] =
    FHIRComponentFieldMeta(
      "seriesDoses",
      lTagOf[Option[ImmunizationEvaluation.SeriesDosesChoice]],
      true,
      lTagOf[UnionPositiveIntOrString])
  val doseStatusReason: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("doseStatusReason", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val immunizationEvent: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("immunizationEvent", lTagOf[Reference], false, lTagOf[Reference])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    date,
    status,
    series,
    patient,
    language,
    contained,
    extension,
    authority,
    identifier,
    doseStatus,
    description,
    implicitRules,
    targetDisease,
    doseNumber,
    seriesDoses,
    doseStatusReason,
    modifierExtension,
    immunizationEvent
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: ImmunizationEvaluation): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[FHIRDateTime]](date, t.date),
    FHIRComponentField[IMMUNIZATION_EVALUATION_STATUS](status, t.status),
    FHIRComponentField[Option[String]](series, t.series),
    FHIRComponentField[Reference](patient, t.patient),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Reference]](authority, t.authority),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[CodeableConcept](doseStatus, t.doseStatus),
    FHIRComponentField[Option[String]](description, t.description),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[CodeableConcept](targetDisease, t.targetDisease),
    FHIRComponentField[Option[ImmunizationEvaluation.DoseNumberChoice]](doseNumber, t.doseNumber),
    FHIRComponentField[Option[ImmunizationEvaluation.SeriesDosesChoice]](seriesDoses, t.seriesDoses),
    FHIRComponentField[LitSeq[CodeableConcept]](doseStatusReason, t.doseStatusReason),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Reference](immunizationEvent, t.immunizationEvent)
  )
  def extractId(t: ImmunizationEvaluation): Option[String]                                            = t.id
  def extractMeta(t: ImmunizationEvaluation): Option[Meta]                                            = t.meta
  def extractText(t: ImmunizationEvaluation): Option[Narrative]                                       = t.text
  def extractDate(t: ImmunizationEvaluation): Option[FHIRDateTime]                                    = t.date
  def extractStatus(t: ImmunizationEvaluation): IMMUNIZATION_EVALUATION_STATUS                        = t.status
  def extractSeries(t: ImmunizationEvaluation): Option[String]                                        = t.series
  def extractPatient(t: ImmunizationEvaluation): Reference                                            = t.patient
  def extractLanguage(t: ImmunizationEvaluation): Option[LANGUAGES]                                   = t.language
  def extractContained(t: ImmunizationEvaluation): LitSeq[Resource]                                   = t.contained
  def extractExtension(t: ImmunizationEvaluation): LitSeq[Extension]                                  = t.extension
  def extractAuthority(t: ImmunizationEvaluation): Option[Reference]                                  = t.authority
  def extractIdentifier(t: ImmunizationEvaluation): LitSeq[Identifier]                                = t.identifier
  def extractDoseStatus(t: ImmunizationEvaluation): CodeableConcept                                   = t.doseStatus
  def extractDescription(t: ImmunizationEvaluation): Option[String]                                   = t.description
  def extractImplicitRules(t: ImmunizationEvaluation): Option[UriStr]                                 = t.implicitRules
  def extractTargetDisease(t: ImmunizationEvaluation): CodeableConcept                                = t.targetDisease
  def extractDoseNumber(t: ImmunizationEvaluation): Option[ImmunizationEvaluation.DoseNumberChoice]   = t.doseNumber
  def extractSeriesDoses(t: ImmunizationEvaluation): Option[ImmunizationEvaluation.SeriesDosesChoice] = t.seriesDoses
  def extractDoseStatusReason(t: ImmunizationEvaluation): LitSeq[CodeableConcept]                     = t.doseStatusReason
  def extractModifierExtension(t: ImmunizationEvaluation): LitSeq[Extension]                          = t.modifierExtension
  def extractImmunizationEvent(t: ImmunizationEvaluation): Reference                                  = t.immunizationEvent
  override val thisName: String                                                                       = "ImmunizationEvaluation"
  override val searchParams: Map[String, ImmunizationEvaluation => Seq[Any]] = Map(
    "identifier"         -> (obj => obj.identifier.toSeq),
    "immunization-event" -> (obj => Seq(obj.immunizationEvent)),
    "dose-status"        -> (obj => Seq(obj.doseStatus)),
    "status"             -> (obj => Seq(obj.status)),
    "patient"            -> (obj => Seq(obj.patient)),
    "date"               -> (obj => obj.date.toSeq),
    "target-disease"     -> (obj => Seq(obj.targetDisease))
  )
  def unapply(
      o: ImmunizationEvaluation): Option[(Option[String], Option[Meta], Option[Narrative], Option[FHIRDateTime], IMMUNIZATION_EVALUATION_STATUS, Option[String], Reference, Option[LANGUAGES], LitSeq[Resource], LitSeq[Extension], Option[Reference], LitSeq[Identifier], CodeableConcept, Option[String], Option[UriStr], CodeableConcept, Option[ImmunizationEvaluation.DoseNumberChoice], Option[ImmunizationEvaluation.SeriesDosesChoice], LitSeq[CodeableConcept], LitSeq[Extension], Reference)] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.date,
        o.status,
        o.series,
        o.patient,
        o.language,
        o.contained,
        o.extension,
        o.authority,
        o.identifier,
        o.doseStatus,
        o.description,
        o.implicitRules,
        o.targetDisease,
        o.doseNumber,
        o.seriesDoses,
        o.doseStatusReason,
        o.modifierExtension,
        o.immunizationEvent))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ImmunizationEvaluation] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new ImmunizationEvaluation(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("date", Some(None)),
          cursor.decodeAs[IMMUNIZATION_EVALUATION_STATUS]("status", None),
          cursor.decodeAs[Option[String]]("series", Some(None)),
          cursor.decodeAs[Reference]("patient", None),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("authority", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[CodeableConcept]("doseStatus", None),
          cursor.decodeAs[Option[String]]("description", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[CodeableConcept]("targetDisease", None),
          cursor.decodeOptRef[UnionPositiveIntOrString]("doseNumber"),
          cursor.decodeOptRef[UnionPositiveIntOrString]("seriesDoses"),
          cursor.decodeAs[LitSeq[CodeableConcept]]("doseStatusReason", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Reference]("immunizationEvent", None),
          decodeAttributes(cursor)
        )
      ))
}

/** Describes a comparison of an immunization event against published recommendations to determine if the administration is
  * "valid" in relation to those recommendations.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields date, status, series, patient, authority, identifier, doseStatus, description, targetDisease,
  *   doseNumber, seriesDoses, doseStatusReason, immunizationEvent.
  * @param id
  *   \- The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta
  *   \- The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *   not always be associated with version changes to the resource.
  * @param text
  *   \- A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *   resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to
  *   make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be
  *   represented in the narrative to ensure clinical safety.
  * @param date
  *   \- The date the evaluation of the vaccine administration event was performed.
  * @param status
  *   \- Indicates the current status of the evaluation of the vaccination administration event.
  * @param series
  *   \- One possible path to achieve presumed immunity against a disease - within the context of an authority.
  * @param patient
  *   \- The individual for whom the evaluation is being done.
  * @param language
  *   \- The base language in which the resource is written.
  * @param contained
  *   \- These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   \- May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param authority
  *   \- Indicates the authority who published the protocol (e.g. ACIP).
  * @param identifier
  *   \- A unique identifier assigned to this immunization evaluation record.
  * @param doseStatus
  *   \- Indicates if the dose is valid or not valid with respect to the published recommendations.
  * @param description
  *   \- Additional information about the evaluation.
  * @param implicitRules
  *   \- A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param targetDisease
  *   \- The vaccine preventable disease the dose is being evaluated against.
  * @param doseNumber
  *   \- Nominal position in a series.
  * @param seriesDoses
  *   \- The recommended number of doses to achieve immunity.
  * @param doseStatusReason
  *   \- Provides an explanation as to why the vaccine administration event is valid or not relative to the published
  *   recommendations.
  * @param modifierExtension
  *   \- May be used to represent additional information that is not part of the basic definition of the resource and that
  *   modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *   Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *   strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *   extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *   processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any
  *   elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param immunizationEvent
  *   \- The vaccine administration event being evaluated.
  */
@POJOBoilerplate
class ImmunizationEvaluation(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val date: Option[FHIRDateTime] = None,
    val status: IMMUNIZATION_EVALUATION_STATUS,
    val series: Option[String] = None,
    val patient: Reference,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val authority: Option[Reference] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val doseStatus: CodeableConcept,
    val description: Option[String] = None,
    override val implicitRules: Option[UriStr] = None,
    val targetDisease: CodeableConcept,
    val doseNumber: Option[ImmunizationEvaluation.DoseNumberChoice] = None,
    val seriesDoses: Option[ImmunizationEvaluation.SeriesDosesChoice] = None,
    val doseStatusReason: LitSeq[CodeableConcept] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val immunizationEvent: Reference,
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
  override val thisTypeName: String = "ImmunizationEvaluation"
}
