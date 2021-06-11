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

object OrganizationAffiliation extends CompanionFor[OrganizationAffiliation] {
  override type ResourceType = OrganizationAffiliation
  override type ParentType   = OrganizationAffiliation
  override val baseType: CompanionFor[ResourceType] = OrganizationAffiliation
  override val parentType: CompanionFor[ParentType] = OrganizationAffiliation
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/OrganizationAffiliation")
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      code: LitSeq[CodeableConcept] = LitSeq.empty,
      active: Option[Boolean] = None,
      period: Option[Period] = None,
      network: LitSeq[Reference] = LitSeq.empty,
      telecom: LitSeq[ContactPoint] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      location: LitSeq[Reference] = LitSeq.empty,
      endpoint: LitSeq[Reference] = LitSeq.empty,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      specialty: LitSeq[CodeableConcept] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      organization: Option[Reference] = None,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      healthcareService: LitSeq[Reference] = LitSeq.empty,
      participatingOrganization: Option[Reference] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): OrganizationAffiliation = new OrganizationAffiliation(
    id,
    meta,
    text,
    code,
    active,
    period,
    network,
    telecom,
    language,
    location,
    endpoint,
    contained,
    extension,
    specialty,
    identifier,
    organization,
    implicitRules,
    modifierExtension,
    healthcareService,
    participatingOrganization,
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
  val network: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("network", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
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
  val organization: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("organization", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val healthcareService: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("healthcareService", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val participatingOrganization: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("participatingOrganization", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    code,
    active,
    period,
    network,
    telecom,
    language,
    location,
    endpoint,
    contained,
    extension,
    specialty,
    identifier,
    organization,
    implicitRules,
    modifierExtension,
    healthcareService,
    participatingOrganization
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: OrganizationAffiliation): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[LitSeq[CodeableConcept]](code, t.code),
    FHIRComponentField[Option[Boolean]](active, t.active),
    FHIRComponentField[Option[Period]](period, t.period),
    FHIRComponentField[LitSeq[Reference]](network, t.network),
    FHIRComponentField[LitSeq[ContactPoint]](telecom, t.telecom),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Reference]](location, t.location),
    FHIRComponentField[LitSeq[Reference]](endpoint, t.endpoint),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[CodeableConcept]](specialty, t.specialty),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[Reference]](organization, t.organization),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[Reference]](healthcareService, t.healthcareService),
    FHIRComponentField[Option[Reference]](participatingOrganization, t.participatingOrganization)
  )
  def extractId(t: OrganizationAffiliation): Option[String]                           = t.id
  def extractMeta(t: OrganizationAffiliation): Option[Meta]                           = t.meta
  def extractText(t: OrganizationAffiliation): Option[Narrative]                      = t.text
  def extractCode(t: OrganizationAffiliation): LitSeq[CodeableConcept]                = t.code
  def extractActive(t: OrganizationAffiliation): Option[Boolean]                      = t.active
  def extractPeriod(t: OrganizationAffiliation): Option[Period]                       = t.period
  def extractNetwork(t: OrganizationAffiliation): LitSeq[Reference]                   = t.network
  def extractTelecom(t: OrganizationAffiliation): LitSeq[ContactPoint]                = t.telecom
  def extractLanguage(t: OrganizationAffiliation): Option[LANGUAGES]                  = t.language
  def extractLocation(t: OrganizationAffiliation): LitSeq[Reference]                  = t.location
  def extractEndpoint(t: OrganizationAffiliation): LitSeq[Reference]                  = t.endpoint
  def extractContained(t: OrganizationAffiliation): LitSeq[Resource]                  = t.contained
  def extractExtension(t: OrganizationAffiliation): LitSeq[Extension]                 = t.extension
  def extractSpecialty(t: OrganizationAffiliation): LitSeq[CodeableConcept]           = t.specialty
  def extractIdentifier(t: OrganizationAffiliation): LitSeq[Identifier]               = t.identifier
  def extractOrganization(t: OrganizationAffiliation): Option[Reference]              = t.organization
  def extractImplicitRules(t: OrganizationAffiliation): Option[UriStr]                = t.implicitRules
  def extractModifierExtension(t: OrganizationAffiliation): LitSeq[Extension]         = t.modifierExtension
  def extractHealthcareService(t: OrganizationAffiliation): LitSeq[Reference]         = t.healthcareService
  def extractParticipatingOrganization(t: OrganizationAffiliation): Option[Reference] = t.participatingOrganization
  override val thisName: String                                                       = "OrganizationAffiliation"
  override val searchParams: Map[String, OrganizationAffiliation => Seq[Any]] = Map(
    "network"                    -> (obj => obj.network.toSeq),
    "location"                   -> (obj => obj.location.toSeq),
    "service"                    -> (obj => obj.healthcareService.toSeq),
    "primary-organization"       -> (obj => obj.organization.toSeq),
    "date"                       -> (obj => obj.period.toSeq),
    "email"                      -> (obj => obj.telecom.filter(_.system.map(_.entryName) contains "email").toSeq),
    "identifier"                 -> (obj => obj.identifier.toSeq),
    "role"                       -> (obj => obj.code.toSeq),
    "specialty"                  -> (obj => obj.specialty.toSeq),
    "participating-organization" -> (obj => obj.participatingOrganization.toSeq),
    "endpoint"                   -> (obj => obj.endpoint.toSeq),
    "telecom"                    -> (obj => obj.telecom.toSeq),
    "phone"                      -> (obj => obj.telecom.filter(_.system.map(_.entryName) contains "phone").toSeq),
    "active"                     -> (obj => obj.active.toSeq)
  )
  def unapply(
      o: OrganizationAffiliation): Option[(Option[String], Option[Meta], Option[Narrative], LitSeq[CodeableConcept], Option[Boolean], Option[Period], LitSeq[Reference], LitSeq[ContactPoint], Option[LANGUAGES], LitSeq[Reference], LitSeq[Reference], LitSeq[Resource], LitSeq[Extension], LitSeq[CodeableConcept], LitSeq[Identifier], Option[Reference], Option[UriStr], LitSeq[Extension], LitSeq[Reference], Option[Reference])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.code,
        o.active,
        o.period,
        o.network,
        o.telecom,
        o.language,
        o.location,
        o.endpoint,
        o.contained,
        o.extension,
        o.specialty,
        o.identifier,
        o.organization,
        o.implicitRules,
        o.modifierExtension,
        o.healthcareService,
        o.participatingOrganization))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[OrganizationAffiliation] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new OrganizationAffiliation(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("code", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Boolean]]("active", Some(None)),
          cursor.decodeAs[Option[Period]]("period", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("network", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[ContactPoint]]("telecom", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("location", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("endpoint", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("specialty", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("organization", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("healthcareService", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("participatingOrganization", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** Defines an affiliation/assotiation/relationship between 2 distinct oganizations, that is not a part-of relationship/sub-division relationship.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields code, active, period, network, telecom, location, endpoint, specialty, identifier, organization, healthcareService, participatingOrganization.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param code - Definition of the role the participatingOrganization plays in the association.
  * @param active - Whether this organization affiliation record is in active use.
  * @param period - The period during which the participatingOrganization is affiliated with the primary organization.
  * @param network - Health insurance provider network in which the participatingOrganization provides the role's services (if defined) at the indicated locations (if defined).
  * @param telecom - Contact details at the participatingOrganization relevant to this Affiliation.
  * @param language - The base language in which the resource is written.
  * @param location - The location(s) at which the role occurs.
  * @param endpoint - Technical endpoints providing access to services operated for this role.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param specialty - Specific specialty of the participatingOrganization in the context of the role.
  * @param identifier - Business identifiers that are specific to this role.
  * @param organization - Organization where the role is available (primary organization/has members).
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param healthcareService - Healthcare services provided through the role.
  * @param participatingOrganization - The Participating Organization provides/performs the role(s) defined by the code to the Primary Organization (e.g. providing services or is a member of).
  */
@POJOBoilerplate
class OrganizationAffiliation(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val code: LitSeq[CodeableConcept] = LitSeq.empty,
    val active: Option[Boolean] = None,
    val period: Option[Period] = None,
    val network: LitSeq[Reference] = LitSeq.empty,
    val telecom: LitSeq[ContactPoint] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    val location: LitSeq[Reference] = LitSeq.empty,
    val endpoint: LitSeq[Reference] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val specialty: LitSeq[CodeableConcept] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val organization: Option[Reference] = None,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val healthcareService: LitSeq[Reference] = LitSeq.empty,
    val participatingOrganization: Option[Reference] = None,
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
  override val thisTypeName: String = "OrganizationAffiliation"
}
