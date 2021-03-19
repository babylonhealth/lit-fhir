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

object Condition_dueTo extends CompanionFor[Condition_dueTo] {
  override type ResourceType = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/condition-dueTo")
  type ValueChoice = Choice[Union01025009075]
  def apply(
      id: Option[String] = None,
      value: Condition_dueTo.ValueChoice,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Condition_dueTo = new Condition_dueTo(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[Condition_dueTo.ValueChoice] =
    FHIRComponentFieldMeta("value", lTagOf[Condition_dueTo.ValueChoice], true, lTagOf[Union01025009075])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Condition_dueTo.ValueChoice](value, t.value.get.toSubRef)
    ))
  override def fields(t: Condition_dueTo): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Condition_dueTo): Option[String]                   = t.id
  def extractValue(t: Condition_dueTo): Condition_dueTo.ValueChoice   = t.value.get.toSubRef
  override val thisName: String                                       = "Condition_dueTo"
  override val searchParams: Map[String, Condition_dueTo => Seq[Any]] = Extension.searchParams
  def unapply(o: Condition_dueTo): Option[(Option[String], Condition_dueTo.ValueChoice)] = Some(
    (o.id, o.value.get.toSubRef))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Condition_dueTo] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Condition_dueTo(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeRef[Union01025009075]("value"),
          decodeAttributes(cursor)
        )
      ))
}

/** Further conditions, problems, diagnoses, procedures or events or the substance that caused/triggered this Condition.
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
class Condition_dueTo(
    override val id: Option[String] = None,
    value: Condition_dueTo.ValueChoice,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(value.toSuperRef),
      url = "http://hl7.org/fhir/StructureDefinition/condition-dueTo",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
