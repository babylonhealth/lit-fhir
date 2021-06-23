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

object Event_performerFunction extends CompanionFor[Event_performerFunction] {
  implicit def summonObjectAndCompanionEvent_performerFunction43359373(
      o: Event_performerFunction): ObjectAndCompanion[Event_performerFunction, Event_performerFunction.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/event-performerFunction")
  def apply(
      id: Option[String] = None,
      value: CodeableConcept,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Event_performerFunction = new Event_performerFunction(
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
  override def fields(t: Event_performerFunction): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Event_performerFunction): Option[String]                   = t.id
  def extractValue(t: Event_performerFunction): CodeableConcept               = t.value.get.toSubRefNonUnion[CodeableConcept]
  override val thisName: String                                               = "Event_performerFunction"
  override val searchParams: Map[String, Event_performerFunction => Seq[Any]] = Extension.searchParams
  def unapply(o: Event_performerFunction): Option[(Option[String], CodeableConcept)] = Some(
    (o.id, o.value.get.toSubRefNonUnion[CodeableConcept]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Event_performerFunction] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Event_performerFunction(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[CodeableConcept]("valueCodeableConcept", None),
          decodeAttributes(cursor)
        )
      ))
}

/** Distinguishes the type of involvement of the performer in the event. For example, 'author', 'verifier' or 'responsible party'.
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
class Event_performerFunction(
    override val id: Option[String] = None,
    value: CodeableConcept,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choice(value)),
      url = "http://hl7.org/fhir/StructureDefinition/event-performerFunction",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
