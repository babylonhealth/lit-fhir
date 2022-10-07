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
import com.babylonhealth.lit.hl7.SPECIMEN_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, ukcore }
import com.babylonhealth.lit.macros.POJOBoilerplate

object UKCore_Specimen extends CompanionFor[UKCore_Specimen] {
  implicit def summonObjectAndCompanionUKCore_Specimen36390327(
      o: UKCore_Specimen): ObjectAndCompanion[UKCore_Specimen, UKCore_Specimen.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Specimen
  override type ParentType   = Specimen
  override val baseType: CompanionFor[ResourceType] = Specimen
  override val parentType: CompanionFor[ParentType] = Specimen
  override val profileUrl: Option[String]           = Some("https://fhir.hl7.org.uk/StructureDefinition/UKCore-Specimen")
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-Specimen"))),
      text: Option[Narrative] = None,
      status: Option[SPECIMEN_STATUS] = None,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      condition: LitSeq[CodeableConcept] = LitSeq.empty,
      receivedTime: Option[FHIRDateTime] = None,
      implicitRules: Option[UriStr] = None,
      `type`: Option[CodeableConcept] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      parent: LitSeq[Reference] = LitSeq.empty,
      subject: Option[Reference] = None,
      request: LitSeq[Reference] = LitSeq.empty,
      accessionIdentifier: Option[Identifier] = None,
      container: LitSeq[Specimen.Container] = LitSeq.empty,
      processing: LitSeq[Specimen.Processing] = LitSeq.empty,
      collection: Option[Specimen.Collection] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): UKCore_Specimen = new UKCore_Specimen(
    id,
    meta,
    text,
    status,
    language,
    contained,
    extension,
    condition,
    receivedTime,
    implicitRules,
    `type`,
    note,
    modifierExtension,
    identifier,
    parent,
    subject,
    request,
    accessionIdentifier,
    container,
    processing,
    collection,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val status: FHIRComponentFieldMeta[Option[SPECIMEN_STATUS]] =
    FHIRComponentFieldMeta("status", lTagOf[Option[SPECIMEN_STATUS]], false, lTagOf[SPECIMEN_STATUS])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val condition: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("condition", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val receivedTime: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("receivedTime", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val parent: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("parent", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val subject: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("subject", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val request: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("request", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val accessionIdentifier: FHIRComponentFieldMeta[Option[Identifier]] =
    FHIRComponentFieldMeta("accessionIdentifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
  val container: FHIRComponentFieldMeta[LitSeq[Specimen.Container]] =
    FHIRComponentFieldMeta("container", lTagOf[LitSeq[Specimen.Container]], false, lTagOf[Specimen.Container])
  val processing: FHIRComponentFieldMeta[LitSeq[Specimen.Processing]] =
    FHIRComponentFieldMeta("processing", lTagOf[LitSeq[Specimen.Processing]], false, lTagOf[Specimen.Processing])
  val collection: FHIRComponentFieldMeta[Option[Specimen.Collection]] =
    FHIRComponentFieldMeta("collection", lTagOf[Option[Specimen.Collection]], false, lTagOf[Specimen.Collection])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    status,
    language,
    contained,
    extension,
    condition,
    receivedTime,
    implicitRules,
    `type`,
    note,
    modifierExtension,
    identifier,
    parent,
    subject,
    request,
    accessionIdentifier,
    container,
    processing,
    collection
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Meta]](meta, t.meta),
      FHIRComponentField[Option[Narrative]](text, t.text),
      FHIRComponentField[Option[SPECIMEN_STATUS]](status, t.status),
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[LitSeq[Resource]](contained, t.contained),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[CodeableConcept]](condition, t.condition),
      FHIRComponentField[Option[FHIRDateTime]](receivedTime, t.receivedTime),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[LitSeq[Annotation]](note, t.note),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
      FHIRComponentField[LitSeq[Reference]](parent, t.parent),
      FHIRComponentField[Option[Reference]](subject, t.subject),
      FHIRComponentField[LitSeq[Reference]](request, t.request),
      FHIRComponentField[Option[Identifier]](accessionIdentifier, t.accessionIdentifier),
      FHIRComponentField[LitSeq[Specimen.Container]](container, t.container),
      FHIRComponentField[LitSeq[Specimen.Processing]](processing, t.processing),
      FHIRComponentField[Option[Specimen.Collection]](collection, t.collection)
    ))
  override def fields(t: UKCore_Specimen): Seq[FHIRComponentField[_]]    = fieldsFromParent(t).get
  def extractId(t: UKCore_Specimen): Option[String]                      = t.id
  def extractMeta(t: UKCore_Specimen): Option[Meta]                      = t.meta
  def extractText(t: UKCore_Specimen): Option[Narrative]                 = t.text
  def extractStatus(t: UKCore_Specimen): Option[SPECIMEN_STATUS]         = t.status
  def extractLanguage(t: UKCore_Specimen): Option[LANGUAGES]             = t.language
  def extractContained(t: UKCore_Specimen): LitSeq[Resource]             = t.contained
  def extractExtension(t: UKCore_Specimen): LitSeq[Extension]            = t.extension
  def extractCondition(t: UKCore_Specimen): LitSeq[CodeableConcept]      = t.condition
  def extractReceivedTime(t: UKCore_Specimen): Option[FHIRDateTime]      = t.receivedTime
  def extractImplicitRules(t: UKCore_Specimen): Option[UriStr]           = t.implicitRules
  def extractType(t: UKCore_Specimen): Option[CodeableConcept]           = t.`type`
  def extractNote(t: UKCore_Specimen): LitSeq[Annotation]                = t.note
  def extractModifierExtension(t: UKCore_Specimen): LitSeq[Extension]    = t.modifierExtension
  def extractIdentifier(t: UKCore_Specimen): LitSeq[Identifier]          = t.identifier
  def extractParent(t: UKCore_Specimen): LitSeq[Reference]               = t.parent
  def extractSubject(t: UKCore_Specimen): Option[Reference]              = t.subject
  def extractRequest(t: UKCore_Specimen): LitSeq[Reference]              = t.request
  def extractAccessionIdentifier(t: UKCore_Specimen): Option[Identifier] = t.accessionIdentifier
  def extractContainer(t: UKCore_Specimen): LitSeq[Specimen.Container]   = t.container
  def extractProcessing(t: UKCore_Specimen): LitSeq[Specimen.Processing] = t.processing
  def extractCollection(t: UKCore_Specimen): Option[Specimen.Collection] = t.collection
  override val thisName: String                                          = "UKCore_Specimen"
  override val searchParams: Map[String, UKCore_Specimen => Seq[Any]]    = Specimen.searchParams
  def unapply(
      o: UKCore_Specimen): Option[(Option[String], Option[Meta], Option[Narrative], Option[SPECIMEN_STATUS], Option[LANGUAGES], LitSeq[Resource], LitSeq[Extension], LitSeq[CodeableConcept], Option[FHIRDateTime], Option[UriStr], Option[CodeableConcept], LitSeq[Annotation], LitSeq[Extension], LitSeq[Identifier], LitSeq[Reference], Option[Reference], LitSeq[Reference], Option[Identifier], LitSeq[Specimen.Container], LitSeq[Specimen.Processing], Option[Specimen.Collection])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.status,
        o.language,
        o.contained,
        o.extension,
        o.condition,
        o.receivedTime,
        o.implicitRules,
        o.`type`,
        o.note,
        o.modifierExtension,
        o.identifier,
        o.parent,
        o.subject,
        o.request,
        o.accessionIdentifier,
        o.container,
        o.processing,
        o.collection))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[UKCore_Specimen] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new UKCore_Specimen(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[SPECIMEN_STATUS]]("status", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("condition", Some(LitSeq.empty)),
          cursor.decodeAs[Option[FHIRDateTime]]("receivedTime", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("parent", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("subject", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("request", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Identifier]]("accessionIdentifier", Some(None)),
          cursor.decodeAs[LitSeq[Specimen.Container]]("container", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Specimen.Processing]]("processing", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Specimen.Collection]]("collection", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** Defines the UK Core constraints and extensions on the Specimen resource for the minimal set of data to query and retrieve
  * specimen information.
  *
  * Subclass of [[hl7.model.Specimen]] (A sample to be used for analysis.)
  *
  * @constructor
  *   Inherits all params from parent.
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
  * @param status
  *   - The availability of the specimen.
  * @param language
  *   - The base language in which the resource is written.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *     identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *     of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *     Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *     of the extension.
  * @param condition
  *   - A mode or state of being that describes the nature of the specimen.
  * @param receivedTime
  *   - Time when specimen was received for processing or testing.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *     processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *     other profiles etc.
  * @param `type`
  *   - The kind of material that forms the specimen.
  * @param note
  *   - To communicate any details or issues about the specimen or during the specimen collection. (for example: broken vial, sent
  *     with patient, frozen).
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *     the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *     Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *     strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *     extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *     processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of
  *     any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param identifier
  *   - Id for specimen.
  * @param parent
  *   - Reference to the parent (source) specimen which is used when the specimen was either derived from or a component of
  *     another specimen.
  * @param subject
  *   - Where the specimen came from. This may be from patient(s), from a location (e.g., the source of an environmental sample),
  *     or a sampling of a substance or a device.
  * @param request
  *   - Details concerning a service request that required a specimen to be collected.
  * @param accessionIdentifier
  *   - The identifier assigned by the lab when accessioning specimen(s). This is not necessarily the same as the specimen
  *     identifier, depending on local lab procedures.
  * @param container
  *   - The container holding the specimen. The recursive nature of containers; i.e. blood in tube in tray in rack is not
  *     addressed here.
  * @param processing
  *   - Details concerning processing and processing steps for the specimen.
  * @param collection
  *   - Details concerning the specimen collection.
  */
@POJOBoilerplate
class UKCore_Specimen(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-Specimen"))),
    override val text: Option[Narrative] = None,
    override val status: Option[SPECIMEN_STATUS] = None,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val condition: LitSeq[CodeableConcept] = LitSeq.empty,
    override val receivedTime: Option[FHIRDateTime] = None,
    override val implicitRules: Option[UriStr] = None,
    override val `type`: Option[CodeableConcept] = None,
    override val note: LitSeq[Annotation] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val parent: LitSeq[Reference] = LitSeq.empty,
    override val subject: Option[Reference] = None,
    override val request: LitSeq[Reference] = LitSeq.empty,
    override val accessionIdentifier: Option[Identifier] = None,
    override val container: LitSeq[Specimen.Container] = LitSeq.empty,
    override val processing: LitSeq[Specimen.Processing] = LitSeq.empty,
    override val collection: Option[Specimen.Collection] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Specimen(
      id = id,
      meta = meta,
      text = text,
      `type` = `type`,
      note = note,
      status = status,
      parent = parent,
      subject = subject,
      request = request,
      language = language,
      contained = contained,
      extension = extension,
      condition = condition,
      identifier = identifier,
      receivedTime = receivedTime,
      implicitRules = implicitRules,
      modifierExtension = modifierExtension,
      accessionIdentifier = accessionIdentifier,
      container = container,
      collection = collection,
      processing = processing,
      primitiveAttributes = primitiveAttributes
    ) {
  override val thisTypeName: String = "Specimen"
}
