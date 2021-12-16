package com.babylonhealth.lit.hl7.model

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
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object MedicinalProductManufactured extends CompanionFor[MedicinalProductManufactured] {
  implicit def summonObjectAndCompanionMedicinalProductManufactured_916890639(
      o: MedicinalProductManufactured): ObjectAndCompanion[MedicinalProductManufactured, MedicinalProductManufactured.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = MedicinalProductManufactured
  override type ParentType   = MedicinalProductManufactured
  override val baseType: CompanionFor[ResourceType] = MedicinalProductManufactured
  override val parentType: CompanionFor[ParentType] = MedicinalProductManufactured
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/MedicinalProductManufactured")
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      language: Option[LANGUAGES] = None,
      quantity: Quantity,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      ingredient: LitSeq[Reference] = LitSeq.empty,
      manufacturer: LitSeq[Reference] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      unitOfPresentation: Option[CodeableConcept] = None,
      manufacturedDoseForm: CodeableConcept,
      otherCharacteristics: LitSeq[CodeableConcept] = LitSeq.empty,
      physicalCharacteristics: Option[Choice["ProdCharacteristic"]] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): MedicinalProductManufactured = new MedicinalProductManufactured(
    id,
    meta,
    text,
    language,
    quantity,
    contained,
    extension,
    ingredient,
    manufacturer,
    implicitRules,
    modifierExtension,
    unitOfPresentation,
    manufacturedDoseForm,
    otherCharacteristics,
    physicalCharacteristics,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val quantity: FHIRComponentFieldMeta[Quantity] =
    FHIRComponentFieldMeta("quantity", lTagOf[Quantity], false, lTagOf[Quantity])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val ingredient: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("ingredient", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val manufacturer: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("manufacturer", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val unitOfPresentation: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("unitOfPresentation", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val manufacturedDoseForm: FHIRComponentFieldMeta[CodeableConcept] =
    FHIRComponentFieldMeta("manufacturedDoseForm", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
  val otherCharacteristics: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("otherCharacteristics", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val physicalCharacteristics: FHIRComponentFieldMeta[Option[Choice["ProdCharacteristic"]]] =
    FHIRComponentFieldMeta(
      "physicalCharacteristics",
      lTagOf[Option[Choice["ProdCharacteristic"]]],
      false,
      lTagOf[Choice["ProdCharacteristic"]])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    language,
    quantity,
    contained,
    extension,
    ingredient,
    manufacturer,
    implicitRules,
    modifierExtension,
    unitOfPresentation,
    manufacturedDoseForm,
    otherCharacteristics,
    physicalCharacteristics
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: MedicinalProductManufactured): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Quantity](quantity, t.quantity),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[Reference]](ingredient, t.ingredient),
    FHIRComponentField[LitSeq[Reference]](manufacturer, t.manufacturer),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Option[CodeableConcept]](unitOfPresentation, t.unitOfPresentation),
    FHIRComponentField[CodeableConcept](manufacturedDoseForm, t.manufacturedDoseForm),
    FHIRComponentField[LitSeq[CodeableConcept]](otherCharacteristics, t.otherCharacteristics),
    FHIRComponentField[Option[Choice["ProdCharacteristic"]]](physicalCharacteristics, t.physicalCharacteristics)
  )
  def extractId(t: MedicinalProductManufactured): Option[String]                            = t.id
  def extractMeta(t: MedicinalProductManufactured): Option[Meta]                            = t.meta
  def extractText(t: MedicinalProductManufactured): Option[Narrative]                       = t.text
  def extractLanguage(t: MedicinalProductManufactured): Option[LANGUAGES]                   = t.language
  def extractQuantity(t: MedicinalProductManufactured): Quantity                            = t.quantity
  def extractContained(t: MedicinalProductManufactured): LitSeq[Resource]                   = t.contained
  def extractExtension(t: MedicinalProductManufactured): LitSeq[Extension]                  = t.extension
  def extractIngredient(t: MedicinalProductManufactured): LitSeq[Reference]                 = t.ingredient
  def extractManufacturer(t: MedicinalProductManufactured): LitSeq[Reference]               = t.manufacturer
  def extractImplicitRules(t: MedicinalProductManufactured): Option[UriStr]                 = t.implicitRules
  def extractModifierExtension(t: MedicinalProductManufactured): LitSeq[Extension]          = t.modifierExtension
  def extractUnitOfPresentation(t: MedicinalProductManufactured): Option[CodeableConcept]   = t.unitOfPresentation
  def extractManufacturedDoseForm(t: MedicinalProductManufactured): CodeableConcept         = t.manufacturedDoseForm
  def extractOtherCharacteristics(t: MedicinalProductManufactured): LitSeq[CodeableConcept] = t.otherCharacteristics
  def extractPhysicalCharacteristics(t: MedicinalProductManufactured): Option[Choice["ProdCharacteristic"]] =
    t.physicalCharacteristics
  override val thisName: String = "MedicinalProductManufactured"
  def unapply(
      o: MedicinalProductManufactured): Option[(Option[String], Option[Meta], Option[Narrative], Option[LANGUAGES], Quantity, LitSeq[Resource], LitSeq[Extension], LitSeq[Reference], LitSeq[Reference], Option[UriStr], LitSeq[Extension], Option[CodeableConcept], CodeableConcept, LitSeq[CodeableConcept], Option[Choice["ProdCharacteristic"]])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.language,
        o.quantity,
        o.contained,
        o.extension,
        o.ingredient,
        o.manufacturer,
        o.implicitRules,
        o.modifierExtension,
        o.unitOfPresentation,
        o.manufacturedDoseForm,
        o.otherCharacteristics,
        o.physicalCharacteristics))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[MedicinalProductManufactured] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new MedicinalProductManufactured(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Quantity]("quantity", None),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("ingredient", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("manufacturer", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("unitOfPresentation", Some(None)),
          cursor.decodeAs[CodeableConcept]("manufacturedDoseForm", None),
          cursor.decodeAs[LitSeq[CodeableConcept]]("otherCharacteristics", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Choice["ProdCharacteristic"]]]("physicalCharacteristics", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** The manufactured item as contained in the packaged medicinal product.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields quantity, ingredient, manufacturer, unitOfPresentation, manufacturedDoseForm, otherCharacteristics,
  *   physicalCharacteristics.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *   not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *   resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to
  *   make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be
  *   represented in the narrative to ensure clinical safety.
  * @param language
  *   - The base language in which the resource is written.
  * @param quantity
  *   - The quantity or "count number" of the manufactured item.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param ingredient
  *   - Ingredient.
  * @param manufacturer
  *   - Manufacturer of the item (Note that this should be named "manufacturer" but it currently causes technical issues).
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *   the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually
  *   modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict
  *   set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param unitOfPresentation
  *   - The “real world” units in which the quantity of the manufactured item is described.
  * @param manufacturedDoseForm
  *   - Dose form as manufactured and before any transformation into the pharmaceutical product.
  * @param otherCharacteristics
  *   - Other codeable characteristics.
  * @param physicalCharacteristics
  *   - Dimensions, color etc.
  */
@POJOBoilerplate
class MedicinalProductManufactured(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    override val language: Option[LANGUAGES] = None,
    val quantity: Quantity,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val ingredient: LitSeq[Reference] = LitSeq.empty,
    val manufacturer: LitSeq[Reference] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val unitOfPresentation: Option[CodeableConcept] = None,
    val manufacturedDoseForm: CodeableConcept,
    val otherCharacteristics: LitSeq[CodeableConcept] = LitSeq.empty,
    val physicalCharacteristics: Option[Choice["ProdCharacteristic"]] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends DomainResource(
      id = id,
      meta = meta,
      text = text,
      language = language,
      contained = contained,
      extension = extension,
      implicitRules = implicitRules,
      modifierExtension = modifierExtension,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "MedicinalProductManufactured"
}
