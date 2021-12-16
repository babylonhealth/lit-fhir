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

object ProdCharacteristic extends CompanionFor[ProdCharacteristic] {
  implicit def summonObjectAndCompanionProdCharacteristic866064775(
      o: ProdCharacteristic): ObjectAndCompanion[ProdCharacteristic, ProdCharacteristic.type] = ObjectAndCompanion(o, this)
  override type ResourceType = ProdCharacteristic
  override type ParentType   = ProdCharacteristic
  override val baseType: CompanionFor[ResourceType] = ProdCharacteristic
  override val parentType: CompanionFor[ParentType] = ProdCharacteristic
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/ProdCharacteristic")
  def apply(
      id: Option[String] = None,
      width: Option[Quantity] = None,
      depth: Option[Quantity] = None,
      shape: Option[String] = None,
      color: LitSeq[String] = LitSeq.empty,
      image: LitSeq[Attachment] = LitSeq.empty,
      height: Option[Quantity] = None,
      weight: Option[Quantity] = None,
      imprint: LitSeq[String] = LitSeq.empty,
      scoring: Option[CodeableConcept] = None,
      extension: LitSeq[Extension] = LitSeq.empty,
      nominalVolume: Option[Quantity] = None,
      externalDiameter: Option[Quantity] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): ProdCharacteristic = new ProdCharacteristic(
    id,
    width,
    depth,
    shape,
    color,
    image,
    height,
    weight,
    imprint,
    scoring,
    extension,
    nominalVolume,
    externalDiameter,
    modifierExtension,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val width: FHIRComponentFieldMeta[Option[Quantity]] =
    FHIRComponentFieldMeta("width", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
  val depth: FHIRComponentFieldMeta[Option[Quantity]] =
    FHIRComponentFieldMeta("depth", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
  val shape: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("shape", lTagOf[Option[String]], false, lTagOf[String])
  val color: FHIRComponentFieldMeta[LitSeq[String]] =
    FHIRComponentFieldMeta("color", lTagOf[LitSeq[String]], false, lTagOf[String])
  val image: FHIRComponentFieldMeta[LitSeq[Attachment]] =
    FHIRComponentFieldMeta("image", lTagOf[LitSeq[Attachment]], false, lTagOf[Attachment])
  val height: FHIRComponentFieldMeta[Option[Quantity]] =
    FHIRComponentFieldMeta("height", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
  val weight: FHIRComponentFieldMeta[Option[Quantity]] =
    FHIRComponentFieldMeta("weight", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
  val imprint: FHIRComponentFieldMeta[LitSeq[String]] =
    FHIRComponentFieldMeta("imprint", lTagOf[LitSeq[String]], false, lTagOf[String])
  val scoring: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("scoring", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val nominalVolume: FHIRComponentFieldMeta[Option[Quantity]] =
    FHIRComponentFieldMeta("nominalVolume", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
  val externalDiameter: FHIRComponentFieldMeta[Option[Quantity]] =
    FHIRComponentFieldMeta("externalDiameter", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    width,
    depth,
    shape,
    color,
    image,
    height,
    weight,
    imprint,
    scoring,
    extension,
    nominalVolume,
    externalDiameter,
    modifierExtension)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: ProdCharacteristic): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Quantity]](width, t.width),
    FHIRComponentField[Option[Quantity]](depth, t.depth),
    FHIRComponentField[Option[String]](shape, t.shape),
    FHIRComponentField[LitSeq[String]](color, t.color),
    FHIRComponentField[LitSeq[Attachment]](image, t.image),
    FHIRComponentField[Option[Quantity]](height, t.height),
    FHIRComponentField[Option[Quantity]](weight, t.weight),
    FHIRComponentField[LitSeq[String]](imprint, t.imprint),
    FHIRComponentField[Option[CodeableConcept]](scoring, t.scoring),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Quantity]](nominalVolume, t.nominalVolume),
    FHIRComponentField[Option[Quantity]](externalDiameter, t.externalDiameter),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
  )
  def extractId(t: ProdCharacteristic): Option[String]                   = t.id
  def extractWidth(t: ProdCharacteristic): Option[Quantity]              = t.width
  def extractDepth(t: ProdCharacteristic): Option[Quantity]              = t.depth
  def extractShape(t: ProdCharacteristic): Option[String]                = t.shape
  def extractColor(t: ProdCharacteristic): LitSeq[String]                = t.color
  def extractImage(t: ProdCharacteristic): LitSeq[Attachment]            = t.image
  def extractHeight(t: ProdCharacteristic): Option[Quantity]             = t.height
  def extractWeight(t: ProdCharacteristic): Option[Quantity]             = t.weight
  def extractImprint(t: ProdCharacteristic): LitSeq[String]              = t.imprint
  def extractScoring(t: ProdCharacteristic): Option[CodeableConcept]     = t.scoring
  def extractExtension(t: ProdCharacteristic): LitSeq[Extension]         = t.extension
  def extractNominalVolume(t: ProdCharacteristic): Option[Quantity]      = t.nominalVolume
  def extractExternalDiameter(t: ProdCharacteristic): Option[Quantity]   = t.externalDiameter
  def extractModifierExtension(t: ProdCharacteristic): LitSeq[Extension] = t.modifierExtension
  override val thisName: String                                          = "ProdCharacteristic"
  def unapply(
      o: ProdCharacteristic): Option[(Option[String], Option[Quantity], Option[Quantity], Option[String], LitSeq[String], LitSeq[Attachment], Option[Quantity], Option[Quantity], LitSeq[String], Option[CodeableConcept], LitSeq[Extension], Option[Quantity], Option[Quantity], LitSeq[Extension])] =
    Some(
      (
        o.id,
        o.width,
        o.depth,
        o.shape,
        o.color,
        o.image,
        o.height,
        o.weight,
        o.imprint,
        o.scoring,
        o.extension,
        o.nominalVolume,
        o.externalDiameter,
        o.modifierExtension))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ProdCharacteristic] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new ProdCharacteristic(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Quantity]]("width", Some(None)),
          cursor.decodeAs[Option[Quantity]]("depth", Some(None)),
          cursor.decodeAs[Option[String]]("shape", Some(None)),
          cursor.decodeAs[LitSeq[String]]("color", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Attachment]]("image", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Quantity]]("height", Some(None)),
          cursor.decodeAs[Option[Quantity]]("weight", Some(None)),
          cursor.decodeAs[LitSeq[String]]("imprint", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("scoring", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Quantity]]("nominalVolume", Some(None)),
          cursor.decodeAs[Option[Quantity]]("externalDiameter", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for ProdCharacteristic Type: The marketing status describes the date when a medicinal product is
  * actually put on the market or the date as of which it is no longer available.
  *
  * Subclass of [[core.model.BackboneElement]] (Base StructureDefinition for BackboneElement Type: Base definition for all
  * elements that are defined inside a resource - but not those in a data type.)
  *
  * @constructor
  *   Introduces the fields width, depth, shape, color, image, height, weight, imprint, scoring, nominalVolume, externalDiameter.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *   spaces.
  * @param width
  *   - Where applicable, the width can be specified using a numerical value and its unit of measurement The unit of measurement
  *   shall be specified in accordance with ISO 11240 and the resulting terminology The symbol and the symbol identifier shall be
  *   used.
  * @param depth
  *   - Where applicable, the depth can be specified using a numerical value and its unit of measurement The unit of measurement
  *   shall be specified in accordance with ISO 11240 and the resulting terminology The symbol and the symbol identifier shall be
  *   used.
  * @param shape
  *   - Where applicable, the shape can be specified An appropriate controlled vocabulary shall be used The term and the term
  *   identifier shall be used.
  * @param color
  *   - Where applicable, the color can be specified An appropriate controlled vocabulary shall be used The term and the term
  *   identifier shall be used.
  * @param image
  *   - Where applicable, the image can be provided The format of the image attachment shall be specified by regional
  *   implementations.
  * @param height
  *   - Where applicable, the height can be specified using a numerical value and its unit of measurement The unit of measurement
  *   shall be specified in accordance with ISO 11240 and the resulting terminology The symbol and the symbol identifier shall be
  *   used.
  * @param weight
  *   - Where applicable, the weight can be specified using a numerical value and its unit of measurement The unit of measurement
  *   shall be specified in accordance with ISO 11240 and the resulting terminology The symbol and the symbol identifier shall be
  *   used.
  * @param imprint
  *   - Where applicable, the imprint can be specified as text.
  * @param scoring
  *   - Where applicable, the scoring can be specified An appropriate controlled vocabulary shall be used The term and the term
  *   identifier shall be used.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the element. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param nominalVolume
  *   - Where applicable, the nominal volume can be specified using a numerical value and its unit of measurement The unit of
  *   measurement shall be specified in accordance with ISO 11240 and the resulting terminology The symbol and the symbol
  *   identifier shall be used.
  * @param externalDiameter
  *   - Where applicable, the external diameter can be specified using a numerical value and its unit of measurement The unit of
  *   measurement shall be specified in accordance with ISO 11240 and the resulting terminology The symbol and the symbol
  *   identifier shall be used.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the element and that modifies
  *   the understanding of the element in which it is contained and/or the understanding of the containing element's descendants.
  *   Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *   strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  */
@POJOBoilerplate
class ProdCharacteristic(
    override val id: Option[String] = None,
    val width: Option[Quantity] = None,
    val depth: Option[Quantity] = None,
    val shape: Option[String] = None,
    val color: LitSeq[String] = LitSeq.empty,
    val image: LitSeq[Attachment] = LitSeq.empty,
    val height: Option[Quantity] = None,
    val weight: Option[Quantity] = None,
    val imprint: LitSeq[String] = LitSeq.empty,
    val scoring: Option[CodeableConcept] = None,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val nominalVolume: Option[Quantity] = None,
    val externalDiameter: Option[Quantity] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends BackboneElement(
      id = id,
      extension = extension,
      modifierExtension = modifierExtension,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "ProdCharacteristic"
}
