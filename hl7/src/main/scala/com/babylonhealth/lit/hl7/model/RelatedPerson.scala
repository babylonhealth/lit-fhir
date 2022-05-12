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
import com.babylonhealth.lit.hl7.ADMINISTRATIVE_GENDER
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object RelatedPerson extends CompanionFor[RelatedPerson] {
  implicit def summonObjectAndCompanionRelatedPerson_225514101(
      o: RelatedPerson): ObjectAndCompanion[RelatedPerson, RelatedPerson.type] = ObjectAndCompanion(o, this)
  override type ResourceType = RelatedPerson
  override type ParentType   = RelatedPerson
  override val baseType: CompanionFor[ResourceType] = RelatedPerson
  override val parentType: CompanionFor[ParentType] = RelatedPerson
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/RelatedPerson")
  object Communication extends CompanionFor[Communication] {
    implicit def summonObjectAndCompanionCommunication1692176000(
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
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      name: LitSeq[HumanName] = LitSeq.empty,
      photo: LitSeq[Attachment] = LitSeq.empty,
      active: Option[Boolean] = None,
      gender: Option[ADMINISTRATIVE_GENDER] = None,
      period: Option[Period] = None,
      patient: Reference,
      telecom: LitSeq[ContactPoint] = LitSeq.empty,
      address: LitSeq[Address] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      birthDate: Option[FHIRDate] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      relationship: LitSeq[CodeableConcept] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      communication: LitSeq[RelatedPerson.Communication] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): RelatedPerson = new RelatedPerson(
    id,
    meta,
    text,
    name,
    photo,
    active,
    gender,
    period,
    patient,
    telecom,
    address,
    language,
    contained,
    extension,
    birthDate,
    identifier,
    relationship,
    implicitRules,
    modifierExtension,
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
  val period: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("period", lTagOf[Option[Period]], false, lTagOf[Period])
  val patient: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("patient", lTagOf[Reference], false, lTagOf[Reference])
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
  val relationship: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("relationship", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val communication: FHIRComponentFieldMeta[LitSeq[RelatedPerson.Communication]] =
    FHIRComponentFieldMeta(
      "communication",
      lTagOf[LitSeq[RelatedPerson.Communication]],
      false,
      lTagOf[RelatedPerson.Communication])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    name,
    photo,
    active,
    gender,
    period,
    patient,
    telecom,
    address,
    language,
    contained,
    extension,
    birthDate,
    identifier,
    relationship,
    implicitRules,
    modifierExtension,
    communication
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: RelatedPerson): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[LitSeq[HumanName]](name, t.name),
    FHIRComponentField[LitSeq[Attachment]](photo, t.photo),
    FHIRComponentField[Option[Boolean]](active, t.active),
    FHIRComponentField[Option[ADMINISTRATIVE_GENDER]](gender, t.gender),
    FHIRComponentField[Option[Period]](period, t.period),
    FHIRComponentField[Reference](patient, t.patient),
    FHIRComponentField[LitSeq[ContactPoint]](telecom, t.telecom),
    FHIRComponentField[LitSeq[Address]](address, t.address),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[FHIRDate]](birthDate, t.birthDate),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[LitSeq[CodeableConcept]](relationship, t.relationship),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[RelatedPerson.Communication]](communication, t.communication)
  )
  def extractId(t: RelatedPerson): Option[String]                                 = t.id
  def extractMeta(t: RelatedPerson): Option[Meta]                                 = t.meta
  def extractText(t: RelatedPerson): Option[Narrative]                            = t.text
  def extractName(t: RelatedPerson): LitSeq[HumanName]                            = t.name
  def extractPhoto(t: RelatedPerson): LitSeq[Attachment]                          = t.photo
  def extractActive(t: RelatedPerson): Option[Boolean]                            = t.active
  def extractGender(t: RelatedPerson): Option[ADMINISTRATIVE_GENDER]              = t.gender
  def extractPeriod(t: RelatedPerson): Option[Period]                             = t.period
  def extractPatient(t: RelatedPerson): Reference                                 = t.patient
  def extractTelecom(t: RelatedPerson): LitSeq[ContactPoint]                      = t.telecom
  def extractAddress(t: RelatedPerson): LitSeq[Address]                           = t.address
  def extractLanguage(t: RelatedPerson): Option[LANGUAGES]                        = t.language
  def extractContained(t: RelatedPerson): LitSeq[Resource]                        = t.contained
  def extractExtension(t: RelatedPerson): LitSeq[Extension]                       = t.extension
  def extractBirthDate(t: RelatedPerson): Option[FHIRDate]                        = t.birthDate
  def extractIdentifier(t: RelatedPerson): LitSeq[Identifier]                     = t.identifier
  def extractRelationship(t: RelatedPerson): LitSeq[CodeableConcept]              = t.relationship
  def extractImplicitRules(t: RelatedPerson): Option[UriStr]                      = t.implicitRules
  def extractModifierExtension(t: RelatedPerson): LitSeq[Extension]               = t.modifierExtension
  def extractCommunication(t: RelatedPerson): LitSeq[RelatedPerson.Communication] = t.communication
  override val thisName: String                                                   = "RelatedPerson"
  override val searchParams: Map[String, RelatedPerson => Seq[Any]] = Map(
    "phonetic"           -> (obj => obj.name.toSeq),
    "address-state"      -> (obj => obj.address.flatMap(_.state).toSeq),
    "address-postalcode" -> (obj => obj.address.flatMap(_.postalCode).toSeq),
    "address-use"        -> (obj => obj.address.flatMap(_.use).toSeq),
    "address-country"    -> (obj => obj.address.flatMap(_.country).toSeq),
    "address-city"       -> (obj => obj.address.flatMap(_.city).toSeq),
    "name"               -> (obj => obj.name.toSeq),
    "email"              -> (obj => obj.telecom.filter(_.system.map(_.name) contains "email").toSeq),
    "identifier"         -> (obj => obj.identifier.toSeq),
    "birthdate"          -> (obj => obj.birthDate.toSeq),
    "relationship"       -> (obj => obj.relationship.toSeq),
    "telecom"            -> (obj => obj.telecom.toSeq),
    "address"            -> (obj => obj.address.toSeq),
    "phone"              -> (obj => obj.telecom.filter(_.system.map(_.name) contains "phone").toSeq),
    "gender"             -> (obj => obj.gender.toSeq),
    "patient"            -> (obj => Seq(obj.patient)),
    "active"             -> (obj => obj.active.toSeq)
  )
  def unapply(
      o: RelatedPerson): Option[(Option[String], Option[Meta], Option[Narrative], LitSeq[HumanName], LitSeq[Attachment], Option[Boolean], Option[ADMINISTRATIVE_GENDER], Option[Period], Reference, LitSeq[ContactPoint], LitSeq[Address], Option[LANGUAGES], LitSeq[Resource], LitSeq[Extension], Option[FHIRDate], LitSeq[Identifier], LitSeq[CodeableConcept], Option[UriStr], LitSeq[Extension], LitSeq[RelatedPerson.Communication])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.name,
        o.photo,
        o.active,
        o.gender,
        o.period,
        o.patient,
        o.telecom,
        o.address,
        o.language,
        o.contained,
        o.extension,
        o.birthDate,
        o.identifier,
        o.relationship,
        o.implicitRules,
        o.modifierExtension,
        o.communication))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[RelatedPerson] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new RelatedPerson(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[LitSeq[HumanName]]("name", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Attachment]]("photo", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Boolean]]("active", Some(None)),
          cursor.decodeAs[Option[ADMINISTRATIVE_GENDER]]("gender", Some(None)),
          cursor.decodeAs[Option[Period]]("period", Some(None)),
          cursor.decodeAs[Reference]("patient", None),
          cursor.decodeAs[LitSeq[ContactPoint]]("telecom", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Address]]("address", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[FHIRDate]]("birthDate", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("relationship", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[RelatedPerson.Communication]]("communication", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Information about a person that is involved in the care for a patient, but who is not the target of healthcare, nor has a
  * formal responsibility in the care process.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields name, photo, active, gender, period, patient, telecom, address, birthDate, identifier, relationship,
  *   communication.
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
  *   - Image of the person.
  * @param active
  *   - Whether this related person record is in active use.
  * @param gender
  *   - Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes.
  * @param period
  *   - The period of time during which this relationship is or was active. If there are no dates defined, then the interval is
  *   unknown.
  * @param patient
  *   - The patient this person is related to.
  * @param telecom
  *   - A contact detail for the person, e.g. a telephone number or an email address.
  * @param address
  *   - Address where the related person can be contacted or visited.
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
  *   - The date on which the related person was born.
  * @param identifier
  *   - Identifier for a person within a particular scope.
  * @param relationship
  *   - The nature of the relationship between a patient and the related person.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that
  *   modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *   Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *   strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *   extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *   processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any
  *   elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param communication
  *   - A language which may be used to communicate with about the patient's health.
  */
@POJOBoilerplate
class RelatedPerson(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val name: LitSeq[HumanName] = LitSeq.empty,
    val photo: LitSeq[Attachment] = LitSeq.empty,
    val active: Option[Boolean] = None,
    val gender: Option[ADMINISTRATIVE_GENDER] = None,
    val period: Option[Period] = None,
    val patient: Reference,
    val telecom: LitSeq[ContactPoint] = LitSeq.empty,
    val address: LitSeq[Address] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val birthDate: Option[FHIRDate] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val relationship: LitSeq[CodeableConcept] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val communication: LitSeq[RelatedPerson.Communication] = LitSeq.empty,
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
  override val thisTypeName: String = "RelatedPerson"
}
