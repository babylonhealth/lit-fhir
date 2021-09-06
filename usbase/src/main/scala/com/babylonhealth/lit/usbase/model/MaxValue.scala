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

object MaxValue extends CompanionFor[MaxValue] {
  implicit def summonObjectAndCompanionMaxValue811217686(o: MaxValue): ObjectAndCompanion[MaxValue, MaxValue.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/maxValue")
  type ValueChoice = Choice[UnionMaxValue_Value]
  def apply(
      id: Option[String] = None,
      value: MaxValue.ValueChoice,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): MaxValue = new MaxValue(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[MaxValue.ValueChoice] =
    FHIRComponentFieldMeta("value", lTagOf[MaxValue.ValueChoice], true, lTagOf[UnionMaxValue_Value])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[MaxValue.ValueChoice](value, t.value.get.toSubRef)
    ))
  override def fields(t: MaxValue): Seq[FHIRComponentField[_]]             = fieldsFromParent(t).get
  def extractId(t: MaxValue): Option[String]                               = t.id
  def extractValue(t: MaxValue): MaxValue.ValueChoice                      = t.value.get.toSubRef
  override val thisName: String                                            = "MaxValue"
  override val searchParams: Map[String, MaxValue => Seq[Any]]             = Extension.searchParams
  def unapply(o: MaxValue): Option[(Option[String], MaxValue.ValueChoice)] = Some((o.id, o.value.get.toSubRef))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[MaxValue] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new MaxValue(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeRef[UnionMaxValue_Value]("value"),
          decodeAttributes(cursor)
        )
      ))
}

/** The inclusive upper bound on the range of allowed values for the data element.
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
class MaxValue(
    override val id: Option[String] = None,
    value: MaxValue.ValueChoice,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(value.toSuperRef),
      url = "http://hl7.org/fhir/StructureDefinition/maxValue",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
