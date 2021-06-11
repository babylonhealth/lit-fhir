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
  PUBLICATION_STATUS,
  ACTION_CONDITION_KIND,
  ACTION_GROUPING_BEHAVIOR,
  ACTION_REQUIRED_BEHAVIOR,
  ACTION_PARTICIPANT_TYPE,
  ACTION_PRECHECK_BEHAVIOR,
  REQUEST_PRIORITY,
  ACTION_RELATIONSHIP_TYPE
}
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object PlanDefinition extends CompanionFor[PlanDefinition] {
  override type ResourceType = PlanDefinition
  override type ParentType   = PlanDefinition
  override val baseType: CompanionFor[ResourceType] = PlanDefinition
  override val parentType: CompanionFor[ParentType] = PlanDefinition
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/PlanDefinition")
  object Action extends CompanionFor[Action] {
    override type ResourceType = Action
    override type ParentType   = Action
    override val parentType: CompanionFor[ResourceType] = Action
    object Condition extends CompanionFor[Condition] {
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
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, kind, extension, expression, modifierExtension)
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
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object Participant extends CompanionFor[Participant] {
      override type ResourceType = Participant
      override type ParentType   = Participant
      override val parentType: CompanionFor[ResourceType] = Participant
      def apply(
          id: Option[String] = None,
          `type`: ACTION_PARTICIPANT_TYPE,
          role: Option[CodeableConcept] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Participant = new Participant(
        id,
        `type`,
        role,
        extension,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Participant): Option[(Option[String], ACTION_PARTICIPANT_TYPE, Option[CodeableConcept], LitSeq[Extension], LitSeq[Extension])] =
        Some((o.id, o.`type`, o.role, o.extension, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val `type`: FHIRComponentFieldMeta[ACTION_PARTICIPANT_TYPE] =
        FHIRComponentFieldMeta("type", lTagOf[ACTION_PARTICIPANT_TYPE], false, lTagOf[ACTION_PARTICIPANT_TYPE])
      val role: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("role", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, `type`, role, extension, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Participant): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[ACTION_PARTICIPANT_TYPE](`type`, t.`type`),
        FHIRComponentField[Option[CodeableConcept]](role, t.role),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Participant] = this
      val thisName: String                    = "Participant"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Participant] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Participant(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[ACTION_PARTICIPANT_TYPE]("type", None),
              cursor.decodeAs[Option[CodeableConcept]]("role", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Participant(
        override val id: Option[String] = None,
        val `type`: ACTION_PARTICIPANT_TYPE,
        val role: Option[CodeableConcept] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object DynamicValue extends CompanionFor[DynamicValue] {
      override type ResourceType = DynamicValue
      override type ParentType   = DynamicValue
      override val parentType: CompanionFor[ResourceType] = DynamicValue
      def apply(
          id: Option[String] = None,
          path: Option[String] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          expression: Option[Expression] = None,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): DynamicValue = new DynamicValue(
        id,
        path,
        extension,
        expression,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: DynamicValue): Option[(Option[String], Option[String], LitSeq[Extension], Option[Expression], LitSeq[Extension])] =
        Some((o.id, o.path, o.extension, o.expression, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val path: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("path", lTagOf[Option[String]], false, lTagOf[String])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val expression: FHIRComponentFieldMeta[Option[Expression]] =
        FHIRComponentFieldMeta("expression", lTagOf[Option[Expression]], false, lTagOf[Expression])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, path, extension, expression, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: DynamicValue): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[String]](path, t.path),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[Expression]](expression, t.expression),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[DynamicValue] = this
      val thisName: String                     = "DynamicValue"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[DynamicValue] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new DynamicValue(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[String]]("path", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[Expression]]("expression", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class DynamicValue(
        override val id: Option[String] = None,
        val path: Option[String] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val expression: Option[Expression] = None,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object RelatedAction extends CompanionFor[RelatedAction] {
      override type ResourceType = RelatedAction
      override type ParentType   = RelatedAction
      override val parentType: CompanionFor[ResourceType] = RelatedAction
      type OffsetChoice = Choice[Union00801828838]
      def apply(
          id: Option[String] = None,
          actionId: Id,
          extension: LitSeq[Extension] = LitSeq.empty,
          offset: Option[RelatedAction.OffsetChoice] = None,
          relationship: ACTION_RELATIONSHIP_TYPE,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): RelatedAction = new RelatedAction(
        id,
        actionId,
        extension,
        offset,
        relationship,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: RelatedAction): Option[(Option[String], Id, LitSeq[Extension], Option[RelatedAction.OffsetChoice], ACTION_RELATIONSHIP_TYPE, LitSeq[Extension])] =
        Some((o.id, o.actionId, o.extension, o.offset, o.relationship, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val actionId: FHIRComponentFieldMeta[Id] =
        FHIRComponentFieldMeta("actionId", lTagOf[Id], false, lTagOf[Id])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val offset: FHIRComponentFieldMeta[Option[RelatedAction.OffsetChoice]] =
        FHIRComponentFieldMeta("offset", lTagOf[Option[RelatedAction.OffsetChoice]], true, lTagOf[Union00801828838])
      val relationship: FHIRComponentFieldMeta[ACTION_RELATIONSHIP_TYPE] =
        FHIRComponentFieldMeta(
          "relationship",
          lTagOf[ACTION_RELATIONSHIP_TYPE],
          false,
          lTagOf[ACTION_RELATIONSHIP_TYPE])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
        Seq(id, actionId, extension, offset, relationship, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: RelatedAction): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Id](actionId, t.actionId),
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
              cursor.decodeAs[Id]("actionId", None),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeOptRef[Union00801828838]("offset"),
              cursor.decodeAs[ACTION_RELATIONSHIP_TYPE]("relationship", None),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class RelatedAction(
        override val id: Option[String] = None,
        val actionId: Id,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val offset: Option[RelatedAction.OffsetChoice] = None,
        val relationship: ACTION_RELATIONSHIP_TYPE,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    type TimingChoice     = Choice[Union_0181779868]
    type SubjectChoice    = Choice[Union01025009075]
    type DefinitionChoice = Choice[Union00545979821]
    def apply(
        id: Option[String] = None,
        code: LitSeq[CodeableConcept] = LitSeq.empty,
        `type`: Option[CodeableConcept] = None,
        title: Option[String] = None,
        input: LitSeq[DataRequirement] = LitSeq.empty,
        prefix: Option[String] = None,
        reason: LitSeq[CodeableConcept] = LitSeq.empty,
        goalId: LitSeq[Id] = LitSeq.empty,
        output: LitSeq[DataRequirement] = LitSeq.empty,
        action: LitSeq[PlanDefinition.Action] = LitSeq.empty,
        trigger: LitSeq[TriggerDefinition] = LitSeq.empty,
        priority: Option[REQUEST_PRIORITY] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        timing: Option[Action.TimingChoice] = None,
        transform: Option[Canonical] = None,
        subject: Option[Action.SubjectChoice] = None,
        description: Option[String] = None,
        documentation: LitSeq[RelatedArtifact] = LitSeq.empty,
        definition: Option[Action.DefinitionChoice] = None,
        textEquivalent: Option[String] = None,
        groupingBehavior: Option[ACTION_GROUPING_BEHAVIOR] = None,
        requiredBehavior: Option[ACTION_REQUIRED_BEHAVIOR] = None,
        precheckBehavior: Option[ACTION_PRECHECK_BEHAVIOR] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        selectionBehavior: Option[ACTION_SELECTION_BEHAVIOR] = None,
        cardinalityBehavior: Option[ACTION_CARDINALITY_BEHAVIOR] = None,
        condition: LitSeq[Action.Condition] = LitSeq.empty,
        participant: LitSeq[Action.Participant] = LitSeq.empty,
        dynamicValue: LitSeq[Action.DynamicValue] = LitSeq.empty,
        relatedAction: LitSeq[Action.RelatedAction] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Action = new Action(
      id,
      code,
      `type`,
      title,
      input,
      prefix,
      reason,
      goalId,
      output,
      action,
      trigger,
      priority,
      extension,
      timing,
      transform,
      subject,
      description,
      documentation,
      definition,
      textEquivalent,
      groupingBehavior,
      requiredBehavior,
      precheckBehavior,
      modifierExtension,
      selectionBehavior,
      cardinalityBehavior,
      condition,
      participant,
      dynamicValue,
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
    val input: FHIRComponentFieldMeta[LitSeq[DataRequirement]] =
      FHIRComponentFieldMeta("input", lTagOf[LitSeq[DataRequirement]], false, lTagOf[DataRequirement])
    val prefix: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("prefix", lTagOf[Option[String]], false, lTagOf[String])
    val reason: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("reason", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val goalId: FHIRComponentFieldMeta[LitSeq[Id]] =
      FHIRComponentFieldMeta("goalId", lTagOf[LitSeq[Id]], false, lTagOf[Id])
    val output: FHIRComponentFieldMeta[LitSeq[DataRequirement]] =
      FHIRComponentFieldMeta("output", lTagOf[LitSeq[DataRequirement]], false, lTagOf[DataRequirement])
    val action: FHIRComponentFieldMeta[LitSeq[PlanDefinition.Action]] =
      FHIRComponentFieldMeta("action", lTagOf[LitSeq[PlanDefinition.Action]], false, lTagOf[PlanDefinition.Action])
    val trigger: FHIRComponentFieldMeta[LitSeq[TriggerDefinition]] =
      FHIRComponentFieldMeta("trigger", lTagOf[LitSeq[TriggerDefinition]], false, lTagOf[TriggerDefinition])
    val priority: FHIRComponentFieldMeta[Option[REQUEST_PRIORITY]] =
      FHIRComponentFieldMeta("priority", lTagOf[Option[REQUEST_PRIORITY]], false, lTagOf[REQUEST_PRIORITY])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val timing: FHIRComponentFieldMeta[Option[Action.TimingChoice]] =
      FHIRComponentFieldMeta("timing", lTagOf[Option[Action.TimingChoice]], true, lTagOf[Union_0181779868])
    val transform: FHIRComponentFieldMeta[Option[Canonical]] =
      FHIRComponentFieldMeta("transform", lTagOf[Option[Canonical]], false, lTagOf[Canonical])
    val subject: FHIRComponentFieldMeta[Option[Action.SubjectChoice]] =
      FHIRComponentFieldMeta("subject", lTagOf[Option[Action.SubjectChoice]], true, lTagOf[Union01025009075])
    val description: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
    val documentation: FHIRComponentFieldMeta[LitSeq[RelatedArtifact]] =
      FHIRComponentFieldMeta("documentation", lTagOf[LitSeq[RelatedArtifact]], false, lTagOf[RelatedArtifact])
    val definition: FHIRComponentFieldMeta[Option[Action.DefinitionChoice]] =
      FHIRComponentFieldMeta("definition", lTagOf[Option[Action.DefinitionChoice]], true, lTagOf[Union00545979821])
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
    val dynamicValue: FHIRComponentFieldMeta[LitSeq[Action.DynamicValue]] =
      FHIRComponentFieldMeta("dynamicValue", lTagOf[LitSeq[Action.DynamicValue]], false, lTagOf[Action.DynamicValue])
    val relatedAction: FHIRComponentFieldMeta[LitSeq[Action.RelatedAction]] =
      FHIRComponentFieldMeta("relatedAction", lTagOf[LitSeq[Action.RelatedAction]], false, lTagOf[Action.RelatedAction])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
      id,
      code,
      `type`,
      title,
      input,
      prefix,
      reason,
      goalId,
      output,
      action,
      trigger,
      priority,
      extension,
      timing,
      transform,
      subject,
      description,
      documentation,
      definition,
      textEquivalent,
      groupingBehavior,
      requiredBehavior,
      precheckBehavior,
      modifierExtension,
      selectionBehavior,
      cardinalityBehavior,
      condition,
      participant,
      dynamicValue,
      relatedAction
    )
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Action): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[CodeableConcept]](code, t.code),
      FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[Option[String]](title, t.title),
      FHIRComponentField[LitSeq[DataRequirement]](input, t.input),
      FHIRComponentField[Option[String]](prefix, t.prefix),
      FHIRComponentField[LitSeq[CodeableConcept]](reason, t.reason),
      FHIRComponentField[LitSeq[Id]](goalId, t.goalId),
      FHIRComponentField[LitSeq[DataRequirement]](output, t.output),
      FHIRComponentField[LitSeq[PlanDefinition.Action]](action, t.action),
      FHIRComponentField[LitSeq[TriggerDefinition]](trigger, t.trigger),
      FHIRComponentField[Option[REQUEST_PRIORITY]](priority, t.priority),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Action.TimingChoice]](timing, t.timing),
      FHIRComponentField[Option[Canonical]](transform, t.transform),
      FHIRComponentField[Option[Action.SubjectChoice]](subject, t.subject),
      FHIRComponentField[Option[String]](description, t.description),
      FHIRComponentField[LitSeq[RelatedArtifact]](documentation, t.documentation),
      FHIRComponentField[Option[Action.DefinitionChoice]](definition, t.definition),
      FHIRComponentField[Option[String]](textEquivalent, t.textEquivalent),
      FHIRComponentField[Option[ACTION_GROUPING_BEHAVIOR]](groupingBehavior, t.groupingBehavior),
      FHIRComponentField[Option[ACTION_REQUIRED_BEHAVIOR]](requiredBehavior, t.requiredBehavior),
      FHIRComponentField[Option[ACTION_PRECHECK_BEHAVIOR]](precheckBehavior, t.precheckBehavior),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[ACTION_SELECTION_BEHAVIOR]](selectionBehavior, t.selectionBehavior),
      FHIRComponentField[Option[ACTION_CARDINALITY_BEHAVIOR]](cardinalityBehavior, t.cardinalityBehavior),
      FHIRComponentField[LitSeq[Action.Condition]](condition, t.condition),
      FHIRComponentField[LitSeq[Action.Participant]](participant, t.participant),
      FHIRComponentField[LitSeq[Action.DynamicValue]](dynamicValue, t.dynamicValue),
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
            cursor.decodeAs[LitSeq[DataRequirement]]("input", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("prefix", Some(None)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("reason", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Id]]("goalId", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[DataRequirement]]("output", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[PlanDefinition.Action]]("action", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[TriggerDefinition]]("trigger", Some(LitSeq.empty)),
            cursor.decodeAs[Option[REQUEST_PRIORITY]]("priority", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeOptRef[Union_0181779868]("timing"),
            cursor.decodeAs[Option[Canonical]]("transform", Some(None)),
            cursor.decodeOptRef[Union01025009075]("subject"),
            cursor.decodeAs[Option[String]]("description", Some(None)),
            cursor.decodeAs[LitSeq[RelatedArtifact]]("documentation", Some(LitSeq.empty)),
            cursor.decodeOptRef[Union00545979821]("definition"),
            cursor.decodeAs[Option[String]]("textEquivalent", Some(None)),
            cursor.decodeAs[Option[ACTION_GROUPING_BEHAVIOR]]("groupingBehavior", Some(None)),
            cursor.decodeAs[Option[ACTION_REQUIRED_BEHAVIOR]]("requiredBehavior", Some(None)),
            cursor.decodeAs[Option[ACTION_PRECHECK_BEHAVIOR]]("precheckBehavior", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[ACTION_SELECTION_BEHAVIOR]]("selectionBehavior", Some(None)),
            cursor.decodeAs[Option[ACTION_CARDINALITY_BEHAVIOR]]("cardinalityBehavior", Some(None)),
            cursor.decodeAs[LitSeq[Action.Condition]]("condition", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Action.Participant]]("participant", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Action.DynamicValue]]("dynamicValue", Some(LitSeq.empty)),
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
      val input: LitSeq[DataRequirement] = LitSeq.empty,
      val prefix: Option[String] = None,
      val reason: LitSeq[CodeableConcept] = LitSeq.empty,
      val goalId: LitSeq[Id] = LitSeq.empty,
      val output: LitSeq[DataRequirement] = LitSeq.empty,
      val action: LitSeq[PlanDefinition.Action] = LitSeq.empty,
      val trigger: LitSeq[TriggerDefinition] = LitSeq.empty,
      val priority: Option[REQUEST_PRIORITY] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val timing: Option[Action.TimingChoice] = None,
      val transform: Option[Canonical] = None,
      val subject: Option[Action.SubjectChoice] = None,
      val description: Option[String] = None,
      val documentation: LitSeq[RelatedArtifact] = LitSeq.empty,
      val definition: Option[Action.DefinitionChoice] = None,
      val textEquivalent: Option[String] = None,
      val groupingBehavior: Option[ACTION_GROUPING_BEHAVIOR] = None,
      val requiredBehavior: Option[ACTION_REQUIRED_BEHAVIOR] = None,
      val precheckBehavior: Option[ACTION_PRECHECK_BEHAVIOR] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val selectionBehavior: Option[ACTION_SELECTION_BEHAVIOR] = None,
      val cardinalityBehavior: Option[ACTION_CARDINALITY_BEHAVIOR] = None,
      val condition: LitSeq[Action.Condition] = LitSeq.empty,
      val participant: LitSeq[Action.Participant] = LitSeq.empty,
      val dynamicValue: LitSeq[Action.DynamicValue] = LitSeq.empty,
      val relatedAction: LitSeq[Action.RelatedAction] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Goal extends CompanionFor[Goal] {
    override type ResourceType = Goal
    override type ParentType   = Goal
    override val parentType: CompanionFor[ResourceType] = Goal
    object Target extends CompanionFor[Target] {
      override type ResourceType = Target
      override type ParentType   = Target
      override val parentType: CompanionFor[ResourceType] = Target
      type DetailChoice = Choice[Union01560785079]
      def apply(
          id: Option[String] = None,
          due: Option[Duration] = None,
          measure: Option[CodeableConcept] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          detail: Option[Target.DetailChoice] = None,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Target = new Target(
        id,
        due,
        measure,
        extension,
        detail,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Target): Option[(Option[String], Option[Duration], Option[CodeableConcept], LitSeq[Extension], Option[Target.DetailChoice], LitSeq[Extension])] =
        Some((o.id, o.due, o.measure, o.extension, o.detail, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val due: FHIRComponentFieldMeta[Option[Duration]] =
        FHIRComponentFieldMeta("due", lTagOf[Option[Duration]], false, lTagOf[Duration])
      val measure: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("measure", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val detail: FHIRComponentFieldMeta[Option[Target.DetailChoice]] =
        FHIRComponentFieldMeta("detail", lTagOf[Option[Target.DetailChoice]], true, lTagOf[Union01560785079])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, due, measure, extension, detail, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Target): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[Duration]](due, t.due),
        FHIRComponentField[Option[CodeableConcept]](measure, t.measure),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[Target.DetailChoice]](detail, t.detail),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Target] = this
      val thisName: String               = "Target"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Target] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Target(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[Duration]]("due", Some(None)),
              cursor.decodeAs[Option[CodeableConcept]]("measure", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeOptRef[Union01560785079]("detail"),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Target(
        override val id: Option[String] = None,
        val due: Option[Duration] = None,
        val measure: Option[CodeableConcept] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val detail: Option[Target.DetailChoice] = None,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        start: Option[CodeableConcept] = None,
        category: Option[CodeableConcept] = None,
        priority: Option[CodeableConcept] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        addresses: LitSeq[CodeableConcept] = LitSeq.empty,
        description: CodeableConcept,
        documentation: LitSeq[RelatedArtifact] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        target: LitSeq[Goal.Target] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Goal = new Goal(
      id,
      start,
      category,
      priority,
      extension,
      addresses,
      description,
      documentation,
      modifierExtension,
      target,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Goal): Option[(Option[String], Option[CodeableConcept], Option[CodeableConcept], Option[CodeableConcept], LitSeq[Extension], LitSeq[CodeableConcept], CodeableConcept, LitSeq[RelatedArtifact], LitSeq[Extension], LitSeq[Goal.Target])] =
      Some(
        (
          o.id,
          o.start,
          o.category,
          o.priority,
          o.extension,
          o.addresses,
          o.description,
          o.documentation,
          o.modifierExtension,
          o.target))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val start: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("start", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val category: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("category", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val priority: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("priority", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val addresses: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("addresses", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val description: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("description", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val documentation: FHIRComponentFieldMeta[LitSeq[RelatedArtifact]] =
      FHIRComponentFieldMeta("documentation", lTagOf[LitSeq[RelatedArtifact]], false, lTagOf[RelatedArtifact])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val target: FHIRComponentFieldMeta[LitSeq[Goal.Target]] =
      FHIRComponentFieldMeta("target", lTagOf[LitSeq[Goal.Target]], false, lTagOf[Goal.Target])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, start, category, priority, extension, addresses, description, documentation, modifierExtension, target)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Goal): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](start, t.start),
      FHIRComponentField[Option[CodeableConcept]](category, t.category),
      FHIRComponentField[Option[CodeableConcept]](priority, t.priority),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[CodeableConcept]](addresses, t.addresses),
      FHIRComponentField[CodeableConcept](description, t.description),
      FHIRComponentField[LitSeq[RelatedArtifact]](documentation, t.documentation),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[Goal.Target]](target, t.target)
    )
    val baseType: CompanionFor[Goal] = this
    val thisName: String             = "Goal"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Goal] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Goal(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("start", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("category", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("priority", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("addresses", Some(LitSeq.empty)),
            cursor.decodeAs[CodeableConcept]("description", None),
            cursor.decodeAs[LitSeq[RelatedArtifact]]("documentation", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Goal.Target]]("target", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Goal(
      override val id: Option[String] = None,
      val start: Option[CodeableConcept] = None,
      val category: Option[CodeableConcept] = None,
      val priority: Option[CodeableConcept] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val addresses: LitSeq[CodeableConcept] = LitSeq.empty,
      val description: CodeableConcept,
      val documentation: LitSeq[RelatedArtifact] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val target: LitSeq[Goal.Target] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  type SubjectChoice = Choice[Union01025009075]
  def apply(
      id: Option[String] = None,
      url: Option[UriStr] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      name: Option[String] = None,
      `type`: Option[CodeableConcept] = None,
      date: Option[FHIRDateTime] = None,
      title: Option[String] = None,
      usage: Option[String] = None,
      topic: LitSeq[CodeableConcept] = LitSeq.empty,
      status: PUBLICATION_STATUS,
      author: LitSeq[ContactDetail] = LitSeq.empty,
      editor: LitSeq[ContactDetail] = LitSeq.empty,
      version: Option[String] = None,
      contact: LitSeq[ContactDetail] = LitSeq.empty,
      purpose: Option[Markdown] = None,
      library: LitSeq[Canonical] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      subtitle: Option[String] = None,
      reviewer: LitSeq[ContactDetail] = LitSeq.empty,
      endorser: LitSeq[ContactDetail] = LitSeq.empty,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      publisher: Option[String] = None,
      copyright: Option[Markdown] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      subject: Option[PlanDefinition.SubjectChoice] = None,
      useContext: LitSeq[UsageContext] = LitSeq.empty,
      description: Option[Markdown] = None,
      experimental: Option[Boolean] = None,
      jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
      approvalDate: Option[FHIRDate] = None,
      implicitRules: Option[UriStr] = None,
      lastReviewDate: Option[FHIRDate] = None,
      effectivePeriod: Option[Period] = None,
      relatedArtifact: LitSeq[RelatedArtifact] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      goal: LitSeq[PlanDefinition.Goal] = LitSeq.empty,
      action: LitSeq[PlanDefinition.Action] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): PlanDefinition = new PlanDefinition(
    id,
    url,
    meta,
    text,
    name,
    `type`,
    date,
    title,
    usage,
    topic,
    status,
    author,
    editor,
    version,
    contact,
    purpose,
    library,
    language,
    subtitle,
    reviewer,
    endorser,
    contained,
    extension,
    publisher,
    copyright,
    identifier,
    subject,
    useContext,
    description,
    experimental,
    jurisdiction,
    approvalDate,
    implicitRules,
    lastReviewDate,
    effectivePeriod,
    relatedArtifact,
    modifierExtension,
    goal,
    action,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val url: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("url", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val name: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("name", lTagOf[Option[String]], false, lTagOf[String])
  val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val date: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("date", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val title: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("title", lTagOf[Option[String]], false, lTagOf[String])
  val usage: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("usage", lTagOf[Option[String]], false, lTagOf[String])
  val topic: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("topic", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val status: FHIRComponentFieldMeta[PUBLICATION_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[PUBLICATION_STATUS], false, lTagOf[PUBLICATION_STATUS])
  val author: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("author", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val editor: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("editor", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val version: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("version", lTagOf[Option[String]], false, lTagOf[String])
  val contact: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("contact", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val purpose: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("purpose", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val library: FHIRComponentFieldMeta[LitSeq[Canonical]] =
    FHIRComponentFieldMeta("library", lTagOf[LitSeq[Canonical]], false, lTagOf[Canonical])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val subtitle: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("subtitle", lTagOf[Option[String]], false, lTagOf[String])
  val reviewer: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("reviewer", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val endorser: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("endorser", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val publisher: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("publisher", lTagOf[Option[String]], false, lTagOf[String])
  val copyright: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("copyright", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val subject: FHIRComponentFieldMeta[Option[PlanDefinition.SubjectChoice]] =
    FHIRComponentFieldMeta("subject", lTagOf[Option[PlanDefinition.SubjectChoice]], true, lTagOf[Union01025009075])
  val useContext: FHIRComponentFieldMeta[LitSeq[UsageContext]] =
    FHIRComponentFieldMeta("useContext", lTagOf[LitSeq[UsageContext]], false, lTagOf[UsageContext])
  val description: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("description", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val experimental: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("experimental", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val jurisdiction: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("jurisdiction", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val approvalDate: FHIRComponentFieldMeta[Option[FHIRDate]] =
    FHIRComponentFieldMeta("approvalDate", lTagOf[Option[FHIRDate]], false, lTagOf[FHIRDate])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val lastReviewDate: FHIRComponentFieldMeta[Option[FHIRDate]] =
    FHIRComponentFieldMeta("lastReviewDate", lTagOf[Option[FHIRDate]], false, lTagOf[FHIRDate])
  val effectivePeriod: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("effectivePeriod", lTagOf[Option[Period]], false, lTagOf[Period])
  val relatedArtifact: FHIRComponentFieldMeta[LitSeq[RelatedArtifact]] =
    FHIRComponentFieldMeta("relatedArtifact", lTagOf[LitSeq[RelatedArtifact]], false, lTagOf[RelatedArtifact])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val goal: FHIRComponentFieldMeta[LitSeq[PlanDefinition.Goal]] =
    FHIRComponentFieldMeta("goal", lTagOf[LitSeq[PlanDefinition.Goal]], false, lTagOf[PlanDefinition.Goal])
  val action: FHIRComponentFieldMeta[LitSeq[PlanDefinition.Action]] =
    FHIRComponentFieldMeta("action", lTagOf[LitSeq[PlanDefinition.Action]], false, lTagOf[PlanDefinition.Action])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    url,
    meta,
    text,
    name,
    `type`,
    date,
    title,
    usage,
    topic,
    status,
    author,
    editor,
    version,
    contact,
    purpose,
    library,
    language,
    subtitle,
    reviewer,
    endorser,
    contained,
    extension,
    publisher,
    copyright,
    identifier,
    subject,
    useContext,
    description,
    experimental,
    jurisdiction,
    approvalDate,
    implicitRules,
    lastReviewDate,
    effectivePeriod,
    relatedArtifact,
    modifierExtension,
    goal,
    action
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: PlanDefinition): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[UriStr]](url, t.url),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[String]](name, t.name),
    FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
    FHIRComponentField[Option[FHIRDateTime]](date, t.date),
    FHIRComponentField[Option[String]](title, t.title),
    FHIRComponentField[Option[String]](usage, t.usage),
    FHIRComponentField[LitSeq[CodeableConcept]](topic, t.topic),
    FHIRComponentField[PUBLICATION_STATUS](status, t.status),
    FHIRComponentField[LitSeq[ContactDetail]](author, t.author),
    FHIRComponentField[LitSeq[ContactDetail]](editor, t.editor),
    FHIRComponentField[Option[String]](version, t.version),
    FHIRComponentField[LitSeq[ContactDetail]](contact, t.contact),
    FHIRComponentField[Option[Markdown]](purpose, t.purpose),
    FHIRComponentField[LitSeq[Canonical]](library, t.library),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Option[String]](subtitle, t.subtitle),
    FHIRComponentField[LitSeq[ContactDetail]](reviewer, t.reviewer),
    FHIRComponentField[LitSeq[ContactDetail]](endorser, t.endorser),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[String]](publisher, t.publisher),
    FHIRComponentField[Option[Markdown]](copyright, t.copyright),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[PlanDefinition.SubjectChoice]](subject, t.subject),
    FHIRComponentField[LitSeq[UsageContext]](useContext, t.useContext),
    FHIRComponentField[Option[Markdown]](description, t.description),
    FHIRComponentField[Option[Boolean]](experimental, t.experimental),
    FHIRComponentField[LitSeq[CodeableConcept]](jurisdiction, t.jurisdiction),
    FHIRComponentField[Option[FHIRDate]](approvalDate, t.approvalDate),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[FHIRDate]](lastReviewDate, t.lastReviewDate),
    FHIRComponentField[Option[Period]](effectivePeriod, t.effectivePeriod),
    FHIRComponentField[LitSeq[RelatedArtifact]](relatedArtifact, t.relatedArtifact),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[PlanDefinition.Goal]](goal, t.goal),
    FHIRComponentField[LitSeq[PlanDefinition.Action]](action, t.action)
  )
  def extractId(t: PlanDefinition): Option[String]                            = t.id
  def extractUrl(t: PlanDefinition): Option[UriStr]                           = t.url
  def extractMeta(t: PlanDefinition): Option[Meta]                            = t.meta
  def extractText(t: PlanDefinition): Option[Narrative]                       = t.text
  def extractName(t: PlanDefinition): Option[String]                          = t.name
  def extractType(t: PlanDefinition): Option[CodeableConcept]                 = t.`type`
  def extractDate(t: PlanDefinition): Option[FHIRDateTime]                    = t.date
  def extractTitle(t: PlanDefinition): Option[String]                         = t.title
  def extractUsage(t: PlanDefinition): Option[String]                         = t.usage
  def extractTopic(t: PlanDefinition): LitSeq[CodeableConcept]                = t.topic
  def extractStatus(t: PlanDefinition): PUBLICATION_STATUS                    = t.status
  def extractAuthor(t: PlanDefinition): LitSeq[ContactDetail]                 = t.author
  def extractEditor(t: PlanDefinition): LitSeq[ContactDetail]                 = t.editor
  def extractVersion(t: PlanDefinition): Option[String]                       = t.version
  def extractContact(t: PlanDefinition): LitSeq[ContactDetail]                = t.contact
  def extractPurpose(t: PlanDefinition): Option[Markdown]                     = t.purpose
  def extractLibrary(t: PlanDefinition): LitSeq[Canonical]                    = t.library
  def extractLanguage(t: PlanDefinition): Option[LANGUAGES]                   = t.language
  def extractSubtitle(t: PlanDefinition): Option[String]                      = t.subtitle
  def extractReviewer(t: PlanDefinition): LitSeq[ContactDetail]               = t.reviewer
  def extractEndorser(t: PlanDefinition): LitSeq[ContactDetail]               = t.endorser
  def extractContained(t: PlanDefinition): LitSeq[Resource]                   = t.contained
  def extractExtension(t: PlanDefinition): LitSeq[Extension]                  = t.extension
  def extractPublisher(t: PlanDefinition): Option[String]                     = t.publisher
  def extractCopyright(t: PlanDefinition): Option[Markdown]                   = t.copyright
  def extractIdentifier(t: PlanDefinition): LitSeq[Identifier]                = t.identifier
  def extractSubject(t: PlanDefinition): Option[PlanDefinition.SubjectChoice] = t.subject
  def extractUseContext(t: PlanDefinition): LitSeq[UsageContext]              = t.useContext
  def extractDescription(t: PlanDefinition): Option[Markdown]                 = t.description
  def extractExperimental(t: PlanDefinition): Option[Boolean]                 = t.experimental
  def extractJurisdiction(t: PlanDefinition): LitSeq[CodeableConcept]         = t.jurisdiction
  def extractApprovalDate(t: PlanDefinition): Option[FHIRDate]                = t.approvalDate
  def extractImplicitRules(t: PlanDefinition): Option[UriStr]                 = t.implicitRules
  def extractLastReviewDate(t: PlanDefinition): Option[FHIRDate]              = t.lastReviewDate
  def extractEffectivePeriod(t: PlanDefinition): Option[Period]               = t.effectivePeriod
  def extractRelatedArtifact(t: PlanDefinition): LitSeq[RelatedArtifact]      = t.relatedArtifact
  def extractModifierExtension(t: PlanDefinition): LitSeq[Extension]          = t.modifierExtension
  def extractGoal(t: PlanDefinition): LitSeq[PlanDefinition.Goal]             = t.goal
  def extractAction(t: PlanDefinition): LitSeq[PlanDefinition.Action]         = t.action
  override val thisName: String                                               = "PlanDefinition"
  override val searchParams: Map[String, PlanDefinition => Seq[Any]] = Map(
    "jurisdiction"          -> (obj => obj.jurisdiction.toSeq),
    "name"                  -> (obj => obj.name.toSeq),
    "context-type-quantity" -> (obj => obj.useContext.toSeq),
    "context"               -> (obj => obj.useContext.map(_.value).flatMap(_.as[CodeableConcept]).toSeq),
    "effective"             -> (obj => obj.effectivePeriod.toSeq),
    "depends-on" -> (obj =>
      obj.relatedArtifact.filter(_.`type`.entryName == "depends-on").flatMap(_.resource).toSeq ++
        obj.library.toSeq),
    "date"               -> (obj => obj.date.toSeq),
    "definition"         -> (obj => obj.action.flatMap(_.definition).toSeq),
    "topic"              -> (obj => obj.topic.toSeq),
    "identifier"         -> (obj => obj.identifier.toSeq),
    "url"                -> (obj => obj.url.toSeq),
    "description"        -> (obj => obj.description.toSeq),
    "successor"          -> (obj => obj.relatedArtifact.filter(_.`type`.entryName == "successor").flatMap(_.resource).toSeq),
    "context-type-value" -> (obj => obj.useContext.toSeq),
    "version"            -> (obj => obj.version.toSeq),
    "composed-of"        -> (obj => obj.relatedArtifact.filter(_.`type`.entryName == "composed-of").flatMap(_.resource).toSeq),
    "status"             -> (obj => Seq(obj.status)),
    "publisher"          -> (obj => obj.publisher.toSeq),
    "title"              -> (obj => obj.title.toSeq),
    "context-quantity" -> (obj =>
      obj.useContext.map(_.value).flatMap(_.as[Quantity]).toSeq ++
        obj.useContext.map(_.value).flatMap(_.as[Range]).toSeq),
    "type"         -> (obj => obj.`type`.toSeq),
    "predecessor"  -> (obj => obj.relatedArtifact.filter(_.`type`.entryName == "predecessor").flatMap(_.resource).toSeq),
    "context-type" -> (obj => obj.useContext.map(_.code).toSeq),
    "derived-from" -> (obj =>
      obj.relatedArtifact.filter(_.`type`.entryName == "derived-from").flatMap(_.resource).toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[PlanDefinition] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new PlanDefinition(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[UriStr]]("url", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[String]]("name", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("date", Some(None)),
          cursor.decodeAs[Option[String]]("title", Some(None)),
          cursor.decodeAs[Option[String]]("usage", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("topic", Some(LitSeq.empty)),
          cursor.decodeAs[PUBLICATION_STATUS]("status", None),
          cursor.decodeAs[LitSeq[ContactDetail]]("author", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[ContactDetail]]("editor", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("version", Some(None)),
          cursor.decodeAs[LitSeq[ContactDetail]]("contact", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Markdown]]("purpose", Some(None)),
          cursor.decodeAs[LitSeq[Canonical]]("library", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[String]]("subtitle", Some(None)),
          cursor.decodeAs[LitSeq[ContactDetail]]("reviewer", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[ContactDetail]]("endorser", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("publisher", Some(None)),
          cursor.decodeAs[Option[Markdown]]("copyright", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeOptRef[Union01025009075]("subject"),
          cursor.decodeAs[LitSeq[UsageContext]]("useContext", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Markdown]]("description", Some(None)),
          cursor.decodeAs[Option[Boolean]]("experimental", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("jurisdiction", Some(LitSeq.empty)),
          cursor.decodeAs[Option[FHIRDate]]("approvalDate", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[FHIRDate]]("lastReviewDate", Some(None)),
          cursor.decodeAs[Option[Period]]("effectivePeriod", Some(None)),
          cursor.decodeAs[LitSeq[RelatedArtifact]]("relatedArtifact", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[PlanDefinition.Goal]]("goal", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[PlanDefinition.Action]]("action", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields url, name, `type`, date, title, usage, topic, status, author, editor, version, contact, purpose, library, subtitle, reviewer, endorser, publisher, copyright, identifier, subject, useContext, description, experimental, jurisdiction, approvalDate, lastReviewDate, effectivePeriod, relatedArtifact, goal, action.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param url - An absolute URI that is used to identify this plan definition when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative instance of this plan definition is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the plan definition is stored on different servers.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param name - A natural language name identifying the plan definition. This name should be usable as an identifier for the module by machine processing applications such as code generation.
  * @param `type` - A high-level category for the plan definition that distinguishes the kinds of systems that would be interested in the plan definition.
  * @param date - The date  (and optionally time) when the plan definition was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the plan definition changes.
  * @param title - A short, descriptive, user-friendly title for the plan definition.
  * @param usage - A detailed description of how the plan definition is used from a clinical perspective.
  * @param topic - Descriptive topics related to the content of the plan definition. Topics provide a high-level categorization of the definition that can be useful for filtering and searching.
  * @param status - The status of this plan definition. Enables tracking the life-cycle of the content.
  * @param author - An individiual or organization primarily involved in the creation and maintenance of the content.
  * @param editor - An individual or organization primarily responsible for internal coherence of the content.
  * @param version - The identifier that is used to identify this version of the plan definition when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the plan definition author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence. To provide a version consistent with the Decision Support Service specification, use the format Major.Minor.Revision (e.g. 1.0.0). For more information on versioning knowledge assets, refer to the Decision Support Service specification. Note that a version is required for non-experimental active artifacts.
  * @param contact - Contact details to assist a user in finding and communicating with the publisher.
  * @param purpose - Explanation of why this plan definition is needed and why it has been designed as it has.
  * @param library - A reference to a Library resource containing any formal logic used by the plan definition.
  * @param language - The base language in which the resource is written.
  * @param subtitle - An explanatory or alternate title for the plan definition giving additional information about its content.
  * @param reviewer - An individual or organization primarily responsible for review of some aspect of the content.
  * @param endorser - An individual or organization responsible for officially endorsing the content for use in some setting.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param publisher - The name of the organization or individual that published the plan definition.
  * @param copyright - A copyright statement relating to the plan definition and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the plan definition.
  * @param identifier - A formal identifier that is used to identify this plan definition when it is represented in other formats, or referenced in a specification, model, design or an instance.
  * @param subject - A code or group definition that describes the intended subject of the plan definition.
  * @param useContext - The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate plan definition instances.
  * @param description - A free text natural language description of the plan definition from a consumer's perspective.
  * @param experimental - A Boolean value to indicate that this plan definition is authored for testing purposes (or education/evaluation/marketing) and is not intended to be used for genuine usage.
  * @param jurisdiction - A legal or geographic region in which the plan definition is intended to be used.
  * @param approvalDate - The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param lastReviewDate - The date on which the resource content was last reviewed. Review happens periodically after approval but does not change the original approval date.
  * @param effectivePeriod - The period during which the plan definition content was or is planned to be in active use.
  * @param relatedArtifact - Related artifacts such as additional documentation, justification, or bibliographic references.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param goal - Goals that describe what the activities within the plan are intended to achieve. For example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.
  * @param action - An action or group of actions to be taken as part of the plan.
  */
@POJOBoilerplate
class PlanDefinition(
    override val id: Option[String] = None,
    val url: Option[UriStr] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val name: Option[String] = None,
    val `type`: Option[CodeableConcept] = None,
    val date: Option[FHIRDateTime] = None,
    val title: Option[String] = None,
    val usage: Option[String] = None,
    val topic: LitSeq[CodeableConcept] = LitSeq.empty,
    val status: PUBLICATION_STATUS,
    val author: LitSeq[ContactDetail] = LitSeq.empty,
    val editor: LitSeq[ContactDetail] = LitSeq.empty,
    val version: Option[String] = None,
    val contact: LitSeq[ContactDetail] = LitSeq.empty,
    val purpose: Option[Markdown] = None,
    val library: LitSeq[Canonical] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    val subtitle: Option[String] = None,
    val reviewer: LitSeq[ContactDetail] = LitSeq.empty,
    val endorser: LitSeq[ContactDetail] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val publisher: Option[String] = None,
    val copyright: Option[Markdown] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val subject: Option[PlanDefinition.SubjectChoice] = None,
    val useContext: LitSeq[UsageContext] = LitSeq.empty,
    val description: Option[Markdown] = None,
    val experimental: Option[Boolean] = None,
    val jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
    val approvalDate: Option[FHIRDate] = None,
    override val implicitRules: Option[UriStr] = None,
    val lastReviewDate: Option[FHIRDate] = None,
    val effectivePeriod: Option[Period] = None,
    val relatedArtifact: LitSeq[RelatedArtifact] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val goal: LitSeq[PlanDefinition.Goal] = LitSeq.empty,
    val action: LitSeq[PlanDefinition.Action] = LitSeq.empty,
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
  override val thisTypeName: String = "PlanDefinition"
}
