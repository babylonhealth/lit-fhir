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
import com.babylonhealth.lit.hl7.{
  ACTION_SELECTION_BEHAVIOR,
  ACTION_CARDINALITY_BEHAVIOR,
  REQUEST_INTENT,
  ACTION_CONDITION_KIND,
  ACTION_REQUIRED_BEHAVIOR,
  ACTION_PARTICIPANT_TYPE,
  ACTION_PRECHECK_BEHAVIOR,
  ACTION_GROUPING_BEHAVIOR,
  REQUEST_STATUS,
  REQUEST_PRIORITY,
  ACTION_RELATIONSHIP_TYPE
}
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object RequestGroup extends CompanionFor[RequestGroup] {
  implicit def summonObjectAndCompanionRequestGroup25333157(
      o: RequestGroup): ObjectAndCompanion[RequestGroup, RequestGroup.type] = ObjectAndCompanion(o, this)
  override type ResourceType = RequestGroup
  override type ParentType   = RequestGroup
  override val baseType: CompanionFor[ResourceType] = RequestGroup
  override val parentType: CompanionFor[ParentType] = RequestGroup
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/RequestGroup")
  object Action extends CompanionFor[Action] {
    implicit def summonObjectAndCompanionAction_1404218720(o: Action): ObjectAndCompanion[Action, Action.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Action
    override type ParentType   = Action
    override val parentType: CompanionFor[ResourceType] = Action
    object Condition extends CompanionFor[Condition] {
      implicit def summonObjectAndCompanionCondition1062174204(o: Condition): ObjectAndCompanion[Condition, Condition.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Condition
      override type ParentType   = Condition
      override val parentType: CompanionFor[ResourceType] = Condition
      def apply(
          id: Option[String] = None,
          kind: ACTION_CONDITION_KIND,
          extension: LitSeq[Extension] = LitSeq.empty,
          expression: Option[Expression] = None,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Condition = new Condition(
        id,
        kind,
        extension,
        expression,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Condition): Option[(Option[String], ACTION_CONDITION_KIND, LitSeq[Extension], Option[Expression], LitSeq[Extension])] =
        Some((o.id, o.kind, o.extension, o.expression, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val kind: FHIRComponentFieldMeta[ACTION_CONDITION_KIND] =
        FHIRComponentFieldMeta("kind", lTagOf[ACTION_CONDITION_KIND], false, lTagOf[ACTION_CONDITION_KIND])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val expression: FHIRComponentFieldMeta[Option[Expression]] =
        FHIRComponentFieldMeta("expression", lTagOf[Option[Expression]], false, lTagOf[Expression])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, kind, extension, expression, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Condition): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[ACTION_CONDITION_KIND](kind, t.kind),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[Expression]](expression, t.expression),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Condition] = this
      val thisName: String                  = "Condition"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Condition] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Condition(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[ACTION_CONDITION_KIND]("kind", None),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[Expression]]("expression", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Condition(
        override val id: Option[String] = None,
        val kind: ACTION_CONDITION_KIND,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val expression: Option[Expression] = None,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object Participant extends CompanionFor[Participant] {
      implicit def summonObjectAndCompanionParticipant1062174204(
          o: Participant): ObjectAndCompanion[Participant, Participant.type] = ObjectAndCompanion(o, this)
      override type ResourceType = Participant
      override type ParentType   = Participant
      override val parentType: CompanionFor[ResourceType] = Participant
      def apply(
          id: Option[String] = None,
          `type`: Option[ACTION_PARTICIPANT_TYPE] = None,
          role: Option[CodeableConcept] = None,
          actor: Option[Reference] = None,
          function: Option[CodeableConcept] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          typeReference: Option[Reference] = None,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Participant = new Participant(
        id,
        `type`,
        role,
        actor,
        function,
        extension,
        typeReference,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Participant): Option[(Option[String], Option[ACTION_PARTICIPANT_TYPE], Option[CodeableConcept], Option[Reference], Option[CodeableConcept], LitSeq[Extension], Option[Reference], LitSeq[Extension])] =
        Some((o.id, o.`type`, o.role, o.actor, o.function, o.extension, o.typeReference, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val `type`: FHIRComponentFieldMeta[Option[ACTION_PARTICIPANT_TYPE]] =
        FHIRComponentFieldMeta("type", lTagOf[Option[ACTION_PARTICIPANT_TYPE]], false, lTagOf[ACTION_PARTICIPANT_TYPE])
      val role: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("role", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val actor: FHIRComponentFieldMeta[Option[Reference]] =
        FHIRComponentFieldMeta("actor", lTagOf[Option[Reference]], false, lTagOf[Reference])
      val function: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("function", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val typeReference: FHIRComponentFieldMeta[Option[Reference]] =
        FHIRComponentFieldMeta("typeReference", lTagOf[Option[Reference]], false, lTagOf[Reference])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
        Seq(id, `type`, role, actor, function, extension, typeReference, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Participant): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[ACTION_PARTICIPANT_TYPE]](`type`, t.`type`),
        FHIRComponentField[Option[CodeableConcept]](role, t.role),
        FHIRComponentField[Option[Reference]](actor, t.actor),
        FHIRComponentField[Option[CodeableConcept]](function, t.function),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[Reference]](typeReference, t.typeReference),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Participant] = this
      val thisName: String                    = "Participant"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Participant] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Participant(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[ACTION_PARTICIPANT_TYPE]]("type", Some(None)),
              cursor.decodeAs[Option[CodeableConcept]]("role", Some(None)),
              cursor.decodeAs[Option[Reference]]("actor", Some(None)),
              cursor.decodeAs[Option[CodeableConcept]]("function", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[Reference]]("typeReference", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Participant(
        override val id: Option[String] = None,
        val `type`: Option[ACTION_PARTICIPANT_TYPE] = None,
        val role: Option[CodeableConcept] = None,
        val actor: Option[Reference] = None,
        val function: Option[CodeableConcept] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val typeReference: Option[Reference] = None,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object RelatedAction extends CompanionFor[RelatedAction] {
      implicit def summonObjectAndCompanionRelatedAction1062174204(
          o: RelatedAction): ObjectAndCompanion[RelatedAction, RelatedAction.type] = ObjectAndCompanion(o, this)
      override type ResourceType = RelatedAction
      override type ParentType   = RelatedAction
      override val parentType: CompanionFor[ResourceType] = RelatedAction
      type OffsetChoice = Choice[UnionDurationOrRange]
      def apply(
          id: Option[String] = None,
          targetId: Id,
          extension: LitSeq[Extension] = LitSeq.empty,
          offset: Option[RelatedAction.OffsetChoice] = None,
          relationship: ACTION_RELATIONSHIP_TYPE,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): RelatedAction = new RelatedAction(
        id,
        targetId,
        extension,
        offset,
        relationship,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: RelatedAction): Option[(Option[String], Id, LitSeq[Extension], Option[RelatedAction.OffsetChoice], ACTION_RELATIONSHIP_TYPE, LitSeq[Extension])] =
        Some((o.id, o.targetId, o.extension, o.offset, o.relationship, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val targetId: FHIRComponentFieldMeta[Id] =
        FHIRComponentFieldMeta("targetId", lTagOf[Id], false, lTagOf[Id])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val offset: FHIRComponentFieldMeta[Option[RelatedAction.OffsetChoice]] =
        FHIRComponentFieldMeta("offset", lTagOf[Option[RelatedAction.OffsetChoice]], true, lTagOf[UnionDurationOrRange])
      val relationship: FHIRComponentFieldMeta[ACTION_RELATIONSHIP_TYPE] =
        FHIRComponentFieldMeta("relationship", lTagOf[ACTION_RELATIONSHIP_TYPE], false, lTagOf[ACTION_RELATIONSHIP_TYPE])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, targetId, extension, offset, relationship, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: RelatedAction): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Id](targetId, t.targetId),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[RelatedAction.OffsetChoice]](offset, t.offset),
        FHIRComponentField[ACTION_RELATIONSHIP_TYPE](relationship, t.relationship),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[RelatedAction] = this
      val thisName: String                      = "RelatedAction"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[RelatedAction] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new RelatedAction(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Id]("targetId", None),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeOptRef[UnionDurationOrRange]("offset"),
              cursor.decodeAs[ACTION_RELATIONSHIP_TYPE]("relationship", None),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class RelatedAction(
        override val id: Option[String] = None,
        val targetId: Id,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val offset: Option[RelatedAction.OffsetChoice] = None,
        val relationship: ACTION_RELATIONSHIP_TYPE,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    type TimingChoice = Choice[Union01405873694]
    def apply(
        id: Option[String] = None,
        code: LitSeq[CodeableConcept] = LitSeq.empty,
        `type`: Option[CodeableConcept] = None,
        title: Option[String] = None,
        prefix: Option[String] = None,
        action: LitSeq[RequestGroup.Action] = LitSeq.empty,
        priority: Option[REQUEST_PRIORITY] = None,
        location: Option[CodeableReference] = None,
        resource: Option[Reference] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        timing: Option[Action.TimingChoice] = None,
        description: Option[String] = None,
        documentation: LitSeq[RelatedArtifact] = LitSeq.empty,
        textEquivalent: Option[String] = None,
        groupingBehavior: Option[ACTION_GROUPING_BEHAVIOR] = None,
        requiredBehavior: Option[ACTION_REQUIRED_BEHAVIOR] = None,
        precheckBehavior: Option[ACTION_PRECHECK_BEHAVIOR] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        selectionBehavior: Option[ACTION_SELECTION_BEHAVIOR] = None,
        cardinalityBehavior: Option[ACTION_CARDINALITY_BEHAVIOR] = None,
        condition: LitSeq[Action.Condition] = LitSeq.empty,
        participant: LitSeq[Action.Participant] = LitSeq.empty,
        relatedAction: LitSeq[Action.RelatedAction] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Action = new Action(
      id,
      code,
      `type`,
      title,
      prefix,
      action,
      priority,
      location,
      resource,
      extension,
      timing,
      description,
      documentation,
      textEquivalent,
      groupingBehavior,
      requiredBehavior,
      precheckBehavior,
      modifierExtension,
      selectionBehavior,
      cardinalityBehavior,
      condition,
      participant,
      relatedAction,
      primitiveAttributes = primitiveAttributes
    )
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val code: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("code", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val title: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("title", lTagOf[Option[String]], false, lTagOf[String])
    val prefix: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("prefix", lTagOf[Option[String]], false, lTagOf[String])
    val action: FHIRComponentFieldMeta[LitSeq[RequestGroup.Action]] =
      FHIRComponentFieldMeta("action", lTagOf[LitSeq[RequestGroup.Action]], false, lTagOf[RequestGroup.Action])
    val priority: FHIRComponentFieldMeta[Option[REQUEST_PRIORITY]] =
      FHIRComponentFieldMeta("priority", lTagOf[Option[REQUEST_PRIORITY]], false, lTagOf[REQUEST_PRIORITY])
    val location: FHIRComponentFieldMeta[Option[CodeableReference]] =
      FHIRComponentFieldMeta("location", lTagOf[Option[CodeableReference]], false, lTagOf[CodeableReference])
    val resource: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("resource", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val timing: FHIRComponentFieldMeta[Option[Action.TimingChoice]] =
      FHIRComponentFieldMeta("timing", lTagOf[Option[Action.TimingChoice]], true, lTagOf[Union01405873694])
    val description: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
    val documentation: FHIRComponentFieldMeta[LitSeq[RelatedArtifact]] =
      FHIRComponentFieldMeta("documentation", lTagOf[LitSeq[RelatedArtifact]], false, lTagOf[RelatedArtifact])
    val textEquivalent: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("textEquivalent", lTagOf[Option[String]], false, lTagOf[String])
    val groupingBehavior: FHIRComponentFieldMeta[Option[ACTION_GROUPING_BEHAVIOR]] =
      FHIRComponentFieldMeta(
        "groupingBehavior",
        lTagOf[Option[ACTION_GROUPING_BEHAVIOR]],
        false,
        lTagOf[ACTION_GROUPING_BEHAVIOR])
    val requiredBehavior: FHIRComponentFieldMeta[Option[ACTION_REQUIRED_BEHAVIOR]] =
      FHIRComponentFieldMeta(
        "requiredBehavior",
        lTagOf[Option[ACTION_REQUIRED_BEHAVIOR]],
        false,
        lTagOf[ACTION_REQUIRED_BEHAVIOR])
    val precheckBehavior: FHIRComponentFieldMeta[Option[ACTION_PRECHECK_BEHAVIOR]] =
      FHIRComponentFieldMeta(
        "precheckBehavior",
        lTagOf[Option[ACTION_PRECHECK_BEHAVIOR]],
        false,
        lTagOf[ACTION_PRECHECK_BEHAVIOR])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val selectionBehavior: FHIRComponentFieldMeta[Option[ACTION_SELECTION_BEHAVIOR]] =
      FHIRComponentFieldMeta(
        "selectionBehavior",
        lTagOf[Option[ACTION_SELECTION_BEHAVIOR]],
        false,
        lTagOf[ACTION_SELECTION_BEHAVIOR])
    val cardinalityBehavior: FHIRComponentFieldMeta[Option[ACTION_CARDINALITY_BEHAVIOR]] =
      FHIRComponentFieldMeta(
        "cardinalityBehavior",
        lTagOf[Option[ACTION_CARDINALITY_BEHAVIOR]],
        false,
        lTagOf[ACTION_CARDINALITY_BEHAVIOR])
    val condition: FHIRComponentFieldMeta[LitSeq[Action.Condition]] =
      FHIRComponentFieldMeta("condition", lTagOf[LitSeq[Action.Condition]], false, lTagOf[Action.Condition])
    val participant: FHIRComponentFieldMeta[LitSeq[Action.Participant]] =
      FHIRComponentFieldMeta("participant", lTagOf[LitSeq[Action.Participant]], false, lTagOf[Action.Participant])
    val relatedAction: FHIRComponentFieldMeta[LitSeq[Action.RelatedAction]] =
      FHIRComponentFieldMeta("relatedAction", lTagOf[LitSeq[Action.RelatedAction]], false, lTagOf[Action.RelatedAction])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
      id,
      code,
      `type`,
      title,
      prefix,
      action,
      priority,
      location,
      resource,
      extension,
      timing,
      description,
      documentation,
      textEquivalent,
      groupingBehavior,
      requiredBehavior,
      precheckBehavior,
      modifierExtension,
      selectionBehavior,
      cardinalityBehavior,
      condition,
      participant,
      relatedAction
    )
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Action): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[CodeableConcept]](code, t.code),
      FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[Option[String]](title, t.title),
      FHIRComponentField[Option[String]](prefix, t.prefix),
      FHIRComponentField[LitSeq[RequestGroup.Action]](action, t.action),
      FHIRComponentField[Option[REQUEST_PRIORITY]](priority, t.priority),
      FHIRComponentField[Option[CodeableReference]](location, t.location),
      FHIRComponentField[Option[Reference]](resource, t.resource),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Action.TimingChoice]](timing, t.timing),
      FHIRComponentField[Option[String]](description, t.description),
      FHIRComponentField[LitSeq[RelatedArtifact]](documentation, t.documentation),
      FHIRComponentField[Option[String]](textEquivalent, t.textEquivalent),
      FHIRComponentField[Option[ACTION_GROUPING_BEHAVIOR]](groupingBehavior, t.groupingBehavior),
      FHIRComponentField[Option[ACTION_REQUIRED_BEHAVIOR]](requiredBehavior, t.requiredBehavior),
      FHIRComponentField[Option[ACTION_PRECHECK_BEHAVIOR]](precheckBehavior, t.precheckBehavior),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[ACTION_SELECTION_BEHAVIOR]](selectionBehavior, t.selectionBehavior),
      FHIRComponentField[Option[ACTION_CARDINALITY_BEHAVIOR]](cardinalityBehavior, t.cardinalityBehavior),
      FHIRComponentField[LitSeq[Action.Condition]](condition, t.condition),
      FHIRComponentField[LitSeq[Action.Participant]](participant, t.participant),
      FHIRComponentField[LitSeq[Action.RelatedAction]](relatedAction, t.relatedAction)
    )
    val baseType: CompanionFor[Action] = this
    val thisName: String               = "Action"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Action] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Action(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("code", Some(LitSeq.empty)),
            cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
            cursor.decodeAs[Option[String]]("title", Some(None)),
            cursor.decodeAs[Option[String]]("prefix", Some(None)),
            cursor.decodeAs[LitSeq[RequestGroup.Action]]("action", Some(LitSeq.empty)),
            cursor.decodeAs[Option[REQUEST_PRIORITY]]("priority", Some(None)),
            cursor.decodeAs[Option[CodeableReference]]("location", Some(None)),
            cursor.decodeAs[Option[Reference]]("resource", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeOptRef[Union01405873694]("timing"),
            cursor.decodeAs[Option[String]]("description", Some(None)),
            cursor.decodeAs[LitSeq[RelatedArtifact]]("documentation", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("textEquivalent", Some(None)),
            cursor.decodeAs[Option[ACTION_GROUPING_BEHAVIOR]]("groupingBehavior", Some(None)),
            cursor.decodeAs[Option[ACTION_REQUIRED_BEHAVIOR]]("requiredBehavior", Some(None)),
            cursor.decodeAs[Option[ACTION_PRECHECK_BEHAVIOR]]("precheckBehavior", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[ACTION_SELECTION_BEHAVIOR]]("selectionBehavior", Some(None)),
            cursor.decodeAs[Option[ACTION_CARDINALITY_BEHAVIOR]]("cardinalityBehavior", Some(None)),
            cursor.decodeAs[LitSeq[Action.Condition]]("condition", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Action.Participant]]("participant", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Action.RelatedAction]]("relatedAction", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Action(
      override val id: Option[String] = None,
      val code: LitSeq[CodeableConcept] = LitSeq.empty,
      val `type`: Option[CodeableConcept] = None,
      val title: Option[String] = None,
      val prefix: Option[String] = None,
      val action: LitSeq[RequestGroup.Action] = LitSeq.empty,
      val priority: Option[REQUEST_PRIORITY] = None,
      val location: Option[CodeableReference] = None,
      val resource: Option[Reference] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val timing: Option[Action.TimingChoice] = None,
      val description: Option[String] = None,
      val documentation: LitSeq[RelatedArtifact] = LitSeq.empty,
      val textEquivalent: Option[String] = None,
      val groupingBehavior: Option[ACTION_GROUPING_BEHAVIOR] = None,
      val requiredBehavior: Option[ACTION_REQUIRED_BEHAVIOR] = None,
      val precheckBehavior: Option[ACTION_PRECHECK_BEHAVIOR] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val selectionBehavior: Option[ACTION_SELECTION_BEHAVIOR] = None,
      val cardinalityBehavior: Option[ACTION_CARDINALITY_BEHAVIOR] = None,
      val condition: LitSeq[Action.Condition] = LitSeq.empty,
      val participant: LitSeq[Action.Participant] = LitSeq.empty,
      val relatedAction: LitSeq[Action.RelatedAction] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      code: Option[CodeableConcept] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      status: REQUEST_STATUS,
      intent: REQUEST_INTENT,
      author: Option[Reference] = None,
      reason: LitSeq[CodeableReference] = LitSeq.empty,
      basedOn: LitSeq[Reference] = LitSeq.empty,
      subject: Option[Reference] = None,
      language: Option[LANGUAGES] = None,
      replaces: LitSeq[Reference] = LitSeq.empty,
      priority: Option[REQUEST_PRIORITY] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      encounter: Option[Reference] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      authoredOn: Option[FHIRDateTime] = None,
      implicitRules: Option[UriStr] = None,
      instantiatesUri: LitSeq[UriStr] = LitSeq.empty,
      groupIdentifier: Option[Identifier] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      instantiatesCanonical: LitSeq[Canonical] = LitSeq.empty,
      action: LitSeq[RequestGroup.Action] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): RequestGroup = new RequestGroup(
    id,
    meta,
    text,
    code,
    note,
    status,
    intent,
    author,
    reason,
    basedOn,
    subject,
    language,
    replaces,
    priority,
    contained,
    extension,
    encounter,
    identifier,
    authoredOn,
    implicitRules,
    instantiatesUri,
    groupIdentifier,
    modifierExtension,
    instantiatesCanonical,
    action,
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
  val status: FHIRComponentFieldMeta[REQUEST_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[REQUEST_STATUS], false, lTagOf[REQUEST_STATUS])
  val intent: FHIRComponentFieldMeta[REQUEST_INTENT] =
    FHIRComponentFieldMeta("intent", lTagOf[REQUEST_INTENT], false, lTagOf[REQUEST_INTENT])
  val author: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("author", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val reason: FHIRComponentFieldMeta[LitSeq[CodeableReference]] =
    FHIRComponentFieldMeta("reason", lTagOf[LitSeq[CodeableReference]], false, lTagOf[CodeableReference])
  val basedOn: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("basedOn", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val subject: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("subject", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val replaces: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("replaces", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val priority: FHIRComponentFieldMeta[Option[REQUEST_PRIORITY]] =
    FHIRComponentFieldMeta("priority", lTagOf[Option[REQUEST_PRIORITY]], false, lTagOf[REQUEST_PRIORITY])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val encounter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("encounter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val authoredOn: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("authoredOn", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val instantiatesUri: FHIRComponentFieldMeta[LitSeq[UriStr]] =
    FHIRComponentFieldMeta("instantiatesUri", lTagOf[LitSeq[UriStr]], false, lTagOf[UriStr])
  val groupIdentifier: FHIRComponentFieldMeta[Option[Identifier]] =
    FHIRComponentFieldMeta("groupIdentifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val instantiatesCanonical: FHIRComponentFieldMeta[LitSeq[Canonical]] =
    FHIRComponentFieldMeta("instantiatesCanonical", lTagOf[LitSeq[Canonical]], false, lTagOf[Canonical])
  val action: FHIRComponentFieldMeta[LitSeq[RequestGroup.Action]] =
    FHIRComponentFieldMeta("action", lTagOf[LitSeq[RequestGroup.Action]], false, lTagOf[RequestGroup.Action])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    code,
    note,
    status,
    intent,
    author,
    reason,
    basedOn,
    subject,
    language,
    replaces,
    priority,
    contained,
    extension,
    encounter,
    identifier,
    authoredOn,
    implicitRules,
    instantiatesUri,
    groupIdentifier,
    modifierExtension,
    instantiatesCanonical,
    action
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: RequestGroup): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[CodeableConcept]](code, t.code),
    FHIRComponentField[LitSeq[Annotation]](note, t.note),
    FHIRComponentField[REQUEST_STATUS](status, t.status),
    FHIRComponentField[REQUEST_INTENT](intent, t.intent),
    FHIRComponentField[Option[Reference]](author, t.author),
    FHIRComponentField[LitSeq[CodeableReference]](reason, t.reason),
    FHIRComponentField[LitSeq[Reference]](basedOn, t.basedOn),
    FHIRComponentField[Option[Reference]](subject, t.subject),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Reference]](replaces, t.replaces),
    FHIRComponentField[Option[REQUEST_PRIORITY]](priority, t.priority),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Reference]](encounter, t.encounter),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[FHIRDateTime]](authoredOn, t.authoredOn),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[UriStr]](instantiatesUri, t.instantiatesUri),
    FHIRComponentField[Option[Identifier]](groupIdentifier, t.groupIdentifier),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[Canonical]](instantiatesCanonical, t.instantiatesCanonical),
    FHIRComponentField[LitSeq[RequestGroup.Action]](action, t.action)
  )
  def extractId(t: RequestGroup): Option[String]                       = t.id
  def extractMeta(t: RequestGroup): Option[Meta]                       = t.meta
  def extractText(t: RequestGroup): Option[Narrative]                  = t.text
  def extractCode(t: RequestGroup): Option[CodeableConcept]            = t.code
  def extractNote(t: RequestGroup): LitSeq[Annotation]                 = t.note
  def extractStatus(t: RequestGroup): REQUEST_STATUS                   = t.status
  def extractIntent(t: RequestGroup): REQUEST_INTENT                   = t.intent
  def extractAuthor(t: RequestGroup): Option[Reference]                = t.author
  def extractReason(t: RequestGroup): LitSeq[CodeableReference]        = t.reason
  def extractBasedOn(t: RequestGroup): LitSeq[Reference]               = t.basedOn
  def extractSubject(t: RequestGroup): Option[Reference]               = t.subject
  def extractLanguage(t: RequestGroup): Option[LANGUAGES]              = t.language
  def extractReplaces(t: RequestGroup): LitSeq[Reference]              = t.replaces
  def extractPriority(t: RequestGroup): Option[REQUEST_PRIORITY]       = t.priority
  def extractContained(t: RequestGroup): LitSeq[Resource]              = t.contained
  def extractExtension(t: RequestGroup): LitSeq[Extension]             = t.extension
  def extractEncounter(t: RequestGroup): Option[Reference]             = t.encounter
  def extractIdentifier(t: RequestGroup): LitSeq[Identifier]           = t.identifier
  def extractAuthoredOn(t: RequestGroup): Option[FHIRDateTime]         = t.authoredOn
  def extractImplicitRules(t: RequestGroup): Option[UriStr]            = t.implicitRules
  def extractInstantiatesUri(t: RequestGroup): LitSeq[UriStr]          = t.instantiatesUri
  def extractGroupIdentifier(t: RequestGroup): Option[Identifier]      = t.groupIdentifier
  def extractModifierExtension(t: RequestGroup): LitSeq[Extension]     = t.modifierExtension
  def extractInstantiatesCanonical(t: RequestGroup): LitSeq[Canonical] = t.instantiatesCanonical
  def extractAction(t: RequestGroup): LitSeq[RequestGroup.Action]      = t.action
  override val thisName: String                                        = "RequestGroup"
  override val searchParams: Map[String, RequestGroup => Seq[Any]] = Map(
    "participant"            -> (obj => obj.action.flatMap(_.participant).flatMap(_.actor).toSeq),
    "author"                 -> (obj => obj.author.toSeq),
    "priority"               -> (obj => obj.priority.toSeq),
    "group-identifier"       -> (obj => obj.groupIdentifier.toSeq),
    "subject"                -> (obj => obj.subject.toSeq),
    "intent"                 -> (obj => Seq(obj.intent)),
    "code"                   -> (obj => obj.code.toSeq),
    "status"                 -> (obj => Seq(obj.status)),
    "authored"               -> (obj => obj.authoredOn.toSeq),
    "encounter"              -> (obj => obj.encounter.toSeq),
    "instantiates-uri"       -> (obj => obj.instantiatesUri.toSeq),
    "identifier"             -> (obj => obj.identifier.toSeq),
    "instantiates-canonical" -> (obj => obj.instantiatesCanonical.toSeq),
    "patient"                -> (obj => obj.subject.filter(_.reference.exists(_.contains("Patient/"))).toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[RequestGroup] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new RequestGroup(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("code", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[REQUEST_STATUS]("status", None),
          cursor.decodeAs[REQUEST_INTENT]("intent", None),
          cursor.decodeAs[Option[Reference]]("author", Some(None)),
          cursor.decodeAs[LitSeq[CodeableReference]]("reason", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("basedOn", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("subject", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("replaces", Some(LitSeq.empty)),
          cursor.decodeAs[Option[REQUEST_PRIORITY]]("priority", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[FHIRDateTime]]("authoredOn", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[UriStr]]("instantiatesUri", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Identifier]]("groupIdentifier", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Canonical]]("instantiatesCanonical", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[RequestGroup.Action]]("action", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** A group of related requests that can be used to capture intended activities that have inter-dependencies such as "give this
  * medication after that one".
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields code, note, status, intent, author, reason, basedOn, subject, replaces, priority, encounter,
  *   identifier, authoredOn, instantiatesUri, groupIdentifier, instantiatesCanonical, action.
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
  *   - A code that identifies what the overall request group is.
  * @param note
  *   - Provides a mechanism to communicate additional information about the response.
  * @param status
  *   - The current state of the request. For request groups, the status reflects the status of all the requests in the group.
  * @param intent
  *   - Indicates the level of authority/intentionality associated with the request and where the request fits into the workflow
  *   chain.
  * @param author
  *   - Provides a reference to the author of the request group.
  * @param reason
  *   - Describes the reason for the request group in coded or textual form.
  * @param basedOn
  *   - A plan, proposal or order that is fulfilled in whole or in part by this request.
  * @param subject
  *   - The subject for which the request group was created.
  * @param language
  *   - The base language in which the resource is written.
  * @param replaces
  *   - Completed or terminated request(s) whose function is taken by this new request.
  * @param priority
  *   - Indicates how quickly the request should be addressed with respect to other requests.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param encounter
  *   - Describes the context of the request group, if any.
  * @param identifier
  *   - Allows a service to provide a unique, business identifier for the request.
  * @param authoredOn
  *   - Indicates when the request group was created.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param instantiatesUri
  *   - A URL referencing an externally defined protocol, guideline, orderset or other definition that is adhered to in whole or
  *   in part by this request.
  * @param groupIdentifier
  *   - A shared identifier common to all requests that were authorized more or less simultaneously by a single author,
  *   representing the identifier of the requisition, prescription or similar form.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *   the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually
  *   modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict
  *   set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param instantiatesCanonical
  *   - A canonical URL referencing a FHIR-defined protocol, guideline, orderset or other definition that is adhered to in whole
  *   or in part by this request.
  * @param action
  *   - The actions, if any, produced by the evaluation of the artifact.
  */
@POJOBoilerplate
class RequestGroup(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val code: Option[CodeableConcept] = None,
    val note: LitSeq[Annotation] = LitSeq.empty,
    val status: REQUEST_STATUS,
    val intent: REQUEST_INTENT,
    val author: Option[Reference] = None,
    val reason: LitSeq[CodeableReference] = LitSeq.empty,
    val basedOn: LitSeq[Reference] = LitSeq.empty,
    val subject: Option[Reference] = None,
    override val language: Option[LANGUAGES] = None,
    val replaces: LitSeq[Reference] = LitSeq.empty,
    val priority: Option[REQUEST_PRIORITY] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val encounter: Option[Reference] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val authoredOn: Option[FHIRDateTime] = None,
    override val implicitRules: Option[UriStr] = None,
    val instantiatesUri: LitSeq[UriStr] = LitSeq.empty,
    val groupIdentifier: Option[Identifier] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val instantiatesCanonical: LitSeq[Canonical] = LitSeq.empty,
    val action: LitSeq[RequestGroup.Action] = LitSeq.empty,
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
  override val thisTypeName: String = "RequestGroup"
}
