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
import com.babylonhealth.lit.hl7.{ SUBSCRIPTION_CHANNEL_TYPE, SUBSCRIPTION_STATUS }
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
  object Channel extends CompanionFor[Channel] {
    implicit def summonObjectAndCompanionChannel1011047034(o: Channel): ObjectAndCompanion[Channel, Channel.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Channel
    override type ParentType   = Channel
    override val parentType: CompanionFor[ResourceType] = Channel
    def apply(
        id: Option[String] = None,
        `type`: SUBSCRIPTION_CHANNEL_TYPE,
        header: LitSeq[String] = LitSeq.empty,
        payload: Option[Code] = None,
        endpoint: Option[UrlStr] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Channel = new Channel(
      id,
      `type`,
      header,
      payload,
      endpoint,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Channel): Option[(Option[String], SUBSCRIPTION_CHANNEL_TYPE, LitSeq[String], Option[Code], Option[UrlStr], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.`type`, o.header, o.payload, o.endpoint, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[SUBSCRIPTION_CHANNEL_TYPE] =
      FHIRComponentFieldMeta("type", lTagOf[SUBSCRIPTION_CHANNEL_TYPE], false, lTagOf[SUBSCRIPTION_CHANNEL_TYPE])
    val header: FHIRComponentFieldMeta[LitSeq[String]] =
      FHIRComponentFieldMeta("header", lTagOf[LitSeq[String]], false, lTagOf[String])
    val payload: FHIRComponentFieldMeta[Option[Code]] =
      FHIRComponentFieldMeta("payload", lTagOf[Option[Code]], false, lTagOf[Code])
    val endpoint: FHIRComponentFieldMeta[Option[UrlStr]] =
      FHIRComponentFieldMeta("endpoint", lTagOf[Option[UrlStr]], false, lTagOf[UrlStr])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, `type`, header, payload, endpoint, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Channel): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[SUBSCRIPTION_CHANNEL_TYPE](`type`, t.`type`),
      FHIRComponentField[LitSeq[String]](header, t.header),
      FHIRComponentField[Option[Code]](payload, t.payload),
      FHIRComponentField[Option[UrlStr]](endpoint, t.endpoint),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Channel] = this
    val thisName: String                = "Channel"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Channel] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Channel(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[SUBSCRIPTION_CHANNEL_TYPE]("type", None),
            cursor.decodeAs[LitSeq[String]]("header", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Code]]("payload", Some(None)),
            cursor.decodeAs[Option[UrlStr]]("endpoint", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Channel(
      override val id: Option[String] = None,
      val `type`: SUBSCRIPTION_CHANNEL_TYPE,
      val header: LitSeq[String] = LitSeq.empty,
      val payload: Option[Code] = None,
      val endpoint: Option[UrlStr] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      end: Option[ZonedDateTime] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      error: Option[String] = None,
      status: SUBSCRIPTION_STATUS,
      reason: String,
      contact: LitSeq[ContactPoint] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      criteria: String,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      channel: Subscription.Channel,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Subscription = new Subscription(
    id,
    end,
    meta,
    text,
    error,
    status,
    reason,
    contact,
    language,
    criteria,
    contained,
    extension,
    implicitRules,
    modifierExtension,
    channel,
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
  val error: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("error", lTagOf[Option[String]], false, lTagOf[String])
  val status: FHIRComponentFieldMeta[SUBSCRIPTION_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[SUBSCRIPTION_STATUS], false, lTagOf[SUBSCRIPTION_STATUS])
  val reason: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("reason", lTagOf[String], false, lTagOf[String])
  val contact: FHIRComponentFieldMeta[LitSeq[ContactPoint]] =
    FHIRComponentFieldMeta("contact", lTagOf[LitSeq[ContactPoint]], false, lTagOf[ContactPoint])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val criteria: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("criteria", lTagOf[String], false, lTagOf[String])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val channel: FHIRComponentFieldMeta[Subscription.Channel] =
    FHIRComponentFieldMeta("channel", lTagOf[Subscription.Channel], false, lTagOf[Subscription.Channel])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    end,
    meta,
    text,
    error,
    status,
    reason,
    contact,
    language,
    criteria,
    contained,
    extension,
    implicitRules,
    modifierExtension,
    channel)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Subscription): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[ZonedDateTime]](end, t.end),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[String]](error, t.error),
    FHIRComponentField[SUBSCRIPTION_STATUS](status, t.status),
    FHIRComponentField[String](reason, t.reason),
    FHIRComponentField[LitSeq[ContactPoint]](contact, t.contact),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[String](criteria, t.criteria),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Subscription.Channel](channel, t.channel)
  )
  def extractId(t: Subscription): Option[String]                   = t.id
  def extractEnd(t: Subscription): Option[ZonedDateTime]           = t.end
  def extractMeta(t: Subscription): Option[Meta]                   = t.meta
  def extractText(t: Subscription): Option[Narrative]              = t.text
  def extractError(t: Subscription): Option[String]                = t.error
  def extractStatus(t: Subscription): SUBSCRIPTION_STATUS          = t.status
  def extractReason(t: Subscription): String                       = t.reason
  def extractContact(t: Subscription): LitSeq[ContactPoint]        = t.contact
  def extractLanguage(t: Subscription): Option[LANGUAGES]          = t.language
  def extractCriteria(t: Subscription): String                     = t.criteria
  def extractContained(t: Subscription): LitSeq[Resource]          = t.contained
  def extractExtension(t: Subscription): LitSeq[Extension]         = t.extension
  def extractImplicitRules(t: Subscription): Option[UriStr]        = t.implicitRules
  def extractModifierExtension(t: Subscription): LitSeq[Extension] = t.modifierExtension
  def extractChannel(t: Subscription): Subscription.Channel        = t.channel
  override val thisName: String                                    = "Subscription"
  override val searchParams: Map[String, Subscription => Seq[Any]] = Map(
    "criteria" -> (obj => Seq(obj.criteria)),
    "contact"  -> (obj => obj.contact.toSeq),
    "status"   -> (obj => Seq(obj.status)),
    "type"     -> (obj => Seq(obj.channel.`type`)),
    "payload"  -> (obj => obj.channel.payload.toSeq),
    "url"      -> (obj => obj.channel.endpoint.toSeq)
  )
  def unapply(
      o: Subscription): Option[(Option[String], Option[ZonedDateTime], Option[Meta], Option[Narrative], Option[String], SUBSCRIPTION_STATUS, String, LitSeq[ContactPoint], Option[LANGUAGES], String, LitSeq[Resource], LitSeq[Extension], Option[UriStr], LitSeq[Extension], Subscription.Channel)] =
    Some(
      (
        o.id,
        o.end,
        o.meta,
        o.text,
        o.error,
        o.status,
        o.reason,
        o.contact,
        o.language,
        o.criteria,
        o.contained,
        o.extension,
        o.implicitRules,
        o.modifierExtension,
        o.channel))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Subscription] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Subscription(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[ZonedDateTime]]("end", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[String]]("error", Some(None)),
          cursor.decodeAs[SUBSCRIPTION_STATUS]("status", None),
          cursor.decodeAs[String]("reason", None),
          cursor.decodeAs[LitSeq[ContactPoint]]("contact", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[String]("criteria", None),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Subscription.Channel]("channel", None),
          decodeAttributes(cursor)
        )
      ))
}

