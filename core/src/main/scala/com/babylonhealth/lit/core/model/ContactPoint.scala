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
import com.babylonhealth.lit.core.{ CONTACT_POINT_USE, CONTACT_POINT_SYSTEM }
import com.babylonhealth.lit.{ core }
import com.babylonhealth.lit.macros.POJOBoilerplate

<<<<<<< HEAD
object ContactPoint extends CompanionFor[ContactPoint] {
  implicit def summonObjectAndCompanionContactPoint8195525(o: ContactPoint): ObjectAndCompanion[ContactPoint, ContactPoint.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = ContactPoint
  override type ParentType   = ContactPoint
  override val baseType: CompanionFor[ResourceType] = ContactPoint
  override val parentType: CompanionFor[ParentType] = ContactPoint
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/ContactPoint")
  def apply(
=======
object ContactPoint extends CompanionFor[ContactPoint[_]] {
  override type ResourceType[T] = ContactPoint[T]
  override val baseType: CompanionFor[ResourceType[_]] = ContactPoint
  override val profileUrl: Option[String]              = Some("http://hl7.org/fhir/StructureDefinition/ContactPoint")
  def apply[Stage <: LifecycleStage: ValueOf](
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
      id: Option[String] = None,
      use: Option[CONTACT_POINT_USE] = None,
      rank: Option[PositiveInt] = None,
      value: Option[String] = None,
      system: Option[CONTACT_POINT_SYSTEM] = None,
      period: Option[Period[Stage]] = None,
      extension: LitSeq[Extension[Stage]] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): ContactPoint[Stage] = new ContactPoint[Stage](
    id,
    use,
    rank,
    value,
    system,
    period,
    extension,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val use: FHIRComponentFieldMeta[Option[CONTACT_POINT_USE]] =
    FHIRComponentFieldMeta("use", lTagOf[Option[CONTACT_POINT_USE]], false, lTagOf[CONTACT_POINT_USE])
  val rank: FHIRComponentFieldMeta[Option[PositiveInt]] =
    FHIRComponentFieldMeta("rank", lTagOf[Option[PositiveInt]], false, lTagOf[PositiveInt])
  val value: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("value", lTagOf[Option[String]], false, lTagOf[String])
  val system: FHIRComponentFieldMeta[Option[CONTACT_POINT_SYSTEM]] =
    FHIRComponentFieldMeta("system", lTagOf[Option[CONTACT_POINT_SYSTEM]], false, lTagOf[CONTACT_POINT_SYSTEM])
<<<<<<< HEAD
  val period: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("period", lTagOf[Option[Period]], false, lTagOf[Period])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, use, rank, value, system, period, extension)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: ContactPoint): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[CONTACT_POINT_USE]](use, t.use),
    FHIRComponentField[Option[PositiveInt]](rank, t.rank),
    FHIRComponentField[Option[String]](value, t.value),
    FHIRComponentField[Option[CONTACT_POINT_SYSTEM]](system, t.system),
    FHIRComponentField[Option[Period]](period, t.period),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension)
  )
  def extractId(t: ContactPoint): Option[String]                   = t.id
  def extractUse(t: ContactPoint): Option[CONTACT_POINT_USE]       = t.use
  def extractRank(t: ContactPoint): Option[PositiveInt]            = t.rank
  def extractValue(t: ContactPoint): Option[String]                = t.value
  def extractSystem(t: ContactPoint): Option[CONTACT_POINT_SYSTEM] = t.system
  def extractPeriod(t: ContactPoint): Option[Period]               = t.period
  def extractExtension(t: ContactPoint): LitSeq[Extension]         = t.extension
  override val thisName: String                                    = "ContactPoint"
  def unapply(
      o: ContactPoint): Option[(Option[String], Option[CONTACT_POINT_USE], Option[PositiveInt], Option[String], Option[CONTACT_POINT_SYSTEM], Option[Period], LitSeq[Extension])] =
