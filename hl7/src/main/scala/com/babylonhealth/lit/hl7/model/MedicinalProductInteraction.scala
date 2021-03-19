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

object MedicinalProductInteraction extends CompanionFor[MedicinalProductInteraction] {
  override type ResourceType = MedicinalProductInteraction
  override val baseType: CompanionFor[ResourceType] = MedicinalProductInteraction
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/MedicinalProductInteraction")
  object Interactant extends CompanionFor[Interactant] {
    override type ResourceType = Interactant
    type ItemChoice            = Choice[Union01025009075]
    def apply(
        id: Option[String] = None,
        item: Interactant.ItemChoice,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Interactant = new Interactant(
      id,
      item,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Interactant): Option[(Option[String], Interactant.ItemChoice, LitSeq[Extension], LitSeq[Extension])] = Some(
      (o.id, o.item, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val item: FHIRComponentFieldMeta[Interactant.ItemChoice] =
      FHIRComponentFieldMeta("item", lTagOf[Interactant.ItemChoice], true, lTagOf[Union01025009075])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, item, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Interactant): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Interactant.ItemChoice](item, t.item),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Interactant] = this
    val thisName: String                    = "Interactant"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Interactant] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Interactant(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeRef[Union01025009075]("item"),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Interactant(
      override val id: Option[String] = None,
      val item: Interactant.ItemChoice,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      `type`: Option[CodeableConcept] = None,
      effect: Option[CodeableConcept] = None,
      subject: LitSeq[Reference] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      incidence: Option[CodeableConcept] = None,
      management: Option[CodeableConcept] = None,
      description: Option[String] = None,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      interactant: LitSeq[MedicinalProductInteraction.Interactant] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): MedicinalProductInteraction = new MedicinalProductInteraction(
    id,
    meta,
    text,
    `type`,
    effect,
    subject,
    language,
    contained,
    extension,
    incidence,
    management,
    description,
    implicitRules,
    modifierExtension,
    interactant,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val effect: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("effect", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val subject: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("subject", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val incidence: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("incidence", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val management: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("management", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val description: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val interactant: FHIRComponentFieldMeta[LitSeq[MedicinalProductInteraction.Interactant]] =
    FHIRComponentFieldMeta(
      "interactant",
      lTagOf[LitSeq[MedicinalProductInteraction.Interactant]],
      false,
      lTagOf[MedicinalProductInteraction.Interactant])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    `type`,
    effect,
    subject,
    language,
    contained,
    extension,
    incidence,
    management,
    description,
    implicitRules,
    modifierExtension,
    interactant)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: MedicinalProductInteraction): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
    FHIRComponentField[Option[CodeableConcept]](effect, t.effect),
    FHIRComponentField[LitSeq[Reference]](subject, t.subject),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[CodeableConcept]](incidence, t.incidence),
    FHIRComponentField[Option[CodeableConcept]](management, t.management),
    FHIRComponentField[Option[String]](description, t.description),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[MedicinalProductInteraction.Interactant]](interactant, t.interactant)
  )
  def extractId(t: MedicinalProductInteraction): Option[String]                   = t.id
  def extractMeta(t: MedicinalProductInteraction): Option[Meta]                   = t.meta
  def extractText(t: MedicinalProductInteraction): Option[Narrative]              = t.text
  def extractType(t: MedicinalProductInteraction): Option[CodeableConcept]        = t.`type`
  def extractEffect(t: MedicinalProductInteraction): Option[CodeableConcept]      = t.effect
  def extractSubject(t: MedicinalProductInteraction): LitSeq[Reference]           = t.subject
  def extractLanguage(t: MedicinalProductInteraction): Option[LANGUAGES]          = t.language
  def extractContained(t: MedicinalProductInteraction): LitSeq[Resource]          = t.contained
  def extractExtension(t: MedicinalProductInteraction): LitSeq[Extension]         = t.extension
  def extractIncidence(t: MedicinalProductInteraction): Option[CodeableConcept]   = t.incidence
  def extractManagement(t: MedicinalProductInteraction): Option[CodeableConcept]  = t.management
  def extractDescription(t: MedicinalProductInteraction): Option[String]          = t.description
  def extractImplicitRules(t: MedicinalProductInteraction): Option[UriStr]        = t.implicitRules
  def extractModifierExtension(t: MedicinalProductInteraction): LitSeq[Extension] = t.modifierExtension
  def extractInteractant(t: MedicinalProductInteraction): LitSeq[MedicinalProductInteraction.Interactant] =
    t.interactant
  override val thisName: String = "MedicinalProductInteraction"
  override val searchParams: Map[String, MedicinalProductInteraction => Seq[Any]] = Map(
    "subject" -> (obj => obj.subject.toSeq)
  )
  def unapply(
      o: MedicinalProductInteraction): Option[(Option[String], Option[Meta], Option[Narrative], Option[CodeableConcept], Option[CodeableConcept], LitSeq[Reference], Option[LANGUAGES], LitSeq[Resource], LitSeq[Extension], Option[CodeableConcept], Option[CodeableConcept], Option[String], Option[UriStr], LitSeq[Extension], LitSeq[MedicinalProductInteraction.Interactant])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.`type`,
        o.effect,
        o.subject,
        o.language,
        o.contained,
        o.extension,
        o.incidence,
        o.management,
        o.description,
        o.implicitRules,
        o.modifierExtension,
        o.interactant))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[MedicinalProductInteraction] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new MedicinalProductInteraction(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("effect", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("subject", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("incidence", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("management", Some(None)),
          cursor.decodeAs[Option[String]]("description", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[MedicinalProductInteraction.Interactant]]("interactant", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** The interactions of the medicinal product with other medicinal products, or other forms of interactions.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields `type`, effect, subject, incidence, management, description, interactant.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param `type` - The type of the interaction e.g. drug-drug interaction, drug-food interaction, drug-lab test interaction.
  * @param effect - The effect of the interaction, for example "reduced gastric absorption of primary medication".
  * @param subject - The medication for which this is a described interaction.
  * @param language - The base language in which the resource is written.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param incidence - The incidence of the interaction, e.g. theoretical, observed.
  * @param management - Actions for managing the interaction.
  * @param description - The interaction described.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param interactant - The specific medication, food or laboratory test that interacts.
  */
@POJOBoilerplate
class MedicinalProductInteraction(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val `type`: Option[CodeableConcept] = None,
    val effect: Option[CodeableConcept] = None,
    val subject: LitSeq[Reference] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val incidence: Option[CodeableConcept] = None,
    val management: Option[CodeableConcept] = None,
    val description: Option[String] = None,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val interactant: LitSeq[MedicinalProductInteraction.Interactant] = LitSeq.empty,
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
  override val thisTypeName: String = "MedicinalProductInteraction"
}
