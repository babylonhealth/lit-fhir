package com.babylonhealth.lit.usbase.model

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
import com.babylonhealth.lit.usbase.UnionAliases._
import com.babylonhealth.lit.usbase.IMPLANTSTATUS
import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Device_implantStatus extends CompanionFor[Device_implantStatus] {
  implicit def summonObjectAndCompanionDevice_implantStatus_1411289417(
      o: Device_implantStatus): ObjectAndCompanion[Device_implantStatus, Device_implantStatus.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/device-implantStatus")
  def apply(
      id: Option[String] = None,
      value: IMPLANTSTATUS,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Device_implantStatus = new Device_implantStatus(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[IMPLANTSTATUS] =
    FHIRComponentFieldMeta("value", lTagOf[IMPLANTSTATUS], true, lTagOf[IMPLANTSTATUS])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[IMPLANTSTATUS](value, IMPLANTSTATUS.withName(t.value.get.toSubRefNonUnion[Code]))
    ))
  override def fields(t: Device_implantStatus): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Device_implantStatus): Option[String]                   = t.id
  def extractValue(t: Device_implantStatus): IMPLANTSTATUS = IMPLANTSTATUS.withName(t.value.get.toSubRefNonUnion[Code])
  override val thisName: String                            = "Device_implantStatus"
  override val searchParams: Map[String, Device_implantStatus => Seq[Any]] = Extension.searchParams
  def unapply(o: Device_implantStatus): Option[(Option[String], IMPLANTSTATUS)] = Some(
    (o.id, IMPLANTSTATUS.withName(o.value.get.toSubRefNonUnion[Code])))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Device_implantStatus] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Device_implantStatus(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[IMPLANTSTATUS]("valueCode", None),
          decodeAttributes(cursor)
        )
      ))
}

/** Codes to represent the functional status of a device implanted in a patient. Both overall device status and an implant status
  * need to be considered. The implant status should only be used when the [device status](device-definitions.html#Device.status)
  * is `active `.
  *
  * Subclass of [[core.model.Extension]] (Base StructureDefinition for Extension Type: Optional Extension Element - found in all
  * resources.)
  *
  * @constructor
  *   Inherits all params from parent. Refines the types of: value. Requires the following fields which were optional in the
  *   parent: value. Forbids the use of the following fields which were optional in the parent: extension. Hardcodes the value of
  *   the following fields: url.
  * @param id
  *   \- Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *   spaces.
  * @param url
  *   \- Source of the definition for the extension code - a logical name or a URL.
  * @param value
  *   \- Value of extension - must be one of a constrained set of the data types (see
  *   [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
  */
@POJOBoilerplate
class Device_implantStatus(
    override val id: Option[String] = None,
    value: IMPLANTSTATUS,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choiceFromEnum(value)),
      url = "http://hl7.org/fhir/StructureDefinition/device-implantStatus",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
