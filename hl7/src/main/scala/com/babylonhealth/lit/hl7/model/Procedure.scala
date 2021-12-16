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
import com.babylonhealth.lit.hl7.EVENT_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Procedure extends CompanionFor[Procedure] {
  implicit def summonObjectAndCompanionProcedure865609342(o: Procedure): ObjectAndCompanion[Procedure, Procedure.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Procedure
  override type ParentType   = Procedure
  override val baseType: CompanionFor[ResourceType] = Procedure
  override val parentType: CompanionFor[ParentType] = Procedure
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Procedure")
  object FocalDevice extends CompanionFor[FocalDevice] {
    implicit def summonObjectAndCompanionFocalDevice1817527654(
        o: FocalDevice): ObjectAndCompanion[FocalDevice, FocalDevice.type] = ObjectAndCompanion(o, this)
    override type ResourceType = FocalDevice
    override type ParentType   = FocalDevice
    override val parentType: CompanionFor[ResourceType] = FocalDevice
    def apply(
        id: Option[String] = None,
        action: Option[CodeableConcept] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        manipulated: Reference,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): FocalDevice = new FocalDevice(
      id,
      action,
      extension,
      manipulated,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: FocalDevice): Option[(Option[String], Option[CodeableConcept], LitSeq[Extension], Reference, LitSeq[Extension])] =
      Some((o.id, o.action, o.extension, o.manipulated, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val action: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("action", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val manipulated: FHIRComponentFieldMeta[Reference] =
      FHIRComponentFieldMeta("manipulated", lTagOf[Reference], false, lTagOf[Reference])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, action, extension, manipulated, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: FocalDevice): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](action, t.action),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Reference](manipulated, t.manipulated),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[FocalDevice] = this
    val thisName: String                    = "FocalDevice"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[FocalDevice] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new FocalDevice(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("action", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Reference]("manipulated", None),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class FocalDevice(
      override val id: Option[String] = None,
      val action: Option[CodeableConcept] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val manipulated: Reference,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Performer extends CompanionFor[Performer] {
    implicit def summonObjectAndCompanionPerformer1817527654(o: Performer): ObjectAndCompanion[Performer, Performer.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Performer
    override type ParentType   = Performer
    override val parentType: CompanionFor[ResourceType] = Performer
    def apply(
        id: Option[String] = None,
        actor: Reference,
        function: Option[CodeableConcept] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        onBehalfOf: Option[Reference] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Performer = new Performer(
      id,
      actor,
      function,
      extension,
      onBehalfOf,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Performer): Option[(Option[String], Reference, Option[CodeableConcept], LitSeq[Extension], Option[Reference], LitSeq[Extension])] =
      Some((o.id, o.actor, o.function, o.extension, o.onBehalfOf, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val actor: FHIRComponentFieldMeta[Reference] =
      FHIRComponentFieldMeta("actor", lTagOf[Reference], false, lTagOf[Reference])
    val function: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("function", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val onBehalfOf: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("onBehalfOf", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, actor, function, extension, onBehalfOf, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Performer): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Reference](actor, t.actor),
      FHIRComponentField[Option[CodeableConcept]](function, t.function),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Reference]](onBehalfOf, t.onBehalfOf),
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
            cursor.decodeAs[Option[Reference]]("onBehalfOf", Some(None)),
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
      val onBehalfOf: Option[Reference] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  type PerformedChoice = Choice[Union01474038381]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      code: Option[CodeableConcept] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      partOf: LitSeq[Reference] = LitSeq.empty,
      status: EVENT_STATUS,
      report: LitSeq[Reference] = LitSeq.empty,
      basedOn: LitSeq[Reference] = LitSeq.empty,
      subject: Reference,
      outcome: Option[CodeableConcept] = None,
      language: Option[LANGUAGES] = None,
      category: Option[CodeableConcept] = None,
      recorder: Option[Reference] = None,
      asserter: Option[Reference] = None,
      location: Option[Reference] = None,
      bodySite: LitSeq[CodeableConcept] = LitSeq.empty,
      followUp: LitSeq[CodeableConcept] = LitSeq.empty,
      usedCode: LitSeq[CodeableConcept] = LitSeq.empty,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      encounter: Option[Reference] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
      statusReason: Option[CodeableConcept] = None,
      performed: Option[Procedure.PerformedChoice] = None,
      complication: LitSeq[CodeableConcept] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      usedReference: LitSeq[Reference] = LitSeq.empty,
      instantiatesUri: LitSeq[UriStr] = LitSeq.empty,
      reasonReference: LitSeq[Reference] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      complicationDetail: LitSeq[Reference] = LitSeq.empty,
      instantiatesCanonical: LitSeq[Canonical] = LitSeq.empty,
      performer: LitSeq[Procedure.Performer] = LitSeq.empty,
      focalDevice: LitSeq[Procedure.FocalDevice] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Procedure = new Procedure(
    id,
    meta,
    text,
    code,
    note,
    partOf,
    status,
    report,
    basedOn,
    subject,
    outcome,
    language,
    category,
    recorder,
    asserter,
    location,
    bodySite,
    followUp,
    usedCode,
    contained,
    extension,
    encounter,
    identifier,
    reasonCode,
    statusReason,
    performed,
    complication,
    implicitRules,
    usedReference,
    instantiatesUri,
    reasonReference,
    modifierExtension,
    complicationDetail,
    instantiatesCanonical,
    performer,
    focalDevice,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val code: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("code", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val partOf: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("partOf", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val status: FHIRComponentFieldMeta[EVENT_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[EVENT_STATUS], false, lTagOf[EVENT_STATUS])
  val report: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("report", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val basedOn: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("basedOn", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val subject: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("subject", lTagOf[Reference], false, lTagOf[Reference])
  val outcome: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("outcome", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val category: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("category", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val recorder: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("recorder", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val asserter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("asserter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val location: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("location", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val bodySite: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("bodySite", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val followUp: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("followUp", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val usedCode: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("usedCode", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
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
  val statusReason: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("statusReason", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val performed: FHIRComponentFieldMeta[Option[Procedure.PerformedChoice]] =
    FHIRComponentFieldMeta("performed", lTagOf[Option[Procedure.PerformedChoice]], true, lTagOf[Union01474038381])
  val complication: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("complication", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val usedReference: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("usedReference", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val instantiatesUri: FHIRComponentFieldMeta[LitSeq[UriStr]] =
    FHIRComponentFieldMeta("instantiatesUri", lTagOf[LitSeq[UriStr]], false, lTagOf[UriStr])
  val reasonReference: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("reasonReference", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val complicationDetail: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("complicationDetail", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val instantiatesCanonical: FHIRComponentFieldMeta[LitSeq[Canonical]] =
    FHIRComponentFieldMeta("instantiatesCanonical", lTagOf[LitSeq[Canonical]], false, lTagOf[Canonical])
  val performer: FHIRComponentFieldMeta[LitSeq[Procedure.Performer]] =
    FHIRComponentFieldMeta("performer", lTagOf[LitSeq[Procedure.Performer]], false, lTagOf[Procedure.Performer])
  val focalDevice: FHIRComponentFieldMeta[LitSeq[Procedure.FocalDevice]] =
    FHIRComponentFieldMeta("focalDevice", lTagOf[LitSeq[Procedure.FocalDevice]], false, lTagOf[Procedure.FocalDevice])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    code,
    note,
    partOf,
    status,
    report,
    basedOn,
    subject,
    outcome,
    language,
    category,
    recorder,
    asserter,
    location,
    bodySite,
    followUp,
    usedCode,
    contained,
    extension,
    encounter,
    identifier,
    reasonCode,
    statusReason,
    performed,
    complication,
    implicitRules,
    usedReference,
    instantiatesUri,
    reasonReference,
    modifierExtension,
    complicationDetail,
    instantiatesCanonical,
    performer,
    focalDevice
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Procedure): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[CodeableConcept]](code, t.code),
    FHIRComponentField[LitSeq[Annotation]](note, t.note),
    FHIRComponentField[LitSeq[Reference]](partOf, t.partOf),
    FHIRComponentField[EVENT_STATUS](status, t.status),
    FHIRComponentField[LitSeq[Reference]](report, t.report),
    FHIRComponentField[LitSeq[Reference]](basedOn, t.basedOn),
    FHIRComponentField[Reference](subject, t.subject),
    FHIRComponentField[Option[CodeableConcept]](outcome, t.outcome),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Option[CodeableConcept]](category, t.category),
    FHIRComponentField[Option[Reference]](recorder, t.recorder),
    FHIRComponentField[Option[Reference]](asserter, t.asserter),
    FHIRComponentField[Option[Reference]](location, t.location),
    FHIRComponentField[LitSeq[CodeableConcept]](bodySite, t.bodySite),
    FHIRComponentField[LitSeq[CodeableConcept]](followUp, t.followUp),
    FHIRComponentField[LitSeq[CodeableConcept]](usedCode, t.usedCode),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Reference]](encounter, t.encounter),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[LitSeq[CodeableConcept]](reasonCode, t.reasonCode),
    FHIRComponentField[Option[CodeableConcept]](statusReason, t.statusReason),
    FHIRComponentField[Option[Procedure.PerformedChoice]](performed, t.performed),
    FHIRComponentField[LitSeq[CodeableConcept]](complication, t.complication),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Reference]](usedReference, t.usedReference),
    FHIRComponentField[LitSeq[UriStr]](instantiatesUri, t.instantiatesUri),
    FHIRComponentField[LitSeq[Reference]](reasonReference, t.reasonReference),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[Reference]](complicationDetail, t.complicationDetail),
    FHIRComponentField[LitSeq[Canonical]](instantiatesCanonical, t.instantiatesCanonical),
    FHIRComponentField[LitSeq[Procedure.Performer]](performer, t.performer),
    FHIRComponentField[LitSeq[Procedure.FocalDevice]](focalDevice, t.focalDevice)
  )
  def extractId(t: Procedure): Option[String]                           = t.id
  def extractMeta(t: Procedure): Option[Meta]                           = t.meta
  def extractText(t: Procedure): Option[Narrative]                      = t.text
  def extractCode(t: Procedure): Option[CodeableConcept]                = t.code
  def extractNote(t: Procedure): LitSeq[Annotation]                     = t.note
  def extractPartOf(t: Procedure): LitSeq[Reference]                    = t.partOf
  def extractStatus(t: Procedure): EVENT_STATUS                         = t.status
  def extractReport(t: Procedure): LitSeq[Reference]                    = t.report
  def extractBasedOn(t: Procedure): LitSeq[Reference]                   = t.basedOn
  def extractSubject(t: Procedure): Reference                           = t.subject
  def extractOutcome(t: Procedure): Option[CodeableConcept]             = t.outcome
  def extractLanguage(t: Procedure): Option[LANGUAGES]                  = t.language
  def extractCategory(t: Procedure): Option[CodeableConcept]            = t.category
  def extractRecorder(t: Procedure): Option[Reference]                  = t.recorder
  def extractAsserter(t: Procedure): Option[Reference]                  = t.asserter
  def extractLocation(t: Procedure): Option[Reference]                  = t.location
  def extractBodySite(t: Procedure): LitSeq[CodeableConcept]            = t.bodySite
  def extractFollowUp(t: Procedure): LitSeq[CodeableConcept]            = t.followUp
  def extractUsedCode(t: Procedure): LitSeq[CodeableConcept]            = t.usedCode
  def extractContained(t: Procedure): LitSeq[Resource]                  = t.contained
  def extractExtension(t: Procedure): LitSeq[Extension]                 = t.extension
  def extractEncounter(t: Procedure): Option[Reference]                 = t.encounter
  def extractIdentifier(t: Procedure): LitSeq[Identifier]               = t.identifier
  def extractReasonCode(t: Procedure): LitSeq[CodeableConcept]          = t.reasonCode
  def extractStatusReason(t: Procedure): Option[CodeableConcept]        = t.statusReason
  def extractPerformed(t: Procedure): Option[Procedure.PerformedChoice] = t.performed
  def extractComplication(t: Procedure): LitSeq[CodeableConcept]        = t.complication
  def extractImplicitRules(t: Procedure): Option[UriStr]                = t.implicitRules
  def extractUsedReference(t: Procedure): LitSeq[Reference]             = t.usedReference
  def extractInstantiatesUri(t: Procedure): LitSeq[UriStr]              = t.instantiatesUri
  def extractReasonReference(t: Procedure): LitSeq[Reference]           = t.reasonReference
  def extractModifierExtension(t: Procedure): LitSeq[Extension]         = t.modifierExtension
  def extractComplicationDetail(t: Procedure): LitSeq[Reference]        = t.complicationDetail
  def extractInstantiatesCanonical(t: Procedure): LitSeq[Canonical]     = t.instantiatesCanonical
  def extractPerformer(t: Procedure): LitSeq[Procedure.Performer]       = t.performer
  def extractFocalDevice(t: Procedure): LitSeq[Procedure.FocalDevice]   = t.focalDevice
  override val thisName: String                                         = "Procedure"
  override val searchParams: Map[String, Procedure => Seq[Any]] = Map(
    "location"               -> (obj => obj.location.toSeq),
    "subject"                -> (obj => Seq(obj.subject)),
    "reason-code"            -> (obj => obj.reasonCode.toSeq),
    "code"                   -> (obj => obj.code.toSeq),
    "date"                   -> (obj => obj.performed.toSeq),
    "status"                 -> (obj => Seq(obj.status)),
    "category"               -> (obj => obj.category.toSeq),
    "part-of"                -> (obj => obj.partOf.toSeq),
    "based-on"               -> (obj => obj.basedOn.toSeq),
    "encounter"              -> (obj => obj.encounter.toSeq),
    "instantiates-uri"       -> (obj => obj.instantiatesUri.toSeq),
    "identifier"             -> (obj => obj.identifier.toSeq),
    "performer"              -> (obj => obj.performer.map(_.actor).toSeq),
    "reason-reference"       -> (obj => obj.reasonReference.toSeq),
    "instantiates-canonical" -> (obj => obj.instantiatesCanonical.toSeq),
    "patient"                -> (obj => obj.subject.seqIf(_.reference.exists(_.contains("Patient/"))).toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Procedure] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Procedure(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("code", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("partOf", Some(LitSeq.empty)),
          cursor.decodeAs[EVENT_STATUS]("status", None),
          cursor.decodeAs[LitSeq[Reference]]("report", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("basedOn", Some(LitSeq.empty)),
          cursor.decodeAs[Reference]("subject", None),
          cursor.decodeAs[Option[CodeableConcept]]("outcome", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("category", Some(None)),
          cursor.decodeAs[Option[Reference]]("recorder", Some(None)),
          cursor.decodeAs[Option[Reference]]("asserter", Some(None)),
          cursor.decodeAs[Option[Reference]]("location", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("bodySite", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("followUp", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("usedCode", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("reasonCode", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("statusReason", Some(None)),
          cursor.decodeOptRef[Union01474038381]("performed"),
          cursor.decodeAs[LitSeq[CodeableConcept]]("complication", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("usedReference", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[UriStr]]("instantiatesUri", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("reasonReference", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("complicationDetail", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Canonical]]("instantiatesCanonical", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Procedure.Performer]]("performer", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Procedure.FocalDevice]]("focalDevice", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** An action that is or was performed on or for a patient. This can be a physical intervention like an operation, or less
  * invasive like long term services, counseling, or hypnotherapy.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields code, note, partOf, status, report, basedOn, subject, outcome, category, recorder, asserter, location,
  *   bodySite, followUp, usedCode, encounter, identifier, reasonCode, statusReason, performed, complication, usedReference,
  *   instantiatesUri, reasonReference, complicationDetail, instantiatesCanonical, performer, focalDevice.
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
  * @param code
  *   - The specific procedure that is performed. Use text if the exact nature of the procedure cannot be coded (e.g.
  *   "Laparoscopic Appendectomy").
  * @param note
  *   - Any other notes and comments about the procedure.
  * @param partOf
  *   - A larger event of which this particular procedure is a component or step.
  * @param status
  *   - A code specifying the state of the procedure. Generally, this will be the in-progress or completed state.
  * @param report
  *   - This could be a histology result, pathology report, surgical report, etc.
  * @param basedOn
  *   - A reference to a resource that contains details of the request for this procedure.
  * @param subject
  *   - The person, animal or group on which the procedure was performed.
  * @param outcome
  *   - The outcome of the procedure - did it resolve the reasons for the procedure being performed?
  * @param language
  *   - The base language in which the resource is written.
  * @param category
  *   - A code that classifies the procedure for searching, sorting and display purposes (e.g. "Surgical Procedure").
  * @param recorder
  *   - Individual who recorded the record and takes responsibility for its content.
  * @param asserter
  *   - Individual who is making the procedure statement.
  * @param location
  *   - The location where the procedure actually happened. E.g. a newborn at home, a tracheostomy at a restaurant.
  * @param bodySite
  *   - Detailed and structured anatomical location information. Multiple locations are allowed - e.g. multiple punch biopsies of
  *   a lesion.
  * @param followUp
  *   - If the procedure required specific follow up - e.g. removal of sutures. The follow up may be represented as a simple note
  *   or could potentially be more complex, in which case the CarePlan resource can be used.
  * @param usedCode
  *   - Identifies coded items that were used as part of the procedure.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param encounter
  *   - The Encounter during which this Procedure was created or performed or to which the creation of this record is tightly
  *   associated.
  * @param identifier
  *   - Business identifiers assigned to this procedure by the performer or other systems which remain constant as the resource is
  *   updated and is propagated from server to server.
  * @param reasonCode
  *   - The coded reason why the procedure was performed. This may be a coded entity of some type, or may simply be present as
  *   text.
  * @param statusReason
  *   - Captures the reason for the current state of the procedure.
  * @param performed
  *   - Estimated or actual date, date-time, period, or age when the procedure was performed. Allows a period to support complex
  *   procedures that span more than one date, and also allows for the length of the procedure to be captured.
  * @param complication
  *   - Any complications that occurred during the procedure, or in the immediate post-performance period. These are generally
  *   tracked separately from the notes, which will typically describe the procedure itself rather than any 'post procedure'
  *   issues.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param usedReference
  *   - Identifies medications, devices and any other substance used as part of the procedure.
  * @param instantiatesUri
  *   - The URL pointing to an externally maintained protocol, guideline, order set or other definition that is adhered to in
  *   whole or in part by this Procedure.
  * @param reasonReference
  *   - The justification of why the procedure was performed.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *   the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually
  *   modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict
  *   set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param complicationDetail
  *   - Any complications that occurred during the procedure, or in the immediate post-performance period.
  * @param instantiatesCanonical
  *   - The URL pointing to a FHIR-defined protocol, guideline, order set or other definition that is adhered to in whole or in
  *   part by this Procedure.
  * @param performer
  *   - Limited to "real" people rather than equipment.
  * @param focalDevice
  *   - A device that is implanted, removed or otherwise manipulated (calibration, battery replacement, fitting a prosthesis,
  *   attaching a wound-vac, etc.) as a focal portion of the Procedure.
  */
@POJOBoilerplate
class Procedure(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val code: Option[CodeableConcept] = None,
    val note: LitSeq[Annotation] = LitSeq.empty,
    val partOf: LitSeq[Reference] = LitSeq.empty,
    val status: EVENT_STATUS,
    val report: LitSeq[Reference] = LitSeq.empty,
    val basedOn: LitSeq[Reference] = LitSeq.empty,
    val subject: Reference,
    val outcome: Option[CodeableConcept] = None,
    override val language: Option[LANGUAGES] = None,
    val category: Option[CodeableConcept] = None,
    val recorder: Option[Reference] = None,
    val asserter: Option[Reference] = None,
    val location: Option[Reference] = None,
    val bodySite: LitSeq[CodeableConcept] = LitSeq.empty,
    val followUp: LitSeq[CodeableConcept] = LitSeq.empty,
    val usedCode: LitSeq[CodeableConcept] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val encounter: Option[Reference] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
    val statusReason: Option[CodeableConcept] = None,
    val performed: Option[Procedure.PerformedChoice] = None,
    val complication: LitSeq[CodeableConcept] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    val usedReference: LitSeq[Reference] = LitSeq.empty,
    val instantiatesUri: LitSeq[UriStr] = LitSeq.empty,
    val reasonReference: LitSeq[Reference] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val complicationDetail: LitSeq[Reference] = LitSeq.empty,
    val instantiatesCanonical: LitSeq[Canonical] = LitSeq.empty,
    val performer: LitSeq[Procedure.Performer] = LitSeq.empty,
    val focalDevice: LitSeq[Procedure.FocalDevice] = LitSeq.empty,
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
  override val thisTypeName: String = "Procedure"
}
