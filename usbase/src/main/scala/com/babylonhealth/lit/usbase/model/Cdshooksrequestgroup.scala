package com.babylonhealth.lit.usbase.model

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
import com.babylonhealth.lit.usbase.UnionAliases._
import com.babylonhealth.lit.hl7.{ REQUEST_INTENT, REQUEST_STATUS, REQUEST_PRIORITY }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Cdshooksrequestgroup extends CompanionFor[Cdshooksrequestgroup] {
  implicit def summonObjectAndCompanionCdshooksrequestgroup_374385053(
      o: Cdshooksrequestgroup): ObjectAndCompanion[Cdshooksrequestgroup, Cdshooksrequestgroup.type] = ObjectAndCompanion(o, this)
  override type ResourceType = RequestGroup
  override type ParentType   = RequestGroup
  override val baseType: CompanionFor[ResourceType] = RequestGroup
  override val parentType: CompanionFor[ParentType] = RequestGroup
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/cdshooksrequestgroup")
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(new Meta(profile = LitSeq("http://hl7.org/fhir/StructureDefinition/cdshooksrequestgroup"))),
      text: Option[Narrative] = None,
      code: Option[CodeableConcept] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      status: REQUEST_STATUS,
      intent: REQUEST_INTENT,
      author: Option[Reference] = None,
      basedOn: LitSeq[Reference] = LitSeq.empty,
      subject: Option[Reference] = None,
      language: Option[LANGUAGES] = None,
      replaces: LitSeq[Reference] = LitSeq.empty,
      priority: Option[REQUEST_PRIORITY] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      encounter: Option[Reference] = None,
      identifier: Identifier,
      authoredOn: Option[FHIRDateTime] = None,
      reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      instantiatesUri: UriStr,
      groupIdentifier: Option[Identifier] = None,
      reasonReference: LitSeq[Reference] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      instantiatesCanonical: LitSeq[Canonical] = LitSeq.empty,
      action: LitSeq[RequestGroup.Action] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Cdshooksrequestgroup = new Cdshooksrequestgroup(
    id,
    meta,
    text,
    code,
    note,
    status,
    intent,
    author,
    basedOn,
    subject,
    language,
    replaces,
    priority,
    contained,
    extension,
    encounter,
    identifier,
    authoredOn,
    reasonCode,
    implicitRules,
    instantiatesUri,
    groupIdentifier,
    reasonReference,
    modifierExtension,
    instantiatesCanonical,
    action,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val code: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("code", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val status: FHIRComponentFieldMeta[REQUEST_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[REQUEST_STATUS], false, lTagOf[REQUEST_STATUS])
  val intent: FHIRComponentFieldMeta[REQUEST_INTENT] =
    FHIRComponentFieldMeta("intent", lTagOf[REQUEST_INTENT], false, lTagOf[REQUEST_INTENT])
  val author: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("author", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val basedOn: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("basedOn", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val subject: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("subject", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val replaces: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("replaces", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val priority: FHIRComponentFieldMeta[Option[REQUEST_PRIORITY]] =
    FHIRComponentFieldMeta("priority", lTagOf[Option[REQUEST_PRIORITY]], false, lTagOf[REQUEST_PRIORITY])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val encounter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("encounter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[Identifier] =
    FHIRComponentFieldMeta("identifier", lTagOf[Identifier], false, lTagOf[Identifier])
  val authoredOn: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("authoredOn", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val reasonCode: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("reasonCode", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val instantiatesUri: FHIRComponentFieldMeta[UriStr] =
    FHIRComponentFieldMeta("instantiatesUri", lTagOf[UriStr], false, lTagOf[UriStr])
  val groupIdentifier: FHIRComponentFieldMeta[Option[Identifier]] =
    FHIRComponentFieldMeta("groupIdentifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
  val reasonReference: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("reasonReference", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val instantiatesCanonical: FHIRComponentFieldMeta[LitSeq[Canonical]] =
    FHIRComponentFieldMeta("instantiatesCanonical", lTagOf[LitSeq[Canonical]], false, lTagOf[Canonical])
  val action: FHIRComponentFieldMeta[LitSeq[RequestGroup.Action]] =
    FHIRComponentFieldMeta("action", lTagOf[LitSeq[RequestGroup.Action]], false, lTagOf[RequestGroup.Action])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    code,
    note,
    status,
    intent,
    author,
    basedOn,
    subject,
    language,
    replaces,
    priority,
    contained,
    extension,
    encounter,
    identifier,
    authoredOn,
    reasonCode,
    implicitRules,
    instantiatesUri,
    groupIdentifier,
    reasonReference,
    modifierExtension,
    instantiatesCanonical,
    action
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Meta]](meta, t.meta),
      FHIRComponentField[Option[Narrative]](text, t.text),
      FHIRComponentField[Option[CodeableConcept]](code, t.code),
      FHIRComponentField[LitSeq[Annotation]](note, t.note),
      FHIRComponentField[REQUEST_STATUS](status, t.status),
      FHIRComponentField[REQUEST_INTENT](intent, t.intent),
      FHIRComponentField[Option[Reference]](author, t.author),
      FHIRComponentField[LitSeq[Reference]](basedOn, t.basedOn),
      FHIRComponentField[Option[Reference]](subject, t.subject),
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[LitSeq[Reference]](replaces, t.replaces),
      FHIRComponentField[Option[REQUEST_PRIORITY]](priority, t.priority),
      FHIRComponentField[LitSeq[Resource]](contained, t.contained),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Reference]](encounter, t.encounter),
      FHIRComponentField[Identifier](identifier, t.identifier.head),
      FHIRComponentField[Option[FHIRDateTime]](authoredOn, t.authoredOn),
      FHIRComponentField[LitSeq[CodeableConcept]](reasonCode, t.reasonCode),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[UriStr](instantiatesUri, t.instantiatesUri.head),
      FHIRComponentField[Option[Identifier]](groupIdentifier, t.groupIdentifier),
      FHIRComponentField[LitSeq[Reference]](reasonReference, t.reasonReference),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[Canonical]](instantiatesCanonical, t.instantiatesCanonical),
      FHIRComponentField[LitSeq[RequestGroup.Action]](action, t.action)
    ))
  override def fields(t: Cdshooksrequestgroup): Seq[FHIRComponentField[_]]     = fieldsFromParent(t).get
  def extractId(t: Cdshooksrequestgroup): Option[String]                       = t.id
  def extractMeta(t: Cdshooksrequestgroup): Option[Meta]                       = t.meta
  def extractText(t: Cdshooksrequestgroup): Option[Narrative]                  = t.text
  def extractCode(t: Cdshooksrequestgroup): Option[CodeableConcept]            = t.code
  def extractNote(t: Cdshooksrequestgroup): LitSeq[Annotation]                 = t.note
  def extractStatus(t: Cdshooksrequestgroup): REQUEST_STATUS                   = t.status
  def extractIntent(t: Cdshooksrequestgroup): REQUEST_INTENT                   = t.intent
  def extractAuthor(t: Cdshooksrequestgroup): Option[Reference]                = t.author
  def extractBasedOn(t: Cdshooksrequestgroup): LitSeq[Reference]               = t.basedOn
  def extractSubject(t: Cdshooksrequestgroup): Option[Reference]               = t.subject
  def extractLanguage(t: Cdshooksrequestgroup): Option[LANGUAGES]              = t.language
  def extractReplaces(t: Cdshooksrequestgroup): LitSeq[Reference]              = t.replaces
  def extractPriority(t: Cdshooksrequestgroup): Option[REQUEST_PRIORITY]       = t.priority
  def extractContained(t: Cdshooksrequestgroup): LitSeq[Resource]              = t.contained
  def extractExtension(t: Cdshooksrequestgroup): LitSeq[Extension]             = t.extension
  def extractEncounter(t: Cdshooksrequestgroup): Option[Reference]             = t.encounter
  def extractIdentifier(t: Cdshooksrequestgroup): Identifier                   = t.identifier.head
  def extractAuthoredOn(t: Cdshooksrequestgroup): Option[FHIRDateTime]         = t.authoredOn
  def extractReasonCode(t: Cdshooksrequestgroup): LitSeq[CodeableConcept]      = t.reasonCode
  def extractImplicitRules(t: Cdshooksrequestgroup): Option[UriStr]            = t.implicitRules
  def extractInstantiatesUri(t: Cdshooksrequestgroup): UriStr                  = t.instantiatesUri.head
  def extractGroupIdentifier(t: Cdshooksrequestgroup): Option[Identifier]      = t.groupIdentifier
  def extractReasonReference(t: Cdshooksrequestgroup): LitSeq[Reference]       = t.reasonReference
  def extractModifierExtension(t: Cdshooksrequestgroup): LitSeq[Extension]     = t.modifierExtension
  def extractInstantiatesCanonical(t: Cdshooksrequestgroup): LitSeq[Canonical] = t.instantiatesCanonical
  def extractAction(t: Cdshooksrequestgroup): LitSeq[RequestGroup.Action]      = t.action
  override val thisName: String                                                = "Cdshooksrequestgroup"
  override val searchParams: Map[String, Cdshooksrequestgroup => Seq[Any]]     = RequestGroup.searchParams
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Cdshooksrequestgroup] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Cdshooksrequestgroup(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("code", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[REQUEST_STATUS]("status", None),
          cursor.decodeAs[REQUEST_INTENT]("intent", None),
          cursor.decodeAs[Option[Reference]]("author", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("basedOn", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("subject", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("replaces", Some(LitSeq.empty)),
          cursor.decodeAs[Option[REQUEST_PRIORITY]]("priority", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          cursor.decodeFromListAs[Identifier]("identifier", None),
          cursor.decodeAs[Option[FHIRDateTime]]("authoredOn", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("reasonCode", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeFromListAs[UriStr]("instantiatesUri", None),
          cursor.decodeAs[Option[Identifier]]("groupIdentifier", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("reasonReference", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Canonical]]("instantiatesCanonical", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[RequestGroup.Action]]("action", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Defines a RequestGroup that can represent a CDS Hooks response
  *
  * Subclass of [[hl7.model.RequestGroup]] (A group of related requests that can be used to capture intended activities that have
  * inter-dependencies such as "give this medication after that one".)
  *
  * @constructor
  *   Inherits all params from parent. Requires the following fields which were optional in the parent: identifier,
  *   instantiatesUri.
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
  * @param code
  *   - A code that identifies what the overall request group is.
  * @param note
  *   - Provides a mechanism to communicate additional information about the response.
  * @param status
  *   - The current state of the request. For request groups, the status reflects the status of all the requests in the group.
  * @param intent
  *   - Indicates the level of authority/intentionality associated with the request and where the request fits into the workflow
  *   chain.
  * @param author
  *   - Provides a reference to the author of the request group.
  * @param basedOn
  *   - A plan, proposal or order that is fulfilled in whole or in part by this request.
  * @param subject
  *   - The subject for which the request group was created.
  * @param language
  *   - The base language in which the resource is written.
  * @param replaces
  *   - Completed or terminated request(s) whose function is taken by this new request.
  * @param priority
  *   - Indicates how quickly the request should be addressed with respect to other requests.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param encounter
  *   - Describes the context of the request group, if any.
  * @param identifier
  *   - Allows a service to provide a unique, business identifier for the request.
  * @param authoredOn
  *   - Indicates when the request group was created.
  * @param reasonCode
  *   - Describes the reason for the request group in coded or textual form.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param instantiatesUri
  *   - A URL referencing an externally defined protocol, guideline, orderset or other definition that is adhered to in whole or
  *   in part by this request.
  * @param groupIdentifier
  *   - A shared identifier common to all requests that were authorized more or less simultaneously by a single author,
  *   representing the identifier of the requisition, prescription or similar form.
  * @param reasonReference
  *   - Indicates another resource whose existence justifies this request group.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *   the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually
  *   modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict
  *   set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param instantiatesCanonical
  *   - A canonical URL referencing a FHIR-defined protocol, guideline, orderset or other definition that is adhered to in whole
  *   or in part by this request.
  * @param action
  *   - The actions, if any, produced by the evaluation of the artifact.
  */
@POJOBoilerplate
class Cdshooksrequestgroup(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("http://hl7.org/fhir/StructureDefinition/cdshooksrequestgroup"))),
    override val text: Option[Narrative] = None,
    override val code: Option[CodeableConcept] = None,
    override val note: LitSeq[Annotation] = LitSeq.empty,
    override val status: REQUEST_STATUS,
    override val intent: REQUEST_INTENT,
    override val author: Option[Reference] = None,
    override val basedOn: LitSeq[Reference] = LitSeq.empty,
    override val subject: Option[Reference] = None,
    override val language: Option[LANGUAGES] = None,
    override val replaces: LitSeq[Reference] = LitSeq.empty,
    override val priority: Option[REQUEST_PRIORITY] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val encounter: Option[Reference] = None,
    identifier: Identifier,
    override val authoredOn: Option[FHIRDateTime] = None,
    override val reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    instantiatesUri: UriStr,
    override val groupIdentifier: Option[Identifier] = None,
    override val reasonReference: LitSeq[Reference] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val instantiatesCanonical: LitSeq[Canonical] = LitSeq.empty,
    override val action: LitSeq[RequestGroup.Action] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends RequestGroup(
      id = id,
      meta = meta,
      text = text,
      code = code,
      note = note,
      status = status,
      intent = intent,
      author = author,
      basedOn = basedOn,
      subject = subject,
      language = language,
      replaces = replaces,
      priority = priority,
      contained = contained,
      extension = extension,
      encounter = encounter,
      identifier = LitSeq(identifier),
      authoredOn = authoredOn,
      reasonCode = reasonCode,
      implicitRules = implicitRules,
      instantiatesUri = LitSeq(instantiatesUri),
      groupIdentifier = groupIdentifier,
      reasonReference = reasonReference,
      modifierExtension = modifierExtension,
      instantiatesCanonical = instantiatesCanonical,
      action = action,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "RequestGroup"
}
