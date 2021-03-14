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
import com.babylonhealth.lit.hl7.{ RESOURCE_TYPES, PUBLICATION_STATUS, EXAMPLESCENARIO_ACTOR_TYPE }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object ExampleScenario extends CompanionFor[ExampleScenario] {
  override val baseType: CompanionFor[ExampleScenario] = ExampleScenario
  object Instance extends CompanionFor[Instance] {
    object Version extends CompanionFor[Version] {
      def apply(
          id: Option[String] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          versionId: String,
          description: Markdown,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Version = new Version(
        id,
        extension,
        versionId,
        description,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(o: Version): Option[(Option[String], LitSeq[Extension], String, Markdown, LitSeq[Extension])] = Some(
        (o.id, o.extension, o.versionId, o.description, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val versionId: FHIRComponentFieldMeta[String] =
        FHIRComponentFieldMeta("versionId", lTagOf[String], false, lTagOf[String])
      val description: FHIRComponentFieldMeta[Markdown] =
        FHIRComponentFieldMeta("description", lTagOf[Markdown], false, lTagOf[Markdown])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, extension, versionId, description, modifierExtension)
      override def fields(t: Version): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[String](versionId, t.versionId),
        FHIRComponentField[Markdown](description, t.description),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Version] = this
      val thisName: String                = "Version"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Version] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Version(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[String]("versionId", None),
              cursor.decodeAs[Markdown]("description", None),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Version(
        override val id: Option[String] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val versionId: String,
        val description: Markdown,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object ContainedInstance extends CompanionFor[ContainedInstance] {
      def apply(
          id: Option[String] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          versionId: Option[String] = None,
          resourceId: String,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): ContainedInstance = new ContainedInstance(
        id,
        extension,
        versionId,
        resourceId,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: ContainedInstance): Option[(Option[String], LitSeq[Extension], Option[String], String, LitSeq[Extension])] =
        Some((o.id, o.extension, o.versionId, o.resourceId, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val versionId: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("versionId", lTagOf[Option[String]], false, lTagOf[String])
      val resourceId: FHIRComponentFieldMeta[String] =
        FHIRComponentFieldMeta("resourceId", lTagOf[String], false, lTagOf[String])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, extension, versionId, resourceId, modifierExtension)
      override def fields(t: ContainedInstance): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[String]](versionId, t.versionId),
        FHIRComponentField[String](resourceId, t.resourceId),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[ContainedInstance] = this
      val thisName: String                          = "ContainedInstance"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ContainedInstance] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new ContainedInstance(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[String]]("versionId", Some(None)),
              cursor.decodeAs[String]("resourceId", None),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class ContainedInstance(
        override val id: Option[String] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val versionId: Option[String] = None,
        val resourceId: String,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        name: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        resourceId: String,
        description: Option[Markdown] = None,
        resourceType: RESOURCE_TYPES,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        version: LitSeq[Instance.Version] = LitSeq.empty,
        containedInstance: LitSeq[Instance.ContainedInstance] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Instance = new Instance(
      id,
      name,
      extension,
      resourceId,
      description,
      resourceType,
      modifierExtension,
      version,
      containedInstance,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Instance): Option[(Option[String], Option[String], LitSeq[Extension], String, Option[Markdown], RESOURCE_TYPES, LitSeq[Extension], LitSeq[Instance.Version], LitSeq[Instance.ContainedInstance])] =
      Some(
        (
          o.id,
          o.name,
          o.extension,
          o.resourceId,
          o.description,
          o.resourceType,
          o.modifierExtension,
          o.version,
          o.containedInstance))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val name: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("name", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val resourceId: FHIRComponentFieldMeta[String] =
      FHIRComponentFieldMeta("resourceId", lTagOf[String], false, lTagOf[String])
    val description: FHIRComponentFieldMeta[Option[Markdown]] =
      FHIRComponentFieldMeta("description", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
    val resourceType: FHIRComponentFieldMeta[RESOURCE_TYPES] =
      FHIRComponentFieldMeta("resourceType", lTagOf[RESOURCE_TYPES], false, lTagOf[RESOURCE_TYPES])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val version: FHIRComponentFieldMeta[LitSeq[Instance.Version]] =
      FHIRComponentFieldMeta("version", lTagOf[LitSeq[Instance.Version]], false, lTagOf[Instance.Version])
    val containedInstance: FHIRComponentFieldMeta[LitSeq[Instance.ContainedInstance]] =
      FHIRComponentFieldMeta(
        "containedInstance",
        lTagOf[LitSeq[Instance.ContainedInstance]],
        false,
        lTagOf[Instance.ContainedInstance])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, name, extension, resourceId, description, resourceType, modifierExtension, version, containedInstance)
    override def fields(t: Instance): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[String]](name, t.name),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[String](resourceId, t.resourceId),
      FHIRComponentField[Option[Markdown]](description, t.description),
      FHIRComponentField[RESOURCE_TYPES](resourceType, t.resourceType),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[Instance.Version]](version, t.version),
      FHIRComponentField[LitSeq[Instance.ContainedInstance]](containedInstance, t.containedInstance)
    )
    val baseType: CompanionFor[Instance] = this
    val thisName: String                 = "Instance"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Instance] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Instance(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[String]]("name", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[String]("resourceId", None),
            cursor.decodeAs[Option[Markdown]]("description", Some(None)),
            cursor.decodeAs[RESOURCE_TYPES]("resourceType", None),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Instance.Version]]("version", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Instance.ContainedInstance]]("containedInstance", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Instance(
      override val id: Option[String] = None,
      val name: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val resourceId: String,
      val description: Option[Markdown] = None,
      val resourceType: RESOURCE_TYPES,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val version: LitSeq[Instance.Version] = LitSeq.empty,
      val containedInstance: LitSeq[Instance.ContainedInstance] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Process extends CompanionFor[Process] {
    object Step extends CompanionFor[Step] {
      object Operation extends CompanionFor[Operation] {
        def apply(
            id: Option[String] = None,
            `type`: Option[String] = None,
            name: Option[String] = None,
            number: String,
            request: Option[ExampleScenario.Instance.ContainedInstance] = None,
            receiver: Option[String] = None,
            response: Option[ExampleScenario.Instance.ContainedInstance] = None,
            extension: LitSeq[Extension] = LitSeq.empty,
            initiator: Option[String] = None,
            description: Option[Markdown] = None,
            receiverActive: Option[Boolean] = None,
            initiatorActive: Option[Boolean] = None,
            modifierExtension: LitSeq[Extension] = LitSeq.empty,
            primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
        ): Operation = new Operation(
          id,
          `type`,
          name,
          number,
          request,
          receiver,
          response,
          extension,
          initiator,
          description,
          receiverActive,
          initiatorActive,
          modifierExtension,
          primitiveAttributes = primitiveAttributes
        )
        def unapply(
            o: Operation): Option[(Option[String], Option[String], Option[String], String, Option[ExampleScenario.Instance.ContainedInstance], Option[String], Option[ExampleScenario.Instance.ContainedInstance], LitSeq[Extension], Option[String], Option[Markdown], Option[Boolean], Option[Boolean], LitSeq[Extension])] =
          Some(
            (
              o.id,
              o.`type`,
              o.name,
              o.number,
              o.request,
              o.receiver,
              o.response,
              o.extension,
              o.initiator,
              o.description,
              o.receiverActive,
              o.initiatorActive,
              o.modifierExtension))
        val id: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
        val `type`: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("type", lTagOf[Option[String]], false, lTagOf[String])
        val name: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("name", lTagOf[Option[String]], false, lTagOf[String])
        val number: FHIRComponentFieldMeta[String] =
          FHIRComponentFieldMeta("number", lTagOf[String], false, lTagOf[String])
        val request: FHIRComponentFieldMeta[Option[ExampleScenario.Instance.ContainedInstance]] =
          FHIRComponentFieldMeta(
            "request",
            lTagOf[Option[ExampleScenario.Instance.ContainedInstance]],
            false,
            lTagOf[ExampleScenario.Instance.ContainedInstance])
        val receiver: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("receiver", lTagOf[Option[String]], false, lTagOf[String])
        val response: FHIRComponentFieldMeta[Option[ExampleScenario.Instance.ContainedInstance]] =
          FHIRComponentFieldMeta(
            "response",
            lTagOf[Option[ExampleScenario.Instance.ContainedInstance]],
            false,
            lTagOf[ExampleScenario.Instance.ContainedInstance])
        val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val initiator: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("initiator", lTagOf[Option[String]], false, lTagOf[String])
        val description: FHIRComponentFieldMeta[Option[Markdown]] =
          FHIRComponentFieldMeta("description", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
        val receiverActive: FHIRComponentFieldMeta[Option[Boolean]] =
          FHIRComponentFieldMeta("receiverActive", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
        val initiatorActive: FHIRComponentFieldMeta[Option[Boolean]] =
          FHIRComponentFieldMeta("initiatorActive", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
        val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
          id,
          `type`,
          name,
          number,
          request,
          receiver,
          response,
          extension,
          initiator,
          description,
          receiverActive,
          initiatorActive,
          modifierExtension)
        override def fields(t: Operation): Seq[FHIRComponentField[_]] = Seq(
          FHIRComponentField[Option[String]](id, t.id),
          FHIRComponentField[Option[String]](`type`, t.`type`),
          FHIRComponentField[Option[String]](name, t.name),
          FHIRComponentField[String](number, t.number),
          FHIRComponentField[Option[ExampleScenario.Instance.ContainedInstance]](request, t.request),
          FHIRComponentField[Option[String]](receiver, t.receiver),
          FHIRComponentField[Option[ExampleScenario.Instance.ContainedInstance]](response, t.response),
          FHIRComponentField[LitSeq[Extension]](extension, t.extension),
          FHIRComponentField[Option[String]](initiator, t.initiator),
          FHIRComponentField[Option[Markdown]](description, t.description),
          FHIRComponentField[Option[Boolean]](receiverActive, t.receiverActive),
          FHIRComponentField[Option[Boolean]](initiatorActive, t.initiatorActive),
          FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
        )
        val baseType: CompanionFor[Operation] = this
        val thisName: String                  = "Operation"
        def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Operation] =
          checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
            Try(
              new Operation(
                cursor.decodeAs[Option[String]]("id", Some(None)),
                cursor.decodeAs[Option[String]]("type", Some(None)),
                cursor.decodeAs[Option[String]]("name", Some(None)),
                cursor.decodeAs[String]("number", None),
                cursor.decodeAs[Option[ExampleScenario.Instance.ContainedInstance]]("request", Some(None)),
                cursor.decodeAs[Option[String]]("receiver", Some(None)),
                cursor.decodeAs[Option[ExampleScenario.Instance.ContainedInstance]]("response", Some(None)),
                cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
                cursor.decodeAs[Option[String]]("initiator", Some(None)),
                cursor.decodeAs[Option[Markdown]]("description", Some(None)),
                cursor.decodeAs[Option[Boolean]]("receiverActive", Some(None)),
                cursor.decodeAs[Option[Boolean]]("initiatorActive", Some(None)),
                cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
                decodeAttributes(cursor)
              )
            ))
      }
      @POJOBoilerplate
      class Operation(
          override val id: Option[String] = None,
          val `type`: Option[String] = None,
          val name: Option[String] = None,
          val number: String,
          val request: Option[ExampleScenario.Instance.ContainedInstance] = None,
          val receiver: Option[String] = None,
          val response: Option[ExampleScenario.Instance.ContainedInstance] = None,
          override val extension: LitSeq[Extension] = LitSeq.empty,
          val initiator: Option[String] = None,
          val description: Option[Markdown] = None,
          val receiverActive: Option[Boolean] = None,
          val initiatorActive: Option[Boolean] = None,
          override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
          override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
            FHIRObject.emptyAtts)
          extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
      object Alternative extends CompanionFor[Alternative] {
        def apply(
            id: Option[String] = None,
            step: LitSeq[ExampleScenario.Process.Step] = LitSeq.empty,
            title: String,
            extension: LitSeq[Extension] = LitSeq.empty,
            description: Option[Markdown] = None,
            modifierExtension: LitSeq[Extension] = LitSeq.empty,
            primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
        ): Alternative = new Alternative(
          id,
          step,
          title,
          extension,
          description,
          modifierExtension,
          primitiveAttributes = primitiveAttributes
        )
        def unapply(
            o: Alternative): Option[(Option[String], LitSeq[ExampleScenario.Process.Step], String, LitSeq[Extension], Option[Markdown], LitSeq[Extension])] =
          Some((o.id, o.step, o.title, o.extension, o.description, o.modifierExtension))
        val id: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
        val step: FHIRComponentFieldMeta[LitSeq[ExampleScenario.Process.Step]] =
          FHIRComponentFieldMeta(
            "step",
            lTagOf[LitSeq[ExampleScenario.Process.Step]],
            false,
            lTagOf[ExampleScenario.Process.Step])
        val title: FHIRComponentFieldMeta[String] =
          FHIRComponentFieldMeta("title", lTagOf[String], false, lTagOf[String])
        val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val description: FHIRComponentFieldMeta[Option[Markdown]] =
          FHIRComponentFieldMeta("description", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
        val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, step, title, extension, description, modifierExtension)
        override def fields(t: Alternative): Seq[FHIRComponentField[_]] = Seq(
          FHIRComponentField[Option[String]](id, t.id),
          FHIRComponentField[LitSeq[ExampleScenario.Process.Step]](step, t.step),
          FHIRComponentField[String](title, t.title),
          FHIRComponentField[LitSeq[Extension]](extension, t.extension),
          FHIRComponentField[Option[Markdown]](description, t.description),
          FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
        )
        val baseType: CompanionFor[Alternative] = this
        val thisName: String                    = "Alternative"
        def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Alternative] =
          checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
            Try(
              new Alternative(
                cursor.decodeAs[Option[String]]("id", Some(None)),
                cursor.decodeAs[LitSeq[ExampleScenario.Process.Step]]("step", Some(LitSeq.empty)),
                cursor.decodeAs[String]("title", None),
                cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
                cursor.decodeAs[Option[Markdown]]("description", Some(None)),
                cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
                decodeAttributes(cursor)
              )
            ))
      }
      @POJOBoilerplate
      class Alternative(
          override val id: Option[String] = None,
          val step: LitSeq[ExampleScenario.Process.Step] = LitSeq.empty,
          val title: String,
          override val extension: LitSeq[Extension] = LitSeq.empty,
          val description: Option[Markdown] = None,
          override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
          override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
            FHIRObject.emptyAtts)
          extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
      def apply(
          id: Option[String] = None,
          pause: Option[Boolean] = None,
          process: LitSeq[ExampleScenario.Process] = LitSeq.empty,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          operation: Option[Step.Operation] = None,
          alternative: LitSeq[Step.Alternative] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Step = new Step(
        id,
        pause,
        process,
        extension,
        modifierExtension,
        operation,
        alternative,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Step): Option[(Option[String], Option[Boolean], LitSeq[ExampleScenario.Process], LitSeq[Extension], LitSeq[Extension], Option[Step.Operation], LitSeq[Step.Alternative])] =
        Some((o.id, o.pause, o.process, o.extension, o.modifierExtension, o.operation, o.alternative))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val pause: FHIRComponentFieldMeta[Option[Boolean]] =
        FHIRComponentFieldMeta("pause", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
      val process: FHIRComponentFieldMeta[LitSeq[ExampleScenario.Process]] =
        FHIRComponentFieldMeta(
          "process",
          lTagOf[LitSeq[ExampleScenario.Process]],
          false,
          lTagOf[ExampleScenario.Process])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val operation: FHIRComponentFieldMeta[Option[Step.Operation]] =
        FHIRComponentFieldMeta("operation", lTagOf[Option[Step.Operation]], false, lTagOf[Step.Operation])
      val alternative: FHIRComponentFieldMeta[LitSeq[Step.Alternative]] =
        FHIRComponentFieldMeta("alternative", lTagOf[LitSeq[Step.Alternative]], false, lTagOf[Step.Alternative])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
        Seq(id, pause, process, extension, modifierExtension, operation, alternative)
      override def fields(t: Step): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[Boolean]](pause, t.pause),
        FHIRComponentField[LitSeq[ExampleScenario.Process]](process, t.process),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
        FHIRComponentField[Option[Step.Operation]](operation, t.operation),
        FHIRComponentField[LitSeq[Step.Alternative]](alternative, t.alternative)
      )
      val baseType: CompanionFor[Step] = this
      val thisName: String             = "Step"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Step] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Step(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[Boolean]]("pause", Some(None)),
              cursor.decodeAs[LitSeq[ExampleScenario.Process]]("process", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[Step.Operation]]("operation", Some(None)),
              cursor.decodeAs[LitSeq[Step.Alternative]]("alternative", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Step(
        override val id: Option[String] = None,
        val pause: Option[Boolean] = None,
        val process: LitSeq[ExampleScenario.Process] = LitSeq.empty,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        val operation: Option[Step.Operation] = None,
        val alternative: LitSeq[Step.Alternative] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        title: String,
        extension: LitSeq[Extension] = LitSeq.empty,
        description: Option[Markdown] = None,
        preConditions: Option[Markdown] = None,
        postConditions: Option[Markdown] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        step: LitSeq[Process.Step] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Process = new Process(
      id,
      title,
      extension,
      description,
      preConditions,
      postConditions,
      modifierExtension,
      step,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Process): Option[(Option[String], String, LitSeq[Extension], Option[Markdown], Option[Markdown], Option[Markdown], LitSeq[Extension], LitSeq[Process.Step])] =
      Some((o.id, o.title, o.extension, o.description, o.preConditions, o.postConditions, o.modifierExtension, o.step))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val title: FHIRComponentFieldMeta[String] =
      FHIRComponentFieldMeta("title", lTagOf[String], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val description: FHIRComponentFieldMeta[Option[Markdown]] =
      FHIRComponentFieldMeta("description", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
    val preConditions: FHIRComponentFieldMeta[Option[Markdown]] =
      FHIRComponentFieldMeta("preConditions", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
    val postConditions: FHIRComponentFieldMeta[Option[Markdown]] =
      FHIRComponentFieldMeta("postConditions", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val step: FHIRComponentFieldMeta[LitSeq[Process.Step]] =
      FHIRComponentFieldMeta("step", lTagOf[LitSeq[Process.Step]], false, lTagOf[Process.Step])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, title, extension, description, preConditions, postConditions, modifierExtension, step)
    override def fields(t: Process): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[String](title, t.title),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Markdown]](description, t.description),
      FHIRComponentField[Option[Markdown]](preConditions, t.preConditions),
      FHIRComponentField[Option[Markdown]](postConditions, t.postConditions),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[Process.Step]](step, t.step)
    )
    val baseType: CompanionFor[Process] = this
    val thisName: String                = "Process"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Process] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Process(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[String]("title", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Markdown]]("description", Some(None)),
            cursor.decodeAs[Option[Markdown]]("preConditions", Some(None)),
            cursor.decodeAs[Option[Markdown]]("postConditions", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Process.Step]]("step", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Process(
      override val id: Option[String] = None,
      val title: String,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val description: Option[Markdown] = None,
      val preConditions: Option[Markdown] = None,
      val postConditions: Option[Markdown] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val step: LitSeq[Process.Step] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Actor extends CompanionFor[Actor] {
    def apply(
        id: Option[String] = None,
        `type`: EXAMPLESCENARIO_ACTOR_TYPE,
        name: Option[String] = None,
        actorId: String,
        extension: LitSeq[Extension] = LitSeq.empty,
        description: Option[Markdown] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Actor = new Actor(
      id,
      `type`,
      name,
      actorId,
      extension,
      description,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Actor): Option[(Option[String], EXAMPLESCENARIO_ACTOR_TYPE, Option[String], String, LitSeq[Extension], Option[Markdown], LitSeq[Extension])] =
      Some((o.id, o.`type`, o.name, o.actorId, o.extension, o.description, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[EXAMPLESCENARIO_ACTOR_TYPE] =
      FHIRComponentFieldMeta("type", lTagOf[EXAMPLESCENARIO_ACTOR_TYPE], false, lTagOf[EXAMPLESCENARIO_ACTOR_TYPE])
    val name: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("name", lTagOf[Option[String]], false, lTagOf[String])
    val actorId: FHIRComponentFieldMeta[String] =
      FHIRComponentFieldMeta("actorId", lTagOf[String], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val description: FHIRComponentFieldMeta[Option[Markdown]] =
      FHIRComponentFieldMeta("description", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, `type`, name, actorId, extension, description, modifierExtension)
    override def fields(t: Actor): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[EXAMPLESCENARIO_ACTOR_TYPE](`type`, t.`type`),
      FHIRComponentField[Option[String]](name, t.name),
      FHIRComponentField[String](actorId, t.actorId),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Markdown]](description, t.description),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Actor] = this
    val thisName: String              = "Actor"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Actor] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Actor(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[EXAMPLESCENARIO_ACTOR_TYPE]("type", None),
            cursor.decodeAs[Option[String]]("name", Some(None)),
            cursor.decodeAs[String]("actorId", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Markdown]]("description", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Actor(
      override val id: Option[String] = None,
      val `type`: EXAMPLESCENARIO_ACTOR_TYPE,
      val name: Option[String] = None,
      val actorId: String,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val description: Option[Markdown] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      url: Option[UriStr] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      name: Option[String] = None,
      date: Option[FHIRDateTime] = None,
      status: PUBLICATION_STATUS,
      version: Option[String] = None,
      contact: LitSeq[ContactDetail] = LitSeq.empty,
      purpose: Option[Markdown] = None,
      language: Option[LANGUAGES] = None,
      workflow: LitSeq[Canonical] = LitSeq.empty,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      publisher: Option[String] = None,
      copyright: Option[Markdown] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      useContext: LitSeq[UsageContext] = LitSeq.empty,
      experimental: Option[Boolean] = None,
      jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      actor: LitSeq[ExampleScenario.Actor] = LitSeq.empty,
      process: LitSeq[ExampleScenario.Process] = LitSeq.empty,
      instance: LitSeq[ExampleScenario.Instance] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): ExampleScenario = new ExampleScenario(
    id,
    url,
    meta,
    text,
    name,
    date,
    status,
    version,
    contact,
    purpose,
    language,
    workflow,
    contained,
    extension,
    publisher,
    copyright,
    identifier,
    useContext,
    experimental,
    jurisdiction,
    implicitRules,
    modifierExtension,
    actor,
    process,
    instance,
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
  val date: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("date", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val status: FHIRComponentFieldMeta[PUBLICATION_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[PUBLICATION_STATUS], false, lTagOf[PUBLICATION_STATUS])
  val version: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("version", lTagOf[Option[String]], false, lTagOf[String])
  val contact: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("contact", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val purpose: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("purpose", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val workflow: FHIRComponentFieldMeta[LitSeq[Canonical]] =
    FHIRComponentFieldMeta("workflow", lTagOf[LitSeq[Canonical]], false, lTagOf[Canonical])
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
  val experimental: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("experimental", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val jurisdiction: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("jurisdiction", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val actor: FHIRComponentFieldMeta[LitSeq[ExampleScenario.Actor]] =
    FHIRComponentFieldMeta("actor", lTagOf[LitSeq[ExampleScenario.Actor]], false, lTagOf[ExampleScenario.Actor])
  val process: FHIRComponentFieldMeta[LitSeq[ExampleScenario.Process]] =
    FHIRComponentFieldMeta("process", lTagOf[LitSeq[ExampleScenario.Process]], false, lTagOf[ExampleScenario.Process])
  val instance: FHIRComponentFieldMeta[LitSeq[ExampleScenario.Instance]] =
    FHIRComponentFieldMeta(
      "instance",
      lTagOf[LitSeq[ExampleScenario.Instance]],
      false,
      lTagOf[ExampleScenario.Instance])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    url,
    meta,
    text,
    name,
    date,
    status,
    version,
    contact,
    purpose,
    language,
    workflow,
    contained,
    extension,
    publisher,
    copyright,
    identifier,
    useContext,
    experimental,
    jurisdiction,
    implicitRules,
    modifierExtension,
    actor,
    process,
    instance
  )
  override def fields(t: ExampleScenario): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[UriStr]](url, t.url),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[String]](name, t.name),
    FHIRComponentField[Option[FHIRDateTime]](date, t.date),
    FHIRComponentField[PUBLICATION_STATUS](status, t.status),
    FHIRComponentField[Option[String]](version, t.version),
    FHIRComponentField[LitSeq[ContactDetail]](contact, t.contact),
    FHIRComponentField[Option[Markdown]](purpose, t.purpose),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Canonical]](workflow, t.workflow),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[String]](publisher, t.publisher),
    FHIRComponentField[Option[Markdown]](copyright, t.copyright),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[LitSeq[UsageContext]](useContext, t.useContext),
    FHIRComponentField[Option[Boolean]](experimental, t.experimental),
    FHIRComponentField[LitSeq[CodeableConcept]](jurisdiction, t.jurisdiction),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[ExampleScenario.Actor]](actor, t.actor),
    FHIRComponentField[LitSeq[ExampleScenario.Process]](process, t.process),
    FHIRComponentField[LitSeq[ExampleScenario.Instance]](instance, t.instance)
  )
  def extractId(t: ExampleScenario): Option[String]                         = t.id
  def extractUrl(t: ExampleScenario): Option[UriStr]                        = t.url
  def extractMeta(t: ExampleScenario): Option[Meta]                         = t.meta
  def extractText(t: ExampleScenario): Option[Narrative]                    = t.text
  def extractName(t: ExampleScenario): Option[String]                       = t.name
  def extractDate(t: ExampleScenario): Option[FHIRDateTime]                 = t.date
  def extractStatus(t: ExampleScenario): PUBLICATION_STATUS                 = t.status
  def extractVersion(t: ExampleScenario): Option[String]                    = t.version
  def extractContact(t: ExampleScenario): LitSeq[ContactDetail]             = t.contact
  def extractPurpose(t: ExampleScenario): Option[Markdown]                  = t.purpose
  def extractLanguage(t: ExampleScenario): Option[LANGUAGES]                = t.language
  def extractWorkflow(t: ExampleScenario): LitSeq[Canonical]                = t.workflow
  def extractContained(t: ExampleScenario): LitSeq[Resource]                = t.contained
  def extractExtension(t: ExampleScenario): LitSeq[Extension]               = t.extension
  def extractPublisher(t: ExampleScenario): Option[String]                  = t.publisher
  def extractCopyright(t: ExampleScenario): Option[Markdown]                = t.copyright
  def extractIdentifier(t: ExampleScenario): LitSeq[Identifier]             = t.identifier
  def extractUseContext(t: ExampleScenario): LitSeq[UsageContext]           = t.useContext
  def extractExperimental(t: ExampleScenario): Option[Boolean]              = t.experimental
  def extractJurisdiction(t: ExampleScenario): LitSeq[CodeableConcept]      = t.jurisdiction
  def extractImplicitRules(t: ExampleScenario): Option[UriStr]              = t.implicitRules
  def extractModifierExtension(t: ExampleScenario): LitSeq[Extension]       = t.modifierExtension
  def extractActor(t: ExampleScenario): LitSeq[ExampleScenario.Actor]       = t.actor
  def extractProcess(t: ExampleScenario): LitSeq[ExampleScenario.Process]   = t.process
  def extractInstance(t: ExampleScenario): LitSeq[ExampleScenario.Instance] = t.instance
  override val thisName: String                                             = "ExampleScenario"
  override val searchParams: Map[String, ExampleScenario => Seq[Any]] = Map(
    "jurisdiction"          -> (obj => obj.jurisdiction.toSeq),
    "name"                  -> (obj => obj.name.toSeq),
    "context-type-quantity" -> (obj => obj.useContext.toSeq),
    "context"               -> (obj => obj.useContext.map(_.value).flatMap(_.as[CodeableConcept]).toSeq),
    "date"                  -> (obj => obj.date.toSeq),
    "context-quantity" -> (obj =>
      obj.useContext.map(_.value).flatMap(_.as[Quantity]).toSeq ++
        obj.useContext.map(_.value).flatMap(_.as[Range]).toSeq),
    "context-type"       -> (obj => obj.useContext.map(_.code).toSeq),
    "identifier"         -> (obj => obj.identifier.toSeq),
    "url"                -> (obj => obj.url.toSeq),
    "context-type-value" -> (obj => obj.useContext.toSeq),
    "version"            -> (obj => obj.version.toSeq),
    "status"             -> (obj => Seq(obj.status)),
    "publisher"          -> (obj => obj.publisher.toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ExampleScenario] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new ExampleScenario(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[UriStr]]("url", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[String]]("name", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("date", Some(None)),
          cursor.decodeAs[PUBLICATION_STATUS]("status", None),
          cursor.decodeAs[Option[String]]("version", Some(None)),
          cursor.decodeAs[LitSeq[ContactDetail]]("contact", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Markdown]]("purpose", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Canonical]]("workflow", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("publisher", Some(None)),
          cursor.decodeAs[Option[Markdown]]("copyright", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[UsageContext]]("useContext", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Boolean]]("experimental", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("jurisdiction", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[ExampleScenario.Actor]]("actor", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[ExampleScenario.Process]]("process", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[ExampleScenario.Instance]]("instance", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Example of workflow instance.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields url, name, date, status, version, contact, purpose, workflow, publisher, copyright, identifier, useContext, experimental, jurisdiction, actor, process, instance.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param url - An absolute URI that is used to identify this example scenario when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative instance of this example scenario is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the example scenario is stored on different servers.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param name - A natural language name identifying the example scenario. This name should be usable as an identifier for the module by machine processing applications such as code generation.
  * @param date - The date  (and optionally time) when the example scenario was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the example scenario changes. (e.g. the 'content logical definition').
  * @param status - The status of this example scenario. Enables tracking the life-cycle of the content.
  * @param version - The identifier that is used to identify this version of the example scenario when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the example scenario author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.
  * @param contact - Contact details to assist a user in finding and communicating with the publisher.
  * @param purpose - What the example scenario resource is created for. This should not be used to show the business purpose of the scenario itself, but the purpose of documenting a scenario.
  * @param language - The base language in which the resource is written.
  * @param workflow - Another nested workflow.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param publisher - The name of the organization or individual that published the example scenario.
  * @param copyright - A copyright statement relating to the example scenario and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the example scenario.
  * @param identifier - A formal identifier that is used to identify this example scenario when it is represented in other formats, or referenced in a specification, model, design or an instance.
  * @param useContext - The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate example scenario instances.
  * @param experimental - A Boolean value to indicate that this example scenario is authored for testing purposes (or education/evaluation/marketing) and is not intended to be used for genuine usage.
  * @param jurisdiction - A legal or geographic region in which the example scenario is intended to be used.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param actor - Actor participating in the resource.
  * @param process - Each major process - a group of operations.
  * @param instance - Each resource and each version that is present in the workflow.
  */
@POJOBoilerplate
class ExampleScenario(
    override val id: Option[String] = None,
    val url: Option[UriStr] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val name: Option[String] = None,
    val date: Option[FHIRDateTime] = None,
    val status: PUBLICATION_STATUS,
    val version: Option[String] = None,
    val contact: LitSeq[ContactDetail] = LitSeq.empty,
    val purpose: Option[Markdown] = None,
    override val language: Option[LANGUAGES] = None,
    val workflow: LitSeq[Canonical] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val publisher: Option[String] = None,
    val copyright: Option[Markdown] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val useContext: LitSeq[UsageContext] = LitSeq.empty,
    val experimental: Option[Boolean] = None,
    val jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val actor: LitSeq[ExampleScenario.Actor] = LitSeq.empty,
    val process: LitSeq[ExampleScenario.Process] = LitSeq.empty,
    val instance: LitSeq[ExampleScenario.Instance] = LitSeq.empty,
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
  override val thisTypeName: String = "ExampleScenario"
}
