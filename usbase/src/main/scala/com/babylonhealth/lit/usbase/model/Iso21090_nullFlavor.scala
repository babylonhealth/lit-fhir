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
import com.babylonhealth.lit.usbase.V3_NULLFLAVOR
import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Iso21090_nullFlavor extends CompanionFor[Iso21090_nullFlavor] {
  override val baseType: CompanionFor[Extension] = Extension
  override val profileUrl: Option[String]        = Some("http://hl7.org/fhir/StructureDefinition/iso21090-nullFlavor")
  def apply(
      id: Option[String] = None,
      url: String,
      value: V3_NULLFLAVOR,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Iso21090_nullFlavor = new Iso21090_nullFlavor(
    id,
    url,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val url: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("url", lTagOf[String], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[V3_NULLFLAVOR] =
    FHIRComponentFieldMeta("value", lTagOf[V3_NULLFLAVOR], true, lTagOf[V3_NULLFLAVOR])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, url, value)
  override def fields(t: Iso21090_nullFlavor): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[String](url, t.url),
    FHIRComponentField[V3_NULLFLAVOR](value, t.value.get.toSubRefNonUnion[V3_NULLFLAVOR])
  )
  def extractId(t: Iso21090_nullFlavor): Option[String]                   = t.id
  def extractUrl(t: Iso21090_nullFlavor): String                          = t.url
  def extractValue(t: Iso21090_nullFlavor): V3_NULLFLAVOR                 = t.value.get.toSubRefNonUnion[V3_NULLFLAVOR]
  override val thisName: String                                           = "Iso21090_nullFlavor"
  override val searchParams: Map[String, Iso21090_nullFlavor => Seq[Any]] = Extension.searchParams
  def unapply(o: Iso21090_nullFlavor): Option[(Option[String], String, V3_NULLFLAVOR)] = Some(
    (o.id, o.url, o.value.get.toSubRefNonUnion[V3_NULLFLAVOR]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Iso21090_nullFlavor] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Iso21090_nullFlavor(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[String]("url", None),
          cursor.decodeAs[V3_NULLFLAVOR]("valueCode", None),
          decodeAttributes(cursor)
        )
      ))
}

/** If the value is not a proper value, indicates the reason.
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
class Iso21090_nullFlavor(
    override val id: Option[String] = None,
    override val url: String,
    value: V3_NULLFLAVOR,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(id = id, url = url, value = Some(choice(value)), primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
