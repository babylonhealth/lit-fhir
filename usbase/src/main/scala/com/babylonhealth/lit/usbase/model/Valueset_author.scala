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

object Valueset_author extends CompanionFor[Valueset_author] {
  override val baseType: CompanionFor[Extension] = Extension
  override val profileUrl: Option[String]        = Some("http://hl7.org/fhir/StructureDefinition/valueset-author")
  def apply(
      id: Option[String] = None,
      value: ContactDetail,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Valueset_author = new Valueset_author(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[ContactDetail] =
    FHIRComponentFieldMeta("value", lTagOf[ContactDetail], true, lTagOf[ContactDetail])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fields(t: Valueset_author): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[ContactDetail](value, t.value.get.toSubRefNonUnion[ContactDetail])
  )
  def extractId(t: Valueset_author): Option[String]                   = t.id
  def extractValue(t: Valueset_author): ContactDetail                 = t.value.get.toSubRefNonUnion[ContactDetail]
  override val thisName: String                                       = "Valueset_author"
  override val searchParams: Map[String, Valueset_author => Seq[Any]] = Extension.searchParams
  def unapply(o: Valueset_author): Option[(Option[String], ContactDetail)] = Some(
    (o.id, o.value.get.toSubRefNonUnion[ContactDetail]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Valueset_author] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Valueset_author(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[ContactDetail]("valueContactDetail", None),
          decodeAttributes(cursor)
        )
      ))
}

/** The entity or set of entities that create and may modify the Value Set Definition content. The name of a group or an individual, along with contact details.
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
class Valueset_author(
    override val id: Option[String] = None,
    value: ContactDetail,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choice(value)),
      url = "http://hl7.org/fhir/StructureDefinition/valueset-author",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
