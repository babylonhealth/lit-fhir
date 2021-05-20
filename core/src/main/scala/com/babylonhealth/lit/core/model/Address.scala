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
import com.babylonhealth.lit.core.{ ADDRESS_TYPE, ADDRESS_USE }
import com.babylonhealth.lit.{ core }
import com.babylonhealth.lit.macros.POJOBoilerplate

<<<<<<< HEAD
object Address extends CompanionFor[Address] {
  implicit def summonObjectAndCompanionAddress_1798164897(o: Address): ObjectAndCompanion[Address, Address.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Address
  override type ParentType   = Address
  override val baseType: CompanionFor[ResourceType] = Address
  override val parentType: CompanionFor[ParentType] = Address
=======
object Address extends CompanionFor[Address[_]] {
  override type ResourceType[Stage] = Address[Stage]
  override val baseType: CompanionFor[ResourceType[_]] = Address
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Address")
  def apply[Stage <: LifecycleStage: ValueOf](
      id: Option[String] = None,
      use: Option[ADDRESS_USE] = None,
      `type`: Option[ADDRESS_TYPE] = None,
      text: Option[String] = None,
      line: LitSeq[String] = LitSeq.empty,
      city: Option[String] = None,
      state: Option[String] = None,
      period: Option[Period[Stage]] = None,
      country: Option[String] = None,
      district: Option[String] = None,
      extension: LitSeq[Extension[Stage]] = LitSeq.empty,
      postalCode: Option[String] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Address[Stage] = new Address[Stage](
    id,
    use,
    `type`,
    text,
    line,
    city,
    state,
    period,
    country,
    district,
    extension,
    postalCode,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val use: FHIRComponentFieldMeta[Option[ADDRESS_USE]] =
    FHIRComponentFieldMeta("use", lTagOf[Option[ADDRESS_USE]], false, lTagOf[ADDRESS_USE])
  val `type`: FHIRComponentFieldMeta[Option[ADDRESS_TYPE]] =
    FHIRComponentFieldMeta("type", lTagOf[Option[ADDRESS_TYPE]], false, lTagOf[ADDRESS_TYPE])
  val text: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[String]], false, lTagOf[String])
  val line: FHIRComponentFieldMeta[LitSeq[String]] =
    FHIRComponentFieldMeta("line", lTagOf[LitSeq[String]], false, lTagOf[String])
  val city: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("city", lTagOf[Option[String]], false, lTagOf[String])
  val state: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("state", lTagOf[Option[String]], false, lTagOf[String])
  val period: FHIRComponentFieldMeta[Option[Period[Stage]]] =
    FHIRComponentFieldMeta("period", lTagOf[Option[Period[Stage]]], false, lTagOf[Period[Stage]])
  val country: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("country", lTagOf[Option[String]], false, lTagOf[String])
  val district: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("district", lTagOf[Option[String]], false, lTagOf[String])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension[Stage]]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension[Stage]]], false, lTagOf[Extension[Stage]])
  val postalCode: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("postalCode", lTagOf[Option[String]], false, lTagOf[String])
  def fieldsMeta[Stage <: LifecycleStage: ValueOf]: Seq[FHIRComponentFieldMeta[_]] =
    Seq(id, use, `type`, text, line, city, state, period, country, district, extension, postalCode)
  override def fieldsFromParent[Stage <: LifecycleStage: ValueOf](t: ResourceType): Try[Seq[FHIRComponentField[Stage, _]]] = Success(fields[Stage](t))
  override def fields[Stage <: LifecycleStage: ValueOf](t: Address[Stage]): Seq[FHIRComponentField[Stage, _]] = Seq(
    FHIRComponentField[Stage, Option[String]](id, t.id),
    FHIRComponentField[Stage, Option[ADDRESS_USE]](use, t.use),
    FHIRComponentField[Stage, Option[ADDRESS_TYPE]](`type`, t.`type`),
    FHIRComponentField[Stage, Option[String]](text, t.text),
    FHIRComponentField[Stage, LitSeq[String]](line, t.line),
    FHIRComponentField[Stage, Option[String]](city, t.city),
    FHIRComponentField[Stage, Option[String]](state, t.state),
    FHIRComponentField[Stage, Option[Period[Stage]]](period, t.period),
    FHIRComponentField[Stage, Option[String]](country, t.country),
    FHIRComponentField[Stage, Option[String]](district, t.district),
    FHIRComponentField[Stage, LitSeq[Extension[Stage]]](extension, t.extension),
    FHIRComponentField[Stage, Option[String]](postalCode, t.postalCode)
  )
  def extractId(t: Address[Stage]): Option[String]           = t.id
  def extractUse(t: Address[Stage]): Option[ADDRESS_USE]     = t.use
  def extractType(t: Address[Stage]): Option[ADDRESS_TYPE]   = t.`type`
  def extractText(t: Address[Stage]): Option[String]         = t.text
  def extractLine(t: Address[Stage]): LitSeq[String]         = t.line
  def extractCity(t: Address[Stage]): Option[String]         = t.city
  def extractState(t: Address[Stage]): Option[String]        = t.state
  def extractPeriod(t: Address[Stage]): Option[Period[Stage]]       = t.period
  def extractCountry(t: Address[Stage]): Option[String]      = t.country
  def extractDistrict(t: Address[Stage]): Option[String]     = t.district
  def extractExtension[Stage](t: Address[Stage]): LitSeq[Extension[Stage]] = t.extension
  def extractPostalCode(t: Address[Stage]): Option[String]   = t.postalCode
  override val thisName: String                       = "Address"
