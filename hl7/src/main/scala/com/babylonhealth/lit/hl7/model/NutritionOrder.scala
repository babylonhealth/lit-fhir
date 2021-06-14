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
import com.babylonhealth.lit.hl7.{ REQUEST_INTENT, REQUEST_STATUS }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object NutritionOrder extends CompanionFor[NutritionOrder] {
  implicit def summonObjectAndCompanionNutritionOrder1730118791(
      o: NutritionOrder): ObjectAndCompanion[NutritionOrder, NutritionOrder.type] = ObjectAndCompanion(o, this)
  override type ResourceType = NutritionOrder
  override type ParentType   = NutritionOrder
  override val baseType: CompanionFor[ResourceType] = NutritionOrder
  override val parentType: CompanionFor[ParentType] = NutritionOrder
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/NutritionOrder")
  object EnteralFormula extends CompanionFor[EnteralFormula] {
    implicit def summonObjectAndCompanionEnteralFormula506699772(
        o: EnteralFormula): ObjectAndCompanion[EnteralFormula, EnteralFormula.type] = ObjectAndCompanion(o, this)
    override type ResourceType = EnteralFormula
    override type ParentType   = EnteralFormula
    override val parentType: CompanionFor[ResourceType] = EnteralFormula
    object Administration extends CompanionFor[Administration] {
      implicit def summonObjectAndCompanionAdministration_327056599(
          o: Administration): ObjectAndCompanion[Administration, Administration.type] = ObjectAndCompanion(o, this)
      override type ResourceType = Administration
      override type ParentType   = Administration
      override val parentType: CompanionFor[ResourceType] = Administration
      type RateChoice = Choice[Union_0964108894]
      def apply(
          id: Option[String] = None,
          rate: Option[Administration.RateChoice] = None,
          schedule: Option[Timing] = None,
          quantity: Option[Quantity] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Administration = new Administration(
        id,
        rate,
        schedule,
        quantity,
        extension,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Administration): Option[(Option[String], Option[Administration.RateChoice], Option[Timing], Option[Quantity], LitSeq[Extension], LitSeq[Extension])] =
        Some((o.id, o.rate, o.schedule, o.quantity, o.extension, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val rate: FHIRComponentFieldMeta[Option[Administration.RateChoice]] =
        FHIRComponentFieldMeta("rate", lTagOf[Option[Administration.RateChoice]], true, lTagOf[Union_0964108894])
      val schedule: FHIRComponentFieldMeta[Option[Timing]] =
        FHIRComponentFieldMeta("schedule", lTagOf[Option[Timing]], false, lTagOf[Timing])
      val quantity: FHIRComponentFieldMeta[Option[Quantity]] =
        FHIRComponentFieldMeta("quantity", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, rate, schedule, quantity, extension, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Administration): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[Administration.RateChoice]](rate, t.rate),
        FHIRComponentField[Option[Timing]](schedule, t.schedule),
        FHIRComponentField[Option[Quantity]](quantity, t.quantity),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Administration] = this
      val thisName: String                       = "Administration"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Administration] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Administration(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeOptRef[Union_0964108894]("rate"),
              cursor.decodeAs[Option[Timing]]("schedule", Some(None)),
              cursor.decodeAs[Option[Quantity]]("quantity", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Administration(
        override val id: Option[String] = None,
        val rate: Option[Administration.RateChoice] = None,
        val schedule: Option[Timing] = None,
        val quantity: Option[Quantity] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        additiveType: Option[CodeableConcept] = None,
        caloricDensity: Option[Quantity] = None,
        baseFormulaType: Option[CodeableConcept] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        maxVolumeToDeliver: Option[Quantity] = None,
        additiveProductName: Option[String] = None,
        routeofAdministration: Option[CodeableConcept] = None,
        baseFormulaProductName: Option[String] = None,
        administrationInstruction: Option[String] = None,
        administration: LitSeq[EnteralFormula.Administration] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): EnteralFormula = new EnteralFormula(
      id,
      extension,
      additiveType,
      caloricDensity,
      baseFormulaType,
      modifierExtension,
      maxVolumeToDeliver,
      additiveProductName,
      routeofAdministration,
      baseFormulaProductName,
      administrationInstruction,
      administration,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: EnteralFormula): Option[(Option[String], LitSeq[Extension], Option[CodeableConcept], Option[Quantity], Option[CodeableConcept], LitSeq[Extension], Option[Quantity], Option[String], Option[CodeableConcept], Option[String], Option[String], LitSeq[EnteralFormula.Administration])] =
      Some(
        (
          o.id,
          o.extension,
          o.additiveType,
          o.caloricDensity,
          o.baseFormulaType,
          o.modifierExtension,
          o.maxVolumeToDeliver,
          o.additiveProductName,
          o.routeofAdministration,
          o.baseFormulaProductName,
          o.administrationInstruction,
          o.administration))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val additiveType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("additiveType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val caloricDensity: FHIRComponentFieldMeta[Option[Quantity]] =
      FHIRComponentFieldMeta("caloricDensity", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
    val baseFormulaType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("baseFormulaType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val maxVolumeToDeliver: FHIRComponentFieldMeta[Option[Quantity]] =
      FHIRComponentFieldMeta("maxVolumeToDeliver", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
    val additiveProductName: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("additiveProductName", lTagOf[Option[String]], false, lTagOf[String])
    val routeofAdministration: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("routeofAdministration", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val baseFormulaProductName: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("baseFormulaProductName", lTagOf[Option[String]], false, lTagOf[String])
    val administrationInstruction: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("administrationInstruction", lTagOf[Option[String]], false, lTagOf[String])
    val administration: FHIRComponentFieldMeta[LitSeq[EnteralFormula.Administration]] =
      FHIRComponentFieldMeta(
        "administration",
        lTagOf[LitSeq[EnteralFormula.Administration]],
        false,
        lTagOf[EnteralFormula.Administration])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
      id,
      extension,
      additiveType,
      caloricDensity,
      baseFormulaType,
      modifierExtension,
      maxVolumeToDeliver,
      additiveProductName,
      routeofAdministration,
      baseFormulaProductName,
      administrationInstruction,
      administration
    )
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: EnteralFormula): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[CodeableConcept]](additiveType, t.additiveType),
      FHIRComponentField[Option[Quantity]](caloricDensity, t.caloricDensity),
      FHIRComponentField[Option[CodeableConcept]](baseFormulaType, t.baseFormulaType),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[Quantity]](maxVolumeToDeliver, t.maxVolumeToDeliver),
      FHIRComponentField[Option[String]](additiveProductName, t.additiveProductName),
      FHIRComponentField[Option[CodeableConcept]](routeofAdministration, t.routeofAdministration),
      FHIRComponentField[Option[String]](baseFormulaProductName, t.baseFormulaProductName),
      FHIRComponentField[Option[String]](administrationInstruction, t.administrationInstruction),
      FHIRComponentField[LitSeq[EnteralFormula.Administration]](administration, t.administration)
    )
    val baseType: CompanionFor[EnteralFormula] = this
    val thisName: String                       = "EnteralFormula"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[EnteralFormula] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new EnteralFormula(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[CodeableConcept]]("additiveType", Some(None)),
            cursor.decodeAs[Option[Quantity]]("caloricDensity", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("baseFormulaType", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Quantity]]("maxVolumeToDeliver", Some(None)),
            cursor.decodeAs[Option[String]]("additiveProductName", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("routeofAdministration", Some(None)),
            cursor.decodeAs[Option[String]]("baseFormulaProductName", Some(None)),
            cursor.decodeAs[Option[String]]("administrationInstruction", Some(None)),
            cursor.decodeAs[LitSeq[EnteralFormula.Administration]]("administration", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class EnteralFormula(
      override val id: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val additiveType: Option[CodeableConcept] = None,
      val caloricDensity: Option[Quantity] = None,
      val baseFormulaType: Option[CodeableConcept] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val maxVolumeToDeliver: Option[Quantity] = None,
      val additiveProductName: Option[String] = None,
      val routeofAdministration: Option[CodeableConcept] = None,
      val baseFormulaProductName: Option[String] = None,
      val administrationInstruction: Option[String] = None,
      val administration: LitSeq[EnteralFormula.Administration] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object OralDiet extends CompanionFor[OralDiet] {
    implicit def summonObjectAndCompanionOralDiet_1200010012(o: OralDiet): ObjectAndCompanion[OralDiet, OralDiet.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = OralDiet
    override type ParentType   = OralDiet
    override val parentType: CompanionFor[ResourceType] = OralDiet
    object Texture extends CompanionFor[Texture] {
      implicit def summonObjectAndCompanionTexture_1411370188(o: Texture): ObjectAndCompanion[Texture, Texture.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Texture
      override type ParentType   = Texture
      override val parentType: CompanionFor[ResourceType] = Texture
      def apply(
          id: Option[String] = None,
          modifier: Option[CodeableConcept] = None,
          foodType: Option[CodeableConcept] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Texture = new Texture(
        id,
        modifier,
        foodType,
        extension,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Texture): Option[(Option[String], Option[CodeableConcept], Option[CodeableConcept], LitSeq[Extension], LitSeq[Extension])] =
        Some((o.id, o.modifier, o.foodType, o.extension, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val modifier: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("modifier", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val foodType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("foodType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, modifier, foodType, extension, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Texture): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[CodeableConcept]](modifier, t.modifier),
        FHIRComponentField[Option[CodeableConcept]](foodType, t.foodType),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Texture] = this
      val thisName: String                = "Texture"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Texture] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Texture(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[CodeableConcept]]("modifier", Some(None)),
              cursor.decodeAs[Option[CodeableConcept]]("foodType", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Texture(
        override val id: Option[String] = None,
        val modifier: Option[CodeableConcept] = None,
        val foodType: Option[CodeableConcept] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object Nutrient extends CompanionFor[Nutrient] {
      implicit def summonObjectAndCompanionNutrient_2049768071(
          o: Nutrient): ObjectAndCompanion[Nutrient, Nutrient.type] = ObjectAndCompanion(o, this)
      override type ResourceType = Nutrient
      override type ParentType   = Nutrient
      override val parentType: CompanionFor[ResourceType] = Nutrient
      def apply(
          id: Option[String] = None,
          amount: Option[Quantity] = None,
          modifier: Option[CodeableConcept] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Nutrient = new Nutrient(
        id,
        amount,
        modifier,
        extension,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Nutrient): Option[(Option[String], Option[Quantity], Option[CodeableConcept], LitSeq[Extension], LitSeq[Extension])] =
        Some((o.id, o.amount, o.modifier, o.extension, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val amount: FHIRComponentFieldMeta[Option[Quantity]] =
        FHIRComponentFieldMeta("amount", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
      val modifier: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("modifier", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, amount, modifier, extension, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Nutrient): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[Quantity]](amount, t.amount),
        FHIRComponentField[Option[CodeableConcept]](modifier, t.modifier),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Nutrient] = this
      val thisName: String                 = "Nutrient"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Nutrient] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Nutrient(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[Quantity]]("amount", Some(None)),
              cursor.decodeAs[Option[CodeableConcept]]("modifier", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Nutrient(
        override val id: Option[String] = None,
        val amount: Option[Quantity] = None,
        val modifier: Option[CodeableConcept] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        `type`: LitSeq[CodeableConcept] = LitSeq.empty,
        schedule: LitSeq[Timing] = LitSeq.empty,
        extension: LitSeq[Extension] = LitSeq.empty,
        instruction: Option[String] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        fluidConsistencyType: LitSeq[CodeableConcept] = LitSeq.empty,
        texture: LitSeq[OralDiet.Texture] = LitSeq.empty,
        nutrient: LitSeq[OralDiet.Nutrient] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): OralDiet = new OralDiet(
      id,
      `type`,
      schedule,
      extension,
      instruction,
      modifierExtension,
      fluidConsistencyType,
      texture,
      nutrient,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: OralDiet): Option[(Option[String], LitSeq[CodeableConcept], LitSeq[Timing], LitSeq[Extension], Option[String], LitSeq[Extension], LitSeq[CodeableConcept], LitSeq[OralDiet.Texture], LitSeq[OralDiet.Nutrient])] =
      Some(
        (
          o.id,
          o.`type`,
          o.schedule,
          o.extension,
          o.instruction,
          o.modifierExtension,
          o.fluidConsistencyType,
          o.texture,
          o.nutrient))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val schedule: FHIRComponentFieldMeta[LitSeq[Timing]] =
      FHIRComponentFieldMeta("schedule", lTagOf[LitSeq[Timing]], false, lTagOf[Timing])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val instruction: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("instruction", lTagOf[Option[String]], false, lTagOf[String])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fluidConsistencyType: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("fluidConsistencyType", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val texture: FHIRComponentFieldMeta[LitSeq[OralDiet.Texture]] =
      FHIRComponentFieldMeta("texture", lTagOf[LitSeq[OralDiet.Texture]], false, lTagOf[OralDiet.Texture])
    val nutrient: FHIRComponentFieldMeta[LitSeq[OralDiet.Nutrient]] =
      FHIRComponentFieldMeta("nutrient", lTagOf[LitSeq[OralDiet.Nutrient]], false, lTagOf[OralDiet.Nutrient])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, `type`, schedule, extension, instruction, modifierExtension, fluidConsistencyType, texture, nutrient)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: OralDiet): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[LitSeq[Timing]](schedule, t.schedule),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[String]](instruction, t.instruction),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[CodeableConcept]](fluidConsistencyType, t.fluidConsistencyType),
      FHIRComponentField[LitSeq[OralDiet.Texture]](texture, t.texture),
      FHIRComponentField[LitSeq[OralDiet.Nutrient]](nutrient, t.nutrient)
    )
    val baseType: CompanionFor[OralDiet] = this
    val thisName: String                 = "OralDiet"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[OralDiet] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new OralDiet(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("type", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Timing]]("schedule", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("instruction", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("fluidConsistencyType", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[OralDiet.Texture]]("texture", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[OralDiet.Nutrient]]("nutrient", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class OralDiet(
      override val id: Option[String] = None,
      val `type`: LitSeq[CodeableConcept] = LitSeq.empty,
      val schedule: LitSeq[Timing] = LitSeq.empty,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val instruction: Option[String] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val fluidConsistencyType: LitSeq[CodeableConcept] = LitSeq.empty,
      val texture: LitSeq[OralDiet.Texture] = LitSeq.empty,
      val nutrient: LitSeq[OralDiet.Nutrient] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Supplement extends CompanionFor[Supplement] {
    implicit def summonObjectAndCompanionSupplement960121857(
        o: Supplement): ObjectAndCompanion[Supplement, Supplement.type] = ObjectAndCompanion(o, this)
    override type ResourceType = Supplement
    override type ParentType   = Supplement
    override val parentType: CompanionFor[ResourceType] = Supplement
    def apply(
        id: Option[String] = None,
        `type`: Option[CodeableConcept] = None,
        schedule: LitSeq[Timing] = LitSeq.empty,
        quantity: Option[Quantity] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        productName: Option[String] = None,
        instruction: Option[String] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Supplement = new Supplement(
      id,
      `type`,
      schedule,
      quantity,
      extension,
      productName,
      instruction,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Supplement): Option[(Option[String], Option[CodeableConcept], LitSeq[Timing], Option[Quantity], LitSeq[Extension], Option[String], Option[String], LitSeq[Extension])] =
      Some((o.id, o.`type`, o.schedule, o.quantity, o.extension, o.productName, o.instruction, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val schedule: FHIRComponentFieldMeta[LitSeq[Timing]] =
      FHIRComponentFieldMeta("schedule", lTagOf[LitSeq[Timing]], false, lTagOf[Timing])
    val quantity: FHIRComponentFieldMeta[Option[Quantity]] =
      FHIRComponentFieldMeta("quantity", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val productName: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("productName", lTagOf[Option[String]], false, lTagOf[String])
    val instruction: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("instruction", lTagOf[Option[String]], false, lTagOf[String])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, `type`, schedule, quantity, extension, productName, instruction, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Supplement): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[LitSeq[Timing]](schedule, t.schedule),
      FHIRComponentField[Option[Quantity]](quantity, t.quantity),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[String]](productName, t.productName),
      FHIRComponentField[Option[String]](instruction, t.instruction),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Supplement] = this
    val thisName: String                   = "Supplement"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Supplement] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Supplement(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
            cursor.decodeAs[LitSeq[Timing]]("schedule", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Quantity]]("quantity", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("productName", Some(None)),
            cursor.decodeAs[Option[String]]("instruction", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Supplement(
      override val id: Option[String] = None,
      val `type`: Option[CodeableConcept] = None,
      val schedule: LitSeq[Timing] = LitSeq.empty,
      val quantity: Option[Quantity] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val productName: Option[String] = None,
      val instruction: Option[String] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      status: REQUEST_STATUS,
      intent: REQUEST_INTENT,
      patient: Reference,
      orderer: Option[Reference] = None,
      language: Option[LANGUAGES] = None,
      dateTime: FHIRDateTime,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      encounter: Option[Reference] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      instantiates: LitSeq[UriStr] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      instantiatesUri: LitSeq[UriStr] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      allergyIntolerance: LitSeq[Reference] = LitSeq.empty,
      excludeFoodModifier: LitSeq[CodeableConcept] = LitSeq.empty,
      instantiatesCanonical: LitSeq[Canonical] = LitSeq.empty,
      foodPreferenceModifier: LitSeq[CodeableConcept] = LitSeq.empty,
      supplement: LitSeq[NutritionOrder.Supplement] = LitSeq.empty,
      oralDiet: Option[NutritionOrder.OralDiet] = None,
      enteralFormula: Option[NutritionOrder.EnteralFormula] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): NutritionOrder = new NutritionOrder(
    id,
    meta,
    text,
    note,
    status,
    intent,
    patient,
    orderer,
    language,
    dateTime,
    contained,
    extension,
    encounter,
    identifier,
    instantiates,
    implicitRules,
    instantiatesUri,
    modifierExtension,
    allergyIntolerance,
    excludeFoodModifier,
    instantiatesCanonical,
    foodPreferenceModifier,
    supplement,
    oralDiet,
    enteralFormula,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val status: FHIRComponentFieldMeta[REQUEST_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[REQUEST_STATUS], false, lTagOf[REQUEST_STATUS])
  val intent: FHIRComponentFieldMeta[REQUEST_INTENT] =
    FHIRComponentFieldMeta("intent", lTagOf[REQUEST_INTENT], false, lTagOf[REQUEST_INTENT])
  val patient: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("patient", lTagOf[Reference], false, lTagOf[Reference])
  val orderer: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("orderer", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val dateTime: FHIRComponentFieldMeta[FHIRDateTime] =
    FHIRComponentFieldMeta("dateTime", lTagOf[FHIRDateTime], false, lTagOf[FHIRDateTime])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val encounter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("encounter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val instantiates: FHIRComponentFieldMeta[LitSeq[UriStr]] =
    FHIRComponentFieldMeta("instantiates", lTagOf[LitSeq[UriStr]], false, lTagOf[UriStr])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val instantiatesUri: FHIRComponentFieldMeta[LitSeq[UriStr]] =
    FHIRComponentFieldMeta("instantiatesUri", lTagOf[LitSeq[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val allergyIntolerance: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("allergyIntolerance", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val excludeFoodModifier: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("excludeFoodModifier", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val instantiatesCanonical: FHIRComponentFieldMeta[LitSeq[Canonical]] =
    FHIRComponentFieldMeta("instantiatesCanonical", lTagOf[LitSeq[Canonical]], false, lTagOf[Canonical])
  val foodPreferenceModifier: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("foodPreferenceModifier", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val supplement: FHIRComponentFieldMeta[LitSeq[NutritionOrder.Supplement]] =
    FHIRComponentFieldMeta(
      "supplement",
      lTagOf[LitSeq[NutritionOrder.Supplement]],
      false,
      lTagOf[NutritionOrder.Supplement])
  val oralDiet: FHIRComponentFieldMeta[Option[NutritionOrder.OralDiet]] =
    FHIRComponentFieldMeta("oralDiet", lTagOf[Option[NutritionOrder.OralDiet]], false, lTagOf[NutritionOrder.OralDiet])
  val enteralFormula: FHIRComponentFieldMeta[Option[NutritionOrder.EnteralFormula]] =
    FHIRComponentFieldMeta(
      "enteralFormula",
      lTagOf[Option[NutritionOrder.EnteralFormula]],
      false,
      lTagOf[NutritionOrder.EnteralFormula])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    note,
    status,
    intent,
    patient,
    orderer,
    language,
    dateTime,
    contained,
    extension,
    encounter,
    identifier,
    instantiates,
    implicitRules,
    instantiatesUri,
    modifierExtension,
    allergyIntolerance,
    excludeFoodModifier,
    instantiatesCanonical,
    foodPreferenceModifier,
    supplement,
    oralDiet,
    enteralFormula
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: NutritionOrder): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[LitSeq[Annotation]](note, t.note),
    FHIRComponentField[REQUEST_STATUS](status, t.status),
    FHIRComponentField[REQUEST_INTENT](intent, t.intent),
    FHIRComponentField[Reference](patient, t.patient),
    FHIRComponentField[Option[Reference]](orderer, t.orderer),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[FHIRDateTime](dateTime, t.dateTime),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Reference]](encounter, t.encounter),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[LitSeq[UriStr]](instantiates, t.instantiates),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[UriStr]](instantiatesUri, t.instantiatesUri),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[Reference]](allergyIntolerance, t.allergyIntolerance),
    FHIRComponentField[LitSeq[CodeableConcept]](excludeFoodModifier, t.excludeFoodModifier),
    FHIRComponentField[LitSeq[Canonical]](instantiatesCanonical, t.instantiatesCanonical),
    FHIRComponentField[LitSeq[CodeableConcept]](foodPreferenceModifier, t.foodPreferenceModifier),
    FHIRComponentField[LitSeq[NutritionOrder.Supplement]](supplement, t.supplement),
    FHIRComponentField[Option[NutritionOrder.OralDiet]](oralDiet, t.oralDiet),
    FHIRComponentField[Option[NutritionOrder.EnteralFormula]](enteralFormula, t.enteralFormula)
  )
  def extractId(t: NutritionOrder): Option[String]                                    = t.id
  def extractMeta(t: NutritionOrder): Option[Meta]                                    = t.meta
  def extractText(t: NutritionOrder): Option[Narrative]                               = t.text
  def extractNote(t: NutritionOrder): LitSeq[Annotation]                              = t.note
  def extractStatus(t: NutritionOrder): REQUEST_STATUS                                = t.status
  def extractIntent(t: NutritionOrder): REQUEST_INTENT                                = t.intent
  def extractPatient(t: NutritionOrder): Reference                                    = t.patient
  def extractOrderer(t: NutritionOrder): Option[Reference]                            = t.orderer
  def extractLanguage(t: NutritionOrder): Option[LANGUAGES]                           = t.language
  def extractDateTime(t: NutritionOrder): FHIRDateTime                                = t.dateTime
  def extractContained(t: NutritionOrder): LitSeq[Resource]                           = t.contained
  def extractExtension(t: NutritionOrder): LitSeq[Extension]                          = t.extension
  def extractEncounter(t: NutritionOrder): Option[Reference]                          = t.encounter
  def extractIdentifier(t: NutritionOrder): LitSeq[Identifier]                        = t.identifier
  def extractInstantiates(t: NutritionOrder): LitSeq[UriStr]                          = t.instantiates
  def extractImplicitRules(t: NutritionOrder): Option[UriStr]                         = t.implicitRules
  def extractInstantiatesUri(t: NutritionOrder): LitSeq[UriStr]                       = t.instantiatesUri
  def extractModifierExtension(t: NutritionOrder): LitSeq[Extension]                  = t.modifierExtension
  def extractAllergyIntolerance(t: NutritionOrder): LitSeq[Reference]                 = t.allergyIntolerance
  def extractExcludeFoodModifier(t: NutritionOrder): LitSeq[CodeableConcept]          = t.excludeFoodModifier
  def extractInstantiatesCanonical(t: NutritionOrder): LitSeq[Canonical]              = t.instantiatesCanonical
  def extractFoodPreferenceModifier(t: NutritionOrder): LitSeq[CodeableConcept]       = t.foodPreferenceModifier
  def extractSupplement(t: NutritionOrder): LitSeq[NutritionOrder.Supplement]         = t.supplement
  def extractOralDiet(t: NutritionOrder): Option[NutritionOrder.OralDiet]             = t.oralDiet
  def extractEnteralFormula(t: NutritionOrder): Option[NutritionOrder.EnteralFormula] = t.enteralFormula
  override val thisName: String                                                       = "NutritionOrder"
  override val searchParams: Map[String, NutritionOrder => Seq[Any]] = Map(
    "supplement"             -> (obj => obj.supplement.flatMap(_.`type`).toSeq),
    "provider"               -> (obj => obj.orderer.toSeq),
    "datetime"               -> (obj => Seq(obj.dateTime)),
    "additive"               -> (obj => obj.enteralFormula.flatMap(_.additiveType).toSeq),
    "oraldiet"               -> (obj => obj.oralDiet.toSeq.flatMap(_.`type`).toSeq),
    "formula"                -> (obj => obj.enteralFormula.flatMap(_.baseFormulaType).toSeq),
    "status"                 -> (obj => Seq(obj.status)),
    "encounter"              -> (obj => obj.encounter.toSeq),
    "instantiates-uri"       -> (obj => obj.instantiatesUri.toSeq),
    "identifier"             -> (obj => obj.identifier.toSeq),
    "instantiates-canonical" -> (obj => obj.instantiatesCanonical.toSeq),
    "patient"                -> (obj => Seq(obj.patient))
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[NutritionOrder] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new NutritionOrder(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[REQUEST_STATUS]("status", None),
          cursor.decodeAs[REQUEST_INTENT]("intent", None),
          cursor.decodeAs[Reference]("patient", None),
          cursor.decodeAs[Option[Reference]]("orderer", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[FHIRDateTime]("dateTime", None),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[UriStr]]("instantiates", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[UriStr]]("instantiatesUri", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("allergyIntolerance", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("excludeFoodModifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Canonical]]("instantiatesCanonical", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("foodPreferenceModifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[NutritionOrder.Supplement]]("supplement", Some(LitSeq.empty)),
          cursor.decodeAs[Option[NutritionOrder.OralDiet]]("oralDiet", Some(None)),
          cursor.decodeAs[Option[NutritionOrder.EnteralFormula]]("enteralFormula", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields note, status, intent, patient, orderer, dateTime, encounter, identifier, instantiates, instantiatesUri, allergyIntolerance, excludeFoodModifier, instantiatesCanonical, foodPreferenceModifier, supplement, oralDiet, enteralFormula.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param note - Comments made about the {{title}} by the requester, performer, subject or other participants.
  * @param status - The workflow status of the nutrition order/request.
  * @param intent - Indicates the level of authority/intentionality associated with the NutrionOrder and where the request fits into the workflow chain.
  * @param patient - The person (patient) who needs the nutrition order for an oral diet, nutritional supplement and/or enteral or formula feeding.
  * @param orderer - The practitioner that holds legal responsibility for ordering the diet, nutritional supplement, or formula feedings.
  * @param language - The base language in which the resource is written.
  * @param dateTime - The date and time that this nutrition order was requested.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param encounter - An encounter that provides additional information about the healthcare context in which this request is made.
  * @param identifier - Identifiers assigned to this order by the order sender or by the order receiver.
  * @param instantiates - The URL pointing to a protocol, guideline, orderset or other definition that is adhered to in whole or in part by this NutritionOrder.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param instantiatesUri - The URL pointing to an externally maintained protocol, guideline, orderset or other definition that is adhered to in whole or in part by this NutritionOrder.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param allergyIntolerance - A link to a record of allergies or intolerances  which should be included in the nutrition order.
  * @param excludeFoodModifier - This modifier is used to convey Order-specific modifier about the type of oral food or oral fluids that should not be given. These can be derived from patient allergies, intolerances, or preferences such as No Red Meat, No Soy or No Wheat or  Gluten-Free.  While it should not be necessary to repeat allergy or intolerance information captured in the referenced AllergyIntolerance resource in the excludeFoodModifier, this element may be used to convey additional specificity related to foods that should be eliminated from the patient’s diet for any reason.  This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings.
  * @param instantiatesCanonical - The URL pointing to a FHIR-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this NutritionOrder.
  * @param foodPreferenceModifier - This modifier is used to convey order-specific modifiers about the type of food that should be given. These can be derived from patient allergies, intolerances, or preferences such as Halal, Vegan or Kosher. This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings.
  * @param supplement - Oral nutritional products given in order to add further nutritional value to the patient's diet.
  * @param oralDiet - Diet given orally in contrast to enteral (tube) feeding.
  * @param enteralFormula - Feeding provided through the gastrointestinal tract via a tube, catheter, or stoma that delivers nutrition distal to the oral cavity.
  */
@POJOBoilerplate
class NutritionOrder(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val note: LitSeq[Annotation] = LitSeq.empty,
    val status: REQUEST_STATUS,
    val intent: REQUEST_INTENT,
    val patient: Reference,
    val orderer: Option[Reference] = None,
    override val language: Option[LANGUAGES] = None,
    val dateTime: FHIRDateTime,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val encounter: Option[Reference] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val instantiates: LitSeq[UriStr] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    val instantiatesUri: LitSeq[UriStr] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val allergyIntolerance: LitSeq[Reference] = LitSeq.empty,
    val excludeFoodModifier: LitSeq[CodeableConcept] = LitSeq.empty,
    val instantiatesCanonical: LitSeq[Canonical] = LitSeq.empty,
    val foodPreferenceModifier: LitSeq[CodeableConcept] = LitSeq.empty,
    val supplement: LitSeq[NutritionOrder.Supplement] = LitSeq.empty,
    val oralDiet: Option[NutritionOrder.OralDiet] = None,
    val enteralFormula: Option[NutritionOrder.EnteralFormula] = None,
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
  override val thisTypeName: String = "NutritionOrder"
}
