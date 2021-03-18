package com.babylonhealth.lit.hl7.model

import java.time.{ LocalDate, LocalTime, ZonedDateTime }
import java.util.UUID

import scala.collection.immutable.TreeMap
import scala.util.Try

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
import com.babylonhealth.lit.hl7.DEVICE_NAMETYPE
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object DeviceDefinition extends CompanionFor[DeviceDefinition] {
  override val baseType: CompanionFor[DeviceDefinition] = DeviceDefinition
  override val profileUrl: Option[String]               = Some("http://hl7.org/fhir/StructureDefinition/DeviceDefinition")
  object UdiDeviceIdentifier extends CompanionFor[UdiDeviceIdentifier] {
    def apply(
        id: Option[String] = None,
        issuer: UriStr,
        extension: LitSeq[Extension] = LitSeq.empty,
        jurisdiction: UriStr,
        deviceIdentifier: String,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): UdiDeviceIdentifier = new UdiDeviceIdentifier(
      id,
      issuer,
      extension,
      jurisdiction,
      deviceIdentifier,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: UdiDeviceIdentifier): Option[(Option[String], UriStr, LitSeq[Extension], UriStr, String, LitSeq[Extension])] =
      Some((o.id, o.issuer, o.extension, o.jurisdiction, o.deviceIdentifier, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val issuer: FHIRComponentFieldMeta[UriStr] =
      FHIRComponentFieldMeta("issuer", lTagOf[UriStr], false, lTagOf[UriStr])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val jurisdiction: FHIRComponentFieldMeta[UriStr] =
      FHIRComponentFieldMeta("jurisdiction", lTagOf[UriStr], false, lTagOf[UriStr])
    val deviceIdentifier: FHIRComponentFieldMeta[String] =
      FHIRComponentFieldMeta("deviceIdentifier", lTagOf[String], false, lTagOf[String])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, issuer, extension, jurisdiction, deviceIdentifier, modifierExtension)
    override def fields(t: UdiDeviceIdentifier): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[UriStr](issuer, t.issuer),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[UriStr](jurisdiction, t.jurisdiction),
      FHIRComponentField[String](deviceIdentifier, t.deviceIdentifier),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[UdiDeviceIdentifier] = this
    val thisName: String                            = "UdiDeviceIdentifier"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[UdiDeviceIdentifier] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new UdiDeviceIdentifier(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[UriStr]("issuer", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[UriStr]("jurisdiction", None),
            cursor.decodeAs[String]("deviceIdentifier", None),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class UdiDeviceIdentifier(
      override val id: Option[String] = None,
      val issuer: UriStr,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val jurisdiction: UriStr,
      val deviceIdentifier: String,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Specialization extends CompanionFor[Specialization] {
    def apply(
        id: Option[String] = None,
        version: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        systemType: String,
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
        o: Specialization): Option[(Option[String], Option[String], LitSeq[Extension], String, LitSeq[Extension])] =
      Some((o.id, o.version, o.extension, o.systemType, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val version: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("version", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val systemType: FHIRComponentFieldMeta[String] =
      FHIRComponentFieldMeta("systemType", lTagOf[String], false, lTagOf[String])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, version, extension, systemType, modifierExtension)
    override def fields(t: Specialization): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[String]](version, t.version),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[String](systemType, t.systemType),
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
            cursor.decodeAs[String]("systemType", None),
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
      val systemType: String,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Material extends CompanionFor[Material] {
    def apply(
        id: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        substance: CodeableConcept,
        alternate: Option[Boolean] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        allergenicIndicator: Option[Boolean] = None,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Material = new Material(
      id,
      extension,
      substance,
      alternate,
      modifierExtension,
      allergenicIndicator,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Material): Option[(Option[String], LitSeq[Extension], CodeableConcept, Option[Boolean], LitSeq[Extension], Option[Boolean])] =
      Some((o.id, o.extension, o.substance, o.alternate, o.modifierExtension, o.allergenicIndicator))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val substance: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("substance", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val alternate: FHIRComponentFieldMeta[Option[Boolean]] =
      FHIRComponentFieldMeta("alternate", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val allergenicIndicator: FHIRComponentFieldMeta[Option[Boolean]] =
      FHIRComponentFieldMeta("allergenicIndicator", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, extension, substance, alternate, modifierExtension, allergenicIndicator)
    override def fields(t: Material): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[CodeableConcept](substance, t.substance),
      FHIRComponentField[Option[Boolean]](alternate, t.alternate),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[Boolean]](allergenicIndicator, t.allergenicIndicator)
    )
    val baseType: CompanionFor[Material] = this
    val thisName: String                 = "Material"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Material] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Material(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[CodeableConcept]("substance", None),
            cursor.decodeAs[Option[Boolean]]("alternate", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Boolean]]("allergenicIndicator", Some(None)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Material(
      override val id: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val substance: CodeableConcept,
      val alternate: Option[Boolean] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val allergenicIndicator: Option[Boolean] = None,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Capability extends CompanionFor[Capability] {
    def apply(
        id: Option[String] = None,
        `type`: CodeableConcept,
        extension: LitSeq[Extension] = LitSeq.empty,
        description: LitSeq[CodeableConcept] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Capability = new Capability(
      id,
      `type`,
      extension,
      description,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Capability): Option[(Option[String], CodeableConcept, LitSeq[Extension], LitSeq[CodeableConcept], LitSeq[Extension])] =
      Some((o.id, o.`type`, o.extension, o.description, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("type", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val description: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("description", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, `type`, extension, description, modifierExtension)
    override def fields(t: Capability): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[CodeableConcept](`type`, t.`type`),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[CodeableConcept]](description, t.description),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Capability] = this
    val thisName: String                   = "Capability"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Capability] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Capability(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[CodeableConcept]("type", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("description", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Capability(
      override val id: Option[String] = None,
      val `type`: CodeableConcept,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val description: LitSeq[CodeableConcept] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object DeviceName extends CompanionFor[DeviceName] {
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
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, name, `type`, extension, modifierExtension)
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
  object Property extends CompanionFor[Property] {
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
  type ManufacturerChoice = Choice[Union_1128709984]
  def apply(
      id: Option[String] = None,
      url: Option[UriStr] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      `type`: Option[CodeableConcept] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      owner: Option[Reference] = None,
      safety: LitSeq[CodeableConcept] = LitSeq.empty,
      version: LitSeq[String] = LitSeq.empty,
      contact: LitSeq[ContactPoint] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      quantity: Option[Quantity] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      modelNumber: Option[String] = None,
      languageCode: LitSeq[CodeableConcept] = LitSeq.empty,
      parentDevice: Option[Reference] = None,
      implicitRules: Option[UriStr] = None,
      manufacturer: Option[DeviceDefinition.ManufacturerChoice] = None,
      shelfLifeStorage: LitSeq[Choice["ProductShelfLife"]] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      onlineInformation: Option[UriStr] = None,
      physicalCharacteristics: Option[Choice["ProdCharacteristic"]] = None,
      property: LitSeq[DeviceDefinition.Property] = LitSeq.empty,
      deviceName: LitSeq[DeviceDefinition.DeviceName] = LitSeq.empty,
      capability: LitSeq[DeviceDefinition.Capability] = LitSeq.empty,
      material: LitSeq[DeviceDefinition.Material] = LitSeq.empty,
      specialization: LitSeq[DeviceDefinition.Specialization] = LitSeq.empty,
      udiDeviceIdentifier: LitSeq[DeviceDefinition.UdiDeviceIdentifier] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): DeviceDefinition = new DeviceDefinition(
    id,
    url,
    meta,
    text,
    `type`,
    note,
    owner,
    safety,
    version,
    contact,
    language,
    quantity,
    contained,
    extension,
    identifier,
    modelNumber,
    languageCode,
    parentDevice,
    implicitRules,
    manufacturer,
    shelfLifeStorage,
    modifierExtension,
    onlineInformation,
    physicalCharacteristics,
    property,
    deviceName,
    capability,
    material,
    specialization,
    udiDeviceIdentifier,
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
  val safety: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("safety", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val version: FHIRComponentFieldMeta[LitSeq[String]] =
    FHIRComponentFieldMeta("version", lTagOf[LitSeq[String]], false, lTagOf[String])
  val contact: FHIRComponentFieldMeta[LitSeq[ContactPoint]] =
    FHIRComponentFieldMeta("contact", lTagOf[LitSeq[ContactPoint]], false, lTagOf[ContactPoint])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val quantity: FHIRComponentFieldMeta[Option[Quantity]] =
    FHIRComponentFieldMeta("quantity", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val modelNumber: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("modelNumber", lTagOf[Option[String]], false, lTagOf[String])
  val languageCode: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("languageCode", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val parentDevice: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("parentDevice", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val manufacturer: FHIRComponentFieldMeta[Option[DeviceDefinition.ManufacturerChoice]] =
    FHIRComponentFieldMeta(
      "manufacturer",
      lTagOf[Option[DeviceDefinition.ManufacturerChoice]],
      true,
      lTagOf[Union_1128709984])
  val shelfLifeStorage: FHIRComponentFieldMeta[LitSeq[Choice["ProductShelfLife"]]] =
    FHIRComponentFieldMeta(
      "shelfLifeStorage",
      lTagOf[LitSeq[Choice["ProductShelfLife"]]],
      false,
      lTagOf[Choice["ProductShelfLife"]])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val onlineInformation: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("onlineInformation", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val physicalCharacteristics: FHIRComponentFieldMeta[Option[Choice["ProdCharacteristic"]]] =
    FHIRComponentFieldMeta(
      "physicalCharacteristics",
      lTagOf[Option[Choice["ProdCharacteristic"]]],
      false,
      lTagOf[Choice["ProdCharacteristic"]])
  val property: FHIRComponentFieldMeta[LitSeq[DeviceDefinition.Property]] =
    FHIRComponentFieldMeta(
      "property",
      lTagOf[LitSeq[DeviceDefinition.Property]],
      false,
      lTagOf[DeviceDefinition.Property])
  val deviceName: FHIRComponentFieldMeta[LitSeq[DeviceDefinition.DeviceName]] =
    FHIRComponentFieldMeta(
      "deviceName",
      lTagOf[LitSeq[DeviceDefinition.DeviceName]],
      false,
      lTagOf[DeviceDefinition.DeviceName])
  val capability: FHIRComponentFieldMeta[LitSeq[DeviceDefinition.Capability]] =
    FHIRComponentFieldMeta(
      "capability",
      lTagOf[LitSeq[DeviceDefinition.Capability]],
      false,
      lTagOf[DeviceDefinition.Capability])
  val material: FHIRComponentFieldMeta[LitSeq[DeviceDefinition.Material]] =
    FHIRComponentFieldMeta(
      "material",
      lTagOf[LitSeq[DeviceDefinition.Material]],
      false,
      lTagOf[DeviceDefinition.Material])
  val specialization: FHIRComponentFieldMeta[LitSeq[DeviceDefinition.Specialization]] =
    FHIRComponentFieldMeta(
      "specialization",
      lTagOf[LitSeq[DeviceDefinition.Specialization]],
      false,
      lTagOf[DeviceDefinition.Specialization])
  val udiDeviceIdentifier: FHIRComponentFieldMeta[LitSeq[DeviceDefinition.UdiDeviceIdentifier]] =
    FHIRComponentFieldMeta(
      "udiDeviceIdentifier",
      lTagOf[LitSeq[DeviceDefinition.UdiDeviceIdentifier]],
      false,
      lTagOf[DeviceDefinition.UdiDeviceIdentifier])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    url,
    meta,
    text,
    `type`,
    note,
    owner,
    safety,
    version,
    contact,
    language,
    quantity,
    contained,
    extension,
    identifier,
    modelNumber,
    languageCode,
    parentDevice,
    implicitRules,
    manufacturer,
    shelfLifeStorage,
    modifierExtension,
    onlineInformation,
    physicalCharacteristics,
    property,
    deviceName,
    capability,
    material,
    specialization,
    udiDeviceIdentifier
  )
  override def fields(t: DeviceDefinition): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[UriStr]](url, t.url),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
    FHIRComponentField[LitSeq[Annotation]](note, t.note),
    FHIRComponentField[Option[Reference]](owner, t.owner),
    FHIRComponentField[LitSeq[CodeableConcept]](safety, t.safety),
    FHIRComponentField[LitSeq[String]](version, t.version),
    FHIRComponentField[LitSeq[ContactPoint]](contact, t.contact),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Option[Quantity]](quantity, t.quantity),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[String]](modelNumber, t.modelNumber),
    FHIRComponentField[LitSeq[CodeableConcept]](languageCode, t.languageCode),
    FHIRComponentField[Option[Reference]](parentDevice, t.parentDevice),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[DeviceDefinition.ManufacturerChoice]](manufacturer, t.manufacturer),
    FHIRComponentField[LitSeq[Choice["ProductShelfLife"]]](shelfLifeStorage, t.shelfLifeStorage),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Option[UriStr]](onlineInformation, t.onlineInformation),
    FHIRComponentField[Option[Choice["ProdCharacteristic"]]](physicalCharacteristics, t.physicalCharacteristics),
    FHIRComponentField[LitSeq[DeviceDefinition.Property]](property, t.property),
    FHIRComponentField[LitSeq[DeviceDefinition.DeviceName]](deviceName, t.deviceName),
    FHIRComponentField[LitSeq[DeviceDefinition.Capability]](capability, t.capability),
    FHIRComponentField[LitSeq[DeviceDefinition.Material]](material, t.material),
    FHIRComponentField[LitSeq[DeviceDefinition.Specialization]](specialization, t.specialization),
    FHIRComponentField[LitSeq[DeviceDefinition.UdiDeviceIdentifier]](udiDeviceIdentifier, t.udiDeviceIdentifier)
  )
  def extractId(t: DeviceDefinition): Option[String]                                        = t.id
  def extractUrl(t: DeviceDefinition): Option[UriStr]                                       = t.url
  def extractMeta(t: DeviceDefinition): Option[Meta]                                        = t.meta
  def extractText(t: DeviceDefinition): Option[Narrative]                                   = t.text
  def extractType(t: DeviceDefinition): Option[CodeableConcept]                             = t.`type`
  def extractNote(t: DeviceDefinition): LitSeq[Annotation]                                  = t.note
  def extractOwner(t: DeviceDefinition): Option[Reference]                                  = t.owner
  def extractSafety(t: DeviceDefinition): LitSeq[CodeableConcept]                           = t.safety
  def extractVersion(t: DeviceDefinition): LitSeq[String]                                   = t.version
  def extractContact(t: DeviceDefinition): LitSeq[ContactPoint]                             = t.contact
  def extractLanguage(t: DeviceDefinition): Option[LANGUAGES]                               = t.language
  def extractQuantity(t: DeviceDefinition): Option[Quantity]                                = t.quantity
  def extractContained(t: DeviceDefinition): LitSeq[Resource]                               = t.contained
  def extractExtension(t: DeviceDefinition): LitSeq[Extension]                              = t.extension
  def extractIdentifier(t: DeviceDefinition): LitSeq[Identifier]                            = t.identifier
  def extractModelNumber(t: DeviceDefinition): Option[String]                               = t.modelNumber
  def extractLanguageCode(t: DeviceDefinition): LitSeq[CodeableConcept]                     = t.languageCode
  def extractParentDevice(t: DeviceDefinition): Option[Reference]                           = t.parentDevice
  def extractImplicitRules(t: DeviceDefinition): Option[UriStr]                             = t.implicitRules
  def extractManufacturer(t: DeviceDefinition): Option[DeviceDefinition.ManufacturerChoice] = t.manufacturer
  def extractShelfLifeStorage(t: DeviceDefinition): LitSeq[Choice["ProductShelfLife"]]      = t.shelfLifeStorage
  def extractModifierExtension(t: DeviceDefinition): LitSeq[Extension]                      = t.modifierExtension
  def extractOnlineInformation(t: DeviceDefinition): Option[UriStr]                         = t.onlineInformation
  def extractPhysicalCharacteristics(t: DeviceDefinition): Option[Choice["ProdCharacteristic"]] =
    t.physicalCharacteristics
  def extractProperty(t: DeviceDefinition): LitSeq[DeviceDefinition.Property]             = t.property
  def extractDeviceName(t: DeviceDefinition): LitSeq[DeviceDefinition.DeviceName]         = t.deviceName
  def extractCapability(t: DeviceDefinition): LitSeq[DeviceDefinition.Capability]         = t.capability
  def extractMaterial(t: DeviceDefinition): LitSeq[DeviceDefinition.Material]             = t.material
  def extractSpecialization(t: DeviceDefinition): LitSeq[DeviceDefinition.Specialization] = t.specialization
  def extractUdiDeviceIdentifier(t: DeviceDefinition): LitSeq[DeviceDefinition.UdiDeviceIdentifier] =
    t.udiDeviceIdentifier
  override val thisName: String = "DeviceDefinition"
  override val searchParams: Map[String, DeviceDefinition => Seq[Any]] = Map(
    "identifier" -> (obj => obj.identifier.toSeq),
    "parent"     -> (obj => obj.parentDevice.toSeq),
    "type"       -> (obj => obj.`type`.toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[DeviceDefinition] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new DeviceDefinition(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[UriStr]]("url", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("owner", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("safety", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[String]]("version", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[ContactPoint]]("contact", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[Quantity]]("quantity", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("modelNumber", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("languageCode", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("parentDevice", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeOptRef[Union_1128709984]("manufacturer"),
          cursor.decodeAs[LitSeq[Choice["ProductShelfLife"]]]("shelfLifeStorage", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("onlineInformation", Some(None)),
          cursor.decodeAs[Option[Choice["ProdCharacteristic"]]]("physicalCharacteristics", Some(None)),
          cursor.decodeAs[LitSeq[DeviceDefinition.Property]]("property", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[DeviceDefinition.DeviceName]]("deviceName", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[DeviceDefinition.Capability]]("capability", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[DeviceDefinition.Material]]("material", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[DeviceDefinition.Specialization]]("specialization", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[DeviceDefinition.UdiDeviceIdentifier]]("udiDeviceIdentifier", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** The characteristics, operational status and capabilities of a medical-related component of a medical device.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields url, `type`, note, owner, safety, version, contact, quantity, identifier, modelNumber, languageCode, parentDevice, manufacturer, shelfLifeStorage, onlineInformation, physicalCharacteristics, property, deviceName, capability, material, specialization, udiDeviceIdentifier.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param url - A network address on which the device may be contacted directly.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param `type` - What kind of device or device system this is.
  * @param note - Descriptive information, usage information or implantation information that is not captured in an existing element.
  * @param owner - An organization that is responsible for the provision and ongoing maintenance of the device.
  * @param safety - Safety characteristics of the device.
  * @param version - The available versions of the device, e.g., software versions.
  * @param contact - Contact details for an organization or a particular human that is responsible for the device.
  * @param language - The base language in which the resource is written.
  * @param quantity - The quantity of the device present in the packaging (e.g. the number of devices present in a pack, or the number of devices in the same package of the medicinal product).
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param identifier - Unique instance identifiers assigned to a device by the software, manufacturers, other organizations or owners. For example: handle ID.
  * @param modelNumber - The model number for the device.
  * @param languageCode - Language code for the human-readable text strings produced by the device (all supported).
  * @param parentDevice - The parent device it can be part of.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param manufacturer - A name of the manufacturer.
  * @param shelfLifeStorage - Shelf Life and storage information.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param onlineInformation - Access to on-line information about the device.
  * @param physicalCharacteristics - Dimensions, color etc.
  * @param property - The actual configuration settings of a device as it actually operates, e.g., regulation status, time properties.
  * @param deviceName - A name given to the device to identify it.
  * @param capability - Device capabilities.
  * @param material - A substance used to create the material(s) of which the device is made.
  * @param specialization - The capabilities supported on a  device, the standards to which the device conforms for a particular purpose, and used for the communication.
  * @param udiDeviceIdentifier - Unique device identifier (UDI) assigned to device label or package.  Note that the Device may include multiple udiCarriers as it either may include just the udiCarrier for the jurisdiction it is sold, or for multiple jurisdictions it could have been sold.
  */
@POJOBoilerplate
class DeviceDefinition(
    override val id: Option[String] = None,
    val url: Option[UriStr] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val `type`: Option[CodeableConcept] = None,
    val note: LitSeq[Annotation] = LitSeq.empty,
    val owner: Option[Reference] = None,
    val safety: LitSeq[CodeableConcept] = LitSeq.empty,
    val version: LitSeq[String] = LitSeq.empty,
    val contact: LitSeq[ContactPoint] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    val quantity: Option[Quantity] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val modelNumber: Option[String] = None,
    val languageCode: LitSeq[CodeableConcept] = LitSeq.empty,
    val parentDevice: Option[Reference] = None,
    override val implicitRules: Option[UriStr] = None,
    val manufacturer: Option[DeviceDefinition.ManufacturerChoice] = None,
    val shelfLifeStorage: LitSeq[Choice["ProductShelfLife"]] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val onlineInformation: Option[UriStr] = None,
    val physicalCharacteristics: Option[Choice["ProdCharacteristic"]] = None,
    val property: LitSeq[DeviceDefinition.Property] = LitSeq.empty,
    val deviceName: LitSeq[DeviceDefinition.DeviceName] = LitSeq.empty,
    val capability: LitSeq[DeviceDefinition.Capability] = LitSeq.empty,
    val material: LitSeq[DeviceDefinition.Material] = LitSeq.empty,
    val specialization: LitSeq[DeviceDefinition.Specialization] = LitSeq.empty,
    val udiDeviceIdentifier: LitSeq[DeviceDefinition.UdiDeviceIdentifier] = LitSeq.empty,
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
  override val thisTypeName: String = "DeviceDefinition"
}
