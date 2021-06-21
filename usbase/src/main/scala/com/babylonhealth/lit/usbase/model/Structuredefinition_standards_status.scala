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
import com.babylonhealth.lit.usbase.STANDARDS_STATUS
import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Structuredefinition_standards_status extends CompanionFor[Structuredefinition_standards_status] {
  implicit def summonObjectAndCompanionStructuredefinition_standards_status_307317179(
      o: Structuredefinition_standards_status): ObjectAndCompanion[Structuredefinition_standards_status, Structuredefinition_standards_status.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String] = Some(
    "http://hl7.org/fhir/StructureDefinition/structuredefinition-standards-status")
  def apply(
      id: Option[String] = None,
      value: STANDARDS_STATUS,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Structuredefinition_standards_status = new Structuredefinition_standards_status(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[STANDARDS_STATUS] =
    FHIRComponentFieldMeta("value", lTagOf[STANDARDS_STATUS], true, lTagOf[STANDARDS_STATUS])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[STANDARDS_STATUS](value, STANDARDS_STATUS.withName(t.value.get.toSubRefNonUnion[Code]))
    ))
  override def fields(t: Structuredefinition_standards_status): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Structuredefinition_standards_status): Option[String]                   = t.id
  def extractValue(t: Structuredefinition_standards_status): STANDARDS_STATUS =
    STANDARDS_STATUS.withName(t.value.get.toSubRefNonUnion[Code])
  override val thisName: String = "Structuredefinition_standards_status"
  override val searchParams: Map[String, Structuredefinition_standards_status => Seq[Any]] = Extension.searchParams
  def unapply(o: Structuredefinition_standards_status): Option[(Option[String], STANDARDS_STATUS)] = Some(
    (o.id, STANDARDS_STATUS.withName(o.value.get.toSubRefNonUnion[Code])))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Structuredefinition_standards_status] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Structuredefinition_standards_status(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[STANDARDS_STATUS]("valueCode", None),
          decodeAttributes(cursor)
        )
      ))
}

/** The Current HL7 ballot/Standards status of this artifact.
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
class Structuredefinition_standards_status(
    override val id: Option[String] = None,
    value: STANDARDS_STATUS,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choiceFromEnum(value)),
      url = "http://hl7.org/fhir/StructureDefinition/structuredefinition-standards-status",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
