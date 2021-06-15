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
import com.babylonhealth.lit.hl7.RESOURCE_TYPES
import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Questionnaire_referenceResource extends CompanionFor[Questionnaire_referenceResource] {
  implicit def summonObjectAndCompanionQuestionnaire_referenceResource1281245227(
      o: Questionnaire_referenceResource): ObjectAndCompanion[Questionnaire_referenceResource, Questionnaire_referenceResource.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String] = Some(
    "http://hl7.org/fhir/StructureDefinition/questionnaire-referenceResource")
  def apply(
      id: Option[String] = None,
      value: RESOURCE_TYPES,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Questionnaire_referenceResource = new Questionnaire_referenceResource(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[RESOURCE_TYPES] =
    FHIRComponentFieldMeta("value", lTagOf[RESOURCE_TYPES], true, lTagOf[RESOURCE_TYPES])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[RESOURCE_TYPES](value, RESOURCE_TYPES.withName(t.value.get.toSubRefNonUnion[Code]))
    ))
  override def fields(t: Questionnaire_referenceResource): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Questionnaire_referenceResource): Option[String]                   = t.id
  def extractValue(t: Questionnaire_referenceResource): RESOURCE_TYPES =
    RESOURCE_TYPES.withName(t.value.get.toSubRefNonUnion[Code])
  override val thisName: String = "Questionnaire_referenceResource"
  override val searchParams: Map[String, Questionnaire_referenceResource => Seq[Any]] = Extension.searchParams
  def unapply(o: Questionnaire_referenceResource): Option[(Option[String], RESOURCE_TYPES)] = Some(
    (o.id, RESOURCE_TYPES.withName(o.value.get.toSubRefNonUnion[Code])))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Questionnaire_referenceResource] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Questionnaire_referenceResource(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[RESOURCE_TYPES]("valueCode", None),
          decodeAttributes(cursor)
        )
      ))
}

/** Where the type for a question is "Reference", indicates a type of resource that is permitted.
  *
  * Subclass of [[core.model.Extension]] (Base StructureDefinition for Extension Type: Optional Extension Element -
  * found in all resources.)
  *
  * @constructor
  *   Inherits all params from parent. Refines the types of: value. Requires the following fields which were optional in
  *   the parent: value. Forbids the use of the following fields which were optional in the parent: extension. Hardcodes
  *   the value of the following fields: url.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does
  *   not contain spaces.
  * @param url
  *   - Source of the definition for the extension code - a logical name or a URL.
  * @param value
  *   - Value of extension - must be one of a constrained set of the data types (see
  *   [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
  */
@POJOBoilerplate
class Questionnaire_referenceResource(
    override val id: Option[String] = None,
    value: RESOURCE_TYPES,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choiceFromEnum(value)),
      url = "http://hl7.org/fhir/StructureDefinition/questionnaire-referenceResource",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
