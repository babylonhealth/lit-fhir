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
import com.babylonhealth.lit.usbase.IMPLANTSTATUS
import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Device_implantStatus extends CompanionFor[Device_implantStatus] {
  override val baseType: CompanionFor[Extension] = Extension
  def apply(
      id: Option[String] = None,
      url: String,
      value: IMPLANTSTATUS,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Device_implantStatus = new Device_implantStatus(
    id,
    url,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val url: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("url", lTagOf[String], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[IMPLANTSTATUS] =
    FHIRComponentFieldMeta("value", lTagOf[IMPLANTSTATUS], true, lTagOf[IMPLANTSTATUS])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, url, value)
  override def fields(t: Device_implantStatus): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[String](url, t.url),
    FHIRComponentField[IMPLANTSTATUS](value, t.value.get.toSubRefNonUnion[IMPLANTSTATUS])
  )
  def extractId(t: Device_implantStatus): Option[String]                   = t.id
  def extractUrl(t: Device_implantStatus): String                          = t.url
  def extractValue(t: Device_implantStatus): IMPLANTSTATUS                 = t.value.get.toSubRefNonUnion[IMPLANTSTATUS]
  override val thisName: String                                            = "Device_implantStatus"
  override val searchParams: Map[String, Device_implantStatus => Seq[Any]] = Extension.searchParams
  def unapply(o: Device_implantStatus): Option[(Option[String], String, IMPLANTSTATUS)] = Some(
    (o.id, o.url, o.value.get.toSubRefNonUnion[IMPLANTSTATUS]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Device_implantStatus] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Device_implantStatus(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[String]("url", None),
          cursor.decodeAs[IMPLANTSTATUS]("valueCode", None),
          decodeAttributes(cursor)
        )
      ))
}

/** Codes to represent the functional status of a device implanted in a patient.  Both overall device status and an implant status need to be considered. The implant status should only be used when the [device status](device-definitions.html#Device.status) is `active `.
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
class Device_implantStatus(
    override val id: Option[String] = None,
    override val url: String,
    value: IMPLANTSTATUS,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(id = id, url = url, value = Some(choice(value)), primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
