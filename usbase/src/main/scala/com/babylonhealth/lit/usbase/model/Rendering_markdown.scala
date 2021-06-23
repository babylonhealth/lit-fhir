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

object Rendering_markdown extends CompanionFor[Rendering_markdown] {
  implicit def summonObjectAndCompanionRendering_markdown_866928663(
      o: Rendering_markdown): ObjectAndCompanion[Rendering_markdown, Rendering_markdown.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Extension
  override type ParentType   = Extension
  override val baseType: CompanionFor[ResourceType] = Extension
  override val parentType: CompanionFor[ParentType] = Extension
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/rendering-markdown")
  def apply(
      id: Option[String] = None,
      value: Markdown,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Rendering_markdown = new Rendering_markdown(
    id,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[Markdown] =
    FHIRComponentFieldMeta("value", lTagOf[Markdown], true, lTagOf[Markdown])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, value)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Markdown](value, t.value.get.toSubRefNonUnion[Markdown])
    ))
  override def fields(t: Rendering_markdown): Seq[FHIRComponentField[_]] = fieldsFromParent(t).get
  def extractId(t: Rendering_markdown): Option[String]                   = t.id
  def extractValue(t: Rendering_markdown): Markdown                      = t.value.get.toSubRefNonUnion[Markdown]
  override val thisName: String                                          = "Rendering_markdown"
  override val searchParams: Map[String, Rendering_markdown => Seq[Any]] = Extension.searchParams
  def unapply(o: Rendering_markdown): Option[(Option[String], Markdown)] = Some((o.id, o.value.get.toSubRefNonUnion[Markdown]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Rendering_markdown] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Rendering_markdown(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Markdown]("valueMarkdown", None),
          decodeAttributes(cursor)
        )
      ))
}

/** This is an equivalent of the string on which the extension is sent, but includes additional markdown (see documentation about
  * [markdown](datatypes.html#markdown). Note that using HTML [xhtml](extension-rendering-xhtml.html) can allow for greater
  * precision of display.
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
class Rendering_markdown(
    override val id: Option[String] = None,
    value: Markdown,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(
      id = id,
      value = Some(choice(value)),
      url = "http://hl7.org/fhir/StructureDefinition/rendering-markdown",
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
