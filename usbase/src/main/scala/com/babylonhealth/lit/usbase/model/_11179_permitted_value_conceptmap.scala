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

object _11179_permitted_value_conceptmap extends CompanionFor[_11179_permitted_value_conceptmap] {
  implicit def summonObjectAndCompanion_11179_permitted_value_conceptmap1766613012(
      o: _11179_permitted_value_conceptmap): ObjectAndCompanion[_11179_permitted_value_conceptmap, _11179_permitted_value_conceptmap.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String] = Some("http://hl7.org/fhir/StructureDefinition/11179-permitted-value-conceptmap")
  def apply(
      id: Option[String] = None,
      value: Canonical,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): _11179_permitted_value_conceptmap = new _11179_permitted_value_conceptmap(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[Canonical] =
    FHIRComponentFieldMeta("value", lTagOf[Canonical], true, lTagOf[Canonical])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Canonical](value, t.value.get.toSubRefNonUnion[Canonical])
    ))
  override def fields(t: _11179_permitted_value_conceptmap): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: _11179_permitted_value_conceptmap): Option[String]                   = t.id
  def extractValue(t: _11179_permitted_value_conceptmap): Canonical                     = t.value.get.toSubRefNonUnion[Canonical]
  override val thisName: String                                                         = "_11179_permitted_value_conceptmap"
  override val searchParams: Map[String, _11179_permitted_value_conceptmap => Seq[Any]] = Extension.searchParams
  def unapply(o: _11179_permitted_value_conceptmap): Option[(Option[String], Canonical)] = Some(
    (o.id, o.value.get.toSubRefNonUnion[Canonical]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[_11179_permitted_value_conceptmap] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new _11179_permitted_value_conceptmap(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Canonical]("valueCanonical", None),
          decodeAttributes(cursor)
        )
      ))
}

/** Expresses the linkage between the internal codes used for storage and the codes used for exchange.
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
  *     spaces.
  * @param url
  *   - Source of the definition for the extension code - a logical name or a URL.
  * @param value
  *   - Value of extension - must be one of a constrained set of the data types (see
  *     [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
  */
@POJOBoilerplate
class _11179_permitted_value_conceptmap(
    override val id: Option[String] = None,
    value: Canonical,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choice(value)),
      url = "http://hl7.org/fhir/StructureDefinition/11179-permitted-value-conceptmap",
      primitiveAttributes = primitiveAttributes
    ) {
  override val thisTypeName: String = "Extension"
}
