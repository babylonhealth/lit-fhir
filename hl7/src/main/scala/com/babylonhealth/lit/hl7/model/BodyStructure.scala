package com.babylonhealth.lit.hl7.model

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
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object BodyStructure extends CompanionFor[BodyStructure] {
  override val baseType: CompanionFor[BodyStructure] = BodyStructure
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      image: LitSeq[Attachment] = LitSeq.empty,
      active: Option[Boolean] = None,
      patient: Reference,
      language: Option[LANGUAGES] = None,
      location: Option[CodeableConcept] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      morphology: Option[CodeableConcept] = None,
      description: Option[String] = None,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      locationQualifier: LitSeq[CodeableConcept] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): BodyStructure = new BodyStructure(
    id,
    meta,
    text,
    image,
    active,
    patient,
    language,
    location,
    contained,
    extension,
    identifier,
    morphology,
    description,
    implicitRules,
    modifierExtension,
    locationQualifier,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val image: FHIRComponentFieldMeta[LitSeq[Attachment]] =
    FHIRComponentFieldMeta("image", lTagOf[LitSeq[Attachment]], false, lTagOf[Attachment])
  val active: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("active", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val patient: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("patient", lTagOf[Reference], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val location: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("location", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val morphology: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("morphology", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val description: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val locationQualifier: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("locationQualifier", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    image,
    active,
    patient,
    language,
    location,
    contained,
    extension,
    identifier,
    morphology,
    description,
    implicitRules,
    modifierExtension,
    locationQualifier
  )
  override def fields(t: BodyStructure): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[LitSeq[Attachment]](image, t.image),
    FHIRComponentField[Option[Boolean]](active, t.active),
    FHIRComponentField[Reference](patient, t.patient),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Option[CodeableConcept]](location, t.location),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[CodeableConcept]](morphology, t.morphology),
    FHIRComponentField[Option[String]](description, t.description),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[CodeableConcept]](locationQualifier, t.locationQualifier)
  )
  def extractId(t: BodyStructure): Option[String]                         = t.id
  def extractMeta(t: BodyStructure): Option[Meta]                         = t.meta
  def extractText(t: BodyStructure): Option[Narrative]                    = t.text
  def extractImage(t: BodyStructure): LitSeq[Attachment]                  = t.image
  def extractActive(t: BodyStructure): Option[Boolean]                    = t.active
  def extractPatient(t: BodyStructure): Reference                         = t.patient
  def extractLanguage(t: BodyStructure): Option[LANGUAGES]                = t.language
  def extractLocation(t: BodyStructure): Option[CodeableConcept]          = t.location
  def extractContained(t: BodyStructure): LitSeq[Resource]                = t.contained
  def extractExtension(t: BodyStructure): LitSeq[Extension]               = t.extension
  def extractIdentifier(t: BodyStructure): LitSeq[Identifier]             = t.identifier
  def extractMorphology(t: BodyStructure): Option[CodeableConcept]        = t.morphology
  def extractDescription(t: BodyStructure): Option[String]                = t.description
  def extractImplicitRules(t: BodyStructure): Option[UriStr]              = t.implicitRules
  def extractModifierExtension(t: BodyStructure): LitSeq[Extension]       = t.modifierExtension
  def extractLocationQualifier(t: BodyStructure): LitSeq[CodeableConcept] = t.locationQualifier
  override val thisName: String                                           = "BodyStructure"
  override val searchParams: Map[String, BodyStructure => Seq[Any]] = Map(
    "identifier" -> (obj => obj.identifier.toSeq),
    "location"   -> (obj => obj.location.toSeq),
    "morphology" -> (obj => obj.morphology.toSeq),
    "patient"    -> (obj => Seq(obj.patient))
  )
  def unapply(
      o: BodyStructure): Option[(Option[String], Option[Meta], Option[Narrative], LitSeq[Attachment], Option[Boolean], Reference, Option[LANGUAGES], Option[CodeableConcept], LitSeq[Resource], LitSeq[Extension], LitSeq[Identifier], Option[CodeableConcept], Option[String], Option[UriStr], LitSeq[Extension], LitSeq[CodeableConcept])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.image,
        o.active,
        o.patient,
        o.language,
        o.location,
        o.contained,
        o.extension,
        o.identifier,
        o.morphology,
        o.description,
        o.implicitRules,
        o.modifierExtension,
        o.locationQualifier))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[BodyStructure] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new BodyStructure(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[LitSeq[Attachment]]("image", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Boolean]]("active", Some(None)),
          cursor.decodeAs[Reference]("patient", None),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("location", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("morphology", Some(None)),
          cursor.decodeAs[Option[String]]("description", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("locationQualifier", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Record details about an anatomical structure.  This resource may be used when a coded concept does not provide the necessary detail needed for the use case.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields image, active, patient, location, identifier, morphology, description, locationQualifier.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param image - Image or images used to identify a location.
  * @param active - Whether this body site is in active use.
  * @param patient - The person to which the body site belongs.
  * @param language - The base language in which the resource is written.
  * @param location - The anatomical location or region of the specimen, lesion, or body structure.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param identifier - Identifier for this instance of the anatomical structure.
  * @param morphology - The kind of structure being represented by the body structure at `BodyStructure.location`.  This can define both normal and abnormal morphologies.
  * @param description - A summary, characterization or explanation of the body structure.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param locationQualifier - Qualifier to refine the anatomical location.  These include qualifiers for laterality, relative location, directionality, number, and plane.
  */
@POJOBoilerplate
class BodyStructure(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val image: LitSeq[Attachment] = LitSeq.empty,
    val active: Option[Boolean] = None,
    val patient: Reference,
    override val language: Option[LANGUAGES] = None,
    val location: Option[CodeableConcept] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val morphology: Option[CodeableConcept] = None,
    val description: Option[String] = None,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val locationQualifier: LitSeq[CodeableConcept] = LitSeq.empty,
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
  override val thisTypeName: String = "BodyStructure"
}
