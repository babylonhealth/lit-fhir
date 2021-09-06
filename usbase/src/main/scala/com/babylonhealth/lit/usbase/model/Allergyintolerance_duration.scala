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

object Allergyintolerance_duration extends CompanionFor[Allergyintolerance_duration] {
  implicit def summonObjectAndCompanionAllergyintolerance_duration1271592900(
      o: Allergyintolerance_duration): ObjectAndCompanion[Allergyintolerance_duration, Allergyintolerance_duration.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/allergyintolerance-duration")
  def apply(
      id: Option[String] = None,
      value: Duration,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Allergyintolerance_duration = new Allergyintolerance_duration(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[Duration] =
    FHIRComponentFieldMeta("value", lTagOf[Duration], true, lTagOf[Duration])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Duration](value, t.value.get.toSubRefNonUnion[Duration])
    ))
  override def fields(t: Allergyintolerance_duration): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Allergyintolerance_duration): Option[String]                   = t.id
  def extractValue(t: Allergyintolerance_duration): Duration                      = t.value.get.toSubRefNonUnion[Duration]
  override val thisName: String                                                   = "Allergyintolerance_duration"
  override val searchParams: Map[String, Allergyintolerance_duration => Seq[Any]] = Extension.searchParams
  def unapply(o: Allergyintolerance_duration): Option[(Option[String], Duration)] = Some(
    (o.id, o.value.get.toSubRefNonUnion[Duration]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Allergyintolerance_duration] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Allergyintolerance_duration(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Duration]("valueDuration", None),
          decodeAttributes(cursor)
        )
      ))
}

/** The amount of time that the Adverse Reaction persisted.
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
class Allergyintolerance_duration(
    override val id: Option[String] = None,
    value: Duration,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choice(value)),
      url = "http://hl7.org/fhir/StructureDefinition/allergyintolerance-duration",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
