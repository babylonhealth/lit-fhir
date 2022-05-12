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
  CONSTRAINT_SEVERITY,
  REFERENCE_VERSION_RULES,
  BINDING_STRENGTH,
  PROPERTY_REPRESENTATION,
  DISCRIMINATOR_TYPE,
  RESOURCE_SLICING_RULES,
  RESOURCE_AGGREGATION_MODE
}
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object ElementDefinition extends CompanionFor[ElementDefinition] {
  implicit def summonObjectAndCompanionElementDefinition2010344986(
      o: ElementDefinition): ObjectAndCompanion[ElementDefinition, ElementDefinition.type] = ObjectAndCompanion(o, this)
  override type ResourceType = ElementDefinition
  override type ParentType   = ElementDefinition
  override val baseType: CompanionFor[ResourceType] = ElementDefinition
  override val parentType: CompanionFor[ParentType] = ElementDefinition
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/ElementDefinition")
  object Slicing extends CompanionFor[Slicing] {
    implicit def summonObjectAndCompanionSlicing1084869278(o: Slicing): ObjectAndCompanion[Slicing, Slicing.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Slicing
    override type ParentType   = Slicing
    override val parentType: CompanionFor[ResourceType] = Slicing
    object Discriminator extends CompanionFor[Discriminator] {
      implicit def summonObjectAndCompanionDiscriminator1780650157(
          o: Discriminator): ObjectAndCompanion[Discriminator, Discriminator.type] = ObjectAndCompanion(o, this)
      override type ResourceType = Discriminator
      override type ParentType   = Discriminator
      override val parentType: CompanionFor[ResourceType] = Discriminator
      def apply(
          id: Option[String] = None,
          `type`: DISCRIMINATOR_TYPE,
          path: String,
          extension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Discriminator = new Discriminator(
        id,
        `type`,
        path,
        extension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(o: Discriminator): Option[(Option[String], DISCRIMINATOR_TYPE, String, LitSeq[Extension])] = Some(
        (o.id, o.`type`, o.path, o.extension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val `type`: FHIRComponentFieldMeta[DISCRIMINATOR_TYPE] =
        FHIRComponentFieldMeta("type", lTagOf[DISCRIMINATOR_TYPE], false, lTagOf[DISCRIMINATOR_TYPE])
      val path: FHIRComponentFieldMeta[String] =
        FHIRComponentFieldMeta("path", lTagOf[String], false, lTagOf[String])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, `type`, path, extension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Discriminator): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[DISCRIMINATOR_TYPE](`type`, t.`type`),
        FHIRComponentField[String](path, t.path),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension)
      )
      val baseType: CompanionFor[Discriminator] = this
      val thisName: String                      = "Discriminator"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Discriminator] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Discriminator(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[DISCRIMINATOR_TYPE]("type", None),
              cursor.decodeAs[String]("path", None),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Discriminator(
        override val id: Option[String] = None,
        val `type`: DISCRIMINATOR_TYPE,
        val path: String,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends Element(id = id, extension = extension)
    def apply(
        id: Option[String] = None,
        rules: RESOURCE_SLICING_RULES,
        ordered: Option[Boolean] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        description: Option[String] = None,
        discriminator: LitSeq[Slicing.Discriminator] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Slicing = new Slicing(
      id,
      rules,
      ordered,
      extension,
      description,
      discriminator,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Slicing): Option[(Option[String], RESOURCE_SLICING_RULES, Option[Boolean], LitSeq[Extension], Option[String], LitSeq[Slicing.Discriminator])] =
      Some((o.id, o.rules, o.ordered, o.extension, o.description, o.discriminator))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val rules: FHIRComponentFieldMeta[RESOURCE_SLICING_RULES] =
      FHIRComponentFieldMeta("rules", lTagOf[RESOURCE_SLICING_RULES], false, lTagOf[RESOURCE_SLICING_RULES])
    val ordered: FHIRComponentFieldMeta[Option[Boolean]] =
      FHIRComponentFieldMeta("ordered", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val description: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
    val discriminator: FHIRComponentFieldMeta[LitSeq[Slicing.Discriminator]] =
      FHIRComponentFieldMeta("discriminator", lTagOf[LitSeq[Slicing.Discriminator]], false, lTagOf[Slicing.Discriminator])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, rules, ordered, extension, description, discriminator)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Slicing): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[RESOURCE_SLICING_RULES](rules, t.rules),
      FHIRComponentField[Option[Boolean]](ordered, t.ordered),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[String]](description, t.description),
      FHIRComponentField[LitSeq[Slicing.Discriminator]](discriminator, t.discriminator)
    )
    val baseType: CompanionFor[Slicing] = this
    val thisName: String                = "Slicing"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Slicing] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Slicing(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[RESOURCE_SLICING_RULES]("rules", None),
            cursor.decodeAs[Option[Boolean]]("ordered", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("description", Some(None)),
            cursor.decodeAs[LitSeq[Slicing.Discriminator]]("discriminator", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Slicing(
      override val id: Option[String] = None,
      val rules: RESOURCE_SLICING_RULES,
      val ordered: Option[Boolean] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val description: Option[String] = None,
      val discriminator: LitSeq[Slicing.Discriminator] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends Element(id = id, extension = extension)
  object Constraint extends CompanionFor[Constraint] {
    implicit def summonObjectAndCompanionConstraint1084869278(o: Constraint): ObjectAndCompanion[Constraint, Constraint.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Constraint
    override type ParentType   = Constraint
    override val parentType: CompanionFor[ResourceType] = Constraint
    def apply(
        id: Option[String] = None,
        key: Id,
        human: String,
        xpath: Option[String] = None,
        source: Option[Canonical] = None,
        severity: CONSTRAINT_SEVERITY,
        extension: LitSeq[Extension] = LitSeq.empty,
        expression: Option[String] = None,
        requirements: Option[String] = None,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Constraint = new Constraint(
      id,
      key,
      human,
      xpath,
      source,
      severity,
      extension,
      expression,
      requirements,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Constraint): Option[(Option[String], Id, String, Option[String], Option[Canonical], CONSTRAINT_SEVERITY, LitSeq[Extension], Option[String], Option[String])] =
      Some((o.id, o.key, o.human, o.xpath, o.source, o.severity, o.extension, o.expression, o.requirements))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val key: FHIRComponentFieldMeta[Id] =
      FHIRComponentFieldMeta("key", lTagOf[Id], false, lTagOf[Id])
    val human: FHIRComponentFieldMeta[String] =
      FHIRComponentFieldMeta("human", lTagOf[String], false, lTagOf[String])
    val xpath: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("xpath", lTagOf[Option[String]], false, lTagOf[String])
    val source: FHIRComponentFieldMeta[Option[Canonical]] =
      FHIRComponentFieldMeta("source", lTagOf[Option[Canonical]], false, lTagOf[Canonical])
    val severity: FHIRComponentFieldMeta[CONSTRAINT_SEVERITY] =
      FHIRComponentFieldMeta("severity", lTagOf[CONSTRAINT_SEVERITY], false, lTagOf[CONSTRAINT_SEVERITY])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val expression: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("expression", lTagOf[Option[String]], false, lTagOf[String])
    val requirements: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("requirements", lTagOf[Option[String]], false, lTagOf[String])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, key, human, xpath, source, severity, extension, expression, requirements)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Constraint): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Id](key, t.key),
      FHIRComponentField[String](human, t.human),
      FHIRComponentField[Option[String]](xpath, t.xpath),
      FHIRComponentField[Option[Canonical]](source, t.source),
      FHIRComponentField[CONSTRAINT_SEVERITY](severity, t.severity),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[String]](expression, t.expression),
      FHIRComponentField[Option[String]](requirements, t.requirements)
    )
    val baseType: CompanionFor[Constraint] = this
    val thisName: String                   = "Constraint"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Constraint] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Constraint(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Id]("key", None),
            cursor.decodeAs[String]("human", None),
            cursor.decodeAs[Option[String]]("xpath", Some(None)),
            cursor.decodeAs[Option[Canonical]]("source", Some(None)),
            cursor.decodeAs[CONSTRAINT_SEVERITY]("severity", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("expression", Some(None)),
            cursor.decodeAs[Option[String]]("requirements", Some(None)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Constraint(
      override val id: Option[String] = None,
      val key: Id,
      val human: String,
      val xpath: Option[String] = None,
      val source: Option[Canonical] = None,
      val severity: CONSTRAINT_SEVERITY,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val expression: Option[String] = None,
      val requirements: Option[String] = None,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends Element(id = id, extension = extension)
  object Binding extends CompanionFor[Binding] {
    implicit def summonObjectAndCompanionBinding1084869278(o: Binding): ObjectAndCompanion[Binding, Binding.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Binding
    override type ParentType   = Binding
    override val parentType: CompanionFor[ResourceType] = Binding
    def apply(
        id: Option[String] = None,
        strength: BINDING_STRENGTH,
        valueSet: Option[Canonical] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        description: Option[String] = None,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Binding = new Binding(
      id,
      strength,
      valueSet,
      extension,
      description,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(o: Binding): Option[(Option[String], BINDING_STRENGTH, Option[Canonical], LitSeq[Extension], Option[String])] =
      Some((o.id, o.strength, o.valueSet, o.extension, o.description))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val strength: FHIRComponentFieldMeta[BINDING_STRENGTH] =
      FHIRComponentFieldMeta("strength", lTagOf[BINDING_STRENGTH], false, lTagOf[BINDING_STRENGTH])
    val valueSet: FHIRComponentFieldMeta[Option[Canonical]] =
      FHIRComponentFieldMeta("valueSet", lTagOf[Option[Canonical]], false, lTagOf[Canonical])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val description: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, strength, valueSet, extension, description)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Binding): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[BINDING_STRENGTH](strength, t.strength),
      FHIRComponentField[Option[Canonical]](valueSet, t.valueSet),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[String]](description, t.description)
    )
    val baseType: CompanionFor[Binding] = this
    val thisName: String                = "Binding"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Binding] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Binding(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[BINDING_STRENGTH]("strength", None),
            cursor.decodeAs[Option[Canonical]]("valueSet", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("description", Some(None)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Binding(
      override val id: Option[String] = None,
      val strength: BINDING_STRENGTH,
      val valueSet: Option[Canonical] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val description: Option[String] = None,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends Element(id = id, extension = extension)
  object Type extends CompanionFor[Type] {
    implicit def summonObjectAndCompanionType1084869278(o: Type): ObjectAndCompanion[Type, Type.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Type
    override type ParentType   = Type
    override val parentType: CompanionFor[ResourceType] = Type
    def apply(
        id: Option[String] = None,
        code: UriStr,
        profile: LitSeq[Canonical] = LitSeq.empty,
        extension: LitSeq[Extension] = LitSeq.empty,
        versioning: Option[REFERENCE_VERSION_RULES] = None,
        aggregation: LitSeq[RESOURCE_AGGREGATION_MODE] = LitSeq.empty,
        targetProfile: LitSeq[Canonical] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Type = new Type(
      id,
      code,
      profile,
      extension,
      versioning,
      aggregation,
      targetProfile,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Type): Option[(Option[String], UriStr, LitSeq[Canonical], LitSeq[Extension], Option[REFERENCE_VERSION_RULES], LitSeq[RESOURCE_AGGREGATION_MODE], LitSeq[Canonical])] =
      Some((o.id, o.code, o.profile, o.extension, o.versioning, o.aggregation, o.targetProfile))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val code: FHIRComponentFieldMeta[UriStr] =
      FHIRComponentFieldMeta("code", lTagOf[UriStr], false, lTagOf[UriStr])
    val profile: FHIRComponentFieldMeta[LitSeq[Canonical]] =
      FHIRComponentFieldMeta("profile", lTagOf[LitSeq[Canonical]], false, lTagOf[Canonical])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val versioning: FHIRComponentFieldMeta[Option[REFERENCE_VERSION_RULES]] =
      FHIRComponentFieldMeta("versioning", lTagOf[Option[REFERENCE_VERSION_RULES]], false, lTagOf[REFERENCE_VERSION_RULES])
    val aggregation: FHIRComponentFieldMeta[LitSeq[RESOURCE_AGGREGATION_MODE]] =
      FHIRComponentFieldMeta("aggregation", lTagOf[LitSeq[RESOURCE_AGGREGATION_MODE]], false, lTagOf[RESOURCE_AGGREGATION_MODE])
    val targetProfile: FHIRComponentFieldMeta[LitSeq[Canonical]] =
      FHIRComponentFieldMeta("targetProfile", lTagOf[LitSeq[Canonical]], false, lTagOf[Canonical])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, code, profile, extension, versioning, aggregation, targetProfile)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Type): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[UriStr](code, t.code),
      FHIRComponentField[LitSeq[Canonical]](profile, t.profile),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[REFERENCE_VERSION_RULES]](versioning, t.versioning),
      FHIRComponentField[LitSeq[RESOURCE_AGGREGATION_MODE]](aggregation, t.aggregation),
      FHIRComponentField[LitSeq[Canonical]](targetProfile, t.targetProfile)
    )
    val baseType: CompanionFor[Type] = this
    val thisName: String             = "Type"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Type] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Type(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[UriStr]("code", None),
            cursor.decodeAs[LitSeq[Canonical]]("profile", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[REFERENCE_VERSION_RULES]]("versioning", Some(None)),
            cursor.decodeAs[LitSeq[RESOURCE_AGGREGATION_MODE]]("aggregation", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Canonical]]("targetProfile", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Type(
      override val id: Option[String] = None,
      val code: UriStr,
      val profile: LitSeq[Canonical] = LitSeq.empty,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val versioning: Option[REFERENCE_VERSION_RULES] = None,
      val aggregation: LitSeq[RESOURCE_AGGREGATION_MODE] = LitSeq.empty,
      val targetProfile: LitSeq[Canonical] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends Element(id = id, extension = extension)
  object Mapping extends CompanionFor[Mapping] {
    implicit def summonObjectAndCompanionMapping1084869278(o: Mapping): ObjectAndCompanion[Mapping, Mapping.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Mapping
    override type ParentType   = Mapping
    override val parentType: CompanionFor[ResourceType] = Mapping
    def apply(
        id: Option[String] = None,
        map: String,
        comment: Option[String] = None,
        identity: Id,
        language: Option[Code] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Mapping = new Mapping(
      id,
      map,
      comment,
      identity,
      language,
      extension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(o: Mapping): Option[(Option[String], String, Option[String], Id, Option[Code], LitSeq[Extension])] = Some(
      (o.id, o.map, o.comment, o.identity, o.language, o.extension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val map: FHIRComponentFieldMeta[String] =
      FHIRComponentFieldMeta("map", lTagOf[String], false, lTagOf[String])
    val comment: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("comment", lTagOf[Option[String]], false, lTagOf[String])
    val identity: FHIRComponentFieldMeta[Id] =
      FHIRComponentFieldMeta("identity", lTagOf[Id], false, lTagOf[Id])
    val language: FHIRComponentFieldMeta[Option[Code]] =
      FHIRComponentFieldMeta("language", lTagOf[Option[Code]], false, lTagOf[Code])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, map, comment, identity, language, extension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Mapping): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[String](map, t.map),
      FHIRComponentField[Option[String]](comment, t.comment),
      FHIRComponentField[Id](identity, t.identity),
      FHIRComponentField[Option[Code]](language, t.language),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension)
    )
    val baseType: CompanionFor[Mapping] = this
    val thisName: String                = "Mapping"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Mapping] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Mapping(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[String]("map", None),
            cursor.decodeAs[Option[String]]("comment", Some(None)),
            cursor.decodeAs[Id]("identity", None),
            cursor.decodeAs[Option[Code]]("language", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Mapping(
      override val id: Option[String] = None,
      val map: String,
      val comment: Option[String] = None,
      val identity: Id,
      val language: Option[Code] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends Element(id = id, extension = extension)
  object Example extends CompanionFor[Example] {
    implicit def summonObjectAndCompanionExample1084869278(o: Example): ObjectAndCompanion[Example, Example.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Example
    override type ParentType   = Example
    override val parentType: CompanionFor[ResourceType] = Example
    type ValueChoice = Choice[UnionAll]
    def apply(
        id: Option[String] = None,
        label: String,
        value: Example.ValueChoice,
        extension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Example = new Example(
      id,
      label,
      value,
      extension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(o: Example): Option[(Option[String], String, Example.ValueChoice, LitSeq[Extension])] = Some(
      (o.id, o.label, o.value, o.extension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val label: FHIRComponentFieldMeta[String] =
      FHIRComponentFieldMeta("label", lTagOf[String], false, lTagOf[String])
    val value: FHIRComponentFieldMeta[Example.ValueChoice] =
      FHIRComponentFieldMeta("value", lTagOf[Example.ValueChoice], true, lTagOf[UnionAll])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, label, value, extension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Example): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[String](label, t.label),
      FHIRComponentField[Example.ValueChoice](value, t.value),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension)
    )
    val baseType: CompanionFor[Example] = this
    val thisName: String                = "Example"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Example] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Example(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[String]("label", None),
            cursor.decodeRef[UnionAll]("value"),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Example(
      override val id: Option[String] = None,
      val label: String,
      val value: Example.ValueChoice,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends Element(id = id, extension = extension)
  object Base extends CompanionFor[Base] {
    implicit def summonObjectAndCompanionBase1084869278(o: Base): ObjectAndCompanion[Base, Base.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Base
    override type ParentType   = Base
    override val parentType: CompanionFor[ResourceType] = Base
    def apply(
        id: Option[String] = None,
        min: UnsignedInt,
        max: String,
        path: String,
        extension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Base = new Base(
      id,
      min,
      max,
      path,
      extension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(o: Base): Option[(Option[String], UnsignedInt, String, String, LitSeq[Extension])] = Some(
      (o.id, o.min, o.max, o.path, o.extension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val min: FHIRComponentFieldMeta[UnsignedInt] =
      FHIRComponentFieldMeta("min", lTagOf[UnsignedInt], false, lTagOf[UnsignedInt])
    val max: FHIRComponentFieldMeta[String] =
      FHIRComponentFieldMeta("max", lTagOf[String], false, lTagOf[String])
    val path: FHIRComponentFieldMeta[String] =
      FHIRComponentFieldMeta("path", lTagOf[String], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, min, max, path, extension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Base): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[UnsignedInt](min, t.min),
      FHIRComponentField[String](max, t.max),
      FHIRComponentField[String](path, t.path),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension)
    )
    val baseType: CompanionFor[Base] = this
    val thisName: String             = "Base"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Base] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Base(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[UnsignedInt]("min", None),
            cursor.decodeAs[String]("max", None),
            cursor.decodeAs[String]("path", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Base(
      override val id: Option[String] = None,
      val min: UnsignedInt,
      val max: String,
      val path: String,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends Element(id = id, extension = extension)
  type FixedChoice        = Choice[UnionAll]
  type PatternChoice      = Choice[UnionAll]
  type MinValueChoice     = Choice[Union01480857620]
  type MaxValueChoice     = Choice[Union01480857620]
  type DefaultValueChoice = Choice[UnionAll]
  def apply(
      id: Option[String] = None,
      min: Option[UnsignedInt] = None,
      max: Option[String] = None,
      path: String,
      code: LitSeq[Coding] = LitSeq.empty,
      label: Option[String] = None,
      short: Option[String] = None,
      alias: LitSeq[String] = LitSeq.empty,
      comment: Option[Markdown] = None,
      fixed: Option[ElementDefinition.FixedChoice] = None,
      extension: LitSeq[Extension] = LitSeq.empty,
      sliceName: Option[String] = None,
      maxLength: Option[Int] = None,
      condition: LitSeq[Id] = LitSeq.empty,
      isSummary: Option[Boolean] = None,
      definition: Option[Markdown] = None,
      pattern: Option[ElementDefinition.PatternChoice] = None,
      isModifier: Option[Boolean] = None,
      minValue: Option[ElementDefinition.MinValueChoice] = None,
      maxValue: Option[ElementDefinition.MaxValueChoice] = None,
      mustSupport: Option[Boolean] = None,
      requirements: Option[Markdown] = None,
      orderMeaning: Option[String] = None,
      representation: LitSeq[PROPERTY_REPRESENTATION] = LitSeq.empty,
      base: Option[ElementDefinition.Base] = None,
      defaultValue: Option[ElementDefinition.DefaultValueChoice] = None,
      contentReference: Option[UriStr] = None,
      isModifierReason: Option[String] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      example: LitSeq[ElementDefinition.Example] = LitSeq.empty,
      mapping: LitSeq[ElementDefinition.Mapping] = LitSeq.empty,
      `type`: LitSeq[ElementDefinition.Type] = LitSeq.empty,
      meaningWhenMissing: Option[Markdown] = None,
      sliceIsConstraining: Option[Boolean] = None,
      binding: Option[ElementDefinition.Binding] = None,
      constraint: LitSeq[ElementDefinition.Constraint] = LitSeq.empty,
      slicing: Option[ElementDefinition.Slicing] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): ElementDefinition = new ElementDefinition(
    id,
    min,
    max,
    path,
    code,
    label,
    short,
    alias,
    comment,
    fixed,
    extension,
    sliceName,
    maxLength,
    condition,
    isSummary,
    definition,
    pattern,
    isModifier,
    minValue,
    maxValue,
    mustSupport,
    requirements,
    orderMeaning,
    representation,
    base,
    defaultValue,
    contentReference,
    isModifierReason,
    modifierExtension,
    example,
    mapping,
    `type`,
    meaningWhenMissing,
    sliceIsConstraining,
    binding,
    constraint,
    slicing,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val min: FHIRComponentFieldMeta[Option[UnsignedInt]] =
    FHIRComponentFieldMeta("min", lTagOf[Option[UnsignedInt]], false, lTagOf[UnsignedInt])
  val max: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("max", lTagOf[Option[String]], false, lTagOf[String])
  val path: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("path", lTagOf[String], false, lTagOf[String])
  val code: FHIRComponentFieldMeta[LitSeq[Coding]] =
    FHIRComponentFieldMeta("code", lTagOf[LitSeq[Coding]], false, lTagOf[Coding])
  val label: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("label", lTagOf[Option[String]], false, lTagOf[String])
  val short: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("short", lTagOf[Option[String]], false, lTagOf[String])
  val alias: FHIRComponentFieldMeta[LitSeq[String]] =
    FHIRComponentFieldMeta("alias", lTagOf[LitSeq[String]], false, lTagOf[String])
  val comment: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("comment", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val fixed: FHIRComponentFieldMeta[Option[ElementDefinition.FixedChoice]] =
    FHIRComponentFieldMeta("fixed", lTagOf[Option[ElementDefinition.FixedChoice]], true, lTagOf[UnionAll])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val sliceName: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("sliceName", lTagOf[Option[String]], false, lTagOf[String])
  val maxLength: FHIRComponentFieldMeta[Option[Int]] =
    FHIRComponentFieldMeta("maxLength", lTagOf[Option[Int]], false, lTagOf[Int])
  val condition: FHIRComponentFieldMeta[LitSeq[Id]] =
    FHIRComponentFieldMeta("condition", lTagOf[LitSeq[Id]], false, lTagOf[Id])
  val isSummary: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("isSummary", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val definition: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("definition", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val pattern: FHIRComponentFieldMeta[Option[ElementDefinition.PatternChoice]] =
    FHIRComponentFieldMeta("pattern", lTagOf[Option[ElementDefinition.PatternChoice]], true, lTagOf[UnionAll])
  val isModifier: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("isModifier", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val minValue: FHIRComponentFieldMeta[Option[ElementDefinition.MinValueChoice]] =
    FHIRComponentFieldMeta("minValue", lTagOf[Option[ElementDefinition.MinValueChoice]], true, lTagOf[Union01480857620])
  val maxValue: FHIRComponentFieldMeta[Option[ElementDefinition.MaxValueChoice]] =
    FHIRComponentFieldMeta("maxValue", lTagOf[Option[ElementDefinition.MaxValueChoice]], true, lTagOf[Union01480857620])
  val mustSupport: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("mustSupport", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val requirements: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("requirements", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val orderMeaning: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("orderMeaning", lTagOf[Option[String]], false, lTagOf[String])
  val representation: FHIRComponentFieldMeta[LitSeq[PROPERTY_REPRESENTATION]] =
    FHIRComponentFieldMeta("representation", lTagOf[LitSeq[PROPERTY_REPRESENTATION]], false, lTagOf[PROPERTY_REPRESENTATION])
  val base: FHIRComponentFieldMeta[Option[ElementDefinition.Base]] =
    FHIRComponentFieldMeta("base", lTagOf[Option[ElementDefinition.Base]], false, lTagOf[ElementDefinition.Base])
  val defaultValue: FHIRComponentFieldMeta[Option[ElementDefinition.DefaultValueChoice]] =
    FHIRComponentFieldMeta("defaultValue", lTagOf[Option[ElementDefinition.DefaultValueChoice]], true, lTagOf[UnionAll])
  val contentReference: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("contentReference", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val isModifierReason: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("isModifierReason", lTagOf[Option[String]], false, lTagOf[String])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val example: FHIRComponentFieldMeta[LitSeq[ElementDefinition.Example]] =
    FHIRComponentFieldMeta("example", lTagOf[LitSeq[ElementDefinition.Example]], false, lTagOf[ElementDefinition.Example])
  val mapping: FHIRComponentFieldMeta[LitSeq[ElementDefinition.Mapping]] =
    FHIRComponentFieldMeta("mapping", lTagOf[LitSeq[ElementDefinition.Mapping]], false, lTagOf[ElementDefinition.Mapping])
  val `type`: FHIRComponentFieldMeta[LitSeq[ElementDefinition.Type]] =
    FHIRComponentFieldMeta("type", lTagOf[LitSeq[ElementDefinition.Type]], false, lTagOf[ElementDefinition.Type])
  val meaningWhenMissing: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("meaningWhenMissing", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val sliceIsConstraining: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("sliceIsConstraining", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val binding: FHIRComponentFieldMeta[Option[ElementDefinition.Binding]] =
    FHIRComponentFieldMeta("binding", lTagOf[Option[ElementDefinition.Binding]], false, lTagOf[ElementDefinition.Binding])
  val constraint: FHIRComponentFieldMeta[LitSeq[ElementDefinition.Constraint]] =
    FHIRComponentFieldMeta(
      "constraint",
      lTagOf[LitSeq[ElementDefinition.Constraint]],
      false,
      lTagOf[ElementDefinition.Constraint])
  val slicing: FHIRComponentFieldMeta[Option[ElementDefinition.Slicing]] =
    FHIRComponentFieldMeta("slicing", lTagOf[Option[ElementDefinition.Slicing]], false, lTagOf[ElementDefinition.Slicing])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    min,
    max,
    path,
    code,
    label,
    short,
    alias,
    comment,
    fixed,
    extension,
    sliceName,
    maxLength,
    condition,
    isSummary,
    definition,
    pattern,
    isModifier,
    minValue,
    maxValue,
    mustSupport,
    requirements,
    orderMeaning,
    representation,
    base,
    defaultValue,
    contentReference,
    isModifierReason,
    modifierExtension,
    example,
    mapping,
    `type`,
    meaningWhenMissing,
    sliceIsConstraining,
    binding,
    constraint,
    slicing
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: ElementDefinition): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[UnsignedInt]](min, t.min),
    FHIRComponentField[Option[String]](max, t.max),
    FHIRComponentField[String](path, t.path),
    FHIRComponentField[LitSeq[Coding]](code, t.code),
    FHIRComponentField[Option[String]](label, t.label),
    FHIRComponentField[Option[String]](short, t.short),
    FHIRComponentField[LitSeq[String]](alias, t.alias),
    FHIRComponentField[Option[Markdown]](comment, t.comment),
    FHIRComponentField[Option[ElementDefinition.FixedChoice]](fixed, t.fixed),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[String]](sliceName, t.sliceName),
    FHIRComponentField[Option[Int]](maxLength, t.maxLength),
    FHIRComponentField[LitSeq[Id]](condition, t.condition),
    FHIRComponentField[Option[Boolean]](isSummary, t.isSummary),
    FHIRComponentField[Option[Markdown]](definition, t.definition),
    FHIRComponentField[Option[ElementDefinition.PatternChoice]](pattern, t.pattern),
    FHIRComponentField[Option[Boolean]](isModifier, t.isModifier),
    FHIRComponentField[Option[ElementDefinition.MinValueChoice]](minValue, t.minValue),
    FHIRComponentField[Option[ElementDefinition.MaxValueChoice]](maxValue, t.maxValue),
    FHIRComponentField[Option[Boolean]](mustSupport, t.mustSupport),
    FHIRComponentField[Option[Markdown]](requirements, t.requirements),
    FHIRComponentField[Option[String]](orderMeaning, t.orderMeaning),
    FHIRComponentField[LitSeq[PROPERTY_REPRESENTATION]](representation, t.representation),
    FHIRComponentField[Option[ElementDefinition.Base]](base, t.base),
    FHIRComponentField[Option[ElementDefinition.DefaultValueChoice]](defaultValue, t.defaultValue),
    FHIRComponentField[Option[UriStr]](contentReference, t.contentReference),
    FHIRComponentField[Option[String]](isModifierReason, t.isModifierReason),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[ElementDefinition.Example]](example, t.example),
    FHIRComponentField[LitSeq[ElementDefinition.Mapping]](mapping, t.mapping),
    FHIRComponentField[LitSeq[ElementDefinition.Type]](`type`, t.`type`),
    FHIRComponentField[Option[Markdown]](meaningWhenMissing, t.meaningWhenMissing),
    FHIRComponentField[Option[Boolean]](sliceIsConstraining, t.sliceIsConstraining),
    FHIRComponentField[Option[ElementDefinition.Binding]](binding, t.binding),
    FHIRComponentField[LitSeq[ElementDefinition.Constraint]](constraint, t.constraint),
    FHIRComponentField[Option[ElementDefinition.Slicing]](slicing, t.slicing)
  )
  def extractId(t: ElementDefinition): Option[String]                                         = t.id
  def extractMin(t: ElementDefinition): Option[UnsignedInt]                                   = t.min
  def extractMax(t: ElementDefinition): Option[String]                                        = t.max
  def extractPath(t: ElementDefinition): String                                               = t.path
  def extractCode(t: ElementDefinition): LitSeq[Coding]                                       = t.code
  def extractLabel(t: ElementDefinition): Option[String]                                      = t.label
  def extractShort(t: ElementDefinition): Option[String]                                      = t.short
  def extractAlias(t: ElementDefinition): LitSeq[String]                                      = t.alias
  def extractComment(t: ElementDefinition): Option[Markdown]                                  = t.comment
  def extractFixed(t: ElementDefinition): Option[ElementDefinition.FixedChoice]               = t.fixed
  def extractExtension(t: ElementDefinition): LitSeq[Extension]                               = t.extension
  def extractSliceName(t: ElementDefinition): Option[String]                                  = t.sliceName
  def extractMaxLength(t: ElementDefinition): Option[Int]                                     = t.maxLength
  def extractCondition(t: ElementDefinition): LitSeq[Id]                                      = t.condition
  def extractIsSummary(t: ElementDefinition): Option[Boolean]                                 = t.isSummary
  def extractDefinition(t: ElementDefinition): Option[Markdown]                               = t.definition
  def extractPattern(t: ElementDefinition): Option[ElementDefinition.PatternChoice]           = t.pattern
  def extractIsModifier(t: ElementDefinition): Option[Boolean]                                = t.isModifier
  def extractMinValue(t: ElementDefinition): Option[ElementDefinition.MinValueChoice]         = t.minValue
  def extractMaxValue(t: ElementDefinition): Option[ElementDefinition.MaxValueChoice]         = t.maxValue
  def extractMustSupport(t: ElementDefinition): Option[Boolean]                               = t.mustSupport
  def extractRequirements(t: ElementDefinition): Option[Markdown]                             = t.requirements
  def extractOrderMeaning(t: ElementDefinition): Option[String]                               = t.orderMeaning
  def extractRepresentation(t: ElementDefinition): LitSeq[PROPERTY_REPRESENTATION]            = t.representation
  def extractBase(t: ElementDefinition): Option[ElementDefinition.Base]                       = t.base
  def extractDefaultValue(t: ElementDefinition): Option[ElementDefinition.DefaultValueChoice] = t.defaultValue
  def extractContentReference(t: ElementDefinition): Option[UriStr]                           = t.contentReference
  def extractIsModifierReason(t: ElementDefinition): Option[String]                           = t.isModifierReason
  def extractModifierExtension(t: ElementDefinition): LitSeq[Extension]                       = t.modifierExtension
  def extractExample(t: ElementDefinition): LitSeq[ElementDefinition.Example]                 = t.example
  def extractMapping(t: ElementDefinition): LitSeq[ElementDefinition.Mapping]                 = t.mapping
  def extractType(t: ElementDefinition): LitSeq[ElementDefinition.Type]                       = t.`type`
  def extractMeaningWhenMissing(t: ElementDefinition): Option[Markdown]                       = t.meaningWhenMissing
  def extractSliceIsConstraining(t: ElementDefinition): Option[Boolean]                       = t.sliceIsConstraining
  def extractBinding(t: ElementDefinition): Option[ElementDefinition.Binding]                 = t.binding
  def extractConstraint(t: ElementDefinition): LitSeq[ElementDefinition.Constraint]           = t.constraint
  def extractSlicing(t: ElementDefinition): Option[ElementDefinition.Slicing]                 = t.slicing
  override val thisName: String                                                               = "ElementDefinition"
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ElementDefinition] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new ElementDefinition(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[UnsignedInt]]("min", Some(None)),
          cursor.decodeAs[Option[String]]("max", Some(None)),
          cursor.decodeAs[String]("path", None),
          cursor.decodeAs[LitSeq[Coding]]("code", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("label", Some(None)),
          cursor.decodeAs[Option[String]]("short", Some(None)),
          cursor.decodeAs[LitSeq[String]]("alias", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Markdown]]("comment", Some(None)),
          cursor.decodeOptRef[UnionAll]("fixed"),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("sliceName", Some(None)),
          cursor.decodeAs[Option[Int]]("maxLength", Some(None)),
          cursor.decodeAs[LitSeq[Id]]("condition", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Boolean]]("isSummary", Some(None)),
          cursor.decodeAs[Option[Markdown]]("definition", Some(None)),
          cursor.decodeOptRef[UnionAll]("pattern"),
          cursor.decodeAs[Option[Boolean]]("isModifier", Some(None)),
          cursor.decodeOptRef[Union01480857620]("minValue"),
          cursor.decodeOptRef[Union01480857620]("maxValue"),
          cursor.decodeAs[Option[Boolean]]("mustSupport", Some(None)),
          cursor.decodeAs[Option[Markdown]]("requirements", Some(None)),
          cursor.decodeAs[Option[String]]("orderMeaning", Some(None)),
          cursor.decodeAs[LitSeq[PROPERTY_REPRESENTATION]]("representation", Some(LitSeq.empty)),
          cursor.decodeAs[Option[ElementDefinition.Base]]("base", Some(None)),
          cursor.decodeOptRef[UnionAll]("defaultValue"),
          cursor.decodeAs[Option[UriStr]]("contentReference", Some(None)),
          cursor.decodeAs[Option[String]]("isModifierReason", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[ElementDefinition.Example]]("example", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[ElementDefinition.Mapping]]("mapping", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[ElementDefinition.Type]]("type", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Markdown]]("meaningWhenMissing", Some(None)),
          cursor.decodeAs[Option[Boolean]]("sliceIsConstraining", Some(None)),
          cursor.decodeAs[Option[ElementDefinition.Binding]]("binding", Some(None)),
          cursor.decodeAs[LitSeq[ElementDefinition.Constraint]]("constraint", Some(LitSeq.empty)),
          cursor.decodeAs[Option[ElementDefinition.Slicing]]("slicing", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for ElementDefinition Type: Captures constraints on each element within the resource, profile, or
  * extension.
  *
  * Subclass of [[core.model.BackboneElement]] (Base StructureDefinition for BackboneElement Type: Base definition for all
  * elements that are defined inside a resource - but not those in a data type.)
  *
  * @constructor
  *   Introduces the fields min, max, path, code, label, short, alias, comment, fixed, sliceName, maxLength, condition, isSummary,
  *   definition, pattern, isModifier, minValue, maxValue, mustSupport, requirements, orderMeaning, representation, base,
  *   defaultValue, contentReference, isModifierReason, example, mapping, `type`, meaningWhenMissing, sliceIsConstraining,
  *   binding, constraint, slicing.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *   spaces.
  * @param min
  *   - The minimum number of times this element SHALL appear in the instance.
  * @param max
  *   - The maximum number of times this element is permitted to appear in the instance.
  * @param path
  *   - The path identifies the element and is expressed as a "."-separated list of ancestor elements, beginning with the name of
  *   the resource or extension.
  * @param code
  *   - A code that has the same meaning as the element in a particular terminology.
  * @param label
  *   - A single preferred label which is the text to display beside the element indicating its meaning or to use to prompt for
  *   the element in a user display or form.
  * @param short
  *   - A concise description of what this element means (e.g. for use in autogenerated summaries).
  * @param alias
  *   - Identifies additional names by which this element might also be known.
  * @param comment
  *   - Explanatory notes and implementation guidance about the data element, including notes about how to use the data properly,
  *   exceptions to proper use, etc. (Note: The text you are reading is specified in ElementDefinition.comment).
  * @param fixed
  *   - Specifies a value that SHALL be exactly the value for this element in the instance. For purposes of comparison,
  *   non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing
  *   elements/attributes must also be missing.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the element. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param sliceName
  *   - The name of this element definition slice, when slicing is working. The name must be a token with no dots or spaces. This
  *   is a unique name referring to a specific set of constraints applied to this element, used to provide a name to different
  *   slices of the same element.
  * @param maxLength
  *   - Indicates the maximum length in characters that is permitted to be present in conformant instances and which is expected
  *   to be supported by conformant consumers that support the element.
  * @param condition
  *   - A reference to an invariant that may make additional statements about the cardinality or value in the instance.
  * @param isSummary
  *   - Whether the element should be included if a client requests a search with the parameter _summary=true.
  * @param definition
  *   - Provides a complete explanation of the meaning of the data element for human readability. For the case of elements
  *   derived from existing elements (e.g. constraints), the definition SHALL be consistent with the base definition, but convey
  *   the meaning of the element in the particular context of use of the resource. (Note: The text you are reading is specified in
  *   ElementDefinition.definition).
  * @param pattern
  *   - Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the
  *   instance. Other additional values may be found too. This is effectively constraint by example. When pattern[x] is used to
  *   constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly. When
  *   pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively)
  *   match at least one element from the instance array. When pattern[x] is used to constrain a complex object, it means that
  *   each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
  * \1. If primitive: it must match exactly the pattern value 2. If a complex object: it must match (recursively) the pattern
  * value 3. If an array: it must match (recursively) the pattern value.
  * @param isModifier
  *   - If true, the value of this element affects the interpretation of the element or resource that contains it, and the value
  *   of the element cannot be ignored. Typically, this is used for status, negation and qualification codes. The effect of this
  *   is that the element cannot be ignored by systems: they SHALL either recognize the element and process it, and/or a
  *   pre-determination has been made that it is not relevant to their particular system.
  * @param minValue
  *   - The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant,
  *   time, decimal, integer, and Quantity.
  * @param maxValue
  *   - The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant,
  *   time, decimal, integer, and Quantity.
  * @param mustSupport
  *   - If true, implementations that produce or consume resources SHALL provide "support" for the element in some meaningful
  *   way. If false, the element may be ignored and not supported. If false, whether to populate or use the data element in any
  *   way is at the discretion of the implementation.
  * @param requirements
  *   - This element is for traceability of why the element was created and why the constraints exist as they do. This may be
  *   used to point to source materials or specifications that drove the structure of this element.
  * @param orderMeaning
  *   - If present, indicates that the order of the repeating element has meaning and describes what that meaning is. If absent,
  *   it means that the order of the element has no meaning.
  * @param representation
  *   - Codes that define how this element is represented in instances, when the deviation varies from the normal case.
  * @param base
  *   - Information about the base definition of the element, provided to make it unnecessary for tools to trace the deviation of
  *   the element through the derived and related profiles. When the element definition is not the original definition of an
  *   element - i.g. either in a constraint on another type, or for elements from a super type in a snap shot - then the
  *   information in provided in the element definition may be different to the base definition. On the original definition of the
  *   element, it will be same.
  * @param defaultValue
  *   - The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract
  *   is false').
  * @param contentReference
  *   - Identifies an element defined elsewhere in the definition whose content rules should be applied to the current element.
  *   ContentReferences bring across all the rules that are in the ElementDefinition for the element, including definitions,
  *   cardinality constraints, bindings, invariants etc.
  * @param isModifierReason
  *   - Explains how that element affects the interpretation of the resource or element that contains it.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the element and that modifies
  *   the understanding of the element in which it is contained and/or the understanding of the containing element's descendants.
  *   Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *   strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param example
  *   - A sample value for this element demonstrating the type of information that would typically be found in the element.
  * @param mapping
  *   - Identifies a concept from an external specification that roughly corresponds to this element.
  * @param `type`
  *   - The data type or resource that the value of this element is permitted to be.
  * @param meaningWhenMissing
  *   - The Implicit meaning that is to be understood when this element is missing (e.g. 'when this element is missing, the
  *   period is ongoing').
  * @param sliceIsConstraining
  *   - If true, indicates that this slice definition is constraining a slice definition with the same name in an inherited
  *   profile. If false, the slice is not overriding any slice in an inherited profile. If missing, the slice might or might not
  *   be overriding a slice in an inherited profile, depending on the sliceName.
  * @param binding
  *   - Binds to a value set if this element is coded (code, Coding, CodeableConcept, Quantity), or the data types (string, uri).
  * @param constraint
  *   - Formal constraints such as co-occurrence and other constraints that can be computationally evaluated within the context
  *   of the instance.
  * @param slicing
  *   - Indicates that the element is sliced into a set of alternative definitions (i.e. in a structure definition, there are
  *   multiple different constraints on a single element in the base resource). Slicing can be used in any resource that has
  *   cardinality ..* on the base resource, or any resource with a choice of types. The set of slices is any elements that come
  *   after this in the element sequence that have the same path, until a shorter path occurs (the shorter path terminates the
  *   set).
  */
@POJOBoilerplate
class ElementDefinition(
    override val id: Option[String] = None,
    val min: Option[UnsignedInt] = None,
    val max: Option[String] = None,
    val path: String,
    val code: LitSeq[Coding] = LitSeq.empty,
    val label: Option[String] = None,
    val short: Option[String] = None,
    val alias: LitSeq[String] = LitSeq.empty,
    val comment: Option[Markdown] = None,
    val fixed: Option[ElementDefinition.FixedChoice] = None,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val sliceName: Option[String] = None,
    val maxLength: Option[Int] = None,
    val condition: LitSeq[Id] = LitSeq.empty,
    val isSummary: Option[Boolean] = None,
    val definition: Option[Markdown] = None,
    val pattern: Option[ElementDefinition.PatternChoice] = None,
    val isModifier: Option[Boolean] = None,
    val minValue: Option[ElementDefinition.MinValueChoice] = None,
    val maxValue: Option[ElementDefinition.MaxValueChoice] = None,
    val mustSupport: Option[Boolean] = None,
    val requirements: Option[Markdown] = None,
    val orderMeaning: Option[String] = None,
    val representation: LitSeq[PROPERTY_REPRESENTATION] = LitSeq.empty,
    val base: Option[ElementDefinition.Base] = None,
    val defaultValue: Option[ElementDefinition.DefaultValueChoice] = None,
    val contentReference: Option[UriStr] = None,
    val isModifierReason: Option[String] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val example: LitSeq[ElementDefinition.Example] = LitSeq.empty,
    val mapping: LitSeq[ElementDefinition.Mapping] = LitSeq.empty,
    val `type`: LitSeq[ElementDefinition.Type] = LitSeq.empty,
    val meaningWhenMissing: Option[Markdown] = None,
    val sliceIsConstraining: Option[Boolean] = None,
    val binding: Option[ElementDefinition.Binding] = None,
    val constraint: LitSeq[ElementDefinition.Constraint] = LitSeq.empty,
    val slicing: Option[ElementDefinition.Slicing] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends BackboneElement(
      id = id,
      extension = extension,
      modifierExtension = modifierExtension,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "ElementDefinition"
}