=======
  def period[Stage]: FHIRComponentFieldMeta[Option[Period[Stage]]] =
    FHIRComponentFieldMeta("period", lTagOf[Option[Period[Stage]]], false, lTagOf[Period[Stage]])
  def extension[Stage]: FHIRComponentFieldMeta[LitSeq[Extension[Stage]]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension[Stage]]], false, lTagOf[Extension[Stage]])
  def fieldsMeta[Stage <: LifecycleStage: ValueOf]: Seq[FHIRComponentFieldMeta[_]] =
    Seq(id, use, rank, value, system, period, extension)
  override def fieldsFromParent[Stage <: LifecycleStage: ValueOf](
      t: ResourceType[Stage]): Try[Seq[FHIRComponentField[Stage, _]]] = Success(fields[Stage](t))
  override def fields[Stage <: LifecycleStage: ValueOf](t: ContactPoint[Stage]): Seq[FHIRComponentField[Stage, _]] =
    Seq(
      FHIRComponentField[Stage, Option[String]](id, t.id),
      FHIRComponentField[Stage, Option[CONTACT_POINT_USE]](use, t.use),
      FHIRComponentField[Stage, Option[PositiveInt]](rank, t.rank),
      FHIRComponentField[Stage, Option[String]](value, t.value),
      FHIRComponentField[Stage, Option[CONTACT_POINT_SYSTEM]](system, t.system),
      FHIRComponentField[Stage, Option[Period[Stage]]](period, t.period),
      FHIRComponentField[Stage, LitSeq[Extension[Stage]]](extension, t.extension)
    )
  def extractId(t: ContactPoint[_]): Option[String]                             = t.id
  def extractUse(t: ContactPoint[_]): Option[CONTACT_POINT_USE]                 = t.use
  def extractRank(t: ContactPoint[_]): Option[PositiveInt]                      = t.rank
  def extractValue(t: ContactPoint[_]): Option[String]                          = t.value
  def extractSystem(t: ContactPoint[_]): Option[CONTACT_POINT_SYSTEM]           = t.system
  def extractPeriod[Stage](t: ContactPoint[Stage]): Option[Period[Stage]]       = t.period
  def extractExtension[Stage](t: ContactPoint[Stage]): LitSeq[Extension[Stage]] = t.extension
  override val thisName: String                                                 = "ContactPoint"
  def unapply[Stage <: LifecycleStage: ValueOf](o: ContactPoint[
    Stage]): Option[(Option[String], Option[CONTACT_POINT_USE], Option[PositiveInt], Option[String], Option[CONTACT_POINT_SYSTEM], Option[Period[Stage]], LitSeq[Extension[Stage]])] =
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
    Some((o.id, o.use, o.rank, o.value, o.system, o.period, o.extension))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ContactPoint[Completed.type]] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new ContactPoint(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[CONTACT_POINT_USE]]("use", Some(None)),
          cursor.decodeAs[Option[PositiveInt]]("rank", Some(None)),
          cursor.decodeAs[Option[String]]("value", Some(None)),
          cursor.decodeAs[Option[CONTACT_POINT_SYSTEM]]("system", Some(None)),
          cursor.decodeAs[Option[Period[Completed.type]]]("period", Some(None)),
          cursor.decodeAs[LitSeq[Extension[Completed.type]]]("extension", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for ContactPoint Type: Details for all kinds of technology mediated contact points for a person or
  * organization, including telephone, email, etc.
  *
  * Subclass of [[core.model.Element]] (Base StructureDefinition for Element Type: Base definition for all elements in a
  * resource.)
  *
  * @constructor
  *   Introduces the fields use, rank, value, system, period.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *   spaces.
  * @param use
  *   - Identifies the purpose for the contact point.
  * @param rank
  *   - Specifies a preferred order in which to use a set of contacts. ContactPoints with lower rank values are more preferred
  *   than those with higher rank values.
  * @param value
  *   - The actual contact point details, in a form that is meaningful to the designated communication system (i.e. phone number
  *   or email address).
  * @param system
  *   - Telecommunications form for contact point - what communications system is required to make use of the contact.
  * @param period
  *   - Time period when the contact point was/is in use.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the element. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  */
@POJOBoilerplate
class ContactPoint[Stage <: LifecycleStage: ValueOf](
    override val id: Option[String] = None,
    val use: Option[CONTACT_POINT_USE] = None,
    val rank: Option[PositiveInt] = None,
    val value: Option[String] = None,
    val system: Option[CONTACT_POINT_SYSTEM] = None,
    val period: Option[Period[Stage]] = None,
    override val extension: LitSeq[Extension[Stage]] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Element[Stage](id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "ContactPoint"
}
