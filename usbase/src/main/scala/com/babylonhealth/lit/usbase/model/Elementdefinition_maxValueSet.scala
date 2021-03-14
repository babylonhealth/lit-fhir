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

import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Elementdefinition_maxValueSet extends CompanionFor[Elementdefinition_maxValueSet] {
  override val baseType: CompanionFor[Extension] = Extension
  type ValueChoice = Choice[Union00545979821]
  def apply(
      id: Option[String] = None,
      url: String,
      value: Elementdefinition_maxValueSet.ValueChoice,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Elementdefinition_maxValueSet = new Elementdefinition_maxValueSet(
    id,
    url,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val url: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("url", lTagOf[String], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[Elementdefinition_maxValueSet.ValueChoice] =
    FHIRComponentFieldMeta("value", lTagOf[Elementdefinition_maxValueSet.ValueChoice], true, lTagOf[Union00545979821])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, url, value)
  override def fields(t: Elementdefinition_maxValueSet): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[String](url, t.url),
    FHIRComponentField[Elementdefinition_maxValueSet.ValueChoice](value, t.value.get.toSubRef)
  )
  def extractId(t: Elementdefinition_maxValueSet): Option[String]                               = t.id
  def extractUrl(t: Elementdefinition_maxValueSet): String                                      = t.url
  def extractValue(t: Elementdefinition_maxValueSet): Elementdefinition_maxValueSet.ValueChoice = t.value.get.toSubRef
  override val thisName: String                                                                 = "Elementdefinition_maxValueSet"
  override val searchParams: Map[String, Elementdefinition_maxValueSet => Seq[Any]]             = Extension.searchParams
  def unapply(
      o: Elementdefinition_maxValueSet): Option[(Option[String], String, Elementdefinition_maxValueSet.ValueChoice)] =
    Some((o.id, o.url, o.value.get.toSubRef))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Elementdefinition_maxValueSet] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Elementdefinition_maxValueSet(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[String]("url", None),
          cursor.decodeRef[Union00545979821]("value"),
          decodeAttributes(cursor)
        )
      ))
}

/** The maximum allowable value set, for use when the binding strength is 'extensible' or 'preferred'. This value set is the value set from which additional codes can be taken from. This defines a 'required' binding over the top of the extensible binding.
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
class Elementdefinition_maxValueSet(
    override val id: Option[String] = None,
    override val url: String,
    value: Elementdefinition_maxValueSet.ValueChoice,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(id = id, url = url, value = Some(value.toSuperRef), primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}