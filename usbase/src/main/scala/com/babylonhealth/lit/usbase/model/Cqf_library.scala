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

object Cqf_library extends CompanionFor[Cqf_library] {
  implicit def summonObjectAndCompanionCqf_library548998833(o: Cqf_library): ObjectAndCompanion[Cqf_library, Cqf_library.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/cqf-library")
  def apply(
      id: Option[String] = None,
      value: Canonical,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Cqf_library = new Cqf_library(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[Canonical] =
    FHIRComponentFieldMeta("value", lTagOf[Canonical], true, lTagOf[Canonical])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Canonical](value, t.value.get.toSubRefNonUnion[Canonical])
    ))
  override def fields(t: Cqf_library): Seq[FHIRComponentField[_]]  = fieldsFromParent(t).get
  def extractId(t: Cqf_library): Option[String]                    = t.id
  def extractValue(t: Cqf_library): Canonical                      = t.value.get.toSubRefNonUnion[Canonical]
  override val thisName: String                                    = "Cqf_library"
  override val searchParams: Map[String, Cqf_library => Seq[Any]]  = Extension.searchParams
  def unapply(o: Cqf_library): Option[(Option[String], Canonical)] = Some((o.id, o.value.get.toSubRefNonUnion[Canonical]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Cqf_library] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Cqf_library(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Canonical]("valueCanonical", None),
          decodeAttributes(cursor)
        )
      ))
}

/** A reference to a Library containing the formal logic used by the artifact.
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
  *     spaces.
  * @param url
  *   - Source of the definition for the extension code - a logical name or a URL.
  * @param value
  *   - Value of extension - must be one of a constrained set of the data types (see
  *     [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
  */
@POJOBoilerplate
class Cqf_library(
    override val id: Option[String] = None,
    value: Canonical,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choice(value)),
      url = "http://hl7.org/fhir/StructureDefinition/cqf-library",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
