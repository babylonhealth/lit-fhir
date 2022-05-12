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
import com.babylonhealth.lit.hl7.DIAGNOSTIC_REPORT_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object DiagnosticReport extends CompanionFor[DiagnosticReport] {
  implicit def summonObjectAndCompanionDiagnosticReport_729122384(
      o: DiagnosticReport): ObjectAndCompanion[DiagnosticReport, DiagnosticReport.type] = ObjectAndCompanion(o, this)
  override type ResourceType = DiagnosticReport
  override type ParentType   = DiagnosticReport
  override val baseType: CompanionFor[ResourceType] = DiagnosticReport
  override val parentType: CompanionFor[ParentType] = DiagnosticReport
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/DiagnosticReport")
  object Media extends CompanionFor[Media] {
    implicit def summonObjectAndCompanionMedia2049281974(o: Media): ObjectAndCompanion[Media, Media.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Media
    override type ParentType   = Media
    override val parentType: CompanionFor[ResourceType] = Media
    def apply(
        id: Option[String] = None,
        link: Reference,
        comment: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Media = new Media(
      id,
      link,
      comment,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(o: Media): Option[(Option[String], Reference, Option[String], LitSeq[Extension], LitSeq[Extension])] = Some(
      (o.id, o.link, o.comment, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val link: FHIRComponentFieldMeta[Reference] =
      FHIRComponentFieldMeta("link", lTagOf[Reference], false, lTagOf[Reference])
    val comment: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("comment", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, link, comment, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Media): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Reference](link, t.link),
      FHIRComponentField[Option[String]](comment, t.comment),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Media] = this
    val thisName: String              = "Media"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Media] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Media(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Reference]("link", None),
            cursor.decodeAs[Option[String]]("comment", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Media(
      override val id: Option[String] = None,
      val link: Reference,
      val comment: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  type EffectiveChoice = Choice[UnionDateTimeOrPeriod]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      code: CodeableConcept,
      status: DIAGNOSTIC_REPORT_STATUS,
      issued: Option[ZonedDateTime] = None,
      result: LitSeq[Reference] = LitSeq.empty,
      basedOn: LitSeq[Reference] = LitSeq.empty,
      subject: Option[Reference] = None,
      language: Option[LANGUAGES] = None,
      category: LitSeq[CodeableConcept] = LitSeq.empty,
      specimen: LitSeq[Reference] = LitSeq.empty,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      encounter: Option[Reference] = None,
      performer: LitSeq[Reference] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      conclusion: Option[String] = None,
      effective: Option[DiagnosticReport.EffectiveChoice] = None,
      imagingStudy: LitSeq[Reference] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      presentedForm: LitSeq[Attachment] = LitSeq.empty,
      conclusionCode: LitSeq[CodeableConcept] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      resultsInterpreter: LitSeq[Reference] = LitSeq.empty,
      media: LitSeq[DiagnosticReport.Media] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): DiagnosticReport = new DiagnosticReport(
    id,
    meta,
    text,
    code,
    status,
    issued,
    result,
    basedOn,
    subject,
    language,
    category,
    specimen,
    contained,
    extension,
    encounter,
    performer,
    identifier,
    conclusion,
    effective,
    imagingStudy,
    implicitRules,
    presentedForm,
    conclusionCode,
    modifierExtension,
    resultsInterpreter,
    media,
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
  val status: FHIRComponentFieldMeta[DIAGNOSTIC_REPORT_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[DIAGNOSTIC_REPORT_STATUS], false, lTagOf[DIAGNOSTIC_REPORT_STATUS])
  val issued: FHIRComponentFieldMeta[Option[ZonedDateTime]] =
    FHIRComponentFieldMeta("issued", lTagOf[Option[ZonedDateTime]], false, lTagOf[ZonedDateTime])
  val result: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("result", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val basedOn: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("basedOn", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val subject: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("subject", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val category: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("category", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val specimen: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("specimen", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val encounter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("encounter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val performer: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("performer", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val conclusion: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("conclusion", lTagOf[Option[String]], false, lTagOf[String])
  val effective: FHIRComponentFieldMeta[Option[DiagnosticReport.EffectiveChoice]] =
    FHIRComponentFieldMeta("effective", lTagOf[Option[DiagnosticReport.EffectiveChoice]], true, lTagOf[UnionDateTimeOrPeriod])
  val imagingStudy: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("imagingStudy", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val presentedForm: FHIRComponentFieldMeta[LitSeq[Attachment]] =
    FHIRComponentFieldMeta("presentedForm", lTagOf[LitSeq[Attachment]], false, lTagOf[Attachment])
  val conclusionCode: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("conclusionCode", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val resultsInterpreter: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("resultsInterpreter", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val media: FHIRComponentFieldMeta[LitSeq[DiagnosticReport.Media]] =
    FHIRComponentFieldMeta("media", lTagOf[LitSeq[DiagnosticReport.Media]], false, lTagOf[DiagnosticReport.Media])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    code,
    status,
    issued,
    result,
    basedOn,
    subject,
    language,
    category,
    specimen,
    contained,
    extension,
    encounter,
    performer,
    identifier,
    conclusion,
    effective,
    imagingStudy,
    implicitRules,
    presentedForm,
    conclusionCode,
    modifierExtension,
    resultsInterpreter,
    media
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: DiagnosticReport): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[CodeableConcept](code, t.code),
    FHIRComponentField[DIAGNOSTIC_REPORT_STATUS](status, t.status),
    FHIRComponentField[Option[ZonedDateTime]](issued, t.issued),
    FHIRComponentField[LitSeq[Reference]](result, t.result),
    FHIRComponentField[LitSeq[Reference]](basedOn, t.basedOn),
    FHIRComponentField[Option[Reference]](subject, t.subject),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[CodeableConcept]](category, t.category),
    FHIRComponentField[LitSeq[Reference]](specimen, t.specimen),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Reference]](encounter, t.encounter),
    FHIRComponentField[LitSeq[Reference]](performer, t.performer),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[String]](conclusion, t.conclusion),
    FHIRComponentField[Option[DiagnosticReport.EffectiveChoice]](effective, t.effective),
    FHIRComponentField[LitSeq[Reference]](imagingStudy, t.imagingStudy),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Attachment]](presentedForm, t.presentedForm),
    FHIRComponentField[LitSeq[CodeableConcept]](conclusionCode, t.conclusionCode),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[Reference]](resultsInterpreter, t.resultsInterpreter),
    FHIRComponentField[LitSeq[DiagnosticReport.Media]](media, t.media)
  )
  def extractId(t: DiagnosticReport): Option[String]                                  = t.id
  def extractMeta(t: DiagnosticReport): Option[Meta]                                  = t.meta
  def extractText(t: DiagnosticReport): Option[Narrative]                             = t.text
  def extractCode(t: DiagnosticReport): CodeableConcept                               = t.code
  def extractStatus(t: DiagnosticReport): DIAGNOSTIC_REPORT_STATUS                    = t.status
  def extractIssued(t: DiagnosticReport): Option[ZonedDateTime]                       = t.issued
  def extractResult(t: DiagnosticReport): LitSeq[Reference]                           = t.result
  def extractBasedOn(t: DiagnosticReport): LitSeq[Reference]                          = t.basedOn
  def extractSubject(t: DiagnosticReport): Option[Reference]                          = t.subject
  def extractLanguage(t: DiagnosticReport): Option[LANGUAGES]                         = t.language
  def extractCategory(t: DiagnosticReport): LitSeq[CodeableConcept]                   = t.category
  def extractSpecimen(t: DiagnosticReport): LitSeq[Reference]                         = t.specimen
  def extractContained(t: DiagnosticReport): LitSeq[Resource]                         = t.contained
  def extractExtension(t: DiagnosticReport): LitSeq[Extension]                        = t.extension
  def extractEncounter(t: DiagnosticReport): Option[Reference]                        = t.encounter
  def extractPerformer(t: DiagnosticReport): LitSeq[Reference]                        = t.performer
  def extractIdentifier(t: DiagnosticReport): LitSeq[Identifier]                      = t.identifier
  def extractConclusion(t: DiagnosticReport): Option[String]                          = t.conclusion
  def extractEffective(t: DiagnosticReport): Option[DiagnosticReport.EffectiveChoice] = t.effective
  def extractImagingStudy(t: DiagnosticReport): LitSeq[Reference]                     = t.imagingStudy
  def extractImplicitRules(t: DiagnosticReport): Option[UriStr]                       = t.implicitRules
  def extractPresentedForm(t: DiagnosticReport): LitSeq[Attachment]                   = t.presentedForm
  def extractConclusionCode(t: DiagnosticReport): LitSeq[CodeableConcept]             = t.conclusionCode
  def extractModifierExtension(t: DiagnosticReport): LitSeq[Extension]                = t.modifierExtension
  def extractResultsInterpreter(t: DiagnosticReport): LitSeq[Reference]               = t.resultsInterpreter
  def extractMedia(t: DiagnosticReport): LitSeq[DiagnosticReport.Media]               = t.media
  override val thisName: String                                                       = "DiagnosticReport"
  override val searchParams: Map[String, DiagnosticReport => Seq[Any]] = Map(
    "assessed-condition" -> (obj =>
      obj.extension.filter(_.url == "http://hl7.org/fhir/StructureDefinition/DiagnosticReport-geneticsAssessedCondition").toSeq),
    "subject"             -> (obj => obj.subject.toSeq),
    "identifier"          -> (obj => obj.identifier.toSeq),
    "result"              -> (obj => obj.result.toSeq),
    "date"                -> (obj => obj.effective.toSeq),
    "status"              -> (obj => Seq(obj.status)),
    "results-interpreter" -> (obj => obj.resultsInterpreter.toSeq),
    "specimen"            -> (obj => obj.specimen.toSeq),
    "based-on"            -> (obj => obj.basedOn.toSeq),
    "encounter"           -> (obj => obj.encounter.toSeq),
    "performer"           -> (obj => obj.performer.toSeq),
    "patient"             -> (obj => obj.subject.filter(_.reference.exists(_.contains("Patient/"))).toSeq),
    "conclusion"          -> (obj => obj.conclusionCode.toSeq),
    "code"                -> (obj => Seq(obj.code)),
    "issued"              -> (obj => obj.issued.toSeq),
    "media"               -> (obj => obj.media.map(_.link).toSeq),
    "category"            -> (obj => obj.category.toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[DiagnosticReport] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new DiagnosticReport(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[CodeableConcept]("code", None),
          cursor.decodeAs[DIAGNOSTIC_REPORT_STATUS]("status", None),
          cursor.decodeAs[Option[ZonedDateTime]]("issued", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("result", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("basedOn", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("subject", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("category", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("specimen", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("performer", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("conclusion", Some(None)),
          cursor.decodeOptRef[UnionDateTimeOrPeriod]("effective"),
          cursor.decodeAs[LitSeq[Reference]]("imagingStudy", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Attachment]]("presentedForm", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("conclusionCode", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("resultsInterpreter", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[DiagnosticReport.Media]]("media", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** The findings and interpretation of diagnostic tests performed on patients, groups of patients, devices, and locations, and/or
  * specimens derived from these. The report includes clinical context such as requesting and provider information, and some mix
  * of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields code, status, issued, result, basedOn, subject, category, specimen, encounter, performer, identifier,
  *   conclusion, effective, imagingStudy, presentedForm, conclusionCode, resultsInterpreter, media.
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
  *   - A code or name that describes this diagnostic report.
  * @param status
  *   - The status of the diagnostic report.
  * @param issued
  *   - The date and time that this version of the report was made available to providers, typically after the report was
  *   reviewed and verified.
  * @param result
  *   - [Observations](observation.html) that are part of this diagnostic report.
  * @param basedOn
  *   - Details concerning a service requested.
  * @param subject
  *   - The subject of the report. Usually, but not always, this is a patient. However, diagnostic services also perform analyses
  *   on specimens collected from a variety of other sources.
  * @param language
  *   - The base language in which the resource is written.
  * @param category
  *   - A code that classifies the clinical discipline, department or diagnostic service that created the report (e.g.
  *   cardiology, biochemistry, hematology, MRI). This is used for searching, sorting and display purposes.
  * @param specimen
  *   - Details about the specimens on which this diagnostic report is based.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param encounter
  *   - The healthcare event (e.g. a patient and healthcare provider interaction) which this DiagnosticReport is about.
  * @param performer
  *   - The diagnostic service that is responsible for issuing the report.
  * @param identifier
  *   - Identifiers assigned to this report by the performer or other systems.
  * @param conclusion
  *   - Concise and clinically contextualized summary conclusion (interpretation/impression) of the diagnostic report.
  * @param effective
  *   - The time or time-period the observed values are related to. When the subject of the report is a patient, this is usually
  *   either the time of the procedure or of specimen collection(s), but very often the source of the date/time is not known, only
  *   the date/time itself.
  * @param imagingStudy
  *   - One or more links to full details of any imaging performed during the diagnostic investigation. Typically, this is
  *   imaging performed by DICOM enabled modalities, but this is not required. A fully enabled PACS viewer can use this
  *   information to provide views of the source images.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param presentedForm
  *   - Rich text representation of the entire result as issued by the diagnostic service. Multiple formats are allowed but they
  *   SHALL be semantically equivalent.
  * @param conclusionCode
  *   - One or more codes that represent the summary conclusion (interpretation/impression) of the diagnostic report.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that
  *   modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *   Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *   strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *   extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *   processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any
  *   elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param resultsInterpreter
  *   - The practitioner or organization that is responsible for the report's conclusions and interpretations.
  * @param media
  *   - A list of key images associated with this report. The images are generally created during the diagnostic process, and may
  *   be directly of the patient, or of treated specimens (i.e. slides of interest).
  */
@POJOBoilerplate
class DiagnosticReport(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val code: CodeableConcept,
    val status: DIAGNOSTIC_REPORT_STATUS,
    val issued: Option[ZonedDateTime] = None,
    val result: LitSeq[Reference] = LitSeq.empty,
    val basedOn: LitSeq[Reference] = LitSeq.empty,
    val subject: Option[Reference] = None,
    override val language: Option[LANGUAGES] = None,
    val category: LitSeq[CodeableConcept] = LitSeq.empty,
    val specimen: LitSeq[Reference] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val encounter: Option[Reference] = None,
    val performer: LitSeq[Reference] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val conclusion: Option[String] = None,
    val effective: Option[DiagnosticReport.EffectiveChoice] = None,
    val imagingStudy: LitSeq[Reference] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    val presentedForm: LitSeq[Attachment] = LitSeq.empty,
    val conclusionCode: LitSeq[CodeableConcept] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val resultsInterpreter: LitSeq[Reference] = LitSeq.empty,
    val media: LitSeq[DiagnosticReport.Media] = LitSeq.empty,
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
  override val thisTypeName: String = "DiagnosticReport"
}
