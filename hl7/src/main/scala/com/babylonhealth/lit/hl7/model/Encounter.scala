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
import com.babylonhealth.lit.hl7.{ ENCOUNTER_LOCATION_STATUS, LOCATION_STATUS, ENCOUNTER_STATUS }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Encounter extends CompanionFor[Encounter] {
  implicit def summonObjectAndCompanionEncounter_810021666(o: Encounter): ObjectAndCompanion[Encounter, Encounter.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Encounter
  override type ParentType   = Encounter
  override val baseType: CompanionFor[ResourceType] = Encounter
  override val parentType: CompanionFor[ParentType] = Encounter
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Encounter")
  object Hospitalization extends CompanionFor[Hospitalization] {
    implicit def summonObjectAndCompanionHospitalization_1533734362(
        o: Hospitalization): ObjectAndCompanion[Hospitalization, Hospitalization.type] = ObjectAndCompanion(o, this)
    override type ResourceType = Hospitalization
    override type ParentType   = Hospitalization
    override val parentType: CompanionFor[ResourceType] = Hospitalization
    def apply(
        id: Option[String] = None,
        origin: Option[Reference] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        admitSource: Option[CodeableConcept] = None,
        reAdmission: Option[CodeableConcept] = None,
        destination: Option[Reference] = None,
        dietPreference: LitSeq[CodeableConcept] = LitSeq.empty,
        specialCourtesy: LitSeq[CodeableConcept] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        specialArrangement: LitSeq[CodeableConcept] = LitSeq.empty,
        dischargeDisposition: Option[CodeableConcept] = None,
        preAdmissionIdentifier: Option[Identifier] = None,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Hospitalization = new Hospitalization(
      id,
      origin,
      extension,
      admitSource,
      reAdmission,
      destination,
      dietPreference,
      specialCourtesy,
      modifierExtension,
      specialArrangement,
      dischargeDisposition,
      preAdmissionIdentifier,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Hospitalization): Option[(Option[String], Option[Reference], LitSeq[Extension], Option[CodeableConcept], Option[CodeableConcept], Option[Reference], LitSeq[CodeableConcept], LitSeq[CodeableConcept], LitSeq[Extension], LitSeq[CodeableConcept], Option[CodeableConcept], Option[Identifier])] =
      Some(
        (
          o.id,
          o.origin,
          o.extension,
          o.admitSource,
          o.reAdmission,
          o.destination,
          o.dietPreference,
          o.specialCourtesy,
          o.modifierExtension,
          o.specialArrangement,
          o.dischargeDisposition,
          o.preAdmissionIdentifier))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val origin: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("origin", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val admitSource: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("admitSource", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val reAdmission: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("reAdmission", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val destination: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("destination", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val dietPreference: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("dietPreference", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val specialCourtesy: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("specialCourtesy", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val specialArrangement: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("specialArrangement", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val dischargeDisposition: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("dischargeDisposition", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val preAdmissionIdentifier: FHIRComponentFieldMeta[Option[Identifier]] =
      FHIRComponentFieldMeta("preAdmissionIdentifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
      id,
      origin,
      extension,
      admitSource,
      reAdmission,
      destination,
      dietPreference,
      specialCourtesy,
      modifierExtension,
      specialArrangement,
      dischargeDisposition,
      preAdmissionIdentifier
    )
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Hospitalization): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Reference]](origin, t.origin),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[CodeableConcept]](admitSource, t.admitSource),
      FHIRComponentField[Option[CodeableConcept]](reAdmission, t.reAdmission),
      FHIRComponentField[Option[Reference]](destination, t.destination),
      FHIRComponentField[LitSeq[CodeableConcept]](dietPreference, t.dietPreference),
      FHIRComponentField[LitSeq[CodeableConcept]](specialCourtesy, t.specialCourtesy),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[CodeableConcept]](specialArrangement, t.specialArrangement),
      FHIRComponentField[Option[CodeableConcept]](dischargeDisposition, t.dischargeDisposition),
      FHIRComponentField[Option[Identifier]](preAdmissionIdentifier, t.preAdmissionIdentifier)
    )
    val baseType: CompanionFor[Hospitalization] = this
    val thisName: String                        = "Hospitalization"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Hospitalization] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Hospitalization(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[Reference]]("origin", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[CodeableConcept]]("admitSource", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("reAdmission", Some(None)),
            cursor.decodeAs[Option[Reference]]("destination", Some(None)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("dietPreference", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("specialCourtesy", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("specialArrangement", Some(LitSeq.empty)),
            cursor.decodeAs[Option[CodeableConcept]]("dischargeDisposition", Some(None)),
            cursor.decodeAs[Option[Identifier]]("preAdmissionIdentifier", Some(None)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Hospitalization(
      override val id: Option[String] = None,
      val origin: Option[Reference] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val admitSource: Option[CodeableConcept] = None,
      val reAdmission: Option[CodeableConcept] = None,
      val destination: Option[Reference] = None,
      val dietPreference: LitSeq[CodeableConcept] = LitSeq.empty,
      val specialCourtesy: LitSeq[CodeableConcept] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val specialArrangement: LitSeq[CodeableConcept] = LitSeq.empty,
      val dischargeDisposition: Option[CodeableConcept] = None,
      val preAdmissionIdentifier: Option[Identifier] = None,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object StatusHistory extends CompanionFor[StatusHistory] {
    implicit def summonObjectAndCompanionStatusHistory_1533734362(
        o: StatusHistory): ObjectAndCompanion[StatusHistory, StatusHistory.type] = ObjectAndCompanion(o, this)
    override type ResourceType = StatusHistory
    override type ParentType   = StatusHistory
    override val parentType: CompanionFor[ResourceType] = StatusHistory
    def apply(
        id: Option[String] = None,
        status: ENCOUNTER_STATUS,
        period: Period,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): StatusHistory = new StatusHistory(
      id,
      status,
      period,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(o: StatusHistory): Option[(Option[String], ENCOUNTER_STATUS, Period, LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.status, o.period, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val status: FHIRComponentFieldMeta[ENCOUNTER_STATUS] =
      FHIRComponentFieldMeta("status", lTagOf[ENCOUNTER_STATUS], false, lTagOf[ENCOUNTER_STATUS])
    val period: FHIRComponentFieldMeta[Period] =
      FHIRComponentFieldMeta("period", lTagOf[Period], false, lTagOf[Period])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, status, period, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: StatusHistory): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[ENCOUNTER_STATUS](status, t.status),
      FHIRComponentField[Period](period, t.period),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[StatusHistory] = this
    val thisName: String                      = "StatusHistory"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[StatusHistory] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new StatusHistory(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[ENCOUNTER_STATUS]("status", None),
            cursor.decodeAs[Period]("period", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class StatusHistory(
      override val id: Option[String] = None,
      val status: ENCOUNTER_STATUS,
      val period: Period,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object ClassHistory extends CompanionFor[ClassHistory] {
    implicit def summonObjectAndCompanionClassHistory_1533734362(
        o: ClassHistory): ObjectAndCompanion[ClassHistory, ClassHistory.type] = ObjectAndCompanion(o, this)
    override type ResourceType = ClassHistory
    override type ParentType   = ClassHistory
    override val parentType: CompanionFor[ResourceType] = ClassHistory
    def apply(
        id: Option[String] = None,
        `class`: Coding,
        period: Period,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): ClassHistory = new ClassHistory(
      id,
      `class`,
      period,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(o: ClassHistory): Option[(Option[String], Coding, Period, LitSeq[Extension], LitSeq[Extension])] = Some(
      (o.id, o.`class`, o.period, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `class`: FHIRComponentFieldMeta[Coding] =
      FHIRComponentFieldMeta("class", lTagOf[Coding], false, lTagOf[Coding])
    val period: FHIRComponentFieldMeta[Period] =
      FHIRComponentFieldMeta("period", lTagOf[Period], false, lTagOf[Period])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, `class`, period, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: ClassHistory): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Coding](`class`, t.`class`),
      FHIRComponentField[Period](period, t.period),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[ClassHistory] = this
    val thisName: String                     = "ClassHistory"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ClassHistory] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new ClassHistory(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Coding]("class", None),
            cursor.decodeAs[Period]("period", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class ClassHistory(
      override val id: Option[String] = None,
      val `class`: Coding,
      val period: Period,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Participant extends CompanionFor[Participant] {
    implicit def summonObjectAndCompanionParticipant_1533734362(
        o: Participant): ObjectAndCompanion[Participant, Participant.type] = ObjectAndCompanion(o, this)
    override type ResourceType = Participant
    override type ParentType   = Participant
    override val parentType: CompanionFor[ResourceType] = Participant
    def apply(
        id: Option[String] = None,
        `type`: LitSeq[CodeableConcept] = LitSeq.empty,
        period: Option[Period] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        individual: Option[Reference] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Participant = new Participant(
      id,
      `type`,
      period,
      extension,
      individual,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Participant): Option[(Option[String], LitSeq[CodeableConcept], Option[Period], LitSeq[Extension], Option[Reference], LitSeq[Extension])] =
      Some((o.id, o.`type`, o.period, o.extension, o.individual, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val period: FHIRComponentFieldMeta[Option[Period]] =
      FHIRComponentFieldMeta("period", lTagOf[Option[Period]], false, lTagOf[Period])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val individual: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("individual", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, `type`, period, extension, individual, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Participant): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[Option[Period]](period, t.period),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Reference]](individual, t.individual),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Participant] = this
    val thisName: String                    = "Participant"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Participant] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Participant(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("type", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Period]]("period", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Reference]]("individual", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Participant(
      override val id: Option[String] = None,
      val `type`: LitSeq[CodeableConcept] = LitSeq.empty,
      val period: Option[Period] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val individual: Option[Reference] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Diagnosis extends CompanionFor[Diagnosis] {
    implicit def summonObjectAndCompanionDiagnosis_1533734362(o: Diagnosis): ObjectAndCompanion[Diagnosis, Diagnosis.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Diagnosis
    override type ParentType   = Diagnosis
    override val parentType: CompanionFor[ResourceType] = Diagnosis
    def apply(
        id: Option[String] = None,
        use: Option[CodeableConcept] = None,
        rank: Option[PositiveInt] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        condition: Reference,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Diagnosis = new Diagnosis(
      id,
      use,
      rank,
      extension,
      condition,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Diagnosis): Option[(Option[String], Option[CodeableConcept], Option[PositiveInt], LitSeq[Extension], Reference, LitSeq[Extension])] =
      Some((o.id, o.use, o.rank, o.extension, o.condition, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val use: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("use", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val rank: FHIRComponentFieldMeta[Option[PositiveInt]] =
      FHIRComponentFieldMeta("rank", lTagOf[Option[PositiveInt]], false, lTagOf[PositiveInt])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val condition: FHIRComponentFieldMeta[Reference] =
      FHIRComponentFieldMeta("condition", lTagOf[Reference], false, lTagOf[Reference])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, use, rank, extension, condition, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Diagnosis): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](use, t.use),
      FHIRComponentField[Option[PositiveInt]](rank, t.rank),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Reference](condition, t.condition),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Diagnosis] = this
    val thisName: String                  = "Diagnosis"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Diagnosis] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Diagnosis(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("use", Some(None)),
            cursor.decodeAs[Option[PositiveInt]]("rank", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Reference]("condition", None),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Diagnosis(
      override val id: Option[String] = None,
      val use: Option[CodeableConcept] = None,
      val rank: Option[PositiveInt] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val condition: Reference,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Location extends CompanionFor[Location] {
    implicit def summonObjectAndCompanionLocation_1533734362(o: Location): ObjectAndCompanion[Location, Location.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Location
    override type ParentType   = Location
    override val parentType: CompanionFor[ResourceType] = Location
    def apply(
        id: Option[String] = None,
        status: Option[ENCOUNTER_LOCATION_STATUS] = None,
        period: Option[Period] = None,
        location: Reference,
        extension: LitSeq[Extension] = LitSeq.empty,
        physicalType: Option[CodeableConcept] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Location = new Location(
      id,
      status,
      period,
      location,
      extension,
      physicalType,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Location): Option[(Option[String], Option[ENCOUNTER_LOCATION_STATUS], Option[Period], Reference, LitSeq[Extension], Option[CodeableConcept], LitSeq[Extension])] =
      Some((o.id, o.status, o.period, o.location, o.extension, o.physicalType, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val status: FHIRComponentFieldMeta[Option[ENCOUNTER_LOCATION_STATUS]] =
      FHIRComponentFieldMeta("status", lTagOf[Option[ENCOUNTER_LOCATION_STATUS]], false, lTagOf[ENCOUNTER_LOCATION_STATUS])
    val period: FHIRComponentFieldMeta[Option[Period]] =
      FHIRComponentFieldMeta("period", lTagOf[Option[Period]], false, lTagOf[Period])
    val location: FHIRComponentFieldMeta[Reference] =
      FHIRComponentFieldMeta("location", lTagOf[Reference], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val physicalType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("physicalType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, status, period, location, extension, physicalType, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Location): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[ENCOUNTER_LOCATION_STATUS]](status, t.status),
      FHIRComponentField[Option[Period]](period, t.period),
      FHIRComponentField[Reference](location, t.location),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[CodeableConcept]](physicalType, t.physicalType),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Location] = this
    val thisName: String                 = "Location"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Location] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Location(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[ENCOUNTER_LOCATION_STATUS]]("status", Some(None)),
            cursor.decodeAs[Option[Period]]("period", Some(None)),
            cursor.decodeAs[Reference]("location", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[CodeableConcept]]("physicalType", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Location(
      override val id: Option[String] = None,
      val status: Option[ENCOUNTER_LOCATION_STATUS] = None,
      val period: Option[Period] = None,
      val location: Reference,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val physicalType: Option[CodeableConcept] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      `type`: LitSeq[CodeableConcept] = LitSeq.empty,
      `class`: Coding,
      status: ENCOUNTER_STATUS,
      period: Option[Period] = None,
      length: Option[Duration] = None,
      partOf: Option[Reference] = None,
      subject: Option[Reference] = None,
      basedOn: LitSeq[Reference] = LitSeq.empty,
      account: LitSeq[Reference] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      priority: Option[CodeableConcept] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
      serviceType: Option[CodeableConcept] = None,
      appointment: LitSeq[Reference] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      episodeOfCare: LitSeq[Reference] = LitSeq.empty,
      reasonReference: LitSeq[Reference] = LitSeq.empty,
      serviceProvider: Option[Reference] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      location: LitSeq[Encounter.Location] = LitSeq.empty,
      diagnosis: LitSeq[Encounter.Diagnosis] = LitSeq.empty,
      participant: LitSeq[Encounter.Participant] = LitSeq.empty,
      classHistory: LitSeq[Encounter.ClassHistory] = LitSeq.empty,
      statusHistory: LitSeq[Encounter.StatusHistory] = LitSeq.empty,
      hospitalization: Option[Encounter.Hospitalization] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Encounter = new Encounter(
    id,
    meta,
    text,
    `type`,
    `class`,
    status,
    period,
    length,
    partOf,
    subject,
    basedOn,
    account,
    language,
    priority,
    contained,
    extension,
    identifier,
    reasonCode,
    serviceType,
    appointment,
    implicitRules,
    episodeOfCare,
    reasonReference,
    serviceProvider,
    modifierExtension,
    location,
    diagnosis,
    participant,
    classHistory,
    statusHistory,
    hospitalization,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val `type`: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("type", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val `class`: FHIRComponentFieldMeta[Coding] =
    FHIRComponentFieldMeta("class", lTagOf[Coding], false, lTagOf[Coding])
  val status: FHIRComponentFieldMeta[ENCOUNTER_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[ENCOUNTER_STATUS], false, lTagOf[ENCOUNTER_STATUS])
  val period: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("period", lTagOf[Option[Period]], false, lTagOf[Period])
  val length: FHIRComponentFieldMeta[Option[Duration]] =
    FHIRComponentFieldMeta("length", lTagOf[Option[Duration]], false, lTagOf[Duration])
  val partOf: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("partOf", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val subject: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("subject", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val basedOn: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("basedOn", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val account: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("account", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val priority: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("priority", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val reasonCode: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("reasonCode", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val serviceType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("serviceType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val appointment: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("appointment", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val episodeOfCare: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("episodeOfCare", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val reasonReference: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("reasonReference", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val serviceProvider: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("serviceProvider", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val location: FHIRComponentFieldMeta[LitSeq[Encounter.Location]] =
    FHIRComponentFieldMeta("location", lTagOf[LitSeq[Encounter.Location]], false, lTagOf[Encounter.Location])
  val diagnosis: FHIRComponentFieldMeta[LitSeq[Encounter.Diagnosis]] =
    FHIRComponentFieldMeta("diagnosis", lTagOf[LitSeq[Encounter.Diagnosis]], false, lTagOf[Encounter.Diagnosis])
  val participant: FHIRComponentFieldMeta[LitSeq[Encounter.Participant]] =
    FHIRComponentFieldMeta("participant", lTagOf[LitSeq[Encounter.Participant]], false, lTagOf[Encounter.Participant])
  val classHistory: FHIRComponentFieldMeta[LitSeq[Encounter.ClassHistory]] =
    FHIRComponentFieldMeta("classHistory", lTagOf[LitSeq[Encounter.ClassHistory]], false, lTagOf[Encounter.ClassHistory])
  val statusHistory: FHIRComponentFieldMeta[LitSeq[Encounter.StatusHistory]] =
    FHIRComponentFieldMeta("statusHistory", lTagOf[LitSeq[Encounter.StatusHistory]], false, lTagOf[Encounter.StatusHistory])
  val hospitalization: FHIRComponentFieldMeta[Option[Encounter.Hospitalization]] =
    FHIRComponentFieldMeta("hospitalization", lTagOf[Option[Encounter.Hospitalization]], false, lTagOf[Encounter.Hospitalization])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    `type`,
    `class`,
    status,
    period,
    length,
    partOf,
    subject,
    basedOn,
    account,
    language,
    priority,
    contained,
    extension,
    identifier,
    reasonCode,
    serviceType,
    appointment,
    implicitRules,
    episodeOfCare,
    reasonReference,
    serviceProvider,
    modifierExtension,
    location,
    diagnosis,
    participant,
    classHistory,
    statusHistory,
    hospitalization
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Encounter): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[LitSeq[CodeableConcept]](`type`, t.`type`),
    FHIRComponentField[Coding](`class`, t.`class`),
    FHIRComponentField[ENCOUNTER_STATUS](status, t.status),
    FHIRComponentField[Option[Period]](period, t.period),
    FHIRComponentField[Option[Duration]](length, t.length),
    FHIRComponentField[Option[Reference]](partOf, t.partOf),
    FHIRComponentField[Option[Reference]](subject, t.subject),
    FHIRComponentField[LitSeq[Reference]](basedOn, t.basedOn),
    FHIRComponentField[LitSeq[Reference]](account, t.account),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Option[CodeableConcept]](priority, t.priority),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[LitSeq[CodeableConcept]](reasonCode, t.reasonCode),
    FHIRComponentField[Option[CodeableConcept]](serviceType, t.serviceType),
    FHIRComponentField[LitSeq[Reference]](appointment, t.appointment),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Reference]](episodeOfCare, t.episodeOfCare),
    FHIRComponentField[LitSeq[Reference]](reasonReference, t.reasonReference),
    FHIRComponentField[Option[Reference]](serviceProvider, t.serviceProvider),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[Encounter.Location]](location, t.location),
    FHIRComponentField[LitSeq[Encounter.Diagnosis]](diagnosis, t.diagnosis),
    FHIRComponentField[LitSeq[Encounter.Participant]](participant, t.participant),
    FHIRComponentField[LitSeq[Encounter.ClassHistory]](classHistory, t.classHistory),
    FHIRComponentField[LitSeq[Encounter.StatusHistory]](statusHistory, t.statusHistory),
    FHIRComponentField[Option[Encounter.Hospitalization]](hospitalization, t.hospitalization)
  )
  def extractId(t: Encounter): Option[String]                                 = t.id
  def extractMeta(t: Encounter): Option[Meta]                                 = t.meta
  def extractText(t: Encounter): Option[Narrative]                            = t.text
  def extractType(t: Encounter): LitSeq[CodeableConcept]                      = t.`type`
  def extractClass(t: Encounter): Coding                                      = t.`class`
  def extractStatus(t: Encounter): ENCOUNTER_STATUS                           = t.status
  def extractPeriod(t: Encounter): Option[Period]                             = t.period
  def extractLength(t: Encounter): Option[Duration]                           = t.length
  def extractPartOf(t: Encounter): Option[Reference]                          = t.partOf
  def extractSubject(t: Encounter): Option[Reference]                         = t.subject
  def extractBasedOn(t: Encounter): LitSeq[Reference]                         = t.basedOn
  def extractAccount(t: Encounter): LitSeq[Reference]                         = t.account
  def extractLanguage(t: Encounter): Option[LANGUAGES]                        = t.language
  def extractPriority(t: Encounter): Option[CodeableConcept]                  = t.priority
  def extractContained(t: Encounter): LitSeq[Resource]                        = t.contained
  def extractExtension(t: Encounter): LitSeq[Extension]                       = t.extension
  def extractIdentifier(t: Encounter): LitSeq[Identifier]                     = t.identifier
  def extractReasonCode(t: Encounter): LitSeq[CodeableConcept]                = t.reasonCode
  def extractServiceType(t: Encounter): Option[CodeableConcept]               = t.serviceType
  def extractAppointment(t: Encounter): LitSeq[Reference]                     = t.appointment
  def extractImplicitRules(t: Encounter): Option[UriStr]                      = t.implicitRules
  def extractEpisodeOfCare(t: Encounter): LitSeq[Reference]                   = t.episodeOfCare
  def extractReasonReference(t: Encounter): LitSeq[Reference]                 = t.reasonReference
  def extractServiceProvider(t: Encounter): Option[Reference]                 = t.serviceProvider
  def extractModifierExtension(t: Encounter): LitSeq[Extension]               = t.modifierExtension
  def extractLocation(t: Encounter): LitSeq[Encounter.Location]               = t.location
  def extractDiagnosis(t: Encounter): LitSeq[Encounter.Diagnosis]             = t.diagnosis
  def extractParticipant(t: Encounter): LitSeq[Encounter.Participant]         = t.participant
  def extractClassHistory(t: Encounter): LitSeq[Encounter.ClassHistory]       = t.classHistory
  def extractStatusHistory(t: Encounter): LitSeq[Encounter.StatusHistory]     = t.statusHistory
  def extractHospitalization(t: Encounter): Option[Encounter.Hospitalization] = t.hospitalization
  override val thisName: String                                               = "Encounter"
  override val searchParams: Map[String, Encounter => Seq[Any]] = Map(
    "location-period"     -> (obj => obj.location.flatMap(_.period).toSeq),
    "subject"             -> (obj => obj.subject.toSeq),
    "identifier"          -> (obj => obj.identifier.toSeq),
    "reason-code"         -> (obj => obj.reasonCode.toSeq),
    "episode-of-care"     -> (obj => obj.episodeOfCare.toSeq),
    "participant-type"    -> (obj => obj.participant.flatMap(_.`type`).toSeq),
    "special-arrangement" -> (obj => obj.hospitalization.toSeq.flatMap(_.specialArrangement).toSeq),
    "date"                -> (obj => obj.period.toSeq),
    "status"              -> (obj => Seq(obj.status)),
    "account"             -> (obj => obj.account.toSeq),
    "appointment"         -> (obj => obj.appointment.toSeq),
    "based-on"            -> (obj => obj.basedOn.toSeq),
    "reason-reference"    -> (obj => obj.reasonReference.toSeq),
    "patient"             -> (obj => obj.subject.filter(_.reference.exists(_.contains("Patient/"))).toSeq),
    "practitioner" -> (obj =>
      obj.participant.flatMap(_.individual).filter(_.reference.exists(_.contains("Practitioner/"))).toSeq),
    "participant"      -> (obj => obj.participant.flatMap(_.individual).toSeq),
    "diagnosis"        -> (obj => obj.diagnosis.map(_.condition).toSeq),
    "location"         -> (obj => obj.location.map(_.location).toSeq),
    "class"            -> (obj => Seq(obj.`class`)),
    "length"           -> (obj => obj.length.toSeq),
    "service-provider" -> (obj => obj.serviceProvider.toSeq),
    "part-of"          -> (obj => obj.partOf.toSeq),
    "type"             -> (obj => obj.`type`.toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Encounter] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Encounter(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("type", Some(LitSeq.empty)),
          cursor.decodeAs[Coding]("class", None),
          cursor.decodeAs[ENCOUNTER_STATUS]("status", None),
          cursor.decodeAs[Option[Period]]("period", Some(None)),
          cursor.decodeAs[Option[Duration]]("length", Some(None)),
          cursor.decodeAs[Option[Reference]]("partOf", Some(None)),
          cursor.decodeAs[Option[Reference]]("subject", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("basedOn", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("account", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("priority", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("reasonCode", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("serviceType", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("appointment", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("episodeOfCare", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("reasonReference", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("serviceProvider", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Encounter.Location]]("location", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Encounter.Diagnosis]]("diagnosis", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Encounter.Participant]]("participant", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Encounter.ClassHistory]]("classHistory", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Encounter.StatusHistory]]("statusHistory", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Encounter.Hospitalization]]("hospitalization", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing
  * the health status of a patient.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields `type`, `class`, status, period, length, partOf, subject, basedOn, account, priority, identifier,
  *   reasonCode, serviceType, appointment, episodeOfCare, reasonReference, serviceProvider, location, diagnosis, participant,
  *   classHistory, statusHistory, hospitalization.
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
  *   \- Specific type of encounter (e.g. e-mail consultation, surgical day-care, skilled nursing, rehabilitation).
  * @param `class`
  *   \- Concepts representing classification of patient encounter such as ambulatory (outpatient), inpatient, emergency, home
  *   health or others due to local variations.
  * @param status
  *   \- planned | arrived | triaged | in-progress | onleave | finished | cancelled +.
  * @param period
  *   \- The start and end time of the encounter.
  * @param length
  *   \- Quantity of time the encounter lasted. This excludes the time during leaves of absence.
  * @param partOf
  *   \- Another Encounter of which this encounter is a part of (administratively or in time).
  * @param subject
  *   \- The patient or group present at the encounter.
  * @param basedOn
  *   \- The request this encounter satisfies (e.g. incoming referral or procedure request).
  * @param account
  *   \- The set of accounts that may be used for billing for this Encounter.
  * @param language
  *   \- The base language in which the resource is written.
  * @param priority
  *   \- Indicates the urgency of the encounter.
  * @param contained
  *   \- These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   \- May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param identifier
  *   \- Identifier(s) by which this encounter is known.
  * @param reasonCode
  *   \- Reason the encounter takes place, expressed as a code. For admissions, this can be used for a coded admission diagnosis.
  * @param serviceType
  *   \- Broad categorization of the service that is to be provided (e.g. cardiology).
  * @param appointment
  *   \- The appointment that scheduled this encounter.
  * @param implicitRules
  *   \- A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param episodeOfCare
  *   \- Where a specific encounter should be classified as a part of a specific episode(s) of care this field should be used.
  *   This association can facilitate grouping of related encounters together for a specific purpose, such as government
  *   reporting, issue tracking, association via a common problem. The association is recorded on the encounter as these are
  *   typically created after the episode of care and grouped on entry rather than editing the episode of care to append another
  *   encounter to it (the episode of care could span years).
  * @param reasonReference
  *   \- Reason the encounter takes place, expressed as a code. For admissions, this can be used for a coded admission diagnosis.
  * @param serviceProvider
  *   \- The organization that is primarily responsible for this Encounter's services. This MAY be the same as the organization on
  *   the Patient record, however it could be different, such as if the actor performing the services was from an external
  *   organization (which may be billed seperately) for an external consultation. Refer to the example bundle showing an
  *   abbreviated set of Encounters for a colonoscopy.
  * @param modifierExtension
  *   \- May be used to represent additional information that is not part of the basic definition of the resource and that
  *   modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *   Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *   strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *   extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *   processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any
  *   elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param location
  *   \- List of locations where the patient has been during this encounter.
  * @param diagnosis
  *   \- The list of diagnosis relevant to this encounter.
  * @param participant
  *   \- The list of people responsible for providing the service.
  * @param classHistory
  *   \- The class history permits the tracking of the encounters transitions without needing to go through the resource history.
  *   This would be used for a case where an admission starts of as an emergency encounter, then transitions into an inpatient
  *   scenario. Doing this and not restarting a new encounter ensures that any lab/diagnostic results can more easily follow the
  *   patient and not require re-processing and not get lost or cancelled during a kind of discharge from emergency to inpatient.
  * @param statusHistory
  *   \- The status history permits the encounter resource to contain the status history without needing to read through the
  *   historical versions of the resource, or even have the server store them.
  * @param hospitalization
  *   \- Details about the admission to a healthcare service.
  */
@POJOBoilerplate
class Encounter(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val `type`: LitSeq[CodeableConcept] = LitSeq.empty,
    val `class`: Coding,
    val status: ENCOUNTER_STATUS,
    val period: Option[Period] = None,
    val length: Option[Duration] = None,
    val partOf: Option[Reference] = None,
    val subject: Option[Reference] = None,
    val basedOn: LitSeq[Reference] = LitSeq.empty,
    val account: LitSeq[Reference] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    val priority: Option[CodeableConcept] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
    val serviceType: Option[CodeableConcept] = None,
    val appointment: LitSeq[Reference] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    val episodeOfCare: LitSeq[Reference] = LitSeq.empty,
    val reasonReference: LitSeq[Reference] = LitSeq.empty,
    val serviceProvider: Option[Reference] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val location: LitSeq[Encounter.Location] = LitSeq.empty,
    val diagnosis: LitSeq[Encounter.Diagnosis] = LitSeq.empty,
    val participant: LitSeq[Encounter.Participant] = LitSeq.empty,
    val classHistory: LitSeq[Encounter.ClassHistory] = LitSeq.empty,
    val statusHistory: LitSeq[Encounter.StatusHistory] = LitSeq.empty,
    val hospitalization: Option[Encounter.Hospitalization] = None,
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
  override val thisTypeName: String = "Encounter"
}
