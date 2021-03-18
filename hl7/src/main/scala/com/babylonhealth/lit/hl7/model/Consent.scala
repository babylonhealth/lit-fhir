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
import com.babylonhealth.lit.hl7.{ CONSENT_PROVISION_TYPE, CONSENT_STATE_CODES, CONSENT_DATA_MEANING }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Consent extends CompanionFor[Consent] {
  override val baseType: CompanionFor[Consent] = Consent
  override val profileUrl: Option[String]      = Some("http://hl7.org/fhir/StructureDefinition/Consent")
  object Provision extends CompanionFor[Provision] {
    object Data extends CompanionFor[Data] {
      def apply(
          id: Option[String] = None,
          meaning: CONSENT_DATA_MEANING,
          extension: LitSeq[Extension] = LitSeq.empty,
          reference: Reference,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Data = new Data(
        id,
        meaning,
        extension,
        reference,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Data): Option[(Option[String], CONSENT_DATA_MEANING, LitSeq[Extension], Reference, LitSeq[Extension])] =
        Some((o.id, o.meaning, o.extension, o.reference, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val meaning: FHIRComponentFieldMeta[CONSENT_DATA_MEANING] =
        FHIRComponentFieldMeta("meaning", lTagOf[CONSENT_DATA_MEANING], false, lTagOf[CONSENT_DATA_MEANING])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val reference: FHIRComponentFieldMeta[Reference] =
        FHIRComponentFieldMeta("reference", lTagOf[Reference], false, lTagOf[Reference])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, meaning, extension, reference, modifierExtension)
      override def fields(t: Data): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[CONSENT_DATA_MEANING](meaning, t.meaning),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Reference](reference, t.reference),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Data] = this
      val thisName: String             = "Data"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Data] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Data(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[CONSENT_DATA_MEANING]("meaning", None),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Reference]("reference", None),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Data(
        override val id: Option[String] = None,
        val meaning: CONSENT_DATA_MEANING,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val reference: Reference,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object Actor extends CompanionFor[Actor] {
      def apply(
          id: Option[String] = None,
          role: CodeableConcept,
          extension: LitSeq[Extension] = LitSeq.empty,
          reference: Reference,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Actor = new Actor(
        id,
        role,
        extension,
        reference,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Actor): Option[(Option[String], CodeableConcept, LitSeq[Extension], Reference, LitSeq[Extension])] = Some(
        (o.id, o.role, o.extension, o.reference, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val role: FHIRComponentFieldMeta[CodeableConcept] =
        FHIRComponentFieldMeta("role", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val reference: FHIRComponentFieldMeta[Reference] =
        FHIRComponentFieldMeta("reference", lTagOf[Reference], false, lTagOf[Reference])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, role, extension, reference, modifierExtension)
      override def fields(t: Actor): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[CodeableConcept](role, t.role),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Reference](reference, t.reference),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Actor] = this
      val thisName: String              = "Actor"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Actor] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Actor(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[CodeableConcept]("role", None),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Reference]("reference", None),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Actor(
        override val id: Option[String] = None,
        val role: CodeableConcept,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val reference: Reference,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        `type`: Option[CONSENT_PROVISION_TYPE] = None,
        code: LitSeq[CodeableConcept] = LitSeq.empty,
        `class`: LitSeq[Coding] = LitSeq.empty,
        period: Option[Period] = None,
        action: LitSeq[CodeableConcept] = LitSeq.empty,
        purpose: LitSeq[Coding] = LitSeq.empty,
        extension: LitSeq[Extension] = LitSeq.empty,
        provision: LitSeq[Consent.Provision] = LitSeq.empty,
        dataPeriod: Option[Period] = None,
        securityLabel: LitSeq[Coding] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        data: LitSeq[Provision.Data] = LitSeq.empty,
        actor: LitSeq[Provision.Actor] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Provision = new Provision(
      id,
      `type`,
      code,
      `class`,
      period,
      action,
      purpose,
      extension,
      provision,
      dataPeriod,
      securityLabel,
      modifierExtension,
      data,
      actor,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Provision): Option[(Option[String], Option[CONSENT_PROVISION_TYPE], LitSeq[CodeableConcept], LitSeq[Coding], Option[Period], LitSeq[CodeableConcept], LitSeq[Coding], LitSeq[Extension], LitSeq[Consent.Provision], Option[Period], LitSeq[Coding], LitSeq[Extension], LitSeq[Provision.Data], LitSeq[Provision.Actor])] =
      Some(
        (
          o.id,
          o.`type`,
          o.code,
          o.`class`,
          o.period,
          o.action,
          o.purpose,
          o.extension,
          o.provision,
          o.dataPeriod,
          o.securityLabel,
          o.modifierExtension,
          o.data,
          o.actor))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[Option[CONSENT_PROVISION_TYPE]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[CONSENT_PROVISION_TYPE]], false, lTagOf[CONSENT_PROVISION_TYPE])
    val code: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("code", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val `class`: FHIRComponentFieldMeta[LitSeq[Coding]] =
      FHIRComponentFieldMeta("class", lTagOf[LitSeq[Coding]], false, lTagOf[Coding])
    val period: FHIRComponentFieldMeta[Option[Period]] =
      FHIRComponentFieldMeta("period", lTagOf[Option[Period]], false, lTagOf[Period])
    val action: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("action", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val purpose: FHIRComponentFieldMeta[LitSeq[Coding]] =
      FHIRComponentFieldMeta("purpose", lTagOf[LitSeq[Coding]], false, lTagOf[Coding])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val provision: FHIRComponentFieldMeta[LitSeq[Consent.Provision]] =
      FHIRComponentFieldMeta("provision", lTagOf[LitSeq[Consent.Provision]], false, lTagOf[Consent.Provision])
    val dataPeriod: FHIRComponentFieldMeta[Option[Period]] =
      FHIRComponentFieldMeta("dataPeriod", lTagOf[Option[Period]], false, lTagOf[Period])
    val securityLabel: FHIRComponentFieldMeta[LitSeq[Coding]] =
      FHIRComponentFieldMeta("securityLabel", lTagOf[LitSeq[Coding]], false, lTagOf[Coding])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val data: FHIRComponentFieldMeta[LitSeq[Provision.Data]] =
      FHIRComponentFieldMeta("data", lTagOf[LitSeq[Provision.Data]], false, lTagOf[Provision.Data])
    val actor: FHIRComponentFieldMeta[LitSeq[Provision.Actor]] =
      FHIRComponentFieldMeta("actor", lTagOf[LitSeq[Provision.Actor]], false, lTagOf[Provision.Actor])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
      id,
      `type`,
      code,
      `class`,
      period,
      action,
      purpose,
      extension,
      provision,
      dataPeriod,
      securityLabel,
      modifierExtension,
      data,
      actor)
    override def fields(t: Provision): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CONSENT_PROVISION_TYPE]](`type`, t.`type`),
      FHIRComponentField[LitSeq[CodeableConcept]](code, t.code),
      FHIRComponentField[LitSeq[Coding]](`class`, t.`class`),
      FHIRComponentField[Option[Period]](period, t.period),
      FHIRComponentField[LitSeq[CodeableConcept]](action, t.action),
      FHIRComponentField[LitSeq[Coding]](purpose, t.purpose),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Consent.Provision]](provision, t.provision),
      FHIRComponentField[Option[Period]](dataPeriod, t.dataPeriod),
      FHIRComponentField[LitSeq[Coding]](securityLabel, t.securityLabel),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[Provision.Data]](data, t.data),
      FHIRComponentField[LitSeq[Provision.Actor]](actor, t.actor)
    )
    val baseType: CompanionFor[Provision] = this
    val thisName: String                  = "Provision"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Provision] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Provision(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CONSENT_PROVISION_TYPE]]("type", Some(None)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("code", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Coding]]("class", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Period]]("period", Some(None)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("action", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Coding]]("purpose", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Consent.Provision]]("provision", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Period]]("dataPeriod", Some(None)),
            cursor.decodeAs[LitSeq[Coding]]("securityLabel", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Provision.Data]]("data", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Provision.Actor]]("actor", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Provision(
      override val id: Option[String] = None,
      val `type`: Option[CONSENT_PROVISION_TYPE] = None,
      val code: LitSeq[CodeableConcept] = LitSeq.empty,
      val `class`: LitSeq[Coding] = LitSeq.empty,
      val period: Option[Period] = None,
      val action: LitSeq[CodeableConcept] = LitSeq.empty,
      val purpose: LitSeq[Coding] = LitSeq.empty,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val provision: LitSeq[Consent.Provision] = LitSeq.empty,
      val dataPeriod: Option[Period] = None,
      val securityLabel: LitSeq[Coding] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val data: LitSeq[Provision.Data] = LitSeq.empty,
      val actor: LitSeq[Provision.Actor] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Verification extends CompanionFor[Verification] {
    def apply(
        id: Option[String] = None,
        verified: Boolean,
        extension: LitSeq[Extension] = LitSeq.empty,
        verifiedWith: Option[Reference] = None,
        verificationDate: Option[FHIRDateTime] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Verification = new Verification(
      id,
      verified,
      extension,
      verifiedWith,
      verificationDate,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Verification): Option[(Option[String], Boolean, LitSeq[Extension], Option[Reference], Option[FHIRDateTime], LitSeq[Extension])] =
      Some((o.id, o.verified, o.extension, o.verifiedWith, o.verificationDate, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val verified: FHIRComponentFieldMeta[Boolean] =
      FHIRComponentFieldMeta("verified", lTagOf[Boolean], false, lTagOf[Boolean])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val verifiedWith: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("verifiedWith", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val verificationDate: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
      FHIRComponentFieldMeta("verificationDate", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, verified, extension, verifiedWith, verificationDate, modifierExtension)
    override def fields(t: Verification): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Boolean](verified, t.verified),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Reference]](verifiedWith, t.verifiedWith),
      FHIRComponentField[Option[FHIRDateTime]](verificationDate, t.verificationDate),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Verification] = this
    val thisName: String                     = "Verification"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Verification] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Verification(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Boolean]("verified", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Reference]]("verifiedWith", Some(None)),
            cursor.decodeAs[Option[FHIRDateTime]]("verificationDate", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Verification(
      override val id: Option[String] = None,
      val verified: Boolean,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val verifiedWith: Option[Reference] = None,
      val verificationDate: Option[FHIRDateTime] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Policy extends CompanionFor[Policy] {
    def apply(
        id: Option[String] = None,
        uri: Option[UriStr] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        authority: Option[UriStr] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Policy = new Policy(
      id,
      uri,
      extension,
      authority,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Policy): Option[(Option[String], Option[UriStr], LitSeq[Extension], Option[UriStr], LitSeq[Extension])] =
      Some((o.id, o.uri, o.extension, o.authority, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val uri: FHIRComponentFieldMeta[Option[UriStr]] =
      FHIRComponentFieldMeta("uri", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val authority: FHIRComponentFieldMeta[Option[UriStr]] =
      FHIRComponentFieldMeta("authority", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, uri, extension, authority, modifierExtension)
    override def fields(t: Policy): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[UriStr]](uri, t.uri),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[UriStr]](authority, t.authority),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Policy] = this
    val thisName: String               = "Policy"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Policy] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Policy(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[UriStr]]("uri", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[UriStr]]("authority", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Policy(
      override val id: Option[String] = None,
      val uri: Option[UriStr] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val authority: Option[UriStr] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  type SourceChoice = Choice[Union_0340660840]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      scope: CodeableConcept,
      status: CONSENT_STATE_CODES,
      patient: Option[Reference] = None,
      language: Option[LANGUAGES] = None,
      category: NonEmptyLitSeq[CodeableConcept],
      dateTime: Option[FHIRDateTime] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      performer: LitSeq[Reference] = LitSeq.empty,
      source: Option[Consent.SourceChoice] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      policyRule: Option[CodeableConcept] = None,
      organization: LitSeq[Reference] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      policy: LitSeq[Consent.Policy] = LitSeq.empty,
      verification: LitSeq[Consent.Verification] = LitSeq.empty,
      provision: Option[Consent.Provision] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Consent = new Consent(
    id,
    meta,
    text,
    scope,
    status,
    patient,
    language,
    category,
    dateTime,
    contained,
    extension,
    performer,
    source,
    identifier,
    policyRule,
    organization,
    implicitRules,
    modifierExtension,
    policy,
    verification,
    provision,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val scope: FHIRComponentFieldMeta[CodeableConcept] =
    FHIRComponentFieldMeta("scope", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
  val status: FHIRComponentFieldMeta[CONSENT_STATE_CODES] =
    FHIRComponentFieldMeta("status", lTagOf[CONSENT_STATE_CODES], false, lTagOf[CONSENT_STATE_CODES])
  val patient: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("patient", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val category: FHIRComponentFieldMeta[NonEmptyLitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("category", lTagOf[NonEmptyLitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val dateTime: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("dateTime", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val performer: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("performer", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val source: FHIRComponentFieldMeta[Option[Consent.SourceChoice]] =
    FHIRComponentFieldMeta("source", lTagOf[Option[Consent.SourceChoice]], true, lTagOf[Union_0340660840])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val policyRule: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("policyRule", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val organization: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("organization", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val policy: FHIRComponentFieldMeta[LitSeq[Consent.Policy]] =
    FHIRComponentFieldMeta("policy", lTagOf[LitSeq[Consent.Policy]], false, lTagOf[Consent.Policy])
  val verification: FHIRComponentFieldMeta[LitSeq[Consent.Verification]] =
    FHIRComponentFieldMeta("verification", lTagOf[LitSeq[Consent.Verification]], false, lTagOf[Consent.Verification])
  val provision: FHIRComponentFieldMeta[Option[Consent.Provision]] =
    FHIRComponentFieldMeta("provision", lTagOf[Option[Consent.Provision]], false, lTagOf[Consent.Provision])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    scope,
    status,
    patient,
    language,
    category,
    dateTime,
    contained,
    extension,
    performer,
    source,
    identifier,
    policyRule,
    organization,
    implicitRules,
    modifierExtension,
    policy,
    verification,
    provision
  )
  override def fields(t: Consent): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[CodeableConcept](scope, t.scope),
    FHIRComponentField[CONSENT_STATE_CODES](status, t.status),
    FHIRComponentField[Option[Reference]](patient, t.patient),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[NonEmptyLitSeq[CodeableConcept]](category, t.category),
    FHIRComponentField[Option[FHIRDateTime]](dateTime, t.dateTime),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[Reference]](performer, t.performer),
    FHIRComponentField[Option[Consent.SourceChoice]](source, t.source),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[CodeableConcept]](policyRule, t.policyRule),
    FHIRComponentField[LitSeq[Reference]](organization, t.organization),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[Consent.Policy]](policy, t.policy),
    FHIRComponentField[LitSeq[Consent.Verification]](verification, t.verification),
    FHIRComponentField[Option[Consent.Provision]](provision, t.provision)
  )
  def extractId(t: Consent): Option[String]                         = t.id
  def extractMeta(t: Consent): Option[Meta]                         = t.meta
  def extractText(t: Consent): Option[Narrative]                    = t.text
  def extractScope(t: Consent): CodeableConcept                     = t.scope
  def extractStatus(t: Consent): CONSENT_STATE_CODES                = t.status
  def extractPatient(t: Consent): Option[Reference]                 = t.patient
  def extractLanguage(t: Consent): Option[LANGUAGES]                = t.language
  def extractCategory(t: Consent): NonEmptyLitSeq[CodeableConcept]  = t.category
  def extractDateTime(t: Consent): Option[FHIRDateTime]             = t.dateTime
  def extractContained(t: Consent): LitSeq[Resource]                = t.contained
  def extractExtension(t: Consent): LitSeq[Extension]               = t.extension
  def extractPerformer(t: Consent): LitSeq[Reference]               = t.performer
  def extractSource(t: Consent): Option[Consent.SourceChoice]       = t.source
  def extractIdentifier(t: Consent): LitSeq[Identifier]             = t.identifier
  def extractPolicyRule(t: Consent): Option[CodeableConcept]        = t.policyRule
  def extractOrganization(t: Consent): LitSeq[Reference]            = t.organization
  def extractImplicitRules(t: Consent): Option[UriStr]              = t.implicitRules
  def extractModifierExtension(t: Consent): LitSeq[Extension]       = t.modifierExtension
  def extractPolicy(t: Consent): LitSeq[Consent.Policy]             = t.policy
  def extractVerification(t: Consent): LitSeq[Consent.Verification] = t.verification
  def extractProvision(t: Consent): Option[Consent.Provision]       = t.provision
  override val thisName: String                                     = "Consent"
  override val searchParams: Map[String, Consent => Seq[Any]] = Map(
    "identifier"       -> (obj => obj.identifier.toSeq),
    "scope"            -> (obj => Seq(obj.scope)),
    "data"             -> (obj => obj.provision.toSeq.flatMap(_.data).map(_.reference).toSeq),
    "date"             -> (obj => obj.dateTime.toSeq),
    "status"           -> (obj => Seq(obj.status)),
    "consentor"        -> (obj => obj.performer.toSeq),
    "category"         -> (obj => obj.category.toSeq),
    "security-label"   -> (obj => obj.provision.toSeq.flatMap(_.securityLabel).toSeq),
    "action"           -> (obj => obj.provision.toSeq.flatMap(_.action).toSeq),
    "period"           -> (obj => obj.provision.flatMap(_.period).toSeq),
    "patient"          -> (obj => obj.patient.toSeq),
    "actor"            -> (obj => obj.provision.toSeq.flatMap(_.actor).map(_.reference).toSeq),
    "organization"     -> (obj => obj.organization.toSeq),
    "source-reference" -> (obj => obj.source.toSeq),
    "purpose"          -> (obj => obj.provision.toSeq.flatMap(_.purpose).toSeq)
  )
  def unapply(
      o: Consent): Option[(Option[String], Option[Meta], Option[Narrative], CodeableConcept, CONSENT_STATE_CODES, Option[Reference], Option[LANGUAGES], NonEmptyLitSeq[CodeableConcept], Option[FHIRDateTime], LitSeq[Resource], LitSeq[Extension], LitSeq[Reference], Option[Consent.SourceChoice], LitSeq[Identifier], Option[CodeableConcept], LitSeq[Reference], Option[UriStr], LitSeq[Extension], LitSeq[Consent.Policy], LitSeq[Consent.Verification], Option[Consent.Provision])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.scope,
        o.status,
        o.patient,
        o.language,
        o.category,
        o.dateTime,
        o.contained,
        o.extension,
        o.performer,
        o.source,
        o.identifier,
        o.policyRule,
        o.organization,
        o.implicitRules,
        o.modifierExtension,
        o.policy,
        o.verification,
        o.provision))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Consent] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Consent(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[CodeableConcept]("scope", None),
          cursor.decodeAs[CONSENT_STATE_CODES]("status", None),
          cursor.decodeAs[Option[Reference]]("patient", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[NonEmptyLitSeq[CodeableConcept]]("category", None),
          cursor.decodeAs[Option[FHIRDateTime]]("dateTime", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("performer", Some(LitSeq.empty)),
          cursor.decodeOptRef[Union_0340660840]("source"),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("policyRule", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("organization", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Consent.Policy]]("policy", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Consent.Verification]]("verification", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Consent.Provision]]("provision", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** A record of a healthcare consumer’s  choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields scope, status, patient, category, dateTime, performer, source, identifier, policyRule, organization, policy, verification, provision.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param scope - A selector of the type of consent being presented: ADR, Privacy, Treatment, Research.  This list is now extensible.
  * @param status - Indicates the current state of this consent.
  * @param patient - The patient/healthcare consumer to whom this consent applies.
  * @param language - The base language in which the resource is written.
  * @param category - A classification of the type of consents found in the statement. This element supports indexing and retrieval of consent statements.
  * @param dateTime - When this  Consent was issued / created / indexed.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param performer - Either the Grantor, which is the entity responsible for granting the rights listed in a Consent Directive or the Grantee, which is the entity responsible for complying with the Consent Directive, including any obligations or limitations on authorizations and enforcement of prohibitions.
  * @param source - The source on which this consent statement is based. The source might be a scanned original paper form, or a reference to a consent that links back to such a source, a reference to a document repository (e.g. XDS) that stores the original consent document.
  * @param identifier - Unique identifier for this copy of the Consent Statement.
  * @param policyRule - A reference to the specific base computable regulation or policy.
  * @param organization - The organization that manages the consent, and the framework within which it is executed.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param policy - The references to the policies that are included in this consent scope. Policies may be organizational, but are often defined jurisdictionally, or in law.
  * @param verification - Whether a treatment instruction (e.g. artificial respiration yes or no) was verified with the patient, his/her family or another authorized person.
  * @param provision - An exception to the base policy of this consent. An exception can be an addition or removal of access permissions.
  */
@POJOBoilerplate
class Consent(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val scope: CodeableConcept,
    val status: CONSENT_STATE_CODES,
    val patient: Option[Reference] = None,
    override val language: Option[LANGUAGES] = None,
    val category: NonEmptyLitSeq[CodeableConcept],
    val dateTime: Option[FHIRDateTime] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val performer: LitSeq[Reference] = LitSeq.empty,
    val source: Option[Consent.SourceChoice] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val policyRule: Option[CodeableConcept] = None,
    val organization: LitSeq[Reference] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val policy: LitSeq[Consent.Policy] = LitSeq.empty,
    val verification: LitSeq[Consent.Verification] = LitSeq.empty,
    val provision: Option[Consent.Provision] = None,
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
  override val thisTypeName: String = "Consent"
}
