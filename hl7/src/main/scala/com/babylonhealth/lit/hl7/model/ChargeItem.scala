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
import com.babylonhealth.lit.hl7.CHARGEITEM_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object ChargeItem extends CompanionFor[ChargeItem] {
  implicit def summonObjectAndCompanionChargeItem2073455004(o: ChargeItem): ObjectAndCompanion[ChargeItem, ChargeItem.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = ChargeItem
  override type ParentType   = ChargeItem
  override val baseType: CompanionFor[ResourceType] = ChargeItem
  override val parentType: CompanionFor[ParentType] = ChargeItem
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/ChargeItem")
  object Performer extends CompanionFor[Performer] {
    implicit def summonObjectAndCompanionPerformer_1767446514(o: Performer): ObjectAndCompanion[Performer, Performer.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Performer
    override type ParentType   = Performer
    override val parentType: CompanionFor[ResourceType] = Performer
    def apply(
        id: Option[String] = None,
        actor: Reference,
        function: Option[CodeableConcept] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Performer = new Performer(
      id,
      actor,
      function,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Performer): Option[(Option[String], Reference, Option[CodeableConcept], LitSeq[Extension], LitSeq[Extension])] = Some(
      (o.id, o.actor, o.function, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val actor: FHIRComponentFieldMeta[Reference] =
      FHIRComponentFieldMeta("actor", lTagOf[Reference], false, lTagOf[Reference])
    val function: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("function", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, actor, function, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Performer): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Reference](actor, t.actor),
      FHIRComponentField[Option[CodeableConcept]](function, t.function),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Performer] = this
    val thisName: String                  = "Performer"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Performer] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Performer(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Reference]("actor", None),
            cursor.decodeAs[Option[CodeableConcept]]("function", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Performer(
      override val id: Option[String] = None,
      val actor: Reference,
      val function: Option[CodeableConcept] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  type ProductChoice    = Choice[UnionCodeableConceptOrReference]
  type OccurrenceChoice = Choice[UnionDateTimeOrPeriodOrTiming]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      code: CodeableConcept,
      note: LitSeq[Annotation] = LitSeq.empty,
      status: CHARGEITEM_STATUS,
      partOf: LitSeq[Reference] = LitSeq.empty,
      reason: LitSeq[CodeableConcept] = LitSeq.empty,
      subject: Reference,
      context: Option[Reference] = None,
      enterer: Option[Reference] = None,
      service: LitSeq[Reference] = LitSeq.empty,
      account: LitSeq[Reference] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      quantity: Option[Quantity] = None,
      bodysite: LitSeq[CodeableConcept] = LitSeq.empty,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      costCenter: Option[Reference] = None,
      product: Option[ChargeItem.ProductChoice] = None,
      enteredDate: Option[FHIRDateTime] = None,
      implicitRules: Option[UriStr] = None,
      definitionUri: LitSeq[UriStr] = LitSeq.empty,
      occurrence: Option[ChargeItem.OccurrenceChoice] = None,
      priceOverride: Option[Money] = None,
      factorOverride: Option[BigDecimal] = None,
      overrideReason: Option[String] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      definitionCanonical: LitSeq[Canonical] = LitSeq.empty,
      supportingInformation: LitSeq[Reference] = LitSeq.empty,
      performingOrganization: Option[Reference] = None,
      requestingOrganization: Option[Reference] = None,
      performer: LitSeq[ChargeItem.Performer] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): ChargeItem = new ChargeItem(
    id,
    meta,
    text,
    code,
    note,
    status,
    partOf,
    reason,
    subject,
    context,
    enterer,
    service,
    account,
    language,
    quantity,
    bodysite,
    contained,
    extension,
    identifier,
    costCenter,
    product,
    enteredDate,
    implicitRules,
    definitionUri,
    occurrence,
    priceOverride,
    factorOverride,
    overrideReason,
    modifierExtension,
    definitionCanonical,
    supportingInformation,
    performingOrganization,
    requestingOrganization,
    performer,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val code: FHIRComponentFieldMeta[CodeableConcept] =
    FHIRComponentFieldMeta("code", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val status: FHIRComponentFieldMeta[CHARGEITEM_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[CHARGEITEM_STATUS], false, lTagOf[CHARGEITEM_STATUS])
  val partOf: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("partOf", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val reason: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("reason", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val subject: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("subject", lTagOf[Reference], false, lTagOf[Reference])
  val context: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("context", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val enterer: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("enterer", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val service: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("service", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val account: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("account", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val quantity: FHIRComponentFieldMeta[Option[Quantity]] =
    FHIRComponentFieldMeta("quantity", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
  val bodysite: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("bodysite", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val costCenter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("costCenter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val product: FHIRComponentFieldMeta[Option[ChargeItem.ProductChoice]] =
    FHIRComponentFieldMeta("product", lTagOf[Option[ChargeItem.ProductChoice]], true, lTagOf[UnionCodeableConceptOrReference])
  val enteredDate: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("enteredDate", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val definitionUri: FHIRComponentFieldMeta[LitSeq[UriStr]] =
    FHIRComponentFieldMeta("definitionUri", lTagOf[LitSeq[UriStr]], false, lTagOf[UriStr])
  val occurrence: FHIRComponentFieldMeta[Option[ChargeItem.OccurrenceChoice]] =
    FHIRComponentFieldMeta("occurrence", lTagOf[Option[ChargeItem.OccurrenceChoice]], true, lTagOf[UnionDateTimeOrPeriodOrTiming])
  val priceOverride: FHIRComponentFieldMeta[Option[Money]] =
    FHIRComponentFieldMeta("priceOverride", lTagOf[Option[Money]], false, lTagOf[Money])
  val factorOverride: FHIRComponentFieldMeta[Option[BigDecimal]] =
    FHIRComponentFieldMeta("factorOverride", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
  val overrideReason: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("overrideReason", lTagOf[Option[String]], false, lTagOf[String])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val definitionCanonical: FHIRComponentFieldMeta[LitSeq[Canonical]] =
    FHIRComponentFieldMeta("definitionCanonical", lTagOf[LitSeq[Canonical]], false, lTagOf[Canonical])
  val supportingInformation: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("supportingInformation", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val performingOrganization: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("performingOrganization", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val requestingOrganization: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("requestingOrganization", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val performer: FHIRComponentFieldMeta[LitSeq[ChargeItem.Performer]] =
    FHIRComponentFieldMeta("performer", lTagOf[LitSeq[ChargeItem.Performer]], false, lTagOf[ChargeItem.Performer])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    code,
    note,
    status,
    partOf,
    reason,
    subject,
    context,
    enterer,
    service,
    account,
    language,
    quantity,
    bodysite,
    contained,
    extension,
    identifier,
    costCenter,
    product,
    enteredDate,
    implicitRules,
    definitionUri,
    occurrence,
    priceOverride,
    factorOverride,
    overrideReason,
    modifierExtension,
    definitionCanonical,
    supportingInformation,
    performingOrganization,
    requestingOrganization,
    performer
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: ChargeItem): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[CodeableConcept](code, t.code),
    FHIRComponentField[LitSeq[Annotation]](note, t.note),
    FHIRComponentField[CHARGEITEM_STATUS](status, t.status),
    FHIRComponentField[LitSeq[Reference]](partOf, t.partOf),
    FHIRComponentField[LitSeq[CodeableConcept]](reason, t.reason),
    FHIRComponentField[Reference](subject, t.subject),
    FHIRComponentField[Option[Reference]](context, t.context),
    FHIRComponentField[Option[Reference]](enterer, t.enterer),
    FHIRComponentField[LitSeq[Reference]](service, t.service),
    FHIRComponentField[LitSeq[Reference]](account, t.account),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Option[Quantity]](quantity, t.quantity),
    FHIRComponentField[LitSeq[CodeableConcept]](bodysite, t.bodysite),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[Reference]](costCenter, t.costCenter),
    FHIRComponentField[Option[ChargeItem.ProductChoice]](product, t.product),
    FHIRComponentField[Option[FHIRDateTime]](enteredDate, t.enteredDate),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[UriStr]](definitionUri, t.definitionUri),
    FHIRComponentField[Option[ChargeItem.OccurrenceChoice]](occurrence, t.occurrence),
    FHIRComponentField[Option[Money]](priceOverride, t.priceOverride),
    FHIRComponentField[Option[BigDecimal]](factorOverride, t.factorOverride),
    FHIRComponentField[Option[String]](overrideReason, t.overrideReason),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[Canonical]](definitionCanonical, t.definitionCanonical),
    FHIRComponentField[LitSeq[Reference]](supportingInformation, t.supportingInformation),
    FHIRComponentField[Option[Reference]](performingOrganization, t.performingOrganization),
    FHIRComponentField[Option[Reference]](requestingOrganization, t.requestingOrganization),
    FHIRComponentField[LitSeq[ChargeItem.Performer]](performer, t.performer)
  )
  def extractId(t: ChargeItem): Option[String]                              = t.id
  def extractMeta(t: ChargeItem): Option[Meta]                              = t.meta
  def extractText(t: ChargeItem): Option[Narrative]                         = t.text
  def extractCode(t: ChargeItem): CodeableConcept                           = t.code
  def extractNote(t: ChargeItem): LitSeq[Annotation]                        = t.note
  def extractStatus(t: ChargeItem): CHARGEITEM_STATUS                       = t.status
  def extractPartOf(t: ChargeItem): LitSeq[Reference]                       = t.partOf
  def extractReason(t: ChargeItem): LitSeq[CodeableConcept]                 = t.reason
  def extractSubject(t: ChargeItem): Reference                              = t.subject
  def extractContext(t: ChargeItem): Option[Reference]                      = t.context
  def extractEnterer(t: ChargeItem): Option[Reference]                      = t.enterer
  def extractService(t: ChargeItem): LitSeq[Reference]                      = t.service
  def extractAccount(t: ChargeItem): LitSeq[Reference]                      = t.account
  def extractLanguage(t: ChargeItem): Option[LANGUAGES]                     = t.language
  def extractQuantity(t: ChargeItem): Option[Quantity]                      = t.quantity
  def extractBodysite(t: ChargeItem): LitSeq[CodeableConcept]               = t.bodysite
  def extractContained(t: ChargeItem): LitSeq[Resource]                     = t.contained
  def extractExtension(t: ChargeItem): LitSeq[Extension]                    = t.extension
  def extractIdentifier(t: ChargeItem): LitSeq[Identifier]                  = t.identifier
  def extractCostCenter(t: ChargeItem): Option[Reference]                   = t.costCenter
  def extractProduct(t: ChargeItem): Option[ChargeItem.ProductChoice]       = t.product
  def extractEnteredDate(t: ChargeItem): Option[FHIRDateTime]               = t.enteredDate
  def extractImplicitRules(t: ChargeItem): Option[UriStr]                   = t.implicitRules
  def extractDefinitionUri(t: ChargeItem): LitSeq[UriStr]                   = t.definitionUri
  def extractOccurrence(t: ChargeItem): Option[ChargeItem.OccurrenceChoice] = t.occurrence
  def extractPriceOverride(t: ChargeItem): Option[Money]                    = t.priceOverride
  def extractFactorOverride(t: ChargeItem): Option[BigDecimal]              = t.factorOverride
  def extractOverrideReason(t: ChargeItem): Option[String]                  = t.overrideReason
  def extractModifierExtension(t: ChargeItem): LitSeq[Extension]            = t.modifierExtension
  def extractDefinitionCanonical(t: ChargeItem): LitSeq[Canonical]          = t.definitionCanonical
  def extractSupportingInformation(t: ChargeItem): LitSeq[Reference]        = t.supportingInformation
  def extractPerformingOrganization(t: ChargeItem): Option[Reference]       = t.performingOrganization
  def extractRequestingOrganization(t: ChargeItem): Option[Reference]       = t.requestingOrganization
  def extractPerformer(t: ChargeItem): LitSeq[ChargeItem.Performer]         = t.performer
  override val thisName: String                                             = "ChargeItem"
  override val searchParams: Map[String, ChargeItem => Seq[Any]] = Map(
    "subject"                 -> (obj => Seq(obj.subject)),
    "identifier"              -> (obj => obj.identifier.toSeq),
    "entered-date"            -> (obj => obj.enteredDate.toSeq),
    "factor-override"         -> (obj => obj.factorOverride.toSeq),
    "context"                 -> (obj => obj.context.toSeq),
    "service"                 -> (obj => obj.service.toSeq),
    "performer-function"      -> (obj => obj.performer.flatMap(_.function).toSeq),
    "price-override"          -> (obj => obj.priceOverride.toSeq),
    "account"                 -> (obj => obj.account.toSeq),
    "enterer"                 -> (obj => obj.enterer.toSeq),
    "patient"                 -> (obj => obj.subject.seqIf(_.reference.exists(_.contains("Patient/"))).toSeq),
    "quantity"                -> (obj => obj.quantity.toSeq),
    "performing-organization" -> (obj => obj.performingOrganization.toSeq),
    "performer-actor"         -> (obj => obj.performer.map(_.actor).toSeq),
    "requesting-organization" -> (obj => obj.requestingOrganization.toSeq),
    "occurrence"              -> (obj => obj.occurrence.toSeq),
    "code"                    -> (obj => Seq(obj.code))
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ChargeItem] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new ChargeItem(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[CodeableConcept]("code", None),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[CHARGEITEM_STATUS]("status", None),
          cursor.decodeAs[LitSeq[Reference]]("partOf", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("reason", Some(LitSeq.empty)),
          cursor.decodeAs[Reference]("subject", None),
          cursor.decodeAs[Option[Reference]]("context", Some(None)),
          cursor.decodeAs[Option[Reference]]("enterer", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("service", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("account", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[Quantity]]("quantity", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("bodysite", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("costCenter", Some(None)),
          cursor.decodeOptRef[UnionCodeableConceptOrReference]("product"),
          cursor.decodeAs[Option[FHIRDateTime]]("enteredDate", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[UriStr]]("definitionUri", Some(LitSeq.empty)),
          cursor.decodeOptRef[UnionDateTimeOrPeriodOrTiming]("occurrence"),
          cursor.decodeAs[Option[Money]]("priceOverride", Some(None)),
          cursor.decodeAs[Option[BigDecimal]]("factorOverride", Some(None)),
          cursor.decodeAs[Option[String]]("overrideReason", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Canonical]]("definitionCanonical", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("supportingInformation", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("performingOrganization", Some(None)),
          cursor.decodeAs[Option[Reference]]("requestingOrganization", Some(None)),
          cursor.decodeAs[LitSeq[ChargeItem.Performer]]("performer", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** The resource ChargeItem describes the provision of healthcare provider products for a certain patient, therefore referring not
  * only to the product, but containing in addition details of the provision, like date, time, amounts and participating
  * organizations and persons. Main Usage of the ChargeItem is to enable the billing process and internal cost allocation.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields code, note, status, partOf, reason, subject, context, enterer, service, account, quantity, bodysite,
  *   identifier, costCenter, product, enteredDate, definitionUri, occurrence, priceOverride, factorOverride, overrideReason,
  *   definitionCanonical, supportingInformation, performingOrganization, requestingOrganization, performer.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *     not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *     resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail
  *     to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should
  *     be represented in the narrative to ensure clinical safety.
  * @param code
  *   - A code that identifies the charge, like a billing code.
  * @param note
  *   - Comments made about the event by the performer, subject or other participants.
  * @param status
  *   - The current state of the ChargeItem.
  * @param partOf
  *   - ChargeItems can be grouped to larger ChargeItems covering the whole set.
  * @param reason
  *   - Describes why the event occurred in coded or textual form.
  * @param subject
  *   - The individual or set of individuals the action is being or was performed on.
  * @param context
  *   - The encounter or episode of care that establishes the context for this event.
  * @param enterer
  *   - The device, practitioner, etc. who entered the charge item.
  * @param service
  *   - Indicated the rendered service that caused this charge.
  * @param account
  *   - Account into which this ChargeItems belongs.
  * @param language
  *   - The base language in which the resource is written.
  * @param quantity
  *   - Quantity of which the charge item has been serviced.
  * @param bodysite
  *   - The anatomical location where the related service has been applied.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *     identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *     of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *     Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *     of the extension.
  * @param identifier
  *   - Identifiers assigned to this event performer or other systems.
  * @param costCenter
  *   - The financial cost center permits the tracking of charge attribution.
  * @param product
  *   - Identifies the device, food, drug or other product being charged either by type code or reference to an instance.
  * @param enteredDate
  *   - Date the charge item was entered.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *     processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *     other profiles etc.
  * @param definitionUri
  *   - References the (external) source of pricing information, rules of application for the code this ChargeItem uses.
  * @param occurrence
  *   - Date/time(s) or duration when the charged service was applied.
  * @param priceOverride
  *   - Total price of the charge overriding the list price associated with the code.
  * @param factorOverride
  *   - Factor overriding the factor determined by the rules associated with the code.
  * @param overrideReason
  *   - If the list price or the rule-based factor associated with the code is overridden, this attribute can capture a text to
  *     indicate the reason for this action.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *     the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *     Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *     strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *     extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *     processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of
  *     any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param definitionCanonical
  *   - References the source of pricing information, rules of application for the code this ChargeItem uses.
  * @param supportingInformation
  *   - Further information supporting this charge.
  * @param performingOrganization
  *   - The organization requesting the service.
  * @param requestingOrganization
  *   - The organization performing the service.
  * @param performer
  *   - Indicates who or what performed or participated in the charged service.
  */
@POJOBoilerplate
class ChargeItem(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val code: CodeableConcept,
    val note: LitSeq[Annotation] = LitSeq.empty,
    val status: CHARGEITEM_STATUS,
    val partOf: LitSeq[Reference] = LitSeq.empty,
    val reason: LitSeq[CodeableConcept] = LitSeq.empty,
    val subject: Reference,
    val context: Option[Reference] = None,
    val enterer: Option[Reference] = None,
    val service: LitSeq[Reference] = LitSeq.empty,
    val account: LitSeq[Reference] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    val quantity: Option[Quantity] = None,
    val bodysite: LitSeq[CodeableConcept] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val costCenter: Option[Reference] = None,
    val product: Option[ChargeItem.ProductChoice] = None,
    val enteredDate: Option[FHIRDateTime] = None,
    override val implicitRules: Option[UriStr] = None,
    val definitionUri: LitSeq[UriStr] = LitSeq.empty,
    val occurrence: Option[ChargeItem.OccurrenceChoice] = None,
    val priceOverride: Option[Money] = None,
    val factorOverride: Option[BigDecimal] = None,
    val overrideReason: Option[String] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val definitionCanonical: LitSeq[Canonical] = LitSeq.empty,
    val supportingInformation: LitSeq[Reference] = LitSeq.empty,
    val performingOrganization: Option[Reference] = None,
    val requestingOrganization: Option[Reference] = None,
    val performer: LitSeq[ChargeItem.Performer] = LitSeq.empty,
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
  override val thisTypeName: String = "ChargeItem"
}
