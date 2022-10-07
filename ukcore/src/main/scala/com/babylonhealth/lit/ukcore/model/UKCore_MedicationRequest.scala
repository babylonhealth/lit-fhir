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
import com.babylonhealth.lit.hl7.{
  REQUEST_INTENT,
  MEDICATIONREQUEST_INTENT,
  REQUEST_STATUS,
  REQUEST_PRIORITY,
  MEDICATIONREQUEST_STATUS
}
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, ukcore }
import com.babylonhealth.lit.macros.POJOBoilerplate

object UKCore_MedicationRequest extends CompanionFor[UKCore_MedicationRequest] {
  implicit def summonObjectAndCompanionUKCore_MedicationRequest_1747969295(
      o: UKCore_MedicationRequest): ObjectAndCompanion[UKCore_MedicationRequest, UKCore_MedicationRequest.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = MedicationRequest
  override type ParentType   = MedicationRequest
  override val baseType: CompanionFor[ResourceType] = MedicationRequest
  override val parentType: CompanionFor[ParentType] = MedicationRequest
  override val profileUrl: Option[String]           = Some("https://fhir.hl7.org.uk/StructureDefinition/UKCore-MedicationRequest")
  type ReportedChoice   = Choice[UnionBooleanOrReference]
  type MedicationChoice = Choice[UnionCodeableConceptOrReference]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(
        new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-MedicationRequest"))),
      text: Option[Narrative] = None,
      status: MEDICATIONREQUEST_STATUS,
      intent: MEDICATIONREQUEST_INTENT,
      language: Option[LANGUAGES] = None,
      category: LitSeq[CodeableConcept] = LitSeq.empty,
      priority: Option[REQUEST_PRIORITY] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      authoredOn: Option[FHIRDateTime] = None,
      reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
      reported: Option[UKCore_MedicationRequest.ReportedChoice] = None,
      statusReason: Option[CodeableConcept] = None,
      doNotPerform: Option[Boolean] = None,
      implicitRules: Option[UriStr] = None,
      medication: UKCore_MedicationRequest.MedicationChoice,
      performerType: Option[CodeableConcept] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      instantiatesUri: LitSeq[UriStr] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      courseOfTherapyType: Option[CodeableConcept] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      instantiatesCanonical: LitSeq[Canonical] = LitSeq.empty,
      groupIdentifier: Option[Identifier] = None,
      subject: Reference,
      basedOn: LitSeq[Reference] = LitSeq.empty,
      recorder: Option[Reference] = None,
      encounter: Option[Reference] = None,
      requester: Option[Reference] = None,
      performer: Option[Reference] = None,
      insurance: LitSeq[Reference] = LitSeq.empty,
      substitution: MedicationRequest.Substitution,
      eventHistory: LitSeq[Reference] = LitSeq.empty,
      detectedIssue: LitSeq[Reference] = LitSeq.empty,
      reasonReference: LitSeq[Reference] = LitSeq.empty,
      priorPrescription: Option[Reference] = None,
      supportingInformation: LitSeq[Reference] = LitSeq.empty,
      dosageInstruction: LitSeq[Dosage] = LitSeq.empty,
      dispenseRequest: Option[MedicationRequest.DispenseRequest] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): UKCore_MedicationRequest = new UKCore_MedicationRequest(
    id,
    meta,
    text,
    status,
    intent,
    language,
    category,
    priority,
    contained,
    extension,
    authoredOn,
    reasonCode,
    reported,
    statusReason,
    doNotPerform,
    implicitRules,
    medication,
    performerType,
    note,
    instantiatesUri,
    modifierExtension,
    courseOfTherapyType,
    identifier,
    instantiatesCanonical,
    groupIdentifier,
    subject,
    basedOn,
    recorder,
    encounter,
    requester,
    performer,
    insurance,
    substitution,
    eventHistory,
    detectedIssue,
    reasonReference,
    priorPrescription,
    supportingInformation,
    dosageInstruction,
    dispenseRequest,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val status: FHIRComponentFieldMeta[MEDICATIONREQUEST_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[MEDICATIONREQUEST_STATUS], false, lTagOf[MEDICATIONREQUEST_STATUS])
  val intent: FHIRComponentFieldMeta[MEDICATIONREQUEST_INTENT] =
    FHIRComponentFieldMeta("intent", lTagOf[MEDICATIONREQUEST_INTENT], false, lTagOf[MEDICATIONREQUEST_INTENT])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val category: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("category", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val priority: FHIRComponentFieldMeta[Option[REQUEST_PRIORITY]] =
    FHIRComponentFieldMeta("priority", lTagOf[Option[REQUEST_PRIORITY]], false, lTagOf[REQUEST_PRIORITY])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val authoredOn: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("authoredOn", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val reasonCode: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("reasonCode", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val reported: FHIRComponentFieldMeta[Option[UKCore_MedicationRequest.ReportedChoice]] =
    FHIRComponentFieldMeta(
      "reported",
      lTagOf[Option[UKCore_MedicationRequest.ReportedChoice]],
      true,
      lTagOf[UnionBooleanOrReference])
  val statusReason: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("statusReason", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val doNotPerform: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("doNotPerform", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val medication: FHIRComponentFieldMeta[UKCore_MedicationRequest.MedicationChoice] =
    FHIRComponentFieldMeta(
      "medication",
      lTagOf[UKCore_MedicationRequest.MedicationChoice],
      true,
      lTagOf[UnionCodeableConceptOrReference])
  val performerType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("performerType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val instantiatesUri: FHIRComponentFieldMeta[LitSeq[UriStr]] =
    FHIRComponentFieldMeta("instantiatesUri", lTagOf[LitSeq[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val courseOfTherapyType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("courseOfTherapyType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val instantiatesCanonical: FHIRComponentFieldMeta[LitSeq[Canonical]] =
    FHIRComponentFieldMeta("instantiatesCanonical", lTagOf[LitSeq[Canonical]], false, lTagOf[Canonical])
  val groupIdentifier: FHIRComponentFieldMeta[Option[Identifier]] =
    FHIRComponentFieldMeta("groupIdentifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
  val subject: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("subject", lTagOf[Reference], false, lTagOf[Reference])
  val basedOn: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("basedOn", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val recorder: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("recorder", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val encounter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("encounter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val requester: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("requester", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val performer: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("performer", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val insurance: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("insurance", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val substitution: FHIRComponentFieldMeta[MedicationRequest.Substitution] =
    FHIRComponentFieldMeta("substitution", lTagOf[MedicationRequest.Substitution], false, lTagOf[MedicationRequest.Substitution])
  val eventHistory: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("eventHistory", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val detectedIssue: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("detectedIssue", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val reasonReference: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("reasonReference", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val priorPrescription: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("priorPrescription", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val supportingInformation: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("supportingInformation", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val dosageInstruction: FHIRComponentFieldMeta[LitSeq[Dosage]] =
    FHIRComponentFieldMeta("dosageInstruction", lTagOf[LitSeq[Dosage]], false, lTagOf[Dosage])
  val dispenseRequest: FHIRComponentFieldMeta[Option[MedicationRequest.DispenseRequest]] =
    FHIRComponentFieldMeta(
      "dispenseRequest",
      lTagOf[Option[MedicationRequest.DispenseRequest]],
      false,
      lTagOf[MedicationRequest.DispenseRequest])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    status,
    intent,
    language,
    category,
    priority,
    contained,
    extension,
    authoredOn,
    reasonCode,
    reported,
    statusReason,
    doNotPerform,
    implicitRules,
    medication,
    performerType,
    note,
    instantiatesUri,
    modifierExtension,
    courseOfTherapyType,
    identifier,
    instantiatesCanonical,
    groupIdentifier,
    subject,
    basedOn,
    recorder,
    encounter,
    requester,
    performer,
    insurance,
    substitution,
    eventHistory,
    detectedIssue,
    reasonReference,
    priorPrescription,
    supportingInformation,
    dosageInstruction,
    dispenseRequest
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Meta]](meta, t.meta),
      FHIRComponentField[Option[Narrative]](text, t.text),
      FHIRComponentField[MEDICATIONREQUEST_STATUS](status, t.status),
      FHIRComponentField[MEDICATIONREQUEST_INTENT](intent, t.intent),
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[LitSeq[CodeableConcept]](category, t.category),
      FHIRComponentField[Option[REQUEST_PRIORITY]](priority, t.priority),
      FHIRComponentField[LitSeq[Resource]](contained, t.contained),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[FHIRDateTime]](authoredOn, t.authoredOn),
      FHIRComponentField[LitSeq[CodeableConcept]](reasonCode, t.reasonCode),
      FHIRComponentField[Option[UKCore_MedicationRequest.ReportedChoice]](reported, t.reported),
      FHIRComponentField[Option[CodeableConcept]](statusReason, t.statusReason),
      FHIRComponentField[Option[Boolean]](doNotPerform, t.doNotPerform),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[UKCore_MedicationRequest.MedicationChoice](medication, t.medication),
      FHIRComponentField[Option[CodeableConcept]](performerType, t.performerType),
      FHIRComponentField[LitSeq[Annotation]](note, t.note),
      FHIRComponentField[LitSeq[UriStr]](instantiatesUri, t.instantiatesUri),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[CodeableConcept]](courseOfTherapyType, t.courseOfTherapyType),
      FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
      FHIRComponentField[LitSeq[Canonical]](instantiatesCanonical, t.instantiatesCanonical),
      FHIRComponentField[Option[Identifier]](groupIdentifier, t.groupIdentifier),
      FHIRComponentField[Reference](subject, t.subject),
      FHIRComponentField[LitSeq[Reference]](basedOn, t.basedOn),
      FHIRComponentField[Option[Reference]](recorder, t.recorder),
      FHIRComponentField[Option[Reference]](encounter, t.encounter),
      FHIRComponentField[Option[Reference]](requester, t.requester),
      FHIRComponentField[Option[Reference]](performer, t.performer),
      FHIRComponentField[LitSeq[Reference]](insurance, t.insurance),
      FHIRComponentField[MedicationRequest.Substitution](substitution, t.substitution.get),
      FHIRComponentField[LitSeq[Reference]](eventHistory, t.eventHistory),
      FHIRComponentField[LitSeq[Reference]](detectedIssue, t.detectedIssue),
      FHIRComponentField[LitSeq[Reference]](reasonReference, t.reasonReference),
      FHIRComponentField[Option[Reference]](priorPrescription, t.priorPrescription),
      FHIRComponentField[LitSeq[Reference]](supportingInformation, t.supportingInformation),
      FHIRComponentField[LitSeq[Dosage]](dosageInstruction, t.dosageInstruction),
      FHIRComponentField[Option[MedicationRequest.DispenseRequest]](dispenseRequest, t.dispenseRequest)
    ))
  override def fields(t: UKCore_MedicationRequest): Seq[FHIRComponentField[_]]                       = fieldsFromParent(t).get
  def extractId(t: UKCore_MedicationRequest): Option[String]                                         = t.id
  def extractMeta(t: UKCore_MedicationRequest): Option[Meta]                                         = t.meta
  def extractText(t: UKCore_MedicationRequest): Option[Narrative]                                    = t.text
  def extractStatus(t: UKCore_MedicationRequest): MEDICATIONREQUEST_STATUS                           = t.status
  def extractIntent(t: UKCore_MedicationRequest): MEDICATIONREQUEST_INTENT                           = t.intent
  def extractLanguage(t: UKCore_MedicationRequest): Option[LANGUAGES]                                = t.language
  def extractCategory(t: UKCore_MedicationRequest): LitSeq[CodeableConcept]                          = t.category
  def extractPriority(t: UKCore_MedicationRequest): Option[REQUEST_PRIORITY]                         = t.priority
  def extractContained(t: UKCore_MedicationRequest): LitSeq[Resource]                                = t.contained
  def extractExtension(t: UKCore_MedicationRequest): LitSeq[Extension]                               = t.extension
  def extractAuthoredOn(t: UKCore_MedicationRequest): Option[FHIRDateTime]                           = t.authoredOn
  def extractReasonCode(t: UKCore_MedicationRequest): LitSeq[CodeableConcept]                        = t.reasonCode
  def extractReported(t: UKCore_MedicationRequest): Option[UKCore_MedicationRequest.ReportedChoice]  = t.reported
  def extractStatusReason(t: UKCore_MedicationRequest): Option[CodeableConcept]                      = t.statusReason
  def extractDoNotPerform(t: UKCore_MedicationRequest): Option[Boolean]                              = t.doNotPerform
  def extractImplicitRules(t: UKCore_MedicationRequest): Option[UriStr]                              = t.implicitRules
  def extractMedication(t: UKCore_MedicationRequest): UKCore_MedicationRequest.MedicationChoice      = t.medication
  def extractPerformerType(t: UKCore_MedicationRequest): Option[CodeableConcept]                     = t.performerType
  def extractNote(t: UKCore_MedicationRequest): LitSeq[Annotation]                                   = t.note
  def extractInstantiatesUri(t: UKCore_MedicationRequest): LitSeq[UriStr]                            = t.instantiatesUri
  def extractModifierExtension(t: UKCore_MedicationRequest): LitSeq[Extension]                       = t.modifierExtension
  def extractCourseOfTherapyType(t: UKCore_MedicationRequest): Option[CodeableConcept]               = t.courseOfTherapyType
  def extractIdentifier(t: UKCore_MedicationRequest): LitSeq[Identifier]                             = t.identifier
  def extractInstantiatesCanonical(t: UKCore_MedicationRequest): LitSeq[Canonical]                   = t.instantiatesCanonical
  def extractGroupIdentifier(t: UKCore_MedicationRequest): Option[Identifier]                        = t.groupIdentifier
  def extractSubject(t: UKCore_MedicationRequest): Reference                                         = t.subject
  def extractBasedOn(t: UKCore_MedicationRequest): LitSeq[Reference]                                 = t.basedOn
  def extractRecorder(t: UKCore_MedicationRequest): Option[Reference]                                = t.recorder
  def extractEncounter(t: UKCore_MedicationRequest): Option[Reference]                               = t.encounter
  def extractRequester(t: UKCore_MedicationRequest): Option[Reference]                               = t.requester
  def extractPerformer(t: UKCore_MedicationRequest): Option[Reference]                               = t.performer
  def extractInsurance(t: UKCore_MedicationRequest): LitSeq[Reference]                               = t.insurance
  def extractSubstitution(t: UKCore_MedicationRequest): MedicationRequest.Substitution               = t.substitution.get
  def extractEventHistory(t: UKCore_MedicationRequest): LitSeq[Reference]                            = t.eventHistory
  def extractDetectedIssue(t: UKCore_MedicationRequest): LitSeq[Reference]                           = t.detectedIssue
  def extractReasonReference(t: UKCore_MedicationRequest): LitSeq[Reference]                         = t.reasonReference
  def extractPriorPrescription(t: UKCore_MedicationRequest): Option[Reference]                       = t.priorPrescription
  def extractSupportingInformation(t: UKCore_MedicationRequest): LitSeq[Reference]                   = t.supportingInformation
  def extractDosageInstruction(t: UKCore_MedicationRequest): LitSeq[Dosage]                          = t.dosageInstruction
  def extractDispenseRequest(t: UKCore_MedicationRequest): Option[MedicationRequest.DispenseRequest] = t.dispenseRequest
  override val thisName: String                                                                      = "UKCore_MedicationRequest"
  override val searchParams: Map[String, UKCore_MedicationRequest => Seq[Any]] = MedicationRequest.searchParams
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[UKCore_MedicationRequest] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new UKCore_MedicationRequest(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[MEDICATIONREQUEST_STATUS]("status", None),
          cursor.decodeAs[MEDICATIONREQUEST_INTENT]("intent", None),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("category", Some(LitSeq.empty)),
          cursor.decodeAs[Option[REQUEST_PRIORITY]]("priority", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[FHIRDateTime]]("authoredOn", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("reasonCode", Some(LitSeq.empty)),
          cursor.decodeOptRef[UnionBooleanOrReference]("reported"),
          cursor.decodeAs[Option[CodeableConcept]]("statusReason", Some(None)),
          cursor.decodeAs[Option[Boolean]]("doNotPerform", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeRef[UnionCodeableConceptOrReference]("medication"),
          cursor.decodeAs[Option[CodeableConcept]]("performerType", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[UriStr]]("instantiatesUri", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("courseOfTherapyType", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Canonical]]("instantiatesCanonical", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Identifier]]("groupIdentifier", Some(None)),
          cursor.decodeAs[Reference]("subject", None),
          cursor.decodeAs[LitSeq[Reference]]("basedOn", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("recorder", Some(None)),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          cursor.decodeAs[Option[Reference]]("requester", Some(None)),
          cursor.decodeAs[Option[Reference]]("performer", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("insurance", Some(LitSeq.empty)),
          cursor.decodeAs[MedicationRequest.Substitution]("substitution", None),
          cursor.decodeAs[LitSeq[Reference]]("eventHistory", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("detectedIssue", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("reasonReference", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("priorPrescription", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("supportingInformation", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Dosage]]("dosageInstruction", Some(LitSeq.empty)),
          cursor.decodeAs[Option[MedicationRequest.DispenseRequest]]("dispenseRequest", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** Defines the UK Core constraints and extensions on the MedicationRequest resource for the minimal set of data to query and
  * retrieve prescription information.
  *
  * Subclass of [[hl7.model.MedicationRequest]] (An order or request for both supply of the medication and the instructions for
  * administration of the medication to a patient. The resource is called "MedicationRequest" rather than "MedicationPrescription"
  * or "MedicationOrder" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to
  * harmonize with workflow patterns.)
  *
  * @constructor
  *   Inherits all params from parent. Requires the following fields which were optional in the parent: substitution.
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
  *   - A code specifying the current state of the order. Generally, this will be active or completed state.
  * @param intent
  *   - Whether the request is a proposal, plan, or an original order.
  * @param language
  *   - The base language in which the resource is written.
  * @param category
  *   - Indicates the type of medication request (for example, where the medication is expected to be consumed or administered
  *     (i.e. inpatient or outpatient)).
  * @param priority
  *   - Indicates how quickly the Medication Request should be addressed with respect to other requests.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *     identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *     of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *     Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *     of the extension.
  * @param authoredOn
  *   - The date (and perhaps time) when the prescription was initially written or authored on.
  * @param reasonCode
  *   - The reason or the indication for ordering or not ordering the medication.
  * @param reported
  *   - Indicates if this record was captured as a secondary 'reported' record rather than as an original primary source-of-truth
  *     record. It may also indicate the source of the report.
  * @param statusReason
  *   - Captures the reason for the current state of the MedicationRequest.
  * @param doNotPerform
  *   - If true indicates that the provider is asking for the medication request not to occur.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *     processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *     other profiles etc.
  * @param medication
  *   - Identifies the medication being requested. This is a link to a resource that represents the medication which may be the
  *     details of the medication or simply an attribute carrying a code that identifies the medication from a known list of
  *     medications.
  * @param performerType
  *   - Indicates the type of performer of the administration of the medication.
  * @param note
  *   - Extra information about the prescription that could not be conveyed by the other attributes.
  * @param instantiatesUri
  *   - The URL pointing to an externally maintained protocol, guideline, orderset or other definition that is adhered to in whole
  *     or in part by this MedicationRequest.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *     the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *     Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *     strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *     extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *     processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of
  *     any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param courseOfTherapyType
  *   - The description of the course of therapy for a medication request.
  * @param identifier
  *   - Identifiers associated with this medication request that are defined by business processes and/or used to refer to it when
  *     a direct URL reference to the resource itself is not appropriate. They are business identifiers assigned to this resource
  *     by the performer or other systems and remain constant as the resource is updated and propagates from server to server.
  * @param instantiatesCanonical
  *   - The URL pointing to a protocol, guideline, orderset, or other definition that is adhered to in whole or in part by this
  *     MedicationRequest.
  * @param groupIdentifier
  *   - A shared identifier common to all requests that were authorized more or less simultaneously by a single author,
  *     representing the identifier of the requisition or prescription.
  * @param subject
  *   - A link to a resource representing the person or set of individuals to whom the medication will be given.
  * @param basedOn
  *   - A plan or request that is fulfilled in whole or in part by this medication request.
  * @param recorder
  *   - The person who entered the order on behalf of another individual for example in the case of a verbal or a telephone order.
  * @param encounter
  *   - The Encounter during which this [x] was created or to which the creation of this record is tightly associated.
  * @param requester
  *   - The individual, organization, or device that initiated the request and has responsibility for its activation.
  * @param performer
  *   - The specified desired performer of the medication treatment (e.g. the performer of the medication administration).
  * @param insurance
  *   - Insurance plans, coverage extensions, pre-authorizations and/or pre-determinations that may be required for delivering the
  *     requested service.
  * @param substitution
  *   - Indicates whether or not substitution can or should be part of the dispense. In some cases, substitution must happen, in
  *     other cases substitution must not happen. This block explains the prescriber's intent. If nothing is specified
  *     substitution may be done.
  * @param eventHistory
  *   - Links to Provenance records for past versions of this resource or fulfilling request or event resources that identify key
  *     state transitions or updates that are likely to be relevant to a user looking at the current version of the resource.
  * @param detectedIssue
  *   - Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a
  *     patient; e.g. Drug-drug interaction, duplicate therapy, dosage alert etc.
  * @param reasonReference
  *   - Condition or observation that supports why the medication was ordered.
  * @param priorPrescription
  *   - A link to a resource representing an earlier order related order or prescription.
  * @param supportingInformation
  *   - Include additional information (for example, patient height and weight) that supports the ordering of the medication.
  * @param dosageInstruction
  *   - Indicates how the medication is to be used by the patient.
  * @param dispenseRequest
  *   - Indicates the specific details for the dispense or medication supply part of a medication request (also known as a
  *     Medication Prescription or Medication Order). Note that this information is not always sent with the order. There may be
  *     in some settings (e.g. hospitals) institutional or system support for completing the dispense details in the pharmacy
  *     department.
  */
@POJOBoilerplate
class UKCore_MedicationRequest(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-MedicationRequest"))),
    override val text: Option[Narrative] = None,
    override val status: MEDICATIONREQUEST_STATUS,
    override val intent: MEDICATIONREQUEST_INTENT,
    override val language: Option[LANGUAGES] = None,
    override val category: LitSeq[CodeableConcept] = LitSeq.empty,
    override val priority: Option[REQUEST_PRIORITY] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val authoredOn: Option[FHIRDateTime] = None,
    override val reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
    override val reported: Option[UKCore_MedicationRequest.ReportedChoice] = None,
    override val statusReason: Option[CodeableConcept] = None,
    override val doNotPerform: Option[Boolean] = None,
    override val implicitRules: Option[UriStr] = None,
    override val medication: UKCore_MedicationRequest.MedicationChoice,
    override val performerType: Option[CodeableConcept] = None,
    override val note: LitSeq[Annotation] = LitSeq.empty,
    override val instantiatesUri: LitSeq[UriStr] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val courseOfTherapyType: Option[CodeableConcept] = None,
    override val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val instantiatesCanonical: LitSeq[Canonical] = LitSeq.empty,
    override val groupIdentifier: Option[Identifier] = None,
    override val subject: Reference,
    override val basedOn: LitSeq[Reference] = LitSeq.empty,
    override val recorder: Option[Reference] = None,
    override val encounter: Option[Reference] = None,
    override val requester: Option[Reference] = None,
    override val performer: Option[Reference] = None,
    override val insurance: LitSeq[Reference] = LitSeq.empty,
    substitution: MedicationRequest.Substitution,
    override val eventHistory: LitSeq[Reference] = LitSeq.empty,
    override val detectedIssue: LitSeq[Reference] = LitSeq.empty,
    override val reasonReference: LitSeq[Reference] = LitSeq.empty,
    override val priorPrescription: Option[Reference] = None,
    override val supportingInformation: LitSeq[Reference] = LitSeq.empty,
    override val dosageInstruction: LitSeq[Dosage] = LitSeq.empty,
    override val dispenseRequest: Option[MedicationRequest.DispenseRequest] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends MedicationRequest(
      id = id,
      meta = meta,
      text = text,
      note = note,
      status = status,
      intent = intent,
      subject = subject,
      basedOn = basedOn,
      language = language,
      category = category,
      priority = priority,
      recorder = recorder,
      contained = contained,
      extension = extension,
      encounter = encounter,
      requester = requester,
      performer = performer,
      insurance = insurance,
      identifier = identifier,
      authoredOn = authoredOn,
      reasonCode = reasonCode,
      reported = reported,
      statusReason = statusReason,
      doNotPerform = doNotPerform,
      eventHistory = eventHistory,
      implicitRules = implicitRules,
      medication = medication,
      performerType = performerType,
      detectedIssue = detectedIssue,
      reasonReference = reasonReference,
      instantiatesUri = instantiatesUri,
      groupIdentifier = groupIdentifier,
      modifierExtension = modifierExtension,
      dosageInstruction = dosageInstruction,
      priorPrescription = priorPrescription,
      courseOfTherapyType = courseOfTherapyType,
      supportingInformation = supportingInformation,
      instantiatesCanonical = instantiatesCanonical,
      substitution = Some(substitution),
      dispenseRequest = dispenseRequest,
      primitiveAttributes = primitiveAttributes
    ) {
  override val thisTypeName: String = "MedicationRequest"
}
