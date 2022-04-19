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
import com.babylonhealth.lit.hl7.VERIFICATIONRESULT_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object VerificationResult extends CompanionFor[VerificationResult] {
  implicit def summonObjectAndCompanionVerificationResult1365153485(
      o: VerificationResult): ObjectAndCompanion[VerificationResult, VerificationResult.type] = ObjectAndCompanion(o, this)
  override type ResourceType = VerificationResult
  override type ParentType   = VerificationResult
  override val baseType: CompanionFor[ResourceType] = VerificationResult
  override val parentType: CompanionFor[ParentType] = VerificationResult
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/VerificationResult")
  object Attestation extends CompanionFor[Attestation] {
    implicit def summonObjectAndCompanionAttestation1914178672(
        o: Attestation): ObjectAndCompanion[Attestation, Attestation.type] = ObjectAndCompanion(o, this)
    override type ResourceType = Attestation
    override type ParentType   = Attestation
    override val parentType: CompanionFor[ResourceType] = Attestation
    def apply(
        id: Option[String] = None,
        who: Option[Reference] = None,
        date: Option[FHIRDate] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        onBehalfOf: Option[Reference] = None,
        proxySignature: Option[Signature] = None,
        sourceSignature: Option[Signature] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        communicationMethod: Option[CodeableConcept] = None,
        proxyIdentityCertificate: Option[String] = None,
        sourceIdentityCertificate: Option[String] = None,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Attestation = new Attestation(
      id,
      who,
      date,
      extension,
      onBehalfOf,
      proxySignature,
      sourceSignature,
      modifierExtension,
      communicationMethod,
      proxyIdentityCertificate,
      sourceIdentityCertificate,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Attestation): Option[(Option[String], Option[Reference], Option[FHIRDate], LitSeq[Extension], Option[Reference], Option[Signature], Option[Signature], LitSeq[Extension], Option[CodeableConcept], Option[String], Option[String])] =
      Some(
        (
          o.id,
          o.who,
          o.date,
          o.extension,
          o.onBehalfOf,
          o.proxySignature,
          o.sourceSignature,
          o.modifierExtension,
          o.communicationMethod,
          o.proxyIdentityCertificate,
          o.sourceIdentityCertificate))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val who: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("who", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val date: FHIRComponentFieldMeta[Option[FHIRDate]] =
      FHIRComponentFieldMeta("date", lTagOf[Option[FHIRDate]], false, lTagOf[FHIRDate])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val onBehalfOf: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("onBehalfOf", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val proxySignature: FHIRComponentFieldMeta[Option[Signature]] =
      FHIRComponentFieldMeta("proxySignature", lTagOf[Option[Signature]], false, lTagOf[Signature])
    val sourceSignature: FHIRComponentFieldMeta[Option[Signature]] =
      FHIRComponentFieldMeta("sourceSignature", lTagOf[Option[Signature]], false, lTagOf[Signature])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val communicationMethod: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("communicationMethod", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val proxyIdentityCertificate: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("proxyIdentityCertificate", lTagOf[Option[String]], false, lTagOf[String])
    val sourceIdentityCertificate: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("sourceIdentityCertificate", lTagOf[Option[String]], false, lTagOf[String])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
      id,
      who,
      date,
      extension,
      onBehalfOf,
      proxySignature,
      sourceSignature,
      modifierExtension,
      communicationMethod,
      proxyIdentityCertificate,
      sourceIdentityCertificate
    )
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Attestation): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Reference]](who, t.who),
      FHIRComponentField[Option[FHIRDate]](date, t.date),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Reference]](onBehalfOf, t.onBehalfOf),
      FHIRComponentField[Option[Signature]](proxySignature, t.proxySignature),
      FHIRComponentField[Option[Signature]](sourceSignature, t.sourceSignature),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[CodeableConcept]](communicationMethod, t.communicationMethod),
      FHIRComponentField[Option[String]](proxyIdentityCertificate, t.proxyIdentityCertificate),
      FHIRComponentField[Option[String]](sourceIdentityCertificate, t.sourceIdentityCertificate)
    )
    val baseType: CompanionFor[Attestation] = this
    val thisName: String                    = "Attestation"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Attestation] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Attestation(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[Reference]]("who", Some(None)),
            cursor.decodeAs[Option[FHIRDate]]("date", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Reference]]("onBehalfOf", Some(None)),
            cursor.decodeAs[Option[Signature]]("proxySignature", Some(None)),
            cursor.decodeAs[Option[Signature]]("sourceSignature", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[CodeableConcept]]("communicationMethod", Some(None)),
            cursor.decodeAs[Option[String]]("proxyIdentityCertificate", Some(None)),
            cursor.decodeAs[Option[String]]("sourceIdentityCertificate", Some(None)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Attestation(
      override val id: Option[String] = None,
      val who: Option[Reference] = None,
      val date: Option[FHIRDate] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val onBehalfOf: Option[Reference] = None,
      val proxySignature: Option[Signature] = None,
      val sourceSignature: Option[Signature] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val communicationMethod: Option[CodeableConcept] = None,
      val proxyIdentityCertificate: Option[String] = None,
      val sourceIdentityCertificate: Option[String] = None,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object PrimarySource extends CompanionFor[PrimarySource] {
    implicit def summonObjectAndCompanionPrimarySource1914178672(
        o: PrimarySource): ObjectAndCompanion[PrimarySource, PrimarySource.type] = ObjectAndCompanion(o, this)
    override type ResourceType = PrimarySource
    override type ParentType   = PrimarySource
    override val parentType: CompanionFor[ResourceType] = PrimarySource
    def apply(
        id: Option[String] = None,
        who: Option[Reference] = None,
        `type`: LitSeq[CodeableConcept] = LitSeq.empty,
        extension: LitSeq[Extension] = LitSeq.empty,
        validationDate: Option[FHIRDateTime] = None,
        canPushUpdates: Option[CodeableConcept] = None,
        validationStatus: Option[CodeableConcept] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        pushTypeAvailable: LitSeq[CodeableConcept] = LitSeq.empty,
        communicationMethod: LitSeq[CodeableConcept] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): PrimarySource = new PrimarySource(
      id,
      who,
      `type`,
      extension,
      validationDate,
      canPushUpdates,
      validationStatus,
      modifierExtension,
      pushTypeAvailable,
      communicationMethod,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: PrimarySource): Option[(Option[String], Option[Reference], LitSeq[CodeableConcept], LitSeq[Extension], Option[FHIRDateTime], Option[CodeableConcept], Option[CodeableConcept], LitSeq[Extension], LitSeq[CodeableConcept], LitSeq[CodeableConcept])] =
      Some(
        (
          o.id,
          o.who,
          o.`type`,
          o.extension,
          o.validationDate,
          o.canPushUpdates,
          o.validationStatus,
          o.modifierExtension,
          o.pushTypeAvailable,
          o.communicationMethod))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val who: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("who", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val `type`: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val validationDate: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
      FHIRComponentFieldMeta("validationDate", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
    val canPushUpdates: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("canPushUpdates", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val validationStatus: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("validationStatus", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val pushTypeAvailable: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("pushTypeAvailable", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val communicationMethod: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("communicationMethod", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
      id,
      who,
      `type`,
      extension,
      validationDate,
      canPushUpdates,
      validationStatus,
      modifierExtension,
      pushTypeAvailable,
      communicationMethod)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: PrimarySource): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Reference]](who, t.who),
      FHIRComponentField[LitSeq[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[FHIRDateTime]](validationDate, t.validationDate),
      FHIRComponentField[Option[CodeableConcept]](canPushUpdates, t.canPushUpdates),
      FHIRComponentField[Option[CodeableConcept]](validationStatus, t.validationStatus),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[CodeableConcept]](pushTypeAvailable, t.pushTypeAvailable),
      FHIRComponentField[LitSeq[CodeableConcept]](communicationMethod, t.communicationMethod)
    )
    val baseType: CompanionFor[PrimarySource] = this
    val thisName: String                      = "PrimarySource"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[PrimarySource] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new PrimarySource(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[Reference]]("who", Some(None)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("type", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[FHIRDateTime]]("validationDate", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("canPushUpdates", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("validationStatus", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("pushTypeAvailable", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("communicationMethod", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class PrimarySource(
      override val id: Option[String] = None,
      val who: Option[Reference] = None,
      val `type`: LitSeq[CodeableConcept] = LitSeq.empty,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val validationDate: Option[FHIRDateTime] = None,
      val canPushUpdates: Option[CodeableConcept] = None,
      val validationStatus: Option[CodeableConcept] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val pushTypeAvailable: LitSeq[CodeableConcept] = LitSeq.empty,
      val communicationMethod: LitSeq[CodeableConcept] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Validator extends CompanionFor[Validator] {
    implicit def summonObjectAndCompanionValidator1914178672(o: Validator): ObjectAndCompanion[Validator, Validator.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Validator
    override type ParentType   = Validator
    override val parentType: CompanionFor[ResourceType] = Validator
    def apply(
        id: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        organization: Reference,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        identityCertificate: Option[String] = None,
        attestationSignature: Option[Signature] = None,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Validator = new Validator(
      id,
      extension,
      organization,
      modifierExtension,
      identityCertificate,
      attestationSignature,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Validator): Option[(Option[String], LitSeq[Extension], Reference, LitSeq[Extension], Option[String], Option[Signature])] =
      Some((o.id, o.extension, o.organization, o.modifierExtension, o.identityCertificate, o.attestationSignature))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val organization: FHIRComponentFieldMeta[Reference] =
      FHIRComponentFieldMeta("organization", lTagOf[Reference], false, lTagOf[Reference])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val identityCertificate: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("identityCertificate", lTagOf[Option[String]], false, lTagOf[String])
    val attestationSignature: FHIRComponentFieldMeta[Option[Signature]] =
      FHIRComponentFieldMeta("attestationSignature", lTagOf[Option[Signature]], false, lTagOf[Signature])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, extension, organization, modifierExtension, identityCertificate, attestationSignature)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Validator): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Reference](organization, t.organization),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[String]](identityCertificate, t.identityCertificate),
      FHIRComponentField[Option[Signature]](attestationSignature, t.attestationSignature)
    )
    val baseType: CompanionFor[Validator] = this
    val thisName: String                  = "Validator"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Validator] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Validator(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Reference]("organization", None),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("identityCertificate", Some(None)),
            cursor.decodeAs[Option[Signature]]("attestationSignature", Some(None)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Validator(
      override val id: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val organization: Reference,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val identityCertificate: Option[String] = None,
      val attestationSignature: Option[Signature] = None,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      need: Option[CodeableConcept] = None,
      target: LitSeq[Reference] = LitSeq.empty,
      status: VERIFICATIONRESULT_STATUS,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      frequency: Option[Timing] = None,
      statusDate: Option[FHIRDateTime] = None,
      implicitRules: Option[UriStr] = None,
      lastPerformed: Option[FHIRDateTime] = None,
      nextScheduled: Option[FHIRDate] = None,
      failureAction: Option[CodeableConcept] = None,
      targetLocation: LitSeq[String] = LitSeq.empty,
      validationType: Option[CodeableConcept] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      validationProcess: LitSeq[CodeableConcept] = LitSeq.empty,
      validator: LitSeq[VerificationResult.Validator] = LitSeq.empty,
      primarySource: LitSeq[VerificationResult.PrimarySource] = LitSeq.empty,
      attestation: Option[VerificationResult.Attestation] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): VerificationResult = new VerificationResult(
    id,
    meta,
    text,
    need,
    target,
    status,
    language,
    contained,
    extension,
    frequency,
    statusDate,
    implicitRules,
    lastPerformed,
    nextScheduled,
    failureAction,
    targetLocation,
    validationType,
    modifierExtension,
    validationProcess,
    validator,
    primarySource,
    attestation,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val need: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("need", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val target: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("target", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val status: FHIRComponentFieldMeta[VERIFICATIONRESULT_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[VERIFICATIONRESULT_STATUS], false, lTagOf[VERIFICATIONRESULT_STATUS])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val frequency: FHIRComponentFieldMeta[Option[Timing]] =
    FHIRComponentFieldMeta("frequency", lTagOf[Option[Timing]], false, lTagOf[Timing])
  val statusDate: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("statusDate", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val lastPerformed: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("lastPerformed", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val nextScheduled: FHIRComponentFieldMeta[Option[FHIRDate]] =
    FHIRComponentFieldMeta("nextScheduled", lTagOf[Option[FHIRDate]], false, lTagOf[FHIRDate])
  val failureAction: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("failureAction", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val targetLocation: FHIRComponentFieldMeta[LitSeq[String]] =
    FHIRComponentFieldMeta("targetLocation", lTagOf[LitSeq[String]], false, lTagOf[String])
  val validationType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("validationType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val validationProcess: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("validationProcess", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val validator: FHIRComponentFieldMeta[LitSeq[VerificationResult.Validator]] =
    FHIRComponentFieldMeta("validator", lTagOf[LitSeq[VerificationResult.Validator]], false, lTagOf[VerificationResult.Validator])
  val primarySource: FHIRComponentFieldMeta[LitSeq[VerificationResult.PrimarySource]] =
    FHIRComponentFieldMeta(
      "primarySource",
      lTagOf[LitSeq[VerificationResult.PrimarySource]],
      false,
      lTagOf[VerificationResult.PrimarySource])
  val attestation: FHIRComponentFieldMeta[Option[VerificationResult.Attestation]] =
    FHIRComponentFieldMeta(
      "attestation",
      lTagOf[Option[VerificationResult.Attestation]],
      false,
      lTagOf[VerificationResult.Attestation])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    need,
    target,
    status,
    language,
    contained,
    extension,
    frequency,
    statusDate,
    implicitRules,
    lastPerformed,
    nextScheduled,
    failureAction,
    targetLocation,
    validationType,
    modifierExtension,
    validationProcess,
    validator,
    primarySource,
    attestation
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: VerificationResult): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[CodeableConcept]](need, t.need),
    FHIRComponentField[LitSeq[Reference]](target, t.target),
    FHIRComponentField[VERIFICATIONRESULT_STATUS](status, t.status),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Timing]](frequency, t.frequency),
    FHIRComponentField[Option[FHIRDateTime]](statusDate, t.statusDate),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[FHIRDateTime]](lastPerformed, t.lastPerformed),
    FHIRComponentField[Option[FHIRDate]](nextScheduled, t.nextScheduled),
    FHIRComponentField[Option[CodeableConcept]](failureAction, t.failureAction),
    FHIRComponentField[LitSeq[String]](targetLocation, t.targetLocation),
    FHIRComponentField[Option[CodeableConcept]](validationType, t.validationType),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[CodeableConcept]](validationProcess, t.validationProcess),
    FHIRComponentField[LitSeq[VerificationResult.Validator]](validator, t.validator),
    FHIRComponentField[LitSeq[VerificationResult.PrimarySource]](primarySource, t.primarySource),
    FHIRComponentField[Option[VerificationResult.Attestation]](attestation, t.attestation)
  )
  def extractId(t: VerificationResult): Option[String]                                      = t.id
  def extractMeta(t: VerificationResult): Option[Meta]                                      = t.meta
  def extractText(t: VerificationResult): Option[Narrative]                                 = t.text
  def extractNeed(t: VerificationResult): Option[CodeableConcept]                           = t.need
  def extractTarget(t: VerificationResult): LitSeq[Reference]                               = t.target
  def extractStatus(t: VerificationResult): VERIFICATIONRESULT_STATUS                       = t.status
  def extractLanguage(t: VerificationResult): Option[LANGUAGES]                             = t.language
  def extractContained(t: VerificationResult): LitSeq[Resource]                             = t.contained
  def extractExtension(t: VerificationResult): LitSeq[Extension]                            = t.extension
  def extractFrequency(t: VerificationResult): Option[Timing]                               = t.frequency
  def extractStatusDate(t: VerificationResult): Option[FHIRDateTime]                        = t.statusDate
  def extractImplicitRules(t: VerificationResult): Option[UriStr]                           = t.implicitRules
  def extractLastPerformed(t: VerificationResult): Option[FHIRDateTime]                     = t.lastPerformed
  def extractNextScheduled(t: VerificationResult): Option[FHIRDate]                         = t.nextScheduled
  def extractFailureAction(t: VerificationResult): Option[CodeableConcept]                  = t.failureAction
  def extractTargetLocation(t: VerificationResult): LitSeq[String]                          = t.targetLocation
  def extractValidationType(t: VerificationResult): Option[CodeableConcept]                 = t.validationType
  def extractModifierExtension(t: VerificationResult): LitSeq[Extension]                    = t.modifierExtension
  def extractValidationProcess(t: VerificationResult): LitSeq[CodeableConcept]              = t.validationProcess
  def extractValidator(t: VerificationResult): LitSeq[VerificationResult.Validator]         = t.validator
  def extractPrimarySource(t: VerificationResult): LitSeq[VerificationResult.PrimarySource] = t.primarySource
  def extractAttestation(t: VerificationResult): Option[VerificationResult.Attestation]     = t.attestation
  override val thisName: String                                                             = "VerificationResult"
  override val searchParams: Map[String, VerificationResult => Seq[Any]] = Map(
    "target" -> (obj => obj.target.toSeq)
  )
  def unapply(
      o: VerificationResult): Option[(Option[String], Option[Meta], Option[Narrative], Option[CodeableConcept], LitSeq[Reference], VERIFICATIONRESULT_STATUS, Option[LANGUAGES], LitSeq[Resource], LitSeq[Extension], Option[Timing], Option[FHIRDateTime], Option[UriStr], Option[FHIRDateTime], Option[FHIRDate], Option[CodeableConcept], LitSeq[String], Option[CodeableConcept], LitSeq[Extension], LitSeq[CodeableConcept], LitSeq[VerificationResult.Validator], LitSeq[VerificationResult.PrimarySource], Option[VerificationResult.Attestation])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.need,
        o.target,
        o.status,
        o.language,
        o.contained,
        o.extension,
        o.frequency,
        o.statusDate,
        o.implicitRules,
        o.lastPerformed,
        o.nextScheduled,
        o.failureAction,
        o.targetLocation,
        o.validationType,
        o.modifierExtension,
        o.validationProcess,
        o.validator,
        o.primarySource,
        o.attestation))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[VerificationResult] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new VerificationResult(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("need", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("target", Some(LitSeq.empty)),
          cursor.decodeAs[VERIFICATIONRESULT_STATUS]("status", None),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Timing]]("frequency", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("statusDate", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("lastPerformed", Some(None)),
          cursor.decodeAs[Option[FHIRDate]]("nextScheduled", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("failureAction", Some(None)),
          cursor.decodeAs[LitSeq[String]]("targetLocation", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("validationType", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("validationProcess", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[VerificationResult.Validator]]("validator", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[VerificationResult.PrimarySource]]("primarySource", Some(LitSeq.empty)),
          cursor.decodeAs[Option[VerificationResult.Attestation]]("attestation", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** Describes validation requirements, source(s), status and dates for one or more elements.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields need, target, status, frequency, statusDate, lastPerformed, nextScheduled, failureAction,
  *   targetLocation, validationType, validationProcess, validator, primarySource, attestation.
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
  * @param need
  *   \- The frequency with which the target must be validated (none; initial; periodic).
  * @param target
  *   \- A resource that was validated.
  * @param status
  *   \- The validation status of the target (attested; validated; in process; requires revalidation; validation failed;
  *   revalidation failed).
  * @param language
  *   \- The base language in which the resource is written.
  * @param contained
  *   \- These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   \- May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param frequency
  *   \- Frequency of revalidation.
  * @param statusDate
  *   \- When the validation status was updated.
  * @param implicitRules
  *   \- A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param lastPerformed
  *   \- The date/time validation was last completed (including failed validations).
  * @param nextScheduled
  *   \- The date when target is next validated, if appropriate.
  * @param failureAction
  *   \- The result if validation fails (fatal; warning; record only; none).
  * @param targetLocation
  *   \- The fhirpath location(s) within the resource that was validated.
  * @param validationType
  *   \- What the target is validated against (nothing; primary source; multiple sources).
  * @param modifierExtension
  *   \- May be used to represent additional information that is not part of the basic definition of the resource and that
  *   modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *   Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *   strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *   extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *   processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any
  *   elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param validationProcess
  *   \- The primary process by which the target is validated (edit check; value set; primary source; multiple sources;
  *   standalone; in context).
  * @param validator
  *   \- Information about the entity validating information.
  * @param primarySource
  *   \- Information about the primary source(s) involved in validation.
  * @param attestation
  *   \- Information about the entity attesting to information.
  */
@POJOBoilerplate
class VerificationResult(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val need: Option[CodeableConcept] = None,
    val target: LitSeq[Reference] = LitSeq.empty,
    val status: VERIFICATIONRESULT_STATUS,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val frequency: Option[Timing] = None,
    val statusDate: Option[FHIRDateTime] = None,
    override val implicitRules: Option[UriStr] = None,
    val lastPerformed: Option[FHIRDateTime] = None,
    val nextScheduled: Option[FHIRDate] = None,
    val failureAction: Option[CodeableConcept] = None,
    val targetLocation: LitSeq[String] = LitSeq.empty,
    val validationType: Option[CodeableConcept] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val validationProcess: LitSeq[CodeableConcept] = LitSeq.empty,
    val validator: LitSeq[VerificationResult.Validator] = LitSeq.empty,
    val primarySource: LitSeq[VerificationResult.PrimarySource] = LitSeq.empty,
    val attestation: Option[VerificationResult.Attestation] = None,
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
  override val thisTypeName: String = "VerificationResult"
}
