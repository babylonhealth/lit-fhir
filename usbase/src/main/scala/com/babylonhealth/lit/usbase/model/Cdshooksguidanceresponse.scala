package com.babylonhealth.lit.usbase.model

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
import com.babylonhealth.lit.usbase.UnionAliases._
import com.babylonhealth.lit.hl7.GUIDANCE_RESPONSE_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Cdshooksguidanceresponse extends CompanionFor[Cdshooksguidanceresponse] {
  implicit def summonObjectAndCompanionCdshooksguidanceresponse_1606919743(
      o: Cdshooksguidanceresponse): ObjectAndCompanion[Cdshooksguidanceresponse, Cdshooksguidanceresponse.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = GuidanceResponse
  override type ParentType   = GuidanceResponse
  override val baseType: CompanionFor[ResourceType] = GuidanceResponse
  override val parentType: CompanionFor[ParentType] = GuidanceResponse
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/cdshooksguidanceresponse")
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(new Meta(profile = LitSeq("http://hl7.org/fhir/StructureDefinition/cdshooksguidanceresponse"))),
      text: Option[Narrative] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      status: GUIDANCE_RESPONSE_STATUS,
      result: Option[Reference] = None,
      subject: Option[Reference] = None,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: NonEmptyLitSeq[Extension],
      module: UriStr,
      encounter: Option[Reference] = None,
      performer: Option[Reference] = None,
      identifier: Identifier,
      reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      reasonReference: LitSeq[Reference] = LitSeq.empty,
      dataRequirement: LitSeq[DataRequirement] = LitSeq.empty,
      outputParameters: Option[Reference] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      requestIdentifier: Identifier,
      evaluationMessage: LitSeq[Reference] = LitSeq.empty,
      occurrenceDateTime: Option[FHIRDateTime] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Cdshooksguidanceresponse = new Cdshooksguidanceresponse(
    id,
    meta,
    text,
    note,
    status,
    result,
    subject,
    language,
    contained,
    extension,
    module,
    encounter,
    performer,
    identifier,
    reasonCode,
    implicitRules,
    reasonReference,
    dataRequirement,
    outputParameters,
    modifierExtension,
    requestIdentifier,
    evaluationMessage,
    occurrenceDateTime,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val status: FHIRComponentFieldMeta[GUIDANCE_RESPONSE_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[GUIDANCE_RESPONSE_STATUS], false, lTagOf[GUIDANCE_RESPONSE_STATUS])
  val result: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("result", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val subject: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("subject", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[NonEmptyLitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[NonEmptyLitSeq[Extension]], false, lTagOf[Extension])
  val module: FHIRComponentFieldMeta[UriStr] =
    FHIRComponentFieldMeta("module", lTagOf[UriStr], true, lTagOf[UriStr])
  val encounter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("encounter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val performer: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("performer", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[Identifier] =
    FHIRComponentFieldMeta("identifier", lTagOf[Identifier], false, lTagOf[Identifier])
  val reasonCode: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("reasonCode", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val reasonReference: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("reasonReference", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val dataRequirement: FHIRComponentFieldMeta[LitSeq[DataRequirement]] =
    FHIRComponentFieldMeta("dataRequirement", lTagOf[LitSeq[DataRequirement]], false, lTagOf[DataRequirement])
  val outputParameters: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("outputParameters", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val requestIdentifier: FHIRComponentFieldMeta[Identifier] =
    FHIRComponentFieldMeta("requestIdentifier", lTagOf[Identifier], false, lTagOf[Identifier])
  val evaluationMessage: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("evaluationMessage", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val occurrenceDateTime: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("occurrenceDateTime", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    note,
    status,
    result,
    subject,
    language,
    contained,
    extension,
    module,
    encounter,
    performer,
    identifier,
    reasonCode,
    implicitRules,
    reasonReference,
    dataRequirement,
    outputParameters,
    modifierExtension,
    requestIdentifier,
    evaluationMessage,
    occurrenceDateTime
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Meta]](meta, t.meta),
      FHIRComponentField[Option[Narrative]](text, t.text),
      FHIRComponentField[LitSeq[Annotation]](note, t.note),
      FHIRComponentField[GUIDANCE_RESPONSE_STATUS](status, t.status),
      FHIRComponentField[Option[Reference]](result, t.result),
      FHIRComponentField[Option[Reference]](subject, t.subject),
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[LitSeq[Resource]](contained, t.contained),
      FHIRComponentField[NonEmptyLitSeq[Extension]](extension, t.extension.asNonEmpty),
      FHIRComponentField[UriStr](module, t.module.toSubRefNonUnion[UriStr]),
      FHIRComponentField[Option[Reference]](encounter, t.encounter),
      FHIRComponentField[Option[Reference]](performer, t.performer),
      FHIRComponentField[Identifier](identifier, t.identifier.head),
      FHIRComponentField[LitSeq[CodeableConcept]](reasonCode, t.reasonCode),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[LitSeq[Reference]](reasonReference, t.reasonReference),
      FHIRComponentField[LitSeq[DataRequirement]](dataRequirement, t.dataRequirement),
      FHIRComponentField[Option[Reference]](outputParameters, t.outputParameters),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Identifier](requestIdentifier, t.requestIdentifier.get),
      FHIRComponentField[LitSeq[Reference]](evaluationMessage, t.evaluationMessage),
      FHIRComponentField[Option[FHIRDateTime]](occurrenceDateTime, t.occurrenceDateTime)
    ))
  override def fields(t: Cdshooksguidanceresponse): Seq[FHIRComponentField[_]]     = fieldsFromParent(t).get
  def extractId(t: Cdshooksguidanceresponse): Option[String]                       = t.id
  def extractMeta(t: Cdshooksguidanceresponse): Option[Meta]                       = t.meta
  def extractText(t: Cdshooksguidanceresponse): Option[Narrative]                  = t.text
  def extractNote(t: Cdshooksguidanceresponse): LitSeq[Annotation]                 = t.note
  def extractStatus(t: Cdshooksguidanceresponse): GUIDANCE_RESPONSE_STATUS         = t.status
  def extractResult(t: Cdshooksguidanceresponse): Option[Reference]                = t.result
  def extractSubject(t: Cdshooksguidanceresponse): Option[Reference]               = t.subject
  def extractLanguage(t: Cdshooksguidanceresponse): Option[LANGUAGES]              = t.language
  def extractContained(t: Cdshooksguidanceresponse): LitSeq[Resource]              = t.contained
  def extractExtension(t: Cdshooksguidanceresponse): NonEmptyLitSeq[Extension]     = t.extension.asNonEmpty
  def extractModule(t: Cdshooksguidanceresponse): UriStr                           = t.module.toSubRefNonUnion[UriStr]
  def extractEncounter(t: Cdshooksguidanceresponse): Option[Reference]             = t.encounter
  def extractPerformer(t: Cdshooksguidanceresponse): Option[Reference]             = t.performer
  def extractIdentifier(t: Cdshooksguidanceresponse): Identifier                   = t.identifier.head
  def extractReasonCode(t: Cdshooksguidanceresponse): LitSeq[CodeableConcept]      = t.reasonCode
  def extractImplicitRules(t: Cdshooksguidanceresponse): Option[UriStr]            = t.implicitRules
  def extractReasonReference(t: Cdshooksguidanceresponse): LitSeq[Reference]       = t.reasonReference
  def extractDataRequirement(t: Cdshooksguidanceresponse): LitSeq[DataRequirement] = t.dataRequirement
  def extractOutputParameters(t: Cdshooksguidanceresponse): Option[Reference]      = t.outputParameters
  def extractModifierExtension(t: Cdshooksguidanceresponse): LitSeq[Extension]     = t.modifierExtension
  def extractRequestIdentifier(t: Cdshooksguidanceresponse): Identifier            = t.requestIdentifier.get
  def extractEvaluationMessage(t: Cdshooksguidanceresponse): LitSeq[Reference]     = t.evaluationMessage
  def extractOccurrenceDateTime(t: Cdshooksguidanceresponse): Option[FHIRDateTime] = t.occurrenceDateTime
  override val thisName: String                                                    = "Cdshooksguidanceresponse"
  override val searchParams: Map[String, Cdshooksguidanceresponse => Seq[Any]]     = GuidanceResponse.searchParams
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Cdshooksguidanceresponse] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Cdshooksguidanceresponse(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[GUIDANCE_RESPONSE_STATUS]("status", None),
          cursor.decodeAs[Option[Reference]]("result", Some(None)),
          cursor.decodeAs[Option[Reference]]("subject", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[NonEmptyLitSeq[Extension]]("extension", None),
          cursor.decodeAs[UriStr]("moduleUri", None),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          cursor.decodeAs[Option[Reference]]("performer", Some(None)),
          cursor.decodeFromListAs[Identifier]("identifier", None),
          cursor.decodeAs[LitSeq[CodeableConcept]]("reasonCode", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("reasonReference", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[DataRequirement]]("dataRequirement", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("outputParameters", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Identifier]("requestIdentifier", None),
          cursor.decodeAs[LitSeq[Reference]]("evaluationMessage", Some(LitSeq.empty)),
          cursor.decodeAs[Option[FHIRDateTime]]("occurrenceDateTime", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** Defines a GuidanceResponse that represents the response container for a CDS Hooks response
  *
  * Subclass of [[hl7.model.GuidanceResponse]] (A guidance response is the formal response to a guidance request, including any
  * output parameters returned by the evaluation, as well as the description of any proposed actions to be taken.)
  *
  * @constructor
  *   Inherits all params from parent. Refines the types of: module. Requires the following fields which were optional in the
  *   parent: extension, identifier, requestIdentifier.
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
  * @param note
  *   - Provides a mechanism to communicate additional information about the response.
  * @param status
  *   - The status of the response. If the evaluation is completed successfully, the status will indicate success. However, in
  *   order to complete the evaluation, the engine may require more information. In this case, the status will be data-required,
  *   and the response will contain a description of the additional required information. If the evaluation completed
  *   successfully, but the engine determines that a potentially more accurate response could be provided if more data was
  *   available, the status will be data-requested, and the response will contain a description of the additional requested
  *   information.
  * @param result
  *   - The actions, if any, produced by the evaluation of the artifact.
  * @param subject
  *   - The patient for which the request was processed.
  * @param language
  *   - The base language in which the resource is written.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - An Extension
  * @param module
  *   - An identifier, CodeableConcept or canonical reference to the guidance that was requested.
  * @param encounter
  *   - The encounter during which this response was created or to which the creation of this record is tightly associated.
  * @param performer
  *   - Provides a reference to the device that performed the guidance.
  * @param identifier
  *   - Allows a service to provide unique, business identifiers for the response.
  * @param reasonCode
  *   - Describes the reason for the guidance response in coded or textual form.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param reasonReference
  *   - Indicates the reason the request was initiated. This is typically provided as a parameter to the evaluation and echoed by
  *   the service, although for some use cases, such as subscription- or event-based scenarios, it may provide an indication of
  *   the cause for the response.
  * @param dataRequirement
  *   - If the evaluation could not be completed due to lack of information, or additional information would potentially result in
  *   a more accurate response, this element will a description of the data required in order to proceed with the evaluation. A
  *   subsequent request to the service should include this data.
  * @param outputParameters
  *   - The output parameters of the evaluation, if any. Many modules will result in the return of specific resources such as
  *   procedure or communication requests that are returned as part of the operation result. However, modules may define specific
  *   outputs that would be returned as the result of the evaluation, and these would be returned in this element.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *   the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually
  *   modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict
  *   set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param requestIdentifier
  *   - The identifier of the request associated with this response. If an identifier was given as part of the request, it will be
  *   reproduced here to enable the requester to more easily identify the response in a multi-request scenario.
  * @param evaluationMessage
  *   - Messages resulting from the evaluation of the artifact or artifacts. As part of evaluating the request, the engine may
  *   produce informational or warning messages. These messages will be provided by this element.
  * @param occurrenceDateTime
  *   - Indicates when the guidance response was processed.
  */
@POJOBoilerplate
class Cdshooksguidanceresponse(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("http://hl7.org/fhir/StructureDefinition/cdshooksguidanceresponse"))),
    override val text: Option[Narrative] = None,
    override val note: LitSeq[Annotation] = LitSeq.empty,
    override val status: GUIDANCE_RESPONSE_STATUS,
    override val result: Option[Reference] = None,
    override val subject: Option[Reference] = None,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    extension: NonEmptyLitSeq[Extension],
    module: UriStr,
    override val encounter: Option[Reference] = None,
    override val performer: Option[Reference] = None,
    identifier: Identifier,
    override val reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    override val reasonReference: LitSeq[Reference] = LitSeq.empty,
    override val dataRequirement: LitSeq[DataRequirement] = LitSeq.empty,
    override val outputParameters: Option[Reference] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    requestIdentifier: Identifier,
    override val evaluationMessage: LitSeq[Reference] = LitSeq.empty,
    override val occurrenceDateTime: Option[FHIRDateTime] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends GuidanceResponse(
      id = id,
      meta = meta,
      text = text,
      note = note,
      status = status,
      result = result,
      subject = subject,
      language = language,
      contained = contained,
      extension = extension.refine,
      module = choice(module),
      encounter = encounter,
      performer = performer,
      identifier = LitSeq(identifier),
      reasonCode = reasonCode,
      implicitRules = implicitRules,
      reasonReference = reasonReference,
      dataRequirement = dataRequirement,
      outputParameters = outputParameters,
      modifierExtension = modifierExtension,
      requestIdentifier = Some(requestIdentifier),
      evaluationMessage = evaluationMessage,
      occurrenceDateTime = occurrenceDateTime,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "GuidanceResponse"
}
