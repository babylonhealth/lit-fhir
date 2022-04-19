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

object Location_distance extends CompanionFor[Location_distance] {
  implicit def summonObjectAndCompanionLocation_distance_445131816(
      o: Location_distance): ObjectAndCompanion[Location_distance, Location_distance.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/location-distance")
  def apply(
      id: Option[String] = None,
      value: Distance,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Location_distance = new Location_distance(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[Distance] =
    FHIRComponentFieldMeta("value", lTagOf[Distance], true, lTagOf[Distance])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Distance](value, t.value.get.toSubRefNonUnion[Distance])
    ))
  override def fields(t: Location_distance): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Location_distance): Option[String]                   = t.id
  def extractValue(t: Location_distance): Distance                      = t.value.get.toSubRefNonUnion[Distance]
  override val thisName: String                                         = "Location_distance"
  override val searchParams: Map[String, Location_distance => Seq[Any]] = Extension.searchParams
  def unapply(o: Location_distance): Option[(Option[String], Distance)] = Some((o.id, o.value.get.toSubRefNonUnion[Distance]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Location_distance] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Location_distance(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Distance]("valueDistance", None),
          decodeAttributes(cursor)
        )
      ))
}

/** A calculated distance between the resource and a provided location.
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
class Location_distance(
    override val id: Option[String] = None,
    value: Distance,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choice(value)),
      url = "http://hl7.org/fhir/StructureDefinition/location-distance",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
