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
import com.babylonhealth.lit.usbase.NAME_PART_QUALIFIER
import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Iso21090_EN_qualifier extends CompanionFor[Iso21090_EN_qualifier] {
  override val baseType: CompanionFor[Extension] = Extension
  override val profileUrl: Option[String]        = Some("http://hl7.org/fhir/StructureDefinition/iso21090-EN-qualifier")
  def apply(
      id: Option[String] = None,
      value: NAME_PART_QUALIFIER,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Iso21090_EN_qualifier = new Iso21090_EN_qualifier(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[NAME_PART_QUALIFIER] =
    FHIRComponentFieldMeta("value", lTagOf[NAME_PART_QUALIFIER], true, lTagOf[NAME_PART_QUALIFIER])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fields(t: Iso21090_EN_qualifier): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[NAME_PART_QUALIFIER](value, NAME_PART_QUALIFIER.withName(t.value.get.toSubRefNonUnion[Code]))
  )
  def extractId(t: Iso21090_EN_qualifier): Option[String] = t.id
  def extractValue(t: Iso21090_EN_qualifier): NAME_PART_QUALIFIER =
    NAME_PART_QUALIFIER.withName(t.value.get.toSubRefNonUnion[Code])
  override val thisName: String                                             = "Iso21090_EN_qualifier"
  override val searchParams: Map[String, Iso21090_EN_qualifier => Seq[Any]] = Extension.searchParams
  def unapply(o: Iso21090_EN_qualifier): Option[(Option[String], NAME_PART_QUALIFIER)] = Some(
    (o.id, NAME_PART_QUALIFIER.withName(o.value.get.toSubRefNonUnion[Code])))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Iso21090_EN_qualifier] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Iso21090_EN_qualifier(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[NAME_PART_QUALIFIER]("valueCode", None),
          decodeAttributes(cursor)
        )
      ))
}

/** A set of codes each of which specifies a certain subcategory of the name part in addition to the main name part type.
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
class Iso21090_EN_qualifier(
    override val id: Option[String] = None,
    value: NAME_PART_QUALIFIER,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choice(value)),
      url = "http://hl7.org/fhir/StructureDefinition/iso21090-EN-qualifier",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
