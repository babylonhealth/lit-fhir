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
import com.babylonhealth.lit.usbase.TEMPLATE_STATUS_CODE
import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Structuredefinition_template_status extends CompanionFor[Structuredefinition_template_status] {
  override val baseType: CompanionFor[Extension] = Extension
  override val profileUrl: Option[String] = Some(
    "http://hl7.org/fhir/StructureDefinition/structuredefinition-template-status")
  def apply(
      id: Option[String] = None,
      value: TEMPLATE_STATUS_CODE,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Structuredefinition_template_status = new Structuredefinition_template_status(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[TEMPLATE_STATUS_CODE] =
    FHIRComponentFieldMeta("value", lTagOf[TEMPLATE_STATUS_CODE], true, lTagOf[TEMPLATE_STATUS_CODE])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fields(t: Structuredefinition_template_status): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[TEMPLATE_STATUS_CODE](value, t.value.get.toSubRefNonUnion[TEMPLATE_STATUS_CODE])
  )
  def extractId(t: Structuredefinition_template_status): Option[String] = t.id
  def extractValue(t: Structuredefinition_template_status): TEMPLATE_STATUS_CODE =
    t.value.get.toSubRefNonUnion[TEMPLATE_STATUS_CODE]
  override val thisName: String                                                           = "Structuredefinition_template_status"
  override val searchParams: Map[String, Structuredefinition_template_status => Seq[Any]] = Extension.searchParams
  def unapply(o: Structuredefinition_template_status): Option[(Option[String], TEMPLATE_STATUS_CODE)] = Some(
    (o.id, o.value.get.toSubRefNonUnion[TEMPLATE_STATUS_CODE]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Structuredefinition_template_status] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Structuredefinition_template_status(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[TEMPLATE_STATUS_CODE]("valueCode", None),
          decodeAttributes(cursor)
        )
      ))
}

/** Status code taken from [HL7 template specification](http://www.hl7.org/implement/standards/product_brief.cfm?product_id=377) - allows for alignment with the template DSTU, and has more authoring status codes.
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
class Structuredefinition_template_status(
    override val id: Option[String] = None,
    value: TEMPLATE_STATUS_CODE,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choice(value)),
      url = "http://hl7.org/fhir/StructureDefinition/structuredefinition-template-status",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
