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
import com.babylonhealth.lit.hl7.{ LIST_STATUS, LIST_MODE }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, ukcore }
import com.babylonhealth.lit.macros.POJOBoilerplate

object UKCore_List extends CompanionFor[UKCore_List] {
  implicit def summonObjectAndCompanionUKCore_List464626381(o: UKCore_List): ObjectAndCompanion[UKCore_List, UKCore_List.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = FHIRList
  override type ParentType   = FHIRList
  override val baseType: CompanionFor[ResourceType] = FHIRList
  override val parentType: CompanionFor[ParentType] = FHIRList
  override val profileUrl: Option[String]           = Some("https://fhir.hl7.org.uk/StructureDefinition/UKCore-List")
  def apply(
      id: Option[String] = None,
      text: Option[Narrative] = None,
      mode: LIST_MODE,
      date: Option[FHIRDateTime] = None,
      title: Option[String] = None,
      status: LIST_STATUS,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      code: Option[CodeableConcept] = None,
      meta: Option[Meta] = Some(new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-List"))),
      orderedBy: Option[CodeableConcept] = None,
      emptyReason: Option[CodeableConcept] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      source: Option[Reference] = None,
      subject: Option[Reference] = None,
      encounter: Option[Reference] = None,
      entry: LitSeq[FHIRList.Entry] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): UKCore_List = new UKCore_List(
    id,
    text,
    mode,
    date,
    title,
    status,
    language,
    contained,
    extension,
    implicitRules,
    note,
    modifierExtension,
    code,
    meta,
    orderedBy,
    emptyReason,
    identifier,
    source,
    subject,
    encounter,
    entry,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val mode: FHIRComponentFieldMeta[LIST_MODE] =
    FHIRComponentFieldMeta("mode", lTagOf[LIST_MODE], false, lTagOf[LIST_MODE])
  val date: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("date", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val title: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("title", lTagOf[Option[String]], false, lTagOf[String])
  val status: FHIRComponentFieldMeta[LIST_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[LIST_STATUS], false, lTagOf[LIST_STATUS])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val code: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("code", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val orderedBy: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("orderedBy", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val emptyReason: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("emptyReason", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val source: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("source", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val subject: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("subject", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val encounter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("encounter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val entry: FHIRComponentFieldMeta[LitSeq[FHIRList.Entry]] =
    FHIRComponentFieldMeta("entry", lTagOf[LitSeq[FHIRList.Entry]], false, lTagOf[FHIRList.Entry])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    text,
    mode,
    date,
    title,
    status,
    language,
    contained,
    extension,
    implicitRules,
    note,
    modifierExtension,
    code,
    meta,
    orderedBy,
    emptyReason,
    identifier,
    source,
    subject,
    encounter,
    entry
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Narrative]](text, t.text),
      FHIRComponentField[LIST_MODE](mode, t.mode),
      FHIRComponentField[Option[FHIRDateTime]](date, t.date),
      FHIRComponentField[Option[String]](title, t.title),
      FHIRComponentField[LIST_STATUS](status, t.status),
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[LitSeq[Resource]](contained, t.contained),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[LitSeq[Annotation]](note, t.note),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[CodeableConcept]](code, t.code),
      FHIRComponentField[Option[Meta]](meta, t.meta),
      FHIRComponentField[Option[CodeableConcept]](orderedBy, t.orderedBy),
      FHIRComponentField[Option[CodeableConcept]](emptyReason, t.emptyReason),
      FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
      FHIRComponentField[Option[Reference]](source, t.source),
      FHIRComponentField[Option[Reference]](subject, t.subject),
      FHIRComponentField[Option[Reference]](encounter, t.encounter),
      FHIRComponentField[LitSeq[FHIRList.Entry]](entry, t.entry)
    ))
  override def fields(t: UKCore_List): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: UKCore_List): Option[String]                   = t.id
  def extractText(t: UKCore_List): Option[Narrative]              = t.text
  def extractMode(t: UKCore_List): LIST_MODE                      = t.mode
  def extractDate(t: UKCore_List): Option[FHIRDateTime]           = t.date
  def extractTitle(t: UKCore_List): Option[String]                = t.title
  def extractStatus(t: UKCore_List): LIST_STATUS                  = t.status
  def extractLanguage(t: UKCore_List): Option[LANGUAGES]          = t.language
  def extractContained(t: UKCore_List): LitSeq[Resource]          = t.contained
  def extractExtension(t: UKCore_List): LitSeq[Extension]         = t.extension
  def extractImplicitRules(t: UKCore_List): Option[UriStr]        = t.implicitRules
  def extractNote(t: UKCore_List): LitSeq[Annotation]             = t.note
  def extractModifierExtension(t: UKCore_List): LitSeq[Extension] = t.modifierExtension
  def extractCode(t: UKCore_List): Option[CodeableConcept]        = t.code
  def extractMeta(t: UKCore_List): Option[Meta]                   = t.meta
  def extractOrderedBy(t: UKCore_List): Option[CodeableConcept]   = t.orderedBy
  def extractEmptyReason(t: UKCore_List): Option[CodeableConcept] = t.emptyReason
  def extractIdentifier(t: UKCore_List): LitSeq[Identifier]       = t.identifier
  def extractSource(t: UKCore_List): Option[Reference]            = t.source
  def extractSubject(t: UKCore_List): Option[Reference]           = t.subject
  def extractEncounter(t: UKCore_List): Option[Reference]         = t.encounter
  def extractEntry(t: UKCore_List): LitSeq[FHIRList.Entry]        = t.entry
  override val thisName: String                                   = "UKCore_List"
  override val searchParams: Map[String, UKCore_List => Seq[Any]] = FHIRList.searchParams
  def unapply(
      o: UKCore_List): Option[(Option[String], Option[Narrative], LIST_MODE, Option[FHIRDateTime], Option[String], LIST_STATUS, Option[LANGUAGES], LitSeq[Resource], LitSeq[Extension], Option[UriStr], LitSeq[Annotation], LitSeq[Extension], Option[CodeableConcept], Option[Meta], Option[CodeableConcept], Option[CodeableConcept], LitSeq[Identifier], Option[Reference], Option[Reference], Option[Reference], LitSeq[FHIRList.Entry])] =
    Some(
      (
        o.id,
        o.text,
        o.mode,
        o.date,
        o.title,
        o.status,
        o.language,
        o.contained,
        o.extension,
        o.implicitRules,
        o.note,
        o.modifierExtension,
        o.code,
        o.meta,
        o.orderedBy,
        o.emptyReason,
        o.identifier,
        o.source,
        o.subject,
        o.encounter,
        o.entry))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[UKCore_List] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new UKCore_List(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[LIST_MODE]("mode", None),
          cursor.decodeAs[Option[FHIRDateTime]]("date", Some(None)),
          cursor.decodeAs[Option[String]]("title", Some(None)),
          cursor.decodeAs[LIST_STATUS]("status", None),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("code", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("orderedBy", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("emptyReason", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("source", Some(None)),
          cursor.decodeAs[Option[Reference]]("subject", Some(None)),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          cursor.decodeAs[LitSeq[FHIRList.Entry]]("entry", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Defines the UK Core constraints and extensions on the List resource for the minimal set of data to query and retrieve a list
  * of information.
  *
  * Subclass of [[hl7.model.FHIRList]] (A list is a curated collection of resources.)
  *
  * @constructor
  *   Inherits all params from parent.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *     resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail
  *     to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should
  *     be represented in the narrative to ensure clinical safety.
  * @param mode
  *   - How this list was prepared - whether it is a working list that is suitable for being maintained on an ongoing basis, or if
  *     it represents a snapshot of a list of items from another source, or whether it is a prepared list where items may be
  *     marked as added, modified or deleted.
  * @param date
  *   - The date that the list was prepared.
  * @param title
  *   - A label for the list assigned by the author.
  * @param status
  *   - Indicates the current state of this list.
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
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *     processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *     other profiles etc.
  * @param note
  *   - Comments that apply to the overall list.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *     the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *     Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *     strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *     extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *     processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of
  *     any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param code
  *   - This code defines the purpose of the list - why it was created.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *     not always be associated with version changes to the resource.
  * @param orderedBy
  *   - What order applies to the items in the list.
  * @param emptyReason
  *   - If the list is empty, why the list is empty.
  * @param identifier
  *   - Identifier for the List assigned for business purposes outside the context of FHIR.
  * @param source
  *   - The entity responsible for deciding what the contents of the list were. Where the list was created by a human, this is the
  *     same as the author of the list.
  * @param subject
  *   - The common subject (or patient) of the resources that are in the list if there is one.
  * @param encounter
  *   - The encounter that is the context in which this list was created.
  * @param entry
  *   - Entries in this list.
  */
@POJOBoilerplate
class UKCore_List(
    override val id: Option[String] = None,
    override val text: Option[Narrative] = None,
    override val mode: LIST_MODE,
    override val date: Option[FHIRDateTime] = None,
    override val title: Option[String] = None,
    override val status: LIST_STATUS,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    override val note: LitSeq[Annotation] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val code: Option[CodeableConcept] = None,
    override val meta: Option[Meta] = Some(new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-List"))),
    override val orderedBy: Option[CodeableConcept] = None,
    override val emptyReason: Option[CodeableConcept] = None,
    override val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val source: Option[Reference] = None,
    override val subject: Option[Reference] = None,
    override val encounter: Option[Reference] = None,
    override val entry: LitSeq[FHIRList.Entry] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends FHIRList(
      id = id,
      meta = meta,
      text = text,
      mode = mode,
      code = code,
      date = date,
      note = note,
      title = title,
      status = status,
      source = source,
      subject = subject,
      language = language,
      contained = contained,
      extension = extension,
      encounter = encounter,
      orderedBy = orderedBy,
      identifier = identifier,
      emptyReason = emptyReason,
      implicitRules = implicitRules,
      modifierExtension = modifierExtension,
      entry = entry,
      primitiveAttributes = primitiveAttributes
    ) {
  override val thisTypeName: String = "List"
}
