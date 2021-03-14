package com.babylonhealth.lit.usbase.model

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
import com.babylonhealth.lit.usbase.UnionAliases._
import com.babylonhealth.lit.usbase.CHOICE_LIST_ORIENTATION
import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Questionnaire_choiceOrientation extends CompanionFor[Questionnaire_choiceOrientation] {
  override val baseType: CompanionFor[Extension] = Extension
  def apply(
      id: Option[String] = None,
      url: String,
      value: CHOICE_LIST_ORIENTATION,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Questionnaire_choiceOrientation = new Questionnaire_choiceOrientation(
    id,
    url,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val url: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("url", lTagOf[String], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[CHOICE_LIST_ORIENTATION] =
    FHIRComponentFieldMeta("value", lTagOf[CHOICE_LIST_ORIENTATION], true, lTagOf[CHOICE_LIST_ORIENTATION])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, url, value)
  override def fields(t: Questionnaire_choiceOrientation): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[String](url, t.url),
    FHIRComponentField[CHOICE_LIST_ORIENTATION](value, t.value.get.toSubRefNonUnion[CHOICE_LIST_ORIENTATION])
  )
  def extractId(t: Questionnaire_choiceOrientation): Option[String] = t.id
  def extractUrl(t: Questionnaire_choiceOrientation): String        = t.url
  def extractValue(t: Questionnaire_choiceOrientation): CHOICE_LIST_ORIENTATION =
    t.value.get.toSubRefNonUnion[CHOICE_LIST_ORIENTATION]
  override val thisName: String                                                       = "Questionnaire_choiceOrientation"
  override val searchParams: Map[String, Questionnaire_choiceOrientation => Seq[Any]] = Extension.searchParams
  def unapply(o: Questionnaire_choiceOrientation): Option[(Option[String], String, CHOICE_LIST_ORIENTATION)] = Some(
    (o.id, o.url, o.value.get.toSubRefNonUnion[CHOICE_LIST_ORIENTATION]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Questionnaire_choiceOrientation] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Questionnaire_choiceOrientation(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[String]("url", None),
          cursor.decodeAs[CHOICE_LIST_ORIENTATION]("valueCode", None),
          decodeAttributes(cursor)
        )
      ))
}

/** Identifies the desired orientation when rendering a list of choices (typically radio-box or check-box lists).
  *
  *  Subclass of [[core.model.Extension]] (Base StructureDefinition for Extension Type: Optional Extension Element - found in all resources.)
  *
  * @constructor Inherits all params from parent.
  *              Refines the types of: value.
  *              Requires the following fields which were optional in the parent: value.
  *              Forbids the use of the following fields which were optional in the parent: extension.
  * @param id - Unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces.
  * @param url - Source of the definition for the extension code - a logical name or a URL.
  * @param value - Value of extension - must be one of a constrained set of the data types (see [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
  */
@POJOBoilerplate
class Questionnaire_choiceOrientation(
    override val id: Option[String] = None,
    override val url: String,
    value: CHOICE_LIST_ORIENTATION,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(id = id, url = url, value = Some(choice(value)), primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}