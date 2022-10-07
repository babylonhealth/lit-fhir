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
import com.babylonhealth.lit.hl7.{ REQUEST_INTENT, REQUEST_STATUS, REQUEST_PRIORITY }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, ukcore }
import com.babylonhealth.lit.macros.POJOBoilerplate

object UKCore_ServiceRequest extends CompanionFor[UKCore_ServiceRequest] {
  implicit def summonObjectAndCompanionUKCore_ServiceRequest_1530723959(
      o: UKCore_ServiceRequest): ObjectAndCompanion[UKCore_ServiceRequest, UKCore_ServiceRequest.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = ServiceRequest
  override type ParentType   = ServiceRequest
  override val baseType: CompanionFor[ResourceType] = ServiceRequest
  override val parentType: CompanionFor[ParentType] = ServiceRequest
  override val profileUrl: Option[String]           = Some("https://fhir.hl7.org.uk/StructureDefinition/UKCore-ServiceRequest")
  type QuantityChoice   = Choice[UnionQuantityOrRangeOrRatio]
  type AsNeededChoice   = Choice[UnionBooleanOrCodeableConcept]
  type OccurrenceChoice = Choice[UnionDateTimeOrPeriodOrTiming]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-ServiceRequest"))),
      text: Option[Narrative] = None,
      code: Option[CodeableConcept] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      status: REQUEST_STATUS,
      intent: REQUEST_INTENT,
      language: Option[LANGUAGES] = None,
      category: LitSeq[CodeableConcept] = LitSeq.empty,
      priority: Option[REQUEST_PRIORITY] = None,
      bodySite: LitSeq[CodeableConcept] = LitSeq.empty,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      authoredOn: Option[FHIRDateTime] = None,
      reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
      orderDetail: LitSeq[CodeableConcept] = LitSeq.empty,
      quantity: Option[UKCore_ServiceRequest.QuantityChoice] = None,
      asNeeded: Option[UKCore_ServiceRequest.AsNeededChoice] = None,
      doNotPerform: Option[Boolean] = None,
      locationCode: LitSeq[CodeableConcept] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      occurrence: Option[UKCore_ServiceRequest.OccurrenceChoice] = None,
      performerType: Option[CodeableConcept] = None,
      instantiatesUri: LitSeq[UriStr] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      patientInstruction: Option[String] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      instantiatesCanonical: LitSeq[Canonical] = LitSeq.empty,
      requisition: Option[Identifier] = None,
      basedOn: LitSeq[Reference] = LitSeq.empty,
      subject: Reference,
      replaces: LitSeq[Reference] = LitSeq.empty,
      specimen: LitSeq[Reference] = LitSeq.empty,
      encounter: Option[Reference] = None,
      requester: Option[Reference] = None,
      performer: LitSeq[Reference] = LitSeq.empty,
      insurance: LitSeq[Reference] = LitSeq.empty,
      supportingInfo: LitSeq[Reference] = LitSeq.empty,
      reasonReference: LitSeq[Reference] = LitSeq.empty,
      relevantHistory: LitSeq[Reference] = LitSeq.empty,
      locationReference: LitSeq[Reference] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): UKCore_ServiceRequest = new UKCore_ServiceRequest(
    id,
    meta,
    text,
    code,
    note,
    status,
    intent,
    language,
    category,
    priority,
    bodySite,
    contained,
    extension,
    authoredOn,
    reasonCode,
    orderDetail,
    quantity,
    asNeeded,
    doNotPerform,
    locationCode,
    implicitRules,
    occurrence,
    performerType,
    instantiatesUri,
    modifierExtension,
    patientInstruction,
    identifier,
    instantiatesCanonical,
    requisition,
    basedOn,
    subject,
    replaces,
    specimen,
    encounter,
    requester,
    performer,
    insurance,
    supportingInfo,
    reasonReference,
    relevantHistory,
    locationReference,
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
  val status: FHIRComponentFieldMeta[REQUEST_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[REQUEST_STATUS], false, lTagOf[REQUEST_STATUS])
  val intent: FHIRComponentFieldMeta[REQUEST_INTENT] =
    FHIRComponentFieldMeta("intent", lTagOf[REQUEST_INTENT], false, lTagOf[REQUEST_INTENT])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val category: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("category", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val priority: FHIRComponentFieldMeta[Option[REQUEST_PRIORITY]] =
    FHIRComponentFieldMeta("priority", lTagOf[Option[REQUEST_PRIORITY]], false, lTagOf[REQUEST_PRIORITY])
  val bodySite: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("bodySite", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val authoredOn: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("authoredOn", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val reasonCode: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("reasonCode", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val orderDetail: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("orderDetail", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val quantity: FHIRComponentFieldMeta[Option[UKCore_ServiceRequest.QuantityChoice]] =
    FHIRComponentFieldMeta(
      "quantity",
      lTagOf[Option[UKCore_ServiceRequest.QuantityChoice]],
      true,
      lTagOf[UnionQuantityOrRangeOrRatio])
  val asNeeded: FHIRComponentFieldMeta[Option[UKCore_ServiceRequest.AsNeededChoice]] =
    FHIRComponentFieldMeta(
      "asNeeded",
      lTagOf[Option[UKCore_ServiceRequest.AsNeededChoice]],
      true,
      lTagOf[UnionBooleanOrCodeableConcept])
  val doNotPerform: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("doNotPerform", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val locationCode: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("locationCode", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val occurrence: FHIRComponentFieldMeta[Option[UKCore_ServiceRequest.OccurrenceChoice]] =
    FHIRComponentFieldMeta(
      "occurrence",
      lTagOf[Option[UKCore_ServiceRequest.OccurrenceChoice]],
      true,
      lTagOf[UnionDateTimeOrPeriodOrTiming])
  val performerType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("performerType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val instantiatesUri: FHIRComponentFieldMeta[LitSeq[UriStr]] =
    FHIRComponentFieldMeta("instantiatesUri", lTagOf[LitSeq[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val patientInstruction: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("patientInstruction", lTagOf[Option[String]], false, lTagOf[String])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val instantiatesCanonical: FHIRComponentFieldMeta[LitSeq[Canonical]] =
    FHIRComponentFieldMeta("instantiatesCanonical", lTagOf[LitSeq[Canonical]], false, lTagOf[Canonical])
  val requisition: FHIRComponentFieldMeta[Option[Identifier]] =
    FHIRComponentFieldMeta("requisition", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
  val basedOn: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("basedOn", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val subject: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("subject", lTagOf[Reference], false, lTagOf[Reference])
  val replaces: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("replaces", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val specimen: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("specimen", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val encounter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("encounter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val requester: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("requester", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val performer: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("performer", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val insurance: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("insurance", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val supportingInfo: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("supportingInfo", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val reasonReference: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("reasonReference", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val relevantHistory: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("relevantHistory", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val locationReference: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("locationReference", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    code,
    note,
    status,
    intent,
    language,
    category,
    priority,
    bodySite,
    contained,
    extension,
    authoredOn,
    reasonCode,
    orderDetail,
    quantity,
    asNeeded,
    doNotPerform,
    locationCode,
    implicitRules,
    occurrence,
    performerType,
    instantiatesUri,
    modifierExtension,
    patientInstruction,
    identifier,
    instantiatesCanonical,
    requisition,
    basedOn,
    subject,
    replaces,
    specimen,
    encounter,
    requester,
    performer,
    insurance,
    supportingInfo,
    reasonReference,
    relevantHistory,
    locationReference
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Meta]](meta, t.meta),
      FHIRComponentField[Option[Narrative]](text, t.text),
      FHIRComponentField[Option[CodeableConcept]](code, t.code),
      FHIRComponentField[LitSeq[Annotation]](note, t.note),
      FHIRComponentField[REQUEST_STATUS](status, t.status),
      FHIRComponentField[REQUEST_INTENT](intent, t.intent),
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[LitSeq[CodeableConcept]](category, t.category),
      FHIRComponentField[Option[REQUEST_PRIORITY]](priority, t.priority),
      FHIRComponentField[LitSeq[CodeableConcept]](bodySite, t.bodySite),
      FHIRComponentField[LitSeq[Resource]](contained, t.contained),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[FHIRDateTime]](authoredOn, t.authoredOn),
      FHIRComponentField[LitSeq[CodeableConcept]](reasonCode, t.reasonCode),
      FHIRComponentField[LitSeq[CodeableConcept]](orderDetail, t.orderDetail),
      FHIRComponentField[Option[UKCore_ServiceRequest.QuantityChoice]](quantity, t.quantity),
      FHIRComponentField[Option[UKCore_ServiceRequest.AsNeededChoice]](asNeeded, t.asNeeded),
      FHIRComponentField[Option[Boolean]](doNotPerform, t.doNotPerform),
      FHIRComponentField[LitSeq[CodeableConcept]](locationCode, t.locationCode),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[Option[UKCore_ServiceRequest.OccurrenceChoice]](occurrence, t.occurrence),
      FHIRComponentField[Option[CodeableConcept]](performerType, t.performerType),
      FHIRComponentField[LitSeq[UriStr]](instantiatesUri, t.instantiatesUri),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[String]](patientInstruction, t.patientInstruction),
      FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
      FHIRComponentField[LitSeq[Canonical]](instantiatesCanonical, t.instantiatesCanonical),
      FHIRComponentField[Option[Identifier]](requisition, t.requisition),
      FHIRComponentField[LitSeq[Reference]](basedOn, t.basedOn),
      FHIRComponentField[Reference](subject, t.subject),
      FHIRComponentField[LitSeq[Reference]](replaces, t.replaces),
      FHIRComponentField[LitSeq[Reference]](specimen, t.specimen),
      FHIRComponentField[Option[Reference]](encounter, t.encounter),
      FHIRComponentField[Option[Reference]](requester, t.requester),
      FHIRComponentField[LitSeq[Reference]](performer, t.performer),
      FHIRComponentField[LitSeq[Reference]](insurance, t.insurance),
      FHIRComponentField[LitSeq[Reference]](supportingInfo, t.supportingInfo),
      FHIRComponentField[LitSeq[Reference]](reasonReference, t.reasonReference),
      FHIRComponentField[LitSeq[Reference]](relevantHistory, t.relevantHistory),
      FHIRComponentField[LitSeq[Reference]](locationReference, t.locationReference)
    ))
  override def fields(t: UKCore_ServiceRequest): Seq[FHIRComponentField[_]]                       = fieldsFromParent(t).get
  def extractId(t: UKCore_ServiceRequest): Option[String]                                         = t.id
  def extractMeta(t: UKCore_ServiceRequest): Option[Meta]                                         = t.meta
  def extractText(t: UKCore_ServiceRequest): Option[Narrative]                                    = t.text
  def extractCode(t: UKCore_ServiceRequest): Option[CodeableConcept]                              = t.code
  def extractNote(t: UKCore_ServiceRequest): LitSeq[Annotation]                                   = t.note
  def extractStatus(t: UKCore_ServiceRequest): REQUEST_STATUS                                     = t.status
  def extractIntent(t: UKCore_ServiceRequest): REQUEST_INTENT                                     = t.intent
  def extractLanguage(t: UKCore_ServiceRequest): Option[LANGUAGES]                                = t.language
  def extractCategory(t: UKCore_ServiceRequest): LitSeq[CodeableConcept]                          = t.category
  def extractPriority(t: UKCore_ServiceRequest): Option[REQUEST_PRIORITY]                         = t.priority
  def extractBodySite(t: UKCore_ServiceRequest): LitSeq[CodeableConcept]                          = t.bodySite
  def extractContained(t: UKCore_ServiceRequest): LitSeq[Resource]                                = t.contained
  def extractExtension(t: UKCore_ServiceRequest): LitSeq[Extension]                               = t.extension
  def extractAuthoredOn(t: UKCore_ServiceRequest): Option[FHIRDateTime]                           = t.authoredOn
  def extractReasonCode(t: UKCore_ServiceRequest): LitSeq[CodeableConcept]                        = t.reasonCode
  def extractOrderDetail(t: UKCore_ServiceRequest): LitSeq[CodeableConcept]                       = t.orderDetail
  def extractQuantity(t: UKCore_ServiceRequest): Option[UKCore_ServiceRequest.QuantityChoice]     = t.quantity
  def extractAsNeeded(t: UKCore_ServiceRequest): Option[UKCore_ServiceRequest.AsNeededChoice]     = t.asNeeded
  def extractDoNotPerform(t: UKCore_ServiceRequest): Option[Boolean]                              = t.doNotPerform
  def extractLocationCode(t: UKCore_ServiceRequest): LitSeq[CodeableConcept]                      = t.locationCode
  def extractImplicitRules(t: UKCore_ServiceRequest): Option[UriStr]                              = t.implicitRules
  def extractOccurrence(t: UKCore_ServiceRequest): Option[UKCore_ServiceRequest.OccurrenceChoice] = t.occurrence
  def extractPerformerType(t: UKCore_ServiceRequest): Option[CodeableConcept]                     = t.performerType
  def extractInstantiatesUri(t: UKCore_ServiceRequest): LitSeq[UriStr]                            = t.instantiatesUri
  def extractModifierExtension(t: UKCore_ServiceRequest): LitSeq[Extension]                       = t.modifierExtension
  def extractPatientInstruction(t: UKCore_ServiceRequest): Option[String]                         = t.patientInstruction
  def extractIdentifier(t: UKCore_ServiceRequest): LitSeq[Identifier]                             = t.identifier
  def extractInstantiatesCanonical(t: UKCore_ServiceRequest): LitSeq[Canonical]                   = t.instantiatesCanonical
  def extractRequisition(t: UKCore_ServiceRequest): Option[Identifier]                            = t.requisition
  def extractBasedOn(t: UKCore_ServiceRequest): LitSeq[Reference]                                 = t.basedOn
  def extractSubject(t: UKCore_ServiceRequest): Reference                                         = t.subject
  def extractReplaces(t: UKCore_ServiceRequest): LitSeq[Reference]                                = t.replaces
  def extractSpecimen(t: UKCore_ServiceRequest): LitSeq[Reference]                                = t.specimen
  def extractEncounter(t: UKCore_ServiceRequest): Option[Reference]                               = t.encounter
  def extractRequester(t: UKCore_ServiceRequest): Option[Reference]                               = t.requester
  def extractPerformer(t: UKCore_ServiceRequest): LitSeq[Reference]                               = t.performer
  def extractInsurance(t: UKCore_ServiceRequest): LitSeq[Reference]                               = t.insurance
  def extractSupportingInfo(t: UKCore_ServiceRequest): LitSeq[Reference]                          = t.supportingInfo
  def extractReasonReference(t: UKCore_ServiceRequest): LitSeq[Reference]                         = t.reasonReference
  def extractRelevantHistory(t: UKCore_ServiceRequest): LitSeq[Reference]                         = t.relevantHistory
  def extractLocationReference(t: UKCore_ServiceRequest): LitSeq[Reference]                       = t.locationReference
  override val thisName: String                                                                   = "UKCore_ServiceRequest"
  override val searchParams: Map[String, UKCore_ServiceRequest => Seq[Any]]                       = ServiceRequest.searchParams
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[UKCore_ServiceRequest] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new UKCore_ServiceRequest(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("code", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[REQUEST_STATUS]("status", None),
          cursor.decodeAs[REQUEST_INTENT]("intent", None),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("category", Some(LitSeq.empty)),
          cursor.decodeAs[Option[REQUEST_PRIORITY]]("priority", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("bodySite", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[FHIRDateTime]]("authoredOn", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("reasonCode", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("orderDetail", Some(LitSeq.empty)),
          cursor.decodeOptRef[UnionQuantityOrRangeOrRatio]("quantity"),
          cursor.decodeOptRef[UnionBooleanOrCodeableConcept]("asNeeded"),
          cursor.decodeAs[Option[Boolean]]("doNotPerform", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("locationCode", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeOptRef[UnionDateTimeOrPeriodOrTiming]("occurrence"),
          cursor.decodeAs[Option[CodeableConcept]]("performerType", Some(None)),
          cursor.decodeAs[LitSeq[UriStr]]("instantiatesUri", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("patientInstruction", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Canonical]]("instantiatesCanonical", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Identifier]]("requisition", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("basedOn", Some(LitSeq.empty)),
          cursor.decodeAs[Reference]("subject", None),
          cursor.decodeAs[LitSeq[Reference]]("replaces", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("specimen", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          cursor.decodeAs[Option[Reference]]("requester", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("performer", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("insurance", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("supportingInfo", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("reasonReference", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("relevantHistory", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("locationReference", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Defines the UK Core constraints and extensions on the ServiceRequest resource for the minimal set of data to query and
  * retrieve service request information.
  *
  * Subclass of [[hl7.model.ServiceRequest]] (A record of a request for service such as diagnostic investigations, treatments, or
  * operations to be performed.)
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
  * @param code
  *   - A code that identifies a particular service (i.e., procedure, diagnostic investigation, or panel of investigations) that
  *     have been requested.
  * @param note
  *   - Any other notes and comments made about the service request. For example, internal billing notes.
  * @param status
  *   - The status of the order.
  * @param intent
  *   - Whether the request is a proposal, plan, an original order or a reflex order.
  * @param language
  *   - The base language in which the resource is written.
  * @param category
  *   - A code that classifies the service for searching, sorting and display purposes (e.g. "Surgical Procedure").
  * @param priority
  *   - Indicates how quickly the ServiceRequest should be addressed with respect to other requests.
  * @param bodySite
  *   - Anatomic location where the procedure should be performed. This is the target site.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *     identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *     of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *     Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *     of the extension.
  * @param authoredOn
  *   - When the request transitioned to being actionable.
  * @param reasonCode
  *   - An explanation or justification for why this service is being requested in coded or textual form. This is often for
  *     billing purposes. May relate to the resources referred to in `supportingInfo`.
  * @param orderDetail
  *   - Additional details and instructions about the how the services are to be delivered. For example, and order for a urinary
  *     catheter may have an order detail for an external or indwelling catheter, or an order for a bandage may require additional
  *     instructions specifying how the bandage should be applied.
  * @param quantity
  *   - An amount of service being requested which can be a quantity ( for example $1,500 home modification), a ratio ( for
  *     example, 20 half day visits per month), or a range (2.0 to 1.8 Gy per fraction).
  * @param asNeeded
  *   - If a CodeableConcept is present, it indicates the pre-condition for performing the service. For example "pain", "on
  *     flare-up", etc.
  * @param doNotPerform
  *   - Set this to true if the record is saying that the service/procedure should NOT be performed.
  * @param locationCode
  *   - The preferred location(s) where the procedure should actually happen in coded or free text form. E.g. at home or nursing
  *     day care center.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *     processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *     other profiles etc.
  * @param occurrence
  *   - The date/time at which the requested service should occur.
  * @param performerType
  *   - Desired type of performer for doing the requested service.
  * @param instantiatesUri
  *   - The URL pointing to an externally maintained protocol, guideline, orderset or other definition that is adhered to in whole
  *     or in part by this ServiceRequest.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *     the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *     Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *     strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *     extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *     processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of
  *     any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param patientInstruction
  *   - Instructions in terms that are understood by the patient or consumer.
  * @param identifier
  *   - Identifiers assigned to this order instance by the orderer and/or the receiver and/or order fulfiller.
  * @param instantiatesCanonical
  *   - The URL pointing to a FHIR-defined protocol, guideline, orderset or other definition that is adhered to in whole or in
  *     part by this ServiceRequest.
  * @param requisition
  *   - A shared identifier common to all service requests that were authorized more or less simultaneously by a single author,
  *     representing the composite or group identifier.
  * @param basedOn
  *   - Plan/proposal/order fulfilled by this request.
  * @param subject
  *   - On whom or what the service is to be performed. This is usually a human patient, but can also be requested on animals,
  *     groups of humans or animals, devices such as dialysis machines, or even locations (typically for environmental scans).
  * @param replaces
  *   - The request takes the place of the referenced completed or terminated request(s).
  * @param specimen
  *   - One or more specimens that the laboratory procedure will use.
  * @param encounter
  *   - An encounter that provides additional information about the healthcare context in which this request is made.
  * @param requester
  *   - The individual who initiated the request and has responsibility for its activation.
  * @param performer
  *   - The desired performer for doing the requested service. For example, the surgeon, dermatopathologist, endoscopist, etc.
  * @param insurance
  *   - Insurance plans, coverage extensions, pre-authorizations and/or pre-determinations that may be needed for delivering the
  *     requested service.
  * @param supportingInfo
  *   - Additional clinical information about the patient or specimen that may influence the services or their interpretations.
  *     This information includes diagnosis, clinical findings and other observations. In laboratory ordering these are typically
  *     referred to as "ask at order entry questions (AOEs)". This includes observations explicitly requested by the producer
  *     (filler) to provide context or supporting information needed to complete the order. For example, reporting the amount of
  *     inspired oxygen for blood gas measurements.
  * @param reasonReference
  *   - Indicates another resource that provides a justification for why this service is being requested. May relate to the
  *     resources referred to in `supportingInfo`.
  * @param relevantHistory
  *   - Key events in the history of the request.
  * @param locationReference
  *   - A reference to the the preferred location(s) where the procedure should actually happen. E.g. at home or nursing day care
  *     center.
  */
@POJOBoilerplate
class UKCore_ServiceRequest(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-ServiceRequest"))),
    override val text: Option[Narrative] = None,
    override val code: Option[CodeableConcept] = None,
    override val note: LitSeq[Annotation] = LitSeq.empty,
    override val status: REQUEST_STATUS,
    override val intent: REQUEST_INTENT,
    override val language: Option[LANGUAGES] = None,
    override val category: LitSeq[CodeableConcept] = LitSeq.empty,
    override val priority: Option[REQUEST_PRIORITY] = None,
    override val bodySite: LitSeq[CodeableConcept] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val authoredOn: Option[FHIRDateTime] = None,
    override val reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
    override val orderDetail: LitSeq[CodeableConcept] = LitSeq.empty,
    override val quantity: Option[UKCore_ServiceRequest.QuantityChoice] = None,
    override val asNeeded: Option[UKCore_ServiceRequest.AsNeededChoice] = None,
    override val doNotPerform: Option[Boolean] = None,
    override val locationCode: LitSeq[CodeableConcept] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    override val occurrence: Option[UKCore_ServiceRequest.OccurrenceChoice] = None,
    override val performerType: Option[CodeableConcept] = None,
    override val instantiatesUri: LitSeq[UriStr] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val patientInstruction: Option[String] = None,
    override val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val instantiatesCanonical: LitSeq[Canonical] = LitSeq.empty,
    override val requisition: Option[Identifier] = None,
    override val basedOn: LitSeq[Reference] = LitSeq.empty,
    override val subject: Reference,
    override val replaces: LitSeq[Reference] = LitSeq.empty,
    override val specimen: LitSeq[Reference] = LitSeq.empty,
    override val encounter: Option[Reference] = None,
    override val requester: Option[Reference] = None,
    override val performer: LitSeq[Reference] = LitSeq.empty,
    override val insurance: LitSeq[Reference] = LitSeq.empty,
    override val supportingInfo: LitSeq[Reference] = LitSeq.empty,
    override val reasonReference: LitSeq[Reference] = LitSeq.empty,
    override val relevantHistory: LitSeq[Reference] = LitSeq.empty,
    override val locationReference: LitSeq[Reference] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends ServiceRequest(
      id = id,
      meta = meta,
      text = text,
      code = code,
      note = note,
      status = status,
      intent = intent,
      basedOn = basedOn,
      subject = subject,
      language = language,
      replaces = replaces,
      category = category,
      priority = priority,
      specimen = specimen,
      bodySite = bodySite,
      contained = contained,
      extension = extension,
      encounter = encounter,
      requester = requester,
      performer = performer,
      insurance = insurance,
      identifier = identifier,
      authoredOn = authoredOn,
      reasonCode = reasonCode,
      requisition = requisition,
      orderDetail = orderDetail,
      quantity = quantity,
      asNeeded = asNeeded,
      doNotPerform = doNotPerform,
      locationCode = locationCode,
      implicitRules = implicitRules,
      occurrence = occurrence,
      performerType = performerType,
      supportingInfo = supportingInfo,
      instantiatesUri = instantiatesUri,
      reasonReference = reasonReference,
      relevantHistory = relevantHistory,
      modifierExtension = modifierExtension,
      locationReference = locationReference,
      patientInstruction = patientInstruction,
      instantiatesCanonical = instantiatesCanonical,
      primitiveAttributes = primitiveAttributes
    ) {
  override val thisTypeName: String = "ServiceRequest"
}
