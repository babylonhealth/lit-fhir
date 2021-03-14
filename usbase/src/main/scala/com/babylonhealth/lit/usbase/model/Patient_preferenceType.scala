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

object Patient_preferenceType extends CompanionFor[Patient_preferenceType] {
  override val baseType: CompanionFor[Extension] = Extension
  def apply(
      id: Option[String] = None,
      url: String,
      value: Coding,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Patient_preferenceType = new Patient_preferenceType(
    id,
    url,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val url: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("url", lTagOf[String], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[Coding] =
    FHIRComponentFieldMeta("value", lTagOf[Coding], true, lTagOf[Coding])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, url, value)
  override def fields(t: Patient_preferenceType): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[String](url, t.url),
    FHIRComponentField[Coding](value, t.value.get.toSubRefNonUnion[Coding])
  )
  def extractId(t: Patient_preferenceType): Option[String]                   = t.id
  def extractUrl(t: Patient_preferenceType): String                          = t.url
  def extractValue(t: Patient_preferenceType): Coding                        = t.value.get.toSubRefNonUnion[Coding]
  override val thisName: String                                              = "Patient_preferenceType"
  override val searchParams: Map[String, Patient_preferenceType => Seq[Any]] = Extension.searchParams
  def unapply(o: Patient_preferenceType): Option[(Option[String], String, Coding)] = Some(
    (o.id, o.url, o.value.get.toSubRefNonUnion[Coding]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Patient_preferenceType] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Patient_preferenceType(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[String]("url", None),
          cursor.decodeAs[Coding]("valueCoding", None),
          decodeAttributes(cursor)
        )
      ))
}

/** Indicates what mode of communication the patient prefers to use for the indicated language.
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
class Patient_preferenceType(
    override val id: Option[String] = None,
    override val url: String,
    value: Coding,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(id = id, url = url, value = Some(choice(value)), primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}