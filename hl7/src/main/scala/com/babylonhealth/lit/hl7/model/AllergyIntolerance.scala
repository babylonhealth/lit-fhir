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
import com.babylonhealth.lit.hl7.{
  ALLERGY_INTOLERANCE_CRITICALITY,
  ALLERGY_INTOLERANCE_TYPE,
  REACTION_EVENT_SEVERITY,
  ALLERGY_INTOLERANCE_CATEGORY
}
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object AllergyIntolerance extends CompanionFor[AllergyIntolerance] {
  override type ResourceType = AllergyIntolerance
  override type ParentType   = AllergyIntolerance
  override val baseType: CompanionFor[ResourceType] = AllergyIntolerance
  override val parentType: CompanionFor[ParentType] = AllergyIntolerance
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/AllergyIntolerance")
  object Reaction extends CompanionFor[Reaction] {
    override type ResourceType = Reaction
    override type ParentType   = Reaction
    override val parentType: CompanionFor[ResourceType] = Reaction
    def apply(
        id: Option[String] = None,
        note: LitSeq[Annotation] = LitSeq.empty,
        onset: Option[FHIRDateTime] = None,
        severity: Option[REACTION_EVENT_SEVERITY] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        substance: Option[CodeableConcept] = None,
        description: Option[String] = None,
        manifestation: NonEmptyLitSeq[CodeableConcept],
        exposureRoute: Option[CodeableConcept] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Reaction = new Reaction(
      id,
      note,
      onset,
      severity,
      extension,
      substance,
      description,
      manifestation,
      exposureRoute,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Reaction): Option[(Option[String], LitSeq[Annotation], Option[FHIRDateTime], Option[REACTION_EVENT_SEVERITY], LitSeq[Extension], Option[CodeableConcept], Option[String], NonEmptyLitSeq[CodeableConcept], Option[CodeableConcept], LitSeq[Extension])] =
      Some(
        (
          o.id,
          o.note,
          o.onset,
          o.severity,
          o.extension,
          o.substance,
          o.description,
          o.manifestation,
          o.exposureRoute,
          o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
      FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
    val onset: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
      FHIRComponentFieldMeta("onset", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
    val severity: FHIRComponentFieldMeta[Option[REACTION_EVENT_SEVERITY]] =
      FHIRComponentFieldMeta(
        "severity",
        lTagOf[Option[REACTION_EVENT_SEVERITY]],
        false,
        lTagOf[REACTION_EVENT_SEVERITY])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val substance: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("substance", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val description: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
    val manifestation: FHIRComponentFieldMeta[NonEmptyLitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("manifestation", lTagOf[NonEmptyLitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val exposureRoute: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("exposureRoute", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, note, onset, severity, extension, substance, description, manifestation, exposureRoute, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Reaction): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Annotation]](note, t.note),
      FHIRComponentField[Option[FHIRDateTime]](onset, t.onset),
      FHIRComponentField[Option[REACTION_EVENT_SEVERITY]](severity, t.severity),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[CodeableConcept]](substance, t.substance),
      FHIRComponentField[Option[String]](description, t.description),
      FHIRComponentField[NonEmptyLitSeq[CodeableConcept]](manifestation, t.manifestation),
      FHIRComponentField[Option[CodeableConcept]](exposureRoute, t.exposureRoute),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Reaction] = this
    val thisName: String                 = "Reaction"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Reaction] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Reaction(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
            cursor.decodeAs[Option[FHIRDateTime]]("onset", Some(None)),
            cursor.decodeAs[Option[REACTION_EVENT_SEVERITY]]("severity", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[CodeableConcept]]("substance", Some(None)),
            cursor.decodeAs[Option[String]]("description", Some(None)),
            cursor.decodeAs[NonEmptyLitSeq[CodeableConcept]]("manifestation", None),
            cursor.decodeAs[Option[CodeableConcept]]("exposureRoute", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Reaction(
      override val id: Option[String] = None,
      val note: LitSeq[Annotation] = LitSeq.empty,
      val onset: Option[FHIRDateTime] = None,
      val severity: Option[REACTION_EVENT_SEVERITY] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val substance: Option[CodeableConcept] = None,
      val description: Option[String] = None,
      val manifestation: NonEmptyLitSeq[CodeableConcept],
      val exposureRoute: Option[CodeableConcept] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  type OnsetChoice = Choice[Union01352864625]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      `type`: Option[ALLERGY_INTOLERANCE_TYPE] = None,
      code: Option[CodeableConcept] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      patient: Reference,
      language: Option[LANGUAGES] = None,
      category: LitSeq[ALLERGY_INTOLERANCE_CATEGORY] = LitSeq.empty,
      onset: Option[AllergyIntolerance.OnsetChoice] = None,
      recorder: Option[Reference] = None,
      asserter: Option[Reference] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      encounter: Option[Reference] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      criticality: Option[ALLERGY_INTOLERANCE_CRITICALITY] = None,
      recordedDate: Option[FHIRDateTime] = None,
      implicitRules: Option[UriStr] = None,
      clinicalStatus: Option[CodeableConcept] = None,
      lastOccurrence: Option[FHIRDateTime] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      verificationStatus: Option[CodeableConcept] = None,
      reaction: LitSeq[AllergyIntolerance.Reaction] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): AllergyIntolerance = new AllergyIntolerance(
    id,
    meta,
    text,
    `type`,
    code,
    note,
    patient,
    language,
    category,
    onset,
    recorder,
    asserter,
    contained,
    extension,
    encounter,
    identifier,
    criticality,
    recordedDate,
    implicitRules,
    clinicalStatus,
    lastOccurrence,
    modifierExtension,
    verificationStatus,
    reaction,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val `type`: FHIRComponentFieldMeta[Option[ALLERGY_INTOLERANCE_TYPE]] =
    FHIRComponentFieldMeta("type", lTagOf[Option[ALLERGY_INTOLERANCE_TYPE]], false, lTagOf[ALLERGY_INTOLERANCE_TYPE])
  val code: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("code", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val patient: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("patient", lTagOf[Reference], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val category: FHIRComponentFieldMeta[LitSeq[ALLERGY_INTOLERANCE_CATEGORY]] =
    FHIRComponentFieldMeta(
      "category",
      lTagOf[LitSeq[ALLERGY_INTOLERANCE_CATEGORY]],
      false,
      lTagOf[ALLERGY_INTOLERANCE_CATEGORY])
  val onset: FHIRComponentFieldMeta[Option[AllergyIntolerance.OnsetChoice]] =
    FHIRComponentFieldMeta("onset", lTagOf[Option[AllergyIntolerance.OnsetChoice]], true, lTagOf[Union01352864625])
  val recorder: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("recorder", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val asserter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("asserter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val encounter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("encounter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val criticality: FHIRComponentFieldMeta[Option[ALLERGY_INTOLERANCE_CRITICALITY]] =
    FHIRComponentFieldMeta(
      "criticality",
      lTagOf[Option[ALLERGY_INTOLERANCE_CRITICALITY]],
      false,
      lTagOf[ALLERGY_INTOLERANCE_CRITICALITY])
  val recordedDate: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("recordedDate", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val clinicalStatus: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("clinicalStatus", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val lastOccurrence: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("lastOccurrence", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val verificationStatus: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("verificationStatus", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val reaction: FHIRComponentFieldMeta[LitSeq[AllergyIntolerance.Reaction]] =
    FHIRComponentFieldMeta(
      "reaction",
      lTagOf[LitSeq[AllergyIntolerance.Reaction]],
      false,
      lTagOf[AllergyIntolerance.Reaction])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    `type`,
    code,
    note,
    patient,
    language,
    category,
    onset,
    recorder,
    asserter,
    contained,
    extension,
    encounter,
    identifier,
    criticality,
    recordedDate,
    implicitRules,
    clinicalStatus,
    lastOccurrence,
    modifierExtension,
    verificationStatus,
    reaction
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: AllergyIntolerance): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[ALLERGY_INTOLERANCE_TYPE]](`type`, t.`type`),
    FHIRComponentField[Option[CodeableConcept]](code, t.code),
    FHIRComponentField[LitSeq[Annotation]](note, t.note),
    FHIRComponentField[Reference](patient, t.patient),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[ALLERGY_INTOLERANCE_CATEGORY]](category, t.category),
    FHIRComponentField[Option[AllergyIntolerance.OnsetChoice]](onset, t.onset),
    FHIRComponentField[Option[Reference]](recorder, t.recorder),
    FHIRComponentField[Option[Reference]](asserter, t.asserter),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Reference]](encounter, t.encounter),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[ALLERGY_INTOLERANCE_CRITICALITY]](criticality, t.criticality),
    FHIRComponentField[Option[FHIRDateTime]](recordedDate, t.recordedDate),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[CodeableConcept]](clinicalStatus, t.clinicalStatus),
    FHIRComponentField[Option[FHIRDateTime]](lastOccurrence, t.lastOccurrence),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Option[CodeableConcept]](verificationStatus, t.verificationStatus),
    FHIRComponentField[LitSeq[AllergyIntolerance.Reaction]](reaction, t.reaction)
  )
  def extractId(t: AllergyIntolerance): Option[String]                                   = t.id
  def extractMeta(t: AllergyIntolerance): Option[Meta]                                   = t.meta
  def extractText(t: AllergyIntolerance): Option[Narrative]                              = t.text
  def extractType(t: AllergyIntolerance): Option[ALLERGY_INTOLERANCE_TYPE]               = t.`type`
  def extractCode(t: AllergyIntolerance): Option[CodeableConcept]                        = t.code
  def extractNote(t: AllergyIntolerance): LitSeq[Annotation]                             = t.note
  def extractPatient(t: AllergyIntolerance): Reference                                   = t.patient
  def extractLanguage(t: AllergyIntolerance): Option[LANGUAGES]                          = t.language
  def extractCategory(t: AllergyIntolerance): LitSeq[ALLERGY_INTOLERANCE_CATEGORY]       = t.category
  def extractOnset(t: AllergyIntolerance): Option[AllergyIntolerance.OnsetChoice]        = t.onset
  def extractRecorder(t: AllergyIntolerance): Option[Reference]                          = t.recorder
  def extractAsserter(t: AllergyIntolerance): Option[Reference]                          = t.asserter
  def extractContained(t: AllergyIntolerance): LitSeq[Resource]                          = t.contained
  def extractExtension(t: AllergyIntolerance): LitSeq[Extension]                         = t.extension
  def extractEncounter(t: AllergyIntolerance): Option[Reference]                         = t.encounter
  def extractIdentifier(t: AllergyIntolerance): LitSeq[Identifier]                       = t.identifier
  def extractCriticality(t: AllergyIntolerance): Option[ALLERGY_INTOLERANCE_CRITICALITY] = t.criticality
  def extractRecordedDate(t: AllergyIntolerance): Option[FHIRDateTime]                   = t.recordedDate
  def extractImplicitRules(t: AllergyIntolerance): Option[UriStr]                        = t.implicitRules
  def extractClinicalStatus(t: AllergyIntolerance): Option[CodeableConcept]              = t.clinicalStatus
  def extractLastOccurrence(t: AllergyIntolerance): Option[FHIRDateTime]                 = t.lastOccurrence
  def extractModifierExtension(t: AllergyIntolerance): LitSeq[Extension]                 = t.modifierExtension
  def extractVerificationStatus(t: AllergyIntolerance): Option[CodeableConcept]          = t.verificationStatus
  def extractReaction(t: AllergyIntolerance): LitSeq[AllergyIntolerance.Reaction]        = t.reaction
  override val thisName: String                                                          = "AllergyIntolerance"
  override val searchParams: Map[String, AllergyIntolerance => Seq[Any]] = Map(
    "identifier"      -> (obj => obj.identifier.toSeq),
    "clinical-status" -> (obj => obj.clinicalStatus.toSeq),
    "category"        -> (obj => obj.category.toSeq),
    "type"            -> (obj => obj.`type`.toSeq),
    "criticality"     -> (obj => obj.criticality.toSeq),
    "asserter"        -> (obj => obj.asserter.toSeq),
    "code" -> (obj =>
      obj.code.toSeq ++
        obj.reaction.flatMap(_.substance).toSeq),
    "verification-status" -> (obj => obj.verificationStatus.toSeq),
    "date"                -> (obj => obj.recordedDate.toSeq),
    "manifestation"       -> (obj => obj.reaction.flatMap(_.manifestation).toSeq),
    "onset"               -> (obj => obj.reaction.flatMap(_.onset).toSeq),
    "severity"            -> (obj => obj.reaction.flatMap(_.severity).toSeq),
    "route"               -> (obj => obj.reaction.flatMap(_.exposureRoute).toSeq),
    "last-date"           -> (obj => obj.lastOccurrence.toSeq),
    "recorder"            -> (obj => obj.recorder.toSeq),
    "patient"             -> (obj => Seq(obj.patient))
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[AllergyIntolerance] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new AllergyIntolerance(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[ALLERGY_INTOLERANCE_TYPE]]("type", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("code", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[Reference]("patient", None),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[ALLERGY_INTOLERANCE_CATEGORY]]("category", Some(LitSeq.empty)),
          cursor.decodeOptRef[Union01352864625]("onset"),
          cursor.decodeAs[Option[Reference]]("recorder", Some(None)),
          cursor.decodeAs[Option[Reference]]("asserter", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[ALLERGY_INTOLERANCE_CRITICALITY]]("criticality", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("recordedDate", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("clinicalStatus", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("lastOccurrence", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("verificationStatus", Some(None)),
          cursor.decodeAs[LitSeq[AllergyIntolerance.Reaction]]("reaction", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields `type`, code, note, patient, category, onset, recorder, asserter, encounter, identifier, criticality, recordedDate, clinicalStatus, lastOccurrence, verificationStatus, reaction.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param `type` - Identification of the underlying physiological mechanism for the reaction risk.
  * @param code - Code for an allergy or intolerance statement (either a positive or a negated/excluded statement).  This may be a code for a substance or pharmaceutical product that is considered to be responsible for the adverse reaction risk (e.g., "Latex"), an allergy or intolerance condition (e.g., "Latex allergy"), or a negated/excluded code for a specific substance or class (e.g., "No latex allergy") or a general or categorical negated statement (e.g.,  "No known allergy", "No known drug allergies").  Note: the substance for a specific reaction may be different from the substance identified as the cause of the risk, but it must be consistent with it. For instance, it may be a more specific substance (e.g. a brand medication) or a composite product that includes the identified substance. It must be clinically safe to only process the 'code' and ignore the 'reaction.substance'.  If a receiving system is unable to confirm that AllergyIntolerance.reaction.substance falls within the semantic scope of AllergyIntolerance.code, then the receiving system should ignore AllergyIntolerance.reaction.substance.
  * @param note - Additional narrative about the propensity for the Adverse Reaction, not captured in other fields.
  * @param patient - The patient who has the allergy or intolerance.
  * @param language - The base language in which the resource is written.
  * @param category - Category of the identified substance.
  * @param onset - Estimated or actual date,  date-time, or age when allergy or intolerance was identified.
  * @param recorder - Individual who recorded the record and takes responsibility for its content.
  * @param asserter - The source of the information about the allergy that is recorded.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param encounter - The encounter when the allergy or intolerance was asserted.
  * @param identifier - Business identifiers assigned to this AllergyIntolerance by the performer or other systems which remain constant as the resource is updated and propagates from server to server.
  * @param criticality - Estimate of the potential clinical harm, or seriousness, of the reaction to the identified substance.
  * @param recordedDate - The recordedDate represents when this particular AllergyIntolerance record was created in the system, which is often a system-generated date.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param clinicalStatus - The clinical status of the allergy or intolerance.
  * @param lastOccurrence - Represents the date and/or time of the last known occurrence of a reaction event.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param verificationStatus - Assertion about certainty associated with the propensity, or potential risk, of a reaction to the identified substance (including pharmaceutical product).
  * @param reaction - Details about each adverse reaction event linked to exposure to the identified substance.
  */
@POJOBoilerplate
class AllergyIntolerance(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val `type`: Option[ALLERGY_INTOLERANCE_TYPE] = None,
    val code: Option[CodeableConcept] = None,
    val note: LitSeq[Annotation] = LitSeq.empty,
    val patient: Reference,
    override val language: Option[LANGUAGES] = None,
    val category: LitSeq[ALLERGY_INTOLERANCE_CATEGORY] = LitSeq.empty,
    val onset: Option[AllergyIntolerance.OnsetChoice] = None,
    val recorder: Option[Reference] = None,
    val asserter: Option[Reference] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val encounter: Option[Reference] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val criticality: Option[ALLERGY_INTOLERANCE_CRITICALITY] = None,
    val recordedDate: Option[FHIRDateTime] = None,
    override val implicitRules: Option[UriStr] = None,
    val clinicalStatus: Option[CodeableConcept] = None,
    val lastOccurrence: Option[FHIRDateTime] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val verificationStatus: Option[CodeableConcept] = None,
    val reaction: LitSeq[AllergyIntolerance.Reaction] = LitSeq.empty,
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
  override val thisTypeName: String = "AllergyIntolerance"
}
