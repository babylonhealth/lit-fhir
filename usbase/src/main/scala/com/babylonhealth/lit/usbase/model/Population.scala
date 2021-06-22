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

import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Population extends CompanionFor[Population] {
  implicit def summonObjectAndCompanionPopulation_11499230(o: Population): ObjectAndCompanion[Population, Population.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Population
  override type ParentType   = Population
  override val baseType: CompanionFor[ResourceType] = Population
  override val parentType: CompanionFor[ParentType] = Population
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Population")
  type AgeChoice = Choice[Union_1946587936]
  def apply(
      id: Option[String] = None,
      race: Option[CodeableConcept] = None,
      age: Option[Population.AgeChoice] = None,
      gender: Option[CodeableConcept] = None,
      extension: LitSeq[Extension] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      physiologicalCondition: Option[CodeableConcept] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Population = new Population(
    id,
    race,
    age,
    gender,
    extension,
    modifierExtension,
    physiologicalCondition,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val race: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("race", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val age: FHIRComponentFieldMeta[Option[Population.AgeChoice]] =
    FHIRComponentFieldMeta("age", lTagOf[Option[Population.AgeChoice]], true, lTagOf[Union_1946587936])
  val gender: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("gender", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val physiologicalCondition: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("physiologicalCondition", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
    Seq(id, race, age, gender, extension, modifierExtension, physiologicalCondition)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Population): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[CodeableConcept]](race, t.race),
    FHIRComponentField[Option[Population.AgeChoice]](age, t.age),
    FHIRComponentField[Option[CodeableConcept]](gender, t.gender),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Option[CodeableConcept]](physiologicalCondition, t.physiologicalCondition)
  )
  def extractId(t: Population): Option[String]                              = t.id
  def extractRace(t: Population): Option[CodeableConcept]                   = t.race
  def extractAge(t: Population): Option[Population.AgeChoice]               = t.age
  def extractGender(t: Population): Option[CodeableConcept]                 = t.gender
  def extractExtension(t: Population): LitSeq[Extension]                    = t.extension
  def extractModifierExtension(t: Population): LitSeq[Extension]            = t.modifierExtension
  def extractPhysiologicalCondition(t: Population): Option[CodeableConcept] = t.physiologicalCondition
  override val thisName: String                                             = "Population"
  def unapply(
      o: Population): Option[(Option[String], Option[CodeableConcept], Option[Population.AgeChoice], Option[CodeableConcept], LitSeq[Extension], LitSeq[Extension], Option[CodeableConcept])] =
    Some((o.id, o.race, o.age, o.gender, o.extension, o.modifierExtension, o.physiologicalCondition))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Population] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Population(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("race", Some(None)),
          cursor.decodeOptRef[Union_1946587936]("age"),
          cursor.decodeAs[Option[CodeableConcept]]("gender", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("physiologicalCondition", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for Population Type: A populatioof people with some set of grouping criteria.
  *
  * Subclass of [[core.model.BackboneElement]] (Base StructureDefinition for BackboneElement Type: Base definition for all
  * elements that are defined inside a resource - but not those in a data type.)
  *
  * @constructor
  *   Introduces the fields race, age, gender, physiologicalCondition.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *   spaces.
  * @param race
  *   - Race of the specific population.
  * @param age
  *   - The age of the specific population.
  * @param gender
  *   - The gender of the specific population.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the element. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the element and that modifies
  *   the understanding of the element in which it is contained and/or the understanding of the containing element's descendants.
  *   Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *   strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param physiologicalCondition
  *   - The existing physiological conditions of the specific population to which this applies.
  */
@POJOBoilerplate
class Population(
    override val id: Option[String] = None,
    val race: Option[CodeableConcept] = None,
    val age: Option[Population.AgeChoice] = None,
    val gender: Option[CodeableConcept] = None,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val physiologicalCondition: Option[CodeableConcept] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends BackboneElement(
      id = id,
      extension = extension,
      modifierExtension = modifierExtension,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Population"
}
