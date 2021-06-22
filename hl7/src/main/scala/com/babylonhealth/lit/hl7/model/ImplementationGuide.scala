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
  GUIDE_PARAMETER_CODE,
  GUIDE_PAGE_GENERATION,
  PUBLICATION_STATUS,
  SPDX_LICENSE
}
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object ImplementationGuide extends CompanionFor[ImplementationGuide] {
  implicit def summonObjectAndCompanionImplementationGuide_1287252645(
      o: ImplementationGuide): ObjectAndCompanion[ImplementationGuide, ImplementationGuide.type] = ObjectAndCompanion(o, this)
  override type ResourceType = ImplementationGuide
  override type ParentType   = ImplementationGuide
  override val baseType: CompanionFor[ResourceType] = ImplementationGuide
  override val parentType: CompanionFor[ParentType] = ImplementationGuide
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/ImplementationGuide")
  object Definition extends CompanionFor[Definition] {
    implicit def summonObjectAndCompanionDefinition_24755189(o: Definition): ObjectAndCompanion[Definition, Definition.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Definition
    override type ParentType   = Definition
    override val parentType: CompanionFor[ResourceType] = Definition
    object Page extends CompanionFor[Page] {
      implicit def summonObjectAndCompanionPage_1408835538(o: Page): ObjectAndCompanion[Page, Page.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Page
      override type ParentType   = Page
      override val parentType: CompanionFor[ResourceType] = Page
      type NameChoice = Choice[Union01831019594]
      def apply(
          id: Option[String] = None,
          page: LitSeq[ImplementationGuide.Definition.Page] = LitSeq.empty,
          title: String,
          name: Page.NameChoice,
          extension: LitSeq[Extension] = LitSeq.empty,
          generation: GUIDE_PAGE_GENERATION,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Page = new Page(
        id,
        page,
        title,
        name,
        extension,
        generation,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Page): Option[(Option[String], LitSeq[ImplementationGuide.Definition.Page], String, Page.NameChoice, LitSeq[Extension], GUIDE_PAGE_GENERATION, LitSeq[Extension])] =
        Some((o.id, o.page, o.title, o.name, o.extension, o.generation, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val page: FHIRComponentFieldMeta[LitSeq[ImplementationGuide.Definition.Page]] =
        FHIRComponentFieldMeta(
          "page",
          lTagOf[LitSeq[ImplementationGuide.Definition.Page]],
          false,
          lTagOf[ImplementationGuide.Definition.Page])
      val title: FHIRComponentFieldMeta[String] =
        FHIRComponentFieldMeta("title", lTagOf[String], false, lTagOf[String])
      val name: FHIRComponentFieldMeta[Page.NameChoice] =
        FHIRComponentFieldMeta("name", lTagOf[Page.NameChoice], true, lTagOf[Union01831019594])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val generation: FHIRComponentFieldMeta[GUIDE_PAGE_GENERATION] =
        FHIRComponentFieldMeta("generation", lTagOf[GUIDE_PAGE_GENERATION], false, lTagOf[GUIDE_PAGE_GENERATION])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, page, title, name, extension, generation, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Page): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[LitSeq[ImplementationGuide.Definition.Page]](page, t.page),
        FHIRComponentField[String](title, t.title),
        FHIRComponentField[Page.NameChoice](name, t.name),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[GUIDE_PAGE_GENERATION](generation, t.generation),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Page] = this
      val thisName: String             = "Page"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Page] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Page(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[LitSeq[ImplementationGuide.Definition.Page]]("page", Some(LitSeq.empty)),
              cursor.decodeAs[String]("title", None),
              cursor.decodeRef[Union01831019594]("name"),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[GUIDE_PAGE_GENERATION]("generation", None),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Page(
        override val id: Option[String] = None,
        val page: LitSeq[ImplementationGuide.Definition.Page] = LitSeq.empty,
        val title: String,
        val name: Page.NameChoice,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val generation: GUIDE_PAGE_GENERATION,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object Grouping extends CompanionFor[Grouping] {
      implicit def summonObjectAndCompanionGrouping_1891537565(o: Grouping): ObjectAndCompanion[Grouping, Grouping.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Grouping
      override type ParentType   = Grouping
      override val parentType: CompanionFor[ResourceType] = Grouping
      def apply(
          id: Option[String] = None,
          name: String,
          extension: LitSeq[Extension] = LitSeq.empty,
          description: Option[String] = None,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Grouping = new Grouping(
        id,
        name,
        extension,
        description,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(o: Grouping): Option[(Option[String], String, LitSeq[Extension], Option[String], LitSeq[Extension])] = Some(
        (o.id, o.name, o.extension, o.description, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val name: FHIRComponentFieldMeta[String] =
        FHIRComponentFieldMeta("name", lTagOf[String], false, lTagOf[String])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val description: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, name, extension, description, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Grouping): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[String](name, t.name),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[String]](description, t.description),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Grouping] = this
      val thisName: String                 = "Grouping"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Grouping] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Grouping(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[String]("name", None),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[String]]("description", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Grouping(
        override val id: Option[String] = None,
        val name: String,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val description: Option[String] = None,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object Resource extends CompanionFor[Resource] {
      implicit def summonObjectAndCompanionResource_1972596763(o: Resource): ObjectAndCompanion[Resource, Resource.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Resource
      override type ParentType   = Resource
      override val parentType: CompanionFor[ResourceType] = Resource
      type ExampleChoice = Choice[Union00683246261]
      def apply(
          id: Option[String] = None,
          name: Option[String] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          reference: Reference,
          example: Option[Resource.ExampleChoice] = None,
          groupingId: Option[Id] = None,
          fhirVersion: LitSeq[FHIR_VERSION] = LitSeq.empty,
          description: Option[String] = None,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Resource = new Resource(
        id,
        name,
        extension,
        reference,
        example,
        groupingId,
        fhirVersion,
        description,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Resource): Option[(Option[String], Option[String], LitSeq[Extension], Reference, Option[Resource.ExampleChoice], Option[Id], LitSeq[FHIR_VERSION], Option[String], LitSeq[Extension])] =
        Some((o.id, o.name, o.extension, o.reference, o.example, o.groupingId, o.fhirVersion, o.description, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val name: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("name", lTagOf[Option[String]], false, lTagOf[String])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val reference: FHIRComponentFieldMeta[Reference] =
        FHIRComponentFieldMeta("reference", lTagOf[Reference], false, lTagOf[Reference])
      val example: FHIRComponentFieldMeta[Option[Resource.ExampleChoice]] =
        FHIRComponentFieldMeta("example", lTagOf[Option[Resource.ExampleChoice]], true, lTagOf[Union00683246261])
      val groupingId: FHIRComponentFieldMeta[Option[Id]] =
        FHIRComponentFieldMeta("groupingId", lTagOf[Option[Id]], false, lTagOf[Id])
      val fhirVersion: FHIRComponentFieldMeta[LitSeq[FHIR_VERSION]] =
        FHIRComponentFieldMeta("fhirVersion", lTagOf[LitSeq[FHIR_VERSION]], false, lTagOf[FHIR_VERSION])
      val description: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
        Seq(id, name, extension, reference, example, groupingId, fhirVersion, description, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Resource): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[String]](name, t.name),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Reference](reference, t.reference),
        FHIRComponentField[Option[Resource.ExampleChoice]](example, t.example),
        FHIRComponentField[Option[Id]](groupingId, t.groupingId),
        FHIRComponentField[LitSeq[FHIR_VERSION]](fhirVersion, t.fhirVersion),
        FHIRComponentField[Option[String]](description, t.description),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Resource] = this
      val thisName: String                 = "Resource"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Resource] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Resource(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[String]]("name", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Reference]("reference", None),
              cursor.decodeOptRef[Union00683246261]("example"),
              cursor.decodeAs[Option[Id]]("groupingId", Some(None)),
              cursor.decodeAs[LitSeq[FHIR_VERSION]]("fhirVersion", Some(LitSeq.empty)),
              cursor.decodeAs[Option[String]]("description", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Resource(
        override val id: Option[String] = None,
        val name: Option[String] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val reference: Reference,
        val example: Option[Resource.ExampleChoice] = None,
        val groupingId: Option[Id] = None,
        val fhirVersion: LitSeq[FHIR_VERSION] = LitSeq.empty,
        val description: Option[String] = None,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object Template extends CompanionFor[Template] {
      implicit def summonObjectAndCompanionTemplate_797767143(o: Template): ObjectAndCompanion[Template, Template.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Template
      override type ParentType   = Template
      override val parentType: CompanionFor[ResourceType] = Template
      def apply(
          id: Option[String] = None,
          code: Code,
          scope: Option[String] = None,
          source: String,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Template = new Template(
        id,
        code,
        scope,
        source,
        extension,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(o: Template): Option[(Option[String], Code, Option[String], String, LitSeq[Extension], LitSeq[Extension])] =
        Some((o.id, o.code, o.scope, o.source, o.extension, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val code: FHIRComponentFieldMeta[Code] =
        FHIRComponentFieldMeta("code", lTagOf[Code], false, lTagOf[Code])
      val scope: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("scope", lTagOf[Option[String]], false, lTagOf[String])
      val source: FHIRComponentFieldMeta[String] =
        FHIRComponentFieldMeta("source", lTagOf[String], false, lTagOf[String])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, code, scope, source, extension, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Template): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Code](code, t.code),
        FHIRComponentField[Option[String]](scope, t.scope),
        FHIRComponentField[String](source, t.source),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Template] = this
      val thisName: String                 = "Template"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Template] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Template(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Code]("code", None),
              cursor.decodeAs[Option[String]]("scope", Some(None)),
              cursor.decodeAs[String]("source", None),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Template(
        override val id: Option[String] = None,
        val code: Code,
        val scope: Option[String] = None,
        val source: String,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object Parameter extends CompanionFor[Parameter] {
      implicit def summonObjectAndCompanionParameter2003777080(o: Parameter): ObjectAndCompanion[Parameter, Parameter.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Parameter
      override type ParentType   = Parameter
      override val parentType: CompanionFor[ResourceType] = Parameter
      def apply(
          id: Option[String] = None,
          code: GUIDE_PARAMETER_CODE,
          value: String,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Parameter = new Parameter(
        id,
        code,
        value,
        extension,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(o: Parameter): Option[(Option[String], GUIDE_PARAMETER_CODE, String, LitSeq[Extension], LitSeq[Extension])] =
        Some((o.id, o.code, o.value, o.extension, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val code: FHIRComponentFieldMeta[GUIDE_PARAMETER_CODE] =
        FHIRComponentFieldMeta("code", lTagOf[GUIDE_PARAMETER_CODE], false, lTagOf[GUIDE_PARAMETER_CODE])
      val value: FHIRComponentFieldMeta[String] =
        FHIRComponentFieldMeta("value", lTagOf[String], false, lTagOf[String])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, code, value, extension, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Parameter): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[GUIDE_PARAMETER_CODE](code, t.code),
        FHIRComponentField[String](value, t.value),
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
              cursor.decodeAs[GUIDE_PARAMETER_CODE]("code", None),
              cursor.decodeAs[String]("value", None),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Parameter(
        override val id: Option[String] = None,
        val code: GUIDE_PARAMETER_CODE,
        val value: String,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        page: Option[Definition.Page] = None,
        grouping: LitSeq[Definition.Grouping] = LitSeq.empty,
        resource: NonEmptyLitSeq[Definition.Resource],
        template: LitSeq[Definition.Template] = LitSeq.empty,
        parameter: LitSeq[Definition.Parameter] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Definition = new Definition(
      id,
      extension,
      modifierExtension,
      page,
      grouping,
      resource,
      template,
      parameter,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Definition): Option[(Option[String], LitSeq[Extension], LitSeq[Extension], Option[Definition.Page], LitSeq[Definition.Grouping], NonEmptyLitSeq[Definition.Resource], LitSeq[Definition.Template], LitSeq[Definition.Parameter])] =
      Some((o.id, o.extension, o.modifierExtension, o.page, o.grouping, o.resource, o.template, o.parameter))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val page: FHIRComponentFieldMeta[Option[Definition.Page]] =
      FHIRComponentFieldMeta("page", lTagOf[Option[Definition.Page]], false, lTagOf[Definition.Page])
    val grouping: FHIRComponentFieldMeta[LitSeq[Definition.Grouping]] =
      FHIRComponentFieldMeta("grouping", lTagOf[LitSeq[Definition.Grouping]], false, lTagOf[Definition.Grouping])
    val resource: FHIRComponentFieldMeta[NonEmptyLitSeq[Definition.Resource]] =
      FHIRComponentFieldMeta("resource", lTagOf[NonEmptyLitSeq[Definition.Resource]], false, lTagOf[Definition.Resource])
    val template: FHIRComponentFieldMeta[LitSeq[Definition.Template]] =
      FHIRComponentFieldMeta("template", lTagOf[LitSeq[Definition.Template]], false, lTagOf[Definition.Template])
    val parameter: FHIRComponentFieldMeta[LitSeq[Definition.Parameter]] =
      FHIRComponentFieldMeta("parameter", lTagOf[LitSeq[Definition.Parameter]], false, lTagOf[Definition.Parameter])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, extension, modifierExtension, page, grouping, resource, template, parameter)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Definition): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[Definition.Page]](page, t.page),
      FHIRComponentField[LitSeq[Definition.Grouping]](grouping, t.grouping),
      FHIRComponentField[NonEmptyLitSeq[Definition.Resource]](resource, t.resource),
      FHIRComponentField[LitSeq[Definition.Template]](template, t.template),
      FHIRComponentField[LitSeq[Definition.Parameter]](parameter, t.parameter)
    )
    val baseType: CompanionFor[Definition] = this
    val thisName: String                   = "Definition"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Definition] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Definition(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Definition.Page]]("page", Some(None)),
            cursor.decodeAs[LitSeq[Definition.Grouping]]("grouping", Some(LitSeq.empty)),
            cursor.decodeAs[NonEmptyLitSeq[Definition.Resource]]("resource", None),
            cursor.decodeAs[LitSeq[Definition.Template]]("template", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Definition.Parameter]]("parameter", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Definition(
      override val id: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val page: Option[Definition.Page] = None,
      val grouping: LitSeq[Definition.Grouping] = LitSeq.empty,
      val resource: NonEmptyLitSeq[Definition.Resource],
      val template: LitSeq[Definition.Template] = LitSeq.empty,
      val parameter: LitSeq[Definition.Parameter] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Manifest extends CompanionFor[Manifest] {
    implicit def summonObjectAndCompanionManifest_1366406619(o: Manifest): ObjectAndCompanion[Manifest, Manifest.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Manifest
    override type ParentType   = Manifest
    override val parentType: CompanionFor[ResourceType] = Manifest
    object Page extends CompanionFor[Page] {
      implicit def summonObjectAndCompanionPage322962451(o: Page): ObjectAndCompanion[Page, Page.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Page
      override type ParentType   = Page
      override val parentType: CompanionFor[ResourceType] = Page
      def apply(
          id: Option[String] = None,
          name: String,
          title: Option[String] = None,
          anchor: LitSeq[String] = LitSeq.empty,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Page = new Page(
        id,
        name,
        title,
        anchor,
        extension,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Page): Option[(Option[String], String, Option[String], LitSeq[String], LitSeq[Extension], LitSeq[Extension])] = Some(
        (o.id, o.name, o.title, o.anchor, o.extension, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val name: FHIRComponentFieldMeta[String] =
        FHIRComponentFieldMeta("name", lTagOf[String], false, lTagOf[String])
      val title: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("title", lTagOf[Option[String]], false, lTagOf[String])
      val anchor: FHIRComponentFieldMeta[LitSeq[String]] =
        FHIRComponentFieldMeta("anchor", lTagOf[LitSeq[String]], false, lTagOf[String])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, name, title, anchor, extension, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Page): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[String](name, t.name),
        FHIRComponentField[Option[String]](title, t.title),
        FHIRComponentField[LitSeq[String]](anchor, t.anchor),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Page] = this
      val thisName: String             = "Page"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Page] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Page(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[String]("name", None),
              cursor.decodeAs[Option[String]]("title", Some(None)),
              cursor.decodeAs[LitSeq[String]]("anchor", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Page(
        override val id: Option[String] = None,
        val name: String,
        val title: Option[String] = None,
        val anchor: LitSeq[String] = LitSeq.empty,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object Resource extends CompanionFor[Resource] {
      implicit def summonObjectAndCompanionResource695211414(o: Resource): ObjectAndCompanion[Resource, Resource.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Resource
      override type ParentType   = Resource
      override val parentType: CompanionFor[ResourceType] = Resource
      type ExampleChoice = Choice[Union00683246261]
      def apply(
          id: Option[String] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          reference: Reference,
          example: Option[Resource.ExampleChoice] = None,
          relativePath: Option[UrlStr] = None,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Resource = new Resource(
        id,
        extension,
        reference,
        example,
        relativePath,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Resource): Option[(Option[String], LitSeq[Extension], Reference, Option[Resource.ExampleChoice], Option[UrlStr], LitSeq[Extension])] =
        Some((o.id, o.extension, o.reference, o.example, o.relativePath, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val reference: FHIRComponentFieldMeta[Reference] =
        FHIRComponentFieldMeta("reference", lTagOf[Reference], false, lTagOf[Reference])
      val example: FHIRComponentFieldMeta[Option[Resource.ExampleChoice]] =
        FHIRComponentFieldMeta("example", lTagOf[Option[Resource.ExampleChoice]], true, lTagOf[Union00683246261])
      val relativePath: FHIRComponentFieldMeta[Option[UrlStr]] =
        FHIRComponentFieldMeta("relativePath", lTagOf[Option[UrlStr]], false, lTagOf[UrlStr])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, extension, reference, example, relativePath, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Resource): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Reference](reference, t.reference),
        FHIRComponentField[Option[Resource.ExampleChoice]](example, t.example),
        FHIRComponentField[Option[UrlStr]](relativePath, t.relativePath),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Resource] = this
      val thisName: String                 = "Resource"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Resource] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Resource(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Reference]("reference", None),
              cursor.decodeOptRef[Union00683246261]("example"),
              cursor.decodeAs[Option[UrlStr]]("relativePath", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Resource(
        override val id: Option[String] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val reference: Reference,
        val example: Option[Resource.ExampleChoice] = None,
        val relativePath: Option[UrlStr] = None,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        image: LitSeq[String] = LitSeq.empty,
        other: LitSeq[String] = LitSeq.empty,
        extension: LitSeq[Extension] = LitSeq.empty,
        rendering: Option[UrlStr] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        page: LitSeq[Manifest.Page] = LitSeq.empty,
        resource: NonEmptyLitSeq[Manifest.Resource],
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Manifest = new Manifest(
      id,
      image,
      other,
      extension,
      rendering,
      modifierExtension,
      page,
      resource,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Manifest): Option[(Option[String], LitSeq[String], LitSeq[String], LitSeq[Extension], Option[UrlStr], LitSeq[Extension], LitSeq[Manifest.Page], NonEmptyLitSeq[Manifest.Resource])] =
      Some((o.id, o.image, o.other, o.extension, o.rendering, o.modifierExtension, o.page, o.resource))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val image: FHIRComponentFieldMeta[LitSeq[String]] =
      FHIRComponentFieldMeta("image", lTagOf[LitSeq[String]], false, lTagOf[String])
    val other: FHIRComponentFieldMeta[LitSeq[String]] =
      FHIRComponentFieldMeta("other", lTagOf[LitSeq[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val rendering: FHIRComponentFieldMeta[Option[UrlStr]] =
      FHIRComponentFieldMeta("rendering", lTagOf[Option[UrlStr]], false, lTagOf[UrlStr])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val page: FHIRComponentFieldMeta[LitSeq[Manifest.Page]] =
      FHIRComponentFieldMeta("page", lTagOf[LitSeq[Manifest.Page]], false, lTagOf[Manifest.Page])
    val resource: FHIRComponentFieldMeta[NonEmptyLitSeq[Manifest.Resource]] =
      FHIRComponentFieldMeta("resource", lTagOf[NonEmptyLitSeq[Manifest.Resource]], false, lTagOf[Manifest.Resource])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, image, other, extension, rendering, modifierExtension, page, resource)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Manifest): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[String]](image, t.image),
      FHIRComponentField[LitSeq[String]](other, t.other),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[UrlStr]](rendering, t.rendering),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[Manifest.Page]](page, t.page),
      FHIRComponentField[NonEmptyLitSeq[Manifest.Resource]](resource, t.resource)
    )
    val baseType: CompanionFor[Manifest] = this
    val thisName: String                 = "Manifest"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Manifest] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Manifest(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[String]]("image", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[String]]("other", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[UrlStr]]("rendering", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Manifest.Page]]("page", Some(LitSeq.empty)),
            cursor.decodeAs[NonEmptyLitSeq[Manifest.Resource]]("resource", None),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Manifest(
      override val id: Option[String] = None,
      val image: LitSeq[String] = LitSeq.empty,
      val other: LitSeq[String] = LitSeq.empty,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val rendering: Option[UrlStr] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val page: LitSeq[Manifest.Page] = LitSeq.empty,
      val resource: NonEmptyLitSeq[Manifest.Resource],
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object DependsOn extends CompanionFor[DependsOn] {
    implicit def summonObjectAndCompanionDependsOn1096932494(o: DependsOn): ObjectAndCompanion[DependsOn, DependsOn.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = DependsOn
    override type ParentType   = DependsOn
    override val parentType: CompanionFor[ResourceType] = DependsOn
    def apply(
        id: Option[String] = None,
        uri: Canonical,
        version: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        packageId: Option[Id] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): DependsOn = new DependsOn(
      id,
      uri,
      version,
      extension,
      packageId,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: DependsOn): Option[(Option[String], Canonical, Option[String], LitSeq[Extension], Option[Id], LitSeq[Extension])] =
      Some((o.id, o.uri, o.version, o.extension, o.packageId, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val uri: FHIRComponentFieldMeta[Canonical] =
      FHIRComponentFieldMeta("uri", lTagOf[Canonical], false, lTagOf[Canonical])
    val version: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("version", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val packageId: FHIRComponentFieldMeta[Option[Id]] =
      FHIRComponentFieldMeta("packageId", lTagOf[Option[Id]], false, lTagOf[Id])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, uri, version, extension, packageId, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: DependsOn): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Canonical](uri, t.uri),
      FHIRComponentField[Option[String]](version, t.version),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Id]](packageId, t.packageId),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[DependsOn] = this
    val thisName: String                  = "DependsOn"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[DependsOn] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new DependsOn(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Canonical]("uri", None),
            cursor.decodeAs[Option[String]]("version", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Id]]("packageId", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class DependsOn(
      override val id: Option[String] = None,
      val uri: Canonical,
      val version: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val packageId: Option[Id] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Global extends CompanionFor[Global] {
    implicit def summonObjectAndCompanionGlobal_1143435986(o: Global): ObjectAndCompanion[Global, Global.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Global
    override type ParentType   = Global
    override val parentType: CompanionFor[ResourceType] = Global
    def apply(
        id: Option[String] = None,
        `type`: RESOURCE_TYPES,
        profile: Canonical,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Global = new Global(
      id,
      `type`,
      profile,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(o: Global): Option[(Option[String], RESOURCE_TYPES, Canonical, LitSeq[Extension], LitSeq[Extension])] = Some(
      (o.id, o.`type`, o.profile, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[RESOURCE_TYPES] =
      FHIRComponentFieldMeta("type", lTagOf[RESOURCE_TYPES], false, lTagOf[RESOURCE_TYPES])
    val profile: FHIRComponentFieldMeta[Canonical] =
      FHIRComponentFieldMeta("profile", lTagOf[Canonical], false, lTagOf[Canonical])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, `type`, profile, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Global): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[RESOURCE_TYPES](`type`, t.`type`),
      FHIRComponentField[Canonical](profile, t.profile),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Global] = this
    val thisName: String               = "Global"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Global] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Global(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[RESOURCE_TYPES]("type", None),
            cursor.decodeAs[Canonical]("profile", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Global(
      override val id: Option[String] = None,
      val `type`: RESOURCE_TYPES,
      val profile: Canonical,
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
      license: Option[SPDX_LICENSE] = None,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      publisher: Option[String] = None,
      copyright: Option[Markdown] = None,
      packageId: Id,
      useContext: LitSeq[UsageContext] = LitSeq.empty,
      description: Option[Markdown] = None,
      fhirVersion: NonEmptyLitSeq[FHIR_VERSION],
      experimental: Option[Boolean] = None,
      jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      global: LitSeq[ImplementationGuide.Global] = LitSeq.empty,
      dependsOn: LitSeq[ImplementationGuide.DependsOn] = LitSeq.empty,
      manifest: Option[ImplementationGuide.Manifest] = None,
      definition: Option[ImplementationGuide.Definition] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): ImplementationGuide = new ImplementationGuide(
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
    license,
    language,
    contained,
    extension,
    publisher,
    copyright,
    packageId,
    useContext,
    description,
    fhirVersion,
    experimental,
    jurisdiction,
    implicitRules,
    modifierExtension,
    global,
    dependsOn,
    manifest,
    definition,
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
  val license: FHIRComponentFieldMeta[Option[SPDX_LICENSE]] =
    FHIRComponentFieldMeta("license", lTagOf[Option[SPDX_LICENSE]], false, lTagOf[SPDX_LICENSE])
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
  val packageId: FHIRComponentFieldMeta[Id] =
    FHIRComponentFieldMeta("packageId", lTagOf[Id], false, lTagOf[Id])
  val useContext: FHIRComponentFieldMeta[LitSeq[UsageContext]] =
    FHIRComponentFieldMeta("useContext", lTagOf[LitSeq[UsageContext]], false, lTagOf[UsageContext])
  val description: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("description", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val fhirVersion: FHIRComponentFieldMeta[NonEmptyLitSeq[FHIR_VERSION]] =
    FHIRComponentFieldMeta("fhirVersion", lTagOf[NonEmptyLitSeq[FHIR_VERSION]], false, lTagOf[FHIR_VERSION])
  val experimental: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("experimental", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val jurisdiction: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("jurisdiction", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val global: FHIRComponentFieldMeta[LitSeq[ImplementationGuide.Global]] =
    FHIRComponentFieldMeta("global", lTagOf[LitSeq[ImplementationGuide.Global]], false, lTagOf[ImplementationGuide.Global])
  val dependsOn: FHIRComponentFieldMeta[LitSeq[ImplementationGuide.DependsOn]] =
    FHIRComponentFieldMeta(
      "dependsOn",
      lTagOf[LitSeq[ImplementationGuide.DependsOn]],
      false,
      lTagOf[ImplementationGuide.DependsOn])
  val manifest: FHIRComponentFieldMeta[Option[ImplementationGuide.Manifest]] =
    FHIRComponentFieldMeta("manifest", lTagOf[Option[ImplementationGuide.Manifest]], false, lTagOf[ImplementationGuide.Manifest])
  val definition: FHIRComponentFieldMeta[Option[ImplementationGuide.Definition]] =
    FHIRComponentFieldMeta(
      "definition",
      lTagOf[Option[ImplementationGuide.Definition]],
      false,
      lTagOf[ImplementationGuide.Definition])
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
    license,
    language,
    contained,
    extension,
    publisher,
    copyright,
    packageId,
    useContext,
    description,
    fhirVersion,
    experimental,
    jurisdiction,
    implicitRules,
    modifierExtension,
    global,
    dependsOn,
    manifest,
    definition
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: ImplementationGuide): Seq[FHIRComponentField[_]] = Seq(
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
    FHIRComponentField[Option[SPDX_LICENSE]](license, t.license),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[String]](publisher, t.publisher),
    FHIRComponentField[Option[Markdown]](copyright, t.copyright),
    FHIRComponentField[Id](packageId, t.packageId),
    FHIRComponentField[LitSeq[UsageContext]](useContext, t.useContext),
    FHIRComponentField[Option[Markdown]](description, t.description),
    FHIRComponentField[NonEmptyLitSeq[FHIR_VERSION]](fhirVersion, t.fhirVersion),
    FHIRComponentField[Option[Boolean]](experimental, t.experimental),
    FHIRComponentField[LitSeq[CodeableConcept]](jurisdiction, t.jurisdiction),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[ImplementationGuide.Global]](global, t.global),
    FHIRComponentField[LitSeq[ImplementationGuide.DependsOn]](dependsOn, t.dependsOn),
    FHIRComponentField[Option[ImplementationGuide.Manifest]](manifest, t.manifest),
    FHIRComponentField[Option[ImplementationGuide.Definition]](definition, t.definition)
  )
  def extractId(t: ImplementationGuide): Option[String]                                 = t.id
  def extractUrl(t: ImplementationGuide): UriStr                                        = t.url
  def extractMeta(t: ImplementationGuide): Option[Meta]                                 = t.meta
  def extractText(t: ImplementationGuide): Option[Narrative]                            = t.text
  def extractName(t: ImplementationGuide): String                                       = t.name
  def extractDate(t: ImplementationGuide): Option[FHIRDateTime]                         = t.date
  def extractTitle(t: ImplementationGuide): Option[String]                              = t.title
  def extractStatus(t: ImplementationGuide): PUBLICATION_STATUS                         = t.status
  def extractVersion(t: ImplementationGuide): Option[String]                            = t.version
  def extractContact(t: ImplementationGuide): LitSeq[ContactDetail]                     = t.contact
  def extractLicense(t: ImplementationGuide): Option[SPDX_LICENSE]                      = t.license
  def extractLanguage(t: ImplementationGuide): Option[LANGUAGES]                        = t.language
  def extractContained(t: ImplementationGuide): LitSeq[Resource]                        = t.contained
  def extractExtension(t: ImplementationGuide): LitSeq[Extension]                       = t.extension
  def extractPublisher(t: ImplementationGuide): Option[String]                          = t.publisher
  def extractCopyright(t: ImplementationGuide): Option[Markdown]                        = t.copyright
  def extractPackageId(t: ImplementationGuide): Id                                      = t.packageId
  def extractUseContext(t: ImplementationGuide): LitSeq[UsageContext]                   = t.useContext
  def extractDescription(t: ImplementationGuide): Option[Markdown]                      = t.description
  def extractFhirVersion(t: ImplementationGuide): NonEmptyLitSeq[FHIR_VERSION]          = t.fhirVersion
  def extractExperimental(t: ImplementationGuide): Option[Boolean]                      = t.experimental
  def extractJurisdiction(t: ImplementationGuide): LitSeq[CodeableConcept]              = t.jurisdiction
  def extractImplicitRules(t: ImplementationGuide): Option[UriStr]                      = t.implicitRules
  def extractModifierExtension(t: ImplementationGuide): LitSeq[Extension]               = t.modifierExtension
  def extractGlobal(t: ImplementationGuide): LitSeq[ImplementationGuide.Global]         = t.global
  def extractDependsOn(t: ImplementationGuide): LitSeq[ImplementationGuide.DependsOn]   = t.dependsOn
  def extractManifest(t: ImplementationGuide): Option[ImplementationGuide.Manifest]     = t.manifest
  def extractDefinition(t: ImplementationGuide): Option[ImplementationGuide.Definition] = t.definition
  override val thisName: String                                                         = "ImplementationGuide"
  override val searchParams: Map[String, ImplementationGuide => Seq[Any]] = Map(
    "jurisdiction"          -> (obj => obj.jurisdiction.toSeq),
    "experimental"          -> (obj => obj.experimental.toSeq),
    "name"                  -> (obj => Seq(obj.name)),
    "context-type-quantity" -> (obj => obj.useContext.toSeq),
    "url"                   -> (obj => Seq(obj.url)),
    "description"           -> (obj => obj.description.toSeq),
    "context"               -> (obj => obj.useContext.map(_.value).flatMap(_.as[CodeableConcept]).toSeq),
    "depends-on"            -> (obj => obj.dependsOn.map(_.uri).toSeq),
    "global"                -> (obj => obj.global.map(_.profile).toSeq),
    "context-type"          -> (obj => obj.useContext.map(_.code).toSeq),
    "context-type-value"    -> (obj => obj.useContext.toSeq),
    "version"               -> (obj => obj.version.toSeq),
    "date"                  -> (obj => obj.date.toSeq),
    "resource"              -> (obj => obj.definition.toSeq.flatMap(_.resource).map(_.reference).toSeq),
    "status"                -> (obj => Seq(obj.status)),
    "publisher"             -> (obj => obj.publisher.toSeq),
    "title"                 -> (obj => obj.title.toSeq),
    "context-quantity" -> (obj =>
      obj.useContext.map(_.value).flatMap(_.as[Quantity]).toSeq ++
        obj.useContext.map(_.value).flatMap(_.as[Range]).toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ImplementationGuide] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new ImplementationGuide(
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
          cursor.decodeAs[Option[SPDX_LICENSE]]("license", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("publisher", Some(None)),
          cursor.decodeAs[Option[Markdown]]("copyright", Some(None)),
          cursor.decodeAs[Id]("packageId", None),
          cursor.decodeAs[LitSeq[UsageContext]]("useContext", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Markdown]]("description", Some(None)),
          cursor.decodeAs[NonEmptyLitSeq[FHIR_VERSION]]("fhirVersion", None),
          cursor.decodeAs[Option[Boolean]]("experimental", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("jurisdiction", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[ImplementationGuide.Global]]("global", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[ImplementationGuide.DependsOn]]("dependsOn", Some(LitSeq.empty)),
          cursor.decodeAs[Option[ImplementationGuide.Manifest]]("manifest", Some(None)),
          cursor.decodeAs[Option[ImplementationGuide.Definition]]("definition", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR
  * resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a
  * computable definition of all the parts.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields url, name, date, title, status, version, contact, license, publisher, copyright, packageId,
  *   useContext, description, fhirVersion, experimental, jurisdiction, global, dependsOn, manifest, definition.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param url
  *   - An absolute URI that is used to identify this implementation guide when it is referenced in a specification, model, design
  *   or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at
  *   which at which an authoritative instance of this implementation guide is (or will be) published. This URL can be the target
  *   of a canonical reference. It SHALL remain the same when the implementation guide is stored on different servers.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *   not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *   resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to
  *   make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be
  *   represented in the narrative to ensure clinical safety.
  * @param name
  *   - A natural language name identifying the implementation guide. This name should be usable as an identifier for the module
  *   by machine processing applications such as code generation.
  * @param date
  *   - The date (and optionally time) when the implementation guide was published. The date must change when the business version
  *   changes and it must change if the status code changes. In addition, it should change when the substantive content of the
  *   implementation guide changes.
  * @param title
  *   - A short, descriptive, user-friendly title for the implementation guide.
  * @param status
  *   - The status of this implementation guide. Enables tracking the life-cycle of the content.
  * @param version
  *   - The identifier that is used to identify this version of the implementation guide when it is referenced in a specification,
  *   model, design or instance. This is an arbitrary value managed by the implementation guide author and is not expected to be
  *   globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also
  *   no expectation that versions can be placed in a lexicographical sequence.
  * @param contact
  *   - Contact details to assist a user in finding and communicating with the publisher.
  * @param license
  *   - The license that applies to this Implementation Guide, using an SPDX license code, or 'not-open-source'.
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
  *   - The name of the organization or individual that published the implementation guide.
  * @param copyright
  *   - A copyright statement relating to the implementation guide and/or its contents. Copyright statements are generally legal
  *   restrictions on the use and publishing of the implementation guide.
  * @param packageId
  *   - The NPM package name for this Implementation Guide, used in the NPM package distribution, which is the primary mechanism
  *   by which FHIR based tooling manages IG dependencies. This value must be globally unique, and should be assigned with care.
  * @param useContext
  *   - The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be
  *   general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be
  *   used to assist with indexing and searching for appropriate implementation guide instances.
  * @param description
  *   - A free text natural language description of the implementation guide from a consumer's perspective.
  * @param fhirVersion
  *   - The version(s) of the FHIR specification that this ImplementationGuide targets - e.g. describes how to use. The value of
  *   this element is the formal version of the specification, without the revision number, e.g. [publication].[major].[minor],
  *   which is 4.0.1. for this version.
  * @param experimental
  *   - A Boolean value to indicate that this implementation guide is authored for testing purposes (or
  *   education/evaluation/marketing) and is not intended to be used for genuine usage.
  * @param jurisdiction
  *   - A legal or geographic region in which the implementation guide is intended to be used.
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
  * @param global
  *   - A set of profiles that all resources covered by this implementation guide must conform to.
  * @param dependsOn
  *   - Another implementation guide that this implementation depends on. Typically, an implementation guide uses value sets,
  *   profiles etc.defined in other implementation guides.
  * @param manifest
  *   - Information about an assembled implementation guide, created by the publication tooling.
  * @param definition
  *   - The information needed by an IG publisher tool to publish the whole implementation guide.
  */
@POJOBoilerplate
class ImplementationGuide(
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
    val license: Option[SPDX_LICENSE] = None,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val publisher: Option[String] = None,
    val copyright: Option[Markdown] = None,
    val packageId: Id,
    val useContext: LitSeq[UsageContext] = LitSeq.empty,
    val description: Option[Markdown] = None,
    val fhirVersion: NonEmptyLitSeq[FHIR_VERSION],
    val experimental: Option[Boolean] = None,
    val jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val global: LitSeq[ImplementationGuide.Global] = LitSeq.empty,
    val dependsOn: LitSeq[ImplementationGuide.DependsOn] = LitSeq.empty,
    val manifest: Option[ImplementationGuide.Manifest] = None,
    val definition: Option[ImplementationGuide.Definition] = None,
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
  override val thisTypeName: String = "ImplementationGuide"
}
