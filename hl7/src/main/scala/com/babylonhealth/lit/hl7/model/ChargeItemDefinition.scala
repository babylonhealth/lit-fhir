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
import com.babylonhealth.lit.hl7.{ INVOICE_PRICECOMPONENTTYPE, PUBLICATION_STATUS }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object ChargeItemDefinition extends CompanionFor[ChargeItemDefinition] {
  implicit def summonObjectAndCompanionChargeItemDefinition991897615(
      o: ChargeItemDefinition): ObjectAndCompanion[ChargeItemDefinition, ChargeItemDefinition.type] = ObjectAndCompanion(o, this)
  override type ResourceType = ChargeItemDefinition
  override type ParentType   = ChargeItemDefinition
  override val baseType: CompanionFor[ResourceType] = ChargeItemDefinition
  override val parentType: CompanionFor[ParentType] = ChargeItemDefinition
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/ChargeItemDefinition")
  object PropertyGroup extends CompanionFor[PropertyGroup] {
    implicit def summonObjectAndCompanionPropertyGroup_631451276(
        o: PropertyGroup): ObjectAndCompanion[PropertyGroup, PropertyGroup.type] = ObjectAndCompanion(o, this)
    override type ResourceType = PropertyGroup
    override type ParentType   = PropertyGroup
    override val parentType: CompanionFor[ResourceType] = PropertyGroup
    object PriceComponent extends CompanionFor[PriceComponent] {
      implicit def summonObjectAndCompanionPriceComponent_800992306(
          o: PriceComponent): ObjectAndCompanion[PriceComponent, PriceComponent.type] = ObjectAndCompanion(o, this)
      override type ResourceType = PriceComponent
      override type ParentType   = PriceComponent
      override val parentType: CompanionFor[ResourceType] = PriceComponent
      def apply(
          id: Option[String] = None,
          `type`: INVOICE_PRICECOMPONENTTYPE,
          code: Option[CodeableConcept] = None,
          factor: Option[BigDecimal] = None,
          amount: Option[Money] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): PriceComponent = new PriceComponent(
        id,
        `type`,
        code,
        factor,
        amount,
        extension,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: PriceComponent): Option[(Option[String], INVOICE_PRICECOMPONENTTYPE, Option[CodeableConcept], Option[BigDecimal], Option[Money], LitSeq[Extension], LitSeq[Extension])] =
        Some((o.id, o.`type`, o.code, o.factor, o.amount, o.extension, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val `type`: FHIRComponentFieldMeta[INVOICE_PRICECOMPONENTTYPE] =
        FHIRComponentFieldMeta("type", lTagOf[INVOICE_PRICECOMPONENTTYPE], false, lTagOf[INVOICE_PRICECOMPONENTTYPE])
      val code: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("code", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val factor: FHIRComponentFieldMeta[Option[BigDecimal]] =
        FHIRComponentFieldMeta("factor", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
      val amount: FHIRComponentFieldMeta[Option[Money]] =
        FHIRComponentFieldMeta("amount", lTagOf[Option[Money]], false, lTagOf[Money])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, `type`, code, factor, amount, extension, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: PriceComponent): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[INVOICE_PRICECOMPONENTTYPE](`type`, t.`type`),
        FHIRComponentField[Option[CodeableConcept]](code, t.code),
        FHIRComponentField[Option[BigDecimal]](factor, t.factor),
        FHIRComponentField[Option[Money]](amount, t.amount),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[PriceComponent] = this
      val thisName: String                       = "PriceComponent"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[PriceComponent] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new PriceComponent(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[INVOICE_PRICECOMPONENTTYPE]("type", None),
              cursor.decodeAs[Option[CodeableConcept]]("code", Some(None)),
              cursor.decodeAs[Option[BigDecimal]]("factor", Some(None)),
              cursor.decodeAs[Option[Money]]("amount", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class PriceComponent(
        override val id: Option[String] = None,
        val `type`: INVOICE_PRICECOMPONENTTYPE,
        val code: Option[CodeableConcept] = None,
        val factor: Option[BigDecimal] = None,
        val amount: Option[Money] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        applicability: LitSeq[ChargeItemDefinition.Applicability] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        priceComponent: LitSeq[PropertyGroup.PriceComponent] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): PropertyGroup = new PropertyGroup(
      id,
      extension,
      applicability,
      modifierExtension,
      priceComponent,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: PropertyGroup): Option[(Option[String], LitSeq[Extension], LitSeq[ChargeItemDefinition.Applicability], LitSeq[Extension], LitSeq[PropertyGroup.PriceComponent])] =
      Some((o.id, o.extension, o.applicability, o.modifierExtension, o.priceComponent))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val applicability: FHIRComponentFieldMeta[LitSeq[ChargeItemDefinition.Applicability]] =
      FHIRComponentFieldMeta(
        "applicability",
        lTagOf[LitSeq[ChargeItemDefinition.Applicability]],
        false,
        lTagOf[ChargeItemDefinition.Applicability])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val priceComponent: FHIRComponentFieldMeta[LitSeq[PropertyGroup.PriceComponent]] =
      FHIRComponentFieldMeta(
        "priceComponent",
        lTagOf[LitSeq[PropertyGroup.PriceComponent]],
        false,
        lTagOf[PropertyGroup.PriceComponent])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, extension, applicability, modifierExtension, priceComponent)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: PropertyGroup): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[ChargeItemDefinition.Applicability]](applicability, t.applicability),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[PropertyGroup.PriceComponent]](priceComponent, t.priceComponent)
    )
    val baseType: CompanionFor[PropertyGroup] = this
    val thisName: String                      = "PropertyGroup"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[PropertyGroup] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new PropertyGroup(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[ChargeItemDefinition.Applicability]]("applicability", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[PropertyGroup.PriceComponent]]("priceComponent", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class PropertyGroup(
      override val id: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val applicability: LitSeq[ChargeItemDefinition.Applicability] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val priceComponent: LitSeq[PropertyGroup.PriceComponent] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Applicability extends CompanionFor[Applicability] {
    implicit def summonObjectAndCompanionApplicability_631451276(
        o: Applicability): ObjectAndCompanion[Applicability, Applicability.type] = ObjectAndCompanion(o, this)
    override type ResourceType = Applicability
    override type ParentType   = Applicability
    override val parentType: CompanionFor[ResourceType] = Applicability
    def apply(
        id: Option[String] = None,
        language: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        expression: Option[String] = None,
        description: Option[String] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Applicability = new Applicability(
      id,
      language,
      extension,
      expression,
      description,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Applicability): Option[(Option[String], Option[String], LitSeq[Extension], Option[String], Option[String], LitSeq[Extension])] =
      Some((o.id, o.language, o.extension, o.expression, o.description, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val language: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("language", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val expression: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("expression", lTagOf[Option[String]], false, lTagOf[String])
    val description: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, language, extension, expression, description, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Applicability): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[String]](language, t.language),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[String]](expression, t.expression),
      FHIRComponentField[Option[String]](description, t.description),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Applicability] = this
    val thisName: String                      = "Applicability"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Applicability] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Applicability(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[String]]("language", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("expression", Some(None)),
            cursor.decodeAs[Option[String]]("description", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Applicability(
      override val id: Option[String] = None,
      val language: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val expression: Option[String] = None,
      val description: Option[String] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      url: UriStr,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      date: Option[FHIRDateTime] = None,
      code: Option[CodeableConcept] = None,
      title: Option[String] = None,
      partOf: LitSeq[Canonical] = LitSeq.empty,
      status: PUBLICATION_STATUS,
      version: Option[String] = None,
      contact: LitSeq[ContactDetail] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      replaces: LitSeq[Canonical] = LitSeq.empty,
      instance: LitSeq[Reference] = LitSeq.empty,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      publisher: Option[String] = None,
      copyright: Option[Markdown] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      useContext: LitSeq[UsageContext] = LitSeq.empty,
      description: Option[Markdown] = None,
      experimental: Option[Boolean] = None,
      jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
      approvalDate: Option[FHIRDate] = None,
      implicitRules: Option[UriStr] = None,
      derivedFromUri: LitSeq[UriStr] = LitSeq.empty,
      lastReviewDate: Option[FHIRDate] = None,
      effectivePeriod: Option[Period] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      applicability: LitSeq[ChargeItemDefinition.Applicability] = LitSeq.empty,
      propertyGroup: LitSeq[ChargeItemDefinition.PropertyGroup] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): ChargeItemDefinition = new ChargeItemDefinition(
    id,
    url,
    meta,
    text,
    date,
    code,
    title,
    partOf,
    status,
    version,
    contact,
    language,
    replaces,
    instance,
    contained,
    extension,
    publisher,
    copyright,
    identifier,
    useContext,
    description,
    experimental,
    jurisdiction,
    approvalDate,
    implicitRules,
    derivedFromUri,
    lastReviewDate,
    effectivePeriod,
    modifierExtension,
    applicability,
    propertyGroup,
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
  val date: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("date", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val code: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("code", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val title: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("title", lTagOf[Option[String]], false, lTagOf[String])
  val partOf: FHIRComponentFieldMeta[LitSeq[Canonical]] =
    FHIRComponentFieldMeta("partOf", lTagOf[LitSeq[Canonical]], false, lTagOf[Canonical])
  val status: FHIRComponentFieldMeta[PUBLICATION_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[PUBLICATION_STATUS], false, lTagOf[PUBLICATION_STATUS])
  val version: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("version", lTagOf[Option[String]], false, lTagOf[String])
  val contact: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("contact", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val replaces: FHIRComponentFieldMeta[LitSeq[Canonical]] =
    FHIRComponentFieldMeta("replaces", lTagOf[LitSeq[Canonical]], false, lTagOf[Canonical])
  val instance: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("instance", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
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
  val experimental: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("experimental", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val jurisdiction: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("jurisdiction", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val approvalDate: FHIRComponentFieldMeta[Option[FHIRDate]] =
    FHIRComponentFieldMeta("approvalDate", lTagOf[Option[FHIRDate]], false, lTagOf[FHIRDate])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val derivedFromUri: FHIRComponentFieldMeta[LitSeq[UriStr]] =
    FHIRComponentFieldMeta("derivedFromUri", lTagOf[LitSeq[UriStr]], false, lTagOf[UriStr])
  val lastReviewDate: FHIRComponentFieldMeta[Option[FHIRDate]] =
    FHIRComponentFieldMeta("lastReviewDate", lTagOf[Option[FHIRDate]], false, lTagOf[FHIRDate])
  val effectivePeriod: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("effectivePeriod", lTagOf[Option[Period]], false, lTagOf[Period])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val applicability: FHIRComponentFieldMeta[LitSeq[ChargeItemDefinition.Applicability]] =
    FHIRComponentFieldMeta(
      "applicability",
      lTagOf[LitSeq[ChargeItemDefinition.Applicability]],
      false,
      lTagOf[ChargeItemDefinition.Applicability])
  val propertyGroup: FHIRComponentFieldMeta[LitSeq[ChargeItemDefinition.PropertyGroup]] =
    FHIRComponentFieldMeta(
      "propertyGroup",
      lTagOf[LitSeq[ChargeItemDefinition.PropertyGroup]],
      false,
      lTagOf[ChargeItemDefinition.PropertyGroup])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    url,
    meta,
    text,
    date,
    code,
    title,
    partOf,
    status,
    version,
    contact,
    language,
    replaces,
    instance,
    contained,
    extension,
    publisher,
    copyright,
    identifier,
    useContext,
    description,
    experimental,
    jurisdiction,
    approvalDate,
    implicitRules,
    derivedFromUri,
    lastReviewDate,
    effectivePeriod,
    modifierExtension,
    applicability,
    propertyGroup
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: ChargeItemDefinition): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[UriStr](url, t.url),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[FHIRDateTime]](date, t.date),
    FHIRComponentField[Option[CodeableConcept]](code, t.code),
    FHIRComponentField[Option[String]](title, t.title),
    FHIRComponentField[LitSeq[Canonical]](partOf, t.partOf),
    FHIRComponentField[PUBLICATION_STATUS](status, t.status),
    FHIRComponentField[Option[String]](version, t.version),
    FHIRComponentField[LitSeq[ContactDetail]](contact, t.contact),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Canonical]](replaces, t.replaces),
    FHIRComponentField[LitSeq[Reference]](instance, t.instance),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[String]](publisher, t.publisher),
    FHIRComponentField[Option[Markdown]](copyright, t.copyright),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[LitSeq[UsageContext]](useContext, t.useContext),
    FHIRComponentField[Option[Markdown]](description, t.description),
    FHIRComponentField[Option[Boolean]](experimental, t.experimental),
    FHIRComponentField[LitSeq[CodeableConcept]](jurisdiction, t.jurisdiction),
    FHIRComponentField[Option[FHIRDate]](approvalDate, t.approvalDate),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[UriStr]](derivedFromUri, t.derivedFromUri),
    FHIRComponentField[Option[FHIRDate]](lastReviewDate, t.lastReviewDate),
    FHIRComponentField[Option[Period]](effectivePeriod, t.effectivePeriod),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[ChargeItemDefinition.Applicability]](applicability, t.applicability),
    FHIRComponentField[LitSeq[ChargeItemDefinition.PropertyGroup]](propertyGroup, t.propertyGroup)
  )
  def extractId(t: ChargeItemDefinition): Option[String]                                        = t.id
  def extractUrl(t: ChargeItemDefinition): UriStr                                               = t.url
  def extractMeta(t: ChargeItemDefinition): Option[Meta]                                        = t.meta
  def extractText(t: ChargeItemDefinition): Option[Narrative]                                   = t.text
  def extractDate(t: ChargeItemDefinition): Option[FHIRDateTime]                                = t.date
  def extractCode(t: ChargeItemDefinition): Option[CodeableConcept]                             = t.code
  def extractTitle(t: ChargeItemDefinition): Option[String]                                     = t.title
  def extractPartOf(t: ChargeItemDefinition): LitSeq[Canonical]                                 = t.partOf
  def extractStatus(t: ChargeItemDefinition): PUBLICATION_STATUS                                = t.status
  def extractVersion(t: ChargeItemDefinition): Option[String]                                   = t.version
  def extractContact(t: ChargeItemDefinition): LitSeq[ContactDetail]                            = t.contact
  def extractLanguage(t: ChargeItemDefinition): Option[LANGUAGES]                               = t.language
  def extractReplaces(t: ChargeItemDefinition): LitSeq[Canonical]                               = t.replaces
  def extractInstance(t: ChargeItemDefinition): LitSeq[Reference]                               = t.instance
  def extractContained(t: ChargeItemDefinition): LitSeq[Resource]                               = t.contained
  def extractExtension(t: ChargeItemDefinition): LitSeq[Extension]                              = t.extension
  def extractPublisher(t: ChargeItemDefinition): Option[String]                                 = t.publisher
  def extractCopyright(t: ChargeItemDefinition): Option[Markdown]                               = t.copyright
  def extractIdentifier(t: ChargeItemDefinition): LitSeq[Identifier]                            = t.identifier
  def extractUseContext(t: ChargeItemDefinition): LitSeq[UsageContext]                          = t.useContext
  def extractDescription(t: ChargeItemDefinition): Option[Markdown]                             = t.description
  def extractExperimental(t: ChargeItemDefinition): Option[Boolean]                             = t.experimental
  def extractJurisdiction(t: ChargeItemDefinition): LitSeq[CodeableConcept]                     = t.jurisdiction
  def extractApprovalDate(t: ChargeItemDefinition): Option[FHIRDate]                            = t.approvalDate
  def extractImplicitRules(t: ChargeItemDefinition): Option[UriStr]                             = t.implicitRules
  def extractDerivedFromUri(t: ChargeItemDefinition): LitSeq[UriStr]                            = t.derivedFromUri
  def extractLastReviewDate(t: ChargeItemDefinition): Option[FHIRDate]                          = t.lastReviewDate
  def extractEffectivePeriod(t: ChargeItemDefinition): Option[Period]                           = t.effectivePeriod
  def extractModifierExtension(t: ChargeItemDefinition): LitSeq[Extension]                      = t.modifierExtension
  def extractApplicability(t: ChargeItemDefinition): LitSeq[ChargeItemDefinition.Applicability] = t.applicability
  def extractPropertyGroup(t: ChargeItemDefinition): LitSeq[ChargeItemDefinition.PropertyGroup] = t.propertyGroup
  override val thisName: String                                                                 = "ChargeItemDefinition"
  override val searchParams: Map[String, ChargeItemDefinition => Seq[Any]] = Map(
    "jurisdiction"          -> (obj => obj.jurisdiction.toSeq),
    "context-type-quantity" -> (obj => obj.useContext.toSeq),
    "description"           -> (obj => obj.description.toSeq),
    "context"               -> (obj => obj.useContext.map(_.value).flatMap(_.as[CodeableConcept]).toSeq),
    "effective"             -> (obj => obj.effectivePeriod.toSeq),
    "date"                  -> (obj => obj.date.toSeq),
    "context-type"          -> (obj => obj.useContext.map(_.code).toSeq),
    "identifier"            -> (obj => obj.identifier.toSeq),
    "url"                   -> (obj => Seq(obj.url)),
    "context-type-value"    -> (obj => obj.useContext.toSeq),
    "version"               -> (obj => obj.version.toSeq),
    "status"                -> (obj => Seq(obj.status)),
    "publisher"             -> (obj => obj.publisher.toSeq),
    "title"                 -> (obj => obj.title.toSeq),
    "context-quantity" -> (obj =>
      obj.useContext.map(_.value).flatMap(_.as[Quantity]).toSeq ++
        obj.useContext.map(_.value).flatMap(_.as[Range]).toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ChargeItemDefinition] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new ChargeItemDefinition(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[UriStr]("url", None),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("date", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("code", Some(None)),
          cursor.decodeAs[Option[String]]("title", Some(None)),
          cursor.decodeAs[LitSeq[Canonical]]("partOf", Some(LitSeq.empty)),
          cursor.decodeAs[PUBLICATION_STATUS]("status", None),
          cursor.decodeAs[Option[String]]("version", Some(None)),
          cursor.decodeAs[LitSeq[ContactDetail]]("contact", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Canonical]]("replaces", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("instance", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("publisher", Some(None)),
          cursor.decodeAs[Option[Markdown]]("copyright", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[UsageContext]]("useContext", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Markdown]]("description", Some(None)),
          cursor.decodeAs[Option[Boolean]]("experimental", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("jurisdiction", Some(LitSeq.empty)),
          cursor.decodeAs[Option[FHIRDate]]("approvalDate", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[UriStr]]("derivedFromUri", Some(LitSeq.empty)),
          cursor.decodeAs[Option[FHIRDate]]("lastReviewDate", Some(None)),
          cursor.decodeAs[Option[Period]]("effectivePeriod", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[ChargeItemDefinition.Applicability]]("applicability", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[ChargeItemDefinition.PropertyGroup]]("propertyGroup", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** The ChargeItemDefinition resource provides the properties that apply to the (billing) codes necessary to calculate costs and
  * prices. The properties may differ largely depending on type and realm, therefore this resource gives only a rough structure
  * and requires profiling for each type of billing code system.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields url, date, code, title, partOf, status, version, contact, replaces, instance, publisher, copyright,
  *   identifier, useContext, description, experimental, jurisdiction, approvalDate, derivedFromUri, lastReviewDate,
  *   effectivePeriod, applicability, propertyGroup.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param url
  *   - An absolute URI that is used to identify this charge item definition when it is referenced in a specification, model,
  *     design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal
  *     address at which at which an authoritative instance of this charge item definition is (or will be) published. This URL can
  *     be the target of a canonical reference. It SHALL remain the same when the charge item definition is stored on different
  *     servers.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *     not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *     resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail
  *     to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should
  *     be represented in the narrative to ensure clinical safety.
  * @param date
  *   - The date (and optionally time) when the charge item definition was published. The date must change when the business
  *     version changes and it must change if the status code changes. In addition, it should change when the substantive content
  *     of the charge item definition changes.
  * @param code
  *   - The defined billing details in this resource pertain to the given billing code.
  * @param title
  *   - A short, descriptive, user-friendly title for the charge item definition.
  * @param partOf
  *   - A larger definition of which this particular definition is a component or step.
  * @param status
  *   - The current state of the ChargeItemDefinition.
  * @param version
  *   - The identifier that is used to identify this version of the charge item definition when it is referenced in a
  *     specification, model, design or instance. This is an arbitrary value managed by the charge item definition author and is
  *     not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not
  *     available. There is also no expectation that versions can be placed in a lexicographical sequence. To provide a version
  *     consistent with the Decision Support Service specification, use the format Major.Minor.Revision (e.g. 1.0.0). For more
  *     information on versioning knowledge assets, refer to the Decision Support Service specification. Note that a version is
  *     required for non-experimental active assets.
  * @param contact
  *   - Contact details to assist a user in finding and communicating with the publisher.
  * @param language
  *   - The base language in which the resource is written.
  * @param replaces
  *   - As new versions of a protocol or guideline are defined, allows identification of what versions are replaced by a new
  *     instance.
  * @param instance
  *   - The defined billing details in this resource pertain to the given product instance(s).
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *     identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *     of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *     Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *     of the extension.
  * @param publisher
  *   - The name of the organization or individual that published the charge item definition.
  * @param copyright
  *   - A copyright statement relating to the charge item definition and/or its contents. Copyright statements are generally legal
  *     restrictions on the use and publishing of the charge item definition.
  * @param identifier
  *   - A formal identifier that is used to identify this charge item definition when it is represented in other formats, or
  *     referenced in a specification, model, design or an instance.
  * @param useContext
  *   - The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be
  *     general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be
  *     used to assist with indexing and searching for appropriate charge item definition instances.
  * @param description
  *   - A free text natural language description of the charge item definition from a consumer's perspective.
  * @param experimental
  *   - A Boolean value to indicate that this charge item definition is authored for testing purposes (or
  *     education/evaluation/marketing) and is not intended to be used for genuine usage.
  * @param jurisdiction
  *   - A legal or geographic region in which the charge item definition is intended to be used.
  * @param approvalDate
  *   - The date on which the resource content was approved by the publisher. Approval happens once when the content is officially
  *     approved for usage.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *     processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *     other profiles etc.
  * @param derivedFromUri
  *   - The URL pointing to an externally-defined charge item definition that is adhered to in whole or in part by this
  *     definition.
  * @param lastReviewDate
  *   - The date on which the resource content was last reviewed. Review happens periodically after approval but does not change
  *     the original approval date.
  * @param effectivePeriod
  *   - The period during which the charge item definition content was or is planned to be in active use.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *     the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *     Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *     strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *     extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *     processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of
  *     any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param applicability
  *   - Expressions that describe applicability criteria for the billing code.
  * @param propertyGroup
  *   - Group of properties which are applicable under the same conditions. If no applicability rules are established for the
  *     group, then all properties always apply.
  */
@POJOBoilerplate
class ChargeItemDefinition(
    override val id: Option[String] = None,
    val url: UriStr,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val date: Option[FHIRDateTime] = None,
    val code: Option[CodeableConcept] = None,
    val title: Option[String] = None,
    val partOf: LitSeq[Canonical] = LitSeq.empty,
    val status: PUBLICATION_STATUS,
    val version: Option[String] = None,
    val contact: LitSeq[ContactDetail] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    val replaces: LitSeq[Canonical] = LitSeq.empty,
    val instance: LitSeq[Reference] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val publisher: Option[String] = None,
    val copyright: Option[Markdown] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val useContext: LitSeq[UsageContext] = LitSeq.empty,
    val description: Option[Markdown] = None,
    val experimental: Option[Boolean] = None,
    val jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
    val approvalDate: Option[FHIRDate] = None,
    override val implicitRules: Option[UriStr] = None,
    val derivedFromUri: LitSeq[UriStr] = LitSeq.empty,
    val lastReviewDate: Option[FHIRDate] = None,
    val effectivePeriod: Option[Period] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val applicability: LitSeq[ChargeItemDefinition.Applicability] = LitSeq.empty,
    val propertyGroup: LitSeq[ChargeItemDefinition.PropertyGroup] = LitSeq.empty,
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
  override val thisTypeName: String = "ChargeItemDefinition"
}
