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

object MedicinalProductPackaged extends CompanionFor[MedicinalProductPackaged] {
  implicit def summonObjectAndCompanionMedicinalProductPackaged1078711308(
      o: MedicinalProductPackaged): ObjectAndCompanion[MedicinalProductPackaged, MedicinalProductPackaged.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = MedicinalProductPackaged
  override type ParentType   = MedicinalProductPackaged
  override val baseType: CompanionFor[ResourceType] = MedicinalProductPackaged
  override val parentType: CompanionFor[ParentType] = MedicinalProductPackaged
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/MedicinalProductPackaged")
  object PackageItem extends CompanionFor[PackageItem] {
    implicit def summonObjectAndCompanionPackageItem_1001812370(
        o: PackageItem): ObjectAndCompanion[PackageItem, PackageItem.type] = ObjectAndCompanion(o, this)
    override type ResourceType = PackageItem
    override type ParentType   = PackageItem
    override val parentType: CompanionFor[ResourceType] = PackageItem
    def apply(
        id: Option[String] = None,
        `type`: CodeableConcept,
        device: LitSeq[Reference] = LitSeq.empty,
        quantity: Quantity,
        material: LitSeq[CodeableConcept] = LitSeq.empty,
        extension: LitSeq[Extension] = LitSeq.empty,
        identifier: LitSeq[Identifier] = LitSeq.empty,
        packageItem: LitSeq[MedicinalProductPackaged.PackageItem] = LitSeq.empty,
        manufacturer: LitSeq[Reference] = LitSeq.empty,
        manufacturedItem: LitSeq[Reference] = LitSeq.empty,
        shelfLifeStorage: LitSeq[Choice["ProductShelfLife"]] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        alternateMaterial: LitSeq[CodeableConcept] = LitSeq.empty,
        otherCharacteristics: LitSeq[CodeableConcept] = LitSeq.empty,
        physicalCharacteristics: Option[Choice["ProdCharacteristic"]] = None,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): PackageItem = new PackageItem(
      id,
      `type`,
      device,
      quantity,
      material,
      extension,
      identifier,
      packageItem,
      manufacturer,
      manufacturedItem,
      shelfLifeStorage,
      modifierExtension,
      alternateMaterial,
      otherCharacteristics,
      physicalCharacteristics,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: PackageItem): Option[(Option[String], CodeableConcept, LitSeq[Reference], Quantity, LitSeq[CodeableConcept], LitSeq[Extension], LitSeq[Identifier], LitSeq[MedicinalProductPackaged.PackageItem], LitSeq[Reference], LitSeq[Reference], LitSeq[Choice["ProductShelfLife"]], LitSeq[Extension], LitSeq[CodeableConcept], LitSeq[CodeableConcept], Option[Choice["ProdCharacteristic"]])] =
      Some(
        (
          o.id,
          o.`type`,
          o.device,
          o.quantity,
          o.material,
          o.extension,
          o.identifier,
          o.packageItem,
          o.manufacturer,
          o.manufacturedItem,
          o.shelfLifeStorage,
          o.modifierExtension,
          o.alternateMaterial,
          o.otherCharacteristics,
          o.physicalCharacteristics))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("type", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val device: FHIRComponentFieldMeta[LitSeq[Reference]] =
      FHIRComponentFieldMeta("device", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
    val quantity: FHIRComponentFieldMeta[Quantity] =
      FHIRComponentFieldMeta("quantity", lTagOf[Quantity], false, lTagOf[Quantity])
    val material: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("material", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
      FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
    val packageItem: FHIRComponentFieldMeta[LitSeq[MedicinalProductPackaged.PackageItem]] =
      FHIRComponentFieldMeta(
        "packageItem",
        lTagOf[LitSeq[MedicinalProductPackaged.PackageItem]],
        false,
        lTagOf[MedicinalProductPackaged.PackageItem])
    val manufacturer: FHIRComponentFieldMeta[LitSeq[Reference]] =
      FHIRComponentFieldMeta("manufacturer", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
    val manufacturedItem: FHIRComponentFieldMeta[LitSeq[Reference]] =
      FHIRComponentFieldMeta("manufacturedItem", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
    val shelfLifeStorage: FHIRComponentFieldMeta[LitSeq[Choice["ProductShelfLife"]]] =
      FHIRComponentFieldMeta(
        "shelfLifeStorage",
        lTagOf[LitSeq[Choice["ProductShelfLife"]]],
        false,
        lTagOf[Choice["ProductShelfLife"]])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val alternateMaterial: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("alternateMaterial", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val otherCharacteristics: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("otherCharacteristics", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val physicalCharacteristics: FHIRComponentFieldMeta[Option[Choice["ProdCharacteristic"]]] =
      FHIRComponentFieldMeta(
        "physicalCharacteristics",
        lTagOf[Option[Choice["ProdCharacteristic"]]],
        false,
        lTagOf[Choice["ProdCharacteristic"]])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
      id,
      `type`,
      device,
      quantity,
      material,
      extension,
      identifier,
      packageItem,
      manufacturer,
      manufacturedItem,
      shelfLifeStorage,
      modifierExtension,
      alternateMaterial,
      otherCharacteristics,
      physicalCharacteristics
    )
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: PackageItem): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[CodeableConcept](`type`, t.`type`),
      FHIRComponentField[LitSeq[Reference]](device, t.device),
      FHIRComponentField[Quantity](quantity, t.quantity),
      FHIRComponentField[LitSeq[CodeableConcept]](material, t.material),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
      FHIRComponentField[LitSeq[MedicinalProductPackaged.PackageItem]](packageItem, t.packageItem),
      FHIRComponentField[LitSeq[Reference]](manufacturer, t.manufacturer),
      FHIRComponentField[LitSeq[Reference]](manufacturedItem, t.manufacturedItem),
      FHIRComponentField[LitSeq[Choice["ProductShelfLife"]]](shelfLifeStorage, t.shelfLifeStorage),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[CodeableConcept]](alternateMaterial, t.alternateMaterial),
      FHIRComponentField[LitSeq[CodeableConcept]](otherCharacteristics, t.otherCharacteristics),
      FHIRComponentField[Option[Choice["ProdCharacteristic"]]](physicalCharacteristics, t.physicalCharacteristics)
    )
    val baseType: CompanionFor[PackageItem] = this
    val thisName: String                    = "PackageItem"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[PackageItem] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new PackageItem(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[CodeableConcept]("type", None),
            cursor.decodeAs[LitSeq[Reference]]("device", Some(LitSeq.empty)),
            cursor.decodeAs[Quantity]("quantity", None),
            cursor.decodeAs[LitSeq[CodeableConcept]]("material", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[MedicinalProductPackaged.PackageItem]]("packageItem", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Reference]]("manufacturer", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Reference]]("manufacturedItem", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Choice["ProductShelfLife"]]]("shelfLifeStorage", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("alternateMaterial", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("otherCharacteristics", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Choice["ProdCharacteristic"]]]("physicalCharacteristics", Some(None)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class PackageItem(
      override val id: Option[String] = None,
      val `type`: CodeableConcept,
      val device: LitSeq[Reference] = LitSeq.empty,
      val quantity: Quantity,
      val material: LitSeq[CodeableConcept] = LitSeq.empty,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val identifier: LitSeq[Identifier] = LitSeq.empty,
      val packageItem: LitSeq[MedicinalProductPackaged.PackageItem] = LitSeq.empty,
      val manufacturer: LitSeq[Reference] = LitSeq.empty,
      val manufacturedItem: LitSeq[Reference] = LitSeq.empty,
      val shelfLifeStorage: LitSeq[Choice["ProductShelfLife"]] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val alternateMaterial: LitSeq[CodeableConcept] = LitSeq.empty,
      val otherCharacteristics: LitSeq[CodeableConcept] = LitSeq.empty,
      val physicalCharacteristics: Option[Choice["ProdCharacteristic"]] = None,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object BatchIdentifier extends CompanionFor[BatchIdentifier] {
    implicit def summonObjectAndCompanionBatchIdentifier_1001812370(
        o: BatchIdentifier): ObjectAndCompanion[BatchIdentifier, BatchIdentifier.type] = ObjectAndCompanion(o, this)
    override type ResourceType = BatchIdentifier
    override type ParentType   = BatchIdentifier
    override val parentType: CompanionFor[ResourceType] = BatchIdentifier
    def apply(
        id: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        outerPackaging: Identifier,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        immediatePackaging: Option[Identifier] = None,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): BatchIdentifier = new BatchIdentifier(
      id,
      extension,
      outerPackaging,
      modifierExtension,
      immediatePackaging,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: BatchIdentifier): Option[(Option[String], LitSeq[Extension], Identifier, LitSeq[Extension], Option[Identifier])] =
      Some((o.id, o.extension, o.outerPackaging, o.modifierExtension, o.immediatePackaging))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val outerPackaging: FHIRComponentFieldMeta[Identifier] =
      FHIRComponentFieldMeta("outerPackaging", lTagOf[Identifier], false, lTagOf[Identifier])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val immediatePackaging: FHIRComponentFieldMeta[Option[Identifier]] =
      FHIRComponentFieldMeta("immediatePackaging", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, extension, outerPackaging, modifierExtension, immediatePackaging)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: BatchIdentifier): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Identifier](outerPackaging, t.outerPackaging),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[Identifier]](immediatePackaging, t.immediatePackaging)
    )
    val baseType: CompanionFor[BatchIdentifier] = this
    val thisName: String                        = "BatchIdentifier"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[BatchIdentifier] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new BatchIdentifier(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Identifier]("outerPackaging", None),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Identifier]]("immediatePackaging", Some(None)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class BatchIdentifier(
      override val id: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val outerPackaging: Identifier,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val immediatePackaging: Option[Identifier] = None,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      subject: LitSeq[Reference] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      description: Option[String] = None,
      manufacturer: LitSeq[Reference] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      marketingStatus: LitSeq[Choice["MarketingStatus"]] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      legalStatusOfSupply: Option[CodeableConcept] = None,
      marketingAuthorization: Option[Reference] = None,
      batchIdentifier: LitSeq[MedicinalProductPackaged.BatchIdentifier] = LitSeq.empty,
      packageItem: NonEmptyLitSeq[MedicinalProductPackaged.PackageItem],
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): MedicinalProductPackaged = new MedicinalProductPackaged(
    id,
    meta,
    text,
    subject,
    language,
    contained,
    extension,
    identifier,
    description,
    manufacturer,
    implicitRules,
    marketingStatus,
    modifierExtension,
    legalStatusOfSupply,
    marketingAuthorization,
    batchIdentifier,
    packageItem,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val subject: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("subject", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val description: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
  val manufacturer: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("manufacturer", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val marketingStatus: FHIRComponentFieldMeta[LitSeq[Choice["MarketingStatus"]]] =
    FHIRComponentFieldMeta("marketingStatus", lTagOf[LitSeq[Choice["MarketingStatus"]]], false, lTagOf[Choice["MarketingStatus"]])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val legalStatusOfSupply: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("legalStatusOfSupply", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val marketingAuthorization: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("marketingAuthorization", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val batchIdentifier: FHIRComponentFieldMeta[LitSeq[MedicinalProductPackaged.BatchIdentifier]] =
    FHIRComponentFieldMeta(
      "batchIdentifier",
      lTagOf[LitSeq[MedicinalProductPackaged.BatchIdentifier]],
      false,
      lTagOf[MedicinalProductPackaged.BatchIdentifier])
  val packageItem: FHIRComponentFieldMeta[NonEmptyLitSeq[MedicinalProductPackaged.PackageItem]] =
    FHIRComponentFieldMeta(
      "packageItem",
      lTagOf[NonEmptyLitSeq[MedicinalProductPackaged.PackageItem]],
      false,
      lTagOf[MedicinalProductPackaged.PackageItem])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    subject,
    language,
    contained,
    extension,
    identifier,
    description,
    manufacturer,
    implicitRules,
    marketingStatus,
    modifierExtension,
    legalStatusOfSupply,
    marketingAuthorization,
    batchIdentifier,
    packageItem
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: MedicinalProductPackaged): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[LitSeq[Reference]](subject, t.subject),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[String]](description, t.description),
    FHIRComponentField[LitSeq[Reference]](manufacturer, t.manufacturer),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Choice["MarketingStatus"]]](marketingStatus, t.marketingStatus),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Option[CodeableConcept]](legalStatusOfSupply, t.legalStatusOfSupply),
    FHIRComponentField[Option[Reference]](marketingAuthorization, t.marketingAuthorization),
    FHIRComponentField[LitSeq[MedicinalProductPackaged.BatchIdentifier]](batchIdentifier, t.batchIdentifier),
    FHIRComponentField[NonEmptyLitSeq[MedicinalProductPackaged.PackageItem]](packageItem, t.packageItem)
  )
  def extractId(t: MedicinalProductPackaged): Option[String]                                 = t.id
  def extractMeta(t: MedicinalProductPackaged): Option[Meta]                                 = t.meta
  def extractText(t: MedicinalProductPackaged): Option[Narrative]                            = t.text
  def extractSubject(t: MedicinalProductPackaged): LitSeq[Reference]                         = t.subject
  def extractLanguage(t: MedicinalProductPackaged): Option[LANGUAGES]                        = t.language
  def extractContained(t: MedicinalProductPackaged): LitSeq[Resource]                        = t.contained
  def extractExtension(t: MedicinalProductPackaged): LitSeq[Extension]                       = t.extension
  def extractIdentifier(t: MedicinalProductPackaged): LitSeq[Identifier]                     = t.identifier
  def extractDescription(t: MedicinalProductPackaged): Option[String]                        = t.description
  def extractManufacturer(t: MedicinalProductPackaged): LitSeq[Reference]                    = t.manufacturer
  def extractImplicitRules(t: MedicinalProductPackaged): Option[UriStr]                      = t.implicitRules
  def extractMarketingStatus(t: MedicinalProductPackaged): LitSeq[Choice["MarketingStatus"]] = t.marketingStatus
  def extractModifierExtension(t: MedicinalProductPackaged): LitSeq[Extension]               = t.modifierExtension
  def extractLegalStatusOfSupply(t: MedicinalProductPackaged): Option[CodeableConcept]       = t.legalStatusOfSupply
  def extractMarketingAuthorization(t: MedicinalProductPackaged): Option[Reference]          = t.marketingAuthorization
  def extractBatchIdentifier(t: MedicinalProductPackaged): LitSeq[MedicinalProductPackaged.BatchIdentifier] = t.batchIdentifier
  def extractPackageItem(t: MedicinalProductPackaged): NonEmptyLitSeq[MedicinalProductPackaged.PackageItem] = t.packageItem
  override val thisName: String = "MedicinalProductPackaged"
  override val searchParams: Map[String, MedicinalProductPackaged => Seq[Any]] = Map(
    "identifier" -> (obj => obj.identifier.toSeq),
    "subject"    -> (obj => obj.subject.toSeq)
  )
  def unapply(
      o: MedicinalProductPackaged): Option[(Option[String], Option[Meta], Option[Narrative], LitSeq[Reference], Option[LANGUAGES], LitSeq[Resource], LitSeq[Extension], LitSeq[Identifier], Option[String], LitSeq[Reference], Option[UriStr], LitSeq[Choice["MarketingStatus"]], LitSeq[Extension], Option[CodeableConcept], Option[Reference], LitSeq[MedicinalProductPackaged.BatchIdentifier], NonEmptyLitSeq[MedicinalProductPackaged.PackageItem])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.subject,
        o.language,
        o.contained,
        o.extension,
        o.identifier,
        o.description,
        o.manufacturer,
        o.implicitRules,
        o.marketingStatus,
        o.modifierExtension,
        o.legalStatusOfSupply,
        o.marketingAuthorization,
        o.batchIdentifier,
        o.packageItem))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[MedicinalProductPackaged] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new MedicinalProductPackaged(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("subject", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("description", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("manufacturer", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Choice["MarketingStatus"]]]("marketingStatus", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("legalStatusOfSupply", Some(None)),
          cursor.decodeAs[Option[Reference]]("marketingAuthorization", Some(None)),
          cursor.decodeAs[LitSeq[MedicinalProductPackaged.BatchIdentifier]]("batchIdentifier", Some(LitSeq.empty)),
          cursor.decodeAs[NonEmptyLitSeq[MedicinalProductPackaged.PackageItem]]("packageItem", None),
          decodeAttributes(cursor)
        )
      ))
}

