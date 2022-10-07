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
import com.babylonhealth.lit.hl7.MEDICATION_ADMIN_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, ukcore }
import com.babylonhealth.lit.macros.POJOBoilerplate

object UKCore_MedicationAdministration extends CompanionFor[UKCore_MedicationAdministration] {
  implicit def summonObjectAndCompanionUKCore_MedicationAdministration_999455300(
      o: UKCore_MedicationAdministration): ObjectAndCompanion[UKCore_MedicationAdministration, UKCore_MedicationAdministration.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = MedicationAdministration
  override type ParentType   = MedicationAdministration
  override val baseType: CompanionFor[ResourceType] = MedicationAdministration
  override val parentType: CompanionFor[ParentType] = MedicationAdministration
  override val profileUrl: Option[String] = Some("https://fhir.hl7.org.uk/StructureDefinition/UKCore-MedicationAdministration")
  type EffectiveChoice  = Choice[UnionDateTimeOrPeriod]
  type MedicationChoice = Choice[UnionCodeableConceptOrReference]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(
        new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-MedicationAdministration"))),
      text: Option[Narrative] = None,
      status: MEDICATION_ADMIN_STATUS,
      language: Option[LANGUAGES] = None,
      category: Option[CodeableConcept] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
      instantiates: LitSeq[UriStr] = LitSeq.empty,
      statusReason: LitSeq[CodeableConcept] = LitSeq.empty,
      effective: UKCore_MedicationAdministration.EffectiveChoice,
      implicitRules: Option[UriStr] = None,
      medication: UKCore_MedicationAdministration.MedicationChoice,
      note: LitSeq[Annotation] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      dosage: Option[MedicationAdministration.Dosage] = None,
      partOf: LitSeq[Reference] = LitSeq.empty,
      device: LitSeq[Reference] = LitSeq.empty,
      subject: Reference,
      context: Option[Reference] = None,
      request: Option[Reference] = None,
      eventHistory: LitSeq[Reference] = LitSeq.empty,
      performer: LitSeq[MedicationAdministration.Performer] = LitSeq.empty,
      reasonReference: LitSeq[Reference] = LitSeq.empty,
      supportingInformation: LitSeq[Reference] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): UKCore_MedicationAdministration = new UKCore_MedicationAdministration(
    id,
    meta,
    text,
    status,
    language,
    category,
    contained,
    extension,
    reasonCode,
    instantiates,
    statusReason,
    effective,
    implicitRules,
    medication,
    note,
    modifierExtension,
    identifier,
    dosage,
    partOf,
    device,
    subject,
    context,
    request,
    eventHistory,
    performer,
    reasonReference,
    supportingInformation,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val status: FHIRComponentFieldMeta[MEDICATION_ADMIN_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[MEDICATION_ADMIN_STATUS], false, lTagOf[MEDICATION_ADMIN_STATUS])
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
  val instantiates: FHIRComponentFieldMeta[LitSeq[UriStr]] =
    FHIRComponentFieldMeta("instantiates", lTagOf[LitSeq[UriStr]], false, lTagOf[UriStr])
  val statusReason: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("statusReason", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val effective: FHIRComponentFieldMeta[UKCore_MedicationAdministration.EffectiveChoice] =
    FHIRComponentFieldMeta(
      "effective",
      lTagOf[UKCore_MedicationAdministration.EffectiveChoice],
      true,
      lTagOf[UnionDateTimeOrPeriod])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val medication: FHIRComponentFieldMeta[UKCore_MedicationAdministration.MedicationChoice] =
    FHIRComponentFieldMeta(
      "medication",
      lTagOf[UKCore_MedicationAdministration.MedicationChoice],
      true,
      lTagOf[UnionCodeableConceptOrReference])
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val dosage: FHIRComponentFieldMeta[Option[MedicationAdministration.Dosage]] =
    FHIRComponentFieldMeta(
      "dosage",
      lTagOf[Option[MedicationAdministration.Dosage]],
      false,
      lTagOf[MedicationAdministration.Dosage])
  val partOf: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("partOf", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val device: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("device", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val subject: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("subject", lTagOf[Reference], false, lTagOf[Reference])
  val context: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("context", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val request: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("request", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val eventHistory: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("eventHistory", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val performer: FHIRComponentFieldMeta[LitSeq[MedicationAdministration.Performer]] =
    FHIRComponentFieldMeta(
      "performer",
      lTagOf[LitSeq[MedicationAdministration.Performer]],
      false,
      lTagOf[MedicationAdministration.Performer])
  val reasonReference: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("reasonReference", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val supportingInformation: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("supportingInformation", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
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
    instantiates,
    statusReason,
    effective,
    implicitRules,
    medication,
    note,
    modifierExtension,
    identifier,
    dosage,
    partOf,
    device,
    subject,
    context,
    request,
    eventHistory,
    performer,
    reasonReference,
    supportingInformation
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Meta]](meta, t.meta),
      FHIRComponentField[Option[Narrative]](text, t.text),
      FHIRComponentField[MEDICATION_ADMIN_STATUS](status, t.status),
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[Option[CodeableConcept]](category, t.category),
      FHIRComponentField[LitSeq[Resource]](contained, t.contained),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[CodeableConcept]](reasonCode, t.reasonCode),
      FHIRComponentField[LitSeq[UriStr]](instantiates, t.instantiates),
      FHIRComponentField[LitSeq[CodeableConcept]](statusReason, t.statusReason),
      FHIRComponentField[UKCore_MedicationAdministration.EffectiveChoice](effective, t.effective),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[UKCore_MedicationAdministration.MedicationChoice](medication, t.medication),
      FHIRComponentField[LitSeq[Annotation]](note, t.note),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
      FHIRComponentField[Option[MedicationAdministration.Dosage]](dosage, t.dosage),
      FHIRComponentField[LitSeq[Reference]](partOf, t.partOf),
      FHIRComponentField[LitSeq[Reference]](device, t.device),
      FHIRComponentField[Reference](subject, t.subject),
      FHIRComponentField[Option[Reference]](context, t.context),
      FHIRComponentField[Option[Reference]](request, t.request),
      FHIRComponentField[LitSeq[Reference]](eventHistory, t.eventHistory),
      FHIRComponentField[LitSeq[MedicationAdministration.Performer]](performer, t.performer),
      FHIRComponentField[LitSeq[Reference]](reasonReference, t.reasonReference),
      FHIRComponentField[LitSeq[Reference]](supportingInformation, t.supportingInformation)
    ))
  override def fields(t: UKCore_MedicationAdministration): Seq[FHIRComponentField[_]]  = fieldsFromParent(t).get
  def extractId(t: UKCore_MedicationAdministration): Option[String]                    = t.id
  def extractMeta(t: UKCore_MedicationAdministration): Option[Meta]                    = t.meta
  def extractText(t: UKCore_MedicationAdministration): Option[Narrative]               = t.text
  def extractStatus(t: UKCore_MedicationAdministration): MEDICATION_ADMIN_STATUS       = t.status
  def extractLanguage(t: UKCore_MedicationAdministration): Option[LANGUAGES]           = t.language
  def extractCategory(t: UKCore_MedicationAdministration): Option[CodeableConcept]     = t.category
  def extractContained(t: UKCore_MedicationAdministration): LitSeq[Resource]           = t.contained
  def extractExtension(t: UKCore_MedicationAdministration): LitSeq[Extension]          = t.extension
  def extractReasonCode(t: UKCore_MedicationAdministration): LitSeq[CodeableConcept]   = t.reasonCode
  def extractInstantiates(t: UKCore_MedicationAdministration): LitSeq[UriStr]          = t.instantiates
  def extractStatusReason(t: UKCore_MedicationAdministration): LitSeq[CodeableConcept] = t.statusReason
  def extractEffective(t: UKCore_MedicationAdministration): UKCore_MedicationAdministration.EffectiveChoice   = t.effective
  def extractImplicitRules(t: UKCore_MedicationAdministration): Option[UriStr]                                = t.implicitRules
  def extractMedication(t: UKCore_MedicationAdministration): UKCore_MedicationAdministration.MedicationChoice = t.medication
  def extractNote(t: UKCore_MedicationAdministration): LitSeq[Annotation]                                     = t.note
  def extractModifierExtension(t: UKCore_MedicationAdministration): LitSeq[Extension]                  = t.modifierExtension
  def extractIdentifier(t: UKCore_MedicationAdministration): LitSeq[Identifier]                        = t.identifier
  def extractDosage(t: UKCore_MedicationAdministration): Option[MedicationAdministration.Dosage]       = t.dosage
  def extractPartOf(t: UKCore_MedicationAdministration): LitSeq[Reference]                             = t.partOf
  def extractDevice(t: UKCore_MedicationAdministration): LitSeq[Reference]                             = t.device
  def extractSubject(t: UKCore_MedicationAdministration): Reference                                    = t.subject
  def extractContext(t: UKCore_MedicationAdministration): Option[Reference]                            = t.context
  def extractRequest(t: UKCore_MedicationAdministration): Option[Reference]                            = t.request
  def extractEventHistory(t: UKCore_MedicationAdministration): LitSeq[Reference]                       = t.eventHistory
  def extractPerformer(t: UKCore_MedicationAdministration): LitSeq[MedicationAdministration.Performer] = t.performer
  def extractReasonReference(t: UKCore_MedicationAdministration): LitSeq[Reference]                    = t.reasonReference
  def extractSupportingInformation(t: UKCore_MedicationAdministration): LitSeq[Reference]              = t.supportingInformation
  override val thisName: String                                                       = "UKCore_MedicationAdministration"
  override val searchParams: Map[String, UKCore_MedicationAdministration => Seq[Any]] = MedicationAdministration.searchParams
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[UKCore_MedicationAdministration] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new UKCore_MedicationAdministration(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[MEDICATION_ADMIN_STATUS]("status", None),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("category", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("reasonCode", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[UriStr]]("instantiates", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("statusReason", Some(LitSeq.empty)),
          cursor.decodeRef[UnionDateTimeOrPeriod]("effective"),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeRef[UnionCodeableConceptOrReference]("medication"),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[MedicationAdministration.Dosage]]("dosage", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("partOf", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("device", Some(LitSeq.empty)),
          cursor.decodeAs[Reference]("subject", None),
          cursor.decodeAs[Option[Reference]]("context", Some(None)),
          cursor.decodeAs[Option[Reference]]("request", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("eventHistory", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[MedicationAdministration.Performer]]("performer", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("reasonReference", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("supportingInformation", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Defines the UK Core constraints and extensions on the MedicationAdministration resource for the minimal set of data to query
  * and retrieve medication administration information.
  *
  * Subclass of [[hl7.model.MedicationAdministration]] (Describes the event of a patient consuming or otherwise being administered
  * a medication. This may be as simple as swallowing a tablet or it may be a long running infusion. Related resources tie this
  * event to the authorizing prescription, and the specific encounter between patient and health care practitioner.)
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
  * @param status
  *   - Will generally be set to show that the administration has been completed. For some long running administrations such as
  *     infusions, it is possible for an administration to be started but not completed or it may be paused while some other
  *     process is under way.
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
  * @param reasonCode
  *   - A code indicating why the medication was given.
  * @param instantiates
  *   - A protocol, guideline, orderset, or other definition that was adhered to in whole or in part by this event.
  * @param statusReason
  *   - A code indicating why the administration was not performed.
  * @param effective
  *   - A specific date/time or interval of time during which the administration took place (or did not take place, when the
  *     'notGiven' attribute is true). For many administrations, such as swallowing a tablet the use of dateTime is more
  *     appropriate.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *     processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *     other profiles etc.
  * @param medication
  *   - Identifies the medication that was administered. This is either a link to a resource representing the details of the
  *     medication or a simple attribute carrying a code that identifies the medication from a known list of medications.
  * @param note
  *   - Extra information about the medication administration that is not conveyed by the other attributes.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *     the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *     Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *     strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *     extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *     processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of
  *     any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param identifier
  *   - Identifiers associated with this Medication Administration that are defined by business processes and/or used to refer to
  *     it when a direct URL reference to the resource itself is not appropriate. They are business identifiers assigned to this
  *     resource by the performer or other systems and remain constant as the resource is updated and propagates from server to
  *     server.
  * @param dosage
  *   - Describes the medication dosage information details e.g. dose, rate, site, route, etc.
  * @param partOf
  *   - A larger event of which this particular event is a component or step.
  * @param device
  *   - The device used in administering the medication to the patient. For example, a particular infusion pump.
  * @param subject
  *   - The person or animal or group receiving the medication.
  * @param context
  *   - The visit, admission, or other contact between patient and health care provider during which the medication administration
  *     was performed.
  * @param request
  *   - The original request, instruction or authority to perform the administration.
  * @param eventHistory
  *   - A summary of the events of interest that have occurred, such as when the administration was verified.
  * @param performer
  *   - Indicates who or what performed the medication administration and how they were involved.
  * @param reasonReference
  *   - Condition or observation that supports why the medication was administered.
  * @param supportingInformation
  *   - Additional information (for example, patient height and weight) that supports the administration of the medication.
  */
@POJOBoilerplate
class UKCore_MedicationAdministration(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-MedicationAdministration"))),
    override val text: Option[Narrative] = None,
    override val status: MEDICATION_ADMIN_STATUS,
    override val language: Option[LANGUAGES] = None,
    override val category: Option[CodeableConcept] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
    override val instantiates: LitSeq[UriStr] = LitSeq.empty,
    override val statusReason: LitSeq[CodeableConcept] = LitSeq.empty,
    override val effective: UKCore_MedicationAdministration.EffectiveChoice,
    override val implicitRules: Option[UriStr] = None,
    override val medication: UKCore_MedicationAdministration.MedicationChoice,
    override val note: LitSeq[Annotation] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val dosage: Option[MedicationAdministration.Dosage] = None,
    override val partOf: LitSeq[Reference] = LitSeq.empty,
    override val device: LitSeq[Reference] = LitSeq.empty,
    override val subject: Reference,
    override val context: Option[Reference] = None,
    override val request: Option[Reference] = None,
    override val eventHistory: LitSeq[Reference] = LitSeq.empty,
    override val performer: LitSeq[MedicationAdministration.Performer] = LitSeq.empty,
    override val reasonReference: LitSeq[Reference] = LitSeq.empty,
    override val supportingInformation: LitSeq[Reference] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends MedicationAdministration(
      id = id,
      meta = meta,
      text = text,
      note = note,
      partOf = partOf,
      status = status,
      device = device,
      subject = subject,
      context = context,
      request = request,
      language = language,
      category = category,
      contained = contained,
      extension = extension,
      identifier = identifier,
      reasonCode = reasonCode,
      instantiates = instantiates,
      statusReason = statusReason,
      effective = effective,
      eventHistory = eventHistory,
      implicitRules = implicitRules,
      medication = medication,
      reasonReference = reasonReference,
      modifierExtension = modifierExtension,
      supportingInformation = supportingInformation,
      dosage = dosage,
      performer = performer,
      primitiveAttributes = primitiveAttributes
    ) {
  override val thisTypeName: String = "MedicationAdministration"
}
