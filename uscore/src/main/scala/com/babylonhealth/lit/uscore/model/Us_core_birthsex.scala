package com.babylonhealth.lit.uscore.model

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
import com.babylonhealth.lit.usbase.model._
import com.babylonhealth.lit.core.UnionAliases._
import com.babylonhealth.lit.hl7.UnionAliases._
import com.babylonhealth.lit.usbase.UnionAliases._

import com.babylonhealth.lit.{ core, hl7, usbase, uscore }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Us_core_birthsex extends CompanionFor[Us_core_birthsex] {
  override val baseType: CompanionFor[Extension] = Extension
  override val profileUrl: Option[String]        = Some("http://hl7.org/fhir/us/core/StructureDefinition/us-core-birthsex")
  def apply(
      id: Option[String] = None,
      url: String,
      value: Option[Code] = None,
      extension: LitSeq[Extension] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Us_core_birthsex = new Us_core_birthsex(
    id,
    url,
    value,
    extension,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val url: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("url", lTagOf[String], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[Option[Code]] =
    FHIRComponentFieldMeta("value", lTagOf[Option[Code]], true, lTagOf[Code])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, url, value, extension)
  override def fields(t: Us_core_birthsex): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[String](url, t.url),
    FHIRComponentField[Option[Code]](value, t.value.map(_.toSubRefNonUnion[Code])),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension)
  )
  def extractId(t: Us_core_birthsex): Option[String]                   = t.id
  def extractUrl(t: Us_core_birthsex): String                          = t.url
  def extractValue(t: Us_core_birthsex): Option[Code]                  = t.value.map(_.toSubRefNonUnion[Code])
  def extractExtension(t: Us_core_birthsex): LitSeq[Extension]         = t.extension
  override val thisName: String                                        = "Us_core_birthsex"
  override val searchParams: Map[String, Us_core_birthsex => Seq[Any]] = Extension.searchParams
  def unapply(o: Us_core_birthsex): Option[(Option[String], String, Option[Code], LitSeq[Extension])] = Some(
    (o.id, o.url, o.value.map(_.toSubRefNonUnion[Code]), o.extension))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Us_core_birthsex] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Us_core_birthsex(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[String]("url", None),
          cursor.decodeAs[Option[Code]]("valueCode", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** A code classifying the person's sex assigned at birth  as specified by the [Office of the National Coordinator for Health IT (ONC)](https://www.healthit.gov/newsroom/about-onc). This extension aligns with the C-CDA Birth Sex Observation (LOINC 76689-9).
  *
  *  Subclass of [[core.model.Extension]] (Base StructureDefinition for Extension Type: Optional Extension Element - found in all resources.)
  *
  * @constructor Inherits all params from parent.
  *              Refines the types of: value.
  * @param id - Unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces.
  * @param url - Source of the definition for the extension code - a logical name or a URL.
  * @param value - Value of extension - must be one of a constrained set of the data types (see [Extensibility](http://hl7.org/fhir/R4/extensibility.html) for a list).
  * @param extension - May be used to represent additional information that is not part of the basic definition of the element. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  */
@POJOBoilerplate
class Us_core_birthsex(
    override val id: Option[String] = None,
    override val url: String,
    value: Option[Code] = None,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      url = url,
      value = value.map(choice(_)),
      extension = extension,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
