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
import com.babylonhealth.lit.hl7.IMMUNIZATION_STATUS
import com.babylonhealth.lit.core.LANGUAGES
import com.babylonhealth.lit.{ core, hl7, ukcore }
import com.babylonhealth.lit.macros.POJOBoilerplate

object UKCore_Immunization extends CompanionFor[UKCore_Immunization] {
  implicit def summonObjectAndCompanionUKCore_Immunization632436017(
      o: UKCore_Immunization): ObjectAndCompanion[UKCore_Immunization, UKCore_Immunization.type] = ObjectAndCompanion(o, this)
  override type ResourceType = Immunization
  override type ParentType   = Immunization
  override val baseType: CompanionFor[ResourceType] = Immunization
  override val parentType: CompanionFor[ParentType] = Immunization
  override val profileUrl: Option[String]           = Some("https://fhir.hl7.org.uk/StructureDefinition/UKCore-Immunization")
  type OccurrenceChoice = Choice[UnionDateTimeOrString]
  def apply(
      id: Option[String] = None,
      meta: Option[Meta] = Some(new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-Immunization"))),
      text: Option[Narrative] = None,
      site: Option[CodeableConcept] = None,
      route: Option[CodeableConcept] = None,
      status: IMMUNIZATION_STATUS,
      language: Option[LANGUAGES] = None,
      recorded: Option[FHIRDateTime] = None,
      contained: LitSeq[Resource] = LitSeq.empty,
      extension: LitSeq[Extension] = LitSeq.empty,
      lotNumber: Option[String] = None,
      reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
      vaccineCode: CodeableConcept,
      isSubpotent: Option[Boolean] = None,
      statusReason: Option[CodeableConcept] = None,
      reportOrigin: Option[CodeableConcept] = None,
      doseQuantity: Option[Quantity] = None,
      implicitRules: Option[UriStr] = None,
      occurrence: UKCore_Immunization.OccurrenceChoice,
      primarySource: Option[Boolean] = None,
      fundingSource: Option[CodeableConcept] = None,
      expirationDate: Option[FHIRDate] = None,
      note: LitSeq[Annotation] = LitSeq.empty,
      subpotentReason: LitSeq[CodeableConcept] = LitSeq.empty,
      modifierExtension: LitSeq[Extension] = LitSeq.empty,
      programEligibility: LitSeq[CodeableConcept] = LitSeq.empty,
      identifier: LitSeq[Identifier] = LitSeq.empty,
      performer: LitSeq[Immunization.Performer] = LitSeq.empty,
      education: LitSeq[Immunization.Education] = LitSeq.empty,
      patient: Reference,
      location: Option[Reference] = None,
      encounter: Option[Reference] = None,
      manufacturer: Option[Reference] = None,
      reasonReference: LitSeq[Reference] = LitSeq.empty,
      reaction: LitSeq[Immunization.Reaction] = LitSeq.empty,
      protocolApplied: LitSeq[Immunization.ProtocolApplied] = LitSeq.empty,
      primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
  ): UKCore_Immunization = new UKCore_Immunization(
    id,
    meta,
    text,
    site,
    route,
    status,
    language,
    recorded,
    contained,
    extension,
    lotNumber,
    reasonCode,
    vaccineCode,
    isSubpotent,
    statusReason,
    reportOrigin,
    doseQuantity,
    implicitRules,
    occurrence,
    primarySource,
    fundingSource,
    expirationDate,
    note,
    subpotentReason,
    modifierExtension,
    programEligibility,
    identifier,
    performer,
    education,
    patient,
    location,
    encounter,
    manufacturer,
    reasonReference,
    reaction,
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
  val route: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("route", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val status: FHIRComponentFieldMeta[IMMUNIZATION_STATUS] =
    FHIRComponentFieldMeta("status", lTagOf[IMMUNIZATION_STATUS], false, lTagOf[IMMUNIZATION_STATUS])
  val language: FHIRComponentFieldMeta[Option[LANGUAGES]] =
    FHIRComponentFieldMeta("language", lTagOf[Option[LANGUAGES]], false, lTagOf[LANGUAGES])
  val recorded: FHIRComponentFieldMeta[Option[FHIRDateTime]] =
    FHIRComponentFieldMeta("recorded", lTagOf[Option[FHIRDateTime]], false, lTagOf[FHIRDateTime])
  val contained: FHIRComponentFieldMeta[LitSeq[Resource]] =
    FHIRComponentFieldMeta("contained", lTagOf[LitSeq[Resource]], false, lTagOf[Resource])
  val extension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("extension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val lotNumber: FHIRComponentFieldMeta[Option[String]] =
    FHIRComponentFieldMeta("lotNumber", lTagOf[Option[String]], false, lTagOf[String])
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
  val doseQuantity: FHIRComponentFieldMeta[Option[Quantity]] =
    FHIRComponentFieldMeta("doseQuantity", lTagOf[Option[Quantity]], false, lTagOf[Quantity])
  val implicitRules: FHIRComponentFieldMeta[Option[UriStr]] =
    FHIRComponentFieldMeta("implicitRules", lTagOf[Option[UriStr]], false, lTagOf[UriStr])
  val occurrence: FHIRComponentFieldMeta[UKCore_Immunization.OccurrenceChoice] =
    FHIRComponentFieldMeta("occurrence", lTagOf[UKCore_Immunization.OccurrenceChoice], true, lTagOf[UnionDateTimeOrString])
  val primarySource: FHIRComponentFieldMeta[Option[Boolean]] =
    FHIRComponentFieldMeta("primarySource", lTagOf[Option[Boolean]], false, lTagOf[Boolean])
  val fundingSource: FHIRComponentFieldMeta[Option[CodeableConcept]] =
    FHIRComponentFieldMeta("fundingSource", lTagOf[Option[CodeableConcept]], false, lTagOf[CodeableConcept])
  val expirationDate: FHIRComponentFieldMeta[Option[FHIRDate]] =
    FHIRComponentFieldMeta("expirationDate", lTagOf[Option[FHIRDate]], false, lTagOf[FHIRDate])
  val note: FHIRComponentFieldMeta[LitSeq[Annotation]] =
    FHIRComponentFieldMeta("note", lTagOf[LitSeq[Annotation]], false, lTagOf[Annotation])
  val subpotentReason: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("subpotentReason", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val modifierExtension: FHIRComponentFieldMeta[LitSeq[Extension]] =
    FHIRComponentFieldMeta("modifierExtension", lTagOf[LitSeq[Extension]], false, lTagOf[Extension])
  val programEligibility: FHIRComponentFieldMeta[LitSeq[CodeableConcept]] =
    FHIRComponentFieldMeta("programEligibility", lTagOf[LitSeq[CodeableConcept]], false, lTagOf[CodeableConcept])
  val identifier: FHIRComponentFieldMeta[LitSeq[Identifier]] =
    FHIRComponentFieldMeta("identifier", lTagOf[LitSeq[Identifier]], false, lTagOf[Identifier])
  val performer: FHIRComponentFieldMeta[LitSeq[Immunization.Performer]] =
    FHIRComponentFieldMeta("performer", lTagOf[LitSeq[Immunization.Performer]], false, lTagOf[Immunization.Performer])
  val education: FHIRComponentFieldMeta[LitSeq[Immunization.Education]] =
    FHIRComponentFieldMeta("education", lTagOf[LitSeq[Immunization.Education]], false, lTagOf[Immunization.Education])
  val patient: FHIRComponentFieldMeta[Reference] =
    FHIRComponentFieldMeta("patient", lTagOf[Reference], false, lTagOf[Reference])
  val location: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("location", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val encounter: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("encounter", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val manufacturer: FHIRComponentFieldMeta[Option[Reference]] =
    FHIRComponentFieldMeta("manufacturer", lTagOf[Option[Reference]], false, lTagOf[Reference])
  val reasonReference: FHIRComponentFieldMeta[LitSeq[Reference]] =
    FHIRComponentFieldMeta("reasonReference", lTagOf[LitSeq[Reference]], false, lTagOf[Reference])
  val reaction: FHIRComponentFieldMeta[LitSeq[Immunization.Reaction]] =
    FHIRComponentFieldMeta("reaction", lTagOf[LitSeq[Immunization.Reaction]], false, lTagOf[Immunization.Reaction])
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
    route,
    status,
    language,
    recorded,
    contained,
    extension,
    lotNumber,
    reasonCode,
    vaccineCode,
    isSubpotent,
    statusReason,
    reportOrigin,
    doseQuantity,
    implicitRules,
    occurrence,
    primarySource,
    fundingSource,
    expirationDate,
    note,
    subpotentReason,
    modifierExtension,
    programEligibility,
    identifier,
    performer,
    education,
    patient,
    location,
    encounter,
    manufacturer,
    reasonReference,
    reaction,
    protocolApplied
  )
  override def fieldsFromParent(t: ResourceType): Try[Seq[FHIRComponentField[_]]] = Try(
    Seq(
      FHIRComponentField[Option[String]](id, t.id),
      FHIRComponentField[Option[Meta]](meta, t.meta),
      FHIRComponentField[Option[Narrative]](text, t.text),
      FHIRComponentField[Option[CodeableConcept]](site, t.site),
      FHIRComponentField[Option[CodeableConcept]](route, t.route),
      FHIRComponentField[IMMUNIZATION_STATUS](status, t.status),
      FHIRComponentField[Option[LANGUAGES]](language, t.language),
      FHIRComponentField[Option[FHIRDateTime]](recorded, t.recorded),
      FHIRComponentField[LitSeq[Resource]](contained, t.contained),
      FHIRComponentField[LitSeq[Extension]](extension, t.extension),
      FHIRComponentField[Option[String]](lotNumber, t.lotNumber),
      FHIRComponentField[LitSeq[CodeableConcept]](reasonCode, t.reasonCode),
      FHIRComponentField[CodeableConcept](vaccineCode, t.vaccineCode),
      FHIRComponentField[Option[Boolean]](isSubpotent, t.isSubpotent),
      FHIRComponentField[Option[CodeableConcept]](statusReason, t.statusReason),
      FHIRComponentField[Option[CodeableConcept]](reportOrigin, t.reportOrigin),
      FHIRComponentField[Option[Quantity]](doseQuantity, t.doseQuantity),
      FHIRComponentField[Option[UriStr]](implicitRules, t.implicitRules),
      FHIRComponentField[UKCore_Immunization.OccurrenceChoice](occurrence, t.occurrence),
      FHIRComponentField[Option[Boolean]](primarySource, t.primarySource),
      FHIRComponentField[Option[CodeableConcept]](fundingSource, t.fundingSource),
      FHIRComponentField[Option[FHIRDate]](expirationDate, t.expirationDate),
      FHIRComponentField[LitSeq[Annotation]](note, t.note),
      FHIRComponentField[LitSeq[CodeableConcept]](subpotentReason, t.subpotentReason),
      FHIRComponentField[LitSeq[Extension]](modifierExtension, t.modifierExtension),
      FHIRComponentField[LitSeq[CodeableConcept]](programEligibility, t.programEligibility),
      FHIRComponentField[LitSeq[Identifier]](identifier, t.identifier),
      FHIRComponentField[LitSeq[Immunization.Performer]](performer, t.performer),
      FHIRComponentField[LitSeq[Immunization.Education]](education, t.education),
      FHIRComponentField[Reference](patient, t.patient),
      FHIRComponentField[Option[Reference]](location, t.location),
      FHIRComponentField[Option[Reference]](encounter, t.encounter),
      FHIRComponentField[Option[Reference]](manufacturer, t.manufacturer),
      FHIRComponentField[LitSeq[Reference]](reasonReference, t.reasonReference),
      FHIRComponentField[LitSeq[Immunization.Reaction]](reaction, t.reaction),
      FHIRComponentField[LitSeq[Immunization.ProtocolApplied]](protocolApplied, t.protocolApplied)
    ))
  override def fields(t: UKCore_Immunization): Seq[FHIRComponentField[_]]                  = fieldsFromParent(t).get
  def extractId(t: UKCore_Immunization): Option[String]                                    = t.id
  def extractMeta(t: UKCore_Immunization): Option[Meta]                                    = t.meta
  def extractText(t: UKCore_Immunization): Option[Narrative]                               = t.text
  def extractSite(t: UKCore_Immunization): Option[CodeableConcept]                         = t.site
  def extractRoute(t: UKCore_Immunization): Option[CodeableConcept]                        = t.route
  def extractStatus(t: UKCore_Immunization): IMMUNIZATION_STATUS                           = t.status
  def extractLanguage(t: UKCore_Immunization): Option[LANGUAGES]                           = t.language
  def extractRecorded(t: UKCore_Immunization): Option[FHIRDateTime]                        = t.recorded
  def extractContained(t: UKCore_Immunization): LitSeq[Resource]                           = t.contained
  def extractExtension(t: UKCore_Immunization): LitSeq[Extension]                          = t.extension
  def extractLotNumber(t: UKCore_Immunization): Option[String]                             = t.lotNumber
  def extractReasonCode(t: UKCore_Immunization): LitSeq[CodeableConcept]                   = t.reasonCode
  def extractVaccineCode(t: UKCore_Immunization): CodeableConcept                          = t.vaccineCode
  def extractIsSubpotent(t: UKCore_Immunization): Option[Boolean]                          = t.isSubpotent
  def extractStatusReason(t: UKCore_Immunization): Option[CodeableConcept]                 = t.statusReason
  def extractReportOrigin(t: UKCore_Immunization): Option[CodeableConcept]                 = t.reportOrigin
  def extractDoseQuantity(t: UKCore_Immunization): Option[Quantity]                        = t.doseQuantity
  def extractImplicitRules(t: UKCore_Immunization): Option[UriStr]                         = t.implicitRules
  def extractOccurrence(t: UKCore_Immunization): UKCore_Immunization.OccurrenceChoice      = t.occurrence
  def extractPrimarySource(t: UKCore_Immunization): Option[Boolean]                        = t.primarySource
  def extractFundingSource(t: UKCore_Immunization): Option[CodeableConcept]                = t.fundingSource
  def extractExpirationDate(t: UKCore_Immunization): Option[FHIRDate]                      = t.expirationDate
  def extractNote(t: UKCore_Immunization): LitSeq[Annotation]                              = t.note
  def extractSubpotentReason(t: UKCore_Immunization): LitSeq[CodeableConcept]              = t.subpotentReason
  def extractModifierExtension(t: UKCore_Immunization): LitSeq[Extension]                  = t.modifierExtension
  def extractProgramEligibility(t: UKCore_Immunization): LitSeq[CodeableConcept]           = t.programEligibility
  def extractIdentifier(t: UKCore_Immunization): LitSeq[Identifier]                        = t.identifier
  def extractPerformer(t: UKCore_Immunization): LitSeq[Immunization.Performer]             = t.performer
  def extractEducation(t: UKCore_Immunization): LitSeq[Immunization.Education]             = t.education
  def extractPatient(t: UKCore_Immunization): Reference                                    = t.patient
  def extractLocation(t: UKCore_Immunization): Option[Reference]                           = t.location
  def extractEncounter(t: UKCore_Immunization): Option[Reference]                          = t.encounter
  def extractManufacturer(t: UKCore_Immunization): Option[Reference]                       = t.manufacturer
  def extractReasonReference(t: UKCore_Immunization): LitSeq[Reference]                    = t.reasonReference
  def extractReaction(t: UKCore_Immunization): LitSeq[Immunization.Reaction]               = t.reaction
  def extractProtocolApplied(t: UKCore_Immunization): LitSeq[Immunization.ProtocolApplied] = t.protocolApplied
  override val thisName: String                                                            = "UKCore_Immunization"
  override val searchParams: Map[String, UKCore_Immunization => Seq[Any]]                  = Immunization.searchParams
  def decodeThis(cursor: HCursor)(implicit params: DecoderParams): Try[UKCore_Immunization] =
    checkUnknownFields(cursor, otherMetas, refMetas) flatMap (_ =>
      Try(
        new UKCore_Immunization(
          cursor.decodeAs[Option[String]]("id", Some(None)),
          cursor.decodeAs[Option[Meta]]("meta", Some(None)),
          cursor.decodeAs[Option[Narrative]]("text", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("site", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("route", Some(None)),
          cursor.decodeAs[IMMUNIZATION_STATUS]("status", None),
          cursor.decodeAs[Option[LANGUAGES]]("language", Some(None)),
          cursor.decodeAs[Option[FHIRDateTime]]("recorded", Some(None)),
          cursor.decodeAs[LitSeq[Resource]]("contained", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("extension", Some(LitSeq.empty)),
          cursor.decodeAs[Option[String]]("lotNumber", Some(None)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("reasonCode", Some(LitSeq.empty)),
          cursor.decodeAs[CodeableConcept]("vaccineCode", None),
          cursor.decodeAs[Option[Boolean]]("isSubpotent", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("statusReason", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("reportOrigin", Some(None)),
          cursor.decodeAs[Option[Quantity]]("doseQuantity", Some(None)),
          cursor.decodeAs[Option[UriStr]]("implicitRules", Some(None)),
          cursor.decodeRef[UnionDateTimeOrString]("occurrence"),
          cursor.decodeAs[Option[Boolean]]("primarySource", Some(None)),
          cursor.decodeAs[Option[CodeableConcept]]("fundingSource", Some(None)),
          cursor.decodeAs[Option[FHIRDate]]("expirationDate", Some(None)),
          cursor.decodeAs[LitSeq[Annotation]]("note", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("subpotentReason", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Extension]]("modifierExtension", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[CodeableConcept]]("programEligibility", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Identifier]]("identifier", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Immunization.Performer]]("performer", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Immunization.Education]]("education", Some(LitSeq.empty)),
          cursor.decodeAs[Reference]("patient", None),
          cursor.decodeAs[Option[Reference]]("location", Some(None)),
          cursor.decodeAs[Option[Reference]]("encounter", Some(None)),
          cursor.decodeAs[Option[Reference]]("manufacturer", Some(None)),
          cursor.decodeAs[LitSeq[Reference]]("reasonReference", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Immunization.Reaction]]("reaction", Some(LitSeq.empty)),
          cursor.decodeAs[LitSeq[Immunization.ProtocolApplied]]("protocolApplied", Some(LitSeq.empty)),
          decodeAttributes(cursor)
        )
      ))
}

/** Defines the UK Core constraints and extensions on the Immunization resource for the minimal set of data to query and retrieve
  * an individual’s immunisation information.
  *
  * Subclass of [[hl7.model.Immunization]] (Describes the event of a patient being administered a vaccine or a record of an
  * immunization as reported by a patient, a clinician or another party.)
  *
  * @constructor
  *   Inherits all params from parent.
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
  * @param site
  *   - Body site where vaccine was administered.
  * @param route
  *   - The path by which the vaccine product is taken into the body.
  * @param status
  *   - Indicates the current status of the immunization event.
  * @param language
  *   - The base language in which the resource is written.
  * @param recorded
  *   - The date the occurrence of the immunization was first captured in the record - potentially significantly after the
  *     occurrence of the event.
  * @param contained
  *   - These resources do not have an independent existence apart from the resource that contains them - they cannot be
  *     identified independently, and nor can they have their own independent transaction scope.
  * @param extension
  *   - May be used to represent additional information that is not part of the basic definition of the resource. To make the use
  *     of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions.
  *     Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition
  *     of the extension.
  * @param lotNumber
  *   - Lot number of the vaccine product.
  * @param reasonCode
  *   - Reasons why the vaccine was administered.
  * @param vaccineCode
  *   - Vaccine that was administered or was to be administered.
  * @param isSubpotent
  *   - Indication if a dose is considered to be subpotent. By default, a dose should be considered to be potent.
  * @param statusReason
  *   - Indicates the reason the immunization event was not performed.
  * @param reportOrigin
  *   - The source of the data when the report of the immunization event is not based on information from the person who
  *     administered the vaccine.
  * @param doseQuantity
  *   - The quantity of vaccine product that was administered.
  * @param implicitRules
  *   - A reference to a set of rules that were followed when the resource was constructed, and which must be understood when
  *     processing the content. Often, this is a reference to an implementation guide that defines the special rules along with
  *     other profiles etc.
  * @param occurrence
  *   - Date vaccine administered or was to be administered.
  * @param primarySource
  *   - An indication that the content of the record is based on information from the person who administered the vaccine. This
  *     reflects the context under which the data was originally recorded.
  * @param fundingSource
  *   - Indicates the source of the vaccine actually administered. This may be different than the patient eligibility (e.g. the
  *     patient may be eligible for a publically purchased vaccine but due to inventory issues, vaccine purchased with private
  *     funds was actually administered).
  * @param expirationDate
  *   - Date vaccine batch expires.
  * @param note
  *   - Extra information about the immunization that is not conveyed by the other attributes.
  * @param subpotentReason
  *   - Reason why a dose is considered to be subpotent.
  * @param modifierExtension
  *   - May be used to represent additional information that is not part of the basic definition of the resource and that modifies
  *     the understanding of the element that contains it and/or the understanding of the containing element's descendants.
  *     Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a
  *     strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an
  *     extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications
  *     processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of
  *     any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
  * @param programEligibility
  *   - Indicates a patient's eligibility for a funding program.
  * @param identifier
  *   - A unique identifier assigned to this immunization record.
  * @param performer
  *   - Indicates who performed the immunization event.
  * @param education
  *   - Educational material presented to the patient (or guardian) at the time of vaccine administration.
  * @param patient
  *   - The patient who either received or did not receive the immunization.
  * @param location
  *   - The service delivery location where the vaccine administration occurred.
  * @param encounter
  *   - The visit or admission or other contact between patient and health care provider the immunization was performed as part
  *     of.
  * @param manufacturer
  *   - Name of vaccine manufacturer.
  * @param reasonReference
  *   - Condition, Observation or DiagnosticReport that supports why the immunization was administered.
  * @param reaction
  *   - Categorical data indicating that an adverse event is associated in time to an immunization.
  * @param protocolApplied
  *   - The protocol (set of recommendations) being followed by the provider who administered the dose.
  */
@POJOBoilerplate
class UKCore_Immunization(
    override val id: Option[String] = None,
    override val meta: Option[Meta] = Some(
      new Meta(profile = LitSeq("https://fhir.hl7.org.uk/StructureDefinition/UKCore-Immunization"))),
    override val text: Option[Narrative] = None,
    override val site: Option[CodeableConcept] = None,
    override val route: Option[CodeableConcept] = None,
    override val status: IMMUNIZATION_STATUS,
    override val language: Option[LANGUAGES] = None,
    override val recorded: Option[FHIRDateTime] = None,
    override val contained: LitSeq[Resource] = LitSeq.empty,
    override val extension: LitSeq[Extension] = LitSeq.empty,
    override val lotNumber: Option[String] = None,
    override val reasonCode: LitSeq[CodeableConcept] = LitSeq.empty,
    override val vaccineCode: CodeableConcept,
    override val isSubpotent: Option[Boolean] = None,
    override val statusReason: Option[CodeableConcept] = None,
    override val reportOrigin: Option[CodeableConcept] = None,
    override val doseQuantity: Option[Quantity] = None,
    override val implicitRules: Option[UriStr] = None,
    override val occurrence: UKCore_Immunization.OccurrenceChoice,
    override val primarySource: Option[Boolean] = None,
    override val fundingSource: Option[CodeableConcept] = None,
    override val expirationDate: Option[FHIRDate] = None,
    override val note: LitSeq[Annotation] = LitSeq.empty,
    override val subpotentReason: LitSeq[CodeableConcept] = LitSeq.empty,
    override val modifierExtension: LitSeq[Extension] = LitSeq.empty,
    override val programEligibility: LitSeq[CodeableConcept] = LitSeq.empty,
    override val identifier: LitSeq[Identifier] = LitSeq.empty,
    override val performer: LitSeq[Immunization.Performer] = LitSeq.empty,
    override val education: LitSeq[Immunization.Education] = LitSeq.empty,
    override val patient: Reference,
    override val location: Option[Reference] = None,
    override val encounter: Option[Reference] = None,
    override val manufacturer: Option[Reference] = None,
    override val reasonReference: LitSeq[Reference] = LitSeq.empty,
    override val reaction: LitSeq[Immunization.Reaction] = LitSeq.empty,
    override val protocolApplied: LitSeq[Immunization.ProtocolApplied] = LitSeq.empty,
    override val primitiveAttributes: TreeMap[FHIRComponentFieldMeta[_], PrimitiveElementInfo] = FHIRObject.emptyAtts
) extends Immunization(
      id = id,
      meta = meta,
      text = text,
      site = site,
      note = note,
      route = route,
      status = status,
      patient = patient,
      language = language,
      recorded = recorded,
      location = location,
      contained = contained,
      extension = extension,
      encounter = encounter,
      lotNumber = lotNumber,
      identifier = identifier,
      reasonCode = reasonCode,
      vaccineCode = vaccineCode,
      isSubpotent = isSubpotent,
      statusReason = statusReason,
      reportOrigin = reportOrigin,
      manufacturer = manufacturer,
      doseQuantity = doseQuantity,
      implicitRules = implicitRules,
      occurrence = occurrence,
      primarySource = primarySource,
      fundingSource = fundingSource,
      expirationDate = expirationDate,
      reasonReference = reasonReference,
      subpotentReason = subpotentReason,
      modifierExtension = modifierExtension,
      programEligibility = programEligibility,
      reaction = reaction,
      performer = performer,
      education = education,
      protocolApplied = protocolApplied,
      primitiveAttributes = primitiveAttributes
    ) {
  override val thisTypeName: String = "Immunization"
}
