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

object Dosage extends CompanionFor[Dosage] {
  override type ResourceType = Dosage
  override type ParentType   = Dosage
  override val baseType: CompanionFor[ResourceType] = Dosage
  override val parentType: CompanionFor[ParentType] = Dosage
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Dosage")
  object DoseAndRate extends CompanionFor[DoseAndRate] {
    override type ResourceType = DoseAndRate
    override type ParentType   = DoseAndRate
    override val parentType: CompanionFor[ResourceType] = DoseAndRate
    type DoseChoice = Choice[Union01639511888]
    type RateChoice = Choice[Union_0575082635]
    def apply(
        id: Option[String] = None,
        `type`: Option[CodeableConcept] = None,
        dose: Option[DoseAndRate.DoseChoice] = None,
        rate: Option[DoseAndRate.RateChoice] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): DoseAndRate = new DoseAndRate(
      id,
      `type`,
      dose,
      rate,
      extension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: DoseAndRate): Option[(Option[String], Option[CodeableConcept], Option[DoseAndRate.DoseChoice], Option[DoseAndRate.RateChoice], LitSeq[Extension])] =
      Some((o.id, o.`type`, o.dose, o.rate, o.extension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val dose: FHIRComponentFieldMeta[Option[DoseAndRate.DoseChoice]] =
      FHIRComponentFieldMeta("dose", lTagOf[Option[DoseAndRate.DoseChoice]], true, lTagOf[Union01639511888])
    val rate: FHIRComponentFieldMeta[Option[DoseAndRate.RateChoice]] =
      FHIRComponentFieldMeta("rate", lTagOf[Option[DoseAndRate.RateChoice]], true, lTagOf[Union_0575082635])
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
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new DoseAndRate(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
            cursor.decodeOptRef[Union01639511888]("dose"),
            cursor.decodeOptRef[Union_0575082635]("rate"),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class DoseAndRate(
      override val id: Option[String] = None,
      val `type`: Option[CodeableConcept] = None,
      val dose: Option[DoseAndRate.DoseChoice] = None,
      val rate: Option[DoseAndRate.RateChoice] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends Element(id = id, extension = extension)
  type AsNeededChoice = Choice[Union_1768247138]
  def apply(
      id: Option[String] = None,
      text: Option[String] = None,
      site: Option[CodeableConcept] = None,
      route: Option[CodeableConcept] = None,
      timing: Option[Timing] = None,
      method: Option[CodeableConcept] = None,
      sequence: Option[Int] = None,
      extension: LitSeq[Extension] = LitSeq.empty,
      asNeeded: Option[Dosage.AsNeededChoice] = None,
      maxDosePerPeriod: Option[Ratio] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      patientInstruction: Option[String] = None,
      maxDosePerLifetime: Option[Quantity] = None,
      additionalInstruction: LitSeq[CodeableConcept] = LitSeq.empty,
      doseAndRate: LitSeq[Dosage.DoseAndRate] = LitSeq.empty,
      maxDosePerAdministration: Option[Quantity] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Dosage = new Dosage(
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
  val site: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("site", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val route: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("route", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val timing: FHIRComponentFieldMeta[Option[Timing]] =
    FHIRComponentFieldMeta("timing", lTagOf[Option[Timing]], false, lTagOf[Timing])
  val method: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("method", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val sequence: FHIRComponentFieldMeta[Option[Int]] =
    FHIRComponentFieldMeta("sequence", lTagOf[Option[Int]], false, lTagOf[Int])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val asNeeded: FHIRComponentFieldMeta[Option[Dosage.AsNeededChoice]] =
    FHIRComponentFieldMeta("asNeeded", lTagOf[Option[Dosage.AsNeededChoice]], true, lTagOf[Union_1768247138])
  val maxDosePerPeriod: FHIRComponentFieldMeta[Option[Ratio]] =
    FHIRComponentFieldMeta("maxDosePerPeriod", lTagOf[Option[Ratio]], false, lTagOf[Ratio])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val patientInstruction: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("patientInstruction", lTagOf[Option[String]], false, lTagOf[String])
  val maxDosePerLifetime: FHIRComponentFieldMeta[Option[Quantity]] =
    FHIRComponentFieldMeta("maxDosePerLifetime", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
  val additionalInstruction: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("additionalInstruction", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val doseAndRate: FHIRComponentFieldMeta[LitSeq[Dosage.DoseAndRate]] =
    FHIRComponentFieldMeta("doseAndRate", lTagOf[LitSeq[Dosage.DoseAndRate]], false, lTagOf[Dosage.DoseAndRate])
  val maxDosePerAdministration: FHIRComponentFieldMeta[Option[Quantity]] =
    FHIRComponentFieldMeta("maxDosePerAdministration", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
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
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Dosage): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[String]](text, t.text),
    FHIRComponentField[Option[CodeableConcept]](site, t.site),
    FHIRComponentField[Option[CodeableConcept]](route, t.route),
    FHIRComponentField[Option[Timing]](timing, t.timing),
    FHIRComponentField[Option[CodeableConcept]](method, t.method),
    FHIRComponentField[Option[Int]](sequence, t.sequence),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Dosage.AsNeededChoice]](asNeeded, t.asNeeded),
    FHIRComponentField[Option[Ratio]](maxDosePerPeriod, t.maxDosePerPeriod),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Option[String]](patientInstruction, t.patientInstruction),
    FHIRComponentField[Option[Quantity]](maxDosePerLifetime, t.maxDosePerLifetime),
    FHIRComponentField[LitSeq[CodeableConcept]](additionalInstruction, t.additionalInstruction),
    FHIRComponentField[LitSeq[Dosage.DoseAndRate]](doseAndRate, t.doseAndRate),
    FHIRComponentField[Option[Quantity]](maxDosePerAdministration, t.maxDosePerAdministration)
  )
  def extractId(t: Dosage): Option[String]                             = t.id
  def extractText(t: Dosage): Option[String]                           = t.text
  def extractSite(t: Dosage): Option[CodeableConcept]                  = t.site
  def extractRoute(t: Dosage): Option[CodeableConcept]                 = t.route
  def extractTiming(t: Dosage): Option[Timing]                         = t.timing
  def extractMethod(t: Dosage): Option[CodeableConcept]                = t.method
  def extractSequence(t: Dosage): Option[Int]                          = t.sequence
  def extractExtension(t: Dosage): LitSeq[Extension]                   = t.extension
  def extractAsNeeded(t: Dosage): Option[Dosage.AsNeededChoice]        = t.asNeeded
  def extractMaxDosePerPeriod(t: Dosage): Option[Ratio]                = t.maxDosePerPeriod
  def extractModifierExtension(t: Dosage): LitSeq[Extension]           = t.modifierExtension
  def extractPatientInstruction(t: Dosage): Option[String]             = t.patientInstruction
  def extractMaxDosePerLifetime(t: Dosage): Option[Quantity]           = t.maxDosePerLifetime
  def extractAdditionalInstruction(t: Dosage): LitSeq[CodeableConcept] = t.additionalInstruction
  def extractDoseAndRate(t: Dosage): LitSeq[Dosage.DoseAndRate]        = t.doseAndRate
  def extractMaxDosePerAdministration(t: Dosage): Option[Quantity]     = t.maxDosePerAdministration
  override val thisName: String                                        = "Dosage"
  def unapply(
      o: Dosage): Option[(Option[String], Option[String], Option[CodeableConcept], Option[CodeableConcept], Option[Timing], Option[CodeableConcept], Option[Int], LitSeq[Extension], Option[Dosage.AsNeededChoice], Option[Ratio], LitSeq[Extension], Option[String], Option[Quantity], LitSeq[CodeableConcept], LitSeq[Dosage.DoseAndRate], Option[Quantity])] =
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
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Dosage] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Dosage(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[String]]("text", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("site", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("route", Some(None)),
          cursor.decodeAs[Option[Timing]]("timing", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("method", Some(None)),
          cursor.decodeAs[Option[Int]]("sequence", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeOptRef[Union_1768247138]("asNeeded"),
          cursor.decodeAs[Option[Ratio]]("maxDosePerPeriod", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("patientInstruction", Some(None)),
          cursor.decodeAs[Option[Quantity]]("maxDosePerLifetime", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("additionalInstruction", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Dosage.DoseAndRate]]("doseAndRate", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Quantity]]("maxDosePerAdministration", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for Dosage Type: Indicates how the medication is/was taken or should be taken by the patient.
  *
  *  Subclass of [[core.model.BackboneElement]] (Base StructureDefinition for BackboneElement Type: Base definition for all elements that are defined inside a resource - but not those in a data type.)
  *
  * @constructor Introduces the fields text, site, route, timing, method, sequence, asNeeded, maxDosePerPeriod, patientInstruction, maxDosePerLifetime, additionalInstruction, doseAndRate, maxDosePerAdministration.
  * @param id - Unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces.
  * @param text - Free text dosage instructions e.g. SIG.
  * @param site - Body site to administer to.
  * @param route - How drug should enter body.
  * @param timing - When medication should be administered.
  * @param method - Technique for administering medication.
  * @param sequence - Indicates the order in which the dosage instructions should be applied or interpreted.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the element. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param asNeeded - Indicates whether the Medication is only taken when needed within a specific dosing schedule (Boolean option), or it indicates the precondition for taking the Medication (CodeableConcept).
  * @param maxDosePerPeriod - Upper limit on medication per unit of time.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the element and that modifies the understanding of the element in which it is contained and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param patientInstruction - Instructions in terms that are understood by the patient or consumer.
  * @param maxDosePerLifetime - Upper limit on medication per lifetime of the patient.
  * @param additionalInstruction - Supplemental instructions to the patient on how to take the medication  (e.g. "with meals" or"take half to one hour before food") or warnings for the patient about the medication (e.g. "may cause drowsiness" or "avoid exposure of skin to direct sunlight or sunlamps").
  * @param doseAndRate - The amount of medication administered.
  * @param maxDosePerAdministration - Upper limit on medication per administration.
  */
@POJOBoilerplate
class Dosage(
    override val id: Option[String] = None,
    val text: Option[String] = None,
    val site: Option[CodeableConcept] = None,
    val route: Option[CodeableConcept] = None,
    val timing: Option[Timing] = None,
    val method: Option[CodeableConcept] = None,
    val sequence: Option[Int] = None,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val asNeeded: Option[Dosage.AsNeededChoice] = None,
    val maxDosePerPeriod: Option[Ratio] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val patientInstruction: Option[String] = None,
    val maxDosePerLifetime: Option[Quantity] = None,
    val additionalInstruction: LitSeq[CodeableConcept] = LitSeq.empty,
    val doseAndRate: LitSeq[Dosage.DoseAndRate] = LitSeq.empty,
    val maxDosePerAdministration: Option[Quantity] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends BackboneElement(
      id = id,
      extension = extension,
      modifierExtension = modifierExtension,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Dosage"
}
