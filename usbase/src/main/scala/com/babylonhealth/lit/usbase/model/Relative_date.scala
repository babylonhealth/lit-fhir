package com.babylonhealth.lit.usbase.model

import java.time.{ LocalDate, LocalTime, ZonedDateTime }
import java.util.UUID

import scala.collection.immutable.TreeMap
import scala.util.Try

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
import com.babylonhealth.lit.usbase.UnionAliases._

import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Relative_date extends CompanionFor[Relative_date] {
  override val baseType: CompanionFor[Extension] = Extension
  def apply(
      id: Option[String] = None,
      url: String,
      extension: NonEmptyLitSeq[Extension],
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Relative_date = new Relative_date(
    id,
    url,
    extension,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val url: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("url", lTagOf[String], false, lTagOf[String])
  val extension: FHIRComponentFieldMeta[NonEmptyLitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[NonEmptyLitSeq[Extension]], false, lTagOf[Extension])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, url, extension)
  override def fields(t: Relative_date): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[String](url, t.url),
    FHIRComponentField[NonEmptyLitSeq[Extension]](extension, t.extension.asNonEmpty)
  )
  def extractId(t: Relative_date): Option[String]                   = t.id
  def extractUrl(t: Relative_date): String                          = t.url
  def extractExtension(t: Relative_date): NonEmptyLitSeq[Extension] = t.extension.asNonEmpty
  override val thisName: String                                     = "Relative_date"
  override val searchParams: Map[String, Relative_date => Seq[Any]] = Extension.searchParams
  def unapply(o: Relative_date): Option[(Option[String], String, NonEmptyLitSeq[Extension])] = Some(
    (o.id, o.url, o.extension.asNonEmpty))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Relative_date] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Relative_date(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[String]("url", None),
          cursor.decodeAs[NonEmptyLitSeq[Extension]]("extension", None),
          decodeAttributes(cursor)
        )
      ))
}

/** Specifies that a date is relative to some event. The event happens [Duration] after [Event].
  *
  *  Subclass of [[core.model.Extension]] (Base StructureDefinition for Extension Type: Optional Extension Element - found in all resources.)
  *
  * @constructor Inherits all params from parent.
  *              Requires the following fields which were optional in the parent: extension.
  *              Forbids the use of the following fields which were optional in the parent: value.
  * @param id - Unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces.
  * @param url - Source of the definition for the extension code - a logical name or a URL.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the element. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  */
@POJOBoilerplate
class Relative_date(
    override val id: Option[String] = None,
    override val url: String,
    extension: NonEmptyLitSeq[Extension],
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(id = id, url = url, extension = extension.refine, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
