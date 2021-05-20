package com.babylonhealth.lit.core.model

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
import com.babylonhealth.lit.core.UnionAliases._

import com.babylonhealth.lit.{ core }
import com.babylonhealth.lit.macros.POJOBoilerplate

<<<<<<< HEAD
object Dosage extends CompanionFor[Dosage] {
  implicit def summonObjectAndCompanionDosage_1069907220(o: Dosage): ObjectAndCompanion[Dosage, Dosage.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Dosage
  override type ParentType   = Dosage
  override val baseType: CompanionFor[ResourceType] = Dosage
  override val parentType: CompanionFor[ParentType] = Dosage
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Dosage")
  object DoseAndRate extends CompanionFor[DoseAndRate] {
    implicit def summonObjectAndCompanionDoseAndRate_189336146(
        o: DoseAndRate): ObjectAndCompanion[DoseAndRate, DoseAndRate.type] = ObjectAndCompanion(o, this)
    override type ResourceType = DoseAndRate
    override type ParentType   = DoseAndRate
    override val parentType: CompanionFor[ResourceType] = DoseAndRate
    type DoseChoice = Choice[UnionQuantityOrRange]
    type RateChoice = Choice[UnionQuantityOrRangeOrRatio]
    def apply(
=======
object Dosage extends CompanionFor[Dosage[_]] {
  override type ResourceType[T] = Dosage[T]
  override val baseType: CompanionFor[ResourceType[_]] = Dosage
  override val profileUrl: Option[String]              = Some("http://hl7.org/fhir/StructureDefinition/Dosage")
  object DoseAndRate extends CompanionFor[DoseAndRate[_]] {
    override type ResourceType[T] = DoseAndRate[T]
    type DoseChoice[Stage]        = Choice[Union01639511888[Stage]]
    type RateChoice[Stage]        = Choice[Union_0575082635[Stage]]
    def apply[Stage <: LifecycleStage: ValueOf](
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
        id: Option[String] = None,
        `type`: Option[CodeableConcept[Stage]] = None,
        dose: Option[DoseAndRate.DoseChoice[Stage]] = None,
        rate: Option[DoseAndRate.RateChoice[Stage]] = None,
        extension: LitSeq[Extension[Stage]] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): DoseAndRate[Stage] = new DoseAndRate[Stage](
      id,
      `type`,
      dose,
      rate,
      extension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply[Stage <: LifecycleStage: ValueOf](o: DoseAndRate[
      Stage]): Option[(Option[String], Option[CodeableConcept[Stage]], Option[DoseAndRate.DoseChoice[Stage]], Option[DoseAndRate.RateChoice[Stage]], LitSeq[Extension[Stage]])] =
      Some((o.id, o.`type`, o.dose, o.rate, o.extension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
<<<<<<< HEAD
    val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val dose: FHIRComponentFieldMeta[Option[DoseAndRate.DoseChoice]] =
      FHIRComponentFieldMeta("dose", lTagOf[Option[DoseAndRate.DoseChoice]], true, lTagOf[UnionQuantityOrRange])
    val rate: FHIRComponentFieldMeta[Option[DoseAndRate.RateChoice]] =
      FHIRComponentFieldMeta("rate", lTagOf[Option[DoseAndRate.RateChoice]], true, lTagOf[UnionQuantityOrRangeOrRatio])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, `type`, dose, rate, extension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: DoseAndRate): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[Option[DoseAndRate.DoseChoice]](dose, t.dose),
      FHIRComponentField[Option[DoseAndRate.RateChoice]](rate, t.rate),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension)
    )
    val baseType: CompanionFor[DoseAndRate] = this
    val thisName: String                    = "DoseAndRate"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[DoseAndRate] =
=======
    def `type`[Stage]: FHIRComponentFieldMeta[Option[CodeableConcept[Stage]]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept[Stage]]], false, lTagOf[CodeableConcept[Stage]])
    def dose[Stage]: FHIRComponentFieldMeta[Option[DoseAndRate.DoseChoice[Stage]]] =
      FHIRComponentFieldMeta(
        "dose",
        lTagOf[Option[DoseAndRate.DoseChoice[Stage]]],
        true,
        lTagOf[Union01639511888[Stage]])
    def rate[Stage]: FHIRComponentFieldMeta[Option[DoseAndRate.RateChoice[Stage]]] =
      FHIRComponentFieldMeta(
        "rate",
        lTagOf[Option[DoseAndRate.RateChoice[Stage]]],
        true,
        lTagOf[Union_0575082635[Stage]])
    def extension[Stage]: FHIRComponentFieldMeta[LitSeq[Extension[Stage]]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension[Stage]]], false, lTagOf[Extension[Stage]])
    def fieldsMeta[Stage <: LifecycleStage: ValueOf]: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, `type`, dose, rate, extension)
    override def fieldsFromParent[Stage <: LifecycleStage: ValueOf](
        t: ResourceType[Stage]): Try[Seq[FHIRComponentField[Stage, _]]] = Success(fields[Stage](t))
    override def fields[Stage <: LifecycleStage: ValueOf](t: DoseAndRate[Stage]): Seq[FHIRComponentField[Stage, _]] =
      Seq(
        FHIRComponentField[Stage, Option[String]](id, t.id),
        FHIRComponentField[Stage, Option[CodeableConcept[Stage]]](`type`, t.`type`),
        FHIRComponentField[Stage, Option[DoseAndRate.DoseChoice[Stage]]](dose, t.dose),
        FHIRComponentField[Stage, Option[DoseAndRate.RateChoice[Stage]]](rate, t.rate),
        FHIRComponentField[Stage, LitSeq[Extension[Stage]]](extension, t.extension)
      )
    val baseType: CompanionFor[DoseAndRate[_]] = this
    val thisName: String                       = "DoseAndRate"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[DoseAndRate[Completed.type]] =
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new DoseAndRate(
            cursor.decodeAs[Option[String]]("id", Some(None)),
<<<<<<< HEAD
            cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
            cursor.decodeOptRef[UnionQuantityOrRange]("dose"),
            cursor.decodeOptRef[UnionQuantityOrRangeOrRatio]("rate"),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
=======
            cursor.decodeAs[Option[CodeableConcept[Completed.type]]]("type", Some(None)),
            cursor.decodeOptRef[Union01639511888[Completed.type]]("dose"),
            cursor.decodeOptRef[Union_0575082635[Completed.type]]("rate"),
            cursor.decodeAs[LitSeq[Extension[Completed.type]]]("extension", Some(LitSeq.empty)),
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class DoseAndRate[Stage <: LifecycleStage: ValueOf](
      override val id: Option[String] = None,
      val `type`: Option[CodeableConcept[Stage]] = None,
      val dose: Option[DoseAndRate.DoseChoice[Stage]] = None,
      val rate: Option[DoseAndRate.RateChoice[Stage]] = None,
      override val extension: LitSeq[Extension[Stage]] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
<<<<<<< HEAD
      extends Element(id = id, extension = extension)
  type AsNeededChoice = Choice[UnionBooleanOrCodeableConcept]
  def apply(
=======
      extends Element[Stage](id = id, extension = extension)
  type AsNeededChoice[Stage] = Choice[Union_1768247138[Stage]]
  def apply[Stage <: LifecycleStage: ValueOf](
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
      id: Option[String] = None,
      text: Option[String] = None,
      site: Option[CodeableConcept[Stage]] = None,
      route: Option[CodeableConcept[Stage]] = None,
      timing: Option[Timing[Stage]] = None,
      method: Option[CodeableConcept[Stage]] = None,
      sequence: Option[Int] = None,
      extension: LitSeq[Extension[Stage]] = LitSeq.empty,
      asNeeded: Option[Dosage.AsNeededChoice[Stage]] = None,
      maxDosePerPeriod: Option[Ratio[Stage]] = None,
      modifierExtension: LitSeq[Extension[Stage]] = LitSeq.empty,
      patientInstruction: Option[String] = None,
      maxDosePerLifetime: Option[Quantity[Stage]] = None,
      additionalInstruction: LitSeq[CodeableConcept[Stage]] = LitSeq.empty,
      doseAndRate: LitSeq[Dosage.DoseAndRate[Stage]] = LitSeq.empty,
      maxDosePerAdministration: Option[Quantity[Stage]] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Dosage[Stage] = new Dosage[Stage](
    id,
    text,
    site,
    route,
    timing,
    method,
    sequence,
    extension,
    asNeeded,
    maxDosePerPeriod,
    modifierExtension,
    patientInstruction,
    maxDosePerLifetime,
    additionalInstruction,
    doseAndRate,
    maxDosePerAdministration,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val text: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[String]], false, lTagOf[String])
  def site[Stage]: FHIRComponentFieldMeta[Option[CodeableConcept[Stage]]] =
    FHIRComponentFieldMeta("site", lTagOf[Option[CodeableConcept[Stage]]], false, lTagOf[CodeableConcept[Stage]])
  def route[Stage]: FHIRComponentFieldMeta[Option[CodeableConcept[Stage]]] =
    FHIRComponentFieldMeta("route", lTagOf[Option[CodeableConcept[Stage]]], false, lTagOf[CodeableConcept[Stage]])
  def timing[Stage]: FHIRComponentFieldMeta[Option[Timing[Stage]]] =
    FHIRComponentFieldMeta("timing", lTagOf[Option[Timing[Stage]]], false, lTagOf[Timing[Stage]])
  def method[Stage]: FHIRComponentFieldMeta[Option[CodeableConcept[Stage]]] =
    FHIRComponentFieldMeta("method", lTagOf[Option[CodeableConcept[Stage]]], false, lTagOf[CodeableConcept[Stage]])
  val sequence: FHIRComponentFieldMeta[Option[Int]] =
    FHIRComponentFieldMeta("sequence", lTagOf[Option[Int]], false, lTagOf[Int])
<<<<<<< HEAD
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val asNeeded: FHIRComponentFieldMeta[Option[Dosage.AsNeededChoice]] =
    FHIRComponentFieldMeta("asNeeded", lTagOf[Option[Dosage.AsNeededChoice]], true, lTagOf[UnionBooleanOrCodeableConcept])
  val maxDosePerPeriod: FHIRComponentFieldMeta[Option[Ratio]] =
    FHIRComponentFieldMeta("maxDosePerPeriod", lTagOf[Option[Ratio]], false, lTagOf[Ratio])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
=======
  def extension[Stage]: FHIRComponentFieldMeta[LitSeq[Extension[Stage]]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension[Stage]]], false, lTagOf[Extension[Stage]])
  def asNeeded[Stage]: FHIRComponentFieldMeta[Option[Dosage.AsNeededChoice[Stage]]] =
    FHIRComponentFieldMeta(
      "asNeeded",
      lTagOf[Option[Dosage.AsNeededChoice[Stage]]],
      true,
      lTagOf[Union_1768247138[Stage]])
  def maxDosePerPeriod[Stage]: FHIRComponentFieldMeta[Option[Ratio[Stage]]] =
    FHIRComponentFieldMeta("maxDosePerPeriod", lTagOf[Option[Ratio[Stage]]], false, lTagOf[Ratio[Stage]])
  def modifierExtension[Stage]: FHIRComponentFieldMeta[LitSeq[Extension[Stage]]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension[Stage]]], false, lTagOf[Extension[Stage]])
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
  val patientInstruction: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("patientInstruction", lTagOf[Option[String]], false, lTagOf[String])
  def maxDosePerLifetime[Stage]: FHIRComponentFieldMeta[Option[Quantity[Stage]]] =
    FHIRComponentFieldMeta("maxDosePerLifetime", lTagOf[Option[Quantity[Stage]]], false, lTagOf[Quantity[Stage]])
  def additionalInstruction[Stage]: FHIRComponentFieldMeta[LitSeq[CodeableConcept[Stage]]] =
    FHIRComponentFieldMeta(
      "additionalInstruction",
      lTagOf[LitSeq[CodeableConcept[Stage]]],
      false,
      lTagOf[CodeableConcept[Stage]])
  def doseAndRate[Stage]: FHIRComponentFieldMeta[LitSeq[Dosage.DoseAndRate[Stage]]] =
    FHIRComponentFieldMeta(
      "doseAndRate",
      lTagOf[LitSeq[Dosage.DoseAndRate[Stage]]],
      false,
      lTagOf[Dosage.DoseAndRate[Stage]])
  def maxDosePerAdministration[Stage]: FHIRComponentFieldMeta[Option[Quantity[Stage]]] =
    FHIRComponentFieldMeta("maxDosePerAdministration", lTagOf[Option[Quantity[Stage]]], false, lTagOf[Quantity[Stage]])
  def fieldsMeta[Stage <: LifecycleStage: ValueOf]: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    text,
    site,
    route,
    timing,
    method,
    sequence,
    extension,
    asNeeded,
    maxDosePerPeriod,
    modifierExtension,
    patientInstruction,
    maxDosePerLifetime,
    additionalInstruction,
    doseAndRate,
    maxDosePerAdministration
  )
  override def fieldsFromParent[Stage <: LifecycleStage: ValueOf](
      t: ResourceType[Stage]): Try[Seq[FHIRComponentField[Stage, _]]] = Success(fields[Stage](t))
  override def fields[Stage <: LifecycleStage: ValueOf](t: Dosage[Stage]): Seq[FHIRComponentField[Stage, _]] = Seq(
    FHIRComponentField[Stage, Option[String]](id, t.id),
    FHIRComponentField[Stage, Option[String]](text, t.text),
    FHIRComponentField[Stage, Option[CodeableConcept[Stage]]](site, t.site),
    FHIRComponentField[Stage, Option[CodeableConcept[Stage]]](route, t.route),
    FHIRComponentField[Stage, Option[Timing[Stage]]](timing, t.timing),
    FHIRComponentField[Stage, Option[CodeableConcept[Stage]]](method, t.method),
    FHIRComponentField[Stage, Option[Int]](sequence, t.sequence),
    FHIRComponentField[Stage, LitSeq[Extension[Stage]]](extension, t.extension),
    FHIRComponentField[Stage, Option[Dosage.AsNeededChoice[Stage]]](asNeeded, t.asNeeded),
    FHIRComponentField[Stage, Option[Ratio[Stage]]](maxDosePerPeriod, t.maxDosePerPeriod),
    FHIRComponentField[Stage, LitSeq[Extension[Stage]]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Stage, Option[String]](patientInstruction, t.patientInstruction),
    FHIRComponentField[Stage, Option[Quantity[Stage]]](maxDosePerLifetime, t.maxDosePerLifetime),
    FHIRComponentField[Stage, LitSeq[CodeableConcept[Stage]]](additionalInstruction, t.additionalInstruction),
    FHIRComponentField[Stage, LitSeq[Dosage.DoseAndRate[Stage]]](doseAndRate, t.doseAndRate),
    FHIRComponentField[Stage, Option[Quantity[Stage]]](maxDosePerAdministration, t.maxDosePerAdministration)
  )
  def extractId(t: Dosage[_]): Option[String]                                               = t.id
  def extractText(t: Dosage[_]): Option[String]                                             = t.text
  def extractSite[Stage](t: Dosage[Stage]): Option[CodeableConcept[Stage]]                  = t.site
  def extractRoute[Stage](t: Dosage[Stage]): Option[CodeableConcept[Stage]]                 = t.route
  def extractTiming[Stage](t: Dosage[Stage]): Option[Timing[Stage]]                         = t.timing
  def extractMethod[Stage](t: Dosage[Stage]): Option[CodeableConcept[Stage]]                = t.method
  def extractSequence(t: Dosage[_]): Option[Int]                                            = t.sequence
  def extractExtension[Stage](t: Dosage[Stage]): LitSeq[Extension[Stage]]                   = t.extension
  def extractAsNeeded[Stage](t: Dosage[Stage]): Option[Dosage.AsNeededChoice[Stage]]        = t.asNeeded
  def extractMaxDosePerPeriod[Stage](t: Dosage[Stage]): Option[Ratio[Stage]]                = t.maxDosePerPeriod
  def extractModifierExtension[Stage](t: Dosage[Stage]): LitSeq[Extension[Stage]]           = t.modifierExtension
  def extractPatientInstruction(t: Dosage[_]): Option[String]                               = t.patientInstruction
  def extractMaxDosePerLifetime[Stage](t: Dosage[Stage]): Option[Quantity[Stage]]           = t.maxDosePerLifetime
  def extractAdditionalInstruction[Stage](t: Dosage[Stage]): LitSeq[CodeableConcept[Stage]] = t.additionalInstruction
  def extractDoseAndRate[Stage](t: Dosage[Stage]): LitSeq[Dosage.DoseAndRate[Stage]]        = t.doseAndRate
  def extractMaxDosePerAdministration[Stage](t: Dosage[Stage]): Option[Quantity[Stage]]     = t.maxDosePerAdministration
  override val thisName: String                                                             = "Dosage"
  def unapply[Stage <: LifecycleStage: ValueOf](o: Dosage[
    Stage]): Option[(Option[String], Option[String], Option[CodeableConcept[Stage]], Option[CodeableConcept[Stage]], Option[Timing[Stage]], Option[CodeableConcept[Stage]], Option[Int], LitSeq[Extension[Stage]], Option[Dosage.AsNeededChoice[Stage]], Option[Ratio[Stage]], LitSeq[Extension[Stage]], Option[String], Option[Quantity[Stage]], LitSeq[CodeableConcept[Stage]], LitSeq[Dosage.DoseAndRate[Stage]], Option[Quantity[Stage]])] =
    Some(
      (
        o.id,
        o.text,
        o.site,
        o.route,
        o.timing,
        o.method,
        o.sequence,
        o.extension,
        o.asNeeded,
        o.maxDosePerPeriod,
        o.modifierExtension,
        o.patientInstruction,
        o.maxDosePerLifetime,
        o.additionalInstruction,
        o.doseAndRate,
        o.maxDosePerAdministration))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Dosage[Completed.type]] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Dosage(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[String]]("text", Some(None)),
          cursor.decodeAs[Option[CodeableConcept[Completed.type]]]("site", Some(None)),
          cursor.decodeAs[Option[CodeableConcept[Completed.type]]]("route", Some(None)),
          cursor.decodeAs[Option[Timing[Completed.type]]]("timing", Some(None)),
          cursor.decodeAs[Option[CodeableConcept[Completed.type]]]("method", Some(None)),
          cursor.decodeAs[Option[Int]]("sequence", Some(None)),
