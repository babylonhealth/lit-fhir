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
import com.babylonhealth.lit.hl7.{ IDENTITY_ASSURANCELEVEL, ADMINISTRATIVE_GENDER }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Person extends CompanionFor[Person] {
  implicit def summonObjectAndCompanionPerson_735604854(o: Person): ObjectAndCompanion[Person, Person.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Person
  override type ParentType   = Person
  override val baseType: CompanionFor[ResourceType] = Person
  override val parentType: CompanionFor[ParentType] = Person
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Person")
  object Link extends CompanionFor[Link] {
    implicit def summonObjectAndCompanionLink479268586(o: Link): ObjectAndCompanion[Link, Link.type] = ObjectAndCompanion(o, this)
    override type ResourceType = Link
    override type ParentType   = Link
    override val parentType: CompanionFor[ResourceType] = Link
    def apply(
        id: Option[String] = None,
        target: Reference,
        extension: LitSeq[Extension] = LitSeq.empty,
        assurance: Option[IDENTITY_ASSURANCELEVEL] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Link = new Link(
      id,
      target,
      extension,
      assurance,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Link): Option[(Option[String], Reference, LitSeq[Extension], Option[IDENTITY_ASSURANCELEVEL], LitSeq[Extension])] =
      Some((o.id, o.target, o.extension, o.assurance, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val target: FHIRComponentFieldMeta[Reference] =
      FHIRComponentFieldMeta("target", lTagOf[Reference], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val assurance: FHIRComponentFieldMeta[Option[IDENTITY_ASSURANCELEVEL]] =
      FHIRComponentFieldMeta("assurance", lTagOf[Option[IDENTITY_ASSURANCELEVEL]], false, lTagOf[IDENTITY_ASSURANCELEVEL])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, target, extension, assurance, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Link): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Reference](target, t.target),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[IDENTITY_ASSURANCELEVEL]](assurance, t.assurance),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Link] = this
    val thisName: String             = "Link"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Link] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Link(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Reference]("target", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[IDENTITY_ASSURANCELEVEL]]("assurance", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Link(
      override val id: Option[String] = None,
      val target: Reference,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val assurance: Option[IDENTITY_ASSURANCELEVEL] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      name: LitSeq[HumanName] = LitSeq.empty,
      photo: Option[Attachment] = None,
      gender: Option[ADMINISTRATIVE_GENDER] = None,
      active: Option[Boolean] = None,
      telecom: LitSeq[ContactPoint] = LitSeq.empty,
      address: LitSeq[Address] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      birthDate: Option[FHIRDate] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      managingOrganization: Option[Reference] = None,
      link: LitSeq[Person.Link] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Person = new Person(
    id,
    meta,
    text,
    name,
    photo,
    gender,
    active,
    telecom,
    address,
    language,
    contained,
    extension,
    birthDate,
    identifier,
    implicitRules,
    modifierExtension,
    managingOrganization,
    link,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val name: FHIRComponentFieldMeta[LitSeq[HumanName]] =
    FHIRComponentFieldMeta("name", lTagOf[LitSeq[HumanName]], false, lTagOf[HumanName])
  val photo: FHIRComponentFieldMeta[Option[Attachment]] =
    FHIRComponentFieldMeta("photo", lTagOf[Option[Attachment]], false, lTagOf[Attachment])
  val gender: FHIRComponentFieldMeta[Option[ADMINISTRATIVE_GENDER]] =
    FHIRComponentFieldMeta("gender", lTagOf[Option[ADMINISTRATIVE_GENDER]], false, lTagOf[ADMINISTRATIVE_GENDER])
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
  val birthDate: FHIRComponentFieldMeta[Option[FHIRDate]] =
    FHIRComponentFieldMeta("birthDate", lTagOf[Option[FHIRDate]], false, lTagOf[FHIRDate])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val managingOrganization: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("managingOrganization", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val link: FHIRComponentFieldMeta[LitSeq[Person.Link]] =
    FHIRComponentFieldMeta("link", lTagOf[LitSeq[Person.Link]], false, lTagOf[Person.Link])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    name,
    photo,
    gender,
    active,
    telecom,
    address,
    language,
    contained,
    extension,
    birthDate,
    identifier,
    implicitRules,
    modifierExtension,
    managingOrganization,
    link
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Person): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[LitSeq[HumanName]](name, t.name),
    FHIRComponentField[Option[Attachment]](photo, t.photo),
    FHIRComponentField[Option[ADMINISTRATIVE_GENDER]](gender, t.gender),
    FHIRComponentField[Option[Boolean]](active, t.active),
    FHIRComponentField[LitSeq[ContactPoint]](telecom, t.telecom),
    FHIRComponentField[LitSeq[Address]](address, t.address),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[FHIRDate]](birthDate, t.birthDate),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Option[Reference]](managingOrganization, t.managingOrganization),
    FHIRComponentField[LitSeq[Person.Link]](link, t.link)
  )
  def extractId(t: Person): Option[String]                      = t.id
  def extractMeta(t: Person): Option[Meta]                      = t.meta
  def extractText(t: Person): Option[Narrative]                 = t.text
  def extractName(t: Person): LitSeq[HumanName]                 = t.name
  def extractPhoto(t: Person): Option[Attachment]               = t.photo
  def extractGender(t: Person): Option[ADMINISTRATIVE_GENDER]   = t.gender
  def extractActive(t: Person): Option[Boolean]                 = t.active
  def extractTelecom(t: Person): LitSeq[ContactPoint]           = t.telecom
  def extractAddress(t: Person): LitSeq[Address]                = t.address
  def extractLanguage(t: Person): Option[LANGUAGES]             = t.language
  def extractContained(t: Person): LitSeq[Resource]             = t.contained
  def extractExtension(t: Person): LitSeq[Extension]            = t.extension
  def extractBirthDate(t: Person): Option[FHIRDate]             = t.birthDate
  def extractIdentifier(t: Person): LitSeq[Identifier]          = t.identifier
  def extractImplicitRules(t: Person): Option[UriStr]           = t.implicitRules
  def extractModifierExtension(t: Person): LitSeq[Extension]    = t.modifierExtension
  def extractManagingOrganization(t: Person): Option[Reference] = t.managingOrganization
  def extractLink(t: Person): LitSeq[Person.Link]               = t.link
  override val thisName: String                                 = "Person"
  override val searchParams: Map[String, Person => Seq[Any]] = Map(
    "address-state"      -> (obj => obj.address.flatMap(_.state).toSeq),
    "address-postalcode" -> (obj => obj.address.flatMap(_.postalCode).toSeq),
    "address-use"        -> (obj => obj.address.flatMap(_.use).toSeq),
    "relatedperson"      -> (obj => obj.link.map(_.target).filter(_.reference.exists(_.contains("RelatedPerson/"))).toSeq),
    "birthdate"          -> (obj => obj.birthDate.toSeq),
    "link"               -> (obj => obj.link.map(_.target).toSeq),
    "address-country"    -> (obj => obj.address.flatMap(_.country).toSeq),
    "practitioner"       -> (obj => obj.link.map(_.target).filter(_.reference.exists(_.contains("Practitioner/"))).toSeq),
    "phonetic"           -> (obj => obj.name.toSeq),
    "organization"       -> (obj => obj.managingOrganization.toSeq),
    "address-city"       -> (obj => obj.address.flatMap(_.city).toSeq),
    "name"               -> (obj => obj.name.toSeq),
    "email"              -> (obj => obj.telecom.filter(_.system.map(_.name) contains "email").toSeq),
    "identifier"         -> (obj => obj.identifier.toSeq),
    "telecom"            -> (obj => obj.telecom.toSeq),
    "address"            -> (obj => obj.address.toSeq),
    "phone"              -> (obj => obj.telecom.filter(_.system.map(_.name) contains "phone").toSeq),
    "gender"             -> (obj => obj.gender.toSeq),
    "patient"            -> (obj => obj.link.map(_.target).filter(_.reference.exists(_.contains("Patient/"))).toSeq)
  )
  def unapply(
      o: Person): Option[(Option[String], Option[Meta], Option[Narrative], LitSeq[HumanName], Option[Attachment], Option[ADMINISTRATIVE_GENDER], Option[Boolean], LitSeq[ContactPoint], LitSeq[Address], Option[LANGUAGES], LitSeq[Resource], LitSeq[Extension], Option[FHIRDate], LitSeq[Identifier], Option[UriStr], LitSeq[Extension], Option[Reference], LitSeq[Person.Link])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.name,
        o.photo,
        o.gender,
        o.active,
        o.telecom,
        o.address,
        o.language,
        o.contained,
        o.extension,
        o.birthDate,
        o.identifier,
        o.implicitRules,
        o.modifierExtension,
        o.managingOrganization,
        o.link))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Person] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Person(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[LitSeq[HumanName]]("name", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Attachment]]("photo", Some(None)),
          cursor.decodeAs[Option[ADMINISTRATIVE_GENDER]]("gender", Some(None)),
          cursor.decodeAs[Option[Boolean]]("active", Some(None)),
          cursor.decodeAs[LitSeq[ContactPoint]]("telecom", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Address]]("address", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[FHIRDate]]("birthDate", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("managingOrganization", Some(None)),
          cursor.decodeAs[LitSeq[Person.Link]]("link", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Demographics and administrative information about a person independent of a specific health-related context.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields name, photo, gender, active, telecom, address, birthDate, identifier, managingOrganization, link.
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
  * @param name
  *   - A name associated with the person.
  * @param photo
  *   - An image that can be displayed as a thumbnail of the person to enhance the identification of the individual.
  * @param gender
  *   - Administrative Gender.
  * @param active
  *   - Whether this person's record is in active use.
  * @param telecom
  *   - A contact detail for the person, e.g. a telephone number or an email address.
  * @param address
  *   - One or more addresses for the person.
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
  * @param birthDate
  *   - The birth date for the person.
  * @param identifier
  *   - Identifier for a person within a particular scope.
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
  * @param managingOrganization
  *   - The organization that is the custodian of the person record.
  * @param link
  *   - Link to a resource that concerns the same actual person.
  */
@POJOBoilerplate
class Person(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val name: LitSeq[HumanName] = LitSeq.empty,
    val photo: Option[Attachment] = None,
    val gender: Option[ADMINISTRATIVE_GENDER] = None,
    val active: Option[Boolean] = None,
    val telecom: LitSeq[ContactPoint] = LitSeq.empty,
    val address: LitSeq[Address] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val birthDate: Option[FHIRDate] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val managingOrganization: Option[Reference] = None,
    val link: LitSeq[Person.Link] = LitSeq.empty,
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
  override val thisTypeName: String = "Person"
}
