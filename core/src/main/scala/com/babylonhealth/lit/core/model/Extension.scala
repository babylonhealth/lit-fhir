package com.babylonhealth.lit.core.model

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
import com.babylonhealth.lit.core.UnionAliases._

import com.babylonhealth.lit.{ core }
import com.babylonhealth.lit.macros.POJOBoilerplate

<<<<<<< HEAD
object Extension extends CompanionFor[Extension] {
  implicit def summonObjectAndCompanionExtension1348255722(o: Extension): ObjectAndCompanion[Extension, Extension.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Extension")
  type ValueChoice = Choice[UnionAll]
  def apply(
=======
object Extension extends CompanionFor[Extension[_]] {
  override type ResourceType[T] = Extension[T]
  override val baseType: CompanionFor[ResourceType[_]] = Extension
  override val profileUrl: Option[String]              = Some("http://hl7.org/fhir/StructureDefinition/Extension[Stage]")
  type ValueChoice[T] = Choice[Union_1349125893[T]]
  def apply[Stage <: LifecycleStage: ValueOf](
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
      id: Option[String] = None,
      url: String,
      value: Option[Extension.ValueChoice[Stage]] = None,
      extension: LitSeq[Extension[Stage]] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Extension[Stage] = new Extension[Stage](
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
<<<<<<< HEAD
  val value: FHIRComponentFieldMeta[Option[Extension.ValueChoice]] =
    FHIRComponentFieldMeta("value", lTagOf[Option[Extension.ValueChoice]], true, lTagOf[UnionAll])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, url, value, extension)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Extension): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[String](url, t.url),
    FHIRComponentField[Option[Extension.ValueChoice]](value, t.value),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension)
  )
  def extractId(t: Extension): Option[String]                   = t.id
  private val log: Logger = LoggerFactory.getLogger(getClass)
  def extractUrl(t: Extension): String                          = t.url
  def extractValue(t: Extension): Option[Extension.ValueChoice] = t.value
  def extractExtension(t: Extension): LitSeq[Extension]         = t.extension
  override val thisName: String                                 = "Extension"
  def unapply(o: Extension): Option[(Option[String], String, Option[Extension.ValueChoice], LitSeq[Extension])] = Some(
    (o.id, o.url, o.value, o.extension))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Extension] =
=======
  def value[Stage]: FHIRComponentFieldMeta[Option[Extension.ValueChoice[Stage]]] =
    FHIRComponentFieldMeta("value", lTagOf[Option[Extension.ValueChoice[Stage]]], true, lTagOf[Union_1349125893[Stage]])
  def extension[Stage]: FHIRComponentFieldMeta[LitSeq[Extension[Stage]]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension[Stage]]], false, lTagOf[Extension[Stage]])
  def fieldsMeta[Stage <: LifecycleStage: ValueOf]: Seq[FHIRComponentFieldMeta[_]] = Seq(id, url, value, extension)
  override def fieldsFromParent[Stage <: LifecycleStage: ValueOf](
      t: ResourceType[Stage]): Try[Seq[FHIRComponentField[Stage, _]]] = Success(fields[Stage](t))
  override def fields[Stage <: LifecycleStage: ValueOf](t: Extension[Stage]): Seq[FHIRComponentField[Stage, _]] = Seq(
    FHIRComponentField[Stage, Option[String]](id, t.id),
    FHIRComponentField[Stage, String](url, t.url),
    FHIRComponentField[Stage, Option[Extension.ValueChoice[Stage]]](value, t.value),
    FHIRComponentField[Stage, LitSeq[Extension[Stage]]](extension, t.extension)
  )
  def extractId(t: Extension[_]): Option[String]                                     = t.id
  def extractUrl(t: Extension[_]): String                                            = t.url
  def extractValue[Stage](t: Extension[Stage]): Option[Extension.ValueChoice[Stage]] = t.value
  def extractExtension[Stage](t: Extension[Stage]): LitSeq[Extension[Stage]]         = t.extension
  override val thisName: String                                                      = "Extension[Stage]"
  private val log: Logger                                                            = LoggerFactory.getLogger(getClass)
  def unapply[Stage <: LifecycleStage: ValueOf](
      o: Extension[
        Stage]): Option[(Option[String], String, Option[Extension.ValueChoice[Stage]], LitSeq[Extension[Stage]])] =
    Some((o.id, o.url, o.value, o.extension))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Extension[Completed.type]] =
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      cursor.downField("url").as[String].toTry.flatMap { url =>
        def genericExtension = Try(
          new Extension[Completed.type](
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[String]("url", None),
<<<<<<< HEAD
            cursor.decodeOptRef[UnionAll]("value"),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
=======
            cursor.decodeOptRef[Union_1349125893[Completed.type]]("value"),
            cursor.decodeAs[LitSeq[Extension[Completed.type]]]("extension", Some(LitSeq.empty)),
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
            decodeAttributes(cursor)
          )
        )
        if (!params.decodeSpecificExtensions) genericExtension
        else {
          val specificExtension = urlLookup.get(url)
          specificExtension match {
            case None =>
              if (params.logOnMissingExtension) log.warn(s"Missing extension $url")
              genericExtension
            case Some(ext) =>
              Try(ext.decodeThis(cursor).asInstanceOf[Try[Extension[Completed.type]]]).flatten.recoverWith {
                case t if params.tolerateExtensionErrors =>
                  log.warn(s"Failed to decode extension $url", t)
                  genericExtension
              }
          }
        }
      })

}

/** Base StructureDefinition for Extension[Stage] Type: Optional Extension[Stage] Element - found in all resources.
  *
  * Subclass of [[core.model.Element]] (Base StructureDefinition for Element Type: Base definition for all elements in a
  * resource.)
  *
  * @constructor
  *   Introduces the fields url, value.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *   spaces.
  * @param url
  *   - Source of the definition for the extension code - a logical name or a URL.
  * @param value
  *   - Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a
  *   list).
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the element. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  */
@POJOBoilerplate
class Extension[Stage <: LifecycleStage: ValueOf](
    override val id: Option[String] = None,
    val url: String,
    val value: Option[Extension.ValueChoice[Stage]] = None,
    override val extension: LitSeq[Extension[Stage]] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Element[Stage](id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension[Stage]"
}
