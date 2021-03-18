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
import com.babylonhealth.lit.usbase.NAME_ASSEMBLY_ORDER
import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Humanname_assembly_order extends CompanionFor[Humanname_assembly_order] {
  override val baseType: CompanionFor[Extension] = Extension
  override val profileUrl: Option[String]        = Some("http://hl7.org/fhir/StructureDefinition/humanname-assembly-order")
  def apply(
      id: Option[String] = None,
      value: NAME_ASSEMBLY_ORDER,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Humanname_assembly_order = new Humanname_assembly_order(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[NAME_ASSEMBLY_ORDER] =
    FHIRComponentFieldMeta("value", lTagOf[NAME_ASSEMBLY_ORDER], true, lTagOf[NAME_ASSEMBLY_ORDER])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fields(t: Extension): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[NAME_ASSEMBLY_ORDER](value, NAME_ASSEMBLY_ORDER.withName(t.value.get.toSubRefNonUnion[Code]))
  )
  def extractId(t: Humanname_assembly_order): Option[String] = t.id
  def extractValue(t: Humanname_assembly_order): NAME_ASSEMBLY_ORDER =
    NAME_ASSEMBLY_ORDER.withName(t.value.get.toSubRefNonUnion[Code])
  override val thisName: String                                                = "Humanname_assembly_order"
  override val searchParams: Map[String, Humanname_assembly_order => Seq[Any]] = Extension.searchParams
  def unapply(o: Humanname_assembly_order): Option[(Option[String], NAME_ASSEMBLY_ORDER)] = Some(
    (o.id, NAME_ASSEMBLY_ORDER.withName(o.value.get.toSubRefNonUnion[Code])))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Humanname_assembly_order] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Humanname_assembly_order(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[NAME_ASSEMBLY_ORDER]("valueCode", None),
          decodeAttributes(cursor)
        )
      ))
}

/** A code that represents the preferred display order of the components of this human name.
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
class Humanname_assembly_order(
    override val id: Option[String] = None,
    value: NAME_ASSEMBLY_ORDER,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choice(value)),
      url = "http://hl7.org/fhir/StructureDefinition/humanname-assembly-order",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
