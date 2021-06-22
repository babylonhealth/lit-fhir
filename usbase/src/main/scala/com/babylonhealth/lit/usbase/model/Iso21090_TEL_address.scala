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

object Iso21090_TEL_address extends CompanionFor[Iso21090_TEL_address] {
  implicit def summonObjectAndCompanionIso21090_TEL_address_1652600132(
      o: Iso21090_TEL_address): ObjectAndCompanion[Iso21090_TEL_address, Iso21090_TEL_address.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/iso21090-TEL-address")
  def apply(
      id: Option[String] = None,
      value: UrlStr,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Iso21090_TEL_address = new Iso21090_TEL_address(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[UrlStr] =
    FHIRComponentFieldMeta("value", lTagOf[UrlStr], true, lTagOf[UrlStr])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[UrlStr](value, t.value.get.toSubRefNonUnion[UrlStr])
    ))
  override def fields(t: Iso21090_TEL_address): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Iso21090_TEL_address): Option[String]                   = t.id
  def extractValue(t: Iso21090_TEL_address): UrlStr                        = t.value.get.toSubRefNonUnion[UrlStr]
  override val thisName: String                                            = "Iso21090_TEL_address"
  override val searchParams: Map[String, Iso21090_TEL_address => Seq[Any]] = Extension.searchParams
  def unapply(o: Iso21090_TEL_address): Option[(Option[String], UrlStr)]   = Some((o.id, o.value.get.toSubRefNonUnion[UrlStr]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Iso21090_TEL_address] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Iso21090_TEL_address(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[UrlStr]("valueUrl", None),
          decodeAttributes(cursor)
        )
      ))
}

/** A V3 compliant, RFC 3966 conformant URI version of the telephone or fax number.
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
class Iso21090_TEL_address(
    override val id: Option[String] = None,
    value: UrlStr,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choice(value)),
      url = "http://hl7.org/fhir/StructureDefinition/iso21090-TEL-address",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
