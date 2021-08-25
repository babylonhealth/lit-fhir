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

object CatalogEntry extends CompanionFor[CatalogEntry] {
  implicit def summonObjectAndCompanionCatalogEntry1867323470(
      o: CatalogEntry): ObjectAndCompanion[CatalogEntry, CatalogEntry.type] = ObjectAndCompanion(o, this)
  override type ResourceType = CatalogEntry
  override type ParentType   = CatalogEntry
  override val baseType: CompanionFor[ResourceType] = CatalogEntry
  override val parentType: CompanionFor[ParentType] = CatalogEntry
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/CatalogEntry")
  object RelatedEntry extends CompanionFor[RelatedEntry] {
    implicit def summonObjectAndCompanionRelatedEntry_2015205390(
        o: RelatedEntry): ObjectAndCompanion[RelatedEntry, RelatedEntry.type] = ObjectAndCompanion(o, this)
    override type ResourceType = RelatedEntry
    override type ParentType   = RelatedEntry
    override val parentType: CompanionFor[ResourceType] = RelatedEntry
    def apply(
        id: Option[String] = None,
        target: Reference,
        extension: LitSeq[Extension] = LitSeq.empty,
        relationship: Code,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): RelatedEntry = new RelatedEntry(
      id,
      target,
      extension,
      relationship,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(o: RelatedEntry): Option[(Option[String], Reference, LitSeq[Extension], Code, LitSeq[Extension])] = Some(
      (o.id, o.target, o.extension, o.relationship, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val target: FHIRComponentFieldMeta[Reference] =
      FHIRComponentFieldMeta("target", lTagOf[Reference], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val relationship: FHIRComponentFieldMeta[Code] =
      FHIRComponentFieldMeta("relationship", lTagOf[Code], false, lTagOf[Code])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, target, extension, relationship, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: RelatedEntry): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Reference](target, t.target),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Code](relationship, t.relationship),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[RelatedEntry] = this
    val thisName: String                     = "RelatedEntry"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[RelatedEntry] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new RelatedEntry(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Reference]("target", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Code]("relationship", None),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class RelatedEntry(
      override val id: Option[String] = None,
      val target: Reference,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val relationship: Code,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      name: Option[String] = None,
      `type`: Option[Code] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      status: Option[Code] = None,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      orderable: Boolean,
      updatedBy: Option[Reference] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      billingCode: LitSeq[CodeableConcept] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      referencedItem: Reference,
      billingSummary: Option[String] = None,
      effectivePeriod: Option[Period] = None,
      scheduleSummary: Option[String] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      estimatedDuration: Option[Duration] = None,
      limitationSummary: Option[String] = None,
      regulatorySummary: Option[String] = None,
      relatedEntry: LitSeq[CatalogEntry.RelatedEntry] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): CatalogEntry = new CatalogEntry(
    id,
    meta,
    text,
    name,
    `type`,
    note,
    status,
    language,
    contained,
    extension,
    orderable,
    updatedBy,
    identifier,
    billingCode,
    implicitRules,
    referencedItem,
    billingSummary,
    effectivePeriod,
    scheduleSummary,
    modifierExtension,
    estimatedDuration,
    limitationSummary,
    regulatorySummary,
    relatedEntry,
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
  val `type`: FHIRComponentFieldMeta[Option[Code]] =
    FHIRComponentFieldMeta("type", lTagOf[Option[Code]], false, lTagOf[Code])
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val status: FHIRComponentFieldMeta[Option[Code]] =
    FHIRComponentFieldMeta("status", lTagOf[Option[Code]], false, lTagOf[Code])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val orderable: FHIRComponentFieldMeta[Boolean] =
    FHIRComponentFieldMeta("orderable", lTagOf[Boolean], false, lTagOf[Boolean])
  val updatedBy: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("updatedBy", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val billingCode: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("billingCode", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val referencedItem: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("referencedItem", lTagOf[Reference], false, lTagOf[Reference])
  val billingSummary: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("billingSummary", lTagOf[Option[String]], false, lTagOf[String])
  val effectivePeriod: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("effectivePeriod", lTagOf[Option[Period]], false, lTagOf[Period])
  val scheduleSummary: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("scheduleSummary", lTagOf[Option[String]], false, lTagOf[String])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val estimatedDuration: FHIRComponentFieldMeta[Option[Duration]] =
    FHIRComponentFieldMeta("estimatedDuration", lTagOf[Option[Duration]], false, lTagOf[Duration])
  val limitationSummary: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("limitationSummary", lTagOf[Option[String]], false, lTagOf[String])
  val regulatorySummary: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("regulatorySummary", lTagOf[Option[String]], false, lTagOf[String])
  val relatedEntry: FHIRComponentFieldMeta[LitSeq[CatalogEntry.RelatedEntry]] =
    FHIRComponentFieldMeta("relatedEntry", lTagOf[LitSeq[CatalogEntry.RelatedEntry]], false, lTagOf[CatalogEntry.RelatedEntry])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    name,
    `type`,
    note,
    status,
    language,
    contained,
    extension,
    orderable,
    updatedBy,
    identifier,
    billingCode,
    implicitRules,
    referencedItem,
    billingSummary,
    effectivePeriod,
    scheduleSummary,
    modifierExtension,
    estimatedDuration,
    limitationSummary,
    regulatorySummary,
    relatedEntry
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: CatalogEntry): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[String]](name, t.name),
    FHIRComponentField[Option[Code]](`type`, t.`type`),
    FHIRComponentField[LitSeq[Annotation]](note, t.note),
    FHIRComponentField[Option[Code]](status, t.status),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Boolean](orderable, t.orderable),
    FHIRComponentField[Option[Reference]](updatedBy, t.updatedBy),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[LitSeq[CodeableConcept]](billingCode, t.billingCode),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Reference](referencedItem, t.referencedItem),
    FHIRComponentField[Option[String]](billingSummary, t.billingSummary),
    FHIRComponentField[Option[Period]](effectivePeriod, t.effectivePeriod),
    FHIRComponentField[Option[String]](scheduleSummary, t.scheduleSummary),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Option[Duration]](estimatedDuration, t.estimatedDuration),
    FHIRComponentField[Option[String]](limitationSummary, t.limitationSummary),
    FHIRComponentField[Option[String]](regulatorySummary, t.regulatorySummary),
    FHIRComponentField[LitSeq[CatalogEntry.RelatedEntry]](relatedEntry, t.relatedEntry)
  )
  def extractId(t: CatalogEntry): Option[String]                              = t.id
  def extractMeta(t: CatalogEntry): Option[Meta]                              = t.meta
  def extractText(t: CatalogEntry): Option[Narrative]                         = t.text
  def extractName(t: CatalogEntry): Option[String]                            = t.name
  def extractType(t: CatalogEntry): Option[Code]                              = t.`type`
  def extractNote(t: CatalogEntry): LitSeq[Annotation]                        = t.note
  def extractStatus(t: CatalogEntry): Option[Code]                            = t.status
  def extractLanguage(t: CatalogEntry): Option[LANGUAGES]                     = t.language
  def extractContained(t: CatalogEntry): LitSeq[Resource]                     = t.contained
  def extractExtension(t: CatalogEntry): LitSeq[Extension]                    = t.extension
  def extractOrderable(t: CatalogEntry): Boolean                              = t.orderable
  def extractUpdatedBy(t: CatalogEntry): Option[Reference]                    = t.updatedBy
  def extractIdentifier(t: CatalogEntry): LitSeq[Identifier]                  = t.identifier
  def extractBillingCode(t: CatalogEntry): LitSeq[CodeableConcept]            = t.billingCode
  def extractImplicitRules(t: CatalogEntry): Option[UriStr]                   = t.implicitRules
  def extractReferencedItem(t: CatalogEntry): Reference                       = t.referencedItem
  def extractBillingSummary(t: CatalogEntry): Option[String]                  = t.billingSummary
  def extractEffectivePeriod(t: CatalogEntry): Option[Period]                 = t.effectivePeriod
  def extractScheduleSummary(t: CatalogEntry): Option[String]                 = t.scheduleSummary
  def extractModifierExtension(t: CatalogEntry): LitSeq[Extension]            = t.modifierExtension
  def extractEstimatedDuration(t: CatalogEntry): Option[Duration]             = t.estimatedDuration
  def extractLimitationSummary(t: CatalogEntry): Option[String]               = t.limitationSummary
  def extractRegulatorySummary(t: CatalogEntry): Option[String]               = t.regulatorySummary
  def extractRelatedEntry(t: CatalogEntry): LitSeq[CatalogEntry.RelatedEntry] = t.relatedEntry
  override val thisName: String                                               = "CatalogEntry"
  override val searchParams: Map[String, CatalogEntry => Seq[Any]] = Map(
    "identifier"      -> (obj => obj.identifier.toSeq),
    "orderable"       -> (obj => Seq(obj.orderable)),
    "type"            -> (obj => obj.`type`.toSeq),
    "name"            -> (obj => obj.name.toSeq),
    "referenced-item" -> (obj => Seq(obj.referencedItem)),
    "related-entry"   -> (obj => obj.relatedEntry.map(_.target).toSeq),
    "status"          -> (obj => obj.status.toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[CatalogEntry] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new CatalogEntry(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[String]]("name", Some(None)),
          cursor.decodeAs[Option[Code]]("type", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Code]]("status", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Boolean]("orderable", None),
          cursor.decodeAs[Option[Reference]]("updatedBy", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("billingCode", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Reference]("referencedItem", None),
          cursor.decodeAs[Option[String]]("billingSummary", Some(None)),
          cursor.decodeAs[Option[Period]]("effectivePeriod", Some(None)),
          cursor.decodeAs[Option[String]]("scheduleSummary", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Duration]]("estimatedDuration", Some(None)),
          cursor.decodeAs[Option[String]]("limitationSummary", Some(None)),
          cursor.decodeAs[Option[String]]("regulatorySummary", Some(None)),
          cursor.decodeAs[LitSeq[CatalogEntry.RelatedEntry]]("relatedEntry", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Catalog entries are wrappers that contextualize items included in a catalog.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields name, `type`, note, status, orderable, updatedBy, identifier, billingCode, referencedItem,
  *   billingSummary, effectivePeriod, scheduleSummary, estimatedDuration, limitationSummary, regulatorySummary, relatedEntry.
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
  *   - The name of this catalog entry announces the item that is represented by the entry.
  * @param `type`
  *   - The type of resource that is represented by this catalog entry.
  * @param note
  *   - Notes and comments about this catalog entry.
  * @param status
  *   - Indicates whether this catalog entry is open to public usage (active) or not (draft or retired).
  * @param language
  *   - The base language in which the resource is written.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param orderable
  *   - Indicates whether or not the entry represents an item that is orderable.
  * @param updatedBy
  *   - Last actor who recorded (created or updated) this catalog entry.
  * @param identifier
  *   - Business identifier uniquely assigned to the catalog entry.
  * @param billingCode
  *   - Billing code associated to the item in the context of this entry of the catalog.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param referencedItem
  *   - The item (resource) that this entry of the catalog represents.
  * @param billingSummary
  *   - Billing summary attached to the item in the context of this entry of the catalog.
  * @param effectivePeriod
  *   - Period of usability of the catalog entry.
  * @param scheduleSummary
  *   - Schedule summary for the item in the context of this entry of the catalog.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *   the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually
  *   modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict
  *   set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param estimatedDuration
  *   - Estimated duration of the orderable item of this entry of the catalog.
  * @param limitationSummary
  *   - Summary of limitations for the item in the context of this entry of the catalog.
  * @param regulatorySummary
  *   - Regulatory summary for the item in the context of this entry of the catalog.
  * @param relatedEntry
  *   - Used for example, to point to a substance, or to a device used to administer a medication.
  */
@POJOBoilerplate
class CatalogEntry(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val name: Option[String] = None,
    val `type`: Option[Code] = None,
    val note: LitSeq[Annotation] = LitSeq.empty,
    val status: Option[Code] = None,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val orderable: Boolean,
    val updatedBy: Option[Reference] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val billingCode: LitSeq[CodeableConcept] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    val referencedItem: Reference,
    val billingSummary: Option[String] = None,
    val effectivePeriod: Option[Period] = None,
    val scheduleSummary: Option[String] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val estimatedDuration: Option[Duration] = None,
    val limitationSummary: Option[String] = None,
    val regulatorySummary: Option[String] = None,
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
