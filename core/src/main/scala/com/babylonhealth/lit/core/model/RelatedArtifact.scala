package com.babylonhealth.lit.core.model

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
import com.babylonhealth.lit.core.UnionAliases._
import com.babylonhealth.lit.core.RELATED_ARTIFACT_TYPE
import com.babylonhealth.lit.{ core }
import com.babylonhealth.lit.macros.POJOBoilerplate

object RelatedArtifact extends CompanionFor[RelatedArtifact] {
  override val baseType: CompanionFor[RelatedArtifact] = RelatedArtifact
  def apply(
      id: Option[String] = None,
      url: Option[UrlStr] = None,
      `type`: RELATED_ARTIFACT_TYPE,
      label: Option[String] = None,
      display: Option[String] = None,
      citation: Option[Markdown] = None,
      document: Option[Attachment] = None,
      resource: Option[Canonical] = None,
      extension: LitSeq[Extension] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): RelatedArtifact = new RelatedArtifact(
    id,
    url,
    `type`,
    label,
    display,
    citation,
    document,
    resource,
    extension,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val url: FHIRComponentFieldMeta[Option[UrlStr]] =
    FHIRComponentFieldMeta("url", lTagOf[Option[UrlStr]], false, lTagOf[UrlStr])
  val `type`: FHIRComponentFieldMeta[RELATED_ARTIFACT_TYPE] =
    FHIRComponentFieldMeta("type", lTagOf[RELATED_ARTIFACT_TYPE], false, lTagOf[RELATED_ARTIFACT_TYPE])
  val label: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("label", lTagOf[Option[String]], false, lTagOf[String])
  val display: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("display", lTagOf[Option[String]], false, lTagOf[String])
  val citation: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("citation", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val document: FHIRComponentFieldMeta[Option[Attachment]] =
    FHIRComponentFieldMeta("document", lTagOf[Option[Attachment]], false, lTagOf[Attachment])
  val resource: FHIRComponentFieldMeta[Option[Canonical]] =
    FHIRComponentFieldMeta("resource", lTagOf[Option[Canonical]], false, lTagOf[Canonical])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
    Seq(id, url, `type`, label, display, citation, document, resource, extension)
  override def fields(t: RelatedArtifact): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[UrlStr]](url, t.url),
    FHIRComponentField[RELATED_ARTIFACT_TYPE](`type`, t.`type`),
    FHIRComponentField[Option[String]](label, t.label),
    FHIRComponentField[Option[String]](display, t.display),
    FHIRComponentField[Option[Markdown]](citation, t.citation),
    FHIRComponentField[Option[Attachment]](document, t.document),
    FHIRComponentField[Option[Canonical]](resource, t.resource),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension)
  )
  def extractId(t: RelatedArtifact): Option[String]           = t.id
  def extractUrl(t: RelatedArtifact): Option[UrlStr]          = t.url
  def extractType(t: RelatedArtifact): RELATED_ARTIFACT_TYPE  = t.`type`
  def extractLabel(t: RelatedArtifact): Option[String]        = t.label
  def extractDisplay(t: RelatedArtifact): Option[String]      = t.display
  def extractCitation(t: RelatedArtifact): Option[Markdown]   = t.citation
  def extractDocument(t: RelatedArtifact): Option[Attachment] = t.document
  def extractResource(t: RelatedArtifact): Option[Canonical]  = t.resource
  def extractExtension(t: RelatedArtifact): LitSeq[Extension] = t.extension
  override val thisName: String                               = "RelatedArtifact"
  def unapply(
      o: RelatedArtifact): Option[(Option[String], Option[UrlStr], RELATED_ARTIFACT_TYPE, Option[String], Option[String], Option[Markdown], Option[Attachment], Option[Canonical], LitSeq[Extension])] =
    Some((o.id, o.url, o.`type`, o.label, o.display, o.citation, o.document, o.resource, o.extension))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[RelatedArtifact] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new RelatedArtifact(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[UrlStr]]("url", Some(None)),
          cursor.decodeAs[RELATED_ARTIFACT_TYPE]("type", None),
          cursor.decodeAs[Option[String]]("label", Some(None)),
          cursor.decodeAs[Option[String]]("display", Some(None)),
          cursor.decodeAs[Option[Markdown]]("citation", Some(None)),
          cursor.decodeAs[Option[Attachment]]("document", Some(None)),
          cursor.decodeAs[Option[Canonical]]("resource", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for RelatedArtifact Type: Related artifacts such as additional documentation, justification, or bibliographic references.
  *
  *  Subclass of [[core.model.Element]] (Base StructureDefinition for Element Type: Base definition for all elements in a resource.)
  *
  * @constructor Introduces the fields url, `type`, label, display, citation, document, resource.
  * @param id - Unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces.
  * @param url - A url for the artifact that can be followed to access the actual content.
  * @param `type` - The type of relationship to the related artifact.
  * @param label - A short label that can be used to reference the citation from elsewhere in the containing artifact, such as a footnote index.
  * @param display - A brief description of the document or knowledge resource being referenced, suitable for display to a consumer.
  * @param citation - A bibliographic citation for the related artifact. This text SHOULD be formatted according to an accepted citation format.
  * @param document - The document being referenced, represented as an attachment. This is exclusive with the resource element.
  * @param resource - The related resource, such as a library, value set, profile, or other knowledge resource.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the element. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  */
@POJOBoilerplate
class RelatedArtifact(
    override val id: Option[String] = None,
    val url: Option[UrlStr] = None,
    val `type`: RELATED_ARTIFACT_TYPE,
    val label: Option[String] = None,
    val display: Option[String] = None,
    val citation: Option[Markdown] = None,
    val document: Option[Attachment] = None,
    val resource: Option[Canonical] = None,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Element(id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "RelatedArtifact"
}
