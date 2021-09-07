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

import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object OpenEHR_exposureDuration extends CompanionFor[OpenEHR_exposureDuration] {
  implicit def summonObjectAndCompanionOpenEHR_exposureDuration_1350034472(
      o: OpenEHR_exposureDuration): ObjectAndCompanion[OpenEHR_exposureDuration, OpenEHR_exposureDuration.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/openEHR-exposureDuration")
  def apply(
      id: Option[String] = None,
      value: Duration,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): OpenEHR_exposureDuration = new OpenEHR_exposureDuration(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[Duration] =
    FHIRComponentFieldMeta("value", lTagOf[Duration], true, lTagOf[Duration])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Duration](value, t.value.get.toSubRefNonUnion[Duration])
    ))
  override def fields(t: OpenEHR_exposureDuration): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: OpenEHR_exposureDuration): Option[String]                   = t.id
  def extractValue(t: OpenEHR_exposureDuration): Duration                      = t.value.get.toSubRefNonUnion[Duration]
  override val thisName: String                                                = "OpenEHR_exposureDuration"
  override val searchParams: Map[String, OpenEHR_exposureDuration => Seq[Any]] = Extension.searchParams
  def unapply(o: OpenEHR_exposureDuration): Option[(Option[String], Duration)] = Some(
    (o.id, o.value.get.toSubRefNonUnion[Duration]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[OpenEHR_exposureDuration] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new OpenEHR_exposureDuration(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Duration]("valueDuration", None),
          decodeAttributes(cursor)
        )
      ))
}

/** The amount of time the individual was exposed to the Substance.
  *
  * Subclass of [[core.model.Extension]] (Base StructureDefinition for Extension Type: Optional Extension Element - found in all
  * resources.)
  *
  * @constructor
  *   Inherits all params from parent. Refines the types of: value. Requires the following fields which were optional in the
  *   parent: value. Forbids the use of the following fields which were optional in the parent: extension. Hardcodes the value of
  *   the following fields: url.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *   spaces.
  * @param url
  *   - Source of the definition for the extension code - a logical name or a URL.
  * @param value
  *   - Value of extension - must be one of a constrained set of the data types (see
  *   [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
  */
@POJOBoilerplate
class OpenEHR_exposureDuration(
    override val id: Option[String] = None,
    value: Duration,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(new Choice("Duration", value)(UnionAllTag)),
      url = "http://hl7.org/fhir/StructureDefinition/openEHR-exposureDuration",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
