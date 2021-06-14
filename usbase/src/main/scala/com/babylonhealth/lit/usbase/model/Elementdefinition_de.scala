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

object Elementdefinition_de extends CompanionFor[Elementdefinition_de] {
  implicit def summonObjectAndCompanionElementdefinition_de2079635633(
      o: Elementdefinition_de): ObjectAndCompanion[Elementdefinition_de, Elementdefinition_de.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = ElementDefinition
  override type ParentType   = ElementDefinition
  override val baseType: CompanionFor[ResourceType] = ElementDefinition
  override val parentType: CompanionFor[ParentType] = ElementDefinition
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/elementdefinition-de")
  type MinValueChoice     = Choice[Union_0637176084]
  type MaxValueChoice     = Choice[Union_0637176084]
  type DefaultValueChoice = Choice[Union_1349125893]
  def apply(
      id: Option[String] = None,
      min: Option[UnsignedInt] = None,
      max: Option[String] = None,
      path: String,
      code: LitSeq[Coding] = LitSeq.empty,
      label: Option[String] = None,
      alias: LitSeq[String] = LitSeq.empty,
      comment: Option[Markdown] = None,
      extension: LitSeq[Extension] = LitSeq.empty,
      sliceName: Option[String] = None,
      maxLength: Option[Int] = None,
      condition: LitSeq[Id] = LitSeq.empty,
      definition: Option[Markdown] = None,
      minValue: Option[Elementdefinition_de.MinValueChoice] = None,
      maxValue: Option[Elementdefinition_de.MaxValueChoice] = None,
      mustSupport: Option[Boolean] = None,
      requirements: Option[Markdown] = None,
      orderMeaning: Option[String] = None,
      base: Option[ElementDefinition.Base] = None,
      defaultValue: Option[Elementdefinition_de.DefaultValueChoice] = None,
      isModifierReason: Option[String] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      example: LitSeq[ElementDefinition.Example] = LitSeq.empty,
      mapping: LitSeq[ElementDefinition.Mapping] = LitSeq.empty,
      `type`: LitSeq[ElementDefinition.Type] = LitSeq.empty,
      meaningWhenMissing: Option[Markdown] = None,
      sliceIsConstraining: Option[Boolean] = None,
      binding: Option[ElementDefinition.Binding] = None,
      constraint: LitSeq[ElementDefinition.Constraint] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Elementdefinition_de = new Elementdefinition_de(
    id,
    min,
    max,
    path,
    code,
    label,
    alias,
    comment,
    extension,
    sliceName,
    maxLength,
    condition,
    definition,
    minValue,
    maxValue,
    mustSupport,
    requirements,
    orderMeaning,
    base,
    defaultValue,
    isModifierReason,
    modifierExtension,
    example,
    mapping,
    `type`,
    meaningWhenMissing,
    sliceIsConstraining,
    binding,
    constraint,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val min: FHIRComponentFieldMeta[Option[UnsignedInt]] =
    FHIRComponentFieldMeta("min", lTagOf[Option[UnsignedInt]], false, lTagOf[UnsignedInt])
  val max: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("max", lTagOf[Option[String]], false, lTagOf[String])
  val path: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("path", lTagOf[String], false, lTagOf[String])
  val code: FHIRComponentFieldMeta[LitSeq[Coding]] =
    FHIRComponentFieldMeta("code", lTagOf[LitSeq[Coding]], false, lTagOf[Coding])
  val label: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("label", lTagOf[Option[String]], false, lTagOf[String])
  val alias: FHIRComponentFieldMeta[LitSeq[String]] =
    FHIRComponentFieldMeta("alias", lTagOf[LitSeq[String]], false, lTagOf[String])
  val comment: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("comment", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val sliceName: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("sliceName", lTagOf[Option[String]], false, lTagOf[String])
  val maxLength: FHIRComponentFieldMeta[Option[Int]] =
    FHIRComponentFieldMeta("maxLength", lTagOf[Option[Int]], false, lTagOf[Int])
  val condition: FHIRComponentFieldMeta[LitSeq[Id]] =
    FHIRComponentFieldMeta("condition", lTagOf[LitSeq[Id]], false, lTagOf[Id])
  val definition: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("definition", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val minValue: FHIRComponentFieldMeta[Option[Elementdefinition_de.MinValueChoice]] =
    FHIRComponentFieldMeta(
      "minValue",
      lTagOf[Option[Elementdefinition_de.MinValueChoice]],
      true,
      lTagOf[Union_0637176084])
  val maxValue: FHIRComponentFieldMeta[Option[Elementdefinition_de.MaxValueChoice]] =
    FHIRComponentFieldMeta(
      "maxValue",
      lTagOf[Option[Elementdefinition_de.MaxValueChoice]],
      true,
      lTagOf[Union_0637176084])
  val mustSupport: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("mustSupport", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val requirements: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("requirements", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val orderMeaning: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("orderMeaning", lTagOf[Option[String]], false, lTagOf[String])
  val base: FHIRComponentFieldMeta[Option[ElementDefinition.Base]] =
    FHIRComponentFieldMeta("base", lTagOf[Option[ElementDefinition.Base]], false, lTagOf[ElementDefinition.Base])
  val defaultValue: FHIRComponentFieldMeta[Option[Elementdefinition_de.DefaultValueChoice]] =
    FHIRComponentFieldMeta(
      "defaultValue",
      lTagOf[Option[Elementdefinition_de.DefaultValueChoice]],
      true,
      lTagOf[Union_1349125893])
  val isModifierReason: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("isModifierReason", lTagOf[Option[String]], false, lTagOf[String])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val example: FHIRComponentFieldMeta[LitSeq[ElementDefinition.Example]] =
    FHIRComponentFieldMeta(
      "example",
      lTagOf[LitSeq[ElementDefinition.Example]],
      false,
      lTagOf[ElementDefinition.Example])
  val mapping: FHIRComponentFieldMeta[LitSeq[ElementDefinition.Mapping]] =
    FHIRComponentFieldMeta(
      "mapping",
      lTagOf[LitSeq[ElementDefinition.Mapping]],
      false,
      lTagOf[ElementDefinition.Mapping])
  val `type`: FHIRComponentFieldMeta[LitSeq[ElementDefinition.Type]] =
    FHIRComponentFieldMeta("type", lTagOf[LitSeq[ElementDefinition.Type]], false, lTagOf[ElementDefinition.Type])
  val meaningWhenMissing: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("meaningWhenMissing", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val sliceIsConstraining: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("sliceIsConstraining", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val binding: FHIRComponentFieldMeta[Option[ElementDefinition.Binding]] =
    FHIRComponentFieldMeta(
      "binding",
      lTagOf[Option[ElementDefinition.Binding]],
      false,
      lTagOf[ElementDefinition.Binding])
  val constraint: FHIRComponentFieldMeta[LitSeq[ElementDefinition.Constraint]] =
    FHIRComponentFieldMeta(
      "constraint",
      lTagOf[LitSeq[ElementDefinition.Constraint]],
      false,
      lTagOf[ElementDefinition.Constraint])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    min,
    max,
    path,
    code,
    label,
    alias,
    comment,
    extension,
    sliceName,
    maxLength,
    condition,
    definition,
    minValue,
    maxValue,
    mustSupport,
    requirements,
    orderMeaning,
    base,
    defaultValue,
    isModifierReason,
    modifierExtension,
    example,
    mapping,
    `type`,
    meaningWhenMissing,
    sliceIsConstraining,
    binding,
    constraint
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[UnsignedInt]](min, t.min),
      FHIRComponentField[Option[String]](max, t.max),
      FHIRComponentField[String](path, t.path),
      FHIRComponentField[LitSeq[Coding]](code, t.code),
      FHIRComponentField[Option[String]](label, t.label),
      FHIRComponentField[LitSeq[String]](alias, t.alias),
      FHIRComponentField[Option[Markdown]](comment, t.comment),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[String]](sliceName, t.sliceName),
      FHIRComponentField[Option[Int]](maxLength, t.maxLength),
      FHIRComponentField[LitSeq[Id]](condition, t.condition),
      FHIRComponentField[Option[Markdown]](definition, t.definition),
      FHIRComponentField[Option[Elementdefinition_de.MinValueChoice]](minValue, t.minValue),
      FHIRComponentField[Option[Elementdefinition_de.MaxValueChoice]](maxValue, t.maxValue),
      FHIRComponentField[Option[Boolean]](mustSupport, t.mustSupport),
      FHIRComponentField[Option[Markdown]](requirements, t.requirements),
      FHIRComponentField[Option[String]](orderMeaning, t.orderMeaning),
      FHIRComponentField[Option[ElementDefinition.Base]](base, t.base),
      FHIRComponentField[Option[Elementdefinition_de.DefaultValueChoice]](defaultValue, t.defaultValue),
      FHIRComponentField[Option[String]](isModifierReason, t.isModifierReason),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[ElementDefinition.Example]](example, t.example),
      FHIRComponentField[LitSeq[ElementDefinition.Mapping]](mapping, t.mapping),
      FHIRComponentField[LitSeq[ElementDefinition.Type]](`type`, t.`type`),
      FHIRComponentField[Option[Markdown]](meaningWhenMissing, t.meaningWhenMissing),
      FHIRComponentField[Option[Boolean]](sliceIsConstraining, t.sliceIsConstraining),
      FHIRComponentField[Option[ElementDefinition.Binding]](binding, t.binding),
      FHIRComponentField[LitSeq[ElementDefinition.Constraint]](constraint, t.constraint)
    ))
  override def fields(t: Elementdefinition_de): Seq[FHIRComponentField[_]]                          = fieldsFromParent(t).get
  def extractId(t: Elementdefinition_de): Option[String]                                            = t.id
  def extractMin(t: Elementdefinition_de): Option[UnsignedInt]                                      = t.min
  def extractMax(t: Elementdefinition_de): Option[String]                                           = t.max
  def extractPath(t: Elementdefinition_de): String                                                  = t.path
  def extractCode(t: Elementdefinition_de): LitSeq[Coding]                                          = t.code
  def extractLabel(t: Elementdefinition_de): Option[String]                                         = t.label
  def extractAlias(t: Elementdefinition_de): LitSeq[String]                                         = t.alias
  def extractComment(t: Elementdefinition_de): Option[Markdown]                                     = t.comment
  def extractExtension(t: Elementdefinition_de): LitSeq[Extension]                                  = t.extension
  def extractSliceName(t: Elementdefinition_de): Option[String]                                     = t.sliceName
  def extractMaxLength(t: Elementdefinition_de): Option[Int]                                        = t.maxLength
  def extractCondition(t: Elementdefinition_de): LitSeq[Id]                                         = t.condition
  def extractDefinition(t: Elementdefinition_de): Option[Markdown]                                  = t.definition
  def extractMinValue(t: Elementdefinition_de): Option[Elementdefinition_de.MinValueChoice]         = t.minValue
  def extractMaxValue(t: Elementdefinition_de): Option[Elementdefinition_de.MaxValueChoice]         = t.maxValue
  def extractMustSupport(t: Elementdefinition_de): Option[Boolean]                                  = t.mustSupport
  def extractRequirements(t: Elementdefinition_de): Option[Markdown]                                = t.requirements
  def extractOrderMeaning(t: Elementdefinition_de): Option[String]                                  = t.orderMeaning
  def extractBase(t: Elementdefinition_de): Option[ElementDefinition.Base]                          = t.base
  def extractDefaultValue(t: Elementdefinition_de): Option[Elementdefinition_de.DefaultValueChoice] = t.defaultValue
  def extractIsModifierReason(t: Elementdefinition_de): Option[String]                              = t.isModifierReason
  def extractModifierExtension(t: Elementdefinition_de): LitSeq[Extension]                          = t.modifierExtension
  def extractExample(t: Elementdefinition_de): LitSeq[ElementDefinition.Example]                    = t.example
  def extractMapping(t: Elementdefinition_de): LitSeq[ElementDefinition.Mapping]                    = t.mapping
  def extractType(t: Elementdefinition_de): LitSeq[ElementDefinition.Type]                          = t.`type`
  def extractMeaningWhenMissing(t: Elementdefinition_de): Option[Markdown]                          = t.meaningWhenMissing
  def extractSliceIsConstraining(t: Elementdefinition_de): Option[Boolean]                          = t.sliceIsConstraining
  def extractBinding(t: Elementdefinition_de): Option[ElementDefinition.Binding]                    = t.binding
  def extractConstraint(t: Elementdefinition_de): LitSeq[ElementDefinition.Constraint]              = t.constraint
  override val thisName: String                                                                     = "Elementdefinition_de"
  override val searchParams: Map[String, Elementdefinition_de => Seq[Any]]                          = ElementDefinition.searchParams
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Elementdefinition_de] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Elementdefinition_de(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[UnsignedInt]]("min", Some(None)),
          cursor.decodeAs[Option[String]]("max", Some(None)),
          cursor.decodeAs[String]("path", None),
          cursor.decodeAs[LitSeq[Coding]]("code", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("label", Some(None)),
          cursor.decodeAs[LitSeq[String]]("alias", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Markdown]]("comment", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("sliceName", Some(None)),
          cursor.decodeAs[Option[Int]]("maxLength", Some(None)),
          cursor.decodeAs[LitSeq[Id]]("condition", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Markdown]]("definition", Some(None)),
          cursor.decodeOptRef[Union_0637176084]("minValue"),
          cursor.decodeOptRef[Union_0637176084]("maxValue"),
          cursor.decodeAs[Option[Boolean]]("mustSupport", Some(None)),
          cursor.decodeAs[Option[Markdown]]("requirements", Some(None)),
          cursor.decodeAs[Option[String]]("orderMeaning", Some(None)),
          cursor.decodeAs[Option[ElementDefinition.Base]]("base", Some(None)),
          cursor.decodeOptRef[Union_1349125893]("defaultValue"),
          cursor.decodeAs[Option[String]]("isModifierReason", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[ElementDefinition.Example]]("example", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[ElementDefinition.Mapping]]("mapping", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[ElementDefinition.Type]]("type", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Markdown]]("meaningWhenMissing", Some(None)),
          cursor.decodeAs[Option[Boolean]]("sliceIsConstraining", Some(None)),
          cursor.decodeAs[Option[ElementDefinition.Binding]]("binding", Some(None)),
          cursor.decodeAs[LitSeq[ElementDefinition.Constraint]]("constraint", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Identifies how the ElementDefinition data type is used when it appears within a data element
  *
  *  Subclass of [[hl7.model.ElementDefinition]] (Base StructureDefinition for ElementDefinition Type: Captures constraints on each element within the resource, profile, or extension.)
  *
  * @constructor Inherits all params from parent.
  *              Forbids the use of the following fields which were optional in the parent: short, fixed, isSummary, pattern, isModifier, representation, contentReference, slicing.
  * @param id - Unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces.
  * @param min - The minimum number of times this element SHALL appear in the instance.
  * @param max - The maximum number of times this element is permitted to appear in the instance.
  * @param path - The path identifies the element and is expressed as a "."-separated list of ancestor elements, beginning with the name of the resource or extension.
  * @param code - A code that has the same meaning as the element in a particular terminology.
  * @param label - A single preferred label which is the text to display beside the element indicating its meaning or to use to prompt for the element in a user display or form.
  * @param alias - Identifies additional names by which this element might also be known.
  * @param comment - Explanatory notes and implementation guidance about the data element, including notes about how to use the data properly, exceptions to proper use, etc. (Note: The text you are reading is specified in ElementDefinition.comment).
  * @param extension - May be used to represent additional information that is not part of the basic definition of the element. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param sliceName - The name of this element definition slice, when slicing is working. The name must be a token with no dots or spaces. This is a unique name referring to a specific set of constraints applied to this element, used to provide a name to different slices of the same element.
  * @param maxLength - Indicates the maximum length in characters that is permitted to be present in conformant instances and which is expected to be supported by conformant consumers that support the element.
  * @param condition - A reference to an invariant that may make additional statements about the cardinality or value in the instance.
  * @param definition - Provides a complete explanation of the meaning of the data element for human readability.  For the case of elements derived from existing elements (e.g. constraints), the definition SHALL be consistent with the base definition, but convey the meaning of the element in the particular context of use of the resource. (Note: The text you are reading is specified in ElementDefinition.definition).
  * @param minValue - The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
  * @param maxValue - The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity.
  * @param mustSupport - If true, implementations that produce or consume resources SHALL provide "support" for the element in some meaningful way.  If false, the element may be ignored and not supported. If false, whether to populate or use the data element in any way is at the discretion of the implementation.
  * @param requirements - This element is for traceability of why the element was created and why the constraints exist as they do. This may be used to point to source materials or specifications that drove the structure of this element.
  * @param orderMeaning - If present, indicates that the order of the repeating element has meaning and describes what that meaning is.  If absent, it means that the order of the element has no meaning.
  * @param base - Information about the base definition of the element, provided to make it unnecessary for tools to trace the deviation of the element through the derived and related profiles. When the element definition is not the original definition of an element - i.g. either in a constraint on another type, or for elements from a super type in a snap shot - then the information in provided in the element definition may be different to the base definition. On the original definition of the element, it will be same.
  * @param defaultValue - The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false').
  * @param isModifierReason - Explains how that element affects the interpretation of the resource or element that contains it.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the element and that modifies the understanding of the element in which it is contained and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param example - A sample value for this element demonstrating the type of information that would typically be found in the element.
  * @param mapping - Identifies a concept from an external specification that roughly corresponds to this element.
  * @param `type` - The data type or resource that the value of this element is permitted to be.
  * @param meaningWhenMissing - The Implicit meaning that is to be understood when this element is missing (e.g. 'when this element is missing, the period is ongoing').
  * @param sliceIsConstraining - If true, indicates that this slice definition is constraining a slice definition with the same name in an inherited profile. If false, the slice is not overriding any slice in an inherited profile. If missing, the slice might or might not be overriding a slice in an inherited profile, depending on the sliceName.
  * @param binding - Binds to a value set if this element is coded (code, Coding, CodeableConcept, Quantity), or the data types (string, uri).
  * @param constraint - Formal constraints such as co-occurrence and other constraints that can be computationally evaluated within the context of the instance.
  */
@POJOBoilerplate
class Elementdefinition_de(
    override val id: Option[String] = None,
    override val min: Option[UnsignedInt] = None,
    override val max: Option[String] = None,
    override val path: String,
    override val code: LitSeq[Coding] = LitSeq.empty,
    override val label: Option[String] = None,
    override val alias: LitSeq[String] = LitSeq.empty,
    override val comment: Option[Markdown] = None,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val sliceName: Option[String] = None,
    override val maxLength: Option[Int] = None,
    override val condition: LitSeq[Id] = LitSeq.empty,
    override val definition: Option[Markdown] = None,
    override val minValue: Option[Elementdefinition_de.MinValueChoice] = None,
    override val maxValue: Option[Elementdefinition_de.MaxValueChoice] = None,
    override val mustSupport: Option[Boolean] = None,
    override val requirements: Option[Markdown] = None,
    override val orderMeaning: Option[String] = None,
    override val base: Option[ElementDefinition.Base] = None,
    override val defaultValue: Option[Elementdefinition_de.DefaultValueChoice] = None,
    override val isModifierReason: Option[String] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val example: LitSeq[ElementDefinition.Example] = LitSeq.empty,
    override val mapping: LitSeq[ElementDefinition.Mapping] = LitSeq.empty,
    override val `type`: LitSeq[ElementDefinition.Type] = LitSeq.empty,
    override val meaningWhenMissing: Option[Markdown] = None,
    override val sliceIsConstraining: Option[Boolean] = None,
    override val binding: Option[ElementDefinition.Binding] = None,
    override val constraint: LitSeq[ElementDefinition.Constraint] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends ElementDefinition(
      id = id,
      min = min,
      max = max,
      path = path,
      code = code,
      label = label,
      alias = alias,
      comment = comment,
      extension = extension,
      sliceName = sliceName,
      maxLength = maxLength,
      condition = condition,
      definition = definition,
      minValue = minValue,
      maxValue = maxValue,
      mustSupport = mustSupport,
      requirements = requirements,
      orderMeaning = orderMeaning,
      base = base,
      defaultValue = defaultValue,
      isModifierReason = isModifierReason,
      modifierExtension = modifierExtension,
      example = example,
      mapping = mapping,
      `type` = `type`,
      meaningWhenMissing = meaningWhenMissing,
      sliceIsConstraining = sliceIsConstraining,
      binding = binding,
      constraint = constraint,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "ElementDefinition"
}
