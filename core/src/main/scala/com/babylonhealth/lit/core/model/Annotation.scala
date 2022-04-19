package com.babylonhealth.lit.core.model

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
import com.babylonhealth.lit.core.UnionAliases._

import com.babylonhealth.lit.{ core }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Annotation extends CompanionFor[Annotation] {
  implicit def summonObjectAndCompanionAnnotation_899367708(o: Annotation): ObjectAndCompanion[Annotation, Annotation.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Annotation
  override type ParentType   = Annotation
  override val baseType: CompanionFor[ResourceType] = Annotation
  override val parentType: CompanionFor[ParentType] = Annotation
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Annotation")
  type AuthorChoice = Choice[UnionReferenceOrString]
  def apply(
      id: Option[String] = None,
      time: Option[FHIRDateTime] = None,
      text: Markdown,
      extension: LitSeq[Extension] = LitSeq.empty,
      author: Option[Annotation.AuthorChoice] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Annotation = new Annotation(
    id,
    time,
    text,
    extension,
    author,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val time: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("time", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val text: FHIRComponentFieldMeta[Markdown] =
    FHIRComponentFieldMeta("text", lTagOf[Markdown], false, lTagOf[Markdown])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val author: FHIRComponentFieldMeta[Option[Annotation.AuthorChoice]] =
    FHIRComponentFieldMeta("author", lTagOf[Option[Annotation.AuthorChoice]], true, lTagOf[UnionReferenceOrString])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, time, text, extension, author)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Annotation): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[FHIRDateTime]](time, t.time),
    FHIRComponentField[Markdown](text, t.text),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Annotation.AuthorChoice]](author, t.author)
  )
  def extractId(t: Annotation): Option[String]                      = t.id
  def extractTime(t: Annotation): Option[FHIRDateTime]              = t.time
  def extractText(t: Annotation): Markdown                          = t.text
  def extractExtension(t: Annotation): LitSeq[Extension]            = t.extension
  def extractAuthor(t: Annotation): Option[Annotation.AuthorChoice] = t.author
  override val thisName: String                                     = "Annotation"
  def unapply(
      o: Annotation): Option[(Option[String], Option[FHIRDateTime], Markdown, LitSeq[Extension], Option[Annotation.AuthorChoice])] =
    Some((o.id, o.time, o.text, o.extension, o.author))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Annotation] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Annotation(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("time", Some(None)),
          cursor.decodeAs[Markdown]("text", None),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeOptRef[UnionReferenceOrString]("author"),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for Annotation Type: A text note which also contains information about who made the statement and
  * when.
  *
  * Subclass of [[core.model.Element]] (Base StructureDefinition for Element Type: Base definition for all elements in a
  * resource.)
  *
  * @constructor
  *   Introduces the fields time, text, author.
  * @param id
  *   \- Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *   spaces.
  * @param time
  *   \- Indicates when this particular annotation was made.
  * @param text
  *   \- The text of the annotation in markdown format.
  * @param extension
  *   \- May be used to represent additional information that is not part of the basic definition of the element. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param author
  *   \- The individual responsible for making the annotation.
  */
@POJOBoilerplate
class Annotation(
    override val id: Option[String] = None,
    val time: Option[FHIRDateTime] = None,
    val text: Markdown,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val author: Option[Annotation.AuthorChoice] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Element(id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Annotation"
}
