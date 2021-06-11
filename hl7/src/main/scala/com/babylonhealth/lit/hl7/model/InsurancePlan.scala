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

object InsurancePlan extends CompanionFor[InsurancePlan] {
  override type ResourceType = InsurancePlan
  override type ParentType   = InsurancePlan
  override val baseType: CompanionFor[ResourceType] = InsurancePlan
  override val parentType: CompanionFor[ParentType] = InsurancePlan
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/InsurancePlan")
  object Plan extends CompanionFor[Plan] {
    override type ResourceType = Plan
    override type ParentType   = Plan
    override val parentType: CompanionFor[ResourceType] = Plan
    object GeneralCost extends CompanionFor[GeneralCost] {
      override type ResourceType = GeneralCost
      override type ParentType   = GeneralCost
      override val parentType: CompanionFor[ResourceType] = GeneralCost
      def apply(
          id: Option[String] = None,
          `type`: Option[CodeableConcept] = None,
          cost: Option[Money] = None,
          comment: Option[String] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          groupSize: Option[PositiveInt] = None,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): GeneralCost = new GeneralCost(
        id,
        `type`,
        cost,
        comment,
        extension,
        groupSize,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: GeneralCost): Option[(Option[String], Option[CodeableConcept], Option[Money], Option[String], LitSeq[Extension], Option[PositiveInt], LitSeq[Extension])] =
        Some((o.id, o.`type`, o.cost, o.comment, o.extension, o.groupSize, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val cost: FHIRComponentFieldMeta[Option[Money]] =
        FHIRComponentFieldMeta("cost", lTagOf[Option[Money]], false, lTagOf[Money])
      val comment: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("comment", lTagOf[Option[String]], false, lTagOf[String])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val groupSize: FHIRComponentFieldMeta[Option[PositiveInt]] =
        FHIRComponentFieldMeta("groupSize", lTagOf[Option[PositiveInt]], false, lTagOf[PositiveInt])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
        Seq(id, `type`, cost, comment, extension, groupSize, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: GeneralCost): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
        FHIRComponentField[Option[Money]](cost, t.cost),
        FHIRComponentField[Option[String]](comment, t.comment),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[PositiveInt]](groupSize, t.groupSize),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[GeneralCost] = this
      val thisName: String                    = "GeneralCost"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[GeneralCost] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new GeneralCost(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
              cursor.decodeAs[Option[Money]]("cost", Some(None)),
              cursor.decodeAs[Option[String]]("comment", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[PositiveInt]]("groupSize", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class GeneralCost(
        override val id: Option[String] = None,
        val `type`: Option[CodeableConcept] = None,
        val cost: Option[Money] = None,
        val comment: Option[String] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val groupSize: Option[PositiveInt] = None,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object SpecificCost extends CompanionFor[SpecificCost] {
      override type ResourceType = SpecificCost
      override type ParentType   = SpecificCost
      override val parentType: CompanionFor[ResourceType] = SpecificCost
      object Benefit extends CompanionFor[Benefit] {
        override type ResourceType = Benefit
        override type ParentType   = Benefit
        override val parentType: CompanionFor[ResourceType] = Benefit
        object Cost extends CompanionFor[Cost] {
          override type ResourceType = Cost
          override type ParentType   = Cost
          override val parentType: CompanionFor[ResourceType] = Cost
          def apply(
              id: Option[String] = None,
              `type`: CodeableConcept,
              value: Option[Quantity] = None,
              extension: LitSeq[Extension] = LitSeq.empty,
              qualifiers: LitSeq[CodeableConcept] = LitSeq.empty,
              applicability: Option[CodeableConcept] = None,
              modifierExtension: LitSeq[Extension] = LitSeq.empty,
              primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
          ): Cost = new Cost(
            id,
            `type`,
            value,
            extension,
            qualifiers,
            applicability,
            modifierExtension,
            primitiveAttributes = primitiveAttributes
          )
          def unapply(
              o: Cost): Option[(Option[String], CodeableConcept, Option[Quantity], LitSeq[Extension], LitSeq[CodeableConcept], Option[CodeableConcept], LitSeq[Extension])] =
            Some((o.id, o.`type`, o.value, o.extension, o.qualifiers, o.applicability, o.modifierExtension))
          val id: FHIRComponentFieldMeta[Option[String]] =
            FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
          val `type`: FHIRComponentFieldMeta[CodeableConcept] =
            FHIRComponentFieldMeta("type", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
          val value: FHIRComponentFieldMeta[Option[Quantity]] =
            FHIRComponentFieldMeta("value", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
          val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
            FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
          val qualifiers: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
            FHIRComponentFieldMeta("qualifiers", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
          val applicability: FHIRComponentFieldMeta[Option[CodeableConcept]] =
            FHIRComponentFieldMeta("applicability", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
          val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
            FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
          val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
            Seq(id, `type`, value, extension, qualifiers, applicability, modifierExtension)
          override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
          override def fields(t: Cost): Seq[FHIRComponentField[_]] = Seq(
            FHIRComponentField[Option[String]](id, t.id),
            FHIRComponentField[CodeableConcept](`type`, t.`type`),
            FHIRComponentField[Option[Quantity]](value, t.value),
            FHIRComponentField[LitSeq[Extension]](extension, t.extension),
            FHIRComponentField[LitSeq[CodeableConcept]](qualifiers, t.qualifiers),
            FHIRComponentField[Option[CodeableConcept]](applicability, t.applicability),
            FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
          )
          val baseType: CompanionFor[Cost] = this
          val thisName: String             = "Cost"
          def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Cost] =
            checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
              Try(
                new Cost(
                  cursor.decodeAs[Option[String]]("id", Some(None)),
                  cursor.decodeAs[CodeableConcept]("type", None),
                  cursor.decodeAs[Option[Quantity]]("value", Some(None)),
                  cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
                  cursor.decodeAs[LitSeq[CodeableConcept]]("qualifiers", Some(LitSeq.empty)),
                  cursor.decodeAs[Option[CodeableConcept]]("applicability", Some(None)),
                  cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
                  decodeAttributes(cursor)
                )
              ))
        }
        @POJOBoilerplate
        class Cost(
            override val id: Option[String] = None,
            val `type`: CodeableConcept,
            val value: Option[Quantity] = None,
            override val extension: LitSeq[Extension] = LitSeq.empty,
            val qualifiers: LitSeq[CodeableConcept] = LitSeq.empty,
            val applicability: Option[CodeableConcept] = None,
            override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
            override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
              FHIRObject.emptyAtts)
            extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
        def apply(
            id: Option[String] = None,
            `type`: CodeableConcept,
            extension: LitSeq[Extension] = LitSeq.empty,
            modifierExtension: LitSeq[Extension] = LitSeq.empty,
            cost: LitSeq[Benefit.Cost] = LitSeq.empty,
            primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
        ): Benefit = new Benefit(
          id,
          `type`,
          extension,
          modifierExtension,
          cost,
          primitiveAttributes = primitiveAttributes
        )
        def unapply(
            o: Benefit): Option[(Option[String], CodeableConcept, LitSeq[Extension], LitSeq[Extension], LitSeq[Benefit.Cost])] =
          Some((o.id, o.`type`, o.extension, o.modifierExtension, o.cost))
        val id: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
        val `type`: FHIRComponentFieldMeta[CodeableConcept] =
          FHIRComponentFieldMeta("type", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
        val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val cost: FHIRComponentFieldMeta[LitSeq[Benefit.Cost]] =
          FHIRComponentFieldMeta("cost", lTagOf[LitSeq[Benefit.Cost]], false, lTagOf[Benefit.Cost])
        val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, `type`, extension, modifierExtension, cost)
        override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
        override def fields(t: Benefit): Seq[FHIRComponentField[_]] = Seq(
          FHIRComponentField[Option[String]](id, t.id),
          FHIRComponentField[CodeableConcept](`type`, t.`type`),
          FHIRComponentField[LitSeq[Extension]](extension, t.extension),
          FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
          FHIRComponentField[LitSeq[Benefit.Cost]](cost, t.cost)
        )
        val baseType: CompanionFor[Benefit] = this
        val thisName: String                = "Benefit"
        def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Benefit] =
          checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
            Try(
              new Benefit(
                cursor.decodeAs[Option[String]]("id", Some(None)),
                cursor.decodeAs[CodeableConcept]("type", None),
                cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
                cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
                cursor.decodeAs[LitSeq[Benefit.Cost]]("cost", Some(LitSeq.empty)),
                decodeAttributes(cursor)
              )
            ))
      }
      @POJOBoilerplate
      class Benefit(
          override val id: Option[String] = None,
          val `type`: CodeableConcept,
          override val extension: LitSeq[Extension] = LitSeq.empty,
          override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
          val cost: LitSeq[Benefit.Cost] = LitSeq.empty,
          override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
            FHIRObject.emptyAtts)
          extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
      def apply(
          id: Option[String] = None,
          category: CodeableConcept,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          benefit: LitSeq[SpecificCost.Benefit] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): SpecificCost = new SpecificCost(
        id,
        category,
        extension,
        modifierExtension,
        benefit,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: SpecificCost): Option[(Option[String], CodeableConcept, LitSeq[Extension], LitSeq[Extension], LitSeq[SpecificCost.Benefit])] =
        Some((o.id, o.category, o.extension, o.modifierExtension, o.benefit))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val category: FHIRComponentFieldMeta[CodeableConcept] =
        FHIRComponentFieldMeta("category", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val benefit: FHIRComponentFieldMeta[LitSeq[SpecificCost.Benefit]] =
        FHIRComponentFieldMeta("benefit", lTagOf[LitSeq[SpecificCost.Benefit]], false, lTagOf[SpecificCost.Benefit])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, category, extension, modifierExtension, benefit)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: SpecificCost): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[CodeableConcept](category, t.category),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
        FHIRComponentField[LitSeq[SpecificCost.Benefit]](benefit, t.benefit)
      )
      val baseType: CompanionFor[SpecificCost] = this
      val thisName: String                     = "SpecificCost"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[SpecificCost] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new SpecificCost(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[CodeableConcept]("category", None),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[SpecificCost.Benefit]]("benefit", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class SpecificCost(
        override val id: Option[String] = None,
        val category: CodeableConcept,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        val benefit: LitSeq[SpecificCost.Benefit] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        `type`: Option[CodeableConcept] = None,
        network: LitSeq[Reference] = LitSeq.empty,
        extension: LitSeq[Extension] = LitSeq.empty,
        identifier: LitSeq[Identifier] = LitSeq.empty,
        coverageArea: LitSeq[Reference] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        generalCost: LitSeq[Plan.GeneralCost] = LitSeq.empty,
        specificCost: LitSeq[Plan.SpecificCost] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Plan = new Plan(
      id,
      `type`,
      network,
      extension,
      identifier,
      coverageArea,
      modifierExtension,
      generalCost,
      specificCost,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Plan): Option[(Option[String], Option[CodeableConcept], LitSeq[Reference], LitSeq[Extension], LitSeq[Identifier], LitSeq[Reference], LitSeq[Extension], LitSeq[Plan.GeneralCost], LitSeq[Plan.SpecificCost])] =
      Some(
        (
          o.id,
          o.`type`,
          o.network,
          o.extension,
          o.identifier,
          o.coverageArea,
          o.modifierExtension,
          o.generalCost,
          o.specificCost))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val network: FHIRComponentFieldMeta[LitSeq[Reference]] =
      FHIRComponentFieldMeta("network", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
      FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
    val coverageArea: FHIRComponentFieldMeta[LitSeq[Reference]] =
      FHIRComponentFieldMeta("coverageArea", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val generalCost: FHIRComponentFieldMeta[LitSeq[Plan.GeneralCost]] =
      FHIRComponentFieldMeta("generalCost", lTagOf[LitSeq[Plan.GeneralCost]], false, lTagOf[Plan.GeneralCost])
    val specificCost: FHIRComponentFieldMeta[LitSeq[Plan.SpecificCost]] =
      FHIRComponentFieldMeta("specificCost", lTagOf[LitSeq[Plan.SpecificCost]], false, lTagOf[Plan.SpecificCost])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, `type`, network, extension, identifier, coverageArea, modifierExtension, generalCost, specificCost)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Plan): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[LitSeq[Reference]](network, t.network),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
      FHIRComponentField[LitSeq[Reference]](coverageArea, t.coverageArea),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[Plan.GeneralCost]](generalCost, t.generalCost),
      FHIRComponentField[LitSeq[Plan.SpecificCost]](specificCost, t.specificCost)
    )
    val baseType: CompanionFor[Plan] = this
    val thisName: String             = "Plan"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Plan] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Plan(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
            cursor.decodeAs[LitSeq[Reference]]("network", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Reference]]("coverageArea", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Plan.GeneralCost]]("generalCost", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Plan.SpecificCost]]("specificCost", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Plan(
      override val id: Option[String] = None,
      val `type`: Option[CodeableConcept] = None,
      val network: LitSeq[Reference] = LitSeq.empty,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val identifier: LitSeq[Identifier] = LitSeq.empty,
      val coverageArea: LitSeq[Reference] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val generalCost: LitSeq[Plan.GeneralCost] = LitSeq.empty,
      val specificCost: LitSeq[Plan.SpecificCost] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Coverage extends CompanionFor[Coverage] {
    override type ResourceType = Coverage
    override type ParentType   = Coverage
    override val parentType: CompanionFor[ResourceType] = Coverage
    object Benefit extends CompanionFor[Benefit] {
      override type ResourceType = Benefit
      override type ParentType   = Benefit
      override val parentType: CompanionFor[ResourceType] = Benefit
      object Limit extends CompanionFor[Limit] {
        override type ResourceType = Limit
        override type ParentType   = Limit
        override val parentType: CompanionFor[ResourceType] = Limit
        def apply(
            id: Option[String] = None,
            code: Option[CodeableConcept] = None,
            value: Option[Quantity] = None,
            extension: LitSeq[Extension] = LitSeq.empty,
            modifierExtension: LitSeq[Extension] = LitSeq.empty,
            primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
        ): Limit = new Limit(
          id,
          code,
          value,
          extension,
          modifierExtension,
          primitiveAttributes = primitiveAttributes
        )
        def unapply(
            o: Limit): Option[(Option[String], Option[CodeableConcept], Option[Quantity], LitSeq[Extension], LitSeq[Extension])] =
          Some((o.id, o.code, o.value, o.extension, o.modifierExtension))
        val id: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
        val code: FHIRComponentFieldMeta[Option[CodeableConcept]] =
          FHIRComponentFieldMeta("code", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
        val value: FHIRComponentFieldMeta[Option[Quantity]] =
          FHIRComponentFieldMeta("value", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
        val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, code, value, extension, modifierExtension)
        override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
        override def fields(t: Limit): Seq[FHIRComponentField[_]] = Seq(
          FHIRComponentField[Option[String]](id, t.id),
          FHIRComponentField[Option[CodeableConcept]](code, t.code),
          FHIRComponentField[Option[Quantity]](value, t.value),
          FHIRComponentField[LitSeq[Extension]](extension, t.extension),
          FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
        )
        val baseType: CompanionFor[Limit] = this
        val thisName: String              = "Limit"
        def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Limit] =
          checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
            Try(
              new Limit(
                cursor.decodeAs[Option[String]]("id", Some(None)),
                cursor.decodeAs[Option[CodeableConcept]]("code", Some(None)),
                cursor.decodeAs[Option[Quantity]]("value", Some(None)),
                cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
                cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
                decodeAttributes(cursor)
              )
            ))
      }
      @POJOBoilerplate
      class Limit(
          override val id: Option[String] = None,
          val code: Option[CodeableConcept] = None,
          val value: Option[Quantity] = None,
          override val extension: LitSeq[Extension] = LitSeq.empty,
          override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
          override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
            FHIRObject.emptyAtts)
          extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
      def apply(
          id: Option[String] = None,
          `type`: CodeableConcept,
          extension: LitSeq[Extension] = LitSeq.empty,
          requirement: Option[String] = None,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          limit: LitSeq[Benefit.Limit] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Benefit = new Benefit(
        id,
        `type`,
        extension,
        requirement,
        modifierExtension,
        limit,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Benefit): Option[(Option[String], CodeableConcept, LitSeq[Extension], Option[String], LitSeq[Extension], LitSeq[Benefit.Limit])] =
        Some((o.id, o.`type`, o.extension, o.requirement, o.modifierExtension, o.limit))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val `type`: FHIRComponentFieldMeta[CodeableConcept] =
        FHIRComponentFieldMeta("type", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val requirement: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("requirement", lTagOf[Option[String]], false, lTagOf[String])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val limit: FHIRComponentFieldMeta[LitSeq[Benefit.Limit]] =
        FHIRComponentFieldMeta("limit", lTagOf[LitSeq[Benefit.Limit]], false, lTagOf[Benefit.Limit])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, `type`, extension, requirement, modifierExtension, limit)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Benefit): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[CodeableConcept](`type`, t.`type`),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[String]](requirement, t.requirement),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
        FHIRComponentField[LitSeq[Benefit.Limit]](limit, t.limit)
      )
      val baseType: CompanionFor[Benefit] = this
      val thisName: String                = "Benefit"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Benefit] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Benefit(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[CodeableConcept]("type", None),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[String]]("requirement", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Benefit.Limit]]("limit", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Benefit(
        override val id: Option[String] = None,
        val `type`: CodeableConcept,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val requirement: Option[String] = None,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        val limit: LitSeq[Benefit.Limit] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        `type`: CodeableConcept,
        network: LitSeq[Reference] = LitSeq.empty,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        benefit: NonEmptyLitSeq[Coverage.Benefit],
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Coverage = new Coverage(
      id,
      `type`,
      network,
      extension,
      modifierExtension,
      benefit,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Coverage): Option[(Option[String], CodeableConcept, LitSeq[Reference], LitSeq[Extension], LitSeq[Extension], NonEmptyLitSeq[Coverage.Benefit])] =
      Some((o.id, o.`type`, o.network, o.extension, o.modifierExtension, o.benefit))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("type", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val network: FHIRComponentFieldMeta[LitSeq[Reference]] =
      FHIRComponentFieldMeta("network", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val benefit: FHIRComponentFieldMeta[NonEmptyLitSeq[Coverage.Benefit]] =
      FHIRComponentFieldMeta("benefit", lTagOf[NonEmptyLitSeq[Coverage.Benefit]], false, lTagOf[Coverage.Benefit])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, `type`, network, extension, modifierExtension, benefit)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Coverage): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[CodeableConcept](`type`, t.`type`),
      FHIRComponentField[LitSeq[Reference]](network, t.network),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[NonEmptyLitSeq[Coverage.Benefit]](benefit, t.benefit)
    )
    val baseType: CompanionFor[Coverage] = this
    val thisName: String                 = "Coverage"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Coverage] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Coverage(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[CodeableConcept]("type", None),
            cursor.decodeAs[LitSeq[Reference]]("network", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[NonEmptyLitSeq[Coverage.Benefit]]("benefit", None),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Coverage(
      override val id: Option[String] = None,
      val `type`: CodeableConcept,
      val network: LitSeq[Reference] = LitSeq.empty,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val benefit: NonEmptyLitSeq[Coverage.Benefit],
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Contact extends CompanionFor[Contact] {
    override type ResourceType = Contact
    override type ParentType   = Contact
    override val parentType: CompanionFor[ResourceType] = Contact
    def apply(
        id: Option[String] = None,
        name: Option[HumanName] = None,
        purpose: Option[CodeableConcept] = None,
        telecom: LitSeq[ContactPoint] = LitSeq.empty,
        address: Option[Address] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Contact = new Contact(
      id,
      name,
      purpose,
      telecom,
      address,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Contact): Option[(Option[String], Option[HumanName], Option[CodeableConcept], LitSeq[ContactPoint], Option[Address], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.name, o.purpose, o.telecom, o.address, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val name: FHIRComponentFieldMeta[Option[HumanName]] =
      FHIRComponentFieldMeta("name", lTagOf[Option[HumanName]], false, lTagOf[HumanName])
    val purpose: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("purpose", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val telecom: FHIRComponentFieldMeta[LitSeq[ContactPoint]] =
      FHIRComponentFieldMeta("telecom", lTagOf[LitSeq[ContactPoint]], false, lTagOf[ContactPoint])
    val address: FHIRComponentFieldMeta[Option[Address]] =
      FHIRComponentFieldMeta("address", lTagOf[Option[Address]], false, lTagOf[Address])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, name, purpose, telecom, address, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Contact): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[HumanName]](name, t.name),
      FHIRComponentField[Option[CodeableConcept]](purpose, t.purpose),
      FHIRComponentField[LitSeq[ContactPoint]](telecom, t.telecom),
      FHIRComponentField[Option[Address]](address, t.address),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Contact] = this
    val thisName: String                = "Contact"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Contact] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Contact(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[HumanName]]("name", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("purpose", Some(None)),
            cursor.decodeAs[LitSeq[ContactPoint]]("telecom", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Address]]("address", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Contact(
      override val id: Option[String] = None,
      val name: Option[HumanName] = None,
      val purpose: Option[CodeableConcept] = None,
      val telecom: LitSeq[ContactPoint] = LitSeq.empty,
      val address: Option[Address] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      `type`: LitSeq[CodeableConcept] = LitSeq.empty,
      name: Option[String] = None,
      alias: LitSeq[String] = LitSeq.empty,
      status: Option[PUBLICATION_STATUS] = None,
      period: Option[Period] = None,
      ownedBy: Option[Reference] = None,
      network: LitSeq[Reference] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      endpoint: LitSeq[Reference] = LitSeq.empty,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      coverageArea: LitSeq[Reference] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      administeredBy: Option[Reference] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      contact: LitSeq[InsurancePlan.Contact] = LitSeq.empty,
      coverage: LitSeq[InsurancePlan.Coverage] = LitSeq.empty,
      plan: LitSeq[InsurancePlan.Plan] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): InsurancePlan = new InsurancePlan(
    id,
    meta,
    text,
    `type`,
    name,
    alias,
    status,
    period,
    ownedBy,
    network,
    language,
    endpoint,
    contained,
    extension,
    identifier,
    coverageArea,
    implicitRules,
    administeredBy,
    modifierExtension,
    contact,
    coverage,
    plan,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val `type`: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("type", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val name: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("name", lTagOf[Option[String]], false, lTagOf[String])
  val alias: FHIRComponentFieldMeta[LitSeq[String]] =
    FHIRComponentFieldMeta("alias", lTagOf[LitSeq[String]], false, lTagOf[String])
  val status: FHIRComponentFieldMeta[Option[PUBLICATION_STATUS]] =
    FHIRComponentFieldMeta("status", lTagOf[Option[PUBLICATION_STATUS]], false, lTagOf[PUBLICATION_STATUS])
  val period: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("period", lTagOf[Option[Period]], false, lTagOf[Period])
  val ownedBy: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("ownedBy", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val network: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("network", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val endpoint: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("endpoint", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val coverageArea: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("coverageArea", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val administeredBy: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("administeredBy", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val contact: FHIRComponentFieldMeta[LitSeq[InsurancePlan.Contact]] =
    FHIRComponentFieldMeta("contact", lTagOf[LitSeq[InsurancePlan.Contact]], false, lTagOf[InsurancePlan.Contact])
  val coverage: FHIRComponentFieldMeta[LitSeq[InsurancePlan.Coverage]] =
    FHIRComponentFieldMeta("coverage", lTagOf[LitSeq[InsurancePlan.Coverage]], false, lTagOf[InsurancePlan.Coverage])
  val plan: FHIRComponentFieldMeta[LitSeq[InsurancePlan.Plan]] =
    FHIRComponentFieldMeta("plan", lTagOf[LitSeq[InsurancePlan.Plan]], false, lTagOf[InsurancePlan.Plan])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    `type`,
    name,
    alias,
    status,
    period,
    ownedBy,
    network,
    language,
    endpoint,
    contained,
    extension,
    identifier,
    coverageArea,
    implicitRules,
    administeredBy,
    modifierExtension,
    contact,
    coverage,
    plan
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: InsurancePlan): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[LitSeq[CodeableConcept]](`type`, t.`type`),
    FHIRComponentField[Option[String]](name, t.name),
    FHIRComponentField[LitSeq[String]](alias, t.alias),
    FHIRComponentField[Option[PUBLICATION_STATUS]](status, t.status),
    FHIRComponentField[Option[Period]](period, t.period),
    FHIRComponentField[Option[Reference]](ownedBy, t.ownedBy),
    FHIRComponentField[LitSeq[Reference]](network, t.network),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Reference]](endpoint, t.endpoint),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[LitSeq[Reference]](coverageArea, t.coverageArea),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[Reference]](administeredBy, t.administeredBy),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[InsurancePlan.Contact]](contact, t.contact),
    FHIRComponentField[LitSeq[InsurancePlan.Coverage]](coverage, t.coverage),
    FHIRComponentField[LitSeq[InsurancePlan.Plan]](plan, t.plan)
  )
  def extractId(t: InsurancePlan): Option[String]                       = t.id
  def extractMeta(t: InsurancePlan): Option[Meta]                       = t.meta
  def extractText(t: InsurancePlan): Option[Narrative]                  = t.text
  def extractType(t: InsurancePlan): LitSeq[CodeableConcept]            = t.`type`
  def extractName(t: InsurancePlan): Option[String]                     = t.name
  def extractAlias(t: InsurancePlan): LitSeq[String]                    = t.alias
  def extractStatus(t: InsurancePlan): Option[PUBLICATION_STATUS]       = t.status
  def extractPeriod(t: InsurancePlan): Option[Period]                   = t.period
  def extractOwnedBy(t: InsurancePlan): Option[Reference]               = t.ownedBy
  def extractNetwork(t: InsurancePlan): LitSeq[Reference]               = t.network
  def extractLanguage(t: InsurancePlan): Option[LANGUAGES]              = t.language
  def extractEndpoint(t: InsurancePlan): LitSeq[Reference]              = t.endpoint
  def extractContained(t: InsurancePlan): LitSeq[Resource]              = t.contained
  def extractExtension(t: InsurancePlan): LitSeq[Extension]             = t.extension
  def extractIdentifier(t: InsurancePlan): LitSeq[Identifier]           = t.identifier
  def extractCoverageArea(t: InsurancePlan): LitSeq[Reference]          = t.coverageArea
  def extractImplicitRules(t: InsurancePlan): Option[UriStr]            = t.implicitRules
  def extractAdministeredBy(t: InsurancePlan): Option[Reference]        = t.administeredBy
  def extractModifierExtension(t: InsurancePlan): LitSeq[Extension]     = t.modifierExtension
  def extractContact(t: InsurancePlan): LitSeq[InsurancePlan.Contact]   = t.contact
  def extractCoverage(t: InsurancePlan): LitSeq[InsurancePlan.Coverage] = t.coverage
  def extractPlan(t: InsurancePlan): LitSeq[InsurancePlan.Plan]         = t.plan
  override val thisName: String                                         = "InsurancePlan"
  override val searchParams: Map[String, InsurancePlan => Seq[Any]] = Map(
    "phonetic"           -> (obj => obj.name.toSeq),
    "identifier"         -> (obj => obj.identifier.toSeq),
    "address-state"      -> (obj => obj.contact.flatMap(_.address).flatMap(_.state).toSeq),
    "address-postalcode" -> (obj => obj.contact.flatMap(_.address).flatMap(_.postalCode).toSeq),
    "address-use"        -> (obj => obj.contact.flatMap(_.address).flatMap(_.use).toSeq),
    "owned-by"           -> (obj => obj.ownedBy.toSeq),
    "status"             -> (obj => obj.status.toSeq),
    "type"               -> (obj => obj.`type`.toSeq),
    "address-city"       -> (obj => obj.contact.flatMap(_.address).flatMap(_.city).toSeq),
    "endpoint"           -> (obj => obj.endpoint.toSeq),
    "address"            -> (obj => obj.contact.flatMap(_.address).toSeq),
    "administered-by"    -> (obj => obj.administeredBy.toSeq),
    "address-country"    -> (obj => obj.contact.flatMap(_.address).flatMap(_.country).toSeq)
  )
  def unapply(
      o: InsurancePlan): Option[(Option[String], Option[Meta], Option[Narrative], LitSeq[CodeableConcept], Option[String], LitSeq[String], Option[PUBLICATION_STATUS], Option[Period], Option[Reference], LitSeq[Reference], Option[LANGUAGES], LitSeq[Reference], LitSeq[Resource], LitSeq[Extension], LitSeq[Identifier], LitSeq[Reference], Option[UriStr], Option[Reference], LitSeq[Extension], LitSeq[InsurancePlan.Contact], LitSeq[InsurancePlan.Coverage], LitSeq[InsurancePlan.Plan])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.`type`,
        o.name,
        o.alias,
        o.status,
        o.period,
        o.ownedBy,
        o.network,
        o.language,
        o.endpoint,
        o.contained,
        o.extension,
        o.identifier,
        o.coverageArea,
        o.implicitRules,
        o.administeredBy,
        o.modifierExtension,
        o.contact,
        o.coverage,
        o.plan))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[InsurancePlan] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new InsurancePlan(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("type", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("name", Some(None)),
          cursor.decodeAs[LitSeq[String]]("alias", Some(LitSeq.empty)),
          cursor.decodeAs[Option[PUBLICATION_STATUS]]("status", Some(None)),
          cursor.decodeAs[Option[Period]]("period", Some(None)),
          cursor.decodeAs[Option[Reference]]("ownedBy", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("network", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("endpoint", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("coverageArea", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[Reference]]("administeredBy", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[InsurancePlan.Contact]]("contact", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[InsurancePlan.Coverage]]("coverage", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[InsurancePlan.Plan]]("plan", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Details of a Health Insurance product/plan provided by an organization.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields `type`, name, alias, status, period, ownedBy, network, endpoint, identifier, coverageArea, administeredBy, contact, coverage, plan.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param `type` - The kind of health insurance product.
  * @param name - Official name of the health insurance product as designated by the owner.
  * @param alias - A list of alternate names that the product is known as, or was known as in the past.
  * @param status - The current state of the health insurance product.
  * @param period - The period of time that the health insurance product is available.
  * @param ownedBy - The entity that is providing  the health insurance product and underwriting the risk.  This is typically an insurance carriers, other third-party payers, or health plan sponsors comonly referred to as 'payers'.
  * @param network - Reference to the network included in the health insurance product.
  * @param language - The base language in which the resource is written.
  * @param endpoint - The technical endpoints providing access to services operated for the health insurance product.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param identifier - Business identifiers assigned to this health insurance product which remain constant as the resource is updated and propagates from server to server.
  * @param coverageArea - The geographic region in which a health insurance product's benefits apply.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param administeredBy - An organization which administer other services such as underwriting, customer service and/or claims processing on behalf of the health insurance product owner.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param contact - The contact for the health insurance product for a certain purpose.
  * @param coverage - Details about the coverage offered by the insurance product.
  * @param plan - Details about an insurance plan.
  */
@POJOBoilerplate
class InsurancePlan(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val `type`: LitSeq[CodeableConcept] = LitSeq.empty,
    val name: Option[String] = None,
    val alias: LitSeq[String] = LitSeq.empty,
    val status: Option[PUBLICATION_STATUS] = None,
    val period: Option[Period] = None,
    val ownedBy: Option[Reference] = None,
    val network: LitSeq[Reference] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    val endpoint: LitSeq[Reference] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val coverageArea: LitSeq[Reference] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    val administeredBy: Option[Reference] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val contact: LitSeq[InsurancePlan.Contact] = LitSeq.empty,
    val coverage: LitSeq[InsurancePlan.Coverage] = LitSeq.empty,
    val plan: LitSeq[InsurancePlan.Plan] = LitSeq.empty,
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
  override val thisTypeName: String = "InsurancePlan"
}
