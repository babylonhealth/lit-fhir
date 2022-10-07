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
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, ukcore }
import com.babylonhealth.lit.macros.POJOBoilerplate

object UKCore_Organization extends CompanionFor[UKCore_Organization] {
  implicit def summonObjectAndCompanionUKCore_Organization_314425246(
      o: UKCore_Organization): ObjectAndCompanion[UKCore_Organization, UKCore_Organization.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Organization
  override type ParentType   = Organization
  override val baseType: CompanionFor[ResourceType] = Organization
  override val parentType: CompanionFor[ParentType] = Organization
  override val profileUrl: Option[String]           = Some("https://fhir.hl7.org.uk/StructureDefinition/UKCore-Organization")
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-Organization"))),
      text: Option[Narrative] = None,
      `type`: LitSeq[CodeableConcept] = LitSeq.empty,
      name: Option[String] = None,
      alias: LitSeq[String] = LitSeq.empty,
      active: Option[Boolean] = None,
      telecom: LitSeq[ContactPoint] = LitSeq.empty,
      address: LitSeq[Address] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      contact: LitSeq[Organization.Contact] = LitSeq.empty,
      partOf: Option[Reference] = None,
      endpoint: LitSeq[Reference] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): UKCore_Organization = new UKCore_Organization(
    id,
    meta,
    text,
    `type`,
    name,
    alias,
    active,
    telecom,
    address,
    language,
    contained,
    extension,
    identifier,
    implicitRules,
    modifierExtension,
    contact,
    partOf,
    endpoint,
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
  val name: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("name", lTagOf[Option[String]], false, lTagOf[String])
  val alias: FHIRComponentFieldMeta[LitSeq[String]] =
    FHIRComponentFieldMeta("alias", lTagOf[LitSeq[String]], false, lTagOf[String])
  val active: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("active", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val telecom: FHIRComponentFieldMeta[LitSeq[ContactPoint]] =
    FHIRComponentFieldMeta("telecom", lTagOf[LitSeq[ContactPoint]], false, lTagOf[ContactPoint])
  val address: FHIRComponentFieldMeta[LitSeq[Address]] =
    FHIRComponentFieldMeta("address", lTagOf[LitSeq[Address]], false, lTagOf[Address])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val contact: FHIRComponentFieldMeta[LitSeq[Organization.Contact]] =
    FHIRComponentFieldMeta("contact", lTagOf[LitSeq[Organization.Contact]], false, lTagOf[Organization.Contact])
  val partOf: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("partOf", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val endpoint: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("endpoint", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    `type`,
    name,
    alias,
    active,
    telecom,
    address,
    language,
    contained,
    extension,
    identifier,
    implicitRules,
    modifierExtension,
    contact,
    partOf,
    endpoint)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Meta]](meta, t.meta),
      FHIRComponentField[Option[Narrative]](text, t.text),
      FHIRComponentField[LitSeq[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[Option[String]](name, t.name),
      FHIRComponentField[LitSeq[String]](alias, t.alias),
      FHIRComponentField[Option[Boolean]](active, t.active),
      FHIRComponentField[LitSeq[ContactPoint]](telecom, t.telecom),
      FHIRComponentField[LitSeq[Address]](address, t.address),
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[LitSeq[Resource]](contained, t.contained),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[Organization.Contact]](contact, t.contact),
      FHIRComponentField[Option[Reference]](partOf, t.partOf),
      FHIRComponentField[LitSeq[Reference]](endpoint, t.endpoint)
    ))
  override def fields(t: UKCore_Organization): Seq[FHIRComponentField[_]]  = fieldsFromParent(t).get
  def extractId(t: UKCore_Organization): Option[String]                    = t.id
  def extractMeta(t: UKCore_Organization): Option[Meta]                    = t.meta
  def extractText(t: UKCore_Organization): Option[Narrative]               = t.text
  def extractType(t: UKCore_Organization): LitSeq[CodeableConcept]         = t.`type`
  def extractName(t: UKCore_Organization): Option[String]                  = t.name
  def extractAlias(t: UKCore_Organization): LitSeq[String]                 = t.alias
  def extractActive(t: UKCore_Organization): Option[Boolean]               = t.active
  def extractTelecom(t: UKCore_Organization): LitSeq[ContactPoint]         = t.telecom
  def extractAddress(t: UKCore_Organization): LitSeq[Address]              = t.address
  def extractLanguage(t: UKCore_Organization): Option[LANGUAGES]           = t.language
  def extractContained(t: UKCore_Organization): LitSeq[Resource]           = t.contained
  def extractExtension(t: UKCore_Organization): LitSeq[Extension]          = t.extension
  def extractIdentifier(t: UKCore_Organization): LitSeq[Identifier]        = t.identifier
  def extractImplicitRules(t: UKCore_Organization): Option[UriStr]         = t.implicitRules
  def extractModifierExtension(t: UKCore_Organization): LitSeq[Extension]  = t.modifierExtension
  def extractContact(t: UKCore_Organization): LitSeq[Organization.Contact] = t.contact
  def extractPartOf(t: UKCore_Organization): Option[Reference]             = t.partOf
  def extractEndpoint(t: UKCore_Organization): LitSeq[Reference]           = t.endpoint
  override val thisName: String                                            = "UKCore_Organization"
  override val searchParams: Map[String, UKCore_Organization => Seq[Any]]  = Organization.searchParams
  def unapply(
      o: UKCore_Organization): Option[(Option[String], Option[Meta], Option[Narrative], LitSeq[CodeableConcept], Option[String], LitSeq[String], Option[Boolean], LitSeq[ContactPoint], LitSeq[Address], Option[LANGUAGES], LitSeq[Resource], LitSeq[Extension], LitSeq[Identifier], Option[UriStr], LitSeq[Extension], LitSeq[Organization.Contact], Option[Reference], LitSeq[Reference])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.`type`,
        o.name,
        o.alias,
        o.active,
        o.telecom,
        o.address,
        o.language,
        o.contained,
        o.extension,
        o.identifier,
        o.implicitRules,
        o.modifierExtension,
        o.contact,
        o.partOf,
        o.endpoint))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[UKCore_Organization] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new UKCore_Organization(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("type", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("name", Some(None)),
          cursor.decodeAs[LitSeq[String]]("alias", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Boolean]]("active", Some(None)),
          cursor.decodeAs[LitSeq[ContactPoint]]("telecom", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Address]]("address", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Organization.Contact]]("contact", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("partOf", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("endpoint", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Defines the UK Core constraints and extensions on the Organization resource for the minimal set of data to query and retrieve
  * organisation information.
  *
  * Subclass of [[hl7.model.Organization]] (A formally or informally recognized grouping of people or organizations formed for the
  * purpose of achieving some form of collective action. Includes companies, institutions, corporations, departments, community
  * groups, healthcare practice groups, payer/insurer, etc.)
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
  * @param `type`
  *   - The kind(s) of organization that this is.
  * @param name
  *   - A name associated with the organization.
  * @param alias
  *   - A list of alternate names that the organization is known as, or was known as in the past.
  * @param active
  *   - Whether the organization's record is still in active use.
  * @param telecom
  *   - A contact detail for the organization.
  * @param address
  *   - An address for the organization.
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
  * @param identifier
  *   - Identifier for the organization that is used to identify the organization across multiple disparate systems.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *     processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *     other profiles etc.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *     the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *     Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *     strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *     extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *     processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of
  *     any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param contact
  *   - Contact for the organization for a certain purpose.
  * @param partOf
  *   - The organization of which this organization forms a part.
  * @param endpoint
  *   - Technical endpoints providing access to services operated for the organization.
  */
@POJOBoilerplate
class UKCore_Organization(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-Organization"))),
    override val text: Option[Narrative] = None,
    override val `type`: LitSeq[CodeableConcept] = LitSeq.empty,
    override val name: Option[String] = None,
    override val alias: LitSeq[String] = LitSeq.empty,
    override val active: Option[Boolean] = None,
    override val telecom: LitSeq[ContactPoint] = LitSeq.empty,
    override val address: LitSeq[Address] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val contact: LitSeq[Organization.Contact] = LitSeq.empty,
    override val partOf: Option[Reference] = None,
    override val endpoint: LitSeq[Reference] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Organization(
      id = id,
      meta = meta,
      text = text,
      `type` = `type`,
      name = name,
      alias = alias,
      active = active,
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
      primitiveAttributes = primitiveAttributes
    ) {
  override val thisTypeName: String = "Organization"
}
