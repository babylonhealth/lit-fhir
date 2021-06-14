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

object Iso21090_uncertainty extends CompanionFor[Iso21090_uncertainty] {
  implicit def summonObjectAndCompanionIso21090_uncertainty_1183257806(
      o: Iso21090_uncertainty): ObjectAndCompanion[Iso21090_uncertainty, Iso21090_uncertainty.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/iso21090-uncertainty")
  def apply(
      id: Option[String] = None,
      value: BigDecimal,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Iso21090_uncertainty = new Iso21090_uncertainty(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[BigDecimal] =
    FHIRComponentFieldMeta("value", lTagOf[BigDecimal], true, lTagOf[BigDecimal])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[BigDecimal](value, t.value.get.toSubRefNonUnion[BigDecimal])
    ))
  override def fields(t: Iso21090_uncertainty): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Iso21090_uncertainty): Option[String]                   = t.id
  def extractValue(t: Iso21090_uncertainty): BigDecimal                    = t.value.get.toSubRefNonUnion[BigDecimal]
  override val thisName: String                                            = "Iso21090_uncertainty"
  override val searchParams: Map[String, Iso21090_uncertainty => Seq[Any]] = Extension.searchParams
  def unapply(o: Iso21090_uncertainty): Option[(Option[String], BigDecimal)] = Some(
    (o.id, o.value.get.toSubRefNonUnion[BigDecimal]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Iso21090_uncertainty] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Iso21090_uncertainty(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[BigDecimal]("valueDecimal", None),
          decodeAttributes(cursor)
        )
      ))
}

/** The primary measure of variance/uncertainty of the value (the square root of the sum of the squares of the differences between all data points and the mean).
  *
  *  Subclass of [[core.model.Extension]] (Base StructureDefinition for Extension Type: Optional Extension Element - found in all resources.)
  *
  * @constructor Inherits all params from parent.
  *              Refines the types of: value.
  *              Requires the following fields which were optional in the parent: value.
  *              Forbids the use of the following fields which were optional in the parent: extension.
  *              Hardcodes the value of the following fields: url.
  * @param id - Unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces.
  * @param url - Source of the definition for the extension code - a logical name or a URL.
  * @param value - Value of extension - must be one of a constrained set of the data types (see [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
  */
@POJOBoilerplate
class Iso21090_uncertainty(
    override val id: Option[String] = None,
    value: BigDecimal,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choice(value)),
      url = "http://hl7.org/fhir/StructureDefinition/iso21090-uncertainty",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
