package com.babylonhealth.lit.hl7.model

import java.time.{ LocalDate, LocalTime, ZonedDateTime }
import java.util.UUID

import scala.collection.immutable.TreeMap
import scala.util.Try

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

object SubstancePolymer extends CompanionFor[SubstancePolymer] {
  override val baseType: CompanionFor[SubstancePolymer] = SubstancePolymer
  override val profileUrl: Option[String]               = Some("http://hl7.org/fhir/StructureDefinition/SubstancePolymer")
  object Repeat extends CompanionFor[Repeat] {
    object RepeatUnit extends CompanionFor[RepeatUnit] {
      object DegreeOfPolymerisation extends CompanionFor[DegreeOfPolymerisation] {
        def apply(
            id: Option[String] = None,
            degree: Option[CodeableConcept] = None,
            amount: Option[Choice["SubstanceAmount"]] = None,
            extension: LitSeq[Extension] = LitSeq.empty,
            modifierExtension: LitSeq[Extension] = LitSeq.empty,
            primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
        ): DegreeOfPolymerisation = new DegreeOfPolymerisation(
          id,
          degree,
          amount,
          extension,
          modifierExtension,
          primitiveAttributes = primitiveAttributes
        )
        def unapply(
            o: DegreeOfPolymerisation): Option[(Option[String], Option[CodeableConcept], Option[Choice["SubstanceAmount"]], LitSeq[Extension], LitSeq[Extension])] =
          Some((o.id, o.degree, o.amount, o.extension, o.modifierExtension))
        val id: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
        val degree: FHIRComponentFieldMeta[Option[CodeableConcept]] =
          FHIRComponentFieldMeta("degree", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
        val amount: FHIRComponentFieldMeta[Option[Choice["SubstanceAmount"]]] =
          FHIRComponentFieldMeta(
            "amount",
            lTagOf[Option[Choice["SubstanceAmount"]]],
            false,
            lTagOf[Choice["SubstanceAmount"]])
        val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, degree, amount, extension, modifierExtension)
        override def fields(t: DegreeOfPolymerisation): Seq[FHIRComponentField[_]] = Seq(
          FHIRComponentField[Option[String]](id, t.id),
          FHIRComponentField[Option[CodeableConcept]](degree, t.degree),
          FHIRComponentField[Option[Choice["SubstanceAmount"]]](amount, t.amount),
          FHIRComponentField[LitSeq[Extension]](extension, t.extension),
          FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
        )
        val baseType: CompanionFor[DegreeOfPolymerisation] = this
        val thisName: String                               = "DegreeOfPolymerisation"
        def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[DegreeOfPolymerisation] =
          checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
            Try(
              new DegreeOfPolymerisation(
                cursor.decodeAs[Option[String]]("id", Some(None)),
                cursor.decodeAs[Option[CodeableConcept]]("degree", Some(None)),
                cursor.decodeAs[Option[Choice["SubstanceAmount"]]]("amount", Some(None)),
                cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
                cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
                decodeAttributes(cursor)
              )
            ))
      }
      @POJOBoilerplate
      class DegreeOfPolymerisation(
          override val id: Option[String] = None,
          val degree: Option[CodeableConcept] = None,
          val amount: Option[Choice["SubstanceAmount"]] = None,
          override val extension: LitSeq[Extension] = LitSeq.empty,
          override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
          override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
            FHIRObject.emptyAtts)
          extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
      object StructuralRepresentation extends CompanionFor[StructuralRepresentation] {
        def apply(
            id: Option[String] = None,
            `type`: Option[CodeableConcept] = None,
            extension: LitSeq[Extension] = LitSeq.empty,
            attachment: Option[Attachment] = None,
            representation: Option[String] = None,
            modifierExtension: LitSeq[Extension] = LitSeq.empty,
            primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
        ): StructuralRepresentation = new StructuralRepresentation(
          id,
          `type`,
          extension,
          attachment,
          representation,
          modifierExtension,
          primitiveAttributes = primitiveAttributes
        )
        def unapply(
            o: StructuralRepresentation): Option[(Option[String], Option[CodeableConcept], LitSeq[Extension], Option[Attachment], Option[String], LitSeq[Extension])] =
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
        val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
          Seq(id, `type`, extension, attachment, representation, modifierExtension)
        override def fields(t: StructuralRepresentation): Seq[FHIRComponentField[_]] = Seq(
          FHIRComponentField[Option[String]](id, t.id),
          FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
          FHIRComponentField[LitSeq[Extension]](extension, t.extension),
          FHIRComponentField[Option[Attachment]](attachment, t.attachment),
          FHIRComponentField[Option[String]](representation, t.representation),
          FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
        )
        val baseType: CompanionFor[StructuralRepresentation] = this
        val thisName: String                                 = "StructuralRepresentation"
        def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[StructuralRepresentation] =
          checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
            Try(
              new StructuralRepresentation(
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
      class StructuralRepresentation(
          override val id: Option[String] = None,
          val `type`: Option[CodeableConcept] = None,
          override val extension: LitSeq[Extension] = LitSeq.empty,
          val attachment: Option[Attachment] = None,
          val representation: Option[String] = None,
          override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
          override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
            FHIRObject.emptyAtts)
          extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
      def apply(
          id: Option[String] = None,
          amount: Option[Choice["SubstanceAmount"]] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          repeatUnit: Option[String] = None,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          orientationOfPolymerisation: Option[CodeableConcept] = None,
          degreeOfPolymerisation: LitSeq[RepeatUnit.DegreeOfPolymerisation] = LitSeq.empty,
          structuralRepresentation: LitSeq[RepeatUnit.StructuralRepresentation] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): RepeatUnit = new RepeatUnit(
        id,
        amount,
        extension,
        repeatUnit,
        modifierExtension,
        orientationOfPolymerisation,
        degreeOfPolymerisation,
        structuralRepresentation,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: RepeatUnit): Option[(Option[String], Option[Choice["SubstanceAmount"]], LitSeq[Extension], Option[String], LitSeq[Extension], Option[CodeableConcept], LitSeq[RepeatUnit.DegreeOfPolymerisation], LitSeq[RepeatUnit.StructuralRepresentation])] =
        Some(
          (
            o.id,
            o.amount,
            o.extension,
            o.repeatUnit,
            o.modifierExtension,
            o.orientationOfPolymerisation,
            o.degreeOfPolymerisation,
            o.structuralRepresentation))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val amount: FHIRComponentFieldMeta[Option[Choice["SubstanceAmount"]]] =
        FHIRComponentFieldMeta(
          "amount",
          lTagOf[Option[Choice["SubstanceAmount"]]],
          false,
          lTagOf[Choice["SubstanceAmount"]])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val repeatUnit: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("repeatUnit", lTagOf[Option[String]], false, lTagOf[String])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val orientationOfPolymerisation: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta(
          "orientationOfPolymerisation",
          lTagOf[Option[CodeableConcept]],
          false,
          lTagOf[CodeableConcept])
      val degreeOfPolymerisation: FHIRComponentFieldMeta[LitSeq[RepeatUnit.DegreeOfPolymerisation]] =
        FHIRComponentFieldMeta(
          "degreeOfPolymerisation",
          lTagOf[LitSeq[RepeatUnit.DegreeOfPolymerisation]],
          false,
          lTagOf[RepeatUnit.DegreeOfPolymerisation])
      val structuralRepresentation: FHIRComponentFieldMeta[LitSeq[RepeatUnit.StructuralRepresentation]] =
        FHIRComponentFieldMeta(
          "structuralRepresentation",
          lTagOf[LitSeq[RepeatUnit.StructuralRepresentation]],
          false,
          lTagOf[RepeatUnit.StructuralRepresentation])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
        id,
        amount,
        extension,
        repeatUnit,
        modifierExtension,
        orientationOfPolymerisation,
        degreeOfPolymerisation,
        structuralRepresentation)
      override def fields(t: RepeatUnit): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[Choice["SubstanceAmount"]]](amount, t.amount),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[String]](repeatUnit, t.repeatUnit),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
        FHIRComponentField[Option[CodeableConcept]](orientationOfPolymerisation, t.orientationOfPolymerisation),
        FHIRComponentField[LitSeq[RepeatUnit.DegreeOfPolymerisation]](degreeOfPolymerisation, t.degreeOfPolymerisation),
        FHIRComponentField[LitSeq[RepeatUnit.StructuralRepresentation]](
          structuralRepresentation,
          t.structuralRepresentation)
      )
      val baseType: CompanionFor[RepeatUnit] = this
      val thisName: String                   = "RepeatUnit"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[RepeatUnit] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new RepeatUnit(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[Choice["SubstanceAmount"]]]("amount", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[String]]("repeatUnit", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[CodeableConcept]]("orientationOfPolymerisation", Some(None)),
              cursor.decodeAs[LitSeq[RepeatUnit.DegreeOfPolymerisation]]("degreeOfPolymerisation", Some(LitSeq.empty)),
              cursor
                .decodeAs[LitSeq[RepeatUnit.StructuralRepresentation]]("structuralRepresentation", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class RepeatUnit(
        override val id: Option[String] = None,
        val amount: Option[Choice["SubstanceAmount"]] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val repeatUnit: Option[String] = None,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        val orientationOfPolymerisation: Option[CodeableConcept] = None,
        val degreeOfPolymerisation: LitSeq[RepeatUnit.DegreeOfPolymerisation] = LitSeq.empty,
        val structuralRepresentation: LitSeq[RepeatUnit.StructuralRepresentation] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        numberOfUnits: Option[Int] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        repeatUnitAmountType: Option[CodeableConcept] = None,
        averageMolecularFormula: Option[String] = None,
        repeatUnit: LitSeq[Repeat.RepeatUnit] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Repeat = new Repeat(
      id,
      extension,
      numberOfUnits,
      modifierExtension,
      repeatUnitAmountType,
      averageMolecularFormula,
      repeatUnit,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Repeat): Option[(Option[String], LitSeq[Extension], Option[Int], LitSeq[Extension], Option[CodeableConcept], Option[String], LitSeq[Repeat.RepeatUnit])] =
      Some(
        (
          o.id,
          o.extension,
          o.numberOfUnits,
          o.modifierExtension,
          o.repeatUnitAmountType,
          o.averageMolecularFormula,
          o.repeatUnit))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val numberOfUnits: FHIRComponentFieldMeta[Option[Int]] =
      FHIRComponentFieldMeta("numberOfUnits", lTagOf[Option[Int]], false, lTagOf[Int])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val repeatUnitAmountType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("repeatUnitAmountType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val averageMolecularFormula: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("averageMolecularFormula", lTagOf[Option[String]], false, lTagOf[String])
    val repeatUnit: FHIRComponentFieldMeta[LitSeq[Repeat.RepeatUnit]] =
      FHIRComponentFieldMeta("repeatUnit", lTagOf[LitSeq[Repeat.RepeatUnit]], false, lTagOf[Repeat.RepeatUnit])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, extension, numberOfUnits, modifierExtension, repeatUnitAmountType, averageMolecularFormula, repeatUnit)
    override def fields(t: Repeat): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Int]](numberOfUnits, t.numberOfUnits),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[CodeableConcept]](repeatUnitAmountType, t.repeatUnitAmountType),
      FHIRComponentField[Option[String]](averageMolecularFormula, t.averageMolecularFormula),
      FHIRComponentField[LitSeq[Repeat.RepeatUnit]](repeatUnit, t.repeatUnit)
    )
    val baseType: CompanionFor[Repeat] = this
    val thisName: String               = "Repeat"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Repeat] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Repeat(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Int]]("numberOfUnits", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[CodeableConcept]]("repeatUnitAmountType", Some(None)),
            cursor.decodeAs[Option[String]]("averageMolecularFormula", Some(None)),
            cursor.decodeAs[LitSeq[Repeat.RepeatUnit]]("repeatUnit", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Repeat(
      override val id: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val numberOfUnits: Option[Int] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val repeatUnitAmountType: Option[CodeableConcept] = None,
      val averageMolecularFormula: Option[String] = None,
      val repeatUnit: LitSeq[Repeat.RepeatUnit] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object MonomerSet extends CompanionFor[MonomerSet] {
    object StartingMaterial extends CompanionFor[StartingMaterial] {
      def apply(
          id: Option[String] = None,
          `type`: Option[CodeableConcept] = None,
          amount: Option[Choice["SubstanceAmount"]] = None,
          material: Option[CodeableConcept] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          isDefining: Option[Boolean] = None,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): StartingMaterial = new StartingMaterial(
        id,
        `type`,
        amount,
        material,
        extension,
        isDefining,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: StartingMaterial): Option[(Option[String], Option[CodeableConcept], Option[Choice["SubstanceAmount"]], Option[CodeableConcept], LitSeq[Extension], Option[Boolean], LitSeq[Extension])] =
        Some((o.id, o.`type`, o.amount, o.material, o.extension, o.isDefining, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val amount: FHIRComponentFieldMeta[Option[Choice["SubstanceAmount"]]] =
        FHIRComponentFieldMeta(
          "amount",
          lTagOf[Option[Choice["SubstanceAmount"]]],
          false,
          lTagOf[Choice["SubstanceAmount"]])
      val material: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("material", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val isDefining: FHIRComponentFieldMeta[Option[Boolean]] =
        FHIRComponentFieldMeta("isDefining", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
        Seq(id, `type`, amount, material, extension, isDefining, modifierExtension)
      override def fields(t: StartingMaterial): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
        FHIRComponentField[Option[Choice["SubstanceAmount"]]](amount, t.amount),
        FHIRComponentField[Option[CodeableConcept]](material, t.material),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[Boolean]](isDefining, t.isDefining),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[StartingMaterial] = this
      val thisName: String                         = "StartingMaterial"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[StartingMaterial] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new StartingMaterial(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
              cursor.decodeAs[Option[Choice["SubstanceAmount"]]]("amount", Some(None)),
              cursor.decodeAs[Option[CodeableConcept]]("material", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[Boolean]]("isDefining", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class StartingMaterial(
        override val id: Option[String] = None,
        val `type`: Option[CodeableConcept] = None,
        val amount: Option[Choice["SubstanceAmount"]] = None,
        val material: Option[CodeableConcept] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val isDefining: Option[Boolean] = None,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        ratioType: Option[CodeableConcept] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        startingMaterial: LitSeq[MonomerSet.StartingMaterial] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): MonomerSet = new MonomerSet(
      id,
      extension,
      ratioType,
      modifierExtension,
      startingMaterial,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: MonomerSet): Option[(Option[String], LitSeq[Extension], Option[CodeableConcept], LitSeq[Extension], LitSeq[MonomerSet.StartingMaterial])] =
      Some((o.id, o.extension, o.ratioType, o.modifierExtension, o.startingMaterial))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val ratioType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("ratioType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val startingMaterial: FHIRComponentFieldMeta[LitSeq[MonomerSet.StartingMaterial]] =
      FHIRComponentFieldMeta(
        "startingMaterial",
        lTagOf[LitSeq[MonomerSet.StartingMaterial]],
        false,
        lTagOf[MonomerSet.StartingMaterial])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, extension, ratioType, modifierExtension, startingMaterial)
    override def fields(t: MonomerSet): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[CodeableConcept]](ratioType, t.ratioType),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[MonomerSet.StartingMaterial]](startingMaterial, t.startingMaterial)
    )
    val baseType: CompanionFor[MonomerSet] = this
    val thisName: String                   = "MonomerSet"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[MonomerSet] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new MonomerSet(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[CodeableConcept]]("ratioType", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[MonomerSet.StartingMaterial]]("startingMaterial", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class MonomerSet(
      override val id: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val ratioType: Option[CodeableConcept] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val startingMaterial: LitSeq[MonomerSet.StartingMaterial] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      `class`: Option[CodeableConcept] = None,
      language: Option[LANGUAGES] = None,
      geometry: Option[CodeableConcept] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      modification: LitSeq[String] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      copolymerConnectivity: LitSeq[CodeableConcept] = LitSeq.empty,
      monomerSet: LitSeq[SubstancePolymer.MonomerSet] = LitSeq.empty,
      repeat: LitSeq[SubstancePolymer.Repeat] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): SubstancePolymer = new SubstancePolymer(
    id,
    meta,
    text,
    `class`,
    language,
    geometry,
    contained,
    extension,
    modification,
    implicitRules,
    modifierExtension,
    copolymerConnectivity,
    monomerSet,
    repeat,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val `class`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("class", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val geometry: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("geometry", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val modification: FHIRComponentFieldMeta[LitSeq[String]] =
    FHIRComponentFieldMeta("modification", lTagOf[LitSeq[String]], false, lTagOf[String])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val copolymerConnectivity: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("copolymerConnectivity", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val monomerSet: FHIRComponentFieldMeta[LitSeq[SubstancePolymer.MonomerSet]] =
    FHIRComponentFieldMeta(
      "monomerSet",
      lTagOf[LitSeq[SubstancePolymer.MonomerSet]],
      false,
      lTagOf[SubstancePolymer.MonomerSet])
  val repeat: FHIRComponentFieldMeta[LitSeq[SubstancePolymer.Repeat]] =
    FHIRComponentFieldMeta("repeat", lTagOf[LitSeq[SubstancePolymer.Repeat]], false, lTagOf[SubstancePolymer.Repeat])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    `class`,
    language,
    geometry,
    contained,
    extension,
    modification,
    implicitRules,
    modifierExtension,
    copolymerConnectivity,
    monomerSet,
    repeat)
  override def fields(t: SubstancePolymer): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[CodeableConcept]](`class`, t.`class`),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Option[CodeableConcept]](geometry, t.geometry),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[String]](modification, t.modification),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[CodeableConcept]](copolymerConnectivity, t.copolymerConnectivity),
    FHIRComponentField[LitSeq[SubstancePolymer.MonomerSet]](monomerSet, t.monomerSet),
    FHIRComponentField[LitSeq[SubstancePolymer.Repeat]](repeat, t.repeat)
  )
  def extractId(t: SubstancePolymer): Option[String]                              = t.id
  def extractMeta(t: SubstancePolymer): Option[Meta]                              = t.meta
  def extractText(t: SubstancePolymer): Option[Narrative]                         = t.text
  def extractClass(t: SubstancePolymer): Option[CodeableConcept]                  = t.`class`
  def extractLanguage(t: SubstancePolymer): Option[LANGUAGES]                     = t.language
  def extractGeometry(t: SubstancePolymer): Option[CodeableConcept]               = t.geometry
  def extractContained(t: SubstancePolymer): LitSeq[Resource]                     = t.contained
  def extractExtension(t: SubstancePolymer): LitSeq[Extension]                    = t.extension
  def extractModification(t: SubstancePolymer): LitSeq[String]                    = t.modification
  def extractImplicitRules(t: SubstancePolymer): Option[UriStr]                   = t.implicitRules
  def extractModifierExtension(t: SubstancePolymer): LitSeq[Extension]            = t.modifierExtension
  def extractCopolymerConnectivity(t: SubstancePolymer): LitSeq[CodeableConcept]  = t.copolymerConnectivity
  def extractMonomerSet(t: SubstancePolymer): LitSeq[SubstancePolymer.MonomerSet] = t.monomerSet
  def extractRepeat(t: SubstancePolymer): LitSeq[SubstancePolymer.Repeat]         = t.repeat
  override val thisName: String                                                   = "SubstancePolymer"
  def unapply(
      o: SubstancePolymer): Option[(Option[String], Option[Meta], Option[Narrative], Option[CodeableConcept], Option[LANGUAGES], Option[CodeableConcept], LitSeq[Resource], LitSeq[Extension], LitSeq[String], Option[UriStr], LitSeq[Extension], LitSeq[CodeableConcept], LitSeq[SubstancePolymer.MonomerSet], LitSeq[SubstancePolymer.Repeat])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.`class`,
        o.language,
        o.geometry,
        o.contained,
        o.extension,
        o.modification,
        o.implicitRules,
        o.modifierExtension,
        o.copolymerConnectivity,
        o.monomerSet,
        o.repeat))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[SubstancePolymer] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new SubstancePolymer(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("class", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("geometry", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[String]]("modification", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("copolymerConnectivity", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[SubstancePolymer.MonomerSet]]("monomerSet", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[SubstancePolymer.Repeat]]("repeat", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Todo.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields `class`, geometry, modification, copolymerConnectivity, monomerSet, repeat.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param `class` - Todo.
  * @param language - The base language in which the resource is written.
  * @param geometry - Todo.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param modification - Todo.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param copolymerConnectivity - Todo.
  * @param monomerSet - Todo.
  * @param repeat - Todo.
  */
@POJOBoilerplate
class SubstancePolymer(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val `class`: Option[CodeableConcept] = None,
    override val language: Option[LANGUAGES] = None,
    val geometry: Option[CodeableConcept] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val modification: LitSeq[String] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val copolymerConnectivity: LitSeq[CodeableConcept] = LitSeq.empty,
    val monomerSet: LitSeq[SubstancePolymer.MonomerSet] = LitSeq.empty,
    val repeat: LitSeq[SubstancePolymer.Repeat] = LitSeq.empty,
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
  override val thisTypeName: String = "SubstancePolymer"
}
