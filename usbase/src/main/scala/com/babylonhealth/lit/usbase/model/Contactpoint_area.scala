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

object Contactpoint_area extends CompanionFor[Contactpoint_area] {
  override val baseType: CompanionFor[Extension] = Extension
  override val profileUrl: Option[String]        = Some("http://hl7.org/fhir/StructureDefinition/contactpoint-area")
  def apply(
      id: Option[String] = None,
      value: String,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Contactpoint_area = new Contactpoint_area(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("value", lTagOf[String], true, lTagOf[String])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fields(t: Contactpoint_area): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[String](value, t.value.get.toSubRefNonUnion[String])
  )
  def extractId(t: Contactpoint_area): Option[String]                   = t.id
  def extractValue(t: Contactpoint_area): String                        = t.value.get.toSubRefNonUnion[String]
  override val thisName: String                                         = "Contactpoint_area"
  override val searchParams: Map[String, Contactpoint_area => Seq[Any]] = Extension.searchParams
  def unapply(o: Contactpoint_area): Option[(Option[String], String)] = Some(
    (o.id, o.value.get.toSubRefNonUnion[String]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Contactpoint_area] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Contactpoint_area(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[String]("valueString", None),
          decodeAttributes(cursor)
        )
      ))
}

/** The area/zone/city code that, in some areas, may be omitted when dialing locally within the zone. This extension is used when a system wishes to designate specific parts of a phone number (and potentially place constraints on which components must be present and how they're filled in).
  *
  *  Subclass of [[core.model.Extension]] (Base StructureDefinition for Extension Type: Optional Extension Element - found in all resources.)
  *
  * @constructor Inherits all params from parent.
  *              Refines the types of: value.
  *              Requires the following fields which were optional in the parent: value.
  *              Forbids the use of the following fields which were optional in the parent: extension.
  *              Hardcodes the value of the following fields: url.
  * @param id - Unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces.
  * @param url - Source of the definition for the extension code - a logical name or a URL.
  * @param value - Value of extension - must be one of a constrained set of the data types (see [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
  */
@POJOBoilerplate
class Contactpoint_area(
    override val id: Option[String] = None,
    value: String,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choice(value)),
      url = "http://hl7.org/fhir/StructureDefinition/contactpoint-area",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
