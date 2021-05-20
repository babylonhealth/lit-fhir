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

<<<<<<< HEAD
object SampledData extends CompanionFor[SampledData] {
  implicit def summonObjectAndCompanionSampledData_992445521(o: SampledData): ObjectAndCompanion[SampledData, SampledData.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = SampledData
  override type ParentType   = SampledData
  override val baseType: CompanionFor[ResourceType] = SampledData
  override val parentType: CompanionFor[ParentType] = SampledData
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/SampledData")
  def apply(
=======
object SampledData extends CompanionFor[SampledData[_]] {
  override type ResourceType[T] = SampledData[T]
  override val baseType: CompanionFor[ResourceType[_]] = SampledData
  override val profileUrl: Option[String]              = Some("http://hl7.org/fhir/StructureDefinition/SampledData")
  def apply[Stage <: LifecycleStage: ValueOf](
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
      id: Option[String] = None,
      data: Option[String] = None,
      origin: Quantity[Stage],
      period: BigDecimal,
      factor: Option[BigDecimal] = None,
      extension: LitSeq[Extension[Stage]] = LitSeq.empty,
      lowerLimit: Option[BigDecimal] = None,
      upperLimit: Option[BigDecimal] = None,
      dimensions: PositiveInt,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): SampledData[Stage] = new SampledData[Stage](
    id,
    data,
    origin,
    period,
    factor,
    extension,
    lowerLimit,
    upperLimit,
    dimensions,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val data: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("data", lTagOf[Option[String]], false, lTagOf[String])
  def origin[Stage]: FHIRComponentFieldMeta[Quantity[Stage]] =
    FHIRComponentFieldMeta("origin", lTagOf[Quantity[Stage]], false, lTagOf[Quantity[Stage]])
  val period: FHIRComponentFieldMeta[BigDecimal] =
    FHIRComponentFieldMeta("period", lTagOf[BigDecimal], false, lTagOf[BigDecimal])
  val factor: FHIRComponentFieldMeta[Option[BigDecimal]] =
    FHIRComponentFieldMeta("factor", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
  def extension[Stage]: FHIRComponentFieldMeta[LitSeq[Extension[Stage]]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension[Stage]]], false, lTagOf[Extension[Stage]])
  val lowerLimit: FHIRComponentFieldMeta[Option[BigDecimal]] =
    FHIRComponentFieldMeta("lowerLimit", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
  val upperLimit: FHIRComponentFieldMeta[Option[BigDecimal]] =
    FHIRComponentFieldMeta("upperLimit", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
  val dimensions: FHIRComponentFieldMeta[PositiveInt] =
    FHIRComponentFieldMeta("dimensions", lTagOf[PositiveInt], false, lTagOf[PositiveInt])
  def fieldsMeta[Stage <: LifecycleStage: ValueOf]: Seq[FHIRComponentFieldMeta[_]] =
    Seq(id, data, origin, period, factor, extension, lowerLimit, upperLimit, dimensions)
  override def fieldsFromParent[Stage <: LifecycleStage: ValueOf](
      t: ResourceType[Stage]): Try[Seq[FHIRComponentField[Stage, _]]] = Success(fields[Stage](t))
  override def fields[Stage <: LifecycleStage: ValueOf](t: SampledData[Stage]): Seq[FHIRComponentField[Stage, _]] = Seq(
    FHIRComponentField[Stage, Option[String]](id, t.id),
    FHIRComponentField[Stage, Option[String]](data, t.data),
    FHIRComponentField[Stage, Quantity[Stage]](origin, t.origin),
    FHIRComponentField[Stage, BigDecimal](period, t.period),
    FHIRComponentField[Stage, Option[BigDecimal]](factor, t.factor),
    FHIRComponentField[Stage, LitSeq[Extension[Stage]]](extension, t.extension),
    FHIRComponentField[Stage, Option[BigDecimal]](lowerLimit, t.lowerLimit),
    FHIRComponentField[Stage, Option[BigDecimal]](upperLimit, t.upperLimit),
    FHIRComponentField[Stage, PositiveInt](dimensions, t.dimensions)
  )
  def extractId(t: SampledData[_]): Option[String]                             = t.id
  def extractData(t: SampledData[_]): Option[String]                           = t.data
  def extractOrigin[Stage](t: SampledData[Stage]): Quantity[Stage]             = t.origin
  def extractPeriod(t: SampledData[_]): BigDecimal                             = t.period
  def extractFactor(t: SampledData[_]): Option[BigDecimal]                     = t.factor
  def extractExtension[Stage](t: SampledData[Stage]): LitSeq[Extension[Stage]] = t.extension
  def extractLowerLimit(t: SampledData[_]): Option[BigDecimal]                 = t.lowerLimit
  def extractUpperLimit(t: SampledData[_]): Option[BigDecimal]                 = t.upperLimit
  def extractDimensions(t: SampledData[_]): PositiveInt                        = t.dimensions
  override val thisName: String                                                = "SampledData"
  def unapply[Stage <: LifecycleStage: ValueOf](o: SampledData[
    Stage]): Option[(Option[String], Option[String], Quantity[Stage], BigDecimal, Option[BigDecimal], LitSeq[Extension[Stage]], Option[BigDecimal], Option[BigDecimal], PositiveInt)] =
    Some((o.id, o.data, o.origin, o.period, o.factor, o.extension, o.lowerLimit, o.upperLimit, o.dimensions))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[SampledData[Completed.type]] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new SampledData(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[String]]("data", Some(None)),
          cursor.decodeAs[Quantity[Completed.type]]("origin", None),
          cursor.decodeAs[BigDecimal]("period", None),
          cursor.decodeAs[Option[BigDecimal]]("factor", Some(None)),
          cursor.decodeAs[LitSeq[Extension[Completed.type]]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[BigDecimal]]("lowerLimit", Some(None)),
          cursor.decodeAs[Option[BigDecimal]]("upperLimit", Some(None)),
          cursor.decodeAs[PositiveInt]("dimensions", None),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for SampledData Type: A series of measurements taken by a device, with upper and lower limits. There
  * may be more than one dimension in the data.
  *
  * Subclass of [[core.model.Element]] (Base StructureDefinition for Element Type: Base definition for all elements in a
  * resource.)
  *
  * @constructor
  *   Introduces the fields data, origin, period, factor, lowerLimit, upperLimit, dimensions.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *   spaces.
  * @param data
  *   - A series of data points which are decimal values separated by a single space (character u20). The special values "E"
  *   (error), "L" (below detection limit) and "U" (above detection limit) can also be used in place of a decimal value.
  * @param origin
  *   - The base quantity that a measured value of zero represents. In addition, this provides the units of the entire measurement
  *   series.
  * @param period
  *   - The length of time between sampling times, measured in milliseconds.
  * @param factor
  *   - A correction factor that is applied to the sampled data points before they are added to the origin.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the element. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param lowerLimit
  *   - The lower limit of detection of the measured points. This is needed if any of the data points have the value "L" (lower
  *   than detection limit).
  * @param upperLimit
  *   - The upper limit of detection of the measured points. This is needed if any of the data points have the value "U" (higher
  *   than detection limit).
  * @param dimensions
  *   - The number of sample points at each time point. If this value is greater than one, then the dimensions will be interlaced
  *   - all the sample points for a point in time will be recorded at once.
  */
@POJOBoilerplate
class SampledData[Stage <: LifecycleStage: ValueOf](
    override val id: Option[String] = None,
    val data: Option[String] = None,
    val origin: Quantity[Stage],
    val period: BigDecimal,
    val factor: Option[BigDecimal] = None,
    override val extension: LitSeq[Extension[Stage]] = LitSeq.empty,
    val lowerLimit: Option[BigDecimal] = None,
    val upperLimit: Option[BigDecimal] = None,
    val dimensions: PositiveInt,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Element[Stage](id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "SampledData"
}
