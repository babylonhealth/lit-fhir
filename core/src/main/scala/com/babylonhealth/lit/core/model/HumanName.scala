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
import com.babylonhealth.lit.core.NAME_USE
import com.babylonhealth.lit.{ core }
import com.babylonhealth.lit.macros.POJOBoilerplate

object HumanName extends CompanionFor[HumanName] {
  implicit def summonObjectAndCompanionHumanName1549178115(o: HumanName): ObjectAndCompanion[HumanName, HumanName.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = HumanName
  override type ParentType   = HumanName
  override val baseType: CompanionFor[ResourceType] = HumanName
  override val parentType: CompanionFor[ParentType] = HumanName
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/HumanName")
  def apply(
      id: Option[String] = None,
      use: Option[NAME_USE] = None,
      text: Option[String] = None,
      `given`: LitSeq[String] = LitSeq.empty,
      family: Option[String] = None,
      prefix: LitSeq[String] = LitSeq.empty,
      suffix: LitSeq[String] = LitSeq.empty,
      period: Option[Period] = None,
      extension: LitSeq[Extension] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): HumanName = new HumanName(
    id,
    use,
    text,
    `given`,
    family,
    prefix,
    suffix,
    period,
    extension,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val use: FHIRComponentFieldMeta[Option[NAME_USE]] =
    FHIRComponentFieldMeta("use", lTagOf[Option[NAME_USE]], false, lTagOf[NAME_USE])
  val text: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[String]], false, lTagOf[String])
  val `given`: FHIRComponentFieldMeta[LitSeq[String]] =
    FHIRComponentFieldMeta("given", lTagOf[LitSeq[String]], false, lTagOf[String])
  val family: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("family", lTagOf[Option[String]], false, lTagOf[String])
  val prefix: FHIRComponentFieldMeta[LitSeq[String]] =
    FHIRComponentFieldMeta("prefix", lTagOf[LitSeq[String]], false, lTagOf[String])
  val suffix: FHIRComponentFieldMeta[LitSeq[String]] =
    FHIRComponentFieldMeta("suffix", lTagOf[LitSeq[String]], false, lTagOf[String])
  val period: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("period", lTagOf[Option[Period]], false, lTagOf[Period])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, use, text, `given`, family, prefix, suffix, period, extension)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: HumanName): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[NAME_USE]](use, t.use),
    FHIRComponentField[Option[String]](text, t.text),
    FHIRComponentField[LitSeq[String]](`given`, t.`given`),
    FHIRComponentField[Option[String]](family, t.family),
    FHIRComponentField[LitSeq[String]](prefix, t.prefix),
    FHIRComponentField[LitSeq[String]](suffix, t.suffix),
    FHIRComponentField[Option[Period]](period, t.period),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension)
  )
  def extractId(t: HumanName): Option[String]           = t.id
  def extractUse(t: HumanName): Option[NAME_USE]        = t.use
  def extractText(t: HumanName): Option[String]         = t.text
  def extractGiven(t: HumanName): LitSeq[String]        = t.`given`
  def extractFamily(t: HumanName): Option[String]       = t.family
  def extractPrefix(t: HumanName): LitSeq[String]       = t.prefix
  def extractSuffix(t: HumanName): LitSeq[String]       = t.suffix
  def extractPeriod(t: HumanName): Option[Period]       = t.period
  def extractExtension(t: HumanName): LitSeq[Extension] = t.extension
  override val thisName: String                         = "HumanName"
  def unapply(
      o: HumanName): Option[(Option[String], Option[NAME_USE], Option[String], LitSeq[String], Option[String], LitSeq[String], LitSeq[String], Option[Period], LitSeq[Extension])] =
    Some((o.id, o.use, o.text, o.`given`, o.family, o.prefix, o.suffix, o.period, o.extension))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[HumanName] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new HumanName(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[NAME_USE]]("use", Some(None)),
          cursor.decodeAs[Option[String]]("text", Some(None)),
          cursor.decodeAs[LitSeq[String]]("given", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("family", Some(None)),
          cursor.decodeAs[LitSeq[String]]("prefix", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[String]]("suffix", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Period]]("period", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for HumanName Type: A human's name with the ability to identify parts and usage.
  *
  * Subclass of [[core.model.Element]] (Base StructureDefinition for Element Type: Base definition for all elements in a
  * resource.)
  *
  * @constructor
  *   Introduces the fields use, text, `given`, family, prefix, suffix, period.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *   spaces.
  * @param use
  *   - Identifies the purpose for this name.
  * @param text
  *   - Specifies the entire name as it should be displayed e.g. on an application UI. This may be provided instead of or as well
  *   as the specific parts.
  * @param `given`
  *   - Given name.
  * @param family
  *   - The part of a name that links to the genealogy. In some cultures (e.g. Eritrea) the family name of a son is the first name
  *   of his father.
  * @param prefix
  *   - Part of the name that is acquired as a title due to academic, legal, employment or nobility status, etc. and that appears
  *   at the start of the name.
  * @param suffix
  *   - Part of the name that is acquired as a title due to academic, legal, employment or nobility status, etc. and that appears
  *   at the end of the name.
  * @param period
  *   - Indicates the period of time when this name was valid for the named person.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the element. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  */
@POJOBoilerplate
class HumanName(
    override val id: Option[String] = None,
    val use: Option[NAME_USE] = None,
    val text: Option[String] = None,
    val `given`: LitSeq[String] = LitSeq.empty,
    val family: Option[String] = None,
    val prefix: LitSeq[String] = LitSeq.empty,
    val suffix: LitSeq[String] = LitSeq.empty,
    val period: Option[Period] = None,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Element(id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "HumanName"
}
