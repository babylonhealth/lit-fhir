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
import com.babylonhealth.lit.hl7.ADVERSE_EVENT_ACTUALITY
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object AdverseEvent extends CompanionFor[AdverseEvent] {
  implicit def summonObjectAndCompanionAdverseEvent_1749665987(
      o: AdverseEvent): ObjectAndCompanion[AdverseEvent, AdverseEvent.type] = ObjectAndCompanion(o, this)
  override type ResourceType = AdverseEvent
  override type ParentType   = AdverseEvent
  override val baseType: CompanionFor[ResourceType] = AdverseEvent
  override val parentType: CompanionFor[ParentType] = AdverseEvent
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/AdverseEvent")
  object SuspectEntity extends CompanionFor[SuspectEntity] {
    implicit def summonObjectAndCompanionSuspectEntity_659249712(
        o: SuspectEntity): ObjectAndCompanion[SuspectEntity, SuspectEntity.type] = ObjectAndCompanion(o, this)
    override type ResourceType = SuspectEntity
    override type ParentType   = SuspectEntity
    override val parentType: CompanionFor[ResourceType] = SuspectEntity
    object Causality extends CompanionFor[Causality] {
      implicit def summonObjectAndCompanionCausality1648420380(o: Causality): ObjectAndCompanion[Causality, Causality.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Causality
      override type ParentType   = Causality
      override val parentType: CompanionFor[ResourceType] = Causality
      def apply(
          id: Option[String] = None,
          author: Option[Reference] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          assessmentMethod: Option[CodeableConcept] = None,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          entityRelatedness: Option[CodeableConcept] = None,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Causality = new Causality(
        id,
        author,
        extension,
        assessmentMethod,
        modifierExtension,
        entityRelatedness,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Causality): Option[(Option[String], Option[Reference], LitSeq[Extension], Option[CodeableConcept], LitSeq[Extension], Option[CodeableConcept])] =
        Some((o.id, o.author, o.extension, o.assessmentMethod, o.modifierExtension, o.entityRelatedness))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val author: FHIRComponentFieldMeta[Option[Reference]] =
        FHIRComponentFieldMeta("author", lTagOf[Option[Reference]], false, lTagOf[Reference])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val assessmentMethod: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("assessmentMethod", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val entityRelatedness: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("entityRelatedness", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
        Seq(id, author, extension, assessmentMethod, modifierExtension, entityRelatedness)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Causality): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[Reference]](author, t.author),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[CodeableConcept]](assessmentMethod, t.assessmentMethod),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
        FHIRComponentField[Option[CodeableConcept]](entityRelatedness, t.entityRelatedness)
      )
      val baseType: CompanionFor[Causality] = this
      val thisName: String                  = "Causality"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Causality] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Causality(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[Reference]]("author", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[CodeableConcept]]("assessmentMethod", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[CodeableConcept]]("entityRelatedness", Some(None)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Causality(
        override val id: Option[String] = None,
        val author: Option[Reference] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val assessmentMethod: Option[CodeableConcept] = None,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        val entityRelatedness: Option[CodeableConcept] = None,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    type InstanceChoice = Choice[UnionCodeableConceptOrReference]
    def apply(
        id: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        instance: SuspectEntity.InstanceChoice,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        causality: Option[SuspectEntity.Causality] = None,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): SuspectEntity = new SuspectEntity(
      id,
      extension,
      instance,
      modifierExtension,
      causality,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: SuspectEntity): Option[(Option[String], LitSeq[Extension], SuspectEntity.InstanceChoice, LitSeq[Extension], Option[SuspectEntity.Causality])] =
      Some((o.id, o.extension, o.instance, o.modifierExtension, o.causality))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val instance: FHIRComponentFieldMeta[SuspectEntity.InstanceChoice] =
      FHIRComponentFieldMeta("instance", lTagOf[SuspectEntity.InstanceChoice], true, lTagOf[UnionCodeableConceptOrReference])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val causality: FHIRComponentFieldMeta[Option[SuspectEntity.Causality]] =
      FHIRComponentFieldMeta("causality", lTagOf[Option[SuspectEntity.Causality]], false, lTagOf[SuspectEntity.Causality])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, extension, instance, modifierExtension, causality)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: SuspectEntity): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[SuspectEntity.InstanceChoice](instance, t.instance),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[SuspectEntity.Causality]](causality, t.causality)
    )
    val baseType: CompanionFor[SuspectEntity] = this
    val thisName: String                      = "SuspectEntity"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[SuspectEntity] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new SuspectEntity(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeRef[UnionCodeableConceptOrReference]("instance"),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[SuspectEntity.Causality]]("causality", Some(None)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class SuspectEntity(
      override val id: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val instance: SuspectEntity.InstanceChoice,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val causality: Option[SuspectEntity.Causality] = None,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object ContributingFactor extends CompanionFor[ContributingFactor] {
    implicit def summonObjectAndCompanionContributingFactor_659249712(
        o: ContributingFactor): ObjectAndCompanion[ContributingFactor, ContributingFactor.type] = ObjectAndCompanion(o, this)
    override type ResourceType = ContributingFactor
    override type ParentType   = ContributingFactor
    override val parentType: CompanionFor[ResourceType] = ContributingFactor
    type ItemChoice = Choice[UnionCodeableConceptOrReference]
    def apply(
        id: Option[String] = None,
        item: ContributingFactor.ItemChoice,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): ContributingFactor = new ContributingFactor(
      id,
      item,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: ContributingFactor): Option[(Option[String], ContributingFactor.ItemChoice, LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.item, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val item: FHIRComponentFieldMeta[ContributingFactor.ItemChoice] =
      FHIRComponentFieldMeta("item", lTagOf[ContributingFactor.ItemChoice], true, lTagOf[UnionCodeableConceptOrReference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, item, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: ContributingFactor): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[ContributingFactor.ItemChoice](item, t.item),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[ContributingFactor] = this
    val thisName: String                           = "ContributingFactor"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ContributingFactor] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new ContributingFactor(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeRef[UnionCodeableConceptOrReference]("item"),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class ContributingFactor(
      override val id: Option[String] = None,
      val item: ContributingFactor.ItemChoice,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object MitigatingAction extends CompanionFor[MitigatingAction] {
    implicit def summonObjectAndCompanionMitigatingAction_659249712(
        o: MitigatingAction): ObjectAndCompanion[MitigatingAction, MitigatingAction.type] = ObjectAndCompanion(o, this)
    override type ResourceType = MitigatingAction
    override type ParentType   = MitigatingAction
    override val parentType: CompanionFor[ResourceType] = MitigatingAction
    type ItemChoice = Choice[UnionCodeableConceptOrReference]
    def apply(
        id: Option[String] = None,
        item: MitigatingAction.ItemChoice,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): MitigatingAction = new MitigatingAction(
      id,
      item,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: MitigatingAction): Option[(Option[String], MitigatingAction.ItemChoice, LitSeq[Extension], LitSeq[Extension])] = Some(
      (o.id, o.item, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val item: FHIRComponentFieldMeta[MitigatingAction.ItemChoice] =
      FHIRComponentFieldMeta("item", lTagOf[MitigatingAction.ItemChoice], true, lTagOf[UnionCodeableConceptOrReference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, item, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: MitigatingAction): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[MitigatingAction.ItemChoice](item, t.item),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[MitigatingAction] = this
    val thisName: String                         = "MitigatingAction"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[MitigatingAction] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new MitigatingAction(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeRef[UnionCodeableConceptOrReference]("item"),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class MitigatingAction(
      override val id: Option[String] = None,
      val item: MitigatingAction.ItemChoice,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object PreventiveAction extends CompanionFor[PreventiveAction] {
    implicit def summonObjectAndCompanionPreventiveAction_659249712(
        o: PreventiveAction): ObjectAndCompanion[PreventiveAction, PreventiveAction.type] = ObjectAndCompanion(o, this)
    override type ResourceType = PreventiveAction
    override type ParentType   = PreventiveAction
    override val parentType: CompanionFor[ResourceType] = PreventiveAction
    type ItemChoice = Choice[UnionCodeableConceptOrReference]
    def apply(
        id: Option[String] = None,
        item: PreventiveAction.ItemChoice,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): PreventiveAction = new PreventiveAction(
      id,
      item,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: PreventiveAction): Option[(Option[String], PreventiveAction.ItemChoice, LitSeq[Extension], LitSeq[Extension])] = Some(
      (o.id, o.item, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val item: FHIRComponentFieldMeta[PreventiveAction.ItemChoice] =
      FHIRComponentFieldMeta("item", lTagOf[PreventiveAction.ItemChoice], true, lTagOf[UnionCodeableConceptOrReference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, item, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: PreventiveAction): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[PreventiveAction.ItemChoice](item, t.item),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[PreventiveAction] = this
    val thisName: String                         = "PreventiveAction"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[PreventiveAction] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new PreventiveAction(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeRef[UnionCodeableConceptOrReference]("item"),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class PreventiveAction(
      override val id: Option[String] = None,
      val item: PreventiveAction.ItemChoice,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object SupportingInfo extends CompanionFor[SupportingInfo] {
    implicit def summonObjectAndCompanionSupportingInfo_659249712(
        o: SupportingInfo): ObjectAndCompanion[SupportingInfo, SupportingInfo.type] = ObjectAndCompanion(o, this)
    override type ResourceType = SupportingInfo
    override type ParentType   = SupportingInfo
    override val parentType: CompanionFor[ResourceType] = SupportingInfo
    type ItemChoice = Choice[UnionCodeableConceptOrReference]
    def apply(
        id: Option[String] = None,
        item: SupportingInfo.ItemChoice,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): SupportingInfo = new SupportingInfo(
      id,
      item,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(o: SupportingInfo): Option[(Option[String], SupportingInfo.ItemChoice, LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.item, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val item: FHIRComponentFieldMeta[SupportingInfo.ItemChoice] =
      FHIRComponentFieldMeta("item", lTagOf[SupportingInfo.ItemChoice], true, lTagOf[UnionCodeableConceptOrReference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, item, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: SupportingInfo): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[SupportingInfo.ItemChoice](item, t.item),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[SupportingInfo] = this
    val thisName: String                       = "SupportingInfo"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[SupportingInfo] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new SupportingInfo(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeRef[UnionCodeableConceptOrReference]("item"),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class SupportingInfo(
      override val id: Option[String] = None,
      val item: SupportingInfo.ItemChoice,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Participant extends CompanionFor[Participant] {
    implicit def summonObjectAndCompanionParticipant_659249712(
        o: Participant): ObjectAndCompanion[Participant, Participant.type] = ObjectAndCompanion(o, this)
    override type ResourceType = Participant
    override type ParentType   = Participant
    override val parentType: CompanionFor[ResourceType] = Participant
    def apply(
        id: Option[String] = None,
        actor: Reference,
        function: Option[CodeableConcept] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Participant = new Participant(
      id,
      actor,
      function,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Participant): Option[(Option[String], Reference, Option[CodeableConcept], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.actor, o.function, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val actor: FHIRComponentFieldMeta[Reference] =
      FHIRComponentFieldMeta("actor", lTagOf[Reference], false, lTagOf[Reference])
    val function: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("function", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, actor, function, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Participant): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Reference](actor, t.actor),
      FHIRComponentField[Option[CodeableConcept]](function, t.function),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Participant] = this
    val thisName: String                    = "Participant"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Participant] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Participant(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Reference]("actor", None),
            cursor.decodeAs[Option[CodeableConcept]]("function", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Participant(
      override val id: Option[String] = None,
      val actor: Reference,
      val function: Option[CodeableConcept] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  type OccurrenceChoice = Choice[UnionDateTimeOrPeriodOrTiming]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      code: Option[CodeableConcept] = None,
      study: LitSeq[Reference] = LitSeq.empty,
      status: Code,
      subject: Reference,
      outcome: LitSeq[CodeableConcept] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      category: LitSeq[CodeableConcept] = LitSeq.empty,
      detected: Option[FHIRDateTime] = None,
      location: Option[Reference] = None,
      recorder: Option[Reference] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      actuality: ADVERSE_EVENT_ACTUALITY,
      encounter: Option[Reference] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      seriousness: Option[CodeableConcept] = None,
      recordedDate: Option[FHIRDateTime] = None,
      implicitRules: Option[UriStr] = None,
      occurrence: Option[AdverseEvent.OccurrenceChoice] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      resultingCondition: LitSeq[Reference] = LitSeq.empty,
      participant: LitSeq[AdverseEvent.Participant] = LitSeq.empty,
      supportingInfo: LitSeq[AdverseEvent.SupportingInfo] = LitSeq.empty,
      preventiveAction: LitSeq[AdverseEvent.PreventiveAction] = LitSeq.empty,
      mitigatingAction: LitSeq[AdverseEvent.MitigatingAction] = LitSeq.empty,
      contributingFactor: LitSeq[AdverseEvent.ContributingFactor] = LitSeq.empty,
      suspectEntity: LitSeq[AdverseEvent.SuspectEntity] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): AdverseEvent = new AdverseEvent(
    id,
    meta,
    text,
    code,
    study,
    status,
    subject,
    outcome,
    language,
    category,
    detected,
    location,
    recorder,
    contained,
    extension,
    actuality,
    encounter,
    identifier,
    seriousness,
    recordedDate,
    implicitRules,
    occurrence,
    modifierExtension,
    resultingCondition,
    participant,
    supportingInfo,
    preventiveAction,
    mitigatingAction,
    contributingFactor,
    suspectEntity,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val code: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("code", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val study: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("study", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val status: FHIRComponentFieldMeta[Code] =
    FHIRComponentFieldMeta("status", lTagOf[Code], false, lTagOf[Code])
  val subject: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("subject", lTagOf[Reference], false, lTagOf[Reference])
  val outcome: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("outcome", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val category: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("category", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val detected: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("detected", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val location: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("location", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val recorder: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("recorder", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val actuality: FHIRComponentFieldMeta[ADVERSE_EVENT_ACTUALITY] =
    FHIRComponentFieldMeta("actuality", lTagOf[ADVERSE_EVENT_ACTUALITY], false, lTagOf[ADVERSE_EVENT_ACTUALITY])
  val encounter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("encounter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val seriousness: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("seriousness", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val recordedDate: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("recordedDate", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val occurrence: FHIRComponentFieldMeta[Option[AdverseEvent.OccurrenceChoice]] =
    FHIRComponentFieldMeta(
      "occurrence",
      lTagOf[Option[AdverseEvent.OccurrenceChoice]],
      true,
      lTagOf[UnionDateTimeOrPeriodOrTiming])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val resultingCondition: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("resultingCondition", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val participant: FHIRComponentFieldMeta[LitSeq[AdverseEvent.Participant]] =
    FHIRComponentFieldMeta("participant", lTagOf[LitSeq[AdverseEvent.Participant]], false, lTagOf[AdverseEvent.Participant])
  val supportingInfo: FHIRComponentFieldMeta[LitSeq[AdverseEvent.SupportingInfo]] =
    FHIRComponentFieldMeta(
      "supportingInfo",
      lTagOf[LitSeq[AdverseEvent.SupportingInfo]],
      false,
      lTagOf[AdverseEvent.SupportingInfo])
  val preventiveAction: FHIRComponentFieldMeta[LitSeq[AdverseEvent.PreventiveAction]] =
    FHIRComponentFieldMeta(
      "preventiveAction",
      lTagOf[LitSeq[AdverseEvent.PreventiveAction]],
      false,
      lTagOf[AdverseEvent.PreventiveAction])
  val mitigatingAction: FHIRComponentFieldMeta[LitSeq[AdverseEvent.MitigatingAction]] =
    FHIRComponentFieldMeta(
      "mitigatingAction",
      lTagOf[LitSeq[AdverseEvent.MitigatingAction]],
      false,
      lTagOf[AdverseEvent.MitigatingAction])
  val contributingFactor: FHIRComponentFieldMeta[LitSeq[AdverseEvent.ContributingFactor]] =
    FHIRComponentFieldMeta(
      "contributingFactor",
      lTagOf[LitSeq[AdverseEvent.ContributingFactor]],
      false,
      lTagOf[AdverseEvent.ContributingFactor])
  val suspectEntity: FHIRComponentFieldMeta[LitSeq[AdverseEvent.SuspectEntity]] =
    FHIRComponentFieldMeta("suspectEntity", lTagOf[LitSeq[AdverseEvent.SuspectEntity]], false, lTagOf[AdverseEvent.SuspectEntity])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    code,
    study,
    status,
    subject,
    outcome,
    language,
    category,
    detected,
    location,
    recorder,
    contained,
    extension,
    actuality,
    encounter,
    identifier,
    seriousness,
    recordedDate,
    implicitRules,
    occurrence,
    modifierExtension,
    resultingCondition,
    participant,
    supportingInfo,
    preventiveAction,
    mitigatingAction,
    contributingFactor,
    suspectEntity
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: AdverseEvent): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[CodeableConcept]](code, t.code),
    FHIRComponentField[LitSeq[Reference]](study, t.study),
    FHIRComponentField[Code](status, t.status),
    FHIRComponentField[Reference](subject, t.subject),
    FHIRComponentField[LitSeq[CodeableConcept]](outcome, t.outcome),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[CodeableConcept]](category, t.category),
    FHIRComponentField[Option[FHIRDateTime]](detected, t.detected),
    FHIRComponentField[Option[Reference]](location, t.location),
    FHIRComponentField[Option[Reference]](recorder, t.recorder),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[ADVERSE_EVENT_ACTUALITY](actuality, t.actuality),
    FHIRComponentField[Option[Reference]](encounter, t.encounter),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[CodeableConcept]](seriousness, t.seriousness),
    FHIRComponentField[Option[FHIRDateTime]](recordedDate, t.recordedDate),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[AdverseEvent.OccurrenceChoice]](occurrence, t.occurrence),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[Reference]](resultingCondition, t.resultingCondition),
    FHIRComponentField[LitSeq[AdverseEvent.Participant]](participant, t.participant),
    FHIRComponentField[LitSeq[AdverseEvent.SupportingInfo]](supportingInfo, t.supportingInfo),
    FHIRComponentField[LitSeq[AdverseEvent.PreventiveAction]](preventiveAction, t.preventiveAction),
    FHIRComponentField[LitSeq[AdverseEvent.MitigatingAction]](mitigatingAction, t.mitigatingAction),
    FHIRComponentField[LitSeq[AdverseEvent.ContributingFactor]](contributingFactor, t.contributingFactor),
    FHIRComponentField[LitSeq[AdverseEvent.SuspectEntity]](suspectEntity, t.suspectEntity)
  )
  def extractId(t: AdverseEvent): Option[String]                                          = t.id
  def extractMeta(t: AdverseEvent): Option[Meta]                                          = t.meta
  def extractText(t: AdverseEvent): Option[Narrative]                                     = t.text
  def extractCode(t: AdverseEvent): Option[CodeableConcept]                               = t.code
  def extractStudy(t: AdverseEvent): LitSeq[Reference]                                    = t.study
  def extractStatus(t: AdverseEvent): Code                                                = t.status
  def extractSubject(t: AdverseEvent): Reference                                          = t.subject
  def extractOutcome(t: AdverseEvent): LitSeq[CodeableConcept]                            = t.outcome
  def extractLanguage(t: AdverseEvent): Option[LANGUAGES]                                 = t.language
  def extractCategory(t: AdverseEvent): LitSeq[CodeableConcept]                           = t.category
  def extractDetected(t: AdverseEvent): Option[FHIRDateTime]                              = t.detected
  def extractLocation(t: AdverseEvent): Option[Reference]                                 = t.location
  def extractRecorder(t: AdverseEvent): Option[Reference]                                 = t.recorder
  def extractContained(t: AdverseEvent): LitSeq[Resource]                                 = t.contained
  def extractExtension(t: AdverseEvent): LitSeq[Extension]                                = t.extension
  def extractActuality(t: AdverseEvent): ADVERSE_EVENT_ACTUALITY                          = t.actuality
  def extractEncounter(t: AdverseEvent): Option[Reference]                                = t.encounter
  def extractIdentifier(t: AdverseEvent): LitSeq[Identifier]                              = t.identifier
  def extractSeriousness(t: AdverseEvent): Option[CodeableConcept]                        = t.seriousness
  def extractRecordedDate(t: AdverseEvent): Option[FHIRDateTime]                          = t.recordedDate
  def extractImplicitRules(t: AdverseEvent): Option[UriStr]                               = t.implicitRules
  def extractOccurrence(t: AdverseEvent): Option[AdverseEvent.OccurrenceChoice]           = t.occurrence
  def extractModifierExtension(t: AdverseEvent): LitSeq[Extension]                        = t.modifierExtension
  def extractResultingCondition(t: AdverseEvent): LitSeq[Reference]                       = t.resultingCondition
  def extractParticipant(t: AdverseEvent): LitSeq[AdverseEvent.Participant]               = t.participant
  def extractSupportingInfo(t: AdverseEvent): LitSeq[AdverseEvent.SupportingInfo]         = t.supportingInfo
  def extractPreventiveAction(t: AdverseEvent): LitSeq[AdverseEvent.PreventiveAction]     = t.preventiveAction
  def extractMitigatingAction(t: AdverseEvent): LitSeq[AdverseEvent.MitigatingAction]     = t.mitigatingAction
  def extractContributingFactor(t: AdverseEvent): LitSeq[AdverseEvent.ContributingFactor] = t.contributingFactor
  def extractSuspectEntity(t: AdverseEvent): LitSeq[AdverseEvent.SuspectEntity]           = t.suspectEntity
  override val thisName: String                                                           = "AdverseEvent"
  override val searchParams: Map[String, AdverseEvent => Seq[Any]] = Map(
    "substance"          -> (obj => obj.suspectEntity.map(_.instance).flatMap(_.as[Reference]).toSeq),
    "location"           -> (obj => obj.location.toSeq),
    "subject"            -> (obj => Seq(obj.subject)),
    "identifier"         -> (obj => obj.identifier.toSeq),
    "code"               -> (obj => obj.code.toSeq),
    "date"               -> (obj => obj.occurrence.toSeq),
    "status"             -> (obj => Seq(obj.status)),
    "resultingcondition" -> (obj => obj.resultingCondition.toSeq),
    "actuality"          -> (obj => Seq(obj.actuality)),
    "study"              -> (obj => obj.study.toSeq),
    "category"           -> (obj => obj.category.toSeq),
    "seriousness"        -> (obj => obj.seriousness.toSeq),
    "recorder"           -> (obj => obj.recorder.toSeq),
    "patient"            -> (obj => Seq(obj.subject))
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[AdverseEvent] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new AdverseEvent(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("code", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("study", Some(LitSeq.empty)),
          cursor.decodeAs[Code]("status", None),
          cursor.decodeAs[Reference]("subject", None),
          cursor.decodeAs[LitSeq[CodeableConcept]]("outcome", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("category", Some(LitSeq.empty)),
          cursor.decodeAs[Option[FHIRDateTime]]("detected", Some(None)),
          cursor.decodeAs[Option[Reference]]("location", Some(None)),
          cursor.decodeAs[Option[Reference]]("recorder", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[ADVERSE_EVENT_ACTUALITY]("actuality", None),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("seriousness", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("recordedDate", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeOptRef[UnionDateTimeOrPeriodOrTiming]("occurrence"),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("resultingCondition", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[AdverseEvent.Participant]]("participant", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[AdverseEvent.SupportingInfo]]("supportingInfo", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[AdverseEvent.PreventiveAction]]("preventiveAction", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[AdverseEvent.MitigatingAction]]("mitigatingAction", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[AdverseEvent.ContributingFactor]]("contributingFactor", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[AdverseEvent.SuspectEntity]]("suspectEntity", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** An event (i.e. any change to current patient status) that may be related to unintended effects on a patient or research
  * subject. The unintended effects may require additional monitoring, treatment or hospitalization or may result in death. The
  * AdverseEvent resource also extends to potential or avoided events that could have had such effects.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields code, study, status, subject, outcome, category, detected, location, recorder, actuality, encounter,
  *   identifier, seriousness, recordedDate, occurrence, resultingCondition, participant, supportingInfo, preventiveAction,
  *   mitigatingAction, contributingFactor, suspectEntity.
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
  * @param code
  *   - Specific event that occurred or that was averted, such as patient fall, wrong organ removed, or wrong blood transfused.
  * @param study
  *   - The research study that the subject is enrolled in.
  * @param status
  *   - The current state of the adverse event or potential adverse event.
  * @param subject
  *   - This subject or group impacted by the event.
  * @param outcome
  *   - Describes the type of outcome from the adverse event, such as resolved, recovering, ongoing, resolved-with-sequelae, or
  *   fatal.
  * @param language
  *   - The base language in which the resource is written.
  * @param category
  *   - The overall type of event, intended for search and filtering purposes.
  * @param detected
  *   - Estimated or actual date the AdverseEvent began, in the opinion of the reporter.
  * @param location
  *   - The information about where the adverse event occurred.
  * @param recorder
  *   - Information on who recorded the adverse event. May be the patient or a practitioner.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param actuality
  *   - Whether the event actually happened, or just had the potential to. Note that this is independent of whether anyone was
  *   affected or harmed or how severely.
  * @param encounter
  *   - The Encounter associated with the start of the AdverseEvent.
  * @param identifier
  *   - Business identifiers assigned to this adverse event by the performer or other systems which remain constant as the
  *   resource is updated and propagates from server to server.
  * @param seriousness
  *   - Assessment whether this event, or averted event, was of clinical importance.
  * @param recordedDate
  *   - The date on which the existence of the AdverseEvent was first recorded.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param occurrence
  *   - The date (and perhaps time) when the adverse event occurred.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *   the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually
  *   modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict
  *   set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param resultingCondition
  *   - Information about the condition that occurred as a result of the adverse event, such as hives due to the exposure to a
  *   substance (for example, a drug or a chemical) or a broken leg as a result of the fall.
  * @param participant
  *   - Indicates who or what participated in the adverse event and how they were involved.
  * @param supportingInfo
  *   - Supporting information relevant to the event.
  * @param preventiveAction
  *   - Preventive actions that contributed to avoiding the adverse event.
  * @param mitigatingAction
  *   - The ameliorating action taken after the adverse event occured in order to reduce the extent of harm.
  * @param contributingFactor
  *   - The contributing factors suspected to have increased the probability or severity of the adverse event.
  * @param suspectEntity
  *   - Describes the entity that is suspected to have caused the adverse event.
  */
@POJOBoilerplate
class AdverseEvent(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val code: Option[CodeableConcept] = None,
    val study: LitSeq[Reference] = LitSeq.empty,
    val status: Code,
    val subject: Reference,
    val outcome: LitSeq[CodeableConcept] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    val category: LitSeq[CodeableConcept] = LitSeq.empty,
    val detected: Option[FHIRDateTime] = None,
    val location: Option[Reference] = None,
    val recorder: Option[Reference] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val actuality: ADVERSE_EVENT_ACTUALITY,
    val encounter: Option[Reference] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val seriousness: Option[CodeableConcept] = None,
    val recordedDate: Option[FHIRDateTime] = None,
    override val implicitRules: Option[UriStr] = None,
    val occurrence: Option[AdverseEvent.OccurrenceChoice] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val resultingCondition: LitSeq[Reference] = LitSeq.empty,
    val participant: LitSeq[AdverseEvent.Participant] = LitSeq.empty,
    val supportingInfo: LitSeq[AdverseEvent.SupportingInfo] = LitSeq.empty,
    val preventiveAction: LitSeq[AdverseEvent.PreventiveAction] = LitSeq.empty,
    val mitigatingAction: LitSeq[AdverseEvent.MitigatingAction] = LitSeq.empty,
    val contributingFactor: LitSeq[AdverseEvent.ContributingFactor] = LitSeq.empty,
    val suspectEntity: LitSeq[AdverseEvent.SuspectEntity] = LitSeq.empty,
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
  override val thisTypeName: String = "AdverseEvent"
}
