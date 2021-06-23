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

object Address extends CompanionFor[Address] {
  implicit def summonObjectAndCompanionAddress2002168585(o: Address): ObjectAndCompanion[Address, Address.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Address
  override type ParentType   = Address
  override val baseType: CompanionFor[ResourceType] = Address
  override val parentType: CompanionFor[ParentType] = Address
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Address")
  def apply(
      id: Option[String] = None,
      use: Option[ADDRESS_USE] = None,
      `type`: Option[ADDRESS_TYPE] = None,
      text: Option[String] = None,
      line: LitSeq[String] = LitSeq.empty,
      city: Option[String] = None,
      state: Option[String] = None,
      period: Option[Period] = None,
      country: Option[String] = None,
      district: Option[String] = None,
      extension: LitSeq[Extension] = LitSeq.empty,
      postalCode: Option[String] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Address = new Address(
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
  val period: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("period", lTagOf[Option[Period]], false, lTagOf[Period])
  val country: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("country", lTagOf[Option[String]], false, lTagOf[String])
  val district: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("district", lTagOf[Option[String]], false, lTagOf[String])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val postalCode: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("postalCode", lTagOf[Option[String]], false, lTagOf[String])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
    Seq(id, use, `type`, text, line, city, state, period, country, district, extension, postalCode)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Address): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[ADDRESS_USE]](use, t.use),
    FHIRComponentField[Option[ADDRESS_TYPE]](`type`, t.`type`),
    FHIRComponentField[Option[String]](text, t.text),
    FHIRComponentField[LitSeq[String]](line, t.line),
    FHIRComponentField[Option[String]](city, t.city),
    FHIRComponentField[Option[String]](state, t.state),
    FHIRComponentField[Option[Period]](period, t.period),
    FHIRComponentField[Option[String]](country, t.country),
    FHIRComponentField[Option[String]](district, t.district),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[String]](postalCode, t.postalCode)
  )
  def extractId(t: Address): Option[String]           = t.id
  def extractUse(t: Address): Option[ADDRESS_USE]     = t.use
  def extractType(t: Address): Option[ADDRESS_TYPE]   = t.`type`
  def extractText(t: Address): Option[String]         = t.text
  def extractLine(t: Address): LitSeq[String]         = t.line
  def extractCity(t: Address): Option[String]         = t.city
  def extractState(t: Address): Option[String]        = t.state
  def extractPeriod(t: Address): Option[Period]       = t.period
  def extractCountry(t: Address): Option[String]      = t.country
  def extractDistrict(t: Address): Option[String]     = t.district
  def extractExtension(t: Address): LitSeq[Extension] = t.extension
  def extractPostalCode(t: Address): Option[String]   = t.postalCode
  override val thisName: String                       = "Address"
  def unapply(
      o: Address): Option[(Option[String], Option[ADDRESS_USE], Option[ADDRESS_TYPE], Option[String], LitSeq[String], Option[String], Option[String], Option[Period], Option[String], Option[String], LitSeq[Extension], Option[String])] =
    Some((o.id, o.use, o.`type`, o.text, o.line, o.city, o.state, o.period, o.country, o.district, o.extension, o.postalCode))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Address] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Address(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[ADDRESS_USE]]("use", Some(None)),
          cursor.decodeAs[Option[ADDRESS_TYPE]]("type", Some(None)),
          cursor.decodeAs[Option[String]]("text", Some(None)),
          cursor.decodeAs[LitSeq[String]]("line", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("city", Some(None)),
          cursor.decodeAs[Option[String]]("state", Some(None)),
          cursor.decodeAs[Option[Period]]("period", Some(None)),
          cursor.decodeAs[Option[String]]("country", Some(None)),
          cursor.decodeAs[Option[String]]("district", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("postalCode", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for Address Type: An address expressed using postal conventions (as opposed to GPS or other location
  * definition formats). This data type may be used to convey addresses for use in delivering mail as well as for visiting
  * locations which might not be valid for mail delivery. There are a variety of postal address formats defined around the world.
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
class Address(
    override val id: Option[String] = None,
    val use: Option[ADDRESS_USE] = None,
    val `type`: Option[ADDRESS_TYPE] = None,
    val text: Option[String] = None,
    val line: LitSeq[String] = LitSeq.empty,
    val city: Option[String] = None,
    val state: Option[String] = None,
    val period: Option[Period] = None,
    val country: Option[String] = None,
    val district: Option[String] = None,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val postalCode: Option[String] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Element(id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Address"
}
