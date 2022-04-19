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
import com.babylonhealth.lit.hl7.{
  COMPOSITION_STATUS,
  V3_CONFIDENTIALITYCLASSIFICATION,
  COMPOSITION_ATTESTATION_MODE,
  DOCUMENT_RELATIONSHIP_TYPE,
  LIST_MODE
}
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Composition extends CompanionFor[Composition] {
  implicit def summonObjectAndCompanionComposition_1987809643(o: Composition): ObjectAndCompanion[Composition, Composition.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Composition
  override type ParentType   = Composition
  override val baseType: CompanionFor[ResourceType] = Composition
  override val parentType: CompanionFor[ParentType] = Composition
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Composition")
  object RelatesTo extends CompanionFor[RelatesTo] {
    implicit def summonObjectAndCompanionRelatesTo1657889556(o: RelatesTo): ObjectAndCompanion[RelatesTo, RelatesTo.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = RelatesTo
    override type ParentType   = RelatesTo
    override val parentType: CompanionFor[ResourceType] = RelatesTo
    type TargetChoice = Choice[UnionIdentifierOrReference]
    def apply(
        id: Option[String] = None,
        code: DOCUMENT_RELATIONSHIP_TYPE,
        extension: LitSeq[Extension] = LitSeq.empty,
        target: RelatesTo.TargetChoice,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): RelatesTo = new RelatesTo(
      id,
      code,
      extension,
      target,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: RelatesTo): Option[(Option[String], DOCUMENT_RELATIONSHIP_TYPE, LitSeq[Extension], RelatesTo.TargetChoice, LitSeq[Extension])] =
      Some((o.id, o.code, o.extension, o.target, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val code: FHIRComponentFieldMeta[DOCUMENT_RELATIONSHIP_TYPE] =
      FHIRComponentFieldMeta("code", lTagOf[DOCUMENT_RELATIONSHIP_TYPE], false, lTagOf[DOCUMENT_RELATIONSHIP_TYPE])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val target: FHIRComponentFieldMeta[RelatesTo.TargetChoice] =
      FHIRComponentFieldMeta("target", lTagOf[RelatesTo.TargetChoice], true, lTagOf[UnionIdentifierOrReference])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, code, extension, target, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: RelatesTo): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[DOCUMENT_RELATIONSHIP_TYPE](code, t.code),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[RelatesTo.TargetChoice](target, t.target),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[RelatesTo] = this
    val thisName: String                  = "RelatesTo"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[RelatesTo] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new RelatesTo(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[DOCUMENT_RELATIONSHIP_TYPE]("code", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeRef[UnionIdentifierOrReference]("target"),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class RelatesTo(
      override val id: Option[String] = None,
      val code: DOCUMENT_RELATIONSHIP_TYPE,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val target: RelatesTo.TargetChoice,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Attester extends CompanionFor[Attester] {
    implicit def summonObjectAndCompanionAttester1657889556(o: Attester): ObjectAndCompanion[Attester, Attester.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Attester
    override type ParentType   = Attester
    override val parentType: CompanionFor[ResourceType] = Attester
    def apply(
        id: Option[String] = None,
        mode: COMPOSITION_ATTESTATION_MODE,
        time: Option[FHIRDateTime] = None,
        party: Option[Reference] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Attester = new Attester(
      id,
      mode,
      time,
      party,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Attester): Option[(Option[String], COMPOSITION_ATTESTATION_MODE, Option[FHIRDateTime], Option[Reference], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.mode, o.time, o.party, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val mode: FHIRComponentFieldMeta[COMPOSITION_ATTESTATION_MODE] =
      FHIRComponentFieldMeta("mode", lTagOf[COMPOSITION_ATTESTATION_MODE], false, lTagOf[COMPOSITION_ATTESTATION_MODE])
    val time: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
      FHIRComponentFieldMeta("time", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
    val party: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("party", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, mode, time, party, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Attester): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[COMPOSITION_ATTESTATION_MODE](mode, t.mode),
      FHIRComponentField[Option[FHIRDateTime]](time, t.time),
      FHIRComponentField[Option[Reference]](party, t.party),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Attester] = this
    val thisName: String                 = "Attester"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Attester] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Attester(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[COMPOSITION_ATTESTATION_MODE]("mode", None),
            cursor.decodeAs[Option[FHIRDateTime]]("time", Some(None)),
            cursor.decodeAs[Option[Reference]]("party", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Attester(
      override val id: Option[String] = None,
      val mode: COMPOSITION_ATTESTATION_MODE,
      val time: Option[FHIRDateTime] = None,
      val party: Option[Reference] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Section extends CompanionFor[Section] {
    implicit def summonObjectAndCompanionSection1657889556(o: Section): ObjectAndCompanion[Section, Section.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Section
    override type ParentType   = Section
    override val parentType: CompanionFor[ResourceType] = Section
    def apply(
        id: Option[String] = None,
        code: Option[CodeableConcept] = None,
        text: Option[Narrative] = None,
        mode: Option[LIST_MODE] = None,
        title: Option[String] = None,
        focus: Option[Reference] = None,
        entry: LitSeq[Reference] = LitSeq.empty,
        author: LitSeq[Reference] = LitSeq.empty,
        section: LitSeq[Composition.Section] = LitSeq.empty,
        extension: LitSeq[Extension] = LitSeq.empty,
        orderedBy: Option[CodeableConcept] = None,
        emptyReason: Option[CodeableConcept] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Section = new Section(
      id,
      code,
      text,
      mode,
      title,
      focus,
      entry,
      author,
      section,
      extension,
      orderedBy,
      emptyReason,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Section): Option[(Option[String], Option[CodeableConcept], Option[Narrative], Option[LIST_MODE], Option[String], Option[Reference], LitSeq[Reference], LitSeq[Reference], LitSeq[Composition.Section], LitSeq[Extension], Option[CodeableConcept], Option[CodeableConcept], LitSeq[Extension])] =
      Some(
        (
          o.id,
          o.code,
          o.text,
          o.mode,
          o.title,
          o.focus,
          o.entry,
          o.author,
          o.section,
          o.extension,
          o.orderedBy,
          o.emptyReason,
          o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val code: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("code", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val text: FHIRComponentFieldMeta[Option[Narrative]] =
      FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
    val mode: FHIRComponentFieldMeta[Option[LIST_MODE]] =
      FHIRComponentFieldMeta("mode", lTagOf[Option[LIST_MODE]], false, lTagOf[LIST_MODE])
    val title: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("title", lTagOf[Option[String]], false, lTagOf[String])
    val focus: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("focus", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val entry: FHIRComponentFieldMeta[LitSeq[Reference]] =
      FHIRComponentFieldMeta("entry", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
    val author: FHIRComponentFieldMeta[LitSeq[Reference]] =
      FHIRComponentFieldMeta("author", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
    val section: FHIRComponentFieldMeta[LitSeq[Composition.Section]] =
      FHIRComponentFieldMeta("section", lTagOf[LitSeq[Composition.Section]], false, lTagOf[Composition.Section])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val orderedBy: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("orderedBy", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val emptyReason: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("emptyReason", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, code, text, mode, title, focus, entry, author, section, extension, orderedBy, emptyReason, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Section): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](code, t.code),
      FHIRComponentField[Option[Narrative]](text, t.text),
      FHIRComponentField[Option[LIST_MODE]](mode, t.mode),
      FHIRComponentField[Option[String]](title, t.title),
      FHIRComponentField[Option[Reference]](focus, t.focus),
      FHIRComponentField[LitSeq[Reference]](entry, t.entry),
      FHIRComponentField[LitSeq[Reference]](author, t.author),
      FHIRComponentField[LitSeq[Composition.Section]](section, t.section),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[CodeableConcept]](orderedBy, t.orderedBy),
      FHIRComponentField[Option[CodeableConcept]](emptyReason, t.emptyReason),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Section] = this
    val thisName: String                = "Section"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Section] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Section(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("code", Some(None)),
            cursor.decodeAs[Option[Narrative]]("text", Some(None)),
            cursor.decodeAs[Option[LIST_MODE]]("mode", Some(None)),
            cursor.decodeAs[Option[String]]("title", Some(None)),
            cursor.decodeAs[Option[Reference]]("focus", Some(None)),
            cursor.decodeAs[LitSeq[Reference]]("entry", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Reference]]("author", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Composition.Section]]("section", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[CodeableConcept]]("orderedBy", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("emptyReason", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Section(
      override val id: Option[String] = None,
      val code: Option[CodeableConcept] = None,
      val text: Option[Narrative] = None,
      val mode: Option[LIST_MODE] = None,
      val title: Option[String] = None,
      val focus: Option[Reference] = None,
      val entry: LitSeq[Reference] = LitSeq.empty,
      val author: LitSeq[Reference] = LitSeq.empty,
      val section: LitSeq[Composition.Section] = LitSeq.empty,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val orderedBy: Option[CodeableConcept] = None,
      val emptyReason: Option[CodeableConcept] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Event extends CompanionFor[Event] {
    implicit def summonObjectAndCompanionEvent1657889556(o: Event): ObjectAndCompanion[Event, Event.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Event
    override type ParentType   = Event
    override val parentType: CompanionFor[ResourceType] = Event
    def apply(
        id: Option[String] = None,
        code: LitSeq[CodeableConcept] = LitSeq.empty,
        period: Option[Period] = None,
        detail: LitSeq[Reference] = LitSeq.empty,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Event = new Event(
      id,
      code,
      period,
      detail,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Event): Option[(Option[String], LitSeq[CodeableConcept], Option[Period], LitSeq[Reference], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.code, o.period, o.detail, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val code: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("code", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val period: FHIRComponentFieldMeta[Option[Period]] =
      FHIRComponentFieldMeta("period", lTagOf[Option[Period]], false, lTagOf[Period])
    val detail: FHIRComponentFieldMeta[LitSeq[Reference]] =
      FHIRComponentFieldMeta("detail", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, code, period, detail, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Event): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[CodeableConcept]](code, t.code),
      FHIRComponentField[Option[Period]](period, t.period),
      FHIRComponentField[LitSeq[Reference]](detail, t.detail),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Event] = this
    val thisName: String              = "Event"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Event] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Event(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("code", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Period]]("period", Some(None)),
            cursor.decodeAs[LitSeq[Reference]]("detail", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Event(
      override val id: Option[String] = None,
      val code: LitSeq[CodeableConcept] = LitSeq.empty,
      val period: Option[Period] = None,
      val detail: LitSeq[Reference] = LitSeq.empty,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      `type`: CodeableConcept,
      date: FHIRDateTime,
      title: String,
      status: COMPOSITION_STATUS,
      author: NonEmptyLitSeq[Reference],
      subject: Option[Reference] = None,
      language: Option[LANGUAGES] = None,
      category: LitSeq[CodeableConcept] = LitSeq.empty,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      encounter: Option[Reference] = None,
      custodian: Option[Reference] = None,
      identifier: Option[Identifier] = None,
      implicitRules: Option[UriStr] = None,
      confidentiality: Option[V3_CONFIDENTIALITYCLASSIFICATION] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      event: LitSeq[Composition.Event] = LitSeq.empty,
      section: LitSeq[Composition.Section] = LitSeq.empty,
      attester: LitSeq[Composition.Attester] = LitSeq.empty,
      relatesTo: LitSeq[Composition.RelatesTo] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Composition = new Composition(
    id,
    meta,
    text,
    `type`,
    date,
    title,
    status,
    author,
    subject,
    language,
    category,
    contained,
    extension,
    encounter,
    custodian,
    identifier,
    implicitRules,
    confidentiality,
    modifierExtension,
    event,
    section,
    attester,
    relatesTo,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val `type`: FHIRComponentFieldMeta[CodeableConcept] =
    FHIRComponentFieldMeta("type", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
  val date: FHIRComponentFieldMeta[FHIRDateTime] =
    FHIRComponentFieldMeta("date", lTagOf[FHIRDateTime], false, lTagOf[FHIRDateTime])
  val title: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("title", lTagOf[String], false, lTagOf[String])
  val status: FHIRComponentFieldMeta[COMPOSITION_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[COMPOSITION_STATUS], false, lTagOf[COMPOSITION_STATUS])
  val author: FHIRComponentFieldMeta[NonEmptyLitSeq[Reference]] =
    FHIRComponentFieldMeta("author", lTagOf[NonEmptyLitSeq[Reference]], false, lTagOf[Reference])
  val subject: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("subject", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val category: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("category", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val encounter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("encounter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val custodian: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("custodian", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[Option[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val confidentiality: FHIRComponentFieldMeta[Option[V3_CONFIDENTIALITYCLASSIFICATION]] =
    FHIRComponentFieldMeta(
      "confidentiality",
      lTagOf[Option[V3_CONFIDENTIALITYCLASSIFICATION]],
      false,
      lTagOf[V3_CONFIDENTIALITYCLASSIFICATION])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val event: FHIRComponentFieldMeta[LitSeq[Composition.Event]] =
    FHIRComponentFieldMeta("event", lTagOf[LitSeq[Composition.Event]], false, lTagOf[Composition.Event])
  val section: FHIRComponentFieldMeta[LitSeq[Composition.Section]] =
    FHIRComponentFieldMeta("section", lTagOf[LitSeq[Composition.Section]], false, lTagOf[Composition.Section])
  val attester: FHIRComponentFieldMeta[LitSeq[Composition.Attester]] =
    FHIRComponentFieldMeta("attester", lTagOf[LitSeq[Composition.Attester]], false, lTagOf[Composition.Attester])
  val relatesTo: FHIRComponentFieldMeta[LitSeq[Composition.RelatesTo]] =
    FHIRComponentFieldMeta("relatesTo", lTagOf[LitSeq[Composition.RelatesTo]], false, lTagOf[Composition.RelatesTo])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    `type`,
    date,
    title,
    status,
    author,
    subject,
    language,
    category,
    contained,
    extension,
    encounter,
    custodian,
    identifier,
    implicitRules,
    confidentiality,
    modifierExtension,
    event,
    section,
    attester,
    relatesTo
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Composition): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[CodeableConcept](`type`, t.`type`),
    FHIRComponentField[FHIRDateTime](date, t.date),
    FHIRComponentField[String](title, t.title),
    FHIRComponentField[COMPOSITION_STATUS](status, t.status),
    FHIRComponentField[NonEmptyLitSeq[Reference]](author, t.author),
    FHIRComponentField[Option[Reference]](subject, t.subject),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[CodeableConcept]](category, t.category),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Reference]](encounter, t.encounter),
    FHIRComponentField[Option[Reference]](custodian, t.custodian),
    FHIRComponentField[Option[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[V3_CONFIDENTIALITYCLASSIFICATION]](confidentiality, t.confidentiality),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[Composition.Event]](event, t.event),
    FHIRComponentField[LitSeq[Composition.Section]](section, t.section),
    FHIRComponentField[LitSeq[Composition.Attester]](attester, t.attester),
    FHIRComponentField[LitSeq[Composition.RelatesTo]](relatesTo, t.relatesTo)
  )
  def extractId(t: Composition): Option[String]                                        = t.id
  def extractMeta(t: Composition): Option[Meta]                                        = t.meta
  def extractText(t: Composition): Option[Narrative]                                   = t.text
  def extractType(t: Composition): CodeableConcept                                     = t.`type`
  def extractDate(t: Composition): FHIRDateTime                                        = t.date
  def extractTitle(t: Composition): String                                             = t.title
  def extractStatus(t: Composition): COMPOSITION_STATUS                                = t.status
  def extractAuthor(t: Composition): NonEmptyLitSeq[Reference]                         = t.author
  def extractSubject(t: Composition): Option[Reference]                                = t.subject
  def extractLanguage(t: Composition): Option[LANGUAGES]                               = t.language
  def extractCategory(t: Composition): LitSeq[CodeableConcept]                         = t.category
  def extractContained(t: Composition): LitSeq[Resource]                               = t.contained
  def extractExtension(t: Composition): LitSeq[Extension]                              = t.extension
  def extractEncounter(t: Composition): Option[Reference]                              = t.encounter
  def extractCustodian(t: Composition): Option[Reference]                              = t.custodian
  def extractIdentifier(t: Composition): Option[Identifier]                            = t.identifier
  def extractImplicitRules(t: Composition): Option[UriStr]                             = t.implicitRules
  def extractConfidentiality(t: Composition): Option[V3_CONFIDENTIALITYCLASSIFICATION] = t.confidentiality
  def extractModifierExtension(t: Composition): LitSeq[Extension]                      = t.modifierExtension
  def extractEvent(t: Composition): LitSeq[Composition.Event]                          = t.event
  def extractSection(t: Composition): LitSeq[Composition.Section]                      = t.section
  def extractAttester(t: Composition): LitSeq[Composition.Attester]                    = t.attester
  def extractRelatesTo(t: Composition): LitSeq[Composition.RelatesTo]                  = t.relatesTo
  override val thisName: String                                                        = "Composition"
  override val searchParams: Map[String, Composition => Seq[Any]] = Map(
    "author"          -> (obj => obj.author.toSeq),
    "identifier"      -> (obj => obj.identifier.toSeq),
    "section"         -> (obj => obj.section.flatMap(_.code).toSeq),
    "confidentiality" -> (obj => obj.confidentiality.toSeq),
    "date"            -> (obj => Seq(obj.date)),
    "status"          -> (obj => Seq(obj.status)),
    "category"        -> (obj => obj.category.toSeq),
    "related-ref"     -> (obj => obj.relatesTo.map(_.target).flatMap(_.as[Reference]).toSeq),
    "encounter"       -> (obj => obj.encounter.toSeq),
    "period"          -> (obj => obj.event.flatMap(_.period).toSeq),
    "patient"         -> (obj => obj.subject.filter(_.reference.exists(_.contains("Patient/"))).toSeq),
    "subject"         -> (obj => obj.subject.toSeq),
    "attester"        -> (obj => obj.attester.flatMap(_.party).toSeq),
    "related-id"      -> (obj => obj.relatesTo.map(_.target).flatMap(_.as[Identifier]).toSeq),
    "context"         -> (obj => obj.event.flatMap(_.code).toSeq),
    "entry"           -> (obj => obj.section.flatMap(_.entry).toSeq),
    "title"           -> (obj => Seq(obj.title)),
    "type"            -> (obj => Seq(obj.`type`))
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Composition] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Composition(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[CodeableConcept]("type", None),
          cursor.decodeAs[FHIRDateTime]("date", None),
          cursor.decodeAs[String]("title", None),
          cursor.decodeAs[COMPOSITION_STATUS]("status", None),
          cursor.decodeAs[NonEmptyLitSeq[Reference]]("author", None),
          cursor.decodeAs[Option[Reference]]("subject", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("category", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          cursor.decodeAs[Option[Reference]]("custodian", Some(None)),
          cursor.decodeAs[Option[Identifier]]("identifier", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[V3_CONFIDENTIALITYCLASSIFICATION]]("confidentiality", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Composition.Event]]("event", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Composition.Section]]("section", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Composition.Attester]]("attester", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Composition.RelatesTo]]("relatesTo", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** A set of healthcare-related information that is assembled together into a single logical package that provides a single
  * coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the
  * statement. A Composition defines the structure and narrative content necessary for a document. However, a Composition alone
  * does not constitute a document. Rather, the Composition must be the first entry in a Bundle where Bundle.type=document, and
  * any other resources referenced from Composition must be included as subsequent entries in the Bundle (for example Patient,
  * Practitioner, Encounter, etc.).
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields `type`, date, title, status, author, subject, category, encounter, custodian, identifier,
  *   confidentiality, event, section, attester, relatesTo.
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
  * @param `type`
  *   \- Specifies the particular kind of composition (e.g. History and Physical, Discharge Summary, Progress Note). This usually
  *   equates to the purpose of making the composition.
  * @param date
  *   \- The composition editing time, when the composition was last logically changed by the author.
  * @param title
  *   \- Official human-readable label for the composition.
  * @param status
  *   \- The workflow/clinical status of this composition. The status is a marker for the clinical standing of the document.
  * @param author
  *   \- Identifies who is responsible for the information in the composition, not necessarily who typed it in.
  * @param subject
  *   \- Who or what the composition is about. The composition can be about a person, (patient or healthcare practitioner), a
  *   device (e.g. a machine) or even a group of subjects (such as a document about a herd of livestock, or a set of patients that
  *   share a common exposure).
  * @param language
  *   \- The base language in which the resource is written.
  * @param category
  *   \- A categorization for the type of the composition - helps for indexing and searching. This may be implied by or derived
  *   from the code specified in the Composition Type.
  * @param contained
  *   \- These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   \- May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param encounter
  *   \- Describes the clinical encounter or type of care this documentation is associated with.
  * @param custodian
  *   \- Identifies the organization or group who is responsible for ongoing maintenance of and access to the composition/document
  *   information.
  * @param identifier
  *   \- A version-independent identifier for the Composition. This identifier stays constant as the composition is changed over
  *   time.
  * @param implicitRules
  *   \- A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param confidentiality
  *   \- The code specifying the level of confidentiality of the Composition.
  * @param modifierExtension
  *   \- May be used to represent additional information that is not part of the basic definition of the resource and that
  *   modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *   Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *   strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *   extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *   processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any
  *   elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param event
  *   \- The clinical service, such as a colonoscopy or an appendectomy, being documented.
  * @param section
  *   \- The root of the sections that make up the composition.
  * @param attester
  *   \- A participant who has attested to the accuracy of the composition/document.
  * @param relatesTo
  *   \- Relationships that this composition has with other compositions or documents that already exist.
  */
@POJOBoilerplate
class Composition(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val `type`: CodeableConcept,
    val date: FHIRDateTime,
    val title: String,
    val status: COMPOSITION_STATUS,
    val author: NonEmptyLitSeq[Reference],
    val subject: Option[Reference] = None,
    override val language: Option[LANGUAGES] = None,
    val category: LitSeq[CodeableConcept] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val encounter: Option[Reference] = None,
    val custodian: Option[Reference] = None,
    val identifier: Option[Identifier] = None,
    override val implicitRules: Option[UriStr] = None,
    val confidentiality: Option[V3_CONFIDENTIALITYCLASSIFICATION] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val event: LitSeq[Composition.Event] = LitSeq.empty,
    val section: LitSeq[Composition.Section] = LitSeq.empty,
    val attester: LitSeq[Composition.Attester] = LitSeq.empty,
    val relatesTo: LitSeq[Composition.RelatesTo] = LitSeq.empty,
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
  override val thisTypeName: String = "Composition"
}
