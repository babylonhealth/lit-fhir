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
import com.babylonhealth.lit.usbase.QUESTIONNAIRE_USAGE_MODE
import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Questionnaire_usageMode extends CompanionFor[Questionnaire_usageMode] {
  implicit def summonObjectAndCompanionQuestionnaire_usageMode478522258(
      o: Questionnaire_usageMode): ObjectAndCompanion[Questionnaire_usageMode, Questionnaire_usageMode.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String] = Some("http://hl7.org/fhir/StructureDefinition/questionnaire-usageMode")
  def apply(
      id: Option[String] = None,
      value: QUESTIONNAIRE_USAGE_MODE,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Questionnaire_usageMode = new Questionnaire_usageMode(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[QUESTIONNAIRE_USAGE_MODE] =
    FHIRComponentFieldMeta("value", lTagOf[QUESTIONNAIRE_USAGE_MODE], true, lTagOf[QUESTIONNAIRE_USAGE_MODE])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[QUESTIONNAIRE_USAGE_MODE](
        value,
        QUESTIONNAIRE_USAGE_MODE.withName(t.value.get.toSubRefNonUnion[Code]))
    ))
  override def fields(t: Questionnaire_usageMode): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Questionnaire_usageMode): Option[String]                   = t.id
  def extractValue(t: Questionnaire_usageMode): QUESTIONNAIRE_USAGE_MODE =
    QUESTIONNAIRE_USAGE_MODE.withName(t.value.get.toSubRefNonUnion[Code])
  override val thisName: String                                               = "Questionnaire_usageMode"
  override val searchParams: Map[String, Questionnaire_usageMode => Seq[Any]] = Extension.searchParams
  def unapply(o: Questionnaire_usageMode): Option[(Option[String], QUESTIONNAIRE_USAGE_MODE)] = Some(
    (o.id, QUESTIONNAIRE_USAGE_MODE.withName(o.value.get.toSubRefNonUnion[Code])))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Questionnaire_usageMode] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Questionnaire_usageMode(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[QUESTIONNAIRE_USAGE_MODE]("valueCode", None),
          decodeAttributes(cursor)
        )
      ))
}

/** Identifies that the specified element should only appear in certain "modes" of operation.
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
class Questionnaire_usageMode(
    override val id: Option[String] = None,
    value: QUESTIONNAIRE_USAGE_MODE,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choice(value)),
      url = "http://hl7.org/fhir/StructureDefinition/questionnaire-usageMode",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
