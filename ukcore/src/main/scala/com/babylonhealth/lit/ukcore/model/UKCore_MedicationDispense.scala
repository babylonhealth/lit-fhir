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
import com.babylonhealth.lit.hl7.MEDICATIONDISPENSE_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, ukcore }
import com.babylonhealth.lit.macros.POJOBoilerplate

object UKCore_MedicationDispense extends CompanionFor[UKCore_MedicationDispense] {
  implicit def summonObjectAndCompanionUKCore_MedicationDispense_1969298117(
      o: UKCore_MedicationDispense): ObjectAndCompanion[UKCore_MedicationDispense, UKCore_MedicationDispense.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = MedicationDispense
  override type ParentType   = MedicationDispense
  override val baseType: CompanionFor[ResourceType] = MedicationDispense
  override val parentType: CompanionFor[ParentType] = MedicationDispense
  override val profileUrl: Option[String] = Some("https://fhir.hl7.org.uk/StructureDefinition/UKCore-MedicationDispense")
  type MedicationChoice   = Choice[UnionCodeableConceptOrReference]
  type StatusReasonChoice = Choice[UnionCodeableConceptOrReference]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(
        new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-MedicationDispense"))),
      text: Option[Narrative] = None,
      `type`: Option[CodeableConcept] = None,
      status: MEDICATIONDISPENSE_STATUS,
      language: Option[LANGUAGES] = None,
      category: Option[CodeableConcept] = None,
      quantity: Option[Quantity] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      daysSupply: Option[Quantity] = None,
      whenPrepared: Option[FHIRDateTime] = None,
      implicitRules: Option[UriStr] = None,
      medication: UKCore_MedicationDispense.MedicationChoice,
      whenHandedOver: Option[FHIRDateTime] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      statusReason: Option[UKCore_MedicationDispense.StatusReasonChoice] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      partOf: LitSeq[Reference] = LitSeq.empty,
      subject: Option[Reference] = None,
      context: Option[Reference] = None,
      location: Option[Reference] = None,
      receiver: LitSeq[Reference] = LitSeq.empty,
      destination: Option[Reference] = None,
      eventHistory: LitSeq[Reference] = LitSeq.empty,
      detectedIssue: LitSeq[Reference] = LitSeq.empty,
      performer: LitSeq[MedicationDispense.Performer] = LitSeq.empty,
      supportingInformation: LitSeq[Reference] = LitSeq.empty,
      dosageInstruction: LitSeq[Dosage] = LitSeq.empty,
      authorizingPrescription: LitSeq[Reference] = LitSeq.empty,
      substitution: Option[MedicationDispense.Substitution] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): UKCore_MedicationDispense = new UKCore_MedicationDispense(
    id,
    meta,
    text,
    `type`,
    status,
    language,
    category,
    quantity,
    contained,
    extension,
    daysSupply,
    whenPrepared,
    implicitRules,
    medication,
    whenHandedOver,
    note,
    statusReason,
    modifierExtension,
    identifier,
    partOf,
    subject,
    context,
    location,
    receiver,
    destination,
    eventHistory,
    detectedIssue,
    performer,
    supportingInformation,
    dosageInstruction,
    authorizingPrescription,
    substitution,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val status: FHIRComponentFieldMeta[MEDICATIONDISPENSE_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[MEDICATIONDISPENSE_STATUS], false, lTagOf[MEDICATIONDISPENSE_STATUS])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val category: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("category", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val quantity: FHIRComponentFieldMeta[Option[Quantity]] =
    FHIRComponentFieldMeta("quantity", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val daysSupply: FHIRComponentFieldMeta[Option[Quantity]] =
    FHIRComponentFieldMeta("daysSupply", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
  val whenPrepared: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("whenPrepared", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val medication: FHIRComponentFieldMeta[UKCore_MedicationDispense.MedicationChoice] =
    FHIRComponentFieldMeta(
      "medication",
      lTagOf[UKCore_MedicationDispense.MedicationChoice],
      true,
      lTagOf[UnionCodeableConceptOrReference])
  val whenHandedOver: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("whenHandedOver", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val statusReason: FHIRComponentFieldMeta[Option[UKCore_MedicationDispense.StatusReasonChoice]] =
    FHIRComponentFieldMeta(
      "statusReason",
      lTagOf[Option[UKCore_MedicationDispense.StatusReasonChoice]],
      true,
      lTagOf[UnionCodeableConceptOrReference])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val partOf: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("partOf", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val subject: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("subject", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val context: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("context", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val location: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("location", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val receiver: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("receiver", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val destination: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("destination", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val eventHistory: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("eventHistory", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val detectedIssue: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("detectedIssue", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val performer: FHIRComponentFieldMeta[LitSeq[MedicationDispense.Performer]] =
    FHIRComponentFieldMeta("performer", lTagOf[LitSeq[MedicationDispense.Performer]], false, lTagOf[MedicationDispense.Performer])
  val supportingInformation: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("supportingInformation", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val dosageInstruction: FHIRComponentFieldMeta[LitSeq[Dosage]] =
    FHIRComponentFieldMeta("dosageInstruction", lTagOf[LitSeq[Dosage]], false, lTagOf[Dosage])
  val authorizingPrescription: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("authorizingPrescription", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val substitution: FHIRComponentFieldMeta[Option[MedicationDispense.Substitution]] =
    FHIRComponentFieldMeta(
      "substitution",
      lTagOf[Option[MedicationDispense.Substitution]],
      false,
      lTagOf[MedicationDispense.Substitution])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    `type`,
    status,
    language,
    category,
    quantity,
    contained,
    extension,
    daysSupply,
    whenPrepared,
    implicitRules,
    medication,
    whenHandedOver,
    note,
    statusReason,
    modifierExtension,
    identifier,
    partOf,
    subject,
    context,
    location,
    receiver,
    destination,
    eventHistory,
    detectedIssue,
    performer,
    supportingInformation,
    dosageInstruction,
    authorizingPrescription,
    substitution
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Meta]](meta, t.meta),
      FHIRComponentField[Option[Narrative]](text, t.text),
      FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[MEDICATIONDISPENSE_STATUS](status, t.status),
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[Option[CodeableConcept]](category, t.category),
      FHIRComponentField[Option[Quantity]](quantity, t.quantity),
      FHIRComponentField[LitSeq[Resource]](contained, t.contained),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Quantity]](daysSupply, t.daysSupply),
      FHIRComponentField[Option[FHIRDateTime]](whenPrepared, t.whenPrepared),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[UKCore_MedicationDispense.MedicationChoice](medication, t.medication),
      FHIRComponentField[Option[FHIRDateTime]](whenHandedOver, t.whenHandedOver),
      FHIRComponentField[LitSeq[Annotation]](note, t.note),
      FHIRComponentField[Option[UKCore_MedicationDispense.StatusReasonChoice]](statusReason, t.statusReason),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
      FHIRComponentField[LitSeq[Reference]](partOf, t.partOf),
      FHIRComponentField[Option[Reference]](subject, t.subject),
      FHIRComponentField[Option[Reference]](context, t.context),
      FHIRComponentField[Option[Reference]](location, t.location),
      FHIRComponentField[LitSeq[Reference]](receiver, t.receiver),
      FHIRComponentField[Option[Reference]](destination, t.destination),
      FHIRComponentField[LitSeq[Reference]](eventHistory, t.eventHistory),
      FHIRComponentField[LitSeq[Reference]](detectedIssue, t.detectedIssue),
      FHIRComponentField[LitSeq[MedicationDispense.Performer]](performer, t.performer),
      FHIRComponentField[LitSeq[Reference]](supportingInformation, t.supportingInformation),
      FHIRComponentField[LitSeq[Dosage]](dosageInstruction, t.dosageInstruction),
      FHIRComponentField[LitSeq[Reference]](authorizingPrescription, t.authorizingPrescription),
      FHIRComponentField[Option[MedicationDispense.Substitution]](substitution, t.substitution)
    ))
  override def fields(t: UKCore_MedicationDispense): Seq[FHIRComponentField[_]]                   = fieldsFromParent(t).get
  def extractId(t: UKCore_MedicationDispense): Option[String]                                     = t.id
  def extractMeta(t: UKCore_MedicationDispense): Option[Meta]                                     = t.meta
  def extractText(t: UKCore_MedicationDispense): Option[Narrative]                                = t.text
  def extractType(t: UKCore_MedicationDispense): Option[CodeableConcept]                          = t.`type`
  def extractStatus(t: UKCore_MedicationDispense): MEDICATIONDISPENSE_STATUS                      = t.status
  def extractLanguage(t: UKCore_MedicationDispense): Option[LANGUAGES]                            = t.language
  def extractCategory(t: UKCore_MedicationDispense): Option[CodeableConcept]                      = t.category
  def extractQuantity(t: UKCore_MedicationDispense): Option[Quantity]                             = t.quantity
  def extractContained(t: UKCore_MedicationDispense): LitSeq[Resource]                            = t.contained
  def extractExtension(t: UKCore_MedicationDispense): LitSeq[Extension]                           = t.extension
  def extractDaysSupply(t: UKCore_MedicationDispense): Option[Quantity]                           = t.daysSupply
  def extractWhenPrepared(t: UKCore_MedicationDispense): Option[FHIRDateTime]                     = t.whenPrepared
  def extractImplicitRules(t: UKCore_MedicationDispense): Option[UriStr]                          = t.implicitRules
  def extractMedication(t: UKCore_MedicationDispense): UKCore_MedicationDispense.MedicationChoice = t.medication
  def extractWhenHandedOver(t: UKCore_MedicationDispense): Option[FHIRDateTime]                   = t.whenHandedOver
  def extractNote(t: UKCore_MedicationDispense): LitSeq[Annotation]                               = t.note
  def extractStatusReason(t: UKCore_MedicationDispense): Option[UKCore_MedicationDispense.StatusReasonChoice] = t.statusReason
  def extractModifierExtension(t: UKCore_MedicationDispense): LitSeq[Extension]                  = t.modifierExtension
  def extractIdentifier(t: UKCore_MedicationDispense): LitSeq[Identifier]                        = t.identifier
  def extractPartOf(t: UKCore_MedicationDispense): LitSeq[Reference]                             = t.partOf
  def extractSubject(t: UKCore_MedicationDispense): Option[Reference]                            = t.subject
  def extractContext(t: UKCore_MedicationDispense): Option[Reference]                            = t.context
  def extractLocation(t: UKCore_MedicationDispense): Option[Reference]                           = t.location
  def extractReceiver(t: UKCore_MedicationDispense): LitSeq[Reference]                           = t.receiver
  def extractDestination(t: UKCore_MedicationDispense): Option[Reference]                        = t.destination
  def extractEventHistory(t: UKCore_MedicationDispense): LitSeq[Reference]                       = t.eventHistory
  def extractDetectedIssue(t: UKCore_MedicationDispense): LitSeq[Reference]                      = t.detectedIssue
  def extractPerformer(t: UKCore_MedicationDispense): LitSeq[MedicationDispense.Performer]       = t.performer
  def extractSupportingInformation(t: UKCore_MedicationDispense): LitSeq[Reference]              = t.supportingInformation
  def extractDosageInstruction(t: UKCore_MedicationDispense): LitSeq[Dosage]                     = t.dosageInstruction
  def extractAuthorizingPrescription(t: UKCore_MedicationDispense): LitSeq[Reference]            = t.authorizingPrescription
  def extractSubstitution(t: UKCore_MedicationDispense): Option[MedicationDispense.Substitution] = t.substitution
  override val thisName: String                                                                  = "UKCore_MedicationDispense"
  override val searchParams: Map[String, UKCore_MedicationDispense => Seq[Any]]                  = MedicationDispense.searchParams
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[UKCore_MedicationDispense] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new UKCore_MedicationDispense(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
          cursor.decodeAs[MEDICATIONDISPENSE_STATUS]("status", None),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("category", Some(None)),
          cursor.decodeAs[Option[Quantity]]("quantity", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Quantity]]("daysSupply", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("whenPrepared", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeRef[UnionCodeableConceptOrReference]("medication"),
          cursor.decodeAs[Option[FHIRDateTime]]("whenHandedOver", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeOptRef[UnionCodeableConceptOrReference]("statusReason"),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("partOf", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("subject", Some(None)),
          cursor.decodeAs[Option[Reference]]("context", Some(None)),
          cursor.decodeAs[Option[Reference]]("location", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("receiver", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("destination", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("eventHistory", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("detectedIssue", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[MedicationDispense.Performer]]("performer", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("supportingInformation", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Dosage]]("dosageInstruction", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("authorizingPrescription", Some(LitSeq.empty)),
          cursor.decodeAs[Option[MedicationDispense.Substitution]]("substitution", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** Defines the UK Core constraints and extensions on the MedicationDispense resource for the minimal set of data to query and
  * retrieve dispensed medication information.
  *
  * Subclass of [[hl7.model.MedicationDispense]] (Indicates that a medication product is to be or has been dispensed for a named
  * person/patient. This includes a description of the medication product (supply) provided and the instructions for administering
  * the medication. The medication dispense is the result of a pharmacy system responding to a medication order.)
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
  *   - Indicates the type of dispensing event that is performed. For example, Trial Fill, Completion of Trial, Partial Fill,
  *     Emergency Fill, Samples, etc.
  * @param status
  *   - A code specifying the state of the set of dispense events.
  * @param language
  *   - The base language in which the resource is written.
  * @param category
  *   - Indicates the type of medication dispense (for example, where the medication is expected to be consumed or administered
  *     (i.e. inpatient or outpatient)).
  * @param quantity
  *   - The amount of medication that has been dispensed. Includes unit of measure.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *     identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *     of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *     Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *     of the extension.
  * @param daysSupply
  *   - The amount of medication expressed as a timing amount.
  * @param whenPrepared
  *   - The time when the dispensed product was packaged and reviewed.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *     processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *     other profiles etc.
  * @param medication
  *   - Identifies the medication being administered. This is either a link to a resource representing the details of the
  *     medication or a simple attribute carrying a code that identifies the medication from a known list of medications.
  * @param whenHandedOver
  *   - The time the dispensed product was provided to the patient or their representative.
  * @param note
  *   - Extra information about the dispense that could not be conveyed in the other attributes.
  * @param statusReason
  *   - Indicates the reason why a dispense was not performed.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *     the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *     Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *     strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *     extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *     processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of
  *     any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param identifier
  *   - Identifiers associated with this Medication Dispense that are defined by business processes and/or used to refer to it
  *     when a direct URL reference to the resource itself is not appropriate. They are business identifiers assigned to this
  *     resource by the performer or other systems and remain constant as the resource is updated and propagates from server to
  *     server.
  * @param partOf
  *   - The procedure that trigger the dispense.
  * @param subject
  *   - A link to a resource representing the person or the group to whom the medication will be given.
  * @param context
  *   - The encounter or episode of care that establishes the context for this event.
  * @param location
  *   - The principal physical location where the dispense was performed.
  * @param receiver
  *   - Identifies the person who picked up the medication. This will usually be a patient or their caregiver, but some cases
  *     exist where it can be a healthcare professional.
  * @param destination
  *   - Identification of the facility/location where the medication was shipped to, as part of the dispense event.
  * @param eventHistory
  *   - A summary of the events of interest that have occurred, such as when the dispense was verified.
  * @param detectedIssue
  *   - Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a
  *     patient; e.g. drug-drug interaction, duplicate therapy, dosage alert etc.
  * @param performer
  *   - Indicates who or what performed the event.
  * @param supportingInformation
  *   - Additional information that supports the medication being dispensed.
  * @param dosageInstruction
  *   - Indicates how the medication is to be used by the patient.
  * @param authorizingPrescription
  *   - Indicates the medication order that is being dispensed against.
  * @param substitution
  *   - Indicates whether or not substitution was made as part of the dispense. In some cases, substitution will be expected but
  *     does not happen, in other cases substitution is not expected but does happen. This block explains what substitution did or
  *     did not happen and why. If nothing is specified, substitution was not done.
  */
@POJOBoilerplate
class UKCore_MedicationDispense(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-MedicationDispense"))),
    override val text: Option[Narrative] = None,
    override val `type`: Option[CodeableConcept] = None,
    override val status: MEDICATIONDISPENSE_STATUS,
    override val language: Option[LANGUAGES] = None,
    override val category: Option[CodeableConcept] = None,
    override val quantity: Option[Quantity] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val daysSupply: Option[Quantity] = None,
    override val whenPrepared: Option[FHIRDateTime] = None,
    override val implicitRules: Option[UriStr] = None,
    override val medication: UKCore_MedicationDispense.MedicationChoice,
    override val whenHandedOver: Option[FHIRDateTime] = None,
    override val note: LitSeq[Annotation] = LitSeq.empty,
    override val statusReason: Option[UKCore_MedicationDispense.StatusReasonChoice] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val partOf: LitSeq[Reference] = LitSeq.empty,
    override val subject: Option[Reference] = None,
    override val context: Option[Reference] = None,
    override val location: Option[Reference] = None,
    override val receiver: LitSeq[Reference] = LitSeq.empty,
    override val destination: Option[Reference] = None,
    override val eventHistory: LitSeq[Reference] = LitSeq.empty,
    override val detectedIssue: LitSeq[Reference] = LitSeq.empty,
    override val performer: LitSeq[MedicationDispense.Performer] = LitSeq.empty,
    override val supportingInformation: LitSeq[Reference] = LitSeq.empty,
    override val dosageInstruction: LitSeq[Dosage] = LitSeq.empty,
    override val authorizingPrescription: LitSeq[Reference] = LitSeq.empty,
    override val substitution: Option[MedicationDispense.Substitution] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends MedicationDispense(
      id = id,
      meta = meta,
      text = text,
      `type` = `type`,
      note = note,
      partOf = partOf,
      status = status,
      subject = subject,
      context = context,
      language = language,
      category = category,
      location = location,
      quantity = quantity,
      receiver = receiver,
      contained = contained,
      extension = extension,
      identifier = identifier,
      daysSupply = daysSupply,
      destination = destination,
      whenPrepared = whenPrepared,
      eventHistory = eventHistory,
      implicitRules = implicitRules,
      medication = medication,
      detectedIssue = detectedIssue,
      whenHandedOver = whenHandedOver,
      statusReason = statusReason,
      modifierExtension = modifierExtension,
      dosageInstruction = dosageInstruction,
      supportingInformation = supportingInformation,
      authorizingPrescription = authorizingPrescription,
      performer = performer,
      substitution = substitution,
      primitiveAttributes = primitiveAttributes
    ) {
  override val thisTypeName: String = "MedicationDispense"
}
