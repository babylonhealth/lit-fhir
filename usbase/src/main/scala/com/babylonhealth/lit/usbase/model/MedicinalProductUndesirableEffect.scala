package com.babylonhealth.lit.usbase.model

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
import com.babylonhealth.lit.usbase.UnionAliases._
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object MedicinalProductUndesirableEffect extends CompanionFor[MedicinalProductUndesirableEffect] {
  implicit def summonObjectAndCompanionMedicinalProductUndesirableEffect_1232914593(
      o: MedicinalProductUndesirableEffect): ObjectAndCompanion[MedicinalProductUndesirableEffect, MedicinalProductUndesirableEffect.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = MedicinalProductUndesirableEffect
  override type ParentType   = MedicinalProductUndesirableEffect
  override val baseType: CompanionFor[ResourceType] = MedicinalProductUndesirableEffect
  override val parentType: CompanionFor[ParentType] = MedicinalProductUndesirableEffect
  override val profileUrl: Option[String] = Some("http://hl7.org/fhir/StructureDefinition/MedicinalProductUndesirableEffect")
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      subject: LitSeq[Reference] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      population: LitSeq[Choice["Population"]] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      classification: Option[CodeableConcept] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      frequencyOfOccurrence: Option[CodeableConcept] = None,
      symptomConditionEffect: Option[CodeableConcept] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): MedicinalProductUndesirableEffect = new MedicinalProductUndesirableEffect(
    id,
    meta,
    text,
    subject,
    language,
    contained,
    extension,
    population,
    implicitRules,
    classification,
    modifierExtension,
    frequencyOfOccurrence,
    symptomConditionEffect,
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
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val population: FHIRComponentFieldMeta[LitSeq[Choice["Population"]]] =
    FHIRComponentFieldMeta("population", lTagOf[LitSeq[Choice["Population"]]], false, lTagOf[Choice["Population"]])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val classification: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("classification", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val frequencyOfOccurrence: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("frequencyOfOccurrence", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val symptomConditionEffect: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("symptomConditionEffect", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    subject,
    language,
    contained,
    extension,
    population,
    implicitRules,
    classification,
    modifierExtension,
    frequencyOfOccurrence,
    symptomConditionEffect
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: MedicinalProductUndesirableEffect): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[LitSeq[Reference]](subject, t.subject),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[Choice["Population"]]](population, t.population),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[CodeableConcept]](classification, t.classification),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Option[CodeableConcept]](frequencyOfOccurrence, t.frequencyOfOccurrence),
    FHIRComponentField[Option[CodeableConcept]](symptomConditionEffect, t.symptomConditionEffect)
  )
  def extractId(t: MedicinalProductUndesirableEffect): Option[String]                              = t.id
  def extractMeta(t: MedicinalProductUndesirableEffect): Option[Meta]                              = t.meta
  def extractText(t: MedicinalProductUndesirableEffect): Option[Narrative]                         = t.text
  def extractSubject(t: MedicinalProductUndesirableEffect): LitSeq[Reference]                      = t.subject
  def extractLanguage(t: MedicinalProductUndesirableEffect): Option[LANGUAGES]                     = t.language
  def extractContained(t: MedicinalProductUndesirableEffect): LitSeq[Resource]                     = t.contained
  def extractExtension(t: MedicinalProductUndesirableEffect): LitSeq[Extension]                    = t.extension
  def extractPopulation(t: MedicinalProductUndesirableEffect): LitSeq[Choice["Population"]]        = t.population
  def extractImplicitRules(t: MedicinalProductUndesirableEffect): Option[UriStr]                   = t.implicitRules
  def extractClassification(t: MedicinalProductUndesirableEffect): Option[CodeableConcept]         = t.classification
  def extractModifierExtension(t: MedicinalProductUndesirableEffect): LitSeq[Extension]            = t.modifierExtension
  def extractFrequencyOfOccurrence(t: MedicinalProductUndesirableEffect): Option[CodeableConcept]  = t.frequencyOfOccurrence
  def extractSymptomConditionEffect(t: MedicinalProductUndesirableEffect): Option[CodeableConcept] = t.symptomConditionEffect
  override val thisName: String = "MedicinalProductUndesirableEffect"
  def unapply(
      o: MedicinalProductUndesirableEffect): Option[(Option[String], Option[Meta], Option[Narrative], LitSeq[Reference], Option[LANGUAGES], LitSeq[Resource], LitSeq[Extension], LitSeq[Choice["Population"]], Option[UriStr], Option[CodeableConcept], LitSeq[Extension], Option[CodeableConcept], Option[CodeableConcept])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.subject,
        o.language,
        o.contained,
        o.extension,
        o.population,
        o.implicitRules,
        o.classification,
        o.modifierExtension,
        o.frequencyOfOccurrence,
        o.symptomConditionEffect))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[MedicinalProductUndesirableEffect] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new MedicinalProductUndesirableEffect(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("subject", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Choice["Population"]]]("population", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("classification", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("frequencyOfOccurrence", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("symptomConditionEffect", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** Describe the undesirable effects of the medicinal product.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields subject, population, classification, frequencyOfOccurrence, symptomConditionEffect.
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
  * @param subject
  *   - The medication for which this is an indication.
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
  * @param population
  *   - The population group to which this applies.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param classification
  *   - Classification of the effect.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *   the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually
  *   modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict
  *   set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param frequencyOfOccurrence
  *   - The frequency of occurrence of the effect.
  * @param symptomConditionEffect
  *   - The symptom, condition or undesirable effect.
  */
@POJOBoilerplate
class MedicinalProductUndesirableEffect(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val subject: LitSeq[Reference] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val population: LitSeq[Choice["Population"]] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    val classification: Option[CodeableConcept] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val frequencyOfOccurrence: Option[CodeableConcept] = None,
    val symptomConditionEffect: Option[CodeableConcept] = None,
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
  override val thisTypeName: String = "MedicinalProductUndesirableEffect"
}
