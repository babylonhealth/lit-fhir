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
import com.babylonhealth.lit.hl7.{
  RESOURCE_TYPES,
  PUBLICATION_STATUS,
  MESSAGEHEADER_RESPONSE_REQUEST,
  MESSAGE_SIGNIFICANCE_CATEGORY
}
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object MessageDefinition extends CompanionFor[MessageDefinition] {
  implicit def summonObjectAndCompanionMessageDefinition_638721944(
      o: MessageDefinition): ObjectAndCompanion[MessageDefinition, MessageDefinition.type] = ObjectAndCompanion(o, this)
  override type ResourceType = MessageDefinition
  override type ParentType   = MessageDefinition
  override val baseType: CompanionFor[ResourceType] = MessageDefinition
  override val parentType: CompanionFor[ParentType] = MessageDefinition
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/MessageDefinition")
  object AllowedResponse extends CompanionFor[AllowedResponse] {
    implicit def summonObjectAndCompanionAllowedResponse807585912(
        o: AllowedResponse): ObjectAndCompanion[AllowedResponse, AllowedResponse.type] = ObjectAndCompanion(o, this)
    override type ResourceType = AllowedResponse
    override type ParentType   = AllowedResponse
    override val parentType: CompanionFor[ResourceType] = AllowedResponse
    def apply(
        id: Option[String] = None,
        message: Canonical,
        extension: LitSeq[Extension] = LitSeq.empty,
        situation: Option[Markdown] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): AllowedResponse = new AllowedResponse(
      id,
      message,
      extension,
      situation,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: AllowedResponse): Option[(Option[String], Canonical, LitSeq[Extension], Option[Markdown], LitSeq[Extension])] =
      Some((o.id, o.message, o.extension, o.situation, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val message: FHIRComponentFieldMeta[Canonical] =
      FHIRComponentFieldMeta("message", lTagOf[Canonical], false, lTagOf[Canonical])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val situation: FHIRComponentFieldMeta[Option[Markdown]] =
      FHIRComponentFieldMeta("situation", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, message, extension, situation, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: AllowedResponse): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Canonical](message, t.message),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Markdown]](situation, t.situation),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[AllowedResponse] = this
    val thisName: String                        = "AllowedResponse"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[AllowedResponse] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new AllowedResponse(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Canonical]("message", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Markdown]]("situation", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class AllowedResponse(
      override val id: Option[String] = None,
      val message: Canonical,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val situation: Option[Markdown] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Focus extends CompanionFor[Focus] {
    implicit def summonObjectAndCompanionFocus1852442267(o: Focus): ObjectAndCompanion[Focus, Focus.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Focus
    override type ParentType   = Focus
    override val parentType: CompanionFor[ResourceType] = Focus
    def apply(
        id: Option[String] = None,
        min: UnsignedInt,
        max: Option[String] = None,
        code: RESOURCE_TYPES,
        profile: Option[Canonical] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Focus = new Focus(
      id,
      min,
      max,
      code,
      profile,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Focus): Option[(Option[String], UnsignedInt, Option[String], RESOURCE_TYPES, Option[Canonical], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.min, o.max, o.code, o.profile, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val min: FHIRComponentFieldMeta[UnsignedInt] =
      FHIRComponentFieldMeta("min", lTagOf[UnsignedInt], false, lTagOf[UnsignedInt])
    val max: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("max", lTagOf[Option[String]], false, lTagOf[String])
    val code: FHIRComponentFieldMeta[RESOURCE_TYPES] =
      FHIRComponentFieldMeta("code", lTagOf[RESOURCE_TYPES], false, lTagOf[RESOURCE_TYPES])
    val profile: FHIRComponentFieldMeta[Option[Canonical]] =
      FHIRComponentFieldMeta("profile", lTagOf[Option[Canonical]], false, lTagOf[Canonical])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, min, max, code, profile, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Focus): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[UnsignedInt](min, t.min),
      FHIRComponentField[Option[String]](max, t.max),
      FHIRComponentField[RESOURCE_TYPES](code, t.code),
      FHIRComponentField[Option[Canonical]](profile, t.profile),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Focus] = this
    val thisName: String              = "Focus"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Focus] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Focus(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[UnsignedInt]("min", None),
            cursor.decodeAs[Option[String]]("max", Some(None)),
            cursor.decodeAs[RESOURCE_TYPES]("code", None),
            cursor.decodeAs[Option[Canonical]]("profile", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Focus(
      override val id: Option[String] = None,
      val min: UnsignedInt,
      val max: Option[String] = None,
      val code: RESOURCE_TYPES,
      val profile: Option[Canonical] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  type EventChoice = Choice[Union01583485927]
  def apply(
      id: Option[String] = None,
      url: Option[UriStr] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      name: Option[String] = None,
      date: FHIRDateTime,
      base: Option[Canonical] = None,
      title: Option[String] = None,
      graph: LitSeq[Canonical] = LitSeq.empty,
      status: PUBLICATION_STATUS,
      parent: LitSeq[Canonical] = LitSeq.empty,
      version: Option[String] = None,
      contact: LitSeq[ContactDetail] = LitSeq.empty,
      purpose: Option[Markdown] = None,
      language: Option[LANGUAGES] = None,
      replaces: LitSeq[Canonical] = LitSeq.empty,
      event: MessageDefinition.EventChoice,
      category: Option[MESSAGE_SIGNIFICANCE_CATEGORY] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      publisher: Option[String] = None,
      copyright: Option[Markdown] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      useContext: LitSeq[UsageContext] = LitSeq.empty,
      description: Option[Markdown] = None,
      experimental: Option[Boolean] = None,
      jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      responseRequired: Option[MESSAGEHEADER_RESPONSE_REQUEST] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      focus: LitSeq[MessageDefinition.Focus] = LitSeq.empty,
      allowedResponse: LitSeq[MessageDefinition.AllowedResponse] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): MessageDefinition = new MessageDefinition(
    id,
    url,
    meta,
    text,
    name,
    date,
    base,
    title,
    graph,
    status,
    parent,
    version,
    contact,
    purpose,
    language,
    replaces,
    event,
    category,
    contained,
    extension,
    publisher,
    copyright,
    identifier,
    useContext,
    description,
    experimental,
    jurisdiction,
    implicitRules,
    responseRequired,
    modifierExtension,
    focus,
    allowedResponse,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val url: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("url", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val name: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("name", lTagOf[Option[String]], false, lTagOf[String])
  val date: FHIRComponentFieldMeta[FHIRDateTime] =
    FHIRComponentFieldMeta("date", lTagOf[FHIRDateTime], false, lTagOf[FHIRDateTime])
  val base: FHIRComponentFieldMeta[Option[Canonical]] =
    FHIRComponentFieldMeta("base", lTagOf[Option[Canonical]], false, lTagOf[Canonical])
  val title: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("title", lTagOf[Option[String]], false, lTagOf[String])
  val graph: FHIRComponentFieldMeta[LitSeq[Canonical]] =
    FHIRComponentFieldMeta("graph", lTagOf[LitSeq[Canonical]], false, lTagOf[Canonical])
  val status: FHIRComponentFieldMeta[PUBLICATION_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[PUBLICATION_STATUS], false, lTagOf[PUBLICATION_STATUS])
  val parent: FHIRComponentFieldMeta[LitSeq[Canonical]] =
    FHIRComponentFieldMeta("parent", lTagOf[LitSeq[Canonical]], false, lTagOf[Canonical])
  val version: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("version", lTagOf[Option[String]], false, lTagOf[String])
  val contact: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("contact", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val purpose: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("purpose", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val replaces: FHIRComponentFieldMeta[LitSeq[Canonical]] =
    FHIRComponentFieldMeta("replaces", lTagOf[LitSeq[Canonical]], false, lTagOf[Canonical])
  val event: FHIRComponentFieldMeta[MessageDefinition.EventChoice] =
    FHIRComponentFieldMeta("event", lTagOf[MessageDefinition.EventChoice], true, lTagOf[Union01583485927])
  val category: FHIRComponentFieldMeta[Option[MESSAGE_SIGNIFICANCE_CATEGORY]] =
    FHIRComponentFieldMeta(
      "category",
      lTagOf[Option[MESSAGE_SIGNIFICANCE_CATEGORY]],
      false,
      lTagOf[MESSAGE_SIGNIFICANCE_CATEGORY])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val publisher: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("publisher", lTagOf[Option[String]], false, lTagOf[String])
  val copyright: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("copyright", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val useContext: FHIRComponentFieldMeta[LitSeq[UsageContext]] =
    FHIRComponentFieldMeta("useContext", lTagOf[LitSeq[UsageContext]], false, lTagOf[UsageContext])
  val description: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("description", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val experimental: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("experimental", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val jurisdiction: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("jurisdiction", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val responseRequired: FHIRComponentFieldMeta[Option[MESSAGEHEADER_RESPONSE_REQUEST]] =
    FHIRComponentFieldMeta(
      "responseRequired",
      lTagOf[Option[MESSAGEHEADER_RESPONSE_REQUEST]],
      false,
      lTagOf[MESSAGEHEADER_RESPONSE_REQUEST])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val focus: FHIRComponentFieldMeta[LitSeq[MessageDefinition.Focus]] =
    FHIRComponentFieldMeta("focus", lTagOf[LitSeq[MessageDefinition.Focus]], false, lTagOf[MessageDefinition.Focus])
  val allowedResponse: FHIRComponentFieldMeta[LitSeq[MessageDefinition.AllowedResponse]] =
    FHIRComponentFieldMeta(
      "allowedResponse",
      lTagOf[LitSeq[MessageDefinition.AllowedResponse]],
      false,
      lTagOf[MessageDefinition.AllowedResponse])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    url,
    meta,
    text,
    name,
    date,
    base,
    title,
    graph,
    status,
    parent,
    version,
    contact,
    purpose,
    language,
    replaces,
    event,
    category,
    contained,
    extension,
    publisher,
    copyright,
    identifier,
    useContext,
    description,
    experimental,
    jurisdiction,
    implicitRules,
    responseRequired,
    modifierExtension,
    focus,
    allowedResponse
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: MessageDefinition): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[UriStr]](url, t.url),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[String]](name, t.name),
    FHIRComponentField[FHIRDateTime](date, t.date),
    FHIRComponentField[Option[Canonical]](base, t.base),
    FHIRComponentField[Option[String]](title, t.title),
    FHIRComponentField[LitSeq[Canonical]](graph, t.graph),
    FHIRComponentField[PUBLICATION_STATUS](status, t.status),
    FHIRComponentField[LitSeq[Canonical]](parent, t.parent),
    FHIRComponentField[Option[String]](version, t.version),
    FHIRComponentField[LitSeq[ContactDetail]](contact, t.contact),
    FHIRComponentField[Option[Markdown]](purpose, t.purpose),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Canonical]](replaces, t.replaces),
    FHIRComponentField[MessageDefinition.EventChoice](event, t.event),
    FHIRComponentField[Option[MESSAGE_SIGNIFICANCE_CATEGORY]](category, t.category),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[String]](publisher, t.publisher),
    FHIRComponentField[Option[Markdown]](copyright, t.copyright),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[LitSeq[UsageContext]](useContext, t.useContext),
    FHIRComponentField[Option[Markdown]](description, t.description),
    FHIRComponentField[Option[Boolean]](experimental, t.experimental),
    FHIRComponentField[LitSeq[CodeableConcept]](jurisdiction, t.jurisdiction),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[MESSAGEHEADER_RESPONSE_REQUEST]](responseRequired, t.responseRequired),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[MessageDefinition.Focus]](focus, t.focus),
    FHIRComponentField[LitSeq[MessageDefinition.AllowedResponse]](allowedResponse, t.allowedResponse)
  )
  def extractId(t: MessageDefinition): Option[String]                                         = t.id
  def extractUrl(t: MessageDefinition): Option[UriStr]                                        = t.url
  def extractMeta(t: MessageDefinition): Option[Meta]                                         = t.meta
  def extractText(t: MessageDefinition): Option[Narrative]                                    = t.text
  def extractName(t: MessageDefinition): Option[String]                                       = t.name
  def extractDate(t: MessageDefinition): FHIRDateTime                                         = t.date
  def extractBase(t: MessageDefinition): Option[Canonical]                                    = t.base
  def extractTitle(t: MessageDefinition): Option[String]                                      = t.title
  def extractGraph(t: MessageDefinition): LitSeq[Canonical]                                   = t.graph
  def extractStatus(t: MessageDefinition): PUBLICATION_STATUS                                 = t.status
  def extractParent(t: MessageDefinition): LitSeq[Canonical]                                  = t.parent
  def extractVersion(t: MessageDefinition): Option[String]                                    = t.version
  def extractContact(t: MessageDefinition): LitSeq[ContactDetail]                             = t.contact
  def extractPurpose(t: MessageDefinition): Option[Markdown]                                  = t.purpose
  def extractLanguage(t: MessageDefinition): Option[LANGUAGES]                                = t.language
  def extractReplaces(t: MessageDefinition): LitSeq[Canonical]                                = t.replaces
  def extractEvent(t: MessageDefinition): MessageDefinition.EventChoice                       = t.event
  def extractCategory(t: MessageDefinition): Option[MESSAGE_SIGNIFICANCE_CATEGORY]            = t.category
  def extractContained(t: MessageDefinition): LitSeq[Resource]                                = t.contained
  def extractExtension(t: MessageDefinition): LitSeq[Extension]                               = t.extension
  def extractPublisher(t: MessageDefinition): Option[String]                                  = t.publisher
  def extractCopyright(t: MessageDefinition): Option[Markdown]                                = t.copyright
  def extractIdentifier(t: MessageDefinition): LitSeq[Identifier]                             = t.identifier
  def extractUseContext(t: MessageDefinition): LitSeq[UsageContext]                           = t.useContext
  def extractDescription(t: MessageDefinition): Option[Markdown]                              = t.description
  def extractExperimental(t: MessageDefinition): Option[Boolean]                              = t.experimental
  def extractJurisdiction(t: MessageDefinition): LitSeq[CodeableConcept]                      = t.jurisdiction
  def extractImplicitRules(t: MessageDefinition): Option[UriStr]                              = t.implicitRules
  def extractResponseRequired(t: MessageDefinition): Option[MESSAGEHEADER_RESPONSE_REQUEST]   = t.responseRequired
  def extractModifierExtension(t: MessageDefinition): LitSeq[Extension]                       = t.modifierExtension
  def extractFocus(t: MessageDefinition): LitSeq[MessageDefinition.Focus]                     = t.focus
  def extractAllowedResponse(t: MessageDefinition): LitSeq[MessageDefinition.AllowedResponse] = t.allowedResponse
  override val thisName: String                                                               = "MessageDefinition"
  override val searchParams: Map[String, MessageDefinition => Seq[Any]] = Map(
    "jurisdiction"          -> (obj => obj.jurisdiction.toSeq),
    "parent"                -> (obj => obj.parent.toSeq),
    "name"                  -> (obj => obj.name.toSeq),
    "context-type-quantity" -> (obj => obj.useContext.toSeq),
    "event"                 -> (obj => Seq(obj.event)),
    "description"           -> (obj => obj.description.toSeq),
    "context"               -> (obj => obj.useContext.map(_.value).flatMap(_.as[CodeableConcept]).toSeq),
    "focus"                 -> (obj => obj.focus.map(_.code).toSeq),
    "date"                  -> (obj => Seq(obj.date)),
    "category"              -> (obj => obj.category.toSeq),
    "context-type"          -> (obj => obj.useContext.map(_.code).toSeq),
    "identifier"            -> (obj => obj.identifier.toSeq),
    "url"                   -> (obj => obj.url.toSeq),
    "context-type-value"    -> (obj => obj.useContext.toSeq),
    "version"               -> (obj => obj.version.toSeq),
    "status"                -> (obj => Seq(obj.status)),
    "publisher"             -> (obj => obj.publisher.toSeq),
    "title"                 -> (obj => obj.title.toSeq),
    "context-quantity" -> (obj =>
      obj.useContext.map(_.value).flatMap(_.as[Quantity]).toSeq ++
        obj.useContext.map(_.value).flatMap(_.as[Range]).toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[MessageDefinition] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new MessageDefinition(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[UriStr]]("url", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[String]]("name", Some(None)),
          cursor.decodeAs[FHIRDateTime]("date", None),
          cursor.decodeAs[Option[Canonical]]("base", Some(None)),
          cursor.decodeAs[Option[String]]("title", Some(None)),
          cursor.decodeAs[LitSeq[Canonical]]("graph", Some(LitSeq.empty)),
          cursor.decodeAs[PUBLICATION_STATUS]("status", None),
          cursor.decodeAs[LitSeq[Canonical]]("parent", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("version", Some(None)),
          cursor.decodeAs[LitSeq[ContactDetail]]("contact", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Markdown]]("purpose", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Canonical]]("replaces", Some(LitSeq.empty)),
          cursor.decodeRef[Union01583485927]("event"),
          cursor.decodeAs[Option[MESSAGE_SIGNIFICANCE_CATEGORY]]("category", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("publisher", Some(None)),
          cursor.decodeAs[Option[Markdown]]("copyright", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[UsageContext]]("useContext", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Markdown]]("description", Some(None)),
          cursor.decodeAs[Option[Boolean]]("experimental", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("jurisdiction", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[MESSAGEHEADER_RESPONSE_REQUEST]]("responseRequired", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[MessageDefinition.Focus]]("focus", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[MessageDefinition.AllowedResponse]]("allowedResponse", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Defines the characteristics of a message that can be shared between systems, including the type of event that
  * initiates the message, the content to be transmitted and what response(s), if any, are permitted.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields url, name, date, base, title, graph, status, parent, version, contact, purpose, replaces,
  *   event, category, publisher, copyright, identifier, useContext, description, experimental, jurisdiction,
  *   responseRequired, focus, allowedResponse.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param url
  *   - The business identifier that is used to reference the MessageDefinition and *is* expected to be consistent from
  *   server to server.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the
  *   content might not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of
  *   the resource to a human. The narrative need not encode all the structured data, but is required to contain
  *   sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may
  *   define what content should be represented in the narrative to ensure clinical safety.
  * @param name
  *   - A natural language name identifying the message definition. This name should be usable as an identifier for the
  *   module by machine processing applications such as code generation.
  * @param date
  *   - The date (and optionally time) when the message definition was published. The date must change when the business
  *   version changes and it must change if the status code changes. In addition, it should change when the substantive
  *   content of the message definition changes.
  * @param base
  *   - The MessageDefinition that is the basis for the contents of this resource.
  * @param title
  *   - A short, descriptive, user-friendly title for the message definition.
  * @param graph
  *   - Canonical reference to a GraphDefinition. If a URL is provided, it is the canonical reference to a
  *   [GraphDefinition](graphdefinition.html) that it controls what resources are to be added to the bundle when
  *   building the document. The GraphDefinition can also specify profiles that apply to the various resources.
  * @param status
  *   - The status of this message definition. Enables tracking the life-cycle of the content.
  * @param parent
  *   - Identifies a protocol or workflow that this MessageDefinition represents a step in.
  * @param version
  *   - The identifier that is used to identify this version of the message definition when it is referenced in a
  *   specification, model, design or instance. This is an arbitrary value managed by the message definition author and
  *   is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version
  *   is not available. There is also no expectation that versions can be placed in a lexicographical sequence.
  * @param contact
  *   - Contact details to assist a user in finding and communicating with the publisher.
  * @param purpose
  *   - Explanation of why this message definition is needed and why it has been designed as it has.
  * @param language
  *   - The base language in which the resource is written.
  * @param replaces
  *   - A MessageDefinition that is superseded by this definition.
  * @param event
  *   - Event code or link to the EventDefinition.
  * @param category
  *   - The impact of the content of the message.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To
  *   make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and
  *   use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be
  *   met as part of the definition of the extension.
  * @param publisher
  *   - The name of the organization or individual that published the message definition.
  * @param copyright
  *   - A copyright statement relating to the message definition and/or its contents. Copyright statements are generally
  *   legal restrictions on the use and publishing of the message definition.
  * @param identifier
  *   - A formal identifier that is used to identify this message definition when it is represented in other formats, or
  *   referenced in a specification, model, design or an instance.
  * @param useContext
  *   - The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may
  *   be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...)
  *   and may be used to assist with indexing and searching for appropriate message definition instances.
  * @param description
  *   - A free text natural language description of the message definition from a consumer's perspective.
  * @param experimental
  *   - A Boolean value to indicate that this message definition is authored for testing purposes (or
  *   education/evaluation/marketing) and is not intended to be used for genuine usage.
  * @param jurisdiction
  *   - A legal or geographic region in which the message definition is intended to be used.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood
  *   when processing the content. Often, this is a reference to an implementation guide that defines the special rules
  *   along with other profiles etc.
  * @param responseRequired
  *   - Declare at a message definition level whether a response is required or only upon error or success, or never.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and
  *   that modifies the understanding of the element that contains it and/or the understanding of the containing
  *   element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions
  *   safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though
  *   any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the
  *   definition of the extension. Applications processing a resource are required to check for modifier extensions.
  *   Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot
  *   change the meaning of modifierExtension itself).
  * @param focus
  *   - Identifies the resource (or resources) that are being addressed by the event. For example, the Encounter for an
  *   admit message or two Account records for a merge.
  * @param allowedResponse
  *   - Indicates what types of messages may be sent as an application-level response to this message.
  */
@POJOBoilerplate
class MessageDefinition(
    override val id: Option[String] = None,
    val url: Option[UriStr] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val name: Option[String] = None,
    val date: FHIRDateTime,
    val base: Option[Canonical] = None,
    val title: Option[String] = None,
    val graph: LitSeq[Canonical] = LitSeq.empty,
    val status: PUBLICATION_STATUS,
    val parent: LitSeq[Canonical] = LitSeq.empty,
    val version: Option[String] = None,
    val contact: LitSeq[ContactDetail] = LitSeq.empty,
    val purpose: Option[Markdown] = None,
    override val language: Option[LANGUAGES] = None,
    val replaces: LitSeq[Canonical] = LitSeq.empty,
    val event: MessageDefinition.EventChoice,
    val category: Option[MESSAGE_SIGNIFICANCE_CATEGORY] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val publisher: Option[String] = None,
    val copyright: Option[Markdown] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val useContext: LitSeq[UsageContext] = LitSeq.empty,
    val description: Option[Markdown] = None,
    val experimental: Option[Boolean] = None,
    val jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    val responseRequired: Option[MESSAGEHEADER_RESPONSE_REQUEST] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val focus: LitSeq[MessageDefinition.Focus] = LitSeq.empty,
    val allowedResponse: LitSeq[MessageDefinition.AllowedResponse] = LitSeq.empty,
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
  override val thisTypeName: String = "MessageDefinition"
}
