package com.babylonhealth.lit.usbase.model

import java.time.{ LocalDate, LocalTime, ZonedDateTime }
import java.util.UUID

import scala.collection.immutable.TreeMap
import scala.util.{ Success, Try }

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
  implicit def summonObjectAndCompanionMessageheader_response_request_1270989617(
      o: Messageheader_response_request): ObjectAndCompanion[Messageheader_response_request, Messageheader_response_request.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String] = Some("http://hl7.org/fhir/StructureDefinition/messageheader-response-request")
  def apply(
      id: Option[String] = None,
      value: MESSAGEHEADER_RESPONSE_REQUEST,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Messageheader_response_request = new Messageheader_response_request(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[MESSAGEHEADER_RESPONSE_REQUEST] =
    FHIRComponentFieldMeta("value", lTagOf[MESSAGEHEADER_RESPONSE_REQUEST], true, lTagOf[MESSAGEHEADER_RESPONSE_REQUEST])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[MESSAGEHEADER_RESPONSE_REQUEST](
        value,
        MESSAGEHEADER_RESPONSE_REQUEST.withName(t.value.get.toSubRefNonUnion[Code]))
    ))
  override def fields(t: Messageheader_response_request): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Messageheader_response_request): Option[String]                   = t.id
  def extractValue(t: Messageheader_response_request): MESSAGEHEADER_RESPONSE_REQUEST =
    MESSAGEHEADER_RESPONSE_REQUEST.withName(t.value.get.toSubRefNonUnion[Code])
  override val thisName: String                                                      = "Messageheader_response_request"
  override val searchParams: Map[String, Messageheader_response_request => Seq[Any]] = Extension.searchParams
  def unapply(o: Messageheader_response_request): Option[(Option[String], MESSAGEHEADER_RESPONSE_REQUEST)] = Some(
    (o.id, MESSAGEHEADER_RESPONSE_REQUEST.withName(o.value.get.toSubRefNonUnion[Code])))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Messageheader_response_request] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Messageheader_response_request(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[MESSAGEHEADER_RESPONSE_REQUEST]("valueCode", None),
          decodeAttributes(cursor)
        )
      ))
}

/** This extension enables the capability currently available through MSH-16 (Application Level acknowledgement) in HL7 Version 2
  * to declare at a message instance level whether a response is required or only upon error or success, or never.
  *
  * Subclass of [[core.model.Extension]] (Base StructureDefinition for Extension Type: Optional Extension Element - found in all
  * resources.)
  *
  * @constructor
  *   Inherits all params from parent. Refines the types of: value. Requires the following fields which were optional in the
  *   parent: value. Forbids the use of the following fields which were optional in the parent: extension. Hardcodes the value of
  *   the following fields: url.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *   spaces.
  * @param url
  *   - Source of the definition for the extension code - a logical name or a URL.
  * @param value
  *   - Value of extension - must be one of a constrained set of the data types (see
  *   [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
  */
@POJOBoilerplate
class Messageheader_response_request(
    override val id: Option[String] = None,
    value: MESSAGEHEADER_RESPONSE_REQUEST,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choiceFromEnum(value)),
      url = "http://hl7.org/fhir/StructureDefinition/messageheader-response-request",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
