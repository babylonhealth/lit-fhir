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
import com.babylonhealth.lit.hl7.SUPPLYDELIVERY_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object SupplyDelivery extends CompanionFor[SupplyDelivery] {
  implicit def summonObjectAndCompanionSupplyDelivery_1097491031(
      o: SupplyDelivery): ObjectAndCompanion[SupplyDelivery, SupplyDelivery.type] = ObjectAndCompanion(o, this)
  override type ResourceType = SupplyDelivery
  override type ParentType   = SupplyDelivery
  override val baseType: CompanionFor[ResourceType] = SupplyDelivery
  override val parentType: CompanionFor[ParentType] = SupplyDelivery
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/SupplyDelivery")
  object SuppliedItem extends CompanionFor[SuppliedItem] {
    implicit def summonObjectAndCompanionSuppliedItem_2132972385(
        o: SuppliedItem): ObjectAndCompanion[SuppliedItem, SuppliedItem.type] = ObjectAndCompanion(o, this)
    override type ResourceType = SuppliedItem
    override type ParentType   = SuppliedItem
    override val parentType: CompanionFor[ResourceType] = SuppliedItem
    type ItemChoice = Choice[Union01025009075]
    def apply(
        id: Option[String] = None,
        item: Option[SuppliedItem.ItemChoice] = None,
        quantity: Option[Quantity] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): SuppliedItem = new SuppliedItem(
      id,
      item,
      quantity,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: SuppliedItem): Option[(Option[String], Option[SuppliedItem.ItemChoice], Option[Quantity], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.item, o.quantity, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val item: FHIRComponentFieldMeta[Option[SuppliedItem.ItemChoice]] =
      FHIRComponentFieldMeta("item", lTagOf[Option[SuppliedItem.ItemChoice]], true, lTagOf[Union01025009075])
    val quantity: FHIRComponentFieldMeta[Option[Quantity]] =
      FHIRComponentFieldMeta("quantity", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, item, quantity, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: SuppliedItem): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[SuppliedItem.ItemChoice]](item, t.item),
      FHIRComponentField[Option[Quantity]](quantity, t.quantity),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[SuppliedItem] = this
    val thisName: String                     = "SuppliedItem"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[SuppliedItem] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new SuppliedItem(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeOptRef[Union01025009075]("item"),
            cursor.decodeAs[Option[Quantity]]("quantity", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class SuppliedItem(
      override val id: Option[String] = None,
      val item: Option[SuppliedItem.ItemChoice] = None,
      val quantity: Option[Quantity] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  type OccurrenceChoice = Choice[Union00609373412]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      `type`: Option[CodeableConcept] = None,
      partOf: LitSeq[Reference] = LitSeq.empty,
      status: Option[SUPPLYDELIVERY_STATUS] = None,
      basedOn: LitSeq[Reference] = LitSeq.empty,
      patient: Option[Reference] = None,
      language: Option[LANGUAGES] = None,
      supplier: Option[Reference] = None,
      receiver: LitSeq[Reference] = LitSeq.empty,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      destination: Option[Reference] = None,
      implicitRules: Option[UriStr] = None,
      occurrence: Option[SupplyDelivery.OccurrenceChoice] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      suppliedItem: Option[SupplyDelivery.SuppliedItem] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): SupplyDelivery = new SupplyDelivery(
    id,
    meta,
    text,
    `type`,
    partOf,
    status,
    basedOn,
    patient,
    language,
    supplier,
    receiver,
    contained,
    extension,
    identifier,
    destination,
    implicitRules,
    occurrence,
    modifierExtension,
    suppliedItem,
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
  val partOf: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("partOf", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val status: FHIRComponentFieldMeta[Option[SUPPLYDELIVERY_STATUS]] =
    FHIRComponentFieldMeta("status", lTagOf[Option[SUPPLYDELIVERY_STATUS]], false, lTagOf[SUPPLYDELIVERY_STATUS])
  val basedOn: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("basedOn", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val patient: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("patient", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val supplier: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("supplier", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val receiver: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("receiver", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val destination: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("destination", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val occurrence: FHIRComponentFieldMeta[Option[SupplyDelivery.OccurrenceChoice]] =
    FHIRComponentFieldMeta("occurrence", lTagOf[Option[SupplyDelivery.OccurrenceChoice]], true, lTagOf[Union00609373412])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val suppliedItem: FHIRComponentFieldMeta[Option[SupplyDelivery.SuppliedItem]] =
    FHIRComponentFieldMeta(
      "suppliedItem",
      lTagOf[Option[SupplyDelivery.SuppliedItem]],
      false,
      lTagOf[SupplyDelivery.SuppliedItem])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    `type`,
    partOf,
    status,
    basedOn,
    patient,
    language,
    supplier,
    receiver,
    contained,
    extension,
    identifier,
    destination,
    implicitRules,
    occurrence,
    modifierExtension,
    suppliedItem
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: SupplyDelivery): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
    FHIRComponentField[LitSeq[Reference]](partOf, t.partOf),
    FHIRComponentField[Option[SUPPLYDELIVERY_STATUS]](status, t.status),
    FHIRComponentField[LitSeq[Reference]](basedOn, t.basedOn),
    FHIRComponentField[Option[Reference]](patient, t.patient),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Option[Reference]](supplier, t.supplier),
    FHIRComponentField[LitSeq[Reference]](receiver, t.receiver),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[Reference]](destination, t.destination),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[SupplyDelivery.OccurrenceChoice]](occurrence, t.occurrence),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Option[SupplyDelivery.SuppliedItem]](suppliedItem, t.suppliedItem)
  )
  def extractId(t: SupplyDelivery): Option[String]                                  = t.id
  def extractMeta(t: SupplyDelivery): Option[Meta]                                  = t.meta
  def extractText(t: SupplyDelivery): Option[Narrative]                             = t.text
  def extractType(t: SupplyDelivery): Option[CodeableConcept]                       = t.`type`
  def extractPartOf(t: SupplyDelivery): LitSeq[Reference]                           = t.partOf
  def extractStatus(t: SupplyDelivery): Option[SUPPLYDELIVERY_STATUS]               = t.status
  def extractBasedOn(t: SupplyDelivery): LitSeq[Reference]                          = t.basedOn
  def extractPatient(t: SupplyDelivery): Option[Reference]                          = t.patient
  def extractLanguage(t: SupplyDelivery): Option[LANGUAGES]                         = t.language
  def extractSupplier(t: SupplyDelivery): Option[Reference]                         = t.supplier
  def extractReceiver(t: SupplyDelivery): LitSeq[Reference]                         = t.receiver
  def extractContained(t: SupplyDelivery): LitSeq[Resource]                         = t.contained
  def extractExtension(t: SupplyDelivery): LitSeq[Extension]                        = t.extension
  def extractIdentifier(t: SupplyDelivery): LitSeq[Identifier]                      = t.identifier
  def extractDestination(t: SupplyDelivery): Option[Reference]                      = t.destination
  def extractImplicitRules(t: SupplyDelivery): Option[UriStr]                       = t.implicitRules
  def extractOccurrence(t: SupplyDelivery): Option[SupplyDelivery.OccurrenceChoice] = t.occurrence
  def extractModifierExtension(t: SupplyDelivery): LitSeq[Extension]                = t.modifierExtension
  def extractSuppliedItem(t: SupplyDelivery): Option[SupplyDelivery.SuppliedItem]   = t.suppliedItem
  override val thisName: String                                                     = "SupplyDelivery"
  override val searchParams: Map[String, SupplyDelivery => Seq[Any]] = Map(
    "identifier" -> (obj => obj.identifier.toSeq),
    "receiver"   -> (obj => obj.receiver.toSeq),
    "supplier"   -> (obj => obj.supplier.toSeq),
    "status"     -> (obj => obj.status.toSeq),
    "patient"    -> (obj => obj.patient.toSeq)
  )
  def unapply(
      o: SupplyDelivery): Option[(Option[String], Option[Meta], Option[Narrative], Option[CodeableConcept], LitSeq[Reference], Option[SUPPLYDELIVERY_STATUS], LitSeq[Reference], Option[Reference], Option[LANGUAGES], Option[Reference], LitSeq[Reference], LitSeq[Resource], LitSeq[Extension], LitSeq[Identifier], Option[Reference], Option[UriStr], Option[SupplyDelivery.OccurrenceChoice], LitSeq[Extension], Option[SupplyDelivery.SuppliedItem])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.`type`,
        o.partOf,
        o.status,
        o.basedOn,
        o.patient,
        o.language,
        o.supplier,
        o.receiver,
        o.contained,
        o.extension,
        o.identifier,
        o.destination,
        o.implicitRules,
        o.occurrence,
        o.modifierExtension,
        o.suppliedItem))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[SupplyDelivery] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new SupplyDelivery(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("partOf", Some(LitSeq.empty)),
          cursor.decodeAs[Option[SUPPLYDELIVERY_STATUS]]("status", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("basedOn", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("patient", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[Reference]]("supplier", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("receiver", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("destination", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeOptRef[Union00609373412]("occurrence"),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[SupplyDelivery.SuppliedItem]]("suppliedItem", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** Record of delivery of what is supplied.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields `type`, partOf, status, basedOn, patient, supplier, receiver, identifier, destination, occurrence,
  *   suppliedItem.
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
  * @param `type`
  *   - Indicates the type of dispensing event that is performed. Examples include: Trial Fill, Completion of Trial, Partial Fill,
  *   Emergency Fill, Samples, etc.
  * @param partOf
  *   - A larger event of which this particular event is a component or step.
  * @param status
  *   - A code specifying the state of the dispense event.
  * @param basedOn
  *   - A plan, proposal or order that is fulfilled in whole or in part by this event.
  * @param patient
  *   - A link to a resource representing the person whom the delivered item is for.
  * @param language
  *   - The base language in which the resource is written.
  * @param supplier
  *   - The individual responsible for dispensing the medication, supplier or device.
  * @param receiver
  *   - Identifies the person who picked up the Supply.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param identifier
  *   - Identifier for the supply delivery event that is used to identify it across multiple disparate systems.
  * @param destination
  *   - Identification of the facility/location where the Supply was shipped to, as part of the dispense event.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param occurrence
  *   - The date or time(s) the activity occurred.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *   the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually
  *   modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict
  *   set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param suppliedItem
  *   - The item that is being delivered or has been supplied.
  */
@POJOBoilerplate
class SupplyDelivery(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val `type`: Option[CodeableConcept] = None,
    val partOf: LitSeq[Reference] = LitSeq.empty,
    val status: Option[SUPPLYDELIVERY_STATUS] = None,
    val basedOn: LitSeq[Reference] = LitSeq.empty,
    val patient: Option[Reference] = None,
    override val language: Option[LANGUAGES] = None,
    val supplier: Option[Reference] = None,
    val receiver: LitSeq[Reference] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val destination: Option[Reference] = None,
    override val implicitRules: Option[UriStr] = None,
    val occurrence: Option[SupplyDelivery.OccurrenceChoice] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val suppliedItem: Option[SupplyDelivery.SuppliedItem] = None,
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
  override val thisTypeName: String = "SupplyDelivery"
}
