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
import com.babylonhealth.lit.hl7.ENDPOINT_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Endpoint extends CompanionFor[Endpoint] {
  implicit def summonObjectAndCompanionEndpoint_1243686774(o: Endpoint): ObjectAndCompanion[Endpoint, Endpoint.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Endpoint
  override type ParentType   = Endpoint
  override val baseType: CompanionFor[ResourceType] = Endpoint
  override val parentType: CompanionFor[ParentType] = Endpoint
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Endpoint")
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      name: Option[String] = None,
      status: ENDPOINT_STATUS,
      period: Option[Period] = None,
      header: LitSeq[String] = LitSeq.empty,
      contact: LitSeq[ContactPoint] = LitSeq.empty,
      address: UrlStr,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      payloadType: NonEmptyLitSeq[CodeableConcept],
      implicitRules: Option[UriStr] = None,
      connectionType: Coding,
      payloadMimeType: LitSeq[Code] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      managingOrganization: Option[Reference] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Endpoint = new Endpoint(
    id,
    meta,
    text,
    name,
    status,
    period,
    header,
    contact,
    address,
    language,
    contained,
    extension,
    identifier,
    payloadType,
    implicitRules,
    connectionType,
    payloadMimeType,
    modifierExtension,
    managingOrganization,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val name: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("name", lTagOf[Option[String]], false, lTagOf[String])
  val status: FHIRComponentFieldMeta[ENDPOINT_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[ENDPOINT_STATUS], false, lTagOf[ENDPOINT_STATUS])
  val period: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("period", lTagOf[Option[Period]], false, lTagOf[Period])
  val header: FHIRComponentFieldMeta[LitSeq[String]] =
    FHIRComponentFieldMeta("header", lTagOf[LitSeq[String]], false, lTagOf[String])
  val contact: FHIRComponentFieldMeta[LitSeq[ContactPoint]] =
    FHIRComponentFieldMeta("contact", lTagOf[LitSeq[ContactPoint]], false, lTagOf[ContactPoint])
  val address: FHIRComponentFieldMeta[UrlStr] =
    FHIRComponentFieldMeta("address", lTagOf[UrlStr], false, lTagOf[UrlStr])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val payloadType: FHIRComponentFieldMeta[NonEmptyLitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("payloadType", lTagOf[NonEmptyLitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val connectionType: FHIRComponentFieldMeta[Coding] =
    FHIRComponentFieldMeta("connectionType", lTagOf[Coding], false, lTagOf[Coding])
  val payloadMimeType: FHIRComponentFieldMeta[LitSeq[Code]] =
    FHIRComponentFieldMeta("payloadMimeType", lTagOf[LitSeq[Code]], false, lTagOf[Code])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val managingOrganization: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("managingOrganization", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    name,
    status,
    period,
    header,
    contact,
    address,
    language,
    contained,
    extension,
    identifier,
    payloadType,
    implicitRules,
    connectionType,
    payloadMimeType,
    modifierExtension,
    managingOrganization
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Endpoint): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[String]](name, t.name),
    FHIRComponentField[ENDPOINT_STATUS](status, t.status),
    FHIRComponentField[Option[Period]](period, t.period),
    FHIRComponentField[LitSeq[String]](header, t.header),
    FHIRComponentField[LitSeq[ContactPoint]](contact, t.contact),
    FHIRComponentField[UrlStr](address, t.address),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[NonEmptyLitSeq[CodeableConcept]](payloadType, t.payloadType),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Coding](connectionType, t.connectionType),
    FHIRComponentField[LitSeq[Code]](payloadMimeType, t.payloadMimeType),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Option[Reference]](managingOrganization, t.managingOrganization)
  )
  def extractId(t: Endpoint): Option[String]                           = t.id
  def extractMeta(t: Endpoint): Option[Meta]                           = t.meta
  def extractText(t: Endpoint): Option[Narrative]                      = t.text
  def extractName(t: Endpoint): Option[String]                         = t.name
  def extractStatus(t: Endpoint): ENDPOINT_STATUS                      = t.status
  def extractPeriod(t: Endpoint): Option[Period]                       = t.period
  def extractHeader(t: Endpoint): LitSeq[String]                       = t.header
  def extractContact(t: Endpoint): LitSeq[ContactPoint]                = t.contact
  def extractAddress(t: Endpoint): UrlStr                              = t.address
  def extractLanguage(t: Endpoint): Option[LANGUAGES]                  = t.language
  def extractContained(t: Endpoint): LitSeq[Resource]                  = t.contained
  def extractExtension(t: Endpoint): LitSeq[Extension]                 = t.extension
  def extractIdentifier(t: Endpoint): LitSeq[Identifier]               = t.identifier
  def extractPayloadType(t: Endpoint): NonEmptyLitSeq[CodeableConcept] = t.payloadType
  def extractImplicitRules(t: Endpoint): Option[UriStr]                = t.implicitRules
  def extractConnectionType(t: Endpoint): Coding                       = t.connectionType
  def extractPayloadMimeType(t: Endpoint): LitSeq[Code]                = t.payloadMimeType
  def extractModifierExtension(t: Endpoint): LitSeq[Extension]         = t.modifierExtension
  def extractManagingOrganization(t: Endpoint): Option[Reference]      = t.managingOrganization
  override val thisName: String                                        = "Endpoint"
  override val searchParams: Map[String, Endpoint => Seq[Any]] = Map(
    "organization"    -> (obj => obj.managingOrganization.toSeq),
    "name"            -> (obj => obj.name.toSeq),
    "identifier"      -> (obj => obj.identifier.toSeq),
    "payload-type"    -> (obj => obj.payloadType.toSeq),
    "status"          -> (obj => Seq(obj.status)),
    "connection-type" -> (obj => Seq(obj.connectionType))
  )
  def unapply(
      o: Endpoint): Option[(Option[String], Option[Meta], Option[Narrative], Option[String], ENDPOINT_STATUS, Option[Period], LitSeq[String], LitSeq[ContactPoint], UrlStr, Option[LANGUAGES], LitSeq[Resource], LitSeq[Extension], LitSeq[Identifier], NonEmptyLitSeq[CodeableConcept], Option[UriStr], Coding, LitSeq[Code], LitSeq[Extension], Option[Reference])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.name,
        o.status,
        o.period,
        o.header,
        o.contact,
        o.address,
        o.language,
        o.contained,
        o.extension,
        o.identifier,
        o.payloadType,
        o.implicitRules,
        o.connectionType,
        o.payloadMimeType,
        o.modifierExtension,
        o.managingOrganization))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Endpoint] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Endpoint(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[String]]("name", Some(None)),
          cursor.decodeAs[ENDPOINT_STATUS]("status", None),
          cursor.decodeAs[Option[Period]]("period", Some(None)),
          cursor.decodeAs[LitSeq[String]]("header", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[ContactPoint]]("contact", Some(LitSeq.empty)),
          cursor.decodeAs[UrlStr]("address", None),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[NonEmptyLitSeq[CodeableConcept]]("payloadType", None),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Coding]("connectionType", None),
          cursor.decodeAs[LitSeq[Code]]("payloadMimeType", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("managingOrganization", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** The technical details of an endpoint that can be used for electronic services, such as for web services providing XDS.b or a
  * REST endpoint for another FHIR server. This may include any security context information.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields name, status, period, header, contact, address, identifier, payloadType, connectionType,
  *   payloadMimeType, managingOrganization.
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
  * @param name
  *   \- A friendly name that this endpoint can be referred to with.
  * @param status
  *   \- active | suspended | error | off | test.
  * @param period
  *   \- The interval during which the endpoint is expected to be operational.
  * @param header
  *   \- Additional headers / information to send as part of the notification.
  * @param contact
  *   \- Contact details for a human to contact about the subscription. The primary use of this for system administrator
  *   troubleshooting.
  * @param address
  *   \- The uri that describes the actual end-point to connect to.
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
  * @param identifier
  *   \- Identifier for the organization that is used to identify the endpoint across multiple disparate systems.
  * @param payloadType
  *   \- The payload type describes the acceptable content that can be communicated on the endpoint.
  * @param implicitRules
  *   \- A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param connectionType
  *   \- A coded value that represents the technical details of the usage of this endpoint, such as what WSDLs should be used in
  *   what way. (e.g. XDS.b/DICOM/cds-hook).
  * @param payloadMimeType
  *   \- The mime type to send the payload in - e.g. application/fhir+xml, application/fhir+json. If the mime type is not
  *   specified, then the sender could send any content (including no content depending on the connectionType).
  * @param modifierExtension
  *   \- May be used to represent additional information that is not part of the basic definition of the resource and that
  *   modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *   Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *   strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *   extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *   processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any
  *   elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param managingOrganization
  *   \- The organization that manages this endpoint (even if technically another organization is hosting this in the cloud, it is
  *   the organization associated with the data).
  */
@POJOBoilerplate
class Endpoint(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val name: Option[String] = None,
    val status: ENDPOINT_STATUS,
    val period: Option[Period] = None,
    val header: LitSeq[String] = LitSeq.empty,
    val contact: LitSeq[ContactPoint] = LitSeq.empty,
    val address: UrlStr,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val payloadType: NonEmptyLitSeq[CodeableConcept],
    override val implicitRules: Option[UriStr] = None,
    val connectionType: Coding,
    val payloadMimeType: LitSeq[Code] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val managingOrganization: Option[Reference] = None,
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
  override val thisTypeName: String = "Endpoint"
}
