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
  RESOURCE_TYPES,
  PUBLICATION_STATUS,
  SEARCH_MODIFIER_CODE,
  SEARCH_COMPARATOR,
  SEARCH_PARAM_TYPE,
  SEARCH_XPATH_USAGE
}
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object SearchParameter extends CompanionFor[SearchParameter] {
  override type ResourceType = SearchParameter
  override type ParentType   = SearchParameter
  override val baseType: CompanionFor[ResourceType] = SearchParameter
  override val parentType: CompanionFor[ParentType] = SearchParameter
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/SearchParameter")
  object Component extends CompanionFor[Component] {
    override type ResourceType = Component
    override type ParentType   = Component
    override val parentType: CompanionFor[ResourceType] = Component
    def apply(
        id: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        definition: Canonical,
        expression: String,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Component = new Component(
      id,
      extension,
      definition,
      expression,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(o: Component): Option[(Option[String], LitSeq[Extension], Canonical, String, LitSeq[Extension])] = Some(
      (o.id, o.extension, o.definition, o.expression, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val definition: FHIRComponentFieldMeta[Canonical] =
      FHIRComponentFieldMeta("definition", lTagOf[Canonical], false, lTagOf[Canonical])
    val expression: FHIRComponentFieldMeta[String] =
      FHIRComponentFieldMeta("expression", lTagOf[String], false, lTagOf[String])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, extension, definition, expression, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Component): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Canonical](definition, t.definition),
      FHIRComponentField[String](expression, t.expression),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Component] = this
    val thisName: String                  = "Component"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Component] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Component(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Canonical]("definition", None),
            cursor.decodeAs[String]("expression", None),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Component(
      override val id: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val definition: Canonical,
      val expression: String,
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
      code: Code,
      base: NonEmptyLitSeq[RESOURCE_TYPES],
      `type`: SEARCH_PARAM_TYPE,
      xpath: Option[String] = None,
      chain: LitSeq[String] = LitSeq.empty,
      status: PUBLICATION_STATUS,
      target: LitSeq[RESOURCE_TYPES] = LitSeq.empty,
      version: Option[String] = None,
      contact: LitSeq[ContactDetail] = LitSeq.empty,
      purpose: Option[Markdown] = None,
      language: Option[LANGUAGES] = None,
      modifier: LitSeq[SEARCH_MODIFIER_CODE] = LitSeq.empty,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      publisher: Option[String] = None,
      useContext: LitSeq[UsageContext] = LitSeq.empty,
      expression: Option[String] = None,
      xpathUsage: Option[SEARCH_XPATH_USAGE] = None,
      multipleOr: Option[Boolean] = None,
      comparator: LitSeq[SEARCH_COMPARATOR] = LitSeq.empty,
      derivedFrom: Option[Canonical] = None,
      description: Markdown,
      multipleAnd: Option[Boolean] = None,
      experimental: Option[Boolean] = None,
      jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      component: LitSeq[SearchParameter.Component] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): SearchParameter = new SearchParameter(
    id,
    url,
    meta,
    text,
    name,
    date,
    code,
    base,
    `type`,
    xpath,
    chain,
    status,
    target,
    version,
    contact,
    purpose,
    language,
    modifier,
    contained,
    extension,
    publisher,
    useContext,
    expression,
    xpathUsage,
    multipleOr,
    comparator,
    derivedFrom,
    description,
    multipleAnd,
    experimental,
    jurisdiction,
    implicitRules,
    modifierExtension,
    component,
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
  val code: FHIRComponentFieldMeta[Code] =
    FHIRComponentFieldMeta("code", lTagOf[Code], false, lTagOf[Code])
  val base: FHIRComponentFieldMeta[NonEmptyLitSeq[RESOURCE_TYPES]] =
    FHIRComponentFieldMeta("base", lTagOf[NonEmptyLitSeq[RESOURCE_TYPES]], false, lTagOf[RESOURCE_TYPES])
  val `type`: FHIRComponentFieldMeta[SEARCH_PARAM_TYPE] =
    FHIRComponentFieldMeta("type", lTagOf[SEARCH_PARAM_TYPE], false, lTagOf[SEARCH_PARAM_TYPE])
  val xpath: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("xpath", lTagOf[Option[String]], false, lTagOf[String])
  val chain: FHIRComponentFieldMeta[LitSeq[String]] =
    FHIRComponentFieldMeta("chain", lTagOf[LitSeq[String]], false, lTagOf[String])
  val status: FHIRComponentFieldMeta[PUBLICATION_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[PUBLICATION_STATUS], false, lTagOf[PUBLICATION_STATUS])
  val target: FHIRComponentFieldMeta[LitSeq[RESOURCE_TYPES]] =
    FHIRComponentFieldMeta("target", lTagOf[LitSeq[RESOURCE_TYPES]], false, lTagOf[RESOURCE_TYPES])
  val version: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("version", lTagOf[Option[String]], false, lTagOf[String])
  val contact: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("contact", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val purpose: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("purpose", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val modifier: FHIRComponentFieldMeta[LitSeq[SEARCH_MODIFIER_CODE]] =
    FHIRComponentFieldMeta("modifier", lTagOf[LitSeq[SEARCH_MODIFIER_CODE]], false, lTagOf[SEARCH_MODIFIER_CODE])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val publisher: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("publisher", lTagOf[Option[String]], false, lTagOf[String])
  val useContext: FHIRComponentFieldMeta[LitSeq[UsageContext]] =
    FHIRComponentFieldMeta("useContext", lTagOf[LitSeq[UsageContext]], false, lTagOf[UsageContext])
  val expression: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("expression", lTagOf[Option[String]], false, lTagOf[String])
  val xpathUsage: FHIRComponentFieldMeta[Option[SEARCH_XPATH_USAGE]] =
    FHIRComponentFieldMeta("xpathUsage", lTagOf[Option[SEARCH_XPATH_USAGE]], false, lTagOf[SEARCH_XPATH_USAGE])
  val multipleOr: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("multipleOr", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val comparator: FHIRComponentFieldMeta[LitSeq[SEARCH_COMPARATOR]] =
    FHIRComponentFieldMeta("comparator", lTagOf[LitSeq[SEARCH_COMPARATOR]], false, lTagOf[SEARCH_COMPARATOR])
  val derivedFrom: FHIRComponentFieldMeta[Option[Canonical]] =
    FHIRComponentFieldMeta("derivedFrom", lTagOf[Option[Canonical]], false, lTagOf[Canonical])
  val description: FHIRComponentFieldMeta[Markdown] =
    FHIRComponentFieldMeta("description", lTagOf[Markdown], false, lTagOf[Markdown])
  val multipleAnd: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("multipleAnd", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val experimental: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("experimental", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val jurisdiction: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("jurisdiction", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val component: FHIRComponentFieldMeta[LitSeq[SearchParameter.Component]] =
    FHIRComponentFieldMeta(
      "component",
      lTagOf[LitSeq[SearchParameter.Component]],
      false,
      lTagOf[SearchParameter.Component])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    url,
    meta,
    text,
    name,
    date,
    code,
    base,
    `type`,
    xpath,
    chain,
    status,
    target,
    version,
    contact,
    purpose,
    language,
    modifier,
    contained,
    extension,
    publisher,
    useContext,
    expression,
    xpathUsage,
    multipleOr,
    comparator,
    derivedFrom,
    description,
    multipleAnd,
    experimental,
    jurisdiction,
    implicitRules,
    modifierExtension,
    component
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: SearchParameter): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[UriStr](url, t.url),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[String](name, t.name),
    FHIRComponentField[Option[FHIRDateTime]](date, t.date),
    FHIRComponentField[Code](code, t.code),
    FHIRComponentField[NonEmptyLitSeq[RESOURCE_TYPES]](base, t.base),
    FHIRComponentField[SEARCH_PARAM_TYPE](`type`, t.`type`),
    FHIRComponentField[Option[String]](xpath, t.xpath),
    FHIRComponentField[LitSeq[String]](chain, t.chain),
    FHIRComponentField[PUBLICATION_STATUS](status, t.status),
    FHIRComponentField[LitSeq[RESOURCE_TYPES]](target, t.target),
    FHIRComponentField[Option[String]](version, t.version),
    FHIRComponentField[LitSeq[ContactDetail]](contact, t.contact),
    FHIRComponentField[Option[Markdown]](purpose, t.purpose),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[SEARCH_MODIFIER_CODE]](modifier, t.modifier),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[String]](publisher, t.publisher),
    FHIRComponentField[LitSeq[UsageContext]](useContext, t.useContext),
    FHIRComponentField[Option[String]](expression, t.expression),
    FHIRComponentField[Option[SEARCH_XPATH_USAGE]](xpathUsage, t.xpathUsage),
    FHIRComponentField[Option[Boolean]](multipleOr, t.multipleOr),
    FHIRComponentField[LitSeq[SEARCH_COMPARATOR]](comparator, t.comparator),
    FHIRComponentField[Option[Canonical]](derivedFrom, t.derivedFrom),
    FHIRComponentField[Markdown](description, t.description),
    FHIRComponentField[Option[Boolean]](multipleAnd, t.multipleAnd),
    FHIRComponentField[Option[Boolean]](experimental, t.experimental),
    FHIRComponentField[LitSeq[CodeableConcept]](jurisdiction, t.jurisdiction),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[SearchParameter.Component]](component, t.component)
  )
  def extractId(t: SearchParameter): Option[String]                           = t.id
  def extractUrl(t: SearchParameter): UriStr                                  = t.url
  def extractMeta(t: SearchParameter): Option[Meta]                           = t.meta
  def extractText(t: SearchParameter): Option[Narrative]                      = t.text
  def extractName(t: SearchParameter): String                                 = t.name
  def extractDate(t: SearchParameter): Option[FHIRDateTime]                   = t.date
  def extractCode(t: SearchParameter): Code                                   = t.code
  def extractBase(t: SearchParameter): NonEmptyLitSeq[RESOURCE_TYPES]         = t.base
  def extractType(t: SearchParameter): SEARCH_PARAM_TYPE                      = t.`type`
  def extractXpath(t: SearchParameter): Option[String]                        = t.xpath
  def extractChain(t: SearchParameter): LitSeq[String]                        = t.chain
  def extractStatus(t: SearchParameter): PUBLICATION_STATUS                   = t.status
  def extractTarget(t: SearchParameter): LitSeq[RESOURCE_TYPES]               = t.target
  def extractVersion(t: SearchParameter): Option[String]                      = t.version
  def extractContact(t: SearchParameter): LitSeq[ContactDetail]               = t.contact
  def extractPurpose(t: SearchParameter): Option[Markdown]                    = t.purpose
  def extractLanguage(t: SearchParameter): Option[LANGUAGES]                  = t.language
  def extractModifier(t: SearchParameter): LitSeq[SEARCH_MODIFIER_CODE]       = t.modifier
  def extractContained(t: SearchParameter): LitSeq[Resource]                  = t.contained
  def extractExtension(t: SearchParameter): LitSeq[Extension]                 = t.extension
  def extractPublisher(t: SearchParameter): Option[String]                    = t.publisher
  def extractUseContext(t: SearchParameter): LitSeq[UsageContext]             = t.useContext
  def extractExpression(t: SearchParameter): Option[String]                   = t.expression
  def extractXpathUsage(t: SearchParameter): Option[SEARCH_XPATH_USAGE]       = t.xpathUsage
  def extractMultipleOr(t: SearchParameter): Option[Boolean]                  = t.multipleOr
  def extractComparator(t: SearchParameter): LitSeq[SEARCH_COMPARATOR]        = t.comparator
  def extractDerivedFrom(t: SearchParameter): Option[Canonical]               = t.derivedFrom
  def extractDescription(t: SearchParameter): Markdown                        = t.description
  def extractMultipleAnd(t: SearchParameter): Option[Boolean]                 = t.multipleAnd
  def extractExperimental(t: SearchParameter): Option[Boolean]                = t.experimental
  def extractJurisdiction(t: SearchParameter): LitSeq[CodeableConcept]        = t.jurisdiction
  def extractImplicitRules(t: SearchParameter): Option[UriStr]                = t.implicitRules
  def extractModifierExtension(t: SearchParameter): LitSeq[Extension]         = t.modifierExtension
  def extractComponent(t: SearchParameter): LitSeq[SearchParameter.Component] = t.component
  override val thisName: String                                               = "SearchParameter"
  override val searchParams: Map[String, SearchParameter => Seq[Any]] = Map(
    "jurisdiction"          -> (obj => obj.jurisdiction.toSeq),
    "name"                  -> (obj => Seq(obj.name)),
    "context-type-quantity" -> (obj => obj.useContext.toSeq),
    "url"                   -> (obj => Seq(obj.url)),
    "description"           -> (obj => Seq(obj.description)),
    "context"               -> (obj => obj.useContext.map(_.value).flatMap(_.as[CodeableConcept]).toSeq),
    "date"                  -> (obj => obj.date.toSeq),
    "target"                -> (obj => obj.target.toSeq),
    "component"             -> (obj => obj.component.map(_.definition).toSeq),
    "base"                  -> (obj => obj.base.toSeq),
    "code"                  -> (obj => Seq(obj.code)),
    "context-type-value"    -> (obj => obj.useContext.toSeq),
    "version"               -> (obj => obj.version.toSeq),
    "status"                -> (obj => Seq(obj.status)),
    "publisher"             -> (obj => obj.publisher.toSeq),
    "context-quantity" -> (obj =>
      obj.useContext.map(_.value).flatMap(_.as[Quantity]).toSeq ++
        obj.useContext.map(_.value).flatMap(_.as[Range]).toSeq),
    "type"         -> (obj => Seq(obj.`type`)),
    "context-type" -> (obj => obj.useContext.map(_.code).toSeq),
    "derived-from" -> (obj => obj.derivedFrom.toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[SearchParameter] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new SearchParameter(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[UriStr]("url", None),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[String]("name", None),
          cursor.decodeAs[Option[FHIRDateTime]]("date", Some(None)),
          cursor.decodeAs[Code]("code", None),
          cursor.decodeAs[NonEmptyLitSeq[RESOURCE_TYPES]]("base", None),
          cursor.decodeAs[SEARCH_PARAM_TYPE]("type", None),
          cursor.decodeAs[Option[String]]("xpath", Some(None)),
          cursor.decodeAs[LitSeq[String]]("chain", Some(LitSeq.empty)),
          cursor.decodeAs[PUBLICATION_STATUS]("status", None),
          cursor.decodeAs[LitSeq[RESOURCE_TYPES]]("target", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("version", Some(None)),
          cursor.decodeAs[LitSeq[ContactDetail]]("contact", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Markdown]]("purpose", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[SEARCH_MODIFIER_CODE]]("modifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("publisher", Some(None)),
          cursor.decodeAs[LitSeq[UsageContext]]("useContext", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("expression", Some(None)),
          cursor.decodeAs[Option[SEARCH_XPATH_USAGE]]("xpathUsage", Some(None)),
          cursor.decodeAs[Option[Boolean]]("multipleOr", Some(None)),
          cursor.decodeAs[LitSeq[SEARCH_COMPARATOR]]("comparator", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Canonical]]("derivedFrom", Some(None)),
          cursor.decodeAs[Markdown]("description", None),
          cursor.decodeAs[Option[Boolean]]("multipleAnd", Some(None)),
          cursor.decodeAs[Option[Boolean]]("experimental", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("jurisdiction", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[SearchParameter.Component]]("component", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** A search parameter that defines a named search item that can be used to search/filter on a resource.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields url, name, date, code, base, `type`, xpath, chain, status, target, version, contact, purpose, modifier, publisher, useContext, expression, xpathUsage, multipleOr, comparator, derivedFrom, description, multipleAnd, experimental, jurisdiction, component.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param url - An absolute URI that is used to identify this search parameter when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative instance of this search parameter is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the search parameter is stored on different servers.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param name - A natural language name identifying the search parameter. This name should be usable as an identifier for the module by machine processing applications such as code generation.
  * @param date - The date  (and optionally time) when the search parameter was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the search parameter changes.
  * @param code - The code used in the URL or the parameter name in a parameters resource for this search parameter.
  * @param base - The base resource type(s) that this search parameter can be used against.
  * @param `type` - The type of value that a search parameter may contain, and how the content is interpreted.
  * @param xpath - An XPath expression that returns a set of elements for the search parameter.
  * @param chain - Contains the names of any search parameters which may be chained to the containing search parameter. Chained parameters may be added to search parameters of type reference and specify that resources will only be returned if they contain a reference to a resource which matches the chained parameter value. Values for this field should be drawn from SearchParameter.code for a parameter on the target resource type.
  * @param status - The status of this search parameter. Enables tracking the life-cycle of the content.
  * @param target - Types of resource (if a resource is referenced).
  * @param version - The identifier that is used to identify this version of the search parameter when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the search parameter author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.
  * @param contact - Contact details to assist a user in finding and communicating with the publisher.
  * @param purpose - Explanation of why this search parameter is needed and why it has been designed as it has.
  * @param language - The base language in which the resource is written.
  * @param modifier - A modifier supported for the search parameter.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param publisher - The name of the organization or individual that published the search parameter.
  * @param useContext - The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate search parameter instances.
  * @param expression - A FHIRPath expression that returns a set of elements for the search parameter.
  * @param xpathUsage - How the search parameter relates to the set of elements returned by evaluating the xpath query.
  * @param multipleOr - Whether multiple values are allowed for each time the parameter exists. Values are separated by commas, and the parameter matches if any of the values match.
  * @param comparator - Comparators supported for the search parameter.
  * @param derivedFrom - Where this search parameter is originally defined. If a derivedFrom is provided, then the details in the search parameter must be consistent with the definition from which it is defined. i.e. the parameter should have the same meaning, and (usually) the functionality should be a proper subset of the underlying search parameter.
  * @param description - And how it used.
  * @param multipleAnd - Whether multiple parameters are allowed - e.g. more than one parameter with the same name. The search matches if all the parameters match.
  * @param experimental - A Boolean value to indicate that this search parameter is authored for testing purposes (or education/evaluation/marketing) and is not intended to be used for genuine usage.
  * @param jurisdiction - A legal or geographic region in which the search parameter is intended to be used.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param component - Used to define the parts of a composite search parameter.
  */
@POJOBoilerplate
class SearchParameter(
    override val id: Option[String] = None,
    val url: UriStr,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val name: String,
    val date: Option[FHIRDateTime] = None,
    val code: Code,
    val base: NonEmptyLitSeq[RESOURCE_TYPES],
    val `type`: SEARCH_PARAM_TYPE,
    val xpath: Option[String] = None,
    val chain: LitSeq[String] = LitSeq.empty,
    val status: PUBLICATION_STATUS,
    val target: LitSeq[RESOURCE_TYPES] = LitSeq.empty,
    val version: Option[String] = None,
    val contact: LitSeq[ContactDetail] = LitSeq.empty,
    val purpose: Option[Markdown] = None,
    override val language: Option[LANGUAGES] = None,
    val modifier: LitSeq[SEARCH_MODIFIER_CODE] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val publisher: Option[String] = None,
    val useContext: LitSeq[UsageContext] = LitSeq.empty,
    val expression: Option[String] = None,
    val xpathUsage: Option[SEARCH_XPATH_USAGE] = None,
    val multipleOr: Option[Boolean] = None,
    val comparator: LitSeq[SEARCH_COMPARATOR] = LitSeq.empty,
    val derivedFrom: Option[Canonical] = None,
    val description: Markdown,
    val multipleAnd: Option[Boolean] = None,
    val experimental: Option[Boolean] = None,
    val jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val component: LitSeq[SearchParameter.Component] = LitSeq.empty,
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
  override val thisTypeName: String = "SearchParameter"
}
