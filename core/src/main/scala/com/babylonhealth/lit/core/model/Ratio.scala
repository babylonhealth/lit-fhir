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

object Ratio extends CompanionFor[Ratio] {
  implicit def summonObjectAndCompanionRatio393642294(o: Ratio): ObjectAndCompanion[Ratio, Ratio.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Ratio
  override type ParentType   = Ratio
  override val baseType: CompanionFor[ResourceType] = Ratio
  override val parentType: CompanionFor[ParentType] = Ratio
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Ratio")
  def apply(
      id: Option[String] = None,
      extension: LitSeq[Extension] = LitSeq.empty,
      numerator: Option[Quantity] = None,
      denominator: Option[Quantity] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Ratio = new Ratio(
    id,
    extension,
    numerator,
    denominator,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val numerator: FHIRComponentFieldMeta[Option[Quantity]] =
    FHIRComponentFieldMeta("numerator", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
  val denominator: FHIRComponentFieldMeta[Option[Quantity]] =
    FHIRComponentFieldMeta("denominator", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, extension, numerator, denominator)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Ratio): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Quantity]](numerator, t.numerator),
    FHIRComponentField[Option[Quantity]](denominator, t.denominator)
  )
  def extractId(t: Ratio): Option[String]            = t.id
  def extractExtension(t: Ratio): LitSeq[Extension]  = t.extension
  def extractNumerator(t: Ratio): Option[Quantity]   = t.numerator
  def extractDenominator(t: Ratio): Option[Quantity] = t.denominator
  override val thisName: String                      = "Ratio"
  def unapply(o: Ratio): Option[(Option[String], LitSeq[Extension], Option[Quantity], Option[Quantity])] = Some(
    (o.id, o.extension, o.numerator, o.denominator))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Ratio] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Ratio(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Quantity]]("numerator", Some(None)),
          cursor.decodeAs[Option[Quantity]]("denominator", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for Ratio Type: A relationship of two Quantity values - expressed as a numerator and a denominator.
  *
  * Subclass of [[core.model.DataType]] (Base StructureDefinition for DataType Type: The base class for all re-useable types
  * defined as part of the FHIR Specification.)
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
class Ratio(
    override val id: Option[String] = None,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val numerator: Option[Quantity] = None,
    val denominator: Option[Quantity] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends DataType(id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Ratio"
}
