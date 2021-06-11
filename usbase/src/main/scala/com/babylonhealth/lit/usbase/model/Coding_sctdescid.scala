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

object Coding_sctdescid extends CompanionFor[Coding_sctdescid] {
  implicit def summonObjectAndCompanionCoding_sctdescid1658394230(
      o: Coding_sctdescid): ObjectAndCompanion[Coding_sctdescid, Coding_sctdescid.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/coding-sctdescid")
  def apply(
      id: Option[String] = None,
      value: Id,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Coding_sctdescid = new Coding_sctdescid(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[Id] =
    FHIRComponentFieldMeta("value", lTagOf[Id], true, lTagOf[Id])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Id](value, t.value.get.toSubRefNonUnion[Id])
    ))
  override def fields(t: Coding_sctdescid): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Coding_sctdescid): Option[String]                   = t.id
  def extractValue(t: Coding_sctdescid): Id                            = t.value.get.toSubRefNonUnion[Id]
  override val thisName: String                                        = "Coding_sctdescid"
  override val searchParams: Map[String, Coding_sctdescid => Seq[Any]] = Extension.searchParams
  def unapply(o: Coding_sctdescid): Option[(Option[String], Id)]       = Some((o.id, o.value.get.toSubRefNonUnion[Id]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Coding_sctdescid] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Coding_sctdescid(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Id]("valueId", None),
          decodeAttributes(cursor)
        )
      ))
}

/** The SNOMED CT Description ID for the display.
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
class Coding_sctdescid(
    override val id: Option[String] = None,
    value: Id,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choice(value)),
      url = "http://hl7.org/fhir/StructureDefinition/coding-sctdescid",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
