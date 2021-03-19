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

object Specimen_processingTime extends CompanionFor[Specimen_processingTime] {
  override type ResourceType = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/specimen-processingTime")
  type ValueChoice = Choice[Union00284192631]
  def apply(
      id: Option[String] = None,
      value: Specimen_processingTime.ValueChoice,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Specimen_processingTime = new Specimen_processingTime(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[Specimen_processingTime.ValueChoice] =
    FHIRComponentFieldMeta("value", lTagOf[Specimen_processingTime.ValueChoice], true, lTagOf[Union00284192631])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Specimen_processingTime.ValueChoice](value, t.value.get.toSubRef)
    ))
  override def fields(t: Specimen_processingTime): Seq[FHIRComponentField[_]]       = fieldsFromParent(t).get
  def extractId(t: Specimen_processingTime): Option[String]                         = t.id
  def extractValue(t: Specimen_processingTime): Specimen_processingTime.ValueChoice = t.value.get.toSubRef
  override val thisName: String                                                     = "Specimen_processingTime"
  override val searchParams: Map[String, Specimen_processingTime => Seq[Any]]       = Extension.searchParams
  def unapply(o: Specimen_processingTime): Option[(Option[String], Specimen_processingTime.ValueChoice)] = Some(
    (o.id, o.value.get.toSubRef))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Specimen_processingTime] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Specimen_processingTime(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeRef[Union00284192631]("value"),
          decodeAttributes(cursor)
        )
      ))
}

/** Period or duration of processing.
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
class Specimen_processingTime(
    override val id: Option[String] = None,
    value: Specimen_processingTime.ValueChoice,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(value.toSuperRef),
      url = "http://hl7.org/fhir/StructureDefinition/specimen-processingTime",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
