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
      id: Option[String] = None,
      code: Coding,
      value: UsageContext.ValueChoice,
      extension: LitSeq[Extension] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): UsageContext = new UsageContext(
    id,
    code,
    value,
    extension,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
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
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new UsageContext(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Coding]("code", None),
          cursor.decodeRef[Union_1548929031]("value"),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
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
  *   - A value that defines the context specified in this context of use. The interpretation of the value is defined by the
  *   code.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the element. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  */
@POJOBoilerplate
class UsageContext(
    override val id: Option[String] = None,
    val code: Coding,
    val value: UsageContext.ValueChoice,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Element(id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "UsageContext"
}
