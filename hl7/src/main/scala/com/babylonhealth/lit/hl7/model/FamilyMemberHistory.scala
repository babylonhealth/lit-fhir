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
import com.babylonhealth.lit.hl7.HISTORY_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object FamilyMemberHistory extends CompanionFor[FamilyMemberHistory] {
  override val baseType: CompanionFor[FamilyMemberHistory] = FamilyMemberHistory
  object Condition extends CompanionFor[Condition] {
    type OnsetChoice = Choice[Union01727798874]
    def apply(
        id: Option[String] = None,
        code: CodeableConcept,
        note: LitSeq[Annotation] = LitSeq.empty,
        outcome: Option[CodeableConcept] = None,
        onset: Option[Condition.OnsetChoice] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        contributedToDeath: Option[Boolean] = None,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Condition = new Condition(
      id,
      code,
      note,
      outcome,
      onset,
      extension,
      modifierExtension,
      contributedToDeath,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Condition): Option[(Option[String], CodeableConcept, LitSeq[Annotation], Option[CodeableConcept], Option[Condition.OnsetChoice], LitSeq[Extension], LitSeq[Extension], Option[Boolean])] =
      Some((o.id, o.code, o.note, o.outcome, o.onset, o.extension, o.modifierExtension, o.contributedToDeath))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val code: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("code", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
      FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
    val outcome: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("outcome", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val onset: FHIRComponentFieldMeta[Option[Condition.OnsetChoice]] =
      FHIRComponentFieldMeta("onset", lTagOf[Option[Condition.OnsetChoice]], true, lTagOf[Union01727798874])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val contributedToDeath: FHIRComponentFieldMeta[Option[Boolean]] =
      FHIRComponentFieldMeta("contributedToDeath", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, code, note, outcome, onset, extension, modifierExtension, contributedToDeath)
    override def fields(t: Condition): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[CodeableConcept](code, t.code),
      FHIRComponentField[LitSeq[Annotation]](note, t.note),
      FHIRComponentField[Option[CodeableConcept]](outcome, t.outcome),
      FHIRComponentField[Option[Condition.OnsetChoice]](onset, t.onset),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[Boolean]](contributedToDeath, t.contributedToDeath)
    )
    val baseType: CompanionFor[Condition] = this
    val thisName: String                  = "Condition"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Condition] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Condition(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[CodeableConcept]("code", None),
            cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
            cursor.decodeAs[Option[CodeableConcept]]("outcome", Some(None)),
            cursor.decodeOptRef[Union01727798874]("onset"),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Boolean]]("contributedToDeath", Some(None)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Condition(
      override val id: Option[String] = None,
      val code: CodeableConcept,
      val note: LitSeq[Annotation] = LitSeq.empty,
      val outcome: Option[CodeableConcept] = None,
      val onset: Option[Condition.OnsetChoice] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val contributedToDeath: Option[Boolean] = None,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  type AgeChoice      = Choice[Union_1507098327]
  type BornChoice     = Choice[Union01486281057]
  type DeceasedChoice = Choice[Union_0966801288]
  def apply(
      id: Option[String] = None,
      sex: Option[CodeableConcept] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      date: Option[FHIRDateTime] = None,
      name: Option[String] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      status: HISTORY_STATUS,
      age: Option[FamilyMemberHistory.AgeChoice] = None,
      patient: Reference,
      born: Option[FamilyMemberHistory.BornChoice] = None,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
      deceased: Option[FamilyMemberHistory.DeceasedChoice] = None,
      relationship: CodeableConcept,
      estimatedAge: Option[Boolean] = None,
      implicitRules: Option[UriStr] = None,
      instantiatesUri: LitSeq[UriStr] = LitSeq.empty,
      reasonReference: LitSeq[Reference] = LitSeq.empty,
      dataAbsentReason: Option[CodeableConcept] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      instantiatesCanonical: LitSeq[Canonical] = LitSeq.empty,
      condition: LitSeq[FamilyMemberHistory.Condition] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): FamilyMemberHistory = new FamilyMemberHistory(
    id,
    sex,
    meta,
    text,
    date,
    name,
    note,
    status,
    age,
    patient,
    born,
    language,
    contained,
    extension,
    identifier,
    reasonCode,
    deceased,
    relationship,
    estimatedAge,
    implicitRules,
    instantiatesUri,
    reasonReference,
    dataAbsentReason,
    modifierExtension,
    instantiatesCanonical,
    condition,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val sex: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("sex", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val date: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("date", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val name: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("name", lTagOf[Option[String]], false, lTagOf[String])
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val status: FHIRComponentFieldMeta[HISTORY_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[HISTORY_STATUS], false, lTagOf[HISTORY_STATUS])
  val age: FHIRComponentFieldMeta[Option[FamilyMemberHistory.AgeChoice]] =
    FHIRComponentFieldMeta("age", lTagOf[Option[FamilyMemberHistory.AgeChoice]], true, lTagOf[Union_1507098327])
  val patient: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("patient", lTagOf[Reference], false, lTagOf[Reference])
  val born: FHIRComponentFieldMeta[Option[FamilyMemberHistory.BornChoice]] =
    FHIRComponentFieldMeta("born", lTagOf[Option[FamilyMemberHistory.BornChoice]], true, lTagOf[Union01486281057])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val reasonCode: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("reasonCode", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val deceased: FHIRComponentFieldMeta[Option[FamilyMemberHistory.DeceasedChoice]] =
    FHIRComponentFieldMeta(
      "deceased",
      lTagOf[Option[FamilyMemberHistory.DeceasedChoice]],
      true,
      lTagOf[Union_0966801288])
  val relationship: FHIRComponentFieldMeta[CodeableConcept] =
    FHIRComponentFieldMeta("relationship", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
  val estimatedAge: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("estimatedAge", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val instantiatesUri: FHIRComponentFieldMeta[LitSeq[UriStr]] =
    FHIRComponentFieldMeta("instantiatesUri", lTagOf[LitSeq[UriStr]], false, lTagOf[UriStr])
  val reasonReference: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("reasonReference", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val dataAbsentReason: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("dataAbsentReason", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val instantiatesCanonical: FHIRComponentFieldMeta[LitSeq[Canonical]] =
    FHIRComponentFieldMeta("instantiatesCanonical", lTagOf[LitSeq[Canonical]], false, lTagOf[Canonical])
  val condition: FHIRComponentFieldMeta[LitSeq[FamilyMemberHistory.Condition]] =
    FHIRComponentFieldMeta(
      "condition",
      lTagOf[LitSeq[FamilyMemberHistory.Condition]],
      false,
      lTagOf[FamilyMemberHistory.Condition])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    sex,
    meta,
    text,
    date,
    name,
    note,
    status,
    age,
    patient,
    born,
    language,
    contained,
    extension,
    identifier,
    reasonCode,
    deceased,
    relationship,
    estimatedAge,
    implicitRules,
    instantiatesUri,
    reasonReference,
    dataAbsentReason,
    modifierExtension,
    instantiatesCanonical,
    condition
  )
  override def fields(t: FamilyMemberHistory): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[CodeableConcept]](sex, t.sex),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[FHIRDateTime]](date, t.date),
    FHIRComponentField[Option[String]](name, t.name),
    FHIRComponentField[LitSeq[Annotation]](note, t.note),
    FHIRComponentField[HISTORY_STATUS](status, t.status),
    FHIRComponentField[Option[FamilyMemberHistory.AgeChoice]](age, t.age),
    FHIRComponentField[Reference](patient, t.patient),
    FHIRComponentField[Option[FamilyMemberHistory.BornChoice]](born, t.born),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[LitSeq[CodeableConcept]](reasonCode, t.reasonCode),
    FHIRComponentField[Option[FamilyMemberHistory.DeceasedChoice]](deceased, t.deceased),
    FHIRComponentField[CodeableConcept](relationship, t.relationship),
    FHIRComponentField[Option[Boolean]](estimatedAge, t.estimatedAge),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[UriStr]](instantiatesUri, t.instantiatesUri),
    FHIRComponentField[LitSeq[Reference]](reasonReference, t.reasonReference),
    FHIRComponentField[Option[CodeableConcept]](dataAbsentReason, t.dataAbsentReason),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[Canonical]](instantiatesCanonical, t.instantiatesCanonical),
    FHIRComponentField[LitSeq[FamilyMemberHistory.Condition]](condition, t.condition)
  )
  def extractId(t: FamilyMemberHistory): Option[String]                                   = t.id
  def extractSex(t: FamilyMemberHistory): Option[CodeableConcept]                         = t.sex
  def extractMeta(t: FamilyMemberHistory): Option[Meta]                                   = t.meta
  def extractText(t: FamilyMemberHistory): Option[Narrative]                              = t.text
  def extractDate(t: FamilyMemberHistory): Option[FHIRDateTime]                           = t.date
  def extractName(t: FamilyMemberHistory): Option[String]                                 = t.name
  def extractNote(t: FamilyMemberHistory): LitSeq[Annotation]                             = t.note
  def extractStatus(t: FamilyMemberHistory): HISTORY_STATUS                               = t.status
  def extractAge(t: FamilyMemberHistory): Option[FamilyMemberHistory.AgeChoice]           = t.age
  def extractPatient(t: FamilyMemberHistory): Reference                                   = t.patient
  def extractBorn(t: FamilyMemberHistory): Option[FamilyMemberHistory.BornChoice]         = t.born
  def extractLanguage(t: FamilyMemberHistory): Option[LANGUAGES]                          = t.language
  def extractContained(t: FamilyMemberHistory): LitSeq[Resource]                          = t.contained
  def extractExtension(t: FamilyMemberHistory): LitSeq[Extension]                         = t.extension
  def extractIdentifier(t: FamilyMemberHistory): LitSeq[Identifier]                       = t.identifier
  def extractReasonCode(t: FamilyMemberHistory): LitSeq[CodeableConcept]                  = t.reasonCode
  def extractDeceased(t: FamilyMemberHistory): Option[FamilyMemberHistory.DeceasedChoice] = t.deceased
  def extractRelationship(t: FamilyMemberHistory): CodeableConcept                        = t.relationship
  def extractEstimatedAge(t: FamilyMemberHistory): Option[Boolean]                        = t.estimatedAge
  def extractImplicitRules(t: FamilyMemberHistory): Option[UriStr]                        = t.implicitRules
  def extractInstantiatesUri(t: FamilyMemberHistory): LitSeq[UriStr]                      = t.instantiatesUri
  def extractReasonReference(t: FamilyMemberHistory): LitSeq[Reference]                   = t.reasonReference
  def extractDataAbsentReason(t: FamilyMemberHistory): Option[CodeableConcept]            = t.dataAbsentReason
  def extractModifierExtension(t: FamilyMemberHistory): LitSeq[Extension]                 = t.modifierExtension
  def extractInstantiatesCanonical(t: FamilyMemberHistory): LitSeq[Canonical]             = t.instantiatesCanonical
  def extractCondition(t: FamilyMemberHistory): LitSeq[FamilyMemberHistory.Condition]     = t.condition
  override val thisName: String                                                           = "FamilyMemberHistory"
  override val searchParams: Map[String, FamilyMemberHistory => Seq[Any]] = Map(
    "relationship"           -> (obj => Seq(obj.relationship)),
    "date"                   -> (obj => obj.date.toSeq),
    "status"                 -> (obj => Seq(obj.status)),
    "instantiates-uri"       -> (obj => obj.instantiatesUri.toSeq),
    "identifier"             -> (obj => obj.identifier.toSeq),
    "sex"                    -> (obj => obj.sex.toSeq),
    "code"                   -> (obj => obj.condition.map(_.code).toSeq),
    "instantiates-canonical" -> (obj => obj.instantiatesCanonical.toSeq),
    "patient"                -> (obj => Seq(obj.patient))
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[FamilyMemberHistory] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new FamilyMemberHistory(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("sex", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("date", Some(None)),
          cursor.decodeAs[Option[String]]("name", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[HISTORY_STATUS]("status", None),
          cursor.decodeOptRef[Union_1507098327]("age"),
          cursor.decodeAs[Reference]("patient", None),
          cursor.decodeOptRef[Union01486281057]("born"),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("reasonCode", Some(LitSeq.empty)),
          cursor.decodeOptRef[Union_0966801288]("deceased"),
          cursor.decodeAs[CodeableConcept]("relationship", None),
          cursor.decodeAs[Option[Boolean]]("estimatedAge", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[UriStr]]("instantiatesUri", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("reasonReference", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("dataAbsentReason", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Canonical]]("instantiatesCanonical", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[FamilyMemberHistory.Condition]]("condition", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Significant health conditions for a person related to the patient relevant in the context of care for the patient.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields sex, date, name, note, status, age, patient, born, identifier, reasonCode, deceased, relationship, estimatedAge, instantiatesUri, reasonReference, dataAbsentReason, instantiatesCanonical, condition.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param sex - The birth sex of the family member.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param date - The date (and possibly time) when the family member history was recorded or last updated.
  * @param name - This will either be a name or a description; e.g. "Aunt Susan", "my cousin with the red hair".
  * @param note - This property allows a non condition-specific note to the made about the related person. Ideally, the note would be in the condition property, but this is not always possible.
  * @param status - A code specifying the status of the record of the family history of a specific family member.
  * @param age - The age of the relative at the time the family member history is recorded.
  * @param patient - The person who this history concerns.
  * @param born - The actual or approximate date of birth of the relative.
  * @param language - The base language in which the resource is written.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param identifier - Business identifiers assigned to this family member history by the performer or other systems which remain constant as the resource is updated and propagates from server to server.
  * @param reasonCode - Describes why the family member history occurred in coded or textual form.
  * @param deceased - Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record.
  * @param relationship - The type of relationship this person has to the patient (father, mother, brother etc.).
  * @param estimatedAge - If true, indicates that the age value specified is an estimated value.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param instantiatesUri - The URL pointing to an externally maintained protocol, guideline, orderset or other definition that is adhered to in whole or in part by this FamilyMemberHistory.
  * @param reasonReference - Indicates a Condition, Observation, AllergyIntolerance, or QuestionnaireResponse that justifies this family member history event.
  * @param dataAbsentReason - Describes why the family member's history is not available.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param instantiatesCanonical - The URL pointing to a FHIR-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this FamilyMemberHistory.
  * @param condition - The significant Conditions (or condition) that the family member had. This is a repeating section to allow a system to represent more than one condition per resource, though there is nothing stopping multiple resources - one per condition.
  */
@POJOBoilerplate
class FamilyMemberHistory(
    override val id: Option[String] = None,
    val sex: Option[CodeableConcept] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val date: Option[FHIRDateTime] = None,
    val name: Option[String] = None,
    val note: LitSeq[Annotation] = LitSeq.empty,
    val status: HISTORY_STATUS,
    val age: Option[FamilyMemberHistory.AgeChoice] = None,
    val patient: Reference,
    val born: Option[FamilyMemberHistory.BornChoice] = None,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
    val deceased: Option[FamilyMemberHistory.DeceasedChoice] = None,
    val relationship: CodeableConcept,
    val estimatedAge: Option[Boolean] = None,
    override val implicitRules: Option[UriStr] = None,
    val instantiatesUri: LitSeq[UriStr] = LitSeq.empty,
    val reasonReference: LitSeq[Reference] = LitSeq.empty,
    val dataAbsentReason: Option[CodeableConcept] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val instantiatesCanonical: LitSeq[Canonical] = LitSeq.empty,
    val condition: LitSeq[FamilyMemberHistory.Condition] = LitSeq.empty,
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
  override val thisTypeName: String = "FamilyMemberHistory"
}
