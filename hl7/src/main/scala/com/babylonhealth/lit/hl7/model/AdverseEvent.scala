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
import com.babylonhealth.lit.hl7.ADVERSE_EVENT_ACTUALITY
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object AdverseEvent extends CompanionFor[AdverseEvent] {
  implicit def summonObjectAndCompanionAdverseEvent_1749665987(
      o: AdverseEvent): ObjectAndCompanion[AdverseEvent, AdverseEvent.type] = ObjectAndCompanion(o, this)
  override type ResourceType = AdverseEvent
  override type ParentType   = AdverseEvent
  override val baseType: CompanionFor[ResourceType] = AdverseEvent
  override val parentType: CompanionFor[ParentType] = AdverseEvent
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/AdverseEvent")
  object SuspectEntity extends CompanionFor[SuspectEntity] {
    implicit def summonObjectAndCompanionSuspectEntity_659249712(
        o: SuspectEntity): ObjectAndCompanion[SuspectEntity, SuspectEntity.type] = ObjectAndCompanion(o, this)
    override type ResourceType = SuspectEntity
    override type ParentType   = SuspectEntity
    override val parentType: CompanionFor[ResourceType] = SuspectEntity
    object Causality extends CompanionFor[Causality] {
      implicit def summonObjectAndCompanionCausality1648420380(o: Causality): ObjectAndCompanion[Causality, Causality.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Causality
      override type ParentType   = Causality
      override val parentType: CompanionFor[ResourceType] = Causality
      def apply(
          id: Option[String] = None,
          author: Option[Reference] = None,
          method: Option[CodeableConcept] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          assessment: Option[CodeableConcept] = None,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          productRelatedness: Option[String] = None,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Causality = new Causality(
        id,
        author,
        method,
        extension,
        assessment,
        modifierExtension,
        productRelatedness,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Causality): Option[(Option[String], Option[Reference], Option[CodeableConcept], LitSeq[Extension], Option[CodeableConcept], LitSeq[Extension], Option[String])] =
        Some((o.id, o.author, o.method, o.extension, o.assessment, o.modifierExtension, o.productRelatedness))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val author: FHIRComponentFieldMeta[Option[Reference]] =
        FHIRComponentFieldMeta("author", lTagOf[Option[Reference]], false, lTagOf[Reference])
      val method: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("method", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val assessment: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("assessment", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val productRelatedness: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("productRelatedness", lTagOf[Option[String]], false, lTagOf[String])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
        Seq(id, author, method, extension, assessment, modifierExtension, productRelatedness)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Causality): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[Reference]](author, t.author),
        FHIRComponentField[Option[CodeableConcept]](method, t.method),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[CodeableConcept]](assessment, t.assessment),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
        FHIRComponentField[Option[String]](productRelatedness, t.productRelatedness)
      )
      val baseType: CompanionFor[Causality] = this
      val thisName: String                  = "Causality"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Causality] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Causality(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[Reference]]("author", Some(None)),
              cursor.decodeAs[Option[CodeableConcept]]("method", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[CodeableConcept]]("assessment", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[String]]("productRelatedness", Some(None)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Causality(
        override val id: Option[String] = None,
        val author: Option[Reference] = None,
        val method: Option[CodeableConcept] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val assessment: Option[CodeableConcept] = None,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        val productRelatedness: Option[String] = None,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        instance: Reference,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        causality: LitSeq[SuspectEntity.Causality] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): SuspectEntity = new SuspectEntity(
      id,
      instance,
      extension,
      modifierExtension,
      causality,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: SuspectEntity): Option[(Option[String], Reference, LitSeq[Extension], LitSeq[Extension], LitSeq[SuspectEntity.Causality])] =
      Some((o.id, o.instance, o.extension, o.modifierExtension, o.causality))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val instance: FHIRComponentFieldMeta[Reference] =
      FHIRComponentFieldMeta("instance", lTagOf[Reference], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val causality: FHIRComponentFieldMeta[LitSeq[SuspectEntity.Causality]] =
      FHIRComponentFieldMeta("causality", lTagOf[LitSeq[SuspectEntity.Causality]], false, lTagOf[SuspectEntity.Causality])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, instance, extension, modifierExtension, causality)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: SuspectEntity): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Reference](instance, t.instance),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[SuspectEntity.Causality]](causality, t.causality)
    )
    val baseType: CompanionFor[SuspectEntity] = this
    val thisName: String                      = "SuspectEntity"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[SuspectEntity] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new SuspectEntity(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Reference]("instance", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[SuspectEntity.Causality]]("causality", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class SuspectEntity(
      override val id: Option[String] = None,
      val instance: Reference,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val causality: LitSeq[SuspectEntity.Causality] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      date: Option[FHIRDateTime] = None,
      event: Option[CodeableConcept] = None,
      study: LitSeq[Reference] = LitSeq.empty,
      subject: Reference,
      outcome: Option[CodeableConcept] = None,
      language: Option[LANGUAGES] = None,
      category: LitSeq[CodeableConcept] = LitSeq.empty,
      detected: Option[FHIRDateTime] = None,
      location: Option[Reference] = None,
      severity: Option[CodeableConcept] = None,
      recorder: Option[Reference] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      actuality: ADVERSE_EVENT_ACTUALITY,
      encounter: Option[Reference] = None,
      identifier: Option[Identifier] = None,
      seriousness: Option[CodeableConcept] = None,
      contributor: LitSeq[Reference] = LitSeq.empty,
      recordedDate: Option[FHIRDateTime] = None,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      referenceDocument: LitSeq[Reference] = LitSeq.empty,
      resultingCondition: LitSeq[Reference] = LitSeq.empty,
      subjectMedicalHistory: LitSeq[Reference] = LitSeq.empty,
      suspectEntity: LitSeq[AdverseEvent.SuspectEntity] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): AdverseEvent = new AdverseEvent(
    id,
    meta,
    text,
    date,
    event,
    study,
    subject,
    outcome,
    language,
    category,
    detected,
    location,
    severity,
    recorder,
    contained,
    extension,
    actuality,
    encounter,
    identifier,
    seriousness,
    contributor,
    recordedDate,
    implicitRules,
    modifierExtension,
    referenceDocument,
    resultingCondition,
    subjectMedicalHistory,
    suspectEntity,
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
  val event: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("event", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val study: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("study", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val subject: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("subject", lTagOf[Reference], false, lTagOf[Reference])
  val outcome: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("outcome", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val category: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("category", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val detected: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("detected", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val location: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("location", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val severity: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("severity", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val recorder: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("recorder", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val actuality: FHIRComponentFieldMeta[ADVERSE_EVENT_ACTUALITY] =
    FHIRComponentFieldMeta("actuality", lTagOf[ADVERSE_EVENT_ACTUALITY], false, lTagOf[ADVERSE_EVENT_ACTUALITY])
  val encounter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("encounter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[Option[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
  val seriousness: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("seriousness", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val contributor: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("contributor", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val recordedDate: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("recordedDate", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val referenceDocument: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("referenceDocument", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val resultingCondition: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("resultingCondition", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val subjectMedicalHistory: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("subjectMedicalHistory", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val suspectEntity: FHIRComponentFieldMeta[LitSeq[AdverseEvent.SuspectEntity]] =
    FHIRComponentFieldMeta("suspectEntity", lTagOf[LitSeq[AdverseEvent.SuspectEntity]], false, lTagOf[AdverseEvent.SuspectEntity])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    date,
    event,
    study,
    subject,
    outcome,
    language,
    category,
    detected,
    location,
    severity,
    recorder,
    contained,
    extension,
    actuality,
    encounter,
    identifier,
    seriousness,
    contributor,
    recordedDate,
    implicitRules,
    modifierExtension,
    referenceDocument,
    resultingCondition,
    subjectMedicalHistory,
    suspectEntity
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: AdverseEvent): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[FHIRDateTime]](date, t.date),
    FHIRComponentField[Option[CodeableConcept]](event, t.event),
    FHIRComponentField[LitSeq[Reference]](study, t.study),
    FHIRComponentField[Reference](subject, t.subject),
    FHIRComponentField[Option[CodeableConcept]](outcome, t.outcome),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[CodeableConcept]](category, t.category),
    FHIRComponentField[Option[FHIRDateTime]](detected, t.detected),
    FHIRComponentField[Option[Reference]](location, t.location),
    FHIRComponentField[Option[CodeableConcept]](severity, t.severity),
    FHIRComponentField[Option[Reference]](recorder, t.recorder),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[ADVERSE_EVENT_ACTUALITY](actuality, t.actuality),
    FHIRComponentField[Option[Reference]](encounter, t.encounter),
    FHIRComponentField[Option[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[CodeableConcept]](seriousness, t.seriousness),
    FHIRComponentField[LitSeq[Reference]](contributor, t.contributor),
    FHIRComponentField[Option[FHIRDateTime]](recordedDate, t.recordedDate),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[Reference]](referenceDocument, t.referenceDocument),
    FHIRComponentField[LitSeq[Reference]](resultingCondition, t.resultingCondition),
    FHIRComponentField[LitSeq[Reference]](subjectMedicalHistory, t.subjectMedicalHistory),
    FHIRComponentField[LitSeq[AdverseEvent.SuspectEntity]](suspectEntity, t.suspectEntity)
  )
  def extractId(t: AdverseEvent): Option[String]                                = t.id
  def extractMeta(t: AdverseEvent): Option[Meta]                                = t.meta
  def extractText(t: AdverseEvent): Option[Narrative]                           = t.text
  def extractDate(t: AdverseEvent): Option[FHIRDateTime]                        = t.date
  def extractEvent(t: AdverseEvent): Option[CodeableConcept]                    = t.event
  def extractStudy(t: AdverseEvent): LitSeq[Reference]                          = t.study
  def extractSubject(t: AdverseEvent): Reference                                = t.subject
  def extractOutcome(t: AdverseEvent): Option[CodeableConcept]                  = t.outcome
  def extractLanguage(t: AdverseEvent): Option[LANGUAGES]                       = t.language
  def extractCategory(t: AdverseEvent): LitSeq[CodeableConcept]                 = t.category
  def extractDetected(t: AdverseEvent): Option[FHIRDateTime]                    = t.detected
  def extractLocation(t: AdverseEvent): Option[Reference]                       = t.location
  def extractSeverity(t: AdverseEvent): Option[CodeableConcept]                 = t.severity
  def extractRecorder(t: AdverseEvent): Option[Reference]                       = t.recorder
  def extractContained(t: AdverseEvent): LitSeq[Resource]                       = t.contained
  def extractExtension(t: AdverseEvent): LitSeq[Extension]                      = t.extension
  def extractActuality(t: AdverseEvent): ADVERSE_EVENT_ACTUALITY                = t.actuality
  def extractEncounter(t: AdverseEvent): Option[Reference]                      = t.encounter
  def extractIdentifier(t: AdverseEvent): Option[Identifier]                    = t.identifier
  def extractSeriousness(t: AdverseEvent): Option[CodeableConcept]              = t.seriousness
  def extractContributor(t: AdverseEvent): LitSeq[Reference]                    = t.contributor
  def extractRecordedDate(t: AdverseEvent): Option[FHIRDateTime]                = t.recordedDate
  def extractImplicitRules(t: AdverseEvent): Option[UriStr]                     = t.implicitRules
  def extractModifierExtension(t: AdverseEvent): LitSeq[Extension]              = t.modifierExtension
  def extractReferenceDocument(t: AdverseEvent): LitSeq[Reference]              = t.referenceDocument
  def extractResultingCondition(t: AdverseEvent): LitSeq[Reference]             = t.resultingCondition
  def extractSubjectMedicalHistory(t: AdverseEvent): LitSeq[Reference]          = t.subjectMedicalHistory
  def extractSuspectEntity(t: AdverseEvent): LitSeq[AdverseEvent.SuspectEntity] = t.suspectEntity
  override val thisName: String                                                 = "AdverseEvent"
  override val searchParams: Map[String, AdverseEvent => Seq[Any]] = Map(
    "substance"          -> (obj => obj.suspectEntity.map(_.instance).toSeq),
    "location"           -> (obj => obj.location.toSeq),
    "subject"            -> (obj => Seq(obj.subject)),
    "event"              -> (obj => obj.event.toSeq),
    "date"               -> (obj => obj.date.toSeq),
    "actuality"          -> (obj => Seq(obj.actuality)),
    "study"              -> (obj => obj.study.toSeq),
    "recorder"           -> (obj => obj.recorder.toSeq),
    "category"           -> (obj => obj.category.toSeq),
    "seriousness"        -> (obj => obj.seriousness.toSeq),
    "resultingcondition" -> (obj => obj.resultingCondition.toSeq),
    "severity"           -> (obj => obj.severity.toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[AdverseEvent] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new AdverseEvent(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("date", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("event", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("study", Some(LitSeq.empty)),
          cursor.decodeAs[Reference]("subject", None),
          cursor.decodeAs[Option[CodeableConcept]]("outcome", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("category", Some(LitSeq.empty)),
          cursor.decodeAs[Option[FHIRDateTime]]("detected", Some(None)),
          cursor.decodeAs[Option[Reference]]("location", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("severity", Some(None)),
          cursor.decodeAs[Option[Reference]]("recorder", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[ADVERSE_EVENT_ACTUALITY]("actuality", None),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          cursor.decodeAs[Option[Identifier]]("identifier", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("seriousness", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("contributor", Some(LitSeq.empty)),
          cursor.decodeAs[Option[FHIRDateTime]]("recordedDate", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("referenceDocument", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("resultingCondition", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("subjectMedicalHistory", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[AdverseEvent.SuspectEntity]]("suspectEntity", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Actual or potential/avoided event causing unintended physical injury resulting from or contributed to by medical care, a
  * research study or other healthcare setting factors that requires additional monitoring, treatment, or hospitalization, or that
  * results in death.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields date, event, study, subject, outcome, category, detected, location, severity, recorder, actuality,
  *   encounter, identifier, seriousness, contributor, recordedDate, referenceDocument, resultingCondition, subjectMedicalHistory,
  *   suspectEntity.
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
  *   - The date (and perhaps time) when the adverse event occurred.
  * @param event
  *   - This element defines the specific type of event that occurred or that was prevented from occurring.
  * @param study
  *   - AdverseEvent.study.
  * @param subject
  *   - This subject or group impacted by the event.
  * @param outcome
  *   - Describes the type of outcome from the adverse event.
  * @param language
  *   - The base language in which the resource is written.
  * @param category
  *   - The overall type of event, intended for search and filtering purposes.
  * @param detected
  *   - Estimated or actual date the AdverseEvent began, in the opinion of the reporter.
  * @param location
  *   - The information about where the adverse event occurred.
  * @param severity
  *   - Describes the severity of the adverse event, in relation to the subject. Contrast to AdverseEvent.seriousness - a severe
  *   rash might not be serious, but a mild heart problem is.
  * @param recorder
  *   - Information on who recorded the adverse event. May be the patient or a practitioner.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param actuality
  *   - Whether the event actually happened, or just had the potential to. Note that this is independent of whether anyone was
  *   affected or harmed or how severely.
  * @param encounter
  *   - The Encounter during which AdverseEvent was created or to which the creation of this record is tightly associated.
  * @param identifier
  *   - Business identifiers assigned to this adverse event by the performer or other systems which remain constant as the
  *   resource is updated and propagates from server to server.
  * @param seriousness
  *   - Assessment whether this event was of real importance.
  * @param contributor
  *   - Parties that may or should contribute or have contributed information to the adverse event, which can consist of one or
  *   more activities. Such information includes information leading to the decision to perform the activity and how to perform
  *   the activity (e.g. consultant), information that the activity itself seeks to reveal (e.g. informant of clinical history),
  *   or information about what activity was performed (e.g. informant witness).
  * @param recordedDate
  *   - The date on which the existence of the AdverseEvent was first recorded.
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
  * @param referenceDocument
  *   - AdverseEvent.referenceDocument.
  * @param resultingCondition
  *   - Includes information about the reaction that occurred as a result of exposure to a substance (for example, a drug or a
  *   chemical).
  * @param subjectMedicalHistory
  *   - AdverseEvent.subjectMedicalHistory.
  * @param suspectEntity
  *   - Describes the entity that is suspected to have caused the adverse event.
  */
@POJOBoilerplate
class AdverseEvent(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val date: Option[FHIRDateTime] = None,
    val event: Option[CodeableConcept] = None,
    val study: LitSeq[Reference] = LitSeq.empty,
    val subject: Reference,
    val outcome: Option[CodeableConcept] = None,
    override val language: Option[LANGUAGES] = None,
    val category: LitSeq[CodeableConcept] = LitSeq.empty,
    val detected: Option[FHIRDateTime] = None,
    val location: Option[Reference] = None,
    val severity: Option[CodeableConcept] = None,
    val recorder: Option[Reference] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val actuality: ADVERSE_EVENT_ACTUALITY,
    val encounter: Option[Reference] = None,
    val identifier: Option[Identifier] = None,
    val seriousness: Option[CodeableConcept] = None,
    val contributor: LitSeq[Reference] = LitSeq.empty,
    val recordedDate: Option[FHIRDateTime] = None,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val referenceDocument: LitSeq[Reference] = LitSeq.empty,
    val resultingCondition: LitSeq[Reference] = LitSeq.empty,
    val subjectMedicalHistory: LitSeq[Reference] = LitSeq.empty,
    val suspectEntity: LitSeq[AdverseEvent.SuspectEntity] = LitSeq.empty,
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
  override val thisTypeName: String = "AdverseEvent"
}
