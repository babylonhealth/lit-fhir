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
object UsageContext extends CompanionFor[UsageContext] {
  implicit def summonObjectAndCompanionUsageContext_348708541(
      o: UsageContext): ObjectAndCompanion[UsageContext, UsageContext.type] = ObjectAndCompanion(o, this)
  override type ResourceType = UsageContext
  override type ParentType   = UsageContext
  override val baseType: CompanionFor[ResourceType] = UsageContext
  override val parentType: CompanionFor[ParentType] = UsageContext
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/UsageContext")
  type ValueChoice = Choice[Union_1548929031]
  def apply(
=======
object UsageContext extends CompanionFor[UsageContext[_]] {
  override type ResourceType[T] = UsageContext[T]
  override val baseType: CompanionFor[ResourceType[_]] = UsageContext
  override val profileUrl: Option[String]              = Some("http://hl7.org/fhir/StructureDefinition/UsageContext")
  type ValueChoice[Stage] = Choice[Union_0119127717[Stage]]
  def apply[Stage <: LifecycleStage: ValueOf](
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
      id: Option[String] = None,
      code: Coding[Stage],
      value: UsageContext.ValueChoice[Stage],
      extension: LitSeq[Extension[Stage]] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): UsageContext[Stage] = new UsageContext[Stage](
    id,
    code,
    value,
    extension,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
<<<<<<< HEAD
  val code: FHIRComponentFieldMeta[Coding] =
    FHIRComponentFieldMeta("code", lTagOf[Coding], false, lTagOf[Coding])
  val value: FHIRComponentFieldMeta[UsageContext.ValueChoice] =
    FHIRComponentFieldMeta("value", lTagOf[UsageContext.ValueChoice], true, lTagOf[Union_1548929031])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, code, value, extension)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: UsageContext): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Coding](code, t.code),
    FHIRComponentField[UsageContext.ValueChoice](value, t.value),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension)
  )
  def extractId(t: UsageContext): Option[String]              = t.id
  def extractCode(t: UsageContext): Coding                    = t.code
  def extractValue(t: UsageContext): UsageContext.ValueChoice = t.value
  def extractExtension(t: UsageContext): LitSeq[Extension]    = t.extension
  override val thisName: String                               = "UsageContext"
  def unapply(o: UsageContext): Option[(Option[String], Coding, UsageContext.ValueChoice, LitSeq[Extension])] = Some(
    (o.id, o.code, o.value, o.extension))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[UsageContext] =
=======
  def code[Stage]: FHIRComponentFieldMeta[Coding[Stage]] =
    FHIRComponentFieldMeta("code", lTagOf[Coding[Stage]], false, lTagOf[Coding[Stage]])
  def value[Stage]: FHIRComponentFieldMeta[UsageContext.ValueChoice[Stage]] =
    FHIRComponentFieldMeta("value", lTagOf[UsageContext.ValueChoice[Stage]], true, lTagOf[Union_0119127717[Stage]])
  def extension[Stage]: FHIRComponentFieldMeta[LitSeq[Extension[Stage]]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension[Stage]]], false, lTagOf[Extension[Stage]])
  def fieldsMeta[Stage <: LifecycleStage: ValueOf]: Seq[FHIRComponentFieldMeta[_]] = Seq(id, code, value, extension)
  override def fieldsFromParent[Stage <: LifecycleStage: ValueOf](
      t: ResourceType[Stage]): Try[Seq[FHIRComponentField[Stage, _]]] = Success(fields[Stage](t))
  override def fields[Stage <: LifecycleStage: ValueOf](t: UsageContext[Stage]): Seq[FHIRComponentField[Stage, _]] =
    Seq(
      FHIRComponentField[Stage, Option[String]](id, t.id),
      FHIRComponentField[Stage, Coding[Stage]](code, t.code),
      FHIRComponentField[Stage, UsageContext.ValueChoice[Stage]](value, t.value),
      FHIRComponentField[Stage, LitSeq[Extension[Stage]]](extension, t.extension)
    )
  def extractId(t: UsageContext[_]): Option[String]                                = t.id
  def extractCode[Stage](t: UsageContext[Stage]): Coding[Stage]                    = t.code
  def extractValue[Stage](t: UsageContext[Stage]): UsageContext.ValueChoice[Stage] = t.value
  def extractExtension[Stage](t: UsageContext[Stage]): LitSeq[Extension[Stage]]    = t.extension
  override val thisName: String                                                    = "UsageContext"
  def unapply[Stage <: LifecycleStage: ValueOf](
      o: UsageContext[
        Stage]): Option[(Option[String], Coding[Stage], UsageContext.ValueChoice[Stage], LitSeq[Extension[Stage]])] =
    Some((o.id, o.code, o.value, o.extension))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[UsageContext[Completed.type]] =
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new UsageContext(
          cursor.decodeAs[Option[String]]("id", Some(None)),
<<<<<<< HEAD
          cursor.decodeAs[Coding]("code", None),
          cursor.decodeRef[Union_1548929031]("value"),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
=======
          cursor.decodeAs[Coding[Completed.type]]("code", None),
          cursor.decodeRef[Union_0119127717[Completed.type]]("value"),
          cursor.decodeAs[LitSeq[Extension[Completed.type]]]("extension", Some(LitSeq.empty)),
>>>>>>> 1bcce413 (experimentations with a type param on the fhir classes to denote partial objects)
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for UsageContext Type: Specifies clinical/business/etc. metadata that can be used to retrieve, index
  * and/or categorize an artifact. This metadata can either be specific to the applicable population (e.g., age category, DRG) or
  * the specific context of care (e.g., venue, care setting, provider of care).
  *
  * Subclass of [[core.model.Element]] (Base StructureDefinition for Element Type: Base definition for all elements in a
  * resource.)
  *
  * @constructor
  *   Introduces the fields code, value.
  * @param id
  *   - Unique id for the element within a resource (for internal references). This may be any string value that does not contain
  *   spaces.
  * @param code
  *   - A code that identifies the type of context being specified by this usage context.
  * @param value
  *   - A value that defines the context specified in this context of use. The interpretation of the value is defined by the code.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the element. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  */
@POJOBoilerplate
class UsageContext[Stage <: LifecycleStage: ValueOf](
    override val id: Option[String] = None,
    val code: Coding[Stage],
    val value: UsageContext.ValueChoice[Stage],
    override val extension: LitSeq[Extension[Stage]] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Element[Stage](id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "UsageContext"
}
