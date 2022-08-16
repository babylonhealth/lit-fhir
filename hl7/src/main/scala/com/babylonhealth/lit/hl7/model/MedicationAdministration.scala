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
import com.babylonhealth.lit.hl7.MEDICATION_ADMIN_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object MedicationAdministration extends CompanionFor[MedicationAdministration] {
  implicit def summonObjectAndCompanionMedicationAdministration1237037570(
      o: MedicationAdministration): ObjectAndCompanion[MedicationAdministration, MedicationAdministration.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = MedicationAdministration
  override type ParentType   = MedicationAdministration
  override val baseType: CompanionFor[ResourceType] = MedicationAdministration
  override val parentType: CompanionFor[ParentType] = MedicationAdministration
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/MedicationAdministration")
  object Performer extends CompanionFor[Performer] {
    implicit def summonObjectAndCompanionPerformer_685159846(o: Performer): ObjectAndCompanion[Performer, Performer.type] =
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
  object Dosage extends CompanionFor[Dosage] {
    implicit def summonObjectAndCompanionDosage_685159846(o: Dosage): ObjectAndCompanion[Dosage, Dosage.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Dosage
    override type ParentType   = Dosage
    override val parentType: CompanionFor[ResourceType] = Dosage
    type RateChoice = Choice[UnionQuantityOrRatio]
    def apply(
        id: Option[String] = None,
        text: Option[String] = None,
        site: Option[CodeableConcept] = None,
        dose: Option[Quantity] = None,
        route: Option[CodeableConcept] = None,
        method: Option[CodeableConcept] = None,
        rate: Option[Dosage.RateChoice] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Dosage = new Dosage(
      id,
      text,
      site,
      dose,
      route,
      method,
      rate,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Dosage): Option[(Option[String], Option[String], Option[CodeableConcept], Option[Quantity], Option[CodeableConcept], Option[CodeableConcept], Option[Dosage.RateChoice], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.text, o.site, o.dose, o.route, o.method, o.rate, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val text: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("text", lTagOf[Option[String]], false, lTagOf[String])
    val site: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("site", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val dose: FHIRComponentFieldMeta[Option[Quantity]] =
      FHIRComponentFieldMeta("dose", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
    val route: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("route", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val method: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("method", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val rate: FHIRComponentFieldMeta[Option[Dosage.RateChoice]] =
      FHIRComponentFieldMeta("rate", lTagOf[Option[Dosage.RateChoice]], true, lTagOf[UnionQuantityOrRatio])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, text, site, dose, route, method, rate, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Dosage): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[String]](text, t.text),
      FHIRComponentField[Option[CodeableConcept]](site, t.site),
      FHIRComponentField[Option[Quantity]](dose, t.dose),
      FHIRComponentField[Option[CodeableConcept]](route, t.route),
      FHIRComponentField[Option[CodeableConcept]](method, t.method),
      FHIRComponentField[Option[Dosage.RateChoice]](rate, t.rate),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Dosage] = this
    val thisName: String               = "Dosage"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Dosage] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Dosage(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[String]]("text", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("site", Some(None)),
            cursor.decodeAs[Option[Quantity]]("dose", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("route", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("method", Some(None)),
            cursor.decodeOptRef[UnionQuantityOrRatio]("rate"),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Dosage(
      override val id: Option[String] = None,
      val text: Option[String] = None,
      val site: Option[CodeableConcept] = None,
      val dose: Option[Quantity] = None,
      val route: Option[CodeableConcept] = None,
      val method: Option[CodeableConcept] = None,
      val rate: Option[Dosage.RateChoice] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  type EffectiveChoice  = Choice[UnionDateTimeOrPeriod]
  type MedicationChoice = Choice[UnionCodeableConceptOrReference]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      partOf: LitSeq[Reference] = LitSeq.empty,
      status: MEDICATION_ADMIN_STATUS,
      device: LitSeq[Reference] = LitSeq.empty,
      subject: Reference,
      context: Option[Reference] = None,
      request: Option[Reference] = None,
      language: Option[LANGUAGES] = None,
      category: Option[CodeableConcept] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
      instantiates: LitSeq[UriStr] = LitSeq.empty,
      statusReason: LitSeq[CodeableConcept] = LitSeq.empty,
      effective: MedicationAdministration.EffectiveChoice,
      eventHistory: LitSeq[Reference] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      medication: MedicationAdministration.MedicationChoice,
      reasonReference: LitSeq[Reference] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      supportingInformation: LitSeq[Reference] = LitSeq.empty,
      dosage: Option[MedicationAdministration.Dosage] = None,
      performer: LitSeq[MedicationAdministration.Performer] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): MedicationAdministration = new MedicationAdministration(
    id,
    meta,
    text,
    note,
    partOf,
    status,
    device,
    subject,
    context,
    request,
    language,
    category,
    contained,
    extension,
    identifier,
    reasonCode,
    instantiates,
    statusReason,
    effective,
    eventHistory,
    implicitRules,
    medication,
    reasonReference,
    modifierExtension,
    supportingInformation,
    dosage,
    performer,
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
  val status: FHIRComponentFieldMeta[MEDICATION_ADMIN_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[MEDICATION_ADMIN_STATUS], false, lTagOf[MEDICATION_ADMIN_STATUS])
  val device: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("device", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val subject: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("subject", lTagOf[Reference], false, lTagOf[Reference])
  val context: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("context", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val request: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("request", lTagOf[Option[Reference]], false, lTagOf[Reference])
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
  val instantiates: FHIRComponentFieldMeta[LitSeq[UriStr]] =
    FHIRComponentFieldMeta("instantiates", lTagOf[LitSeq[UriStr]], false, lTagOf[UriStr])
  val statusReason: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("statusReason", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val effective: FHIRComponentFieldMeta[MedicationAdministration.EffectiveChoice] =
    FHIRComponentFieldMeta("effective", lTagOf[MedicationAdministration.EffectiveChoice], true, lTagOf[UnionDateTimeOrPeriod])
  val eventHistory: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("eventHistory", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val medication: FHIRComponentFieldMeta[MedicationAdministration.MedicationChoice] =
    FHIRComponentFieldMeta(
      "medication",
      lTagOf[MedicationAdministration.MedicationChoice],
      true,
      lTagOf[UnionCodeableConceptOrReference])
  val reasonReference: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("reasonReference", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val supportingInformation: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("supportingInformation", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val dosage: FHIRComponentFieldMeta[Option[MedicationAdministration.Dosage]] =
    FHIRComponentFieldMeta(
      "dosage",
      lTagOf[Option[MedicationAdministration.Dosage]],
      false,
      lTagOf[MedicationAdministration.Dosage])
  val performer: FHIRComponentFieldMeta[LitSeq[MedicationAdministration.Performer]] =
    FHIRComponentFieldMeta(
      "performer",
      lTagOf[LitSeq[MedicationAdministration.Performer]],
      false,
      lTagOf[MedicationAdministration.Performer])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    note,
    partOf,
    status,
    device,
    subject,
    context,
    request,
    language,
    category,
    contained,
    extension,
    identifier,
    reasonCode,
    instantiates,
    statusReason,
    effective,
    eventHistory,
    implicitRules,
    medication,
    reasonReference,
    modifierExtension,
    supportingInformation,
    dosage,
    performer
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: MedicationAdministration): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[LitSeq[Annotation]](note, t.note),
    FHIRComponentField[LitSeq[Reference]](partOf, t.partOf),
    FHIRComponentField[MEDICATION_ADMIN_STATUS](status, t.status),
    FHIRComponentField[LitSeq[Reference]](device, t.device),
    FHIRComponentField[Reference](subject, t.subject),
    FHIRComponentField[Option[Reference]](context, t.context),
    FHIRComponentField[Option[Reference]](request, t.request),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Option[CodeableConcept]](category, t.category),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[LitSeq[CodeableConcept]](reasonCode, t.reasonCode),
    FHIRComponentField[LitSeq[UriStr]](instantiates, t.instantiates),
    FHIRComponentField[LitSeq[CodeableConcept]](statusReason, t.statusReason),
    FHIRComponentField[MedicationAdministration.EffectiveChoice](effective, t.effective),
    FHIRComponentField[LitSeq[Reference]](eventHistory, t.eventHistory),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[MedicationAdministration.MedicationChoice](medication, t.medication),
    FHIRComponentField[LitSeq[Reference]](reasonReference, t.reasonReference),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[Reference]](supportingInformation, t.supportingInformation),
    FHIRComponentField[Option[MedicationAdministration.Dosage]](dosage, t.dosage),
    FHIRComponentField[LitSeq[MedicationAdministration.Performer]](performer, t.performer)
  )
  def extractId(t: MedicationAdministration): Option[String]                                    = t.id
  def extractMeta(t: MedicationAdministration): Option[Meta]                                    = t.meta
  def extractText(t: MedicationAdministration): Option[Narrative]                               = t.text
  def extractNote(t: MedicationAdministration): LitSeq[Annotation]                              = t.note
  def extractPartOf(t: MedicationAdministration): LitSeq[Reference]                             = t.partOf
  def extractStatus(t: MedicationAdministration): MEDICATION_ADMIN_STATUS                       = t.status
  def extractDevice(t: MedicationAdministration): LitSeq[Reference]                             = t.device
  def extractSubject(t: MedicationAdministration): Reference                                    = t.subject
  def extractContext(t: MedicationAdministration): Option[Reference]                            = t.context
  def extractRequest(t: MedicationAdministration): Option[Reference]                            = t.request
  def extractLanguage(t: MedicationAdministration): Option[LANGUAGES]                           = t.language
  def extractCategory(t: MedicationAdministration): Option[CodeableConcept]                     = t.category
  def extractContained(t: MedicationAdministration): LitSeq[Resource]                           = t.contained
  def extractExtension(t: MedicationAdministration): LitSeq[Extension]                          = t.extension
  def extractIdentifier(t: MedicationAdministration): LitSeq[Identifier]                        = t.identifier
  def extractReasonCode(t: MedicationAdministration): LitSeq[CodeableConcept]                   = t.reasonCode
  def extractInstantiates(t: MedicationAdministration): LitSeq[UriStr]                          = t.instantiates
  def extractStatusReason(t: MedicationAdministration): LitSeq[CodeableConcept]                 = t.statusReason
  def extractEffective(t: MedicationAdministration): MedicationAdministration.EffectiveChoice   = t.effective
  def extractEventHistory(t: MedicationAdministration): LitSeq[Reference]                       = t.eventHistory
  def extractImplicitRules(t: MedicationAdministration): Option[UriStr]                         = t.implicitRules
  def extractMedication(t: MedicationAdministration): MedicationAdministration.MedicationChoice = t.medication
  def extractReasonReference(t: MedicationAdministration): LitSeq[Reference]                    = t.reasonReference
  def extractModifierExtension(t: MedicationAdministration): LitSeq[Extension]                  = t.modifierExtension
  def extractSupportingInformation(t: MedicationAdministration): LitSeq[Reference]              = t.supportingInformation
  def extractDosage(t: MedicationAdministration): Option[MedicationAdministration.Dosage]       = t.dosage
  def extractPerformer(t: MedicationAdministration): LitSeq[MedicationAdministration.Performer] = t.performer
  override val thisName: String                                                                 = "MedicationAdministration"
  override val searchParams: Map[String, MedicationAdministration => Seq[Any]] = Map(
    "request"          -> (obj => obj.request.toSeq),
    "identifier"       -> (obj => obj.identifier.toSeq),
    "context"          -> (obj => obj.context.toSeq),
    "reason-not-given" -> (obj => obj.statusReason.toSeq),
    "status"           -> (obj => Seq(obj.status)),
    "effective-time"   -> (obj => Seq(obj.effective)),
    "patient"          -> (obj => obj.subject.seqIf(_.reference.exists(_.contains("Patient/"))).toSeq),
    "subject"          -> (obj => Seq(obj.subject)),
    "medication"       -> (obj => obj.medication.as[Reference].toSeq),
    "reason-given"     -> (obj => obj.reasonCode.toSeq),
    "code"             -> (obj => obj.medication.as[CodeableConcept].toSeq),
    "device"           -> (obj => obj.device.toSeq),
    "performer"        -> (obj => obj.performer.map(_.actor).toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[MedicationAdministration] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new MedicationAdministration(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("partOf", Some(LitSeq.empty)),
          cursor.decodeAs[MEDICATION_ADMIN_STATUS]("status", None),
          cursor.decodeAs[LitSeq[Reference]]("device", Some(LitSeq.empty)),
          cursor.decodeAs[Reference]("subject", None),
          cursor.decodeAs[Option[Reference]]("context", Some(None)),
          cursor.decodeAs[Option[Reference]]("request", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("category", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("reasonCode", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[UriStr]]("instantiates", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("statusReason", Some(LitSeq.empty)),
          cursor.decodeRef[UnionDateTimeOrPeriod]("effective"),
          cursor.decodeAs[LitSeq[Reference]]("eventHistory", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeRef[UnionCodeableConceptOrReference]("medication"),
          cursor.decodeAs[LitSeq[Reference]]("reasonReference", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("supportingInformation", Some(LitSeq.empty)),
          cursor.decodeAs[Option[MedicationAdministration.Dosage]]("dosage", Some(None)),
          cursor.decodeAs[LitSeq[MedicationAdministration.Performer]]("performer", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Describes the event of a patient consuming or otherwise being administered a medication. This may be as simple as swallowing a
  * tablet or it may be a long running infusion. Related resources tie this event to the authorizing prescription, and the
  * specific encounter between patient and health care practitioner.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields note, partOf, status, device, subject, context, request, category, identifier, reasonCode,
  *   instantiates, statusReason, effective, eventHistory, medication, reasonReference, supportingInformation, dosage, performer.
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
  *   - Extra information about the medication administration that is not conveyed by the other attributes.
  * @param partOf
  *   - A larger event of which this particular event is a component or step.
  * @param status
  *   - Will generally be set to show that the administration has been completed. For some long running administrations such as
  *     infusions, it is possible for an administration to be started but not completed or it may be paused while some other
  *     process is under way.
  * @param device
  *   - The device used in administering the medication to the patient. For example, a particular infusion pump.
  * @param subject
  *   - The person or animal or group receiving the medication.
  * @param context
  *   - The visit, admission, or other contact between patient and health care provider during which the medication administration
  *     was performed.
  * @param request
  *   - The original request, instruction or authority to perform the administration.
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
  *   - Identifiers associated with this Medication Administration that are defined by business processes and/or used to refer to
  *     it when a direct URL reference to the resource itself is not appropriate. They are business identifiers assigned to this
  *     resource by the performer or other systems and remain constant as the resource is updated and propagates from server to
  *     server.
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
  * @param eventHistory
  *   - A summary of the events of interest that have occurred, such as when the administration was verified.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *     processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *     other profiles etc.
  * @param medication
  *   - Identifies the medication that was administered. This is either a link to a resource representing the details of the
  *     medication or a simple attribute carrying a code that identifies the medication from a known list of medications.
  * @param reasonReference
  *   - Condition or observation that supports why the medication was administered.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *     the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *     Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *     strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *     extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *     processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of
  *     any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param supportingInformation
  *   - Additional information (for example, patient height and weight) that supports the administration of the medication.
  * @param dosage
  *   - Describes the medication dosage information details e.g. dose, rate, site, route, etc.
  * @param performer
  *   - Indicates who or what performed the medication administration and how they were involved.
  */
@POJOBoilerplate
class MedicationAdministration(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val note: LitSeq[Annotation] = LitSeq.empty,
    val partOf: LitSeq[Reference] = LitSeq.empty,
    val status: MEDICATION_ADMIN_STATUS,
    val device: LitSeq[Reference] = LitSeq.empty,
    val subject: Reference,
    val context: Option[Reference] = None,
    val request: Option[Reference] = None,
    override val language: Option[LANGUAGES] = None,
    val category: Option[CodeableConcept] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
    val instantiates: LitSeq[UriStr] = LitSeq.empty,
    val statusReason: LitSeq[CodeableConcept] = LitSeq.empty,
    val effective: MedicationAdministration.EffectiveChoice,
    val eventHistory: LitSeq[Reference] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    val medication: MedicationAdministration.MedicationChoice,
    val reasonReference: LitSeq[Reference] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val supportingInformation: LitSeq[Reference] = LitSeq.empty,
    val dosage: Option[MedicationAdministration.Dosage] = None,
    val performer: LitSeq[MedicationAdministration.Performer] = LitSeq.empty,
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
  override val thisTypeName: String = "MedicationAdministration"
}
