package com.babylonhealth.lit.ukcore.model

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
import com.babylonhealth.lit.hl7.EPISODE_OF_CARE_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, ukcore }
import com.babylonhealth.lit.macros.POJOBoilerplate

object UKCore_EpisodeOfCare extends CompanionFor[UKCore_EpisodeOfCare] {
  implicit def summonObjectAndCompanionUKCore_EpisodeOfCare_941273580(
      o: UKCore_EpisodeOfCare): ObjectAndCompanion[UKCore_EpisodeOfCare, UKCore_EpisodeOfCare.type] = ObjectAndCompanion(o, this)
  override type ResourceType = EpisodeOfCare
  override type ParentType   = EpisodeOfCare
  override val baseType: CompanionFor[ResourceType] = EpisodeOfCare
  override val parentType: CompanionFor[ParentType] = EpisodeOfCare
  override val profileUrl: Option[String]           = Some("https://fhir.hl7.org.uk/StructureDefinition/UKCore-EpisodeOfCare")
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-EpisodeOfCare"))),
      text: Option[Narrative] = None,
      `type`: LitSeq[CodeableConcept] = LitSeq.empty,
      status: EPISODE_OF_CARE_STATUS,
      period: Option[Period] = None,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      team: LitSeq[Reference] = LitSeq.empty,
      patient: Reference,
      account: LitSeq[Reference] = LitSeq.empty,
      statusHistory: LitSeq[EpisodeOfCare.StatusHistory] = LitSeq.empty,
      careManager: Option[Reference] = None,
      referralRequest: LitSeq[Reference] = LitSeq.empty,
      diagnosis: LitSeq[EpisodeOfCare.Diagnosis] = LitSeq.empty,
      managingOrganization: Option[Reference] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): UKCore_EpisodeOfCare = new UKCore_EpisodeOfCare(
    id,
    meta,
    text,
    `type`,
    status,
    period,
    language,
    contained,
    extension,
    implicitRules,
    modifierExtension,
    identifier,
    team,
    patient,
    account,
    statusHistory,
    careManager,
    referralRequest,
    diagnosis,
    managingOrganization,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val `type`: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("type", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val status: FHIRComponentFieldMeta[EPISODE_OF_CARE_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[EPISODE_OF_CARE_STATUS], false, lTagOf[EPISODE_OF_CARE_STATUS])
  val period: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("period", lTagOf[Option[Period]], false, lTagOf[Period])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val team: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("team", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val patient: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("patient", lTagOf[Reference], false, lTagOf[Reference])
  val account: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("account", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val statusHistory: FHIRComponentFieldMeta[LitSeq[EpisodeOfCare.StatusHistory]] =
    FHIRComponentFieldMeta(
      "statusHistory",
      lTagOf[LitSeq[EpisodeOfCare.StatusHistory]],
      false,
      lTagOf[EpisodeOfCare.StatusHistory])
  val careManager: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("careManager", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val referralRequest: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("referralRequest", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val diagnosis: FHIRComponentFieldMeta[LitSeq[EpisodeOfCare.Diagnosis]] =
    FHIRComponentFieldMeta("diagnosis", lTagOf[LitSeq[EpisodeOfCare.Diagnosis]], false, lTagOf[EpisodeOfCare.Diagnosis])
  val managingOrganization: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("managingOrganization", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    `type`,
    status,
    period,
    language,
    contained,
    extension,
    implicitRules,
    modifierExtension,
    identifier,
    team,
    patient,
    account,
    statusHistory,
    careManager,
    referralRequest,
    diagnosis,
    managingOrganization
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Meta]](meta, t.meta),
      FHIRComponentField[Option[Narrative]](text, t.text),
      FHIRComponentField[LitSeq[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[EPISODE_OF_CARE_STATUS](status, t.status),
      FHIRComponentField[Option[Period]](period, t.period),
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[LitSeq[Resource]](contained, t.contained),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
      FHIRComponentField[LitSeq[Reference]](team, t.team),
      FHIRComponentField[Reference](patient, t.patient),
      FHIRComponentField[LitSeq[Reference]](account, t.account),
      FHIRComponentField[LitSeq[EpisodeOfCare.StatusHistory]](statusHistory, t.statusHistory),
      FHIRComponentField[Option[Reference]](careManager, t.careManager),
      FHIRComponentField[LitSeq[Reference]](referralRequest, t.referralRequest),
      FHIRComponentField[LitSeq[EpisodeOfCare.Diagnosis]](diagnosis, t.diagnosis),
      FHIRComponentField[Option[Reference]](managingOrganization, t.managingOrganization)
    ))
  override def fields(t: UKCore_EpisodeOfCare): Seq[FHIRComponentField[_]]               = fieldsFromParent(t).get
  def extractId(t: UKCore_EpisodeOfCare): Option[String]                                 = t.id
  def extractMeta(t: UKCore_EpisodeOfCare): Option[Meta]                                 = t.meta
  def extractText(t: UKCore_EpisodeOfCare): Option[Narrative]                            = t.text
  def extractType(t: UKCore_EpisodeOfCare): LitSeq[CodeableConcept]                      = t.`type`
  def extractStatus(t: UKCore_EpisodeOfCare): EPISODE_OF_CARE_STATUS                     = t.status
  def extractPeriod(t: UKCore_EpisodeOfCare): Option[Period]                             = t.period
  def extractLanguage(t: UKCore_EpisodeOfCare): Option[LANGUAGES]                        = t.language
  def extractContained(t: UKCore_EpisodeOfCare): LitSeq[Resource]                        = t.contained
  def extractExtension(t: UKCore_EpisodeOfCare): LitSeq[Extension]                       = t.extension
  def extractImplicitRules(t: UKCore_EpisodeOfCare): Option[UriStr]                      = t.implicitRules
  def extractModifierExtension(t: UKCore_EpisodeOfCare): LitSeq[Extension]               = t.modifierExtension
  def extractIdentifier(t: UKCore_EpisodeOfCare): LitSeq[Identifier]                     = t.identifier
  def extractTeam(t: UKCore_EpisodeOfCare): LitSeq[Reference]                            = t.team
  def extractPatient(t: UKCore_EpisodeOfCare): Reference                                 = t.patient
  def extractAccount(t: UKCore_EpisodeOfCare): LitSeq[Reference]                         = t.account
  def extractStatusHistory(t: UKCore_EpisodeOfCare): LitSeq[EpisodeOfCare.StatusHistory] = t.statusHistory
  def extractCareManager(t: UKCore_EpisodeOfCare): Option[Reference]                     = t.careManager
  def extractReferralRequest(t: UKCore_EpisodeOfCare): LitSeq[Reference]                 = t.referralRequest
  def extractDiagnosis(t: UKCore_EpisodeOfCare): LitSeq[EpisodeOfCare.Diagnosis]         = t.diagnosis
  def extractManagingOrganization(t: UKCore_EpisodeOfCare): Option[Reference]            = t.managingOrganization
  override val thisName: String                                                          = "UKCore_EpisodeOfCare"
  override val searchParams: Map[String, UKCore_EpisodeOfCare => Seq[Any]]               = EpisodeOfCare.searchParams
  def unapply(
      o: UKCore_EpisodeOfCare): Option[(Option[String], Option[Meta], Option[Narrative], LitSeq[CodeableConcept], EPISODE_OF_CARE_STATUS, Option[Period], Option[LANGUAGES], LitSeq[Resource], LitSeq[Extension], Option[UriStr], LitSeq[Extension], LitSeq[Identifier], LitSeq[Reference], Reference, LitSeq[Reference], LitSeq[EpisodeOfCare.StatusHistory], Option[Reference], LitSeq[Reference], LitSeq[EpisodeOfCare.Diagnosis], Option[Reference])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.`type`,
        o.status,
        o.period,
        o.language,
        o.contained,
        o.extension,
        o.implicitRules,
        o.modifierExtension,
        o.identifier,
        o.team,
        o.patient,
        o.account,
        o.statusHistory,
        o.careManager,
        o.referralRequest,
        o.diagnosis,
        o.managingOrganization))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[UKCore_EpisodeOfCare] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new UKCore_EpisodeOfCare(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("type", Some(LitSeq.empty)),
          cursor.decodeAs[EPISODE_OF_CARE_STATUS]("status", None),
          cursor.decodeAs[Option[Period]]("period", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("team", Some(LitSeq.empty)),
          cursor.decodeAs[Reference]("patient", None),
          cursor.decodeAs[LitSeq[Reference]]("account", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[EpisodeOfCare.StatusHistory]]("statusHistory", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("careManager", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("referralRequest", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[EpisodeOfCare.Diagnosis]]("diagnosis", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("managingOrganization", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** Defines the UK Core constraints and extensions on the EpisodeOfCare resource for the minimal set of data to query and retrieve
  * episode of care information.
  *
  * Subclass of [[hl7.model.EpisodeOfCare]] (An association between a patient and an organization / healthcare provider(s) during
  * which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this
  * time.)
  *
  * @constructor
  *   Inherits all params from parent.
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
  * @param `type`
  *   - A classification of the type of episode of care; e.g. specialist referral, disease management, type of funded care.
  * @param status
  *   - planned | waitlist | active | onhold | finished | cancelled.
  * @param period
  *   - The interval during which the managing organization assumes the defined responsibility.
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
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *     processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *     other profiles etc.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *     the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *     Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *     strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *     extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *     processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of
  *     any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param identifier
  *   - The EpisodeOfCare may be known by different identifiers for different contexts of use, such as when an external agency is
  *     tracking the Episode for funding purposes.
  * @param team
  *   - The list of practitioners that may be facilitating this episode of care for specific purposes.
  * @param patient
  *   - The patient who is the focus of this episode of care.
  * @param account
  *   - The set of accounts that may be used for billing for this EpisodeOfCare.
  * @param statusHistory
  *   - The history of statuses that the EpisodeOfCare has been through (without requiring processing the history of the
  *     resource).
  * @param careManager
  *   - The practitioner that is the care manager/care coordinator for this patient.
  * @param referralRequest
  *   - Referral Request(s) that are fulfilled by this EpisodeOfCare, incoming referrals.
  * @param diagnosis
  *   - The list of diagnosis relevant to this episode of care.
  * @param managingOrganization
  *   - The organization that has assumed the specific responsibilities for the specified duration.
  */
@POJOBoilerplate
class UKCore_EpisodeOfCare(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-EpisodeOfCare"))),
    override val text: Option[Narrative] = None,
    override val `type`: LitSeq[CodeableConcept] = LitSeq.empty,
    override val status: EPISODE_OF_CARE_STATUS,
    override val period: Option[Period] = None,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val team: LitSeq[Reference] = LitSeq.empty,
    override val patient: Reference,
    override val account: LitSeq[Reference] = LitSeq.empty,
    override val statusHistory: LitSeq[EpisodeOfCare.StatusHistory] = LitSeq.empty,
    override val careManager: Option[Reference] = None,
    override val referralRequest: LitSeq[Reference] = LitSeq.empty,
    override val diagnosis: LitSeq[EpisodeOfCare.Diagnosis] = LitSeq.empty,
    override val managingOrganization: Option[Reference] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends EpisodeOfCare(
      id = id,
      meta = meta,
      text = text,
      `type` = `type`,
      team = team,
      status = status,
      period = period,
      patient = patient,
      account = account,
      language = language,
      contained = contained,
      extension = extension,
      identifier = identifier,
      careManager = careManager,
      implicitRules = implicitRules,
      referralRequest = referralRequest,
      modifierExtension = modifierExtension,
      managingOrganization = managingOrganization,
      diagnosis = diagnosis,
      statusHistory = statusHistory,
      primitiveAttributes = primitiveAttributes
    ) {
  override val thisTypeName: String = "EpisodeOfCare"
}
