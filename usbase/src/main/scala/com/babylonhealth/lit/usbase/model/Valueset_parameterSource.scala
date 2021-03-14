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
import com.babylonhealth.lit.usbase.EXPANSION_PARAMETER_SOURCE
import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Valueset_parameterSource extends CompanionFor[Valueset_parameterSource] {
  override val baseType: CompanionFor[Extension] = Extension
  def apply(
      id: Option[String] = None,
      url: String,
      value: EXPANSION_PARAMETER_SOURCE,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Valueset_parameterSource = new Valueset_parameterSource(
    id,
    url,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val url: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("url", lTagOf[String], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[EXPANSION_PARAMETER_SOURCE] =
    FHIRComponentFieldMeta("value", lTagOf[EXPANSION_PARAMETER_SOURCE], true, lTagOf[EXPANSION_PARAMETER_SOURCE])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, url, value)
  override def fields(t: Valueset_parameterSource): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[String](url, t.url),
    FHIRComponentField[EXPANSION_PARAMETER_SOURCE](value, t.value.get.toSubRefNonUnion[EXPANSION_PARAMETER_SOURCE])
  )
  def extractId(t: Valueset_parameterSource): Option[String] = t.id
  def extractUrl(t: Valueset_parameterSource): String        = t.url
  def extractValue(t: Valueset_parameterSource): EXPANSION_PARAMETER_SOURCE =
    t.value.get.toSubRefNonUnion[EXPANSION_PARAMETER_SOURCE]
  override val thisName: String                                                = "Valueset_parameterSource"
  override val searchParams: Map[String, Valueset_parameterSource => Seq[Any]] = Extension.searchParams
  def unapply(o: Valueset_parameterSource): Option[(Option[String], String, EXPANSION_PARAMETER_SOURCE)] = Some(
    (o.id, o.url, o.value.get.toSubRefNonUnion[EXPANSION_PARAMETER_SOURCE]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Valueset_parameterSource] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Valueset_parameterSource(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[String]("url", None),
          cursor.decodeAs[EXPANSION_PARAMETER_SOURCE]("valueCode", None),
          decodeAttributes(cursor)
        )
      ))
}

/** Declares what the source of this parameter is.
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
class Valueset_parameterSource(
    override val id: Option[String] = None,
    override val url: String,
    value: EXPANSION_PARAMETER_SOURCE,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(id = id, url = url, value = Some(choice(value)), primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
