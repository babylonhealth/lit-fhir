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

object MedicinalProductIngredient extends CompanionFor[MedicinalProductIngredient] {
  implicit def summonObjectAndCompanionMedicinalProductIngredient1318706559(
      o: MedicinalProductIngredient): ObjectAndCompanion[MedicinalProductIngredient, MedicinalProductIngredient.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = MedicinalProductIngredient
  override type ParentType   = MedicinalProductIngredient
  override val baseType: CompanionFor[ResourceType] = MedicinalProductIngredient
  override val parentType: CompanionFor[ParentType] = MedicinalProductIngredient
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/MedicinalProductIngredient")
  object SpecifiedSubstance extends CompanionFor[SpecifiedSubstance] {
    implicit def summonObjectAndCompanionSpecifiedSubstance_1140497452(
        o: SpecifiedSubstance): ObjectAndCompanion[SpecifiedSubstance, SpecifiedSubstance.type] = ObjectAndCompanion(o, this)
    override type ResourceType = SpecifiedSubstance
    override type ParentType   = SpecifiedSubstance
    override val parentType: CompanionFor[ResourceType] = SpecifiedSubstance
    object Strength extends CompanionFor[Strength] {
      implicit def summonObjectAndCompanionStrength_1845082774(o: Strength): ObjectAndCompanion[Strength, Strength.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Strength
      override type ParentType   = Strength
      override val parentType: CompanionFor[ResourceType] = Strength
      object ReferenceStrength extends CompanionFor[ReferenceStrength] {
        implicit def summonObjectAndCompanionReferenceStrength356770924(
            o: ReferenceStrength): ObjectAndCompanion[ReferenceStrength, ReferenceStrength.type] = ObjectAndCompanion(o, this)
        override type ResourceType = ReferenceStrength
        override type ParentType   = ReferenceStrength
        override val parentType: CompanionFor[ResourceType] = ReferenceStrength
        def apply(
            id: Option[String] = None,
            country: LitSeq[CodeableConcept] = LitSeq.empty,
            strength: Ratio,
            extension: LitSeq[Extension] = LitSeq.empty,
            substance: Option[CodeableConcept] = None,
            strengthLowLimit: Option[Ratio] = None,
            measurementPoint: Option[String] = None,
            modifierExtension: LitSeq[Extension] = LitSeq.empty,
            primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
        ): ReferenceStrength = new ReferenceStrength(
          id,
          country,
          strength,
          extension,
          substance,
          strengthLowLimit,
          measurementPoint,
          modifierExtension,
          primitiveAttributes = primitiveAttributes
        )
        def unapply(
            o: ReferenceStrength): Option[(Option[String], LitSeq[CodeableConcept], Ratio, LitSeq[Extension], Option[CodeableConcept], Option[Ratio], Option[String], LitSeq[Extension])] =
          Some(
            (o.id, o.country, o.strength, o.extension, o.substance, o.strengthLowLimit, o.measurementPoint, o.modifierExtension))
        val id: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
        val country: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
          FHIRComponentFieldMeta("country", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
        val strength: FHIRComponentFieldMeta[Ratio] =
          FHIRComponentFieldMeta("strength", lTagOf[Ratio], false, lTagOf[Ratio])
        val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val substance: FHIRComponentFieldMeta[Option[CodeableConcept]] =
          FHIRComponentFieldMeta("substance", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
        val strengthLowLimit: FHIRComponentFieldMeta[Option[Ratio]] =
          FHIRComponentFieldMeta("strengthLowLimit", lTagOf[Option[Ratio]], false, lTagOf[Ratio])
        val measurementPoint: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("measurementPoint", lTagOf[Option[String]], false, lTagOf[String])
        val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
          Seq(id, country, strength, extension, substance, strengthLowLimit, measurementPoint, modifierExtension)
        override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
        override def fields(t: ReferenceStrength): Seq[FHIRComponentField[_]] = Seq(
          FHIRComponentField[Option[String]](id, t.id),
          FHIRComponentField[LitSeq[CodeableConcept]](country, t.country),
          FHIRComponentField[Ratio](strength, t.strength),
          FHIRComponentField[LitSeq[Extension]](extension, t.extension),
          FHIRComponentField[Option[CodeableConcept]](substance, t.substance),
          FHIRComponentField[Option[Ratio]](strengthLowLimit, t.strengthLowLimit),
          FHIRComponentField[Option[String]](measurementPoint, t.measurementPoint),
          FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
        )
        val baseType: CompanionFor[ReferenceStrength] = this
        val thisName: String                          = "ReferenceStrength"
        def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ReferenceStrength] =
          checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
            Try(
              new ReferenceStrength(
                cursor.decodeAs[Option[String]]("id", Some(None)),
                cursor.decodeAs[LitSeq[CodeableConcept]]("country", Some(LitSeq.empty)),
                cursor.decodeAs[Ratio]("strength", None),
                cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
                cursor.decodeAs[Option[CodeableConcept]]("substance", Some(None)),
                cursor.decodeAs[Option[Ratio]]("strengthLowLimit", Some(None)),
                cursor.decodeAs[Option[String]]("measurementPoint", Some(None)),
                cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
                decodeAttributes(cursor)
              )
            ))
      }
      @POJOBoilerplate
      class ReferenceStrength(
          override val id: Option[String] = None,
          val country: LitSeq[CodeableConcept] = LitSeq.empty,
          val strength: Ratio,
          override val extension: LitSeq[Extension] = LitSeq.empty,
          val substance: Option[CodeableConcept] = None,
          val strengthLowLimit: Option[Ratio] = None,
          val measurementPoint: Option[String] = None,
          override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
          override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
          extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
      def apply(
          id: Option[String] = None,
          country: LitSeq[CodeableConcept] = LitSeq.empty,
          extension: LitSeq[Extension] = LitSeq.empty,
          presentation: Ratio,
          concentration: Option[Ratio] = None,
          measurementPoint: Option[String] = None,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          presentationLowLimit: Option[Ratio] = None,
          concentrationLowLimit: Option[Ratio] = None,
          referenceStrength: LitSeq[Strength.ReferenceStrength] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Strength = new Strength(
        id,
        country,
        extension,
        presentation,
        concentration,
        measurementPoint,
        modifierExtension,
        presentationLowLimit,
        concentrationLowLimit,
        referenceStrength,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Strength): Option[(Option[String], LitSeq[CodeableConcept], LitSeq[Extension], Ratio, Option[Ratio], Option[String], LitSeq[Extension], Option[Ratio], Option[Ratio], LitSeq[Strength.ReferenceStrength])] =
        Some(
          (
            o.id,
            o.country,
            o.extension,
            o.presentation,
            o.concentration,
            o.measurementPoint,
            o.modifierExtension,
            o.presentationLowLimit,
            o.concentrationLowLimit,
            o.referenceStrength))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val country: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
        FHIRComponentFieldMeta("country", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val presentation: FHIRComponentFieldMeta[Ratio] =
        FHIRComponentFieldMeta("presentation", lTagOf[Ratio], false, lTagOf[Ratio])
      val concentration: FHIRComponentFieldMeta[Option[Ratio]] =
        FHIRComponentFieldMeta("concentration", lTagOf[Option[Ratio]], false, lTagOf[Ratio])
      val measurementPoint: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("measurementPoint", lTagOf[Option[String]], false, lTagOf[String])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val presentationLowLimit: FHIRComponentFieldMeta[Option[Ratio]] =
        FHIRComponentFieldMeta("presentationLowLimit", lTagOf[Option[Ratio]], false, lTagOf[Ratio])
      val concentrationLowLimit: FHIRComponentFieldMeta[Option[Ratio]] =
        FHIRComponentFieldMeta("concentrationLowLimit", lTagOf[Option[Ratio]], false, lTagOf[Ratio])
      val referenceStrength: FHIRComponentFieldMeta[LitSeq[Strength.ReferenceStrength]] =
        FHIRComponentFieldMeta(
          "referenceStrength",
          lTagOf[LitSeq[Strength.ReferenceStrength]],
          false,
          lTagOf[Strength.ReferenceStrength])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
        id,
        country,
        extension,
        presentation,
        concentration,
        measurementPoint,
        modifierExtension,
        presentationLowLimit,
        concentrationLowLimit,
        referenceStrength)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Strength): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[LitSeq[CodeableConcept]](country, t.country),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Ratio](presentation, t.presentation),
        FHIRComponentField[Option[Ratio]](concentration, t.concentration),
        FHIRComponentField[Option[String]](measurementPoint, t.measurementPoint),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
        FHIRComponentField[Option[Ratio]](presentationLowLimit, t.presentationLowLimit),
        FHIRComponentField[Option[Ratio]](concentrationLowLimit, t.concentrationLowLimit),
        FHIRComponentField[LitSeq[Strength.ReferenceStrength]](referenceStrength, t.referenceStrength)
      )
      val baseType: CompanionFor[Strength] = this
      val thisName: String                 = "Strength"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Strength] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Strength(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[LitSeq[CodeableConcept]]("country", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Ratio]("presentation", None),
              cursor.decodeAs[Option[Ratio]]("concentration", Some(None)),
              cursor.decodeAs[Option[String]]("measurementPoint", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[Ratio]]("presentationLowLimit", Some(None)),
              cursor.decodeAs[Option[Ratio]]("concentrationLowLimit", Some(None)),
              cursor.decodeAs[LitSeq[Strength.ReferenceStrength]]("referenceStrength", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Strength(
        override val id: Option[String] = None,
        val country: LitSeq[CodeableConcept] = LitSeq.empty,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val presentation: Ratio,
        val concentration: Option[Ratio] = None,
        val measurementPoint: Option[String] = None,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        val presentationLowLimit: Option[Ratio] = None,
        val concentrationLowLimit: Option[Ratio] = None,
        val referenceStrength: LitSeq[Strength.ReferenceStrength] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        code: CodeableConcept,
        group: CodeableConcept,
        extension: LitSeq[Extension] = LitSeq.empty,
        confidentiality: Option[CodeableConcept] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        strength: LitSeq[SpecifiedSubstance.Strength] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): SpecifiedSubstance = new SpecifiedSubstance(
      id,
      code,
      group,
      extension,
      confidentiality,
      modifierExtension,
      strength,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: SpecifiedSubstance): Option[(Option[String], CodeableConcept, CodeableConcept, LitSeq[Extension], Option[CodeableConcept], LitSeq[Extension], LitSeq[SpecifiedSubstance.Strength])] =
      Some((o.id, o.code, o.group, o.extension, o.confidentiality, o.modifierExtension, o.strength))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val code: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("code", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val group: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("group", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val confidentiality: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("confidentiality", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val strength: FHIRComponentFieldMeta[LitSeq[SpecifiedSubstance.Strength]] =
      FHIRComponentFieldMeta("strength", lTagOf[LitSeq[SpecifiedSubstance.Strength]], false, lTagOf[SpecifiedSubstance.Strength])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, code, group, extension, confidentiality, modifierExtension, strength)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: SpecifiedSubstance): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[CodeableConcept](code, t.code),
      FHIRComponentField[CodeableConcept](group, t.group),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[CodeableConcept]](confidentiality, t.confidentiality),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[SpecifiedSubstance.Strength]](strength, t.strength)
    )
    val baseType: CompanionFor[SpecifiedSubstance] = this
    val thisName: String                           = "SpecifiedSubstance"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[SpecifiedSubstance] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new SpecifiedSubstance(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[CodeableConcept]("code", None),
            cursor.decodeAs[CodeableConcept]("group", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[CodeableConcept]]("confidentiality", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[SpecifiedSubstance.Strength]]("strength", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class SpecifiedSubstance(
      override val id: Option[String] = None,
      val code: CodeableConcept,
      val group: CodeableConcept,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val confidentiality: Option[CodeableConcept] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val strength: LitSeq[SpecifiedSubstance.Strength] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Substance extends CompanionFor[Substance] {
    implicit def summonObjectAndCompanionSubstance_1140497452(o: Substance): ObjectAndCompanion[Substance, Substance.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Substance
    override type ParentType   = Substance
    override val parentType: CompanionFor[ResourceType] = Substance
    def apply(
        id: Option[String] = None,
        code: CodeableConcept,
        strength: LitSeq[MedicinalProductIngredient.SpecifiedSubstance.Strength] = LitSeq.empty,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Substance = new Substance(
      id,
      code,
      strength,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Substance): Option[(Option[String], CodeableConcept, LitSeq[MedicinalProductIngredient.SpecifiedSubstance.Strength], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.code, o.strength, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val code: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("code", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val strength: FHIRComponentFieldMeta[LitSeq[MedicinalProductIngredient.SpecifiedSubstance.Strength]] =
      FHIRComponentFieldMeta(
        "strength",
        lTagOf[LitSeq[MedicinalProductIngredient.SpecifiedSubstance.Strength]],
        false,
        lTagOf[MedicinalProductIngredient.SpecifiedSubstance.Strength]
      )
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, code, strength, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Substance): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[CodeableConcept](code, t.code),
      FHIRComponentField[LitSeq[MedicinalProductIngredient.SpecifiedSubstance.Strength]](strength, t.strength),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Substance] = this
    val thisName: String                  = "Substance"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Substance] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Substance(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[CodeableConcept]("code", None),
            cursor.decodeAs[LitSeq[MedicinalProductIngredient.SpecifiedSubstance.Strength]]("strength", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Substance(
      override val id: Option[String] = None,
      val code: CodeableConcept,
      val strength: LitSeq[MedicinalProductIngredient.SpecifiedSubstance.Strength] = LitSeq.empty,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      role: CodeableConcept,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      identifier: Option[Identifier] = None,
      manufacturer: LitSeq[Reference] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      allergenicIndicator: Option[Boolean] = None,
      substance: Option[MedicinalProductIngredient.Substance] = None,
      specifiedSubstance: LitSeq[MedicinalProductIngredient.SpecifiedSubstance] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): MedicinalProductIngredient = new MedicinalProductIngredient(
    id,
    meta,
    text,
    role,
    language,
    contained,
    extension,
    identifier,
    manufacturer,
    implicitRules,
    modifierExtension,
    allergenicIndicator,
    substance,
    specifiedSubstance,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val role: FHIRComponentFieldMeta[CodeableConcept] =
    FHIRComponentFieldMeta("role", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[Option[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
  val manufacturer: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("manufacturer", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val allergenicIndicator: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("allergenicIndicator", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val substance: FHIRComponentFieldMeta[Option[MedicinalProductIngredient.Substance]] =
    FHIRComponentFieldMeta(
      "substance",
      lTagOf[Option[MedicinalProductIngredient.Substance]],
      false,
      lTagOf[MedicinalProductIngredient.Substance])
  val specifiedSubstance: FHIRComponentFieldMeta[LitSeq[MedicinalProductIngredient.SpecifiedSubstance]] =
    FHIRComponentFieldMeta(
      "specifiedSubstance",
      lTagOf[LitSeq[MedicinalProductIngredient.SpecifiedSubstance]],
      false,
      lTagOf[MedicinalProductIngredient.SpecifiedSubstance])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    role,
    language,
    contained,
    extension,
    identifier,
    manufacturer,
    implicitRules,
    modifierExtension,
    allergenicIndicator,
    substance,
    specifiedSubstance
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: MedicinalProductIngredient): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[CodeableConcept](role, t.role),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Identifier]](identifier, t.identifier),
    FHIRComponentField[LitSeq[Reference]](manufacturer, t.manufacturer),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Option[Boolean]](allergenicIndicator, t.allergenicIndicator),
    FHIRComponentField[Option[MedicinalProductIngredient.Substance]](substance, t.substance),
    FHIRComponentField[LitSeq[MedicinalProductIngredient.SpecifiedSubstance]](specifiedSubstance, t.specifiedSubstance)
  )
  def extractId(t: MedicinalProductIngredient): Option[String]                                      = t.id
  def extractMeta(t: MedicinalProductIngredient): Option[Meta]                                      = t.meta
  def extractText(t: MedicinalProductIngredient): Option[Narrative]                                 = t.text
  def extractRole(t: MedicinalProductIngredient): CodeableConcept                                   = t.role
  def extractLanguage(t: MedicinalProductIngredient): Option[LANGUAGES]                             = t.language
  def extractContained(t: MedicinalProductIngredient): LitSeq[Resource]                             = t.contained
  def extractExtension(t: MedicinalProductIngredient): LitSeq[Extension]                            = t.extension
  def extractIdentifier(t: MedicinalProductIngredient): Option[Identifier]                          = t.identifier
  def extractManufacturer(t: MedicinalProductIngredient): LitSeq[Reference]                         = t.manufacturer
  def extractImplicitRules(t: MedicinalProductIngredient): Option[UriStr]                           = t.implicitRules
  def extractModifierExtension(t: MedicinalProductIngredient): LitSeq[Extension]                    = t.modifierExtension
  def extractAllergenicIndicator(t: MedicinalProductIngredient): Option[Boolean]                    = t.allergenicIndicator
  def extractSubstance(t: MedicinalProductIngredient): Option[MedicinalProductIngredient.Substance] = t.substance
  def extractSpecifiedSubstance(t: MedicinalProductIngredient): LitSeq[MedicinalProductIngredient.SpecifiedSubstance] =
    t.specifiedSubstance
  override val thisName: String = "MedicinalProductIngredient"
  def unapply(
      o: MedicinalProductIngredient): Option[(Option[String], Option[Meta], Option[Narrative], CodeableConcept, Option[LANGUAGES], LitSeq[Resource], LitSeq[Extension], Option[Identifier], LitSeq[Reference], Option[UriStr], LitSeq[Extension], Option[Boolean], Option[MedicinalProductIngredient.Substance], LitSeq[MedicinalProductIngredient.SpecifiedSubstance])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.role,
        o.language,
        o.contained,
        o.extension,
        o.identifier,
        o.manufacturer,
        o.implicitRules,
        o.modifierExtension,
        o.allergenicIndicator,
        o.substance,
        o.specifiedSubstance))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[MedicinalProductIngredient] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new MedicinalProductIngredient(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[CodeableConcept]("role", None),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Identifier]]("identifier", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("manufacturer", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Boolean]]("allergenicIndicator", Some(None)),
          cursor.decodeAs[Option[MedicinalProductIngredient.Substance]]("substance", Some(None)),
          cursor.decodeAs[LitSeq[MedicinalProductIngredient.SpecifiedSubstance]]("specifiedSubstance", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** An ingredient of a manufactured item or pharmaceutical product.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields role, identifier, manufacturer, allergenicIndicator, substance, specifiedSubstance.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *     not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *     resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail
  *     to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should
  *     be represented in the narrative to ensure clinical safety.
  * @param role
  *   - Ingredient role e.g. Active ingredient, excipient.
  * @param language
  *   - The base language in which the resource is written.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *     identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *     of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *     Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *     of the extension.
  * @param identifier
  *   - The identifier(s) of this Ingredient that are assigned by business processes and/or used to refer to it when a direct URL
  *     reference to the resource itself is not appropriate.
  * @param manufacturer
  *   - Manufacturer of this Ingredient.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *     processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *     other profiles etc.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *     the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *     Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *     strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *     extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *     processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of
  *     any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param allergenicIndicator
  *   - If the ingredient is a known or suspected allergen.
  * @param substance
  *   - The ingredient substance.
  * @param specifiedSubstance
  *   - A specified substance that comprises this ingredient.
  */
@POJOBoilerplate
class MedicinalProductIngredient(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val role: CodeableConcept,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val identifier: Option[Identifier] = None,
    val manufacturer: LitSeq[Reference] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val allergenicIndicator: Option[Boolean] = None,
    val substance: Option[MedicinalProductIngredient.Substance] = None,
    val specifiedSubstance: LitSeq[MedicinalProductIngredient.SpecifiedSubstance] = LitSeq.empty,
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
      primitiveAttributes = primitiveAttributes
    ) {
  override val thisTypeName: String = "MedicinalProductIngredient"
}
