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
import com.babylonhealth.lit.hl7.SPECIMEN_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Specimen extends CompanionFor[Specimen] {
  override type ResourceType = Specimen
  override type ParentType   = Specimen
  override val baseType: CompanionFor[ResourceType] = Specimen
  override val parentType: CompanionFor[ParentType] = Specimen
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Specimen")
  object Processing extends CompanionFor[Processing] {
    override type ResourceType = Processing
    override type ParentType   = Processing
    override val parentType: CompanionFor[ResourceType] = Processing
    type TimeChoice = Choice[Union_0934386166]
    def apply(
        id: Option[String] = None,
        time: Option[Processing.TimeChoice] = None,
        additive: LitSeq[Reference] = LitSeq.empty,
        extension: LitSeq[Extension] = LitSeq.empty,
        procedure: Option[CodeableConcept] = None,
        description: Option[String] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Processing = new Processing(
      id,
      time,
      additive,
      extension,
      procedure,
      description,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Processing): Option[(Option[String], Option[Processing.TimeChoice], LitSeq[Reference], LitSeq[Extension], Option[CodeableConcept], Option[String], LitSeq[Extension])] =
      Some((o.id, o.time, o.additive, o.extension, o.procedure, o.description, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val time: FHIRComponentFieldMeta[Option[Processing.TimeChoice]] =
      FHIRComponentFieldMeta("time", lTagOf[Option[Processing.TimeChoice]], true, lTagOf[Union_0934386166])
    val additive: FHIRComponentFieldMeta[LitSeq[Reference]] =
      FHIRComponentFieldMeta("additive", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val procedure: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("procedure", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val description: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, time, additive, extension, procedure, description, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Processing): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Processing.TimeChoice]](time, t.time),
      FHIRComponentField[LitSeq[Reference]](additive, t.additive),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[CodeableConcept]](procedure, t.procedure),
      FHIRComponentField[Option[String]](description, t.description),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Processing] = this
    val thisName: String                   = "Processing"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Processing] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Processing(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeOptRef[Union_0934386166]("time"),
            cursor.decodeAs[LitSeq[Reference]]("additive", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[CodeableConcept]]("procedure", Some(None)),
            cursor.decodeAs[Option[String]]("description", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Processing(
      override val id: Option[String] = None,
      val time: Option[Processing.TimeChoice] = None,
      val additive: LitSeq[Reference] = LitSeq.empty,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val procedure: Option[CodeableConcept] = None,
      val description: Option[String] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Collection extends CompanionFor[Collection] {
    override type ResourceType = Collection
    override type ParentType   = Collection
    override val parentType: CompanionFor[ResourceType] = Collection
    type CollectedChoice     = Choice[Union_0934386166]
    type FastingStatusChoice = Choice[Union01243416269]
    def apply(
        id: Option[String] = None,
        method: Option[CodeableConcept] = None,
        duration: Option[Duration] = None,
        quantity: Option[Quantity] = None,
        bodySite: Option[CodeableConcept] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        collector: Option[Reference] = None,
        collected: Option[Collection.CollectedChoice] = None,
        fastingStatus: Option[Collection.FastingStatusChoice] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Collection = new Collection(
      id,
      method,
      duration,
      quantity,
      bodySite,
      extension,
      collector,
      collected,
      fastingStatus,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Collection): Option[(Option[String], Option[CodeableConcept], Option[Duration], Option[Quantity], Option[CodeableConcept], LitSeq[Extension], Option[Reference], Option[Collection.CollectedChoice], Option[Collection.FastingStatusChoice], LitSeq[Extension])] =
      Some(
        (
          o.id,
          o.method,
          o.duration,
          o.quantity,
          o.bodySite,
          o.extension,
          o.collector,
          o.collected,
          o.fastingStatus,
          o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val method: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("method", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val duration: FHIRComponentFieldMeta[Option[Duration]] =
      FHIRComponentFieldMeta("duration", lTagOf[Option[Duration]], false, lTagOf[Duration])
    val quantity: FHIRComponentFieldMeta[Option[Quantity]] =
      FHIRComponentFieldMeta("quantity", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
    val bodySite: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("bodySite", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val collector: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("collector", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val collected: FHIRComponentFieldMeta[Option[Collection.CollectedChoice]] =
      FHIRComponentFieldMeta("collected", lTagOf[Option[Collection.CollectedChoice]], true, lTagOf[Union_0934386166])
    val fastingStatus: FHIRComponentFieldMeta[Option[Collection.FastingStatusChoice]] =
      FHIRComponentFieldMeta(
        "fastingStatus",
        lTagOf[Option[Collection.FastingStatusChoice]],
        true,
        lTagOf[Union01243416269])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, method, duration, quantity, bodySite, extension, collector, collected, fastingStatus, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Collection): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](method, t.method),
      FHIRComponentField[Option[Duration]](duration, t.duration),
      FHIRComponentField[Option[Quantity]](quantity, t.quantity),
      FHIRComponentField[Option[CodeableConcept]](bodySite, t.bodySite),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Reference]](collector, t.collector),
      FHIRComponentField[Option[Collection.CollectedChoice]](collected, t.collected),
      FHIRComponentField[Option[Collection.FastingStatusChoice]](fastingStatus, t.fastingStatus),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Collection] = this
    val thisName: String                   = "Collection"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Collection] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Collection(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("method", Some(None)),
            cursor.decodeAs[Option[Duration]]("duration", Some(None)),
            cursor.decodeAs[Option[Quantity]]("quantity", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("bodySite", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Reference]]("collector", Some(None)),
            cursor.decodeOptRef[Union_0934386166]("collected"),
            cursor.decodeOptRef[Union01243416269]("fastingStatus"),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Collection(
      override val id: Option[String] = None,
      val method: Option[CodeableConcept] = None,
      val duration: Option[Duration] = None,
      val quantity: Option[Quantity] = None,
      val bodySite: Option[CodeableConcept] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val collector: Option[Reference] = None,
      val collected: Option[Collection.CollectedChoice] = None,
      val fastingStatus: Option[Collection.FastingStatusChoice] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Container extends CompanionFor[Container] {
    override type ResourceType = Container
    override type ParentType   = Container
    override val parentType: CompanionFor[ResourceType] = Container
    type AdditiveChoice = Choice[Union01025009075]
    def apply(
        id: Option[String] = None,
        `type`: Option[CodeableConcept] = None,
        capacity: Option[Quantity] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        identifier: LitSeq[Identifier] = LitSeq.empty,
        description: Option[String] = None,
        additive: Option[Container.AdditiveChoice] = None,
        specimenQuantity: Option[Quantity] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Container = new Container(
      id,
      `type`,
      capacity,
      extension,
      identifier,
      description,
      additive,
      specimenQuantity,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Container): Option[(Option[String], Option[CodeableConcept], Option[Quantity], LitSeq[Extension], LitSeq[Identifier], Option[String], Option[Container.AdditiveChoice], Option[Quantity], LitSeq[Extension])] =
      Some(
        (
          o.id,
          o.`type`,
          o.capacity,
          o.extension,
          o.identifier,
          o.description,
          o.additive,
          o.specimenQuantity,
          o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val capacity: FHIRComponentFieldMeta[Option[Quantity]] =
      FHIRComponentFieldMeta("capacity", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
      FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
    val description: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
    val additive: FHIRComponentFieldMeta[Option[Container.AdditiveChoice]] =
      FHIRComponentFieldMeta("additive", lTagOf[Option[Container.AdditiveChoice]], true, lTagOf[Union01025009075])
    val specimenQuantity: FHIRComponentFieldMeta[Option[Quantity]] =
      FHIRComponentFieldMeta("specimenQuantity", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, `type`, capacity, extension, identifier, description, additive, specimenQuantity, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Container): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[Option[Quantity]](capacity, t.capacity),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
      FHIRComponentField[Option[String]](description, t.description),
      FHIRComponentField[Option[Container.AdditiveChoice]](additive, t.additive),
      FHIRComponentField[Option[Quantity]](specimenQuantity, t.specimenQuantity),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Container] = this
    val thisName: String                  = "Container"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Container] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Container(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
            cursor.decodeAs[Option[Quantity]]("capacity", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("description", Some(None)),
            cursor.decodeOptRef[Union01025009075]("additive"),
            cursor.decodeAs[Option[Quantity]]("specimenQuantity", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Container(
      override val id: Option[String] = None,
      val `type`: Option[CodeableConcept] = None,
      val capacity: Option[Quantity] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val identifier: LitSeq[Identifier] = LitSeq.empty,
      val description: Option[String] = None,
      val additive: Option[Container.AdditiveChoice] = None,
      val specimenQuantity: Option[Quantity] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      `type`: Option[CodeableConcept] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      status: Option[SPECIMEN_STATUS] = None,
      parent: LitSeq[Reference] = LitSeq.empty,
      subject: Option[Reference] = None,
      request: LitSeq[Reference] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      condition: LitSeq[CodeableConcept] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      receivedTime: Option[FHIRDateTime] = None,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      accessionIdentifier: Option[Identifier] = None,
      container: LitSeq[Specimen.Container] = LitSeq.empty,
      collection: Option[Specimen.Collection] = None,
      processing: LitSeq[Specimen.Processing] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Specimen = new Specimen(
    id,
    meta,
    text,
    `type`,
    note,
    status,
    parent,
    subject,
    request,
    language,
    contained,
    extension,
    condition,
    identifier,
    receivedTime,
    implicitRules,
    modifierExtension,
    accessionIdentifier,
    container,
    collection,
    processing,
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
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val status: FHIRComponentFieldMeta[Option[SPECIMEN_STATUS]] =
    FHIRComponentFieldMeta("status", lTagOf[Option[SPECIMEN_STATUS]], false, lTagOf[SPECIMEN_STATUS])
  val parent: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("parent", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val subject: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("subject", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val request: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("request", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val condition: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("condition", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val receivedTime: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("receivedTime", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val accessionIdentifier: FHIRComponentFieldMeta[Option[Identifier]] =
    FHIRComponentFieldMeta("accessionIdentifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
  val container: FHIRComponentFieldMeta[LitSeq[Specimen.Container]] =
    FHIRComponentFieldMeta("container", lTagOf[LitSeq[Specimen.Container]], false, lTagOf[Specimen.Container])
  val collection: FHIRComponentFieldMeta[Option[Specimen.Collection]] =
    FHIRComponentFieldMeta("collection", lTagOf[Option[Specimen.Collection]], false, lTagOf[Specimen.Collection])
  val processing: FHIRComponentFieldMeta[LitSeq[Specimen.Processing]] =
    FHIRComponentFieldMeta("processing", lTagOf[LitSeq[Specimen.Processing]], false, lTagOf[Specimen.Processing])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    `type`,
    note,
    status,
    parent,
    subject,
    request,
    language,
    contained,
    extension,
    condition,
    identifier,
    receivedTime,
    implicitRules,
    modifierExtension,
    accessionIdentifier,
    container,
    collection,
    processing
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Specimen): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
    FHIRComponentField[LitSeq[Annotation]](note, t.note),
    FHIRComponentField[Option[SPECIMEN_STATUS]](status, t.status),
    FHIRComponentField[LitSeq[Reference]](parent, t.parent),
    FHIRComponentField[Option[Reference]](subject, t.subject),
    FHIRComponentField[LitSeq[Reference]](request, t.request),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[CodeableConcept]](condition, t.condition),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[FHIRDateTime]](receivedTime, t.receivedTime),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Option[Identifier]](accessionIdentifier, t.accessionIdentifier),
    FHIRComponentField[LitSeq[Specimen.Container]](container, t.container),
    FHIRComponentField[Option[Specimen.Collection]](collection, t.collection),
    FHIRComponentField[LitSeq[Specimen.Processing]](processing, t.processing)
  )
  def extractId(t: Specimen): Option[String]                      = t.id
  def extractMeta(t: Specimen): Option[Meta]                      = t.meta
  def extractText(t: Specimen): Option[Narrative]                 = t.text
  def extractType(t: Specimen): Option[CodeableConcept]           = t.`type`
  def extractNote(t: Specimen): LitSeq[Annotation]                = t.note
  def extractStatus(t: Specimen): Option[SPECIMEN_STATUS]         = t.status
  def extractParent(t: Specimen): LitSeq[Reference]               = t.parent
  def extractSubject(t: Specimen): Option[Reference]              = t.subject
  def extractRequest(t: Specimen): LitSeq[Reference]              = t.request
  def extractLanguage(t: Specimen): Option[LANGUAGES]             = t.language
  def extractContained(t: Specimen): LitSeq[Resource]             = t.contained
  def extractExtension(t: Specimen): LitSeq[Extension]            = t.extension
  def extractCondition(t: Specimen): LitSeq[CodeableConcept]      = t.condition
  def extractIdentifier(t: Specimen): LitSeq[Identifier]          = t.identifier
  def extractReceivedTime(t: Specimen): Option[FHIRDateTime]      = t.receivedTime
  def extractImplicitRules(t: Specimen): Option[UriStr]           = t.implicitRules
  def extractModifierExtension(t: Specimen): LitSeq[Extension]    = t.modifierExtension
  def extractAccessionIdentifier(t: Specimen): Option[Identifier] = t.accessionIdentifier
  def extractContainer(t: Specimen): LitSeq[Specimen.Container]   = t.container
  def extractCollection(t: Specimen): Option[Specimen.Collection] = t.collection
  def extractProcessing(t: Specimen): LitSeq[Specimen.Processing] = t.processing
  override val thisName: String                                   = "Specimen"
  override val searchParams: Map[String, Specimen => Seq[Any]] = Map(
    "parent"       -> (obj => obj.parent.toSeq),
    "collector"    -> (obj => obj.collection.flatMap(_.collector).toSeq),
    "subject"      -> (obj => obj.subject.toSeq),
    "identifier"   -> (obj => obj.identifier.toSeq),
    "collected"    -> (obj => obj.collection.flatMap(_.collected).toSeq),
    "container"    -> (obj => obj.container.flatMap(_.`type`).toSeq),
    "accession"    -> (obj => obj.accessionIdentifier.toSeq),
    "status"       -> (obj => obj.status.toSeq),
    "bodysite"     -> (obj => obj.collection.flatMap(_.bodySite).toSeq),
    "container-id" -> (obj => obj.container.flatMap(_.identifier).toSeq),
    "type"         -> (obj => obj.`type`.toSeq),
    "patient"      -> (obj => obj.subject.filter(_.reference.exists(_.contains("Patient/"))).toSeq)
  )
  def unapply(
      o: Specimen): Option[(Option[String], Option[Meta], Option[Narrative], Option[CodeableConcept], LitSeq[Annotation], Option[SPECIMEN_STATUS], LitSeq[Reference], Option[Reference], LitSeq[Reference], Option[LANGUAGES], LitSeq[Resource], LitSeq[Extension], LitSeq[CodeableConcept], LitSeq[Identifier], Option[FHIRDateTime], Option[UriStr], LitSeq[Extension], Option[Identifier], LitSeq[Specimen.Container], Option[Specimen.Collection], LitSeq[Specimen.Processing])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.`type`,
        o.note,
        o.status,
        o.parent,
        o.subject,
        o.request,
        o.language,
        o.contained,
        o.extension,
        o.condition,
        o.identifier,
        o.receivedTime,
        o.implicitRules,
        o.modifierExtension,
        o.accessionIdentifier,
        o.container,
        o.collection,
        o.processing))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Specimen] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Specimen(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[Option[SPECIMEN_STATUS]]("status", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("parent", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("subject", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("request", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("condition", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[FHIRDateTime]]("receivedTime", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Identifier]]("accessionIdentifier", Some(None)),
          cursor.decodeAs[LitSeq[Specimen.Container]]("container", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Specimen.Collection]]("collection", Some(None)),
          cursor.decodeAs[LitSeq[Specimen.Processing]]("processing", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** A sample to be used for analysis.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields `type`, note, status, parent, subject, request, condition, identifier, receivedTime, accessionIdentifier, container, collection, processing.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param `type` - The kind of material that forms the specimen.
  * @param note - To communicate any details or issues about the specimen or during the specimen collection. (for example: broken vial, sent with patient, frozen).
  * @param status - The availability of the specimen.
  * @param parent - Reference to the parent (source) specimen which is used when the specimen was either derived from or a component of another specimen.
  * @param subject - Where the specimen came from. This may be from patient(s), from a location (e.g., the source of an environmental sample), or a sampling of a substance or a device.
  * @param request - Details concerning a service request that required a specimen to be collected.
  * @param language - The base language in which the resource is written.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param condition - A mode or state of being that describes the nature of the specimen.
  * @param identifier - Id for specimen.
  * @param receivedTime - Time when specimen was received for processing or testing.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param accessionIdentifier - The identifier assigned by the lab when accessioning specimen(s). This is not necessarily the same as the specimen identifier, depending on local lab procedures.
  * @param container - The container holding the specimen.  The recursive nature of containers; i.e. blood in tube in tray in rack is not addressed here.
  * @param collection - Details concerning the specimen collection.
  * @param processing - Details concerning processing and processing steps for the specimen.
  */
@POJOBoilerplate
class Specimen(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val `type`: Option[CodeableConcept] = None,
    val note: LitSeq[Annotation] = LitSeq.empty,
    val status: Option[SPECIMEN_STATUS] = None,
    val parent: LitSeq[Reference] = LitSeq.empty,
    val subject: Option[Reference] = None,
    val request: LitSeq[Reference] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val condition: LitSeq[CodeableConcept] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val receivedTime: Option[FHIRDateTime] = None,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val accessionIdentifier: Option[Identifier] = None,
    val container: LitSeq[Specimen.Container] = LitSeq.empty,
    val collection: Option[Specimen.Collection] = None,
    val processing: LitSeq[Specimen.Processing] = LitSeq.empty,
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
  override val thisTypeName: String = "Specimen"
}
