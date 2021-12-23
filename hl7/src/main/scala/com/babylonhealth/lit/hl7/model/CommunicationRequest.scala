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
import com.babylonhealth.lit.hl7.{ REQUEST_STATUS, REQUEST_PRIORITY }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object CommunicationRequest extends CompanionFor[CommunicationRequest] {
  implicit def summonObjectAndCompanionCommunicationRequest_566800050(
      o: CommunicationRequest): ObjectAndCompanion[CommunicationRequest, CommunicationRequest.type] = ObjectAndCompanion(o, this)
  override type ResourceType = CommunicationRequest
  override type ParentType   = CommunicationRequest
  override val baseType: CompanionFor[ResourceType] = CommunicationRequest
  override val parentType: CompanionFor[ParentType] = CommunicationRequest
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/CommunicationRequest")
  object Payload extends CompanionFor[Payload] {
    implicit def summonObjectAndCompanionPayload546120690(o: Payload): ObjectAndCompanion[Payload, Payload.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Payload
    override type ParentType   = Payload
    override val parentType: CompanionFor[ResourceType] = Payload
    type ContentChoice = Choice[UnionAttachmentOrReferenceOrString]
    def apply(
        id: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        content: Payload.ContentChoice,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Payload = new Payload(
      id,
      extension,
      content,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(o: Payload): Option[(Option[String], LitSeq[Extension], Payload.ContentChoice, LitSeq[Extension])] = Some(
      (o.id, o.extension, o.content, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val content: FHIRComponentFieldMeta[Payload.ContentChoice] =
      FHIRComponentFieldMeta("content", lTagOf[Payload.ContentChoice], true, lTagOf[UnionAttachmentOrReferenceOrString])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, extension, content, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Payload): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Payload.ContentChoice](content, t.content),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Payload] = this
    val thisName: String                = "Payload"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Payload] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Payload(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeRef[UnionAttachmentOrReferenceOrString]("content"),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Payload(
      override val id: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val content: Payload.ContentChoice,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  type OccurrenceChoice = Choice[UnionDateTimeOrPeriod]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      about: LitSeq[Reference] = LitSeq.empty,
      status: REQUEST_STATUS,
      medium: LitSeq[CodeableConcept] = LitSeq.empty,
      sender: Option[Reference] = None,
      basedOn: LitSeq[Reference] = LitSeq.empty,
      subject: Option[Reference] = None,
      language: Option[LANGUAGES] = None,
      replaces: LitSeq[Reference] = LitSeq.empty,
      category: LitSeq[CodeableConcept] = LitSeq.empty,
      priority: Option[REQUEST_PRIORITY] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      encounter: Option[Reference] = None,
      requester: Option[Reference] = None,
      recipient: LitSeq[Reference] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      authoredOn: Option[FHIRDateTime] = None,
      reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
      statusReason: Option[CodeableConcept] = None,
      doNotPerform: Option[Boolean] = None,
      implicitRules: Option[UriStr] = None,
      occurrence: Option[CommunicationRequest.OccurrenceChoice] = None,
      groupIdentifier: Option[Identifier] = None,
      reasonReference: LitSeq[Reference] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      payload: LitSeq[CommunicationRequest.Payload] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): CommunicationRequest = new CommunicationRequest(
    id,
    meta,
    text,
    note,
    about,
    status,
    medium,
    sender,
    basedOn,
    subject,
    language,
    replaces,
    category,
    priority,
    contained,
    extension,
    encounter,
    requester,
    recipient,
    identifier,
    authoredOn,
    reasonCode,
    statusReason,
    doNotPerform,
    implicitRules,
    occurrence,
    groupIdentifier,
    reasonReference,
    modifierExtension,
    payload,
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
  val about: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("about", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val status: FHIRComponentFieldMeta[REQUEST_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[REQUEST_STATUS], false, lTagOf[REQUEST_STATUS])
  val medium: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("medium", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val sender: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("sender", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val basedOn: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("basedOn", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val subject: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("subject", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val replaces: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("replaces", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val category: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("category", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
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
  val recipient: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("recipient", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val authoredOn: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("authoredOn", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val reasonCode: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("reasonCode", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val statusReason: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("statusReason", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val doNotPerform: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("doNotPerform", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val occurrence: FHIRComponentFieldMeta[Option[CommunicationRequest.OccurrenceChoice]] =
    FHIRComponentFieldMeta(
      "occurrence",
      lTagOf[Option[CommunicationRequest.OccurrenceChoice]],
      true,
      lTagOf[UnionDateTimeOrPeriod])
  val groupIdentifier: FHIRComponentFieldMeta[Option[Identifier]] =
    FHIRComponentFieldMeta("groupIdentifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
  val reasonReference: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("reasonReference", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val payload: FHIRComponentFieldMeta[LitSeq[CommunicationRequest.Payload]] =
    FHIRComponentFieldMeta("payload", lTagOf[LitSeq[CommunicationRequest.Payload]], false, lTagOf[CommunicationRequest.Payload])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    note,
    about,
    status,
    medium,
    sender,
    basedOn,
    subject,
    language,
    replaces,
    category,
    priority,
    contained,
    extension,
    encounter,
    requester,
    recipient,
    identifier,
    authoredOn,
    reasonCode,
    statusReason,
    doNotPerform,
    implicitRules,
    occurrence,
    groupIdentifier,
    reasonReference,
    modifierExtension,
    payload
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: CommunicationRequest): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[LitSeq[Annotation]](note, t.note),
    FHIRComponentField[LitSeq[Reference]](about, t.about),
    FHIRComponentField[REQUEST_STATUS](status, t.status),
    FHIRComponentField[LitSeq[CodeableConcept]](medium, t.medium),
    FHIRComponentField[Option[Reference]](sender, t.sender),
    FHIRComponentField[LitSeq[Reference]](basedOn, t.basedOn),
    FHIRComponentField[Option[Reference]](subject, t.subject),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Reference]](replaces, t.replaces),
    FHIRComponentField[LitSeq[CodeableConcept]](category, t.category),
    FHIRComponentField[Option[REQUEST_PRIORITY]](priority, t.priority),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Reference]](encounter, t.encounter),
    FHIRComponentField[Option[Reference]](requester, t.requester),
    FHIRComponentField[LitSeq[Reference]](recipient, t.recipient),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[FHIRDateTime]](authoredOn, t.authoredOn),
    FHIRComponentField[LitSeq[CodeableConcept]](reasonCode, t.reasonCode),
    FHIRComponentField[Option[CodeableConcept]](statusReason, t.statusReason),
    FHIRComponentField[Option[Boolean]](doNotPerform, t.doNotPerform),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[CommunicationRequest.OccurrenceChoice]](occurrence, t.occurrence),
    FHIRComponentField[Option[Identifier]](groupIdentifier, t.groupIdentifier),
    FHIRComponentField[LitSeq[Reference]](reasonReference, t.reasonReference),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[CommunicationRequest.Payload]](payload, t.payload)
  )
  def extractId(t: CommunicationRequest): Option[String]                                        = t.id
  def extractMeta(t: CommunicationRequest): Option[Meta]                                        = t.meta
  def extractText(t: CommunicationRequest): Option[Narrative]                                   = t.text
  def extractNote(t: CommunicationRequest): LitSeq[Annotation]                                  = t.note
  def extractAbout(t: CommunicationRequest): LitSeq[Reference]                                  = t.about
  def extractStatus(t: CommunicationRequest): REQUEST_STATUS                                    = t.status
  def extractMedium(t: CommunicationRequest): LitSeq[CodeableConcept]                           = t.medium
  def extractSender(t: CommunicationRequest): Option[Reference]                                 = t.sender
  def extractBasedOn(t: CommunicationRequest): LitSeq[Reference]                                = t.basedOn
  def extractSubject(t: CommunicationRequest): Option[Reference]                                = t.subject
  def extractLanguage(t: CommunicationRequest): Option[LANGUAGES]                               = t.language
  def extractReplaces(t: CommunicationRequest): LitSeq[Reference]                               = t.replaces
  def extractCategory(t: CommunicationRequest): LitSeq[CodeableConcept]                         = t.category
  def extractPriority(t: CommunicationRequest): Option[REQUEST_PRIORITY]                        = t.priority
  def extractContained(t: CommunicationRequest): LitSeq[Resource]                               = t.contained
  def extractExtension(t: CommunicationRequest): LitSeq[Extension]                              = t.extension
  def extractEncounter(t: CommunicationRequest): Option[Reference]                              = t.encounter
  def extractRequester(t: CommunicationRequest): Option[Reference]                              = t.requester
  def extractRecipient(t: CommunicationRequest): LitSeq[Reference]                              = t.recipient
  def extractIdentifier(t: CommunicationRequest): LitSeq[Identifier]                            = t.identifier
  def extractAuthoredOn(t: CommunicationRequest): Option[FHIRDateTime]                          = t.authoredOn
  def extractReasonCode(t: CommunicationRequest): LitSeq[CodeableConcept]                       = t.reasonCode
  def extractStatusReason(t: CommunicationRequest): Option[CodeableConcept]                     = t.statusReason
  def extractDoNotPerform(t: CommunicationRequest): Option[Boolean]                             = t.doNotPerform
  def extractImplicitRules(t: CommunicationRequest): Option[UriStr]                             = t.implicitRules
  def extractOccurrence(t: CommunicationRequest): Option[CommunicationRequest.OccurrenceChoice] = t.occurrence
  def extractGroupIdentifier(t: CommunicationRequest): Option[Identifier]                       = t.groupIdentifier
  def extractReasonReference(t: CommunicationRequest): LitSeq[Reference]                        = t.reasonReference
  def extractModifierExtension(t: CommunicationRequest): LitSeq[Extension]                      = t.modifierExtension
  def extractPayload(t: CommunicationRequest): LitSeq[CommunicationRequest.Payload]             = t.payload
  override val thisName: String                                                                 = "CommunicationRequest"
  override val searchParams: Map[String, CommunicationRequest => Seq[Any]] = Map(
    "recipient"        -> (obj => obj.recipient.toSeq),
    "priority"         -> (obj => obj.priority.toSeq),
    "group-identifier" -> (obj => obj.groupIdentifier.toSeq),
    "subject"          -> (obj => obj.subject.toSeq),
    "identifier"       -> (obj => obj.identifier.toSeq),
    "requester"        -> (obj => obj.requester.toSeq),
    "medium"           -> (obj => obj.medium.toSeq),
    "occurrence"       -> (obj => obj.occurrence.flatMap(_.as[FHIRDateTime]).toSeq),
    "status"           -> (obj => Seq(obj.status)),
    "category"         -> (obj => obj.category.toSeq),
    "sender"           -> (obj => obj.sender.toSeq),
    "authored"         -> (obj => obj.authoredOn.toSeq),
    "based-on"         -> (obj => obj.basedOn.toSeq),
    "encounter"        -> (obj => obj.encounter.toSeq),
    "replaces"         -> (obj => obj.replaces.toSeq),
    "patient"          -> (obj => obj.subject.filter(_.reference.exists(_.contains("Patient/"))).toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[CommunicationRequest] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new CommunicationRequest(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("about", Some(LitSeq.empty)),
          cursor.decodeAs[REQUEST_STATUS]("status", None),
          cursor.decodeAs[LitSeq[CodeableConcept]]("medium", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("sender", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("basedOn", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("subject", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("replaces", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("category", Some(LitSeq.empty)),
          cursor.decodeAs[Option[REQUEST_PRIORITY]]("priority", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          cursor.decodeAs[Option[Reference]]("requester", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("recipient", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[FHIRDateTime]]("authoredOn", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("reasonCode", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("statusReason", Some(None)),
          cursor.decodeAs[Option[Boolean]]("doNotPerform", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeOptRef[UnionDateTimeOrPeriod]("occurrence"),
          cursor.decodeAs[Option[Identifier]]("groupIdentifier", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("reasonReference", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CommunicationRequest.Payload]]("payload", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** A request to convey information; e.g. the CDS system proposes that an alert be sent to a responsible provider, the CDS system
  * proposes that the public health agency be notified about a reportable condition.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields note, about, status, medium, sender, basedOn, subject, replaces, category, priority, encounter,
  *   requester, recipient, identifier, authoredOn, reasonCode, statusReason, doNotPerform, occurrence, groupIdentifier,
  *   reasonReference, payload.
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
  * @param note
  *   - Comments made about the request by the requester, sender, recipient, subject or other participants.
  * @param about
  *   - Other resources that pertain to this communication request and to which this communication request should be associated.
  * @param status
  *   - The status of the proposal or order.
  * @param medium
  *   - A channel that was used for this communication (e.g. email, fax).
  * @param sender
  *   - The entity (e.g. person, organization, clinical information system, or device) which is to be the source of the
  *     communication.
  * @param basedOn
  *   - A plan or proposal that is fulfilled in whole or in part by this request.
  * @param subject
  *   - The patient or group that is the focus of this communication request.
  * @param language
  *   - The base language in which the resource is written.
  * @param replaces
  *   - Completed or terminated request(s) whose function is taken by this new request.
  * @param category
  *   - The type of message to be sent such as alert, notification, reminder, instruction, etc.
  * @param priority
  *   - Characterizes how quickly the proposed act must be initiated. Includes concepts such as stat, urgent, routine.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *     identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *     of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *     Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *     of the extension.
  * @param encounter
  *   - The Encounter during which this CommunicationRequest was created or to which the creation of this record is tightly
  *     associated.
  * @param requester
  *   - The device, individual, or organization who initiated the request and has responsibility for its activation.
  * @param recipient
  *   - The entity (e.g. person, organization, clinical information system, device, group, or care team) which is the intended
  *     target of the communication.
  * @param identifier
  *   - Business identifiers assigned to this communication request by the performer or other systems which remain constant as the
  *     resource is updated and propagates from server to server.
  * @param authoredOn
  *   - For draft requests, indicates the date of initial creation. For requests with other statuses, indicates the date of
  *     activation.
  * @param reasonCode
  *   - Describes why the request is being made in coded or textual form.
  * @param statusReason
  *   - Captures the reason for the current state of the CommunicationRequest.
  * @param doNotPerform
  *   - If true indicates that the CommunicationRequest is asking for the specified action to *not* occur.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *     processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *     other profiles etc.
  * @param occurrence
  *   - The time when this communication is to occur.
  * @param groupIdentifier
  *   - A shared identifier common to all requests that were authorized more or less simultaneously by a single author,
  *     representing the identifier of the requisition, prescription or similar form.
  * @param reasonReference
  *   - Indicates another resource whose existence justifies this request.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *     the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *     Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *     strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *     extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *     processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of
  *     any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param payload
  *   - Text, attachment(s), or resource(s) to be communicated to the recipient.
  */
@POJOBoilerplate
class CommunicationRequest(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val note: LitSeq[Annotation] = LitSeq.empty,
    val about: LitSeq[Reference] = LitSeq.empty,
    val status: REQUEST_STATUS,
    val medium: LitSeq[CodeableConcept] = LitSeq.empty,
    val sender: Option[Reference] = None,
    val basedOn: LitSeq[Reference] = LitSeq.empty,
    val subject: Option[Reference] = None,
    override val language: Option[LANGUAGES] = None,
    val replaces: LitSeq[Reference] = LitSeq.empty,
    val category: LitSeq[CodeableConcept] = LitSeq.empty,
    val priority: Option[REQUEST_PRIORITY] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val encounter: Option[Reference] = None,
    val requester: Option[Reference] = None,
    val recipient: LitSeq[Reference] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val authoredOn: Option[FHIRDateTime] = None,
    val reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
    val statusReason: Option[CodeableConcept] = None,
    val doNotPerform: Option[Boolean] = None,
    override val implicitRules: Option[UriStr] = None,
    val occurrence: Option[CommunicationRequest.OccurrenceChoice] = None,
    val groupIdentifier: Option[Identifier] = None,
    val reasonReference: LitSeq[Reference] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val payload: LitSeq[CommunicationRequest.Payload] = LitSeq.empty,
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
  override val thisTypeName: String = "CommunicationRequest"
}
