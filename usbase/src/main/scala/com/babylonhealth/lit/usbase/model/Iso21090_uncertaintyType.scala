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
import com.babylonhealth.lit.usbase.PROBABILITY_DISTRIBUTION_TYPE
import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Iso21090_uncertaintyType extends CompanionFor[Iso21090_uncertaintyType] {
  implicit def summonObjectAndCompanionIso21090_uncertaintyType_29182253(
      o: Iso21090_uncertaintyType): ObjectAndCompanion[Iso21090_uncertaintyType, Iso21090_uncertaintyType.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/iso21090-uncertaintyType")
  def apply(
      id: Option[String] = None,
      value: PROBABILITY_DISTRIBUTION_TYPE,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Iso21090_uncertaintyType = new Iso21090_uncertaintyType(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[PROBABILITY_DISTRIBUTION_TYPE] =
    FHIRComponentFieldMeta("value", lTagOf[PROBABILITY_DISTRIBUTION_TYPE], true, lTagOf[PROBABILITY_DISTRIBUTION_TYPE])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[PROBABILITY_DISTRIBUTION_TYPE](
        value,
        PROBABILITY_DISTRIBUTION_TYPE.withName(t.value.get.toSubRefNonUnion[Code]))
    ))
  override def fields(t: Iso21090_uncertaintyType): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Iso21090_uncertaintyType): Option[String]                   = t.id
  def extractValue(t: Iso21090_uncertaintyType): PROBABILITY_DISTRIBUTION_TYPE =
    PROBABILITY_DISTRIBUTION_TYPE.withName(t.value.get.toSubRefNonUnion[Code])
  override val thisName: String                                                = "Iso21090_uncertaintyType"
  override val searchParams: Map[String, Iso21090_uncertaintyType => Seq[Any]] = Extension.searchParams
  def unapply(o: Iso21090_uncertaintyType): Option[(Option[String], PROBABILITY_DISTRIBUTION_TYPE)] = Some(
    (o.id, PROBABILITY_DISTRIBUTION_TYPE.withName(o.value.get.toSubRefNonUnion[Code])))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Iso21090_uncertaintyType] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Iso21090_uncertaintyType(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[PROBABILITY_DISTRIBUTION_TYPE]("valueCode", None),
          decodeAttributes(cursor)
        )
      ))
}

/** A code specifying the type of probability distribution for the uncertainty.
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
class Iso21090_uncertaintyType(
    override val id: Option[String] = None,
    value: PROBABILITY_DISTRIBUTION_TYPE,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choiceFromEnum(value)),
      url = "http://hl7.org/fhir/StructureDefinition/iso21090-uncertaintyType",
      primitiveAttributes = primitiveAttributes
    ) {
  override val thisTypeName: String = "Extension"
}
