package com.babylonhealth.lit.ukcore.model

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
import com.babylonhealth.lit.{ core, hl7, ukcore }
import com.babylonhealth.lit.macros.POJOBoilerplate

object UKCore_DiagnosticReport extends CompanionFor[UKCore_DiagnosticReport] {
  implicit def summonObjectAndCompanionUKCore_DiagnosticReport1677764458(
      o: UKCore_DiagnosticReport): ObjectAndCompanion[UKCore_DiagnosticReport, UKCore_DiagnosticReport.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = DiagnosticReport
  override type ParentType   = DiagnosticReport
  override val baseType: CompanionFor[ResourceType] = DiagnosticReport
  override val parentType: CompanionFor[ParentType] = DiagnosticReport
  override val profileUrl: Option[String]           = Some("https://fhir.hl7.org.uk/StructureDefinition/UKCore-DiagnosticReport")
  type EffectiveChoice = Choice[UnionDateTimeOrPeriod]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(
        new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-DiagnosticReport"))),
      text: Option[Narrative] = None,
      status: DIAGNOSTIC_REPORT_STATUS,
      issued: Option[ZonedDateTime] = None,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      conclusion: Option[String] = None,
      effective: Option[UKCore_DiagnosticReport.EffectiveChoice] = None,
      implicitRules: Option[UriStr] = None,
      presentedForm: LitSeq[Attachment] = LitSeq.empty,
      code: CodeableConcept,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      category: LitSeq[CodeableConcept] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      conclusionCode: LitSeq[CodeableConcept] = LitSeq.empty,
      result: LitSeq[Reference] = LitSeq.empty,
      basedOn: LitSeq[Reference] = LitSeq.empty,
      subject: Option[Reference] = None,
      specimen: LitSeq[Reference] = LitSeq.empty,
      encounter: Option[Reference] = None,
      performer: LitSeq[Reference] = LitSeq.empty,
      media: LitSeq[DiagnosticReport.Media] = LitSeq.empty,
      imagingStudy: LitSeq[Reference] = LitSeq.empty,
      resultsInterpreter: LitSeq[Reference] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): UKCore_DiagnosticReport = new UKCore_DiagnosticReport(
    id,
    meta,
    text,
    status,
    issued,
    language,
    contained,
    extension,
    conclusion,
    effective,
    implicitRules,
    presentedForm,
    code,
    modifierExtension,
    category,
    identifier,
    conclusionCode,
    result,
    basedOn,
    subject,
    specimen,
    encounter,
    performer,
    media,
    imagingStudy,
    resultsInterpreter,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val status: FHIRComponentFieldMeta[DIAGNOSTIC_REPORT_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[DIAGNOSTIC_REPORT_STATUS], false, lTagOf[DIAGNOSTIC_REPORT_STATUS])
  val issued: FHIRComponentFieldMeta[Option[ZonedDateTime]] =
    FHIRComponentFieldMeta("issued", lTagOf[Option[ZonedDateTime]], false, lTagOf[ZonedDateTime])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val conclusion: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("conclusion", lTagOf[Option[String]], false, lTagOf[String])
  val effective: FHIRComponentFieldMeta[Option[UKCore_DiagnosticReport.EffectiveChoice]] =
    FHIRComponentFieldMeta(
      "effective",
      lTagOf[Option[UKCore_DiagnosticReport.EffectiveChoice]],
      true,
      lTagOf[UnionDateTimeOrPeriod])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val presentedForm: FHIRComponentFieldMeta[LitSeq[Attachment]] =
    FHIRComponentFieldMeta("presentedForm", lTagOf[LitSeq[Attachment]], false, lTagOf[Attachment])
  val code: FHIRComponentFieldMeta[CodeableConcept] =
    FHIRComponentFieldMeta("code", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val category: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("category", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val conclusionCode: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("conclusionCode", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val result: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("result", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val basedOn: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("basedOn", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val subject: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("subject", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val specimen: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("specimen", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val encounter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("encounter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val performer: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("performer", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val media: FHIRComponentFieldMeta[LitSeq[DiagnosticReport.Media]] =
    FHIRComponentFieldMeta("media", lTagOf[LitSeq[DiagnosticReport.Media]], false, lTagOf[DiagnosticReport.Media])
  val imagingStudy: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("imagingStudy", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val resultsInterpreter: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("resultsInterpreter", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    status,
    issued,
    language,
    contained,
    extension,
    conclusion,
    effective,
    implicitRules,
    presentedForm,
    code,
    modifierExtension,
    category,
    identifier,
    conclusionCode,
    result,
    basedOn,
    subject,
    specimen,
    encounter,
    performer,
    media,
    imagingStudy,
    resultsInterpreter
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Meta]](meta, t.meta),
      FHIRComponentField[Option[Narrative]](text, t.text),
      FHIRComponentField[DIAGNOSTIC_REPORT_STATUS](status, t.status),
      FHIRComponentField[Option[ZonedDateTime]](issued, t.issued),
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[LitSeq[Resource]](contained, t.contained),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[String]](conclusion, t.conclusion),
      FHIRComponentField[Option[UKCore_DiagnosticReport.EffectiveChoice]](effective, t.effective),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[LitSeq[Attachment]](presentedForm, t.presentedForm),
      FHIRComponentField[CodeableConcept](code, t.code),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[CodeableConcept]](category, t.category),
      FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
      FHIRComponentField[LitSeq[CodeableConcept]](conclusionCode, t.conclusionCode),
      FHIRComponentField[LitSeq[Reference]](result, t.result),
      FHIRComponentField[LitSeq[Reference]](basedOn, t.basedOn),
      FHIRComponentField[Option[Reference]](subject, t.subject),
      FHIRComponentField[LitSeq[Reference]](specimen, t.specimen),
      FHIRComponentField[Option[Reference]](encounter, t.encounter),
      FHIRComponentField[LitSeq[Reference]](performer, t.performer),
      FHIRComponentField[LitSeq[DiagnosticReport.Media]](media, t.media),
      FHIRComponentField[LitSeq[Reference]](imagingStudy, t.imagingStudy),
      FHIRComponentField[LitSeq[Reference]](resultsInterpreter, t.resultsInterpreter)
    ))
  override def fields(t: UKCore_DiagnosticReport): Seq[FHIRComponentField[_]]                       = fieldsFromParent(t).get
  def extractId(t: UKCore_DiagnosticReport): Option[String]                                         = t.id
  def extractMeta(t: UKCore_DiagnosticReport): Option[Meta]                                         = t.meta
  def extractText(t: UKCore_DiagnosticReport): Option[Narrative]                                    = t.text
  def extractStatus(t: UKCore_DiagnosticReport): DIAGNOSTIC_REPORT_STATUS                           = t.status
  def extractIssued(t: UKCore_DiagnosticReport): Option[ZonedDateTime]                              = t.issued
  def extractLanguage(t: UKCore_DiagnosticReport): Option[LANGUAGES]                                = t.language
  def extractContained(t: UKCore_DiagnosticReport): LitSeq[Resource]                                = t.contained
  def extractExtension(t: UKCore_DiagnosticReport): LitSeq[Extension]                               = t.extension
  def extractConclusion(t: UKCore_DiagnosticReport): Option[String]                                 = t.conclusion
  def extractEffective(t: UKCore_DiagnosticReport): Option[UKCore_DiagnosticReport.EffectiveChoice] = t.effective
  def extractImplicitRules(t: UKCore_DiagnosticReport): Option[UriStr]                              = t.implicitRules
  def extractPresentedForm(t: UKCore_DiagnosticReport): LitSeq[Attachment]                          = t.presentedForm
  def extractCode(t: UKCore_DiagnosticReport): CodeableConcept                                      = t.code
  def extractModifierExtension(t: UKCore_DiagnosticReport): LitSeq[Extension]                       = t.modifierExtension
  def extractCategory(t: UKCore_DiagnosticReport): LitSeq[CodeableConcept]                          = t.category
  def extractIdentifier(t: UKCore_DiagnosticReport): LitSeq[Identifier]                             = t.identifier
  def extractConclusionCode(t: UKCore_DiagnosticReport): LitSeq[CodeableConcept]                    = t.conclusionCode
  def extractResult(t: UKCore_DiagnosticReport): LitSeq[Reference]                                  = t.result
  def extractBasedOn(t: UKCore_DiagnosticReport): LitSeq[Reference]                                 = t.basedOn
  def extractSubject(t: UKCore_DiagnosticReport): Option[Reference]                                 = t.subject
  def extractSpecimen(t: UKCore_DiagnosticReport): LitSeq[Reference]                                = t.specimen
  def extractEncounter(t: UKCore_DiagnosticReport): Option[Reference]                               = t.encounter
  def extractPerformer(t: UKCore_DiagnosticReport): LitSeq[Reference]                               = t.performer
  def extractMedia(t: UKCore_DiagnosticReport): LitSeq[DiagnosticReport.Media]                      = t.media
  def extractImagingStudy(t: UKCore_DiagnosticReport): LitSeq[Reference]                            = t.imagingStudy
  def extractResultsInterpreter(t: UKCore_DiagnosticReport): LitSeq[Reference]                      = t.resultsInterpreter
  override val thisName: String                                                                     = "UKCore_DiagnosticReport"
  override val searchParams: Map[String, UKCore_DiagnosticReport => Seq[Any]] = DiagnosticReport.searchParams
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[UKCore_DiagnosticReport] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new UKCore_DiagnosticReport(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[DIAGNOSTIC_REPORT_STATUS]("status", None),
          cursor.decodeAs[Option[ZonedDateTime]]("issued", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("conclusion", Some(None)),
          cursor.decodeOptRef[UnionDateTimeOrPeriod]("effective"),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Attachment]]("presentedForm", Some(LitSeq.empty)),
          cursor.decodeAs[CodeableConcept]("code", None),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("category", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("conclusionCode", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("result", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("basedOn", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("subject", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("specimen", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("performer", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[DiagnosticReport.Media]]("media", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("imagingStudy", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("resultsInterpreter", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Defines the UK Core constraints and extensions on the DiagnosticReport resource for the minimal set of data to query and
  * retrieve diagnostic report information.
  *
  * Subclass of [[hl7.model.DiagnosticReport]] (The findings and interpretation of diagnostic tests performed on patients, groups
  * of patients, devices, and locations, and/or specimens derived from these. The report includes clinical context such as
  * requesting and provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted
  * representation of diagnostic reports.)
  *
  * @constructor
  *   Inherits all params from parent.
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
  * @param status
  *   - The status of the diagnostic report.
  * @param issued
  *   - The date and time that this version of the report was made available to providers, typically after the report was reviewed
  *     and verified.
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
  * @param conclusion
  *   - Concise and clinically contextualized summary conclusion (interpretation/impression) of the diagnostic report.
  * @param effective
  *   - The time or time-period the observed values are related to. When the subject of the report is a patient, this is usually
  *     either the time of the procedure or of specimen collection(s), but very often the source of the date/time is not known,
  *     only the date/time itself.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *     processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *     other profiles etc.
  * @param presentedForm
  *   - Rich text representation of the entire result as issued by the diagnostic service. Multiple formats are allowed but they
  *     SHALL be semantically equivalent.
  * @param code
  *   - A code or name that describes this diagnostic report.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *     the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *     Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *     strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *     extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *     processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of
  *     any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param category
  *   - A code that classifies the clinical discipline, department or diagnostic service that created the report (e.g. cardiology,
  *     biochemistry, hematology, MRI). This is used for searching, sorting and display purposes.
  * @param identifier
  *   - Identifiers assigned to this report by the performer or other systems.
  * @param conclusionCode
  *   - One or more codes that represent the summary conclusion (interpretation/impression) of the diagnostic report.
  * @param result
  *   - [Observations](observation.html) that are part of this diagnostic report.
  * @param basedOn
  *   - Details concerning a service requested.
  * @param subject
  *   - The subject of the report. Usually, but not always, this is a patient. However, diagnostic services also perform analyses
  *     on specimens collected from a variety of other sources.
  * @param specimen
  *   - Details about the specimens on which this diagnostic report is based.
  * @param encounter
  *   - The healthcare event (e.g. a patient and healthcare provider interaction) which this DiagnosticReport is about.
  * @param performer
  *   - The diagnostic service that is responsible for issuing the report.
  * @param media
  *   - A list of key images associated with this report. The images are generally created during the diagnostic process, and may
  *     be directly of the patient, or of treated specimens (i.e. slides of interest).
  * @param imagingStudy
  *   - One or more links to full details of any imaging performed during the diagnostic investigation. Typically, this is imaging
  *     performed by DICOM enabled modalities, but this is not required. A fully enabled PACS viewer can use this information to
  *     provide views of the source images.
  * @param resultsInterpreter
  *   - The practitioner or organization that is responsible for the report's conclusions and interpretations.
  */
@POJOBoilerplate
class UKCore_DiagnosticReport(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-DiagnosticReport"))),
    override val text: Option[Narrative] = None,
    override val status: DIAGNOSTIC_REPORT_STATUS,
    override val issued: Option[ZonedDateTime] = None,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val conclusion: Option[String] = None,
    override val effective: Option[UKCore_DiagnosticReport.EffectiveChoice] = None,
    override val implicitRules: Option[UriStr] = None,
    override val presentedForm: LitSeq[Attachment] = LitSeq.empty,
    override val code: CodeableConcept,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val category: LitSeq[CodeableConcept] = LitSeq.empty,
    override val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val conclusionCode: LitSeq[CodeableConcept] = LitSeq.empty,
    override val result: LitSeq[Reference] = LitSeq.empty,
    override val basedOn: LitSeq[Reference] = LitSeq.empty,
    override val subject: Option[Reference] = None,
    override val specimen: LitSeq[Reference] = LitSeq.empty,
    override val encounter: Option[Reference] = None,
    override val performer: LitSeq[Reference] = LitSeq.empty,
    override val media: LitSeq[DiagnosticReport.Media] = LitSeq.empty,
    override val imagingStudy: LitSeq[Reference] = LitSeq.empty,
    override val resultsInterpreter: LitSeq[Reference] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends DiagnosticReport(
      id = id,
      meta = meta,
      text = text,
      code = code,
      status = status,
      issued = issued,
      result = result,
      basedOn = basedOn,
      subject = subject,
      language = language,
      category = category,
      specimen = specimen,
      contained = contained,
      extension = extension,
      encounter = encounter,
      performer = performer,
      identifier = identifier,
      conclusion = conclusion,
      effective = effective,
      imagingStudy = imagingStudy,
      implicitRules = implicitRules,
      presentedForm = presentedForm,
      conclusionCode = conclusionCode,
      modifierExtension = modifierExtension,
      resultsInterpreter = resultsInterpreter,
      media = media,
      primitiveAttributes = primitiveAttributes
    ) {
  override val thisTypeName: String = "DiagnosticReport"
}
