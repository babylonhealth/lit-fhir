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

object OpenEHR_exposureDuration extends CompanionFor[OpenEHR_exposureDuration] {
  override val baseType: CompanionFor[Extension] = Extension
  override val profileUrl: Option[String]        = Some("http://hl7.org/fhir/StructureDefinition/openEHR-exposureDuration")
  def apply(
      id: Option[String] = None,
      url: String,
      value: Duration,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): OpenEHR_exposureDuration = new OpenEHR_exposureDuration(
    id,
    url,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val url: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("url", lTagOf[String], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[Duration] =
    FHIRComponentFieldMeta("value", lTagOf[Duration], true, lTagOf[Duration])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, url, value)
  override def fields(t: OpenEHR_exposureDuration): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[String](url, t.url),
    FHIRComponentField[Duration](value, t.value.get.toSubRefNonUnion[Duration])
  )
  def extractId(t: OpenEHR_exposureDuration): Option[String]                   = t.id
  def extractUrl(t: OpenEHR_exposureDuration): String                          = t.url
  def extractValue(t: OpenEHR_exposureDuration): Duration                      = t.value.get.toSubRefNonUnion[Duration]
  override val thisName: String                                                = "OpenEHR_exposureDuration"
  override val searchParams: Map[String, OpenEHR_exposureDuration => Seq[Any]] = Extension.searchParams
  def unapply(o: OpenEHR_exposureDuration): Option[(Option[String], String, Duration)] = Some(
    (o.id, o.url, o.value.get.toSubRefNonUnion[Duration]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[OpenEHR_exposureDuration] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new OpenEHR_exposureDuration(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[String]("url", None),
          cursor.decodeAs[Duration]("valueDuration", None),
          decodeAttributes(cursor)
        )
      ))
}

/** The amount of time the individual was exposed to the Substance.
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
class OpenEHR_exposureDuration(
    override val id: Option[String] = None,
    override val url: String,
    value: Duration,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(id = id, url = url, value = Some(choice(value)), primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
