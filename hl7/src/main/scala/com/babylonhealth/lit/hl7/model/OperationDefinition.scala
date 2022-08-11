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
import com.babylonhealth.lit.hl7.{ RESOURCE_TYPES, SEARCH_PARAM_TYPE, BINDING_STRENGTH, OPERATION_KIND, PUBLICATION_STATUS }
import com.babylonhealth.lit.core.{ LANGUAGES, OPERATION_PARAMETER_USE, ALL_TYPES }
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object OperationDefinition extends CompanionFor[OperationDefinition] {
  implicit def summonObjectAndCompanionOperationDefinition1919343621(
      o: OperationDefinition): ObjectAndCompanion[OperationDefinition, OperationDefinition.type] = ObjectAndCompanion(o, this)
  override type ResourceType = OperationDefinition
  override type ParentType   = OperationDefinition
  override val baseType: CompanionFor[ResourceType] = OperationDefinition
  override val parentType: CompanionFor[ParentType] = OperationDefinition
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/OperationDefinition")
  object Parameter extends CompanionFor[Parameter] {
    implicit def summonObjectAndCompanionParameter13546484(o: Parameter): ObjectAndCompanion[Parameter, Parameter.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Parameter
    override type ParentType   = Parameter
    override val parentType: CompanionFor[ResourceType] = Parameter
    object Binding extends CompanionFor[Binding] {
      implicit def summonObjectAndCompanionBinding1481179404(o: Binding): ObjectAndCompanion[Binding, Binding.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Binding
      override type ParentType   = Binding
      override val parentType: CompanionFor[ResourceType] = Binding
      def apply(
          id: Option[String] = None,
          strength: BINDING_STRENGTH,
          valueSet: Canonical,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Binding = new Binding(
        id,
        strength,
        valueSet,
        extension,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(o: Binding): Option[(Option[String], BINDING_STRENGTH, Canonical, LitSeq[Extension], LitSeq[Extension])] = Some(
        (o.id, o.strength, o.valueSet, o.extension, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val strength: FHIRComponentFieldMeta[BINDING_STRENGTH] =
        FHIRComponentFieldMeta("strength", lTagOf[BINDING_STRENGTH], false, lTagOf[BINDING_STRENGTH])
      val valueSet: FHIRComponentFieldMeta[Canonical] =
        FHIRComponentFieldMeta("valueSet", lTagOf[Canonical], false, lTagOf[Canonical])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, strength, valueSet, extension, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Binding): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[BINDING_STRENGTH](strength, t.strength),
        FHIRComponentField[Canonical](valueSet, t.valueSet),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Binding] = this
      val thisName: String                = "Binding"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Binding] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Binding(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[BINDING_STRENGTH]("strength", None),
              cursor.decodeAs[Canonical]("valueSet", None),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Binding(
        override val id: Option[String] = None,
        val strength: BINDING_STRENGTH,
        val valueSet: Canonical,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object ReferencedFrom extends CompanionFor[ReferencedFrom] {
      implicit def summonObjectAndCompanionReferencedFrom1481179404(
          o: ReferencedFrom): ObjectAndCompanion[ReferencedFrom, ReferencedFrom.type] = ObjectAndCompanion(o, this)
      override type ResourceType = ReferencedFrom
      override type ParentType   = ReferencedFrom
      override val parentType: CompanionFor[ResourceType] = ReferencedFrom
      def apply(
          id: Option[String] = None,
          source: String,
          sourceId: Option[String] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): ReferencedFrom = new ReferencedFrom(
        id,
        source,
        sourceId,
        extension,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(o: ReferencedFrom): Option[(Option[String], String, Option[String], LitSeq[Extension], LitSeq[Extension])] =
        Some((o.id, o.source, o.sourceId, o.extension, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val source: FHIRComponentFieldMeta[String] =
        FHIRComponentFieldMeta("source", lTagOf[String], false, lTagOf[String])
      val sourceId: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("sourceId", lTagOf[Option[String]], false, lTagOf[String])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, source, sourceId, extension, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: ReferencedFrom): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[String](source, t.source),
        FHIRComponentField[Option[String]](sourceId, t.sourceId),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[ReferencedFrom] = this
      val thisName: String                       = "ReferencedFrom"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ReferencedFrom] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new ReferencedFrom(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[String]("source", None),
              cursor.decodeAs[Option[String]]("sourceId", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class ReferencedFrom(
        override val id: Option[String] = None,
        val source: String,
        val sourceId: Option[String] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        use: OPERATION_PARAMETER_USE,
        min: Int,
        max: String,
        name: Code,
        `type`: Option[ALL_TYPES] = None,
        part: LitSeq[OperationDefinition.Parameter] = LitSeq.empty,
        extension: LitSeq[Extension] = LitSeq.empty,
        searchType: Option[SEARCH_PARAM_TYPE] = None,
        documentation: Option[String] = None,
        targetProfile: LitSeq[Canonical] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        binding: Option[Parameter.Binding] = None,
        referencedFrom: LitSeq[Parameter.ReferencedFrom] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Parameter = new Parameter(
      id,
      use,
      min,
      max,
      name,
      `type`,
      part,
      extension,
      searchType,
      documentation,
      targetProfile,
      modifierExtension,
      binding,
      referencedFrom,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Parameter): Option[(Option[String], OPERATION_PARAMETER_USE, Int, String, Code, Option[ALL_TYPES], LitSeq[OperationDefinition.Parameter], LitSeq[Extension], Option[SEARCH_PARAM_TYPE], Option[String], LitSeq[Canonical], LitSeq[Extension], Option[Parameter.Binding], LitSeq[Parameter.ReferencedFrom])] =
      Some(
        (
          o.id,
          o.use,
          o.min,
          o.max,
          o.name,
          o.`type`,
          o.part,
          o.extension,
          o.searchType,
          o.documentation,
          o.targetProfile,
          o.modifierExtension,
          o.binding,
          o.referencedFrom))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val use: FHIRComponentFieldMeta[OPERATION_PARAMETER_USE] =
      FHIRComponentFieldMeta("use", lTagOf[OPERATION_PARAMETER_USE], false, lTagOf[OPERATION_PARAMETER_USE])
    val min: FHIRComponentFieldMeta[Int] =
      FHIRComponentFieldMeta("min", lTagOf[Int], false, lTagOf[Int])
    val max: FHIRComponentFieldMeta[String] =
      FHIRComponentFieldMeta("max", lTagOf[String], false, lTagOf[String])
    val name: FHIRComponentFieldMeta[Code] =
      FHIRComponentFieldMeta("name", lTagOf[Code], false, lTagOf[Code])
    val `type`: FHIRComponentFieldMeta[Option[ALL_TYPES]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[ALL_TYPES]], false, lTagOf[ALL_TYPES])
    val part: FHIRComponentFieldMeta[LitSeq[OperationDefinition.Parameter]] =
      FHIRComponentFieldMeta("part", lTagOf[LitSeq[OperationDefinition.Parameter]], false, lTagOf[OperationDefinition.Parameter])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val searchType: FHIRComponentFieldMeta[Option[SEARCH_PARAM_TYPE]] =
      FHIRComponentFieldMeta("searchType", lTagOf[Option[SEARCH_PARAM_TYPE]], false, lTagOf[SEARCH_PARAM_TYPE])
    val documentation: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("documentation", lTagOf[Option[String]], false, lTagOf[String])
    val targetProfile: FHIRComponentFieldMeta[LitSeq[Canonical]] =
      FHIRComponentFieldMeta("targetProfile", lTagOf[LitSeq[Canonical]], false, lTagOf[Canonical])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val binding: FHIRComponentFieldMeta[Option[Parameter.Binding]] =
      FHIRComponentFieldMeta("binding", lTagOf[Option[Parameter.Binding]], false, lTagOf[Parameter.Binding])
    val referencedFrom: FHIRComponentFieldMeta[LitSeq[Parameter.ReferencedFrom]] =
      FHIRComponentFieldMeta("referencedFrom", lTagOf[LitSeq[Parameter.ReferencedFrom]], false, lTagOf[Parameter.ReferencedFrom])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
      id,
      use,
      min,
      max,
      name,
      `type`,
      part,
      extension,
      searchType,
      documentation,
      targetProfile,
      modifierExtension,
      binding,
      referencedFrom)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Parameter): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[OPERATION_PARAMETER_USE](use, t.use),
      FHIRComponentField[Int](min, t.min),
      FHIRComponentField[String](max, t.max),
      FHIRComponentField[Code](name, t.name),
      FHIRComponentField[Option[ALL_TYPES]](`type`, t.`type`),
      FHIRComponentField[LitSeq[OperationDefinition.Parameter]](part, t.part),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[SEARCH_PARAM_TYPE]](searchType, t.searchType),
      FHIRComponentField[Option[String]](documentation, t.documentation),
      FHIRComponentField[LitSeq[Canonical]](targetProfile, t.targetProfile),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[Parameter.Binding]](binding, t.binding),
      FHIRComponentField[LitSeq[Parameter.ReferencedFrom]](referencedFrom, t.referencedFrom)
    )
    val baseType: CompanionFor[Parameter] = this
    val thisName: String                  = "Parameter"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Parameter] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Parameter(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[OPERATION_PARAMETER_USE]("use", None),
            cursor.decodeAs[Int]("min", None),
            cursor.decodeAs[String]("max", None),
            cursor.decodeAs[Code]("name", None),
            cursor.decodeAs[Option[ALL_TYPES]]("type", Some(None)),
            cursor.decodeAs[LitSeq[OperationDefinition.Parameter]]("part", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[SEARCH_PARAM_TYPE]]("searchType", Some(None)),
            cursor.decodeAs[Option[String]]("documentation", Some(None)),
            cursor.decodeAs[LitSeq[Canonical]]("targetProfile", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Parameter.Binding]]("binding", Some(None)),
            cursor.decodeAs[LitSeq[Parameter.ReferencedFrom]]("referencedFrom", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Parameter(
      override val id: Option[String] = None,
      val use: OPERATION_PARAMETER_USE,
      val min: Int,
      val max: String,
      val name: Code,
      val `type`: Option[ALL_TYPES] = None,
      val part: LitSeq[OperationDefinition.Parameter] = LitSeq.empty,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val searchType: Option[SEARCH_PARAM_TYPE] = None,
      val documentation: Option[String] = None,
      val targetProfile: LitSeq[Canonical] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val binding: Option[Parameter.Binding] = None,
      val referencedFrom: LitSeq[Parameter.ReferencedFrom] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Overload extends CompanionFor[Overload] {
    implicit def summonObjectAndCompanionOverload13546484(o: Overload): ObjectAndCompanion[Overload, Overload.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Overload
    override type ParentType   = Overload
    override val parentType: CompanionFor[ResourceType] = Overload
    def apply(
        id: Option[String] = None,
        comment: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        parameterName: LitSeq[String] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Overload = new Overload(
      id,
      comment,
      extension,
      parameterName,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(o: Overload): Option[(Option[String], Option[String], LitSeq[Extension], LitSeq[String], LitSeq[Extension])] =
      Some((o.id, o.comment, o.extension, o.parameterName, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val comment: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("comment", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val parameterName: FHIRComponentFieldMeta[LitSeq[String]] =
      FHIRComponentFieldMeta("parameterName", lTagOf[LitSeq[String]], false, lTagOf[String])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, comment, extension, parameterName, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Overload): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[String]](comment, t.comment),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[String]](parameterName, t.parameterName),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Overload] = this
    val thisName: String                 = "Overload"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Overload] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Overload(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[String]]("comment", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[String]]("parameterName", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Overload(
      override val id: Option[String] = None,
      val comment: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val parameterName: LitSeq[String] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      url: Option[UriStr] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      name: String,
      kind: OPERATION_KIND,
      date: Option[FHIRDateTime] = None,
      code: Code,
      base: Option[Canonical] = None,
      `type`: Boolean,
      title: Option[String] = None,
      status: PUBLICATION_STATUS,
      system: Boolean,
      version: Option[String] = None,
      contact: LitSeq[ContactDetail] = LitSeq.empty,
      purpose: Option[Markdown] = None,
      comment: Option[Markdown] = None,
      language: Option[LANGUAGES] = None,
      resource: LitSeq[RESOURCE_TYPES] = LitSeq.empty,
      instance: Boolean,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      publisher: Option[String] = None,
      useContext: LitSeq[UsageContext] = LitSeq.empty,
      description: Option[Markdown] = None,
      experimental: Option[Boolean] = None,
      jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
      affectsState: Option[Boolean] = None,
      inputProfile: Option[Canonical] = None,
      implicitRules: Option[UriStr] = None,
      outputProfile: Option[Canonical] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      overload: LitSeq[OperationDefinition.Overload] = LitSeq.empty,
      parameter: LitSeq[OperationDefinition.Parameter] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): OperationDefinition = new OperationDefinition(
    id,
    url,
    meta,
    text,
    name,
    kind,
    date,
    code,
    base,
    `type`,
    title,
    status,
    system,
    version,
    contact,
    purpose,
    comment,
    language,
    resource,
    instance,
    contained,
    extension,
    publisher,
    useContext,
    description,
    experimental,
    jurisdiction,
    affectsState,
    inputProfile,
    implicitRules,
    outputProfile,
    modifierExtension,
    overload,
    parameter,
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
  val kind: FHIRComponentFieldMeta[OPERATION_KIND] =
    FHIRComponentFieldMeta("kind", lTagOf[OPERATION_KIND], false, lTagOf[OPERATION_KIND])
  val date: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("date", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val code: FHIRComponentFieldMeta[Code] =
    FHIRComponentFieldMeta("code", lTagOf[Code], false, lTagOf[Code])
  val base: FHIRComponentFieldMeta[Option[Canonical]] =
    FHIRComponentFieldMeta("base", lTagOf[Option[Canonical]], false, lTagOf[Canonical])
  val `type`: FHIRComponentFieldMeta[Boolean] =
    FHIRComponentFieldMeta("type", lTagOf[Boolean], false, lTagOf[Boolean])
  val title: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("title", lTagOf[Option[String]], false, lTagOf[String])
  val status: FHIRComponentFieldMeta[PUBLICATION_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[PUBLICATION_STATUS], false, lTagOf[PUBLICATION_STATUS])
  val system: FHIRComponentFieldMeta[Boolean] =
    FHIRComponentFieldMeta("system", lTagOf[Boolean], false, lTagOf[Boolean])
  val version: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("version", lTagOf[Option[String]], false, lTagOf[String])
  val contact: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("contact", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val purpose: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("purpose", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val comment: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("comment", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val resource: FHIRComponentFieldMeta[LitSeq[RESOURCE_TYPES]] =
    FHIRComponentFieldMeta("resource", lTagOf[LitSeq[RESOURCE_TYPES]], false, lTagOf[RESOURCE_TYPES])
  val instance: FHIRComponentFieldMeta[Boolean] =
    FHIRComponentFieldMeta("instance", lTagOf[Boolean], false, lTagOf[Boolean])
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
  val affectsState: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("affectsState", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val inputProfile: FHIRComponentFieldMeta[Option[Canonical]] =
    FHIRComponentFieldMeta("inputProfile", lTagOf[Option[Canonical]], false, lTagOf[Canonical])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val outputProfile: FHIRComponentFieldMeta[Option[Canonical]] =
    FHIRComponentFieldMeta("outputProfile", lTagOf[Option[Canonical]], false, lTagOf[Canonical])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val overload: FHIRComponentFieldMeta[LitSeq[OperationDefinition.Overload]] =
    FHIRComponentFieldMeta("overload", lTagOf[LitSeq[OperationDefinition.Overload]], false, lTagOf[OperationDefinition.Overload])
  val parameter: FHIRComponentFieldMeta[LitSeq[OperationDefinition.Parameter]] =
    FHIRComponentFieldMeta(
      "parameter",
      lTagOf[LitSeq[OperationDefinition.Parameter]],
      false,
      lTagOf[OperationDefinition.Parameter])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    url,
    meta,
    text,
    name,
    kind,
    date,
    code,
    base,
    `type`,
    title,
    status,
    system,
    version,
    contact,
    purpose,
    comment,
    language,
    resource,
    instance,
    contained,
    extension,
    publisher,
    useContext,
    description,
    experimental,
    jurisdiction,
    affectsState,
    inputProfile,
    implicitRules,
    outputProfile,
    modifierExtension,
    overload,
    parameter
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: OperationDefinition): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[UriStr]](url, t.url),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[String](name, t.name),
    FHIRComponentField[OPERATION_KIND](kind, t.kind),
    FHIRComponentField[Option[FHIRDateTime]](date, t.date),
    FHIRComponentField[Code](code, t.code),
    FHIRComponentField[Option[Canonical]](base, t.base),
    FHIRComponentField[Boolean](`type`, t.`type`),
    FHIRComponentField[Option[String]](title, t.title),
    FHIRComponentField[PUBLICATION_STATUS](status, t.status),
    FHIRComponentField[Boolean](system, t.system),
    FHIRComponentField[Option[String]](version, t.version),
    FHIRComponentField[LitSeq[ContactDetail]](contact, t.contact),
    FHIRComponentField[Option[Markdown]](purpose, t.purpose),
    FHIRComponentField[Option[Markdown]](comment, t.comment),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[RESOURCE_TYPES]](resource, t.resource),
    FHIRComponentField[Boolean](instance, t.instance),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[String]](publisher, t.publisher),
    FHIRComponentField[LitSeq[UsageContext]](useContext, t.useContext),
    FHIRComponentField[Option[Markdown]](description, t.description),
    FHIRComponentField[Option[Boolean]](experimental, t.experimental),
    FHIRComponentField[LitSeq[CodeableConcept]](jurisdiction, t.jurisdiction),
    FHIRComponentField[Option[Boolean]](affectsState, t.affectsState),
    FHIRComponentField[Option[Canonical]](inputProfile, t.inputProfile),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[Canonical]](outputProfile, t.outputProfile),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[OperationDefinition.Overload]](overload, t.overload),
    FHIRComponentField[LitSeq[OperationDefinition.Parameter]](parameter, t.parameter)
  )
  def extractId(t: OperationDefinition): Option[String]                               = t.id
  def extractUrl(t: OperationDefinition): Option[UriStr]                              = t.url
  def extractMeta(t: OperationDefinition): Option[Meta]                               = t.meta
  def extractText(t: OperationDefinition): Option[Narrative]                          = t.text
  def extractName(t: OperationDefinition): String                                     = t.name
  def extractKind(t: OperationDefinition): OPERATION_KIND                             = t.kind
  def extractDate(t: OperationDefinition): Option[FHIRDateTime]                       = t.date
  def extractCode(t: OperationDefinition): Code                                       = t.code
  def extractBase(t: OperationDefinition): Option[Canonical]                          = t.base
  def extractType(t: OperationDefinition): Boolean                                    = t.`type`
  def extractTitle(t: OperationDefinition): Option[String]                            = t.title
  def extractStatus(t: OperationDefinition): PUBLICATION_STATUS                       = t.status
  def extractSystem(t: OperationDefinition): Boolean                                  = t.system
  def extractVersion(t: OperationDefinition): Option[String]                          = t.version
  def extractContact(t: OperationDefinition): LitSeq[ContactDetail]                   = t.contact
  def extractPurpose(t: OperationDefinition): Option[Markdown]                        = t.purpose
  def extractComment(t: OperationDefinition): Option[Markdown]                        = t.comment
  def extractLanguage(t: OperationDefinition): Option[LANGUAGES]                      = t.language
  def extractResource(t: OperationDefinition): LitSeq[RESOURCE_TYPES]                 = t.resource
  def extractInstance(t: OperationDefinition): Boolean                                = t.instance
  def extractContained(t: OperationDefinition): LitSeq[Resource]                      = t.contained
  def extractExtension(t: OperationDefinition): LitSeq[Extension]                     = t.extension
  def extractPublisher(t: OperationDefinition): Option[String]                        = t.publisher
  def extractUseContext(t: OperationDefinition): LitSeq[UsageContext]                 = t.useContext
  def extractDescription(t: OperationDefinition): Option[Markdown]                    = t.description
  def extractExperimental(t: OperationDefinition): Option[Boolean]                    = t.experimental
  def extractJurisdiction(t: OperationDefinition): LitSeq[CodeableConcept]            = t.jurisdiction
  def extractAffectsState(t: OperationDefinition): Option[Boolean]                    = t.affectsState
  def extractInputProfile(t: OperationDefinition): Option[Canonical]                  = t.inputProfile
  def extractImplicitRules(t: OperationDefinition): Option[UriStr]                    = t.implicitRules
  def extractOutputProfile(t: OperationDefinition): Option[Canonical]                 = t.outputProfile
  def extractModifierExtension(t: OperationDefinition): LitSeq[Extension]             = t.modifierExtension
  def extractOverload(t: OperationDefinition): LitSeq[OperationDefinition.Overload]   = t.overload
  def extractParameter(t: OperationDefinition): LitSeq[OperationDefinition.Parameter] = t.parameter
  override val thisName: String                                                       = "OperationDefinition"
  override val searchParams: Map[String, OperationDefinition => Seq[Any]] = Map(
    "jurisdiction"          -> (obj => obj.jurisdiction.toSeq),
    "output-profile"        -> (obj => obj.outputProfile.toSeq),
    "name"                  -> (obj => Seq(obj.name)),
    "context-type-quantity" -> (obj => obj.useContext.toSeq),
    "system"                -> (obj => Seq(obj.system)),
    "description"           -> (obj => obj.description.toSeq),
    "context"               -> (obj => obj.useContext.map(_.value).flatMap(_.as[CodeableConcept]).toSeq),
    "instance"              -> (obj => Seq(obj.instance)),
    "date"                  -> (obj => obj.date.toSeq),
    "context-type"          -> (obj => obj.useContext.map(_.code).toSeq),
    "input-profile"         -> (obj => obj.inputProfile.toSeq),
    "url"                   -> (obj => obj.url.toSeq),
    "base"                  -> (obj => obj.base.toSeq),
    "code"                  -> (obj => Seq(obj.code)),
    "context-type-value"    -> (obj => obj.useContext.toSeq),
    "version"               -> (obj => obj.version.toSeq),
    "status"                -> (obj => Seq(obj.status)),
    "publisher"             -> (obj => obj.publisher.toSeq),
    "kind"                  -> (obj => Seq(obj.kind)),
    "title"                 -> (obj => obj.title.toSeq),
    "context-quantity" -> (obj =>
      obj.useContext.map(_.value).flatMap(_.as[Quantity]).toSeq ++
        obj.useContext.map(_.value).flatMap(_.as[Range]).toSeq),
    "type" -> (obj => Seq(obj.`type`))
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[OperationDefinition] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new OperationDefinition(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[UriStr]]("url", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[String]("name", None),
          cursor.decodeAs[OPERATION_KIND]("kind", None),
          cursor.decodeAs[Option[FHIRDateTime]]("date", Some(None)),
          cursor.decodeAs[Code]("code", None),
          cursor.decodeAs[Option[Canonical]]("base", Some(None)),
          cursor.decodeAs[Boolean]("type", None),
          cursor.decodeAs[Option[String]]("title", Some(None)),
          cursor.decodeAs[PUBLICATION_STATUS]("status", None),
          cursor.decodeAs[Boolean]("system", None),
          cursor.decodeAs[Option[String]]("version", Some(None)),
          cursor.decodeAs[LitSeq[ContactDetail]]("contact", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Markdown]]("purpose", Some(None)),
          cursor.decodeAs[Option[Markdown]]("comment", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[RESOURCE_TYPES]]("resource", Some(LitSeq.empty)),
          cursor.decodeAs[Boolean]("instance", None),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("publisher", Some(None)),
          cursor.decodeAs[LitSeq[UsageContext]]("useContext", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Markdown]]("description", Some(None)),
          cursor.decodeAs[Option[Boolean]]("experimental", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("jurisdiction", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Boolean]]("affectsState", Some(None)),
          cursor.decodeAs[Option[Canonical]]("inputProfile", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[Canonical]]("outputProfile", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[OperationDefinition.Overload]]("overload", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[OperationDefinition.Parameter]]("parameter", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields url, name, kind, date, code, base, `type`, title, status, system, version, contact, purpose, comment,
  *   resource, instance, publisher, useContext, description, experimental, jurisdiction, affectsState, inputProfile,
  *   outputProfile, overload, parameter.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param url
  *   - An absolute URI that is used to identify this operation definition when it is referenced in a specification, model, design
  *     or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at
  *     which at which an authoritative instance of this operation definition is (or will be) published. This URL can be the
  *     target of a canonical reference. It SHALL remain the same when the operation definition is stored on different servers.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *     not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *     resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail
  *     to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should
  *     be represented in the narrative to ensure clinical safety.
  * @param name
  *   - A natural language name identifying the operation definition. This name should be usable as an identifier for the module
  *     by machine processing applications such as code generation.
  * @param kind
  *   - Whether this is an operation or a named query.
  * @param date
  *   - The date (and optionally time) when the operation definition was published. The date must change when the business version
  *     changes and it must change if the status code changes. In addition, it should change when the substantive content of the
  *     operation definition changes.
  * @param code
  *   - The name used to invoke the operation.
  * @param base
  *   - Indicates that this operation definition is a constraining profile on the base.
  * @param `type`
  *   - Indicates whether this operation or named query can be invoked at the resource type level for any given resource type
  *     level (e.g. without needing to choose a specific resource id for the context).
  * @param title
  *   - A short, descriptive, user-friendly title for the operation definition.
  * @param status
  *   - The status of this operation definition. Enables tracking the life-cycle of the content.
  * @param system
  *   - Indicates whether this operation or named query can be invoked at the system level (e.g. without needing to choose a
  *     resource type for the context).
  * @param version
  *   - The identifier that is used to identify this version of the operation definition when it is referenced in a specification,
  *     model, design or instance. This is an arbitrary value managed by the operation definition author and is not expected to be
  *     globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also
  *     no expectation that versions can be placed in a lexicographical sequence.
  * @param contact
  *   - Contact details to assist a user in finding and communicating with the publisher.
  * @param purpose
  *   - Explanation of why this operation definition is needed and why it has been designed as it has.
  * @param comment
  *   - Additional information about how to use this operation or named query.
  * @param language
  *   - The base language in which the resource is written.
  * @param resource
  *   - The types on which this operation can be executed.
  * @param instance
  *   - Indicates whether this operation can be invoked on a particular instance of one of the given types.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *     identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *     of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *     Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *     of the extension.
  * @param publisher
  *   - The name of the organization or individual that published the operation definition.
  * @param useContext
  *   - The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be
  *     general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be
  *     used to assist with indexing and searching for appropriate operation definition instances.
  * @param description
  *   - A free text natural language description of the operation definition from a consumer's perspective.
  * @param experimental
  *   - A Boolean value to indicate that this operation definition is authored for testing purposes (or
  *     education/evaluation/marketing) and is not intended to be used for genuine usage.
  * @param jurisdiction
  *   - A legal or geographic region in which the operation definition is intended to be used.
  * @param affectsState
  *   - Whether the operation affects state. Side effects such as producing audit trail entries do not count as 'affecting state'.
  * @param inputProfile
  *   - Additional validation information for the in parameters - a single profile that covers all the parameters. The profile is
  *     a constraint on the parameters resource as a whole.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *     processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *     other profiles etc.
  * @param outputProfile
  *   - Additional validation information for the out parameters - a single profile that covers all the parameters. The profile is
  *     a constraint on the parameters resource.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *     the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *     Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *     strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *     extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *     processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of
  *     any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param overload
  *   - Defines an appropriate combination of parameters to use when invoking this operation, to help code generators when
  *     generating overloaded parameter sets for this operation.
  * @param parameter
  *   - The parameters for the operation/query.
  */
@POJOBoilerplate
class OperationDefinition(
    override val id: Option[String] = None,
    val url: Option[UriStr] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val name: String,
    val kind: OPERATION_KIND,
    val date: Option[FHIRDateTime] = None,
    val code: Code,
    val base: Option[Canonical] = None,
    val `type`: Boolean,
    val title: Option[String] = None,
    val status: PUBLICATION_STATUS,
    val system: Boolean,
    val version: Option[String] = None,
    val contact: LitSeq[ContactDetail] = LitSeq.empty,
    val purpose: Option[Markdown] = None,
    val comment: Option[Markdown] = None,
    override val language: Option[LANGUAGES] = None,
    val resource: LitSeq[RESOURCE_TYPES] = LitSeq.empty,
    val instance: Boolean,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val publisher: Option[String] = None,
    val useContext: LitSeq[UsageContext] = LitSeq.empty,
    val description: Option[Markdown] = None,
    val experimental: Option[Boolean] = None,
    val jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
    val affectsState: Option[Boolean] = None,
    val inputProfile: Option[Canonical] = None,
    override val implicitRules: Option[UriStr] = None,
    val outputProfile: Option[Canonical] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val overload: LitSeq[OperationDefinition.Overload] = LitSeq.empty,
    val parameter: LitSeq[OperationDefinition.Parameter] = LitSeq.empty,
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
  override val thisTypeName: String = "OperationDefinition"
}
