package com.babylonhealth.lit.hl7.model

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
import com.babylonhealth.lit.hl7.model._
import com.babylonhealth.lit.core.UnionAliases._
import com.babylonhealth.lit.hl7.UnionAliases._
import com.babylonhealth.lit.hl7.{
  METRIC_CATEGORY,
  METRIC_COLOR,
  METRIC_CALIBRATION_STATE,
  METRIC_CALIBRATION_TYPE,
  METRIC_OPERATIONAL_STATUS
}
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object DeviceMetric extends CompanionFor[DeviceMetric] {
  implicit def summonObjectAndCompanionDeviceMetric1925619739(
      o: DeviceMetric): ObjectAndCompanion[DeviceMetric, DeviceMetric.type] = ObjectAndCompanion(o, this)
  override type ResourceType = DeviceMetric
  override type ParentType   = DeviceMetric
  override val baseType: CompanionFor[ResourceType] = DeviceMetric
  override val parentType: CompanionFor[ParentType] = DeviceMetric
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/DeviceMetric")
  object Calibration extends CompanionFor[Calibration] {
    implicit def summonObjectAndCompanionCalibration_1898612852(
        o: Calibration): ObjectAndCompanion[Calibration, Calibration.type] = ObjectAndCompanion(o, this)
    override type ResourceType = Calibration
    override type ParentType   = Calibration
    override val parentType: CompanionFor[ResourceType] = Calibration
    def apply(
        id: Option[String] = None,
        `type`: Option[METRIC_CALIBRATION_TYPE] = None,
        time: Option[ZonedDateTime] = None,
        state: Option[METRIC_CALIBRATION_STATE] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Calibration = new Calibration(
      id,
      `type`,
      time,
      state,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Calibration): Option[(Option[String], Option[METRIC_CALIBRATION_TYPE], Option[ZonedDateTime], Option[METRIC_CALIBRATION_STATE], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.`type`, o.time, o.state, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[Option[METRIC_CALIBRATION_TYPE]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[METRIC_CALIBRATION_TYPE]], false, lTagOf[METRIC_CALIBRATION_TYPE])
    val time: FHIRComponentFieldMeta[Option[ZonedDateTime]] =
      FHIRComponentFieldMeta("time", lTagOf[Option[ZonedDateTime]], false, lTagOf[ZonedDateTime])
    val state: FHIRComponentFieldMeta[Option[METRIC_CALIBRATION_STATE]] =
      FHIRComponentFieldMeta("state", lTagOf[Option[METRIC_CALIBRATION_STATE]], false, lTagOf[METRIC_CALIBRATION_STATE])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, `type`, time, state, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Calibration): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[METRIC_CALIBRATION_TYPE]](`type`, t.`type`),
      FHIRComponentField[Option[ZonedDateTime]](time, t.time),
      FHIRComponentField[Option[METRIC_CALIBRATION_STATE]](state, t.state),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Calibration] = this
    val thisName: String                    = "Calibration"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Calibration] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Calibration(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[METRIC_CALIBRATION_TYPE]]("type", Some(None)),
            cursor.decodeAs[Option[ZonedDateTime]]("time", Some(None)),
            cursor.decodeAs[Option[METRIC_CALIBRATION_STATE]]("state", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Calibration(
      override val id: Option[String] = None,
      val `type`: Option[METRIC_CALIBRATION_TYPE] = None,
      val time: Option[ZonedDateTime] = None,
      val state: Option[METRIC_CALIBRATION_STATE] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      `type`: CodeableConcept,
      unit: Option[CodeableConcept] = None,
      color: Option[METRIC_COLOR] = None,
      source: Option[Reference] = None,
      parent: Option[Reference] = None,
      language: Option[LANGUAGES] = None,
      category: METRIC_CATEGORY,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      operationalStatus: Option[METRIC_OPERATIONAL_STATUS] = None,
      measurementPeriod: Option[Timing] = None,
      calibration: LitSeq[DeviceMetric.Calibration] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): DeviceMetric = new DeviceMetric(
    id,
    meta,
    text,
    `type`,
    unit,
    color,
    source,
    parent,
    language,
    category,
    contained,
    extension,
    identifier,
    implicitRules,
    modifierExtension,
    operationalStatus,
    measurementPeriod,
    calibration,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val `type`: FHIRComponentFieldMeta[CodeableConcept] =
    FHIRComponentFieldMeta("type", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
  val unit: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("unit", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val color: FHIRComponentFieldMeta[Option[METRIC_COLOR]] =
    FHIRComponentFieldMeta("color", lTagOf[Option[METRIC_COLOR]], false, lTagOf[METRIC_COLOR])
  val source: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("source", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val parent: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("parent", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val category: FHIRComponentFieldMeta[METRIC_CATEGORY] =
    FHIRComponentFieldMeta("category", lTagOf[METRIC_CATEGORY], false, lTagOf[METRIC_CATEGORY])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val operationalStatus: FHIRComponentFieldMeta[Option[METRIC_OPERATIONAL_STATUS]] =
    FHIRComponentFieldMeta(
      "operationalStatus",
      lTagOf[Option[METRIC_OPERATIONAL_STATUS]],
      false,
      lTagOf[METRIC_OPERATIONAL_STATUS])
  val measurementPeriod: FHIRComponentFieldMeta[Option[Timing]] =
    FHIRComponentFieldMeta("measurementPeriod", lTagOf[Option[Timing]], false, lTagOf[Timing])
  val calibration: FHIRComponentFieldMeta[LitSeq[DeviceMetric.Calibration]] =
    FHIRComponentFieldMeta("calibration", lTagOf[LitSeq[DeviceMetric.Calibration]], false, lTagOf[DeviceMetric.Calibration])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    `type`,
    unit,
    color,
    source,
    parent,
    language,
    category,
    contained,
    extension,
    identifier,
    implicitRules,
    modifierExtension,
    operationalStatus,
    measurementPeriod,
    calibration
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: DeviceMetric): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[CodeableConcept](`type`, t.`type`),
    FHIRComponentField[Option[CodeableConcept]](unit, t.unit),
    FHIRComponentField[Option[METRIC_COLOR]](color, t.color),
    FHIRComponentField[Option[Reference]](source, t.source),
    FHIRComponentField[Option[Reference]](parent, t.parent),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[METRIC_CATEGORY](category, t.category),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Option[METRIC_OPERATIONAL_STATUS]](operationalStatus, t.operationalStatus),
    FHIRComponentField[Option[Timing]](measurementPeriod, t.measurementPeriod),
    FHIRComponentField[LitSeq[DeviceMetric.Calibration]](calibration, t.calibration)
  )
  def extractId(t: DeviceMetric): Option[String]                                   = t.id
  def extractMeta(t: DeviceMetric): Option[Meta]                                   = t.meta
  def extractText(t: DeviceMetric): Option[Narrative]                              = t.text
  def extractType(t: DeviceMetric): CodeableConcept                                = t.`type`
  def extractUnit(t: DeviceMetric): Option[CodeableConcept]                        = t.unit
  def extractColor(t: DeviceMetric): Option[METRIC_COLOR]                          = t.color
  def extractSource(t: DeviceMetric): Option[Reference]                            = t.source
  def extractParent(t: DeviceMetric): Option[Reference]                            = t.parent
  def extractLanguage(t: DeviceMetric): Option[LANGUAGES]                          = t.language
  def extractCategory(t: DeviceMetric): METRIC_CATEGORY                            = t.category
  def extractContained(t: DeviceMetric): LitSeq[Resource]                          = t.contained
  def extractExtension(t: DeviceMetric): LitSeq[Extension]                         = t.extension
  def extractIdentifier(t: DeviceMetric): LitSeq[Identifier]                       = t.identifier
  def extractImplicitRules(t: DeviceMetric): Option[UriStr]                        = t.implicitRules
  def extractModifierExtension(t: DeviceMetric): LitSeq[Extension]                 = t.modifierExtension
  def extractOperationalStatus(t: DeviceMetric): Option[METRIC_OPERATIONAL_STATUS] = t.operationalStatus
  def extractMeasurementPeriod(t: DeviceMetric): Option[Timing]                    = t.measurementPeriod
  def extractCalibration(t: DeviceMetric): LitSeq[DeviceMetric.Calibration]        = t.calibration
  override val thisName: String                                                    = "DeviceMetric"
  override val searchParams: Map[String, DeviceMetric => Seq[Any]] = Map(
    "parent"     -> (obj => obj.parent.toSeq),
    "source"     -> (obj => obj.source.toSeq),
    "identifier" -> (obj => obj.identifier.toSeq),
    "category"   -> (obj => Seq(obj.category)),
    "type"       -> (obj => Seq(obj.`type`))
  )
  def unapply(
      o: DeviceMetric): Option[(Option[String], Option[Meta], Option[Narrative], CodeableConcept, Option[CodeableConcept], Option[METRIC_COLOR], Option[Reference], Option[Reference], Option[LANGUAGES], METRIC_CATEGORY, LitSeq[Resource], LitSeq[Extension], LitSeq[Identifier], Option[UriStr], LitSeq[Extension], Option[METRIC_OPERATIONAL_STATUS], Option[Timing], LitSeq[DeviceMetric.Calibration])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.`type`,
        o.unit,
        o.color,
        o.source,
        o.parent,
        o.language,
        o.category,
        o.contained,
        o.extension,
        o.identifier,
        o.implicitRules,
        o.modifierExtension,
        o.operationalStatus,
        o.measurementPeriod,
        o.calibration))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[DeviceMetric] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new DeviceMetric(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[CodeableConcept]("type", None),
          cursor.decodeAs[Option[CodeableConcept]]("unit", Some(None)),
          cursor.decodeAs[Option[METRIC_COLOR]]("color", Some(None)),
          cursor.decodeAs[Option[Reference]]("source", Some(None)),
          cursor.decodeAs[Option[Reference]]("parent", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[METRIC_CATEGORY]("category", None),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[METRIC_OPERATIONAL_STATUS]]("operationalStatus", Some(None)),
          cursor.decodeAs[Option[Timing]]("measurementPeriod", Some(None)),
          cursor.decodeAs[LitSeq[DeviceMetric.Calibration]]("calibration", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Describes a measurement, calculation or setting capability of a medical device.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields `type`, unit, color, source, parent, category, identifier, operationalStatus, measurementPeriod,
  *   calibration.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *   not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *   resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to
  *   make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be
  *   represented in the narrative to ensure clinical safety.
  * @param `type`
  *   - Describes the type of the metric. For example: Heart Rate, PEEP Setting, etc.
  * @param unit
  *   - Describes the unit that an observed value determined for this metric will have. For example: Percent, Seconds, etc.
  * @param color
  *   - Describes the color representation for the metric. This is often used to aid clinicians to track and identify parameter
  *   types by color. In practice, consider a Patient Monitor that has ECG/HR and Pleth for example; the parameters are displayed
  *   in different characteristic colors, such as HR-blue, BP-green, and PR and SpO2- magenta.
  * @param source
  *   - Describes the link to the Device that this DeviceMetric belongs to and that contains administrative device information
  *   such as manufacturer, serial number, etc.
  * @param parent
  *   - Describes the link to the Device that this DeviceMetric belongs to and that provide information about the location of
  *   this DeviceMetric in the containment structure of the parent Device. An example would be a Device that represents a Channel.
  *   This reference can be used by a client application to distinguish DeviceMetrics that have the same type, but should be
  *   interpreted based on their containment location.
  * @param language
  *   - The base language in which the resource is written.
  * @param category
  *   - Indicates the category of the observation generation process. A DeviceMetric can be for example a setting, measurement,
  *   or calculation.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param identifier
  *   - Unique instance identifiers assigned to a device by the device or gateway software, manufacturers, other organizations or
  *   owners. For example: handle ID.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that
  *   modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *   Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *   strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *   extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *   processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any
  *   elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param operationalStatus
  *   - Indicates current operational state of the device. For example: On, Off, Standby, etc.
  * @param measurementPeriod
  *   - Describes the measurement repetition time. This is not necessarily the same as the update period. The measurement
  *   repetition time can range from milliseconds up to hours. An example for a measurement repetition time in the range of
  *   milliseconds is the sampling rate of an ECG. An example for a measurement repetition time in the range of hours is a NIBP
  *   that is triggered automatically every hour. The update period may be different than the measurement repetition time, if the
  *   device does not update the published observed value with the same frequency as it was measured.
  * @param calibration
  *   - Describes the calibrations that have been performed or that are required to be performed.
  */
@POJOBoilerplate
class DeviceMetric(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val `type`: CodeableConcept,
    val unit: Option[CodeableConcept] = None,
    val color: Option[METRIC_COLOR] = None,
    val source: Option[Reference] = None,
    val parent: Option[Reference] = None,
    override val language: Option[LANGUAGES] = None,
    val category: METRIC_CATEGORY,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val operationalStatus: Option[METRIC_OPERATIONAL_STATUS] = None,
    val measurementPeriod: Option[Timing] = None,
    val calibration: LitSeq[DeviceMetric.Calibration] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends DomainResource(
      id = id,
      meta = meta,
      text = text,
      language = language,
      contained = contained,
      extension = extension,
      implicitRules = implicitRules,
      modifierExtension = modifierExtension,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "DeviceMetric"
}
