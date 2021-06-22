package com.babylonhealth.lit.core.model

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
import com.babylonhealth.lit.core.UnionAliases._
import com.babylonhealth.lit.core.{ ALL_TYPES, OPERATION_PARAMETER_USE }
import com.babylonhealth.lit.{ core }
import com.babylonhealth.lit.macros.POJOBoilerplate

object ParameterDefinition extends CompanionFor[ParameterDefinition] {
  implicit def summonObjectAndCompanionParameterDefinition_374680068(
      o: ParameterDefinition): ObjectAndCompanion[ParameterDefinition, ParameterDefinition.type] = ObjectAndCompanion(o, this)
  override type ResourceType = ParameterDefinition
  override type ParentType   = ParameterDefinition
  override val baseType: CompanionFor[ResourceType] = ParameterDefinition
  override val parentType: CompanionFor[ParentType] = ParameterDefinition
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/ParameterDefinition")
  def apply(
      id: Option[String] = None,
      use: OPERATION_PARAMETER_USE,
      min: Option[Int] = None,
      max: Option[String] = None,
      name: Option[Code] = None,
      `type`: ALL_TYPES,
      profile: Option[Canonical] = None,
      extension: LitSeq[Extension] = LitSeq.empty,
      documentation: Option[String] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): ParameterDefinition = new ParameterDefinition(
    id,
    use,
    min,
    max,
    name,
    `type`,
    profile,
    extension,
    documentation,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val use: FHIRComponentFieldMeta[OPERATION_PARAMETER_USE] =
    FHIRComponentFieldMeta("use", lTagOf[OPERATION_PARAMETER_USE], false, lTagOf[OPERATION_PARAMETER_USE])
  val min: FHIRComponentFieldMeta[Option[Int]] =
    FHIRComponentFieldMeta("min", lTagOf[Option[Int]], false, lTagOf[Int])
  val max: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("max", lTagOf[Option[String]], false, lTagOf[String])
  val name: FHIRComponentFieldMeta[Option[Code]] =
    FHIRComponentFieldMeta("name", lTagOf[Option[Code]], false, lTagOf[Code])
  val `type`: FHIRComponentFieldMeta[ALL_TYPES] =
    FHIRComponentFieldMeta("type", lTagOf[ALL_TYPES], false, lTagOf[ALL_TYPES])
  val profile: FHIRComponentFieldMeta[Option[Canonical]] =
    FHIRComponentFieldMeta("profile", lTagOf[Option[Canonical]], false, lTagOf[Canonical])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val documentation: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("documentation", lTagOf[Option[String]], false, lTagOf[String])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, use, min, max, name, `type`, profile, extension, documentation)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: ParameterDefinition): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[OPERATION_PARAMETER_USE](use, t.use),
    FHIRComponentField[Option[Int]](min, t.min),
    FHIRComponentField[Option[String]](max, t.max),
    FHIRComponentField[Option[Code]](name, t.name),
    FHIRComponentField[ALL_TYPES](`type`, t.`type`),
    FHIRComponentField[Option[Canonical]](profile, t.profile),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[String]](documentation, t.documentation)
  )
  def extractId(t: ParameterDefinition): Option[String]            = t.id
  def extractUse(t: ParameterDefinition): OPERATION_PARAMETER_USE  = t.use
  def extractMin(t: ParameterDefinition): Option[Int]              = t.min
  def extractMax(t: ParameterDefinition): Option[String]           = t.max
  def extractName(t: ParameterDefinition): Option[Code]            = t.name
  def extractType(t: ParameterDefinition): ALL_TYPES               = t.`type`
  def extractProfile(t: ParameterDefinition): Option[Canonical]    = t.profile
  def extractExtension(t: ParameterDefinition): LitSeq[Extension]  = t.extension
  def extractDocumentation(t: ParameterDefinition): Option[String] = t.documentation
  override val thisName: String                                    = "ParameterDefinition"
  def unapply(
      o: ParameterDefinition): Option[(Option[String], OPERATION_PARAMETER_USE, Option[Int], Option[String], Option[Code], ALL_TYPES, Option[Canonical], LitSeq[Extension], Option[String])] =
    Some((o.id, o.use, o.min, o.max, o.name, o.`type`, o.profile, o.extension, o.documentation))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ParameterDefinition] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new ParameterDefinition(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[OPERATION_PARAMETER_USE]("use", None),
          cursor.decodeAs[Option[Int]]("min", Some(None)),
          cursor.decodeAs[Option[String]]("max", Some(None)),
          cursor.decodeAs[Option[Code]]("name", Some(None)),
          cursor.decodeAs[ALL_TYPES]("type", None),
          cursor.decodeAs[Option[Canonical]]("profile", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("documentation", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for ParameterDefinition Type: The parameters to the module. This collection specifies both the input
  * and output parameters. Input parameters are provided by the caller as part of the $evaluate operation. Output parameters are
  * included in the GuidanceResponse.
  *
  * Subclass of [[core.model.Element]] (Base StructureDefinition for Element Type: Base definition for all elements in a
  * resource.)
  *
  * @constructor
  *   Introduces the fields use, min, max, name, `type`, profile, documentation.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *   spaces.
  * @param use
  *   - Whether the parameter is input or output for the module.
  * @param min
  *   - The minimum number of times this parameter SHALL appear in the request or response.
  * @param max
  *   - The maximum number of times this element is permitted to appear in the request or response.
  * @param name
  *   - The name of the parameter used to allow access to the value of the parameter in evaluation contexts.
  * @param `type`
  *   - The type of the parameter.
  * @param profile
  *   - If specified, this indicates a profile that the input data must conform to, or that the output data will conform to.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the element. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param documentation
  *   - A brief discussion of what the parameter is for and how it is used by the module.
  */
@POJOBoilerplate
class ParameterDefinition(
    override val id: Option[String] = None,
    val use: OPERATION_PARAMETER_USE,
    val min: Option[Int] = None,
    val max: Option[String] = None,
    val name: Option[Code] = None,
    val `type`: ALL_TYPES,
    val profile: Option[Canonical] = None,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val documentation: Option[String] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Element(id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "ParameterDefinition"
}
