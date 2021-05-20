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
object Range extends CompanionFor[Range] {
  implicit def summonObjectAndCompanionRange393636456(o: Range): ObjectAndCompanion[Range, Range.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Range
  override type ParentType   = Range
  override val baseType: CompanionFor[ResourceType] = Range
  override val parentType: CompanionFor[ParentType] = Range
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Range")
  def apply(
=======
object Range extends CompanionFor[Range[_]] {
  override type ResourceType[T] = Range[T]
  override val baseType: CompanionFor[ResourceType[_]] = Range
  override val profileUrl: Option[String]              = Some("http://hl7.org/fhir/StructureDefinition/Range")
  def apply[Stage <: LifecycleStage: ValueOf](
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
      id: Option[String] = None,
      low: Option[Quantity[Stage]] = None,
      high: Option[Quantity[Stage]] = None,
      extension: LitSeq[Extension[Stage]] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Range[Stage] = new Range[Stage](
    id,
    low,
    high,
    extension,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  def low[Stage]: FHIRComponentFieldMeta[Option[Quantity[Stage]]] =
    FHIRComponentFieldMeta("low", lTagOf[Option[Quantity[Stage]]], false, lTagOf[Quantity[Stage]])
  def high[Stage]: FHIRComponentFieldMeta[Option[Quantity[Stage]]] =
    FHIRComponentFieldMeta("high", lTagOf[Option[Quantity[Stage]]], false, lTagOf[Quantity[Stage]])
  def extension[Stage]: FHIRComponentFieldMeta[LitSeq[Extension[Stage]]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension[Stage]]], false, lTagOf[Extension[Stage]])
  def fieldsMeta[Stage <: LifecycleStage: ValueOf]: Seq[FHIRComponentFieldMeta[_]] = Seq(id, low, high, extension)
  override def fieldsFromParent[Stage <: LifecycleStage: ValueOf](
      t: ResourceType[Stage]): Try[Seq[FHIRComponentField[Stage, _]]] = Success(fields[Stage](t))
  override def fields[Stage <: LifecycleStage: ValueOf](t: Range[Stage]): Seq[FHIRComponentField[Stage, _]] = Seq(
    FHIRComponentField[Stage, Option[String]](id, t.id),
    FHIRComponentField[Stage, Option[Quantity[Stage]]](low, t.low),
    FHIRComponentField[Stage, Option[Quantity[Stage]]](high, t.high),
    FHIRComponentField[Stage, LitSeq[Extension[Stage]]](extension, t.extension)
  )
  def extractId(t: Range[_]): Option[String]                             = t.id
  def extractLow[Stage](t: Range[Stage]): Option[Quantity[Stage]]        = t.low
  def extractHigh[Stage](t: Range[Stage]): Option[Quantity[Stage]]       = t.high
  def extractExtension[Stage](t: Range[Stage]): LitSeq[Extension[Stage]] = t.extension
  override val thisName: String                                          = "Range"
  def unapply[Stage <: LifecycleStage: ValueOf](
      o: Range[
        Stage]): Option[(Option[String], Option[Quantity[Stage]], Option[Quantity[Stage]], LitSeq[Extension[Stage]])] =
    Some((o.id, o.low, o.high, o.extension))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Range[Completed.type]] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Range(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Quantity[Completed.type]]]("low", Some(None)),
          cursor.decodeAs[Option[Quantity[Completed.type]]]("high", Some(None)),
          cursor.decodeAs[LitSeq[Extension[Completed.type]]]("extension", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for Range Type: A set of ordered Quantities defined by a low and high limit.
  *
  * Subclass of [[core.model.Element]] (Base StructureDefinition for Element Type: Base definition for all elements in a
  * resource.)
  *
  * @constructor
  *   Introduces the fields low, high.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *   spaces.
  * @param low
  *   - The low limit. The boundary is inclusive.
  * @param high
  *   - The high limit. The boundary is inclusive.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the element. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  */
@POJOBoilerplate
class Range[Stage <: LifecycleStage: ValueOf](
    override val id: Option[String] = None,
    val low: Option[Quantity[Stage]] = None,
    val high: Option[Quantity[Stage]] = None,
    override val extension: LitSeq[Extension[Stage]] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Element[Stage](id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Range"
}
