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
  TYPE_DERIVATION_RULE,
  STRUCTURE_DEFINITION_KIND,
  EXTENSION_CONTEXT_TYPE,
  PUBLICATION_STATUS
}
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object StructureDefinition extends CompanionFor[StructureDefinition] {
  implicit def summonObjectAndCompanionStructureDefinition898864401(
      o: StructureDefinition): ObjectAndCompanion[StructureDefinition, StructureDefinition.type] = ObjectAndCompanion(o, this)
  override type ResourceType = StructureDefinition
  override type ParentType   = StructureDefinition
  override val baseType: CompanionFor[ResourceType] = StructureDefinition
  override val parentType: CompanionFor[ParentType] = StructureDefinition
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/StructureDefinition")
  object Differential extends CompanionFor[Differential] {
    implicit def summonObjectAndCompanionDifferential_2027411956(
        o: Differential): ObjectAndCompanion[Differential, Differential.type] = ObjectAndCompanion(o, this)
    override type ResourceType = Differential
    override type ParentType   = Differential
    override val parentType: CompanionFor[ResourceType] = Differential
    def apply(
        id: Option[String] = None,
        element: NonEmptyLitSeq[ElementDefinition],
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Differential = new Differential(
      id,
      element,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Differential): Option[(Option[String], NonEmptyLitSeq[ElementDefinition], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.element, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val element: FHIRComponentFieldMeta[NonEmptyLitSeq[ElementDefinition]] =
      FHIRComponentFieldMeta("element", lTagOf[NonEmptyLitSeq[ElementDefinition]], false, lTagOf[ElementDefinition])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, element, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Differential): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[NonEmptyLitSeq[ElementDefinition]](element, t.element),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Differential] = this
    val thisName: String                     = "Differential"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Differential] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Differential(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[NonEmptyLitSeq[ElementDefinition]]("element", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Differential(
      override val id: Option[String] = None,
      val element: NonEmptyLitSeq[ElementDefinition],
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Snapshot extends CompanionFor[Snapshot] {
    implicit def summonObjectAndCompanionSnapshot_2027411956(o: Snapshot): ObjectAndCompanion[Snapshot, Snapshot.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Snapshot
    override type ParentType   = Snapshot
    override val parentType: CompanionFor[ResourceType] = Snapshot
    def apply(
        id: Option[String] = None,
        element: NonEmptyLitSeq[ElementDefinition],
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Snapshot = new Snapshot(
      id,
      element,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(o: Snapshot): Option[(Option[String], NonEmptyLitSeq[ElementDefinition], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.element, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val element: FHIRComponentFieldMeta[NonEmptyLitSeq[ElementDefinition]] =
      FHIRComponentFieldMeta("element", lTagOf[NonEmptyLitSeq[ElementDefinition]], false, lTagOf[ElementDefinition])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, element, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Snapshot): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[NonEmptyLitSeq[ElementDefinition]](element, t.element),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Snapshot] = this
    val thisName: String                 = "Snapshot"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Snapshot] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Snapshot(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[NonEmptyLitSeq[ElementDefinition]]("element", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Snapshot(
      override val id: Option[String] = None,
      val element: NonEmptyLitSeq[ElementDefinition],
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Context extends CompanionFor[Context] {
    implicit def summonObjectAndCompanionContext_2027411956(o: Context): ObjectAndCompanion[Context, Context.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Context
    override type ParentType   = Context
    override val parentType: CompanionFor[ResourceType] = Context
    def apply(
        id: Option[String] = None,
        `type`: EXTENSION_CONTEXT_TYPE,
        extension: LitSeq[Extension] = LitSeq.empty,
        expression: String,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Context = new Context(
      id,
      `type`,
      extension,
      expression,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(o: Context): Option[(Option[String], EXTENSION_CONTEXT_TYPE, LitSeq[Extension], String, LitSeq[Extension])] =
      Some((o.id, o.`type`, o.extension, o.expression, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[EXTENSION_CONTEXT_TYPE] =
      FHIRComponentFieldMeta("type", lTagOf[EXTENSION_CONTEXT_TYPE], false, lTagOf[EXTENSION_CONTEXT_TYPE])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val expression: FHIRComponentFieldMeta[String] =
      FHIRComponentFieldMeta("expression", lTagOf[String], false, lTagOf[String])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, `type`, extension, expression, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Context): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[EXTENSION_CONTEXT_TYPE](`type`, t.`type`),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[String](expression, t.expression),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Context] = this
    val thisName: String                = "Context"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Context] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Context(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[EXTENSION_CONTEXT_TYPE]("type", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[String]("expression", None),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Context(
      override val id: Option[String] = None,
      val `type`: EXTENSION_CONTEXT_TYPE,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val expression: String,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Mapping extends CompanionFor[Mapping] {
    implicit def summonObjectAndCompanionMapping_2027411956(o: Mapping): ObjectAndCompanion[Mapping, Mapping.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Mapping
    override type ParentType   = Mapping
    override val parentType: CompanionFor[ResourceType] = Mapping
    def apply(
        id: Option[String] = None,
        uri: Option[UriStr] = None,
        name: Option[String] = None,
        comment: Option[String] = None,
        identity: Id,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Mapping = new Mapping(
      id,
      uri,
      name,
      comment,
      identity,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Mapping): Option[(Option[String], Option[UriStr], Option[String], Option[String], Id, LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.uri, o.name, o.comment, o.identity, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val uri: FHIRComponentFieldMeta[Option[UriStr]] =
      FHIRComponentFieldMeta("uri", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
    val name: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("name", lTagOf[Option[String]], false, lTagOf[String])
    val comment: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("comment", lTagOf[Option[String]], false, lTagOf[String])
    val identity: FHIRComponentFieldMeta[Id] =
      FHIRComponentFieldMeta("identity", lTagOf[Id], false, lTagOf[Id])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, uri, name, comment, identity, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Mapping): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[UriStr]](uri, t.uri),
      FHIRComponentField[Option[String]](name, t.name),
      FHIRComponentField[Option[String]](comment, t.comment),
      FHIRComponentField[Id](identity, t.identity),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Mapping] = this
    val thisName: String                = "Mapping"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Mapping] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Mapping(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[UriStr]]("uri", Some(None)),
            cursor.decodeAs[Option[String]]("name", Some(None)),
            cursor.decodeAs[Option[String]]("comment", Some(None)),
            cursor.decodeAs[Id]("identity", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Mapping(
      override val id: Option[String] = None,
      val uri: Option[UriStr] = None,
      val name: Option[String] = None,
      val comment: Option[String] = None,
      val identity: Id,
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
      kind: STRUCTURE_DEFINITION_KIND,
      `type`: UriStr,
      title: Option[String] = None,
      status: PUBLICATION_STATUS,
      version: Option[String] = None,
      contact: LitSeq[ContactDetail] = LitSeq.empty,
      purpose: Option[Markdown] = None,
      keyword: LitSeq[Coding] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      `abstract`: Boolean,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      publisher: Option[String] = None,
      copyright: Option[Markdown] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      useContext: LitSeq[UsageContext] = LitSeq.empty,
      derivation: Option[TYPE_DERIVATION_RULE] = None,
      description: Option[Markdown] = None,
      fhirVersion: Option[FHIR_VERSION] = None,
      experimental: Option[Boolean] = None,
      jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      baseDefinition: Option[Canonical] = None,
      contextInvariant: LitSeq[String] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      mapping: LitSeq[StructureDefinition.Mapping] = LitSeq.empty,
      context: LitSeq[StructureDefinition.Context] = LitSeq.empty,
      snapshot: Option[StructureDefinition.Snapshot] = None,
      differential: Option[StructureDefinition.Differential] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): StructureDefinition = new StructureDefinition(
    id,
    url,
    meta,
    text,
    name,
    date,
    kind,
    `type`,
    title,
    status,
    version,
    contact,
    purpose,
    keyword,
    language,
    `abstract`,
    contained,
    extension,
    publisher,
    copyright,
    identifier,
    useContext,
    derivation,
    description,
    fhirVersion,
    experimental,
    jurisdiction,
    implicitRules,
    baseDefinition,
    contextInvariant,
    modifierExtension,
    mapping,
    context,
    snapshot,
    differential,
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
  val kind: FHIRComponentFieldMeta[STRUCTURE_DEFINITION_KIND] =
    FHIRComponentFieldMeta("kind", lTagOf[STRUCTURE_DEFINITION_KIND], false, lTagOf[STRUCTURE_DEFINITION_KIND])
  val `type`: FHIRComponentFieldMeta[UriStr] =
    FHIRComponentFieldMeta("type", lTagOf[UriStr], false, lTagOf[UriStr])
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
  val keyword: FHIRComponentFieldMeta[LitSeq[Coding]] =
    FHIRComponentFieldMeta("keyword", lTagOf[LitSeq[Coding]], false, lTagOf[Coding])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val `abstract`: FHIRComponentFieldMeta[Boolean] =
    FHIRComponentFieldMeta("abstract", lTagOf[Boolean], false, lTagOf[Boolean])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val publisher: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("publisher", lTagOf[Option[String]], false, lTagOf[String])
  val copyright: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("copyright", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val useContext: FHIRComponentFieldMeta[LitSeq[UsageContext]] =
    FHIRComponentFieldMeta("useContext", lTagOf[LitSeq[UsageContext]], false, lTagOf[UsageContext])
  val derivation: FHIRComponentFieldMeta[Option[TYPE_DERIVATION_RULE]] =
    FHIRComponentFieldMeta("derivation", lTagOf[Option[TYPE_DERIVATION_RULE]], false, lTagOf[TYPE_DERIVATION_RULE])
  val description: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("description", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val fhirVersion: FHIRComponentFieldMeta[Option[FHIR_VERSION]] =
    FHIRComponentFieldMeta("fhirVersion", lTagOf[Option[FHIR_VERSION]], false, lTagOf[FHIR_VERSION])
  val experimental: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("experimental", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val jurisdiction: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("jurisdiction", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val baseDefinition: FHIRComponentFieldMeta[Option[Canonical]] =
    FHIRComponentFieldMeta("baseDefinition", lTagOf[Option[Canonical]], false, lTagOf[Canonical])
  val contextInvariant: FHIRComponentFieldMeta[LitSeq[String]] =
    FHIRComponentFieldMeta("contextInvariant", lTagOf[LitSeq[String]], false, lTagOf[String])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val mapping: FHIRComponentFieldMeta[LitSeq[StructureDefinition.Mapping]] =
    FHIRComponentFieldMeta("mapping", lTagOf[LitSeq[StructureDefinition.Mapping]], false, lTagOf[StructureDefinition.Mapping])
  val context: FHIRComponentFieldMeta[LitSeq[StructureDefinition.Context]] =
    FHIRComponentFieldMeta("context", lTagOf[LitSeq[StructureDefinition.Context]], false, lTagOf[StructureDefinition.Context])
  val snapshot: FHIRComponentFieldMeta[Option[StructureDefinition.Snapshot]] =
    FHIRComponentFieldMeta("snapshot", lTagOf[Option[StructureDefinition.Snapshot]], false, lTagOf[StructureDefinition.Snapshot])
  val differential: FHIRComponentFieldMeta[Option[StructureDefinition.Differential]] =
    FHIRComponentFieldMeta(
      "differential",
      lTagOf[Option[StructureDefinition.Differential]],
      false,
      lTagOf[StructureDefinition.Differential])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    url,
    meta,
    text,
    name,
    date,
    kind,
    `type`,
    title,
    status,
    version,
    contact,
    purpose,
    keyword,
    language,
    `abstract`,
    contained,
    extension,
    publisher,
    copyright,
    identifier,
    useContext,
    derivation,
    description,
    fhirVersion,
    experimental,
    jurisdiction,
    implicitRules,
    baseDefinition,
    contextInvariant,
    modifierExtension,
    mapping,
    context,
    snapshot,
    differential
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: StructureDefinition): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[UriStr](url, t.url),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[String](name, t.name),
    FHIRComponentField[Option[FHIRDateTime]](date, t.date),
    FHIRComponentField[STRUCTURE_DEFINITION_KIND](kind, t.kind),
    FHIRComponentField[UriStr](`type`, t.`type`),
    FHIRComponentField[Option[String]](title, t.title),
    FHIRComponentField[PUBLICATION_STATUS](status, t.status),
    FHIRComponentField[Option[String]](version, t.version),
    FHIRComponentField[LitSeq[ContactDetail]](contact, t.contact),
    FHIRComponentField[Option[Markdown]](purpose, t.purpose),
    FHIRComponentField[LitSeq[Coding]](keyword, t.keyword),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Boolean](`abstract`, t.`abstract`),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[String]](publisher, t.publisher),
    FHIRComponentField[Option[Markdown]](copyright, t.copyright),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[LitSeq[UsageContext]](useContext, t.useContext),
    FHIRComponentField[Option[TYPE_DERIVATION_RULE]](derivation, t.derivation),
    FHIRComponentField[Option[Markdown]](description, t.description),
    FHIRComponentField[Option[FHIR_VERSION]](fhirVersion, t.fhirVersion),
    FHIRComponentField[Option[Boolean]](experimental, t.experimental),
    FHIRComponentField[LitSeq[CodeableConcept]](jurisdiction, t.jurisdiction),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[Canonical]](baseDefinition, t.baseDefinition),
    FHIRComponentField[LitSeq[String]](contextInvariant, t.contextInvariant),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[StructureDefinition.Mapping]](mapping, t.mapping),
    FHIRComponentField[LitSeq[StructureDefinition.Context]](context, t.context),
    FHIRComponentField[Option[StructureDefinition.Snapshot]](snapshot, t.snapshot),
    FHIRComponentField[Option[StructureDefinition.Differential]](differential, t.differential)
  )
  def extractId(t: StructureDefinition): Option[String]                                     = t.id
  def extractUrl(t: StructureDefinition): UriStr                                            = t.url
  def extractMeta(t: StructureDefinition): Option[Meta]                                     = t.meta
  def extractText(t: StructureDefinition): Option[Narrative]                                = t.text
  def extractName(t: StructureDefinition): String                                           = t.name
  def extractDate(t: StructureDefinition): Option[FHIRDateTime]                             = t.date
  def extractKind(t: StructureDefinition): STRUCTURE_DEFINITION_KIND                        = t.kind
  def extractType(t: StructureDefinition): UriStr                                           = t.`type`
  def extractTitle(t: StructureDefinition): Option[String]                                  = t.title
  def extractStatus(t: StructureDefinition): PUBLICATION_STATUS                             = t.status
  def extractVersion(t: StructureDefinition): Option[String]                                = t.version
  def extractContact(t: StructureDefinition): LitSeq[ContactDetail]                         = t.contact
  def extractPurpose(t: StructureDefinition): Option[Markdown]                              = t.purpose
  def extractKeyword(t: StructureDefinition): LitSeq[Coding]                                = t.keyword
  def extractLanguage(t: StructureDefinition): Option[LANGUAGES]                            = t.language
  def extractAbstract(t: StructureDefinition): Boolean                                      = t.`abstract`
  def extractContained(t: StructureDefinition): LitSeq[Resource]                            = t.contained
  def extractExtension(t: StructureDefinition): LitSeq[Extension]                           = t.extension
  def extractPublisher(t: StructureDefinition): Option[String]                              = t.publisher
  def extractCopyright(t: StructureDefinition): Option[Markdown]                            = t.copyright
  def extractIdentifier(t: StructureDefinition): LitSeq[Identifier]                         = t.identifier
  def extractUseContext(t: StructureDefinition): LitSeq[UsageContext]                       = t.useContext
  def extractDerivation(t: StructureDefinition): Option[TYPE_DERIVATION_RULE]               = t.derivation
  def extractDescription(t: StructureDefinition): Option[Markdown]                          = t.description
  def extractFhirVersion(t: StructureDefinition): Option[FHIR_VERSION]                      = t.fhirVersion
  def extractExperimental(t: StructureDefinition): Option[Boolean]                          = t.experimental
  def extractJurisdiction(t: StructureDefinition): LitSeq[CodeableConcept]                  = t.jurisdiction
  def extractImplicitRules(t: StructureDefinition): Option[UriStr]                          = t.implicitRules
  def extractBaseDefinition(t: StructureDefinition): Option[Canonical]                      = t.baseDefinition
  def extractContextInvariant(t: StructureDefinition): LitSeq[String]                       = t.contextInvariant
  def extractModifierExtension(t: StructureDefinition): LitSeq[Extension]                   = t.modifierExtension
  def extractMapping(t: StructureDefinition): LitSeq[StructureDefinition.Mapping]           = t.mapping
  def extractContext(t: StructureDefinition): LitSeq[StructureDefinition.Context]           = t.context
  def extractSnapshot(t: StructureDefinition): Option[StructureDefinition.Snapshot]         = t.snapshot
  def extractDifferential(t: StructureDefinition): Option[StructureDefinition.Differential] = t.differential
  override val thisName: String                                                             = "StructureDefinition"
  override val searchParams: Map[String, StructureDefinition => Seq[Any]] = Map(
    "jurisdiction"          -> (obj => obj.jurisdiction.toSeq),
    "experimental"          -> (obj => obj.experimental.toSeq),
    "name"                  -> (obj => Seq(obj.name)),
    "context-type-quantity" -> (obj => obj.useContext.toSeq),
    "path" -> (obj =>
      obj.snapshot.toSeq.flatMap(_.element).map(_.path).toSeq ++
        obj.differential.toSeq.flatMap(_.element).map(_.path).toSeq),
    "description" -> (obj => obj.description.toSeq),
    "context"     -> (obj => obj.useContext.map(_.value).flatMap(_.as[CodeableConcept]).toSeq),
    "abstract"    -> (obj => Seq(obj.`abstract`)),
    "keyword"     -> (obj => obj.keyword.toSeq),
    "base"        -> (obj => obj.baseDefinition.toSeq),
    "date"        -> (obj => obj.date.toSeq),
    "valueset"    -> (obj => obj.snapshot.toSeq.flatMap(_.element).flatMap(_.binding).flatMap(_.valueSet).toSeq),
    "derivation"  -> (obj => obj.derivation.toSeq),
    "base-path" -> (obj =>
      obj.snapshot.toSeq.flatMap(_.element).flatMap(_.base).map(_.path).toSeq ++
        obj.differential.toSeq.flatMap(_.element).flatMap(_.base).map(_.path).toSeq),
    "context-type"       -> (obj => obj.useContext.map(_.code).toSeq),
    "identifier"         -> (obj => obj.identifier.toSeq),
    "url"                -> (obj => Seq(obj.url)),
    "ext-context"        -> (obj => obj.context.map(_.`type`).toSeq),
    "context-type-value" -> (obj => obj.useContext.toSeq),
    "version"            -> (obj => obj.version.toSeq),
    "status"             -> (obj => Seq(obj.status)),
    "publisher"          -> (obj => obj.publisher.toSeq),
    "kind"               -> (obj => Seq(obj.kind)),
    "title"              -> (obj => obj.title.toSeq),
    "context-quantity" -> (obj =>
      obj.useContext.map(_.value).flatMap(_.as[Quantity]).toSeq ++
        obj.useContext.map(_.value).flatMap(_.as[Range]).toSeq),
    "type" -> (obj => Seq(obj.`type`))
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[StructureDefinition] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new StructureDefinition(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[UriStr]("url", None),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[String]("name", None),
          cursor.decodeAs[Option[FHIRDateTime]]("date", Some(None)),
          cursor.decodeAs[STRUCTURE_DEFINITION_KIND]("kind", None),
          cursor.decodeAs[UriStr]("type", None),
          cursor.decodeAs[Option[String]]("title", Some(None)),
          cursor.decodeAs[PUBLICATION_STATUS]("status", None),
          cursor.decodeAs[Option[String]]("version", Some(None)),
          cursor.decodeAs[LitSeq[ContactDetail]]("contact", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Markdown]]("purpose", Some(None)),
          cursor.decodeAs[LitSeq[Coding]]("keyword", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Boolean]("abstract", None),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("publisher", Some(None)),
          cursor.decodeAs[Option[Markdown]]("copyright", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[UsageContext]]("useContext", Some(LitSeq.empty)),
          cursor.decodeAs[Option[TYPE_DERIVATION_RULE]]("derivation", Some(None)),
          cursor.decodeAs[Option[Markdown]]("description", Some(None)),
          cursor.decodeAs[Option[FHIR_VERSION]]("fhirVersion", Some(None)),
          cursor.decodeAs[Option[Boolean]]("experimental", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("jurisdiction", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[Canonical]]("baseDefinition", Some(None)),
          cursor.decodeAs[LitSeq[String]]("contextInvariant", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[StructureDefinition.Mapping]]("mapping", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[StructureDefinition.Context]]("context", Some(LitSeq.empty)),
          cursor.decodeAs[Option[StructureDefinition.Snapshot]]("snapshot", Some(None)),
          cursor.decodeAs[Option[StructureDefinition.Differential]]("differential", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and
  * also for describing extensions and constraints on resources and data types.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields url, name, date, kind, `type`, title, status, version, contact, purpose, keyword, `abstract`,
  *   publisher, copyright, identifier, useContext, derivation, description, fhirVersion, experimental, jurisdiction,
  *   baseDefinition, contextInvariant, mapping, context, snapshot, differential.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param url
  *   - An absolute URI that is used to identify this structure definition when it is referenced in a specification, model,
  *   design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address
  *   at which at which an authoritative instance of this structure definition is (or will be) published. This URL can be the
  *   target of a canonical reference. It SHALL remain the same when the structure definition is stored on different servers.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *   not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *   resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to
  *   make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be
  *   represented in the narrative to ensure clinical safety.
  * @param name
  *   - A natural language name identifying the structure definition. This name should be usable as an identifier for the module
  *   by machine processing applications such as code generation.
  * @param date
  *   - The date (and optionally time) when the structure definition was published. The date must change when the business
  *   version changes and it must change if the status code changes. In addition, it should change when the substantive content of
  *   the structure definition changes.
  * @param kind
  *   - Defines the kind of structure that this definition is describing.
  * @param `type`
  *   - The type this structure describes. If the derivation kind is 'specialization' then this is the master definition for a
  *   type, and there is always one of these (a data type, an extension, a resource, including abstract ones). Otherwise the
  *   structure definition is a constraint on the stated type (and in this case, the type cannot be an abstract type). References
  *   are URLs that are relative to http://hl7.org/fhir/StructureDefinition e.g. "string" is a reference to
  *   http://hl7.org/fhir/StructureDefinition/string. Absolute URLs are only allowed in logical models.
  * @param title
  *   - A short, descriptive, user-friendly title for the structure definition.
  * @param status
  *   - The status of this structure definition. Enables tracking the life-cycle of the content.
  * @param version
  *   - The identifier that is used to identify this version of the structure definition when it is referenced in a
  *   specification, model, design or instance. This is an arbitrary value managed by the structure definition author and is not
  *   expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available.
  *   There is also no expectation that versions can be placed in a lexicographical sequence.
  * @param contact
  *   - Contact details to assist a user in finding and communicating with the publisher.
  * @param purpose
  *   - Explanation of why this structure definition is needed and why it has been designed as it has.
  * @param keyword
  *   - A set of key words or terms from external terminologies that may be used to assist with indexing and searching of
  *   templates nby describing the use of this structure definition, or the content it describes.
  * @param language
  *   - The base language in which the resource is written.
  * @param `abstract`
  *   - Whether structure this definition describes is abstract or not - that is, whether the structure is not intended to be
  *   instantiated. For Resources and Data types, abstract types will never be exchanged between systems.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param publisher
  *   - The name of the organization or individual that published the structure definition.
  * @param copyright
  *   - A copyright statement relating to the structure definition and/or its contents. Copyright statements are generally legal
  *   restrictions on the use and publishing of the structure definition.
  * @param identifier
  *   - A formal identifier that is used to identify this structure definition when it is represented in other formats, or
  *   referenced in a specification, model, design or an instance.
  * @param useContext
  *   - The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be
  *   general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be
  *   used to assist with indexing and searching for appropriate structure definition instances.
  * @param derivation
  *   - How the type relates to the baseDefinition.
  * @param description
  *   - A free text natural language description of the structure definition from a consumer's perspective.
  * @param fhirVersion
  *   - The version of the FHIR specification on which this StructureDefinition is based - this is the formal version of the
  *   specification, without the revision number, e.g. [publication].[major].[minor], which is 4.0.1. for this version.
  * @param experimental
  *   - A Boolean value to indicate that this structure definition is authored for testing purposes (or
  *   education/evaluation/marketing) and is not intended to be used for genuine usage.
  * @param jurisdiction
  *   - A legal or geographic region in which the structure definition is intended to be used.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param baseDefinition
  *   - An absolute URI that is the base structure from which this type is derived, either by specialization or constraint.
  * @param contextInvariant
  *   - A set of rules as FHIRPath Invariants about when the extension can be used (e.g. co-occurrence variants for the
  *   extension). All the rules must be true.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that
  *   modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *   Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *   strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *   extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *   processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any
  *   elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param mapping
  *   - An external specification that the content is mapped to.
  * @param context
  *   - Identifies the types of resource or data type elements to which the extension can be applied.
  * @param snapshot
  *   - A snapshot view is expressed in a standalone form that can be used and interpreted without considering the base
  *   StructureDefinition.
  * @param differential
  *   - A differential view is expressed relative to the base StructureDefinition - a statement of differences that it applies.
  */
@POJOBoilerplate
class StructureDefinition(
    override val id: Option[String] = None,
    val url: UriStr,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val name: String,
    val date: Option[FHIRDateTime] = None,
    val kind: STRUCTURE_DEFINITION_KIND,
    val `type`: UriStr,
    val title: Option[String] = None,
    val status: PUBLICATION_STATUS,
    val version: Option[String] = None,
    val contact: LitSeq[ContactDetail] = LitSeq.empty,
    val purpose: Option[Markdown] = None,
    val keyword: LitSeq[Coding] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    val `abstract`: Boolean,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val publisher: Option[String] = None,
    val copyright: Option[Markdown] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val useContext: LitSeq[UsageContext] = LitSeq.empty,
    val derivation: Option[TYPE_DERIVATION_RULE] = None,
    val description: Option[Markdown] = None,
    val fhirVersion: Option[FHIR_VERSION] = None,
    val experimental: Option[Boolean] = None,
    val jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    val baseDefinition: Option[Canonical] = None,
    val contextInvariant: LitSeq[String] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val mapping: LitSeq[StructureDefinition.Mapping] = LitSeq.empty,
    val context: LitSeq[StructureDefinition.Context] = LitSeq.empty,
    val snapshot: Option[StructureDefinition.Snapshot] = None,
    val differential: Option[StructureDefinition.Differential] = None,
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
  override val thisTypeName: String = "StructureDefinition"
}
