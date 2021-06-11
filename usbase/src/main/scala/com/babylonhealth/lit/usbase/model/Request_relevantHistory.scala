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

object Request_relevantHistory extends CompanionFor[Request_relevantHistory] {
  implicit def summonObjectAndCompanionRequest_relevantHistory1347619652(
      o: Request_relevantHistory): ObjectAndCompanion[Request_relevantHistory, Request_relevantHistory.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/request-relevantHistory")
  def apply(
      id: Option[String] = None,
      value: Reference,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Request_relevantHistory = new Request_relevantHistory(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("value", lTagOf[Reference], true, lTagOf[Reference])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Reference](value, t.value.get.toSubRefNonUnion[Reference])
    ))
  override def fields(t: Request_relevantHistory): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Request_relevantHistory): Option[String]                   = t.id
  def extractValue(t: Request_relevantHistory): Reference                     = t.value.get.toSubRefNonUnion[Reference]
  override val thisName: String                                               = "Request_relevantHistory"
  override val searchParams: Map[String, Request_relevantHistory => Seq[Any]] = Extension.searchParams
  def unapply(o: Request_relevantHistory): Option[(Option[String], Reference)] = Some(
    (o.id, o.value.get.toSubRefNonUnion[Reference]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Request_relevantHistory] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Request_relevantHistory(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Reference]("valueReference", None),
          decodeAttributes(cursor)
        )
      ))
}

/** Links to Provenance records for past versions of this resource or fulfilling request or event resources that identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the resource.
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
class Request_relevantHistory(
    override val id: Option[String] = None,
    value: Reference,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choice(value)),
      url = "http://hl7.org/fhir/StructureDefinition/request-relevantHistory",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
