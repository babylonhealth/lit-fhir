package com.babylonhealth.lit.core.model

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
import com.babylonhealth.lit.core.UnionAliases._
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Attachment extends CompanionFor[Attachment] {
  implicit def summonObjectAndCompanionAttachment1501498888(
      o: Attachment): ObjectAndCompanion[Attachment, Attachment.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Attachment
  override type ParentType   = Attachment
  override val baseType: CompanionFor[ResourceType] = Attachment
  override val parentType: CompanionFor[ParentType] = Attachment
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Attachment")
  def apply(
      id: Option[String] = None,
      url: Option[UrlStr] = None,
      data: Option[Base64Binary] = None,
      size: Option[UnsignedInt] = None,
      hash: Option[Base64Binary] = None,
      title: Option[String] = None,
      language: Option[LANGUAGES] = None,
      creation: Option[FHIRDateTime] = None,
      extension: LitSeq[Extension] = LitSeq.empty,
      contentType: Option[Code] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Attachment = new Attachment(
    id,
    url,
    data,
    size,
    hash,
    title,
    language,
    creation,
    extension,
    contentType,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val url: FHIRComponentFieldMeta[Option[UrlStr]] =
    FHIRComponentFieldMeta("url", lTagOf[Option[UrlStr]], false, lTagOf[UrlStr])
  val data: FHIRComponentFieldMeta[Option[Base64Binary]] =
    FHIRComponentFieldMeta("data", lTagOf[Option[Base64Binary]], false, lTagOf[Base64Binary])
  val size: FHIRComponentFieldMeta[Option[UnsignedInt]] =
    FHIRComponentFieldMeta("size", lTagOf[Option[UnsignedInt]], false, lTagOf[UnsignedInt])
  val hash: FHIRComponentFieldMeta[Option[Base64Binary]] =
    FHIRComponentFieldMeta("hash", lTagOf[Option[Base64Binary]], false, lTagOf[Base64Binary])
  val title: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("title", lTagOf[Option[String]], false, lTagOf[String])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val creation: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("creation", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val contentType: FHIRComponentFieldMeta[Option[Code]] =
    FHIRComponentFieldMeta("contentType", lTagOf[Option[Code]], false, lTagOf[Code])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
    Seq(id, url, data, size, hash, title, language, creation, extension, contentType)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Attachment): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[UrlStr]](url, t.url),
    FHIRComponentField[Option[Base64Binary]](data, t.data),
    FHIRComponentField[Option[UnsignedInt]](size, t.size),
    FHIRComponentField[Option[Base64Binary]](hash, t.hash),
    FHIRComponentField[Option[String]](title, t.title),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Option[FHIRDateTime]](creation, t.creation),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Code]](contentType, t.contentType)
  )
  def extractId(t: Attachment): Option[String]             = t.id
  def extractUrl(t: Attachment): Option[UrlStr]            = t.url
  def extractData(t: Attachment): Option[Base64Binary]     = t.data
  def extractSize(t: Attachment): Option[UnsignedInt]      = t.size
  def extractHash(t: Attachment): Option[Base64Binary]     = t.hash
  def extractTitle(t: Attachment): Option[String]          = t.title
  def extractLanguage(t: Attachment): Option[LANGUAGES]    = t.language
  def extractCreation(t: Attachment): Option[FHIRDateTime] = t.creation
  def extractExtension(t: Attachment): LitSeq[Extension]   = t.extension
  def extractContentType(t: Attachment): Option[Code]      = t.contentType
  override val thisName: String                            = "Attachment"
  def unapply(
      o: Attachment): Option[(Option[String], Option[UrlStr], Option[Base64Binary], Option[UnsignedInt], Option[Base64Binary], Option[String], Option[LANGUAGES], Option[FHIRDateTime], LitSeq[Extension], Option[Code])] =
    Some((o.id, o.url, o.data, o.size, o.hash, o.title, o.language, o.creation, o.extension, o.contentType))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Attachment] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Attachment(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[UrlStr]]("url", Some(None)),
          cursor.decodeAs[Option[Base64Binary]]("data", Some(None)),
          cursor.decodeAs[Option[UnsignedInt]]("size", Some(None)),
          cursor.decodeAs[Option[Base64Binary]]("hash", Some(None)),
          cursor.decodeAs[Option[String]]("title", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("creation", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Code]]("contentType", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for Attachment Type: For referring to data content defined in other formats.
  *
  *  Subclass of [[core.model.Element]] (Base StructureDefinition for Element Type: Base definition for all elements in a resource.)
  *
  * @constructor Introduces the fields url, data, size, hash, title, language, creation, contentType.
  * @param id - Unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces.
  * @param url - A location where the data can be accessed.
  * @param data - The actual data of the attachment - a sequence of bytes, base64 encoded.
  * @param size - The number of bytes of data that make up this attachment (before base64 encoding, if that is done).
  * @param hash - The calculated hash of the data using SHA-1. Represented using base64.
  * @param title - A label or set of text to display in place of the data.
  * @param language - The human language of the content. The value can be any valid value according to BCP 47.
  * @param creation - The date that the attachment was first created.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the element. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param contentType - Identifies the type of the data in the attachment and allows a method to be chosen to interpret or render the data. Includes mime type parameters such as charset where appropriate.
  */
@POJOBoilerplate
class Attachment(
    override val id: Option[String] = None,
    val url: Option[UrlStr] = None,
    val data: Option[Base64Binary] = None,
    val size: Option[UnsignedInt] = None,
    val hash: Option[Base64Binary] = None,
    val title: Option[String] = None,
    val language: Option[LANGUAGES] = None,
    val creation: Option[FHIRDateTime] = None,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val contentType: Option[Code] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Element(id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Attachment"
}
