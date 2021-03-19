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
import com.babylonhealth.lit.hl7.DIAGNOSTIC_REPORT_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, usbase, uscore }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Us_core_diagnosticreport_lab extends CompanionFor[Us_core_diagnosticreport_lab] {
  override type ResourceType = DiagnosticReport
  override val baseType: CompanionFor[ResourceType] = DiagnosticReport
  override val profileUrl: Option[String] = Some(
    "http://hl7.org/fhir/us/core/StructureDefinition/us-core-diagnosticreport-lab")
  type EffectiveChoice = Choice[Union_0934386166]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(
        new Meta(profile = LitSeq("http://hl7.org/fhir/us/core/StructureDefinition/us-core-diagnosticreport-lab"))),
      text: Option[Narrative] = None,
      code: CodeableConcept,
      status: DIAGNOSTIC_REPORT_STATUS,
      issued: ZonedDateTime,
      result: LitSeq[Reference] = LitSeq.empty,
      basedOn: LitSeq[Reference] = LitSeq.empty,
      subject: Reference,
      language: Option[LANGUAGES] = None,
      category: NonEmptyLitSeq[CodeableConcept],
      specimen: LitSeq[Reference] = LitSeq.empty,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      encounter: Option[Reference] = None,
      performer: LitSeq[Reference] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      conclusion: Option[String] = None,
      effective: Us_core_diagnosticreport_lab.EffectiveChoice,
      imagingStudy: LitSeq[Reference] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      presentedForm: LitSeq[Attachment] = LitSeq.empty,
      conclusionCode: LitSeq[CodeableConcept] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      resultsInterpreter: LitSeq[Reference] = LitSeq.empty,
      media: LitSeq[DiagnosticReport.Media] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Us_core_diagnosticreport_lab = new Us_core_diagnosticreport_lab(
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
  val issued: FHIRComponentFieldMeta[ZonedDateTime] =
    FHIRComponentFieldMeta("issued", lTagOf[ZonedDateTime], false, lTagOf[ZonedDateTime])
  val result: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("result", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val basedOn: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("basedOn", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val subject: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("subject", lTagOf[Reference], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val category: FHIRComponentFieldMeta[NonEmptyLitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("category", lTagOf[NonEmptyLitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
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
  val effective: FHIRComponentFieldMeta[Us_core_diagnosticreport_lab.EffectiveChoice] =
    FHIRComponentFieldMeta(
      "effective",
      lTagOf[Us_core_diagnosticreport_lab.EffectiveChoice],
      true,
      lTagOf[Union_0934386166])
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
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Meta]](meta, t.meta),
      FHIRComponentField[Option[Narrative]](text, t.text),
      FHIRComponentField[CodeableConcept](code, t.code),
      FHIRComponentField[DIAGNOSTIC_REPORT_STATUS](status, t.status),
      FHIRComponentField[ZonedDateTime](issued, t.issued.get),
      FHIRComponentField[LitSeq[Reference]](result, t.result),
      FHIRComponentField[LitSeq[Reference]](basedOn, t.basedOn),
      FHIRComponentField[Reference](subject, t.subject.get),
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[NonEmptyLitSeq[CodeableConcept]](category, t.category.asNonEmpty),
      FHIRComponentField[LitSeq[Reference]](specimen, t.specimen),
      FHIRComponentField[LitSeq[Resource]](contained, t.contained),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Reference]](encounter, t.encounter),
      FHIRComponentField[LitSeq[Reference]](performer, t.performer),
      FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
      FHIRComponentField[Option[String]](conclusion, t.conclusion),
      FHIRComponentField[Us_core_diagnosticreport_lab.EffectiveChoice](effective, t.effective.get),
      FHIRComponentField[LitSeq[Reference]](imagingStudy, t.imagingStudy),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[LitSeq[Attachment]](presentedForm, t.presentedForm),
      FHIRComponentField[LitSeq[CodeableConcept]](conclusionCode, t.conclusionCode),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[Reference]](resultsInterpreter, t.resultsInterpreter),
      FHIRComponentField[LitSeq[DiagnosticReport.Media]](media, t.media)
    ))
  override def fields(t: Us_core_diagnosticreport_lab): Seq[FHIRComponentField[_]]                    = fieldsFromParent(t).get
  def extractId(t: Us_core_diagnosticreport_lab): Option[String]                                      = t.id
  def extractMeta(t: Us_core_diagnosticreport_lab): Option[Meta]                                      = t.meta
  def extractText(t: Us_core_diagnosticreport_lab): Option[Narrative]                                 = t.text
  def extractCode(t: Us_core_diagnosticreport_lab): CodeableConcept                                   = t.code
  def extractStatus(t: Us_core_diagnosticreport_lab): DIAGNOSTIC_REPORT_STATUS                        = t.status
  def extractIssued(t: Us_core_diagnosticreport_lab): ZonedDateTime                                   = t.issued.get
  def extractResult(t: Us_core_diagnosticreport_lab): LitSeq[Reference]                               = t.result
  def extractBasedOn(t: Us_core_diagnosticreport_lab): LitSeq[Reference]                              = t.basedOn
  def extractSubject(t: Us_core_diagnosticreport_lab): Reference                                      = t.subject.get
  def extractLanguage(t: Us_core_diagnosticreport_lab): Option[LANGUAGES]                             = t.language
  def extractCategory(t: Us_core_diagnosticreport_lab): NonEmptyLitSeq[CodeableConcept]               = t.category.asNonEmpty
  def extractSpecimen(t: Us_core_diagnosticreport_lab): LitSeq[Reference]                             = t.specimen
  def extractContained(t: Us_core_diagnosticreport_lab): LitSeq[Resource]                             = t.contained
  def extractExtension(t: Us_core_diagnosticreport_lab): LitSeq[Extension]                            = t.extension
  def extractEncounter(t: Us_core_diagnosticreport_lab): Option[Reference]                            = t.encounter
  def extractPerformer(t: Us_core_diagnosticreport_lab): LitSeq[Reference]                            = t.performer
  def extractIdentifier(t: Us_core_diagnosticreport_lab): LitSeq[Identifier]                          = t.identifier
  def extractConclusion(t: Us_core_diagnosticreport_lab): Option[String]                              = t.conclusion
  def extractEffective(t: Us_core_diagnosticreport_lab): Us_core_diagnosticreport_lab.EffectiveChoice = t.effective.get
  def extractImagingStudy(t: Us_core_diagnosticreport_lab): LitSeq[Reference]                         = t.imagingStudy
  def extractImplicitRules(t: Us_core_diagnosticreport_lab): Option[UriStr]                           = t.implicitRules
  def extractPresentedForm(t: Us_core_diagnosticreport_lab): LitSeq[Attachment]                       = t.presentedForm
  def extractConclusionCode(t: Us_core_diagnosticreport_lab): LitSeq[CodeableConcept]                 = t.conclusionCode
  def extractModifierExtension(t: Us_core_diagnosticreport_lab): LitSeq[Extension]                    = t.modifierExtension
  def extractResultsInterpreter(t: Us_core_diagnosticreport_lab): LitSeq[Reference]                   = t.resultsInterpreter
  def extractMedia(t: Us_core_diagnosticreport_lab): LitSeq[DiagnosticReport.Media]                   = t.media
  override val thisName: String                                                                       = "Us_core_diagnosticreport_lab"
  override val searchParams: Map[String, Us_core_diagnosticreport_lab => Seq[Any]]                    = DiagnosticReport.searchParams
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Us_core_diagnosticreport_lab] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Us_core_diagnosticreport_lab(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[CodeableConcept]("code", None),
          cursor.decodeAs[DIAGNOSTIC_REPORT_STATUS]("status", None),
          cursor.decodeAs[ZonedDateTime]("issued", None),
          cursor.decodeAs[LitSeq[Reference]]("result", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("basedOn", Some(LitSeq.empty)),
          cursor.decodeAs[Reference]("subject", None),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[NonEmptyLitSeq[CodeableConcept]]("category", None),
          cursor.decodeAs[LitSeq[Reference]]("specimen", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("performer", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("conclusion", Some(None)),
          cursor.decodeRef[Union_0934386166]("effective"),
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

/** Defines constraints and extensions on the DiagnosticReport resource  for the minimal set of data to query and retrieve diagnostic reports associated with laboratory results for a patient
  *
  *  Subclass of [[hl7.model.DiagnosticReport]] (The findings and interpretation of diagnostic  tests performed on patients, groups of patients, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting and provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports.)
  *
  * @constructor Inherits all params from parent.
  *              Requires the following fields which were optional in the parent: issued, subject, category, effective.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param code - The test, panel or battery that was ordered.
  * @param status - The status of the diagnostic report.
  * @param issued - The date and time that this version of the report was made available to providers, typically after the report was reviewed and verified.
  * @param result - [Observations](http://hl7.org/fhir/R4/observation.html)  that are part of this diagnostic report.
  * @param basedOn - Details concerning a service requested.
  * @param subject - The subject of the report. Usually, but not always, this is a patient. However, diagnostic services also perform analyses on specimens collected from a variety of other sources.
  * @param language - The base language in which the resource is written.
  * @param category - A code that classifies the clinical discipline, department or diagnostic service that created the report (e.g. cardiology, biochemistry, hematology, MRI). This is used for searching, sorting and display purposes.
  * @param specimen - Details about the specimens on which this diagnostic report is based.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param encounter - The healthcare event  (e.g. a patient and healthcare provider interaction) which this DiagnosticReport is about.
  * @param performer - The diagnostic service that is responsible for issuing the report.
  * @param identifier - Identifiers assigned to this report by the performer or other systems.
  * @param conclusion - Concise and clinically contextualized summary conclusion (interpretation/impression) of the diagnostic report.
  * @param effective - This is the Specimen Collection Datetime or Period which is the physically relevent dateTime for laboratory tests.
  * @param imagingStudy - One or more links to full details of any imaging performed during the diagnostic investigation. Typically, this is imaging performed by DICOM enabled modalities, but this is not required. A fully enabled PACS viewer can use this information to provide views of the source images.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param presentedForm - Rich text representation of the entire result as issued by the diagnostic service. Multiple formats are allowed but they SHALL be semantically equivalent.
  * @param conclusionCode - One or more codes that represent the summary conclusion (interpretation/impression) of the diagnostic report.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param resultsInterpreter - The practitioner or organization that is responsible for the report's conclusions and interpretations.
  * @param media - A list of key images associated with this report. The images are generally created during the diagnostic process, and may be directly of the patient, or of treated specimens (i.e. slides of interest).
  */
@POJOBoilerplate
class Us_core_diagnosticreport_lab(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("http://hl7.org/fhir/us/core/StructureDefinition/us-core-diagnosticreport-lab"))),
    override val text: Option[Narrative] = None,
    override val code: CodeableConcept,
    override val status: DIAGNOSTIC_REPORT_STATUS,
    issued: ZonedDateTime,
    override val result: LitSeq[Reference] = LitSeq.empty,
    override val basedOn: LitSeq[Reference] = LitSeq.empty,
    subject: Reference,
    override val language: Option[LANGUAGES] = None,
    category: NonEmptyLitSeq[CodeableConcept],
    override val specimen: LitSeq[Reference] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val encounter: Option[Reference] = None,
    override val performer: LitSeq[Reference] = LitSeq.empty,
    override val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val conclusion: Option[String] = None,
    effective: Us_core_diagnosticreport_lab.EffectiveChoice,
    override val imagingStudy: LitSeq[Reference] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    override val presentedForm: LitSeq[Attachment] = LitSeq.empty,
    override val conclusionCode: LitSeq[CodeableConcept] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val resultsInterpreter: LitSeq[Reference] = LitSeq.empty,
    override val media: LitSeq[DiagnosticReport.Media] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends DiagnosticReport(
      id = id,
      meta = meta,
      text = text,
      code = code,
      status = status,
      issued = Some(issued),
      result = result,
      basedOn = basedOn,
      subject = Some(subject),
      language = language,
      category = category.refine,
      specimen = specimen,
      contained = contained,
      extension = extension,
      encounter = encounter,
      performer = performer,
      identifier = identifier,
      conclusion = conclusion,
      effective = Some(effective),
      imagingStudy = imagingStudy,
      implicitRules = implicitRules,
      presentedForm = presentedForm,
      conclusionCode = conclusionCode,
      modifierExtension = modifierExtension,
      resultsInterpreter = resultsInterpreter,
      media = media,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "DiagnosticReport"
}
