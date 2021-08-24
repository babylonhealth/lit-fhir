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
import com.babylonhealth.lit.uscore.UnionAliases._
import com.babylonhealth.lit.hl7.ADMINISTRATIVE_GENDER
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, usbase, uscore }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Us_core_patient extends CompanionFor[Us_core_patient] {
  implicit def summonObjectAndCompanionUs_core_patient1483761426(
      o: Us_core_patient): ObjectAndCompanion[Us_core_patient, Us_core_patient.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Patient
  override type ParentType   = Patient
  override val baseType: CompanionFor[ResourceType] = Patient
  override val parentType: CompanionFor[ParentType] = Patient
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/us/core/StructureDefinition/us-core-patient")
  type DeceasedChoice      = Choice[UnionBooleanOrDateTime]
  type MultipleBirthChoice = Choice[UnionBooleanOrInteger]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(new Meta(profile = LitSeq("http://hl7.org/fhir/us/core/StructureDefinition/us-core-patient"))),
      text: Option[Narrative] = None,
      photo: LitSeq[Attachment] = LitSeq.empty,
      active: Option[Boolean] = None,
      gender: ADMINISTRATIVE_GENDER,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      birthDate: Option[FHIRDate] = None,
      deceased: Option[Us_core_patient.DeceasedChoice] = None,
      implicitRules: Option[UriStr] = None,
      maritalStatus: Option[CodeableConcept] = None,
      name: NonEmptyLitSeq[HumanName],
      multipleBirth: Option[Us_core_patient.MultipleBirthChoice] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      telecom: LitSeq[ContactPoint] = LitSeq.empty,
      address: LitSeq[Address] = LitSeq.empty,
      generalPractitioner: LitSeq[Reference] = LitSeq.empty,
      identifier: NonEmptyLitSeq[Identifier],
      managingOrganization: Option[Reference] = None,
      link: LitSeq[Patient.Link] = LitSeq.empty,
      contact: LitSeq[Patient.Contact] = LitSeq.empty,
      communication: LitSeq[Patient.Communication] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Us_core_patient = new Us_core_patient(
    id,
    meta,
    text,
    photo,
    active,
    gender,
    language,
    contained,
    extension,
    birthDate,
    deceased,
    implicitRules,
    maritalStatus,
    name,
    multipleBirth,
    modifierExtension,
    telecom,
    address,
    generalPractitioner,
    identifier,
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
  val photo: FHIRComponentFieldMeta[LitSeq[Attachment]] =
    FHIRComponentFieldMeta("photo", lTagOf[LitSeq[Attachment]], false, lTagOf[Attachment])
  val active: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("active", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val gender: FHIRComponentFieldMeta[ADMINISTRATIVE_GENDER] =
    FHIRComponentFieldMeta("gender", lTagOf[ADMINISTRATIVE_GENDER], false, lTagOf[ADMINISTRATIVE_GENDER])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val birthDate: FHIRComponentFieldMeta[Option[FHIRDate]] =
    FHIRComponentFieldMeta("birthDate", lTagOf[Option[FHIRDate]], false, lTagOf[FHIRDate])
  val deceased: FHIRComponentFieldMeta[Option[Us_core_patient.DeceasedChoice]] =
    FHIRComponentFieldMeta("deceased", lTagOf[Option[Us_core_patient.DeceasedChoice]], true, lTagOf[UnionBooleanOrDateTime])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val maritalStatus: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("maritalStatus", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val name: FHIRComponentFieldMeta[NonEmptyLitSeq[HumanName]] =
    FHIRComponentFieldMeta("name", lTagOf[NonEmptyLitSeq[HumanName]], false, lTagOf[HumanName])
  val multipleBirth: FHIRComponentFieldMeta[Option[Us_core_patient.MultipleBirthChoice]] =
    FHIRComponentFieldMeta(
      "multipleBirth",
      lTagOf[Option[Us_core_patient.MultipleBirthChoice]],
      true,
      lTagOf[UnionBooleanOrInteger])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val telecom: FHIRComponentFieldMeta[LitSeq[ContactPoint]] =
    FHIRComponentFieldMeta("telecom", lTagOf[LitSeq[ContactPoint]], false, lTagOf[ContactPoint])
  val address: FHIRComponentFieldMeta[LitSeq[Address]] =
    FHIRComponentFieldMeta("address", lTagOf[LitSeq[Address]], false, lTagOf[Address])
  val generalPractitioner: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("generalPractitioner", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[NonEmptyLitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[NonEmptyLitSeq[Identifier]], false, lTagOf[Identifier])
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
    photo,
    active,
    gender,
    language,
    contained,
    extension,
    birthDate,
    deceased,
    implicitRules,
    maritalStatus,
    name,
    multipleBirth,
    modifierExtension,
    telecom,
    address,
    generalPractitioner,
    identifier,
    managingOrganization,
    link,
    contact,
    communication
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Meta]](meta, t.meta),
      FHIRComponentField[Option[Narrative]](text, t.text),
      FHIRComponentField[LitSeq[Attachment]](photo, t.photo),
      FHIRComponentField[Option[Boolean]](active, t.active),
      FHIRComponentField[ADMINISTRATIVE_GENDER](gender, t.gender.get),
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[LitSeq[Resource]](contained, t.contained),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[FHIRDate]](birthDate, t.birthDate),
      FHIRComponentField[Option[Us_core_patient.DeceasedChoice]](deceased, t.deceased),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[Option[CodeableConcept]](maritalStatus, t.maritalStatus),
      FHIRComponentField[NonEmptyLitSeq[HumanName]](name, t.name.asNonEmpty),
      FHIRComponentField[Option[Us_core_patient.MultipleBirthChoice]](multipleBirth, t.multipleBirth),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[ContactPoint]](telecom, t.telecom),
      FHIRComponentField[LitSeq[Address]](address, t.address),
      FHIRComponentField[LitSeq[Reference]](generalPractitioner, t.generalPractitioner),
      FHIRComponentField[NonEmptyLitSeq[Identifier]](identifier, t.identifier.asNonEmpty),
      FHIRComponentField[Option[Reference]](managingOrganization, t.managingOrganization),
      FHIRComponentField[LitSeq[Patient.Link]](link, t.link),
      FHIRComponentField[LitSeq[Patient.Contact]](contact, t.contact),
      FHIRComponentField[LitSeq[Patient.Communication]](communication, t.communication)
    ))
  override def fields(t: Us_core_patient): Seq[FHIRComponentField[_]]                       = fieldsFromParent(t).get
  def extractId(t: Us_core_patient): Option[String]                                         = t.id
  def extractMeta(t: Us_core_patient): Option[Meta]                                         = t.meta
  def extractText(t: Us_core_patient): Option[Narrative]                                    = t.text
  def extractPhoto(t: Us_core_patient): LitSeq[Attachment]                                  = t.photo
  def extractActive(t: Us_core_patient): Option[Boolean]                                    = t.active
  def extractGender(t: Us_core_patient): ADMINISTRATIVE_GENDER                              = t.gender.get
  def extractLanguage(t: Us_core_patient): Option[LANGUAGES]                                = t.language
  def extractContained(t: Us_core_patient): LitSeq[Resource]                                = t.contained
  def extractExtension(t: Us_core_patient): LitSeq[Extension]                               = t.extension
  def extractBirthDate(t: Us_core_patient): Option[FHIRDate]                                = t.birthDate
  def extractDeceased(t: Us_core_patient): Option[Us_core_patient.DeceasedChoice]           = t.deceased
  def extractImplicitRules(t: Us_core_patient): Option[UriStr]                              = t.implicitRules
  def extractMaritalStatus(t: Us_core_patient): Option[CodeableConcept]                     = t.maritalStatus
  def extractName(t: Us_core_patient): NonEmptyLitSeq[HumanName]                            = t.name.asNonEmpty
  def extractMultipleBirth(t: Us_core_patient): Option[Us_core_patient.MultipleBirthChoice] = t.multipleBirth
  def extractModifierExtension(t: Us_core_patient): LitSeq[Extension]                       = t.modifierExtension
  def extractTelecom(t: Us_core_patient): LitSeq[ContactPoint]                              = t.telecom
  def extractAddress(t: Us_core_patient): LitSeq[Address]                                   = t.address
  def extractGeneralPractitioner(t: Us_core_patient): LitSeq[Reference]                     = t.generalPractitioner
  def extractIdentifier(t: Us_core_patient): NonEmptyLitSeq[Identifier]                     = t.identifier.asNonEmpty
  def extractManagingOrganization(t: Us_core_patient): Option[Reference]                    = t.managingOrganization
  def extractLink(t: Us_core_patient): LitSeq[Patient.Link]                                 = t.link
  def extractContact(t: Us_core_patient): LitSeq[Patient.Contact]                           = t.contact
  def extractCommunication(t: Us_core_patient): LitSeq[Patient.Communication]               = t.communication
  override val thisName: String                                                             = "Us_core_patient"
  override val searchParams: Map[String, Us_core_patient => Seq[Any]]                       = Patient.searchParams
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Us_core_patient] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Us_core_patient(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[LitSeq[Attachment]]("photo", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Boolean]]("active", Some(None)),
          cursor.decodeAs[ADMINISTRATIVE_GENDER]("gender", None),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[FHIRDate]]("birthDate", Some(None)),
          cursor.decodeOptRef[UnionBooleanOrDateTime]("deceased"),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("maritalStatus", Some(None)),
          cursor.decodeAs[NonEmptyLitSeq[HumanName]]("name", None),
          cursor.decodeOptRef[UnionBooleanOrInteger]("multipleBirth"),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[ContactPoint]]("telecom", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Address]]("address", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("generalPractitioner", Some(LitSeq.empty)),
          cursor.decodeAs[NonEmptyLitSeq[Identifier]]("identifier", None),
          cursor.decodeAs[Option[Reference]]("managingOrganization", Some(None)),
          cursor.decodeAs[LitSeq[Patient.Link]]("link", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Patient.Contact]]("contact", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Patient.Communication]]("communication", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Defines constraints and extensions on the patient resource for the minimal set of data to query and retrieve patient
  * demographic information.
  *
  * Subclass of [[hl7.model.Patient]] (Demographics and other administrative information about an individual or animal receiving
  * care or other health-related services.)
  *
  * @constructor
  *   Inherits all params from parent. Requires the following fields which were optional in the parent: gender, name, identifier.
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
  * @param photo
  *   - Image of the patient.
  * @param active
  *   - Whether this patient record is in active use. Many systems use this property to mark as non-current patients, such as
  *   those that have not been seen for a period of time based on an organization's business rules. It is often used to filter
  *   patient lists to exclude inactive patients Deceased patients may also be marked as inactive for the same reasons, but may be
  *   active for some time after death.
  * @param gender
  *   - Administrative Gender - the gender that the patient is considered to have for administration and record keeping purposes.
  * @param language
  *   - The base language in which the resource is written.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - An Extension
  * @param birthDate
  *   - The date of birth for the individual.
  * @param deceased
  *   - Indicates if the individual is deceased or not.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param maritalStatus
  *   - This field contains a patient's most recent marital (civil) status.
  * @param name
  *   - A name associated with the individual.
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
  * @param telecom
  *   - A contact detail (e.g. a telephone number or an email address) by which the individual may be contacted.
  * @param address
  *   - An address for the individual.
  * @param generalPractitioner
  *   - Patient's nominated care provider.
  * @param identifier
  *   - An identifier for this patient.
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
class Us_core_patient(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("http://hl7.org/fhir/us/core/StructureDefinition/us-core-patient"))),
    override val text: Option[Narrative] = None,
    override val photo: LitSeq[Attachment] = LitSeq.empty,
    override val active: Option[Boolean] = None,
    gender: ADMINISTRATIVE_GENDER,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val birthDate: Option[FHIRDate] = None,
    override val deceased: Option[Us_core_patient.DeceasedChoice] = None,
    override val implicitRules: Option[UriStr] = None,
    override val maritalStatus: Option[CodeableConcept] = None,
    name: NonEmptyLitSeq[HumanName],
    override val multipleBirth: Option[Us_core_patient.MultipleBirthChoice] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val telecom: LitSeq[ContactPoint] = LitSeq.empty,
    override val address: LitSeq[Address] = LitSeq.empty,
    override val generalPractitioner: LitSeq[Reference] = LitSeq.empty,
    identifier: NonEmptyLitSeq[Identifier],
    override val managingOrganization: Option[Reference] = None,
    override val link: LitSeq[Patient.Link] = LitSeq.empty,
    override val contact: LitSeq[Patient.Contact] = LitSeq.empty,
    override val communication: LitSeq[Patient.Communication] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Patient(
      id = id,
      meta = meta,
      text = text,
      name = name.refine,
      photo = photo,
      active = active,
      gender = Some(gender),
      telecom = telecom,
      address = address,
      language = language,
      contained = contained,
      extension = extension,
      birthDate = birthDate,
      identifier = identifier.refine,
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
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Patient"
}
