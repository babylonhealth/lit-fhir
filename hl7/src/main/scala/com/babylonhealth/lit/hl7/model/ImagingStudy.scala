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
import com.babylonhealth.lit.hl7.IMAGINGSTUDY_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object ImagingStudy extends CompanionFor[ImagingStudy] {
  implicit def summonObjectAndCompanionImagingStudy_2070621754(
      o: ImagingStudy): ObjectAndCompanion[ImagingStudy, ImagingStudy.type] = ObjectAndCompanion(o, this)
  override type ResourceType = ImagingStudy
  override type ParentType   = ImagingStudy
  override val baseType: CompanionFor[ResourceType] = ImagingStudy
  override val parentType: CompanionFor[ParentType] = ImagingStudy
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/ImagingStudy")
  object Series extends CompanionFor[Series] {
    implicit def summonObjectAndCompanionSeries_1301161246(o: Series): ObjectAndCompanion[Series, Series.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Series
    override type ParentType   = Series
    override val parentType: CompanionFor[ResourceType] = Series
    object Instance extends CompanionFor[Instance] {
      implicit def summonObjectAndCompanionInstance443039(o: Instance): ObjectAndCompanion[Instance, Instance.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Instance
      override type ParentType   = Instance
      override val parentType: CompanionFor[ResourceType] = Instance
      def apply(
          id: Option[String] = None,
          uid: Id,
          title: Option[String] = None,
          number: Option[UnsignedInt] = None,
          sopClass: Coding,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Instance = new Instance(
        id,
        uid,
        title,
        number,
        sopClass,
        extension,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Instance): Option[(Option[String], Id, Option[String], Option[UnsignedInt], Coding, LitSeq[Extension], LitSeq[Extension])] =
        Some((o.id, o.uid, o.title, o.number, o.sopClass, o.extension, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val uid: FHIRComponentFieldMeta[Id] =
        FHIRComponentFieldMeta("uid", lTagOf[Id], false, lTagOf[Id])
      val title: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("title", lTagOf[Option[String]], false, lTagOf[String])
      val number: FHIRComponentFieldMeta[Option[UnsignedInt]] =
        FHIRComponentFieldMeta("number", lTagOf[Option[UnsignedInt]], false, lTagOf[UnsignedInt])
      val sopClass: FHIRComponentFieldMeta[Coding] =
        FHIRComponentFieldMeta("sopClass", lTagOf[Coding], false, lTagOf[Coding])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, uid, title, number, sopClass, extension, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Instance): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Id](uid, t.uid),
        FHIRComponentField[Option[String]](title, t.title),
        FHIRComponentField[Option[UnsignedInt]](number, t.number),
        FHIRComponentField[Coding](sopClass, t.sopClass),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Instance] = this
      val thisName: String                 = "Instance"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Instance] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Instance(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Id]("uid", None),
              cursor.decodeAs[Option[String]]("title", Some(None)),
              cursor.decodeAs[Option[UnsignedInt]]("number", Some(None)),
              cursor.decodeAs[Coding]("sopClass", None),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Instance(
        override val id: Option[String] = None,
        val uid: Id,
        val title: Option[String] = None,
        val number: Option[UnsignedInt] = None,
        val sopClass: Coding,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object Performer extends CompanionFor[Performer] {
      implicit def summonObjectAndCompanionPerformer443039(o: Performer): ObjectAndCompanion[Performer, Performer.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Performer
      override type ParentType   = Performer
      override val parentType: CompanionFor[ResourceType] = Performer
      def apply(
          id: Option[String] = None,
          actor: Reference,
          function: Option[CodeableConcept] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Performer = new Performer(
        id,
        actor,
        function,
        extension,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Performer): Option[(Option[String], Reference, Option[CodeableConcept], LitSeq[Extension], LitSeq[Extension])] =
        Some((o.id, o.actor, o.function, o.extension, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val actor: FHIRComponentFieldMeta[Reference] =
        FHIRComponentFieldMeta("actor", lTagOf[Reference], false, lTagOf[Reference])
      val function: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("function", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, actor, function, extension, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Performer): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Reference](actor, t.actor),
        FHIRComponentField[Option[CodeableConcept]](function, t.function),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Performer] = this
      val thisName: String                  = "Performer"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Performer] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Performer(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Reference]("actor", None),
              cursor.decodeAs[Option[CodeableConcept]]("function", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Performer(
        override val id: Option[String] = None,
        val actor: Reference,
        val function: Option[CodeableConcept] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        uid: Id,
        number: Option[UnsignedInt] = None,
        started: Option[FHIRDateTime] = None,
        modality: Coding,
        endpoint: LitSeq[Reference] = LitSeq.empty,
        bodySite: Option[Coding] = None,
        specimen: LitSeq[Reference] = LitSeq.empty,
        extension: LitSeq[Extension] = LitSeq.empty,
        laterality: Option[Coding] = None,
        description: Option[String] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        numberOfInstances: Option[UnsignedInt] = None,
        instance: LitSeq[Series.Instance] = LitSeq.empty,
        performer: LitSeq[Series.Performer] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Series = new Series(
      id,
      uid,
      number,
      started,
      modality,
      endpoint,
      bodySite,
      specimen,
      extension,
      laterality,
      description,
      modifierExtension,
      numberOfInstances,
      instance,
      performer,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Series): Option[(Option[String], Id, Option[UnsignedInt], Option[FHIRDateTime], Coding, LitSeq[Reference], Option[Coding], LitSeq[Reference], LitSeq[Extension], Option[Coding], Option[String], LitSeq[Extension], Option[UnsignedInt], LitSeq[Series.Instance], LitSeq[Series.Performer])] =
      Some(
        (
          o.id,
          o.uid,
          o.number,
          o.started,
          o.modality,
          o.endpoint,
          o.bodySite,
          o.specimen,
          o.extension,
          o.laterality,
          o.description,
          o.modifierExtension,
          o.numberOfInstances,
          o.instance,
          o.performer))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val uid: FHIRComponentFieldMeta[Id] =
      FHIRComponentFieldMeta("uid", lTagOf[Id], false, lTagOf[Id])
    val number: FHIRComponentFieldMeta[Option[UnsignedInt]] =
      FHIRComponentFieldMeta("number", lTagOf[Option[UnsignedInt]], false, lTagOf[UnsignedInt])
    val started: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
      FHIRComponentFieldMeta("started", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
    val modality: FHIRComponentFieldMeta[Coding] =
      FHIRComponentFieldMeta("modality", lTagOf[Coding], false, lTagOf[Coding])
    val endpoint: FHIRComponentFieldMeta[LitSeq[Reference]] =
      FHIRComponentFieldMeta("endpoint", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
    val bodySite: FHIRComponentFieldMeta[Option[Coding]] =
      FHIRComponentFieldMeta("bodySite", lTagOf[Option[Coding]], false, lTagOf[Coding])
    val specimen: FHIRComponentFieldMeta[LitSeq[Reference]] =
      FHIRComponentFieldMeta("specimen", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val laterality: FHIRComponentFieldMeta[Option[Coding]] =
      FHIRComponentFieldMeta("laterality", lTagOf[Option[Coding]], false, lTagOf[Coding])
    val description: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val numberOfInstances: FHIRComponentFieldMeta[Option[UnsignedInt]] =
      FHIRComponentFieldMeta("numberOfInstances", lTagOf[Option[UnsignedInt]], false, lTagOf[UnsignedInt])
    val instance: FHIRComponentFieldMeta[LitSeq[Series.Instance]] =
      FHIRComponentFieldMeta("instance", lTagOf[LitSeq[Series.Instance]], false, lTagOf[Series.Instance])
    val performer: FHIRComponentFieldMeta[LitSeq[Series.Performer]] =
      FHIRComponentFieldMeta("performer", lTagOf[LitSeq[Series.Performer]], false, lTagOf[Series.Performer])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
      id,
      uid,
      number,
      started,
      modality,
      endpoint,
      bodySite,
      specimen,
      extension,
      laterality,
      description,
      modifierExtension,
      numberOfInstances,
      instance,
      performer)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Series): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Id](uid, t.uid),
      FHIRComponentField[Option[UnsignedInt]](number, t.number),
      FHIRComponentField[Option[FHIRDateTime]](started, t.started),
      FHIRComponentField[Coding](modality, t.modality),
      FHIRComponentField[LitSeq[Reference]](endpoint, t.endpoint),
      FHIRComponentField[Option[Coding]](bodySite, t.bodySite),
      FHIRComponentField[LitSeq[Reference]](specimen, t.specimen),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Coding]](laterality, t.laterality),
      FHIRComponentField[Option[String]](description, t.description),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[UnsignedInt]](numberOfInstances, t.numberOfInstances),
      FHIRComponentField[LitSeq[Series.Instance]](instance, t.instance),
      FHIRComponentField[LitSeq[Series.Performer]](performer, t.performer)
    )
    val baseType: CompanionFor[Series] = this
    val thisName: String               = "Series"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Series] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Series(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Id]("uid", None),
            cursor.decodeAs[Option[UnsignedInt]]("number", Some(None)),
            cursor.decodeAs[Option[FHIRDateTime]]("started", Some(None)),
            cursor.decodeAs[Coding]("modality", None),
            cursor.decodeAs[LitSeq[Reference]]("endpoint", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Coding]]("bodySite", Some(None)),
            cursor.decodeAs[LitSeq[Reference]]("specimen", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Coding]]("laterality", Some(None)),
            cursor.decodeAs[Option[String]]("description", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[UnsignedInt]]("numberOfInstances", Some(None)),
            cursor.decodeAs[LitSeq[Series.Instance]]("instance", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Series.Performer]]("performer", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Series(
      override val id: Option[String] = None,
      val uid: Id,
      val number: Option[UnsignedInt] = None,
      val started: Option[FHIRDateTime] = None,
      val modality: Coding,
      val endpoint: LitSeq[Reference] = LitSeq.empty,
      val bodySite: Option[Coding] = None,
      val specimen: LitSeq[Reference] = LitSeq.empty,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val laterality: Option[Coding] = None,
      val description: Option[String] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val numberOfInstances: Option[UnsignedInt] = None,
      val instance: LitSeq[Series.Instance] = LitSeq.empty,
      val performer: LitSeq[Series.Performer] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      status: IMAGINGSTUDY_STATUS,
      subject: Reference,
      started: Option[FHIRDateTime] = None,
      basedOn: LitSeq[Reference] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      modality: LitSeq[Coding] = LitSeq.empty,
      referrer: Option[Reference] = None,
      endpoint: LitSeq[Reference] = LitSeq.empty,
      location: Option[Reference] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      encounter: Option[Reference] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
      interpreter: LitSeq[Reference] = LitSeq.empty,
      description: Option[String] = None,
      implicitRules: Option[UriStr] = None,
      procedureCode: LitSeq[CodeableConcept] = LitSeq.empty,
      numberOfSeries: Option[UnsignedInt] = None,
      reasonReference: LitSeq[Reference] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      numberOfInstances: Option[UnsignedInt] = None,
      procedureReference: Option[Reference] = None,
      series: LitSeq[ImagingStudy.Series] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): ImagingStudy = new ImagingStudy(
    id,
    meta,
    text,
    note,
    status,
    subject,
    started,
    basedOn,
    language,
    modality,
    referrer,
    endpoint,
    location,
    contained,
    extension,
    encounter,
    identifier,
    reasonCode,
    interpreter,
    description,
    implicitRules,
    procedureCode,
    numberOfSeries,
    reasonReference,
    modifierExtension,
    numberOfInstances,
    procedureReference,
    series,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val status: FHIRComponentFieldMeta[IMAGINGSTUDY_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[IMAGINGSTUDY_STATUS], false, lTagOf[IMAGINGSTUDY_STATUS])
  val subject: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("subject", lTagOf[Reference], false, lTagOf[Reference])
  val started: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("started", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val basedOn: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("basedOn", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val modality: FHIRComponentFieldMeta[LitSeq[Coding]] =
    FHIRComponentFieldMeta("modality", lTagOf[LitSeq[Coding]], false, lTagOf[Coding])
  val referrer: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("referrer", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val endpoint: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("endpoint", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val location: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("location", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val encounter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("encounter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val reasonCode: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("reasonCode", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val interpreter: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("interpreter", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val description: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val procedureCode: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("procedureCode", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val numberOfSeries: FHIRComponentFieldMeta[Option[UnsignedInt]] =
    FHIRComponentFieldMeta("numberOfSeries", lTagOf[Option[UnsignedInt]], false, lTagOf[UnsignedInt])
  val reasonReference: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("reasonReference", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val numberOfInstances: FHIRComponentFieldMeta[Option[UnsignedInt]] =
    FHIRComponentFieldMeta("numberOfInstances", lTagOf[Option[UnsignedInt]], false, lTagOf[UnsignedInt])
  val procedureReference: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("procedureReference", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val series: FHIRComponentFieldMeta[LitSeq[ImagingStudy.Series]] =
    FHIRComponentFieldMeta("series", lTagOf[LitSeq[ImagingStudy.Series]], false, lTagOf[ImagingStudy.Series])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    note,
    status,
    subject,
    started,
    basedOn,
    language,
    modality,
    referrer,
    endpoint,
    location,
    contained,
    extension,
    encounter,
    identifier,
    reasonCode,
    interpreter,
    description,
    implicitRules,
    procedureCode,
    numberOfSeries,
    reasonReference,
    modifierExtension,
    numberOfInstances,
    procedureReference,
    series
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: ImagingStudy): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[LitSeq[Annotation]](note, t.note),
    FHIRComponentField[IMAGINGSTUDY_STATUS](status, t.status),
    FHIRComponentField[Reference](subject, t.subject),
    FHIRComponentField[Option[FHIRDateTime]](started, t.started),
    FHIRComponentField[LitSeq[Reference]](basedOn, t.basedOn),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Coding]](modality, t.modality),
    FHIRComponentField[Option[Reference]](referrer, t.referrer),
    FHIRComponentField[LitSeq[Reference]](endpoint, t.endpoint),
    FHIRComponentField[Option[Reference]](location, t.location),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Reference]](encounter, t.encounter),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[LitSeq[CodeableConcept]](reasonCode, t.reasonCode),
    FHIRComponentField[LitSeq[Reference]](interpreter, t.interpreter),
    FHIRComponentField[Option[String]](description, t.description),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[CodeableConcept]](procedureCode, t.procedureCode),
    FHIRComponentField[Option[UnsignedInt]](numberOfSeries, t.numberOfSeries),
    FHIRComponentField[LitSeq[Reference]](reasonReference, t.reasonReference),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Option[UnsignedInt]](numberOfInstances, t.numberOfInstances),
    FHIRComponentField[Option[Reference]](procedureReference, t.procedureReference),
    FHIRComponentField[LitSeq[ImagingStudy.Series]](series, t.series)
  )
  def extractId(t: ImagingStudy): Option[String]                     = t.id
  def extractMeta(t: ImagingStudy): Option[Meta]                     = t.meta
  def extractText(t: ImagingStudy): Option[Narrative]                = t.text
  def extractNote(t: ImagingStudy): LitSeq[Annotation]               = t.note
  def extractStatus(t: ImagingStudy): IMAGINGSTUDY_STATUS            = t.status
  def extractSubject(t: ImagingStudy): Reference                     = t.subject
  def extractStarted(t: ImagingStudy): Option[FHIRDateTime]          = t.started
  def extractBasedOn(t: ImagingStudy): LitSeq[Reference]             = t.basedOn
  def extractLanguage(t: ImagingStudy): Option[LANGUAGES]            = t.language
  def extractModality(t: ImagingStudy): LitSeq[Coding]               = t.modality
  def extractReferrer(t: ImagingStudy): Option[Reference]            = t.referrer
  def extractEndpoint(t: ImagingStudy): LitSeq[Reference]            = t.endpoint
  def extractLocation(t: ImagingStudy): Option[Reference]            = t.location
  def extractContained(t: ImagingStudy): LitSeq[Resource]            = t.contained
  def extractExtension(t: ImagingStudy): LitSeq[Extension]           = t.extension
  def extractEncounter(t: ImagingStudy): Option[Reference]           = t.encounter
  def extractIdentifier(t: ImagingStudy): LitSeq[Identifier]         = t.identifier
  def extractReasonCode(t: ImagingStudy): LitSeq[CodeableConcept]    = t.reasonCode
  def extractInterpreter(t: ImagingStudy): LitSeq[Reference]         = t.interpreter
  def extractDescription(t: ImagingStudy): Option[String]            = t.description
  def extractImplicitRules(t: ImagingStudy): Option[UriStr]          = t.implicitRules
  def extractProcedureCode(t: ImagingStudy): LitSeq[CodeableConcept] = t.procedureCode
  def extractNumberOfSeries(t: ImagingStudy): Option[UnsignedInt]    = t.numberOfSeries
  def extractReasonReference(t: ImagingStudy): LitSeq[Reference]     = t.reasonReference
  def extractModifierExtension(t: ImagingStudy): LitSeq[Extension]   = t.modifierExtension
  def extractNumberOfInstances(t: ImagingStudy): Option[UnsignedInt] = t.numberOfInstances
  def extractProcedureReference(t: ImagingStudy): Option[Reference]  = t.procedureReference
  def extractSeries(t: ImagingStudy): LitSeq[ImagingStudy.Series]    = t.series
  override val thisName: String                                      = "ImagingStudy"
  override val searchParams: Map[String, ImagingStudy => Seq[Any]] = Map(
    "series"      -> (obj => obj.series.map(_.uid).toSeq),
    "basedon"     -> (obj => obj.basedOn.toSeq),
    "subject"     -> (obj => Seq(obj.subject)),
    "identifier"  -> (obj => obj.identifier.toSeq),
    "dicom-class" -> (obj => obj.series.flatMap(_.instance).map(_.sopClass).toSeq),
    "instance"    -> (obj => obj.series.flatMap(_.instance).map(_.uid).toSeq),
    "reason"      -> (obj => obj.reasonCode.toSeq),
    "bodysite"    -> (obj => obj.series.flatMap(_.bodySite).toSeq),
    "endpoint" -> (obj =>
      obj.endpoint.toSeq ++
        obj.series.flatMap(_.endpoint).toSeq),
    "referrer"    -> (obj => obj.referrer.toSeq),
    "interpreter" -> (obj => obj.interpreter.toSeq),
    "started"     -> (obj => obj.started.toSeq),
    "encounter"   -> (obj => obj.encounter.toSeq),
    "performer"   -> (obj => obj.series.flatMap(_.performer).map(_.actor).toSeq),
    "patient"     -> (obj => obj.subject.seqIf(_.reference.exists(_.contains("Patient/"))).toSeq),
    "status"      -> (obj => Seq(obj.status)),
    "modality"    -> (obj => obj.series.map(_.modality).toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ImagingStudy] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new ImagingStudy(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[IMAGINGSTUDY_STATUS]("status", None),
          cursor.decodeAs[Reference]("subject", None),
          cursor.decodeAs[Option[FHIRDateTime]]("started", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("basedOn", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Coding]]("modality", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("referrer", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("endpoint", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("location", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("reasonCode", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("interpreter", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("description", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("procedureCode", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UnsignedInt]]("numberOfSeries", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("reasonReference", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UnsignedInt]]("numberOfInstances", Some(None)),
          cursor.decodeAs[Option[Reference]]("procedureReference", Some(None)),
          cursor.decodeAs[LitSeq[ImagingStudy.Series]]("series", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a
  * set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context. A series
  * is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields note, status, subject, started, basedOn, modality, referrer, endpoint, location, encounter,
  *   identifier, reasonCode, interpreter, description, procedureCode, numberOfSeries, reasonReference, numberOfInstances,
  *   procedureReference, series.
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
  * @param note
  *   - Per the recommended DICOM mapping, this element is derived from the Study Description attribute (0008,1030). Observations
  *     or findings about the imaging study should be recorded in another resource, e.g. Observation, and not in this element.
  * @param status
  *   - The current state of the ImagingStudy.
  * @param subject
  *   - The subject, typically a patient, of the imaging study.
  * @param started
  *   - Date and time the study started.
  * @param basedOn
  *   - A list of the diagnostic requests that resulted in this imaging study being performed.
  * @param language
  *   - The base language in which the resource is written.
  * @param modality
  *   - A list of all the series.modality values that are actual acquisition modalities, i.e. those in the DICOM Context Group 29
  *     (value set OID 1.2.840.10008.6.1.19).
  * @param referrer
  *   - The requesting/referring physician.
  * @param endpoint
  *   - The network service providing access (e.g., query, view, or retrieval) for the study. See implementation notes for
  *     information about using DICOM endpoints. A study-level endpoint applies to each series in the study, unless overridden by
  *     a series-level endpoint with the same Endpoint.connectionType.
  * @param location
  *   - The principal physical location where the ImagingStudy was performed.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *     identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *     of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *     Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *     of the extension.
  * @param encounter
  *   - The healthcare event (e.g. a patient and healthcare provider interaction) during which this ImagingStudy is made.
  * @param identifier
  *   - Identifiers for the ImagingStudy such as DICOM Study Instance UID, and Accession Number.
  * @param reasonCode
  *   - Description of clinical condition indicating why the ImagingStudy was requested.
  * @param interpreter
  *   - Who read the study and interpreted the images or other content.
  * @param description
  *   - The Imaging Manager description of the study. Institution-generated description or classification of the Study (component)
  *     performed.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *     processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *     other profiles etc.
  * @param procedureCode
  *   - The code for the performed procedure type.
  * @param numberOfSeries
  *   - Number of Series in the Study. This value given may be larger than the number of series elements this Resource contains
  *     due to resource availability, security, or other factors. This element should be present if any series elements are
  *     present.
  * @param reasonReference
  *   - Indicates another resource whose existence justifies this Study.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *     the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *     Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *     strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *     extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *     processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of
  *     any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param numberOfInstances
  *   - Number of SOP Instances in Study. This value given may be larger than the number of instance elements this resource
  *     contains due to resource availability, security, or other factors. This element should be present if any instance elements
  *     are present.
  * @param procedureReference
  *   - The procedure which this ImagingStudy was part of.
  * @param series
  *   - Each study has one or more series of images or other content.
  */
@POJOBoilerplate
class ImagingStudy(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val note: LitSeq[Annotation] = LitSeq.empty,
    val status: IMAGINGSTUDY_STATUS,
    val subject: Reference,
    val started: Option[FHIRDateTime] = None,
    val basedOn: LitSeq[Reference] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    val modality: LitSeq[Coding] = LitSeq.empty,
    val referrer: Option[Reference] = None,
    val endpoint: LitSeq[Reference] = LitSeq.empty,
    val location: Option[Reference] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val encounter: Option[Reference] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
    val interpreter: LitSeq[Reference] = LitSeq.empty,
    val description: Option[String] = None,
    override val implicitRules: Option[UriStr] = None,
    val procedureCode: LitSeq[CodeableConcept] = LitSeq.empty,
    val numberOfSeries: Option[UnsignedInt] = None,
    val reasonReference: LitSeq[Reference] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val numberOfInstances: Option[UnsignedInt] = None,
    val procedureReference: Option[Reference] = None,
    val series: LitSeq[ImagingStudy.Series] = LitSeq.empty,
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
  override val thisTypeName: String = "ImagingStudy"
}
