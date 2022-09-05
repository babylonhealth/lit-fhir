package com.babylonhealth.lit.ukcore.model

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
import com.babylonhealth.lit.{ core, hl7, ukcore }
import com.babylonhealth.lit.macros.POJOBoilerplate

object UKCore_OperationOutcome extends CompanionFor[UKCore_OperationOutcome] {
  implicit def summonObjectAndCompanionUKCore_OperationOutcome_2020910182(
      o: UKCore_OperationOutcome): ObjectAndCompanion[UKCore_OperationOutcome, UKCore_OperationOutcome.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = OperationOutcome
  override type ParentType   = OperationOutcome
  override val baseType: CompanionFor[ResourceType] = OperationOutcome
  override val parentType: CompanionFor[ParentType] = OperationOutcome
  override val profileUrl: Option[String]           = Some("https://fhir.hl7.org.uk/StructureDefinition/UKCore-OperationOutcome")
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(
        new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-OperationOutcome"))),
      text: Option[Narrative] = None,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      issue: NonEmptyLitSeq[OperationOutcome.Issue],
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): UKCore_OperationOutcome = new UKCore_OperationOutcome(
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
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Meta]](meta, t.meta),
      FHIRComponentField[Option[Narrative]](text, t.text),
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[LitSeq[Resource]](contained, t.contained),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[NonEmptyLitSeq[OperationOutcome.Issue]](issue, t.issue)
    ))
  override def fields(t: UKCore_OperationOutcome): Seq[FHIRComponentField[_]]          = fieldsFromParent(t).get
  def extractId(t: UKCore_OperationOutcome): Option[String]                            = t.id
  def extractMeta(t: UKCore_OperationOutcome): Option[Meta]                            = t.meta
  def extractText(t: UKCore_OperationOutcome): Option[Narrative]                       = t.text
  def extractLanguage(t: UKCore_OperationOutcome): Option[LANGUAGES]                   = t.language
  def extractContained(t: UKCore_OperationOutcome): LitSeq[Resource]                   = t.contained
  def extractExtension(t: UKCore_OperationOutcome): LitSeq[Extension]                  = t.extension
  def extractImplicitRules(t: UKCore_OperationOutcome): Option[UriStr]                 = t.implicitRules
  def extractModifierExtension(t: UKCore_OperationOutcome): LitSeq[Extension]          = t.modifierExtension
  def extractIssue(t: UKCore_OperationOutcome): NonEmptyLitSeq[OperationOutcome.Issue] = t.issue
  override val thisName: String                                                        = "UKCore_OperationOutcome"
  override val searchParams: Map[String, UKCore_OperationOutcome => Seq[Any]]          = OperationOutcome.searchParams
  def unapply(
      o: UKCore_OperationOutcome): Option[(Option[String], Option[Meta], Option[Narrative], Option[LANGUAGES], LitSeq[Resource], LitSeq[Extension], Option[UriStr], LitSeq[Extension], NonEmptyLitSeq[OperationOutcome.Issue])] =
    Some((o.id, o.meta, o.text, o.language, o.contained, o.extension, o.implicitRules, o.modifierExtension, o.issue))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[UKCore_OperationOutcome] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new UKCore_OperationOutcome(
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

/** Defines the UK Core constraints and extensions on the OperationOutcome resource for the minimal set of data to query and
  * retrieve information about the outcome of an attempted system operation.
  *
  * Subclass of [[hl7.model.OperationOutcome]] (A collection of error, warning, or information messages that result from a system
  * action.)
  *
  * @constructor
  *   Inherits all params from parent.
  * @param id
  *   \- The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta
  *   \- The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *   not always be associated with version changes to the resource.
  * @param text
  *   \- A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *   resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to
  *   make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be
  *   represented in the narrative to ensure clinical safety.
  * @param language
  *   \- The base language in which the resource is written.
  * @param contained
  *   \- These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *   identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   \- May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *   of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *   Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *   of the extension.
  * @param implicitRules
  *   \- A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param modifierExtension
  *   \- May be used to represent additional information that is not part of the basic definition of the resource and that
  *   modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *   Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *   strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *   extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *   processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any
  *   elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param issue
  *   \- An error, warning, or information message that results from a system action.
  */
@POJOBoilerplate
class UKCore_OperationOutcome(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-OperationOutcome"))),
    override val text: Option[Narrative] = None,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val issue: NonEmptyLitSeq[OperationOutcome.Issue],
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends OperationOutcome(
      id = id,
      meta = meta,
      text = text,
      language = language,
      contained = contained,
      extension = extension,
      implicitRules = implicitRules,
      modifierExtension = modifierExtension,
      issue = issue,
      primitiveAttributes = primitiveAttributes
    ) {
  override val thisTypeName: String = "OperationOutcome"
}
