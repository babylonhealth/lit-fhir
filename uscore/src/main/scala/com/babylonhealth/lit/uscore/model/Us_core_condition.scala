package com.babylonhealth.lit.uscore.model

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
import com.babylonhealth.lit.usbase.model._
import com.babylonhealth.lit.core.UnionAliases._
import com.babylonhealth.lit.hl7.UnionAliases._
import com.babylonhealth.lit.usbase.UnionAliases._
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, usbase, uscore }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Us_core_condition extends CompanionFor[Us_core_condition] {
  implicit def summonObjectAndCompanionUs_core_condition_552134168(
      o: Us_core_condition): ObjectAndCompanion[Us_core_condition, Us_core_condition.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Condition
  override type ParentType   = Condition
  override val baseType: CompanionFor[ResourceType] = Condition
  override val parentType: CompanionFor[ParentType] = Condition
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/us/core/StructureDefinition/us-core-condition")
  type OnsetChoice     = Choice[Union01474038381]
  type AbatementChoice = Choice[Union01474038381]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(new Meta(profile = LitSeq("http://hl7.org/fhir/us/core/StructureDefinition/us-core-condition"))),
      text: Option[Narrative] = None,
      code: CodeableConcept,
      note: LitSeq[Annotation] = LitSeq.empty,
      subject: Reference,
      language: Option[LANGUAGES] = None,
      category: NonEmptyLitSeq[CodeableConcept],
      severity: Option[CodeableConcept] = None,
      bodySite: LitSeq[CodeableConcept] = LitSeq.empty,
      onset: Option[Us_core_condition.OnsetChoice] = None,
      recorder: Option[Reference] = None,
      asserter: Option[Reference] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      encounter: Option[Reference] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      abatement: Option[Us_core_condition.AbatementChoice] = None,
      recordedDate: Option[FHIRDateTime] = None,
      implicitRules: Option[UriStr] = None,
      clinicalStatus: Option[CodeableConcept] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      verificationStatus: Option[CodeableConcept] = None,
      stage: LitSeq[Condition.Stage] = LitSeq.empty,
      evidence: LitSeq[Condition.Evidence] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Us_core_condition = new Us_core_condition(
    id,
    meta,
    text,
    code,
    note,
    subject,
    language,
    category,
    severity,
    bodySite,
    onset,
    recorder,
    asserter,
    contained,
    extension,
    encounter,
    identifier,
    abatement,
    recordedDate,
    implicitRules,
    clinicalStatus,
    modifierExtension,
    verificationStatus,
    stage,
    evidence,
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
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val subject: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("subject", lTagOf[Reference], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val category: FHIRComponentFieldMeta[NonEmptyLitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("category", lTagOf[NonEmptyLitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val severity: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("severity", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val bodySite: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("bodySite", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val onset: FHIRComponentFieldMeta[Option[Us_core_condition.OnsetChoice]] =
    FHIRComponentFieldMeta("onset", lTagOf[Option[Us_core_condition.OnsetChoice]], true, lTagOf[Union01474038381])
  val recorder: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("recorder", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val asserter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("asserter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val encounter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("encounter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val abatement: FHIRComponentFieldMeta[Option[Us_core_condition.AbatementChoice]] =
    FHIRComponentFieldMeta("abatement", lTagOf[Option[Us_core_condition.AbatementChoice]], true, lTagOf[Union01474038381])
  val recordedDate: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("recordedDate", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val clinicalStatus: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("clinicalStatus", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val verificationStatus: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("verificationStatus", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val stage: FHIRComponentFieldMeta[LitSeq[Condition.Stage]] =
    FHIRComponentFieldMeta("stage", lTagOf[LitSeq[Condition.Stage]], false, lTagOf[Condition.Stage])
  val evidence: FHIRComponentFieldMeta[LitSeq[Condition.Evidence]] =
    FHIRComponentFieldMeta("evidence", lTagOf[LitSeq[Condition.Evidence]], false, lTagOf[Condition.Evidence])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    code,
    note,
    subject,
    language,
    category,
    severity,
    bodySite,
    onset,
    recorder,
    asserter,
    contained,
    extension,
    encounter,
    identifier,
    abatement,
    recordedDate,
    implicitRules,
    clinicalStatus,
    modifierExtension,
    verificationStatus,
    stage,
    evidence
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Meta]](meta, t.meta),
      FHIRComponentField[Option[Narrative]](text, t.text),
      FHIRComponentField[CodeableConcept](code, t.code.get),
      FHIRComponentField[LitSeq[Annotation]](note, t.note),
      FHIRComponentField[Reference](subject, t.subject),
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[NonEmptyLitSeq[CodeableConcept]](category, t.category.asNonEmpty),
      FHIRComponentField[Option[CodeableConcept]](severity, t.severity),
      FHIRComponentField[LitSeq[CodeableConcept]](bodySite, t.bodySite),
      FHIRComponentField[Option[Us_core_condition.OnsetChoice]](onset, t.onset),
      FHIRComponentField[Option[Reference]](recorder, t.recorder),
      FHIRComponentField[Option[Reference]](asserter, t.asserter),
      FHIRComponentField[LitSeq[Resource]](contained, t.contained),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Reference]](encounter, t.encounter),
      FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
      FHIRComponentField[Option[Us_core_condition.AbatementChoice]](abatement, t.abatement),
      FHIRComponentField[Option[FHIRDateTime]](recordedDate, t.recordedDate),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[Option[CodeableConcept]](clinicalStatus, t.clinicalStatus),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[CodeableConcept]](verificationStatus, t.verificationStatus),
      FHIRComponentField[LitSeq[Condition.Stage]](stage, t.stage),
      FHIRComponentField[LitSeq[Condition.Evidence]](evidence, t.evidence)
    ))
  override def fields(t: Us_core_condition): Seq[FHIRComponentField[_]]                 = fieldsFromParent(t).get
  def extractId(t: Us_core_condition): Option[String]                                   = t.id
  def extractMeta(t: Us_core_condition): Option[Meta]                                   = t.meta
  def extractText(t: Us_core_condition): Option[Narrative]                              = t.text
  def extractCode(t: Us_core_condition): CodeableConcept                                = t.code.get
  def extractNote(t: Us_core_condition): LitSeq[Annotation]                             = t.note
  def extractSubject(t: Us_core_condition): Reference                                   = t.subject
  def extractLanguage(t: Us_core_condition): Option[LANGUAGES]                          = t.language
  def extractCategory(t: Us_core_condition): NonEmptyLitSeq[CodeableConcept]            = t.category.asNonEmpty
  def extractSeverity(t: Us_core_condition): Option[CodeableConcept]                    = t.severity
  def extractBodySite(t: Us_core_condition): LitSeq[CodeableConcept]                    = t.bodySite
  def extractOnset(t: Us_core_condition): Option[Us_core_condition.OnsetChoice]         = t.onset
  def extractRecorder(t: Us_core_condition): Option[Reference]                          = t.recorder
  def extractAsserter(t: Us_core_condition): Option[Reference]                          = t.asserter
  def extractContained(t: Us_core_condition): LitSeq[Resource]                          = t.contained
  def extractExtension(t: Us_core_condition): LitSeq[Extension]                         = t.extension
  def extractEncounter(t: Us_core_condition): Option[Reference]                         = t.encounter
  def extractIdentifier(t: Us_core_condition): LitSeq[Identifier]                       = t.identifier
  def extractAbatement(t: Us_core_condition): Option[Us_core_condition.AbatementChoice] = t.abatement
  def extractRecordedDate(t: Us_core_condition): Option[FHIRDateTime]                   = t.recordedDate
  def extractImplicitRules(t: Us_core_condition): Option[UriStr]                        = t.implicitRules
  def extractClinicalStatus(t: Us_core_condition): Option[CodeableConcept]              = t.clinicalStatus
  def extractModifierExtension(t: Us_core_condition): LitSeq[Extension]                 = t.modifierExtension
  def extractVerificationStatus(t: Us_core_condition): Option[CodeableConcept]          = t.verificationStatus
  def extractStage(t: Us_core_condition): LitSeq[Condition.Stage]                       = t.stage
  def extractEvidence(t: Us_core_condition): LitSeq[Condition.Evidence]                 = t.evidence
  override val thisName: String                                                         = "Us_core_condition"
  override val searchParams: Map[String, Us_core_condition => Seq[Any]]                 = Condition.searchParams
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Us_core_condition] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Us_core_condition(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[CodeableConcept]("code", None),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[Reference]("subject", None),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[NonEmptyLitSeq[CodeableConcept]]("category", None),
          cursor.decodeAs[Option[CodeableConcept]]("severity", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("bodySite", Some(LitSeq.empty)),
          cursor.decodeOptRef[Union01474038381]("onset"),
          cursor.decodeAs[Option[Reference]]("recorder", Some(None)),
          cursor.decodeAs[Option[Reference]]("asserter", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeOptRef[Union01474038381]("abatement"),
          cursor.decodeAs[Option[FHIRDateTime]]("recordedDate", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("clinicalStatus", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("verificationStatus", Some(None)),
          cursor.decodeAs[LitSeq[Condition.Stage]]("stage", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Condition.Evidence]]("evidence", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Defines constraints and extensions on the Condition resource for the minimal set of data to query and retrieve problems and
  * health concerns information.
  *
  * Subclass of [[hl7.model.Condition]] (A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical
  * concept that has risen to a level of concern.)
  *
  * @constructor
  *   Inherits all params from parent. Requires the following fields which were optional in the parent: code, category.
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
  *   - Identification of the condition, problem or diagnosis.
  * @param note
  *   - Additional information about the Condition. This is a general notes/comments entry for description of the Condition, its
  *     diagnosis and prognosis.
  * @param subject
  *   - Indicates the patient or group who the condition record is associated with.
  * @param language
  *   - The base language in which the resource is written.
  * @param category
  *   - A category assigned to the condition.
  * @param severity
  *   - A subjective assessment of the severity of the condition as evaluated by the clinician.
  * @param bodySite
  *   - The anatomical location where this condition manifests itself.
  * @param onset
  *   - Estimated or actual date or date-time the condition began, in the opinion of the clinician.
  * @param recorder
  *   - Individual who recorded the record and takes responsibility for its content.
  * @param asserter
  *   - Individual who is making the condition statement.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *     identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *     of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *     Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *     of the extension.
  * @param encounter
  *   - The Encounter during which this Condition was created or to which the creation of this record is tightly associated.
  * @param identifier
  *   - Business identifiers assigned to this condition by the performer or other systems which remain constant as the resource is
  *     updated and propagates from server to server.
  * @param abatement
  *   - The date or estimated date that the condition resolved or went into remission. This is called "abatement" because of the
  *     many overloaded connotations associated with "remission" or "resolution" - Conditions are never really resolved, but they
  *     can abate.
  * @param recordedDate
  *   - The recordedDate represents when this particular Condition record was created in the system, which is often a
  *     system-generated date.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *     processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *     other profiles etc.
  * @param clinicalStatus
  *   - The clinical status of the condition.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *     the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *     Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *     strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *     extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *     processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of
  *     any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param verificationStatus
  *   - The verification status to support the clinical status of the condition.
  * @param stage
  *   - Clinical stage or grade of a condition. May include formal severity assessments.
  * @param evidence
  *   - Supporting evidence / manifestations that are the basis of the Condition's verification status, such as evidence that
  *     confirmed or refuted the condition.
  */
@POJOBoilerplate
class Us_core_condition(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("http://hl7.org/fhir/us/core/StructureDefinition/us-core-condition"))),
    override val text: Option[Narrative] = None,
    code: CodeableConcept,
    override val note: LitSeq[Annotation] = LitSeq.empty,
    override val subject: Reference,
    override val language: Option[LANGUAGES] = None,
    category: NonEmptyLitSeq[CodeableConcept],
    override val severity: Option[CodeableConcept] = None,
    override val bodySite: LitSeq[CodeableConcept] = LitSeq.empty,
    override val onset: Option[Us_core_condition.OnsetChoice] = None,
    override val recorder: Option[Reference] = None,
    override val asserter: Option[Reference] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val encounter: Option[Reference] = None,
    override val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val abatement: Option[Us_core_condition.AbatementChoice] = None,
    override val recordedDate: Option[FHIRDateTime] = None,
    override val implicitRules: Option[UriStr] = None,
    override val clinicalStatus: Option[CodeableConcept] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val verificationStatus: Option[CodeableConcept] = None,
    override val stage: LitSeq[Condition.Stage] = LitSeq.empty,
    override val evidence: LitSeq[Condition.Evidence] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Condition(
      id = id,
      meta = meta,
      text = text,
      code = Some(code),
      note = note,
      subject = subject,
      language = language,
      category = category.refine,
      severity = severity,
      bodySite = bodySite,
      onset = onset,
      recorder = recorder,
      asserter = asserter,
      contained = contained,
      extension = extension,
      encounter = encounter,
      identifier = identifier,
      abatement = abatement,
      recordedDate = recordedDate,
      implicitRules = implicitRules,
      clinicalStatus = clinicalStatus,
      modifierExtension = modifierExtension,
      verificationStatus = verificationStatus,
      stage = stage,
      evidence = evidence,
      primitiveAttributes = primitiveAttributes
    ) {
  override val thisTypeName: String = "Condition"
}
