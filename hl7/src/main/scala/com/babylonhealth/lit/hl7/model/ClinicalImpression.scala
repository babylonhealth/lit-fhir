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
import com.babylonhealth.lit.hl7.CLINICALIMPRESSION_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object ClinicalImpression extends CompanionFor[ClinicalImpression] {
  implicit def summonObjectAndCompanionClinicalImpression47404349(
      o: ClinicalImpression): ObjectAndCompanion[ClinicalImpression, ClinicalImpression.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = ClinicalImpression
  override type ParentType   = ClinicalImpression
  override val baseType: CompanionFor[ResourceType] = ClinicalImpression
  override val parentType: CompanionFor[ParentType] = ClinicalImpression
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/ClinicalImpression")
  object Investigation extends CompanionFor[Investigation] {
    implicit def summonObjectAndCompanionInvestigation_1628114612(
        o: Investigation): ObjectAndCompanion[Investigation, Investigation.type] = ObjectAndCompanion(o, this)
    override type ResourceType = Investigation
    override type ParentType   = Investigation
    override val parentType: CompanionFor[ResourceType] = Investigation
    def apply(
        id: Option[String] = None,
        code: CodeableConcept,
        item: LitSeq[Reference] = LitSeq.empty,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Investigation = new Investigation(
      id,
      code,
      item,
      extension,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Investigation): Option[(Option[String], CodeableConcept, LitSeq[Reference], LitSeq[Extension], LitSeq[Extension])] =
      Some((o.id, o.code, o.item, o.extension, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val code: FHIRComponentFieldMeta[CodeableConcept] =
      FHIRComponentFieldMeta("code", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
    val item: FHIRComponentFieldMeta[LitSeq[Reference]] =
      FHIRComponentFieldMeta("item", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]]                                  = Seq(id, code, item, extension, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Investigation): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[CodeableConcept](code, t.code),
      FHIRComponentField[LitSeq[Reference]](item, t.item),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Investigation] = this
    val thisName: String                      = "Investigation"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Investigation] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Investigation(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[CodeableConcept]("code", None),
            cursor.decodeAs[LitSeq[Reference]]("item", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Investigation(
      override val id: Option[String] = None,
      val code: CodeableConcept,
      val item: LitSeq[Reference] = LitSeq.empty,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Finding extends CompanionFor[Finding] {
    implicit def summonObjectAndCompanionFinding_673310315(o: Finding): ObjectAndCompanion[Finding, Finding.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Finding
    override type ParentType   = Finding
    override val parentType: CompanionFor[ResourceType] = Finding
    def apply(
        id: Option[String] = None,
        basis: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        itemReference: Option[Reference] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        itemCodeableConcept: Option[CodeableConcept] = None,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Finding = new Finding(
      id,
      basis,
      extension,
      itemReference,
      modifierExtension,
      itemCodeableConcept,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Finding): Option[(Option[String], Option[String], LitSeq[Extension], Option[Reference], LitSeq[Extension], Option[CodeableConcept])] =
      Some((o.id, o.basis, o.extension, o.itemReference, o.modifierExtension, o.itemCodeableConcept))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val basis: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("basis", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val itemReference: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("itemReference", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val itemCodeableConcept: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("itemCodeableConcept", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, basis, extension, itemReference, modifierExtension, itemCodeableConcept)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Finding): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[String]](basis, t.basis),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Reference]](itemReference, t.itemReference),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[CodeableConcept]](itemCodeableConcept, t.itemCodeableConcept)
    )
    val baseType: CompanionFor[Finding] = this
    val thisName: String                = "Finding"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Finding] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Finding(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[String]]("basis", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Reference]]("itemReference", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[CodeableConcept]]("itemCodeableConcept", Some(None)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Finding(
      override val id: Option[String] = None,
      val basis: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val itemReference: Option[Reference] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val itemCodeableConcept: Option[CodeableConcept] = None,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  type EffectiveChoice = Choice[Union_0934386166]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      code: Option[CodeableConcept] = None,
      date: Option[FHIRDateTime] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      status: CLINICALIMPRESSION_STATUS,
      subject: Reference,
      problem: LitSeq[Reference] = LitSeq.empty,
      summary: Option[String] = None,
      language: Option[LANGUAGES] = None,
      assessor: Option[Reference] = None,
      previous: Option[Reference] = None,
      protocol: LitSeq[UriStr] = LitSeq.empty,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      encounter: Option[Reference] = None,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      description: Option[String] = None,
      statusReason: Option[CodeableConcept] = None,
      effective: Option[ClinicalImpression.EffectiveChoice] = None,
      implicitRules: Option[UriStr] = None,
      supportingInfo: LitSeq[Reference] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      prognosisReference: LitSeq[Reference] = LitSeq.empty,
      prognosisCodeableConcept: LitSeq[CodeableConcept] = LitSeq.empty,
      finding: LitSeq[ClinicalImpression.Finding] = LitSeq.empty,
      investigation: LitSeq[ClinicalImpression.Investigation] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): ClinicalImpression = new ClinicalImpression(
    id,
    meta,
    text,
    code,
    date,
    note,
    status,
    subject,
    problem,
    summary,
    language,
    assessor,
    previous,
    protocol,
    contained,
    extension,
    encounter,
    identifier,
    description,
    statusReason,
    effective,
    implicitRules,
    supportingInfo,
    modifierExtension,
    prognosisReference,
    prognosisCodeableConcept,
    finding,
    investigation,
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
  val date: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("date", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val status: FHIRComponentFieldMeta[CLINICALIMPRESSION_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[CLINICALIMPRESSION_STATUS], false, lTagOf[CLINICALIMPRESSION_STATUS])
  val subject: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("subject", lTagOf[Reference], false, lTagOf[Reference])
  val problem: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("problem", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val summary: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("summary", lTagOf[Option[String]], false, lTagOf[String])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val assessor: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("assessor", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val previous: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("previous", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val protocol: FHIRComponentFieldMeta[LitSeq[UriStr]] =
    FHIRComponentFieldMeta("protocol", lTagOf[LitSeq[UriStr]], false, lTagOf[UriStr])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val encounter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("encounter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val description: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("description", lTagOf[Option[String]], false, lTagOf[String])
  val statusReason: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("statusReason", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val effective: FHIRComponentFieldMeta[Option[ClinicalImpression.EffectiveChoice]] =
    FHIRComponentFieldMeta(
      "effective",
      lTagOf[Option[ClinicalImpression.EffectiveChoice]],
      true,
      lTagOf[Union_0934386166])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val supportingInfo: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("supportingInfo", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val prognosisReference: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("prognosisReference", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val prognosisCodeableConcept: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("prognosisCodeableConcept", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val finding: FHIRComponentFieldMeta[LitSeq[ClinicalImpression.Finding]] =
    FHIRComponentFieldMeta(
      "finding",
      lTagOf[LitSeq[ClinicalImpression.Finding]],
      false,
      lTagOf[ClinicalImpression.Finding])
  val investigation: FHIRComponentFieldMeta[LitSeq[ClinicalImpression.Investigation]] =
    FHIRComponentFieldMeta(
      "investigation",
      lTagOf[LitSeq[ClinicalImpression.Investigation]],
      false,
      lTagOf[ClinicalImpression.Investigation])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    code,
    date,
    note,
    status,
    subject,
    problem,
    summary,
    language,
    assessor,
    previous,
    protocol,
    contained,
    extension,
    encounter,
    identifier,
    description,
    statusReason,
    effective,
    implicitRules,
    supportingInfo,
    modifierExtension,
    prognosisReference,
    prognosisCodeableConcept,
    finding,
    investigation
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: ClinicalImpression): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[CodeableConcept]](code, t.code),
    FHIRComponentField[Option[FHIRDateTime]](date, t.date),
    FHIRComponentField[LitSeq[Annotation]](note, t.note),
    FHIRComponentField[CLINICALIMPRESSION_STATUS](status, t.status),
    FHIRComponentField[Reference](subject, t.subject),
    FHIRComponentField[LitSeq[Reference]](problem, t.problem),
    FHIRComponentField[Option[String]](summary, t.summary),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[Option[Reference]](assessor, t.assessor),
    FHIRComponentField[Option[Reference]](previous, t.previous),
    FHIRComponentField[LitSeq[UriStr]](protocol, t.protocol),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Reference]](encounter, t.encounter),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[Option[String]](description, t.description),
    FHIRComponentField[Option[CodeableConcept]](statusReason, t.statusReason),
    FHIRComponentField[Option[ClinicalImpression.EffectiveChoice]](effective, t.effective),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Reference]](supportingInfo, t.supportingInfo),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[Reference]](prognosisReference, t.prognosisReference),
    FHIRComponentField[LitSeq[CodeableConcept]](prognosisCodeableConcept, t.prognosisCodeableConcept),
    FHIRComponentField[LitSeq[ClinicalImpression.Finding]](finding, t.finding),
    FHIRComponentField[LitSeq[ClinicalImpression.Investigation]](investigation, t.investigation)
  )
  def extractId(t: ClinicalImpression): Option[String]                                      = t.id
  def extractMeta(t: ClinicalImpression): Option[Meta]                                      = t.meta
  def extractText(t: ClinicalImpression): Option[Narrative]                                 = t.text
  def extractCode(t: ClinicalImpression): Option[CodeableConcept]                           = t.code
  def extractDate(t: ClinicalImpression): Option[FHIRDateTime]                              = t.date
  def extractNote(t: ClinicalImpression): LitSeq[Annotation]                                = t.note
  def extractStatus(t: ClinicalImpression): CLINICALIMPRESSION_STATUS                       = t.status
  def extractSubject(t: ClinicalImpression): Reference                                      = t.subject
  def extractProblem(t: ClinicalImpression): LitSeq[Reference]                              = t.problem
  def extractSummary(t: ClinicalImpression): Option[String]                                 = t.summary
  def extractLanguage(t: ClinicalImpression): Option[LANGUAGES]                             = t.language
  def extractAssessor(t: ClinicalImpression): Option[Reference]                             = t.assessor
  def extractPrevious(t: ClinicalImpression): Option[Reference]                             = t.previous
  def extractProtocol(t: ClinicalImpression): LitSeq[UriStr]                                = t.protocol
  def extractContained(t: ClinicalImpression): LitSeq[Resource]                             = t.contained
  def extractExtension(t: ClinicalImpression): LitSeq[Extension]                            = t.extension
  def extractEncounter(t: ClinicalImpression): Option[Reference]                            = t.encounter
  def extractIdentifier(t: ClinicalImpression): LitSeq[Identifier]                          = t.identifier
  def extractDescription(t: ClinicalImpression): Option[String]                             = t.description
  def extractStatusReason(t: ClinicalImpression): Option[CodeableConcept]                   = t.statusReason
  def extractEffective(t: ClinicalImpression): Option[ClinicalImpression.EffectiveChoice]   = t.effective
  def extractImplicitRules(t: ClinicalImpression): Option[UriStr]                           = t.implicitRules
  def extractSupportingInfo(t: ClinicalImpression): LitSeq[Reference]                       = t.supportingInfo
  def extractModifierExtension(t: ClinicalImpression): LitSeq[Extension]                    = t.modifierExtension
  def extractPrognosisReference(t: ClinicalImpression): LitSeq[Reference]                   = t.prognosisReference
  def extractPrognosisCodeableConcept(t: ClinicalImpression): LitSeq[CodeableConcept]       = t.prognosisCodeableConcept
  def extractFinding(t: ClinicalImpression): LitSeq[ClinicalImpression.Finding]             = t.finding
  def extractInvestigation(t: ClinicalImpression): LitSeq[ClinicalImpression.Investigation] = t.investigation
  override val thisName: String                                                             = "ClinicalImpression"
  override val searchParams: Map[String, ClinicalImpression => Seq[Any]] = Map(
    "subject"         -> (obj => Seq(obj.subject)),
    "identifier"      -> (obj => obj.identifier.toSeq),
    "problem"         -> (obj => obj.problem.toSeq),
    "previous"        -> (obj => obj.previous.toSeq),
    "investigation"   -> (obj => obj.investigation.flatMap(_.item).toSeq),
    "finding-ref"     -> (obj => obj.finding.flatMap(_.itemReference).toSeq),
    "assessor"        -> (obj => obj.assessor.toSeq),
    "date"            -> (obj => obj.date.toSeq),
    "status"          -> (obj => Seq(obj.status)),
    "encounter"       -> (obj => obj.encounter.toSeq),
    "patient"         -> (obj => obj.subject.seqIf(_.reference.exists(_.contains("Patient/"))).toSeq),
    "finding-code"    -> (obj => obj.finding.flatMap(_.itemCodeableConcept).toSeq),
    "supporting-info" -> (obj => obj.supportingInfo.toSeq)
  )
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ClinicalImpression] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new ClinicalImpression(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("code", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("date", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[CLINICALIMPRESSION_STATUS]("status", None),
          cursor.decodeAs[Reference]("subject", None),
          cursor.decodeAs[LitSeq[Reference]]("problem", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("summary", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[Reference]]("assessor", Some(None)),
          cursor.decodeAs[Option[Reference]]("previous", Some(None)),
          cursor.decodeAs[LitSeq[UriStr]]("protocol", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("description", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("statusReason", Some(None)),
          cursor.decodeOptRef[Union_0934386166]("effective"),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("supportingInfo", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("prognosisReference", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("prognosisCodeableConcept", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[ClinicalImpression.Finding]]("finding", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[ClinicalImpression.Investigation]]("investigation", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called "ClinicalImpression" rather than "ClinicalAssessment" to avoid confusion with the recording of assessment tools such as Apgar score.
  *
  *  Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor Introduces the fields code, date, note, status, subject, problem, summary, assessor, previous, protocol, encounter, identifier, description, statusReason, effective, supportingInfo, prognosisReference, prognosisCodeableConcept, finding, investigation.
  * @param id - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
  * @param text - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
  * @param code - Categorizes the type of clinical assessment performed.
  * @param date - Indicates when the documentation of the assessment was complete.
  * @param note - Commentary about the impression, typically recorded after the impression itself was made, though supplemental notes by the original author could also appear.
  * @param status - Identifies the workflow status of the assessment.
  * @param subject - The patient or group of individuals assessed as part of this record.
  * @param problem - A list of the relevant problems/conditions for a patient.
  * @param summary - A text summary of the investigations and the diagnosis.
  * @param language - The base language in which the resource is written.
  * @param assessor - The clinician performing the assessment.
  * @param previous - A reference to the last assessment that was conducted on this patient. Assessments are often/usually ongoing in nature; a care provider (practitioner or team) will make new assessments on an ongoing basis as new data arises or the patient's conditions changes.
  * @param protocol - Reference to a specific published clinical protocol that was followed during this assessment, and/or that provides evidence in support of the diagnosis.
  * @param contained - These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param encounter - The Encounter during which this ClinicalImpression was created or to which the creation of this record is tightly associated.
  * @param identifier - Business identifiers assigned to this clinical impression by the performer or other systems which remain constant as the resource is updated and propagates from server to server.
  * @param description - A summary of the context and/or cause of the assessment - why / where it was performed, and what patient events/status prompted it.
  * @param statusReason - Captures the reason for the current state of the ClinicalImpression.
  * @param effective - The point in time or period over which the subject was assessed.
  * @param implicitRules - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
  * @param supportingInfo - Information supporting the clinical impression.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param prognosisReference - RiskAssessment expressing likely outcome.
  * @param prognosisCodeableConcept - Estimate of likely outcome.
  * @param finding - Specific findings or diagnoses that were considered likely or relevant to ongoing treatment.
  * @param investigation - One or more sets of investigations (signs, symptoms, etc.). The actual grouping of investigations varies greatly depending on the type and context of the assessment. These investigations may include data generated during the assessment process, or data previously generated and recorded that is pertinent to the outcomes.
  */
@POJOBoilerplate
class ClinicalImpression(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val code: Option[CodeableConcept] = None,
    val date: Option[FHIRDateTime] = None,
    val note: LitSeq[Annotation] = LitSeq.empty,
    val status: CLINICALIMPRESSION_STATUS,
    val subject: Reference,
    val problem: LitSeq[Reference] = LitSeq.empty,
    val summary: Option[String] = None,
    override val language: Option[LANGUAGES] = None,
    val assessor: Option[Reference] = None,
    val previous: Option[Reference] = None,
    val protocol: LitSeq[UriStr] = LitSeq.empty,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val encounter: Option[Reference] = None,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val description: Option[String] = None,
    val statusReason: Option[CodeableConcept] = None,
    val effective: Option[ClinicalImpression.EffectiveChoice] = None,
    override val implicitRules: Option[UriStr] = None,
    val supportingInfo: LitSeq[Reference] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val prognosisReference: LitSeq[Reference] = LitSeq.empty,
    val prognosisCodeableConcept: LitSeq[CodeableConcept] = LitSeq.empty,
    val finding: LitSeq[ClinicalImpression.Finding] = LitSeq.empty,
    val investigation: LitSeq[ClinicalImpression.Investigation] = LitSeq.empty,
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
  override val thisTypeName: String = "ClinicalImpression"
}
