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
import com.babylonhealth.lit.usbase.EXPANSION_PARAMETER_SOURCE
import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Valueset_parameterSource extends CompanionFor[Valueset_parameterSource] {
  implicit def summonObjectAndCompanionValueset_parameterSource_957736579(
      o: Valueset_parameterSource): ObjectAndCompanion[Valueset_parameterSource, Valueset_parameterSource.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/valueset-parameterSource")
  def apply(
      id: Option[String] = None,
      value: EXPANSION_PARAMETER_SOURCE,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Valueset_parameterSource = new Valueset_parameterSource(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[EXPANSION_PARAMETER_SOURCE] =
    FHIRComponentFieldMeta("value", lTagOf[EXPANSION_PARAMETER_SOURCE], true, lTagOf[EXPANSION_PARAMETER_SOURCE])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[EXPANSION_PARAMETER_SOURCE](
        value,
        EXPANSION_PARAMETER_SOURCE.withName(t.value.get.toSubRefNonUnion[Code]))
    ))
  override def fields(t: Valueset_parameterSource): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Valueset_parameterSource): Option[String]                   = t.id
  def extractValue(t: Valueset_parameterSource): EXPANSION_PARAMETER_SOURCE =
    EXPANSION_PARAMETER_SOURCE.withName(t.value.get.toSubRefNonUnion[Code])
  override val thisName: String                                                = "Valueset_parameterSource"
  override val searchParams: Map[String, Valueset_parameterSource => Seq[Any]] = Extension.searchParams
  def unapply(o: Valueset_parameterSource): Option[(Option[String], EXPANSION_PARAMETER_SOURCE)] = Some(
    (o.id, EXPANSION_PARAMETER_SOURCE.withName(o.value.get.toSubRefNonUnion[Code])))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Valueset_parameterSource] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Valueset_parameterSource(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[EXPANSION_PARAMETER_SOURCE]("valueCode", None),
          decodeAttributes(cursor)
        )
      ))
}

/** Declares what the source of this parameter is.
  *
  * Subclass of [[core.model.Extension]] (Base StructureDefinition for Extension Type: Optional Extension Element - found in all
  * resources.)
  *
  * @constructor
  *   Inherits all params from parent. Refines the types of: value. Requires the following fields which were optional in the
  *   parent: value. Forbids the use of the following fields which were optional in the parent: extension. Hardcodes the value of
  *   the following fields: url.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *     spaces.
  * @param url
  *   - Source of the definition for the extension code - a logical name or a URL.
  * @param value
  *   - Value of extension - must be one of a constrained set of the data types (see
  *     [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
  */
@POJOBoilerplate
class Valueset_parameterSource(
    override val id: Option[String] = None,
    value: EXPANSION_PARAMETER_SOURCE,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choiceFromEnum(value)),
      url = "http://hl7.org/fhir/StructureDefinition/valueset-parameterSource",
      primitiveAttributes = primitiveAttributes
    ) {
  override val thisTypeName: String = "Extension"
}
