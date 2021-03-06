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

object Procedure_schedule extends CompanionFor[Procedure_schedule] {
  implicit def summonObjectAndCompanionProcedure_schedule_217931546(
      o: Procedure_schedule): ObjectAndCompanion[Procedure_schedule, Procedure_schedule.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/procedure-schedule")
  def apply(
      id: Option[String] = None,
      value: Timing,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Procedure_schedule = new Procedure_schedule(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[Timing] =
    FHIRComponentFieldMeta("value", lTagOf[Timing], true, lTagOf[Timing])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Timing](value, t.value.get.toSubRefNonUnion[Timing])
    ))
  override def fields(t: Procedure_schedule): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Procedure_schedule): Option[String]                   = t.id
  def extractValue(t: Procedure_schedule): Timing                        = t.value.get.toSubRefNonUnion[Timing]
  override val thisName: String                                          = "Procedure_schedule"
  override val searchParams: Map[String, Procedure_schedule => Seq[Any]] = Extension.searchParams
  def unapply(o: Procedure_schedule): Option[(Option[String], Timing)]   = Some((o.id, o.value.get.toSubRefNonUnion[Timing]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Procedure_schedule] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Procedure_schedule(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Timing]("valueTiming", None),
          decodeAttributes(cursor)
        )
      ))
}

/** The schedule that was followed.
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
class Procedure_schedule(
    override val id: Option[String] = None,
    value: Timing,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choice(value)),
      url = "http://hl7.org/fhir/StructureDefinition/procedure-schedule",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
