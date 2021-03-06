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

import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Communication_media extends CompanionFor[Communication_media] {
  implicit def summonObjectAndCompanionCommunication_media170007864(
      o: Communication_media): ObjectAndCompanion[Communication_media, Communication_media.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/communication-media")
  def apply(
      id: Option[String] = None,
      value: Attachment,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Communication_media = new Communication_media(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[Attachment] =
    FHIRComponentFieldMeta("value", lTagOf[Attachment], true, lTagOf[Attachment])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Attachment](value, t.value.get.toSubRefNonUnion[Attachment])
    ))
  override def fields(t: Communication_media): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Communication_media): Option[String]                   = t.id
  def extractValue(t: Communication_media): Attachment                    = t.value.get.toSubRefNonUnion[Attachment]
  override val thisName: String                                           = "Communication_media"
  override val searchParams: Map[String, Communication_media => Seq[Any]] = Extension.searchParams
  def unapply(o: Communication_media): Option[(Option[String], Attachment)] = Some(
    (o.id, o.value.get.toSubRefNonUnion[Attachment]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Communication_media] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Communication_media(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Attachment]("valueAttachment", None),
          decodeAttributes(cursor)
        )
      ))
}

/** It contains enriched media representation of the alert message, such as a voice recording. This may be used, for example for
  * compliance with jurisdictional accessibility requirements, literacy issues, or translations of the unstructured text content
  * in other languages.
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
  *     spaces.
  * @param url
  *   - Source of the definition for the extension code - a logical name or a URL.
  * @param value
  *   - Value of extension - must be one of a constrained set of the data types (see
  *     [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
  */
@POJOBoilerplate
class Communication_media(
    override val id: Option[String] = None,
    value: Attachment,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choice(value)),
      url = "http://hl7.org/fhir/StructureDefinition/communication-media",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
