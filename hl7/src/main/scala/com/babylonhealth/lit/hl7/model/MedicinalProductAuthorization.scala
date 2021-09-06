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
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object MedicinalProductAuthorization extends CompanionFor[MedicinalProductAuthorization] {
  implicit def summonObjectAndCompanionMedicinalProductAuthorization742413989(
      o: MedicinalProductAuthorization): ObjectAndCompanion[MedicinalProductAuthorization, MedicinalProductAuthorization.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = MedicinalProductAuthorization
  override type ParentType   = MedicinalProductAuthorization
  override val baseType: CompanionFor[ResourceType] = MedicinalProductAuthorization
  override val parentType: CompanionFor[ParentType] = MedicinalProductAuthorization
  override val profileUrl: Option[String] = Some("http://hl7.org/fhir/StructureDefinition/MedicinalProductAuthorization")
  object JurisdictionalAuthorization extends CompanionFor[JurisdictionalAuthorization] {
    implicit def summonObjectAndCompanionJurisdictionalAuthorization118540538(
        o: JurisdictionalAuthorization): ObjectAndCompanion[JurisdictionalAuthorization, JurisdictionalAuthorization.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = JurisdictionalAuthorization
    override type ParentType   = JurisdictionalAuthorization
    override val parentType: CompanionFor[ResourceType] = JurisdictionalAuthorization
    def apply(
        id: Option[String] = None,
        country: Option[CodeableConcept] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        identifier: LitSeq[Identifier] = LitSeq.empty,
        jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
        validityPeriod: Option[Period] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        legalStatusOfSupply: Option[CodeableConcept] = None,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): JurisdictionalAuthorization = new JurisdictionalAuthorization(
      id,
      country,
      extension,
      identifier,
      jurisdiction,
      validityPeriod,
      modifierExtension,
      legalStatusOfSupply,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: JurisdictionalAuthorization): Option[(Option[String], Option[CodeableConcept], LitSeq[Extension], LitSeq[Identifier], LitSeq[CodeableConcept], Option[Period], LitSeq[Extension], Option[CodeableConcept])] =
      Some(
        (
          o.id,
          o.country,
          o.extension,
          o.identifier,
          o.jurisdiction,
          o.validityPeriod,
          o.modifierExtension,
          o.legalStatusOfSupply))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val country: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("country", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
      FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
    val jurisdiction: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
      FHIRComponentFieldMeta("jurisdiction", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
    val validityPeriod: FHIRComponentFieldMeta[Option[Period]] =
      FHIRComponentFieldMeta("validityPeriod", lTagOf[Option[Period]], false, lTagOf[Period])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val legalStatusOfSupply: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("legalStatusOfSupply", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, country, extension, identifier, jurisdiction, validityPeriod, modifierExtension, legalStatusOfSupply)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: JurisdictionalAuthorization): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](country, t.country),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
      FHIRComponentField[LitSeq[CodeableConcept]](jurisdiction, t.jurisdiction),
      FHIRComponentField[Option[Period]](validityPeriod, t.validityPeriod),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[CodeableConcept]](legalStatusOfSupply, t.legalStatusOfSupply)
    )
    val baseType: CompanionFor[JurisdictionalAuthorization] = this
    val thisName: String                                    = "JurisdictionalAuthorization"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[JurisdictionalAuthorization] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new JurisdictionalAuthorization(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("country", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[CodeableConcept]]("jurisdiction", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Period]]("validityPeriod", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[CodeableConcept]]("legalStatusOfSupply", Some(None)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class JurisdictionalAuthorization(
      override val id: Option[String] = None,
      val country: Option[CodeableConcept] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val identifier: LitSeq[Identifier] = LitSeq.empty,
      val jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
      val validityPeriod: Option[Period] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val legalStatusOfSupply: Option[CodeableConcept] = None,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Procedure extends CompanionFor[Procedure] {
    implicit def summonObjectAndCompanionProcedure1298976855(o: Procedure): ObjectAndCompanion[Procedure, Procedure.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Procedure
    override type ParentType   = Procedure
    override val parentType: CompanionFor[ResourceType] = Procedure
    type DateChoice = Choice[UnionFHIRDateTimeOrPeriod]
    def apply(
        id: Option[String] = None,
        `type`: CodeableConcept,
        date: Option[Procedure.DateChoice] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        identifier: Option[Identifier] = None,
        application: LitSeq[MedicinalProductAuthorization.Procedure] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Procedure = new Procedure(
      id,
      `type`,
      date,
      extension,
      identifier,
      application,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Procedure): Option[(Option[String], CodeableConcept, Option[Procedure.DateChoice], LitSeq[Extension], Option[Identifier], LitSeq[MedicinalProductAuthorization.Procedure], LitSeq[Extension])] =
      Some((o.id, o.`type`, o.date, o.extension, o.identifier, o.application, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("type", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val date: FHIRComponentFieldMeta[Option[Procedure.DateChoice]] =
      FHIRComponentFieldMeta("date", lTagOf[Option[Procedure.DateChoice]], true, lTagOf[UnionFHIRDateTimeOrPeriod])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val identifier: FHIRComponentFieldMeta[Option[Identifier]] =
      FHIRComponentFieldMeta("identifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
    val application: FHIRComponentFieldMeta[LitSeq[MedicinalProductAuthorization.Procedure]] =
      FHIRComponentFieldMeta(
        "application",
        lTagOf[LitSeq[MedicinalProductAuthorization.Procedure]],
        false,
        lTagOf[MedicinalProductAuthorization.Procedure])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, `type`, date, extension, identifier, application, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Procedure): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[CodeableConcept](`type`, t.`type`),
      FHIRComponentField[Option[Procedure.DateChoice]](date, t.date),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Identifier]](identifier, t.identifier),
      FHIRComponentField[LitSeq[MedicinalProductAuthorization.Procedure]](application, t.application),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Procedure] = this
    val thisName: String                  = "Procedure"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Procedure] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Procedure(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[CodeableConcept]("type", None),
            cursor.decodeOptRef[UnionFHIRDateTimeOrPeriod]("date"),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Identifier]]("identifier", Some(None)),
            cursor.decodeAs[LitSeq[MedicinalProductAuthorization.Procedure]]("application", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Procedure(
      override val id: Option[String] = None,
      val `type`: CodeableConcept,
      val date: Option[Procedure.DateChoice] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val identifier: Option[Identifier] = None,
      val application: LitSeq[MedicinalProductAuthorization.Procedure] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      status: Option[CodeableConcept] = None,
      holder: Option[Reference] = None,
      subject: Option[Reference] = None,
      country: LitSeq[CodeableConcept] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      regulator: Option[Reference] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      statusDate: Option[FHIRDateTime] = None,
      legalBasis: Option[CodeableConcept] = None,
      restoreDate: Option[FHIRDateTime] = None,
      jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      validityPeriod: Option[Period] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      dataExclusivityPeriod: Option[Period] = None,
      internationalBirthDate: Option[FHIRDateTime] = None,
      dateOfFirstAuthorization: Option[FHIRDateTime] = None,
      procedure: Option[MedicinalProductAuthorization.Procedure] = None,
      jurisdictionalAuthorization: LitSeq[MedicinalProductAuthorization.JurisdictionalAuthorization] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): MedicinalProductAuthorization = new MedicinalProductAuthorization(
    id,
    meta,
    text,
    status,
    holder,
    subject,
    country,
    language,
    contained,
    extension,
    regulator,
    identifier,
    statusDate,
    legalBasis,
    restoreDate,
    jurisdiction,
    implicitRules,
    validityPeriod,
    modifierExtension,
    dataExclusivityPeriod,
    internationalBirthDate,
    dateOfFirstAuthorization,
    procedure,
    jurisdictionalAuthorization,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val status: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("status", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val holder: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("holder", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val subject: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("subject", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val country: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("country", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val regulator: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("regulator", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val statusDate: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("statusDate", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val legalBasis: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("legalBasis", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val restoreDate: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("restoreDate", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val jurisdiction: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("jurisdiction", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val validityPeriod: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("validityPeriod", lTagOf[Option[Period]], false, lTagOf[Period])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val dataExclusivityPeriod: FHIRComponentFieldMeta[Option[Period]] =
    FHIRComponentFieldMeta("dataExclusivityPeriod", lTagOf[Option[Period]], false, lTagOf[Period])
  val internationalBirthDate: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("internationalBirthDate", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val dateOfFirstAuthorization: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("dateOfFirstAuthorization", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val procedure: FHIRComponentFieldMeta[Option[MedicinalProductAuthorization.Procedure]] =
    FHIRComponentFieldMeta(
      "procedure",
      lTagOf[Option[MedicinalProductAuthorization.Procedure]],
      false,
      lTagOf[MedicinalProductAuthorization.Procedure])
  val jurisdictionalAuthorization: FHIRComponentFieldMeta[LitSeq[MedicinalProductAuthorization.JurisdictionalAuthorization]] =
    FHIRComponentFieldMeta(
      "jurisdictionalAuthorization",
      lTagOf[LitSeq[MedicinalProductAuthorization.JurisdictionalAuthorization]],
      false,
      lTagOf[MedicinalProductAuthorization.JurisdictionalAuthorization]
    )
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    status,
    holder,
    subject,
    country,
    language,
    contained,
    extension,
    regulator,
    identifier,
    statusDate,
    legalBasis,
    restoreDate,
    jurisdiction,
    implicitRules,
    validityPeriod,
    modifierExtension,
    dataExclusivityPeriod,
    internationalBirthDate,
    dateOfFirstAuthorization,
    procedure,
    jurisdictionalAuthorization
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: MedicinalProductAuthorization): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[CodeableConcept]](status, t.status),
    FHIRComponentField[Option[Reference]](holder, t.holder),
    FHIRComponentField[Option[Reference]](subject, t.subject),
    FHIRComponentField[LitSeq[CodeableConcept]](country, t.country),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Reference]](regulator, t.regulator),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[FHIRDateTime]](statusDate, t.statusDate),
    FHIRComponentField[Option[CodeableConcept]](legalBasis, t.legalBasis),
    FHIRComponentField[Option[FHIRDateTime]](restoreDate, t.restoreDate),
    FHIRComponentField[LitSeq[CodeableConcept]](jurisdiction, t.jurisdiction),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[Period]](validityPeriod, t.validityPeriod),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Option[Period]](dataExclusivityPeriod, t.dataExclusivityPeriod),
    FHIRComponentField[Option[FHIRDateTime]](internationalBirthDate, t.internationalBirthDate),
    FHIRComponentField[Option[FHIRDateTime]](dateOfFirstAuthorization, t.dateOfFirstAuthorization),
    FHIRComponentField[Option[MedicinalProductAuthorization.Procedure]](procedure, t.procedure),
    FHIRComponentField[LitSeq[MedicinalProductAuthorization.JurisdictionalAuthorization]](
      jurisdictionalAuthorization,
      t.jurisdictionalAuthorization)
  )
  def extractId(t: MedicinalProductAuthorization): Option[String]                             = t.id
  def extractMeta(t: MedicinalProductAuthorization): Option[Meta]                             = t.meta
  def extractText(t: MedicinalProductAuthorization): Option[Narrative]                        = t.text
  def extractStatus(t: MedicinalProductAuthorization): Option[CodeableConcept]                = t.status
  def extractHolder(t: MedicinalProductAuthorization): Option[Reference]                      = t.holder
  def extractSubject(t: MedicinalProductAuthorization): Option[Reference]                     = t.subject
  def extractCountry(t: MedicinalProductAuthorization): LitSeq[CodeableConcept]               = t.country
  def extractLanguage(t: MedicinalProductAuthorization): Option[LANGUAGES]                    = t.language
  def extractContained(t: MedicinalProductAuthorization): LitSeq[Resource]                    = t.contained
  def extractExtension(t: MedicinalProductAuthorization): LitSeq[Extension]                   = t.extension
  def extractRegulator(t: MedicinalProductAuthorization): Option[Reference]                   = t.regulator
  def extractIdentifier(t: MedicinalProductAuthorization): LitSeq[Identifier]                 = t.identifier
  def extractStatusDate(t: MedicinalProductAuthorization): Option[FHIRDateTime]               = t.statusDate
  def extractLegalBasis(t: MedicinalProductAuthorization): Option[CodeableConcept]            = t.legalBasis
  def extractRestoreDate(t: MedicinalProductAuthorization): Option[FHIRDateTime]              = t.restoreDate
  def extractJurisdiction(t: MedicinalProductAuthorization): LitSeq[CodeableConcept]          = t.jurisdiction
  def extractImplicitRules(t: MedicinalProductAuthorization): Option[UriStr]                  = t.implicitRules
  def extractValidityPeriod(t: MedicinalProductAuthorization): Option[Period]                 = t.validityPeriod
  def extractModifierExtension(t: MedicinalProductAuthorization): LitSeq[Extension]           = t.modifierExtension
  def extractDataExclusivityPeriod(t: MedicinalProductAuthorization): Option[Period]          = t.dataExclusivityPeriod
  def extractInternationalBirthDate(t: MedicinalProductAuthorization): Option[FHIRDateTime]   = t.internationalBirthDate
  def extractDateOfFirstAuthorization(t: MedicinalProductAuthorization): Option[FHIRDateTime] = t.dateOfFirstAuthorization
  def extractProcedure(t: MedicinalProductAuthorization): Option[MedicinalProductAuthorization.Procedure] = t.procedure
  def extractJurisdictionalAuthorization(
      t: MedicinalProductAuthorization): LitSeq[MedicinalProductAuthorization.JurisdictionalAuthorization] =
    t.jurisdictionalAuthorization
  override val thisName: String = "MedicinalProductAuthorization"
  override val searchParams: Map[String, MedicinalProductAuthorization => Seq[Any]] = Map(
    "subject"    -> (obj => obj.subject.toSeq),
    "identifier" -> (obj => obj.identifier.toSeq),
    "country"    -> (obj => obj.country.toSeq),
    "holder"     -> (obj => obj.holder.toSeq),
    "status"     -> (obj => obj.status.toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[MedicinalProductAuthorization] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new MedicinalProductAuthorization(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("status", Some(None)),
          cursor.decodeAs[Option[Reference]]("holder", Some(None)),
          cursor.decodeAs[Option[Reference]]("subject", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("country", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("regulator", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[FHIRDateTime]]("statusDate", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("legalBasis", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("restoreDate", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("jurisdiction", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[Period]]("validityPeriod", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Period]]("dataExclusivityPeriod", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("internationalBirthDate", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("dateOfFirstAuthorization", Some(None)),
          cursor.decodeAs[Option[MedicinalProductAuthorization.Procedure]]("procedure", Some(None)),
          cursor.decodeAs[LitSeq[MedicinalProductAuthorization.JurisdictionalAuthorization]](
            "jurisdictionalAuthorization",
            Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** The regulatory authorization of a medicinal product.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields status, holder, subject, country, regulator, identifier, statusDate, legalBasis, restoreDate,
  *   jurisdiction, validityPeriod, dataExclusivityPeriod, internationalBirthDate, dateOfFirstAuthorization, procedure,
  *   jurisdictionalAuthorization.
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
  * @param status
  *   - The status of the marketing authorization.
  * @param holder
  *   - Marketing Authorization Holder.
  * @param subject
  *   - The medicinal product that is being authorized.
  * @param country
  *   - The country in which the marketing authorization has been granted.
  * @param language
  *   - The base language in which the resource is written.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param regulator
  *   - Medicines Regulatory Agency.
  * @param identifier
  *   - Business identifier for the marketing authorization, as assigned by a regulator.
  * @param statusDate
  *   - The date at which the given status has become applicable.
  * @param legalBasis
  *   - The legal framework against which this authorization is granted.
  * @param restoreDate
  *   - The date when a suspended the marketing or the marketing authorization of the product is anticipated to be restored.
  * @param jurisdiction
  *   - Jurisdiction within a country.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param validityPeriod
  *   - The beginning of the time period in which the marketing authorization is in the specific status shall be specified A
  *   complete date consisting of day, month and year shall be specified using the ISO 8601 date format.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *   the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually
  *   modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict
  *   set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param dataExclusivityPeriod
  *   - A period of time after authorization before generic product applicatiosn can be submitted.
  * @param internationalBirthDate
  *   - Date of first marketing authorization for a company's new medicinal product in any country in the World.
  * @param dateOfFirstAuthorization
  *   - The date when the first authorization was granted by a Medicines Regulatory Agency.
  * @param procedure
  *   - The regulatory procedure for granting or amending a marketing authorization.
  * @param jurisdictionalAuthorization
  *   - Authorization in areas within a country.
  */
@POJOBoilerplate
class MedicinalProductAuthorization(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val status: Option[CodeableConcept] = None,
    val holder: Option[Reference] = None,
    val subject: Option[Reference] = None,
    val country: LitSeq[CodeableConcept] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val regulator: Option[Reference] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val statusDate: Option[FHIRDateTime] = None,
    val legalBasis: Option[CodeableConcept] = None,
    val restoreDate: Option[FHIRDateTime] = None,
    val jurisdiction: LitSeq[CodeableConcept] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    val validityPeriod: Option[Period] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val dataExclusivityPeriod: Option[Period] = None,
    val internationalBirthDate: Option[FHIRDateTime] = None,
    val dateOfFirstAuthorization: Option[FHIRDateTime] = None,
    val procedure: Option[MedicinalProductAuthorization.Procedure] = None,
    val jurisdictionalAuthorization: LitSeq[MedicinalProductAuthorization.JurisdictionalAuthorization] = LitSeq.empty,
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
  override val thisTypeName: String = "MedicinalProductAuthorization"
}
