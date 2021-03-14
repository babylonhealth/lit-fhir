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
import com.babylonhealth.lit.core.TRIGGER_TYPE
import com.babylonhealth.lit.{ core }
import com.babylonhealth.lit.macros.POJOBoilerplate

object TriggerDefinition extends CompanionFor[TriggerDefinition] {
  override val baseType: CompanionFor[TriggerDefinition] = TriggerDefinition
  type TimingChoice = Choice[Union_1051729086]
  def apply(
      id: Option[String] = None,
      `type`: TRIGGER_TYPE,
      name: Option[String] = None,
      data: LitSeq[DataRequirement] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      timing: Option[TriggerDefinition.TimingChoice] = None,
      condition: Option[Expression] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): TriggerDefinition = new TriggerDefinition(
    id,
    `type`,
    name,
    data,
    extension,
    timing,
    condition,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val `type`: FHIRComponentFieldMeta[TRIGGER_TYPE] =
    FHIRComponentFieldMeta("type", lTagOf[TRIGGER_TYPE], false, lTagOf[TRIGGER_TYPE])
  val name: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("name", lTagOf[Option[String]], false, lTagOf[String])
  val data: FHIRComponentFieldMeta[LitSeq[DataRequirement]] =
    FHIRComponentFieldMeta("data", lTagOf[LitSeq[DataRequirement]], false, lTagOf[DataRequirement])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val timing: FHIRComponentFieldMeta[Option[TriggerDefinition.TimingChoice]] =
    FHIRComponentFieldMeta("timing", lTagOf[Option[TriggerDefinition.TimingChoice]], true, lTagOf[Union_1051729086])
  val condition: FHIRComponentFieldMeta[Option[Expression]] =
    FHIRComponentFieldMeta("condition", lTagOf[Option[Expression]], false, lTagOf[Expression])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, `type`, name, data, extension, timing, condition)
  override def fields(t: TriggerDefinition): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[TRIGGER_TYPE](`type`, t.`type`),
    FHIRComponentField[Option[String]](name, t.name),
    FHIRComponentField[LitSeq[DataRequirement]](data, t.data),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[TriggerDefinition.TimingChoice]](timing, t.timing),
    FHIRComponentField[Option[Expression]](condition, t.condition)
  )
  def extractId(t: TriggerDefinition): Option[String]                             = t.id
  def extractType(t: TriggerDefinition): TRIGGER_TYPE                             = t.`type`
  def extractName(t: TriggerDefinition): Option[String]                           = t.name
  def extractData(t: TriggerDefinition): LitSeq[DataRequirement]                  = t.data
  def extractExtension(t: TriggerDefinition): LitSeq[Extension]                   = t.extension
  def extractTiming(t: TriggerDefinition): Option[TriggerDefinition.TimingChoice] = t.timing
  def extractCondition(t: TriggerDefinition): Option[Expression]                  = t.condition
  override val thisName: String                                                   = "TriggerDefinition"
  def unapply(
      o: TriggerDefinition): Option[(Option[String], TRIGGER_TYPE, Option[String], LitSeq[DataRequirement], LitSeq[Extension], Option[TriggerDefinition.TimingChoice], Option[Expression])] =
    Some((o.id, o.`type`, o.name, o.data, o.extension, o.timing, o.condition))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[TriggerDefinition] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new TriggerDefinition(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[TRIGGER_TYPE]("type", None),
          cursor.decodeAs[Option[String]]("name", Some(None)),
          cursor.decodeAs[LitSeq[DataRequirement]]("data", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeOptRef[Union_1051729086]("timing"),
          cursor.decodeAs[Option[Expression]]("condition", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for TriggerDefinition Type: A description of a triggering event. Triggering events can be named events, data events, or periodic, as determined by the type element.
  *
  *  Subclass of [[core.model.Element]] (Base StructureDefinition for Element Type: Base definition for all elements in a resource.)
  *
  * @constructor Introduces the fields `type`, name, data, timing, condition.
  * @param id - Unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces.
  * @param `type` - The type of triggering event.
  * @param name - A formal name for the event. This may be an absolute URI that identifies the event formally (e.g. from a trigger registry), or a simple relative URI that identifies the event in a local context.
  * @param data - The triggering data of the event (if this is a data trigger). If more than one data is requirement is specified, then all the data requirements must be true.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the element. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param timing - The timing of the event (if this is a periodic trigger).
  * @param condition - A boolean-valued expression that is evaluated in the context of the container of the trigger definition and returns whether or not the trigger fires.
  */
@POJOBoilerplate
class TriggerDefinition(
    override val id: Option[String] = None,
    val `type`: TRIGGER_TYPE,
    val name: Option[String] = None,
    val data: LitSeq[DataRequirement] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val timing: Option[TriggerDefinition.TimingChoice] = None,
    val condition: Option[Expression] = None,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Element(id = id, extension = extension, primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "TriggerDefinition"
}
