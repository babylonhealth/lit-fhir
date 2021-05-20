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
object Ratio extends CompanionFor[Ratio] {
  implicit def summonObjectAndCompanionRatio393642294(o: Ratio): ObjectAndCompanion[Ratio, Ratio.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Ratio
  override type ParentType   = Ratio
  override val baseType: CompanionFor[ResourceType] = Ratio
  override val parentType: CompanionFor[ParentType] = Ratio
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Ratio")
  def apply(
=======
object Ratio extends CompanionFor[Ratio[_]] {
  override type ResourceType[T] = Ratio[T]
  override val baseType: CompanionFor[ResourceType[_]] = Ratio
  override val profileUrl: Option[String]              = Some("http://hl7.org/fhir/StructureDefinition/Ratio")
  def apply[Stage <: LifecycleStage: ValueOf](
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
      id: Option[String] = None,
      extension: LitSeq[Extension[Stage]] = LitSeq.empty,
      numerator: Option[Quantity[Stage]] = None,
      denominator: Option[Quantity[Stage]] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Ratio[Stage] = new Ratio[Stage](
    id,
    extension,
    numerator,
    denominator,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  def extension[Stage]: FHIRComponentFieldMeta[LitSeq[Extension[Stage]]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension[Stage]]], false, lTagOf[Extension[Stage]])
  def numerator[Stage]: FHIRComponentFieldMeta[Option[Quantity[Stage]]] =
    FHIRComponentFieldMeta("numerator", lTagOf[Option[Quantity[Stage]]], false, lTagOf[Quantity[Stage]])
  def denominator[Stage]: FHIRComponentFieldMeta[Option[Quantity[Stage]]] =
    FHIRComponentFieldMeta("denominator", lTagOf[Option[Quantity[Stage]]], false, lTagOf[Quantity[Stage]])
  def fieldsMeta[Stage <: LifecycleStage: ValueOf]: Seq[FHIRComponentFieldMeta[_]] =
    Seq(id, extension, numerator, denominator)
  override def fieldsFromParent[Stage <: LifecycleStage: ValueOf](
      t: ResourceType[Stage]): Try[Seq[FHIRComponentField[Stage, _]]] = Success(fields[Stage](t))
  override def fields[Stage <: LifecycleStage: ValueOf](t: Ratio[Stage]): Seq[FHIRComponentField[Stage, _]] = Seq(
    FHIRComponentField[Stage, Option[String]](id, t.id),
    FHIRComponentField[Stage, LitSeq[Extension[Stage]]](extension, t.extension),
    FHIRComponentField[Stage, Option[Quantity[Stage]]](numerator, t.numerator),
    FHIRComponentField[Stage, Option[Quantity[Stage]]](denominator, t.denominator)
  )
  def extractId(t: Ratio[_]): Option[String]                              = t.id
  def extractExtension[Stage](t: Ratio[Stage]): LitSeq[Extension[Stage]]  = t.extension
  def extractNumerator[Stage](t: Ratio[Stage]): Option[Quantity[Stage]]   = t.numerator
  def extractDenominator[Stage](t: Ratio[Stage]): Option[Quantity[Stage]] = t.denominator
  override val thisName: String                                           = "Ratio"
  def unapply[Stage <: LifecycleStage: ValueOf](
      o: Ratio[
        Stage]): Option[(Option[String], LitSeq[Extension[Stage]], Option[Quantity[Stage]], Option[Quantity[Stage]])] =
    Some((o.id, o.extension, o.numerator, o.denominator))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Ratio[Completed.type]] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Ratio(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[LitSeq[Extension[Completed.type]]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Quantity[Completed.type]]]("numerator", Some(None)),
          cursor.decodeAs[Option[Quantity[Completed.type]]]("denominator", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for Ratio Type: A relationship of two Quantity values - expressed as a numerator and a denominator.
  *
  * Subclass of [[core.model.Element]] (Base StructureDefinition for Element Type: Base definition for all elements in a
  * resource.)
  *
  * @constructor
  *   Introduces the fields numerator, denominator.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *   spaces.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the element. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param numerator
  *   - The value of the numerator.
  * @param denominator
  *   - The value of the denominator.
  */
@POJOBoilerplate
class Ratio[Stage <: LifecycleStage: ValueOf](
    override val id: Option[String] = None,
    override val extension: LitSeq[Extension[Stage]] = LitSeq.empty,
    val numerator: Option[Quantity[Stage]] = None,
    val denominator: Option[Quantity[Stage]] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Element[Stage](id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Ratio"
}
