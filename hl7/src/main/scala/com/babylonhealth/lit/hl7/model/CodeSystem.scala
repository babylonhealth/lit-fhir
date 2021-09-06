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
  PUBLICATION_STATUS,
  CONCEPT_PROPERTY_TYPE,
  CODESYSTEM_HIERARCHY_MEANING,
  CODESYSTEM_CONTENT_MODE,
  FILTER_OPERATOR
}
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object CodeSystem extends CompanionFor[CodeSystem] {
  implicit def summonObjectAndCompanionCodeSystem_260835279(o: CodeSystem): ObjectAndCompanion[CodeSystem, CodeSystem.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = CodeSystem
  override type ParentType   = CodeSystem
  override val baseType: CompanionFor[ResourceType] = CodeSystem
  override val parentType: CompanionFor[ParentType] = CodeSystem
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/CodeSystem")
  object Concept extends CompanionFor[Concept] {
    implicit def summonObjectAndCompanionConcept_2141059784(o: Concept): ObjectAndCompanion[Concept, Concept.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Concept
    override type ParentType   = Concept
    override val parentType: CompanionFor[ResourceType] = Concept
    object Property extends CompanionFor[Property] {
      implicit def summonObjectAndCompanionProperty2013341484(o: Property): ObjectAndCompanion[Property, Property.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Property
      override type ParentType   = Property
      override val parentType: CompanionFor[ResourceType] = Property
      type ValueChoice = Choice[Union00566743606]
      def apply(
          id: Option[String] = None,
          code: Code,
          value: Property.ValueChoice,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Property = new Property(
        id,
        code,
        value,
        extension,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(o: Property): Option[(Option[String], Code, Property.ValueChoice, LitSeq[Extension], LitSeq[Extension])] = Some(
        (o.id, o.code, o.value, o.extension, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val code: FHIRComponentFieldMeta[Code] =
        FHIRComponentFieldMeta("code", lTagOf[Code], false, lTagOf[Code])
      val value: FHIRComponentFieldMeta[Property.ValueChoice] =
        FHIRComponentFieldMeta("value", lTagOf[Property.ValueChoice], true, lTagOf[Union00566743606])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, code, value, extension, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Property): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Code](code, t.code),
        FHIRComponentField[Property.ValueChoice](value, t.value),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Property] = this
      val thisName: String                 = "Property"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Property] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Property(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Code]("code", None),
              cursor.decodeRef[Union00566743606]("value"),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Property(
        override val id: Option[String] = None,
        val code: Code,
        val value: Property.ValueChoice,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object Designation extends CompanionFor[Designation] {
      implicit def summonObjectAndCompanionDesignation2013341484(
          o: Designation): ObjectAndCompanion[Designation, Designation.type] = ObjectAndCompanion(o, this)
      override type ResourceType = Designation
      override type ParentType   = Designation
      override val parentType: CompanionFor[ResourceType] = Designation
      def apply(
          id: Option[String] = None,
          use: Option[Coding] = None,
          value: String,
          language: Option[LANGUAGES] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Designation = new Designation(
        id,
        use,
        value,
        language,
        extension,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Designation): Option[(Option[String], Option[Coding], String, Option[LANGUAGES], LitSeq[Extension], LitSeq[Extension])] =
        Some((o.id, o.use, o.value, o.language, o.extension, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val use: FHIRComponentFieldMeta[Option[Coding]] =
        FHIRComponentFieldMeta("use", lTagOf[Option[Coding]], false, lTagOf[Coding])
      val value: FHIRComponentFieldMeta[String] =
        FHIRComponentFieldMeta("value", lTagOf[String], false, lTagOf[String])
      val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
        FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, use, value, language, extension, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Designation): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[Coding]](use, t.use),
        FHIRComponentField[String](value, t.value),
        FHIRComponentField[Option[LANGUAGES]](language, t.language),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Designation] = this
      val thisName: String                    = "Designation"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Designation] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Designation(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[Coding]]("use", Some(None)),
              cursor.decodeAs[String]("value", None),
              cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Designation(
        override val id: Option[String] = None,
        val use: Option[Coding] = None,
        val value: String,
        val language: Option[LANGUAGES] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        code: Code,
        display: Option[String] = None,
        concept: LitSeq[CodeSystem.Concept] = LitSeq.empty,
        extension: LitSeq[Extension] = LitSeq.empty,
        definition: Option[String] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        property: LitSeq[Concept.Property] = LitSeq.empty,
        designation: LitSeq[Concept.Designation] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Concept = new Concept(
      id,
      code,
      display,
      concept,
      extension,
      definition,
      modifierExtension,
      property,
      designation,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Concept): Option[(Option[String], Code, Option[String], LitSeq[CodeSystem.Concept], LitSeq[Extension], Option[String], LitSeq[Extension], LitSeq[Concept.Property], LitSeq[Concept.Designation])] =
      Some((o.id, o.code, o.display, o.concept, o.extension, o.definition, o.modifierExtension, o.property, o.designation))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val code: FHIRComponentFieldMeta[Code] =
      FHIRComponentFieldMeta("code", lTagOf[Code], false, lTagOf[Code])
    val display: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("display", lTagOf[Option[String]], false, lTagOf[String])
    val concept: FHIRComponentFieldMeta[LitSeq[CodeSystem.Concept]] =
      FHIRComponentFieldMeta("concept", lTagOf[LitSeq[CodeSystem.Concept]], false, lTagOf[CodeSystem.Concept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val definition: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("definition", lTagOf[Option[String]], false, lTagOf[String])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val property: FHIRComponentFieldMeta[LitSeq[Concept.Property]] =
      FHIRComponentFieldMeta("property", lTagOf[LitSeq[Concept.Property]], false, lTagOf[Concept.Property])
    val designation: FHIRComponentFieldMeta[LitSeq[Concept.Designation]] =
      FHIRComponentFieldMeta("designation", lTagOf[LitSeq[Concept.Designation]], false, lTagOf[Concept.Designation])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, code, display, concept, extension, definition, modifierExtension, property, designation)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Concept): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Code](code, t.code),
      FHIRComponentField[Option[String]](display, t.display),
      FHIRComponentField[LitSeq[CodeSystem.Concept]](concept, t.concept),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[String]](definition, t.definition),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[Concept.Property]](property, t.property),
      FHIRComponentField[LitSeq[Concept.Designation]](designation, t.designation)
    )
    val baseType: CompanionFor[Concept] = this
    val thisName: String                = "Concept"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Concept] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Concept(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Code]("code", None),
            cursor.decodeAs[Option[String]]("display", Some(None)),
            cursor.decodeAs[LitSeq[CodeSystem.Concept]]("concept", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("definition", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Concept.Property]]("property", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Concept.Designation]]("designation", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Concept(
      override val id: Option[String] = None,
      val code: Code,
      val display: Option[String] = None,
      val concept: LitSeq[CodeSystem.Concept] = LitSeq.empty,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val definition: Option[String] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val property: LitSeq[Concept.Property] = LitSeq.empty,
      val designation: LitSeq[Concept.Designation] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Property extends CompanionFor[Property] {
    implicit def summonObjectAndCompanionProperty_2141059784(o: Property): ObjectAndCompanion[Property, Property.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Property
    override type ParentType   = Property
    override val parentType: CompanionFor[ResourceType] = Property
    def apply(
        id: Option[String] = None,
        uri: Option[UriStr] = None,
        code: Code,
        `type`: CONCEPT_PROPERTY_TYPE,
        extension: LitSeq[Extension] = LitSeq.empty,
        description: Option[String] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Property = new Property(
      id,
      uri,
      code,
      `type`,
      extension,
      description,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Property): Option[(Option[String], Option[UriStr], Code, CONCEPT_PROPERTY_TYPE, LitSeq[Extension], Option[String], LitSeq[Extension])] =
      Some((o.id, o.uri, o.code, o.`type`, o.extension, o.description, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val uri: FHIRComponentFieldMeta[Option[UriStr]] =
      FHIRComponentFieldMeta("uri", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
    val code: FHIRComponentFieldMeta[Code] =
      FHIRComponentFieldMeta("code", lTagOf[Code], false, lTagOf[Code])
    val `type`: FHIRComponentFieldMeta[CONCEPT_PROPERTY_TYPE] =
      FHIRComponentFieldMeta("type", lTagOf[CONCEPT_PROPERTY_TYPE], false, lTagOf[CONCEPT_PROPERTY_TYPE])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val description: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, uri, code, `type`, extension, description, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Property): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[UriStr]](uri, t.uri),
      FHIRComponentField[Code](code, t.code),
      FHIRComponentField[CONCEPT_PROPERTY_TYPE](`type`, t.`type`),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[String]](description, t.description),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Property] = this
    val thisName: String                 = "Property"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Property] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Property(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[UriStr]]("uri", Some(None)),
            cursor.decodeAs[Code]("code", None),
            cursor.decodeAs[CONCEPT_PROPERTY_TYPE]("type", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("description", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Property(
      override val id: Option[String] = None,
      val uri: Option[UriStr] = None,
      val code: Code,
      val `type`: CONCEPT_PROPERTY_TYPE,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val description: Option[String] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Filter extends CompanionFor[Filter] {
    implicit def summonObjectAndCompanionFilter_2141059784(o: Filter): ObjectAndCompanion[Filter, Filter.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Filter
    override type ParentType   = Filter
    override val parentType: CompanionFor[ResourceType] = Filter
    def apply(
        id: Option[String] = None,
        code: Code,
        value: String,
        operator: NonEmptyLitSeq[FILTER_OPERATOR],
        extension: LitSeq[Extension] = LitSeq.empty,
        description: Option[String] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Filter = new Filter(
      id,
      code,
      value,
      operator,
      extension,
      description,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Filter): Option[(Option[String], Code, String, NonEmptyLitSeq[FILTER_OPERATOR], LitSeq[Extension], Option[String], LitSeq[Extension])] =
      Some((o.id, o.code, o.value, o.operator, o.extension, o.description, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val code: FHIRComponentFieldMeta[Code] =
      FHIRComponentFieldMeta("code", lTagOf[Code], false, lTagOf[Code])
    val value: FHIRComponentFieldMeta[String] =
      FHIRComponentFieldMeta("value", lTagOf[String], false, lTagOf[String])
    val operator: FHIRComponentFieldMeta[NonEmptyLitSeq[FILTER_OPERATOR]] =
      FHIRComponentFieldMeta("operator", lTagOf[NonEmptyLitSeq[FILTER_OPERATOR]], false, lTagOf[FILTER_OPERATOR])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val description: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, code, value, operator, extension, description, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Filter): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Code](code, t.code),
      FHIRComponentField[String](value, t.value),
      FHIRComponentField[NonEmptyLitSeq[FILTER_OPERATOR]](operator, t.operator),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[String]](description, t.description),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Filter] = this
    val thisName: String               = "Filter"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Filter] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Filter(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Code]("code", None),
            cursor.decodeAs[String]("value", None),
            cursor.decodeAs[NonEmptyLitSeq[FILTER_OPERATOR]]("operator", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("description", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Filter(
      override val id: Option[String] = None,
      val code: Code,
      val value: String,
      val operator: NonEmptyLitSeq[FILTER_OPERATOR],
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val description: Option[String] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      url: Option[UriStr] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      name: Option[String] = None,
      date: Option[FHIRDateTime] = None,
      title: Option[String] = None,
      count: Option[UnsignedInt] = None,
      status: PUBLICATION_STATUS,
      version: Option[String] = None,
      contact: LitSeq[ContactDetail] = LitSeq.empty,
      purpose: Option[Markdown] = None,
      content: CODESYSTEM_CONTENT_MODE,
      language: Option[LANGUAGES] = None,
      valueSet: Option[Canonical] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      publisher: Option[String] = None,
      copyright: Option[Markdown] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      useContext: LitSeq[UsageContext] = LitSeq.empty,
      description: Option[Markdown] = None,
      supplements: Option[Canonical] = None,
      experimental: Option[Boolean] = None,
      jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      caseSensitive: Option[Boolean] = None,
      compositional: Option[Boolean] = None,
      versionNeeded: Option[Boolean] = None,
      hierarchyMeaning: Option[CODESYSTEM_HIERARCHY_MEANING] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      filter: LitSeq[CodeSystem.Filter] = LitSeq.empty,
      property: LitSeq[CodeSystem.Property] = LitSeq.empty,
      concept: LitSeq[CodeSystem.Concept] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): CodeSystem = new CodeSystem(
    id,
    url,
    meta,
    text,
    name,
    date,
    title,
    count,
    status,
    version,
    contact,
    purpose,
    content,
    language,
    valueSet,
    contained,
    extension,
    publisher,
    copyright,
    identifier,
    useContext,
    description,
    supplements,
    experimental,
    jurisdiction,
    implicitRules,
    caseSensitive,
    compositional,
    versionNeeded,
    hierarchyMeaning,
    modifierExtension,
    filter,
    property,
    concept,
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
  val date: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("date", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val title: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("title", lTagOf[Option[String]], false, lTagOf[String])
  val count: FHIRComponentFieldMeta[Option[UnsignedInt]] =
    FHIRComponentFieldMeta("count", lTagOf[Option[UnsignedInt]], false, lTagOf[UnsignedInt])
  val status: FHIRComponentFieldMeta[PUBLICATION_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[PUBLICATION_STATUS], false, lTagOf[PUBLICATION_STATUS])
  val version: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("version", lTagOf[Option[String]], false, lTagOf[String])
  val contact: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("contact", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val purpose: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("purpose", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val content: FHIRComponentFieldMeta[CODESYSTEM_CONTENT_MODE] =
    FHIRComponentFieldMeta("content", lTagOf[CODESYSTEM_CONTENT_MODE], false, lTagOf[CODESYSTEM_CONTENT_MODE])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val valueSet: FHIRComponentFieldMeta[Option[Canonical]] =
    FHIRComponentFieldMeta("valueSet", lTagOf[Option[Canonical]], false, lTagOf[Canonical])
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
  val description: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("description", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val supplements: FHIRComponentFieldMeta[Option[Canonical]] =
    FHIRComponentFieldMeta("supplements", lTagOf[Option[Canonical]], false, lTagOf[Canonical])
  val experimental: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("experimental", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val jurisdiction: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("jurisdiction", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val caseSensitive: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("caseSensitive", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val compositional: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("compositional", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val versionNeeded: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("versionNeeded", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val hierarchyMeaning: FHIRComponentFieldMeta[Option[CODESYSTEM_HIERARCHY_MEANING]] =
    FHIRComponentFieldMeta(
      "hierarchyMeaning",
      lTagOf[Option[CODESYSTEM_HIERARCHY_MEANING]],
      false,
      lTagOf[CODESYSTEM_HIERARCHY_MEANING])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val filter: FHIRComponentFieldMeta[LitSeq[CodeSystem.Filter]] =
    FHIRComponentFieldMeta("filter", lTagOf[LitSeq[CodeSystem.Filter]], false, lTagOf[CodeSystem.Filter])
  val property: FHIRComponentFieldMeta[LitSeq[CodeSystem.Property]] =
    FHIRComponentFieldMeta("property", lTagOf[LitSeq[CodeSystem.Property]], false, lTagOf[CodeSystem.Property])
  val concept: FHIRComponentFieldMeta[LitSeq[CodeSystem.Concept]] =
    FHIRComponentFieldMeta("concept", lTagOf[LitSeq[CodeSystem.Concept]], false, lTagOf[CodeSystem.Concept])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    url,
    meta,
    text,
    name,
    date,
    title,
    count,
    status,
    version,
    contact,
    purpose,
    content,
    language,
    valueSet,
    contained,
    extension,
    publisher,
    copyright,
    identifier,
    useContext,
    description,
    supplements,
    experimental,
    jurisdiction,
    implicitRules,
    caseSensitive,
    compositional,
    versionNeeded,
    hierarchyMeaning,
    modifierExtension,
    filter,
    property,
    concept
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: CodeSystem): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[UriStr]](url, t.url),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[String]](name, t.name),
    FHIRComponentField[Option[FHIRDateTime]](date, t.date),
    FHIRComponentField[Option[String]](title, t.title),
    FHIRComponentField[Option[UnsignedInt]](count, t.count),
    FHIRComponentField[PUBLICATION_STATUS](status, t.status),
    FHIRComponentField[Option[String]](version, t.version),
    FHIRComponentField[LitSeq[ContactDetail]](contact, t.contact),
    FHIRComponentField[Option[Markdown]](purpose, t.purpose),
    FHIRComponentField[CODESYSTEM_CONTENT_MODE](content, t.content),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Option[Canonical]](valueSet, t.valueSet),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[String]](publisher, t.publisher),
    FHIRComponentField[Option[Markdown]](copyright, t.copyright),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[LitSeq[UsageContext]](useContext, t.useContext),
    FHIRComponentField[Option[Markdown]](description, t.description),
    FHIRComponentField[Option[Canonical]](supplements, t.supplements),
    FHIRComponentField[Option[Boolean]](experimental, t.experimental),
    FHIRComponentField[LitSeq[CodeableConcept]](jurisdiction, t.jurisdiction),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[Boolean]](caseSensitive, t.caseSensitive),
    FHIRComponentField[Option[Boolean]](compositional, t.compositional),
    FHIRComponentField[Option[Boolean]](versionNeeded, t.versionNeeded),
    FHIRComponentField[Option[CODESYSTEM_HIERARCHY_MEANING]](hierarchyMeaning, t.hierarchyMeaning),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[CodeSystem.Filter]](filter, t.filter),
    FHIRComponentField[LitSeq[CodeSystem.Property]](property, t.property),
    FHIRComponentField[LitSeq[CodeSystem.Concept]](concept, t.concept)
  )
  def extractId(t: CodeSystem): Option[String]                                     = t.id
  def extractUrl(t: CodeSystem): Option[UriStr]                                    = t.url
  def extractMeta(t: CodeSystem): Option[Meta]                                     = t.meta
  def extractText(t: CodeSystem): Option[Narrative]                                = t.text
  def extractName(t: CodeSystem): Option[String]                                   = t.name
  def extractDate(t: CodeSystem): Option[FHIRDateTime]                             = t.date
  def extractTitle(t: CodeSystem): Option[String]                                  = t.title
  def extractCount(t: CodeSystem): Option[UnsignedInt]                             = t.count
  def extractStatus(t: CodeSystem): PUBLICATION_STATUS                             = t.status
  def extractVersion(t: CodeSystem): Option[String]                                = t.version
  def extractContact(t: CodeSystem): LitSeq[ContactDetail]                         = t.contact
  def extractPurpose(t: CodeSystem): Option[Markdown]                              = t.purpose
  def extractContent(t: CodeSystem): CODESYSTEM_CONTENT_MODE                       = t.content
  def extractLanguage(t: CodeSystem): Option[LANGUAGES]                            = t.language
  def extractValueSet(t: CodeSystem): Option[Canonical]                            = t.valueSet
  def extractContained(t: CodeSystem): LitSeq[Resource]                            = t.contained
  def extractExtension(t: CodeSystem): LitSeq[Extension]                           = t.extension
  def extractPublisher(t: CodeSystem): Option[String]                              = t.publisher
  def extractCopyright(t: CodeSystem): Option[Markdown]                            = t.copyright
  def extractIdentifier(t: CodeSystem): LitSeq[Identifier]                         = t.identifier
  def extractUseContext(t: CodeSystem): LitSeq[UsageContext]                       = t.useContext
  def extractDescription(t: CodeSystem): Option[Markdown]                          = t.description
  def extractSupplements(t: CodeSystem): Option[Canonical]                         = t.supplements
  def extractExperimental(t: CodeSystem): Option[Boolean]                          = t.experimental
  def extractJurisdiction(t: CodeSystem): LitSeq[CodeableConcept]                  = t.jurisdiction
  def extractImplicitRules(t: CodeSystem): Option[UriStr]                          = t.implicitRules
  def extractCaseSensitive(t: CodeSystem): Option[Boolean]                         = t.caseSensitive
  def extractCompositional(t: CodeSystem): Option[Boolean]                         = t.compositional
  def extractVersionNeeded(t: CodeSystem): Option[Boolean]                         = t.versionNeeded
  def extractHierarchyMeaning(t: CodeSystem): Option[CODESYSTEM_HIERARCHY_MEANING] = t.hierarchyMeaning
  def extractModifierExtension(t: CodeSystem): LitSeq[Extension]                   = t.modifierExtension
  def extractFilter(t: CodeSystem): LitSeq[CodeSystem.Filter]                      = t.filter
  def extractProperty(t: CodeSystem): LitSeq[CodeSystem.Property]                  = t.property
  def extractConcept(t: CodeSystem): LitSeq[CodeSystem.Concept]                    = t.concept
  override val thisName: String                                                    = "CodeSystem"
  override val searchParams: Map[String, CodeSystem => Seq[Any]] = Map(
    "jurisdiction"          -> (obj => obj.jurisdiction.toSeq),
    "system"                -> (obj => obj.url.toSeq),
    "description"           -> (obj => obj.description.toSeq),
    "context"               -> (obj => obj.useContext.map(_.value).flatMap(_.as[CodeableConcept]).toSeq),
    "code"                  -> (obj => obj.concept.map(_.code).toSeq),
    "language"              -> (obj => obj.concept.flatMap(_.designation).flatMap(_.language).toSeq),
    "date"                  -> (obj => obj.date.toSeq),
    "context-type"          -> (obj => obj.useContext.map(_.code).toSeq),
    "name"                  -> (obj => obj.name.toSeq),
    "supplements"           -> (obj => obj.supplements.toSeq),
    "context-type-quantity" -> (obj => obj.useContext.toSeq),
    "content-mode"          -> (obj => Seq(obj.content)),
    "identifier"            -> (obj => obj.identifier.toSeq),
    "url"                   -> (obj => obj.url.toSeq),
    "context-type-value"    -> (obj => obj.useContext.toSeq),
    "version"               -> (obj => obj.version.toSeq),
    "status"                -> (obj => Seq(obj.status)),
    "publisher"             -> (obj => obj.publisher.toSeq),
    "title"                 -> (obj => obj.title.toSeq),
    "context-quantity" -> (obj =>
      obj.useContext.map(_.value).flatMap(_.as[Quantity]).toSeq ++
        obj.useContext.map(_.value).flatMap(_.as[Range]).toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[CodeSystem] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new CodeSystem(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[UriStr]]("url", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[String]]("name", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("date", Some(None)),
          cursor.decodeAs[Option[String]]("title", Some(None)),
          cursor.decodeAs[Option[UnsignedInt]]("count", Some(None)),
          cursor.decodeAs[PUBLICATION_STATUS]("status", None),
          cursor.decodeAs[Option[String]]("version", Some(None)),
          cursor.decodeAs[LitSeq[ContactDetail]]("contact", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Markdown]]("purpose", Some(None)),
          cursor.decodeAs[CODESYSTEM_CONTENT_MODE]("content", None),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[Canonical]]("valueSet", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("publisher", Some(None)),
          cursor.decodeAs[Option[Markdown]]("copyright", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[UsageContext]]("useContext", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Markdown]]("description", Some(None)),
          cursor.decodeAs[Option[Canonical]]("supplements", Some(None)),
          cursor.decodeAs[Option[Boolean]]("experimental", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("jurisdiction", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[Boolean]]("caseSensitive", Some(None)),
          cursor.decodeAs[Option[Boolean]]("compositional", Some(None)),
          cursor.decodeAs[Option[Boolean]]("versionNeeded", Some(None)),
          cursor.decodeAs[Option[CODESYSTEM_HIERARCHY_MEANING]]("hierarchyMeaning", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeSystem.Filter]]("filter", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeSystem.Property]]("property", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeSystem.Concept]]("concept", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** The CodeSystem resource is used to declare the existence of and describe a code system or code system supplement and its key
  * properties, and optionally define a part or all of its content.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields url, name, date, title, count, status, version, contact, purpose, content, valueSet, publisher,
  *   copyright, identifier, useContext, description, supplements, experimental, jurisdiction, caseSensitive, compositional,
  *   versionNeeded, hierarchyMeaning, filter, property, concept.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param url
  *   - An absolute URI that is used to identify this code system when it is referenced in a specification, model, design or an
  *   instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at
  *   which an authoritative instance of this code system is (or will be) published. This URL can be the target of a canonical
  *   reference. It SHALL remain the same when the code system is stored on different servers. This is used in
  *   [Coding](datatypes.html#Coding).system.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *   not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *   resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to
  *   make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be
  *   represented in the narrative to ensure clinical safety.
  * @param name
  *   - A natural language name identifying the code system. This name should be usable as an identifier for the module by machine
  *   processing applications such as code generation.
  * @param date
  *   - The date (and optionally time) when the code system was published. The date must change when the business version changes
  *   and it must change if the status code changes. In addition, it should change when the substantive content of the code system
  *   changes.
  * @param title
  *   - A short, descriptive, user-friendly title for the code system.
  * @param count
  *   - The total number of concepts defined by the code system. Where the code system has a compositional grammar, the basis of
  *   this count is defined by the system steward.
  * @param status
  *   - The date (and optionally time) when the code system resource was created or revised.
  * @param version
  *   - The identifier that is used to identify this version of the code system when it is referenced in a specification, model,
  *   design or instance. This is an arbitrary value managed by the code system author and is not expected to be globally unique.
  *   For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation
  *   that versions can be placed in a lexicographical sequence. This is used in [Coding](datatypes.html#Coding).version.
  * @param contact
  *   - Contact details to assist a user in finding and communicating with the publisher.
  * @param purpose
  *   - Explanation of why this code system is needed and why it has been designed as it has.
  * @param content
  *   - The extent of the content of the code system (the concepts and codes it defines) are represented in this resource
  *   instance.
  * @param language
  *   - The base language in which the resource is written.
  * @param valueSet
  *   - Canonical reference to the value set that contains the entire code system.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param publisher
  *   - The name of the organization or individual that published the code system.
  * @param copyright
  *   - A copyright statement relating to the code system and/or its contents. Copyright statements are generally legal
  *   restrictions on the use and publishing of the code system.
  * @param identifier
  *   - A formal identifier that is used to identify this code system when it is represented in other formats, or referenced in a
  *   specification, model, design or an instance.
  * @param useContext
  *   - The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be
  *   general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be
  *   used to assist with indexing and searching for appropriate code system instances.
  * @param description
  *   - A free text natural language description of the code system from a consumer's perspective.
  * @param supplements
  *   - The canonical URL of the code system that this code system supplement is adding designations and properties to.
  * @param experimental
  *   - A Boolean value to indicate that this code system is authored for testing purposes (or education/evaluation/marketing) and
  *   is not intended to be used for genuine usage.
  * @param jurisdiction
  *   - A legal or geographic region in which the code system is intended to be used.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param caseSensitive
  *   - If code comparison is case sensitive when codes within this system are compared to each other.
  * @param compositional
  *   - The code system defines a compositional (post-coordination) grammar.
  * @param versionNeeded
  *   - This flag is used to signify that the code system does not commit to concept permanence across versions. If true, a
  *   version must be specified when referencing this code system.
  * @param hierarchyMeaning
  *   - The meaning of the hierarchy of concepts as represented in this resource.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *   the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually
  *   modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict
  *   set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param filter
  *   - A filter that can be used in a value set compose statement when selecting concepts using a filter.
  * @param property
  *   - A property defines an additional slot through which additional information can be provided about a concept.
  * @param concept
  *   - Concepts that are in the code system. The concept definitions are inherently hierarchical, but the definitions must be
  *   consulted to determine what the meanings of the hierarchical relationships are.
  */
@POJOBoilerplate
class CodeSystem(
    override val id: Option[String] = None,
    val url: Option[UriStr] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val name: Option[String] = None,
    val date: Option[FHIRDateTime] = None,
    val title: Option[String] = None,
    val count: Option[UnsignedInt] = None,
    val status: PUBLICATION_STATUS,
    val version: Option[String] = None,
    val contact: LitSeq[ContactDetail] = LitSeq.empty,
    val purpose: Option[Markdown] = None,
    val content: CODESYSTEM_CONTENT_MODE,
    override val language: Option[LANGUAGES] = None,
    val valueSet: Option[Canonical] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val publisher: Option[String] = None,
    val copyright: Option[Markdown] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val useContext: LitSeq[UsageContext] = LitSeq.empty,
    val description: Option[Markdown] = None,
    val supplements: Option[Canonical] = None,
    val experimental: Option[Boolean] = None,
    val jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    val caseSensitive: Option[Boolean] = None,
    val compositional: Option[Boolean] = None,
    val versionNeeded: Option[Boolean] = None,
    val hierarchyMeaning: Option[CODESYSTEM_HIERARCHY_MEANING] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val filter: LitSeq[CodeSystem.Filter] = LitSeq.empty,
    val property: LitSeq[CodeSystem.Property] = LitSeq.empty,
    val concept: LitSeq[CodeSystem.Concept] = LitSeq.empty,
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
  override val thisTypeName: String = "CodeSystem"
}
