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
import com.babylonhealth.lit.hl7.{ ISSUE_TYPE, ISSUE_SEVERITY }
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7 }
import com.babylonhealth.lit.macros.POJOBoilerplate

object OperationOutcome extends CompanionFor[OperationOutcome] {
  implicit def summonObjectAndCompanionOperationOutcome1872183966(
      o: OperationOutcome): ObjectAndCompanion[OperationOutcome, OperationOutcome.type] = ObjectAndCompanion(o, this)
  override type ResourceType = OperationOutcome
  override type ParentType   = OperationOutcome
  override val baseType: CompanionFor[ResourceType] = OperationOutcome
  override val parentType: CompanionFor[ParentType] = OperationOutcome
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/OperationOutcome")
  object Issue extends CompanionFor[Issue] {
    implicit def summonObjectAndCompanionIssue1641448363(o: Issue): ObjectAndCompanion[Issue, Issue.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Issue
    override type ParentType   = Issue
    override val parentType: CompanionFor[ResourceType] = Issue
    def apply(
        id: Option[String] = None,
        code: ISSUE_TYPE,
        details: Option[CodeableConcept] = None,
        severity: ISSUE_SEVERITY,
        location: LitSeq[String] = LitSeq.empty,
        extension: LitSeq[Extension] = LitSeq.empty,
        expression: LitSeq[String] = LitSeq.empty,
        diagnostics: Option[String] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Issue = new Issue(
      id,
      code,
      details,
      severity,
      location,
      extension,
      expression,
      diagnostics,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Issue): Option[(Option[String], ISSUE_TYPE, Option[CodeableConcept], ISSUE_SEVERITY, LitSeq[String], LitSeq[Extension], LitSeq[String], Option[String], LitSeq[Extension])] =
      Some((o.id, o.code, o.details, o.severity, o.location, o.extension, o.expression, o.diagnostics, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val code: FHIRComponentFieldMeta[ISSUE_TYPE] =
      FHIRComponentFieldMeta("code", lTagOf[ISSUE_TYPE], false, lTagOf[ISSUE_TYPE])
    val details: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("details", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val severity: FHIRComponentFieldMeta[ISSUE_SEVERITY] =
      FHIRComponentFieldMeta("severity", lTagOf[ISSUE_SEVERITY], false, lTagOf[ISSUE_SEVERITY])
    val location: FHIRComponentFieldMeta[LitSeq[String]] =
      FHIRComponentFieldMeta("location", lTagOf[LitSeq[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val expression: FHIRComponentFieldMeta[LitSeq[String]] =
      FHIRComponentFieldMeta("expression", lTagOf[LitSeq[String]], false, lTagOf[String])
    val diagnostics: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("diagnostics", lTagOf[Option[String]], false, lTagOf[String])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, code, details, severity, location, extension, expression, diagnostics, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Issue): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[ISSUE_TYPE](code, t.code),
      FHIRComponentField[Option[CodeableConcept]](details, t.details),
      FHIRComponentField[ISSUE_SEVERITY](severity, t.severity),
      FHIRComponentField[LitSeq[String]](location, t.location),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[String]](expression, t.expression),
      FHIRComponentField[Option[String]](diagnostics, t.diagnostics),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[Issue] = this
    val thisName: String              = "Issue"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Issue] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Issue(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[ISSUE_TYPE]("code", None),
            cursor.decodeAs[Option[CodeableConcept]]("details", Some(None)),
            cursor.decodeAs[ISSUE_SEVERITY]("severity", None),
            cursor.decodeAs[LitSeq[String]]("location", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[String]]("expression", Some(LitSeq.empty)),
            cursor.decodeAs[Option[String]]("diagnostics", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Issue(
      override val id: Option[String] = None,
      val code: ISSUE_TYPE,
      val details: Option[CodeableConcept] = None,
      val severity: ISSUE_SEVERITY,
      val location: LitSeq[String] = LitSeq.empty,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val expression: LitSeq[String] = LitSeq.empty,
      val diagnostics: Option[String] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      issue: NonEmptyLitSeq[OperationOutcome.Issue],
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): OperationOutcome = new OperationOutcome(
    id,
    meta,
    text,
    language,
    contained,
    extension,
    implicitRules,
    modifierExtension,
    issue,
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
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val issue: FHIRComponentFieldMeta[NonEmptyLitSeq[OperationOutcome.Issue]] =
    FHIRComponentFieldMeta("issue", lTagOf[NonEmptyLitSeq[OperationOutcome.Issue]], false, lTagOf[OperationOutcome.Issue])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
    Seq(id, meta, text, language, contained, extension, implicitRules, modifierExtension, issue)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: OperationOutcome): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[NonEmptyLitSeq[OperationOutcome.Issue]](issue, t.issue)
  )
  def extractId(t: OperationOutcome): Option[String]                            = t.id
  def extractMeta(t: OperationOutcome): Option[Meta]                            = t.meta
  def extractText(t: OperationOutcome): Option[Narrative]                       = t.text
  def extractLanguage(t: OperationOutcome): Option[LANGUAGES]                   = t.language
  def extractContained(t: OperationOutcome): LitSeq[Resource]                   = t.contained
  def extractExtension(t: OperationOutcome): LitSeq[Extension]                  = t.extension
  def extractImplicitRules(t: OperationOutcome): Option[UriStr]                 = t.implicitRules
  def extractModifierExtension(t: OperationOutcome): LitSeq[Extension]          = t.modifierExtension
  def extractIssue(t: OperationOutcome): NonEmptyLitSeq[OperationOutcome.Issue] = t.issue
  override val thisName: String                                                 = "OperationOutcome"
  def unapply(
      o: OperationOutcome): Option[(Option[String], Option[Meta], Option[Narrative], Option[LANGUAGES], LitSeq[Resource], LitSeq[Extension], Option[UriStr], LitSeq[Extension], NonEmptyLitSeq[OperationOutcome.Issue])] =
    Some((o.id, o.meta, o.text, o.language, o.contained, o.extension, o.implicitRules, o.modifierExtension, o.issue))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[OperationOutcome] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new OperationOutcome(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[NonEmptyLitSeq[OperationOutcome.Issue]]("issue", None),
          decodeAttributes(cursor)
        )
      ))
}

/** A collection of error, warning, or information messages that result from a system action.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields issue.
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
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *   the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually
  *   modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict
  *   set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param issue
  *   - An error, warning, or information message that results from a system action.
  */
@POJOBoilerplate
class OperationOutcome(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val issue: NonEmptyLitSeq[OperationOutcome.Issue],
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
  override val thisTypeName: String = "OperationOutcome"
}
