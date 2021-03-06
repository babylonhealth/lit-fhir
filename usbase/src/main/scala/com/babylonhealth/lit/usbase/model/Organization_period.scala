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

object Organization_period extends CompanionFor[Organization_period] {
  implicit def summonObjectAndCompanionOrganization_period285066662(
      o: Organization_period): ObjectAndCompanion[Organization_period, Organization_period.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/organization-period")
  def apply(
      id: Option[String] = None,
      value: Period,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Organization_period = new Organization_period(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[Period] =
    FHIRComponentFieldMeta("value", lTagOf[Period], true, lTagOf[Period])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Period](value, t.value.get.toSubRefNonUnion[Period])
    ))
  override def fields(t: Organization_period): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Organization_period): Option[String]                   = t.id
  def extractValue(t: Organization_period): Period                        = t.value.get.toSubRefNonUnion[Period]
  override val thisName: String                                           = "Organization_period"
  override val searchParams: Map[String, Organization_period => Seq[Any]] = Extension.searchParams
  def unapply(o: Organization_period): Option[(Option[String], Period)]   = Some((o.id, o.value.get.toSubRefNonUnion[Period]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Organization_period] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Organization_period(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Period]("valuePeriod", None),
          decodeAttributes(cursor)
        )
      ))
}

/** The date range that this organization should be considered available.
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
class Organization_period(
    override val id: Option[String] = None,
    value: Period,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choice(value)),
      url = "http://hl7.org/fhir/StructureDefinition/organization-period",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
