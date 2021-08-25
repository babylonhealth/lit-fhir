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
import com.babylonhealth.lit.hl7.PUBLICATION_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object ResearchStudy extends CompanionFor[ResearchStudy] {
  implicit def summonObjectAndCompanionResearchStudy241302297(
      o: ResearchStudy): ObjectAndCompanion[ResearchStudy, ResearchStudy.type] = ObjectAndCompanion(o, this)
  override type ResourceType = ResearchStudy
  override type ParentType   = ResearchStudy
  override val baseType: CompanionFor[ResourceType] = ResearchStudy
  override val parentType: CompanionFor[ParentType] = ResearchStudy
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/ResearchStudy")
  object ComparisonGroup extends CompanionFor[ComparisonGroup] {
    implicit def summonObjectAndCompanionComparisonGroup_1669158500(
        o: ComparisonGroup): ObjectAndCompanion[ComparisonGroup, ComparisonGroup.type] = ObjectAndCompanion(o, this)
    override type ResourceType = ComparisonGroup
    override type ParentType   = ComparisonGroup
    override val parentType: CompanionFor[ResourceType] = ComparisonGroup
    type IdentifierChoice = Choice[UnionIdentifierOrUri]
    def apply(
        id: Option[String] = None,
        name: String,
        `type`: Option[CodeableConcept] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        description: Option[Markdown] = None,
        identifier: Option[ComparisonGroup.IdentifierChoice] = None,
        observedGroup: Option[Reference] = None,
        intendedExposure: LitSeq[Reference] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): ComparisonGroup = new ComparisonGroup(
      id,
      name,
      `type`,
      extension,
      description,
      identifier,
      observedGroup,
      intendedExposure,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: ComparisonGroup): Option[(Option[String], String, Option[CodeableConcept], LitSeq[Extension], Option[Markdown], Option[ComparisonGroup.IdentifierChoice], Option[Reference], LitSeq[Reference], LitSeq[Extension])] =
      Some(
        (
          o.id,
          o.name,
          o.`type`,
          o.extension,
          o.description,
          o.identifier,
          o.observedGroup,
          o.intendedExposure,
          o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val name: FHIRComponentFieldMeta[String] =
      FHIRComponentFieldMeta("name", lTagOf[String], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val description: FHIRComponentFieldMeta[Option[Markdown]] =
      FHIRComponentFieldMeta("description", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
    val identifier: FHIRComponentFieldMeta[Option[ComparisonGroup.IdentifierChoice]] =
      FHIRComponentFieldMeta("identifier", lTagOf[Option[ComparisonGroup.IdentifierChoice]], true, lTagOf[UnionIdentifierOrUri])
    val observedGroup: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("observedGroup", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val intendedExposure: FHIRComponentFieldMeta[LitSeq[Reference]] =
      FHIRComponentFieldMeta("intendedExposure", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, name, `type`, extension, description, identifier, observedGroup, intendedExposure, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: ComparisonGroup): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[String](name, t.name),
      FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Markdown]](description, t.description),
      FHIRComponentField[Option[ComparisonGroup.IdentifierChoice]](identifier, t.identifier),
      FHIRComponentField[Option[Reference]](observedGroup, t.observedGroup),
      FHIRComponentField[LitSeq[Reference]](intendedExposure, t.intendedExposure),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[ComparisonGroup] = this
    val thisName: String                        = "ComparisonGroup"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ComparisonGroup] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new ComparisonGroup(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[String]("name", None),
            cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Markdown]]("description", Some(None)),
            cursor.decodeOptRef[UnionIdentifierOrUri]("identifier"),
            cursor.decodeAs[Option[Reference]]("observedGroup", Some(None)),
            cursor.decodeAs[LitSeq[Reference]]("intendedExposure", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class ComparisonGroup(
      override val id: Option[String] = None,
      val name: String,
      val `type`: Option[CodeableConcept] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val description: Option[Markdown] = None,
      val identifier: Option[ComparisonGroup.IdentifierChoice] = None,
      val observedGroup: Option[Reference] = None,
      val intendedExposure: LitSeq[Reference] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object AssociatedParty extends CompanionFor[AssociatedParty] {
    implicit def summonObjectAndCompanionAssociatedParty_1669158500(
        o: AssociatedParty): ObjectAndCompanion[AssociatedParty, AssociatedParty.type] = ObjectAndCompanion(o, this)
    override type ResourceType = AssociatedParty
    override type ParentType   = AssociatedParty
    override val parentType: CompanionFor[ResourceType] = AssociatedParty
    def apply(
        id: Option[String] = None,
        name: Option[String] = None,
        role: CodeableConcept,
        party: Option[Reference] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        classifier: LitSeq[CodeableConcept] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): AssociatedParty = new AssociatedParty(
      id,
      name,
      role,
      party,
      extension,
      classifier,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: AssociatedParty): Option[(Option[String], Option[String], CodeableConcept, Option[Reference], LitSeq[Extension], LitSeq[CodeableConcept], LitSeq[Extension])] =
      Some((o.id, o.name, o.role, o.party, o.extension, o.classifier, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val name: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("name", lTagOf[Option[String]], false, lTagOf[String])
    val role: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("role", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val party: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("party", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val classifier: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("classifier", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, name, role, party, extension, classifier, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: AssociatedParty): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[String]](name, t.name),
      FHIRComponentField[CodeableConcept](role, t.role),
      FHIRComponentField[Option[Reference]](party, t.party),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[CodeableConcept]](classifier, t.classifier),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[AssociatedParty] = this
    val thisName: String                        = "AssociatedParty"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[AssociatedParty] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new AssociatedParty(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[String]]("name", Some(None)),
            cursor.decodeAs[CodeableConcept]("role", None),
            cursor.decodeAs[Option[Reference]]("party", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("classifier", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class AssociatedParty(
      override val id: Option[String] = None,
      val name: Option[String] = None,
      val role: CodeableConcept,
      val party: Option[Reference] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val classifier: LitSeq[CodeableConcept] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object OutcomeMeasure extends CompanionFor[OutcomeMeasure] {
    implicit def summonObjectAndCompanionOutcomeMeasure_1669158500(
        o: OutcomeMeasure): ObjectAndCompanion[OutcomeMeasure, OutcomeMeasure.type] = ObjectAndCompanion(o, this)
    override type ResourceType = OutcomeMeasure
    override type ParentType   = OutcomeMeasure
    override val parentType: CompanionFor[ResourceType] = OutcomeMeasure
    def apply(
        id: Option[String] = None,
        name: Option[String] = None,
        `type`: LitSeq[CodeableConcept] = LitSeq.empty,
        extension: LitSeq[Extension] = LitSeq.empty,
        reference: Option[Reference] = None,
        description: Option[Markdown] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): OutcomeMeasure = new OutcomeMeasure(
      id,
      name,
      `type`,
      extension,
      reference,
      description,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: OutcomeMeasure): Option[(Option[String], Option[String], LitSeq[CodeableConcept], LitSeq[Extension], Option[Reference], Option[Markdown], LitSeq[Extension])] =
      Some((o.id, o.name, o.`type`, o.extension, o.reference, o.description, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val name: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("name", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val reference: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("reference", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val description: FHIRComponentFieldMeta[Option[Markdown]] =
      FHIRComponentFieldMeta("description", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, name, `type`, extension, reference, description, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: OutcomeMeasure): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[String]](name, t.name),
      FHIRComponentField[LitSeq[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Reference]](reference, t.reference),
      FHIRComponentField[Option[Markdown]](description, t.description),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[OutcomeMeasure] = this
    val thisName: String                       = "OutcomeMeasure"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[OutcomeMeasure] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new OutcomeMeasure(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[String]]("name", Some(None)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("type", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Reference]]("reference", Some(None)),
            cursor.decodeAs[Option[Markdown]]("description", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class OutcomeMeasure(
      override val id: Option[String] = None,
      val name: Option[String] = None,
      val `type`: LitSeq[CodeableConcept] = LitSeq.empty,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val reference: Option[Reference] = None,
      val description: Option[Markdown] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Classification extends CompanionFor[Classification] {
    implicit def summonObjectAndCompanionClassification_1669158500(
        o: Classification): ObjectAndCompanion[Classification, Classification.type] = ObjectAndCompanion(o, this)
    override type ResourceType = Classification
    override type ParentType   = Classification
    override val parentType: CompanionFor[ResourceType] = Classification
    def apply(
        id: Option[String] = None,
        `type`: Option[CodeableConcept] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        classifier: LitSeq[CodeableConcept] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Classification = new Classification(
      id,
      `type`,
      extension,
      classifier,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Classification): Option[(Option[String], Option[CodeableConcept], LitSeq[Extension], LitSeq[CodeableConcept], LitSeq[Extension])] =
      Some((o.id, o.`type`, o.extension, o.classifier, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val classifier: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("classifier", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, `type`, extension, classifier, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Classification): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[CodeableConcept]](classifier, t.classifier),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Classification] = this
    val thisName: String                       = "Classification"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Classification] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Classification(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("classifier", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Classification(
      override val id: Option[String] = None,
      val `type`: Option[CodeableConcept] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val classifier: LitSeq[CodeableConcept] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object WebLocation extends CompanionFor[WebLocation] {
    implicit def summonObjectAndCompanionWebLocation_1669158500(
        o: WebLocation): ObjectAndCompanion[WebLocation, WebLocation.type] = ObjectAndCompanion(o, this)
    override type ResourceType = WebLocation
    override type ParentType   = WebLocation
    override val parentType: CompanionFor[ResourceType] = WebLocation
    def apply(
        id: Option[String] = None,
        url: UriStr,
        `type`: Option[CodeableConcept] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): WebLocation = new WebLocation(
      id,
      url,
      `type`,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(o: WebLocation): Option[(Option[String], UriStr, Option[CodeableConcept], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.url, o.`type`, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val url: FHIRComponentFieldMeta[UriStr] =
      FHIRComponentFieldMeta("url", lTagOf[UriStr], false, lTagOf[UriStr])
    val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, url, `type`, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: WebLocation): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[UriStr](url, t.url),
      FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[WebLocation] = this
    val thisName: String                    = "WebLocation"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[WebLocation] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new WebLocation(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[UriStr]("url", None),
            cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class WebLocation(
      override val id: Option[String] = None,
      val url: UriStr,
      val `type`: Option[CodeableConcept] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Recruitment extends CompanionFor[Recruitment] {
    implicit def summonObjectAndCompanionRecruitment_1669158500(
        o: Recruitment): ObjectAndCompanion[Recruitment, Recruitment.type] = ObjectAndCompanion(o, this)
    override type ResourceType = Recruitment
    override type ParentType   = Recruitment
    override val parentType: CompanionFor[ResourceType] = Recruitment
    def apply(
        id: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        eligibility: Option[Reference] = None,
        actualGroup: Option[Reference] = None,
        targetNumber: Option[UnsignedInt] = None,
        actualNumber: Option[UnsignedInt] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Recruitment = new Recruitment(
      id,
      extension,
      eligibility,
      actualGroup,
      targetNumber,
      actualNumber,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Recruitment): Option[(Option[String], LitSeq[Extension], Option[Reference], Option[Reference], Option[UnsignedInt], Option[UnsignedInt], LitSeq[Extension])] =
      Some((o.id, o.extension, o.eligibility, o.actualGroup, o.targetNumber, o.actualNumber, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val eligibility: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("eligibility", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val actualGroup: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("actualGroup", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val targetNumber: FHIRComponentFieldMeta[Option[UnsignedInt]] =
      FHIRComponentFieldMeta("targetNumber", lTagOf[Option[UnsignedInt]], false, lTagOf[UnsignedInt])
    val actualNumber: FHIRComponentFieldMeta[Option[UnsignedInt]] =
      FHIRComponentFieldMeta("actualNumber", lTagOf[Option[UnsignedInt]], false, lTagOf[UnsignedInt])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, extension, eligibility, actualGroup, targetNumber, actualNumber, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Recruitment): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Reference]](eligibility, t.eligibility),
      FHIRComponentField[Option[Reference]](actualGroup, t.actualGroup),
      FHIRComponentField[Option[UnsignedInt]](targetNumber, t.targetNumber),
      FHIRComponentField[Option[UnsignedInt]](actualNumber, t.actualNumber),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Recruitment] = this
    val thisName: String                    = "Recruitment"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Recruitment] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Recruitment(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Reference]]("eligibility", Some(None)),
            cursor.decodeAs[Option[Reference]]("actualGroup", Some(None)),
            cursor.decodeAs[Option[UnsignedInt]]("targetNumber", Some(None)),
            cursor.decodeAs[Option[UnsignedInt]]("actualNumber", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Recruitment(
      override val id: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val eligibility: Option[Reference] = None,
      val actualGroup: Option[Reference] = None,
      val targetNumber: Option[UnsignedInt] = None,
      val actualNumber: Option[UnsignedInt] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object StatusDate extends CompanionFor[StatusDate] {
    implicit def summonObjectAndCompanionStatusDate_1669158500(o: StatusDate): ObjectAndCompanion[StatusDate, StatusDate.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = StatusDate
    override type ParentType   = StatusDate
    override val parentType: CompanionFor[ResourceType] = StatusDate
    def apply(
        id: Option[String] = None,
        actual: Option[Boolean] = None,
        period: Period,
        activity: CodeableConcept,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): StatusDate = new StatusDate(
      id,
      actual,
      period,
      activity,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: StatusDate): Option[(Option[String], Option[Boolean], Period, CodeableConcept, LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.actual, o.period, o.activity, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val actual: FHIRComponentFieldMeta[Option[Boolean]] =
      FHIRComponentFieldMeta("actual", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
    val period: FHIRComponentFieldMeta[Period] =
      FHIRComponentFieldMeta("period", lTagOf[Period], false, lTagOf[Period])
    val activity: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("activity", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, actual, period, activity, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: StatusDate): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Boolean]](actual, t.actual),
      FHIRComponentField[Period](period, t.period),
      FHIRComponentField[CodeableConcept](activity, t.activity),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[StatusDate] = this
    val thisName: String                   = "StatusDate"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[StatusDate] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new StatusDate(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[Boolean]]("actual", Some(None)),
            cursor.decodeAs[Period]("period", None),
            cursor.decodeAs[CodeableConcept]("activity", None),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class StatusDate(
      override val id: Option[String] = None,
      val actual: Option[Boolean] = None,
      val period: Period,
      val activity: CodeableConcept,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Objective extends CompanionFor[Objective] {
    implicit def summonObjectAndCompanionObjective_1669158500(o: Objective): ObjectAndCompanion[Objective, Objective.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Objective
    override type ParentType   = Objective
    override val parentType: CompanionFor[ResourceType] = Objective
    def apply(
        id: Option[String] = None,
        name: Option[String] = None,
        `type`: Option[CodeableConcept] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        description: Option[Markdown] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Objective = new Objective(
      id,
      name,
      `type`,
      extension,
      description,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Objective): Option[(Option[String], Option[String], Option[CodeableConcept], LitSeq[Extension], Option[Markdown], LitSeq[Extension])] =
      Some((o.id, o.name, o.`type`, o.extension, o.description, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val name: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("name", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val description: FHIRComponentFieldMeta[Option[Markdown]] =
      FHIRComponentFieldMeta("description", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, name, `type`, extension, description, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Objective): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[String]](name, t.name),
      FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Markdown]](description, t.description),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Objective] = this
    val thisName: String                  = "Objective"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Objective] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Objective(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[String]]("name", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Markdown]]("description", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Objective(
      override val id: Option[String] = None,
      val name: Option[String] = None,
      val `type`: Option[CodeableConcept] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val description: Option[Markdown] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Focus extends CompanionFor[Focus] {
    implicit def summonObjectAndCompanionFocus_1669158500(o: Focus): ObjectAndCompanion[Focus, Focus.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Focus
    override type ParentType   = Focus
    override val parentType: CompanionFor[ResourceType] = Focus
    def apply(
        id: Option[String] = None,
        factor: Option[Markdown] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        focusType: LitSeq[CodeableConcept] = LitSeq.empty,
        productCode: Option[CodeableConcept] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Focus = new Focus(
      id,
      factor,
      extension,
      focusType,
      productCode,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Focus): Option[(Option[String], Option[Markdown], LitSeq[Extension], LitSeq[CodeableConcept], Option[CodeableConcept], LitSeq[Extension])] =
      Some((o.id, o.factor, o.extension, o.focusType, o.productCode, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val factor: FHIRComponentFieldMeta[Option[Markdown]] =
      FHIRComponentFieldMeta("factor", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val focusType: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("focusType", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val productCode: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("productCode", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, factor, extension, focusType, productCode, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Focus): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Markdown]](factor, t.factor),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[CodeableConcept]](focusType, t.focusType),
      FHIRComponentField[Option[CodeableConcept]](productCode, t.productCode),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Focus] = this
    val thisName: String              = "Focus"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Focus] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Focus(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[Markdown]]("factor", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("focusType", Some(LitSeq.empty)),
            cursor.decodeAs[Option[CodeableConcept]]("productCode", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Focus(
      override val id: Option[String] = None,
      val factor: Option[Markdown] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val focusType: LitSeq[CodeableConcept] = LitSeq.empty,
      val productCode: Option[CodeableConcept] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Label extends CompanionFor[Label] {
    implicit def summonObjectAndCompanionLabel_1669158500(o: Label): ObjectAndCompanion[Label, Label.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Label
    override type ParentType   = Label
    override val parentType: CompanionFor[ResourceType] = Label
    def apply(
        id: Option[String] = None,
        `type`: Option[CodeableConcept] = None,
        value: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Label = new Label(
      id,
      `type`,
      value,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Label): Option[(Option[String], Option[CodeableConcept], Option[String], LitSeq[Extension], LitSeq[Extension])] = Some(
      (o.id, o.`type`, o.value, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val value: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("value", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, `type`, value, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Label): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[Option[String]](value, t.value),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Label] = this
    val thisName: String              = "Label"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Label] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Label(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
            cursor.decodeAs[Option[String]]("value", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Label(
      override val id: Option[String] = None,
      val `type`: Option[CodeableConcept] = None,
      val value: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      url: Option[UriStr] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      name: Option[String] = None,
      date: Option[FHIRDateTime] = None,
      site: LitSeq[Reference] = LitSeq.empty,
      note: LitSeq[Annotation] = LitSeq.empty,
      title: Option[String] = None,
      phase: Option[CodeableConcept] = None,
      partOf: LitSeq[Reference] = LitSeq.empty,
      status: PUBLICATION_STATUS,
      period: Option[Period] = None,
      result: LitSeq[Reference] = LitSeq.empty,
      version: Option[String] = None,
      keyword: LitSeq[CodeableConcept] = LitSeq.empty,
      contact: LitSeq[ContactDetail] = LitSeq.empty,
      sponsor: Option[Reference] = None,
      language: Option[LANGUAGES] = None,
      protocol: LitSeq[Reference] = LitSeq.empty,
      category: LitSeq[CodeableConcept] = LitSeq.empty,
      location: LitSeq[CodeableConcept] = LitSeq.empty,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      condition: LitSeq[CodeableConcept] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      whyStopped: Option[CodeableConcept] = None,
      description: Option[Markdown] = None,
      currentState: LitSeq[CodeableConcept] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      relatedArtifact: LitSeq[RelatedArtifact] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      primaryPurposeType: Option[CodeableConcept] = None,
      descriptionSummary: Option[Markdown] = None,
      principalInvestigator: Option[Reference] = None,
      label: LitSeq[ResearchStudy.Label] = LitSeq.empty,
      focus: LitSeq[ResearchStudy.Focus] = LitSeq.empty,
      objective: LitSeq[ResearchStudy.Objective] = LitSeq.empty,
      statusDate: LitSeq[ResearchStudy.StatusDate] = LitSeq.empty,
      recruitment: Option[ResearchStudy.Recruitment] = None,
      webLocation: LitSeq[ResearchStudy.WebLocation] = LitSeq.empty,
      classification: LitSeq[ResearchStudy.Classification] = LitSeq.empty,
      outcomeMeasure: LitSeq[ResearchStudy.OutcomeMeasure] = LitSeq.empty,
      associatedParty: LitSeq[ResearchStudy.AssociatedParty] = LitSeq.empty,
      comparisonGroup: LitSeq[ResearchStudy.ComparisonGroup] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): ResearchStudy = new ResearchStudy(
    id,
    url,
    meta,
    text,
    name,
    date,
    site,
    note,
    title,
    phase,
    partOf,
    status,
    period,
    result,
    version,
    keyword,
    contact,
    sponsor,
    language,
    protocol,
    category,
    location,
    contained,
    extension,
    condition,
    identifier,
    whyStopped,
    description,
    currentState,
    implicitRules,
    relatedArtifact,
    modifierExtension,
    primaryPurposeType,
    descriptionSummary,
    principalInvestigator,
    label,
    focus,
    objective,
    statusDate,
    recruitment,
    webLocation,
    classification,
    outcomeMeasure,
    associatedParty,
    comparisonGroup,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val url: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("url", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val name: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("name", lTagOf[Option[String]], false, lTagOf[String])
  val date: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("date", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val site: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("site", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val title: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("title", lTagOf[Option[String]], false, lTagOf[String])
  val phase: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("phase", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val partOf: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("partOf", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val status: FHIRComponentFieldMeta[PUBLICATION_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[PUBLICATION_STATUS], false, lTagOf[PUBLICATION_STATUS])
  val period: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("period", lTagOf[Option[Period]], false, lTagOf[Period])
  val result: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("result", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val version: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("version", lTagOf[Option[String]], false, lTagOf[String])
  val keyword: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("keyword", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val contact: FHIRComponentFieldMeta[LitSeq[ContactDetail]] =
    FHIRComponentFieldMeta("contact", lTagOf[LitSeq[ContactDetail]], false, lTagOf[ContactDetail])
  val sponsor: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("sponsor", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val protocol: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("protocol", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val category: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("category", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val location: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("location", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val condition: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("condition", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val whyStopped: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("whyStopped", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val description: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("description", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val currentState: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("currentState", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val relatedArtifact: FHIRComponentFieldMeta[LitSeq[RelatedArtifact]] =
    FHIRComponentFieldMeta("relatedArtifact", lTagOf[LitSeq[RelatedArtifact]], false, lTagOf[RelatedArtifact])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val primaryPurposeType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("primaryPurposeType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val descriptionSummary: FHIRComponentFieldMeta[Option[Markdown]] =
    FHIRComponentFieldMeta("descriptionSummary", lTagOf[Option[Markdown]], false, lTagOf[Markdown])
  val principalInvestigator: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("principalInvestigator", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val label: FHIRComponentFieldMeta[LitSeq[ResearchStudy.Label]] =
    FHIRComponentFieldMeta("label", lTagOf[LitSeq[ResearchStudy.Label]], false, lTagOf[ResearchStudy.Label])
  val focus: FHIRComponentFieldMeta[LitSeq[ResearchStudy.Focus]] =
    FHIRComponentFieldMeta("focus", lTagOf[LitSeq[ResearchStudy.Focus]], false, lTagOf[ResearchStudy.Focus])
  val objective: FHIRComponentFieldMeta[LitSeq[ResearchStudy.Objective]] =
    FHIRComponentFieldMeta("objective", lTagOf[LitSeq[ResearchStudy.Objective]], false, lTagOf[ResearchStudy.Objective])
  val statusDate: FHIRComponentFieldMeta[LitSeq[ResearchStudy.StatusDate]] =
    FHIRComponentFieldMeta("statusDate", lTagOf[LitSeq[ResearchStudy.StatusDate]], false, lTagOf[ResearchStudy.StatusDate])
  val recruitment: FHIRComponentFieldMeta[Option[ResearchStudy.Recruitment]] =
    FHIRComponentFieldMeta("recruitment", lTagOf[Option[ResearchStudy.Recruitment]], false, lTagOf[ResearchStudy.Recruitment])
  val webLocation: FHIRComponentFieldMeta[LitSeq[ResearchStudy.WebLocation]] =
    FHIRComponentFieldMeta("webLocation", lTagOf[LitSeq[ResearchStudy.WebLocation]], false, lTagOf[ResearchStudy.WebLocation])
  val classification: FHIRComponentFieldMeta[LitSeq[ResearchStudy.Classification]] =
    FHIRComponentFieldMeta(
      "classification",
      lTagOf[LitSeq[ResearchStudy.Classification]],
      false,
      lTagOf[ResearchStudy.Classification])
  val outcomeMeasure: FHIRComponentFieldMeta[LitSeq[ResearchStudy.OutcomeMeasure]] =
    FHIRComponentFieldMeta(
      "outcomeMeasure",
      lTagOf[LitSeq[ResearchStudy.OutcomeMeasure]],
      false,
      lTagOf[ResearchStudy.OutcomeMeasure])
  val associatedParty: FHIRComponentFieldMeta[LitSeq[ResearchStudy.AssociatedParty]] =
    FHIRComponentFieldMeta(
      "associatedParty",
      lTagOf[LitSeq[ResearchStudy.AssociatedParty]],
      false,
      lTagOf[ResearchStudy.AssociatedParty])
  val comparisonGroup: FHIRComponentFieldMeta[LitSeq[ResearchStudy.ComparisonGroup]] =
    FHIRComponentFieldMeta(
      "comparisonGroup",
      lTagOf[LitSeq[ResearchStudy.ComparisonGroup]],
      false,
      lTagOf[ResearchStudy.ComparisonGroup])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    url,
    meta,
    text,
    name,
    date,
    site,
    note,
    title,
    phase,
    partOf,
    status,
    period,
    result,
    version,
    keyword,
    contact,
    sponsor,
    language,
    protocol,
    category,
    location,
    contained,
    extension,
    condition,
    identifier,
    whyStopped,
    description,
    currentState,
    implicitRules,
    relatedArtifact,
    modifierExtension,
    primaryPurposeType,
    descriptionSummary,
    principalInvestigator,
    label,
    focus,
    objective,
    statusDate,
    recruitment,
    webLocation,
    classification,
    outcomeMeasure,
    associatedParty,
    comparisonGroup
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: ResearchStudy): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[UriStr]](url, t.url),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[String]](name, t.name),
    FHIRComponentField[Option[FHIRDateTime]](date, t.date),
    FHIRComponentField[LitSeq[Reference]](site, t.site),
    FHIRComponentField[LitSeq[Annotation]](note, t.note),
    FHIRComponentField[Option[String]](title, t.title),
    FHIRComponentField[Option[CodeableConcept]](phase, t.phase),
    FHIRComponentField[LitSeq[Reference]](partOf, t.partOf),
    FHIRComponentField[PUBLICATION_STATUS](status, t.status),
    FHIRComponentField[Option[Period]](period, t.period),
    FHIRComponentField[LitSeq[Reference]](result, t.result),
    FHIRComponentField[Option[String]](version, t.version),
    FHIRComponentField[LitSeq[CodeableConcept]](keyword, t.keyword),
    FHIRComponentField[LitSeq[ContactDetail]](contact, t.contact),
    FHIRComponentField[Option[Reference]](sponsor, t.sponsor),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Reference]](protocol, t.protocol),
    FHIRComponentField[LitSeq[CodeableConcept]](category, t.category),
    FHIRComponentField[LitSeq[CodeableConcept]](location, t.location),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[CodeableConcept]](condition, t.condition),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[CodeableConcept]](whyStopped, t.whyStopped),
    FHIRComponentField[Option[Markdown]](description, t.description),
    FHIRComponentField[LitSeq[CodeableConcept]](currentState, t.currentState),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[RelatedArtifact]](relatedArtifact, t.relatedArtifact),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Option[CodeableConcept]](primaryPurposeType, t.primaryPurposeType),
    FHIRComponentField[Option[Markdown]](descriptionSummary, t.descriptionSummary),
    FHIRComponentField[Option[Reference]](principalInvestigator, t.principalInvestigator),
    FHIRComponentField[LitSeq[ResearchStudy.Label]](label, t.label),
    FHIRComponentField[LitSeq[ResearchStudy.Focus]](focus, t.focus),
    FHIRComponentField[LitSeq[ResearchStudy.Objective]](objective, t.objective),
    FHIRComponentField[LitSeq[ResearchStudy.StatusDate]](statusDate, t.statusDate),
    FHIRComponentField[Option[ResearchStudy.Recruitment]](recruitment, t.recruitment),
    FHIRComponentField[LitSeq[ResearchStudy.WebLocation]](webLocation, t.webLocation),
    FHIRComponentField[LitSeq[ResearchStudy.Classification]](classification, t.classification),
    FHIRComponentField[LitSeq[ResearchStudy.OutcomeMeasure]](outcomeMeasure, t.outcomeMeasure),
    FHIRComponentField[LitSeq[ResearchStudy.AssociatedParty]](associatedParty, t.associatedParty),
    FHIRComponentField[LitSeq[ResearchStudy.ComparisonGroup]](comparisonGroup, t.comparisonGroup)
  )
  def extractId(t: ResearchStudy): Option[String]                                     = t.id
  def extractUrl(t: ResearchStudy): Option[UriStr]                                    = t.url
  def extractMeta(t: ResearchStudy): Option[Meta]                                     = t.meta
  def extractText(t: ResearchStudy): Option[Narrative]                                = t.text
  def extractName(t: ResearchStudy): Option[String]                                   = t.name
  def extractDate(t: ResearchStudy): Option[FHIRDateTime]                             = t.date
  def extractSite(t: ResearchStudy): LitSeq[Reference]                                = t.site
  def extractNote(t: ResearchStudy): LitSeq[Annotation]                               = t.note
  def extractTitle(t: ResearchStudy): Option[String]                                  = t.title
  def extractPhase(t: ResearchStudy): Option[CodeableConcept]                         = t.phase
  def extractPartOf(t: ResearchStudy): LitSeq[Reference]                              = t.partOf
  def extractStatus(t: ResearchStudy): PUBLICATION_STATUS                             = t.status
  def extractPeriod(t: ResearchStudy): Option[Period]                                 = t.period
  def extractResult(t: ResearchStudy): LitSeq[Reference]                              = t.result
  def extractVersion(t: ResearchStudy): Option[String]                                = t.version
  def extractKeyword(t: ResearchStudy): LitSeq[CodeableConcept]                       = t.keyword
  def extractContact(t: ResearchStudy): LitSeq[ContactDetail]                         = t.contact
  def extractSponsor(t: ResearchStudy): Option[Reference]                             = t.sponsor
  def extractLanguage(t: ResearchStudy): Option[LANGUAGES]                            = t.language
  def extractProtocol(t: ResearchStudy): LitSeq[Reference]                            = t.protocol
  def extractCategory(t: ResearchStudy): LitSeq[CodeableConcept]                      = t.category
  def extractLocation(t: ResearchStudy): LitSeq[CodeableConcept]                      = t.location
  def extractContained(t: ResearchStudy): LitSeq[Resource]                            = t.contained
  def extractExtension(t: ResearchStudy): LitSeq[Extension]                           = t.extension
  def extractCondition(t: ResearchStudy): LitSeq[CodeableConcept]                     = t.condition
  def extractIdentifier(t: ResearchStudy): LitSeq[Identifier]                         = t.identifier
  def extractWhyStopped(t: ResearchStudy): Option[CodeableConcept]                    = t.whyStopped
  def extractDescription(t: ResearchStudy): Option[Markdown]                          = t.description
  def extractCurrentState(t: ResearchStudy): LitSeq[CodeableConcept]                  = t.currentState
  def extractImplicitRules(t: ResearchStudy): Option[UriStr]                          = t.implicitRules
  def extractRelatedArtifact(t: ResearchStudy): LitSeq[RelatedArtifact]               = t.relatedArtifact
  def extractModifierExtension(t: ResearchStudy): LitSeq[Extension]                   = t.modifierExtension
  def extractPrimaryPurposeType(t: ResearchStudy): Option[CodeableConcept]            = t.primaryPurposeType
  def extractDescriptionSummary(t: ResearchStudy): Option[Markdown]                   = t.descriptionSummary
  def extractPrincipalInvestigator(t: ResearchStudy): Option[Reference]               = t.principalInvestigator
  def extractLabel(t: ResearchStudy): LitSeq[ResearchStudy.Label]                     = t.label
  def extractFocus(t: ResearchStudy): LitSeq[ResearchStudy.Focus]                     = t.focus
  def extractObjective(t: ResearchStudy): LitSeq[ResearchStudy.Objective]             = t.objective
  def extractStatusDate(t: ResearchStudy): LitSeq[ResearchStudy.StatusDate]           = t.statusDate
  def extractRecruitment(t: ResearchStudy): Option[ResearchStudy.Recruitment]         = t.recruitment
  def extractWebLocation(t: ResearchStudy): LitSeq[ResearchStudy.WebLocation]         = t.webLocation
  def extractClassification(t: ResearchStudy): LitSeq[ResearchStudy.Classification]   = t.classification
  def extractOutcomeMeasure(t: ResearchStudy): LitSeq[ResearchStudy.OutcomeMeasure]   = t.outcomeMeasure
  def extractAssociatedParty(t: ResearchStudy): LitSeq[ResearchStudy.AssociatedParty] = t.associatedParty
  def extractComparisonGroup(t: ResearchStudy): LitSeq[ResearchStudy.ComparisonGroup] = t.comparisonGroup
  override val thisName: String                                                       = "ResearchStudy"
  override val searchParams: Map[String, ResearchStudy => Seq[Any]] = Map(
    "recruitment_target"    -> (obj => obj.recruitment.flatMap(_.targetNumber).toSeq),
    "partof"                -> (obj => obj.partOf.toSeq),
    "location"              -> (obj => obj.location.toSeq),
    "principalinvestigator" -> (obj => obj.principalInvestigator.toSeq),
    "identifier"            -> (obj => obj.identifier.toSeq),
    "sponsor"               -> (obj => obj.sponsor.toSeq),
    "site"                  -> (obj => obj.site.toSeq),
    "recruitment_actual"    -> (obj => obj.recruitment.flatMap(_.actualNumber).toSeq),
    "keyword"               -> (obj => obj.keyword.toSeq),
    "date"                  -> (obj => obj.period.toSeq),
    "status"                -> (obj => Seq(obj.status)),
    "category"              -> (obj => obj.category.toSeq),
    "title"                 -> (obj => obj.title.toSeq),
    "protocol"              -> (obj => obj.protocol.toSeq),
    "condition"             -> (obj => obj.condition.toSeq),
    "focus"                 -> (obj => obj.focus.toSeq)
  )
  // format: off
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ResearchStudy] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ => Try(
      new ResearchStudy(
        cursor.decodeAs[Option[String]]("id", Some(None)),
        cursor.decodeAs[Option[UriStr]]("url", Some(None)),
        cursor.decodeAs[Option[Meta]]("meta", Some(None)),
        cursor.decodeAs[Option[Narrative]]("text", Some(None)),
        cursor.decodeAs[Option[String]]("name", Some(None)),
        cursor.decodeAs[Option[FHIRDateTime]]("date", Some(None)),
        cursor.decodeAs[LitSeq[Reference]]("site", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
        cursor.decodeAs[Option[String]]("title", Some(None)),
        cursor.decodeAs[Option[CodeableConcept]]("phase", Some(None)),
        cursor.decodeAs[LitSeq[Reference]]("partOf", Some(LitSeq.empty)),
        cursor.decodeAs[PUBLICATION_STATUS]("status", None),
        cursor.decodeAs[Option[Period]]("period", Some(None)),
        cursor.decodeAs[LitSeq[Reference]]("result", Some(LitSeq.empty)),
        cursor.decodeAs[Option[String]]("version", Some(None)),
        cursor.decodeAs[LitSeq[CodeableConcept]]("keyword", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[ContactDetail]]("contact", Some(LitSeq.empty)),
        cursor.decodeAs[Option[Reference]]("sponsor", Some(None)),
        cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
        cursor.decodeAs[LitSeq[Reference]]("protocol", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[CodeableConcept]]("category", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[CodeableConcept]]("location", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[CodeableConcept]]("condition", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
        cursor.decodeAs[Option[CodeableConcept]]("whyStopped", Some(None)),
        cursor.decodeAs[Option[Markdown]]("description", Some(None)),
        cursor.decodeAs[LitSeq[CodeableConcept]]("currentState", Some(LitSeq.empty)),
        cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
        cursor.decodeAs[LitSeq[RelatedArtifact]]("relatedArtifact", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
        cursor.decodeAs[Option[CodeableConcept]]("primaryPurposeType", Some(None)),
        cursor.decodeAs[Option[Markdown]]("descriptionSummary", Some(None)),
        cursor.decodeAs[Option[Reference]]("principalInvestigator", Some(None)),
        cursor.decodeAs[LitSeq[ResearchStudy.Label]]("label", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[ResearchStudy.Focus]]("focus", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[ResearchStudy.Objective]]("objective", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[ResearchStudy.StatusDate]]("statusDate", Some(LitSeq.empty)),
        cursor.decodeAs[Option[ResearchStudy.Recruitment]]("recruitment", Some(None)),
        cursor.decodeAs[LitSeq[ResearchStudy.WebLocation]]("webLocation", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[ResearchStudy.Classification]]("classification", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[ResearchStudy.OutcomeMeasure]]("outcomeMeasure", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[ResearchStudy.AssociatedParty]]("associatedParty", Some(LitSeq.empty)),
        cursor.decodeAs[LitSeq[ResearchStudy.ComparisonGroup]]("comparisonGroup", Some(LitSeq.empty)),
        decodeAttributes(cursor)
      )
    ))
  // format: on
}

/** A process where a researcher or organization plans and then executes a series of steps intended to increase the field of
  * healthcare-related knowledge. This includes studies of safety, efficacy, comparative effectiveness and other information about
  * medications, devices, therapies and other interventional and investigative techniques. A ResearchStudy involves the gathering
  * of information about human or animal subjects.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields url, name, date, site, note, title, phase, partOf, status, period, result, version, keyword, contact,
  *   sponsor, protocol, category, location, condition, identifier, whyStopped, description, currentState, relatedArtifact,
  *   primaryPurposeType, descriptionSummary, principalInvestigator, label, focus, objective, statusDate, recruitment,
  *   webLocation, classification, outcomeMeasure, associatedParty, comparisonGroup.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param url
  *   - Canonical identifier for this study resource, represented as a globally unique URI.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *   not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *   resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to
  *   make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be
  *   represented in the narrative to ensure clinical safety.
  * @param name
  *   - Name for this study (computer friendly).
  * @param date
  *   - Date the resource last changed.
  * @param site
  *   - A facility in which study activities are conducted.
  * @param note
  *   - Comments made about the study by the performer, subject or other participants.
  * @param title
  *   - A short, descriptive label for the study particularly for compouter use.
  * @param phase
  *   - The stage in the progression of a therapy from initial experimental use in humans in clinical trials to post-market
  *   evaluation.
  * @param partOf
  *   - A larger research study of which this particular study is a component or step.
  * @param status
  *   - The publication state of the resource (not of the study).
  * @param period
  *   - Identifies the start date and the expected (or actual, depending on status) end date for the study.
  * @param result
  *   - Link to one or more sets of results generated by the study. Could also link to a research registry holding the results
  *   such as ClinicalTrials.gov.
  * @param version
  *   - Business identifier for the study record.
  * @param keyword
  *   - Key terms to aid in searching for or filtering the study.
  * @param contact
  *   - Contact details to assist a user in learning more about or engaging with the study.
  * @param sponsor
  *   - An organization that initiates the investigation and is legally responsible for the study.
  * @param language
  *   - The base language in which the resource is written.
  * @param protocol
  *   - The set of steps expected to be performed as part of the execution of the study.
  * @param category
  *   - Codes categorizing the type of study such as investigational vs. observational, type of blinding, type of randomization,
  *   safety vs. efficacy, etc.
  * @param location
  *   - Indicates a country, state or other region where the study is taking place.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param condition
  *   - The condition that is the focus of the study. For example, In a study to examine risk factors for Lupus, might have as an
  *   inclusion criterion "healthy volunteer", but the target condition code would be a Lupus SNOMED code.
  * @param identifier
  *   - Identifiers assigned to this research study by the sponsor or other systems.
  * @param whyStopped
  *   - A description and/or code explaining the premature termination of the study.
  * @param description
  *   - A full description of how the study is being conducted. For a description of what the study objectives are see
  *   ResearchStudy.objective.description.
  * @param currentState
  *   - Current status of the study.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param relatedArtifact
  *   - Citations, references and other related documents.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *   the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually
  *   modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict
  *   set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param primaryPurposeType
  *   - The type of study based upon the intent of the study activities. A classification of the intent of the study.
  * @param descriptionSummary
  *   - A brief summary of the study description.
  * @param principalInvestigator
  *   - A researcher in a study who oversees multiple aspects of the study, such as concept development, protocol writing,
  *   protocol submission for IRB approval, participant recruitment, informed consent, data collection, analysis, interpretation
  *   and presentation.
  * @param label
  *   - Additional names for the study.
  * @param focus
  *   - The medication(s), food(s), therapy(ies), device(s) or other concerns or interventions that the study is seeking to gain
  *   more information about.
  * @param objective
  *   - A goal that the study is aiming to achieve in terms of a scientific question to be answered by the analysis of data
  *   collected during the study.
  * @param statusDate
  *   - Status of study with time for that status.
  * @param recruitment
  *   - Target or actual group of participants enrolled in study.
  * @param webLocation
  *   - A general storage or archive location for the study. This may contain an assortment of content which is not specified in
  *   advance.
  * @param classification
  *   - Classification for the study.
  * @param outcomeMeasure
  *   - An outcome or planned variable to measure during the study.
  * @param associatedParty
  *   - Sponsors, collaborators, and other parties.
  * @param comparisonGroup
  *   - Describes an expected sequence of events for one of the participants of a study. E.g. Exposure to drug A, wash-out,
  *   exposure to drug B, wash-out, follow-up.
  */
@POJOBoilerplate
class ResearchStudy(
    override val id: Option[String] = None,
    val url: Option[UriStr] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val name: Option[String] = None,
    val date: Option[FHIRDateTime] = None,
    val site: LitSeq[Reference] = LitSeq.empty,
    val note: LitSeq[Annotation] = LitSeq.empty,
    val title: Option[String] = None,
    val phase: Option[CodeableConcept] = None,
    val partOf: LitSeq[Reference] = LitSeq.empty,
    val status: PUBLICATION_STATUS,
    val period: Option[Period] = None,
    val result: LitSeq[Reference] = LitSeq.empty,
    val version: Option[String] = None,
    val keyword: LitSeq[CodeableConcept] = LitSeq.empty,
    val contact: LitSeq[ContactDetail] = LitSeq.empty,
    val sponsor: Option[Reference] = None,
    override val language: Option[LANGUAGES] = None,
    val protocol: LitSeq[Reference] = LitSeq.empty,
    val category: LitSeq[CodeableConcept] = LitSeq.empty,
    val location: LitSeq[CodeableConcept] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val condition: LitSeq[CodeableConcept] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val whyStopped: Option[CodeableConcept] = None,
    val description: Option[Markdown] = None,
    val currentState: LitSeq[CodeableConcept] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    val relatedArtifact: LitSeq[RelatedArtifact] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val primaryPurposeType: Option[CodeableConcept] = None,
    val descriptionSummary: Option[Markdown] = None,
    val principalInvestigator: Option[Reference] = None,
    val label: LitSeq[ResearchStudy.Label] = LitSeq.empty,
    val focus: LitSeq[ResearchStudy.Focus] = LitSeq.empty,
    val objective: LitSeq[ResearchStudy.Objective] = LitSeq.empty,
    val statusDate: LitSeq[ResearchStudy.StatusDate] = LitSeq.empty,
    val recruitment: Option[ResearchStudy.Recruitment] = None,
    val webLocation: LitSeq[ResearchStudy.WebLocation] = LitSeq.empty,
    val classification: LitSeq[ResearchStudy.Classification] = LitSeq.empty,
    val outcomeMeasure: LitSeq[ResearchStudy.OutcomeMeasure] = LitSeq.empty,
    val associatedParty: LitSeq[ResearchStudy.AssociatedParty] = LitSeq.empty,
    val comparisonGroup: LitSeq[ResearchStudy.ComparisonGroup] = LitSeq.empty,
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
  override val thisTypeName: String = "ResearchStudy"
}
