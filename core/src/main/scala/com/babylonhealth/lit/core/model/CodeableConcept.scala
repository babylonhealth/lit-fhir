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
object CodeableConcept extends CompanionFor[CodeableConcept] {
  implicit def summonObjectAndCompanionCodeableConcept_170989812(
      o: CodeableConcept): ObjectAndCompanion[CodeableConcept, CodeableConcept.type] = ObjectAndCompanion(o, this)
  override type ResourceType = CodeableConcept
  override type ParentType   = CodeableConcept
  override val baseType: CompanionFor[ResourceType] = CodeableConcept
  override val parentType: CompanionFor[ParentType] = CodeableConcept
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/CodeableConcept")
  def apply(
=======
object CodeableConcept extends CompanionFor[CodeableConcept[_]] {
  override type ResourceType[T] = CodeableConcept[T]
  override val baseType: CompanionFor[ResourceType[_]] = CodeableConcept
  override val profileUrl: Option[String]              = Some("http://hl7.org/fhir/StructureDefinition/CodeableConcept")
  def apply[Stage <: LifecycleStage: ValueOf](
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
      id: Option[String] = None,
      text: Option[String] = None,
      coding: LitSeq[Coding[Stage]] = LitSeq.empty,
      extension: LitSeq[Extension[Stage]] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): CodeableConcept[Stage] = new CodeableConcept[Stage](
    id,
    text,
    coding,
    extension,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val text: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[String]], false, lTagOf[String])
  def coding[Stage]: FHIRComponentFieldMeta[LitSeq[Coding[Stage]]] =
    FHIRComponentFieldMeta("coding", lTagOf[LitSeq[Coding[_]]], false, lTagOf[Coding[_]])
  def extension[Stage]: FHIRComponentFieldMeta[LitSeq[Extension[Stage]]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension[Stage]]], false, lTagOf[Extension[Stage]])
  def fieldsMeta[Stage <: LifecycleStage: ValueOf]: Seq[FHIRComponentFieldMeta[_]] = Seq(id, text, coding, extension)
  override def fieldsFromParent[Stage <: LifecycleStage: ValueOf](
      t: ResourceType[Stage]): Try[Seq[FHIRComponentField[Stage, _]]] = Success(fields[Stage](t))
  override def fields[Stage <: LifecycleStage: ValueOf](t: CodeableConcept[Stage]): Seq[FHIRComponentField[Stage, _]] =
    Seq(
      FHIRComponentField[Stage, Option[String]](id, t.id),
      FHIRComponentField[Stage, Option[String]](text, t.text),
      FHIRComponentField[Stage, LitSeq[Coding[Stage]]](coding, t.coding),
      FHIRComponentField[Stage, LitSeq[Extension[Stage]]](extension, t.extension)
    )
  def extractId(t: CodeableConcept[_]): Option[String]                             = t.id
  def extractText(t: CodeableConcept[_]): Option[String]                           = t.text
  def extractCoding[Stage](t: CodeableConcept[Stage]): LitSeq[Coding[Stage]]       = t.coding
  def extractExtension[Stage](t: CodeableConcept[Stage]): LitSeq[Extension[Stage]] = t.extension
  override val thisName: String                                                    = "CodeableConcept"
  def unapply[Stage <: LifecycleStage: ValueOf](
      o: CodeableConcept[
        Stage]): Option[(Option[String], Option[String], LitSeq[Coding[Stage]], LitSeq[Extension[Stage]])] = Some(
    (o.id, o.text, o.coding, o.extension))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[CodeableConcept[Completed.type]] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new CodeableConcept(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[String]]("text", Some(None)),
          cursor.decodeAs[LitSeq[Coding[Completed.type]]]("coding", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension[Completed.type]]]("extension", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for CodeableConcept Type: A concept that may be defined by a formal reference to a terminology or
  * ontology or may be provided by text.
  *
  * Subclass of [[core.model.Element]] (Base StructureDefinition for Element Type: Base definition for all elements in a
  * resource.)
  *
  * @constructor
  *   Introduces the fields text, coding.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *   spaces.
  * @param text
  *   - A human language representation of the concept as seen/selected/uttered by the user who entered the data and/or which
  *   represents the intended meaning of the user.
  * @param coding
  *   - A reference to a code defined by a terminology system.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the element. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  */
@POJOBoilerplate
class CodeableConcept[Stage <: LifecycleStage: ValueOf](
    override val id: Option[String] = None,
    val text: Option[String] = None,
    val coding: LitSeq[Coding[Stage]] = LitSeq.empty,
    override val extension: LitSeq[Extension[Stage]] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Element[Stage](id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "CodeableConcept"
}
