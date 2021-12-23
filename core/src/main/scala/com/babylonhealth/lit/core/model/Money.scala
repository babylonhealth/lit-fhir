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

object Money extends CompanionFor[Money] {
  implicit def summonObjectAndCompanionMoney389435883(o: Money): ObjectAndCompanion[Money, Money.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Money
  override type ParentType   = Money
  override val baseType: CompanionFor[ResourceType] = Money
  override val parentType: CompanionFor[ParentType] = Money
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Money")
  def apply(
      id: Option[String] = None,
      value: Option[BigDecimal] = None,
      currency: Option[Code] = None,
      extension: LitSeq[Extension] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Money = new Money(
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
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, value, currency, extension)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Money): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[BigDecimal]](value, t.value),
    FHIRComponentField[Option[Code]](currency, t.currency),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension)
  )
  def extractId(t: Money): Option[String]           = t.id
  def extractValue(t: Money): Option[BigDecimal]    = t.value
  def extractCurrency(t: Money): Option[Code]       = t.currency
  def extractExtension(t: Money): LitSeq[Extension] = t.extension
  override val thisName: String                     = "Money"
  def unapply(o: Money): Option[(Option[String], Option[BigDecimal], Option[Code], LitSeq[Extension])] = Some(
    (o.id, o.value, o.currency, o.extension))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Money] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Money(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[BigDecimal]]("value", Some(None)),
          cursor.decodeAs[Option[Code]]("currency", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
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
  *     spaces.
  * @param value
  *   - Numerical value (with implicit precision).
  * @param currency
  *   - ISO 4217 Currency Code.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the element. To make the use
  *     of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *     Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *     of the extension.
  */
@POJOBoilerplate
class Money(
    override val id: Option[String] = None,
    val value: Option[BigDecimal] = None,
    val currency: Option[Code] = None,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Element(id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Money"
}
