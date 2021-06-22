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

object Organizationaffiliation_primaryInd extends CompanionFor[Organizationaffiliation_primaryInd] {
  implicit def summonObjectAndCompanionOrganizationaffiliation_primaryInd_849763614(
      o: Organizationaffiliation_primaryInd): ObjectAndCompanion[Organizationaffiliation_primaryInd, Organizationaffiliation_primaryInd.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String] = Some("http://hl7.org/fhir/StructureDefinition/organizationaffiliation-primaryInd")
  def apply(
      id: Option[String] = None,
      value: Boolean,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Organizationaffiliation_primaryInd = new Organizationaffiliation_primaryInd(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[Boolean] =
    FHIRComponentFieldMeta("value", lTagOf[Boolean], true, lTagOf[Boolean])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Boolean](value, t.value.get.toSubRefNonUnion[Boolean])
    ))
  override def fields(t: Organizationaffiliation_primaryInd): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Organizationaffiliation_primaryInd): Option[String]                   = t.id
  def extractValue(t: Organizationaffiliation_primaryInd): Boolean                       = t.value.get.toSubRefNonUnion[Boolean]
  override val thisName: String                                                          = "Organizationaffiliation_primaryInd"
  override val searchParams: Map[String, Organizationaffiliation_primaryInd => Seq[Any]] = Extension.searchParams
  def unapply(o: Organizationaffiliation_primaryInd): Option[(Option[String], Boolean)] = Some(
    (o.id, o.value.get.toSubRefNonUnion[Boolean]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Organizationaffiliation_primaryInd] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Organizationaffiliation_primaryInd(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Boolean]("valueBoolean", None),
          decodeAttributes(cursor)
        )
      ))
}

/** Flag indicating if the specialty is the primary specialty of the provider. Normally, a practitioner will have one primary
  * specialty, but in some cases more than one can be primary.
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
class Organizationaffiliation_primaryInd(
    override val id: Option[String] = None,
    value: Boolean,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choice(value)),
      url = "http://hl7.org/fhir/StructureDefinition/organizationaffiliation-primaryInd",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
