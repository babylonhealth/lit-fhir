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

object Procedure_directedBy extends CompanionFor[Procedure_directedBy] {
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/procedure-directedBy")
  type ValueChoice = Choice[Union01025009075]
  def apply(
      id: Option[String] = None,
      value: Procedure_directedBy.ValueChoice,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Procedure_directedBy = new Procedure_directedBy(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[Procedure_directedBy.ValueChoice] =
    FHIRComponentFieldMeta("value", lTagOf[Procedure_directedBy.ValueChoice], true, lTagOf[Union01025009075])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Procedure_directedBy.ValueChoice](value, t.value.get.toSubRef)
    ))
  override def fields(t: Procedure_directedBy): Seq[FHIRComponentField[_]]    = fieldsFromParent(t).get
  def extractId(t: Procedure_directedBy): Option[String]                      = t.id
  def extractValue(t: Procedure_directedBy): Procedure_directedBy.ValueChoice = t.value.get.toSubRef
  override val thisName: String                                               = "Procedure_directedBy"
  override val searchParams: Map[String, Procedure_directedBy => Seq[Any]]    = Extension.searchParams
  def unapply(o: Procedure_directedBy): Option[(Option[String], Procedure_directedBy.ValueChoice)] = Some(
    (o.id, o.value.get.toSubRef))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Procedure_directedBy] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Procedure_directedBy(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeRef[Union01025009075]("value"),
          decodeAttributes(cursor)
        )
      ))
}

/** The target of the extension is a distinct actor from the requester and has decision-making authority over the service and takes direct responsibility to manage the service.
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
class Procedure_directedBy(
    override val id: Option[String] = None,
    value: Procedure_directedBy.ValueChoice,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(value.toSuperRef),
      url = "http://hl7.org/fhir/StructureDefinition/procedure-directedBy",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
