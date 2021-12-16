package com.babylonhealth.lit.uscore.model

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
import com.babylonhealth.lit.usbase.model._
import com.babylonhealth.lit.core.UnionAliases._
import com.babylonhealth.lit.hl7.UnionAliases._
import com.babylonhealth.lit.usbase.UnionAliases._
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, usbase, uscore }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Us_core_organization extends CompanionFor[Us_core_organization] {
  implicit def summonObjectAndCompanionUs_core_organization_817565370(
      o: Us_core_organization): ObjectAndCompanion[Us_core_organization, Us_core_organization.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Organization
  override type ParentType   = Organization
  override val baseType: CompanionFor[ResourceType] = Organization
  override val parentType: CompanionFor[ParentType] = Organization
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/us/core/StructureDefinition/us-core-organization")
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(
        new Meta(profile = LitSeq("http://hl7.org/fhir/us/core/StructureDefinition/us-core-organization"))),
      text: Option[Narrative] = None,
      `type`: LitSeq[CodeableConcept] = LitSeq.empty,
      name: String,
      alias: LitSeq[String] = LitSeq.empty,
      active: Boolean,
      partOf: Option[Reference] = None,
      telecom: LitSeq[ContactPoint] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      endpoint: LitSeq[Reference] = LitSeq.empty,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      address: LitSeq[Address] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      contact: LitSeq[Organization.Contact] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Us_core_organization = new Us_core_organization(
    id,
    meta,
    text,
    `type`,
    name,
    alias,
    active,
    partOf,
    telecom,
    language,
    endpoint,
    contained,
    extension,
    implicitRules,
    modifierExtension,
    address,
    identifier,
    contact,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val `type`: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("type", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val name: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("name", lTagOf[String], false, lTagOf[String])
  val alias: FHIRComponentFieldMeta[LitSeq[String]] =
    FHIRComponentFieldMeta("alias", lTagOf[LitSeq[String]], false, lTagOf[String])
  val active: FHIRComponentFieldMeta[Boolean] =
    FHIRComponentFieldMeta("active", lTagOf[Boolean], false, lTagOf[Boolean])
  val partOf: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("partOf", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val telecom: FHIRComponentFieldMeta[LitSeq[ContactPoint]] =
    FHIRComponentFieldMeta("telecom", lTagOf[LitSeq[ContactPoint]], false, lTagOf[ContactPoint])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val endpoint: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("endpoint", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val address: FHIRComponentFieldMeta[LitSeq[Address]] =
    FHIRComponentFieldMeta("address", lTagOf[LitSeq[Address]], false, lTagOf[Address])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val contact: FHIRComponentFieldMeta[LitSeq[Organization.Contact]] =
    FHIRComponentFieldMeta("contact", lTagOf[LitSeq[Organization.Contact]], false, lTagOf[Organization.Contact])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    `type`,
    name,
    alias,
    active,
    partOf,
    telecom,
    language,
    endpoint,
    contained,
    extension,
    implicitRules,
    modifierExtension,
    address,
    identifier,
    contact)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Meta]](meta, t.meta),
      FHIRComponentField[Option[Narrative]](text, t.text),
      FHIRComponentField[LitSeq[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[String](name, t.name.get),
      FHIRComponentField[LitSeq[String]](alias, t.alias),
      FHIRComponentField[Boolean](active, t.active.get),
      FHIRComponentField[Option[Reference]](partOf, t.partOf),
      FHIRComponentField[LitSeq[ContactPoint]](telecom, t.telecom),
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[LitSeq[Reference]](endpoint, t.endpoint),
      FHIRComponentField[LitSeq[Resource]](contained, t.contained),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[Address]](address, t.address),
      FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
      FHIRComponentField[LitSeq[Organization.Contact]](contact, t.contact)
    ))
  override def fields(t: Us_core_organization): Seq[FHIRComponentField[_]]  = fieldsFromParent(t).get
  def extractId(t: Us_core_organization): Option[String]                    = t.id
  def extractMeta(t: Us_core_organization): Option[Meta]                    = t.meta
  def extractText(t: Us_core_organization): Option[Narrative]               = t.text
  def extractType(t: Us_core_organization): LitSeq[CodeableConcept]         = t.`type`
  def extractName(t: Us_core_organization): String                          = t.name.get
  def extractAlias(t: Us_core_organization): LitSeq[String]                 = t.alias
  def extractActive(t: Us_core_organization): Boolean                       = t.active.get
  def extractPartOf(t: Us_core_organization): Option[Reference]             = t.partOf
  def extractTelecom(t: Us_core_organization): LitSeq[ContactPoint]         = t.telecom
  def extractLanguage(t: Us_core_organization): Option[LANGUAGES]           = t.language
  def extractEndpoint(t: Us_core_organization): LitSeq[Reference]           = t.endpoint
  def extractContained(t: Us_core_organization): LitSeq[Resource]           = t.contained
  def extractExtension(t: Us_core_organization): LitSeq[Extension]          = t.extension
  def extractImplicitRules(t: Us_core_organization): Option[UriStr]         = t.implicitRules
  def extractModifierExtension(t: Us_core_organization): LitSeq[Extension]  = t.modifierExtension
  def extractAddress(t: Us_core_organization): LitSeq[Address]              = t.address
  def extractIdentifier(t: Us_core_organization): LitSeq[Identifier]        = t.identifier
  def extractContact(t: Us_core_organization): LitSeq[Organization.Contact] = t.contact
  override val thisName: String                                             = "Us_core_organization"
  override val searchParams: Map[String, Us_core_organization => Seq[Any]]  = Organization.searchParams
  def unapply(
      o: Us_core_organization): Option[(Option[String], Option[Meta], Option[Narrative], LitSeq[CodeableConcept], String, LitSeq[String], Boolean, Option[Reference], LitSeq[ContactPoint], Option[LANGUAGES], LitSeq[Reference], LitSeq[Resource], LitSeq[Extension], Option[UriStr], LitSeq[Extension], LitSeq[Address], LitSeq[Identifier], LitSeq[Organization.Contact])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.`type`,
        o.name.get,
        o.alias,
        o.active.get,
        o.partOf,
        o.telecom,
        o.language,
        o.endpoint,
        o.contained,
        o.extension,
        o.implicitRules,
        o.modifierExtension,
        o.address,
        o.identifier,
        o.contact))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Us_core_organization] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Us_core_organization(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("type", Some(LitSeq.empty)),
          cursor.decodeAs[String]("name", None),
          cursor.decodeAs[LitSeq[String]]("alias", Some(LitSeq.empty)),
          cursor.decodeAs[Boolean]("active", None),
          cursor.decodeAs[Option[Reference]]("partOf", Some(None)),
          cursor.decodeAs[LitSeq[ContactPoint]]("telecom", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("endpoint", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Address]]("address", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Organization.Contact]]("contact", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Defines basic constraints and extensions on the Organization resource for use with other US Core resources
  *
  * Subclass of [[hl7.model.Organization]] (A formally or informally recognized grouping of people or organizations formed for the
  * purpose of achieving some form of collective action. Includes companies, institutions, corporations, departments, community
  * groups, healthcare practice groups, payer/insurer, etc.)
  *
  * @constructor
  *   Inherits all params from parent. Requires the following fields which were optional in the parent: name, active.
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
  *   - The kind(s) of organization that this is.
  * @param name
  *   - A name associated with the organization.
  * @param alias
  *   - A list of alternate names that the organization is known as, or was known as in the past.
  * @param active
  *   - Whether the organization's record is still in active use.
  * @param partOf
  *   - The organization of which this organization forms a part.
  * @param telecom
  *   - A contact detail for the organization.
  * @param language
  *   - The base language in which the resource is written.
  * @param endpoint
  *   - Technical endpoints providing access to services operated for the organization.
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
  * @param address
  *   - An address for the organization.
  * @param identifier
  *   - Identifier for the organization that is used to identify the organization across multiple disparate systems.
  * @param contact
  *   - Contact for the organization for a certain purpose.
  */
@POJOBoilerplate
class Us_core_organization(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("http://hl7.org/fhir/us/core/StructureDefinition/us-core-organization"))),
    override val text: Option[Narrative] = None,
    override val `type`: LitSeq[CodeableConcept] = LitSeq.empty,
    name: String,
    override val alias: LitSeq[String] = LitSeq.empty,
    active: Boolean,
    override val partOf: Option[Reference] = None,
    override val telecom: LitSeq[ContactPoint] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    override val endpoint: LitSeq[Reference] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val address: LitSeq[Address] = LitSeq.empty,
    override val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val contact: LitSeq[Organization.Contact] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Organization(
      id = id,
      meta = meta,
      text = text,
      `type` = `type`,
      name = Some(name),
      alias = alias,
      active = Some(active),
      partOf = partOf,
      telecom = telecom,
      address = address,
      language = language,
      endpoint = endpoint,
      contained = contained,
      extension = extension,
      identifier = identifier,
      implicitRules = implicitRules,
      modifierExtension = modifierExtension,
      contact = contact,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Organization"
}
