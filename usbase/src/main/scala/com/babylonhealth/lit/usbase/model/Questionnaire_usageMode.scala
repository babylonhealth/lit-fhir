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
import com.babylonhealth.lit.usbase.QUESTIONNAIRE_USAGE_MODE
import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Questionnaire_usageMode extends CompanionFor[Questionnaire_usageMode] {
  override val baseType: CompanionFor[Extension] = Extension
  override val profileUrl: Option[String]        = Some("http://hl7.org/fhir/StructureDefinition/questionnaire-usageMode")
  def apply(
      id: Option[String] = None,
      url: String,
      value: QUESTIONNAIRE_USAGE_MODE,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Questionnaire_usageMode = new Questionnaire_usageMode(
    id,
    url,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val url: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("url", lTagOf[String], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[QUESTIONNAIRE_USAGE_MODE] =
    FHIRComponentFieldMeta("value", lTagOf[QUESTIONNAIRE_USAGE_MODE], true, lTagOf[QUESTIONNAIRE_USAGE_MODE])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, url, value)
  override def fields(t: Questionnaire_usageMode): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[String](url, t.url),
    FHIRComponentField[QUESTIONNAIRE_USAGE_MODE](value, t.value.get.toSubRefNonUnion[QUESTIONNAIRE_USAGE_MODE])
  )
  def extractId(t: Questionnaire_usageMode): Option[String] = t.id
  def extractUrl(t: Questionnaire_usageMode): String        = t.url
  def extractValue(t: Questionnaire_usageMode): QUESTIONNAIRE_USAGE_MODE =
    t.value.get.toSubRefNonUnion[QUESTIONNAIRE_USAGE_MODE]
  override val thisName: String                                               = "Questionnaire_usageMode"
  override val searchParams: Map[String, Questionnaire_usageMode => Seq[Any]] = Extension.searchParams
  def unapply(o: Questionnaire_usageMode): Option[(Option[String], String, QUESTIONNAIRE_USAGE_MODE)] = Some(
    (o.id, o.url, o.value.get.toSubRefNonUnion[QUESTIONNAIRE_USAGE_MODE]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Questionnaire_usageMode] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Questionnaire_usageMode(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[String]("url", None),
          cursor.decodeAs[QUESTIONNAIRE_USAGE_MODE]("valueCode", None),
          decodeAttributes(cursor)
        )
      ))
}

/** Identifies that the specified element should only appear in certain "modes" of operation.
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
class Questionnaire_usageMode(
    override val id: Option[String] = None,
    override val url: String,
    value: QUESTIONNAIRE_USAGE_MODE,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(id = id, url = url, value = Some(choice(value)), primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
