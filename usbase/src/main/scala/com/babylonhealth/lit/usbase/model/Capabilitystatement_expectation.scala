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
import com.babylonhealth.lit.usbase.CONFORMANCE_EXPECTATION
import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Capabilitystatement_expectation extends CompanionFor[Capabilitystatement_expectation] {
  override val baseType: CompanionFor[Extension] = Extension
  override val profileUrl: Option[String] = Some(
    "http://hl7.org/fhir/StructureDefinition/capabilitystatement-expectation")
  def apply(
      id: Option[String] = None,
      url: String,
      value: CONFORMANCE_EXPECTATION,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Capabilitystatement_expectation = new Capabilitystatement_expectation(
    id,
    url,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val url: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("url", lTagOf[String], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[CONFORMANCE_EXPECTATION] =
    FHIRComponentFieldMeta("value", lTagOf[CONFORMANCE_EXPECTATION], true, lTagOf[CONFORMANCE_EXPECTATION])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, url, value)
  override def fields(t: Capabilitystatement_expectation): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[String](url, t.url),
    FHIRComponentField[CONFORMANCE_EXPECTATION](value, t.value.get.toSubRefNonUnion[CONFORMANCE_EXPECTATION])
  )
  def extractId(t: Capabilitystatement_expectation): Option[String] = t.id
  def extractUrl(t: Capabilitystatement_expectation): String        = t.url
  def extractValue(t: Capabilitystatement_expectation): CONFORMANCE_EXPECTATION =
    t.value.get.toSubRefNonUnion[CONFORMANCE_EXPECTATION]
  override val thisName: String                                                       = "Capabilitystatement_expectation"
  override val searchParams: Map[String, Capabilitystatement_expectation => Seq[Any]] = Extension.searchParams
  def unapply(o: Capabilitystatement_expectation): Option[(Option[String], String, CONFORMANCE_EXPECTATION)] = Some(
    (o.id, o.url, o.value.get.toSubRefNonUnion[CONFORMANCE_EXPECTATION]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Capabilitystatement_expectation] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Capabilitystatement_expectation(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[String]("url", None),
          cursor.decodeAs[CONFORMANCE_EXPECTATION]("valueCode", None),
          decodeAttributes(cursor)
        )
      ))
}

/** Defines the level of expectation associated with a given system capability.
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
class Capabilitystatement_expectation(
    override val id: Option[String] = None,
    override val url: String,
    value: CONFORMANCE_EXPECTATION,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(id = id, url = url, value = Some(choice(value)), primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
