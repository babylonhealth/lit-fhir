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
import com.babylonhealth.lit.hl7.EPISODE_OF_CARE_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object EpisodeOfCare extends CompanionFor[EpisodeOfCare] {
  implicit def summonObjectAndCompanionEpisodeOfCare2130186638(
      o: EpisodeOfCare): ObjectAndCompanion[EpisodeOfCare, EpisodeOfCare.type] = ObjectAndCompanion(o, this)
  override type ResourceType = EpisodeOfCare
  override type ParentType   = EpisodeOfCare
  override val baseType: CompanionFor[ResourceType] = EpisodeOfCare
  override val parentType: CompanionFor[ParentType] = EpisodeOfCare
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/EpisodeOfCare")
  object StatusHistory extends CompanionFor[StatusHistory] {
    implicit def summonObjectAndCompanionStatusHistory2108610182(
        o: StatusHistory): ObjectAndCompanion[StatusHistory, StatusHistory.type] = ObjectAndCompanion(o, this)
    override type ResourceType = StatusHistory
    override type ParentType   = StatusHistory
    override val parentType: CompanionFor[ResourceType] = StatusHistory
    def apply(
        id: Option[String] = None,
        status: EPISODE_OF_CARE_STATUS,
        period: Period,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): StatusHistory = new StatusHistory(
      id,
      status,
      period,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: StatusHistory): Option[(Option[String], EPISODE_OF_CARE_STATUS, Period, LitSeq[Extension], LitSeq[Extension])] = Some(
      (o.id, o.status, o.period, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val status: FHIRComponentFieldMeta[EPISODE_OF_CARE_STATUS] =
      FHIRComponentFieldMeta("status", lTagOf[EPISODE_OF_CARE_STATUS], false, lTagOf[EPISODE_OF_CARE_STATUS])
    val period: FHIRComponentFieldMeta[Period] =
      FHIRComponentFieldMeta("period", lTagOf[Period], false, lTagOf[Period])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, status, period, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: StatusHistory): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[EPISODE_OF_CARE_STATUS](status, t.status),
      FHIRComponentField[Period](period, t.period),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[StatusHistory] = this
    val thisName: String                      = "StatusHistory"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[StatusHistory] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new StatusHistory(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[EPISODE_OF_CARE_STATUS]("status", None),
            cursor.decodeAs[Period]("period", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class StatusHistory(
      override val id: Option[String] = None,
      val status: EPISODE_OF_CARE_STATUS,
      val period: Period,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Diagnosis extends CompanionFor[Diagnosis] {
    implicit def summonObjectAndCompanionDiagnosis2108610182(o: Diagnosis): ObjectAndCompanion[Diagnosis, Diagnosis.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Diagnosis
    override type ParentType   = Diagnosis
    override val parentType: CompanionFor[ResourceType] = Diagnosis
    def apply(
        id: Option[String] = None,
        role: Option[CodeableConcept] = None,
        rank: Option[PositiveInt] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        condition: Reference,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Diagnosis = new Diagnosis(
      id,
      role,
      rank,
      extension,
      condition,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Diagnosis): Option[(Option[String], Option[CodeableConcept], Option[PositiveInt], LitSeq[Extension], Reference, LitSeq[Extension])] =
      Some((o.id, o.role, o.rank, o.extension, o.condition, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val role: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("role", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val rank: FHIRComponentFieldMeta[Option[PositiveInt]] =
      FHIRComponentFieldMeta("rank", lTagOf[Option[PositiveInt]], false, lTagOf[PositiveInt])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val condition: FHIRComponentFieldMeta[Reference] =
      FHIRComponentFieldMeta("condition", lTagOf[Reference], false, lTagOf[Reference])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, role, rank, extension, condition, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Diagnosis): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](role, t.role),
      FHIRComponentField[Option[PositiveInt]](rank, t.rank),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Reference](condition, t.condition),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Diagnosis] = this
    val thisName: String                  = "Diagnosis"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Diagnosis] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Diagnosis(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("role", Some(None)),
            cursor.decodeAs[Option[PositiveInt]]("rank", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Reference]("condition", None),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Diagnosis(
      override val id: Option[String] = None,
      val role: Option[CodeableConcept] = None,
      val rank: Option[PositiveInt] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val condition: Reference,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      `type`: LitSeq[CodeableConcept] = LitSeq.empty,
      team: LitSeq[Reference] = LitSeq.empty,
      status: EPISODE_OF_CARE_STATUS,
      period: Option[Period] = None,
      patient: Reference,
      account: LitSeq[Reference] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      careManager: Option[Reference] = None,
      implicitRules: Option[UriStr] = None,
      referralRequest: LitSeq[Reference] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      managingOrganization: Option[Reference] = None,
      diagnosis: LitSeq[EpisodeOfCare.Diagnosis] = LitSeq.empty,
      statusHistory: LitSeq[EpisodeOfCare.StatusHistory] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): EpisodeOfCare = new EpisodeOfCare(
    id,
    meta,
    text,
    `type`,
    team,
    status,
    period,
    patient,
    account,
    language,
    contained,
    extension,
    identifier,
    careManager,
    implicitRules,
    referralRequest,
    modifierExtension,
    managingOrganization,
    diagnosis,
    statusHistory,
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
  val team: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("team", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val status: FHIRComponentFieldMeta[EPISODE_OF_CARE_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[EPISODE_OF_CARE_STATUS], false, lTagOf[EPISODE_OF_CARE_STATUS])
  val period: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("period", lTagOf[Option[Period]], false, lTagOf[Period])
  val patient: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("patient", lTagOf[Reference], false, lTagOf[Reference])
  val account: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("account", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val careManager: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("careManager", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val referralRequest: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("referralRequest", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val managingOrganization: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("managingOrganization", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val diagnosis: FHIRComponentFieldMeta[LitSeq[EpisodeOfCare.Diagnosis]] =
    FHIRComponentFieldMeta("diagnosis", lTagOf[LitSeq[EpisodeOfCare.Diagnosis]], false, lTagOf[EpisodeOfCare.Diagnosis])
  val statusHistory: FHIRComponentFieldMeta[LitSeq[EpisodeOfCare.StatusHistory]] =
    FHIRComponentFieldMeta(
      "statusHistory",
      lTagOf[LitSeq[EpisodeOfCare.StatusHistory]],
      false,
      lTagOf[EpisodeOfCare.StatusHistory])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    `type`,
    team,
    status,
    period,
    patient,
    account,
    language,
    contained,
    extension,
    identifier,
    careManager,
    implicitRules,
    referralRequest,
    modifierExtension,
    managingOrganization,
    diagnosis,
    statusHistory
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: EpisodeOfCare): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[LitSeq[CodeableConcept]](`type`, t.`type`),
    FHIRComponentField[LitSeq[Reference]](team, t.team),
    FHIRComponentField[EPISODE_OF_CARE_STATUS](status, t.status),
    FHIRComponentField[Option[Period]](period, t.period),
    FHIRComponentField[Reference](patient, t.patient),
    FHIRComponentField[LitSeq[Reference]](account, t.account),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[Reference]](careManager, t.careManager),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Reference]](referralRequest, t.referralRequest),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Option[Reference]](managingOrganization, t.managingOrganization),
    FHIRComponentField[LitSeq[EpisodeOfCare.Diagnosis]](diagnosis, t.diagnosis),
    FHIRComponentField[LitSeq[EpisodeOfCare.StatusHistory]](statusHistory, t.statusHistory)
  )
  def extractId(t: EpisodeOfCare): Option[String]                                 = t.id
  def extractMeta(t: EpisodeOfCare): Option[Meta]                                 = t.meta
  def extractText(t: EpisodeOfCare): Option[Narrative]                            = t.text
  def extractType(t: EpisodeOfCare): LitSeq[CodeableConcept]                      = t.`type`
  def extractTeam(t: EpisodeOfCare): LitSeq[Reference]                            = t.team
  def extractStatus(t: EpisodeOfCare): EPISODE_OF_CARE_STATUS                     = t.status
  def extractPeriod(t: EpisodeOfCare): Option[Period]                             = t.period
  def extractPatient(t: EpisodeOfCare): Reference                                 = t.patient
  def extractAccount(t: EpisodeOfCare): LitSeq[Reference]                         = t.account
  def extractLanguage(t: EpisodeOfCare): Option[LANGUAGES]                        = t.language
  def extractContained(t: EpisodeOfCare): LitSeq[Resource]                        = t.contained
  def extractExtension(t: EpisodeOfCare): LitSeq[Extension]                       = t.extension
  def extractIdentifier(t: EpisodeOfCare): LitSeq[Identifier]                     = t.identifier
  def extractCareManager(t: EpisodeOfCare): Option[Reference]                     = t.careManager
  def extractImplicitRules(t: EpisodeOfCare): Option[UriStr]                      = t.implicitRules
  def extractReferralRequest(t: EpisodeOfCare): LitSeq[Reference]                 = t.referralRequest
  def extractModifierExtension(t: EpisodeOfCare): LitSeq[Extension]               = t.modifierExtension
  def extractManagingOrganization(t: EpisodeOfCare): Option[Reference]            = t.managingOrganization
  def extractDiagnosis(t: EpisodeOfCare): LitSeq[EpisodeOfCare.Diagnosis]         = t.diagnosis
  def extractStatusHistory(t: EpisodeOfCare): LitSeq[EpisodeOfCare.StatusHistory] = t.statusHistory
  override val thisName: String                                                   = "EpisodeOfCare"
  override val searchParams: Map[String, EpisodeOfCare => Seq[Any]] = Map(
    "organization"      -> (obj => obj.managingOrganization.toSeq),
    "identifier"        -> (obj => obj.identifier.toSeq),
    "care-manager"      -> (obj => obj.careManager.filter(_.reference.exists(_.contains("Practitioner/"))).toSeq),
    "condition"         -> (obj => obj.diagnosis.map(_.condition).toSeq),
    "date"              -> (obj => obj.period.toSeq),
    "status"            -> (obj => Seq(obj.status)),
    "incoming-referral" -> (obj => obj.referralRequest.toSeq),
    "type"              -> (obj => obj.`type`.toSeq),
    "patient"           -> (obj => Seq(obj.patient))
  )
  def unapply(
      o: EpisodeOfCare): Option[(Option[String], Option[Meta], Option[Narrative], LitSeq[CodeableConcept], LitSeq[Reference], EPISODE_OF_CARE_STATUS, Option[Period], Reference, LitSeq[Reference], Option[LANGUAGES], LitSeq[Resource], LitSeq[Extension], LitSeq[Identifier], Option[Reference], Option[UriStr], LitSeq[Reference], LitSeq[Extension], Option[Reference], LitSeq[EpisodeOfCare.Diagnosis], LitSeq[EpisodeOfCare.StatusHistory])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.`type`,
        o.team,
        o.status,
        o.period,
        o.patient,
        o.account,
        o.language,
        o.contained,
        o.extension,
        o.identifier,
        o.careManager,
        o.implicitRules,
        o.referralRequest,
        o.modifierExtension,
        o.managingOrganization,
        o.diagnosis,
        o.statusHistory))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[EpisodeOfCare] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new EpisodeOfCare(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("type", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("team", Some(LitSeq.empty)),
          cursor.decodeAs[EPISODE_OF_CARE_STATUS]("status", None),
          cursor.decodeAs[Option[Period]]("period", Some(None)),
          cursor.decodeAs[Reference]("patient", None),
          cursor.decodeAs[LitSeq[Reference]]("account", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("careManager", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("referralRequest", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("managingOrganization", Some(None)),
          cursor.decodeAs[LitSeq[EpisodeOfCare.Diagnosis]]("diagnosis", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[EpisodeOfCare.StatusHistory]]("statusHistory", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The
  * managing organization assumes a level of responsibility for the patient during this time.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields `type`, team, status, period, patient, account, identifier, careManager, referralRequest,
  *   managingOrganization, diagnosis, statusHistory.
  * @param id
  *   \- The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta
  *   \- The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *   not always be associated with version changes to the resource.
  * @param text
  *   \- A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *   resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to
  *   make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be
  *   represented in the narrative to ensure clinical safety.
  * @param `type`
  *   \- A classification of the type of episode of care; e.g. specialist referral, disease management, type of funded care.
  * @param team
  *   \- The list of practitioners that may be facilitating this episode of care for specific purposes.
  * @param status
  *   \- planned | waitlist | active | onhold | finished | cancelled.
  * @param period
  *   \- The interval during which the managing organization assumes the defined responsibility.
  * @param patient
  *   \- The patient who is the focus of this episode of care.
  * @param account
  *   \- The set of accounts that may be used for billing for this EpisodeOfCare.
  * @param language
  *   \- The base language in which the resource is written.
  * @param contained
  *   \- These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   \- May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param identifier
  *   \- The EpisodeOfCare may be known by different identifiers for different contexts of use, such as when an external agency is
  *   tracking the Episode for funding purposes.
  * @param careManager
  *   \- The practitioner that is the care manager/care coordinator for this patient.
  * @param implicitRules
  *   \- A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param referralRequest
  *   \- Referral Request(s) that are fulfilled by this EpisodeOfCare, incoming referrals.
  * @param modifierExtension
  *   \- May be used to represent additional information that is not part of the basic definition of the resource and that
  *   modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *   Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *   strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *   extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *   processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any
  *   elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param managingOrganization
  *   \- The organization that has assumed the specific responsibilities for the specified duration.
  * @param diagnosis
  *   \- The list of diagnosis relevant to this episode of care.
  * @param statusHistory
  *   \- The history of statuses that the EpisodeOfCare has been through (without requiring processing the history of the
  *   resource).
  */
@POJOBoilerplate
class EpisodeOfCare(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val `type`: LitSeq[CodeableConcept] = LitSeq.empty,
    val team: LitSeq[Reference] = LitSeq.empty,
    val status: EPISODE_OF_CARE_STATUS,
    val period: Option[Period] = None,
    val patient: Reference,
    val account: LitSeq[Reference] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val careManager: Option[Reference] = None,
    override val implicitRules: Option[UriStr] = None,
    val referralRequest: LitSeq[Reference] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val managingOrganization: Option[Reference] = None,
    val diagnosis: LitSeq[EpisodeOfCare.Diagnosis] = LitSeq.empty,
    val statusHistory: LitSeq[EpisodeOfCare.StatusHistory] = LitSeq.empty,
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
  override val thisTypeName: String = "EpisodeOfCare"
}