<<<<<<< HEAD
  def unapply(
      o: Address): Option[(Option[String], Option[ADDRESS_USE], Option[ADDRESS_TYPE], Option[String], LitSeq[String], Option[String], Option[String], Option[Period], Option[String], Option[String], LitSeq[Extension], Option[String])] =
    Some((o.id, o.use, o.`type`, o.text, o.line, o.city, o.state, o.period, o.country, o.district, o.extension, o.postalCode))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Address] =
=======
  def unapply[Stage <: LifecycleStage: ValueOf](
      o: Address[Stage]): Option[(Option[String], Option[ADDRESS_USE], Option[ADDRESS_TYPE], Option[String], LitSeq[String], Option[String], Option[String], Option[Period[Stage]], Option[String], Option[String], LitSeq[Extension[Stage]], Option[String])] =
    Some(
      (
        o.id,
        o.use,
        o.`type`,
        o.text,
        o.line,
        o.city,
        o.state,
        o.period,
        o.country,
        o.district,
        o.extension,
        o.postalCode))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Address[Completed.type]] =
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Address[Completed.type](
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[ADDRESS_USE]]("use", Some(None)),
          cursor.decodeAs[Option[ADDRESS_TYPE]]("type", Some(None)),
          cursor.decodeAs[Option[String]]("text", Some(None)),
          cursor.decodeAs[LitSeq[String]]("line", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("city", Some(None)),
          cursor.decodeAs[Option[String]]("state", Some(None)),
          cursor.decodeAs[Option[Period[Completed.type]]]("period", Some(None)),
          cursor.decodeAs[Option[String]]("country", Some(None)),
          cursor.decodeAs[Option[String]]("district", Some(None)),
          cursor.decodeAs[LitSeq[Extension[Completed.type]]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("postalCode", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

<<<<<<< HEAD
/** Base StructureDefinition for Address Type: An address expressed using postal conventions (as opposed to GPS or other location
  * definition formats). This data type may be used to convey addresses for use in delivering mail as well as for visiting
  * locations which might not be valid for mail delivery. There are a variety of postal address formats defined around the world.
=======
/** Base StructureDefinition for Address[Stage] Type: An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world.
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
  *
  * Subclass of [[core.model.Element]] (Base StructureDefinition for Element Type: Base definition for all elements in a
  * resource.)
  *
  * @constructor
  *   Introduces the fields use, `type`, text, line, city, state, period, country, district, postalCode.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *   spaces.
  * @param use
  *   - The purpose of this address.
  * @param `type`
  *   - Distinguishes between physical addresses (those you can visit) and mailing addresses (e.g. PO Boxes and care-of
  *   addresses). Most addresses are both.
  * @param text
  *   - Specifies the entire address as it should be displayed e.g. on a postal label. This may be provided instead of or as well
  *   as the specific parts.
  * @param line
  *   - This component contains the house number, apartment number, street name, street direction, P.O. Box number, delivery
  *   hints, and similar address information.
  * @param city
  *   - The name of the city, town, suburb, village or other community or delivery center.
  * @param state
  *   - Sub-unit of a country with limited sovereignty in a federally organized country. A code may be used if codes are in common
  *   use (e.g. US 2 letter state codes).
  * @param period
  *   - Time period when address was/is in use.
  * @param country
  *   - Country - a nation as commonly understood or generally accepted.
  * @param district
  *   - The name of the administrative area (county).
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the element. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param postalCode
  *   - A postal code designating a region defined by the postal service.
  */
@POJOBoilerplate
class Address[Stage <: LifecycleStage: ValueOf](
    override val id: Option[String] = None,
    val use: Option[ADDRESS_USE] = None,
    val `type`: Option[ADDRESS_TYPE] = None,
    val text: Option[String] = None,
    val line: LitSeq[String] = LitSeq.empty,
    val city: Option[String] = None,
    val state: Option[String] = None,
    val period: Option[Period[Stage]] = None,
    val country: Option[String] = None,
    val district: Option[String] = None,
    override val extension: LitSeq[Extension[Stage]] = LitSeq.empty,
    val postalCode: Option[String] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Element[Stage](id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Address"
}
