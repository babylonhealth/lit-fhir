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
import com.babylonhealth.lit.hl7.{ VISION_EYE_CODES, VISION_BASE_CODES, FM_STATUS }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object VisionPrescription extends CompanionFor[VisionPrescription] {
  implicit def summonObjectAndCompanionVisionPrescription_20967432(
      o: VisionPrescription): ObjectAndCompanion[VisionPrescription, VisionPrescription.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = VisionPrescription
  override type ParentType   = VisionPrescription
  override val baseType: CompanionFor[ResourceType] = VisionPrescription
  override val parentType: CompanionFor[ParentType] = VisionPrescription
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/VisionPrescription")
  object LensSpecification extends CompanionFor[LensSpecification] {
    implicit def summonObjectAndCompanionLensSpecification_1359361219(
        o: LensSpecification): ObjectAndCompanion[LensSpecification, LensSpecification.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = LensSpecification
    override type ParentType   = LensSpecification
    override val parentType: CompanionFor[ResourceType] = LensSpecification
    object Prism extends CompanionFor[Prism] {
      implicit def summonObjectAndCompanionPrism_1825337371(o: Prism): ObjectAndCompanion[Prism, Prism.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Prism
      override type ParentType   = Prism
      override val parentType: CompanionFor[ResourceType] = Prism
      def apply(
          id: Option[String] = None,
          base: VISION_BASE_CODES,
          amount: BigDecimal,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Prism = new Prism(
        id,
        base,
        amount,
        extension,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Prism): Option[(Option[String], VISION_BASE_CODES, BigDecimal, LitSeq[Extension], LitSeq[Extension])] =
        Some((o.id, o.base, o.amount, o.extension, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val base: FHIRComponentFieldMeta[VISION_BASE_CODES] =
        FHIRComponentFieldMeta("base", lTagOf[VISION_BASE_CODES], false, lTagOf[VISION_BASE_CODES])
      val amount: FHIRComponentFieldMeta[BigDecimal] =
        FHIRComponentFieldMeta("amount", lTagOf[BigDecimal], false, lTagOf[BigDecimal])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, base, amount, extension, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Prism): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[VISION_BASE_CODES](base, t.base),
        FHIRComponentField[BigDecimal](amount, t.amount),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Prism] = this
      val thisName: String              = "Prism"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Prism] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Prism(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[VISION_BASE_CODES]("base", None),
              cursor.decodeAs[BigDecimal]("amount", None),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Prism(
        override val id: Option[String] = None,
        val base: VISION_BASE_CODES,
        val amount: BigDecimal,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        eye: VISION_EYE_CODES,
        add: Option[BigDecimal] = None,
        axis: Option[Int] = None,
        note: LitSeq[Annotation] = LitSeq.empty,
        power: Option[BigDecimal] = None,
        color: Option[String] = None,
        brand: Option[String] = None,
        sphere: Option[BigDecimal] = None,
        product: CodeableConcept,
        cylinder: Option[BigDecimal] = None,
        diameter: Option[BigDecimal] = None,
        duration: Option[Quantity] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        backCurve: Option[BigDecimal] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        prism: LitSeq[LensSpecification.Prism] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): LensSpecification = new LensSpecification(
      id,
      eye,
      add,
      axis,
      note,
      power,
      color,
      brand,
      sphere,
      product,
      cylinder,
      diameter,
      duration,
      extension,
      backCurve,
      modifierExtension,
      prism,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: LensSpecification): Option[(Option[String], VISION_EYE_CODES, Option[BigDecimal], Option[Int], LitSeq[Annotation], Option[BigDecimal], Option[String], Option[String], Option[BigDecimal], CodeableConcept, Option[BigDecimal], Option[BigDecimal], Option[Quantity], LitSeq[Extension], Option[BigDecimal], LitSeq[Extension], LitSeq[LensSpecification.Prism])] =
      Some(
        (
          o.id,
          o.eye,
          o.add,
          o.axis,
          o.note,
          o.power,
          o.color,
          o.brand,
          o.sphere,
          o.product,
          o.cylinder,
          o.diameter,
          o.duration,
          o.extension,
          o.backCurve,
          o.modifierExtension,
          o.prism))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val eye: FHIRComponentFieldMeta[VISION_EYE_CODES] =
      FHIRComponentFieldMeta("eye", lTagOf[VISION_EYE_CODES], false, lTagOf[VISION_EYE_CODES])
    val add: FHIRComponentFieldMeta[Option[BigDecimal]] =
      FHIRComponentFieldMeta("add", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
    val axis: FHIRComponentFieldMeta[Option[Int]] =
      FHIRComponentFieldMeta("axis", lTagOf[Option[Int]], false, lTagOf[Int])
    val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
      FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
    val power: FHIRComponentFieldMeta[Option[BigDecimal]] =
      FHIRComponentFieldMeta("power", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
    val color: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("color", lTagOf[Option[String]], false, lTagOf[String])
    val brand: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("brand", lTagOf[Option[String]], false, lTagOf[String])
    val sphere: FHIRComponentFieldMeta[Option[BigDecimal]] =
      FHIRComponentFieldMeta("sphere", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
    val product: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("product", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val cylinder: FHIRComponentFieldMeta[Option[BigDecimal]] =
      FHIRComponentFieldMeta("cylinder", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
    val diameter: FHIRComponentFieldMeta[Option[BigDecimal]] =
      FHIRComponentFieldMeta("diameter", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
    val duration: FHIRComponentFieldMeta[Option[Quantity]] =
      FHIRComponentFieldMeta("duration", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val backCurve: FHIRComponentFieldMeta[Option[BigDecimal]] =
      FHIRComponentFieldMeta("backCurve", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val prism: FHIRComponentFieldMeta[LitSeq[LensSpecification.Prism]] =
      FHIRComponentFieldMeta("prism", lTagOf[LitSeq[LensSpecification.Prism]], false, lTagOf[LensSpecification.Prism])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
      id,
      eye,
      add,
      axis,
      note,
      power,
      color,
      brand,
      sphere,
      product,
      cylinder,
      diameter,
      duration,
      extension,
      backCurve,
      modifierExtension,
      prism)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: LensSpecification): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[VISION_EYE_CODES](eye, t.eye),
      FHIRComponentField[Option[BigDecimal]](add, t.add),
      FHIRComponentField[Option[Int]](axis, t.axis),
      FHIRComponentField[LitSeq[Annotation]](note, t.note),
      FHIRComponentField[Option[BigDecimal]](power, t.power),
      FHIRComponentField[Option[String]](color, t.color),
      FHIRComponentField[Option[String]](brand, t.brand),
      FHIRComponentField[Option[BigDecimal]](sphere, t.sphere),
      FHIRComponentField[CodeableConcept](product, t.product),
      FHIRComponentField[Option[BigDecimal]](cylinder, t.cylinder),
      FHIRComponentField[Option[BigDecimal]](diameter, t.diameter),
      FHIRComponentField[Option[Quantity]](duration, t.duration),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[BigDecimal]](backCurve, t.backCurve),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[LensSpecification.Prism]](prism, t.prism)
    )
    val baseType: CompanionFor[LensSpecification] = this
    val thisName: String                          = "LensSpecification"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[LensSpecification] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new LensSpecification(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[VISION_EYE_CODES]("eye", None),
            cursor.decodeAs[Option[BigDecimal]]("add", Some(None)),
            cursor.decodeAs[Option[Int]]("axis", Some(None)),
            cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
            cursor.decodeAs[Option[BigDecimal]]("power", Some(None)),
            cursor.decodeAs[Option[String]]("color", Some(None)),
            cursor.decodeAs[Option[String]]("brand", Some(None)),
            cursor.decodeAs[Option[BigDecimal]]("sphere", Some(None)),
            cursor.decodeAs[CodeableConcept]("product", None),
            cursor.decodeAs[Option[BigDecimal]]("cylinder", Some(None)),
            cursor.decodeAs[Option[BigDecimal]]("diameter", Some(None)),
            cursor.decodeAs[Option[Quantity]]("duration", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[BigDecimal]]("backCurve", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[LensSpecification.Prism]]("prism", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class LensSpecification(
      override val id: Option[String] = None,
      val eye: VISION_EYE_CODES,
      val add: Option[BigDecimal] = None,
      val axis: Option[Int] = None,
      val note: LitSeq[Annotation] = LitSeq.empty,
      val power: Option[BigDecimal] = None,
      val color: Option[String] = None,
      val brand: Option[String] = None,
      val sphere: Option[BigDecimal] = None,
      val product: CodeableConcept,
      val cylinder: Option[BigDecimal] = None,
      val diameter: Option[BigDecimal] = None,
      val duration: Option[Quantity] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val backCurve: Option[BigDecimal] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val prism: LitSeq[LensSpecification.Prism] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      status: FM_STATUS,
      created: FHIRDateTime,
      patient: Reference,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      encounter: Option[Reference] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      prescriber: Reference,
      dateWritten: FHIRDateTime,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      lensSpecification: NonEmptyLitSeq[VisionPrescription.LensSpecification],
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): VisionPrescription = new VisionPrescription(
    id,
    meta,
    text,
    status,
    created,
    patient,
    language,
    contained,
    extension,
    encounter,
    identifier,
    prescriber,
    dateWritten,
    implicitRules,
    modifierExtension,
    lensSpecification,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val status: FHIRComponentFieldMeta[FM_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[FM_STATUS], false, lTagOf[FM_STATUS])
  val created: FHIRComponentFieldMeta[FHIRDateTime] =
    FHIRComponentFieldMeta("created", lTagOf[FHIRDateTime], false, lTagOf[FHIRDateTime])
  val patient: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("patient", lTagOf[Reference], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val encounter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("encounter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val prescriber: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("prescriber", lTagOf[Reference], false, lTagOf[Reference])
  val dateWritten: FHIRComponentFieldMeta[FHIRDateTime] =
    FHIRComponentFieldMeta("dateWritten", lTagOf[FHIRDateTime], false, lTagOf[FHIRDateTime])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val lensSpecification: FHIRComponentFieldMeta[NonEmptyLitSeq[VisionPrescription.LensSpecification]] =
    FHIRComponentFieldMeta(
      "lensSpecification",
      lTagOf[NonEmptyLitSeq[VisionPrescription.LensSpecification]],
      false,
      lTagOf[VisionPrescription.LensSpecification])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    status,
    created,
    patient,
    language,
    contained,
    extension,
    encounter,
    identifier,
    prescriber,
    dateWritten,
    implicitRules,
    modifierExtension,
    lensSpecification
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: VisionPrescription): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[FM_STATUS](status, t.status),
    FHIRComponentField[FHIRDateTime](created, t.created),
    FHIRComponentField[Reference](patient, t.patient),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Reference]](encounter, t.encounter),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Reference](prescriber, t.prescriber),
    FHIRComponentField[FHIRDateTime](dateWritten, t.dateWritten),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[NonEmptyLitSeq[VisionPrescription.LensSpecification]](lensSpecification, t.lensSpecification)
  )
  def extractId(t: VisionPrescription): Option[String]                   = t.id
  def extractMeta(t: VisionPrescription): Option[Meta]                   = t.meta
  def extractText(t: VisionPrescription): Option[Narrative]              = t.text
  def extractStatus(t: VisionPrescription): FM_STATUS                    = t.status
  def extractCreated(t: VisionPrescription): FHIRDateTime                = t.created
  def extractPatient(t: VisionPrescription): Reference                   = t.patient
  def extractLanguage(t: VisionPrescription): Option[LANGUAGES]          = t.language
  def extractContained(t: VisionPrescription): LitSeq[Resource]          = t.contained
  def extractExtension(t: VisionPrescription): LitSeq[Extension]         = t.extension
  def extractEncounter(t: VisionPrescription): Option[Reference]         = t.encounter
  def extractIdentifier(t: VisionPrescription): LitSeq[Identifier]       = t.identifier
  def extractPrescriber(t: VisionPrescription): Reference                = t.prescriber
  def extractDateWritten(t: VisionPrescription): FHIRDateTime            = t.dateWritten
  def extractImplicitRules(t: VisionPrescription): Option[UriStr]        = t.implicitRules
  def extractModifierExtension(t: VisionPrescription): LitSeq[Extension] = t.modifierExtension
  def extractLensSpecification(t: VisionPrescription): NonEmptyLitSeq[VisionPrescription.LensSpecification] =
    t.lensSpecification
  override val thisName: String = "VisionPrescription"
  override val searchParams: Map[String, VisionPrescription => Seq[Any]] = Map(
    "datewritten" -> (obj => Seq(obj.dateWritten)),
    "status"      -> (obj => Seq(obj.status)),
    "encounter"   -> (obj => obj.encounter.toSeq),
    "patient"     -> (obj => Seq(obj.patient)),
    "prescriber"  -> (obj => Seq(obj.prescriber)),
    "identifier"  -> (obj => obj.identifier.toSeq)
  )
  def unapply(
      o: VisionPrescription): Option[(Option[String], Option[Meta], Option[Narrative], FM_STATUS, FHIRDateTime, Reference, Option[LANGUAGES], LitSeq[Resource], LitSeq[Extension], Option[Reference], LitSeq[Identifier], Reference, FHIRDateTime, Option[UriStr], LitSeq[Extension], NonEmptyLitSeq[VisionPrescription.LensSpecification])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.status,
        o.created,
        o.patient,
        o.language,
        o.contained,
        o.extension,
        o.encounter,
        o.identifier,
        o.prescriber,
        o.dateWritten,
        o.implicitRules,
        o.modifierExtension,
        o.lensSpecification))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[VisionPrescription] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new VisionPrescription(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[FM_STATUS]("status", None),
          cursor.decodeAs[FHIRDateTime]("created", None),
          cursor.decodeAs[Reference]("patient", None),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Reference]("prescriber", None),
          cursor.decodeAs[FHIRDateTime]("dateWritten", None),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[NonEmptyLitSeq[VisionPrescription.LensSpecification]]("lensSpecification", None),
          decodeAttributes(cursor)
        )
      ))
}

/** An authorization for the provision of glasses and/or contact lenses to a patient.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields status, created, patient, encounter, identifier, prescriber, dateWritten, lensSpecification.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param status - The status of the resource instance.
  * @param created - The date this resource was created.
  * @param patient - A resource reference to the person to whom the vision prescription applies.
  * @param language - The base language in which the resource is written.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param encounter - A reference to a resource that identifies the particular occurrence of contact between patient and health care provider during which the prescription was issued.
  * @param identifier - A unique identifier assigned to this vision prescription.
  * @param prescriber - The healthcare professional responsible for authorizing the prescription.
  * @param dateWritten - The date (and perhaps time) when the prescription was written.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param lensSpecification - Contain the details of  the individual lens specifications and serves as the authorization for the fullfillment by certified professionals.
  */
@POJOBoilerplate
class VisionPrescription(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val status: FM_STATUS,
    val created: FHIRDateTime,
    val patient: Reference,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val encounter: Option[Reference] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val prescriber: Reference,
    val dateWritten: FHIRDateTime,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val lensSpecification: NonEmptyLitSeq[VisionPrescription.LensSpecification],
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
  override val thisTypeName: String = "VisionPrescription"
}
