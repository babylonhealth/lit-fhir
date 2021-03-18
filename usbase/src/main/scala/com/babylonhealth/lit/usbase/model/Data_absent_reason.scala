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
import com.babylonhealth.lit.usbase.DATA_ABSENT_REASON
import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Data_absent_reason extends CompanionFor[Data_absent_reason] {
  override val baseType: CompanionFor[Extension] = Extension
  override val profileUrl: Option[String]        = Some("http://hl7.org/fhir/StructureDefinition/data-absent-reason")
  def apply(
      id: Option[String] = None,
      url: String,
      value: DATA_ABSENT_REASON,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Data_absent_reason = new Data_absent_reason(
    id,
    url,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val url: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("url", lTagOf[String], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[DATA_ABSENT_REASON] =
    FHIRComponentFieldMeta("value", lTagOf[DATA_ABSENT_REASON], true, lTagOf[DATA_ABSENT_REASON])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, url, value)
  override def fields(t: Data_absent_reason): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[String](url, t.url),
    FHIRComponentField[DATA_ABSENT_REASON](value, t.value.get.toSubRefNonUnion[DATA_ABSENT_REASON])
  )
  def extractId(t: Data_absent_reason): Option[String]                   = t.id
  def extractUrl(t: Data_absent_reason): String                          = t.url
  def extractValue(t: Data_absent_reason): DATA_ABSENT_REASON            = t.value.get.toSubRefNonUnion[DATA_ABSENT_REASON]
  override val thisName: String                                          = "Data_absent_reason"
  override val searchParams: Map[String, Data_absent_reason => Seq[Any]] = Extension.searchParams
  def unapply(o: Data_absent_reason): Option[(Option[String], String, DATA_ABSENT_REASON)] = Some(
    (o.id, o.url, o.value.get.toSubRefNonUnion[DATA_ABSENT_REASON]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Data_absent_reason] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Data_absent_reason(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[String]("url", None),
          cursor.decodeAs[DATA_ABSENT_REASON]("valueCode", None),
          decodeAttributes(cursor)
        )
      ))
}

/** Provides a reason why the expected value or elements in the element that is extended are missing.
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
class Data_absent_reason(
    override val id: Option[String] = None,
    override val url: String,
    value: DATA_ABSENT_REASON,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(id = id, url = url, value = Some(choice(value)), primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
