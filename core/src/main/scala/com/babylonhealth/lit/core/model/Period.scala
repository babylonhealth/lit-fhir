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

object Period extends CompanionFor[Period] {
  implicit def summonObjectAndCompanionPeriod_735614474(o: Period): ObjectAndCompanion[Period, Period.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Period
  override type ParentType   = Period
  override val baseType: CompanionFor[ResourceType] = Period
  override val parentType: CompanionFor[ParentType] = Period
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Period")
  def apply(
      id: Option[String] = None,
      end: Option[FHIRDateTime] = None,
      start: Option[FHIRDateTime] = None,
      extension: LitSeq[Extension] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Period = new Period(
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
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, end, start, extension)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Period): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[FHIRDateTime]](end, t.end),
    FHIRComponentField[Option[FHIRDateTime]](start, t.start),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension)
  )
  def extractId(t: Period): Option[String]           = t.id
  def extractEnd(t: Period): Option[FHIRDateTime]    = t.end
  def extractStart(t: Period): Option[FHIRDateTime]  = t.start
  def extractExtension(t: Period): LitSeq[Extension] = t.extension
  override val thisName: String                      = "Period"
  def unapply(o: Period): Option[(Option[String], Option[FHIRDateTime], Option[FHIRDateTime], LitSeq[Extension])] = Some(
    (o.id, o.end, o.start, o.extension))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Period] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Period(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("end", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("start", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
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
class Period(
    override val id: Option[String] = None,
    val end: Option[FHIRDateTime] = None,
    val start: Option[FHIRDateTime] = None,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Element(id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Period"
}
