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

object Cqf_cdsHooksEndpoint extends CompanionFor[Cqf_cdsHooksEndpoint] {
  implicit def summonObjectAndCompanionCqf_cdsHooksEndpoint278101277(
      o: Cqf_cdsHooksEndpoint): ObjectAndCompanion[Cqf_cdsHooksEndpoint, Cqf_cdsHooksEndpoint.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/cqf-cdsHooksEndpoint")
  def apply(
      id: Option[String] = None,
      value: UriStr,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Cqf_cdsHooksEndpoint = new Cqf_cdsHooksEndpoint(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[UriStr] =
    FHIRComponentFieldMeta("value", lTagOf[UriStr], true, lTagOf[UriStr])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[UriStr](value, t.value.get.toSubRefNonUnion[UriStr])
    ))
  override def fields(t: Cqf_cdsHooksEndpoint): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Cqf_cdsHooksEndpoint): Option[String]                   = t.id
  def extractValue(t: Cqf_cdsHooksEndpoint): UriStr                        = t.value.get.toSubRefNonUnion[UriStr]
  override val thisName: String                                            = "Cqf_cdsHooksEndpoint"
  override val searchParams: Map[String, Cqf_cdsHooksEndpoint => Seq[Any]] = Extension.searchParams
  def unapply(o: Cqf_cdsHooksEndpoint): Option[(Option[String], UriStr)]   = Some((o.id, o.value.get.toSubRefNonUnion[UriStr]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Cqf_cdsHooksEndpoint] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Cqf_cdsHooksEndpoint(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[UriStr]("valueUri", None),
          decodeAttributes(cursor)
        )
      ))
}

/** Specifies the URI of a CDS Hooks service that uses this PlanDefinition as its implementation.
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
class Cqf_cdsHooksEndpoint(
    override val id: Option[String] = None,
    value: UriStr,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(new Choice("Uri", value)(UnionAllTag)),
      url = "http://hl7.org/fhir/StructureDefinition/cqf-cdsHooksEndpoint",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
