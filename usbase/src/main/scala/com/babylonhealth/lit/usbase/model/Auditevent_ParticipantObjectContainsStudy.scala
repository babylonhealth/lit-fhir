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

object Auditevent_ParticipantObjectContainsStudy extends CompanionFor[Auditevent_ParticipantObjectContainsStudy] {
  override val baseType: CompanionFor[Extension] = Extension
  def apply(
      id: Option[String] = None,
      url: String,
      value: Identifier,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Auditevent_ParticipantObjectContainsStudy = new Auditevent_ParticipantObjectContainsStudy(
    id,
    url,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val url: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("url", lTagOf[String], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[Identifier] =
    FHIRComponentFieldMeta("value", lTagOf[Identifier], true, lTagOf[Identifier])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, url, value)
  override def fields(t: Auditevent_ParticipantObjectContainsStudy): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[String](url, t.url),
    FHIRComponentField[Identifier](value, t.value.get.toSubRefNonUnion[Identifier])
  )
  def extractId(t: Auditevent_ParticipantObjectContainsStudy): Option[String]                   = t.id
  def extractUrl(t: Auditevent_ParticipantObjectContainsStudy): String                          = t.url
  def extractValue(t: Auditevent_ParticipantObjectContainsStudy): Identifier                    = t.value.get.toSubRefNonUnion[Identifier]
  override val thisName: String                                                                 = "Auditevent_ParticipantObjectContainsStudy"
  override val searchParams: Map[String, Auditevent_ParticipantObjectContainsStudy => Seq[Any]] = Extension.searchParams
  def unapply(o: Auditevent_ParticipantObjectContainsStudy): Option[(Option[String], String, Identifier)] = Some(
    (o.id, o.url, o.value.get.toSubRefNonUnion[Identifier]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Auditevent_ParticipantObjectContainsStudy] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Auditevent_ParticipantObjectContainsStudy(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[String]("url", None),
          cursor.decodeAs[Identifier]("valueIdentifier", None),
          decodeAttributes(cursor)
        )
      ))
}

/** A Study Instance ID, which may be used when the Entity type is not (110180, DCM, "Study Instance UID").
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
class Auditevent_ParticipantObjectContainsStudy(
    override val id: Option[String] = None,
    override val url: String,
    value: Identifier,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(id = id, url = url, value = Some(choice(value)), primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
