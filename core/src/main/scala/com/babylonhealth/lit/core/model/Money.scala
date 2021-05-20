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
object Money extends CompanionFor[Money] {
  implicit def summonObjectAndCompanionMoney389435883(o: Money): ObjectAndCompanion[Money, Money.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Money
  override type ParentType   = Money
  override val baseType: CompanionFor[ResourceType] = Money
  override val parentType: CompanionFor[ParentType] = Money
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Money")
  def apply(
=======
object Money extends CompanionFor[Money[_]] {
  override type ResourceType[T] = Money[T]
  override val baseType: CompanionFor[ResourceType[_]] = Money
  override val profileUrl: Option[String]              = Some("http://hl7.org/fhir/StructureDefinition/Money")
  def apply[Stage <: LifecycleStage: ValueOf](
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
      id: Option[String] = None,
      value: Option[BigDecimal] = None,
      currency: Option[Code] = None,
      extension: LitSeq[Extension[Stage]] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Money[Stage] = new Money[Stage](
    id,
    value,
    currency,
    extension,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[Option[BigDecimal]] =
    FHIRComponentFieldMeta("value", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
  val currency: FHIRComponentFieldMeta[Option[Code]] =
    FHIRComponentFieldMeta("currency", lTagOf[Option[Code]], false, lTagOf[Code])
  def extension[Stage]: FHIRComponentFieldMeta[LitSeq[Extension[Stage]]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension[Stage]]], false, lTagOf[Extension[Stage]])
  def fieldsMeta[Stage <: LifecycleStage: ValueOf]: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value, currency, extension)
  override def fieldsFromParent[Stage <: LifecycleStage: ValueOf](
      t: ResourceType[Stage]): Try[Seq[FHIRComponentField[Stage, _]]] = Success(fields[Stage](t))
  override def fields[Stage <: LifecycleStage: ValueOf](t: Money[Stage]): Seq[FHIRComponentField[Stage, _]] = Seq(
    FHIRComponentField[Stage, Option[String]](id, t.id),
    FHIRComponentField[Stage, Option[BigDecimal]](value, t.value),
    FHIRComponentField[Stage, Option[Code]](currency, t.currency),
    FHIRComponentField[Stage, LitSeq[Extension[Stage]]](extension, t.extension)
  )
  def extractId(t: Money[_]): Option[String]                             = t.id
  def extractValue(t: Money[_]): Option[BigDecimal]                      = t.value
  def extractCurrency(t: Money[_]): Option[Code]                         = t.currency
  def extractExtension[Stage](t: Money[Stage]): LitSeq[Extension[Stage]] = t.extension
  override val thisName: String                                          = "Money"
  def unapply[Stage <: LifecycleStage: ValueOf](
      o: Money[Stage]): Option[(Option[String], Option[BigDecimal], Option[Code], LitSeq[Extension[Stage]])] = Some(
    (o.id, o.value, o.currency, o.extension))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Money[Completed.type]] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Money[Completed.type](
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[BigDecimal]]("value", Some(None)),
          cursor.decodeAs[Option[Code]]("currency", Some(None)),
          cursor.decodeAs[LitSeq[Extension[Completed.type]]]("extension", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for Money Type: An amount of economic utility in some recognized currency.
  *
  * Subclass of [[core.model.Element]] (Base StructureDefinition for Element Type: Base definition for all elements in a
  * resource.)
  *
  * @constructor
  *   Introduces the fields value, currency.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *   spaces.
  * @param value
  *   - Numerical value (with implicit precision).
  * @param currency
  *   - ISO 4217 Currency Code.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the element. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  */
@POJOBoilerplate
class Money[Stage <: LifecycleStage: ValueOf](
    override val id: Option[String] = None,
    val value: Option[BigDecimal] = None,
    val currency: Option[Code] = None,
    override val extension: LitSeq[Extension[Stage]] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Element[Stage](id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Money"
}
