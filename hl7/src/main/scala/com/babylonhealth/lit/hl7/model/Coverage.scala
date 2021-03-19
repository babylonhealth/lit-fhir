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
import com.babylonhealth.lit.hl7.FM_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Coverage extends CompanionFor[Coverage] {
  override type ResourceType = Coverage
  override val baseType: CompanionFor[ResourceType] = Coverage
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Coverage")
  object CostToBeneficiary extends CompanionFor[CostToBeneficiary] {
    override type ResourceType = CostToBeneficiary
    object Exception extends CompanionFor[Exception] {
      override type ResourceType = Exception
      def apply(
          id: Option[String] = None,
          `type`: CodeableConcept,
          period: Option[Period] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Exception = new Exception(
        id,
        `type`,
        period,
        extension,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Exception): Option[(Option[String], CodeableConcept, Option[Period], LitSeq[Extension], LitSeq[Extension])] =
        Some((o.id, o.`type`, o.period, o.extension, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val `type`: FHIRComponentFieldMeta[CodeableConcept] =
        FHIRComponentFieldMeta("type", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
      val period: FHIRComponentFieldMeta[Option[Period]] =
        FHIRComponentFieldMeta("period", lTagOf[Option[Period]], false, lTagOf[Period])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, `type`, period, extension, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Exception): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[CodeableConcept](`type`, t.`type`),
        FHIRComponentField[Option[Period]](period, t.period),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Exception] = this
      val thisName: String                  = "Exception"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Exception] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Exception(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[CodeableConcept]("type", None),
              cursor.decodeAs[Option[Period]]("period", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Exception(
        override val id: Option[String] = None,
        val `type`: CodeableConcept,
        val period: Option[Period] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    type ValueChoice = Choice[Union_0221283134]
    def apply(
        id: Option[String] = None,
        `type`: Option[CodeableConcept] = None,
        value: CostToBeneficiary.ValueChoice,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        exception: LitSeq[CostToBeneficiary.Exception] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): CostToBeneficiary = new CostToBeneficiary(
      id,
      `type`,
      value,
      extension,
      modifierExtension,
      exception,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: CostToBeneficiary): Option[(Option[String], Option[CodeableConcept], CostToBeneficiary.ValueChoice, LitSeq[Extension], LitSeq[Extension], LitSeq[CostToBeneficiary.Exception])] =
      Some((o.id, o.`type`, o.value, o.extension, o.modifierExtension, o.exception))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val value: FHIRComponentFieldMeta[CostToBeneficiary.ValueChoice] =
      FHIRComponentFieldMeta("value", lTagOf[CostToBeneficiary.ValueChoice], true, lTagOf[Union_0221283134])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val exception: FHIRComponentFieldMeta[LitSeq[CostToBeneficiary.Exception]] =
      FHIRComponentFieldMeta(
        "exception",
        lTagOf[LitSeq[CostToBeneficiary.Exception]],
        false,
        lTagOf[CostToBeneficiary.Exception])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, `type`, value, extension, modifierExtension, exception)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: CostToBeneficiary): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[CostToBeneficiary.ValueChoice](value, t.value),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[CostToBeneficiary.Exception]](exception, t.exception)
    )
    val baseType: CompanionFor[CostToBeneficiary] = this
    val thisName: String                          = "CostToBeneficiary"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[CostToBeneficiary] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new CostToBeneficiary(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
            cursor.decodeRef[Union_0221283134]("value"),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[CostToBeneficiary.Exception]]("exception", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class CostToBeneficiary(
      override val id: Option[String] = None,
      val `type`: Option[CodeableConcept] = None,
      val value: CostToBeneficiary.ValueChoice,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val exception: LitSeq[CostToBeneficiary.Exception] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Class extends CompanionFor[Class] {
    override type ResourceType = Class
    def apply(
        id: Option[String] = None,
        `type`: CodeableConcept,
        name: Option[String] = None,
        value: String,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Class = new Class(
      id,
      `type`,
      name,
      value,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Class): Option[(Option[String], CodeableConcept, Option[String], String, LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.`type`, o.name, o.value, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("type", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val name: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("name", lTagOf[Option[String]], false, lTagOf[String])
    val value: FHIRComponentFieldMeta[String] =
      FHIRComponentFieldMeta("value", lTagOf[String], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, `type`, name, value, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Class): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[CodeableConcept](`type`, t.`type`),
      FHIRComponentField[Option[String]](name, t.name),
      FHIRComponentField[String](value, t.value),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Class] = this
    val thisName: String              = "Class"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Class] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Class(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[CodeableConcept]("type", None),
            cursor.decodeAs[Option[String]]("name", Some(None)),
            cursor.decodeAs[String]("value", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Class(
      override val id: Option[String] = None,
      val `type`: CodeableConcept,
      val name: Option[String] = None,
      val value: String,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      `type`: Option[CodeableConcept] = None,
      payor: NonEmptyLitSeq[Reference],
      order: Option[PositiveInt] = None,
      status: FM_STATUS,
      period: Option[Period] = None,
      network: Option[String] = None,
      language: Option[LANGUAGES] = None,
      contract: LitSeq[Reference] = LitSeq.empty,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      dependent: Option[String] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      subscriber: Option[Reference] = None,
      beneficiary: Reference,
      subrogation: Option[Boolean] = None,
      policyHolder: Option[Reference] = None,
      subscriberId: Option[String] = None,
      relationship: Option[CodeableConcept] = None,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      `class`: LitSeq[Coverage.Class] = LitSeq.empty,
      costToBeneficiary: LitSeq[Coverage.CostToBeneficiary] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Coverage = new Coverage(
    id,
    meta,
    text,
    `type`,
    payor,
    order,
    status,
    period,
    network,
    language,
    contract,
    contained,
    extension,
    dependent,
    identifier,
    subscriber,
    beneficiary,
    subrogation,
    policyHolder,
    subscriberId,
    relationship,
    implicitRules,
    modifierExtension,
    `class`,
    costToBeneficiary,
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
  val payor: FHIRComponentFieldMeta[NonEmptyLitSeq[Reference]] =
    FHIRComponentFieldMeta("payor", lTagOf[NonEmptyLitSeq[Reference]], false, lTagOf[Reference])
  val order: FHIRComponentFieldMeta[Option[PositiveInt]] =
    FHIRComponentFieldMeta("order", lTagOf[Option[PositiveInt]], false, lTagOf[PositiveInt])
  val status: FHIRComponentFieldMeta[FM_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[FM_STATUS], false, lTagOf[FM_STATUS])
  val period: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("period", lTagOf[Option[Period]], false, lTagOf[Period])
  val network: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("network", lTagOf[Option[String]], false, lTagOf[String])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contract: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("contract", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val dependent: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("dependent", lTagOf[Option[String]], false, lTagOf[String])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val subscriber: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("subscriber", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val beneficiary: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("beneficiary", lTagOf[Reference], false, lTagOf[Reference])
  val subrogation: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("subrogation", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val policyHolder: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("policyHolder", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val subscriberId: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("subscriberId", lTagOf[Option[String]], false, lTagOf[String])
  val relationship: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("relationship", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val `class`: FHIRComponentFieldMeta[LitSeq[Coverage.Class]] =
    FHIRComponentFieldMeta("class", lTagOf[LitSeq[Coverage.Class]], false, lTagOf[Coverage.Class])
  val costToBeneficiary: FHIRComponentFieldMeta[LitSeq[Coverage.CostToBeneficiary]] =
    FHIRComponentFieldMeta(
      "costToBeneficiary",
      lTagOf[LitSeq[Coverage.CostToBeneficiary]],
      false,
      lTagOf[Coverage.CostToBeneficiary])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    `type`,
    payor,
    order,
    status,
    period,
    network,
    language,
    contract,
    contained,
    extension,
    dependent,
    identifier,
    subscriber,
    beneficiary,
    subrogation,
    policyHolder,
    subscriberId,
    relationship,
    implicitRules,
    modifierExtension,
    `class`,
    costToBeneficiary
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Coverage): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
    FHIRComponentField[NonEmptyLitSeq[Reference]](payor, t.payor),
    FHIRComponentField[Option[PositiveInt]](order, t.order),
    FHIRComponentField[FM_STATUS](status, t.status),
    FHIRComponentField[Option[Period]](period, t.period),
    FHIRComponentField[Option[String]](network, t.network),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Reference]](contract, t.contract),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[String]](dependent, t.dependent),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[Reference]](subscriber, t.subscriber),
    FHIRComponentField[Reference](beneficiary, t.beneficiary),
    FHIRComponentField[Option[Boolean]](subrogation, t.subrogation),
    FHIRComponentField[Option[Reference]](policyHolder, t.policyHolder),
    FHIRComponentField[Option[String]](subscriberId, t.subscriberId),
    FHIRComponentField[Option[CodeableConcept]](relationship, t.relationship),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[Coverage.Class]](`class`, t.`class`),
    FHIRComponentField[LitSeq[Coverage.CostToBeneficiary]](costToBeneficiary, t.costToBeneficiary)
  )
  def extractId(t: Coverage): Option[String]                                    = t.id
  def extractMeta(t: Coverage): Option[Meta]                                    = t.meta
  def extractText(t: Coverage): Option[Narrative]                               = t.text
  def extractType(t: Coverage): Option[CodeableConcept]                         = t.`type`
  def extractPayor(t: Coverage): NonEmptyLitSeq[Reference]                      = t.payor
  def extractOrder(t: Coverage): Option[PositiveInt]                            = t.order
  def extractStatus(t: Coverage): FM_STATUS                                     = t.status
  def extractPeriod(t: Coverage): Option[Period]                                = t.period
  def extractNetwork(t: Coverage): Option[String]                               = t.network
  def extractLanguage(t: Coverage): Option[LANGUAGES]                           = t.language
  def extractContract(t: Coverage): LitSeq[Reference]                           = t.contract
  def extractContained(t: Coverage): LitSeq[Resource]                           = t.contained
  def extractExtension(t: Coverage): LitSeq[Extension]                          = t.extension
  def extractDependent(t: Coverage): Option[String]                             = t.dependent
  def extractIdentifier(t: Coverage): LitSeq[Identifier]                        = t.identifier
  def extractSubscriber(t: Coverage): Option[Reference]                         = t.subscriber
  def extractBeneficiary(t: Coverage): Reference                                = t.beneficiary
  def extractSubrogation(t: Coverage): Option[Boolean]                          = t.subrogation
  def extractPolicyHolder(t: Coverage): Option[Reference]                       = t.policyHolder
  def extractSubscriberId(t: Coverage): Option[String]                          = t.subscriberId
  def extractRelationship(t: Coverage): Option[CodeableConcept]                 = t.relationship
  def extractImplicitRules(t: Coverage): Option[UriStr]                         = t.implicitRules
  def extractModifierExtension(t: Coverage): LitSeq[Extension]                  = t.modifierExtension
  def extractClass(t: Coverage): LitSeq[Coverage.Class]                         = t.`class`
  def extractCostToBeneficiary(t: Coverage): LitSeq[Coverage.CostToBeneficiary] = t.costToBeneficiary
  override val thisName: String                                                 = "Coverage"
  override val searchParams: Map[String, Coverage => Seq[Any]] = Map(
    "payor"         -> (obj => obj.payor.toSeq),
    "identifier"    -> (obj => obj.identifier.toSeq),
    "subscriber"    -> (obj => obj.subscriber.toSeq),
    "class-value"   -> (obj => obj.`class`.map(_.value).toSeq),
    "policy-holder" -> (obj => obj.policyHolder.toSeq),
    "status"        -> (obj => Seq(obj.status)),
    "type"          -> (obj => obj.`type`.toSeq),
    "patient"       -> (obj => Seq(obj.beneficiary)),
    "class-type"    -> (obj => obj.`class`.map(_.`type`).toSeq),
    "dependent"     -> (obj => obj.dependent.toSeq),
    "beneficiary"   -> (obj => Seq(obj.beneficiary))
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Coverage] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Coverage(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
          cursor.decodeAs[NonEmptyLitSeq[Reference]]("payor", None),
          cursor.decodeAs[Option[PositiveInt]]("order", Some(None)),
          cursor.decodeAs[FM_STATUS]("status", None),
          cursor.decodeAs[Option[Period]]("period", Some(None)),
          cursor.decodeAs[Option[String]]("network", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("contract", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("dependent", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("subscriber", Some(None)),
          cursor.decodeAs[Reference]("beneficiary", None),
          cursor.decodeAs[Option[Boolean]]("subrogation", Some(None)),
          cursor.decodeAs[Option[Reference]]("policyHolder", Some(None)),
          cursor.decodeAs[Option[String]]("subscriberId", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("relationship", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Coverage.Class]]("class", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Coverage.CostToBeneficiary]]("costToBeneficiary", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Financial instrument which may be used to reimburse or pay for health care products and services. Includes both insurance and self-payment.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields `type`, payor, order, status, period, network, contract, dependent, identifier, subscriber, beneficiary, subrogation, policyHolder, subscriberId, relationship, `class`, costToBeneficiary.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param `type` - The type of coverage: social program, medical plan, accident coverage (workers compensation, auto), group health or payment by an individual or organization.
  * @param payor - The program or plan underwriter or payor including both insurance and non-insurance agreements, such as patient-pay agreements.
  * @param order - The order of applicability of this coverage relative to other coverages which are currently in force. Note, there may be gaps in the numbering and this does not imply primary, secondary etc. as the specific positioning of coverages depends upon the episode of care.
  * @param status - The status of the resource instance.
  * @param period - Time period during which the coverage is in force. A missing start date indicates the start date isn't known, a missing end date means the coverage is continuing to be in force.
  * @param network - The insurer-specific identifier for the insurer-defined network of providers to which the beneficiary may seek treatment which will be covered at the 'in-network' rate, otherwise 'out of network' terms and conditions apply.
  * @param language - The base language in which the resource is written.
  * @param contract - The policy(s) which constitute this insurance coverage.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param dependent - A unique identifier for a dependent under the coverage.
  * @param identifier - A unique identifier assigned to this coverage.
  * @param subscriber - The party who has signed-up for or 'owns' the contractual relationship to the policy or to whom the benefit of the policy for services rendered to them or their family is due.
  * @param beneficiary - The party who benefits from the insurance coverage; the patient when products and/or services are provided.
  * @param subrogation - When 'subrogation=true' this insurance instance has been included not for adjudication but to provide insurers with the details to recover costs.
  * @param policyHolder - The party who 'owns' the insurance policy.
  * @param subscriberId - The insurer assigned ID for the Subscriber.
  * @param relationship - The relationship of beneficiary (patient) to the subscriber.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param `class` - A suite of underwriter specific classifiers.
  * @param costToBeneficiary - A suite of codes indicating the cost category and associated amount which have been detailed in the policy and may have been  included on the health card.
  */
@POJOBoilerplate
class Coverage(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val `type`: Option[CodeableConcept] = None,
    val payor: NonEmptyLitSeq[Reference],
    val order: Option[PositiveInt] = None,
    val status: FM_STATUS,
    val period: Option[Period] = None,
    val network: Option[String] = None,
    override val language: Option[LANGUAGES] = None,
    val contract: LitSeq[Reference] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val dependent: Option[String] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val subscriber: Option[Reference] = None,
    val beneficiary: Reference,
    val subrogation: Option[Boolean] = None,
    val policyHolder: Option[Reference] = None,
    val subscriberId: Option[String] = None,
    val relationship: Option[CodeableConcept] = None,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val `class`: LitSeq[Coverage.Class] = LitSeq.empty,
    val costToBeneficiary: LitSeq[Coverage.CostToBeneficiary] = LitSeq.empty,
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
  override val thisTypeName: String = "Coverage"
}
