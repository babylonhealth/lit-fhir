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
import com.babylonhealth.lit.usbase.RESOURCE_SECURITY_CATEGORY
import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Structuredefinition_security_category extends CompanionFor[Structuredefinition_security_category] {
  implicit def summonObjectAndCompanionStructuredefinition_security_category1470508891(
      o: Structuredefinition_security_category): ObjectAndCompanion[Structuredefinition_security_category, Structuredefinition_security_category.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String] = Some(
    "http://hl7.org/fhir/StructureDefinition/structuredefinition-security-category")
  def apply(
      id: Option[String] = None,
      value: RESOURCE_SECURITY_CATEGORY,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Structuredefinition_security_category = new Structuredefinition_security_category(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[RESOURCE_SECURITY_CATEGORY] =
    FHIRComponentFieldMeta("value", lTagOf[RESOURCE_SECURITY_CATEGORY], true, lTagOf[RESOURCE_SECURITY_CATEGORY])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[RESOURCE_SECURITY_CATEGORY](
        value,
        RESOURCE_SECURITY_CATEGORY.withName(t.value.get.toSubRefNonUnion[Code]))
    ))
  override def fields(t: Structuredefinition_security_category): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Structuredefinition_security_category): Option[String]                   = t.id
  def extractValue(t: Structuredefinition_security_category): RESOURCE_SECURITY_CATEGORY =
    RESOURCE_SECURITY_CATEGORY.withName(t.value.get.toSubRefNonUnion[Code])
  override val thisName: String = "Structuredefinition_security_category"
  override val searchParams: Map[String, Structuredefinition_security_category => Seq[Any]] = Extension.searchParams
  def unapply(o: Structuredefinition_security_category): Option[(Option[String], RESOURCE_SECURITY_CATEGORY)] = Some(
    (o.id, RESOURCE_SECURITY_CATEGORY.withName(o.value.get.toSubRefNonUnion[Code])))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Structuredefinition_security_category] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Structuredefinition_security_category(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[RESOURCE_SECURITY_CATEGORY]("valueCode", None),
          decodeAttributes(cursor)
        )
      ))
}

/** Provides general guidance around the kind of access Control to Read, Search, Create, Update, or Delete the resource.
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
class Structuredefinition_security_category(
    override val id: Option[String] = None,
    value: RESOURCE_SECURITY_CATEGORY,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choiceFromEnum(value)),
      url = "http://hl7.org/fhir/StructureDefinition/structuredefinition-security-category",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
