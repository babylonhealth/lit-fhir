package com.babylonhealth.lit.uscore.model

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
import com.babylonhealth.lit.usbase.model._
import com.babylonhealth.lit.core.UnionAliases._
import com.babylonhealth.lit.hl7.UnionAliases._
import com.babylonhealth.lit.usbase.UnionAliases._
import com.babylonhealth.lit.hl7.CARE_TEAM_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, usbase, uscore }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Us_core_careteam extends CompanionFor[Us_core_careteam] {
  override val baseType: CompanionFor[CareTeam] = CareTeam
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(
        new Meta(profile = LitSeq("http://hl7.org/fhir/us/core/StructureDefinition/us-core-careteam"))),
      text: Option[Narrative] = None,
      name: Option[String] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      status: Option[CARE_TEAM_STATUS] = None,
      period: Option[Period] = None,
      subject: Reference,
      telecom: LitSeq[ContactPoint] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      category: LitSeq[CodeableConcept] = LitSeq.empty,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      encounter: Option[Reference] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      reasonReference: LitSeq[Reference] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      managingOrganization: LitSeq[Reference] = LitSeq.empty,
      participant: NonEmptyLitSeq[CareTeam.Participant],
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Us_core_careteam = new Us_core_careteam(
    id,
    meta,
    text,
    name,
    note,
    status,
    period,
    subject,
    telecom,
    language,
    category,
    contained,
    extension,
    encounter,
    identifier,
    reasonCode,
    implicitRules,
    reasonReference,
    modifierExtension,
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
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val status: FHIRComponentFieldMeta[Option[CARE_TEAM_STATUS]] =
    FHIRComponentFieldMeta("status", lTagOf[Option[CARE_TEAM_STATUS]], false, lTagOf[CARE_TEAM_STATUS])
  val period: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("period", lTagOf[Option[Period]], false, lTagOf[Period])
  val subject: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("subject", lTagOf[Reference], false, lTagOf[Reference])
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
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val reasonCode: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("reasonCode", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val reasonReference: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("reasonReference", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val managingOrganization: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("managingOrganization", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val participant: FHIRComponentFieldMeta[NonEmptyLitSeq[CareTeam.Participant]] =
    FHIRComponentFieldMeta(
      "participant",
      lTagOf[NonEmptyLitSeq[CareTeam.Participant]],
      false,
      lTagOf[CareTeam.Participant])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    name,
    note,
    status,
    period,
    subject,
    telecom,
    language,
    category,
    contained,
    extension,
    encounter,
    identifier,
    reasonCode,
    implicitRules,
    reasonReference,
    modifierExtension,
    managingOrganization,
    participant
  )
  override def fields(t: Us_core_careteam): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[String]](name, t.name),
    FHIRComponentField[LitSeq[Annotation]](note, t.note),
    FHIRComponentField[Option[CARE_TEAM_STATUS]](status, t.status),
    FHIRComponentField[Option[Period]](period, t.period),
    FHIRComponentField[Reference](subject, t.subject.get),
    FHIRComponentField[LitSeq[ContactPoint]](telecom, t.telecom),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[CodeableConcept]](category, t.category),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Reference]](encounter, t.encounter),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[LitSeq[CodeableConcept]](reasonCode, t.reasonCode),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Reference]](reasonReference, t.reasonReference),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[Reference]](managingOrganization, t.managingOrganization),
    FHIRComponentField[NonEmptyLitSeq[CareTeam.Participant]](participant, t.participant.asNonEmpty)
  )
  def extractId(t: Us_core_careteam): Option[String]                                = t.id
  def extractMeta(t: Us_core_careteam): Option[Meta]                                = t.meta
  def extractText(t: Us_core_careteam): Option[Narrative]                           = t.text
  def extractName(t: Us_core_careteam): Option[String]                              = t.name
  def extractNote(t: Us_core_careteam): LitSeq[Annotation]                          = t.note
  def extractStatus(t: Us_core_careteam): Option[CARE_TEAM_STATUS]                  = t.status
  def extractPeriod(t: Us_core_careteam): Option[Period]                            = t.period
  def extractSubject(t: Us_core_careteam): Reference                                = t.subject.get
  def extractTelecom(t: Us_core_careteam): LitSeq[ContactPoint]                     = t.telecom
  def extractLanguage(t: Us_core_careteam): Option[LANGUAGES]                       = t.language
  def extractCategory(t: Us_core_careteam): LitSeq[CodeableConcept]                 = t.category
  def extractContained(t: Us_core_careteam): LitSeq[Resource]                       = t.contained
  def extractExtension(t: Us_core_careteam): LitSeq[Extension]                      = t.extension
  def extractEncounter(t: Us_core_careteam): Option[Reference]                      = t.encounter
  def extractIdentifier(t: Us_core_careteam): LitSeq[Identifier]                    = t.identifier
  def extractReasonCode(t: Us_core_careteam): LitSeq[CodeableConcept]               = t.reasonCode
  def extractImplicitRules(t: Us_core_careteam): Option[UriStr]                     = t.implicitRules
  def extractReasonReference(t: Us_core_careteam): LitSeq[Reference]                = t.reasonReference
  def extractModifierExtension(t: Us_core_careteam): LitSeq[Extension]              = t.modifierExtension
  def extractManagingOrganization(t: Us_core_careteam): LitSeq[Reference]           = t.managingOrganization
  def extractParticipant(t: Us_core_careteam): NonEmptyLitSeq[CareTeam.Participant] = t.participant.asNonEmpty
  override val thisName: String                                                     = "Us_core_careteam"
  override val searchParams: Map[String, Us_core_careteam => Seq[Any]]              = CareTeam.searchParams
  def unapply(
      o: Us_core_careteam): Option[(Option[String], Option[Meta], Option[Narrative], Option[String], LitSeq[Annotation], Option[CARE_TEAM_STATUS], Option[Period], Reference, LitSeq[ContactPoint], Option[LANGUAGES], LitSeq[CodeableConcept], LitSeq[Resource], LitSeq[Extension], Option[Reference], LitSeq[Identifier], LitSeq[CodeableConcept], Option[UriStr], LitSeq[Reference], LitSeq[Extension], LitSeq[Reference], NonEmptyLitSeq[CareTeam.Participant])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.name,
        o.note,
        o.status,
        o.period,
        o.subject.get,
        o.telecom,
        o.language,
        o.category,
        o.contained,
        o.extension,
        o.encounter,
        o.identifier,
        o.reasonCode,
        o.implicitRules,
        o.reasonReference,
        o.modifierExtension,
        o.managingOrganization,
        o.participant.asNonEmpty))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Us_core_careteam] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Us_core_careteam(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[String]]("name", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CARE_TEAM_STATUS]]("status", Some(None)),
          cursor.decodeAs[Option[Period]]("period", Some(None)),
          cursor.decodeAs[Reference]("subject", None),
          cursor.decodeAs[LitSeq[ContactPoint]]("telecom", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("category", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("reasonCode", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("reasonReference", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("managingOrganization", Some(LitSeq.empty)),
          cursor.decodeAs[NonEmptyLitSeq[CareTeam.Participant]]("participant", None),
          decodeAttributes(cursor)
        )
      ))
}

