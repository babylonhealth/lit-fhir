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
import com.babylonhealth.lit.hl7.{ REMITTANCE_OUTCOME, FM_STATUS }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object EnrollmentResponse extends CompanionFor[EnrollmentResponse] {
  override val baseType: CompanionFor[EnrollmentResponse] = EnrollmentResponse
  override val profileUrl: Option[String]                 = Some("http://hl7.org/fhir/StructureDefinition/EnrollmentResponse")
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      status: Option[FM_STATUS] = None,
      request: Option[Reference] = None,
      outcome: Option[REMITTANCE_OUTCOME] = None,
      created: Option[FHIRDateTime] = None,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      disposition: Option[String] = None,
      organization: Option[Reference] = None,
      implicitRules: Option[UriStr] = None,
      requestProvider: Option[Reference] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): EnrollmentResponse = new EnrollmentResponse(
    id,
    meta,
    text,
    status,
    request,
    outcome,
    created,
    language,
    contained,
    extension,
    identifier,
    disposition,
    organization,
    implicitRules,
    requestProvider,
    modifierExtension,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val status: FHIRComponentFieldMeta[Option[FM_STATUS]] =
    FHIRComponentFieldMeta("status", lTagOf[Option[FM_STATUS]], false, lTagOf[FM_STATUS])
  val request: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("request", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val outcome: FHIRComponentFieldMeta[Option[REMITTANCE_OUTCOME]] =
    FHIRComponentFieldMeta("outcome", lTagOf[Option[REMITTANCE_OUTCOME]], false, lTagOf[REMITTANCE_OUTCOME])
  val created: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("created", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val disposition: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("disposition", lTagOf[Option[String]], false, lTagOf[String])
  val organization: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("organization", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val requestProvider: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("requestProvider", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    status,
    request,
    outcome,
    created,
    language,
    contained,
    extension,
    identifier,
    disposition,
    organization,
    implicitRules,
    requestProvider,
    modifierExtension
  )
  override def fields(t: EnrollmentResponse): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[FM_STATUS]](status, t.status),
    FHIRComponentField[Option[Reference]](request, t.request),
    FHIRComponentField[Option[REMITTANCE_OUTCOME]](outcome, t.outcome),
    FHIRComponentField[Option[FHIRDateTime]](created, t.created),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[String]](disposition, t.disposition),
    FHIRComponentField[Option[Reference]](organization, t.organization),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[Reference]](requestProvider, t.requestProvider),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
  )
  def extractId(t: EnrollmentResponse): Option[String]                   = t.id
  def extractMeta(t: EnrollmentResponse): Option[Meta]                   = t.meta
  def extractText(t: EnrollmentResponse): Option[Narrative]              = t.text
  def extractStatus(t: EnrollmentResponse): Option[FM_STATUS]            = t.status
  def extractRequest(t: EnrollmentResponse): Option[Reference]           = t.request
  def extractOutcome(t: EnrollmentResponse): Option[REMITTANCE_OUTCOME]  = t.outcome
  def extractCreated(t: EnrollmentResponse): Option[FHIRDateTime]        = t.created
  def extractLanguage(t: EnrollmentResponse): Option[LANGUAGES]          = t.language
  def extractContained(t: EnrollmentResponse): LitSeq[Resource]          = t.contained
  def extractExtension(t: EnrollmentResponse): LitSeq[Extension]         = t.extension
  def extractIdentifier(t: EnrollmentResponse): LitSeq[Identifier]       = t.identifier
  def extractDisposition(t: EnrollmentResponse): Option[String]          = t.disposition
  def extractOrganization(t: EnrollmentResponse): Option[Reference]      = t.organization
  def extractImplicitRules(t: EnrollmentResponse): Option[UriStr]        = t.implicitRules
  def extractRequestProvider(t: EnrollmentResponse): Option[Reference]   = t.requestProvider
  def extractModifierExtension(t: EnrollmentResponse): LitSeq[Extension] = t.modifierExtension
  override val thisName: String                                          = "EnrollmentResponse"
  override val searchParams: Map[String, EnrollmentResponse => Seq[Any]] = Map(
    "identifier" -> (obj => obj.identifier.toSeq),
    "request"    -> (obj => obj.request.toSeq),
    "status"     -> (obj => obj.status.toSeq)
  )
  def unapply(
      o: EnrollmentResponse): Option[(Option[String], Option[Meta], Option[Narrative], Option[FM_STATUS], Option[Reference], Option[REMITTANCE_OUTCOME], Option[FHIRDateTime], Option[LANGUAGES], LitSeq[Resource], LitSeq[Extension], LitSeq[Identifier], Option[String], Option[Reference], Option[UriStr], Option[Reference], LitSeq[Extension])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.status,
        o.request,
        o.outcome,
        o.created,
        o.language,
        o.contained,
        o.extension,
        o.identifier,
        o.disposition,
        o.organization,
        o.implicitRules,
        o.requestProvider,
        o.modifierExtension))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[EnrollmentResponse] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new EnrollmentResponse(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[FM_STATUS]]("status", Some(None)),
          cursor.decodeAs[Option[Reference]]("request", Some(None)),
          cursor.decodeAs[Option[REMITTANCE_OUTCOME]]("outcome", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("created", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("disposition", Some(None)),
          cursor.decodeAs[Option[Reference]]("organization", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[Reference]]("requestProvider", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** This resource provides enrollment and plan details from the processing of an EnrollmentRequest resource.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields status, request, outcome, created, identifier, disposition, organization, requestProvider.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param status - The status of the resource instance.
  * @param request - Original request resource reference.
  * @param outcome - Processing status: error, complete.
  * @param created - The date when the enclosed suite of services were performed or completed.
  * @param language - The base language in which the resource is written.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param identifier - The Response business identifier.
  * @param disposition - A description of the status of the adjudication.
  * @param organization - The Insurer who produced this adjudicated response.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param requestProvider - The practitioner who is responsible for the services rendered to the patient.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  */
@POJOBoilerplate
class EnrollmentResponse(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val status: Option[FM_STATUS] = None,
    val request: Option[Reference] = None,
    val outcome: Option[REMITTANCE_OUTCOME] = None,
    val created: Option[FHIRDateTime] = None,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val disposition: Option[String] = None,
    val organization: Option[Reference] = None,
    override val implicitRules: Option[UriStr] = None,
    val requestProvider: Option[Reference] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
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
  override val thisTypeName: String = "EnrollmentResponse"
}
