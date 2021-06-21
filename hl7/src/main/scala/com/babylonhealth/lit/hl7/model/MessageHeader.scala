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
import com.babylonhealth.lit.hl7.RESPONSE_CODE
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object MessageHeader extends CompanionFor[MessageHeader] {
  implicit def summonObjectAndCompanionMessageHeader448846344(
      o: MessageHeader): ObjectAndCompanion[MessageHeader, MessageHeader.type] = ObjectAndCompanion(o, this)
  override type ResourceType = MessageHeader
  override type ParentType   = MessageHeader
  override val baseType: CompanionFor[ResourceType] = MessageHeader
  override val parentType: CompanionFor[ParentType] = MessageHeader
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/MessageHeader")
  object Destination extends CompanionFor[Destination] {
    implicit def summonObjectAndCompanionDestination1146212849(
        o: Destination): ObjectAndCompanion[Destination, Destination.type] = ObjectAndCompanion(o, this)
    override type ResourceType = Destination
    override type ParentType   = Destination
    override val parentType: CompanionFor[ResourceType] = Destination
    def apply(
        id: Option[String] = None,
        name: Option[String] = None,
        target: Option[Reference] = None,
        endpoint: UrlStr,
        receiver: Option[Reference] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Destination = new Destination(
      id,
      name,
      target,
      endpoint,
      receiver,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Destination): Option[(Option[String], Option[String], Option[Reference], UrlStr, Option[Reference], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.name, o.target, o.endpoint, o.receiver, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val name: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("name", lTagOf[Option[String]], false, lTagOf[String])
    val target: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("target", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val endpoint: FHIRComponentFieldMeta[UrlStr] =
      FHIRComponentFieldMeta("endpoint", lTagOf[UrlStr], false, lTagOf[UrlStr])
    val receiver: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("receiver", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, name, target, endpoint, receiver, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Destination): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[String]](name, t.name),
      FHIRComponentField[Option[Reference]](target, t.target),
      FHIRComponentField[UrlStr](endpoint, t.endpoint),
      FHIRComponentField[Option[Reference]](receiver, t.receiver),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Destination] = this
    val thisName: String                    = "Destination"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Destination] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Destination(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[String]]("name", Some(None)),
            cursor.decodeAs[Option[Reference]]("target", Some(None)),
            cursor.decodeAs[UrlStr]("endpoint", None),
            cursor.decodeAs[Option[Reference]]("receiver", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Destination(
      override val id: Option[String] = None,
      val name: Option[String] = None,
      val target: Option[Reference] = None,
      val endpoint: UrlStr,
      val receiver: Option[Reference] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Response extends CompanionFor[Response] {
    implicit def summonObjectAndCompanionResponse_173603133(o: Response): ObjectAndCompanion[Response, Response.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Response
    override type ParentType   = Response
    override val parentType: CompanionFor[ResourceType] = Response
    def apply(
        id: Option[String] = None,
        code: RESPONSE_CODE,
        details: Option[Reference] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        identifier: Id,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Response = new Response(
      id,
      code,
      details,
      extension,
      identifier,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Response): Option[(Option[String], RESPONSE_CODE, Option[Reference], LitSeq[Extension], Id, LitSeq[Extension])] =
      Some((o.id, o.code, o.details, o.extension, o.identifier, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val code: FHIRComponentFieldMeta[RESPONSE_CODE] =
      FHIRComponentFieldMeta("code", lTagOf[RESPONSE_CODE], false, lTagOf[RESPONSE_CODE])
    val details: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("details", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val identifier: FHIRComponentFieldMeta[Id] =
      FHIRComponentFieldMeta("identifier", lTagOf[Id], false, lTagOf[Id])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, code, details, extension, identifier, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Response): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[RESPONSE_CODE](code, t.code),
      FHIRComponentField[Option[Reference]](details, t.details),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Id](identifier, t.identifier),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Response] = this
    val thisName: String                 = "Response"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Response] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Response(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[RESPONSE_CODE]("code", None),
            cursor.decodeAs[Option[Reference]]("details", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Id]("identifier", None),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Response(
      override val id: Option[String] = None,
      val code: RESPONSE_CODE,
      val details: Option[Reference] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val identifier: Id,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Source extends CompanionFor[Source] {
    implicit def summonObjectAndCompanionSource_946251744(o: Source): ObjectAndCompanion[Source, Source.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Source
    override type ParentType   = Source
    override val parentType: CompanionFor[ResourceType] = Source
    def apply(
        id: Option[String] = None,
        name: Option[String] = None,
        version: Option[String] = None,
        contact: Option[ContactPoint] = None,
        software: Option[String] = None,
        endpoint: UrlStr,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Source = new Source(
      id,
      name,
      version,
      contact,
      software,
      endpoint,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Source): Option[(Option[String], Option[String], Option[String], Option[ContactPoint], Option[String], UrlStr, LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.name, o.version, o.contact, o.software, o.endpoint, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val name: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("name", lTagOf[Option[String]], false, lTagOf[String])
    val version: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("version", lTagOf[Option[String]], false, lTagOf[String])
    val contact: FHIRComponentFieldMeta[Option[ContactPoint]] =
      FHIRComponentFieldMeta("contact", lTagOf[Option[ContactPoint]], false, lTagOf[ContactPoint])
    val software: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("software", lTagOf[Option[String]], false, lTagOf[String])
    val endpoint: FHIRComponentFieldMeta[UrlStr] =
      FHIRComponentFieldMeta("endpoint", lTagOf[UrlStr], false, lTagOf[UrlStr])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, name, version, contact, software, endpoint, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Source): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[String]](name, t.name),
      FHIRComponentField[Option[String]](version, t.version),
      FHIRComponentField[Option[ContactPoint]](contact, t.contact),
      FHIRComponentField[Option[String]](software, t.software),
      FHIRComponentField[UrlStr](endpoint, t.endpoint),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Source] = this
    val thisName: String               = "Source"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Source] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Source(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[String]]("name", Some(None)),
            cursor.decodeAs[Option[String]]("version", Some(None)),
            cursor.decodeAs[Option[ContactPoint]]("contact", Some(None)),
            cursor.decodeAs[Option[String]]("software", Some(None)),
            cursor.decodeAs[UrlStr]("endpoint", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Source(
      override val id: Option[String] = None,
      val name: Option[String] = None,
      val version: Option[String] = None,
      val contact: Option[ContactPoint] = None,
      val software: Option[String] = None,
      val endpoint: UrlStr,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  type EventChoice = Choice[Union01583485927]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      focus: LitSeq[Reference] = LitSeq.empty,
      sender: Option[Reference] = None,
      author: Option[Reference] = None,
      reason: Option[CodeableConcept] = None,
      enterer: Option[Reference] = None,
      language: Option[LANGUAGES] = None,
      event: MessageHeader.EventChoice,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      definition: Option[Canonical] = None,
      responsible: Option[Reference] = None,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      source: MessageHeader.Source,
      response: Option[MessageHeader.Response] = None,
      destination: LitSeq[MessageHeader.Destination] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): MessageHeader = new MessageHeader(
    id,
    meta,
    text,
    focus,
    sender,
    author,
    reason,
    enterer,
    language,
    event,
    contained,
    extension,
    definition,
    responsible,
    implicitRules,
    modifierExtension,
    source,
    response,
    destination,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val focus: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("focus", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val sender: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("sender", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val author: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("author", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val reason: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("reason", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val enterer: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("enterer", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val event: FHIRComponentFieldMeta[MessageHeader.EventChoice] =
    FHIRComponentFieldMeta("event", lTagOf[MessageHeader.EventChoice], true, lTagOf[Union01583485927])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val definition: FHIRComponentFieldMeta[Option[Canonical]] =
    FHIRComponentFieldMeta("definition", lTagOf[Option[Canonical]], false, lTagOf[Canonical])
  val responsible: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("responsible", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val source: FHIRComponentFieldMeta[MessageHeader.Source] =
    FHIRComponentFieldMeta("source", lTagOf[MessageHeader.Source], false, lTagOf[MessageHeader.Source])
  val response: FHIRComponentFieldMeta[Option[MessageHeader.Response]] =
    FHIRComponentFieldMeta("response", lTagOf[Option[MessageHeader.Response]], false, lTagOf[MessageHeader.Response])
  val destination: FHIRComponentFieldMeta[LitSeq[MessageHeader.Destination]] =
    FHIRComponentFieldMeta(
      "destination",
      lTagOf[LitSeq[MessageHeader.Destination]],
      false,
      lTagOf[MessageHeader.Destination])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    focus,
    sender,
    author,
    reason,
    enterer,
    language,
    event,
    contained,
    extension,
    definition,
    responsible,
    implicitRules,
    modifierExtension,
    source,
    response,
    destination
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: MessageHeader): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[LitSeq[Reference]](focus, t.focus),
    FHIRComponentField[Option[Reference]](sender, t.sender),
    FHIRComponentField[Option[Reference]](author, t.author),
    FHIRComponentField[Option[CodeableConcept]](reason, t.reason),
    FHIRComponentField[Option[Reference]](enterer, t.enterer),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[MessageHeader.EventChoice](event, t.event),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Canonical]](definition, t.definition),
    FHIRComponentField[Option[Reference]](responsible, t.responsible),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[MessageHeader.Source](source, t.source),
    FHIRComponentField[Option[MessageHeader.Response]](response, t.response),
    FHIRComponentField[LitSeq[MessageHeader.Destination]](destination, t.destination)
  )
  def extractId(t: MessageHeader): Option[String]                             = t.id
  def extractMeta(t: MessageHeader): Option[Meta]                             = t.meta
  def extractText(t: MessageHeader): Option[Narrative]                        = t.text
  def extractFocus(t: MessageHeader): LitSeq[Reference]                       = t.focus
  def extractSender(t: MessageHeader): Option[Reference]                      = t.sender
  def extractAuthor(t: MessageHeader): Option[Reference]                      = t.author
  def extractReason(t: MessageHeader): Option[CodeableConcept]                = t.reason
  def extractEnterer(t: MessageHeader): Option[Reference]                     = t.enterer
  def extractLanguage(t: MessageHeader): Option[LANGUAGES]                    = t.language
  def extractEvent(t: MessageHeader): MessageHeader.EventChoice               = t.event
  def extractContained(t: MessageHeader): LitSeq[Resource]                    = t.contained
  def extractExtension(t: MessageHeader): LitSeq[Extension]                   = t.extension
  def extractDefinition(t: MessageHeader): Option[Canonical]                  = t.definition
  def extractResponsible(t: MessageHeader): Option[Reference]                 = t.responsible
  def extractImplicitRules(t: MessageHeader): Option[UriStr]                  = t.implicitRules
  def extractModifierExtension(t: MessageHeader): LitSeq[Extension]           = t.modifierExtension
  def extractSource(t: MessageHeader): MessageHeader.Source                   = t.source
  def extractResponse(t: MessageHeader): Option[MessageHeader.Response]       = t.response
  def extractDestination(t: MessageHeader): LitSeq[MessageHeader.Destination] = t.destination
  override val thisName: String                                               = "MessageHeader"
  override val searchParams: Map[String, MessageHeader => Seq[Any]] = Map(
    "author"          -> (obj => obj.author.toSeq),
    "source"          -> (obj => obj.source.name.toSeq),
    "event"           -> (obj => Seq(obj.event)),
    "responsible"     -> (obj => obj.responsible.toSeq),
    "response-id"     -> (obj => obj.response.map(_.identifier).toSeq),
    "receiver"        -> (obj => obj.destination.flatMap(_.receiver).toSeq),
    "code"            -> (obj => obj.response.map(_.code).toSeq),
    "focus"           -> (obj => obj.focus.toSeq),
    "source-uri"      -> (obj => Seq(obj.source.endpoint)),
    "destination-uri" -> (obj => obj.destination.map(_.endpoint).toSeq),
    "sender"          -> (obj => obj.sender.toSeq),
    "target"          -> (obj => obj.destination.flatMap(_.target).toSeq),
    "destination"     -> (obj => obj.destination.flatMap(_.name).toSeq),
    "enterer"         -> (obj => obj.enterer.toSeq)
  )
  def unapply(
      o: MessageHeader): Option[(Option[String], Option[Meta], Option[Narrative], LitSeq[Reference], Option[Reference], Option[Reference], Option[CodeableConcept], Option[Reference], Option[LANGUAGES], MessageHeader.EventChoice, LitSeq[Resource], LitSeq[Extension], Option[Canonical], Option[Reference], Option[UriStr], LitSeq[Extension], MessageHeader.Source, Option[MessageHeader.Response], LitSeq[MessageHeader.Destination])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.focus,
        o.sender,
        o.author,
        o.reason,
        o.enterer,
        o.language,
        o.event,
        o.contained,
        o.extension,
        o.definition,
        o.responsible,
        o.implicitRules,
        o.modifierExtension,
        o.source,
        o.response,
        o.destination))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[MessageHeader] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new MessageHeader(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("focus", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("sender", Some(None)),
          cursor.decodeAs[Option[Reference]]("author", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("reason", Some(None)),
          cursor.decodeAs[Option[Reference]]("enterer", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeRef[Union01583485927]("event"),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Canonical]]("definition", Some(None)),
          cursor.decodeAs[Option[Reference]]("responsible", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[MessageHeader.Source]("source", None),
          cursor.decodeAs[Option[MessageHeader.Response]]("response", Some(None)),
          cursor.decodeAs[LitSeq[MessageHeader.Destination]]("destination", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** The header for a message exchange that is either requesting or responding to an action. The reference(s) that are
  * the subject of the action as well as other information related to the action are typically transmitted in a bundle
  * in which the MessageHeader resource instance is the first resource in the bundle.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields focus, sender, author, reason, enterer, event, definition, responsible, source, response,
  *   destination.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the
  *   content might not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of
  *   the resource to a human. The narrative need not encode all the structured data, but is required to contain
  *   sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may
  *   define what content should be represented in the narrative to ensure clinical safety.
  * @param focus
  *   - The actual data of the message - a reference to the root/focus class of the event.
  * @param sender
  *   - Identifies the sending system to allow the use of a trust relationship.
  * @param author
  *   - The logical author of the message - the person or device that decided the described event should happen. When
  *   there is more than one candidate, pick the most proximal to the MessageHeader. Can provide other authors in
  *   extensions.
  * @param reason
  *   - Coded indication of the cause for the event - indicates a reason for the occurrence of the event that is a focus
  *   of this message.
  * @param enterer
  *   - The person or device that performed the data entry leading to this message. When there is more than one
  *   candidate, pick the most proximal to the message. Can provide other enterers in extensions.
  * @param language
  *   - The base language in which the resource is written.
  * @param event
  *   - Code that identifies the event this message represents and connects it with its definition. Events defined as
  *   part of the FHIR specification have the system value "http://terminology.hl7.org/CodeSystem/message-events".
  *   Alternatively uri to the EventDefinition.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To
  *   make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and
  *   use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be
  *   met as part of the definition of the extension.
  * @param definition
  *   - Permanent link to the MessageDefinition for this message.
  * @param responsible
  *   - The person or organization that accepts overall responsibility for the contents of the message. The implication
  *   is that the message event happened under the policies of the responsible party.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood
  *   when processing the content. Often, this is a reference to an implementation guide that defines the special rules
  *   along with other profiles etc.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and
  *   that modifies the understanding of the element that contains it and/or the understanding of the containing
  *   element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions
  *   safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though
  *   any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the
  *   definition of the extension. Applications processing a resource are required to check for modifier extensions.
  *   Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot
  *   change the meaning of modifierExtension itself).
  * @param source
  *   - The source application from which this message originated.
  * @param response
  *   - Information about the message that this message is a response to. Only present if this message is a response.
  * @param destination
  *   - The destination application which the message is intended for.
  */
@POJOBoilerplate
class MessageHeader(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val focus: LitSeq[Reference] = LitSeq.empty,
    val sender: Option[Reference] = None,
    val author: Option[Reference] = None,
    val reason: Option[CodeableConcept] = None,
    val enterer: Option[Reference] = None,
    override val language: Option[LANGUAGES] = None,
    val event: MessageHeader.EventChoice,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val definition: Option[Canonical] = None,
    val responsible: Option[Reference] = None,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val source: MessageHeader.Source,
    val response: Option[MessageHeader.Response] = None,
    val destination: LitSeq[MessageHeader.Destination] = LitSeq.empty,
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
  override val thisTypeName: String = "MessageHeader"
}
