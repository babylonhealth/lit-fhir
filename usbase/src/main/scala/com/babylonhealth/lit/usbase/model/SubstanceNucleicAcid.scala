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

object SubstanceNucleicAcid extends CompanionFor[SubstanceNucleicAcid] {
  implicit def summonObjectAndCompanionSubstanceNucleicAcid1006816017(
      o: SubstanceNucleicAcid): ObjectAndCompanion[SubstanceNucleicAcid, SubstanceNucleicAcid.type] = ObjectAndCompanion(o, this)
  override type ResourceType = SubstanceNucleicAcid
  override type ParentType   = SubstanceNucleicAcid
  override val baseType: CompanionFor[ResourceType] = SubstanceNucleicAcid
  override val parentType: CompanionFor[ParentType] = SubstanceNucleicAcid
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/SubstanceNucleicAcid")
  object Subunit extends CompanionFor[Subunit] {
    implicit def summonObjectAndCompanionSubunit_601614472(o: Subunit): ObjectAndCompanion[Subunit, Subunit.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Subunit
    override type ParentType   = Subunit
    override val parentType: CompanionFor[ResourceType] = Subunit
    object Sugar extends CompanionFor[Sugar] {
      implicit def summonObjectAndCompanionSugar_706598140(o: Sugar): ObjectAndCompanion[Sugar, Sugar.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Sugar
      override type ParentType   = Sugar
      override val parentType: CompanionFor[ResourceType] = Sugar
      def apply(
          id: Option[String] = None,
          name: Option[String] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          identifier: Option[Identifier] = None,
          residueSite: Option[String] = None,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Sugar = new Sugar(
        id,
        name,
        extension,
        identifier,
        residueSite,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Sugar): Option[(Option[String], Option[String], LitSeq[Extension], Option[Identifier], Option[String], LitSeq[Extension])] =
        Some((o.id, o.name, o.extension, o.identifier, o.residueSite, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val name: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("name", lTagOf[Option[String]], false, lTagOf[String])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val identifier: FHIRComponentFieldMeta[Option[Identifier]] =
        FHIRComponentFieldMeta("identifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
      val residueSite: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("residueSite", lTagOf[Option[String]], false, lTagOf[String])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, name, extension, identifier, residueSite, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Sugar): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[String]](name, t.name),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[Identifier]](identifier, t.identifier),
        FHIRComponentField[Option[String]](residueSite, t.residueSite),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Sugar] = this
      val thisName: String              = "Sugar"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Sugar] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Sugar(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[String]]("name", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[Identifier]]("identifier", Some(None)),
              cursor.decodeAs[Option[String]]("residueSite", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Sugar(
        override val id: Option[String] = None,
        val name: Option[String] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val identifier: Option[Identifier] = None,
        val residueSite: Option[String] = None,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object Linkage extends CompanionFor[Linkage] {
      implicit def summonObjectAndCompanionLinkage_706598140(o: Linkage): ObjectAndCompanion[Linkage, Linkage.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Linkage
      override type ParentType   = Linkage
      override val parentType: CompanionFor[ResourceType] = Linkage
      def apply(
          id: Option[String] = None,
          name: Option[String] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          identifier: Option[Identifier] = None,
          residueSite: Option[String] = None,
          connectivity: Option[String] = None,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Linkage = new Linkage(
        id,
        name,
        extension,
        identifier,
        residueSite,
        connectivity,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Linkage): Option[(Option[String], Option[String], LitSeq[Extension], Option[Identifier], Option[String], Option[String], LitSeq[Extension])] =
        Some((o.id, o.name, o.extension, o.identifier, o.residueSite, o.connectivity, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val name: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("name", lTagOf[Option[String]], false, lTagOf[String])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val identifier: FHIRComponentFieldMeta[Option[Identifier]] =
        FHIRComponentFieldMeta("identifier", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
      val residueSite: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("residueSite", lTagOf[Option[String]], false, lTagOf[String])
      val connectivity: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("connectivity", lTagOf[Option[String]], false, lTagOf[String])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
        Seq(id, name, extension, identifier, residueSite, connectivity, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Linkage): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[String]](name, t.name),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[Identifier]](identifier, t.identifier),
        FHIRComponentField[Option[String]](residueSite, t.residueSite),
        FHIRComponentField[Option[String]](connectivity, t.connectivity),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[Linkage] = this
      val thisName: String                = "Linkage"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Linkage] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Linkage(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[String]]("name", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[Identifier]]("identifier", Some(None)),
              cursor.decodeAs[Option[String]]("residueSite", Some(None)),
              cursor.decodeAs[Option[String]]("connectivity", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Linkage(
        override val id: Option[String] = None,
        val name: Option[String] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val identifier: Option[Identifier] = None,
        val residueSite: Option[String] = None,
        val connectivity: Option[String] = None,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        length: Option[Int] = None,
        subunit: Option[Int] = None,
        sequence: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        fivePrime: Option[CodeableConcept] = None,
        threePrime: Option[CodeableConcept] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        sequenceAttachment: Option[Attachment] = None,
        sugar: LitSeq[Subunit.Sugar] = LitSeq.empty,
        linkage: LitSeq[Subunit.Linkage] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Subunit = new Subunit(
      id,
      length,
      subunit,
      sequence,
      extension,
      fivePrime,
      threePrime,
      modifierExtension,
      sequenceAttachment,
      sugar,
      linkage,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Subunit): Option[(Option[String], Option[Int], Option[Int], Option[String], LitSeq[Extension], Option[CodeableConcept], Option[CodeableConcept], LitSeq[Extension], Option[Attachment], LitSeq[Subunit.Sugar], LitSeq[Subunit.Linkage])] =
      Some(
        (
          o.id,
          o.length,
          o.subunit,
          o.sequence,
          o.extension,
          o.fivePrime,
          o.threePrime,
          o.modifierExtension,
          o.sequenceAttachment,
          o.sugar,
          o.linkage))
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
    val fivePrime: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("fivePrime", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val threePrime: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("threePrime", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val sequenceAttachment: FHIRComponentFieldMeta[Option[Attachment]] =
      FHIRComponentFieldMeta("sequenceAttachment", lTagOf[Option[Attachment]], false, lTagOf[Attachment])
    val sugar: FHIRComponentFieldMeta[LitSeq[Subunit.Sugar]] =
      FHIRComponentFieldMeta("sugar", lTagOf[LitSeq[Subunit.Sugar]], false, lTagOf[Subunit.Sugar])
    val linkage: FHIRComponentFieldMeta[LitSeq[Subunit.Linkage]] =
      FHIRComponentFieldMeta("linkage", lTagOf[LitSeq[Subunit.Linkage]], false, lTagOf[Subunit.Linkage])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, length, subunit, sequence, extension, fivePrime, threePrime, modifierExtension, sequenceAttachment, sugar, linkage)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Subunit): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Int]](length, t.length),
      FHIRComponentField[Option[Int]](subunit, t.subunit),
      FHIRComponentField[Option[String]](sequence, t.sequence),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[CodeableConcept]](fivePrime, t.fivePrime),
      FHIRComponentField[Option[CodeableConcept]](threePrime, t.threePrime),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[Attachment]](sequenceAttachment, t.sequenceAttachment),
      FHIRComponentField[LitSeq[Subunit.Sugar]](sugar, t.sugar),
      FHIRComponentField[LitSeq[Subunit.Linkage]](linkage, t.linkage)
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
            cursor.decodeAs[Option[CodeableConcept]]("fivePrime", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("threePrime", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Attachment]]("sequenceAttachment", Some(None)),
            cursor.decodeAs[LitSeq[Subunit.Sugar]]("sugar", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Subunit.Linkage]]("linkage", Some(LitSeq.empty)),
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
      val fivePrime: Option[CodeableConcept] = None,
      val threePrime: Option[CodeableConcept] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val sequenceAttachment: Option[Attachment] = None,
      val sugar: LitSeq[Subunit.Sugar] = LitSeq.empty,
      val linkage: LitSeq[Subunit.Linkage] = LitSeq.empty,
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
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      areaOfHybridisation: Option[String] = None,
      oligoNucleotideType: Option[CodeableConcept] = None,
      subunit: LitSeq[SubstanceNucleicAcid.Subunit] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): SubstanceNucleicAcid = new SubstanceNucleicAcid(
    id,
    meta,
    text,
    language,
    contained,
    extension,
    sequenceType,
    implicitRules,
    numberOfSubunits,
    modifierExtension,
    areaOfHybridisation,
    oligoNucleotideType,
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
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val areaOfHybridisation: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("areaOfHybridisation", lTagOf[Option[String]], false, lTagOf[String])
  val oligoNucleotideType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("oligoNucleotideType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val subunit: FHIRComponentFieldMeta[LitSeq[SubstanceNucleicAcid.Subunit]] =
    FHIRComponentFieldMeta("subunit", lTagOf[LitSeq[SubstanceNucleicAcid.Subunit]], false, lTagOf[SubstanceNucleicAcid.Subunit])
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
    modifierExtension,
    areaOfHybridisation,
    oligoNucleotideType,
    subunit
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: SubstanceNucleicAcid): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[CodeableConcept]](sequenceType, t.sequenceType),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[Option[Int]](numberOfSubunits, t.numberOfSubunits),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Option[String]](areaOfHybridisation, t.areaOfHybridisation),
    FHIRComponentField[Option[CodeableConcept]](oligoNucleotideType, t.oligoNucleotideType),
    FHIRComponentField[LitSeq[SubstanceNucleicAcid.Subunit]](subunit, t.subunit)
  )
  def extractId(t: SubstanceNucleicAcid): Option[String]                            = t.id
  def extractMeta(t: SubstanceNucleicAcid): Option[Meta]                            = t.meta
  def extractText(t: SubstanceNucleicAcid): Option[Narrative]                       = t.text
  def extractLanguage(t: SubstanceNucleicAcid): Option[LANGUAGES]                   = t.language
  def extractContained(t: SubstanceNucleicAcid): LitSeq[Resource]                   = t.contained
  def extractExtension(t: SubstanceNucleicAcid): LitSeq[Extension]                  = t.extension
  def extractSequenceType(t: SubstanceNucleicAcid): Option[CodeableConcept]         = t.sequenceType
  def extractImplicitRules(t: SubstanceNucleicAcid): Option[UriStr]                 = t.implicitRules
  def extractNumberOfSubunits(t: SubstanceNucleicAcid): Option[Int]                 = t.numberOfSubunits
  def extractModifierExtension(t: SubstanceNucleicAcid): LitSeq[Extension]          = t.modifierExtension
  def extractAreaOfHybridisation(t: SubstanceNucleicAcid): Option[String]           = t.areaOfHybridisation
  def extractOligoNucleotideType(t: SubstanceNucleicAcid): Option[CodeableConcept]  = t.oligoNucleotideType
  def extractSubunit(t: SubstanceNucleicAcid): LitSeq[SubstanceNucleicAcid.Subunit] = t.subunit
  override val thisName: String                                                     = "SubstanceNucleicAcid"
  def unapply(
      o: SubstanceNucleicAcid): Option[(Option[String], Option[Meta], Option[Narrative], Option[LANGUAGES], LitSeq[Resource], LitSeq[Extension], Option[CodeableConcept], Option[UriStr], Option[Int], LitSeq[Extension], Option[String], Option[CodeableConcept], LitSeq[SubstanceNucleicAcid.Subunit])] =
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
        o.modifierExtension,
        o.areaOfHybridisation,
        o.oligoNucleotideType,
        o.subunit))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[SubstanceNucleicAcid] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new SubstanceNucleicAcid(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("sequenceType", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[Option[Int]]("numberOfSubunits", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("areaOfHybridisation", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("oligoNucleotideType", Some(None)),
          cursor.decodeAs[LitSeq[SubstanceNucleicAcid.Subunit]]("subunit", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Nucleic acids are defined by three distinct elements: the base, sugar and linkage. Individual substance/moiety IDs will be
  * created for each of these elements. The nucleotide sequence will be always entered in the 5’-3’ direction.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields sequenceType, numberOfSubunits, areaOfHybridisation, oligoNucleotideType, subunit.
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
  *   - The type of the sequence shall be specified based on a controlled vocabulary.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param numberOfSubunits
  *   - The number of linear sequences of nucleotides linked through phosphodiester bonds shall be described. Subunits would be
  *   strands of nucleic acids that are tightly associated typically through Watson-Crick base pairing. NOTE: If not specified in
  *   the reference source, the assumption is that there is 1 subunit.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that
  *   modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *   Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *   strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *   extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *   processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any
  *   elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param areaOfHybridisation
  *   - The area of hybridisation shall be described if applicable for double stranded RNA or DNA. The number associated with the
  *   subunit followed by the number associated to the residue shall be specified in increasing order. The underscore “” shall be
  *   used as separator as follows: “Subunitnumber Residue”.
  * @param oligoNucleotideType
  *   - (TBC).
  * @param subunit
  *   - Subunits are listed in order of decreasing length; sequences of the same length will be ordered by molecular weight;
  *   subunits that have identical sequences will be repeated multiple times.
  */
@POJOBoilerplate
class SubstanceNucleicAcid(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val sequenceType: Option[CodeableConcept] = None,
    override val implicitRules: Option[UriStr] = None,
    val numberOfSubunits: Option[Int] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val areaOfHybridisation: Option[String] = None,
    val oligoNucleotideType: Option[CodeableConcept] = None,
    val subunit: LitSeq[SubstanceNucleicAcid.Subunit] = LitSeq.empty,
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
  override val thisTypeName: String = "SubstanceNucleicAcid"
}
