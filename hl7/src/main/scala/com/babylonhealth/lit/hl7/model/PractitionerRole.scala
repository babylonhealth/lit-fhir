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

object PractitionerRole extends CompanionFor[PractitionerRole] {
  implicit def summonObjectAndCompanionPractitionerRole_227338075(
      o: PractitionerRole): ObjectAndCompanion[PractitionerRole, PractitionerRole.type] = ObjectAndCompanion(o, this)
  override type ResourceType = PractitionerRole
  override type ParentType   = PractitionerRole
  override val baseType: CompanionFor[ResourceType] = PractitionerRole
  override val parentType: CompanionFor[ParentType] = PractitionerRole
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/PractitionerRole")
  object AvailableTime extends CompanionFor[AvailableTime] {
    implicit def summonObjectAndCompanionAvailableTime_1242116704(
        o: AvailableTime): ObjectAndCompanion[AvailableTime, AvailableTime.type] = ObjectAndCompanion(o, this)
    override type ResourceType = AvailableTime
    override type ParentType   = AvailableTime
    override val parentType: CompanionFor[ResourceType] = AvailableTime
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
    implicit def summonObjectAndCompanionNotAvailable_1242116704(
        o: NotAvailable): ObjectAndCompanion[NotAvailable, NotAvailable.type] = ObjectAndCompanion(o, this)
    override type ResourceType = NotAvailable
    override type ParentType   = NotAvailable
    override val parentType: CompanionFor[ResourceType] = NotAvailable
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
    def unapply(o: NotAvailable): Option[(Option[String], Option[Period], LitSeq[Extension], String, LitSeq[Extension])] = Some(
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
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, during, extension, description, modifierExtension)
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
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      code: LitSeq[CodeableConcept] = LitSeq.empty,
      active: Option[Boolean] = None,
      period: Option[Period] = None,
      telecom: LitSeq[ContactPoint] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      location: LitSeq[Reference] = LitSeq.empty,
      endpoint: LitSeq[Reference] = LitSeq.empty,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      specialty: LitSeq[CodeableConcept] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      practitioner: Option[Reference] = None,
      organization: Option[Reference] = None,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      healthcareService: LitSeq[Reference] = LitSeq.empty,
      availabilityExceptions: Option[String] = None,
      notAvailable: LitSeq[PractitionerRole.NotAvailable] = LitSeq.empty,
      availableTime: LitSeq[PractitionerRole.AvailableTime] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): PractitionerRole = new PractitionerRole(
    id,
    meta,
    text,
    code,
    active,
    period,
    telecom,
    language,
    location,
    endpoint,
    contained,
    extension,
    specialty,
    identifier,
    practitioner,
    organization,
    implicitRules,
    modifierExtension,
    healthcareService,
    availabilityExceptions,
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
  val code: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("code", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val active: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("active", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val period: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("period", lTagOf[Option[Period]], false, lTagOf[Period])
  val telecom: FHIRComponentFieldMeta[LitSeq[ContactPoint]] =
    FHIRComponentFieldMeta("telecom", lTagOf[LitSeq[ContactPoint]], false, lTagOf[ContactPoint])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
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
  val practitioner: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("practitioner", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val organization: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("organization", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val healthcareService: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("healthcareService", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val availabilityExceptions: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("availabilityExceptions", lTagOf[Option[String]], false, lTagOf[String])
  val notAvailable: FHIRComponentFieldMeta[LitSeq[PractitionerRole.NotAvailable]] =
    FHIRComponentFieldMeta(
      "notAvailable",
      lTagOf[LitSeq[PractitionerRole.NotAvailable]],
      false,
      lTagOf[PractitionerRole.NotAvailable])
  val availableTime: FHIRComponentFieldMeta[LitSeq[PractitionerRole.AvailableTime]] =
    FHIRComponentFieldMeta(
      "availableTime",
      lTagOf[LitSeq[PractitionerRole.AvailableTime]],
      false,
      lTagOf[PractitionerRole.AvailableTime])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    code,
    active,
    period,
    telecom,
    language,
    location,
    endpoint,
    contained,
    extension,
    specialty,
    identifier,
    practitioner,
    organization,
    implicitRules,
    modifierExtension,
    healthcareService,
    availabilityExceptions,
    notAvailable,
    availableTime
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: PractitionerRole): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[LitSeq[CodeableConcept]](code, t.code),
    FHIRComponentField[Option[Boolean]](active, t.active),
    FHIRComponentField[Option[Period]](period, t.period),
    FHIRComponentField[LitSeq[ContactPoint]](telecom, t.telecom),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Reference]](location, t.location),
    FHIRComponentField[LitSeq[Reference]](endpoint, t.endpoint),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[CodeableConcept]](specialty, t.specialty),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[Reference]](practitioner, t.practitioner),
    FHIRComponentField[Option[Reference]](organization, t.organization),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[Reference]](healthcareService, t.healthcareService),
    FHIRComponentField[Option[String]](availabilityExceptions, t.availabilityExceptions),
    FHIRComponentField[LitSeq[PractitionerRole.NotAvailable]](notAvailable, t.notAvailable),
    FHIRComponentField[LitSeq[PractitionerRole.AvailableTime]](availableTime, t.availableTime)
  )
  def extractId(t: PractitionerRole): Option[String]                                    = t.id
  def extractMeta(t: PractitionerRole): Option[Meta]                                    = t.meta
  def extractText(t: PractitionerRole): Option[Narrative]                               = t.text
  def extractCode(t: PractitionerRole): LitSeq[CodeableConcept]                         = t.code
  def extractActive(t: PractitionerRole): Option[Boolean]                               = t.active
  def extractPeriod(t: PractitionerRole): Option[Period]                                = t.period
  def extractTelecom(t: PractitionerRole): LitSeq[ContactPoint]                         = t.telecom
  def extractLanguage(t: PractitionerRole): Option[LANGUAGES]                           = t.language
  def extractLocation(t: PractitionerRole): LitSeq[Reference]                           = t.location
  def extractEndpoint(t: PractitionerRole): LitSeq[Reference]                           = t.endpoint
  def extractContained(t: PractitionerRole): LitSeq[Resource]                           = t.contained
  def extractExtension(t: PractitionerRole): LitSeq[Extension]                          = t.extension
  def extractSpecialty(t: PractitionerRole): LitSeq[CodeableConcept]                    = t.specialty
  def extractIdentifier(t: PractitionerRole): LitSeq[Identifier]                        = t.identifier
  def extractPractitioner(t: PractitionerRole): Option[Reference]                       = t.practitioner
  def extractOrganization(t: PractitionerRole): Option[Reference]                       = t.organization
  def extractImplicitRules(t: PractitionerRole): Option[UriStr]                         = t.implicitRules
  def extractModifierExtension(t: PractitionerRole): LitSeq[Extension]                  = t.modifierExtension
  def extractHealthcareService(t: PractitionerRole): LitSeq[Reference]                  = t.healthcareService
  def extractAvailabilityExceptions(t: PractitionerRole): Option[String]                = t.availabilityExceptions
  def extractNotAvailable(t: PractitionerRole): LitSeq[PractitionerRole.NotAvailable]   = t.notAvailable
  def extractAvailableTime(t: PractitionerRole): LitSeq[PractitionerRole.AvailableTime] = t.availableTime
  override val thisName: String                                                         = "PractitionerRole"
  override val searchParams: Map[String, PractitionerRole => Seq[Any]] = Map(
    "location"     -> (obj => obj.location.toSeq),
    "specialty"    -> (obj => obj.specialty.toSeq),
    "service"      -> (obj => obj.healthcareService.toSeq),
    "date"         -> (obj => obj.period.toSeq),
    "practitioner" -> (obj => obj.practitioner.toSeq),
    "organization" -> (obj => obj.organization.toSeq),
    "email"        -> (obj => obj.telecom.filter(_.system.map(_.name) contains "email").toSeq),
    "identifier"   -> (obj => obj.identifier.toSeq),
    "role"         -> (obj => obj.code.toSeq),
    "endpoint"     -> (obj => obj.endpoint.toSeq),
    "telecom"      -> (obj => obj.telecom.toSeq),
    "phone"        -> (obj => obj.telecom.filter(_.system.map(_.name) contains "phone").toSeq),
    "active"       -> (obj => obj.active.toSeq)
  )
  def unapply(
      o: PractitionerRole): Option[(Option[String], Option[Meta], Option[Narrative], LitSeq[CodeableConcept], Option[Boolean], Option[Period], LitSeq[ContactPoint], Option[LANGUAGES], LitSeq[Reference], LitSeq[Reference], LitSeq[Resource], LitSeq[Extension], LitSeq[CodeableConcept], LitSeq[Identifier], Option[Reference], Option[Reference], Option[UriStr], LitSeq[Extension], LitSeq[Reference], Option[String], LitSeq[PractitionerRole.NotAvailable], LitSeq[PractitionerRole.AvailableTime])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.code,
        o.active,
        o.period,
        o.telecom,
        o.language,
        o.location,
        o.endpoint,
        o.contained,
        o.extension,
        o.specialty,
        o.identifier,
        o.practitioner,
        o.organization,
        o.implicitRules,
        o.modifierExtension,
        o.healthcareService,
        o.availabilityExceptions,
        o.notAvailable,
        o.availableTime))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[PractitionerRole] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new PractitionerRole(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("code", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Boolean]]("active", Some(None)),
          cursor.decodeAs[Option[Period]]("period", Some(None)),
          cursor.decodeAs[LitSeq[ContactPoint]]("telecom", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("location", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("endpoint", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("specialty", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("practitioner", Some(None)),
          cursor.decodeAs[Option[Reference]]("organization", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("healthcareService", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("availabilityExceptions", Some(None)),
          cursor.decodeAs[LitSeq[PractitionerRole.NotAvailable]]("notAvailable", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[PractitionerRole.AvailableTime]]("availableTime", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** A specific set of Roles/Locations/specialties/services that a practitioner may perform at an organization for a period of
  * time.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields code, active, period, telecom, location, endpoint, specialty, identifier, practitioner, organization,
  *   healthcareService, availabilityExceptions, notAvailable, availableTime.
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
  *   - Roles which this practitioner is authorized to perform for the organization.
  * @param active
  *   - Whether this practitioner role record is in active use.
  * @param period
  *   - The period during which the person is authorized to act as a practitioner in these role(s) for the organization.
  * @param telecom
  *   - Contact details that are specific to the role/location/service.
  * @param language
  *   - The base language in which the resource is written.
  * @param location
  *   - The location(s) at which this practitioner provides care.
  * @param endpoint
  *   - Technical endpoints providing access to services operated for the practitioner with this role.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param specialty
  *   - Specific specialty of the practitioner.
  * @param identifier
  *   - Business Identifiers that are specific to a role/location.
  * @param practitioner
  *   - Practitioner that is able to provide the defined services for the organization.
  * @param organization
  *   - The organization where the Practitioner performs the roles associated.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *   the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually
  *   modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict
  *   set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param healthcareService
  *   - The list of healthcare services that this worker provides for this role's Organization/Location(s).
  * @param availabilityExceptions
  *   - A description of site availability exceptions, e.g. public holiday availability. Succinctly describing all possible
  *   exceptions to normal site availability as details in the available Times and not available Times.
  * @param notAvailable
  *   - The practitioner is not available or performing this role during this period of time due to the provided reason.
  * @param availableTime
  *   - A collection of times the practitioner is available or performing this role at the location and/or healthcareservice.
  */
@POJOBoilerplate
class PractitionerRole(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val code: LitSeq[CodeableConcept] = LitSeq.empty,
    val active: Option[Boolean] = None,
    val period: Option[Period] = None,
    val telecom: LitSeq[ContactPoint] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    val location: LitSeq[Reference] = LitSeq.empty,
    val endpoint: LitSeq[Reference] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val specialty: LitSeq[CodeableConcept] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val practitioner: Option[Reference] = None,
    val organization: Option[Reference] = None,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val healthcareService: LitSeq[Reference] = LitSeq.empty,
    val availabilityExceptions: Option[String] = None,
    val notAvailable: LitSeq[PractitionerRole.NotAvailable] = LitSeq.empty,
    val availableTime: LitSeq[PractitionerRole.AvailableTime] = LitSeq.empty,
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
  override val thisTypeName: String = "PractitionerRole"
}
