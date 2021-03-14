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

object Capabilitystatement_prohibited extends CompanionFor[Capabilitystatement_prohibited] {
  override val baseType: CompanionFor[Extension] = Extension
  def apply(
      id: Option[String] = None,
      url: String,
      value: Boolean,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Capabilitystatement_prohibited = new Capabilitystatement_prohibited(
    id,
    url,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val url: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("url", lTagOf[String], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[Boolean] =
    FHIRComponentFieldMeta("value", lTagOf[Boolean], true, lTagOf[Boolean])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, url, value)
  override def fields(t: Capabilitystatement_prohibited): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[String](url, t.url),
    FHIRComponentField[Boolean](value, t.value.get.toSubRefNonUnion[Boolean])
  )
  def extractId(t: Capabilitystatement_prohibited): Option[String]                   = t.id
  def extractUrl(t: Capabilitystatement_prohibited): String                          = t.url
  def extractValue(t: Capabilitystatement_prohibited): Boolean                       = t.value.get.toSubRefNonUnion[Boolean]
  override val thisName: String                                                      = "Capabilitystatement_prohibited"
  override val searchParams: Map[String, Capabilitystatement_prohibited => Seq[Any]] = Extension.searchParams
  def unapply(o: Capabilitystatement_prohibited): Option[(Option[String], String, Boolean)] = Some(
    (o.id, o.url, o.value.get.toSubRefNonUnion[Boolean]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Capabilitystatement_prohibited] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Capabilitystatement_prohibited(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[String]("url", None),
          cursor.decodeAs[Boolean]("valueBoolean", None),
          decodeAttributes(cursor)
        )
      ))
}

/** If set to true, indicates that support for the specified behavior would make a system non-conformant with the specification.
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
class Capabilitystatement_prohibited(
    override val id: Option[String] = None,
    override val url: String,
    value: Boolean,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(id = id, url = url, value = Some(choice(value)), primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
