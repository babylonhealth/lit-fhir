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

object Timing_dayOfMonth extends CompanionFor[Timing_dayOfMonth] {
  implicit def summonObjectAndCompanionTiming_dayOfMonth1245778395(
      o: Timing_dayOfMonth): ObjectAndCompanion[Timing_dayOfMonth, Timing_dayOfMonth.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/timing-dayOfMonth")
  def apply(
      id: Option[String] = None,
      value: PositiveInt,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Timing_dayOfMonth = new Timing_dayOfMonth(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[PositiveInt] =
    FHIRComponentFieldMeta("value", lTagOf[PositiveInt], true, lTagOf[PositiveInt])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[PositiveInt](value, t.value.get.toSubRefNonUnion[PositiveInt])
    ))
  override def fields(t: Timing_dayOfMonth): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Timing_dayOfMonth): Option[String]                   = t.id
  def extractValue(t: Timing_dayOfMonth): PositiveInt                   = t.value.get.toSubRefNonUnion[PositiveInt]
  override val thisName: String                                         = "Timing_dayOfMonth"
  override val searchParams: Map[String, Timing_dayOfMonth => Seq[Any]] = Extension.searchParams
  def unapply(o: Timing_dayOfMonth): Option[(Option[String], PositiveInt)] = Some(
    (o.id, o.value.get.toSubRefNonUnion[PositiveInt]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Timing_dayOfMonth] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Timing_dayOfMonth(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[PositiveInt]("valuePositiveInt", None),
          decodeAttributes(cursor)
        )
      ))
}

/** When present, this extension indicate that the event actually only occurs on the specified days of the month, on the times as
  * otherwise specified by the timing schedule.
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
class Timing_dayOfMonth(
    override val id: Option[String] = None,
    value: PositiveInt,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choice(value)),
      url = "http://hl7.org/fhir/StructureDefinition/timing-dayOfMonth",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
