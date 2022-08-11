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
import com.babylonhealth.lit.hl7.OBSERVATION_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object RiskAssessment extends CompanionFor[RiskAssessment] {
  implicit def summonObjectAndCompanionRiskAssessment373650982(
      o: RiskAssessment): ObjectAndCompanion[RiskAssessment, RiskAssessment.type] = ObjectAndCompanion(o, this)
  override type ResourceType = RiskAssessment
  override type ParentType   = RiskAssessment
  override val baseType: CompanionFor[ResourceType] = RiskAssessment
  override val parentType: CompanionFor[ParentType] = RiskAssessment
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/RiskAssessment")
  object Prediction extends CompanionFor[Prediction] {
    implicit def summonObjectAndCompanionPrediction_1532844510(o: Prediction): ObjectAndCompanion[Prediction, Prediction.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Prediction
    override type ParentType   = Prediction
    override val parentType: CompanionFor[ResourceType] = Prediction
    type WhenChoice        = Choice[UnionPeriodOrRange]
    type ProbabilityChoice = Choice[UnionDecimalOrRange]
    def apply(
        id: Option[String] = None,
        outcome: Option[CodeableConcept] = None,
        when: Option[Prediction.WhenChoice] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        rationale: Option[String] = None,
        relativeRisk: Option[BigDecimal] = None,
        probability: Option[Prediction.ProbabilityChoice] = None,
        qualitativeRisk: Option[CodeableConcept] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Prediction = new Prediction(
      id,
      outcome,
      when,
      extension,
      rationale,
      relativeRisk,
      probability,
      qualitativeRisk,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Prediction): Option[(Option[String], Option[CodeableConcept], Option[Prediction.WhenChoice], LitSeq[Extension], Option[String], Option[BigDecimal], Option[Prediction.ProbabilityChoice], Option[CodeableConcept], LitSeq[Extension])] =
      Some(
        (
          o.id,
          o.outcome,
          o.when,
          o.extension,
          o.rationale,
          o.relativeRisk,
          o.probability,
          o.qualitativeRisk,
          o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val outcome: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("outcome", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val when: FHIRComponentFieldMeta[Option[Prediction.WhenChoice]] =
      FHIRComponentFieldMeta("when", lTagOf[Option[Prediction.WhenChoice]], true, lTagOf[UnionPeriodOrRange])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val rationale: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("rationale", lTagOf[Option[String]], false, lTagOf[String])
    val relativeRisk: FHIRComponentFieldMeta[Option[BigDecimal]] =
      FHIRComponentFieldMeta("relativeRisk", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
    val probability: FHIRComponentFieldMeta[Option[Prediction.ProbabilityChoice]] =
      FHIRComponentFieldMeta("probability", lTagOf[Option[Prediction.ProbabilityChoice]], true, lTagOf[UnionDecimalOrRange])
    val qualitativeRisk: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("qualitativeRisk", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, outcome, when, extension, rationale, relativeRisk, probability, qualitativeRisk, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Prediction): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](outcome, t.outcome),
      FHIRComponentField[Option[Prediction.WhenChoice]](when, t.when),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[String]](rationale, t.rationale),
      FHIRComponentField[Option[BigDecimal]](relativeRisk, t.relativeRisk),
      FHIRComponentField[Option[Prediction.ProbabilityChoice]](probability, t.probability),
      FHIRComponentField[Option[CodeableConcept]](qualitativeRisk, t.qualitativeRisk),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Prediction] = this
    val thisName: String                   = "Prediction"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Prediction] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Prediction(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("outcome", Some(None)),
            cursor.decodeOptRef[UnionPeriodOrRange]("when"),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("rationale", Some(None)),
            cursor.decodeAs[Option[BigDecimal]]("relativeRisk", Some(None)),
            cursor.decodeOptRef[UnionDecimalOrRange]("probability"),
            cursor.decodeAs[Option[CodeableConcept]]("qualitativeRisk", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Prediction(
      override val id: Option[String] = None,
      val outcome: Option[CodeableConcept] = None,
      val when: Option[Prediction.WhenChoice] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val rationale: Option[String] = None,
      val relativeRisk: Option[BigDecimal] = None,
      val probability: Option[Prediction.ProbabilityChoice] = None,
      val qualitativeRisk: Option[CodeableConcept] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  type OccurrenceChoice = Choice[UnionDateTimeOrPeriod]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      code: Option[CodeableConcept] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      basis: LitSeq[Reference] = LitSeq.empty,
      parent: Option[Reference] = None,
      status: OBSERVATION_STATUS,
      method: Option[CodeableConcept] = None,
      basedOn: Option[Reference] = None,
      subject: Reference,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      encounter: Option[Reference] = None,
      condition: Option[Reference] = None,
      performer: Option[Reference] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
      mitigation: Option[String] = None,
      implicitRules: Option[UriStr] = None,
      occurrence: Option[RiskAssessment.OccurrenceChoice] = None,
      reasonReference: LitSeq[Reference] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      prediction: LitSeq[RiskAssessment.Prediction] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): RiskAssessment = new RiskAssessment(
    id,
    meta,
    text,
    code,
    note,
    basis,
    parent,
    status,
    method,
    basedOn,
    subject,
    language,
    contained,
    extension,
    encounter,
    condition,
    performer,
    identifier,
    reasonCode,
    mitigation,
    implicitRules,
    occurrence,
    reasonReference,
    modifierExtension,
    prediction,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val code: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("code", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val basis: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("basis", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val parent: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("parent", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val status: FHIRComponentFieldMeta[OBSERVATION_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[OBSERVATION_STATUS], false, lTagOf[OBSERVATION_STATUS])
  val method: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("method", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val basedOn: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("basedOn", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val subject: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("subject", lTagOf[Reference], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val encounter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("encounter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val condition: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("condition", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val performer: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("performer", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val reasonCode: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("reasonCode", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val mitigation: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("mitigation", lTagOf[Option[String]], false, lTagOf[String])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val occurrence: FHIRComponentFieldMeta[Option[RiskAssessment.OccurrenceChoice]] =
    FHIRComponentFieldMeta("occurrence", lTagOf[Option[RiskAssessment.OccurrenceChoice]], true, lTagOf[UnionDateTimeOrPeriod])
  val reasonReference: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("reasonReference", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val prediction: FHIRComponentFieldMeta[LitSeq[RiskAssessment.Prediction]] =
    FHIRComponentFieldMeta("prediction", lTagOf[LitSeq[RiskAssessment.Prediction]], false, lTagOf[RiskAssessment.Prediction])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    code,
    note,
    basis,
    parent,
    status,
    method,
    basedOn,
    subject,
    language,
    contained,
    extension,
    encounter,
    condition,
    performer,
    identifier,
    reasonCode,
    mitigation,
    implicitRules,
    occurrence,
    reasonReference,
    modifierExtension,
    prediction
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: RiskAssessment): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[CodeableConcept]](code, t.code),
    FHIRComponentField[LitSeq[Annotation]](note, t.note),
    FHIRComponentField[LitSeq[Reference]](basis, t.basis),
    FHIRComponentField[Option[Reference]](parent, t.parent),
    FHIRComponentField[OBSERVATION_STATUS](status, t.status),
    FHIRComponentField[Option[CodeableConcept]](method, t.method),
    FHIRComponentField[Option[Reference]](basedOn, t.basedOn),
    FHIRComponentField[Reference](subject, t.subject),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Reference]](encounter, t.encounter),
    FHIRComponentField[Option[Reference]](condition, t.condition),
    FHIRComponentField[Option[Reference]](performer, t.performer),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[LitSeq[CodeableConcept]](reasonCode, t.reasonCode),
    FHIRComponentField[Option[String]](mitigation, t.mitigation),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[RiskAssessment.OccurrenceChoice]](occurrence, t.occurrence),
    FHIRComponentField[LitSeq[Reference]](reasonReference, t.reasonReference),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[RiskAssessment.Prediction]](prediction, t.prediction)
  )
  def extractId(t: RiskAssessment): Option[String]                                  = t.id
  def extractMeta(t: RiskAssessment): Option[Meta]                                  = t.meta
  def extractText(t: RiskAssessment): Option[Narrative]                             = t.text
  def extractCode(t: RiskAssessment): Option[CodeableConcept]                       = t.code
  def extractNote(t: RiskAssessment): LitSeq[Annotation]                            = t.note
  def extractBasis(t: RiskAssessment): LitSeq[Reference]                            = t.basis
  def extractParent(t: RiskAssessment): Option[Reference]                           = t.parent
  def extractStatus(t: RiskAssessment): OBSERVATION_STATUS                          = t.status
  def extractMethod(t: RiskAssessment): Option[CodeableConcept]                     = t.method
  def extractBasedOn(t: RiskAssessment): Option[Reference]                          = t.basedOn
  def extractSubject(t: RiskAssessment): Reference                                  = t.subject
  def extractLanguage(t: RiskAssessment): Option[LANGUAGES]                         = t.language
  def extractContained(t: RiskAssessment): LitSeq[Resource]                         = t.contained
  def extractExtension(t: RiskAssessment): LitSeq[Extension]                        = t.extension
  def extractEncounter(t: RiskAssessment): Option[Reference]                        = t.encounter
  def extractCondition(t: RiskAssessment): Option[Reference]                        = t.condition
  def extractPerformer(t: RiskAssessment): Option[Reference]                        = t.performer
  def extractIdentifier(t: RiskAssessment): LitSeq[Identifier]                      = t.identifier
  def extractReasonCode(t: RiskAssessment): LitSeq[CodeableConcept]                 = t.reasonCode
  def extractMitigation(t: RiskAssessment): Option[String]                          = t.mitigation
  def extractImplicitRules(t: RiskAssessment): Option[UriStr]                       = t.implicitRules
  def extractOccurrence(t: RiskAssessment): Option[RiskAssessment.OccurrenceChoice] = t.occurrence
  def extractReasonReference(t: RiskAssessment): LitSeq[Reference]                  = t.reasonReference
  def extractModifierExtension(t: RiskAssessment): LitSeq[Extension]                = t.modifierExtension
  def extractPrediction(t: RiskAssessment): LitSeq[RiskAssessment.Prediction]       = t.prediction
  override val thisName: String                                                     = "RiskAssessment"
  override val searchParams: Map[String, RiskAssessment => Seq[Any]] = Map(
    "method"      -> (obj => obj.method.toSeq),
    "subject"     -> (obj => Seq(obj.subject)),
    "identifier"  -> (obj => obj.identifier.toSeq),
    "risk"        -> (obj => obj.prediction.flatMap(_.qualitativeRisk).toSeq),
    "condition"   -> (obj => obj.condition.toSeq),
    "date"        -> (obj => obj.occurrence.flatMap(_.as[FHIRDateTime]).toSeq),
    "encounter"   -> (obj => obj.encounter.toSeq),
    "performer"   -> (obj => obj.performer.toSeq),
    "probability" -> (obj => obj.prediction.flatMap(_.probability).toSeq),
    "patient"     -> (obj => obj.subject.seqIf(_.reference.exists(_.contains("Patient/"))).toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[RiskAssessment] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new RiskAssessment(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("code", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("basis", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("parent", Some(None)),
          cursor.decodeAs[OBSERVATION_STATUS]("status", None),
          cursor.decodeAs[Option[CodeableConcept]]("method", Some(None)),
          cursor.decodeAs[Option[Reference]]("basedOn", Some(None)),
          cursor.decodeAs[Reference]("subject", None),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          cursor.decodeAs[Option[Reference]]("condition", Some(None)),
          cursor.decodeAs[Option[Reference]]("performer", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("reasonCode", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("mitigation", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeOptRef[UnionDateTimeOrPeriod]("occurrence"),
          cursor.decodeAs[LitSeq[Reference]]("reasonReference", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[RiskAssessment.Prediction]]("prediction", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields code, note, basis, parent, status, method, basedOn, subject, encounter, condition, performer,
  *   identifier, reasonCode, mitigation, occurrence, reasonReference, prediction.
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
  * @param code
  *   - The type of the risk assessment performed.
  * @param note
  *   - Additional comments about the risk assessment.
  * @param basis
  *   - Indicates the source data considered as part of the assessment (for example, FamilyHistory, Observations, Procedures,
  *     Conditions, etc.).
  * @param parent
  *   - A reference to a resource that this risk assessment is part of, such as a Procedure.
  * @param status
  *   - The status of the RiskAssessment, using the same statuses as an Observation.
  * @param method
  *   - The algorithm, process or mechanism used to evaluate the risk.
  * @param basedOn
  *   - A reference to the request that is fulfilled by this risk assessment.
  * @param subject
  *   - The patient or group the risk assessment applies to.
  * @param language
  *   - The base language in which the resource is written.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *     identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *     of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *     Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *     of the extension.
  * @param encounter
  *   - The encounter where the assessment was performed.
  * @param condition
  *   - For assessments or prognosis specific to a particular condition, indicates the condition being assessed.
  * @param performer
  *   - The provider or software application that performed the assessment.
  * @param identifier
  *   - Business identifier assigned to the risk assessment.
  * @param reasonCode
  *   - The reason the risk assessment was performed.
  * @param mitigation
  *   - A description of the steps that might be taken to reduce the identified risk(s).
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *     processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *     other profiles etc.
  * @param occurrence
  *   - The date (and possibly time) the risk assessment was performed.
  * @param reasonReference
  *   - Resources supporting the reason the risk assessment was performed.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *     the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *     Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *     strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *     extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *     processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of
  *     any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param prediction
  *   - Describes the expected outcome for the subject.
  */
@POJOBoilerplate
class RiskAssessment(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val code: Option[CodeableConcept] = None,
    val note: LitSeq[Annotation] = LitSeq.empty,
    val basis: LitSeq[Reference] = LitSeq.empty,
    val parent: Option[Reference] = None,
    val status: OBSERVATION_STATUS,
    val method: Option[CodeableConcept] = None,
    val basedOn: Option[Reference] = None,
    val subject: Reference,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val encounter: Option[Reference] = None,
    val condition: Option[Reference] = None,
    val performer: Option[Reference] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
    val mitigation: Option[String] = None,
    override val implicitRules: Option[UriStr] = None,
    val occurrence: Option[RiskAssessment.OccurrenceChoice] = None,
    val reasonReference: LitSeq[Reference] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val prediction: LitSeq[RiskAssessment.Prediction] = LitSeq.empty,
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
      primitiveAttributes = primitiveAttributes
    ) {
  override val thisTypeName: String = "RiskAssessment"
}
