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
import com.babylonhealth.lit.hl7.PUBLICATION_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object ResearchSubject extends CompanionFor[ResearchSubject] {
  implicit def summonObjectAndCompanionResearchSubject_25481604(
      o: ResearchSubject): ObjectAndCompanion[ResearchSubject, ResearchSubject.type] = ObjectAndCompanion(o, this)
  override type ResourceType = ResearchSubject
  override type ParentType   = ResearchSubject
  override val baseType: CompanionFor[ResourceType] = ResearchSubject
  override val parentType: CompanionFor[ParentType] = ResearchSubject
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/ResearchSubject")
  object Progress extends CompanionFor[Progress] {
    implicit def summonObjectAndCompanionProgress_2016027166(o: Progress): ObjectAndCompanion[Progress, Progress.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Progress
    override type ParentType   = Progress
    override val parentType: CompanionFor[ResourceType] = Progress
    def apply(
        id: Option[String] = None,
        `type`: Option[CodeableConcept] = None,
        reason: Option[CodeableConcept] = None,
        endDate: Option[FHIRDateTime] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        milestone: Option[CodeableConcept] = None,
        startDate: Option[FHIRDateTime] = None,
        subjectState: Option[CodeableConcept] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Progress = new Progress(
      id,
      `type`,
      reason,
      endDate,
      extension,
      milestone,
      startDate,
      subjectState,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Progress): Option[(Option[String], Option[CodeableConcept], Option[CodeableConcept], Option[FHIRDateTime], LitSeq[Extension], Option[CodeableConcept], Option[FHIRDateTime], Option[CodeableConcept], LitSeq[Extension])] =
      Some((o.id, o.`type`, o.reason, o.endDate, o.extension, o.milestone, o.startDate, o.subjectState, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val reason: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("reason", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val endDate: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
      FHIRComponentFieldMeta("endDate", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val milestone: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("milestone", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val startDate: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
      FHIRComponentFieldMeta("startDate", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
    val subjectState: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("subjectState", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, `type`, reason, endDate, extension, milestone, startDate, subjectState, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Progress): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[Option[CodeableConcept]](reason, t.reason),
      FHIRComponentField[Option[FHIRDateTime]](endDate, t.endDate),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[CodeableConcept]](milestone, t.milestone),
      FHIRComponentField[Option[FHIRDateTime]](startDate, t.startDate),
      FHIRComponentField[Option[CodeableConcept]](subjectState, t.subjectState),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Progress] = this
    val thisName: String                 = "Progress"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Progress] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Progress(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("reason", Some(None)),
            cursor.decodeAs[Option[FHIRDateTime]]("endDate", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[CodeableConcept]]("milestone", Some(None)),
            cursor.decodeAs[Option[FHIRDateTime]]("startDate", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("subjectState", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Progress(
      override val id: Option[String] = None,
      val `type`: Option[CodeableConcept] = None,
      val reason: Option[CodeableConcept] = None,
      val endDate: Option[FHIRDateTime] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val milestone: Option[CodeableConcept] = None,
      val startDate: Option[FHIRDateTime] = None,
      val subjectState: Option[CodeableConcept] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      study: Reference,
      status: PUBLICATION_STATUS,
      period: Option[Period] = None,
      subject: Reference,
      consent: Option[Reference] = None,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      actualArm: Option[String] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      assignedArm: Option[String] = None,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      progress: LitSeq[ResearchSubject.Progress] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): ResearchSubject = new ResearchSubject(
    id,
    meta,
    text,
    study,
    status,
    period,
    subject,
    consent,
    language,
    contained,
    extension,
    actualArm,
    identifier,
    assignedArm,
    implicitRules,
    modifierExtension,
    progress,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val study: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("study", lTagOf[Reference], false, lTagOf[Reference])
  val status: FHIRComponentFieldMeta[PUBLICATION_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[PUBLICATION_STATUS], false, lTagOf[PUBLICATION_STATUS])
  val period: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("period", lTagOf[Option[Period]], false, lTagOf[Period])
  val subject: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("subject", lTagOf[Reference], false, lTagOf[Reference])
  val consent: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("consent", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val actualArm: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("actualArm", lTagOf[Option[String]], false, lTagOf[String])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val assignedArm: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("assignedArm", lTagOf[Option[String]], false, lTagOf[String])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val progress: FHIRComponentFieldMeta[LitSeq[ResearchSubject.Progress]] =
    FHIRComponentFieldMeta("progress", lTagOf[LitSeq[ResearchSubject.Progress]], false, lTagOf[ResearchSubject.Progress])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    study,
    status,
    period,
    subject,
    consent,
    language,
    contained,
    extension,
    actualArm,
    identifier,
    assignedArm,
    implicitRules,
    modifierExtension,
    progress
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: ResearchSubject): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Reference](study, t.study),
    FHIRComponentField[PUBLICATION_STATUS](status, t.status),
    FHIRComponentField[Option[Period]](period, t.period),
    FHIRComponentField[Reference](subject, t.subject),
    FHIRComponentField[Option[Reference]](consent, t.consent),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[String]](actualArm, t.actualArm),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[String]](assignedArm, t.assignedArm),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[ResearchSubject.Progress]](progress, t.progress)
  )
  def extractId(t: ResearchSubject): Option[String]                         = t.id
  def extractMeta(t: ResearchSubject): Option[Meta]                         = t.meta
  def extractText(t: ResearchSubject): Option[Narrative]                    = t.text
  def extractStudy(t: ResearchSubject): Reference                           = t.study
  def extractStatus(t: ResearchSubject): PUBLICATION_STATUS                 = t.status
  def extractPeriod(t: ResearchSubject): Option[Period]                     = t.period
  def extractSubject(t: ResearchSubject): Reference                         = t.subject
  def extractConsent(t: ResearchSubject): Option[Reference]                 = t.consent
  def extractLanguage(t: ResearchSubject): Option[LANGUAGES]                = t.language
  def extractContained(t: ResearchSubject): LitSeq[Resource]                = t.contained
  def extractExtension(t: ResearchSubject): LitSeq[Extension]               = t.extension
  def extractActualArm(t: ResearchSubject): Option[String]                  = t.actualArm
  def extractIdentifier(t: ResearchSubject): LitSeq[Identifier]             = t.identifier
  def extractAssignedArm(t: ResearchSubject): Option[String]                = t.assignedArm
  def extractImplicitRules(t: ResearchSubject): Option[UriStr]              = t.implicitRules
  def extractModifierExtension(t: ResearchSubject): LitSeq[Extension]       = t.modifierExtension
  def extractProgress(t: ResearchSubject): LitSeq[ResearchSubject.Progress] = t.progress
  override val thisName: String                                             = "ResearchSubject"
  override val searchParams: Map[String, ResearchSubject => Seq[Any]] = Map(
    "subject"       -> (obj => Seq(obj.subject)),
    "identifier"    -> (obj => obj.identifier.toSeq),
    "subject_state" -> (obj => obj.progress.flatMap(_.subjectState).toSeq),
    "date"          -> (obj => obj.period.toSeq),
    "status"        -> (obj => Seq(obj.status)),
    "study"         -> (obj => Seq(obj.study)),
    "patient"       -> (obj => Seq(obj.subject))
  )
  def unapply(
      o: ResearchSubject): Option[(Option[String], Option[Meta], Option[Narrative], Reference, PUBLICATION_STATUS, Option[Period], Reference, Option[Reference], Option[LANGUAGES], LitSeq[Resource], LitSeq[Extension], Option[String], LitSeq[Identifier], Option[String], Option[UriStr], LitSeq[Extension], LitSeq[ResearchSubject.Progress])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.study,
        o.status,
        o.period,
        o.subject,
        o.consent,
        o.language,
        o.contained,
        o.extension,
        o.actualArm,
        o.identifier,
        o.assignedArm,
        o.implicitRules,
        o.modifierExtension,
        o.progress))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ResearchSubject] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new ResearchSubject(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Reference]("study", None),
          cursor.decodeAs[PUBLICATION_STATUS]("status", None),
          cursor.decodeAs[Option[Period]]("period", Some(None)),
          cursor.decodeAs[Reference]("subject", None),
          cursor.decodeAs[Option[Reference]]("consent", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("actualArm", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("assignedArm", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[ResearchSubject.Progress]]("progress", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** A physical entity which is the primary unit of operational and/or administrative interest in a study.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields study, status, period, subject, consent, actualArm, identifier, assignedArm, progress.
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
  * @param study
  *   - Reference to the study the subject is participating in.
  * @param status
  *   - The publication state of the resource (not of the subject).
  * @param period
  *   - The dates the subject began and ended their participation in the study.
  * @param subject
  *   - The record of the person, animal or other entity involved in the study.
  * @param consent
  *   - A record of the patient's informed agreement to participate in the study.
  * @param language
  *   - The base language in which the resource is written.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param actualArm
  *   - The name of the arm in the study the subject actually followed as part of this study.
  * @param identifier
  *   - Identifiers assigned to this research subject for a study.
  * @param assignedArm
  *   - The name of the arm in the study the subject is expected to follow as part of this study.
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
  * @param progress
  *   - The current state (status) of the subject and resons for status change where appropriate.
  */
@POJOBoilerplate
class ResearchSubject(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val study: Reference,
    val status: PUBLICATION_STATUS,
    val period: Option[Period] = None,
    val subject: Reference,
    val consent: Option[Reference] = None,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val actualArm: Option[String] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val assignedArm: Option[String] = None,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val progress: LitSeq[ResearchSubject.Progress] = LitSeq.empty,
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
  override val thisTypeName: String = "ResearchSubject"
}
