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

object ProductShelfLife extends CompanionFor[ProductShelfLife] {
  implicit def summonObjectAndCompanionProductShelfLife1603322380(
      o: ProductShelfLife): ObjectAndCompanion[ProductShelfLife, ProductShelfLife.type] = ObjectAndCompanion(o, this)
  override type ResourceType = ProductShelfLife
  override type ParentType   = ProductShelfLife
  override val baseType: CompanionFor[ResourceType] = ProductShelfLife
  override val parentType: CompanionFor[ParentType] = ProductShelfLife
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/ProductShelfLife")
  def apply(
      id: Option[String] = None,
      `type`: CodeableConcept,
      period: Quantity,
      extension: LitSeq[Extension] = LitSeq.empty,
      identifier: Option[Identifier] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      specialPrecautionsForStorage: LitSeq[CodeableConcept] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): ProductShelfLife = new ProductShelfLife(
    id,
    `type`,
    period,
    extension,
    identifier,
    modifierExtension,
    specialPrecautionsForStorage,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val `type`: FHIRComponentFieldMeta[CodeableConcept] =
    FHIRComponentFieldMeta("type", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
  val period: FHIRComponentFieldMeta[Quantity] =
    FHIRComponentFieldMeta("period", lTagOf[Quantity], false, lTagOf[Quantity])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[Option[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val specialPrecautionsForStorage: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("specialPrecautionsForStorage", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
    Seq(id, `type`, period, extension, identifier, modifierExtension, specialPrecautionsForStorage)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: ProductShelfLife): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[CodeableConcept](`type`, t.`type`),
    FHIRComponentField[Quantity](period, t.period),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Identifier]](identifier, t.identifier),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[CodeableConcept]](specialPrecautionsForStorage, t.specialPrecautionsForStorage)
  )
  def extractId(t: ProductShelfLife): Option[String]                                    = t.id
  def extractType(t: ProductShelfLife): CodeableConcept                                 = t.`type`
  def extractPeriod(t: ProductShelfLife): Quantity                                      = t.period
  def extractExtension(t: ProductShelfLife): LitSeq[Extension]                          = t.extension
  def extractIdentifier(t: ProductShelfLife): Option[Identifier]                        = t.identifier
  def extractModifierExtension(t: ProductShelfLife): LitSeq[Extension]                  = t.modifierExtension
  def extractSpecialPrecautionsForStorage(t: ProductShelfLife): LitSeq[CodeableConcept] = t.specialPrecautionsForStorage
  override val thisName: String                                                         = "ProductShelfLife"
  def unapply(
      o: ProductShelfLife): Option[(Option[String], CodeableConcept, Quantity, LitSeq[Extension], Option[Identifier], LitSeq[Extension], LitSeq[CodeableConcept])] =
    Some((o.id, o.`type`, o.period, o.extension, o.identifier, o.modifierExtension, o.specialPrecautionsForStorage))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ProductShelfLife] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new ProductShelfLife(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[CodeableConcept]("type", None),
          cursor.decodeAs[Quantity]("period", None),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Identifier]]("identifier", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("specialPrecautionsForStorage", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for ProductShelfLife Type: The shelf-life and storage information for a medicinal product item or
  * container can be described using this class.
  *
  * Subclass of [[core.model.BackboneElement]] (Base StructureDefinition for BackboneElement Type: Base definition for all
  * elements that are defined inside a resource - but not those in a data type.)
  *
  * @constructor
  *   Introduces the fields `type`, period, identifier, specialPrecautionsForStorage.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *     spaces.
  * @param `type`
  *   - This describes the shelf life, taking into account various scenarios such as shelf life of the packaged Medicinal Product
  *     itself, shelf life after transformation where necessary and shelf life after the first opening of a bottle, etc. The shelf
  *     life type shall be specified using an appropriate controlled vocabulary The controlled term and the controlled term
  *     identifier shall be specified.
  * @param period
  *   - The shelf life time period can be specified using a numerical value for the period of time and its unit of time
  *     measurement The unit of measurement shall be specified in accordance with ISO 11240 and the resulting terminology The
  *     symbol and the symbol identifier shall be used.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the element. To make the use
  *     of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *     Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *     of the extension.
  * @param identifier
  *   - Unique identifier for the packaged Medicinal Product.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the element and that modifies
  *     the understanding of the element in which it is contained and/or the understanding of the containing element's
  *     descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and
  *     manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer
  *     can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  *     Applications processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the
  *     meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param specialPrecautionsForStorage
  *   - Special precautions for storage, if any, can be specified using an appropriate controlled vocabulary The controlled term
  *     and the controlled term identifier shall be specified.
  */
@POJOBoilerplate
class ProductShelfLife(
    override val id: Option[String] = None,
    val `type`: CodeableConcept,
    val period: Quantity,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val identifier: Option[Identifier] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val specialPrecautionsForStorage: LitSeq[CodeableConcept] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends BackboneElement(
      id = id,
      extension = extension,
      modifierExtension = modifierExtension,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "ProductShelfLife"
}
