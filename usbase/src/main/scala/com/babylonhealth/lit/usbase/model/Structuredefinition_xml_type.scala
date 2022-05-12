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

object Structuredefinition_xml_type extends CompanionFor[Structuredefinition_xml_type] {
  implicit def summonObjectAndCompanionStructuredefinition_xml_type696880236(
      o: Structuredefinition_xml_type): ObjectAndCompanion[Structuredefinition_xml_type, Structuredefinition_xml_type.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/structuredefinition-xml-type")
  def apply(
      id: Option[String] = None,
      value: Option[String] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Structuredefinition_xml_type = new Structuredefinition_xml_type(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("value", lTagOf[Option[String]], true, lTagOf[String])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[String]](value, t.value.map(_.toSubRefNonUnion[String]))
    ))
  override def fields(t: Structuredefinition_xml_type): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Structuredefinition_xml_type): Option[String]                   = t.id
  def extractValue(t: Structuredefinition_xml_type): Option[String]                = t.value.map(_.toSubRefNonUnion[String])
  override val thisName: String                                                    = "Structuredefinition_xml_type"
  override val searchParams: Map[String, Structuredefinition_xml_type => Seq[Any]] = Extension.searchParams
  def unapply(o: Structuredefinition_xml_type): Option[(Option[String], Option[String])] = Some(
    (o.id, o.value.map(_.toSubRefNonUnion[String])))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Structuredefinition_xml_type] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Structuredefinition_xml_type(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[String]]("valueString", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** The XML (schema) type of a property - used for the value attribute of a primitive type (for which there is no type in the FHIR
  * typing system).
  *
  * Subclass of [[core.model.Extension]] (Base StructureDefinition for Extension Type: Optional Extension Element - found in all
  * resources.)
  *
  * @constructor
  *   Inherits all params from parent. Refines the types of: value. Forbids the use of the following fields which were optional in
  *   the parent: extension. Hardcodes the value of the following fields: url.
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
class Structuredefinition_xml_type(
    override val id: Option[String] = None,
    value: Option[String] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = value.map(choice(_)),
      url = "http://hl7.org/fhir/StructureDefinition/structuredefinition-xml-type",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
