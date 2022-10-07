package com.babylonhealth.lit.ukcore.model

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
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, ukcore }
import com.babylonhealth.lit.macros.POJOBoilerplate

object UKCore_MessageHeader extends CompanionFor[UKCore_MessageHeader] {
  implicit def summonObjectAndCompanionUKCore_MessageHeader_935493595(
      o: UKCore_MessageHeader): ObjectAndCompanion[UKCore_MessageHeader, UKCore_MessageHeader.type] = ObjectAndCompanion(o, this)
  override type ResourceType = MessageHeader
  override type ParentType   = MessageHeader
  override val baseType: CompanionFor[ResourceType] = MessageHeader
  override val parentType: CompanionFor[ParentType] = MessageHeader
  override val profileUrl: Option[String]           = Some("https://fhir.hl7.org.uk/StructureDefinition/UKCore-MessageHeader")
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-MessageHeader"))),
      text: Option[Narrative] = None,
      reason: Option[CodeableConcept] = None,
      language: Option[LANGUAGES] = None,
      event: Coding,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      definition: Option[Canonical] = None,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      source: MessageHeader.Source,
      focus: LitSeq[Reference] = LitSeq.empty,
      sender: Option[Reference] = None,
      author: Option[Reference] = None,
      enterer: Option[Reference] = None,
      responsible: Option[Reference] = None,
      response: Option[MessageHeader.Response] = None,
      destination: LitSeq[MessageHeader.Destination] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): UKCore_MessageHeader = new UKCore_MessageHeader(
    id,
    meta,
    text,
    reason,
    language,
    event,
    contained,
    extension,
    definition,
    implicitRules,
    modifierExtension,
    source,
    focus,
    sender,
    author,
    enterer,
    responsible,
    response,
    destination,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val reason: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("reason", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val event: FHIRComponentFieldMeta[Coding] =
    FHIRComponentFieldMeta("event", lTagOf[Coding], true, lTagOf[Coding])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val definition: FHIRComponentFieldMeta[Option[Canonical]] =
    FHIRComponentFieldMeta("definition", lTagOf[Option[Canonical]], false, lTagOf[Canonical])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val source: FHIRComponentFieldMeta[MessageHeader.Source] =
    FHIRComponentFieldMeta("source", lTagOf[MessageHeader.Source], false, lTagOf[MessageHeader.Source])
  val focus: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("focus", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val sender: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("sender", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val author: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("author", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val enterer: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("enterer", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val responsible: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("responsible", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val response: FHIRComponentFieldMeta[Option[MessageHeader.Response]] =
    FHIRComponentFieldMeta("response", lTagOf[Option[MessageHeader.Response]], false, lTagOf[MessageHeader.Response])
  val destination: FHIRComponentFieldMeta[LitSeq[MessageHeader.Destination]] =
    FHIRComponentFieldMeta("destination", lTagOf[LitSeq[MessageHeader.Destination]], false, lTagOf[MessageHeader.Destination])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    reason,
    language,
    event,
    contained,
    extension,
    definition,
    implicitRules,
    modifierExtension,
    source,
    focus,
    sender,
    author,
    enterer,
    responsible,
    response,
    destination
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Meta]](meta, t.meta),
      FHIRComponentField[Option[Narrative]](text, t.text),
      FHIRComponentField[Option[CodeableConcept]](reason, t.reason),
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[Coding](event, t.event.toSubRefNonUnion[Coding]),
      FHIRComponentField[LitSeq[Resource]](contained, t.contained),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Canonical]](definition, t.definition),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[MessageHeader.Source](source, t.source),
      FHIRComponentField[LitSeq[Reference]](focus, t.focus),
      FHIRComponentField[Option[Reference]](sender, t.sender),
      FHIRComponentField[Option[Reference]](author, t.author),
      FHIRComponentField[Option[Reference]](enterer, t.enterer),
      FHIRComponentField[Option[Reference]](responsible, t.responsible),
      FHIRComponentField[Option[MessageHeader.Response]](response, t.response),
      FHIRComponentField[LitSeq[MessageHeader.Destination]](destination, t.destination)
    ))
  override def fields(t: UKCore_MessageHeader): Seq[FHIRComponentField[_]]           = fieldsFromParent(t).get
  def extractId(t: UKCore_MessageHeader): Option[String]                             = t.id
  def extractMeta(t: UKCore_MessageHeader): Option[Meta]                             = t.meta
  def extractText(t: UKCore_MessageHeader): Option[Narrative]                        = t.text
  def extractReason(t: UKCore_MessageHeader): Option[CodeableConcept]                = t.reason
  def extractLanguage(t: UKCore_MessageHeader): Option[LANGUAGES]                    = t.language
  def extractEvent(t: UKCore_MessageHeader): Coding                                  = t.event.toSubRefNonUnion[Coding]
  def extractContained(t: UKCore_MessageHeader): LitSeq[Resource]                    = t.contained
  def extractExtension(t: UKCore_MessageHeader): LitSeq[Extension]                   = t.extension
  def extractDefinition(t: UKCore_MessageHeader): Option[Canonical]                  = t.definition
  def extractImplicitRules(t: UKCore_MessageHeader): Option[UriStr]                  = t.implicitRules
  def extractModifierExtension(t: UKCore_MessageHeader): LitSeq[Extension]           = t.modifierExtension
  def extractSource(t: UKCore_MessageHeader): MessageHeader.Source                   = t.source
  def extractFocus(t: UKCore_MessageHeader): LitSeq[Reference]                       = t.focus
  def extractSender(t: UKCore_MessageHeader): Option[Reference]                      = t.sender
  def extractAuthor(t: UKCore_MessageHeader): Option[Reference]                      = t.author
  def extractEnterer(t: UKCore_MessageHeader): Option[Reference]                     = t.enterer
  def extractResponsible(t: UKCore_MessageHeader): Option[Reference]                 = t.responsible
  def extractResponse(t: UKCore_MessageHeader): Option[MessageHeader.Response]       = t.response
  def extractDestination(t: UKCore_MessageHeader): LitSeq[MessageHeader.Destination] = t.destination
  override val thisName: String                                                      = "UKCore_MessageHeader"
  override val searchParams: Map[String, UKCore_MessageHeader => Seq[Any]]           = MessageHeader.searchParams
  def unapply(
      o: UKCore_MessageHeader): Option[(Option[String], Option[Meta], Option[Narrative], Option[CodeableConcept], Option[LANGUAGES], Coding, LitSeq[Resource], LitSeq[Extension], Option[Canonical], Option[UriStr], LitSeq[Extension], MessageHeader.Source, LitSeq[Reference], Option[Reference], Option[Reference], Option[Reference], Option[Reference], Option[MessageHeader.Response], LitSeq[MessageHeader.Destination])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.reason,
        o.language,
        o.event.toSubRefNonUnion[Coding],
        o.contained,
        o.extension,
        o.definition,
        o.implicitRules,
        o.modifierExtension,
        o.source,
        o.focus,
        o.sender,
        o.author,
        o.enterer,
        o.responsible,
        o.response,
        o.destination))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[UKCore_MessageHeader] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new UKCore_MessageHeader(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("reason", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Coding]("eventCoding", None),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Canonical]]("definition", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[MessageHeader.Source]("source", None),
          cursor.decodeAs[LitSeq[Reference]]("focus", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("sender", Some(None)),
          cursor.decodeAs[Option[Reference]]("author", Some(None)),
          cursor.decodeAs[Option[Reference]]("enterer", Some(None)),
          cursor.decodeAs[Option[Reference]]("responsible", Some(None)),
          cursor.decodeAs[Option[MessageHeader.Response]]("response", Some(None)),
          cursor.decodeAs[LitSeq[MessageHeader.Destination]]("destination", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Defines the UK Core constraints and extensions on the MessageHeader resource for the minimal set of data to be present in a
  * message header.
  *
  * Subclass of [[hl7.model.MessageHeader]] (The header for a message exchange that is either requesting or responding to an
  * action. The reference(s) that are the subject of the action as well as other information related to the action are typically
  * transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.)
  *
  * @constructor
  *   Inherits all params from parent. Refines the types of: event.
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
  * @param reason
  *   - Coded indication of the cause for the event - indicates a reason for the occurrence of the event that is a focus of this
  *     message.
  * @param language
  *   - The base language in which the resource is written.
  * @param event
  *   - Code that identifies the event this message represents and connects it with its definition. Events defined as part of the
  *     FHIR specification have the system value "http://terminology.hl7.org/CodeSystem/message-events". Alternatively uri to the
  *     EventDefinition.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *     identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *     of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *     Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *     of the extension.
  * @param definition
  *   - Permanent link to the MessageDefinition for this message.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *     processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *     other profiles etc.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *     the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *     Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *     strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *     extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *     processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of
  *     any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param source
  *   - The source application from which this message originated.
  * @param focus
  *   - The actual data of the message - a reference to the root/focus class of the event.
  * @param sender
  *   - Identifies the sending system to allow the use of a trust relationship.
  * @param author
  *   - The logical author of the message - the person or device that decided the described event should happen. When there is
  *     more than one candidate, pick the most proximal to the MessageHeader. Can provide other authors in extensions.
  * @param enterer
  *   - The person or device that performed the data entry leading to this message. When there is more than one candidate, pick
  *     the most proximal to the message. Can provide other enterers in extensions.
  * @param responsible
  *   - The person or organization that accepts overall responsibility for the contents of the message. The implication is that
  *     the message event happened under the policies of the responsible party.
  * @param response
  *   - Information about the message that this message is a response to. Only present if this message is a response.
  * @param destination
  *   - The destination application which the message is intended for.
  */
@POJOBoilerplate
class UKCore_MessageHeader(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-MessageHeader"))),
    override val text: Option[Narrative] = None,
    override val reason: Option[CodeableConcept] = None,
    override val language: Option[LANGUAGES] = None,
    event: Coding,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val definition: Option[Canonical] = None,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val source: MessageHeader.Source,
    override val focus: LitSeq[Reference] = LitSeq.empty,
    override val sender: Option[Reference] = None,
    override val author: Option[Reference] = None,
    override val enterer: Option[Reference] = None,
    override val responsible: Option[Reference] = None,
    override val response: Option[MessageHeader.Response] = None,
    override val destination: LitSeq[MessageHeader.Destination] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends MessageHeader(
      id = id,
      meta = meta,
      text = text,
      focus = focus,
      sender = sender,
      author = author,
      reason = reason,
      enterer = enterer,
      language = language,
      event = choice(event),
      contained = contained,
      extension = extension,
      definition = definition,
      responsible = responsible,
      implicitRules = implicitRules,
      modifierExtension = modifierExtension,
      source = source,
      response = response,
      destination = destination,
      primitiveAttributes = primitiveAttributes
    ) {
  override val thisTypeName: String = "MessageHeader"
}
