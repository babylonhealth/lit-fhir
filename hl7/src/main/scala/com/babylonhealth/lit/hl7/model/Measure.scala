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
import com.babylonhealth.lit.hl7.PUBLICATION_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Measure extends CompanionFor[Measure] {
  override type ResourceType = Measure
  override val baseType: CompanionFor[ResourceType] = Measure
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Measure")
  object Group extends CompanionFor[Group] {
    override type ResourceType = Group
    object Population extends CompanionFor[Population] {
      override type ResourceType = Population
      def apply(
          id: Option[String] = None,
          code: Option[CodeableConcept] = None,
          criteria: Expression,
          extension: LitSeq[Extension] = LitSeq.empty,
          description: Option[String] = None,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Population = new Population(
        id,
        code,
        criteria,
        extension,
        description,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Population): Option[(Option[String], Option[CodeableConcept], Expression, LitSeq[Extension], Option[String], LitSeq[Extension])] =
        Some((o.id, o.code, o.criteria, o.extension, o.description, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val code: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("code", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val criteria: FHIRComponentFieldMeta[Expression] =
        FHIRComponentFieldMeta("criteria", lTagOf[Expression], false, lTagOf[Expression])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val description: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
        Seq(id, code, criteria, extension, description, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Population): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[CodeableConcept]](code, t.code),
        FHIRComponentField[Expression](criteria, t.criteria),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[String]](description, t.description),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Population] = this
      val thisName: String                   = "Population"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Population] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Population(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[CodeableConcept]]("code", Some(None)),
              cursor.decodeAs[Expression]("criteria", None),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[String]]("description", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Population(
        override val id: Option[String] = None,
        val code: Option[CodeableConcept] = None,
        val criteria: Expression,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val description: Option[String] = None,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object Stratifier extends CompanionFor[Stratifier] {
      override type ResourceType = Stratifier
      object Component extends CompanionFor[Component] {
        override type ResourceType = Component
        def apply(
            id: Option[String] = None,
            code: Option[CodeableConcept] = None,
            criteria: Expression,
            extension: LitSeq[Extension] = LitSeq.empty,
            description: Option[String] = None,
            modifierExtension: LitSeq[Extension] = LitSeq.empty,
            primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
        ): Component = new Component(
          id,
          code,
          criteria,
          extension,
          description,
          modifierExtension,
          primitiveAttributes = primitiveAttributes
        )
        def unapply(
            o: Component): Option[(Option[String], Option[CodeableConcept], Expression, LitSeq[Extension], Option[String], LitSeq[Extension])] =
          Some((o.id, o.code, o.criteria, o.extension, o.description, o.modifierExtension))
        val id: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
        val code: FHIRComponentFieldMeta[Option[CodeableConcept]] =
          FHIRComponentFieldMeta("code", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
        val criteria: FHIRComponentFieldMeta[Expression] =
          FHIRComponentFieldMeta("criteria", lTagOf[Expression], false, lTagOf[Expression])
        val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val description: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
        val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
          Seq(id, code, criteria, extension, description, modifierExtension)
        override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
        override def fields(t: Component): Seq[FHIRComponentField[_]] = Seq(
          FHIRComponentField[Option[String]](id, t.id),
          FHIRComponentField[Option[CodeableConcept]](code, t.code),
          FHIRComponentField[Expression](criteria, t.criteria),
          FHIRComponentField[LitSeq[Extension]](extension, t.extension),
          FHIRComponentField[Option[String]](description, t.description),
          FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
        )
        val baseType: CompanionFor[Component] = this
        val thisName: String                  = "Component"
        def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Component] =
          checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
            Try(
              new Component(
                cursor.decodeAs[Option[String]]("id", Some(None)),
                cursor.decodeAs[Option[CodeableConcept]]("code", Some(None)),
                cursor.decodeAs[Expression]("criteria", None),
                cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
                cursor.decodeAs[Option[String]]("description", Some(None)),
                cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
                decodeAttributes(cursor)
              )
            ))
      }
      @POJOBoilerplate
      class Component(
          override val id: Option[String] = None,
          val code: Option[CodeableConcept] = None,
          val criteria: Expression,
          override val extension: LitSeq[Extension] = LitSeq.empty,
          val description: Option[String] = None,
          override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
          override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
            FHIRObject.emptyAtts)
          extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
      def apply(
          id: Option[String] = None,
          code: Option[CodeableConcept] = None,
          criteria: Option[Expression] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          description: Option[String] = None,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          component: LitSeq[Stratifier.Component] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Stratifier = new Stratifier(
        id,
        code,
        criteria,
        extension,
        description,
        modifierExtension,
        component,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Stratifier): Option[(Option[String], Option[CodeableConcept], Option[Expression], LitSeq[Extension], Option[String], LitSeq[Extension], LitSeq[Stratifier.Component])] =
        Some((o.id, o.code, o.criteria, o.extension, o.description, o.modifierExtension, o.component))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val code: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("code", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val criteria: FHIRComponentFieldMeta[Option[Expression]] =
        FHIRComponentFieldMeta("criteria", lTagOf[Option[Expression]], false, lTagOf[Expression])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val description: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val component: FHIRComponentFieldMeta[LitSeq[Stratifier.Component]] =
        FHIRComponentFieldMeta("component", lTagOf[LitSeq[Stratifier.Component]], false, lTagOf[Stratifier.Component])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
        Seq(id, code, criteria, extension, description, modifierExtension, component)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Stratifier): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[CodeableConcept]](code, t.code),
        FHIRComponentField[Option[Expression]](criteria, t.criteria),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[String]](description, t.description),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
        FHIRComponentField[LitSeq[Stratifier.Component]](component, t.component)
      )
      val baseType: CompanionFor[Stratifier] = this
      val thisName: String                   = "Stratifier"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Stratifier] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Stratifier(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[CodeableConcept]]("code", Some(None)),
              cursor.decodeAs[Option[Expression]]("criteria", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[String]]("description", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Stratifier.Component]]("component", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Stratifier(
        override val id: Option[String] = None,
        val code: Option[CodeableConcept] = None,
        val criteria: Option[Expression] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val description: Option[String] = None,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        val component: LitSeq[Stratifier.Component] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        code: Option[CodeableConcept] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        description: Option[String] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        population: LitSeq[Group.Population] = LitSeq.empty,
        stratifier: LitSeq[Group.Stratifier] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Group = new Group(
      id,
      code,
      extension,
      description,
      modifierExtension,
      population,
      stratifier,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Group): Option[(Option[String], Option[CodeableConcept], LitSeq[Extension], Option[String], LitSeq[Extension], LitSeq[Group.Population], LitSeq[Group.Stratifier])] =
      Some((o.id, o.code, o.extension, o.description, o.modifierExtension, o.population, o.stratifier))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val code: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("code", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val description: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val population: FHIRComponentFieldMeta[LitSeq[Group.Population]] =
      FHIRComponentFieldMeta("population", lTagOf[LitSeq[Group.Population]], false, lTagOf[Group.Population])
    val stratifier: FHIRComponentFieldMeta[LitSeq[Group.Stratifier]] =
      FHIRComponentFieldMeta("stratifier", lTagOf[LitSeq[Group.Stratifier]], false, lTagOf[Group.Stratifier])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, code, extension, description, modifierExtension, population, stratifier)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Group): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](code, t.code),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[String]](description, t.description),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[Group.Population]](population, t.population),
      FHIRComponentField[LitSeq[Group.Stratifier]](stratifier, t.stratifier)
    )
    val baseType: CompanionFor[Group] = this
    val thisName: String              = "Group"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Group] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Group(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("code", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("description", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Group.Population]]("population", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Group.Stratifier]]("stratifier", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Group(
      override val id: Option[String] = None,
      val code: Option[CodeableConcept] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val description: Option[String] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val population: LitSeq[Group.Population] = LitSeq.empty,
      val stratifier: LitSeq[Group.Stratifier] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object SupplementalData extends CompanionFor[SupplementalData] {
    override type ResourceType = SupplementalData
    def apply(
        id: Option[String] = None,
        code: Option[CodeableConcept] = None,
        usage: LitSeq[CodeableConcept] = LitSeq.empty,
        criteria: Expression,
        extension: LitSeq[Extension] = LitSeq.empty,
        description: Option[String] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): SupplementalData = new SupplementalData(
      id,
      code,
      usage,
      criteria,
      extension,
      description,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: SupplementalData): Option[(Option[String], Option[CodeableConcept], LitSeq[CodeableConcept], Expression, LitSeq[Extension], Option[String], LitSeq[Extension])] =
      Some((o.id, o.code, o.usage, o.criteria, o.extension, o.description, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val code: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("code", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val usage: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("usage", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val criteria: FHIRComponentFieldMeta[Expression] =
      FHIRComponentFieldMeta("criteria", lTagOf[Expression], false, lTagOf[Expression])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val description: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, code, usage, criteria, extension, description, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: SupplementalData): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](code, t.code),
      FHIRComponentField[LitSeq[CodeableConcept]](usage, t.usage),
      FHIRComponentField[Expression](criteria, t.criteria),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[String]](description, t.description),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[SupplementalData] = this
    val thisName: String                         = "SupplementalData"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[SupplementalData] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new SupplementalData(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("code", Some(None)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("usage", Some(LitSeq.empty)),
            cursor.decodeAs[Expression]("criteria", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("description", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class SupplementalData(
      override val id: Option[String] = None,
      val code: Option[CodeableConcept] = None,
      val usage: LitSeq[CodeableConcept] = LitSeq.empty,
      val criteria: Expression,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val description: Option[String] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  type SubjectChoice = Choice[Union01025009075]
  def apply(
      id: Option[String] = None,
      url: Option[UriStr] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      name: Option[String] = None,
      date: Option[FHIRDateTime] = None,
      `type`: LitSeq[CodeableConcept] = LitSeq.empty,
      title: Option[String] = None,
      usage: Option[String] = None,
      topic: LitSeq[CodeableConcept] = LitSeq.empty,
      status: PUBLICATION_STATUS,
      author: LitSeq[ContactDetail] = LitSeq.empty,
      editor: LitSeq[ContactDetail] = LitSeq.empty,
      version: Option[String] = None,
      contact: LitSeq[ContactDetail] = LitSeq.empty,
      purpose: Option[Markdown] = None,
      library: LitSeq[Canonical] = LitSeq.empty,
      scoring: Option[CodeableConcept] = None,
      language: Option[LANGUAGES] = None,
      subtitle: Option[String] = None,
      reviewer: LitSeq[ContactDetail] = LitSeq.empty,
      endorser: LitSeq[ContactDetail] = LitSeq.empty,
      guidance: Option[Markdown] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      publisher: Option[String] = None,
      copyright: Option[Markdown] = None,
      rationale: Option[Markdown] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      subject: Option[Measure.SubjectChoice] = None,
      useContext: LitSeq[UsageContext] = LitSeq.empty,
      disclaimer: Option[Markdown] = None,
      definition: LitSeq[Markdown] = LitSeq.empty,
      description: Option[Markdown] = None,
      experimental: Option[Boolean] = None,
      jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
      approvalDate: Option[FHIRDate] = None,
      implicitRules: Option[UriStr] = None,
      lastReviewDate: Option[FHIRDate] = None,
      riskAdjustment: Option[String] = None,
      effectivePeriod: Option[Period] = None,
      relatedArtifact: LitSeq[RelatedArtifact] = LitSeq.empty,
      rateAggregation: Option[String] = None,
      compositeScoring: Option[CodeableConcept] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      improvementNotation: Option[CodeableConcept] = None,
      clinicalRecommendationStatement: Option[Markdown] = None,
      supplementalData: LitSeq[Measure.SupplementalData] = LitSeq.empty,
      group: LitSeq[Measure.Group] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Measure = new Measure(
    id,
    url,
    meta,
    text,
    name,
    date,
    `type`,
    title,
    usage,
    topic,
    status,
    author,
    editor,
    version,
    contact,
    purpose,
    library,
    scoring,
    language,
    subtitle,
    reviewer,
    endorser,
    guidance,
    contained,
    extension,
    publisher,
    copyright,
    rationale,
    identifier,
    subject,
    useContext,
    disclaimer,
    definition,
    description,
    experimental,
    jurisdiction,
    approvalDate,
    implicitRules,
    lastReviewDate,
    riskAdjustment,
    effectivePeriod,
    relatedArtifact,
    rateAggregation,
    compositeScoring,
    modifierExtension,
    improvementNotation,
    clinicalRecommendationStatement,
    supplementalData,
    group,
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
  val `type`: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("type", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val title: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("title", lTagOf[Option[String]], false, lTagOf[String])
  val usage: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("usage", lTagOf[Option[String]], false, lTagOf[String])
  val topic: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("topic", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val status: FHIRComponentFieldMeta[PUBLICATION_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[PUBLICATION_STATUS], false, lTagOf[PUBLICATION_STATUS])
  val author: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("author", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val editor: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("editor", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val version: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("version", lTagOf[Option[String]], false, lTagOf[String])
  val contact: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("contact", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val purpose: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("purpose", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val library: FHIRComponentFieldMeta[LitSeq[Canonical]] =
    FHIRComponentFieldMeta("library", lTagOf[LitSeq[Canonical]], false, lTagOf[Canonical])
  val scoring: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("scoring", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val subtitle: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("subtitle", lTagOf[Option[String]], false, lTagOf[String])
  val reviewer: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("reviewer", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val endorser: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("endorser", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val guidance: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("guidance", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val publisher: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("publisher", lTagOf[Option[String]], false, lTagOf[String])
  val copyright: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("copyright", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val rationale: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("rationale", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val subject: FHIRComponentFieldMeta[Option[Measure.SubjectChoice]] =
    FHIRComponentFieldMeta("subject", lTagOf[Option[Measure.SubjectChoice]], true, lTagOf[Union01025009075])
  val useContext: FHIRComponentFieldMeta[LitSeq[UsageContext]] =
    FHIRComponentFieldMeta("useContext", lTagOf[LitSeq[UsageContext]], false, lTagOf[UsageContext])
  val disclaimer: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("disclaimer", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val definition: FHIRComponentFieldMeta[LitSeq[Markdown]] =
    FHIRComponentFieldMeta("definition", lTagOf[LitSeq[Markdown]], false, lTagOf[Markdown])
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
  val lastReviewDate: FHIRComponentFieldMeta[Option[FHIRDate]] =
    FHIRComponentFieldMeta("lastReviewDate", lTagOf[Option[FHIRDate]], false, lTagOf[FHIRDate])
  val riskAdjustment: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("riskAdjustment", lTagOf[Option[String]], false, lTagOf[String])
  val effectivePeriod: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("effectivePeriod", lTagOf[Option[Period]], false, lTagOf[Period])
  val relatedArtifact: FHIRComponentFieldMeta[LitSeq[RelatedArtifact]] =
    FHIRComponentFieldMeta("relatedArtifact", lTagOf[LitSeq[RelatedArtifact]], false, lTagOf[RelatedArtifact])
  val rateAggregation: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("rateAggregation", lTagOf[Option[String]], false, lTagOf[String])
  val compositeScoring: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("compositeScoring", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val improvementNotation: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("improvementNotation", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val clinicalRecommendationStatement: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("clinicalRecommendationStatement", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val supplementalData: FHIRComponentFieldMeta[LitSeq[Measure.SupplementalData]] =
    FHIRComponentFieldMeta(
      "supplementalData",
      lTagOf[LitSeq[Measure.SupplementalData]],
      false,
      lTagOf[Measure.SupplementalData])
  val group: FHIRComponentFieldMeta[LitSeq[Measure.Group]] =
    FHIRComponentFieldMeta("group", lTagOf[LitSeq[Measure.Group]], false, lTagOf[Measure.Group])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    url,
    meta,
    text,
    name,
    date,
    `type`,
    title,
    usage,
    topic,
    status,
    author,
    editor,
    version,
    contact,
    purpose,
    library,
    scoring,
    language,
    subtitle,
    reviewer,
    endorser,
    guidance,
    contained,
    extension,
    publisher,
    copyright,
    rationale,
    identifier,
    subject,
    useContext,
    disclaimer,
    definition,
    description,
    experimental,
    jurisdiction,
    approvalDate,
    implicitRules,
    lastReviewDate,
    riskAdjustment,
    effectivePeriod,
    relatedArtifact,
    rateAggregation,
    compositeScoring,
    modifierExtension,
    improvementNotation,
    clinicalRecommendationStatement,
    supplementalData,
    group
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Measure): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[UriStr]](url, t.url),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[String]](name, t.name),
    FHIRComponentField[Option[FHIRDateTime]](date, t.date),
    FHIRComponentField[LitSeq[CodeableConcept]](`type`, t.`type`),
    FHIRComponentField[Option[String]](title, t.title),
    FHIRComponentField[Option[String]](usage, t.usage),
    FHIRComponentField[LitSeq[CodeableConcept]](topic, t.topic),
    FHIRComponentField[PUBLICATION_STATUS](status, t.status),
    FHIRComponentField[LitSeq[ContactDetail]](author, t.author),
    FHIRComponentField[LitSeq[ContactDetail]](editor, t.editor),
    FHIRComponentField[Option[String]](version, t.version),
    FHIRComponentField[LitSeq[ContactDetail]](contact, t.contact),
    FHIRComponentField[Option[Markdown]](purpose, t.purpose),
    FHIRComponentField[LitSeq[Canonical]](library, t.library),
    FHIRComponentField[Option[CodeableConcept]](scoring, t.scoring),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Option[String]](subtitle, t.subtitle),
    FHIRComponentField[LitSeq[ContactDetail]](reviewer, t.reviewer),
    FHIRComponentField[LitSeq[ContactDetail]](endorser, t.endorser),
    FHIRComponentField[Option[Markdown]](guidance, t.guidance),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[String]](publisher, t.publisher),
    FHIRComponentField[Option[Markdown]](copyright, t.copyright),
    FHIRComponentField[Option[Markdown]](rationale, t.rationale),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[Measure.SubjectChoice]](subject, t.subject),
    FHIRComponentField[LitSeq[UsageContext]](useContext, t.useContext),
    FHIRComponentField[Option[Markdown]](disclaimer, t.disclaimer),
    FHIRComponentField[LitSeq[Markdown]](definition, t.definition),
    FHIRComponentField[Option[Markdown]](description, t.description),
    FHIRComponentField[Option[Boolean]](experimental, t.experimental),
    FHIRComponentField[LitSeq[CodeableConcept]](jurisdiction, t.jurisdiction),
    FHIRComponentField[Option[FHIRDate]](approvalDate, t.approvalDate),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[FHIRDate]](lastReviewDate, t.lastReviewDate),
    FHIRComponentField[Option[String]](riskAdjustment, t.riskAdjustment),
    FHIRComponentField[Option[Period]](effectivePeriod, t.effectivePeriod),
    FHIRComponentField[LitSeq[RelatedArtifact]](relatedArtifact, t.relatedArtifact),
    FHIRComponentField[Option[String]](rateAggregation, t.rateAggregation),
    FHIRComponentField[Option[CodeableConcept]](compositeScoring, t.compositeScoring),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Option[CodeableConcept]](improvementNotation, t.improvementNotation),
    FHIRComponentField[Option[Markdown]](clinicalRecommendationStatement, t.clinicalRecommendationStatement),
    FHIRComponentField[LitSeq[Measure.SupplementalData]](supplementalData, t.supplementalData),
    FHIRComponentField[LitSeq[Measure.Group]](group, t.group)
  )
  def extractId(t: Measure): Option[String]                                 = t.id
  def extractUrl(t: Measure): Option[UriStr]                                = t.url
  def extractMeta(t: Measure): Option[Meta]                                 = t.meta
  def extractText(t: Measure): Option[Narrative]                            = t.text
  def extractName(t: Measure): Option[String]                               = t.name
  def extractDate(t: Measure): Option[FHIRDateTime]                         = t.date
  def extractType(t: Measure): LitSeq[CodeableConcept]                      = t.`type`
  def extractTitle(t: Measure): Option[String]                              = t.title
  def extractUsage(t: Measure): Option[String]                              = t.usage
  def extractTopic(t: Measure): LitSeq[CodeableConcept]                     = t.topic
  def extractStatus(t: Measure): PUBLICATION_STATUS                         = t.status
  def extractAuthor(t: Measure): LitSeq[ContactDetail]                      = t.author
  def extractEditor(t: Measure): LitSeq[ContactDetail]                      = t.editor
  def extractVersion(t: Measure): Option[String]                            = t.version
  def extractContact(t: Measure): LitSeq[ContactDetail]                     = t.contact
  def extractPurpose(t: Measure): Option[Markdown]                          = t.purpose
  def extractLibrary(t: Measure): LitSeq[Canonical]                         = t.library
  def extractScoring(t: Measure): Option[CodeableConcept]                   = t.scoring
  def extractLanguage(t: Measure): Option[LANGUAGES]                        = t.language
  def extractSubtitle(t: Measure): Option[String]                           = t.subtitle
  def extractReviewer(t: Measure): LitSeq[ContactDetail]                    = t.reviewer
  def extractEndorser(t: Measure): LitSeq[ContactDetail]                    = t.endorser
  def extractGuidance(t: Measure): Option[Markdown]                         = t.guidance
  def extractContained(t: Measure): LitSeq[Resource]                        = t.contained
  def extractExtension(t: Measure): LitSeq[Extension]                       = t.extension
  def extractPublisher(t: Measure): Option[String]                          = t.publisher
  def extractCopyright(t: Measure): Option[Markdown]                        = t.copyright
  def extractRationale(t: Measure): Option[Markdown]                        = t.rationale
  def extractIdentifier(t: Measure): LitSeq[Identifier]                     = t.identifier
  def extractSubject(t: Measure): Option[Measure.SubjectChoice]             = t.subject
  def extractUseContext(t: Measure): LitSeq[UsageContext]                   = t.useContext
  def extractDisclaimer(t: Measure): Option[Markdown]                       = t.disclaimer
  def extractDefinition(t: Measure): LitSeq[Markdown]                       = t.definition
  def extractDescription(t: Measure): Option[Markdown]                      = t.description
  def extractExperimental(t: Measure): Option[Boolean]                      = t.experimental
  def extractJurisdiction(t: Measure): LitSeq[CodeableConcept]              = t.jurisdiction
  def extractApprovalDate(t: Measure): Option[FHIRDate]                     = t.approvalDate
  def extractImplicitRules(t: Measure): Option[UriStr]                      = t.implicitRules
  def extractLastReviewDate(t: Measure): Option[FHIRDate]                   = t.lastReviewDate
  def extractRiskAdjustment(t: Measure): Option[String]                     = t.riskAdjustment
  def extractEffectivePeriod(t: Measure): Option[Period]                    = t.effectivePeriod
  def extractRelatedArtifact(t: Measure): LitSeq[RelatedArtifact]           = t.relatedArtifact
  def extractRateAggregation(t: Measure): Option[String]                    = t.rateAggregation
  def extractCompositeScoring(t: Measure): Option[CodeableConcept]          = t.compositeScoring
  def extractModifierExtension(t: Measure): LitSeq[Extension]               = t.modifierExtension
  def extractImprovementNotation(t: Measure): Option[CodeableConcept]       = t.improvementNotation
  def extractClinicalRecommendationStatement(t: Measure): Option[Markdown]  = t.clinicalRecommendationStatement
  def extractSupplementalData(t: Measure): LitSeq[Measure.SupplementalData] = t.supplementalData
  def extractGroup(t: Measure): LitSeq[Measure.Group]                       = t.group
  override val thisName: String                                             = "Measure"
  override val searchParams: Map[String, Measure => Seq[Any]] = Map(
    "jurisdiction"          -> (obj => obj.jurisdiction.toSeq),
    "name"                  -> (obj => obj.name.toSeq),
    "context-type-quantity" -> (obj => obj.useContext.toSeq),
    "context"               -> (obj => obj.useContext.map(_.value).flatMap(_.as[CodeableConcept]).toSeq),
    "effective"             -> (obj => obj.effectivePeriod.toSeq),
    "depends-on" -> (obj =>
      obj.relatedArtifact.filter(_.`type`.entryName == "depends-on").flatMap(_.resource).toSeq ++
        obj.library.toSeq),
    "date"               -> (obj => obj.date.toSeq),
    "topic"              -> (obj => obj.topic.toSeq),
    "identifier"         -> (obj => obj.identifier.toSeq),
    "url"                -> (obj => obj.url.toSeq),
    "description"        -> (obj => obj.description.toSeq),
    "successor"          -> (obj => obj.relatedArtifact.filter(_.`type`.entryName == "successor").flatMap(_.resource).toSeq),
    "context-type-value" -> (obj => obj.useContext.toSeq),
    "version"            -> (obj => obj.version.toSeq),
    "composed-of"        -> (obj => obj.relatedArtifact.filter(_.`type`.entryName == "composed-of").flatMap(_.resource).toSeq),
    "status"             -> (obj => Seq(obj.status)),
    "publisher"          -> (obj => obj.publisher.toSeq),
    "title"              -> (obj => obj.title.toSeq),
    "context-quantity" -> (obj =>
      obj.useContext.map(_.value).flatMap(_.as[Quantity]).toSeq ++
        obj.useContext.map(_.value).flatMap(_.as[Range]).toSeq),
    "predecessor"  -> (obj => obj.relatedArtifact.filter(_.`type`.entryName == "predecessor").flatMap(_.resource).toSeq),
    "context-type" -> (obj => obj.useContext.map(_.code).toSeq),
    "derived-from" -> (obj =>
      obj.relatedArtifact.filter(_.`type`.entryName == "derived-from").flatMap(_.resource).toSeq)
  )
  // format: off
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Measure] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ => Try(
      new Measure(
        cursor.decodeAs[Option[String]]("id", Some(None)),
        cursor.decodeAs[Option[UriStr]]("url", Some(None)),
        cursor.decodeAs[Option[Meta]]("meta", Some(None)),
        cursor.decodeAs[Option[Narrative]]("text", Some(None)),
        cursor.decodeAs[Option[String]]("name", Some(None)),
        cursor.decodeAs[Option[FHIRDateTime]]("date", Some(None)),
        cursor.decodeAs[LitSeq[CodeableConcept]]("type", Some(LitSeq.empty)),
        cursor.decodeAs[Option[String]]("title", Some(None)),
        cursor.decodeAs[Option[String]]("usage", Some(None)),
        cursor.decodeAs[LitSeq[CodeableConcept]]("topic", Some(LitSeq.empty)),
        cursor.decodeAs[PUBLICATION_STATUS]("status", None),
        cursor.decodeAs[LitSeq[ContactDetail]]("author", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[ContactDetail]]("editor", Some(LitSeq.empty)),
        cursor.decodeAs[Option[String]]("version", Some(None)),
        cursor.decodeAs[LitSeq[ContactDetail]]("contact", Some(LitSeq.empty)),
        cursor.decodeAs[Option[Markdown]]("purpose", Some(None)),
        cursor.decodeAs[LitSeq[Canonical]]("library", Some(LitSeq.empty)),
        cursor.decodeAs[Option[CodeableConcept]]("scoring", Some(None)),
        cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
        cursor.decodeAs[Option[String]]("subtitle", Some(None)),
        cursor.decodeAs[LitSeq[ContactDetail]]("reviewer", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[ContactDetail]]("endorser", Some(LitSeq.empty)),
        cursor.decodeAs[Option[Markdown]]("guidance", Some(None)),
        cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
        cursor.decodeAs[Option[String]]("publisher", Some(None)),
        cursor.decodeAs[Option[Markdown]]("copyright", Some(None)),
        cursor.decodeAs[Option[Markdown]]("rationale", Some(None)),
        cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
        cursor.decodeOptRef[Union01025009075]("subject"),
        cursor.decodeAs[LitSeq[UsageContext]]("useContext", Some(LitSeq.empty)),
        cursor.decodeAs[Option[Markdown]]("disclaimer", Some(None)),
        cursor.decodeAs[LitSeq[Markdown]]("definition", Some(LitSeq.empty)),
        cursor.decodeAs[Option[Markdown]]("description", Some(None)),
        cursor.decodeAs[Option[Boolean]]("experimental", Some(None)),
        cursor.decodeAs[LitSeq[CodeableConcept]]("jurisdiction", Some(LitSeq.empty)),
        cursor.decodeAs[Option[FHIRDate]]("approvalDate", Some(None)),
        cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
        cursor.decodeAs[Option[FHIRDate]]("lastReviewDate", Some(None)),
        cursor.decodeAs[Option[String]]("riskAdjustment", Some(None)),
        cursor.decodeAs[Option[Period]]("effectivePeriod", Some(None)),
        cursor.decodeAs[LitSeq[RelatedArtifact]]("relatedArtifact", Some(LitSeq.empty)),
        cursor.decodeAs[Option[String]]("rateAggregation", Some(None)),
        cursor.decodeAs[Option[CodeableConcept]]("compositeScoring", Some(None)),
        cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
        cursor.decodeAs[Option[CodeableConcept]]("improvementNotation", Some(None)),
        cursor.decodeAs[Option[Markdown]]("clinicalRecommendationStatement", Some(None)),
        cursor.decodeAs[LitSeq[Measure.SupplementalData]]("supplementalData", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[Measure.Group]]("group", Some(LitSeq.empty)),
        decodeAttributes(cursor)
      )
    ))
  // format: on
}

/** The Measure resource provides the definition of a quality measure.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields url, name, date, `type`, title, usage, topic, status, author, editor, version, contact, purpose, library, scoring, subtitle, reviewer, endorser, guidance, publisher, copyright, rationale, identifier, subject, useContext, disclaimer, definition, description, experimental, jurisdiction, approvalDate, lastReviewDate, riskAdjustment, effectivePeriod, relatedArtifact, rateAggregation, compositeScoring, improvementNotation, clinicalRecommendationStatement, supplementalData, group.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param url - An absolute URI that is used to identify this measure when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative instance of this measure is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the measure is stored on different servers.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param name - A natural language name identifying the measure. This name should be usable as an identifier for the module by machine processing applications such as code generation.
  * @param date - The date  (and optionally time) when the measure was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the measure changes.
  * @param `type` - Indicates whether the measure is used to examine a process, an outcome over time, a patient-reported outcome, or a structure measure such as utilization.
  * @param title - A short, descriptive, user-friendly title for the measure.
  * @param usage - A detailed description, from a clinical perspective, of how the measure is used.
  * @param topic - Descriptive topics related to the content of the measure. Topics provide a high-level categorization grouping types of measures that can be useful for filtering and searching.
  * @param status - The status of this measure. Enables tracking the life-cycle of the content.
  * @param author - An individiual or organization primarily involved in the creation and maintenance of the content.
  * @param editor - An individual or organization primarily responsible for internal coherence of the content.
  * @param version - The identifier that is used to identify this version of the measure when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the measure author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence. To provide a version consistent with the Decision Support Service specification, use the format Major.Minor.Revision (e.g. 1.0.0). For more information on versioning knowledge assets, refer to the Decision Support Service specification. Note that a version is required for non-experimental active artifacts.
  * @param contact - Contact details to assist a user in finding and communicating with the publisher.
  * @param purpose - Explanation of why this measure is needed and why it has been designed as it has.
  * @param library - A reference to a Library resource containing the formal logic used by the measure.
  * @param scoring - Indicates how the calculation is performed for the measure, including proportion, ratio, continuous-variable, and cohort. The value set is extensible, allowing additional measure scoring types to be represented.
  * @param language - The base language in which the resource is written.
  * @param subtitle - An explanatory or alternate title for the measure giving additional information about its content.
  * @param reviewer - An individual or organization primarily responsible for review of some aspect of the content.
  * @param endorser - An individual or organization responsible for officially endorsing the content for use in some setting.
  * @param guidance - Additional guidance for the measure including how it can be used in a clinical context, and the intent of the measure.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param publisher - The name of the organization or individual that published the measure.
  * @param copyright - A copyright statement relating to the measure and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the measure.
  * @param rationale - Provides a succinct statement of the need for the measure. Usually includes statements pertaining to importance criterion: impact, gap in care, and evidence.
  * @param identifier - A formal identifier that is used to identify this measure when it is represented in other formats, or referenced in a specification, model, design or an instance.
  * @param subject - The intended subjects for the measure. If this element is not provided, a Patient subject is assumed, but the subject of the measure can be anything.
  * @param useContext - The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate measure instances.
  * @param disclaimer - Notices and disclaimers regarding the use of the measure or related to intellectual property (such as code systems) referenced by the measure.
  * @param definition - Provides a description of an individual term used within the measure.
  * @param description - A free text natural language description of the measure from a consumer's perspective.
  * @param experimental - A Boolean value to indicate that this measure is authored for testing purposes (or education/evaluation/marketing) and is not intended to be used for genuine usage.
  * @param jurisdiction - A legal or geographic region in which the measure is intended to be used.
  * @param approvalDate - The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param lastReviewDate - The date on which the resource content was last reviewed. Review happens periodically after approval but does not change the original approval date.
  * @param riskAdjustment - A description of the risk adjustment factors that may impact the resulting score for the measure and how they may be accounted for when computing and reporting measure results.
  * @param effectivePeriod - The period during which the measure content was or is planned to be in active use.
  * @param relatedArtifact - Related artifacts such as additional documentation, justification, or bibliographic references.
  * @param rateAggregation - Describes how to combine the information calculated, based on logic in each of several populations, into one summarized result.
  * @param compositeScoring - If this is a composite measure, the scoring method used to combine the component measures to determine the composite score.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param improvementNotation - Information on whether an increase or decrease in score is the preferred result (e.g., a higher score indicates better quality OR a lower score indicates better quality OR quality is within a range).
  * @param clinicalRecommendationStatement - Provides a summary of relevant clinical guidelines or other clinical recommendations supporting the measure.
  * @param supplementalData - The supplemental data criteria for the measure report, specified as either the name of a valid CQL expression within a referenced library, or a valid FHIR Resource Path.
  * @param group - A group of population criteria for the measure.
  */
@POJOBoilerplate
class Measure(
    override val id: Option[String] = None,
    val url: Option[UriStr] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val name: Option[String] = None,
    val date: Option[FHIRDateTime] = None,
    val `type`: LitSeq[CodeableConcept] = LitSeq.empty,
    val title: Option[String] = None,
    val usage: Option[String] = None,
    val topic: LitSeq[CodeableConcept] = LitSeq.empty,
    val status: PUBLICATION_STATUS,
    val author: LitSeq[ContactDetail] = LitSeq.empty,
    val editor: LitSeq[ContactDetail] = LitSeq.empty,
    val version: Option[String] = None,
    val contact: LitSeq[ContactDetail] = LitSeq.empty,
    val purpose: Option[Markdown] = None,
    val library: LitSeq[Canonical] = LitSeq.empty,
    val scoring: Option[CodeableConcept] = None,
    override val language: Option[LANGUAGES] = None,
    val subtitle: Option[String] = None,
    val reviewer: LitSeq[ContactDetail] = LitSeq.empty,
    val endorser: LitSeq[ContactDetail] = LitSeq.empty,
    val guidance: Option[Markdown] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val publisher: Option[String] = None,
    val copyright: Option[Markdown] = None,
    val rationale: Option[Markdown] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val subject: Option[Measure.SubjectChoice] = None,
    val useContext: LitSeq[UsageContext] = LitSeq.empty,
    val disclaimer: Option[Markdown] = None,
    val definition: LitSeq[Markdown] = LitSeq.empty,
    val description: Option[Markdown] = None,
    val experimental: Option[Boolean] = None,
    val jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
    val approvalDate: Option[FHIRDate] = None,
    override val implicitRules: Option[UriStr] = None,
    val lastReviewDate: Option[FHIRDate] = None,
    val riskAdjustment: Option[String] = None,
    val effectivePeriod: Option[Period] = None,
    val relatedArtifact: LitSeq[RelatedArtifact] = LitSeq.empty,
    val rateAggregation: Option[String] = None,
    val compositeScoring: Option[CodeableConcept] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val improvementNotation: Option[CodeableConcept] = None,
    val clinicalRecommendationStatement: Option[Markdown] = None,
    val supplementalData: LitSeq[Measure.SupplementalData] = LitSeq.empty,
    val group: LitSeq[Measure.Group] = LitSeq.empty,
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
  override val thisTypeName: String = "Measure"
}
