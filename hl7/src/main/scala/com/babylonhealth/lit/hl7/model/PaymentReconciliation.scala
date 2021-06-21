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
import com.babylonhealth.lit.hl7.{ NOTE_TYPE, REMITTANCE_OUTCOME, FM_STATUS }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object PaymentReconciliation extends CompanionFor[PaymentReconciliation] {
  implicit def summonObjectAndCompanionPaymentReconciliation1456914715(
      o: PaymentReconciliation): ObjectAndCompanion[PaymentReconciliation, PaymentReconciliation.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = PaymentReconciliation
  override type ParentType   = PaymentReconciliation
  override val baseType: CompanionFor[ResourceType] = PaymentReconciliation
  override val parentType: CompanionFor[ParentType] = PaymentReconciliation
  override val profileUrl: Option[String] = Some("http://hl7.org/fhir/StructureDefinition/PaymentReconciliation")
  object ProcessNote extends CompanionFor[ProcessNote] {
    implicit def summonObjectAndCompanionProcessNote1315800070(
        o: ProcessNote): ObjectAndCompanion[ProcessNote, ProcessNote.type] = ObjectAndCompanion(o, this)
    override type ResourceType = ProcessNote
    override type ParentType   = ProcessNote
    override val parentType: CompanionFor[ResourceType] = ProcessNote
    def apply(
        id: Option[String] = None,
        `type`: Option[NOTE_TYPE] = None,
        text: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): ProcessNote = new ProcessNote(
      id,
      `type`,
      text,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: ProcessNote): Option[(Option[String], Option[NOTE_TYPE], Option[String], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.`type`, o.text, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[Option[NOTE_TYPE]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[NOTE_TYPE]], false, lTagOf[NOTE_TYPE])
    val text: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("text", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, `type`, text, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: ProcessNote): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[NOTE_TYPE]](`type`, t.`type`),
      FHIRComponentField[Option[String]](text, t.text),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[ProcessNote] = this
    val thisName: String                    = "ProcessNote"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ProcessNote] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new ProcessNote(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[NOTE_TYPE]]("type", Some(None)),
            cursor.decodeAs[Option[String]]("text", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class ProcessNote(
      override val id: Option[String] = None,
      val `type`: Option[NOTE_TYPE] = None,
      val text: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Detail extends CompanionFor[Detail] {
    implicit def summonObjectAndCompanionDetail_1308454562(o: Detail): ObjectAndCompanion[Detail, Detail.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Detail
    override type ParentType   = Detail
    override val parentType: CompanionFor[ResourceType] = Detail
    def apply(
        id: Option[String] = None,
        `type`: CodeableConcept,
        date: Option[FHIRDate] = None,
        payee: Option[Reference] = None,
        amount: Option[Money] = None,
        request: Option[Reference] = None,
        response: Option[Reference] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        submitter: Option[Reference] = None,
        identifier: Option[Identifier] = None,
        predecessor: Option[Identifier] = None,
        responsible: Option[Reference] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Detail = new Detail(
      id,
      `type`,
      date,
      payee,
      amount,
      request,
      response,
      extension,
      submitter,
      identifier,
      predecessor,
      responsible,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Detail): Option[(Option[String], CodeableConcept, Option[FHIRDate], Option[Reference], Option[Money], Option[Reference], Option[Reference], LitSeq[Extension], Option[Reference], Option[Identifier], Option[Identifier], Option[Reference], LitSeq[Extension])] =
      Some(
        (
          o.id,
          o.`type`,
          o.date,
          o.payee,
          o.amount,
          o.request,
          o.response,
          o.extension,
          o.submitter,
          o.identifier,
          o.predecessor,
          o.responsible,
          o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("type", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val date: FHIRComponentFieldMeta[Option[FHIRDate]] =
      FHIRComponentFieldMeta("date", lTagOf[Option[FHIRDate]], false, lTagOf[FHIRDate])
    val payee: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("payee", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val amount: FHIRComponentFieldMeta[Option[Money]] =
      FHIRComponentFieldMeta("amount", lTagOf[Option[Money]], false, lTagOf[Money])
    val request: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("request", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val response: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("response", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val submitter: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("submitter", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val identifier: FHIRComponentFieldMeta[Option[Identifier]] =
      FHIRComponentFieldMeta("identifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
    val predecessor: FHIRComponentFieldMeta[Option[Identifier]] =
      FHIRComponentFieldMeta("predecessor", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
    val responsible: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("responsible", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
      id,
      `type`,
      date,
      payee,
      amount,
      request,
      response,
      extension,
      submitter,
      identifier,
      predecessor,
      responsible,
      modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Detail): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[CodeableConcept](`type`, t.`type`),
      FHIRComponentField[Option[FHIRDate]](date, t.date),
      FHIRComponentField[Option[Reference]](payee, t.payee),
      FHIRComponentField[Option[Money]](amount, t.amount),
      FHIRComponentField[Option[Reference]](request, t.request),
      FHIRComponentField[Option[Reference]](response, t.response),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Reference]](submitter, t.submitter),
      FHIRComponentField[Option[Identifier]](identifier, t.identifier),
      FHIRComponentField[Option[Identifier]](predecessor, t.predecessor),
      FHIRComponentField[Option[Reference]](responsible, t.responsible),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Detail] = this
    val thisName: String               = "Detail"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Detail] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Detail(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[CodeableConcept]("type", None),
            cursor.decodeAs[Option[FHIRDate]]("date", Some(None)),
            cursor.decodeAs[Option[Reference]]("payee", Some(None)),
            cursor.decodeAs[Option[Money]]("amount", Some(None)),
            cursor.decodeAs[Option[Reference]]("request", Some(None)),
            cursor.decodeAs[Option[Reference]]("response", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Reference]]("submitter", Some(None)),
            cursor.decodeAs[Option[Identifier]]("identifier", Some(None)),
            cursor.decodeAs[Option[Identifier]]("predecessor", Some(None)),
            cursor.decodeAs[Option[Reference]]("responsible", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Detail(
      override val id: Option[String] = None,
      val `type`: CodeableConcept,
      val date: Option[FHIRDate] = None,
      val payee: Option[Reference] = None,
      val amount: Option[Money] = None,
      val request: Option[Reference] = None,
      val response: Option[Reference] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val submitter: Option[Reference] = None,
      val identifier: Option[Identifier] = None,
      val predecessor: Option[Identifier] = None,
      val responsible: Option[Reference] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      status: FM_STATUS,
      period: Option[Period] = None,
      created: FHIRDateTime,
      request: Option[Reference] = None,
      outcome: Option[REMITTANCE_OUTCOME] = None,
      language: Option[LANGUAGES] = None,
      formCode: Option[CodeableConcept] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      requestor: Option[Reference] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      disposition: Option[String] = None,
      paymentDate: FHIRDate,
      implicitRules: Option[UriStr] = None,
      paymentIssuer: Option[Reference] = None,
      paymentAmount: Money,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      paymentIdentifier: Option[Identifier] = None,
      detail: LitSeq[PaymentReconciliation.Detail] = LitSeq.empty,
      processNote: LitSeq[PaymentReconciliation.ProcessNote] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): PaymentReconciliation = new PaymentReconciliation(
    id,
    meta,
    text,
    status,
    period,
    created,
    request,
    outcome,
    language,
    formCode,
    contained,
    extension,
    requestor,
    identifier,
    disposition,
    paymentDate,
    implicitRules,
    paymentIssuer,
    paymentAmount,
    modifierExtension,
    paymentIdentifier,
    detail,
    processNote,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val status: FHIRComponentFieldMeta[FM_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[FM_STATUS], false, lTagOf[FM_STATUS])
  val period: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("period", lTagOf[Option[Period]], false, lTagOf[Period])
  val created: FHIRComponentFieldMeta[FHIRDateTime] =
    FHIRComponentFieldMeta("created", lTagOf[FHIRDateTime], false, lTagOf[FHIRDateTime])
  val request: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("request", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val outcome: FHIRComponentFieldMeta[Option[REMITTANCE_OUTCOME]] =
    FHIRComponentFieldMeta("outcome", lTagOf[Option[REMITTANCE_OUTCOME]], false, lTagOf[REMITTANCE_OUTCOME])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val formCode: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("formCode", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val requestor: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("requestor", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val disposition: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("disposition", lTagOf[Option[String]], false, lTagOf[String])
  val paymentDate: FHIRComponentFieldMeta[FHIRDate] =
    FHIRComponentFieldMeta("paymentDate", lTagOf[FHIRDate], false, lTagOf[FHIRDate])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val paymentIssuer: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("paymentIssuer", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val paymentAmount: FHIRComponentFieldMeta[Money] =
    FHIRComponentFieldMeta("paymentAmount", lTagOf[Money], false, lTagOf[Money])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val paymentIdentifier: FHIRComponentFieldMeta[Option[Identifier]] =
    FHIRComponentFieldMeta("paymentIdentifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
  val detail: FHIRComponentFieldMeta[LitSeq[PaymentReconciliation.Detail]] =
    FHIRComponentFieldMeta(
      "detail",
      lTagOf[LitSeq[PaymentReconciliation.Detail]],
      false,
      lTagOf[PaymentReconciliation.Detail])
  val processNote: FHIRComponentFieldMeta[LitSeq[PaymentReconciliation.ProcessNote]] =
    FHIRComponentFieldMeta(
      "processNote",
      lTagOf[LitSeq[PaymentReconciliation.ProcessNote]],
      false,
      lTagOf[PaymentReconciliation.ProcessNote])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    status,
    period,
    created,
    request,
    outcome,
    language,
    formCode,
    contained,
    extension,
    requestor,
    identifier,
    disposition,
    paymentDate,
    implicitRules,
    paymentIssuer,
    paymentAmount,
    modifierExtension,
    paymentIdentifier,
    detail,
    processNote
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: PaymentReconciliation): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[FM_STATUS](status, t.status),
    FHIRComponentField[Option[Period]](period, t.period),
    FHIRComponentField[FHIRDateTime](created, t.created),
    FHIRComponentField[Option[Reference]](request, t.request),
    FHIRComponentField[Option[REMITTANCE_OUTCOME]](outcome, t.outcome),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Option[CodeableConcept]](formCode, t.formCode),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Reference]](requestor, t.requestor),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[String]](disposition, t.disposition),
    FHIRComponentField[FHIRDate](paymentDate, t.paymentDate),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[Reference]](paymentIssuer, t.paymentIssuer),
    FHIRComponentField[Money](paymentAmount, t.paymentAmount),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Option[Identifier]](paymentIdentifier, t.paymentIdentifier),
    FHIRComponentField[LitSeq[PaymentReconciliation.Detail]](detail, t.detail),
    FHIRComponentField[LitSeq[PaymentReconciliation.ProcessNote]](processNote, t.processNote)
  )
  def extractId(t: PaymentReconciliation): Option[String]                                     = t.id
  def extractMeta(t: PaymentReconciliation): Option[Meta]                                     = t.meta
  def extractText(t: PaymentReconciliation): Option[Narrative]                                = t.text
  def extractStatus(t: PaymentReconciliation): FM_STATUS                                      = t.status
  def extractPeriod(t: PaymentReconciliation): Option[Period]                                 = t.period
  def extractCreated(t: PaymentReconciliation): FHIRDateTime                                  = t.created
  def extractRequest(t: PaymentReconciliation): Option[Reference]                             = t.request
  def extractOutcome(t: PaymentReconciliation): Option[REMITTANCE_OUTCOME]                    = t.outcome
  def extractLanguage(t: PaymentReconciliation): Option[LANGUAGES]                            = t.language
  def extractFormCode(t: PaymentReconciliation): Option[CodeableConcept]                      = t.formCode
  def extractContained(t: PaymentReconciliation): LitSeq[Resource]                            = t.contained
  def extractExtension(t: PaymentReconciliation): LitSeq[Extension]                           = t.extension
  def extractRequestor(t: PaymentReconciliation): Option[Reference]                           = t.requestor
  def extractIdentifier(t: PaymentReconciliation): LitSeq[Identifier]                         = t.identifier
  def extractDisposition(t: PaymentReconciliation): Option[String]                            = t.disposition
  def extractPaymentDate(t: PaymentReconciliation): FHIRDate                                  = t.paymentDate
  def extractImplicitRules(t: PaymentReconciliation): Option[UriStr]                          = t.implicitRules
  def extractPaymentIssuer(t: PaymentReconciliation): Option[Reference]                       = t.paymentIssuer
  def extractPaymentAmount(t: PaymentReconciliation): Money                                   = t.paymentAmount
  def extractModifierExtension(t: PaymentReconciliation): LitSeq[Extension]                   = t.modifierExtension
  def extractPaymentIdentifier(t: PaymentReconciliation): Option[Identifier]                  = t.paymentIdentifier
  def extractDetail(t: PaymentReconciliation): LitSeq[PaymentReconciliation.Detail]           = t.detail
  def extractProcessNote(t: PaymentReconciliation): LitSeq[PaymentReconciliation.ProcessNote] = t.processNote
  override val thisName: String                                                               = "PaymentReconciliation"
  override val searchParams: Map[String, PaymentReconciliation => Seq[Any]] = Map(
    "requestor"      -> (obj => obj.requestor.toSeq),
    "request"        -> (obj => obj.request.toSeq),
    "identifier"     -> (obj => obj.identifier.toSeq),
    "disposition"    -> (obj => obj.disposition.toSeq),
    "payment-issuer" -> (obj => obj.paymentIssuer.toSeq),
    "outcome"        -> (obj => obj.outcome.toSeq),
    "status"         -> (obj => Seq(obj.status)),
    "created"        -> (obj => Seq(obj.created))
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[PaymentReconciliation] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new PaymentReconciliation(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[FM_STATUS]("status", None),
          cursor.decodeAs[Option[Period]]("period", Some(None)),
          cursor.decodeAs[FHIRDateTime]("created", None),
          cursor.decodeAs[Option[Reference]]("request", Some(None)),
          cursor.decodeAs[Option[REMITTANCE_OUTCOME]]("outcome", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("formCode", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("requestor", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("disposition", Some(None)),
          cursor.decodeAs[FHIRDate]("paymentDate", None),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[Reference]]("paymentIssuer", Some(None)),
          cursor.decodeAs[Money]("paymentAmount", None),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Identifier]]("paymentIdentifier", Some(None)),
          cursor.decodeAs[LitSeq[PaymentReconciliation.Detail]]("detail", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[PaymentReconciliation.ProcessNote]]("processNote", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** This resource provides the details including amount of a payment and allocates the payment items being paid.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields status, period, created, request, outcome, formCode, requestor, identifier, disposition,
  *   paymentDate, paymentIssuer, paymentAmount, paymentIdentifier, detail, processNote.
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
  * @param status
  *   - The status of the resource instance.
  * @param period
  *   - The period of time for which payments have been gathered into this bulk payment for settlement.
  * @param created
  *   - The date when the resource was created.
  * @param request
  *   - Original request resource reference.
  * @param outcome
  *   - The outcome of a request for a reconciliation.
  * @param language
  *   - The base language in which the resource is written.
  * @param formCode
  *   - A code for the form to be used for printing the content.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To
  *   make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and
  *   use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be
  *   met as part of the definition of the extension.
  * @param requestor
  *   - The practitioner who is responsible for the services rendered to the patient.
  * @param identifier
  *   - A unique identifier assigned to this payment reconciliation.
  * @param disposition
  *   - A human readable description of the status of the request for the reconciliation.
  * @param paymentDate
  *   - The date of payment as indicated on the financial instrument.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood
  *   when processing the content. Often, this is a reference to an implementation guide that defines the special rules
  *   along with other profiles etc.
  * @param paymentIssuer
  *   - The party who generated the payment.
  * @param paymentAmount
  *   - Total payment amount as indicated on the financial instrument.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and
  *   that modifies the understanding of the element that contains it and/or the understanding of the containing
  *   element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions
  *   safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though
  *   any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the
  *   definition of the extension. Applications processing a resource are required to check for modifier extensions.
  *   Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot
  *   change the meaning of modifierExtension itself).
  * @param paymentIdentifier
  *   - Issuer's unique identifier for the payment instrument.
  * @param detail
  *   - Distribution of the payment amount for a previously acknowledged payable.
  * @param processNote
  *   - A note that describes or explains the processing in a human readable form.
  */
@POJOBoilerplate
class PaymentReconciliation(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val status: FM_STATUS,
    val period: Option[Period] = None,
    val created: FHIRDateTime,
    val request: Option[Reference] = None,
    val outcome: Option[REMITTANCE_OUTCOME] = None,
    override val language: Option[LANGUAGES] = None,
    val formCode: Option[CodeableConcept] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val requestor: Option[Reference] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val disposition: Option[String] = None,
    val paymentDate: FHIRDate,
    override val implicitRules: Option[UriStr] = None,
    val paymentIssuer: Option[Reference] = None,
    val paymentAmount: Money,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val paymentIdentifier: Option[Identifier] = None,
    val detail: LitSeq[PaymentReconciliation.Detail] = LitSeq.empty,
    val processNote: LitSeq[PaymentReconciliation.ProcessNote] = LitSeq.empty,
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
  override val thisTypeName: String = "PaymentReconciliation"
}
