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
import com.babylonhealth.lit.hl7.{ SUPPLYREQUEST_STATUS, REQUEST_STATUS, REQUEST_PRIORITY }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object SupplyRequest extends CompanionFor[SupplyRequest] {
  implicit def summonObjectAndCompanionSupplyRequest_2068515553(
      o: SupplyRequest): ObjectAndCompanion[SupplyRequest, SupplyRequest.type] = ObjectAndCompanion(o, this)
  override type ResourceType = SupplyRequest
  override type ParentType   = SupplyRequest
  override val baseType: CompanionFor[ResourceType] = SupplyRequest
  override val parentType: CompanionFor[ParentType] = SupplyRequest
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/SupplyRequest")
  object Parameter extends CompanionFor[Parameter] {
    implicit def summonObjectAndCompanionParameter734583021(
        o: Parameter): ObjectAndCompanion[Parameter, Parameter.type] = ObjectAndCompanion(o, this)
    override type ResourceType = Parameter
    override type ParentType   = Parameter
    override val parentType: CompanionFor[ResourceType] = Parameter
    type ValueChoice = Choice[Union_1516277229]
    def apply(
        id: Option[String] = None,
        code: Option[CodeableConcept] = None,
        value: Option[Parameter.ValueChoice] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Parameter = new Parameter(
      id,
      code,
      value,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Parameter): Option[(Option[String], Option[CodeableConcept], Option[Parameter.ValueChoice], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.code, o.value, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val code: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("code", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val value: FHIRComponentFieldMeta[Option[Parameter.ValueChoice]] =
      FHIRComponentFieldMeta("value", lTagOf[Option[Parameter.ValueChoice]], true, lTagOf[Union_1516277229])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, code, value, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Parameter): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](code, t.code),
      FHIRComponentField[Option[Parameter.ValueChoice]](value, t.value),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Parameter] = this
    val thisName: String                  = "Parameter"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Parameter] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Parameter(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("code", Some(None)),
            cursor.decodeOptRef[Union_1516277229]("value"),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Parameter(
      override val id: Option[String] = None,
      val code: Option[CodeableConcept] = None,
      val value: Option[Parameter.ValueChoice] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  type ItemChoice       = Choice[Union01025009075]
  type OccurrenceChoice = Choice[Union00609373412]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      status: Option[SUPPLYREQUEST_STATUS] = None,
      item: SupplyRequest.ItemChoice,
      language: Option[LANGUAGES] = None,
      category: Option[CodeableConcept] = None,
      priority: Option[REQUEST_PRIORITY] = None,
      quantity: Quantity,
      supplier: LitSeq[Reference] = LitSeq.empty,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      requester: Option[Reference] = None,
      deliverTo: Option[Reference] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      authoredOn: Option[FHIRDateTime] = None,
      reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
      deliverFrom: Option[Reference] = None,
      implicitRules: Option[UriStr] = None,
      occurrence: Option[SupplyRequest.OccurrenceChoice] = None,
      reasonReference: LitSeq[Reference] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      parameter: LitSeq[SupplyRequest.Parameter] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): SupplyRequest = new SupplyRequest(
    id,
    meta,
    text,
    status,
    item,
    language,
    category,
    priority,
    quantity,
    supplier,
    contained,
    extension,
    requester,
    deliverTo,
    identifier,
    authoredOn,
    reasonCode,
    deliverFrom,
    implicitRules,
    occurrence,
    reasonReference,
    modifierExtension,
    parameter,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val status: FHIRComponentFieldMeta[Option[SUPPLYREQUEST_STATUS]] =
    FHIRComponentFieldMeta("status", lTagOf[Option[SUPPLYREQUEST_STATUS]], false, lTagOf[SUPPLYREQUEST_STATUS])
  val item: FHIRComponentFieldMeta[SupplyRequest.ItemChoice] =
    FHIRComponentFieldMeta("item", lTagOf[SupplyRequest.ItemChoice], true, lTagOf[Union01025009075])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val category: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("category", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val priority: FHIRComponentFieldMeta[Option[REQUEST_PRIORITY]] =
    FHIRComponentFieldMeta("priority", lTagOf[Option[REQUEST_PRIORITY]], false, lTagOf[REQUEST_PRIORITY])
  val quantity: FHIRComponentFieldMeta[Quantity] =
    FHIRComponentFieldMeta("quantity", lTagOf[Quantity], false, lTagOf[Quantity])
  val supplier: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("supplier", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val requester: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("requester", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val deliverTo: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("deliverTo", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val authoredOn: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("authoredOn", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val reasonCode: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("reasonCode", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val deliverFrom: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("deliverFrom", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val occurrence: FHIRComponentFieldMeta[Option[SupplyRequest.OccurrenceChoice]] =
    FHIRComponentFieldMeta("occurrence", lTagOf[Option[SupplyRequest.OccurrenceChoice]], true, lTagOf[Union00609373412])
  val reasonReference: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("reasonReference", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val parameter: FHIRComponentFieldMeta[LitSeq[SupplyRequest.Parameter]] =
    FHIRComponentFieldMeta("parameter", lTagOf[LitSeq[SupplyRequest.Parameter]], false, lTagOf[SupplyRequest.Parameter])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    status,
    item,
    language,
    category,
    priority,
    quantity,
    supplier,
    contained,
    extension,
    requester,
    deliverTo,
    identifier,
    authoredOn,
    reasonCode,
    deliverFrom,
    implicitRules,
    occurrence,
    reasonReference,
    modifierExtension,
    parameter
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: SupplyRequest): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[SUPPLYREQUEST_STATUS]](status, t.status),
    FHIRComponentField[SupplyRequest.ItemChoice](item, t.item),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Option[CodeableConcept]](category, t.category),
    FHIRComponentField[Option[REQUEST_PRIORITY]](priority, t.priority),
    FHIRComponentField[Quantity](quantity, t.quantity),
    FHIRComponentField[LitSeq[Reference]](supplier, t.supplier),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Reference]](requester, t.requester),
    FHIRComponentField[Option[Reference]](deliverTo, t.deliverTo),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[FHIRDateTime]](authoredOn, t.authoredOn),
    FHIRComponentField[LitSeq[CodeableConcept]](reasonCode, t.reasonCode),
    FHIRComponentField[Option[Reference]](deliverFrom, t.deliverFrom),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[SupplyRequest.OccurrenceChoice]](occurrence, t.occurrence),
    FHIRComponentField[LitSeq[Reference]](reasonReference, t.reasonReference),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[SupplyRequest.Parameter]](parameter, t.parameter)
  )
  def extractId(t: SupplyRequest): Option[String]                                 = t.id
  def extractMeta(t: SupplyRequest): Option[Meta]                                 = t.meta
  def extractText(t: SupplyRequest): Option[Narrative]                            = t.text
  def extractStatus(t: SupplyRequest): Option[SUPPLYREQUEST_STATUS]               = t.status
  def extractItem(t: SupplyRequest): SupplyRequest.ItemChoice                     = t.item
  def extractLanguage(t: SupplyRequest): Option[LANGUAGES]                        = t.language
  def extractCategory(t: SupplyRequest): Option[CodeableConcept]                  = t.category
  def extractPriority(t: SupplyRequest): Option[REQUEST_PRIORITY]                 = t.priority
  def extractQuantity(t: SupplyRequest): Quantity                                 = t.quantity
  def extractSupplier(t: SupplyRequest): LitSeq[Reference]                        = t.supplier
  def extractContained(t: SupplyRequest): LitSeq[Resource]                        = t.contained
  def extractExtension(t: SupplyRequest): LitSeq[Extension]                       = t.extension
  def extractRequester(t: SupplyRequest): Option[Reference]                       = t.requester
  def extractDeliverTo(t: SupplyRequest): Option[Reference]                       = t.deliverTo
  def extractIdentifier(t: SupplyRequest): LitSeq[Identifier]                     = t.identifier
  def extractAuthoredOn(t: SupplyRequest): Option[FHIRDateTime]                   = t.authoredOn
  def extractReasonCode(t: SupplyRequest): LitSeq[CodeableConcept]                = t.reasonCode
  def extractDeliverFrom(t: SupplyRequest): Option[Reference]                     = t.deliverFrom
  def extractImplicitRules(t: SupplyRequest): Option[UriStr]                      = t.implicitRules
  def extractOccurrence(t: SupplyRequest): Option[SupplyRequest.OccurrenceChoice] = t.occurrence
  def extractReasonReference(t: SupplyRequest): LitSeq[Reference]                 = t.reasonReference
  def extractModifierExtension(t: SupplyRequest): LitSeq[Extension]               = t.modifierExtension
  def extractParameter(t: SupplyRequest): LitSeq[SupplyRequest.Parameter]         = t.parameter
  override val thisName: String                                                   = "SupplyRequest"
  override val searchParams: Map[String, SupplyRequest => Seq[Any]] = Map(
    "subject"    -> (obj => obj.deliverTo.toSeq),
    "identifier" -> (obj => obj.identifier.toSeq),
    "requester"  -> (obj => obj.requester.toSeq),
    "supplier"   -> (obj => obj.supplier.toSeq),
    "date"       -> (obj => obj.authoredOn.toSeq),
    "status"     -> (obj => obj.status.toSeq),
    "category"   -> (obj => obj.category.toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[SupplyRequest] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new SupplyRequest(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[SUPPLYREQUEST_STATUS]]("status", Some(None)),
          cursor.decodeRef[Union01025009075]("item"),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("category", Some(None)),
          cursor.decodeAs[Option[REQUEST_PRIORITY]]("priority", Some(None)),
          cursor.decodeAs[Quantity]("quantity", None),
          cursor.decodeAs[LitSeq[Reference]]("supplier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("requester", Some(None)),
          cursor.decodeAs[Option[Reference]]("deliverTo", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[FHIRDateTime]]("authoredOn", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("reasonCode", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("deliverFrom", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeOptRef[Union00609373412]("occurrence"),
          cursor.decodeAs[LitSeq[Reference]]("reasonReference", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[SupplyRequest.Parameter]]("parameter", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** A record of a request for a medication, substance or device used in the healthcare setting.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields status, item, category, priority, quantity, supplier, requester, deliverTo, identifier,
  *   authoredOn, reasonCode, deliverFrom, occurrence, reasonReference, parameter.
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
  * @param status
  *   - Status of the supply request.
  * @param item
  *   - The item that is requested to be supplied. This is either a link to a resource representing the details of the
  *   item or a code that identifies the item from a known list.
  * @param language
  *   - The base language in which the resource is written.
  * @param category
  *   - Category of supply, e.g. central, non-stock, etc. This is used to support work flows associated with the supply
  *   process.
  * @param priority
  *   - Indicates how quickly this SupplyRequest should be addressed with respect to other requests.
  * @param quantity
  *   - The amount that is being ordered of the indicated item.
  * @param supplier
  *   - Who is intended to fulfill the request.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To
  *   make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and
  *   use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be
  *   met as part of the definition of the extension.
  * @param requester
  *   - The device, practitioner, etc. who initiated the request.
  * @param deliverTo
  *   - Where the supply is destined to go.
  * @param identifier
  *   - Business identifiers assigned to this SupplyRequest by the author and/or other systems. These identifiers remain
  *   constant as the resource is updated and propagates from server to server.
  * @param authoredOn
  *   - When the request was made.
  * @param reasonCode
  *   - The reason why the supply item was requested.
  * @param deliverFrom
  *   - Where the supply is expected to come from.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood
  *   when processing the content. Often, this is a reference to an implementation guide that defines the special rules
  *   along with other profiles etc.
  * @param occurrence
  *   - When the request should be fulfilled.
  * @param reasonReference
  *   - The reason why the supply item was requested.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and
  *   that modifies the understanding of the element that contains it and/or the understanding of the containing
  *   element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions
  *   safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though
  *   any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the
  *   definition of the extension. Applications processing a resource are required to check for modifier extensions.
  *   Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot
  *   change the meaning of modifierExtension itself).
  * @param parameter
  *   - Specific parameters for the ordered item. For example, the size of the indicated item.
  */
@POJOBoilerplate
class SupplyRequest(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val status: Option[SUPPLYREQUEST_STATUS] = None,
    val item: SupplyRequest.ItemChoice,
    override val language: Option[LANGUAGES] = None,
    val category: Option[CodeableConcept] = None,
    val priority: Option[REQUEST_PRIORITY] = None,
    val quantity: Quantity,
    val supplier: LitSeq[Reference] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val requester: Option[Reference] = None,
    val deliverTo: Option[Reference] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val authoredOn: Option[FHIRDateTime] = None,
    val reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
    val deliverFrom: Option[Reference] = None,
    override val implicitRules: Option[UriStr] = None,
    val occurrence: Option[SupplyRequest.OccurrenceChoice] = None,
    val reasonReference: LitSeq[Reference] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val parameter: LitSeq[SupplyRequest.Parameter] = LitSeq.empty,
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
  override val thisTypeName: String = "SupplyRequest"
}
