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

object MedicinalProduct extends CompanionFor[MedicinalProduct] {
  implicit def summonObjectAndCompanionMedicinalProduct_955578098(
      o: MedicinalProduct): ObjectAndCompanion[MedicinalProduct, MedicinalProduct.type] = ObjectAndCompanion(o, this)
  override type ResourceType = MedicinalProduct
  override type ParentType   = MedicinalProduct
  override val baseType: CompanionFor[ResourceType] = MedicinalProduct
  override val parentType: CompanionFor[ParentType] = MedicinalProduct
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/MedicinalProduct")
  object ManufacturingBusinessOperation extends CompanionFor[ManufacturingBusinessOperation] {
    implicit def summonObjectAndCompanionManufacturingBusinessOperation1596370546(
        o: ManufacturingBusinessOperation): ObjectAndCompanion[ManufacturingBusinessOperation, ManufacturingBusinessOperation.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = ManufacturingBusinessOperation
    override type ParentType   = ManufacturingBusinessOperation
    override val parentType: CompanionFor[ResourceType] = ManufacturingBusinessOperation
    def apply(
        id: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        regulator: Option[Reference] = None,
        manufacturer: LitSeq[Reference] = LitSeq.empty,
        operationType: Option[CodeableConcept] = None,
        effectiveDate: Option[FHIRDateTime] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        confidentialityIndicator: Option[CodeableConcept] = None,
        authorisationReferenceNumber: Option[Identifier] = None,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): ManufacturingBusinessOperation = new ManufacturingBusinessOperation(
      id,
      extension,
      regulator,
      manufacturer,
      operationType,
      effectiveDate,
      modifierExtension,
      confidentialityIndicator,
      authorisationReferenceNumber,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: ManufacturingBusinessOperation): Option[(Option[String], LitSeq[Extension], Option[Reference], LitSeq[Reference], Option[CodeableConcept], Option[FHIRDateTime], LitSeq[Extension], Option[CodeableConcept], Option[Identifier])] =
      Some(
        (
          o.id,
          o.extension,
          o.regulator,
          o.manufacturer,
          o.operationType,
          o.effectiveDate,
          o.modifierExtension,
          o.confidentialityIndicator,
          o.authorisationReferenceNumber))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val regulator: FHIRComponentFieldMeta[Option[Reference]] =
      FHIRComponentFieldMeta("regulator", lTagOf[Option[Reference]], false, lTagOf[Reference])
    val manufacturer: FHIRComponentFieldMeta[LitSeq[Reference]] =
      FHIRComponentFieldMeta("manufacturer", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
    val operationType: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("operationType", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val effectiveDate: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
      FHIRComponentFieldMeta("effectiveDate", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val confidentialityIndicator: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("confidentialityIndicator", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val authorisationReferenceNumber: FHIRComponentFieldMeta[Option[Identifier]] =
      FHIRComponentFieldMeta("authorisationReferenceNumber", lTagOf[Option[Identifier]], false, lTagOf[Identifier])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
      id,
      extension,
      regulator,
      manufacturer,
      operationType,
      effectiveDate,
      modifierExtension,
      confidentialityIndicator,
      authorisationReferenceNumber)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: ManufacturingBusinessOperation): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[Reference]](regulator, t.regulator),
      FHIRComponentField[LitSeq[Reference]](manufacturer, t.manufacturer),
      FHIRComponentField[Option[CodeableConcept]](operationType, t.operationType),
      FHIRComponentField[Option[FHIRDateTime]](effectiveDate, t.effectiveDate),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[Option[CodeableConcept]](confidentialityIndicator, t.confidentialityIndicator),
      FHIRComponentField[Option[Identifier]](authorisationReferenceNumber, t.authorisationReferenceNumber)
    )
    val baseType: CompanionFor[ManufacturingBusinessOperation] = this
    val thisName: String                                       = "ManufacturingBusinessOperation"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[ManufacturingBusinessOperation] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new ManufacturingBusinessOperation(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[Reference]]("regulator", Some(None)),
            cursor.decodeAs[LitSeq[Reference]]("manufacturer", Some(LitSeq.empty)),
            cursor.decodeAs[Option[CodeableConcept]]("operationType", Some(None)),
            cursor.decodeAs[Option[FHIRDateTime]]("effectiveDate", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[Option[CodeableConcept]]("confidentialityIndicator", Some(None)),
            cursor.decodeAs[Option[Identifier]]("authorisationReferenceNumber", Some(None)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class ManufacturingBusinessOperation(
      override val id: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val regulator: Option[Reference] = None,
      val manufacturer: LitSeq[Reference] = LitSeq.empty,
      val operationType: Option[CodeableConcept] = None,
      val effectiveDate: Option[FHIRDateTime] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val confidentialityIndicator: Option[CodeableConcept] = None,
      val authorisationReferenceNumber: Option[Identifier] = None,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object Name extends CompanionFor[Name] {
    implicit def summonObjectAndCompanionName1596370546(o: Name): ObjectAndCompanion[Name, Name.type] =
      ObjectAndCompanion(o, this)
    override type ResourceType = Name
    override type ParentType   = Name
    override val parentType: CompanionFor[ResourceType] = Name
    object NamePart extends CompanionFor[NamePart] {
      implicit def summonObjectAndCompanionNamePart_1344457585(o: NamePart): ObjectAndCompanion[NamePart, NamePart.type] =
        ObjectAndCompanion(o, this)
      override type ResourceType = NamePart
      override type ParentType   = NamePart
      override val parentType: CompanionFor[ResourceType] = NamePart
      def apply(
          id: Option[String] = None,
          part: String,
          `type`: Coding,
          extension: LitSeq[Extension] = LitSeq.empty,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): NamePart = new NamePart(
        id,
        part,
        `type`,
        extension,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(o: NamePart): Option[(Option[String], String, Coding, LitSeq[Extension], LitSeq[Extension])] = Some(
        (o.id, o.part, o.`type`, o.extension, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val part: FHIRComponentFieldMeta[String] =
        FHIRComponentFieldMeta("part", lTagOf[String], false, lTagOf[String])
      val `type`: FHIRComponentFieldMeta[Coding] =
        FHIRComponentFieldMeta("type", lTagOf[Coding], false, lTagOf[Coding])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, part, `type`, extension, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: NamePart): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[String](part, t.part),
        FHIRComponentField[Coding](`type`, t.`type`),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[NamePart] = this
      val thisName: String                 = "NamePart"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[NamePart] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new NamePart(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[String]("part", None),
              cursor.decodeAs[Coding]("type", None),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class NamePart(
        override val id: Option[String] = None,
        val part: String,
        val `type`: Coding,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    object CountryLanguage extends CompanionFor[CountryLanguage] {
      implicit def summonObjectAndCompanionCountryLanguage_1344457585(
          o: CountryLanguage): ObjectAndCompanion[CountryLanguage, CountryLanguage.type] = ObjectAndCompanion(o, this)
      override type ResourceType = CountryLanguage
      override type ParentType   = CountryLanguage
      override val parentType: CompanionFor[ResourceType] = CountryLanguage
      def apply(
          id: Option[String] = None,
          country: CodeableConcept,
          language: CodeableConcept,
          extension: LitSeq[Extension] = LitSeq.empty,
          jurisdiction: Option[CodeableConcept] = None,
          modifierExtension: LitSeq[Extension] = LitSeq.empty,
          primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
      ): CountryLanguage = new CountryLanguage(
        id,
        country,
        language,
        extension,
        jurisdiction,
        modifierExtension,
        primitiveAttributes = primitiveAttributes
      )
      def unapply(
          o: CountryLanguage): Option[(Option[String], CodeableConcept, CodeableConcept, LitSeq[Extension], Option[CodeableConcept], LitSeq[Extension])] =
        Some((o.id, o.country, o.language, o.extension, o.jurisdiction, o.modifierExtension))
      val id: FHIRComponentFieldMeta[Option[String]] =
        FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
      val country: FHIRComponentFieldMeta[CodeableConcept] =
        FHIRComponentFieldMeta("country", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
      val language: FHIRComponentFieldMeta[CodeableConcept] =
        FHIRComponentFieldMeta("language", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
      val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val jurisdiction: FHIRComponentFieldMeta[Option[CodeableConcept]] =
        FHIRComponentFieldMeta("jurisdiction", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
      val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
        FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
      val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, country, language, extension, jurisdiction, modifierExtension)
      override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
      override def fields(t: CountryLanguage): Seq[FHIRComponentField[_]] = Seq(
        FHIRComponentField[Option[String]](id, t.id),
        FHIRComponentField[CodeableConcept](country, t.country),
        FHIRComponentField[CodeableConcept](language, t.language),
        FHIRComponentField[LitSeq[Extension]](extension, t.extension),
        FHIRComponentField[Option[CodeableConcept]](jurisdiction, t.jurisdiction),
        FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
      )
      val baseType: CompanionFor[CountryLanguage] = this
      val thisName: String                        = "CountryLanguage"
      def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[CountryLanguage] =
        checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
          Try(
            new CountryLanguage(
              cursor.decodeAs[Option[String]]("id", Some(None)),
              cursor.decodeAs[CodeableConcept]("country", None),
              cursor.decodeAs[CodeableConcept]("language", None),
              cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
              cursor.decodeAs[Option[CodeableConcept]]("jurisdiction", Some(None)),
              cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
              decodeAttributes(cursor)
            )
          ))
    }
    @POJOBoilerplate
    class CountryLanguage(
        override val id: Option[String] = None,
        val country: CodeableConcept,
        val language: CodeableConcept,
        override val extension: LitSeq[Extension] = LitSeq.empty,
        val jurisdiction: Option[CodeableConcept] = None,
        override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
        override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
        extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
    def apply(
        id: Option[String] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        productName: String,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        namePart: LitSeq[Name.NamePart] = LitSeq.empty,
        countryLanguage: LitSeq[Name.CountryLanguage] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): Name = new Name(
      id,
      extension,
      productName,
      modifierExtension,
      namePart,
      countryLanguage,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: Name): Option[(Option[String], LitSeq[Extension], String, LitSeq[Extension], LitSeq[Name.NamePart], LitSeq[Name.CountryLanguage])] =
      Some((o.id, o.extension, o.productName, o.modifierExtension, o.namePart, o.countryLanguage))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val productName: FHIRComponentFieldMeta[String] =
      FHIRComponentFieldMeta("productName", lTagOf[String], false, lTagOf[String])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val namePart: FHIRComponentFieldMeta[LitSeq[Name.NamePart]] =
      FHIRComponentFieldMeta("namePart", lTagOf[LitSeq[Name.NamePart]], false, lTagOf[Name.NamePart])
    val countryLanguage: FHIRComponentFieldMeta[LitSeq[Name.CountryLanguage]] =
      FHIRComponentFieldMeta("countryLanguage", lTagOf[LitSeq[Name.CountryLanguage]], false, lTagOf[Name.CountryLanguage])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(id, extension, productName, modifierExtension, namePart, countryLanguage)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: Name): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[String](productName, t.productName),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[Name.NamePart]](namePart, t.namePart),
      FHIRComponentField[LitSeq[Name.CountryLanguage]](countryLanguage, t.countryLanguage)
    )
    val baseType: CompanionFor[Name] = this
    val thisName: String             = "Name"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[Name] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new Name(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[String]("productName", None),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Name.NamePart]]("namePart", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Name.CountryLanguage]]("countryLanguage", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class Name(
      override val id: Option[String] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val productName: String,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      val namePart: LitSeq[Name.NamePart] = LitSeq.empty,
      val countryLanguage: LitSeq[Name.CountryLanguage] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  object SpecialDesignation extends CompanionFor[SpecialDesignation] {
    implicit def summonObjectAndCompanionSpecialDesignation1596370546(
        o: SpecialDesignation): ObjectAndCompanion[SpecialDesignation, SpecialDesignation.type] = ObjectAndCompanion(o, this)
    override type ResourceType = SpecialDesignation
    override type ParentType   = SpecialDesignation
    override val parentType: CompanionFor[ResourceType] = SpecialDesignation
    type IndicationChoice = Choice[UnionCodeableConceptOrReference]
    def apply(
        id: Option[String] = None,
        `type`: Option[CodeableConcept] = None,
        date: Option[FHIRDateTime] = None,
        status: Option[CodeableConcept] = None,
        species: Option[CodeableConcept] = None,
        extension: LitSeq[Extension] = LitSeq.empty,
        identifier: LitSeq[Identifier] = LitSeq.empty,
        intendedUse: Option[CodeableConcept] = None,
        indication: Option[SpecialDesignation.IndicationChoice] = None,
        modifierExtension: LitSeq[Extension] = LitSeq.empty,
        primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
    ): SpecialDesignation = new SpecialDesignation(
      id,
      `type`,
      date,
      status,
      species,
      extension,
      identifier,
      intendedUse,
      indication,
      modifierExtension,
      primitiveAttributes = primitiveAttributes
    )
    def unapply(
        o: SpecialDesignation): Option[(Option[String], Option[CodeableConcept], Option[FHIRDateTime], Option[CodeableConcept], Option[CodeableConcept], LitSeq[Extension], LitSeq[Identifier], Option[CodeableConcept], Option[SpecialDesignation.IndicationChoice], LitSeq[Extension])] =
      Some(
        (
          o.id,
          o.`type`,
          o.date,
          o.status,
          o.species,
          o.extension,
          o.identifier,
          o.intendedUse,
          o.indication,
          o.modifierExtension))
    val id: FHIRComponentFieldMeta[Option[String]] =
      FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
    val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val date: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
      FHIRComponentFieldMeta("date", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
    val status: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("status", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val species: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("species", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
      FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
    val intendedUse: FHIRComponentFieldMeta[Option[CodeableConcept]] =
      FHIRComponentFieldMeta("intendedUse", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
    val indication: FHIRComponentFieldMeta[Option[SpecialDesignation.IndicationChoice]] =
      FHIRComponentFieldMeta(
        "indication",
        lTagOf[Option[SpecialDesignation.IndicationChoice]],
        true,
        lTagOf[UnionCodeableConceptOrReference])
    val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
      FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
    val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
      Seq(id, `type`, date, status, species, extension, identifier, intendedUse, indication, modifierExtension)
    override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
    override def fields(t: SpecialDesignation): Seq[FHIRComponentField[_]] = Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
      FHIRComponentField[Option[FHIRDateTime]](date, t.date),
      FHIRComponentField[Option[CodeableConcept]](status, t.status),
      FHIRComponentField[Option[CodeableConcept]](species, t.species),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
      FHIRComponentField[Option[CodeableConcept]](intendedUse, t.intendedUse),
      FHIRComponentField[Option[SpecialDesignation.IndicationChoice]](indication, t.indication),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
    )
    val baseType: CompanionFor[SpecialDesignation] = this
    val thisName: String                           = "SpecialDesignation"
    def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[SpecialDesignation] =
      checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
        Try(
          new SpecialDesignation(
            cursor.decodeAs[Option[String]]("id", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
            cursor.decodeAs[Option[FHIRDateTime]]("date", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("status", Some(None)),
            cursor.decodeAs[Option[CodeableConcept]]("species", Some(None)),
            cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
            cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
            cursor.decodeAs[Option[CodeableConcept]]("intendedUse", Some(None)),
            cursor.decodeOptRef[UnionCodeableConceptOrReference]("indication"),
            cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
            decodeAttributes(cursor)
          )
        ))
  }
  @POJOBoilerplate
  class SpecialDesignation(
      override val id: Option[String] = None,
      val `type`: Option[CodeableConcept] = None,
      val date: Option[FHIRDateTime] = None,
      val status: Option[CodeableConcept] = None,
      val species: Option[CodeableConcept] = None,
      override val extension: LitSeq[Extension] = LitSeq.empty,
      val identifier: LitSeq[Identifier] = LitSeq.empty,
      val intendedUse: Option[CodeableConcept] = None,
      val indication: Option[SpecialDesignation.IndicationChoice] = None,
      override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
      override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts)
      extends BackboneElement(id = id, extension = extension, modifierExtension = modifierExtension)
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = None,
      text: Option[Narrative] = None,
      `type`: Option[CodeableConcept] = None,
      domain: Option[Coding] = None,
      contact: LitSeq[Reference] = LitSeq.empty,
      language: Option[LANGUAGES] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      masterFile: LitSeq[Reference] = LitSeq.empty,
      implicitRules: Option[UriStr] = None,
      clinicalTrial: LitSeq[Reference] = LitSeq.empty,
      crossReference: LitSeq[Identifier] = LitSeq.empty,
      specialMeasures: LitSeq[String] = LitSeq.empty,
      marketingStatus: LitSeq[Choice["MarketingStatus"]] = LitSeq.empty,
      attachedDocument: LitSeq[Reference] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      legalStatusOfSupply: Option[CodeableConcept] = None,
      productClassification: LitSeq[CodeableConcept] = LitSeq.empty,
      pharmaceuticalProduct: LitSeq[Reference] = LitSeq.empty,
      paediatricUseIndicator: Option[CodeableConcept] = None,
      packagedMedicinalProduct: LitSeq[Reference] = LitSeq.empty,
      additionalMonitoringIndicator: Option[CodeableConcept] = None,
      combinedPharmaceuticalDoseForm: Option[CodeableConcept] = None,
      specialDesignation: LitSeq[MedicinalProduct.SpecialDesignation] = LitSeq.empty,
      name: NonEmptyLitSeq[MedicinalProduct.Name],
      manufacturingBusinessOperation: LitSeq[MedicinalProduct.ManufacturingBusinessOperation] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): MedicinalProduct = new MedicinalProduct(
    id,
    meta,
    text,
    `type`,
    domain,
    contact,
    language,
    contained,
    extension,
    identifier,
    masterFile,
    implicitRules,
    clinicalTrial,
    crossReference,
    specialMeasures,
    marketingStatus,
    attachedDocument,
    modifierExtension,
    legalStatusOfSupply,
    productClassification,
    pharmaceuticalProduct,
    paediatricUseIndicator,
    packagedMedicinalProduct,
    additionalMonitoringIndicator,
    combinedPharmaceuticalDoseForm,
    specialDesignation,
    name,
    manufacturingBusinessOperation,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val meta: FHIRComponentFieldMeta[Option[Meta]] =
    FHIRComponentFieldMeta("meta", lTagOf[Option[Meta]], false, lTagOf[Meta])
  val text: FHIRComponentFieldMeta[Option[Narrative]] =
    FHIRComponentFieldMeta("text", lTagOf[Option[Narrative]], false, lTagOf[Narrative])
  val `type`: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("type", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val domain: FHIRComponentFieldMeta[Option[Coding]] =
    FHIRComponentFieldMeta("domain", lTagOf[Option[Coding]], false, lTagOf[Coding])
  val contact: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("contact", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val masterFile: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("masterFile", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val clinicalTrial: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("clinicalTrial", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val crossReference: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("crossReference", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val specialMeasures: FHIRComponentFieldMeta[LitSeq[String]] =
    FHIRComponentFieldMeta("specialMeasures", lTagOf[LitSeq[String]], false, lTagOf[String])
  val marketingStatus: FHIRComponentFieldMeta[LitSeq[Choice["MarketingStatus"]]] =
    FHIRComponentFieldMeta("marketingStatus", lTagOf[LitSeq[Choice["MarketingStatus"]]], false, lTagOf[Choice["MarketingStatus"]])
  val attachedDocument: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("attachedDocument", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val legalStatusOfSupply: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("legalStatusOfSupply", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val productClassification: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("productClassification", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val pharmaceuticalProduct: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("pharmaceuticalProduct", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val paediatricUseIndicator: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("paediatricUseIndicator", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val packagedMedicinalProduct: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("packagedMedicinalProduct", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val additionalMonitoringIndicator: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("additionalMonitoringIndicator", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val combinedPharmaceuticalDoseForm: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("combinedPharmaceuticalDoseForm", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val specialDesignation: FHIRComponentFieldMeta[LitSeq[MedicinalProduct.SpecialDesignation]] =
    FHIRComponentFieldMeta(
      "specialDesignation",
      lTagOf[LitSeq[MedicinalProduct.SpecialDesignation]],
      false,
      lTagOf[MedicinalProduct.SpecialDesignation])
  val name: FHIRComponentFieldMeta[NonEmptyLitSeq[MedicinalProduct.Name]] =
    FHIRComponentFieldMeta("name", lTagOf[NonEmptyLitSeq[MedicinalProduct.Name]], false, lTagOf[MedicinalProduct.Name])
  val manufacturingBusinessOperation: FHIRComponentFieldMeta[LitSeq[MedicinalProduct.ManufacturingBusinessOperation]] =
    FHIRComponentFieldMeta(
      "manufacturingBusinessOperation",
      lTagOf[LitSeq[MedicinalProduct.ManufacturingBusinessOperation]],
      false,
      lTagOf[MedicinalProduct.ManufacturingBusinessOperation]
    )
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] = Seq(
    id,
    meta,
    text,
    `type`,
    domain,
    contact,
    language,
    contained,
    extension,
    identifier,
    masterFile,
    implicitRules,
    clinicalTrial,
    crossReference,
    specialMeasures,
    marketingStatus,
    attachedDocument,
    modifierExtension,
    legalStatusOfSupply,
    productClassification,
    pharmaceuticalProduct,
    paediatricUseIndicator,
    packagedMedicinalProduct,
    additionalMonitoringIndicator,
    combinedPharmaceuticalDoseForm,
    specialDesignation,
    name,
    manufacturingBusinessOperation
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: MedicinalProduct): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[Option[Meta]](meta, t.meta),
    FHIRComponentField[Option[Narrative]](text, t.text),
    FHIRComponentField[Option[CodeableConcept]](`type`, t.`type`),
    FHIRComponentField[Option[Coding]](domain, t.domain),
    FHIRComponentField[LitSeq[Reference]](contact, t.contact),
    FHIRComponentField[Option[LANGUAGES]](language, t.language),
    FHIRComponentField[LitSeq[Resource]](contained, t.contained),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
    FHIRComponentField[LitSeq[Reference]](masterFile, t.masterFile),
    FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
    FHIRComponentField[LitSeq[Reference]](clinicalTrial, t.clinicalTrial),
    FHIRComponentField[LitSeq[Identifier]](crossReference, t.crossReference),
    FHIRComponentField[LitSeq[String]](specialMeasures, t.specialMeasures),
    FHIRComponentField[LitSeq[Choice["MarketingStatus"]]](marketingStatus, t.marketingStatus),
    FHIRComponentField[LitSeq[Reference]](attachedDocument, t.attachedDocument),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
    FHIRComponentField[Option[CodeableConcept]](legalStatusOfSupply, t.legalStatusOfSupply),
    FHIRComponentField[LitSeq[CodeableConcept]](productClassification, t.productClassification),
    FHIRComponentField[LitSeq[Reference]](pharmaceuticalProduct, t.pharmaceuticalProduct),
    FHIRComponentField[Option[CodeableConcept]](paediatricUseIndicator, t.paediatricUseIndicator),
    FHIRComponentField[LitSeq[Reference]](packagedMedicinalProduct, t.packagedMedicinalProduct),
    FHIRComponentField[Option[CodeableConcept]](additionalMonitoringIndicator, t.additionalMonitoringIndicator),
    FHIRComponentField[Option[CodeableConcept]](combinedPharmaceuticalDoseForm, t.combinedPharmaceuticalDoseForm),
    FHIRComponentField[LitSeq[MedicinalProduct.SpecialDesignation]](specialDesignation, t.specialDesignation),
    FHIRComponentField[NonEmptyLitSeq[MedicinalProduct.Name]](name, t.name),
    FHIRComponentField[LitSeq[MedicinalProduct.ManufacturingBusinessOperation]](
      manufacturingBusinessOperation,
      t.manufacturingBusinessOperation)
  )
  def extractId(t: MedicinalProduct): Option[String]                                      = t.id
  def extractMeta(t: MedicinalProduct): Option[Meta]                                      = t.meta
  def extractText(t: MedicinalProduct): Option[Narrative]                                 = t.text
  def extractType(t: MedicinalProduct): Option[CodeableConcept]                           = t.`type`
  def extractDomain(t: MedicinalProduct): Option[Coding]                                  = t.domain
  def extractContact(t: MedicinalProduct): LitSeq[Reference]                              = t.contact
  def extractLanguage(t: MedicinalProduct): Option[LANGUAGES]                             = t.language
  def extractContained(t: MedicinalProduct): LitSeq[Resource]                             = t.contained
  def extractExtension(t: MedicinalProduct): LitSeq[Extension]                            = t.extension
  def extractIdentifier(t: MedicinalProduct): LitSeq[Identifier]                          = t.identifier
  def extractMasterFile(t: MedicinalProduct): LitSeq[Reference]                           = t.masterFile
  def extractImplicitRules(t: MedicinalProduct): Option[UriStr]                           = t.implicitRules
  def extractClinicalTrial(t: MedicinalProduct): LitSeq[Reference]                        = t.clinicalTrial
  def extractCrossReference(t: MedicinalProduct): LitSeq[Identifier]                      = t.crossReference
  def extractSpecialMeasures(t: MedicinalProduct): LitSeq[String]                         = t.specialMeasures
  def extractMarketingStatus(t: MedicinalProduct): LitSeq[Choice["MarketingStatus"]]      = t.marketingStatus
  def extractAttachedDocument(t: MedicinalProduct): LitSeq[Reference]                     = t.attachedDocument
  def extractModifierExtension(t: MedicinalProduct): LitSeq[Extension]                    = t.modifierExtension
  def extractLegalStatusOfSupply(t: MedicinalProduct): Option[CodeableConcept]            = t.legalStatusOfSupply
  def extractProductClassification(t: MedicinalProduct): LitSeq[CodeableConcept]          = t.productClassification
  def extractPharmaceuticalProduct(t: MedicinalProduct): LitSeq[Reference]                = t.pharmaceuticalProduct
  def extractPaediatricUseIndicator(t: MedicinalProduct): Option[CodeableConcept]         = t.paediatricUseIndicator
  def extractPackagedMedicinalProduct(t: MedicinalProduct): LitSeq[Reference]             = t.packagedMedicinalProduct
  def extractAdditionalMonitoringIndicator(t: MedicinalProduct): Option[CodeableConcept]  = t.additionalMonitoringIndicator
  def extractCombinedPharmaceuticalDoseForm(t: MedicinalProduct): Option[CodeableConcept] = t.combinedPharmaceuticalDoseForm
  def extractSpecialDesignation(t: MedicinalProduct): LitSeq[MedicinalProduct.SpecialDesignation] = t.specialDesignation
  def extractName(t: MedicinalProduct): NonEmptyLitSeq[MedicinalProduct.Name]                     = t.name
  def extractManufacturingBusinessOperation(t: MedicinalProduct): LitSeq[MedicinalProduct.ManufacturingBusinessOperation] =
    t.manufacturingBusinessOperation
  override val thisName: String = "MedicinalProduct"
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[MedicinalProduct] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new MedicinalProduct(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("type", Some(None)),
          cursor.decodeAs[Option[Coding]]("domain", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("contact", Some(LitSeq.empty)),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("masterFile", Some(LitSeq.empty)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("clinicalTrial", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("crossReference", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[String]]("specialMeasures", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Choice["MarketingStatus"]]]("marketingStatus", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("attachedDocument", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("legalStatusOfSupply", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("productClassification", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Reference]]("pharmaceuticalProduct", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("paediatricUseIndicator", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("packagedMedicinalProduct", Some(LitSeq.empty)),
          cursor.decodeAs[Option[CodeableConcept]]("additionalMonitoringIndicator", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("combinedPharmaceuticalDoseForm", Some(None)),
          cursor.decodeAs[LitSeq[MedicinalProduct.SpecialDesignation]]("specialDesignation", Some(LitSeq.empty)),
          cursor.decodeAs[NonEmptyLitSeq[MedicinalProduct.Name]]("name", None),
          cursor.decodeAs[LitSeq[MedicinalProduct.ManufacturingBusinessOperation]](
            "manufacturingBusinessOperation",
            Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Detailed definition of a medicinal product, typically for uses other than direct patient care (e.g. regulatory use).
  *
  * Subclass of [[hl7.model.DomainResource]] (A resource that includes narrative, extensions, and contained resources.)
  *
  * @constructor
  *   Introduces the fields `type`, domain, contact, identifier, masterFile, clinicalTrial, crossReference, specialMeasures,
  *   marketingStatus, attachedDocument, legalStatusOfSupply, productClassification, pharmaceuticalProduct,
  *   paediatricUseIndicator, packagedMedicinalProduct, additionalMonitoringIndicator, combinedPharmaceuticalDoseForm,
  *   specialDesignation, name, manufacturingBusinessOperation.
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
  * @param `type`
  *   - Regulatory type, e.g. Investigational or Authorized.
  * @param domain
  *   - If this medicine applies to human or veterinary uses.
  * @param contact
  *   - A product specific contact, person (in a role), or an organization.
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
  * @param identifier
  *   - Business identifier for this product. Could be an MPID.
  * @param masterFile
  *   - A master file for to the medicinal product (e.g. Pharmacovigilance System Master File).
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *   processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *   other profiles etc.
  * @param clinicalTrial
  *   - Clinical trials or studies that this product is involved in.
  * @param crossReference
  *   - Reference to another product, e.g. for linking authorised to investigational product.
  * @param specialMeasures
  *   - Whether the Medicinal Product is subject to special measures for regulatory reasons.
  * @param marketingStatus
  *   - Marketing status of the medicinal product, in contrast to marketing authorizaton.
  * @param attachedDocument
  *   - Supporting documentation, typically for regulatory submission.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *   the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually
  *   modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict
  *   set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension,
  *   there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a
  *   resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on
  *   Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param legalStatusOfSupply
  *   - The legal status of supply of the medicinal product as classified by the regulator.
  * @param productClassification
  *   - Allows the product to be classified by various systems.
  * @param pharmaceuticalProduct
  *   - Pharmaceutical aspects of product.
  * @param paediatricUseIndicator
  *   - If authorised for use in children.
  * @param packagedMedicinalProduct
  *   - Package representation for the product.
  * @param additionalMonitoringIndicator
  *   - Whether the Medicinal Product is subject to additional monitoring for regulatory reasons.
  * @param combinedPharmaceuticalDoseForm
  *   - The dose form for a single part product, or combined form of a multiple part product.
  * @param specialDesignation
  *   - Indicates if the medicinal product has an orphan designation for the treatment of a rare disease.
  * @param name
  *   - The product's name, including full name and possibly coded parts.
  * @param manufacturingBusinessOperation
  *   - An operation applied to the product, for manufacturing or adminsitrative purpose.
  */
@POJOBoilerplate
class MedicinalProduct(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = None,
    override val text: Option[Narrative] = None,
    val `type`: Option[CodeableConcept] = None,
    val domain: Option[Coding] = None,
    val contact: LitSeq[Reference] = LitSeq.empty,
    override val language: Option[LANGUAGES] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val identifier: LitSeq[Identifier] = LitSeq.empty,
    val masterFile: LitSeq[Reference] = LitSeq.empty,
    override val implicitRules: Option[UriStr] = None,
    val clinicalTrial: LitSeq[Reference] = LitSeq.empty,
    val crossReference: LitSeq[Identifier] = LitSeq.empty,
    val specialMeasures: LitSeq[String] = LitSeq.empty,
    val marketingStatus: LitSeq[Choice["MarketingStatus"]] = LitSeq.empty,
    val attachedDocument: LitSeq[Reference] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    val legalStatusOfSupply: Option[CodeableConcept] = None,
    val productClassification: LitSeq[CodeableConcept] = LitSeq.empty,
    val pharmaceuticalProduct: LitSeq[Reference] = LitSeq.empty,
    val paediatricUseIndicator: Option[CodeableConcept] = None,
    val packagedMedicinalProduct: LitSeq[Reference] = LitSeq.empty,
    val additionalMonitoringIndicator: Option[CodeableConcept] = None,
    val combinedPharmaceuticalDoseForm: Option[CodeableConcept] = None,
    val specialDesignation: LitSeq[MedicinalProduct.SpecialDesignation] = LitSeq.empty,
    val name: NonEmptyLitSeq[MedicinalProduct.Name],
    val manufacturingBusinessOperation: LitSeq[MedicinalProduct.ManufacturingBusinessOperation] = LitSeq.empty,
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
  override val thisTypeName: String = "MedicinalProduct"
}
