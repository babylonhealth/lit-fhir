package com.babylonhealth.lit.usbase.model

import java.time.{ LocalDate, LocalTime, ZonedDateTime }
import java.util.UUID

import scala.collection.immutable.TreeMap
import scala.util.Try

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
import com.babylonhealth.lit.usbase.UnionAliases._
import com.babylonhealth.lit.hl7.GROUP_TYPE
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Actualgroup extends CompanionFor[Actualgroup] {
  override val baseType: CompanionFor[Group] = Group
  override val profileUrl: Option[String]    = Some("http://hl7.org/fhir/StructureDefinition/actualgroup")
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(new Meta(profile = LitSeq("http://hl7.org/fhir/StructureDefinition/actualgroup"))),
      text: Option[Narrative] = None,
      `type`: GROUP_TYPE,
      code: Option[CodeableConcept] = None,
      name: Option[String] = None,
      active: Option[Boolean] = None,
      actual: Boolean,
      language: Option[LANGUAGES] = None,
      quantity: Option[UnsignedInt] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      managingEntity: Option[Reference] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      member: LitSeq[Group.Member] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Actualgroup = new Actualgroup(
    id,
    meta,
    text,
    `type`,
    code,
    name,
    active,
    actual,
    language,
    quantity,
    contained,
    extension,
    identifier,
    implicitRules,
    managingEntity,
    modifierExtension,
    member,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val `type`: FHIRComponentFieldMeta[GROUP_TYPE] =
    FHIRComponentFieldMeta("type", lTagOf[GROUP_TYPE], false, lTagOf[GROUP_TYPE])
  val code: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("code", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val name: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("name", lTagOf[Option[String]], false, lTagOf[String])
  val active: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("active", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val actual: FHIRComponentFieldMeta[Boolean] =
    FHIRComponentFieldMeta("actual", lTagOf[Boolean], false, lTagOf[Boolean])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val quantity: FHIRComponentFieldMeta[Option[UnsignedInt]] =
    FHIRComponentFieldMeta("quantity", lTagOf[Option[UnsignedInt]], false, lTagOf[UnsignedInt])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val managingEntity: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("managingEntity", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val member: FHIRComponentFieldMeta[LitSeq[Group.Member]] =
    FHIRComponentFieldMeta("member", lTagOf[LitSeq[Group.Member]], false, lTagOf[Group.Member])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    `type`,
    code,
    name,
    active,
    actual,
    language,
    quantity,
    contained,
    extension,
    identifier,
    implicitRules,
    managingEntity,
    modifierExtension,
    member)
  override def fields(t: Actualgroup): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[GROUP_TYPE](`type`, t.`type`),
    FHIRComponentField[Option[CodeableConcept]](code, t.code),
    FHIRComponentField[Option[String]](name, t.name),
    FHIRComponentField[Option[Boolean]](active, t.active),
    FHIRComponentField[Boolean](actual, t.actual),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Option[UnsignedInt]](quantity, t.quantity),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[Reference]](managingEntity, t.managingEntity),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[Group.Member]](member, t.member)
  )
  def extractId(t: Actualgroup): Option[String]                   = t.id
  def extractMeta(t: Actualgroup): Option[Meta]                   = t.meta
  def extractText(t: Actualgroup): Option[Narrative]              = t.text
  def extractType(t: Actualgroup): GROUP_TYPE                     = t.`type`
  def extractCode(t: Actualgroup): Option[CodeableConcept]        = t.code
  def extractName(t: Actualgroup): Option[String]                 = t.name
  def extractActive(t: Actualgroup): Option[Boolean]              = t.active
  def extractActual(t: Actualgroup): Boolean                      = t.actual
  def extractLanguage(t: Actualgroup): Option[LANGUAGES]          = t.language
  def extractQuantity(t: Actualgroup): Option[UnsignedInt]        = t.quantity
  def extractContained(t: Actualgroup): LitSeq[Resource]          = t.contained
  def extractExtension(t: Actualgroup): LitSeq[Extension]         = t.extension
  def extractIdentifier(t: Actualgroup): LitSeq[Identifier]       = t.identifier
  def extractImplicitRules(t: Actualgroup): Option[UriStr]        = t.implicitRules
  def extractManagingEntity(t: Actualgroup): Option[Reference]    = t.managingEntity
  def extractModifierExtension(t: Actualgroup): LitSeq[Extension] = t.modifierExtension
  def extractMember(t: Actualgroup): LitSeq[Group.Member]         = t.member
  override val thisName: String                                   = "Actualgroup"
  override val searchParams: Map[String, Actualgroup => Seq[Any]] = Group.searchParams
  def unapply(
      o: Actualgroup): Option[(Option[String], Option[Meta], Option[Narrative], GROUP_TYPE, Option[CodeableConcept], Option[String], Option[Boolean], Boolean, Option[LANGUAGES], Option[UnsignedInt], LitSeq[Resource], LitSeq[Extension], LitSeq[Identifier], Option[UriStr], Option[Reference], LitSeq[Extension], LitSeq[Group.Member])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.`type`,
        o.code,
        o.name,
        o.active,
        o.actual,
        o.language,
        o.quantity,
        o.contained,
        o.extension,
        o.identifier,
        o.implicitRules,
        o.managingEntity,
        o.modifierExtension,
        o.member))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Actualgroup] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Actualgroup(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[GROUP_TYPE]("type", None),
          cursor.decodeAs[Option[CodeableConcept]]("code", Some(None)),
          cursor.decodeAs[Option[String]]("name", Some(None)),
          cursor.decodeAs[Option[Boolean]]("active", Some(None)),
          cursor.decodeAs[Boolean]("actual", None),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[UnsignedInt]]("quantity", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[Reference]]("managingEntity", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Group.Member]]("member", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Enforces an actual group, rather than a definitional group
  *
  *  Subclass of [[hl7.model.Group]] (Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively, and are not formally or legally recognized; i.e. a collection of entities that isn't an Organization.)
  *
  * @constructor Inherits all params from parent.
  *              Forbids the use of the following fields which were optional in the parent: characteristic.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param `type` - Identifies the broad classification of the kind of resources the group includes.
  * @param code - Provides a specific type of resource the group includes; e.g. "cow", "syringe", etc.
  * @param name - A label assigned to the group for human identification and communication.
  * @param active - Indicates whether the record for the group is available for use or is merely being retained for historical purposes.
  * @param actual - If true, indicates that the resource refers to a specific group of real individuals.  If false, the group defines a set of intended individuals.
  * @param language - The base language in which the resource is written.
  * @param quantity - A count of the number of resource instances that are part of the group.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param identifier - A unique business identifier for this group.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param managingEntity - Entity responsible for defining and maintaining Group characteristics and/or registered members.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param member - Identifies the resource instances that are members of the group.
  */
@POJOBoilerplate
class Actualgroup(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("http://hl7.org/fhir/StructureDefinition/actualgroup"))),
    override val text: Option[Narrative] = None,
    override val `type`: GROUP_TYPE,
    override val code: Option[CodeableConcept] = None,
    override val name: Option[String] = None,
    override val active: Option[Boolean] = None,
    override val actual: Boolean,
    override val language: Option[LANGUAGES] = None,
    override val quantity: Option[UnsignedInt] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    override val managingEntity: Option[Reference] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val member: LitSeq[Group.Member] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Group(
      id = id,
      meta = meta,
      text = text,
      `type` = `type`,
      code = code,
      name = name,
      active = active,
      actual = actual,
      language = language,
      quantity = quantity,
      contained = contained,
      extension = extension,
      identifier = identifier,
      implicitRules = implicitRules,
      managingEntity = managingEntity,
      modifierExtension = modifierExtension,
      member = member,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Group"
}
