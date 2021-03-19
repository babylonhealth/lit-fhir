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

import com.babylonhealth.lit.{ core, hl7, usbase }
import com.babylonhealth.lit.macros.POJOBoilerplate

object MarketingStatus extends CompanionFor[MarketingStatus] {
  override type ResourceType = MarketingStatus
  override val baseType: CompanionFor[ResourceType] = MarketingStatus
  override val profileUrl: Option[String]           = Some("http://hl7.org/fhir/StructureDefinition/MarketingStatus")
  def apply(
      id: Option[String] = None,
      status: CodeableConcept,
      country: CodeableConcept,
      extension: LitSeq[Extension] = LitSeq.empty,
      dateRange: Period,
      restoreDate: Option[FHIRDateTime] = None,
      jurisdiction: Option[CodeableConcept] = None,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): MarketingStatus = new MarketingStatus(
    id,
    status,
    country,
    extension,
    dateRange,
    restoreDate,
    jurisdiction,
    modifierExtension,
    primitiveAttributes = primitiveAttributes
  )
  val id: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("id", lTagOf[Option[String]], false, lTagOf[String])
  val status: FHIRComponentFieldMeta[CodeableConcept] =
    FHIRComponentFieldMeta("status", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
  val country: FHIRComponentFieldMeta[CodeableConcept] =
    FHIRComponentFieldMeta("country", lTagOf[CodeableConcept], false, lTagOf[CodeableConcept])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val dateRange: FHIRComponentFieldMeta[Period] =
    FHIRComponentFieldMeta("dateRange", lTagOf[Period], false, lTagOf[Period])
  val restoreDate: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("restoreDate", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val jurisdiction: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("jurisdiction", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val fieldsMeta: Seq[FHIRComponentFieldMeta[_]] =
    Seq(id, status, country, extension, dateRange, restoreDate, jurisdiction, modifierExtension)
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Success(fields(t))
  override def fields(t: MarketingStatus): Seq[FHIRComponentField[_]] = Seq(
    FHIRComponentField[Option[String]](id, t.id),
    FHIRComponentField[CodeableConcept](status, t.status),
    FHIRComponentField[CodeableConcept](country, t.country),
    FHIRComponentField[LitSeq[Extension]](extension, t.extension),
    FHIRComponentField[Period](dateRange, t.dateRange),
    FHIRComponentField[Option[FHIRDateTime]](restoreDate, t.restoreDate),
    FHIRComponentField[Option[CodeableConcept]](jurisdiction, t.jurisdiction),
    FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension)
  )
  def extractId(t: MarketingStatus): Option[String]                    = t.id
  def extractStatus(t: MarketingStatus): CodeableConcept               = t.status
  def extractCountry(t: MarketingStatus): CodeableConcept              = t.country
  def extractExtension(t: MarketingStatus): LitSeq[Extension]          = t.extension
  def extractDateRange(t: MarketingStatus): Period                     = t.dateRange
  def extractRestoreDate(t: MarketingStatus): Option[FHIRDateTime]     = t.restoreDate
  def extractJurisdiction(t: MarketingStatus): Option[CodeableConcept] = t.jurisdiction
  def extractModifierExtension(t: MarketingStatus): LitSeq[Extension]  = t.modifierExtension
  override val thisName: String                                        = "MarketingStatus"
  def unapply(
      o: MarketingStatus): Option[(Option[String], CodeableConcept, CodeableConcept, LitSeq[Extension], Period, Option[FHIRDateTime], Option[CodeableConcept], LitSeq[Extension])] =
    Some((o.id, o.status, o.country, o.extension, o.dateRange, o.restoreDate, o.jurisdiction, o.modifierExtension))
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[MarketingStatus] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new MarketingStatus(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[CodeableConcept]("status", None),
          cursor.decodeAs[CodeableConcept]("country", None),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Period]("dateRange", None),
          cursor.decodeAs[Option[FHIRDateTime]]("restoreDate", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("jurisdiction", Some(None)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Base StructureDefinition for MarketingStatus Type: The marketing status describes the date when a medicinal product is actually put on the market or the date as of which it is no longer available.
  *
  *  Subclass of [[core.model.BackboneElement]] (Base StructureDefinition for BackboneElement Type: Base definition for all elements that are defined inside a resource - but not those in a data type.)
  *
  * @constructor Introduces the fields status, country, dateRange, restoreDate, jurisdiction.
  * @param id - Unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces.
  * @param status - This attribute provides information on the status of the marketing of the medicinal product See ISO/TS 20443 for more information and examples.
  * @param country - The country in which the marketing authorisation has been granted shall be specified It should be specified using the ISO 3166 ‑ 1 alpha-2 code elements.
  * @param extension - May be used to represent additional information that is not part of the basic definition of the element. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
  * @param dateRange - The date when the Medicinal Product is placed on the market by the Marketing Authorisation Holder (or where applicable, the manufacturer/distributor) in a country and/or jurisdiction shall be provided A complete date consisting of day, month and year shall be specified using the ISO 8601 date format NOTE “Placed on the market” refers to the release of the Medicinal Product into the distribution chain.
  * @param restoreDate - The date when the Medicinal Product is placed on the market by the Marketing Authorisation Holder (or where applicable, the manufacturer/distributor) in a country and/or jurisdiction shall be provided A complete date consisting of day, month and year shall be specified using the ISO 8601 date format NOTE “Placed on the market” refers to the release of the Medicinal Product into the distribution chain.
  * @param jurisdiction - Where a Medicines Regulatory Agency has granted a marketing authorisation for which specific provisions within a jurisdiction apply, the jurisdiction can be specified using an appropriate controlled terminology The controlled term and the controlled term identifier shall be specified.
  * @param modifierExtension - May be used to represent additional information that is not part of the basic definition of the element and that modifies the understanding of the element in which it is contained and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
  * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  */
@POJOBoilerplate
class MarketingStatus(
    override val id: Option[String] = None,
    val status: CodeableConcept,
    val country: CodeableConcept,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    val dateRange: Period,
    val restoreDate: Option[FHIRDateTime] = None,
    val jurisdiction: Option[CodeableConcept] = None,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends BackboneElement(
      id = id,
      extension = extension,
      modifierExtension = modifierExtension,
      primitiveAttributes = primitiveAttributes) {
  override val thisTypeName: String = "MarketingStatus"
}
