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

import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Elementdefinition_maxValueSet extends CompanionFor[Elementdefinition_maxValueSet] {
  implicit def summonObjectAndCompanionElementdefinition_maxValueSet215922447(
      o: Elementdefinition_maxValueSet): ObjectAndCompanion[Elementdefinition_maxValueSet, Elementdefinition_maxValueSet.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String] = Some("http://hl7.org/fhir/StructureDefinition/elementdefinition-maxValueSet")
  type ValueChoice = Choice[UnionCanonicalOrUriStr]
  def apply(
      id: Option[String] = None,
      value: Elementdefinition_maxValueSet.ValueChoice,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Elementdefinition_maxValueSet = new Elementdefinition_maxValueSet(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[Elementdefinition_maxValueSet.ValueChoice] =
    FHIRComponentFieldMeta("value", lTagOf[Elementdefinition_maxValueSet.ValueChoice], true, lTagOf[UnionCanonicalOrUriStr])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Elementdefinition_maxValueSet.ValueChoice](value, t.value.get.toSubRef)
    ))
  override def fields(t: Elementdefinition_maxValueSet): Seq[FHIRComponentField[_]]             = fieldsFromParent(t).get
  def extractId(t: Elementdefinition_maxValueSet): Option[String]                               = t.id
  def extractValue(t: Elementdefinition_maxValueSet): Elementdefinition_maxValueSet.ValueChoice = t.value.get.toSubRef
  override val thisName: String                                                                 = "Elementdefinition_maxValueSet"
  override val searchParams: Map[String, Elementdefinition_maxValueSet => Seq[Any]]             = Extension.searchParams
  def unapply(o: Elementdefinition_maxValueSet): Option[(Option[String], Elementdefinition_maxValueSet.ValueChoice)] = Some(
    (o.id, o.value.get.toSubRef))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Elementdefinition_maxValueSet] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Elementdefinition_maxValueSet(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeRef[UnionCanonicalOrUriStr]("value"),
          decodeAttributes(cursor)
        )
      ))
}

/** The maximum allowable value set, for use when the binding strength is 'extensible' or 'preferred'. This value set is the value
  * set from which additional codes can be taken from. This defines a 'required' binding over the top of the extensible binding.
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
  *   spaces.
  * @param url
  *   - Source of the definition for the extension code - a logical name or a URL.
  * @param value
  *   - Value of extension - must be one of a constrained set of the data types (see
  *   [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
  */
@POJOBoilerplate
class Elementdefinition_maxValueSet(
    override val id: Option[String] = None,
    value: Elementdefinition_maxValueSet.ValueChoice,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(value.toSuperRef),
      url = "http://hl7.org/fhir/StructureDefinition/elementdefinition-maxValueSet",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
