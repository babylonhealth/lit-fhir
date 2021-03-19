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
import com.babylonhealth.lit.hl7.FM_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object PaymentNotice extends CompanionFor[PaymentNotice] {
  override type ResourceType = PaymentNotice
  override val baseType: CompanionFor[ResourceType] = PaymentNotice
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/PaymentNotice")
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      payee: Option[Reference] = None,
      status: FM_STATUS,
      amount: Money,
      request: Option[Reference] = None,
      created: FHIRDateTime,
      payment: Reference,
      language: Option[LANGUAGES] = None,
      response: Option[Reference] = None,
      provider: Option[Reference] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      recipient: Reference,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      paymentDate: Option[FHIRDate] = None,
      implicitRules: Option[UriStr] = None,
      paymentStatus: Option[CodeableConcept] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): PaymentNotice = new PaymentNotice(
    id,
    meta,
    text,
    payee,
    status,
    amount,
    request,
    created,
    payment,
    language,
    response,
    provider,
    contained,
    extension,
    recipient,
    identifier,
    paymentDate,
    implicitRules,
    paymentStatus,
    modifierExtension,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val payee: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("payee", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val status: FHIRComponentFieldMeta[FM_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[FM_STATUS], false, lTagOf[FM_STATUS])
  val amount: FHIRComponentFieldMeta[Money] =
    FHIRComponentFieldMeta("amount", lTagOf[Money], false, lTagOf[Money])
  val request: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("request", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val created: FHIRComponentFieldMeta[FHIRDateTime] =
    FHIRComponentFieldMeta("created", lTagOf[FHIRDateTime], false, lTagOf[FHIRDateTime])
  val payment: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("payment", lTagOf[Reference], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val response: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("response", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val provider: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("provider", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val recipient: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("recipient", lTagOf[Reference], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val paymentDate: FHIRComponentFieldMeta[Option[FHIRDate]] =
    FHIRComponentFieldMeta("paymentDate", lTagOf[Option[FHIRDate]], false, lTagOf[FHIRDate])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val paymentStatus: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("paymentStatus", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    payee,
    status,
    amount,
    request,
    created,
    payment,
    language,
    response,
    provider,
    contained,
    extension,
    recipient,
    identifier,
    paymentDate,
    implicitRules,
    paymentStatus,
    modifierExtension
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: PaymentNotice): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[Reference]](payee, t.payee),
    FHIRComponentField[FM_STATUS](status, t.status),
    FHIRComponentField[Money](amount, t.amount),
    FHIRComponentField[Option[Reference]](request, t.request),
    FHIRComponentField[FHIRDateTime](created, t.created),
    FHIRComponentField[Reference](payment, t.payment),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Option[Reference]](response, t.response),
    FHIRComponentField[Option[Reference]](provider, t.provider),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Reference](recipient, t.recipient),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[FHIRDate]](paymentDate, t.paymentDate),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[CodeableConcept]](paymentStatus, t.paymentStatus),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
  )
  def extractId(t: PaymentNotice): Option[String]                     = t.id
  def extractMeta(t: PaymentNotice): Option[Meta]                     = t.meta
  def extractText(t: PaymentNotice): Option[Narrative]                = t.text
  def extractPayee(t: PaymentNotice): Option[Reference]               = t.payee
  def extractStatus(t: PaymentNotice): FM_STATUS                      = t.status
  def extractAmount(t: PaymentNotice): Money                          = t.amount
  def extractRequest(t: PaymentNotice): Option[Reference]             = t.request
  def extractCreated(t: PaymentNotice): FHIRDateTime                  = t.created
  def extractPayment(t: PaymentNotice): Reference                     = t.payment
  def extractLanguage(t: PaymentNotice): Option[LANGUAGES]            = t.language
  def extractResponse(t: PaymentNotice): Option[Reference]            = t.response
  def extractProvider(t: PaymentNotice): Option[Reference]            = t.provider
  def extractContained(t: PaymentNotice): LitSeq[Resource]            = t.contained
  def extractExtension(t: PaymentNotice): LitSeq[Extension]           = t.extension
  def extractRecipient(t: PaymentNotice): Reference                   = t.recipient
  def extractIdentifier(t: PaymentNotice): LitSeq[Identifier]         = t.identifier
  def extractPaymentDate(t: PaymentNotice): Option[FHIRDate]          = t.paymentDate
  def extractImplicitRules(t: PaymentNotice): Option[UriStr]          = t.implicitRules
  def extractPaymentStatus(t: PaymentNotice): Option[CodeableConcept] = t.paymentStatus
  def extractModifierExtension(t: PaymentNotice): LitSeq[Extension]   = t.modifierExtension
  override val thisName: String                                       = "PaymentNotice"
  override val searchParams: Map[String, PaymentNotice => Seq[Any]] = Map(
    "request"        -> (obj => obj.request.toSeq),
    "provider"       -> (obj => obj.provider.toSeq),
    "identifier"     -> (obj => obj.identifier.toSeq),
    "response"       -> (obj => obj.response.toSeq),
    "status"         -> (obj => Seq(obj.status)),
    "payment-status" -> (obj => obj.paymentStatus.toSeq),
    "created"        -> (obj => Seq(obj.created))
  )
  def unapply(
      o: PaymentNotice): Option[(Option[String], Option[Meta], Option[Narrative], Option[Reference], FM_STATUS, Money, Option[Reference], FHIRDateTime, Reference, Option[LANGUAGES], Option[Reference], Option[Reference], LitSeq[Resource], LitSeq[Extension], Reference, LitSeq[Identifier], Option[FHIRDate], Option[UriStr], Option[CodeableConcept], LitSeq[Extension])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.payee,
        o.status,
        o.amount,
        o.request,
        o.created,
        o.payment,
        o.language,
        o.response,
        o.provider,
        o.contained,
        o.extension,
        o.recipient,
        o.identifier,
        o.paymentDate,
        o.implicitRules,
        o.paymentStatus,
        o.modifierExtension))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[PaymentNotice] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new PaymentNotice(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[Reference]]("payee", Some(None)),
          cursor.decodeAs[FM_STATUS]("status", None),
          cursor.decodeAs[Money]("amount", None),
          cursor.decodeAs[Option[Reference]]("request", Some(None)),
          cursor.decodeAs[FHIRDateTime]("created", None),
          cursor.decodeAs[Reference]("payment", None),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[Reference]]("response", Some(None)),
          cursor.decodeAs[Option[Reference]]("provider", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Reference]("recipient", None),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[FHIRDate]]("paymentDate", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("paymentStatus", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** This resource provides the status of the payment for goods and services rendered, and the request and response resource references.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields payee, status, amount, request, created, payment, response, provider, recipient, identifier, paymentDate, paymentStatus.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param payee - The party who will receive or has received payment that is the subject of this notification.
  * @param status - The status of the resource instance.
  * @param amount - The amount sent to the payee.
  * @param request - Reference of resource for which payment is being made.
  * @param created - The date when this resource was created.
  * @param payment - A reference to the payment which is the subject of this notice.
  * @param language - The base language in which the resource is written.
  * @param response - Reference of response to resource for which payment is being made.
  * @param provider - The practitioner who is responsible for the services rendered to the patient.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param recipient - The party who is notified of the payment status.
  * @param identifier - A unique identifier assigned to this payment notice.
  * @param paymentDate - The date when the above payment action occurred.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param paymentStatus - A code indicating whether payment has been sent or cleared.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  */
@POJOBoilerplate
class PaymentNotice(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val payee: Option[Reference] = None,
    val status: FM_STATUS,
    val amount: Money,
    val request: Option[Reference] = None,
    val created: FHIRDateTime,
    val payment: Reference,
    override val language: Option[LANGUAGES] = None,
    val response: Option[Reference] = None,
    val provider: Option[Reference] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val recipient: Reference,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val paymentDate: Option[FHIRDate] = None,
    override val implicitRules: Option[UriStr] = None,
    val paymentStatus: Option[CodeableConcept] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
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
  override val thisTypeName: String = "PaymentNotice"
}
