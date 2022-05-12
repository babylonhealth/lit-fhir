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
import com.babylonhealth.lit.hl7.EVENT_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Media extends CompanionFor[Media] {
  implicit def summonObjectAndCompanionMedia389128463(o: Media): ObjectAndCompanion[Media, Media.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Media
  override type ParentType   = Media
  override val baseType: CompanionFor[ResourceType] = Media
  override val parentType: CompanionFor[ParentType] = Media
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Media")
  type CreatedChoice = Choice[UnionDateTimeOrPeriod]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      `type`: Option[CodeableConcept] = None,
      view: Option[CodeableConcept] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      width: Option[PositiveInt] = None,
      partOf: LitSeq[Reference] = LitSeq.empty,
      status: EVENT_STATUS,
      issued: Option[ZonedDateTime] = None,
      device: Option[Reference] = None,
      height: Option[PositiveInt] = None,
      frames: Option[PositiveInt] = None,
      basedOn: LitSeq[Reference] = LitSeq.empty,
      subject: Option[Reference] = None,
      content: Attachment,
      language: Option[LANGUAGES] = None,
      modality: Option[CodeableConcept] = None,
      operator: Option[Reference] = None,
      bodySite: Option[CodeableConcept] = None,
      duration: Option[BigDecimal] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      encounter: Option[Reference] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      created: Option[Media.CreatedChoice] = None,
      reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
      deviceName: Option[String] = None,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Media = new Media(
    id,
    meta,
    text,
    `type`,
    view,
    note,
    width,
    partOf,
    status,
    issued,
    device,
    height,
    frames,
    basedOn,
    subject,
    content,
    language,
    modality,
    operator,
    bodySite,
    duration,
    contained,
    extension,
    encounter,
    identifier,
    created,
    reasonCode,
    deviceName,
    implicitRules,
    modifierExtension,
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
  val view: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("view", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val width: FHIRComponentFieldMeta[Option[PositiveInt]] =
    FHIRComponentFieldMeta("width", lTagOf[Option[PositiveInt]], false, lTagOf[PositiveInt])
  val partOf: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("partOf", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val status: FHIRComponentFieldMeta[EVENT_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[EVENT_STATUS], false, lTagOf[EVENT_STATUS])
  val issued: FHIRComponentFieldMeta[Option[ZonedDateTime]] =
    FHIRComponentFieldMeta("issued", lTagOf[Option[ZonedDateTime]], false, lTagOf[ZonedDateTime])
  val device: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("device", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val height: FHIRComponentFieldMeta[Option[PositiveInt]] =
    FHIRComponentFieldMeta("height", lTagOf[Option[PositiveInt]], false, lTagOf[PositiveInt])
  val frames: FHIRComponentFieldMeta[Option[PositiveInt]] =
    FHIRComponentFieldMeta("frames", lTagOf[Option[PositiveInt]], false, lTagOf[PositiveInt])
  val basedOn: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("basedOn", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val subject: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("subject", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val content: FHIRComponentFieldMeta[Attachment] =
    FHIRComponentFieldMeta("content", lTagOf[Attachment], false, lTagOf[Attachment])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val modality: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("modality", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val operator: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("operator", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val bodySite: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("bodySite", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val duration: FHIRComponentFieldMeta[Option[BigDecimal]] =
    FHIRComponentFieldMeta("duration", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val encounter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("encounter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val created: FHIRComponentFieldMeta[Option[Media.CreatedChoice]] =
    FHIRComponentFieldMeta("created", lTagOf[Option[Media.CreatedChoice]], true, lTagOf[UnionDateTimeOrPeriod])
  val reasonCode: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("reasonCode", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val deviceName: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("deviceName", lTagOf[Option[String]], false, lTagOf[String])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    `type`,
    view,
    note,
    width,
    partOf,
    status,
    issued,
    device,
    height,
    frames,
    basedOn,
    subject,
    content,
    language,
    modality,
    operator,
    bodySite,
    duration,
    contained,
    extension,
    encounter,
    identifier,
    created,
    reasonCode,
    deviceName,
    implicitRules,
    modifierExtension
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Media): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
    FHIRComponentField[Option[CodeableConcept]](view, t.view),
    FHIRComponentField[LitSeq[Annotation]](note, t.note),
    FHIRComponentField[Option[PositiveInt]](width, t.width),
    FHIRComponentField[LitSeq[Reference]](partOf, t.partOf),
    FHIRComponentField[EVENT_STATUS](status, t.status),
    FHIRComponentField[Option[ZonedDateTime]](issued, t.issued),
    FHIRComponentField[Option[Reference]](device, t.device),
    FHIRComponentField[Option[PositiveInt]](height, t.height),
    FHIRComponentField[Option[PositiveInt]](frames, t.frames),
    FHIRComponentField[LitSeq[Reference]](basedOn, t.basedOn),
    FHIRComponentField[Option[Reference]](subject, t.subject),
    FHIRComponentField[Attachment](content, t.content),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Option[CodeableConcept]](modality, t.modality),
    FHIRComponentField[Option[Reference]](operator, t.operator),
    FHIRComponentField[Option[CodeableConcept]](bodySite, t.bodySite),
    FHIRComponentField[Option[BigDecimal]](duration, t.duration),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Reference]](encounter, t.encounter),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[Media.CreatedChoice]](created, t.created),
    FHIRComponentField[LitSeq[CodeableConcept]](reasonCode, t.reasonCode),
    FHIRComponentField[Option[String]](deviceName, t.deviceName),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
  )
  def extractId(t: Media): Option[String]                   = t.id
  def extractMeta(t: Media): Option[Meta]                   = t.meta
  def extractText(t: Media): Option[Narrative]              = t.text
  def extractType(t: Media): Option[CodeableConcept]        = t.`type`
  def extractView(t: Media): Option[CodeableConcept]        = t.view
  def extractNote(t: Media): LitSeq[Annotation]             = t.note
  def extractWidth(t: Media): Option[PositiveInt]           = t.width
  def extractPartOf(t: Media): LitSeq[Reference]            = t.partOf
  def extractStatus(t: Media): EVENT_STATUS                 = t.status
  def extractIssued(t: Media): Option[ZonedDateTime]        = t.issued
  def extractDevice(t: Media): Option[Reference]            = t.device
  def extractHeight(t: Media): Option[PositiveInt]          = t.height
  def extractFrames(t: Media): Option[PositiveInt]          = t.frames
  def extractBasedOn(t: Media): LitSeq[Reference]           = t.basedOn
  def extractSubject(t: Media): Option[Reference]           = t.subject
  def extractContent(t: Media): Attachment                  = t.content
  def extractLanguage(t: Media): Option[LANGUAGES]          = t.language
  def extractModality(t: Media): Option[CodeableConcept]    = t.modality
  def extractOperator(t: Media): Option[Reference]          = t.operator
  def extractBodySite(t: Media): Option[CodeableConcept]    = t.bodySite
  def extractDuration(t: Media): Option[BigDecimal]         = t.duration
  def extractContained(t: Media): LitSeq[Resource]          = t.contained
  def extractExtension(t: Media): LitSeq[Extension]         = t.extension
  def extractEncounter(t: Media): Option[Reference]         = t.encounter
  def extractIdentifier(t: Media): LitSeq[Identifier]       = t.identifier
  def extractCreated(t: Media): Option[Media.CreatedChoice] = t.created
  def extractReasonCode(t: Media): LitSeq[CodeableConcept]  = t.reasonCode
  def extractDeviceName(t: Media): Option[String]           = t.deviceName
  def extractImplicitRules(t: Media): Option[UriStr]        = t.implicitRules
  def extractModifierExtension(t: Media): LitSeq[Extension] = t.modifierExtension
  override val thisName: String                             = "Media"
  override val searchParams: Map[String, Media => Seq[Any]] = Map(
    "subject"    -> (obj => obj.subject.toSeq),
    "identifier" -> (obj => obj.identifier.toSeq),
    "site"       -> (obj => obj.bodySite.toSeq),
    "type"       -> (obj => obj.`type`.toSeq),
    "based-on"   -> (obj => obj.basedOn.toSeq),
    "encounter"  -> (obj => obj.encounter.toSeq),
    "device"     -> (obj => obj.device.toSeq),
    "operator"   -> (obj => obj.operator.toSeq),
    "status"     -> (obj => Seq(obj.status)),
    "modality"   -> (obj => obj.modality.toSeq),
    "created"    -> (obj => obj.created.toSeq),
    "view"       -> (obj => obj.view.toSeq),
    "patient"    -> (obj => obj.subject.filter(_.reference.exists(_.contains("Patient/"))).toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Media] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Media(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("view", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[Option[PositiveInt]]("width", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("partOf", Some(LitSeq.empty)),
          cursor.decodeAs[EVENT_STATUS]("status", None),
          cursor.decodeAs[Option[ZonedDateTime]]("issued", Some(None)),
          cursor.decodeAs[Option[Reference]]("device", Some(None)),
          cursor.decodeAs[Option[PositiveInt]]("height", Some(None)),
          cursor.decodeAs[Option[PositiveInt]]("frames", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("basedOn", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("subject", Some(None)),
          cursor.decodeAs[Attachment]("content", None),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("modality", Some(None)),
          cursor.decodeAs[Option[Reference]]("operator", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("bodySite", Some(None)),
          cursor.decodeAs[Option[BigDecimal]]("duration", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeOptRef[UnionDateTimeOrPeriod]("created"),
          cursor.decodeAs[LitSeq[CodeableConcept]]("reasonCode", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("deviceName", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** A photo, video, or audio recording acquired or used in healthcare. The actual content may be inline or provided by direct
  * reference.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields `type`, view, note, width, partOf, status, issued, device, height, frames, basedOn, subject, content,
  *   modality, operator, bodySite, duration, encounter, identifier, created, reasonCode, deviceName.
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
  *   - A code that classifies whether the media is an image, video or audio recording or some other media category.
  * @param view
  *   - The name of the imaging view e.g. Lateral or Antero-posterior (AP).
  * @param note
  *   - Comments made about the media by the performer, subject or other participants.
  * @param width
  *   - Width of the image in pixels (photo/video).
  * @param partOf
  *   - A larger event of which this particular event is a component or step.
  * @param status
  *   - The current state of the {{title}}.
  * @param issued
  *   - The date and time this version of the media was made available to providers, typically after having been reviewed.
  * @param device
  *   - The device used to collect the media.
  * @param height
  *   - Height of the image in pixels (photo/video).
  * @param frames
  *   - The number of frames in a photo. This is used with a multi-page fax, or an imaging acquisition context that takes
  *   multiple slices in a single image, or an animated gif. If there is more than one frame, this SHALL have a value in order to
  *   alert interface software that a multi-frame capable rendering widget is required.
  * @param basedOn
  *   - A procedure that is fulfilled in whole or in part by the creation of this media.
  * @param subject
  *   - Who/What this Media is a record of.
  * @param content
  *   - The actual content of the media - inline or by direct reference to the media source file.
  * @param language
  *   - The base language in which the resource is written.
  * @param modality
  *   - Details of the type of the media - usually, how it was acquired (what type of device). If images sourced from a DICOM
  *   system, are wrapped in a Media resource, then this is the modality.
  * @param operator
  *   - The person who administered the collection of the image.
  * @param bodySite
  *   - Indicates the site on the subject's body where the observation was made (i.e. the target site).
  * @param duration
  *   - The duration of the recording in seconds - for audio and video.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param encounter
  *   - The encounter that establishes the context for this media.
  * @param identifier
  *   - Identifiers associated with the image - these may include identifiers for the image itself, identifiers for the context
  *   of its collection (e.g. series ids) and context ids such as accession numbers or other workflow identifiers.
  * @param created
  *   - The date and time(s) at which the media was collected.
  * @param reasonCode
  *   - Describes why the event occurred in coded or textual form.
  * @param deviceName
  *   - The name of the device / manufacturer of the device that was used to make the recording.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that
  *   modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *   Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *   strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *   extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *   processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any
  *   elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  */
@POJOBoilerplate
class Media(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val `type`: Option[CodeableConcept] = None,
    val view: Option[CodeableConcept] = None,
    val note: LitSeq[Annotation] = LitSeq.empty,
    val width: Option[PositiveInt] = None,
    val partOf: LitSeq[Reference] = LitSeq.empty,
    val status: EVENT_STATUS,
    val issued: Option[ZonedDateTime] = None,
    val device: Option[Reference] = None,
    val height: Option[PositiveInt] = None,
    val frames: Option[PositiveInt] = None,
    val basedOn: LitSeq[Reference] = LitSeq.empty,
    val subject: Option[Reference] = None,
    val content: Attachment,
    override val language: Option[LANGUAGES] = None,
    val modality: Option[CodeableConcept] = None,
    val operator: Option[Reference] = None,
    val bodySite: Option[CodeableConcept] = None,
    val duration: Option[BigDecimal] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val encounter: Option[Reference] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val created: Option[Media.CreatedChoice] = None,
    val reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
    val deviceName: Option[String] = None,
    override val implicitRules: Option[UriStr] = None,
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
  override val thisTypeName: String = "Media"
}
