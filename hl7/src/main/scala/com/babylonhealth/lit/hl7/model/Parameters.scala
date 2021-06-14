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

object Parameters extends CompanionFor[Parameters] {
  implicit def summonObjectAndCompanionParameters313477919(
      o: Parameters): ObjectAndCompanion[Parameters, Parameters.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Parameters
  override type ParentType   = Parameters
  override val baseType: CompanionFor[ResourceType] = Parameters
  override val parentType: CompanionFor[ParentType] = Parameters
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Parameters")
  object Parameter extends CompanionFor[Parameter] {
    implicit def summonObjectAndCompanionParameter581972308(
        o: Parameter): ObjectAndCompanion[Parameter, Parameter.type] = ObjectAndCompanion(o, this)
    override type ResourceType = Parameter
    override type ParentType   = Parameter
    override val parentType: CompanionFor[ResourceType] = Parameter
    type ValueChoice = Choice[Union_1349125893]
    def apply(
        id: Option[String] = None,
        name: String,
        part: LitSeq[Parameters.Parameter] = LitSeq.empty,
        value: Option[Parameter.ValueChoice] = None,
        resource: Option[Resource] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Parameter = new Parameter(
      id,
      name,
      part,
      value,
      resource,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Parameter): Option[(Option[String], String, LitSeq[Parameters.Parameter], Option[Parameter.ValueChoice], Option[Resource], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.name, o.part, o.value, o.resource, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val name: FHIRComponentFieldMeta[String] =
      FHIRComponentFieldMeta("name", lTagOf[String], false, lTagOf[String])
    val part: FHIRComponentFieldMeta[LitSeq[Parameters.Parameter]] =
      FHIRComponentFieldMeta("part", lTagOf[LitSeq[Parameters.Parameter]], false, lTagOf[Parameters.Parameter])
    val value: FHIRComponentFieldMeta[Option[Parameter.ValueChoice]] =
      FHIRComponentFieldMeta("value", lTagOf[Option[Parameter.ValueChoice]], true, lTagOf[Union_1349125893])
    val resource: FHIRComponentFieldMeta[Option[Resource]] =
      FHIRComponentFieldMeta("resource", lTagOf[Option[Resource]], false, lTagOf[Resource])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, name, part, value, resource, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Parameter): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[String](name, t.name),
      FHIRComponentField[LitSeq[Parameters.Parameter]](part, t.part),
      FHIRComponentField[Option[Parameter.ValueChoice]](value, t.value),
      FHIRComponentField[Option[Resource]](resource, t.resource),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Parameter] = this
    val thisName: String                  = "Parameter"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Parameter] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Parameter(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[String]("name", None),
            cursor.decodeAs[LitSeq[Parameters.Parameter]]("part", Some(LitSeq.empty)),
            cursor.decodeOptRef[Union_1349125893]("value"),
            cursor.decodeAs[Option[Resource]]("resource", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Parameter(
      override val id: Option[String] = None,
      val name: String,
      val part: LitSeq[Parameters.Parameter] = LitSeq.empty,
      val value: Option[Parameter.ValueChoice] = None,
      val resource: Option[Resource] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      language: Option[LANGUAGES] = None,
      implicitRules: Option[UriStr] = None,
      parameter: LitSeq[Parameters.Parameter] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Parameters = new Parameters(
    id,
    meta,
    language,
    implicitRules,
    parameter,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val parameter: FHIRComponentFieldMeta[LitSeq[Parameters.Parameter]] =
    FHIRComponentFieldMeta("parameter", lTagOf[LitSeq[Parameters.Parameter]], false, lTagOf[Parameters.Parameter])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, meta, language, implicitRules, parameter)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Parameters): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Parameters.Parameter]](parameter, t.parameter)
  )
  def extractId(t: Parameters): Option[String]                      = t.id
  def extractMeta(t: Parameters): Option[Meta]                      = t.meta
  def extractLanguage(t: Parameters): Option[LANGUAGES]             = t.language
  def extractImplicitRules(t: Parameters): Option[UriStr]           = t.implicitRules
  def extractParameter(t: Parameters): LitSeq[Parameters.Parameter] = t.parameter
  override val thisName: String                                     = "Parameters"
  def unapply(
      o: Parameters): Option[(Option[String], Option[Meta], Option[LANGUAGES], Option[UriStr], LitSeq[Parameters.Parameter])] =
    Some((o.id, o.meta, o.language, o.implicitRules, o.parameter))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Parameters] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Parameters(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Parameters.Parameter]]("parameter", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** This resource is a non-persisted resource used to pass information into and back from an [operation](operations.html). It has no other use, and there is no RESTful endpoint associated with it.
  *
  *  Subclass of [[core.model.Resource]] (This is the base resource type for everything.)
  *
  * @constructor Introduces the fields parameter.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param language - The base language in which the resource is written.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param parameter - A parameter passed to or received from the operation.
  */
@POJOBoilerplate
class Parameters(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val language: Option[LANGUAGES] = None,
    override val implicitRules: Option[UriStr] = None,
    val parameter: LitSeq[Parameters.Parameter] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Resource(
      id = id,
      meta = meta,
      language = language,
      implicitRules = implicitRules,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Parameters"
}
