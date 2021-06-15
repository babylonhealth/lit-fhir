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
import com.babylonhealth.lit.hl7.{ PUBLICATION_STATUS, CODE_SEARCH_SUPPORT, CAPABILITY_STATEMENT_KIND }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object TerminologyCapabilities extends CompanionFor[TerminologyCapabilities] {
  implicit def summonObjectAndCompanionTerminologyCapabilities_1457363645(
      o: TerminologyCapabilities): ObjectAndCompanion[TerminologyCapabilities, TerminologyCapabilities.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = TerminologyCapabilities
  override type ParentType   = TerminologyCapabilities
  override val baseType: CompanionFor[ResourceType] = TerminologyCapabilities
  override val parentType: CompanionFor[ParentType] = TerminologyCapabilities
  override val profileUrl: Option[String] = Some("http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities")
  object CodeSystem extends CompanionFor[CodeSystem] {
    implicit def summonObjectAndCompanionCodeSystem1278204051(
        o: CodeSystem): ObjectAndCompanion[CodeSystem, CodeSystem.type] = ObjectAndCompanion(o, this)
    override type ResourceType = CodeSystem
    override type ParentType   = CodeSystem
    override val parentType: CompanionFor[ResourceType] = CodeSystem
    object Version extends CompanionFor[Version] {
      implicit def summonObjectAndCompanionVersion_1494674706(o: Version): ObjectAndCompanion[Version, Version.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Version
      override type ParentType   = Version
      override val parentType: CompanionFor[ResourceType] = Version
      object Filter extends CompanionFor[Filter] {
        implicit def summonObjectAndCompanionFilter_33477739(o: Filter): ObjectAndCompanion[Filter, Filter.type] =
          ObjectAndCompanion(o, this)
        override type ResourceType = Filter
        override type ParentType   = Filter
        override val parentType: CompanionFor[ResourceType] = Filter
        def apply(
            id: Option[String] = None,
            op: NonEmptyLitSeq[Code],
            code: Code,
            extension: LitSeq[Extension] = LitSeq.empty,
            modifierExtension: LitSeq[Extension] = LitSeq.empty,
            primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
        ): Filter = new Filter(
          id,
          op,
          code,
          extension,
          modifierExtension,
          primitiveAttributes = primitiveAttributes
        )
        def unapply(
            o: Filter): Option[(Option[String], NonEmptyLitSeq[Code], Code, LitSeq[Extension], LitSeq[Extension])] =
          Some((o.id, o.op, o.code, o.extension, o.modifierExtension))
        val id: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
        val op: FHIRComponentFieldMeta[NonEmptyLitSeq[Code]] =
          FHIRComponentFieldMeta("op", lTagOf[NonEmptyLitSeq[Code]], false, lTagOf[Code])
        val code: FHIRComponentFieldMeta[Code] =
          FHIRComponentFieldMeta("code", lTagOf[Code], false, lTagOf[Code])
        val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, op, code, extension, modifierExtension)
        override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
        override def fields(t: Filter): Seq[FHIRComponentField[_]] = Seq(
          FHIRComponentField[Option[String]](id, t.id),
          FHIRComponentField[NonEmptyLitSeq[Code]](op, t.op),
          FHIRComponentField[Code](code, t.code),
          FHIRComponentField[LitSeq[Extension]](extension, t.extension),
          FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
        )
        val baseType: CompanionFor[Filter] = this
        val thisName: String               = "Filter"
        def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Filter] =
          checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
            Try(
              new Filter(
                cursor.decodeAs[Option[String]]("id", Some(None)),
                cursor.decodeAs[NonEmptyLitSeq[Code]]("op", None),
                cursor.decodeAs[Code]("code", None),
                cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
                cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
                decodeAttributes(cursor)
              )
            ))
      }
      @POJOBoilerplate
      class Filter(
          override val id: Option[String] = None,
          val op: NonEmptyLitSeq[Code],
          val code: Code,
          override val extension: LitSeq[Extension] = LitSeq.empty,
          override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
          override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
            FHIRObject.emptyAtts)
          extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
      def apply(
          id: Option[String] = None,
          code: Option[String] = None,
          language: LitSeq[Code] = LitSeq.empty,
          property: LitSeq[Code] = LitSeq.empty,
          extension: LitSeq[Extension] = LitSeq.empty,
          isDefault: Option[Boolean] = None,
          compositional: Option[Boolean] = None,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          filter: LitSeq[Version.Filter] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Version = new Version(
        id,
        code,
        language,
        property,
        extension,
        isDefault,
        compositional,
        modifierExtension,
        filter,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Version): Option[(Option[String], Option[String], LitSeq[Code], LitSeq[Code], LitSeq[Extension], Option[Boolean], Option[Boolean], LitSeq[Extension], LitSeq[Version.Filter])] =
        Some(
          (
            o.id,
            o.code,
            o.language,
            o.property,
            o.extension,
            o.isDefault,
            o.compositional,
            o.modifierExtension,
            o.filter))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val code: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("code", lTagOf[Option[String]], false, lTagOf[String])
      val language: FHIRComponentFieldMeta[LitSeq[Code]] =
        FHIRComponentFieldMeta("language", lTagOf[LitSeq[Code]], false, lTagOf[Code])
      val property: FHIRComponentFieldMeta[LitSeq[Code]] =
        FHIRComponentFieldMeta("property", lTagOf[LitSeq[Code]], false, lTagOf[Code])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val isDefault: FHIRComponentFieldMeta[Option[Boolean]] =
        FHIRComponentFieldMeta("isDefault", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
      val compositional: FHIRComponentFieldMeta[Option[Boolean]] =
        FHIRComponentFieldMeta("compositional", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val filter: FHIRComponentFieldMeta[LitSeq[Version.Filter]] =
        FHIRComponentFieldMeta("filter", lTagOf[LitSeq[Version.Filter]], false, lTagOf[Version.Filter])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
        Seq(id, code, language, property, extension, isDefault, compositional, modifierExtension, filter)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Version): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[String]](code, t.code),
        FHIRComponentField[LitSeq[Code]](language, t.language),
        FHIRComponentField[LitSeq[Code]](property, t.property),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[Boolean]](isDefault, t.isDefault),
        FHIRComponentField[Option[Boolean]](compositional, t.compositional),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
        FHIRComponentField[LitSeq[Version.Filter]](filter, t.filter)
      )
      val baseType: CompanionFor[Version] = this
      val thisName: String                = "Version"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Version] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Version(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[String]]("code", Some(None)),
              cursor.decodeAs[LitSeq[Code]]("language", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Code]]("property", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[Boolean]]("isDefault", Some(None)),
              cursor.decodeAs[Option[Boolean]]("compositional", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Version.Filter]]("filter", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Version(
        override val id: Option[String] = None,
        val code: Option[String] = None,
        val language: LitSeq[Code] = LitSeq.empty,
        val property: LitSeq[Code] = LitSeq.empty,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val isDefault: Option[Boolean] = None,
        val compositional: Option[Boolean] = None,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        val filter: LitSeq[Version.Filter] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        uri: Option[Canonical] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        subsumption: Option[Boolean] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        version: LitSeq[CodeSystem.Version] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): CodeSystem = new CodeSystem(
      id,
      uri,
      extension,
      subsumption,
      modifierExtension,
      version,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: CodeSystem): Option[(Option[String], Option[Canonical], LitSeq[Extension], Option[Boolean], LitSeq[Extension], LitSeq[CodeSystem.Version])] =
      Some((o.id, o.uri, o.extension, o.subsumption, o.modifierExtension, o.version))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val uri: FHIRComponentFieldMeta[Option[Canonical]] =
      FHIRComponentFieldMeta("uri", lTagOf[Option[Canonical]], false, lTagOf[Canonical])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val subsumption: FHIRComponentFieldMeta[Option[Boolean]] =
      FHIRComponentFieldMeta("subsumption", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val version: FHIRComponentFieldMeta[LitSeq[CodeSystem.Version]] =
      FHIRComponentFieldMeta("version", lTagOf[LitSeq[CodeSystem.Version]], false, lTagOf[CodeSystem.Version])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, uri, extension, subsumption, modifierExtension, version)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: CodeSystem): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Canonical]](uri, t.uri),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Boolean]](subsumption, t.subsumption),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[CodeSystem.Version]](version, t.version)
    )
    val baseType: CompanionFor[CodeSystem] = this
    val thisName: String                   = "CodeSystem"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[CodeSystem] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new CodeSystem(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[Canonical]]("uri", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Boolean]]("subsumption", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[CodeSystem.Version]]("version", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class CodeSystem(
      override val id: Option[String] = None,
      val uri: Option[Canonical] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val subsumption: Option[Boolean] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val version: LitSeq[CodeSystem.Version] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Expansion extends CompanionFor[Expansion] {
    implicit def summonObjectAndCompanionExpansion1317659069(
        o: Expansion): ObjectAndCompanion[Expansion, Expansion.type] = ObjectAndCompanion(o, this)
    override type ResourceType = Expansion
    override type ParentType   = Expansion
    override val parentType: CompanionFor[ResourceType] = Expansion
    object Parameter extends CompanionFor[Parameter] {
      implicit def summonObjectAndCompanionParameter727731194(
          o: Parameter): ObjectAndCompanion[Parameter, Parameter.type] = ObjectAndCompanion(o, this)
      override type ResourceType = Parameter
      override type ParentType   = Parameter
      override val parentType: CompanionFor[ResourceType] = Parameter
      def apply(
          id: Option[String] = None,
          name: Code,
          extension: LitSeq[Extension] = LitSeq.empty,
          documentation: Option[String] = None,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Parameter = new Parameter(
        id,
        name,
        extension,
        documentation,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(o: Parameter): Option[(Option[String], Code, LitSeq[Extension], Option[String], LitSeq[Extension])] =
        Some((o.id, o.name, o.extension, o.documentation, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val name: FHIRComponentFieldMeta[Code] =
        FHIRComponentFieldMeta("name", lTagOf[Code], false, lTagOf[Code])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val documentation: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("documentation", lTagOf[Option[String]], false, lTagOf[String])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, name, extension, documentation, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Parameter): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Code](name, t.name),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[String]](documentation, t.documentation),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Parameter] = this
      val thisName: String                  = "Parameter"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Parameter] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Parameter(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Code]("name", None),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[String]]("documentation", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Parameter(
        override val id: Option[String] = None,
        val name: Code,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val documentation: Option[String] = None,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        paging: Option[Boolean] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        incomplete: Option[Boolean] = None,
        textFilter: Option[Markdown] = None,
        hierarchical: Option[Boolean] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        parameter: LitSeq[Expansion.Parameter] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Expansion = new Expansion(
      id,
      paging,
      extension,
      incomplete,
      textFilter,
      hierarchical,
      modifierExtension,
      parameter,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Expansion): Option[(Option[String], Option[Boolean], LitSeq[Extension], Option[Boolean], Option[Markdown], Option[Boolean], LitSeq[Extension], LitSeq[Expansion.Parameter])] =
      Some((o.id, o.paging, o.extension, o.incomplete, o.textFilter, o.hierarchical, o.modifierExtension, o.parameter))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val paging: FHIRComponentFieldMeta[Option[Boolean]] =
      FHIRComponentFieldMeta("paging", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val incomplete: FHIRComponentFieldMeta[Option[Boolean]] =
      FHIRComponentFieldMeta("incomplete", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
    val textFilter: FHIRComponentFieldMeta[Option[Markdown]] =
      FHIRComponentFieldMeta("textFilter", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
    val hierarchical: FHIRComponentFieldMeta[Option[Boolean]] =
      FHIRComponentFieldMeta("hierarchical", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val parameter: FHIRComponentFieldMeta[LitSeq[Expansion.Parameter]] =
      FHIRComponentFieldMeta("parameter", lTagOf[LitSeq[Expansion.Parameter]], false, lTagOf[Expansion.Parameter])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, paging, extension, incomplete, textFilter, hierarchical, modifierExtension, parameter)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Expansion): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Boolean]](paging, t.paging),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Boolean]](incomplete, t.incomplete),
      FHIRComponentField[Option[Markdown]](textFilter, t.textFilter),
      FHIRComponentField[Option[Boolean]](hierarchical, t.hierarchical),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[Expansion.Parameter]](parameter, t.parameter)
    )
    val baseType: CompanionFor[Expansion] = this
    val thisName: String                  = "Expansion"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Expansion] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Expansion(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[Boolean]]("paging", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Boolean]]("incomplete", Some(None)),
            cursor.decodeAs[Option[Markdown]]("textFilter", Some(None)),
            cursor.decodeAs[Option[Boolean]]("hierarchical", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Expansion.Parameter]]("parameter", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Expansion(
      override val id: Option[String] = None,
      val paging: Option[Boolean] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val incomplete: Option[Boolean] = None,
      val textFilter: Option[Markdown] = None,
      val hierarchical: Option[Boolean] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val parameter: LitSeq[Expansion.Parameter] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Implementation extends CompanionFor[Implementation] {
    implicit def summonObjectAndCompanionImplementation1964527366(
        o: Implementation): ObjectAndCompanion[Implementation, Implementation.type] = ObjectAndCompanion(o, this)
    override type ResourceType = Implementation
    override type ParentType   = Implementation
    override val parentType: CompanionFor[ResourceType] = Implementation
    def apply(
        id: Option[String] = None,
        url: Option[UrlStr] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        description: String,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Implementation = new Implementation(
      id,
      url,
      extension,
      description,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Implementation): Option[(Option[String], Option[UrlStr], LitSeq[Extension], String, LitSeq[Extension])] =
      Some((o.id, o.url, o.extension, o.description, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val url: FHIRComponentFieldMeta[Option[UrlStr]] =
      FHIRComponentFieldMeta("url", lTagOf[Option[UrlStr]], false, lTagOf[UrlStr])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val description: FHIRComponentFieldMeta[String] =
      FHIRComponentFieldMeta("description", lTagOf[String], false, lTagOf[String])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, url, extension, description, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Implementation): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[UrlStr]](url, t.url),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
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
      val description: String,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object ValidateCode extends CompanionFor[ValidateCode] {
    implicit def summonObjectAndCompanionValidateCode868771246(
        o: ValidateCode): ObjectAndCompanion[ValidateCode, ValidateCode.type] = ObjectAndCompanion(o, this)
    override type ResourceType = ValidateCode
    override type ParentType   = ValidateCode
    override val parentType: CompanionFor[ResourceType] = ValidateCode
    def apply(
        id: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        translations: Boolean,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): ValidateCode = new ValidateCode(
      id,
      extension,
      translations,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(o: ValidateCode): Option[(Option[String], LitSeq[Extension], Boolean, LitSeq[Extension])] = Some(
      (o.id, o.extension, o.translations, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val translations: FHIRComponentFieldMeta[Boolean] =
      FHIRComponentFieldMeta("translations", lTagOf[Boolean], false, lTagOf[Boolean])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, extension, translations, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: ValidateCode): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Boolean](translations, t.translations),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[ValidateCode] = this
    val thisName: String                     = "ValidateCode"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ValidateCode] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new ValidateCode(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Boolean]("translations", None),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class ValidateCode(
      override val id: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val translations: Boolean,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Translation extends CompanionFor[Translation] {
    implicit def summonObjectAndCompanionTranslation_1164948214(
        o: Translation): ObjectAndCompanion[Translation, Translation.type] = ObjectAndCompanion(o, this)
    override type ResourceType = Translation
    override type ParentType   = Translation
    override val parentType: CompanionFor[ResourceType] = Translation
    def apply(
        id: Option[String] = None,
        needsMap: Boolean,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Translation = new Translation(
      id,
      needsMap,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(o: Translation): Option[(Option[String], Boolean, LitSeq[Extension], LitSeq[Extension])] = Some(
      (o.id, o.needsMap, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val needsMap: FHIRComponentFieldMeta[Boolean] =
      FHIRComponentFieldMeta("needsMap", lTagOf[Boolean], false, lTagOf[Boolean])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, needsMap, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Translation): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Boolean](needsMap, t.needsMap),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Translation] = this
    val thisName: String                    = "Translation"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Translation] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Translation(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Boolean]("needsMap", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Translation(
      override val id: Option[String] = None,
      val needsMap: Boolean,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Software extends CompanionFor[Software] {
    implicit def summonObjectAndCompanionSoftware_309870205(o: Software): ObjectAndCompanion[Software, Software.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Software
    override type ParentType   = Software
    override val parentType: CompanionFor[ResourceType] = Software
    def apply(
        id: Option[String] = None,
        name: String,
        version: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Software = new Software(
      id,
      name,
      version,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(o: Software): Option[(Option[String], String, Option[String], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.name, o.version, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val name: FHIRComponentFieldMeta[String] =
      FHIRComponentFieldMeta("name", lTagOf[String], false, lTagOf[String])
    val version: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("version", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, name, version, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Software): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[String](name, t.name),
      FHIRComponentField[Option[String]](version, t.version),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
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
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Closure extends CompanionFor[Closure] {
    implicit def summonObjectAndCompanionClosure_1723806924(o: Closure): ObjectAndCompanion[Closure, Closure.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Closure
    override type ParentType   = Closure
    override val parentType: CompanionFor[ResourceType] = Closure
    def apply(
        id: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        translation: Option[Boolean] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Closure = new Closure(
      id,
      extension,
      translation,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(o: Closure): Option[(Option[String], LitSeq[Extension], Option[Boolean], LitSeq[Extension])] = Some(
      (o.id, o.extension, o.translation, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val translation: FHIRComponentFieldMeta[Option[Boolean]] =
      FHIRComponentFieldMeta("translation", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, extension, translation, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Closure): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Boolean]](translation, t.translation),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Closure] = this
    val thisName: String                = "Closure"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Closure] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Closure(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Boolean]]("translation", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Closure(
      override val id: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val translation: Option[Boolean] = None,
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
      version: Option[String] = None,
      contact: LitSeq[ContactDetail] = LitSeq.empty,
      purpose: Option[Markdown] = None,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      publisher: Option[String] = None,
      copyright: Option[Markdown] = None,
      useContext: LitSeq[UsageContext] = LitSeq.empty,
      lockedDate: Option[Boolean] = None,
      codeSearch: Option[CODE_SEARCH_SUPPORT] = None,
      description: Option[Markdown] = None,
      experimental: Option[Boolean] = None,
      jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      closure: Option[TerminologyCapabilities.Closure] = None,
      software: Option[TerminologyCapabilities.Software] = None,
      translation: Option[TerminologyCapabilities.Translation] = None,
      validateCode: Option[TerminologyCapabilities.ValidateCode] = None,
      implementation: Option[TerminologyCapabilities.Implementation] = None,
      expansion: Option[TerminologyCapabilities.Expansion] = None,
      codeSystem: LitSeq[TerminologyCapabilities.CodeSystem] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): TerminologyCapabilities = new TerminologyCapabilities(
    id,
    url,
    meta,
    text,
    name,
    date,
    kind,
    title,
    status,
    version,
    contact,
    purpose,
    language,
    contained,
    extension,
    publisher,
    copyright,
    useContext,
    lockedDate,
    codeSearch,
    description,
    experimental,
    jurisdiction,
    implicitRules,
    modifierExtension,
    closure,
    software,
    translation,
    validateCode,
    implementation,
    expansion,
    codeSystem,
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
  val version: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("version", lTagOf[Option[String]], false, lTagOf[String])
  val contact: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("contact", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val purpose: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("purpose", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
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
  val lockedDate: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("lockedDate", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val codeSearch: FHIRComponentFieldMeta[Option[CODE_SEARCH_SUPPORT]] =
    FHIRComponentFieldMeta("codeSearch", lTagOf[Option[CODE_SEARCH_SUPPORT]], false, lTagOf[CODE_SEARCH_SUPPORT])
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
  val closure: FHIRComponentFieldMeta[Option[TerminologyCapabilities.Closure]] =
    FHIRComponentFieldMeta(
      "closure",
      lTagOf[Option[TerminologyCapabilities.Closure]],
      false,
      lTagOf[TerminologyCapabilities.Closure])
  val software: FHIRComponentFieldMeta[Option[TerminologyCapabilities.Software]] =
    FHIRComponentFieldMeta(
      "software",
      lTagOf[Option[TerminologyCapabilities.Software]],
      false,
      lTagOf[TerminologyCapabilities.Software])
  val translation: FHIRComponentFieldMeta[Option[TerminologyCapabilities.Translation]] =
    FHIRComponentFieldMeta(
      "translation",
      lTagOf[Option[TerminologyCapabilities.Translation]],
      false,
      lTagOf[TerminologyCapabilities.Translation])
  val validateCode: FHIRComponentFieldMeta[Option[TerminologyCapabilities.ValidateCode]] =
    FHIRComponentFieldMeta(
      "validateCode",
      lTagOf[Option[TerminologyCapabilities.ValidateCode]],
      false,
      lTagOf[TerminologyCapabilities.ValidateCode])
  val implementation: FHIRComponentFieldMeta[Option[TerminologyCapabilities.Implementation]] =
    FHIRComponentFieldMeta(
      "implementation",
      lTagOf[Option[TerminologyCapabilities.Implementation]],
      false,
      lTagOf[TerminologyCapabilities.Implementation])
  val expansion: FHIRComponentFieldMeta[Option[TerminologyCapabilities.Expansion]] =
    FHIRComponentFieldMeta(
      "expansion",
      lTagOf[Option[TerminologyCapabilities.Expansion]],
      false,
      lTagOf[TerminologyCapabilities.Expansion])
  val codeSystem: FHIRComponentFieldMeta[LitSeq[TerminologyCapabilities.CodeSystem]] =
    FHIRComponentFieldMeta(
      "codeSystem",
      lTagOf[LitSeq[TerminologyCapabilities.CodeSystem]],
      false,
      lTagOf[TerminologyCapabilities.CodeSystem])
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
    version,
    contact,
    purpose,
    language,
    contained,
    extension,
    publisher,
    copyright,
    useContext,
    lockedDate,
    codeSearch,
    description,
    experimental,
    jurisdiction,
    implicitRules,
    modifierExtension,
    closure,
    software,
    translation,
    validateCode,
    implementation,
    expansion,
    codeSystem
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: TerminologyCapabilities): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[UriStr]](url, t.url),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[String]](name, t.name),
    FHIRComponentField[FHIRDateTime](date, t.date),
    FHIRComponentField[CAPABILITY_STATEMENT_KIND](kind, t.kind),
    FHIRComponentField[Option[String]](title, t.title),
    FHIRComponentField[PUBLICATION_STATUS](status, t.status),
    FHIRComponentField[Option[String]](version, t.version),
    FHIRComponentField[LitSeq[ContactDetail]](contact, t.contact),
    FHIRComponentField[Option[Markdown]](purpose, t.purpose),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[String]](publisher, t.publisher),
    FHIRComponentField[Option[Markdown]](copyright, t.copyright),
    FHIRComponentField[LitSeq[UsageContext]](useContext, t.useContext),
    FHIRComponentField[Option[Boolean]](lockedDate, t.lockedDate),
    FHIRComponentField[Option[CODE_SEARCH_SUPPORT]](codeSearch, t.codeSearch),
    FHIRComponentField[Option[Markdown]](description, t.description),
    FHIRComponentField[Option[Boolean]](experimental, t.experimental),
    FHIRComponentField[LitSeq[CodeableConcept]](jurisdiction, t.jurisdiction),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Option[TerminologyCapabilities.Closure]](closure, t.closure),
    FHIRComponentField[Option[TerminologyCapabilities.Software]](software, t.software),
    FHIRComponentField[Option[TerminologyCapabilities.Translation]](translation, t.translation),
    FHIRComponentField[Option[TerminologyCapabilities.ValidateCode]](validateCode, t.validateCode),
    FHIRComponentField[Option[TerminologyCapabilities.Implementation]](implementation, t.implementation),
    FHIRComponentField[Option[TerminologyCapabilities.Expansion]](expansion, t.expansion),
    FHIRComponentField[LitSeq[TerminologyCapabilities.CodeSystem]](codeSystem, t.codeSystem)
  )
  def extractId(t: TerminologyCapabilities): Option[String]                                       = t.id
  def extractUrl(t: TerminologyCapabilities): Option[UriStr]                                      = t.url
  def extractMeta(t: TerminologyCapabilities): Option[Meta]                                       = t.meta
  def extractText(t: TerminologyCapabilities): Option[Narrative]                                  = t.text
  def extractName(t: TerminologyCapabilities): Option[String]                                     = t.name
  def extractDate(t: TerminologyCapabilities): FHIRDateTime                                       = t.date
  def extractKind(t: TerminologyCapabilities): CAPABILITY_STATEMENT_KIND                          = t.kind
  def extractTitle(t: TerminologyCapabilities): Option[String]                                    = t.title
  def extractStatus(t: TerminologyCapabilities): PUBLICATION_STATUS                               = t.status
  def extractVersion(t: TerminologyCapabilities): Option[String]                                  = t.version
  def extractContact(t: TerminologyCapabilities): LitSeq[ContactDetail]                           = t.contact
  def extractPurpose(t: TerminologyCapabilities): Option[Markdown]                                = t.purpose
  def extractLanguage(t: TerminologyCapabilities): Option[LANGUAGES]                              = t.language
  def extractContained(t: TerminologyCapabilities): LitSeq[Resource]                              = t.contained
  def extractExtension(t: TerminologyCapabilities): LitSeq[Extension]                             = t.extension
  def extractPublisher(t: TerminologyCapabilities): Option[String]                                = t.publisher
  def extractCopyright(t: TerminologyCapabilities): Option[Markdown]                              = t.copyright
  def extractUseContext(t: TerminologyCapabilities): LitSeq[UsageContext]                         = t.useContext
  def extractLockedDate(t: TerminologyCapabilities): Option[Boolean]                              = t.lockedDate
  def extractCodeSearch(t: TerminologyCapabilities): Option[CODE_SEARCH_SUPPORT]                  = t.codeSearch
  def extractDescription(t: TerminologyCapabilities): Option[Markdown]                            = t.description
  def extractExperimental(t: TerminologyCapabilities): Option[Boolean]                            = t.experimental
  def extractJurisdiction(t: TerminologyCapabilities): LitSeq[CodeableConcept]                    = t.jurisdiction
  def extractImplicitRules(t: TerminologyCapabilities): Option[UriStr]                            = t.implicitRules
  def extractModifierExtension(t: TerminologyCapabilities): LitSeq[Extension]                     = t.modifierExtension
  def extractClosure(t: TerminologyCapabilities): Option[TerminologyCapabilities.Closure]         = t.closure
  def extractSoftware(t: TerminologyCapabilities): Option[TerminologyCapabilities.Software]       = t.software
  def extractTranslation(t: TerminologyCapabilities): Option[TerminologyCapabilities.Translation] = t.translation
  def extractValidateCode(t: TerminologyCapabilities): Option[TerminologyCapabilities.ValidateCode] = t.validateCode
  def extractImplementation(t: TerminologyCapabilities): Option[TerminologyCapabilities.Implementation] =
    t.implementation
  def extractExpansion(t: TerminologyCapabilities): Option[TerminologyCapabilities.Expansion]   = t.expansion
  def extractCodeSystem(t: TerminologyCapabilities): LitSeq[TerminologyCapabilities.CodeSystem] = t.codeSystem
  override val thisName: String = "TerminologyCapabilities"
  override val searchParams: Map[String, TerminologyCapabilities => Seq[Any]] = Map(
    "jurisdiction"          -> (obj => obj.jurisdiction.toSeq),
    "name"                  -> (obj => obj.name.toSeq),
    "context-type-quantity" -> (obj => obj.useContext.toSeq),
    "url"                   -> (obj => obj.url.toSeq),
    "description"           -> (obj => obj.description.toSeq),
    "context"               -> (obj => obj.useContext.map(_.value).flatMap(_.as[CodeableConcept]).toSeq),
    "date"                  -> (obj => Seq(obj.date)),
    "context-type"          -> (obj => obj.useContext.map(_.code).toSeq),
    "context-type-value"    -> (obj => obj.useContext.toSeq),
    "version"               -> (obj => obj.version.toSeq),
    "status"                -> (obj => Seq(obj.status)),
    "publisher"             -> (obj => obj.publisher.toSeq),
    "title"                 -> (obj => obj.title.toSeq),
    "context-quantity" -> (obj =>
      obj.useContext.map(_.value).flatMap(_.as[Quantity]).toSeq ++
        obj.useContext.map(_.value).flatMap(_.as[Range]).toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[TerminologyCapabilities] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new TerminologyCapabilities(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[UriStr]]("url", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[String]]("name", Some(None)),
          cursor.decodeAs[FHIRDateTime]("date", None),
          cursor.decodeAs[CAPABILITY_STATEMENT_KIND]("kind", None),
          cursor.decodeAs[Option[String]]("title", Some(None)),
          cursor.decodeAs[PUBLICATION_STATUS]("status", None),
          cursor.decodeAs[Option[String]]("version", Some(None)),
          cursor.decodeAs[LitSeq[ContactDetail]]("contact", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Markdown]]("purpose", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("publisher", Some(None)),
          cursor.decodeAs[Option[Markdown]]("copyright", Some(None)),
          cursor.decodeAs[LitSeq[UsageContext]]("useContext", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Boolean]]("lockedDate", Some(None)),
          cursor.decodeAs[Option[CODE_SEARCH_SUPPORT]]("codeSearch", Some(None)),
          cursor.decodeAs[Option[Markdown]]("description", Some(None)),
          cursor.decodeAs[Option[Boolean]]("experimental", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("jurisdiction", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[TerminologyCapabilities.Closure]]("closure", Some(None)),
          cursor.decodeAs[Option[TerminologyCapabilities.Software]]("software", Some(None)),
          cursor.decodeAs[Option[TerminologyCapabilities.Translation]]("translation", Some(None)),
          cursor.decodeAs[Option[TerminologyCapabilities.ValidateCode]]("validateCode", Some(None)),
          cursor.decodeAs[Option[TerminologyCapabilities.Implementation]]("implementation", Some(None)),
          cursor.decodeAs[Option[TerminologyCapabilities.Expansion]]("expansion", Some(None)),
          cursor.decodeAs[LitSeq[TerminologyCapabilities.CodeSystem]]("codeSystem", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** A TerminologyCapabilities resource documents a set of capabilities (behaviors) of a FHIR Terminology Server that may
  * be used as a statement of actual server functionality or a statement of required or desired server implementation.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields url, name, date, kind, title, status, version, contact, purpose, publisher, copyright,
  *   useContext, lockedDate, codeSearch, description, experimental, jurisdiction, closure, software, translation,
  *   validateCode, implementation, expansion, codeSystem.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param url
  *   - An absolute URI that is used to identify this terminology capabilities when it is referenced in a specification,
  *   model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a
  *   literal address at which at which an authoritative instance of this terminology capabilities is (or will be)
  *   published. This URL can be the target of a canonical reference. It SHALL remain the same when the terminology
  *   capabilities is stored on different servers.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the
  *   content might not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of
  *   the resource to a human. The narrative need not encode all the structured data, but is required to contain
  *   sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may
  *   define what content should be represented in the narrative to ensure clinical safety.
  * @param name
  *   - A natural language name identifying the terminology capabilities. This name should be usable as an identifier
  *   for the module by machine processing applications such as code generation.
  * @param date
  *   - The date (and optionally time) when the terminology capabilities was published. The date must change when the
  *   business version changes and it must change if the status code changes. In addition, it should change when the
  *   substantive content of the terminology capabilities changes.
  * @param kind
  *   - The way that this statement is intended to be used, to describe an actual running instance of software, a
  *   particular product (kind, not instance of software) or a class of implementation (e.g. a desired purchase).
  * @param title
  *   - A short, descriptive, user-friendly title for the terminology capabilities.
  * @param status
  *   - The status of this terminology capabilities. Enables tracking the life-cycle of the content.
  * @param version
  *   - The identifier that is used to identify this version of the terminology capabilities when it is referenced in a
  *   specification, model, design or instance. This is an arbitrary value managed by the terminology capabilities
  *   author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a
  *   managed version is not available. There is also no expectation that versions can be placed in a lexicographical
  *   sequence.
  * @param contact
  *   - Contact details to assist a user in finding and communicating with the publisher.
  * @param purpose
  *   - Explanation of why this terminology capabilities is needed and why it has been designed as it has.
  * @param language
  *   - The base language in which the resource is written.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To
  *   make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and
  *   use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be
  *   met as part of the definition of the extension.
  * @param publisher
  *   - The name of the organization or individual that published the terminology capabilities.
  * @param copyright
  *   - A copyright statement relating to the terminology capabilities and/or its contents. Copyright statements are
  *   generally legal restrictions on the use and publishing of the terminology capabilities.
  * @param useContext
  *   - The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may
  *   be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...)
  *   and may be used to assist with indexing and searching for appropriate terminology capabilities instances.
  * @param lockedDate
  *   - Whether the server supports lockedDate.
  * @param codeSearch
  *   - The degree to which the server supports the code search parameter on ValueSet, if it is supported.
  * @param description
  *   - A free text natural language description of the terminology capabilities from a consumer's perspective.
  *   Typically, this is used when the capability statement describes a desired rather than an actual solution, for
  *   example as a formal expression of requirements as part of an RFP.
  * @param experimental
  *   - A Boolean value to indicate that this terminology capabilities is authored for testing purposes (or
  *   education/evaluation/marketing) and is not intended to be used for genuine usage.
  * @param jurisdiction
  *   - A legal or geographic region in which the terminology capabilities is intended to be used.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood
  *   when processing the content. Often, this is a reference to an implementation guide that defines the special rules
  *   along with other profiles etc.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and
  *   that modifies the understanding of the element that contains it and/or the understanding of the containing
  *   element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions
  *   safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though
  *   any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the
  *   definition of the extension. Applications processing a resource are required to check for modifier extensions.
  *   Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot
  *   change the meaning of modifierExtension itself).
  * @param closure
  *   - Whether the $closure operation is supported.
  * @param software
  *   - Software that is covered by this terminology capability statement. It is used when the statement describes the
  *   capabilities of a particular software version, independent of an installation.
  * @param translation
  *   - Information about the [ConceptMap/$translate](conceptmap-operation-translate.html) operation.
  * @param validateCode
  *   - Information about the [ValueSet/$validate-code](valueset-operation-validate-code.html) operation.
  * @param implementation
  *   - Identifies a specific implementation instance that is described by the terminology capability statement - i.e. a
  *   particular installation, rather than the capabilities of a software program.
  * @param expansion
  *   - Information about the [ValueSet/$expand](valueset-operation-expand.html) operation.
  * @param codeSystem
  *   - Identifies a code system that is supported by the server. If there is a no code system URL, then this declares
  *   the general assumptions a client can make about support for any CodeSystem resource.
  */
@POJOBoilerplate
class TerminologyCapabilities(
    override val id: Option[String] = None,
    val url: Option[UriStr] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val name: Option[String] = None,
    val date: FHIRDateTime,
    val kind: CAPABILITY_STATEMENT_KIND,
    val title: Option[String] = None,
    val status: PUBLICATION_STATUS,
    val version: Option[String] = None,
    val contact: LitSeq[ContactDetail] = LitSeq.empty,
    val purpose: Option[Markdown] = None,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val publisher: Option[String] = None,
    val copyright: Option[Markdown] = None,
    val useContext: LitSeq[UsageContext] = LitSeq.empty,
    val lockedDate: Option[Boolean] = None,
    val codeSearch: Option[CODE_SEARCH_SUPPORT] = None,
    val description: Option[Markdown] = None,
    val experimental: Option[Boolean] = None,
    val jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val closure: Option[TerminologyCapabilities.Closure] = None,
    val software: Option[TerminologyCapabilities.Software] = None,
    val translation: Option[TerminologyCapabilities.Translation] = None,
    val validateCode: Option[TerminologyCapabilities.ValidateCode] = None,
    val implementation: Option[TerminologyCapabilities.Implementation] = None,
    val expansion: Option[TerminologyCapabilities.Expansion] = None,
    val codeSystem: LitSeq[TerminologyCapabilities.CodeSystem] = LitSeq.empty,
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
  override val thisTypeName: String = "TerminologyCapabilities"
}
