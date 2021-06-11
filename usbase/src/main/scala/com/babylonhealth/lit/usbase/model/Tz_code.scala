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

object Tz_code extends CompanionFor[Tz_code] {
  implicit def summonObjectAndCompanionTz_code1510003934(o: Tz_code): ObjectAndCompanion[Tz_code, Tz_code.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/tz-code")
  def apply(
      id: Option[String] = None,
      value: Code,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Tz_code = new Tz_code(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[Code] =
    FHIRComponentFieldMeta("value", lTagOf[Code], true, lTagOf[Code])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Code](value, t.value.get.toSubRefNonUnion[Code])
    ))
  override def fields(t: Tz_code): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Tz_code): Option[String]                   = t.id
  def extractValue(t: Tz_code): Code                          = t.value.get.toSubRefNonUnion[Code]
  override val thisName: String                               = "Tz_code"
  override val searchParams: Map[String, Tz_code => Seq[Any]] = Extension.searchParams
  def unapply(o: Tz_code): Option[(Option[String], Code)]     = Some((o.id, o.value.get.toSubRefNonUnion[Code]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Tz_code] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Tz_code(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Code]("valueCode", None),
          decodeAttributes(cursor)
        )
      ))
}

/** An IANA timezone code for  the timezone offset per [BCP 175](https://www.iana.org/go/rfc6557). The offset is specified as part of a dateTime/instant (or using the tzOffset extension on a date if necessary). The timezone code may also be provided to allow for human display of the location associated with the offset.
  *
  *  Subclass of [[core.model.Extension]] (Base StructureDefinition for Extension Type: Optional Extension Element - found in all resources.)
  *
  * @constructor Inherits all params from parent.
  *              Refines the types of: value.
  *              Requires the following fields which were optional in the parent: value.
  *              Forbids the use of the following fields which were optional in the parent: extension.
  *              Hardcodes the value of the following fields: url.
  * @param id - Unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces.
  * @param url - Source of the definition for the extension code - a logical name or a URL.
  * @param value - Value of extension - must be one of a constrained set of the data types (see [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
  */
@POJOBoilerplate
class Tz_code(
    override val id: Option[String] = None,
    value: Code,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choice(value)),
      url = "http://hl7.org/fhir/StructureDefinition/tz-code",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
