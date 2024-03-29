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
import com.babylonhealth.lit.hl7.MEDICATION_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, ukcore }
import com.babylonhealth.lit.macros.POJOBoilerplate

object UKCore_Medication extends CompanionFor[UKCore_Medication] {
  implicit def summonObjectAndCompanionUKCore_Medication_697557570(
      o: UKCore_Medication): ObjectAndCompanion[UKCore_Medication, UKCore_Medication.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Medication
  override type ParentType   = Medication
  override val baseType: CompanionFor[ResourceType] = Medication
  override val parentType: CompanionFor[ParentType] = Medication
  override val profileUrl: Option[String]           = Some("https://fhir.hl7.org.uk/StructureDefinition/UKCore-Medication")
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-Medication"))),
      text: Option[Narrative] = None,
      code: CodeableConcept,
      form: Option[CodeableConcept] = None,
      status: Option[MEDICATION_STATUS] = None,
      amount: Option[Ratio] = None,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      batch: Option[Medication.Batch] = None,
      ingredient: LitSeq[Medication.Ingredient] = LitSeq.empty,
      manufacturer: Option[Reference] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): UKCore_Medication = new UKCore_Medication(
    id,
    meta,
    text,
    code,
    form,
    status,
    amount,
    language,
    contained,
    extension,
    implicitRules,
    modifierExtension,
    identifier,
    batch,
    ingredient,
    manufacturer,
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
  val form: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("form", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val status: FHIRComponentFieldMeta[Option[MEDICATION_STATUS]] =
    FHIRComponentFieldMeta("status", lTagOf[Option[MEDICATION_STATUS]], false, lTagOf[MEDICATION_STATUS])
  val amount: FHIRComponentFieldMeta[Option[Ratio]] =
    FHIRComponentFieldMeta("amount", lTagOf[Option[Ratio]], false, lTagOf[Ratio])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val batch: FHIRComponentFieldMeta[Option[Medication.Batch]] =
    FHIRComponentFieldMeta("batch", lTagOf[Option[Medication.Batch]], false, lTagOf[Medication.Batch])
  val ingredient: FHIRComponentFieldMeta[LitSeq[Medication.Ingredient]] =
    FHIRComponentFieldMeta("ingredient", lTagOf[LitSeq[Medication.Ingredient]], false, lTagOf[Medication.Ingredient])
  val manufacturer: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("manufacturer", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    code,
    form,
    status,
    amount,
    language,
    contained,
    extension,
    implicitRules,
    modifierExtension,
    identifier,
    batch,
    ingredient,
    manufacturer)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Meta]](meta, t.meta),
      FHIRComponentField[Option[Narrative]](text, t.text),
      FHIRComponentField[CodeableConcept](code, t.code.get),
      FHIRComponentField[Option[CodeableConcept]](form, t.form),
      FHIRComponentField[Option[MEDICATION_STATUS]](status, t.status),
      FHIRComponentField[Option[Ratio]](amount, t.amount),
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[LitSeq[Resource]](contained, t.contained),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
      FHIRComponentField[Option[Medication.Batch]](batch, t.batch),
      FHIRComponentField[LitSeq[Medication.Ingredient]](ingredient, t.ingredient),
      FHIRComponentField[Option[Reference]](manufacturer, t.manufacturer)
    ))
  override def fields(t: UKCore_Medication): Seq[FHIRComponentField[_]]      = fieldsFromParent(t).get
  def extractId(t: UKCore_Medication): Option[String]                        = t.id
  def extractMeta(t: UKCore_Medication): Option[Meta]                        = t.meta
  def extractText(t: UKCore_Medication): Option[Narrative]                   = t.text
  def extractCode(t: UKCore_Medication): CodeableConcept                     = t.code.get
  def extractForm(t: UKCore_Medication): Option[CodeableConcept]             = t.form
  def extractStatus(t: UKCore_Medication): Option[MEDICATION_STATUS]         = t.status
  def extractAmount(t: UKCore_Medication): Option[Ratio]                     = t.amount
  def extractLanguage(t: UKCore_Medication): Option[LANGUAGES]               = t.language
  def extractContained(t: UKCore_Medication): LitSeq[Resource]               = t.contained
  def extractExtension(t: UKCore_Medication): LitSeq[Extension]              = t.extension
  def extractImplicitRules(t: UKCore_Medication): Option[UriStr]             = t.implicitRules
  def extractModifierExtension(t: UKCore_Medication): LitSeq[Extension]      = t.modifierExtension
  def extractIdentifier(t: UKCore_Medication): LitSeq[Identifier]            = t.identifier
  def extractBatch(t: UKCore_Medication): Option[Medication.Batch]           = t.batch
  def extractIngredient(t: UKCore_Medication): LitSeq[Medication.Ingredient] = t.ingredient
  def extractManufacturer(t: UKCore_Medication): Option[Reference]           = t.manufacturer
  override val thisName: String                                              = "UKCore_Medication"
  override val searchParams: Map[String, UKCore_Medication => Seq[Any]]      = Medication.searchParams
  def unapply(
      o: UKCore_Medication): Option[(Option[String], Option[Meta], Option[Narrative], CodeableConcept, Option[CodeableConcept], Option[MEDICATION_STATUS], Option[Ratio], Option[LANGUAGES], LitSeq[Resource], LitSeq[Extension], Option[UriStr], LitSeq[Extension], LitSeq[Identifier], Option[Medication.Batch], LitSeq[Medication.Ingredient], Option[Reference])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.code.get,
        o.form,
        o.status,
        o.amount,
        o.language,
        o.contained,
        o.extension,
        o.implicitRules,
        o.modifierExtension,
        o.identifier,
        o.batch,
        o.ingredient,
        o.manufacturer))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[UKCore_Medication] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new UKCore_Medication(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[CodeableConcept]("code", None),
          cursor.decodeAs[Option[CodeableConcept]]("form", Some(None)),
          cursor.decodeAs[Option[MEDICATION_STATUS]]("status", Some(None)),
          cursor.decodeAs[Option[Ratio]]("amount", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Medication.Batch]]("batch", Some(None)),
          cursor.decodeAs[LitSeq[Medication.Ingredient]]("ingredient", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("manufacturer", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** Defines the UK Core constraints and extensions on the Medication resource for the minimal set of data to query and retrieve
  * medication information.
  *
  * Subclass of [[hl7.model.Medication]] (This resource is primarily used for the identification and definition of a medication
  * for the purposes of prescribing, dispensing, and administering a medication as well as for making statements about medication
  * use.)
  *
  * @constructor
  *   Inherits all params from parent. Requires the following fields which were optional in the parent: code.
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
  * @param code
  *   - A code (or set of codes) that specify this medication, or a textual description if no code is available. Usage note: This
  *     could be a standard medication code such as a code from RxNorm, SNOMED CT, IDMP etc. It could also be a national or local
  *     formulary code, optionally with translations to other code systems.
  * @param form
  *   - Describes the form of the item. Powder; tablets; capsule.
  * @param status
  *   - A code to indicate if the medication is in active use.
  * @param amount
  *   - Specific amount of the drug in the packaged product. For example, when specifying a product that has the same strength
  *     (For example, Insulin glargine 100 unit per mL solution for injection), this attribute provides additional clarification
  *     of the package amount (For example, 3 mL, 10mL, etc.).
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
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *     processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *     other profiles etc.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *     the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *     Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *     strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *     extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *     processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of
  *     any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param identifier
  *   - Business identifier for this medication.
  * @param batch
  *   - Information that only applies to packages (not products).
  * @param ingredient
  *   - Identifies a particular constituent of interest in the product.
  * @param manufacturer
  *   - Describes the details of the manufacturer of the medication product. This is not intended to represent the distributor of
  *     a medication product.
  */
@POJOBoilerplate
class UKCore_Medication(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-Medication"))),
    override val text: Option[Narrative] = None,
    code: CodeableConcept,
    override val form: Option[CodeableConcept] = None,
    override val status: Option[MEDICATION_STATUS] = None,
    override val amount: Option[Ratio] = None,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val batch: Option[Medication.Batch] = None,
    override val ingredient: LitSeq[Medication.Ingredient] = LitSeq.empty,
    override val manufacturer: Option[Reference] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Medication(
      id = id,
      meta = meta,
      text = text,
      code = Some(code),
      form = form,
      status = status,
      amount = amount,
      language = language,
      contained = contained,
      extension = extension,
      identifier = identifier,
      manufacturer = manufacturer,
      implicitRules = implicitRules,
      modifierExtension = modifierExtension,
      batch = batch,
      ingredient = ingredient,
      primitiveAttributes = primitiveAttributes
    ) {
  override val thisTypeName: String = "Medication"
}
