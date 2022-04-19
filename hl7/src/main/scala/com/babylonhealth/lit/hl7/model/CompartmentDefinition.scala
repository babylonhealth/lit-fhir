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
import com.babylonhealth.lit.hl7.{ RESOURCE_TYPES, PUBLICATION_STATUS, COMPARTMENT_TYPE }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object CompartmentDefinition extends CompanionFor[CompartmentDefinition] {
  implicit def summonObjectAndCompanionCompartmentDefinition_1125546384(
      o: CompartmentDefinition): ObjectAndCompanion[CompartmentDefinition, CompartmentDefinition.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = CompartmentDefinition
  override type ParentType   = CompartmentDefinition
  override val baseType: CompanionFor[ResourceType] = CompartmentDefinition
  override val parentType: CompanionFor[ParentType] = CompartmentDefinition
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/CompartmentDefinition")
  object Resource extends CompanionFor[Resource] {
    implicit def summonObjectAndCompanionResource_1719355830(o: Resource): ObjectAndCompanion[Resource, Resource.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Resource
    override type ParentType   = Resource
    override val parentType: CompanionFor[ResourceType] = Resource
    def apply(
        id: Option[String] = None,
        code: RESOURCE_TYPES,
        param: LitSeq[String] = LitSeq.empty,
        extension: LitSeq[Extension] = LitSeq.empty,
        documentation: Option[String] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Resource = new Resource(
      id,
      code,
      param,
      extension,
      documentation,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Resource): Option[(Option[String], RESOURCE_TYPES, LitSeq[String], LitSeq[Extension], Option[String], LitSeq[Extension])] =
      Some((o.id, o.code, o.param, o.extension, o.documentation, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val code: FHIRComponentFieldMeta[RESOURCE_TYPES] =
      FHIRComponentFieldMeta("code", lTagOf[RESOURCE_TYPES], false, lTagOf[RESOURCE_TYPES])
    val param: FHIRComponentFieldMeta[LitSeq[String]] =
      FHIRComponentFieldMeta("param", lTagOf[LitSeq[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val documentation: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("documentation", lTagOf[Option[String]], false, lTagOf[String])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, code, param, extension, documentation, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Resource): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[RESOURCE_TYPES](code, t.code),
      FHIRComponentField[LitSeq[String]](param, t.param),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[String]](documentation, t.documentation),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Resource] = this
    val thisName: String                 = "Resource"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Resource] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Resource(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[RESOURCE_TYPES]("code", None),
            cursor.decodeAs[LitSeq[String]]("param", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("documentation", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Resource(
      override val id: Option[String] = None,
      val code: RESOURCE_TYPES,
      val param: LitSeq[String] = LitSeq.empty,
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
      code: COMPARTMENT_TYPE,
      status: PUBLICATION_STATUS,
      search: Boolean,
      version: Option[String] = None,
      contact: LitSeq[ContactDetail] = LitSeq.empty,
      purpose: Option[Markdown] = None,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[core.model.Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      publisher: Option[String] = None,
      useContext: LitSeq[UsageContext] = LitSeq.empty,
      description: Option[Markdown] = None,
      experimental: Option[Boolean] = None,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      resource: LitSeq[CompartmentDefinition.Resource] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): CompartmentDefinition = new CompartmentDefinition(
    id,
    url,
    meta,
    text,
    name,
    date,
    code,
    status,
    search,
    version,
    contact,
    purpose,
    language,
    contained,
    extension,
    publisher,
    useContext,
    description,
    experimental,
    implicitRules,
    modifierExtension,
    resource,
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
  val code: FHIRComponentFieldMeta[COMPARTMENT_TYPE] =
    FHIRComponentFieldMeta("code", lTagOf[COMPARTMENT_TYPE], false, lTagOf[COMPARTMENT_TYPE])
  val status: FHIRComponentFieldMeta[PUBLICATION_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[PUBLICATION_STATUS], false, lTagOf[PUBLICATION_STATUS])
  val search: FHIRComponentFieldMeta[Boolean] =
    FHIRComponentFieldMeta("search", lTagOf[Boolean], false, lTagOf[Boolean])
  val version: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("version", lTagOf[Option[String]], false, lTagOf[String])
  val contact: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("contact", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val purpose: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("purpose", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[core.model.Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[core.model.Resource]], false, lTagOf[core.model.Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val publisher: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("publisher", lTagOf[Option[String]], false, lTagOf[String])
  val useContext: FHIRComponentFieldMeta[LitSeq[UsageContext]] =
    FHIRComponentFieldMeta("useContext", lTagOf[LitSeq[UsageContext]], false, lTagOf[UsageContext])
  val description: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("description", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val experimental: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("experimental", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val resource: FHIRComponentFieldMeta[LitSeq[CompartmentDefinition.Resource]] =
    FHIRComponentFieldMeta(
      "resource",
      lTagOf[LitSeq[CompartmentDefinition.Resource]],
      false,
      lTagOf[CompartmentDefinition.Resource])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    url,
    meta,
    text,
    name,
    date,
    code,
    status,
    search,
    version,
    contact,
    purpose,
    language,
    contained,
    extension,
    publisher,
    useContext,
    description,
    experimental,
    implicitRules,
    modifierExtension,
    resource
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: CompartmentDefinition): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[UriStr](url, t.url),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[String](name, t.name),
    FHIRComponentField[Option[FHIRDateTime]](date, t.date),
    FHIRComponentField[COMPARTMENT_TYPE](code, t.code),
    FHIRComponentField[PUBLICATION_STATUS](status, t.status),
    FHIRComponentField[Boolean](search, t.search),
    FHIRComponentField[Option[String]](version, t.version),
    FHIRComponentField[LitSeq[ContactDetail]](contact, t.contact),
    FHIRComponentField[Option[Markdown]](purpose, t.purpose),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[core.model.Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[String]](publisher, t.publisher),
    FHIRComponentField[LitSeq[UsageContext]](useContext, t.useContext),
    FHIRComponentField[Option[Markdown]](description, t.description),
    FHIRComponentField[Option[Boolean]](experimental, t.experimental),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[CompartmentDefinition.Resource]](resource, t.resource)
  )
  def extractId(t: CompartmentDefinition): Option[String]                               = t.id
  def extractUrl(t: CompartmentDefinition): UriStr                                      = t.url
  def extractMeta(t: CompartmentDefinition): Option[Meta]                               = t.meta
  def extractText(t: CompartmentDefinition): Option[Narrative]                          = t.text
  def extractName(t: CompartmentDefinition): String                                     = t.name
  def extractDate(t: CompartmentDefinition): Option[FHIRDateTime]                       = t.date
  def extractCode(t: CompartmentDefinition): COMPARTMENT_TYPE                           = t.code
  def extractStatus(t: CompartmentDefinition): PUBLICATION_STATUS                       = t.status
  def extractSearch(t: CompartmentDefinition): Boolean                                  = t.search
  def extractVersion(t: CompartmentDefinition): Option[String]                          = t.version
  def extractContact(t: CompartmentDefinition): LitSeq[ContactDetail]                   = t.contact
  def extractPurpose(t: CompartmentDefinition): Option[Markdown]                        = t.purpose
  def extractLanguage(t: CompartmentDefinition): Option[LANGUAGES]                      = t.language
  def extractContained(t: CompartmentDefinition): LitSeq[core.model.Resource]           = t.contained
  def extractExtension(t: CompartmentDefinition): LitSeq[Extension]                     = t.extension
  def extractPublisher(t: CompartmentDefinition): Option[String]                        = t.publisher
  def extractUseContext(t: CompartmentDefinition): LitSeq[UsageContext]                 = t.useContext
  def extractDescription(t: CompartmentDefinition): Option[Markdown]                    = t.description
  def extractExperimental(t: CompartmentDefinition): Option[Boolean]                    = t.experimental
  def extractImplicitRules(t: CompartmentDefinition): Option[UriStr]                    = t.implicitRules
  def extractModifierExtension(t: CompartmentDefinition): LitSeq[Extension]             = t.modifierExtension
  def extractResource(t: CompartmentDefinition): LitSeq[CompartmentDefinition.Resource] = t.resource
  override val thisName: String                                                         = "CompartmentDefinition"
  override val searchParams: Map[String, CompartmentDefinition => Seq[Any]] = Map(
    "name"                  -> (obj => Seq(obj.name)),
    "context-type-quantity" -> (obj => obj.useContext.toSeq),
    "url"                   -> (obj => Seq(obj.url)),
    "description"           -> (obj => obj.description.toSeq),
    "context"               -> (obj => obj.useContext.map(_.value).flatMap(_.as[CodeableConcept]).toSeq),
    "code"                  -> (obj => Seq(obj.code)),
    "context-quantity" -> (obj =>
      obj.useContext.map(_.value).flatMap(_.as[Quantity]).toSeq ++
        obj.useContext.map(_.value).flatMap(_.as[Range]).toSeq),
    "context-type"       -> (obj => obj.useContext.map(_.code).toSeq),
    "context-type-value" -> (obj => obj.useContext.toSeq),
    "version"            -> (obj => obj.version.toSeq),
    "date"               -> (obj => obj.date.toSeq),
    "resource"           -> (obj => obj.resource.map(_.code).toSeq),
    "status"             -> (obj => Seq(obj.status)),
    "publisher"          -> (obj => obj.publisher.toSeq)
  )
  def unapply(
      o: CompartmentDefinition): Option[(Option[String], UriStr, Option[Meta], Option[Narrative], String, Option[FHIRDateTime], COMPARTMENT_TYPE, PUBLICATION_STATUS, Boolean, Option[String], LitSeq[ContactDetail], Option[Markdown], Option[LANGUAGES], LitSeq[core.model.Resource], LitSeq[Extension], Option[String], LitSeq[UsageContext], Option[Markdown], Option[Boolean], Option[UriStr], LitSeq[Extension], LitSeq[CompartmentDefinition.Resource])] =
    Some(
      (
        o.id,
        o.url,
        o.meta,
        o.text,
        o.name,
        o.date,
        o.code,
        o.status,
        o.search,
        o.version,
        o.contact,
        o.purpose,
        o.language,
        o.contained,
        o.extension,
        o.publisher,
        o.useContext,
        o.description,
        o.experimental,
        o.implicitRules,
        o.modifierExtension,
        o.resource))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[CompartmentDefinition] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new CompartmentDefinition(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[UriStr]("url", None),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[String]("name", None),
          cursor.decodeAs[Option[FHIRDateTime]]("date", Some(None)),
          cursor.decodeAs[COMPARTMENT_TYPE]("code", None),
          cursor.decodeAs[PUBLICATION_STATUS]("status", None),
          cursor.decodeAs[Boolean]("search", None),
          cursor.decodeAs[Option[String]]("version", Some(None)),
          cursor.decodeAs[LitSeq[ContactDetail]]("contact", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Markdown]]("purpose", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[core.model.Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("publisher", Some(None)),
          cursor.decodeAs[LitSeq[UsageContext]]("useContext", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Markdown]]("description", Some(None)),
          cursor.decodeAs[Option[Boolean]]("experimental", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CompartmentDefinition.Resource]]("resource", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** A compartment definition that defines how resources are accessed on a server.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields url, name, date, code, status, search, version, contact, purpose, publisher, useContext, description,
  *   experimental, resource.
  * @param id
  *   \- The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param url
  *   \- An absolute URI that is used to identify this compartment definition when it is referenced in a specification, model,
  *   design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address
  *   at which at which an authoritative instance of this compartment definition is (or will be) published. This URL can be the
  *   target of a canonical reference. It SHALL remain the same when the compartment definition is stored on different servers.
  * @param meta
  *   \- The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *   not always be associated with version changes to the resource.
  * @param text
  *   \- A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *   resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to
  *   make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be
  *   represented in the narrative to ensure clinical safety.
  * @param name
  *   \- A natural language name identifying the compartment definition. This name should be usable as an identifier for the
  *   module by machine processing applications such as code generation.
  * @param date
  *   \- The date (and optionally time) when the compartment definition was published. The date must change when the business
  *   version changes and it must change if the status code changes. In addition, it should change when the substantive content of
  *   the compartment definition changes.
  * @param code
  *   \- Which compartment this definition describes.
  * @param status
  *   \- The status of this compartment definition. Enables tracking the life-cycle of the content.
  * @param search
  *   \- Whether the search syntax is supported,.
  * @param version
  *   \- The identifier that is used to identify this version of the compartment definition when it is referenced in a
  *   specification, model, design or instance. This is an arbitrary value managed by the compartment definition author and is not
  *   expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available.
  *   There is also no expectation that versions can be placed in a lexicographical sequence.
  * @param contact
  *   \- Contact details to assist a user in finding and communicating with the publisher.
  * @param purpose
  *   \- Explanation of why this compartment definition is needed and why it has been designed as it has.
  * @param language
  *   \- The base language in which the resource is written.
  * @param contained
  *   \- These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   \- May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param publisher
  *   \- The name of the organization or individual that published the compartment definition.
  * @param useContext
  *   \- The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be
  *   general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be
  *   used to assist with indexing and searching for appropriate compartment definition instances.
  * @param description
  *   \- A free text natural language description of the compartment definition from a consumer's perspective.
  * @param experimental
  *   \- A Boolean value to indicate that this compartment definition is authored for testing purposes (or
  *   education/evaluation/marketing) and is not intended to be used for genuine usage.
  * @param implicitRules
  *   \- A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param modifierExtension
  *   \- May be used to represent additional information that is not part of the basic definition of the resource and that
  *   modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *   Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *   strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *   extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *   processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any
  *   elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param resource
  *   \- Information about how a resource is related to the compartment.
  */
@POJOBoilerplate
class CompartmentDefinition(
    override val id: Option[String] = None,
    val url: UriStr,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val name: String,
    val date: Option[FHIRDateTime] = None,
    val code: COMPARTMENT_TYPE,
    val status: PUBLICATION_STATUS,
    val search: Boolean,
    val version: Option[String] = None,
    val contact: LitSeq[ContactDetail] = LitSeq.empty,
    val purpose: Option[Markdown] = None,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val publisher: Option[String] = None,
    val useContext: LitSeq[UsageContext] = LitSeq.empty,
    val description: Option[Markdown] = None,
    val experimental: Option[Boolean] = None,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val resource: LitSeq[CompartmentDefinition.Resource] = LitSeq.empty,
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
  override val thisTypeName: String = "CompartmentDefinition"
}
