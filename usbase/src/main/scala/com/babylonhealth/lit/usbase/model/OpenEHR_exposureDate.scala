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

object OpenEHR_exposureDate extends CompanionFor[OpenEHR_exposureDate] {
  implicit def summonObjectAndCompanionOpenEHR_exposureDate_469991438(
      o: OpenEHR_exposureDate): ObjectAndCompanion[OpenEHR_exposureDate, OpenEHR_exposureDate.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/openEHR-exposureDate")
  def apply(
      id: Option[String] = None,
      value: FHIRDateTime,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): OpenEHR_exposureDate = new OpenEHR_exposureDate(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[FHIRDateTime] =
    FHIRComponentFieldMeta("value", lTagOf[FHIRDateTime], true, lTagOf[FHIRDateTime])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[FHIRDateTime](value, t.value.get.toSubRefNonUnion[FHIRDateTime])
    ))
  override def fields(t: OpenEHR_exposureDate): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: OpenEHR_exposureDate): Option[String]                   = t.id
  def extractValue(t: OpenEHR_exposureDate): FHIRDateTime                  = t.value.get.toSubRefNonUnion[FHIRDateTime]
  override val thisName: String                                            = "OpenEHR_exposureDate"
  override val searchParams: Map[String, OpenEHR_exposureDate => Seq[Any]] = Extension.searchParams
  def unapply(o: OpenEHR_exposureDate): Option[(Option[String], FHIRDateTime)] = Some(
    (o.id, o.value.get.toSubRefNonUnion[FHIRDateTime]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[OpenEHR_exposureDate] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new OpenEHR_exposureDate(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[FHIRDateTime]("valueDateTime", None),
          decodeAttributes(cursor)
        )
      ))
}

/** Record of the date and/or time of the first exposure to the Substance for this Reaction Event.
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
class OpenEHR_exposureDate(
    override val id: Option[String] = None,
    value: FHIRDateTime,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choice(value)),
      url = "http://hl7.org/fhir/StructureDefinition/openEHR-exposureDate",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
