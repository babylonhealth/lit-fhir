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

object ContactPoint extends CompanionFor[ContactPoint] {
  implicit def summonObjectAndCompanionContactPoint8195525(o: ContactPoint): ObjectAndCompanion[ContactPoint, ContactPoint.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = ContactPoint
  override type ParentType   = ContactPoint
  override val baseType: CompanionFor[ResourceType] = ContactPoint
  override val parentType: CompanionFor[ParentType] = ContactPoint
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/ContactPoint")
  def apply(
      id: Option[String] = None,
      use: Option[CONTACT_POINT_USE] = None,
      rank: Option[PositiveInt] = None,
      value: Option[String] = None,
      system: Option[CONTACT_POINT_SYSTEM] = None,
      period: Option[Period] = None,
      extension: LitSeq[Extension] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): ContactPoint = new ContactPoint(
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
    Some((o.id, o.use, o.rank, o.value, o.system, o.period, o.extension))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ContactPoint] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new ContactPoint(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[CONTACT_POINT_USE]]("use", Some(None)),
          cursor.decodeAs[Option[PositiveInt]]("rank", Some(None)),
          cursor.decodeAs[Option[String]]("value", Some(None)),
          cursor.decodeAs[Option[CONTACT_POINT_SYSTEM]]("system", Some(None)),
          cursor.decodeAs[Option[Period]]("period", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
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
  *     spaces.
  * @param use
  *   - Identifies the purpose for the contact point.
  * @param rank
  *   - Specifies a preferred order in which to use a set of contacts. ContactPoints with lower rank values are more preferred
  *     than those with higher rank values.
  * @param value
  *   - The actual contact point details, in a form that is meaningful to the designated communication system (i.e. phone number
  *     or email address).
  * @param system
  *   - Telecommunications form for contact point - what communications system is required to make use of the contact.
  * @param period
  *   - Time period when the contact point was/is in use.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the element. To make the use
  *     of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *     Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *     of the extension.
  */
@POJOBoilerplate
class ContactPoint(
    override val id: Option[String] = None,
    val use: Option[CONTACT_POINT_USE] = None,
    val rank: Option[PositiveInt] = None,
    val value: Option[String] = None,
    val system: Option[CONTACT_POINT_SYSTEM] = None,
    val period: Option[Period] = None,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Element(id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "ContactPoint"
}
