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
import com.babylonhealth.lit.hl7.{ PRODUCT_CATEGORY, PRODUCT_STORAGE_SCALE, PRODUCT_STATUS }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object BiologicallyDerivedProduct extends CompanionFor[BiologicallyDerivedProduct] {
  implicit def summonObjectAndCompanionBiologicallyDerivedProduct_471301622(
      o: BiologicallyDerivedProduct): ObjectAndCompanion[BiologicallyDerivedProduct, BiologicallyDerivedProduct.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = BiologicallyDerivedProduct
  override type ParentType   = BiologicallyDerivedProduct
  override val baseType: CompanionFor[ResourceType] = BiologicallyDerivedProduct
  override val parentType: CompanionFor[ParentType] = BiologicallyDerivedProduct
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/BiologicallyDerivedProduct")
  object Manipulation extends CompanionFor[Manipulation] {
    implicit def summonObjectAndCompanionManipulation_1797640286(
        o: Manipulation): ObjectAndCompanion[Manipulation, Manipulation.type] = ObjectAndCompanion(o, this)
    override type ResourceType = Manipulation
    override type ParentType   = Manipulation
    override val parentType: CompanionFor[ResourceType] = Manipulation
    type TimeChoice = Choice[Union_0934386166]
    def apply(
        id: Option[String] = None,
        time: Option[Manipulation.TimeChoice] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        description: Option[String] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Manipulation = new Manipulation(
      id,
      time,
      extension,
      description,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Manipulation): Option[(Option[String], Option[Manipulation.TimeChoice], LitSeq[Extension], Option[String], LitSeq[Extension])] =
      Some((o.id, o.time, o.extension, o.description, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val time: FHIRComponentFieldMeta[Option[Manipulation.TimeChoice]] =
      FHIRComponentFieldMeta("time", lTagOf[Option[Manipulation.TimeChoice]], true, lTagOf[Union_0934386166])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val description: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, time, extension, description, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Manipulation): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Manipulation.TimeChoice]](time, t.time),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[String]](description, t.description),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Manipulation] = this
    val thisName: String                     = "Manipulation"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Manipulation] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Manipulation(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeOptRef[Union_0934386166]("time"),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("description", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Manipulation(
      override val id: Option[String] = None,
      val time: Option[Manipulation.TimeChoice] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val description: Option[String] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Processing extends CompanionFor[Processing] {
    implicit def summonObjectAndCompanionProcessing1932650747(o: Processing): ObjectAndCompanion[Processing, Processing.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Processing
    override type ParentType   = Processing
    override val parentType: CompanionFor[ResourceType] = Processing
    type TimeChoice = Choice[Union_0934386166]
    def apply(
        id: Option[String] = None,
        time: Option[Processing.TimeChoice] = None,
        additive: Option[Reference] = None,
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
        o: Processing): Option[(Option[String], Option[Processing.TimeChoice], Option[Reference], LitSeq[Extension], Option[CodeableConcept], Option[String], LitSeq[Extension])] =
      Some((o.id, o.time, o.additive, o.extension, o.procedure, o.description, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val time: FHIRComponentFieldMeta[Option[Processing.TimeChoice]] =
      FHIRComponentFieldMeta("time", lTagOf[Option[Processing.TimeChoice]], true, lTagOf[Union_0934386166])
    val additive: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("additive", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val procedure: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("procedure", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val description: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, time, additive, extension, procedure, description, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Processing): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Processing.TimeChoice]](time, t.time),
      FHIRComponentField[Option[Reference]](additive, t.additive),
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
            cursor.decodeAs[Option[Reference]]("additive", Some(None)),
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
      val additive: Option[Reference] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val procedure: Option[CodeableConcept] = None,
      val description: Option[String] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Collection extends CompanionFor[Collection] {
    implicit def summonObjectAndCompanionCollection_1421745841(o: Collection): ObjectAndCompanion[Collection, Collection.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Collection
    override type ParentType   = Collection
    override val parentType: CompanionFor[ResourceType] = Collection
    type CollectedChoice = Choice[Union_0934386166]
    def apply(
        id: Option[String] = None,
        source: Option[Reference] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        collector: Option[Reference] = None,
        collected: Option[Collection.CollectedChoice] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Collection = new Collection(
      id,
      source,
      extension,
      collector,
      collected,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Collection): Option[(Option[String], Option[Reference], LitSeq[Extension], Option[Reference], Option[Collection.CollectedChoice], LitSeq[Extension])] =
      Some((o.id, o.source, o.extension, o.collector, o.collected, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val source: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("source", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val collector: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("collector", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val collected: FHIRComponentFieldMeta[Option[Collection.CollectedChoice]] =
      FHIRComponentFieldMeta("collected", lTagOf[Option[Collection.CollectedChoice]], true, lTagOf[Union_0934386166])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, source, extension, collector, collected, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Collection): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Reference]](source, t.source),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Reference]](collector, t.collector),
      FHIRComponentField[Option[Collection.CollectedChoice]](collected, t.collected),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Collection] = this
    val thisName: String                   = "Collection"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Collection] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Collection(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[Reference]]("source", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Reference]]("collector", Some(None)),
            cursor.decodeOptRef[Union_0934386166]("collected"),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Collection(
      override val id: Option[String] = None,
      val source: Option[Reference] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val collector: Option[Reference] = None,
      val collected: Option[Collection.CollectedChoice] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Storage extends CompanionFor[Storage] {
    implicit def summonObjectAndCompanionStorage1150179316(o: Storage): ObjectAndCompanion[Storage, Storage.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Storage
    override type ParentType   = Storage
    override val parentType: CompanionFor[ResourceType] = Storage
    def apply(
        id: Option[String] = None,
        scale: Option[PRODUCT_STORAGE_SCALE] = None,
        duration: Option[Period] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        description: Option[String] = None,
        temperature: Option[BigDecimal] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Storage = new Storage(
      id,
      scale,
      duration,
      extension,
      description,
      temperature,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Storage): Option[(Option[String], Option[PRODUCT_STORAGE_SCALE], Option[Period], LitSeq[Extension], Option[String], Option[BigDecimal], LitSeq[Extension])] =
      Some((o.id, o.scale, o.duration, o.extension, o.description, o.temperature, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val scale: FHIRComponentFieldMeta[Option[PRODUCT_STORAGE_SCALE]] =
      FHIRComponentFieldMeta("scale", lTagOf[Option[PRODUCT_STORAGE_SCALE]], false, lTagOf[PRODUCT_STORAGE_SCALE])
    val duration: FHIRComponentFieldMeta[Option[Period]] =
      FHIRComponentFieldMeta("duration", lTagOf[Option[Period]], false, lTagOf[Period])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val description: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
    val temperature: FHIRComponentFieldMeta[Option[BigDecimal]] =
      FHIRComponentFieldMeta("temperature", lTagOf[Option[BigDecimal]], false, lTagOf[BigDecimal])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, scale, duration, extension, description, temperature, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Storage): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[PRODUCT_STORAGE_SCALE]](scale, t.scale),
      FHIRComponentField[Option[Period]](duration, t.duration),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[String]](description, t.description),
      FHIRComponentField[Option[BigDecimal]](temperature, t.temperature),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Storage] = this
    val thisName: String                = "Storage"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Storage] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Storage(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[PRODUCT_STORAGE_SCALE]]("scale", Some(None)),
            cursor.decodeAs[Option[Period]]("duration", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("description", Some(None)),
            cursor.decodeAs[Option[BigDecimal]]("temperature", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Storage(
      override val id: Option[String] = None,
      val scale: Option[PRODUCT_STORAGE_SCALE] = None,
      val duration: Option[Period] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val description: Option[String] = None,
      val temperature: Option[BigDecimal] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      status: Option[PRODUCT_STATUS] = None,
      parent: LitSeq[Reference] = LitSeq.empty,
      request: LitSeq[Reference] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      quantity: Option[Int] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      productCode: Option[CodeableConcept] = None,
      implicitRules: Option[UriStr] = None,
      productCategory: Option[PRODUCT_CATEGORY] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      storage: LitSeq[BiologicallyDerivedProduct.Storage] = LitSeq.empty,
      collection: Option[BiologicallyDerivedProduct.Collection] = None,
      processing: LitSeq[BiologicallyDerivedProduct.Processing] = LitSeq.empty,
      manipulation: Option[BiologicallyDerivedProduct.Manipulation] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): BiologicallyDerivedProduct = new BiologicallyDerivedProduct(
    id,
    meta,
    text,
    status,
    parent,
    request,
    language,
    quantity,
    contained,
    extension,
    identifier,
    productCode,
    implicitRules,
    productCategory,
    modifierExtension,
    storage,
    collection,
    processing,
    manipulation,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val status: FHIRComponentFieldMeta[Option[PRODUCT_STATUS]] =
    FHIRComponentFieldMeta("status", lTagOf[Option[PRODUCT_STATUS]], false, lTagOf[PRODUCT_STATUS])
  val parent: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("parent", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val request: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("request", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val quantity: FHIRComponentFieldMeta[Option[Int]] =
    FHIRComponentFieldMeta("quantity", lTagOf[Option[Int]], false, lTagOf[Int])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val productCode: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("productCode", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val productCategory: FHIRComponentFieldMeta[Option[PRODUCT_CATEGORY]] =
    FHIRComponentFieldMeta("productCategory", lTagOf[Option[PRODUCT_CATEGORY]], false, lTagOf[PRODUCT_CATEGORY])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val storage: FHIRComponentFieldMeta[LitSeq[BiologicallyDerivedProduct.Storage]] =
    FHIRComponentFieldMeta(
      "storage",
      lTagOf[LitSeq[BiologicallyDerivedProduct.Storage]],
      false,
      lTagOf[BiologicallyDerivedProduct.Storage])
  val collection: FHIRComponentFieldMeta[Option[BiologicallyDerivedProduct.Collection]] =
    FHIRComponentFieldMeta(
      "collection",
      lTagOf[Option[BiologicallyDerivedProduct.Collection]],
      false,
      lTagOf[BiologicallyDerivedProduct.Collection])
  val processing: FHIRComponentFieldMeta[LitSeq[BiologicallyDerivedProduct.Processing]] =
    FHIRComponentFieldMeta(
      "processing",
      lTagOf[LitSeq[BiologicallyDerivedProduct.Processing]],
      false,
      lTagOf[BiologicallyDerivedProduct.Processing])
  val manipulation: FHIRComponentFieldMeta[Option[BiologicallyDerivedProduct.Manipulation]] =
    FHIRComponentFieldMeta(
      "manipulation",
      lTagOf[Option[BiologicallyDerivedProduct.Manipulation]],
      false,
      lTagOf[BiologicallyDerivedProduct.Manipulation])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    status,
    parent,
    request,
    language,
    quantity,
    contained,
    extension,
    identifier,
    productCode,
    implicitRules,
    productCategory,
    modifierExtension,
    storage,
    collection,
    processing,
    manipulation
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: BiologicallyDerivedProduct): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[PRODUCT_STATUS]](status, t.status),
    FHIRComponentField[LitSeq[Reference]](parent, t.parent),
    FHIRComponentField[LitSeq[Reference]](request, t.request),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Option[Int]](quantity, t.quantity),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[CodeableConcept]](productCode, t.productCode),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[PRODUCT_CATEGORY]](productCategory, t.productCategory),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[BiologicallyDerivedProduct.Storage]](storage, t.storage),
    FHIRComponentField[Option[BiologicallyDerivedProduct.Collection]](collection, t.collection),
    FHIRComponentField[LitSeq[BiologicallyDerivedProduct.Processing]](processing, t.processing),
    FHIRComponentField[Option[BiologicallyDerivedProduct.Manipulation]](manipulation, t.manipulation)
  )
  def extractId(t: BiologicallyDerivedProduct): Option[String]                                            = t.id
  def extractMeta(t: BiologicallyDerivedProduct): Option[Meta]                                            = t.meta
  def extractText(t: BiologicallyDerivedProduct): Option[Narrative]                                       = t.text
  def extractStatus(t: BiologicallyDerivedProduct): Option[PRODUCT_STATUS]                                = t.status
  def extractParent(t: BiologicallyDerivedProduct): LitSeq[Reference]                                     = t.parent
  def extractRequest(t: BiologicallyDerivedProduct): LitSeq[Reference]                                    = t.request
  def extractLanguage(t: BiologicallyDerivedProduct): Option[LANGUAGES]                                   = t.language
  def extractQuantity(t: BiologicallyDerivedProduct): Option[Int]                                         = t.quantity
  def extractContained(t: BiologicallyDerivedProduct): LitSeq[Resource]                                   = t.contained
  def extractExtension(t: BiologicallyDerivedProduct): LitSeq[Extension]                                  = t.extension
  def extractIdentifier(t: BiologicallyDerivedProduct): LitSeq[Identifier]                                = t.identifier
  def extractProductCode(t: BiologicallyDerivedProduct): Option[CodeableConcept]                          = t.productCode
  def extractImplicitRules(t: BiologicallyDerivedProduct): Option[UriStr]                                 = t.implicitRules
  def extractProductCategory(t: BiologicallyDerivedProduct): Option[PRODUCT_CATEGORY]                     = t.productCategory
  def extractModifierExtension(t: BiologicallyDerivedProduct): LitSeq[Extension]                          = t.modifierExtension
  def extractStorage(t: BiologicallyDerivedProduct): LitSeq[BiologicallyDerivedProduct.Storage]           = t.storage
  def extractCollection(t: BiologicallyDerivedProduct): Option[BiologicallyDerivedProduct.Collection]     = t.collection
  def extractProcessing(t: BiologicallyDerivedProduct): LitSeq[BiologicallyDerivedProduct.Processing]     = t.processing
  def extractManipulation(t: BiologicallyDerivedProduct): Option[BiologicallyDerivedProduct.Manipulation] = t.manipulation
  override val thisName: String = "BiologicallyDerivedProduct"
  def unapply(
      o: BiologicallyDerivedProduct): Option[(Option[String], Option[Meta], Option[Narrative], Option[PRODUCT_STATUS], LitSeq[Reference], LitSeq[Reference], Option[LANGUAGES], Option[Int], LitSeq[Resource], LitSeq[Extension], LitSeq[Identifier], Option[CodeableConcept], Option[UriStr], Option[PRODUCT_CATEGORY], LitSeq[Extension], LitSeq[BiologicallyDerivedProduct.Storage], Option[BiologicallyDerivedProduct.Collection], LitSeq[BiologicallyDerivedProduct.Processing], Option[BiologicallyDerivedProduct.Manipulation])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.status,
        o.parent,
        o.request,
        o.language,
        o.quantity,
        o.contained,
        o.extension,
        o.identifier,
        o.productCode,
        o.implicitRules,
        o.productCategory,
        o.modifierExtension,
        o.storage,
        o.collection,
        o.processing,
        o.manipulation))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[BiologicallyDerivedProduct] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new BiologicallyDerivedProduct(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[PRODUCT_STATUS]]("status", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("parent", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("request", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[Int]]("quantity", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("productCode", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[PRODUCT_CATEGORY]]("productCategory", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[BiologicallyDerivedProduct.Storage]]("storage", Some(LitSeq.empty)),
          cursor.decodeAs[Option[BiologicallyDerivedProduct.Collection]]("collection", Some(None)),
          cursor.decodeAs[LitSeq[BiologicallyDerivedProduct.Processing]]("processing", Some(LitSeq.empty)),
          cursor.decodeAs[Option[BiologicallyDerivedProduct.Manipulation]]("manipulation", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** A material substance originating from a biological entity intended to be transplanted or infused into another (possibly the
  * same) biological entity.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields status, parent, request, quantity, identifier, productCode, productCategory, storage, collection,
  *   processing, manipulation.
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
  * @param status
  *   - Whether the product is currently available.
  * @param parent
  *   - Parent product (if any).
  * @param request
  *   - Procedure request to obtain this biologically derived product.
  * @param language
  *   - The base language in which the resource is written.
  * @param quantity
  *   - Number of discrete units within this product.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param identifier
  *   - This records identifiers associated with this biologically derived product instance that are defined by business processes
  *   and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or
  *   in written / printed documentation).
  * @param productCode
  *   - A code that identifies the kind of this biologically derived product (SNOMED Ctcode).
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param productCategory
  *   - Broad category of this product.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *   the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually
  *   modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict
  *   set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param storage
  *   - Product storage.
  * @param collection
  *   - How this product was collected.
  * @param processing
  *   - Any processing of the product during collection that does not change the fundamental nature of the product. For example
  *   adding anti-coagulants during the collection of Peripheral Blood Stem Cells.
  * @param manipulation
  *   - Any manipulation of product post-collection that is intended to alter the product. For example a buffy-coat enrichment or
  *   CD8 reduction of Peripheral Blood Stem Cells to make it more suitable for infusion.
  */
@POJOBoilerplate
class BiologicallyDerivedProduct(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val status: Option[PRODUCT_STATUS] = None,
    val parent: LitSeq[Reference] = LitSeq.empty,
    val request: LitSeq[Reference] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    val quantity: Option[Int] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val productCode: Option[CodeableConcept] = None,
    override val implicitRules: Option[UriStr] = None,
    val productCategory: Option[PRODUCT_CATEGORY] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val storage: LitSeq[BiologicallyDerivedProduct.Storage] = LitSeq.empty,
    val collection: Option[BiologicallyDerivedProduct.Collection] = None,
    val processing: LitSeq[BiologicallyDerivedProduct.Processing] = LitSeq.empty,
    val manipulation: Option[BiologicallyDerivedProduct.Manipulation] = None,
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
  override val thisTypeName: String = "BiologicallyDerivedProduct"
}
