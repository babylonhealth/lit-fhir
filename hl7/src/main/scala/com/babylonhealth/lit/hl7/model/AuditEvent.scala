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
import com.babylonhealth.lit.hl7.{ AUDIT_EVENT_ACTION, AUDIT_EVENT_OUTCOME, NETWORK_TYPE }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object AuditEvent extends CompanionFor[AuditEvent] {
  override val baseType: CompanionFor[AuditEvent] = AuditEvent
  override val profileUrl: Option[String]         = Some("http://hl7.org/fhir/StructureDefinition/AuditEvent")
  object Entity extends CompanionFor[Entity] {
    object Detail extends CompanionFor[Detail] {
      type ValueChoice = Choice[Union00483057553]
      def apply(
          id: Option[String] = None,
          `type`: String,
          value: Detail.ValueChoice,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Detail = new Detail(
        id,
        `type`,
        value,
        extension,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Detail): Option[(Option[String], String, Detail.ValueChoice, LitSeq[Extension], LitSeq[Extension])] = Some(
        (o.id, o.`type`, o.value, o.extension, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val `type`: FHIRComponentFieldMeta[String] =
        FHIRComponentFieldMeta("type", lTagOf[String], false, lTagOf[String])
      val value: FHIRComponentFieldMeta[Detail.ValueChoice] =
        FHIRComponentFieldMeta("value", lTagOf[Detail.ValueChoice], true, lTagOf[Union00483057553])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, `type`, value, extension, modifierExtension)
      override def fields(t: Detail): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[String](`type`, t.`type`),
        FHIRComponentField[Detail.ValueChoice](value, t.value),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Detail] = this
      val thisName: String               = "Detail"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Detail] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Detail(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[String]("type", None),
              cursor.decodeRef[Union00483057553]("value"),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Detail(
        override val id: Option[String] = None,
        val `type`: String,
        val value: Detail.ValueChoice,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        what: Option[Reference] = None,
        `type`: Option[Coding] = None,
        role: Option[Coding] = None,
        name: Option[String] = None,
        query: Option[Base64Binary] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        lifecycle: Option[Coding] = None,
        description: Option[String] = None,
        securityLabel: LitSeq[Coding] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        detail: LitSeq[Entity.Detail] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Entity = new Entity(
      id,
      what,
      `type`,
      role,
      name,
      query,
      extension,
      lifecycle,
      description,
      securityLabel,
      modifierExtension,
      detail,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Entity): Option[(Option[String], Option[Reference], Option[Coding], Option[Coding], Option[String], Option[Base64Binary], LitSeq[Extension], Option[Coding], Option[String], LitSeq[Coding], LitSeq[Extension], LitSeq[Entity.Detail])] =
      Some(
        (
          o.id,
          o.what,
          o.`type`,
          o.role,
          o.name,
          o.query,
          o.extension,
          o.lifecycle,
          o.description,
          o.securityLabel,
          o.modifierExtension,
          o.detail))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val what: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("what", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val `type`: FHIRComponentFieldMeta[Option[Coding]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[Coding]], false, lTagOf[Coding])
    val role: FHIRComponentFieldMeta[Option[Coding]] =
      FHIRComponentFieldMeta("role", lTagOf[Option[Coding]], false, lTagOf[Coding])
    val name: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("name", lTagOf[Option[String]], false, lTagOf[String])
    val query: FHIRComponentFieldMeta[Option[Base64Binary]] =
      FHIRComponentFieldMeta("query", lTagOf[Option[Base64Binary]], false, lTagOf[Base64Binary])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val lifecycle: FHIRComponentFieldMeta[Option[Coding]] =
      FHIRComponentFieldMeta("lifecycle", lTagOf[Option[Coding]], false, lTagOf[Coding])
    val description: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
    val securityLabel: FHIRComponentFieldMeta[LitSeq[Coding]] =
      FHIRComponentFieldMeta("securityLabel", lTagOf[LitSeq[Coding]], false, lTagOf[Coding])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val detail: FHIRComponentFieldMeta[LitSeq[Entity.Detail]] =
      FHIRComponentFieldMeta("detail", lTagOf[LitSeq[Entity.Detail]], false, lTagOf[Entity.Detail])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
      id,
      what,
      `type`,
      role,
      name,
      query,
      extension,
      lifecycle,
      description,
      securityLabel,
      modifierExtension,
      detail)
    override def fields(t: Entity): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Reference]](what, t.what),
      FHIRComponentField[Option[Coding]](`type`, t.`type`),
      FHIRComponentField[Option[Coding]](role, t.role),
      FHIRComponentField[Option[String]](name, t.name),
      FHIRComponentField[Option[Base64Binary]](query, t.query),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Coding]](lifecycle, t.lifecycle),
      FHIRComponentField[Option[String]](description, t.description),
      FHIRComponentField[LitSeq[Coding]](securityLabel, t.securityLabel),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[Entity.Detail]](detail, t.detail)
    )
    val baseType: CompanionFor[Entity] = this
    val thisName: String               = "Entity"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Entity] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Entity(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[Reference]]("what", Some(None)),
            cursor.decodeAs[Option[Coding]]("type", Some(None)),
            cursor.decodeAs[Option[Coding]]("role", Some(None)),
            cursor.decodeAs[Option[String]]("name", Some(None)),
            cursor.decodeAs[Option[Base64Binary]]("query", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Coding]]("lifecycle", Some(None)),
            cursor.decodeAs[Option[String]]("description", Some(None)),
            cursor.decodeAs[LitSeq[Coding]]("securityLabel", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Entity.Detail]]("detail", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Entity(
      override val id: Option[String] = None,
      val what: Option[Reference] = None,
      val `type`: Option[Coding] = None,
      val role: Option[Coding] = None,
      val name: Option[String] = None,
      val query: Option[Base64Binary] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val lifecycle: Option[Coding] = None,
      val description: Option[String] = None,
      val securityLabel: LitSeq[Coding] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val detail: LitSeq[Entity.Detail] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Agent extends CompanionFor[Agent] {
    object Network extends CompanionFor[Network] {
      def apply(
          id: Option[String] = None,
          `type`: Option[NETWORK_TYPE] = None,
          address: Option[String] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Network = new Network(
        id,
        `type`,
        address,
        extension,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Network): Option[(Option[String], Option[NETWORK_TYPE], Option[String], LitSeq[Extension], LitSeq[Extension])] =
        Some((o.id, o.`type`, o.address, o.extension, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val `type`: FHIRComponentFieldMeta[Option[NETWORK_TYPE]] =
        FHIRComponentFieldMeta("type", lTagOf[Option[NETWORK_TYPE]], false, lTagOf[NETWORK_TYPE])
      val address: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("address", lTagOf[Option[String]], false, lTagOf[String])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, `type`, address, extension, modifierExtension)
      override def fields(t: Network): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[NETWORK_TYPE]](`type`, t.`type`),
        FHIRComponentField[Option[String]](address, t.address),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Network] = this
      val thisName: String                = "Network"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Network] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Network(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[NETWORK_TYPE]]("type", Some(None)),
              cursor.decodeAs[Option[String]]("address", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Network(
        override val id: Option[String] = None,
        val `type`: Option[NETWORK_TYPE] = None,
        val address: Option[String] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        who: Option[Reference] = None,
        `type`: Option[CodeableConcept] = None,
        role: LitSeq[CodeableConcept] = LitSeq.empty,
        name: Option[String] = None,
        altId: Option[String] = None,
        media: Option[Coding] = None,
        policy: LitSeq[UriStr] = LitSeq.empty,
        location: Option[Reference] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        requestor: Boolean,
        purposeOfUse: LitSeq[CodeableConcept] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        network: Option[Agent.Network] = None,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Agent = new Agent(
      id,
      who,
      `type`,
      role,
      name,
      altId,
      media,
      policy,
      location,
      extension,
      requestor,
      purposeOfUse,
      modifierExtension,
      network,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Agent): Option[(Option[String], Option[Reference], Option[CodeableConcept], LitSeq[CodeableConcept], Option[String], Option[String], Option[Coding], LitSeq[UriStr], Option[Reference], LitSeq[Extension], Boolean, LitSeq[CodeableConcept], LitSeq[Extension], Option[Agent.Network])] =
      Some(
        (
          o.id,
          o.who,
          o.`type`,
          o.role,
          o.name,
          o.altId,
          o.media,
          o.policy,
          o.location,
          o.extension,
          o.requestor,
          o.purposeOfUse,
          o.modifierExtension,
          o.network))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val who: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("who", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val role: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("role", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val name: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("name", lTagOf[Option[String]], false, lTagOf[String])
    val altId: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("altId", lTagOf[Option[String]], false, lTagOf[String])
    val media: FHIRComponentFieldMeta[Option[Coding]] =
      FHIRComponentFieldMeta("media", lTagOf[Option[Coding]], false, lTagOf[Coding])
    val policy: FHIRComponentFieldMeta[LitSeq[UriStr]] =
      FHIRComponentFieldMeta("policy", lTagOf[LitSeq[UriStr]], false, lTagOf[UriStr])
    val location: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("location", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val requestor: FHIRComponentFieldMeta[Boolean] =
      FHIRComponentFieldMeta("requestor", lTagOf[Boolean], false, lTagOf[Boolean])
    val purposeOfUse: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("purposeOfUse", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val network: FHIRComponentFieldMeta[Option[Agent.Network]] =
      FHIRComponentFieldMeta("network", lTagOf[Option[Agent.Network]], false, lTagOf[Agent.Network])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
      id,
      who,
      `type`,
      role,
      name,
      altId,
      media,
      policy,
      location,
      extension,
      requestor,
      purposeOfUse,
      modifierExtension,
      network)
    override def fields(t: Agent): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Reference]](who, t.who),
      FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[LitSeq[CodeableConcept]](role, t.role),
      FHIRComponentField[Option[String]](name, t.name),
      FHIRComponentField[Option[String]](altId, t.altId),
      FHIRComponentField[Option[Coding]](media, t.media),
      FHIRComponentField[LitSeq[UriStr]](policy, t.policy),
      FHIRComponentField[Option[Reference]](location, t.location),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Boolean](requestor, t.requestor),
      FHIRComponentField[LitSeq[CodeableConcept]](purposeOfUse, t.purposeOfUse),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[Agent.Network]](network, t.network)
    )
    val baseType: CompanionFor[Agent] = this
    val thisName: String              = "Agent"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Agent] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Agent(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[Reference]]("who", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("role", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("name", Some(None)),
            cursor.decodeAs[Option[String]]("altId", Some(None)),
            cursor.decodeAs[Option[Coding]]("media", Some(None)),
            cursor.decodeAs[LitSeq[UriStr]]("policy", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Reference]]("location", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Boolean]("requestor", None),
            cursor.decodeAs[LitSeq[CodeableConcept]]("purposeOfUse", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Agent.Network]]("network", Some(None)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Agent(
      override val id: Option[String] = None,
      val who: Option[Reference] = None,
      val `type`: Option[CodeableConcept] = None,
      val role: LitSeq[CodeableConcept] = LitSeq.empty,
      val name: Option[String] = None,
      val altId: Option[String] = None,
      val media: Option[Coding] = None,
      val policy: LitSeq[UriStr] = LitSeq.empty,
      val location: Option[Reference] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val requestor: Boolean,
      val purposeOfUse: LitSeq[CodeableConcept] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val network: Option[Agent.Network] = None,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Source extends CompanionFor[Source] {
    def apply(
        id: Option[String] = None,
        site: Option[String] = None,
        `type`: LitSeq[Coding] = LitSeq.empty,
        observer: Reference,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Source = new Source(
      id,
      site,
      `type`,
      observer,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Source): Option[(Option[String], Option[String], LitSeq[Coding], Reference, LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.site, o.`type`, o.observer, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val site: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("site", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[LitSeq[Coding]] =
      FHIRComponentFieldMeta("type", lTagOf[LitSeq[Coding]], false, lTagOf[Coding])
    val observer: FHIRComponentFieldMeta[Reference] =
      FHIRComponentFieldMeta("observer", lTagOf[Reference], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, site, `type`, observer, extension, modifierExtension)
    override def fields(t: Source): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[String]](site, t.site),
      FHIRComponentField[LitSeq[Coding]](`type`, t.`type`),
      FHIRComponentField[Reference](observer, t.observer),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Source] = this
    val thisName: String               = "Source"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Source] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Source(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[String]]("site", Some(None)),
            cursor.decodeAs[LitSeq[Coding]]("type", Some(LitSeq.empty)),
            cursor.decodeAs[Reference]("observer", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Source(
      override val id: Option[String] = None,
      val site: Option[String] = None,
      val `type`: LitSeq[Coding] = LitSeq.empty,
      val observer: Reference,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      `type`: Coding,
      action: Option[AUDIT_EVENT_ACTION] = None,
      period: Option[Period] = None,
      subtype: LitSeq[Coding] = LitSeq.empty,
      outcome: Option[AUDIT_EVENT_OUTCOME] = None,
      language: Option[LANGUAGES] = None,
      recorded: ZonedDateTime,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      outcomeDesc: Option[String] = None,
      implicitRules: Option[UriStr] = None,
      purposeOfEvent: LitSeq[CodeableConcept] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      source: AuditEvent.Source,
      agent: NonEmptyLitSeq[AuditEvent.Agent],
      entity: LitSeq[AuditEvent.Entity] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): AuditEvent = new AuditEvent(
    id,
    meta,
    text,
    `type`,
    action,
    period,
    subtype,
    outcome,
    language,
    recorded,
    contained,
    extension,
    outcomeDesc,
    implicitRules,
    purposeOfEvent,
    modifierExtension,
    source,
    agent,
    entity,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val `type`: FHIRComponentFieldMeta[Coding] =
    FHIRComponentFieldMeta("type", lTagOf[Coding], false, lTagOf[Coding])
  val action: FHIRComponentFieldMeta[Option[AUDIT_EVENT_ACTION]] =
    FHIRComponentFieldMeta("action", lTagOf[Option[AUDIT_EVENT_ACTION]], false, lTagOf[AUDIT_EVENT_ACTION])
  val period: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("period", lTagOf[Option[Period]], false, lTagOf[Period])
  val subtype: FHIRComponentFieldMeta[LitSeq[Coding]] =
    FHIRComponentFieldMeta("subtype", lTagOf[LitSeq[Coding]], false, lTagOf[Coding])
  val outcome: FHIRComponentFieldMeta[Option[AUDIT_EVENT_OUTCOME]] =
    FHIRComponentFieldMeta("outcome", lTagOf[Option[AUDIT_EVENT_OUTCOME]], false, lTagOf[AUDIT_EVENT_OUTCOME])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val recorded: FHIRComponentFieldMeta[ZonedDateTime] =
    FHIRComponentFieldMeta("recorded", lTagOf[ZonedDateTime], false, lTagOf[ZonedDateTime])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val outcomeDesc: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("outcomeDesc", lTagOf[Option[String]], false, lTagOf[String])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val purposeOfEvent: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("purposeOfEvent", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val source: FHIRComponentFieldMeta[AuditEvent.Source] =
    FHIRComponentFieldMeta("source", lTagOf[AuditEvent.Source], false, lTagOf[AuditEvent.Source])
  val agent: FHIRComponentFieldMeta[NonEmptyLitSeq[AuditEvent.Agent]] =
    FHIRComponentFieldMeta("agent", lTagOf[NonEmptyLitSeq[AuditEvent.Agent]], false, lTagOf[AuditEvent.Agent])
  val entity: FHIRComponentFieldMeta[LitSeq[AuditEvent.Entity]] =
    FHIRComponentFieldMeta("entity", lTagOf[LitSeq[AuditEvent.Entity]], false, lTagOf[AuditEvent.Entity])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    `type`,
    action,
    period,
    subtype,
    outcome,
    language,
    recorded,
    contained,
    extension,
    outcomeDesc,
    implicitRules,
    purposeOfEvent,
    modifierExtension,
    source,
    agent,
    entity
  )
  override def fields(t: AuditEvent): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Coding](`type`, t.`type`),
    FHIRComponentField[Option[AUDIT_EVENT_ACTION]](action, t.action),
    FHIRComponentField[Option[Period]](period, t.period),
    FHIRComponentField[LitSeq[Coding]](subtype, t.subtype),
    FHIRComponentField[Option[AUDIT_EVENT_OUTCOME]](outcome, t.outcome),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[ZonedDateTime](recorded, t.recorded),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[String]](outcomeDesc, t.outcomeDesc),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[CodeableConcept]](purposeOfEvent, t.purposeOfEvent),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[AuditEvent.Source](source, t.source),
    FHIRComponentField[NonEmptyLitSeq[AuditEvent.Agent]](agent, t.agent),
    FHIRComponentField[LitSeq[AuditEvent.Entity]](entity, t.entity)
  )
  def extractId(t: AuditEvent): Option[String]                      = t.id
  def extractMeta(t: AuditEvent): Option[Meta]                      = t.meta
  def extractText(t: AuditEvent): Option[Narrative]                 = t.text
  def extractType(t: AuditEvent): Coding                            = t.`type`
  def extractAction(t: AuditEvent): Option[AUDIT_EVENT_ACTION]      = t.action
  def extractPeriod(t: AuditEvent): Option[Period]                  = t.period
  def extractSubtype(t: AuditEvent): LitSeq[Coding]                 = t.subtype
  def extractOutcome(t: AuditEvent): Option[AUDIT_EVENT_OUTCOME]    = t.outcome
  def extractLanguage(t: AuditEvent): Option[LANGUAGES]             = t.language
  def extractRecorded(t: AuditEvent): ZonedDateTime                 = t.recorded
  def extractContained(t: AuditEvent): LitSeq[Resource]             = t.contained
  def extractExtension(t: AuditEvent): LitSeq[Extension]            = t.extension
  def extractOutcomeDesc(t: AuditEvent): Option[String]             = t.outcomeDesc
  def extractImplicitRules(t: AuditEvent): Option[UriStr]           = t.implicitRules
  def extractPurposeOfEvent(t: AuditEvent): LitSeq[CodeableConcept] = t.purposeOfEvent
  def extractModifierExtension(t: AuditEvent): LitSeq[Extension]    = t.modifierExtension
  def extractSource(t: AuditEvent): AuditEvent.Source               = t.source
  def extractAgent(t: AuditEvent): NonEmptyLitSeq[AuditEvent.Agent] = t.agent
  def extractEntity(t: AuditEvent): LitSeq[AuditEvent.Entity]       = t.entity
  override val thisName: String                                     = "AuditEvent"
  override val searchParams: Map[String, AuditEvent => Seq[Any]] = Map(
    "entity-role" -> (obj => obj.entity.flatMap(_.role).toSeq),
    "source"      -> (obj => Seq(obj.source.observer)),
    "subtype"     -> (obj => obj.subtype.toSeq),
    "site"        -> (obj => obj.source.site.toSeq),
    "outcome"     -> (obj => obj.outcome.toSeq),
    "agent"       -> (obj => obj.agent.flatMap(_.who).toSeq),
    "altid"       -> (obj => obj.agent.flatMap(_.altId).toSeq),
    "entity-type" -> (obj => obj.entity.flatMap(_.`type`).toSeq),
    "date"        -> (obj => Seq(obj.recorded)),
    "entity"      -> (obj => obj.entity.flatMap(_.what).toSeq),
    "agent-role"  -> (obj => obj.agent.flatMap(_.role).toSeq),
    "patient" -> (obj =>
      obj.agent.flatMap(_.who).filter(_.reference.exists(_.contains("Patient/"))).toSeq ++
        obj.entity.flatMap(_.what).filter(_.reference.exists(_.contains("Patient/"))).toSeq),
    "address"     -> (obj => obj.agent.flatMap(_.network).flatMap(_.address).toSeq),
    "agent-name"  -> (obj => obj.agent.flatMap(_.name).toSeq),
    "entity-name" -> (obj => obj.entity.flatMap(_.name).toSeq),
    "type"        -> (obj => Seq(obj.`type`)),
    "policy"      -> (obj => obj.agent.flatMap(_.policy).toSeq),
    "action"      -> (obj => obj.action.toSeq)
  )
  def unapply(
      o: AuditEvent): Option[(Option[String], Option[Meta], Option[Narrative], Coding, Option[AUDIT_EVENT_ACTION], Option[Period], LitSeq[Coding], Option[AUDIT_EVENT_OUTCOME], Option[LANGUAGES], ZonedDateTime, LitSeq[Resource], LitSeq[Extension], Option[String], Option[UriStr], LitSeq[CodeableConcept], LitSeq[Extension], AuditEvent.Source, NonEmptyLitSeq[AuditEvent.Agent], LitSeq[AuditEvent.Entity])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.`type`,
        o.action,
        o.period,
        o.subtype,
        o.outcome,
        o.language,
        o.recorded,
        o.contained,
        o.extension,
        o.outcomeDesc,
        o.implicitRules,
        o.purposeOfEvent,
        o.modifierExtension,
        o.source,
        o.agent,
        o.entity))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[AuditEvent] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new AuditEvent(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Coding]("type", None),
          cursor.decodeAs[Option[AUDIT_EVENT_ACTION]]("action", Some(None)),
          cursor.decodeAs[Option[Period]]("period", Some(None)),
          cursor.decodeAs[LitSeq[Coding]]("subtype", Some(LitSeq.empty)),
          cursor.decodeAs[Option[AUDIT_EVENT_OUTCOME]]("outcome", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[ZonedDateTime]("recorded", None),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("outcomeDesc", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("purposeOfEvent", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[AuditEvent.Source]("source", None),
          cursor.decodeAs[NonEmptyLitSeq[AuditEvent.Agent]]("agent", None),
          cursor.decodeAs[LitSeq[AuditEvent.Entity]]("entity", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields `type`, action, period, subtype, outcome, recorded, outcomeDesc, purposeOfEvent, source, agent, entity.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param `type` - Identifier for a family of the event.  For example, a menu item, program, rule, policy, function code, application name or URL. It identifies the performed function.
  * @param action - Indicator for type of action performed during the event that generated the audit.
  * @param period - The period during which the activity occurred.
  * @param subtype - Identifier for the category of event.
  * @param outcome - Indicates whether the event succeeded or failed.
  * @param language - The base language in which the resource is written.
  * @param recorded - The time when the event was recorded.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param outcomeDesc - A free text description of the outcome of the event.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param purposeOfEvent - The purposeOfUse (reason) that was used during the event being recorded.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param source - The system that is reporting the event.
  * @param agent - An actor taking an active role in the event or activity that is logged.
  * @param entity - Specific instances of data or objects that have been accessed.
  */
@POJOBoilerplate
class AuditEvent(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val `type`: Coding,
    val action: Option[AUDIT_EVENT_ACTION] = None,
    val period: Option[Period] = None,
    val subtype: LitSeq[Coding] = LitSeq.empty,
    val outcome: Option[AUDIT_EVENT_OUTCOME] = None,
    override val language: Option[LANGUAGES] = None,
    val recorded: ZonedDateTime,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val outcomeDesc: Option[String] = None,
    override val implicitRules: Option[UriStr] = None,
    val purposeOfEvent: LitSeq[CodeableConcept] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val source: AuditEvent.Source,
    val agent: NonEmptyLitSeq[AuditEvent.Agent],
    val entity: LitSeq[AuditEvent.Entity] = LitSeq.empty,
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
  override val thisTypeName: String = "AuditEvent"
}
