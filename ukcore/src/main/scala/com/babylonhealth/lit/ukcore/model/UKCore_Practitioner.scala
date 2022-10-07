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
import com.babylonhealth.lit.hl7.ADMINISTRATIVE_GENDER
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, ukcore }
import com.babylonhealth.lit.macros.POJOBoilerplate

object UKCore_Practitioner extends CompanionFor[UKCore_Practitioner] {
  implicit def summonObjectAndCompanionUKCore_Practitioner_918774199(
      o: UKCore_Practitioner): ObjectAndCompanion[UKCore_Practitioner, UKCore_Practitioner.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Practitioner
  override type ParentType   = Practitioner
  override val baseType: CompanionFor[ResourceType] = Practitioner
  override val parentType: CompanionFor[ParentType] = Practitioner
  override val profileUrl: Option[String]           = Some("https://fhir.hl7.org.uk/StructureDefinition/UKCore-Practitioner")
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-Practitioner"))),
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
      implicitRules: Option[UriStr] = None,
      communication: LitSeq[CodeableConcept] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      qualification: LitSeq[Practitioner.Qualification] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): UKCore_Practitioner = new UKCore_Practitioner(
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
    implicitRules,
    communication,
    modifierExtension,
    identifier,
    qualification,
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
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val communication: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("communication", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val qualification: FHIRComponentFieldMeta[LitSeq[Practitioner.Qualification]] =
    FHIRComponentFieldMeta("qualification", lTagOf[LitSeq[Practitioner.Qualification]], false, lTagOf[Practitioner.Qualification])
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
    implicitRules,
    communication,
    modifierExtension,
    identifier,
    qualification
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
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
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[LitSeq[CodeableConcept]](communication, t.communication),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
      FHIRComponentField[LitSeq[Practitioner.Qualification]](qualification, t.qualification)
    ))
  override def fields(t: UKCore_Practitioner): Seq[FHIRComponentField[_]]              = fieldsFromParent(t).get
  def extractId(t: UKCore_Practitioner): Option[String]                                = t.id
  def extractMeta(t: UKCore_Practitioner): Option[Meta]                                = t.meta
  def extractText(t: UKCore_Practitioner): Option[Narrative]                           = t.text
  def extractName(t: UKCore_Practitioner): LitSeq[HumanName]                           = t.name
  def extractPhoto(t: UKCore_Practitioner): LitSeq[Attachment]                         = t.photo
  def extractActive(t: UKCore_Practitioner): Option[Boolean]                           = t.active
  def extractGender(t: UKCore_Practitioner): Option[ADMINISTRATIVE_GENDER]             = t.gender
  def extractTelecom(t: UKCore_Practitioner): LitSeq[ContactPoint]                     = t.telecom
  def extractAddress(t: UKCore_Practitioner): LitSeq[Address]                          = t.address
  def extractLanguage(t: UKCore_Practitioner): Option[LANGUAGES]                       = t.language
  def extractContained(t: UKCore_Practitioner): LitSeq[Resource]                       = t.contained
  def extractExtension(t: UKCore_Practitioner): LitSeq[Extension]                      = t.extension
  def extractBirthDate(t: UKCore_Practitioner): Option[FHIRDate]                       = t.birthDate
  def extractImplicitRules(t: UKCore_Practitioner): Option[UriStr]                     = t.implicitRules
  def extractCommunication(t: UKCore_Practitioner): LitSeq[CodeableConcept]            = t.communication
  def extractModifierExtension(t: UKCore_Practitioner): LitSeq[Extension]              = t.modifierExtension
  def extractIdentifier(t: UKCore_Practitioner): LitSeq[Identifier]                    = t.identifier
  def extractQualification(t: UKCore_Practitioner): LitSeq[Practitioner.Qualification] = t.qualification
  override val thisName: String                                                        = "UKCore_Practitioner"
  override val searchParams: Map[String, UKCore_Practitioner => Seq[Any]]              = Practitioner.searchParams
  def unapply(
      o: UKCore_Practitioner): Option[(Option[String], Option[Meta], Option[Narrative], LitSeq[HumanName], LitSeq[Attachment], Option[Boolean], Option[ADMINISTRATIVE_GENDER], LitSeq[ContactPoint], LitSeq[Address], Option[LANGUAGES], LitSeq[Resource], LitSeq[Extension], Option[FHIRDate], Option[UriStr], LitSeq[CodeableConcept], LitSeq[Extension], LitSeq[Identifier], LitSeq[Practitioner.Qualification])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.name,
        o.photo,
        o.active,
        o.gender,
        o.telecom,
        o.address,
        o.language,
        o.contained,
        o.extension,
        o.birthDate,
        o.implicitRules,
        o.communication,
        o.modifierExtension,
        o.identifier,
        o.qualification))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[UKCore_Practitioner] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new UKCore_Practitioner(
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
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("communication", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Practitioner.Qualification]]("qualification", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Defines the UK Core constraints and extensions on the Practitioner resource for the minimal set of data to query and retrieve
  * practitioner information.
  *
  * Subclass of [[hl7.model.Practitioner]] (A person who is directly or indirectly involved in the provisioning of healthcare.)
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
  * @param name
  *   - The name(s) associated with the practitioner.
  * @param photo
  *   - Image of the person.
  * @param active
  *   - Whether this practitioner's record is in active use.
  * @param gender
  *   - Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes.
  * @param telecom
  *   - A contact detail for the practitioner, e.g. a telephone number or an email address.
  * @param address
  *   - Address(es) of the practitioner that are not role specific (typically home address). Work addresses are not typically
  *     entered in this property as they are usually role dependent.
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
  * @param birthDate
  *   - The date of birth for the practitioner.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *     processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *     other profiles etc.
  * @param communication
  *   - A language the practitioner can use in patient communication.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *     the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *     Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *     strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *     extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *     processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of
  *     any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param identifier
  *   - An identifier that applies to this person in this role.
  * @param qualification
  *   - The official certifications, training, and licenses that authorize or otherwise pertain to the provision of care by the
  *     practitioner. For example, a medical license issued by a medical board authorizing the practitioner to practice medicine
  *     within a certian locality.
  */
@POJOBoilerplate
class UKCore_Practitioner(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-Practitioner"))),
    override val text: Option[Narrative] = None,
    override val name: LitSeq[HumanName] = LitSeq.empty,
    override val photo: LitSeq[Attachment] = LitSeq.empty,
    override val active: Option[Boolean] = None,
    override val gender: Option[ADMINISTRATIVE_GENDER] = None,
    override val telecom: LitSeq[ContactPoint] = LitSeq.empty,
    override val address: LitSeq[Address] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val birthDate: Option[FHIRDate] = None,
    override val implicitRules: Option[UriStr] = None,
    override val communication: LitSeq[CodeableConcept] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val qualification: LitSeq[Practitioner.Qualification] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Practitioner(
      id = id,
      meta = meta,
      text = text,
      name = name,
      photo = photo,
      active = active,
      gender = gender,
      telecom = telecom,
      address = address,
      language = language,
      contained = contained,
      extension = extension,
      birthDate = birthDate,
      identifier = identifier,
      implicitRules = implicitRules,
      communication = communication,
      modifierExtension = modifierExtension,
      qualification = qualification,
      primitiveAttributes = primitiveAttributes
    ) {
  override val thisTypeName: String = "Practitioner"
}
