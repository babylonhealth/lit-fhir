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

object Workflow_instantiatesCanonical extends CompanionFor[Workflow_instantiatesCanonical] {
  implicit def summonObjectAndCompanionWorkflow_instantiatesCanonical131666354(
      o: Workflow_instantiatesCanonical): ObjectAndCompanion[Workflow_instantiatesCanonical, Workflow_instantiatesCanonical.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String] = Some("http://hl7.org/fhir/StructureDefinition/workflow-instantiatesCanonical")
  def apply(
      id: Option[String] = None,
      value: Canonical,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Workflow_instantiatesCanonical = new Workflow_instantiatesCanonical(
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
  override def fields(t: Workflow_instantiatesCanonical): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Workflow_instantiatesCanonical): Option[String]                   = t.id
  def extractValue(t: Workflow_instantiatesCanonical): Canonical                     = t.value.get.toSubRefNonUnion[Canonical]
  override val thisName: String                                                      = "Workflow_instantiatesCanonical"
  override val searchParams: Map[String, Workflow_instantiatesCanonical => Seq[Any]] = Extension.searchParams
  def unapply(o: Workflow_instantiatesCanonical): Option[(Option[String], Canonical)] = Some(
    (o.id, o.value.get.toSubRefNonUnion[Canonical]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Workflow_instantiatesCanonical] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Workflow_instantiatesCanonical(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Canonical]("valueCanonical", None),
          decodeAttributes(cursor)
        )
      ))
}

/** The URL pointing to a FHIR-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by
  * the event or request resource.
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
class Workflow_instantiatesCanonical(
    override val id: Option[String] = None,
    value: Canonical,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(new Choice("Canonical", value)(UnionAllTag)),
      url = "http://hl7.org/fhir/StructureDefinition/workflow-instantiatesCanonical",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
