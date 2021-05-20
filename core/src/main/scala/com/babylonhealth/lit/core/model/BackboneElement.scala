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
object BackboneElement extends CompanionFor[BackboneElement] {
  implicit def summonObjectAndCompanionBackboneElement181748668(
      o: BackboneElement): ObjectAndCompanion[BackboneElement, BackboneElement.type] = ObjectAndCompanion(o, this)
  override type ResourceType = BackboneElement
  override type ParentType   = BackboneElement
  override val baseType: CompanionFor[ResourceType] = BackboneElement
  override val parentType: CompanionFor[ParentType] = BackboneElement
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/BackboneElement")
  def apply(
=======
object BackboneElement extends CompanionFor[BackboneElement[_]] {
  override type ResourceType[T] = BackboneElement[T]
  override val baseType: CompanionFor[ResourceType[_]] = BackboneElement
  override val profileUrl: Option[String]              = Some("http://hl7.org/fhir/StructureDefinition/BackboneElement")
  def apply[Stage <: LifecycleStage: ValueOf](
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
      id: Option[String] = None,
      extension: LitSeq[Extension[Stage]] = LitSeq.empty,
      modifierExtension: LitSeq[Extension[Stage]] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): BackboneElement[Stage] = new BackboneElement[Stage](
    id,
    extension,
    modifierExtension,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])

  def extension[Stage <: LifecycleStage: ValueOf]: FHIRComponentFieldMeta[LitSeq[Extension[Stage]]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension[Stage]]], false, lTagOf[Extension[Stage]])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension[_]]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension[_]]], false, lTagOf[Extension[_]])
  def fieldsMeta[Stage <: LifecycleStage: ValueOf]: Seq[FHIRComponentFieldMeta[_]] =
    Seq(id, extension, modifierExtension)
  override def fieldsFromParent[Stage <: LifecycleStage: ValueOf](
      t: ResourceType[Stage]): Try[Seq[FHIRComponentField[Stage, _]]] = Success(fields[Stage](t))
  override def fields[Stage <: LifecycleStage: ValueOf](t: BackboneElement[Stage]): Seq[FHIRComponentField[Stage, _]] =
    Seq(
      FHIRComponentField[Stage, Option[String]](id, t.id),
      FHIRComponentField[Stage, LitSeq[Extension[Stage]]](extension, t.extension),
      FHIRComponentField[Stage, LitSeq[Extension[Stage]]](modifierExtension, t.modifierExtension)
    )
  def extractId(t: BackboneElement[_]): Option[String]                                     = t.id
  def extractExtension[Stage](t: BackboneElement[Stage]): LitSeq[Extension[Stage]]         = t.extension
  def extractModifierExtension[Stage](t: BackboneElement[Stage]): LitSeq[Extension[Stage]] = t.modifierExtension
  override val thisName: String                                                            = "BackboneElement"
  def unapply[Stage <: LifecycleStage: ValueOf](
      o: BackboneElement[Stage]): Option[(Option[String], LitSeq[Extension[Stage]], LitSeq[Extension[Stage]])] = Some(
    (o.id, o.extension, o.modifierExtension))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[BackboneElement[Completed.type]] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new BackboneElement(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[LitSeq[Extension[Completed.type]]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension[Completed.type]]]("modifierExtension", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for BackboneElement Type: Base definition for all elements that are defined inside a resource - but
  * not those in a data type.
  *
  * Subclass of [[core.model.Element]] (Base StructureDefinition for Element Type: Base definition for all elements in a
  * resource.)
  *
  * @constructor
  *   Introduces the fields modifierExtension.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *   spaces.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the element. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the element and that modifies
  *   the understanding of the element in which it is contained and/or the understanding of the containing element's descendants.
  *   Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *   strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  */
@POJOBoilerplate
class BackboneElement[Stage <: LifecycleStage: ValueOf](
    override val id: Option[String] = None,
    override val extension: LitSeq[Extension[Stage]] = LitSeq.empty,
    val modifierExtension: LitSeq[Extension[Stage]] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Element[Stage](id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "BackboneElement"
}
