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
import com.babylonhealth.lit.hl7.{ MEASURE_REPORT_TYPE, MEASURE_REPORT_STATUS }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object MeasureReport extends CompanionFor[MeasureReport] {
  implicit def summonObjectAndCompanionMeasureReport48126391(
      o: MeasureReport): ObjectAndCompanion[MeasureReport, MeasureReport.type] = ObjectAndCompanion(o, this)
  override type ResourceType = MeasureReport
  override type ParentType   = MeasureReport
  override val baseType: CompanionFor[ResourceType] = MeasureReport
  override val parentType: CompanionFor[ParentType] = MeasureReport
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/MeasureReport")
  object Group extends CompanionFor[Group] {
    implicit def summonObjectAndCompanionGroup186383179(o: Group): ObjectAndCompanion[Group, Group.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Group
    override type ParentType   = Group
    override val parentType: CompanionFor[ResourceType] = Group
    object Population extends CompanionFor[Population] {
      implicit def summonObjectAndCompanionPopulation904748036(
          o: Population): ObjectAndCompanion[Population, Population.type] = ObjectAndCompanion(o, this)
      override type ResourceType = Population
      override type ParentType   = Population
      override val parentType: CompanionFor[ResourceType] = Population
      def apply(
          id: Option[String] = None,
          code: Option[CodeableConcept] = None,
          count: Option[Int] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          subjectResults: Option[Reference] = None,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Population = new Population(
        id,
        code,
        count,
        extension,
        subjectResults,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Population): Option[(Option[String], Option[CodeableConcept], Option[Int], LitSeq[Extension], Option[Reference], LitSeq[Extension])] =
        Some((o.id, o.code, o.count, o.extension, o.subjectResults, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val code: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("code", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val count: FHIRComponentFieldMeta[Option[Int]] =
        FHIRComponentFieldMeta("count", lTagOf[Option[Int]], false, lTagOf[Int])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val subjectResults: FHIRComponentFieldMeta[Option[Reference]] =
        FHIRComponentFieldMeta("subjectResults", lTagOf[Option[Reference]], false, lTagOf[Reference])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
        Seq(id, code, count, extension, subjectResults, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Population): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[CodeableConcept]](code, t.code),
        FHIRComponentField[Option[Int]](count, t.count),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[Reference]](subjectResults, t.subjectResults),
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
              cursor.decodeAs[Option[Int]]("count", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[Reference]]("subjectResults", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Population(
        override val id: Option[String] = None,
        val code: Option[CodeableConcept] = None,
        val count: Option[Int] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val subjectResults: Option[Reference] = None,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object Stratifier extends CompanionFor[Stratifier] {
      implicit def summonObjectAndCompanionStratifier1250806685(
          o: Stratifier): ObjectAndCompanion[Stratifier, Stratifier.type] = ObjectAndCompanion(o, this)
      override type ResourceType = Stratifier
      override type ParentType   = Stratifier
      override val parentType: CompanionFor[ResourceType] = Stratifier
      object Stratum extends CompanionFor[Stratum] {
        implicit def summonObjectAndCompanionStratum_1770889999(o: Stratum): ObjectAndCompanion[Stratum, Stratum.type] =
          ObjectAndCompanion(o, this)
        override type ResourceType = Stratum
        override type ParentType   = Stratum
        override val parentType: CompanionFor[ResourceType] = Stratum
        object Component extends CompanionFor[Component] {
          implicit def summonObjectAndCompanionComponent_798709688(
              o: Component): ObjectAndCompanion[Component, Component.type] = ObjectAndCompanion(o, this)
          override type ResourceType = Component
          override type ParentType   = Component
          override val parentType: CompanionFor[ResourceType] = Component
          def apply(
              id: Option[String] = None,
              code: CodeableConcept,
              value: CodeableConcept,
              extension: LitSeq[Extension] = LitSeq.empty,
              modifierExtension: LitSeq[Extension] = LitSeq.empty,
              primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
          ): Component = new Component(
            id,
            code,
            value,
            extension,
            modifierExtension,
            primitiveAttributes = primitiveAttributes
          )
          def unapply(
              o: Component): Option[(Option[String], CodeableConcept, CodeableConcept, LitSeq[Extension], LitSeq[Extension])] =
            Some((o.id, o.code, o.value, o.extension, o.modifierExtension))
          val id: FHIRComponentFieldMeta[Option[String]] =
            FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
          val code: FHIRComponentFieldMeta[CodeableConcept] =
            FHIRComponentFieldMeta("code", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
          val value: FHIRComponentFieldMeta[CodeableConcept] =
            FHIRComponentFieldMeta("value", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
          val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
            FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
          val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
            FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
          val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, code, value, extension, modifierExtension)
          override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
          override def fields(t: Component): Seq[FHIRComponentField[_]] = Seq(
            FHIRComponentField[Option[String]](id, t.id),
            FHIRComponentField[CodeableConcept](code, t.code),
            FHIRComponentField[CodeableConcept](value, t.value),
            FHIRComponentField[LitSeq[Extension]](extension, t.extension),
            FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
          )
          val baseType: CompanionFor[Component] = this
          val thisName: String                  = "Component"
          def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Component] =
            checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
              Try(
                new Component(
                  cursor.decodeAs[Option[String]]("id", Some(None)),
                  cursor.decodeAs[CodeableConcept]("code", None),
                  cursor.decodeAs[CodeableConcept]("value", None),
                  cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
                  cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
                  decodeAttributes(cursor)
                )
              ))
        }
        @POJOBoilerplate
        class Component(
            override val id: Option[String] = None,
            val code: CodeableConcept,
            val value: CodeableConcept,
            override val extension: LitSeq[Extension] = LitSeq.empty,
            override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
            override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
              FHIRObject.emptyAtts)
            extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
        object Population extends CompanionFor[Population] {
          implicit def summonObjectAndCompanionPopulation394923995(
              o: Population): ObjectAndCompanion[Population, Population.type] = ObjectAndCompanion(o, this)
          override type ResourceType = Population
          override type ParentType   = Population
          override val parentType: CompanionFor[ResourceType] = Population
          def apply(
              id: Option[String] = None,
              code: Option[CodeableConcept] = None,
              count: Option[Int] = None,
              extension: LitSeq[Extension] = LitSeq.empty,
              subjectResults: Option[Reference] = None,
              modifierExtension: LitSeq[Extension] = LitSeq.empty,
              primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
          ): Population = new Population(
            id,
            code,
            count,
            extension,
            subjectResults,
            modifierExtension,
            primitiveAttributes = primitiveAttributes
          )
          def unapply(
              o: Population): Option[(Option[String], Option[CodeableConcept], Option[Int], LitSeq[Extension], Option[Reference], LitSeq[Extension])] =
            Some((o.id, o.code, o.count, o.extension, o.subjectResults, o.modifierExtension))
          val id: FHIRComponentFieldMeta[Option[String]] =
            FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
          val code: FHIRComponentFieldMeta[Option[CodeableConcept]] =
            FHIRComponentFieldMeta("code", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
          val count: FHIRComponentFieldMeta[Option[Int]] =
            FHIRComponentFieldMeta("count", lTagOf[Option[Int]], false, lTagOf[Int])
          val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
            FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
          val subjectResults: FHIRComponentFieldMeta[Option[Reference]] =
            FHIRComponentFieldMeta("subjectResults", lTagOf[Option[Reference]], false, lTagOf[Reference])
          val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
            FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
          val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
            Seq(id, code, count, extension, subjectResults, modifierExtension)
          override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
          override def fields(t: Population): Seq[FHIRComponentField[_]] = Seq(
            FHIRComponentField[Option[String]](id, t.id),
            FHIRComponentField[Option[CodeableConcept]](code, t.code),
            FHIRComponentField[Option[Int]](count, t.count),
            FHIRComponentField[LitSeq[Extension]](extension, t.extension),
            FHIRComponentField[Option[Reference]](subjectResults, t.subjectResults),
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
                  cursor.decodeAs[Option[Int]]("count", Some(None)),
                  cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
                  cursor.decodeAs[Option[Reference]]("subjectResults", Some(None)),
                  cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
                  decodeAttributes(cursor)
                )
              ))
        }
        @POJOBoilerplate
        class Population(
            override val id: Option[String] = None,
            val code: Option[CodeableConcept] = None,
            val count: Option[Int] = None,
            override val extension: LitSeq[Extension] = LitSeq.empty,
            val subjectResults: Option[Reference] = None,
            override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
            override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
              FHIRObject.emptyAtts)
            extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
        def apply(
            id: Option[String] = None,
            value: Option[CodeableConcept] = None,
            extension: LitSeq[Extension] = LitSeq.empty,
            measureScore: Option[Quantity] = None,
            modifierExtension: LitSeq[Extension] = LitSeq.empty,
            component: LitSeq[Stratum.Component] = LitSeq.empty,
            population: LitSeq[Stratum.Population] = LitSeq.empty,
            primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
        ): Stratum = new Stratum(
          id,
          value,
          extension,
          measureScore,
          modifierExtension,
          component,
          population,
          primitiveAttributes = primitiveAttributes
        )
        def unapply(
            o: Stratum): Option[(Option[String], Option[CodeableConcept], LitSeq[Extension], Option[Quantity], LitSeq[Extension], LitSeq[Stratum.Component], LitSeq[Stratum.Population])] =
          Some((o.id, o.value, o.extension, o.measureScore, o.modifierExtension, o.component, o.population))
        val id: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
        val value: FHIRComponentFieldMeta[Option[CodeableConcept]] =
          FHIRComponentFieldMeta("value", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
        val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val measureScore: FHIRComponentFieldMeta[Option[Quantity]] =
          FHIRComponentFieldMeta("measureScore", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
        val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val component: FHIRComponentFieldMeta[LitSeq[Stratum.Component]] =
          FHIRComponentFieldMeta("component", lTagOf[LitSeq[Stratum.Component]], false, lTagOf[Stratum.Component])
        val population: FHIRComponentFieldMeta[LitSeq[Stratum.Population]] =
          FHIRComponentFieldMeta("population", lTagOf[LitSeq[Stratum.Population]], false, lTagOf[Stratum.Population])
        val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
          Seq(id, value, extension, measureScore, modifierExtension, component, population)
        override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
        override def fields(t: Stratum): Seq[FHIRComponentField[_]] = Seq(
          FHIRComponentField[Option[String]](id, t.id),
          FHIRComponentField[Option[CodeableConcept]](value, t.value),
          FHIRComponentField[LitSeq[Extension]](extension, t.extension),
          FHIRComponentField[Option[Quantity]](measureScore, t.measureScore),
          FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
          FHIRComponentField[LitSeq[Stratum.Component]](component, t.component),
          FHIRComponentField[LitSeq[Stratum.Population]](population, t.population)
        )
        val baseType: CompanionFor[Stratum] = this
        val thisName: String                = "Stratum"
        def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Stratum] =
          checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
            Try(
              new Stratum(
                cursor.decodeAs[Option[String]]("id", Some(None)),
                cursor.decodeAs[Option[CodeableConcept]]("value", Some(None)),
                cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
                cursor.decodeAs[Option[Quantity]]("measureScore", Some(None)),
                cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
                cursor.decodeAs[LitSeq[Stratum.Component]]("component", Some(LitSeq.empty)),
                cursor.decodeAs[LitSeq[Stratum.Population]]("population", Some(LitSeq.empty)),
                decodeAttributes(cursor)
              )
            ))
      }
      @POJOBoilerplate
      class Stratum(
          override val id: Option[String] = None,
          val value: Option[CodeableConcept] = None,
          override val extension: LitSeq[Extension] = LitSeq.empty,
          val measureScore: Option[Quantity] = None,
          override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
          val component: LitSeq[Stratum.Component] = LitSeq.empty,
          val population: LitSeq[Stratum.Population] = LitSeq.empty,
          override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
            FHIRObject.emptyAtts)
          extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
      def apply(
          id: Option[String] = None,
          code: LitSeq[CodeableConcept] = LitSeq.empty,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          stratum: LitSeq[Stratifier.Stratum] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Stratifier = new Stratifier(
        id,
        code,
        extension,
        modifierExtension,
        stratum,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Stratifier): Option[(Option[String], LitSeq[CodeableConcept], LitSeq[Extension], LitSeq[Extension], LitSeq[Stratifier.Stratum])] =
        Some((o.id, o.code, o.extension, o.modifierExtension, o.stratum))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val code: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
        FHIRComponentFieldMeta("code", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val stratum: FHIRComponentFieldMeta[LitSeq[Stratifier.Stratum]] =
        FHIRComponentFieldMeta("stratum", lTagOf[LitSeq[Stratifier.Stratum]], false, lTagOf[Stratifier.Stratum])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, code, extension, modifierExtension, stratum)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Stratifier): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[LitSeq[CodeableConcept]](code, t.code),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
        FHIRComponentField[LitSeq[Stratifier.Stratum]](stratum, t.stratum)
      )
      val baseType: CompanionFor[Stratifier] = this
      val thisName: String                   = "Stratifier"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Stratifier] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Stratifier(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[LitSeq[CodeableConcept]]("code", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Stratifier.Stratum]]("stratum", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Stratifier(
        override val id: Option[String] = None,
        val code: LitSeq[CodeableConcept] = LitSeq.empty,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        val stratum: LitSeq[Stratifier.Stratum] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        code: Option[CodeableConcept] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        measureScore: Option[Quantity] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        population: LitSeq[Group.Population] = LitSeq.empty,
        stratifier: LitSeq[Group.Stratifier] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Group = new Group(
      id,
      code,
      extension,
      measureScore,
      modifierExtension,
      population,
      stratifier,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Group): Option[(Option[String], Option[CodeableConcept], LitSeq[Extension], Option[Quantity], LitSeq[Extension], LitSeq[Group.Population], LitSeq[Group.Stratifier])] =
      Some((o.id, o.code, o.extension, o.measureScore, o.modifierExtension, o.population, o.stratifier))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val code: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("code", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val measureScore: FHIRComponentFieldMeta[Option[Quantity]] =
      FHIRComponentFieldMeta("measureScore", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val population: FHIRComponentFieldMeta[LitSeq[Group.Population]] =
      FHIRComponentFieldMeta("population", lTagOf[LitSeq[Group.Population]], false, lTagOf[Group.Population])
    val stratifier: FHIRComponentFieldMeta[LitSeq[Group.Stratifier]] =
      FHIRComponentFieldMeta("stratifier", lTagOf[LitSeq[Group.Stratifier]], false, lTagOf[Group.Stratifier])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, code, extension, measureScore, modifierExtension, population, stratifier)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Group): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](code, t.code),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Quantity]](measureScore, t.measureScore),
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
            cursor.decodeAs[Option[Quantity]]("measureScore", Some(None)),
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
      val measureScore: Option[Quantity] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val population: LitSeq[Group.Population] = LitSeq.empty,
      val stratifier: LitSeq[Group.Stratifier] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      `type`: MEASURE_REPORT_TYPE,
      date: Option[FHIRDateTime] = None,
      status: MEASURE_REPORT_STATUS,
      period: Period,
      measure: Canonical,
      subject: Option[Reference] = None,
      language: Option[LANGUAGES] = None,
      reporter: Option[Reference] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      evaluatedResource: LitSeq[Reference] = LitSeq.empty,
      improvementNotation: Option[CodeableConcept] = None,
      group: LitSeq[MeasureReport.Group] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): MeasureReport = new MeasureReport(
    id,
    meta,
    text,
    `type`,
    date,
    status,
    period,
    measure,
    subject,
    language,
    reporter,
    contained,
    extension,
    identifier,
    implicitRules,
    modifierExtension,
    evaluatedResource,
    improvementNotation,
    group,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val `type`: FHIRComponentFieldMeta[MEASURE_REPORT_TYPE] =
    FHIRComponentFieldMeta("type", lTagOf[MEASURE_REPORT_TYPE], false, lTagOf[MEASURE_REPORT_TYPE])
  val date: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("date", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val status: FHIRComponentFieldMeta[MEASURE_REPORT_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[MEASURE_REPORT_STATUS], false, lTagOf[MEASURE_REPORT_STATUS])
  val period: FHIRComponentFieldMeta[Period] =
    FHIRComponentFieldMeta("period", lTagOf[Period], false, lTagOf[Period])
  val measure: FHIRComponentFieldMeta[Canonical] =
    FHIRComponentFieldMeta("measure", lTagOf[Canonical], false, lTagOf[Canonical])
  val subject: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("subject", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val reporter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("reporter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val evaluatedResource: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("evaluatedResource", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val improvementNotation: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("improvementNotation", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val group: FHIRComponentFieldMeta[LitSeq[MeasureReport.Group]] =
    FHIRComponentFieldMeta("group", lTagOf[LitSeq[MeasureReport.Group]], false, lTagOf[MeasureReport.Group])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    `type`,
    date,
    status,
    period,
    measure,
    subject,
    language,
    reporter,
    contained,
    extension,
    identifier,
    implicitRules,
    modifierExtension,
    evaluatedResource,
    improvementNotation,
    group
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: MeasureReport): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[MEASURE_REPORT_TYPE](`type`, t.`type`),
    FHIRComponentField[Option[FHIRDateTime]](date, t.date),
    FHIRComponentField[MEASURE_REPORT_STATUS](status, t.status),
    FHIRComponentField[Period](period, t.period),
    FHIRComponentField[Canonical](measure, t.measure),
    FHIRComponentField[Option[Reference]](subject, t.subject),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Option[Reference]](reporter, t.reporter),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[Reference]](evaluatedResource, t.evaluatedResource),
    FHIRComponentField[Option[CodeableConcept]](improvementNotation, t.improvementNotation),
    FHIRComponentField[LitSeq[MeasureReport.Group]](group, t.group)
  )
  def extractId(t: MeasureReport): Option[String]                           = t.id
  def extractMeta(t: MeasureReport): Option[Meta]                           = t.meta
  def extractText(t: MeasureReport): Option[Narrative]                      = t.text
  def extractType(t: MeasureReport): MEASURE_REPORT_TYPE                    = t.`type`
  def extractDate(t: MeasureReport): Option[FHIRDateTime]                   = t.date
  def extractStatus(t: MeasureReport): MEASURE_REPORT_STATUS                = t.status
  def extractPeriod(t: MeasureReport): Period                               = t.period
  def extractMeasure(t: MeasureReport): Canonical                           = t.measure
  def extractSubject(t: MeasureReport): Option[Reference]                   = t.subject
  def extractLanguage(t: MeasureReport): Option[LANGUAGES]                  = t.language
  def extractReporter(t: MeasureReport): Option[Reference]                  = t.reporter
  def extractContained(t: MeasureReport): LitSeq[Resource]                  = t.contained
  def extractExtension(t: MeasureReport): LitSeq[Extension]                 = t.extension
  def extractIdentifier(t: MeasureReport): LitSeq[Identifier]               = t.identifier
  def extractImplicitRules(t: MeasureReport): Option[UriStr]                = t.implicitRules
  def extractModifierExtension(t: MeasureReport): LitSeq[Extension]         = t.modifierExtension
  def extractEvaluatedResource(t: MeasureReport): LitSeq[Reference]         = t.evaluatedResource
  def extractImprovementNotation(t: MeasureReport): Option[CodeableConcept] = t.improvementNotation
  def extractGroup(t: MeasureReport): LitSeq[MeasureReport.Group]           = t.group
  override val thisName: String                                             = "MeasureReport"
  override val searchParams: Map[String, MeasureReport => Seq[Any]] = Map(
    "measure"            -> (obj => Seq(obj.measure)),
    "subject"            -> (obj => obj.subject.toSeq),
    "identifier"         -> (obj => obj.identifier.toSeq),
    "reporter"           -> (obj => obj.reporter.toSeq),
    "date"               -> (obj => obj.date.toSeq),
    "status"             -> (obj => Seq(obj.status)),
    "evaluated-resource" -> (obj => obj.evaluatedResource.toSeq),
    "period"             -> (obj => Seq(obj.period)),
    "patient"            -> (obj => obj.subject.filter(_.reference.exists(_.contains("Patient/"))).toSeq)
  )
  def unapply(
      o: MeasureReport): Option[(Option[String], Option[Meta], Option[Narrative], MEASURE_REPORT_TYPE, Option[FHIRDateTime], MEASURE_REPORT_STATUS, Period, Canonical, Option[Reference], Option[LANGUAGES], Option[Reference], LitSeq[Resource], LitSeq[Extension], LitSeq[Identifier], Option[UriStr], LitSeq[Extension], LitSeq[Reference], Option[CodeableConcept], LitSeq[MeasureReport.Group])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.`type`,
        o.date,
        o.status,
        o.period,
        o.measure,
        o.subject,
        o.language,
        o.reporter,
        o.contained,
        o.extension,
        o.identifier,
        o.implicitRules,
        o.modifierExtension,
        o.evaluatedResource,
        o.improvementNotation,
        o.group))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[MeasureReport] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new MeasureReport(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[MEASURE_REPORT_TYPE]("type", None),
          cursor.decodeAs[Option[FHIRDateTime]]("date", Some(None)),
          cursor.decodeAs[MEASURE_REPORT_STATUS]("status", None),
          cursor.decodeAs[Period]("period", None),
          cursor.decodeAs[Canonical]("measure", None),
          cursor.decodeAs[Option[Reference]]("subject", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[Reference]]("reporter", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("evaluatedResource", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("improvementNotation", Some(None)),
          cursor.decodeAs[LitSeq[MeasureReport.Group]]("group", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** The MeasureReport resource contains the results of the calculation of a measure; and optionally a reference to the
  * resources involved in that calculation.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields `type`, date, status, period, measure, subject, reporter, identifier, evaluatedResource,
  *   improvementNotation, group.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the
  *   content might not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of
  *   the resource to a human. The narrative need not encode all the structured data, but is required to contain
  *   sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may
  *   define what content should be represented in the narrative to ensure clinical safety.
  * @param `type`
  *   - The type of measure report. This may be an individual report, which provides the score for the measure for an
  *   individual member of the population; a subject-listing, which returns the list of members that meet the various
  *   criteria in the measure; a summary report, which returns a population count for each of the criteria in the
  *   measure; or a data-collection, which enables the MeasureReport to be used to exchange the data-of-interest for a
  *   quality measure.
  * @param date
  *   - The date this measure report was generated.
  * @param status
  *   - The MeasureReport status. No data will be available until the MeasureReport status is complete.
  * @param period
  *   - The reporting period for which the report was calculated.
  * @param measure
  *   - A reference to the Measure that was calculated to produce this report.
  * @param subject
  *   - Optional subject identifying the individual or individuals the report is for.
  * @param language
  *   - The base language in which the resource is written.
  * @param reporter
  *   - The individual, location, or organization that is reporting the data.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To
  *   make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and
  *   use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be
  *   met as part of the definition of the extension.
  * @param identifier
  *   - A formal identifier that is used to identify this MeasureReport when it is represented in other formats or
  *   referenced in a specification, model, design or an instance.
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
  * @param evaluatedResource
  *   - A reference to a Bundle containing the Resources that were used in the calculation of this measure.
  * @param improvementNotation
  *   - Whether improvement in the measure is noted by an increase or decrease in the measure score.
  * @param group
  *   - The results of the calculation, one for each population group in the measure.
  */
@POJOBoilerplate
class MeasureReport(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val `type`: MEASURE_REPORT_TYPE,
    val date: Option[FHIRDateTime] = None,
    val status: MEASURE_REPORT_STATUS,
    val period: Period,
    val measure: Canonical,
    val subject: Option[Reference] = None,
    override val language: Option[LANGUAGES] = None,
    val reporter: Option[Reference] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val evaluatedResource: LitSeq[Reference] = LitSeq.empty,
    val improvementNotation: Option[CodeableConcept] = None,
    val group: LitSeq[MeasureReport.Group] = LitSeq.empty,
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
  override val thisTypeName: String = "MeasureReport"
}
