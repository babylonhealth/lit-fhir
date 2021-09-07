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

object Codesystem_replacedby extends CompanionFor[Codesystem_replacedby] {
  implicit def summonObjectAndCompanionCodesystem_replacedby1978724323(
      o: Codesystem_replacedby): ObjectAndCompanion[Codesystem_replacedby, Codesystem_replacedby.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/codesystem-replacedby")
  def apply(
      id: Option[String] = None,
      value: Coding,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Codesystem_replacedby = new Codesystem_replacedby(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[Coding] =
    FHIRComponentFieldMeta("value", lTagOf[Coding], true, lTagOf[Coding])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Coding](value, t.value.get.toSubRefNonUnion[Coding])
    ))
  override def fields(t: Codesystem_replacedby): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Codesystem_replacedby): Option[String]                   = t.id
  def extractValue(t: Codesystem_replacedby): Coding                        = t.value.get.toSubRefNonUnion[Coding]
  override val thisName: String                                             = "Codesystem_replacedby"
  override val searchParams: Map[String, Codesystem_replacedby => Seq[Any]] = Extension.searchParams
  def unapply(o: Codesystem_replacedby): Option[(Option[String], Coding)]   = Some((o.id, o.value.get.toSubRefNonUnion[Coding]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Codesystem_replacedby] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Codesystem_replacedby(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Coding]("valueCoding", None),
          decodeAttributes(cursor)
        )
      ))
}

/** A code that replaces this - use this code instead.
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
class Codesystem_replacedby(
    override val id: Option[String] = None,
    value: Coding,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(new Choice("Coding", value)(UnionAllTag)),
      url = "http://hl7.org/fhir/StructureDefinition/codesystem-replacedby",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
