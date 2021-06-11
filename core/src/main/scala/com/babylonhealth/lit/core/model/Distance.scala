package com.babylonhealth.lit.core.model

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
import com.babylonhealth.lit.core.UnionAliases._
import com.babylonhealth.lit.core.QUANTITY_COMPARATOR
import com.babylonhealth.lit.{ core }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Distance extends CompanionFor[Distance] {
  override type ResourceType = Distance
  override type ParentType   = Distance
  override val baseType: CompanionFor[ResourceType] = Distance
  override val parentType: CompanionFor[ParentType] = Distance
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Distance")
  def apply(
      id: Option[String] = None,
      unit: Option[String] = None,
      code: Option[Code] = None,
      value: Option[BigDecimal] = None,
      system: Option[UriStr] = None,
      extension: LitSeq[Extension] = LitSeq.empty,
      comparator: Option[QUANTITY_COMPARATOR] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Distance = new Distance(
    id,
    unit,
    code,
    value,
    system,
    extension,
    comparator,
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
  val comparator: FHIRComponentFieldMeta[Option[QUANTITY_COMPARATOR]] =
    FHIRComponentFieldMeta("comparator", lTagOf[Option[QUANTITY_COMPARATOR]], false, lTagOf[QUANTITY_COMPARATOR])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, unit, code, value, system, extension, comparator)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Distance): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[String]](unit, t.unit),
    FHIRComponentField[Option[Code]](code, t.code),
    FHIRComponentField[Option[BigDecimal]](value, t.value),
    FHIRComponentField[Option[UriStr]](system, t.system),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[QUANTITY_COMPARATOR]](comparator, t.comparator)
  )
  def extractId(t: Distance): Option[String]                      = t.id
  def extractUnit(t: Distance): Option[String]                    = t.unit
  def extractCode(t: Distance): Option[Code]                      = t.code
  def extractValue(t: Distance): Option[BigDecimal]               = t.value
  def extractSystem(t: Distance): Option[UriStr]                  = t.system
  def extractExtension(t: Distance): LitSeq[Extension]            = t.extension
  def extractComparator(t: Distance): Option[QUANTITY_COMPARATOR] = t.comparator
  override val thisName: String                                   = "Distance"
  override val searchParams: Map[String, Distance => Seq[Any]]    = Quantity.searchParams
  def unapply(
      o: Distance): Option[(Option[String], Option[String], Option[Code], Option[BigDecimal], Option[UriStr], LitSeq[Extension], Option[QUANTITY_COMPARATOR])] =
    Some((o.id, o.unit, o.code, o.value, o.system, o.extension, o.comparator))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Distance] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Distance(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[String]]("unit", Some(None)),
          cursor.decodeAs[Option[Code]]("code", Some(None)),
          cursor.decodeAs[Option[BigDecimal]]("value", Some(None)),
          cursor.decodeAs[Option[UriStr]]("system", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[QUANTITY_COMPARATOR]]("comparator", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for Distance Type: A length - a value with a unit that is a physical distance.
  *
  *  Subclass of [[core.model.Quantity]] (Base StructureDefinition for Quantity Type: A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.)
  *
  * @constructor Inherits all params from parent.
  * @param id - Unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces.
  * @param unit - A human-readable form of the unit.
  * @param code - A computer processable form of the unit in some unit representation system.
  * @param value - The value of the measured amount. The value includes an implicit precision in the presentation of the value.
  * @param system - The identification of the system that provides the coded form of the unit.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the element. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param comparator - How the value should be understood and represented - whether the actual value is greater or less than the stated value due to measurement issues; e.g. if the comparator is "<" , then the real value is < stated value.
  */
@POJOBoilerplate
class Distance(
    override val id: Option[String] = None,
    override val unit: Option[String] = None,
    override val code: Option[Code] = None,
    override val value: Option[BigDecimal] = None,
    override val system: Option[UriStr] = None,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val comparator: Option[QUANTITY_COMPARATOR] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Quantity(
      id = id,
      unit = unit,
      code = code,
      value = value,
      system = system,
      extension = extension,
      comparator = comparator,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Distance"
}
