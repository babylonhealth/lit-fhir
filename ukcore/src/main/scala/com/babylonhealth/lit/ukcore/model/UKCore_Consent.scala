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
import com.babylonhealth.lit.hl7.CONSENT_STATE_CODES
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, ukcore }
import com.babylonhealth.lit.macros.POJOBoilerplate

object UKCore_Consent extends CompanionFor[UKCore_Consent] {
  implicit def summonObjectAndCompanionUKCore_Consent_225449077(
      o: UKCore_Consent): ObjectAndCompanion[UKCore_Consent, UKCore_Consent.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Consent
  override type ParentType   = Consent
  override val baseType: CompanionFor[ResourceType] = Consent
  override val parentType: CompanionFor[ParentType] = Consent
  override val profileUrl: Option[String]           = Some("https://fhir.hl7.org.uk/StructureDefinition/UKCore-Consent")
  type SourceChoice = Choice[UnionAttachmentOrReference]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-Consent"))),
      text: Option[Narrative] = None,
      scope: CodeableConcept,
      status: CONSENT_STATE_CODES,
      patient: Option[Reference] = None,
      language: Option[LANGUAGES] = None,
      category: NonEmptyLitSeq[CodeableConcept],
      dateTime: Option[FHIRDateTime] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      performer: LitSeq[Reference] = LitSeq.empty,
      source: Option[UKCore_Consent.SourceChoice] = None,
      policyRule: Option[CodeableConcept] = None,
      organization: LitSeq[Reference] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      policy: LitSeq[Consent.Policy] = LitSeq.empty,
      verification: LitSeq[Consent.Verification] = LitSeq.empty,
      provision: Option[Consent.Provision] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): UKCore_Consent = new UKCore_Consent(
    id,
    meta,
    text,
    scope,
    status,
    patient,
    language,
    category,
    dateTime,
    contained,
    extension,
    performer,
    source,
    policyRule,
    organization,
    implicitRules,
    modifierExtension,
    identifier,
    policy,
    verification,
    provision,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val scope: FHIRComponentFieldMeta[CodeableConcept] =
    FHIRComponentFieldMeta("scope", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
  val status: FHIRComponentFieldMeta[CONSENT_STATE_CODES] =
    FHIRComponentFieldMeta("status", lTagOf[CONSENT_STATE_CODES], false, lTagOf[CONSENT_STATE_CODES])
  val patient: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("patient", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val category: FHIRComponentFieldMeta[NonEmptyLitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("category", lTagOf[NonEmptyLitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val dateTime: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("dateTime", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val performer: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("performer", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val source: FHIRComponentFieldMeta[Option[UKCore_Consent.SourceChoice]] =
    FHIRComponentFieldMeta("source", lTagOf[Option[UKCore_Consent.SourceChoice]], true, lTagOf[UnionAttachmentOrReference])
  val policyRule: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("policyRule", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val organization: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("organization", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val policy: FHIRComponentFieldMeta[LitSeq[Consent.Policy]] =
    FHIRComponentFieldMeta("policy", lTagOf[LitSeq[Consent.Policy]], false, lTagOf[Consent.Policy])
  val verification: FHIRComponentFieldMeta[LitSeq[Consent.Verification]] =
    FHIRComponentFieldMeta("verification", lTagOf[LitSeq[Consent.Verification]], false, lTagOf[Consent.Verification])
  val provision: FHIRComponentFieldMeta[Option[Consent.Provision]] =
    FHIRComponentFieldMeta("provision", lTagOf[Option[Consent.Provision]], false, lTagOf[Consent.Provision])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    scope,
    status,
    patient,
    language,
    category,
    dateTime,
    contained,
    extension,
    performer,
    source,
    policyRule,
    organization,
    implicitRules,
    modifierExtension,
    identifier,
    policy,
    verification,
    provision
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Meta]](meta, t.meta),
      FHIRComponentField[Option[Narrative]](text, t.text),
      FHIRComponentField[CodeableConcept](scope, t.scope),
      FHIRComponentField[CONSENT_STATE_CODES](status, t.status),
      FHIRComponentField[Option[Reference]](patient, t.patient),
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[NonEmptyLitSeq[CodeableConcept]](category, t.category),
      FHIRComponentField[Option[FHIRDateTime]](dateTime, t.dateTime),
      FHIRComponentField[LitSeq[Resource]](contained, t.contained),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Reference]](performer, t.performer),
      FHIRComponentField[Option[UKCore_Consent.SourceChoice]](source, t.source),
      FHIRComponentField[Option[CodeableConcept]](policyRule, t.policyRule),
      FHIRComponentField[LitSeq[Reference]](organization, t.organization),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
      FHIRComponentField[LitSeq[Consent.Policy]](policy, t.policy),
      FHIRComponentField[LitSeq[Consent.Verification]](verification, t.verification),
      FHIRComponentField[Option[Consent.Provision]](provision, t.provision)
    ))
  override def fields(t: UKCore_Consent): Seq[FHIRComponentField[_]]        = fieldsFromParent(t).get
  def extractId(t: UKCore_Consent): Option[String]                          = t.id
  def extractMeta(t: UKCore_Consent): Option[Meta]                          = t.meta
  def extractText(t: UKCore_Consent): Option[Narrative]                     = t.text
  def extractScope(t: UKCore_Consent): CodeableConcept                      = t.scope
  def extractStatus(t: UKCore_Consent): CONSENT_STATE_CODES                 = t.status
  def extractPatient(t: UKCore_Consent): Option[Reference]                  = t.patient
  def extractLanguage(t: UKCore_Consent): Option[LANGUAGES]                 = t.language
  def extractCategory(t: UKCore_Consent): NonEmptyLitSeq[CodeableConcept]   = t.category
  def extractDateTime(t: UKCore_Consent): Option[FHIRDateTime]              = t.dateTime
  def extractContained(t: UKCore_Consent): LitSeq[Resource]                 = t.contained
  def extractExtension(t: UKCore_Consent): LitSeq[Extension]                = t.extension
  def extractPerformer(t: UKCore_Consent): LitSeq[Reference]                = t.performer
  def extractSource(t: UKCore_Consent): Option[UKCore_Consent.SourceChoice] = t.source
  def extractPolicyRule(t: UKCore_Consent): Option[CodeableConcept]         = t.policyRule
  def extractOrganization(t: UKCore_Consent): LitSeq[Reference]             = t.organization
  def extractImplicitRules(t: UKCore_Consent): Option[UriStr]               = t.implicitRules
  def extractModifierExtension(t: UKCore_Consent): LitSeq[Extension]        = t.modifierExtension
  def extractIdentifier(t: UKCore_Consent): LitSeq[Identifier]              = t.identifier
  def extractPolicy(t: UKCore_Consent): LitSeq[Consent.Policy]              = t.policy
  def extractVerification(t: UKCore_Consent): LitSeq[Consent.Verification]  = t.verification
  def extractProvision(t: UKCore_Consent): Option[Consent.Provision]        = t.provision
  override val thisName: String                                             = "UKCore_Consent"
  override val searchParams: Map[String, UKCore_Consent => Seq[Any]]        = Consent.searchParams
  def unapply(
      o: UKCore_Consent): Option[(Option[String], Option[Meta], Option[Narrative], CodeableConcept, CONSENT_STATE_CODES, Option[Reference], Option[LANGUAGES], NonEmptyLitSeq[CodeableConcept], Option[FHIRDateTime], LitSeq[Resource], LitSeq[Extension], LitSeq[Reference], Option[UKCore_Consent.SourceChoice], Option[CodeableConcept], LitSeq[Reference], Option[UriStr], LitSeq[Extension], LitSeq[Identifier], LitSeq[Consent.Policy], LitSeq[Consent.Verification], Option[Consent.Provision])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.scope,
        o.status,
        o.patient,
        o.language,
        o.category,
        o.dateTime,
        o.contained,
        o.extension,
        o.performer,
        o.source,
        o.policyRule,
        o.organization,
        o.implicitRules,
        o.modifierExtension,
        o.identifier,
        o.policy,
        o.verification,
        o.provision))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[UKCore_Consent] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new UKCore_Consent(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[CodeableConcept]("scope", None),
          cursor.decodeAs[CONSENT_STATE_CODES]("status", None),
          cursor.decodeAs[Option[Reference]]("patient", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[NonEmptyLitSeq[CodeableConcept]]("category", None),
          cursor.decodeAs[Option[FHIRDateTime]]("dateTime", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("performer", Some(LitSeq.empty)),
          cursor.decodeOptRef[UnionAttachmentOrReference]("source"),
          cursor.decodeAs[Option[CodeableConcept]]("policyRule", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("organization", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Consent.Policy]]("policy", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Consent.Verification]]("verification", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Consent.Provision]]("provision", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** Defines the UK Core constraints and extensions on the Consent resource for the minimal set of data to query and retrieve
  * consent information.
  *
  * Subclass of [[hl7.model.Consent]] (A record of a healthcare consumer’s choices, which permits or denies identified
  * recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and
  * periods of time.)
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
  * @param scope
  *   - A selector of the type of consent being presented: ADR, Privacy, Treatment, Research. This list is now extensible.
  * @param status
  *   - Indicates the current state of this consent.
  * @param patient
  *   - The patient/healthcare consumer to whom this consent applies.
  * @param language
  *   - The base language in which the resource is written.
  * @param category
  *   - A classification of the type of consents found in the statement. This element supports indexing and retrieval of consent
  *     statements.
  * @param dateTime
  *   - When this Consent was issued / created / indexed.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *     identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *     of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *     Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *     of the extension.
  * @param performer
  *   - Either the Grantor, which is the entity responsible for granting the rights listed in a Consent Directive or the Grantee,
  *     which is the entity responsible for complying with the Consent Directive, including any obligations or limitations on
  *     authorizations and enforcement of prohibitions.
  * @param source
  *   - The source on which this consent statement is based. The source might be a scanned original paper form, or a reference to
  *     a consent that links back to such a source, a reference to a document repository (e.g. XDS) that stores the original
  *     consent document.
  * @param policyRule
  *   - A reference to the specific base computable regulation or policy.
  * @param organization
  *   - The organization that manages the consent, and the framework within which it is executed.
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
  *   - Unique identifier for this copy of the Consent Statement.
  * @param policy
  *   - The references to the policies that are included in this consent scope. Policies may be organizational, but are often
  *     defined jurisdictionally, or in law.
  * @param verification
  *   - Whether a treatment instruction (e.g. artificial respiration yes or no) was verified with the patient, his/her family or
  *     another authorized person.
  * @param provision
  *   - An exception to the base policy of this consent. An exception can be an addition or removal of access permissions.
  */
@POJOBoilerplate
class UKCore_Consent(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-Consent"))),
    override val text: Option[Narrative] = None,
    override val scope: CodeableConcept,
    override val status: CONSENT_STATE_CODES,
    override val patient: Option[Reference] = None,
    override val language: Option[LANGUAGES] = None,
    override val category: NonEmptyLitSeq[CodeableConcept],
    override val dateTime: Option[FHIRDateTime] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val performer: LitSeq[Reference] = LitSeq.empty,
    override val source: Option[UKCore_Consent.SourceChoice] = None,
    override val policyRule: Option[CodeableConcept] = None,
    override val organization: LitSeq[Reference] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val policy: LitSeq[Consent.Policy] = LitSeq.empty,
    override val verification: LitSeq[Consent.Verification] = LitSeq.empty,
    override val provision: Option[Consent.Provision] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Consent(
      id = id,
      meta = meta,
      text = text,
      scope = scope,
      status = status,
      patient = patient,
      language = language,
      category = category,
      dateTime = dateTime,
      contained = contained,
      extension = extension,
      performer = performer,
      source = source,
      identifier = identifier,
      policyRule = policyRule,
      organization = organization,
      implicitRules = implicitRules,
      modifierExtension = modifierExtension,
      policy = policy,
      verification = verification,
      provision = provision,
      primitiveAttributes = primitiveAttributes
    ) {
  override val thisTypeName: String = "Consent"
}
