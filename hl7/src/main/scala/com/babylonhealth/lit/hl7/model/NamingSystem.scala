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
import com.babylonhealth.lit.hl7.{ NAMINGSYSTEM_TYPE, PUBLICATION_STATUS, NAMINGSYSTEM_IDENTIFIER_TYPE }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object NamingSystem extends CompanionFor[NamingSystem] {
  implicit def summonObjectAndCompanionNamingSystem_1050726068(
      o: NamingSystem): ObjectAndCompanion[NamingSystem, NamingSystem.type] = ObjectAndCompanion(o, this)
  override type ResourceType = NamingSystem
  override type ParentType   = NamingSystem
  override val baseType: CompanionFor[ResourceType] = NamingSystem
  override val parentType: CompanionFor[ParentType] = NamingSystem
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/NamingSystem")
  object UniqueId extends CompanionFor[UniqueId] {
    implicit def summonObjectAndCompanionUniqueId738630126(o: UniqueId): ObjectAndCompanion[UniqueId, UniqueId.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = UniqueId
    override type ParentType   = UniqueId
    override val parentType: CompanionFor[ResourceType] = UniqueId
    def apply(
        id: Option[String] = None,
        `type`: NAMINGSYSTEM_IDENTIFIER_TYPE,
        value: String,
        period: Option[Period] = None,
        comment: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        preferred: Option[Boolean] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): UniqueId = new UniqueId(
      id,
      `type`,
      value,
      period,
      comment,
      extension,
      preferred,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: UniqueId): Option[(Option[String], NAMINGSYSTEM_IDENTIFIER_TYPE, String, Option[Period], Option[String], LitSeq[Extension], Option[Boolean], LitSeq[Extension])] =
      Some((o.id, o.`type`, o.value, o.period, o.comment, o.extension, o.preferred, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[NAMINGSYSTEM_IDENTIFIER_TYPE] =
      FHIRComponentFieldMeta("type", lTagOf[NAMINGSYSTEM_IDENTIFIER_TYPE], false, lTagOf[NAMINGSYSTEM_IDENTIFIER_TYPE])
    val value: FHIRComponentFieldMeta[String] =
      FHIRComponentFieldMeta("value", lTagOf[String], false, lTagOf[String])
    val period: FHIRComponentFieldMeta[Option[Period]] =
      FHIRComponentFieldMeta("period", lTagOf[Option[Period]], false, lTagOf[Period])
    val comment: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("comment", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val preferred: FHIRComponentFieldMeta[Option[Boolean]] =
      FHIRComponentFieldMeta("preferred", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, `type`, value, period, comment, extension, preferred, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: UniqueId): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[NAMINGSYSTEM_IDENTIFIER_TYPE](`type`, t.`type`),
      FHIRComponentField[String](value, t.value),
      FHIRComponentField[Option[Period]](period, t.period),
      FHIRComponentField[Option[String]](comment, t.comment),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Boolean]](preferred, t.preferred),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[UniqueId] = this
    val thisName: String                 = "UniqueId"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[UniqueId] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new UniqueId(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[NAMINGSYSTEM_IDENTIFIER_TYPE]("type", None),
            cursor.decodeAs[String]("value", None),
            cursor.decodeAs[Option[Period]]("period", Some(None)),
            cursor.decodeAs[Option[String]]("comment", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Boolean]]("preferred", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class UniqueId(
      override val id: Option[String] = None,
      val `type`: NAMINGSYSTEM_IDENTIFIER_TYPE,
      val value: String,
      val period: Option[Period] = None,
      val comment: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val preferred: Option[Boolean] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      name: String,
      kind: NAMINGSYSTEM_TYPE,
      date: FHIRDateTime,
      `type`: Option[CodeableConcept] = None,
      usage: Option[String] = None,
      status: PUBLICATION_STATUS,
      contact: LitSeq[ContactDetail] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      publisher: Option[String] = None,
      useContext: LitSeq[UsageContext] = LitSeq.empty,
      responsible: Option[String] = None,
      description: Option[Markdown] = None,
      jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      uniqueId: NonEmptyLitSeq[NamingSystem.UniqueId],
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): NamingSystem = new NamingSystem(
    id,
    meta,
    text,
    name,
    kind,
    date,
    `type`,
    usage,
    status,
    contact,
    language,
    contained,
    extension,
    publisher,
    useContext,
    responsible,
    description,
    jurisdiction,
    implicitRules,
    modifierExtension,
    uniqueId,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val name: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("name", lTagOf[String], false, lTagOf[String])
  val kind: FHIRComponentFieldMeta[NAMINGSYSTEM_TYPE] =
    FHIRComponentFieldMeta("kind", lTagOf[NAMINGSYSTEM_TYPE], false, lTagOf[NAMINGSYSTEM_TYPE])
  val date: FHIRComponentFieldMeta[FHIRDateTime] =
    FHIRComponentFieldMeta("date", lTagOf[FHIRDateTime], false, lTagOf[FHIRDateTime])
  val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val usage: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("usage", lTagOf[Option[String]], false, lTagOf[String])
  val status: FHIRComponentFieldMeta[PUBLICATION_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[PUBLICATION_STATUS], false, lTagOf[PUBLICATION_STATUS])
  val contact: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("contact", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val publisher: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("publisher", lTagOf[Option[String]], false, lTagOf[String])
  val useContext: FHIRComponentFieldMeta[LitSeq[UsageContext]] =
    FHIRComponentFieldMeta("useContext", lTagOf[LitSeq[UsageContext]], false, lTagOf[UsageContext])
  val responsible: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("responsible", lTagOf[Option[String]], false, lTagOf[String])
  val description: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("description", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val jurisdiction: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("jurisdiction", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val uniqueId: FHIRComponentFieldMeta[NonEmptyLitSeq[NamingSystem.UniqueId]] =
    FHIRComponentFieldMeta("uniqueId", lTagOf[NonEmptyLitSeq[NamingSystem.UniqueId]], false, lTagOf[NamingSystem.UniqueId])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    name,
    kind,
    date,
    `type`,
    usage,
    status,
    contact,
    language,
    contained,
    extension,
    publisher,
    useContext,
    responsible,
    description,
    jurisdiction,
    implicitRules,
    modifierExtension,
    uniqueId
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: NamingSystem): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[String](name, t.name),
    FHIRComponentField[NAMINGSYSTEM_TYPE](kind, t.kind),
    FHIRComponentField[FHIRDateTime](date, t.date),
    FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
    FHIRComponentField[Option[String]](usage, t.usage),
    FHIRComponentField[PUBLICATION_STATUS](status, t.status),
    FHIRComponentField[LitSeq[ContactDetail]](contact, t.contact),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[String]](publisher, t.publisher),
    FHIRComponentField[LitSeq[UsageContext]](useContext, t.useContext),
    FHIRComponentField[Option[String]](responsible, t.responsible),
    FHIRComponentField[Option[Markdown]](description, t.description),
    FHIRComponentField[LitSeq[CodeableConcept]](jurisdiction, t.jurisdiction),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[NonEmptyLitSeq[NamingSystem.UniqueId]](uniqueId, t.uniqueId)
  )
  def extractId(t: NamingSystem): Option[String]                              = t.id
  def extractMeta(t: NamingSystem): Option[Meta]                              = t.meta
  def extractText(t: NamingSystem): Option[Narrative]                         = t.text
  def extractName(t: NamingSystem): String                                    = t.name
  def extractKind(t: NamingSystem): NAMINGSYSTEM_TYPE                         = t.kind
  def extractDate(t: NamingSystem): FHIRDateTime                              = t.date
  def extractType(t: NamingSystem): Option[CodeableConcept]                   = t.`type`
  def extractUsage(t: NamingSystem): Option[String]                           = t.usage
  def extractStatus(t: NamingSystem): PUBLICATION_STATUS                      = t.status
  def extractContact(t: NamingSystem): LitSeq[ContactDetail]                  = t.contact
  def extractLanguage(t: NamingSystem): Option[LANGUAGES]                     = t.language
  def extractContained(t: NamingSystem): LitSeq[Resource]                     = t.contained
  def extractExtension(t: NamingSystem): LitSeq[Extension]                    = t.extension
  def extractPublisher(t: NamingSystem): Option[String]                       = t.publisher
  def extractUseContext(t: NamingSystem): LitSeq[UsageContext]                = t.useContext
  def extractResponsible(t: NamingSystem): Option[String]                     = t.responsible
  def extractDescription(t: NamingSystem): Option[Markdown]                   = t.description
  def extractJurisdiction(t: NamingSystem): LitSeq[CodeableConcept]           = t.jurisdiction
  def extractImplicitRules(t: NamingSystem): Option[UriStr]                   = t.implicitRules
  def extractModifierExtension(t: NamingSystem): LitSeq[Extension]            = t.modifierExtension
  def extractUniqueId(t: NamingSystem): NonEmptyLitSeq[NamingSystem.UniqueId] = t.uniqueId
  override val thisName: String                                               = "NamingSystem"
  override val searchParams: Map[String, NamingSystem => Seq[Any]] = Map(
    "jurisdiction"          -> (obj => obj.jurisdiction.toSeq),
    "id-type"               -> (obj => obj.uniqueId.map(_.`type`).toSeq),
    "name"                  -> (obj => Seq(obj.name)),
    "context-type-quantity" -> (obj => obj.useContext.toSeq),
    "description"           -> (obj => obj.description.toSeq),
    "contact"               -> (obj => obj.contact.flatMap(_.name).toSeq),
    "context-type-value"    -> (obj => obj.useContext.toSeq),
    "date"                  -> (obj => Seq(obj.date)),
    "telecom"               -> (obj => obj.contact.flatMap(_.telecom).toSeq),
    "value"                 -> (obj => obj.uniqueId.map(_.value).toSeq),
    "context"               -> (obj => obj.useContext.map(_.value).flatMap(_.as[CodeableConcept]).toSeq),
    "responsible"           -> (obj => obj.responsible.toSeq),
    "status"                -> (obj => Seq(obj.status)),
    "publisher"             -> (obj => obj.publisher.toSeq),
    "kind"                  -> (obj => Seq(obj.kind)),
    "context-quantity" -> (obj =>
      obj.useContext.map(_.value).flatMap(_.as[Quantity]).toSeq ++
        obj.useContext.map(_.value).flatMap(_.as[Range]).toSeq),
    "type"         -> (obj => obj.`type`.toSeq),
    "context-type" -> (obj => obj.useContext.map(_.code).toSeq),
    "period"       -> (obj => obj.uniqueId.flatMap(_.period).toSeq)
  )
  def unapply(
      o: NamingSystem): Option[(Option[String], Option[Meta], Option[Narrative], String, NAMINGSYSTEM_TYPE, FHIRDateTime, Option[CodeableConcept], Option[String], PUBLICATION_STATUS, LitSeq[ContactDetail], Option[LANGUAGES], LitSeq[Resource], LitSeq[Extension], Option[String], LitSeq[UsageContext], Option[String], Option[Markdown], LitSeq[CodeableConcept], Option[UriStr], LitSeq[Extension], NonEmptyLitSeq[NamingSystem.UniqueId])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.name,
        o.kind,
        o.date,
        o.`type`,
        o.usage,
        o.status,
        o.contact,
        o.language,
        o.contained,
        o.extension,
        o.publisher,
        o.useContext,
        o.responsible,
        o.description,
        o.jurisdiction,
        o.implicitRules,
        o.modifierExtension,
        o.uniqueId))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[NamingSystem] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new NamingSystem(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[String]("name", None),
          cursor.decodeAs[NAMINGSYSTEM_TYPE]("kind", None),
          cursor.decodeAs[FHIRDateTime]("date", None),
          cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
          cursor.decodeAs[Option[String]]("usage", Some(None)),
          cursor.decodeAs[PUBLICATION_STATUS]("status", None),
          cursor.decodeAs[LitSeq[ContactDetail]]("contact", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("publisher", Some(None)),
          cursor.decodeAs[LitSeq[UsageContext]]("useContext", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("responsible", Some(None)),
          cursor.decodeAs[Option[Markdown]]("description", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("jurisdiction", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[NonEmptyLitSeq[NamingSystem.UniqueId]]("uniqueId", None),
          decodeAttributes(cursor)
        )
      ))
}

/** A curated namespace that issues unique symbols within that namespace for the identification of concepts, people, devices, etc.
  * Represents a "System" used within the Identifier and Coding data types.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields name, kind, date, `type`, usage, status, contact, publisher, useContext, responsible, description,
  *   jurisdiction, uniqueId.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *     not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *     resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail
  *     to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should
  *     be represented in the narrative to ensure clinical safety.
  * @param name
  *   - A natural language name identifying the naming system. This name should be usable as an identifier for the module by
  *     machine processing applications such as code generation.
  * @param kind
  *   - Indicates the purpose for the naming system - what kinds of things does it make unique?
  * @param date
  *   - The date (and optionally time) when the naming system was published. The date must change when the business version
  *     changes and it must change if the status code changes. In addition, it should change when the substantive content of the
  *     naming system changes.
  * @param `type`
  *   - Categorizes a naming system for easier search by grouping related naming systems.
  * @param usage
  *   - Provides guidance on the use of the namespace, including the handling of formatting characters, use of upper vs. lower
  *     case, etc.
  * @param status
  *   - The status of this naming system. Enables tracking the life-cycle of the content.
  * @param contact
  *   - Contact details to assist a user in finding and communicating with the publisher.
  * @param language
  *   - The base language in which the resource is written.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *     identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *     of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *     Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *     of the extension.
  * @param publisher
  *   - The name of the organization or individual that published the naming system.
  * @param useContext
  *   - The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be
  *     general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be
  *     used to assist with indexing and searching for appropriate naming system instances.
  * @param responsible
  *   - The name of the organization that is responsible for issuing identifiers or codes for this namespace and ensuring their
  *     non-collision.
  * @param description
  *   - A free text natural language description of the naming system from a consumer's perspective. Details about what the
  *     namespace identifies including scope, granularity, version labeling, etc.
  * @param jurisdiction
  *   - A legal or geographic region in which the naming system is intended to be used.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *     processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *     other profiles etc.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *     the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *     Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *     strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *     extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *     processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of
  *     any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param uniqueId
  *   - Indicates how the system may be identified when referenced in electronic exchange.
  */
@POJOBoilerplate
class NamingSystem(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val name: String,
    val kind: NAMINGSYSTEM_TYPE,
    val date: FHIRDateTime,
    val `type`: Option[CodeableConcept] = None,
    val usage: Option[String] = None,
    val status: PUBLICATION_STATUS,
    val contact: LitSeq[ContactDetail] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val publisher: Option[String] = None,
    val useContext: LitSeq[UsageContext] = LitSeq.empty,
    val responsible: Option[String] = None,
    val description: Option[Markdown] = None,
    val jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val uniqueId: NonEmptyLitSeq[NamingSystem.UniqueId],
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
      primitiveAttributes = primitiveAttributes
    ) {
  override val thisTypeName: String = "NamingSystem"
}
