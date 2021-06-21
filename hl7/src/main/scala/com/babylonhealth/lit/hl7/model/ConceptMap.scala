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
import com.babylonhealth.lit.hl7.{ PUBLICATION_STATUS, CONCEPT_MAP_EQUIVALENCE, CONCEPTMAP_UNMAPPED_MODE }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object ConceptMap extends CompanionFor[ConceptMap] {
  implicit def summonObjectAndCompanionConceptMap_1559190174(
      o: ConceptMap): ObjectAndCompanion[ConceptMap, ConceptMap.type] = ObjectAndCompanion(o, this)
  override type ResourceType = ConceptMap
  override type ParentType   = ConceptMap
  override val baseType: CompanionFor[ResourceType] = ConceptMap
  override val parentType: CompanionFor[ParentType] = ConceptMap
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/ConceptMap")
  object Group extends CompanionFor[Group] {
    implicit def summonObjectAndCompanionGroup_161404415(o: Group): ObjectAndCompanion[Group, Group.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Group
    override type ParentType   = Group
    override val parentType: CompanionFor[ResourceType] = Group
    object Unmapped extends CompanionFor[Unmapped] {
      implicit def summonObjectAndCompanionUnmapped1729374182(
          o: Unmapped): ObjectAndCompanion[Unmapped, Unmapped.type] = ObjectAndCompanion(o, this)
      override type ResourceType = Unmapped
      override type ParentType   = Unmapped
      override val parentType: CompanionFor[ResourceType] = Unmapped
      def apply(
          id: Option[String] = None,
          url: Option[Canonical] = None,
          mode: CONCEPTMAP_UNMAPPED_MODE,
          code: Option[Code] = None,
          display: Option[String] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Unmapped = new Unmapped(
        id,
        url,
        mode,
        code,
        display,
        extension,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Unmapped): Option[(Option[String], Option[Canonical], CONCEPTMAP_UNMAPPED_MODE, Option[Code], Option[String], LitSeq[Extension], LitSeq[Extension])] =
        Some((o.id, o.url, o.mode, o.code, o.display, o.extension, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val url: FHIRComponentFieldMeta[Option[Canonical]] =
        FHIRComponentFieldMeta("url", lTagOf[Option[Canonical]], false, lTagOf[Canonical])
      val mode: FHIRComponentFieldMeta[CONCEPTMAP_UNMAPPED_MODE] =
        FHIRComponentFieldMeta("mode", lTagOf[CONCEPTMAP_UNMAPPED_MODE], false, lTagOf[CONCEPTMAP_UNMAPPED_MODE])
      val code: FHIRComponentFieldMeta[Option[Code]] =
        FHIRComponentFieldMeta("code", lTagOf[Option[Code]], false, lTagOf[Code])
      val display: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("display", lTagOf[Option[String]], false, lTagOf[String])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, url, mode, code, display, extension, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Unmapped): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[Canonical]](url, t.url),
        FHIRComponentField[CONCEPTMAP_UNMAPPED_MODE](mode, t.mode),
        FHIRComponentField[Option[Code]](code, t.code),
        FHIRComponentField[Option[String]](display, t.display),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Unmapped] = this
      val thisName: String                 = "Unmapped"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Unmapped] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Unmapped(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[Canonical]]("url", Some(None)),
              cursor.decodeAs[CONCEPTMAP_UNMAPPED_MODE]("mode", None),
              cursor.decodeAs[Option[Code]]("code", Some(None)),
              cursor.decodeAs[Option[String]]("display", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Unmapped(
        override val id: Option[String] = None,
        val url: Option[Canonical] = None,
        val mode: CONCEPTMAP_UNMAPPED_MODE,
        val code: Option[Code] = None,
        val display: Option[String] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object Element extends CompanionFor[Element] {
      implicit def summonObjectAndCompanionElement1701927640(o: Element): ObjectAndCompanion[Element, Element.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Element
      override type ParentType   = Element
      override val parentType: CompanionFor[ResourceType] = Element
      object Target extends CompanionFor[Target] {
        implicit def summonObjectAndCompanionTarget_1054624454(o: Target): ObjectAndCompanion[Target, Target.type] =
          ObjectAndCompanion(o, this)
        override type ResourceType = Target
        override type ParentType   = Target
        override val parentType: CompanionFor[ResourceType] = Target
        object DependsOn extends CompanionFor[DependsOn] {
          implicit def summonObjectAndCompanionDependsOn_1655902441(
              o: DependsOn): ObjectAndCompanion[DependsOn, DependsOn.type] = ObjectAndCompanion(o, this)
          override type ResourceType = DependsOn
          override type ParentType   = DependsOn
          override val parentType: CompanionFor[ResourceType] = DependsOn
          def apply(
              id: Option[String] = None,
              value: String,
              system: Option[Canonical] = None,
              display: Option[String] = None,
              property: UriStr,
              extension: LitSeq[Extension] = LitSeq.empty,
              modifierExtension: LitSeq[Extension] = LitSeq.empty,
              primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
          ): DependsOn = new DependsOn(
            id,
            value,
            system,
            display,
            property,
            extension,
            modifierExtension,
            primitiveAttributes = primitiveAttributes
          )
          def unapply(
              o: DependsOn): Option[(Option[String], String, Option[Canonical], Option[String], UriStr, LitSeq[Extension], LitSeq[Extension])] =
            Some((o.id, o.value, o.system, o.display, o.property, o.extension, o.modifierExtension))
          val id: FHIRComponentFieldMeta[Option[String]] =
            FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
          val value: FHIRComponentFieldMeta[String] =
            FHIRComponentFieldMeta("value", lTagOf[String], false, lTagOf[String])
          val system: FHIRComponentFieldMeta[Option[Canonical]] =
            FHIRComponentFieldMeta("system", lTagOf[Option[Canonical]], false, lTagOf[Canonical])
          val display: FHIRComponentFieldMeta[Option[String]] =
            FHIRComponentFieldMeta("display", lTagOf[Option[String]], false, lTagOf[String])
          val property: FHIRComponentFieldMeta[UriStr] =
            FHIRComponentFieldMeta("property", lTagOf[UriStr], false, lTagOf[UriStr])
          val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
            FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
          val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
            FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
          val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
            Seq(id, value, system, display, property, extension, modifierExtension)
          override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
          override def fields(t: DependsOn): Seq[FHIRComponentField[_]] = Seq(
            FHIRComponentField[Option[String]](id, t.id),
            FHIRComponentField[String](value, t.value),
            FHIRComponentField[Option[Canonical]](system, t.system),
            FHIRComponentField[Option[String]](display, t.display),
            FHIRComponentField[UriStr](property, t.property),
            FHIRComponentField[LitSeq[Extension]](extension, t.extension),
            FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
          )
          val baseType: CompanionFor[DependsOn] = this
          val thisName: String                  = "DependsOn"
          def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[DependsOn] =
            checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
              Try(
                new DependsOn(
                  cursor.decodeAs[Option[String]]("id", Some(None)),
                  cursor.decodeAs[String]("value", None),
                  cursor.decodeAs[Option[Canonical]]("system", Some(None)),
                  cursor.decodeAs[Option[String]]("display", Some(None)),
                  cursor.decodeAs[UriStr]("property", None),
                  cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
                  cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
                  decodeAttributes(cursor)
                )
              ))
        }
        @POJOBoilerplate
        class DependsOn(
            override val id: Option[String] = None,
            val value: String,
            val system: Option[Canonical] = None,
            val display: Option[String] = None,
            val property: UriStr,
            override val extension: LitSeq[Extension] = LitSeq.empty,
            override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
            override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
              FHIRObject.emptyAtts)
            extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
        def apply(
            id: Option[String] = None,
            code: Option[Code] = None,
            display: Option[String] = None,
            comment: Option[String] = None,
            product: LitSeq[ConceptMap.Group.Element.Target.DependsOn] = LitSeq.empty,
            extension: LitSeq[Extension] = LitSeq.empty,
            equivalence: CONCEPT_MAP_EQUIVALENCE,
            modifierExtension: LitSeq[Extension] = LitSeq.empty,
            dependsOn: LitSeq[Target.DependsOn] = LitSeq.empty,
            primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
        ): Target = new Target(
          id,
          code,
          display,
          comment,
          product,
          extension,
          equivalence,
          modifierExtension,
          dependsOn,
          primitiveAttributes = primitiveAttributes
        )
        def unapply(
            o: Target): Option[(Option[String], Option[Code], Option[String], Option[String], LitSeq[ConceptMap.Group.Element.Target.DependsOn], LitSeq[Extension], CONCEPT_MAP_EQUIVALENCE, LitSeq[Extension], LitSeq[Target.DependsOn])] =
          Some(
            (
              o.id,
              o.code,
              o.display,
              o.comment,
              o.product,
              o.extension,
              o.equivalence,
              o.modifierExtension,
              o.dependsOn))
        val id: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
        val code: FHIRComponentFieldMeta[Option[Code]] =
          FHIRComponentFieldMeta("code", lTagOf[Option[Code]], false, lTagOf[Code])
        val display: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("display", lTagOf[Option[String]], false, lTagOf[String])
        val comment: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("comment", lTagOf[Option[String]], false, lTagOf[String])
        val product: FHIRComponentFieldMeta[LitSeq[ConceptMap.Group.Element.Target.DependsOn]] =
          FHIRComponentFieldMeta(
            "product",
            lTagOf[LitSeq[ConceptMap.Group.Element.Target.DependsOn]],
            false,
            lTagOf[ConceptMap.Group.Element.Target.DependsOn])
        val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val equivalence: FHIRComponentFieldMeta[CONCEPT_MAP_EQUIVALENCE] =
          FHIRComponentFieldMeta("equivalence", lTagOf[CONCEPT_MAP_EQUIVALENCE], false, lTagOf[CONCEPT_MAP_EQUIVALENCE])
        val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val dependsOn: FHIRComponentFieldMeta[LitSeq[Target.DependsOn]] =
          FHIRComponentFieldMeta("dependsOn", lTagOf[LitSeq[Target.DependsOn]], false, lTagOf[Target.DependsOn])
        val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
          Seq(id, code, display, comment, product, extension, equivalence, modifierExtension, dependsOn)
        override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
        override def fields(t: Target): Seq[FHIRComponentField[_]] = Seq(
          FHIRComponentField[Option[String]](id, t.id),
          FHIRComponentField[Option[Code]](code, t.code),
          FHIRComponentField[Option[String]](display, t.display),
          FHIRComponentField[Option[String]](comment, t.comment),
          FHIRComponentField[LitSeq[ConceptMap.Group.Element.Target.DependsOn]](product, t.product),
          FHIRComponentField[LitSeq[Extension]](extension, t.extension),
          FHIRComponentField[CONCEPT_MAP_EQUIVALENCE](equivalence, t.equivalence),
          FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
          FHIRComponentField[LitSeq[Target.DependsOn]](dependsOn, t.dependsOn)
        )
        val baseType: CompanionFor[Target] = this
        val thisName: String               = "Target"
        def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Target] =
          checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
            Try(
              new Target(
                cursor.decodeAs[Option[String]]("id", Some(None)),
                cursor.decodeAs[Option[Code]]("code", Some(None)),
                cursor.decodeAs[Option[String]]("display", Some(None)),
                cursor.decodeAs[Option[String]]("comment", Some(None)),
                cursor.decodeAs[LitSeq[ConceptMap.Group.Element.Target.DependsOn]]("product", Some(LitSeq.empty)),
                cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
                cursor.decodeAs[CONCEPT_MAP_EQUIVALENCE]("equivalence", None),
                cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
                cursor.decodeAs[LitSeq[Target.DependsOn]]("dependsOn", Some(LitSeq.empty)),
                decodeAttributes(cursor)
              )
            ))
      }
      @POJOBoilerplate
      class Target(
          override val id: Option[String] = None,
          val code: Option[Code] = None,
          val display: Option[String] = None,
          val comment: Option[String] = None,
          val product: LitSeq[ConceptMap.Group.Element.Target.DependsOn] = LitSeq.empty,
          override val extension: LitSeq[Extension] = LitSeq.empty,
          val equivalence: CONCEPT_MAP_EQUIVALENCE,
          override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
          val dependsOn: LitSeq[Target.DependsOn] = LitSeq.empty,
          override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
            FHIRObject.emptyAtts)
          extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
      def apply(
          id: Option[String] = None,
          code: Option[Code] = None,
          display: Option[String] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          target: LitSeq[Element.Target] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Element = new Element(
        id,
        code,
        display,
        extension,
        modifierExtension,
        target,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Element): Option[(Option[String], Option[Code], Option[String], LitSeq[Extension], LitSeq[Extension], LitSeq[Element.Target])] =
        Some((o.id, o.code, o.display, o.extension, o.modifierExtension, o.target))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val code: FHIRComponentFieldMeta[Option[Code]] =
        FHIRComponentFieldMeta("code", lTagOf[Option[Code]], false, lTagOf[Code])
      val display: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("display", lTagOf[Option[String]], false, lTagOf[String])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val target: FHIRComponentFieldMeta[LitSeq[Element.Target]] =
        FHIRComponentFieldMeta("target", lTagOf[LitSeq[Element.Target]], false, lTagOf[Element.Target])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, code, display, extension, modifierExtension, target)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Element): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[Code]](code, t.code),
        FHIRComponentField[Option[String]](display, t.display),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
        FHIRComponentField[LitSeq[Element.Target]](target, t.target)
      )
      val baseType: CompanionFor[Element] = this
      val thisName: String                = "Element"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Element] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Element(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[Code]]("code", Some(None)),
              cursor.decodeAs[Option[String]]("display", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Element.Target]]("target", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Element(
        override val id: Option[String] = None,
        val code: Option[Code] = None,
        val display: Option[String] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        val target: LitSeq[Element.Target] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        source: Option[UriStr] = None,
        target: Option[UriStr] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        sourceVersion: Option[String] = None,
        targetVersion: Option[String] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        unmapped: Option[Group.Unmapped] = None,
        element: NonEmptyLitSeq[Group.Element],
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Group = new Group(
      id,
      source,
      target,
      extension,
      sourceVersion,
      targetVersion,
      modifierExtension,
      unmapped,
      element,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Group): Option[(Option[String], Option[UriStr], Option[UriStr], LitSeq[Extension], Option[String], Option[String], LitSeq[Extension], Option[Group.Unmapped], NonEmptyLitSeq[Group.Element])] =
      Some(
        (
          o.id,
          o.source,
          o.target,
          o.extension,
          o.sourceVersion,
          o.targetVersion,
          o.modifierExtension,
          o.unmapped,
          o.element))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val source: FHIRComponentFieldMeta[Option[UriStr]] =
      FHIRComponentFieldMeta("source", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
    val target: FHIRComponentFieldMeta[Option[UriStr]] =
      FHIRComponentFieldMeta("target", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val sourceVersion: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("sourceVersion", lTagOf[Option[String]], false, lTagOf[String])
    val targetVersion: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("targetVersion", lTagOf[Option[String]], false, lTagOf[String])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val unmapped: FHIRComponentFieldMeta[Option[Group.Unmapped]] =
      FHIRComponentFieldMeta("unmapped", lTagOf[Option[Group.Unmapped]], false, lTagOf[Group.Unmapped])
    val element: FHIRComponentFieldMeta[NonEmptyLitSeq[Group.Element]] =
      FHIRComponentFieldMeta("element", lTagOf[NonEmptyLitSeq[Group.Element]], false, lTagOf[Group.Element])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, source, target, extension, sourceVersion, targetVersion, modifierExtension, unmapped, element)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Group): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[UriStr]](source, t.source),
      FHIRComponentField[Option[UriStr]](target, t.target),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[String]](sourceVersion, t.sourceVersion),
      FHIRComponentField[Option[String]](targetVersion, t.targetVersion),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[Group.Unmapped]](unmapped, t.unmapped),
      FHIRComponentField[NonEmptyLitSeq[Group.Element]](element, t.element)
    )
    val baseType: CompanionFor[Group] = this
    val thisName: String              = "Group"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Group] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Group(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[UriStr]]("source", Some(None)),
            cursor.decodeAs[Option[UriStr]]("target", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("sourceVersion", Some(None)),
            cursor.decodeAs[Option[String]]("targetVersion", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Group.Unmapped]]("unmapped", Some(None)),
            cursor.decodeAs[NonEmptyLitSeq[Group.Element]]("element", None),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Group(
      override val id: Option[String] = None,
      val source: Option[UriStr] = None,
      val target: Option[UriStr] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val sourceVersion: Option[String] = None,
      val targetVersion: Option[String] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val unmapped: Option[Group.Unmapped] = None,
      val element: NonEmptyLitSeq[Group.Element],
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  type SourceChoice = Choice[Union00545979821]
  type TargetChoice = Choice[Union00545979821]
  def apply(
      id: Option[String] = None,
      url: Option[UriStr] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      name: Option[String] = None,
      date: Option[FHIRDateTime] = None,
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
      source: Option[ConceptMap.SourceChoice] = None,
      target: Option[ConceptMap.TargetChoice] = None,
      identifier: Option[Identifier] = None,
      useContext: LitSeq[UsageContext] = LitSeq.empty,
      description: Option[Markdown] = None,
      experimental: Option[Boolean] = None,
      jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      group: LitSeq[ConceptMap.Group] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): ConceptMap = new ConceptMap(
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
    purpose,
    language,
    contained,
    extension,
    publisher,
    copyright,
    source,
    target,
    identifier,
    useContext,
    description,
    experimental,
    jurisdiction,
    implicitRules,
    modifierExtension,
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
  val source: FHIRComponentFieldMeta[Option[ConceptMap.SourceChoice]] =
    FHIRComponentFieldMeta("source", lTagOf[Option[ConceptMap.SourceChoice]], true, lTagOf[Union00545979821])
  val target: FHIRComponentFieldMeta[Option[ConceptMap.TargetChoice]] =
    FHIRComponentFieldMeta("target", lTagOf[Option[ConceptMap.TargetChoice]], true, lTagOf[Union00545979821])
  val identifier: FHIRComponentFieldMeta[Option[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
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
  val group: FHIRComponentFieldMeta[LitSeq[ConceptMap.Group]] =
    FHIRComponentFieldMeta("group", lTagOf[LitSeq[ConceptMap.Group]], false, lTagOf[ConceptMap.Group])
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
    purpose,
    language,
    contained,
    extension,
    publisher,
    copyright,
    source,
    target,
    identifier,
    useContext,
    description,
    experimental,
    jurisdiction,
    implicitRules,
    modifierExtension,
    group
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: ConceptMap): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[UriStr]](url, t.url),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[String]](name, t.name),
    FHIRComponentField[Option[FHIRDateTime]](date, t.date),
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
    FHIRComponentField[Option[ConceptMap.SourceChoice]](source, t.source),
    FHIRComponentField[Option[ConceptMap.TargetChoice]](target, t.target),
    FHIRComponentField[Option[Identifier]](identifier, t.identifier),
    FHIRComponentField[LitSeq[UsageContext]](useContext, t.useContext),
    FHIRComponentField[Option[Markdown]](description, t.description),
    FHIRComponentField[Option[Boolean]](experimental, t.experimental),
    FHIRComponentField[LitSeq[CodeableConcept]](jurisdiction, t.jurisdiction),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[ConceptMap.Group]](group, t.group)
  )
  def extractId(t: ConceptMap): Option[String]                      = t.id
  def extractUrl(t: ConceptMap): Option[UriStr]                     = t.url
  def extractMeta(t: ConceptMap): Option[Meta]                      = t.meta
  def extractText(t: ConceptMap): Option[Narrative]                 = t.text
  def extractName(t: ConceptMap): Option[String]                    = t.name
  def extractDate(t: ConceptMap): Option[FHIRDateTime]              = t.date
  def extractTitle(t: ConceptMap): Option[String]                   = t.title
  def extractStatus(t: ConceptMap): PUBLICATION_STATUS              = t.status
  def extractVersion(t: ConceptMap): Option[String]                 = t.version
  def extractContact(t: ConceptMap): LitSeq[ContactDetail]          = t.contact
  def extractPurpose(t: ConceptMap): Option[Markdown]               = t.purpose
  def extractLanguage(t: ConceptMap): Option[LANGUAGES]             = t.language
  def extractContained(t: ConceptMap): LitSeq[Resource]             = t.contained
  def extractExtension(t: ConceptMap): LitSeq[Extension]            = t.extension
  def extractPublisher(t: ConceptMap): Option[String]               = t.publisher
  def extractCopyright(t: ConceptMap): Option[Markdown]             = t.copyright
  def extractSource(t: ConceptMap): Option[ConceptMap.SourceChoice] = t.source
  def extractTarget(t: ConceptMap): Option[ConceptMap.TargetChoice] = t.target
  def extractIdentifier(t: ConceptMap): Option[Identifier]          = t.identifier
  def extractUseContext(t: ConceptMap): LitSeq[UsageContext]        = t.useContext
  def extractDescription(t: ConceptMap): Option[Markdown]           = t.description
  def extractExperimental(t: ConceptMap): Option[Boolean]           = t.experimental
  def extractJurisdiction(t: ConceptMap): LitSeq[CodeableConcept]   = t.jurisdiction
  def extractImplicitRules(t: ConceptMap): Option[UriStr]           = t.implicitRules
  def extractModifierExtension(t: ConceptMap): LitSeq[Extension]    = t.modifierExtension
  def extractGroup(t: ConceptMap): LitSeq[ConceptMap.Group]         = t.group
  override val thisName: String                                     = "ConceptMap"
  override val searchParams: Map[String, ConceptMap => Seq[Any]] = Map(
    "jurisdiction"  -> (obj => obj.jurisdiction.toSeq),
    "description"   -> (obj => obj.description.toSeq),
    "context"       -> (obj => obj.useContext.map(_.value).flatMap(_.as[CodeableConcept]).toSeq),
    "source-system" -> (obj => obj.group.flatMap(_.source).toSeq),
    "target-code"   -> (obj => obj.group.flatMap(_.element).flatMap(_.target).flatMap(_.code).toSeq),
    "date"          -> (obj => obj.date.toSeq),
    "target-uri"    -> (obj => obj.target.flatMap(_.as[UriStr]).toSeq),
    "target"        -> (obj => obj.target.flatMap(_.as[Canonical]).toSeq),
    "product"       -> (obj => obj.group.flatMap(_.element).flatMap(_.target).flatMap(_.product).map(_.property).toSeq),
    "name"          -> (obj => obj.name.toSeq),
    "source-code"   -> (obj => obj.group.flatMap(_.element).flatMap(_.code).toSeq),
    "source"        -> (obj => obj.source.flatMap(_.as[Canonical]).toSeq),
    "context-type-quantity" -> (obj => obj.useContext.toSeq),
    "dependson"  -> (obj => obj.group.flatMap(_.element).flatMap(_.target).flatMap(_.dependsOn).map(_.property).toSeq),
    "identifier" -> (obj => obj.identifier.toSeq),
    "url"        -> (obj => obj.url.toSeq),
    "context-type-value" -> (obj => obj.useContext.toSeq),
    "version"            -> (obj => obj.version.toSeq),
    "target-system"      -> (obj => obj.group.flatMap(_.target).toSeq),
    "source-uri"         -> (obj => obj.source.flatMap(_.as[UriStr]).toSeq),
    "status"             -> (obj => Seq(obj.status)),
    "publisher"          -> (obj => obj.publisher.toSeq),
    "title"              -> (obj => obj.title.toSeq),
    "context-quantity" -> (obj =>
      obj.useContext.map(_.value).flatMap(_.as[Quantity]).toSeq ++
        obj.useContext.map(_.value).flatMap(_.as[Range]).toSeq),
    "other"        -> (obj => obj.group.flatMap(_.unmapped).flatMap(_.url).toSeq),
    "context-type" -> (obj => obj.useContext.map(_.code).toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ConceptMap] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new ConceptMap(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[UriStr]]("url", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[String]]("name", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("date", Some(None)),
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
          cursor.decodeOptRef[Union00545979821]("source"),
          cursor.decodeOptRef[Union00545979821]("target"),
          cursor.decodeAs[Option[Identifier]]("identifier", Some(None)),
          cursor.decodeAs[LitSeq[UsageContext]]("useContext", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Markdown]]("description", Some(None)),
          cursor.decodeAs[Option[Boolean]]("experimental", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("jurisdiction", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[ConceptMap.Group]]("group", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** A statement of relationships from one set of concepts to one or more other concepts - either concepts in code
  * systems, or data element/data element concepts, or classes in class models.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields url, name, date, title, status, version, contact, purpose, publisher, copyright, source,
  *   target, identifier, useContext, description, experimental, jurisdiction, group.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param url
  *   - An absolute URI that is used to identify this concept map when it is referenced in a specification, model,
  *   design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a
  *   literal address at which at which an authoritative instance of this concept map is (or will be) published. This
  *   URL can be the target of a canonical reference. It SHALL remain the same when the concept map is stored on
  *   different servers.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the
  *   content might not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of
  *   the resource to a human. The narrative need not encode all the structured data, but is required to contain
  *   sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may
  *   define what content should be represented in the narrative to ensure clinical safety.
  * @param name
  *   - A natural language name identifying the concept map. This name should be usable as an identifier for the module
  *   by machine processing applications such as code generation.
  * @param date
  *   - The date (and optionally time) when the concept map was published. The date must change when the business
  *   version changes and it must change if the status code changes. In addition, it should change when the substantive
  *   content of the concept map changes.
  * @param title
  *   - A short, descriptive, user-friendly title for the concept map.
  * @param status
  *   - The status of this concept map. Enables tracking the life-cycle of the content.
  * @param version
  *   - The identifier that is used to identify this version of the concept map when it is referenced in a
  *   specification, model, design or instance. This is an arbitrary value managed by the concept map author and is not
  *   expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not
  *   available. There is also no expectation that versions can be placed in a lexicographical sequence.
  * @param contact
  *   - Contact details to assist a user in finding and communicating with the publisher.
  * @param purpose
  *   - Explanation of why this concept map is needed and why it has been designed as it has.
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
  *   - The name of the organization or individual that published the concept map.
  * @param copyright
  *   - A copyright statement relating to the concept map and/or its contents. Copyright statements are generally legal
  *   restrictions on the use and publishing of the concept map.
  * @param source
  *   - Identifier for the source value set that contains the concepts that are being mapped and provides context for
  *   the mappings.
  * @param target
  *   - The target value set provides context for the mappings. Note that the mapping is made between concepts, not
  *   between value sets, but the value set provides important context about how the concept mapping choices are made.
  * @param identifier
  *   - A formal identifier that is used to identify this concept map when it is represented in other formats, or
  *   referenced in a specification, model, design or an instance.
  * @param useContext
  *   - The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may
  *   be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...)
  *   and may be used to assist with indexing and searching for appropriate concept map instances.
  * @param description
  *   - A free text natural language description of the concept map from a consumer's perspective.
  * @param experimental
  *   - A Boolean value to indicate that this concept map is authored for testing purposes (or
  *   education/evaluation/marketing) and is not intended to be used for genuine usage.
  * @param jurisdiction
  *   - A legal or geographic region in which the concept map is intended to be used.
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
  * @param group
  *   - A group of mappings that all have the same source and target system.
  */
@POJOBoilerplate
class ConceptMap(
    override val id: Option[String] = None,
    val url: Option[UriStr] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val name: Option[String] = None,
    val date: Option[FHIRDateTime] = None,
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
    val source: Option[ConceptMap.SourceChoice] = None,
    val target: Option[ConceptMap.TargetChoice] = None,
    val identifier: Option[Identifier] = None,
    val useContext: LitSeq[UsageContext] = LitSeq.empty,
    val description: Option[Markdown] = None,
    val experimental: Option[Boolean] = None,
    val jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val group: LitSeq[ConceptMap.Group] = LitSeq.empty,
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
  override val thisTypeName: String = "ConceptMap"
}
