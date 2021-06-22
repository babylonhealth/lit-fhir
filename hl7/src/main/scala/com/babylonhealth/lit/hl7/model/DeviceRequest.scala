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
import com.babylonhealth.lit.hl7.{ REQUEST_INTENT, REQUEST_STATUS, REQUEST_PRIORITY }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object DeviceRequest extends CompanionFor[DeviceRequest] {
  implicit def summonObjectAndCompanionDeviceRequest1575236692(
      o: DeviceRequest): ObjectAndCompanion[DeviceRequest, DeviceRequest.type] = ObjectAndCompanion(o, this)
  override type ResourceType = DeviceRequest
  override type ParentType   = DeviceRequest
  override val baseType: CompanionFor[ResourceType] = DeviceRequest
  override val parentType: CompanionFor[ParentType] = DeviceRequest
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/DeviceRequest")
  object Parameter extends CompanionFor[Parameter] {
    implicit def summonObjectAndCompanionParameter_582978891(o: Parameter): ObjectAndCompanion[Parameter, Parameter.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Parameter
    override type ParentType   = Parameter
    override val parentType: CompanionFor[ResourceType] = Parameter
    type ValueChoice = Choice[Union_1516277229]
    def apply(
        id: Option[String] = None,
        code: Option[CodeableConcept] = None,
        value: Option[Parameter.ValueChoice] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Parameter = new Parameter(
      id,
      code,
      value,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Parameter): Option[(Option[String], Option[CodeableConcept], Option[Parameter.ValueChoice], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.code, o.value, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val code: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("code", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val value: FHIRComponentFieldMeta[Option[Parameter.ValueChoice]] =
      FHIRComponentFieldMeta("value", lTagOf[Option[Parameter.ValueChoice]], true, lTagOf[Union_1516277229])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, code, value, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Parameter): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](code, t.code),
      FHIRComponentField[Option[Parameter.ValueChoice]](value, t.value),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Parameter] = this
    val thisName: String                  = "Parameter"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Parameter] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Parameter(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("code", Some(None)),
            cursor.decodeOptRef[Union_1516277229]("value"),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Parameter(
      override val id: Option[String] = None,
      val code: Option[CodeableConcept] = None,
      val value: Option[Parameter.ValueChoice] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  type CodeChoice       = Choice[Union01025009075]
  type OccurrenceChoice = Choice[Union00609373412]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      status: Option[REQUEST_STATUS] = None,
      intent: REQUEST_INTENT,
      basedOn: LitSeq[Reference] = LitSeq.empty,
      code: DeviceRequest.CodeChoice,
      subject: Reference,
      language: Option[LANGUAGES] = None,
      priority: Option[REQUEST_PRIORITY] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      encounter: Option[Reference] = None,
      requester: Option[Reference] = None,
      performer: Option[Reference] = None,
      insurance: LitSeq[Reference] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      authoredOn: Option[FHIRDateTime] = None,
      reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
      priorRequest: LitSeq[Reference] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      occurrence: Option[DeviceRequest.OccurrenceChoice] = None,
      performerType: Option[CodeableConcept] = None,
      supportingInfo: LitSeq[Reference] = LitSeq.empty,
      instantiatesUri: LitSeq[UriStr] = LitSeq.empty,
      groupIdentifier: Option[Identifier] = None,
      reasonReference: LitSeq[Reference] = LitSeq.empty,
      relevantHistory: LitSeq[Reference] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      instantiatesCanonical: LitSeq[Canonical] = LitSeq.empty,
      parameter: LitSeq[DeviceRequest.Parameter] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): DeviceRequest = new DeviceRequest(
    id,
    meta,
    text,
    note,
    status,
    intent,
    basedOn,
    code,
    subject,
    language,
    priority,
    contained,
    extension,
    encounter,
    requester,
    performer,
    insurance,
    identifier,
    authoredOn,
    reasonCode,
    priorRequest,
    implicitRules,
    occurrence,
    performerType,
    supportingInfo,
    instantiatesUri,
    groupIdentifier,
    reasonReference,
    relevantHistory,
    modifierExtension,
    instantiatesCanonical,
    parameter,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val status: FHIRComponentFieldMeta[Option[REQUEST_STATUS]] =
    FHIRComponentFieldMeta("status", lTagOf[Option[REQUEST_STATUS]], false, lTagOf[REQUEST_STATUS])
  val intent: FHIRComponentFieldMeta[REQUEST_INTENT] =
    FHIRComponentFieldMeta("intent", lTagOf[REQUEST_INTENT], false, lTagOf[REQUEST_INTENT])
  val basedOn: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("basedOn", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val code: FHIRComponentFieldMeta[DeviceRequest.CodeChoice] =
    FHIRComponentFieldMeta("code", lTagOf[DeviceRequest.CodeChoice], true, lTagOf[Union01025009075])
  val subject: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("subject", lTagOf[Reference], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val priority: FHIRComponentFieldMeta[Option[REQUEST_PRIORITY]] =
    FHIRComponentFieldMeta("priority", lTagOf[Option[REQUEST_PRIORITY]], false, lTagOf[REQUEST_PRIORITY])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val encounter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("encounter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val requester: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("requester", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val performer: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("performer", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val insurance: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("insurance", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val authoredOn: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("authoredOn", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val reasonCode: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("reasonCode", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val priorRequest: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("priorRequest", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val occurrence: FHIRComponentFieldMeta[Option[DeviceRequest.OccurrenceChoice]] =
    FHIRComponentFieldMeta("occurrence", lTagOf[Option[DeviceRequest.OccurrenceChoice]], true, lTagOf[Union00609373412])
  val performerType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("performerType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val supportingInfo: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("supportingInfo", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val instantiatesUri: FHIRComponentFieldMeta[LitSeq[UriStr]] =
    FHIRComponentFieldMeta("instantiatesUri", lTagOf[LitSeq[UriStr]], false, lTagOf[UriStr])
  val groupIdentifier: FHIRComponentFieldMeta[Option[Identifier]] =
    FHIRComponentFieldMeta("groupIdentifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
  val reasonReference: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("reasonReference", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val relevantHistory: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("relevantHistory", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val instantiatesCanonical: FHIRComponentFieldMeta[LitSeq[Canonical]] =
    FHIRComponentFieldMeta("instantiatesCanonical", lTagOf[LitSeq[Canonical]], false, lTagOf[Canonical])
  val parameter: FHIRComponentFieldMeta[LitSeq[DeviceRequest.Parameter]] =
    FHIRComponentFieldMeta("parameter", lTagOf[LitSeq[DeviceRequest.Parameter]], false, lTagOf[DeviceRequest.Parameter])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    note,
    status,
    intent,
    basedOn,
    code,
    subject,
    language,
    priority,
    contained,
    extension,
    encounter,
    requester,
    performer,
    insurance,
    identifier,
    authoredOn,
    reasonCode,
    priorRequest,
    implicitRules,
    occurrence,
    performerType,
    supportingInfo,
    instantiatesUri,
    groupIdentifier,
    reasonReference,
    relevantHistory,
    modifierExtension,
    instantiatesCanonical,
    parameter
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: DeviceRequest): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[LitSeq[Annotation]](note, t.note),
    FHIRComponentField[Option[REQUEST_STATUS]](status, t.status),
    FHIRComponentField[REQUEST_INTENT](intent, t.intent),
    FHIRComponentField[LitSeq[Reference]](basedOn, t.basedOn),
    FHIRComponentField[DeviceRequest.CodeChoice](code, t.code),
    FHIRComponentField[Reference](subject, t.subject),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Option[REQUEST_PRIORITY]](priority, t.priority),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Reference]](encounter, t.encounter),
    FHIRComponentField[Option[Reference]](requester, t.requester),
    FHIRComponentField[Option[Reference]](performer, t.performer),
    FHIRComponentField[LitSeq[Reference]](insurance, t.insurance),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[FHIRDateTime]](authoredOn, t.authoredOn),
    FHIRComponentField[LitSeq[CodeableConcept]](reasonCode, t.reasonCode),
    FHIRComponentField[LitSeq[Reference]](priorRequest, t.priorRequest),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[DeviceRequest.OccurrenceChoice]](occurrence, t.occurrence),
    FHIRComponentField[Option[CodeableConcept]](performerType, t.performerType),
    FHIRComponentField[LitSeq[Reference]](supportingInfo, t.supportingInfo),
    FHIRComponentField[LitSeq[UriStr]](instantiatesUri, t.instantiatesUri),
    FHIRComponentField[Option[Identifier]](groupIdentifier, t.groupIdentifier),
    FHIRComponentField[LitSeq[Reference]](reasonReference, t.reasonReference),
    FHIRComponentField[LitSeq[Reference]](relevantHistory, t.relevantHistory),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[Canonical]](instantiatesCanonical, t.instantiatesCanonical),
    FHIRComponentField[LitSeq[DeviceRequest.Parameter]](parameter, t.parameter)
  )
  def extractId(t: DeviceRequest): Option[String]                                 = t.id
  def extractMeta(t: DeviceRequest): Option[Meta]                                 = t.meta
  def extractText(t: DeviceRequest): Option[Narrative]                            = t.text
  def extractNote(t: DeviceRequest): LitSeq[Annotation]                           = t.note
  def extractStatus(t: DeviceRequest): Option[REQUEST_STATUS]                     = t.status
  def extractIntent(t: DeviceRequest): REQUEST_INTENT                             = t.intent
  def extractBasedOn(t: DeviceRequest): LitSeq[Reference]                         = t.basedOn
  def extractCode(t: DeviceRequest): DeviceRequest.CodeChoice                     = t.code
  def extractSubject(t: DeviceRequest): Reference                                 = t.subject
  def extractLanguage(t: DeviceRequest): Option[LANGUAGES]                        = t.language
  def extractPriority(t: DeviceRequest): Option[REQUEST_PRIORITY]                 = t.priority
  def extractContained(t: DeviceRequest): LitSeq[Resource]                        = t.contained
  def extractExtension(t: DeviceRequest): LitSeq[Extension]                       = t.extension
  def extractEncounter(t: DeviceRequest): Option[Reference]                       = t.encounter
  def extractRequester(t: DeviceRequest): Option[Reference]                       = t.requester
  def extractPerformer(t: DeviceRequest): Option[Reference]                       = t.performer
  def extractInsurance(t: DeviceRequest): LitSeq[Reference]                       = t.insurance
  def extractIdentifier(t: DeviceRequest): LitSeq[Identifier]                     = t.identifier
  def extractAuthoredOn(t: DeviceRequest): Option[FHIRDateTime]                   = t.authoredOn
  def extractReasonCode(t: DeviceRequest): LitSeq[CodeableConcept]                = t.reasonCode
  def extractPriorRequest(t: DeviceRequest): LitSeq[Reference]                    = t.priorRequest
  def extractImplicitRules(t: DeviceRequest): Option[UriStr]                      = t.implicitRules
  def extractOccurrence(t: DeviceRequest): Option[DeviceRequest.OccurrenceChoice] = t.occurrence
  def extractPerformerType(t: DeviceRequest): Option[CodeableConcept]             = t.performerType
  def extractSupportingInfo(t: DeviceRequest): LitSeq[Reference]                  = t.supportingInfo
  def extractInstantiatesUri(t: DeviceRequest): LitSeq[UriStr]                    = t.instantiatesUri
  def extractGroupIdentifier(t: DeviceRequest): Option[Identifier]                = t.groupIdentifier
  def extractReasonReference(t: DeviceRequest): LitSeq[Reference]                 = t.reasonReference
  def extractRelevantHistory(t: DeviceRequest): LitSeq[Reference]                 = t.relevantHistory
  def extractModifierExtension(t: DeviceRequest): LitSeq[Extension]               = t.modifierExtension
  def extractInstantiatesCanonical(t: DeviceRequest): LitSeq[Canonical]           = t.instantiatesCanonical
  def extractParameter(t: DeviceRequest): LitSeq[DeviceRequest.Parameter]         = t.parameter
  override val thisName: String                                                   = "DeviceRequest"
  override val searchParams: Map[String, DeviceRequest => Seq[Any]] = Map(
    "group-identifier" -> (obj => obj.groupIdentifier.toSeq),
    "subject"          -> (obj => Seq(obj.subject)),
    "intent"           -> (obj => Seq(obj.intent)),
    "event-date" -> (obj =>
      obj.occurrence.flatMap(_.as[FHIRDateTime]).toSeq ++
        obj.occurrence.flatMap(_.as[Period]).toSeq),
    "requester"              -> (obj => obj.requester.toSeq),
    "prior-request"          -> (obj => obj.priorRequest.toSeq),
    "code"                   -> (obj => obj.code.as[CodeableConcept].toSeq),
    "status"                 -> (obj => obj.status.toSeq),
    "authored-on"            -> (obj => obj.authoredOn.toSeq),
    "based-on"               -> (obj => obj.basedOn.toSeq),
    "encounter"              -> (obj => obj.encounter.toSeq),
    "instantiates-uri"       -> (obj => obj.instantiatesUri.toSeq),
    "insurance"              -> (obj => obj.insurance.toSeq),
    "identifier"             -> (obj => obj.identifier.toSeq),
    "device"                 -> (obj => obj.code.as[Reference].toSeq),
    "performer"              -> (obj => obj.performer.toSeq),
    "instantiates-canonical" -> (obj => obj.instantiatesCanonical.toSeq),
    "patient"                -> (obj => obj.subject.seqIf(_.reference.exists(_.contains("Patient/"))).toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[DeviceRequest] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new DeviceRequest(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[Option[REQUEST_STATUS]]("status", Some(None)),
          cursor.decodeAs[REQUEST_INTENT]("intent", None),
          cursor.decodeAs[LitSeq[Reference]]("basedOn", Some(LitSeq.empty)),
          cursor.decodeRef[Union01025009075]("code"),
          cursor.decodeAs[Reference]("subject", None),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[REQUEST_PRIORITY]]("priority", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          cursor.decodeAs[Option[Reference]]("requester", Some(None)),
          cursor.decodeAs[Option[Reference]]("performer", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("insurance", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[FHIRDateTime]]("authoredOn", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("reasonCode", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("priorRequest", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeOptRef[Union00609373412]("occurrence"),
          cursor.decodeAs[Option[CodeableConcept]]("performerType", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("supportingInfo", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[UriStr]]("instantiatesUri", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Identifier]]("groupIdentifier", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("reasonReference", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("relevantHistory", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Canonical]]("instantiatesCanonical", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[DeviceRequest.Parameter]]("parameter", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Represents a request for a patient to employ a medical device. The device may be an implantable device, or an external
  * assistive device, such as a walker.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields note, status, intent, basedOn, code, subject, priority, encounter, requester, performer, insurance,
  *   identifier, authoredOn, reasonCode, priorRequest, occurrence, performerType, supportingInfo, instantiatesUri,
  *   groupIdentifier, reasonReference, relevantHistory, instantiatesCanonical, parameter.
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
  * @param note
  *   - Details about this request that were not represented at all or sufficiently in one of the attributes provided in a class.
  *   These may include for example a comment, an instruction, or a note associated with the statement.
  * @param status
  *   - The status of the request.
  * @param intent
  *   - Whether the request is a proposal, plan, an original order or a reflex order.
  * @param basedOn
  *   - Plan/proposal/order fulfilled by this request.
  * @param code
  *   - The details of the device to be used.
  * @param subject
  *   - The patient who will use the device.
  * @param language
  *   - The base language in which the resource is written.
  * @param priority
  *   - Indicates how quickly the {{title}} should be addressed with respect to other requests.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param encounter
  *   - An encounter that provides additional context in which this request is made.
  * @param requester
  *   - The individual who initiated the request and has responsibility for its activation.
  * @param performer
  *   - The desired performer for doing the diagnostic testing.
  * @param insurance
  *   - Insurance plans, coverage extensions, pre-authorizations and/or pre-determinations that may be required for delivering the
  *   requested service.
  * @param identifier
  *   - Identifiers assigned to this order by the orderer or by the receiver.
  * @param authoredOn
  *   - When the request transitioned to being actionable.
  * @param reasonCode
  *   - Reason or justification for the use of this device.
  * @param priorRequest
  *   - The request takes the place of the referenced completed or terminated request(s).
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param occurrence
  *   - The timing schedule for the use of the device. The Schedule data type allows many different expressions, for example.
  *   "Every 8 hours"; "Three times a day"; "1/2 an hour before breakfast for 10 days from 23-Dec 2011:"; "15 Oct 2013, 17 Oct
  *   2013 and 1 Nov 2013".
  * @param performerType
  *   - Desired type of performer for doing the diagnostic testing.
  * @param supportingInfo
  *   - Additional clinical information about the patient that may influence the request fulfilment. For example, this may include
  *   where on the subject's body the device will be used (i.e. the target site).
  * @param instantiatesUri
  *   - The URL pointing to an externally maintained protocol, guideline, orderset or other definition that is adhered to in whole
  *   or in part by this DeviceRequest.
  * @param groupIdentifier
  *   - Composite request this is part of.
  * @param reasonReference
  *   - Reason or justification for the use of this device.
  * @param relevantHistory
  *   - Key events in the history of the request.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *   the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually
  *   modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict
  *   set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param instantiatesCanonical
  *   - The URL pointing to a FHIR-defined protocol, guideline, orderset or other definition that is adhered to in whole or in
  *   part by this DeviceRequest.
  * @param parameter
  *   - Specific parameters for the ordered item. For example, the prism value for lenses.
  */
@POJOBoilerplate
class DeviceRequest(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val note: LitSeq[Annotation] = LitSeq.empty,
    val status: Option[REQUEST_STATUS] = None,
    val intent: REQUEST_INTENT,
    val basedOn: LitSeq[Reference] = LitSeq.empty,
    val code: DeviceRequest.CodeChoice,
    val subject: Reference,
    override val language: Option[LANGUAGES] = None,
    val priority: Option[REQUEST_PRIORITY] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val encounter: Option[Reference] = None,
    val requester: Option[Reference] = None,
    val performer: Option[Reference] = None,
    val insurance: LitSeq[Reference] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val authoredOn: Option[FHIRDateTime] = None,
    val reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
    val priorRequest: LitSeq[Reference] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    val occurrence: Option[DeviceRequest.OccurrenceChoice] = None,
    val performerType: Option[CodeableConcept] = None,
    val supportingInfo: LitSeq[Reference] = LitSeq.empty,
    val instantiatesUri: LitSeq[UriStr] = LitSeq.empty,
    val groupIdentifier: Option[Identifier] = None,
    val reasonReference: LitSeq[Reference] = LitSeq.empty,
    val relevantHistory: LitSeq[Reference] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val instantiatesCanonical: LitSeq[Canonical] = LitSeq.empty,
    val parameter: LitSeq[DeviceRequest.Parameter] = LitSeq.empty,
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
  override val thisTypeName: String = "DeviceRequest"
}
