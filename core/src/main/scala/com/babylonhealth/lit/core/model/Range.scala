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

import com.babylonhealth.lit.{ core }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Range extends CompanionFor[Range] {
  override type ResourceType = Range
  override type ParentType   = Range
  override val baseType: CompanionFor[ResourceType] = Range
  override val parentType: CompanionFor[ParentType] = Range
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Range")
  def apply(
      id: Option[String] = None,
      low: Option[Quantity] = None,
      high: Option[Quantity] = None,
      extension: LitSeq[Extension] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Range = new Range(
    id,
    low,
    high,
    extension,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val low: FHIRComponentFieldMeta[Option[Quantity]] =
    FHIRComponentFieldMeta("low", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
  val high: FHIRComponentFieldMeta[Option[Quantity]] =
    FHIRComponentFieldMeta("high", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, low, high, extension)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Range): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Quantity]](low, t.low),
    FHIRComponentField[Option[Quantity]](high, t.high),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension)
  )
  def extractId(t: Range): Option[String]           = t.id
  def extractLow(t: Range): Option[Quantity]        = t.low
  def extractHigh(t: Range): Option[Quantity]       = t.high
  def extractExtension(t: Range): LitSeq[Extension] = t.extension
  override val thisName: String                     = "Range"
  def unapply(o: Range): Option[(Option[String], Option[Quantity], Option[Quantity], LitSeq[Extension])] = Some(
    (o.id, o.low, o.high, o.extension))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Range] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Range(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Quantity]]("low", Some(None)),
          cursor.decodeAs[Option[Quantity]]("high", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for Range Type: A set of ordered Quantities defined by a low and high limit.
  *
  *  Subclass of [[core.model.Element]] (Base StructureDefinition for Element Type: Base definition for all elements in a resource.)
  *
  * @constructor Introduces the fields low, high.
  * @param id - Unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces.
  * @param low - The low limit. The boundary is inclusive.
  * @param high - The high limit. The boundary is inclusive.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the element. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  */
@POJOBoilerplate
class Range(
    override val id: Option[String] = None,
    val low: Option[Quantity] = None,
    val high: Option[Quantity] = None,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Element(id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Range"
}
