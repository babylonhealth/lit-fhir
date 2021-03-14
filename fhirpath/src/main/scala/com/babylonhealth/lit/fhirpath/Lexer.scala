package com.babylonhealth.lit.fhirpath

import java.lang.Integer.parseInt
import java.time.{ LocalDate, LocalTime, ZonedDateTime, ZoneOffset }

import fastparse._

import scala.Function.const

import com.babylonhealth.lit.core.{ FHIRDate, FHIRDateTime }
import com.babylonhealth.lit.fhirpath.Lexer.{ reservedWords, RichParser, fhirTypeName }

/** Based on http://hl7.org/fhirpath/grammar.html
  */
trait Lexer {
  def date[_: P]: P[FHIRDate]         = P("@" ~~ partialDate)
  def dateTime[_: P]: P[FHIRDateTime] = P("@" ~~ partialDateTime)
  def time[_: P]: P[LocalTime]        = P("@T" ~~ partialTime)

  def partialDateOrDateTime[_: P]: P[FHIRDateTime] = partialDateTime | partialDate.map(dateToDateTime)

  def partialDate[_: P]: P[FHIRDate] =
    nDigits(4) ~~ ("-" ~~ nDigits(2)).? ~~ ("-" ~~ nDigits(2)).? map { case (y, m, d) =>
      FHIRDate(LocalDate.of(y, m getOrElse 1, d getOrElse 1))
    }

  def partialDateTime[_: P]: P[FHIRDateTime] =
    partialDate ~~ "T" ~~ partialTime ~~ timeZone map { case (d, t, tz) =>
      FHIRDateTime(ZonedDateTime.of(d.date, t, tz))
    }

  def partialTime[_: P]: P[LocalTime] =
    nDigits(2).? ~~ (":" ~~ nDigits(2)).? ~~ (":" ~~ nDigits(2)).? ~~
      (("." ~~ CharsWhileIn("0-9").!).? map {
        case None    => 0
        case Some(x) => String.format("%-9s", x).replace(" ", "0").toInt
      }) map { case (h, m, s, ns) => LocalTime.of(h getOrElse 0, m getOrElse 0, s getOrElse 0, ns) }

  private def timeZone[_: P]: P[ZoneOffset] =
    (CharIn("+\\-").! ~~ nDigits(2) ~~ ":" ~~ nDigits(2)).map {
      case ("+", b, c) => ZoneOffset.ofHoursMinutes(b, c)
      case ("-", b, c) => ZoneOffset.ofHoursMinutes(-b, -c)
    } | ("Z" | Pass).!.map(_ => ZoneOffset.UTC)

  // http://hl7.org/fhirpath/#identifiers
  def identifier[_: P]: P[String] = regularIdentifier | escapedIdentifier

  // Restrict to lower-case to avoid mixing up with type names - not matching the spec but ¯\_(ツ)_/¯
  def regularIdentifier[_: P]: P[String] =
    (CharIn("a-z_") ~~ CharsWhileIn("a-zA-Z0-9_")).! filter { !reservedWords.contains(_) }
  def escapedIdentifier[_: P]: P[String] = "`" ~~ CharsWhile(_ != '`').! ~~ "`"

  def str[_: P]: P[String]         = P(dblQuoteStr | sglQuoteStr)
  def dblQuoteStr[_: P]: P[String] = "\"" ~~ ("'".! | strChars | escape).repX ~~ "\"" map (_.mkString)
  def sglQuoteStr[_: P]: P[String] = "'" ~~ ("\"".! | strChars | escape).repX ~~ "'" map (_.mkString)

  private def strChars[_: P]: P[String] = CharsWhile(c => c != '"' & c != '\'' && c != '\\').!
  private def escape[_: P]: P[String] =
    "\\" ~~ (CharIn("'\"`\\\\/").! | "r".as("\r") | "n".as("\n") | "t".as("\t") | "f".as("\f") | unicode)
  private def unicode[_: P]: P[String] = "u" ~~ hex.repX(exactly = 4).! map { v => parseInt(v, 16).toChar.toString }
  private def hex[_: P]: P[Unit]       = CharIn("0-9a-fA-F")

  def int[_: P]: P[Int]                 = P(CharsWhileIn("0-9").! map { _.toInt })
  def decimal[_: P]: P[BigDecimal]      = P(CharsWhileIn("0-9") ~~ "." ~~ CharsWhileIn("0-9")).!.map(BigDecimal(_))
  def decimalOrInt[_: P]: P[BigDecimal] = decimal | int.map(BigDecimal(_))

  def boolean[_: P]: P[Boolean] = P("true"./ map (_ => true)) | P("false"./ map (_ => false))

  def unit[_: P]: P[String] = P(sglQuoteStr | builtinUnit)

  private def builtinUnit[_: P]: P[String] =
    (StringIn("year", "month", "week", "day", "hour", "minute", "second", "millisecond") ~~ "s".?).!.map(u => f"{$u}")

  def fhirType[_: P]: P[String] = optionalBackticks(fhirTypeName)
  def systemType[_: P]: P[String] =
    optionalBackticks(StringIn("Boolean", "String", "Integer", "Decimal", "Date", "DateTime", "Time", "Quantity").!)

  private def optionalBackticks[T, _: P](p: => P[T]): P[T] = p | "`" ~~ p ~~ "`"

  private def nDigits[_: P](n: Int): P[Int] = CharIn("0-9").repX(exactly = n).!.map(_.toInt)
}

object Lexer extends Lexer {
  implicit class RichParser(parser: String) {
    def as[_: P, V](value: V): P[V] = parser.!.map(const(value))
  }

