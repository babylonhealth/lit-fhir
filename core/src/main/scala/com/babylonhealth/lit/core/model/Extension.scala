package com.babylonhealth.lit.core.model

import java.time.{ LocalDate, LocalTime, ZonedDateTime }
import java.util.UUID

import scala.collection.immutable.TreeMap
import scala.util.Try

import io.circe.{ Decoder, HCursor }
import org.slf4j.{ Logger, LoggerFactory }

import com.babylonhealth.lit.core._
import com.babylonhealth.lit.core.BaseFieldDecoders._
import com.babylonhealth.lit.core.UnionAliases._
import com.babylonhealth.lit.core.ChoiceImplicits._
import com.babylonhealth.lit.core.TagSummoners.lTagOf
import com.babylonhealth.lit.core.serdes.{ objectDecoder, objectEncoder }
import com.babylonhealth.lit.core.model._
import com.babylonhealth.lit.core.UnionAliases._

import com.babylonhealth.lit.{ core }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Extension extends CompanionFor[Extension] {
  override val baseType: CompanionFor[Extension] = Extension
  override val profileUrl: Option[String]        = Some("http://hl7.org/fhir/StructureDefinition/Extension")
  type ValueChoice = Choice[Union_1349125893]
  def apply(
      id: Option[String] = None,
      url: String,
      value: Option[Extension.ValueChoice] = None,
      extension: LitSeq[Extension] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Extension = new Extension(
    id,
    url,
    value,
    extension,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val url: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("url", lTagOf[String], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[Option[Extension.ValueChoice]] =
    FHIRComponentFieldMeta("value", lTagOf[Option[Extension.ValueChoice]], true, lTagOf[Union_1349125893])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, url, value, extension)
  override def fields(t: Extension): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[String](url, t.url),
    FHIRComponentField[Option[Extension.ValueChoice]](value, t.value),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension)
  )
  def extractId(t: Extension): Option[String]                   = t.id
  def extractUrl(t: Extension): String                          = t.url
  def extractValue(t: Extension): Option[Extension.ValueChoice] = t.value
  def extractExtension(t: Extension): LitSeq[Extension]         = t.extension
  override val thisName: String                                 = "Extension"
  def unapply(o: Extension): Option[(Option[String], String, Option[Extension.ValueChoice], LitSeq[Extension])] = Some(
    (o.id, o.url, o.value, o.extension))
  private val log: Logger = LoggerFactory.getLogger(getClass)
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Extension] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      cursor.downField("url").as[String].toTry.flatMap { url =>
        def genericExtension = Try(
          new Extension(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[String]("url", None),
            cursor.decodeOptRef[Union_1349125893]("value"),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        )
        if (!params.decodeSpecificExtensions) genericExtension else {
          val specificExtension = companionLookup.get(url)
          specificExtension match {
            case None =>
              if (params.logOnMissingExtension) log.warn(s"Missing extension $url")
              genericExtension
            case Some(ext) =>
              Try(ext.decodeThis(cursor).asInstanceOf[Try[Extension]]).flatten.recoverWith {
                case t if params.tolerateExtensionErrors =>
                  log.warn(s"Failed to decode extension $url", t)
                  genericExtension
              }
          }
        }
      })

}

/** Base StructureDefinition for Extension Type: Optional Extension Element - found in all resources.
  *
  *  Subclass of [[core.model.Element]] (Base StructureDefinition for Element Type: Base definition for all elements in a resource.)
  *
  * @constructor Introduces the fields url, value.
  * @param id - Unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces.
  * @param url - Source of the definition for the extension code - a logical name or a URL.
  * @param value - Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
  * @param extension - May be used to represent additional information that is not part of the basic definition of the element. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  */
@POJOBoilerplate
class Extension(
    override val id: Option[String] = None,
    val url: String,
    val value: Option[Extension.ValueChoice] = None,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Element(id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
