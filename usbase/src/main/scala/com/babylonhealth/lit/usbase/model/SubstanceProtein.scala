package com.babylonhealth.lit.usbase.model

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
import com.babylonhealth.lit.usbase.UnionAliases._
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object SubstanceProtein extends CompanionFor[SubstanceProtein] {
  implicit def summonObjectAndCompanionSubstanceProtein1755161064(
      o: SubstanceProtein): ObjectAndCompanion[SubstanceProtein, SubstanceProtein.type] = ObjectAndCompanion(o, this)
  override type ResourceType = SubstanceProtein
  override type ParentType   = SubstanceProtein
  override val baseType: CompanionFor[ResourceType] = SubstanceProtein
  override val parentType: CompanionFor[ParentType] = SubstanceProtein
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/SubstanceProtein")
  object Subunit extends CompanionFor[Subunit] {
    implicit def summonObjectAndCompanionSubunit_1572085722(o: Subunit): ObjectAndCompanion[Subunit, Subunit.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Subunit
    override type ParentType   = Subunit
    override val parentType: CompanionFor[ResourceType] = Subunit
    def apply(
        id: Option[String] = None,
        length: Option[Int] = None,
        subunit: Option[Int] = None,
        sequence: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        sequenceAttachment: Option[Attachment] = None,
        nTerminalModification: Option[String] = None,
        cTerminalModification: Option[String] = None,
        nTerminalModificationId: Option[Identifier] = None,
        cTerminalModificationId: Option[Identifier] = None,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Subunit = new Subunit(
      id,
      length,
      subunit,
      sequence,
      extension,
      modifierExtension,
      sequenceAttachment,
      nTerminalModification,
      cTerminalModification,
      nTerminalModificationId,
      cTerminalModificationId,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Subunit): Option[(Option[String], Option[Int], Option[Int], Option[String], LitSeq[Extension], LitSeq[Extension], Option[Attachment], Option[String], Option[String], Option[Identifier], Option[Identifier])] =
      Some(
        (
          o.id,
          o.length,
          o.subunit,
          o.sequence,
          o.extension,
          o.modifierExtension,
          o.sequenceAttachment,
          o.nTerminalModification,
          o.cTerminalModification,
          o.nTerminalModificationId,
          o.cTerminalModificationId))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val length: FHIRComponentFieldMeta[Option[Int]] =
      FHIRComponentFieldMeta("length", lTagOf[Option[Int]], false, lTagOf[Int])
    val subunit: FHIRComponentFieldMeta[Option[Int]] =
      FHIRComponentFieldMeta("subunit", lTagOf[Option[Int]], false, lTagOf[Int])
    val sequence: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("sequence", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val sequenceAttachment: FHIRComponentFieldMeta[Option[Attachment]] =
      FHIRComponentFieldMeta("sequenceAttachment", lTagOf[Option[Attachment]], false, lTagOf[Attachment])
    val nTerminalModification: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("nTerminalModification", lTagOf[Option[String]], false, lTagOf[String])
    val cTerminalModification: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("cTerminalModification", lTagOf[Option[String]], false, lTagOf[String])
    val nTerminalModificationId: FHIRComponentFieldMeta[Option[Identifier]] =
      FHIRComponentFieldMeta("nTerminalModificationId", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
    val cTerminalModificationId: FHIRComponentFieldMeta[Option[Identifier]] =
      FHIRComponentFieldMeta("cTerminalModificationId", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
      id,
      length,
      subunit,
      sequence,
      extension,
      modifierExtension,
      sequenceAttachment,
      nTerminalModification,
      cTerminalModification,
      nTerminalModificationId,
      cTerminalModificationId
    )
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Subunit): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Int]](length, t.length),
      FHIRComponentField[Option[Int]](subunit, t.subunit),
      FHIRComponentField[Option[String]](sequence, t.sequence),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[Attachment]](sequenceAttachment, t.sequenceAttachment),
      FHIRComponentField[Option[String]](nTerminalModification, t.nTerminalModification),
      FHIRComponentField[Option[String]](cTerminalModification, t.cTerminalModification),
      FHIRComponentField[Option[Identifier]](nTerminalModificationId, t.nTerminalModificationId),
      FHIRComponentField[Option[Identifier]](cTerminalModificationId, t.cTerminalModificationId)
    )
    val baseType: CompanionFor[Subunit] = this
    val thisName: String                = "Subunit"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Subunit] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Subunit(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[Int]]("length", Some(None)),
            cursor.decodeAs[Option[Int]]("subunit", Some(None)),
            cursor.decodeAs[Option[String]]("sequence", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Attachment]]("sequenceAttachment", Some(None)),
            cursor.decodeAs[Option[String]]("nTerminalModification", Some(None)),
            cursor.decodeAs[Option[String]]("cTerminalModification", Some(None)),
            cursor.decodeAs[Option[Identifier]]("nTerminalModificationId", Some(None)),
            cursor.decodeAs[Option[Identifier]]("cTerminalModificationId", Some(None)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Subunit(
      override val id: Option[String] = None,
      val length: Option[Int] = None,
      val subunit: Option[Int] = None,
      val sequence: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val sequenceAttachment: Option[Attachment] = None,
      val nTerminalModification: Option[String] = None,
      val cTerminalModification: Option[String] = None,
      val nTerminalModificationId: Option[Identifier] = None,
      val cTerminalModificationId: Option[Identifier] = None,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      sequenceType: Option[CodeableConcept] = None,
      implicitRules: Option[UriStr] = None,
      numberOfSubunits: Option[Int] = None,
      disulfideLinkage: LitSeq[String] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      subunit: LitSeq[SubstanceProtein.Subunit] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): SubstanceProtein = new SubstanceProtein(
    id,
    meta,
    text,
    language,
    contained,
    extension,
    sequenceType,
    implicitRules,
    numberOfSubunits,
    disulfideLinkage,
    modifierExtension,
    subunit,
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
  val sequenceType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("sequenceType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val numberOfSubunits: FHIRComponentFieldMeta[Option[Int]] =
    FHIRComponentFieldMeta("numberOfSubunits", lTagOf[Option[Int]], false, lTagOf[Int])
  val disulfideLinkage: FHIRComponentFieldMeta[LitSeq[String]] =
    FHIRComponentFieldMeta("disulfideLinkage", lTagOf[LitSeq[String]], false, lTagOf[String])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val subunit: FHIRComponentFieldMeta[LitSeq[SubstanceProtein.Subunit]] =
    FHIRComponentFieldMeta("subunit", lTagOf[LitSeq[SubstanceProtein.Subunit]], false, lTagOf[SubstanceProtein.Subunit])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    language,
    contained,
    extension,
    sequenceType,
    implicitRules,
    numberOfSubunits,
    disulfideLinkage,
    modifierExtension,
    subunit)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: SubstanceProtein): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[CodeableConcept]](sequenceType, t.sequenceType),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[Int]](numberOfSubunits, t.numberOfSubunits),
    FHIRComponentField[LitSeq[String]](disulfideLinkage, t.disulfideLinkage),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[SubstanceProtein.Subunit]](subunit, t.subunit)
  )
  def extractId(t: SubstanceProtein): Option[String]                        = t.id
  def extractMeta(t: SubstanceProtein): Option[Meta]                        = t.meta
  def extractText(t: SubstanceProtein): Option[Narrative]                   = t.text
  def extractLanguage(t: SubstanceProtein): Option[LANGUAGES]               = t.language
  def extractContained(t: SubstanceProtein): LitSeq[Resource]               = t.contained
  def extractExtension(t: SubstanceProtein): LitSeq[Extension]              = t.extension
  def extractSequenceType(t: SubstanceProtein): Option[CodeableConcept]     = t.sequenceType
  def extractImplicitRules(t: SubstanceProtein): Option[UriStr]             = t.implicitRules
  def extractNumberOfSubunits(t: SubstanceProtein): Option[Int]             = t.numberOfSubunits
  def extractDisulfideLinkage(t: SubstanceProtein): LitSeq[String]          = t.disulfideLinkage
  def extractModifierExtension(t: SubstanceProtein): LitSeq[Extension]      = t.modifierExtension
  def extractSubunit(t: SubstanceProtein): LitSeq[SubstanceProtein.Subunit] = t.subunit
  override val thisName: String                                             = "SubstanceProtein"
  def unapply(
      o: SubstanceProtein): Option[(Option[String], Option[Meta], Option[Narrative], Option[LANGUAGES], LitSeq[Resource], LitSeq[Extension], Option[CodeableConcept], Option[UriStr], Option[Int], LitSeq[String], LitSeq[Extension], LitSeq[SubstanceProtein.Subunit])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.language,
        o.contained,
        o.extension,
        o.sequenceType,
        o.implicitRules,
        o.numberOfSubunits,
        o.disulfideLinkage,
        o.modifierExtension,
        o.subunit))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[SubstanceProtein] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new SubstanceProtein(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("sequenceType", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[Int]]("numberOfSubunits", Some(None)),
          cursor.decodeAs[LitSeq[String]]("disulfideLinkage", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[SubstanceProtein.Subunit]]("subunit", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** A SubstanceProtein is defined as a single unit of a linear amino acid sequence, or a combination of subunits that are either
  * covalently linked or have a defined invariant stoichiometric relationship. This includes all synthetic, recombinant and
  * purified SubstanceProteins of defined sequence, whether the use is therapeutic or prophylactic. This set of elements will be
  * used to describe albumins, coagulation factors, cytokines, growth factors, peptide/SubstanceProtein hormones, enzymes, toxins,
  * toxoids, recombinant vaccines, and immunomodulators.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields sequenceType, numberOfSubunits, disulfideLinkage, subunit.
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
  * @param sequenceType
  *   - The SubstanceProtein descriptive elements will only be used when a complete or partial amino acid sequence is available
  *   or derivable from a nucleic acid sequence.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param numberOfSubunits
  *   - Number of linear sequences of amino acids linked through peptide bonds. The number of subunits constituting the
  *   SubstanceProtein shall be described. It is possible that the number of subunits can be variable.
  * @param disulfideLinkage
  *   - The disulphide bond between two cysteine residues either on the same subunit or on two different subunits shall be
  *   described. The position of the disulfide bonds in the SubstanceProtein shall be listed in increasing order of subunit number
  *   and position within subunit followed by the abbreviation of the amino acids involved. The disulfide linkage positions shall
  *   actually contain the amino acid Cysteine at the respective positions.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that
  *   modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *   Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *   strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *   extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *   processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any
  *   elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param subunit
  *   - This subclause refers to the description of each subunit constituting the SubstanceProtein. A subunit is a linear
  *   sequence of amino acids linked through peptide bonds. The Subunit information shall be provided when the finished
  *   SubstanceProtein is a complex of multiple sequences; subunits are not used to delineate domains within a single sequence.
  *   Subunits are listed in order of decreasing length; sequences of the same length will be ordered by decreasing molecular
  *   weight; subunits that have identical sequences will be repeated multiple times.
  */
@POJOBoilerplate
class SubstanceProtein(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val sequenceType: Option[CodeableConcept] = None,
    override val implicitRules: Option[UriStr] = None,
    val numberOfSubunits: Option[Int] = None,
    val disulfideLinkage: LitSeq[String] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val subunit: LitSeq[SubstanceProtein.Subunit] = LitSeq.empty,
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
  override val thisTypeName: String = "SubstanceProtein"
}
