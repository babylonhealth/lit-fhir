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

object Observation_bodyPosition extends CompanionFor[Observation_bodyPosition] {
  implicit def summonObjectAndCompanionObservation_bodyPosition318928321(
      o: Observation_bodyPosition): ObjectAndCompanion[Observation_bodyPosition, Observation_bodyPosition.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/observation-bodyPosition")
  def apply(
      id: Option[String] = None,
      value: CodeableConcept,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Observation_bodyPosition = new Observation_bodyPosition(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[CodeableConcept] =
    FHIRComponentFieldMeta("value", lTagOf[CodeableConcept], true, lTagOf[CodeableConcept])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[CodeableConcept](value, t.value.get.toSubRefNonUnion[CodeableConcept])
    ))
  override def fields(t: Observation_bodyPosition): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Observation_bodyPosition): Option[String]                   = t.id
  def extractValue(t: Observation_bodyPosition): CodeableConcept               = t.value.get.toSubRefNonUnion[CodeableConcept]
  override val thisName: String                                                = "Observation_bodyPosition"
  override val searchParams: Map[String, Observation_bodyPosition => Seq[Any]] = Extension.searchParams
  def unapply(o: Observation_bodyPosition): Option[(Option[String], CodeableConcept)] = Some(
    (o.id, o.value.get.toSubRefNonUnion[CodeableConcept]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Observation_bodyPosition] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Observation_bodyPosition(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[CodeableConcept]("valueCodeableConcept", None),
          decodeAttributes(cursor)
        )
      ))
}

/** The position of the body when the observation was done, e.g. standing, sitting. To be used only when the body position in not
  * precoordinated in the observation code.
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
class Observation_bodyPosition(
    override val id: Option[String] = None,
    value: CodeableConcept,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(new Choice("CodeableConcept", value)(UnionAllTag)),
      url = "http://hl7.org/fhir/StructureDefinition/observation-bodyPosition",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
