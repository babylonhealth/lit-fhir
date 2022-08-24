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

object UKCore_Patient extends CompanionFor[UKCore_Patient] {
  implicit def summonObjectAndCompanionUKCore_Patient_1968368010(
      o: UKCore_Patient): ObjectAndCompanion[UKCore_Patient, UKCore_Patient.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Patient
  override type ParentType   = Patient
  override val baseType: CompanionFor[ResourceType] = Patient
  override val parentType: CompanionFor[ParentType] = Patient
  override val profileUrl: Option[String]           = Some("https://fhir.hl7.org.uk/StructureDefinition/UKCore-Patient")
  type DeceasedChoice      = Choice[UnionBooleanOrDateTime]
  type MultipleBirthChoice = Choice[UnionBooleanOrInteger]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-Patient"))),
      text: Option[Narrative] = None,
      name: LitSeq[HumanName] = LitSeq.empty,
      photo: LitSeq[Attachment] = LitSeq.empty,
      active: Option[Boolean] = None,
      gender: Option[ADMINISTRATIVE_GENDER] = None,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      deceased: Option[UKCore_Patient.DeceasedChoice] = None,
      implicitRules: Option[UriStr] = None,
      maritalStatus: Option[CodeableConcept] = None,
      multipleBirth: Option[UKCore_Patient.MultipleBirthChoice] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      address: LitSeq[Address] = LitSeq.empty,
      birthDate: Option[FHIRDate] = None,
      telecom: LitSeq[ContactPoint] = LitSeq.empty,
      communication: LitSeq[Patient.Communication] = LitSeq.empty,
      link: LitSeq[Patient.Link] = LitSeq.empty,
      generalPractitioner: LitSeq[Reference] = LitSeq.empty,
      contact: LitSeq[Patient.Contact] = LitSeq.empty,
      managingOrganization: Option[Reference] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): UKCore_Patient = new UKCore_Patient(
    id,
    meta,
    text,
    name,
    photo,
    active,
    gender,
    language,
    contained,
    extension,
    identifier,
    deceased,
    implicitRules,
    maritalStatus,
    multipleBirth,
    modifierExtension,
    address,
    birthDate,
    telecom,
    communication,
    link,
    generalPractitioner,
    contact,
    managingOrganization,
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
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val deceased: FHIRComponentFieldMeta[Option[UKCore_Patient.DeceasedChoice]] =
    FHIRComponentFieldMeta("deceased", lTagOf[Option[UKCore_Patient.DeceasedChoice]], true, lTagOf[UnionBooleanOrDateTime])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val maritalStatus: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("maritalStatus", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val multipleBirth: FHIRComponentFieldMeta[Option[UKCore_Patient.MultipleBirthChoice]] =
    FHIRComponentFieldMeta(
      "multipleBirth",
      lTagOf[Option[UKCore_Patient.MultipleBirthChoice]],
      true,
      lTagOf[UnionBooleanOrInteger])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val address: FHIRComponentFieldMeta[LitSeq[Address]] =
    FHIRComponentFieldMeta("address", lTagOf[LitSeq[Address]], false, lTagOf[Address])
  val birthDate: FHIRComponentFieldMeta[Option[FHIRDate]] =
    FHIRComponentFieldMeta("birthDate", lTagOf[Option[FHIRDate]], false, lTagOf[FHIRDate])
  val telecom: FHIRComponentFieldMeta[LitSeq[ContactPoint]] =
    FHIRComponentFieldMeta("telecom", lTagOf[LitSeq[ContactPoint]], false, lTagOf[ContactPoint])
  val communication: FHIRComponentFieldMeta[LitSeq[Patient.Communication]] =
    FHIRComponentFieldMeta("communication", lTagOf[LitSeq[Patient.Communication]], false, lTagOf[Patient.Communication])
  val link: FHIRComponentFieldMeta[LitSeq[Patient.Link]] =
    FHIRComponentFieldMeta("link", lTagOf[LitSeq[Patient.Link]], false, lTagOf[Patient.Link])
  val generalPractitioner: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("generalPractitioner", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val contact: FHIRComponentFieldMeta[LitSeq[Patient.Contact]] =
    FHIRComponentFieldMeta("contact", lTagOf[LitSeq[Patient.Contact]], false, lTagOf[Patient.Contact])
  val managingOrganization: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("managingOrganization", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    name,
    photo,
    active,
    gender,
    language,
    contained,
    extension,
    identifier,
    deceased,
    implicitRules,
    maritalStatus,
    multipleBirth,
    modifierExtension,
    address,
    birthDate,
    telecom,
    communication,
    link,
    generalPractitioner,
    contact,
    managingOrganization
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
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[LitSeq[Resource]](contained, t.contained),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
      FHIRComponentField[Option[UKCore_Patient.DeceasedChoice]](deceased, t.deceased),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[Option[CodeableConcept]](maritalStatus, t.maritalStatus),
      FHIRComponentField[Option[UKCore_Patient.MultipleBirthChoice]](multipleBirth, t.multipleBirth),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[Address]](address, t.address),
      FHIRComponentField[Option[FHIRDate]](birthDate, t.birthDate),
      FHIRComponentField[LitSeq[ContactPoint]](telecom, t.telecom),
      FHIRComponentField[LitSeq[Patient.Communication]](communication, t.communication),
      FHIRComponentField[LitSeq[Patient.Link]](link, t.link),
      FHIRComponentField[LitSeq[Reference]](generalPractitioner, t.generalPractitioner),
      FHIRComponentField[LitSeq[Patient.Contact]](contact, t.contact),
      FHIRComponentField[Option[Reference]](managingOrganization, t.managingOrganization)
    ))
  override def fields(t: UKCore_Patient): Seq[FHIRComponentField[_]]                      = fieldsFromParent(t).get
  def extractId(t: UKCore_Patient): Option[String]                                        = t.id
  def extractMeta(t: UKCore_Patient): Option[Meta]                                        = t.meta
  def extractText(t: UKCore_Patient): Option[Narrative]                                   = t.text
  def extractName(t: UKCore_Patient): LitSeq[HumanName]                                   = t.name
  def extractPhoto(t: UKCore_Patient): LitSeq[Attachment]                                 = t.photo
  def extractActive(t: UKCore_Patient): Option[Boolean]                                   = t.active
  def extractGender(t: UKCore_Patient): Option[ADMINISTRATIVE_GENDER]                     = t.gender
  def extractLanguage(t: UKCore_Patient): Option[LANGUAGES]                               = t.language
  def extractContained(t: UKCore_Patient): LitSeq[Resource]                               = t.contained
  def extractExtension(t: UKCore_Patient): LitSeq[Extension]                              = t.extension
  def extractIdentifier(t: UKCore_Patient): LitSeq[Identifier]                            = t.identifier
  def extractDeceased(t: UKCore_Patient): Option[UKCore_Patient.DeceasedChoice]           = t.deceased
  def extractImplicitRules(t: UKCore_Patient): Option[UriStr]                             = t.implicitRules
  def extractMaritalStatus(t: UKCore_Patient): Option[CodeableConcept]                    = t.maritalStatus
  def extractMultipleBirth(t: UKCore_Patient): Option[UKCore_Patient.MultipleBirthChoice] = t.multipleBirth
  def extractModifierExtension(t: UKCore_Patient): LitSeq[Extension]                      = t.modifierExtension
  def extractAddress(t: UKCore_Patient): LitSeq[Address]                                  = t.address
  def extractBirthDate(t: UKCore_Patient): Option[FHIRDate]                               = t.birthDate
  def extractTelecom(t: UKCore_Patient): LitSeq[ContactPoint]                             = t.telecom
  def extractCommunication(t: UKCore_Patient): LitSeq[Patient.Communication]              = t.communication
  def extractLink(t: UKCore_Patient): LitSeq[Patient.Link]                                = t.link
  def extractGeneralPractitioner(t: UKCore_Patient): LitSeq[Reference]                    = t.generalPractitioner
  def extractContact(t: UKCore_Patient): LitSeq[Patient.Contact]                          = t.contact
  def extractManagingOrganization(t: UKCore_Patient): Option[Reference]                   = t.managingOrganization
  override val thisName: String                                                           = "UKCore_Patient"
  override val searchParams: Map[String, UKCore_Patient => Seq[Any]]                      = Patient.searchParams
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[UKCore_Patient] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new UKCore_Patient(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[LitSeq[HumanName]]("name", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Attachment]]("photo", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Boolean]]("active", Some(None)),
          cursor.decodeAs[Option[ADMINISTRATIVE_GENDER]]("gender", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeOptRef[UnionBooleanOrDateTime]("deceased"),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("maritalStatus", Some(None)),
          cursor.decodeOptRef[UnionBooleanOrInteger]("multipleBirth"),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Address]]("address", Some(LitSeq.empty)),
          cursor.decodeAs[Option[FHIRDate]]("birthDate", Some(None)),
          cursor.decodeAs[LitSeq[ContactPoint]]("telecom", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Patient.Communication]]("communication", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Patient.Link]]("link", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("generalPractitioner", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Patient.Contact]]("contact", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("managingOrganization", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** Defines the UK Core constraints and extensions on the Patient resource for the minimal set of data to query and retrieve an
  * individual’s demographic information.
  *
  * Subclass of [[hl7.model.Patient]] (Demographics and other administrative information about an individual or animal receiving
  * care or other health-related services.)
  *
  * @constructor
  *   Inherits all params from parent.
  * @param id
  *   \- The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta
  *   \- The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *   not always be associated with version changes to the resource.
  * @param text
  *   \- A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *   resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to
  *   make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be
  *   represented in the narrative to ensure clinical safety.
  * @param name
  *   \- A name associated with the individual.
  * @param photo
  *   \- Image of the patient.
  * @param active
  *   \- Whether this patient record is in active use. Many systems use this property to mark as non-current patients, such as
  *   those that have not been seen for a period of time based on an organization's business rules. It is often used to filter
  *   patient lists to exclude inactive patients Deceased patients may also be marked as inactive for the same reasons, but may be
  *   active for some time after death.
  * @param gender
  *   \- Administrative Gender - the gender that the patient is considered to have for administration and record keeping purposes.
  * @param language
  *   \- The base language in which the resource is written.
  * @param contained
  *   \- These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   \- May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param identifier
  *   \- An identifier for this patient.
  * @param deceased
  *   \- Indicates if the individual is deceased or not.
  * @param implicitRules
  *   \- A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param maritalStatus
  *   \- This field contains a patient's most recent marital (civil) status.
  * @param multipleBirth
  *   \- Indicates whether the patient is part of a multiple (boolean) or indicates the actual birth order (integer).
  * @param modifierExtension
  *   \- May be used to represent additional information that is not part of the basic definition of the resource and that
  *   modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *   Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *   strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *   extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *   processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any
  *   elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param address
  *   \- An address for the individual
  * @param birthDate
  *   \- The date of birth for the individual.
  * @param telecom
  *   \- A contact detail (e.g. a telephone number or an email address) by which the individual may be contacted.
  * @param communication
  *   \- A language which may be used to communicate with the patient about his or her health.
  * @param link
  *   \- Link to another patient resource that concerns the same actual patient.
  * @param generalPractitioner
  *   \- Patient's nominated care provider.
  * @param contact
  *   \- A contact party (e.g. guardian, partner, friend) for the patient.
  * @param managingOrganization
  *   \- Organization that is the custodian of the patient record.
  */
@POJOBoilerplate
class UKCore_Patient(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-Patient"))),
    override val text: Option[Narrative] = None,
    override val name: LitSeq[HumanName] = LitSeq.empty,
    override val photo: LitSeq[Attachment] = LitSeq.empty,
    override val active: Option[Boolean] = None,
    override val gender: Option[ADMINISTRATIVE_GENDER] = None,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val deceased: Option[UKCore_Patient.DeceasedChoice] = None,
    override val implicitRules: Option[UriStr] = None,
    override val maritalStatus: Option[CodeableConcept] = None,
    override val multipleBirth: Option[UKCore_Patient.MultipleBirthChoice] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val address: LitSeq[Address] = LitSeq.empty,
    override val birthDate: Option[FHIRDate] = None,
    override val telecom: LitSeq[ContactPoint] = LitSeq.empty,
    override val communication: LitSeq[Patient.Communication] = LitSeq.empty,
    override val link: LitSeq[Patient.Link] = LitSeq.empty,
    override val generalPractitioner: LitSeq[Reference] = LitSeq.empty,
    override val contact: LitSeq[Patient.Contact] = LitSeq.empty,
    override val managingOrganization: Option[Reference] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Patient(
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
      deceased = deceased,
      implicitRules = implicitRules,
      maritalStatus = maritalStatus,
      multipleBirth = multipleBirth,
      modifierExtension = modifierExtension,
      generalPractitioner = generalPractitioner,
      managingOrganization = managingOrganization,
      link = link,
      contact = contact,
      communication = communication,
      primitiveAttributes = primitiveAttributes
    ) {
  override val thisTypeName: String = "Patient"
}
