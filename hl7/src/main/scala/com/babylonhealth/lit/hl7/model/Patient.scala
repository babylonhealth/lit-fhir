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
import com.babylonhealth.lit.hl7.{ LINK_TYPE, ADMINISTRATIVE_GENDER }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Patient extends CompanionFor[Patient] {
  implicit def summonObjectAndCompanionPatient_1573728148(o: Patient): ObjectAndCompanion[Patient, Patient.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Patient
  override type ParentType   = Patient
  override val baseType: CompanionFor[ResourceType] = Patient
  override val parentType: CompanionFor[ParentType] = Patient
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Patient")
  object Communication extends CompanionFor[Communication] {
    implicit def summonObjectAndCompanionCommunication_1663907715(
        o: Communication): ObjectAndCompanion[Communication, Communication.type] = ObjectAndCompanion(o, this)
    override type ResourceType = Communication
    override type ParentType   = Communication
    override val parentType: CompanionFor[ResourceType] = Communication
    def apply(
        id: Option[String] = None,
        language: CodeableConcept,
        extension: LitSeq[Extension] = LitSeq.empty,
        preferred: Option[Boolean] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Communication = new Communication(
      id,
      language,
      extension,
      preferred,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Communication): Option[(Option[String], CodeableConcept, LitSeq[Extension], Option[Boolean], LitSeq[Extension])] =
      Some((o.id, o.language, o.extension, o.preferred, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val language: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("language", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val preferred: FHIRComponentFieldMeta[Option[Boolean]] =
      FHIRComponentFieldMeta("preferred", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, language, extension, preferred, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Communication): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[CodeableConcept](language, t.language),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Boolean]](preferred, t.preferred),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Communication] = this
    val thisName: String                      = "Communication"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Communication] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Communication(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[CodeableConcept]("language", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Boolean]]("preferred", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Communication(
      override val id: Option[String] = None,
      val language: CodeableConcept,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val preferred: Option[Boolean] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Contact extends CompanionFor[Contact] {
    implicit def summonObjectAndCompanionContact_554442437(o: Contact): ObjectAndCompanion[Contact, Contact.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Contact
    override type ParentType   = Contact
    override val parentType: CompanionFor[ResourceType] = Contact
    def apply(
        id: Option[String] = None,
        name: Option[HumanName] = None,
        gender: Option[ADMINISTRATIVE_GENDER] = None,
        period: Option[Period] = None,
        telecom: LitSeq[ContactPoint] = LitSeq.empty,
        address: Option[Address] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        relationship: LitSeq[CodeableConcept] = LitSeq.empty,
        organization: Option[Reference] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Contact = new Contact(
      id,
      name,
      gender,
      period,
      telecom,
      address,
      extension,
      relationship,
      organization,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Contact): Option[(Option[String], Option[HumanName], Option[ADMINISTRATIVE_GENDER], Option[Period], LitSeq[ContactPoint], Option[Address], LitSeq[Extension], LitSeq[CodeableConcept], Option[Reference], LitSeq[Extension])] =
      Some(
        (
          o.id,
          o.name,
          o.gender,
          o.period,
          o.telecom,
          o.address,
          o.extension,
          o.relationship,
          o.organization,
          o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val name: FHIRComponentFieldMeta[Option[HumanName]] =
      FHIRComponentFieldMeta("name", lTagOf[Option[HumanName]], false, lTagOf[HumanName])
    val gender: FHIRComponentFieldMeta[Option[ADMINISTRATIVE_GENDER]] =
      FHIRComponentFieldMeta("gender", lTagOf[Option[ADMINISTRATIVE_GENDER]], false, lTagOf[ADMINISTRATIVE_GENDER])
    val period: FHIRComponentFieldMeta[Option[Period]] =
      FHIRComponentFieldMeta("period", lTagOf[Option[Period]], false, lTagOf[Period])
    val telecom: FHIRComponentFieldMeta[LitSeq[ContactPoint]] =
      FHIRComponentFieldMeta("telecom", lTagOf[LitSeq[ContactPoint]], false, lTagOf[ContactPoint])
    val address: FHIRComponentFieldMeta[Option[Address]] =
      FHIRComponentFieldMeta("address", lTagOf[Option[Address]], false, lTagOf[Address])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val relationship: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("relationship", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val organization: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("organization", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, name, gender, period, telecom, address, extension, relationship, organization, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Contact): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[HumanName]](name, t.name),
      FHIRComponentField[Option[ADMINISTRATIVE_GENDER]](gender, t.gender),
      FHIRComponentField[Option[Period]](period, t.period),
      FHIRComponentField[LitSeq[ContactPoint]](telecom, t.telecom),
      FHIRComponentField[Option[Address]](address, t.address),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[CodeableConcept]](relationship, t.relationship),
      FHIRComponentField[Option[Reference]](organization, t.organization),
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
            cursor.decodeAs[Option[ADMINISTRATIVE_GENDER]]("gender", Some(None)),
            cursor.decodeAs[Option[Period]]("period", Some(None)),
            cursor.decodeAs[LitSeq[ContactPoint]]("telecom", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Address]]("address", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("relationship", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Reference]]("organization", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Contact(
      override val id: Option[String] = None,
      val name: Option[HumanName] = None,
      val gender: Option[ADMINISTRATIVE_GENDER] = None,
      val period: Option[Period] = None,
      val telecom: LitSeq[ContactPoint] = LitSeq.empty,
      val address: Option[Address] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val relationship: LitSeq[CodeableConcept] = LitSeq.empty,
      val organization: Option[Reference] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Link extends CompanionFor[Link] {
    implicit def summonObjectAndCompanionLink1963560012(o: Link): ObjectAndCompanion[Link, Link.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Link
    override type ParentType   = Link
    override val parentType: CompanionFor[ResourceType] = Link
    def apply(
        id: Option[String] = None,
        `type`: LINK_TYPE,
        other: Reference,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Link = new Link(
      id,
      `type`,
      other,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(o: Link): Option[(Option[String], LINK_TYPE, Reference, LitSeq[Extension], LitSeq[Extension])] = Some(
      (o.id, o.`type`, o.other, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[LINK_TYPE] =
      FHIRComponentFieldMeta("type", lTagOf[LINK_TYPE], false, lTagOf[LINK_TYPE])
    val other: FHIRComponentFieldMeta[Reference] =
      FHIRComponentFieldMeta("other", lTagOf[Reference], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, `type`, other, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Link): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LINK_TYPE](`type`, t.`type`),
      FHIRComponentField[Reference](other, t.other),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Link] = this
    val thisName: String             = "Link"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Link] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Link(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LINK_TYPE]("type", None),
            cursor.decodeAs[Reference]("other", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Link(
      override val id: Option[String] = None,
      val `type`: LINK_TYPE,
      val other: Reference,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  type DeceasedChoice      = Choice[UnionBooleanOrFHIRDateTime]
  type MultipleBirthChoice = Choice[UnionBooleanOrInt]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      name: LitSeq[HumanName] = LitSeq.empty,
      photo: LitSeq[Attachment] = LitSeq.empty,
      active: Option[Boolean] = None,
      gender: Option[ADMINISTRATIVE_GENDER] = None,
      telecom: LitSeq[ContactPoint] = LitSeq.empty,
      address: LitSeq[Address] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      birthDate: Option[FHIRDate] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      deceased: Option[Patient.DeceasedChoice] = None,
      implicitRules: Option[UriStr] = None,
      maritalStatus: Option[CodeableConcept] = None,
      multipleBirth: Option[Patient.MultipleBirthChoice] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      generalPractitioner: LitSeq[Reference] = LitSeq.empty,
      managingOrganization: Option[Reference] = None,
      link: LitSeq[Patient.Link] = LitSeq.empty,
      contact: LitSeq[Patient.Contact] = LitSeq.empty,
      communication: LitSeq[Patient.Communication] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Patient = new Patient(
    id,
    meta,
    text,
    name,
    photo,
    active,
    gender,
    telecom,
    address,
    language,
    contained,
    extension,
    birthDate,
    identifier,
    deceased,
    implicitRules,
    maritalStatus,
    multipleBirth,
    modifierExtension,
    generalPractitioner,
    managingOrganization,
    link,
    contact,
    communication,
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
  val photo: FHIRComponentFieldMeta[LitSeq[Attachment]] =
    FHIRComponentFieldMeta("photo", lTagOf[LitSeq[Attachment]], false, lTagOf[Attachment])
  val active: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("active", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val gender: FHIRComponentFieldMeta[Option[ADMINISTRATIVE_GENDER]] =
    FHIRComponentFieldMeta("gender", lTagOf[Option[ADMINISTRATIVE_GENDER]], false, lTagOf[ADMINISTRATIVE_GENDER])
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
  val deceased: FHIRComponentFieldMeta[Option[Patient.DeceasedChoice]] =
    FHIRComponentFieldMeta("deceased", lTagOf[Option[Patient.DeceasedChoice]], true, lTagOf[UnionBooleanOrFHIRDateTime])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val maritalStatus: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("maritalStatus", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val multipleBirth: FHIRComponentFieldMeta[Option[Patient.MultipleBirthChoice]] =
    FHIRComponentFieldMeta("multipleBirth", lTagOf[Option[Patient.MultipleBirthChoice]], true, lTagOf[UnionBooleanOrInt])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val generalPractitioner: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("generalPractitioner", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val managingOrganization: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("managingOrganization", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val link: FHIRComponentFieldMeta[LitSeq[Patient.Link]] =
    FHIRComponentFieldMeta("link", lTagOf[LitSeq[Patient.Link]], false, lTagOf[Patient.Link])
  val contact: FHIRComponentFieldMeta[LitSeq[Patient.Contact]] =
    FHIRComponentFieldMeta("contact", lTagOf[LitSeq[Patient.Contact]], false, lTagOf[Patient.Contact])
  val communication: FHIRComponentFieldMeta[LitSeq[Patient.Communication]] =
    FHIRComponentFieldMeta("communication", lTagOf[LitSeq[Patient.Communication]], false, lTagOf[Patient.Communication])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    name,
    photo,
    active,
    gender,
    telecom,
    address,
    language,
    contained,
    extension,
    birthDate,
    identifier,
    deceased,
    implicitRules,
    maritalStatus,
    multipleBirth,
    modifierExtension,
    generalPractitioner,
    managingOrganization,
    link,
    contact,
    communication
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Patient): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[LitSeq[HumanName]](name, t.name),
    FHIRComponentField[LitSeq[Attachment]](photo, t.photo),
    FHIRComponentField[Option[Boolean]](active, t.active),
    FHIRComponentField[Option[ADMINISTRATIVE_GENDER]](gender, t.gender),
    FHIRComponentField[LitSeq[ContactPoint]](telecom, t.telecom),
    FHIRComponentField[LitSeq[Address]](address, t.address),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[FHIRDate]](birthDate, t.birthDate),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[Patient.DeceasedChoice]](deceased, t.deceased),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[CodeableConcept]](maritalStatus, t.maritalStatus),
    FHIRComponentField[Option[Patient.MultipleBirthChoice]](multipleBirth, t.multipleBirth),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[Reference]](generalPractitioner, t.generalPractitioner),
    FHIRComponentField[Option[Reference]](managingOrganization, t.managingOrganization),
    FHIRComponentField[LitSeq[Patient.Link]](link, t.link),
    FHIRComponentField[LitSeq[Patient.Contact]](contact, t.contact),
    FHIRComponentField[LitSeq[Patient.Communication]](communication, t.communication)
  )
  def extractId(t: Patient): Option[String]                                 = t.id
  def extractMeta(t: Patient): Option[Meta]                                 = t.meta
  def extractText(t: Patient): Option[Narrative]                            = t.text
  def extractName(t: Patient): LitSeq[HumanName]                            = t.name
  def extractPhoto(t: Patient): LitSeq[Attachment]                          = t.photo
  def extractActive(t: Patient): Option[Boolean]                            = t.active
  def extractGender(t: Patient): Option[ADMINISTRATIVE_GENDER]              = t.gender
  def extractTelecom(t: Patient): LitSeq[ContactPoint]                      = t.telecom
  def extractAddress(t: Patient): LitSeq[Address]                           = t.address
  def extractLanguage(t: Patient): Option[LANGUAGES]                        = t.language
  def extractContained(t: Patient): LitSeq[Resource]                        = t.contained
  def extractExtension(t: Patient): LitSeq[Extension]                       = t.extension
  def extractBirthDate(t: Patient): Option[FHIRDate]                        = t.birthDate
  def extractIdentifier(t: Patient): LitSeq[Identifier]                     = t.identifier
  def extractDeceased(t: Patient): Option[Patient.DeceasedChoice]           = t.deceased
  def extractImplicitRules(t: Patient): Option[UriStr]                      = t.implicitRules
  def extractMaritalStatus(t: Patient): Option[CodeableConcept]             = t.maritalStatus
  def extractMultipleBirth(t: Patient): Option[Patient.MultipleBirthChoice] = t.multipleBirth
  def extractModifierExtension(t: Patient): LitSeq[Extension]               = t.modifierExtension
  def extractGeneralPractitioner(t: Patient): LitSeq[Reference]             = t.generalPractitioner
  def extractManagingOrganization(t: Patient): Option[Reference]            = t.managingOrganization
  def extractLink(t: Patient): LitSeq[Patient.Link]                         = t.link
  def extractContact(t: Patient): LitSeq[Patient.Contact]                   = t.contact
  def extractCommunication(t: Patient): LitSeq[Patient.Communication]       = t.communication
  override val thisName: String                                             = "Patient"
  override val searchParams: Map[String, Patient => Seq[Any]] = Map(
    "mothersMaidenName" -> (obj =>
      obj.extension
        .filter(_.url == "http://hl7.org/fhir/StructureDefinition/patient-extensions-Patient-mothersMaidenName")
        .toSeq),
    "address-state"        -> (obj => obj.address.flatMap(_.state).toSeq),
    "address-postalcode"   -> (obj => obj.address.flatMap(_.postalCode).toSeq),
    "address-use"          -> (obj => obj.address.flatMap(_.use).toSeq),
    "birthdate"            -> (obj => obj.birthDate.toSeq),
    "language"             -> (obj => obj.communication.map(_.language).toSeq),
    "link"                 -> (obj => obj.link.map(_.other).toSeq),
    "deceased"             -> (obj => Seq(obj.deceased.nonEmpty && !obj.deceased.contains(false))),
    "family"               -> (obj => obj.name.flatMap(_.family).toSeq),
    "address-country"      -> (obj => obj.address.flatMap(_.country).toSeq),
    "phonetic"             -> (obj => obj.name.toSeq),
    "organization"         -> (obj => obj.managingOrganization.toSeq),
    "address-city"         -> (obj => obj.address.flatMap(_.city).toSeq),
    "name"                 -> (obj => obj.name.toSeq),
    "given"                -> (obj => obj.name.flatMap(_.`given`).toSeq),
    "death-date"           -> (obj => obj.deceased.flatMap(_.as[FHIRDateTime]).toSeq),
    "email"                -> (obj => obj.telecom.filter(_.system.map(_.name) contains "email").toSeq),
    "identifier"           -> (obj => obj.identifier.toSeq),
    "telecom"              -> (obj => obj.telecom.toSeq),
    "address"              -> (obj => obj.address.toSeq),
    "phone"                -> (obj => obj.telecom.filter(_.system.map(_.name) contains "phone").toSeq),
    "general-practitioner" -> (obj => obj.generalPractitioner.toSeq),
    "gender"               -> (obj => obj.gender.toSeq),
    "active"               -> (obj => obj.active.toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Patient] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Patient(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[LitSeq[HumanName]]("name", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Attachment]]("photo", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Boolean]]("active", Some(None)),
          cursor.decodeAs[Option[ADMINISTRATIVE_GENDER]]("gender", Some(None)),
          cursor.decodeAs[LitSeq[ContactPoint]]("telecom", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Address]]("address", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[FHIRDate]]("birthDate", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeOptRef[UnionBooleanOrFHIRDateTime]("deceased"),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("maritalStatus", Some(None)),
          cursor.decodeOptRef[UnionBooleanOrInt]("multipleBirth"),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("generalPractitioner", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("managingOrganization", Some(None)),
          cursor.decodeAs[LitSeq[Patient.Link]]("link", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Patient.Contact]]("contact", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Patient.Communication]]("communication", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Demographics and other administrative information about an individual or animal receiving care or other health-related
  * services.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields name, photo, active, gender, telecom, address, birthDate, identifier, deceased, maritalStatus,
  *   multipleBirth, generalPractitioner, managingOrganization, link, contact, communication.
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
  *   - A name associated with the individual.
  * @param photo
  *   - Image of the patient.
  * @param active
  *   - Whether this patient record is in active use. Many systems use this property to mark as non-current patients, such as
  *   those that have not been seen for a period of time based on an organization's business rules. It is often used to filter
  *   patient lists to exclude inactive patients Deceased patients may also be marked as inactive for the same reasons, but may be
  *   active for some time after death.
  * @param gender
  *   - Administrative Gender - the gender that the patient is considered to have for administration and record keeping purposes.
  * @param telecom
  *   - A contact detail (e.g. a telephone number or an email address) by which the individual may be contacted.
  * @param address
  *   - An address for the individual.
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
  *   - The date of birth for the individual.
  * @param identifier
  *   - An identifier for this patient.
  * @param deceased
  *   - Indicates if the individual is deceased or not.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param maritalStatus
  *   - This field contains a patient's most recent marital (civil) status.
  * @param multipleBirth
  *   - Indicates whether the patient is part of a multiple (boolean) or indicates the actual birth order (integer).
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *   the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually
  *   modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict
  *   set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param generalPractitioner
  *   - Patient's nominated care provider.
  * @param managingOrganization
  *   - Organization that is the custodian of the patient record.
  * @param link
  *   - Link to another patient resource that concerns the same actual patient.
  * @param contact
  *   - A contact party (e.g. guardian, partner, friend) for the patient.
  * @param communication
  *   - A language which may be used to communicate with the patient about his or her health.
  */
@POJOBoilerplate
class Patient(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val name: LitSeq[HumanName] = LitSeq.empty,
    val photo: LitSeq[Attachment] = LitSeq.empty,
    val active: Option[Boolean] = None,
    val gender: Option[ADMINISTRATIVE_GENDER] = None,
    val telecom: LitSeq[ContactPoint] = LitSeq.empty,
    val address: LitSeq[Address] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val birthDate: Option[FHIRDate] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val deceased: Option[Patient.DeceasedChoice] = None,
    override val implicitRules: Option[UriStr] = None,
    val maritalStatus: Option[CodeableConcept] = None,
    val multipleBirth: Option[Patient.MultipleBirthChoice] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val generalPractitioner: LitSeq[Reference] = LitSeq.empty,
    val managingOrganization: Option[Reference] = None,
    val link: LitSeq[Patient.Link] = LitSeq.empty,
    val contact: LitSeq[Patient.Contact] = LitSeq.empty,
    val communication: LitSeq[Patient.Communication] = LitSeq.empty,
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
  override val thisTypeName: String = "Patient"
}
