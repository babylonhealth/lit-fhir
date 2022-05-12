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
  FHIR_VERSION,
  RESOURCE_TYPES,
  RESTFUL_CAPABILITY_MODE,
  SEARCH_PARAM_TYPE,
  EVENT_CAPABILITY_MODE,
  SYSTEM_RESTFUL_INTERACTION,
  DOCUMENT_MODE,
  CONDITIONAL_DELETE_STATUS,
  CAPABILITY_STATEMENT_KIND,
  REFERENCE_HANDLING_POLICY,
  CONDITIONAL_READ_STATUS,
  VERSIONING_POLICY,
  TYPE_RESTFUL_INTERACTION,
  PUBLICATION_STATUS
}
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object CapabilityStatement extends CompanionFor[CapabilityStatement] {
  implicit def summonObjectAndCompanionCapabilityStatement_1106335454(
      o: CapabilityStatement): ObjectAndCompanion[CapabilityStatement, CapabilityStatement.type] = ObjectAndCompanion(o, this)
  override type ResourceType = CapabilityStatement
  override type ParentType   = CapabilityStatement
  override val baseType: CompanionFor[ResourceType] = CapabilityStatement
  override val parentType: CompanionFor[ParentType] = CapabilityStatement
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/CapabilityStatement")
  object Messaging extends CompanionFor[Messaging] {
    implicit def summonObjectAndCompanionMessaging_1742844370(o: Messaging): ObjectAndCompanion[Messaging, Messaging.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Messaging
    override type ParentType   = Messaging
    override val parentType: CompanionFor[ResourceType] = Messaging
    object Endpoint extends CompanionFor[Endpoint] {
      implicit def summonObjectAndCompanionEndpoint256496863(o: Endpoint): ObjectAndCompanion[Endpoint, Endpoint.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Endpoint
      override type ParentType   = Endpoint
      override val parentType: CompanionFor[ResourceType] = Endpoint
      def apply(
          id: Option[String] = None,
          address: UrlStr,
          protocol: Coding,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Endpoint = new Endpoint(
        id,
        address,
        protocol,
        extension,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(o: Endpoint): Option[(Option[String], UrlStr, Coding, LitSeq[Extension], LitSeq[Extension])] = Some(
        (o.id, o.address, o.protocol, o.extension, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val address: FHIRComponentFieldMeta[UrlStr] =
        FHIRComponentFieldMeta("address", lTagOf[UrlStr], false, lTagOf[UrlStr])
      val protocol: FHIRComponentFieldMeta[Coding] =
        FHIRComponentFieldMeta("protocol", lTagOf[Coding], false, lTagOf[Coding])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, address, protocol, extension, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Endpoint): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[UrlStr](address, t.address),
        FHIRComponentField[Coding](protocol, t.protocol),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Endpoint] = this
      val thisName: String                 = "Endpoint"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Endpoint] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Endpoint(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[UrlStr]("address", None),
              cursor.decodeAs[Coding]("protocol", None),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Endpoint(
        override val id: Option[String] = None,
        val address: UrlStr,
        val protocol: Coding,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object SupportedMessage extends CompanionFor[SupportedMessage] {
      implicit def summonObjectAndCompanionSupportedMessage256496863(
          o: SupportedMessage): ObjectAndCompanion[SupportedMessage, SupportedMessage.type] = ObjectAndCompanion(o, this)
      override type ResourceType = SupportedMessage
      override type ParentType   = SupportedMessage
      override val parentType: CompanionFor[ResourceType] = SupportedMessage
      def apply(
          id: Option[String] = None,
          mode: EVENT_CAPABILITY_MODE,
          extension: LitSeq[Extension] = LitSeq.empty,
          definition: Canonical,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): SupportedMessage = new SupportedMessage(
        id,
        mode,
        extension,
        definition,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: SupportedMessage): Option[(Option[String], EVENT_CAPABILITY_MODE, LitSeq[Extension], Canonical, LitSeq[Extension])] =
        Some((o.id, o.mode, o.extension, o.definition, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val mode: FHIRComponentFieldMeta[EVENT_CAPABILITY_MODE] =
        FHIRComponentFieldMeta("mode", lTagOf[EVENT_CAPABILITY_MODE], false, lTagOf[EVENT_CAPABILITY_MODE])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val definition: FHIRComponentFieldMeta[Canonical] =
        FHIRComponentFieldMeta("definition", lTagOf[Canonical], false, lTagOf[Canonical])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, mode, extension, definition, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: SupportedMessage): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[EVENT_CAPABILITY_MODE](mode, t.mode),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Canonical](definition, t.definition),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[SupportedMessage] = this
      val thisName: String                         = "SupportedMessage"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[SupportedMessage] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new SupportedMessage(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[EVENT_CAPABILITY_MODE]("mode", None),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Canonical]("definition", None),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class SupportedMessage(
        override val id: Option[String] = None,
        val mode: EVENT_CAPABILITY_MODE,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val definition: Canonical,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        reliableCache: Option[UnsignedInt] = None,
        documentation: Option[Markdown] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        endpoint: LitSeq[Messaging.Endpoint] = LitSeq.empty,
        supportedMessage: LitSeq[Messaging.SupportedMessage] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Messaging = new Messaging(
      id,
      extension,
      reliableCache,
      documentation,
      modifierExtension,
      endpoint,
      supportedMessage,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Messaging): Option[(Option[String], LitSeq[Extension], Option[UnsignedInt], Option[Markdown], LitSeq[Extension], LitSeq[Messaging.Endpoint], LitSeq[Messaging.SupportedMessage])] =
      Some((o.id, o.extension, o.reliableCache, o.documentation, o.modifierExtension, o.endpoint, o.supportedMessage))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val reliableCache: FHIRComponentFieldMeta[Option[UnsignedInt]] =
      FHIRComponentFieldMeta("reliableCache", lTagOf[Option[UnsignedInt]], false, lTagOf[UnsignedInt])
    val documentation: FHIRComponentFieldMeta[Option[Markdown]] =
      FHIRComponentFieldMeta("documentation", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val endpoint: FHIRComponentFieldMeta[LitSeq[Messaging.Endpoint]] =
      FHIRComponentFieldMeta("endpoint", lTagOf[LitSeq[Messaging.Endpoint]], false, lTagOf[Messaging.Endpoint])
    val supportedMessage: FHIRComponentFieldMeta[LitSeq[Messaging.SupportedMessage]] =
      FHIRComponentFieldMeta(
        "supportedMessage",
        lTagOf[LitSeq[Messaging.SupportedMessage]],
        false,
        lTagOf[Messaging.SupportedMessage])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, extension, reliableCache, documentation, modifierExtension, endpoint, supportedMessage)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Messaging): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[UnsignedInt]](reliableCache, t.reliableCache),
      FHIRComponentField[Option[Markdown]](documentation, t.documentation),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[Messaging.Endpoint]](endpoint, t.endpoint),
      FHIRComponentField[LitSeq[Messaging.SupportedMessage]](supportedMessage, t.supportedMessage)
    )
    val baseType: CompanionFor[Messaging] = this
    val thisName: String                  = "Messaging"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Messaging] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Messaging(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[UnsignedInt]]("reliableCache", Some(None)),
            cursor.decodeAs[Option[Markdown]]("documentation", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Messaging.Endpoint]]("endpoint", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Messaging.SupportedMessage]]("supportedMessage", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Messaging(
      override val id: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val reliableCache: Option[UnsignedInt] = None,
      val documentation: Option[Markdown] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val endpoint: LitSeq[Messaging.Endpoint] = LitSeq.empty,
      val supportedMessage: LitSeq[Messaging.SupportedMessage] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Rest extends CompanionFor[Rest] {
    implicit def summonObjectAndCompanionRest_1742844370(o: Rest): ObjectAndCompanion[Rest, Rest.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Rest
    override type ParentType   = Rest
    override val parentType: CompanionFor[ResourceType] = Rest
    object Security extends CompanionFor[Security] {
      implicit def summonObjectAndCompanionSecurity_866334977(o: Security): ObjectAndCompanion[Security, Security.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Security
      override type ParentType   = Security
      override val parentType: CompanionFor[ResourceType] = Security
      def apply(
          id: Option[String] = None,
          cors: Option[Boolean] = None,
          service: LitSeq[CodeableConcept] = LitSeq.empty,
          extension: LitSeq[Extension] = LitSeq.empty,
          description: Option[Markdown] = None,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Security = new Security(
        id,
        cors,
        service,
        extension,
        description,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Security): Option[(Option[String], Option[Boolean], LitSeq[CodeableConcept], LitSeq[Extension], Option[Markdown], LitSeq[Extension])] =
        Some((o.id, o.cors, o.service, o.extension, o.description, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val cors: FHIRComponentFieldMeta[Option[Boolean]] =
        FHIRComponentFieldMeta("cors", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
      val service: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
        FHIRComponentFieldMeta("service", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val description: FHIRComponentFieldMeta[Option[Markdown]] =
        FHIRComponentFieldMeta("description", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, cors, service, extension, description, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Security): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[Boolean]](cors, t.cors),
        FHIRComponentField[LitSeq[CodeableConcept]](service, t.service),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[Markdown]](description, t.description),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Security] = this
      val thisName: String                 = "Security"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Security] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Security(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[Boolean]]("cors", Some(None)),
              cursor.decodeAs[LitSeq[CodeableConcept]]("service", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[Markdown]]("description", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Security(
        override val id: Option[String] = None,
        val cors: Option[Boolean] = None,
        val service: LitSeq[CodeableConcept] = LitSeq.empty,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val description: Option[Markdown] = None,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object Interaction extends CompanionFor[Interaction] {
      implicit def summonObjectAndCompanionInteraction_866334977(
          o: Interaction): ObjectAndCompanion[Interaction, Interaction.type] = ObjectAndCompanion(o, this)
      override type ResourceType = Interaction
      override type ParentType   = Interaction
      override val parentType: CompanionFor[ResourceType] = Interaction
      def apply(
          id: Option[String] = None,
          code: SYSTEM_RESTFUL_INTERACTION,
          extension: LitSeq[Extension] = LitSeq.empty,
          documentation: Option[Markdown] = None,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Interaction = new Interaction(
        id,
        code,
        extension,
        documentation,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Interaction): Option[(Option[String], SYSTEM_RESTFUL_INTERACTION, LitSeq[Extension], Option[Markdown], LitSeq[Extension])] =
        Some((o.id, o.code, o.extension, o.documentation, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val code: FHIRComponentFieldMeta[SYSTEM_RESTFUL_INTERACTION] =
        FHIRComponentFieldMeta("code", lTagOf[SYSTEM_RESTFUL_INTERACTION], false, lTagOf[SYSTEM_RESTFUL_INTERACTION])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val documentation: FHIRComponentFieldMeta[Option[Markdown]] =
        FHIRComponentFieldMeta("documentation", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, code, extension, documentation, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Interaction): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[SYSTEM_RESTFUL_INTERACTION](code, t.code),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[Markdown]](documentation, t.documentation),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Interaction] = this
      val thisName: String                    = "Interaction"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Interaction] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Interaction(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[SYSTEM_RESTFUL_INTERACTION]("code", None),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[Markdown]]("documentation", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Interaction(
        override val id: Option[String] = None,
        val code: SYSTEM_RESTFUL_INTERACTION,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val documentation: Option[Markdown] = None,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object Resource extends CompanionFor[Resource] {
      implicit def summonObjectAndCompanionResource_866334977(o: Resource): ObjectAndCompanion[Resource, Resource.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Resource
      override type ParentType   = Resource
      override val parentType: CompanionFor[ResourceType] = Resource
      object Operation extends CompanionFor[Operation] {
        implicit def summonObjectAndCompanionOperation_1421719705(o: Operation): ObjectAndCompanion[Operation, Operation.type] =
          ObjectAndCompanion(o, this)
        override type ResourceType = Operation
        override type ParentType   = Operation
        override val parentType: CompanionFor[ResourceType] = Operation
        def apply(
            id: Option[String] = None,
            name: String,
            extension: LitSeq[Extension] = LitSeq.empty,
            definition: Canonical,
            documentation: Option[Markdown] = None,
            modifierExtension: LitSeq[Extension] = LitSeq.empty,
            primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
        ): Operation = new Operation(
          id,
          name,
          extension,
          definition,
          documentation,
          modifierExtension,
          primitiveAttributes = primitiveAttributes
        )
        def unapply(
            o: Operation): Option[(Option[String], String, LitSeq[Extension], Canonical, Option[Markdown], LitSeq[Extension])] =
          Some((o.id, o.name, o.extension, o.definition, o.documentation, o.modifierExtension))
        val id: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
        val name: FHIRComponentFieldMeta[String] =
          FHIRComponentFieldMeta("name", lTagOf[String], false, lTagOf[String])
        val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val definition: FHIRComponentFieldMeta[Canonical] =
          FHIRComponentFieldMeta("definition", lTagOf[Canonical], false, lTagOf[Canonical])
        val documentation: FHIRComponentFieldMeta[Option[Markdown]] =
          FHIRComponentFieldMeta("documentation", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
        val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, name, extension, definition, documentation, modifierExtension)
        override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
        override def fields(t: Operation): Seq[FHIRComponentField[_]] = Seq(
          FHIRComponentField[Option[String]](id, t.id),
          FHIRComponentField[String](name, t.name),
          FHIRComponentField[LitSeq[Extension]](extension, t.extension),
          FHIRComponentField[Canonical](definition, t.definition),
          FHIRComponentField[Option[Markdown]](documentation, t.documentation),
          FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
        )
        val baseType: CompanionFor[Operation] = this
        val thisName: String                  = "Operation"
        def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Operation] =
          checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
            Try(
              new Operation(
                cursor.decodeAs[Option[String]]("id", Some(None)),
                cursor.decodeAs[String]("name", None),
                cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
                cursor.decodeAs[Canonical]("definition", None),
                cursor.decodeAs[Option[Markdown]]("documentation", Some(None)),
                cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
                decodeAttributes(cursor)
              )
            ))
      }
      @POJOBoilerplate
      class Operation(
          override val id: Option[String] = None,
          val name: String,
          override val extension: LitSeq[Extension] = LitSeq.empty,
          val definition: Canonical,
          val documentation: Option[Markdown] = None,
          override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
          override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
          extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
      object Interaction extends CompanionFor[Interaction] {
        implicit def summonObjectAndCompanionInteraction_1421719705(
            o: Interaction): ObjectAndCompanion[Interaction, Interaction.type] = ObjectAndCompanion(o, this)
        override type ResourceType = Interaction
        override type ParentType   = Interaction
        override val parentType: CompanionFor[ResourceType] = Interaction
        def apply(
            id: Option[String] = None,
            code: TYPE_RESTFUL_INTERACTION,
            extension: LitSeq[Extension] = LitSeq.empty,
            documentation: Option[Markdown] = None,
            modifierExtension: LitSeq[Extension] = LitSeq.empty,
            primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
        ): Interaction = new Interaction(
          id,
          code,
          extension,
          documentation,
          modifierExtension,
          primitiveAttributes = primitiveAttributes
        )
        def unapply(
            o: Interaction): Option[(Option[String], TYPE_RESTFUL_INTERACTION, LitSeq[Extension], Option[Markdown], LitSeq[Extension])] =
          Some((o.id, o.code, o.extension, o.documentation, o.modifierExtension))
        val id: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
        val code: FHIRComponentFieldMeta[TYPE_RESTFUL_INTERACTION] =
          FHIRComponentFieldMeta("code", lTagOf[TYPE_RESTFUL_INTERACTION], false, lTagOf[TYPE_RESTFUL_INTERACTION])
        val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val documentation: FHIRComponentFieldMeta[Option[Markdown]] =
          FHIRComponentFieldMeta("documentation", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
        val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, code, extension, documentation, modifierExtension)
        override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
        override def fields(t: Interaction): Seq[FHIRComponentField[_]] = Seq(
          FHIRComponentField[Option[String]](id, t.id),
          FHIRComponentField[TYPE_RESTFUL_INTERACTION](code, t.code),
          FHIRComponentField[LitSeq[Extension]](extension, t.extension),
          FHIRComponentField[Option[Markdown]](documentation, t.documentation),
          FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
        )
        val baseType: CompanionFor[Interaction] = this
        val thisName: String                    = "Interaction"
        def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Interaction] =
          checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
            Try(
              new Interaction(
                cursor.decodeAs[Option[String]]("id", Some(None)),
                cursor.decodeAs[TYPE_RESTFUL_INTERACTION]("code", None),
                cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
                cursor.decodeAs[Option[Markdown]]("documentation", Some(None)),
                cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
                decodeAttributes(cursor)
              )
            ))
      }
      @POJOBoilerplate
      class Interaction(
          override val id: Option[String] = None,
          val code: TYPE_RESTFUL_INTERACTION,
          override val extension: LitSeq[Extension] = LitSeq.empty,
          val documentation: Option[Markdown] = None,
          override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
          override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
          extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
      object SearchParam extends CompanionFor[SearchParam] {
        implicit def summonObjectAndCompanionSearchParam_1421719705(
            o: SearchParam): ObjectAndCompanion[SearchParam, SearchParam.type] = ObjectAndCompanion(o, this)
        override type ResourceType = SearchParam
        override type ParentType   = SearchParam
        override val parentType: CompanionFor[ResourceType] = SearchParam
        def apply(
            id: Option[String] = None,
            name: String,
            `type`: SEARCH_PARAM_TYPE,
            extension: LitSeq[Extension] = LitSeq.empty,
            definition: Option[Canonical] = None,
            documentation: Option[Markdown] = None,
            modifierExtension: LitSeq[Extension] = LitSeq.empty,
            primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
        ): SearchParam = new SearchParam(
          id,
          name,
          `type`,
          extension,
          definition,
          documentation,
          modifierExtension,
          primitiveAttributes = primitiveAttributes
        )
        def unapply(
            o: SearchParam): Option[(Option[String], String, SEARCH_PARAM_TYPE, LitSeq[Extension], Option[Canonical], Option[Markdown], LitSeq[Extension])] =
          Some((o.id, o.name, o.`type`, o.extension, o.definition, o.documentation, o.modifierExtension))
        val id: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
        val name: FHIRComponentFieldMeta[String] =
          FHIRComponentFieldMeta("name", lTagOf[String], false, lTagOf[String])
        val `type`: FHIRComponentFieldMeta[SEARCH_PARAM_TYPE] =
          FHIRComponentFieldMeta("type", lTagOf[SEARCH_PARAM_TYPE], false, lTagOf[SEARCH_PARAM_TYPE])
        val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val definition: FHIRComponentFieldMeta[Option[Canonical]] =
          FHIRComponentFieldMeta("definition", lTagOf[Option[Canonical]], false, lTagOf[Canonical])
        val documentation: FHIRComponentFieldMeta[Option[Markdown]] =
          FHIRComponentFieldMeta("documentation", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
        val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
          Seq(id, name, `type`, extension, definition, documentation, modifierExtension)
        override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
        override def fields(t: SearchParam): Seq[FHIRComponentField[_]] = Seq(
          FHIRComponentField[Option[String]](id, t.id),
          FHIRComponentField[String](name, t.name),
          FHIRComponentField[SEARCH_PARAM_TYPE](`type`, t.`type`),
          FHIRComponentField[LitSeq[Extension]](extension, t.extension),
          FHIRComponentField[Option[Canonical]](definition, t.definition),
          FHIRComponentField[Option[Markdown]](documentation, t.documentation),
          FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
        )
        val baseType: CompanionFor[SearchParam] = this
        val thisName: String                    = "SearchParam"
        def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[SearchParam] =
          checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
            Try(
              new SearchParam(
                cursor.decodeAs[Option[String]]("id", Some(None)),
                cursor.decodeAs[String]("name", None),
                cursor.decodeAs[SEARCH_PARAM_TYPE]("type", None),
                cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
                cursor.decodeAs[Option[Canonical]]("definition", Some(None)),
                cursor.decodeAs[Option[Markdown]]("documentation", Some(None)),
                cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
                decodeAttributes(cursor)
              )
            ))
      }
      @POJOBoilerplate
      class SearchParam(
          override val id: Option[String] = None,
          val name: String,
          val `type`: SEARCH_PARAM_TYPE,
          override val extension: LitSeq[Extension] = LitSeq.empty,
          val definition: Option[Canonical] = None,
          val documentation: Option[Markdown] = None,
          override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
          override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
          extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
      def apply(
          id: Option[String] = None,
          `type`: RESOURCE_TYPES,
          profile: Option[Canonical] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          versioning: Option[VERSIONING_POLICY] = None,
          readHistory: Option[Boolean] = None,
          updateCreate: Option[Boolean] = None,
          documentation: Option[Markdown] = None,
          searchInclude: LitSeq[String] = LitSeq.empty,
          conditionalRead: Option[CONDITIONAL_READ_STATUS] = None,
          referencePolicy: LitSeq[REFERENCE_HANDLING_POLICY] = LitSeq.empty,
          supportedProfile: LitSeq[Canonical] = LitSeq.empty,
          searchRevInclude: LitSeq[String] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          conditionalCreate: Option[Boolean] = None,
          conditionalUpdate: Option[Boolean] = None,
          conditionalDelete: Option[CONDITIONAL_DELETE_STATUS] = None,
          operation: LitSeq[Resource.Operation] = LitSeq.empty,
          interaction: LitSeq[Resource.Interaction] = LitSeq.empty,
          searchParam: LitSeq[Resource.SearchParam] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Resource = new Resource(
        id,
        `type`,
        profile,
        extension,
        versioning,
        readHistory,
        updateCreate,
        documentation,
        searchInclude,
        conditionalRead,
        referencePolicy,
        supportedProfile,
        searchRevInclude,
        modifierExtension,
        conditionalCreate,
        conditionalUpdate,
        conditionalDelete,
        operation,
        interaction,
        searchParam,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Resource): Option[(Option[String], RESOURCE_TYPES, Option[Canonical], LitSeq[Extension], Option[VERSIONING_POLICY], Option[Boolean], Option[Boolean], Option[Markdown], LitSeq[String], Option[CONDITIONAL_READ_STATUS], LitSeq[REFERENCE_HANDLING_POLICY], LitSeq[Canonical], LitSeq[String], LitSeq[Extension], Option[Boolean], Option[Boolean], Option[CONDITIONAL_DELETE_STATUS], LitSeq[Resource.Operation], LitSeq[Resource.Interaction], LitSeq[Resource.SearchParam])] =
        Some(
          (
            o.id,
            o.`type`,
            o.profile,
            o.extension,
            o.versioning,
            o.readHistory,
            o.updateCreate,
            o.documentation,
            o.searchInclude,
            o.conditionalRead,
            o.referencePolicy,
            o.supportedProfile,
            o.searchRevInclude,
            o.modifierExtension,
            o.conditionalCreate,
            o.conditionalUpdate,
            o.conditionalDelete,
            o.operation,
            o.interaction,
            o.searchParam))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val `type`: FHIRComponentFieldMeta[RESOURCE_TYPES] =
        FHIRComponentFieldMeta("type", lTagOf[RESOURCE_TYPES], false, lTagOf[RESOURCE_TYPES])
      val profile: FHIRComponentFieldMeta[Option[Canonical]] =
        FHIRComponentFieldMeta("profile", lTagOf[Option[Canonical]], false, lTagOf[Canonical])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val versioning: FHIRComponentFieldMeta[Option[VERSIONING_POLICY]] =
        FHIRComponentFieldMeta("versioning", lTagOf[Option[VERSIONING_POLICY]], false, lTagOf[VERSIONING_POLICY])
      val readHistory: FHIRComponentFieldMeta[Option[Boolean]] =
        FHIRComponentFieldMeta("readHistory", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
      val updateCreate: FHIRComponentFieldMeta[Option[Boolean]] =
        FHIRComponentFieldMeta("updateCreate", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
      val documentation: FHIRComponentFieldMeta[Option[Markdown]] =
        FHIRComponentFieldMeta("documentation", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
      val searchInclude: FHIRComponentFieldMeta[LitSeq[String]] =
        FHIRComponentFieldMeta("searchInclude", lTagOf[LitSeq[String]], false, lTagOf[String])
      val conditionalRead: FHIRComponentFieldMeta[Option[CONDITIONAL_READ_STATUS]] =
        FHIRComponentFieldMeta("conditionalRead", lTagOf[Option[CONDITIONAL_READ_STATUS]], false, lTagOf[CONDITIONAL_READ_STATUS])
      val referencePolicy: FHIRComponentFieldMeta[LitSeq[REFERENCE_HANDLING_POLICY]] =
        FHIRComponentFieldMeta(
          "referencePolicy",
          lTagOf[LitSeq[REFERENCE_HANDLING_POLICY]],
          false,
          lTagOf[REFERENCE_HANDLING_POLICY])
      val supportedProfile: FHIRComponentFieldMeta[LitSeq[Canonical]] =
        FHIRComponentFieldMeta("supportedProfile", lTagOf[LitSeq[Canonical]], false, lTagOf[Canonical])
      val searchRevInclude: FHIRComponentFieldMeta[LitSeq[String]] =
        FHIRComponentFieldMeta("searchRevInclude", lTagOf[LitSeq[String]], false, lTagOf[String])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val conditionalCreate: FHIRComponentFieldMeta[Option[Boolean]] =
        FHIRComponentFieldMeta("conditionalCreate", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
      val conditionalUpdate: FHIRComponentFieldMeta[Option[Boolean]] =
        FHIRComponentFieldMeta("conditionalUpdate", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
      val conditionalDelete: FHIRComponentFieldMeta[Option[CONDITIONAL_DELETE_STATUS]] =
        FHIRComponentFieldMeta(
          "conditionalDelete",
          lTagOf[Option[CONDITIONAL_DELETE_STATUS]],
          false,
          lTagOf[CONDITIONAL_DELETE_STATUS])
      val operation: FHIRComponentFieldMeta[LitSeq[Resource.Operation]] =
        FHIRComponentFieldMeta("operation", lTagOf[LitSeq[Resource.Operation]], false, lTagOf[Resource.Operation])
      val interaction: FHIRComponentFieldMeta[LitSeq[Resource.Interaction]] =
        FHIRComponentFieldMeta("interaction", lTagOf[LitSeq[Resource.Interaction]], false, lTagOf[Resource.Interaction])
      val searchParam: FHIRComponentFieldMeta[LitSeq[Resource.SearchParam]] =
        FHIRComponentFieldMeta("searchParam", lTagOf[LitSeq[Resource.SearchParam]], false, lTagOf[Resource.SearchParam])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
        id,
        `type`,
        profile,
        extension,
        versioning,
        readHistory,
        updateCreate,
        documentation,
        searchInclude,
        conditionalRead,
        referencePolicy,
        supportedProfile,
        searchRevInclude,
        modifierExtension,
        conditionalCreate,
        conditionalUpdate,
        conditionalDelete,
        operation,
        interaction,
        searchParam
      )
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Resource): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[RESOURCE_TYPES](`type`, t.`type`),
        FHIRComponentField[Option[Canonical]](profile, t.profile),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[VERSIONING_POLICY]](versioning, t.versioning),
        FHIRComponentField[Option[Boolean]](readHistory, t.readHistory),
        FHIRComponentField[Option[Boolean]](updateCreate, t.updateCreate),
        FHIRComponentField[Option[Markdown]](documentation, t.documentation),
        FHIRComponentField[LitSeq[String]](searchInclude, t.searchInclude),
        FHIRComponentField[Option[CONDITIONAL_READ_STATUS]](conditionalRead, t.conditionalRead),
        FHIRComponentField[LitSeq[REFERENCE_HANDLING_POLICY]](referencePolicy, t.referencePolicy),
        FHIRComponentField[LitSeq[Canonical]](supportedProfile, t.supportedProfile),
        FHIRComponentField[LitSeq[String]](searchRevInclude, t.searchRevInclude),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
        FHIRComponentField[Option[Boolean]](conditionalCreate, t.conditionalCreate),
        FHIRComponentField[Option[Boolean]](conditionalUpdate, t.conditionalUpdate),
        FHIRComponentField[Option[CONDITIONAL_DELETE_STATUS]](conditionalDelete, t.conditionalDelete),
        FHIRComponentField[LitSeq[Resource.Operation]](operation, t.operation),
        FHIRComponentField[LitSeq[Resource.Interaction]](interaction, t.interaction),
        FHIRComponentField[LitSeq[Resource.SearchParam]](searchParam, t.searchParam)
      )
      val baseType: CompanionFor[Resource] = this
      val thisName: String                 = "Resource"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Resource] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Resource(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[RESOURCE_TYPES]("type", None),
              cursor.decodeAs[Option[Canonical]]("profile", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[VERSIONING_POLICY]]("versioning", Some(None)),
              cursor.decodeAs[Option[Boolean]]("readHistory", Some(None)),
              cursor.decodeAs[Option[Boolean]]("updateCreate", Some(None)),
              cursor.decodeAs[Option[Markdown]]("documentation", Some(None)),
              cursor.decodeAs[LitSeq[String]]("searchInclude", Some(LitSeq.empty)),
              cursor.decodeAs[Option[CONDITIONAL_READ_STATUS]]("conditionalRead", Some(None)),
              cursor.decodeAs[LitSeq[REFERENCE_HANDLING_POLICY]]("referencePolicy", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Canonical]]("supportedProfile", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[String]]("searchRevInclude", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[Boolean]]("conditionalCreate", Some(None)),
              cursor.decodeAs[Option[Boolean]]("conditionalUpdate", Some(None)),
              cursor.decodeAs[Option[CONDITIONAL_DELETE_STATUS]]("conditionalDelete", Some(None)),
              cursor.decodeAs[LitSeq[Resource.Operation]]("operation", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Resource.Interaction]]("interaction", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Resource.SearchParam]]("searchParam", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Resource(
        override val id: Option[String] = None,
        val `type`: RESOURCE_TYPES,
        val profile: Option[Canonical] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val versioning: Option[VERSIONING_POLICY] = None,
        val readHistory: Option[Boolean] = None,
        val updateCreate: Option[Boolean] = None,
        val documentation: Option[Markdown] = None,
        val searchInclude: LitSeq[String] = LitSeq.empty,
        val conditionalRead: Option[CONDITIONAL_READ_STATUS] = None,
        val referencePolicy: LitSeq[REFERENCE_HANDLING_POLICY] = LitSeq.empty,
        val supportedProfile: LitSeq[Canonical] = LitSeq.empty,
        val searchRevInclude: LitSeq[String] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        val conditionalCreate: Option[Boolean] = None,
        val conditionalUpdate: Option[Boolean] = None,
        val conditionalDelete: Option[CONDITIONAL_DELETE_STATUS] = None,
        val operation: LitSeq[Resource.Operation] = LitSeq.empty,
        val interaction: LitSeq[Resource.Interaction] = LitSeq.empty,
        val searchParam: LitSeq[Resource.SearchParam] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        mode: RESTFUL_CAPABILITY_MODE,
        extension: LitSeq[Extension] = LitSeq.empty,
        operation: LitSeq[CapabilityStatement.Rest.Resource.Operation] = LitSeq.empty,
        searchParam: LitSeq[CapabilityStatement.Rest.Resource.SearchParam] = LitSeq.empty,
        compartment: LitSeq[Canonical] = LitSeq.empty,
        documentation: Option[Markdown] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        security: Option[Rest.Security] = None,
        interaction: LitSeq[Rest.Interaction] = LitSeq.empty,
        resource: LitSeq[Rest.Resource] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Rest = new Rest(
      id,
      mode,
      extension,
      operation,
      searchParam,
      compartment,
      documentation,
      modifierExtension,
      security,
      interaction,
      resource,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Rest): Option[(Option[String], RESTFUL_CAPABILITY_MODE, LitSeq[Extension], LitSeq[CapabilityStatement.Rest.Resource.Operation], LitSeq[CapabilityStatement.Rest.Resource.SearchParam], LitSeq[Canonical], Option[Markdown], LitSeq[Extension], Option[Rest.Security], LitSeq[Rest.Interaction], LitSeq[Rest.Resource])] =
      Some(
        (
          o.id,
          o.mode,
          o.extension,
          o.operation,
          o.searchParam,
          o.compartment,
          o.documentation,
          o.modifierExtension,
          o.security,
          o.interaction,
          o.resource))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val mode: FHIRComponentFieldMeta[RESTFUL_CAPABILITY_MODE] =
      FHIRComponentFieldMeta("mode", lTagOf[RESTFUL_CAPABILITY_MODE], false, lTagOf[RESTFUL_CAPABILITY_MODE])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val operation: FHIRComponentFieldMeta[LitSeq[CapabilityStatement.Rest.Resource.Operation]] =
      FHIRComponentFieldMeta(
        "operation",
        lTagOf[LitSeq[CapabilityStatement.Rest.Resource.Operation]],
        false,
        lTagOf[CapabilityStatement.Rest.Resource.Operation])
    val searchParam: FHIRComponentFieldMeta[LitSeq[CapabilityStatement.Rest.Resource.SearchParam]] =
      FHIRComponentFieldMeta(
        "searchParam",
        lTagOf[LitSeq[CapabilityStatement.Rest.Resource.SearchParam]],
        false,
        lTagOf[CapabilityStatement.Rest.Resource.SearchParam])
    val compartment: FHIRComponentFieldMeta[LitSeq[Canonical]] =
      FHIRComponentFieldMeta("compartment", lTagOf[LitSeq[Canonical]], false, lTagOf[Canonical])
    val documentation: FHIRComponentFieldMeta[Option[Markdown]] =
      FHIRComponentFieldMeta("documentation", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val security: FHIRComponentFieldMeta[Option[Rest.Security]] =
      FHIRComponentFieldMeta("security", lTagOf[Option[Rest.Security]], false, lTagOf[Rest.Security])
    val interaction: FHIRComponentFieldMeta[LitSeq[Rest.Interaction]] =
      FHIRComponentFieldMeta("interaction", lTagOf[LitSeq[Rest.Interaction]], false, lTagOf[Rest.Interaction])
    val resource: FHIRComponentFieldMeta[LitSeq[Rest.Resource]] =
      FHIRComponentFieldMeta("resource", lTagOf[LitSeq[Rest.Resource]], false, lTagOf[Rest.Resource])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
      id,
      mode,
      extension,
      operation,
      searchParam,
      compartment,
      documentation,
      modifierExtension,
      security,
      interaction,
      resource)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Rest): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[RESTFUL_CAPABILITY_MODE](mode, t.mode),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[CapabilityStatement.Rest.Resource.Operation]](operation, t.operation),
      FHIRComponentField[LitSeq[CapabilityStatement.Rest.Resource.SearchParam]](searchParam, t.searchParam),
      FHIRComponentField[LitSeq[Canonical]](compartment, t.compartment),
      FHIRComponentField[Option[Markdown]](documentation, t.documentation),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[Rest.Security]](security, t.security),
      FHIRComponentField[LitSeq[Rest.Interaction]](interaction, t.interaction),
      FHIRComponentField[LitSeq[Rest.Resource]](resource, t.resource)
    )
    val baseType: CompanionFor[Rest] = this
    val thisName: String             = "Rest"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Rest] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Rest(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[RESTFUL_CAPABILITY_MODE]("mode", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[CapabilityStatement.Rest.Resource.Operation]]("operation", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[CapabilityStatement.Rest.Resource.SearchParam]]("searchParam", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Canonical]]("compartment", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Markdown]]("documentation", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Rest.Security]]("security", Some(None)),
            cursor.decodeAs[LitSeq[Rest.Interaction]]("interaction", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Rest.Resource]]("resource", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Rest(
      override val id: Option[String] = None,
      val mode: RESTFUL_CAPABILITY_MODE,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val operation: LitSeq[CapabilityStatement.Rest.Resource.Operation] = LitSeq.empty,
      val searchParam: LitSeq[CapabilityStatement.Rest.Resource.SearchParam] = LitSeq.empty,
      val compartment: LitSeq[Canonical] = LitSeq.empty,
      val documentation: Option[Markdown] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val security: Option[Rest.Security] = None,
      val interaction: LitSeq[Rest.Interaction] = LitSeq.empty,
      val resource: LitSeq[Rest.Resource] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Implementation extends CompanionFor[Implementation] {
    implicit def summonObjectAndCompanionImplementation_1742844370(
        o: Implementation): ObjectAndCompanion[Implementation, Implementation.type] = ObjectAndCompanion(o, this)
    override type ResourceType = Implementation
    override type ParentType   = Implementation
    override val parentType: CompanionFor[ResourceType] = Implementation
    def apply(
        id: Option[String] = None,
        url: Option[UrlStr] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        custodian: Option[Reference] = None,
        description: String,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Implementation = new Implementation(
      id,
      url,
      extension,
      custodian,
      description,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Implementation): Option[(Option[String], Option[UrlStr], LitSeq[Extension], Option[Reference], String, LitSeq[Extension])] =
      Some((o.id, o.url, o.extension, o.custodian, o.description, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val url: FHIRComponentFieldMeta[Option[UrlStr]] =
      FHIRComponentFieldMeta("url", lTagOf[Option[UrlStr]], false, lTagOf[UrlStr])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val custodian: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("custodian", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val description: FHIRComponentFieldMeta[String] =
      FHIRComponentFieldMeta("description", lTagOf[String], false, lTagOf[String])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, url, extension, custodian, description, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Implementation): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[UrlStr]](url, t.url),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Reference]](custodian, t.custodian),
      FHIRComponentField[String](description, t.description),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Implementation] = this
    val thisName: String                       = "Implementation"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Implementation] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Implementation(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[UrlStr]]("url", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Reference]]("custodian", Some(None)),
            cursor.decodeAs[String]("description", None),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Implementation(
      override val id: Option[String] = None,
      val url: Option[UrlStr] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val custodian: Option[Reference] = None,
      val description: String,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Document extends CompanionFor[Document] {
    implicit def summonObjectAndCompanionDocument_1742844370(o: Document): ObjectAndCompanion[Document, Document.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Document
    override type ParentType   = Document
    override val parentType: CompanionFor[ResourceType] = Document
    def apply(
        id: Option[String] = None,
        mode: DOCUMENT_MODE,
        profile: Canonical,
        extension: LitSeq[Extension] = LitSeq.empty,
        documentation: Option[Markdown] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Document = new Document(
      id,
      mode,
      profile,
      extension,
      documentation,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Document): Option[(Option[String], DOCUMENT_MODE, Canonical, LitSeq[Extension], Option[Markdown], LitSeq[Extension])] =
      Some((o.id, o.mode, o.profile, o.extension, o.documentation, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val mode: FHIRComponentFieldMeta[DOCUMENT_MODE] =
      FHIRComponentFieldMeta("mode", lTagOf[DOCUMENT_MODE], false, lTagOf[DOCUMENT_MODE])
    val profile: FHIRComponentFieldMeta[Canonical] =
      FHIRComponentFieldMeta("profile", lTagOf[Canonical], false, lTagOf[Canonical])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val documentation: FHIRComponentFieldMeta[Option[Markdown]] =
      FHIRComponentFieldMeta("documentation", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, mode, profile, extension, documentation, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Document): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[DOCUMENT_MODE](mode, t.mode),
      FHIRComponentField[Canonical](profile, t.profile),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Markdown]](documentation, t.documentation),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Document] = this
    val thisName: String                 = "Document"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Document] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Document(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[DOCUMENT_MODE]("mode", None),
            cursor.decodeAs[Canonical]("profile", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Markdown]]("documentation", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Document(
      override val id: Option[String] = None,
      val mode: DOCUMENT_MODE,
      val profile: Canonical,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val documentation: Option[Markdown] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Software extends CompanionFor[Software] {
    implicit def summonObjectAndCompanionSoftware_1742844370(o: Software): ObjectAndCompanion[Software, Software.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Software
    override type ParentType   = Software
    override val parentType: CompanionFor[ResourceType] = Software
    def apply(
        id: Option[String] = None,
        name: String,
        version: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        releaseDate: Option[FHIRDateTime] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Software = new Software(
      id,
      name,
      version,
      extension,
      releaseDate,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Software): Option[(Option[String], String, Option[String], LitSeq[Extension], Option[FHIRDateTime], LitSeq[Extension])] =
      Some((o.id, o.name, o.version, o.extension, o.releaseDate, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val name: FHIRComponentFieldMeta[String] =
      FHIRComponentFieldMeta("name", lTagOf[String], false, lTagOf[String])
    val version: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("version", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val releaseDate: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
      FHIRComponentFieldMeta("releaseDate", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, name, version, extension, releaseDate, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Software): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[String](name, t.name),
      FHIRComponentField[Option[String]](version, t.version),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[FHIRDateTime]](releaseDate, t.releaseDate),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Software] = this
    val thisName: String                 = "Software"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Software] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Software(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[String]("name", None),
            cursor.decodeAs[Option[String]]("version", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[FHIRDateTime]]("releaseDate", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Software(
      override val id: Option[String] = None,
      val name: String,
      val version: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val releaseDate: Option[FHIRDateTime] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      url: Option[UriStr] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      name: Option[String] = None,
      date: FHIRDateTime,
      kind: CAPABILITY_STATEMENT_KIND,
      title: Option[String] = None,
      status: PUBLICATION_STATUS,
      format: NonEmptyLitSeq[Code],
      version: Option[String] = None,
      contact: LitSeq[ContactDetail] = LitSeq.empty,
      purpose: Option[Markdown] = None,
      imports: LitSeq[Canonical] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      publisher: Option[String] = None,
      copyright: Option[Markdown] = None,
      useContext: LitSeq[UsageContext] = LitSeq.empty,
      description: Option[Markdown] = None,
      fhirVersion: FHIR_VERSION,
      patchFormat: LitSeq[Code] = LitSeq.empty,
      experimental: Option[Boolean] = None,
      jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
      instantiates: LitSeq[Canonical] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      implementationGuide: LitSeq[Canonical] = LitSeq.empty,
      software: Option[CapabilityStatement.Software] = None,
      document: LitSeq[CapabilityStatement.Document] = LitSeq.empty,
      implementation: Option[CapabilityStatement.Implementation] = None,
      rest: LitSeq[CapabilityStatement.Rest] = LitSeq.empty,
      messaging: LitSeq[CapabilityStatement.Messaging] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): CapabilityStatement = new CapabilityStatement(
    id,
    url,
    meta,
    text,
    name,
    date,
    kind,
    title,
    status,
    format,
    version,
    contact,
    purpose,
    imports,
    language,
    contained,
    extension,
    publisher,
    copyright,
    useContext,
    description,
    fhirVersion,
    patchFormat,
    experimental,
    jurisdiction,
    instantiates,
    implicitRules,
    modifierExtension,
    implementationGuide,
    software,
    document,
    implementation,
    rest,
    messaging,
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
  val date: FHIRComponentFieldMeta[FHIRDateTime] =
    FHIRComponentFieldMeta("date", lTagOf[FHIRDateTime], false, lTagOf[FHIRDateTime])
  val kind: FHIRComponentFieldMeta[CAPABILITY_STATEMENT_KIND] =
    FHIRComponentFieldMeta("kind", lTagOf[CAPABILITY_STATEMENT_KIND], false, lTagOf[CAPABILITY_STATEMENT_KIND])
  val title: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("title", lTagOf[Option[String]], false, lTagOf[String])
  val status: FHIRComponentFieldMeta[PUBLICATION_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[PUBLICATION_STATUS], false, lTagOf[PUBLICATION_STATUS])
  val format: FHIRComponentFieldMeta[NonEmptyLitSeq[Code]] =
    FHIRComponentFieldMeta("format", lTagOf[NonEmptyLitSeq[Code]], false, lTagOf[Code])
  val version: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("version", lTagOf[Option[String]], false, lTagOf[String])
  val contact: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("contact", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val purpose: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("purpose", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val imports: FHIRComponentFieldMeta[LitSeq[Canonical]] =
    FHIRComponentFieldMeta("imports", lTagOf[LitSeq[Canonical]], false, lTagOf[Canonical])
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
  val useContext: FHIRComponentFieldMeta[LitSeq[UsageContext]] =
    FHIRComponentFieldMeta("useContext", lTagOf[LitSeq[UsageContext]], false, lTagOf[UsageContext])
  val description: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("description", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val fhirVersion: FHIRComponentFieldMeta[FHIR_VERSION] =
    FHIRComponentFieldMeta("fhirVersion", lTagOf[FHIR_VERSION], false, lTagOf[FHIR_VERSION])
  val patchFormat: FHIRComponentFieldMeta[LitSeq[Code]] =
    FHIRComponentFieldMeta("patchFormat", lTagOf[LitSeq[Code]], false, lTagOf[Code])
  val experimental: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("experimental", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val jurisdiction: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("jurisdiction", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val instantiates: FHIRComponentFieldMeta[LitSeq[Canonical]] =
    FHIRComponentFieldMeta("instantiates", lTagOf[LitSeq[Canonical]], false, lTagOf[Canonical])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val implementationGuide: FHIRComponentFieldMeta[LitSeq[Canonical]] =
    FHIRComponentFieldMeta("implementationGuide", lTagOf[LitSeq[Canonical]], false, lTagOf[Canonical])
  val software: FHIRComponentFieldMeta[Option[CapabilityStatement.Software]] =
    FHIRComponentFieldMeta("software", lTagOf[Option[CapabilityStatement.Software]], false, lTagOf[CapabilityStatement.Software])
  val document: FHIRComponentFieldMeta[LitSeq[CapabilityStatement.Document]] =
    FHIRComponentFieldMeta("document", lTagOf[LitSeq[CapabilityStatement.Document]], false, lTagOf[CapabilityStatement.Document])
  val implementation: FHIRComponentFieldMeta[Option[CapabilityStatement.Implementation]] =
    FHIRComponentFieldMeta(
      "implementation",
      lTagOf[Option[CapabilityStatement.Implementation]],
      false,
      lTagOf[CapabilityStatement.Implementation])
  val rest: FHIRComponentFieldMeta[LitSeq[CapabilityStatement.Rest]] =
    FHIRComponentFieldMeta("rest", lTagOf[LitSeq[CapabilityStatement.Rest]], false, lTagOf[CapabilityStatement.Rest])
  val messaging: FHIRComponentFieldMeta[LitSeq[CapabilityStatement.Messaging]] =
    FHIRComponentFieldMeta(
      "messaging",
      lTagOf[LitSeq[CapabilityStatement.Messaging]],
      false,
      lTagOf[CapabilityStatement.Messaging])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    url,
    meta,
    text,
    name,
    date,
    kind,
    title,
    status,
    format,
    version,
    contact,
    purpose,
    imports,
    language,
    contained,
    extension,
    publisher,
    copyright,
    useContext,
    description,
    fhirVersion,
    patchFormat,
    experimental,
    jurisdiction,
    instantiates,
    implicitRules,
    modifierExtension,
    implementationGuide,
    software,
    document,
    implementation,
    rest,
    messaging
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: CapabilityStatement): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[UriStr]](url, t.url),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[String]](name, t.name),
    FHIRComponentField[FHIRDateTime](date, t.date),
    FHIRComponentField[CAPABILITY_STATEMENT_KIND](kind, t.kind),
    FHIRComponentField[Option[String]](title, t.title),
    FHIRComponentField[PUBLICATION_STATUS](status, t.status),
    FHIRComponentField[NonEmptyLitSeq[Code]](format, t.format),
    FHIRComponentField[Option[String]](version, t.version),
    FHIRComponentField[LitSeq[ContactDetail]](contact, t.contact),
    FHIRComponentField[Option[Markdown]](purpose, t.purpose),
    FHIRComponentField[LitSeq[Canonical]](imports, t.imports),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[String]](publisher, t.publisher),
    FHIRComponentField[Option[Markdown]](copyright, t.copyright),
    FHIRComponentField[LitSeq[UsageContext]](useContext, t.useContext),
    FHIRComponentField[Option[Markdown]](description, t.description),
    FHIRComponentField[FHIR_VERSION](fhirVersion, t.fhirVersion),
    FHIRComponentField[LitSeq[Code]](patchFormat, t.patchFormat),
    FHIRComponentField[Option[Boolean]](experimental, t.experimental),
    FHIRComponentField[LitSeq[CodeableConcept]](jurisdiction, t.jurisdiction),
    FHIRComponentField[LitSeq[Canonical]](instantiates, t.instantiates),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[Canonical]](implementationGuide, t.implementationGuide),
    FHIRComponentField[Option[CapabilityStatement.Software]](software, t.software),
    FHIRComponentField[LitSeq[CapabilityStatement.Document]](document, t.document),
    FHIRComponentField[Option[CapabilityStatement.Implementation]](implementation, t.implementation),
    FHIRComponentField[LitSeq[CapabilityStatement.Rest]](rest, t.rest),
    FHIRComponentField[LitSeq[CapabilityStatement.Messaging]](messaging, t.messaging)
  )
  def extractId(t: CapabilityStatement): Option[String]                                         = t.id
  def extractUrl(t: CapabilityStatement): Option[UriStr]                                        = t.url
  def extractMeta(t: CapabilityStatement): Option[Meta]                                         = t.meta
  def extractText(t: CapabilityStatement): Option[Narrative]                                    = t.text
  def extractName(t: CapabilityStatement): Option[String]                                       = t.name
  def extractDate(t: CapabilityStatement): FHIRDateTime                                         = t.date
  def extractKind(t: CapabilityStatement): CAPABILITY_STATEMENT_KIND                            = t.kind
  def extractTitle(t: CapabilityStatement): Option[String]                                      = t.title
  def extractStatus(t: CapabilityStatement): PUBLICATION_STATUS                                 = t.status
  def extractFormat(t: CapabilityStatement): NonEmptyLitSeq[Code]                               = t.format
  def extractVersion(t: CapabilityStatement): Option[String]                                    = t.version
  def extractContact(t: CapabilityStatement): LitSeq[ContactDetail]                             = t.contact
  def extractPurpose(t: CapabilityStatement): Option[Markdown]                                  = t.purpose
  def extractImports(t: CapabilityStatement): LitSeq[Canonical]                                 = t.imports
  def extractLanguage(t: CapabilityStatement): Option[LANGUAGES]                                = t.language
  def extractContained(t: CapabilityStatement): LitSeq[Resource]                                = t.contained
  def extractExtension(t: CapabilityStatement): LitSeq[Extension]                               = t.extension
  def extractPublisher(t: CapabilityStatement): Option[String]                                  = t.publisher
  def extractCopyright(t: CapabilityStatement): Option[Markdown]                                = t.copyright
  def extractUseContext(t: CapabilityStatement): LitSeq[UsageContext]                           = t.useContext
  def extractDescription(t: CapabilityStatement): Option[Markdown]                              = t.description
  def extractFhirVersion(t: CapabilityStatement): FHIR_VERSION                                  = t.fhirVersion
  def extractPatchFormat(t: CapabilityStatement): LitSeq[Code]                                  = t.patchFormat
  def extractExperimental(t: CapabilityStatement): Option[Boolean]                              = t.experimental
  def extractJurisdiction(t: CapabilityStatement): LitSeq[CodeableConcept]                      = t.jurisdiction
  def extractInstantiates(t: CapabilityStatement): LitSeq[Canonical]                            = t.instantiates
  def extractImplicitRules(t: CapabilityStatement): Option[UriStr]                              = t.implicitRules
  def extractModifierExtension(t: CapabilityStatement): LitSeq[Extension]                       = t.modifierExtension
  def extractImplementationGuide(t: CapabilityStatement): LitSeq[Canonical]                     = t.implementationGuide
  def extractSoftware(t: CapabilityStatement): Option[CapabilityStatement.Software]             = t.software
  def extractDocument(t: CapabilityStatement): LitSeq[CapabilityStatement.Document]             = t.document
  def extractImplementation(t: CapabilityStatement): Option[CapabilityStatement.Implementation] = t.implementation
  def extractRest(t: CapabilityStatement): LitSeq[CapabilityStatement.Rest]                     = t.rest
  def extractMessaging(t: CapabilityStatement): LitSeq[CapabilityStatement.Messaging]           = t.messaging
  override val thisName: String                                                                 = "CapabilityStatement"
  override val searchParams: Map[String, CapabilityStatement => Seq[Any]] = Map(
    "name"                  -> (obj => obj.name.toSeq),
    "context-type-quantity" -> (obj => obj.useContext.toSeq),
    "url"                   -> (obj => obj.url.toSeq),
    "description"           -> (obj => obj.description.toSeq),
    "context"               -> (obj => obj.useContext.map(_.value).flatMap(_.as[CodeableConcept]).toSeq),
    "software"              -> (obj => obj.software.map(_.name).toSeq),
    "mode"                  -> (obj => obj.rest.map(_.mode).toSeq),
    "context-type"          -> (obj => obj.useContext.map(_.code).toSeq),
    "jurisdiction"          -> (obj => obj.jurisdiction.toSeq),
    "format"                -> (obj => obj.format.toSeq),
    "security-service"      -> (obj => obj.rest.flatMap(_.security).flatMap(_.service).toSeq),
    "resource-profile"      -> (obj => obj.rest.flatMap(_.resource).flatMap(_.profile).toSeq),
    "guide"                 -> (obj => obj.implementationGuide.toSeq),
    "supported-profile"     -> (obj => obj.rest.flatMap(_.resource).flatMap(_.supportedProfile).toSeq),
    "fhirversion"           -> (obj => obj.version.toSeq),
    "context-type-value"    -> (obj => obj.useContext.toSeq),
    "version"               -> (obj => obj.version.toSeq),
    "date"                  -> (obj => Seq(obj.date)),
    "resource"              -> (obj => obj.rest.flatMap(_.resource).map(_.`type`).toSeq),
    "status"                -> (obj => Seq(obj.status)),
    "publisher"             -> (obj => obj.publisher.toSeq),
    "title"                 -> (obj => obj.title.toSeq),
    "context-quantity" -> (obj =>
      obj.useContext.map(_.value).flatMap(_.as[Quantity]).toSeq ++
        obj.useContext.map(_.value).flatMap(_.as[Range]).toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[CapabilityStatement] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new CapabilityStatement(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[UriStr]]("url", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[String]]("name", Some(None)),
          cursor.decodeAs[FHIRDateTime]("date", None),
          cursor.decodeAs[CAPABILITY_STATEMENT_KIND]("kind", None),
          cursor.decodeAs[Option[String]]("title", Some(None)),
          cursor.decodeAs[PUBLICATION_STATUS]("status", None),
          cursor.decodeAs[NonEmptyLitSeq[Code]]("format", None),
          cursor.decodeAs[Option[String]]("version", Some(None)),
          cursor.decodeAs[LitSeq[ContactDetail]]("contact", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Markdown]]("purpose", Some(None)),
          cursor.decodeAs[LitSeq[Canonical]]("imports", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("publisher", Some(None)),
          cursor.decodeAs[Option[Markdown]]("copyright", Some(None)),
          cursor.decodeAs[LitSeq[UsageContext]]("useContext", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Markdown]]("description", Some(None)),
          cursor.decodeAs[FHIR_VERSION]("fhirVersion", None),
          cursor.decodeAs[LitSeq[Code]]("patchFormat", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Boolean]]("experimental", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("jurisdiction", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Canonical]]("instantiates", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Canonical]]("implementationGuide", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CapabilityStatement.Software]]("software", Some(None)),
          cursor.decodeAs[LitSeq[CapabilityStatement.Document]]("document", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CapabilityStatement.Implementation]]("implementation", Some(None)),
          cursor.decodeAs[LitSeq[CapabilityStatement.Rest]]("rest", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CapabilityStatement.Messaging]]("messaging", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of FHIR that may
  * be used as a statement of actual server functionality or a statement of required or desired server implementation.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields url, name, date, kind, title, status, format, version, contact, purpose, imports, publisher,
  *   copyright, useContext, description, fhirVersion, patchFormat, experimental, jurisdiction, instantiates, implementationGuide,
  *   software, document, implementation, rest, messaging.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param url
  *   - An absolute URI that is used to identify this capability statement when it is referenced in a specification, model,
  *   design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address
  *   at which at which an authoritative instance of this capability statement is (or will be) published. This URL can be the
  *   target of a canonical reference. It SHALL remain the same when the capability statement is stored on different servers.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *   not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *   resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to
  *   make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be
  *   represented in the narrative to ensure clinical safety.
  * @param name
  *   - A natural language name identifying the capability statement. This name should be usable as an identifier for the module
  *   by machine processing applications such as code generation.
  * @param date
  *   - The date (and optionally time) when the capability statement was published. The date must change when the business
  *   version changes and it must change if the status code changes. In addition, it should change when the substantive content of
  *   the capability statement changes.
  * @param kind
  *   - The way that this statement is intended to be used, to describe an actual running instance of software, a particular
  *   product (kind, not instance of software) or a class of implementation (e.g. a desired purchase).
  * @param title
  *   - A short, descriptive, user-friendly title for the capability statement.
  * @param status
  *   - The status of this capability statement. Enables tracking the life-cycle of the content.
  * @param format
  *   - A list of the formats supported by this implementation using their content types.
  * @param version
  *   - The identifier that is used to identify this version of the capability statement when it is referenced in a
  *   specification, model, design or instance. This is an arbitrary value managed by the capability statement author and is not
  *   expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available.
  *   There is also no expectation that versions can be placed in a lexicographical sequence.
  * @param contact
  *   - Contact details to assist a user in finding and communicating with the publisher.
  * @param purpose
  *   - Explanation of why this capability statement is needed and why it has been designed as it has.
  * @param imports
  *   - Reference to a canonical URL of another CapabilityStatement that this software adds to. The capability statement
  *   automatically includes everything in the other statement, and it is not duplicated, though the server may repeat the same
  *   resources, interactions and operations to add additional details to them.
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
  *   - The name of the organization or individual that published the capability statement.
  * @param copyright
  *   - A copyright statement relating to the capability statement and/or its contents. Copyright statements are generally legal
  *   restrictions on the use and publishing of the capability statement.
  * @param useContext
  *   - The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be
  *   general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be
  *   used to assist with indexing and searching for appropriate capability statement instances.
  * @param description
  *   - A free text natural language description of the capability statement from a consumer's perspective. Typically, this is
  *   used when the capability statement describes a desired rather than an actual solution, for example as a formal expression of
  *   requirements as part of an RFP.
  * @param fhirVersion
  *   - The version of the FHIR specification that this CapabilityStatement describes (which SHALL be the same as the FHIR
  *   version of the CapabilityStatement itself). There is no default value.
  * @param patchFormat
  *   - A list of the patch formats supported by this implementation using their content types.
  * @param experimental
  *   - A Boolean value to indicate that this capability statement is authored for testing purposes (or
  *   education/evaluation/marketing) and is not intended to be used for genuine usage.
  * @param jurisdiction
  *   - A legal or geographic region in which the capability statement is intended to be used.
  * @param instantiates
  *   - Reference to a canonical URL of another CapabilityStatement that this software implements. This capability statement is a
  *   published API description that corresponds to a business service. The server may actually implement a subset of the
  *   capability statement it claims to implement, so the capability statement must specify the full capability details.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that
  *   modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *   Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *   strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *   extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *   processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any
  *   elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param implementationGuide
  *   - A list of implementation guides that the server does (or should) support in their entirety.
  * @param software
  *   - Software that is covered by this capability statement. It is used when the capability statement describes the
  *   capabilities of a particular software version, independent of an installation.
  * @param document
  *   - A document definition.
  * @param implementation
  *   - Identifies a specific implementation instance that is described by the capability statement - i.e. a particular
  *   installation, rather than the capabilities of a software program.
  * @param rest
  *   - A definition of the restful capabilities of the solution, if any.
  * @param messaging
  *   - A description of the messaging capabilities of the solution.
  */
@POJOBoilerplate
class CapabilityStatement(
    override val id: Option[String] = None,
    val url: Option[UriStr] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val name: Option[String] = None,
    val date: FHIRDateTime,
    val kind: CAPABILITY_STATEMENT_KIND,
    val title: Option[String] = None,
    val status: PUBLICATION_STATUS,
    val format: NonEmptyLitSeq[Code],
    val version: Option[String] = None,
    val contact: LitSeq[ContactDetail] = LitSeq.empty,
    val purpose: Option[Markdown] = None,
    val imports: LitSeq[Canonical] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val publisher: Option[String] = None,
    val copyright: Option[Markdown] = None,
    val useContext: LitSeq[UsageContext] = LitSeq.empty,
    val description: Option[Markdown] = None,
    val fhirVersion: FHIR_VERSION,
    val patchFormat: LitSeq[Code] = LitSeq.empty,
    val experimental: Option[Boolean] = None,
    val jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
    val instantiates: LitSeq[Canonical] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val implementationGuide: LitSeq[Canonical] = LitSeq.empty,
    val software: Option[CapabilityStatement.Software] = None,
    val document: LitSeq[CapabilityStatement.Document] = LitSeq.empty,
    val implementation: Option[CapabilityStatement.Implementation] = None,
    val rest: LitSeq[CapabilityStatement.Rest] = LitSeq.empty,
    val messaging: LitSeq[CapabilityStatement.Messaging] = LitSeq.empty,
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
  override val thisTypeName: String = "CapabilityStatement"
}
