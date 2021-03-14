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
import com.babylonhealth.lit.hl7.GUIDANCE_RESPONSE_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object GuidanceResponse extends CompanionFor[GuidanceResponse] {
  override val baseType: CompanionFor[GuidanceResponse] = GuidanceResponse
  type ModuleChoice = Choice[Union_0687680458]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      status: GUIDANCE_RESPONSE_STATUS,
      result: Option[Reference] = None,
      subject: Option[Reference] = None,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      module: GuidanceResponse.ModuleChoice,
      encounter: Option[Reference] = None,
      performer: Option[Reference] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      reasonReference: LitSeq[Reference] = LitSeq.empty,
      dataRequirement: LitSeq[DataRequirement] = LitSeq.empty,
      outputParameters: Option[Reference] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      requestIdentifier: Option[Identifier] = None,
      evaluationMessage: LitSeq[Reference] = LitSeq.empty,
      occurrenceDateTime: Option[FHIRDateTime] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): GuidanceResponse = new GuidanceResponse(
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
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val module: FHIRComponentFieldMeta[GuidanceResponse.ModuleChoice] =
    FHIRComponentFieldMeta("module", lTagOf[GuidanceResponse.ModuleChoice], true, lTagOf[Union_0687680458])
  val encounter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("encounter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val performer: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("performer", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
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
  val requestIdentifier: FHIRComponentFieldMeta[Option[Identifier]] =
    FHIRComponentFieldMeta("requestIdentifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
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
  override def fields(t: GuidanceResponse): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[LitSeq[Annotation]](note, t.note),
    FHIRComponentField[GUIDANCE_RESPONSE_STATUS](status, t.status),
    FHIRComponentField[Option[Reference]](result, t.result),
    FHIRComponentField[Option[Reference]](subject, t.subject),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[GuidanceResponse.ModuleChoice](module, t.module),
    FHIRComponentField[Option[Reference]](encounter, t.encounter),
    FHIRComponentField[Option[Reference]](performer, t.performer),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[LitSeq[CodeableConcept]](reasonCode, t.reasonCode),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Reference]](reasonReference, t.reasonReference),
    FHIRComponentField[LitSeq[DataRequirement]](dataRequirement, t.dataRequirement),
    FHIRComponentField[Option[Reference]](outputParameters, t.outputParameters),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Option[Identifier]](requestIdentifier, t.requestIdentifier),
    FHIRComponentField[LitSeq[Reference]](evaluationMessage, t.evaluationMessage),
    FHIRComponentField[Option[FHIRDateTime]](occurrenceDateTime, t.occurrenceDateTime)
  )
  def extractId(t: GuidanceResponse): Option[String]                       = t.id
  def extractMeta(t: GuidanceResponse): Option[Meta]                       = t.meta
  def extractText(t: GuidanceResponse): Option[Narrative]                  = t.text
  def extractNote(t: GuidanceResponse): LitSeq[Annotation]                 = t.note
  def extractStatus(t: GuidanceResponse): GUIDANCE_RESPONSE_STATUS         = t.status
  def extractResult(t: GuidanceResponse): Option[Reference]                = t.result
  def extractSubject(t: GuidanceResponse): Option[Reference]               = t.subject
  def extractLanguage(t: GuidanceResponse): Option[LANGUAGES]              = t.language
  def extractContained(t: GuidanceResponse): LitSeq[Resource]              = t.contained
  def extractExtension(t: GuidanceResponse): LitSeq[Extension]             = t.extension
  def extractModule(t: GuidanceResponse): GuidanceResponse.ModuleChoice    = t.module
  def extractEncounter(t: GuidanceResponse): Option[Reference]             = t.encounter
  def extractPerformer(t: GuidanceResponse): Option[Reference]             = t.performer
  def extractIdentifier(t: GuidanceResponse): LitSeq[Identifier]           = t.identifier
  def extractReasonCode(t: GuidanceResponse): LitSeq[CodeableConcept]      = t.reasonCode
  def extractImplicitRules(t: GuidanceResponse): Option[UriStr]            = t.implicitRules
  def extractReasonReference(t: GuidanceResponse): LitSeq[Reference]       = t.reasonReference
  def extractDataRequirement(t: GuidanceResponse): LitSeq[DataRequirement] = t.dataRequirement
  def extractOutputParameters(t: GuidanceResponse): Option[Reference]      = t.outputParameters
  def extractModifierExtension(t: GuidanceResponse): LitSeq[Extension]     = t.modifierExtension
  def extractRequestIdentifier(t: GuidanceResponse): Option[Identifier]    = t.requestIdentifier
  def extractEvaluationMessage(t: GuidanceResponse): LitSeq[Reference]     = t.evaluationMessage
  def extractOccurrenceDateTime(t: GuidanceResponse): Option[FHIRDateTime] = t.occurrenceDateTime
  override val thisName: String                                            = "GuidanceResponse"
  override val searchParams: Map[String, GuidanceResponse => Seq[Any]] = Map(
    "identifier" -> (obj => obj.identifier.toSeq),
    "patient"    -> (obj => obj.subject.filter(_.reference.exists(_.contains("Patient/"))).toSeq),
    "request"    -> (obj => obj.requestIdentifier.toSeq),
    "subject"    -> (obj => obj.subject.toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[GuidanceResponse] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new GuidanceResponse(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[GUIDANCE_RESPONSE_STATUS]("status", None),
          cursor.decodeAs[Option[Reference]]("result", Some(None)),
          cursor.decodeAs[Option[Reference]]("subject", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeRef[Union_0687680458]("module"),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          cursor.decodeAs[Option[Reference]]("performer", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("reasonCode", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("reasonReference", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[DataRequirement]]("dataRequirement", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("outputParameters", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Identifier]]("requestIdentifier", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("evaluationMessage", Some(LitSeq.empty)),
          cursor.decodeAs[Option[FHIRDateTime]]("occurrenceDateTime", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** A guidance response is the formal response to a guidance request, including any output parameters returned by the evaluation, as well as the description of any proposed actions to be taken.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields note, status, result, subject, module, encounter, performer, identifier, reasonCode, reasonReference, dataRequirement, outputParameters, requestIdentifier, evaluationMessage, occurrenceDateTime.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param note - Provides a mechanism to communicate additional information about the response.
  * @param status - The status of the response. If the evaluation is completed successfully, the status will indicate success. However, in order to complete the evaluation, the engine may require more information. In this case, the status will be data-required, and the response will contain a description of the additional required information. If the evaluation completed successfully, but the engine determines that a potentially more accurate response could be provided if more data was available, the status will be data-requested, and the response will contain a description of the additional requested information.
  * @param result - The actions, if any, produced by the evaluation of the artifact.
  * @param subject - The patient for which the request was processed.
  * @param language - The base language in which the resource is written.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param module - An identifier, CodeableConcept or canonical reference to the guidance that was requested.
  * @param encounter - The encounter during which this response was created or to which the creation of this record is tightly associated.
  * @param performer - Provides a reference to the device that performed the guidance.
  * @param identifier - Allows a service to provide  unique, business identifiers for the response.
  * @param reasonCode - Describes the reason for the guidance response in coded or textual form.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param reasonReference - Indicates the reason the request was initiated. This is typically provided as a parameter to the evaluation and echoed by the service, although for some use cases, such as subscription- or event-based scenarios, it may provide an indication of the cause for the response.
  * @param dataRequirement - If the evaluation could not be completed due to lack of information, or additional information would potentially result in a more accurate response, this element will a description of the data required in order to proceed with the evaluation. A subsequent request to the service should include this data.
  * @param outputParameters - The output parameters of the evaluation, if any. Many modules will result in the return of specific resources such as procedure or communication requests that are returned as part of the operation result. However, modules may define specific outputs that would be returned as the result of the evaluation, and these would be returned in this element.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param requestIdentifier - The identifier of the request associated with this response. If an identifier was given as part of the request, it will be reproduced here to enable the requester to more easily identify the response in a multi-request scenario.
  * @param evaluationMessage - Messages resulting from the evaluation of the artifact or artifacts. As part of evaluating the request, the engine may produce informational or warning messages. These messages will be provided by this element.
  * @param occurrenceDateTime - Indicates when the guidance response was processed.
  */
@POJOBoilerplate
class GuidanceResponse(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val note: LitSeq[Annotation] = LitSeq.empty,
    val status: GUIDANCE_RESPONSE_STATUS,
    val result: Option[Reference] = None,
    val subject: Option[Reference] = None,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val module: GuidanceResponse.ModuleChoice,
    val encounter: Option[Reference] = None,
    val performer: Option[Reference] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    val reasonReference: LitSeq[Reference] = LitSeq.empty,
    val dataRequirement: LitSeq[DataRequirement] = LitSeq.empty,
    val outputParameters: Option[Reference] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val requestIdentifier: Option[Identifier] = None,
    val evaluationMessage: LitSeq[Reference] = LitSeq.empty,
    val occurrenceDateTime: Option[FHIRDateTime] = None,
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
  override val thisTypeName: String = "GuidanceResponse"
}
