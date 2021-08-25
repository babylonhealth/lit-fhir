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
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Organization extends CompanionFor[Organization] {
  implicit def summonObjectAndCompanionOrganization_76798552(
      o: Organization): ObjectAndCompanion[Organization, Organization.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Organization
  override type ParentType   = Organization
  override val baseType: CompanionFor[ResourceType] = Organization
  override val parentType: CompanionFor[ParentType] = Organization
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Organization")
  object Contact extends CompanionFor[Contact] {
    implicit def summonObjectAndCompanionContact_1608482138(o: Contact): ObjectAndCompanion[Contact, Contact.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Contact
    override type ParentType   = Contact
    override val parentType: CompanionFor[ResourceType] = Contact
    def apply(
        id: Option[String] = None,
        name: Option[HumanName] = None,
        purpose: Option[CodeableConcept] = None,
        telecom: LitSeq[ContactPoint] = LitSeq.empty,
        address: Option[Address] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Contact = new Contact(
      id,
      name,
      purpose,
      telecom,
      address,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Contact): Option[(Option[String], Option[HumanName], Option[CodeableConcept], LitSeq[ContactPoint], Option[Address], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.name, o.purpose, o.telecom, o.address, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val name: FHIRComponentFieldMeta[Option[HumanName]] =
      FHIRComponentFieldMeta("name", lTagOf[Option[HumanName]], false, lTagOf[HumanName])
    val purpose: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("purpose", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val telecom: FHIRComponentFieldMeta[LitSeq[ContactPoint]] =
      FHIRComponentFieldMeta("telecom", lTagOf[LitSeq[ContactPoint]], false, lTagOf[ContactPoint])
    val address: FHIRComponentFieldMeta[Option[Address]] =
      FHIRComponentFieldMeta("address", lTagOf[Option[Address]], false, lTagOf[Address])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, name, purpose, telecom, address, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Contact): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[HumanName]](name, t.name),
      FHIRComponentField[Option[CodeableConcept]](purpose, t.purpose),
      FHIRComponentField[LitSeq[ContactPoint]](telecom, t.telecom),
      FHIRComponentField[Option[Address]](address, t.address),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Contact] = this
    val thisName: String                = "Contact"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Contact] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Contact(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[HumanName]]("name", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("purpose", Some(None)),
            cursor.decodeAs[LitSeq[ContactPoint]]("telecom", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Address]]("address", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Contact(
      override val id: Option[String] = None,
      val name: Option[HumanName] = None,
      val purpose: Option[CodeableConcept] = None,
      val telecom: LitSeq[ContactPoint] = LitSeq.empty,
      val address: Option[Address] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      `type`: LitSeq[CodeableConcept] = LitSeq.empty,
      name: Option[String] = None,
      alias: LitSeq[String] = LitSeq.empty,
      active: Option[Boolean] = None,
      partOf: Option[Reference] = None,
      telecom: LitSeq[ContactPoint] = LitSeq.empty,
      address: LitSeq[Address] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      endpoint: LitSeq[Reference] = LitSeq.empty,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      contact: LitSeq[Organization.Contact] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Organization = new Organization(
    id,
    meta,
    text,
    `type`,
    name,
    alias,
    active,
    partOf,
    telecom,
    address,
    language,
    endpoint,
    contained,
    extension,
    identifier,
    implicitRules,
    modifierExtension,
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
  val name: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("name", lTagOf[Option[String]], false, lTagOf[String])
  val alias: FHIRComponentFieldMeta[LitSeq[String]] =
    FHIRComponentFieldMeta("alias", lTagOf[LitSeq[String]], false, lTagOf[String])
  val active: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("active", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val partOf: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("partOf", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val telecom: FHIRComponentFieldMeta[LitSeq[ContactPoint]] =
    FHIRComponentFieldMeta("telecom", lTagOf[LitSeq[ContactPoint]], false, lTagOf[ContactPoint])
  val address: FHIRComponentFieldMeta[LitSeq[Address]] =
    FHIRComponentFieldMeta("address", lTagOf[LitSeq[Address]], false, lTagOf[Address])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val endpoint: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("endpoint", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
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
    address,
    language,
    endpoint,
    contained,
    extension,
    identifier,
    implicitRules,
    modifierExtension,
    contact)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Organization): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[LitSeq[CodeableConcept]](`type`, t.`type`),
    FHIRComponentField[Option[String]](name, t.name),
    FHIRComponentField[LitSeq[String]](alias, t.alias),
    FHIRComponentField[Option[Boolean]](active, t.active),
    FHIRComponentField[Option[Reference]](partOf, t.partOf),
    FHIRComponentField[LitSeq[ContactPoint]](telecom, t.telecom),
    FHIRComponentField[LitSeq[Address]](address, t.address),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Reference]](endpoint, t.endpoint),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[Organization.Contact]](contact, t.contact)
  )
  def extractId(t: Organization): Option[String]                    = t.id
  def extractMeta(t: Organization): Option[Meta]                    = t.meta
  def extractText(t: Organization): Option[Narrative]               = t.text
  def extractType(t: Organization): LitSeq[CodeableConcept]         = t.`type`
  def extractName(t: Organization): Option[String]                  = t.name
  def extractAlias(t: Organization): LitSeq[String]                 = t.alias
  def extractActive(t: Organization): Option[Boolean]               = t.active
  def extractPartOf(t: Organization): Option[Reference]             = t.partOf
  def extractTelecom(t: Organization): LitSeq[ContactPoint]         = t.telecom
  def extractAddress(t: Organization): LitSeq[Address]              = t.address
  def extractLanguage(t: Organization): Option[LANGUAGES]           = t.language
  def extractEndpoint(t: Organization): LitSeq[Reference]           = t.endpoint
  def extractContained(t: Organization): LitSeq[Resource]           = t.contained
  def extractExtension(t: Organization): LitSeq[Extension]          = t.extension
  def extractIdentifier(t: Organization): LitSeq[Identifier]        = t.identifier
  def extractImplicitRules(t: Organization): Option[UriStr]         = t.implicitRules
  def extractModifierExtension(t: Organization): LitSeq[Extension]  = t.modifierExtension
  def extractContact(t: Organization): LitSeq[Organization.Contact] = t.contact
  override val thisName: String                                     = "Organization"
  override val searchParams: Map[String, Organization => Seq[Any]] = Map(
    "phonetic"           -> (obj => obj.name.toSeq),
    "partof"             -> (obj => obj.partOf.toSeq),
    "identifier"         -> (obj => obj.identifier.toSeq),
    "address-state"      -> (obj => obj.address.flatMap(_.state).toSeq),
    "address-postalcode" -> (obj => obj.address.flatMap(_.postalCode).toSeq),
    "address-use"        -> (obj => obj.address.flatMap(_.use).toSeq),
    "type"               -> (obj => obj.`type`.toSeq),
    "address-country"    -> (obj => obj.address.flatMap(_.country).toSeq),
    "active"             -> (obj => obj.active.toSeq),
    "address-city"       -> (obj => obj.address.flatMap(_.city).toSeq),
    "name" -> (obj =>
      obj.name.toSeq ++
        obj.alias.toSeq),
    "endpoint" -> (obj => obj.endpoint.toSeq),
    "address"  -> (obj => obj.address.toSeq)
  )
  def unapply(
      o: Organization): Option[(Option[String], Option[Meta], Option[Narrative], LitSeq[CodeableConcept], Option[String], LitSeq[String], Option[Boolean], Option[Reference], LitSeq[ContactPoint], LitSeq[Address], Option[LANGUAGES], LitSeq[Reference], LitSeq[Resource], LitSeq[Extension], LitSeq[Identifier], Option[UriStr], LitSeq[Extension], LitSeq[Organization.Contact])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.`type`,
        o.name,
        o.alias,
        o.active,
        o.partOf,
        o.telecom,
        o.address,
        o.language,
        o.endpoint,
        o.contained,
        o.extension,
        o.identifier,
        o.implicitRules,
        o.modifierExtension,
        o.contact))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Organization] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Organization(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("type", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("name", Some(None)),
          cursor.decodeAs[LitSeq[String]]("alias", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Boolean]]("active", Some(None)),
          cursor.decodeAs[Option[Reference]]("partOf", Some(None)),
          cursor.decodeAs[LitSeq[ContactPoint]]("telecom", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Address]]("address", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("endpoint", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Organization.Contact]]("contact", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some form of
  * collective action. Includes companies, institutions, corporations, departments, community groups, healthcare practice groups,
  * payer/insurer, etc.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields `type`, name, alias, active, partOf, telecom, address, endpoint, identifier, contact.
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
  * @param address
  *   - An address for the organization.
  * @param language
  *   - The base language in which the resource is written.
  * @param endpoint
  *   - Technical endpoints providing access to services operated for the organization.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param identifier
  *   - Identifier for the organization that is used to identify the organization across multiple disparate systems.
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
  * @param contact
  *   - Contact for the organization for a certain purpose.
  */
@POJOBoilerplate
class Organization(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val `type`: LitSeq[CodeableConcept] = LitSeq.empty,
    val name: Option[String] = None,
    val alias: LitSeq[String] = LitSeq.empty,
    val active: Option[Boolean] = None,
    val partOf: Option[Reference] = None,
    val telecom: LitSeq[ContactPoint] = LitSeq.empty,
    val address: LitSeq[Address] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    val endpoint: LitSeq[Reference] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val contact: LitSeq[Organization.Contact] = LitSeq.empty,
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
  override val thisTypeName: String = "Organization"
}
