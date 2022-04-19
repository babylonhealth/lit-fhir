package com.babylonhealth.lit.uscore.model

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
import com.babylonhealth.lit.usbase.model._
import com.babylonhealth.lit.core.UnionAliases._
import com.babylonhealth.lit.hl7.UnionAliases._
import com.babylonhealth.lit.usbase.UnionAliases._
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, usbase, uscore }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Us_core_practitionerrole extends CompanionFor[Us_core_practitionerrole] {
  implicit def summonObjectAndCompanionUs_core_practitionerrole1336897827(
      o: Us_core_practitionerrole): ObjectAndCompanion[Us_core_practitionerrole, Us_core_practitionerrole.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = PractitionerRole
  override type ParentType   = PractitionerRole
  override val baseType: CompanionFor[ResourceType] = PractitionerRole
  override val parentType: CompanionFor[ParentType] = PractitionerRole
  override val profileUrl: Option[String] = Some("http://hl7.org/fhir/us/core/StructureDefinition/us-core-practitionerrole")
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(
        new Meta(profile = LitSeq("http://hl7.org/fhir/us/core/StructureDefinition/us-core-practitionerrole"))),
      text: Option[Narrative] = None,
      code: LitSeq[CodeableConcept] = LitSeq.empty,
      active: Option[Boolean] = None,
      period: Option[Period] = None,
      language: Option[LANGUAGES] = None,
      location: LitSeq[Reference] = LitSeq.empty,
      endpoint: LitSeq[Reference] = LitSeq.empty,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      specialty: LitSeq[CodeableConcept] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      practitioner: Reference,
      organization: Reference,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      healthcareService: LitSeq[Reference] = LitSeq.empty,
      telecom: LitSeq[ContactPoint] = LitSeq.empty,
      availabilityExceptions: Option[String] = None,
      notAvailable: LitSeq[PractitionerRole.NotAvailable] = LitSeq.empty,
      availableTime: LitSeq[PractitionerRole.AvailableTime] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Us_core_practitionerrole = new Us_core_practitionerrole(
    id,
    meta,
    text,
    code,
    active,
    period,
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
    telecom,
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
  val practitioner: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("practitioner", lTagOf[Reference], false, lTagOf[Reference])
  val organization: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("organization", lTagOf[Reference], false, lTagOf[Reference])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val healthcareService: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("healthcareService", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val telecom: FHIRComponentFieldMeta[LitSeq[ContactPoint]] =
    FHIRComponentFieldMeta("telecom", lTagOf[LitSeq[ContactPoint]], false, lTagOf[ContactPoint])
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
    telecom,
    availabilityExceptions,
    notAvailable,
    availableTime
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Meta]](meta, t.meta),
      FHIRComponentField[Option[Narrative]](text, t.text),
      FHIRComponentField[LitSeq[CodeableConcept]](code, t.code),
      FHIRComponentField[Option[Boolean]](active, t.active),
      FHIRComponentField[Option[Period]](period, t.period),
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[LitSeq[Reference]](location, t.location),
      FHIRComponentField[LitSeq[Reference]](endpoint, t.endpoint),
      FHIRComponentField[LitSeq[Resource]](contained, t.contained),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[CodeableConcept]](specialty, t.specialty),
      FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
      FHIRComponentField[Reference](practitioner, t.practitioner.get),
      FHIRComponentField[Reference](organization, t.organization.get),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[Reference]](healthcareService, t.healthcareService),
      FHIRComponentField[LitSeq[ContactPoint]](telecom, t.telecom),
      FHIRComponentField[Option[String]](availabilityExceptions, t.availabilityExceptions),
      FHIRComponentField[LitSeq[PractitionerRole.NotAvailable]](notAvailable, t.notAvailable),
      FHIRComponentField[LitSeq[PractitionerRole.AvailableTime]](availableTime, t.availableTime)
    ))
  override def fields(t: Us_core_practitionerrole): Seq[FHIRComponentField[_]]                  = fieldsFromParent(t).get
  def extractId(t: Us_core_practitionerrole): Option[String]                                    = t.id
  def extractMeta(t: Us_core_practitionerrole): Option[Meta]                                    = t.meta
  def extractText(t: Us_core_practitionerrole): Option[Narrative]                               = t.text
  def extractCode(t: Us_core_practitionerrole): LitSeq[CodeableConcept]                         = t.code
  def extractActive(t: Us_core_practitionerrole): Option[Boolean]                               = t.active
  def extractPeriod(t: Us_core_practitionerrole): Option[Period]                                = t.period
  def extractLanguage(t: Us_core_practitionerrole): Option[LANGUAGES]                           = t.language
  def extractLocation(t: Us_core_practitionerrole): LitSeq[Reference]                           = t.location
  def extractEndpoint(t: Us_core_practitionerrole): LitSeq[Reference]                           = t.endpoint
  def extractContained(t: Us_core_practitionerrole): LitSeq[Resource]                           = t.contained
  def extractExtension(t: Us_core_practitionerrole): LitSeq[Extension]                          = t.extension
  def extractSpecialty(t: Us_core_practitionerrole): LitSeq[CodeableConcept]                    = t.specialty
  def extractIdentifier(t: Us_core_practitionerrole): LitSeq[Identifier]                        = t.identifier
  def extractPractitioner(t: Us_core_practitionerrole): Reference                               = t.practitioner.get
  def extractOrganization(t: Us_core_practitionerrole): Reference                               = t.organization.get
  def extractImplicitRules(t: Us_core_practitionerrole): Option[UriStr]                         = t.implicitRules
  def extractModifierExtension(t: Us_core_practitionerrole): LitSeq[Extension]                  = t.modifierExtension
  def extractHealthcareService(t: Us_core_practitionerrole): LitSeq[Reference]                  = t.healthcareService
  def extractTelecom(t: Us_core_practitionerrole): LitSeq[ContactPoint]                         = t.telecom
  def extractAvailabilityExceptions(t: Us_core_practitionerrole): Option[String]                = t.availabilityExceptions
  def extractNotAvailable(t: Us_core_practitionerrole): LitSeq[PractitionerRole.NotAvailable]   = t.notAvailable
  def extractAvailableTime(t: Us_core_practitionerrole): LitSeq[PractitionerRole.AvailableTime] = t.availableTime
  override val thisName: String                                                                 = "Us_core_practitionerrole"
  override val searchParams: Map[String, Us_core_practitionerrole => Seq[Any]]                  = PractitionerRole.searchParams
  def unapply(
      o: Us_core_practitionerrole): Option[(Option[String], Option[Meta], Option[Narrative], LitSeq[CodeableConcept], Option[Boolean], Option[Period], Option[LANGUAGES], LitSeq[Reference], LitSeq[Reference], LitSeq[Resource], LitSeq[Extension], LitSeq[CodeableConcept], LitSeq[Identifier], Reference, Reference, Option[UriStr], LitSeq[Extension], LitSeq[Reference], LitSeq[ContactPoint], Option[String], LitSeq[PractitionerRole.NotAvailable], LitSeq[PractitionerRole.AvailableTime])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.code,
        o.active,
        o.period,
        o.language,
        o.location,
        o.endpoint,
        o.contained,
        o.extension,
        o.specialty,
        o.identifier,
        o.practitioner.get,
        o.organization.get,
        o.implicitRules,
        o.modifierExtension,
        o.healthcareService,
        o.telecom,
        o.availabilityExceptions,
        o.notAvailable,
        o.availableTime))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Us_core_practitionerrole] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Us_core_practitionerrole(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("code", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Boolean]]("active", Some(None)),
          cursor.decodeAs[Option[Period]]("period", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("location", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("endpoint", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("specialty", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Reference]("practitioner", None),
          cursor.decodeAs[Reference]("organization", None),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("healthcareService", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[ContactPoint]]("telecom", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("availabilityExceptions", Some(None)),
          cursor.decodeAs[LitSeq[PractitionerRole.NotAvailable]]("notAvailable", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[PractitionerRole.AvailableTime]]("availableTime", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** The practitioner roles referenced in the US Core profiles.
  *
  * Subclass of [[hl7.model.PractitionerRole]] (A specific set of Roles/Locations/specialties/services that a practitioner may
  * perform at an organization for a period of time.)
  *
  * @constructor
  *   Inherits all params from parent. Requires the following fields which were optional in the parent: practitioner,
  *   organization.
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
  * @param code
  *   \- Roles which this practitioner is authorized to perform for the organization.
  * @param active
  *   \- Whether this practitioner role record is in active use.
  * @param period
  *   \- The period during which the person is authorized to act as a practitioner in these role(s) for the organization.
  * @param language
  *   \- The base language in which the resource is written.
  * @param location
  *   \- The location(s) at which this practitioner provides care.
  * @param endpoint
  *   \- Technical endpoints providing access to services operated for the practitioner with this role.
  * @param contained
  *   \- These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   \- May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param specialty
  *   \- Specific specialty of the practitioner.
  * @param identifier
  *   \- Business Identifiers that are specific to a role/location.
  * @param practitioner
  *   \- Practitioner that is able to provide the defined services for the organization.
  * @param organization
  *   \- The organization where the Practitioner performs the roles associated.
  * @param implicitRules
  *   \- A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param modifierExtension
  *   \- May be used to represent additional information that is not part of the basic definition of the resource and that
  *   modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *   Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *   strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *   extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *   processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any
  *   elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param healthcareService
  *   \- The list of healthcare services that this worker provides for this role's Organization/Location(s).
  * @param telecom
  *   \- Contact details that are specific to the role/location/service.
  * @param availabilityExceptions
  *   \- A description of site availability exceptions, e.g. public holiday availability. Succinctly describing all possible
  *   exceptions to normal site availability as details in the available Times and not available Times.
  * @param notAvailable
  *   \- The practitioner is not available or performing this role during this period of time due to the provided reason.
  * @param availableTime
  *   \- A collection of times the practitioner is available or performing this role at the location and/or healthcareservice.
  */
@POJOBoilerplate
class Us_core_practitionerrole(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("http://hl7.org/fhir/us/core/StructureDefinition/us-core-practitionerrole"))),
    override val text: Option[Narrative] = None,
    override val code: LitSeq[CodeableConcept] = LitSeq.empty,
    override val active: Option[Boolean] = None,
    override val period: Option[Period] = None,
    override val language: Option[LANGUAGES] = None,
    override val location: LitSeq[Reference] = LitSeq.empty,
    override val endpoint: LitSeq[Reference] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val specialty: LitSeq[CodeableConcept] = LitSeq.empty,
    override val identifier: LitSeq[Identifier] = LitSeq.empty,
    practitioner: Reference,
    organization: Reference,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val healthcareService: LitSeq[Reference] = LitSeq.empty,
    override val telecom: LitSeq[ContactPoint] = LitSeq.empty,
    override val availabilityExceptions: Option[String] = None,
    override val notAvailable: LitSeq[PractitionerRole.NotAvailable] = LitSeq.empty,
    override val availableTime: LitSeq[PractitionerRole.AvailableTime] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends PractitionerRole(
      id = id,
      meta = meta,
      text = text,
      code = code,
      active = active,
      period = period,
      telecom = telecom,
      language = language,
      location = location,
      endpoint = endpoint,
      contained = contained,
      extension = extension,
      specialty = specialty,
      identifier = identifier,
      practitioner = Some(practitioner),
      organization = Some(organization),
      implicitRules = implicitRules,
      modifierExtension = modifierExtension,
      healthcareService = healthcareService,
      availabilityExceptions = availabilityExceptions,
      notAvailable = notAvailable,
      availableTime = availableTime,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "PractitionerRole"
}
