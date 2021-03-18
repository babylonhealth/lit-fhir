package com.babylonhealth.lit.usbase.model

import java.time.{ LocalDate, LocalTime, ZonedDateTime }
import java.util.UUID

import scala.collection.immutable.TreeMap
import scala.util.Try

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

object Allergyintolerance_resolutionAge extends CompanionFor[Allergyintolerance_resolutionAge] {
  override val baseType: CompanionFor[Extension] = Extension
  override val profileUrl: Option[String] = Some(
    "http://hl7.org/fhir/StructureDefinition/allergyintolerance-resolutionAge")
  def apply(
      id: Option[String] = None,
      value: Age,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Allergyintolerance_resolutionAge = new Allergyintolerance_resolutionAge(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[Age] =
    FHIRComponentFieldMeta("value", lTagOf[Age], true, lTagOf[Age])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fields(t: Allergyintolerance_resolutionAge): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Age](value, t.value.get.toSubRefNonUnion[Age])
  )
  def extractId(t: Allergyintolerance_resolutionAge): Option[String]                   = t.id
  def extractValue(t: Allergyintolerance_resolutionAge): Age                           = t.value.get.toSubRefNonUnion[Age]
  override val thisName: String                                                        = "Allergyintolerance_resolutionAge"
  override val searchParams: Map[String, Allergyintolerance_resolutionAge => Seq[Any]] = Extension.searchParams
  def unapply(o: Allergyintolerance_resolutionAge): Option[(Option[String], Age)] = Some(
    (o.id, o.value.get.toSubRefNonUnion[Age]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Allergyintolerance_resolutionAge] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Allergyintolerance_resolutionAge(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Age]("valueAge", None),
          decodeAttributes(cursor)
        )
      ))
}

/** The estimated patient age at which the allergy or intolerance resolved. Should be specified only if the status is resolved.
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
class Allergyintolerance_resolutionAge(
    override val id: Option[String] = None,
    value: Age,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choice(value)),
      url = "http://hl7.org/fhir/StructureDefinition/allergyintolerance-resolutionAge",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
