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
import com.babylonhealth.lit.hl7.{
  REPORT_RESULT_CODES,
  REPORT_PARTICIPANT_TYPE,
  REPORT_ACTION_RESULT_CODES,
  REPORT_STATUS_CODES
}
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object TestReport extends CompanionFor[TestReport] {
  override val baseType: CompanionFor[TestReport] = TestReport
  object Setup extends CompanionFor[Setup] {
    object Action extends CompanionFor[Action] {
      object Assert extends CompanionFor[Assert] {
        def apply(
            id: Option[String] = None,
            result: REPORT_ACTION_RESULT_CODES,
            detail: Option[String] = None,
            message: Option[Markdown] = None,
            extension: LitSeq[Extension] = LitSeq.empty,
            modifierExtension: LitSeq[Extension] = LitSeq.empty,
            primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
        ): Assert = new Assert(
          id,
          result,
          detail,
          message,
          extension,
          modifierExtension,
          primitiveAttributes = primitiveAttributes
        )
        def unapply(
            o: Assert): Option[(Option[String], REPORT_ACTION_RESULT_CODES, Option[String], Option[Markdown], LitSeq[Extension], LitSeq[Extension])] =
          Some((o.id, o.result, o.detail, o.message, o.extension, o.modifierExtension))
        val id: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
        val result: FHIRComponentFieldMeta[REPORT_ACTION_RESULT_CODES] =
          FHIRComponentFieldMeta(
            "result",
            lTagOf[REPORT_ACTION_RESULT_CODES],
            false,
            lTagOf[REPORT_ACTION_RESULT_CODES])
        val detail: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("detail", lTagOf[Option[String]], false, lTagOf[String])
        val message: FHIRComponentFieldMeta[Option[Markdown]] =
          FHIRComponentFieldMeta("message", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
        val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, result, detail, message, extension, modifierExtension)
        override def fields(t: Assert): Seq[FHIRComponentField[_]] = Seq(
          FHIRComponentField[Option[String]](id, t.id),
          FHIRComponentField[REPORT_ACTION_RESULT_CODES](result, t.result),
          FHIRComponentField[Option[String]](detail, t.detail),
          FHIRComponentField[Option[Markdown]](message, t.message),
          FHIRComponentField[LitSeq[Extension]](extension, t.extension),
          FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
        )
        val baseType: CompanionFor[Assert] = this
        val thisName: String               = "Assert"
        def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Assert] =
          checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
            Try(
              new Assert(
                cursor.decodeAs[Option[String]]("id", Some(None)),
                cursor.decodeAs[REPORT_ACTION_RESULT_CODES]("result", None),
                cursor.decodeAs[Option[String]]("detail", Some(None)),
                cursor.decodeAs[Option[Markdown]]("message", Some(None)),
                cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
                cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
                decodeAttributes(cursor)
              )
            ))
      }
      @POJOBoilerplate
      class Assert(
          override val id: Option[String] = None,
          val result: REPORT_ACTION_RESULT_CODES,
          val detail: Option[String] = None,
          val message: Option[Markdown] = None,
          override val extension: LitSeq[Extension] = LitSeq.empty,
          override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
          override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
            FHIRObject.emptyAtts)
          extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
      object Operation extends CompanionFor[Operation] {
        def apply(
            id: Option[String] = None,
            result: REPORT_ACTION_RESULT_CODES,
            detail: Option[UriStr] = None,
            message: Option[Markdown] = None,
            extension: LitSeq[Extension] = LitSeq.empty,
            modifierExtension: LitSeq[Extension] = LitSeq.empty,
            primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
        ): Operation = new Operation(
          id,
          result,
          detail,
          message,
          extension,
          modifierExtension,
          primitiveAttributes = primitiveAttributes
        )
        def unapply(
            o: Operation): Option[(Option[String], REPORT_ACTION_RESULT_CODES, Option[UriStr], Option[Markdown], LitSeq[Extension], LitSeq[Extension])] =
          Some((o.id, o.result, o.detail, o.message, o.extension, o.modifierExtension))
        val id: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
        val result: FHIRComponentFieldMeta[REPORT_ACTION_RESULT_CODES] =
          FHIRComponentFieldMeta(
            "result",
            lTagOf[REPORT_ACTION_RESULT_CODES],
            false,
            lTagOf[REPORT_ACTION_RESULT_CODES])
        val detail: FHIRComponentFieldMeta[Option[UriStr]] =
          FHIRComponentFieldMeta("detail", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
        val message: FHIRComponentFieldMeta[Option[Markdown]] =
          FHIRComponentFieldMeta("message", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
        val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, result, detail, message, extension, modifierExtension)
        override def fields(t: Operation): Seq[FHIRComponentField[_]] = Seq(
          FHIRComponentField[Option[String]](id, t.id),
          FHIRComponentField[REPORT_ACTION_RESULT_CODES](result, t.result),
          FHIRComponentField[Option[UriStr]](detail, t.detail),
          FHIRComponentField[Option[Markdown]](message, t.message),
          FHIRComponentField[LitSeq[Extension]](extension, t.extension),
          FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
        )
        val baseType: CompanionFor[Operation] = this
        val thisName: String                  = "Operation"
        def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Operation] =
          checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
            Try(
              new Operation(
                cursor.decodeAs[Option[String]]("id", Some(None)),
                cursor.decodeAs[REPORT_ACTION_RESULT_CODES]("result", None),
                cursor.decodeAs[Option[UriStr]]("detail", Some(None)),
                cursor.decodeAs[Option[Markdown]]("message", Some(None)),
                cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
                cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
                decodeAttributes(cursor)
              )
            ))
      }
      @POJOBoilerplate
      class Operation(
          override val id: Option[String] = None,
          val result: REPORT_ACTION_RESULT_CODES,
          val detail: Option[UriStr] = None,
          val message: Option[Markdown] = None,
          override val extension: LitSeq[Extension] = LitSeq.empty,
          override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
          override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
            FHIRObject.emptyAtts)
          extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
      def apply(
          id: Option[String] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          assert: Option[Action.Assert] = None,
          operation: Option[Action.Operation] = None,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Action = new Action(
        id,
        extension,
        modifierExtension,
        assert,
        operation,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Action): Option[(Option[String], LitSeq[Extension], LitSeq[Extension], Option[Action.Assert], Option[Action.Operation])] =
        Some((o.id, o.extension, o.modifierExtension, o.assert, o.operation))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val assert: FHIRComponentFieldMeta[Option[Action.Assert]] =
        FHIRComponentFieldMeta("assert", lTagOf[Option[Action.Assert]], false, lTagOf[Action.Assert])
      val operation: FHIRComponentFieldMeta[Option[Action.Operation]] =
        FHIRComponentFieldMeta("operation", lTagOf[Option[Action.Operation]], false, lTagOf[Action.Operation])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, extension, modifierExtension, assert, operation)
      override def fields(t: Action): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
        FHIRComponentField[Option[Action.Assert]](assert, t.assert),
        FHIRComponentField[Option[Action.Operation]](operation, t.operation)
      )
      val baseType: CompanionFor[Action] = this
      val thisName: String               = "Action"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Action] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Action(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[Action.Assert]]("assert", Some(None)),
              cursor.decodeAs[Option[Action.Operation]]("operation", Some(None)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Action(
        override val id: Option[String] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        val assert: Option[Action.Assert] = None,
        val operation: Option[Action.Operation] = None,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        action: NonEmptyLitSeq[Setup.Action],
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Setup = new Setup(
      id,
      extension,
      modifierExtension,
      action,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Setup): Option[(Option[String], LitSeq[Extension], LitSeq[Extension], NonEmptyLitSeq[Setup.Action])] = Some(
      (o.id, o.extension, o.modifierExtension, o.action))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val action: FHIRComponentFieldMeta[NonEmptyLitSeq[Setup.Action]] =
      FHIRComponentFieldMeta("action", lTagOf[NonEmptyLitSeq[Setup.Action]], false, lTagOf[Setup.Action])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, extension, modifierExtension, action)
    override def fields(t: Setup): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[NonEmptyLitSeq[Setup.Action]](action, t.action)
    )
    val baseType: CompanionFor[Setup] = this
    val thisName: String              = "Setup"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Setup] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Setup(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[NonEmptyLitSeq[Setup.Action]]("action", None),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Setup(
      override val id: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val action: NonEmptyLitSeq[Setup.Action],
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Teardown extends CompanionFor[Teardown] {
    object Action extends CompanionFor[Action] {
      def apply(
          id: Option[String] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          operation: TestReport.Setup.Action.Operation,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Action = new Action(
        id,
        extension,
        operation,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Action): Option[(Option[String], LitSeq[Extension], TestReport.Setup.Action.Operation, LitSeq[Extension])] =
        Some((o.id, o.extension, o.operation, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val operation: FHIRComponentFieldMeta[TestReport.Setup.Action.Operation] =
        FHIRComponentFieldMeta(
          "operation",
          lTagOf[TestReport.Setup.Action.Operation],
          false,
          lTagOf[TestReport.Setup.Action.Operation])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, extension, operation, modifierExtension)
      override def fields(t: Action): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[TestReport.Setup.Action.Operation](operation, t.operation),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Action] = this
      val thisName: String               = "Action"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Action] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Action(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[TestReport.Setup.Action.Operation]("operation", None),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Action(
        override val id: Option[String] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val operation: TestReport.Setup.Action.Operation,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        action: NonEmptyLitSeq[Teardown.Action],
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Teardown = new Teardown(
      id,
      extension,
      modifierExtension,
      action,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Teardown): Option[(Option[String], LitSeq[Extension], LitSeq[Extension], NonEmptyLitSeq[Teardown.Action])] =
      Some((o.id, o.extension, o.modifierExtension, o.action))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val action: FHIRComponentFieldMeta[NonEmptyLitSeq[Teardown.Action]] =
      FHIRComponentFieldMeta("action", lTagOf[NonEmptyLitSeq[Teardown.Action]], false, lTagOf[Teardown.Action])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, extension, modifierExtension, action)
    override def fields(t: Teardown): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[NonEmptyLitSeq[Teardown.Action]](action, t.action)
    )
    val baseType: CompanionFor[Teardown] = this
    val thisName: String                 = "Teardown"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Teardown] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Teardown(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[NonEmptyLitSeq[Teardown.Action]]("action", None),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Teardown(
      override val id: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val action: NonEmptyLitSeq[Teardown.Action],
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Test extends CompanionFor[Test] {
    object Action extends CompanionFor[Action] {
      def apply(
          id: Option[String] = None,
          assert: Option[TestReport.Setup.Action.Assert] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          operation: Option[TestReport.Setup.Action.Operation] = None,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Action = new Action(
        id,
        assert,
        extension,
        operation,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Action): Option[(Option[String], Option[TestReport.Setup.Action.Assert], LitSeq[Extension], Option[TestReport.Setup.Action.Operation], LitSeq[Extension])] =
        Some((o.id, o.assert, o.extension, o.operation, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val assert: FHIRComponentFieldMeta[Option[TestReport.Setup.Action.Assert]] =
        FHIRComponentFieldMeta(
          "assert",
          lTagOf[Option[TestReport.Setup.Action.Assert]],
          false,
          lTagOf[TestReport.Setup.Action.Assert])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val operation: FHIRComponentFieldMeta[Option[TestReport.Setup.Action.Operation]] =
        FHIRComponentFieldMeta(
          "operation",
          lTagOf[Option[TestReport.Setup.Action.Operation]],
          false,
          lTagOf[TestReport.Setup.Action.Operation])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, assert, extension, operation, modifierExtension)
      override def fields(t: Action): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[TestReport.Setup.Action.Assert]](assert, t.assert),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[TestReport.Setup.Action.Operation]](operation, t.operation),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Action] = this
      val thisName: String               = "Action"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Action] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Action(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[TestReport.Setup.Action.Assert]]("assert", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[TestReport.Setup.Action.Operation]]("operation", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Action(
        override val id: Option[String] = None,
        val assert: Option[TestReport.Setup.Action.Assert] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val operation: Option[TestReport.Setup.Action.Operation] = None,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        name: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        description: Option[String] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        action: NonEmptyLitSeq[Test.Action],
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Test = new Test(
      id,
      name,
      extension,
      description,
      modifierExtension,
      action,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Test): Option[(Option[String], Option[String], LitSeq[Extension], Option[String], LitSeq[Extension], NonEmptyLitSeq[Test.Action])] =
      Some((o.id, o.name, o.extension, o.description, o.modifierExtension, o.action))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val name: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("name", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val description: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val action: FHIRComponentFieldMeta[NonEmptyLitSeq[Test.Action]] =
      FHIRComponentFieldMeta("action", lTagOf[NonEmptyLitSeq[Test.Action]], false, lTagOf[Test.Action])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, name, extension, description, modifierExtension, action)
    override def fields(t: Test): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[String]](name, t.name),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[String]](description, t.description),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[NonEmptyLitSeq[Test.Action]](action, t.action)
    )
    val baseType: CompanionFor[Test] = this
    val thisName: String             = "Test"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Test] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Test(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[String]]("name", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("description", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[NonEmptyLitSeq[Test.Action]]("action", None),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Test(
      override val id: Option[String] = None,
      val name: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val description: Option[String] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val action: NonEmptyLitSeq[Test.Action],
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Participant extends CompanionFor[Participant] {
    def apply(
        id: Option[String] = None,
        uri: UriStr,
        `type`: REPORT_PARTICIPANT_TYPE,
        display: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Participant = new Participant(
      id,
      uri,
      `type`,
      display,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Participant): Option[(Option[String], UriStr, REPORT_PARTICIPANT_TYPE, Option[String], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.uri, o.`type`, o.display, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val uri: FHIRComponentFieldMeta[UriStr] =
      FHIRComponentFieldMeta("uri", lTagOf[UriStr], false, lTagOf[UriStr])
    val `type`: FHIRComponentFieldMeta[REPORT_PARTICIPANT_TYPE] =
      FHIRComponentFieldMeta("type", lTagOf[REPORT_PARTICIPANT_TYPE], false, lTagOf[REPORT_PARTICIPANT_TYPE])
    val display: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("display", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, uri, `type`, display, extension, modifierExtension)
    override def fields(t: Participant): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[UriStr](uri, t.uri),
      FHIRComponentField[REPORT_PARTICIPANT_TYPE](`type`, t.`type`),
      FHIRComponentField[Option[String]](display, t.display),
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
            cursor.decodeAs[UriStr]("uri", None),
            cursor.decodeAs[REPORT_PARTICIPANT_TYPE]("type", None),
            cursor.decodeAs[Option[String]]("display", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Participant(
      override val id: Option[String] = None,
      val uri: UriStr,
      val `type`: REPORT_PARTICIPANT_TYPE,
      val display: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      name: Option[String] = None,
      score: Option[BigDecimal] = None,
      status: REPORT_STATUS_CODES,
      result: REPORT_RESULT_CODES,
      tester: Option[String] = None,
      issued: Option[FHIRDateTime] = None,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      identifier: Option[Identifier] = None,
      testScript: Reference,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      participant: LitSeq[TestReport.Participant] = LitSeq.empty,
      test: LitSeq[TestReport.Test] = LitSeq.empty,
      teardown: Option[TestReport.Teardown] = None,
      setup: Option[TestReport.Setup] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): TestReport = new TestReport(
    id,
    meta,
    text,
    name,
    score,
    status,
    result,
    tester,
    issued,
    language,
    contained,
    extension,
    identifier,
    testScript,
    implicitRules,
    modifierExtension,
    participant,
    test,
    teardown,
    setup,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val name: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("name", lTagOf[Option[String]], false, lTagOf[String])
  val score: FHIRComponentFieldMeta[Option[BigDecimal]] =
    FHIRComponentFieldMeta("score", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
  val status: FHIRComponentFieldMeta[REPORT_STATUS_CODES] =
    FHIRComponentFieldMeta("status", lTagOf[REPORT_STATUS_CODES], false, lTagOf[REPORT_STATUS_CODES])
  val result: FHIRComponentFieldMeta[REPORT_RESULT_CODES] =
    FHIRComponentFieldMeta("result", lTagOf[REPORT_RESULT_CODES], false, lTagOf[REPORT_RESULT_CODES])
  val tester: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("tester", lTagOf[Option[String]], false, lTagOf[String])
  val issued: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("issued", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[Option[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
  val testScript: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("testScript", lTagOf[Reference], false, lTagOf[Reference])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val participant: FHIRComponentFieldMeta[LitSeq[TestReport.Participant]] =
    FHIRComponentFieldMeta("participant", lTagOf[LitSeq[TestReport.Participant]], false, lTagOf[TestReport.Participant])
  val test: FHIRComponentFieldMeta[LitSeq[TestReport.Test]] =
    FHIRComponentFieldMeta("test", lTagOf[LitSeq[TestReport.Test]], false, lTagOf[TestReport.Test])
  val teardown: FHIRComponentFieldMeta[Option[TestReport.Teardown]] =
    FHIRComponentFieldMeta("teardown", lTagOf[Option[TestReport.Teardown]], false, lTagOf[TestReport.Teardown])
  val setup: FHIRComponentFieldMeta[Option[TestReport.Setup]] =
    FHIRComponentFieldMeta("setup", lTagOf[Option[TestReport.Setup]], false, lTagOf[TestReport.Setup])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    name,
    score,
    status,
    result,
    tester,
    issued,
    language,
    contained,
    extension,
    identifier,
    testScript,
    implicitRules,
    modifierExtension,
    participant,
    test,
    teardown,
    setup
  )
  override def fields(t: TestReport): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[String]](name, t.name),
    FHIRComponentField[Option[BigDecimal]](score, t.score),
    FHIRComponentField[REPORT_STATUS_CODES](status, t.status),
    FHIRComponentField[REPORT_RESULT_CODES](result, t.result),
    FHIRComponentField[Option[String]](tester, t.tester),
    FHIRComponentField[Option[FHIRDateTime]](issued, t.issued),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Identifier]](identifier, t.identifier),
    FHIRComponentField[Reference](testScript, t.testScript),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[TestReport.Participant]](participant, t.participant),
    FHIRComponentField[LitSeq[TestReport.Test]](test, t.test),
    FHIRComponentField[Option[TestReport.Teardown]](teardown, t.teardown),
    FHIRComponentField[Option[TestReport.Setup]](setup, t.setup)
  )
  def extractId(t: TestReport): Option[String]                          = t.id
  def extractMeta(t: TestReport): Option[Meta]                          = t.meta
  def extractText(t: TestReport): Option[Narrative]                     = t.text
  def extractName(t: TestReport): Option[String]                        = t.name
  def extractScore(t: TestReport): Option[BigDecimal]                   = t.score
  def extractStatus(t: TestReport): REPORT_STATUS_CODES                 = t.status
  def extractResult(t: TestReport): REPORT_RESULT_CODES                 = t.result
  def extractTester(t: TestReport): Option[String]                      = t.tester
  def extractIssued(t: TestReport): Option[FHIRDateTime]                = t.issued
  def extractLanguage(t: TestReport): Option[LANGUAGES]                 = t.language
  def extractContained(t: TestReport): LitSeq[Resource]                 = t.contained
  def extractExtension(t: TestReport): LitSeq[Extension]                = t.extension
  def extractIdentifier(t: TestReport): Option[Identifier]              = t.identifier
  def extractTestScript(t: TestReport): Reference                       = t.testScript
  def extractImplicitRules(t: TestReport): Option[UriStr]               = t.implicitRules
  def extractModifierExtension(t: TestReport): LitSeq[Extension]        = t.modifierExtension
  def extractParticipant(t: TestReport): LitSeq[TestReport.Participant] = t.participant
  def extractTest(t: TestReport): LitSeq[TestReport.Test]               = t.test
  def extractTeardown(t: TestReport): Option[TestReport.Teardown]       = t.teardown
  def extractSetup(t: TestReport): Option[TestReport.Setup]             = t.setup
  override val thisName: String                                         = "TestReport"
  override val searchParams: Map[String, TestReport => Seq[Any]] = Map(
    "identifier"  -> (obj => obj.identifier.toSeq),
    "result"      -> (obj => Seq(obj.result)),
    "tester"      -> (obj => obj.tester.toSeq),
    "issued"      -> (obj => obj.issued.toSeq),
    "testscript"  -> (obj => Seq(obj.testScript)),
    "participant" -> (obj => obj.participant.map(_.uri).toSeq)
  )
  def unapply(
      o: TestReport): Option[(Option[String], Option[Meta], Option[Narrative], Option[String], Option[BigDecimal], REPORT_STATUS_CODES, REPORT_RESULT_CODES, Option[String], Option[FHIRDateTime], Option[LANGUAGES], LitSeq[Resource], LitSeq[Extension], Option[Identifier], Reference, Option[UriStr], LitSeq[Extension], LitSeq[TestReport.Participant], LitSeq[TestReport.Test], Option[TestReport.Teardown], Option[TestReport.Setup])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.name,
        o.score,
        o.status,
        o.result,
        o.tester,
        o.issued,
        o.language,
        o.contained,
        o.extension,
        o.identifier,
        o.testScript,
        o.implicitRules,
        o.modifierExtension,
        o.participant,
        o.test,
        o.teardown,
        o.setup))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[TestReport] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new TestReport(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[String]]("name", Some(None)),
          cursor.decodeAs[Option[BigDecimal]]("score", Some(None)),
          cursor.decodeAs[REPORT_STATUS_CODES]("status", None),
          cursor.decodeAs[REPORT_RESULT_CODES]("result", None),
          cursor.decodeAs[Option[String]]("tester", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("issued", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Identifier]]("identifier", Some(None)),
          cursor.decodeAs[Reference]("testScript", None),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[TestReport.Participant]]("participant", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[TestReport.Test]]("test", Some(LitSeq.empty)),
          cursor.decodeAs[Option[TestReport.Teardown]]("teardown", Some(None)),
          cursor.decodeAs[Option[TestReport.Setup]]("setup", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** A summary of information based on the results of executing a TestScript.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields name, score, status, result, tester, issued, identifier, testScript, participant, test, teardown, setup.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param name - A free text natural language name identifying the executed TestScript.
  * @param score - The final score (percentage of tests passed) resulting from the execution of the TestScript.
  * @param status - The current state of this test report.
  * @param result - The overall result from the execution of the TestScript.
  * @param tester - Name of the tester producing this report (Organization or individual).
  * @param issued - When the TestScript was executed and this TestReport was generated.
  * @param language - The base language in which the resource is written.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param identifier - Identifier for the TestScript assigned for external purposes outside the context of FHIR.
  * @param testScript - Ideally this is an absolute URL that is used to identify the version-specific TestScript that was executed, matching the `TestScript.url`.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param participant - A participant in the test execution, either the execution engine, a client, or a server.
  * @param test - A test executed from the test script.
  * @param teardown - The results of the series of operations required to clean up after all the tests were executed (successfully or otherwise).
  * @param setup - The results of the series of required setup operations before the tests were executed.
  */
@POJOBoilerplate
class TestReport(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val name: Option[String] = None,
    val score: Option[BigDecimal] = None,
    val status: REPORT_STATUS_CODES,
    val result: REPORT_RESULT_CODES,
    val tester: Option[String] = None,
    val issued: Option[FHIRDateTime] = None,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val identifier: Option[Identifier] = None,
    val testScript: Reference,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val participant: LitSeq[TestReport.Participant] = LitSeq.empty,
    val test: LitSeq[TestReport.Test] = LitSeq.empty,
    val teardown: Option[TestReport.Teardown] = None,
    val setup: Option[TestReport.Setup] = None,
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
  override val thisTypeName: String = "TestReport"
}
