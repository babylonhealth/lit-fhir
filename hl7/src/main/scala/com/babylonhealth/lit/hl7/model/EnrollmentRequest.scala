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
import com.babylonhealth.lit.hl7.FM_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object EnrollmentRequest extends CompanionFor[EnrollmentRequest] {
  override val baseType: CompanionFor[EnrollmentRequest] = EnrollmentRequest
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      status: Option[FM_STATUS] = None,
      created: Option[FHIRDateTime] = None,
      insurer: Option[Reference] = None,
      language: Option[LANGUAGES] = None,
      provider: Option[Reference] = None,
      coverage: Option[Reference] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      candidate: Option[Reference] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): EnrollmentRequest = new EnrollmentRequest(
    id,
    meta,
    text,
    status,
    created,
    insurer,
    language,
    provider,
    coverage,
    contained,
    extension,
    candidate,
    identifier,
    implicitRules,
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
  val created: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("created", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val insurer: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("insurer", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val provider: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("provider", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val coverage: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("coverage", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val candidate: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("candidate", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    status,
    created,
    insurer,
    language,
    provider,
    coverage,
    contained,
    extension,
    candidate,
    identifier,
    implicitRules,
    modifierExtension)
  override def fields(t: EnrollmentRequest): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[FM_STATUS]](status, t.status),
    FHIRComponentField[Option[FHIRDateTime]](created, t.created),
    FHIRComponentField[Option[Reference]](insurer, t.insurer),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Option[Reference]](provider, t.provider),
    FHIRComponentField[Option[Reference]](coverage, t.coverage),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Reference]](candidate, t.candidate),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
  )
  def extractId(t: EnrollmentRequest): Option[String]                   = t.id
  def extractMeta(t: EnrollmentRequest): Option[Meta]                   = t.meta
  def extractText(t: EnrollmentRequest): Option[Narrative]              = t.text
  def extractStatus(t: EnrollmentRequest): Option[FM_STATUS]            = t.status
  def extractCreated(t: EnrollmentRequest): Option[FHIRDateTime]        = t.created
  def extractInsurer(t: EnrollmentRequest): Option[Reference]           = t.insurer
  def extractLanguage(t: EnrollmentRequest): Option[LANGUAGES]          = t.language
  def extractProvider(t: EnrollmentRequest): Option[Reference]          = t.provider
  def extractCoverage(t: EnrollmentRequest): Option[Reference]          = t.coverage
  def extractContained(t: EnrollmentRequest): LitSeq[Resource]          = t.contained
  def extractExtension(t: EnrollmentRequest): LitSeq[Extension]         = t.extension
  def extractCandidate(t: EnrollmentRequest): Option[Reference]         = t.candidate
  def extractIdentifier(t: EnrollmentRequest): LitSeq[Identifier]       = t.identifier
  def extractImplicitRules(t: EnrollmentRequest): Option[UriStr]        = t.implicitRules
  def extractModifierExtension(t: EnrollmentRequest): LitSeq[Extension] = t.modifierExtension
  override val thisName: String                                         = "EnrollmentRequest"
  override val searchParams: Map[String, EnrollmentRequest => Seq[Any]] = Map(
    "identifier" -> (obj => obj.identifier.toSeq),
    "patient"    -> (obj => obj.candidate.toSeq),
    "status"     -> (obj => obj.status.toSeq),
    "subject"    -> (obj => obj.candidate.toSeq)
  )
  def unapply(
      o: EnrollmentRequest): Option[(Option[String], Option[Meta], Option[Narrative], Option[FM_STATUS], Option[FHIRDateTime], Option[Reference], Option[LANGUAGES], Option[Reference], Option[Reference], LitSeq[Resource], LitSeq[Extension], Option[Reference], LitSeq[Identifier], Option[UriStr], LitSeq[Extension])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.status,
        o.created,
        o.insurer,
        o.language,
        o.provider,
        o.coverage,
        o.contained,
        o.extension,
        o.candidate,
        o.identifier,
        o.implicitRules,
        o.modifierExtension))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[EnrollmentRequest] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new EnrollmentRequest(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[FM_STATUS]]("status", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("created", Some(None)),
          cursor.decodeAs[Option[Reference]]("insurer", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[Reference]]("provider", Some(None)),
          cursor.decodeAs[Option[Reference]]("coverage", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("candidate", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** This resource provides the insurance enrollment details to the insurer regarding a specified coverage.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields status, created, insurer, provider, coverage, candidate, identifier.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param status - The status of the resource instance.
  * @param created - The date when this resource was created.
  * @param insurer - The Insurer who is target  of the request.
  * @param language - The base language in which the resource is written.
  * @param provider - The practitioner who is responsible for the services rendered to the patient.
  * @param coverage - Reference to the program or plan identification, underwriter or payor.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param candidate - Patient Resource.
  * @param identifier - The Response business identifier.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  */
@POJOBoilerplate
class EnrollmentRequest(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val status: Option[FM_STATUS] = None,
    val created: Option[FHIRDateTime] = None,
    val insurer: Option[Reference] = None,
    override val language: Option[LANGUAGES] = None,
    val provider: Option[Reference] = None,
    val coverage: Option[Reference] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val candidate: Option[Reference] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
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
  override val thisTypeName: String = "EnrollmentRequest"
}
