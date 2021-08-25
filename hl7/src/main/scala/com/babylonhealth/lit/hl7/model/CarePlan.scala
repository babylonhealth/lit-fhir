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
import com.babylonhealth.lit.hl7.{ CARE_PLAN_INTENT, CARE_PLAN_ACTIVITY_STATUS, REQUEST_STATUS, CARE_PLAN_ACTIVITY_KIND }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object CarePlan extends CompanionFor[CarePlan] {
  implicit def summonObjectAndCompanionCarePlan1302742223(o: CarePlan): ObjectAndCompanion[CarePlan, CarePlan.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = CarePlan
  override type ParentType   = CarePlan
  override val baseType: CompanionFor[ResourceType] = CarePlan
  override val parentType: CompanionFor[ParentType] = CarePlan
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/CarePlan")
  object Activity extends CompanionFor[Activity] {
    implicit def summonObjectAndCompanionActivity114416628(o: Activity): ObjectAndCompanion[Activity, Activity.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Activity
    override type ParentType   = Activity
    override val parentType: CompanionFor[ResourceType] = Activity
    object PlannedActivityDetail extends CompanionFor[PlannedActivityDetail] {
      implicit def summonObjectAndCompanionPlannedActivityDetail1169529944(
          o: PlannedActivityDetail): ObjectAndCompanion[PlannedActivityDetail, PlannedActivityDetail.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = PlannedActivityDetail
      override type ParentType   = PlannedActivityDetail
      override val parentType: CompanionFor[ResourceType] = PlannedActivityDetail
      type ProductChoice   = Choice[UnionCodeableConceptOrReference]
      type ReportedChoice  = Choice[UnionBooleanOrReference]
      type ScheduledChoice = Choice[UnionPeriodOrStringOrTiming]
      def apply(
          id: Option[String] = None,
          kind: Option[CARE_PLAN_ACTIVITY_KIND] = None,
          code: Option[CodeableConcept] = None,
          goal: LitSeq[Reference] = LitSeq.empty,
          reason: LitSeq[CodeableReference] = LitSeq.empty,
          status: CARE_PLAN_ACTIVITY_STATUS,
          location: Option[CodeableReference] = None,
          quantity: Option[Quantity] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          performer: LitSeq[Reference] = LitSeq.empty,
          product: Option[PlannedActivityDetail.ProductChoice] = None,
          reported: Option[PlannedActivityDetail.ReportedChoice] = None,
          dailyAmount: Option[Quantity] = None,
          description: Option[String] = None,
          statusReason: Option[CodeableConcept] = None,
          doNotPerform: Option[Boolean] = None,
          scheduled: Option[PlannedActivityDetail.ScheduledChoice] = None,
          instantiatesUri: LitSeq[UriStr] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          instantiatesCanonical: LitSeq[Canonical] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): PlannedActivityDetail = new PlannedActivityDetail(
        id,
        kind,
        code,
        goal,
        reason,
        status,
        location,
        quantity,
        extension,
        performer,
        product,
        reported,
        dailyAmount,
        description,
        statusReason,
        doNotPerform,
        scheduled,
        instantiatesUri,
        modifierExtension,
        instantiatesCanonical,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: PlannedActivityDetail): Option[(Option[String], Option[CARE_PLAN_ACTIVITY_KIND], Option[CodeableConcept], LitSeq[Reference], LitSeq[CodeableReference], CARE_PLAN_ACTIVITY_STATUS, Option[CodeableReference], Option[Quantity], LitSeq[Extension], LitSeq[Reference], Option[PlannedActivityDetail.ProductChoice], Option[PlannedActivityDetail.ReportedChoice], Option[Quantity], Option[String], Option[CodeableConcept], Option[Boolean], Option[PlannedActivityDetail.ScheduledChoice], LitSeq[UriStr], LitSeq[Extension], LitSeq[Canonical])] =
        Some(
          (
            o.id,
            o.kind,
            o.code,
            o.goal,
            o.reason,
            o.status,
            o.location,
            o.quantity,
            o.extension,
            o.performer,
            o.product,
            o.reported,
            o.dailyAmount,
            o.description,
            o.statusReason,
            o.doNotPerform,
            o.scheduled,
            o.instantiatesUri,
            o.modifierExtension,
            o.instantiatesCanonical))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val kind: FHIRComponentFieldMeta[Option[CARE_PLAN_ACTIVITY_KIND]] =
        FHIRComponentFieldMeta("kind", lTagOf[Option[CARE_PLAN_ACTIVITY_KIND]], false, lTagOf[CARE_PLAN_ACTIVITY_KIND])
      val code: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("code", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val goal: FHIRComponentFieldMeta[LitSeq[Reference]] =
        FHIRComponentFieldMeta("goal", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
      val reason: FHIRComponentFieldMeta[LitSeq[CodeableReference]] =
        FHIRComponentFieldMeta("reason", lTagOf[LitSeq[CodeableReference]], false, lTagOf[CodeableReference])
      val status: FHIRComponentFieldMeta[CARE_PLAN_ACTIVITY_STATUS] =
        FHIRComponentFieldMeta("status", lTagOf[CARE_PLAN_ACTIVITY_STATUS], false, lTagOf[CARE_PLAN_ACTIVITY_STATUS])
      val location: FHIRComponentFieldMeta[Option[CodeableReference]] =
        FHIRComponentFieldMeta("location", lTagOf[Option[CodeableReference]], false, lTagOf[CodeableReference])
      val quantity: FHIRComponentFieldMeta[Option[Quantity]] =
        FHIRComponentFieldMeta("quantity", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val performer: FHIRComponentFieldMeta[LitSeq[Reference]] =
        FHIRComponentFieldMeta("performer", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
      val product: FHIRComponentFieldMeta[Option[PlannedActivityDetail.ProductChoice]] =
        FHIRComponentFieldMeta(
          "product",
          lTagOf[Option[PlannedActivityDetail.ProductChoice]],
          true,
          lTagOf[UnionCodeableConceptOrReference])
      val reported: FHIRComponentFieldMeta[Option[PlannedActivityDetail.ReportedChoice]] =
        FHIRComponentFieldMeta(
          "reported",
          lTagOf[Option[PlannedActivityDetail.ReportedChoice]],
          true,
          lTagOf[UnionBooleanOrReference])
      val dailyAmount: FHIRComponentFieldMeta[Option[Quantity]] =
        FHIRComponentFieldMeta("dailyAmount", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
      val description: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
      val statusReason: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("statusReason", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val doNotPerform: FHIRComponentFieldMeta[Option[Boolean]] =
        FHIRComponentFieldMeta("doNotPerform", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
      val scheduled: FHIRComponentFieldMeta[Option[PlannedActivityDetail.ScheduledChoice]] =
        FHIRComponentFieldMeta(
          "scheduled",
          lTagOf[Option[PlannedActivityDetail.ScheduledChoice]],
          true,
          lTagOf[UnionPeriodOrStringOrTiming])
      val instantiatesUri: FHIRComponentFieldMeta[LitSeq[UriStr]] =
        FHIRComponentFieldMeta("instantiatesUri", lTagOf[LitSeq[UriStr]], false, lTagOf[UriStr])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val instantiatesCanonical: FHIRComponentFieldMeta[LitSeq[Canonical]] =
        FHIRComponentFieldMeta("instantiatesCanonical", lTagOf[LitSeq[Canonical]], false, lTagOf[Canonical])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
        id,
        kind,
        code,
        goal,
        reason,
        status,
        location,
        quantity,
        extension,
        performer,
        product,
        reported,
        dailyAmount,
        description,
        statusReason,
        doNotPerform,
        scheduled,
        instantiatesUri,
        modifierExtension,
        instantiatesCanonical
      )
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: PlannedActivityDetail): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[CARE_PLAN_ACTIVITY_KIND]](kind, t.kind),
        FHIRComponentField[Option[CodeableConcept]](code, t.code),
        FHIRComponentField[LitSeq[Reference]](goal, t.goal),
        FHIRComponentField[LitSeq[CodeableReference]](reason, t.reason),
        FHIRComponentField[CARE_PLAN_ACTIVITY_STATUS](status, t.status),
        FHIRComponentField[Option[CodeableReference]](location, t.location),
        FHIRComponentField[Option[Quantity]](quantity, t.quantity),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Reference]](performer, t.performer),
        FHIRComponentField[Option[PlannedActivityDetail.ProductChoice]](product, t.product),
        FHIRComponentField[Option[PlannedActivityDetail.ReportedChoice]](reported, t.reported),
        FHIRComponentField[Option[Quantity]](dailyAmount, t.dailyAmount),
        FHIRComponentField[Option[String]](description, t.description),
        FHIRComponentField[Option[CodeableConcept]](statusReason, t.statusReason),
        FHIRComponentField[Option[Boolean]](doNotPerform, t.doNotPerform),
        FHIRComponentField[Option[PlannedActivityDetail.ScheduledChoice]](scheduled, t.scheduled),
        FHIRComponentField[LitSeq[UriStr]](instantiatesUri, t.instantiatesUri),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
        FHIRComponentField[LitSeq[Canonical]](instantiatesCanonical, t.instantiatesCanonical)
      )
      val baseType: CompanionFor[PlannedActivityDetail] = this
      val thisName: String                              = "PlannedActivityDetail"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[PlannedActivityDetail] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new PlannedActivityDetail(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[CARE_PLAN_ACTIVITY_KIND]]("kind", Some(None)),
              cursor.decodeAs[Option[CodeableConcept]]("code", Some(None)),
              cursor.decodeAs[LitSeq[Reference]]("goal", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[CodeableReference]]("reason", Some(LitSeq.empty)),
              cursor.decodeAs[CARE_PLAN_ACTIVITY_STATUS]("status", None),
              cursor.decodeAs[Option[CodeableReference]]("location", Some(None)),
              cursor.decodeAs[Option[Quantity]]("quantity", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Reference]]("performer", Some(LitSeq.empty)),
              cursor.decodeOptRef[UnionCodeableConceptOrReference]("product"),
              cursor.decodeOptRef[UnionBooleanOrReference]("reported"),
              cursor.decodeAs[Option[Quantity]]("dailyAmount", Some(None)),
              cursor.decodeAs[Option[String]]("description", Some(None)),
              cursor.decodeAs[Option[CodeableConcept]]("statusReason", Some(None)),
              cursor.decodeAs[Option[Boolean]]("doNotPerform", Some(None)),
              cursor.decodeOptRef[UnionPeriodOrStringOrTiming]("scheduled"),
              cursor.decodeAs[LitSeq[UriStr]]("instantiatesUri", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Canonical]]("instantiatesCanonical", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class PlannedActivityDetail(
        override val id: Option[String] = None,
        val kind: Option[CARE_PLAN_ACTIVITY_KIND] = None,
        val code: Option[CodeableConcept] = None,
        val goal: LitSeq[Reference] = LitSeq.empty,
        val reason: LitSeq[CodeableReference] = LitSeq.empty,
        val status: CARE_PLAN_ACTIVITY_STATUS,
        val location: Option[CodeableReference] = None,
        val quantity: Option[Quantity] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val performer: LitSeq[Reference] = LitSeq.empty,
        val product: Option[PlannedActivityDetail.ProductChoice] = None,
        val reported: Option[PlannedActivityDetail.ReportedChoice] = None,
        val dailyAmount: Option[Quantity] = None,
        val description: Option[String] = None,
        val statusReason: Option[CodeableConcept] = None,
        val doNotPerform: Option[Boolean] = None,
        val scheduled: Option[PlannedActivityDetail.ScheduledChoice] = None,
        val instantiatesUri: LitSeq[UriStr] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        val instantiatesCanonical: LitSeq[Canonical] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        progress: LitSeq[Annotation] = LitSeq.empty,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        performedActivity: LitSeq[CodeableReference] = LitSeq.empty,
        plannedActivityReference: Option[Reference] = None,
        plannedActivityDetail: Option[Activity.PlannedActivityDetail] = None,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Activity = new Activity(
      id,
      progress,
      extension,
      modifierExtension,
      performedActivity,
      plannedActivityReference,
      plannedActivityDetail,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Activity): Option[(Option[String], LitSeq[Annotation], LitSeq[Extension], LitSeq[Extension], LitSeq[CodeableReference], Option[Reference], Option[Activity.PlannedActivityDetail])] =
      Some(
        (
          o.id,
          o.progress,
          o.extension,
          o.modifierExtension,
          o.performedActivity,
          o.plannedActivityReference,
          o.plannedActivityDetail))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val progress: FHIRComponentFieldMeta[LitSeq[Annotation]] =
      FHIRComponentFieldMeta("progress", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val performedActivity: FHIRComponentFieldMeta[LitSeq[CodeableReference]] =
      FHIRComponentFieldMeta("performedActivity", lTagOf[LitSeq[CodeableReference]], false, lTagOf[CodeableReference])
    val plannedActivityReference: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("plannedActivityReference", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val plannedActivityDetail: FHIRComponentFieldMeta[Option[Activity.PlannedActivityDetail]] =
      FHIRComponentFieldMeta(
        "plannedActivityDetail",
        lTagOf[Option[Activity.PlannedActivityDetail]],
        false,
        lTagOf[Activity.PlannedActivityDetail])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, progress, extension, modifierExtension, performedActivity, plannedActivityReference, plannedActivityDetail)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Activity): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Annotation]](progress, t.progress),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[CodeableReference]](performedActivity, t.performedActivity),
      FHIRComponentField[Option[Reference]](plannedActivityReference, t.plannedActivityReference),
      FHIRComponentField[Option[Activity.PlannedActivityDetail]](plannedActivityDetail, t.plannedActivityDetail)
    )
    val baseType: CompanionFor[Activity] = this
    val thisName: String                 = "Activity"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Activity] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Activity(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Annotation]]("progress", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[CodeableReference]]("performedActivity", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Reference]]("plannedActivityReference", Some(None)),
            cursor.decodeAs[Option[Activity.PlannedActivityDetail]]("plannedActivityDetail", Some(None)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Activity(
      override val id: Option[String] = None,
      val progress: LitSeq[Annotation] = LitSeq.empty,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val performedActivity: LitSeq[CodeableReference] = LitSeq.empty,
      val plannedActivityReference: Option[Reference] = None,
      val plannedActivityDetail: Option[Activity.PlannedActivityDetail] = None,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      goal: LitSeq[Reference] = LitSeq.empty,
      note: LitSeq[Annotation] = LitSeq.empty,
      title: Option[String] = None,
      partOf: LitSeq[Reference] = LitSeq.empty,
      status: REQUEST_STATUS,
      intent: CARE_PLAN_INTENT,
      period: Option[Period] = None,
      author: Option[Reference] = None,
      basedOn: LitSeq[Reference] = LitSeq.empty,
      subject: Reference,
      created: Option[FHIRDateTime] = None,
      language: Option[LANGUAGES] = None,
      replaces: LitSeq[Reference] = LitSeq.empty,
      category: LitSeq[CodeableConcept] = LitSeq.empty,
      careTeam: LitSeq[Reference] = LitSeq.empty,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      encounter: Option[Reference] = None,
      addresses: LitSeq[CodeableReference] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      description: Option[String] = None,
      contributor: LitSeq[Reference] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      supportingInfo: LitSeq[Reference] = LitSeq.empty,
      instantiatesUri: LitSeq[UriStr] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      instantiatesCanonical: LitSeq[Canonical] = LitSeq.empty,
      activity: LitSeq[CarePlan.Activity] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): CarePlan = new CarePlan(
    id,
    meta,
    text,
    goal,
    note,
    title,
    partOf,
    status,
    intent,
    period,
    author,
    basedOn,
    subject,
    created,
    language,
    replaces,
    category,
    careTeam,
    contained,
    extension,
    encounter,
    addresses,
    identifier,
    description,
    contributor,
    implicitRules,
    supportingInfo,
    instantiatesUri,
    modifierExtension,
    instantiatesCanonical,
    activity,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val goal: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("goal", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val title: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("title", lTagOf[Option[String]], false, lTagOf[String])
  val partOf: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("partOf", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val status: FHIRComponentFieldMeta[REQUEST_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[REQUEST_STATUS], false, lTagOf[REQUEST_STATUS])
  val intent: FHIRComponentFieldMeta[CARE_PLAN_INTENT] =
    FHIRComponentFieldMeta("intent", lTagOf[CARE_PLAN_INTENT], false, lTagOf[CARE_PLAN_INTENT])
  val period: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("period", lTagOf[Option[Period]], false, lTagOf[Period])
  val author: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("author", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val basedOn: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("basedOn", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val subject: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("subject", lTagOf[Reference], false, lTagOf[Reference])
  val created: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("created", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val replaces: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("replaces", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val category: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("category", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val careTeam: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("careTeam", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val encounter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("encounter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val addresses: FHIRComponentFieldMeta[LitSeq[CodeableReference]] =
    FHIRComponentFieldMeta("addresses", lTagOf[LitSeq[CodeableReference]], false, lTagOf[CodeableReference])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val description: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
  val contributor: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("contributor", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val supportingInfo: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("supportingInfo", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val instantiatesUri: FHIRComponentFieldMeta[LitSeq[UriStr]] =
    FHIRComponentFieldMeta("instantiatesUri", lTagOf[LitSeq[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val instantiatesCanonical: FHIRComponentFieldMeta[LitSeq[Canonical]] =
    FHIRComponentFieldMeta("instantiatesCanonical", lTagOf[LitSeq[Canonical]], false, lTagOf[Canonical])
  val activity: FHIRComponentFieldMeta[LitSeq[CarePlan.Activity]] =
    FHIRComponentFieldMeta("activity", lTagOf[LitSeq[CarePlan.Activity]], false, lTagOf[CarePlan.Activity])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    goal,
    note,
    title,
    partOf,
    status,
    intent,
    period,
    author,
    basedOn,
    subject,
    created,
    language,
    replaces,
    category,
    careTeam,
    contained,
    extension,
    encounter,
    addresses,
    identifier,
    description,
    contributor,
    implicitRules,
    supportingInfo,
    instantiatesUri,
    modifierExtension,
    instantiatesCanonical,
    activity
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: CarePlan): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[LitSeq[Reference]](goal, t.goal),
    FHIRComponentField[LitSeq[Annotation]](note, t.note),
    FHIRComponentField[Option[String]](title, t.title),
    FHIRComponentField[LitSeq[Reference]](partOf, t.partOf),
    FHIRComponentField[REQUEST_STATUS](status, t.status),
    FHIRComponentField[CARE_PLAN_INTENT](intent, t.intent),
    FHIRComponentField[Option[Period]](period, t.period),
    FHIRComponentField[Option[Reference]](author, t.author),
    FHIRComponentField[LitSeq[Reference]](basedOn, t.basedOn),
    FHIRComponentField[Reference](subject, t.subject),
    FHIRComponentField[Option[FHIRDateTime]](created, t.created),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Reference]](replaces, t.replaces),
    FHIRComponentField[LitSeq[CodeableConcept]](category, t.category),
    FHIRComponentField[LitSeq[Reference]](careTeam, t.careTeam),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Reference]](encounter, t.encounter),
    FHIRComponentField[LitSeq[CodeableReference]](addresses, t.addresses),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[String]](description, t.description),
    FHIRComponentField[LitSeq[Reference]](contributor, t.contributor),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Reference]](supportingInfo, t.supportingInfo),
    FHIRComponentField[LitSeq[UriStr]](instantiatesUri, t.instantiatesUri),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[Canonical]](instantiatesCanonical, t.instantiatesCanonical),
    FHIRComponentField[LitSeq[CarePlan.Activity]](activity, t.activity)
  )
  def extractId(t: CarePlan): Option[String]                       = t.id
  def extractMeta(t: CarePlan): Option[Meta]                       = t.meta
  def extractText(t: CarePlan): Option[Narrative]                  = t.text
  def extractGoal(t: CarePlan): LitSeq[Reference]                  = t.goal
  def extractNote(t: CarePlan): LitSeq[Annotation]                 = t.note
  def extractTitle(t: CarePlan): Option[String]                    = t.title
  def extractPartOf(t: CarePlan): LitSeq[Reference]                = t.partOf
  def extractStatus(t: CarePlan): REQUEST_STATUS                   = t.status
  def extractIntent(t: CarePlan): CARE_PLAN_INTENT                 = t.intent
  def extractPeriod(t: CarePlan): Option[Period]                   = t.period
  def extractAuthor(t: CarePlan): Option[Reference]                = t.author
  def extractBasedOn(t: CarePlan): LitSeq[Reference]               = t.basedOn
  def extractSubject(t: CarePlan): Reference                       = t.subject
  def extractCreated(t: CarePlan): Option[FHIRDateTime]            = t.created
  def extractLanguage(t: CarePlan): Option[LANGUAGES]              = t.language
  def extractReplaces(t: CarePlan): LitSeq[Reference]              = t.replaces
  def extractCategory(t: CarePlan): LitSeq[CodeableConcept]        = t.category
  def extractCareTeam(t: CarePlan): LitSeq[Reference]              = t.careTeam
  def extractContained(t: CarePlan): LitSeq[Resource]              = t.contained
  def extractExtension(t: CarePlan): LitSeq[Extension]             = t.extension
  def extractEncounter(t: CarePlan): Option[Reference]             = t.encounter
  def extractAddresses(t: CarePlan): LitSeq[CodeableReference]     = t.addresses
  def extractIdentifier(t: CarePlan): LitSeq[Identifier]           = t.identifier
  def extractDescription(t: CarePlan): Option[String]              = t.description
  def extractContributor(t: CarePlan): LitSeq[Reference]           = t.contributor
  def extractImplicitRules(t: CarePlan): Option[UriStr]            = t.implicitRules
  def extractSupportingInfo(t: CarePlan): LitSeq[Reference]        = t.supportingInfo
  def extractInstantiatesUri(t: CarePlan): LitSeq[UriStr]          = t.instantiatesUri
  def extractModifierExtension(t: CarePlan): LitSeq[Extension]     = t.modifierExtension
  def extractInstantiatesCanonical(t: CarePlan): LitSeq[Canonical] = t.instantiatesCanonical
  def extractActivity(t: CarePlan): LitSeq[CarePlan.Activity]      = t.activity
  override val thisName: String                                    = "CarePlan"
  override val searchParams: Map[String, CarePlan => Seq[Any]] = Map(
    "subject"   -> (obj => Seq(obj.subject)),
    "care-team" -> (obj => obj.careTeam.toSeq),
    "activity-scheduled-date" -> (obj =>
      obj.activity.flatMap(_.plannedActivityDetail).flatMap(_.scheduled).flatMap(_.as[Timing]).toSeq ++
        obj.activity.flatMap(_.plannedActivityDetail).flatMap(_.scheduled).flatMap(_.as[Period]).toSeq),
    "condition"          -> (obj => obj.addresses.flatMap(_.reference).toSeq),
    "date"               -> (obj => obj.period.toSeq),
    "status"             -> (obj => Seq(obj.status)),
    "category"           -> (obj => obj.category.toSeq),
    "part-of"            -> (obj => obj.partOf.toSeq),
    "based-on"           -> (obj => obj.basedOn.toSeq),
    "encounter"          -> (obj => obj.encounter.toSeq),
    "instantiates-uri"   -> (obj => obj.instantiatesUri.toSeq),
    "identifier"         -> (obj => obj.identifier.toSeq),
    "intent"             -> (obj => Seq(obj.intent)),
    "activity-reference" -> (obj => obj.activity.flatMap(_.plannedActivityReference).toSeq),
    "activity-scheduled-string" -> (obj =>
      obj.activity.flatMap(_.plannedActivityDetail).flatMap(_.scheduled).flatMap(_.as[String]).toSeq),
    "goal"                   -> (obj => obj.goal.toSeq),
    "activity-code"          -> (obj => obj.activity.flatMap(_.plannedActivityDetail).flatMap(_.code).toSeq),
    "replaces"               -> (obj => obj.replaces.toSeq),
    "performer"              -> (obj => obj.activity.flatMap(_.plannedActivityDetail).flatMap(_.performer).toSeq),
    "instantiates-canonical" -> (obj => obj.instantiatesCanonical.toSeq),
    "patient"                -> (obj => obj.subject.seqIf(_.reference.exists(_.contains("Patient/"))).toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[CarePlan] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new CarePlan(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("goal", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("title", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("partOf", Some(LitSeq.empty)),
          cursor.decodeAs[REQUEST_STATUS]("status", None),
          cursor.decodeAs[CARE_PLAN_INTENT]("intent", None),
          cursor.decodeAs[Option[Period]]("period", Some(None)),
          cursor.decodeAs[Option[Reference]]("author", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("basedOn", Some(LitSeq.empty)),
          cursor.decodeAs[Reference]("subject", None),
          cursor.decodeAs[Option[FHIRDateTime]]("created", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("replaces", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("category", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("careTeam", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          cursor.decodeAs[LitSeq[CodeableReference]]("addresses", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("description", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("contributor", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("supportingInfo", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[UriStr]]("instantiatesUri", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Canonical]]("instantiatesCanonical", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CarePlan.Activity]]("activity", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community
  * for a period of time, possibly limited to care for a specific condition or set of conditions.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields goal, note, title, partOf, status, intent, period, author, basedOn, subject, created, replaces,
  *   category, careTeam, encounter, addresses, identifier, description, contributor, supportingInfo, instantiatesUri,
  *   instantiatesCanonical, activity.
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
  * @param goal
  *   - Describes the intended objective(s) of carrying out the care plan.
  * @param note
  *   - General notes about the care plan not covered elsewhere.
  * @param title
  *   - Human-friendly name for the care plan.
  * @param partOf
  *   - A larger care plan of which this particular care plan is a component or step.
  * @param status
  *   - Indicates whether the plan is currently being acted upon, represents future intentions or is now a historical record.
  * @param intent
  *   - Indicates the level of authority/intentionality associated with the care plan and where the care plan fits into the
  *   workflow chain.
  * @param period
  *   - Indicates when the plan did (or is intended to) come into effect and end.
  * @param author
  *   - When populated, the author is responsible for the care plan. The care plan is attributed to the author.
  * @param basedOn
  *   - A care plan that is fulfilled in whole or in part by this care plan.
  * @param subject
  *   - Identifies the patient or group whose intended care is described by the plan.
  * @param created
  *   - Represents when this particular CarePlan record was created in the system, which is often a system-generated date.
  * @param language
  *   - The base language in which the resource is written.
  * @param replaces
  *   - Completed or terminated care plan whose function is taken by this new care plan.
  * @param category
  *   - Identifies what "kind" of plan this is to support differentiation between multiple co-existing plans; e.g. "Home health",
  *   "psychiatric", "asthma", "disease management", "wellness plan", etc.
  * @param careTeam
  *   - Identifies all people and organizations who are expected to be involved in the care envisioned by this plan.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param encounter
  *   - The Encounter during which this CarePlan was created or to which the creation of this record is tightly associated.
  * @param addresses
  *   - Identifies the conditions/problems/concerns/diagnoses/etc. whose management and/or mitigation are handled by this plan.
  * @param identifier
  *   - Business identifiers assigned to this care plan by the performer or other systems which remain constant as the resource is
  *   updated and propagates from server to server.
  * @param description
  *   - A description of the scope and nature of the plan.
  * @param contributor
  *   - Identifies the individual(s) or organization who provided the contents of the care plan.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param supportingInfo
  *   - Identifies portions of the patient's record that specifically influenced the formation of the plan. These might include
  *   comorbidities, recent procedures, limitations, recent assessments, etc.
  * @param instantiatesUri
  *   - The URL pointing to an externally maintained protocol, guideline, questionnaire or other definition that is adhered to in
  *   whole or in part by this CarePlan.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *   the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually
  *   modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict
  *   set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param instantiatesCanonical
  *   - The URL pointing to a FHIR-defined protocol, guideline, questionnaire or other definition that is adhered to in whole or
  *   in part by this CarePlan.
  * @param activity
  *   - Identifies an action that has occurred or is a planned action to occur as part of the plan. For example, a medication to
  *   be used, lab tests to perform, self-monitoring that has occurred, education etc.
  */
@POJOBoilerplate
class CarePlan(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val goal: LitSeq[Reference] = LitSeq.empty,
    val note: LitSeq[Annotation] = LitSeq.empty,
    val title: Option[String] = None,
    val partOf: LitSeq[Reference] = LitSeq.empty,
    val status: REQUEST_STATUS,
    val intent: CARE_PLAN_INTENT,
    val period: Option[Period] = None,
    val author: Option[Reference] = None,
    val basedOn: LitSeq[Reference] = LitSeq.empty,
    val subject: Reference,
    val created: Option[FHIRDateTime] = None,
    override val language: Option[LANGUAGES] = None,
    val replaces: LitSeq[Reference] = LitSeq.empty,
    val category: LitSeq[CodeableConcept] = LitSeq.empty,
    val careTeam: LitSeq[Reference] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val encounter: Option[Reference] = None,
    val addresses: LitSeq[CodeableReference] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val description: Option[String] = None,
    val contributor: LitSeq[Reference] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    val supportingInfo: LitSeq[Reference] = LitSeq.empty,
    val instantiatesUri: LitSeq[UriStr] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val instantiatesCanonical: LitSeq[Canonical] = LitSeq.empty,
    val activity: LitSeq[CarePlan.Activity] = LitSeq.empty,
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
  override val thisTypeName: String = "CarePlan"
}
