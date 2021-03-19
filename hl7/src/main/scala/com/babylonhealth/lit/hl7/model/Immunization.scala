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
import com.babylonhealth.lit.hl7.IMMUNIZATION_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object Immunization extends CompanionFor[Immunization] {
  override type ResourceType = Immunization
  override val baseType: CompanionFor[ResourceType] = Immunization
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/Immunization")
  object ProtocolApplied extends CompanionFor[ProtocolApplied] {
    override type ResourceType = ProtocolApplied
    type DoseNumberChoice      = Choice[Union_0839638734]
    type SeriesDosesChoice     = Choice[Union_0839638734]
    def apply(
        id: Option[String] = None,
        series: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        authority: Option[Reference] = None,
        targetDisease: LitSeq[CodeableConcept] = LitSeq.empty,
        doseNumber: ProtocolApplied.DoseNumberChoice,
        seriesDoses: Option[ProtocolApplied.SeriesDosesChoice] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): ProtocolApplied = new ProtocolApplied(
      id,
      series,
      extension,
      authority,
      targetDisease,
      doseNumber,
      seriesDoses,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: ProtocolApplied): Option[(Option[String], Option[String], LitSeq[Extension], Option[Reference], LitSeq[CodeableConcept], ProtocolApplied.DoseNumberChoice, Option[ProtocolApplied.SeriesDosesChoice], LitSeq[Extension])] =
      Some(
        (o.id, o.series, o.extension, o.authority, o.targetDisease, o.doseNumber, o.seriesDoses, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val series: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("series", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val authority: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("authority", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val targetDisease: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("targetDisease", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val doseNumber: FHIRComponentFieldMeta[ProtocolApplied.DoseNumberChoice] =
      FHIRComponentFieldMeta("doseNumber", lTagOf[ProtocolApplied.DoseNumberChoice], true, lTagOf[Union_0839638734])
    val seriesDoses: FHIRComponentFieldMeta[Option[ProtocolApplied.SeriesDosesChoice]] =
      FHIRComponentFieldMeta(
        "seriesDoses",
        lTagOf[Option[ProtocolApplied.SeriesDosesChoice]],
        true,
        lTagOf[Union_0839638734])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, series, extension, authority, targetDisease, doseNumber, seriesDoses, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: ProtocolApplied): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[String]](series, t.series),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Reference]](authority, t.authority),
      FHIRComponentField[LitSeq[CodeableConcept]](targetDisease, t.targetDisease),
      FHIRComponentField[ProtocolApplied.DoseNumberChoice](doseNumber, t.doseNumber),
      FHIRComponentField[Option[ProtocolApplied.SeriesDosesChoice]](seriesDoses, t.seriesDoses),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[ProtocolApplied] = this
    val thisName: String                        = "ProtocolApplied"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ProtocolApplied] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new ProtocolApplied(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[String]]("series", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Reference]]("authority", Some(None)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("targetDisease", Some(LitSeq.empty)),
            cursor.decodeRef[Union_0839638734]("doseNumber"),
            cursor.decodeOptRef[Union_0839638734]("seriesDoses"),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class ProtocolApplied(
      override val id: Option[String] = None,
      val series: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val authority: Option[Reference] = None,
      val targetDisease: LitSeq[CodeableConcept] = LitSeq.empty,
      val doseNumber: ProtocolApplied.DoseNumberChoice,
      val seriesDoses: Option[ProtocolApplied.SeriesDosesChoice] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Education extends CompanionFor[Education] {
    override type ResourceType = Education
    def apply(
        id: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        reference: Option[UriStr] = None,
        documentType: Option[String] = None,
        publicationDate: Option[FHIRDateTime] = None,
        presentationDate: Option[FHIRDateTime] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Education = new Education(
      id,
      extension,
      reference,
      documentType,
      publicationDate,
      presentationDate,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Education): Option[(Option[String], LitSeq[Extension], Option[UriStr], Option[String], Option[FHIRDateTime], Option[FHIRDateTime], LitSeq[Extension])] =
      Some((o.id, o.extension, o.reference, o.documentType, o.publicationDate, o.presentationDate, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val reference: FHIRComponentFieldMeta[Option[UriStr]] =
      FHIRComponentFieldMeta("reference", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
    val documentType: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("documentType", lTagOf[Option[String]], false, lTagOf[String])
    val publicationDate: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
      FHIRComponentFieldMeta("publicationDate", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
    val presentationDate: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
      FHIRComponentFieldMeta("presentationDate", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, extension, reference, documentType, publicationDate, presentationDate, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Education): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[UriStr]](reference, t.reference),
      FHIRComponentField[Option[String]](documentType, t.documentType),
      FHIRComponentField[Option[FHIRDateTime]](publicationDate, t.publicationDate),
      FHIRComponentField[Option[FHIRDateTime]](presentationDate, t.presentationDate),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Education] = this
    val thisName: String                  = "Education"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Education] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Education(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[UriStr]]("reference", Some(None)),
            cursor.decodeAs[Option[String]]("documentType", Some(None)),
            cursor.decodeAs[Option[FHIRDateTime]]("publicationDate", Some(None)),
            cursor.decodeAs[Option[FHIRDateTime]]("presentationDate", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Education(
      override val id: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val reference: Option[UriStr] = None,
      val documentType: Option[String] = None,
      val publicationDate: Option[FHIRDateTime] = None,
      val presentationDate: Option[FHIRDateTime] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Performer extends CompanionFor[Performer] {
    override type ResourceType = Performer
    def apply(
        id: Option[String] = None,
        actor: Reference,
        function: Option[CodeableConcept] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Performer = new Performer(
      id,
      actor,
      function,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Performer): Option[(Option[String], Reference, Option[CodeableConcept], LitSeq[Extension], LitSeq[Extension])] =
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
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, actor, function, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Performer): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Reference](actor, t.actor),
      FHIRComponentField[Option[CodeableConcept]](function, t.function),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Performer] = this
    val thisName: String                  = "Performer"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Performer] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Performer(
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
  class Performer(
      override val id: Option[String] = None,
      val actor: Reference,
      val function: Option[CodeableConcept] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Reaction extends CompanionFor[Reaction] {
    override type ResourceType = Reaction
    def apply(
        id: Option[String] = None,
        date: Option[FHIRDateTime] = None,
        detail: Option[Reference] = None,
        reported: Option[Boolean] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Reaction = new Reaction(
      id,
      date,
      detail,
      reported,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Reaction): Option[(Option[String], Option[FHIRDateTime], Option[Reference], Option[Boolean], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.date, o.detail, o.reported, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val date: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
      FHIRComponentFieldMeta("date", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
    val detail: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("detail", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val reported: FHIRComponentFieldMeta[Option[Boolean]] =
      FHIRComponentFieldMeta("reported", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, date, detail, reported, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Reaction): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[FHIRDateTime]](date, t.date),
      FHIRComponentField[Option[Reference]](detail, t.detail),
      FHIRComponentField[Option[Boolean]](reported, t.reported),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Reaction] = this
    val thisName: String                 = "Reaction"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Reaction] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Reaction(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[FHIRDateTime]]("date", Some(None)),
            cursor.decodeAs[Option[Reference]]("detail", Some(None)),
            cursor.decodeAs[Option[Boolean]]("reported", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Reaction(
      override val id: Option[String] = None,
      val date: Option[FHIRDateTime] = None,
      val detail: Option[Reference] = None,
      val reported: Option[Boolean] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  type OccurrenceChoice = Choice[Union_1715923163]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      site: Option[CodeableConcept] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      route: Option[CodeableConcept] = None,
      status: IMMUNIZATION_STATUS,
      patient: Reference,
      language: Option[LANGUAGES] = None,
      recorded: Option[FHIRDateTime] = None,
      location: Option[Reference] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      encounter: Option[Reference] = None,
      lotNumber: Option[String] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
      vaccineCode: CodeableConcept,
      isSubpotent: Option[Boolean] = None,
      statusReason: Option[CodeableConcept] = None,
      reportOrigin: Option[CodeableConcept] = None,
      manufacturer: Option[Reference] = None,
      doseQuantity: Option[Quantity] = None,
      implicitRules: Option[UriStr] = None,
      occurrence: Immunization.OccurrenceChoice,
      primarySource: Option[Boolean] = None,
      fundingSource: Option[CodeableConcept] = None,
      expirationDate: Option[FHIRDate] = None,
      reasonReference: LitSeq[Reference] = LitSeq.empty,
      subpotentReason: LitSeq[CodeableConcept] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      programEligibility: LitSeq[CodeableConcept] = LitSeq.empty,
      reaction: LitSeq[Immunization.Reaction] = LitSeq.empty,
      performer: LitSeq[Immunization.Performer] = LitSeq.empty,
      education: LitSeq[Immunization.Education] = LitSeq.empty,
      protocolApplied: LitSeq[Immunization.ProtocolApplied] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): Immunization = new Immunization(
    id,
    meta,
    text,
    site,
    note,
    route,
    status,
    patient,
    language,
    recorded,
    location,
    contained,
    extension,
    encounter,
    lotNumber,
    identifier,
    reasonCode,
    vaccineCode,
    isSubpotent,
    statusReason,
    reportOrigin,
    manufacturer,
    doseQuantity,
    implicitRules,
    occurrence,
    primarySource,
    fundingSource,
    expirationDate,
    reasonReference,
    subpotentReason,
    modifierExtension,
    programEligibility,
    reaction,
    performer,
    education,
    protocolApplied,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val site: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("site", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val route: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("route", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val status: FHIRComponentFieldMeta[IMMUNIZATION_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[IMMUNIZATION_STATUS], false, lTagOf[IMMUNIZATION_STATUS])
  val patient: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("patient", lTagOf[Reference], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val recorded: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("recorded", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val location: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("location", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val encounter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("encounter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val lotNumber: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("lotNumber", lTagOf[Option[String]], false, lTagOf[String])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val reasonCode: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("reasonCode", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val vaccineCode: FHIRComponentFieldMeta[CodeableConcept] =
    FHIRComponentFieldMeta("vaccineCode", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
  val isSubpotent: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("isSubpotent", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val statusReason: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("statusReason", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val reportOrigin: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("reportOrigin", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val manufacturer: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("manufacturer", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val doseQuantity: FHIRComponentFieldMeta[Option[Quantity]] =
    FHIRComponentFieldMeta("doseQuantity", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val occurrence: FHIRComponentFieldMeta[Immunization.OccurrenceChoice] =
    FHIRComponentFieldMeta("occurrence", lTagOf[Immunization.OccurrenceChoice], true, lTagOf[Union_1715923163])
  val primarySource: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("primarySource", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val fundingSource: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("fundingSource", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val expirationDate: FHIRComponentFieldMeta[Option[FHIRDate]] =
    FHIRComponentFieldMeta("expirationDate", lTagOf[Option[FHIRDate]], false, lTagOf[FHIRDate])
  val reasonReference: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("reasonReference", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val subpotentReason: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("subpotentReason", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val programEligibility: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("programEligibility", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val reaction: FHIRComponentFieldMeta[LitSeq[Immunization.Reaction]] =
    FHIRComponentFieldMeta("reaction", lTagOf[LitSeq[Immunization.Reaction]], false, lTagOf[Immunization.Reaction])
  val performer: FHIRComponentFieldMeta[LitSeq[Immunization.Performer]] =
    FHIRComponentFieldMeta("performer", lTagOf[LitSeq[Immunization.Performer]], false, lTagOf[Immunization.Performer])
  val education: FHIRComponentFieldMeta[LitSeq[Immunization.Education]] =
    FHIRComponentFieldMeta("education", lTagOf[LitSeq[Immunization.Education]], false, lTagOf[Immunization.Education])
  val protocolApplied: FHIRComponentFieldMeta[LitSeq[Immunization.ProtocolApplied]] =
    FHIRComponentFieldMeta(
      "protocolApplied",
      lTagOf[LitSeq[Immunization.ProtocolApplied]],
      false,
      lTagOf[Immunization.ProtocolApplied])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    site,
    note,
    route,
    status,
    patient,
    language,
    recorded,
    location,
    contained,
    extension,
    encounter,
    lotNumber,
    identifier,
    reasonCode,
    vaccineCode,
    isSubpotent,
    statusReason,
    reportOrigin,
    manufacturer,
    doseQuantity,
    implicitRules,
    occurrence,
    primarySource,
    fundingSource,
    expirationDate,
    reasonReference,
    subpotentReason,
    modifierExtension,
    programEligibility,
    reaction,
    performer,
    education,
    protocolApplied
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: Immunization): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[CodeableConcept]](site, t.site),
    FHIRComponentField[LitSeq[Annotation]](note, t.note),
    FHIRComponentField[Option[CodeableConcept]](route, t.route),
    FHIRComponentField[IMMUNIZATION_STATUS](status, t.status),
    FHIRComponentField[Reference](patient, t.patient),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Option[FHIRDateTime]](recorded, t.recorded),
    FHIRComponentField[Option[Reference]](location, t.location),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Reference]](encounter, t.encounter),
    FHIRComponentField[Option[String]](lotNumber, t.lotNumber),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[LitSeq[CodeableConcept]](reasonCode, t.reasonCode),
    FHIRComponentField[CodeableConcept](vaccineCode, t.vaccineCode),
    FHIRComponentField[Option[Boolean]](isSubpotent, t.isSubpotent),
    FHIRComponentField[Option[CodeableConcept]](statusReason, t.statusReason),
    FHIRComponentField[Option[CodeableConcept]](reportOrigin, t.reportOrigin),
    FHIRComponentField[Option[Reference]](manufacturer, t.manufacturer),
    FHIRComponentField[Option[Quantity]](doseQuantity, t.doseQuantity),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Immunization.OccurrenceChoice](occurrence, t.occurrence),
    FHIRComponentField[Option[Boolean]](primarySource, t.primarySource),
    FHIRComponentField[Option[CodeableConcept]](fundingSource, t.fundingSource),
    FHIRComponentField[Option[FHIRDate]](expirationDate, t.expirationDate),
    FHIRComponentField[LitSeq[Reference]](reasonReference, t.reasonReference),
    FHIRComponentField[LitSeq[CodeableConcept]](subpotentReason, t.subpotentReason),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[CodeableConcept]](programEligibility, t.programEligibility),
    FHIRComponentField[LitSeq[Immunization.Reaction]](reaction, t.reaction),
    FHIRComponentField[LitSeq[Immunization.Performer]](performer, t.performer),
    FHIRComponentField[LitSeq[Immunization.Education]](education, t.education),
    FHIRComponentField[LitSeq[Immunization.ProtocolApplied]](protocolApplied, t.protocolApplied)
  )
  def extractId(t: Immunization): Option[String]                                    = t.id
  def extractMeta(t: Immunization): Option[Meta]                                    = t.meta
  def extractText(t: Immunization): Option[Narrative]                               = t.text
  def extractSite(t: Immunization): Option[CodeableConcept]                         = t.site
  def extractNote(t: Immunization): LitSeq[Annotation]                              = t.note
  def extractRoute(t: Immunization): Option[CodeableConcept]                        = t.route
  def extractStatus(t: Immunization): IMMUNIZATION_STATUS                           = t.status
  def extractPatient(t: Immunization): Reference                                    = t.patient
  def extractLanguage(t: Immunization): Option[LANGUAGES]                           = t.language
  def extractRecorded(t: Immunization): Option[FHIRDateTime]                        = t.recorded
  def extractLocation(t: Immunization): Option[Reference]                           = t.location
  def extractContained(t: Immunization): LitSeq[Resource]                           = t.contained
  def extractExtension(t: Immunization): LitSeq[Extension]                          = t.extension
  def extractEncounter(t: Immunization): Option[Reference]                          = t.encounter
  def extractLotNumber(t: Immunization): Option[String]                             = t.lotNumber
  def extractIdentifier(t: Immunization): LitSeq[Identifier]                        = t.identifier
  def extractReasonCode(t: Immunization): LitSeq[CodeableConcept]                   = t.reasonCode
  def extractVaccineCode(t: Immunization): CodeableConcept                          = t.vaccineCode
  def extractIsSubpotent(t: Immunization): Option[Boolean]                          = t.isSubpotent
  def extractStatusReason(t: Immunization): Option[CodeableConcept]                 = t.statusReason
  def extractReportOrigin(t: Immunization): Option[CodeableConcept]                 = t.reportOrigin
  def extractManufacturer(t: Immunization): Option[Reference]                       = t.manufacturer
  def extractDoseQuantity(t: Immunization): Option[Quantity]                        = t.doseQuantity
  def extractImplicitRules(t: Immunization): Option[UriStr]                         = t.implicitRules
  def extractOccurrence(t: Immunization): Immunization.OccurrenceChoice             = t.occurrence
  def extractPrimarySource(t: Immunization): Option[Boolean]                        = t.primarySource
  def extractFundingSource(t: Immunization): Option[CodeableConcept]                = t.fundingSource
  def extractExpirationDate(t: Immunization): Option[FHIRDate]                      = t.expirationDate
  def extractReasonReference(t: Immunization): LitSeq[Reference]                    = t.reasonReference
  def extractSubpotentReason(t: Immunization): LitSeq[CodeableConcept]              = t.subpotentReason
  def extractModifierExtension(t: Immunization): LitSeq[Extension]                  = t.modifierExtension
  def extractProgramEligibility(t: Immunization): LitSeq[CodeableConcept]           = t.programEligibility
  def extractReaction(t: Immunization): LitSeq[Immunization.Reaction]               = t.reaction
  def extractPerformer(t: Immunization): LitSeq[Immunization.Performer]             = t.performer
  def extractEducation(t: Immunization): LitSeq[Immunization.Education]             = t.education
  def extractProtocolApplied(t: Immunization): LitSeq[Immunization.ProtocolApplied] = t.protocolApplied
  override val thisName: String                                                     = "Immunization"
  override val searchParams: Map[String, Immunization => Seq[Any]] = Map(
    "series"           -> (obj => obj.protocolApplied.flatMap(_.series).toSeq),
    "location"         -> (obj => obj.location.toSeq),
    "identifier"       -> (obj => obj.identifier.toSeq),
    "reason-code"      -> (obj => obj.reasonCode.toSeq),
    "status-reason"    -> (obj => obj.statusReason.toSeq),
    "status"           -> (obj => Seq(obj.status)),
    "reaction-date"    -> (obj => obj.reaction.flatMap(_.date).toSeq),
    "manufacturer"     -> (obj => obj.manufacturer.toSeq),
    "vaccine-code"     -> (obj => Seq(obj.vaccineCode)),
    "reaction"         -> (obj => obj.reaction.flatMap(_.detail).toSeq),
    "date"             -> (obj => Seq(obj.occurrence)),
    "target-disease"   -> (obj => obj.protocolApplied.flatMap(_.targetDisease).toSeq),
    "performer"        -> (obj => obj.performer.map(_.actor).toSeq),
    "reason-reference" -> (obj => obj.reasonReference.toSeq),
    "lot-number"       -> (obj => obj.lotNumber.toSeq),
    "patient"          -> (obj => Seq(obj.patient))
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Immunization] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new Immunization(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("site", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("route", Some(None)),
          cursor.decodeAs[IMMUNIZATION_STATUS]("status", None),
          cursor.decodeAs[Reference]("patient", None),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("recorded", Some(None)),
          cursor.decodeAs[Option[Reference]]("location", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          cursor.decodeAs[Option[String]]("lotNumber", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("reasonCode", Some(LitSeq.empty)),
          cursor.decodeAs[CodeableConcept]("vaccineCode", None),
          cursor.decodeAs[Option[Boolean]]("isSubpotent", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("statusReason", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("reportOrigin", Some(None)),
          cursor.decodeAs[Option[Reference]]("manufacturer", Some(None)),
          cursor.decodeAs[Option[Quantity]]("doseQuantity", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeRef[Union_1715923163]("occurrence"),
          cursor.decodeAs[Option[Boolean]]("primarySource", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("fundingSource", Some(None)),
          cursor.decodeAs[Option[FHIRDate]]("expirationDate", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("reasonReference", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("subpotentReason", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("programEligibility", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Immunization.Reaction]]("reaction", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Immunization.Performer]]("performer", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Immunization.Education]]("education", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Immunization.ProtocolApplied]]("protocolApplied", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Describes the event of a patient being administered a vaccine or a record of an immunization as reported by a patient, a clinician or another party.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields site, note, route, status, patient, recorded, location, encounter, lotNumber, identifier, reasonCode, vaccineCode, isSubpotent, statusReason, reportOrigin, manufacturer, doseQuantity, occurrence, primarySource, fundingSource, expirationDate, reasonReference, subpotentReason, programEligibility, reaction, performer, education, protocolApplied.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param site - Body site where vaccine was administered.
  * @param note - Extra information about the immunization that is not conveyed by the other attributes.
  * @param route - The path by which the vaccine product is taken into the body.
  * @param status - Indicates the current status of the immunization event.
  * @param patient - The patient who either received or did not receive the immunization.
  * @param language - The base language in which the resource is written.
  * @param recorded - The date the occurrence of the immunization was first captured in the record - potentially significantly after the occurrence of the event.
  * @param location - The service delivery location where the vaccine administration occurred.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param encounter - The visit or admission or other contact between patient and health care provider the immunization was performed as part of.
  * @param lotNumber - Lot number of the  vaccine product.
  * @param identifier - A unique identifier assigned to this immunization record.
  * @param reasonCode - Reasons why the vaccine was administered.
  * @param vaccineCode - Vaccine that was administered or was to be administered.
  * @param isSubpotent - Indication if a dose is considered to be subpotent. By default, a dose should be considered to be potent.
  * @param statusReason - Indicates the reason the immunization event was not performed.
  * @param reportOrigin - The source of the data when the report of the immunization event is not based on information from the person who administered the vaccine.
  * @param manufacturer - Name of vaccine manufacturer.
  * @param doseQuantity - The quantity of vaccine product that was administered.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param occurrence - Date vaccine administered or was to be administered.
  * @param primarySource - An indication that the content of the record is based on information from the person who administered the vaccine. This reflects the context under which the data was originally recorded.
  * @param fundingSource - Indicates the source of the vaccine actually administered. This may be different than the patient eligibility (e.g. the patient may be eligible for a publically purchased vaccine but due to inventory issues, vaccine purchased with private funds was actually administered).
  * @param expirationDate - Date vaccine batch expires.
  * @param reasonReference - Condition, Observation or DiagnosticReport that supports why the immunization was administered.
  * @param subpotentReason - Reason why a dose is considered to be subpotent.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param programEligibility - Indicates a patient's eligibility for a funding program.
  * @param reaction - Categorical data indicating that an adverse event is associated in time to an immunization.
  * @param performer - Indicates who performed the immunization event.
  * @param education - Educational material presented to the patient (or guardian) at the time of vaccine administration.
  * @param protocolApplied - The protocol (set of recommendations) being followed by the provider who administered the dose.
  */
@POJOBoilerplate
class Immunization(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val site: Option[CodeableConcept] = None,
    val note: LitSeq[Annotation] = LitSeq.empty,
    val route: Option[CodeableConcept] = None,
    val status: IMMUNIZATION_STATUS,
    val patient: Reference,
    override val language: Option[LANGUAGES] = None,
    val recorded: Option[FHIRDateTime] = None,
    val location: Option[Reference] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val encounter: Option[Reference] = None,
    val lotNumber: Option[String] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
    val vaccineCode: CodeableConcept,
    val isSubpotent: Option[Boolean] = None,
    val statusReason: Option[CodeableConcept] = None,
    val reportOrigin: Option[CodeableConcept] = None,
    val manufacturer: Option[Reference] = None,
    val doseQuantity: Option[Quantity] = None,
    override val implicitRules: Option[UriStr] = None,
    val occurrence: Immunization.OccurrenceChoice,
    val primarySource: Option[Boolean] = None,
    val fundingSource: Option[CodeableConcept] = None,
    val expirationDate: Option[FHIRDate] = None,
    val reasonReference: LitSeq[Reference] = LitSeq.empty,
    val subpotentReason: LitSeq[CodeableConcept] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val programEligibility: LitSeq[CodeableConcept] = LitSeq.empty,
    val reaction: LitSeq[Immunization.Reaction] = LitSeq.empty,
    val performer: LitSeq[Immunization.Performer] = LitSeq.empty,
    val education: LitSeq[Immunization.Education] = LitSeq.empty,
    val protocolApplied: LitSeq[Immunization.ProtocolApplied] = LitSeq.empty,
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
  override val thisTypeName: String = "Immunization"
}
