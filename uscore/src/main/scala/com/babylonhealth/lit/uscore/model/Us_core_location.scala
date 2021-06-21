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
import com.babylonhealth.lit.hl7.{ LOCATION_STATUS, LOCATION_MODE }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, usbase, uscore }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Us_core_location extends CompanionFor[Us_core_location] {
  implicit def summonObjectAndCompanionUs_core_location1477028323(
      o: Us_core_location): ObjectAndCompanion[Us_core_location, Us_core_location.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Location
  override type ParentType   = Location
  override val baseType: CompanionFor[ResourceType] = Location
  override val parentType: CompanionFor[ParentType] = Location
  override val profileUrl: Option[String] = Some("http://hl7.org/fhir/us/core/StructureDefinition/us-core-location")
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(
        new Meta(profile = LitSeq("http://hl7.org/fhir/us/core/StructureDefinition/us-core-location"))),
      text: Option[Narrative] = None,
      name: String,
      mode: Option[LOCATION_MODE] = None,
      `type`: LitSeq[CodeableConcept] = LitSeq.empty,
      alias: LitSeq[String] = LitSeq.empty,
      status: Option[LOCATION_STATUS] = None,
      partOf: Option[Reference] = None,
      telecom: LitSeq[ContactPoint] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      endpoint: LitSeq[Reference] = LitSeq.empty,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      description: Option[String] = None,
      physicalType: Option[CodeableConcept] = None,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      operationalStatus: Option[Coding] = None,
      address: Option[Address] = None,
      managingOrganization: Option[Reference] = None,
      availabilityExceptions: Option[String] = None,
      position: Option[Location.Position] = None,
      hoursOfOperation: LitSeq[Location.HoursOfOperation] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Us_core_location = new Us_core_location(
    id,
    meta,
    text,
    name,
    mode,
    `type`,
    alias,
    status,
    partOf,
    telecom,
    language,
    endpoint,
    contained,
    extension,
    identifier,
    description,
    physicalType,
    implicitRules,
    modifierExtension,
    operationalStatus,
    address,
    managingOrganization,
    availabilityExceptions,
    position,
    hoursOfOperation,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val name: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("name", lTagOf[String], false, lTagOf[String])
  val mode: FHIRComponentFieldMeta[Option[LOCATION_MODE]] =
    FHIRComponentFieldMeta("mode", lTagOf[Option[LOCATION_MODE]], false, lTagOf[LOCATION_MODE])
  val `type`: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("type", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val alias: FHIRComponentFieldMeta[LitSeq[String]] =
    FHIRComponentFieldMeta("alias", lTagOf[LitSeq[String]], false, lTagOf[String])
  val status: FHIRComponentFieldMeta[Option[LOCATION_STATUS]] =
    FHIRComponentFieldMeta("status", lTagOf[Option[LOCATION_STATUS]], false, lTagOf[LOCATION_STATUS])
  val partOf: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("partOf", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val telecom: FHIRComponentFieldMeta[LitSeq[ContactPoint]] =
    FHIRComponentFieldMeta("telecom", lTagOf[LitSeq[ContactPoint]], false, lTagOf[ContactPoint])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val endpoint: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("endpoint", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val description: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
  val physicalType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("physicalType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val operationalStatus: FHIRComponentFieldMeta[Option[Coding]] =
    FHIRComponentFieldMeta("operationalStatus", lTagOf[Option[Coding]], false, lTagOf[Coding])
  val address: FHIRComponentFieldMeta[Option[Address]] =
    FHIRComponentFieldMeta("address", lTagOf[Option[Address]], false, lTagOf[Address])
  val managingOrganization: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("managingOrganization", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val availabilityExceptions: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("availabilityExceptions", lTagOf[Option[String]], false, lTagOf[String])
  val position: FHIRComponentFieldMeta[Option[Location.Position]] =
    FHIRComponentFieldMeta("position", lTagOf[Option[Location.Position]], false, lTagOf[Location.Position])
  val hoursOfOperation: FHIRComponentFieldMeta[LitSeq[Location.HoursOfOperation]] =
    FHIRComponentFieldMeta(
      "hoursOfOperation",
      lTagOf[LitSeq[Location.HoursOfOperation]],
      false,
      lTagOf[Location.HoursOfOperation])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    name,
    mode,
    `type`,
    alias,
    status,
    partOf,
    telecom,
    language,
    endpoint,
    contained,
    extension,
    identifier,
    description,
    physicalType,
    implicitRules,
    modifierExtension,
    operationalStatus,
    address,
    managingOrganization,
    availabilityExceptions,
    position,
    hoursOfOperation
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Meta]](meta, t.meta),
      FHIRComponentField[Option[Narrative]](text, t.text),
      FHIRComponentField[String](name, t.name.get),
      FHIRComponentField[Option[LOCATION_MODE]](mode, t.mode),
      FHIRComponentField[LitSeq[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[LitSeq[String]](alias, t.alias),
      FHIRComponentField[Option[LOCATION_STATUS]](status, t.status),
      FHIRComponentField[Option[Reference]](partOf, t.partOf),
      FHIRComponentField[LitSeq[ContactPoint]](telecom, t.telecom),
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[LitSeq[Reference]](endpoint, t.endpoint),
      FHIRComponentField[LitSeq[Resource]](contained, t.contained),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
      FHIRComponentField[Option[String]](description, t.description),
      FHIRComponentField[Option[CodeableConcept]](physicalType, t.physicalType),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[Coding]](operationalStatus, t.operationalStatus),
      FHIRComponentField[Option[Address]](address, t.address),
      FHIRComponentField[Option[Reference]](managingOrganization, t.managingOrganization),
      FHIRComponentField[Option[String]](availabilityExceptions, t.availabilityExceptions),
      FHIRComponentField[Option[Location.Position]](position, t.position),
      FHIRComponentField[LitSeq[Location.HoursOfOperation]](hoursOfOperation, t.hoursOfOperation)
    ))
  override def fields(t: Us_core_location): Seq[FHIRComponentField[_]]                = fieldsFromParent(t).get
  def extractId(t: Us_core_location): Option[String]                                  = t.id
  def extractMeta(t: Us_core_location): Option[Meta]                                  = t.meta
  def extractText(t: Us_core_location): Option[Narrative]                             = t.text
  def extractName(t: Us_core_location): String                                        = t.name.get
  def extractMode(t: Us_core_location): Option[LOCATION_MODE]                         = t.mode
  def extractType(t: Us_core_location): LitSeq[CodeableConcept]                       = t.`type`
  def extractAlias(t: Us_core_location): LitSeq[String]                               = t.alias
  def extractStatus(t: Us_core_location): Option[LOCATION_STATUS]                     = t.status
  def extractPartOf(t: Us_core_location): Option[Reference]                           = t.partOf
  def extractTelecom(t: Us_core_location): LitSeq[ContactPoint]                       = t.telecom
  def extractLanguage(t: Us_core_location): Option[LANGUAGES]                         = t.language
  def extractEndpoint(t: Us_core_location): LitSeq[Reference]                         = t.endpoint
  def extractContained(t: Us_core_location): LitSeq[Resource]                         = t.contained
  def extractExtension(t: Us_core_location): LitSeq[Extension]                        = t.extension
  def extractIdentifier(t: Us_core_location): LitSeq[Identifier]                      = t.identifier
  def extractDescription(t: Us_core_location): Option[String]                         = t.description
  def extractPhysicalType(t: Us_core_location): Option[CodeableConcept]               = t.physicalType
  def extractImplicitRules(t: Us_core_location): Option[UriStr]                       = t.implicitRules
  def extractModifierExtension(t: Us_core_location): LitSeq[Extension]                = t.modifierExtension
  def extractOperationalStatus(t: Us_core_location): Option[Coding]                   = t.operationalStatus
  def extractAddress(t: Us_core_location): Option[Address]                            = t.address
  def extractManagingOrganization(t: Us_core_location): Option[Reference]             = t.managingOrganization
  def extractAvailabilityExceptions(t: Us_core_location): Option[String]              = t.availabilityExceptions
  def extractPosition(t: Us_core_location): Option[Location.Position]                 = t.position
  def extractHoursOfOperation(t: Us_core_location): LitSeq[Location.HoursOfOperation] = t.hoursOfOperation
  override val thisName: String                                                       = "Us_core_location"
  override val searchParams: Map[String, Us_core_location => Seq[Any]]                = Location.searchParams
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Us_core_location] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Us_core_location(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[String]("name", None),
          cursor.decodeAs[Option[LOCATION_MODE]]("mode", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("type", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[String]]("alias", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LOCATION_STATUS]]("status", Some(None)),
          cursor.decodeAs[Option[Reference]]("partOf", Some(None)),
          cursor.decodeAs[LitSeq[ContactPoint]]("telecom", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("endpoint", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("description", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("physicalType", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Coding]]("operationalStatus", Some(None)),
          cursor.decodeAs[Option[Address]]("address", Some(None)),
          cursor.decodeAs[Option[Reference]]("managingOrganization", Some(None)),
          cursor.decodeAs[Option[String]]("availabilityExceptions", Some(None)),
          cursor.decodeAs[Option[Location.Position]]("position", Some(None)),
          cursor.decodeAs[LitSeq[Location.HoursOfOperation]]("hoursOfOperation", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Defines basic constraints and extensions on the Location resource for use with other US Core resources
  *
  * Subclass of [[hl7.model.Location]] (Details and position information for a physical place where services are
  * provided and resources and participants may be stored, found, contained, or accommodated.)
  *
  * @constructor
  *   Inherits all params from parent. Requires the following fields which were optional in the parent: name.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the
  *   content might not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of
  *   the resource to a human. The narrative need not encode all the structured data, but is required to contain
  *   sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may
  *   define what content should be represented in the narrative to ensure clinical safety.
  * @param name
  *   - Name of the location as used by humans. Does not need to be unique.
  * @param mode
  *   - Indicates whether a resource instance represents a specific location or a class of locations.
  * @param `type`
  *   - Indicates the type of function performed at the location.
  * @param alias
  *   - A list of alternate names that the location is known as, or was known as, in the past.
  * @param status
  *   - The status property covers the general availability of the resource, not the current value which may be covered
  *   by the operationStatus, or by a schedule/slots if they are configured for the location.
  * @param partOf
  *   - Another Location of which this Location is physically a part of.
  * @param telecom
  *   - The contact details of communication devices available at the location. This can include phone numbers, fax
  *   numbers, mobile numbers, email addresses and web sites.
  * @param language
  *   - The base language in which the resource is written.
  * @param endpoint
  *   - Technical endpoints providing access to services operated for the location.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To
  *   make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and
  *   use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be
  *   met as part of the definition of the extension.
  * @param identifier
  *   - Unique code or number identifying the location to its users.
  * @param description
  *   - Description of the Location, which helps in finding or referencing the place.
  * @param physicalType
  *   - Physical form of the location, e.g. building, room, vehicle, road.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood
  *   when processing the content. Often, this is a reference to an implementation guide that defines the special rules
  *   along with other profiles etc.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and
  *   that modifies the understanding of the element that contains it and/or the understanding of the containing
  *   element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions
  *   safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though
  *   any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the
  *   definition of the extension. Applications processing a resource are required to check for modifier extensions.
  *   Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot
  *   change the meaning of modifierExtension itself).
  * @param operationalStatus
  *   - The operational status covers operation values most relevant to beds (but can also apply to
  *   rooms/units/chairs/etc. such as an isolation unit/dialysis chair). This typically covers concepts such as
  *   contamination, housekeeping, and other activities like maintenance.
  * @param address
  *   - Physical location.
  * @param managingOrganization
  *   - The organization responsible for the provisioning and upkeep of the location.
  * @param availabilityExceptions
  *   - A description of when the locations opening ours are different to normal, e.g. public holiday availability.
  *   Succinctly describing all possible exceptions to normal site availability as detailed in the opening hours Times.
  * @param position
  *   - The absolute geographic location of the Location, expressed using the WGS84 datum (This is the same co-ordinate
  *   system used in KML).
  * @param hoursOfOperation
  *   - What days/times during a week is this location usually open.
  */
@POJOBoilerplate
class Us_core_location(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("http://hl7.org/fhir/us/core/StructureDefinition/us-core-location"))),
    override val text: Option[Narrative] = None,
    name: String,
    override val mode: Option[LOCATION_MODE] = None,
    override val `type`: LitSeq[CodeableConcept] = LitSeq.empty,
    override val alias: LitSeq[String] = LitSeq.empty,
    override val status: Option[LOCATION_STATUS] = None,
    override val partOf: Option[Reference] = None,
    override val telecom: LitSeq[ContactPoint] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    override val endpoint: LitSeq[Reference] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val description: Option[String] = None,
    override val physicalType: Option[CodeableConcept] = None,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val operationalStatus: Option[Coding] = None,
    override val address: Option[Address] = None,
    override val managingOrganization: Option[Reference] = None,
    override val availabilityExceptions: Option[String] = None,
    override val position: Option[Location.Position] = None,
    override val hoursOfOperation: LitSeq[Location.HoursOfOperation] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Location(
      id = id,
      meta = meta,
      text = text,
      name = Some(name),
      mode = mode,
      `type` = `type`,
      alias = alias,
      status = status,
      partOf = partOf,
      telecom = telecom,
      address = address,
      language = language,
      endpoint = endpoint,
      contained = contained,
      extension = extension,
      identifier = identifier,
      description = description,
      physicalType = physicalType,
      implicitRules = implicitRules,
      modifierExtension = modifierExtension,
      operationalStatus = operationalStatus,
      managingOrganization = managingOrganization,
      availabilityExceptions = availabilityExceptions,
      position = position,
      hoursOfOperation = hoursOfOperation,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Location"
}
