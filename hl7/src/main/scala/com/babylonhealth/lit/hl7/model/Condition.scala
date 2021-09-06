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

object Condition extends CompanionFor[Condition] {
  implicit def summonObjectAndCompanionCondition1099501766(o: Condition): ObjectAndCompanion[Condition, Condition.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Condition
  override type ParentType   = Condition
  override val baseType: CompanionFor[ResourceType] = Condition
  override val parentType: CompanionFor[ParentType] = Condition
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Condition")
  object Evidence extends CompanionFor[Evidence] {
    implicit def summonObjectAndCompanionEvidence_2009654794(o: Evidence): ObjectAndCompanion[Evidence, Evidence.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Evidence
    override type ParentType   = Evidence
    override val parentType: CompanionFor[ResourceType] = Evidence
    def apply(
        id: Option[String] = None,
        code: LitSeq[CodeableConcept] = LitSeq.empty,
        detail: LitSeq[Reference] = LitSeq.empty,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Evidence = new Evidence(
      id,
      code,
      detail,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Evidence): Option[(Option[String], LitSeq[CodeableConcept], LitSeq[Reference], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.code, o.detail, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val code: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("code", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val detail: FHIRComponentFieldMeta[LitSeq[Reference]] =
      FHIRComponentFieldMeta("detail", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, code, detail, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Evidence): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[CodeableConcept]](code, t.code),
      FHIRComponentField[LitSeq[Reference]](detail, t.detail),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Evidence] = this
    val thisName: String                 = "Evidence"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Evidence] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Evidence(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("code", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Reference]]("detail", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Evidence(
      override val id: Option[String] = None,
      val code: LitSeq[CodeableConcept] = LitSeq.empty,
      val detail: LitSeq[Reference] = LitSeq.empty,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Stage extends CompanionFor[Stage] {
    implicit def summonObjectAndCompanionStage_2009654794(o: Stage): ObjectAndCompanion[Stage, Stage.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Stage
    override type ParentType   = Stage
    override val parentType: CompanionFor[ResourceType] = Stage
    def apply(
        id: Option[String] = None,
        `type`: Option[CodeableConcept] = None,
        summary: Option[CodeableConcept] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        assessment: LitSeq[Reference] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Stage = new Stage(
      id,
      `type`,
      summary,
      extension,
      assessment,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Stage): Option[(Option[String], Option[CodeableConcept], Option[CodeableConcept], LitSeq[Extension], LitSeq[Reference], LitSeq[Extension])] =
      Some((o.id, o.`type`, o.summary, o.extension, o.assessment, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val summary: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("summary", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val assessment: FHIRComponentFieldMeta[LitSeq[Reference]] =
      FHIRComponentFieldMeta("assessment", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, `type`, summary, extension, assessment, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Stage): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[Option[CodeableConcept]](summary, t.summary),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Reference]](assessment, t.assessment),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Stage] = this
    val thisName: String              = "Stage"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Stage] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Stage(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("summary", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Reference]]("assessment", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Stage(
      override val id: Option[String] = None,
      val `type`: Option[CodeableConcept] = None,
      val summary: Option[CodeableConcept] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val assessment: LitSeq[Reference] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  type OnsetChoice     = Choice[Union01946981731]
  type AbatementChoice = Choice[Union01946981731]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      code: Option[CodeableConcept] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      subject: Reference,
      language: Option[LANGUAGES] = None,
      category: LitSeq[CodeableConcept] = LitSeq.empty,
      severity: Option[CodeableConcept] = None,
      bodySite: LitSeq[CodeableConcept] = LitSeq.empty,
      onset: Option[Condition.OnsetChoice] = None,
      recorder: Option[Reference] = None,
      asserter: Option[Reference] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      encounter: Option[Reference] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      abatement: Option[Condition.AbatementChoice] = None,
      recordedDate: Option[FHIRDateTime] = None,
      implicitRules: Option[UriStr] = None,
      clinicalStatus: Option[CodeableConcept] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      verificationStatus: Option[CodeableConcept] = None,
      stage: LitSeq[Condition.Stage] = LitSeq.empty,
      evidence: LitSeq[Condition.Evidence] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Condition = new Condition(
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
  val code: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("code", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val subject: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("subject", lTagOf[Reference], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val category: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("category", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val severity: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("severity", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val bodySite: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("bodySite", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val onset: FHIRComponentFieldMeta[Option[Condition.OnsetChoice]] =
    FHIRComponentFieldMeta("onset", lTagOf[Option[Condition.OnsetChoice]], true, lTagOf[Union01946981731])
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
  val abatement: FHIRComponentFieldMeta[Option[Condition.AbatementChoice]] =
    FHIRComponentFieldMeta("abatement", lTagOf[Option[Condition.AbatementChoice]], true, lTagOf[Union01946981731])
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
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Condition): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[CodeableConcept]](code, t.code),
    FHIRComponentField[LitSeq[Annotation]](note, t.note),
    FHIRComponentField[Reference](subject, t.subject),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[CodeableConcept]](category, t.category),
    FHIRComponentField[Option[CodeableConcept]](severity, t.severity),
    FHIRComponentField[LitSeq[CodeableConcept]](bodySite, t.bodySite),
    FHIRComponentField[Option[Condition.OnsetChoice]](onset, t.onset),
    FHIRComponentField[Option[Reference]](recorder, t.recorder),
    FHIRComponentField[Option[Reference]](asserter, t.asserter),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Reference]](encounter, t.encounter),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[Condition.AbatementChoice]](abatement, t.abatement),
    FHIRComponentField[Option[FHIRDateTime]](recordedDate, t.recordedDate),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[CodeableConcept]](clinicalStatus, t.clinicalStatus),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Option[CodeableConcept]](verificationStatus, t.verificationStatus),
    FHIRComponentField[LitSeq[Condition.Stage]](stage, t.stage),
    FHIRComponentField[LitSeq[Condition.Evidence]](evidence, t.evidence)
  )
  def extractId(t: Condition): Option[String]                           = t.id
  def extractMeta(t: Condition): Option[Meta]                           = t.meta
  def extractText(t: Condition): Option[Narrative]                      = t.text
  def extractCode(t: Condition): Option[CodeableConcept]                = t.code
  def extractNote(t: Condition): LitSeq[Annotation]                     = t.note
  def extractSubject(t: Condition): Reference                           = t.subject
  def extractLanguage(t: Condition): Option[LANGUAGES]                  = t.language
  def extractCategory(t: Condition): LitSeq[CodeableConcept]            = t.category
  def extractSeverity(t: Condition): Option[CodeableConcept]            = t.severity
  def extractBodySite(t: Condition): LitSeq[CodeableConcept]            = t.bodySite
  def extractOnset(t: Condition): Option[Condition.OnsetChoice]         = t.onset
  def extractRecorder(t: Condition): Option[Reference]                  = t.recorder
  def extractAsserter(t: Condition): Option[Reference]                  = t.asserter
  def extractContained(t: Condition): LitSeq[Resource]                  = t.contained
  def extractExtension(t: Condition): LitSeq[Extension]                 = t.extension
  def extractEncounter(t: Condition): Option[Reference]                 = t.encounter
  def extractIdentifier(t: Condition): LitSeq[Identifier]               = t.identifier
  def extractAbatement(t: Condition): Option[Condition.AbatementChoice] = t.abatement
  def extractRecordedDate(t: Condition): Option[FHIRDateTime]           = t.recordedDate
  def extractImplicitRules(t: Condition): Option[UriStr]                = t.implicitRules
  def extractClinicalStatus(t: Condition): Option[CodeableConcept]      = t.clinicalStatus
  def extractModifierExtension(t: Condition): LitSeq[Extension]         = t.modifierExtension
  def extractVerificationStatus(t: Condition): Option[CodeableConcept]  = t.verificationStatus
  def extractStage(t: Condition): LitSeq[Condition.Stage]               = t.stage
  def extractEvidence(t: Condition): LitSeq[Condition.Evidence]         = t.evidence
  override val thisName: String                                         = "Condition"
  override val searchParams: Map[String, Condition => Seq[Any]] = Map(
    "onset-age" -> (obj =>
      obj.onset.flatMap(_.as[Age]).toSeq ++
        obj.onset.flatMap(_.as[Range]).toSeq),
    "abatement-string"         -> (obj => obj.abatement.flatMap(_.as[String]).toSeq),
    "stage"                    -> (obj => obj.stage.flatMap(_.summary).toSeq),
    "Example Search Parameter" -> (obj => Seq(obj.subject)),
    "subject"                  -> (obj => Seq(obj.subject)),
    "clinical-status"          -> (obj => obj.clinicalStatus.toSeq),
    "body-site"                -> (obj => obj.bodySite.toSeq),
    "abatement-date" -> (obj =>
      obj.abatement.flatMap(_.as[FHIRDateTime]).toSeq ++
        obj.abatement.flatMap(_.as[Period]).toSeq),
    "onset-date" -> (obj =>
      obj.onset.flatMap(_.as[FHIRDateTime]).toSeq ++
        obj.onset.flatMap(_.as[Period]).toSeq),
    "recorded-date"       -> (obj => obj.recordedDate.toSeq),
    "evidence-detail"     -> (obj => obj.evidence.flatMap(_.detail).toSeq),
    "evidence"            -> (obj => obj.evidence.flatMap(_.code).toSeq),
    "category"            -> (obj => obj.category.toSeq),
    "encounter"           -> (obj => obj.encounter.toSeq),
    "asserter"            -> (obj => obj.asserter.toSeq),
    "patient"             -> (obj => obj.subject.seqIf(_.reference.exists(_.contains("Patient/"))).toSeq),
    "identifier"          -> (obj => obj.identifier.toSeq),
    "onset-info"          -> (obj => obj.onset.flatMap(_.as[String]).toSeq),
    "code"                -> (obj => obj.code.toSeq),
    "verification-status" -> (obj => obj.verificationStatus.toSeq),
    "abatement-age" -> (obj =>
      obj.abatement.flatMap(_.as[Age]).toSeq ++
        obj.abatement.flatMap(_.as[Range]).toSeq),
    "severity" -> (obj => obj.severity.toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Condition] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Condition(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("code", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[Reference]("subject", None),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("category", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("severity", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("bodySite", Some(LitSeq.empty)),
          cursor.decodeOptRef[Union01946981731]("onset"),
          cursor.decodeAs[Option[Reference]]("recorder", Some(None)),
          cursor.decodeAs[Option[Reference]]("asserter", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeOptRef[Union01946981731]("abatement"),
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

/** A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of
  * concern.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields code, note, subject, category, severity, bodySite, onset, recorder, asserter, encounter, identifier,
  *   abatement, recordedDate, clinicalStatus, verificationStatus, stage, evidence.
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
  *   - Identification of the condition, problem or diagnosis.
  * @param note
  *   - Additional information about the Condition. This is a general notes/comments entry for description of the Condition, its
  *   diagnosis and prognosis.
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
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param encounter
  *   - The Encounter during which this Condition was created or to which the creation of this record is tightly associated.
  * @param identifier
  *   - Business identifiers assigned to this condition by the performer or other systems which remain constant as the resource is
  *   updated and propagates from server to server.
  * @param abatement
  *   - The date or estimated date that the condition resolved or went into remission. This is called "abatement" because of the
  *   many overloaded connotations associated with "remission" or "resolution" - Conditions are never really resolved, but they
  *   can abate.
  * @param recordedDate
  *   - The recordedDate represents when this particular Condition record was created in the system, which is often a
  *   system-generated date.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param clinicalStatus
  *   - The clinical status of the condition.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *   the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually
  *   modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict
  *   set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param verificationStatus
  *   - The verification status to support the clinical status of the condition.
  * @param stage
  *   - Clinical stage or grade of a condition. May include formal severity assessments.
  * @param evidence
  *   - Supporting evidence / manifestations that are the basis of the Condition's verification status, such as evidence that
  *   confirmed or refuted the condition.
  */
@POJOBoilerplate
class Condition(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val code: Option[CodeableConcept] = None,
    val note: LitSeq[Annotation] = LitSeq.empty,
    val subject: Reference,
    override val language: Option[LANGUAGES] = None,
    val category: LitSeq[CodeableConcept] = LitSeq.empty,
    val severity: Option[CodeableConcept] = None,
    val bodySite: LitSeq[CodeableConcept] = LitSeq.empty,
    val onset: Option[Condition.OnsetChoice] = None,
    val recorder: Option[Reference] = None,
    val asserter: Option[Reference] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val encounter: Option[Reference] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val abatement: Option[Condition.AbatementChoice] = None,
    val recordedDate: Option[FHIRDateTime] = None,
    override val implicitRules: Option[UriStr] = None,
    val clinicalStatus: Option[CodeableConcept] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val verificationStatus: Option[CodeableConcept] = None,
    val stage: LitSeq[Condition.Stage] = LitSeq.empty,
    val evidence: LitSeq[Condition.Evidence] = LitSeq.empty,
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
  override val thisTypeName: String = "Condition"
}
