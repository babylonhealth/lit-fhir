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
import com.babylonhealth.lit.hl7.DEVICE_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, usbase, uscore }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Us_core_implantable_device extends CompanionFor[Us_core_implantable_device] {
  implicit def summonObjectAndCompanionUs_core_implantable_device_1636097842(
      o: Us_core_implantable_device): ObjectAndCompanion[Us_core_implantable_device, Us_core_implantable_device.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Device
  override type ParentType   = Device
  override val baseType: CompanionFor[ResourceType] = Device
  override val parentType: CompanionFor[ParentType] = Device
  override val profileUrl: Option[String] = Some("http://hl7.org/fhir/us/core/StructureDefinition/us-core-implantable-device")
  def apply(
      id: Option[String] = None,
      url: Option[UriStr] = None,
      meta: Option[Meta] = Some(
        new Meta(profile = LitSeq("http://hl7.org/fhir/us/core/StructureDefinition/us-core-implantable-device"))),
      text: Option[Narrative] = None,
      `type`: CodeableConcept,
      note: LitSeq[Annotation] = LitSeq.empty,
      owner: Option[Reference] = None,
      status: Option[DEVICE_STATUS] = None,
      safety: LitSeq[CodeableConcept] = LitSeq.empty,
      parent: Option[Reference] = None,
      patient: Reference,
      contact: LitSeq[ContactPoint] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      location: Option[Reference] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      lotNumber: Option[String] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      definition: Option[Reference] = None,
      partNumber: Option[String] = None,
      modelNumber: Option[String] = None,
      statusReason: LitSeq[CodeableConcept] = LitSeq.empty,
      manufacturer: Option[String] = None,
      serialNumber: Option[String] = None,
      implicitRules: Option[UriStr] = None,
      expirationDate: Option[FHIRDateTime] = None,
      manufactureDate: Option[FHIRDateTime] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      distinctIdentifier: Option[String] = None,
      version: LitSeq[Device.Version] = LitSeq.empty,
      property: LitSeq[Device.Property] = LitSeq.empty,
      udiCarrier: Option[Device.UdiCarrier] = None,
      deviceName: LitSeq[Device.DeviceName] = LitSeq.empty,
      specialization: LitSeq[Device.Specialization] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Us_core_implantable_device = new Us_core_implantable_device(
    id,
    url,
    meta,
    text,
    `type`,
    note,
    owner,
    status,
    safety,
    parent,
    patient,
    contact,
    language,
    location,
    contained,
    extension,
    lotNumber,
    identifier,
    definition,
    partNumber,
    modelNumber,
    statusReason,
    manufacturer,
    serialNumber,
    implicitRules,
    expirationDate,
    manufactureDate,
    modifierExtension,
    distinctIdentifier,
    version,
    property,
    udiCarrier,
    deviceName,
    specialization,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val url: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("url", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val `type`: FHIRComponentFieldMeta[CodeableConcept] =
    FHIRComponentFieldMeta("type", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val owner: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("owner", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val status: FHIRComponentFieldMeta[Option[DEVICE_STATUS]] =
    FHIRComponentFieldMeta("status", lTagOf[Option[DEVICE_STATUS]], false, lTagOf[DEVICE_STATUS])
  val safety: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("safety", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val parent: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("parent", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val patient: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("patient", lTagOf[Reference], false, lTagOf[Reference])
  val contact: FHIRComponentFieldMeta[LitSeq[ContactPoint]] =
    FHIRComponentFieldMeta("contact", lTagOf[LitSeq[ContactPoint]], false, lTagOf[ContactPoint])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val location: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("location", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val lotNumber: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("lotNumber", lTagOf[Option[String]], false, lTagOf[String])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val definition: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("definition", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val partNumber: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("partNumber", lTagOf[Option[String]], false, lTagOf[String])
  val modelNumber: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("modelNumber", lTagOf[Option[String]], false, lTagOf[String])
  val statusReason: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("statusReason", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val manufacturer: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("manufacturer", lTagOf[Option[String]], false, lTagOf[String])
  val serialNumber: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("serialNumber", lTagOf[Option[String]], false, lTagOf[String])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val expirationDate: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("expirationDate", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val manufactureDate: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("manufactureDate", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val distinctIdentifier: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("distinctIdentifier", lTagOf[Option[String]], false, lTagOf[String])
  val version: FHIRComponentFieldMeta[LitSeq[Device.Version]] =
    FHIRComponentFieldMeta("version", lTagOf[LitSeq[Device.Version]], false, lTagOf[Device.Version])
  val property: FHIRComponentFieldMeta[LitSeq[Device.Property]] =
    FHIRComponentFieldMeta("property", lTagOf[LitSeq[Device.Property]], false, lTagOf[Device.Property])
  val udiCarrier: FHIRComponentFieldMeta[Option[Device.UdiCarrier]] =
    FHIRComponentFieldMeta("udiCarrier", lTagOf[Option[Device.UdiCarrier]], false, lTagOf[Device.UdiCarrier])
  val deviceName: FHIRComponentFieldMeta[LitSeq[Device.DeviceName]] =
    FHIRComponentFieldMeta("deviceName", lTagOf[LitSeq[Device.DeviceName]], false, lTagOf[Device.DeviceName])
  val specialization: FHIRComponentFieldMeta[LitSeq[Device.Specialization]] =
    FHIRComponentFieldMeta("specialization", lTagOf[LitSeq[Device.Specialization]], false, lTagOf[Device.Specialization])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    url,
    meta,
    text,
    `type`,
    note,
    owner,
    status,
    safety,
    parent,
    patient,
    contact,
    language,
    location,
    contained,
    extension,
    lotNumber,
    identifier,
    definition,
    partNumber,
    modelNumber,
    statusReason,
    manufacturer,
    serialNumber,
    implicitRules,
    expirationDate,
    manufactureDate,
    modifierExtension,
    distinctIdentifier,
    version,
    property,
    udiCarrier,
    deviceName,
    specialization
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[UriStr]](url, t.url),
      FHIRComponentField[Option[Meta]](meta, t.meta),
      FHIRComponentField[Option[Narrative]](text, t.text),
      FHIRComponentField[CodeableConcept](`type`, t.`type`.get),
      FHIRComponentField[LitSeq[Annotation]](note, t.note),
      FHIRComponentField[Option[Reference]](owner, t.owner),
      FHIRComponentField[Option[DEVICE_STATUS]](status, t.status),
      FHIRComponentField[LitSeq[CodeableConcept]](safety, t.safety),
      FHIRComponentField[Option[Reference]](parent, t.parent),
      FHIRComponentField[Reference](patient, t.patient.get),
      FHIRComponentField[LitSeq[ContactPoint]](contact, t.contact),
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[Option[Reference]](location, t.location),
      FHIRComponentField[LitSeq[Resource]](contained, t.contained),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[String]](lotNumber, t.lotNumber),
      FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
      FHIRComponentField[Option[Reference]](definition, t.definition),
      FHIRComponentField[Option[String]](partNumber, t.partNumber),
      FHIRComponentField[Option[String]](modelNumber, t.modelNumber),
      FHIRComponentField[LitSeq[CodeableConcept]](statusReason, t.statusReason),
      FHIRComponentField[Option[String]](manufacturer, t.manufacturer),
      FHIRComponentField[Option[String]](serialNumber, t.serialNumber),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[Option[FHIRDateTime]](expirationDate, t.expirationDate),
      FHIRComponentField[Option[FHIRDateTime]](manufactureDate, t.manufactureDate),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[String]](distinctIdentifier, t.distinctIdentifier),
      FHIRComponentField[LitSeq[Device.Version]](version, t.version),
      FHIRComponentField[LitSeq[Device.Property]](property, t.property),
      FHIRComponentField[Option[Device.UdiCarrier]](udiCarrier, t.udiCarrier.headOption),
      FHIRComponentField[LitSeq[Device.DeviceName]](deviceName, t.deviceName),
      FHIRComponentField[LitSeq[Device.Specialization]](specialization, t.specialization)
    ))
  override def fields(t: Us_core_implantable_device): Seq[FHIRComponentField[_]]          = fieldsFromParent(t).get
  def extractId(t: Us_core_implantable_device): Option[String]                            = t.id
  def extractUrl(t: Us_core_implantable_device): Option[UriStr]                           = t.url
  def extractMeta(t: Us_core_implantable_device): Option[Meta]                            = t.meta
  def extractText(t: Us_core_implantable_device): Option[Narrative]                       = t.text
  def extractType(t: Us_core_implantable_device): CodeableConcept                         = t.`type`.get
  def extractNote(t: Us_core_implantable_device): LitSeq[Annotation]                      = t.note
  def extractOwner(t: Us_core_implantable_device): Option[Reference]                      = t.owner
  def extractStatus(t: Us_core_implantable_device): Option[DEVICE_STATUS]                 = t.status
  def extractSafety(t: Us_core_implantable_device): LitSeq[CodeableConcept]               = t.safety
  def extractParent(t: Us_core_implantable_device): Option[Reference]                     = t.parent
  def extractPatient(t: Us_core_implantable_device): Reference                            = t.patient.get
  def extractContact(t: Us_core_implantable_device): LitSeq[ContactPoint]                 = t.contact
  def extractLanguage(t: Us_core_implantable_device): Option[LANGUAGES]                   = t.language
  def extractLocation(t: Us_core_implantable_device): Option[Reference]                   = t.location
  def extractContained(t: Us_core_implantable_device): LitSeq[Resource]                   = t.contained
  def extractExtension(t: Us_core_implantable_device): LitSeq[Extension]                  = t.extension
  def extractLotNumber(t: Us_core_implantable_device): Option[String]                     = t.lotNumber
  def extractIdentifier(t: Us_core_implantable_device): LitSeq[Identifier]                = t.identifier
  def extractDefinition(t: Us_core_implantable_device): Option[Reference]                 = t.definition
  def extractPartNumber(t: Us_core_implantable_device): Option[String]                    = t.partNumber
  def extractModelNumber(t: Us_core_implantable_device): Option[String]                   = t.modelNumber
  def extractStatusReason(t: Us_core_implantable_device): LitSeq[CodeableConcept]         = t.statusReason
  def extractManufacturer(t: Us_core_implantable_device): Option[String]                  = t.manufacturer
  def extractSerialNumber(t: Us_core_implantable_device): Option[String]                  = t.serialNumber
  def extractImplicitRules(t: Us_core_implantable_device): Option[UriStr]                 = t.implicitRules
  def extractExpirationDate(t: Us_core_implantable_device): Option[FHIRDateTime]          = t.expirationDate
  def extractManufactureDate(t: Us_core_implantable_device): Option[FHIRDateTime]         = t.manufactureDate
  def extractModifierExtension(t: Us_core_implantable_device): LitSeq[Extension]          = t.modifierExtension
  def extractDistinctIdentifier(t: Us_core_implantable_device): Option[String]            = t.distinctIdentifier
  def extractVersion(t: Us_core_implantable_device): LitSeq[Device.Version]               = t.version
  def extractProperty(t: Us_core_implantable_device): LitSeq[Device.Property]             = t.property
  def extractUdiCarrier(t: Us_core_implantable_device): Option[Device.UdiCarrier]         = t.udiCarrier.headOption
  def extractDeviceName(t: Us_core_implantable_device): LitSeq[Device.DeviceName]         = t.deviceName
  def extractSpecialization(t: Us_core_implantable_device): LitSeq[Device.Specialization] = t.specialization
  override val thisName: String                                                           = "Us_core_implantable_device"
  override val searchParams: Map[String, Us_core_implantable_device => Seq[Any]]          = Device.searchParams
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Us_core_implantable_device] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Us_core_implantable_device(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[UriStr]]("url", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[CodeableConcept]("type", None),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("owner", Some(None)),
          cursor.decodeAs[Option[DEVICE_STATUS]]("status", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("safety", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("parent", Some(None)),
          cursor.decodeAs[Reference]("patient", None),
          cursor.decodeAs[LitSeq[ContactPoint]]("contact", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[Reference]]("location", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("lotNumber", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("definition", Some(None)),
          cursor.decodeAs[Option[String]]("partNumber", Some(None)),
          cursor.decodeAs[Option[String]]("modelNumber", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("statusReason", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("manufacturer", Some(None)),
          cursor.decodeAs[Option[String]]("serialNumber", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("expirationDate", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("manufactureDate", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("distinctIdentifier", Some(None)),
          cursor.decodeAs[LitSeq[Device.Version]]("version", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Device.Property]]("property", Some(LitSeq.empty)),
          cursor.decodeFromListAs[Option[Device.UdiCarrier]]("udiCarrier", Some(None)),
          cursor.decodeAs[LitSeq[Device.DeviceName]]("deviceName", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Device.Specialization]]("specialization", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Defines constraints and extensions on the Device resource for the minimal set of data to query and retrieve a patient's
  * implantable device(s).
  *
  * Subclass of [[hl7.model.Device]] (A type of a manufactured item that is used in the provision of healthcare without being
  * substantially changed through that activity. The device may be a medical or non-medical device.)
  *
  * @constructor
  *   Inherits all params from parent. Requires the following fields which were optional in the parent: `type`, patient.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param url
  *   - A network address on which the device may be contacted directly.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *   not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *   resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to
  *   make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be
  *   represented in the narrative to ensure clinical safety.
  * @param `type`
  *   - The kind or type of device.
  * @param note
  *   - Descriptive information, usage information or implantation information that is not captured in an existing element.
  * @param owner
  *   - An organization that is responsible for the provision and ongoing maintenance of the device.
  * @param status
  *   - Status of the Device availability.
  * @param safety
  *   - Provides additional safety characteristics about a medical device. For example devices containing latex.
  * @param parent
  *   - The parent device.
  * @param patient
  *   - Patient information, If the device is affixed to a person.
  * @param contact
  *   - Contact details for an organization or a particular human that is responsible for the device.
  * @param language
  *   - The base language in which the resource is written.
  * @param location
  *   - The place where the device can be found.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param lotNumber
  *   - Lot number assigned by the manufacturer.
  * @param identifier
  *   - Unique instance identifiers assigned to a device by manufacturers other organizations or owners.
  * @param definition
  *   - The reference to the definition for the device.
  * @param partNumber
  *   - The part number of the device.
  * @param modelNumber
  *   - The model number for the device.
  * @param statusReason
  *   - Reason for the dtatus of the Device availability.
  * @param manufacturer
  *   - A name of the manufacturer.
  * @param serialNumber
  *   - The serial number assigned by the organization when the device was manufactured.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param expirationDate
  *   - The date and time beyond which this device is no longer valid or should not be used (if applicable).
  * @param manufactureDate
  *   - The date and time when the device was manufactured.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *   the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually
  *   modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict
  *   set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param distinctIdentifier
  *   - The distinct identification string as required by regulation for a human cell, tissue, or cellular and tissue-based
  *   product.
  * @param version
  *   - The actual design of the device or software version running on the device.
  * @param property
  *   - The actual configuration settings of a device as it actually operates, e.g., regulation status, time properties.
  * @param udiCarrier
  *   - Unique device identifier (UDI) assigned to device label or package. Note that the Device may include multiple udiCarriers
  *   as it either may include just the udiCarrier for the jurisdiction it is sold, or for multiple jurisdictions it could have
  *   been sold.
  * @param deviceName
  *   - This represents the manufacturer's name of the device as provided by the device, from a UDI label, or by a person
  *   describing the Device. This typically would be used when a person provides the name(s) or when the device represents one of
  *   the names available from DeviceDefinition.
  * @param specialization
  *   - The capabilities supported on a device, the standards to which the device conforms for a particular purpose, and used for
  *   the communication.
  */
@POJOBoilerplate
class Us_core_implantable_device(
    override val id: Option[String] = None,
    override val url: Option[UriStr] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("http://hl7.org/fhir/us/core/StructureDefinition/us-core-implantable-device"))),
    override val text: Option[Narrative] = None,
    `type`: CodeableConcept,
    override val note: LitSeq[Annotation] = LitSeq.empty,
    override val owner: Option[Reference] = None,
    override val status: Option[DEVICE_STATUS] = None,
    override val safety: LitSeq[CodeableConcept] = LitSeq.empty,
    override val parent: Option[Reference] = None,
    patient: Reference,
    override val contact: LitSeq[ContactPoint] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    override val location: Option[Reference] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val lotNumber: Option[String] = None,
    override val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val definition: Option[Reference] = None,
    override val partNumber: Option[String] = None,
    override val modelNumber: Option[String] = None,
    override val statusReason: LitSeq[CodeableConcept] = LitSeq.empty,
    override val manufacturer: Option[String] = None,
    override val serialNumber: Option[String] = None,
    override val implicitRules: Option[UriStr] = None,
    override val expirationDate: Option[FHIRDateTime] = None,
    override val manufactureDate: Option[FHIRDateTime] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val distinctIdentifier: Option[String] = None,
    override val version: LitSeq[Device.Version] = LitSeq.empty,
    override val property: LitSeq[Device.Property] = LitSeq.empty,
    udiCarrier: Option[Device.UdiCarrier] = None,
    override val deviceName: LitSeq[Device.DeviceName] = LitSeq.empty,
    override val specialization: LitSeq[Device.Specialization] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Device(
      id = id,
      url = url,
      meta = meta,
      text = text,
      `type` = Some(`type`),
      note = note,
      owner = owner,
      status = status,
      safety = safety,
      parent = parent,
      patient = Some(patient),
      contact = contact,
      language = language,
      location = location,
      contained = contained,
      extension = extension,
      lotNumber = lotNumber,
      identifier = identifier,
      definition = definition,
      partNumber = partNumber,
      modelNumber = modelNumber,
      statusReason = statusReason,
      manufacturer = manufacturer,
      serialNumber = serialNumber,
      implicitRules = implicitRules,
      expirationDate = expirationDate,
      manufactureDate = manufactureDate,
      modifierExtension = modifierExtension,
      distinctIdentifier = distinctIdentifier,
      version = version,
      property = property,
      udiCarrier = udiCarrier.to(LitSeq),
      deviceName = deviceName,
      specialization = specialization,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Device"
}
