package com.babylonhealth.lit.usbase.model

import java.time.{ LocalDate, LocalTime, ZonedDateTime }
import java.util.UUID

import scala.collection.immutable.TreeMap
import scala.util.Try

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

object Workflow_relatedArtifact extends CompanionFor[Workflow_relatedArtifact] {
  override val baseType: CompanionFor[Extension] = Extension
  override val profileUrl: Option[String]        = Some("http://hl7.org/fhir/StructureDefinition/workflow-relatedArtifact")
  def apply(
      id: Option[String] = None,
      url: String,
      value: RelatedArtifact,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Workflow_relatedArtifact = new Workflow_relatedArtifact(
    id,
    url,
    value,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val url: FHIRComponentFieldMeta[String] =
    FHIRComponentFieldMeta("url", lTagOf[String], false, lTagOf[String])
  val value: FHIRComponentFieldMeta[RelatedArtifact] =
    FHIRComponentFieldMeta("value", lTagOf[RelatedArtifact], true, lTagOf[RelatedArtifact])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, url, value)
  override def fields(t: Workflow_relatedArtifact): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[String](url, t.url),
    FHIRComponentField[RelatedArtifact](value, t.value.get.toSubRefNonUnion[RelatedArtifact])
  )
  def extractId(t: Workflow_relatedArtifact): Option[String]                   = t.id
  def extractUrl(t: Workflow_relatedArtifact): String                          = t.url
  def extractValue(t: Workflow_relatedArtifact): RelatedArtifact               = t.value.get.toSubRefNonUnion[RelatedArtifact]
  override val thisName: String                                                = "Workflow_relatedArtifact"
  override val searchParams: Map[String, Workflow_relatedArtifact => Seq[Any]] = Extension.searchParams
  def unapply(o: Workflow_relatedArtifact): Option[(Option[String], String, RelatedArtifact)] = Some(
    (o.id, o.url, o.value.get.toSubRefNonUnion[RelatedArtifact]))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Workflow_relatedArtifact] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Workflow_relatedArtifact(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[String]("url", None),
          cursor.decodeAs[RelatedArtifact]("valueRelatedArtifact", None),
          decodeAttributes(cursor)
        )
      ))
}

/** Documentation  or 'knowledge artifacts' relevant to the base resource such as citations, supporting evidence, documentation of processes, caveats around testing methodology.
  *
  *  Subclass of [[core.model.Extension]] (Base StructureDefinition for Extension Type: Optional Extension Element - found in all resources.)
  *
  * @constructor Inherits all params from parent.
  *              Refines the types of: value.
  *              Requires the following fields which were optional in the parent: value.
  *              Forbids the use of the following fields which were optional in the parent: extension.
  * @param id - Unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces.
  * @param url - Source of the definition for the extension code - a logical name or a URL.
  * @param value - Value of extension - must be one of a constrained set of the data types (see [Extensibility](http://hl7.org/fhir/extensibility.html) for a list).
  */
@POJOBoilerplate
class Workflow_relatedArtifact(
    override val id: Option[String] = None,
    override val url: String,
    value: RelatedArtifact,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Extension(id = id, url = url, value = Some(choice(value)), primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Extension"
}
