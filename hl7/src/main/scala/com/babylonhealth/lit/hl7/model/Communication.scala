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
import com.babylonhealth.lit.hl7.{ REQUEST_PRIORITY, EVENT_STATUS }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Communication extends CompanionFor[Communication] {
  implicit def summonObjectAndCompanionCommunication_1307924991(
      o: Communication): ObjectAndCompanion[Communication, Communication.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Communication
  override type ParentType   = Communication
  override val baseType: CompanionFor[ResourceType] = Communication
  override val parentType: CompanionFor[ParentType] = Communication
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Communication")
  object Payload extends CompanionFor[Payload] {
    implicit def summonObjectAndCompanionPayload_472645780(o: Payload): ObjectAndCompanion[Payload, Payload.type] =
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
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      sent: Option[FHIRDateTime] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      topic: Option[CodeableConcept] = None,
      about: LitSeq[Reference] = LitSeq.empty,
      partOf: LitSeq[Reference] = LitSeq.empty,
      status: EVENT_STATUS,
      medium: LitSeq[CodeableConcept] = LitSeq.empty,
      sender: Option[Reference] = None,
      basedOn: LitSeq[Reference] = LitSeq.empty,
      subject: Option[Reference] = None,
      language: Option[LANGUAGES] = None,
      category: LitSeq[CodeableConcept] = LitSeq.empty,
      priority: Option[REQUEST_PRIORITY] = None,
      received: Option[FHIRDateTime] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      encounter: Option[Reference] = None,
      recipient: LitSeq[Reference] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
      inResponseTo: LitSeq[Reference] = LitSeq.empty,
      statusReason: Option[CodeableConcept] = None,
      implicitRules: Option[UriStr] = None,
      instantiatesUri: LitSeq[UriStr] = LitSeq.empty,
      reasonReference: LitSeq[Reference] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      instantiatesCanonical: LitSeq[Canonical] = LitSeq.empty,
      payload: LitSeq[Communication.Payload] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Communication = new Communication(
    id,
    meta,
    text,
    sent,
    note,
    topic,
    about,
    partOf,
    status,
    medium,
    sender,
    basedOn,
    subject,
    language,
    category,
    priority,
    received,
    contained,
    extension,
    encounter,
    recipient,
    identifier,
    reasonCode,
    inResponseTo,
    statusReason,
    implicitRules,
    instantiatesUri,
    reasonReference,
    modifierExtension,
    instantiatesCanonical,
    payload,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val sent: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("sent", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val topic: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("topic", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val about: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("about", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val partOf: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("partOf", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val status: FHIRComponentFieldMeta[EVENT_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[EVENT_STATUS], false, lTagOf[EVENT_STATUS])
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
  val category: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("category", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val priority: FHIRComponentFieldMeta[Option[REQUEST_PRIORITY]] =
    FHIRComponentFieldMeta("priority", lTagOf[Option[REQUEST_PRIORITY]], false, lTagOf[REQUEST_PRIORITY])
  val received: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("received", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val encounter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("encounter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val recipient: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("recipient", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val reasonCode: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("reasonCode", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val inResponseTo: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("inResponseTo", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val statusReason: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("statusReason", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val instantiatesUri: FHIRComponentFieldMeta[LitSeq[UriStr]] =
    FHIRComponentFieldMeta("instantiatesUri", lTagOf[LitSeq[UriStr]], false, lTagOf[UriStr])
  val reasonReference: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("reasonReference", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val instantiatesCanonical: FHIRComponentFieldMeta[LitSeq[Canonical]] =
    FHIRComponentFieldMeta("instantiatesCanonical", lTagOf[LitSeq[Canonical]], false, lTagOf[Canonical])
  val payload: FHIRComponentFieldMeta[LitSeq[Communication.Payload]] =
    FHIRComponentFieldMeta("payload", lTagOf[LitSeq[Communication.Payload]], false, lTagOf[Communication.Payload])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    sent,
    note,
    topic,
    about,
    partOf,
    status,
    medium,
    sender,
    basedOn,
    subject,
    language,
    category,
    priority,
    received,
    contained,
    extension,
    encounter,
    recipient,
    identifier,
    reasonCode,
    inResponseTo,
    statusReason,
    implicitRules,
    instantiatesUri,
    reasonReference,
    modifierExtension,
    instantiatesCanonical,
    payload
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Communication): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[FHIRDateTime]](sent, t.sent),
    FHIRComponentField[LitSeq[Annotation]](note, t.note),
    FHIRComponentField[Option[CodeableConcept]](topic, t.topic),
    FHIRComponentField[LitSeq[Reference]](about, t.about),
    FHIRComponentField[LitSeq[Reference]](partOf, t.partOf),
    FHIRComponentField[EVENT_STATUS](status, t.status),
    FHIRComponentField[LitSeq[CodeableConcept]](medium, t.medium),
    FHIRComponentField[Option[Reference]](sender, t.sender),
    FHIRComponentField[LitSeq[Reference]](basedOn, t.basedOn),
    FHIRComponentField[Option[Reference]](subject, t.subject),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[CodeableConcept]](category, t.category),
    FHIRComponentField[Option[REQUEST_PRIORITY]](priority, t.priority),
    FHIRComponentField[Option[FHIRDateTime]](received, t.received),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Reference]](encounter, t.encounter),
    FHIRComponentField[LitSeq[Reference]](recipient, t.recipient),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[LitSeq[CodeableConcept]](reasonCode, t.reasonCode),
    FHIRComponentField[LitSeq[Reference]](inResponseTo, t.inResponseTo),
    FHIRComponentField[Option[CodeableConcept]](statusReason, t.statusReason),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[UriStr]](instantiatesUri, t.instantiatesUri),
    FHIRComponentField[LitSeq[Reference]](reasonReference, t.reasonReference),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[Canonical]](instantiatesCanonical, t.instantiatesCanonical),
    FHIRComponentField[LitSeq[Communication.Payload]](payload, t.payload)
  )
  def extractId(t: Communication): Option[String]                       = t.id
  def extractMeta(t: Communication): Option[Meta]                       = t.meta
  def extractText(t: Communication): Option[Narrative]                  = t.text
  def extractSent(t: Communication): Option[FHIRDateTime]               = t.sent
  def extractNote(t: Communication): LitSeq[Annotation]                 = t.note
  def extractTopic(t: Communication): Option[CodeableConcept]           = t.topic
  def extractAbout(t: Communication): LitSeq[Reference]                 = t.about
  def extractPartOf(t: Communication): LitSeq[Reference]                = t.partOf
  def extractStatus(t: Communication): EVENT_STATUS                     = t.status
  def extractMedium(t: Communication): LitSeq[CodeableConcept]          = t.medium
  def extractSender(t: Communication): Option[Reference]                = t.sender
  def extractBasedOn(t: Communication): LitSeq[Reference]               = t.basedOn
  def extractSubject(t: Communication): Option[Reference]               = t.subject
  def extractLanguage(t: Communication): Option[LANGUAGES]              = t.language
  def extractCategory(t: Communication): LitSeq[CodeableConcept]        = t.category
  def extractPriority(t: Communication): Option[REQUEST_PRIORITY]       = t.priority
  def extractReceived(t: Communication): Option[FHIRDateTime]           = t.received
  def extractContained(t: Communication): LitSeq[Resource]              = t.contained
  def extractExtension(t: Communication): LitSeq[Extension]             = t.extension
  def extractEncounter(t: Communication): Option[Reference]             = t.encounter
  def extractRecipient(t: Communication): LitSeq[Reference]             = t.recipient
  def extractIdentifier(t: Communication): LitSeq[Identifier]           = t.identifier
  def extractReasonCode(t: Communication): LitSeq[CodeableConcept]      = t.reasonCode
  def extractInResponseTo(t: Communication): LitSeq[Reference]          = t.inResponseTo
  def extractStatusReason(t: Communication): Option[CodeableConcept]    = t.statusReason
  def extractImplicitRules(t: Communication): Option[UriStr]            = t.implicitRules
  def extractInstantiatesUri(t: Communication): LitSeq[UriStr]          = t.instantiatesUri
  def extractReasonReference(t: Communication): LitSeq[Reference]       = t.reasonReference
  def extractModifierExtension(t: Communication): LitSeq[Extension]     = t.modifierExtension
  def extractInstantiatesCanonical(t: Communication): LitSeq[Canonical] = t.instantiatesCanonical
  def extractPayload(t: Communication): LitSeq[Communication.Payload]   = t.payload
  override val thisName: String                                         = "Communication"
  override val searchParams: Map[String, Communication => Seq[Any]] = Map(
    "recipient"              -> (obj => obj.recipient.toSeq),
    "subject"                -> (obj => obj.subject.toSeq),
    "medium"                 -> (obj => obj.medium.toSeq),
    "status"                 -> (obj => Seq(obj.status)),
    "sender"                 -> (obj => obj.sender.toSeq),
    "part-of"                -> (obj => obj.partOf.toSeq),
    "based-on"               -> (obj => obj.basedOn.toSeq),
    "encounter"              -> (obj => obj.encounter.toSeq),
    "received"               -> (obj => obj.received.toSeq),
    "instantiates-uri"       -> (obj => obj.instantiatesUri.toSeq),
    "identifier"             -> (obj => obj.identifier.toSeq),
    "sent"                   -> (obj => obj.sent.toSeq),
    "category"               -> (obj => obj.category.toSeq),
    "instantiates-canonical" -> (obj => obj.instantiatesCanonical.toSeq),
    "patient"                -> (obj => obj.subject.filter(_.reference.exists(_.contains("Patient/"))).toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Communication] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Communication(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("sent", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("topic", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("about", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("partOf", Some(LitSeq.empty)),
          cursor.decodeAs[EVENT_STATUS]("status", None),
          cursor.decodeAs[LitSeq[CodeableConcept]]("medium", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("sender", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("basedOn", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("subject", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("category", Some(LitSeq.empty)),
          cursor.decodeAs[Option[REQUEST_PRIORITY]]("priority", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("received", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("recipient", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("reasonCode", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("inResponseTo", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("statusReason", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[UriStr]]("instantiatesUri", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("reasonReference", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Canonical]]("instantiatesCanonical", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Communication.Payload]]("payload", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** An occurrence of information being transmitted; e.g. an alert that was sent to a responsible provider, a public health agency
  * that was notified about a reportable condition.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields sent, note, topic, about, partOf, status, medium, sender, basedOn, subject, category, priority,
  *   received, encounter, recipient, identifier, reasonCode, inResponseTo, statusReason, instantiatesUri, reasonReference,
  *   instantiatesCanonical, payload.
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
  * @param sent
  *   - The time when this communication was sent.
  * @param note
  *   - Additional notes or commentary about the communication by the sender, receiver or other interested parties.
  * @param topic
  *   - Description of the purpose/content, similar to a subject line in an email.
  * @param about
  *   - Other resources that pertain to this communication and to which this communication should be associated.
  * @param partOf
  *   - Part of this action.
  * @param status
  *   - The status of the transmission.
  * @param medium
  *   - A channel that was used for this communication (e.g. email, fax).
  * @param sender
  *   - The entity (e.g. person, organization, clinical information system, or device) which was the source of the communication.
  * @param basedOn
  *   - An order, proposal or plan fulfilled in whole or in part by this Communication.
  * @param subject
  *   - The patient or group that was the focus of this communication.
  * @param language
  *   - The base language in which the resource is written.
  * @param category
  *   - The type of message conveyed such as alert, notification, reminder, instruction, etc.
  * @param priority
  *   - Characterizes how quickly the planned or in progress communication must be addressed. Includes concepts such as stat,
  *     urgent, routine.
  * @param received
  *   - The time when this communication arrived at the destination.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *     identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *     of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *     Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *     of the extension.
  * @param encounter
  *   - The Encounter during which this Communication was created or to which the creation of this record is tightly associated.
  * @param recipient
  *   - The entity (e.g. person, organization, clinical information system, care team or device) which was the target of the
  *     communication. If receipts need to be tracked by an individual, a separate resource instance will need to be created for
  *     each recipient. Multiple recipient communications are intended where either receipts are not tracked (e.g. a mass
  *     mail-out) or a receipt is captured in aggregate (all emails confirmed received by a particular time).
  * @param identifier
  *   - Business identifiers assigned to this communication by the performer or other systems which remain constant as the
  *     resource is updated and propagates from server to server.
  * @param reasonCode
  *   - The reason or justification for the communication.
  * @param inResponseTo
  *   - Prior communication that this communication is in response to.
  * @param statusReason
  *   - Captures the reason for the current state of the Communication.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *     processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *     other profiles etc.
  * @param instantiatesUri
  *   - The URL pointing to an externally maintained protocol, guideline, orderset or other definition that is adhered to in whole
  *     or in part by this Communication.
  * @param reasonReference
  *   - Indicates another resource whose existence justifies this communication.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *     the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *     Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *     strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *     extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *     processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of
  *     any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param instantiatesCanonical
  *   - The URL pointing to a FHIR-defined protocol, guideline, orderset or other definition that is adhered to in whole or in
  *     part by this Communication.
  * @param payload
  *   - Text, attachment(s), or resource(s) that was communicated to the recipient.
  */
@POJOBoilerplate
class Communication(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val sent: Option[FHIRDateTime] = None,
    val note: LitSeq[Annotation] = LitSeq.empty,
    val topic: Option[CodeableConcept] = None,
    val about: LitSeq[Reference] = LitSeq.empty,
    val partOf: LitSeq[Reference] = LitSeq.empty,
    val status: EVENT_STATUS,
    val medium: LitSeq[CodeableConcept] = LitSeq.empty,
    val sender: Option[Reference] = None,
    val basedOn: LitSeq[Reference] = LitSeq.empty,
    val subject: Option[Reference] = None,
    override val language: Option[LANGUAGES] = None,
    val category: LitSeq[CodeableConcept] = LitSeq.empty,
    val priority: Option[REQUEST_PRIORITY] = None,
    val received: Option[FHIRDateTime] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val encounter: Option[Reference] = None,
    val recipient: LitSeq[Reference] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
    val inResponseTo: LitSeq[Reference] = LitSeq.empty,
    val statusReason: Option[CodeableConcept] = None,
    override val implicitRules: Option[UriStr] = None,
    val instantiatesUri: LitSeq[UriStr] = LitSeq.empty,
    val reasonReference: LitSeq[Reference] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val instantiatesCanonical: LitSeq[Canonical] = LitSeq.empty,
    val payload: LitSeq[Communication.Payload] = LitSeq.empty,
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
      primitiveAttributes = primitiveAttributes
    ) {
  override val thisTypeName: String = "Communication"
}
