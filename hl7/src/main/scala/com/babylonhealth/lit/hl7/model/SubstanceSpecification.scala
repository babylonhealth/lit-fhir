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

object SubstanceSpecification extends CompanionFor[SubstanceSpecification] {
  implicit def summonObjectAndCompanionSubstanceSpecification_326571096(
      o: SubstanceSpecification): ObjectAndCompanion[SubstanceSpecification, SubstanceSpecification.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = SubstanceSpecification
  override type ParentType   = SubstanceSpecification
  override val baseType: CompanionFor[ResourceType] = SubstanceSpecification
  override val parentType: CompanionFor[ParentType] = SubstanceSpecification
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/SubstanceSpecification")
  object Structure extends CompanionFor[Structure] {
    implicit def summonObjectAndCompanionStructure_1349166298(o: Structure): ObjectAndCompanion[Structure, Structure.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Structure
    override type ParentType   = Structure
    override val parentType: CompanionFor[ResourceType] = Structure
    object Representation extends CompanionFor[Representation] {
      implicit def summonObjectAndCompanionRepresentation1474906169(
          o: Representation): ObjectAndCompanion[Representation, Representation.type] = ObjectAndCompanion(o, this)
      override type ResourceType = Representation
      override type ParentType   = Representation
      override val parentType: CompanionFor[ResourceType] = Representation
      def apply(
          id: Option[String] = None,
          `type`: Option[CodeableConcept] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          attachment: Option[Attachment] = None,
          representation: Option[String] = None,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Representation = new Representation(
        id,
        `type`,
        extension,
        attachment,
        representation,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Representation): Option[(Option[String], Option[CodeableConcept], LitSeq[Extension], Option[Attachment], Option[String], LitSeq[Extension])] =
        Some((o.id, o.`type`, o.extension, o.attachment, o.representation, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val attachment: FHIRComponentFieldMeta[Option[Attachment]] =
        FHIRComponentFieldMeta("attachment", lTagOf[Option[Attachment]], false, lTagOf[Attachment])
      val representation: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("representation", lTagOf[Option[String]], false, lTagOf[String])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, `type`, extension, attachment, representation, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Representation): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[Attachment]](attachment, t.attachment),
        FHIRComponentField[Option[String]](representation, t.representation),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Representation] = this
      val thisName: String                       = "Representation"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Representation] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Representation(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[Attachment]]("attachment", Some(None)),
              cursor.decodeAs[Option[String]]("representation", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Representation(
        override val id: Option[String] = None,
        val `type`: Option[CodeableConcept] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val attachment: Option[Attachment] = None,
        val representation: Option[String] = None,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object Isotope extends CompanionFor[Isotope] {
      implicit def summonObjectAndCompanionIsotope1474906169(o: Isotope): ObjectAndCompanion[Isotope, Isotope.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Isotope
      override type ParentType   = Isotope
      override val parentType: CompanionFor[ResourceType] = Isotope
      object MolecularWeight extends CompanionFor[MolecularWeight] {
        implicit def summonObjectAndCompanionMolecularWeight_1740137968(
            o: MolecularWeight): ObjectAndCompanion[MolecularWeight, MolecularWeight.type] = ObjectAndCompanion(o, this)
        override type ResourceType = MolecularWeight
        override type ParentType   = MolecularWeight
        override val parentType: CompanionFor[ResourceType] = MolecularWeight
        def apply(
            id: Option[String] = None,
            `type`: Option[CodeableConcept] = None,
            method: Option[CodeableConcept] = None,
            amount: Option[Quantity] = None,
            extension: LitSeq[Extension] = LitSeq.empty,
            modifierExtension: LitSeq[Extension] = LitSeq.empty,
            primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
        ): MolecularWeight = new MolecularWeight(
          id,
          `type`,
          method,
          amount,
          extension,
          modifierExtension,
          primitiveAttributes = primitiveAttributes
        )
        def unapply(
            o: MolecularWeight): Option[(Option[String], Option[CodeableConcept], Option[CodeableConcept], Option[Quantity], LitSeq[Extension], LitSeq[Extension])] =
          Some((o.id, o.`type`, o.method, o.amount, o.extension, o.modifierExtension))
        val id: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
        val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
          FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
        val method: FHIRComponentFieldMeta[Option[CodeableConcept]] =
          FHIRComponentFieldMeta("method", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
        val amount: FHIRComponentFieldMeta[Option[Quantity]] =
          FHIRComponentFieldMeta("amount", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
        val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, `type`, method, amount, extension, modifierExtension)
        override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
        override def fields(t: MolecularWeight): Seq[FHIRComponentField[_]] = Seq(
          FHIRComponentField[Option[String]](id, t.id),
          FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
          FHIRComponentField[Option[CodeableConcept]](method, t.method),
          FHIRComponentField[Option[Quantity]](amount, t.amount),
          FHIRComponentField[LitSeq[Extension]](extension, t.extension),
          FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
        )
        val baseType: CompanionFor[MolecularWeight] = this
        val thisName: String                        = "MolecularWeight"
        def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[MolecularWeight] =
          checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
            Try(
              new MolecularWeight(
                cursor.decodeAs[Option[String]]("id", Some(None)),
                cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
                cursor.decodeAs[Option[CodeableConcept]]("method", Some(None)),
                cursor.decodeAs[Option[Quantity]]("amount", Some(None)),
                cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
                cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
                decodeAttributes(cursor)
              )
            ))
      }
      @POJOBoilerplate
      class MolecularWeight(
          override val id: Option[String] = None,
          val `type`: Option[CodeableConcept] = None,
          val method: Option[CodeableConcept] = None,
          val amount: Option[Quantity] = None,
          override val extension: LitSeq[Extension] = LitSeq.empty,
          override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
          override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
          extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
      def apply(
          id: Option[String] = None,
          name: Option[CodeableConcept] = None,
          halfLife: Option[Quantity] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          identifier: Option[Identifier] = None,
          substitution: Option[CodeableConcept] = None,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          molecularWeight: Option[Isotope.MolecularWeight] = None,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Isotope = new Isotope(
        id,
        name,
        halfLife,
        extension,
        identifier,
        substitution,
        modifierExtension,
        molecularWeight,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Isotope): Option[(Option[String], Option[CodeableConcept], Option[Quantity], LitSeq[Extension], Option[Identifier], Option[CodeableConcept], LitSeq[Extension], Option[Isotope.MolecularWeight])] =
        Some((o.id, o.name, o.halfLife, o.extension, o.identifier, o.substitution, o.modifierExtension, o.molecularWeight))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val name: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("name", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val halfLife: FHIRComponentFieldMeta[Option[Quantity]] =
        FHIRComponentFieldMeta("halfLife", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val identifier: FHIRComponentFieldMeta[Option[Identifier]] =
        FHIRComponentFieldMeta("identifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
      val substitution: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("substitution", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val molecularWeight: FHIRComponentFieldMeta[Option[Isotope.MolecularWeight]] =
        FHIRComponentFieldMeta("molecularWeight", lTagOf[Option[Isotope.MolecularWeight]], false, lTagOf[Isotope.MolecularWeight])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
        Seq(id, name, halfLife, extension, identifier, substitution, modifierExtension, molecularWeight)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Isotope): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[CodeableConcept]](name, t.name),
        FHIRComponentField[Option[Quantity]](halfLife, t.halfLife),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[Identifier]](identifier, t.identifier),
        FHIRComponentField[Option[CodeableConcept]](substitution, t.substitution),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
        FHIRComponentField[Option[Isotope.MolecularWeight]](molecularWeight, t.molecularWeight)
      )
      val baseType: CompanionFor[Isotope] = this
      val thisName: String                = "Isotope"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Isotope] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Isotope(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[CodeableConcept]]("name", Some(None)),
              cursor.decodeAs[Option[Quantity]]("halfLife", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[Identifier]]("identifier", Some(None)),
              cursor.decodeAs[Option[CodeableConcept]]("substitution", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[Isotope.MolecularWeight]]("molecularWeight", Some(None)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Isotope(
        override val id: Option[String] = None,
        val name: Option[CodeableConcept] = None,
        val halfLife: Option[Quantity] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val identifier: Option[Identifier] = None,
        val substitution: Option[CodeableConcept] = None,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        val molecularWeight: Option[Isotope.MolecularWeight] = None,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        source: LitSeq[Reference] = LitSeq.empty,
        extension: LitSeq[Extension] = LitSeq.empty,
        stereochemistry: Option[CodeableConcept] = None,
        opticalActivity: Option[CodeableConcept] = None,
        molecularWeight: Option[SubstanceSpecification.Structure.Isotope.MolecularWeight] = None,
        molecularFormula: Option[String] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        molecularFormulaByMoiety: Option[String] = None,
        representation: LitSeq[Structure.Representation] = LitSeq.empty,
        isotope: LitSeq[Structure.Isotope] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Structure = new Structure(
      id,
      source,
      extension,
      stereochemistry,
      opticalActivity,
      molecularWeight,
      molecularFormula,
      modifierExtension,
      molecularFormulaByMoiety,
      representation,
      isotope,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Structure): Option[(Option[String], LitSeq[Reference], LitSeq[Extension], Option[CodeableConcept], Option[CodeableConcept], Option[SubstanceSpecification.Structure.Isotope.MolecularWeight], Option[String], LitSeq[Extension], Option[String], LitSeq[Structure.Representation], LitSeq[Structure.Isotope])] =
      Some(
        (
          o.id,
          o.source,
          o.extension,
          o.stereochemistry,
          o.opticalActivity,
          o.molecularWeight,
          o.molecularFormula,
          o.modifierExtension,
          o.molecularFormulaByMoiety,
          o.representation,
          o.isotope))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val source: FHIRComponentFieldMeta[LitSeq[Reference]] =
      FHIRComponentFieldMeta("source", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val stereochemistry: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("stereochemistry", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val opticalActivity: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("opticalActivity", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val molecularWeight: FHIRComponentFieldMeta[Option[SubstanceSpecification.Structure.Isotope.MolecularWeight]] =
      FHIRComponentFieldMeta(
        "molecularWeight",
        lTagOf[Option[SubstanceSpecification.Structure.Isotope.MolecularWeight]],
        false,
        lTagOf[SubstanceSpecification.Structure.Isotope.MolecularWeight]
      )
    val molecularFormula: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("molecularFormula", lTagOf[Option[String]], false, lTagOf[String])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val molecularFormulaByMoiety: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("molecularFormulaByMoiety", lTagOf[Option[String]], false, lTagOf[String])
    val representation: FHIRComponentFieldMeta[LitSeq[Structure.Representation]] =
      FHIRComponentFieldMeta("representation", lTagOf[LitSeq[Structure.Representation]], false, lTagOf[Structure.Representation])
    val isotope: FHIRComponentFieldMeta[LitSeq[Structure.Isotope]] =
      FHIRComponentFieldMeta("isotope", lTagOf[LitSeq[Structure.Isotope]], false, lTagOf[Structure.Isotope])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
      id,
      source,
      extension,
      stereochemistry,
      opticalActivity,
      molecularWeight,
      molecularFormula,
      modifierExtension,
      molecularFormulaByMoiety,
      representation,
      isotope
    )
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Structure): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Reference]](source, t.source),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[CodeableConcept]](stereochemistry, t.stereochemistry),
      FHIRComponentField[Option[CodeableConcept]](opticalActivity, t.opticalActivity),
      FHIRComponentField[Option[SubstanceSpecification.Structure.Isotope.MolecularWeight]](molecularWeight, t.molecularWeight),
      FHIRComponentField[Option[String]](molecularFormula, t.molecularFormula),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[String]](molecularFormulaByMoiety, t.molecularFormulaByMoiety),
      FHIRComponentField[LitSeq[Structure.Representation]](representation, t.representation),
      FHIRComponentField[LitSeq[Structure.Isotope]](isotope, t.isotope)
    )
    val baseType: CompanionFor[Structure] = this
    val thisName: String                  = "Structure"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Structure] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Structure(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Reference]]("source", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[CodeableConcept]]("stereochemistry", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("opticalActivity", Some(None)),
            cursor.decodeAs[Option[SubstanceSpecification.Structure.Isotope.MolecularWeight]]("molecularWeight", Some(None)),
            cursor.decodeAs[Option[String]]("molecularFormula", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("molecularFormulaByMoiety", Some(None)),
            cursor.decodeAs[LitSeq[Structure.Representation]]("representation", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Structure.Isotope]]("isotope", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Structure(
      override val id: Option[String] = None,
      val source: LitSeq[Reference] = LitSeq.empty,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val stereochemistry: Option[CodeableConcept] = None,
      val opticalActivity: Option[CodeableConcept] = None,
      val molecularWeight: Option[SubstanceSpecification.Structure.Isotope.MolecularWeight] = None,
      val molecularFormula: Option[String] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val molecularFormulaByMoiety: Option[String] = None,
      val representation: LitSeq[Structure.Representation] = LitSeq.empty,
      val isotope: LitSeq[Structure.Isotope] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Relationship extends CompanionFor[Relationship] {
    implicit def summonObjectAndCompanionRelationship_1349166298(
        o: Relationship): ObjectAndCompanion[Relationship, Relationship.type] = ObjectAndCompanion(o, this)
    override type ResourceType = Relationship
    override type ParentType   = Relationship
    override val parentType: CompanionFor[ResourceType] = Relationship
    type AmountChoice    = Choice[Union00133982841]
    type SubstanceChoice = Choice[UnionCodeableConceptOrReference]
    def apply(
        id: Option[String] = None,
        source: LitSeq[Reference] = LitSeq.empty,
        extension: LitSeq[Extension] = LitSeq.empty,
        amount: Option[Relationship.AmountChoice] = None,
        isDefining: Option[Boolean] = None,
        amountType: Option[CodeableConcept] = None,
        substance: Option[Relationship.SubstanceChoice] = None,
        relationship: Option[CodeableConcept] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        amountRatioLowLimit: Option[Ratio] = None,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Relationship = new Relationship(
      id,
      source,
      extension,
      amount,
      isDefining,
      amountType,
      substance,
      relationship,
      modifierExtension,
      amountRatioLowLimit,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Relationship): Option[(Option[String], LitSeq[Reference], LitSeq[Extension], Option[Relationship.AmountChoice], Option[Boolean], Option[CodeableConcept], Option[Relationship.SubstanceChoice], Option[CodeableConcept], LitSeq[Extension], Option[Ratio])] =
      Some(
        (
          o.id,
          o.source,
          o.extension,
          o.amount,
          o.isDefining,
          o.amountType,
          o.substance,
          o.relationship,
          o.modifierExtension,
          o.amountRatioLowLimit))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val source: FHIRComponentFieldMeta[LitSeq[Reference]] =
      FHIRComponentFieldMeta("source", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val amount: FHIRComponentFieldMeta[Option[Relationship.AmountChoice]] =
      FHIRComponentFieldMeta("amount", lTagOf[Option[Relationship.AmountChoice]], true, lTagOf[Union00133982841])
    val isDefining: FHIRComponentFieldMeta[Option[Boolean]] =
      FHIRComponentFieldMeta("isDefining", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
    val amountType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("amountType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val substance: FHIRComponentFieldMeta[Option[Relationship.SubstanceChoice]] =
      FHIRComponentFieldMeta(
        "substance",
        lTagOf[Option[Relationship.SubstanceChoice]],
        true,
        lTagOf[UnionCodeableConceptOrReference])
    val relationship: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("relationship", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val amountRatioLowLimit: FHIRComponentFieldMeta[Option[Ratio]] =
      FHIRComponentFieldMeta("amountRatioLowLimit", lTagOf[Option[Ratio]], false, lTagOf[Ratio])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, source, extension, amount, isDefining, amountType, substance, relationship, modifierExtension, amountRatioLowLimit)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Relationship): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Reference]](source, t.source),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Relationship.AmountChoice]](amount, t.amount),
      FHIRComponentField[Option[Boolean]](isDefining, t.isDefining),
      FHIRComponentField[Option[CodeableConcept]](amountType, t.amountType),
      FHIRComponentField[Option[Relationship.SubstanceChoice]](substance, t.substance),
      FHIRComponentField[Option[CodeableConcept]](relationship, t.relationship),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[Ratio]](amountRatioLowLimit, t.amountRatioLowLimit)
    )
    val baseType: CompanionFor[Relationship] = this
    val thisName: String                     = "Relationship"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Relationship] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Relationship(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Reference]]("source", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeOptRef[Union00133982841]("amount"),
            cursor.decodeAs[Option[Boolean]]("isDefining", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("amountType", Some(None)),
            cursor.decodeOptRef[UnionCodeableConceptOrReference]("substance"),
            cursor.decodeAs[Option[CodeableConcept]]("relationship", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Ratio]]("amountRatioLowLimit", Some(None)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Relationship(
      override val id: Option[String] = None,
      val source: LitSeq[Reference] = LitSeq.empty,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val amount: Option[Relationship.AmountChoice] = None,
      val isDefining: Option[Boolean] = None,
      val amountType: Option[CodeableConcept] = None,
      val substance: Option[Relationship.SubstanceChoice] = None,
      val relationship: Option[CodeableConcept] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val amountRatioLowLimit: Option[Ratio] = None,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Name extends CompanionFor[Name] {
    implicit def summonObjectAndCompanionName_1349166298(o: Name): ObjectAndCompanion[Name, Name.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Name
    override type ParentType   = Name
    override val parentType: CompanionFor[ResourceType] = Name
    object Official extends CompanionFor[Official] {
      implicit def summonObjectAndCompanionOfficial1477741289(o: Official): ObjectAndCompanion[Official, Official.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Official
      override type ParentType   = Official
      override val parentType: CompanionFor[ResourceType] = Official
      def apply(
          id: Option[String] = None,
          date: Option[FHIRDateTime] = None,
          status: Option[CodeableConcept] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          authority: Option[CodeableConcept] = None,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Official = new Official(
        id,
        date,
        status,
        extension,
        authority,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Official): Option[(Option[String], Option[FHIRDateTime], Option[CodeableConcept], LitSeq[Extension], Option[CodeableConcept], LitSeq[Extension])] =
        Some((o.id, o.date, o.status, o.extension, o.authority, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val date: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
        FHIRComponentFieldMeta("date", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
      val status: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("status", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val authority: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("authority", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, date, status, extension, authority, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Official): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[FHIRDateTime]](date, t.date),
        FHIRComponentField[Option[CodeableConcept]](status, t.status),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[CodeableConcept]](authority, t.authority),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Official] = this
      val thisName: String                 = "Official"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Official] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Official(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[FHIRDateTime]]("date", Some(None)),
              cursor.decodeAs[Option[CodeableConcept]]("status", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[CodeableConcept]]("authority", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Official(
        override val id: Option[String] = None,
        val date: Option[FHIRDateTime] = None,
        val status: Option[CodeableConcept] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val authority: Option[CodeableConcept] = None,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        name: String,
        `type`: Option[CodeableConcept] = None,
        status: Option[CodeableConcept] = None,
        domain: LitSeq[CodeableConcept] = LitSeq.empty,
        source: LitSeq[Reference] = LitSeq.empty,
        synonym: LitSeq[SubstanceSpecification.Name] = LitSeq.empty,
        language: LitSeq[CodeableConcept] = LitSeq.empty,
        extension: LitSeq[Extension] = LitSeq.empty,
        preferred: Option[Boolean] = None,
        translation: LitSeq[SubstanceSpecification.Name] = LitSeq.empty,
        jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        official: LitSeq[Name.Official] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Name = new Name(
      id,
      name,
      `type`,
      status,
      domain,
      source,
      synonym,
      language,
      extension,
      preferred,
      translation,
      jurisdiction,
      modifierExtension,
      official,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Name): Option[(Option[String], String, Option[CodeableConcept], Option[CodeableConcept], LitSeq[CodeableConcept], LitSeq[Reference], LitSeq[SubstanceSpecification.Name], LitSeq[CodeableConcept], LitSeq[Extension], Option[Boolean], LitSeq[SubstanceSpecification.Name], LitSeq[CodeableConcept], LitSeq[Extension], LitSeq[Name.Official])] =
      Some(
        (
          o.id,
          o.name,
          o.`type`,
          o.status,
          o.domain,
          o.source,
          o.synonym,
          o.language,
          o.extension,
          o.preferred,
          o.translation,
          o.jurisdiction,
          o.modifierExtension,
          o.official))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val name: FHIRComponentFieldMeta[String] =
      FHIRComponentFieldMeta("name", lTagOf[String], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val status: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("status", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val domain: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("domain", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val source: FHIRComponentFieldMeta[LitSeq[Reference]] =
      FHIRComponentFieldMeta("source", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
    val synonym: FHIRComponentFieldMeta[LitSeq[SubstanceSpecification.Name]] =
      FHIRComponentFieldMeta("synonym", lTagOf[LitSeq[SubstanceSpecification.Name]], false, lTagOf[SubstanceSpecification.Name])
    val language: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("language", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val preferred: FHIRComponentFieldMeta[Option[Boolean]] =
      FHIRComponentFieldMeta("preferred", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
    val translation: FHIRComponentFieldMeta[LitSeq[SubstanceSpecification.Name]] =
      FHIRComponentFieldMeta(
        "translation",
        lTagOf[LitSeq[SubstanceSpecification.Name]],
        false,
        lTagOf[SubstanceSpecification.Name])
    val jurisdiction: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("jurisdiction", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val official: FHIRComponentFieldMeta[LitSeq[Name.Official]] =
      FHIRComponentFieldMeta("official", lTagOf[LitSeq[Name.Official]], false, lTagOf[Name.Official])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
      id,
      name,
      `type`,
      status,
      domain,
      source,
      synonym,
      language,
      extension,
      preferred,
      translation,
      jurisdiction,
      modifierExtension,
      official)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Name): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[String](name, t.name),
      FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[Option[CodeableConcept]](status, t.status),
      FHIRComponentField[LitSeq[CodeableConcept]](domain, t.domain),
      FHIRComponentField[LitSeq[Reference]](source, t.source),
      FHIRComponentField[LitSeq[SubstanceSpecification.Name]](synonym, t.synonym),
      FHIRComponentField[LitSeq[CodeableConcept]](language, t.language),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Boolean]](preferred, t.preferred),
      FHIRComponentField[LitSeq[SubstanceSpecification.Name]](translation, t.translation),
      FHIRComponentField[LitSeq[CodeableConcept]](jurisdiction, t.jurisdiction),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[Name.Official]](official, t.official)
    )
    val baseType: CompanionFor[Name] = this
    val thisName: String             = "Name"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Name] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Name(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[String]("name", None),
            cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("status", Some(None)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("domain", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Reference]]("source", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[SubstanceSpecification.Name]]("synonym", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("language", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Boolean]]("preferred", Some(None)),
            cursor.decodeAs[LitSeq[SubstanceSpecification.Name]]("translation", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("jurisdiction", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Name.Official]]("official", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Name(
      override val id: Option[String] = None,
      val name: String,
      val `type`: Option[CodeableConcept] = None,
      val status: Option[CodeableConcept] = None,
      val domain: LitSeq[CodeableConcept] = LitSeq.empty,
      val source: LitSeq[Reference] = LitSeq.empty,
      val synonym: LitSeq[SubstanceSpecification.Name] = LitSeq.empty,
      val language: LitSeq[CodeableConcept] = LitSeq.empty,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val preferred: Option[Boolean] = None,
      val translation: LitSeq[SubstanceSpecification.Name] = LitSeq.empty,
      val jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val official: LitSeq[Name.Official] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Property extends CompanionFor[Property] {
    implicit def summonObjectAndCompanionProperty_1349166298(o: Property): ObjectAndCompanion[Property, Property.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Property
    override type ParentType   = Property
    override val parentType: CompanionFor[ResourceType] = Property
    type AmountChoice            = Choice[UnionQuantityOrString]
    type DefiningSubstanceChoice = Choice[UnionCodeableConceptOrReference]
    def apply(
        id: Option[String] = None,
        code: Option[CodeableConcept] = None,
        category: Option[CodeableConcept] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        amount: Option[Property.AmountChoice] = None,
        parameters: Option[String] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        definingSubstance: Option[Property.DefiningSubstanceChoice] = None,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Property = new Property(
      id,
      code,
      category,
      extension,
      amount,
      parameters,
      modifierExtension,
      definingSubstance,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Property): Option[(Option[String], Option[CodeableConcept], Option[CodeableConcept], LitSeq[Extension], Option[Property.AmountChoice], Option[String], LitSeq[Extension], Option[Property.DefiningSubstanceChoice])] =
      Some((o.id, o.code, o.category, o.extension, o.amount, o.parameters, o.modifierExtension, o.definingSubstance))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val code: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("code", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val category: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("category", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val amount: FHIRComponentFieldMeta[Option[Property.AmountChoice]] =
      FHIRComponentFieldMeta("amount", lTagOf[Option[Property.AmountChoice]], true, lTagOf[UnionQuantityOrString])
    val parameters: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("parameters", lTagOf[Option[String]], false, lTagOf[String])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val definingSubstance: FHIRComponentFieldMeta[Option[Property.DefiningSubstanceChoice]] =
      FHIRComponentFieldMeta(
        "definingSubstance",
        lTagOf[Option[Property.DefiningSubstanceChoice]],
        true,
        lTagOf[UnionCodeableConceptOrReference])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, code, category, extension, amount, parameters, modifierExtension, definingSubstance)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Property): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](code, t.code),
      FHIRComponentField[Option[CodeableConcept]](category, t.category),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Property.AmountChoice]](amount, t.amount),
      FHIRComponentField[Option[String]](parameters, t.parameters),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[Property.DefiningSubstanceChoice]](definingSubstance, t.definingSubstance)
    )
    val baseType: CompanionFor[Property] = this
    val thisName: String                 = "Property"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Property] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Property(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("code", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("category", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeOptRef[UnionQuantityOrString]("amount"),
            cursor.decodeAs[Option[String]]("parameters", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeOptRef[UnionCodeableConceptOrReference]("definingSubstance"),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Property(
      override val id: Option[String] = None,
      val code: Option[CodeableConcept] = None,
      val category: Option[CodeableConcept] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val amount: Option[Property.AmountChoice] = None,
      val parameters: Option[String] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val definingSubstance: Option[Property.DefiningSubstanceChoice] = None,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Moiety extends CompanionFor[Moiety] {
    implicit def summonObjectAndCompanionMoiety_1349166298(o: Moiety): ObjectAndCompanion[Moiety, Moiety.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Moiety
    override type ParentType   = Moiety
    override val parentType: CompanionFor[ResourceType] = Moiety
    type AmountChoice = Choice[UnionQuantityOrString]
    def apply(
        id: Option[String] = None,
        role: Option[CodeableConcept] = None,
        name: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        amount: Option[Moiety.AmountChoice] = None,
        identifier: Option[Identifier] = None,
        stereochemistry: Option[CodeableConcept] = None,
        opticalActivity: Option[CodeableConcept] = None,
        molecularFormula: Option[String] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Moiety = new Moiety(
      id,
      role,
      name,
      extension,
      amount,
      identifier,
      stereochemistry,
      opticalActivity,
      molecularFormula,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Moiety): Option[(Option[String], Option[CodeableConcept], Option[String], LitSeq[Extension], Option[Moiety.AmountChoice], Option[Identifier], Option[CodeableConcept], Option[CodeableConcept], Option[String], LitSeq[Extension])] =
      Some(
        (
          o.id,
          o.role,
          o.name,
          o.extension,
          o.amount,
          o.identifier,
          o.stereochemistry,
          o.opticalActivity,
          o.molecularFormula,
          o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val role: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("role", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val name: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("name", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val amount: FHIRComponentFieldMeta[Option[Moiety.AmountChoice]] =
      FHIRComponentFieldMeta("amount", lTagOf[Option[Moiety.AmountChoice]], true, lTagOf[UnionQuantityOrString])
    val identifier: FHIRComponentFieldMeta[Option[Identifier]] =
      FHIRComponentFieldMeta("identifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
    val stereochemistry: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("stereochemistry", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val opticalActivity: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("opticalActivity", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val molecularFormula: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("molecularFormula", lTagOf[Option[String]], false, lTagOf[String])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, role, name, extension, amount, identifier, stereochemistry, opticalActivity, molecularFormula, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Moiety): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](role, t.role),
      FHIRComponentField[Option[String]](name, t.name),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Moiety.AmountChoice]](amount, t.amount),
      FHIRComponentField[Option[Identifier]](identifier, t.identifier),
      FHIRComponentField[Option[CodeableConcept]](stereochemistry, t.stereochemistry),
      FHIRComponentField[Option[CodeableConcept]](opticalActivity, t.opticalActivity),
      FHIRComponentField[Option[String]](molecularFormula, t.molecularFormula),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Moiety] = this
    val thisName: String               = "Moiety"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Moiety] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Moiety(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("role", Some(None)),
            cursor.decodeAs[Option[String]]("name", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeOptRef[UnionQuantityOrString]("amount"),
            cursor.decodeAs[Option[Identifier]]("identifier", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("stereochemistry", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("opticalActivity", Some(None)),
            cursor.decodeAs[Option[String]]("molecularFormula", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Moiety(
      override val id: Option[String] = None,
      val role: Option[CodeableConcept] = None,
      val name: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val amount: Option[Moiety.AmountChoice] = None,
      val identifier: Option[Identifier] = None,
      val stereochemistry: Option[CodeableConcept] = None,
      val opticalActivity: Option[CodeableConcept] = None,
      val molecularFormula: Option[String] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Code extends CompanionFor[Code] {
    implicit def summonObjectAndCompanionCode_1349166298(o: Code): ObjectAndCompanion[Code, Code.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Code
    override type ParentType   = Code
    override val parentType: CompanionFor[ResourceType] = Code
    def apply(
        id: Option[String] = None,
        code: Option[CodeableConcept] = None,
        status: Option[CodeableConcept] = None,
        source: LitSeq[Reference] = LitSeq.empty,
        comment: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        statusDate: Option[FHIRDateTime] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Code = new Code(
      id,
      code,
      status,
      source,
      comment,
      extension,
      statusDate,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Code): Option[(Option[String], Option[CodeableConcept], Option[CodeableConcept], LitSeq[Reference], Option[String], LitSeq[Extension], Option[FHIRDateTime], LitSeq[Extension])] =
      Some((o.id, o.code, o.status, o.source, o.comment, o.extension, o.statusDate, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val code: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("code", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val status: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("status", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val source: FHIRComponentFieldMeta[LitSeq[Reference]] =
      FHIRComponentFieldMeta("source", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
    val comment: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("comment", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val statusDate: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
      FHIRComponentFieldMeta("statusDate", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, code, status, source, comment, extension, statusDate, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Code): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](code, t.code),
      FHIRComponentField[Option[CodeableConcept]](status, t.status),
      FHIRComponentField[LitSeq[Reference]](source, t.source),
      FHIRComponentField[Option[String]](comment, t.comment),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[FHIRDateTime]](statusDate, t.statusDate),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Code] = this
    val thisName: String             = "Code"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Code] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Code(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("code", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("status", Some(None)),
            cursor.decodeAs[LitSeq[Reference]]("source", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("comment", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[FHIRDateTime]]("statusDate", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Code(
      override val id: Option[String] = None,
      val code: Option[CodeableConcept] = None,
      val status: Option[CodeableConcept] = None,
      val source: LitSeq[Reference] = LitSeq.empty,
      val comment: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val statusDate: Option[FHIRDateTime] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      `type`: Option[CodeableConcept] = None,
      status: Option[CodeableConcept] = None,
      domain: Option[CodeableConcept] = None,
      source: LitSeq[Reference] = LitSeq.empty,
      comment: Option[String] = None,
      polymer: Option[Reference] = None,
      protein: Option[Reference] = None,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      identifier: Option[Identifier] = None,
      description: Option[String] = None,
      nucleicAcid: Option[Reference] = None,
      implicitRules: Option[UriStr] = None,
      sourceMaterial: Option[Reference] = None,
      molecularWeight: LitSeq[SubstanceSpecification.Structure.Isotope.MolecularWeight] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      referenceInformation: Option[Reference] = None,
      code: LitSeq[SubstanceSpecification.Code] = LitSeq.empty,
      moiety: LitSeq[SubstanceSpecification.Moiety] = LitSeq.empty,
      property: LitSeq[SubstanceSpecification.Property] = LitSeq.empty,
      name: LitSeq[SubstanceSpecification.Name] = LitSeq.empty,
      relationship: LitSeq[SubstanceSpecification.Relationship] = LitSeq.empty,
      structure: Option[SubstanceSpecification.Structure] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): SubstanceSpecification = new SubstanceSpecification(
    id,
    meta,
    text,
    `type`,
    status,
    domain,
    source,
    comment,
    polymer,
    protein,
    language,
    contained,
    extension,
    identifier,
    description,
    nucleicAcid,
    implicitRules,
    sourceMaterial,
    molecularWeight,
    modifierExtension,
    referenceInformation,
    code,
    moiety,
    property,
    name,
    relationship,
    structure,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val status: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("status", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val domain: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("domain", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val source: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("source", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val comment: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("comment", lTagOf[Option[String]], false, lTagOf[String])
  val polymer: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("polymer", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val protein: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("protein", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[Option[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
  val description: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
  val nucleicAcid: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("nucleicAcid", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val sourceMaterial: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("sourceMaterial", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val molecularWeight: FHIRComponentFieldMeta[LitSeq[SubstanceSpecification.Structure.Isotope.MolecularWeight]] =
    FHIRComponentFieldMeta(
      "molecularWeight",
      lTagOf[LitSeq[SubstanceSpecification.Structure.Isotope.MolecularWeight]],
      false,
      lTagOf[SubstanceSpecification.Structure.Isotope.MolecularWeight]
    )
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val referenceInformation: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("referenceInformation", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val code: FHIRComponentFieldMeta[LitSeq[SubstanceSpecification.Code]] =
    FHIRComponentFieldMeta("code", lTagOf[LitSeq[SubstanceSpecification.Code]], false, lTagOf[SubstanceSpecification.Code])
  val moiety: FHIRComponentFieldMeta[LitSeq[SubstanceSpecification.Moiety]] =
    FHIRComponentFieldMeta("moiety", lTagOf[LitSeq[SubstanceSpecification.Moiety]], false, lTagOf[SubstanceSpecification.Moiety])
  val property: FHIRComponentFieldMeta[LitSeq[SubstanceSpecification.Property]] =
    FHIRComponentFieldMeta(
      "property",
      lTagOf[LitSeq[SubstanceSpecification.Property]],
      false,
      lTagOf[SubstanceSpecification.Property])
  val name: FHIRComponentFieldMeta[LitSeq[SubstanceSpecification.Name]] =
    FHIRComponentFieldMeta("name", lTagOf[LitSeq[SubstanceSpecification.Name]], false, lTagOf[SubstanceSpecification.Name])
  val relationship: FHIRComponentFieldMeta[LitSeq[SubstanceSpecification.Relationship]] =
    FHIRComponentFieldMeta(
      "relationship",
      lTagOf[LitSeq[SubstanceSpecification.Relationship]],
      false,
      lTagOf[SubstanceSpecification.Relationship])
  val structure: FHIRComponentFieldMeta[Option[SubstanceSpecification.Structure]] =
    FHIRComponentFieldMeta(
      "structure",
      lTagOf[Option[SubstanceSpecification.Structure]],
      false,
      lTagOf[SubstanceSpecification.Structure])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    `type`,
    status,
    domain,
    source,
    comment,
    polymer,
    protein,
    language,
    contained,
    extension,
    identifier,
    description,
    nucleicAcid,
    implicitRules,
    sourceMaterial,
    molecularWeight,
    modifierExtension,
    referenceInformation,
    code,
    moiety,
    property,
    name,
    relationship,
    structure
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: SubstanceSpecification): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
    FHIRComponentField[Option[CodeableConcept]](status, t.status),
    FHIRComponentField[Option[CodeableConcept]](domain, t.domain),
    FHIRComponentField[LitSeq[Reference]](source, t.source),
    FHIRComponentField[Option[String]](comment, t.comment),
    FHIRComponentField[Option[Reference]](polymer, t.polymer),
    FHIRComponentField[Option[Reference]](protein, t.protein),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[String]](description, t.description),
    FHIRComponentField[Option[Reference]](nucleicAcid, t.nucleicAcid),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[Reference]](sourceMaterial, t.sourceMaterial),
    FHIRComponentField[LitSeq[SubstanceSpecification.Structure.Isotope.MolecularWeight]](molecularWeight, t.molecularWeight),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Option[Reference]](referenceInformation, t.referenceInformation),
    FHIRComponentField[LitSeq[SubstanceSpecification.Code]](code, t.code),
    FHIRComponentField[LitSeq[SubstanceSpecification.Moiety]](moiety, t.moiety),
    FHIRComponentField[LitSeq[SubstanceSpecification.Property]](property, t.property),
    FHIRComponentField[LitSeq[SubstanceSpecification.Name]](name, t.name),
    FHIRComponentField[LitSeq[SubstanceSpecification.Relationship]](relationship, t.relationship),
    FHIRComponentField[Option[SubstanceSpecification.Structure]](structure, t.structure)
  )
  def extractId(t: SubstanceSpecification): Option[String]                = t.id
  def extractMeta(t: SubstanceSpecification): Option[Meta]                = t.meta
  def extractText(t: SubstanceSpecification): Option[Narrative]           = t.text
  def extractType(t: SubstanceSpecification): Option[CodeableConcept]     = t.`type`
  def extractStatus(t: SubstanceSpecification): Option[CodeableConcept]   = t.status
  def extractDomain(t: SubstanceSpecification): Option[CodeableConcept]   = t.domain
  def extractSource(t: SubstanceSpecification): LitSeq[Reference]         = t.source
  def extractComment(t: SubstanceSpecification): Option[String]           = t.comment
  def extractPolymer(t: SubstanceSpecification): Option[Reference]        = t.polymer
  def extractProtein(t: SubstanceSpecification): Option[Reference]        = t.protein
  def extractLanguage(t: SubstanceSpecification): Option[LANGUAGES]       = t.language
  def extractContained(t: SubstanceSpecification): LitSeq[Resource]       = t.contained
  def extractExtension(t: SubstanceSpecification): LitSeq[Extension]      = t.extension
  def extractIdentifier(t: SubstanceSpecification): Option[Identifier]    = t.identifier
  def extractDescription(t: SubstanceSpecification): Option[String]       = t.description
  def extractNucleicAcid(t: SubstanceSpecification): Option[Reference]    = t.nucleicAcid
  def extractImplicitRules(t: SubstanceSpecification): Option[UriStr]     = t.implicitRules
  def extractSourceMaterial(t: SubstanceSpecification): Option[Reference] = t.sourceMaterial
  def extractMolecularWeight(t: SubstanceSpecification): LitSeq[SubstanceSpecification.Structure.Isotope.MolecularWeight] =
    t.molecularWeight
  def extractModifierExtension(t: SubstanceSpecification): LitSeq[Extension]                      = t.modifierExtension
  def extractReferenceInformation(t: SubstanceSpecification): Option[Reference]                   = t.referenceInformation
  def extractCode(t: SubstanceSpecification): LitSeq[SubstanceSpecification.Code]                 = t.code
  def extractMoiety(t: SubstanceSpecification): LitSeq[SubstanceSpecification.Moiety]             = t.moiety
  def extractProperty(t: SubstanceSpecification): LitSeq[SubstanceSpecification.Property]         = t.property
  def extractName(t: SubstanceSpecification): LitSeq[SubstanceSpecification.Name]                 = t.name
  def extractRelationship(t: SubstanceSpecification): LitSeq[SubstanceSpecification.Relationship] = t.relationship
  def extractStructure(t: SubstanceSpecification): Option[SubstanceSpecification.Structure]       = t.structure
  override val thisName: String                                                                   = "SubstanceSpecification"
  override val searchParams: Map[String, SubstanceSpecification => Seq[Any]] = Map(
    "code" -> (obj => obj.code.flatMap(_.code).toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[SubstanceSpecification] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new SubstanceSpecification(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("status", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("domain", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("source", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("comment", Some(None)),
          cursor.decodeAs[Option[Reference]]("polymer", Some(None)),
          cursor.decodeAs[Option[Reference]]("protein", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Identifier]]("identifier", Some(None)),
          cursor.decodeAs[Option[String]]("description", Some(None)),
          cursor.decodeAs[Option[Reference]]("nucleicAcid", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[Reference]]("sourceMaterial", Some(None)),
          cursor
            .decodeAs[LitSeq[SubstanceSpecification.Structure.Isotope.MolecularWeight]]("molecularWeight", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("referenceInformation", Some(None)),
          cursor.decodeAs[LitSeq[SubstanceSpecification.Code]]("code", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[SubstanceSpecification.Moiety]]("moiety", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[SubstanceSpecification.Property]]("property", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[SubstanceSpecification.Name]]("name", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[SubstanceSpecification.Relationship]]("relationship", Some(LitSeq.empty)),
          cursor.decodeAs[Option[SubstanceSpecification.Structure]]("structure", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** The detailed description of a substance, typically at a level beyond what is used for prescribing.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields `type`, status, domain, source, comment, polymer, protein, identifier, description, nucleicAcid,
  *   sourceMaterial, molecularWeight, referenceInformation, code, moiety, property, name, relationship, structure.
  * @param id
  *   \- The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta
  *   \- The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *   not always be associated with version changes to the resource.
  * @param text
  *   \- A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *   resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to
  *   make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be
  *   represented in the narrative to ensure clinical safety.
  * @param `type`
  *   \- High level categorization, e.g. polymer or nucleic acid.
  * @param status
  *   \- Status of substance within the catalogue e.g. approved.
  * @param domain
  *   \- If the substance applies to only human or veterinary use.
  * @param source
  *   \- Supporting literature.
  * @param comment
  *   \- Textual comment about this record of a substance.
  * @param polymer
  *   \- Data items specific to polymers.
  * @param protein
  *   \- Data items specific to proteins.
  * @param language
  *   \- The base language in which the resource is written.
  * @param contained
  *   \- These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   \- May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param identifier
  *   \- Identifier by which this substance is known.
  * @param description
  *   \- Textual description of the substance.
  * @param nucleicAcid
  *   \- Data items specific to nucleic acids.
  * @param implicitRules
  *   \- A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param sourceMaterial
  *   \- Material or taxonomic/anatomical source for the substance.
  * @param molecularWeight
  *   \- The molecular weight or weight range (for proteins, polymers or nucleic acids).
  * @param modifierExtension
  *   \- May be used to represent additional information that is not part of the basic definition of the resource and that
  *   modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *   Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *   strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *   extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *   processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any
  *   elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param referenceInformation
  *   \- General information detailing this substance.
  * @param code
  *   \- Codes associated with the substance.
  * @param moiety
  *   \- Moiety, for structural modifications.
  * @param property
  *   \- General specifications for this substance, including how it is related to other substances.
  * @param name
  *   \- Names applicable to this substance.
  * @param relationship
  *   \- A link between this substance and another, with details of the relationship.
  * @param structure
  *   \- Structural information.
  */
@POJOBoilerplate
class SubstanceSpecification(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val `type`: Option[CodeableConcept] = None,
    val status: Option[CodeableConcept] = None,
    val domain: Option[CodeableConcept] = None,
    val source: LitSeq[Reference] = LitSeq.empty,
    val comment: Option[String] = None,
    val polymer: Option[Reference] = None,
    val protein: Option[Reference] = None,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val identifier: Option[Identifier] = None,
    val description: Option[String] = None,
    val nucleicAcid: Option[Reference] = None,
    override val implicitRules: Option[UriStr] = None,
    val sourceMaterial: Option[Reference] = None,
    val molecularWeight: LitSeq[SubstanceSpecification.Structure.Isotope.MolecularWeight] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val referenceInformation: Option[Reference] = None,
    val code: LitSeq[SubstanceSpecification.Code] = LitSeq.empty,
    val moiety: LitSeq[SubstanceSpecification.Moiety] = LitSeq.empty,
    val property: LitSeq[SubstanceSpecification.Property] = LitSeq.empty,
    val name: LitSeq[SubstanceSpecification.Name] = LitSeq.empty,
    val relationship: LitSeq[SubstanceSpecification.Relationship] = LitSeq.empty,
    val structure: Option[SubstanceSpecification.Structure] = None,
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
  override val thisTypeName: String = "SubstanceSpecification"
}
