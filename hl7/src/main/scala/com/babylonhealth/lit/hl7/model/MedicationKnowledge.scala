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
  object IndicationGuideline extends CompanionFor[IndicationGuideline] {
    implicit def summonObjectAndCompanionIndicationGuideline_1219593058(
        o: IndicationGuideline): ObjectAndCompanion[IndicationGuideline, IndicationGuideline.type] = ObjectAndCompanion(o, this)
    override type ResourceType = IndicationGuideline
    override type ParentType   = IndicationGuideline
    override val parentType: CompanionFor[ResourceType] = IndicationGuideline
    object DosingGuideline extends CompanionFor[DosingGuideline] {
      implicit def summonObjectAndCompanionDosingGuideline_944776201(
          o: DosingGuideline): ObjectAndCompanion[DosingGuideline, DosingGuideline.type] = ObjectAndCompanion(o, this)
      override type ResourceType = DosingGuideline
      override type ParentType   = DosingGuideline
      override val parentType: CompanionFor[ResourceType] = DosingGuideline
      object Dosage extends CompanionFor[Dosage] {
        implicit def summonObjectAndCompanionDosage1159157199(o: Dosage): ObjectAndCompanion[Dosage, Dosage.type] =
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
      object PatientCharacteristic extends CompanionFor[PatientCharacteristic] {
        implicit def summonObjectAndCompanionPatientCharacteristic1159157199(
            o: PatientCharacteristic): ObjectAndCompanion[PatientCharacteristic, PatientCharacteristic.type] =
          ObjectAndCompanion(o, this)
        override type ResourceType = PatientCharacteristic
        override type ParentType   = PatientCharacteristic
        override val parentType: CompanionFor[ResourceType] = PatientCharacteristic
        type ValueChoice = Choice[UnionCodeableConceptOrQuantityOrRange]
        def apply(
            id: Option[String] = None,
            `type`: CodeableConcept,
            value: Option[PatientCharacteristic.ValueChoice] = None,
            extension: LitSeq[Extension] = LitSeq.empty,
            modifierExtension: LitSeq[Extension] = LitSeq.empty,
            primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
        ): PatientCharacteristic = new PatientCharacteristic(
          id,
          `type`,
          value,
          extension,
          modifierExtension,
          primitiveAttributes = primitiveAttributes
        )
        def unapply(
            o: PatientCharacteristic): Option[(Option[String], CodeableConcept, Option[PatientCharacteristic.ValueChoice], LitSeq[Extension], LitSeq[Extension])] =
          Some((o.id, o.`type`, o.value, o.extension, o.modifierExtension))
        val id: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
        val `type`: FHIRComponentFieldMeta[CodeableConcept] =
          FHIRComponentFieldMeta("type", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
        val value: FHIRComponentFieldMeta[Option[PatientCharacteristic.ValueChoice]] =
          FHIRComponentFieldMeta(
            "value",
            lTagOf[Option[PatientCharacteristic.ValueChoice]],
            true,
            lTagOf[UnionCodeableConceptOrQuantityOrRange])
        val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, `type`, value, extension, modifierExtension)
        override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
        override def fields(t: PatientCharacteristic): Seq[FHIRComponentField[_]] = Seq(
          FHIRComponentField[Option[String]](id, t.id),
          FHIRComponentField[CodeableConcept](`type`, t.`type`),
          FHIRComponentField[Option[PatientCharacteristic.ValueChoice]](value, t.value),
          FHIRComponentField[LitSeq[Extension]](extension, t.extension),
          FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
        )
        val baseType: CompanionFor[PatientCharacteristic] = this
        val thisName: String                              = "PatientCharacteristic"
        def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[PatientCharacteristic] =
          checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
            Try(
              new PatientCharacteristic(
                cursor.decodeAs[Option[String]]("id", Some(None)),
                cursor.decodeAs[CodeableConcept]("type", None),
                cursor.decodeOptRef[UnionCodeableConceptOrQuantityOrRange]("value"),
                cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
                cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
                decodeAttributes(cursor)
              )
            ))
      }
      @POJOBoilerplate
      class PatientCharacteristic(
          override val id: Option[String] = None,
          val `type`: CodeableConcept,
          val value: Option[PatientCharacteristic.ValueChoice] = None,
          override val extension: LitSeq[Extension] = LitSeq.empty,
          override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
          override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
          extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
      def apply(
          id: Option[String] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          treatmentIntent: Option[CodeableConcept] = None,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          administrationTreatment: Option[CodeableConcept] = None,
          dosage: LitSeq[DosingGuideline.Dosage] = LitSeq.empty,
          patientCharacteristic: LitSeq[DosingGuideline.PatientCharacteristic] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): DosingGuideline = new DosingGuideline(
        id,
        extension,
        treatmentIntent,
        modifierExtension,
        administrationTreatment,
        dosage,
        patientCharacteristic,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: DosingGuideline): Option[(Option[String], LitSeq[Extension], Option[CodeableConcept], LitSeq[Extension], Option[CodeableConcept], LitSeq[DosingGuideline.Dosage], LitSeq[DosingGuideline.PatientCharacteristic])] =
        Some(
          (
            o.id,
            o.extension,
            o.treatmentIntent,
            o.modifierExtension,
            o.administrationTreatment,
            o.dosage,
            o.patientCharacteristic))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val treatmentIntent: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("treatmentIntent", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val administrationTreatment: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("administrationTreatment", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val dosage: FHIRComponentFieldMeta[LitSeq[DosingGuideline.Dosage]] =
        FHIRComponentFieldMeta("dosage", lTagOf[LitSeq[DosingGuideline.Dosage]], false, lTagOf[DosingGuideline.Dosage])
      val patientCharacteristic: FHIRComponentFieldMeta[LitSeq[DosingGuideline.PatientCharacteristic]] =
        FHIRComponentFieldMeta(
          "patientCharacteristic",
          lTagOf[LitSeq[DosingGuideline.PatientCharacteristic]],
          false,
          lTagOf[DosingGuideline.PatientCharacteristic])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
        Seq(id, extension, treatmentIntent, modifierExtension, administrationTreatment, dosage, patientCharacteristic)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: DosingGuideline): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[CodeableConcept]](treatmentIntent, t.treatmentIntent),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
        FHIRComponentField[Option[CodeableConcept]](administrationTreatment, t.administrationTreatment),
        FHIRComponentField[LitSeq[DosingGuideline.Dosage]](dosage, t.dosage),
        FHIRComponentField[LitSeq[DosingGuideline.PatientCharacteristic]](patientCharacteristic, t.patientCharacteristic)
      )
      val baseType: CompanionFor[DosingGuideline] = this
      val thisName: String                        = "DosingGuideline"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[DosingGuideline] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new DosingGuideline(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[CodeableConcept]]("treatmentIntent", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[CodeableConcept]]("administrationTreatment", Some(None)),
              cursor.decodeAs[LitSeq[DosingGuideline.Dosage]]("dosage", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[DosingGuideline.PatientCharacteristic]]("patientCharacteristic", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class DosingGuideline(
        override val id: Option[String] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val treatmentIntent: Option[CodeableConcept] = None,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        val administrationTreatment: Option[CodeableConcept] = None,
        val dosage: LitSeq[DosingGuideline.Dosage] = LitSeq.empty,
        val patientCharacteristic: LitSeq[DosingGuideline.PatientCharacteristic] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        indication: LitSeq[CodeableReference] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        dosingGuideline: LitSeq[IndicationGuideline.DosingGuideline] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): IndicationGuideline = new IndicationGuideline(
      id,
      extension,
      indication,
      modifierExtension,
      dosingGuideline,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: IndicationGuideline): Option[(Option[String], LitSeq[Extension], LitSeq[CodeableReference], LitSeq[Extension], LitSeq[IndicationGuideline.DosingGuideline])] =
      Some((o.id, o.extension, o.indication, o.modifierExtension, o.dosingGuideline))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val indication: FHIRComponentFieldMeta[LitSeq[CodeableReference]] =
      FHIRComponentFieldMeta("indication", lTagOf[LitSeq[CodeableReference]], false, lTagOf[CodeableReference])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val dosingGuideline: FHIRComponentFieldMeta[LitSeq[IndicationGuideline.DosingGuideline]] =
      FHIRComponentFieldMeta(
        "dosingGuideline",
        lTagOf[LitSeq[IndicationGuideline.DosingGuideline]],
        false,
        lTagOf[IndicationGuideline.DosingGuideline])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, extension, indication, modifierExtension, dosingGuideline)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: IndicationGuideline): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[CodeableReference]](indication, t.indication),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[IndicationGuideline.DosingGuideline]](dosingGuideline, t.dosingGuideline)
    )
    val baseType: CompanionFor[IndicationGuideline] = this
    val thisName: String                            = "IndicationGuideline"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[IndicationGuideline] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new IndicationGuideline(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[CodeableReference]]("indication", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[IndicationGuideline.DosingGuideline]]("dosingGuideline", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class IndicationGuideline(
      override val id: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val indication: LitSeq[CodeableReference] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val dosingGuideline: LitSeq[IndicationGuideline.DosingGuideline] = LitSeq.empty,
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
        schedule: LitSeq[CodeableConcept] = LitSeq.empty,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        regulatoryAuthority: Reference,
        maxDispense: Option[Regulatory.MaxDispense] = None,
        substitution: LitSeq[Regulatory.Substitution] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Regulatory = new Regulatory(
      id,
      schedule,
      extension,
      modifierExtension,
      regulatoryAuthority,
      maxDispense,
      substitution,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Regulatory): Option[(Option[String], LitSeq[CodeableConcept], LitSeq[Extension], LitSeq[Extension], Reference, Option[Regulatory.MaxDispense], LitSeq[Regulatory.Substitution])] =
      Some((o.id, o.schedule, o.extension, o.modifierExtension, o.regulatoryAuthority, o.maxDispense, o.substitution))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val schedule: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("schedule", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val regulatoryAuthority: FHIRComponentFieldMeta[Reference] =
      FHIRComponentFieldMeta("regulatoryAuthority", lTagOf[Reference], false, lTagOf[Reference])
    val maxDispense: FHIRComponentFieldMeta[Option[Regulatory.MaxDispense]] =
      FHIRComponentFieldMeta("maxDispense", lTagOf[Option[Regulatory.MaxDispense]], false, lTagOf[Regulatory.MaxDispense])
    val substitution: FHIRComponentFieldMeta[LitSeq[Regulatory.Substitution]] =
      FHIRComponentFieldMeta("substitution", lTagOf[LitSeq[Regulatory.Substitution]], false, lTagOf[Regulatory.Substitution])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, schedule, extension, modifierExtension, regulatoryAuthority, maxDispense, substitution)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Regulatory): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[CodeableConcept]](schedule, t.schedule),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Reference](regulatoryAuthority, t.regulatoryAuthority),
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
            cursor.decodeAs[LitSeq[CodeableConcept]]("schedule", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[Reference]("regulatoryAuthority", None),
            cursor.decodeAs[Option[Regulatory.MaxDispense]]("maxDispense", Some(None)),
            cursor.decodeAs[LitSeq[Regulatory.Substitution]]("substitution", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Regulatory(
      override val id: Option[String] = None,
      val schedule: LitSeq[CodeableConcept] = LitSeq.empty,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val regulatoryAuthority: Reference,
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
  object KineticCharacteristic extends CompanionFor[KineticCharacteristic] {
    implicit def summonObjectAndCompanionKineticCharacteristic_1219593058(
        o: KineticCharacteristic): ObjectAndCompanion[KineticCharacteristic, KineticCharacteristic.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = KineticCharacteristic
    override type ParentType   = KineticCharacteristic
    override val parentType: CompanionFor[ResourceType] = KineticCharacteristic
    type ValueChoice = Choice[UnionDurationOrQuantity]
    def apply(
        id: Option[String] = None,
        `type`: Option[CodeableConcept] = None,
        value: Option[KineticCharacteristic.ValueChoice] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): KineticCharacteristic = new KineticCharacteristic(
      id,
      `type`,
      value,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: KineticCharacteristic): Option[(Option[String], Option[CodeableConcept], Option[KineticCharacteristic.ValueChoice], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.`type`, o.value, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val value: FHIRComponentFieldMeta[Option[KineticCharacteristic.ValueChoice]] =
      FHIRComponentFieldMeta("value", lTagOf[Option[KineticCharacteristic.ValueChoice]], true, lTagOf[UnionDurationOrQuantity])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, `type`, value, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: KineticCharacteristic): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[Option[KineticCharacteristic.ValueChoice]](value, t.value),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[KineticCharacteristic] = this
    val thisName: String                              = "KineticCharacteristic"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[KineticCharacteristic] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new KineticCharacteristic(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
            cursor.decodeOptRef[UnionDurationOrQuantity]("value"),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class KineticCharacteristic(
      override val id: Option[String] = None,
      val `type`: Option[CodeableConcept] = None,
      val value: Option[KineticCharacteristic.ValueChoice] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object DrugCharacteristic extends CompanionFor[DrugCharacteristic] {
    implicit def summonObjectAndCompanionDrugCharacteristic_1219593058(
        o: DrugCharacteristic): ObjectAndCompanion[DrugCharacteristic, DrugCharacteristic.type] = ObjectAndCompanion(o, this)
    override type ResourceType = DrugCharacteristic
    override type ParentType   = DrugCharacteristic
    override val parentType: CompanionFor[ResourceType] = DrugCharacteristic
    type ValueChoice = Choice[Union_1045052359]
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
      FHIRComponentFieldMeta("value", lTagOf[Option[DrugCharacteristic.ValueChoice]], true, lTagOf[Union_1045052359])
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
            cursor.decodeOptRef[Union_1045052359]("value"),
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
    type StrengthChoice = Choice[UnionCodeableConceptOrQuantityOrRatio]
    def apply(
        id: Option[String] = None,
        item: CodeableReference,
        isActive: Option[CodeableConcept] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        strength: Option[Ingredient.StrengthChoice] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Ingredient = new Ingredient(
      id,
      item,
      isActive,
      extension,
      strength,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Ingredient): Option[(Option[String], CodeableReference, Option[CodeableConcept], LitSeq[Extension], Option[Ingredient.StrengthChoice], LitSeq[Extension])] =
      Some((o.id, o.item, o.isActive, o.extension, o.strength, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val item: FHIRComponentFieldMeta[CodeableReference] =
      FHIRComponentFieldMeta("item", lTagOf[CodeableReference], false, lTagOf[CodeableReference])
    val isActive: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("isActive", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val strength: FHIRComponentFieldMeta[Option[Ingredient.StrengthChoice]] =
      FHIRComponentFieldMeta(
        "strength",
        lTagOf[Option[Ingredient.StrengthChoice]],
        true,
        lTagOf[UnionCodeableConceptOrQuantityOrRatio])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, item, isActive, extension, strength, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Ingredient): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[CodeableReference](item, t.item),
      FHIRComponentField[Option[CodeableConcept]](isActive, t.isActive),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Ingredient.StrengthChoice]](strength, t.strength),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Ingredient] = this
    val thisName: String                   = "Ingredient"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Ingredient] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Ingredient(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[CodeableReference]("item", None),
            cursor.decodeAs[Option[CodeableConcept]]("isActive", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeOptRef[UnionCodeableConceptOrQuantityOrRatio]("strength"),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Ingredient(
      override val id: Option[String] = None,
      val item: CodeableReference,
      val isActive: Option[CodeableConcept] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val strength: Option[Ingredient.StrengthChoice] = None,
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
        cost: Option[MedicationKnowledge.Cost] = None,
        `type`: Option[CodeableConcept] = None,
        device: Option[Reference] = None,
        quantity: Option[Quantity] = None,
        material: Option[CodeableConcept] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        packaging: LitSeq[MedicationKnowledge.Packaging] = LitSeq.empty,
        identifier: Option[Identifier] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Packaging = new Packaging(
      id,
      cost,
      `type`,
      device,
      quantity,
      material,
      extension,
      packaging,
      identifier,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Packaging): Option[(Option[String], Option[MedicationKnowledge.Cost], Option[CodeableConcept], Option[Reference], Option[Quantity], Option[CodeableConcept], LitSeq[Extension], LitSeq[MedicationKnowledge.Packaging], Option[Identifier], LitSeq[Extension])] =
      Some(
        (o.id, o.cost, o.`type`, o.device, o.quantity, o.material, o.extension, o.packaging, o.identifier, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val cost: FHIRComponentFieldMeta[Option[MedicationKnowledge.Cost]] =
      FHIRComponentFieldMeta("cost", lTagOf[Option[MedicationKnowledge.Cost]], false, lTagOf[MedicationKnowledge.Cost])
    val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val device: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("device", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val quantity: FHIRComponentFieldMeta[Option[Quantity]] =
      FHIRComponentFieldMeta("quantity", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
    val material: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("material", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val packaging: FHIRComponentFieldMeta[LitSeq[MedicationKnowledge.Packaging]] =
      FHIRComponentFieldMeta(
        "packaging",
        lTagOf[LitSeq[MedicationKnowledge.Packaging]],
        false,
        lTagOf[MedicationKnowledge.Packaging])
    val identifier: FHIRComponentFieldMeta[Option[Identifier]] =
      FHIRComponentFieldMeta("identifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, cost, `type`, device, quantity, material, extension, packaging, identifier, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Packaging): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[MedicationKnowledge.Cost]](cost, t.cost),
      FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[Option[Reference]](device, t.device),
      FHIRComponentField[Option[Quantity]](quantity, t.quantity),
      FHIRComponentField[Option[CodeableConcept]](material, t.material),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[MedicationKnowledge.Packaging]](packaging, t.packaging),
      FHIRComponentField[Option[Identifier]](identifier, t.identifier),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Packaging] = this
    val thisName: String                  = "Packaging"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Packaging] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Packaging(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[MedicationKnowledge.Cost]]("cost", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
            cursor.decodeAs[Option[Reference]]("device", Some(None)),
            cursor.decodeAs[Option[Quantity]]("quantity", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("material", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[MedicationKnowledge.Packaging]]("packaging", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Identifier]]("identifier", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Packaging(
      override val id: Option[String] = None,
      val cost: Option[MedicationKnowledge.Cost] = None,
      val `type`: Option[CodeableConcept] = None,
      val device: Option[Reference] = None,
      val quantity: Option[Quantity] = None,
      val material: Option[CodeableConcept] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val packaging: LitSeq[MedicationKnowledge.Packaging] = LitSeq.empty,
      val identifier: Option[Identifier] = None,
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
  object Cost extends CompanionFor[Cost] {
    implicit def summonObjectAndCompanionCost_1219593058(o: Cost): ObjectAndCompanion[Cost, Cost.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Cost
    override type ParentType   = Cost
    override val parentType: CompanionFor[ResourceType] = Cost
    type CostChoice = Choice[UnionCodeableConceptOrMoney]
    def apply(
        id: Option[String] = None,
        `type`: CodeableConcept,
        source: Option[String] = None,
        cost: Cost.CostChoice,
        extension: LitSeq[Extension] = LitSeq.empty,
        effectiveDate: LitSeq[Period] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Cost = new Cost(
      id,
      `type`,
      source,
      cost,
      extension,
      effectiveDate,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Cost): Option[(Option[String], CodeableConcept, Option[String], Cost.CostChoice, LitSeq[Extension], LitSeq[Period], LitSeq[Extension])] =
      Some((o.id, o.`type`, o.source, o.cost, o.extension, o.effectiveDate, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("type", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val source: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("source", lTagOf[Option[String]], false, lTagOf[String])
    val cost: FHIRComponentFieldMeta[Cost.CostChoice] =
      FHIRComponentFieldMeta("cost", lTagOf[Cost.CostChoice], true, lTagOf[UnionCodeableConceptOrMoney])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val effectiveDate: FHIRComponentFieldMeta[LitSeq[Period]] =
      FHIRComponentFieldMeta("effectiveDate", lTagOf[LitSeq[Period]], false, lTagOf[Period])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, `type`, source, cost, extension, effectiveDate, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Cost): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[CodeableConcept](`type`, t.`type`),
      FHIRComponentField[Option[String]](source, t.source),
      FHIRComponentField[Cost.CostChoice](cost, t.cost),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Period]](effectiveDate, t.effectiveDate),
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
            cursor.decodeAs[Option[String]]("source", Some(None)),
            cursor.decodeRef[UnionCodeableConceptOrMoney]("cost"),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Period]]("effectiveDate", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Cost(
      override val id: Option[String] = None,
      val `type`: CodeableConcept,
      val source: Option[String] = None,
      val cost: Cost.CostChoice,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val effectiveDate: LitSeq[Period] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      code: Option[CodeableConcept] = None,
      status: Option[MEDICATIONKNOWLEDGE_STATUS] = None,
      author: Option[Reference] = None,
      amount: Option[Quantity] = None,
      device: LitSeq[Reference] = LitSeq.empty,
      sponsor: Option[Reference] = None,
      synonym: LitSeq[String] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      doseForm: Option[CodeableConcept] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      productType: LitSeq[CodeableConcept] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      intendedRoute: LitSeq[CodeableConcept] = LitSeq.empty,
      clinicalUseIssue: LitSeq[Reference] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      associatedMedication: LitSeq[Reference] = LitSeq.empty,
      associatedDefinition: Option[Reference] = None,
      preparationInstruction: Option[Markdown] = None,
      cost: LitSeq[MedicationKnowledge.Cost] = LitSeq.empty,
      monograph: LitSeq[MedicationKnowledge.Monograph] = LitSeq.empty,
      packaging: LitSeq[MedicationKnowledge.Packaging] = LitSeq.empty,
      ingredient: LitSeq[MedicationKnowledge.Ingredient] = LitSeq.empty,
      monitoringProgram: LitSeq[MedicationKnowledge.MonitoringProgram] = LitSeq.empty,
      drugCharacteristic: LitSeq[MedicationKnowledge.DrugCharacteristic] = LitSeq.empty,
      kineticCharacteristic: LitSeq[MedicationKnowledge.KineticCharacteristic] = LitSeq.empty,
      medicineClassification: LitSeq[MedicationKnowledge.MedicineClassification] = LitSeq.empty,
      regulatory: LitSeq[MedicationKnowledge.Regulatory] = LitSeq.empty,
      relatedMedicationKnowledge: LitSeq[MedicationKnowledge.RelatedMedicationKnowledge] = LitSeq.empty,
      indicationGuideline: LitSeq[MedicationKnowledge.IndicationGuideline] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): MedicationKnowledge = new MedicationKnowledge(
    id,
    meta,
    text,
    code,
    status,
    author,
    amount,
    device,
    sponsor,
    synonym,
    language,
    doseForm,
    contained,
    extension,
    identifier,
    productType,
    implicitRules,
    intendedRoute,
    clinicalUseIssue,
    modifierExtension,
    associatedMedication,
    associatedDefinition,
    preparationInstruction,
    cost,
    monograph,
    packaging,
    ingredient,
    monitoringProgram,
    drugCharacteristic,
    kineticCharacteristic,
    medicineClassification,
    regulatory,
    relatedMedicationKnowledge,
    indicationGuideline,
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
  val author: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("author", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val amount: FHIRComponentFieldMeta[Option[Quantity]] =
    FHIRComponentFieldMeta("amount", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
  val device: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("device", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val sponsor: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("sponsor", lTagOf[Option[Reference]], false, lTagOf[Reference])
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
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val productType: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("productType", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val intendedRoute: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("intendedRoute", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val clinicalUseIssue: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("clinicalUseIssue", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val associatedMedication: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("associatedMedication", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val associatedDefinition: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("associatedDefinition", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val preparationInstruction: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("preparationInstruction", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val cost: FHIRComponentFieldMeta[LitSeq[MedicationKnowledge.Cost]] =
    FHIRComponentFieldMeta("cost", lTagOf[LitSeq[MedicationKnowledge.Cost]], false, lTagOf[MedicationKnowledge.Cost])
  val monograph: FHIRComponentFieldMeta[LitSeq[MedicationKnowledge.Monograph]] =
    FHIRComponentFieldMeta(
      "monograph",
      lTagOf[LitSeq[MedicationKnowledge.Monograph]],
      false,
      lTagOf[MedicationKnowledge.Monograph])
  val packaging: FHIRComponentFieldMeta[LitSeq[MedicationKnowledge.Packaging]] =
    FHIRComponentFieldMeta(
      "packaging",
      lTagOf[LitSeq[MedicationKnowledge.Packaging]],
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
  val kineticCharacteristic: FHIRComponentFieldMeta[LitSeq[MedicationKnowledge.KineticCharacteristic]] =
    FHIRComponentFieldMeta(
      "kineticCharacteristic",
      lTagOf[LitSeq[MedicationKnowledge.KineticCharacteristic]],
      false,
      lTagOf[MedicationKnowledge.KineticCharacteristic])
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
  val indicationGuideline: FHIRComponentFieldMeta[LitSeq[MedicationKnowledge.IndicationGuideline]] =
    FHIRComponentFieldMeta(
      "indicationGuideline",
      lTagOf[LitSeq[MedicationKnowledge.IndicationGuideline]],
      false,
      lTagOf[MedicationKnowledge.IndicationGuideline])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    code,
    status,
    author,
    amount,
    device,
    sponsor,
    synonym,
    language,
    doseForm,
    contained,
    extension,
    identifier,
    productType,
    implicitRules,
    intendedRoute,
    clinicalUseIssue,
    modifierExtension,
    associatedMedication,
    associatedDefinition,
    preparationInstruction,
    cost,
    monograph,
    packaging,
    ingredient,
    monitoringProgram,
    drugCharacteristic,
    kineticCharacteristic,
    medicineClassification,
    regulatory,
    relatedMedicationKnowledge,
    indicationGuideline
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: MedicationKnowledge): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[CodeableConcept]](code, t.code),
    FHIRComponentField[Option[MEDICATIONKNOWLEDGE_STATUS]](status, t.status),
    FHIRComponentField[Option[Reference]](author, t.author),
    FHIRComponentField[Option[Quantity]](amount, t.amount),
    FHIRComponentField[LitSeq[Reference]](device, t.device),
    FHIRComponentField[Option[Reference]](sponsor, t.sponsor),
    FHIRComponentField[LitSeq[String]](synonym, t.synonym),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Option[CodeableConcept]](doseForm, t.doseForm),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[LitSeq[CodeableConcept]](productType, t.productType),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[CodeableConcept]](intendedRoute, t.intendedRoute),
    FHIRComponentField[LitSeq[Reference]](clinicalUseIssue, t.clinicalUseIssue),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[Reference]](associatedMedication, t.associatedMedication),
    FHIRComponentField[Option[Reference]](associatedDefinition, t.associatedDefinition),
    FHIRComponentField[Option[Markdown]](preparationInstruction, t.preparationInstruction),
    FHIRComponentField[LitSeq[MedicationKnowledge.Cost]](cost, t.cost),
    FHIRComponentField[LitSeq[MedicationKnowledge.Monograph]](monograph, t.monograph),
    FHIRComponentField[LitSeq[MedicationKnowledge.Packaging]](packaging, t.packaging),
    FHIRComponentField[LitSeq[MedicationKnowledge.Ingredient]](ingredient, t.ingredient),
    FHIRComponentField[LitSeq[MedicationKnowledge.MonitoringProgram]](monitoringProgram, t.monitoringProgram),
    FHIRComponentField[LitSeq[MedicationKnowledge.DrugCharacteristic]](drugCharacteristic, t.drugCharacteristic),
    FHIRComponentField[LitSeq[MedicationKnowledge.KineticCharacteristic]](kineticCharacteristic, t.kineticCharacteristic),
    FHIRComponentField[LitSeq[MedicationKnowledge.MedicineClassification]](medicineClassification, t.medicineClassification),
    FHIRComponentField[LitSeq[MedicationKnowledge.Regulatory]](regulatory, t.regulatory),
    FHIRComponentField[LitSeq[MedicationKnowledge.RelatedMedicationKnowledge]](
      relatedMedicationKnowledge,
      t.relatedMedicationKnowledge),
    FHIRComponentField[LitSeq[MedicationKnowledge.IndicationGuideline]](indicationGuideline, t.indicationGuideline)
  )
  def extractId(t: MedicationKnowledge): Option[String]                                                 = t.id
  def extractMeta(t: MedicationKnowledge): Option[Meta]                                                 = t.meta
  def extractText(t: MedicationKnowledge): Option[Narrative]                                            = t.text
  def extractCode(t: MedicationKnowledge): Option[CodeableConcept]                                      = t.code
  def extractStatus(t: MedicationKnowledge): Option[MEDICATIONKNOWLEDGE_STATUS]                         = t.status
  def extractAuthor(t: MedicationKnowledge): Option[Reference]                                          = t.author
  def extractAmount(t: MedicationKnowledge): Option[Quantity]                                           = t.amount
  def extractDevice(t: MedicationKnowledge): LitSeq[Reference]                                          = t.device
  def extractSponsor(t: MedicationKnowledge): Option[Reference]                                         = t.sponsor
  def extractSynonym(t: MedicationKnowledge): LitSeq[String]                                            = t.synonym
  def extractLanguage(t: MedicationKnowledge): Option[LANGUAGES]                                        = t.language
  def extractDoseForm(t: MedicationKnowledge): Option[CodeableConcept]                                  = t.doseForm
  def extractContained(t: MedicationKnowledge): LitSeq[Resource]                                        = t.contained
  def extractExtension(t: MedicationKnowledge): LitSeq[Extension]                                       = t.extension
  def extractIdentifier(t: MedicationKnowledge): LitSeq[Identifier]                                     = t.identifier
  def extractProductType(t: MedicationKnowledge): LitSeq[CodeableConcept]                               = t.productType
  def extractImplicitRules(t: MedicationKnowledge): Option[UriStr]                                      = t.implicitRules
  def extractIntendedRoute(t: MedicationKnowledge): LitSeq[CodeableConcept]                             = t.intendedRoute
  def extractClinicalUseIssue(t: MedicationKnowledge): LitSeq[Reference]                                = t.clinicalUseIssue
  def extractModifierExtension(t: MedicationKnowledge): LitSeq[Extension]                               = t.modifierExtension
  def extractAssociatedMedication(t: MedicationKnowledge): LitSeq[Reference]                            = t.associatedMedication
  def extractAssociatedDefinition(t: MedicationKnowledge): Option[Reference]                            = t.associatedDefinition
  def extractPreparationInstruction(t: MedicationKnowledge): Option[Markdown]                           = t.preparationInstruction
  def extractCost(t: MedicationKnowledge): LitSeq[MedicationKnowledge.Cost]                             = t.cost
  def extractMonograph(t: MedicationKnowledge): LitSeq[MedicationKnowledge.Monograph]                   = t.monograph
  def extractPackaging(t: MedicationKnowledge): LitSeq[MedicationKnowledge.Packaging]                   = t.packaging
  def extractIngredient(t: MedicationKnowledge): LitSeq[MedicationKnowledge.Ingredient]                 = t.ingredient
  def extractMonitoringProgram(t: MedicationKnowledge): LitSeq[MedicationKnowledge.MonitoringProgram]   = t.monitoringProgram
  def extractDrugCharacteristic(t: MedicationKnowledge): LitSeq[MedicationKnowledge.DrugCharacteristic] = t.drugCharacteristic
  def extractKineticCharacteristic(t: MedicationKnowledge): LitSeq[MedicationKnowledge.KineticCharacteristic] =
    t.kineticCharacteristic
  def extractMedicineClassification(t: MedicationKnowledge): LitSeq[MedicationKnowledge.MedicineClassification] =
    t.medicineClassification
  def extractRegulatory(t: MedicationKnowledge): LitSeq[MedicationKnowledge.Regulatory] = t.regulatory
  def extractRelatedMedicationKnowledge(t: MedicationKnowledge): LitSeq[MedicationKnowledge.RelatedMedicationKnowledge] =
    t.relatedMedicationKnowledge
  def extractIndicationGuideline(t: MedicationKnowledge): LitSeq[MedicationKnowledge.IndicationGuideline] = t.indicationGuideline
  override val thisName: String                                                                           = "MedicationKnowledge"
  override val searchParams: Map[String, MedicationKnowledge => Seq[Any]] = Map(
    "doseform"                -> (obj => obj.doseForm.toSeq),
    "monograph-type"          -> (obj => obj.monograph.flatMap(_.`type`).toSeq),
    "ingredient-code"         -> (obj => obj.ingredient.map(_.item).flatMap(_.concept).toSeq),
    "identifier"              -> (obj => obj.identifier.toSeq),
    "ingredient"              -> (obj => obj.ingredient.map(_.item).flatMap(_.reference).toSeq),
    "classification-type"     -> (obj => obj.medicineClassification.map(_.`type`).toSeq),
    "code"                    -> (obj => obj.code.toSeq),
    "monograph"               -> (obj => obj.monograph.flatMap(_.source).toSeq),
    "status"                  -> (obj => obj.status.toSeq),
    "product-type"            -> (obj => obj.productType.toSeq),
    "monitoring-program-type" -> (obj => obj.monitoringProgram.flatMap(_.`type`).toSeq),
    "source-cost"             -> (obj => obj.cost.flatMap(_.source).toSeq),
    "sponsor"                 -> (obj => obj.sponsor.toSeq),
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
        cursor.decodeAs[Option[Reference]]("author", Some(None)),
        cursor.decodeAs[Option[Quantity]]("amount", Some(None)),
        cursor.decodeAs[LitSeq[Reference]]("device", Some(LitSeq.empty)),
        cursor.decodeAs[Option[Reference]]("sponsor", Some(None)),
        cursor.decodeAs[LitSeq[String]]("synonym", Some(LitSeq.empty)),
        cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
        cursor.decodeAs[Option[CodeableConcept]]("doseForm", Some(None)),
        cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[CodeableConcept]]("productType", Some(LitSeq.empty)),
        cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
        cursor.decodeAs[LitSeq[CodeableConcept]]("intendedRoute", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[Reference]]("clinicalUseIssue", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[Reference]]("associatedMedication", Some(LitSeq.empty)),
        cursor.decodeAs[Option[Reference]]("associatedDefinition", Some(None)),
        cursor.decodeAs[Option[Markdown]]("preparationInstruction", Some(None)),
        cursor.decodeAs[LitSeq[MedicationKnowledge.Cost]]("cost", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[MedicationKnowledge.Monograph]]("monograph", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[MedicationKnowledge.Packaging]]("packaging", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[MedicationKnowledge.Ingredient]]("ingredient", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[MedicationKnowledge.MonitoringProgram]]("monitoringProgram", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[MedicationKnowledge.DrugCharacteristic]]("drugCharacteristic", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[MedicationKnowledge.KineticCharacteristic]]("kineticCharacteristic", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[MedicationKnowledge.MedicineClassification]]("medicineClassification", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[MedicationKnowledge.Regulatory]]("regulatory", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[MedicationKnowledge.RelatedMedicationKnowledge]]("relatedMedicationKnowledge", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[MedicationKnowledge.IndicationGuideline]]("indicationGuideline", Some(LitSeq.empty)),
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
  *   Introduces the fields code, status, author, amount, device, sponsor, synonym, doseForm, identifier, productType,
  *   intendedRoute, clinicalUseIssue, associatedMedication, associatedDefinition, preparationInstruction, cost, monograph,
  *   packaging, ingredient, monitoringProgram, drugCharacteristic, kineticCharacteristic, medicineClassification, regulatory,
  *   relatedMedicationKnowledge, indicationGuideline.
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
  * @param code
  *   - A code that specifies this medication, or a textual description if no code is available. Usage note: This could be a
  *   standard medication code such as a code from RxNorm, SNOMED CT, IDMP etc. It could also be a national or local formulary
  *   code, optionally with translations to other code systems.
  * @param status
  *   - A code to indicate if the medication is in active use. The status refers to the validity about the information of the
  *   medication and not to its medicinal properties.
  * @param author
  *   - The creator or owner of the knowledge or information about the medication.
  * @param amount
  *   - Specific amount of the drug in the packaged product. For example, when specifying a product that has the same strength
  *   (For example, Insulin glargine 100 unit per mL solution for injection), this attribute provides additional clarification of
  *   the package amount (For example, 3 mL, 10mL, etc.).
  * @param device
  *   - A device associated with the medication (for example, a drug coated catheter or a drug impregnated dressing).
  * @param sponsor
  *   - Describes the details of the manufacturer of the medication product. This is not intended to represent the distributor of
  *   a medication product.  Describes the organization that is responsible for the manufacturing of the item and holds the
  *   registration to market the product in a jurisdiction. This might not be the company that physically manufactures the
  *   product.  May be known as Market Authorization Holder.
  * @param synonym
  *   - Additional names for a medication, for example, the name(s) given to a medication in different countries. For example,
  *   acetaminophen and paracetamol or salbutamol and albuterol.
  * @param language
  *   - The base language in which the resource is written.
  * @param doseForm
  *   - Describes the form of the item. Powder; tablets; capsule.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param identifier
  *   - Business identifier for this medication.
  * @param productType
  *   - Category of the medication or product (e.g. branded product, therapeutic moeity, generic product, innovator product,
  *   etc.).
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param intendedRoute
  *   - The intended or approved route of administration.
  * @param clinicalUseIssue
  *   - Potential clinical issue with or between medication(s) (for example, drug-drug interaction, drug-disease contraindication,
  *   drug-allergy interaction, etc.).
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *   the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually
  *   modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict
  *   set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param associatedMedication
  *   - Links to associated medications that could be prescribed, dispensed or administered.
  * @param associatedDefinition
  *   - Associated definitions for this medication.
  * @param preparationInstruction
  *   - The instructions for preparing the medication.
  * @param cost
  *   - The price of the medication.
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
  * @param kineticCharacteristic
  *   - The time course of drug absorption, distribution, metabolism and excretion of a medication from the body.
  * @param medicineClassification
  *   - Categorization of the medication within a formulary or classification system.
  * @param regulatory
  *   - Regulatory information about a medication.
  * @param relatedMedicationKnowledge
  *   - Associated or related medications. For example, if the medication is a branded product (e.g. Crestor), this is the
  *   Therapeutic Moeity (e.g. Rosuvastatin) or if this is a generic medication (e.g. Rosuvastatin), this would link to a branded
  *   product (e.g. Crestor.
  * @param indicationGuideline
  *   - Guidelines or protocols that are applicable for the administration of the medication based on indication.
  */
@POJOBoilerplate
class MedicationKnowledge(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val code: Option[CodeableConcept] = None,
    val status: Option[MEDICATIONKNOWLEDGE_STATUS] = None,
    val author: Option[Reference] = None,
    val amount: Option[Quantity] = None,
    val device: LitSeq[Reference] = LitSeq.empty,
    val sponsor: Option[Reference] = None,
    val synonym: LitSeq[String] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    val doseForm: Option[CodeableConcept] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val productType: LitSeq[CodeableConcept] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    val intendedRoute: LitSeq[CodeableConcept] = LitSeq.empty,
    val clinicalUseIssue: LitSeq[Reference] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val associatedMedication: LitSeq[Reference] = LitSeq.empty,
    val associatedDefinition: Option[Reference] = None,
    val preparationInstruction: Option[Markdown] = None,
    val cost: LitSeq[MedicationKnowledge.Cost] = LitSeq.empty,
    val monograph: LitSeq[MedicationKnowledge.Monograph] = LitSeq.empty,
    val packaging: LitSeq[MedicationKnowledge.Packaging] = LitSeq.empty,
    val ingredient: LitSeq[MedicationKnowledge.Ingredient] = LitSeq.empty,
    val monitoringProgram: LitSeq[MedicationKnowledge.MonitoringProgram] = LitSeq.empty,
    val drugCharacteristic: LitSeq[MedicationKnowledge.DrugCharacteristic] = LitSeq.empty,
    val kineticCharacteristic: LitSeq[MedicationKnowledge.KineticCharacteristic] = LitSeq.empty,
    val medicineClassification: LitSeq[MedicationKnowledge.MedicineClassification] = LitSeq.empty,
    val regulatory: LitSeq[MedicationKnowledge.Regulatory] = LitSeq.empty,
    val relatedMedicationKnowledge: LitSeq[MedicationKnowledge.RelatedMedicationKnowledge] = LitSeq.empty,
    val indicationGuideline: LitSeq[MedicationKnowledge.IndicationGuideline] = LitSeq.empty,
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
  override val thisTypeName: String = "MedicationKnowledge"
}