/** The subscription resource is used to define a push-based subscription from a server to another system. Once a subscription is
  * registered with the server, the server checks every resource that is created or updated, and if the resource matches the given
  * criteria, it sends a message on the defined "channel" so that another system can take an appropriate action.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields end, error, status, reason, contact, criteria, channel.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param end
  *   - The time for the server to turn the subscription off.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *     not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *     resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail
  *     to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should
  *     be represented in the narrative to ensure clinical safety.
  * @param error
  *   - A record of the last error that occurred when the server processed a notification.
  * @param status
  *   - The status of the subscription, which marks the server state for managing the subscription.
  * @param reason
  *   - A description of why this subscription is defined.
  * @param contact
  *   - Contact details for a human to contact about the subscription. The primary use of this for system administrator
  *     troubleshooting.
  * @param language
  *   - The base language in which the resource is written.
  * @param criteria
  *   - The rules that the server should use to determine when to generate notifications for this subscription.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *     identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *     of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *     Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *     of the extension.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *     processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *     other profiles etc.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *     the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *     Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *     strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *     extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *     processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of
  *     any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param channel
  *   - Details where to send notifications when resources are received that meet the criteria.
  */
@POJOBoilerplate
class Subscription(
    override val id: Option[String] = None,
    val end: Option[ZonedDateTime] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val error: Option[String] = None,
    val status: SUBSCRIPTION_STATUS,
    val reason: String,
    val contact: LitSeq[ContactPoint] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    val criteria: String,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val channel: Subscription.Channel,
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