  // This is a bit boilerplate-y, but fastparse needs the literal strings in order for the macro to be able to build an
  // efficient trie structure for 'StringIn'...
  // Was copied by hand from fhirTypeKeys, followed by deleting everything that starts with Bbl... Shouldn't change, though
  private def fhirTypeName[_: P]: P[String] =
    StringIn(
      "Account",
      "ActivityDefinition",
      "Address",
      "AdverseEvent",
      "Age",
      "AllergyIntolerance",
      "Annotation",
      "Appointment",
      "AppointmentResponse",
      "Attachment",
      "AuditEvent",
      "BackboneElement",
      "base64Binary",
      "Basic",
      "Binary",
      "BiologicallyDerivedProduct",
      "BodyStructure",
      "boolean",
      "Bundle",
      "canonical",
      "CapabilityStatement",
      "CarePlan",
      "CareTeam",
      "CatalogEntry",
      "ChargeItem",
      "ChargeItemDefinition",
      "Claim",
      "ClaimResponse",
      "ClinicalImpression",
      "code",
      "CodeSystem",
      "CodeableConcept",
      "Coding",
      "Communication",
      "CommunicationRequest",
      "CompartmentDefinition",
      "Composition",
      "ConceptMap",
      "Condition",
      "Consent",
      "ContactDetail",
      "ContactPoint",
      "Contract",
      "Contributor",
      "Count",
      "Coverage",
      "CoverageEligibilityRequest",
      "CoverageEligibilityResponse",
      "DataRequirement",
      "date",
      "dateTime",
      "decimal",
      "DetectedIssue",
      "Device",
      "DeviceDefinition",
      "DeviceMetric",
      "DeviceRequest",
      "DeviceUseStatement",
      "DiagnosticReport",
      "Distance",
      "DocumentManifest",
      "DocumentReference",
      "DomainResource",
      "Dosage",
      "Duration",
      "EffectEvidenceSynthesis",
      "Element",
      "ElementDefinition",
      "Encounter",
      "Endpoint",
      "EnrollmentRequest",
      "EnrollmentResponse",
      "EpisodeOfCare",
      "EventDefinition",
      "Evidence",
      "EvidenceVariable",
      "ExampleScenario",
      "ExplanationOfBenefit",
      "Expression",
      "Extension",
      "List",
      "FamilyMemberHistory",
      "Flag",
      "Goal",
      "GraphDefinition",
      "Group",
      "GuidanceResponse",
      "HealthcareService",
      "HumanName",
      "Identifier",
      "ImagingStudy",
      "Immunization",
      "ImmunizationEvaluation",
      "ImmunizationRecommendation",
      "ImplementationGuide",
      "instant",
      "InsurancePlan",
      "integer",
      "Invoice",
      "Library",
      "Linkage",
      "Location",
      "markdown",
      "Measure",
      "MeasureReport",
      "Media",
      "Medication",
      "MedicationAdministration",
      "MedicationDispense",
      "MedicationKnowledge",
      "MedicationRequest",
      "MedicationStatement",
      "MedicinalProduct",
      "MedicinalProductAuthorization",
      "MedicinalProductContraindication",
      "MedicinalProductIndication",
      "MedicinalProductIngredient",
      "MedicinalProductInteraction",
      "MedicinalProductManufactured",
      "MedicinalProductPackaged",
      "MedicinalProductPharmaceutical",
      "MedicinalProductUndesirableEffect",
      "MessageDefinition",
      "MessageHeader",
      "Meta",
      "MolecularSequence",
      "Money",
      "MoneyQuantity",
      "NamingSystem",
      "Narrative",
      "NutritionOrder",
      "Observation",
      "ObservationDefinition",
      "oid",
      "OperationDefinition",
      "OperationOutcome",
      "Organization",
      "OrganizationAffiliation",
      "ParameterDefinition",
      "Parameters",
      "Patient",
      "PaymentNotice",
      "PaymentReconciliation",
      "Period",
      "Person",
      "PlanDefinition",
      "positiveInt",
      "Practitioner",
      "PractitionerRole",
      "Procedure",
      "Provenance",
      "Quantity",
      "Questionnaire",
      "QuestionnaireResponse",
      "Range",
      "Ratio",
      "Reference",
      "RelatedArtifact",
      "RelatedPerson",
      "RequestGroup",
      "ResearchDefinition",
      "ResearchElementDefinition",
      "ResearchStudy",
      "ResearchSubject",
      "Resource",
      "RiskAssessment",
      "RiskEvidenceSynthesis",
      "SampledData",
      "Schedule",
      "SearchParameter",
      "ServiceRequest",
      "Shareablevalueset",
      "Signature",
      "SimpleQuantity",
      "Slot",
      "Specimen",
      "SpecimenDefinition",
      "string",
      "StructureDefinition",
      "StructureMap",
      "Subscription",
      "Substance",
      "SubstancePolymer",
      "SubstanceReferenceInformation",
      "SubstanceSpecification",
      "SupplyDelivery",
      "SupplyRequest",
      "Task",
      "TerminologyCapabilities",
      "TestReport",
      "TestScript",
      "time",
      "Timing",
      "TriggerDefinition",
      "unsignedInt",
      "uri",
      "url",
      "UsageContext",
      "uuid",
      "ValueSet",
      "VerificationResult",
      "VisionPrescription"
    ).!

  private val reservedWords = Set(
    "$index",
    "$this",
    "$total",
    "and",
    "day",
    "days",
    "div",
    "false",
    "hour",
    "hours",
    "implies",
    "in",
    "millisecond",
    "milliseconds",
    "minute",
    "minutes",
    "mod",
    "month",
    "months",
    "or",
    "second",
    "seconds",
    "true",
    "week",
    "weeks",
    "xor",
    "year",
    "years"
  )
}
