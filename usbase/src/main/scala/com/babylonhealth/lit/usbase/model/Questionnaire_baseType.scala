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
import com.babylonhealth.lit.usbase.DATA_TYPES
import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Questionnaire_baseType extends CompanionFor[Questionnaire_baseType] {
  override type ResourceType = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/questionnaire-baseType")
  def apply(
      id: Option[String] = None,
      value: DATA_TYPES,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Questionnaire_baseType = new Questionnaire_baseType(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[DATA_TYPES] =
    FHIRComponentFieldMeta("value", lTagOf[DATA_TYPES], true, lTagOf[DATA_TYPES])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[DATA_TYPES](value, DATA_TYPES.withName(t.value.get.toSubRefNonUnion[Code]))
    ))
  override def fields(t: Questionnaire_baseType): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Questionnaire_baseType): Option[String]                   = t.id
  def extractValue(t: Questionnaire_baseType): DATA_TYPES                    = DATA_TYPES.withName(t.value.get.toSubRefNonUnion[Code])
  override val thisName: String                                              = "Questionnaire_baseType"
  override val searchParams: Map[String, Questionnaire_baseType => Seq[Any]] = Extension.searchParams
  def unapply(o: Questionnaire_baseType): Option[(Option[String], DATA_TYPES)] = Some(
    (o.id, DATA_TYPES.withName(o.value.get.toSubRefNonUnion[Code])))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Questionnaire_baseType] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Questionnaire_baseType(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[DATA_TYPES]("valueCode", None),
          decodeAttributes(cursor)
        )
      ))
}

/** This identifies the underlying type in a profile, when a questionnaire is generated from a profile.
  *
  *  Subclass of [[core.model.Extension]] (Base StructureDefinition for Extension Type: Optional Extension Element - found in all resources.)
  *
  * @constructor Inherits all params from parent.
  *              Refines the types of: value.
  *              Requires the following fields which were optional in the parent: value.
  *              Forbids the use of the following fields which were optional in the parent: extension.
  *              Hardcodes the value of the following fields: url.
  * @param id - Unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces.
  * @param url - Source of the definition for the extension code - a logical name or a URL.
  * @param value - Value of extension - must be one of a constrained set of the data types (see [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
  */
@POJOBoilerplate
class Questionnaire_baseType(
    override val id: Option[String] = None,
    value: DATA_TYPES,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choice(value)),
      url = "http://hl7.org/fhir/StructureDefinition/questionnaire-baseType",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
