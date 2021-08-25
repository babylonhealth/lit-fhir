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
import com.babylonhealth.lit.hl7.{ INVOICE_STATUS, INVOICE_PRICECOMPONENTTYPE }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Invoice extends CompanionFor[Invoice] {
  implicit def summonObjectAndCompanionInvoice1309726104(o: Invoice): ObjectAndCompanion[Invoice, Invoice.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Invoice
  override type ParentType   = Invoice
  override val baseType: CompanionFor[ResourceType] = Invoice
  override val parentType: CompanionFor[ParentType] = Invoice
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Invoice")
  object LineItem extends CompanionFor[LineItem] {
    implicit def summonObjectAndCompanionLineItem_1340230118(o: LineItem): ObjectAndCompanion[LineItem, LineItem.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = LineItem
    override type ParentType   = LineItem
    override val parentType: CompanionFor[ResourceType] = LineItem
    object PriceComponent extends CompanionFor[PriceComponent] {
      implicit def summonObjectAndCompanionPriceComponent1835838875(
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
    type ChargeItemChoice = Choice[UnionCodeableConceptOrReference]
    def apply(
        id: Option[String] = None,
        sequence: Option[PositiveInt] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        chargeItem: LineItem.ChargeItemChoice,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        priceComponent: LitSeq[LineItem.PriceComponent] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): LineItem = new LineItem(
      id,
      sequence,
      extension,
      chargeItem,
      modifierExtension,
      priceComponent,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: LineItem): Option[(Option[String], Option[PositiveInt], LitSeq[Extension], LineItem.ChargeItemChoice, LitSeq[Extension], LitSeq[LineItem.PriceComponent])] =
      Some((o.id, o.sequence, o.extension, o.chargeItem, o.modifierExtension, o.priceComponent))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val sequence: FHIRComponentFieldMeta[Option[PositiveInt]] =
      FHIRComponentFieldMeta("sequence", lTagOf[Option[PositiveInt]], false, lTagOf[PositiveInt])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val chargeItem: FHIRComponentFieldMeta[LineItem.ChargeItemChoice] =
      FHIRComponentFieldMeta("chargeItem", lTagOf[LineItem.ChargeItemChoice], true, lTagOf[UnionCodeableConceptOrReference])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val priceComponent: FHIRComponentFieldMeta[LitSeq[LineItem.PriceComponent]] =
      FHIRComponentFieldMeta("priceComponent", lTagOf[LitSeq[LineItem.PriceComponent]], false, lTagOf[LineItem.PriceComponent])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, sequence, extension, chargeItem, modifierExtension, priceComponent)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: LineItem): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[PositiveInt]](sequence, t.sequence),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LineItem.ChargeItemChoice](chargeItem, t.chargeItem),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[LineItem.PriceComponent]](priceComponent, t.priceComponent)
    )
    val baseType: CompanionFor[LineItem] = this
    val thisName: String                 = "LineItem"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[LineItem] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new LineItem(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[PositiveInt]]("sequence", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeRef[UnionCodeableConceptOrReference]("chargeItem"),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[LineItem.PriceComponent]]("priceComponent", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class LineItem(
      override val id: Option[String] = None,
      val sequence: Option[PositiveInt] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val chargeItem: LineItem.ChargeItemChoice,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val priceComponent: LitSeq[LineItem.PriceComponent] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Participant extends CompanionFor[Participant] {
    implicit def summonObjectAndCompanionParticipant_1340230118(
        o: Participant): ObjectAndCompanion[Participant, Participant.type] = ObjectAndCompanion(o, this)
    override type ResourceType = Participant
    override type ParentType   = Participant
    override val parentType: CompanionFor[ResourceType] = Participant
    def apply(
        id: Option[String] = None,
        role: Option[CodeableConcept] = None,
        actor: Reference,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Participant = new Participant(
      id,
      role,
      actor,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Participant): Option[(Option[String], Option[CodeableConcept], Reference, LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.role, o.actor, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val role: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("role", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val actor: FHIRComponentFieldMeta[Reference] =
      FHIRComponentFieldMeta("actor", lTagOf[Reference], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, role, actor, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Participant): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](role, t.role),
      FHIRComponentField[Reference](actor, t.actor),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Participant] = this
    val thisName: String                    = "Participant"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Participant] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Participant(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("role", Some(None)),
            cursor.decodeAs[Reference]("actor", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Participant(
      override val id: Option[String] = None,
      val role: Option[CodeableConcept] = None,
      val actor: Reference,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      `type`: Option[CodeableConcept] = None,
      date: Option[FHIRDateTime] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      status: INVOICE_STATUS,
      issuer: Option[Reference] = None,
      subject: Option[Reference] = None,
      account: Option[Reference] = None,
      language: Option[LANGUAGES] = None,
      totalNet: Option[Money] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      recipient: Option[Reference] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      totalGross: Option[Money] = None,
      paymentTerms: Option[Markdown] = None,
      implicitRules: Option[UriStr] = None,
      cancelledReason: Option[String] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      totalPriceComponent: LitSeq[Invoice.LineItem.PriceComponent] = LitSeq.empty,
      participant: LitSeq[Invoice.Participant] = LitSeq.empty,
      lineItem: LitSeq[Invoice.LineItem] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Invoice = new Invoice(
    id,
    meta,
    text,
    `type`,
    date,
    note,
    status,
    issuer,
    subject,
    account,
    language,
    totalNet,
    contained,
    extension,
    recipient,
    identifier,
    totalGross,
    paymentTerms,
    implicitRules,
    cancelledReason,
    modifierExtension,
    totalPriceComponent,
    participant,
    lineItem,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val date: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("date", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val status: FHIRComponentFieldMeta[INVOICE_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[INVOICE_STATUS], false, lTagOf[INVOICE_STATUS])
  val issuer: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("issuer", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val subject: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("subject", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val account: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("account", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val totalNet: FHIRComponentFieldMeta[Option[Money]] =
    FHIRComponentFieldMeta("totalNet", lTagOf[Option[Money]], false, lTagOf[Money])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val recipient: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("recipient", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val totalGross: FHIRComponentFieldMeta[Option[Money]] =
    FHIRComponentFieldMeta("totalGross", lTagOf[Option[Money]], false, lTagOf[Money])
  val paymentTerms: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("paymentTerms", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val cancelledReason: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("cancelledReason", lTagOf[Option[String]], false, lTagOf[String])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val totalPriceComponent: FHIRComponentFieldMeta[LitSeq[Invoice.LineItem.PriceComponent]] =
    FHIRComponentFieldMeta(
      "totalPriceComponent",
      lTagOf[LitSeq[Invoice.LineItem.PriceComponent]],
      false,
      lTagOf[Invoice.LineItem.PriceComponent])
  val participant: FHIRComponentFieldMeta[LitSeq[Invoice.Participant]] =
    FHIRComponentFieldMeta("participant", lTagOf[LitSeq[Invoice.Participant]], false, lTagOf[Invoice.Participant])
  val lineItem: FHIRComponentFieldMeta[LitSeq[Invoice.LineItem]] =
    FHIRComponentFieldMeta("lineItem", lTagOf[LitSeq[Invoice.LineItem]], false, lTagOf[Invoice.LineItem])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    `type`,
    date,
    note,
    status,
    issuer,
    subject,
    account,
    language,
    totalNet,
    contained,
    extension,
    recipient,
    identifier,
    totalGross,
    paymentTerms,
    implicitRules,
    cancelledReason,
    modifierExtension,
    totalPriceComponent,
    participant,
    lineItem
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Invoice): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
    FHIRComponentField[Option[FHIRDateTime]](date, t.date),
    FHIRComponentField[LitSeq[Annotation]](note, t.note),
    FHIRComponentField[INVOICE_STATUS](status, t.status),
    FHIRComponentField[Option[Reference]](issuer, t.issuer),
    FHIRComponentField[Option[Reference]](subject, t.subject),
    FHIRComponentField[Option[Reference]](account, t.account),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Option[Money]](totalNet, t.totalNet),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Reference]](recipient, t.recipient),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[Money]](totalGross, t.totalGross),
    FHIRComponentField[Option[Markdown]](paymentTerms, t.paymentTerms),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[String]](cancelledReason, t.cancelledReason),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[Invoice.LineItem.PriceComponent]](totalPriceComponent, t.totalPriceComponent),
    FHIRComponentField[LitSeq[Invoice.Participant]](participant, t.participant),
    FHIRComponentField[LitSeq[Invoice.LineItem]](lineItem, t.lineItem)
  )
  def extractId(t: Invoice): Option[String]                                           = t.id
  def extractMeta(t: Invoice): Option[Meta]                                           = t.meta
  def extractText(t: Invoice): Option[Narrative]                                      = t.text
  def extractType(t: Invoice): Option[CodeableConcept]                                = t.`type`
  def extractDate(t: Invoice): Option[FHIRDateTime]                                   = t.date
  def extractNote(t: Invoice): LitSeq[Annotation]                                     = t.note
  def extractStatus(t: Invoice): INVOICE_STATUS                                       = t.status
  def extractIssuer(t: Invoice): Option[Reference]                                    = t.issuer
  def extractSubject(t: Invoice): Option[Reference]                                   = t.subject
  def extractAccount(t: Invoice): Option[Reference]                                   = t.account
  def extractLanguage(t: Invoice): Option[LANGUAGES]                                  = t.language
  def extractTotalNet(t: Invoice): Option[Money]                                      = t.totalNet
  def extractContained(t: Invoice): LitSeq[Resource]                                  = t.contained
  def extractExtension(t: Invoice): LitSeq[Extension]                                 = t.extension
  def extractRecipient(t: Invoice): Option[Reference]                                 = t.recipient
  def extractIdentifier(t: Invoice): LitSeq[Identifier]                               = t.identifier
  def extractTotalGross(t: Invoice): Option[Money]                                    = t.totalGross
  def extractPaymentTerms(t: Invoice): Option[Markdown]                               = t.paymentTerms
  def extractImplicitRules(t: Invoice): Option[UriStr]                                = t.implicitRules
  def extractCancelledReason(t: Invoice): Option[String]                              = t.cancelledReason
  def extractModifierExtension(t: Invoice): LitSeq[Extension]                         = t.modifierExtension
  def extractTotalPriceComponent(t: Invoice): LitSeq[Invoice.LineItem.PriceComponent] = t.totalPriceComponent
  def extractParticipant(t: Invoice): LitSeq[Invoice.Participant]                     = t.participant
  def extractLineItem(t: Invoice): LitSeq[Invoice.LineItem]                           = t.lineItem
  override val thisName: String                                                       = "Invoice"
  override val searchParams: Map[String, Invoice => Seq[Any]] = Map(
    "subject"          -> (obj => obj.subject.toSeq),
    "participant-role" -> (obj => obj.participant.flatMap(_.role).toSeq),
    "issuer"           -> (obj => obj.issuer.toSeq),
    "date"             -> (obj => obj.date.toSeq),
    "status"           -> (obj => Seq(obj.status)),
    "account"          -> (obj => obj.account.toSeq),
    "patient"          -> (obj => obj.subject.filter(_.reference.exists(_.contains("Patient/"))).toSeq),
    "recipient"        -> (obj => obj.recipient.toSeq),
    "participant"      -> (obj => obj.participant.map(_.actor).toSeq),
    "totalgross"       -> (obj => obj.totalGross.toSeq),
    "identifier"       -> (obj => obj.identifier.toSeq),
    "totalnet"         -> (obj => obj.totalNet.toSeq),
    "type"             -> (obj => obj.`type`.toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Invoice] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Invoice(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("date", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[INVOICE_STATUS]("status", None),
          cursor.decodeAs[Option[Reference]]("issuer", Some(None)),
          cursor.decodeAs[Option[Reference]]("subject", Some(None)),
          cursor.decodeAs[Option[Reference]]("account", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[Money]]("totalNet", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("recipient", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Money]]("totalGross", Some(None)),
          cursor.decodeAs[Option[Markdown]]("paymentTerms", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[String]]("cancelledReason", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Invoice.LineItem.PriceComponent]]("totalPriceComponent", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Invoice.Participant]]("participant", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Invoice.LineItem]]("lineItem", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Invoice containing collected ChargeItems from an Account with calculated individual and total price for Billing purpose.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields `type`, date, note, status, issuer, subject, account, totalNet, recipient, identifier, totalGross,
  *   paymentTerms, cancelledReason, totalPriceComponent, participant, lineItem.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *   not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *   resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to
  *   make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be
  *   represented in the narrative to ensure clinical safety.
  * @param `type`
  *   - Type of Invoice depending on domain, realm an usage (e.g. internal/external, dental, preliminary).
  * @param date
  *   - Date/time(s) of when this Invoice was posted.
  * @param note
  *   - Comments made about the invoice by the issuer, subject, or other participants.
  * @param status
  *   - The current state of the Invoice.
  * @param issuer
  *   - The organizationissuing the Invoice.
  * @param subject
  *   - The individual or set of individuals receiving the goods and services billed in this invoice.
  * @param account
  *   - Account which is supposed to be balanced with this Invoice.
  * @param language
  *   - The base language in which the resource is written.
  * @param totalNet
  *   - Invoice total , taxes excluded.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param recipient
  *   - The individual or Organization responsible for balancing of this invoice.
  * @param identifier
  *   - Identifier of this Invoice, often used for reference in correspondence about this invoice or for tracking of payments.
  * @param totalGross
  *   - Invoice total, tax included.
  * @param paymentTerms
  *   - Payment details such as banking details, period of payment, deductibles, methods of payment.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param cancelledReason
  *   - In case of Invoice cancellation a reason must be given (entered in error, superseded by corrected invoice etc.).
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *   the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually
  *   modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict
  *   set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param totalPriceComponent
  *   - The total amount for the Invoice may be calculated as the sum of the line items with surcharges/deductions that apply in
  *   certain conditions. The priceComponent element can be used to offer transparency to the recipient of the Invoice of how the
  *   total price was calculated.
  * @param participant
  *   - Indicates who or what performed or participated in the charged service.
  * @param lineItem
  *   - Each line item represents one charge for goods and services rendered. Details such as date, code and amount are found in
  *   the referenced ChargeItem resource.
  */
@POJOBoilerplate
class Invoice(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val `type`: Option[CodeableConcept] = None,
    val date: Option[FHIRDateTime] = None,
    val note: LitSeq[Annotation] = LitSeq.empty,
    val status: INVOICE_STATUS,
    val issuer: Option[Reference] = None,
    val subject: Option[Reference] = None,
    val account: Option[Reference] = None,
    override val language: Option[LANGUAGES] = None,
    val totalNet: Option[Money] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val recipient: Option[Reference] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val totalGross: Option[Money] = None,
    val paymentTerms: Option[Markdown] = None,
    override val implicitRules: Option[UriStr] = None,
    val cancelledReason: Option[String] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val totalPriceComponent: LitSeq[Invoice.LineItem.PriceComponent] = LitSeq.empty,
    val participant: LitSeq[Invoice.Participant] = LitSeq.empty,
    val lineItem: LitSeq[Invoice.LineItem] = LitSeq.empty,
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
  override val thisTypeName: String = "Invoice"
}
