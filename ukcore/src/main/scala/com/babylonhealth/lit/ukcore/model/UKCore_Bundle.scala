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
import com.babylonhealth.lit.hl7.BUNDLE_TYPE
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, ukcore }
import com.babylonhealth.lit.macros.POJOBoilerplate

object UKCore_Bundle extends CompanionFor[UKCore_Bundle] {
  implicit def summonObjectAndCompanionUKCore_Bundle_446016783(
      o: UKCore_Bundle): ObjectAndCompanion[UKCore_Bundle, UKCore_Bundle.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Bundle
  override type ParentType   = Bundle
  override val baseType: CompanionFor[ResourceType] = Bundle
  override val parentType: CompanionFor[ParentType] = Bundle
  override val profileUrl: Option[String]           = Some("https://fhir.hl7.org.uk/StructureDefinition/UKCore-Bundle")
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-Bundle"))),
      `type`: BUNDLE_TYPE,
      total: Option[UnsignedInt] = None,
      language: Option[LANGUAGES] = None,
      timestamp: Option[ZonedDateTime] = None,
      implicitRules: Option[UriStr] = None,
      identifier: Option[Identifier] = None,
      link: LitSeq[Bundle.Link] = LitSeq.empty,
      entry: LitSeq[Bundle.Entry] = LitSeq.empty,
      signature: Option[Signature] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): UKCore_Bundle = new UKCore_Bundle(
    id,
    meta,
    `type`,
    total,
    language,
    timestamp,
    implicitRules,
    identifier,
    link,
    entry,
    signature,
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
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val identifier: FHIRComponentFieldMeta[Option[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
  val link: FHIRComponentFieldMeta[LitSeq[Bundle.Link]] =
    FHIRComponentFieldMeta("link", lTagOf[LitSeq[Bundle.Link]], false, lTagOf[Bundle.Link])
  val entry: FHIRComponentFieldMeta[LitSeq[Bundle.Entry]] =
    FHIRComponentFieldMeta("entry", lTagOf[LitSeq[Bundle.Entry]], false, lTagOf[Bundle.Entry])
  val signature: FHIRComponentFieldMeta[Option[Signature]] =
    FHIRComponentFieldMeta("signature", lTagOf[Option[Signature]], false, lTagOf[Signature])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
    Seq(id, meta, `type`, total, language, timestamp, implicitRules, identifier, link, entry, signature)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Meta]](meta, t.meta),
      FHIRComponentField[BUNDLE_TYPE](`type`, t.`type`),
      FHIRComponentField[Option[UnsignedInt]](total, t.total),
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[Option[ZonedDateTime]](timestamp, t.timestamp),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[Option[Identifier]](identifier, t.identifier),
      FHIRComponentField[LitSeq[Bundle.Link]](link, t.link),
      FHIRComponentField[LitSeq[Bundle.Entry]](entry, t.entry),
      FHIRComponentField[Option[Signature]](signature, t.signature)
    ))
  override def fields(t: UKCore_Bundle): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: UKCore_Bundle): Option[String]                   = t.id
  def extractMeta(t: UKCore_Bundle): Option[Meta]                   = t.meta
  def extractType(t: UKCore_Bundle): BUNDLE_TYPE                    = t.`type`
  def extractTotal(t: UKCore_Bundle): Option[UnsignedInt]           = t.total
  def extractLanguage(t: UKCore_Bundle): Option[LANGUAGES]          = t.language
  def extractTimestamp(t: UKCore_Bundle): Option[ZonedDateTime]     = t.timestamp
  def extractImplicitRules(t: UKCore_Bundle): Option[UriStr]        = t.implicitRules
  def extractIdentifier(t: UKCore_Bundle): Option[Identifier]       = t.identifier
  def extractLink(t: UKCore_Bundle): LitSeq[Bundle.Link]            = t.link
  def extractEntry(t: UKCore_Bundle): LitSeq[Bundle.Entry]          = t.entry
  def extractSignature(t: UKCore_Bundle): Option[Signature]         = t.signature
  override val thisName: String                                     = "UKCore_Bundle"
  override val searchParams: Map[String, UKCore_Bundle => Seq[Any]] = Bundle.searchParams
  def unapply(
      o: UKCore_Bundle): Option[(Option[String], Option[Meta], BUNDLE_TYPE, Option[UnsignedInt], Option[LANGUAGES], Option[ZonedDateTime], Option[UriStr], Option[Identifier], LitSeq[Bundle.Link], LitSeq[Bundle.Entry], Option[Signature])] =
    Some((o.id, o.meta, o.`type`, o.total, o.language, o.timestamp, o.implicitRules, o.identifier, o.link, o.entry, o.signature))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[UKCore_Bundle] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new UKCore_Bundle(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[BUNDLE_TYPE]("type", None),
          cursor.decodeAs[Option[UnsignedInt]]("total", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[ZonedDateTime]]("timestamp", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[Identifier]]("identifier", Some(None)),
          cursor.decodeAs[LitSeq[Bundle.Link]]("link", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Bundle.Entry]]("entry", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Signature]]("signature", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** Defines a UK Core profile of a container for a collection of resources.
  *
  * Subclass of [[hl7.model.Bundle]] (A container for a collection of resources.)
  *
  * @constructor
  *   Inherits all params from parent.
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
  * @param implicitRules
  *   \- A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param identifier
  *   \- A persistent identifier for the bundle that won't change as a bundle is copied from server to server.
  * @param link
  *   \- A series of links that provide context to this bundle.
  * @param entry
  *   \- An entry in a bundle resource - will either contain a resource or information about a resource (transactions and history
  *   only).
  * @param signature
  *   \- Digital Signature - base64 encoded. XML-DSig or a JWT.
  */
@POJOBoilerplate
class UKCore_Bundle(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-Bundle"))),
    override val `type`: BUNDLE_TYPE,
    override val total: Option[UnsignedInt] = None,
    override val language: Option[LANGUAGES] = None,
    override val timestamp: Option[ZonedDateTime] = None,
    override val implicitRules: Option[UriStr] = None,
    override val identifier: Option[Identifier] = None,
    override val link: LitSeq[Bundle.Link] = LitSeq.empty,
    override val entry: LitSeq[Bundle.Entry] = LitSeq.empty,
    override val signature: Option[Signature] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Bundle(
      id = id,
      meta = meta,
      `type` = `type`,
      total = total,
      language = language,
      timestamp = timestamp,
      signature = signature,
      identifier = identifier,
      implicitRules = implicitRules,
      link = link,
      entry = entry,
      primitiveAttributes = primitiveAttributes
    ) {
  override val thisTypeName: String = "Bundle"
}