/** A medicinal product in a container or package.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields subject, identifier, description, manufacturer, marketingStatus, legalStatusOfSupply,
  *   marketingAuthorization, batchIdentifier, packageItem.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *     not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *     resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail
  *     to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should
  *     be represented in the narrative to ensure clinical safety.
  * @param subject
  *   - The product with this is a pack for.
  * @param language
  *   - The base language in which the resource is written.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *     identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *     of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *     Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *     of the extension.
  * @param identifier
  *   - Unique identifier.
  * @param description
  *   - Textual description.
  * @param manufacturer
  *   - Manufacturer of this Package Item.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *     processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *     other profiles etc.
  * @param marketingStatus
  *   - Marketing information.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *     the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *     Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *     strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *     extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *     processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of
  *     any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param legalStatusOfSupply
  *   - The legal status of supply of the medicinal product as classified by the regulator.
  * @param marketingAuthorization
  *   - Manufacturer of this Package Item.
  * @param batchIdentifier
  *   - Batch numbering.
  * @param packageItem
  *   - A packaging item, as a contained for medicine, possibly with other packaging items within.
  */
@POJOBoilerplate
class MedicinalProductPackaged(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val subject: LitSeq[Reference] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val description: Option[String] = None,
    val manufacturer: LitSeq[Reference] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    val marketingStatus: LitSeq[Choice["MarketingStatus"]] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val legalStatusOfSupply: Option[CodeableConcept] = None,
    val marketingAuthorization: Option[Reference] = None,
    val batchIdentifier: LitSeq[MedicinalProductPackaged.BatchIdentifier] = LitSeq.empty,
    val packageItem: NonEmptyLitSeq[MedicinalProductPackaged.PackageItem],
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
      primitiveAttributes = primitiveAttributes
    ) {
  override val thisTypeName: String = "MedicinalProductPackaged"
}
