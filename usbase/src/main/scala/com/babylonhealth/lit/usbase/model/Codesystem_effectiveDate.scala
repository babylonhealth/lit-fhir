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

object Codesystem_effectiveDate extends CompanionFor[Codesystem_effectiveDate] {
  override val baseType: CompanionFor[Extension] = Extension
  override val profileUrl: Option[String]        = Some("http://hl7.org/fhir/StructureDefinition/codesystem-effectiveDate")
  def apply(
      id: Option[String] = None,
      url: String,
      value: FHIRDate,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Codesystem_effectiveDate = new Codesystem_effectiveDate(
    id,
    url,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val url: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("url", lTagOf[String], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[FHIRDate] =
    FHIRComponentFieldMeta("value", lTagOf[FHIRDate], true, lTagOf[FHIRDate])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, url, value)
  override def fields(t: Codesystem_effectiveDate): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[String](url, t.url),
    FHIRComponentField[FHIRDate](value, t.value.get.toSubRefNonUnion[FHIRDate])
  )
  def extractId(t: Codesystem_effectiveDate): Option[String]                   = t.id
  def extractUrl(t: Codesystem_effectiveDate): String                          = t.url
  def extractValue(t: Codesystem_effectiveDate): FHIRDate                      = t.value.get.toSubRefNonUnion[FHIRDate]
  override val thisName: String                                                = "Codesystem_effectiveDate"
  override val searchParams: Map[String, Codesystem_effectiveDate => Seq[Any]] = Extension.searchParams
  def unapply(o: Codesystem_effectiveDate): Option[(Option[String], String, FHIRDate)] = Some(
    (o.id, o.url, o.value.get.toSubRefNonUnion[FHIRDate]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Codesystem_effectiveDate] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Codesystem_effectiveDate(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[String]("url", None),
          cursor.decodeAs[FHIRDate]("valueDate", None),
          decodeAttributes(cursor)
        )
      ))
}

/** This is the first date-time when the value set version becomes active, so this value is present on Inactive value set versions as well. The start Date_time is expected to be as of 0001 UTC of the Effective Date.
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
class Codesystem_effectiveDate(
    override val id: Option[String] = None,
    override val url: String,
    value: FHIRDate,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(id = id, url = url, value = Some(choice(value)), primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
