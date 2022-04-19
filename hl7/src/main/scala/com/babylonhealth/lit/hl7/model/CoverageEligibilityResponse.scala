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
import com.babylonhealth.lit.hl7.{ ELIGIBILITYRESPONSE_PURPOSE, REMITTANCE_OUTCOME, FM_STATUS }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object CoverageEligibilityResponse extends CompanionFor[CoverageEligibilityResponse] {
  implicit def summonObjectAndCompanionCoverageEligibilityResponse_1590712623(
      o: CoverageEligibilityResponse): ObjectAndCompanion[CoverageEligibilityResponse, CoverageEligibilityResponse.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = CoverageEligibilityResponse
  override type ParentType   = CoverageEligibilityResponse
  override val baseType: CompanionFor[ResourceType] = CoverageEligibilityResponse
  override val parentType: CompanionFor[ParentType] = CoverageEligibilityResponse
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/CoverageEligibilityResponse")
  object Insurance extends CompanionFor[Insurance] {
    implicit def summonObjectAndCompanionInsurance_37568628(o: Insurance): ObjectAndCompanion[Insurance, Insurance.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Insurance
    override type ParentType   = Insurance
    override val parentType: CompanionFor[ResourceType] = Insurance
    object Item extends CompanionFor[Item] {
      implicit def summonObjectAndCompanionItem_159716038(o: Item): ObjectAndCompanion[Item, Item.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Item
      override type ParentType   = Item
      override val parentType: CompanionFor[ResourceType] = Item
      object Benefit extends CompanionFor[Benefit] {
        implicit def summonObjectAndCompanionBenefit2062812390(o: Benefit): ObjectAndCompanion[Benefit, Benefit.type] =
          ObjectAndCompanion(o, this)
        override type ResourceType = Benefit
        override type ParentType   = Benefit
        override val parentType: CompanionFor[ResourceType] = Benefit
        type UsedChoice    = Choice[UnionMoneyOrStringOrUnsignedInt]
        type AllowedChoice = Choice[UnionMoneyOrStringOrUnsignedInt]
        def apply(
            id: Option[String] = None,
            `type`: CodeableConcept,
            used: Option[Benefit.UsedChoice] = None,
            extension: LitSeq[Extension] = LitSeq.empty,
            allowed: Option[Benefit.AllowedChoice] = None,
            modifierExtension: LitSeq[Extension] = LitSeq.empty,
            primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
        ): Benefit = new Benefit(
          id,
          `type`,
          used,
          extension,
          allowed,
          modifierExtension,
          primitiveAttributes = primitiveAttributes
        )
        def unapply(
            o: Benefit): Option[(Option[String], CodeableConcept, Option[Benefit.UsedChoice], LitSeq[Extension], Option[Benefit.AllowedChoice], LitSeq[Extension])] =
          Some((o.id, o.`type`, o.used, o.extension, o.allowed, o.modifierExtension))
        val id: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
        val `type`: FHIRComponentFieldMeta[CodeableConcept] =
          FHIRComponentFieldMeta("type", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
        val used: FHIRComponentFieldMeta[Option[Benefit.UsedChoice]] =
          FHIRComponentFieldMeta("used", lTagOf[Option[Benefit.UsedChoice]], true, lTagOf[UnionMoneyOrStringOrUnsignedInt])
        val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val allowed: FHIRComponentFieldMeta[Option[Benefit.AllowedChoice]] =
          FHIRComponentFieldMeta("allowed", lTagOf[Option[Benefit.AllowedChoice]], true, lTagOf[UnionMoneyOrStringOrUnsignedInt])
        val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, `type`, used, extension, allowed, modifierExtension)
        override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
        override def fields(t: Benefit): Seq[FHIRComponentField[_]] = Seq(
          FHIRComponentField[Option[String]](id, t.id),
          FHIRComponentField[CodeableConcept](`type`, t.`type`),
          FHIRComponentField[Option[Benefit.UsedChoice]](used, t.used),
          FHIRComponentField[LitSeq[Extension]](extension, t.extension),
          FHIRComponentField[Option[Benefit.AllowedChoice]](allowed, t.allowed),
          FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
        )
        val baseType: CompanionFor[Benefit] = this
        val thisName: String                = "Benefit"
        def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Benefit] =
          checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
            Try(
              new Benefit(
                cursor.decodeAs[Option[String]]("id", Some(None)),
                cursor.decodeAs[CodeableConcept]("type", None),
                cursor.decodeOptRef[UnionMoneyOrStringOrUnsignedInt]("used"),
                cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
                cursor.decodeOptRef[UnionMoneyOrStringOrUnsignedInt]("allowed"),
                cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
                decodeAttributes(cursor)
              )
            ))
      }
      @POJOBoilerplate
      class Benefit(
          override val id: Option[String] = None,
          val `type`: CodeableConcept,
          val used: Option[Benefit.UsedChoice] = None,
          override val extension: LitSeq[Extension] = LitSeq.empty,
          val allowed: Option[Benefit.AllowedChoice] = None,
          override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
          override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
          extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
      def apply(
          id: Option[String] = None,
          name: Option[String] = None,
          unit: Option[CodeableConcept] = None,
          term: Option[CodeableConcept] = None,
          network: Option[CodeableConcept] = None,
          category: Option[CodeableConcept] = None,
          modifier: LitSeq[CodeableConcept] = LitSeq.empty,
          provider: Option[Reference] = None,
          excluded: Option[Boolean] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          description: Option[String] = None,
          productOrService: Option[CodeableConcept] = None,
          authorizationUrl: Option[UriStr] = None,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          authorizationRequired: Option[Boolean] = None,
          authorizationSupporting: LitSeq[CodeableConcept] = LitSeq.empty,
          benefit: LitSeq[Item.Benefit] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Item = new Item(
        id,
        name,
        unit,
        term,
        network,
        category,
        modifier,
        provider,
        excluded,
        extension,
        description,
        productOrService,
        authorizationUrl,
        modifierExtension,
        authorizationRequired,
        authorizationSupporting,
        benefit,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Item): Option[(Option[String], Option[String], Option[CodeableConcept], Option[CodeableConcept], Option[CodeableConcept], Option[CodeableConcept], LitSeq[CodeableConcept], Option[Reference], Option[Boolean], LitSeq[Extension], Option[String], Option[CodeableConcept], Option[UriStr], LitSeq[Extension], Option[Boolean], LitSeq[CodeableConcept], LitSeq[Item.Benefit])] =
        Some(
          (
            o.id,
            o.name,
            o.unit,
            o.term,
            o.network,
            o.category,
            o.modifier,
            o.provider,
            o.excluded,
            o.extension,
            o.description,
            o.productOrService,
            o.authorizationUrl,
            o.modifierExtension,
            o.authorizationRequired,
            o.authorizationSupporting,
            o.benefit))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val name: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("name", lTagOf[Option[String]], false, lTagOf[String])
      val unit: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("unit", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val term: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("term", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val network: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("network", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val category: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("category", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val modifier: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
        FHIRComponentFieldMeta("modifier", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
      val provider: FHIRComponentFieldMeta[Option[Reference]] =
        FHIRComponentFieldMeta("provider", lTagOf[Option[Reference]], false, lTagOf[Reference])
      val excluded: FHIRComponentFieldMeta[Option[Boolean]] =
        FHIRComponentFieldMeta("excluded", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val description: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
      val productOrService: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("productOrService", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val authorizationUrl: FHIRComponentFieldMeta[Option[UriStr]] =
        FHIRComponentFieldMeta("authorizationUrl", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val authorizationRequired: FHIRComponentFieldMeta[Option[Boolean]] =
        FHIRComponentFieldMeta("authorizationRequired", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
      val authorizationSupporting: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
        FHIRComponentFieldMeta("authorizationSupporting", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
      val benefit: FHIRComponentFieldMeta[LitSeq[Item.Benefit]] =
        FHIRComponentFieldMeta("benefit", lTagOf[LitSeq[Item.Benefit]], false, lTagOf[Item.Benefit])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
        id,
        name,
        unit,
        term,
        network,
        category,
        modifier,
        provider,
        excluded,
        extension,
        description,
        productOrService,
        authorizationUrl,
        modifierExtension,
        authorizationRequired,
        authorizationSupporting,
        benefit
      )
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Item): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[String]](name, t.name),
        FHIRComponentField[Option[CodeableConcept]](unit, t.unit),
        FHIRComponentField[Option[CodeableConcept]](term, t.term),
        FHIRComponentField[Option[CodeableConcept]](network, t.network),
        FHIRComponentField[Option[CodeableConcept]](category, t.category),
        FHIRComponentField[LitSeq[CodeableConcept]](modifier, t.modifier),
        FHIRComponentField[Option[Reference]](provider, t.provider),
        FHIRComponentField[Option[Boolean]](excluded, t.excluded),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[String]](description, t.description),
        FHIRComponentField[Option[CodeableConcept]](productOrService, t.productOrService),
        FHIRComponentField[Option[UriStr]](authorizationUrl, t.authorizationUrl),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
        FHIRComponentField[Option[Boolean]](authorizationRequired, t.authorizationRequired),
        FHIRComponentField[LitSeq[CodeableConcept]](authorizationSupporting, t.authorizationSupporting),
        FHIRComponentField[LitSeq[Item.Benefit]](benefit, t.benefit)
      )
      val baseType: CompanionFor[Item] = this
      val thisName: String             = "Item"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Item] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Item(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[String]]("name", Some(None)),
              cursor.decodeAs[Option[CodeableConcept]]("unit", Some(None)),
              cursor.decodeAs[Option[CodeableConcept]]("term", Some(None)),
              cursor.decodeAs[Option[CodeableConcept]]("network", Some(None)),
              cursor.decodeAs[Option[CodeableConcept]]("category", Some(None)),
              cursor.decodeAs[LitSeq[CodeableConcept]]("modifier", Some(LitSeq.empty)),
              cursor.decodeAs[Option[Reference]]("provider", Some(None)),
              cursor.decodeAs[Option[Boolean]]("excluded", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[String]]("description", Some(None)),
              cursor.decodeAs[Option[CodeableConcept]]("productOrService", Some(None)),
              cursor.decodeAs[Option[UriStr]]("authorizationUrl", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[Boolean]]("authorizationRequired", Some(None)),
              cursor.decodeAs[LitSeq[CodeableConcept]]("authorizationSupporting", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Item.Benefit]]("benefit", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Item(
        override val id: Option[String] = None,
        val name: Option[String] = None,
        val unit: Option[CodeableConcept] = None,
        val term: Option[CodeableConcept] = None,
        val network: Option[CodeableConcept] = None,
        val category: Option[CodeableConcept] = None,
        val modifier: LitSeq[CodeableConcept] = LitSeq.empty,
        val provider: Option[Reference] = None,
        val excluded: Option[Boolean] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val description: Option[String] = None,
        val productOrService: Option[CodeableConcept] = None,
        val authorizationUrl: Option[UriStr] = None,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        val authorizationRequired: Option[Boolean] = None,
        val authorizationSupporting: LitSeq[CodeableConcept] = LitSeq.empty,
        val benefit: LitSeq[Item.Benefit] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        inforce: Option[Boolean] = None,
        coverage: Reference,
        extension: LitSeq[Extension] = LitSeq.empty,
        benefitPeriod: Option[Period] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        item: LitSeq[Insurance.Item] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Insurance = new Insurance(
      id,
      inforce,
      coverage,
      extension,
      benefitPeriod,
      modifierExtension,
      item,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Insurance): Option[(Option[String], Option[Boolean], Reference, LitSeq[Extension], Option[Period], LitSeq[Extension], LitSeq[Insurance.Item])] =
      Some((o.id, o.inforce, o.coverage, o.extension, o.benefitPeriod, o.modifierExtension, o.item))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val inforce: FHIRComponentFieldMeta[Option[Boolean]] =
      FHIRComponentFieldMeta("inforce", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
    val coverage: FHIRComponentFieldMeta[Reference] =
      FHIRComponentFieldMeta("coverage", lTagOf[Reference], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val benefitPeriod: FHIRComponentFieldMeta[Option[Period]] =
      FHIRComponentFieldMeta("benefitPeriod", lTagOf[Option[Period]], false, lTagOf[Period])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val item: FHIRComponentFieldMeta[LitSeq[Insurance.Item]] =
      FHIRComponentFieldMeta("item", lTagOf[LitSeq[Insurance.Item]], false, lTagOf[Insurance.Item])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, inforce, coverage, extension, benefitPeriod, modifierExtension, item)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Insurance): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Boolean]](inforce, t.inforce),
      FHIRComponentField[Reference](coverage, t.coverage),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Period]](benefitPeriod, t.benefitPeriod),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[Insurance.Item]](item, t.item)
    )
    val baseType: CompanionFor[Insurance] = this
    val thisName: String                  = "Insurance"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Insurance] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Insurance(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[Boolean]]("inforce", Some(None)),
            cursor.decodeAs[Reference]("coverage", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Period]]("benefitPeriod", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Insurance.Item]]("item", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Insurance(
      override val id: Option[String] = None,
      val inforce: Option[Boolean] = None,
      val coverage: Reference,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val benefitPeriod: Option[Period] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val item: LitSeq[Insurance.Item] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Error extends CompanionFor[Error] {
    implicit def summonObjectAndCompanionError_37568628(o: Error): ObjectAndCompanion[Error, Error.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Error
    override type ParentType   = Error
    override val parentType: CompanionFor[ResourceType] = Error
    def apply(
        id: Option[String] = None,
        code: CodeableConcept,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Error = new Error(
      id,
      code,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(o: Error): Option[(Option[String], CodeableConcept, LitSeq[Extension], LitSeq[Extension])] = Some(
      (o.id, o.code, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val code: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("code", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, code, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Error): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[CodeableConcept](code, t.code),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Error] = this
    val thisName: String              = "Error"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Error] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Error(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[CodeableConcept]("code", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Error(
      override val id: Option[String] = None,
      val code: CodeableConcept,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  type ServicedChoice = Choice[UnionDateOrPeriod]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      form: Option[CodeableConcept] = None,
      status: FM_STATUS,
      purpose: NonEmptyLitSeq[ELIGIBILITYRESPONSE_PURPOSE],
      patient: Reference,
      created: FHIRDateTime,
      request: Reference,
      outcome: REMITTANCE_OUTCOME,
      insurer: Reference,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      requestor: Option[Reference] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      preAuthRef: Option[String] = None,
      serviced: Option[CoverageEligibilityResponse.ServicedChoice] = None,
      disposition: Option[String] = None,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      error: LitSeq[CoverageEligibilityResponse.Error] = LitSeq.empty,
      insurance: LitSeq[CoverageEligibilityResponse.Insurance] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): CoverageEligibilityResponse = new CoverageEligibilityResponse(
    id,
    meta,
    text,
    form,
    status,
    purpose,
    patient,
    created,
    request,
    outcome,
    insurer,
    language,
    contained,
    extension,
    requestor,
    identifier,
    preAuthRef,
    serviced,
    disposition,
    implicitRules,
    modifierExtension,
    error,
    insurance,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val form: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("form", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val status: FHIRComponentFieldMeta[FM_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[FM_STATUS], false, lTagOf[FM_STATUS])
  val purpose: FHIRComponentFieldMeta[NonEmptyLitSeq[ELIGIBILITYRESPONSE_PURPOSE]] =
    FHIRComponentFieldMeta(
      "purpose",
      lTagOf[NonEmptyLitSeq[ELIGIBILITYRESPONSE_PURPOSE]],
      false,
      lTagOf[ELIGIBILITYRESPONSE_PURPOSE])
  val patient: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("patient", lTagOf[Reference], false, lTagOf[Reference])
  val created: FHIRComponentFieldMeta[FHIRDateTime] =
    FHIRComponentFieldMeta("created", lTagOf[FHIRDateTime], false, lTagOf[FHIRDateTime])
  val request: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("request", lTagOf[Reference], false, lTagOf[Reference])
  val outcome: FHIRComponentFieldMeta[REMITTANCE_OUTCOME] =
    FHIRComponentFieldMeta("outcome", lTagOf[REMITTANCE_OUTCOME], false, lTagOf[REMITTANCE_OUTCOME])
  val insurer: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("insurer", lTagOf[Reference], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val requestor: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("requestor", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val preAuthRef: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("preAuthRef", lTagOf[Option[String]], false, lTagOf[String])
  val serviced: FHIRComponentFieldMeta[Option[CoverageEligibilityResponse.ServicedChoice]] =
    FHIRComponentFieldMeta(
      "serviced",
      lTagOf[Option[CoverageEligibilityResponse.ServicedChoice]],
      true,
      lTagOf[UnionDateOrPeriod])
  val disposition: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("disposition", lTagOf[Option[String]], false, lTagOf[String])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val error: FHIRComponentFieldMeta[LitSeq[CoverageEligibilityResponse.Error]] =
    FHIRComponentFieldMeta(
      "error",
      lTagOf[LitSeq[CoverageEligibilityResponse.Error]],
      false,
      lTagOf[CoverageEligibilityResponse.Error])
  val insurance: FHIRComponentFieldMeta[LitSeq[CoverageEligibilityResponse.Insurance]] =
    FHIRComponentFieldMeta(
      "insurance",
      lTagOf[LitSeq[CoverageEligibilityResponse.Insurance]],
      false,
      lTagOf[CoverageEligibilityResponse.Insurance])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    form,
    status,
    purpose,
    patient,
    created,
    request,
    outcome,
    insurer,
    language,
    contained,
    extension,
    requestor,
    identifier,
    preAuthRef,
    serviced,
    disposition,
    implicitRules,
    modifierExtension,
    error,
    insurance
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: CoverageEligibilityResponse): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[CodeableConcept]](form, t.form),
    FHIRComponentField[FM_STATUS](status, t.status),
    FHIRComponentField[NonEmptyLitSeq[ELIGIBILITYRESPONSE_PURPOSE]](purpose, t.purpose),
    FHIRComponentField[Reference](patient, t.patient),
    FHIRComponentField[FHIRDateTime](created, t.created),
    FHIRComponentField[Reference](request, t.request),
    FHIRComponentField[REMITTANCE_OUTCOME](outcome, t.outcome),
    FHIRComponentField[Reference](insurer, t.insurer),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Reference]](requestor, t.requestor),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[String]](preAuthRef, t.preAuthRef),
    FHIRComponentField[Option[CoverageEligibilityResponse.ServicedChoice]](serviced, t.serviced),
    FHIRComponentField[Option[String]](disposition, t.disposition),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[CoverageEligibilityResponse.Error]](error, t.error),
    FHIRComponentField[LitSeq[CoverageEligibilityResponse.Insurance]](insurance, t.insurance)
  )
  def extractId(t: CoverageEligibilityResponse): Option[String]                                           = t.id
  def extractMeta(t: CoverageEligibilityResponse): Option[Meta]                                           = t.meta
  def extractText(t: CoverageEligibilityResponse): Option[Narrative]                                      = t.text
  def extractForm(t: CoverageEligibilityResponse): Option[CodeableConcept]                                = t.form
  def extractStatus(t: CoverageEligibilityResponse): FM_STATUS                                            = t.status
  def extractPurpose(t: CoverageEligibilityResponse): NonEmptyLitSeq[ELIGIBILITYRESPONSE_PURPOSE]         = t.purpose
  def extractPatient(t: CoverageEligibilityResponse): Reference                                           = t.patient
  def extractCreated(t: CoverageEligibilityResponse): FHIRDateTime                                        = t.created
  def extractRequest(t: CoverageEligibilityResponse): Reference                                           = t.request
  def extractOutcome(t: CoverageEligibilityResponse): REMITTANCE_OUTCOME                                  = t.outcome
  def extractInsurer(t: CoverageEligibilityResponse): Reference                                           = t.insurer
  def extractLanguage(t: CoverageEligibilityResponse): Option[LANGUAGES]                                  = t.language
  def extractContained(t: CoverageEligibilityResponse): LitSeq[Resource]                                  = t.contained
  def extractExtension(t: CoverageEligibilityResponse): LitSeq[Extension]                                 = t.extension
  def extractRequestor(t: CoverageEligibilityResponse): Option[Reference]                                 = t.requestor
  def extractIdentifier(t: CoverageEligibilityResponse): LitSeq[Identifier]                               = t.identifier
  def extractPreAuthRef(t: CoverageEligibilityResponse): Option[String]                                   = t.preAuthRef
  def extractServiced(t: CoverageEligibilityResponse): Option[CoverageEligibilityResponse.ServicedChoice] = t.serviced
  def extractDisposition(t: CoverageEligibilityResponse): Option[String]                                  = t.disposition
  def extractImplicitRules(t: CoverageEligibilityResponse): Option[UriStr]                                = t.implicitRules
  def extractModifierExtension(t: CoverageEligibilityResponse): LitSeq[Extension]                         = t.modifierExtension
  def extractError(t: CoverageEligibilityResponse): LitSeq[CoverageEligibilityResponse.Error]             = t.error
  def extractInsurance(t: CoverageEligibilityResponse): LitSeq[CoverageEligibilityResponse.Insurance]     = t.insurance
  override val thisName: String = "CoverageEligibilityResponse"
  override val searchParams: Map[String, CoverageEligibilityResponse => Seq[Any]] = Map(
    "requestor"   -> (obj => obj.requestor.toSeq),
    "request"     -> (obj => Seq(obj.request)),
    "identifier"  -> (obj => obj.identifier.toSeq),
    "disposition" -> (obj => obj.disposition.toSeq),
    "outcome"     -> (obj => Seq(obj.outcome)),
    "status"      -> (obj => Seq(obj.status)),
    "insurer"     -> (obj => Seq(obj.insurer)),
    "created"     -> (obj => Seq(obj.created)),
    "patient"     -> (obj => Seq(obj.patient))
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[CoverageEligibilityResponse] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new CoverageEligibilityResponse(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("form", Some(None)),
          cursor.decodeAs[FM_STATUS]("status", None),
          cursor.decodeAs[NonEmptyLitSeq[ELIGIBILITYRESPONSE_PURPOSE]]("purpose", None),
          cursor.decodeAs[Reference]("patient", None),
          cursor.decodeAs[FHIRDateTime]("created", None),
          cursor.decodeAs[Reference]("request", None),
          cursor.decodeAs[REMITTANCE_OUTCOME]("outcome", None),
          cursor.decodeAs[Reference]("insurer", None),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("requestor", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("preAuthRef", Some(None)),
          cursor.decodeOptRef[UnionDateOrPeriod]("serviced"),
          cursor.decodeAs[Option[String]]("disposition", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CoverageEligibilityResponse.Error]]("error", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CoverageEligibilityResponse.Insurance]]("insurance", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** This resource provides eligibility and plan details from the processing of an CoverageEligibilityRequest resource.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields form, status, purpose, patient, created, request, outcome, insurer, requestor, identifier, preAuthRef,
  *   serviced, disposition, error, insurance.
  * @param id
  *   \- The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta
  *   \- The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *   not always be associated with version changes to the resource.
  * @param text
  *   \- A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *   resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to
  *   make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be
  *   represented in the narrative to ensure clinical safety.
  * @param form
  *   \- A code for the form to be used for printing the content.
  * @param status
  *   \- The status of the resource instance.
  * @param purpose
  *   \- Code to specify whether requesting: prior authorization requirements for some service categories or billing codes;
  *   benefits for coverages specified or discovered; discovery and return of coverages for the patient; and/or validation that
  *   the specified coverage is in-force at the date/period specified or 'now' if not specified.
  * @param patient
  *   \- The party who is the beneficiary of the supplied coverage and for whom eligibility is sought.
  * @param created
  *   \- The date this resource was created.
  * @param request
  *   \- Reference to the original request resource.
  * @param outcome
  *   \- The outcome of the request processing.
  * @param insurer
  *   \- The Insurer who issued the coverage in question and is the author of the response.
  * @param language
  *   \- The base language in which the resource is written.
  * @param contained
  *   \- These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   \- May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param requestor
  *   \- The provider which is responsible for the request.
  * @param identifier
  *   \- A unique identifier assigned to this coverage eligiblity request.
  * @param preAuthRef
  *   \- A reference from the Insurer to which these services pertain to be used on further communication and as proof that the
  *   request occurred.
  * @param serviced
  *   \- The date or dates when the enclosed suite of services were performed or completed.
  * @param disposition
  *   \- A human readable description of the status of the adjudication.
  * @param implicitRules
  *   \- A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param modifierExtension
  *   \- May be used to represent additional information that is not part of the basic definition of the resource and that
  *   modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *   Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *   strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *   extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *   processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any
  *   elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param error
  *   \- Errors encountered during the processing of the request.
  * @param insurance
  *   \- Financial instruments for reimbursement for the health care products and services.
  */
@POJOBoilerplate
class CoverageEligibilityResponse(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val form: Option[CodeableConcept] = None,
    val status: FM_STATUS,
    val purpose: NonEmptyLitSeq[ELIGIBILITYRESPONSE_PURPOSE],
    val patient: Reference,
    val created: FHIRDateTime,
    val request: Reference,
    val outcome: REMITTANCE_OUTCOME,
    val insurer: Reference,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val requestor: Option[Reference] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val preAuthRef: Option[String] = None,
    val serviced: Option[CoverageEligibilityResponse.ServicedChoice] = None,
    val disposition: Option[String] = None,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val error: LitSeq[CoverageEligibilityResponse.Error] = LitSeq.empty,
    val insurance: LitSeq[CoverageEligibilityResponse.Insurance] = LitSeq.empty,
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
  override val thisTypeName: String = "CoverageEligibilityResponse"
}
