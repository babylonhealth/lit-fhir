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
import com.babylonhealth.lit.hl7.{ DEVICE_STATUS, DEVICE_NAMETYPE, UDI_ENTRY_TYPE }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Device extends CompanionFor[Device] {
  override type ResourceType = Device
  override type ParentType   = Device
  override val baseType: CompanionFor[ResourceType] = Device
  override val parentType: CompanionFor[ParentType] = Device
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Device")
  object Specialization extends CompanionFor[Specialization] {
    override type ResourceType = Specialization
    override type ParentType   = Specialization
    override val parentType: CompanionFor[ResourceType] = Specialization
    def apply(
        id: Option[String] = None,
        version: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        systemType: CodeableConcept,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Specialization = new Specialization(
      id,
      version,
      extension,
      systemType,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Specialization): Option[(Option[String], Option[String], LitSeq[Extension], CodeableConcept, LitSeq[Extension])] =
      Some((o.id, o.version, o.extension, o.systemType, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val version: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("version", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val systemType: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("systemType", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, version, extension, systemType, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Specialization): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[String]](version, t.version),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[CodeableConcept](systemType, t.systemType),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Specialization] = this
    val thisName: String                       = "Specialization"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Specialization] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Specialization(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[String]]("version", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[CodeableConcept]("systemType", None),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Specialization(
      override val id: Option[String] = None,
      val version: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val systemType: CodeableConcept,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object DeviceName extends CompanionFor[DeviceName] {
    override type ResourceType = DeviceName
    override type ParentType   = DeviceName
    override val parentType: CompanionFor[ResourceType] = DeviceName
    def apply(
        id: Option[String] = None,
        name: String,
        `type`: DEVICE_NAMETYPE,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): DeviceName = new DeviceName(
      id,
      name,
      `type`,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: DeviceName): Option[(Option[String], String, DEVICE_NAMETYPE, LitSeq[Extension], LitSeq[Extension])] = Some(
      (o.id, o.name, o.`type`, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val name: FHIRComponentFieldMeta[String] =
      FHIRComponentFieldMeta("name", lTagOf[String], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[DEVICE_NAMETYPE] =
      FHIRComponentFieldMeta("type", lTagOf[DEVICE_NAMETYPE], false, lTagOf[DEVICE_NAMETYPE])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, name, `type`, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: DeviceName): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[String](name, t.name),
      FHIRComponentField[DEVICE_NAMETYPE](`type`, t.`type`),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[DeviceName] = this
    val thisName: String                   = "DeviceName"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[DeviceName] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new DeviceName(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[String]("name", None),
            cursor.decodeAs[DEVICE_NAMETYPE]("type", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class DeviceName(
      override val id: Option[String] = None,
      val name: String,
      val `type`: DEVICE_NAMETYPE,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object UdiCarrier extends CompanionFor[UdiCarrier] {
    override type ResourceType = UdiCarrier
    override type ParentType   = UdiCarrier
    override val parentType: CompanionFor[ResourceType] = UdiCarrier
    def apply(
        id: Option[String] = None,
        issuer: Option[UriStr] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        entryType: Option[UDI_ENTRY_TYPE] = None,
        carrierHRF: Option[String] = None,
        carrierAIDC: Option[Base64Binary] = None,
        jurisdiction: Option[UriStr] = None,
        deviceIdentifier: Option[String] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): UdiCarrier = new UdiCarrier(
      id,
      issuer,
      extension,
      entryType,
      carrierHRF,
      carrierAIDC,
      jurisdiction,
      deviceIdentifier,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: UdiCarrier): Option[(Option[String], Option[UriStr], LitSeq[Extension], Option[UDI_ENTRY_TYPE], Option[String], Option[Base64Binary], Option[UriStr], Option[String], LitSeq[Extension])] =
      Some(
        (
          o.id,
          o.issuer,
          o.extension,
          o.entryType,
          o.carrierHRF,
          o.carrierAIDC,
          o.jurisdiction,
          o.deviceIdentifier,
          o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val issuer: FHIRComponentFieldMeta[Option[UriStr]] =
      FHIRComponentFieldMeta("issuer", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val entryType: FHIRComponentFieldMeta[Option[UDI_ENTRY_TYPE]] =
      FHIRComponentFieldMeta("entryType", lTagOf[Option[UDI_ENTRY_TYPE]], false, lTagOf[UDI_ENTRY_TYPE])
    val carrierHRF: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("carrierHRF", lTagOf[Option[String]], false, lTagOf[String])
    val carrierAIDC: FHIRComponentFieldMeta[Option[Base64Binary]] =
      FHIRComponentFieldMeta("carrierAIDC", lTagOf[Option[Base64Binary]], false, lTagOf[Base64Binary])
    val jurisdiction: FHIRComponentFieldMeta[Option[UriStr]] =
      FHIRComponentFieldMeta("jurisdiction", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
    val deviceIdentifier: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("deviceIdentifier", lTagOf[Option[String]], false, lTagOf[String])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, issuer, extension, entryType, carrierHRF, carrierAIDC, jurisdiction, deviceIdentifier, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: UdiCarrier): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[UriStr]](issuer, t.issuer),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[UDI_ENTRY_TYPE]](entryType, t.entryType),
      FHIRComponentField[Option[String]](carrierHRF, t.carrierHRF),
      FHIRComponentField[Option[Base64Binary]](carrierAIDC, t.carrierAIDC),
      FHIRComponentField[Option[UriStr]](jurisdiction, t.jurisdiction),
      FHIRComponentField[Option[String]](deviceIdentifier, t.deviceIdentifier),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[UdiCarrier] = this
    val thisName: String                   = "UdiCarrier"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[UdiCarrier] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new UdiCarrier(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[UriStr]]("issuer", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[UDI_ENTRY_TYPE]]("entryType", Some(None)),
            cursor.decodeAs[Option[String]]("carrierHRF", Some(None)),
            cursor.decodeAs[Option[Base64Binary]]("carrierAIDC", Some(None)),
            cursor.decodeAs[Option[UriStr]]("jurisdiction", Some(None)),
            cursor.decodeAs[Option[String]]("deviceIdentifier", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class UdiCarrier(
      override val id: Option[String] = None,
      val issuer: Option[UriStr] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val entryType: Option[UDI_ENTRY_TYPE] = None,
      val carrierHRF: Option[String] = None,
      val carrierAIDC: Option[Base64Binary] = None,
      val jurisdiction: Option[UriStr] = None,
      val deviceIdentifier: Option[String] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Property extends CompanionFor[Property] {
    override type ResourceType = Property
    override type ParentType   = Property
    override val parentType: CompanionFor[ResourceType] = Property
    def apply(
        id: Option[String] = None,
        `type`: CodeableConcept,
        extension: LitSeq[Extension] = LitSeq.empty,
        valueCode: LitSeq[CodeableConcept] = LitSeq.empty,
        valueQuantity: LitSeq[Quantity] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Property = new Property(
      id,
      `type`,
      extension,
      valueCode,
      valueQuantity,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Property): Option[(Option[String], CodeableConcept, LitSeq[Extension], LitSeq[CodeableConcept], LitSeq[Quantity], LitSeq[Extension])] =
      Some((o.id, o.`type`, o.extension, o.valueCode, o.valueQuantity, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("type", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val valueCode: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("valueCode", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val valueQuantity: FHIRComponentFieldMeta[LitSeq[Quantity]] =
      FHIRComponentFieldMeta("valueQuantity", lTagOf[LitSeq[Quantity]], false, lTagOf[Quantity])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, `type`, extension, valueCode, valueQuantity, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Property): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[CodeableConcept](`type`, t.`type`),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[CodeableConcept]](valueCode, t.valueCode),
      FHIRComponentField[LitSeq[Quantity]](valueQuantity, t.valueQuantity),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Property] = this
    val thisName: String                 = "Property"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Property] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Property(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[CodeableConcept]("type", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("valueCode", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Quantity]]("valueQuantity", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Property(
      override val id: Option[String] = None,
      val `type`: CodeableConcept,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val valueCode: LitSeq[CodeableConcept] = LitSeq.empty,
      val valueQuantity: LitSeq[Quantity] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Version extends CompanionFor[Version] {
    override type ResourceType = Version
    override type ParentType   = Version
    override val parentType: CompanionFor[ResourceType] = Version
    def apply(
        id: Option[String] = None,
        `type`: Option[CodeableConcept] = None,
        value: String,
        extension: LitSeq[Extension] = LitSeq.empty,
        component: Option[Identifier] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Version = new Version(
      id,
      `type`,
      value,
      extension,
      component,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Version): Option[(Option[String], Option[CodeableConcept], String, LitSeq[Extension], Option[Identifier], LitSeq[Extension])] =
      Some((o.id, o.`type`, o.value, o.extension, o.component, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val value: FHIRComponentFieldMeta[String] =
      FHIRComponentFieldMeta("value", lTagOf[String], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val component: FHIRComponentFieldMeta[Option[Identifier]] =
      FHIRComponentFieldMeta("component", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, `type`, value, extension, component, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Version): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[String](value, t.value),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Identifier]](component, t.component),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Version] = this
    val thisName: String                = "Version"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Version] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Version(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
            cursor.decodeAs[String]("value", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Identifier]]("component", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Version(
      override val id: Option[String] = None,
      val `type`: Option[CodeableConcept] = None,
      val value: String,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val component: Option[Identifier] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      url: Option[UriStr] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      `type`: Option[CodeableConcept] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      owner: Option[Reference] = None,
      status: Option[DEVICE_STATUS] = None,
      safety: LitSeq[CodeableConcept] = LitSeq.empty,
      parent: Option[Reference] = None,
      patient: Option[Reference] = None,
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
      udiCarrier: LitSeq[Device.UdiCarrier] = LitSeq.empty,
      deviceName: LitSeq[Device.DeviceName] = LitSeq.empty,
      specialization: LitSeq[Device.Specialization] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Device = new Device(
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
  val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
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
  val patient: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("patient", lTagOf[Option[Reference]], false, lTagOf[Reference])
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
  val udiCarrier: FHIRComponentFieldMeta[LitSeq[Device.UdiCarrier]] =
    FHIRComponentFieldMeta("udiCarrier", lTagOf[LitSeq[Device.UdiCarrier]], false, lTagOf[Device.UdiCarrier])
  val deviceName: FHIRComponentFieldMeta[LitSeq[Device.DeviceName]] =
    FHIRComponentFieldMeta("deviceName", lTagOf[LitSeq[Device.DeviceName]], false, lTagOf[Device.DeviceName])
  val specialization: FHIRComponentFieldMeta[LitSeq[Device.Specialization]] =
    FHIRComponentFieldMeta(
      "specialization",
      lTagOf[LitSeq[Device.Specialization]],
      false,
      lTagOf[Device.Specialization])
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
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Device): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[UriStr]](url, t.url),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
    FHIRComponentField[LitSeq[Annotation]](note, t.note),
    FHIRComponentField[Option[Reference]](owner, t.owner),
    FHIRComponentField[Option[DEVICE_STATUS]](status, t.status),
    FHIRComponentField[LitSeq[CodeableConcept]](safety, t.safety),
    FHIRComponentField[Option[Reference]](parent, t.parent),
    FHIRComponentField[Option[Reference]](patient, t.patient),
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
    FHIRComponentField[LitSeq[Device.UdiCarrier]](udiCarrier, t.udiCarrier),
    FHIRComponentField[LitSeq[Device.DeviceName]](deviceName, t.deviceName),
    FHIRComponentField[LitSeq[Device.Specialization]](specialization, t.specialization)
  )
  def extractId(t: Device): Option[String]                            = t.id
  def extractUrl(t: Device): Option[UriStr]                           = t.url
  def extractMeta(t: Device): Option[Meta]                            = t.meta
  def extractText(t: Device): Option[Narrative]                       = t.text
  def extractType(t: Device): Option[CodeableConcept]                 = t.`type`
  def extractNote(t: Device): LitSeq[Annotation]                      = t.note
  def extractOwner(t: Device): Option[Reference]                      = t.owner
  def extractStatus(t: Device): Option[DEVICE_STATUS]                 = t.status
  def extractSafety(t: Device): LitSeq[CodeableConcept]               = t.safety
  def extractParent(t: Device): Option[Reference]                     = t.parent
  def extractPatient(t: Device): Option[Reference]                    = t.patient
  def extractContact(t: Device): LitSeq[ContactPoint]                 = t.contact
  def extractLanguage(t: Device): Option[LANGUAGES]                   = t.language
  def extractLocation(t: Device): Option[Reference]                   = t.location
  def extractContained(t: Device): LitSeq[Resource]                   = t.contained
  def extractExtension(t: Device): LitSeq[Extension]                  = t.extension
  def extractLotNumber(t: Device): Option[String]                     = t.lotNumber
  def extractIdentifier(t: Device): LitSeq[Identifier]                = t.identifier
  def extractDefinition(t: Device): Option[Reference]                 = t.definition
  def extractPartNumber(t: Device): Option[String]                    = t.partNumber
  def extractModelNumber(t: Device): Option[String]                   = t.modelNumber
  def extractStatusReason(t: Device): LitSeq[CodeableConcept]         = t.statusReason
  def extractManufacturer(t: Device): Option[String]                  = t.manufacturer
  def extractSerialNumber(t: Device): Option[String]                  = t.serialNumber
  def extractImplicitRules(t: Device): Option[UriStr]                 = t.implicitRules
  def extractExpirationDate(t: Device): Option[FHIRDateTime]          = t.expirationDate
  def extractManufactureDate(t: Device): Option[FHIRDateTime]         = t.manufactureDate
  def extractModifierExtension(t: Device): LitSeq[Extension]          = t.modifierExtension
  def extractDistinctIdentifier(t: Device): Option[String]            = t.distinctIdentifier
  def extractVersion(t: Device): LitSeq[Device.Version]               = t.version
  def extractProperty(t: Device): LitSeq[Device.Property]             = t.property
  def extractUdiCarrier(t: Device): LitSeq[Device.UdiCarrier]         = t.udiCarrier
  def extractDeviceName(t: Device): LitSeq[Device.DeviceName]         = t.deviceName
  def extractSpecialization(t: Device): LitSeq[Device.Specialization] = t.specialization
  override val thisName: String                                       = "Device"
  override val searchParams: Map[String, Device => Seq[Any]] = Map(
    "organization" -> (obj => obj.owner.toSeq),
    "status"       -> (obj => obj.status.toSeq),
    "udi-di"       -> (obj => obj.udiCarrier.flatMap(_.deviceIdentifier).toSeq),
    "din" -> (obj =>
      obj.extension.filter(_.url == "http://hl7.org/fhir/SearchParameter/device-extensions-Device-din").toSeq),
    "device-name" -> (obj =>
      obj.deviceName.map(_.name).toSeq ++
        obj.`type`.toSeq.flatMap(_.coding).flatMap(_.display).toSeq ++
        obj.`type`.flatMap(_.text).toSeq),
    "location"     -> (obj => obj.location.toSeq),
    "model"        -> (obj => obj.modelNumber.toSeq),
    "identifier"   -> (obj => obj.identifier.toSeq),
    "url"          -> (obj => obj.url.toSeq),
    "manufacturer" -> (obj => obj.manufacturer.toSeq),
    "type"         -> (obj => obj.`type`.toSeq),
    "udi-carrier"  -> (obj => obj.udiCarrier.flatMap(_.carrierHRF).toSeq),
    "patient"      -> (obj => obj.patient.toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Device] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Device(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[UriStr]]("url", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("owner", Some(None)),
          cursor.decodeAs[Option[DEVICE_STATUS]]("status", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("safety", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("parent", Some(None)),
          cursor.decodeAs[Option[Reference]]("patient", Some(None)),
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
          cursor.decodeAs[LitSeq[Device.UdiCarrier]]("udiCarrier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Device.DeviceName]]("deviceName", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Device.Specialization]]("specialization", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** A type of a manufactured item that is used in the provision of healthcare without being substantially changed through that activity. The device may be a medical or non-medical device.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields url, `type`, note, owner, status, safety, parent, patient, contact, location, lotNumber, identifier, definition, partNumber, modelNumber, statusReason, manufacturer, serialNumber, expirationDate, manufactureDate, distinctIdentifier, version, property, udiCarrier, deviceName, specialization.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param url - A network address on which the device may be contacted directly.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param `type` - The kind or type of device.
  * @param note - Descriptive information, usage information or implantation information that is not captured in an existing element.
  * @param owner - An organization that is responsible for the provision and ongoing maintenance of the device.
  * @param status - Status of the Device availability.
  * @param safety - Provides additional safety characteristics about a medical device.  For example devices containing latex.
  * @param parent - The parent device.
  * @param patient - Patient information, If the device is affixed to a person.
  * @param contact - Contact details for an organization or a particular human that is responsible for the device.
  * @param language - The base language in which the resource is written.
  * @param location - The place where the device can be found.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param lotNumber - Lot number assigned by the manufacturer.
  * @param identifier - Unique instance identifiers assigned to a device by manufacturers other organizations or owners.
  * @param definition - The reference to the definition for the device.
  * @param partNumber - The part number of the device.
  * @param modelNumber - The model number for the device.
  * @param statusReason - Reason for the dtatus of the Device availability.
  * @param manufacturer - A name of the manufacturer.
  * @param serialNumber - The serial number assigned by the organization when the device was manufactured.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param expirationDate - The date and time beyond which this device is no longer valid or should not be used (if applicable).
  * @param manufactureDate - The date and time when the device was manufactured.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param distinctIdentifier - The distinct identification string as required by regulation for a human cell, tissue, or cellular and tissue-based product.
  * @param version - The actual design of the device or software version running on the device.
  * @param property - The actual configuration settings of a device as it actually operates, e.g., regulation status, time properties.
  * @param udiCarrier - Unique device identifier (UDI) assigned to device label or package.  Note that the Device may include multiple udiCarriers as it either may include just the udiCarrier for the jurisdiction it is sold, or for multiple jurisdictions it could have been sold.
  * @param deviceName - This represents the manufacturer's name of the device as provided by the device, from a UDI label, or by a person describing the Device.  This typically would be used when a person provides the name(s) or when the device represents one of the names available from DeviceDefinition.
  * @param specialization - The capabilities supported on a  device, the standards to which the device conforms for a particular purpose, and used for the communication.
  */
@POJOBoilerplate
class Device(
    override val id: Option[String] = None,
    val url: Option[UriStr] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val `type`: Option[CodeableConcept] = None,
    val note: LitSeq[Annotation] = LitSeq.empty,
    val owner: Option[Reference] = None,
    val status: Option[DEVICE_STATUS] = None,
    val safety: LitSeq[CodeableConcept] = LitSeq.empty,
    val parent: Option[Reference] = None,
    val patient: Option[Reference] = None,
    val contact: LitSeq[ContactPoint] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    val location: Option[Reference] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val lotNumber: Option[String] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val definition: Option[Reference] = None,
    val partNumber: Option[String] = None,
    val modelNumber: Option[String] = None,
    val statusReason: LitSeq[CodeableConcept] = LitSeq.empty,
    val manufacturer: Option[String] = None,
    val serialNumber: Option[String] = None,
    override val implicitRules: Option[UriStr] = None,
    val expirationDate: Option[FHIRDateTime] = None,
    val manufactureDate: Option[FHIRDateTime] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val distinctIdentifier: Option[String] = None,
    val version: LitSeq[Device.Version] = LitSeq.empty,
    val property: LitSeq[Device.Property] = LitSeq.empty,
    val udiCarrier: LitSeq[Device.UdiCarrier] = LitSeq.empty,
    val deviceName: LitSeq[Device.DeviceName] = LitSeq.empty,
    val specialization: LitSeq[Device.Specialization] = LitSeq.empty,
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
  override val thisTypeName: String = "Device"
}
