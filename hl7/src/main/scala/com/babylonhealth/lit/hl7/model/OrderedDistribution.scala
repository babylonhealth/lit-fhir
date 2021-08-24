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

object OrderedDistribution extends CompanionFor[OrderedDistribution] {
  implicit def summonObjectAndCompanionOrderedDistribution1785309564(
      o: OrderedDistribution): ObjectAndCompanion[OrderedDistribution, OrderedDistribution.type] = ObjectAndCompanion(o, this)
  override type ResourceType = OrderedDistribution
  override type ParentType   = OrderedDistribution
  override val baseType: CompanionFor[ResourceType] = OrderedDistribution
  override val parentType: CompanionFor[ParentType] = OrderedDistribution
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/OrderedDistribution")
  object Interval extends CompanionFor[Interval] {
    implicit def summonObjectAndCompanionInterval_254521630(o: Interval): ObjectAndCompanion[Interval, Interval.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Interval
    override type ParentType   = Interval
    override val parentType: CompanionFor[ResourceType] = Interval
    def apply(
        id: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        rankOrder: Int,
        intervalStatistic: LitSeq[Statistic] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Interval = new Interval(
      id,
      extension,
      rankOrder,
      intervalStatistic,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(o: Interval): Option[(Option[String], LitSeq[Extension], Int, LitSeq[Statistic])] = Some(
      (o.id, o.extension, o.rankOrder, o.intervalStatistic))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val rankOrder: FHIRComponentFieldMeta[Int] =
      FHIRComponentFieldMeta("rankOrder", lTagOf[Int], false, lTagOf[Int])
    val intervalStatistic: FHIRComponentFieldMeta[LitSeq[Statistic]] =
      FHIRComponentFieldMeta("intervalStatistic", lTagOf[LitSeq[Statistic]], false, lTagOf[Statistic])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, extension, rankOrder, intervalStatistic)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Interval): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Int](rankOrder, t.rankOrder),
      FHIRComponentField[LitSeq[Statistic]](intervalStatistic, t.intervalStatistic)
    )
    val baseType: CompanionFor[Interval] = this
    val thisName: String                 = "Interval"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Interval] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Interval(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Int]("rankOrder", None),
            cursor.decodeAs[LitSeq[Statistic]]("intervalStatistic", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Interval(
      override val id: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val rankOrder: Int,
      val intervalStatistic: LitSeq[Statistic] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends Element(id = id, extension = extension)
  def apply(
      id: Option[String] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      description: Option[String] = None,
      topOfInterval: Option[Quantity] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      numberOfIntervals: Int,
      bottomOfFirstInterval: Option[Quantity] = None,
      interval: NonEmptyLitSeq[OrderedDistribution.Interval],
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): OrderedDistribution = new OrderedDistribution(
    id,
    note,
    extension,
    description,
    topOfInterval,
    modifierExtension,
    numberOfIntervals,
    bottomOfFirstInterval,
    interval,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val description: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
  val topOfInterval: FHIRComponentFieldMeta[Option[Quantity]] =
    FHIRComponentFieldMeta("topOfInterval", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val numberOfIntervals: FHIRComponentFieldMeta[Int] =
    FHIRComponentFieldMeta("numberOfIntervals", lTagOf[Int], false, lTagOf[Int])
  val bottomOfFirstInterval: FHIRComponentFieldMeta[Option[Quantity]] =
    FHIRComponentFieldMeta("bottomOfFirstInterval", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
  val interval: FHIRComponentFieldMeta[NonEmptyLitSeq[OrderedDistribution.Interval]] =
    FHIRComponentFieldMeta(
      "interval",
      lTagOf[NonEmptyLitSeq[OrderedDistribution.Interval]],
      false,
      lTagOf[OrderedDistribution.Interval])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
    Seq(id, note, extension, description, topOfInterval, modifierExtension, numberOfIntervals, bottomOfFirstInterval, interval)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: OrderedDistribution): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[LitSeq[Annotation]](note, t.note),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[String]](description, t.description),
    FHIRComponentField[Option[Quantity]](topOfInterval, t.topOfInterval),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Int](numberOfIntervals, t.numberOfIntervals),
    FHIRComponentField[Option[Quantity]](bottomOfFirstInterval, t.bottomOfFirstInterval),
    FHIRComponentField[NonEmptyLitSeq[OrderedDistribution.Interval]](interval, t.interval)
  )
  def extractId(t: OrderedDistribution): Option[String]                                     = t.id
  def extractNote(t: OrderedDistribution): LitSeq[Annotation]                               = t.note
  def extractExtension(t: OrderedDistribution): LitSeq[Extension]                           = t.extension
  def extractDescription(t: OrderedDistribution): Option[String]                            = t.description
  def extractTopOfInterval(t: OrderedDistribution): Option[Quantity]                        = t.topOfInterval
  def extractModifierExtension(t: OrderedDistribution): LitSeq[Extension]                   = t.modifierExtension
  def extractNumberOfIntervals(t: OrderedDistribution): Int                                 = t.numberOfIntervals
  def extractBottomOfFirstInterval(t: OrderedDistribution): Option[Quantity]                = t.bottomOfFirstInterval
  def extractInterval(t: OrderedDistribution): NonEmptyLitSeq[OrderedDistribution.Interval] = t.interval
  override val thisName: String                                                             = "OrderedDistribution"
  def unapply(
      o: OrderedDistribution): Option[(Option[String], LitSeq[Annotation], LitSeq[Extension], Option[String], Option[Quantity], LitSeq[Extension], Int, Option[Quantity], NonEmptyLitSeq[OrderedDistribution.Interval])] =
    Some(
      (
        o.id,
        o.note,
        o.extension,
        o.description,
        o.topOfInterval,
        o.modifierExtension,
        o.numberOfIntervals,
        o.bottomOfFirstInterval,
        o.interval))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[OrderedDistribution] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new OrderedDistribution(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("description", Some(None)),
          cursor.decodeAs[Option[Quantity]]("topOfInterval", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Int]("numberOfIntervals", None),
          cursor.decodeAs[Option[Quantity]]("bottomOfFirstInterval", Some(None)),
          cursor.decodeAs[NonEmptyLitSeq[OrderedDistribution.Interval]]("interval", None),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for OrderedDistribution Type: An ordered list (distribution) of statistics.
  *
  * Subclass of [[core.model.BackboneType]] (Base StructureDefinition for BackboneType Type: Base definition for the few data
  * types that are allowed to carry modifier extensions.)
  *
  * @constructor
  *   Introduces the fields note, description, topOfInterval, numberOfIntervals, bottomOfFirstInterval, interval.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *   spaces.
  * @param note
  *   - Footnotes and/or explanatory notes.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the element. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param description
  *   - A description of the content and value of the statistic.
  * @param topOfInterval
  *   - Singular value of the statistic at the upper bound of the interval.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the element and that modifies
  *   the understanding of the element in which it is contained and/or the understanding of the containing element's descendants.
  *   Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *   strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param numberOfIntervals
  *   - Number of intervals in an array, eg 4 for quartiles.
  * @param bottomOfFirstInterval
  *   - Bottom of first interval.
  * @param interval
  *   - Interval.
  */
@POJOBoilerplate
class OrderedDistribution(
    override val id: Option[String] = None,
    val note: LitSeq[Annotation] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val description: Option[String] = None,
    val topOfInterval: Option[Quantity] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val numberOfIntervals: Int,
    val bottomOfFirstInterval: Option[Quantity] = None,
    val interval: NonEmptyLitSeq[OrderedDistribution.Interval],
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends BackboneType(
      id = id,
      extension = extension,
      modifierExtension = modifierExtension,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "OrderedDistribution"
}
