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
import com.babylonhealth.lit.core.{ LANGUAGES, DAYS_OF_WEEK }
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object HealthcareService extends CompanionFor[HealthcareService] {
  override type ResourceType = HealthcareService
  override val baseType: CompanionFor[ResourceType] = HealthcareService
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/HealthcareService")
  object AvailableTime extends CompanionFor[AvailableTime] {
    override type ResourceType = AvailableTime
    def apply(
        id: Option[String] = None,
        allDay: Option[Boolean] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        daysOfWeek: LitSeq[DAYS_OF_WEEK] = LitSeq.empty,
        availableEndTime: Option[LocalTime] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        availableStartTime: Option[LocalTime] = None,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): AvailableTime = new AvailableTime(
      id,
      allDay,
      extension,
      daysOfWeek,
      availableEndTime,
      modifierExtension,
      availableStartTime,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: AvailableTime): Option[(Option[String], Option[Boolean], LitSeq[Extension], LitSeq[DAYS_OF_WEEK], Option[LocalTime], LitSeq[Extension], Option[LocalTime])] =
      Some((o.id, o.allDay, o.extension, o.daysOfWeek, o.availableEndTime, o.modifierExtension, o.availableStartTime))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val allDay: FHIRComponentFieldMeta[Option[Boolean]] =
      FHIRComponentFieldMeta("allDay", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val daysOfWeek: FHIRComponentFieldMeta[LitSeq[DAYS_OF_WEEK]] =
      FHIRComponentFieldMeta("daysOfWeek", lTagOf[LitSeq[DAYS_OF_WEEK]], false, lTagOf[DAYS_OF_WEEK])
    val availableEndTime: FHIRComponentFieldMeta[Option[LocalTime]] =
      FHIRComponentFieldMeta("availableEndTime", lTagOf[Option[LocalTime]], false, lTagOf[LocalTime])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val availableStartTime: FHIRComponentFieldMeta[Option[LocalTime]] =
      FHIRComponentFieldMeta("availableStartTime", lTagOf[Option[LocalTime]], false, lTagOf[LocalTime])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, allDay, extension, daysOfWeek, availableEndTime, modifierExtension, availableStartTime)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: AvailableTime): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Boolean]](allDay, t.allDay),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[DAYS_OF_WEEK]](daysOfWeek, t.daysOfWeek),
      FHIRComponentField[Option[LocalTime]](availableEndTime, t.availableEndTime),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[LocalTime]](availableStartTime, t.availableStartTime)
    )
    val baseType: CompanionFor[AvailableTime] = this
    val thisName: String                      = "AvailableTime"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[AvailableTime] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new AvailableTime(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[Boolean]]("allDay", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[DAYS_OF_WEEK]]("daysOfWeek", Some(LitSeq.empty)),
            cursor.decodeAs[Option[LocalTime]]("availableEndTime", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[LocalTime]]("availableStartTime", Some(None)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class AvailableTime(
      override val id: Option[String] = None,
      val allDay: Option[Boolean] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val daysOfWeek: LitSeq[DAYS_OF_WEEK] = LitSeq.empty,
      val availableEndTime: Option[LocalTime] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val availableStartTime: Option[LocalTime] = None,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object NotAvailable extends CompanionFor[NotAvailable] {
    override type ResourceType = NotAvailable
    def apply(
        id: Option[String] = None,
        during: Option[Period] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        description: String,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): NotAvailable = new NotAvailable(
      id,
      during,
      extension,
      description,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: NotAvailable): Option[(Option[String], Option[Period], LitSeq[Extension], String, LitSeq[Extension])] = Some(
      (o.id, o.during, o.extension, o.description, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val during: FHIRComponentFieldMeta[Option[Period]] =
      FHIRComponentFieldMeta("during", lTagOf[Option[Period]], false, lTagOf[Period])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val description: FHIRComponentFieldMeta[String] =
      FHIRComponentFieldMeta("description", lTagOf[String], false, lTagOf[String])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, during, extension, description, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: NotAvailable): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Period]](during, t.during),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[String](description, t.description),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[NotAvailable] = this
    val thisName: String                     = "NotAvailable"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[NotAvailable] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new NotAvailable(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[Period]]("during", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[String]("description", None),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class NotAvailable(
      override val id: Option[String] = None,
      val during: Option[Period] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val description: String,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Eligibility extends CompanionFor[Eligibility] {
    override type ResourceType = Eligibility
    def apply(
        id: Option[String] = None,
        code: Option[CodeableConcept] = None,
        comment: Option[Markdown] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Eligibility = new Eligibility(
      id,
      code,
      comment,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Eligibility): Option[(Option[String], Option[CodeableConcept], Option[Markdown], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.code, o.comment, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val code: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("code", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val comment: FHIRComponentFieldMeta[Option[Markdown]] =
      FHIRComponentFieldMeta("comment", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, code, comment, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Eligibility): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](code, t.code),
      FHIRComponentField[Option[Markdown]](comment, t.comment),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Eligibility] = this
    val thisName: String                    = "Eligibility"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Eligibility] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Eligibility(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("code", Some(None)),
            cursor.decodeAs[Option[Markdown]]("comment", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Eligibility(
      override val id: Option[String] = None,
      val code: Option[CodeableConcept] = None,
      val comment: Option[Markdown] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      `type`: LitSeq[CodeableConcept] = LitSeq.empty,
      name: Option[String] = None,
      photo: Option[Attachment] = None,
      active: Option[Boolean] = None,
      comment: Option[String] = None,
      telecom: LitSeq[ContactPoint] = LitSeq.empty,
      program: LitSeq[CodeableConcept] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      category: LitSeq[CodeableConcept] = LitSeq.empty,
      location: LitSeq[Reference] = LitSeq.empty,
      endpoint: LitSeq[Reference] = LitSeq.empty,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      specialty: LitSeq[CodeableConcept] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      providedBy: Option[Reference] = None,
      extraDetails: Option[Markdown] = None,
      coverageArea: LitSeq[Reference] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      communication: LitSeq[CodeableConcept] = LitSeq.empty,
      characteristic: LitSeq[CodeableConcept] = LitSeq.empty,
      referralMethod: LitSeq[CodeableConcept] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      appointmentRequired: Option[Boolean] = None,
      serviceProvisionCode: LitSeq[CodeableConcept] = LitSeq.empty,
      availabilityExceptions: Option[String] = None,
      eligibility: LitSeq[HealthcareService.Eligibility] = LitSeq.empty,
      notAvailable: LitSeq[HealthcareService.NotAvailable] = LitSeq.empty,
      availableTime: LitSeq[HealthcareService.AvailableTime] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): HealthcareService = new HealthcareService(
    id,
    meta,
    text,
    `type`,
    name,
    photo,
    active,
    comment,
    telecom,
    program,
    language,
    category,
    location,
    endpoint,
    contained,
    extension,
    specialty,
    identifier,
    providedBy,
    extraDetails,
    coverageArea,
    implicitRules,
    communication,
    characteristic,
    referralMethod,
    modifierExtension,
    appointmentRequired,
    serviceProvisionCode,
    availabilityExceptions,
    eligibility,
    notAvailable,
    availableTime,
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
  val name: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("name", lTagOf[Option[String]], false, lTagOf[String])
  val photo: FHIRComponentFieldMeta[Option[Attachment]] =
    FHIRComponentFieldMeta("photo", lTagOf[Option[Attachment]], false, lTagOf[Attachment])
  val active: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("active", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val comment: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("comment", lTagOf[Option[String]], false, lTagOf[String])
  val telecom: FHIRComponentFieldMeta[LitSeq[ContactPoint]] =
    FHIRComponentFieldMeta("telecom", lTagOf[LitSeq[ContactPoint]], false, lTagOf[ContactPoint])
  val program: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("program", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val category: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("category", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val location: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("location", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val endpoint: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("endpoint", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val specialty: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("specialty", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val providedBy: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("providedBy", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val extraDetails: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("extraDetails", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val coverageArea: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("coverageArea", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val communication: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("communication", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val characteristic: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("characteristic", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val referralMethod: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("referralMethod", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val appointmentRequired: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("appointmentRequired", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val serviceProvisionCode: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("serviceProvisionCode", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val availabilityExceptions: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("availabilityExceptions", lTagOf[Option[String]], false, lTagOf[String])
  val eligibility: FHIRComponentFieldMeta[LitSeq[HealthcareService.Eligibility]] =
    FHIRComponentFieldMeta(
      "eligibility",
      lTagOf[LitSeq[HealthcareService.Eligibility]],
      false,
      lTagOf[HealthcareService.Eligibility])
  val notAvailable: FHIRComponentFieldMeta[LitSeq[HealthcareService.NotAvailable]] =
    FHIRComponentFieldMeta(
      "notAvailable",
      lTagOf[LitSeq[HealthcareService.NotAvailable]],
      false,
      lTagOf[HealthcareService.NotAvailable])
  val availableTime: FHIRComponentFieldMeta[LitSeq[HealthcareService.AvailableTime]] =
    FHIRComponentFieldMeta(
      "availableTime",
      lTagOf[LitSeq[HealthcareService.AvailableTime]],
      false,
      lTagOf[HealthcareService.AvailableTime])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    `type`,
    name,
    photo,
    active,
    comment,
    telecom,
    program,
    language,
    category,
    location,
    endpoint,
    contained,
    extension,
    specialty,
    identifier,
    providedBy,
    extraDetails,
    coverageArea,
    implicitRules,
    communication,
    characteristic,
    referralMethod,
    modifierExtension,
    appointmentRequired,
    serviceProvisionCode,
    availabilityExceptions,
    eligibility,
    notAvailable,
    availableTime
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: HealthcareService): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[LitSeq[CodeableConcept]](`type`, t.`type`),
    FHIRComponentField[Option[String]](name, t.name),
    FHIRComponentField[Option[Attachment]](photo, t.photo),
    FHIRComponentField[Option[Boolean]](active, t.active),
    FHIRComponentField[Option[String]](comment, t.comment),
    FHIRComponentField[LitSeq[ContactPoint]](telecom, t.telecom),
    FHIRComponentField[LitSeq[CodeableConcept]](program, t.program),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[CodeableConcept]](category, t.category),
    FHIRComponentField[LitSeq[Reference]](location, t.location),
    FHIRComponentField[LitSeq[Reference]](endpoint, t.endpoint),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[CodeableConcept]](specialty, t.specialty),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[Reference]](providedBy, t.providedBy),
    FHIRComponentField[Option[Markdown]](extraDetails, t.extraDetails),
    FHIRComponentField[LitSeq[Reference]](coverageArea, t.coverageArea),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[CodeableConcept]](communication, t.communication),
    FHIRComponentField[LitSeq[CodeableConcept]](characteristic, t.characteristic),
    FHIRComponentField[LitSeq[CodeableConcept]](referralMethod, t.referralMethod),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Option[Boolean]](appointmentRequired, t.appointmentRequired),
    FHIRComponentField[LitSeq[CodeableConcept]](serviceProvisionCode, t.serviceProvisionCode),
    FHIRComponentField[Option[String]](availabilityExceptions, t.availabilityExceptions),
    FHIRComponentField[LitSeq[HealthcareService.Eligibility]](eligibility, t.eligibility),
    FHIRComponentField[LitSeq[HealthcareService.NotAvailable]](notAvailable, t.notAvailable),
    FHIRComponentField[LitSeq[HealthcareService.AvailableTime]](availableTime, t.availableTime)
  )
  def extractId(t: HealthcareService): Option[String]                                     = t.id
  def extractMeta(t: HealthcareService): Option[Meta]                                     = t.meta
  def extractText(t: HealthcareService): Option[Narrative]                                = t.text
  def extractType(t: HealthcareService): LitSeq[CodeableConcept]                          = t.`type`
  def extractName(t: HealthcareService): Option[String]                                   = t.name
  def extractPhoto(t: HealthcareService): Option[Attachment]                              = t.photo
  def extractActive(t: HealthcareService): Option[Boolean]                                = t.active
  def extractComment(t: HealthcareService): Option[String]                                = t.comment
  def extractTelecom(t: HealthcareService): LitSeq[ContactPoint]                          = t.telecom
  def extractProgram(t: HealthcareService): LitSeq[CodeableConcept]                       = t.program
  def extractLanguage(t: HealthcareService): Option[LANGUAGES]                            = t.language
  def extractCategory(t: HealthcareService): LitSeq[CodeableConcept]                      = t.category
  def extractLocation(t: HealthcareService): LitSeq[Reference]                            = t.location
  def extractEndpoint(t: HealthcareService): LitSeq[Reference]                            = t.endpoint
  def extractContained(t: HealthcareService): LitSeq[Resource]                            = t.contained
  def extractExtension(t: HealthcareService): LitSeq[Extension]                           = t.extension
  def extractSpecialty(t: HealthcareService): LitSeq[CodeableConcept]                     = t.specialty
  def extractIdentifier(t: HealthcareService): LitSeq[Identifier]                         = t.identifier
  def extractProvidedBy(t: HealthcareService): Option[Reference]                          = t.providedBy
  def extractExtraDetails(t: HealthcareService): Option[Markdown]                         = t.extraDetails
  def extractCoverageArea(t: HealthcareService): LitSeq[Reference]                        = t.coverageArea
  def extractImplicitRules(t: HealthcareService): Option[UriStr]                          = t.implicitRules
  def extractCommunication(t: HealthcareService): LitSeq[CodeableConcept]                 = t.communication
  def extractCharacteristic(t: HealthcareService): LitSeq[CodeableConcept]                = t.characteristic
  def extractReferralMethod(t: HealthcareService): LitSeq[CodeableConcept]                = t.referralMethod
  def extractModifierExtension(t: HealthcareService): LitSeq[Extension]                   = t.modifierExtension
  def extractAppointmentRequired(t: HealthcareService): Option[Boolean]                   = t.appointmentRequired
  def extractServiceProvisionCode(t: HealthcareService): LitSeq[CodeableConcept]          = t.serviceProvisionCode
  def extractAvailabilityExceptions(t: HealthcareService): Option[String]                 = t.availabilityExceptions
  def extractEligibility(t: HealthcareService): LitSeq[HealthcareService.Eligibility]     = t.eligibility
  def extractNotAvailable(t: HealthcareService): LitSeq[HealthcareService.NotAvailable]   = t.notAvailable
  def extractAvailableTime(t: HealthcareService): LitSeq[HealthcareService.AvailableTime] = t.availableTime
  override val thisName: String                                                           = "HealthcareService"
  override val searchParams: Map[String, HealthcareService => Seq[Any]] = Map(
    "organization"     -> (obj => obj.providedBy.toSeq),
    "program"          -> (obj => obj.program.toSeq),
    "name"             -> (obj => obj.name.toSeq),
    "location"         -> (obj => obj.location.toSeq),
    "identifier"       -> (obj => obj.identifier.toSeq),
    "service-type"     -> (obj => obj.`type`.toSeq),
    "specialty"        -> (obj => obj.specialty.toSeq),
    "coverage-area"    -> (obj => obj.coverageArea.toSeq),
    "characteristic"   -> (obj => obj.characteristic.toSeq),
    "active"           -> (obj => obj.active.toSeq),
    "service-category" -> (obj => obj.category.toSeq),
    "endpoint"         -> (obj => obj.endpoint.toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[HealthcareService] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new HealthcareService(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("type", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("name", Some(None)),
          cursor.decodeAs[Option[Attachment]]("photo", Some(None)),
          cursor.decodeAs[Option[Boolean]]("active", Some(None)),
          cursor.decodeAs[Option[String]]("comment", Some(None)),
          cursor.decodeAs[LitSeq[ContactPoint]]("telecom", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("program", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("category", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("location", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("endpoint", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("specialty", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("providedBy", Some(None)),
          cursor.decodeAs[Option[Markdown]]("extraDetails", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("coverageArea", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("communication", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("characteristic", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("referralMethod", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Boolean]]("appointmentRequired", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("serviceProvisionCode", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("availabilityExceptions", Some(None)),
          cursor.decodeAs[LitSeq[HealthcareService.Eligibility]]("eligibility", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[HealthcareService.NotAvailable]]("notAvailable", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[HealthcareService.AvailableTime]]("availableTime", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** The details of a healthcare service available at a location.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields `type`, name, photo, active, comment, telecom, program, category, location, endpoint, specialty, identifier, providedBy, extraDetails, coverageArea, communication, characteristic, referralMethod, appointmentRequired, serviceProvisionCode, availabilityExceptions, eligibility, notAvailable, availableTime.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param `type` - The specific type of service that may be delivered or performed.
  * @param name - Further description of the service as it would be presented to a consumer while searching.
  * @param photo - If there is a photo/symbol associated with this HealthcareService, it may be included here to facilitate quick identification of the service in a list.
  * @param active - This flag is used to mark the record to not be used. This is not used when a center is closed for maintenance, or for holidays, the notAvailable period is to be used for this.
  * @param comment - Any additional description of the service and/or any specific issues not covered by the other attributes, which can be displayed as further detail under the serviceName.
  * @param telecom - List of contacts related to this specific healthcare service.
  * @param program - Programs that this service is applicable to.
  * @param language - The base language in which the resource is written.
  * @param category - Identifies the broad category of service being performed or delivered.
  * @param location - The location(s) where this healthcare service may be provided.
  * @param endpoint - Technical endpoints providing access to services operated for the specific healthcare services defined at this resource.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param specialty - Collection of specialties handled by the service site. This is more of a medical term.
  * @param identifier - External identifiers for this item.
  * @param providedBy - The organization that provides this healthcare service.
  * @param extraDetails - Extra details about the service that can't be placed in the other fields.
  * @param coverageArea - The location(s) that this service is available to (not where the service is provided).
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param communication - Some services are specifically made available in multiple languages, this property permits a directory to declare the languages this is offered in. Typically this is only provided where a service operates in communities with mixed languages used.
  * @param characteristic - Collection of characteristics (attributes).
  * @param referralMethod - Ways that the service accepts referrals, if this is not provided then it is implied that no referral is required.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param appointmentRequired - Indicates whether or not a prospective consumer will require an appointment for a particular service at a site to be provided by the Organization. Indicates if an appointment is required for access to this service.
  * @param serviceProvisionCode - The code(s) that detail the conditions under which the healthcare service is available/offered.
  * @param availabilityExceptions - A description of site availability exceptions, e.g. public holiday availability. Succinctly describing all possible exceptions to normal site availability as details in the available Times and not available Times.
  * @param eligibility - Does this service have specific eligibility requirements that need to be met in order to use the service?
  * @param notAvailable - The HealthcareService is not available during this period of time due to the provided reason.
  * @param availableTime - A collection of times that the Service Site is available.
  */
@POJOBoilerplate
class HealthcareService(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val `type`: LitSeq[CodeableConcept] = LitSeq.empty,
    val name: Option[String] = None,
    val photo: Option[Attachment] = None,
    val active: Option[Boolean] = None,
    val comment: Option[String] = None,
    val telecom: LitSeq[ContactPoint] = LitSeq.empty,
    val program: LitSeq[CodeableConcept] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    val category: LitSeq[CodeableConcept] = LitSeq.empty,
    val location: LitSeq[Reference] = LitSeq.empty,
    val endpoint: LitSeq[Reference] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val specialty: LitSeq[CodeableConcept] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val providedBy: Option[Reference] = None,
    val extraDetails: Option[Markdown] = None,
    val coverageArea: LitSeq[Reference] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    val communication: LitSeq[CodeableConcept] = LitSeq.empty,
    val characteristic: LitSeq[CodeableConcept] = LitSeq.empty,
    val referralMethod: LitSeq[CodeableConcept] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val appointmentRequired: Option[Boolean] = None,
    val serviceProvisionCode: LitSeq[CodeableConcept] = LitSeq.empty,
    val availabilityExceptions: Option[String] = None,
    val eligibility: LitSeq[HealthcareService.Eligibility] = LitSeq.empty,
    val notAvailable: LitSeq[HealthcareService.NotAvailable] = LitSeq.empty,
    val availableTime: LitSeq[HealthcareService.AvailableTime] = LitSeq.empty,
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
  override val thisTypeName: String = "HealthcareService"
}
