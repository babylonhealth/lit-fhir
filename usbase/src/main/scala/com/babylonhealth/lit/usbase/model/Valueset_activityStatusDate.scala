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

object Valueset_activityStatusDate extends CompanionFor[Valueset_activityStatusDate] {
  implicit def summonObjectAndCompanionValueset_activityStatusDate_1970129866(
      o: Valueset_activityStatusDate): ObjectAndCompanion[Valueset_activityStatusDate, Valueset_activityStatusDate.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/valueset-activityStatusDate")
  def apply(
      id: Option[String] = None,
      value: FHIRDate,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Valueset_activityStatusDate = new Valueset_activityStatusDate(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[FHIRDate] =
    FHIRComponentFieldMeta("value", lTagOf[FHIRDate], true, lTagOf[FHIRDate])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[FHIRDate](value, t.value.get.toSubRefNonUnion[FHIRDate])
    ))
  override def fields(t: Valueset_activityStatusDate): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Valueset_activityStatusDate): Option[String]                   = t.id
  def extractValue(t: Valueset_activityStatusDate): FHIRDate                      = t.value.get.toSubRefNonUnion[FHIRDate]
  override val thisName: String                                                   = "Valueset_activityStatusDate"
  override val searchParams: Map[String, Valueset_activityStatusDate => Seq[Any]] = Extension.searchParams
  def unapply(o: Valueset_activityStatusDate): Option[(Option[String], FHIRDate)] = Some(
    (o.id, o.value.get.toSubRefNonUnion[FHIRDate]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Valueset_activityStatusDate] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Valueset_activityStatusDate(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[FHIRDate]("valueDate", None),
          decodeAttributes(cursor)
        )
      ))
}

/** The date when the associated Value Set Definition Version activity status is in effect.
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
class Valueset_activityStatusDate(
    override val id: Option[String] = None,
    value: FHIRDate,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choice(value)),
      url = "http://hl7.org/fhir/StructureDefinition/valueset-activityStatusDate",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
