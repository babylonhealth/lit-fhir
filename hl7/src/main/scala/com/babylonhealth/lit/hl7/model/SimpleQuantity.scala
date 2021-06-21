package com.babylonhealth.lit.hl7.model

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

import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object SimpleQuantity extends CompanionFor[SimpleQuantity] {
  implicit def summonObjectAndCompanionSimpleQuantity1620021347(
      o: SimpleQuantity): ObjectAndCompanion[SimpleQuantity, SimpleQuantity.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Quantity
  override type ParentType   = Quantity
  override val baseType: CompanionFor[ResourceType] = Quantity
  override val parentType: CompanionFor[ParentType] = Quantity
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/SimpleQuantity")
  def apply(
      id: Option[String] = None,
      unit: Option[String] = None,
      code: Option[Code] = None,
      value: Option[BigDecimal] = None,
      system: Option[UriStr] = None,
      extension: LitSeq[Extension] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): SimpleQuantity = new SimpleQuantity(
    id,
    unit,
    code,
    value,
    system,
    extension,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val unit: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("unit", lTagOf[Option[String]], false, lTagOf[String])
  val code: FHIRComponentFieldMeta[Option[Code]] =
    FHIRComponentFieldMeta("code", lTagOf[Option[Code]], false, lTagOf[Code])
  val value: FHIRComponentFieldMeta[Option[BigDecimal]] =
    FHIRComponentFieldMeta("value", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
  val system: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("system", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, unit, code, value, system, extension)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[String]](unit, t.unit),
      FHIRComponentField[Option[Code]](code, t.code),
      FHIRComponentField[Option[BigDecimal]](value, t.value),
      FHIRComponentField[Option[UriStr]](system, t.system),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension)
    ))
  override def fields(t: SimpleQuantity): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: SimpleQuantity): Option[String]                   = t.id
  def extractUnit(t: SimpleQuantity): Option[String]                 = t.unit
  def extractCode(t: SimpleQuantity): Option[Code]                   = t.code
  def extractValue(t: SimpleQuantity): Option[BigDecimal]            = t.value
  def extractSystem(t: SimpleQuantity): Option[UriStr]               = t.system
  def extractExtension(t: SimpleQuantity): LitSeq[Extension]         = t.extension
  override val thisName: String                                      = "SimpleQuantity"
  override val searchParams: Map[String, SimpleQuantity => Seq[Any]] = Quantity.searchParams
  def unapply(
      o: SimpleQuantity): Option[(Option[String], Option[String], Option[Code], Option[BigDecimal], Option[UriStr], LitSeq[Extension])] =
    Some((o.id, o.unit, o.code, o.value, o.system, o.extension))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[SimpleQuantity] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new SimpleQuantity(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[String]]("unit", Some(None)),
          cursor.decodeAs[Option[Code]]("code", Some(None)),
          cursor.decodeAs[Option[BigDecimal]]("value", Some(None)),
          cursor.decodeAs[Option[UriStr]]("system", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** A fixed quantity (no comparator)
  *
  * Subclass of [[core.model.Quantity]] (Base StructureDefinition for Quantity Type: A measured amount (or an amount
  * that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified,
  * including amounts involving arbitrary units and floating currencies.)
  *
  * @constructor
  *   Inherits all params from parent. Forbids the use of the following fields which were optional in the parent:
  *   comparator.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does
  *   not contain spaces.
  * @param unit
  *   - A human-readable form of the unit.
  * @param code
  *   - A computer processable form of the unit in some unit representation system.
  * @param value
  *   - The value of the measured amount. The value includes an implicit precision in the presentation of the value.
  * @param system
  *   - The identification of the system that provides the coded form of the unit.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the element. To make
  *   the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use
  *   of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as
  *   part of the definition of the extension.
  */
@POJOBoilerplate
class SimpleQuantity(
    override val id: Option[String] = None,
    override val unit: Option[String] = None,
    override val code: Option[Code] = None,
    override val value: Option[BigDecimal] = None,
    override val system: Option[UriStr] = None,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Quantity(
      id = id,
      unit = unit,
      code = code,
      value = value,
      system = system,
      extension = extension,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Quantity"
}
