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
object Element extends CompanionFor[Element] {
  implicit def summonObjectAndCompanionElement1981657447(o: Element): ObjectAndCompanion[Element, Element.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = Element
  override type ParentType   = Element
  override val baseType: CompanionFor[ResourceType] = Element
  override val parentType: CompanionFor[ParentType] = Element
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Element")
  def apply(
=======
object Element extends CompanionFor[Element[_]] {
  override type ResourceType[Stage] = Element[Stage]
  override val baseType: CompanionFor[ResourceType[_]] = Element
  override val profileUrl: Option[String]              = Some("http://hl7.org/fhir/StructureDefinition/Element")
  def apply[Stage <: LifecycleStage: ValueOf](
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
      id: Option[String] = None,
      extension: LitSeq[Extension[Stage]] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Element[Stage] = new Element[Stage](
    id,
    extension,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  def extension[Stage <: LifecycleStage: ValueOf]: FHIRComponentFieldMeta[LitSeq[Extension[Stage]]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension[Stage]]], false, lTagOf[Extension[Stage]])
  def fieldsMeta[Stage <: LifecycleStage: ValueOf]: Seq[FHIRComponentFieldMeta[_]] = Seq(id, extension)
  override def fieldsFromParent[Stage <: LifecycleStage: ValueOf](
      t: ResourceType[Stage]): Try[Seq[FHIRComponentField[Stage, _]]] =
    Success(fields[Stage](t))
  override def fields[Stage <: LifecycleStage: ValueOf](t: ResourceType[Stage]): Seq[FHIRComponentField[Stage, _]] =
    Seq(
      FHIRComponentField[Stage, Option[String]](id, t.id),
      FHIRComponentField[Stage, LitSeq[Extension[Stage]]](extension, t.extension)
    )
  def extractId(t: Element[_]): Option[String]                                                        = t.id
  def extractExtension[Stage <: LifecycleStage: ValueOf](t: Element[Stage]): LitSeq[Extension[Stage]] = t.extension
  override val thisName: String                                                                       = "Element"
  def unapply[Stage <: LifecycleStage: ValueOf](o: Element[Stage]): Option[(Option[String], LitSeq[Extension[Stage]])] =
    Some((o.id, o.extension))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Element[Completed.type]] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Element(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[LitSeq[Extension[Completed.type]]]("extension", Some(LitSeq.empty)),
          decodeAttributes(cursor))
      ))
}

/** Base StructureDefinition for Element Type: Base definition for all elements in a resource.
  *
  * @constructor
  *   Introduces the fields id, extension.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *   spaces.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the element. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  */
@POJOBoilerplate
class Element[Stage <: LifecycleStage: ValueOf](
    val id: Option[String] = None,
    val extension: LitSeq[Extension[Stage]] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends FHIRObjectRaw(valueOf[Stage], primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "Element"
}
