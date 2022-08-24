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
import com.babylonhealth.lit.hl7.MEDICATION_STATEMENT_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, ukcore }
import com.babylonhealth.lit.macros.POJOBoilerplate

object UKCore_MedicationStatement extends CompanionFor[UKCore_MedicationStatement] {
  implicit def summonObjectAndCompanionUKCore_MedicationStatement1049608529(
      o: UKCore_MedicationStatement): ObjectAndCompanion[UKCore_MedicationStatement, UKCore_MedicationStatement.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = MedicationStatement
  override type ParentType   = MedicationStatement
  override val baseType: CompanionFor[ResourceType] = MedicationStatement
  override val parentType: CompanionFor[ParentType] = MedicationStatement
  override val profileUrl: Option[String] = Some("https://fhir.hl7.org.uk/StructureDefinition/UKCore-MedicationStatement")
  type EffectiveChoice  = Choice[UnionDateTimeOrPeriod]
  type MedicationChoice = Choice[UnionCodeableConceptOrReference]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(
        new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-MedicationStatement"))),
      text: Option[Narrative] = None,
      status: MEDICATION_STATEMENT_STATUS,
      language: Option[LANGUAGES] = None,
      category: Option[CodeableConcept] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
      statusReason: LitSeq[CodeableConcept] = LitSeq.empty,
      effective: Option[UKCore_MedicationStatement.EffectiveChoice] = None,
      dateAsserted: Option[FHIRDateTime] = None,
      implicitRules: Option[UriStr] = None,
      medication: UKCore_MedicationStatement.MedicationChoice,
      note: LitSeq[Annotation] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      partOf: LitSeq[Reference] = LitSeq.empty,
      basedOn: LitSeq[Reference] = LitSeq.empty,
      subject: Reference,
      context: Option[Reference] = None,
      dosage: LitSeq[Dosage] = LitSeq.empty,
      derivedFrom: LitSeq[Reference] = LitSeq.empty,
      reasonReference: LitSeq[Reference] = LitSeq.empty,
      informationSource: Option[Reference] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): UKCore_MedicationStatement = new UKCore_MedicationStatement(
    id,
    meta,
    text,
    status,
    language,
    category,
    contained,
    extension,
    reasonCode,
    statusReason,
    effective,
    dateAsserted,
    implicitRules,
    medication,
    note,
    modifierExtension,
    identifier,
    partOf,
    basedOn,
    subject,
    context,
    dosage,
    derivedFrom,
    reasonReference,
    informationSource,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val status: FHIRComponentFieldMeta[MEDICATION_STATEMENT_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[MEDICATION_STATEMENT_STATUS], false, lTagOf[MEDICATION_STATEMENT_STATUS])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val category: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("category", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val reasonCode: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("reasonCode", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val statusReason: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("statusReason", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val effective: FHIRComponentFieldMeta[Option[UKCore_MedicationStatement.EffectiveChoice]] =
    FHIRComponentFieldMeta(
      "effective",
      lTagOf[Option[UKCore_MedicationStatement.EffectiveChoice]],
      true,
      lTagOf[UnionDateTimeOrPeriod])
  val dateAsserted: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("dateAsserted", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val medication: FHIRComponentFieldMeta[UKCore_MedicationStatement.MedicationChoice] =
    FHIRComponentFieldMeta(
      "medication",
      lTagOf[UKCore_MedicationStatement.MedicationChoice],
      true,
      lTagOf[UnionCodeableConceptOrReference])
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val partOf: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("partOf", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val basedOn: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("basedOn", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val subject: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("subject", lTagOf[Reference], false, lTagOf[Reference])
  val context: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("context", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val dosage: FHIRComponentFieldMeta[LitSeq[Dosage]] =
    FHIRComponentFieldMeta("dosage", lTagOf[LitSeq[Dosage]], false, lTagOf[Dosage])
  val derivedFrom: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("derivedFrom", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val reasonReference: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("reasonReference", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val informationSource: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("informationSource", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    status,
    language,
    category,
    contained,
    extension,
    reasonCode,
    statusReason,
    effective,
    dateAsserted,
    implicitRules,
    medication,
    note,
    modifierExtension,
    identifier,
    partOf,
    basedOn,
    subject,
    context,
    dosage,
    derivedFrom,
    reasonReference,
    informationSource
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Meta]](meta, t.meta),
      FHIRComponentField[Option[Narrative]](text, t.text),
      FHIRComponentField[MEDICATION_STATEMENT_STATUS](status, t.status),
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[Option[CodeableConcept]](category, t.category),
      FHIRComponentField[LitSeq[Resource]](contained, t.contained),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[CodeableConcept]](reasonCode, t.reasonCode),
      FHIRComponentField[LitSeq[CodeableConcept]](statusReason, t.statusReason),
      FHIRComponentField[Option[UKCore_MedicationStatement.EffectiveChoice]](effective, t.effective),
      FHIRComponentField[Option[FHIRDateTime]](dateAsserted, t.dateAsserted),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[UKCore_MedicationStatement.MedicationChoice](medication, t.medication),
      FHIRComponentField[LitSeq[Annotation]](note, t.note),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
      FHIRComponentField[LitSeq[Reference]](partOf, t.partOf),
      FHIRComponentField[LitSeq[Reference]](basedOn, t.basedOn),
      FHIRComponentField[Reference](subject, t.subject),
      FHIRComponentField[Option[Reference]](context, t.context),
      FHIRComponentField[LitSeq[Dosage]](dosage, t.dosage),
      FHIRComponentField[LitSeq[Reference]](derivedFrom, t.derivedFrom),
      FHIRComponentField[LitSeq[Reference]](reasonReference, t.reasonReference),
      FHIRComponentField[Option[Reference]](informationSource, t.informationSource)
    ))
  override def fields(t: UKCore_MedicationStatement): Seq[FHIRComponentField[_]]  = fieldsFromParent(t).get
  def extractId(t: UKCore_MedicationStatement): Option[String]                    = t.id
  def extractMeta(t: UKCore_MedicationStatement): Option[Meta]                    = t.meta
  def extractText(t: UKCore_MedicationStatement): Option[Narrative]               = t.text
  def extractStatus(t: UKCore_MedicationStatement): MEDICATION_STATEMENT_STATUS   = t.status
  def extractLanguage(t: UKCore_MedicationStatement): Option[LANGUAGES]           = t.language
  def extractCategory(t: UKCore_MedicationStatement): Option[CodeableConcept]     = t.category
  def extractContained(t: UKCore_MedicationStatement): LitSeq[Resource]           = t.contained
  def extractExtension(t: UKCore_MedicationStatement): LitSeq[Extension]          = t.extension
  def extractReasonCode(t: UKCore_MedicationStatement): LitSeq[CodeableConcept]   = t.reasonCode
  def extractStatusReason(t: UKCore_MedicationStatement): LitSeq[CodeableConcept] = t.statusReason
  def extractEffective(t: UKCore_MedicationStatement): Option[UKCore_MedicationStatement.EffectiveChoice] = t.effective
  def extractDateAsserted(t: UKCore_MedicationStatement): Option[FHIRDateTime]                            = t.dateAsserted
  def extractImplicitRules(t: UKCore_MedicationStatement): Option[UriStr]                                 = t.implicitRules
  def extractMedication(t: UKCore_MedicationStatement): UKCore_MedicationStatement.MedicationChoice       = t.medication
  def extractNote(t: UKCore_MedicationStatement): LitSeq[Annotation]                                      = t.note
  def extractModifierExtension(t: UKCore_MedicationStatement): LitSeq[Extension]                          = t.modifierExtension
  def extractIdentifier(t: UKCore_MedicationStatement): LitSeq[Identifier]                                = t.identifier
  def extractPartOf(t: UKCore_MedicationStatement): LitSeq[Reference]                                     = t.partOf
  def extractBasedOn(t: UKCore_MedicationStatement): LitSeq[Reference]                                    = t.basedOn
  def extractSubject(t: UKCore_MedicationStatement): Reference                                            = t.subject
  def extractContext(t: UKCore_MedicationStatement): Option[Reference]                                    = t.context
  def extractDosage(t: UKCore_MedicationStatement): LitSeq[Dosage]                                        = t.dosage
  def extractDerivedFrom(t: UKCore_MedicationStatement): LitSeq[Reference]                                = t.derivedFrom
  def extractReasonReference(t: UKCore_MedicationStatement): LitSeq[Reference]                            = t.reasonReference
  def extractInformationSource(t: UKCore_MedicationStatement): Option[Reference]                          = t.informationSource
  override val thisName: String                                                  = "UKCore_MedicationStatement"
  override val searchParams: Map[String, UKCore_MedicationStatement => Seq[Any]] = MedicationStatement.searchParams
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[UKCore_MedicationStatement] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new UKCore_MedicationStatement(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[MEDICATION_STATEMENT_STATUS]("status", None),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("category", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("reasonCode", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("statusReason", Some(LitSeq.empty)),
          cursor.decodeOptRef[UnionDateTimeOrPeriod]("effective"),
          cursor.decodeAs[Option[FHIRDateTime]]("dateAsserted", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeRef[UnionCodeableConceptOrReference]("medication"),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("partOf", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("basedOn", Some(LitSeq.empty)),
          cursor.decodeAs[Reference]("subject", None),
          cursor.decodeAs[Option[Reference]]("context", Some(None)),
          cursor.decodeAs[LitSeq[Dosage]]("dosage", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("derivedFrom", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("reasonReference", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("informationSource", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** Defines the UK Core constraints and extensions on the MedicationStatement resource for the minimal set of data to query and
  * retrieve medication statement information.
  *
  * Subclass of [[hl7.model.MedicationStatement]] (A record of a medication that is being consumed by a patient. A
  * MedicationStatement may indicate that the patient may be taking the medication now or has taken the medication in the past or
  * will be taking the medication in the future. The source of this information can be the patient, significant other (such as a
  * family member or spouse), or a clinician. A common scenario where this information is captured is during the history taking
  * process during a patient visit or stay. The medication information may come from sources such as the patient's memory, from a
  * prescription bottle, or from a list of medications the patient, clinician or other party maintains. The primary difference
  * between a medication statement and a medication administration is that the medication administration has complete
  * administration information and is based on actual administration information from the person who administered the medication.
  * A medication statement is often, if not always, less specific. There is no required date/time when the medication was
  * administered, in fact we only know that a source has reported the patient is taking this medication, where details such as
  * time, quantity, or rate or even medication product may be incomplete or missing or less precise. As stated earlier, the
  * medication statement information may come from the patient's memory, from a prescription bottle or from a list of medications
  * the patient, clinician or other party maintains. Medication administration is more formal and is not missing detailed
  * information.)
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
  * @param status
  *   \- A code representing the patient or other source's judgment about the state of the medication used that this statement is
  *   about. Generally, this will be active or completed.
  * @param language
  *   \- The base language in which the resource is written.
  * @param category
  *   \- Indicates where the medication is expected to be consumed or administered.
  * @param contained
  *   \- These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   \- May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param reasonCode
  *   \- A reason for why the medication is being/was taken.
  * @param statusReason
  *   \- Captures the reason for the current state of the MedicationStatement.
  * @param effective
  *   \- The interval of time during which it is being asserted that the patient is/was/will be taking the medication (or was not
  *   taking, when the MedicationStatement.taken element is No).
  * @param dateAsserted
  *   \- The date when the medication statement was asserted by the information source.
  * @param implicitRules
  *   \- A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param medication
  *   \- Identifies the medication being administered. This is either a link to a resource representing the details of the
  *   medication or a simple attribute carrying a code that identifies the medication from a known list of medications.
  * @param note
  *   \- Provides extra information about the medication statement that is not conveyed by the other attributes.
  * @param modifierExtension
  *   \- May be used to represent additional information that is not part of the basic definition of the resource and that
  *   modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *   Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *   strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *   extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *   processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any
  *   elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param identifier
  *   \- Identifiers associated with this Medication Statement that are defined by business processes and/or used to refer to it
  *   when a direct URL reference to the resource itself is not appropriate. They are business identifiers assigned to this
  *   resource by the performer or other systems and remain constant as the resource is updated and propagates from server to
  *   server.
  * @param partOf
  *   \- A larger event of which this particular event is a component or step.
  * @param basedOn
  *   \- A plan, proposal or order that is fulfilled in whole or in part by this event.
  * @param subject
  *   \- The person, animal or group who is/was taking the medication.
  * @param context
  *   \- The encounter or episode of care that establishes the context for this MedicationStatement.
  * @param dosage
  *   \- Indicates how the medication is/was or should be taken by the patient.
  * @param derivedFrom
  *   \- Allows linking the MedicationStatement to the underlying MedicationRequest, or to other information that supports or is
  *   used to derive the MedicationStatement.
  * @param reasonReference
  *   \- Condition or observation that supports why the medication is being/was taken.
  * @param informationSource
  *   \- The person or organization that provided the information about the taking of this medication. Note: Use derivedFrom when
  *   a MedicationStatement is derived from other resources, e.g. Claim or MedicationRequest.
  */
@POJOBoilerplate
class UKCore_MedicationStatement(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-MedicationStatement"))),
    override val text: Option[Narrative] = None,
    override val status: MEDICATION_STATEMENT_STATUS,
    override val language: Option[LANGUAGES] = None,
    override val category: Option[CodeableConcept] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
    override val statusReason: LitSeq[CodeableConcept] = LitSeq.empty,
    override val effective: Option[UKCore_MedicationStatement.EffectiveChoice] = None,
    override val dateAsserted: Option[FHIRDateTime] = None,
    override val implicitRules: Option[UriStr] = None,
    override val medication: UKCore_MedicationStatement.MedicationChoice,
    override val note: LitSeq[Annotation] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val partOf: LitSeq[Reference] = LitSeq.empty,
    override val basedOn: LitSeq[Reference] = LitSeq.empty,
    override val subject: Reference,
    override val context: Option[Reference] = None,
    override val dosage: LitSeq[Dosage] = LitSeq.empty,
    override val derivedFrom: LitSeq[Reference] = LitSeq.empty,
    override val reasonReference: LitSeq[Reference] = LitSeq.empty,
    override val informationSource: Option[Reference] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends MedicationStatement(
      id = id,
      meta = meta,
      text = text,
      note = note,
      partOf = partOf,
      status = status,
      dosage = dosage,
      basedOn = basedOn,
      subject = subject,
      context = context,
      language = language,
      category = category,
      contained = contained,
      extension = extension,
      identifier = identifier,
      reasonCode = reasonCode,
      derivedFrom = derivedFrom,
      statusReason = statusReason,
      effective = effective,
      dateAsserted = dateAsserted,
      implicitRules = implicitRules,
      medication = medication,
      reasonReference = reasonReference,
      modifierExtension = modifierExtension,
      informationSource = informationSource,
      primitiveAttributes = primitiveAttributes
    ) {
  override val thisTypeName: String = "MedicationStatement"
}
