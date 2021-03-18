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
import com.babylonhealth.lit.hl7.MESSAGEHEADER_RESPONSE_REQUEST
import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Messageheader_response_request extends CompanionFor[Messageheader_response_request] {
  override val baseType: CompanionFor[Extension] = Extension
  override val profileUrl: Option[String] = Some(
    "http://hl7.org/fhir/StructureDefinition/messageheader-response-request")
  def apply(
      id: Option[String] = None,
      url: String,
      value: MESSAGEHEADER_RESPONSE_REQUEST,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Messageheader_response_request = new Messageheader_response_request(
    id,
    url,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val url: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("url", lTagOf[String], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[MESSAGEHEADER_RESPONSE_REQUEST] =
    FHIRComponentFieldMeta(
      "value",
      lTagOf[MESSAGEHEADER_RESPONSE_REQUEST],
      true,
      lTagOf[MESSAGEHEADER_RESPONSE_REQUEST])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, url, value)
  override def fields(t: Messageheader_response_request): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[String](url, t.url),
    FHIRComponentField[MESSAGEHEADER_RESPONSE_REQUEST](
      value,
      t.value.get.toSubRefNonUnion[MESSAGEHEADER_RESPONSE_REQUEST])
  )
  def extractId(t: Messageheader_response_request): Option[String] = t.id
  def extractUrl(t: Messageheader_response_request): String        = t.url
  def extractValue(t: Messageheader_response_request): MESSAGEHEADER_RESPONSE_REQUEST =
    t.value.get.toSubRefNonUnion[MESSAGEHEADER_RESPONSE_REQUEST]
  override val thisName: String                                                      = "Messageheader_response_request"
  override val searchParams: Map[String, Messageheader_response_request => Seq[Any]] = Extension.searchParams
  def unapply(o: Messageheader_response_request): Option[(Option[String], String, MESSAGEHEADER_RESPONSE_REQUEST)] =
    Some((o.id, o.url, o.value.get.toSubRefNonUnion[MESSAGEHEADER_RESPONSE_REQUEST]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Messageheader_response_request] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Messageheader_response_request(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[String]("url", None),
          cursor.decodeAs[MESSAGEHEADER_RESPONSE_REQUEST]("valueCode", None),
          decodeAttributes(cursor)
        )
      ))
}

/** This extension enables the capability currently available through MSH-16 (Application Level acknowledgement) in HL7 Version 2 to declare at a message instance level whether a response is required or only upon error or success, or never.
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
class Messageheader_response_request(
    override val id: Option[String] = None,
    override val url: String,
    value: MESSAGEHEADER_RESPONSE_REQUEST,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(id = id, url = url, value = Some(choice(value)), primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
