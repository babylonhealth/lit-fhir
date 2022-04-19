package com.babylonhealth.lit.hl7.model

import java.time.{ LocalDate, LocalTime, ZonedDateTime }
import java.util.UUID

import scala.collection.immutable.TreeMap
import scala.util.{ Success, Try }

import io.circe.{ Decoder, HCursor }

import org.slf4j.{ Logger, LoggerFactory }
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
import com.babylonhealth.lit.hl7.{ BUNDLE_TYPE, SEARCH_ENTRY_MODE, HTTP_VERB }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Bundle extends CompanionFor[Bundle] {
  implicit def summonObjectAndCompanionBundle_1121770313(o: Bundle): ObjectAndCompanion[Bundle, Bundle.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Bundle
  override type ParentType   = Bundle
  override val baseType: CompanionFor[ResourceType] = Bundle
  override val parentType: CompanionFor[ParentType] = Bundle
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Bundle")
  object Entry extends CompanionFor[Entry] {
    implicit def summonObjectAndCompanionEntry_293062332(o: Entry): ObjectAndCompanion[Entry, Entry.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Entry
    override type ParentType   = Entry
    override val parentType: CompanionFor[ResourceType] = Entry
    object Search extends CompanionFor[Search] {
      implicit def summonObjectAndCompanionSearch2135182662(o: Search): ObjectAndCompanion[Search, Search.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Search
      override type ParentType   = Search
      override val parentType: CompanionFor[ResourceType] = Search
      def apply(
          id: Option[String] = None,
          mode: Option[SEARCH_ENTRY_MODE] = None,
          score: Option[BigDecimal] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Search = new Search(
        id,
        mode,
        score,
        extension,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Search): Option[(Option[String], Option[SEARCH_ENTRY_MODE], Option[BigDecimal], LitSeq[Extension], LitSeq[Extension])] =
        Some((o.id, o.mode, o.score, o.extension, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val mode: FHIRComponentFieldMeta[Option[SEARCH_ENTRY_MODE]] =
        FHIRComponentFieldMeta("mode", lTagOf[Option[SEARCH_ENTRY_MODE]], false, lTagOf[SEARCH_ENTRY_MODE])
      val score: FHIRComponentFieldMeta[Option[BigDecimal]] =
        FHIRComponentFieldMeta("score", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, mode, score, extension, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Search): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[SEARCH_ENTRY_MODE]](mode, t.mode),
        FHIRComponentField[Option[BigDecimal]](score, t.score),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Search] = this
      val thisName: String               = "Search"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Search] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Search(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[SEARCH_ENTRY_MODE]]("mode", Some(None)),
              cursor.decodeAs[Option[BigDecimal]]("score", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Search(
        override val id: Option[String] = None,
        val mode: Option[SEARCH_ENTRY_MODE] = None,
        val score: Option[BigDecimal] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object Request extends CompanionFor[Request] {
      implicit def summonObjectAndCompanionRequest2135182662(o: Request): ObjectAndCompanion[Request, Request.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Request
      override type ParentType   = Request
      override val parentType: CompanionFor[ResourceType] = Request
      def apply(
          id: Option[String] = None,
          url: UriStr,
          method: HTTP_VERB,
          ifMatch: Option[String] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          ifNoneMatch: Option[String] = None,
          ifNoneExist: Option[String] = None,
          ifModifiedSince: Option[ZonedDateTime] = None,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Request = new Request(
        id,
        url,
        method,
        ifMatch,
        extension,
        ifNoneMatch,
        ifNoneExist,
        ifModifiedSince,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Request): Option[(Option[String], UriStr, HTTP_VERB, Option[String], LitSeq[Extension], Option[String], Option[String], Option[ZonedDateTime], LitSeq[Extension])] =
        Some(
          (o.id, o.url, o.method, o.ifMatch, o.extension, o.ifNoneMatch, o.ifNoneExist, o.ifModifiedSince, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val url: FHIRComponentFieldMeta[UriStr] =
        FHIRComponentFieldMeta("url", lTagOf[UriStr], false, lTagOf[UriStr])
      val method: FHIRComponentFieldMeta[HTTP_VERB] =
        FHIRComponentFieldMeta("method", lTagOf[HTTP_VERB], false, lTagOf[HTTP_VERB])
      val ifMatch: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("ifMatch", lTagOf[Option[String]], false, lTagOf[String])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val ifNoneMatch: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("ifNoneMatch", lTagOf[Option[String]], false, lTagOf[String])
      val ifNoneExist: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("ifNoneExist", lTagOf[Option[String]], false, lTagOf[String])
      val ifModifiedSince: FHIRComponentFieldMeta[Option[ZonedDateTime]] =
        FHIRComponentFieldMeta("ifModifiedSince", lTagOf[Option[ZonedDateTime]], false, lTagOf[ZonedDateTime])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
        Seq(id, url, method, ifMatch, extension, ifNoneMatch, ifNoneExist, ifModifiedSince, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Request): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[UriStr](url, t.url),
        FHIRComponentField[HTTP_VERB](method, t.method),
        FHIRComponentField[Option[String]](ifMatch, t.ifMatch),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[String]](ifNoneMatch, t.ifNoneMatch),
        FHIRComponentField[Option[String]](ifNoneExist, t.ifNoneExist),
        FHIRComponentField[Option[ZonedDateTime]](ifModifiedSince, t.ifModifiedSince),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Request] = this
      val thisName: String                = "Request"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Request] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Request(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[UriStr]("url", None),
              cursor.decodeAs[HTTP_VERB]("method", None),
              cursor.decodeAs[Option[String]]("ifMatch", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[String]]("ifNoneMatch", Some(None)),
              cursor.decodeAs[Option[String]]("ifNoneExist", Some(None)),
              cursor.decodeAs[Option[ZonedDateTime]]("ifModifiedSince", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Request(
        override val id: Option[String] = None,
        val url: UriStr,
        val method: HTTP_VERB,
        val ifMatch: Option[String] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val ifNoneMatch: Option[String] = None,
        val ifNoneExist: Option[String] = None,
        val ifModifiedSince: Option[ZonedDateTime] = None,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object Response extends CompanionFor[Response] {
      implicit def summonObjectAndCompanionResponse2135182662(o: Response): ObjectAndCompanion[Response, Response.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Response
      override type ParentType   = Response
      override val parentType: CompanionFor[ResourceType] = Response
      def apply(
          id: Option[String] = None,
          etag: Option[String] = None,
          status: String,
          outcome: Option[Resource] = None,
          location: Option[UriStr] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          lastModified: Option[ZonedDateTime] = None,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Response = new Response(
        id,
        etag,
        status,
        outcome,
        location,
        extension,
        lastModified,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Response): Option[(Option[String], Option[String], String, Option[Resource], Option[UriStr], LitSeq[Extension], Option[ZonedDateTime], LitSeq[Extension])] =
        Some((o.id, o.etag, o.status, o.outcome, o.location, o.extension, o.lastModified, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val etag: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("etag", lTagOf[Option[String]], false, lTagOf[String])
      val status: FHIRComponentFieldMeta[String] =
        FHIRComponentFieldMeta("status", lTagOf[String], false, lTagOf[String])
      val outcome: FHIRComponentFieldMeta[Option[Resource]] =
        FHIRComponentFieldMeta("outcome", lTagOf[Option[Resource]], false, lTagOf[Resource])
      val location: FHIRComponentFieldMeta[Option[UriStr]] =
        FHIRComponentFieldMeta("location", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val lastModified: FHIRComponentFieldMeta[Option[ZonedDateTime]] =
        FHIRComponentFieldMeta("lastModified", lTagOf[Option[ZonedDateTime]], false, lTagOf[ZonedDateTime])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
        Seq(id, etag, status, outcome, location, extension, lastModified, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Response): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[String]](etag, t.etag),
        FHIRComponentField[String](status, t.status),
        FHIRComponentField[Option[Resource]](outcome, t.outcome),
        FHIRComponentField[Option[UriStr]](location, t.location),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[ZonedDateTime]](lastModified, t.lastModified),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Response] = this
      val thisName: String                 = "Response"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Response] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Response(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[String]]("etag", Some(None)),
              cursor.decodeAs[String]("status", None),
              cursor.decodeAs[Option[Resource]]("outcome", Some(None)),
              cursor.decodeAs[Option[UriStr]]("location", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[ZonedDateTime]]("lastModified", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Response(
        override val id: Option[String] = None,
        val etag: Option[String] = None,
        val status: String,
        val outcome: Option[Resource] = None,
        val location: Option[UriStr] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val lastModified: Option[ZonedDateTime] = None,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        link: LitSeq[Bundle.Link] = LitSeq.empty,
        fullUrl: Option[UriStr] = None,
        resource: Option[Resource] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        search: Option[Entry.Search] = None,
        request: Option[Entry.Request] = None,
        response: Option[Entry.Response] = None,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Entry = new Entry(
      id,
      link,
      fullUrl,
      resource,
      extension,
      modifierExtension,
      search,
      request,
      response,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Entry): Option[(Option[String], LitSeq[Bundle.Link], Option[UriStr], Option[Resource], LitSeq[Extension], LitSeq[Extension], Option[Entry.Search], Option[Entry.Request], Option[Entry.Response])] =
      Some((o.id, o.link, o.fullUrl, o.resource, o.extension, o.modifierExtension, o.search, o.request, o.response))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val link: FHIRComponentFieldMeta[LitSeq[Bundle.Link]] =
      FHIRComponentFieldMeta("link", lTagOf[LitSeq[Bundle.Link]], false, lTagOf[Bundle.Link])
    val fullUrl: FHIRComponentFieldMeta[Option[UriStr]] =
      FHIRComponentFieldMeta("fullUrl", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
    val resource: FHIRComponentFieldMeta[Option[Resource]] =
      FHIRComponentFieldMeta("resource", lTagOf[Option[Resource]], false, lTagOf[Resource])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val search: FHIRComponentFieldMeta[Option[Entry.Search]] =
      FHIRComponentFieldMeta("search", lTagOf[Option[Entry.Search]], false, lTagOf[Entry.Search])
    val request: FHIRComponentFieldMeta[Option[Entry.Request]] =
      FHIRComponentFieldMeta("request", lTagOf[Option[Entry.Request]], false, lTagOf[Entry.Request])
    val response: FHIRComponentFieldMeta[Option[Entry.Response]] =
      FHIRComponentFieldMeta("response", lTagOf[Option[Entry.Response]], false, lTagOf[Entry.Response])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, link, fullUrl, resource, extension, modifierExtension, search, request, response)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Entry): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Bundle.Link]](link, t.link),
      FHIRComponentField[Option[UriStr]](fullUrl, t.fullUrl),
      FHIRComponentField[Option[Resource]](resource, t.resource),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[Entry.Search]](search, t.search),
      FHIRComponentField[Option[Entry.Request]](request, t.request),
      FHIRComponentField[Option[Entry.Response]](response, t.response)
    )
    val baseType: CompanionFor[Entry] = this
    val thisName: String              = "Entry"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Entry] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Entry(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Bundle.Link]]("link", Some(LitSeq.empty)),
            cursor.decodeAs[Option[UriStr]]("fullUrl", Some(None)),
            cursor.decodeAs[Option[Resource]]("resource", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Entry.Search]]("search", Some(None)),
            cursor.decodeAs[Option[Entry.Request]]("request", Some(None)),
            cursor.decodeAs[Option[Entry.Response]]("response", Some(None)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Entry(
      override val id: Option[String] = None,
      val link: LitSeq[Bundle.Link] = LitSeq.empty,
      val fullUrl: Option[UriStr] = None,
      val resource: Option[Resource] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val search: Option[Entry.Search] = None,
      val request: Option[Entry.Request] = None,
      val response: Option[Entry.Response] = None,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Link extends CompanionFor[Link] {
    implicit def summonObjectAndCompanionLink_293062332(o: Link): ObjectAndCompanion[Link, Link.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Link
    override type ParentType   = Link
    override val parentType: CompanionFor[ResourceType] = Link
    def apply(
        id: Option[String] = None,
        url: UriStr,
        relation: String,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Link = new Link(
      id,
      url,
      relation,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(o: Link): Option[(Option[String], UriStr, String, LitSeq[Extension], LitSeq[Extension])] = Some(
      (o.id, o.url, o.relation, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val url: FHIRComponentFieldMeta[UriStr] =
      FHIRComponentFieldMeta("url", lTagOf[UriStr], false, lTagOf[UriStr])
    val relation: FHIRComponentFieldMeta[String] =
      FHIRComponentFieldMeta("relation", lTagOf[String], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, url, relation, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Link): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[UriStr](url, t.url),
      FHIRComponentField[String](relation, t.relation),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Link] = this
    val thisName: String             = "Link"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Link] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Link(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[UriStr]("url", None),
            cursor.decodeAs[String]("relation", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Link(
      override val id: Option[String] = None,
      val url: UriStr,
      val relation: String,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      `type`: BUNDLE_TYPE,
      total: Option[UnsignedInt] = None,
      language: Option[LANGUAGES] = None,
      timestamp: Option[ZonedDateTime] = None,
      signature: Option[Signature] = None,
      identifier: Option[Identifier] = None,
      implicitRules: Option[UriStr] = None,
      link: LitSeq[Bundle.Link] = LitSeq.empty,
      entry: LitSeq[Bundle.Entry] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Bundle = new Bundle(
    id,
    meta,
    `type`,
    total,
    language,
    timestamp,
    signature,
    identifier,
    implicitRules,
    link,
    entry,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val `type`: FHIRComponentFieldMeta[BUNDLE_TYPE] =
    FHIRComponentFieldMeta("type", lTagOf[BUNDLE_TYPE], false, lTagOf[BUNDLE_TYPE])
  val total: FHIRComponentFieldMeta[Option[UnsignedInt]] =
    FHIRComponentFieldMeta("total", lTagOf[Option[UnsignedInt]], false, lTagOf[UnsignedInt])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val timestamp: FHIRComponentFieldMeta[Option[ZonedDateTime]] =
    FHIRComponentFieldMeta("timestamp", lTagOf[Option[ZonedDateTime]], false, lTagOf[ZonedDateTime])
  val signature: FHIRComponentFieldMeta[Option[Signature]] =
    FHIRComponentFieldMeta("signature", lTagOf[Option[Signature]], false, lTagOf[Signature])
  val identifier: FHIRComponentFieldMeta[Option[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val link: FHIRComponentFieldMeta[LitSeq[Bundle.Link]] =
    FHIRComponentFieldMeta("link", lTagOf[LitSeq[Bundle.Link]], false, lTagOf[Bundle.Link])
  val entry: FHIRComponentFieldMeta[LitSeq[Bundle.Entry]] =
    FHIRComponentFieldMeta("entry", lTagOf[LitSeq[Bundle.Entry]], false, lTagOf[Bundle.Entry])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
    Seq(id, meta, `type`, total, language, timestamp, signature, identifier, implicitRules, link, entry)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Bundle): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[BUNDLE_TYPE](`type`, t.`type`),
    FHIRComponentField[Option[UnsignedInt]](total, t.total),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Option[ZonedDateTime]](timestamp, t.timestamp),
    FHIRComponentField[Option[Signature]](signature, t.signature),
    FHIRComponentField[Option[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Bundle.Link]](link, t.link),
    FHIRComponentField[LitSeq[Bundle.Entry]](entry, t.entry)
  )
  def extractId(t: Bundle): Option[String]               = t.id
  def extractMeta(t: Bundle): Option[Meta]               = t.meta
  def extractType(t: Bundle): BUNDLE_TYPE                = t.`type`
  def extractTotal(t: Bundle): Option[UnsignedInt]       = t.total
  def extractLanguage(t: Bundle): Option[LANGUAGES]      = t.language
  def extractTimestamp(t: Bundle): Option[ZonedDateTime] = t.timestamp
  def extractSignature(t: Bundle): Option[Signature]     = t.signature
  def extractIdentifier(t: Bundle): Option[Identifier]   = t.identifier
  def extractImplicitRules(t: Bundle): Option[UriStr]    = t.implicitRules
  def extractLink(t: Bundle): LitSeq[Bundle.Link]        = t.link
  def extractEntry(t: Bundle): LitSeq[Bundle.Entry]      = t.entry
  override val thisName: String                          = "Bundle"
  override val searchParams: Map[String, Bundle => Seq[Any]] = Map(
    "timestamp"   -> (obj => obj.timestamp.toSeq),
    "identifier"  -> (obj => obj.identifier.toSeq),
    "message"     -> (obj => obj.entry.flatMap(_.resource).toSeq),
    "type"        -> (obj => Seq(obj.`type`)),
    "composition" -> (obj => obj.entry.flatMap(_.resource).toSeq)
  )
  def unapply(
      o: Bundle): Option[(Option[String], Option[Meta], BUNDLE_TYPE, Option[UnsignedInt], Option[LANGUAGES], Option[ZonedDateTime], Option[Signature], Option[Identifier], Option[UriStr], LitSeq[Bundle.Link], LitSeq[Bundle.Entry])] =
    Some((o.id, o.meta, o.`type`, o.total, o.language, o.timestamp, o.signature, o.identifier, o.implicitRules, o.link, o.entry))
  private val log: Logger = LoggerFactory.getLogger(getClass)
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Bundle] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try {
        val entries: LitSeq[Entry] =
          if (!params.tolerantBundleDecoding) cursor.decodeAs[LitSeq[Entry]]("entry", Some(LitSeq.empty))
          else
            cursor
              .downField("entry")
              .arrayCursors
              .getOrElse(Iterable.empty)
              .to(LitSeq)
              .flatMap(j =>
                j.as[Entry] match {
                  case Left(l) =>
                    log.error(
                      s"failed to decode bundle field. Skipping because tolerantBundleDecoding = true. Json was ${j}, Error was:",
                      l)
                    None
                  case Right(x) => Some(x)
                })
        new Bundle(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[BUNDLE_TYPE]("type", None),
          cursor.decodeAs[Option[UnsignedInt]]("total", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[ZonedDateTime]]("timestamp", Some(None)),
          cursor.decodeAs[Option[Signature]]("signature", Some(None)),
          cursor.decodeAs[Option[Identifier]]("identifier", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Bundle.Link]]("link", Some(LitSeq.empty)),
          entries,
          decodeAttributes(cursor)
        )
      })
}

/** A container for a collection of resources.
  *
  * Subclass of [[core.model.Resource]] (This is the base resource type for everything.)
  *
  * @constructor
  *   Introduces the fields `type`, total, timestamp, signature, identifier, link, entry.
  * @param id
  *   \- The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta
  *   \- The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *   not always be associated with version changes to the resource.
  * @param `type`
  *   \- Indicates the purpose of this bundle - how it is intended to be used.
  * @param total
  *   \- If a set of search matches, this is the total number of entries of type 'match' across all pages in the search. It does
  *   not include search.mode = 'include' or 'outcome' entries and it does not provide a count of the number of entries in the
  *   Bundle.
  * @param language
  *   \- The base language in which the resource is written.
  * @param timestamp
  *   \- The date/time that the bundle was assembled - i.e. when the resources were placed in the bundle.
  * @param signature
  *   \- Digital Signature - base64 encoded. XML-DSig or a JWT.
  * @param identifier
  *   \- A persistent identifier for the bundle that won't change as a bundle is copied from server to server.
  * @param implicitRules
  *   \- A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param link
  *   \- A series of links that provide context to this bundle.
  * @param entry
  *   \- An entry in a bundle resource - will either contain a resource or information about a resource (transactions and history
  *   only).
  */
@POJOBoilerplate
class Bundle(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    val `type`: BUNDLE_TYPE,
    val total: Option[UnsignedInt] = None,
    override val language: Option[LANGUAGES] = None,
    val timestamp: Option[ZonedDateTime] = None,
    val signature: Option[Signature] = None,
    val identifier: Option[Identifier] = None,
    override val implicitRules: Option[UriStr] = None,
    val link: LitSeq[Bundle.Link] = LitSeq.empty,
    val entry: LitSeq[Bundle.Entry] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Resource(
      id = id,
      meta = meta,
      language = language,
      implicitRules = implicitRules,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Bundle"
}
