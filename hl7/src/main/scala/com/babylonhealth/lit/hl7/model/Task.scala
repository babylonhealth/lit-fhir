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
import com.babylonhealth.lit.hl7.{ TASK_STATUS, TASK_INTENT, REQUEST_PRIORITY }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Task extends CompanionFor[Task] {
  override type ResourceType = Task
  override type ParentType   = Task
  override val baseType: CompanionFor[ResourceType] = Task
  override val parentType: CompanionFor[ParentType] = Task
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Task")
  object Restriction extends CompanionFor[Restriction] {
    override type ResourceType = Restriction
    override type ParentType   = Restriction
    override val parentType: CompanionFor[ResourceType] = Restriction
    def apply(
        id: Option[String] = None,
        period: Option[Period] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        recipient: LitSeq[Reference] = LitSeq.empty,
        repetitions: Option[PositiveInt] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Restriction = new Restriction(
      id,
      period,
      extension,
      recipient,
      repetitions,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Restriction): Option[(Option[String], Option[Period], LitSeq[Extension], LitSeq[Reference], Option[PositiveInt], LitSeq[Extension])] =
      Some((o.id, o.period, o.extension, o.recipient, o.repetitions, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val period: FHIRComponentFieldMeta[Option[Period]] =
      FHIRComponentFieldMeta("period", lTagOf[Option[Period]], false, lTagOf[Period])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val recipient: FHIRComponentFieldMeta[LitSeq[Reference]] =
      FHIRComponentFieldMeta("recipient", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
    val repetitions: FHIRComponentFieldMeta[Option[PositiveInt]] =
      FHIRComponentFieldMeta("repetitions", lTagOf[Option[PositiveInt]], false, lTagOf[PositiveInt])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, period, extension, recipient, repetitions, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Restriction): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Period]](period, t.period),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Reference]](recipient, t.recipient),
      FHIRComponentField[Option[PositiveInt]](repetitions, t.repetitions),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Restriction] = this
    val thisName: String                    = "Restriction"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Restriction] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Restriction(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[Period]]("period", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Reference]]("recipient", Some(LitSeq.empty)),
            cursor.decodeAs[Option[PositiveInt]]("repetitions", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Restriction(
      override val id: Option[String] = None,
      val period: Option[Period] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val recipient: LitSeq[Reference] = LitSeq.empty,
      val repetitions: Option[PositiveInt] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Output extends CompanionFor[Output] {
    override type ResourceType = Output
    override type ParentType   = Output
    override val parentType: CompanionFor[ResourceType] = Output
    type ValueChoice = Choice[Union_1349125893]
    def apply(
        id: Option[String] = None,
        `type`: CodeableConcept,
        value: Output.ValueChoice,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Output = new Output(
      id,
      `type`,
      value,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Output): Option[(Option[String], CodeableConcept, Output.ValueChoice, LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.`type`, o.value, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("type", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val value: FHIRComponentFieldMeta[Output.ValueChoice] =
      FHIRComponentFieldMeta("value", lTagOf[Output.ValueChoice], true, lTagOf[Union_1349125893])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, `type`, value, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Output): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[CodeableConcept](`type`, t.`type`),
      FHIRComponentField[Output.ValueChoice](value, t.value),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Output] = this
    val thisName: String               = "Output"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Output] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Output(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[CodeableConcept]("type", None),
            cursor.decodeRef[Union_1349125893]("value"),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Output(
      override val id: Option[String] = None,
      val `type`: CodeableConcept,
      val value: Output.ValueChoice,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Input extends CompanionFor[Input] {
    override type ResourceType = Input
    override type ParentType   = Input
    override val parentType: CompanionFor[ResourceType] = Input
    type ValueChoice = Choice[Union_1349125893]
    def apply(
        id: Option[String] = None,
        `type`: CodeableConcept,
        value: Input.ValueChoice,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Input = new Input(
      id,
      `type`,
      value,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Input): Option[(Option[String], CodeableConcept, Input.ValueChoice, LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.`type`, o.value, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("type", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val value: FHIRComponentFieldMeta[Input.ValueChoice] =
      FHIRComponentFieldMeta("value", lTagOf[Input.ValueChoice], true, lTagOf[Union_1349125893])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, `type`, value, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Input): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[CodeableConcept](`type`, t.`type`),
      FHIRComponentField[Input.ValueChoice](value, t.value),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Input] = this
    val thisName: String              = "Input"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Input] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Input(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[CodeableConcept]("type", None),
            cursor.decodeRef[Union_1349125893]("value"),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Input(
      override val id: Option[String] = None,
      val `type`: CodeableConcept,
      val value: Input.ValueChoice,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      `for`: Option[Reference] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      code: Option[CodeableConcept] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      focus: Option[Reference] = None,
      owner: Option[Reference] = None,
      partOf: LitSeq[Reference] = LitSeq.empty,
      status: TASK_STATUS,
      intent: TASK_INTENT,
      basedOn: LitSeq[Reference] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      priority: Option[REQUEST_PRIORITY] = None,
      location: Option[Reference] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      encounter: Option[Reference] = None,
      requester: Option[Reference] = None,
      insurance: LitSeq[Reference] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      authoredOn: Option[FHIRDateTime] = None,
      reasonCode: Option[CodeableConcept] = None,
      description: Option[String] = None,
      statusReason: Option[CodeableConcept] = None,
      lastModified: Option[FHIRDateTime] = None,
      implicitRules: Option[UriStr] = None,
      performerType: LitSeq[CodeableConcept] = LitSeq.empty,
      businessStatus: Option[CodeableConcept] = None,
      instantiatesUri: Option[UriStr] = None,
      groupIdentifier: Option[Identifier] = None,
      executionPeriod: Option[Period] = None,
      reasonReference: Option[Reference] = None,
      relevantHistory: LitSeq[Reference] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      instantiatesCanonical: Option[Canonical] = None,
      input: LitSeq[Task.Input] = LitSeq.empty,
      output: LitSeq[Task.Output] = LitSeq.empty,
      restriction: Option[Task.Restriction] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Task = new Task(
    id,
    `for`,
    meta,
    text,
    code,
    note,
    focus,
    owner,
    partOf,
    status,
    intent,
    basedOn,
    language,
    priority,
    location,
    contained,
    extension,
    encounter,
    requester,
    insurance,
    identifier,
    authoredOn,
    reasonCode,
    description,
    statusReason,
    lastModified,
    implicitRules,
    performerType,
    businessStatus,
    instantiatesUri,
    groupIdentifier,
    executionPeriod,
    reasonReference,
    relevantHistory,
    modifierExtension,
    instantiatesCanonical,
    input,
    output,
    restriction,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val `for`: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("for", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val code: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("code", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val focus: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("focus", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val owner: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("owner", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val partOf: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("partOf", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val status: FHIRComponentFieldMeta[TASK_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[TASK_STATUS], false, lTagOf[TASK_STATUS])
  val intent: FHIRComponentFieldMeta[TASK_INTENT] =
    FHIRComponentFieldMeta("intent", lTagOf[TASK_INTENT], false, lTagOf[TASK_INTENT])
  val basedOn: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("basedOn", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val priority: FHIRComponentFieldMeta[Option[REQUEST_PRIORITY]] =
    FHIRComponentFieldMeta("priority", lTagOf[Option[REQUEST_PRIORITY]], false, lTagOf[REQUEST_PRIORITY])
  val location: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("location", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val encounter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("encounter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val requester: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("requester", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val insurance: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("insurance", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val authoredOn: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("authoredOn", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val reasonCode: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("reasonCode", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val description: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
  val statusReason: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("statusReason", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val lastModified: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("lastModified", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val performerType: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("performerType", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val businessStatus: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("businessStatus", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val instantiatesUri: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("instantiatesUri", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val groupIdentifier: FHIRComponentFieldMeta[Option[Identifier]] =
    FHIRComponentFieldMeta("groupIdentifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
  val executionPeriod: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("executionPeriod", lTagOf[Option[Period]], false, lTagOf[Period])
  val reasonReference: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("reasonReference", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val relevantHistory: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("relevantHistory", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val instantiatesCanonical: FHIRComponentFieldMeta[Option[Canonical]] =
    FHIRComponentFieldMeta("instantiatesCanonical", lTagOf[Option[Canonical]], false, lTagOf[Canonical])
  val input: FHIRComponentFieldMeta[LitSeq[Task.Input]] =
    FHIRComponentFieldMeta("input", lTagOf[LitSeq[Task.Input]], false, lTagOf[Task.Input])
  val output: FHIRComponentFieldMeta[LitSeq[Task.Output]] =
    FHIRComponentFieldMeta("output", lTagOf[LitSeq[Task.Output]], false, lTagOf[Task.Output])
  val restriction: FHIRComponentFieldMeta[Option[Task.Restriction]] =
    FHIRComponentFieldMeta("restriction", lTagOf[Option[Task.Restriction]], false, lTagOf[Task.Restriction])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    `for`,
    meta,
    text,
    code,
    note,
    focus,
    owner,
    partOf,
    status,
    intent,
    basedOn,
    language,
    priority,
    location,
    contained,
    extension,
    encounter,
    requester,
    insurance,
    identifier,
    authoredOn,
    reasonCode,
    description,
    statusReason,
    lastModified,
    implicitRules,
    performerType,
    businessStatus,
    instantiatesUri,
    groupIdentifier,
    executionPeriod,
    reasonReference,
    relevantHistory,
    modifierExtension,
    instantiatesCanonical,
    input,
    output,
    restriction
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Task): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Reference]](`for`, t.`for`),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[CodeableConcept]](code, t.code),
    FHIRComponentField[LitSeq[Annotation]](note, t.note),
    FHIRComponentField[Option[Reference]](focus, t.focus),
    FHIRComponentField[Option[Reference]](owner, t.owner),
    FHIRComponentField[LitSeq[Reference]](partOf, t.partOf),
    FHIRComponentField[TASK_STATUS](status, t.status),
    FHIRComponentField[TASK_INTENT](intent, t.intent),
    FHIRComponentField[LitSeq[Reference]](basedOn, t.basedOn),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Option[REQUEST_PRIORITY]](priority, t.priority),
    FHIRComponentField[Option[Reference]](location, t.location),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Reference]](encounter, t.encounter),
    FHIRComponentField[Option[Reference]](requester, t.requester),
    FHIRComponentField[LitSeq[Reference]](insurance, t.insurance),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[FHIRDateTime]](authoredOn, t.authoredOn),
    FHIRComponentField[Option[CodeableConcept]](reasonCode, t.reasonCode),
    FHIRComponentField[Option[String]](description, t.description),
    FHIRComponentField[Option[CodeableConcept]](statusReason, t.statusReason),
    FHIRComponentField[Option[FHIRDateTime]](lastModified, t.lastModified),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[CodeableConcept]](performerType, t.performerType),
    FHIRComponentField[Option[CodeableConcept]](businessStatus, t.businessStatus),
    FHIRComponentField[Option[UriStr]](instantiatesUri, t.instantiatesUri),
    FHIRComponentField[Option[Identifier]](groupIdentifier, t.groupIdentifier),
    FHIRComponentField[Option[Period]](executionPeriod, t.executionPeriod),
    FHIRComponentField[Option[Reference]](reasonReference, t.reasonReference),
    FHIRComponentField[LitSeq[Reference]](relevantHistory, t.relevantHistory),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Option[Canonical]](instantiatesCanonical, t.instantiatesCanonical),
    FHIRComponentField[LitSeq[Task.Input]](input, t.input),
    FHIRComponentField[LitSeq[Task.Output]](output, t.output),
    FHIRComponentField[Option[Task.Restriction]](restriction, t.restriction)
  )
  def extractId(t: Task): Option[String]                       = t.id
  def extractFor(t: Task): Option[Reference]                   = t.`for`
  def extractMeta(t: Task): Option[Meta]                       = t.meta
  def extractText(t: Task): Option[Narrative]                  = t.text
  def extractCode(t: Task): Option[CodeableConcept]            = t.code
  def extractNote(t: Task): LitSeq[Annotation]                 = t.note
  def extractFocus(t: Task): Option[Reference]                 = t.focus
  def extractOwner(t: Task): Option[Reference]                 = t.owner
  def extractPartOf(t: Task): LitSeq[Reference]                = t.partOf
  def extractStatus(t: Task): TASK_STATUS                      = t.status
  def extractIntent(t: Task): TASK_INTENT                      = t.intent
  def extractBasedOn(t: Task): LitSeq[Reference]               = t.basedOn
  def extractLanguage(t: Task): Option[LANGUAGES]              = t.language
  def extractPriority(t: Task): Option[REQUEST_PRIORITY]       = t.priority
  def extractLocation(t: Task): Option[Reference]              = t.location
  def extractContained(t: Task): LitSeq[Resource]              = t.contained
  def extractExtension(t: Task): LitSeq[Extension]             = t.extension
  def extractEncounter(t: Task): Option[Reference]             = t.encounter
  def extractRequester(t: Task): Option[Reference]             = t.requester
  def extractInsurance(t: Task): LitSeq[Reference]             = t.insurance
  def extractIdentifier(t: Task): LitSeq[Identifier]           = t.identifier
  def extractAuthoredOn(t: Task): Option[FHIRDateTime]         = t.authoredOn
  def extractReasonCode(t: Task): Option[CodeableConcept]      = t.reasonCode
  def extractDescription(t: Task): Option[String]              = t.description
  def extractStatusReason(t: Task): Option[CodeableConcept]    = t.statusReason
  def extractLastModified(t: Task): Option[FHIRDateTime]       = t.lastModified
  def extractImplicitRules(t: Task): Option[UriStr]            = t.implicitRules
  def extractPerformerType(t: Task): LitSeq[CodeableConcept]   = t.performerType
  def extractBusinessStatus(t: Task): Option[CodeableConcept]  = t.businessStatus
  def extractInstantiatesUri(t: Task): Option[UriStr]          = t.instantiatesUri
  def extractGroupIdentifier(t: Task): Option[Identifier]      = t.groupIdentifier
  def extractExecutionPeriod(t: Task): Option[Period]          = t.executionPeriod
  def extractReasonReference(t: Task): Option[Reference]       = t.reasonReference
  def extractRelevantHistory(t: Task): LitSeq[Reference]       = t.relevantHistory
  def extractModifierExtension(t: Task): LitSeq[Extension]     = t.modifierExtension
  def extractInstantiatesCanonical(t: Task): Option[Canonical] = t.instantiatesCanonical
  def extractInput(t: Task): LitSeq[Task.Input]                = t.input
  def extractOutput(t: Task): LitSeq[Task.Output]              = t.output
  def extractRestriction(t: Task): Option[Task.Restriction]    = t.restriction
  override val thisName: String                                = "Task"
  override val searchParams: Map[String, Task => Seq[Any]] = Map(
    "priority"         -> (obj => obj.priority.toSeq),
    "group-identifier" -> (obj => obj.groupIdentifier.toSeq),
    "subject"          -> (obj => obj.`for`.toSeq),
    "identifier"       -> (obj => obj.identifier.toSeq),
    "intent"           -> (obj => Seq(obj.intent)),
    "requester"        -> (obj => obj.requester.toSeq),
    "business-status"  -> (obj => obj.businessStatus.toSeq),
    "focus"            -> (obj => obj.focus.toSeq),
    "status"           -> (obj => Seq(obj.status)),
    "authored-on"      -> (obj => obj.authoredOn.toSeq),
    "owner"            -> (obj => obj.owner.toSeq),
    "part-of"          -> (obj => obj.partOf.toSeq),
    "based-on"         -> (obj => obj.basedOn.toSeq),
    "encounter"        -> (obj => obj.encounter.toSeq),
    "patient"          -> (obj => obj.`for`.filter(_.reference.exists(_.contains("Patient/"))).toSeq),
    "code"             -> (obj => obj.code.toSeq),
    "modified"         -> (obj => obj.lastModified.toSeq),
    "performer"        -> (obj => obj.performerType.toSeq),
    "period"           -> (obj => obj.executionPeriod.toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Task] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Task(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Reference]]("for", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("code", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("focus", Some(None)),
          cursor.decodeAs[Option[Reference]]("owner", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("partOf", Some(LitSeq.empty)),
          cursor.decodeAs[TASK_STATUS]("status", None),
          cursor.decodeAs[TASK_INTENT]("intent", None),
          cursor.decodeAs[LitSeq[Reference]]("basedOn", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[REQUEST_PRIORITY]]("priority", Some(None)),
          cursor.decodeAs[Option[Reference]]("location", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          cursor.decodeAs[Option[Reference]]("requester", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("insurance", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[FHIRDateTime]]("authoredOn", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("reasonCode", Some(None)),
          cursor.decodeAs[Option[String]]("description", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("statusReason", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("lastModified", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("performerType", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("businessStatus", Some(None)),
          cursor.decodeAs[Option[UriStr]]("instantiatesUri", Some(None)),
          cursor.decodeAs[Option[Identifier]]("groupIdentifier", Some(None)),
          cursor.decodeAs[Option[Period]]("executionPeriod", Some(None)),
          cursor.decodeAs[Option[Reference]]("reasonReference", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("relevantHistory", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Canonical]]("instantiatesCanonical", Some(None)),
          cursor.decodeAs[LitSeq[Task.Input]]("input", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Task.Output]]("output", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Task.Restriction]]("restriction", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** A task to be performed.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields `for`, code, note, focus, owner, partOf, status, intent, basedOn, priority, location, encounter, requester, insurance, identifier, authoredOn, reasonCode, description, statusReason, lastModified, performerType, businessStatus, instantiatesUri, groupIdentifier, executionPeriod, reasonReference, relevantHistory, instantiatesCanonical, input, output, restriction.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param `for` - The entity who benefits from the performance of the service specified in the task (e.g., the patient).
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param code - A name or code (or both) briefly describing what the task involves.
  * @param note - Free-text information captured about the task as it progresses.
  * @param focus - The request being actioned or the resource being manipulated by this task.
  * @param owner - Individual organization or Device currently responsible for task execution.
  * @param partOf - Task that this particular task is part of.
  * @param status - The current status of the task.
  * @param intent - Indicates the "level" of actionability associated with the Task, i.e. i+R[9]Cs this a proposed task, a planned task, an actionable task, etc.
  * @param basedOn - BasedOn refers to a higher-level authorization that triggered the creation of the task.  It references a "request" resource such as a ServiceRequest, MedicationRequest, ServiceRequest, CarePlan, etc. which is distinct from the "request" resource the task is seeking to fulfill.  This latter resource is referenced by FocusOn.  For example, based on a ServiceRequest (= BasedOn), a task is created to fulfill a procedureRequest ( = FocusOn ) to collect a specimen from a patient.
  * @param language - The base language in which the resource is written.
  * @param priority - Indicates how quickly the Task should be addressed with respect to other requests.
  * @param location - Principal physical location where the this task is performed.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param encounter - The healthcare event  (e.g. a patient and healthcare provider interaction) during which this task was created.
  * @param requester - The creator of the task.
  * @param insurance - Insurance plans, coverage extensions, pre-authorizations and/or pre-determinations that may be relevant to the Task.
  * @param identifier - The business identifier for this task.
  * @param authoredOn - The date and time this task was created.
  * @param reasonCode - A description or code indicating why this task needs to be performed.
  * @param description - A free-text description of what is to be performed.
  * @param statusReason - An explanation as to why this task is held, failed, was refused, etc.
  * @param lastModified - The date and time of last modification to this task.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param performerType - The kind of participant that should perform the task.
  * @param businessStatus - Contains business-specific nuances of the business state.
  * @param instantiatesUri - The URL pointing to an *externally* maintained  protocol, guideline, orderset or other definition that is adhered to in whole or in part by this Task.
  * @param groupIdentifier - An identifier that links together multiple tasks and other requests that were created in the same context.
  * @param executionPeriod - Identifies the time action was first taken against the task (start) and/or the time final action was taken against the task prior to marking it as completed (end).
  * @param reasonReference - A resource reference indicating why this task needs to be performed.
  * @param relevantHistory - Links to Provenance records for past versions of this Task that identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the task.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param instantiatesCanonical - The URL pointing to a *FHIR*-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this Task.
  * @param input - Additional information that may be needed in the execution of the task.
  * @param output - Outputs produced by the Task.
  * @param restriction - If the Task.focus is a request resource and the task is seeking fulfillment (i.e. is asking for the request to be actioned), this element identifies any limitations on what parts of the referenced request should be actioned.
  */
@POJOBoilerplate
class Task(
    override val id: Option[String] = None,
    val `for`: Option[Reference] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val code: Option[CodeableConcept] = None,
    val note: LitSeq[Annotation] = LitSeq.empty,
    val focus: Option[Reference] = None,
    val owner: Option[Reference] = None,
    val partOf: LitSeq[Reference] = LitSeq.empty,
    val status: TASK_STATUS,
    val intent: TASK_INTENT,
    val basedOn: LitSeq[Reference] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    val priority: Option[REQUEST_PRIORITY] = None,
    val location: Option[Reference] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val encounter: Option[Reference] = None,
    val requester: Option[Reference] = None,
    val insurance: LitSeq[Reference] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val authoredOn: Option[FHIRDateTime] = None,
    val reasonCode: Option[CodeableConcept] = None,
    val description: Option[String] = None,
    val statusReason: Option[CodeableConcept] = None,
    val lastModified: Option[FHIRDateTime] = None,
    override val implicitRules: Option[UriStr] = None,
    val performerType: LitSeq[CodeableConcept] = LitSeq.empty,
    val businessStatus: Option[CodeableConcept] = None,
    val instantiatesUri: Option[UriStr] = None,
    val groupIdentifier: Option[Identifier] = None,
    val executionPeriod: Option[Period] = None,
    val reasonReference: Option[Reference] = None,
    val relevantHistory: LitSeq[Reference] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val instantiatesCanonical: Option[Canonical] = None,
    val input: LitSeq[Task.Input] = LitSeq.empty,
    val output: LitSeq[Task.Output] = LitSeq.empty,
    val restriction: Option[Task.Restriction] = None,
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
  override val thisTypeName: String = "Task"
}
