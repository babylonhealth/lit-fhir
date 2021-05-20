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
object Period extends CompanionFor[Period] {
  implicit def summonObjectAndCompanionPeriod_735614474(o: Period): ObjectAndCompanion[Period, Period.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Period
  override type ParentType   = Period
  override val baseType: CompanionFor[ResourceType] = Period
  override val parentType: CompanionFor[ParentType] = Period
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Period")
  def apply(
=======
object Period extends CompanionFor[Period[_]] {
  override type ResourceType[T] = Period[T]
  override val baseType: CompanionFor[ResourceType[_]] = Period
  override val profileUrl: Option[String]              = Some("http://hl7.org/fhir/StructureDefinition/Period")
  def apply[Stage <: LifecycleStage: ValueOf](
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
      id: Option[String] = None,
      end: Option[FHIRDateTime] = None,
      start: Option[FHIRDateTime] = None,
      extension: LitSeq[Extension[Stage]] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Period[Stage] = new Period[Stage](
    id,
    end,
    start,
    extension,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val end: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("end", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val start: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("start", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  def extension[Stage]: FHIRComponentFieldMeta[LitSeq[Extension[Stage]]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension[Stage]]], false, lTagOf[Extension[Stage]])
  def fieldsMeta[Stage <: LifecycleStage: ValueOf]: Seq[FHIRComponentFieldMeta[_]] = Seq(id, end, start, extension)
  override def fieldsFromParent[Stage <: LifecycleStage: ValueOf](
      t: ResourceType[Stage]): Try[Seq[FHIRComponentField[Stage, _]]] = Success(fields[Stage](t))
  override def fields[Stage <: LifecycleStage: ValueOf](t: Period[Stage]): Seq[FHIRComponentField[Stage, _]] = Seq(
    FHIRComponentField[Stage, Option[String]](id, t.id),
    FHIRComponentField[Stage, Option[FHIRDateTime]](end, t.end),
    FHIRComponentField[Stage, Option[FHIRDateTime]](start, t.start),
    FHIRComponentField[Stage, LitSeq[Extension[Stage]]](extension, t.extension)
  )
<<<<<<< HEAD
  def extractId(t: Period): Option[String]           = t.id
  def extractEnd(t: Period): Option[FHIRDateTime]    = t.end
  def extractStart(t: Period): Option[FHIRDateTime]  = t.start
  def extractExtension(t: Period): LitSeq[Extension] = t.extension
  override val thisName: String                      = "Period"
  def unapply(o: Period): Option[(Option[String], Option[FHIRDateTime], Option[FHIRDateTime], LitSeq[Extension])] = Some(
    (o.id, o.end, o.start, o.extension))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Period] =
=======
  def extractId(t: Period[_]): Option[String]                             = t.id
  def extractEnd(t: Period[_]): Option[FHIRDateTime]                      = t.end
  def extractStart(t: Period[_]): Option[FHIRDateTime]                    = t.start
  def extractExtension[Stage](t: Period[Stage]): LitSeq[Extension[Stage]] = t.extension
  override val thisName: String                                           = "Period"
  def unapply[Stage <: LifecycleStage: ValueOf](
      o: Period[
        Stage]): Option[(Option[String], Option[FHIRDateTime], Option[FHIRDateTime], LitSeq[Extension[Stage]])] =
    Some((o.id, o.end, o.start, o.extension))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Period[Completed.type]] =
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Period(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("end", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("start", Some(None)),
          cursor.decodeAs[LitSeq[Extension[Completed.type]]]("extension", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for Period Type: A time period defined by a start and end date and optionally time.
  *
  * Subclass of [[core.model.Element]] (Base StructureDefinition for Element Type: Base definition for all elements in a
  * resource.)
  *
  * @constructor
  *   Introduces the fields end, start.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *   spaces.
  * @param end
  *   - The end of the period. If the end of the period is missing, it means no end was known or planned at the time the instance
  *   was created. The start may be in the past, and the end date in the future, which means that period is expected/planned to
  *   end at that time.
  * @param start
  *   - The start of the period. The boundary is inclusive.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the element. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  */
@POJOBoilerplate
class Period[Stage <: LifecycleStage: ValueOf](
    override val id: Option[String] = None,
    val end: Option[FHIRDateTime] = None,
    val start: Option[FHIRDateTime] = None,
    override val extension: LitSeq[Extension[Stage]] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Element[Stage](id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Period"
}
