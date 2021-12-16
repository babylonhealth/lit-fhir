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
  MAP_MODEL_MODE,
  PUBLICATION_STATUS,
  MAP_SOURCE_LIST_MODE,
  MAP_GROUP_TYPE_MODE,
  MAP_INPUT_MODE,
  GROUP_TYPE,
  MAP_TARGET_LIST_MODE,
  LIST_MODE,
  MAP_CONTEXT_TYPE,
  MAP_TRANSFORM
}
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object StructureMap extends CompanionFor[StructureMap] {
  implicit def summonObjectAndCompanionStructureMap538206046(
      o: StructureMap): ObjectAndCompanion[StructureMap, StructureMap.type] = ObjectAndCompanion(o, this)
  override type ResourceType = StructureMap
  override type ParentType   = StructureMap
  override val baseType: CompanionFor[ResourceType] = StructureMap
  override val parentType: CompanionFor[ParentType] = StructureMap
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/StructureMap")
  object Group extends CompanionFor[Group] {
    implicit def summonObjectAndCompanionGroup_378472942(o: Group): ObjectAndCompanion[Group, Group.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Group
    override type ParentType   = Group
    override val parentType: CompanionFor[ResourceType] = Group
    object Input extends CompanionFor[Input] {
      implicit def summonObjectAndCompanionInput2096400327(o: Input): ObjectAndCompanion[Input, Input.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Input
      override type ParentType   = Input
      override val parentType: CompanionFor[ResourceType] = Input
      def apply(
          id: Option[String] = None,
          name: Id,
          `type`: Option[String] = None,
          mode: MAP_INPUT_MODE,
          extension: LitSeq[Extension] = LitSeq.empty,
          documentation: Option[String] = None,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Input = new Input(
        id,
        name,
        `type`,
        mode,
        extension,
        documentation,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Input): Option[(Option[String], Id, Option[String], MAP_INPUT_MODE, LitSeq[Extension], Option[String], LitSeq[Extension])] =
        Some((o.id, o.name, o.`type`, o.mode, o.extension, o.documentation, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val name: FHIRComponentFieldMeta[Id] =
        FHIRComponentFieldMeta("name", lTagOf[Id], false, lTagOf[Id])
      val `type`: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("type", lTagOf[Option[String]], false, lTagOf[String])
      val mode: FHIRComponentFieldMeta[MAP_INPUT_MODE] =
        FHIRComponentFieldMeta("mode", lTagOf[MAP_INPUT_MODE], false, lTagOf[MAP_INPUT_MODE])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val documentation: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("documentation", lTagOf[Option[String]], false, lTagOf[String])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, name, `type`, mode, extension, documentation, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Input): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Id](name, t.name),
        FHIRComponentField[Option[String]](`type`, t.`type`),
        FHIRComponentField[MAP_INPUT_MODE](mode, t.mode),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[String]](documentation, t.documentation),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Input] = this
      val thisName: String              = "Input"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Input] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Input(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Id]("name", None),
              cursor.decodeAs[Option[String]]("type", Some(None)),
              cursor.decodeAs[MAP_INPUT_MODE]("mode", None),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[String]]("documentation", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Input(
        override val id: Option[String] = None,
        val name: Id,
        val `type`: Option[String] = None,
        val mode: MAP_INPUT_MODE,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val documentation: Option[String] = None,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object Rule extends CompanionFor[Rule] {
      implicit def summonObjectAndCompanionRule2096400327(o: Rule): ObjectAndCompanion[Rule, Rule.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Rule
      override type ParentType   = Rule
      override val parentType: CompanionFor[ResourceType] = Rule
      object Source extends CompanionFor[Source] {
        implicit def summonObjectAndCompanionSource2032441248(o: Source): ObjectAndCompanion[Source, Source.type] =
          ObjectAndCompanion(o, this)
        override type ResourceType = Source
        override type ParentType   = Source
        override val parentType: CompanionFor[ResourceType] = Source
        type DefaultValueChoice = Choice[UnionAll]
        def apply(
            id: Option[String] = None,
            min: Option[Int] = None,
            max: Option[String] = None,
            `type`: Option[String] = None,
            check: Option[String] = None,
            context: Id,
            element: Option[String] = None,
            listMode: Option[MAP_SOURCE_LIST_MODE] = None,
            variable: Option[Id] = None,
            extension: LitSeq[Extension] = LitSeq.empty,
            condition: Option[String] = None,
            logMessage: Option[String] = None,
            defaultValue: Option[Source.DefaultValueChoice] = None,
            modifierExtension: LitSeq[Extension] = LitSeq.empty,
            primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
        ): Source = new Source(
          id,
          min,
          max,
          `type`,
          check,
          context,
          element,
          listMode,
          variable,
          extension,
          condition,
          logMessage,
          defaultValue,
          modifierExtension,
          primitiveAttributes = primitiveAttributes
        )
        def unapply(
            o: Source): Option[(Option[String], Option[Int], Option[String], Option[String], Option[String], Id, Option[String], Option[MAP_SOURCE_LIST_MODE], Option[Id], LitSeq[Extension], Option[String], Option[String], Option[Source.DefaultValueChoice], LitSeq[Extension])] =
          Some(
            (
              o.id,
              o.min,
              o.max,
              o.`type`,
              o.check,
              o.context,
              o.element,
              o.listMode,
              o.variable,
              o.extension,
              o.condition,
              o.logMessage,
              o.defaultValue,
              o.modifierExtension))
        val id: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
        val min: FHIRComponentFieldMeta[Option[Int]] =
          FHIRComponentFieldMeta("min", lTagOf[Option[Int]], false, lTagOf[Int])
        val max: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("max", lTagOf[Option[String]], false, lTagOf[String])
        val `type`: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("type", lTagOf[Option[String]], false, lTagOf[String])
        val check: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("check", lTagOf[Option[String]], false, lTagOf[String])
        val context: FHIRComponentFieldMeta[Id] =
          FHIRComponentFieldMeta("context", lTagOf[Id], false, lTagOf[Id])
        val element: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("element", lTagOf[Option[String]], false, lTagOf[String])
        val listMode: FHIRComponentFieldMeta[Option[MAP_SOURCE_LIST_MODE]] =
          FHIRComponentFieldMeta("listMode", lTagOf[Option[MAP_SOURCE_LIST_MODE]], false, lTagOf[MAP_SOURCE_LIST_MODE])
        val variable: FHIRComponentFieldMeta[Option[Id]] =
          FHIRComponentFieldMeta("variable", lTagOf[Option[Id]], false, lTagOf[Id])
        val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val condition: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("condition", lTagOf[Option[String]], false, lTagOf[String])
        val logMessage: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("logMessage", lTagOf[Option[String]], false, lTagOf[String])
        val defaultValue: FHIRComponentFieldMeta[Option[Source.DefaultValueChoice]] =
          FHIRComponentFieldMeta("defaultValue", lTagOf[Option[Source.DefaultValueChoice]], true, lTagOf[UnionAll])
        val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
          id,
          min,
          max,
          `type`,
          check,
          context,
          element,
          listMode,
          variable,
          extension,
          condition,
          logMessage,
          defaultValue,
          modifierExtension)
        override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
        override def fields(t: Source): Seq[FHIRComponentField[_]] = Seq(
          FHIRComponentField[Option[String]](id, t.id),
          FHIRComponentField[Option[Int]](min, t.min),
          FHIRComponentField[Option[String]](max, t.max),
          FHIRComponentField[Option[String]](`type`, t.`type`),
          FHIRComponentField[Option[String]](check, t.check),
          FHIRComponentField[Id](context, t.context),
          FHIRComponentField[Option[String]](element, t.element),
          FHIRComponentField[Option[MAP_SOURCE_LIST_MODE]](listMode, t.listMode),
          FHIRComponentField[Option[Id]](variable, t.variable),
          FHIRComponentField[LitSeq[Extension]](extension, t.extension),
          FHIRComponentField[Option[String]](condition, t.condition),
          FHIRComponentField[Option[String]](logMessage, t.logMessage),
          FHIRComponentField[Option[Source.DefaultValueChoice]](defaultValue, t.defaultValue),
          FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
        )
        val baseType: CompanionFor[Source] = this
        val thisName: String               = "Source"
        def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Source] =
          checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
            Try(
              new Source(
                cursor.decodeAs[Option[String]]("id", Some(None)),
                cursor.decodeAs[Option[Int]]("min", Some(None)),
                cursor.decodeAs[Option[String]]("max", Some(None)),
                cursor.decodeAs[Option[String]]("type", Some(None)),
                cursor.decodeAs[Option[String]]("check", Some(None)),
                cursor.decodeAs[Id]("context", None),
                cursor.decodeAs[Option[String]]("element", Some(None)),
                cursor.decodeAs[Option[MAP_SOURCE_LIST_MODE]]("listMode", Some(None)),
                cursor.decodeAs[Option[Id]]("variable", Some(None)),
                cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
                cursor.decodeAs[Option[String]]("condition", Some(None)),
                cursor.decodeAs[Option[String]]("logMessage", Some(None)),
                cursor.decodeOptRef[UnionAll]("defaultValue"),
                cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
                decodeAttributes(cursor)
              )
            ))
      }
      @POJOBoilerplate
      class Source(
          override val id: Option[String] = None,
          val min: Option[Int] = None,
          val max: Option[String] = None,
          val `type`: Option[String] = None,
          val check: Option[String] = None,
          val context: Id,
          val element: Option[String] = None,
          val listMode: Option[MAP_SOURCE_LIST_MODE] = None,
          val variable: Option[Id] = None,
          override val extension: LitSeq[Extension] = LitSeq.empty,
          val condition: Option[String] = None,
          val logMessage: Option[String] = None,
          val defaultValue: Option[Source.DefaultValueChoice] = None,
          override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
          override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
          extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
      object Dependent extends CompanionFor[Dependent] {
        implicit def summonObjectAndCompanionDependent2032441248(o: Dependent): ObjectAndCompanion[Dependent, Dependent.type] =
          ObjectAndCompanion(o, this)
        override type ResourceType = Dependent
        override type ParentType   = Dependent
        override val parentType: CompanionFor[ResourceType] = Dependent
        def apply(
            id: Option[String] = None,
            name: Id,
            variable: NonEmptyLitSeq[String],
            extension: LitSeq[Extension] = LitSeq.empty,
            modifierExtension: LitSeq[Extension] = LitSeq.empty,
            primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
        ): Dependent = new Dependent(
          id,
          name,
          variable,
          extension,
          modifierExtension,
          primitiveAttributes = primitiveAttributes
        )
        def unapply(o: Dependent): Option[(Option[String], Id, NonEmptyLitSeq[String], LitSeq[Extension], LitSeq[Extension])] =
          Some((o.id, o.name, o.variable, o.extension, o.modifierExtension))
        val id: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
        val name: FHIRComponentFieldMeta[Id] =
          FHIRComponentFieldMeta("name", lTagOf[Id], false, lTagOf[Id])
        val variable: FHIRComponentFieldMeta[NonEmptyLitSeq[String]] =
          FHIRComponentFieldMeta("variable", lTagOf[NonEmptyLitSeq[String]], false, lTagOf[String])
        val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, name, variable, extension, modifierExtension)
        override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
        override def fields(t: Dependent): Seq[FHIRComponentField[_]] = Seq(
          FHIRComponentField[Option[String]](id, t.id),
          FHIRComponentField[Id](name, t.name),
          FHIRComponentField[NonEmptyLitSeq[String]](variable, t.variable),
          FHIRComponentField[LitSeq[Extension]](extension, t.extension),
          FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
        )
        val baseType: CompanionFor[Dependent] = this
        val thisName: String                  = "Dependent"
        def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Dependent] =
          checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
            Try(
              new Dependent(
                cursor.decodeAs[Option[String]]("id", Some(None)),
                cursor.decodeAs[Id]("name", None),
                cursor.decodeAs[NonEmptyLitSeq[String]]("variable", None),
                cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
                cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
                decodeAttributes(cursor)
              )
            ))
      }
      @POJOBoilerplate
      class Dependent(
          override val id: Option[String] = None,
          val name: Id,
          val variable: NonEmptyLitSeq[String],
          override val extension: LitSeq[Extension] = LitSeq.empty,
          override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
          override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
          extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
      object Target extends CompanionFor[Target] {
        implicit def summonObjectAndCompanionTarget2032441248(o: Target): ObjectAndCompanion[Target, Target.type] =
          ObjectAndCompanion(o, this)
        override type ResourceType = Target
        override type ParentType   = Target
        override val parentType: CompanionFor[ResourceType] = Target
        object Parameter extends CompanionFor[Parameter] {
          implicit def summonObjectAndCompanionParameter_1564194842(o: Parameter): ObjectAndCompanion[Parameter, Parameter.type] =
            ObjectAndCompanion(o, this)
          override type ResourceType = Parameter
          override type ParentType   = Parameter
          override val parentType: CompanionFor[ResourceType] = Parameter
          type ValueChoice = Choice[Union00551919141]
          def apply(
              id: Option[String] = None,
              value: Parameter.ValueChoice,
              extension: LitSeq[Extension] = LitSeq.empty,
              modifierExtension: LitSeq[Extension] = LitSeq.empty,
              primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
          ): Parameter = new Parameter(
            id,
            value,
            extension,
            modifierExtension,
            primitiveAttributes = primitiveAttributes
          )
          def unapply(o: Parameter): Option[(Option[String], Parameter.ValueChoice, LitSeq[Extension], LitSeq[Extension])] = Some(
            (o.id, o.value, o.extension, o.modifierExtension))
          val id: FHIRComponentFieldMeta[Option[String]] =
            FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
          val value: FHIRComponentFieldMeta[Parameter.ValueChoice] =
            FHIRComponentFieldMeta("value", lTagOf[Parameter.ValueChoice], true, lTagOf[Union00551919141])
          val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
            FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
          val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
            FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
          val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value, extension, modifierExtension)
          override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
          override def fields(t: Parameter): Seq[FHIRComponentField[_]] = Seq(
            FHIRComponentField[Option[String]](id, t.id),
            FHIRComponentField[Parameter.ValueChoice](value, t.value),
            FHIRComponentField[LitSeq[Extension]](extension, t.extension),
            FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
          )
          val baseType: CompanionFor[Parameter] = this
          val thisName: String                  = "Parameter"
          def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Parameter] =
            checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
              Try(
                new Parameter(
                  cursor.decodeAs[Option[String]]("id", Some(None)),
                  cursor.decodeRef[Union00551919141]("value"),
                  cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
                  cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
                  decodeAttributes(cursor)
                )
              ))
        }
        @POJOBoilerplate
        class Parameter(
            override val id: Option[String] = None,
            val value: Parameter.ValueChoice,
            override val extension: LitSeq[Extension] = LitSeq.empty,
            override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
            override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
            extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
        def apply(
            id: Option[String] = None,
            context: Option[Id] = None,
            element: Option[String] = None,
            variable: Option[Id] = None,
            listMode: LitSeq[MAP_TARGET_LIST_MODE] = LitSeq.empty,
            extension: LitSeq[Extension] = LitSeq.empty,
            transform: Option[MAP_TRANSFORM] = None,
            listRuleId: Option[Id] = None,
            contextType: Option[MAP_CONTEXT_TYPE] = None,
            modifierExtension: LitSeq[Extension] = LitSeq.empty,
            parameter: LitSeq[Target.Parameter] = LitSeq.empty,
            primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
        ): Target = new Target(
          id,
          context,
          element,
          variable,
          listMode,
          extension,
          transform,
          listRuleId,
          contextType,
          modifierExtension,
          parameter,
          primitiveAttributes = primitiveAttributes
        )
        def unapply(
            o: Target): Option[(Option[String], Option[Id], Option[String], Option[Id], LitSeq[MAP_TARGET_LIST_MODE], LitSeq[Extension], Option[MAP_TRANSFORM], Option[Id], Option[MAP_CONTEXT_TYPE], LitSeq[Extension], LitSeq[Target.Parameter])] =
          Some(
            (
              o.id,
              o.context,
              o.element,
              o.variable,
              o.listMode,
              o.extension,
              o.transform,
              o.listRuleId,
              o.contextType,
              o.modifierExtension,
              o.parameter))
        val id: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
        val context: FHIRComponentFieldMeta[Option[Id]] =
          FHIRComponentFieldMeta("context", lTagOf[Option[Id]], false, lTagOf[Id])
        val element: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("element", lTagOf[Option[String]], false, lTagOf[String])
        val variable: FHIRComponentFieldMeta[Option[Id]] =
          FHIRComponentFieldMeta("variable", lTagOf[Option[Id]], false, lTagOf[Id])
        val listMode: FHIRComponentFieldMeta[LitSeq[MAP_TARGET_LIST_MODE]] =
          FHIRComponentFieldMeta("listMode", lTagOf[LitSeq[MAP_TARGET_LIST_MODE]], false, lTagOf[MAP_TARGET_LIST_MODE])
        val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val transform: FHIRComponentFieldMeta[Option[MAP_TRANSFORM]] =
          FHIRComponentFieldMeta("transform", lTagOf[Option[MAP_TRANSFORM]], false, lTagOf[MAP_TRANSFORM])
        val listRuleId: FHIRComponentFieldMeta[Option[Id]] =
          FHIRComponentFieldMeta("listRuleId", lTagOf[Option[Id]], false, lTagOf[Id])
        val contextType: FHIRComponentFieldMeta[Option[MAP_CONTEXT_TYPE]] =
          FHIRComponentFieldMeta("contextType", lTagOf[Option[MAP_CONTEXT_TYPE]], false, lTagOf[MAP_CONTEXT_TYPE])
        val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val parameter: FHIRComponentFieldMeta[LitSeq[Target.Parameter]] =
          FHIRComponentFieldMeta("parameter", lTagOf[LitSeq[Target.Parameter]], false, lTagOf[Target.Parameter])
        val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
          id,
          context,
          element,
          variable,
          listMode,
          extension,
          transform,
          listRuleId,
          contextType,
          modifierExtension,
          parameter)
        override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
        override def fields(t: Target): Seq[FHIRComponentField[_]] = Seq(
          FHIRComponentField[Option[String]](id, t.id),
          FHIRComponentField[Option[Id]](context, t.context),
          FHIRComponentField[Option[String]](element, t.element),
          FHIRComponentField[Option[Id]](variable, t.variable),
          FHIRComponentField[LitSeq[MAP_TARGET_LIST_MODE]](listMode, t.listMode),
          FHIRComponentField[LitSeq[Extension]](extension, t.extension),
          FHIRComponentField[Option[MAP_TRANSFORM]](transform, t.transform),
          FHIRComponentField[Option[Id]](listRuleId, t.listRuleId),
          FHIRComponentField[Option[MAP_CONTEXT_TYPE]](contextType, t.contextType),
          FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
          FHIRComponentField[LitSeq[Target.Parameter]](parameter, t.parameter)
        )
        val baseType: CompanionFor[Target] = this
        val thisName: String               = "Target"
        def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Target] =
          checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
            Try(
              new Target(
                cursor.decodeAs[Option[String]]("id", Some(None)),
                cursor.decodeAs[Option[Id]]("context", Some(None)),
                cursor.decodeAs[Option[String]]("element", Some(None)),
                cursor.decodeAs[Option[Id]]("variable", Some(None)),
                cursor.decodeAs[LitSeq[MAP_TARGET_LIST_MODE]]("listMode", Some(LitSeq.empty)),
                cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
                cursor.decodeAs[Option[MAP_TRANSFORM]]("transform", Some(None)),
                cursor.decodeAs[Option[Id]]("listRuleId", Some(None)),
                cursor.decodeAs[Option[MAP_CONTEXT_TYPE]]("contextType", Some(None)),
                cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
                cursor.decodeAs[LitSeq[Target.Parameter]]("parameter", Some(LitSeq.empty)),
                decodeAttributes(cursor)
              )
            ))
      }
      @POJOBoilerplate
      class Target(
          override val id: Option[String] = None,
          val context: Option[Id] = None,
          val element: Option[String] = None,
          val variable: Option[Id] = None,
          val listMode: LitSeq[MAP_TARGET_LIST_MODE] = LitSeq.empty,
          override val extension: LitSeq[Extension] = LitSeq.empty,
          val transform: Option[MAP_TRANSFORM] = None,
          val listRuleId: Option[Id] = None,
          val contextType: Option[MAP_CONTEXT_TYPE] = None,
          override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
          val parameter: LitSeq[Target.Parameter] = LitSeq.empty,
          override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
          extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
      def apply(
          id: Option[String] = None,
          name: Id,
          rule: LitSeq[StructureMap.Group.Rule] = LitSeq.empty,
          extension: LitSeq[Extension] = LitSeq.empty,
          documentation: Option[String] = None,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          source: NonEmptyLitSeq[Rule.Source],
          dependent: LitSeq[Rule.Dependent] = LitSeq.empty,
          target: LitSeq[Rule.Target] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Rule = new Rule(
        id,
        name,
        rule,
        extension,
        documentation,
        modifierExtension,
        source,
        dependent,
        target,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Rule): Option[(Option[String], Id, LitSeq[StructureMap.Group.Rule], LitSeq[Extension], Option[String], LitSeq[Extension], NonEmptyLitSeq[Rule.Source], LitSeq[Rule.Dependent], LitSeq[Rule.Target])] =
        Some((o.id, o.name, o.rule, o.extension, o.documentation, o.modifierExtension, o.source, o.dependent, o.target))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val name: FHIRComponentFieldMeta[Id] =
        FHIRComponentFieldMeta("name", lTagOf[Id], false, lTagOf[Id])
      val rule: FHIRComponentFieldMeta[LitSeq[StructureMap.Group.Rule]] =
        FHIRComponentFieldMeta("rule", lTagOf[LitSeq[StructureMap.Group.Rule]], false, lTagOf[StructureMap.Group.Rule])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val documentation: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("documentation", lTagOf[Option[String]], false, lTagOf[String])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val source: FHIRComponentFieldMeta[NonEmptyLitSeq[Rule.Source]] =
        FHIRComponentFieldMeta("source", lTagOf[NonEmptyLitSeq[Rule.Source]], false, lTagOf[Rule.Source])
      val dependent: FHIRComponentFieldMeta[LitSeq[Rule.Dependent]] =
        FHIRComponentFieldMeta("dependent", lTagOf[LitSeq[Rule.Dependent]], false, lTagOf[Rule.Dependent])
      val target: FHIRComponentFieldMeta[LitSeq[Rule.Target]] =
        FHIRComponentFieldMeta("target", lTagOf[LitSeq[Rule.Target]], false, lTagOf[Rule.Target])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
        Seq(id, name, rule, extension, documentation, modifierExtension, source, dependent, target)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Rule): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Id](name, t.name),
        FHIRComponentField[LitSeq[StructureMap.Group.Rule]](rule, t.rule),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[String]](documentation, t.documentation),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
        FHIRComponentField[NonEmptyLitSeq[Rule.Source]](source, t.source),
        FHIRComponentField[LitSeq[Rule.Dependent]](dependent, t.dependent),
        FHIRComponentField[LitSeq[Rule.Target]](target, t.target)
      )
      val baseType: CompanionFor[Rule] = this
      val thisName: String             = "Rule"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Rule] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Rule(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Id]("name", None),
              cursor.decodeAs[LitSeq[StructureMap.Group.Rule]]("rule", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[String]]("documentation", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              cursor.decodeAs[NonEmptyLitSeq[Rule.Source]]("source", None),
              cursor.decodeAs[LitSeq[Rule.Dependent]]("dependent", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Rule.Target]]("target", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Rule(
        override val id: Option[String] = None,
        val name: Id,
        val rule: LitSeq[StructureMap.Group.Rule] = LitSeq.empty,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val documentation: Option[String] = None,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        val source: NonEmptyLitSeq[Rule.Source],
        val dependent: LitSeq[Rule.Dependent] = LitSeq.empty,
        val target: LitSeq[Rule.Target] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        name: Id,
        `extends`: Option[Id] = None,
        typeMode: MAP_GROUP_TYPE_MODE,
        extension: LitSeq[Extension] = LitSeq.empty,
        documentation: Option[String] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        input: NonEmptyLitSeq[Group.Input],
        rule: NonEmptyLitSeq[Group.Rule],
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Group = new Group(
      id,
      name,
      `extends`,
      typeMode,
      extension,
      documentation,
      modifierExtension,
      input,
      rule,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Group): Option[(Option[String], Id, Option[Id], MAP_GROUP_TYPE_MODE, LitSeq[Extension], Option[String], LitSeq[Extension], NonEmptyLitSeq[Group.Input], NonEmptyLitSeq[Group.Rule])] =
      Some((o.id, o.name, o.`extends`, o.typeMode, o.extension, o.documentation, o.modifierExtension, o.input, o.rule))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val name: FHIRComponentFieldMeta[Id] =
      FHIRComponentFieldMeta("name", lTagOf[Id], false, lTagOf[Id])
    val `extends`: FHIRComponentFieldMeta[Option[Id]] =
      FHIRComponentFieldMeta("extends", lTagOf[Option[Id]], false, lTagOf[Id])
    val typeMode: FHIRComponentFieldMeta[MAP_GROUP_TYPE_MODE] =
      FHIRComponentFieldMeta("typeMode", lTagOf[MAP_GROUP_TYPE_MODE], false, lTagOf[MAP_GROUP_TYPE_MODE])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val documentation: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("documentation", lTagOf[Option[String]], false, lTagOf[String])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val input: FHIRComponentFieldMeta[NonEmptyLitSeq[Group.Input]] =
      FHIRComponentFieldMeta("input", lTagOf[NonEmptyLitSeq[Group.Input]], false, lTagOf[Group.Input])
    val rule: FHIRComponentFieldMeta[NonEmptyLitSeq[Group.Rule]] =
      FHIRComponentFieldMeta("rule", lTagOf[NonEmptyLitSeq[Group.Rule]], false, lTagOf[Group.Rule])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, name, `extends`, typeMode, extension, documentation, modifierExtension, input, rule)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Group): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Id](name, t.name),
      FHIRComponentField[Option[Id]](`extends`, t.`extends`),
      FHIRComponentField[MAP_GROUP_TYPE_MODE](typeMode, t.typeMode),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[String]](documentation, t.documentation),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[NonEmptyLitSeq[Group.Input]](input, t.input),
      FHIRComponentField[NonEmptyLitSeq[Group.Rule]](rule, t.rule)
    )
    val baseType: CompanionFor[Group] = this
    val thisName: String              = "Group"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Group] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Group(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Id]("name", None),
            cursor.decodeAs[Option[Id]]("extends", Some(None)),
            cursor.decodeAs[MAP_GROUP_TYPE_MODE]("typeMode", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("documentation", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[NonEmptyLitSeq[Group.Input]]("input", None),
            cursor.decodeAs[NonEmptyLitSeq[Group.Rule]]("rule", None),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Group(
      override val id: Option[String] = None,
      val name: Id,
      val `extends`: Option[Id] = None,
      val typeMode: MAP_GROUP_TYPE_MODE,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val documentation: Option[String] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val input: NonEmptyLitSeq[Group.Input],
      val rule: NonEmptyLitSeq[Group.Rule],
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Structure extends CompanionFor[Structure] {
    implicit def summonObjectAndCompanionStructure_378472942(o: Structure): ObjectAndCompanion[Structure, Structure.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Structure
    override type ParentType   = Structure
    override val parentType: CompanionFor[ResourceType] = Structure
    def apply(
        id: Option[String] = None,
        url: Canonical,
        mode: MAP_MODEL_MODE,
        alias: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        documentation: Option[String] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Structure = new Structure(
      id,
      url,
      mode,
      alias,
      extension,
      documentation,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Structure): Option[(Option[String], Canonical, MAP_MODEL_MODE, Option[String], LitSeq[Extension], Option[String], LitSeq[Extension])] =
      Some((o.id, o.url, o.mode, o.alias, o.extension, o.documentation, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val url: FHIRComponentFieldMeta[Canonical] =
      FHIRComponentFieldMeta("url", lTagOf[Canonical], false, lTagOf[Canonical])
    val mode: FHIRComponentFieldMeta[MAP_MODEL_MODE] =
      FHIRComponentFieldMeta("mode", lTagOf[MAP_MODEL_MODE], false, lTagOf[MAP_MODEL_MODE])
    val alias: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("alias", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val documentation: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("documentation", lTagOf[Option[String]], false, lTagOf[String])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, url, mode, alias, extension, documentation, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Structure): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Canonical](url, t.url),
      FHIRComponentField[MAP_MODEL_MODE](mode, t.mode),
      FHIRComponentField[Option[String]](alias, t.alias),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[String]](documentation, t.documentation),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Structure] = this
    val thisName: String                  = "Structure"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Structure] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Structure(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Canonical]("url", None),
            cursor.decodeAs[MAP_MODEL_MODE]("mode", None),
            cursor.decodeAs[Option[String]]("alias", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("documentation", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Structure(
      override val id: Option[String] = None,
      val url: Canonical,
      val mode: MAP_MODEL_MODE,
      val alias: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val documentation: Option[String] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      url: UriStr,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      name: String,
      date: Option[FHIRDateTime] = None,
      title: Option[String] = None,
      status: PUBLICATION_STATUS,
      `import`: LitSeq[Canonical] = LitSeq.empty,
      version: Option[String] = None,
      contact: LitSeq[ContactDetail] = LitSeq.empty,
      purpose: Option[Markdown] = None,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      publisher: Option[String] = None,
      copyright: Option[Markdown] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      useContext: LitSeq[UsageContext] = LitSeq.empty,
      description: Option[Markdown] = None,
      experimental: Option[Boolean] = None,
      jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      structure: LitSeq[StructureMap.Structure] = LitSeq.empty,
      group: NonEmptyLitSeq[StructureMap.Group],
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): StructureMap = new StructureMap(
    id,
    url,
    meta,
    text,
    name,
    date,
    title,
    status,
    `import`,
    version,
    contact,
    purpose,
    language,
    contained,
    extension,
    publisher,
    copyright,
    identifier,
    useContext,
    description,
    experimental,
    jurisdiction,
    implicitRules,
    modifierExtension,
    structure,
    group,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val url: FHIRComponentFieldMeta[UriStr] =
    FHIRComponentFieldMeta("url", lTagOf[UriStr], false, lTagOf[UriStr])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val name: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("name", lTagOf[String], false, lTagOf[String])
  val date: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("date", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val title: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("title", lTagOf[Option[String]], false, lTagOf[String])
  val status: FHIRComponentFieldMeta[PUBLICATION_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[PUBLICATION_STATUS], false, lTagOf[PUBLICATION_STATUS])
  val `import`: FHIRComponentFieldMeta[LitSeq[Canonical]] =
    FHIRComponentFieldMeta("import", lTagOf[LitSeq[Canonical]], false, lTagOf[Canonical])
  val version: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("version", lTagOf[Option[String]], false, lTagOf[String])
  val contact: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("contact", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val purpose: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("purpose", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
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
  val useContext: FHIRComponentFieldMeta[LitSeq[UsageContext]] =
    FHIRComponentFieldMeta("useContext", lTagOf[LitSeq[UsageContext]], false, lTagOf[UsageContext])
  val description: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("description", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val experimental: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("experimental", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val jurisdiction: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("jurisdiction", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val structure: FHIRComponentFieldMeta[LitSeq[StructureMap.Structure]] =
    FHIRComponentFieldMeta("structure", lTagOf[LitSeq[StructureMap.Structure]], false, lTagOf[StructureMap.Structure])
  val group: FHIRComponentFieldMeta[NonEmptyLitSeq[StructureMap.Group]] =
    FHIRComponentFieldMeta("group", lTagOf[NonEmptyLitSeq[StructureMap.Group]], false, lTagOf[StructureMap.Group])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    url,
    meta,
    text,
    name,
    date,
    title,
    status,
    `import`,
    version,
    contact,
    purpose,
    language,
    contained,
    extension,
    publisher,
    copyright,
    identifier,
    useContext,
    description,
    experimental,
    jurisdiction,
    implicitRules,
    modifierExtension,
    structure,
    group
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: StructureMap): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[UriStr](url, t.url),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[String](name, t.name),
    FHIRComponentField[Option[FHIRDateTime]](date, t.date),
    FHIRComponentField[Option[String]](title, t.title),
    FHIRComponentField[PUBLICATION_STATUS](status, t.status),
    FHIRComponentField[LitSeq[Canonical]](`import`, t.`import`),
    FHIRComponentField[Option[String]](version, t.version),
    FHIRComponentField[LitSeq[ContactDetail]](contact, t.contact),
    FHIRComponentField[Option[Markdown]](purpose, t.purpose),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[String]](publisher, t.publisher),
    FHIRComponentField[Option[Markdown]](copyright, t.copyright),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[LitSeq[UsageContext]](useContext, t.useContext),
    FHIRComponentField[Option[Markdown]](description, t.description),
    FHIRComponentField[Option[Boolean]](experimental, t.experimental),
    FHIRComponentField[LitSeq[CodeableConcept]](jurisdiction, t.jurisdiction),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[StructureMap.Structure]](structure, t.structure),
    FHIRComponentField[NonEmptyLitSeq[StructureMap.Group]](group, t.group)
  )
  def extractId(t: StructureMap): Option[String]                        = t.id
  def extractUrl(t: StructureMap): UriStr                               = t.url
  def extractMeta(t: StructureMap): Option[Meta]                        = t.meta
  def extractText(t: StructureMap): Option[Narrative]                   = t.text
  def extractName(t: StructureMap): String                              = t.name
  def extractDate(t: StructureMap): Option[FHIRDateTime]                = t.date
  def extractTitle(t: StructureMap): Option[String]                     = t.title
  def extractStatus(t: StructureMap): PUBLICATION_STATUS                = t.status
  def extractImport(t: StructureMap): LitSeq[Canonical]                 = t.`import`
  def extractVersion(t: StructureMap): Option[String]                   = t.version
  def extractContact(t: StructureMap): LitSeq[ContactDetail]            = t.contact
  def extractPurpose(t: StructureMap): Option[Markdown]                 = t.purpose
  def extractLanguage(t: StructureMap): Option[LANGUAGES]               = t.language
  def extractContained(t: StructureMap): LitSeq[Resource]               = t.contained
  def extractExtension(t: StructureMap): LitSeq[Extension]              = t.extension
  def extractPublisher(t: StructureMap): Option[String]                 = t.publisher
  def extractCopyright(t: StructureMap): Option[Markdown]               = t.copyright
  def extractIdentifier(t: StructureMap): LitSeq[Identifier]            = t.identifier
  def extractUseContext(t: StructureMap): LitSeq[UsageContext]          = t.useContext
  def extractDescription(t: StructureMap): Option[Markdown]             = t.description
  def extractExperimental(t: StructureMap): Option[Boolean]             = t.experimental
  def extractJurisdiction(t: StructureMap): LitSeq[CodeableConcept]     = t.jurisdiction
  def extractImplicitRules(t: StructureMap): Option[UriStr]             = t.implicitRules
  def extractModifierExtension(t: StructureMap): LitSeq[Extension]      = t.modifierExtension
  def extractStructure(t: StructureMap): LitSeq[StructureMap.Structure] = t.structure
  def extractGroup(t: StructureMap): NonEmptyLitSeq[StructureMap.Group] = t.group
  override val thisName: String                                         = "StructureMap"
  override val searchParams: Map[String, StructureMap => Seq[Any]] = Map(
    "jurisdiction"          -> (obj => obj.jurisdiction.toSeq),
    "name"                  -> (obj => Seq(obj.name)),
    "context-type-quantity" -> (obj => obj.useContext.toSeq),
    "description"           -> (obj => obj.description.toSeq),
    "context"               -> (obj => obj.useContext.map(_.value).flatMap(_.as[CodeableConcept]).toSeq),
    "date"                  -> (obj => obj.date.toSeq),
    "context-type"          -> (obj => obj.useContext.map(_.code).toSeq),
    "identifier"            -> (obj => obj.identifier.toSeq),
    "url"                   -> (obj => Seq(obj.url)),
    "context-type-value"    -> (obj => obj.useContext.toSeq),
    "version"               -> (obj => obj.version.toSeq),
    "status"                -> (obj => Seq(obj.status)),
    "publisher"             -> (obj => obj.publisher.toSeq),
    "title"                 -> (obj => obj.title.toSeq),
    "context-quantity" -> (obj =>
      obj.useContext.map(_.value).flatMap(_.as[Quantity]).toSeq ++
        obj.useContext.map(_.value).flatMap(_.as[Range]).toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[StructureMap] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new StructureMap(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[UriStr]("url", None),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[String]("name", None),
          cursor.decodeAs[Option[FHIRDateTime]]("date", Some(None)),
          cursor.decodeAs[Option[String]]("title", Some(None)),
          cursor.decodeAs[PUBLICATION_STATUS]("status", None),
          cursor.decodeAs[LitSeq[Canonical]]("import", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("version", Some(None)),
          cursor.decodeAs[LitSeq[ContactDetail]]("contact", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Markdown]]("purpose", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("publisher", Some(None)),
          cursor.decodeAs[Option[Markdown]]("copyright", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[UsageContext]]("useContext", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Markdown]]("description", Some(None)),
          cursor.decodeAs[Option[Boolean]]("experimental", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("jurisdiction", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[StructureMap.Structure]]("structure", Some(LitSeq.empty)),
          cursor.decodeAs[NonEmptyLitSeq[StructureMap.Group]]("group", None),
          decodeAttributes(cursor)
        )
      ))
}

/** A Map of relationships between 2 structures that can be used to transform data.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields url, name, date, title, status, `import`, version, contact, purpose, publisher, copyright, identifier,
  *   useContext, description, experimental, jurisdiction, structure, group.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param url
  *   - An absolute URI that is used to identify this structure map when it is referenced in a specification, model, design or an
  *   instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at
  *   which an authoritative instance of this structure map is (or will be) published. This URL can be the target of a canonical
  *   reference. It SHALL remain the same when the structure map is stored on different servers.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *   not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *   resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to
  *   make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be
  *   represented in the narrative to ensure clinical safety.
  * @param name
  *   - A natural language name identifying the structure map. This name should be usable as an identifier for the module by
  *   machine processing applications such as code generation.
  * @param date
  *   - The date (and optionally time) when the structure map was published. The date must change when the business version
  *   changes and it must change if the status code changes. In addition, it should change when the substantive content of the
  *   structure map changes.
  * @param title
  *   - A short, descriptive, user-friendly title for the structure map.
  * @param status
  *   - The status of this structure map. Enables tracking the life-cycle of the content.
  * @param `import`
  *   - Other maps used by this map (canonical URLs).
  * @param version
  *   - The identifier that is used to identify this version of the structure map when it is referenced in a specification, model,
  *   design or instance. This is an arbitrary value managed by the structure map author and is not expected to be globally
  *   unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no
  *   expectation that versions can be placed in a lexicographical sequence.
  * @param contact
  *   - Contact details to assist a user in finding and communicating with the publisher.
  * @param purpose
  *   - Explanation of why this structure map is needed and why it has been designed as it has.
  * @param language
  *   - The base language in which the resource is written.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param publisher
  *   - The name of the organization or individual that published the structure map.
  * @param copyright
  *   - A copyright statement relating to the structure map and/or its contents. Copyright statements are generally legal
  *   restrictions on the use and publishing of the structure map.
  * @param identifier
  *   - A formal identifier that is used to identify this structure map when it is represented in other formats, or referenced in
  *   a specification, model, design or an instance.
  * @param useContext
  *   - The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be
  *   general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be
  *   used to assist with indexing and searching for appropriate structure map instances.
  * @param description
  *   - A free text natural language description of the structure map from a consumer's perspective.
  * @param experimental
  *   - A Boolean value to indicate that this structure map is authored for testing purposes (or education/evaluation/marketing)
  *   and is not intended to be used for genuine usage.
  * @param jurisdiction
  *   - A legal or geographic region in which the structure map is intended to be used.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *   the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually
  *   modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict
  *   set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param structure
  *   - A structure definition used by this map. The structure definition may describe instances that are converted, or the
  *   instances that are produced.
  * @param group
  *   - Organizes the mapping into manageable chunks for human review/ease of maintenance.
  */
@POJOBoilerplate
class StructureMap(
    override val id: Option[String] = None,
    val url: UriStr,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val name: String,
    val date: Option[FHIRDateTime] = None,
    val title: Option[String] = None,
    val status: PUBLICATION_STATUS,
    val `import`: LitSeq[Canonical] = LitSeq.empty,
    val version: Option[String] = None,
    val contact: LitSeq[ContactDetail] = LitSeq.empty,
    val purpose: Option[Markdown] = None,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val publisher: Option[String] = None,
    val copyright: Option[Markdown] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val useContext: LitSeq[UsageContext] = LitSeq.empty,
    val description: Option[Markdown] = None,
    val experimental: Option[Boolean] = None,
    val jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val structure: LitSeq[StructureMap.Structure] = LitSeq.empty,
    val group: NonEmptyLitSeq[StructureMap.Group],
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
  override val thisTypeName: String = "StructureMap"
}
