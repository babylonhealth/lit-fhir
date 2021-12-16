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
import com.babylonhealth.lit.hl7.{ LOCATION_STATUS, LOCATION_MODE }
import com.babylonhealth.lit.core.{ LANGUAGES, DAYS_OF_WEEK }
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Location extends CompanionFor[Location] {
  implicit def summonObjectAndCompanionLocation_1083745622(o: Location): ObjectAndCompanion[Location, Location.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Location
  override type ParentType   = Location
  override val baseType: CompanionFor[ResourceType] = Location
  override val parentType: CompanionFor[ParentType] = Location
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Location")
  object HoursOfOperation extends CompanionFor[HoursOfOperation] {
    implicit def summonObjectAndCompanionHoursOfOperation_363591766(
        o: HoursOfOperation): ObjectAndCompanion[HoursOfOperation, HoursOfOperation.type] = ObjectAndCompanion(o, this)
    override type ResourceType = HoursOfOperation
    override type ParentType   = HoursOfOperation
    override val parentType: CompanionFor[ResourceType] = HoursOfOperation
    def apply(
        id: Option[String] = None,
        allDay: Option[Boolean] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        daysOfWeek: LitSeq[DAYS_OF_WEEK] = LitSeq.empty,
        openingTime: Option[LocalTime] = None,
        closingTime: Option[LocalTime] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): HoursOfOperation = new HoursOfOperation(
      id,
      allDay,
      extension,
      daysOfWeek,
      openingTime,
      closingTime,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: HoursOfOperation): Option[(Option[String], Option[Boolean], LitSeq[Extension], LitSeq[DAYS_OF_WEEK], Option[LocalTime], Option[LocalTime], LitSeq[Extension])] =
      Some((o.id, o.allDay, o.extension, o.daysOfWeek, o.openingTime, o.closingTime, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val allDay: FHIRComponentFieldMeta[Option[Boolean]] =
      FHIRComponentFieldMeta("allDay", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val daysOfWeek: FHIRComponentFieldMeta[LitSeq[DAYS_OF_WEEK]] =
      FHIRComponentFieldMeta("daysOfWeek", lTagOf[LitSeq[DAYS_OF_WEEK]], false, lTagOf[DAYS_OF_WEEK])
    val openingTime: FHIRComponentFieldMeta[Option[LocalTime]] =
      FHIRComponentFieldMeta("openingTime", lTagOf[Option[LocalTime]], false, lTagOf[LocalTime])
    val closingTime: FHIRComponentFieldMeta[Option[LocalTime]] =
      FHIRComponentFieldMeta("closingTime", lTagOf[Option[LocalTime]], false, lTagOf[LocalTime])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, allDay, extension, daysOfWeek, openingTime, closingTime, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: HoursOfOperation): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Boolean]](allDay, t.allDay),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[DAYS_OF_WEEK]](daysOfWeek, t.daysOfWeek),
      FHIRComponentField[Option[LocalTime]](openingTime, t.openingTime),
      FHIRComponentField[Option[LocalTime]](closingTime, t.closingTime),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[HoursOfOperation] = this
    val thisName: String                         = "HoursOfOperation"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[HoursOfOperation] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new HoursOfOperation(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[Boolean]]("allDay", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[DAYS_OF_WEEK]]("daysOfWeek", Some(LitSeq.empty)),
            cursor.decodeAs[Option[LocalTime]]("openingTime", Some(None)),
            cursor.decodeAs[Option[LocalTime]]("closingTime", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class HoursOfOperation(
      override val id: Option[String] = None,
      val allDay: Option[Boolean] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val daysOfWeek: LitSeq[DAYS_OF_WEEK] = LitSeq.empty,
      val openingTime: Option[LocalTime] = None,
      val closingTime: Option[LocalTime] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Position extends CompanionFor[Position] {
    implicit def summonObjectAndCompanionPosition_363591766(o: Position): ObjectAndCompanion[Position, Position.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Position
    override type ParentType   = Position
    override val parentType: CompanionFor[ResourceType] = Position
    def apply(
        id: Option[String] = None,
        latitude: BigDecimal,
        altitude: Option[BigDecimal] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        longitude: BigDecimal,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Position = new Position(
      id,
      latitude,
      altitude,
      extension,
      longitude,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Position): Option[(Option[String], BigDecimal, Option[BigDecimal], LitSeq[Extension], BigDecimal, LitSeq[Extension])] =
      Some((o.id, o.latitude, o.altitude, o.extension, o.longitude, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val latitude: FHIRComponentFieldMeta[BigDecimal] =
      FHIRComponentFieldMeta("latitude", lTagOf[BigDecimal], false, lTagOf[BigDecimal])
    val altitude: FHIRComponentFieldMeta[Option[BigDecimal]] =
      FHIRComponentFieldMeta("altitude", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val longitude: FHIRComponentFieldMeta[BigDecimal] =
      FHIRComponentFieldMeta("longitude", lTagOf[BigDecimal], false, lTagOf[BigDecimal])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, latitude, altitude, extension, longitude, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Position): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[BigDecimal](latitude, t.latitude),
      FHIRComponentField[Option[BigDecimal]](altitude, t.altitude),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[BigDecimal](longitude, t.longitude),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Position] = this
    val thisName: String                 = "Position"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Position] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Position(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[BigDecimal]("latitude", None),
            cursor.decodeAs[Option[BigDecimal]]("altitude", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[BigDecimal]("longitude", None),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Position(
      override val id: Option[String] = None,
      val latitude: BigDecimal,
      val altitude: Option[BigDecimal] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val longitude: BigDecimal,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      name: Option[String] = None,
      mode: Option[LOCATION_MODE] = None,
      `type`: LitSeq[CodeableConcept] = LitSeq.empty,
      alias: LitSeq[String] = LitSeq.empty,
      status: Option[LOCATION_STATUS] = None,
      partOf: Option[Reference] = None,
      telecom: LitSeq[ContactPoint] = LitSeq.empty,
      address: Option[Address] = None,
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
      managingOrganization: Option[Reference] = None,
      availabilityExceptions: Option[String] = None,
      position: Option[Location.Position] = None,
      hoursOfOperation: LitSeq[Location.HoursOfOperation] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Location = new Location(
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
    address,
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
  val name: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("name", lTagOf[Option[String]], false, lTagOf[String])
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
  val address: FHIRComponentFieldMeta[Option[Address]] =
    FHIRComponentFieldMeta("address", lTagOf[Option[Address]], false, lTagOf[Address])
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
    address,
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
    managingOrganization,
    availabilityExceptions,
    position,
    hoursOfOperation
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Location): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[String]](name, t.name),
    FHIRComponentField[Option[LOCATION_MODE]](mode, t.mode),
    FHIRComponentField[LitSeq[CodeableConcept]](`type`, t.`type`),
    FHIRComponentField[LitSeq[String]](alias, t.alias),
    FHIRComponentField[Option[LOCATION_STATUS]](status, t.status),
    FHIRComponentField[Option[Reference]](partOf, t.partOf),
    FHIRComponentField[LitSeq[ContactPoint]](telecom, t.telecom),
    FHIRComponentField[Option[Address]](address, t.address),
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
    FHIRComponentField[Option[Reference]](managingOrganization, t.managingOrganization),
    FHIRComponentField[Option[String]](availabilityExceptions, t.availabilityExceptions),
    FHIRComponentField[Option[Location.Position]](position, t.position),
    FHIRComponentField[LitSeq[Location.HoursOfOperation]](hoursOfOperation, t.hoursOfOperation)
  )
  def extractId(t: Location): Option[String]                                  = t.id
  def extractMeta(t: Location): Option[Meta]                                  = t.meta
  def extractText(t: Location): Option[Narrative]                             = t.text
  def extractName(t: Location): Option[String]                                = t.name
  def extractMode(t: Location): Option[LOCATION_MODE]                         = t.mode
  def extractType(t: Location): LitSeq[CodeableConcept]                       = t.`type`
  def extractAlias(t: Location): LitSeq[String]                               = t.alias
  def extractStatus(t: Location): Option[LOCATION_STATUS]                     = t.status
  def extractPartOf(t: Location): Option[Reference]                           = t.partOf
  def extractTelecom(t: Location): LitSeq[ContactPoint]                       = t.telecom
  def extractAddress(t: Location): Option[Address]                            = t.address
  def extractLanguage(t: Location): Option[LANGUAGES]                         = t.language
  def extractEndpoint(t: Location): LitSeq[Reference]                         = t.endpoint
  def extractContained(t: Location): LitSeq[Resource]                         = t.contained
  def extractExtension(t: Location): LitSeq[Extension]                        = t.extension
  def extractIdentifier(t: Location): LitSeq[Identifier]                      = t.identifier
  def extractDescription(t: Location): Option[String]                         = t.description
  def extractPhysicalType(t: Location): Option[CodeableConcept]               = t.physicalType
  def extractImplicitRules(t: Location): Option[UriStr]                       = t.implicitRules
  def extractModifierExtension(t: Location): LitSeq[Extension]                = t.modifierExtension
  def extractOperationalStatus(t: Location): Option[Coding]                   = t.operationalStatus
  def extractManagingOrganization(t: Location): Option[Reference]             = t.managingOrganization
  def extractAvailabilityExceptions(t: Location): Option[String]              = t.availabilityExceptions
  def extractPosition(t: Location): Option[Location.Position]                 = t.position
  def extractHoursOfOperation(t: Location): LitSeq[Location.HoursOfOperation] = t.hoursOfOperation
  override val thisName: String                                               = "Location"
  override val searchParams: Map[String, Location => Seq[Any]] = Map(
    "organization"       -> (obj => obj.managingOrganization.toSeq),
    "partof"             -> (obj => obj.partOf.toSeq),
    "identifier"         -> (obj => obj.identifier.toSeq),
    "operational-status" -> (obj => obj.operationalStatus.toSeq),
    "address-state"      -> (obj => obj.address.flatMap(_.state).toSeq),
    "address-postalcode" -> (obj => obj.address.flatMap(_.postalCode).toSeq),
    "address-use"        -> (obj => obj.address.flatMap(_.use).toSeq),
    "near"               -> (obj => obj.position.toSeq),
    "status"             -> (obj => obj.status.toSeq),
    "type"               -> (obj => obj.`type`.toSeq),
    "address-country"    -> (obj => obj.address.flatMap(_.country).toSeq),
    "address-city"       -> (obj => obj.address.flatMap(_.city).toSeq),
    "name" -> (obj =>
      obj.name.toSeq ++
        obj.alias.toSeq),
    "endpoint" -> (obj => obj.endpoint.toSeq),
    "address"  -> (obj => obj.address.toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Location] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Location(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[String]]("name", Some(None)),
          cursor.decodeAs[Option[LOCATION_MODE]]("mode", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("type", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[String]]("alias", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LOCATION_STATUS]]("status", Some(None)),
          cursor.decodeAs[Option[Reference]]("partOf", Some(None)),
          cursor.decodeAs[LitSeq[ContactPoint]]("telecom", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Address]]("address", Some(None)),
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
          cursor.decodeAs[Option[Reference]]("managingOrganization", Some(None)),
          cursor.decodeAs[Option[String]]("availabilityExceptions", Some(None)),
          cursor.decodeAs[Option[Location.Position]]("position", Some(None)),
          cursor.decodeAs[LitSeq[Location.HoursOfOperation]]("hoursOfOperation", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Details and position information for a physical place where services are provided and resources and participants may be
  * stored, found, contained, or accommodated.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields name, mode, `type`, alias, status, partOf, telecom, address, endpoint, identifier, description,
  *   physicalType, operationalStatus, managingOrganization, availabilityExceptions, position, hoursOfOperation.
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
  * @param name
  *   - Name of the location as used by humans. Does not need to be unique.
  * @param mode
  *   - Indicates whether a resource instance represents a specific location or a class of locations.
  * @param `type`
  *   - Indicates the type of function performed at the location.
  * @param alias
  *   - A list of alternate names that the location is known as, or was known as, in the past.
  * @param status
  *   - The status property covers the general availability of the resource, not the current value which may be covered by the
  *   operationStatus, or by a schedule/slots if they are configured for the location.
  * @param partOf
  *   - Another Location of which this Location is physically a part of.
  * @param telecom
  *   - The contact details of communication devices available at the location. This can include phone numbers, fax numbers,
  *   mobile numbers, email addresses and web sites.
  * @param address
  *   - Physical location.
  * @param language
  *   - The base language in which the resource is written.
  * @param endpoint
  *   - Technical endpoints providing access to services operated for the location.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param identifier
  *   - Unique code or number identifying the location to its users.
  * @param description
  *   - Description of the Location, which helps in finding or referencing the place.
  * @param physicalType
  *   - Physical form of the location, e.g. building, room, vehicle, road.
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
  * @param operationalStatus
  *   - The operational status covers operation values most relevant to beds (but can also apply to rooms/units/chairs/etc. such
  *   as an isolation unit/dialysis chair). This typically covers concepts such as contamination, housekeeping, and other
  *   activities like maintenance.
  * @param managingOrganization
  *   - The organization responsible for the provisioning and upkeep of the location.
  * @param availabilityExceptions
  *   - A description of when the locations opening ours are different to normal, e.g. public holiday availability. Succinctly
  *   describing all possible exceptions to normal site availability as detailed in the opening hours Times.
  * @param position
  *   - The absolute geographic location of the Location, expressed using the WGS84 datum (This is the same co-ordinate system
  *   used in KML).
  * @param hoursOfOperation
  *   - What days/times during a week is this location usually open.
  */
@POJOBoilerplate
class Location(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val name: Option[String] = None,
    val mode: Option[LOCATION_MODE] = None,
    val `type`: LitSeq[CodeableConcept] = LitSeq.empty,
    val alias: LitSeq[String] = LitSeq.empty,
    val status: Option[LOCATION_STATUS] = None,
    val partOf: Option[Reference] = None,
    val telecom: LitSeq[ContactPoint] = LitSeq.empty,
    val address: Option[Address] = None,
    override val language: Option[LANGUAGES] = None,
    val endpoint: LitSeq[Reference] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val description: Option[String] = None,
    val physicalType: Option[CodeableConcept] = None,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val operationalStatus: Option[Coding] = None,
    val managingOrganization: Option[Reference] = None,
    val availabilityExceptions: Option[String] = None,
    val position: Option[Location.Position] = None,
    val hoursOfOperation: LitSeq[Location.HoursOfOperation] = LitSeq.empty,
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
  override val thisTypeName: String = "Location"
}
