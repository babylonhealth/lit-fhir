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
import com.babylonhealth.lit.core.{ UNITS_OF_TIME, DAYS_OF_WEEK, EVENT_TIMING }
import com.babylonhealth.lit.{ core }
import com.babylonhealth.lit.macros.POJOBoilerplate

<<<<<<< HEAD
object Timing extends CompanionFor[Timing] {
  implicit def summonObjectAndCompanionTiming_617552769(o: Timing): ObjectAndCompanion[Timing, Timing.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Timing
  override type ParentType   = Timing
  override val baseType: CompanionFor[ResourceType] = Timing
  override val parentType: CompanionFor[ParentType] = Timing
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Timing")
  object Repeat extends CompanionFor[Repeat] {
    implicit def summonObjectAndCompanionRepeat715372756(o: Repeat): ObjectAndCompanion[Repeat, Repeat.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Repeat
    override type ParentType   = Repeat
    override val parentType: CompanionFor[ResourceType] = Repeat
    type BoundsChoice = Choice[UnionDurationOrPeriodOrRange]
    def apply(
=======
object Timing extends CompanionFor[Timing[_]] {
  override type ResourceType[T] = Timing[T]
  override val baseType: CompanionFor[ResourceType[_]] = Timing
  override val profileUrl: Option[String]              = Some("http://hl7.org/fhir/StructureDefinition/Timing")
  object Repeat extends CompanionFor[Repeat[_]] {
    override type ResourceType[T] = Repeat[T]
    type BoundsChoice[Stage]      = Choice[Union_0731860109[Stage]]
    def apply[Stage <: LifecycleStage: ValueOf](
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
        id: Option[String] = None,
        when: LitSeq[EVENT_TIMING] = LitSeq.empty,
        count: Option[PositiveInt] = None,
        period: Option[BigDecimal] = None,
        offset: Option[UnsignedInt] = None,
        countMax: Option[PositiveInt] = None,
        duration: Option[BigDecimal] = None,
        extension: LitSeq[Extension[Stage]] = LitSeq.empty,
        bounds: Option[Repeat.BoundsChoice[Stage]] = None,
        frequency: Option[PositiveInt] = None,
        periodMax: Option[BigDecimal] = None,
        dayOfWeek: LitSeq[DAYS_OF_WEEK] = LitSeq.empty,
        timeOfDay: LitSeq[LocalTime] = LitSeq.empty,
        periodUnit: Option[UNITS_OF_TIME] = None,
        durationMax: Option[BigDecimal] = None,
        durationUnit: Option[UNITS_OF_TIME] = None,
        frequencyMax: Option[PositiveInt] = None,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Repeat[Stage] = new Repeat[Stage](
      id,
      when,
      count,
      period,
      offset,
      countMax,
      duration,
      extension,
      bounds,
      frequency,
      periodMax,
      dayOfWeek,
      timeOfDay,
      periodUnit,
      durationMax,
      durationUnit,
      frequencyMax,
      primitiveAttributes = primitiveAttributes
    )
    def unapply[Stage <: LifecycleStage: ValueOf](o: Repeat[
      Stage]): Option[(Option[String], LitSeq[EVENT_TIMING], Option[PositiveInt], Option[BigDecimal], Option[UnsignedInt], Option[PositiveInt], Option[BigDecimal], LitSeq[Extension[Stage]], Option[Repeat.BoundsChoice[Stage]], Option[PositiveInt], Option[BigDecimal], LitSeq[DAYS_OF_WEEK], LitSeq[LocalTime], Option[UNITS_OF_TIME], Option[BigDecimal], Option[UNITS_OF_TIME], Option[PositiveInt])] =
      Some(
        (
          o.id,
          o.when,
          o.count,
          o.period,
          o.offset,
          o.countMax,
          o.duration,
          o.extension,
          o.bounds,
          o.frequency,
          o.periodMax,
          o.dayOfWeek,
          o.timeOfDay,
          o.periodUnit,
          o.durationMax,
          o.durationUnit,
          o.frequencyMax))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val when: FHIRComponentFieldMeta[LitSeq[EVENT_TIMING]] =
      FHIRComponentFieldMeta("when", lTagOf[LitSeq[EVENT_TIMING]], false, lTagOf[EVENT_TIMING])
    val count: FHIRComponentFieldMeta[Option[PositiveInt]] =
      FHIRComponentFieldMeta("count", lTagOf[Option[PositiveInt]], false, lTagOf[PositiveInt])
    val period: FHIRComponentFieldMeta[Option[BigDecimal]] =
      FHIRComponentFieldMeta("period", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
    val offset: FHIRComponentFieldMeta[Option[UnsignedInt]] =
      FHIRComponentFieldMeta("offset", lTagOf[Option[UnsignedInt]], false, lTagOf[UnsignedInt])
    val countMax: FHIRComponentFieldMeta[Option[PositiveInt]] =
      FHIRComponentFieldMeta("countMax", lTagOf[Option[PositiveInt]], false, lTagOf[PositiveInt])
    val duration: FHIRComponentFieldMeta[Option[BigDecimal]] =
      FHIRComponentFieldMeta("duration", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
<<<<<<< HEAD
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val bounds: FHIRComponentFieldMeta[Option[Repeat.BoundsChoice]] =
      FHIRComponentFieldMeta("bounds", lTagOf[Option[Repeat.BoundsChoice]], true, lTagOf[UnionDurationOrPeriodOrRange])
=======
    def extension[Stage]: FHIRComponentFieldMeta[LitSeq[Extension[Stage]]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension[Stage]]], false, lTagOf[Extension[Stage]])
    def bounds[Stage]: FHIRComponentFieldMeta[Option[Repeat.BoundsChoice[Stage]]] =
      FHIRComponentFieldMeta(
        "bounds",
        lTagOf[Option[Repeat.BoundsChoice[Stage]]],
        true,
        lTagOf[Union_0731860109[Stage]])
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
    val frequency: FHIRComponentFieldMeta[Option[PositiveInt]] =
      FHIRComponentFieldMeta("frequency", lTagOf[Option[PositiveInt]], false, lTagOf[PositiveInt])
    val periodMax: FHIRComponentFieldMeta[Option[BigDecimal]] =
      FHIRComponentFieldMeta("periodMax", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
    val dayOfWeek: FHIRComponentFieldMeta[LitSeq[DAYS_OF_WEEK]] =
      FHIRComponentFieldMeta("dayOfWeek", lTagOf[LitSeq[DAYS_OF_WEEK]], false, lTagOf[DAYS_OF_WEEK])
    val timeOfDay: FHIRComponentFieldMeta[LitSeq[LocalTime]] =
      FHIRComponentFieldMeta("timeOfDay", lTagOf[LitSeq[LocalTime]], false, lTagOf[LocalTime])
    val periodUnit: FHIRComponentFieldMeta[Option[UNITS_OF_TIME]] =
      FHIRComponentFieldMeta("periodUnit", lTagOf[Option[UNITS_OF_TIME]], false, lTagOf[UNITS_OF_TIME])
    val durationMax: FHIRComponentFieldMeta[Option[BigDecimal]] =
      FHIRComponentFieldMeta("durationMax", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
    val durationUnit: FHIRComponentFieldMeta[Option[UNITS_OF_TIME]] =
      FHIRComponentFieldMeta("durationUnit", lTagOf[Option[UNITS_OF_TIME]], false, lTagOf[UNITS_OF_TIME])
    val frequencyMax: FHIRComponentFieldMeta[Option[PositiveInt]] =
      FHIRComponentFieldMeta("frequencyMax", lTagOf[Option[PositiveInt]], false, lTagOf[PositiveInt])
    def fieldsMeta[Stage <: LifecycleStage: ValueOf]: Seq[FHIRComponentFieldMeta[_]] = Seq(
      id,
      when,
      count,
      period,
      offset,
      countMax,
      duration,
      extension,
      bounds,
      frequency,
      periodMax,
      dayOfWeek,
      timeOfDay,
      periodUnit,
      durationMax,
      durationUnit,
      frequencyMax
    )
    override def fieldsFromParent[Stage <: LifecycleStage: ValueOf](
        t: ResourceType[Stage]): Try[Seq[FHIRComponentField[Stage, _]]] = Success(fields[Stage](t))
    override def fields[Stage <: LifecycleStage: ValueOf](t: Repeat[Stage]): Seq[FHIRComponentField[Stage, _]] = Seq(
      FHIRComponentField[Stage, Option[String]](id, t.id),
      FHIRComponentField[Stage, LitSeq[EVENT_TIMING]](when, t.when),
      FHIRComponentField[Stage, Option[PositiveInt]](count, t.count),
      FHIRComponentField[Stage, Option[BigDecimal]](period, t.period),
      FHIRComponentField[Stage, Option[UnsignedInt]](offset, t.offset),
      FHIRComponentField[Stage, Option[PositiveInt]](countMax, t.countMax),
      FHIRComponentField[Stage, Option[BigDecimal]](duration, t.duration),
      FHIRComponentField[Stage, LitSeq[Extension[Stage]]](extension, t.extension),
      FHIRComponentField[Stage, Option[Repeat.BoundsChoice[Stage]]](bounds, t.bounds),
      FHIRComponentField[Stage, Option[PositiveInt]](frequency, t.frequency),
      FHIRComponentField[Stage, Option[BigDecimal]](periodMax, t.periodMax),
      FHIRComponentField[Stage, LitSeq[DAYS_OF_WEEK]](dayOfWeek, t.dayOfWeek),
      FHIRComponentField[Stage, LitSeq[LocalTime]](timeOfDay, t.timeOfDay),
      FHIRComponentField[Stage, Option[UNITS_OF_TIME]](periodUnit, t.periodUnit),
      FHIRComponentField[Stage, Option[BigDecimal]](durationMax, t.durationMax),
      FHIRComponentField[Stage, Option[UNITS_OF_TIME]](durationUnit, t.durationUnit),
      FHIRComponentField[Stage, Option[PositiveInt]](frequencyMax, t.frequencyMax)
    )
    val baseType: CompanionFor[Repeat[_]] = this
    val thisName: String                  = "Repeat"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Repeat[Completed.type]] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Repeat(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[EVENT_TIMING]]("when", Some(LitSeq.empty)),
            cursor.decodeAs[Option[PositiveInt]]("count", Some(None)),
            cursor.decodeAs[Option[BigDecimal]]("period", Some(None)),
            cursor.decodeAs[Option[UnsignedInt]]("offset", Some(None)),
            cursor.decodeAs[Option[PositiveInt]]("countMax", Some(None)),
            cursor.decodeAs[Option[BigDecimal]]("duration", Some(None)),
<<<<<<< HEAD
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeOptRef[UnionDurationOrPeriodOrRange]("bounds"),
=======
            cursor.decodeAs[LitSeq[Extension[Completed.type]]]("extension", Some(LitSeq.empty)),
            cursor.decodeOptRef[Union_0731860109[Completed.type]]("bounds"),
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
            cursor.decodeAs[Option[PositiveInt]]("frequency", Some(None)),
            cursor.decodeAs[Option[BigDecimal]]("periodMax", Some(None)),
            cursor.decodeAs[LitSeq[DAYS_OF_WEEK]]("dayOfWeek", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[LocalTime]]("timeOfDay", Some(LitSeq.empty)),
            cursor.decodeAs[Option[UNITS_OF_TIME]]("periodUnit", Some(None)),
            cursor.decodeAs[Option[BigDecimal]]("durationMax", Some(None)),
            cursor.decodeAs[Option[UNITS_OF_TIME]]("durationUnit", Some(None)),
            cursor.decodeAs[Option[PositiveInt]]("frequencyMax", Some(None)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Repeat[Stage <: LifecycleStage: ValueOf](
      override val id: Option[String] = None,
      val when: LitSeq[EVENT_TIMING] = LitSeq.empty,
      val count: Option[PositiveInt] = None,
      val period: Option[BigDecimal] = None,
      val offset: Option[UnsignedInt] = None,
      val countMax: Option[PositiveInt] = None,
      val duration: Option[BigDecimal] = None,
      override val extension: LitSeq[Extension[Stage]] = LitSeq.empty,
      val bounds: Option[Repeat.BoundsChoice[Stage]] = None,
      val frequency: Option[PositiveInt] = None,
      val periodMax: Option[BigDecimal] = None,
      val dayOfWeek: LitSeq[DAYS_OF_WEEK] = LitSeq.empty,
      val timeOfDay: LitSeq[LocalTime] = LitSeq.empty,
      val periodUnit: Option[UNITS_OF_TIME] = None,
      val durationMax: Option[BigDecimal] = None,
      val durationUnit: Option[UNITS_OF_TIME] = None,
      val frequencyMax: Option[PositiveInt] = None,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends Element[Stage](id = id, extension = extension)
  def apply[Stage <: LifecycleStage: ValueOf](
      id: Option[String] = None,
      code: Option[CodeableConcept[Stage]] = None,
      event: LitSeq[FHIRDateTime] = LitSeq.empty,
      extension: LitSeq[Extension[Stage]] = LitSeq.empty,
      modifierExtension: LitSeq[Extension[Stage]] = LitSeq.empty,
      repeat: Option[Timing.Repeat[Stage]] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Timing[Stage] = new Timing[Stage](
    id,
    code,
    event,
    extension,
    modifierExtension,
    repeat,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  def code[Stage]: FHIRComponentFieldMeta[Option[CodeableConcept[Stage]]] =
    FHIRComponentFieldMeta("code", lTagOf[Option[CodeableConcept[Stage]]], false, lTagOf[CodeableConcept[Stage]])
  val event: FHIRComponentFieldMeta[LitSeq[FHIRDateTime]] =
    FHIRComponentFieldMeta("event", lTagOf[LitSeq[FHIRDateTime]], false, lTagOf[FHIRDateTime])
<<<<<<< HEAD
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val repeat: FHIRComponentFieldMeta[Option[Timing.Repeat]] =
    FHIRComponentFieldMeta("repeat", lTagOf[Option[Timing.Repeat]], false, lTagOf[Timing.Repeat])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, code, event, extension, modifierExtension, repeat)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Timing): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[CodeableConcept]](code, t.code),
    FHIRComponentField[LitSeq[FHIRDateTime]](event, t.event),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Option[Timing.Repeat]](repeat, t.repeat)
=======
  def extension[Stage]: FHIRComponentFieldMeta[LitSeq[Extension[Stage]]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension[Stage]]], false, lTagOf[Extension[Stage]])
  def modifierExtension[Stage]: FHIRComponentFieldMeta[LitSeq[Extension[Stage]]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension[Stage]]], false, lTagOf[Extension[Stage]])
  def repeat[Stage]: FHIRComponentFieldMeta[Option[Timing.Repeat[Stage]]] =
    FHIRComponentFieldMeta("repeat", lTagOf[Option[Timing.Repeat[Stage]]], false, lTagOf[Timing.Repeat[Stage]])
  def fieldsMeta[Stage <: LifecycleStage: ValueOf]: Seq[FHIRComponentFieldMeta[_]] =
    Seq(id, code, event, extension, modifierExtension, repeat)
  override def fieldsFromParent[Stage <: LifecycleStage: ValueOf](
      t: ResourceType[Stage]): Try[Seq[FHIRComponentField[Stage, _]]] = Success(fields[Stage](t))
  override def fields[Stage <: LifecycleStage: ValueOf](t: Timing[Stage]): Seq[FHIRComponentField[Stage, _]] = Seq(
    FHIRComponentField[Stage, Option[String]](id, t.id),
    FHIRComponentField[Stage, Option[CodeableConcept[Stage]]](code, t.code),
    FHIRComponentField[Stage, LitSeq[FHIRDateTime]](event, t.event),
    FHIRComponentField[Stage, LitSeq[Extension[Stage]]](extension, t.extension),
    FHIRComponentField[Stage, LitSeq[Extension[Stage]]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Stage, Option[Timing.Repeat[Stage]]](repeat, t.repeat)
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
  )
  def extractId(t: Timing[_]): Option[String]                                     = t.id
  def extractCode[Stage](t: Timing[Stage]): Option[CodeableConcept[Stage]]        = t.code
  def extractEvent(t: Timing[_]): LitSeq[FHIRDateTime]                            = t.event
  def extractExtension[Stage](t: Timing[Stage]): LitSeq[Extension[Stage]]         = t.extension
  def extractModifierExtension[Stage](t: Timing[Stage]): LitSeq[Extension[Stage]] = t.modifierExtension
  def extractRepeat[Stage](t: Timing[Stage]): Option[Timing.Repeat[Stage]]        = t.repeat
  override val thisName: String                                                   = "Timing"
  def unapply[Stage <: LifecycleStage: ValueOf](o: Timing[
    Stage]): Option[(Option[String], Option[CodeableConcept[Stage]], LitSeq[FHIRDateTime], LitSeq[Extension[Stage]], LitSeq[Extension[Stage]], Option[Timing.Repeat[Stage]])] =
    Some((o.id, o.code, o.event, o.extension, o.modifierExtension, o.repeat))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Timing[Completed.type]] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Timing(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[CodeableConcept[Completed.type]]]("code", Some(None)),
          cursor.decodeAs[LitSeq[FHIRDateTime]]("event", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension[Completed.type]]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension[Completed.type]]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Timing.Repeat[Completed.type]]]("repeat", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for Timing Type: Specifies an event that may occur multiple times. Timing schedules are used to
  * record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for
  * medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past
  * regular activities were carried out.
  *
  * Subclass of [[core.model.BackboneElement]] (Base StructureDefinition for BackboneElement Type: Base definition for all
  * elements that are defined inside a resource - but not those in a data type.)
  *
  * @constructor
  *   Introduces the fields code, event, repeat.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *   spaces.
  * @param code
  *   - A code for the timing schedule (or just text in code.text). Some codes such as BID are ubiquitous, but many institutions
  *   define their own additional codes. If a code is provided, the code is understood to be a complete statement of whatever is
  *   specified in the structured timing data, and either the code or the data may be used to interpret the Timing, with the
  *   exception that .repeat.bounds still applies over the code (and is not contained in the code).
  * @param event
  *   - Identifies specific times when the event occurs.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the element. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the element and that modifies
  *   the understanding of the element in which it is contained and/or the understanding of the containing element's descendants.
  *   Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *   strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param repeat
  *   - A set of rules that describe when the event is scheduled.
  */
@POJOBoilerplate
class Timing[Stage <: LifecycleStage: ValueOf](
    override val id: Option[String] = None,
    val code: Option[CodeableConcept[Stage]] = None,
    val event: LitSeq[FHIRDateTime] = LitSeq.empty,
    override val extension: LitSeq[Extension[Stage]] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension[Stage]] = LitSeq.empty,
    val repeat: Option[Timing.Repeat[Stage]] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends BackboneElement(
      id = id,
      extension = extension,
      modifierExtension = modifierExtension,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Timing"
}
