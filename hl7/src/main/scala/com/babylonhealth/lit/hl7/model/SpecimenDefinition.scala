package com.babylonhealth.lit.hl7.model

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
import com.babylonhealth.lit.hl7.model._
import com.babylonhealth.lit.core.UnionAliases._
import com.babylonhealth.lit.hl7.UnionAliases._
import com.babylonhealth.lit.hl7.SPECIMEN_CONTAINED_PREFERENCE
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object SpecimenDefinition extends CompanionFor[SpecimenDefinition] {
  override val baseType: CompanionFor[SpecimenDefinition] = SpecimenDefinition
  object TypeTested extends CompanionFor[TypeTested] {
    object Handling extends CompanionFor[Handling] {
      def apply(
          id: Option[String] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          maxDuration: Option[Duration] = None,
          instruction: Option[String] = None,
          temperatureRange: Option[Range] = None,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          temperatureQualifier: Option[CodeableConcept] = None,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Handling = new Handling(
        id,
        extension,
        maxDuration,
        instruction,
        temperatureRange,
        modifierExtension,
        temperatureQualifier,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Handling): Option[(Option[String], LitSeq[Extension], Option[Duration], Option[String], Option[Range], LitSeq[Extension], Option[CodeableConcept])] =
        Some(
          (
            o.id,
            o.extension,
            o.maxDuration,
            o.instruction,
            o.temperatureRange,
            o.modifierExtension,
            o.temperatureQualifier))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val maxDuration: FHIRComponentFieldMeta[Option[Duration]] =
        FHIRComponentFieldMeta("maxDuration", lTagOf[Option[Duration]], false, lTagOf[Duration])
      val instruction: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("instruction", lTagOf[Option[String]], false, lTagOf[String])
      val temperatureRange: FHIRComponentFieldMeta[Option[Range]] =
        FHIRComponentFieldMeta("temperatureRange", lTagOf[Option[Range]], false, lTagOf[Range])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val temperatureQualifier: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("temperatureQualifier", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
        Seq(id, extension, maxDuration, instruction, temperatureRange, modifierExtension, temperatureQualifier)
      override def fields(t: Handling): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[Duration]](maxDuration, t.maxDuration),
        FHIRComponentField[Option[String]](instruction, t.instruction),
        FHIRComponentField[Option[Range]](temperatureRange, t.temperatureRange),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
        FHIRComponentField[Option[CodeableConcept]](temperatureQualifier, t.temperatureQualifier)
      )
      val baseType: CompanionFor[Handling] = this
      val thisName: String                 = "Handling"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Handling] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Handling(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[Duration]]("maxDuration", Some(None)),
              cursor.decodeAs[Option[String]]("instruction", Some(None)),
              cursor.decodeAs[Option[Range]]("temperatureRange", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[CodeableConcept]]("temperatureQualifier", Some(None)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Handling(
        override val id: Option[String] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val maxDuration: Option[Duration] = None,
        val instruction: Option[String] = None,
        val temperatureRange: Option[Range] = None,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        val temperatureQualifier: Option[CodeableConcept] = None,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object Container extends CompanionFor[Container] {
      object Additive extends CompanionFor[Additive] {
        type AdditiveChoice = Choice[Union01025009075]
        def apply(
            id: Option[String] = None,
            extension: LitSeq[Extension] = LitSeq.empty,
            additive: Additive.AdditiveChoice,
            modifierExtension: LitSeq[Extension] = LitSeq.empty,
            primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
        ): Additive = new Additive(
          id,
          extension,
          additive,
          modifierExtension,
          primitiveAttributes = primitiveAttributes
        )
        def unapply(
            o: Additive): Option[(Option[String], LitSeq[Extension], Additive.AdditiveChoice, LitSeq[Extension])] =
          Some((o.id, o.extension, o.additive, o.modifierExtension))
        val id: FHIRComponentFieldMeta[Option[String]] =
          FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
        val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val additive: FHIRComponentFieldMeta[Additive.AdditiveChoice] =
          FHIRComponentFieldMeta("additive", lTagOf[Additive.AdditiveChoice], true, lTagOf[Union01025009075])
        val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
          FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
        val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, extension, additive, modifierExtension)
        override def fields(t: Additive): Seq[FHIRComponentField[_]] = Seq(
          FHIRComponentField[Option[String]](id, t.id),
          FHIRComponentField[LitSeq[Extension]](extension, t.extension),
          FHIRComponentField[Additive.AdditiveChoice](additive, t.additive),
          FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
        )
        val baseType: CompanionFor[Additive] = this
        val thisName: String                 = "Additive"
        def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Additive] =
          checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
            Try(
              new Additive(
                cursor.decodeAs[Option[String]]("id", Some(None)),
                cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
                cursor.decodeRef[Union01025009075]("additive"),
                cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
                decodeAttributes(cursor)
              )
            ))
      }
      @POJOBoilerplate
      class Additive(
          override val id: Option[String] = None,
          override val extension: LitSeq[Extension] = LitSeq.empty,
          val additive: Additive.AdditiveChoice,
          override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
          override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
            FHIRObject.emptyAtts)
          extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
      type MinimumVolumeChoice = Choice[Union_2072987899]
      def apply(
          id: Option[String] = None,
          cap: Option[CodeableConcept] = None,
          `type`: Option[CodeableConcept] = None,
          material: Option[CodeableConcept] = None,
          capacity: Option[Quantity] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          description: Option[String] = None,
          preparation: Option[String] = None,
          minimumVolume: Option[Container.MinimumVolumeChoice] = None,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          additive: LitSeq[Container.Additive] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Container = new Container(
        id,
        cap,
        `type`,
        material,
        capacity,
        extension,
        description,
        preparation,
        minimumVolume,
        modifierExtension,
        additive,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Container): Option[(Option[String], Option[CodeableConcept], Option[CodeableConcept], Option[CodeableConcept], Option[Quantity], LitSeq[Extension], Option[String], Option[String], Option[Container.MinimumVolumeChoice], LitSeq[Extension], LitSeq[Container.Additive])] =
        Some(
          (
            o.id,
            o.cap,
            o.`type`,
            o.material,
            o.capacity,
            o.extension,
            o.description,
            o.preparation,
            o.minimumVolume,
            o.modifierExtension,
            o.additive))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val cap: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("cap", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val material: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("material", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val capacity: FHIRComponentFieldMeta[Option[Quantity]] =
        FHIRComponentFieldMeta("capacity", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val description: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
      val preparation: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("preparation", lTagOf[Option[String]], false, lTagOf[String])
      val minimumVolume: FHIRComponentFieldMeta[Option[Container.MinimumVolumeChoice]] =
        FHIRComponentFieldMeta(
          "minimumVolume",
          lTagOf[Option[Container.MinimumVolumeChoice]],
          true,
          lTagOf[Union_2072987899])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val additive: FHIRComponentFieldMeta[LitSeq[Container.Additive]] =
        FHIRComponentFieldMeta("additive", lTagOf[LitSeq[Container.Additive]], false, lTagOf[Container.Additive])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
        id,
        cap,
        `type`,
        material,
        capacity,
        extension,
        description,
        preparation,
        minimumVolume,
        modifierExtension,
        additive)
      override def fields(t: Container): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[CodeableConcept]](cap, t.cap),
        FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
        FHIRComponentField[Option[CodeableConcept]](material, t.material),
        FHIRComponentField[Option[Quantity]](capacity, t.capacity),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[String]](description, t.description),
        FHIRComponentField[Option[String]](preparation, t.preparation),
        FHIRComponentField[Option[Container.MinimumVolumeChoice]](minimumVolume, t.minimumVolume),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
        FHIRComponentField[LitSeq[Container.Additive]](additive, t.additive)
      )
      val baseType: CompanionFor[Container] = this
      val thisName: String                  = "Container"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Container] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Container(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[CodeableConcept]]("cap", Some(None)),
              cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
              cursor.decodeAs[Option[CodeableConcept]]("material", Some(None)),
              cursor.decodeAs[Option[Quantity]]("capacity", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[String]]("description", Some(None)),
              cursor.decodeAs[Option[String]]("preparation", Some(None)),
              cursor.decodeOptRef[Union_2072987899]("minimumVolume"),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Container.Additive]]("additive", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Container(
        override val id: Option[String] = None,
        val cap: Option[CodeableConcept] = None,
        val `type`: Option[CodeableConcept] = None,
        val material: Option[CodeableConcept] = None,
        val capacity: Option[Quantity] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val description: Option[String] = None,
        val preparation: Option[String] = None,
        val minimumVolume: Option[Container.MinimumVolumeChoice] = None,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        val additive: LitSeq[Container.Additive] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] =
          FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        `type`: Option[CodeableConcept] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        isDerived: Option[Boolean] = None,
        preference: SPECIMEN_CONTAINED_PREFERENCE,
        requirement: Option[String] = None,
        retentionTime: Option[Duration] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        rejectionCriterion: LitSeq[CodeableConcept] = LitSeq.empty,
        handling: LitSeq[TypeTested.Handling] = LitSeq.empty,
        container: Option[TypeTested.Container] = None,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): TypeTested = new TypeTested(
      id,
      `type`,
      extension,
      isDerived,
      preference,
      requirement,
      retentionTime,
      modifierExtension,
      rejectionCriterion,
      handling,
      container,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: TypeTested): Option[(Option[String], Option[CodeableConcept], LitSeq[Extension], Option[Boolean], SPECIMEN_CONTAINED_PREFERENCE, Option[String], Option[Duration], LitSeq[Extension], LitSeq[CodeableConcept], LitSeq[TypeTested.Handling], Option[TypeTested.Container])] =
      Some(
        (
          o.id,
          o.`type`,
          o.extension,
          o.isDerived,
          o.preference,
          o.requirement,
          o.retentionTime,
          o.modifierExtension,
          o.rejectionCriterion,
          o.handling,
          o.container))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val isDerived: FHIRComponentFieldMeta[Option[Boolean]] =
      FHIRComponentFieldMeta("isDerived", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
    val preference: FHIRComponentFieldMeta[SPECIMEN_CONTAINED_PREFERENCE] =
      FHIRComponentFieldMeta(
        "preference",
        lTagOf[SPECIMEN_CONTAINED_PREFERENCE],
        false,
        lTagOf[SPECIMEN_CONTAINED_PREFERENCE])
    val requirement: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("requirement", lTagOf[Option[String]], false, lTagOf[String])
    val retentionTime: FHIRComponentFieldMeta[Option[Duration]] =
      FHIRComponentFieldMeta("retentionTime", lTagOf[Option[Duration]], false, lTagOf[Duration])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val rejectionCriterion: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("rejectionCriterion", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val handling: FHIRComponentFieldMeta[LitSeq[TypeTested.Handling]] =
      FHIRComponentFieldMeta("handling", lTagOf[LitSeq[TypeTested.Handling]], false, lTagOf[TypeTested.Handling])
    val container: FHIRComponentFieldMeta[Option[TypeTested.Container]] =
      FHIRComponentFieldMeta("container", lTagOf[Option[TypeTested.Container]], false, lTagOf[TypeTested.Container])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
      id,
      `type`,
      extension,
      isDerived,
      preference,
      requirement,
      retentionTime,
      modifierExtension,
      rejectionCriterion,
      handling,
      container)
    override def fields(t: TypeTested): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Boolean]](isDerived, t.isDerived),
      FHIRComponentField[SPECIMEN_CONTAINED_PREFERENCE](preference, t.preference),
      FHIRComponentField[Option[String]](requirement, t.requirement),
      FHIRComponentField[Option[Duration]](retentionTime, t.retentionTime),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[CodeableConcept]](rejectionCriterion, t.rejectionCriterion),
      FHIRComponentField[LitSeq[TypeTested.Handling]](handling, t.handling),
      FHIRComponentField[Option[TypeTested.Container]](container, t.container)
    )
    val baseType: CompanionFor[TypeTested] = this
    val thisName: String                   = "TypeTested"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[TypeTested] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new TypeTested(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Boolean]]("isDerived", Some(None)),
            cursor.decodeAs[SPECIMEN_CONTAINED_PREFERENCE]("preference", None),
            cursor.decodeAs[Option[String]]("requirement", Some(None)),
            cursor.decodeAs[Option[Duration]]("retentionTime", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("rejectionCriterion", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[TypeTested.Handling]]("handling", Some(LitSeq.empty)),
            cursor.decodeAs[Option[TypeTested.Container]]("container", Some(None)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class TypeTested(
      override val id: Option[String] = None,
      val `type`: Option[CodeableConcept] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val isDerived: Option[Boolean] = None,
      val preference: SPECIMEN_CONTAINED_PREFERENCE,
      val requirement: Option[String] = None,
      val retentionTime: Option[Duration] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val rejectionCriterion: LitSeq[CodeableConcept] = LitSeq.empty,
      val handling: LitSeq[TypeTested.Handling] = LitSeq.empty,
      val container: Option[TypeTested.Container] = None,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      identifier: Option[Identifier] = None,
      timeAspect: Option[String] = None,
      collection: LitSeq[CodeableConcept] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      typeCollected: Option[CodeableConcept] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      patientPreparation: LitSeq[CodeableConcept] = LitSeq.empty,
      typeTested: LitSeq[SpecimenDefinition.TypeTested] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): SpecimenDefinition = new SpecimenDefinition(
    id,
    meta,
    text,
    language,
    contained,
    extension,
    identifier,
    timeAspect,
    collection,
    implicitRules,
    typeCollected,
    modifierExtension,
    patientPreparation,
    typeTested,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[Option[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
  val timeAspect: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("timeAspect", lTagOf[Option[String]], false, lTagOf[String])
  val collection: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("collection", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val typeCollected: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("typeCollected", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val patientPreparation: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("patientPreparation", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val typeTested: FHIRComponentFieldMeta[LitSeq[SpecimenDefinition.TypeTested]] =
    FHIRComponentFieldMeta(
      "typeTested",
      lTagOf[LitSeq[SpecimenDefinition.TypeTested]],
      false,
      lTagOf[SpecimenDefinition.TypeTested])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    language,
    contained,
    extension,
    identifier,
    timeAspect,
    collection,
    implicitRules,
    typeCollected,
    modifierExtension,
    patientPreparation,
    typeTested
  )
  override def fields(t: SpecimenDefinition): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[String]](timeAspect, t.timeAspect),
    FHIRComponentField[LitSeq[CodeableConcept]](collection, t.collection),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[CodeableConcept]](typeCollected, t.typeCollected),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[CodeableConcept]](patientPreparation, t.patientPreparation),
    FHIRComponentField[LitSeq[SpecimenDefinition.TypeTested]](typeTested, t.typeTested)
  )
  def extractId(t: SpecimenDefinition): Option[String]                                = t.id
  def extractMeta(t: SpecimenDefinition): Option[Meta]                                = t.meta
  def extractText(t: SpecimenDefinition): Option[Narrative]                           = t.text
  def extractLanguage(t: SpecimenDefinition): Option[LANGUAGES]                       = t.language
  def extractContained(t: SpecimenDefinition): LitSeq[Resource]                       = t.contained
  def extractExtension(t: SpecimenDefinition): LitSeq[Extension]                      = t.extension
  def extractIdentifier(t: SpecimenDefinition): Option[Identifier]                    = t.identifier
  def extractTimeAspect(t: SpecimenDefinition): Option[String]                        = t.timeAspect
  def extractCollection(t: SpecimenDefinition): LitSeq[CodeableConcept]               = t.collection
  def extractImplicitRules(t: SpecimenDefinition): Option[UriStr]                     = t.implicitRules
  def extractTypeCollected(t: SpecimenDefinition): Option[CodeableConcept]            = t.typeCollected
  def extractModifierExtension(t: SpecimenDefinition): LitSeq[Extension]              = t.modifierExtension
  def extractPatientPreparation(t: SpecimenDefinition): LitSeq[CodeableConcept]       = t.patientPreparation
  def extractTypeTested(t: SpecimenDefinition): LitSeq[SpecimenDefinition.TypeTested] = t.typeTested
  override val thisName: String                                                       = "SpecimenDefinition"
  override val searchParams: Map[String, SpecimenDefinition => Seq[Any]] = Map(
    "container"  -> (obj => obj.typeTested.flatMap(_.container).flatMap(_.`type`).toSeq),
    "identifier" -> (obj => obj.identifier.toSeq),
    "type"       -> (obj => obj.typeCollected.toSeq)
  )
  def unapply(
      o: SpecimenDefinition): Option[(Option[String], Option[Meta], Option[Narrative], Option[LANGUAGES], LitSeq[Resource], LitSeq[Extension], Option[Identifier], Option[String], LitSeq[CodeableConcept], Option[UriStr], Option[CodeableConcept], LitSeq[Extension], LitSeq[CodeableConcept], LitSeq[SpecimenDefinition.TypeTested])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.language,
        o.contained,
        o.extension,
        o.identifier,
        o.timeAspect,
        o.collection,
        o.implicitRules,
        o.typeCollected,
        o.modifierExtension,
        o.patientPreparation,
        o.typeTested))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[SpecimenDefinition] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new SpecimenDefinition(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Identifier]]("identifier", Some(None)),
          cursor.decodeAs[Option[String]]("timeAspect", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("collection", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("typeCollected", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("patientPreparation", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[SpecimenDefinition.TypeTested]]("typeTested", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** A kind of specimen with associated set of requirements.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields identifier, timeAspect, collection, typeCollected, patientPreparation, typeTested.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param language - The base language in which the resource is written.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param identifier - A business identifier associated with the kind of specimen.
  * @param timeAspect - Time aspect of specimen collection (duration or offset).
  * @param collection - The action to be performed for collecting the specimen.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param typeCollected - The kind of material to be collected.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param patientPreparation - Preparation of the patient for specimen collection.
  * @param typeTested - Specimen conditioned in a container as expected by the testing laboratory.
  */
@POJOBoilerplate
class SpecimenDefinition(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val identifier: Option[Identifier] = None,
    val timeAspect: Option[String] = None,
    val collection: LitSeq[CodeableConcept] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    val typeCollected: Option[CodeableConcept] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val patientPreparation: LitSeq[CodeableConcept] = LitSeq.empty,
    val typeTested: LitSeq[SpecimenDefinition.TypeTested] = LitSeq.empty,
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
  override val thisTypeName: String = "SpecimenDefinition"
}
