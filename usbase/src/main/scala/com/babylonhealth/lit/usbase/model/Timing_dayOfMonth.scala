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

object Timing_dayOfMonth extends CompanionFor[Timing_dayOfMonth] {
  override val baseType: CompanionFor[Extension] = Extension
  def apply(
      id: Option[String] = None,
      url: String,
      value: PositiveInt,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Timing_dayOfMonth = new Timing_dayOfMonth(
    id,
    url,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val url: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("url", lTagOf[String], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[PositiveInt] =
    FHIRComponentFieldMeta("value", lTagOf[PositiveInt], true, lTagOf[PositiveInt])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, url, value)
  override def fields(t: Timing_dayOfMonth): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[String](url, t.url),
    FHIRComponentField[PositiveInt](value, t.value.get.toSubRefNonUnion[PositiveInt])
  )
  def extractId(t: Timing_dayOfMonth): Option[String]                   = t.id
  def extractUrl(t: Timing_dayOfMonth): String                          = t.url
  def extractValue(t: Timing_dayOfMonth): PositiveInt                   = t.value.get.toSubRefNonUnion[PositiveInt]
  override val thisName: String                                         = "Timing_dayOfMonth"
  override val searchParams: Map[String, Timing_dayOfMonth => Seq[Any]] = Extension.searchParams
  def unapply(o: Timing_dayOfMonth): Option[(Option[String], String, PositiveInt)] = Some(
    (o.id, o.url, o.value.get.toSubRefNonUnion[PositiveInt]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Timing_dayOfMonth] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Timing_dayOfMonth(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[String]("url", None),
          cursor.decodeAs[PositiveInt]("valuePositiveInt", None),
          decodeAttributes(cursor)
        )
      ))
}

/** When present, this extension indicate that the event actually only occurs on the specified days of the month, on the times as otherwise specified by the timing schedule.
  *
  *  Subclass of [[core.model.Extension]] (Base StructureDefinition for Extension Type: Optional Extension Element - found in all resources.)
  *
  * @constructor Inherits all params from parent.
  *              Refines the types of: value.
  *              Requires the following fields which were optional in the parent: value.
  *              Forbids the use of the following fields which were optional in the parent: extension.
  * @param id - Unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces.
  * @param url - Source of the definition for the extension code - a logical name or a URL.
  * @param value - Value of extension - must be one of a constrained set of the data types (see [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
  */
@POJOBoilerplate
class Timing_dayOfMonth(
    override val id: Option[String] = None,
    override val url: String,
    value: PositiveInt,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(id = id, url = url, value = Some(choice(value)), primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}