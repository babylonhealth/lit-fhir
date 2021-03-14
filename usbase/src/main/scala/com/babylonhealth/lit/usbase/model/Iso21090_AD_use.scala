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
import com.babylonhealth.lit.core.ADDRESS_USE
import com.babylonhealth.lit.usbase.POSTAL_ADDRESS_USE
import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Iso21090_AD_use extends CompanionFor[Iso21090_AD_use] {
  override val baseType: CompanionFor[Extension] = Extension
  def apply(
      id: Option[String] = None,
      url: String,
      value: POSTAL_ADDRESS_USE,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Iso21090_AD_use = new Iso21090_AD_use(
    id,
    url,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val url: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("url", lTagOf[String], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[POSTAL_ADDRESS_USE] =
    FHIRComponentFieldMeta("value", lTagOf[POSTAL_ADDRESS_USE], true, lTagOf[POSTAL_ADDRESS_USE])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, url, value)
  override def fields(t: Iso21090_AD_use): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[String](url, t.url),
    FHIRComponentField[POSTAL_ADDRESS_USE](value, t.value.get.toSubRefNonUnion[POSTAL_ADDRESS_USE])
  )
  def extractId(t: Iso21090_AD_use): Option[String]                   = t.id
  def extractUrl(t: Iso21090_AD_use): String                          = t.url
  def extractValue(t: Iso21090_AD_use): POSTAL_ADDRESS_USE            = t.value.get.toSubRefNonUnion[POSTAL_ADDRESS_USE]
  override val thisName: String                                       = "Iso21090_AD_use"
  override val searchParams: Map[String, Iso21090_AD_use => Seq[Any]] = Extension.searchParams
  def unapply(o: Iso21090_AD_use): Option[(Option[String], String, POSTAL_ADDRESS_USE)] = Some(
    (o.id, o.url, o.value.get.toSubRefNonUnion[POSTAL_ADDRESS_USE]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Iso21090_AD_use] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Iso21090_AD_use(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[String]("url", None),
          cursor.decodeAs[POSTAL_ADDRESS_USE]("valueCode", None),
          decodeAttributes(cursor)
        )
      ))
}

/** Uses of Addresses - codes not defined as part of Address.use.
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
class Iso21090_AD_use(
    override val id: Option[String] = None,
    override val url: String,
    value: POSTAL_ADDRESS_USE,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(id = id, url = url, value = Some(choice(value)), primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}