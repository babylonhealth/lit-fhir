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
import com.babylonhealth.lit.hl7.{ OBSERVATION_STATUS, DETECTEDISSUE_SEVERITY, ISSUE_SEVERITY }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object DetectedIssue extends CompanionFor[DetectedIssue] {
  implicit def summonObjectAndCompanionDetectedIssue_221038174(
      o: DetectedIssue): ObjectAndCompanion[DetectedIssue, DetectedIssue.type] = ObjectAndCompanion(o, this)
  override type ResourceType = DetectedIssue
  override type ParentType   = DetectedIssue
  override val baseType: CompanionFor[ResourceType] = DetectedIssue
  override val parentType: CompanionFor[ParentType] = DetectedIssue
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/DetectedIssue")
  object Mitigation extends CompanionFor[Mitigation] {
    implicit def summonObjectAndCompanionMitigation1701127854(o: Mitigation): ObjectAndCompanion[Mitigation, Mitigation.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Mitigation
    override type ParentType   = Mitigation
    override val parentType: CompanionFor[ResourceType] = Mitigation
    def apply(
        id: Option[String] = None,
        date: Option[FHIRDateTime] = None,
        action: CodeableConcept,
        author: Option[Reference] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Mitigation = new Mitigation(
      id,
      date,
      action,
      author,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Mitigation): Option[(Option[String], Option[FHIRDateTime], CodeableConcept, Option[Reference], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.date, o.action, o.author, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val date: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
      FHIRComponentFieldMeta("date", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
    val action: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("action", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val author: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("author", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, date, action, author, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Mitigation): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[FHIRDateTime]](date, t.date),
      FHIRComponentField[CodeableConcept](action, t.action),
      FHIRComponentField[Option[Reference]](author, t.author),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Mitigation] = this
    val thisName: String                   = "Mitigation"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Mitigation] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Mitigation(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[FHIRDateTime]]("date", Some(None)),
            cursor.decodeAs[CodeableConcept]("action", None),
            cursor.decodeAs[Option[Reference]]("author", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Mitigation(
      override val id: Option[String] = None,
      val date: Option[FHIRDateTime] = None,
      val action: CodeableConcept,
      val author: Option[Reference] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Evidence extends CompanionFor[Evidence] {
    implicit def summonObjectAndCompanionEvidence1701127854(o: Evidence): ObjectAndCompanion[Evidence, Evidence.type] =
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
  type IdentifiedChoice = Choice[UnionDateTimeOrPeriod]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      code: Option[CodeableConcept] = None,
      status: OBSERVATION_STATUS,
      author: Option[Reference] = None,
      detail: Option[String] = None,
      patient: Option[Reference] = None,
      language: Option[LANGUAGES] = None,
      severity: Option[DETECTEDISSUE_SEVERITY] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      reference: Option[UriStr] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      implicated: LitSeq[Reference] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      identified: Option[DetectedIssue.IdentifiedChoice] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      evidence: LitSeq[DetectedIssue.Evidence] = LitSeq.empty,
      mitigation: LitSeq[DetectedIssue.Mitigation] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): DetectedIssue = new DetectedIssue(
    id,
    meta,
    text,
    code,
    status,
    author,
    detail,
    patient,
    language,
    severity,
    contained,
    extension,
    reference,
    identifier,
    implicated,
    implicitRules,
    identified,
    modifierExtension,
    evidence,
    mitigation,
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
  val status: FHIRComponentFieldMeta[OBSERVATION_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[OBSERVATION_STATUS], false, lTagOf[OBSERVATION_STATUS])
  val author: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("author", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val detail: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("detail", lTagOf[Option[String]], false, lTagOf[String])
  val patient: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("patient", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val severity: FHIRComponentFieldMeta[Option[DETECTEDISSUE_SEVERITY]] =
    FHIRComponentFieldMeta("severity", lTagOf[Option[DETECTEDISSUE_SEVERITY]], false, lTagOf[DETECTEDISSUE_SEVERITY])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val reference: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("reference", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val implicated: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("implicated", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val identified: FHIRComponentFieldMeta[Option[DetectedIssue.IdentifiedChoice]] =
    FHIRComponentFieldMeta("identified", lTagOf[Option[DetectedIssue.IdentifiedChoice]], true, lTagOf[UnionDateTimeOrPeriod])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val evidence: FHIRComponentFieldMeta[LitSeq[DetectedIssue.Evidence]] =
    FHIRComponentFieldMeta("evidence", lTagOf[LitSeq[DetectedIssue.Evidence]], false, lTagOf[DetectedIssue.Evidence])
  val mitigation: FHIRComponentFieldMeta[LitSeq[DetectedIssue.Mitigation]] =
    FHIRComponentFieldMeta("mitigation", lTagOf[LitSeq[DetectedIssue.Mitigation]], false, lTagOf[DetectedIssue.Mitigation])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    code,
    status,
    author,
    detail,
    patient,
    language,
    severity,
    contained,
    extension,
    reference,
    identifier,
    implicated,
    implicitRules,
    identified,
    modifierExtension,
    evidence,
    mitigation
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: DetectedIssue): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[CodeableConcept]](code, t.code),
    FHIRComponentField[OBSERVATION_STATUS](status, t.status),
    FHIRComponentField[Option[Reference]](author, t.author),
    FHIRComponentField[Option[String]](detail, t.detail),
    FHIRComponentField[Option[Reference]](patient, t.patient),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Option[DETECTEDISSUE_SEVERITY]](severity, t.severity),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[UriStr]](reference, t.reference),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[LitSeq[Reference]](implicated, t.implicated),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[DetectedIssue.IdentifiedChoice]](identified, t.identified),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[DetectedIssue.Evidence]](evidence, t.evidence),
    FHIRComponentField[LitSeq[DetectedIssue.Mitigation]](mitigation, t.mitigation)
  )
  def extractId(t: DetectedIssue): Option[String]                                 = t.id
  def extractMeta(t: DetectedIssue): Option[Meta]                                 = t.meta
  def extractText(t: DetectedIssue): Option[Narrative]                            = t.text
  def extractCode(t: DetectedIssue): Option[CodeableConcept]                      = t.code
  def extractStatus(t: DetectedIssue): OBSERVATION_STATUS                         = t.status
  def extractAuthor(t: DetectedIssue): Option[Reference]                          = t.author
  def extractDetail(t: DetectedIssue): Option[String]                             = t.detail
  def extractPatient(t: DetectedIssue): Option[Reference]                         = t.patient
  def extractLanguage(t: DetectedIssue): Option[LANGUAGES]                        = t.language
  def extractSeverity(t: DetectedIssue): Option[DETECTEDISSUE_SEVERITY]           = t.severity
  def extractContained(t: DetectedIssue): LitSeq[Resource]                        = t.contained
  def extractExtension(t: DetectedIssue): LitSeq[Extension]                       = t.extension
  def extractReference(t: DetectedIssue): Option[UriStr]                          = t.reference
  def extractIdentifier(t: DetectedIssue): LitSeq[Identifier]                     = t.identifier
  def extractImplicated(t: DetectedIssue): LitSeq[Reference]                      = t.implicated
  def extractImplicitRules(t: DetectedIssue): Option[UriStr]                      = t.implicitRules
  def extractIdentified(t: DetectedIssue): Option[DetectedIssue.IdentifiedChoice] = t.identified
  def extractModifierExtension(t: DetectedIssue): LitSeq[Extension]               = t.modifierExtension
  def extractEvidence(t: DetectedIssue): LitSeq[DetectedIssue.Evidence]           = t.evidence
  def extractMitigation(t: DetectedIssue): LitSeq[DetectedIssue.Mitigation]       = t.mitigation
  override val thisName: String                                                   = "DetectedIssue"
  override val searchParams: Map[String, DetectedIssue => Seq[Any]] = Map(
    "identifier" -> (obj => obj.identifier.toSeq),
    "code"       -> (obj => obj.code.toSeq),
    "identified" -> (obj => obj.identified.toSeq),
    "patient"    -> (obj => obj.patient.toSeq),
    "implicated" -> (obj => obj.implicated.toSeq),
    "author"     -> (obj => obj.author.toSeq)
  )
  def unapply(
      o: DetectedIssue): Option[(Option[String], Option[Meta], Option[Narrative], Option[CodeableConcept], OBSERVATION_STATUS, Option[Reference], Option[String], Option[Reference], Option[LANGUAGES], Option[DETECTEDISSUE_SEVERITY], LitSeq[Resource], LitSeq[Extension], Option[UriStr], LitSeq[Identifier], LitSeq[Reference], Option[UriStr], Option[DetectedIssue.IdentifiedChoice], LitSeq[Extension], LitSeq[DetectedIssue.Evidence], LitSeq[DetectedIssue.Mitigation])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.code,
        o.status,
        o.author,
        o.detail,
        o.patient,
        o.language,
        o.severity,
        o.contained,
        o.extension,
        o.reference,
        o.identifier,
        o.implicated,
        o.implicitRules,
        o.identified,
        o.modifierExtension,
        o.evidence,
        o.mitigation))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[DetectedIssue] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new DetectedIssue(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("code", Some(None)),
          cursor.decodeAs[OBSERVATION_STATUS]("status", None),
          cursor.decodeAs[Option[Reference]]("author", Some(None)),
          cursor.decodeAs[Option[String]]("detail", Some(None)),
          cursor.decodeAs[Option[Reference]]("patient", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[DETECTEDISSUE_SEVERITY]]("severity", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("reference", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("implicated", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeOptRef[UnionDateTimeOrPeriod]("identified"),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[DetectedIssue.Evidence]]("evidence", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[DetectedIssue.Mitigation]]("mitigation", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient;
  * e.g. Drug-drug interaction, Ineffective treatment frequency, Procedure-condition conflict, etc.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields code, status, author, detail, patient, severity, reference, identifier, implicated, identified,
  *   evidence, mitigation.
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
  *   - Identifies the general type of issue identified.
  * @param status
  *   - Indicates the status of the detected issue.
  * @param author
  *   - Individual or device responsible for the issue being raised. For example, a decision support application or a pharmacist
  *   conducting a medication review.
  * @param detail
  *   - A textual explanation of the detected issue.
  * @param patient
  *   - Indicates the patient whose record the detected issue is associated with.
  * @param language
  *   - The base language in which the resource is written.
  * @param severity
  *   - Indicates the degree of importance associated with the identified issue based on the potential impact on the patient.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param reference
  *   - The literature, knowledge-base or similar reference that describes the propensity for the detected issue identified.
  * @param identifier
  *   - Business identifier associated with the detected issue record.
  * @param implicated
  *   - Indicates the resource representing the current activity or proposed activity that is potentially problematic.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param identified
  *   - The date or period when the detected issue was initially identified.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that
  *   modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *   Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *   strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *   extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *   processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any
  *   elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param evidence
  *   - Supporting evidence or manifestations that provide the basis for identifying the detected issue such as a
  *   GuidanceResponse or MeasureReport.
  * @param mitigation
  *   - Indicates an action that has been taken or is committed to reduce or eliminate the likelihood of the risk identified by
  *   the detected issue from manifesting. Can also reflect an observation of known mitigating factors that may reduce/eliminate
  *   the need for any action.
  */
@POJOBoilerplate
class DetectedIssue(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val code: Option[CodeableConcept] = None,
    val status: OBSERVATION_STATUS,
    val author: Option[Reference] = None,
    val detail: Option[String] = None,
    val patient: Option[Reference] = None,
    override val language: Option[LANGUAGES] = None,
    val severity: Option[DETECTEDISSUE_SEVERITY] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val reference: Option[UriStr] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val implicated: LitSeq[Reference] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    val identified: Option[DetectedIssue.IdentifiedChoice] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val evidence: LitSeq[DetectedIssue.Evidence] = LitSeq.empty,
    val mitigation: LitSeq[DetectedIssue.Mitigation] = LitSeq.empty,
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
  override val thisTypeName: String = "DetectedIssue"
}
