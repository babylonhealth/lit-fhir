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
import com.babylonhealth.lit.hl7.{ PUBLICATION_STATUS, RELATION_TYPE }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object CatalogEntry extends CompanionFor[CatalogEntry] {
  override val baseType: CompanionFor[CatalogEntry] = CatalogEntry
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/CatalogEntry")
  object RelatedEntry extends CompanionFor[RelatedEntry] {
    def apply(
        id: Option[String] = None,
        item: Reference,
        extension: LitSeq[Extension] = LitSeq.empty,
        relationtype: RELATION_TYPE,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): RelatedEntry = new RelatedEntry(
      id,
      item,
      extension,
      relationtype,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: RelatedEntry): Option[(Option[String], Reference, LitSeq[Extension], RELATION_TYPE, LitSeq[Extension])] =
      Some((o.id, o.item, o.extension, o.relationtype, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val item: FHIRComponentFieldMeta[Reference] =
      FHIRComponentFieldMeta("item", lTagOf[Reference], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val relationtype: FHIRComponentFieldMeta[RELATION_TYPE] =
      FHIRComponentFieldMeta("relationtype", lTagOf[RELATION_TYPE], false, lTagOf[RELATION_TYPE])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, item, extension, relationtype, modifierExtension)
    override def fields(t: RelatedEntry): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Reference](item, t.item),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[RELATION_TYPE](relationtype, t.relationtype),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[RelatedEntry] = this
    val thisName: String                     = "RelatedEntry"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[RelatedEntry] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new RelatedEntry(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Reference]("item", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[RELATION_TYPE]("relationtype", None),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class RelatedEntry(
      override val id: Option[String] = None,
      val item: Reference,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val relationtype: RELATION_TYPE,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      `type`: Option[CodeableConcept] = None,
      status: Option[PUBLICATION_STATUS] = None,
      validTo: Option[FHIRDateTime] = None,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      orderable: Boolean,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      lastUpdated: Option[FHIRDateTime] = None,
      implicitRules: Option[UriStr] = None,
      referencedItem: Reference,
      classification: LitSeq[CodeableConcept] = LitSeq.empty,
      validityPeriod: Option[Period] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      additionalIdentifier: LitSeq[Identifier] = LitSeq.empty,
      additionalCharacteristic: LitSeq[CodeableConcept] = LitSeq.empty,
      additionalClassification: LitSeq[CodeableConcept] = LitSeq.empty,
      relatedEntry: LitSeq[CatalogEntry.RelatedEntry] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): CatalogEntry = new CatalogEntry(
    id,
    meta,
    text,
    `type`,
    status,
    validTo,
    language,
    contained,
    extension,
    orderable,
    identifier,
    lastUpdated,
    implicitRules,
    referencedItem,
    classification,
    validityPeriod,
    modifierExtension,
    additionalIdentifier,
    additionalCharacteristic,
    additionalClassification,
    relatedEntry,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val status: FHIRComponentFieldMeta[Option[PUBLICATION_STATUS]] =
    FHIRComponentFieldMeta("status", lTagOf[Option[PUBLICATION_STATUS]], false, lTagOf[PUBLICATION_STATUS])
  val validTo: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("validTo", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val orderable: FHIRComponentFieldMeta[Boolean] =
    FHIRComponentFieldMeta("orderable", lTagOf[Boolean], false, lTagOf[Boolean])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val lastUpdated: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("lastUpdated", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val referencedItem: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("referencedItem", lTagOf[Reference], false, lTagOf[Reference])
  val classification: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("classification", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val validityPeriod: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("validityPeriod", lTagOf[Option[Period]], false, lTagOf[Period])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val additionalIdentifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("additionalIdentifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val additionalCharacteristic: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("additionalCharacteristic", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val additionalClassification: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("additionalClassification", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val relatedEntry: FHIRComponentFieldMeta[LitSeq[CatalogEntry.RelatedEntry]] =
    FHIRComponentFieldMeta(
      "relatedEntry",
      lTagOf[LitSeq[CatalogEntry.RelatedEntry]],
      false,
      lTagOf[CatalogEntry.RelatedEntry])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    `type`,
    status,
    validTo,
    language,
    contained,
    extension,
    orderable,
    identifier,
    lastUpdated,
    implicitRules,
    referencedItem,
    classification,
    validityPeriod,
    modifierExtension,
    additionalIdentifier,
    additionalCharacteristic,
    additionalClassification,
    relatedEntry
  )
  override def fields(t: CatalogEntry): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
    FHIRComponentField[Option[PUBLICATION_STATUS]](status, t.status),
    FHIRComponentField[Option[FHIRDateTime]](validTo, t.validTo),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Boolean](orderable, t.orderable),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[FHIRDateTime]](lastUpdated, t.lastUpdated),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Reference](referencedItem, t.referencedItem),
    FHIRComponentField[LitSeq[CodeableConcept]](classification, t.classification),
    FHIRComponentField[Option[Period]](validityPeriod, t.validityPeriod),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[Identifier]](additionalIdentifier, t.additionalIdentifier),
    FHIRComponentField[LitSeq[CodeableConcept]](additionalCharacteristic, t.additionalCharacteristic),
    FHIRComponentField[LitSeq[CodeableConcept]](additionalClassification, t.additionalClassification),
    FHIRComponentField[LitSeq[CatalogEntry.RelatedEntry]](relatedEntry, t.relatedEntry)
  )
  def extractId(t: CatalogEntry): Option[String]                                = t.id
  def extractMeta(t: CatalogEntry): Option[Meta]                                = t.meta
  def extractText(t: CatalogEntry): Option[Narrative]                           = t.text
  def extractType(t: CatalogEntry): Option[CodeableConcept]                     = t.`type`
  def extractStatus(t: CatalogEntry): Option[PUBLICATION_STATUS]                = t.status
  def extractValidTo(t: CatalogEntry): Option[FHIRDateTime]                     = t.validTo
  def extractLanguage(t: CatalogEntry): Option[LANGUAGES]                       = t.language
  def extractContained(t: CatalogEntry): LitSeq[Resource]                       = t.contained
  def extractExtension(t: CatalogEntry): LitSeq[Extension]                      = t.extension
  def extractOrderable(t: CatalogEntry): Boolean                                = t.orderable
  def extractIdentifier(t: CatalogEntry): LitSeq[Identifier]                    = t.identifier
  def extractLastUpdated(t: CatalogEntry): Option[FHIRDateTime]                 = t.lastUpdated
  def extractImplicitRules(t: CatalogEntry): Option[UriStr]                     = t.implicitRules
  def extractReferencedItem(t: CatalogEntry): Reference                         = t.referencedItem
  def extractClassification(t: CatalogEntry): LitSeq[CodeableConcept]           = t.classification
  def extractValidityPeriod(t: CatalogEntry): Option[Period]                    = t.validityPeriod
  def extractModifierExtension(t: CatalogEntry): LitSeq[Extension]              = t.modifierExtension
  def extractAdditionalIdentifier(t: CatalogEntry): LitSeq[Identifier]          = t.additionalIdentifier
  def extractAdditionalCharacteristic(t: CatalogEntry): LitSeq[CodeableConcept] = t.additionalCharacteristic
  def extractAdditionalClassification(t: CatalogEntry): LitSeq[CodeableConcept] = t.additionalClassification
  def extractRelatedEntry(t: CatalogEntry): LitSeq[CatalogEntry.RelatedEntry]   = t.relatedEntry
  override val thisName: String                                                 = "CatalogEntry"
  def unapply(
      o: CatalogEntry): Option[(Option[String], Option[Meta], Option[Narrative], Option[CodeableConcept], Option[PUBLICATION_STATUS], Option[FHIRDateTime], Option[LANGUAGES], LitSeq[Resource], LitSeq[Extension], Boolean, LitSeq[Identifier], Option[FHIRDateTime], Option[UriStr], Reference, LitSeq[CodeableConcept], Option[Period], LitSeq[Extension], LitSeq[Identifier], LitSeq[CodeableConcept], LitSeq[CodeableConcept], LitSeq[CatalogEntry.RelatedEntry])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.`type`,
        o.status,
        o.validTo,
        o.language,
        o.contained,
        o.extension,
        o.orderable,
        o.identifier,
        o.lastUpdated,
        o.implicitRules,
        o.referencedItem,
        o.classification,
        o.validityPeriod,
        o.modifierExtension,
        o.additionalIdentifier,
        o.additionalCharacteristic,
        o.additionalClassification,
        o.relatedEntry))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[CatalogEntry] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new CatalogEntry(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
          cursor.decodeAs[Option[PUBLICATION_STATUS]]("status", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("validTo", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Boolean]("orderable", None),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[FHIRDateTime]]("lastUpdated", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Reference]("referencedItem", None),
          cursor.decodeAs[LitSeq[CodeableConcept]]("classification", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Period]]("validityPeriod", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("additionalIdentifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("additionalCharacteristic", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("additionalClassification", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CatalogEntry.RelatedEntry]]("relatedEntry", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Catalog entries are wrappers that contextualize items included in a catalog.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields `type`, status, validTo, orderable, identifier, lastUpdated, referencedItem, classification, validityPeriod, additionalIdentifier, additionalCharacteristic, additionalClassification, relatedEntry.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param `type` - The type of item - medication, device, service, protocol or other.
  * @param status - Used to support catalog exchange even for unsupported products, e.g. getting list of medications even if not prescribable.
  * @param validTo - The date until which this catalog entry is expected to be active.
  * @param language - The base language in which the resource is written.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param orderable - Whether the entry represents an orderable item.
  * @param identifier - Used in supporting different identifiers for the same product, e.g. manufacturer code and retailer code.
  * @param lastUpdated - Typically date of issue is different from the beginning of the validity. This can be used to see when an item was last updated.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param referencedItem - The item in a catalog or definition.
  * @param classification - Classes of devices, or ATC for medication.
  * @param validityPeriod - The time period in which this catalog entry is expected to be active.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param additionalIdentifier - Used in supporting related concepts, e.g. NDC to RxNorm.
  * @param additionalCharacteristic - Used for examplefor Out of Formulary, or any specifics.
  * @param additionalClassification - User for example for ATC classification, or.
  * @param relatedEntry - Used for example, to point to a substance, or to a device used to administer a medication.
  */
@POJOBoilerplate
class CatalogEntry(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val `type`: Option[CodeableConcept] = None,
    val status: Option[PUBLICATION_STATUS] = None,
    val validTo: Option[FHIRDateTime] = None,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val orderable: Boolean,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val lastUpdated: Option[FHIRDateTime] = None,
    override val implicitRules: Option[UriStr] = None,
    val referencedItem: Reference,
    val classification: LitSeq[CodeableConcept] = LitSeq.empty,
    val validityPeriod: Option[Period] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val additionalIdentifier: LitSeq[Identifier] = LitSeq.empty,
    val additionalCharacteristic: LitSeq[CodeableConcept] = LitSeq.empty,
    val additionalClassification: LitSeq[CodeableConcept] = LitSeq.empty,
    val relatedEntry: LitSeq[CatalogEntry.RelatedEntry] = LitSeq.empty,
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
  override val thisTypeName: String = "CatalogEntry"
}
