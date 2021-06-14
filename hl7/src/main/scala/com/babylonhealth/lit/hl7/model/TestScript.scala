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
  RESPONSE_CODE,
  PUBLICATION_STATUS,
  HTTP_OPERATIONS,
  DEFINED_TYPES,
  ASSERT_OPERATOR_CODES,
  ASSERT_RESPONSE_CODE_TYPES,
  ASSERT_DIRECTION_CODES
}
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object TestScript extends CompanionFor[TestScript] {
  implicit def summonObjectAndCompanionTestScript1487921325(
      o: TestScript): ObjectAndCompanion[TestScript, TestScript.type] = ObjectAndCompanion(o, this)
  override type ResourceType = TestScript
  override type ParentType   = TestScript
  override val baseType: CompanionFor[ResourceType] = TestScript
  override val parentType: CompanionFor[ParentType] = TestScript
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/TestScript")
  object Setup extends CompanionFor[Setup] {
    implicit def summonObjectAndCompanionSetup1621855089(o: Setup): ObjectAndCompanion[Setup, Setup.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Setup
    override type ParentType   = Setup
    override val parentType: CompanionFor[ResourceType] = Setup
    object Action extends CompanionFor[Action] {
      implicit def summonObjectAndCompanionAction_1793433909(o: Action): ObjectAndCompanion[Action, Action.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Action
      override type ParentType   = Action
      override val parentType: CompanionFor[ResourceType] = Action
      object Assert extends CompanionFor[Assert] {
        implicit def summonObjectAndCompanionAssert1701562624(o: Assert): ObjectAndCompanion[Assert, Assert.type] =
          ObjectAndCompanion(o, this)
        override type ResourceType = Assert
        override type ParentType   = Assert
        override val parentType: CompanionFor[ResourceType] = Assert
        def apply(
            id: Option[String] = None,
            path: Option[String] = None,
            label: Option[String] = None,
            value: Option[String] = None,
            operator: Option[ASSERT_OPERATOR_CODES] = None,
            resource: Option[DEFINED_TYPES] = None,
            response: Option[ASSERT_RESPONSE_CODE_TYPES] = None,
            sourceId: Option[Id] = None,
            extension: LitSeq[Extension] = LitSeq.empty,
            direction: Option[ASSERT_DIRECTION_CODES] = None,
            minimumId: Option[String] = None,
            expression: Option[String] = None,
            requestURL: Option[String] = None,
            description: Option[String] = None,
            contentType: Option[Code] = None,
            headerField: Option[String] = None,
            warningOnly: Boolean,
            responseCode: Option[String] = None,
            requestMethod: Option[HTTP_OPERATIONS] = None,
            navigationLinks: Option[Boolean] = None,
            modifierExtension: LitSeq[Extension] = LitSeq.empty,
            compareToSourceId: Option[String] = None,
            validateProfileId: Option[Id] = None,
            compareToSourcePath: Option[String] = None,
            compareToSourceExpression: Option[String] = None,
            primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
        ): Assert = new Assert(
          id,
          path,
          label,
          value,
          operator,
          resource,
          response,
          sourceId,
          extension,
          direction,
          minimumId,
          expression,
          requestURL,
          description,
          contentType,
          headerField,
          warningOnly,
          responseCode,
          requestMethod,
          navigationLinks,
          modifierExtension,
          compareToSourceId,
          validateProfileId,
          compareToSourcePath,
          compareToSourceExpression,
          primitiveAttributes = primitiveAttributes
        )
        val id: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
        val path: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("path", lTagOf[Option[String]], false, lTagOf[String])
        val label: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("label", lTagOf[Option[String]], false, lTagOf[String])
        val value: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("value", lTagOf[Option[String]], false, lTagOf[String])
        val operator: FHIRComponentFieldMeta[Option[ASSERT_OPERATOR_CODES]] =
          FHIRComponentFieldMeta(
            "operator",
            lTagOf[Option[ASSERT_OPERATOR_CODES]],
            false,
            lTagOf[ASSERT_OPERATOR_CODES])
        val resource: FHIRComponentFieldMeta[Option[DEFINED_TYPES]] =
          FHIRComponentFieldMeta("resource", lTagOf[Option[DEFINED_TYPES]], false, lTagOf[DEFINED_TYPES])
        val response: FHIRComponentFieldMeta[Option[ASSERT_RESPONSE_CODE_TYPES]] =
          FHIRComponentFieldMeta(
            "response",
            lTagOf[Option[ASSERT_RESPONSE_CODE_TYPES]],
            false,
            lTagOf[ASSERT_RESPONSE_CODE_TYPES])
        val sourceId: FHIRComponentFieldMeta[Option[Id]] =
          FHIRComponentFieldMeta("sourceId", lTagOf[Option[Id]], false, lTagOf[Id])
        val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val direction: FHIRComponentFieldMeta[Option[ASSERT_DIRECTION_CODES]] =
          FHIRComponentFieldMeta(
            "direction",
            lTagOf[Option[ASSERT_DIRECTION_CODES]],
            false,
            lTagOf[ASSERT_DIRECTION_CODES])
        val minimumId: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("minimumId", lTagOf[Option[String]], false, lTagOf[String])
        val expression: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("expression", lTagOf[Option[String]], false, lTagOf[String])
        val requestURL: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("requestURL", lTagOf[Option[String]], false, lTagOf[String])
        val description: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
        val contentType: FHIRComponentFieldMeta[Option[Code]] =
          FHIRComponentFieldMeta("contentType", lTagOf[Option[Code]], false, lTagOf[Code])
        val headerField: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("headerField", lTagOf[Option[String]], false, lTagOf[String])
        val warningOnly: FHIRComponentFieldMeta[Boolean] =
          FHIRComponentFieldMeta("warningOnly", lTagOf[Boolean], false, lTagOf[Boolean])
        val responseCode: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("responseCode", lTagOf[Option[String]], false, lTagOf[String])
        val requestMethod: FHIRComponentFieldMeta[Option[HTTP_OPERATIONS]] =
          FHIRComponentFieldMeta("requestMethod", lTagOf[Option[HTTP_OPERATIONS]], false, lTagOf[HTTP_OPERATIONS])
        val navigationLinks: FHIRComponentFieldMeta[Option[Boolean]] =
          FHIRComponentFieldMeta("navigationLinks", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
        val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val compareToSourceId: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("compareToSourceId", lTagOf[Option[String]], false, lTagOf[String])
        val validateProfileId: FHIRComponentFieldMeta[Option[Id]] =
          FHIRComponentFieldMeta("validateProfileId", lTagOf[Option[Id]], false, lTagOf[Id])
        val compareToSourcePath: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("compareToSourcePath", lTagOf[Option[String]], false, lTagOf[String])
        val compareToSourceExpression: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("compareToSourceExpression", lTagOf[Option[String]], false, lTagOf[String])
        val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
          id,
          path,
          label,
          value,
          operator,
          resource,
          response,
          sourceId,
          extension,
          direction,
          minimumId,
          expression,
          requestURL,
          description,
          contentType,
          headerField,
          warningOnly,
          responseCode,
          requestMethod,
          navigationLinks,
          modifierExtension,
          compareToSourceId,
          validateProfileId,
          compareToSourcePath,
          compareToSourceExpression
        )
        override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
        override def fields(t: Assert): Seq[FHIRComponentField[_]] = Seq(
          FHIRComponentField[Option[String]](id, t.id),
          FHIRComponentField[Option[String]](path, t.path),
          FHIRComponentField[Option[String]](label, t.label),
          FHIRComponentField[Option[String]](value, t.value),
          FHIRComponentField[Option[ASSERT_OPERATOR_CODES]](operator, t.operator),
          FHIRComponentField[Option[DEFINED_TYPES]](resource, t.resource),
          FHIRComponentField[Option[ASSERT_RESPONSE_CODE_TYPES]](response, t.response),
          FHIRComponentField[Option[Id]](sourceId, t.sourceId),
          FHIRComponentField[LitSeq[Extension]](extension, t.extension),
          FHIRComponentField[Option[ASSERT_DIRECTION_CODES]](direction, t.direction),
          FHIRComponentField[Option[String]](minimumId, t.minimumId),
          FHIRComponentField[Option[String]](expression, t.expression),
          FHIRComponentField[Option[String]](requestURL, t.requestURL),
          FHIRComponentField[Option[String]](description, t.description),
          FHIRComponentField[Option[Code]](contentType, t.contentType),
          FHIRComponentField[Option[String]](headerField, t.headerField),
          FHIRComponentField[Boolean](warningOnly, t.warningOnly),
          FHIRComponentField[Option[String]](responseCode, t.responseCode),
          FHIRComponentField[Option[HTTP_OPERATIONS]](requestMethod, t.requestMethod),
          FHIRComponentField[Option[Boolean]](navigationLinks, t.navigationLinks),
          FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
          FHIRComponentField[Option[String]](compareToSourceId, t.compareToSourceId),
          FHIRComponentField[Option[Id]](validateProfileId, t.validateProfileId),
          FHIRComponentField[Option[String]](compareToSourcePath, t.compareToSourcePath),
          FHIRComponentField[Option[String]](compareToSourceExpression, t.compareToSourceExpression)
        )
        val baseType: CompanionFor[Assert] = this
        val thisName: String               = "Assert"
        def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Assert] =
          checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
            Try(
              new Assert(
                cursor.decodeAs[Option[String]]("id", Some(None)),
                cursor.decodeAs[Option[String]]("path", Some(None)),
                cursor.decodeAs[Option[String]]("label", Some(None)),
                cursor.decodeAs[Option[String]]("value", Some(None)),
                cursor.decodeAs[Option[ASSERT_OPERATOR_CODES]]("operator", Some(None)),
                cursor.decodeAs[Option[DEFINED_TYPES]]("resource", Some(None)),
                cursor.decodeAs[Option[ASSERT_RESPONSE_CODE_TYPES]]("response", Some(None)),
                cursor.decodeAs[Option[Id]]("sourceId", Some(None)),
                cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
                cursor.decodeAs[Option[ASSERT_DIRECTION_CODES]]("direction", Some(None)),
                cursor.decodeAs[Option[String]]("minimumId", Some(None)),
                cursor.decodeAs[Option[String]]("expression", Some(None)),
                cursor.decodeAs[Option[String]]("requestURL", Some(None)),
                cursor.decodeAs[Option[String]]("description", Some(None)),
                cursor.decodeAs[Option[Code]]("contentType", Some(None)),
                cursor.decodeAs[Option[String]]("headerField", Some(None)),
                cursor.decodeAs[Boolean]("warningOnly", None),
                cursor.decodeAs[Option[String]]("responseCode", Some(None)),
                cursor.decodeAs[Option[HTTP_OPERATIONS]]("requestMethod", Some(None)),
                cursor.decodeAs[Option[Boolean]]("navigationLinks", Some(None)),
                cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
                cursor.decodeAs[Option[String]]("compareToSourceId", Some(None)),
                cursor.decodeAs[Option[Id]]("validateProfileId", Some(None)),
                cursor.decodeAs[Option[String]]("compareToSourcePath", Some(None)),
                cursor.decodeAs[Option[String]]("compareToSourceExpression", Some(None)),
                decodeAttributes(cursor)
              )
            ))
      }
      @POJOBoilerplate
      class Assert(
          override val id: Option[String] = None,
          val path: Option[String] = None,
          val label: Option[String] = None,
          val value: Option[String] = None,
          val operator: Option[ASSERT_OPERATOR_CODES] = None,
          val resource: Option[DEFINED_TYPES] = None,
          val response: Option[ASSERT_RESPONSE_CODE_TYPES] = None,
          val sourceId: Option[Id] = None,
          override val extension: LitSeq[Extension] = LitSeq.empty,
          val direction: Option[ASSERT_DIRECTION_CODES] = None,
          val minimumId: Option[String] = None,
          val expression: Option[String] = None,
          val requestURL: Option[String] = None,
          val description: Option[String] = None,
          val contentType: Option[Code] = None,
          val headerField: Option[String] = None,
          val warningOnly: Boolean,
          val responseCode: Option[String] = None,
          val requestMethod: Option[HTTP_OPERATIONS] = None,
          val navigationLinks: Option[Boolean] = None,
          override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
          val compareToSourceId: Option[String] = None,
          val validateProfileId: Option[Id] = None,
          val compareToSourcePath: Option[String] = None,
          val compareToSourceExpression: Option[String] = None,
          override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
            FHIRObject.emptyAtts)
          extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
      object Operation extends CompanionFor[Operation] {
        implicit def summonObjectAndCompanionOperation_1310128330(
            o: Operation): ObjectAndCompanion[Operation, Operation.type] = ObjectAndCompanion(o, this)
        override type ResourceType = Operation
        override type ParentType   = Operation
        override val parentType: CompanionFor[ResourceType] = Operation
        object RequestHeader extends CompanionFor[RequestHeader] {
          implicit def summonObjectAndCompanionRequestHeader367445203(
              o: RequestHeader): ObjectAndCompanion[RequestHeader, RequestHeader.type] = ObjectAndCompanion(o, this)
          override type ResourceType = RequestHeader
          override type ParentType   = RequestHeader
          override val parentType: CompanionFor[ResourceType] = RequestHeader
          def apply(
              id: Option[String] = None,
              field: String,
              value: String,
              extension: LitSeq[Extension] = LitSeq.empty,
              modifierExtension: LitSeq[Extension] = LitSeq.empty,
              primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
          ): RequestHeader = new RequestHeader(
            id,
            field,
            value,
            extension,
            modifierExtension,
            primitiveAttributes = primitiveAttributes
          )
          def unapply(
              o: RequestHeader): Option[(Option[String], String, String, LitSeq[Extension], LitSeq[Extension])] = Some(
            (o.id, o.field, o.value, o.extension, o.modifierExtension))
          val id: FHIRComponentFieldMeta[Option[String]] =
            FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
          val field: FHIRComponentFieldMeta[String] =
            FHIRComponentFieldMeta("field", lTagOf[String], false, lTagOf[String])
          val value: FHIRComponentFieldMeta[String] =
            FHIRComponentFieldMeta("value", lTagOf[String], false, lTagOf[String])
          val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
            FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
          val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
            FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
          val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, field, value, extension, modifierExtension)
          override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
          override def fields(t: RequestHeader): Seq[FHIRComponentField[_]] = Seq(
            FHIRComponentField[Option[String]](id, t.id),
            FHIRComponentField[String](field, t.field),
            FHIRComponentField[String](value, t.value),
            FHIRComponentField[LitSeq[Extension]](extension, t.extension),
            FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
          )
          val baseType: CompanionFor[RequestHeader] = this
          val thisName: String                      = "RequestHeader"
          def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[RequestHeader] =
            checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
              Try(
                new RequestHeader(
                  cursor.decodeAs[Option[String]]("id", Some(None)),
                  cursor.decodeAs[String]("field", None),
                  cursor.decodeAs[String]("value", None),
                  cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
                  cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
                  decodeAttributes(cursor)
                )
              ))
        }
        @POJOBoilerplate
        class RequestHeader(
            override val id: Option[String] = None,
            val field: String,
            val value: String,
            override val extension: LitSeq[Extension] = LitSeq.empty,
            override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
            override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
              FHIRObject.emptyAtts)
            extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
        def apply(
            id: Option[String] = None,
            url: Option[String] = None,
            `type`: Option[Coding] = None,
            label: Option[String] = None,
            accept: Option[Code] = None,
            method: Option[HTTP_OPERATIONS] = None,
            origin: Option[Int] = None,
            params: Option[String] = None,
            resource: Option[DEFINED_TYPES] = None,
            sourceId: Option[Id] = None,
            targetId: Option[Id] = None,
            extension: LitSeq[Extension] = LitSeq.empty,
            requestId: Option[Id] = None,
            responseId: Option[Id] = None,
            description: Option[String] = None,
            contentType: Option[Code] = None,
            destination: Option[Int] = None,
            encodeRequestUrl: Boolean,
            modifierExtension: LitSeq[Extension] = LitSeq.empty,
            requestHeader: LitSeq[Operation.RequestHeader] = LitSeq.empty,
            primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
        ): Operation = new Operation(
          id,
          url,
          `type`,
          label,
          accept,
          method,
          origin,
          params,
          resource,
          sourceId,
          targetId,
          extension,
          requestId,
          responseId,
          description,
          contentType,
          destination,
          encodeRequestUrl,
          modifierExtension,
          requestHeader,
          primitiveAttributes = primitiveAttributes
        )
        def unapply(
            o: Operation): Option[(Option[String], Option[String], Option[Coding], Option[String], Option[Code], Option[HTTP_OPERATIONS], Option[Int], Option[String], Option[DEFINED_TYPES], Option[Id], Option[Id], LitSeq[Extension], Option[Id], Option[Id], Option[String], Option[Code], Option[Int], Boolean, LitSeq[Extension], LitSeq[Operation.RequestHeader])] =
          Some(
            (
              o.id,
              o.url,
              o.`type`,
              o.label,
              o.accept,
              o.method,
              o.origin,
              o.params,
              o.resource,
              o.sourceId,
              o.targetId,
              o.extension,
              o.requestId,
              o.responseId,
              o.description,
              o.contentType,
              o.destination,
              o.encodeRequestUrl,
              o.modifierExtension,
              o.requestHeader))
        val id: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
        val url: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("url", lTagOf[Option[String]], false, lTagOf[String])
        val `type`: FHIRComponentFieldMeta[Option[Coding]] =
          FHIRComponentFieldMeta("type", lTagOf[Option[Coding]], false, lTagOf[Coding])
        val label: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("label", lTagOf[Option[String]], false, lTagOf[String])
        val accept: FHIRComponentFieldMeta[Option[Code]] =
          FHIRComponentFieldMeta("accept", lTagOf[Option[Code]], false, lTagOf[Code])
        val method: FHIRComponentFieldMeta[Option[HTTP_OPERATIONS]] =
          FHIRComponentFieldMeta("method", lTagOf[Option[HTTP_OPERATIONS]], false, lTagOf[HTTP_OPERATIONS])
        val origin: FHIRComponentFieldMeta[Option[Int]] =
          FHIRComponentFieldMeta("origin", lTagOf[Option[Int]], false, lTagOf[Int])
        val params: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("params", lTagOf[Option[String]], false, lTagOf[String])
        val resource: FHIRComponentFieldMeta[Option[DEFINED_TYPES]] =
          FHIRComponentFieldMeta("resource", lTagOf[Option[DEFINED_TYPES]], false, lTagOf[DEFINED_TYPES])
        val sourceId: FHIRComponentFieldMeta[Option[Id]] =
          FHIRComponentFieldMeta("sourceId", lTagOf[Option[Id]], false, lTagOf[Id])
        val targetId: FHIRComponentFieldMeta[Option[Id]] =
          FHIRComponentFieldMeta("targetId", lTagOf[Option[Id]], false, lTagOf[Id])
        val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val requestId: FHIRComponentFieldMeta[Option[Id]] =
          FHIRComponentFieldMeta("requestId", lTagOf[Option[Id]], false, lTagOf[Id])
        val responseId: FHIRComponentFieldMeta[Option[Id]] =
          FHIRComponentFieldMeta("responseId", lTagOf[Option[Id]], false, lTagOf[Id])
        val description: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
        val contentType: FHIRComponentFieldMeta[Option[Code]] =
          FHIRComponentFieldMeta("contentType", lTagOf[Option[Code]], false, lTagOf[Code])
        val destination: FHIRComponentFieldMeta[Option[Int]] =
          FHIRComponentFieldMeta("destination", lTagOf[Option[Int]], false, lTagOf[Int])
        val encodeRequestUrl: FHIRComponentFieldMeta[Boolean] =
          FHIRComponentFieldMeta("encodeRequestUrl", lTagOf[Boolean], false, lTagOf[Boolean])
        val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val requestHeader: FHIRComponentFieldMeta[LitSeq[Operation.RequestHeader]] =
          FHIRComponentFieldMeta(
            "requestHeader",
            lTagOf[LitSeq[Operation.RequestHeader]],
            false,
            lTagOf[Operation.RequestHeader])
        val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
          id,
          url,
          `type`,
          label,
          accept,
          method,
          origin,
          params,
          resource,
          sourceId,
          targetId,
          extension,
          requestId,
          responseId,
          description,
          contentType,
          destination,
          encodeRequestUrl,
          modifierExtension,
          requestHeader
        )
        override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
        override def fields(t: Operation): Seq[FHIRComponentField[_]] = Seq(
          FHIRComponentField[Option[String]](id, t.id),
          FHIRComponentField[Option[String]](url, t.url),
          FHIRComponentField[Option[Coding]](`type`, t.`type`),
          FHIRComponentField[Option[String]](label, t.label),
          FHIRComponentField[Option[Code]](accept, t.accept),
          FHIRComponentField[Option[HTTP_OPERATIONS]](method, t.method),
          FHIRComponentField[Option[Int]](origin, t.origin),
          FHIRComponentField[Option[String]](params, t.params),
          FHIRComponentField[Option[DEFINED_TYPES]](resource, t.resource),
          FHIRComponentField[Option[Id]](sourceId, t.sourceId),
          FHIRComponentField[Option[Id]](targetId, t.targetId),
          FHIRComponentField[LitSeq[Extension]](extension, t.extension),
          FHIRComponentField[Option[Id]](requestId, t.requestId),
          FHIRComponentField[Option[Id]](responseId, t.responseId),
          FHIRComponentField[Option[String]](description, t.description),
          FHIRComponentField[Option[Code]](contentType, t.contentType),
          FHIRComponentField[Option[Int]](destination, t.destination),
          FHIRComponentField[Boolean](encodeRequestUrl, t.encodeRequestUrl),
          FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
          FHIRComponentField[LitSeq[Operation.RequestHeader]](requestHeader, t.requestHeader)
        )
        val baseType: CompanionFor[Operation] = this
        val thisName: String                  = "Operation"
        def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Operation] =
          checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
            Try(
              new Operation(
                cursor.decodeAs[Option[String]]("id", Some(None)),
                cursor.decodeAs[Option[String]]("url", Some(None)),
                cursor.decodeAs[Option[Coding]]("type", Some(None)),
                cursor.decodeAs[Option[String]]("label", Some(None)),
                cursor.decodeAs[Option[Code]]("accept", Some(None)),
                cursor.decodeAs[Option[HTTP_OPERATIONS]]("method", Some(None)),
                cursor.decodeAs[Option[Int]]("origin", Some(None)),
                cursor.decodeAs[Option[String]]("params", Some(None)),
                cursor.decodeAs[Option[DEFINED_TYPES]]("resource", Some(None)),
                cursor.decodeAs[Option[Id]]("sourceId", Some(None)),
                cursor.decodeAs[Option[Id]]("targetId", Some(None)),
                cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
                cursor.decodeAs[Option[Id]]("requestId", Some(None)),
                cursor.decodeAs[Option[Id]]("responseId", Some(None)),
                cursor.decodeAs[Option[String]]("description", Some(None)),
                cursor.decodeAs[Option[Code]]("contentType", Some(None)),
                cursor.decodeAs[Option[Int]]("destination", Some(None)),
                cursor.decodeAs[Boolean]("encodeRequestUrl", None),
                cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
                cursor.decodeAs[LitSeq[Operation.RequestHeader]]("requestHeader", Some(LitSeq.empty)),
                decodeAttributes(cursor)
              )
            ))
      }
      @POJOBoilerplate
      class Operation(
          override val id: Option[String] = None,
          val url: Option[String] = None,
          val `type`: Option[Coding] = None,
          val label: Option[String] = None,
          val accept: Option[Code] = None,
          val method: Option[HTTP_OPERATIONS] = None,
          val origin: Option[Int] = None,
          val params: Option[String] = None,
          val resource: Option[DEFINED_TYPES] = None,
          val sourceId: Option[Id] = None,
          val targetId: Option[Id] = None,
          override val extension: LitSeq[Extension] = LitSeq.empty,
          val requestId: Option[Id] = None,
          val responseId: Option[Id] = None,
          val description: Option[String] = None,
          val contentType: Option[Code] = None,
          val destination: Option[Int] = None,
          val encodeRequestUrl: Boolean,
          override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
          val requestHeader: LitSeq[Operation.RequestHeader] = LitSeq.empty,
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
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, extension, modifierExtension, assert, operation)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
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
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, extension, modifierExtension, action)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
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
  object Metadata extends CompanionFor[Metadata] {
    implicit def summonObjectAndCompanionMetadata_1606247849(o: Metadata): ObjectAndCompanion[Metadata, Metadata.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Metadata
    override type ParentType   = Metadata
    override val parentType: CompanionFor[ResourceType] = Metadata
    object Link extends CompanionFor[Link] {
      implicit def summonObjectAndCompanionLink1178633397(o: Link): ObjectAndCompanion[Link, Link.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Link
      override type ParentType   = Link
      override val parentType: CompanionFor[ResourceType] = Link
      def apply(
          id: Option[String] = None,
          url: UriStr,
          extension: LitSeq[Extension] = LitSeq.empty,
          description: Option[String] = None,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Link = new Link(
        id,
        url,
        extension,
        description,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(o: Link): Option[(Option[String], UriStr, LitSeq[Extension], Option[String], LitSeq[Extension])] =
        Some((o.id, o.url, o.extension, o.description, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val url: FHIRComponentFieldMeta[UriStr] =
        FHIRComponentFieldMeta("url", lTagOf[UriStr], false, lTagOf[UriStr])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val description: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, url, extension, description, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Link): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[UriStr](url, t.url),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[String]](description, t.description),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Link] = this
      val thisName: String             = "Link"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Link] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Link(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[UriStr]("url", None),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[String]]("description", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Link(
        override val id: Option[String] = None,
        val url: UriStr,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val description: Option[String] = None,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object Capability extends CompanionFor[Capability] {
      implicit def summonObjectAndCompanionCapability612174669(
          o: Capability): ObjectAndCompanion[Capability, Capability.type] = ObjectAndCompanion(o, this)
      override type ResourceType = Capability
      override type ParentType   = Capability
      override val parentType: CompanionFor[ResourceType] = Capability
      def apply(
          id: Option[String] = None,
          link: LitSeq[UriStr] = LitSeq.empty,
          origin: LitSeq[Int] = LitSeq.empty,
          required: Boolean,
          extension: LitSeq[Extension] = LitSeq.empty,
          validated: Boolean,
          description: Option[String] = None,
          destination: Option[Int] = None,
          capabilities: Canonical,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Capability = new Capability(
        id,
        link,
        origin,
        required,
        extension,
        validated,
        description,
        destination,
        capabilities,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Capability): Option[(Option[String], LitSeq[UriStr], LitSeq[Int], Boolean, LitSeq[Extension], Boolean, Option[String], Option[Int], Canonical, LitSeq[Extension])] =
        Some(
          (
            o.id,
            o.link,
            o.origin,
            o.required,
            o.extension,
            o.validated,
            o.description,
            o.destination,
            o.capabilities,
            o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val link: FHIRComponentFieldMeta[LitSeq[UriStr]] =
        FHIRComponentFieldMeta("link", lTagOf[LitSeq[UriStr]], false, lTagOf[UriStr])
      val origin: FHIRComponentFieldMeta[LitSeq[Int]] =
        FHIRComponentFieldMeta("origin", lTagOf[LitSeq[Int]], false, lTagOf[Int])
      val required: FHIRComponentFieldMeta[Boolean] =
        FHIRComponentFieldMeta("required", lTagOf[Boolean], false, lTagOf[Boolean])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val validated: FHIRComponentFieldMeta[Boolean] =
        FHIRComponentFieldMeta("validated", lTagOf[Boolean], false, lTagOf[Boolean])
      val description: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
      val destination: FHIRComponentFieldMeta[Option[Int]] =
        FHIRComponentFieldMeta("destination", lTagOf[Option[Int]], false, lTagOf[Int])
      val capabilities: FHIRComponentFieldMeta[Canonical] =
        FHIRComponentFieldMeta("capabilities", lTagOf[Canonical], false, lTagOf[Canonical])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
        Seq(id, link, origin, required, extension, validated, description, destination, capabilities, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Capability): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[LitSeq[UriStr]](link, t.link),
        FHIRComponentField[LitSeq[Int]](origin, t.origin),
        FHIRComponentField[Boolean](required, t.required),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Boolean](validated, t.validated),
        FHIRComponentField[Option[String]](description, t.description),
        FHIRComponentField[Option[Int]](destination, t.destination),
        FHIRComponentField[Canonical](capabilities, t.capabilities),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Capability] = this
      val thisName: String                   = "Capability"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Capability] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Capability(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[LitSeq[UriStr]]("link", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Int]]("origin", Some(LitSeq.empty)),
              cursor.decodeAs[Boolean]("required", None),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Boolean]("validated", None),
              cursor.decodeAs[Option[String]]("description", Some(None)),
              cursor.decodeAs[Option[Int]]("destination", Some(None)),
              cursor.decodeAs[Canonical]("capabilities", None),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Capability(
        override val id: Option[String] = None,
        val link: LitSeq[UriStr] = LitSeq.empty,
        val origin: LitSeq[Int] = LitSeq.empty,
        val required: Boolean,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val validated: Boolean,
        val description: Option[String] = None,
        val destination: Option[Int] = None,
        val capabilities: Canonical,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        link: LitSeq[Metadata.Link] = LitSeq.empty,
        capability: NonEmptyLitSeq[Metadata.Capability],
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Metadata = new Metadata(
      id,
      extension,
      modifierExtension,
      link,
      capability,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Metadata): Option[(Option[String], LitSeq[Extension], LitSeq[Extension], LitSeq[Metadata.Link], NonEmptyLitSeq[Metadata.Capability])] =
      Some((o.id, o.extension, o.modifierExtension, o.link, o.capability))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val link: FHIRComponentFieldMeta[LitSeq[Metadata.Link]] =
      FHIRComponentFieldMeta("link", lTagOf[LitSeq[Metadata.Link]], false, lTagOf[Metadata.Link])
    val capability: FHIRComponentFieldMeta[NonEmptyLitSeq[Metadata.Capability]] =
      FHIRComponentFieldMeta(
        "capability",
        lTagOf[NonEmptyLitSeq[Metadata.Capability]],
        false,
        lTagOf[Metadata.Capability])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, extension, modifierExtension, link, capability)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Metadata): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[Metadata.Link]](link, t.link),
      FHIRComponentField[NonEmptyLitSeq[Metadata.Capability]](capability, t.capability)
    )
    val baseType: CompanionFor[Metadata] = this
    val thisName: String                 = "Metadata"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Metadata] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Metadata(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Metadata.Link]]("link", Some(LitSeq.empty)),
            cursor.decodeAs[NonEmptyLitSeq[Metadata.Capability]]("capability", None),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Metadata(
      override val id: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val link: LitSeq[Metadata.Link] = LitSeq.empty,
      val capability: NonEmptyLitSeq[Metadata.Capability],
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Teardown extends CompanionFor[Teardown] {
    implicit def summonObjectAndCompanionTeardown2078463695(o: Teardown): ObjectAndCompanion[Teardown, Teardown.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Teardown
    override type ParentType   = Teardown
    override val parentType: CompanionFor[ResourceType] = Teardown
    object Action extends CompanionFor[Action] {
      implicit def summonObjectAndCompanionAction_558654561(o: Action): ObjectAndCompanion[Action, Action.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Action
      override type ParentType   = Action
      override val parentType: CompanionFor[ResourceType] = Action
      def apply(
          id: Option[String] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          operation: TestScript.Setup.Action.Operation,
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
          o: Action): Option[(Option[String], LitSeq[Extension], TestScript.Setup.Action.Operation, LitSeq[Extension])] =
        Some((o.id, o.extension, o.operation, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val operation: FHIRComponentFieldMeta[TestScript.Setup.Action.Operation] =
        FHIRComponentFieldMeta(
          "operation",
          lTagOf[TestScript.Setup.Action.Operation],
          false,
          lTagOf[TestScript.Setup.Action.Operation])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, extension, operation, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Action): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[TestScript.Setup.Action.Operation](operation, t.operation),
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
              cursor.decodeAs[TestScript.Setup.Action.Operation]("operation", None),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Action(
        override val id: Option[String] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val operation: TestScript.Setup.Action.Operation,
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
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, extension, modifierExtension, action)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
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
    implicit def summonObjectAndCompanionTest_168403750(o: Test): ObjectAndCompanion[Test, Test.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Test
    override type ParentType   = Test
    override val parentType: CompanionFor[ResourceType] = Test
    object Action extends CompanionFor[Action] {
      implicit def summonObjectAndCompanionAction192576069(o: Action): ObjectAndCompanion[Action, Action.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Action
      override type ParentType   = Action
      override val parentType: CompanionFor[ResourceType] = Action
      def apply(
          id: Option[String] = None,
          assert: Option[TestScript.Setup.Action.Assert] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          operation: Option[TestScript.Setup.Action.Operation] = None,
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
          o: Action): Option[(Option[String], Option[TestScript.Setup.Action.Assert], LitSeq[Extension], Option[TestScript.Setup.Action.Operation], LitSeq[Extension])] =
        Some((o.id, o.assert, o.extension, o.operation, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val assert: FHIRComponentFieldMeta[Option[TestScript.Setup.Action.Assert]] =
        FHIRComponentFieldMeta(
          "assert",
          lTagOf[Option[TestScript.Setup.Action.Assert]],
          false,
          lTagOf[TestScript.Setup.Action.Assert])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val operation: FHIRComponentFieldMeta[Option[TestScript.Setup.Action.Operation]] =
        FHIRComponentFieldMeta(
          "operation",
          lTagOf[Option[TestScript.Setup.Action.Operation]],
          false,
          lTagOf[TestScript.Setup.Action.Operation])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, assert, extension, operation, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Action): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[TestScript.Setup.Action.Assert]](assert, t.assert),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[TestScript.Setup.Action.Operation]](operation, t.operation),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Action] = this
      val thisName: String               = "Action"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Action] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Action(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[TestScript.Setup.Action.Assert]]("assert", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[TestScript.Setup.Action.Operation]]("operation", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Action(
        override val id: Option[String] = None,
        val assert: Option[TestScript.Setup.Action.Assert] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val operation: Option[TestScript.Setup.Action.Operation] = None,
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
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, name, extension, description, modifierExtension, action)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
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
  object Destination extends CompanionFor[Destination] {
    implicit def summonObjectAndCompanionDestination1532556799(
        o: Destination): ObjectAndCompanion[Destination, Destination.type] = ObjectAndCompanion(o, this)
    override type ResourceType = Destination
    override type ParentType   = Destination
    override val parentType: CompanionFor[ResourceType] = Destination
    def apply(
        id: Option[String] = None,
        index: Int,
        profile: Coding,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Destination = new Destination(
      id,
      index,
      profile,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(o: Destination): Option[(Option[String], Int, Coding, LitSeq[Extension], LitSeq[Extension])] = Some(
      (o.id, o.index, o.profile, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val index: FHIRComponentFieldMeta[Int] =
      FHIRComponentFieldMeta("index", lTagOf[Int], false, lTagOf[Int])
    val profile: FHIRComponentFieldMeta[Coding] =
      FHIRComponentFieldMeta("profile", lTagOf[Coding], false, lTagOf[Coding])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, index, profile, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Destination): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Int](index, t.index),
      FHIRComponentField[Coding](profile, t.profile),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Destination] = this
    val thisName: String                    = "Destination"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Destination] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Destination(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Int]("index", None),
            cursor.decodeAs[Coding]("profile", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Destination(
      override val id: Option[String] = None,
      val index: Int,
      val profile: Coding,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Variable extends CompanionFor[Variable] {
    implicit def summonObjectAndCompanionVariable1038499387(o: Variable): ObjectAndCompanion[Variable, Variable.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Variable
    override type ParentType   = Variable
    override val parentType: CompanionFor[ResourceType] = Variable
    def apply(
        id: Option[String] = None,
        name: String,
        hint: Option[String] = None,
        path: Option[String] = None,
        sourceId: Option[Id] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        expression: Option[String] = None,
        description: Option[String] = None,
        headerField: Option[String] = None,
        defaultValue: Option[String] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Variable = new Variable(
      id,
      name,
      hint,
      path,
      sourceId,
      extension,
      expression,
      description,
      headerField,
      defaultValue,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Variable): Option[(Option[String], String, Option[String], Option[String], Option[Id], LitSeq[Extension], Option[String], Option[String], Option[String], Option[String], LitSeq[Extension])] =
      Some(
        (
          o.id,
          o.name,
          o.hint,
          o.path,
          o.sourceId,
          o.extension,
          o.expression,
          o.description,
          o.headerField,
          o.defaultValue,
          o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val name: FHIRComponentFieldMeta[String] =
      FHIRComponentFieldMeta("name", lTagOf[String], false, lTagOf[String])
    val hint: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("hint", lTagOf[Option[String]], false, lTagOf[String])
    val path: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("path", lTagOf[Option[String]], false, lTagOf[String])
    val sourceId: FHIRComponentFieldMeta[Option[Id]] =
      FHIRComponentFieldMeta("sourceId", lTagOf[Option[Id]], false, lTagOf[Id])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val expression: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("expression", lTagOf[Option[String]], false, lTagOf[String])
    val description: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
    val headerField: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("headerField", lTagOf[Option[String]], false, lTagOf[String])
    val defaultValue: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("defaultValue", lTagOf[Option[String]], false, lTagOf[String])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
      id,
      name,
      hint,
      path,
      sourceId,
      extension,
      expression,
      description,
      headerField,
      defaultValue,
      modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Variable): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[String](name, t.name),
      FHIRComponentField[Option[String]](hint, t.hint),
      FHIRComponentField[Option[String]](path, t.path),
      FHIRComponentField[Option[Id]](sourceId, t.sourceId),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[String]](expression, t.expression),
      FHIRComponentField[Option[String]](description, t.description),
      FHIRComponentField[Option[String]](headerField, t.headerField),
      FHIRComponentField[Option[String]](defaultValue, t.defaultValue),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Variable] = this
    val thisName: String                 = "Variable"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Variable] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Variable(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[String]("name", None),
            cursor.decodeAs[Option[String]]("hint", Some(None)),
            cursor.decodeAs[Option[String]]("path", Some(None)),
            cursor.decodeAs[Option[Id]]("sourceId", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("expression", Some(None)),
            cursor.decodeAs[Option[String]]("description", Some(None)),
            cursor.decodeAs[Option[String]]("headerField", Some(None)),
            cursor.decodeAs[Option[String]]("defaultValue", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Variable(
      override val id: Option[String] = None,
      val name: String,
      val hint: Option[String] = None,
      val path: Option[String] = None,
      val sourceId: Option[Id] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val expression: Option[String] = None,
      val description: Option[String] = None,
      val headerField: Option[String] = None,
      val defaultValue: Option[String] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Fixture extends CompanionFor[Fixture] {
    implicit def summonObjectAndCompanionFixture1928157237(o: Fixture): ObjectAndCompanion[Fixture, Fixture.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Fixture
    override type ParentType   = Fixture
    override val parentType: CompanionFor[ResourceType] = Fixture
    def apply(
        id: Option[String] = None,
        resource: Option[Reference] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        autocreate: Boolean,
        autodelete: Boolean,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Fixture = new Fixture(
      id,
      resource,
      extension,
      autocreate,
      autodelete,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Fixture): Option[(Option[String], Option[Reference], LitSeq[Extension], Boolean, Boolean, LitSeq[Extension])] =
      Some((o.id, o.resource, o.extension, o.autocreate, o.autodelete, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val resource: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("resource", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val autocreate: FHIRComponentFieldMeta[Boolean] =
      FHIRComponentFieldMeta("autocreate", lTagOf[Boolean], false, lTagOf[Boolean])
    val autodelete: FHIRComponentFieldMeta[Boolean] =
      FHIRComponentFieldMeta("autodelete", lTagOf[Boolean], false, lTagOf[Boolean])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, resource, extension, autocreate, autodelete, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Fixture): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Reference]](resource, t.resource),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Boolean](autocreate, t.autocreate),
      FHIRComponentField[Boolean](autodelete, t.autodelete),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Fixture] = this
    val thisName: String                = "Fixture"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Fixture] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Fixture(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[Reference]]("resource", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Boolean]("autocreate", None),
            cursor.decodeAs[Boolean]("autodelete", None),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Fixture(
      override val id: Option[String] = None,
      val resource: Option[Reference] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val autocreate: Boolean,
      val autodelete: Boolean,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Origin extends CompanionFor[Origin] {
    implicit def summonObjectAndCompanionOrigin_1685280283(o: Origin): ObjectAndCompanion[Origin, Origin.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Origin
    override type ParentType   = Origin
    override val parentType: CompanionFor[ResourceType] = Origin
    def apply(
        id: Option[String] = None,
        index: Int,
        profile: Coding,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Origin = new Origin(
      id,
      index,
      profile,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(o: Origin): Option[(Option[String], Int, Coding, LitSeq[Extension], LitSeq[Extension])] = Some(
      (o.id, o.index, o.profile, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val index: FHIRComponentFieldMeta[Int] =
      FHIRComponentFieldMeta("index", lTagOf[Int], false, lTagOf[Int])
    val profile: FHIRComponentFieldMeta[Coding] =
      FHIRComponentFieldMeta("profile", lTagOf[Coding], false, lTagOf[Coding])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, index, profile, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Origin): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Int](index, t.index),
      FHIRComponentField[Coding](profile, t.profile),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Origin] = this
    val thisName: String               = "Origin"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Origin] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Origin(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Int]("index", None),
            cursor.decodeAs[Coding]("profile", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Origin(
      override val id: Option[String] = None,
      val index: Int,
      val profile: Coding,
      override val extension: LitSeq[Extension] = LitSeq.empty,
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
      version: Option[String] = None,
      contact: LitSeq[ContactDetail] = LitSeq.empty,
      purpose: Option[Markdown] = None,
      profile: LitSeq[Reference] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      publisher: Option[String] = None,
      copyright: Option[Markdown] = None,
      identifier: Option[Identifier] = None,
      useContext: LitSeq[UsageContext] = LitSeq.empty,
      description: Option[Markdown] = None,
      experimental: Option[Boolean] = None,
      jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      origin: LitSeq[TestScript.Origin] = LitSeq.empty,
      fixture: LitSeq[TestScript.Fixture] = LitSeq.empty,
      variable: LitSeq[TestScript.Variable] = LitSeq.empty,
      destination: LitSeq[TestScript.Destination] = LitSeq.empty,
      test: LitSeq[TestScript.Test] = LitSeq.empty,
      teardown: Option[TestScript.Teardown] = None,
      metadata: Option[TestScript.Metadata] = None,
      setup: Option[TestScript.Setup] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): TestScript = new TestScript(
    id,
    url,
    meta,
    text,
    name,
    date,
    title,
    status,
    version,
    contact,
    purpose,
    profile,
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
    origin,
    fixture,
    variable,
    destination,
    test,
    teardown,
    metadata,
    setup,
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
  val version: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("version", lTagOf[Option[String]], false, lTagOf[String])
  val contact: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("contact", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val purpose: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("purpose", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val profile: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("profile", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
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
  val identifier: FHIRComponentFieldMeta[Option[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
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
  val origin: FHIRComponentFieldMeta[LitSeq[TestScript.Origin]] =
    FHIRComponentFieldMeta("origin", lTagOf[LitSeq[TestScript.Origin]], false, lTagOf[TestScript.Origin])
  val fixture: FHIRComponentFieldMeta[LitSeq[TestScript.Fixture]] =
    FHIRComponentFieldMeta("fixture", lTagOf[LitSeq[TestScript.Fixture]], false, lTagOf[TestScript.Fixture])
  val variable: FHIRComponentFieldMeta[LitSeq[TestScript.Variable]] =
    FHIRComponentFieldMeta("variable", lTagOf[LitSeq[TestScript.Variable]], false, lTagOf[TestScript.Variable])
  val destination: FHIRComponentFieldMeta[LitSeq[TestScript.Destination]] =
    FHIRComponentFieldMeta("destination", lTagOf[LitSeq[TestScript.Destination]], false, lTagOf[TestScript.Destination])
  val test: FHIRComponentFieldMeta[LitSeq[TestScript.Test]] =
    FHIRComponentFieldMeta("test", lTagOf[LitSeq[TestScript.Test]], false, lTagOf[TestScript.Test])
  val teardown: FHIRComponentFieldMeta[Option[TestScript.Teardown]] =
    FHIRComponentFieldMeta("teardown", lTagOf[Option[TestScript.Teardown]], false, lTagOf[TestScript.Teardown])
  val metadata: FHIRComponentFieldMeta[Option[TestScript.Metadata]] =
    FHIRComponentFieldMeta("metadata", lTagOf[Option[TestScript.Metadata]], false, lTagOf[TestScript.Metadata])
  val setup: FHIRComponentFieldMeta[Option[TestScript.Setup]] =
    FHIRComponentFieldMeta("setup", lTagOf[Option[TestScript.Setup]], false, lTagOf[TestScript.Setup])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    url,
    meta,
    text,
    name,
    date,
    title,
    status,
    version,
    contact,
    purpose,
    profile,
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
    origin,
    fixture,
    variable,
    destination,
    test,
    teardown,
    metadata,
    setup
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: TestScript): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[UriStr](url, t.url),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[String](name, t.name),
    FHIRComponentField[Option[FHIRDateTime]](date, t.date),
    FHIRComponentField[Option[String]](title, t.title),
    FHIRComponentField[PUBLICATION_STATUS](status, t.status),
    FHIRComponentField[Option[String]](version, t.version),
    FHIRComponentField[LitSeq[ContactDetail]](contact, t.contact),
    FHIRComponentField[Option[Markdown]](purpose, t.purpose),
    FHIRComponentField[LitSeq[Reference]](profile, t.profile),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[String]](publisher, t.publisher),
    FHIRComponentField[Option[Markdown]](copyright, t.copyright),
    FHIRComponentField[Option[Identifier]](identifier, t.identifier),
    FHIRComponentField[LitSeq[UsageContext]](useContext, t.useContext),
    FHIRComponentField[Option[Markdown]](description, t.description),
    FHIRComponentField[Option[Boolean]](experimental, t.experimental),
    FHIRComponentField[LitSeq[CodeableConcept]](jurisdiction, t.jurisdiction),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[TestScript.Origin]](origin, t.origin),
    FHIRComponentField[LitSeq[TestScript.Fixture]](fixture, t.fixture),
    FHIRComponentField[LitSeq[TestScript.Variable]](variable, t.variable),
    FHIRComponentField[LitSeq[TestScript.Destination]](destination, t.destination),
    FHIRComponentField[LitSeq[TestScript.Test]](test, t.test),
    FHIRComponentField[Option[TestScript.Teardown]](teardown, t.teardown),
    FHIRComponentField[Option[TestScript.Metadata]](metadata, t.metadata),
    FHIRComponentField[Option[TestScript.Setup]](setup, t.setup)
  )
  def extractId(t: TestScript): Option[String]                          = t.id
  def extractUrl(t: TestScript): UriStr                                 = t.url
  def extractMeta(t: TestScript): Option[Meta]                          = t.meta
  def extractText(t: TestScript): Option[Narrative]                     = t.text
  def extractName(t: TestScript): String                                = t.name
  def extractDate(t: TestScript): Option[FHIRDateTime]                  = t.date
  def extractTitle(t: TestScript): Option[String]                       = t.title
  def extractStatus(t: TestScript): PUBLICATION_STATUS                  = t.status
  def extractVersion(t: TestScript): Option[String]                     = t.version
  def extractContact(t: TestScript): LitSeq[ContactDetail]              = t.contact
  def extractPurpose(t: TestScript): Option[Markdown]                   = t.purpose
  def extractProfile(t: TestScript): LitSeq[Reference]                  = t.profile
  def extractLanguage(t: TestScript): Option[LANGUAGES]                 = t.language
  def extractContained(t: TestScript): LitSeq[Resource]                 = t.contained
  def extractExtension(t: TestScript): LitSeq[Extension]                = t.extension
  def extractPublisher(t: TestScript): Option[String]                   = t.publisher
  def extractCopyright(t: TestScript): Option[Markdown]                 = t.copyright
  def extractIdentifier(t: TestScript): Option[Identifier]              = t.identifier
  def extractUseContext(t: TestScript): LitSeq[UsageContext]            = t.useContext
  def extractDescription(t: TestScript): Option[Markdown]               = t.description
  def extractExperimental(t: TestScript): Option[Boolean]               = t.experimental
  def extractJurisdiction(t: TestScript): LitSeq[CodeableConcept]       = t.jurisdiction
  def extractImplicitRules(t: TestScript): Option[UriStr]               = t.implicitRules
  def extractModifierExtension(t: TestScript): LitSeq[Extension]        = t.modifierExtension
  def extractOrigin(t: TestScript): LitSeq[TestScript.Origin]           = t.origin
  def extractFixture(t: TestScript): LitSeq[TestScript.Fixture]         = t.fixture
  def extractVariable(t: TestScript): LitSeq[TestScript.Variable]       = t.variable
  def extractDestination(t: TestScript): LitSeq[TestScript.Destination] = t.destination
  def extractTest(t: TestScript): LitSeq[TestScript.Test]               = t.test
  def extractTeardown(t: TestScript): Option[TestScript.Teardown]       = t.teardown
  def extractMetadata(t: TestScript): Option[TestScript.Metadata]       = t.metadata
  def extractSetup(t: TestScript): Option[TestScript.Setup]             = t.setup
  override val thisName: String                                         = "TestScript"
  override val searchParams: Map[String, TestScript => Seq[Any]] = Map(
    "jurisdiction"          -> (obj => obj.jurisdiction.toSeq),
    "name"                  -> (obj => Seq(obj.name)),
    "context-type-quantity" -> (obj => obj.useContext.toSeq),
    "description"           -> (obj => obj.description.toSeq),
    "context"               -> (obj => obj.useContext.map(_.value).flatMap(_.as[CodeableConcept]).toSeq),
    "date"                  -> (obj => obj.date.toSeq),
    "testscript-capability" -> (obj => obj.metadata.toSeq.flatMap(_.capability).flatMap(_.description).toSeq),
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
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[TestScript] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new TestScript(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[UriStr]("url", None),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[String]("name", None),
          cursor.decodeAs[Option[FHIRDateTime]]("date", Some(None)),
          cursor.decodeAs[Option[String]]("title", Some(None)),
          cursor.decodeAs[PUBLICATION_STATUS]("status", None),
          cursor.decodeAs[Option[String]]("version", Some(None)),
          cursor.decodeAs[LitSeq[ContactDetail]]("contact", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Markdown]]("purpose", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("profile", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("publisher", Some(None)),
          cursor.decodeAs[Option[Markdown]]("copyright", Some(None)),
          cursor.decodeAs[Option[Identifier]]("identifier", Some(None)),
          cursor.decodeAs[LitSeq[UsageContext]]("useContext", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Markdown]]("description", Some(None)),
          cursor.decodeAs[Option[Boolean]]("experimental", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("jurisdiction", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[TestScript.Origin]]("origin", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[TestScript.Fixture]]("fixture", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[TestScript.Variable]]("variable", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[TestScript.Destination]]("destination", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[TestScript.Test]]("test", Some(LitSeq.empty)),
          cursor.decodeAs[Option[TestScript.Teardown]]("teardown", Some(None)),
          cursor.decodeAs[Option[TestScript.Metadata]]("metadata", Some(None)),
          cursor.decodeAs[Option[TestScript.Setup]]("setup", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** A structured set of tests against a FHIR server or client implementation to determine compliance against the FHIR specification.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields url, name, date, title, status, version, contact, purpose, profile, publisher, copyright, identifier, useContext, description, experimental, jurisdiction, origin, fixture, variable, destination, test, teardown, metadata, setup.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param url - An absolute URI that is used to identify this test script when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative instance of this test script is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the test script is stored on different servers.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param name - A natural language name identifying the test script. This name should be usable as an identifier for the module by machine processing applications such as code generation.
  * @param date - The date  (and optionally time) when the test script was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the test script changes.
  * @param title - A short, descriptive, user-friendly title for the test script.
  * @param status - The status of this test script. Enables tracking the life-cycle of the content.
  * @param version - The identifier that is used to identify this version of the test script when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the test script author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.
  * @param contact - Contact details to assist a user in finding and communicating with the publisher.
  * @param purpose - Explanation of why this test script is needed and why it has been designed as it has.
  * @param profile - Reference to the profile to be used for validation.
  * @param language - The base language in which the resource is written.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param publisher - The name of the organization or individual that published the test script.
  * @param copyright - A copyright statement relating to the test script and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the test script.
  * @param identifier - A formal identifier that is used to identify this test script when it is represented in other formats, or referenced in a specification, model, design or an instance.
  * @param useContext - The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate test script instances.
  * @param description - A free text natural language description of the test script from a consumer's perspective.
  * @param experimental - A Boolean value to indicate that this test script is authored for testing purposes (or education/evaluation/marketing) and is not intended to be used for genuine usage.
  * @param jurisdiction - A legal or geographic region in which the test script is intended to be used.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param origin - An abstract server used in operations within this test script in the origin element.
  * @param fixture - Fixture in the test script - by reference (uri). All fixtures are required for the test script to execute.
  * @param variable - Variable is set based either on element value in response body or on header field value in the response headers.
  * @param destination - An abstract server used in operations within this test script in the destination element.
  * @param test - A test in this script.
  * @param teardown - A series of operations required to clean up after all the tests are executed (successfully or otherwise).
  * @param metadata - The required capability must exist and are assumed to function correctly on the FHIR server being tested.
  * @param setup - A series of required setup operations before tests are executed.
  */
@POJOBoilerplate
class TestScript(
    override val id: Option[String] = None,
    val url: UriStr,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val name: String,
    val date: Option[FHIRDateTime] = None,
    val title: Option[String] = None,
    val status: PUBLICATION_STATUS,
    val version: Option[String] = None,
    val contact: LitSeq[ContactDetail] = LitSeq.empty,
    val purpose: Option[Markdown] = None,
    val profile: LitSeq[Reference] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val publisher: Option[String] = None,
    val copyright: Option[Markdown] = None,
    val identifier: Option[Identifier] = None,
    val useContext: LitSeq[UsageContext] = LitSeq.empty,
    val description: Option[Markdown] = None,
    val experimental: Option[Boolean] = None,
    val jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val origin: LitSeq[TestScript.Origin] = LitSeq.empty,
    val fixture: LitSeq[TestScript.Fixture] = LitSeq.empty,
    val variable: LitSeq[TestScript.Variable] = LitSeq.empty,
    val destination: LitSeq[TestScript.Destination] = LitSeq.empty,
    val test: LitSeq[TestScript.Test] = LitSeq.empty,
    val teardown: Option[TestScript.Teardown] = None,
    val metadata: Option[TestScript.Metadata] = None,
    val setup: Option[TestScript.Setup] = None,
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
  override val thisTypeName: String = "TestScript"
}
