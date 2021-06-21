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

object MaxDecimalPlaces extends CompanionFor[MaxDecimalPlaces] {
  implicit def summonObjectAndCompanionMaxDecimalPlaces1118945377(
      o: MaxDecimalPlaces): ObjectAndCompanion[MaxDecimalPlaces, MaxDecimalPlaces.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/maxDecimalPlaces")
  def apply(
      id: Option[String] = None,
      value: Int,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): MaxDecimalPlaces = new MaxDecimalPlaces(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[Int] =
    FHIRComponentFieldMeta("value", lTagOf[Int], true, lTagOf[Int])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Int](value, t.value.get.toSubRefNonUnion[Int])
    ))
  override def fields(t: MaxDecimalPlaces): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: MaxDecimalPlaces): Option[String]                   = t.id
  def extractValue(t: MaxDecimalPlaces): Int                           = t.value.get.toSubRefNonUnion[Int]
  override val thisName: String                                        = "MaxDecimalPlaces"
  override val searchParams: Map[String, MaxDecimalPlaces => Seq[Any]] = Extension.searchParams
  def unapply(o: MaxDecimalPlaces): Option[(Option[String], Int)]      = Some((o.id, o.value.get.toSubRefNonUnion[Int]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[MaxDecimalPlaces] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new MaxDecimalPlaces(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Int]("valueInteger", None),
          decodeAttributes(cursor)
        )
      ))
}

/** Identifies the maximum number of decimal places that may be specified for the data element.
  *
  * Subclass of [[core.model.Extension]] (Base StructureDefinition for Extension Type: Optional Extension Element -
  * found in all resources.)
  *
  * @constructor
  *   Inherits all params from parent. Refines the types of: value. Requires the following fields which were optional in
  *   the parent: value. Forbids the use of the following fields which were optional in the parent: extension. Hardcodes
  *   the value of the following fields: url.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does
  *   not contain spaces.
  * @param url
  *   - Source of the definition for the extension code - a logical name or a URL.
  * @param value
  *   - Value of extension - must be one of a constrained set of the data types (see
  *   [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
  */
@POJOBoilerplate
class MaxDecimalPlaces(
    override val id: Option[String] = None,
    value: Int,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choice(value)),
      url = "http://hl7.org/fhir/StructureDefinition/maxDecimalPlaces",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
