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
import com.babylonhealth.lit.usbase.STANDARDS_STATUS
import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Structuredefinition_standards_status extends CompanionFor[Structuredefinition_standards_status] {
  override val baseType: CompanionFor[Extension] = Extension
  override val profileUrl: Option[String] = Some(
    "http://hl7.org/fhir/StructureDefinition/structuredefinition-standards-status")
  def apply(
      id: Option[String] = None,
      url: String,
      value: STANDARDS_STATUS,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Structuredefinition_standards_status = new Structuredefinition_standards_status(
    id,
    url,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val url: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("url", lTagOf[String], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[STANDARDS_STATUS] =
    FHIRComponentFieldMeta("value", lTagOf[STANDARDS_STATUS], true, lTagOf[STANDARDS_STATUS])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, url, value)
  override def fields(t: Structuredefinition_standards_status): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[String](url, t.url),
    FHIRComponentField[STANDARDS_STATUS](value, t.value.get.toSubRefNonUnion[STANDARDS_STATUS])
  )
  def extractId(t: Structuredefinition_standards_status): Option[String] = t.id
  def extractUrl(t: Structuredefinition_standards_status): String        = t.url
  def extractValue(t: Structuredefinition_standards_status): STANDARDS_STATUS =
    t.value.get.toSubRefNonUnion[STANDARDS_STATUS]
  override val thisName: String                                                            = "Structuredefinition_standards_status"
  override val searchParams: Map[String, Structuredefinition_standards_status => Seq[Any]] = Extension.searchParams
  def unapply(o: Structuredefinition_standards_status): Option[(Option[String], String, STANDARDS_STATUS)] = Some(
    (o.id, o.url, o.value.get.toSubRefNonUnion[STANDARDS_STATUS]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Structuredefinition_standards_status] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Structuredefinition_standards_status(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[String]("url", None),
          cursor.decodeAs[STANDARDS_STATUS]("valueCode", None),
          decodeAttributes(cursor)
        )
      ))
}

/** The Current HL7 ballot/Standards status of this artifact.
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
class Structuredefinition_standards_status(
    override val id: Option[String] = None,
    override val url: String,
    value: STANDARDS_STATUS,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(id = id, url = url, value = Some(choice(value)), primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
