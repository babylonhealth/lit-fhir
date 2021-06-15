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
import com.babylonhealth.lit.usbase.HL7_WORK_GROUP
import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Structuredefinition_wg extends CompanionFor[Structuredefinition_wg] {
  implicit def summonObjectAndCompanionStructuredefinition_wg_1327107440(
      o: Structuredefinition_wg): ObjectAndCompanion[Structuredefinition_wg, Structuredefinition_wg.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String] = Some("http://hl7.org/fhir/StructureDefinition/structuredefinition-wg")
  def apply(
      id: Option[String] = None,
      value: HL7_WORK_GROUP,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Structuredefinition_wg = new Structuredefinition_wg(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[HL7_WORK_GROUP] =
    FHIRComponentFieldMeta("value", lTagOf[HL7_WORK_GROUP], true, lTagOf[HL7_WORK_GROUP])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[HL7_WORK_GROUP](value, HL7_WORK_GROUP.withName(t.value.get.toSubRefNonUnion[Code]))
    ))
  override def fields(t: Structuredefinition_wg): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Structuredefinition_wg): Option[String]                   = t.id
  def extractValue(t: Structuredefinition_wg): HL7_WORK_GROUP =
    HL7_WORK_GROUP.withName(t.value.get.toSubRefNonUnion[Code])
  override val thisName: String                                              = "Structuredefinition_wg"
  override val searchParams: Map[String, Structuredefinition_wg => Seq[Any]] = Extension.searchParams
  def unapply(o: Structuredefinition_wg): Option[(Option[String], HL7_WORK_GROUP)] = Some(
    (o.id, HL7_WORK_GROUP.withName(o.value.get.toSubRefNonUnion[Code])))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Structuredefinition_wg] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Structuredefinition_wg(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[HL7_WORK_GROUP]("valueCode", None),
          decodeAttributes(cursor)
        )
      ))
}

/** The work group that owns and maintains this resource.
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
class Structuredefinition_wg(
    override val id: Option[String] = None,
    value: HL7_WORK_GROUP,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choice(value)),
      url = "http://hl7.org/fhir/StructureDefinition/structuredefinition-wg",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