/** Defines constraints and extensions on the CareTeam resource for the minimal set of data to query and retrieve a patient's Care Team.
  *
  *  Subclass of [[hl7.model.CareTeam]] (The Care Team includes all the people and organizations who plan to participate in the coordination and delivery of care for a patient.)
  *
  * @constructor Inherits all params from parent.
  *              Requires the following fields which were optional in the parent: subject, participant.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param name - A label for human use intended to distinguish like teams.  E.g. the "red" vs. "green" trauma teams.
  * @param note - Comments made about the CareTeam.
  * @param status - Indicates the current state of the care team.
  * @param period - Indicates when the team did (or is intended to) come into effect and end.
  * @param subject - Identifies the patient or group whose intended care is handled by the team.
  * @param telecom - A central contact detail for the care team (that applies to all members).
  * @param language - The base language in which the resource is written.
  * @param category - Identifies what kind of team.  This is to support differentiation between multiple co-existing teams, such as care plan team, episode of care team, longitudinal care team.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param encounter - The Encounter during which this CareTeam was created or to which the creation of this record is tightly associated.
  * @param identifier - Business identifiers assigned to this care team by the performer or other systems which remain constant as the resource is updated and propagates from server to server.
  * @param reasonCode - Describes why the care team exists.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param reasonReference - Condition(s) that this care team addresses.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param managingOrganization - The organization responsible for the care team.
  * @param participant - Identifies all people and organizations who are expected to be involved in the care team.
  */
@POJOBoilerplate
class Us_core_careteam(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("http://hl7.org/fhir/us/core/StructureDefinition/us-core-careteam"))),
    override val text: Option[Narrative] = None,
    override val name: Option[String] = None,
    override val note: LitSeq[Annotation] = LitSeq.empty,
    override val status: Option[CARE_TEAM_STATUS] = None,
    override val period: Option[Period] = None,
    subject: Reference,
    override val telecom: LitSeq[ContactPoint] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    override val category: LitSeq[CodeableConcept] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val encounter: Option[Reference] = None,
    override val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    override val reasonReference: LitSeq[Reference] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val managingOrganization: LitSeq[Reference] = LitSeq.empty,
    participant: NonEmptyLitSeq[CareTeam.Participant],
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends CareTeam(
      id = id,
      meta = meta,
      text = text,
      name = name,
      note = note,
      status = status,
      period = period,
      subject = Some(subject),
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
      participant = participant.refine,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "CareTeam"
}
