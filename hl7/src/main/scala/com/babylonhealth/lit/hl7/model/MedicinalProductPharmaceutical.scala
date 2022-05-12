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

object MedicinalProductPharmaceutical extends CompanionFor[MedicinalProductPharmaceutical] {
  implicit def summonObjectAndCompanionMedicinalProductPharmaceutical1972361201(
      o: MedicinalProductPharmaceutical): ObjectAndCompanion[MedicinalProductPharmaceutical, MedicinalProductPharmaceutical.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = MedicinalProductPharmaceutical
  override type ParentType   = MedicinalProductPharmaceutical
  override val baseType: CompanionFor[ResourceType] = MedicinalProductPharmaceutical
  override val parentType: CompanionFor[ParentType] = MedicinalProductPharmaceutical
  override val profileUrl: Option[String] = Some("http://hl7.org/fhir/StructureDefinition/MedicinalProductPharmaceutical")
  object RouteOfAdministration extends CompanionFor[RouteOfAdministration] {
    implicit def summonObjectAndCompanionRouteOfAdministration_2069561928(
        o: RouteOfAdministration): ObjectAndCompanion[RouteOfAdministration, RouteOfAdministration.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = RouteOfAdministration
    override type ParentType   = RouteOfAdministration
    override val parentType: CompanionFor[ResourceType] = RouteOfAdministration
    object TargetSpecies extends CompanionFor[TargetSpecies] {
      implicit def summonObjectAndCompanionTargetSpecies1807831960(
          o: TargetSpecies): ObjectAndCompanion[TargetSpecies, TargetSpecies.type] = ObjectAndCompanion(o, this)
      override type ResourceType = TargetSpecies
      override type ParentType   = TargetSpecies
      override val parentType: CompanionFor[ResourceType] = TargetSpecies
      object WithdrawalPeriod extends CompanionFor[WithdrawalPeriod] {
        implicit def summonObjectAndCompanionWithdrawalPeriod427929040(
            o: WithdrawalPeriod): ObjectAndCompanion[WithdrawalPeriod, WithdrawalPeriod.type] = ObjectAndCompanion(o, this)
        override type ResourceType = WithdrawalPeriod
        override type ParentType   = WithdrawalPeriod
        override val parentType: CompanionFor[ResourceType] = WithdrawalPeriod
        def apply(
            id: Option[String] = None,
            value: Quantity,
            tissue: CodeableConcept,
            extension: LitSeq[Extension] = LitSeq.empty,
            modifierExtension: LitSeq[Extension] = LitSeq.empty,
            supportingInformation: Option[String] = None,
            primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
        ): WithdrawalPeriod = new WithdrawalPeriod(
          id,
          value,
          tissue,
          extension,
          modifierExtension,
          supportingInformation,
          primitiveAttributes = primitiveAttributes
        )
        def unapply(
            o: WithdrawalPeriod): Option[(Option[String], Quantity, CodeableConcept, LitSeq[Extension], LitSeq[Extension], Option[String])] =
          Some((o.id, o.value, o.tissue, o.extension, o.modifierExtension, o.supportingInformation))
        val id: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
        val value: FHIRComponentFieldMeta[Quantity] =
          FHIRComponentFieldMeta("value", lTagOf[Quantity], false, lTagOf[Quantity])
        val tissue: FHIRComponentFieldMeta[CodeableConcept] =
          FHIRComponentFieldMeta("tissue", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
        val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val supportingInformation: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("supportingInformation", lTagOf[Option[String]], false, lTagOf[String])
        val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
          Seq(id, value, tissue, extension, modifierExtension, supportingInformation)
        override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
        override def fields(t: WithdrawalPeriod): Seq[FHIRComponentField[_]] = Seq(
          FHIRComponentField[Option[String]](id, t.id),
          FHIRComponentField[Quantity](value, t.value),
          FHIRComponentField[CodeableConcept](tissue, t.tissue),
          FHIRComponentField[LitSeq[Extension]](extension, t.extension),
          FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
          FHIRComponentField[Option[String]](supportingInformation, t.supportingInformation)
        )
        val baseType: CompanionFor[WithdrawalPeriod] = this
        val thisName: String                         = "WithdrawalPeriod"
        def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[WithdrawalPeriod] =
          checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
            Try(
              new WithdrawalPeriod(
                cursor.decodeAs[Option[String]]("id", Some(None)),
                cursor.decodeAs[Quantity]("value", None),
                cursor.decodeAs[CodeableConcept]("tissue", None),
                cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
                cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
                cursor.decodeAs[Option[String]]("supportingInformation", Some(None)),
                decodeAttributes(cursor)
              )
            ))
      }
      @POJOBoilerplate
      class WithdrawalPeriod(
          override val id: Option[String] = None,
          val value: Quantity,
          val tissue: CodeableConcept,
          override val extension: LitSeq[Extension] = LitSeq.empty,
          override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
          val supportingInformation: Option[String] = None,
          override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
          extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
      def apply(
          id: Option[String] = None,
          code: CodeableConcept,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          withdrawalPeriod: LitSeq[TargetSpecies.WithdrawalPeriod] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): TargetSpecies = new TargetSpecies(
        id,
        code,
        extension,
        modifierExtension,
        withdrawalPeriod,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: TargetSpecies): Option[(Option[String], CodeableConcept, LitSeq[Extension], LitSeq[Extension], LitSeq[TargetSpecies.WithdrawalPeriod])] =
        Some((o.id, o.code, o.extension, o.modifierExtension, o.withdrawalPeriod))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val code: FHIRComponentFieldMeta[CodeableConcept] =
        FHIRComponentFieldMeta("code", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val withdrawalPeriod: FHIRComponentFieldMeta[LitSeq[TargetSpecies.WithdrawalPeriod]] =
        FHIRComponentFieldMeta(
          "withdrawalPeriod",
          lTagOf[LitSeq[TargetSpecies.WithdrawalPeriod]],
          false,
          lTagOf[TargetSpecies.WithdrawalPeriod])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, code, extension, modifierExtension, withdrawalPeriod)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: TargetSpecies): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[CodeableConcept](code, t.code),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
        FHIRComponentField[LitSeq[TargetSpecies.WithdrawalPeriod]](withdrawalPeriod, t.withdrawalPeriod)
      )
      val baseType: CompanionFor[TargetSpecies] = this
      val thisName: String                      = "TargetSpecies"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[TargetSpecies] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new TargetSpecies(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[CodeableConcept]("code", None),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[TargetSpecies.WithdrawalPeriod]]("withdrawalPeriod", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class TargetSpecies(
        override val id: Option[String] = None,
        val code: CodeableConcept,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        val withdrawalPeriod: LitSeq[TargetSpecies.WithdrawalPeriod] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        code: CodeableConcept,
        extension: LitSeq[Extension] = LitSeq.empty,
        firstDose: Option[Quantity] = None,
        maxSingleDose: Option[Quantity] = None,
        maxDosePerDay: Option[Quantity] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        maxTreatmentPeriod: Option[Duration] = None,
        maxDosePerTreatmentPeriod: Option[Ratio] = None,
        targetSpecies: LitSeq[RouteOfAdministration.TargetSpecies] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): RouteOfAdministration = new RouteOfAdministration(
      id,
      code,
      extension,
      firstDose,
      maxSingleDose,
      maxDosePerDay,
      modifierExtension,
      maxTreatmentPeriod,
      maxDosePerTreatmentPeriod,
      targetSpecies,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: RouteOfAdministration): Option[(Option[String], CodeableConcept, LitSeq[Extension], Option[Quantity], Option[Quantity], Option[Quantity], LitSeq[Extension], Option[Duration], Option[Ratio], LitSeq[RouteOfAdministration.TargetSpecies])] =
      Some(
        (
          o.id,
          o.code,
          o.extension,
          o.firstDose,
          o.maxSingleDose,
          o.maxDosePerDay,
          o.modifierExtension,
          o.maxTreatmentPeriod,
          o.maxDosePerTreatmentPeriod,
          o.targetSpecies))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val code: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("code", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val firstDose: FHIRComponentFieldMeta[Option[Quantity]] =
      FHIRComponentFieldMeta("firstDose", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
    val maxSingleDose: FHIRComponentFieldMeta[Option[Quantity]] =
      FHIRComponentFieldMeta("maxSingleDose", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
    val maxDosePerDay: FHIRComponentFieldMeta[Option[Quantity]] =
      FHIRComponentFieldMeta("maxDosePerDay", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val maxTreatmentPeriod: FHIRComponentFieldMeta[Option[Duration]] =
      FHIRComponentFieldMeta("maxTreatmentPeriod", lTagOf[Option[Duration]], false, lTagOf[Duration])
    val maxDosePerTreatmentPeriod: FHIRComponentFieldMeta[Option[Ratio]] =
      FHIRComponentFieldMeta("maxDosePerTreatmentPeriod", lTagOf[Option[Ratio]], false, lTagOf[Ratio])
    val targetSpecies: FHIRComponentFieldMeta[LitSeq[RouteOfAdministration.TargetSpecies]] =
      FHIRComponentFieldMeta(
        "targetSpecies",
        lTagOf[LitSeq[RouteOfAdministration.TargetSpecies]],
        false,
        lTagOf[RouteOfAdministration.TargetSpecies])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
      id,
      code,
      extension,
      firstDose,
      maxSingleDose,
      maxDosePerDay,
      modifierExtension,
      maxTreatmentPeriod,
      maxDosePerTreatmentPeriod,
      targetSpecies)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: RouteOfAdministration): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[CodeableConcept](code, t.code),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Quantity]](firstDose, t.firstDose),
      FHIRComponentField[Option[Quantity]](maxSingleDose, t.maxSingleDose),
      FHIRComponentField[Option[Quantity]](maxDosePerDay, t.maxDosePerDay),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[Duration]](maxTreatmentPeriod, t.maxTreatmentPeriod),
      FHIRComponentField[Option[Ratio]](maxDosePerTreatmentPeriod, t.maxDosePerTreatmentPeriod),
      FHIRComponentField[LitSeq[RouteOfAdministration.TargetSpecies]](targetSpecies, t.targetSpecies)
    )
    val baseType: CompanionFor[RouteOfAdministration] = this
    val thisName: String                              = "RouteOfAdministration"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[RouteOfAdministration] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new RouteOfAdministration(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[CodeableConcept]("code", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Quantity]]("firstDose", Some(None)),
            cursor.decodeAs[Option[Quantity]]("maxSingleDose", Some(None)),
            cursor.decodeAs[Option[Quantity]]("maxDosePerDay", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Duration]]("maxTreatmentPeriod", Some(None)),
            cursor.decodeAs[Option[Ratio]]("maxDosePerTreatmentPeriod", Some(None)),
            cursor.decodeAs[LitSeq[RouteOfAdministration.TargetSpecies]]("targetSpecies", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class RouteOfAdministration(
      override val id: Option[String] = None,
      val code: CodeableConcept,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val firstDose: Option[Quantity] = None,
      val maxSingleDose: Option[Quantity] = None,
      val maxDosePerDay: Option[Quantity] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val maxTreatmentPeriod: Option[Duration] = None,
      val maxDosePerTreatmentPeriod: Option[Ratio] = None,
      val targetSpecies: LitSeq[RouteOfAdministration.TargetSpecies] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Characteristics extends CompanionFor[Characteristics] {
    implicit def summonObjectAndCompanionCharacteristics_2069561928(
        o: Characteristics): ObjectAndCompanion[Characteristics, Characteristics.type] = ObjectAndCompanion(o, this)
    override type ResourceType = Characteristics
    override type ParentType   = Characteristics
    override val parentType: CompanionFor[ResourceType] = Characteristics
    def apply(
        id: Option[String] = None,
        code: CodeableConcept,
        status: Option[CodeableConcept] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Characteristics = new Characteristics(
      id,
      code,
      status,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Characteristics): Option[(Option[String], CodeableConcept, Option[CodeableConcept], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.code, o.status, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val code: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("code", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val status: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("status", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, code, status, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Characteristics): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[CodeableConcept](code, t.code),
      FHIRComponentField[Option[CodeableConcept]](status, t.status),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Characteristics] = this
    val thisName: String                        = "Characteristics"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Characteristics] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Characteristics(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[CodeableConcept]("code", None),
            cursor.decodeAs[Option[CodeableConcept]]("status", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Characteristics(
      override val id: Option[String] = None,
      val code: CodeableConcept,
      val status: Option[CodeableConcept] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      device: LitSeq[Reference] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      ingredient: LitSeq[Reference] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      unitOfPresentation: Option[CodeableConcept] = None,
      administrableDoseForm: CodeableConcept,
      characteristics: LitSeq[MedicinalProductPharmaceutical.Characteristics] = LitSeq.empty,
      routeOfAdministration: NonEmptyLitSeq[MedicinalProductPharmaceutical.RouteOfAdministration],
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): MedicinalProductPharmaceutical = new MedicinalProductPharmaceutical(
    id,
    meta,
    text,
    device,
    language,
    contained,
    extension,
    identifier,
    ingredient,
    implicitRules,
    modifierExtension,
    unitOfPresentation,
    administrableDoseForm,
    characteristics,
    routeOfAdministration,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val device: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("device", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val ingredient: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("ingredient", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val unitOfPresentation: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("unitOfPresentation", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val administrableDoseForm: FHIRComponentFieldMeta[CodeableConcept] =
    FHIRComponentFieldMeta("administrableDoseForm", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
  val characteristics: FHIRComponentFieldMeta[LitSeq[MedicinalProductPharmaceutical.Characteristics]] =
    FHIRComponentFieldMeta(
      "characteristics",
      lTagOf[LitSeq[MedicinalProductPharmaceutical.Characteristics]],
      false,
      lTagOf[MedicinalProductPharmaceutical.Characteristics])
  val routeOfAdministration: FHIRComponentFieldMeta[NonEmptyLitSeq[MedicinalProductPharmaceutical.RouteOfAdministration]] =
    FHIRComponentFieldMeta(
      "routeOfAdministration",
      lTagOf[NonEmptyLitSeq[MedicinalProductPharmaceutical.RouteOfAdministration]],
      false,
      lTagOf[MedicinalProductPharmaceutical.RouteOfAdministration]
    )
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    device,
    language,
    contained,
    extension,
    identifier,
    ingredient,
    implicitRules,
    modifierExtension,
    unitOfPresentation,
    administrableDoseForm,
    characteristics,
    routeOfAdministration
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: MedicinalProductPharmaceutical): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[LitSeq[Reference]](device, t.device),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[LitSeq[Reference]](ingredient, t.ingredient),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Option[CodeableConcept]](unitOfPresentation, t.unitOfPresentation),
    FHIRComponentField[CodeableConcept](administrableDoseForm, t.administrableDoseForm),
    FHIRComponentField[LitSeq[MedicinalProductPharmaceutical.Characteristics]](characteristics, t.characteristics),
    FHIRComponentField[NonEmptyLitSeq[MedicinalProductPharmaceutical.RouteOfAdministration]](
      routeOfAdministration,
      t.routeOfAdministration)
  )
  def extractId(t: MedicinalProductPharmaceutical): Option[String]                          = t.id
  def extractMeta(t: MedicinalProductPharmaceutical): Option[Meta]                          = t.meta
  def extractText(t: MedicinalProductPharmaceutical): Option[Narrative]                     = t.text
  def extractDevice(t: MedicinalProductPharmaceutical): LitSeq[Reference]                   = t.device
  def extractLanguage(t: MedicinalProductPharmaceutical): Option[LANGUAGES]                 = t.language
  def extractContained(t: MedicinalProductPharmaceutical): LitSeq[Resource]                 = t.contained
  def extractExtension(t: MedicinalProductPharmaceutical): LitSeq[Extension]                = t.extension
  def extractIdentifier(t: MedicinalProductPharmaceutical): LitSeq[Identifier]              = t.identifier
  def extractIngredient(t: MedicinalProductPharmaceutical): LitSeq[Reference]               = t.ingredient
  def extractImplicitRules(t: MedicinalProductPharmaceutical): Option[UriStr]               = t.implicitRules
  def extractModifierExtension(t: MedicinalProductPharmaceutical): LitSeq[Extension]        = t.modifierExtension
  def extractUnitOfPresentation(t: MedicinalProductPharmaceutical): Option[CodeableConcept] = t.unitOfPresentation
  def extractAdministrableDoseForm(t: MedicinalProductPharmaceutical): CodeableConcept      = t.administrableDoseForm
  def extractCharacteristics(t: MedicinalProductPharmaceutical): LitSeq[MedicinalProductPharmaceutical.Characteristics] =
    t.characteristics
  def extractRouteOfAdministration(
      t: MedicinalProductPharmaceutical): NonEmptyLitSeq[MedicinalProductPharmaceutical.RouteOfAdministration] =
    t.routeOfAdministration
  override val thisName: String = "MedicinalProductPharmaceutical"
  override val searchParams: Map[String, MedicinalProductPharmaceutical => Seq[Any]] = Map(
    "identifier"     -> (obj => obj.identifier.toSeq),
    "route"          -> (obj => obj.routeOfAdministration.map(_.code).toSeq),
    "target-species" -> (obj => obj.routeOfAdministration.flatMap(_.targetSpecies).map(_.code).toSeq)
  )
  def unapply(
      o: MedicinalProductPharmaceutical): Option[(Option[String], Option[Meta], Option[Narrative], LitSeq[Reference], Option[LANGUAGES], LitSeq[Resource], LitSeq[Extension], LitSeq[Identifier], LitSeq[Reference], Option[UriStr], LitSeq[Extension], Option[CodeableConcept], CodeableConcept, LitSeq[MedicinalProductPharmaceutical.Characteristics], NonEmptyLitSeq[MedicinalProductPharmaceutical.RouteOfAdministration])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.device,
        o.language,
        o.contained,
        o.extension,
        o.identifier,
        o.ingredient,
        o.implicitRules,
        o.modifierExtension,
        o.unitOfPresentation,
        o.administrableDoseForm,
        o.characteristics,
        o.routeOfAdministration))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[MedicinalProductPharmaceutical] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new MedicinalProductPharmaceutical(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("device", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("ingredient", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("unitOfPresentation", Some(None)),
          cursor.decodeAs[CodeableConcept]("administrableDoseForm", None),
          cursor.decodeAs[LitSeq[MedicinalProductPharmaceutical.Characteristics]]("characteristics", Some(LitSeq.empty)),
          cursor.decodeAs[NonEmptyLitSeq[MedicinalProductPharmaceutical.RouteOfAdministration]]("routeOfAdministration", None),
          decodeAttributes(cursor)
        )
      ))
}

/** A pharmaceutical product described in terms of its composition and dose form.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields device, identifier, ingredient, unitOfPresentation, administrableDoseForm, characteristics,
  *   routeOfAdministration.
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
  * @param device
  *   - Accompanying device.
  * @param language
  *   - The base language in which the resource is written.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param identifier
  *   - An identifier for the pharmaceutical medicinal product.
  * @param ingredient
  *   - Ingredient.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that
  *   modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *   Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *   strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *   extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *   processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any
  *   elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param unitOfPresentation
  *   - Todo.
  * @param administrableDoseForm
  *   - The administrable dose form, after necessary reconstitution.
  * @param characteristics
  *   - Characteristics e.g. a products onset of action.
  * @param routeOfAdministration
  *   - The path by which the pharmaceutical product is taken into or makes contact with the body.
  */
@POJOBoilerplate
class MedicinalProductPharmaceutical(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val device: LitSeq[Reference] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val ingredient: LitSeq[Reference] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val unitOfPresentation: Option[CodeableConcept] = None,
    val administrableDoseForm: CodeableConcept,
    val characteristics: LitSeq[MedicinalProductPharmaceutical.Characteristics] = LitSeq.empty,
    val routeOfAdministration: NonEmptyLitSeq[MedicinalProductPharmaceutical.RouteOfAdministration],
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
  override val thisTypeName: String = "MedicinalProductPharmaceutical"
}
