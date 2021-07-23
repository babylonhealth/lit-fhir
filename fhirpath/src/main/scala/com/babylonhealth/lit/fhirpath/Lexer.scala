package com.babylonhealth.lit.fhirpath

import java.lang.Integer.parseInt
import java.time.{ LocalDate, LocalTime, ZoneOffset, ZonedDateTime }

import cats.parse.{ Parser => CatsParser, Parser0 => CatsParser0 }
import cats.parse.Parser._

import com.babylonhealth.lit.core.{ FHIRDate, FHIRDateTime }
import com.babylonhealth.lit.fhirpath.Lexer.{ reservedWords, RichParser, fhirTypeName }

/** Based on http://hl7.org/fhirpath/grammar.html
  */
trait Lexer {
  def date: P[FHIRDate]         = char('@') *> partialDate
  def dateTime: P[FHIRDateTime] = char('@') *> partialDateTime
  def time: P[LocalTime]        = string("@T") *> partialTime

  def partialDateOrDateTime: P[FHIRDateTime] = partialDateTime.backtrack | partialDate.map(dateToDateTime)

  def partialDate: P[FHIRDate] =
    nDigits(4) ~ ("-" *> nDigits(2)).rep0(0, 2) map { case (y, md) =>
      val (m, d) = md.length match {
        case 0 => 1       -> 1
        case 1 => md.head -> 1
        case 2 => md.head -> md(1)
      }
      FHIRDate(LocalDate.of(y, m, d))
    }

  def partialDateTime: P[FHIRDateTime] =
    (partialDate <* string("T")) ~ partialTime ~ timeZone map { case ((d, t), tz) =>
      FHIRDateTime(ZonedDateTime.of(d.date, t, tz))
    }

  def partialTime: CatsParser0[LocalTime] =
    nDigits(2).?.flatMap {
      case None => pure(LocalTime.of(0, 0, 0, 0))
      case Some(h) =>
        (char(':') *> nDigits(2)).rep0(0, 2).flatMap {
          case Nil      => pure(LocalTime.of(h, 0, 0, 0))
          case m :: Nil => pure(LocalTime.of(h, m, 0, 0))
          case m :: s :: Nil =>
            (char('.') *> CatsParser.charIn('0' to '9').rep(1, 9)).backtrack.?.map {
              case None => LocalTime.of(h, m, s, 0)
              case Some(ps) =>
                val ns = String.format("%-9s", ps.toList.mkString).replace(" ", "0").toInt
                LocalTime.of(h, m, s, ns)
            }

        }
    }

  private def timeZone: CatsParser0[ZoneOffset] =
    (CatsParser.charIn('+', '-') ~ nDigits(2) ~ (string(":") *> nDigits(2))).map {
      case (('+', b), c) => ZoneOffset.ofHoursMinutes(b, c)
      case (('-', b), c) => ZoneOffset.ofHoursMinutes(-b, -c)
    } | (string("Z") | string0("")).map(_ => ZoneOffset.UTC)

  // http://hl7.org/fhirpath/#identifiers
  def identifier: P[String] = regularIdentifier | escapedIdentifier

  // Restrict to lower-case to avoid mixing up with type names - not matching the spec but ¯\_(ツ)_/¯
  def regularIdentifier: P[String] =
    (CatsParser.charIn(('a' to 'z') :+ '_') ~ CatsParser.ignoreCaseCharIn(('a' to 'z') ++ ('0' to '9') :+ '_').rep0) map {
      case (h, t) => (h +: t).mkString
    } filter {
      !reservedWords.contains(_)
    }
  def escapedIdentifier: P[String] = char('`') *> CatsParser.charsWhile(_ != '`') <* char('`')

  def str: P[String]         = dblQuoteStr | sglQuoteStr
  def dblQuoteStr: P[String] = char('"') *> (char('\'') | strChars | escape).rep0.map(_.mkString) <* char('"')
  def sglQuoteStr: P[String] = char('\'') *> (char('"') | strChars | escape).rep0.map(_.mkString) <* char('\'')

  private def strChars: P[String] = CatsParser.charsWhile(c => c != '"' & c != '\'' && c != '\\')
  private def escape: P[String] =
    "\\" *> (CatsParser.charIn('\'', '"', '`', '\\', '/').map(_ +: "") |
      "r".as("\r") | "n".as("\n") | "t".as("\t") | "f".as("\f") | unicode)
  private def unicode: P[String] = "u" *> hex.rep(4, 4) map { v => parseInt(v.toList.mkString, 16).toChar.toString }
  private def hex: P[Char]       = CatsParser.ignoreCaseCharIn(('a' to 'f') ++ ('0' to '9'))

  private def digits: P[String]   = CatsParser.charIn('0' to '9').rep map { _.toList.mkString }
  def int: P[Int]                 = digits map { _.toInt }
  def decimal: P[BigDecimal]      = (digits ~ char('.').void ~ digits) map { case ((a, _), c) => BigDecimal(s"$a.$c") }
  def decimalOrInt: P[BigDecimal] = decimal.backtrack | int.map(BigDecimal(_))

  def boolean: P[Boolean] = "true".as(true) | "false".as(false)

  def unit: P[String] = sglQuoteStr | builtinUnit

  private def builtinUnit: P[String] =
    (CatsParser.stringIn(Seq("year", "month", "week", "day", "hour", "minute", "second", "millisecond")) <* char('s').?)
      .map(u => f"{$u}")

  def fhirType: P[String] = optionalBackticks(fhirTypeName)
  def systemType: P[String] =
    optionalBackticks(CatsParser.stringIn(Seq("Boolean", "String", "Integer", "Decimal", "Date", "DateTime", "Time", "Quantity")))

  private def optionalBackticks[T](p: => P[T]): P[T] = p | (char('`') *> p <* char('`'))

  private def nDigits(n: Int): P[Int] = CatsParser.charIn('0' to '9').rep(n, n) map { _.toList.mkString.toInt }
}

object Lexer extends Lexer {
  implicit class RichParser(parser: String) {
    def as[V](value: V): P[V] = string(parser).void.map(_ => value)
  }

  private val whitespace: P[Unit] = CatsParser.charIn(" \t\r\n").void
  val whitespaces0: P0[Unit]      = whitespace.rep0.void
  implicit class RichParser_2[A](p: P[A]) {
    // like `~` but permits optional whitespace
    def ~+[B](that: CatsParser0[B]): P[(A, B)] = p ~ (whitespaces0 *> that)
  }

  // This is a bit boilerplate-y, but fastparse needs the literal strings in order for the macro to be able to build an
  // efficient trie structure for 'StringIn'...
  // Was copied by hand from fhirTypeKeys, followed by deleting everything that starts with Bbl... Shouldn't change, though
  private def fhirTypeName: P[String] =
    CatsParser.stringIn(
      Seq(
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
      ))

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
