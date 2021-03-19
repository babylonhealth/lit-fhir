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
import com.babylonhealth.lit.hl7.{ LIST_STATUS, LIST_MODE }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object FHIRList extends CompanionFor[FHIRList] {
  override type ResourceType = FHIRList
  override val baseType: CompanionFor[ResourceType] = FHIRList
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/List")
  object Entry extends CompanionFor[Entry] {
    override type ResourceType = Entry
    def apply(
        id: Option[String] = None,
        flag: Option[CodeableConcept] = None,
        date: Option[FHIRDateTime] = None,
        item: Reference,
        deleted: Option[Boolean] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Entry = new Entry(
      id,
      flag,
      date,
      item,
      deleted,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Entry): Option[(Option[String], Option[CodeableConcept], Option[FHIRDateTime], Reference, Option[Boolean], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.flag, o.date, o.item, o.deleted, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val flag: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("flag", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val date: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
      FHIRComponentFieldMeta("date", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
    val item: FHIRComponentFieldMeta[Reference] =
      FHIRComponentFieldMeta("item", lTagOf[Reference], false, lTagOf[Reference])
    val deleted: FHIRComponentFieldMeta[Option[Boolean]] =
      FHIRComponentFieldMeta("deleted", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, flag, date, item, deleted, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Entry): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](flag, t.flag),
      FHIRComponentField[Option[FHIRDateTime]](date, t.date),
      FHIRComponentField[Reference](item, t.item),
      FHIRComponentField[Option[Boolean]](deleted, t.deleted),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Entry] = this
    val thisName: String              = "Entry"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Entry] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Entry(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("flag", Some(None)),
            cursor.decodeAs[Option[FHIRDateTime]]("date", Some(None)),
            cursor.decodeAs[Reference]("item", None),
            cursor.decodeAs[Option[Boolean]]("deleted", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Entry(
      override val id: Option[String] = None,
      val flag: Option[CodeableConcept] = None,
      val date: Option[FHIRDateTime] = None,
      val item: Reference,
      val deleted: Option[Boolean] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      mode: LIST_MODE,
      code: Option[CodeableConcept] = None,
      date: Option[FHIRDateTime] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      title: Option[String] = None,
      status: LIST_STATUS,
      source: Option[Reference] = None,
      subject: Option[Reference] = None,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      encounter: Option[Reference] = None,
      orderedBy: Option[CodeableConcept] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      emptyReason: Option[CodeableConcept] = None,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      entry: LitSeq[FHIRList.Entry] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): FHIRList = new FHIRList(
    id,
    meta,
    text,
    mode,
    code,
    date,
    note,
    title,
    status,
    source,
    subject,
    language,
    contained,
    extension,
    encounter,
    orderedBy,
    identifier,
    emptyReason,
    implicitRules,
    modifierExtension,
    entry,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val mode: FHIRComponentFieldMeta[LIST_MODE] =
    FHIRComponentFieldMeta("mode", lTagOf[LIST_MODE], false, lTagOf[LIST_MODE])
  val code: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("code", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val date: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("date", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val title: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("title", lTagOf[Option[String]], false, lTagOf[String])
  val status: FHIRComponentFieldMeta[LIST_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[LIST_STATUS], false, lTagOf[LIST_STATUS])
  val source: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("source", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val subject: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("subject", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val encounter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("encounter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val orderedBy: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("orderedBy", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val emptyReason: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("emptyReason", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val entry: FHIRComponentFieldMeta[LitSeq[FHIRList.Entry]] =
    FHIRComponentFieldMeta("entry", lTagOf[LitSeq[FHIRList.Entry]], false, lTagOf[FHIRList.Entry])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    mode,
    code,
    date,
    note,
    title,
    status,
    source,
    subject,
    language,
    contained,
    extension,
    encounter,
    orderedBy,
    identifier,
    emptyReason,
    implicitRules,
    modifierExtension,
    entry
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: FHIRList): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[LIST_MODE](mode, t.mode),
    FHIRComponentField[Option[CodeableConcept]](code, t.code),
    FHIRComponentField[Option[FHIRDateTime]](date, t.date),
    FHIRComponentField[LitSeq[Annotation]](note, t.note),
    FHIRComponentField[Option[String]](title, t.title),
    FHIRComponentField[LIST_STATUS](status, t.status),
    FHIRComponentField[Option[Reference]](source, t.source),
    FHIRComponentField[Option[Reference]](subject, t.subject),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Reference]](encounter, t.encounter),
    FHIRComponentField[Option[CodeableConcept]](orderedBy, t.orderedBy),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[CodeableConcept]](emptyReason, t.emptyReason),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[FHIRList.Entry]](entry, t.entry)
  )
  def extractId(t: FHIRList): Option[String]                   = t.id
  def extractMeta(t: FHIRList): Option[Meta]                   = t.meta
  def extractText(t: FHIRList): Option[Narrative]              = t.text
  def extractMode(t: FHIRList): LIST_MODE                      = t.mode
  def extractCode(t: FHIRList): Option[CodeableConcept]        = t.code
  def extractDate(t: FHIRList): Option[FHIRDateTime]           = t.date
  def extractNote(t: FHIRList): LitSeq[Annotation]             = t.note
  def extractTitle(t: FHIRList): Option[String]                = t.title
  def extractStatus(t: FHIRList): LIST_STATUS                  = t.status
  def extractSource(t: FHIRList): Option[Reference]            = t.source
  def extractSubject(t: FHIRList): Option[Reference]           = t.subject
  def extractLanguage(t: FHIRList): Option[LANGUAGES]          = t.language
  def extractContained(t: FHIRList): LitSeq[Resource]          = t.contained
  def extractExtension(t: FHIRList): LitSeq[Extension]         = t.extension
  def extractEncounter(t: FHIRList): Option[Reference]         = t.encounter
  def extractOrderedBy(t: FHIRList): Option[CodeableConcept]   = t.orderedBy
  def extractIdentifier(t: FHIRList): LitSeq[Identifier]       = t.identifier
  def extractEmptyReason(t: FHIRList): Option[CodeableConcept] = t.emptyReason
  def extractImplicitRules(t: FHIRList): Option[UriStr]        = t.implicitRules
  def extractModifierExtension(t: FHIRList): LitSeq[Extension] = t.modifierExtension
  def extractEntry(t: FHIRList): LitSeq[FHIRList.Entry]        = t.entry
  override val thisName: String                                = "FHIRList"
  override val searchParams: Map[String, FHIRList => Seq[Any]] = Map(
    "source"       -> (obj => obj.source.toSeq),
    "subject"      -> (obj => obj.subject.toSeq),
    "identifier"   -> (obj => obj.identifier.toSeq),
    "code"         -> (obj => obj.code.toSeq),
    "date"         -> (obj => obj.date.toSeq),
    "status"       -> (obj => Seq(obj.status)),
    "empty-reason" -> (obj => obj.emptyReason.toSeq),
    "notes"        -> (obj => obj.note.map(_.text).toSeq),
    "title"        -> (obj => obj.title.toSeq),
    "encounter"    -> (obj => obj.encounter.toSeq),
    "patient"      -> (obj => obj.subject.filter(_.reference.exists(_.contains("Patient/"))).toSeq),
    "item"         -> (obj => obj.entry.map(_.item).toSeq)
  )
  def unapply(
      o: FHIRList): Option[(Option[String], Option[Meta], Option[Narrative], LIST_MODE, Option[CodeableConcept], Option[FHIRDateTime], LitSeq[Annotation], Option[String], LIST_STATUS, Option[Reference], Option[Reference], Option[LANGUAGES], LitSeq[Resource], LitSeq[Extension], Option[Reference], Option[CodeableConcept], LitSeq[Identifier], Option[CodeableConcept], Option[UriStr], LitSeq[Extension], LitSeq[FHIRList.Entry])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.mode,
        o.code,
        o.date,
        o.note,
        o.title,
        o.status,
        o.source,
        o.subject,
        o.language,
        o.contained,
        o.extension,
        o.encounter,
        o.orderedBy,
        o.identifier,
        o.emptyReason,
        o.implicitRules,
        o.modifierExtension,
        o.entry))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[FHIRList] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new FHIRList(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[LIST_MODE]("mode", None),
          cursor.decodeAs[Option[CodeableConcept]]("code", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("date", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("title", Some(None)),
          cursor.decodeAs[LIST_STATUS]("status", None),
          cursor.decodeAs[Option[Reference]]("source", Some(None)),
          cursor.decodeAs[Option[Reference]]("subject", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("orderedBy", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("emptyReason", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[FHIRList.Entry]]("entry", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** A list is a curated collection of resources.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields mode, code, date, note, title, status, source, subject, encounter, orderedBy, identifier, emptyReason, entry.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param mode - How this list was prepared - whether it is a working list that is suitable for being maintained on an ongoing basis, or if it represents a snapshot of a list of items from another source, or whether it is a prepared list where items may be marked as added, modified or deleted.
  * @param code - This code defines the purpose of the list - why it was created.
  * @param date - The date that the list was prepared.
  * @param note - Comments that apply to the overall list.
  * @param title - A label for the list assigned by the author.
  * @param status - Indicates the current state of this list.
  * @param source - The entity responsible for deciding what the contents of the list were. Where the list was created by a human, this is the same as the author of the list.
  * @param subject - The common subject (or patient) of the resources that are in the list if there is one.
  * @param language - The base language in which the resource is written.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param encounter - The encounter that is the context in which this list was created.
  * @param orderedBy - What order applies to the items in the list.
  * @param identifier - Identifier for the List assigned for business purposes outside the context of FHIR.
  * @param emptyReason - If the list is empty, why the list is empty.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param entry - Entries in this list.
  */
@POJOBoilerplate
class FHIRList(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val mode: LIST_MODE,
    val code: Option[CodeableConcept] = None,
    val date: Option[FHIRDateTime] = None,
    val note: LitSeq[Annotation] = LitSeq.empty,
    val title: Option[String] = None,
    val status: LIST_STATUS,
    val source: Option[Reference] = None,
    val subject: Option[Reference] = None,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val encounter: Option[Reference] = None,
    val orderedBy: Option[CodeableConcept] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val emptyReason: Option[CodeableConcept] = None,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val entry: LitSeq[FHIRList.Entry] = LitSeq.empty,
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
  override val thisTypeName: String = "List"
}
