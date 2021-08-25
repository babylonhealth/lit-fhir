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
import com.babylonhealth.lit.hl7.MEDICATIONDISPENSE_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object MedicationDispense extends CompanionFor[MedicationDispense] {
  implicit def summonObjectAndCompanionMedicationDispense_180735(
      o: MedicationDispense): ObjectAndCompanion[MedicationDispense, MedicationDispense.type] = ObjectAndCompanion(o, this)
  override type ResourceType = MedicationDispense
  override type ParentType   = MedicationDispense
  override val baseType: CompanionFor[ResourceType] = MedicationDispense
  override val parentType: CompanionFor[ParentType] = MedicationDispense
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/MedicationDispense")
  object Substitution extends CompanionFor[Substitution] {
    implicit def summonObjectAndCompanionSubstitution_816489768(
        o: Substitution): ObjectAndCompanion[Substitution, Substitution.type] = ObjectAndCompanion(o, this)
    override type ResourceType = Substitution
    override type ParentType   = Substitution
    override val parentType: CompanionFor[ResourceType] = Substitution
    def apply(
        id: Option[String] = None,
        `type`: Option[CodeableConcept] = None,
        reason: LitSeq[CodeableConcept] = LitSeq.empty,
        extension: LitSeq[Extension] = LitSeq.empty,
        wasSubstituted: Boolean,
        responsibleParty: Option[Reference] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Substitution = new Substitution(
      id,
      `type`,
      reason,
      extension,
      wasSubstituted,
      responsibleParty,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Substitution): Option[(Option[String], Option[CodeableConcept], LitSeq[CodeableConcept], LitSeq[Extension], Boolean, Option[Reference], LitSeq[Extension])] =
      Some((o.id, o.`type`, o.reason, o.extension, o.wasSubstituted, o.responsibleParty, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val reason: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("reason", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val wasSubstituted: FHIRComponentFieldMeta[Boolean] =
      FHIRComponentFieldMeta("wasSubstituted", lTagOf[Boolean], false, lTagOf[Boolean])
    val responsibleParty: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("responsibleParty", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, `type`, reason, extension, wasSubstituted, responsibleParty, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Substitution): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[LitSeq[CodeableConcept]](reason, t.reason),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Boolean](wasSubstituted, t.wasSubstituted),
      FHIRComponentField[Option[Reference]](responsibleParty, t.responsibleParty),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Substitution] = this
    val thisName: String                     = "Substitution"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Substitution] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Substitution(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("reason", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Boolean]("wasSubstituted", None),
            cursor.decodeAs[Option[Reference]]("responsibleParty", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Substitution(
      override val id: Option[String] = None,
      val `type`: Option[CodeableConcept] = None,
      val reason: LitSeq[CodeableConcept] = LitSeq.empty,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val wasSubstituted: Boolean,
      val responsibleParty: Option[Reference] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Performer extends CompanionFor[Performer] {
    implicit def summonObjectAndCompanionPerformer_816489768(o: Performer): ObjectAndCompanion[Performer, Performer.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Performer
    override type ParentType   = Performer
    override val parentType: CompanionFor[ResourceType] = Performer
    def apply(
        id: Option[String] = None,
        actor: Reference,
        function: Option[CodeableConcept] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Performer = new Performer(
      id,
      actor,
      function,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Performer): Option[(Option[String], Reference, Option[CodeableConcept], LitSeq[Extension], LitSeq[Extension])] = Some(
      (o.id, o.actor, o.function, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val actor: FHIRComponentFieldMeta[Reference] =
      FHIRComponentFieldMeta("actor", lTagOf[Reference], false, lTagOf[Reference])
    val function: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("function", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, actor, function, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Performer): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Reference](actor, t.actor),
      FHIRComponentField[Option[CodeableConcept]](function, t.function),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Performer] = this
    val thisName: String                  = "Performer"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Performer] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Performer(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Reference]("actor", None),
            cursor.decodeAs[Option[CodeableConcept]]("function", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Performer(
      override val id: Option[String] = None,
      val actor: Reference,
      val function: Option[CodeableConcept] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      `type`: Option[CodeableConcept] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      partOf: LitSeq[Reference] = LitSeq.empty,
      status: MEDICATIONDISPENSE_STATUS,
      basedOn: LitSeq[Reference] = LitSeq.empty,
      subject: Reference,
      language: Option[LANGUAGES] = None,
      category: LitSeq[CodeableConcept] = LitSeq.empty,
      location: Option[Reference] = None,
      quantity: Option[Quantity] = None,
      receiver: LitSeq[Reference] = LitSeq.empty,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      encounter: Option[Reference] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      medication: CodeableReference,
      daysSupply: Option[Quantity] = None,
      destination: Option[Reference] = None,
      statusReason: Option[CodeableReference] = None,
      whenPrepared: Option[FHIRDateTime] = None,
      eventHistory: LitSeq[Reference] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      detectedIssue: LitSeq[Reference] = LitSeq.empty,
      whenHandedOver: Option[FHIRDateTime] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      dosageInstruction: LitSeq[Dosage] = LitSeq.empty,
      supportingInformation: LitSeq[Reference] = LitSeq.empty,
      authorizingPrescription: LitSeq[Reference] = LitSeq.empty,
      renderedDosageInstruction: Option[String] = None,
      performer: LitSeq[MedicationDispense.Performer] = LitSeq.empty,
      substitution: Option[MedicationDispense.Substitution] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): MedicationDispense = new MedicationDispense(
    id,
    meta,
    text,
    `type`,
    note,
    partOf,
    status,
    basedOn,
    subject,
    language,
    category,
    location,
    quantity,
    receiver,
    contained,
    extension,
    encounter,
    identifier,
    medication,
    daysSupply,
    destination,
    statusReason,
    whenPrepared,
    eventHistory,
    implicitRules,
    detectedIssue,
    whenHandedOver,
    modifierExtension,
    dosageInstruction,
    supportingInformation,
    authorizingPrescription,
    renderedDosageInstruction,
    performer,
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
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val partOf: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("partOf", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val status: FHIRComponentFieldMeta[MEDICATIONDISPENSE_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[MEDICATIONDISPENSE_STATUS], false, lTagOf[MEDICATIONDISPENSE_STATUS])
  val basedOn: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("basedOn", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val subject: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("subject", lTagOf[Reference], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val category: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("category", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val location: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("location", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val quantity: FHIRComponentFieldMeta[Option[Quantity]] =
    FHIRComponentFieldMeta("quantity", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
  val receiver: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("receiver", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val encounter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("encounter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val medication: FHIRComponentFieldMeta[CodeableReference] =
    FHIRComponentFieldMeta("medication", lTagOf[CodeableReference], false, lTagOf[CodeableReference])
  val daysSupply: FHIRComponentFieldMeta[Option[Quantity]] =
    FHIRComponentFieldMeta("daysSupply", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
  val destination: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("destination", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val statusReason: FHIRComponentFieldMeta[Option[CodeableReference]] =
    FHIRComponentFieldMeta("statusReason", lTagOf[Option[CodeableReference]], false, lTagOf[CodeableReference])
  val whenPrepared: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("whenPrepared", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val eventHistory: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("eventHistory", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val detectedIssue: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("detectedIssue", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val whenHandedOver: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("whenHandedOver", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val dosageInstruction: FHIRComponentFieldMeta[LitSeq[Dosage]] =
    FHIRComponentFieldMeta("dosageInstruction", lTagOf[LitSeq[Dosage]], false, lTagOf[Dosage])
  val supportingInformation: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("supportingInformation", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val authorizingPrescription: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("authorizingPrescription", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val renderedDosageInstruction: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("renderedDosageInstruction", lTagOf[Option[String]], false, lTagOf[String])
  val performer: FHIRComponentFieldMeta[LitSeq[MedicationDispense.Performer]] =
    FHIRComponentFieldMeta("performer", lTagOf[LitSeq[MedicationDispense.Performer]], false, lTagOf[MedicationDispense.Performer])
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
    note,
    partOf,
    status,
    basedOn,
    subject,
    language,
    category,
    location,
    quantity,
    receiver,
    contained,
    extension,
    encounter,
    identifier,
    medication,
    daysSupply,
    destination,
    statusReason,
    whenPrepared,
    eventHistory,
    implicitRules,
    detectedIssue,
    whenHandedOver,
    modifierExtension,
    dosageInstruction,
    supportingInformation,
    authorizingPrescription,
    renderedDosageInstruction,
    performer,
    substitution
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: MedicationDispense): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
    FHIRComponentField[LitSeq[Annotation]](note, t.note),
    FHIRComponentField[LitSeq[Reference]](partOf, t.partOf),
    FHIRComponentField[MEDICATIONDISPENSE_STATUS](status, t.status),
    FHIRComponentField[LitSeq[Reference]](basedOn, t.basedOn),
    FHIRComponentField[Reference](subject, t.subject),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[CodeableConcept]](category, t.category),
    FHIRComponentField[Option[Reference]](location, t.location),
    FHIRComponentField[Option[Quantity]](quantity, t.quantity),
    FHIRComponentField[LitSeq[Reference]](receiver, t.receiver),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Reference]](encounter, t.encounter),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[CodeableReference](medication, t.medication),
    FHIRComponentField[Option[Quantity]](daysSupply, t.daysSupply),
    FHIRComponentField[Option[Reference]](destination, t.destination),
    FHIRComponentField[Option[CodeableReference]](statusReason, t.statusReason),
    FHIRComponentField[Option[FHIRDateTime]](whenPrepared, t.whenPrepared),
    FHIRComponentField[LitSeq[Reference]](eventHistory, t.eventHistory),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Reference]](detectedIssue, t.detectedIssue),
    FHIRComponentField[Option[FHIRDateTime]](whenHandedOver, t.whenHandedOver),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[Dosage]](dosageInstruction, t.dosageInstruction),
    FHIRComponentField[LitSeq[Reference]](supportingInformation, t.supportingInformation),
    FHIRComponentField[LitSeq[Reference]](authorizingPrescription, t.authorizingPrescription),
    FHIRComponentField[Option[String]](renderedDosageInstruction, t.renderedDosageInstruction),
    FHIRComponentField[LitSeq[MedicationDispense.Performer]](performer, t.performer),
    FHIRComponentField[Option[MedicationDispense.Substitution]](substitution, t.substitution)
  )
  def extractId(t: MedicationDispense): Option[String]                                    = t.id
  def extractMeta(t: MedicationDispense): Option[Meta]                                    = t.meta
  def extractText(t: MedicationDispense): Option[Narrative]                               = t.text
  def extractType(t: MedicationDispense): Option[CodeableConcept]                         = t.`type`
  def extractNote(t: MedicationDispense): LitSeq[Annotation]                              = t.note
  def extractPartOf(t: MedicationDispense): LitSeq[Reference]                             = t.partOf
  def extractStatus(t: MedicationDispense): MEDICATIONDISPENSE_STATUS                     = t.status
  def extractBasedOn(t: MedicationDispense): LitSeq[Reference]                            = t.basedOn
  def extractSubject(t: MedicationDispense): Reference                                    = t.subject
  def extractLanguage(t: MedicationDispense): Option[LANGUAGES]                           = t.language
  def extractCategory(t: MedicationDispense): LitSeq[CodeableConcept]                     = t.category
  def extractLocation(t: MedicationDispense): Option[Reference]                           = t.location
  def extractQuantity(t: MedicationDispense): Option[Quantity]                            = t.quantity
  def extractReceiver(t: MedicationDispense): LitSeq[Reference]                           = t.receiver
  def extractContained(t: MedicationDispense): LitSeq[Resource]                           = t.contained
  def extractExtension(t: MedicationDispense): LitSeq[Extension]                          = t.extension
  def extractEncounter(t: MedicationDispense): Option[Reference]                          = t.encounter
  def extractIdentifier(t: MedicationDispense): LitSeq[Identifier]                        = t.identifier
  def extractMedication(t: MedicationDispense): CodeableReference                         = t.medication
  def extractDaysSupply(t: MedicationDispense): Option[Quantity]                          = t.daysSupply
  def extractDestination(t: MedicationDispense): Option[Reference]                        = t.destination
  def extractStatusReason(t: MedicationDispense): Option[CodeableReference]               = t.statusReason
  def extractWhenPrepared(t: MedicationDispense): Option[FHIRDateTime]                    = t.whenPrepared
  def extractEventHistory(t: MedicationDispense): LitSeq[Reference]                       = t.eventHistory
  def extractImplicitRules(t: MedicationDispense): Option[UriStr]                         = t.implicitRules
  def extractDetectedIssue(t: MedicationDispense): LitSeq[Reference]                      = t.detectedIssue
  def extractWhenHandedOver(t: MedicationDispense): Option[FHIRDateTime]                  = t.whenHandedOver
  def extractModifierExtension(t: MedicationDispense): LitSeq[Extension]                  = t.modifierExtension
  def extractDosageInstruction(t: MedicationDispense): LitSeq[Dosage]                     = t.dosageInstruction
  def extractSupportingInformation(t: MedicationDispense): LitSeq[Reference]              = t.supportingInformation
  def extractAuthorizingPrescription(t: MedicationDispense): LitSeq[Reference]            = t.authorizingPrescription
  def extractRenderedDosageInstruction(t: MedicationDispense): Option[String]             = t.renderedDosageInstruction
  def extractPerformer(t: MedicationDispense): LitSeq[MedicationDispense.Performer]       = t.performer
  def extractSubstitution(t: MedicationDispense): Option[MedicationDispense.Substitution] = t.substitution
  override val thisName: String                                                           = "MedicationDispense"
  override val searchParams: Map[String, MedicationDispense => Seq[Any]] = Map(
    "identifier"       -> (obj => obj.identifier.toSeq),
    "prescription"     -> (obj => obj.authorizingPrescription.toSeq),
    "code"             -> (obj => obj.medication.concept.toSeq),
    "status"           -> (obj => Seq(obj.status)),
    "responsibleparty" -> (obj => obj.substitution.flatMap(_.responsibleParty).toSeq),
    "type"             -> (obj => obj.`type`.toSeq),
    "performer"        -> (obj => obj.performer.map(_.actor).toSeq),
    "patient"          -> (obj => obj.subject.seqIf(_.reference.exists(_.contains("Patient/"))).toSeq),
    "subject"          -> (obj => Seq(obj.subject)),
    "medication"       -> (obj => obj.medication.reference.toSeq),
    "whenprepared"     -> (obj => obj.whenPrepared.toSeq),
    "receiver"         -> (obj => obj.receiver.toSeq),
    "whenhandedover"   -> (obj => obj.whenHandedOver.toSeq),
    "destination"      -> (obj => obj.destination.toSeq),
    "encounter"        -> (obj => obj.encounter.toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[MedicationDispense] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new MedicationDispense(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("partOf", Some(LitSeq.empty)),
          cursor.decodeAs[MEDICATIONDISPENSE_STATUS]("status", None),
          cursor.decodeAs[LitSeq[Reference]]("basedOn", Some(LitSeq.empty)),
          cursor.decodeAs[Reference]("subject", None),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("category", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("location", Some(None)),
          cursor.decodeAs[Option[Quantity]]("quantity", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("receiver", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[CodeableReference]("medication", None),
          cursor.decodeAs[Option[Quantity]]("daysSupply", Some(None)),
          cursor.decodeAs[Option[Reference]]("destination", Some(None)),
          cursor.decodeAs[Option[CodeableReference]]("statusReason", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("whenPrepared", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("eventHistory", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("detectedIssue", Some(LitSeq.empty)),
          cursor.decodeAs[Option[FHIRDateTime]]("whenHandedOver", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Dosage]]("dosageInstruction", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("supportingInformation", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("authorizingPrescription", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("renderedDosageInstruction", Some(None)),
          cursor.decodeAs[LitSeq[MedicationDispense.Performer]]("performer", Some(LitSeq.empty)),
          cursor.decodeAs[Option[MedicationDispense.Substitution]]("substitution", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** Indicates that a medication product is to be or has been dispensed for a named person/patient. This includes a description of
  * the medication product (supply) provided and the instructions for administering the medication. The medication dispense is the
  * result of a pharmacy system responding to a medication order.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields `type`, note, partOf, status, basedOn, subject, category, location, quantity, receiver, encounter,
  *   identifier, medication, daysSupply, destination, statusReason, whenPrepared, eventHistory, detectedIssue, whenHandedOver,
  *   dosageInstruction, supportingInformation, authorizingPrescription, renderedDosageInstruction, performer, substitution.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *   not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *   resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to
  *   make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be
  *   represented in the narrative to ensure clinical safety.
  * @param `type`
  *   - Indicates the type of dispensing event that is performed. For example, Trial Fill, Completion of Trial, Partial Fill,
  *   Emergency Fill, Samples, etc.
  * @param note
  *   - Extra information about the dispense that could not be conveyed in the other attributes.
  * @param partOf
  *   - The procedure or medication administration that triggered the dispense.
  * @param status
  *   - A code specifying the state of the set of dispense events.
  * @param basedOn
  *   - A plan that is fulfilled in whole or in part by this MedicationDispense.
  * @param subject
  *   - A link to a resource representing the person or the group to whom the medication will be given.
  * @param language
  *   - The base language in which the resource is written.
  * @param category
  *   - Indicates the type of medication dispense (for example, drug classification like ATC, where meds would be administered,
  *   legal category of the medication.).
  * @param location
  *   - The principal physical location where the dispense was performed.
  * @param quantity
  *   - The amount of medication that has been dispensed. Includes unit of measure.
  * @param receiver
  *   - Identifies the person who picked up the medication or the location of where the medication was delivered. This will
  *   usually be a patient or their caregiver, but some cases exist where it can be a healthcare professional or a location.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param encounter
  *   - The encounter that establishes the context for this event.
  * @param identifier
  *   - Identifiers associated with this Medication Dispense that are defined by business processes and/or used to refer to it
  *   when a direct URL reference to the resource itself is not appropriate. They are business identifiers assigned to this
  *   resource by the performer or other systems and remain constant as the resource is updated and propagates from server to
  *   server.
  * @param medication
  *   - Identifies the medication being administered. This is either a link to a resource representing the details of the
  *   medication or a simple attribute carrying a code that identifies the medication from a known list of medications.
  * @param daysSupply
  *   - The amount of medication expressed as a timing amount.
  * @param destination
  *   - Identification of the facility/location where the medication was shipped to, as part of the dispense event.
  * @param statusReason
  *   - Indicates the reason why a dispense was not performed.
  * @param whenPrepared
  *   - The time when the dispensed product was packaged and reviewed.
  * @param eventHistory
  *   - A summary of the events of interest that have occurred, such as when the dispense was verified.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param detectedIssue
  *   - Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a
  *   patient; e.g. drug-drug interaction, duplicate therapy, dosage alert etc.
  * @param whenHandedOver
  *   - The time the dispensed product was provided to the patient or their representative.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *   the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually
  *   modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict
  *   set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param dosageInstruction
  *   - Indicates how the medication is to be used by the patient.
  * @param supportingInformation
  *   - Additional information that supports the medication being dispensed. For example, there may be requirements that a
  *   specific lab test has been completed prior to dispensing or the patient's weight at the time of dispensing is documented.
  * @param authorizingPrescription
  *   - Indicates the medication order that is being dispensed against.
  * @param renderedDosageInstruction
  *   - The full representation of the dose of the medication included in all dosage instructions. To be used when multiple dosage
  *   instructions are included to represent complex dosing such as increasing or tapering doses.
  * @param performer
  *   - Indicates who or what performed the event.
  * @param substitution
  *   - Indicates whether or not substitution was made as part of the dispense. In some cases, substitution will be expected but
  *   does not happen, in other cases substitution is not expected but does happen. This block explains what substitution did or
  *   did not happen and why. If nothing is specified, substitution was not done.
  */
@POJOBoilerplate
class MedicationDispense(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val `type`: Option[CodeableConcept] = None,
    val note: LitSeq[Annotation] = LitSeq.empty,
    val partOf: LitSeq[Reference] = LitSeq.empty,
    val status: MEDICATIONDISPENSE_STATUS,
    val basedOn: LitSeq[Reference] = LitSeq.empty,
    val subject: Reference,
    override val language: Option[LANGUAGES] = None,
    val category: LitSeq[CodeableConcept] = LitSeq.empty,
    val location: Option[Reference] = None,
    val quantity: Option[Quantity] = None,
    val receiver: LitSeq[Reference] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val encounter: Option[Reference] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val medication: CodeableReference,
    val daysSupply: Option[Quantity] = None,
    val destination: Option[Reference] = None,
    val statusReason: Option[CodeableReference] = None,
    val whenPrepared: Option[FHIRDateTime] = None,
    val eventHistory: LitSeq[Reference] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    val detectedIssue: LitSeq[Reference] = LitSeq.empty,
    val whenHandedOver: Option[FHIRDateTime] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val dosageInstruction: LitSeq[Dosage] = LitSeq.empty,
    val supportingInformation: LitSeq[Reference] = LitSeq.empty,
    val authorizingPrescription: LitSeq[Reference] = LitSeq.empty,
    val renderedDosageInstruction: Option[String] = None,
    val performer: LitSeq[MedicationDispense.Performer] = LitSeq.empty,
    val substitution: Option[MedicationDispense.Substitution] = None,
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
  override val thisTypeName: String = "MedicationDispense"
}
