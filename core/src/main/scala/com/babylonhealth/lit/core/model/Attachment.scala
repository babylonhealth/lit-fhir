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
  implicit def summonObjectAndCompanionAttachment_1307825448(o: Attachment): ObjectAndCompanion[Attachment, Attachment.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Attachment
  override type ParentType   = Attachment
  override val baseType: CompanionFor[ResourceType] = Attachment
  override val parentType: CompanionFor[ParentType] = Attachment
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Attachment")
  def apply(
      id: Option[String] = None,
      url: Option[UrlStr] = None,
      data: Option[Base64Binary] = None,
      size: Option[Long] = None,
      hash: Option[Base64Binary] = None,
      title: Option[String] = None,
      width: Option[PositiveInt] = None,
      pages: Option[PositiveInt] = None,
      height: Option[PositiveInt] = None,
      frames: Option[PositiveInt] = None,
      language: Option[LANGUAGES] = None,
      creation: Option[FHIRDateTime] = None,
      duration: Option[BigDecimal] = None,
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
    width,
    pages,
    height,
    frames,
    language,
    creation,
    duration,
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
  val size: FHIRComponentFieldMeta[Option[Long]] =
    FHIRComponentFieldMeta("size", lTagOf[Option[Long]], false, lTagOf[Long])
  val hash: FHIRComponentFieldMeta[Option[Base64Binary]] =
    FHIRComponentFieldMeta("hash", lTagOf[Option[Base64Binary]], false, lTagOf[Base64Binary])
  val title: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("title", lTagOf[Option[String]], false, lTagOf[String])
  val width: FHIRComponentFieldMeta[Option[PositiveInt]] =
    FHIRComponentFieldMeta("width", lTagOf[Option[PositiveInt]], false, lTagOf[PositiveInt])
  val pages: FHIRComponentFieldMeta[Option[PositiveInt]] =
    FHIRComponentFieldMeta("pages", lTagOf[Option[PositiveInt]], false, lTagOf[PositiveInt])
  val height: FHIRComponentFieldMeta[Option[PositiveInt]] =
    FHIRComponentFieldMeta("height", lTagOf[Option[PositiveInt]], false, lTagOf[PositiveInt])
  val frames: FHIRComponentFieldMeta[Option[PositiveInt]] =
    FHIRComponentFieldMeta("frames", lTagOf[Option[PositiveInt]], false, lTagOf[PositiveInt])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val creation: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("creation", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val duration: FHIRComponentFieldMeta[Option[BigDecimal]] =
    FHIRComponentFieldMeta("duration", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val contentType: FHIRComponentFieldMeta[Option[Code]] =
    FHIRComponentFieldMeta("contentType", lTagOf[Option[Code]], false, lTagOf[Code])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
    Seq(id, url, data, size, hash, title, width, pages, height, frames, language, creation, duration, extension, contentType)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Attachment): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[UrlStr]](url, t.url),
    FHIRComponentField[Option[Base64Binary]](data, t.data),
    FHIRComponentField[Option[Long]](size, t.size),
    FHIRComponentField[Option[Base64Binary]](hash, t.hash),
    FHIRComponentField[Option[String]](title, t.title),
    FHIRComponentField[Option[PositiveInt]](width, t.width),
    FHIRComponentField[Option[PositiveInt]](pages, t.pages),
    FHIRComponentField[Option[PositiveInt]](height, t.height),
    FHIRComponentField[Option[PositiveInt]](frames, t.frames),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Option[FHIRDateTime]](creation, t.creation),
    FHIRComponentField[Option[BigDecimal]](duration, t.duration),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Code]](contentType, t.contentType)
  )
  def extractId(t: Attachment): Option[String]             = t.id
  def extractUrl(t: Attachment): Option[UrlStr]            = t.url
  def extractData(t: Attachment): Option[Base64Binary]     = t.data
  def extractSize(t: Attachment): Option[Long]             = t.size
  def extractHash(t: Attachment): Option[Base64Binary]     = t.hash
  def extractTitle(t: Attachment): Option[String]          = t.title
  def extractWidth(t: Attachment): Option[PositiveInt]     = t.width
  def extractPages(t: Attachment): Option[PositiveInt]     = t.pages
  def extractHeight(t: Attachment): Option[PositiveInt]    = t.height
  def extractFrames(t: Attachment): Option[PositiveInt]    = t.frames
  def extractLanguage(t: Attachment): Option[LANGUAGES]    = t.language
  def extractCreation(t: Attachment): Option[FHIRDateTime] = t.creation
  def extractDuration(t: Attachment): Option[BigDecimal]   = t.duration
  def extractExtension(t: Attachment): LitSeq[Extension]   = t.extension
  def extractContentType(t: Attachment): Option[Code]      = t.contentType
  override val thisName: String                            = "Attachment"
  def unapply(
      o: Attachment): Option[(Option[String], Option[UrlStr], Option[Base64Binary], Option[Long], Option[Base64Binary], Option[String], Option[PositiveInt], Option[PositiveInt], Option[PositiveInt], Option[PositiveInt], Option[LANGUAGES], Option[FHIRDateTime], Option[BigDecimal], LitSeq[Extension], Option[Code])] =
    Some(
      (
        o.id,
        o.url,
        o.data,
        o.size,
        o.hash,
        o.title,
        o.width,
        o.pages,
        o.height,
        o.frames,
        o.language,
        o.creation,
        o.duration,
        o.extension,
        o.contentType))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Attachment] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Attachment(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[UrlStr]]("url", Some(None)),
          cursor.decodeAs[Option[Base64Binary]]("data", Some(None)),
          cursor.decodeAs[Option[Long]]("size", Some(None)),
          cursor.decodeAs[Option[Base64Binary]]("hash", Some(None)),
          cursor.decodeAs[Option[String]]("title", Some(None)),
          cursor.decodeAs[Option[PositiveInt]]("width", Some(None)),
          cursor.decodeAs[Option[PositiveInt]]("pages", Some(None)),
          cursor.decodeAs[Option[PositiveInt]]("height", Some(None)),
          cursor.decodeAs[Option[PositiveInt]]("frames", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("creation", Some(None)),
          cursor.decodeAs[Option[BigDecimal]]("duration", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Code]]("contentType", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for Attachment Type: For referring to data content defined in other formats.
  *
  * Subclass of [[core.model.DataType]] (Base StructureDefinition for DataType Type: The base class for all re-useable types
  * defined as part of the FHIR Specification.)
  *
  * @constructor
  *   Introduces the fields url, data, size, hash, title, width, pages, height, frames, language, creation, duration, contentType.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *   spaces.
  * @param url
  *   - A location where the data can be accessed.
  * @param data
  *   - The actual data of the attachment - a sequence of bytes, base64 encoded.
  * @param size
  *   - The number of bytes of data that make up this attachment (before base64 encoding, if that is done).
  * @param hash
  *   - The calculated hash of the data using SHA-1. Represented using base64.
  * @param title
  *   - A label or set of text to display in place of the data.
  * @param width
  *   - Width of the image in pixels (photo/video).
  * @param pages
  *   - The number of pages when printed.
  * @param height
  *   - Height of the image in pixels (photo/video).
  * @param frames
  *   - The number of frames in a photo. This is used with a multi-page fax, or an imaging acquisition context that takes multiple
  *   slices in a single image, or an animated gif. If there is more than one frame, this SHALL have a value in order to alert
  *   interface software that a multi-frame capable rendering widget is required.
  * @param language
  *   - The human language of the content. The value can be any valid value according to BCP 47.
  * @param creation
  *   - The date that the attachment was first created.
  * @param duration
  *   - The duration of the recording in seconds - for audio and video.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the element. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param contentType
  *   - Identifies the type of the data in the attachment and allows a method to be chosen to interpret or render the data.
  *   Includes mime type parameters such as charset where appropriate.
  */
@POJOBoilerplate
class Attachment(
    override val id: Option[String] = None,
    val url: Option[UrlStr] = None,
    val data: Option[Base64Binary] = None,
    val size: Option[Long] = None,
    val hash: Option[Base64Binary] = None,
    val title: Option[String] = None,
    val width: Option[PositiveInt] = None,
    val pages: Option[PositiveInt] = None,
    val height: Option[PositiveInt] = None,
    val frames: Option[PositiveInt] = None,
    val language: Option[LANGUAGES] = None,
    val creation: Option[FHIRDateTime] = None,
    val duration: Option[BigDecimal] = None,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val contentType: Option[Code] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends DataType(id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Attachment"
}
