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
import com.babylonhealth.lit.hl7.MEDICATION_STATEMENT_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object MedicationStatement extends CompanionFor[MedicationStatement] {
  implicit def summonObjectAndCompanionMedicationStatement1962705227(
      o: MedicationStatement): ObjectAndCompanion[MedicationStatement, MedicationStatement.type] = ObjectAndCompanion(o, this)
  override type ResourceType = MedicationStatement
  override type ParentType   = MedicationStatement
  override val baseType: CompanionFor[ResourceType] = MedicationStatement
  override val parentType: CompanionFor[ParentType] = MedicationStatement
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/MedicationStatement")
  type EffectiveChoice  = Choice[UnionDateTimeOrPeriod]
  type MedicationChoice = Choice[UnionCodeableConceptOrReference]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      partOf: LitSeq[Reference] = LitSeq.empty,
      status: MEDICATION_STATEMENT_STATUS,
      dosage: LitSeq[Dosage] = LitSeq.empty,
      basedOn: LitSeq[Reference] = LitSeq.empty,
      subject: Reference,
      context: Option[Reference] = None,
      language: Option[LANGUAGES] = None,
      category: Option[CodeableConcept] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
      derivedFrom: LitSeq[Reference] = LitSeq.empty,
      statusReason: LitSeq[CodeableConcept] = LitSeq.empty,
      effective: Option[MedicationStatement.EffectiveChoice] = None,
      dateAsserted: Option[FHIRDateTime] = None,
      implicitRules: Option[UriStr] = None,
      medication: MedicationStatement.MedicationChoice,
      reasonReference: LitSeq[Reference] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      informationSource: Option[Reference] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): MedicationStatement = new MedicationStatement(
    id,
    meta,
    text,
    note,
    partOf,
    status,
    dosage,
    basedOn,
    subject,
    context,
    language,
    category,
    contained,
    extension,
    identifier,
    reasonCode,
    derivedFrom,
    statusReason,
    effective,
    dateAsserted,
    implicitRules,
    medication,
    reasonReference,
    modifierExtension,
    informationSource,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val partOf: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("partOf", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val status: FHIRComponentFieldMeta[MEDICATION_STATEMENT_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[MEDICATION_STATEMENT_STATUS], false, lTagOf[MEDICATION_STATEMENT_STATUS])
  val dosage: FHIRComponentFieldMeta[LitSeq[Dosage]] =
    FHIRComponentFieldMeta("dosage", lTagOf[LitSeq[Dosage]], false, lTagOf[Dosage])
  val basedOn: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("basedOn", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val subject: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("subject", lTagOf[Reference], false, lTagOf[Reference])
  val context: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("context", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val category: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("category", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val reasonCode: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("reasonCode", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val derivedFrom: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("derivedFrom", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val statusReason: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("statusReason", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val effective: FHIRComponentFieldMeta[Option[MedicationStatement.EffectiveChoice]] =
    FHIRComponentFieldMeta("effective", lTagOf[Option[MedicationStatement.EffectiveChoice]], true, lTagOf[UnionDateTimeOrPeriod])
  val dateAsserted: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("dateAsserted", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val medication: FHIRComponentFieldMeta[MedicationStatement.MedicationChoice] =
    FHIRComponentFieldMeta(
      "medication",
      lTagOf[MedicationStatement.MedicationChoice],
      true,
      lTagOf[UnionCodeableConceptOrReference])
  val reasonReference: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("reasonReference", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val informationSource: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("informationSource", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    note,
    partOf,
    status,
    dosage,
    basedOn,
    subject,
    context,
    language,
    category,
    contained,
    extension,
    identifier,
    reasonCode,
    derivedFrom,
    statusReason,
    effective,
    dateAsserted,
    implicitRules,
    medication,
    reasonReference,
    modifierExtension,
    informationSource
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: MedicationStatement): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[LitSeq[Annotation]](note, t.note),
    FHIRComponentField[LitSeq[Reference]](partOf, t.partOf),
    FHIRComponentField[MEDICATION_STATEMENT_STATUS](status, t.status),
    FHIRComponentField[LitSeq[Dosage]](dosage, t.dosage),
    FHIRComponentField[LitSeq[Reference]](basedOn, t.basedOn),
    FHIRComponentField[Reference](subject, t.subject),
    FHIRComponentField[Option[Reference]](context, t.context),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Option[CodeableConcept]](category, t.category),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[LitSeq[CodeableConcept]](reasonCode, t.reasonCode),
    FHIRComponentField[LitSeq[Reference]](derivedFrom, t.derivedFrom),
    FHIRComponentField[LitSeq[CodeableConcept]](statusReason, t.statusReason),
    FHIRComponentField[Option[MedicationStatement.EffectiveChoice]](effective, t.effective),
    FHIRComponentField[Option[FHIRDateTime]](dateAsserted, t.dateAsserted),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[MedicationStatement.MedicationChoice](medication, t.medication),
    FHIRComponentField[LitSeq[Reference]](reasonReference, t.reasonReference),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Option[Reference]](informationSource, t.informationSource)
  )
  def extractId(t: MedicationStatement): Option[String]                                     = t.id
  def extractMeta(t: MedicationStatement): Option[Meta]                                     = t.meta
  def extractText(t: MedicationStatement): Option[Narrative]                                = t.text
  def extractNote(t: MedicationStatement): LitSeq[Annotation]                               = t.note
  def extractPartOf(t: MedicationStatement): LitSeq[Reference]                              = t.partOf
  def extractStatus(t: MedicationStatement): MEDICATION_STATEMENT_STATUS                    = t.status
  def extractDosage(t: MedicationStatement): LitSeq[Dosage]                                 = t.dosage
  def extractBasedOn(t: MedicationStatement): LitSeq[Reference]                             = t.basedOn
  def extractSubject(t: MedicationStatement): Reference                                     = t.subject
  def extractContext(t: MedicationStatement): Option[Reference]                             = t.context
  def extractLanguage(t: MedicationStatement): Option[LANGUAGES]                            = t.language
  def extractCategory(t: MedicationStatement): Option[CodeableConcept]                      = t.category
  def extractContained(t: MedicationStatement): LitSeq[Resource]                            = t.contained
  def extractExtension(t: MedicationStatement): LitSeq[Extension]                           = t.extension
  def extractIdentifier(t: MedicationStatement): LitSeq[Identifier]                         = t.identifier
  def extractReasonCode(t: MedicationStatement): LitSeq[CodeableConcept]                    = t.reasonCode
  def extractDerivedFrom(t: MedicationStatement): LitSeq[Reference]                         = t.derivedFrom
  def extractStatusReason(t: MedicationStatement): LitSeq[CodeableConcept]                  = t.statusReason
  def extractEffective(t: MedicationStatement): Option[MedicationStatement.EffectiveChoice] = t.effective
  def extractDateAsserted(t: MedicationStatement): Option[FHIRDateTime]                     = t.dateAsserted
  def extractImplicitRules(t: MedicationStatement): Option[UriStr]                          = t.implicitRules
  def extractMedication(t: MedicationStatement): MedicationStatement.MedicationChoice       = t.medication
  def extractReasonReference(t: MedicationStatement): LitSeq[Reference]                     = t.reasonReference
  def extractModifierExtension(t: MedicationStatement): LitSeq[Extension]                   = t.modifierExtension
  def extractInformationSource(t: MedicationStatement): Option[Reference]                   = t.informationSource
  override val thisName: String                                                             = "MedicationStatement"
  override val searchParams: Map[String, MedicationStatement => Seq[Any]] = Map(
    "source"     -> (obj => obj.informationSource.toSeq),
    "identifier" -> (obj => obj.identifier.toSeq),
    "context"    -> (obj => obj.context.toSeq),
    "effective"  -> (obj => obj.effective.toSeq),
    "code"       -> (obj => obj.medication.as[CodeableConcept].toSeq),
    "status"     -> (obj => Seq(obj.status)),
    "category"   -> (obj => obj.category.toSeq),
    "part-of"    -> (obj => obj.partOf.toSeq),
    "patient"    -> (obj => obj.subject.seqIf(_.reference.exists(_.contains("Patient/"))).toSeq),
    "subject"    -> (obj => Seq(obj.subject)),
    "medication" -> (obj => obj.medication.as[Reference].toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[MedicationStatement] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new MedicationStatement(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("partOf", Some(LitSeq.empty)),
          cursor.decodeAs[MEDICATION_STATEMENT_STATUS]("status", None),
          cursor.decodeAs[LitSeq[Dosage]]("dosage", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("basedOn", Some(LitSeq.empty)),
          cursor.decodeAs[Reference]("subject", None),
          cursor.decodeAs[Option[Reference]]("context", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("category", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("reasonCode", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("derivedFrom", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("statusReason", Some(LitSeq.empty)),
          cursor.decodeOptRef[UnionDateTimeOrPeriod]("effective"),
          cursor.decodeAs[Option[FHIRDateTime]]("dateAsserted", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeRef[UnionCodeableConceptOrReference]("medication"),
          cursor.decodeAs[LitSeq[Reference]]("reasonReference", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("informationSource", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** A record of a medication that is being consumed by a patient. A MedicationStatement may indicate that the patient may be
  * taking the medication now or has taken the medication in the past or will be taking the medication in the future. The source
  * of this information can be the patient, significant other (such as a family member or spouse), or a clinician. A common
  * scenario where this information is captured is during the history taking process during a patient visit or stay. The
  * medication information may come from sources such as the patient's memory, from a prescription bottle, or from a list of
  * medications the patient, clinician or other party maintains. The primary difference between a medication statement and a
  * medication administration is that the medication administration has complete administration information and is based on actual
  * administration information from the person who administered the medication. A medication statement is often, if not always,
  * less specific. There is no required date/time when the medication was administered, in fact we only know that a source has
  * reported the patient is taking this medication, where details such as time, quantity, or rate or even medication product may
  * be incomplete or missing or less precise. As stated earlier, the medication statement information may come from the patient's
  * memory, from a prescription bottle or from a list of medications the patient, clinician or other party maintains. Medication
  * administration is more formal and is not missing detailed information.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields note, partOf, status, dosage, basedOn, subject, context, category, identifier, reasonCode,
  *   derivedFrom, statusReason, effective, dateAsserted, medication, reasonReference, informationSource.
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
  * @param note
  *   - Provides extra information about the medication statement that is not conveyed by the other attributes.
  * @param partOf
  *   - A larger event of which this particular event is a component or step.
  * @param status
  *   - A code representing the patient or other source's judgment about the state of the medication used that this statement is
  *     about. Generally, this will be active or completed.
  * @param dosage
  *   - Indicates how the medication is/was or should be taken by the patient.
  * @param basedOn
  *   - A plan, proposal or order that is fulfilled in whole or in part by this event.
  * @param subject
  *   - The person, animal or group who is/was taking the medication.
  * @param context
  *   - The encounter or episode of care that establishes the context for this MedicationStatement.
  * @param language
  *   - The base language in which the resource is written.
  * @param category
  *   - Indicates where the medication is expected to be consumed or administered.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *     identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *     of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *     Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *     of the extension.
  * @param identifier
  *   - Identifiers associated with this Medication Statement that are defined by business processes and/or used to refer to it
  *     when a direct URL reference to the resource itself is not appropriate. They are business identifiers assigned to this
  *     resource by the performer or other systems and remain constant as the resource is updated and propagates from server to
  *     server.
  * @param reasonCode
  *   - A reason for why the medication is being/was taken.
  * @param derivedFrom
  *   - Allows linking the MedicationStatement to the underlying MedicationRequest, or to other information that supports or is
  *     used to derive the MedicationStatement.
  * @param statusReason
  *   - Captures the reason for the current state of the MedicationStatement.
  * @param effective
  *   - The interval of time during which it is being asserted that the patient is/was/will be taking the medication (or was not
  *     taking, when the MedicationStatement.taken element is No).
  * @param dateAsserted
  *   - The date when the medication statement was asserted by the information source.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *     processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *     other profiles etc.
  * @param medication
  *   - Identifies the medication being administered. This is either a link to a resource representing the details of the
  *     medication or a simple attribute carrying a code that identifies the medication from a known list of medications.
  * @param reasonReference
  *   - Condition or observation that supports why the medication is being/was taken.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *     the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *     Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *     strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *     extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *     processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of
  *     any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param informationSource
  *   - The person or organization that provided the information about the taking of this medication. Note: Use derivedFrom when a
  *     MedicationStatement is derived from other resources, e.g. Claim or MedicationRequest.
  */
@POJOBoilerplate
class MedicationStatement(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val note: LitSeq[Annotation] = LitSeq.empty,
    val partOf: LitSeq[Reference] = LitSeq.empty,
    val status: MEDICATION_STATEMENT_STATUS,
    val dosage: LitSeq[Dosage] = LitSeq.empty,
    val basedOn: LitSeq[Reference] = LitSeq.empty,
    val subject: Reference,
    val context: Option[Reference] = None,
    override val language: Option[LANGUAGES] = None,
    val category: Option[CodeableConcept] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
    val derivedFrom: LitSeq[Reference] = LitSeq.empty,
    val statusReason: LitSeq[CodeableConcept] = LitSeq.empty,
    val effective: Option[MedicationStatement.EffectiveChoice] = None,
    val dateAsserted: Option[FHIRDateTime] = None,
    override val implicitRules: Option[UriStr] = None,
    val medication: MedicationStatement.MedicationChoice,
    val reasonReference: LitSeq[Reference] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val informationSource: Option[Reference] = None,
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
      primitiveAttributes = primitiveAttributes
    ) {
  override val thisTypeName: String = "MedicationStatement"
}
