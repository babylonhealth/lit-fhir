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
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Subscription extends CompanionFor[Subscription] {
  implicit def summonObjectAndCompanionSubscription_914517614(
      o: Subscription): ObjectAndCompanion[Subscription, Subscription.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Subscription
  override type ParentType   = Subscription
  override val baseType: CompanionFor[ResourceType] = Subscription
  override val parentType: CompanionFor[ParentType] = Subscription
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Subscription")
  object FilterBy extends CompanionFor[FilterBy] {
    implicit def summonObjectAndCompanionFilterBy1011047034(o: FilterBy): ObjectAndCompanion[FilterBy, FilterBy.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = FilterBy
    override type ParentType   = FilterBy
    override val parentType: CompanionFor[ResourceType] = FilterBy
    def apply(
        id: Option[String] = None,
        value: String,
        extension: LitSeq[Extension] = LitSeq.empty,
        resourceType: Option[UriStr] = None,
        searchModifier: Option[Code] = None,
        searchParamName: String,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): FilterBy = new FilterBy(
      id,
      value,
      extension,
      resourceType,
      searchModifier,
      searchParamName,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: FilterBy): Option[(Option[String], String, LitSeq[Extension], Option[UriStr], Option[Code], String, LitSeq[Extension])] =
      Some((o.id, o.value, o.extension, o.resourceType, o.searchModifier, o.searchParamName, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val value: FHIRComponentFieldMeta[String] =
      FHIRComponentFieldMeta("value", lTagOf[String], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val resourceType: FHIRComponentFieldMeta[Option[UriStr]] =
      FHIRComponentFieldMeta("resourceType", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
    val searchModifier: FHIRComponentFieldMeta[Option[Code]] =
      FHIRComponentFieldMeta("searchModifier", lTagOf[Option[Code]], false, lTagOf[Code])
    val searchParamName: FHIRComponentFieldMeta[String] =
      FHIRComponentFieldMeta("searchParamName", lTagOf[String], false, lTagOf[String])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, value, extension, resourceType, searchModifier, searchParamName, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: FilterBy): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[String](value, t.value),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[UriStr]](resourceType, t.resourceType),
      FHIRComponentField[Option[Code]](searchModifier, t.searchModifier),
      FHIRComponentField[String](searchParamName, t.searchParamName),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[FilterBy] = this
    val thisName: String                 = "FilterBy"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[FilterBy] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new FilterBy(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[String]("value", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[UriStr]]("resourceType", Some(None)),
            cursor.decodeAs[Option[Code]]("searchModifier", Some(None)),
            cursor.decodeAs[String]("searchParamName", None),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class FilterBy(
      override val id: Option[String] = None,
      val value: String,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val resourceType: Option[UriStr] = None,
      val searchModifier: Option[Code] = None,
      val searchParamName: String,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      end: Option[ZonedDateTime] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      name: Option[String] = None,
      topic: Canonical,
      status: Code,
      reason: Option[String] = None,
      header: LitSeq[String] = LitSeq.empty,
      contact: LitSeq[ContactPoint] = LitSeq.empty,
      timeout: Option[UnsignedInt] = None,
      content: Option[Code] = None,
      language: Option[LANGUAGES] = None,
      endpoint: Option[UrlStr] = None,
      maxCount: Option[PositiveInt] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      channelType: Coding,
      contentType: Option[Code] = None,
      implicitRules: Option[UriStr] = None,
      heartbeatPeriod: Option[UnsignedInt] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      notificationUrlLocation: Option[Code] = None,
      filterBy: LitSeq[Subscription.FilterBy] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Subscription = new Subscription(
    id,
    end,
    meta,
    text,
    name,
    topic,
    status,
    reason,
    header,
    contact,
    timeout,
    content,
    language,
    endpoint,
    maxCount,
    contained,
    extension,
    identifier,
    channelType,
    contentType,
    implicitRules,
    heartbeatPeriod,
    modifierExtension,
    notificationUrlLocation,
    filterBy,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val end: FHIRComponentFieldMeta[Option[ZonedDateTime]] =
    FHIRComponentFieldMeta("end", lTagOf[Option[ZonedDateTime]], false, lTagOf[ZonedDateTime])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val name: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("name", lTagOf[Option[String]], false, lTagOf[String])
  val topic: FHIRComponentFieldMeta[Canonical] =
    FHIRComponentFieldMeta("topic", lTagOf[Canonical], false, lTagOf[Canonical])
  val status: FHIRComponentFieldMeta[Code] =
    FHIRComponentFieldMeta("status", lTagOf[Code], false, lTagOf[Code])
  val reason: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("reason", lTagOf[Option[String]], false, lTagOf[String])
  val header: FHIRComponentFieldMeta[LitSeq[String]] =
    FHIRComponentFieldMeta("header", lTagOf[LitSeq[String]], false, lTagOf[String])
  val contact: FHIRComponentFieldMeta[LitSeq[ContactPoint]] =
    FHIRComponentFieldMeta("contact", lTagOf[LitSeq[ContactPoint]], false, lTagOf[ContactPoint])
  val timeout: FHIRComponentFieldMeta[Option[UnsignedInt]] =
    FHIRComponentFieldMeta("timeout", lTagOf[Option[UnsignedInt]], false, lTagOf[UnsignedInt])
  val content: FHIRComponentFieldMeta[Option[Code]] =
    FHIRComponentFieldMeta("content", lTagOf[Option[Code]], false, lTagOf[Code])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val endpoint: FHIRComponentFieldMeta[Option[UrlStr]] =
    FHIRComponentFieldMeta("endpoint", lTagOf[Option[UrlStr]], false, lTagOf[UrlStr])
  val maxCount: FHIRComponentFieldMeta[Option[PositiveInt]] =
    FHIRComponentFieldMeta("maxCount", lTagOf[Option[PositiveInt]], false, lTagOf[PositiveInt])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val channelType: FHIRComponentFieldMeta[Coding] =
    FHIRComponentFieldMeta("channelType", lTagOf[Coding], false, lTagOf[Coding])
  val contentType: FHIRComponentFieldMeta[Option[Code]] =
    FHIRComponentFieldMeta("contentType", lTagOf[Option[Code]], false, lTagOf[Code])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val heartbeatPeriod: FHIRComponentFieldMeta[Option[UnsignedInt]] =
    FHIRComponentFieldMeta("heartbeatPeriod", lTagOf[Option[UnsignedInt]], false, lTagOf[UnsignedInt])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val notificationUrlLocation: FHIRComponentFieldMeta[Option[Code]] =
    FHIRComponentFieldMeta("notificationUrlLocation", lTagOf[Option[Code]], false, lTagOf[Code])
  val filterBy: FHIRComponentFieldMeta[LitSeq[Subscription.FilterBy]] =
    FHIRComponentFieldMeta("filterBy", lTagOf[LitSeq[Subscription.FilterBy]], false, lTagOf[Subscription.FilterBy])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    end,
    meta,
    text,
    name,
    topic,
    status,
    reason,
    header,
    contact,
    timeout,
    content,
    language,
    endpoint,
    maxCount,
    contained,
    extension,
    identifier,
    channelType,
    contentType,
    implicitRules,
    heartbeatPeriod,
    modifierExtension,
    notificationUrlLocation,
    filterBy
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Subscription): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[ZonedDateTime]](end, t.end),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[String]](name, t.name),
    FHIRComponentField[Canonical](topic, t.topic),
    FHIRComponentField[Code](status, t.status),
    FHIRComponentField[Option[String]](reason, t.reason),
    FHIRComponentField[LitSeq[String]](header, t.header),
    FHIRComponentField[LitSeq[ContactPoint]](contact, t.contact),
    FHIRComponentField[Option[UnsignedInt]](timeout, t.timeout),
    FHIRComponentField[Option[Code]](content, t.content),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Option[UrlStr]](endpoint, t.endpoint),
    FHIRComponentField[Option[PositiveInt]](maxCount, t.maxCount),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Coding](channelType, t.channelType),
    FHIRComponentField[Option[Code]](contentType, t.contentType),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[UnsignedInt]](heartbeatPeriod, t.heartbeatPeriod),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Option[Code]](notificationUrlLocation, t.notificationUrlLocation),
    FHIRComponentField[LitSeq[Subscription.FilterBy]](filterBy, t.filterBy)
  )
  def extractId(t: Subscription): Option[String]                      = t.id
  def extractEnd(t: Subscription): Option[ZonedDateTime]              = t.end
  def extractMeta(t: Subscription): Option[Meta]                      = t.meta
  def extractText(t: Subscription): Option[Narrative]                 = t.text
  def extractName(t: Subscription): Option[String]                    = t.name
  def extractTopic(t: Subscription): Canonical                        = t.topic
  def extractStatus(t: Subscription): Code                            = t.status
  def extractReason(t: Subscription): Option[String]                  = t.reason
  def extractHeader(t: Subscription): LitSeq[String]                  = t.header
  def extractContact(t: Subscription): LitSeq[ContactPoint]           = t.contact
  def extractTimeout(t: Subscription): Option[UnsignedInt]            = t.timeout
  def extractContent(t: Subscription): Option[Code]                   = t.content
  def extractLanguage(t: Subscription): Option[LANGUAGES]             = t.language
  def extractEndpoint(t: Subscription): Option[UrlStr]                = t.endpoint
  def extractMaxCount(t: Subscription): Option[PositiveInt]           = t.maxCount
  def extractContained(t: Subscription): LitSeq[Resource]             = t.contained
  def extractExtension(t: Subscription): LitSeq[Extension]            = t.extension
  def extractIdentifier(t: Subscription): LitSeq[Identifier]          = t.identifier
  def extractChannelType(t: Subscription): Coding                     = t.channelType
  def extractContentType(t: Subscription): Option[Code]               = t.contentType
  def extractImplicitRules(t: Subscription): Option[UriStr]           = t.implicitRules
  def extractHeartbeatPeriod(t: Subscription): Option[UnsignedInt]    = t.heartbeatPeriod
  def extractModifierExtension(t: Subscription): LitSeq[Extension]    = t.modifierExtension
  def extractNotificationUrlLocation(t: Subscription): Option[Code]   = t.notificationUrlLocation
  def extractFilterBy(t: Subscription): LitSeq[Subscription.FilterBy] = t.filterBy
  override val thisName: String                                       = "Subscription"
  override val searchParams: Map[String, Subscription => Seq[Any]] = Map(
    "contact"    -> (obj => obj.contact.toSeq),
    "identifier" -> (obj => obj.identifier.toSeq),
    "status"     -> (obj => Seq(obj.status))
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Subscription] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Subscription(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[ZonedDateTime]]("end", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[String]]("name", Some(None)),
          cursor.decodeAs[Canonical]("topic", None),
          cursor.decodeAs[Code]("status", None),
          cursor.decodeAs[Option[String]]("reason", Some(None)),
          cursor.decodeAs[LitSeq[String]]("header", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[ContactPoint]]("contact", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UnsignedInt]]("timeout", Some(None)),
          cursor.decodeAs[Option[Code]]("content", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[UrlStr]]("endpoint", Some(None)),
          cursor.decodeAs[Option[PositiveInt]]("maxCount", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Coding]("channelType", None),
          cursor.decodeAs[Option[Code]]("contentType", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[UnsignedInt]]("heartbeatPeriod", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Code]]("notificationUrlLocation", Some(None)),
          cursor.decodeAs[LitSeq[Subscription.FilterBy]]("filterBy", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** The subscription resource describes a particular client's request to be notified about a SubscriptionTopic.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields end, name, topic, status, reason, header, contact, timeout, content, endpoint, maxCount, identifier,
  *   channelType, contentType, heartbeatPeriod, notificationUrlLocation, filterBy.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param end
  *   - The time for the server to turn the subscription off.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *   not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *   resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to
  *   make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be
  *   represented in the narrative to ensure clinical safety.
  * @param name
  *   - A natural language name identifying the subscription.
  * @param topic
  *   - The reference to the subscription topic to be notified about.
  * @param status
  *   - The status of the subscription, which marks the server state for managing the subscription.
  * @param reason
  *   - A description of why this subscription is defined.
  * @param header
  *   - Additional headers / information to send as part of the notification.
  * @param contact
  *   - Contact details for a human to contact about the subscription. The primary use of this for system administrator
  *   troubleshooting.
  * @param timeout
  *   - If present, the maximum amount of time a server will allow before failing a notification attempt.
  * @param content
  *   - How much of the resource content to deliver in the notification payload. The choices are an empty payload, only the
  *   resource id, or the full resource content.
  * @param language
  *   - The base language in which the resource is written.
  * @param endpoint
  *   - The url that describes the actual end-point to send messages to.
  * @param maxCount
  *   - If present, the maximum number of triggering resources that will be included in a notification bundle (e.g., a server will
  *   not include more than this number of trigger resources in a single notification). Note that this is not a strict limit on
  *   the number of entries in a bundle, as dependent resources can be included.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param identifier
  *   - A formal identifier that is used to identify this code system when it is represented in other formats, or referenced in a
  *   specification, model, design or an instance.
  * @param channelType
  *   - The type of channel to send notifications on.
  * @param contentType
  *   - The mime type to send the payload in - either application/fhir+xml, or application/fhir+json. The MIME types "text/plain"
  *   and "text/html" may also be used for Email subscriptions.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param heartbeatPeriod
  *   - If present, a 'hearbeat" notification (keepalive) is sent via this channel with an the interval period equal to this
  *   elements integer value in seconds. If not present, a heartbeat notification is not sent.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *   the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually
  *   modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict
  *   set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param notificationUrlLocation
  *   - If present, where to place URLs of resources in notifications.
  * @param filterBy
  *   - The filter properties to be applied to narrow the subscription topic stream. When multiple filters are applied, evaluates
  *   to true if all the conditions are met; otherwise it returns false. (i.e., logical AND).
  */
@POJOBoilerplate
class Subscription(
    override val id: Option[String] = None,
    val end: Option[ZonedDateTime] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val name: Option[String] = None,
    val topic: Canonical,
    val status: Code,
    val reason: Option[String] = None,
    val header: LitSeq[String] = LitSeq.empty,
    val contact: LitSeq[ContactPoint] = LitSeq.empty,
    val timeout: Option[UnsignedInt] = None,
    val content: Option[Code] = None,
    override val language: Option[LANGUAGES] = None,
    val endpoint: Option[UrlStr] = None,
    val maxCount: Option[PositiveInt] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val channelType: Coding,
    val contentType: Option[Code] = None,
    override val implicitRules: Option[UriStr] = None,
    val heartbeatPeriod: Option[UnsignedInt] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val notificationUrlLocation: Option[Code] = None,
    val filterBy: LitSeq[Subscription.FilterBy] = LitSeq.empty,
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
  override val thisTypeName: String = "Subscription"
}
