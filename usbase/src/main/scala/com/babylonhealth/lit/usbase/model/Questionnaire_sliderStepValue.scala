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

object Questionnaire_sliderStepValue extends CompanionFor[Questionnaire_sliderStepValue] {
  override val baseType: CompanionFor[Extension] = Extension
  def apply(
      id: Option[String] = None,
      url: String,
      value: Int,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Questionnaire_sliderStepValue = new Questionnaire_sliderStepValue(
    id,
    url,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val url: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("url", lTagOf[String], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[Int] =
    FHIRComponentFieldMeta("value", lTagOf[Int], true, lTagOf[Int])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, url, value)
  override def fields(t: Questionnaire_sliderStepValue): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[String](url, t.url),
    FHIRComponentField[Int](value, t.value.get.toSubRefNonUnion[Int])
  )
  def extractId(t: Questionnaire_sliderStepValue): Option[String]                   = t.id
  def extractUrl(t: Questionnaire_sliderStepValue): String                          = t.url
  def extractValue(t: Questionnaire_sliderStepValue): Int                           = t.value.get.toSubRefNonUnion[Int]
  override val thisName: String                                                     = "Questionnaire_sliderStepValue"
  override val searchParams: Map[String, Questionnaire_sliderStepValue => Seq[Any]] = Extension.searchParams
  def unapply(o: Questionnaire_sliderStepValue): Option[(Option[String], String, Int)] = Some(
    (o.id, o.url, o.value.get.toSubRefNonUnion[Int]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Questionnaire_sliderStepValue] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Questionnaire_sliderStepValue(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[String]("url", None),
          cursor.decodeAs[Int]("valueInteger", None),
          decodeAttributes(cursor)
        )
      ))
}

/** For slider-based controls, indicates the step size to use when toggling the control up or down.
  *
  *  Subclass of [[core.model.Extension]] (Base StructureDefinition for Extension Type: Optional Extension Element - found in all resources.)
  *
  * @constructor Inherits all params from parent.
  *              Refines the types of: value.
  *              Requires the following fields which were optional in the parent: value.
  *              Forbids the use of the following fields which were optional in the parent: extension.
  * @param id - Unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces.
  * @param url - Source of the definition for the extension code - a logical name or a URL.
  * @param value - Value of extension - must be one of a constrained set of the data types (see [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
  */
@POJOBoilerplate
class Questionnaire_sliderStepValue(
    override val id: Option[String] = None,
    override val url: String,
    value: Int,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(id = id, url = url, value = Some(choice(value)), primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}