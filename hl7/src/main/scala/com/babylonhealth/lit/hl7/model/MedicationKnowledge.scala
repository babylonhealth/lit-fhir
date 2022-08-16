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
import com.babylonhealth.lit.hl7.MEDICATIONKNOWLEDGE_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object MedicationKnowledge extends CompanionFor[MedicationKnowledge] {
  implicit def summonObjectAndCompanionMedicationKnowledge1302773850(
      o: MedicationKnowledge): ObjectAndCompanion[MedicationKnowledge, MedicationKnowledge.type] = ObjectAndCompanion(o, this)
  override type ResourceType = MedicationKnowledge
  override type ParentType   = MedicationKnowledge
  override val baseType: CompanionFor[ResourceType] = MedicationKnowledge
  override val parentType: CompanionFor[ParentType] = MedicationKnowledge
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/MedicationKnowledge")
  object AdministrationGuidelines extends CompanionFor[AdministrationGuidelines] {
    implicit def summonObjectAndCompanionAdministrationGuidelines_1219593058(
        o: AdministrationGuidelines): ObjectAndCompanion[AdministrationGuidelines, AdministrationGuidelines.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = AdministrationGuidelines
    override type ParentType   = AdministrationGuidelines
    override val parentType: CompanionFor[ResourceType] = AdministrationGuidelines
    object Dosage extends CompanionFor[Dosage] {
      implicit def summonObjectAndCompanionDosage_1769953391(o: Dosage): ObjectAndCompanion[Dosage, Dosage.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Dosage
      override type ParentType   = Dosage
      override val parentType: CompanionFor[ResourceType] = Dosage
      def apply(
          id: Option[String] = None,
          `type`: CodeableConcept,
          dosage: NonEmptyLitSeq[core.model.Dosage],
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Dosage = new Dosage(
        id,
        `type`,
        dosage,
        extension,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Dosage): Option[(Option[String], CodeableConcept, NonEmptyLitSeq[core.model.Dosage], LitSeq[Extension], LitSeq[Extension])] =
        Some((o.id, o.`type`, o.dosage, o.extension, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val `type`: FHIRComponentFieldMeta[CodeableConcept] =
        FHIRComponentFieldMeta("type", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
      val dosage: FHIRComponentFieldMeta[NonEmptyLitSeq[core.model.Dosage]] =
        FHIRComponentFieldMeta("dosage", lTagOf[NonEmptyLitSeq[core.model.Dosage]], false, lTagOf[core.model.Dosage])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, `type`, dosage, extension, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Dosage): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[CodeableConcept](`type`, t.`type`),
        FHIRComponentField[NonEmptyLitSeq[core.model.Dosage]](dosage, t.dosage),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Dosage] = this
      val thisName: String               = "Dosage"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Dosage] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Dosage(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[CodeableConcept]("type", None),
              cursor.decodeAs[NonEmptyLitSeq[core.model.Dosage]]("dosage", None),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Dosage(
        override val id: Option[String] = None,
        val `type`: CodeableConcept,
        val dosage: NonEmptyLitSeq[core.model.Dosage],
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object PatientCharacteristics extends CompanionFor[PatientCharacteristics] {
      implicit def summonObjectAndCompanionPatientCharacteristics_1769953391(
          o: PatientCharacteristics): ObjectAndCompanion[PatientCharacteristics, PatientCharacteristics.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = PatientCharacteristics
      override type ParentType   = PatientCharacteristics
      override val parentType: CompanionFor[ResourceType] = PatientCharacteristics
      type CharacteristicChoice = Choice[UnionCodeableConceptOrQuantity]
      def apply(
          id: Option[String] = None,
          value: LitSeq[String] = LitSeq.empty,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          characteristic: PatientCharacteristics.CharacteristicChoice,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): PatientCharacteristics = new PatientCharacteristics(
        id,
        value,
        extension,
        modifierExtension,
        characteristic,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: PatientCharacteristics): Option[(Option[String], LitSeq[String], LitSeq[Extension], LitSeq[Extension], PatientCharacteristics.CharacteristicChoice)] =
        Some((o.id, o.value, o.extension, o.modifierExtension, o.characteristic))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val value: FHIRComponentFieldMeta[LitSeq[String]] =
        FHIRComponentFieldMeta("value", lTagOf[LitSeq[String]], false, lTagOf[String])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val characteristic: FHIRComponentFieldMeta[PatientCharacteristics.CharacteristicChoice] =
        FHIRComponentFieldMeta(
          "characteristic",
          lTagOf[PatientCharacteristics.CharacteristicChoice],
          true,
          lTagOf[UnionCodeableConceptOrQuantity])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value, extension, modifierExtension, characteristic)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: PatientCharacteristics): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[LitSeq[String]](value, t.value),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
        FHIRComponentField[PatientCharacteristics.CharacteristicChoice](characteristic, t.characteristic)
      )
      val baseType: CompanionFor[PatientCharacteristics] = this
      val thisName: String                               = "PatientCharacteristics"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[PatientCharacteristics] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new PatientCharacteristics(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[LitSeq[String]]("value", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              cursor.decodeRef[UnionCodeableConceptOrQuantity]("characteristic"),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class PatientCharacteristics(
        override val id: Option[String] = None,
        val value: LitSeq[String] = LitSeq.empty,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        val characteristic: PatientCharacteristics.CharacteristicChoice,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    type IndicationChoice = Choice[UnionCodeableConceptOrReference]
    def apply(
        id: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        indication: Option[AdministrationGuidelines.IndicationChoice] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        dosage: LitSeq[AdministrationGuidelines.Dosage] = LitSeq.empty,
        patientCharacteristics: LitSeq[AdministrationGuidelines.PatientCharacteristics] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): AdministrationGuidelines = new AdministrationGuidelines(
      id,
      extension,
      indication,
      modifierExtension,
      dosage,
      patientCharacteristics,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: AdministrationGuidelines): Option[(Option[String], LitSeq[Extension], Option[AdministrationGuidelines.IndicationChoice], LitSeq[Extension], LitSeq[AdministrationGuidelines.Dosage], LitSeq[AdministrationGuidelines.PatientCharacteristics])] =
      Some((o.id, o.extension, o.indication, o.modifierExtension, o.dosage, o.patientCharacteristics))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val indication: FHIRComponentFieldMeta[Option[AdministrationGuidelines.IndicationChoice]] =
      FHIRComponentFieldMeta(
        "indication",
        lTagOf[Option[AdministrationGuidelines.IndicationChoice]],
        true,
        lTagOf[UnionCodeableConceptOrReference])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val dosage: FHIRComponentFieldMeta[LitSeq[AdministrationGuidelines.Dosage]] =
      FHIRComponentFieldMeta(
        "dosage",
        lTagOf[LitSeq[AdministrationGuidelines.Dosage]],
        false,
        lTagOf[AdministrationGuidelines.Dosage])
    val patientCharacteristics: FHIRComponentFieldMeta[LitSeq[AdministrationGuidelines.PatientCharacteristics]] =
      FHIRComponentFieldMeta(
        "patientCharacteristics",
        lTagOf[LitSeq[AdministrationGuidelines.PatientCharacteristics]],
        false,
        lTagOf[AdministrationGuidelines.PatientCharacteristics]
      )
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, extension, indication, modifierExtension, dosage, patientCharacteristics)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: AdministrationGuidelines): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[AdministrationGuidelines.IndicationChoice]](indication, t.indication),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[AdministrationGuidelines.Dosage]](dosage, t.dosage),
      FHIRComponentField[LitSeq[AdministrationGuidelines.PatientCharacteristics]](
        patientCharacteristics,
        t.patientCharacteristics)
    )
    val baseType: CompanionFor[AdministrationGuidelines] = this
    val thisName: String                                 = "AdministrationGuidelines"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[AdministrationGuidelines] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new AdministrationGuidelines(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeOptRef[UnionCodeableConceptOrReference]("indication"),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[AdministrationGuidelines.Dosage]]("dosage", Some(LitSeq.empty)),
            cursor
              .decodeAs[LitSeq[AdministrationGuidelines.PatientCharacteristics]]("patientCharacteristics", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class AdministrationGuidelines(
      override val id: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val indication: Option[AdministrationGuidelines.IndicationChoice] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val dosage: LitSeq[AdministrationGuidelines.Dosage] = LitSeq.empty,
      val patientCharacteristics: LitSeq[AdministrationGuidelines.PatientCharacteristics] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object RelatedMedicationKnowledge extends CompanionFor[RelatedMedicationKnowledge] {
    implicit def summonObjectAndCompanionRelatedMedicationKnowledge_1219593058(
        o: RelatedMedicationKnowledge): ObjectAndCompanion[RelatedMedicationKnowledge, RelatedMedicationKnowledge.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = RelatedMedicationKnowledge
    override type ParentType   = RelatedMedicationKnowledge
    override val parentType: CompanionFor[ResourceType] = RelatedMedicationKnowledge
    def apply(
        id: Option[String] = None,
        `type`: CodeableConcept,
        extension: LitSeq[Extension] = LitSeq.empty,
        reference: NonEmptyLitSeq[Reference],
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): RelatedMedicationKnowledge = new RelatedMedicationKnowledge(
      id,
      `type`,
      extension,
      reference,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: RelatedMedicationKnowledge): Option[(Option[String], CodeableConcept, LitSeq[Extension], NonEmptyLitSeq[Reference], LitSeq[Extension])] =
      Some((o.id, o.`type`, o.extension, o.reference, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("type", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val reference: FHIRComponentFieldMeta[NonEmptyLitSeq[Reference]] =
      FHIRComponentFieldMeta("reference", lTagOf[NonEmptyLitSeq[Reference]], false, lTagOf[Reference])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, `type`, extension, reference, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: RelatedMedicationKnowledge): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[CodeableConcept](`type`, t.`type`),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[NonEmptyLitSeq[Reference]](reference, t.reference),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[RelatedMedicationKnowledge] = this
    val thisName: String                                   = "RelatedMedicationKnowledge"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[RelatedMedicationKnowledge] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new RelatedMedicationKnowledge(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[CodeableConcept]("type", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[NonEmptyLitSeq[Reference]]("reference", None),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class RelatedMedicationKnowledge(
      override val id: Option[String] = None,
      val `type`: CodeableConcept,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val reference: NonEmptyLitSeq[Reference],
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Regulatory extends CompanionFor[Regulatory] {
    implicit def summonObjectAndCompanionRegulatory_1219593058(o: Regulatory): ObjectAndCompanion[Regulatory, Regulatory.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Regulatory
    override type ParentType   = Regulatory
    override val parentType: CompanionFor[ResourceType] = Regulatory
    object Schedule extends CompanionFor[Schedule] {
      implicit def summonObjectAndCompanionSchedule1174993855(o: Schedule): ObjectAndCompanion[Schedule, Schedule.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Schedule
      override type ParentType   = Schedule
      override val parentType: CompanionFor[ResourceType] = Schedule
      def apply(
          id: Option[String] = None,
          schedule: CodeableConcept,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Schedule = new Schedule(
        id,
        schedule,
        extension,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(o: Schedule): Option[(Option[String], CodeableConcept, LitSeq[Extension], LitSeq[Extension])] = Some(
        (o.id, o.schedule, o.extension, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val schedule: FHIRComponentFieldMeta[CodeableConcept] =
        FHIRComponentFieldMeta("schedule", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, schedule, extension, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Schedule): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[CodeableConcept](schedule, t.schedule),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Schedule] = this
      val thisName: String                 = "Schedule"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Schedule] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Schedule(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[CodeableConcept]("schedule", None),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Schedule(
        override val id: Option[String] = None,
        val schedule: CodeableConcept,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object MaxDispense extends CompanionFor[MaxDispense] {
      implicit def summonObjectAndCompanionMaxDispense1174993855(
          o: MaxDispense): ObjectAndCompanion[MaxDispense, MaxDispense.type] = ObjectAndCompanion(o, this)
      override type ResourceType = MaxDispense
      override type ParentType   = MaxDispense
      override val parentType: CompanionFor[ResourceType] = MaxDispense
      def apply(
          id: Option[String] = None,
          period: Option[Duration] = None,
          quantity: Quantity,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): MaxDispense = new MaxDispense(
        id,
        period,
        quantity,
        extension,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(o: MaxDispense): Option[(Option[String], Option[Duration], Quantity, LitSeq[Extension], LitSeq[Extension])] =
        Some((o.id, o.period, o.quantity, o.extension, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val period: FHIRComponentFieldMeta[Option[Duration]] =
        FHIRComponentFieldMeta("period", lTagOf[Option[Duration]], false, lTagOf[Duration])
      val quantity: FHIRComponentFieldMeta[Quantity] =
        FHIRComponentFieldMeta("quantity", lTagOf[Quantity], false, lTagOf[Quantity])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, period, quantity, extension, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: MaxDispense): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[Duration]](period, t.period),
        FHIRComponentField[Quantity](quantity, t.quantity),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[MaxDispense] = this
      val thisName: String                    = "MaxDispense"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[MaxDispense] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new MaxDispense(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[Duration]]("period", Some(None)),
              cursor.decodeAs[Quantity]("quantity", None),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class MaxDispense(
        override val id: Option[String] = None,
        val period: Option[Duration] = None,
        val quantity: Quantity,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object Substitution extends CompanionFor[Substitution] {
      implicit def summonObjectAndCompanionSubstitution1174993855(
          o: Substitution): ObjectAndCompanion[Substitution, Substitution.type] = ObjectAndCompanion(o, this)
      override type ResourceType = Substitution
      override type ParentType   = Substitution
      override val parentType: CompanionFor[ResourceType] = Substitution
      def apply(
          id: Option[String] = None,
          `type`: CodeableConcept,
          allowed: Boolean,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Substitution = new Substitution(
        id,
        `type`,
        allowed,
        extension,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(o: Substitution): Option[(Option[String], CodeableConcept, Boolean, LitSeq[Extension], LitSeq[Extension])] =
        Some((o.id, o.`type`, o.allowed, o.extension, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val `type`: FHIRComponentFieldMeta[CodeableConcept] =
        FHIRComponentFieldMeta("type", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
      val allowed: FHIRComponentFieldMeta[Boolean] =
        FHIRComponentFieldMeta("allowed", lTagOf[Boolean], false, lTagOf[Boolean])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, `type`, allowed, extension, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Substitution): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[CodeableConcept](`type`, t.`type`),
        FHIRComponentField[Boolean](allowed, t.allowed),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Substitution] = this
      val thisName: String                     = "Substitution"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Substitution] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Substitution(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[CodeableConcept]("type", None),
              cursor.decodeAs[Boolean]("allowed", None),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Substitution(
        override val id: Option[String] = None,
        val `type`: CodeableConcept,
        val allowed: Boolean,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        regulatoryAuthority: Reference,
        schedule: LitSeq[Regulatory.Schedule] = LitSeq.empty,
        maxDispense: Option[Regulatory.MaxDispense] = None,
        substitution: LitSeq[Regulatory.Substitution] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Regulatory = new Regulatory(
      id,
      extension,
      modifierExtension,
      regulatoryAuthority,
      schedule,
      maxDispense,
      substitution,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Regulatory): Option[(Option[String], LitSeq[Extension], LitSeq[Extension], Reference, LitSeq[Regulatory.Schedule], Option[Regulatory.MaxDispense], LitSeq[Regulatory.Substitution])] =
      Some((o.id, o.extension, o.modifierExtension, o.regulatoryAuthority, o.schedule, o.maxDispense, o.substitution))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val regulatoryAuthority: FHIRComponentFieldMeta[Reference] =
      FHIRComponentFieldMeta("regulatoryAuthority", lTagOf[Reference], false, lTagOf[Reference])
    val schedule: FHIRComponentFieldMeta[LitSeq[Regulatory.Schedule]] =
      FHIRComponentFieldMeta("schedule", lTagOf[LitSeq[Regulatory.Schedule]], false, lTagOf[Regulatory.Schedule])
    val maxDispense: FHIRComponentFieldMeta[Option[Regulatory.MaxDispense]] =
      FHIRComponentFieldMeta("maxDispense", lTagOf[Option[Regulatory.MaxDispense]], false, lTagOf[Regulatory.MaxDispense])
    val substitution: FHIRComponentFieldMeta[LitSeq[Regulatory.Substitution]] =
      FHIRComponentFieldMeta("substitution", lTagOf[LitSeq[Regulatory.Substitution]], false, lTagOf[Regulatory.Substitution])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, extension, modifierExtension, regulatoryAuthority, schedule, maxDispense, substitution)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Regulatory): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Reference](regulatoryAuthority, t.regulatoryAuthority),
      FHIRComponentField[LitSeq[Regulatory.Schedule]](schedule, t.schedule),
      FHIRComponentField[Option[Regulatory.MaxDispense]](maxDispense, t.maxDispense),
      FHIRComponentField[LitSeq[Regulatory.Substitution]](substitution, t.substitution)
    )
    val baseType: CompanionFor[Regulatory] = this
    val thisName: String                   = "Regulatory"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Regulatory] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Regulatory(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[Reference]("regulatoryAuthority", None),
            cursor.decodeAs[LitSeq[Regulatory.Schedule]]("schedule", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Regulatory.MaxDispense]]("maxDispense", Some(None)),
            cursor.decodeAs[LitSeq[Regulatory.Substitution]]("substitution", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Regulatory(
      override val id: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val regulatoryAuthority: Reference,
      val schedule: LitSeq[Regulatory.Schedule] = LitSeq.empty,
      val maxDispense: Option[Regulatory.MaxDispense] = None,
      val substitution: LitSeq[Regulatory.Substitution] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object MedicineClassification extends CompanionFor[MedicineClassification] {
    implicit def summonObjectAndCompanionMedicineClassification_1219593058(
        o: MedicineClassification): ObjectAndCompanion[MedicineClassification, MedicineClassification.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = MedicineClassification
    override type ParentType   = MedicineClassification
    override val parentType: CompanionFor[ResourceType] = MedicineClassification
    def apply(
        id: Option[String] = None,
        `type`: CodeableConcept,
        extension: LitSeq[Extension] = LitSeq.empty,
        classification: LitSeq[CodeableConcept] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): MedicineClassification = new MedicineClassification(
      id,
      `type`,
      extension,
      classification,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: MedicineClassification): Option[(Option[String], CodeableConcept, LitSeq[Extension], LitSeq[CodeableConcept], LitSeq[Extension])] =
      Some((o.id, o.`type`, o.extension, o.classification, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("type", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val classification: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("classification", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, `type`, extension, classification, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: MedicineClassification): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[CodeableConcept](`type`, t.`type`),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[CodeableConcept]](classification, t.classification),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[MedicineClassification] = this
    val thisName: String                               = "MedicineClassification"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[MedicineClassification] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new MedicineClassification(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[CodeableConcept]("type", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("classification", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class MedicineClassification(
      override val id: Option[String] = None,
      val `type`: CodeableConcept,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val classification: LitSeq[CodeableConcept] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object DrugCharacteristic extends CompanionFor[DrugCharacteristic] {
    implicit def summonObjectAndCompanionDrugCharacteristic_1219593058(
        o: DrugCharacteristic): ObjectAndCompanion[DrugCharacteristic, DrugCharacteristic.type] = ObjectAndCompanion(o, this)
    override type ResourceType = DrugCharacteristic
    override type ParentType   = DrugCharacteristic
    override val parentType: CompanionFor[ResourceType] = DrugCharacteristic
    type ValueChoice = Choice[Union_0600299688]
    def apply(
        id: Option[String] = None,
        `type`: Option[CodeableConcept] = None,
        value: Option[DrugCharacteristic.ValueChoice] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): DrugCharacteristic = new DrugCharacteristic(
      id,
      `type`,
      value,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: DrugCharacteristic): Option[(Option[String], Option[CodeableConcept], Option[DrugCharacteristic.ValueChoice], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.`type`, o.value, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val value: FHIRComponentFieldMeta[Option[DrugCharacteristic.ValueChoice]] =
      FHIRComponentFieldMeta("value", lTagOf[Option[DrugCharacteristic.ValueChoice]], true, lTagOf[Union_0600299688])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, `type`, value, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: DrugCharacteristic): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[Option[DrugCharacteristic.ValueChoice]](value, t.value),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[DrugCharacteristic] = this
    val thisName: String                           = "DrugCharacteristic"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[DrugCharacteristic] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new DrugCharacteristic(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
            cursor.decodeOptRef[Union_0600299688]("value"),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class DrugCharacteristic(
      override val id: Option[String] = None,
      val `type`: Option[CodeableConcept] = None,
      val value: Option[DrugCharacteristic.ValueChoice] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object MonitoringProgram extends CompanionFor[MonitoringProgram] {
    implicit def summonObjectAndCompanionMonitoringProgram_1219593058(
        o: MonitoringProgram): ObjectAndCompanion[MonitoringProgram, MonitoringProgram.type] = ObjectAndCompanion(o, this)
    override type ResourceType = MonitoringProgram
    override type ParentType   = MonitoringProgram
    override val parentType: CompanionFor[ResourceType] = MonitoringProgram
    def apply(
        id: Option[String] = None,
        `type`: Option[CodeableConcept] = None,
        name: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): MonitoringProgram = new MonitoringProgram(
      id,
      `type`,
      name,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: MonitoringProgram): Option[(Option[String], Option[CodeableConcept], Option[String], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.`type`, o.name, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val name: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("name", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, `type`, name, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: MonitoringProgram): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[Option[String]](name, t.name),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[MonitoringProgram] = this
    val thisName: String                          = "MonitoringProgram"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[MonitoringProgram] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new MonitoringProgram(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
            cursor.decodeAs[Option[String]]("name", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class MonitoringProgram(
      override val id: Option[String] = None,
      val `type`: Option[CodeableConcept] = None,
      val name: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Ingredient extends CompanionFor[Ingredient] {
    implicit def summonObjectAndCompanionIngredient_1219593058(o: Ingredient): ObjectAndCompanion[Ingredient, Ingredient.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Ingredient
    override type ParentType   = Ingredient
    override val parentType: CompanionFor[ResourceType] = Ingredient
    type ItemChoice = Choice[UnionCodeableConceptOrReference]
    def apply(
        id: Option[String] = None,
        item: Ingredient.ItemChoice,
        isActive: Option[Boolean] = None,
        strength: Option[Ratio] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Ingredient = new Ingredient(
      id,
      item,
      isActive,
      strength,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Ingredient): Option[(Option[String], Ingredient.ItemChoice, Option[Boolean], Option[Ratio], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.item, o.isActive, o.strength, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val item: FHIRComponentFieldMeta[Ingredient.ItemChoice] =
      FHIRComponentFieldMeta("item", lTagOf[Ingredient.ItemChoice], true, lTagOf[UnionCodeableConceptOrReference])
    val isActive: FHIRComponentFieldMeta[Option[Boolean]] =
      FHIRComponentFieldMeta("isActive", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
    val strength: FHIRComponentFieldMeta[Option[Ratio]] =
      FHIRComponentFieldMeta("strength", lTagOf[Option[Ratio]], false, lTagOf[Ratio])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, item, isActive, strength, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Ingredient): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Ingredient.ItemChoice](item, t.item),
      FHIRComponentField[Option[Boolean]](isActive, t.isActive),
      FHIRComponentField[Option[Ratio]](strength, t.strength),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Ingredient] = this
    val thisName: String                   = "Ingredient"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Ingredient] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Ingredient(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeRef[UnionCodeableConceptOrReference]("item"),
            cursor.decodeAs[Option[Boolean]]("isActive", Some(None)),
            cursor.decodeAs[Option[Ratio]]("strength", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Ingredient(
      override val id: Option[String] = None,
      val item: Ingredient.ItemChoice,
      val isActive: Option[Boolean] = None,
      val strength: Option[Ratio] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Packaging extends CompanionFor[Packaging] {
    implicit def summonObjectAndCompanionPackaging_1219593058(o: Packaging): ObjectAndCompanion[Packaging, Packaging.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Packaging
    override type ParentType   = Packaging
    override val parentType: CompanionFor[ResourceType] = Packaging
    def apply(
        id: Option[String] = None,
        `type`: Option[CodeableConcept] = None,
        quantity: Option[Quantity] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Packaging = new Packaging(
      id,
      `type`,
      quantity,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Packaging): Option[(Option[String], Option[CodeableConcept], Option[Quantity], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.`type`, o.quantity, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val quantity: FHIRComponentFieldMeta[Option[Quantity]] =
      FHIRComponentFieldMeta("quantity", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, `type`, quantity, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Packaging): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[Option[Quantity]](quantity, t.quantity),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Packaging] = this
    val thisName: String                  = "Packaging"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Packaging] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Packaging(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
            cursor.decodeAs[Option[Quantity]]("quantity", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Packaging(
      override val id: Option[String] = None,
      val `type`: Option[CodeableConcept] = None,
      val quantity: Option[Quantity] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Monograph extends CompanionFor[Monograph] {
    implicit def summonObjectAndCompanionMonograph_1219593058(o: Monograph): ObjectAndCompanion[Monograph, Monograph.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Monograph
    override type ParentType   = Monograph
    override val parentType: CompanionFor[ResourceType] = Monograph
    def apply(
        id: Option[String] = None,
        `type`: Option[CodeableConcept] = None,
        source: Option[Reference] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Monograph = new Monograph(
      id,
      `type`,
      source,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Monograph): Option[(Option[String], Option[CodeableConcept], Option[Reference], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.`type`, o.source, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val source: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("source", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, `type`, source, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Monograph): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[Option[Reference]](source, t.source),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Monograph] = this
    val thisName: String                  = "Monograph"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Monograph] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Monograph(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
            cursor.decodeAs[Option[Reference]]("source", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Monograph(
      override val id: Option[String] = None,
      val `type`: Option[CodeableConcept] = None,
      val source: Option[Reference] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Kinetics extends CompanionFor[Kinetics] {
    implicit def summonObjectAndCompanionKinetics_1219593058(o: Kinetics): ObjectAndCompanion[Kinetics, Kinetics.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Kinetics
    override type ParentType   = Kinetics
    override val parentType: CompanionFor[ResourceType] = Kinetics
    def apply(
        id: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        lethalDose50: LitSeq[Quantity] = LitSeq.empty,
        areaUnderCurve: LitSeq[Quantity] = LitSeq.empty,
        halfLifePeriod: Option[Duration] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Kinetics = new Kinetics(
      id,
      extension,
      lethalDose50,
      areaUnderCurve,
      halfLifePeriod,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Kinetics): Option[(Option[String], LitSeq[Extension], LitSeq[Quantity], LitSeq[Quantity], Option[Duration], LitSeq[Extension])] =
      Some((o.id, o.extension, o.lethalDose50, o.areaUnderCurve, o.halfLifePeriod, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val lethalDose50: FHIRComponentFieldMeta[LitSeq[Quantity]] =
      FHIRComponentFieldMeta("lethalDose50", lTagOf[LitSeq[Quantity]], false, lTagOf[Quantity])
    val areaUnderCurve: FHIRComponentFieldMeta[LitSeq[Quantity]] =
      FHIRComponentFieldMeta("areaUnderCurve", lTagOf[LitSeq[Quantity]], false, lTagOf[Quantity])
    val halfLifePeriod: FHIRComponentFieldMeta[Option[Duration]] =
      FHIRComponentFieldMeta("halfLifePeriod", lTagOf[Option[Duration]], false, lTagOf[Duration])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, extension, lethalDose50, areaUnderCurve, halfLifePeriod, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Kinetics): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Quantity]](lethalDose50, t.lethalDose50),
      FHIRComponentField[LitSeq[Quantity]](areaUnderCurve, t.areaUnderCurve),
      FHIRComponentField[Option[Duration]](halfLifePeriod, t.halfLifePeriod),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Kinetics] = this
    val thisName: String                 = "Kinetics"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Kinetics] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Kinetics(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Quantity]]("lethalDose50", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Quantity]]("areaUnderCurve", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Duration]]("halfLifePeriod", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Kinetics(
      override val id: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val lethalDose50: LitSeq[Quantity] = LitSeq.empty,
      val areaUnderCurve: LitSeq[Quantity] = LitSeq.empty,
      val halfLifePeriod: Option[Duration] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Cost extends CompanionFor[Cost] {
    implicit def summonObjectAndCompanionCost_1219593058(o: Cost): ObjectAndCompanion[Cost, Cost.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Cost
    override type ParentType   = Cost
    override val parentType: CompanionFor[ResourceType] = Cost
    def apply(
        id: Option[String] = None,
        `type`: CodeableConcept,
        cost: Money,
        source: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Cost = new Cost(
      id,
      `type`,
      cost,
      source,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(o: Cost): Option[(Option[String], CodeableConcept, Money, Option[String], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.`type`, o.cost, o.source, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("type", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val cost: FHIRComponentFieldMeta[Money] =
      FHIRComponentFieldMeta("cost", lTagOf[Money], false, lTagOf[Money])
    val source: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("source", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, `type`, cost, source, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Cost): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[CodeableConcept](`type`, t.`type`),
      FHIRComponentField[Money](cost, t.cost),
      FHIRComponentField[Option[String]](source, t.source),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Cost] = this
    val thisName: String             = "Cost"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Cost] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Cost(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[CodeableConcept]("type", None),
            cursor.decodeAs[Money]("cost", None),
            cursor.decodeAs[Option[String]]("source", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Cost(
      override val id: Option[String] = None,
      val `type`: CodeableConcept,
      val cost: Money,
      val source: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      code: Option[CodeableConcept] = None,
      status: Option[MEDICATIONKNOWLEDGE_STATUS] = None,
      amount: Option[Quantity] = None,
      synonym: LitSeq[String] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      doseForm: Option[CodeableConcept] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      productType: LitSeq[CodeableConcept] = LitSeq.empty,
      manufacturer: Option[Reference] = None,
      implicitRules: Option[UriStr] = None,
      intendedRoute: LitSeq[CodeableConcept] = LitSeq.empty,
      contraindication: LitSeq[Reference] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      associatedMedication: LitSeq[Reference] = LitSeq.empty,
      preparationInstruction: Option[Markdown] = None,
      cost: LitSeq[MedicationKnowledge.Cost] = LitSeq.empty,
      kinetics: LitSeq[MedicationKnowledge.Kinetics] = LitSeq.empty,
      monograph: LitSeq[MedicationKnowledge.Monograph] = LitSeq.empty,
      packaging: Option[MedicationKnowledge.Packaging] = None,
      ingredient: LitSeq[MedicationKnowledge.Ingredient] = LitSeq.empty,
      monitoringProgram: LitSeq[MedicationKnowledge.MonitoringProgram] = LitSeq.empty,
      drugCharacteristic: LitSeq[MedicationKnowledge.DrugCharacteristic] = LitSeq.empty,
      medicineClassification: LitSeq[MedicationKnowledge.MedicineClassification] = LitSeq.empty,
      regulatory: LitSeq[MedicationKnowledge.Regulatory] = LitSeq.empty,
      relatedMedicationKnowledge: LitSeq[MedicationKnowledge.RelatedMedicationKnowledge] = LitSeq.empty,
      administrationGuidelines: LitSeq[MedicationKnowledge.AdministrationGuidelines] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): MedicationKnowledge = new MedicationKnowledge(
    id,
    meta,
    text,
    code,
    status,
    amount,
    synonym,
    language,
    doseForm,
    contained,
    extension,
    productType,
    manufacturer,
    implicitRules,
    intendedRoute,
    contraindication,
    modifierExtension,
    associatedMedication,
    preparationInstruction,
    cost,
    kinetics,
    monograph,
    packaging,
    ingredient,
    monitoringProgram,
    drugCharacteristic,
    medicineClassification,
    regulatory,
    relatedMedicationKnowledge,
    administrationGuidelines,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val code: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("code", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val status: FHIRComponentFieldMeta[Option[MEDICATIONKNOWLEDGE_STATUS]] =
    FHIRComponentFieldMeta("status", lTagOf[Option[MEDICATIONKNOWLEDGE_STATUS]], false, lTagOf[MEDICATIONKNOWLEDGE_STATUS])
  val amount: FHIRComponentFieldMeta[Option[Quantity]] =
    FHIRComponentFieldMeta("amount", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
  val synonym: FHIRComponentFieldMeta[LitSeq[String]] =
    FHIRComponentFieldMeta("synonym", lTagOf[LitSeq[String]], false, lTagOf[String])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val doseForm: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("doseForm", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val productType: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("productType", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val manufacturer: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("manufacturer", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val intendedRoute: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("intendedRoute", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val contraindication: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("contraindication", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val associatedMedication: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("associatedMedication", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val preparationInstruction: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("preparationInstruction", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val cost: FHIRComponentFieldMeta[LitSeq[MedicationKnowledge.Cost]] =
    FHIRComponentFieldMeta("cost", lTagOf[LitSeq[MedicationKnowledge.Cost]], false, lTagOf[MedicationKnowledge.Cost])
  val kinetics: FHIRComponentFieldMeta[LitSeq[MedicationKnowledge.Kinetics]] =
    FHIRComponentFieldMeta("kinetics", lTagOf[LitSeq[MedicationKnowledge.Kinetics]], false, lTagOf[MedicationKnowledge.Kinetics])
  val monograph: FHIRComponentFieldMeta[LitSeq[MedicationKnowledge.Monograph]] =
    FHIRComponentFieldMeta(
      "monograph",
      lTagOf[LitSeq[MedicationKnowledge.Monograph]],
      false,
      lTagOf[MedicationKnowledge.Monograph])
  val packaging: FHIRComponentFieldMeta[Option[MedicationKnowledge.Packaging]] =
    FHIRComponentFieldMeta(
      "packaging",
      lTagOf[Option[MedicationKnowledge.Packaging]],
      false,
      lTagOf[MedicationKnowledge.Packaging])
  val ingredient: FHIRComponentFieldMeta[LitSeq[MedicationKnowledge.Ingredient]] =
    FHIRComponentFieldMeta(
      "ingredient",
      lTagOf[LitSeq[MedicationKnowledge.Ingredient]],
      false,
      lTagOf[MedicationKnowledge.Ingredient])
  val monitoringProgram: FHIRComponentFieldMeta[LitSeq[MedicationKnowledge.MonitoringProgram]] =
    FHIRComponentFieldMeta(
      "monitoringProgram",
      lTagOf[LitSeq[MedicationKnowledge.MonitoringProgram]],
      false,
      lTagOf[MedicationKnowledge.MonitoringProgram])
  val drugCharacteristic: FHIRComponentFieldMeta[LitSeq[MedicationKnowledge.DrugCharacteristic]] =
    FHIRComponentFieldMeta(
      "drugCharacteristic",
      lTagOf[LitSeq[MedicationKnowledge.DrugCharacteristic]],
      false,
      lTagOf[MedicationKnowledge.DrugCharacteristic])
  val medicineClassification: FHIRComponentFieldMeta[LitSeq[MedicationKnowledge.MedicineClassification]] =
    FHIRComponentFieldMeta(
      "medicineClassification",
      lTagOf[LitSeq[MedicationKnowledge.MedicineClassification]],
      false,
      lTagOf[MedicationKnowledge.MedicineClassification])
  val regulatory: FHIRComponentFieldMeta[LitSeq[MedicationKnowledge.Regulatory]] =
    FHIRComponentFieldMeta(
      "regulatory",
      lTagOf[LitSeq[MedicationKnowledge.Regulatory]],
      false,
      lTagOf[MedicationKnowledge.Regulatory])
  val relatedMedicationKnowledge: FHIRComponentFieldMeta[LitSeq[MedicationKnowledge.RelatedMedicationKnowledge]] =
    FHIRComponentFieldMeta(
      "relatedMedicationKnowledge",
      lTagOf[LitSeq[MedicationKnowledge.RelatedMedicationKnowledge]],
      false,
      lTagOf[MedicationKnowledge.RelatedMedicationKnowledge]
    )
  val administrationGuidelines: FHIRComponentFieldMeta[LitSeq[MedicationKnowledge.AdministrationGuidelines]] =
    FHIRComponentFieldMeta(
      "administrationGuidelines",
      lTagOf[LitSeq[MedicationKnowledge.AdministrationGuidelines]],
      false,
      lTagOf[MedicationKnowledge.AdministrationGuidelines])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    code,
    status,
    amount,
    synonym,
    language,
    doseForm,
    contained,
    extension,
    productType,
    manufacturer,
    implicitRules,
    intendedRoute,
    contraindication,
    modifierExtension,
    associatedMedication,
    preparationInstruction,
    cost,
    kinetics,
    monograph,
    packaging,
    ingredient,
    monitoringProgram,
    drugCharacteristic,
    medicineClassification,
    regulatory,
    relatedMedicationKnowledge,
    administrationGuidelines
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: MedicationKnowledge): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[CodeableConcept]](code, t.code),
    FHIRComponentField[Option[MEDICATIONKNOWLEDGE_STATUS]](status, t.status),
    FHIRComponentField[Option[Quantity]](amount, t.amount),
    FHIRComponentField[LitSeq[String]](synonym, t.synonym),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Option[CodeableConcept]](doseForm, t.doseForm),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[CodeableConcept]](productType, t.productType),
    FHIRComponentField[Option[Reference]](manufacturer, t.manufacturer),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[CodeableConcept]](intendedRoute, t.intendedRoute),
    FHIRComponentField[LitSeq[Reference]](contraindication, t.contraindication),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[Reference]](associatedMedication, t.associatedMedication),
    FHIRComponentField[Option[Markdown]](preparationInstruction, t.preparationInstruction),
    FHIRComponentField[LitSeq[MedicationKnowledge.Cost]](cost, t.cost),
    FHIRComponentField[LitSeq[MedicationKnowledge.Kinetics]](kinetics, t.kinetics),
    FHIRComponentField[LitSeq[MedicationKnowledge.Monograph]](monograph, t.monograph),
    FHIRComponentField[Option[MedicationKnowledge.Packaging]](packaging, t.packaging),
    FHIRComponentField[LitSeq[MedicationKnowledge.Ingredient]](ingredient, t.ingredient),
    FHIRComponentField[LitSeq[MedicationKnowledge.MonitoringProgram]](monitoringProgram, t.monitoringProgram),
    FHIRComponentField[LitSeq[MedicationKnowledge.DrugCharacteristic]](drugCharacteristic, t.drugCharacteristic),
    FHIRComponentField[LitSeq[MedicationKnowledge.MedicineClassification]](medicineClassification, t.medicineClassification),
    FHIRComponentField[LitSeq[MedicationKnowledge.Regulatory]](regulatory, t.regulatory),
    FHIRComponentField[LitSeq[MedicationKnowledge.RelatedMedicationKnowledge]](
      relatedMedicationKnowledge,
      t.relatedMedicationKnowledge),
    FHIRComponentField[LitSeq[MedicationKnowledge.AdministrationGuidelines]](administrationGuidelines, t.administrationGuidelines)
  )
  def extractId(t: MedicationKnowledge): Option[String]                                                 = t.id
  def extractMeta(t: MedicationKnowledge): Option[Meta]                                                 = t.meta
  def extractText(t: MedicationKnowledge): Option[Narrative]                                            = t.text
  def extractCode(t: MedicationKnowledge): Option[CodeableConcept]                                      = t.code
  def extractStatus(t: MedicationKnowledge): Option[MEDICATIONKNOWLEDGE_STATUS]                         = t.status
  def extractAmount(t: MedicationKnowledge): Option[Quantity]                                           = t.amount
  def extractSynonym(t: MedicationKnowledge): LitSeq[String]                                            = t.synonym
  def extractLanguage(t: MedicationKnowledge): Option[LANGUAGES]                                        = t.language
  def extractDoseForm(t: MedicationKnowledge): Option[CodeableConcept]                                  = t.doseForm
  def extractContained(t: MedicationKnowledge): LitSeq[Resource]                                        = t.contained
  def extractExtension(t: MedicationKnowledge): LitSeq[Extension]                                       = t.extension
  def extractProductType(t: MedicationKnowledge): LitSeq[CodeableConcept]                               = t.productType
  def extractManufacturer(t: MedicationKnowledge): Option[Reference]                                    = t.manufacturer
  def extractImplicitRules(t: MedicationKnowledge): Option[UriStr]                                      = t.implicitRules
  def extractIntendedRoute(t: MedicationKnowledge): LitSeq[CodeableConcept]                             = t.intendedRoute
  def extractContraindication(t: MedicationKnowledge): LitSeq[Reference]                                = t.contraindication
  def extractModifierExtension(t: MedicationKnowledge): LitSeq[Extension]                               = t.modifierExtension
  def extractAssociatedMedication(t: MedicationKnowledge): LitSeq[Reference]                            = t.associatedMedication
  def extractPreparationInstruction(t: MedicationKnowledge): Option[Markdown]                           = t.preparationInstruction
  def extractCost(t: MedicationKnowledge): LitSeq[MedicationKnowledge.Cost]                             = t.cost
  def extractKinetics(t: MedicationKnowledge): LitSeq[MedicationKnowledge.Kinetics]                     = t.kinetics
  def extractMonograph(t: MedicationKnowledge): LitSeq[MedicationKnowledge.Monograph]                   = t.monograph
  def extractPackaging(t: MedicationKnowledge): Option[MedicationKnowledge.Packaging]                   = t.packaging
  def extractIngredient(t: MedicationKnowledge): LitSeq[MedicationKnowledge.Ingredient]                 = t.ingredient
  def extractMonitoringProgram(t: MedicationKnowledge): LitSeq[MedicationKnowledge.MonitoringProgram]   = t.monitoringProgram
  def extractDrugCharacteristic(t: MedicationKnowledge): LitSeq[MedicationKnowledge.DrugCharacteristic] = t.drugCharacteristic
  def extractMedicineClassification(t: MedicationKnowledge): LitSeq[MedicationKnowledge.MedicineClassification] =
    t.medicineClassification
  def extractRegulatory(t: MedicationKnowledge): LitSeq[MedicationKnowledge.Regulatory] = t.regulatory
  def extractRelatedMedicationKnowledge(t: MedicationKnowledge): LitSeq[MedicationKnowledge.RelatedMedicationKnowledge] =
    t.relatedMedicationKnowledge
  def extractAdministrationGuidelines(t: MedicationKnowledge): LitSeq[MedicationKnowledge.AdministrationGuidelines] =
    t.administrationGuidelines
  override val thisName: String = "MedicationKnowledge"
  override val searchParams: Map[String, MedicationKnowledge => Seq[Any]] = Map(
    "doseform"                -> (obj => obj.doseForm.toSeq),
    "monograph-type"          -> (obj => obj.monograph.flatMap(_.`type`).toSeq),
    "ingredient-code"         -> (obj => obj.ingredient.map(_.item).flatMap(_.as[CodeableConcept]).toSeq),
    "source-cost"             -> (obj => obj.cost.flatMap(_.source).toSeq),
    "ingredient"              -> (obj => obj.ingredient.map(_.item).flatMap(_.as[Reference]).toSeq),
    "classification-type"     -> (obj => obj.medicineClassification.map(_.`type`).toSeq),
    "code"                    -> (obj => obj.code.toSeq),
    "monograph"               -> (obj => obj.monograph.flatMap(_.source).toSeq),
    "status"                  -> (obj => obj.status.toSeq),
    "monitoring-program-type" -> (obj => obj.monitoringProgram.flatMap(_.`type`).toSeq),
    "manufacturer"            -> (obj => obj.manufacturer.toSeq),
    "classification"          -> (obj => obj.medicineClassification.flatMap(_.classification).toSeq),
    "monitoring-program-name" -> (obj => obj.monitoringProgram.flatMap(_.name).toSeq)
  )
  // format: off
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[MedicationKnowledge] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ => Try(
      new MedicationKnowledge(
        cursor.decodeAs[Option[String]]("id", Some(None)),
        cursor.decodeAs[Option[Meta]]("meta", Some(None)),
        cursor.decodeAs[Option[Narrative]]("text", Some(None)),
        cursor.decodeAs[Option[CodeableConcept]]("code", Some(None)),
        cursor.decodeAs[Option[MEDICATIONKNOWLEDGE_STATUS]]("status", Some(None)),
        cursor.decodeAs[Option[Quantity]]("amount", Some(None)),
        cursor.decodeAs[LitSeq[String]]("synonym", Some(LitSeq.empty)),
        cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
        cursor.decodeAs[Option[CodeableConcept]]("doseForm", Some(None)),
        cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[CodeableConcept]]("productType", Some(LitSeq.empty)),
        cursor.decodeAs[Option[Reference]]("manufacturer", Some(None)),
        cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
        cursor.decodeAs[LitSeq[CodeableConcept]]("intendedRoute", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[Reference]]("contraindication", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[Reference]]("associatedMedication", Some(LitSeq.empty)),
        cursor.decodeAs[Option[Markdown]]("preparationInstruction", Some(None)),
        cursor.decodeAs[LitSeq[MedicationKnowledge.Cost]]("cost", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[MedicationKnowledge.Kinetics]]("kinetics", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[MedicationKnowledge.Monograph]]("monograph", Some(LitSeq.empty)),
        cursor.decodeAs[Option[MedicationKnowledge.Packaging]]("packaging", Some(None)),
        cursor.decodeAs[LitSeq[MedicationKnowledge.Ingredient]]("ingredient", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[MedicationKnowledge.MonitoringProgram]]("monitoringProgram", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[MedicationKnowledge.DrugCharacteristic]]("drugCharacteristic", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[MedicationKnowledge.MedicineClassification]]("medicineClassification", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[MedicationKnowledge.Regulatory]]("regulatory", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[MedicationKnowledge.RelatedMedicationKnowledge]]("relatedMedicationKnowledge", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[MedicationKnowledge.AdministrationGuidelines]]("administrationGuidelines", Some(LitSeq.empty)),
        decodeAttributes(cursor)
      )
    ))
  // format: on
}

/** Information about a medication that is used to support knowledge.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields code, status, amount, synonym, doseForm, productType, manufacturer, intendedRoute, contraindication,
  *   associatedMedication, preparationInstruction, cost, kinetics, monograph, packaging, ingredient, monitoringProgram,
  *   drugCharacteristic, medicineClassification, regulatory, relatedMedicationKnowledge, administrationGuidelines.
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
  * @param code
  *   - A code that specifies this medication, or a textual description if no code is available. Usage note: This could be a
  *     standard medication code such as a code from RxNorm, SNOMED CT, IDMP etc. It could also be a national or local formulary
  *     code, optionally with translations to other code systems.
  * @param status
  *   - A code to indicate if the medication is in active use. The status refers to the validity about the information of the
  *     medication and not to its medicinal properties.
  * @param amount
  *   - Specific amount of the drug in the packaged product. For example, when specifying a product that has the same strength
  *     (For example, Insulin glargine 100 unit per mL solution for injection), this attribute provides additional clarification
  *     of the package amount (For example, 3 mL, 10mL, etc.).
  * @param synonym
  *   - Additional names for a medication, for example, the name(s) given to a medication in different countries. For example,
  *     acetaminophen and paracetamol or salbutamol and albuterol.
  * @param language
  *   - The base language in which the resource is written.
  * @param doseForm
  *   - Describes the form of the item. Powder; tablets; capsule.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *     identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *     of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *     Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *     of the extension.
  * @param productType
  *   - Category of the medication or product (e.g. branded product, therapeutic moeity, generic product, innovator product,
  *     etc.).
  * @param manufacturer
  *   - Describes the details of the manufacturer of the medication product. This is not intended to represent the distributor of
  *     a medication product.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *     processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *     other profiles etc.
  * @param intendedRoute
  *   - The intended or approved route of administration.
  * @param contraindication
  *   - Potential clinical issue with or between medication(s) (for example, drug-drug interaction, drug-disease contraindication,
  *     drug-allergy interaction, etc.).
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *     the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *     Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *     strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *     extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *     processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of
  *     any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param associatedMedication
  *   - Associated or related medications. For example, if the medication is a branded product (e.g. Crestor), this is the
  *     Therapeutic Moeity (e.g. Rosuvastatin) or if this is a generic medication (e.g. Rosuvastatin), this would link to a
  *     branded product (e.g. Crestor).
  * @param preparationInstruction
  *   - The instructions for preparing the medication.
  * @param cost
  *   - The price of the medication.
  * @param kinetics
  *   - The time course of drug absorption, distribution, metabolism and excretion of a medication from the body.
  * @param monograph
  *   - Associated documentation about the medication.
  * @param packaging
  *   - Information that only applies to packages (not products).
  * @param ingredient
  *   - Identifies a particular constituent of interest in the product.
  * @param monitoringProgram
  *   - The program under which the medication is reviewed.
  * @param drugCharacteristic
  *   - Specifies descriptive properties of the medicine, such as color, shape, imprints, etc.
  * @param medicineClassification
  *   - Categorization of the medication within a formulary or classification system.
  * @param regulatory
  *   - Regulatory information about a medication.
  * @param relatedMedicationKnowledge
  *   - Associated or related knowledge about a medication.
  * @param administrationGuidelines
  *   - Guidelines for the administration of the medication.
  */
@POJOBoilerplate
class MedicationKnowledge(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val code: Option[CodeableConcept] = None,
    val status: Option[MEDICATIONKNOWLEDGE_STATUS] = None,
    val amount: Option[Quantity] = None,
    val synonym: LitSeq[String] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    val doseForm: Option[CodeableConcept] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val productType: LitSeq[CodeableConcept] = LitSeq.empty,
    val manufacturer: Option[Reference] = None,
    override val implicitRules: Option[UriStr] = None,
    val intendedRoute: LitSeq[CodeableConcept] = LitSeq.empty,
    val contraindication: LitSeq[Reference] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val associatedMedication: LitSeq[Reference] = LitSeq.empty,
    val preparationInstruction: Option[Markdown] = None,
    val cost: LitSeq[MedicationKnowledge.Cost] = LitSeq.empty,
    val kinetics: LitSeq[MedicationKnowledge.Kinetics] = LitSeq.empty,
    val monograph: LitSeq[MedicationKnowledge.Monograph] = LitSeq.empty,
    val packaging: Option[MedicationKnowledge.Packaging] = None,
    val ingredient: LitSeq[MedicationKnowledge.Ingredient] = LitSeq.empty,
    val monitoringProgram: LitSeq[MedicationKnowledge.MonitoringProgram] = LitSeq.empty,
    val drugCharacteristic: LitSeq[MedicationKnowledge.DrugCharacteristic] = LitSeq.empty,
    val medicineClassification: LitSeq[MedicationKnowledge.MedicineClassification] = LitSeq.empty,
    val regulatory: LitSeq[MedicationKnowledge.Regulatory] = LitSeq.empty,
    val relatedMedicationKnowledge: LitSeq[MedicationKnowledge.RelatedMedicationKnowledge] = LitSeq.empty,
    val administrationGuidelines: LitSeq[MedicationKnowledge.AdministrationGuidelines] = LitSeq.empty,
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
  override val thisTypeName: String = "MedicationKnowledge"
}
