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

object Iso21090_ADXP_deliveryInstallationQualifier extends CompanionFor[Iso21090_ADXP_deliveryInstallationQualifier] {
  implicit def summonObjectAndCompanionIso21090_ADXP_deliveryInstallationQualifier1616073695(
      o: Iso21090_ADXP_deliveryInstallationQualifier): ObjectAndCompanion[Iso21090_ADXP_deliveryInstallationQualifier, Iso21090_ADXP_deliveryInstallationQualifier.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String] = Some(
    "http://hl7.org/fhir/StructureDefinition/iso21090-ADXP-deliveryInstallationQualifier")
  def apply(
      id: Option[String] = None,
      value: String,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Iso21090_ADXP_deliveryInstallationQualifier = new Iso21090_ADXP_deliveryInstallationQualifier(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("value", lTagOf[String], true, lTagOf[String])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[String](value, t.value.get.toSubRefNonUnion[String])
    ))
  override def fields(t: Iso21090_ADXP_deliveryInstallationQualifier): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Iso21090_ADXP_deliveryInstallationQualifier): Option[String]                   = t.id
  def extractValue(t: Iso21090_ADXP_deliveryInstallationQualifier): String = t.value.get.toSubRefNonUnion[String]
  override val thisName: String                                            = "Iso21090_ADXP_deliveryInstallationQualifier"
  override val searchParams: Map[String, Iso21090_ADXP_deliveryInstallationQualifier => Seq[Any]] = Extension.searchParams
  def unapply(o: Iso21090_ADXP_deliveryInstallationQualifier): Option[(Option[String], String)] = Some(
    (o.id, o.value.get.toSubRefNonUnion[String]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Iso21090_ADXP_deliveryInstallationQualifier] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Iso21090_ADXP_deliveryInstallationQualifier(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[String]("valueString", None),
          decodeAttributes(cursor)
        )
      ))
}

/** A number, letter or name identifying a delivery installation. For example, for Station A, the delivery installation qualifier
  * would be 'A'.
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
class Iso21090_ADXP_deliveryInstallationQualifier(
    override val id: Option[String] = None,
    value: String,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choice(value)),
      url = "http://hl7.org/fhir/StructureDefinition/iso21090-ADXP-deliveryInstallationQualifier",
      primitiveAttributes = primitiveAttributes
    ) {
  override val thisTypeName: String = "Extension"
}
