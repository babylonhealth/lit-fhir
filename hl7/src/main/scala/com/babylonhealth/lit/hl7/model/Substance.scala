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
import com.babylonhealth.lit.hl7.SUBSTANCE_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Substance extends CompanionFor[Substance] {
  override val baseType: CompanionFor[Substance] = Substance
  object Ingredient extends CompanionFor[Ingredient] {
    type SubstanceChoice = Choice[Union01025009075]
    def apply(
        id: Option[String] = None,
        quantity: Option[Ratio] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        substance: Ingredient.SubstanceChoice,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Ingredient = new Ingredient(
      id,
      quantity,
      extension,
      substance,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Ingredient): Option[(Option[String], Option[Ratio], LitSeq[Extension], Ingredient.SubstanceChoice, LitSeq[Extension])] =
      Some((o.id, o.quantity, o.extension, o.substance, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val quantity: FHIRComponentFieldMeta[Option[Ratio]] =
      FHIRComponentFieldMeta("quantity", lTagOf[Option[Ratio]], false, lTagOf[Ratio])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val substance: FHIRComponentFieldMeta[Ingredient.SubstanceChoice] =
      FHIRComponentFieldMeta("substance", lTagOf[Ingredient.SubstanceChoice], true, lTagOf[Union01025009075])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, quantity, extension, substance, modifierExtension)
    override def fields(t: Ingredient): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Ratio]](quantity, t.quantity),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Ingredient.SubstanceChoice](substance, t.substance),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Ingredient] = this
    val thisName: String                   = "Ingredient"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Ingredient] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Ingredient(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[Ratio]]("quantity", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeRef[Union01025009075]("substance"),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Ingredient(
      override val id: Option[String] = None,
      val quantity: Option[Ratio] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val substance: Ingredient.SubstanceChoice,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Instance extends CompanionFor[Instance] {
    def apply(
        id: Option[String] = None,
        expiry: Option[FHIRDateTime] = None,
        quantity: Option[Quantity] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        identifier: Option[Identifier] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Instance = new Instance(
      id,
      expiry,
      quantity,
      extension,
      identifier,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Instance): Option[(Option[String], Option[FHIRDateTime], Option[Quantity], LitSeq[Extension], Option[Identifier], LitSeq[Extension])] =
      Some((o.id, o.expiry, o.quantity, o.extension, o.identifier, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val expiry: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
      FHIRComponentFieldMeta("expiry", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
    val quantity: FHIRComponentFieldMeta[Option[Quantity]] =
      FHIRComponentFieldMeta("quantity", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val identifier: FHIRComponentFieldMeta[Option[Identifier]] =
      FHIRComponentFieldMeta("identifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, expiry, quantity, extension, identifier, modifierExtension)
    override def fields(t: Instance): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[FHIRDateTime]](expiry, t.expiry),
      FHIRComponentField[Option[Quantity]](quantity, t.quantity),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Identifier]](identifier, t.identifier),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Instance] = this
    val thisName: String                 = "Instance"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Instance] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Instance(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[FHIRDateTime]]("expiry", Some(None)),
            cursor.decodeAs[Option[Quantity]]("quantity", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Identifier]]("identifier", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Instance(
      override val id: Option[String] = None,
      val expiry: Option[FHIRDateTime] = None,
      val quantity: Option[Quantity] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val identifier: Option[Identifier] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      code: CodeableConcept,
      status: Option[SUBSTANCE_STATUS] = None,
      language: Option[LANGUAGES] = None,
      category: LitSeq[CodeableConcept] = LitSeq.empty,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      description: Option[String] = None,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      instance: LitSeq[Substance.Instance] = LitSeq.empty,
      ingredient: LitSeq[Substance.Ingredient] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Substance = new Substance(
    id,
    meta,
    text,
    code,
    status,
    language,
    category,
    contained,
    extension,
    identifier,
    description,
    implicitRules,
    modifierExtension,
    instance,
    ingredient,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val code: FHIRComponentFieldMeta[CodeableConcept] =
    FHIRComponentFieldMeta("code", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
  val status: FHIRComponentFieldMeta[Option[SUBSTANCE_STATUS]] =
    FHIRComponentFieldMeta("status", lTagOf[Option[SUBSTANCE_STATUS]], false, lTagOf[SUBSTANCE_STATUS])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val category: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("category", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val description: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val instance: FHIRComponentFieldMeta[LitSeq[Substance.Instance]] =
    FHIRComponentFieldMeta("instance", lTagOf[LitSeq[Substance.Instance]], false, lTagOf[Substance.Instance])
  val ingredient: FHIRComponentFieldMeta[LitSeq[Substance.Ingredient]] =
    FHIRComponentFieldMeta("ingredient", lTagOf[LitSeq[Substance.Ingredient]], false, lTagOf[Substance.Ingredient])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    code,
    status,
    language,
    category,
    contained,
    extension,
    identifier,
    description,
    implicitRules,
    modifierExtension,
    instance,
    ingredient)
  override def fields(t: Substance): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[CodeableConcept](code, t.code),
    FHIRComponentField[Option[SUBSTANCE_STATUS]](status, t.status),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[CodeableConcept]](category, t.category),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[String]](description, t.description),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[Substance.Instance]](instance, t.instance),
    FHIRComponentField[LitSeq[Substance.Ingredient]](ingredient, t.ingredient)
  )
  def extractId(t: Substance): Option[String]                       = t.id
  def extractMeta(t: Substance): Option[Meta]                       = t.meta
  def extractText(t: Substance): Option[Narrative]                  = t.text
  def extractCode(t: Substance): CodeableConcept                    = t.code
  def extractStatus(t: Substance): Option[SUBSTANCE_STATUS]         = t.status
  def extractLanguage(t: Substance): Option[LANGUAGES]              = t.language
  def extractCategory(t: Substance): LitSeq[CodeableConcept]        = t.category
  def extractContained(t: Substance): LitSeq[Resource]              = t.contained
  def extractExtension(t: Substance): LitSeq[Extension]             = t.extension
  def extractIdentifier(t: Substance): LitSeq[Identifier]           = t.identifier
  def extractDescription(t: Substance): Option[String]              = t.description
  def extractImplicitRules(t: Substance): Option[UriStr]            = t.implicitRules
  def extractModifierExtension(t: Substance): LitSeq[Extension]     = t.modifierExtension
  def extractInstance(t: Substance): LitSeq[Substance.Instance]     = t.instance
  def extractIngredient(t: Substance): LitSeq[Substance.Ingredient] = t.ingredient
  override val thisName: String                                     = "Substance"
  override val searchParams: Map[String, Substance => Seq[Any]] = Map(
    "quantity"             -> (obj => obj.instance.flatMap(_.quantity).toSeq),
    "identifier"           -> (obj => obj.identifier.toSeq),
    "container-identifier" -> (obj => obj.instance.flatMap(_.identifier).toSeq),
    "code" -> (obj =>
      Seq(obj.code) ++
        obj.ingredient.map(_.substance).flatMap(_.as[CodeableConcept]).toSeq),
    "substance-reference" -> (obj => obj.ingredient.map(_.substance).flatMap(_.as[Reference]).toSeq),
    "status"              -> (obj => obj.status.toSeq),
    "category"            -> (obj => obj.category.toSeq),
    "expiry"              -> (obj => obj.instance.flatMap(_.expiry).toSeq)
  )
  def unapply(
      o: Substance): Option[(Option[String], Option[Meta], Option[Narrative], CodeableConcept, Option[SUBSTANCE_STATUS], Option[LANGUAGES], LitSeq[CodeableConcept], LitSeq[Resource], LitSeq[Extension], LitSeq[Identifier], Option[String], Option[UriStr], LitSeq[Extension], LitSeq[Substance.Instance], LitSeq[Substance.Ingredient])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.code,
        o.status,
        o.language,
        o.category,
        o.contained,
        o.extension,
        o.identifier,
        o.description,
        o.implicitRules,
        o.modifierExtension,
        o.instance,
        o.ingredient))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Substance] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Substance(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[CodeableConcept]("code", None),
          cursor.decodeAs[Option[SUBSTANCE_STATUS]]("status", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("category", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("description", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Substance.Instance]]("instance", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Substance.Ingredient]]("ingredient", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** A homogeneous material with a definite composition.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields code, status, category, identifier, description, instance, ingredient.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param code - A code (or set of codes) that identify this substance.
  * @param status - A code to indicate if the substance is actively used.
  * @param language - The base language in which the resource is written.
  * @param category - A code that classifies the general type of substance.  This is used  for searching, sorting and display purposes.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param identifier - Unique identifier for the substance.
  * @param description - A description of the substance - its appearance, handling requirements, and other usage notes.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param instance - Substance may be used to describe a kind of substance, or a specific package/container of the substance: an instance.
  * @param ingredient - A substance can be composed of other substances.
  */
@POJOBoilerplate
class Substance(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val code: CodeableConcept,
    val status: Option[SUBSTANCE_STATUS] = None,
    override val language: Option[LANGUAGES] = None,
    val category: LitSeq[CodeableConcept] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val description: Option[String] = None,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val instance: LitSeq[Substance.Instance] = LitSeq.empty,
    val ingredient: LitSeq[Substance.Ingredient] = LitSeq.empty,
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
  override val thisTypeName: String = "Substance"
}
