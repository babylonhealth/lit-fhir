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

object SubstanceSourceMaterial extends CompanionFor[SubstanceSourceMaterial] {
  implicit def summonObjectAndCompanionSubstanceSourceMaterial_171667363(
      o: SubstanceSourceMaterial): ObjectAndCompanion[SubstanceSourceMaterial, SubstanceSourceMaterial.type] =
    ObjectAndCompanion(o, this)
  override type ResourceType = SubstanceSourceMaterial
  override type ParentType   = SubstanceSourceMaterial
  override val baseType: CompanionFor[ResourceType] = SubstanceSourceMaterial
  override val parentType: CompanionFor[ParentType] = SubstanceSourceMaterial
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/SubstanceSourceMaterial")
  object Organism extends CompanionFor[Organism] {
    implicit def summonObjectAndCompanionOrganism_445245532(o: Organism): ObjectAndCompanion[Organism, Organism.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Organism
    override type ParentType   = Organism
    override val parentType: CompanionFor[ResourceType] = Organism
    object Author extends CompanionFor[Author] {
      implicit def summonObjectAndCompanionAuthor_1755523658(o: Author): ObjectAndCompanion[Author, Author.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Author
      override type ParentType   = Author
      override val parentType: CompanionFor[ResourceType] = Author
      def apply(
          id: Option[String] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          authorType: Option[CodeableConcept] = None,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          authorDescription: Option[String] = None,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Author = new Author(
        id,
        extension,
        authorType,
        modifierExtension,
        authorDescription,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Author): Option[(Option[String], LitSeq[Extension], Option[CodeableConcept], LitSeq[Extension], Option[String])] =
        Some((o.id, o.extension, o.authorType, o.modifierExtension, o.authorDescription))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val authorType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("authorType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val authorDescription: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("authorDescription", lTagOf[Option[String]], false, lTagOf[String])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, extension, authorType, modifierExtension, authorDescription)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Author): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[CodeableConcept]](authorType, t.authorType),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
        FHIRComponentField[Option[String]](authorDescription, t.authorDescription)
      )
      val baseType: CompanionFor[Author] = this
      val thisName: String               = "Author"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Author] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Author(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[CodeableConcept]]("authorType", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[String]]("authorDescription", Some(None)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Author(
        override val id: Option[String] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val authorType: Option[CodeableConcept] = None,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        val authorDescription: Option[String] = None,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object Hybrid extends CompanionFor[Hybrid] {
      implicit def summonObjectAndCompanionHybrid_1755523658(o: Hybrid): ObjectAndCompanion[Hybrid, Hybrid.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = Hybrid
      override type ParentType   = Hybrid
      override val parentType: CompanionFor[ResourceType] = Hybrid
      def apply(
          id: Option[String] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          hybridType: Option[CodeableConcept] = None,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          maternalOrganismId: Option[String] = None,
          paternalOrganismId: Option[String] = None,
          maternalOrganismName: Option[String] = None,
          paternalOrganismName: Option[String] = None,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): Hybrid = new Hybrid(
        id,
        extension,
        hybridType,
        modifierExtension,
        maternalOrganismId,
        paternalOrganismId,
        maternalOrganismName,
        paternalOrganismName,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: Hybrid): Option[(Option[String], LitSeq[Extension], Option[CodeableConcept], LitSeq[Extension], Option[String], Option[String], Option[String], Option[String])] =
        Some(
          (
            o.id,
            o.extension,
            o.hybridType,
            o.modifierExtension,
            o.maternalOrganismId,
            o.paternalOrganismId,
            o.maternalOrganismName,
            o.paternalOrganismName))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val hybridType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("hybridType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val maternalOrganismId: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("maternalOrganismId", lTagOf[Option[String]], false, lTagOf[String])
      val paternalOrganismId: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("paternalOrganismId", lTagOf[Option[String]], false, lTagOf[String])
      val maternalOrganismName: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("maternalOrganismName", lTagOf[Option[String]], false, lTagOf[String])
      val paternalOrganismName: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("paternalOrganismName", lTagOf[Option[String]], false, lTagOf[String])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
        id,
        extension,
        hybridType,
        modifierExtension,
        maternalOrganismId,
        paternalOrganismId,
        maternalOrganismName,
        paternalOrganismName)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: Hybrid): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[CodeableConcept]](hybridType, t.hybridType),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
        FHIRComponentField[Option[String]](maternalOrganismId, t.maternalOrganismId),
        FHIRComponentField[Option[String]](paternalOrganismId, t.paternalOrganismId),
        FHIRComponentField[Option[String]](maternalOrganismName, t.maternalOrganismName),
        FHIRComponentField[Option[String]](paternalOrganismName, t.paternalOrganismName)
      )
      val baseType: CompanionFor[Hybrid] = this
      val thisName: String               = "Hybrid"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Hybrid] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new Hybrid(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[CodeableConcept]]("hybridType", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[String]]("maternalOrganismId", Some(None)),
              cursor.decodeAs[Option[String]]("paternalOrganismId", Some(None)),
              cursor.decodeAs[Option[String]]("maternalOrganismName", Some(None)),
              cursor.decodeAs[Option[String]]("paternalOrganismName", Some(None)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class Hybrid(
        override val id: Option[String] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val hybridType: Option[CodeableConcept] = None,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        val maternalOrganismId: Option[String] = None,
        val paternalOrganismId: Option[String] = None,
        val maternalOrganismName: Option[String] = None,
        val paternalOrganismName: Option[String] = None,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object OrganismGeneral extends CompanionFor[OrganismGeneral] {
      implicit def summonObjectAndCompanionOrganismGeneral_1755523658(
          o: OrganismGeneral): ObjectAndCompanion[OrganismGeneral, OrganismGeneral.type] = ObjectAndCompanion(o, this)
      override type ResourceType = OrganismGeneral
      override type ParentType   = OrganismGeneral
      override val parentType: CompanionFor[ResourceType] = OrganismGeneral
      def apply(
          id: Option[String] = None,
          `class`: Option[CodeableConcept] = None,
          order: Option[CodeableConcept] = None,
          phylum: Option[CodeableConcept] = None,
          kingdom: Option[CodeableConcept] = None,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): OrganismGeneral = new OrganismGeneral(
        id,
        `class`,
        order,
        phylum,
        kingdom,
        extension,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: OrganismGeneral): Option[(Option[String], Option[CodeableConcept], Option[CodeableConcept], Option[CodeableConcept], Option[CodeableConcept], LitSeq[Extension], LitSeq[Extension])] =
        Some((o.id, o.`class`, o.order, o.phylum, o.kingdom, o.extension, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val `class`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("class", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val order: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("order", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val phylum: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("phylum", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val kingdom: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("kingdom", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, `class`, order, phylum, kingdom, extension, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: OrganismGeneral): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[Option[CodeableConcept]](`class`, t.`class`),
        FHIRComponentField[Option[CodeableConcept]](order, t.order),
        FHIRComponentField[Option[CodeableConcept]](phylum, t.phylum),
        FHIRComponentField[Option[CodeableConcept]](kingdom, t.kingdom),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[OrganismGeneral] = this
      val thisName: String                        = "OrganismGeneral"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[OrganismGeneral] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new OrganismGeneral(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[Option[CodeableConcept]]("class", Some(None)),
              cursor.decodeAs[Option[CodeableConcept]]("order", Some(None)),
              cursor.decodeAs[Option[CodeableConcept]]("phylum", Some(None)),
              cursor.decodeAs[Option[CodeableConcept]]("kingdom", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class OrganismGeneral(
        override val id: Option[String] = None,
        val `class`: Option[CodeableConcept] = None,
        val order: Option[CodeableConcept] = None,
        val phylum: Option[CodeableConcept] = None,
        val kingdom: Option[CodeableConcept] = None,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        genus: Option[CodeableConcept] = None,
        family: Option[CodeableConcept] = None,
        species: Option[CodeableConcept] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        intraspecificType: Option[CodeableConcept] = None,
        intraspecificDescription: Option[String] = None,
        author: LitSeq[Organism.Author] = LitSeq.empty,
        hybrid: Option[Organism.Hybrid] = None,
        organismGeneral: Option[Organism.OrganismGeneral] = None,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Organism = new Organism(
      id,
      genus,
      family,
      species,
      extension,
      modifierExtension,
      intraspecificType,
      intraspecificDescription,
      author,
      hybrid,
      organismGeneral,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Organism): Option[(Option[String], Option[CodeableConcept], Option[CodeableConcept], Option[CodeableConcept], LitSeq[Extension], LitSeq[Extension], Option[CodeableConcept], Option[String], LitSeq[Organism.Author], Option[Organism.Hybrid], Option[Organism.OrganismGeneral])] =
      Some(
        (
          o.id,
          o.genus,
          o.family,
          o.species,
          o.extension,
          o.modifierExtension,
          o.intraspecificType,
          o.intraspecificDescription,
          o.author,
          o.hybrid,
          o.organismGeneral))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val genus: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("genus", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val family: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("family", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val species: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("species", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val intraspecificType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("intraspecificType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val intraspecificDescription: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("intraspecificDescription", lTagOf[Option[String]], false, lTagOf[String])
    val author: FHIRComponentFieldMeta[LitSeq[Organism.Author]] =
      FHIRComponentFieldMeta("author", lTagOf[LitSeq[Organism.Author]], false, lTagOf[Organism.Author])
    val hybrid: FHIRComponentFieldMeta[Option[Organism.Hybrid]] =
      FHIRComponentFieldMeta("hybrid", lTagOf[Option[Organism.Hybrid]], false, lTagOf[Organism.Hybrid])
    val organismGeneral: FHIRComponentFieldMeta[Option[Organism.OrganismGeneral]] =
      FHIRComponentFieldMeta("organismGeneral", lTagOf[Option[Organism.OrganismGeneral]], false, lTagOf[Organism.OrganismGeneral])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
      id,
      genus,
      family,
      species,
      extension,
      modifierExtension,
      intraspecificType,
      intraspecificDescription,
      author,
      hybrid,
      organismGeneral)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Organism): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](genus, t.genus),
      FHIRComponentField[Option[CodeableConcept]](family, t.family),
      FHIRComponentField[Option[CodeableConcept]](species, t.species),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[CodeableConcept]](intraspecificType, t.intraspecificType),
      FHIRComponentField[Option[String]](intraspecificDescription, t.intraspecificDescription),
      FHIRComponentField[LitSeq[Organism.Author]](author, t.author),
      FHIRComponentField[Option[Organism.Hybrid]](hybrid, t.hybrid),
      FHIRComponentField[Option[Organism.OrganismGeneral]](organismGeneral, t.organismGeneral)
    )
    val baseType: CompanionFor[Organism] = this
    val thisName: String                 = "Organism"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Organism] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Organism(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("genus", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("family", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("species", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[CodeableConcept]]("intraspecificType", Some(None)),
            cursor.decodeAs[Option[String]]("intraspecificDescription", Some(None)),
            cursor.decodeAs[LitSeq[Organism.Author]]("author", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Organism.Hybrid]]("hybrid", Some(None)),
            cursor.decodeAs[Option[Organism.OrganismGeneral]]("organismGeneral", Some(None)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Organism(
      override val id: Option[String] = None,
      val genus: Option[CodeableConcept] = None,
      val family: Option[CodeableConcept] = None,
      val species: Option[CodeableConcept] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val intraspecificType: Option[CodeableConcept] = None,
      val intraspecificDescription: Option[String] = None,
      val author: LitSeq[Organism.Author] = LitSeq.empty,
      val hybrid: Option[Organism.Hybrid] = None,
      val organismGeneral: Option[Organism.OrganismGeneral] = None,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object FractionDescription extends CompanionFor[FractionDescription] {
    implicit def summonObjectAndCompanionFractionDescription_445245532(
        o: FractionDescription): ObjectAndCompanion[FractionDescription, FractionDescription.type] = ObjectAndCompanion(o, this)
    override type ResourceType = FractionDescription
    override type ParentType   = FractionDescription
    override val parentType: CompanionFor[ResourceType] = FractionDescription
    def apply(
        id: Option[String] = None,
        fraction: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        materialType: Option[CodeableConcept] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): FractionDescription = new FractionDescription(
      id,
      fraction,
      extension,
      materialType,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: FractionDescription): Option[(Option[String], Option[String], LitSeq[Extension], Option[CodeableConcept], LitSeq[Extension])] =
      Some((o.id, o.fraction, o.extension, o.materialType, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val fraction: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("fraction", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val materialType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("materialType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, fraction, extension, materialType, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: FractionDescription): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[String]](fraction, t.fraction),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[CodeableConcept]](materialType, t.materialType),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[FractionDescription] = this
    val thisName: String                            = "FractionDescription"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[FractionDescription] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new FractionDescription(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[String]]("fraction", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[CodeableConcept]]("materialType", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class FractionDescription(
      override val id: Option[String] = None,
      val fraction: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val materialType: Option[CodeableConcept] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object PartDescription extends CompanionFor[PartDescription] {
    implicit def summonObjectAndCompanionPartDescription_445245532(
        o: PartDescription): ObjectAndCompanion[PartDescription, PartDescription.type] = ObjectAndCompanion(o, this)
    override type ResourceType = PartDescription
    override type ParentType   = PartDescription
    override val parentType: CompanionFor[ResourceType] = PartDescription
    def apply(
        id: Option[String] = None,
        part: Option[CodeableConcept] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        partLocation: Option[CodeableConcept] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): PartDescription = new PartDescription(
      id,
      part,
      extension,
      partLocation,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: PartDescription): Option[(Option[String], Option[CodeableConcept], LitSeq[Extension], Option[CodeableConcept], LitSeq[Extension])] =
      Some((o.id, o.part, o.extension, o.partLocation, o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val part: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("part", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val partLocation: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("partLocation", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, part, extension, partLocation, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: PartDescription): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](part, t.part),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[CodeableConcept]](partLocation, t.partLocation),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[PartDescription] = this
    val thisName: String                        = "PartDescription"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[PartDescription] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new PartDescription(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("part", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[CodeableConcept]]("partLocation", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class PartDescription(
      override val id: Option[String] = None,
      val part: Option[CodeableConcept] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val partLocation: Option[CodeableConcept] = None,
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
      organismId: Option[Identifier] = None,
      organismName: Option[String] = None,
      implicitRules: Option[UriStr] = None,
      countryOfOrigin: LitSeq[CodeableConcept] = LitSeq.empty,
      developmentStage: Option[CodeableConcept] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      parentSubstanceId: LitSeq[Identifier] = LitSeq.empty,
      sourceMaterialType: Option[CodeableConcept] = None,
      sourceMaterialClass: Option[CodeableConcept] = None,
      sourceMaterialState: Option[CodeableConcept] = None,
      parentSubstanceName: LitSeq[String] = LitSeq.empty,
      geographicalLocation: LitSeq[String] = LitSeq.empty,
      partDescription: LitSeq[SubstanceSourceMaterial.PartDescription] = LitSeq.empty,
      fractionDescription: LitSeq[SubstanceSourceMaterial.FractionDescription] = LitSeq.empty,
      organism: Option[SubstanceSourceMaterial.Organism] = None,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): SubstanceSourceMaterial = new SubstanceSourceMaterial(
    id,
    meta,
    text,
    language,
    contained,
    extension,
    organismId,
    organismName,
    implicitRules,
    countryOfOrigin,
    developmentStage,
    modifierExtension,
    parentSubstanceId,
    sourceMaterialType,
    sourceMaterialClass,
    sourceMaterialState,
    parentSubstanceName,
    geographicalLocation,
    partDescription,
    fractionDescription,
    organism,
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
  val organismId: FHIRComponentFieldMeta[Option[Identifier]] =
    FHIRComponentFieldMeta("organismId", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
  val organismName: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("organismName", lTagOf[Option[String]], false, lTagOf[String])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val countryOfOrigin: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("countryOfOrigin", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val developmentStage: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("developmentStage", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val parentSubstanceId: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("parentSubstanceId", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val sourceMaterialType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("sourceMaterialType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val sourceMaterialClass: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("sourceMaterialClass", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val sourceMaterialState: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("sourceMaterialState", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val parentSubstanceName: FHIRComponentFieldMeta[LitSeq[String]] =
    FHIRComponentFieldMeta("parentSubstanceName", lTagOf[LitSeq[String]], false, lTagOf[String])
  val geographicalLocation: FHIRComponentFieldMeta[LitSeq[String]] =
    FHIRComponentFieldMeta("geographicalLocation", lTagOf[LitSeq[String]], false, lTagOf[String])
  val partDescription: FHIRComponentFieldMeta[LitSeq[SubstanceSourceMaterial.PartDescription]] =
    FHIRComponentFieldMeta(
      "partDescription",
      lTagOf[LitSeq[SubstanceSourceMaterial.PartDescription]],
      false,
      lTagOf[SubstanceSourceMaterial.PartDescription])
  val fractionDescription: FHIRComponentFieldMeta[LitSeq[SubstanceSourceMaterial.FractionDescription]] =
    FHIRComponentFieldMeta(
      "fractionDescription",
      lTagOf[LitSeq[SubstanceSourceMaterial.FractionDescription]],
      false,
      lTagOf[SubstanceSourceMaterial.FractionDescription])
  val organism: FHIRComponentFieldMeta[Option[SubstanceSourceMaterial.Organism]] =
    FHIRComponentFieldMeta(
      "organism",
      lTagOf[Option[SubstanceSourceMaterial.Organism]],
      false,
      lTagOf[SubstanceSourceMaterial.Organism])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    language,
    contained,
    extension,
    organismId,
    organismName,
    implicitRules,
    countryOfOrigin,
    developmentStage,
    modifierExtension,
    parentSubstanceId,
    sourceMaterialType,
    sourceMaterialClass,
    sourceMaterialState,
    parentSubstanceName,
    geographicalLocation,
    partDescription,
    fractionDescription,
    organism
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: SubstanceSourceMaterial): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Option[Identifier]](organismId, t.organismId),
    FHIRComponentField[Option[String]](organismName, t.organismName),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[CodeableConcept]](countryOfOrigin, t.countryOfOrigin),
    FHIRComponentField[Option[CodeableConcept]](developmentStage, t.developmentStage),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[LitSeq[Identifier]](parentSubstanceId, t.parentSubstanceId),
    FHIRComponentField[Option[CodeableConcept]](sourceMaterialType, t.sourceMaterialType),
    FHIRComponentField[Option[CodeableConcept]](sourceMaterialClass, t.sourceMaterialClass),
    FHIRComponentField[Option[CodeableConcept]](sourceMaterialState, t.sourceMaterialState),
    FHIRComponentField[LitSeq[String]](parentSubstanceName, t.parentSubstanceName),
    FHIRComponentField[LitSeq[String]](geographicalLocation, t.geographicalLocation),
    FHIRComponentField[LitSeq[SubstanceSourceMaterial.PartDescription]](partDescription, t.partDescription),
    FHIRComponentField[LitSeq[SubstanceSourceMaterial.FractionDescription]](fractionDescription, t.fractionDescription),
    FHIRComponentField[Option[SubstanceSourceMaterial.Organism]](organism, t.organism)
  )
  def extractId(t: SubstanceSourceMaterial): Option[String]                                               = t.id
  def extractMeta(t: SubstanceSourceMaterial): Option[Meta]                                               = t.meta
  def extractText(t: SubstanceSourceMaterial): Option[Narrative]                                          = t.text
  def extractLanguage(t: SubstanceSourceMaterial): Option[LANGUAGES]                                      = t.language
  def extractContained(t: SubstanceSourceMaterial): LitSeq[Resource]                                      = t.contained
  def extractExtension(t: SubstanceSourceMaterial): LitSeq[Extension]                                     = t.extension
  def extractOrganismId(t: SubstanceSourceMaterial): Option[Identifier]                                   = t.organismId
  def extractOrganismName(t: SubstanceSourceMaterial): Option[String]                                     = t.organismName
  def extractImplicitRules(t: SubstanceSourceMaterial): Option[UriStr]                                    = t.implicitRules
  def extractCountryOfOrigin(t: SubstanceSourceMaterial): LitSeq[CodeableConcept]                         = t.countryOfOrigin
  def extractDevelopmentStage(t: SubstanceSourceMaterial): Option[CodeableConcept]                        = t.developmentStage
  def extractModifierExtension(t: SubstanceSourceMaterial): LitSeq[Extension]                             = t.modifierExtension
  def extractParentSubstanceId(t: SubstanceSourceMaterial): LitSeq[Identifier]                            = t.parentSubstanceId
  def extractSourceMaterialType(t: SubstanceSourceMaterial): Option[CodeableConcept]                      = t.sourceMaterialType
  def extractSourceMaterialClass(t: SubstanceSourceMaterial): Option[CodeableConcept]                     = t.sourceMaterialClass
  def extractSourceMaterialState(t: SubstanceSourceMaterial): Option[CodeableConcept]                     = t.sourceMaterialState
  def extractParentSubstanceName(t: SubstanceSourceMaterial): LitSeq[String]                              = t.parentSubstanceName
  def extractGeographicalLocation(t: SubstanceSourceMaterial): LitSeq[String]                             = t.geographicalLocation
  def extractPartDescription(t: SubstanceSourceMaterial): LitSeq[SubstanceSourceMaterial.PartDescription] = t.partDescription
  def extractFractionDescription(t: SubstanceSourceMaterial): LitSeq[SubstanceSourceMaterial.FractionDescription] =
    t.fractionDescription
  def extractOrganism(t: SubstanceSourceMaterial): Option[SubstanceSourceMaterial.Organism] = t.organism
  override val thisName: String                                                             = "SubstanceSourceMaterial"
  def unapply(
      o: SubstanceSourceMaterial): Option[(Option[String], Option[Meta], Option[Narrative], Option[LANGUAGES], LitSeq[Resource], LitSeq[Extension], Option[Identifier], Option[String], Option[UriStr], LitSeq[CodeableConcept], Option[CodeableConcept], LitSeq[Extension], LitSeq[Identifier], Option[CodeableConcept], Option[CodeableConcept], Option[CodeableConcept], LitSeq[String], LitSeq[String], LitSeq[SubstanceSourceMaterial.PartDescription], LitSeq[SubstanceSourceMaterial.FractionDescription], Option[SubstanceSourceMaterial.Organism])] =
    Some(
      (
        o.id,
        o.meta,
        o.text,
        o.language,
        o.contained,
        o.extension,
        o.organismId,
        o.organismName,
        o.implicitRules,
        o.countryOfOrigin,
        o.developmentStage,
        o.modifierExtension,
        o.parentSubstanceId,
        o.sourceMaterialType,
        o.sourceMaterialClass,
        o.sourceMaterialState,
        o.parentSubstanceName,
        o.geographicalLocation,
        o.partDescription,
        o.fractionDescription,
        o.organism))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[SubstanceSourceMaterial] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new SubstanceSourceMaterial(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[Identifier]]("organismId", Some(None)),
          cursor.decodeAs[Option[String]]("organismName", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("countryOfOrigin", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("developmentStage", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("parentSubstanceId", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("sourceMaterialType", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("sourceMaterialClass", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("sourceMaterialState", Some(None)),
          cursor.decodeAs[LitSeq[String]]("parentSubstanceName", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[String]]("geographicalLocation", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[SubstanceSourceMaterial.PartDescription]]("partDescription", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[SubstanceSourceMaterial.FractionDescription]]("fractionDescription", Some(LitSeq.empty)),
          cursor.decodeAs[Option[SubstanceSourceMaterial.Organism]]("organism", Some(None)),
          decodeAttributes(cursor)
        )
      ))
}

/** Source material shall capture information on the taxonomic and anatomical origins as well as the fraction of a material that
  * can result in or can be modified to form a substance. This set of data elements shall be used to define polymer substances
  * isolated from biological matrices. Taxonomic and anatomical origins shall be described using a controlled vocabulary as
  * required. This information is captured for naturally derived polymers ( . starch) and structurally diverse substances. For
  * Organisms belonging to the Kingdom Plantae the Substance level defines the fresh material of a single species or infraspecies,
  * the Herbal Drug and the Herbal preparation. For Herbal preparations, the fraction information will be captured at the
  * Substance information level and additional information for herbal extracts will be captured at the Specified Substance Group 1
  * information level. See for further explanation the Substance Class: Structurally Diverse and the herbal annex.
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields organismId, organismName, countryOfOrigin, developmentStage, parentSubstanceId, sourceMaterialType,
  *   sourceMaterialClass, sourceMaterialState, parentSubstanceName, geographicalLocation, partDescription, fractionDescription,
  *   organism.
  * @param id
  *   - The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
  * @param meta
  *   - The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might
  *     not always be associated with version changes to the resource.
  * @param text
  *   - A human-readable narrative that contains a summary of the resource and can be used to represent the content of the
  *     resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail
  *     to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should
  *     be represented in the narrative to ensure clinical safety.
  * @param language
  *   - The base language in which the resource is written.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *     identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *     of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *     Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *     of the extension.
  * @param organismId
  *   - The unique identifier associated with the source material parent organism shall be specified.
  * @param organismName
  *   - The organism accepted Scientific name shall be provided based on the organism taxonomy.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *     processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *     other profiles etc.
  * @param countryOfOrigin
  *   - The country where the plant material is harvested or the countries where the plasma is sourced from as laid down in
  *     accordance with the Plasma Master File. For “Plasma-derived substances” the attribute country of origin provides
  *     information about the countries used for the manufacturing of the Cryopoor plama or Crioprecipitate.
  * @param developmentStage
  *   - Stage of life for animals, plants, insects and microorganisms. This information shall be provided only when the substance
  *     is significantly different in these stages (e.g. foetal bovine serum).
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *     the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *     Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *     strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *     extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *     processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of
  *     any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param parentSubstanceId
  *   - The parent of the herbal drug Ginkgo biloba, Leaf is the substance ID of the substance (fresh) of Ginkgo biloba L. or
  *     Ginkgo biloba L. (Whole plant).
  * @param sourceMaterialType
  *   - The type of the source material shall be specified based on a controlled vocabulary. For vaccines, this subclause refers
  *     to the class of infectious agent.
  * @param sourceMaterialClass
  *   - General high level classification of the source material specific to the origin of the material.
  * @param sourceMaterialState
  *   - The state of the source material when extracted.
  * @param parentSubstanceName
  *   - The parent substance of the Herbal Drug, or Herbal preparation.
  * @param geographicalLocation
  *   - The place/region where the plant is harvested or the places/regions where the animal source material has its habitat.
  * @param partDescription
  *   - To do.
  * @param fractionDescription
  *   - Many complex materials are fractions of parts of plants, animals, or minerals. Fraction elements are often necessary to
  *     define both Substances and Specified Group 1 Substances. For substances derived from Plants, fraction information will be
  *     captured at the Substance information level ( . Oils, Juices and Exudates). Additional information for Extracts, such as
  *     extraction solvent composition, will be captured at the Specified Substance Group 1 information level. For plasma-derived
  *     products fraction information will be captured at the Substance and the Specified Substance Group 1 levels.
  * @param organism
  *   - This subclause describes the organism which the substance is derived from. For vaccines, the parent organism shall be
  *     specified based on these subclause elements. As an example, full taxonomy will be described for the Substance Name: .,
  *     Leaf.
  */
@POJOBoilerplate
class SubstanceSourceMaterial(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val organismId: Option[Identifier] = None,
    val organismName: Option[String] = None,
    override val implicitRules: Option[UriStr] = None,
    val countryOfOrigin: LitSeq[CodeableConcept] = LitSeq.empty,
    val developmentStage: Option[CodeableConcept] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val parentSubstanceId: LitSeq[Identifier] = LitSeq.empty,
    val sourceMaterialType: Option[CodeableConcept] = None,
    val sourceMaterialClass: Option[CodeableConcept] = None,
    val sourceMaterialState: Option[CodeableConcept] = None,
    val parentSubstanceName: LitSeq[String] = LitSeq.empty,
    val geographicalLocation: LitSeq[String] = LitSeq.empty,
    val partDescription: LitSeq[SubstanceSourceMaterial.PartDescription] = LitSeq.empty,
    val fractionDescription: LitSeq[SubstanceSourceMaterial.FractionDescription] = LitSeq.empty,
    val organism: Option[SubstanceSourceMaterial.Organism] = None,
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
  override val thisTypeName: String = "SubstanceSourceMaterial"
}
