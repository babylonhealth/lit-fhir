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
import com.babylonhealth.lit.hl7.LINKAGE_TYPE
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Linkage extends CompanionFor[Linkage] {
  implicit def summonObjectAndCompanionLinkage_473390800(o: Linkage): ObjectAndCompanion[Linkage, Linkage.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Linkage
  override type ParentType   = Linkage
  override val baseType: CompanionFor[ResourceType] = Linkage
  override val parentType: CompanionFor[ParentType] = Linkage
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Linkage")
  object Item extends CompanionFor[Item] {
    implicit def summonObjectAndCompanionItem_611496630(o: Item): ObjectAndCompanion[Item, Item.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Item
    override type ParentType   = Item
    override val parentType: CompanionFor[ResourceType] = Item
    def apply(
        id: Option[String] = None,
        `type`: LINKAGE_TYPE,
        resource: Reference,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Item = new Item(
      id,
      `type`,
      resource,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(o: Item): Option[(Option[String], LINKAGE_TYPE, Reference, LitSeq[Extension], LitSeq[Extension])] = Some(
      (o.id, o.`type`, o.resource, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[LINKAGE_TYPE] =
      FHIRComponentFieldMeta("type", lTagOf[LINKAGE_TYPE], false, lTagOf[LINKAGE_TYPE])
    val resource: FHIRComponentFieldMeta[Reference] =
      FHIRComponentFieldMeta("resource", lTagOf[Reference], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, `type`, resource, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Item): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LINKAGE_TYPE](`type`, t.`type`),
      FHIRComponentField[Reference](resource, t.resource),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Item] = this
    val thisName: String             = "Item"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Item] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Item(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LINKAGE_TYPE]("type", None),
            cursor.decodeAs[Reference]("resource", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Item(
      override val id: Option[String] = None,
      val `type`: LINKAGE_TYPE,
      val resource: Reference,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      active: Option[Boolean] = None,
      author: Option[Reference] = None,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      item: NonEmptyLitSeq[Linkage.Item],
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Linkage = new Linkage(
    id,
    meta,
    text,
    active,
    author,
    language,
    contained,
    extension,
    implicitRules,
    modifierExtension,
    item,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val active: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("active", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val author: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("author", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val item: FHIRComponentFieldMeta[NonEmptyLitSeq[Linkage.Item]] =
    FHIRComponentFieldMeta("item", lTagOf[NonEmptyLitSeq[Linkage.Item]], false, lTagOf[Linkage.Item])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
    Seq(id, meta, text, active, author, language, contained, extension, implicitRules, modifierExtension, item)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Linkage): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[Boolean]](active, t.active),
    FHIRComponentField[Option[Reference]](author, t.author),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[NonEmptyLitSeq[Linkage.Item]](item, t.item)
  )
  def extractId(t: Linkage): Option[String]                   = t.id
  def extractMeta(t: Linkage): Option[Meta]                   = t.meta
  def extractText(t: Linkage): Option[Narrative]              = t.text
  def extractActive(t: Linkage): Option[Boolean]              = t.active
  def extractAuthor(t: Linkage): Option[Reference]            = t.author
  def extractLanguage(t: Linkage): Option[LANGUAGES]          = t.language
  def extractContained(t: Linkage): LitSeq[Resource]          = t.contained
  def extractExtension(t: Linkage): LitSeq[Extension]         = t.extension
  def extractImplicitRules(t: Linkage): Option[UriStr]        = t.implicitRules
  def extractModifierExtension(t: Linkage): LitSeq[Extension] = t.modifierExtension
  def extractItem(t: Linkage): NonEmptyLitSeq[Linkage.Item]   = t.item
  override val thisName: String                               = "Linkage"
  override val searchParams: Map[String, Linkage => Seq[Any]] = Map(
    "author" -> (obj => obj.author.toSeq),
    "item"   -> (obj => obj.item.map(_.resource).toSeq),
    "source" -> (obj => obj.item.map(_.resource).toSeq)
  )
  def unapply(
      o: Linkage): Option[(Option[String], Option[Meta], Option[Narrative], Option[Boolean], Option[Reference], Option[LANGUAGES], LitSeq[Resource], LitSeq[Extension], Option[UriStr], LitSeq[Extension], NonEmptyLitSeq[Linkage.Item])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.active,
        o.author,
        o.language,
        o.contained,
        o.extension,
        o.implicitRules,
        o.modifierExtension,
        o.item))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Linkage] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Linkage(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[Boolean]]("active", Some(None)),
          cursor.decodeAs[Option[Reference]]("author", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[NonEmptyLitSeq[Linkage.Item]]("item", None),
          decodeAttributes(cursor)
        )
      ))
}

/** Identifies two or more records (resource instances) that refer to the same real-world "occurrence".
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields active, author, item.
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
  * @param active
  *   - Indicates whether the asserted set of linkages are considered to be "in effect".
  * @param author
  *   - Identifies the user or organization responsible for asserting the linkages as well as the user or organization who
  *   establishes the context in which the nature of each linkage is evaluated.
  * @param language
  *   - The base language in which the resource is written.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *   the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually
  *   modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict
  *   set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param item
  *   - Identifies which record considered as the reference to the same real-world occurrence as well as how the items should be
  *   evaluated within the collection of linked items.
  */
@POJOBoilerplate
class Linkage(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val active: Option[Boolean] = None,
    val author: Option[Reference] = None,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val item: NonEmptyLitSeq[Linkage.Item],
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
  override val thisTypeName: String = "Linkage"
}
