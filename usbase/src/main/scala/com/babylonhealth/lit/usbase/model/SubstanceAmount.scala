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

import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object SubstanceAmount extends CompanionFor[SubstanceAmount] {
  implicit def summonObjectAndCompanionSubstanceAmount_1762908845(
      o: SubstanceAmount): ObjectAndCompanion[SubstanceAmount, SubstanceAmount.type] = ObjectAndCompanion(o, this)
  override type ResourceType = SubstanceAmount
  override type ParentType   = SubstanceAmount
  override val baseType: CompanionFor[ResourceType] = SubstanceAmount
  override val parentType: CompanionFor[ParentType] = SubstanceAmount
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/SubstanceAmount")
  object ReferenceRange extends CompanionFor[ReferenceRange] {
    implicit def summonObjectAndCompanionReferenceRange_1195914352(
        o: ReferenceRange): ObjectAndCompanion[ReferenceRange, ReferenceRange.type] = ObjectAndCompanion(o, this)
    override type ResourceType = ReferenceRange
    override type ParentType   = ReferenceRange
    override val parentType: CompanionFor[ResourceType] = ReferenceRange
    def apply(
        id: Option[String] = None,
        lowLimit: Option[Quantity] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        highLimit: Option[Quantity] = None,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): ReferenceRange = new ReferenceRange(
      id,
      lowLimit,
      extension,
      highLimit,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(o: ReferenceRange): Option[(Option[String], Option[Quantity], LitSeq[Extension], Option[Quantity])] = Some(
      (o.id, o.lowLimit, o.extension, o.highLimit))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val lowLimit: FHIRComponentFieldMeta[Option[Quantity]] =
      FHIRComponentFieldMeta("lowLimit", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val highLimit: FHIRComponentFieldMeta[Option[Quantity]] =
      FHIRComponentFieldMeta("highLimit", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, lowLimit, extension, highLimit)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: ReferenceRange): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Quantity]](lowLimit, t.lowLimit),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Quantity]](highLimit, t.highLimit)
    )
    val baseType: CompanionFor[ReferenceRange] = this
    val thisName: String                       = "ReferenceRange"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ReferenceRange] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new ReferenceRange(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[Quantity]]("lowLimit", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Quantity]]("highLimit", Some(None)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class ReferenceRange(
      override val id: Option[String] = None,
      val lowLimit: Option[Quantity] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val highLimit: Option[Quantity] = None,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends Element(id = id, extension = extension)
  type AmountChoice = Choice[UnionQuantityOrRangeOrString]
  def apply(
      id: Option[String] = None,
      extension: LitSeq[Extension] = LitSeq.empty,
      amount: Option[SubstanceAmount.AmountChoice] = None,
      amountType: Option[CodeableConcept] = None,
      amountText: Option[String] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      referenceRange: Option[SubstanceAmount.ReferenceRange] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): SubstanceAmount = new SubstanceAmount(
    id,
    extension,
    amount,
    amountType,
    amountText,
    modifierExtension,
    referenceRange,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val amount: FHIRComponentFieldMeta[Option[SubstanceAmount.AmountChoice]] =
    FHIRComponentFieldMeta("amount", lTagOf[Option[SubstanceAmount.AmountChoice]], true, lTagOf[UnionQuantityOrRangeOrString])
  val amountType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("amountType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val amountText: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("amountText", lTagOf[Option[String]], false, lTagOf[String])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val referenceRange: FHIRComponentFieldMeta[Option[SubstanceAmount.ReferenceRange]] =
    FHIRComponentFieldMeta(
      "referenceRange",
      lTagOf[Option[SubstanceAmount.ReferenceRange]],
      false,
      lTagOf[SubstanceAmount.ReferenceRange])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
    Seq(id, extension, amount, amountType, amountText, modifierExtension, referenceRange)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: SubstanceAmount): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[SubstanceAmount.AmountChoice]](amount, t.amount),
    FHIRComponentField[Option[CodeableConcept]](amountType, t.amountType),
    FHIRComponentField[Option[String]](amountText, t.amountText),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Option[SubstanceAmount.ReferenceRange]](referenceRange, t.referenceRange)
  )
  def extractId(t: SubstanceAmount): Option[String]                                     = t.id
  def extractExtension(t: SubstanceAmount): LitSeq[Extension]                           = t.extension
  def extractAmount(t: SubstanceAmount): Option[SubstanceAmount.AmountChoice]           = t.amount
  def extractAmountType(t: SubstanceAmount): Option[CodeableConcept]                    = t.amountType
  def extractAmountText(t: SubstanceAmount): Option[String]                             = t.amountText
  def extractModifierExtension(t: SubstanceAmount): LitSeq[Extension]                   = t.modifierExtension
  def extractReferenceRange(t: SubstanceAmount): Option[SubstanceAmount.ReferenceRange] = t.referenceRange
  override val thisName: String                                                         = "SubstanceAmount"
  def unapply(
      o: SubstanceAmount): Option[(Option[String], LitSeq[Extension], Option[SubstanceAmount.AmountChoice], Option[CodeableConcept], Option[String], LitSeq[Extension], Option[SubstanceAmount.ReferenceRange])] =
    Some((o.id, o.extension, o.amount, o.amountType, o.amountText, o.modifierExtension, o.referenceRange))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[SubstanceAmount] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new SubstanceAmount(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeOptRef[UnionQuantityOrRangeOrString]("amount"),
          cursor.decodeAs[Option[CodeableConcept]]("amountType", Some(None)),
          cursor.decodeAs[Option[String]]("amountText", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[SubstanceAmount.ReferenceRange]]("referenceRange", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for SubstanceAmount Type: Chemical substances are a single substance type whose primary defining
  * element is the molecular structure. Chemical substances shall be defined on the basis of their complete covalent molecular
  * structure; the presence of a salt (counter-ion) and/or solvates (water, alcohols) is also captured. Purity, grade, physical
  * form or particle size are not taken into account in the definition of a chemical substance or in the assignment of a Substance
  * ID.
  *
  * Subclass of [[core.model.BackboneElement]] (Base StructureDefinition for BackboneElement Type: Base definition for all
  * elements that are defined inside a resource - but not those in a data type.)
  *
  * @constructor
  *   Introduces the fields amount, amountType, amountText, referenceRange.
  * @param id
  *   \- Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *   spaces.
  * @param extension
  *   \- May be used to represent additional information that is not part of the basic definition of the element. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param amount
  *   \- Used to capture quantitative values for a variety of elements. If only limits are given, the arithmetic mean would be the
  *   average. If only a single definite value for a given element is given, it would be captured in this field.
  * @param amountType
  *   \- Most elements that require a quantitative value will also have a field called amount type. Amount type should always be
  *   specified because the actual value of the amount is often dependent on it. EXAMPLE: In capturing the actual relative amounts
  *   of substances or molecular fragments it is essential to indicate whether the amount refers to a mole ratio or weight ratio.
  *   For any given element an effort should be made to use same the amount type for all related definitional elements.
  * @param amountText
  *   \- A textual comment on a numeric value.
  * @param modifierExtension
  *   \- May be used to represent additional information that is not part of the basic definition of the element and that modifies
  *   the understanding of the element in which it is contained and/or the understanding of the containing element's descendants.
  *   Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *   strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param referenceRange
  *   \- Reference range of possible or expected values.
  */
@POJOBoilerplate
class SubstanceAmount(
    override val id: Option[String] = None,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val amount: Option[SubstanceAmount.AmountChoice] = None,
    val amountType: Option[CodeableConcept] = None,
    val amountText: Option[String] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val referenceRange: Option[SubstanceAmount.ReferenceRange] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends BackboneElement(
      id = id,
      extension = extension,
      modifierExtension = modifierExtension,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "SubstanceAmount"
}
