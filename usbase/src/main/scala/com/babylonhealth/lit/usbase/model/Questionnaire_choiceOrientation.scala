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
import com.babylonhealth.lit.usbase.CHOICE_LIST_ORIENTATION
import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Questionnaire_choiceOrientation extends CompanionFor[Questionnaire_choiceOrientation] {
  implicit def summonObjectAndCompanionQuestionnaire_choiceOrientation_1408060080(
      o: Questionnaire_choiceOrientation): ObjectAndCompanion[Questionnaire_choiceOrientation, Questionnaire_choiceOrientation.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String] = Some("http://hl7.org/fhir/StructureDefinition/questionnaire-choiceOrientation")
  def apply(
      id: Option[String] = None,
      value: CHOICE_LIST_ORIENTATION,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Questionnaire_choiceOrientation = new Questionnaire_choiceOrientation(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[CHOICE_LIST_ORIENTATION] =
    FHIRComponentFieldMeta("value", lTagOf[CHOICE_LIST_ORIENTATION], true, lTagOf[CHOICE_LIST_ORIENTATION])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[CHOICE_LIST_ORIENTATION](value, CHOICE_LIST_ORIENTATION.withName(t.value.get.toSubRefNonUnion[Code]))
    ))
  override def fields(t: Questionnaire_choiceOrientation): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Questionnaire_choiceOrientation): Option[String]                   = t.id
  def extractValue(t: Questionnaire_choiceOrientation): CHOICE_LIST_ORIENTATION =
    CHOICE_LIST_ORIENTATION.withName(t.value.get.toSubRefNonUnion[Code])
  override val thisName: String                                                       = "Questionnaire_choiceOrientation"
  override val searchParams: Map[String, Questionnaire_choiceOrientation => Seq[Any]] = Extension.searchParams
  def unapply(o: Questionnaire_choiceOrientation): Option[(Option[String], CHOICE_LIST_ORIENTATION)] = Some(
    (o.id, CHOICE_LIST_ORIENTATION.withName(o.value.get.toSubRefNonUnion[Code])))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Questionnaire_choiceOrientation] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Questionnaire_choiceOrientation(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[CHOICE_LIST_ORIENTATION]("valueCode", None),
          decodeAttributes(cursor)
        )
      ))
}

/** Identifies the desired orientation when rendering a list of choices (typically radio-box or check-box lists).
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
class Questionnaire_choiceOrientation(
    override val id: Option[String] = None,
    value: CHOICE_LIST_ORIENTATION,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choiceFromEnum(value)),
      url = "http://hl7.org/fhir/StructureDefinition/questionnaire-choiceOrientation",
      primitiveAttributes = primitiveAttributes
    ) {
  override val thisTypeName: String = "Extension"
}
