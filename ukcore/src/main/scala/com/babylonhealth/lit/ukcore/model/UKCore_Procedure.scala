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
import com.babylonhealth.lit.hl7.EVENT_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, ukcore }
import com.babylonhealth.lit.macros.POJOBoilerplate

object UKCore_Procedure extends CompanionFor[UKCore_Procedure] {
  implicit def summonObjectAndCompanionUKCore_Procedure1727305220(
      o: UKCore_Procedure): ObjectAndCompanion[UKCore_Procedure, UKCore_Procedure.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Procedure
  override type ParentType   = Procedure
  override val baseType: CompanionFor[ResourceType] = Procedure
  override val parentType: CompanionFor[ParentType] = Procedure
  override val profileUrl: Option[String]           = Some("https://fhir.hl7.org.uk/StructureDefinition/UKCore-Procedure")
  type PerformedChoice = Choice[Union01474038381]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-Procedure"))),
      text: Option[Narrative] = None,
      partOf: LitSeq[Reference] = LitSeq.empty,
      status: EVENT_STATUS,
      report: LitSeq[Reference] = LitSeq.empty,
      basedOn: LitSeq[Reference] = LitSeq.empty,
      subject: Reference,
      outcome: Option[CodeableConcept] = None,
      language: Option[LANGUAGES] = None,
      category: Option[CodeableConcept] = None,
      recorder: Option[Reference] = None,
      asserter: Option[Reference] = None,
      location: Option[Reference] = None,
      followUp: LitSeq[CodeableConcept] = LitSeq.empty,
      usedCode: LitSeq[CodeableConcept] = LitSeq.empty,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      encounter: Option[Reference] = None,
      reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
      statusReason: Option[CodeableConcept] = None,
      performed: Option[UKCore_Procedure.PerformedChoice] = None,
      implicitRules: Option[UriStr] = None,
      usedReference: LitSeq[Reference] = LitSeq.empty,
      code: Option[CodeableConcept] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      instantiatesUri: LitSeq[UriStr] = LitSeq.empty,
      reasonReference: LitSeq[Reference] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      bodySite: LitSeq[CodeableConcept] = LitSeq.empty,
      complicationDetail: LitSeq[Reference] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      instantiatesCanonical: LitSeq[Canonical] = LitSeq.empty,
      complication: LitSeq[CodeableConcept] = LitSeq.empty,
      performer: LitSeq[Procedure.Performer] = LitSeq.empty,
      focalDevice: LitSeq[Procedure.FocalDevice] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): UKCore_Procedure = new UKCore_Procedure(
    id,
    meta,
    text,
    partOf,
    status,
    report,
    basedOn,
    subject,
    outcome,
    language,
    category,
    recorder,
    asserter,
    location,
    followUp,
    usedCode,
    contained,
    extension,
    encounter,
    reasonCode,
    statusReason,
    performed,
    implicitRules,
    usedReference,
    code,
    note,
    instantiatesUri,
    reasonReference,
    modifierExtension,
    bodySite,
    complicationDetail,
    identifier,
    instantiatesCanonical,
    complication,
    performer,
    focalDevice,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val partOf: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("partOf", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val status: FHIRComponentFieldMeta[EVENT_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[EVENT_STATUS], false, lTagOf[EVENT_STATUS])
  val report: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("report", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val basedOn: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("basedOn", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val subject: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("subject", lTagOf[Reference], false, lTagOf[Reference])
  val outcome: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("outcome", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val category: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("category", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val recorder: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("recorder", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val asserter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("asserter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val location: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("location", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val followUp: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("followUp", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val usedCode: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("usedCode", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val encounter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("encounter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val reasonCode: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("reasonCode", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val statusReason: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("statusReason", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val performed: FHIRComponentFieldMeta[Option[UKCore_Procedure.PerformedChoice]] =
    FHIRComponentFieldMeta("performed", lTagOf[Option[UKCore_Procedure.PerformedChoice]], true, lTagOf[Union01474038381])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val usedReference: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("usedReference", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val code: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("code", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val instantiatesUri: FHIRComponentFieldMeta[LitSeq[UriStr]] =
    FHIRComponentFieldMeta("instantiatesUri", lTagOf[LitSeq[UriStr]], false, lTagOf[UriStr])
  val reasonReference: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("reasonReference", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val bodySite: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("bodySite", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val complicationDetail: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("complicationDetail", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val instantiatesCanonical: FHIRComponentFieldMeta[LitSeq[Canonical]] =
    FHIRComponentFieldMeta("instantiatesCanonical", lTagOf[LitSeq[Canonical]], false, lTagOf[Canonical])
  val complication: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("complication", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val performer: FHIRComponentFieldMeta[LitSeq[Procedure.Performer]] =
    FHIRComponentFieldMeta("performer", lTagOf[LitSeq[Procedure.Performer]], false, lTagOf[Procedure.Performer])
  val focalDevice: FHIRComponentFieldMeta[LitSeq[Procedure.FocalDevice]] =
    FHIRComponentFieldMeta("focalDevice", lTagOf[LitSeq[Procedure.FocalDevice]], false, lTagOf[Procedure.FocalDevice])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    partOf,
    status,
    report,
    basedOn,
    subject,
    outcome,
    language,
    category,
    recorder,
    asserter,
    location,
    followUp,
    usedCode,
    contained,
    extension,
    encounter,
    reasonCode,
    statusReason,
    performed,
    implicitRules,
    usedReference,
    code,
    note,
    instantiatesUri,
    reasonReference,
    modifierExtension,
    bodySite,
    complicationDetail,
    identifier,
    instantiatesCanonical,
    complication,
    performer,
    focalDevice
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Meta]](meta, t.meta),
      FHIRComponentField[Option[Narrative]](text, t.text),
      FHIRComponentField[LitSeq[Reference]](partOf, t.partOf),
      FHIRComponentField[EVENT_STATUS](status, t.status),
      FHIRComponentField[LitSeq[Reference]](report, t.report),
      FHIRComponentField[LitSeq[Reference]](basedOn, t.basedOn),
      FHIRComponentField[Reference](subject, t.subject),
      FHIRComponentField[Option[CodeableConcept]](outcome, t.outcome),
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[Option[CodeableConcept]](category, t.category),
      FHIRComponentField[Option[Reference]](recorder, t.recorder),
      FHIRComponentField[Option[Reference]](asserter, t.asserter),
      FHIRComponentField[Option[Reference]](location, t.location),
      FHIRComponentField[LitSeq[CodeableConcept]](followUp, t.followUp),
      FHIRComponentField[LitSeq[CodeableConcept]](usedCode, t.usedCode),
      FHIRComponentField[LitSeq[Resource]](contained, t.contained),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Reference]](encounter, t.encounter),
      FHIRComponentField[LitSeq[CodeableConcept]](reasonCode, t.reasonCode),
      FHIRComponentField[Option[CodeableConcept]](statusReason, t.statusReason),
      FHIRComponentField[Option[UKCore_Procedure.PerformedChoice]](performed, t.performed),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[LitSeq[Reference]](usedReference, t.usedReference),
      FHIRComponentField[Option[CodeableConcept]](code, t.code),
      FHIRComponentField[LitSeq[Annotation]](note, t.note),
      FHIRComponentField[LitSeq[UriStr]](instantiatesUri, t.instantiatesUri),
      FHIRComponentField[LitSeq[Reference]](reasonReference, t.reasonReference),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[CodeableConcept]](bodySite, t.bodySite),
      FHIRComponentField[LitSeq[Reference]](complicationDetail, t.complicationDetail),
      FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
      FHIRComponentField[LitSeq[Canonical]](instantiatesCanonical, t.instantiatesCanonical),
      FHIRComponentField[LitSeq[CodeableConcept]](complication, t.complication),
      FHIRComponentField[LitSeq[Procedure.Performer]](performer, t.performer),
      FHIRComponentField[LitSeq[Procedure.FocalDevice]](focalDevice, t.focalDevice)
    ))
  override def fields(t: UKCore_Procedure): Seq[FHIRComponentField[_]]                = fieldsFromParent(t).get
  def extractId(t: UKCore_Procedure): Option[String]                                  = t.id
  def extractMeta(t: UKCore_Procedure): Option[Meta]                                  = t.meta
  def extractText(t: UKCore_Procedure): Option[Narrative]                             = t.text
  def extractPartOf(t: UKCore_Procedure): LitSeq[Reference]                           = t.partOf
  def extractStatus(t: UKCore_Procedure): EVENT_STATUS                                = t.status
  def extractReport(t: UKCore_Procedure): LitSeq[Reference]                           = t.report
  def extractBasedOn(t: UKCore_Procedure): LitSeq[Reference]                          = t.basedOn
  def extractSubject(t: UKCore_Procedure): Reference                                  = t.subject
  def extractOutcome(t: UKCore_Procedure): Option[CodeableConcept]                    = t.outcome
  def extractLanguage(t: UKCore_Procedure): Option[LANGUAGES]                         = t.language
  def extractCategory(t: UKCore_Procedure): Option[CodeableConcept]                   = t.category
  def extractRecorder(t: UKCore_Procedure): Option[Reference]                         = t.recorder
  def extractAsserter(t: UKCore_Procedure): Option[Reference]                         = t.asserter
  def extractLocation(t: UKCore_Procedure): Option[Reference]                         = t.location
  def extractFollowUp(t: UKCore_Procedure): LitSeq[CodeableConcept]                   = t.followUp
  def extractUsedCode(t: UKCore_Procedure): LitSeq[CodeableConcept]                   = t.usedCode
  def extractContained(t: UKCore_Procedure): LitSeq[Resource]                         = t.contained
  def extractExtension(t: UKCore_Procedure): LitSeq[Extension]                        = t.extension
  def extractEncounter(t: UKCore_Procedure): Option[Reference]                        = t.encounter
  def extractReasonCode(t: UKCore_Procedure): LitSeq[CodeableConcept]                 = t.reasonCode
  def extractStatusReason(t: UKCore_Procedure): Option[CodeableConcept]               = t.statusReason
  def extractPerformed(t: UKCore_Procedure): Option[UKCore_Procedure.PerformedChoice] = t.performed
  def extractImplicitRules(t: UKCore_Procedure): Option[UriStr]                       = t.implicitRules
  def extractUsedReference(t: UKCore_Procedure): LitSeq[Reference]                    = t.usedReference
  def extractCode(t: UKCore_Procedure): Option[CodeableConcept]                       = t.code
  def extractNote(t: UKCore_Procedure): LitSeq[Annotation]                            = t.note
  def extractInstantiatesUri(t: UKCore_Procedure): LitSeq[UriStr]                     = t.instantiatesUri
  def extractReasonReference(t: UKCore_Procedure): LitSeq[Reference]                  = t.reasonReference
  def extractModifierExtension(t: UKCore_Procedure): LitSeq[Extension]                = t.modifierExtension
  def extractBodySite(t: UKCore_Procedure): LitSeq[CodeableConcept]                   = t.bodySite
  def extractComplicationDetail(t: UKCore_Procedure): LitSeq[Reference]               = t.complicationDetail
  def extractIdentifier(t: UKCore_Procedure): LitSeq[Identifier]                      = t.identifier
  def extractInstantiatesCanonical(t: UKCore_Procedure): LitSeq[Canonical]            = t.instantiatesCanonical
  def extractComplication(t: UKCore_Procedure): LitSeq[CodeableConcept]               = t.complication
  def extractPerformer(t: UKCore_Procedure): LitSeq[Procedure.Performer]              = t.performer
  def extractFocalDevice(t: UKCore_Procedure): LitSeq[Procedure.FocalDevice]          = t.focalDevice
  override val thisName: String                                                       = "UKCore_Procedure"
  override val searchParams: Map[String, UKCore_Procedure => Seq[Any]]                = Procedure.searchParams
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[UKCore_Procedure] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new UKCore_Procedure(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("partOf", Some(LitSeq.empty)),
          cursor.decodeAs[EVENT_STATUS]("status", None),
          cursor.decodeAs[LitSeq[Reference]]("report", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("basedOn", Some(LitSeq.empty)),
          cursor.decodeAs[Reference]("subject", None),
          cursor.decodeAs[Option[CodeableConcept]]("outcome", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("category", Some(None)),
          cursor.decodeAs[Option[Reference]]("recorder", Some(None)),
          cursor.decodeAs[Option[Reference]]("asserter", Some(None)),
          cursor.decodeAs[Option[Reference]]("location", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("followUp", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("usedCode", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("reasonCode", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("statusReason", Some(None)),
          cursor.decodeOptRef[Union01474038381]("performed"),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("usedReference", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("code", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[UriStr]]("instantiatesUri", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("reasonReference", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("bodySite", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("complicationDetail", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Canonical]]("instantiatesCanonical", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("complication", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Procedure.Performer]]("performer", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Procedure.FocalDevice]]("focalDevice", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Defines the UK Core constraints and extensions on the Procedure resource for the minimal set of data to query and retrieve the
  * patient’s procedure information.
  *
  * Subclass of [[hl7.model.Procedure]] (An action that is or was performed on or for a patient. This can be a physical
  * intervention like an operation, or less invasive like long term services, counseling, or hypnotherapy.)
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
  * @param partOf
  *   - A larger event of which this particular procedure is a component or step.
  * @param status
  *   - A code specifying the state of the procedure. Generally, this will be the in-progress or completed state.
  * @param report
  *   - This could be a histology result, pathology report, surgical report, etc.
  * @param basedOn
  *   - A reference to a resource that contains details of the request for this procedure.
  * @param subject
  *   - The person, animal or group on which the procedure was performed.
  * @param outcome
  *   - The outcome of the procedure - did it resolve the reasons for the procedure being performed?
  * @param language
  *   - The base language in which the resource is written.
  * @param category
  *   - A code that classifies the procedure for searching, sorting and display purposes (e.g. "Surgical Procedure").
  * @param recorder
  *   - Individual who recorded the record and takes responsibility for its content.
  * @param asserter
  *   - Individual who is making the procedure statement.
  * @param location
  *   - The location where the procedure actually happened. E.g. a newborn at home, a tracheostomy at a restaurant.
  * @param followUp
  *   - If the procedure required specific follow up - e.g. removal of sutures. The follow up may be represented as a simple note
  *     or could potentially be more complex, in which case the CarePlan resource can be used.
  * @param usedCode
  *   - Identifies coded items that were used as part of the procedure.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *     identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *     of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *     Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *     of the extension.
  * @param encounter
  *   - The Encounter during which this Procedure was created or performed or to which the creation of this record is tightly
  *     associated.
  * @param reasonCode
  *   - The coded reason why the procedure was performed. This may be a coded entity of some type, or may simply be present as
  *     text.
  * @param statusReason
  *   - Captures the reason for the current state of the procedure.
  * @param performed
  *   - Estimated or actual date, date-time, period, or age when the procedure was performed. Allows a period to support complex
  *     procedures that span more than one date, and also allows for the length of the procedure to be captured.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *     processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *     other profiles etc.
  * @param usedReference
  *   - Identifies medications, devices and any other substance used as part of the procedure.
  * @param code
  *   - The specific procedure that is performed. Use text if the exact nature of the procedure cannot be coded (e.g.
  *     "Laparoscopic Appendectomy").
  * @param note
  *   - Any other notes and comments about the procedure.
  * @param instantiatesUri
  *   - The URL pointing to an externally maintained protocol, guideline, order set or other definition that is adhered to in
  *     whole or in part by this Procedure.
  * @param reasonReference
  *   - The justification of why the procedure was performed.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *     the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *     Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *     strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *     extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *     processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of
  *     any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param bodySite
  *   - Detailed and structured anatomical location information. Multiple locations are allowed - e.g. multiple punch biopsies of
  *     a lesion.
  * @param complicationDetail
  *   - Any complications that occurred during the procedure, or in the immediate post-performance period.
  * @param identifier
  *   - Business identifiers assigned to this procedure by the performer or other systems which remain constant as the resource is
  *     updated and is propagated from server to server.
  * @param instantiatesCanonical
  *   - The URL pointing to a FHIR-defined protocol, guideline, order set or other definition that is adhered to in whole or in
  *     part by this Procedure.
  * @param complication
  *   - Any complications that occurred during the procedure, or in the immediate post-performance period. These are generally
  *     tracked separately from the notes, which will typically describe the procedure itself rather than any 'post procedure'
  *     issues.
  * @param performer
  *   - Limited to "real" people rather than equipment.
  * @param focalDevice
  *   - A device that is implanted, removed or otherwise manipulated (calibration, battery replacement, fitting a prosthesis,
  *     attaching a wound-vac, etc.) as a focal portion of the Procedure.
  */
@POJOBoilerplate
class UKCore_Procedure(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-Procedure"))),
    override val text: Option[Narrative] = None,
    override val partOf: LitSeq[Reference] = LitSeq.empty,
    override val status: EVENT_STATUS,
    override val report: LitSeq[Reference] = LitSeq.empty,
    override val basedOn: LitSeq[Reference] = LitSeq.empty,
    override val subject: Reference,
    override val outcome: Option[CodeableConcept] = None,
    override val language: Option[LANGUAGES] = None,
    override val category: Option[CodeableConcept] = None,
    override val recorder: Option[Reference] = None,
    override val asserter: Option[Reference] = None,
    override val location: Option[Reference] = None,
    override val followUp: LitSeq[CodeableConcept] = LitSeq.empty,
    override val usedCode: LitSeq[CodeableConcept] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val encounter: Option[Reference] = None,
    override val reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
    override val statusReason: Option[CodeableConcept] = None,
    override val performed: Option[UKCore_Procedure.PerformedChoice] = None,
    override val implicitRules: Option[UriStr] = None,
    override val usedReference: LitSeq[Reference] = LitSeq.empty,
    override val code: Option[CodeableConcept] = None,
    override val note: LitSeq[Annotation] = LitSeq.empty,
    override val instantiatesUri: LitSeq[UriStr] = LitSeq.empty,
    override val reasonReference: LitSeq[Reference] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val bodySite: LitSeq[CodeableConcept] = LitSeq.empty,
    override val complicationDetail: LitSeq[Reference] = LitSeq.empty,
    override val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val instantiatesCanonical: LitSeq[Canonical] = LitSeq.empty,
    override val complication: LitSeq[CodeableConcept] = LitSeq.empty,
    override val performer: LitSeq[Procedure.Performer] = LitSeq.empty,
    override val focalDevice: LitSeq[Procedure.FocalDevice] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Procedure(
      id = id,
      meta = meta,
      text = text,
      code = code,
      note = note,
      partOf = partOf,
      status = status,
      report = report,
      basedOn = basedOn,
      subject = subject,
      outcome = outcome,
      language = language,
      category = category,
      recorder = recorder,
      asserter = asserter,
      location = location,
      bodySite = bodySite,
      followUp = followUp,
      usedCode = usedCode,
      contained = contained,
      extension = extension,
      encounter = encounter,
      identifier = identifier,
      reasonCode = reasonCode,
      statusReason = statusReason,
      performed = performed,
      complication = complication,
      implicitRules = implicitRules,
      usedReference = usedReference,
      instantiatesUri = instantiatesUri,
      reasonReference = reasonReference,
      modifierExtension = modifierExtension,
      complicationDetail = complicationDetail,
      instantiatesCanonical = instantiatesCanonical,
      performer = performer,
      focalDevice = focalDevice,
      primitiveAttributes = primitiveAttributes
    ) {
  override val thisTypeName: String = "Procedure"
}
