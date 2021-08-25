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
import com.babylonhealth.lit.hl7.OBSERVATION_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Observation extends CompanionFor[Observation] {
  implicit def summonObjectAndCompanionObservation_1026540265(o: Observation): ObjectAndCompanion[Observation, Observation.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Observation
  override type ParentType   = Observation
  override val baseType: CompanionFor[ResourceType] = Observation
  override val parentType: CompanionFor[ParentType] = Observation
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Observation")
  object ReferenceRange extends CompanionFor[ReferenceRange] {
    implicit def summonObjectAndCompanionReferenceRange_714538984(
        o: ReferenceRange): ObjectAndCompanion[ReferenceRange, ReferenceRange.type] = ObjectAndCompanion(o, this)
    override type ResourceType = ReferenceRange
    override type ParentType   = ReferenceRange
    override val parentType: CompanionFor[ResourceType] = ReferenceRange
    def apply(
        id: Option[String] = None,
        low: Option[Quantity] = None,
        age: Option[Range] = None,
        high: Option[Quantity] = None,
        `type`: Option[CodeableConcept] = None,
        text: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        appliesTo: LitSeq[CodeableConcept] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): ReferenceRange = new ReferenceRange(
      id,
      low,
      age,
      high,
      `type`,
      text,
      extension,
      appliesTo,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: ReferenceRange): Option[(Option[String], Option[Quantity], Option[Range], Option[Quantity], Option[CodeableConcept], Option[String], LitSeq[Extension], LitSeq[CodeableConcept], LitSeq[Extension])] =
      Some((o.id, o.low, o.age, o.high, o.`type`, o.text, o.extension, o.appliesTo, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val low: FHIRComponentFieldMeta[Option[Quantity]] =
      FHIRComponentFieldMeta("low", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
    val age: FHIRComponentFieldMeta[Option[Range]] =
      FHIRComponentFieldMeta("age", lTagOf[Option[Range]], false, lTagOf[Range])
    val high: FHIRComponentFieldMeta[Option[Quantity]] =
      FHIRComponentFieldMeta("high", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
    val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val text: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("text", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val appliesTo: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("appliesTo", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, low, age, high, `type`, text, extension, appliesTo, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: ReferenceRange): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Quantity]](low, t.low),
      FHIRComponentField[Option[Range]](age, t.age),
      FHIRComponentField[Option[Quantity]](high, t.high),
      FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[Option[String]](text, t.text),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[CodeableConcept]](appliesTo, t.appliesTo),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[ReferenceRange] = this
    val thisName: String                       = "ReferenceRange"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ReferenceRange] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new ReferenceRange(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[Quantity]]("low", Some(None)),
            cursor.decodeAs[Option[Range]]("age", Some(None)),
            cursor.decodeAs[Option[Quantity]]("high", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
            cursor.decodeAs[Option[String]]("text", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("appliesTo", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class ReferenceRange(
      override val id: Option[String] = None,
      val low: Option[Quantity] = None,
      val age: Option[Range] = None,
      val high: Option[Quantity] = None,
      val `type`: Option[CodeableConcept] = None,
      val text: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val appliesTo: LitSeq[CodeableConcept] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Component extends CompanionFor[Component] {
    implicit def summonObjectAndCompanionComponent_714538984(o: Component): ObjectAndCompanion[Component, Component.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Component
    override type ParentType   = Component
    override val parentType: CompanionFor[ResourceType] = Component
    type ValueChoice = Choice[Union01718482969]
    def apply(
        id: Option[String] = None,
        code: CodeableConcept,
        value: Option[Component.ValueChoice] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        interpretation: LitSeq[CodeableConcept] = LitSeq.empty,
        referenceRange: LitSeq[Observation.ReferenceRange] = LitSeq.empty,
        dataAbsentReason: Option[CodeableConcept] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Component = new Component(
      id,
      code,
      value,
      extension,
      interpretation,
      referenceRange,
      dataAbsentReason,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Component): Option[(Option[String], CodeableConcept, Option[Component.ValueChoice], LitSeq[Extension], LitSeq[CodeableConcept], LitSeq[Observation.ReferenceRange], Option[CodeableConcept], LitSeq[Extension])] =
      Some((o.id, o.code, o.value, o.extension, o.interpretation, o.referenceRange, o.dataAbsentReason, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val code: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("code", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val value: FHIRComponentFieldMeta[Option[Component.ValueChoice]] =
      FHIRComponentFieldMeta("value", lTagOf[Option[Component.ValueChoice]], true, lTagOf[Union01718482969])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val interpretation: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("interpretation", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val referenceRange: FHIRComponentFieldMeta[LitSeq[Observation.ReferenceRange]] =
      FHIRComponentFieldMeta(
        "referenceRange",
        lTagOf[LitSeq[Observation.ReferenceRange]],
        false,
        lTagOf[Observation.ReferenceRange])
    val dataAbsentReason: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("dataAbsentReason", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, code, value, extension, interpretation, referenceRange, dataAbsentReason, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Component): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[CodeableConcept](code, t.code),
      FHIRComponentField[Option[Component.ValueChoice]](value, t.value),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[CodeableConcept]](interpretation, t.interpretation),
      FHIRComponentField[LitSeq[Observation.ReferenceRange]](referenceRange, t.referenceRange),
      FHIRComponentField[Option[CodeableConcept]](dataAbsentReason, t.dataAbsentReason),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Component] = this
    val thisName: String                  = "Component"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Component] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Component(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[CodeableConcept]("code", None),
            cursor.decodeOptRef[Union01718482969]("value"),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("interpretation", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Observation.ReferenceRange]]("referenceRange", Some(LitSeq.empty)),
            cursor.decodeAs[Option[CodeableConcept]]("dataAbsentReason", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Component(
      override val id: Option[String] = None,
      val code: CodeableConcept,
      val value: Option[Component.ValueChoice] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val interpretation: LitSeq[CodeableConcept] = LitSeq.empty,
      val referenceRange: LitSeq[Observation.ReferenceRange] = LitSeq.empty,
      val dataAbsentReason: Option[CodeableConcept] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  type ValueChoice        = Choice[Union01718482969]
  type EffectiveChoice    = Choice[Union00107722725]
  type InstantiatesChoice = Choice[UnionCanonicalOrReference]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      code: CodeableConcept,
      note: LitSeq[Annotation] = LitSeq.empty,
      focus: LitSeq[Reference] = LitSeq.empty,
      partOf: LitSeq[Reference] = LitSeq.empty,
      status: OBSERVATION_STATUS,
      issued: Option[ZonedDateTime] = None,
      method: Option[CodeableConcept] = None,
      device: Option[Reference] = None,
      basedOn: LitSeq[Reference] = LitSeq.empty,
      subject: Option[Reference] = None,
      language: Option[LANGUAGES] = None,
      category: LitSeq[CodeableConcept] = LitSeq.empty,
      value: Option[Observation.ValueChoice] = None,
      bodySite: Option[CodeableConcept] = None,
      specimen: Option[Reference] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      encounter: Option[Reference] = None,
      performer: LitSeq[Reference] = LitSeq.empty,
      hasMember: LitSeq[Reference] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      derivedFrom: LitSeq[Reference] = LitSeq.empty,
      effective: Option[Observation.EffectiveChoice] = None,
      implicitRules: Option[UriStr] = None,
      interpretation: LitSeq[CodeableConcept] = LitSeq.empty,
      instantiates: Option[Observation.InstantiatesChoice] = None,
      dataAbsentReason: Option[CodeableConcept] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      component: LitSeq[Observation.Component] = LitSeq.empty,
      referenceRange: LitSeq[Observation.ReferenceRange] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Observation = new Observation(
    id,
    meta,
    text,
    code,
    note,
    focus,
    partOf,
    status,
    issued,
    method,
    device,
    basedOn,
    subject,
    language,
    category,
    value,
    bodySite,
    specimen,
    contained,
    extension,
    encounter,
    performer,
    hasMember,
    identifier,
    derivedFrom,
    effective,
    implicitRules,
    interpretation,
    instantiates,
    dataAbsentReason,
    modifierExtension,
    component,
    referenceRange,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val code: FHIRComponentFieldMeta[CodeableConcept] =
    FHIRComponentFieldMeta("code", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val focus: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("focus", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val partOf: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("partOf", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val status: FHIRComponentFieldMeta[OBSERVATION_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[OBSERVATION_STATUS], false, lTagOf[OBSERVATION_STATUS])
  val issued: FHIRComponentFieldMeta[Option[ZonedDateTime]] =
    FHIRComponentFieldMeta("issued", lTagOf[Option[ZonedDateTime]], false, lTagOf[ZonedDateTime])
  val method: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("method", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val device: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("device", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val basedOn: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("basedOn", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val subject: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("subject", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val category: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("category", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val value: FHIRComponentFieldMeta[Option[Observation.ValueChoice]] =
    FHIRComponentFieldMeta("value", lTagOf[Option[Observation.ValueChoice]], true, lTagOf[Union01718482969])
  val bodySite: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("bodySite", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val specimen: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("specimen", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val encounter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("encounter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val performer: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("performer", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val hasMember: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("hasMember", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val derivedFrom: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("derivedFrom", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val effective: FHIRComponentFieldMeta[Option[Observation.EffectiveChoice]] =
    FHIRComponentFieldMeta("effective", lTagOf[Option[Observation.EffectiveChoice]], true, lTagOf[Union00107722725])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val interpretation: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("interpretation", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val instantiates: FHIRComponentFieldMeta[Option[Observation.InstantiatesChoice]] =
    FHIRComponentFieldMeta(
      "instantiates",
      lTagOf[Option[Observation.InstantiatesChoice]],
      true,
      lTagOf[UnionCanonicalOrReference])
  val dataAbsentReason: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("dataAbsentReason", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val component: FHIRComponentFieldMeta[LitSeq[Observation.Component]] =
    FHIRComponentFieldMeta("component", lTagOf[LitSeq[Observation.Component]], false, lTagOf[Observation.Component])
  val referenceRange: FHIRComponentFieldMeta[LitSeq[Observation.ReferenceRange]] =
    FHIRComponentFieldMeta(
      "referenceRange",
      lTagOf[LitSeq[Observation.ReferenceRange]],
      false,
      lTagOf[Observation.ReferenceRange])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    code,
    note,
    focus,
    partOf,
    status,
    issued,
    method,
    device,
    basedOn,
    subject,
    language,
    category,
    value,
    bodySite,
    specimen,
    contained,
    extension,
    encounter,
    performer,
    hasMember,
    identifier,
    derivedFrom,
    effective,
    implicitRules,
    interpretation,
    instantiates,
    dataAbsentReason,
    modifierExtension,
    component,
    referenceRange
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Observation): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[CodeableConcept](code, t.code),
    FHIRComponentField[LitSeq[Annotation]](note, t.note),
    FHIRComponentField[LitSeq[Reference]](focus, t.focus),
    FHIRComponentField[LitSeq[Reference]](partOf, t.partOf),
    FHIRComponentField[OBSERVATION_STATUS](status, t.status),
    FHIRComponentField[Option[ZonedDateTime]](issued, t.issued),
    FHIRComponentField[Option[CodeableConcept]](method, t.method),
    FHIRComponentField[Option[Reference]](device, t.device),
    FHIRComponentField[LitSeq[Reference]](basedOn, t.basedOn),
    FHIRComponentField[Option[Reference]](subject, t.subject),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[CodeableConcept]](category, t.category),
    FHIRComponentField[Option[Observation.ValueChoice]](value, t.value),
    FHIRComponentField[Option[CodeableConcept]](bodySite, t.bodySite),
    FHIRComponentField[Option[Reference]](specimen, t.specimen),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Reference]](encounter, t.encounter),
    FHIRComponentField[LitSeq[Reference]](performer, t.performer),
    FHIRComponentField[LitSeq[Reference]](hasMember, t.hasMember),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[LitSeq[Reference]](derivedFrom, t.derivedFrom),
    FHIRComponentField[Option[Observation.EffectiveChoice]](effective, t.effective),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[CodeableConcept]](interpretation, t.interpretation),
    FHIRComponentField[Option[Observation.InstantiatesChoice]](instantiates, t.instantiates),
    FHIRComponentField[Option[CodeableConcept]](dataAbsentReason, t.dataAbsentReason),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[Observation.Component]](component, t.component),
    FHIRComponentField[LitSeq[Observation.ReferenceRange]](referenceRange, t.referenceRange)
  )
  def extractId(t: Observation): Option[String]                                   = t.id
  def extractMeta(t: Observation): Option[Meta]                                   = t.meta
  def extractText(t: Observation): Option[Narrative]                              = t.text
  def extractCode(t: Observation): CodeableConcept                                = t.code
  def extractNote(t: Observation): LitSeq[Annotation]                             = t.note
  def extractFocus(t: Observation): LitSeq[Reference]                             = t.focus
  def extractPartOf(t: Observation): LitSeq[Reference]                            = t.partOf
  def extractStatus(t: Observation): OBSERVATION_STATUS                           = t.status
  def extractIssued(t: Observation): Option[ZonedDateTime]                        = t.issued
  def extractMethod(t: Observation): Option[CodeableConcept]                      = t.method
  def extractDevice(t: Observation): Option[Reference]                            = t.device
  def extractBasedOn(t: Observation): LitSeq[Reference]                           = t.basedOn
  def extractSubject(t: Observation): Option[Reference]                           = t.subject
  def extractLanguage(t: Observation): Option[LANGUAGES]                          = t.language
  def extractCategory(t: Observation): LitSeq[CodeableConcept]                    = t.category
  def extractValue(t: Observation): Option[Observation.ValueChoice]               = t.value
  def extractBodySite(t: Observation): Option[CodeableConcept]                    = t.bodySite
  def extractSpecimen(t: Observation): Option[Reference]                          = t.specimen
  def extractContained(t: Observation): LitSeq[Resource]                          = t.contained
  def extractExtension(t: Observation): LitSeq[Extension]                         = t.extension
  def extractEncounter(t: Observation): Option[Reference]                         = t.encounter
  def extractPerformer(t: Observation): LitSeq[Reference]                         = t.performer
  def extractHasMember(t: Observation): LitSeq[Reference]                         = t.hasMember
  def extractIdentifier(t: Observation): LitSeq[Identifier]                       = t.identifier
  def extractDerivedFrom(t: Observation): LitSeq[Reference]                       = t.derivedFrom
  def extractEffective(t: Observation): Option[Observation.EffectiveChoice]       = t.effective
  def extractImplicitRules(t: Observation): Option[UriStr]                        = t.implicitRules
  def extractInterpretation(t: Observation): LitSeq[CodeableConcept]              = t.interpretation
  def extractInstantiates(t: Observation): Option[Observation.InstantiatesChoice] = t.instantiates
  def extractDataAbsentReason(t: Observation): Option[CodeableConcept]            = t.dataAbsentReason
  def extractModifierExtension(t: Observation): LitSeq[Extension]                 = t.modifierExtension
  def extractComponent(t: Observation): LitSeq[Observation.Component]             = t.component
  def extractReferenceRange(t: Observation): LitSeq[Observation.ReferenceRange]   = t.referenceRange
  override val thisName: String                                                   = "Observation"
  override val searchParams: Map[String, Observation => Seq[Any]] = Map(
    "method"                       -> (obj => obj.method.toSeq),
    "subject"                      -> (obj => obj.subject.toSeq),
    "component-code-value-concept" -> (obj => obj.component.toSeq),
    "code"                         -> (obj => Seq(obj.code)),
    "component-value-quantity" -> (obj =>
      obj.component.flatMap(_.value).flatMap(_.as[Quantity]).toSeq ++
        obj.component.flatMap(_.value).flatMap(_.as[SampledData]).toSeq),
    "part-of"                      -> (obj => obj.partOf.toSeq),
    "encounter"                    -> (obj => obj.encounter.toSeq),
    "patient"                      -> (obj => obj.subject.filter(_.reference.exists(_.contains("Patient/"))).toSeq),
    "component-data-absent-reason" -> (obj => obj.component.flatMap(_.dataAbsentReason).toSeq),
    "value-date" -> (obj =>
      obj.value.flatMap(_.as[FHIRDateTime]).toSeq ++
        obj.value.flatMap(_.as[Period]).toSeq),
    "component-code-value-quantity" -> (obj => obj.component.toSeq),
    "combo-data-absent-reason" -> (obj =>
      obj.dataAbsentReason.toSeq ++
        obj.component.flatMap(_.dataAbsentReason).toSeq),
    "identifier" -> (obj => obj.identifier.toSeq),
    "combo-value-quantity" -> (obj =>
      obj.value.flatMap(_.as[Quantity]).toSeq ++
        obj.value.flatMap(_.as[SampledData]).toSeq ++
        obj.component.flatMap(_.value).flatMap(_.as[Quantity]).toSeq ++
        obj.component.flatMap(_.value).flatMap(_.as[SampledData]).toSeq),
    "value-string" -> (obj =>
      obj.value.flatMap(_.as[String]).toSeq ++
        obj.value.flatMap(_.as[CodeableConcept]).flatMap(_.text).toSeq),
    "combo-code-value-quantity" -> (obj => obj.component.toSeq),
    "focus"                     -> (obj => obj.focus.toSeq),
    "date"                      -> (obj => obj.effective.toSeq),
    "combo-value-concept" -> (obj =>
      obj.value.flatMap(_.as[CodeableConcept]).toSeq ++
        obj.component.flatMap(_.value).flatMap(_.as[CodeableConcept]).toSeq),
    "component-code"           -> (obj => obj.component.map(_.code).toSeq),
    "status"                   -> (obj => Seq(obj.status)),
    "has-member"               -> (obj => obj.hasMember.toSeq),
    "data-absent-reason"       -> (obj => obj.dataAbsentReason.toSeq),
    "component-value-concept"  -> (obj => obj.component.flatMap(_.value).flatMap(_.as[CodeableConcept]).toSeq),
    "value-concept"            -> (obj => obj.value.flatMap(_.as[CodeableConcept]).toSeq),
    "category"                 -> (obj => obj.category.toSeq),
    "specimen"                 -> (obj => obj.specimen.toSeq),
    "combo-code-value-concept" -> (obj => obj.component.toSeq),
    "based-on"                 -> (obj => obj.basedOn.toSeq),
    "value-quantity" -> (obj =>
      obj.value.flatMap(_.as[Quantity]).toSeq ++
        obj.value.flatMap(_.as[SampledData]).toSeq),
    "combo-code" -> (obj =>
      Seq(obj.code) ++
        obj.component.map(_.code).toSeq),
    "device"       -> (obj => obj.device.toSeq),
    "performer"    -> (obj => obj.performer.toSeq),
    "derived-from" -> (obj => obj.derivedFrom.toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Observation] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Observation(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[CodeableConcept]("code", None),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("focus", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("partOf", Some(LitSeq.empty)),
          cursor.decodeAs[OBSERVATION_STATUS]("status", None),
          cursor.decodeAs[Option[ZonedDateTime]]("issued", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("method", Some(None)),
          cursor.decodeAs[Option[Reference]]("device", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("basedOn", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("subject", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("category", Some(LitSeq.empty)),
          cursor.decodeOptRef[Union01718482969]("value"),
          cursor.decodeAs[Option[CodeableConcept]]("bodySite", Some(None)),
          cursor.decodeAs[Option[Reference]]("specimen", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("performer", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("hasMember", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("derivedFrom", Some(LitSeq.empty)),
          cursor.decodeOptRef[Union00107722725]("effective"),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("interpretation", Some(LitSeq.empty)),
          cursor.decodeOptRef[UnionCanonicalOrReference]("instantiates"),
          cursor.decodeAs[Option[CodeableConcept]]("dataAbsentReason", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Observation.Component]]("component", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Observation.ReferenceRange]]("referenceRange", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Measurements and simple assertions made about a patient, device or other subject.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields code, note, focus, partOf, status, issued, method, device, basedOn, subject, category, value,
  *   bodySite, specimen, encounter, performer, hasMember, identifier, derivedFrom, effective, interpretation, instantiates,
  *   dataAbsentReason, component, referenceRange.
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
  *   - Describes what was observed. Sometimes this is called the observation "name".
  * @param note
  *   - Comments about the observation or the results.
  * @param focus
  *   - The actual focus of an observation when it is not the patient of record representing something or someone associated with
  *   the patient such as a spouse, parent, fetus, or donor. For example, fetus observations in a mother's record. The focus of an
  *   observation could also be an existing condition, an intervention, the subject's diet, another observation of the subject, or
  *   a body structure such as tumor or implanted device. An example use case would be using the Observation resource to capture
  *   whether the mother is trained to change her child's tracheostomy tube. In this example, the child is the patient of record
  *   and the mother is the focus.
  * @param partOf
  *   - A larger event of which this particular Observation is a component or step. For example, an observation as part of a
  *   procedure.
  * @param status
  *   - The status of the result value.
  * @param issued
  *   - The date and time this version of the observation was made available to providers, typically after the results have been
  *   reviewed and verified.
  * @param method
  *   - Indicates the mechanism used to perform the observation.
  * @param device
  *   - The device used to generate the observation data.
  * @param basedOn
  *   - A plan, proposal or order that is fulfilled in whole or in part by this event. For example, a MedicationRequest may
  *   require a patient to have laboratory test performed before it is dispensed.
  * @param subject
  *   - The patient, or group of patients, location, device, organization, procedure or practitioner this observation is about and
  *   into whose or what record the observation is placed. If the actual focus of the observation is different from the subject
  *   (or a sample of, part, or region of the subject), the `focus` element or the `code` itself specifies the actual focus of the
  *   observation.
  * @param language
  *   - The base language in which the resource is written.
  * @param category
  *   - A code that classifies the general type of observation being made.
  * @param value
  *   - The information determined as a result of making the observation, if the information has a simple value.
  * @param bodySite
  *   - Indicates the site on the subject's body where the observation was made (i.e. the target site).
  * @param specimen
  *   - The specimen that was used when this observation was made.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param encounter
  *   - The healthcare event (e.g. a patient and healthcare provider interaction) during which this observation is made.
  * @param performer
  *   - Who was responsible for asserting the observed value as "true".
  * @param hasMember
  *   - This observation is a group observation (e.g. a battery, a panel of tests, a set of vital sign measurements) that includes
  *   the target as a member of the group.
  * @param identifier
  *   - A unique identifier assigned to this observation.
  * @param derivedFrom
  *   - The target resource that represents a measurement from which this observation value is derived. For example, a calculated
  *   anion gap or a fetal measurement based on an ultrasound image.
  * @param effective
  *   - The time or time-period the observed value is asserted as being true. For biological subjects - e.g. human patients - this
  *   is usually called the "physiologically relevant time". This is usually either the time of the procedure or of specimen
  *   collection, but very often the source of the date/time is not known, only the date/time itself.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param interpretation
  *   - A categorical assessment of an observation value. For example, high, low, normal.
  * @param instantiates
  *   - The reference to a FHIR ObservationDefinition resource that provides the definition that is adhered to in whole or in part
  *   by this Observation instance.
  * @param dataAbsentReason
  *   - Provides a reason why the expected value in the element Observation.value[x] is missing.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *   the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually
  *   modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict
  *   set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param component
  *   - Some observations have multiple component observations. These component observations are expressed as separate code value
  *   pairs that share the same attributes. Examples include systolic and diastolic component observations for blood pressure
  *   measurement and multiple component observations for genetics observations.
  * @param referenceRange
  *   - Guidance on how to interpret the value by comparison to a normal or recommended range. Multiple reference ranges are
  *   interpreted as an "OR". In other words, to represent two distinct target populations, two `referenceRange` elements would be
  *   used.
  */
@POJOBoilerplate
class Observation(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val code: CodeableConcept,
    val note: LitSeq[Annotation] = LitSeq.empty,
    val focus: LitSeq[Reference] = LitSeq.empty,
    val partOf: LitSeq[Reference] = LitSeq.empty,
    val status: OBSERVATION_STATUS,
    val issued: Option[ZonedDateTime] = None,
    val method: Option[CodeableConcept] = None,
    val device: Option[Reference] = None,
    val basedOn: LitSeq[Reference] = LitSeq.empty,
    val subject: Option[Reference] = None,
    override val language: Option[LANGUAGES] = None,
    val category: LitSeq[CodeableConcept] = LitSeq.empty,
    val value: Option[Observation.ValueChoice] = None,
    val bodySite: Option[CodeableConcept] = None,
    val specimen: Option[Reference] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val encounter: Option[Reference] = None,
    val performer: LitSeq[Reference] = LitSeq.empty,
    val hasMember: LitSeq[Reference] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val derivedFrom: LitSeq[Reference] = LitSeq.empty,
    val effective: Option[Observation.EffectiveChoice] = None,
    override val implicitRules: Option[UriStr] = None,
    val interpretation: LitSeq[CodeableConcept] = LitSeq.empty,
    val instantiates: Option[Observation.InstantiatesChoice] = None,
    val dataAbsentReason: Option[CodeableConcept] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val component: LitSeq[Observation.Component] = LitSeq.empty,
    val referenceRange: LitSeq[Observation.ReferenceRange] = LitSeq.empty,
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
  override val thisTypeName: String = "Observation"
}
