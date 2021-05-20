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

<<<<<<< HEAD
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
=======
object Annotation extends CompanionFor[Annotation[_]] {
  override type ResourceType[T] = Annotation[T]
  override val baseType: CompanionFor[ResourceType[_]] = Annotation
  override val profileUrl: Option[String]              = Some("http://hl7.org/fhir/StructureDefinition/Annotation")
  type AuthorChoice[T] = Choice[Union_1128709984[T]]
  def apply[Stage <: LifecycleStage: ValueOf](
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
      id: Option[String] = None,
      time: Option[FHIRDateTime] = None,
      text: Markdown,
      extension: LitSeq[Extension[Stage]] = LitSeq.empty,
      author: Option[Annotation.AuthorChoice[Stage]] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Annotation[Stage] = new Annotation[Stage](
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
<<<<<<< HEAD
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
=======
  def extension[Stage <: LifecycleStage: ValueOf]: FHIRComponentFieldMeta[LitSeq[Extension[Stage]]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension[Stage]]], false, lTagOf[Extension[Stage]])
  def author[Stage <: LifecycleStage: ValueOf]: FHIRComponentFieldMeta[Option[Annotation.AuthorChoice[Stage]]] =
    FHIRComponentFieldMeta("author", lTagOf[Option[Annotation.AuthorChoice[_]]], true, lTagOf[Union_1128709984[_]])
  def fieldsMeta[Stage <: LifecycleStage: ValueOf]: Seq[FHIRComponentFieldMeta[_]] =
    Seq(id, time, text, extension, author)
  override def fieldsFromParent[Stage <: LifecycleStage: ValueOf](
      t: ResourceType[Stage]): Try[Seq[FHIRComponentField[Stage, _]]] = Success(fields[Stage](t))
  override def fields[Stage <: LifecycleStage: ValueOf](t: Annotation[Stage]): Seq[FHIRComponentField[Stage, _]] = Seq(
    FHIRComponentField[Stage, Option[String]](id, t.id),
    FHIRComponentField[Stage, Option[FHIRDateTime]](time, t.time),
    FHIRComponentField[Stage, Markdown](text, t.text),
    FHIRComponentField[Stage, LitSeq[Extension[Stage]]](extension, t.extension),
    FHIRComponentField[Stage, Option[Annotation.AuthorChoice[Stage]]](author, t.author)
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
  )
  def extractId(t: Annotation[_]): Option[String]                                        = t.id
  def extractTime(t: Annotation[_]): Option[FHIRDateTime]                                = t.time
  def extractText(t: Annotation[_]): Markdown                                            = t.text
  def extractExtension[Stage](t: Annotation[Stage]): LitSeq[Extension[Stage]]            = t.extension
  def extractAuthor[Stage](t: Annotation[Stage]): Option[Annotation.AuthorChoice[Stage]] = t.author
  override val thisName: String                                                          = "Annotation"
  def unapply[Stage <: LifecycleStage: ValueOf](o: Annotation[
    Stage]): Option[(Option[String], Option[FHIRDateTime], Markdown, LitSeq[Extension[Stage]], Option[Annotation.AuthorChoice[Stage]])] =
    Some((o.id, o.time, o.text, o.extension, o.author))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Annotation[Completed.type]] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Annotation[Completed.type](
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("time", Some(None)),
          cursor.decodeAs[Markdown]("text", None),
<<<<<<< HEAD
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeOptRef[UnionReferenceOrString]("author"),
=======
          cursor.decodeAs[LitSeq[Extension[Completed.type]]]("extension", Some(LitSeq.empty)),
          cursor.decodeOptRef[Union_1128709984[Completed.type]]("author"),
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
          decodeAttributes(cursor)
        )
      ))
}

<<<<<<< HEAD
/** Base StructureDefinition for Annotation Type: A text note which also contains information about who made the statement and
  * when.
=======
/** Base StructureDefinition for Annotation[Stage] Type: A  text note which also  contains information about who made the statement and when.
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
  *
  * Subclass of [[core.model.Element]] (Base StructureDefinition for Element Type: Base definition for all elements in a
  * resource.)
  *
  * @constructor
  *   Introduces the fields time, text, author.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *   spaces.
  * @param time
  *   - Indicates when this particular annotation was made.
  * @param text
  *   - The text of the annotation in markdown format.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the element. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param author
  *   - The individual responsible for making the annotation.
  */
@POJOBoilerplate
class Annotation[Stage <: LifecycleStage: ValueOf](
    override val id: Option[String] = None,
    val time: Option[FHIRDateTime] = None,
    val text: Markdown,
    override val extension: LitSeq[Extension[Stage]] = LitSeq.empty,
    val author: Option[Annotation.AuthorChoice[Stage]] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Element[Stage](id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Annotation"
}
