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
  COMPARTMENT_TYPE,
  GRAPH_COMPARTMENT_RULE,
  GRAPH_COMPARTMENT_USE
}
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object GraphDefinition extends CompanionFor[GraphDefinition] {
  override type ResourceType = GraphDefinition
  override type ParentType   = GraphDefinition
  override val baseType: CompanionFor[ResourceType] = GraphDefinition
  override val parentType: CompanionFor[ParentType] = GraphDefinition
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/GraphDefinition")
  object Link extends CompanionFor[Link] {
    override type ResourceType = Link
    override type ParentType   = Link
    override val parentType: CompanionFor[ResourceType] = Link
    object Target extends CompanionFor[Target] {
      override type ResourceType = Target
      override type ParentType   = Target
      override val parentType: CompanionFor[ResourceType] = Target
      object Compartment extends CompanionFor[Compartment] {
        override type ResourceType = Compartment
        override type ParentType   = Compartment
        override val parentType: CompanionFor[ResourceType] = Compartment
        def apply(
            id: Option[String] = None,
            use: GRAPH_COMPARTMENT_USE,
            code: COMPARTMENT_TYPE,
            rule: GRAPH_COMPARTMENT_RULE,
            extension: LitSeq[Extension] = LitSeq.empty,
            expression: Option[String] = None,
            description: Option[String] = None,
            modifierExtension: LitSeq[Extension] = LitSeq.empty,
            primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
        ): Compartment = new Compartment(
          id,
          use,
          code,
          rule,
          extension,
          expression,
          description,
          modifierExtension,
          primitiveAttributes = primitiveAttributes
        )
        def unapply(
            o: Compartment): Option[(Option[String], GRAPH_COMPARTMENT_USE, COMPARTMENT_TYPE, GRAPH_COMPARTMENT_RULE, LitSeq[Extension], Option[String], Option[String], LitSeq[Extension])] =
          Some((o.id, o.use, o.code, o.rule, o.extension, o.expression, o.description, o.modifierExtension))
        val id: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
        val use: FHIRComponentFieldMeta[GRAPH_COMPARTMENT_USE] =
          FHIRComponentFieldMeta("use", lTagOf[GRAPH_COMPARTMENT_USE], false, lTagOf[GRAPH_COMPARTMENT_USE])
        val code: FHIRComponentFieldMeta[COMPARTMENT_TYPE] =
          FHIRComponentFieldMeta("code", lTagOf[COMPARTMENT_TYPE], false, lTagOf[COMPARTMENT_TYPE])
        val rule: FHIRComponentFieldMeta[GRAPH_COMPARTMENT_RULE] =
          FHIRComponentFieldMeta("rule", lTagOf[GRAPH_COMPARTMENT_RULE], false, lTagOf[GRAPH_COMPARTMENT_RULE])
        val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val expression: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("expression", lTagOf[Option[String]], false, lTagOf[String])
        val description: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
        val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
          Seq(id, use, code, rule, extension, expression, description, modifierExtension)
        override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
        override def fields(t: Compartment): Seq[FHIRComponentField[_]] = Seq(
          FHIRComponentField[Option[String]](id, t.id),
          FHIRComponentField[GRAPH_COMPARTMENT_USE](use, t.use),
          FHIRComponentField[COMPARTMENT_TYPE](code, t.code),
          FHIRComponentField[GRAPH_COMPARTMENT_RULE](rule, t.rule),
          FHIRComponentField[LitSeq[Extension]](extension, t.extension),
          FHIRComponentField[Option[String]](expression, t.expression),
          FHIRComponentField[Option[String]](description, t.description),
          FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
        )
        val baseType: CompanionFor[Compartment] = this
        val thisName: String                    = "Compartment"
        def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Compartment] =
          checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
            Try(
              new Compartment(
                cursor.decodeAs[Option[String]]("id", Some(None)),
                cursor.decodeAs[GRAPH_COMPARTMENT_USE]("use", None),
                cursor.decodeAs[COMPARTMENT_TYPE]("code", None),
                cursor.decodeAs[GRAPH_COMPARTMENT_RULE]("rule", None),
                cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
                cursor.decodeAs[Option[String]]("expression", Some(None)),
                cursor.decodeAs[Option[String]]("description", Some(None)),
                cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
                decodeAttributes(cursor)
              )
            ))
      }
      @POJOBoilerplate
      class Compartment(
          override val id: Option[String] = None,
          val use: GRAPH_COMPARTMENT_USE,
          val code: COMPARTMENT_TYPE,
          val rule: GRAPH_COMPARTMENT_RULE,
          override val extension: LitSeq[Extension] = LitSeq.empty,
          val expression: Option[String] = None,
          val description: Option[String] = None,
          override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
          override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
            FHIRObject.emptyAtts)
          extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
      def apply(
          id: Option[String] = None,
          `type`: RESOURCE_TYPES,
          link: LitSeq[GraphDefinition.Link] = LitSeq.empty,
          params: Option[String] = None,
          profile: Option[Canonical] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          compartment: LitSeq[Target.Compartment] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Target = new Target(
        id,
        `type`,
        link,
        params,
        profile,
        extension,
        modifierExtension,
        compartment,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Target): Option[(Option[String], RESOURCE_TYPES, LitSeq[GraphDefinition.Link], Option[String], Option[Canonical], LitSeq[Extension], LitSeq[Extension], LitSeq[Target.Compartment])] =
        Some((o.id, o.`type`, o.link, o.params, o.profile, o.extension, o.modifierExtension, o.compartment))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val `type`: FHIRComponentFieldMeta[RESOURCE_TYPES] =
        FHIRComponentFieldMeta("type", lTagOf[RESOURCE_TYPES], false, lTagOf[RESOURCE_TYPES])
      val link: FHIRComponentFieldMeta[LitSeq[GraphDefinition.Link]] =
        FHIRComponentFieldMeta("link", lTagOf[LitSeq[GraphDefinition.Link]], false, lTagOf[GraphDefinition.Link])
      val params: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("params", lTagOf[Option[String]], false, lTagOf[String])
      val profile: FHIRComponentFieldMeta[Option[Canonical]] =
        FHIRComponentFieldMeta("profile", lTagOf[Option[Canonical]], false, lTagOf[Canonical])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val compartment: FHIRComponentFieldMeta[LitSeq[Target.Compartment]] =
        FHIRComponentFieldMeta("compartment", lTagOf[LitSeq[Target.Compartment]], false, lTagOf[Target.Compartment])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
        Seq(id, `type`, link, params, profile, extension, modifierExtension, compartment)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Target): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[RESOURCE_TYPES](`type`, t.`type`),
        FHIRComponentField[LitSeq[GraphDefinition.Link]](link, t.link),
        FHIRComponentField[Option[String]](params, t.params),
        FHIRComponentField[Option[Canonical]](profile, t.profile),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
        FHIRComponentField[LitSeq[Target.Compartment]](compartment, t.compartment)
      )
      val baseType: CompanionFor[Target] = this
      val thisName: String               = "Target"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Target] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Target(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[RESOURCE_TYPES]("type", None),
              cursor.decodeAs[LitSeq[GraphDefinition.Link]]("link", Some(LitSeq.empty)),
              cursor.decodeAs[Option[String]]("params", Some(None)),
              cursor.decodeAs[Option[Canonical]]("profile", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Target.Compartment]]("compartment", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Target(
        override val id: Option[String] = None,
        val `type`: RESOURCE_TYPES,
        val link: LitSeq[GraphDefinition.Link] = LitSeq.empty,
        val params: Option[String] = None,
        val profile: Option[Canonical] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        val compartment: LitSeq[Target.Compartment] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        min: Option[Int] = None,
        max: Option[String] = None,
        path: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        sliceName: Option[String] = None,
        description: Option[String] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        target: LitSeq[Link.Target] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Link = new Link(
      id,
      min,
      max,
      path,
      extension,
      sliceName,
      description,
      modifierExtension,
      target,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Link): Option[(Option[String], Option[Int], Option[String], Option[String], LitSeq[Extension], Option[String], Option[String], LitSeq[Extension], LitSeq[Link.Target])] =
      Some((o.id, o.min, o.max, o.path, o.extension, o.sliceName, o.description, o.modifierExtension, o.target))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val min: FHIRComponentFieldMeta[Option[Int]] =
      FHIRComponentFieldMeta("min", lTagOf[Option[Int]], false, lTagOf[Int])
    val max: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("max", lTagOf[Option[String]], false, lTagOf[String])
    val path: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("path", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val sliceName: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("sliceName", lTagOf[Option[String]], false, lTagOf[String])
    val description: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val target: FHIRComponentFieldMeta[LitSeq[Link.Target]] =
      FHIRComponentFieldMeta("target", lTagOf[LitSeq[Link.Target]], false, lTagOf[Link.Target])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, min, max, path, extension, sliceName, description, modifierExtension, target)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Link): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Int]](min, t.min),
      FHIRComponentField[Option[String]](max, t.max),
      FHIRComponentField[Option[String]](path, t.path),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[String]](sliceName, t.sliceName),
      FHIRComponentField[Option[String]](description, t.description),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[Link.Target]](target, t.target)
    )
    val baseType: CompanionFor[Link] = this
    val thisName: String             = "Link"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Link] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Link(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[Int]]("min", Some(None)),
            cursor.decodeAs[Option[String]]("max", Some(None)),
            cursor.decodeAs[Option[String]]("path", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("sliceName", Some(None)),
            cursor.decodeAs[Option[String]]("description", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Link.Target]]("target", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Link(
      override val id: Option[String] = None,
      val min: Option[Int] = None,
      val max: Option[String] = None,
      val path: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val sliceName: Option[String] = None,
      val description: Option[String] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val target: LitSeq[Link.Target] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      url: Option[UriStr] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      name: String,
      date: Option[FHIRDateTime] = None,
      start: RESOURCE_TYPES,
      status: PUBLICATION_STATUS,
      version: Option[String] = None,
      contact: LitSeq[ContactDetail] = LitSeq.empty,
      purpose: Option[Markdown] = None,
      profile: Option[Canonical] = None,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      publisher: Option[String] = None,
      useContext: LitSeq[UsageContext] = LitSeq.empty,
      description: Option[Markdown] = None,
      experimental: Option[Boolean] = None,
      jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      link: LitSeq[GraphDefinition.Link] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): GraphDefinition = new GraphDefinition(
    id,
    url,
    meta,
    text,
    name,
    date,
    start,
    status,
    version,
    contact,
    purpose,
    profile,
    language,
    contained,
    extension,
    publisher,
    useContext,
    description,
    experimental,
    jurisdiction,
    implicitRules,
    modifierExtension,
    link,
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
  val name: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("name", lTagOf[String], false, lTagOf[String])
  val date: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("date", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val start: FHIRComponentFieldMeta[RESOURCE_TYPES] =
    FHIRComponentFieldMeta("start", lTagOf[RESOURCE_TYPES], false, lTagOf[RESOURCE_TYPES])
  val status: FHIRComponentFieldMeta[PUBLICATION_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[PUBLICATION_STATUS], false, lTagOf[PUBLICATION_STATUS])
  val version: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("version", lTagOf[Option[String]], false, lTagOf[String])
  val contact: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("contact", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val purpose: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("purpose", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val profile: FHIRComponentFieldMeta[Option[Canonical]] =
    FHIRComponentFieldMeta("profile", lTagOf[Option[Canonical]], false, lTagOf[Canonical])
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
  val link: FHIRComponentFieldMeta[LitSeq[GraphDefinition.Link]] =
    FHIRComponentFieldMeta("link", lTagOf[LitSeq[GraphDefinition.Link]], false, lTagOf[GraphDefinition.Link])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    url,
    meta,
    text,
    name,
    date,
    start,
    status,
    version,
    contact,
    purpose,
    profile,
    language,
    contained,
    extension,
    publisher,
    useContext,
    description,
    experimental,
    jurisdiction,
    implicitRules,
    modifierExtension,
    link
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: GraphDefinition): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[UriStr]](url, t.url),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[String](name, t.name),
    FHIRComponentField[Option[FHIRDateTime]](date, t.date),
    FHIRComponentField[RESOURCE_TYPES](start, t.start),
    FHIRComponentField[PUBLICATION_STATUS](status, t.status),
    FHIRComponentField[Option[String]](version, t.version),
    FHIRComponentField[LitSeq[ContactDetail]](contact, t.contact),
    FHIRComponentField[Option[Markdown]](purpose, t.purpose),
    FHIRComponentField[Option[Canonical]](profile, t.profile),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[String]](publisher, t.publisher),
    FHIRComponentField[LitSeq[UsageContext]](useContext, t.useContext),
    FHIRComponentField[Option[Markdown]](description, t.description),
    FHIRComponentField[Option[Boolean]](experimental, t.experimental),
    FHIRComponentField[LitSeq[CodeableConcept]](jurisdiction, t.jurisdiction),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[GraphDefinition.Link]](link, t.link)
  )
  def extractId(t: GraphDefinition): Option[String]                    = t.id
  def extractUrl(t: GraphDefinition): Option[UriStr]                   = t.url
  def extractMeta(t: GraphDefinition): Option[Meta]                    = t.meta
  def extractText(t: GraphDefinition): Option[Narrative]               = t.text
  def extractName(t: GraphDefinition): String                          = t.name
  def extractDate(t: GraphDefinition): Option[FHIRDateTime]            = t.date
  def extractStart(t: GraphDefinition): RESOURCE_TYPES                 = t.start
  def extractStatus(t: GraphDefinition): PUBLICATION_STATUS            = t.status
  def extractVersion(t: GraphDefinition): Option[String]               = t.version
  def extractContact(t: GraphDefinition): LitSeq[ContactDetail]        = t.contact
  def extractPurpose(t: GraphDefinition): Option[Markdown]             = t.purpose
  def extractProfile(t: GraphDefinition): Option[Canonical]            = t.profile
  def extractLanguage(t: GraphDefinition): Option[LANGUAGES]           = t.language
  def extractContained(t: GraphDefinition): LitSeq[Resource]           = t.contained
  def extractExtension(t: GraphDefinition): LitSeq[Extension]          = t.extension
  def extractPublisher(t: GraphDefinition): Option[String]             = t.publisher
  def extractUseContext(t: GraphDefinition): LitSeq[UsageContext]      = t.useContext
  def extractDescription(t: GraphDefinition): Option[Markdown]         = t.description
  def extractExperimental(t: GraphDefinition): Option[Boolean]         = t.experimental
  def extractJurisdiction(t: GraphDefinition): LitSeq[CodeableConcept] = t.jurisdiction
  def extractImplicitRules(t: GraphDefinition): Option[UriStr]         = t.implicitRules
  def extractModifierExtension(t: GraphDefinition): LitSeq[Extension]  = t.modifierExtension
  def extractLink(t: GraphDefinition): LitSeq[GraphDefinition.Link]    = t.link
  override val thisName: String                                        = "GraphDefinition"
  override val searchParams: Map[String, GraphDefinition => Seq[Any]] = Map(
    "jurisdiction"          -> (obj => obj.jurisdiction.toSeq),
    "name"                  -> (obj => Seq(obj.name)),
    "context-type-quantity" -> (obj => obj.useContext.toSeq),
    "url"                   -> (obj => obj.url.toSeq),
    "description"           -> (obj => obj.description.toSeq),
    "context"               -> (obj => obj.useContext.map(_.value).flatMap(_.as[CodeableConcept]).toSeq),
    "date"                  -> (obj => obj.date.toSeq),
    "context-quantity" -> (obj =>
      obj.useContext.map(_.value).flatMap(_.as[Quantity]).toSeq ++
        obj.useContext.map(_.value).flatMap(_.as[Range]).toSeq),
    "start"              -> (obj => Seq(obj.start)),
    "context-type"       -> (obj => obj.useContext.map(_.code).toSeq),
    "context-type-value" -> (obj => obj.useContext.toSeq),
    "version"            -> (obj => obj.version.toSeq),
    "status"             -> (obj => Seq(obj.status)),
    "publisher"          -> (obj => obj.publisher.toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[GraphDefinition] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new GraphDefinition(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[UriStr]]("url", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[String]("name", None),
          cursor.decodeAs[Option[FHIRDateTime]]("date", Some(None)),
          cursor.decodeAs[RESOURCE_TYPES]("start", None),
          cursor.decodeAs[PUBLICATION_STATUS]("status", None),
          cursor.decodeAs[Option[String]]("version", Some(None)),
          cursor.decodeAs[LitSeq[ContactDetail]]("contact", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Markdown]]("purpose", Some(None)),
          cursor.decodeAs[Option[Canonical]]("profile", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("publisher", Some(None)),
          cursor.decodeAs[LitSeq[UsageContext]]("useContext", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Markdown]]("description", Some(None)),
          cursor.decodeAs[Option[Boolean]]("experimental", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("jurisdiction", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[GraphDefinition.Link]]("link", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** A formal computable definition of a graph of resources - that is, a coherent set of resources that form a graph by following references. The Graph Definition resource defines a set and makes rules about the set.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields url, name, date, start, status, version, contact, purpose, profile, publisher, useContext, description, experimental, jurisdiction, link.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param url - An absolute URI that is used to identify this graph definition when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative instance of this graph definition is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the graph definition is stored on different servers.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param name - A natural language name identifying the graph definition. This name should be usable as an identifier for the module by machine processing applications such as code generation.
  * @param date - The date  (and optionally time) when the graph definition was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the graph definition changes.
  * @param start - The type of FHIR resource at which instances of this graph start.
  * @param status - The status of this graph definition. Enables tracking the life-cycle of the content.
  * @param version - The identifier that is used to identify this version of the graph definition when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the graph definition author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.
  * @param contact - Contact details to assist a user in finding and communicating with the publisher.
  * @param purpose - Explanation of why this graph definition is needed and why it has been designed as it has.
  * @param profile - The profile that describes the use of the base resource.
  * @param language - The base language in which the resource is written.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param publisher - The name of the organization or individual that published the graph definition.
  * @param useContext - The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate graph definition instances.
  * @param description - A free text natural language description of the graph definition from a consumer's perspective.
  * @param experimental - A Boolean value to indicate that this graph definition is authored for testing purposes (or education/evaluation/marketing) and is not intended to be used for genuine usage.
  * @param jurisdiction - A legal or geographic region in which the graph definition is intended to be used.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param link - Links this graph makes rules about.
  */
@POJOBoilerplate
class GraphDefinition(
    override val id: Option[String] = None,
    val url: Option[UriStr] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val name: String,
    val date: Option[FHIRDateTime] = None,
    val start: RESOURCE_TYPES,
    val status: PUBLICATION_STATUS,
    val version: Option[String] = None,
    val contact: LitSeq[ContactDetail] = LitSeq.empty,
    val purpose: Option[Markdown] = None,
    val profile: Option[Canonical] = None,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val publisher: Option[String] = None,
    val useContext: LitSeq[UsageContext] = LitSeq.empty,
    val description: Option[Markdown] = None,
    val experimental: Option[Boolean] = None,
    val jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val link: LitSeq[GraphDefinition.Link] = LitSeq.empty,
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
  override val thisTypeName: String = "GraphDefinition"
}