<<<<<<< HEAD
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeOptRef[UnionBooleanOrCodeableConcept]("asNeeded"),
          cursor.decodeAs[Option[Ratio]]("maxDosePerPeriod", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
=======
          cursor.decodeAs[LitSeq[Extension[Completed.type]]]("extension", Some(LitSeq.empty)),
          cursor.decodeOptRef[Union_1768247138[Completed.type]]("asNeeded"),
          cursor.decodeAs[Option[Ratio[Completed.type]]]("maxDosePerPeriod", Some(None)),
          cursor.decodeAs[LitSeq[Extension[Completed.type]]]("modifierExtension", Some(LitSeq.empty)),
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
          cursor.decodeAs[Option[String]]("patientInstruction", Some(None)),
          cursor.decodeAs[Option[Quantity[Completed.type]]]("maxDosePerLifetime", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept[Completed.type]]]("additionalInstruction", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Dosage.DoseAndRate[Completed.type]]]("doseAndRate", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Quantity[Completed.type]]]("maxDosePerAdministration", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for Dosage Type: Indicates how the medication is/was taken or should be taken by the patient.
  *
  * Subclass of [[core.model.BackboneElement]] (Base StructureDefinition for BackboneElement Type: Base definition for all
  * elements that are defined inside a resource - but not those in a data type.)
  *
  * @constructor
  *   Introduces the fields text, site, route, timing, method, sequence, asNeeded, maxDosePerPeriod, patientInstruction,
  *   maxDosePerLifetime, additionalInstruction, doseAndRate, maxDosePerAdministration.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *   spaces.
  * @param text
  *   - Free text dosage instructions e.g. SIG.
  * @param site
  *   - Body site to administer to.
  * @param route
  *   - How drug should enter body.
  * @param timing
  *   - When medication should be administered.
  * @param method
  *   - Technique for administering medication.
  * @param sequence
  *   - Indicates the order in which the dosage instructions should be applied or interpreted.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the element. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param asNeeded
  *   - Indicates whether the Medication is only taken when needed within a specific dosing schedule (Boolean option), or it
  *   indicates the precondition for taking the Medication (CodeableConcept).
  * @param maxDosePerPeriod
  *   - Upper limit on medication per unit of time.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the element and that modifies
  *   the understanding of the element in which it is contained and/or the understanding of the containing element's descendants.
  *   Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *   strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param patientInstruction
  *   - Instructions in terms that are understood by the patient or consumer.
  * @param maxDosePerLifetime
  *   - Upper limit on medication per lifetime of the patient.
  * @param additionalInstruction
  *   - Supplemental instructions to the patient on how to take the medication (e.g. "with meals" or"take half to one hour before
  *   food") or warnings for the patient about the medication (e.g. "may cause drowsiness" or "avoid exposure of skin to direct
  *   sunlight or sunlamps").
  * @param doseAndRate
  *   - The amount of medication administered.
  * @param maxDosePerAdministration
  *   - Upper limit on medication per administration.
  */
@POJOBoilerplate
class Dosage[Stage <: LifecycleStage: ValueOf](
    override val id: Option[String] = None,
    val text: Option[String] = None,
    val site: Option[CodeableConcept[Stage]] = None,
    val route: Option[CodeableConcept[Stage]] = None,
    val timing: Option[Timing[Stage]] = None,
    val method: Option[CodeableConcept[Stage]] = None,
    val sequence: Option[Int] = None,
    override val extension: LitSeq[Extension[Stage]] = LitSeq.empty,
    val asNeeded: Option[Dosage.AsNeededChoice[Stage]] = None,
    val maxDosePerPeriod: Option[Ratio[Stage]] = None,
    override val modifierExtension: LitSeq[Extension[Stage]] = LitSeq.empty,
    val patientInstruction: Option[String] = None,
    val maxDosePerLifetime: Option[Quantity[Stage]] = None,
    val additionalInstruction: LitSeq[CodeableConcept[Stage]] = LitSeq.empty,
    val doseAndRate: LitSeq[Dosage.DoseAndRate[Stage]] = LitSeq.empty,
    val maxDosePerAdministration: Option[Quantity[Stage]] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends BackboneElement(
      id = id,
      extension = extension,
      modifierExtension = modifierExtension,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Dosage"
}
