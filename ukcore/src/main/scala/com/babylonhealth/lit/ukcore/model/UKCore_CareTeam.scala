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
import com.babylonhealth.lit.hl7.CARE_TEAM_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, ukcore }
import com.babylonhealth.lit.macros.POJOBoilerplate

object UKCore_CareTeam extends CompanionFor[UKCore_CareTeam] {
  implicit def summonObjectAndCompanionUKCore_CareTeam_2133032003(
      o: UKCore_CareTeam): ObjectAndCompanion[UKCore_CareTeam, UKCore_CareTeam.type] = ObjectAndCompanion(o, this)
  override type ResourceType = CareTeam
  override type ParentType   = CareTeam
  override val baseType: CompanionFor[ResourceType] = CareTeam
  override val parentType: CompanionFor[ParentType] = CareTeam
  override val profileUrl: Option[String]           = Some("https://fhir.hl7.org.uk/StructureDefinition/UKCore-CareTeam")
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-CareTeam"))),
      text: Option[Narrative] = None,
      name: Option[String] = None,
      status: Option[CARE_TEAM_STATUS] = None,
      period: Option[Period] = None,
      subject: Option[Reference] = None,
      telecom: LitSeq[ContactPoint] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      category: LitSeq[CodeableConcept] = LitSeq.empty,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      encounter: Option[Reference] = None,
      reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      reasonReference: LitSeq[Reference] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      managingOrganization: LitSeq[Reference] = LitSeq.empty,
      participant: LitSeq[CareTeam.Participant] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): UKCore_CareTeam = new UKCore_CareTeam(
    id,
    meta,
    text,
    name,
    status,
    period,
    subject,
    telecom,
    language,
    category,
    contained,
    extension,
    encounter,
    reasonCode,
    implicitRules,
    note,
    reasonReference,
    modifierExtension,
    identifier,
    managingOrganization,
    participant,
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
  val status: FHIRComponentFieldMeta[Option[CARE_TEAM_STATUS]] =
    FHIRComponentFieldMeta("status", lTagOf[Option[CARE_TEAM_STATUS]], false, lTagOf[CARE_TEAM_STATUS])
  val period: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("period", lTagOf[Option[Period]], false, lTagOf[Period])
  val subject: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("subject", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val telecom: FHIRComponentFieldMeta[LitSeq[ContactPoint]] =
    FHIRComponentFieldMeta("telecom", lTagOf[LitSeq[ContactPoint]], false, lTagOf[ContactPoint])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val category: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("category", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val encounter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("encounter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val reasonCode: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("reasonCode", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val reasonReference: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("reasonReference", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val managingOrganization: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("managingOrganization", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val participant: FHIRComponentFieldMeta[LitSeq[CareTeam.Participant]] =
    FHIRComponentFieldMeta("participant", lTagOf[LitSeq[CareTeam.Participant]], false, lTagOf[CareTeam.Participant])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    name,
    status,
    period,
    subject,
    telecom,
    language,
    category,
    contained,
    extension,
    encounter,
    reasonCode,
    implicitRules,
    note,
    reasonReference,
    modifierExtension,
    identifier,
    managingOrganization,
    participant
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Meta]](meta, t.meta),
      FHIRComponentField[Option[Narrative]](text, t.text),
      FHIRComponentField[Option[String]](name, t.name),
      FHIRComponentField[Option[CARE_TEAM_STATUS]](status, t.status),
      FHIRComponentField[Option[Period]](period, t.period),
      FHIRComponentField[Option[Reference]](subject, t.subject),
      FHIRComponentField[LitSeq[ContactPoint]](telecom, t.telecom),
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[LitSeq[CodeableConcept]](category, t.category),
      FHIRComponentField[LitSeq[Resource]](contained, t.contained),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Reference]](encounter, t.encounter),
      FHIRComponentField[LitSeq[CodeableConcept]](reasonCode, t.reasonCode),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[LitSeq[Annotation]](note, t.note),
      FHIRComponentField[LitSeq[Reference]](reasonReference, t.reasonReference),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
      FHIRComponentField[LitSeq[Reference]](managingOrganization, t.managingOrganization),
      FHIRComponentField[LitSeq[CareTeam.Participant]](participant, t.participant)
    ))
  override def fields(t: UKCore_CareTeam): Seq[FHIRComponentField[_]]      = fieldsFromParent(t).get
  def extractId(t: UKCore_CareTeam): Option[String]                        = t.id
  def extractMeta(t: UKCore_CareTeam): Option[Meta]                        = t.meta
  def extractText(t: UKCore_CareTeam): Option[Narrative]                   = t.text
  def extractName(t: UKCore_CareTeam): Option[String]                      = t.name
  def extractStatus(t: UKCore_CareTeam): Option[CARE_TEAM_STATUS]          = t.status
  def extractPeriod(t: UKCore_CareTeam): Option[Period]                    = t.period
  def extractSubject(t: UKCore_CareTeam): Option[Reference]                = t.subject
  def extractTelecom(t: UKCore_CareTeam): LitSeq[ContactPoint]             = t.telecom
  def extractLanguage(t: UKCore_CareTeam): Option[LANGUAGES]               = t.language
  def extractCategory(t: UKCore_CareTeam): LitSeq[CodeableConcept]         = t.category
  def extractContained(t: UKCore_CareTeam): LitSeq[Resource]               = t.contained
  def extractExtension(t: UKCore_CareTeam): LitSeq[Extension]              = t.extension
  def extractEncounter(t: UKCore_CareTeam): Option[Reference]              = t.encounter
  def extractReasonCode(t: UKCore_CareTeam): LitSeq[CodeableConcept]       = t.reasonCode
  def extractImplicitRules(t: UKCore_CareTeam): Option[UriStr]             = t.implicitRules
  def extractNote(t: UKCore_CareTeam): LitSeq[Annotation]                  = t.note
  def extractReasonReference(t: UKCore_CareTeam): LitSeq[Reference]        = t.reasonReference
  def extractModifierExtension(t: UKCore_CareTeam): LitSeq[Extension]      = t.modifierExtension
  def extractIdentifier(t: UKCore_CareTeam): LitSeq[Identifier]            = t.identifier
  def extractManagingOrganization(t: UKCore_CareTeam): LitSeq[Reference]   = t.managingOrganization
  def extractParticipant(t: UKCore_CareTeam): LitSeq[CareTeam.Participant] = t.participant
  override val thisName: String                                            = "UKCore_CareTeam"
  override val searchParams: Map[String, UKCore_CareTeam => Seq[Any]]      = CareTeam.searchParams
  def unapply(
      o: UKCore_CareTeam): Option[(Option[String], Option[Meta], Option[Narrative], Option[String], Option[CARE_TEAM_STATUS], Option[Period], Option[Reference], LitSeq[ContactPoint], Option[LANGUAGES], LitSeq[CodeableConcept], LitSeq[Resource], LitSeq[Extension], Option[Reference], LitSeq[CodeableConcept], Option[UriStr], LitSeq[Annotation], LitSeq[Reference], LitSeq[Extension], LitSeq[Identifier], LitSeq[Reference], LitSeq[CareTeam.Participant])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.name,
        o.status,
        o.period,
        o.subject,
        o.telecom,
        o.language,
        o.category,
        o.contained,
        o.extension,
        o.encounter,
        o.reasonCode,
        o.implicitRules,
        o.note,
        o.reasonReference,
        o.modifierExtension,
        o.identifier,
        o.managingOrganization,
        o.participant))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[UKCore_CareTeam] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new UKCore_CareTeam(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[String]]("name", Some(None)),
          cursor.decodeAs[Option[CARE_TEAM_STATUS]]("status", Some(None)),
          cursor.decodeAs[Option[Period]]("period", Some(None)),
          cursor.decodeAs[Option[Reference]]("subject", Some(None)),
          cursor.decodeAs[LitSeq[ContactPoint]]("telecom", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("category", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("reasonCode", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("reasonReference", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("managingOrganization", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CareTeam.Participant]]("participant", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Defines the UK Core constraints and extensions on the CareTeam resource for the minimal set of data to query and retrieve an
  * individual’s care team.
  *
  * Subclass of [[hl7.model.CareTeam]] (The Care Team includes all the people and organizations who plan to participate in the
  * coordination and delivery of care for a patient.)
  *
  * @constructor
  *   Inherits all params from parent.
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
  * @param name
  *   \- A label for human use intended to distinguish like teams. E.g. the "red" vs. "green" trauma teams.
  * @param status
  *   \- Indicates the current state of the care team.
  * @param period
  *   \- Indicates when the team did (or is intended to) come into effect and end.
  * @param subject
  *   \- Identifies the patient or group whose intended care is handled by the team.
  * @param telecom
  *   \- A central contact detail for the care team (that applies to all members).
  * @param language
  *   \- The base language in which the resource is written.
  * @param category
  *   \- Identifies what kind of team. This is to support differentiation between multiple co-existing teams, such as care plan
  *   team, episode of care team, longitudinal care team.
  * @param contained
  *   \- These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   \- May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param encounter
  *   \- The Encounter during which this CareTeam was created or to which the creation of this record is tightly associated.
  * @param reasonCode
  *   \- Describes why the care team exists.
  * @param implicitRules
  *   \- A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param note
  *   \- Comments made about the CareTeam.
  * @param reasonReference
  *   \- Condition(s) that this care team addresses.
  * @param modifierExtension
  *   \- May be used to represent additional information that is not part of the basic definition of the resource and that
  *   modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *   Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *   strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *   extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *   processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any
  *   elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param identifier
  *   \- Business identifiers assigned to this care team by the performer or other systems which remain constant as the resource
  *   is updated and propagates from server to server.
  * @param managingOrganization
  *   \- The organization responsible for the care team.
  * @param participant
  *   \- Identifies all people and organizations who are expected to be involved in the care team.
  */
@POJOBoilerplate
class UKCore_CareTeam(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-CareTeam"))),
    override val text: Option[Narrative] = None,
    override val name: Option[String] = None,
    override val status: Option[CARE_TEAM_STATUS] = None,
    override val period: Option[Period] = None,
    override val subject: Option[Reference] = None,
    override val telecom: LitSeq[ContactPoint] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    override val category: LitSeq[CodeableConcept] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val encounter: Option[Reference] = None,
    override val reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    override val note: LitSeq[Annotation] = LitSeq.empty,
    override val reasonReference: LitSeq[Reference] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val managingOrganization: LitSeq[Reference] = LitSeq.empty,
    override val participant: LitSeq[CareTeam.Participant] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends CareTeam(
      id = id,
      meta = meta,
      text = text,
      name = name,
      note = note,
      status = status,
      period = period,
      subject = subject,
      telecom = telecom,
      language = language,
      category = category,
      contained = contained,
      extension = extension,
      encounter = encounter,
      identifier = identifier,
      reasonCode = reasonCode,
      implicitRules = implicitRules,
      reasonReference = reasonReference,
      modifierExtension = modifierExtension,
      managingOrganization = managingOrganization,
      participant = participant,
      primitiveAttributes = primitiveAttributes
    ) {
  override val thisTypeName: String = "CareTeam"
}
