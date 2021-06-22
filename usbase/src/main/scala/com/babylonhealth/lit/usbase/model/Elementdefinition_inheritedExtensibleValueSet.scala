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

object Elementdefinition_inheritedExtensibleValueSet extends CompanionFor[Elementdefinition_inheritedExtensibleValueSet] {
  implicit def summonObjectAndCompanionElementdefinition_inheritedExtensibleValueSet_1619388385(
      o: Elementdefinition_inheritedExtensibleValueSet): ObjectAndCompanion[Elementdefinition_inheritedExtensibleValueSet, Elementdefinition_inheritedExtensibleValueSet.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String] = Some(
    "http://hl7.org/fhir/StructureDefinition/elementdefinition-inheritedExtensibleValueSet")
  type ValueChoice = Choice[Union00545979821]
  def apply(
      id: Option[String] = None,
      value: Elementdefinition_inheritedExtensibleValueSet.ValueChoice,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Elementdefinition_inheritedExtensibleValueSet = new Elementdefinition_inheritedExtensibleValueSet(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[Elementdefinition_inheritedExtensibleValueSet.ValueChoice] =
    FHIRComponentFieldMeta(
      "value",
      lTagOf[Elementdefinition_inheritedExtensibleValueSet.ValueChoice],
      true,
      lTagOf[Union00545979821])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Elementdefinition_inheritedExtensibleValueSet.ValueChoice](value, t.value.get.toSubRef)
    ))
  override def fields(t: Elementdefinition_inheritedExtensibleValueSet): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Elementdefinition_inheritedExtensibleValueSet): Option[String]                   = t.id
  def extractValue(t: Elementdefinition_inheritedExtensibleValueSet): Elementdefinition_inheritedExtensibleValueSet.ValueChoice =
    t.value.get.toSubRef
  override val thisName: String = "Elementdefinition_inheritedExtensibleValueSet"
  override val searchParams: Map[String, Elementdefinition_inheritedExtensibleValueSet => Seq[Any]] = Extension.searchParams
  def unapply(
      o: Elementdefinition_inheritedExtensibleValueSet): Option[(Option[String], Elementdefinition_inheritedExtensibleValueSet.ValueChoice)] =
    Some((o.id, o.value.get.toSubRef))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Elementdefinition_inheritedExtensibleValueSet] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Elementdefinition_inheritedExtensibleValueSet(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeRef[Union00545979821]("value"),
          decodeAttributes(cursor)
        )
      ))
}

/** A reference to an extensible value set specified in a parent profie in order to allow a conformance checking tool to validate
  * that a code not in the extensible value set of the profile is not violating rules defined by parent profile bindings.
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
class Elementdefinition_inheritedExtensibleValueSet(
    override val id: Option[String] = None,
    value: Elementdefinition_inheritedExtensibleValueSet.ValueChoice,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(value.toSuperRef),
      url = "http://hl7.org/fhir/StructureDefinition/elementdefinition-inheritedExtensibleValueSet",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
