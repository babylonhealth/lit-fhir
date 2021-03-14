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

object Iso21090_PQ_translation extends CompanionFor[Iso21090_PQ_translation] {
  override val baseType: CompanionFor[Extension] = Extension
  def apply(
      id: Option[String] = None,
      url: String,
      value: Quantity,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Iso21090_PQ_translation = new Iso21090_PQ_translation(
    id,
    url,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val url: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("url", lTagOf[String], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[Quantity] =
    FHIRComponentFieldMeta("value", lTagOf[Quantity], true, lTagOf[Quantity])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, url, value)
  override def fields(t: Iso21090_PQ_translation): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[String](url, t.url),
    FHIRComponentField[Quantity](value, t.value.get.toSubRefNonUnion[Quantity])
  )
  def extractId(t: Iso21090_PQ_translation): Option[String]                   = t.id
  def extractUrl(t: Iso21090_PQ_translation): String                          = t.url
  def extractValue(t: Iso21090_PQ_translation): Quantity                      = t.value.get.toSubRefNonUnion[Quantity]
  override val thisName: String                                               = "Iso21090_PQ_translation"
  override val searchParams: Map[String, Iso21090_PQ_translation => Seq[Any]] = Extension.searchParams
  def unapply(o: Iso21090_PQ_translation): Option[(Option[String], String, Quantity)] = Some(
    (o.id, o.url, o.value.get.toSubRefNonUnion[Quantity]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Iso21090_PQ_translation] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Iso21090_PQ_translation(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[String]("url", None),
          cursor.decodeAs[Quantity]("valueQuantity", None),
          decodeAttributes(cursor)
        )
      ))
}

/** An alternative representation of the same physical quantity expressed in a different unit from a different unit code system and possibly with a different value.
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
class Iso21090_PQ_translation(
    override val id: Option[String] = None,
    override val url: String,
    value: Quantity,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(id = id, url = url, value = Some(choice(value)), primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
