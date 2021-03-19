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

object MedicinalProductContraindication extends CompanionFor[MedicinalProductContraindication] {
  override type ResourceType = MedicinalProductContraindication
  override val baseType: CompanionFor[ResourceType] = MedicinalProductContraindication
  override val profileUrl: Option[String] = Some(
    "http://hl7.org/fhir/StructureDefinition/MedicinalProductContraindication")
  object OtherTherapy extends CompanionFor[OtherTherapy] {
    override type ResourceType = OtherTherapy
    type MedicationChoice      = Choice[Union01025009075]
    def apply(
        id: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        medication: OtherTherapy.MedicationChoice,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        therapyRelationshipType: CodeableConcept,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): OtherTherapy = new OtherTherapy(
      id,
      extension,
      medication,
      modifierExtension,
      therapyRelationshipType,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: OtherTherapy): Option[(Option[String], LitSeq[Extension], OtherTherapy.MedicationChoice, LitSeq[Extension], CodeableConcept)] =
      Some((o.id, o.extension, o.medication, o.modifierExtension, o.therapyRelationshipType))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val medication: FHIRComponentFieldMeta[OtherTherapy.MedicationChoice] =
      FHIRComponentFieldMeta("medication", lTagOf[OtherTherapy.MedicationChoice], true, lTagOf[Union01025009075])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val therapyRelationshipType: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("therapyRelationshipType", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, extension, medication, modifierExtension, therapyRelationshipType)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: OtherTherapy): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[OtherTherapy.MedicationChoice](medication, t.medication),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[CodeableConcept](therapyRelationshipType, t.therapyRelationshipType)
    )
    val baseType: CompanionFor[OtherTherapy] = this
    val thisName: String                     = "OtherTherapy"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[OtherTherapy] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new OtherTherapy(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeRef[Union01025009075]("medication"),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[CodeableConcept]("therapyRelationshipType", None),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class OtherTherapy(
      override val id: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val medication: OtherTherapy.MedicationChoice,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val therapyRelationshipType: CodeableConcept,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      subject: LitSeq[Reference] = LitSeq.empty,
      disease: Option[CodeableConcept] = None,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      population: LitSeq[Choice["Population"]] = LitSeq.empty,
      comorbidity: LitSeq[CodeableConcept] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      diseaseStatus: Option[CodeableConcept] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      therapeuticIndication: LitSeq[Reference] = LitSeq.empty,
      otherTherapy: LitSeq[MedicinalProductContraindication.OtherTherapy] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): MedicinalProductContraindication = new MedicinalProductContraindication(
    id,
    meta,
    text,
    subject,
    disease,
    language,
    contained,
    extension,
    population,
    comorbidity,
    implicitRules,
    diseaseStatus,
    modifierExtension,
    therapeuticIndication,
    otherTherapy,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val subject: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("subject", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val disease: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("disease", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val population: FHIRComponentFieldMeta[LitSeq[Choice["Population"]]] =
    FHIRComponentFieldMeta("population", lTagOf[LitSeq[Choice["Population"]]], false, lTagOf[Choice["Population"]])
  val comorbidity: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("comorbidity", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val diseaseStatus: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("diseaseStatus", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val therapeuticIndication: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("therapeuticIndication", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val otherTherapy: FHIRComponentFieldMeta[LitSeq[MedicinalProductContraindication.OtherTherapy]] =
    FHIRComponentFieldMeta(
      "otherTherapy",
      lTagOf[LitSeq[MedicinalProductContraindication.OtherTherapy]],
      false,
      lTagOf[MedicinalProductContraindication.OtherTherapy])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    subject,
    disease,
    language,
    contained,
    extension,
    population,
    comorbidity,
    implicitRules,
    diseaseStatus,
    modifierExtension,
    therapeuticIndication,
    otherTherapy
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: MedicinalProductContraindication): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[LitSeq[Reference]](subject, t.subject),
    FHIRComponentField[Option[CodeableConcept]](disease, t.disease),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[Choice["Population"]]](population, t.population),
    FHIRComponentField[LitSeq[CodeableConcept]](comorbidity, t.comorbidity),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[CodeableConcept]](diseaseStatus, t.diseaseStatus),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[Reference]](therapeuticIndication, t.therapeuticIndication),
    FHIRComponentField[LitSeq[MedicinalProductContraindication.OtherTherapy]](otherTherapy, t.otherTherapy)
  )
  def extractId(t: MedicinalProductContraindication): Option[String]                       = t.id
  def extractMeta(t: MedicinalProductContraindication): Option[Meta]                       = t.meta
  def extractText(t: MedicinalProductContraindication): Option[Narrative]                  = t.text
  def extractSubject(t: MedicinalProductContraindication): LitSeq[Reference]               = t.subject
  def extractDisease(t: MedicinalProductContraindication): Option[CodeableConcept]         = t.disease
  def extractLanguage(t: MedicinalProductContraindication): Option[LANGUAGES]              = t.language
  def extractContained(t: MedicinalProductContraindication): LitSeq[Resource]              = t.contained
  def extractExtension(t: MedicinalProductContraindication): LitSeq[Extension]             = t.extension
  def extractPopulation(t: MedicinalProductContraindication): LitSeq[Choice["Population"]] = t.population
  def extractComorbidity(t: MedicinalProductContraindication): LitSeq[CodeableConcept]     = t.comorbidity
  def extractImplicitRules(t: MedicinalProductContraindication): Option[UriStr]            = t.implicitRules
  def extractDiseaseStatus(t: MedicinalProductContraindication): Option[CodeableConcept]   = t.diseaseStatus
  def extractModifierExtension(t: MedicinalProductContraindication): LitSeq[Extension]     = t.modifierExtension
  def extractTherapeuticIndication(t: MedicinalProductContraindication): LitSeq[Reference] = t.therapeuticIndication
  def extractOtherTherapy(t: MedicinalProductContraindication): LitSeq[MedicinalProductContraindication.OtherTherapy] =
    t.otherTherapy
  override val thisName: String = "MedicinalProductContraindication"
  override val searchParams: Map[String, MedicinalProductContraindication => Seq[Any]] = Map(
    "subject" -> (obj => obj.subject.toSeq)
  )
  def unapply(
      o: MedicinalProductContraindication): Option[(Option[String], Option[Meta], Option[Narrative], LitSeq[Reference], Option[CodeableConcept], Option[LANGUAGES], LitSeq[Resource], LitSeq[Extension], LitSeq[Choice["Population"]], LitSeq[CodeableConcept], Option[UriStr], Option[CodeableConcept], LitSeq[Extension], LitSeq[Reference], LitSeq[MedicinalProductContraindication.OtherTherapy])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.subject,
        o.disease,
        o.language,
        o.contained,
        o.extension,
        o.population,
        o.comorbidity,
        o.implicitRules,
        o.diseaseStatus,
        o.modifierExtension,
        o.therapeuticIndication,
        o.otherTherapy))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[MedicinalProductContraindication] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new MedicinalProductContraindication(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("subject", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("disease", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Choice["Population"]]]("population", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("comorbidity", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("diseaseStatus", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("therapeuticIndication", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[MedicinalProductContraindication.OtherTherapy]]("otherTherapy", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** The clinical particulars - indications, contraindications etc. of a medicinal product, including for regulatory purposes.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields subject, disease, population, comorbidity, diseaseStatus, therapeuticIndication, otherTherapy.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param subject - The medication for which this is an indication.
  * @param disease - The disease, symptom or procedure for the contraindication.
  * @param language - The base language in which the resource is written.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param population - The population group to which this applies.
  * @param comorbidity - A comorbidity (concurrent condition) or coinfection.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param diseaseStatus - The status of the disease or symptom for the contraindication.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param therapeuticIndication - Information about the use of the medicinal product in relation to other therapies as part of the indication.
  * @param otherTherapy - Information about the use of the medicinal product in relation to other therapies described as part of the indication.
  */
@POJOBoilerplate
class MedicinalProductContraindication(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val subject: LitSeq[Reference] = LitSeq.empty,
    val disease: Option[CodeableConcept] = None,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val population: LitSeq[Choice["Population"]] = LitSeq.empty,
    val comorbidity: LitSeq[CodeableConcept] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    val diseaseStatus: Option[CodeableConcept] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val therapeuticIndication: LitSeq[Reference] = LitSeq.empty,
    val otherTherapy: LitSeq[MedicinalProductContraindication.OtherTherapy] = LitSeq.empty,
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
  override val thisTypeName: String = "MedicinalProductContraindication"
}
